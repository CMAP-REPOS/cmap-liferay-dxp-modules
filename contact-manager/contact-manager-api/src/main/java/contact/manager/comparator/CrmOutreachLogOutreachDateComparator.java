package contact.manager.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Date;

import contact.manager.model.CrmOutreachLog;

public class CrmOutreachLogOutreachDateComparator extends OrderByComparator<CrmOutreachLog> {

	private static final long serialVersionUID = 1L;
	public static final String ORDER_BY_ASC = "CrmOutreachLog.outreachDate ASC";
	public static final String ORDER_BY_DESC = "CrmOutreachLog.outreachDate DESC";
	public static final String[] ORDER_BY_FIELDS = { "outreachDate" };

	public CrmOutreachLogOutreachDateComparator () {
		this(false);
	}

	public CrmOutreachLogOutreachDateComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
	public int compare(CrmOutreachLog entry1, CrmOutreachLog entry2) {
		Date name1 = entry1.getOutreachDate();
		Date name2 = entry2.getOutreachDate();

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
