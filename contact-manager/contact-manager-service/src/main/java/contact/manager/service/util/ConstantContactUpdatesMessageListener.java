package contact.manager.service.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TriggerFactory;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import contact.constantcontact.model.Activity;
import contact.constantcontact.model.EmailCampaign;
import contact.constantcontact.model.enums.EmailCampaignStatus;
import contact.constantcontact.service.impl.ConstantContactServiceImpl;
import contact.constantcontact.util.ConstantContactUtil;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmOutreachLog;
import contact.manager.service.CrmContactLocalServiceUtil;
import contact.manager.service.CrmOutreachLogLocalServiceUtil;
import contact.manager.service.impl.CrmContactLocalServiceImpl;

@Component(
		property = {"cron.expression=0 0/5 0 * * ?"}, // Will run every day at 2am. To run it every hour use: '0 0 * * * ?'. For every 5 minutes, use:'0 */5 * * * ?'. 
		immediate = true,
		service = ConstantContactUpdatesMessageListener.class )
public class ConstantContactUpdatesMessageListener
extends ContactManagerBaseMessageListener {
	private static final Log _log = LogFactoryUtil.getLog(ConstantContactUpdatesMessageListener.class);

	private static final String ORLNoteSent = "Constant Contact activity batch process, Email sent. Campaign ";
	private static final String ORLNoteOpened = "Constant Contact activity batch process, Email opened. Campaign ";
	private static final String ORLNoteForwarded = "Constant Contact activity batch process, Email forwarded. Campaign ";
	private static final String ORLNoteBounced = "Constant Contact activity batch process, Email bounced. Campaign ";
	private static final String ORLNoteClick = "Constant Contact activity batch process, Email link opened (click). Campaign ";
	private static final String ORLNoteUnsubscribed = "Constant Contact activity batch process, Email Unsubscribed. Campaign ";
	
	
	@Reference(unbind = "-")
	public void setTriggerFactory(TriggerFactory triggerFactory) { _triggerFactory = triggerFactory; }

	@Reference(unbind = "-")
	public void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) { _schedulerEngineHelper = schedulerEngineHelper; }

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle( ModuleServiceLifecycle moduleServiceLifecycle ) { }

	@Activate
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
	protected void doReceive(Message message) throws Exception {
		_log.info(">> doReceive ");
		
		ConstantContactServiceImpl cc = new ConstantContactServiceImpl();
				//for each campain get Email sent
		String from = ConstantContactUtil.getPreviousDaysDateInIso8601(1);
		Date date = new Date();
		List<EmailCampaign> emailCampaigns = cc.getSentEmailCampaigns(EmailCampaignStatus.SENT.toString(), "50", from);
		
		for (EmailCampaign emailCampaign : emailCampaigns) {
			String campaignName = emailCampaign.getName();
			addCrmOutreachLogList(cc.getEmailSentContacts(emailCampaign.getId(), from), ORLNoteSent, date, campaignName);
			addCrmOutreachLogList(cc.getEmailOpenContacts(emailCampaign.getId(), from), ORLNoteOpened, date, campaignName);
			addCrmOutreachLogList(cc.getForwardedContacts(emailCampaign.getId(), from), ORLNoteForwarded, date, campaignName);
			addCrmOutreachLogList(cc.getBouncedContacts(emailCampaign.getId(), from), ORLNoteBounced, date, campaignName);
			addCrmOutreachLogList(cc.getEmailClickContacts(emailCampaign.getId(), from), ORLNoteClick, date, campaignName);
			addCrmOutreachLogList(cc.getUnsubscribedContacts(emailCampaign.getId(), from), ORLNoteUnsubscribed, date, campaignName);
			
		}
		
		_log.info("<< doReceive ");
	}
	
	private void addCrmOutreachLogList(List<Activity> emailSentContacts, String note, Date date, String campaignName) {
		
		String insertNode = note+campaignName;
		
		for (Activity activity : emailSentContacts) {
			CrmOutreachLog crmOutreachLog = CrmOutreachLogLocalServiceUtil.createCrmOutreachLog(0);
			OffsetDateTime outreachDate = null;
			if (note.equals(ORLNoteSent)) {
				outreachDate = OffsetDateTime.parse (activity.getSendDate());
			} else if (note.equals(ORLNoteOpened)) {
				outreachDate = OffsetDateTime.parse (activity.getOpenDate());				
			} else if (note.equals(ORLNoteForwarded)) {
				outreachDate = OffsetDateTime.parse (activity.getForwardDate());				
			} else if (note.equals(ORLNoteBounced)) {
				outreachDate = OffsetDateTime.parse (activity.getBounceDate());				
			} else if (note.equals(ORLNoteClick)) {
				outreachDate = OffsetDateTime.parse (activity.getClickDate());				
			} else if (note.equals(ORLNoteUnsubscribed)) {
				outreachDate = OffsetDateTime.parse (activity.getUnsubscribeDate());				
			}
			
			if (outreachDate!=null) {
				try {
					CrmContact crmContact = CrmContactLocalServiceUtil.findByConstantContactId(Long.parseLong(activity.getContactId()));
					crmOutreachLog = updateCrmOutreachLogPropertiesBatch(crmOutreachLog, new Date(outreachDate.toInstant().toEpochMilli()), insertNode, crmContact.getCrmContactId(), date);
					CrmOutreachLogLocalServiceUtil.addCrmOutreachLog(crmOutreachLog);	
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
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
