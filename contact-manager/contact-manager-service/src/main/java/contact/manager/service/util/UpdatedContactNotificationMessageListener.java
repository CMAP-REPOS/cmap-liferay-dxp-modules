package contact.manager.service.util;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

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
		property = {"cron.expression=0 0 14 * * ?"}, // Every day at 2pm UTC (8am Central)
		// property = {"cron.expression=0 0 14 * * MON"}, // Every Monday at 2pm UTC (8am Central)
		immediate = true,
		service = UpdatedContactNotificationMessageListener.class )
public class UpdatedContactNotificationMessageListener
extends ContactManagerBaseMessageListener {
	private static final Log _log = LogFactoryUtil.getLog(UpdatedContactNotificationMessageListener.class);

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

		
        Date lastWeekDate = new Date(System.currentTimeMillis() - 7 * 24 * 60 * 60 * 1000);
		if (_log.isDebugEnabled()) {
			_log.debug("Last week date: " + formatDate(lastWeekDate) );
		}

		// Get list of contacts added or updated
		Criterion criterion = RestrictionsFactoryUtil.or( RestrictionsFactoryUtil.gt("createDate",  lastWeekDate), RestrictionsFactoryUtil.gt("modifiedDate",  lastWeekDate) );
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(CrmContactAuditLog.class);
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
			
			UpdatedContactNotificationEmailUtil.buildAndSendEmail(updatedContactList);
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
