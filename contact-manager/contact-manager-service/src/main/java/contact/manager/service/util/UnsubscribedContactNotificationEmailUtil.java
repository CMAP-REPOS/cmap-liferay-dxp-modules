package contact.manager.service.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import javax.mail.internet.AddressException;

import contact.constantcontact.util.UnsubscribedContact;

public class UnsubscribedContactNotificationEmailUtil
extends BaseEmailUtil {
	private static final Log _log = LogFactoryUtil.getLog(UnsubscribedContactNotificationEmailUtil.class);
	

	public static void buildAndSendEmail( List<UnsubscribedContact> unsubscribedContactList ) {
		if (_log.isTraceEnabled()) {
			_log.trace(">> buildAndSendEmail");
		}
		
		StringBuilder sb = new StringBuilder(_EMAIL_BODY_HEADER);
		for( UnsubscribedContact unsubscribedContact : unsubscribedContactList ) {
			sb.append("<tr><td class=\"tg-yw4l\">").append( unsubscribedContact.getConstantContactActivityEmailAddress() ).append("</td>");
			sb.append("<td class=\"tg-yw4l\">").append( null != unsubscribedContact.getConstantContactActivityUnsubscribeDate() ? _simpleDateFormatter.format( unsubscribedContact.getConstantContactActivityUnsubscribeDate() ) : " " ).append("</td>");
			sb.append("<td class=\"tg-yw4l\">").append( unsubscribedContact.getConstantContactId() ).append("</td></tr>\n");
		}
		sb.append(_EMAIL_BODY_FOOTER);
		
		if (_log.isDebugEnabled()) {
			_log.debug("Email message body:\n" + sb.toString() + "\n\n");
		}

		try {
			// TODO: Change email addresses for production
			//sendEmail("cmap@cmap1pas2.illinois.gov", "contactmanagers@cmap.illinois.gov", null, "CMAP - Contact Activity Alert VIP unsubscribe", sb.toString(), true);
			sendEmail("cmap@cmap1pas2.illinois.gov", "cmap.contactmanagers@base22.com", null, "CMAP - Contact Activity Alert VIP unsubscribe", sb.toString(), true);
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
			+ "</style>\n"
			+ "<div class=\"info-text\">The following contacts marked as VIP have unsubscribed during the last week:</div><br>\n"
			+ "<table class=\"tg\"><tr><th class=\"tg-yw4l\">Email</th><th class=\"tg-yw4l\">Unsubscription Date</th><th class=\"tg-yw4l\">ConstantContact ID</th></tr>\n";
	private static final String _EMAIL_BODY_FOOTER = "</table></body></html>";
}
