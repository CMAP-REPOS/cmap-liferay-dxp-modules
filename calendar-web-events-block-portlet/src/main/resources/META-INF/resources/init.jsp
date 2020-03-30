<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="calendar.web.events.block.portlet.util.BaseDateUtil"%>
<%@ page import="calendar.web.events.block.portlet.util.EventBlock"%>
<%@ page import="calendar.web.events.block.portlet.util.CalendarBookingsEventStartTimeComparator"%>

<%@ page import="com.liferay.calendar.model.CalendarBooking"%>
<%@ page import="com.liferay.calendar.service.CalendarBookingLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@ page import="com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet"%>
<%@ page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@ page import="com.liferay.portal.kernel.util.Validator"%>
<%@ page import="com.liferay.portal.kernel.util.Time"%>

<%@ page import="java.io.IOException"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.io.Serializable"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.LinkedHashMap"%>
<%@ page import="java.util.TreeMap"%>
<%@ page import="java.util.TimeZone"%>
<%@ page import="java.util.Collections"%>

<%@ page import="javax.portlet.Portlet"%>
<%@ page import="javax.portlet.PortletException"%>
<%@ page import="javax.portlet.RenderRequest"%>
<%@ page import="javax.portlet.RenderResponse"%>

<%@ page import="com.liferay.calendar.recurrence.RecurrenceSerializer"%>
<%@ page import="com.liferay.calendar.recurrence.Recurrence"%>
<%@ page import="com.liferay.calendar.util.RecurrenceUtil"%>


<liferay-theme:defineObjects />

<portlet:defineObjects />

<%	
	// Get the number of existing Bookings
	int count = com.liferay.calendar.service.CalendarBookingLocalServiceUtil.getCalendarBookingsCount();

	System.out.println(count);

	// Create the necessary utilities to create the query to get all the bookings
	DynamicQuery dq = com.liferay.calendar.service.CalendarBookingLocalServiceUtil.dynamicQuery();
	OrderByComparator orderByComparator = new CalendarBookingsEventStartTimeComparator(true);
	
	// Get all the bookings
	List<CalendarBooking> calendarBookings = com.liferay.calendar.service.CalendarBookingLocalServiceUtil.dynamicQuery(dq, 0, count, orderByComparator);
	
	// Create an array of EventBlocks where we will store the events
	List<EventBlock> eventBlocks = new ArrayList<>();
	
	// Create a Map that will store the event as the key and its link as the value
	Map<EventBlock, Serializable> eventsMap = new LinkedHashMap<EventBlock, Serializable>();
	
	// Get todays date (this date is in UTC timeZone)
	Date date = new Date();
	// Get the time in milliseconds (date object throws it out in nanoseconds)
	long timeMilli = date.getTime() / 1000;
	
	// Initialize the event limit
	int eventLimit = 0;
	
	// Testing for recurrence
	long now = new Date().getTime();
	long endTime = now + Time.MONTH;
			
	List<CalendarBooking> allEventsExpanded = RecurrenceUtil.expandCalendarBookings(calendarBookings, now, endTime, 5);
	System.out.println("\n\n\nAll Events expanded:\n\n\n" + allEventsExpanded);
	
	// order allEventsExpanded and we're done
	// TODO
	// Order events
	Collections.sort(allEventsExpanded, orderByComparator);
	
	System.out.println("\n\n\nAll Events expanded after sort:\n\n\n" + allEventsExpanded);
	
	// Iterate through all the events
	for(CalendarBooking event:allEventsExpanded)
	{	
		// For each event set the start and end time in milliseconds
		long milisEventStartTime = event.getStartTime() / 1000;
		long milisEventEndTime = event.getEndTime() / 1000;
		event.setStartTime(milisEventStartTime);
		event.setEndTime(milisEventEndTime);
		
		/* System.out.println("\n\nEvent " + event);
		System.out.println("EVENT START TIME: " + event.getStartTime());
		System.out.println("TODAY TIME: " + timeMilli);
		System.out.println("Recurrence " + event.getRecurrence());
		System.out.println("RecurrenceObject " + event.getRecurrenceObj());
		System.out.println("Object is in thrash: " + event.isInTrash()); */
		
		
		// Get recurring Events and insert them into a new List
		// recurrence=RRULE:FREQ=DAILY;UNTIL=20200320;INTERVAL=2,
		List<CalendarBooking> recurringBookings;
		if (Validator.isNotNull(event.getRecurrenceObj())) {
			/* Recurrence recurrence = event.getRecurrenceObj();
			System.out.println("Event is recurrent");
			Recurrence deserializedRecurrence = RecurrenceSerializer.deserialize(event.getRecurrence(), TimeZone.getTimeZone("America/Chicago"));
			System.out.println("Deserialized Recurrence: " + deserializedRecurrence);
			System.out.println("Serialized Recurrence: " + RecurrenceSerializer.serialize(deserializedRecurrence));
			System.out.println("UntilJCalendar: " + recurrence.getUntilJCalendar());
			System.out.println("ExceptionJCalendars: " + recurrence.getExceptionJCalendars());
			System.out.println("Interval: " + recurrence.getInterval());
			System.out.println("Weekdays: " + recurrence.getWeekdays());
			System.out.println("Positional Weekdays: " + recurrence.getPositionalWeekdays());
			System.out.println("Positional Weekday: " + recurrence.getPositionalWeekday());
			System.out.println("Months: " + recurrence.getMonths()); */
			//List<CalendarBooking> expandedCalendarBooking = RecurrenceUtil.expandCalendarBooking(event, timeMilli, endTime, 5);
			//System.out.println("\n\nList of expanded CalendarBooking:\n\n" + expandedCalendarBooking);
		}
		
		// If we havent surpassed the limit and the event is NOT in the trash and the start time is greater or equal than todays date, continue with the operations
		if(timeMilli <= event.getStartTime() && eventLimit <= 4 && !event.isInTrash())
		{
			// Create an EventBlock from the event
			EventBlock eventBlock = new EventBlock(event);
			
			// System.out.println(eventBlock.getMonth() + " " + eventBlock.getDay() + " " + eventBlock.getTitle() + " " + eventBlock.getDuration() + "\n\n\n\n");
			
			// Add it to the eventBlocks Array and count it
		    eventBlocks.add(eventBlock);
		    eventLimit++;
		    
		    // Get the event's link
		    Serializable eventLink = event.getExpandoBridge().getAttribute("Link");
		    
		    // Set everything in the eventsMap that will be passed to the render phase
		    eventsMap.put(eventBlock, eventLink);
		}
	}
	
	
%>