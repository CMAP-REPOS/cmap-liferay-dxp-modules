package contact.manager.app.util;

import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;

import contact.manager.app.constants.ConstantContactKeys;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.service.CrmContactLocalServiceUtil;
import contact.manager.service.CrmGroupLocalServiceUtil;

public class GroupUtil {

	public static CrmGroup updateCrmGroupProperties(CrmGroup crmGroup, ActionRequest request,
			ServiceContext serviceContext, boolean isNew) {

		Date now = new Date();
		long userId = serviceContext.getUserId();
		String userName = UserUtil.getUserName(userId);

		String name = ParamUtil.getString(request, "name");
				
		crmGroup.setName(name);
		crmGroup.setUserId(userId);
		crmGroup.setUserName(userName);
		crmGroup.setModifiedDate(serviceContext.getModifiedDate(now));

		if (isNew) {
			long companyId = serviceContext.getCompanyId();
			long groupId = serviceContext.getScopeGroupId();

			crmGroup.setGroupId(groupId);
			crmGroup.setCompanyId(companyId);
			crmGroup.setCreateDate(serviceContext.getCreateDate(now));
		}

		return crmGroup;
	}

	public static String getCrmGroupsByContactId(long crmContactId) {

		String result = StringPool.BLANK;
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		List<CrmGroup> crmGroups = CrmContactLocalServiceUtil.getCrmGroups(crmContactId);

		for (CrmGroup crmGroup : crmGroups) {
			JSONObject obj = JSONFactoryUtil.createJSONObject();
			obj.put("id", crmGroup.getCrmGroupId());
			obj.put("text", crmGroup.getName());
			jsonArray.put(obj);
		}

		result = jsonArray.toString();
		return result;

	}

	public static String getCrmContactsByGroupId(long crmGroupId) {
		
		String result = StringPool.BLANK;
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		
		List<CrmContact> crmContacts = CrmGroupLocalServiceUtil.getCrmContacts(crmGroupId);

		for (CrmContact crmContact : crmContacts) {
			if (!crmContact.getStatus().equals(ConstantContactKeys.CC_STATUS_REMOVED)) {
				JSONObject obj = JSONFactoryUtil.createJSONObject();
				obj.put("id", crmContact.getCrmContactId());
				obj.put("text", crmContact.getFirstName() + " " + crmContact.getLastName());
				jsonArray.put(obj);
			}
		}

		result = jsonArray.toString();
		return result;
	}

	public static String getCrmContactsByName(String name) {
				
		String result = StringPool.BLANK;
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		
		DynamicQuery crmContactQuery = CrmContactLocalServiceUtil.dynamicQuery();

		Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
		disjunction.add(RestrictionsFactoryUtil.like("firstName", "%" + name + "%"));
		disjunction.add(RestrictionsFactoryUtil.like("middleName", "%" + name + "%"));
		disjunction.add(RestrictionsFactoryUtil.like("lastName", "%" + name + "%"));
		crmContactQuery.add(disjunction);

		List<CrmContact> matchingContacts = CrmContactLocalServiceUtil.dynamicQuery(crmContactQuery, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		for (CrmContact crmContact : matchingContacts) {
			if (!crmContact.getStatus().equals(ConstantContactKeys.CC_STATUS_REMOVED)) {
				JSONObject obj = JSONFactoryUtil.createJSONObject();
				obj.put("crmContactId", crmContact.getCrmContactId());
				obj.put("crmContactName", crmContact.getFirstName() + " " + crmContact.getLastName());
				jsonArray.put(obj);
			}
		}

		result = jsonArray.toString();
		return result;
	}
	
	public static String getCrmContactsByNameAndCrmGroupId(String name, long crmGroupId) {
		
		String result = StringPool.BLANK;
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		CrmGroup crmGroup = null;
		
		try {
			crmGroup = CrmGroupLocalServiceUtil.getCrmGroup(crmGroupId);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (crmGroup != null) {
			DynamicQuery crmContactQuery = CrmContactLocalServiceUtil.dynamicQuery();

			Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
			disjunction.add(RestrictionsFactoryUtil.like("firstName", "%" + name + "%"));
			disjunction.add(RestrictionsFactoryUtil.like("middleName", "%" + name + "%"));
			disjunction.add(RestrictionsFactoryUtil.like("lastName", "%" + name + "%"));
			crmContactQuery.add(disjunction);

			List<CrmContact> matchingContacts = CrmContactLocalServiceUtil.dynamicQuery(crmContactQuery, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			for (CrmContact crmContact : matchingContacts) {
				if (!crmContact.getStatus().equals(ConstantContactKeys.CC_STATUS_REMOVED) && 
						CrmGroupLocalServiceUtil.getCrmContactCrmGroups(crmContact.getCrmContactId()).contains(crmGroup)) {
					JSONObject obj = JSONFactoryUtil.createJSONObject();
					obj.put("crmContactId", crmContact.getCrmContactId());
					obj.put("crmContactName", crmContact.getFirstName() + " " + crmContact.getLastName());
					jsonArray.put(obj);
				}
			}
		}
		
		result = jsonArray.toString();
		return result;
	}

	public static String getCrmGroupsByName(String name) {
		
		String result = StringPool.BLANK;
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		
		DynamicQuery crmGroupQuery = CrmGroupLocalServiceUtil.dynamicQuery();
		crmGroupQuery.add(RestrictionsFactoryUtil.like("name", "%" + name + "%"));

		List<CrmGroup> matchingGroups = CrmGroupLocalServiceUtil.dynamicQuery(crmGroupQuery , QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		
		for (CrmGroup crmGroup : matchingGroups) {

			JSONObject obj = JSONFactoryUtil.createJSONObject();
			obj.put("crmGroupId", crmGroup.getCrmGroupId());
			obj.put("crmGroupName", crmGroup.getName());
			jsonArray.put(obj);
		}

		result = jsonArray.toString();
		return result;
	}

}


