package contact.manager.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Date;

import contact.manager.model.CrmNote;

public class CrmNoteModifiedDateComparator extends OrderByComparator<CrmNote> {

	private static final long serialVersionUID = 1L;
	public static final String ORDER_BY_ASC = "CrmNote.modifiedDate ASC";
	public static final String ORDER_BY_DESC = "CrmNote.modifiedDate DESC";
	public static final String[] ORDER_BY_FIELDS = { "modifiedDate" };

	public CrmNoteModifiedDateComparator() {
		this(false);
	}

	public CrmNoteModifiedDateComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
	public int compare(CrmNote entry1, CrmNote entry2) {
		Date date1 = entry1.getModifiedDate();
		Date date2 = entry2.getModifiedDate();

		int value = date1.compareTo(date2);

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
