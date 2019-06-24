package contact.manager.app.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.constantcontact.model.ContactApiModel;
import contact.constantcontact.model.ContactList;
import contact.constantcontact.model.EmailAddress;
import contact.constantcontact.service.impl.ConstantContactServiceImpl;
import contact.manager.app.constants.ConstantContactKeys;
import contact.manager.app.constants.ContactManagerAppPortletKeys;
import contact.manager.app.util.AuditLogUtil;
import contact.manager.app.util.ContactUtil;
import contact.manager.app.util.GroupUtil;
import contact.manager.app.util.NoteUtil;
import contact.manager.app.util.OutreachLogUtil;
import contact.manager.app.util.UserUtil;
import contact.manager.app.viewmodel.CrmContactAuditLogChangeViewModel;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmContactAuditLog;
import contact.manager.model.CrmNote;
import contact.manager.model.CrmOutreachLog;
import contact.manager.service.CrmContactAuditLogLocalService;
import contact.manager.service.CrmContactLocalService;
import contact.manager.service.CrmNoteLocalService;
import contact.manager.service.CrmOutreachLogLocalService;

/**
 * @author jon
 */
@Component(
		immediate = true, 
		property = { 
				"com.liferay.portlet.add-default-resource=true", 
				"com.liferay.portlet.display-category=category.hidden", 
				"com.liferay.portlet.layout-cacheable=true", 
				"com.liferay.portlet.private-request-attributes=false", 
				"com.liferay.portlet.private-session-attributes=false", 
				"com.liferay.portlet.render-weight=50", 
				"com.liferay.portlet.use-default-template=true", 
				"com.liferay.portlet.header-portlet-css=/css/select2.css",
				"com.liferay.portlet.header-portlet-javascript=/js/select2.js",
				"javax.portlet.display-name=Contact Manager", 
				"javax.portlet.expiration-cache=0", 
				"javax.portlet.init-param.template-path=/", 
				"javax.portlet.init-param.view-template=/contacts/view.jsp", 
				"javax.portlet.name=" + ContactManagerAppPortletKeys.ContactManagerApp,
				"javax.portlet.resource-bundle=content.Language", 
				"javax.portlet.security-role-ref=power-user,user", 
				"javax.portlet.supports.mime-type=text/html" 
		}, service = Portlet.class
)
public class ContactManagerAppPortlet extends MVCPortlet {

	private static final Log LOGGER = LogFactoryUtil.getLog(ContactManagerAppPortlet.class);

	@Override
	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {
		super.render(request, response);
	}

	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		String command = ParamUtil.getString(resourceRequest, "cmd");

