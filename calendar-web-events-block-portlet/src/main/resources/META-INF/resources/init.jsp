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

<%@ page import="java.io.IOException"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>

<%@ page import="javax.portlet.Portlet"%>
<%@ page import="javax.portlet.PortletException"%>
<%@ page import="javax.portlet.RenderRequest"%>
<%@ page import="javax.portlet.RenderResponse"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
	int count = com.liferay.calendar.service.CalendarBookingLocalServiceUtil.getCalendarBookingsCount();
	DynamicQuery dq = com.liferay.calendar.service.CalendarBookingLocalServiceUtil.dynamicQuery();
	
	
	OrderByComparator orderByComparator = new CalendarBookingsEventStartTimeComparator(true);
	
	List<CalendarBooking> calendarBookings = com.liferay.calendar.service.CalendarBookingLocalServiceUtil.dynamicQuery(dq, 0, count, orderByComparator);
	
	List<EventBlock> eventBlocks = new ArrayList<>();
	Date date = new Date();
	long timeMilli = date.getTime();
	int eventLimit = 0;
	
	for(CalendarBooking event:calendarBookings)
	{	
		if(timeMilli <= event.getStartTime() && eventLimit <= 5 && !event.isInTrash())
		{
			EventBlock eventBlock = new EventBlock(event);
		    eventBlocks.add(eventBlock);
		    eventLimit++;
		}
	}
	 

%>