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
		TimeZone etTimeZone = TimeZone.getTimeZone("America/Chicago"); //Target timezone
		simpleDateformat.setTimeZone(etTimeZone);
		
		return simpleDateformat.format(date).toUpperCase();
	}
	
	public static String getMonthName(CalendarBooking event) {
		
		long dateEvent = event.getStartTime() * 1000;
		Date date = new Date(dateEvent);
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("MMMM");
		TimeZone etTimeZone = TimeZone.getTimeZone("America/Chicago"); //Target timezone
		simpleDateformat.setTimeZone(etTimeZone);
		
		return simpleDateformat.format(date).toUpperCase();
	}
	
	public static String getDayNumber(CalendarBooking event) {
		
		long dateEvent = event.getStartTime() * 1000;
		Date date = new Date(dateEvent);
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("dd");
		TimeZone etTimeZone = TimeZone.getTimeZone("America/Chicago"); //Target timezone
		simpleDateformat.setTimeZone(etTimeZone);
		
		return simpleDateformat.format(date).toUpperCase();
	}
	
	
	public static String getEventDuration(CalendarBooking event) {
	
		long dateEventStart = event.getStartTime() * 1000;
		long dateEventEnd = event.getEndTime() * 1000;
		
		Date dateStart = new Date(dateEventStart);
		Date dateEnd = new Date(dateEventEnd);
		
		System.out.println("BASEDATEUTIL dateStart " + dateStart);
		System.out.println("BASEDATEUTIL dateEnd " + dateEnd);
		
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("h:mm a");
		TimeZone etTimeZone = TimeZone.getTimeZone("America/Chicago"); //Target timezone
		simpleDateformat.setTimeZone(etTimeZone);
		
		System.out.println("BASEDATEUTIL dateStartFormatted " + simpleDateformat.format(dateStart));
		System.out.println("BASEDATEUTIL dateEndFormatted " + simpleDateformat.format(dateEnd));
	
		String eventDuration = simpleDateformat.format(dateStart) + "-" + simpleDateformat.format(dateEnd);
		
		return eventDuration;
		
	}

}
