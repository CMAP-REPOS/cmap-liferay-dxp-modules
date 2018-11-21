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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


import contact.constantcontact.service.ConstantContactService;
import contact.constantcontact.service.impl.ConstantContactServiceImpl;

public abstract class ContactManagerBaseMessageListener
extends BaseMessageListener {
	private static final Log _log = LogFactoryUtil.getLog(ContactManagerBaseMessageListener.class);

	protected static final String _CRON_EXPRESSION_PROPERTY_KEY = "cron.expression";
	protected static final String _CRON_EXPRESSION_DEFAULT_VALUE = "0 0 8 * * ?"; // Default is to run every day at 2am Central (8am UTC)

	private SimpleDateFormat _simpleDateFormatter = null;
	private SimpleDateFormat getSimpleDateFormatter() {
		if ( null == _simpleDateFormatter ) {
			_simpleDateFormatter = new SimpleDateFormat("MM/dd/yyyy");
		}
		return _simpleDateFormatter;
	}
	
	protected String formatDate(Date date) {
		if ( null == date ) {
			return "(null date)";
		}
		return getSimpleDateFormatter().format(date);
	}

	protected volatile boolean _initialized;
	
	protected TriggerFactory _triggerFactory;
	protected SchedulerEngineHelper _schedulerEngineHelper;
	protected SchedulerEntryImpl _schedulerEntryImpl = null;
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
	protected void activate(Map<String,Object> properties) {
		if (_log.isTraceEnabled()) {
			_log.trace(">> activate " + this.getClass().getName() );
		}
	
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
			_log.info("Message listener " + this.getClass().getSimpleName() + " has been activated - cron expression is: " + cronExpression);
		}

		if (_log.isTraceEnabled()) {
			_log.trace("<< activate " + this.getClass().getName() );
		}
	}

	/**
	 * deactivate: Called when OSGi is deactivating the component.
	 */
	protected void deactivate() {
		if (_log.isTraceEnabled()) {
			_log.trace(">> deactivate " + this.getClass().getName() );
		}
		
		if (_initialized) {
			try {
				_schedulerEngineHelper.unschedule(_schedulerEntryImpl, getStorageType());
				_schedulerEngineHelper.unregister(this);
				_schedulerEngineHelper.delete(_schedulerEntryImpl, getStorageType());
				_initialized = false;
				
				if (_log.isInfoEnabled()) {
					_log.info("Message listener " + this.getClass().getSimpleName() + " has been deactivated.");
				}
			}
			catch (SchedulerException se) {
				if (_log.isErrorEnabled()) {
					_log.error("Scheduler entry for message listener " + this.getClass().getSimpleName() + " could not be unscheduled, unregistered or deleted - ", se);
				}
			}
		}
		
		if (_log.isTraceEnabled()) {
			_log.trace("<< deactivate " + this.getClass().getName() );
		}
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
