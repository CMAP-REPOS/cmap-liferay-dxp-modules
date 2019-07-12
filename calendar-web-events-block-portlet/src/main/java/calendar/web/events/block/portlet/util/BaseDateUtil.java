package calendar.web.events.block.portlet.util;

import com.liferay.calendar.model.CalendarBooking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseDateUtil {
	
	public static String getWeekdayName(CalendarBooking event) {
		
		long dateEvent = event.getStartTime();
		Date date = new Date(dateEvent);
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("E");
		
		return simpleDateformat.format(date).toUpperCase();
	}
	
	public static String getMonthName(CalendarBooking event) {
		
		long dateEvent = event.getStartTime();
		Date date = new Date(dateEvent);
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("MMM");
		
		return simpleDateformat.format(date).toUpperCase();
	}
	
	public static int getDayNumber(CalendarBooking event) {
		
		long dateEvent = event.getStartTime();
		Date date = new Date(dateEvent);
		
		return date.getDate();
	}
	
	
	public static String getEventDuration(CalendarBooking event) {
	
		long dateEventStart = event.getStartTime();
		long dateEventEnd = event.getEndTime();
		
		Date dateStart = new Date(dateEventStart);
		Date dateEnd = new Date(dateEventEnd);
		
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("h:mm a");
		
		String eventDuration = simpleDateformat.format(dateStart) + "-" + simpleDateformat.format(dateEnd);
		
		return eventDuration;
		
	}

}
