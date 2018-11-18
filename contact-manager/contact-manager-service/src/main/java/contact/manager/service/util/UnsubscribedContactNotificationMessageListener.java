package contact.manager.service.util;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.SchedulerException;
import com.liferay.portal.kernel.scheduler.TriggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

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
		immediate = true,
		service = UnsubscribedContactNotificationMessageListener.class,
		property = {"cron.expression=0 0/5 * * * ?"} )
public class UnsubscribedContactNotificationMessageListener
extends ContactManagerBaseMessageListener {
	private static final Log _log = LogFactoryUtil.getLog(UnsubscribedContactNotificationMessageListener.class);

	@Reference(unbind = "-")
	public void setTriggerFactory(TriggerFactory triggerFactory) { _triggerFactory = triggerFactory; }

	@Reference(unbind = "-")
	public void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) { _schedulerEngineHelper = schedulerEngineHelper; }

	@Reference(target = "(osgi.web.symbolicname=com.liferay.filesystemaccess.web)", unbind = "-")
	public void setServletContext(ServletContext servletContext) { _servletContext = servletContext; }

//	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-") // target = ModuleServiceLifecycle.PORTAL_INITIALIZED indicates the component should be initialized only after the portal has completed its startup.
//	public void setModuleServiceLifecycle(ModuleServiceLifecycle moduleServiceLifecycle) { }

	@Activate
	@Modified
	@Override
	public void activate(Map<String,Object> properties) throws SchedulerException { super.activate(properties); }

	@Deactivate
	@Override
	public void deactivate() { super.deactivate(); }	

	
	
	/**
	 * doReceive: This method is called when the job is executed
	 * 
	 * @param message This is the message object sent to the job. The message will contain any data associated with the job.   
	 * @throws Exception
	 */
	@Override
	public void doReceive(Message message) throws Exception {
		if (_log.isInfoEnabled()) {
			_log.info(">> doReceive ");
		}
		System.out.println(">> doReceive "); // TODO Remove
		
		List<UnsubscribedContact> unsubscribedContactList = new ArrayList<UnsubscribedContact>();

		// get list of VIPs from DB
		try {
			List<CrmContact> contactList = CrmContactLocalServiceUtil.findByVipFlag(true);

			if (contactList != null && !contactList.isEmpty()) {
				
				if (_log.isInfoEnabled()) {
					_log.info("processing " + Integer.toString( contactList.size() ) + " VIP contacts...");
				}
				
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
			if (_log.isErrorEnabled()) {
				_log.error("Exception in UnsubscribedContactNotificationMessageListener - " + ex.getMessage(), ex);
			}
		}

		if (unsubscribedContactList.isEmpty()) {
			if (_log.isInfoEnabled()) {
				_log.info("UnsubscribedContactNotificationMessageListener: No VIP unsubscribed.");
			}
		}
		
		
		UnsubscribedContactNotificationEmailUtil.buildAndSendEmail(unsubscribedContactList, _servletContext);	
		
		
		if (_log.isInfoEnabled()) {
			_log.info("<< doReceive ");
		}
		System.out.println(">> doReceive "); // TODO Remove
	}
}
