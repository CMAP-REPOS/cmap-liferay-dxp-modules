package contact.manager.app.viewmodel;

import com.liferay.portal.kernel.util.OrderByComparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CrmContactViewModelModifiedDateComparator extends OrderByComparator<CrmContactViewModel> {
	
	public static final String ORDER_BY_ASC = "CrmContactViewModel.modifiedDate ASC";

	public static final String ORDER_BY_DESC = "CrmContactViewModel.modifiedDate DESC";

	public static final String[] ORDER_BY_FIELDS = {"modifiedDate"};
	

	public CrmContactViewModelModifiedDateComparator() {
	    this(false);
	}


	public CrmContactViewModelModifiedDateComparator(boolean ascending) {
	    _ascending = ascending;
	}

	@Override
	public int compare(CrmContactViewModel entry1, CrmContactViewModel entry2) {
		
		String sDate1 = entry1.getModifiedDate();
		String sDate2 = entry2.getModifiedDate();
		
		SimpleDateFormat formatter = new SimpleDateFormat("MMMMM dd, yyyy HH:mm:ss a");
		
		Date date1 = null;
		try {
			date1 = formatter.parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		Date date2 = null;
		try {
			date2 = formatter.parse(sDate2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	  int value = date1.compareTo(date2);

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

