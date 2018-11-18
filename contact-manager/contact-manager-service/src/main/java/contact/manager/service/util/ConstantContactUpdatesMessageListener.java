package contact.manager.service.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import contact.constantcontact.model.Activity;
import contact.constantcontact.model.EmailCampaign;
import contact.constantcontact.model.enums.EmailCampaignStatus;
import contact.constantcontact.service.impl.ConstantContactServiceImpl;
import contact.constantcontact.util.ConstantContactUtil;
import contact.manager.model.CrmOutreachLog;
import contact.manager.service.CrmOutreachLogLocalServiceUtil;

@Component(
		property = {"cron.expression=0 0 2 * * ?"}, // Will run every day at 2am
		immediate = true,
		service = ConstantContactUpdatesMessageListener.class )
public class ConstantContactUpdatesMessageListener
extends ContactManagerBaseMessageListener {
	private static final Log _log = LogFactoryUtil.getLog(ConstantContactUpdatesMessageListener.class);
	private static final String ORLNoteSent = "Constant Contact activity batch process, Email sent.";
	private static final String ORLNoteOpened = "Constant Contact activity batch process, Email opened.";
	private static final String ORLNoteForwarded = "Constant Contact activity batch process, Email forwarded.";
	private static final String ORLNoteBounced = "Constant Contact activity batch process, Email bounced.";
	private static final String ORLNoteClick = "Constant Contact activity batch process, Email link opened (click).";
	private static final String ORLNoteUnsubscribed = "Constant Contact activity batch process, Email Unsubscribed.";
	
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
		
		System.out.println("entro y procesando");
		
		ConstantContactServiceImpl cc = new ConstantContactServiceImpl();
				//for each campain get Email sent
		String from = ConstantContactUtil.getPreviousDaysDateInIso8601();
		Date date = new Date();
		List<EmailCampaign> emailCampaigns = cc.getSentEmailCampaigns(EmailCampaignStatus.SENT.toString(), "10", from);
		
		for (EmailCampaign emailCampaign : emailCampaigns) {
			
			addCrmOutreachLogList(cc.getEmailSentContacts(emailCampaign.getId(), from), ORLNoteSent, date);
			addCrmOutreachLogList(cc.getEmailOpenContacts(emailCampaign.getId(), from), ORLNoteOpened, date);
			addCrmOutreachLogList(cc.getForwardedContacts(emailCampaign.getId(), from), ORLNoteForwarded, date);
			addCrmOutreachLogList(cc.getBouncedContacts(emailCampaign.getId(), from), ORLNoteBounced, date);
			addCrmOutreachLogList(cc.getEmailClickContacts(emailCampaign.getId(), from), ORLNoteClick, date);
			addCrmOutreachLogList(cc.getUnsubscribedContacts(emailCampaign.getId(), from), ORLNoteUnsubscribed, date);
			
		}
		
		if (_log.isInfoEnabled()) {
			_log.info("<< doReceive ");
		}
	}
	
	private void addCrmOutreachLogList(List<Activity> emailSentContacts, String note, Date date) {
		for (Activity activity : emailSentContacts) {
			CrmOutreachLog crmOutreachLog = CrmOutreachLogLocalServiceUtil.createCrmOutreachLog(0);
			OffsetDateTime outreachDate = OffsetDateTime.parse (activity.getSendDate());
			crmOutreachLog = updateCrmOutreachLogPropertiesBatch(crmOutreachLog, new Date(outreachDate.toInstant().toEpochMilli()), note, Long.parseLong(activity.getContactId()), date);
			CrmOutreachLogLocalServiceUtil.addCrmOutreachLog(crmOutreachLog);
		}
	}
	
	private CrmOutreachLog updateCrmOutreachLogPropertiesBatch(CrmOutreachLog crmOutreachLog, Date outreachDate, String note, long crmContactId, Date date) {

		crmOutreachLog.setOutreachDate(outreachDate);
		crmOutreachLog.setMedium("email");
		crmOutreachLog.setNote(note);
		crmOutreachLog.setUserId(0);
		crmOutreachLog.setUserName("Bach process");
		crmOutreachLog.setModifiedDate(date);
		crmOutreachLog.setCrmContactId(crmContactId);

		crmOutreachLog.setGroupId(10180L);
		crmOutreachLog.setCompanyId(10154L);
		crmOutreachLog.setCreateDate(date);

		return crmOutreachLog;
	}	
	
}
