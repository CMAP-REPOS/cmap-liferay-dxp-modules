package com.cmap.portlets.custom.eventslist.portlet;

import com.cmap.portlets.custom.eventslist.configuration.EventsListConfiguration;
import com.cmap.portlets.custom.eventslist.constants.EventsListPortletKeys;
import com.cmap.portlets.custom.eventslist.model.EventViewModel;
import com.liferay.calendar.model.CalendarBooking;
import com.liferay.calendar.service.CalendarBookingLocalServiceUtil;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

/**
 * @author jon
 */
@Component(
		configurationPid = "com.cmap.portlets.custom.configuration.eventslist.EventsListConfiguration", 
		immediate = true, property = {
			"com.liferay.portlet.display-category=CMAP", 
			"com.liferay.portlet.instanceable=true",
			"javax.portlet.display-name=CMAP Events List", 
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/view.jsp",
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user" 
		}, 
		service = Portlet.class
)

public class EventsListPortlet extends MVCPortlet {

	private static final Log _log = LogFactoryUtil.getLog(EventsListPortlet.class);
	private volatile EventsListConfiguration _configuration;

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		PortletPreferences portletPreferences = renderRequest.getPreferences();
		
		int numberOfDaysInThePast = EventsListPortletKeys.DAYS_IN_THE_PAST;
		int numberOfEventsToShow = EventsListPortletKeys.NUMBER_OF_EVENTS;

		if (Validator.isNotNull(_configuration)) {
			if (Validator.isDigit(_configuration.numberOfDaysInThePast())) {
				numberOfDaysInThePast = Integer.parseInt(portletPreferences.getValue("numberOfDaysInThePast", 
						_configuration.numberOfDaysInThePast()));
			}
			if (Validator.isDigit(_configuration.numberOfEventsToShow())) {
				numberOfEventsToShow = Integer.parseInt(
					portletPreferences.getValue("numberOfEventsToShow", _configuration.numberOfEventsToShow()));
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
		
		List<EventViewModel> calendarEvents = new ArrayList<EventViewModel>();
		
		for (CalendarBooking calendarBooking : calendarBookings) {
			calendarEvents.add(getEventViewModel(calendarBooking));
		}
		
		renderRequest.setAttribute(EventsListConfiguration.class.getName(), _configuration);
		renderRequest.setAttribute("calendarEvents", calendarEvents);

		super.doView(renderRequest, renderResponse);
	}

	protected EventViewModel getEventViewModel(CalendarBooking calendarBooking) {
		
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat timeFormat = new SimpleDateFormat("H:mm a");

		long startTimeStamp = calendarBooking.getStartTime();
		long endTimeStamp = calendarBooking.getEndTime();
		
		String date = dateFormat.format(startTimeStamp);
		String time = StringPool.BLANK;
		String startTime = timeFormat.format(new Date(startTimeStamp));
		String endTime = timeFormat.format(new Date(endTimeStamp));
		
		if (Long.compare(startTimeStamp, endTimeStamp) == 0) {
			time = startTime;
		} else if (Long.compare(endTimeStamp, 0L) > 0) {
			time = startTime + " - " + endTime; 
		}
		
		String title = calendarBooking.getTitle();
		String description = calendarBooking.getDescription();
		String location = calendarBooking.getLocation();
		String appointment = getAppointment(calendarBooking);
		
		EventViewModel eventViewModel = new EventViewModel(date, time, title, description, location, appointment);
		
		return eventViewModel;
	}
	
	protected String getAppointment(CalendarBooking calendarBooking) {
		String url = StringPool.BLANK;
		SimpleDateFormat iCalDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");;
		
		// BEGIN:VCALENDAR
		// VERSION:2.0
		// PRODID:-PRODID:-//CMAP//NONSGML CMAP//EN
		// BEGIN:VEVENT
		// UID:uid1@example.com
		// DTSTAMP:19970714T170000
		// ORGANIZER;CN=John Doe:MAILTO:john.doe@example.com
		// DTSTART:19970714T170000Z
		// DTEND:19970715T035959Z
		// SUMMARY:Bastille Day Party
		// END:VEVENT
		// END:VCALENDAR
		
		String appointment = StringPool.BLANK;
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("BEGIN:VCALENDAR");
			sb.append("\n");
			sb.append("VERSION:2.0");
			sb.append("\n");
			sb.append("PRODID:-//CMAP//NONSGML CMAP//EN");
			sb.append("\n");
			sb.append("BEGIN:VEVENT");
			sb.append("\n");
			sb.append("UID:" + UUID.randomUUID());
			sb.append("\n");
			sb.append("DTSTAMP:" + iCalDateFormat.format(new Date(calendarBooking.getStartTime())));
			sb.append("\n");
			sb.append("ORGANIZER;CN=CMAP:MAILTO:info@cmap.illinois.gov");
			sb.append("\n");
			sb.append("DTSTART:" + iCalDateFormat.format(new Date(calendarBooking.getStartTime())));
			sb.append("\n");
			sb.append("DTEND:" + iCalDateFormat.format(new Date(calendarBooking.getEndTime())));
			sb.append("\n");
			sb.append("SUMMARY:" + String.valueOf(calendarBooking.getTitle()));
			sb.append("\n");
			// TODO: add link from Custom Fields
			sb.append("URL:" + url);
			sb.append("\n");
			sb.append("LOCATION:" + calendarBooking.getLocation());
			sb.append("\n");
			sb.append("END:VEVENT");
			sb.append("\n");
			sb.append("END:VCALENDAR");
			appointment = Base64.getEncoder().encodeToString(sb.toString().getBytes("utf-8"));
		} catch (Exception ex) {
			_log.error("Exception in UtilLocalService.GenerateEncodedCal: " + ex.getMessage(), ex);
		}		
		

		return appointment;
	}	
	
	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_configuration = ConfigurableUtil.createConfigurable(EventsListConfiguration.class, properties);
	}
}