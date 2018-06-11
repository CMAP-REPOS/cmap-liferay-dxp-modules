package contact.manager.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;
import contact.manager.model.CrmContact;

public class CrmContactPrimaryAddressCityComparator extends OrderByComparator<CrmContact> {
	
	public static final String ORDER_BY_ASC = "CrmContact.primaryAddressCity ASC";

	public static final String ORDER_BY_DESC = "CrmContact.primaryAddressCity DESC";

	public static final String[] ORDER_BY_FIELDS = {"primaryAddressCity"};
	

	public CrmContactPrimaryAddressCityComparator() {
	    this(false);
	}


	public CrmContactPrimaryAddressCityComparator(boolean ascending) {
	    _ascending = ascending;
	}

	@Override
	public int compare(CrmContact entry1, CrmContact entry2) {
	  String name1 = entry1.getPrimaryAddressCity();
	  String name2 = entry2.getPrimaryAddressCity();

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
