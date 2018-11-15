package contact.manager.service.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;

import org.osgi.service.component.annotations.Component;

@Component(
		property = {"cron.expression=0 0 2 * * ?"}, // Will run every day at 2am
		immediate = true,
		service = ConstantContactUpdatesMessageListener.class )
public class ConstantContactUpdatesMessageListener
extends ContactManagerBaseMessageListener {
	private static final Log _log = LogFactoryUtil.getLog(ConstantContactUpdatesMessageListener.class);

	
	/**
	 * doReceive: This method is called when the job is executed
	 * 
	 * @param message This is the message object sent to the job. The message will contain any data associated with the job.   
	 * @throws Exception
	 */
	@Override
	protected void doReceive(Message message) throws Exception {
		if (_log.isInfoEnabled()) {
			_log.info(">> doReceive ");
		}
		
		
		
		// TODO: Pull Constant Contact updates here.
		
		
		
		if (_log.isInfoEnabled()) {
			_log.info("<< doReceive ");
		}
	}
}
