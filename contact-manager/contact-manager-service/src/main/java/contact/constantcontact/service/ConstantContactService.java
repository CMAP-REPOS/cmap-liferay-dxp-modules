package contact.constantcontact.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.util.List;

import contact.constantcontact.model.Activity;
import contact.constantcontact.model.ContactApiModel;
import contact.constantcontact.model.EmailCampaign;

public interface ConstantContactService {

	ContactApiModel addContact(ContactApiModel model, StringBuffer messageResponse) throws JsonProcessingException;

	/**
	 * Add a new contact
	 * 
	 * @param contactViewModel
	 * @return the constant contact id
	 */
	//String addContact(ContactViewModel contactViewModel);
	
	String addContact(String id, String firstName, String lastName, String organization, String email, StringBuffer messageResponse);

	String deleteContact(String id, StringBuffer response) throws JsonProcessingException;

	ContactApiModel getContact(String contactId) throws IOException;
	
	ContactApiModel getContactByEmailAndContactStatus(String email, String contactStatus, int limit);

	List<Activity> getContactActivities(String contactId);

	/**
	 * https://developer.constantcontact.com/docs/email-campaigns/email-campaigns-collection.html
	 * 
	 * @return
	 */
	List<EmailCampaign> getSentEmailCampaigns();

	/**
	 * https://developer.constantcontact.com/docs/campaign-tracking/opt-out-activities-collection.
	 * html
	 * 
	 * @param campaignId
	 * @return
	 */
	List<Activity> getUnsubscribedContacts(String campaignId, String createdSinceDate);

	String updateContact(ContactApiModel model, StringBuffer response) throws JsonProcessingException, IOException;
	
	String updateContact(ContactApiModel model, StringBuffer response, String actionBy) throws JsonProcessingException, IOException;

	List<EmailCampaign> getSentEmailCampaigns(String status, String limit, String date);

	List<Activity> getBouncedContacts(String campaignId, String createdSinceDate);

	List<Activity> getEmailSentContacts(String campaignId, String createdSinceDate);

	List<Activity> getEmailOpenContacts(String campaignId, String createdSinceDate);

	List<Activity> getForwardedContacts(String campaignId, String createdSinceDate);

	List<Activity> getEmailClickContacts(String campaignId, String createdSinceDate);

	/**
	 * Update an existing contact
	 * 
	 * @param contactViewModel
	 * @return
	 * @throws JsonProcessingException 
	 * @throws IOException 
	 */
	//String updateContact(ContactViewModel contactViewModel) throws JsonProcessingException, IOException;
}
