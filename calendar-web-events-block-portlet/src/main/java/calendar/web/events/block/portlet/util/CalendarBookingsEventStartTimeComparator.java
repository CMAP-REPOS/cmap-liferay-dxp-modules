package calendar.web.events.block.portlet.util;

import com.liferay.calendar.model.CalendarBooking;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Date;


public class CalendarBookingsEventStartTimeComparator extends OrderByComparator<CalendarBooking> {
	
	public static final String ORDER_BY_ASC = "CalendarBookings.startTime ASC";

	public static final String ORDER_BY_DESC = "CalendarBookings.startTime DESC";

	public static final String[] ORDER_BY_FIELDS = {"startTime"};
	

	public CalendarBookingsEventStartTimeComparator() {
	    this(false);
	}


	public CalendarBookingsEventStartTimeComparator(boolean ascending) {
	    _ascending = ascending;
	}

	@Override
	public int compare(CalendarBooking entry1, CalendarBooking entry2) {
	  Long name1 = entry1.getStartTime();
	  Long name2 = entry2.getStartTime();

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

