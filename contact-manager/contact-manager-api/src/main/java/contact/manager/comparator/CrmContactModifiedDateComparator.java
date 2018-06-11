package contact.manager.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Date;

import contact.manager.model.CrmContact;

public class CrmContactModifiedDateComparator extends OrderByComparator<CrmContact> {
	
	public static final String ORDER_BY_ASC = "CrmContact.modifiedDate ASC";

	public static final String ORDER_BY_DESC = "CrmContact.modifiedDate DESC";

	public static final String[] ORDER_BY_FIELDS = {"modifiedDate"};
	

	public CrmContactModifiedDateComparator() {
	    this(false);
	}


	public CrmContactModifiedDateComparator(boolean ascending) {
	    _ascending = ascending;
	}

	@Override
	public int compare(CrmContact entry1, CrmContact entry2) {
	  Date name1 = entry1.getModifiedDate();
	  Date name2 = entry2.getModifiedDate();

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
