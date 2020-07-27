package contact.manager.app.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.constantcontact.service.impl.ConstantContactServiceImpl;
import contact.manager.app.constants.ConstantContactKeys;
import contact.manager.app.constants.ContactManagerAppPortletKeys;
import contact.manager.app.util.AuditLogUtil;
import contact.manager.app.util.UserUtil;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmContactAuditLog;
import contact.manager.service.CrmContactAuditLogLocalService;
import contact.manager.service.CrmContactLocalService;

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
				"com.liferay.portlet.header-portlet-css=/css/select2.css",
				"com.liferay.portlet.header-portlet-javascript=/js/select2.js",
				"javax.portlet.display-name=Recycling Bin", 
				"javax.portlet.expiration-cache=0", 
				"javax.portlet.init-param.template-path=/", 
				"javax.portlet.init-param.view-template=/recyclingbin/view.jsp", 
				"javax.portlet.name=" + ContactManagerAppPortletKeys.RecyclingBinApp,
				"javax.portlet.resource-bundle=content.Language", 
				"javax.portlet.security-role-ref=power-user,user", 
				"javax.portlet.supports.mime-type=text/html" 
		}, service = Portlet.class
)
public class RecyclingBinPortlet  extends MVCPortlet {
	private static final Log LOGGER = LogFactoryUtil.getLog(ContactManagerAppPortletKeys.class);

	@Override
	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {
		super.render(request, response);
	}
	
	
	public void deleteContact(ActionRequest request, ActionResponse response) throws PortalException {

		System.out.println("\n======= Recycling Bin Delete Workflow =======\n");
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
			long crmContactId = ParamUtil.getLong(request, "crmContactId");
			long userId = serviceContext.getUserId();
			Date now = new Date();

			CrmContact crmContact = _crmContactLocalService.getCrmContact(crmContactId);
			crmContact.setStatus(ConstantContactKeys.CC_STATUS_DELETED);
			crmContact.setUserId(userId);
			crmContact.setUserName(UserUtil.getUserName(userId));
			crmContact.setModifiedDate(serviceContext.getModifiedDate(now));
			CrmContact deletedContact = _crmContactLocalService.updateCrmContact(crmContact, serviceContext);
			System.out.println("deleted contact" + deletedContact);
			if (deletedContact != null) {
//				ConstantContactServiceImpl constantContactServiceImpl = new ConstantContactServiceImpl();
//				StringBuffer bufferResponse = new StringBuffer();
//				constantContactServiceImpl.deleteContact(Long.toString(deletedContact.getConstantContactId()), bufferResponse);
//				String responseCode = bufferResponse.toString();
//				System.out.println("responseCode ====>" + responseCode);
				
				auditContactAction(serviceContext, crmContactId, ContactManagerAppPortletKeys.ACTION_REMOVED);
			}

			response.setRenderParameter("jspPage", "/recyclingbin/view.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.deleteContact: " + e.getMessage());
		}
	}
	
	private void auditContactAction(ServiceContext serviceContext, long crmContactId, String action) {

		CrmContactAuditLog crmContactAuditLog = _crmContactAuditLogLocalService
				.createCrmContactAuditLog(0);
		crmContactAuditLog = AuditLogUtil.updateCrmContactAuditLogProperties(crmContactAuditLog, serviceContext,
				crmContactId, action);
		_crmContactAuditLogLocalService.addCrmContactAuditLog(crmContactAuditLog);
	}
	
	@Reference
	protected void setCrmContactService(CrmContactLocalService crmContactLocalService) {
		_crmContactLocalService = crmContactLocalService;
	}
	
	@Reference
	protected void setCrmContactAuditLogService(CrmContactAuditLogLocalService crmContactAuditLogLocalService) {
		_crmContactAuditLogLocalService = crmContactAuditLogLocalService;
	}
	
	private CrmContactAuditLogLocalService _crmContactAuditLogLocalService;
	
	private CrmContactLocalService _crmContactLocalService;
}
