package contact.manager.service.util;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
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

import contact.constantcontact.ConstantContactConstants;
import contact.constantcontact.model.ContactApiModel;
import contact.constantcontact.model.EmailAddress;
import contact.constantcontact.util.ConstantContactUtil;
import contact.constantcontact.util.UnsubscribedContact;
import contact.manager.model.CrmContact;
import contact.manager.service.CrmContactLocalServiceUtil;

@Component(
//		property = {"cron.expression=0 0 * * * ?"}, // Running every hour. Part of Outage test.
		property = {"cron.expression=0 0 5 * * ?"}, // Every day at 5am UTC (11pm Central Standard) ** This is the one
//		property = {"cron.expression=0 0 20 * * ?"}, // Every day at 8pm UTC (3pm Central Daylight)
		immediate = true,
		service = UnsubscribedContactNotificationMessageListener.class )
public class UnsubscribedContactNotificationMessageListener
extends ContactManagerBaseMessageListener {
	private static final Log _log = LogFactoryUtil.getLog(UnsubscribedContactNotificationMessageListener.class);
	private static final String _ARTIFACT_BUILD_VERSION = "UnsubscribedContactNotificationMessageListener build 20190625";
	private static final Boolean _QUERY_REMOVED_CONTACTS = true;

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

		if ( !PropsUtil.contains(ContactNotificationConstants.UNSUBSCRIBED_VIP_NOTIFICATION_ENABLED) 
			|| !PropsUtil.get(ContactNotificationConstants.UNSUBSCRIBED_VIP_NOTIFICATION_ENABLED).equalsIgnoreCase("true") ) {
			
			if (_log.isWarnEnabled()) {
				_log.warn("doReceive aborted because " + ContactNotificationConstants.UNSUBSCRIBED_VIP_NOTIFICATION_ENABLED + " is set to false");
			}
		
			if (_log.isTraceEnabled()) {
				_log.trace("<< doReceive (early return) ");
			}
			return;
		}
		
		List<UnsubscribedContact> unsubscribedContactList = new ArrayList<UnsubscribedContact>();

		// get list of VIPs from DB
		try {
			List<CrmContact> contactList = CrmContactLocalServiceUtil.findByVipFlag(true);

			if (contactList != null && !contactList.isEmpty()) {
				
				if (_log.isDebugEnabled()) {
					StringBuilder sb = new StringBuilder("");
					for ( CrmContact contactItem : contactList )  {
						if (sb.length() > 0) {
							sb.append(", ");
						}
						sb.append( contactItem.getPrimaryEmailAddress() );
					}
					_log.debug("Processing " + Integer.toString( contactList.size() ) + " VIP contacts: " + sb.toString() );
				}
				else if (_log.isInfoEnabled()) {
					_log.info("Processing " + Integer.toString( contactList.size() ) + " VIP contacts...");
				}
				

		        Date yesterdayDate = new Date(System.currentTimeMillis() - 24 * 60 * 60 * 1000);
				if (_log.isDebugEnabled()) {
					_log.debug("Yesterday date: " + formatDate(yesterdayDate) );
				}

				
				for (CrmContact contactListItem : contactList) {
					ContactApiModel constantContactContact = getConstantContactService().getContactByEmailAndContactStatus(contactListItem.getPrimaryEmailAddress(), ConstantContactConstants.CONTACT_STATUS_OPTOUT, 500);
					if (_log.isDebugEnabled()) {
						if (null != constantContactContact) {
							_log.debug("Obtained Constant Contact data with status CONTACT_STATUS_OPTOUT for " + contactListItem.getPrimaryEmailAddress() + " who unsubscribed on " + ( null !=  constantContactContact.getEmailAddresses().get(0).getOptOutDate() ? constantContactContact.getEmailAddresses().get(0).getOptOutDate() : "null" ) );
						}
						else {
							_log.debug("Could not obtain Constant Contact data with status CONTACT_STATUS_OPTOUT for " + contactListItem.getPrimaryEmailAddress() );
						}
					}
					
					if ( _QUERY_REMOVED_CONTACTS && null == constantContactContact ) {
						constantContactContact = getConstantContactService().getContactByEmailAndContactStatus(contactListItem.getPrimaryEmailAddress(), ConstantContactConstants.CONTACT_STATUS_REMOVED, 500);
						if (_log.isDebugEnabled()) {
							if (null != constantContactContact) {
								_log.debug("Obtained Constant Contact data with status CONTACT_STATUS_REMOVED for " + contactListItem.getPrimaryEmailAddress() );
							}
							else {
								_log.debug("Could not obtain Constant Contact data with status CONTACT_STATUS_REMOVED for " + contactListItem.getPrimaryEmailAddress() );
							}
						}
					}

					if (constantContactContact != null) {
						
						Date unsubscribeDate = null;
						
						List<EmailAddress> emailAddressList = constantContactContact.getEmailAddresses();
						if (emailAddressList != null && !emailAddressList.isEmpty()) {
							for(EmailAddress emailAddressItem : emailAddressList) {
								if (null != emailAddressItem && null != emailAddressItem.getOptOutDate() ) {
									unsubscribeDate = ConstantContactUtil.parseIsoDate( emailAddressItem.getOptOutDate() );
									break;
								}
							}
						}
						
						if (
								null != contactListItem.getPrimaryEmailAddress() 
								&& (
										(
											null != unsubscribeDate 
											&& unsubscribeDate.after( yesterdayDate )
										)  
										|| (
											_QUERY_REMOVED_CONTACTS 
											&& null == unsubscribeDate
										)
									)
							) {
							
							UnsubscribedContact unsubscribedContact = new UnsubscribedContact( constantContactContact.getId(), contactListItem.getPrimaryEmailAddress(), unsubscribeDate, null == unsubscribeDate ); 

							if (_log.isDebugEnabled()) {
								_log.debug("Contact " + unsubscribedContact.getConstantContactActivityEmailAddress() + (unsubscribedContact.isRemoved() ? " removed by an administrator" : " unsubscribed on " + formatDate(unsubscribedContact.getConstantContactActivityUnsubscribeDate()) ) );
							}
							
							unsubscribedContactList.add(unsubscribedContact);
						}
						else {
							if (_log.isDebugEnabled()) {
								UnsubscribedContact unsubscribedContact = new UnsubscribedContact( constantContactContact.getId(), contactListItem.getPrimaryEmailAddress(), unsubscribeDate, null == unsubscribeDate ); 
								_log.debug("Contact " + unsubscribedContact.getConstantContactActivityEmailAddress() + (unsubscribedContact.isRemoved() ? " removed by an administrator" : " unsubscribed on " + formatDate(unsubscribedContact.getConstantContactActivityUnsubscribeDate()) ) + " - Ignored" );
							}
						}
					}
				}
			}

		} catch (SystemException ex) {
			if(_log.isErrorEnabled()) {
				_log.error("Exception processing unsubscribed VIP contact list - " + ex.getMessage(), ex);
			}
		}

		if ( null == unsubscribedContactList || unsubscribedContactList.isEmpty() ) {
			if (_log.isInfoEnabled()) {
				_log.info("No VIP contacts unsubscribed");
			}
			
			if (_log.isTraceEnabled()) {
				_log.trace("<< doReceive (early return) ");
			}

			return;
		}

		if (_log.isInfoEnabled()) {
			_log.info("Calling email utility with list of " + Integer.toString( unsubscribedContactList.size() ) + " VIP contacts...");
		}

		final String from = PropsUtil.get(ContactNotificationConstants.EMAIL_FROM_ADDRESS); // "cmap@cmap1pas2.illinois.gov";
		final String to = PropsUtil.get(ContactNotificationConstants.EMAIL_TO_ADDRESS); // "contactmanagers@cmap.illinois.gov";
		final String cc[] = PropsUtil.getArray(ContactNotificationConstants.EMAIL_CC_ADDRESS); // {"kharris@cmap.illinois.gov", "SKane@cmap.illinois.gov"};
		final String subject = "CMAP - Important Subscribers Unsubscribed Alert";
		final String footer = _ARTIFACT_BUILD_VERSION + " " + PropsUtil.get(ContactNotificationConstants.ENVIRONMENT_NAME);
		
		if (_log.isDebugEnabled()) {
			_log.debug("Email properties:\nFrom: " + (null != from ? from : "null") + "; to: " + ( null != to ? to : "null") + "; CC: " + ( null != cc ? String.join(", ", cc) : "null") );
		}

		if ( null != to && !to.trim().isEmpty() ) {
			UnsubscribedContactNotificationEmailUtil.buildAndSendEmail(from, to, cc, subject, unsubscribedContactList, footer);
		}
		else if (_log.isWarnEnabled()) {
			_log.warn("Email will not be sent because there's no email address configured for the property " + ContactNotificationConstants.EMAIL_TO_ADDRESS);
		}

			
		if (_log.isTraceEnabled()) {
			_log.trace("<< doReceive ");
		}
	}
}
