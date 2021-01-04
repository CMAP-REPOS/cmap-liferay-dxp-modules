package com.cmap.portlets.custom.calendarweb.form.portlet;

import com.cmap.portlets.custom.calendarweb.form.constants.CalendarWebFormPortletKeys;
import com.liferay.expando.kernel.model.ExpandoValue;
import com.liferay.expando.kernel.service.ExpandoValueLocalServiceUtil;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author jon
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=CMAP",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Calendar Web Form",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CalendarWebFormPortletKeys.CalendarWebForm,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CalendarWebFormPortlet extends MVCPortlet {

	private static Log _log = LogFactoryUtil.getLog(CalendarWebFormPortlet.class);

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		String command = ParamUtil.getString(resourceRequest, "cmd");

		if (command.equals("emailEventResource")) {
			String result = "success";
			String fromEmail = ParamUtil.getString(resourceRequest, "fromEmail");
			String toEmail = ParamUtil.getString(resourceRequest, "toEmail");
			String title = ParamUtil.getString(resourceRequest, "title");
			String date = ParamUtil.getString(resourceRequest, "date");
			String time = ParamUtil.getString(resourceRequest, "time");
			String location = ParamUtil.getString(resourceRequest, "location");
			String link = ParamUtil.getString(resourceRequest, "link");

			if (Validator.isEmailAddress(fromEmail) && Validator.isEmailAddress(toEmail)) {
				result = sendEventEmail(fromEmail, toEmail, title, date, time, location, link);
			} else {
				result = "failure";
			}

			try {
				PrintWriter writer = resourceResponse.getWriter();
				writer.write(result);
				writer.close();
			} catch (IOException ex) {
				_log.error("Exception in EventsListPortlet.serveResource: " + ex.getMessage(), ex);
			}
		}
		
		if (command.equals("eventLinkResource")) {
			
			String link = StringPool.BLANK;
			long calendarBookingId = ParamUtil.getLong(resourceRequest, "calendarBookingId");
			ExpandoValue linkExpandoValue = ExpandoValueLocalServiceUtil.getValue(10154,
					"com.liferay.calendar.model.CalendarBooking", "CUSTOM_FIELDS", "Link", calendarBookingId);
			
			try {
				link  = linkExpandoValue.getString();
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				PrintWriter writer = resourceResponse.getWriter();
				writer.write(link);
				writer.close();
			} catch (IOException ex) {
				_log.error("Exception in EventsListPortlet.serveResource: " + ex.getMessage(), ex);
			}
		}

		super.serveResource(resourceRequest, resourceResponse);
	}

	protected String sendEventEmail(String fromEmail, String toEmail, String title, String date, String time,
			String location, String link) {

		// You've been sent an event announcement from the Chicago Metropolitan
		// Agency for Planning event calendar.
		//
		// From: hello@workstate.com
		//
		// Event Name: CMAP Environment and Natural Resources Committee
		//
		// Event Date: 10/05/2017
		//
		// Duration: 09:30 AM - 11:30 AM
		//
		// Type: CMAP Events
		//
		// Location: 233 S. Wacker Dr., Suite 800, Chicago
		//
		// Link:
		// http://www.cmap.illinois.gov/about/involvement/committees/working-committees/environment-and-natural-resources/minutes

		String emailBody = StringPool.BLANK;
		String result = "success";

		try {
			StringBuilder sb = new StringBuilder();
			sb.append(
					"<p>You've been sent an event announcement from the Chicago Metropolitan Agency for Planning event calendar.");
			sb.append("</p>");
			sb.append("<p>From: ");
			sb.append(fromEmail);
			sb.append("</p>");
			sb.append("<p>Event Name: ");
			sb.append(title);
			sb.append("</p>");
			sb.append("<p>Event Date: ");
			sb.append(date);
			sb.append("</p>");
			sb.append("<p>Event Time: ");
			sb.append(time);
			sb.append("</p>");
			sb.append("<p>Location: ");
			sb.append(location);
			sb.append("</p>");
			if (!link.isEmpty()) {
				sb.append("<p>Link: ");
				sb.append(link);
				sb.append("</p>");
			}
			emailBody = sb.toString();
		} catch (Exception ex) {
			_log.error("Exception in EventsListPortlet.sendEventEmail: " + ex.getMessage(), ex);
		}

		InternetAddress fromAddress = null;
		InternetAddress toAddress = null;

		try {
			fromAddress = new InternetAddress(fromEmail);
		} catch (AddressException ex) {
			_log.error("Exception in EventsListPortlet.sendEventEmail: " + ex.getMessage(), ex);
		}

		try {
			toAddress = new InternetAddress(toEmail);
		} catch (AddressException ex) {
			_log.error("Exception in EventsListPortlet.sendEventEmail: " + ex.getMessage(), ex);
		}

		if (fromAddress != null && toAddress != null) {

			MailMessage mailMessage = new MailMessage();
			mailMessage.setFrom(fromAddress);
			mailMessage.setTo(toAddress);
			mailMessage.setSubject("CMAP EVENT - " + title);
			mailMessage.setBody(emailBody);
			mailMessage.setHTMLFormat(true);

			MailServiceUtil.sendEmail(mailMessage);
			
		} else {
			result = "failure";
		}

		return result;
	}
}