package contact.manager.service.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.SchedulerEntryImpl;
import com.liferay.portal.kernel.scheduler.SchedulerException;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.util.GetterUtil;

import java.util.Map;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import contact.constantcontact.service.ConstantContactService;
import contact.constantcontact.service.impl.ConstantContactServiceImpl;

public abstract class ContactManagerBaseMessageListener
extends BaseMessageListener {
	private static final Log _log = LogFactoryUtil.getLog(ContactManagerBaseMessageListener.class);

	protected static final String _CRON_EXPRESSION_PROPERTY_KEY = "cron.expression";
	protected static final String _CRON_EXPRESSION_DEFAULT_VALUE = "0 0 2 * * ?"; // Default is to run every day at 2am

	protected volatile boolean _initialized;
	
	protected TriggerFactory _triggerFactory;
	protected SchedulerEngineHelper _schedulerEngineHelper;
	protected SchedulerEntryImpl _schedulerEntryImpl = null;
	protected ServletContext _servletContext;
	protected ConstantContactService _constantContactService;

	
	@Reference(unbind = "-")
	protected void setTriggerFactory(TriggerFactory triggerFactory) {
		_triggerFactory = triggerFactory;
	}

	@Reference(unbind = "-")
	protected void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) {
		_schedulerEngineHelper = schedulerEngineHelper;
	}

	@Reference(target = "(osgi.web.symbolicname=com.liferay.filesystemaccess.web)", unbind = "-")
	public void setServletContext(ServletContext servletContext) {
		_servletContext = servletContext;
	}

	public ConstantContactService getConstantContactService() {
		if (_constantContactService == null) {
			_constantContactService = new ConstantContactServiceImpl();
		}
		return _constantContactService;
	}
	

	/**
	 * target = ModuleServiceLifecycle.PORTAL_INITIALIZED indicates the component should be initialized only after the portal has completed its startup.
	 */
	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle(ModuleServiceLifecycle moduleServiceLifecycle) { }

	/**
	 * activate: This method is called whenever the configuration for the component changes.
	 * 
	 * @param properties Properties map from Config Admin.
	 * @throws SchedulerException
	 */
	@Activate
	@Modified
	protected void activate(Map<String,Object> properties) throws SchedulerException {
		if (_log.isInfoEnabled()) {
			_log.info(">> activate " + this.getClass().getName() );
		}

		
		// If initialized, deactivate first the current job
		if (_initialized) {
			deactivate();
		}
		
		String eventListenerClassName = getClass().getName();
		String cronExpression = GetterUtil.getString(properties.get(_CRON_EXPRESSION_PROPERTY_KEY), _CRON_EXPRESSION_DEFAULT_VALUE);

		_schedulerEntryImpl = MessageListenerUtil.provisionSchedulerEntryImpl(_triggerFactory, eventListenerClassName, cronExpression);
		_schedulerEngineHelper.register(this, _schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);

		_initialized = true;
		
		
		if (_log.isInfoEnabled()) {
			_log.info("<< activate " + this.getClass().getName() );
		}
	}

	/**
	 * deactivate: Called when OSGi is deactivating the component.
	 */
	@Deactivate
	protected void deactivate() {
		if (_log.isInfoEnabled()) {
			_log.info(">> deactivate " + this.getClass().getName() );
		}

		if (_initialized) {
			try {
				_schedulerEngineHelper.unschedule(_schedulerEntryImpl, MessageListenerUtil.getStorageType(_schedulerEntryImpl));
				_schedulerEngineHelper.unregister(this);
				_initialized = false;
			}
			catch (SchedulerException se) {
				if (_log.isErrorEnabled()) {
					_log.error("Unable to unschedule scheduler entry " + this.getClass().getName(), se);
				}
			}
		}
		
		if (_log.isInfoEnabled()) {
			_log.info("<< deactivate " + this.getClass().getName() );
		}
	}	
}
