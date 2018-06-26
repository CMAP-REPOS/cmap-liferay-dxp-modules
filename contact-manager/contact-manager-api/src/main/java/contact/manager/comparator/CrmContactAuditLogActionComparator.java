package contact.manager.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.model.CrmContactAuditLog;

public class CrmContactAuditLogActionComparator extends OrderByComparator<CrmContactAuditLog> {

	private static final long serialVersionUID = 1L;
	public static final String ORDER_BY_ASC = "CrmContactAuditLog.action ASC";
	public static final String ORDER_BY_DESC = "CrmContactAuditLog.action DESC";
	public static final String[] ORDER_BY_FIELDS = {"action"};
	
	public CrmContactAuditLogActionComparator() {
	    this(false);
	}

	public CrmContactAuditLogActionComparator(boolean ascending) {
	    _ascending = ascending;
	}

	@Override
	public int compare(CrmContactAuditLog entry1, CrmContactAuditLog entry2) {
	  String name1 = entry1.getAction();
	  String name2 = entry2.getAction();

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
