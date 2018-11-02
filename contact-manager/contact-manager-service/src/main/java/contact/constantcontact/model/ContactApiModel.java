package contact.constantcontact.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonInclude(Include.NON_NULL)
public class ContactApiModel {

	private List<Address> addresses;
	private String cellPhone;
	private String companyName;
	private boolean confirmed;
	private Date createdDate;
	private List<CustomField> customFields;
	private List<EmailAddress> emailAddresses;
	private String fax;
	private String firstName;
	private String homePhone;
	private String id;
	private String jobTitle;
	private String lastName;
	private List<ContactList> lists;
	private String middleName;
	private Date modifiedDate;
	private List<Note> notes;
	private String prefixName;
	private String source;
	private String sourceDetails;
	private String status;
	private String workPhone;

	public ContactApiModel() {
	}

//	public ContactApiModel(Contact contact) {
//		source = ContactManagerConstants.CC_SOURCE_API;
//		id = String.valueOf(contact.getConstantContactId());
//
//		this.createdDate = contact.getCreateDate();
//		this.modifiedDate = contact.getModifiedDate();
//
//		this.companyName = String.valueOf(contact.getOrganization());
//		this.firstName = String.valueOf(contact.getFirstName());
//		this.lastName = String.valueOf(contact.getLastName());
//
//		this.emailAddresses = new ArrayList<EmailAddress>();
//
//		EmailAddress emailAddress = new EmailAddress();
//		emailAddress.setEmailAddress(String.valueOf(contact.getPrimaryEmailAddress()));
//		this.emailAddresses.add(emailAddress);
//
//		this.customFields = new ArrayList<CustomField>();
//	}

	/**
	 * Mail addresses for the contact. API currently supports a maximum of 2 addresses, 1 PERSONAL
	 * and 1 BUSINESS. It is possible to create up to 10 physical addresses using the product GUI.
	 * The API ignores any additional PERSONAL and BUSINESS addresses, and it ignores any other
	 * address_type.
	 * 
	 * @return
	 */
	@JsonProperty("addresses")
	public List<Address> getAddresses() {
		return addresses;
	}

	/**
	 * The contact's cell phone number
	 * 
	 * @return
	 */
	@JsonProperty("cell_phone")
	public String getCellPhone() {
		return cellPhone;
	}

	/**
	 * The contact's company
	 * 
	 * @return
	 */
	@JsonProperty("company_name")
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Date & time the contact was added, in ISO 8601 format
	 * 
	 * @return
	 */
	@JsonProperty("created_date")
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * You can create up to 15 custom fields associated with a contact. The API currently only
	 * supports the custom field format described here. If the account uses the new contact
	 * management system, it is possible to create custom fields with varying formats. The API
	 * ignores custom fields not using the format below.
	 * 
	 * @return
	 */
	@JsonProperty("custom_fields")
	public List<CustomField> getCustomFields() {
		return customFields;
	}

	/**
	 * Array of contact's email addresses, Currently only one email address is supported for each
	 * contact. If the account uses the new contact management system, it is possible to create more
	 * than 1 email address per contact using the product GUI. The API ignores additional email
	 * addresses.
	 * 
	 * @return
	 */
	@JsonProperty("email_addresses")
	public List<EmailAddress> getEmailAddresses() {
		return emailAddresses;
	}

	/**
	 * The contact's fax number
	 * 
	 * @return
	 */
	@JsonProperty("fax")
	public String getFax() {
		return fax;
	}

	/**
	 * The contact's first name
	 * 
	 * @return
	 */
	@JsonProperty("first_name")
	public String getFirstName() {
		return firstName;
	}

	/**
	 * The contact's home phone number
	 * 
	 * @return
	 */
	@JsonProperty("home_phone")
	public String getHomePhone() {
		return homePhone;
	}

	/**
	 * Unique ID for the contact
	 * 
	 * @return
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * The contact's job title
	 * 
	 * @return
	 */
	@JsonProperty("job_title")
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * The contact's last name
	 * 
	 * @return
	 */
	@JsonProperty("last_name")
	public String getLastName() {
		return lastName;
	}

	/**
	 * Array of the contact lists that the contact is a member of
	 * 
	 * @return
	 */
	@JsonProperty("lists")
	public List<ContactList> getLists() {
		return lists;
	}

	@JsonProperty("middle_name")
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Date & time the contact was last updated, in ISO 8601 format; value is the same as
	 * insert_date if contact has not been updated.
	 * 
	 * @return
	 */
	@JsonProperty("modified_date")
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * A note associated with the contact.
	 * 
	 * @return
	 */
	@JsonProperty("notes")
	public List<Note> getNotes() {
		return notes;
	}

	/**
	 * Salutation (Mr., Ms., Sir, Mrs., Dr., etc)
	 * 
	 * @return
	 */
	@JsonProperty("prefix_name")
	public String getPrefixName() {
		return prefixName;
	}

	/**
	 * Describes how the contact was added, from an application, web page, etc.
	 * 
	 * @return
	 */
	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	/**
	 * Name of the application that added the contact, if contact was added using the API
	 * 
	 * @return
	 */
	@JsonProperty("source_details")
	public String getSourceDetails() {
		return sourceDetails;
	}

	/**
	 * Contact status, valid values are:
	 * <ul>
	 * <li>ACTIVE: Contact is an active member of a contactlist</li>
	 * <li>UNCONFIRMED: Contact has not confirmed their email address</li>
	 * <li>OPTOUT: Contact has unsubscribed from the contact list and is on the Do Not Mail list;
	 * they cannot be manually added to any contactlist</li>
	 * <li>REMOVED: Contact has been taken off all contactlists, and can be added to a contactlist</li>
	 * <li>NON_SUBSCRIBER: someone who is not a contact, but has registered for one of the account's
	 * events</li>
	 * <li>VISITOR: a person who has "liked" one of the account's social campaign pages</li>
	 * <li>TEMP_HOLD - the account owner has temporarily stopped sending campaigns to subscriber.
	 * Learn more here.</li>
	 * </ul>
	 * 
	 * @return
	 */
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	/**
	 * The contact's Work phone number
	 * 
	 * @return
	 */
	@JsonProperty("work_phone")
	public String getWorkPhone() {
		return workPhone;
	}

	/**
	 * Confirmed = true if the contact has confirmed their email subscription, and it is false if
	 * they have not.
	 * 
	 * @return
	 */
	@JsonProperty("confirmed")
	public boolean isConfirmed() {
		return confirmed;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setCustomFields(List<CustomField> customFields) {
		this.customFields = customFields;
	}

	public void setEmailAddresses(List<EmailAddress> emailAddresses) {
		this.emailAddresses = emailAddresses;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLists(List<ContactList> lists) {
		this.lists = lists;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public void setPrefixName(String prefixName) {
		this.prefixName = prefixName;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setSourceDetails(String sourceDetails) {
		this.sourceDetails = sourceDetails;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

}
