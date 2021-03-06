package contact.manager.service.util;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.PropsUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import contact.constantcontact.util.UpdatedContact;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmContactAuditLog;
import contact.manager.service.CrmContactAuditLogLocalServiceUtil;
import contact.manager.service.CrmContactLocalServiceUtil;

@Component(
//		property = {"cron.expression=0 0 * * * ?"}, // Running every hour. Part of Outage test.
		property = {"cron.expression=0 0 14 ? * MON"}, // Every Monday at 2pm UTC (8am Central Standard) ** this is the one
//		property = {"cron.expression=0 0 20 * * ?"}, // Every day at 8pm UTC (3pm Central Daylight)
		immediate = true,
		service = UpdatedContactNotificationMessageListener.class )
public class UpdatedContactNotificationMessageListener
extends ContactManagerBaseMessageListener {
	private static final Log _log = LogFactoryUtil.getLog(UpdatedContactNotificationMessageListener.class);
	private static final String _ARTIFACT_BUILD_VERSION = "UpdatedContactNotificationMessageListener build 20190625";

	@Reference(unbind = "-")
	public void setTriggerFactory(TriggerFactory triggerFactory) { _triggerFactory = triggerFactory; }

	@Reference(unbind = "-")
	public void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) { _schedulerEngineHelper = schedulerEngineHelper; }

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle( ModuleServiceLifecycle moduleServiceLifecycle ) { }

	@Activate
	@Modified
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
	public void doReceive(Message message) throws Exception {
		if (_log.isTraceEnabled()) {
			_log.trace(">> doReceive ");
		}

		if ( !PropsUtil.contains(ContactNotificationConstants.UPDATES_NOTIFICATION_ENABLED ) 
			|| !PropsUtil.get(ContactNotificationConstants.UPDATES_NOTIFICATION_ENABLED).equalsIgnoreCase("true") ) {
				
			if (_log.isWarnEnabled()) {
				_log.warn("doReceive aborted because " + ContactNotificationConstants.UPDATES_NOTIFICATION_ENABLED + " is set to false");
			}
		
			if (_log.isTraceEnabled()) {
				_log.trace("<< doReceive ");
			}
			return;
		}

		
        Date lastWeekDate = new Date(System.currentTimeMillis() - 7 * 24 * 60 * 60 * 1000);
		if (_log.isDebugEnabled()) {
			_log.debug("Last week date: " + formatDate(lastWeekDate) );
		}

		// Get list of contacts added or updated
				
		Criterion criterion = RestrictionsFactoryUtil.or( RestrictionsFactoryUtil.gt("createDate",  lastWeekDate), RestrictionsFactoryUtil.gt("modifiedDate",  lastWeekDate) );
		DynamicQuery dynamicQuery = CrmContactAuditLogLocalServiceUtil.dynamicQuery(); // DynamicQueryFactoryUtil.forClass(CrmContactAuditLog.class, classLoader);
		dynamicQuery.add(criterion);
		List<CrmContactAuditLog> contactAuditLogList = CrmContactAuditLogLocalServiceUtil.dynamicQuery(dynamicQuery);
		
		if ( null != contactAuditLogList && !contactAuditLogList.isEmpty() ) {
			if (_log.isInfoEnabled()) {
				_log.info("Processing " + Integer.toString( contactAuditLogList.size() ) + " added or updated contacts");
			}

			List<UpdatedContact> updatedContactList = new ArrayList<UpdatedContact>();
			for (CrmContactAuditLog contactAuditLog : contactAuditLogList) {
				
				CrmContact contact = CrmContactLocalServiceUtil.getCrmContact( contactAuditLog.getCrmContactId() );
				User user = UserLocalServiceUtil.getUser( contactAuditLog.getUserId() );
				
				UpdatedContact updatedContact = new UpdatedContact();

				updatedContact.setCreateDate(  contactAuditLog.getCreateDate() );
				updatedContact.setModifiedDate( contactAuditLog.getModifiedDate() );
				updatedContact.setAction( contactAuditLog.getAction() );
				updatedContact.setContactId( contactAuditLog.getCrmContactId() );
				updatedContact.setFirstName( contact.getFirstName() );
				updatedContact.setLastName( contact.getLastName() );
				updatedContact.setPrimaryAddress1( contact.getPrimaryAddress1() );
				updatedContact.setPrimaryAddressCity( contact.getPrimaryAddressCity() );
				updatedContact.setPrimaryAddressState( contact.getPrimaryAddressState() );
				updatedContact.setPrimaryAddressZip( contact.getPrimaryAddressZip() );
				updatedContact.setPrimaryEmailAddress( contact.getPrimaryEmailAddress() );
				updatedContact.setPrimaryPhone( contact.getPrimaryPhone()) ;
				updatedContact.setUserFirstName( user.getFirstName() );
				updatedContact.setUserLastName( user.getLastName() );
				
				updatedContactList.add( updatedContact );
				
				if (_log.isDebugEnabled()) {
					_log.debug("Contact " + updatedContact.getPrimaryEmailAddress() + " created on " + formatDate(updatedContact.getCreateDate()) + " modified on " + formatDate(updatedContact.getModifiedDate()) );
				}
			}
			
			final String from = PropsUtil.get(ContactNotificationConstants.EMAIL_FROM_ADDRESS); // "cmap@cmap1pas2.illinois.gov";
			final String to = PropsUtil.get(ContactNotificationConstants.EMAIL_TO_ADDRESS); // "contactmanagers@cmap.illinois.gov"; // "cmap.contactmanagers@base22.com";
			final String cc[] = PropsUtil.getArray(ContactNotificationConstants.EMAIL_CC_ADDRESS); // {"kharris@cmap.illinois.gov", "SKane@cmap.illinois.gov"};
			final String subject = "CMAP - Contact Changes and Additions Alert";
			final String footer = _ARTIFACT_BUILD_VERSION + " " + PropsUtil.get(ContactNotificationConstants.ENVIRONMENT_NAME);

			if (_log.isDebugEnabled()) {
				_log.debug("Email properties:\nFrom: " + (null != from ? from : "null") + "; to: " + ( null != to ? to : "null") + "; CC: " + ( null != cc ? String.join(", ", cc) : "null") );
			}
			
			if ( null != to && !to.trim().isEmpty() ) {
				UpdatedContactNotificationEmailUtil.buildAndSendEmail(from, to, cc, subject, updatedContactList, footer);
			}
			else if (_log.isWarnEnabled()) {
					_log.warn("Email will not be sent because there's no email address configured for the property " + ContactNotificationConstants.EMAIL_TO_ADDRESS);
			}
		}
		else {
			if (_log.isInfoEnabled()) {
				_log.info("No contacts added or updated");
			}
		}
		
		if (_log.isTraceEnabled()) {
			_log.trace("<< doReceive ");
		}
	}
}
