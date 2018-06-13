package contact.manager.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;

public class CrmGroupCrmContactsCountComparator extends OrderByComparator<CrmGroup> {
	
	public static final String ORDER_BY_ASC = "CrmGroup.crmContactsCount ASC";

	public static final String ORDER_BY_DESC = "CrmGroup.crmContactsCount DESC";

	public static final String[] ORDER_BY_FIELDS = {"crmContactsCount"};
	

	public CrmGroupCrmContactsCountComparator() {
	    this(false);
	}


	public CrmGroupCrmContactsCountComparator(boolean ascending) {
	    _ascending = ascending;
	}

	@Override
	public int compare(CrmGroup entry1, CrmGroup entry2) {
	  int cnt1 = (int) entry1.getCrmContactsCount();
	  int cnt2 = (int) entry2.getCrmContactsCount();

	  int value = cnt1 > cnt2 ? 1 : (cnt2 > cnt1) ? -1 : 0;

	  if (_ascending) {
	    return value;
	  }
	  else {
	    return -value;
	  }
	}
	
	@Override
	public String getOrderBy() {
		if (_ascending) { return ORDER_BY_ASC; }
		else { return ORDER_BY_DESC; }
	}
	
	@Override
	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}
	
	@Override
	public boolean isAscending() { 
		return _ascending;
	}

	private final boolean _ascending;

}
