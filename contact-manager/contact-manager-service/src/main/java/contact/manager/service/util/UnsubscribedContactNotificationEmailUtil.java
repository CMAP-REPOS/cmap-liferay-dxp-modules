package contact.manager.service.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.StringWriter;
import java.util.List;
import java.util.Properties;

import javax.mail.internet.AddressException;
import javax.servlet.ServletContext;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import contact.constantcontact.util.UnsubscribedContact;

public class UnsubscribedContactNotificationEmailUtil
extends BaseEmailUtil {
	private static final Log _log = LogFactoryUtil.getLog(UnsubscribedContactNotificationEmailUtil.class);
	

	public static void buildAndSendEmail( List<UnsubscribedContact> unsubscribedContactList, ServletContext servletContext ) {
		if (_log.isInfoEnabled()) {
			_log.info(">> buildAndSendEmail");
		}
		
			
		VelocityWebApplicationResourceLoader.setServletContext(servletContext);

		Properties props = new Properties();
		props.setProperty("resource.loader", "webapp");
		props.setProperty("webapp.resource.loader.description", "Load from the ServletContext");
		props.setProperty("webapp.resource.loader.class", "contact.manager.service.util.VelocityWebApplicationResourceLoader");

		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.init(props);

		Template velocityTemplate = velocityEngine.getTemplate("/META-INF/unsub-email.vm");

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
}
