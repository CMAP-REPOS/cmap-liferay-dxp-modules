<%@ page import="com.cmap.portlets.custom.configuration.EventsListConfiguration"%>
<%@ page import="com.cmap.portlets.custom.constants.EventsListPortletKeys"%>

<%@ page import="com.liferay.calendar.model.CalendarBooking"%>
<%@ page import="com.liferay.calendar.service.CalendarBookingLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.orm.Order"%>
<%@ page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@ page import="com.liferay.portal.kernel.util.Constants"%>
<%@ page import="com.liferay.portal.kernel.util.StringPool"%>
<%@ page import="com.liferay.portal.kernel.util.Validator"%>

<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Map"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
	EventsListConfiguration configuration = (EventsListConfiguration) renderRequest.getAttribute(EventsListConfiguration.class.getName());

	int numberOfDaysInThePast = EventsListPortletKeys.DAYS_IN_THE_PAST;
	int numberOfEventsToShow = EventsListPortletKeys.NUMBER_OF_EVENTS;

	if (Validator.isNotNull(configuration)) {
		if (Validator.isDigit(configuration.numberOfDaysInThePast())) {
			numberOfDaysInThePast = Integer.parseInt(portletPreferences.getValue("numberOfDaysInThePast", 
				configuration.numberOfDaysInThePast()));
		}
		if (Validator.isDigit(configuration.numberOfEventsToShow())) {
			numberOfEventsToShow = Integer.parseInt(
				portletPreferences.getValue("numberOfEventsToShow", configuration.numberOfEventsToShow()));
		}
	}

	Date now = new Date(System.currentTimeMillis());
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(now);
	calendar.add(Calendar.DATE, (-numberOfDaysInThePast));

	Date startDate = new Date(calendar.getTimeInMillis());
	Order order = OrderFactoryUtil.asc("startTime");

	DynamicQuery calendarQuery = CalendarBookingLocalServiceUtil.dynamicQuery();
	calendarQuery.add(RestrictionsFactoryUtil.gt("startTime", startDate.getTime()))
			.add(RestrictionsFactoryUtil.eq("calendarId", 738411L)).addOrder(order);

	List<CalendarBooking> calendarBookings = CalendarBookingLocalServiceUtil.dynamicQuery(calendarQuery, 0,
			numberOfEventsToShow);
%>