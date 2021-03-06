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
	
	// Creating date windows for event recurrency handling
	long now = date.getTime();
	long endTime = now + Time.MONTH;
			
	// Create a new List that will contain all the relevant events for the widget
	List<CalendarBooking> relevantBookings = new ArrayList<>();
	
	// Eliminate events in trash from the expanding of bookings
	for(CalendarBooking event:calendarBookings) {
		// If the event has a status different from 8 (deleted)
		if (!event.isInTrash()) {
			relevantBookings.add(event);
		}
	}
	
	//
	// TODO: Check if expand events throws an error and handle it
	//
	// Expands all events to create 5 instances of recurrent events in the time span between today and 1 month
	List<CalendarBooking> allEventsExpanded = RecurrenceUtil.expandCalendarBookings(relevantBookings, now, endTime, 5);
	
	// Order events so the widget can show them correctly
	Collections.sort(allEventsExpanded, orderByComparator);
	
	// Iterate through all the expanded and ordered events
	for(CalendarBooking event:allEventsExpanded) {	
		
		// For each event set the start and end time in milliseconds
		// the API throws nanoseconds and a bug was found when using nanoseconds
		long milisEventStartTime = event.getStartTime() / 1000;
		long milisEventEndTime = event.getEndTime() / 1000;
		event.setStartTime(milisEventStartTime);
		event.setEndTime(milisEventEndTime);
		
		// If we havent surpassed the event view limit 
		// and the event is NOT in the trash (this check is done for safety)
		// and the start time is greater or equal than todays date
		// then continue with the operations
		if(timeMilli <= event.getStartTime() && eventLimit <= 4 && !event.isInTrash()) {
			
			// Add it to the eventBlocks Array and update the counter
			EventBlock eventBlock = new EventBlock(event);
		    eventBlocks.add(eventBlock);
		    eventLimit++;
		    
		    // Get the event's link
		    Serializable eventLink = event.getExpandoBridge().getAttribute("Link");
		    
		    // Set everything in the eventsMap that will be passed to the render phase
		    eventsMap.put(eventBlock, eventLink);
		}
	}
	
	
%>