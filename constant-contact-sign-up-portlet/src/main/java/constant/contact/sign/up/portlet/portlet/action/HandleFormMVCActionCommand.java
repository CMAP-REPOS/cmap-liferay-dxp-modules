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
import contact.constantcontact.model.ContactList;
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
				
				if (!ConstantContactSignUpPortletKeys.CC_STATUS_ACTIVE.equals(ccContact.getStatus())) 
				{ 
					/*/ if contact is not active, activated first
					ccContact.setStatus(ConstantContactSignUpPortletKeys.CC_STATUS_ACTIVE);
					StringBuffer bufferResponse = new StringBuffer();
					//not sure if visitor or woner works everitime when updating general contact data or changing status
					//adding bouth to matain existing use cases
					
					//START CMAP-198
					ContactList contactList = new ContactList();
					contactList.id = "1"; //default weekly email list
					contactList.status = ConstantContactSignUpPortletKeys.CC_STATUS_ACTIVE;
					List<ContactList> contactLists = new ArrayList<ContactList>();
					contactLists.add(contactList);
					ccContact.setLists(contactLists);
					//END CMAP-198
					constantContactServiceImpl.updateContact(ccContact, bufferResponse, ConstantContactSignUpPortletKeys.CC_ACTION_BY_VISITOR);
					
					String responseCode = bufferResponse.toString();
					if (!responseCode.trim().isEmpty() && !responseCode.equals("200") ) {
						bufferResponse = new StringBuffer();
						constantContactServiceImpl.updateContact(ccContact, bufferResponse);
						if (!responseCode.trim().isEmpty() && !responseCode.equals("200") ) {
							SessionErrors.add(request, responseCode);
							return;
						}
					}*/
					SessionMessages.add(request, "410");
					String from = PropsUtil.get(ContactNotificationConstants.EMAIL_FROM_ADDRESS); 
					String to = contactEmail;
					String cc[] = null;
					String subject = "CMAP Weekly Updates Resubscribe ";
				    String footer = ConstantContactSignUpPortletKeys.SIGNUP_RESUBSCRIBE_EMAIL;
				    
				    if ( null != to && !to.trim().isEmpty() ) {
				    	SubscribeEmailUtil.buildAndSendEmail(from, to, cc, subject, footer);
					}
					
					
				}
			
				//System.out.println("=====Contact exists, the ID is -> " + id + "=======");
				//System.out.println("=====The email is -> " + contactEmail + "=======");
				SessionMessages.add(request, "409");
				
				//System.out.println("=====ENVIRONMENT_NAME -> " + PropsUtil.get(ContactNotificationConstants.ENVIRONMENT_NAME) + "=======");
				String from = "cmap@cmap2das1.illinois.gov";// PropsUtil.get(ContactNotificationConstants.EMAIL_FROM_ADDRESS); 
				String to = contactEmail;
				String cc[] = null;
				String subject = "CMAP Weekly Updates Already Subscribed";
			    String footer = ConstantContactSignUpPortletKeys.SIGNUP_EXISTING_EMAIL;
				
			    //System.out.println("Email properties:\nFrom: " + (null != from ? from : "null") + "; to: " + ( null != to ? to : "null") + "; CC: " + ( null != cc ? String.join(", ", cc) : "null") );
			    //System.out.println("Footer: " + footer );
			    
			    if ( null != to && !to.trim().isEmpty() ) {
			    	SubscribeEmailUtil.buildAndSendEmail(from, to, cc, subject, footer);
				}
				
				
			}
			else { // the cotact was not found in CC, create it
				StringBuffer messageResponse = new StringBuffer();
				System.out.println("=====String buffer -> " + messageResponse + "=======");
				
				id = constantContactServiceImpl.addContact("", "", "", "", contactEmail, messageResponse);
				SessionMessages.add(request, "408");
				
				if (id==null || id.trim().isEmpty()) {
					SessionErrors.add(request, messageResponse.toString());
					return;
				}
			}
			
			System.out.println("Email is: " + contactEmail);
			
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Exception in ConstantContactSignupPortlet.addContact: " + e.getMessage());
		}
	}

}
