package constant.contact.sign.up.portlet.constants;

/**
 * @author hectorortiz
 */
public class ConstantContactSignUpPortletKeys {

	public static final String CONSTANTCONTACTSIGNUP =
		"constant_contact_sign_up_portlet_ConstantContactSignUpPortlet";
	
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
	// someone who is not a contact, but has registered for one of the account's
	// events
	public static final String CC_STATUS_NON_SUBSCRIBER = "SUBSCRIBER";
	// a person who has "liked" one of the account's social campaign pages
	public static final String CC_STATUS_VISITOR = "VISITOR";
	// the account owner has temporarily stopped sending campaigns to
	// subscriber.
	public static final String CC_STATUS_TEMP_HOLD = "TEMP_HOLD";
	
	public static final String CC_ACTION_BY_OWNER = "ACTION_BY_OWNER";
	public static final String CC_ACTION_BY_VISITOR = "ACTION_BY_VISITOR";
	
	public static final String SIGNUP_EMAIL = "Thank you for signing up for the Chicago Metropolitan Agency for Planning Weekly Update. Our records indicate you are already signed up to receive this newsletter at this email address. If you have any questions, please contact info@cmap.illinois.gov.";

}