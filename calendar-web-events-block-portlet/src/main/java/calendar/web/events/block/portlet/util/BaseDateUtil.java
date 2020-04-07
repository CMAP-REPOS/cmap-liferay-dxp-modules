package calendar.web.events.block.portlet.util;

import com.liferay.calendar.model.CalendarBooking;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class BaseDateUtil {
	
	public static String getWeekdayName(CalendarBooking event) {
		
		long dateEvent = event.getStartTime() * 1000;
		Date date = new Date(dateEvent);
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("E");
		
		// Liferay API gives sets the start and end time of the all day events 
		// however, it sends it in GTM timezone, so, to avoid wrong rendering
		// we do not set the timezone in that case.
		if (event.isAllDay()) {
			
			return simpleDateformat.format(date).toUpperCase();
			
		} else {
			
			TimeZone etTimeZone = TimeZone.getTimeZone("America/Chicago"); //Target timezone
			simpleDateformat.setTimeZone(etTimeZone);
			
			return simpleDateformat.format(date).toUpperCase();
		}
	}
	
	public static String getMonthName(CalendarBooking event) {
		
		long dateEvent = event.getStartTime() * 1000;
		Date date = new Date(dateEvent);
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("MMMM");
		
		// Liferay API gives sets the start and end time of the all day events 
		// however, it sends it in GTM timezone, so, to avoid wrong rendering
		// we do not set the timezone in that case.
		if (event.isAllDay()) {
			
			return simpleDateformat.format(date).toUpperCase();
			
		} else {
			
			TimeZone etTimeZone = TimeZone.getTimeZone("America/Chicago"); //Target timezone
			simpleDateformat.setTimeZone(etTimeZone);
			
			return simpleDateformat.format(date).toUpperCase();
		}
	}
	
	public static String getDayNumber(CalendarBooking event) {
		
		long dateEvent = event.getStartTime() * 1000;
		Date date = new Date(dateEvent);
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("dd");
		
		// Liferay API gives sets the start and end time of the all day events 
		// however, it sends it in GTM timezone, so, to avoid wrong rendering
		// we do not set the timezone in that case.
		if (event.isAllDay()) {
			
			return simpleDateformat.format(date).toUpperCase();
			
		} else {
			
			TimeZone etTimeZone = TimeZone.getTimeZone("America/Chicago"); //Target timezone
			simpleDateformat.setTimeZone(etTimeZone);
			
			return simpleDateformat.format(date).toUpperCase();
			
		}
	}
	
	
	public static String getEventDuration(CalendarBooking event) {

		long dateEventStart = event.getStartTime() * 1000;
		long dateEventEnd = event.getEndTime() * 1000;
		
		Date dateStart = new Date(dateEventStart);
		Date dateEnd = new Date(dateEventEnd);

		SimpleDateFormat simpleDateformat = new SimpleDateFormat("h:mm a");
		
		// Liferay API gives sets the start and end time of the all day events 
		// however, it sends it in GTM timezone, so, to avoid wrong rendering
		// we do not set the timezone in that case.
		if (event.isAllDay()) {
			
			String eventDuration = simpleDateformat.format(dateStart) + "-" + simpleDateformat.format(dateEnd);
			
			return eventDuration;
			
		} else {
			
			TimeZone etTimeZone = TimeZone.getTimeZone("America/Chicago"); //Target timezone
			simpleDateformat.setTimeZone(etTimeZone);
			
			String eventDuration = simpleDateformat.format(dateStart) + "-" + simpleDateformat.format(dateEnd);
			
			return eventDuration;
		}
	}
}
