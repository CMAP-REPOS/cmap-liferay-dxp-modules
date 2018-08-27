package contact.manager.app.util;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;

import contact.manager.app.constants.ConstantContactKeys;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.service.CrmContactLocalServiceUtil;
import contact.manager.service.CrmGroupLocalServiceUtil;

public class ContactUtil {

	public static CrmContact updateCrmContactProperties(CrmContact crmContact, ActionRequest request,
			ServiceContext serviceContext, boolean isNew) {

		// TODO: handle file uploads for photo
		Date now = new Date();
		long userId = serviceContext.getUserId();
		String userName = UserUtil.getUserName(userId);
		long[] crmGroupIds = ParamUtil.getLongValues(request, "crmGroupIds");
		
		String alternateContact = ParamUtil.getString(request, "alternateContact");
		String alternateEmail = ParamUtil.getString(request, "alternateEmail");
		String facebookId = ParamUtil.getString(request, "facebookId");
		String firstName = ParamUtil.getString(request, "firstName");
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
		crmContact.setUserName(userName);
		crmContact.setModifiedDate(serviceContext.getModifiedDate(now));

		if (isNew) {
			long companyId = serviceContext.getCompanyId();
			long groupId = serviceContext.getScopeGroupId();

			crmContact.setGroupId(groupId);
			crmContact.setCompanyId(companyId);
			crmContact.setCreateDate(serviceContext.getCreateDate(now));
			crmContact.setStatus(ConstantContactKeys.CC_STATUS_ACTIVE);
		}
		
		CrmContactLocalServiceUtil.setCrmGroups(crmContact.getCrmContactId(), crmGroupIds);
		
		List<CrmGroup> crmGroups = CrmContactLocalServiceUtil.getCrmGroups(crmContact.getCrmContactId());
		List<String> crmGroupNames = new ArrayList<String>();
		for (CrmGroup crmGroup : crmGroups) {
			crmGroupNames.add(crmGroup.getName());
		}
		
		String groupsList = String.join(" | ", crmGroupNames);
		crmContact.setGroupsList(groupsList);

		return crmContact;
	}
}
