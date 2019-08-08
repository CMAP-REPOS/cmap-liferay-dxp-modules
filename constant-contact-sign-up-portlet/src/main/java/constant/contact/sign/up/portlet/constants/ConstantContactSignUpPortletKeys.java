package constant.contact.sign.up.portlet.constants;

/**
 * @author hectorortiz
 */
public class ConstantContactSignUpPortletKeys {

	public static final String CONSTANTCONTACTSIGNUP = "constant_contact_sign_up_portlet_ConstantContactSignUpPortlet";

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
	public static final String CC_STATUS_NON_SUBSCRIBER = "NON_SUBSCRIBER";
	// a person who has "liked" one of the account's social campaign pages
	public static final String CC_STATUS_VISITOR = "VISITOR";
	// the account owner has temporarily stopped sending campaigns to
	// subscriber.
	public static final String CC_STATUS_TEMP_HOLD = "TEMP_HOLD";

	public static final String CC_ACTION_BY_OWNER = "ACTION_BY_OWNER";
	public static final String CC_ACTION_BY_VISITOR = "ACTION_BY_VISITOR";

	public static final String SIGNUP_EXISTING_EMAIL = "Thank you for signing up for the Chicago Metropolitan Agency for Planning Weekly Update. "
			+ "Our records indicate you are already signed up to receive this newsletter at this email address. "
			+ "If you have any questions, please contact "
			+ "<a href=\"mailto:info@cmap.illinois.gov\">info@cmap.illinois.gov.</a>";
	public static final String SIGNUP_RESUBSCRIBE_EMAIL = "Thank you for signing up for the Chicago Metropolitan Agency for Planning Weekly Update. "
			+ "Our records indicate you have previously unsubscribed from this newsletter. To resubscribe, please follow this "
			+ "<a href=\"https://visitor.constantcontact.com/manage/optin?v=001xgSwsDzj9pz3r2IxBWpb7gYBXzRrtsMtAC7EmRCIL3lMjx68V_gS5PsC1znH5QUlJHSw7XiXCL0_2BboLGSOL3dvD8oVQE2WnkOuLWR5el3SLoFhnsC-Kai7qVysT5gpau12pQh3SrY=\">link. </a>"
			+ "If you have any questions, please contact "
			+ "<a href=\"mailto:info@cmap.illinois.gov\">info@cmap.illinois.gov.</a>";

	public static final String SIGNUP_UNCONFIRMED_EMAIL = "Thank you for signing up for the Chicago Metropolitan Agency for Planning Weekly Update. "
			+ "Thank you for signing up for the Chicago Metropolitan Agency for Planning Weekly Update. Our records indicate you already signed up to receive this newsletter but never confirmed it. "
			+ "Please check your inbox or junk folder to do so. If you have any questions, please contact "
			+ "<a href=\"mailto:info@cmap.illinois.gov\">info@cmap.illinois.gov.</a>";
}