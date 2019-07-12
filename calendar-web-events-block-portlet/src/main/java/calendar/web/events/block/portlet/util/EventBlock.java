package calendar.web.events.block.portlet.util;

import com.liferay.calendar.model.CalendarBooking;

import java.io.Serializable;

public class EventBlock implements Serializable {
	private CalendarBooking event;
	
	public EventBlock(CalendarBooking event) {
        this.event = event;
    }
	
	 public String getTitle() {
		 return event.getTitleCurrentValue();
	 }
	 
	 public String getMonth() {
		 return BaseDateUtil.getMonthName(event); 
	 }
	 
	 public int getDay() {
		 return BaseDateUtil.getDayNumber(event); 
	 }
	 
	 public String getWeekday() {
		 return BaseDateUtil.getWeekdayName(event); 
	 }
	 
	 public String getDuration() {
		 return BaseDateUtil.getEventDuration(event); 
	 }

}
