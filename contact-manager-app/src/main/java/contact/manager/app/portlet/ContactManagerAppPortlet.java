package contact.manager.app.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.manager.app.constants.ConstantContactKeys;
import contact.manager.app.constants.ContactManagerAppPortletKeys;
import contact.manager.app.util.AuditLogUtil;
import contact.manager.app.util.ContactUtil;
import contact.manager.app.util.OutreachLogUtil;
import contact.manager.app.util.PermissionUtil;
import contact.manager.app.util.UserUtil;
import contact.manager.app.viewmodel.CrmContactAuditLogChangeViewModel;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmContactAuditLog;
import contact.manager.model.CrmOutreachLog;
import contact.manager.service.CrmContactAuditLogLocalService;
import contact.manager.service.CrmContactLocalService;
import contact.manager.service.CrmContactService;
import contact.manager.service.CrmOutreachLogLocalService;

/**
 * @author jon
 */
@Component(
		immediate = true, 
		property = { 
				"com.liferay.portlet.add-default-resource=true", 
				"com.liferay.portlet.display-category=category.hidden", 
				"com.liferay.portlet.layout-cacheable=true", 
				"com.liferay.portlet.private-request-attributes=false", 
				"com.liferay.portlet.private-session-attributes=false", 
				"com.liferay.portlet.render-weight=50", 
				"com.liferay.portlet.use-default-template=true", 
				"javax.portlet.display-name=Contact Manager", 
				"javax.portlet.expiration-cache=0", 
				"javax.portlet.init-param.template-path=/", 
				"javax.portlet.init-param.view-template=/contacts/view.jsp", 
				"javax.portlet.name=" + ContactManagerAppPortletKeys.ContactManagerApp,
				"javax.portlet.resource-bundle=content.Language", 
				"javax.portlet.security-role-ref=power-user,user", 
				"javax.portlet.supports.mime-type=text/html" 
		}, service = Portlet.class
)
public class ContactManagerAppPortlet extends MVCPortlet {

	private static final Log LOGGER = LogFactoryUtil.getLog(ContactManagerAppPortlet.class);

	@Override
	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {
		super.render(request, response);
	}

	public void addContact(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		
		if (!PermissionUtil.canUserAddContact(user)) {
			// TODO: set session message
			return;
		}		
		
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);

			CrmContact crmContact = _crmContactLocalService.createCrmContact(0);
			crmContact = ContactUtil.updateCrmContactProperties(crmContact, request, serviceContext, true);
			CrmContact addedContact = _crmContactService.addCrmContact(crmContact);

			if (addedContact != null) {
				auditContactAction(serviceContext, crmContact.getCrmContactId(), ContactManagerAppPortletKeys.ACTION_ADD);
				// TODO: pass to Constant Contact API
			}

