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

public class GroupUtil {

	public static CrmGroup updateCrmGroupProperties(CrmGroup crmGroup, ActionRequest request,
			ServiceContext serviceContext, boolean isNew) {

		Date now = new Date();
		long userId = serviceContext.getUserId();
		String userName = UserUtil.getUserName(userId);

		String name = ParamUtil.getString(request, "name");
		long[] crmContactIds = ParamUtil.getLongValues(request, "crmContactIds");

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

		CrmGroupLocalServiceUtil.setCrmContacts(crmGroup.getCrmGroupId(), crmContactIds);

		return crmGroup;
	}

	public static List<CrmContact> getPotentialCrmContacts(long crmGroupId) {

		List<CrmContact> potentialContacts = new ArrayList<CrmContact>();
		List<CrmContact> assignedContacts = CrmGroupLocalServiceUtil.getCrmContacts(crmGroupId);
		List<CrmContact> activeContacts = CrmContactLocalServiceUtil.findByStatus(ConstantContactKeys.CC_STATUS_ACTIVE);

		for (CrmContact crmContact : activeContacts) {
			if (!assignedContacts.contains(crmContact)) {
				potentialContacts.add(crmContact);
			}
		}

		return potentialContacts;
	}
}
