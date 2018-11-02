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
		property = {"cron.expression=0 0 0 * * ?"},
		service = ConstantContactActivityAlertMessageListener.class )
public class ConstantContactActivityAlertMessageListener
extends BaseMessageListener {

	// the default cron expression is to run daily at midnight
	private static final String _DEFAULT_CRON_EXPRESSION = "0 0 0 * * ?";

	private static final Log _log = LogFactoryUtil.getLog(ConstantContactActivityAlertMessageListener.class);

	private ConstantContactService constantContactService;

	private volatile boolean _initialized;
	private TriggerFactory _triggerFactory;
	private SchedulerEngineHelper _schedulerEngineHelper;
	private SchedulerEntryImpl _schedulerEntryImpl = null;

	/**
	 * doReceive: This is where the magic happens, this is where you want to do the work for
	 * the scheduled job.
	 * @param message This is the message object tied to the job.  If you stored data with the
	 *                job, the message will contain that data.   
	 * @throws Exception In case there is some sort of error processing the task.
	 */
	@Override
	protected void doReceive(Message message) throws Exception {

		_log.info("Scheduled task executed...");
		
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
			_log.error("Exception in ContactActivityAlertsJob. " + ex.getMessage(), ex);
		}

		if (unsubscribedContactList.isEmpty()) {
			_log.info("ContactActivityAlertsJob: No VIP unsubscribed.");
		}
		
		
		//EmailUtil.sendUnsubEmail(emailRows);		
	}

	/**
	 * activate: Called whenever the properties for the component change (ala Config Admin)
	 * or OSGi is activating the component.
	 * @param properties The properties map from Config Admin.
	 * @throws SchedulerException in case of error.
	 */
	@Activate
	@Modified
	protected void activate(Map<String,Object> properties) throws SchedulerException {

		// extract the cron expression from the properties
		String cronExpression = GetterUtil.getString(properties.get("cron.expression"), _DEFAULT_CRON_EXPRESSION);

		// create a new trigger definition for the job.
		String listenerClass = getClass().getName();
		Trigger jobTrigger = _triggerFactory.createTrigger(listenerClass, listenerClass, new Date(), null, cronExpression);

		// wrap the current scheduler entry in our new wrapper.
		// use the persisted storaget type and set the wrapper back to the class field.
		_schedulerEntryImpl = new SchedulerEntryImpl();
		_schedulerEntryImpl.setEventListenerClass( getClass().getName() );
		_schedulerEntryImpl.setTrigger( jobTrigger );
		
		_schedulerEntryImpl = new StorageTypeAwareSchedulerEntryImpl(_schedulerEntryImpl, StorageType.PERSISTED);

		// update the trigger for the scheduled job.
		_schedulerEntryImpl.setTrigger(jobTrigger);

		// if we were initialized (i.e. if this is called due to CA modification)
		if (_initialized) {
			// first deactivate the current job before we schedule.
			deactivate();
		}

		// register the scheduled task
		_schedulerEngineHelper.register(this, _schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);

		// set the initialized flag.
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
	 * setModuleServiceLifecycle: So this requires some explanation...
	 * 
	 * OSGi will start a component once all of it's dependencies are satisfied.  However, there
	 * are times where you want to hold off until the portal is completely ready to go.
	 * 
	 * This reference declaration is waiting for the ModuleServiceLifecycle's PORTAL_INITIALIZED
	 * component which will not be available until, surprise surprise, the portal has finished
	 * initializing.
	 * 
	 * With this reference, this component activation waits until portal initialization has completed.
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
