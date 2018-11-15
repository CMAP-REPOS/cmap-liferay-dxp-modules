package contact.manager.service.util;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public abstract class BaseEmailUtil {

	static void sendEmail(String from, String to, String cc, String subject, String body, Boolean isHTMLFormat) throws AddressException {
		
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
	}
}
