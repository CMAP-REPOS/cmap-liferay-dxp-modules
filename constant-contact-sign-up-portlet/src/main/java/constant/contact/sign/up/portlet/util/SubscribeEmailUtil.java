package constant.contact.sign.up.portlet.util;

import javax.mail.internet.AddressException;

public class SubscribeEmailUtil extends BaseEmailUtil {
		public static void buildAndSendEmail( String from, String to, String cc[], String subject, String footer ) {
			StringBuilder sb = new StringBuilder(_EMAIL_BODY_HEADER);
			//sb.append(_EMAIL_CONTENT_HEADER);
			
			sb.append(_EMAIL_CONTENT_FOOTER);
			if (null != footer) {
				sb.append("<div class=\"foo\">").append(footer).append("</div>");
			}
			sb.append(_EMAIL_BODY_FOOTER);
			
			try {
				sendEmail(from, to, null != cc ? cc : null, subject, sb.toString(), true);
			}
			catch (AddressException ex) {
				
			}		
		}
		
		private static final String _EMAIL_BODY_HEADER = "<html><body><style type=\"text/css\">\n"
				+ ".info-text {font-family:Arial, sans-serif;font-size:1rempx;}\n"
				+ ".foo{font-family:Arial, sans-serif;font-size:1rem;font-weight:normal;}\n"
				+ "</style>\n";
		private static final String _EMAIL_CONTENT_HEADER = "<div class=\"info-text\">Dear subscriber:</div><br>\n";
		private static final String _EMAIL_CONTENT_FOOTER = "<br><br>\n";
		private static final String _EMAIL_BODY_FOOTER = "\n</body></html>";

	}
