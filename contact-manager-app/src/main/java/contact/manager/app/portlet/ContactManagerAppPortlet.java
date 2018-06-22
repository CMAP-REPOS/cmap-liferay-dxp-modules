package contact.manager.app.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.io.IOException;
import java.util.ArrayList;
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
import contact.manager.app.util.ContactUtil;
import contact.manager.app.viewmodel.CrmContactViewModel;
import contact.manager.model.CrmContact;
import contact.manager.service.CrmContactLocalService;

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
	}, 
	service = Portlet.class
)
public class ContactManagerAppPortlet extends MVCPortlet {

	private static final Log LOGGER = LogFactoryUtil.getLog(ContactManagerAppPortlet.class);

	@Override
	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {

		List<CrmContactViewModel> viewModels = new ArrayList<CrmContactViewModel>();
		List<CrmContact> crmContacts = _crmContactLocalService.findByStatus(ConstantContactKeys.CC_STATUS_ACTIVE);

		for (CrmContact crmContact : crmContacts) {
			viewModels.add(new CrmContactViewModel(crmContact));
		}

		request.setAttribute("viewModels", viewModels);
		super.render(request, response);
	}

	public void addContact(ActionRequest request, ActionResponse response) throws PortalException {

		
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
			long crmContactId = CounterLocalServiceUtil.increment(CrmContact.class.getName());

			CrmContact crmContact = _crmContactLocalService.createCrmContact(crmContactId);
			crmContact = ContactUtil.updateCrmContactProperties(crmContact, request, serviceContext, true);
			_crmContactLocalService.addCrmContact(crmContact);
			response.setRenderParameter("crmContactId", Long.toString(crmContactId));
			response.setRenderParameter("mvcPath", "/contacts/details.jsp");
		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.addContact: " + e.getMessage());
		}
	}

	public void updateContact(ActionRequest request, ActionResponse response) throws PortalException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
			long crmContactId = ParamUtil.getLong(request, "crmContactId");

			CrmContact crmContact = _crmContactLocalService.getCrmContact(crmContactId);
			crmContact = ContactUtil.updateCrmContactProperties(crmContact, request, serviceContext, false);

			_crmContactLocalService.updateCrmContact(crmContact);
			response.setRenderParameter("crmContactId", Long.toString(crmContactId));
			response.setRenderParameter("mvcPath", "/contacts/details.jsp");
		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.updateContact: " + e.getMessage());
		}
	}

	public void deleteContact(ActionRequest request, ActionResponse response) throws PortalException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
			long crmContactId = ParamUtil.getLong(request, "crmContactId");
			long userId = serviceContext.getUserId();
			Date now = new Date();
			CrmContact crmContact = _crmContactLocalService.getCrmContact(crmContactId);
			crmContact.setStatus(ConstantContactKeys.CC_STATUS_REMOVED);
			crmContact.setUserId(userId);
			crmContact.setUserName(StringPool.BLANK);
			crmContact.setModifiedDate(serviceContext.getModifiedDate(now));
			_crmContactLocalService.updateCrmContact(crmContact);
			response.setRenderParameter("jspPage", "/contacts/view.jsp");
		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.deleteContact: " + e.getMessage());
		}
	}

	@Reference(unbind = "-")
	protected void setEntryService(CrmContactLocalService crmContactLocalService) {
		_crmContactLocalService = crmContactLocalService;
	}

	private CrmContactLocalService _crmContactLocalService;
}