<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="calendar.web.events.block.portlet.util.BaseDateUtil"%>
<%@ page import="calendar.web.events.block.portlet.util.EventBlock"%>

<%@ page import="com.liferay.calendar.model.CalendarBooking"%>
<%@ page import="com.liferay.calendar.service.CalendarBookingLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@ page import="com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet"%>

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
	DynamicQuery dq = com.liferay.calendar.service.CalendarBookingLocalServiceUtil.dynamicQuery();
	List<CalendarBooking> calendarBookings = (List) com.liferay.calendar.service.CalendarBookingLocalServiceUtil.dynamicQuery(dq);
	//List<CalendarBooking> calendarBookings = calendarBookingsAll.subList(calendarBookingsAll.size()-5, calendarBookingsAll.size());
	
	List<EventBlock> eventBlocks = new ArrayList<>();
	Date date = new Date();
	long timeMilli = date.getTime();
	int eventLimit = 0;
	
	System.out.println("=====Today Date " + date + "=========");
	System.out.println("=====Today Date long " + timeMilli + "=========");
	
	
	for(CalendarBooking event:calendarBookings){
		
		if(timeMilli < event.getStartTime() && eventLimit <= 5)
		{
			EventBlock eventBlock = new EventBlock(event);
		    eventBlocks.add(eventBlock);
		    eventLimit++;
		}
	}
	 

%>