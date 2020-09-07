package contact.manager.comparator;

import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.model.CrmNote;

public class CrmNoteUserNameComparator extends OrderByComparator<CrmNote> {

	private static final long serialVersionUID = 1L;
	public static final String ORDER_BY_ASC = "CrmNote.userName ASC";
	public static final String ORDER_BY_DESC = "CrmNote.userName DESC";
	public static final String[] ORDER_BY_FIELDS = { "userName" };

	public CrmNoteUserNameComparator() {
		this(false);
	}

	public CrmNoteUserNameComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
	public int compare(CrmNote entry1, CrmNote entry2) {
		String name1 = entry1.getUserName();
		String name2 = entry2.getUserName();

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
