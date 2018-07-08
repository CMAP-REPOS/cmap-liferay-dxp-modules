package contact.manager.app.util;

import java.util.ArrayList;
import java.util.List;

import contact.manager.app.constants.ConstantContactKeys;
import contact.manager.model.CrmContact;
import contact.manager.service.CrmContactServiceUtil;
import contact.manager.service.CrmGroupLocalServiceUtil;

public class GroupUtil {

	public static List<CrmContact> getPotentialCrmContacts(long crmGroupId) {

		List<CrmContact> potentialContacts = new ArrayList<CrmContact>();
		List<CrmContact> activeContacts = CrmContactServiceUtil.findByStatus(ConstantContactKeys.CC_STATUS_ACTIVE);

		for (CrmContact crmContact : activeContacts) {
			if (!CrmGroupLocalServiceUtil.hasCrmContactCrmGroup(crmContact.getCrmContactId(), crmGroupId)) {
				potentialContacts.add(crmContact);
			}
		}

		return potentialContacts;
	}
}
