package contact.manager.service.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.SchedulerEntryImpl;
import com.liferay.portal.kernel.scheduler.SchedulerException;
import com.liferay.portal.kernel.scheduler.StorageType;
import com.liferay.portal.kernel.scheduler.StorageTypeAware;
import com.liferay.portal.kernel.scheduler.Trigger;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.util.GetterUtil;

import java.util.Date;
import java.util.Map;

import javax.servlet.ServletContext;

import contact.constantcontact.service.ConstantContactService;
import contact.constantcontact.service.impl.ConstantContactServiceImpl;

public abstract class ContactManagerBaseMessageListener
extends BaseMessageListener {
	private static final Log _log = LogFactoryUtil.getLog(ContactManagerBaseMessageListener.class);

	protected static final String _CRON_EXPRESSION_PROPERTY_KEY = "cron.expression";
	protected static final String _CRON_EXPRESSION_DEFAULT_VALUE = "0 */5 * * * ?"; // "0 0 2 * * ?"; // Default is to run every day at 2am

	protected volatile boolean _initialized;
	
	protected TriggerFactory _triggerFactory;
	protected SchedulerEngineHelper _schedulerEngineHelper;
	protected SchedulerEntryImpl _schedulerEntryImpl = null;
	protected ServletContext _servletContext;
	protected ConstantContactService _constantContactService;

	public ConstantContactService getConstantContactService() {
		if (_constantContactService == null) {
			_constantContactService = new ConstantContactServiceImpl();
		}
		return _constantContactService;
	}
	

	/**
	 * activate: This method is called whenever the configuration for the component changes.
	 * 
	 * @param properties Properties map from Config Admin.
	 * @throws SchedulerException
	 */
	protected void activate(Map<String,Object> properties) throws SchedulerException {
		if (_log.isInfoEnabled()) {
			_log.info(">> activate " + this.getClass().getName() );
		}
		System.out.println(">> activate " + this.getClass().getName()); // TODO Remove
	
		
		// If initialized, deactivate first the current job
		if (_initialized) {
			deactivate();
		}
		
		String eventListenerClassName = getClass().getName();
		String cronExpression = GetterUtil.getString(properties.get(_CRON_EXPRESSION_PROPERTY_KEY), _CRON_EXPRESSION_DEFAULT_VALUE);

		// Create a new trigger definition for the job
		Trigger jobTrigger = _triggerFactory.createTrigger(eventListenerClassName, eventListenerClassName, new Date(), null, cronExpression);

		SchedulerEntryImpl schedulerEntryImpl = new SchedulerEntryImpl();
		schedulerEntryImpl.setEventListenerClass( eventListenerClassName );
		schedulerEntryImpl.setTrigger( jobTrigger );
		
		// Wrap the current scheduler entry in a new storage type aware entry
		schedulerEntryImpl = new StorageTypeAwareSchedulerEntryImpl(schedulerEntryImpl, StorageType.PERSISTED);
		schedulerEntryImpl.setTrigger( jobTrigger );
		
		_schedulerEntryImpl = schedulerEntryImpl;
		_schedulerEngineHelper.register(this, _schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);

		_initialized = true;
		
		
		if (_log.isInfoEnabled()) {
			_log.info("<< activate " + this.getClass().getName() );
		}
		System.out.println("<< activate " + this.getClass().getName()); // TODO Remove
	}

	/**
	 * deactivate: Called when OSGi is deactivating the component.
	 */
	protected void deactivate() {
		if (_log.isInfoEnabled()) {
			_log.info(">> deactivate " + this.getClass().getName() );
		}
		System.out.println(">> deactivate " + this.getClass().getName()); // TODO Remove

		if (_initialized) {
			try {
				_schedulerEngineHelper.unschedule(_schedulerEntryImpl, getStorageType());
				_schedulerEngineHelper.unregister(this);
				_initialized = false;
			}
			catch (SchedulerException se) {
				if (_log.isErrorEnabled()) {
					_log.error("Unable to unschedule scheduler entry " + this.getClass().getName(), se);
					System.out.println("Unable to unschedule scheduler entry "+ this.getClass().getName()); // TODO Remove
				}
			}
		}
		
		if (_log.isInfoEnabled()) {
			_log.info("<< deactivate " + this.getClass().getName() );
		}
		System.out.println("<< deactivate " + this.getClass().getName()); // TODO Remove
	}	

	/**
	 * getStorageType: Utility method to get the storage type from the scheduler
	 * entry wrapper.
	 * 
	 * @return StorageType The storage type to use.
	 */
	protected StorageType getStorageType() {
		if (_schedulerEntryImpl instanceof StorageTypeAware) {
			return ((StorageTypeAware) _schedulerEntryImpl).getStorageType();
		}

		return StorageType.MEMORY_CLUSTERED;
	}
}
