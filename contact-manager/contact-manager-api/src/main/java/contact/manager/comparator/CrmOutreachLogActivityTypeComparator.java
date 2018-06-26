package contact.manager.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.model.CrmOutreachLog;

public class CrmOutreachLogActivityTypeComparator extends OrderByComparator<CrmOutreachLog> {

	private static final long serialVersionUID = 1L;
	public static final String ORDER_BY_ASC = "CrmOutreachLog.activityType ASC";
	public static final String ORDER_BY_DESC = "CrmOutreachLog.activityType DESC";
	public static final String[] ORDER_BY_FIELDS = { "activityType" };

	public CrmOutreachLogActivityTypeComparator() {
		this(false);
	}

	public CrmOutreachLogActivityTypeComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
	public int compare(CrmOutreachLog entry1, CrmOutreachLog entry2) {
		String name1 = entry1.getActivityType();
		String name2 = entry2.getActivityType();

		int value = name1.compareTo(name2);

		if (_ascending) {
			return value;
		} else {
			return -value;
		}
	}

	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		} else {
			return ORDER_BY_DESC;
		}
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
