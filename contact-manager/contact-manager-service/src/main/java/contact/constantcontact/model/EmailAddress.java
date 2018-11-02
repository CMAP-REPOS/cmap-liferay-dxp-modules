package contact.constantcontact.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EmailAddress {

	private String confirmStatus;
	private String emailAddress;
	private String id;
	private String optInDate;
	private String optInSource;
	private String optOutDate;
	private String optOutSource;
	private String status;

	public EmailAddress() {
	}

	/**
	 * Confirmed status of the email address, valid values:
	 * <ul>
	 * <li>CONFIRMED: contact has confirmed their email address and subscription; a CONFIRMED email
	 * address cannot be edited</li>
	 * <li>NO_CONFIRMATION_REQUIRED: Contact has been added by the account with prior permission</li>
	 * <li>UNCONFIRMED: Contact has not yet confirmed their email address and subscription to a list
	 * with Constant Contact</li>
	 * </ul>
	 * 
	 * @return
	 */
	@JsonProperty("confirm_status")
	public String getConfirmStatus() {
		return confirmStatus;
	}

	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	/**
	 * Contact's email address, cannot exceed 80 characters
	 * 
	 * @return
	 */
	@JsonProperty("email_address")
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Unique ID for the email address
	 * 
	 * @return
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The date that the contact was added, in ISO-8601 format
	 * 
	 * @return
	 */
	@JsonProperty("opt_in_date")
	public String getOptInDate() {
		return optInDate;
	}

	public void setOptInDate(String optInDate) {
		this.optInDate = optInDate;
	}

	/**
	 * Describes how the contact was added to the account, valid values are:
	 * <ul>
	 * <li>ACTION_BY_VISITOR - the contact added him/herself by clicking a Subscribe button or other
	 * action</li>
	 * <li>ACTION_BY_OWNER - the account owner or other user authorized on the account added the
	 * contact</li>
	 * <li>ACTION_BY_SYSTEM - the contact was added by a Constant Contact representative at the
	 * request of the account owner or authorized user.</li>
	 * </ul>
	 * NOTE: Do not include OPT_IN_SOURCE=ACTION_BY_SYSTEM when making a PUT call to update a
	 * contact that has this setting; Do not use ACTION_BY_SYSTEM with the action_by query
	 * parameter, in both cases the API will respond with a 400 error. This value is set
	 * automatically when the contact is created, and cannot be edited. It's value must match the
	 * action_by value; if not set on POST, it takes on value of action_by property
	 * 
	 * @return
	 */
	@JsonProperty("opt_in_source")
	public String getOptInSource() {
		return optInSource;
	}

	public void setOptInSource(String optInSource) {
		this.optInSource = optInSource;
	}

	/**
	 * If the contact has a status of OPTOUT, this field displays the date the OPTOUT occurred
	 * 
	 * @return
	 */
	@JsonProperty("opt_out_date")
	public String getOptOutDate() {
		return optOutDate;
	}

	public void setOptOutDate(String optOutDate) {
		this.optOutDate = optOutDate;
	}

	/**
	 * If the contact has a status of OPTOUT, this field describes who initiated the optout action:
	 * <ul>
	 * <li>ACTION_BY_VISITOR - the contact initiated the OPTOUT</li>
	 * <li>ACTION_BY_OWNER - the account owner or user initiated the OPTOUT</li>
	 * </ul>
	 * 
	 * @return
	 */
	@JsonProperty("opt_out_source")
	public String getOptOutSource() {
		return optOutSource;
	}

	public void setOptOutSource(String optOutSource) {
		this.optOutSource = optOutSource;
	}

	/**
	 * The email address status, valid values:
	 * <ul>
	 * <li>ACTIVE: Contact is an active member of a contact list</li>
	 * <li>UNCONFIRMED: Contact has not confirmed their email address yet and the account cannot
	 * send campaigns to them until they confirm</li>
	 * <li>OPTOUT: Contact has unsubscribed from a contact list and is on the Do Not Mail list; the
	 * Constant Contact user cannot add them to a contact list. See Using the Contacts API for
	 * information on opting contacts back in.</li>
	 * <li>REMOVED: Contact has been taken off all contact lists, the Constant Contact user can add
	 * them to a contact list</li>
	 * <li>NON_SUBSCRIBER: someone who is not a contact, but has registered for an event the account
	 * has created</li>
	 * <li>VISITOR: a person who has "liked" a social campaign page for the account</li>
	 * <li>TEMP_HOLD - the account owner has temporarily stopped sending campaigns to subscriber.
	 * Learn more here.
	 * https://community.constantcontact.com/t5/Managing-Contacts/Temporary-Hold/td-p/114029</li>
	 * </ul>
	 * 
	 * @return
	 */
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
