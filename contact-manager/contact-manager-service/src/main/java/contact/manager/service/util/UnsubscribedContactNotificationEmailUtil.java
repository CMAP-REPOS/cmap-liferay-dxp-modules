package contact.manager.service.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import javax.mail.internet.AddressException;

import contact.constantcontact.util.UnsubscribedContact;

public class UnsubscribedContactNotificationEmailUtil
extends BaseEmailUtil {
	private static final Log _log = LogFactoryUtil.getLog(UnsubscribedContactNotificationEmailUtil.class);
	

	public static void buildAndSendEmail( String from, String to, String cc[], String subject, List<UnsubscribedContact> unsubscribedContactList, String emailFooter ) {
		if (_log.isTraceEnabled()) {
			_log.trace(">> buildAndSendEmail");
		}
		
		StringBuilder sb = new StringBuilder(_EMAIL_BODY_HEADER);
		sb.append(_EMAIL_CONTENT_HEADER);
		for( UnsubscribedContact unsubscribedContact : unsubscribedContactList ) {
			sb.append("<tr><td class=\"tg-yw4l\">").append( unsubscribedContact.getConstantContactActivityEmailAddress() ).append("</td>");
			sb.append("<td class=\"tg-yw4l\">").append( unsubscribedContact.isRemoved() ? "Removed by an administrator" : "Unsubscribed" ).append("</td>");
			sb.append("<td class=\"tg-yw4l\">").append( null != unsubscribedContact.getConstantContactActivityUnsubscribeDate() ? _simpleDateFormatter.format( unsubscribedContact.getConstantContactActivityUnsubscribeDate() ) : " " ).append("</td>");
			sb.append("<td class=\"tg-yw4l\">").append( unsubscribedContact.getConstantContactId() ).append("</td></tr>\n");
		}
		sb.append(_EMAIL_CONTENT_FOOTER);
		if (null != emailFooter) {
			sb.append("<div class=\"foo\">").append(emailFooter).append("</div>");
		}
		sb.append(_EMAIL_BODY_FOOTER);
		
		if (_log.isDebugEnabled()) {
			_log.debug("Email message body:\n" + sb.toString() + "\n\n");
		}

		try {
			sendEmail(from, to, null != cc ? cc : null, subject, sb.toString(), true);
		}
		catch (AddressException ex) {
			if (_log.isErrorEnabled()) {
				_log.error("Could not send email notification - " + ex.getMessage(), ex);
			}
		}

		
		if (_log.isTraceEnabled()) {
			_log.trace("<< buildAndSendEmail");
		}
	}
	
	private static final String _EMAIL_BODY_HEADER = "<html><body><style type=\"text/css\">\n"
			+ ".info-text {font-family:Arial, sans-serif;font-size:14px;}\n"
			+ ".tg  {border-collapse:collapse;border-spacing:0;}\n"
			+ ".tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;}\n"
			+ ".tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;}\n"
			+ ".tg .tg-lqy6{text-align:right;vertical-align:top}\n"
			+ ".tg .tg-yw4l{vertical-align:top}\n"
			+ ".foo{font-family:Arial, sans-serif;font-size:8px;font-weight:normal;}\n"
			+ "</style>\n";
	private static final String _EMAIL_CONTENT_HEADER = "<div class=\"info-text\">The following contacts marked as Important Subscribers have unsubscribed during the last day:</div><br>\n"
			+ "<table class=\"tg\"><tr><th class=\"tg-yw4l\">Email</th><th class=\"tg-yw4l\">Event</th><th class=\"tg-yw4l\">Unsubscription Date</th><th class=\"tg-yw4l\">ConstantContact ID</th></tr>\n";
	private static final String _EMAIL_CONTENT_FOOTER = "</table><br><br>\n";
	private static final String _EMAIL_BODY_FOOTER = "\n</body></html>";
}
