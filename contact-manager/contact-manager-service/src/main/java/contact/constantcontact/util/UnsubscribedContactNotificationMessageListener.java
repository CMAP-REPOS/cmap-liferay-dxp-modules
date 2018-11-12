package contact.constantcontact.util;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.SchedulerEntryImpl;
import com.liferay.portal.kernel.scheduler.SchedulerException;
import com.liferay.portal.kernel.scheduler.StorageType;
import com.liferay.portal.kernel.scheduler.StorageTypeAware;
import com.liferay.portal.kernel.scheduler.Trigger;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.util.GetterUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import contact.constantcontact.ConstantContactConstants;
import contact.constantcontact.model.ContactApiModel;
import contact.constantcontact.model.EmailAddress;
import contact.constantcontact.service.ConstantContactService;
import contact.constantcontact.service.impl.ConstantContactServiceImpl;
import contact.manager.model.CrmContact;
import contact.manager.service.CrmContactLocalServiceUtil;

@Component(
		immediate = true,
		property = {"cron.expression=0 10 * * * ?"},
		service = UnsubscribedContactNotificationMessageListener.class )
public class UnsubscribedContactNotificationMessageListener
extends BaseMessageListener {

	// The default cron expression is set to every day at 11pm per requirement 3.1.1.
	private static final String _DEFAULT_CRON_EXPRESSION = "0 0 23 * * ?";

	private static final Log _log = LogFactoryUtil.getLog(UnsubscribedContactNotificationMessageListener.class);

	private ConstantContactService constantContactService;

	private volatile boolean _initialized;
	private TriggerFactory _triggerFactory;
	private SchedulerEngineHelper _schedulerEngineHelper;
	private SchedulerEntryImpl _schedulerEntryImpl = null;

	/**
	 * doReceive: This method is called whenever the job must be executed.
	 * 
	 * @param message This is the message object tied to the job. The message will contain any data associated with the job.   
	 * @throws Exception
	 */
	@Override
	protected void doReceive(Message message) throws Exception {

		_log.info("UnsubscribedContactNotificationMessageListener doReceive - Job being executed...");
		
		List<UnsubscribedContact> unsubscribedContactList = new ArrayList<UnsubscribedContact>();

		// get list of VIPs from DB
		try {
			List<CrmContact> contactList = CrmContactLocalServiceUtil.findByVipFlag(true);

			if (contactList != null && !contactList.isEmpty()) {
				for (CrmContact contactListItem : contactList) {
					ContactApiModel constantContactContact = getConstantContactService().getContactByEmailAndContactStatus(contactListItem.getPrimaryEmailAddress(), ConstantContactConstants.CONTACT_STATUS_OPTOUT, 500);

					if (constantContactContact != null) {
						
						Date unsubscribeDate = null;
						
						List<EmailAddress> emailAddressList = constantContactContact.getEmailAddresses();
						if (emailAddressList != null && !emailAddressList.isEmpty()) {
							EmailAddress emailAddress = emailAddressList.get(0);
							if (null != emailAddress && null != emailAddress.getOptOutDate() ) {
								unsubscribeDate = ConstantContactUtil.parseIsoDate( emailAddress.getOptOutDate() );
							}
						}

						UnsubscribedContact unsubscribedContact = new UnsubscribedContact( constantContactContact.getId(), contactListItem.getPrimaryEmailAddress(), unsubscribeDate ); 

						unsubscribedContactList.add(unsubscribedContact);
					}
				}
			}

		} catch (SystemException ex) {
			_log.error("Exception in UnsubscribedContactNotificationMessageListener - " + ex.getMessage(), ex);
		}

		if (unsubscribedContactList.isEmpty()) {
			_log.info("UnsubscribedContactNotificationMessageListener: No VIP unsubscribed.");
		}
		
		
		//TODO: Send email to contacts in unsubscribedContactList.		
	}

	/**
	 * activate: This method is called whenever the configuration for the component changes.
	 * 
	 * @param properties Properties map from Config Admin.
	 * @throws SchedulerException
	 */
	@Activate
	@Modified
	protected void activate(Map<String,Object> properties) throws SchedulerException {

		String cronExpression = GetterUtil.getString(properties.get("cron.expression"), _DEFAULT_CRON_EXPRESSION);

		// Create a new trigger definition for the job.
		String listenerClass = getClass().getName();
		Trigger jobTrigger = _triggerFactory.createTrigger(listenerClass, listenerClass, new Date(), null, cronExpression);

		// Wrap the current scheduler entry in a new wrapper.
		_schedulerEntryImpl = new SchedulerEntryImpl();
		_schedulerEntryImpl.setEventListenerClass( getClass().getName() );
		_schedulerEntryImpl.setTrigger( jobTrigger );
		
		_schedulerEntryImpl = new StorageTypeAwareSchedulerEntryImpl(_schedulerEntryImpl, StorageType.PERSISTED);

		// Update trigger for the scheduled job.
		_schedulerEntryImpl.setTrigger(jobTrigger);

		// If initialized, deactivate first the current job
		if (_initialized) {
			deactivate();
		}

		// Register the job
		_schedulerEngineHelper.register(this, _schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);
		_initialized = true;
	}

	/**
	 * deactivate: Called when OSGi is deactivating the component.
	 */
	@Deactivate
	protected void deactivate() {
		// if we previously were initialized
		if (_initialized) {
			// unschedule the job so it is cleaned up
			try {
				_schedulerEngineHelper.unschedule(_schedulerEntryImpl, getStorageType());
			} catch (SchedulerException se) {
				if (_log.isWarnEnabled()) {
					_log.warn("Unable to unschedule trigger", se);
				}
			}

			// unregister this listener
			_schedulerEngineHelper.unregister(this);
		}

		// clear the initialized flag
		_initialized = false;
	}

	/**
	 * getStorageType: Utility method to get the storage type from the scheduler entry wrapper.
	 * @return StorageType The storage type to use.
	 */
	protected StorageType getStorageType() {
		if (_schedulerEntryImpl instanceof StorageTypeAware) {
			return ((StorageTypeAware) _schedulerEntryImpl).getStorageType();
		}

		return StorageType.MEMORY_CLUSTERED;
	}

	/**
	 * setModuleServiceLifecycle: Called to determine if the component should be initialized only after the portal has completed its startup.
	 * 
	 * @param moduleServiceLifecycle
	 */
	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle(ModuleServiceLifecycle moduleServiceLifecycle) {
	}

	@Reference(unbind = "-")
	protected void setTriggerFactory(TriggerFactory triggerFactory) {
		_triggerFactory = triggerFactory;
	}

	@Reference(unbind = "-")
	protected void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) {
		_schedulerEngineHelper = schedulerEngineHelper;
	}

	/**
	 * @return the constantContactService
	 */
	public ConstantContactService getConstantContactService() {
		if (constantContactService == null) {
			constantContactService = new ConstantContactServiceImpl();
		}
		return constantContactService;
	}
}
