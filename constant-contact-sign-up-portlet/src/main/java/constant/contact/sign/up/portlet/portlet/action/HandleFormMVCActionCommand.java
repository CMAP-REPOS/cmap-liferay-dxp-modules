package constant.contact.sign.up.portlet.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.PropsUtil;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import constant.contact.sign.up.portlet.constants.ConstantContactSignUpPortletKeys;
import contact.constantcontact.model.ContactApiModel;
import contact.constantcontact.service.impl.ConstantContactServiceImpl;
import contact.manager.service.util.ContactNotificationConstants;
import constant.contact.sign.up.portlet.util.SubscribeEmailUtil;


@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ConstantContactSignUpPortletKeys.CONSTANTCONTACTSIGNUP,
				"mvc.command.name=signupEmail"
		},
		service = MVCActionCommand.class
)
public class HandleFormMVCActionCommand extends BaseMVCActionCommand{
	
	private static final Log LOGGER = LogFactoryUtil.getLog(HandleFormMVCActionCommand.class);

	@Override
	protected void doProcessAction(ActionRequest request, ActionResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		addtoWeeklyEmailList(request);
		
	}
	
	private void addtoWeeklyEmailList(ActionRequest request) {
		System.out.println("Inside _handleActionCommand");
		
		try {
			String contactEmail = request.getParameter("contactEmail");
			ConstantContactServiceImpl constantContactServiceImpl = new ConstantContactServiceImpl();
			ContactApiModel ccContact = constantContactServiceImpl.getContactByEmailAndContactStatus(contactEmail, "ALL", 10);
			
			String id = null;
			
			if (ccContact!= null) {
				id = ccContact.getId();
				
				if (ConstantContactSignUpPortletKeys.CC_STATUS_ACTIVE.equals(ccContact.getStatus())) 
				{
					// The contact was found in CC and it's active, send notification
					SessionMessages.add(request, "409");
					String from = PropsUtil.get(ContactNotificationConstants.EMAIL_FROM_ADDRESS); 
					String to = contactEmail;
					String cc[] = null;
					String subject = "CMAP Weekly Updates Already Subscribed";
				    String footer = ConstantContactSignUpPortletKeys.SIGNUP_EXISTING_EMAIL;
				    
				    if ( null != to && !to.trim().isEmpty() ) {
				    	SubscribeEmailUtil.buildAndSendEmail(from, to, cc, subject, footer);
					}
				}
				else if (ConstantContactSignUpPortletKeys.CC_STATUS_UNCONFIRMED.equals(ccContact.getStatus())) {
					// The contact was found in CC and it's unconfirmed, send confirmation
					SessionMessages.add(request, "411");
					String from = PropsUtil.get(ContactNotificationConstants.EMAIL_FROM_ADDRESS); 
					String to = contactEmail;
					String cc[] = null;
					String subject = "CMAP Weekly Updates Unconfirmed";
				    String footer = ConstantContactSignUpPortletKeys.SIGNUP_UNCONFIRMED_EMAIL;
				    
				    if ( null != to && !to.trim().isEmpty() ) {
				    	SubscribeEmailUtil.buildAndSendEmail(from, to, cc, subject, footer);
					}
					
				}	
				else {
					// The contact was found in CC and it's not active or unconfirmed, send resubscribe
					SessionMessages.add(request, "410");
					String from = PropsUtil.get(ContactNotificationConstants.EMAIL_FROM_ADDRESS); 
					String to = contactEmail;
					String cc[] = null;
					String subject = "CMAP Weekly Updates Resubscribe";
				    String footer = ConstantContactSignUpPortletKeys.SIGNUP_RESUBSCRIBE_EMAIL;
				    
				    if ( null != to && !to.trim().isEmpty() ) {
				    	SubscribeEmailUtil.buildAndSendEmail(from, to, cc, subject, footer);
					}
				}
			}
			else { 
				// The cotact was not found in CC, create it
				StringBuffer messageResponse = new StringBuffer();
				id = constantContactServiceImpl.addContact("", "", "", "", contactEmail, messageResponse);
				SessionMessages.add(request, "408");
				
				if (id==null || id.trim().isEmpty()) {
					SessionErrors.add(request, messageResponse.toString());
					return;
				}
				
				String from = PropsUtil.get(ContactNotificationConstants.EMAIL_FROM_ADDRESS); 
				String to = contactEmail;
				String cc[] = null;
				String subject = "Thank you for subscribing to the CMAP's Weekly Update";
			    String footer = ConstantContactSignUpPortletKeys.SIGNUP_SUBSCRIBED_EMAIL;
			    
			    if ( null != to && !to.trim().isEmpty() ) {
			    	SubscribeEmailUtil.buildAndSendEmail(from, to, cc, subject, footer);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Exception in ConstantContactSignupPortlet.addContact: " + e.getMessage());
		}
	}

}