		if (command.equals("getPotentialGroups")) {
			String nameParam = ParamUtil.getString(resourceRequest, "name");
			String potentialContactsSerialized = GroupUtil.getCrmGroupsByName(nameParam);

			PrintWriter writer = resourceResponse.getWriter();
			writer.write(potentialContactsSerialized);
			writer.close();
		}
	}

	public void addContact(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		//This is not the liferay way, permission checker should be preformed here, at the time this was commented is checked by liferay on save/create/update/view
//		if (!PermissionUtil.canUserAddContact(user)) {
//			// TODO: set session message
//			return;
//		}
//
		try {
			
			
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
			CrmContact crmContact = _crmContactLocalService.createCrmContact(0);
			crmContact = ContactUtil.updateCrmContactProperties(crmContact, request, serviceContext, true);
			
			//START CMAP-252 if contacts exist in CRM active, return the error
			if (_crmContactLocalService.findByPrimaryEmailAddressAndStatus(crmContact.getPrimaryEmailAddress(), ConstantContactKeys.CC_STATUS_ACTIVE).size() > 0) {
				LOGGER.debug("#Search on CRM Contactes - 409: The email address provided is already in use");
				SessionErrors.add(request, "409");
				response.setRenderParameter("mvcPath", "/contacts/view.jsp");
				return;
			}
			//END CMAP-252
			
			ConstantContactServiceImpl constantContactServiceImpl = new ConstantContactServiceImpl();
			
			//START CMAP-253 //if the contact exist in CC get the id
			String id = null;
			ContactApiModel ccContact = constantContactServiceImpl.getContactByEmailAndContactStatus(crmContact.getPrimaryEmailAddress(), "ALL", 10);
			if (ccContact!= null) {
				if (!ConstantContactKeys.CC_STATUS_ACTIVE.equals(ccContact.getStatus())) { // if contact is not active, activated first
					ccContact.setStatus(ConstantContactKeys.CC_STATUS_ACTIVE);
					StringBuffer bufferResponse = new StringBuffer();
					//not sure if visitor or woner works everitime when updating general contact data or changing status
					//adding bouth to matain existing use cases
					//START CMAP-198
					System.out.println("=========== 0");
					ContactList contactList = new ContactList();
					System.out.println("=========== 1");
					contactList.id = "1"; //default weekly email list
					System.out.println("=========== 2");
					contactList.status = ConstantContactKeys.CC_STATUS_ACTIVE;
					System.out.println("=========== 3");
					List<ContactList> contactLists = new ArrayList<ContactList>();
					System.out.println("=========== 4");
					contactLists.add(contactList);
					System.out.println("=========== 5");
					ccContact.setLists(contactLists);
					System.out.println("=========== 6");
					System.out.println("=========== "+ccContact);
					//END CMAP-198
					constantContactServiceImpl.updateContact(ccContact, bufferResponse, ConstantContactKeys.CC_ACTION_BY_VISITOR);
					String responseCode = bufferResponse.toString();
					if (!responseCode.trim().isEmpty() && !responseCode.equals("200") ) {
						bufferResponse = new StringBuffer();
						constantContactServiceImpl.updateContact(ccContact, bufferResponse);
						if (!responseCode.trim().isEmpty() && !responseCode.equals("200") ) {
							SessionErrors.add(request, responseCode);
							response.setRenderParameter("mvcPath", "/contacts/view.jsp");
							return;
						}
					}
				}
				id = ccContact.getId();
			}
			//END CMAP-253
			else { // the cotact was not found in CC, create it
				StringBuffer messageResponse = new StringBuffer();
				id = constantContactServiceImpl.addContact("", crmContact.getFirstName(), crmContact.getLastName(), crmContact.getOrganization(), crmContact.getPrimaryEmailAddress(), messageResponse);
				if (id==null || id.trim().isEmpty()) {
					SessionErrors.add(request, messageResponse.toString());
					response.setRenderParameter("mvcPath", "/contacts/view.jsp");
					return;
				}
			}
			
			//Create contact in CRM
			crmContact.setConstantContactId(new Long(id));
			CrmContact addedContact = _crmContactLocalService.addCrmContact(crmContact, serviceContext);
			if (addedContact != null) {
				auditContactAction(serviceContext, crmContact.getCrmContactId(), ContactManagerAppPortletKeys.ACTION_ADD);
			}
			response.setRenderParameter("crmContactId", String.valueOf(crmContact.getCrmContactId()));
			response.setRenderParameter("mvcPath", "/contacts/view.jsp");

		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Exception in ContactManagerAppPortlet.addContact: " + e.getMessage());
		}
	}

	public void updateContact(ActionRequest request, ActionResponse response) throws PortalException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		
		//This is not the liferay way, permission checker should be preformed here, at the time this was commented is checked by liferay on save/create/update/view
		//if (!PermissionUtil.canUserUpdateContact(user)) {
			// TODO: set session message
		//	return;
		//}
		
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
			long crmContactId = ParamUtil.getLong(request, "crmContactId");

			CrmContact crmContact = _crmContactLocalService.getCrmContact(crmContactId);
			CrmContact originalContact = (CrmContact)crmContact.clone();

			crmContact = ContactUtil.updateCrmContactProperties(crmContact, request, serviceContext, false);

			//Code to update ConstantContact in case of any update in Fname, Lname, primaryEmail, organization;
			boolean errorOnConstactContact = false;
			ConstantContactServiceImpl constantContactServiceImpl = new ConstantContactServiceImpl();
			StringBuffer messageResponse = new StringBuffer();
			try {
				if (crmContact.getConstantContactId()!= 0) {
						ContactApiModel model = constantContactServiceImpl.getContact(new Long(crmContact.getConstantContactId()).toString());
						boolean update = false;
						if (model.getFirstName() == null || !crmContact.getFirstName().equals(model.getFirstName())){
							update = true;
							model.setFirstName(crmContact.getFirstName());
						}
						
						if (model.getLastName() == null || !crmContact.getLastName().equals(model.getLastName())){
							update = true;
							model.setLastName(crmContact.getLastName());
						}
						
						if (crmContact.getOrganization() != null && !crmContact.getOrganization().equals(model.getCompanyName())){
							update = true;
							model.setCompanyName(crmContact.getOrganization());
						} else if (crmContact.getOrganization() == null && model.getCompanyName()!=null) {
							update = true;
							model.setCompanyName(crmContact.getOrganization());
						}
						
						if (!isEmailInEmailAddressList(model.getEmailAddresses(), crmContact.getPrimaryEmailAddress())){
							ContactApiModel modelP = constantContactServiceImpl.getContactByEmailAndContactStatus(crmContact.getPrimaryEmailAddress(), ConstantContactKeys.CC_STATUS_ACTIVE, 1);
							if (modelP== null) {
								addEmailToEmailAddressList(model, crmContact.getPrimaryEmailAddress());
								update = true;
							} else {
								update = false;
								errorOnConstactContact = true;
								SessionErrors.add(request, "409");
							}
						}
						
						if (update){
							constantContactServiceImpl.updateContact(model, messageResponse);
							String responseCode = messageResponse.toString();
							if (!responseCode.trim().isEmpty() && !responseCode.equals("200") ) {
								errorOnConstactContact = true;
								SessionErrors.add(request, responseCode);
							}
						}
				} else { 
					String id = constantContactServiceImpl.addContact("", crmContact.getFirstName(), crmContact.getLastName(), crmContact.getOrganization(), crmContact.getPrimaryEmailAddress(), messageResponse);
					if (id==null || id.trim().isEmpty()) {
						SessionErrors.add(request, messageResponse.toString());
						errorOnConstactContact = true;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			CrmContact updatedContact = null;
			if (!errorOnConstactContact) {
				updatedContact = _crmContactLocalService.updateCrmContact(crmContact, serviceContext);
			}
			
			if (updatedContact != null) {
				auditContactAction(serviceContext, crmContactId, ContactManagerAppPortletKeys.ACTION_UPDATE, originalContact,
						updatedContact);
				// TODO: pass to Constant Contact API
			}
			
			response.setRenderParameter("crmContactId", String.valueOf(crmContactId));
			response.setRenderParameter("mvcPath", "/contacts/details.jsp");

		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Exception in ContactManagerAppPortlet.updateContact: " + e.getMessage());
		}
	}

	public void deleteContact(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		
		//This is not the liferay way, permission checker should be preformed here, at the time this was commented is checked by liferay on save/create/update/view
//		if (!PermissionUtil.canUserDeleteContact(user)) {
//			// TODO: set session message
//			return;
//		}		

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
			long crmContactId = ParamUtil.getLong(request, "crmContactId");
			long userId = serviceContext.getUserId();
			Date now = new Date();

			CrmContact crmContact = _crmContactLocalService.getCrmContact(crmContactId);
			crmContact.setStatus(ConstantContactKeys.CC_STATUS_REMOVED);
			crmContact.setUserId(userId);
			crmContact.setUserName(UserUtil.getUserName(userId));
			crmContact.setModifiedDate(serviceContext.getModifiedDate(now));
			long constantContactID =  crmContact.getConstantContactId();
			CrmContact deletedContact = _crmContactLocalService.updateCrmContact(crmContact, serviceContext);
			ConstantContactServiceImpl constantContactServiceImpl = new ConstantContactServiceImpl();
			if (deletedContact != null) {
				auditContactAction(serviceContext, crmContactId, ContactManagerAppPortletKeys.ACTION_DELETE);
				StringBuffer statusCode = new StringBuffer();
				String responseBody = constantContactServiceImpl.deleteContact(Long.toString(constantContactID), statusCode); 
				if (!statusCode.toString().equals("204") && !statusCode.toString().equals("200")) {
					SessionErrors.add(request, statusCode.toString()); 
					response.setRenderParameter("jspPage", "/contacts/view.jsp");
					return;
				}
			}

			response.setRenderParameter("jspPage", "/contacts/view.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.deleteContact: " + e.getMessage());
		}
	}

	public void addNote(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		
		//This is not the liferay way, permission checker should be preformed here, at the time this was commented is checked by liferay on save/create/update/view
//		if (!PermissionUtil.canUserAddNote(user)) {
//			// TODO: set session message
//			return;
//		}		

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmOutreachLog.class.getName(), request);
			long crmContactId = ParamUtil.getLong(request, "crmContactId");

			CrmNote crmNote = _crmNoteLocalService.createCrmNote(0);
			crmNote = NoteUtil.updateCrmNoteProperties(crmNote, request, serviceContext, true);
			_crmNoteLocalService.addCrmNote(crmNote);

			response.setRenderParameter("crmContactId", String.valueOf(crmContactId));
			response.setRenderParameter("mvcPath", "/notes/view.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.addNote: " + e.getMessage());
		}
	}

	public void updateNote(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		//This is not the liferay way, permission checker should be preformed here, at the time this was commented is checked by liferay on save/create/update/view
//		if (!PermissionUtil.canUserUpdateNote(user)) {
//			// TODO: set session message
//			return;
//		}		

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmOutreachLog.class.getName(), request);
			long crmNoteId = ParamUtil.getLong(request, "crmNoteId");

			CrmNote crmNote = _crmNoteLocalService.getCrmNote(crmNoteId);
			crmNote = NoteUtil.updateCrmNoteProperties(crmNote, request, serviceContext, false);
			_crmNoteLocalService.updateCrmNote(crmNote);

			response.setRenderParameter("crmContactId", String.valueOf(crmNote.getCrmContactId()));
			response.setRenderParameter("mvcPath", "/notes/view.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.updateNote: " + e.getMessage());
		}
	}

	public void deleteNote(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		//This is not the liferay way, permission checker should be preformed here, at the time this was commented is checked by liferay on save/create/update/view
//		if (!PermissionUtil.canUserDeleteNote(user)) {
//			// TODO: set session message
//			return;
//		}		

		try {
			long crmNoteId = ParamUtil.getLong(request, "crmNoteId");
			_crmNoteLocalService.deleteCrmNote(crmNoteId);
		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.deleteNote: " + e.getMessage());
		}
	}

	public void addOutreachLog(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		//This is not the liferay way, permission checker should be preformed here, at the time this was commented is checked by liferay on save/create/update/view
//		if (!PermissionUtil.canUserAddOutreach(user)) {
//			// TODO: set session message
//			return;
//		}		

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmOutreachLog.class.getName(), request);
			long crmContactId = ParamUtil.getLong(request, "crmContactId");

			CrmOutreachLog crmOutreachLog = _crmOutreachLogLocalService.createCrmOutreachLog(0);
			crmOutreachLog = OutreachLogUtil.updateCrmOutreachLogProperties(crmOutreachLog, request, serviceContext,
					true);
			_crmOutreachLogLocalService.addCrmOutreachLog(crmOutreachLog);

			response.setRenderParameter("crmContactId", String.valueOf(crmContactId));
			response.setRenderParameter("mvcPath", "/outreach/view.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.addOutreachLog: " + e.getMessage());
		}
	}

	public void updateOutreachLog(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		//This is not the liferay way, permission checker should be preformed here, at the time this was commented is checked by liferay on save/create/update/view
//		if (!PermissionUtil.canUserUpdateOutreach(user)) {
//			// TODO: set session message
//			return;
//		}

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmOutreachLog.class.getName(), request);
			long crmOutreachLogId = ParamUtil.getLong(request, "crmOutreachLogId");
			long crmContactId = ParamUtil.getLong(request, "crmContactId");

			CrmOutreachLog crmOutreachLog = _crmOutreachLogLocalService.getCrmOutreachLog(crmOutreachLogId);			
			OutreachLogUtil.updateCrmOutreachLogProperties(crmOutreachLog, request, serviceContext, true);
			_crmOutreachLogLocalService.updateCrmOutreachLog(crmOutreachLog);

			response.setRenderParameter("crmContactId", String.valueOf(crmContactId));
			response.setRenderParameter("mvcPath", "/outreach/view.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.updateOutreachLog: " + e.getMessage());
		}
	}

	public void deleteOutreachLog(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		//This is not the liferay way, permission checker should be preformed here, at the time this was commented is checked by liferay on save/create/update/view
//		if (!PermissionUtil.canUserDeleteOutreach(user)) {
//			// TODO: set session message
//			return;
//		}
		
		try {
			long crmOutreachLogId = ParamUtil.getLong(request, "crmOutreachLogId");
			_crmOutreachLogLocalService.deleteCrmOutreachLog(crmOutreachLogId);
		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.deleteOutreachLog: " + e.getMessage());
		}
	}	
	
	private void auditContactAction(ServiceContext serviceContext, long crmContactId, String action) {

		CrmContactAuditLog crmContactAuditLog = _crmContactAuditLogLocalService
				.createCrmContactAuditLog(0);
		crmContactAuditLog = AuditLogUtil.updateCrmContactAuditLogProperties(crmContactAuditLog, serviceContext,
				crmContactId, action);
		_crmContactAuditLogLocalService.addCrmContactAuditLog(crmContactAuditLog);
	}

	private void auditContactAction(ServiceContext serviceContext, long crmContactId, String action,
			CrmContact oldContact, CrmContact newContact) {

		CrmContactAuditLog crmContactAuditLog = _crmContactAuditLogLocalService
				.createCrmContactAuditLog(0);
		crmContactAuditLog = AuditLogUtil.updateCrmContactAuditLogProperties(crmContactAuditLog, serviceContext,
				crmContactId, action);
		_crmContactAuditLogLocalService.addCrmContactAuditLog(crmContactAuditLog);

		if (crmContactAuditLog != null) {
			List<CrmContactAuditLogChangeViewModel> crmContactAuditLogChangeViewModels = AuditLogUtil
					.collectCrmContactAuditLogChanges(oldContact, newContact);
			AuditLogUtil.setCrmContactAuditLogChanges(crmContactAuditLogChangeViewModels, serviceContext,
					crmContactAuditLog.getCrmContactAuditLogId());
		}
	}

	@Reference
	protected void setCrmContactService(CrmContactLocalService crmContactLocalService) {
		_crmContactLocalService = crmContactLocalService;
	}

	@Reference
	protected void setCrmContactAuditLogService(CrmContactAuditLogLocalService crmContactAuditLogLocalService) {
		_crmContactAuditLogLocalService = crmContactAuditLogLocalService;
	}

	@Reference
	protected void setCrmOutreachLogService(CrmOutreachLogLocalService crmOutreachLogLocalService) {
		_crmOutreachLogLocalService = crmOutreachLogLocalService;
	}

	@Reference
	protected void setCrmNoteService(CrmNoteLocalService crmNoteLocalService) {
		_crmNoteLocalService = crmNoteLocalService;
	}
	
	private boolean isEmailInEmailAddressList(List<EmailAddress> emailAddresses, String emailAdrress){
		if (emailAddresses != null){
			for (EmailAddress emailAddressObj : emailAddresses) {
				if (emailAddressObj != null && emailAdrress.equals(emailAddressObj.getEmailAddress())) {
					return true;
				}
			}			
		}
		return false;
	}
	
	//rules on ConstactContact specify one email address allowed
	private void addEmailToEmailAddressList(ContactApiModel model, String emailAdrress){
		model.setEmailAddresses(new ArrayList<EmailAddress>());
		EmailAddress email = new EmailAddress();
		email.setEmailAddress(emailAdrress);
		model.getEmailAddresses().add(email);
	}

	private CrmContactLocalService _crmContactLocalService;
	private CrmContactAuditLogLocalService _crmContactAuditLogLocalService;
	private CrmOutreachLogLocalService _crmOutreachLogLocalService;
	private CrmNoteLocalService _crmNoteLocalService;
}