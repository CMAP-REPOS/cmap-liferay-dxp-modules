package contact.manager.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Date;

import contact.manager.model.CrmGroup;

public class CrmGroupModifiedDateComparator extends OrderByComparator<CrmGroup> {
	
	public static final String ORDER_BY_ASC = "CrmGroup.modifiedDate ASC";

	public static final String ORDER_BY_DESC = "CrmGroup.modifiedDate DESC";

	public static final String[] ORDER_BY_FIELDS = {"modifiedDate"};
	

	public CrmGroupModifiedDateComparator() {
	    this(false);
	}


	public CrmGroupModifiedDateComparator(boolean ascending) {
	    _ascending = ascending;
	}

	@Override
	public int compare(CrmGroup entry1, CrmGroup entry2) {
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
