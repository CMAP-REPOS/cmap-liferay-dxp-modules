package contact.manager.service.util;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import contact.constantcontact.ConstantContactConstants;
import contact.constantcontact.model.ContactApiModel;
import contact.constantcontact.model.EmailAddress;
import contact.constantcontact.util.ConstantContactUtil;
import contact.constantcontact.util.UnsubscribedContact;
import contact.manager.model.CrmContact;
import contact.manager.service.CrmContactLocalServiceUtil;

@Component(
		// property = {"cron.expression=0 0 23 * * ?"}, // Will run every day at 11pm
		property = {"cron.expression=0 */5 * * * ?"}, // Will run every 5 minutes for testing
		immediate = true,
		service = UnsubscribedContactNotificationMessageListener.class )
public class UnsubscribedContactNotificationMessageListener
extends ContactManagerBaseMessageListener {
	private static final Log _log = LogFactoryUtil.getLog(UnsubscribedContactNotificationMessageListener.class);

	
	/**
	 * doReceive: This method is called when the job is executed
	 * 
	 * @param message This is the message object sent to the job. The message will contain any data associated with the job.   
	 * @throws Exception
	 */
	@Override
	protected void doReceive(Message message) throws Exception {
		if (_log.isInfoEnabled()) {
			_log.info(">> doReceive ");
		}
		
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
	}
}
