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
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Calendar Web Events Block",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CalendarWebEventsBlockPortletKeys.CALENDARWEBEVENTSBLOCK,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CalendarWebEventsBlockPortlet extends MVCPortlet {
	
	
	/*@Override
	public void doView(
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
          System.out.println("=====Event Title " + event.getTitleCurrentValue() + "=========");
          
          long dateEvent = event.getStartTime();
          DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
          Date date = new Date(dateEvent);
          
          System.out.println("=====Event Date " + date + "=========");
          System.out.println("=====Event Day " + date.getDay() + "=========");            
                    
          
        }
	}*/
}