package calendar.web.events.block.portlet.portlet;

import calendar.web.events.block.portlet.constants.CalendarWebEventsBlockPortletKeys;
import calendar.web.events.block.portlet.util.CalendarBookingsEventStartTimeComparator;

import com.liferay.calendar.model.CalendarBooking;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ArrayList;


import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author hectorortiz
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=CMAP",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Calendar Events Block",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CalendarWebEventsBlockPortletKeys.CALENDARWEBEVENTSBLOCK,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CalendarWebEventsBlockPortlet extends MVCPortlet {

	private static final Locale _locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
}