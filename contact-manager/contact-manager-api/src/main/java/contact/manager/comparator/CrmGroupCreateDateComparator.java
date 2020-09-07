package contact.manager.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Date;

import contact.manager.model.CrmGroup;

public class CrmGroupCreateDateComparator extends OrderByComparator<CrmGroup> {
	
	public static final String ORDER_BY_ASC = "CrmGroup.createDate ASC";

	public static final String ORDER_BY_DESC = "CrmGroup.createDate DESC";

	public static final String[] ORDER_BY_FIELDS = {"createDate"};
	

	public CrmGroupCreateDateComparator() {
	    this(false);
	}


	public CrmGroupCreateDateComparator(boolean ascending) {
	    _ascending = ascending;
	}

	@Override
	public int compare(CrmGroup entry1, CrmGroup entry2) {
	  Date name1 = entry1.getCreateDate();
	  Date name2 = entry2.getCreateDate();

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
