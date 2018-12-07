package contact.manager.service.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import javax.mail.internet.AddressException;

import contact.constantcontact.util.UpdatedContact;

public class UpdatedContactNotificationEmailUtil
extends BaseEmailUtil {
	private static final Log _log = LogFactoryUtil.getLog(UpdatedContactNotificationEmailUtil.class);

	public static void buildAndSendEmail( String from, String to, String cc[], String subject, List<UpdatedContact> updatedContactList ) {
		if (_log.isTraceEnabled()) {
			_log.trace(">> buildAndSendEmail");
		}
		StringBuilder sb = new StringBuilder(_EMAIL_BODY_HEADER);
		for (UpdatedContact updatedContact : updatedContactList) {
			sb.append("<tr><td class=\"tg-yw4l\">").append( null != updatedContact.getCreateDate() ? _simpleDateFormatter.format( updatedContact.getCreateDate() ) : " " ).append("</td>\n");
			sb.append("<td class=\"tg-yw4l\">").append( null != updatedContact.getModifiedDate() ? _simpleDateFormatter.format( updatedContact.getModifiedDate() ) : " " ).append("</td>\n");
			sb.append("<td class=\"tg-yw4l\">").append( updatedContact.getAction() ).append("</td>\n");
			sb.append("<td class=\"tg-yw4l\">").append( updatedContact.getContactId() ).append("</td>\n");
			sb.append("<td class=\"tg-yw4l\">").append( updatedContact.getUserFirstName() ).append(" ").append( updatedContact.getUserLastName() ).append("</td>\n");
			sb.append("<td class=\"tg-yw4l\">").append( updatedContact.getFirstName() ).append(" ").append( updatedContact.getLastName() ).append("</td>\n");
			sb.append("<td class=\"tg-yw4l\">").append( updatedContact.getPrimaryAddress1() ).append("</td>\n");
			sb.append("<td class=\"tg-yw4l\">").append( updatedContact.getPrimaryAddressCity() ).append("</td>\n");
			sb.append("<td class=\"tg-yw4l\">").append( updatedContact.getPrimaryAddressState() ).append("</td>\n");
			sb.append("<td class=\"tg-yw4l\">").append( updatedContact.getPrimaryAddressZip() ).append("</td>\n");
			sb.append("<td class=\"tg-yw4l\">").append( updatedContact.getPrimaryPhone() ).append("</td>\n");
			sb.append("<td class=\"tg-yw4l\">").append( updatedContact.getPrimaryEmailAddress() ).append("</td></tr>\n");
		}
		sb.append(_EMAIL_BODY_FOOTER);
		
		if (_log.isDebugEnabled()) {
			_log.debug("Email message body:\n" + sb.toString() + "\n\n");
		}

		try {
			sendEmail(from, to, cc, subject, sb.toString(), true);
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
			+ "<div class=\"info-text\">The following contacts have been changed or added during the last week:</div><br>\n"
			+ "<table class=\"tg\"><tr><th class=\"tg-yw4l\">Created</th><th class=\"tg-yw4l\">Modified</th><th class=\"tg-yw4l\">Action</th><th class=\"tg-yw4l\">Contact ID</th><th class=\"tg-yw4l\">User Name</th><th class=\"tg-yw4l\">Contact Name</th><th class=\"tg-yw4l\">Primary Address</th><th class=\"tg-yw4l\">Primary Address City</th><th class=\"tg-yw4l\">Primary Address State</th><th class=\"tg-yw4l\">Primary Address Zip</th><th class=\"tg-yw4l\">Primary Phone</th><th class=\"tg-yw4l\">Primary Email Address</th></tr>\n";
	private static final String _EMAIL_BODY_FOOTER = "</table></body></html>";
}
