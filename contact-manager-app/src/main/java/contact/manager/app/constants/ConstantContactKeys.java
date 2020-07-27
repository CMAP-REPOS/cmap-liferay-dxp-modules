package contact.manager.app.constants;

public class ConstantContactKeys {

	public static final String CONFIG_API_BASE_URL = "constant.contact.apibaseurl";
	public static final String CONFIG_API_KEY = "constant.contact.apikey";
	public static final String CONFIG_API_TOKEN_KEY = "constant.contact.apitokenkey";
	public static final String CONFIG_API_TOKEN_VALUE = "constant.contact.apitokenvalue";
	public static final String CONFIG_API_DEFAULT_CONTACT_LIST = "constant.contact.apidefaultcontactlist";

	// Contact is an active member of a contactlist
	public static final String CC_STATUS_ACTIVE = "ACTIVE";
	// Contact has not confirmed their email address
	public static final String CC_STATUS_UNCONFIRMED = "UNCONFIRMED";
	// Contact has unsubscribed from the contact list and is on the Do Not Mail
	// list; they cannot be manually added to any contactlist
	public static final String CC_STATUS_OPTOUT = "OPTOUT";
	// Contact has been taken off all contactlists, and can be added to a
	// contactlist
	public static final String CC_STATUS_REMOVED = "REMOVED";
	public static final String CC_STATUS_UPDATED_CONFIRMED = "UPDATED_CONFIRMED";
	public static final String CC_STATUS_ADDED_CONFIRMED = "ADDED_CONFIRMED";
	// someone who is not a contact, but has registered for one of the account's
	// events
	public static final String CC_STATUS_NON_SUBSCRIBER = "SUBSCRIBER";
	// a person who has "liked" one of the account's social campaign pages
	public static final String CC_STATUS_VISITOR = "VISITOR";
	// the account owner has temporarily stopped sending campaigns to
	// subscriber.
	public static final String CC_STATUS_TEMP_HOLD = "TEMP_HOLD";

	public static final String CC_ACTIVITY_TYPE_EMAIL_SEND = "EMAIL_SEND";
	public static final String CC_ACTIVITY_TYPE_EMAIL_CLICK = "EMAIL_CLICK";
	public static final String CC_ACTIVITY_TYPE_EMAIL_OPEN = "EMAIL_OPEN";
	public static final String CC_ACTIVITY_TYPE_EMAIL_FORWARD = "EMAIL_FORWARD";
	public static final String CC_ACTIVITY_TYPE_EMAIL_UNSUBSCRIBE = "EMAIL_UNSUBSCRIBE";
	public static final String CC_ACTIVITY_TYPE_EMAIL_BOUNCE = "EMAIL_BOUNCE";

	public static final String CC_BOUNCE_TYPE_NON_EXISTENT_ADDRESS = "B";
	public static final String CC_BOUNCE_TYPE_UNDELIVERABLE = "D";
	public static final String CC_BOUNCE_TYPE_MAILBOX_FULL = "F";
	public static final String CC_BOUNCE_TYPE_SUSPENDED = "S";
	public static final String CC_BOUNCE_TYPE_VACATION_OR_AUTOREPLY = "V";
	public static final String CC_BOUNCE_TYPE_BLOCKED = "Z";

	public static final String CC_EMAIL_CAMPAIGN_STATUS_DRAFT = "DRAFT";
	public static final String CC_EMAIL_CAMPAIGN_STATUS_RUNNING = "RUNNING";
	public static final String CC_EMAIL_CAMPAIGN_STATUS_SENT = "SENT";
	public static final String CC_EMAIL_CAMPAIGN_STATUS_SCHEDULED = "SCHEDULED";
	
	public static final String CC_ACTION_BY_OWNER = "ACTION_BY_OWNER";
	public static final String CC_ACTION_BY_VISITOR = "ACTION_BY_VISITOR";
	
	
	//Added to remove users from the recycling bin
	public static final String CC_STATUS_DELETED = "DELETED";

}
