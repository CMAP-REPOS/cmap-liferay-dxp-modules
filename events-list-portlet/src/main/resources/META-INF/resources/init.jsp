<%@ page import="com.cmap.portlets.custom.eventslist.configuration.EventsListConfiguration"%>
<%@ page import="com.cmap.portlets.custom.eventslist.constants.EventsListPortletKeys"%>
<%@ page import="com.cmap.portlets.custom.eventslist.model.EventViewModel"%>

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

<%@ page import="java.net.URI"%>
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
	List<EventViewModel> calendarEvents = (List<EventViewModel>) renderRequest.getAttribute("calendarEvents");
%>