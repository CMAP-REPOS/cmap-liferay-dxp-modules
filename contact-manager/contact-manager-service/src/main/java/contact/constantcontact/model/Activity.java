package contact.constantcontact.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class corresponding to the response from the contact tracking all activities response as outlined
 * at:
 * <p>
 * <a href=
 * "https://developer.constantcontact.com/docs/contact-tracking/contact-tracking-all-activities-api.html"
 * >https://developer.constantcontact.com/docs/contact-tracking/contact-tracking-all-activities-api.
 * html</a>
 * </p>
 * 
 * @author Workstate
 * 
 */
public class Activity {

	private String activityType;
	private String bounceCode;
	private String bounceDate;
	private String bounceDescription;
	private String bounceMessage;
	private Integer bounces;
	private String campaignId;
	private String clickDate;
	private Integer clicks;
	private String contactId;
	private String emailAddress;
	private String forwardDate;
	private Integer forwards;
	private String linkId;
	private String linkUri;
	private String openDate;
	private Integer opens;
	private String sendDate;
	private String unsubscribeDate;
	private String unsubscribeReason;
	private String unsubscribeSource;

	/**
	 * The Email campaign activity type, valid values are:
	 * <ul>
	 * <li>EMAIL_SEND</li>
	 * <li>EMAIL_CLICK</li>
	 * <li>EMAIL_OPEN</li>
	 * <li>EMAIL_FORWARD</li>
	 * <li>EMAIL_UNSUBSCRIBE</li>
	 * <li>EMAIL_BOUNCE</li>
	 * </ul>
	 * 
	 * @return
	 */
	@JsonProperty("activity_type")
	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	/**
	 * Code identifying reason for bounce, valid codes are:
	 * <p>
	 * B, D, F, S, V, Z
	 * </p>
	 * 
	 * @return
	 */
	@JsonProperty("bounce_code")
	public String getBounceCode() {
		return bounceCode;
	}

	public void setBounceCode(String bounceCode) {
		this.bounceCode = bounceCode;
	}

	/**
	 * Date the bounce occurred displayed in ISO 8601 format in Zulu time zone.
	 * 
	 * @return
	 */
	@JsonProperty("bounce_date")
	public String getBounceDate() {
		return bounceDate;
	}

	public void setBounceDate(String bounceDate) {
		this.bounceDate = bounceDate;
	}

	/**
	 * Description of bounce_codes:
	 * <p>
	 * B - non-existent address
	 * </p>
	 * <p>
	 * D - undeliverable
	 * </p>
	 * <p>
	 * F - mailbox full
	 * </p>
	 * <p>
	 * S - Suspended
	 * </p>
	 * <p>
	 * V - vacation or autoreply
	 * </p>
	 * <p>
	 * Z - Blocked
	 * </p>
	 * 
	 * @return
	 */
	@JsonProperty("bounce_description")
	public String getBounceDescription() {
		return bounceDescription;
	}

	public void setBounceDescription(String bounceDescription) {
		this.bounceDescription = bounceDescription;
	}

	/**
	 * System message received for the email bounce
	 * 
	 * @return
	 */
	@JsonProperty("bounce_message")
	public String getBounceMessage() {
		return bounceMessage;
	}

	public void setBounceMessage(String bounceMessage) {
		this.bounceMessage = bounceMessage;
	}

	/**
	 * Number of email bounces that occurred for this contact
	 * 
	 * @return
	 */
	@JsonProperty("bounces")
	public Integer getBounces() {
		return bounces;
	}

	public void setBounces(Integer bounces) {
		this.bounces = bounces;
	}

	/**
	 * Unique ID of the email campaign for which the activities occurred
	 * 
	 * @return
	 */
	@JsonProperty("campaign_id")
	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	/**
	 * Date the contact clicked the link in the email campaign, displayed in ISO 8601 format in Zulu
	 * time zone.
	 * 
	 * @return
	 */
	@JsonProperty("click_date")
	public String getClickDate() {
		return clickDate;
	}

	public void setClickDate(String clickDate) {
		this.clickDate = clickDate;
	}

	/**
	 * Number of unique link clicks the contact made in the email campaign
	 * 
	 * @return
	 */
	@JsonProperty("clicks")
	public Integer getClicks() {
		return clicks;
	}

	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	/**
	 * Specifies the contact that performed the activity
	 * 
	 * @return
	 */
	@JsonProperty("contact_id")
	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	/**
	 * Email address of the contact the activity applies to
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
	 * Date the contact forwarded the email campaign, displayed in ISO 8601 format in Zulu time
	 * zone.
	 * 
	 * @return
	 */
	@JsonProperty("forward_date")
	public String getForwardDate() {
		return forwardDate;
	}

	public void setForwardDate(String forwardDate) {
		this.forwardDate = forwardDate;
	}

	/**
	 * Number of times the contact forwarded the email campaign
	 * 
	 * @return
	 */
	@JsonProperty("forwards")
	public Integer getForwards() {
		return forwards;
	}

	public void setForwards(Integer forwards) {
		this.forwards = forwards;
	}

	/**
	 * Unique ID for the link in the email campaign
	 * 
	 * @return
	 */
	@JsonProperty("link_id")
	public String getLinkId() {
		return linkId;
	}

	public void setLinkId(String linkId) {
		this.linkId = linkId;
	}

	/**
	 * URI of the link the contact clicked on
	 * 
	 * @return
	 */
	@JsonProperty("link_uri")
	public String getLinkUri() {
		return linkUri;
	}

	public void setLinkUri(String linkUri) {
		this.linkUri = linkUri;
	}

	/**
	 * Date the email campaign was opened, displayed in ISO 8601 format in Zulu time zone.
	 * 
	 * @return
	 */
	@JsonProperty("open_date")
	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	/**
	 * Number of times the contact opened the email campaign
	 * 
	 * @return
	 */
	@JsonProperty("opens")
	public Integer getOpens() {
		return opens;
	}

	public void setOpens(Integer opens) {
		this.opens = opens;
	}

	/**
	 * Date the email campaign was sent, displayed in ISO 8601 format in Zulu time zone.
	 * 
	 * @return
	 */
	@JsonProperty("send_date")
	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	/**
	 * Date the contact unsubscribed from the mailist, displayed in ISO 8601 format
	 * 
	 * @return
	 */
	@JsonProperty("unsubscribe_date")
	public String getUnsubscribeDate() {
		return unsubscribeDate;
	}

	public void setUnsubscribeDate(String unsubscribeDate) {
		this.unsubscribeDate = unsubscribeDate;
	}

	/**
	 * Reason given by the contact for unsubscribing
	 * 
	 * @return
	 */
	@JsonProperty("unsubscribe_reason")
	public String getUnsubscribeReason() {
		return unsubscribeReason;
	}

	public void setUnsubscribeReason(String unsubscribeReason) {
		this.unsubscribeReason = unsubscribeReason;
	}

	/**
	 * One of two possible values:
	 * <p>
	 * ACTION_BY_CUSTOMER: the contact initiated the unsubscribe
	 * </p>
	 * <p>
	 * ACTION_BY_OWNER: the Constant Contact account initiated the unsubscribe action.
	 * </p>
	 * 
	 * @return
	 */
	@JsonProperty("unsubscribe_source")
	public String getUnsubscribeSource() {
		return unsubscribeSource;
	}

	public void setUnsubscribeSource(String unsubscribeSource) {
		this.unsubscribeSource = unsubscribeSource;
	}

}
