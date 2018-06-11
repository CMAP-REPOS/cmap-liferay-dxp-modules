package contact.manager.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;
import contact.manager.model.CrmContact;

public class CrmContactPrimaryAddress1Comparator extends OrderByComparator<CrmContact> {
	
	public static final String ORDER_BY_ASC = "CrmContact.primaryAddress1 ASC";

	public static final String ORDER_BY_DESC = "CrmContact.primaryAddress1 DESC";

	public static final String[] ORDER_BY_FIELDS = {"primaryAddress1"};
	

	public CrmContactPrimaryAddress1Comparator() {
	    this(false);
	}


	public CrmContactPrimaryAddress1Comparator(boolean ascending) {
	    _ascending = ascending;
	}

	@Override
	public int compare(CrmContact entry1, CrmContact entry2) {
	  String name1 = entry1.getPrimaryAddress1();
	  String name2 = entry2.getPrimaryAddress1();

	  int value = name1.compareTo(name2);

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
