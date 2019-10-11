package constant.contact.sign.up.portlet.util;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public abstract class BaseEmailUtil {
	private static final Log _log = LogFactoryUtil.getLog(BaseEmailUtil.class);
	protected static final SimpleDateFormat _simpleDateFormatter = new SimpleDateFormat("MM/dd/yyyy");

	
	protected static void sendEmail(String from, String to, String[] ccArray, String subject, String body, Boolean isHTMLFormat) throws AddressException {
		if (_log.isTraceEnabled()) {
			_log.trace(">> sendEmail");
		}
		
		InternetAddress fromAddress = null != from ? new InternetAddress(from) : null;
		InternetAddress toAddress = null != to ? new InternetAddress(to) : null;
		
		InternetAddress ccAddressArray[] = null;
		
		if (null != ccArray) {
			List<InternetAddress> ccList = new ArrayList<InternetAddress>();
			for( String ccItem : ccArray ) {
				ccList.add( new InternetAddress( ccItem ) );
			}
			ccAddressArray = new InternetAddress[ ccList.size() ];
			ccAddressArray = ccList.toArray( ccAddressArray );
		}

		MailMessage mailMessage = new MailMessage();
		
		mailMessage.setTo(toAddress);
		
		if (null != ccAddressArray) {
			mailMessage.setCC(ccAddressArray);
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
