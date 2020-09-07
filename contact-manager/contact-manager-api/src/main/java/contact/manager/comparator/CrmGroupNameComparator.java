package contact.manager.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;

public class CrmGroupNameComparator extends OrderByComparator<CrmGroup> {
	
	public static final String ORDER_BY_ASC = "CrmGroup.name ASC";

	public static final String ORDER_BY_DESC = "CrmGroup.name DESC";

	public static final String[] ORDER_BY_FIELDS = {"name"};
	

	public CrmGroupNameComparator() {
	    this(false);
	}


	public CrmGroupNameComparator(boolean ascending) {
	    _ascending = ascending;
	}

	@Override
	public int compare(CrmGroup entry1, CrmGroup entry2) {
	  String name1 = entry1.getName();
	  String name2 = entry2.getName();

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
