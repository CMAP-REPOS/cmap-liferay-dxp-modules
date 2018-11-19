package contact.manager.service.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.SchedulerEntry;
import com.liferay.portal.kernel.scheduler.SchedulerEntryImpl;
import com.liferay.portal.kernel.scheduler.TimeUnit;
import com.liferay.portal.kernel.scheduler.Trigger;
import com.liferay.portal.kernel.scheduler.TriggerFactory;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

//@Component( immediate = true, service = MyMessageListener.class )
public class MyMessageListener
extends BaseMessageListener{
	private static final Log _log = LogFactoryUtil.getLog(MyMessageListener.class);
	
	protected TriggerFactory _triggerFactory;
	protected SchedulerEngineHelper _schedulerEngineHelper;

	@Reference(unbind = "-")
	protected void setTriggerFactory(TriggerFactory triggerFactory) { _triggerFactory = triggerFactory; }

	@Reference(unbind = "-")
	protected void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) { _schedulerEngineHelper = schedulerEngineHelper; }

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle( ModuleServiceLifecycle moduleServiceLifecycle ) { }
	
	
	@Override
	protected void doReceive(Message message) throws Exception {
		_log.info(">> doReceive " + this.getClass().getName() );

		_log.info("<< doReceive " + this.getClass().getName() );
	}

	@Activate
	protected void activate(Map<String, Object> properties) {
		if (_log.isInfoEnabled()) {
			_log.info(">> activate " + this.getClass().getName() );
		}

		Class<?> clazz = getClass();
		String className = clazz.getName();
		Trigger trigger = _triggerFactory.createTrigger( className, className, null, null, 5, TimeUnit.MINUTE);

		SchedulerEntryImpl schedulerEntryImpl = new SchedulerEntryImpl();
		schedulerEntryImpl.setEventListenerClass( className );
		schedulerEntryImpl.setTrigger( trigger );
		
		SchedulerEntry schedulerEntry = schedulerEntryImpl;
		
		_schedulerEngineHelper.register( this, schedulerEntry, DestinationNames.SCHEDULER_DISPATCH);


		if (_log.isInfoEnabled()) {
			_log.info("<< activate " + this.getClass().getName() );
		}
	}
	
	@Deactivate
	protected void deactivate() {
		if (_log.isInfoEnabled()) {
			_log.info(">> deactivate " + this.getClass().getName() );
		}
		
		_schedulerEngineHelper.unregister(this);
		
		if (_log.isInfoEnabled()) {
			_log.info("<< deactivate " + this.getClass().getName() );
		}
	}
}
