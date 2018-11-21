package contact.manager.service.util;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.text.SimpleDateFormat;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public abstract class BaseEmailUtil {
	private static final Log _log = LogFactoryUtil.getLog(BaseEmailUtil.class);
	protected static final SimpleDateFormat _simpleDateFormatter = new SimpleDateFormat("MM/dd/yyyy");

	
	protected static void sendEmail(String from, String to, String cc, String subject, String body, Boolean isHTMLFormat) throws AddressException {
		if (_log.isTraceEnabled()) {
			_log.trace(">> sendEmail");
		}
		
		InternetAddress fromAddress = new InternetAddress(from);
		InternetAddress toAddress = new InternetAddress(to);
		InternetAddress ccAddress = null != cc ? new InternetAddress(cc) : null;

		MailMessage mailMessage = new MailMessage();
		
		mailMessage.setTo(toAddress);
		
		if (null != ccAddress) {
			mailMessage.setCC(ccAddress);
		}
		
		mailMessage.setFrom(fromAddress);
		mailMessage.setSubject(subject);
		mailMessage.setBody(body);
		mailMessage.setHTMLFormat(isHTMLFormat);
		
		MailServiceUtil.sendEmail(mailMessage);

		if (_log.isTraceEnabled()) {
			_log.trace("<< sendEmail");
		}
	}
}
