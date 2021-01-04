package com.cmap.portlets.custom.calendareventimporter.portlet;

import com.cmap.portlets.custom.calendareventimporter.constants.CalendarEventImporterPortletKeys;
import com.liferay.calendar.model.CalendarBooking;
import com.liferay.calendar.service.CalendarBookingLocalService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.GenericPortlet;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author jon
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Calendar Event Importer Portlet",
		"javax.portlet.name=" + CalendarEventImporterPortletKeys.CalendarEventImporter,
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CalendarEventImporterPortlet extends GenericPortlet {

	@Override
	protected void doView(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
				

		PrintWriter printWriter = renderResponse.getWriter();
		
		int tes2 = com.liferay.calendar.service.CalendarBookingLocalServiceUtil.getCalendarBookingsCount();
		DynamicQuery dq = com.liferay.calendar.service.CalendarBookingLocalServiceUtil.dynamicQuery();
		
		printWriter.print("=======# of Calendar Bookings -> " + tes2 + "=======");
		

		
		List<CalendarBooking> calendarBookingsAll = (List) com.liferay.calendar.service.CalendarBookingLocalServiceUtil.dynamicQuery(dq);
		
		List<CalendarBooking> calendarBookings = calendarBookingsAll.subList(calendarBookingsAll.size()-5, calendarBookingsAll.size());
		
		//printWriter.print("=====Event Title " + calendarBookings.get(0).getTitleCurrentValue() + "=========");
		
		for(CalendarBooking event:calendarBookings){
//          System.out.println("=====Event Title " + event.getTitleCurrentValue() + "=========");
          
          long dateEvent = event.getStartTime();
          DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
          Date date = new Date(dateEvent);
          
//          System.out.println("=====Event Date " + date + "=========");
//          System.out.println("=====Event Day " + date.getDay() + "=========");
          
          
        }
	}

}