package contact.manager.app.util;

import java.util.ArrayList;
import java.util.List;

import contact.manager.model.CrmContact;

public class GroupUtil {

	public static List<CrmContact> getPotentialCrmContacts(long crmGroupId) {

		List<CrmContact> potentialContacts = new ArrayList<CrmContact>();
//		List<CrmContact> assignedContacts = CrmGroupServiceUtil.getCrmContacts(crmGroupId);
//		List<CrmContact> activeContacts = CrmContactServiceUtil.findByStatus(ConstantContactKeys.CC_STATUS_ACTIVE);
//
//		for (CrmContact crmContact : activeContacts) {
//			if (!assignedContacts.contains(crmContact)) {
//				potentialContacts.add(crmContact);
//			}
//		}
//
		return potentialContacts;
	}
}
