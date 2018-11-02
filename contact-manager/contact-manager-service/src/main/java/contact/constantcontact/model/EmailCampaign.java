package contact.constantcontact.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmailCampaign {

	private String id;
	private String modifiedDate;
	private String name;
	private String status;

	/**
	 * Unique identifier for the email campaign
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
	 * Date the email campaign was last modified, in ISO-8601 format
	 * 
	 * @return
	 */
	@JsonProperty("modified_date")
	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * Name of the email campaign; each email campaign name must be unique within a user's account
	 * 
	 * @return
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Current status of the email campaign, valid values:
	 * <ul>
	 * <li>DRAFT: This is the default status for an email that is still being worked on. Draft
	 * emails have been saved and can be edited at any time.</li>
	 * <li>RUNNING: The email messagSente is in the process of being sent and cannot be edited.</li>
	 * <li>SENT: An email that has been sent has already been mailed to it's contact list. It cannot
	 * be edited.</li>
	 * <li>SCHEDULED: A scheduled email has been set to mail on a specific date and cannot be edited
	 * unless it's returned to Draft status.</li>
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