			response.setRenderParameter("crmContactId", String.valueOf(crmContact.getCrmContactId()));
			response.setRenderParameter("mvcPath", "/contacts/details.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.addContact: " + e.getMessage());
		}
	}

	public void updateContact(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		
		if (!PermissionUtil.canUserUpdateContact(user)) {
			// TODO: set session message
			return;
		}		

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
			long crmContactId = ParamUtil.getLong(request, "crmContactId");

			CrmContact crmContact = _crmContactLocalService.getCrmContact(crmContactId);
			CrmContact originalContact = (CrmContact)crmContact.clone();

			crmContact = ContactUtil.updateCrmContactProperties(crmContact, request, serviceContext, false);
			CrmContact updatedContact = _crmContactService.updateCrmContact(crmContact);

			if (updatedContact != null) {
				auditContactAction(serviceContext, crmContactId, ContactManagerAppPortletKeys.ACTION_UPDATE, originalContact,
						updatedContact);
				// TODO: pass to Constant Contact API
			}

			response.setRenderParameter("crmContactId", String.valueOf(crmContactId));
			response.setRenderParameter("mvcPath", "/contacts/details.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.updateContact: " + e.getMessage());
		}
	}

	public void deleteContact(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		
		if (!PermissionUtil.canUserDeleteContact(user)) {
			// TODO: set session message
			return;
		}		

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
			long crmContactId = ParamUtil.getLong(request, "crmContactId");
			long userId = serviceContext.getUserId();
			Date now = new Date();

			CrmContact crmContact = _crmContactLocalService.getCrmContact(crmContactId);
			crmContact.setStatus(ConstantContactKeys.CC_STATUS_REMOVED);
			crmContact.setUserId(userId);
			crmContact.setUserName(UserUtil.getUserName(userId));
			crmContact.setModifiedDate(serviceContext.getModifiedDate(now));
			CrmContact deletedContact = _crmContactLocalService.updateCrmContact(crmContact);

			if (deletedContact != null) {
				auditContactAction(serviceContext, crmContactId, ContactManagerAppPortletKeys.ACTION_DELETE);
				// TODO: pass to Constant Contact API
			}

			response.setRenderParameter("jspPage", "/contacts/view.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.deleteContact: " + e.getMessage());
		}
	}

	public void addOutreachLog(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		
		if (!PermissionUtil.canUserAddOutreach(user)) {
			// TODO: set session message
			return;
		}		
		
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmOutreachLog.class.getName(), request);
			long crmContactId = ParamUtil.getLong(request, "crmContactId");

			CrmOutreachLog crmOutreachLog = _crmOutreachLogLocalService.createCrmOutreachLog(0);
			crmOutreachLog = OutreachLogUtil.updateCrmOutreachLogProperties(crmOutreachLog, request, serviceContext,
					true);
			_crmOutreachLogLocalService.addCrmOutreachLog(crmOutreachLog);

			response.setRenderParameter("crmContactId", String.valueOf(crmContactId));
			response.setRenderParameter("mvcPath", "/outreach/view.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.addOutreachLog: " + e.getMessage());
		}
	}

	public void updateOutreachLog(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		
		if (!PermissionUtil.canUserUpdateOutreach(user)) {
			// TODO: set session message
			return;
		}		

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmOutreachLog.class.getName(), request);
			long crmOutreachLogId = ParamUtil.getLong(request, "crmOutreachLogId");
			long crmContactId = ParamUtil.getLong(request, "crmContactId");

			CrmOutreachLog crmOutreachLog = _crmOutreachLogLocalService.getCrmOutreachLog(crmOutreachLogId);
			OutreachLogUtil.updateCrmOutreachLogProperties(crmOutreachLog, request, serviceContext, true);
			_crmOutreachLogLocalService.updateCrmOutreachLog(crmOutreachLog);

			response.setRenderParameter("crmContactId", String.valueOf(crmContactId));
			response.setRenderParameter("mvcPath", "/outreach/view.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.updateOutreachLog: " + e.getMessage());
		}
	}

	public void deleteOutreachLog(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		
		if (!PermissionUtil.canUserDeleteOutreach(user)) {
			// TODO: set session message
			return;
		}		
		
		try {
			long crmOutreachLogId = ParamUtil.getLong(request, "crmOutreachLogId");
			_crmOutreachLogLocalService.deleteCrmOutreachLog(crmOutreachLogId);
		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.deleteOutreachLog: " + e.getMessage());
		}
	}

	private void auditContactAction(ServiceContext serviceContext, long crmContactId, String action) {

		CrmContactAuditLog crmContactAuditLog = _crmContactAuditLogLocalService
				.createCrmContactAuditLog(0);
		crmContactAuditLog = AuditLogUtil.updateCrmContactAuditLogProperties(crmContactAuditLog, serviceContext,
				crmContactId, action);
		_crmContactAuditLogLocalService.addCrmContactAuditLog(crmContactAuditLog);
	}

	private void auditContactAction(ServiceContext serviceContext, long crmContactId, String action,
			CrmContact oldContact, CrmContact newContact) {

		CrmContactAuditLog crmContactAuditLog = _crmContactAuditLogLocalService
				.createCrmContactAuditLog(0);
		crmContactAuditLog = AuditLogUtil.updateCrmContactAuditLogProperties(crmContactAuditLog, serviceContext,
				crmContactId, action);
		_crmContactAuditLogLocalService.addCrmContactAuditLog(crmContactAuditLog);

		if (crmContactAuditLog != null) {
			List<CrmContactAuditLogChangeViewModel> crmContactAuditLogChangeViewModels = AuditLogUtil
					.collectCrmContactAuditLogChanges(oldContact, newContact);
			AuditLogUtil.setCrmContactAuditLogChanges(crmContactAuditLogChangeViewModels, serviceContext,
					crmContactAuditLog.getCrmContactAuditLogId());
		}
	}

	@Reference
	protected void setCrmContactLocalService(CrmContactLocalService crmContactLocalService) {
		_crmContactLocalService = crmContactLocalService;
	}

	@Reference
	protected void setCrmContactService(CrmContactService crmContactService) {
		_crmContactService = crmContactService;
	}

	@Reference
	protected void setCrmContactAuditLogService(CrmContactAuditLogLocalService crmContactAuditLogLocalService) {
		_crmContactAuditLogLocalService = crmContactAuditLogLocalService;
	}

	@Reference
	protected void setCrmOutreachLogService(CrmOutreachLogLocalService crmOutreachLogLocalService) {
		_crmOutreachLogLocalService = crmOutreachLogLocalService;
	}

	private CrmContactLocalService _crmContactLocalService;
	private CrmContactService _crmContactService;
	private CrmContactAuditLogLocalService _crmContactAuditLogLocalService;
	private CrmOutreachLogLocalService _crmOutreachLogLocalService;
}