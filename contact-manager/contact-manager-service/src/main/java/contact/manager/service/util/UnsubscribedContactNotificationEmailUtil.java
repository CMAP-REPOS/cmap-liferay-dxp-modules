package contact.manager.service.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import javax.mail.internet.AddressException;
import javax.servlet.ServletContext;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeServices;
import org.apache.velocity.runtime.RuntimeSingleton;
import org.apache.velocity.runtime.parser.ParseException;

import contact.constantcontact.util.UnsubscribedContact;

public class UnsubscribedContactNotificationEmailUtil
extends BaseEmailUtil {
	private static final Log _log = LogFactoryUtil.getLog(UnsubscribedContactNotificationEmailUtil.class);
	

	public static void buildAndSendEmail( List<UnsubscribedContact> unsubscribedContactList, ServletContext servletContext ) {
		if (_log.isInfoEnabled()) {
			_log.info(">> buildAndSendEmail");
		}
		
		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.init();
		
		RuntimeServices runtimeServices = RuntimeSingleton.getRuntimeServices();
		StringReader reader = new StringReader(_TEMPLATE);
		Template velocityTemplate = new Template();
		velocityTemplate.setRuntimeServices(runtimeServices);
		try {
			velocityTemplate.setData(runtimeServices.parse(reader, "unsub-email.vm"));
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}

		velocityTemplate.initDocument();

		VelocityContext velocityContext = new VelocityContext();
		
		velocityContext.put("unsubRows", unsubscribedContactList);
		
		if ( null == unsubscribedContactList || unsubscribedContactList.isEmpty() ) {
			velocityContext.put("noVipsUnsub", true);
		} else {
			velocityContext.put("noVipsUnsub", false);
		}

		StringWriter stringWriter = new StringWriter();
		velocityTemplate.merge(velocityContext, stringWriter);
	
		try {
//			sendEmail("cmap@cmap1pas2.illinois.gov", "contactmanagers@cmap.illinois.gov", null, "CMAP - Contact Activity Alert VIP unsubscribe", stringWriter.toString(), true);
			sendEmail("cmap@cmap1pas2.illinois.gov", "cmap.contactmanagers@base22.com", null, "CMAP - Contact Activity Alert VIP unsubscribe", stringWriter.toString(), true);
		}
		catch (AddressException ex) {
			if (_log.isErrorEnabled()) {
				_log.error("Could not send email notification" + ex.getMessage(), ex);
			}
		}

		
		if (_log.isInfoEnabled()) {
			_log.info("<< buildAndSendEmail");
		}
	}
	
	private static final String _TEMPLATE = "<html><body><style type=\"text/css\">\n"
			+ ".info-text {font-family:Arial, sans-serif;font-size:14px;}\n"
			+ ".tg  {border-collapse:collapse;border-spacing:0;}\n"
			+ ".tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;}\n"
			+ ".tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;}\n"
			+ ".tg .tg-lqy6{text-align:right;vertical-align:top}\n"
			+ ".tg .tg-yw4l{vertical-align:top}\n"
			+ "</style>\n"
			+ "<div class=\"info-text\">\n"
			+ "  #if ( $noVipsUnsub )\n"
			+ "    No contacts marked as VIP have unsubscribed.\n"
			+ "  #else\n"
			+ "    The following contacts marked as VIP have unsubscribed:\n"
			+ "  #end\n"
			+ "</div><br>\n"
			+ "<table class=\"tg\"><tr><th class=\"tg-yw4l\">Email</th><th class=\"tg-yw4l\">Unsubscription Date</th><th class=\"tg-yw4l\">ConstantContact ID</th></tr>\n"
			+ "  #if ( $noVipsUnsub )\n"
			+ "  	<tr><td align=\"center\" colspan=\"3\" class=\"tg-yw4l\">No VIPs unsubscribed</td></tr>\n"
			+ "  #end\n"
			+ "  #foreach( $row in $unsubRows )\n"
			+ "    <tr><td class=\"tg-yw4l\">$row.email</td><td class=\"tg-yw4l\">$row.unsubDate</td><td class=\"tg-yw4l\">$row.constantContactId</td></tr>\n"
			+ "  #end\n"
			+ "</table></body></html>";
}
