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

<%@ page import="javax.portlet.Portlet"%>
<%@ page import="javax.portlet.PortletException"%>
<%@ page import="javax.portlet.RenderRequest"%>
<%@ page import="javax.portlet.RenderResponse"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%	
	// Get the number of existing Bookings
	int count = com.liferay.calendar.service.CalendarBookingLocalServiceUtil.getCalendarBookingsCount();

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
	
	// Iterate through all the events
	for(CalendarBooking event:calendarBookings)
	{	
		// For each event set the start and end time in milliseconds
		long milisEventStartTime = event.getStartTime() / 1000;
		long milisEventEndTime = event.getEndTime() / 1000;
		event.setStartTime(milisEventStartTime);
		event.setEndTime(milisEventEndTime);
		
		System.out.println("\n\nEvent " + event);
		System.out.println("EVENT START TIME: " + event.getStartTime());
		System.out.println("TODAY TIME: " + timeMilli);
		System.out.println("Recurrence " + event.getRecurrence());
		System.out.println("RecurrenceObject " + event.getRecurrenceObj());
		
		// Get recurring Events and insert them into a new List
		// recurrence=RRULE:FREQ=DAILY;UNTIL=20200320;INTERVAL=2,
		List<CalendarBooking> recurringBookings;
		if (Validator.isNotNull(event.getRecurrenceObj())) {
			System.out.println("Event is recurrent");
		}
		
		// If we havent surpassed the limit and the event is NOT in the trash and the start time is greater or equal than todays date, continue with the operations
		if(timeMilli <= event.getStartTime() && eventLimit <= 4 && !event.isInTrash())
		{
			// Create an EventBlock from the event
			EventBlock eventBlock = new EventBlock(event);
			
			System.out.println(eventBlock.getMonth() + " " + eventBlock.getDay() + " " + eventBlock.getTitle() + " " + eventBlock.getDuration() + "\n\n\n\n");
			
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