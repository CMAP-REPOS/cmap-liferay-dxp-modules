package contact.manager.app.util;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
//import com.liferay.portal.kernel.json.JSONFactoryUtil;
//import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;

import contact.manager.app.constants.ConstantContactKeys;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.service.CrmContactLocalServiceUtil;
import contact.manager.service.CrmGroupLocalServiceUtil;

public class ContactUtil {
	
//	private static CrmContactLocalServiceUtil _crmContactLocalServiceUtil;

	public static CrmContact updateCrmContactProperties(CrmContact crmContact, ActionRequest request,
			ServiceContext serviceContext, boolean isNew) {
		
		boolean addCrmGroups = true;
		return updateCrmContactProperties(crmContact, request, serviceContext, isNew, addCrmGroups);
	}

	public static CrmContact updateCrmContactProperties(CrmContact crmContact, ActionRequest request,
			ServiceContext serviceContext, boolean isNew, boolean addCrmGroups) {

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
		String tagsList = ParamUtil.getString(request, "crmTags");
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
		
		if (addCrmGroups) {
			CrmContactLocalServiceUtil.setCrmGroups(crmContact.getCrmContactId(), crmGroupIds);
			//CrmGroupLocalServiceUtil.setCrmContactCrmGroups(crmContact.getCrmContactId(), crmGroupIds);
		}

		List<CrmGroup> crmGroups = CrmContactLocalServiceUtil.getCrmGroups(crmContact.getCrmContactId());
		//List<CrmGroup> crmGroups = CrmGroupLocalServiceUtil.getCrmContactCrmGroups(crmContact.getCrmContactId());
		
		List<String> crmGroupNames = new ArrayList<String>();
		for (CrmGroup crmGroup : crmGroups) {
			crmGroupNames.add(crmGroup.getName());
		}
		
		String groupsList = String.join(" | ", crmGroupNames);
		crmContact.setGroupsList(groupsList);

		return crmContact;
	}
	
	public static CrmContact updateCrmContactPropertiesCSV(CrmContact crmContact, Map<String, String> mapContact,
			ServiceContext serviceContext, boolean isNew) {
		
		Date now = new Date();
		long userId = serviceContext.getUserId();
		String userName = UserUtil.getUserName(userId);
		List<Long> crmGroupIdsList = new ArrayList<Long>();
		
		
		String firstName = mapContact.get("First Name");
		String middleName = mapContact.get("Middle Name");
		String lastName = mapContact.get("Last Name");
		String organization = mapContact.get("Organization");
		
		boolean isVip;
		if(mapContact.get("Alert").equals("TRUE"))
		{
			isVip = true;
		}
		else {
			isVip = false;
		}
		
		String groupsList = mapContact.get("Groups");
		
		List<String> groups = new ArrayList<String>(Arrays.asList(groupsList.split(" \\| ")));
		
		if(groupsList.length() != 0){
			for (String group : groups) {
				DynamicQuery crmGroupQuery = CrmGroupLocalServiceUtil.dynamicQuery();
				crmGroupQuery.add(RestrictionsFactoryUtil.like("name", "%" + group + "%"));
				List<CrmGroup> matchingGroups = CrmGroupLocalServiceUtil.dynamicQuery(crmGroupQuery , QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
				for (CrmGroup crmGroup : matchingGroups) 
				{
					crmGroupIdsList.add(crmGroup.getCrmGroupId());
				}
			}
		};
		
		String tagsList = mapContact.get("Tags");
		String prefix = mapContact.get("Prefix");
		String salutation = mapContact.get("Salutation");
		String jobTitle = mapContact.get("Job Title");
		String primaryAddress1 = mapContact.get("Primary Address");
		String primaryAddress2 = mapContact.get("Primary Address 2");
		String primaryAddressCity = mapContact.get("Primary Address City");
		String primaryAddressState = mapContact.get("Primary Address State");
		String primaryAddressZip = mapContact.get("Primary Address ZIP");
		String primaryAddressCounty = mapContact.get("Primary Address County");
		String primaryAddressCountry = mapContact.get("Primary Address Country");
		String secondaryAddress1 = mapContact.get("Secondary Address");
		String secondaryAddress2 = mapContact.get("Secondary Address 2");
		String secondaryAddressCity = mapContact.get("Secondary Address City");
		String secondaryAddressState = mapContact.get("Secondary Address State");
		String secondaryAddressZip = mapContact.get("Secondary Address ZIP");
		String secondaryAddressCounty = mapContact.get("Secondary Address County");
		String secondaryAddressCountry = mapContact.get("Secondary Address Country");
		String primaryPhone = mapContact.get("Primary Phone");
		String primaryPhoneExtension = mapContact.get("Primary Phone Extension");
		String primaryFax = mapContact.get("Primary Fax");
		String primaryCell = mapContact.get("Primary Cell");
		String primaryEmailAddress = mapContact.get("Primary Email Address");
		String alternateContact = mapContact.get("Alternate Contact");
		String alternateEmail = mapContact.get("Alternate Email Address");
		String facebookId = mapContact.get("Facebook ID");
		String twitterHandle = mapContact.get("Twitter Handle");
		String linkedInUrl = mapContact.get("LinkedIn URL");
		
		
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
		
		long[] crmGroupIds = crmGroupIdsList.stream().mapToLong(l -> l).toArray();
		
		CrmContactLocalServiceUtil.setCrmGroups(crmContact.getCrmContactId(), crmGroupIds);
		
		List<CrmGroup> crmGroups = CrmContactLocalServiceUtil.getCrmGroups(crmContact.getCrmContactId());
		List<String> crmGroupNames = new ArrayList<String>();
		for (CrmGroup crmGroup : crmGroups) {
			crmGroupNames.add(crmGroup.getName());
		}
		crmContact.setGroupsList(groupsList);		
		
		return crmContact;
		
	}
	
	public static CrmContact updateCrmContactModifiedDate(CrmContact crmContact, ServiceContext serviceContext) {
		
		Date now = new Date();
		// TODO: handle file uploads for photo
		crmContact.setModifiedDate(serviceContext.getModifiedDate(now));

		return crmContact;
	}
	
	public static CrmContact updateCrmContactGroups(CrmContact crmContact) {
		
		List<CrmGroup> crmGroups = CrmGroupLocalServiceUtil.getCrmContactCrmGroups(crmContact.getCrmContactId());
		
		List<String> crmGroupNames = new ArrayList<String>();
		
		for (CrmGroup crmGroup : crmGroups) {
			crmGroupNames.add(crmGroup.getName());
		}
		
		String groupsList = String.join(" | ", crmGroupNames);
		
		crmContact.setGroupsList(groupsList);
		
		System.out.println("=======UPDATED CONTACT GROUP LIST -> " + groupsList);		
		
		return crmContact;
	}
}
