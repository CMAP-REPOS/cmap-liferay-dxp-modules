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
			crmContact = updateCrmContactProperties(crmContact, request, serviceContext, true);

			_crmContactLocalService.addCrmContact(crmContact);
			response.setRenderParameter("crmContactId", Long.toString(crmContactId));
			response.setRenderParameter("mvcPath", "/details.jsp");
		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.addContact: " + e.getMessage());
		}
	}

	public void updateContact(ActionRequest request, ActionResponse response) throws PortalException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
			long crmContactId = ParamUtil.getLong(request, "crmContactId");

			CrmContact crmContact = _crmContactLocalService.getCrmContact(crmContactId);
			crmContact = updateCrmContactProperties(crmContact, request, serviceContext, false);

			_crmContactLocalService.updateCrmContact(crmContact);
			response.setRenderParameter("crmContactId", Long.toString(crmContactId));
			response.setRenderParameter("mvcPath", "/details.jsp");
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
			response.setRenderParameter("jspPage", "/view.jsp");
		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.deleteContact: " + e.getMessage());
		}
	}

	private CrmContact updateCrmContactProperties(CrmContact crmContact, ActionRequest request,
			ServiceContext serviceContext, boolean isNew) {

		Date now = new Date();
		long userId = serviceContext.getUserId();

		String alternateContact = ParamUtil.getString(request, "alternateContact");
		String alternateEmail = ParamUtil.getString(request, "alternateEmail");
		String facebookId = ParamUtil.getString(request, "facebookId");
		String firstName = ParamUtil.getString(request, "firstName");
		String groupsList = ParamUtil.getString(request, "groupsList");
		boolean isVip = ParamUtil.getBoolean(request, "isVip");
		String jobTitle = ParamUtil.getString(request, "jobTitle");
		String lastName = ParamUtil.getString(request, "lastName");
		String linkedInUrl = ParamUtil.getString(request, "linkedInUrl");
		String middleName = ParamUtil.getString(request, "middleName");
		String organization = ParamUtil.getString(request, "organization");
		String prefix = ParamUtil.getString(request, "prefix");
		String primaryAddress1 = ParamUtil.getString(request, "primaryAddress1");
		String primaryAddress2 = ParamUtil.getString(request, "primaryAddress2");
		String primaryAddressCity = ParamUtil.getString(request, "primaryAddressCity");
		String primaryAddressCountry = ParamUtil.getString(request, "primaryAddressCountry");
		String primaryAddressCounty = ParamUtil.getString(request, "primaryAddressCounty");
		String primaryAddressState = ParamUtil.getString(request, "primaryAddressState");
		String primaryAddressZip = ParamUtil.getString(request, "primaryAddressZip");
		String primaryCell = ParamUtil.getString(request, "primaryCell");
		String primaryEmailAddress = ParamUtil.getString(request, "primaryEmailAddress");
		String primaryFax = ParamUtil.getString(request, "primaryFax");
		String primaryPhone = ParamUtil.getString(request, "primaryPhone");
		String primaryPhoneExtension = ParamUtil.getString(request, "primaryPhoneExtension");
		String salutation = ParamUtil.getString(request, "salutation");
		String secondaryAddress1 = ParamUtil.getString(request, "secondaryAddress1");
		String secondaryAddress2 = ParamUtil.getString(request, "secondaryAddress2");
		String secondaryAddressCity = ParamUtil.getString(request, "secondaryAddressCity");
		String secondaryAddressCountry = ParamUtil.getString(request, "secondaryAddressCountry");
		String secondaryAddressCounty = ParamUtil.getString(request, "secondaryAddressCounty");
		String secondaryAddressState = ParamUtil.getString(request, "secondaryAddressState");
		String secondaryAddressZip = ParamUtil.getString(request, "secondaryAddressZip");
		String tagsList = ParamUtil.getString(request, "tagsList");
		String twitterHandle = ParamUtil.getString(request, "twitterHandle");

		crmContact.setAlternateContact(alternateContact);
		crmContact.setAlternateEmail(alternateEmail);
		crmContact.setFacebookId(facebookId);
		crmContact.setFirstName(firstName);
		crmContact.setGroupsList(groupsList);
		crmContact.setIsVip(isVip);
		crmContact.setJobTitle(jobTitle);
		crmContact.setLastName(lastName);
		crmContact.setLinkedInUrl(linkedInUrl);
		crmContact.setMiddleName(middleName);
		crmContact.setOrganization(organization);
		crmContact.setPrefix(prefix);
		crmContact.setPrimaryAddress1(primaryAddress1);
		crmContact.setPrimaryAddress2(primaryAddress2);
		crmContact.setPrimaryAddressCity(primaryAddressCity);
		crmContact.setPrimaryAddressCountry(primaryAddressCountry);
		crmContact.setPrimaryAddressCounty(primaryAddressCounty);
		crmContact.setPrimaryAddressState(primaryAddressState);
		crmContact.setPrimaryAddressZip(primaryAddressZip);
		crmContact.setPrimaryCell(primaryCell);
		crmContact.setPrimaryEmailAddress(primaryEmailAddress);
		crmContact.setPrimaryFax(primaryFax);
		crmContact.setPrimaryPhone(primaryPhone);
		crmContact.setPrimaryPhoneExtension(primaryPhoneExtension);
		crmContact.setSalutation(salutation);
		crmContact.setSecondaryAddress1(secondaryAddress1);
		crmContact.setSecondaryAddress2(secondaryAddress2);
		crmContact.setSecondaryAddressCity(secondaryAddressCity);
		crmContact.setSecondaryAddressCountry(secondaryAddressCountry);
		crmContact.setSecondaryAddressCounty(secondaryAddressCounty);
		crmContact.setSecondaryAddressState(secondaryAddressState);
		crmContact.setSecondaryAddressZip(secondaryAddressZip);
		crmContact.setTagsList(tagsList);
		crmContact.setTwitterHandle(twitterHandle);

		crmContact.setUserId(userId);
		crmContact.setUserName(StringPool.BLANK);
		crmContact.setModifiedDate(serviceContext.getModifiedDate(now));

		if (isNew) {
			long companyId = serviceContext.getCompanyId();
			long groupId = serviceContext.getScopeGroupId();

			crmContact.setGroupId(groupId);
			crmContact.setCompanyId(companyId);
			crmContact.setCreateDate(serviceContext.getCreateDate(now));
			crmContact.setStatus(ConstantContactKeys.CC_STATUS_ACTIVE);
		}

		return crmContact;
	}

	@Reference(unbind = "-")
	protected void setEntryService(CrmContactLocalService crmContactLocalService) {
		_crmContactLocalService = crmContactLocalService;
	}

	private CrmContactLocalService _crmContactLocalService;
}