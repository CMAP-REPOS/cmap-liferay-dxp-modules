package contact.manager.service.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TriggerFactory;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(
		property = {"cron.expression=0 0 8 * * ?"}, // Will run every day at 2am. To run it every hour use: '0 0 * * * ?'. For every 5 minutes, use:'0 */5 * * * ?'. 
		immediate = true,
		service = ConstantContactUpdatesMessageListener.class )
public class ConstantContactUpdatesMessageListener
extends ContactManagerBaseMessageListener {
	private static final Log _log = LogFactoryUtil.getLog(ConstantContactUpdatesMessageListener.class);

	@Reference(unbind = "-")
	public void setTriggerFactory(TriggerFactory triggerFactory) { _triggerFactory = triggerFactory; }

	@Reference(unbind = "-")
	public void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) { _schedulerEngineHelper = schedulerEngineHelper; }

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle( ModuleServiceLifecycle moduleServiceLifecycle ) { }

	@Activate
	@Override
	protected void activate(Map<String,Object> properties) { super.activate(properties); }

	@Deactivate
	@Override
	protected void deactivate() { super.deactivate(); }	

	
	
	/**
	 * doReceive: This method is called when the job is executed
	 * 
	 * @param message This is the message object sent to the job. The message will contain any data associated with the job.   
	 * @throws Exception
	 */
	@Override
	protected void doReceive(Message message) throws Exception {
		_log.info(">> doReceive ");
		
		
		
		// TODO: Pull Constant Contact updates here.
		
		
		
		_log.info("<< doReceive ");
	}
}
