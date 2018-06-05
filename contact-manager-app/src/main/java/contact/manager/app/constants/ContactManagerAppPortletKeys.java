package contact.manager.app.constants;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author jon
 */
public class ContactManagerAppPortletKeys {

	public static final String ContactManagerApp = "ContactManagerApp";
	public static final String GroupManagerApp = "GroupManagerApp";

	public static final String UI_DATE_FORMAT_PATTERN = "yyyy-MM-dd 'at' HH:mm:ss z";

	public static final String PORTLET_NAME = "contactmanager";

	public static final String PORTLET_PATH = "/group/control_panel/manage?p_p_id=contactmanager_WAR_contactmanagerportlet";

	public static final String VIEW_JSP_PATH = "/html/contactmanager/view.jsp";
	public static final String ADD_JSP_PATH = "/html/contactmanager/add_contact.jsp";
	public static final String DETAILS_JSP_PATH = "/html/contactmanager/details_contact.jsp";
	public static final String UPDATE_JSP_PATH = "/html/contactmanager/update_contact.jsp";
	public static final String AUDIT_JSP_PATH = "/html/contactmanager/audit_contact.jsp";
	public static final String DELETE_JSP_PATH = "/html/contactmanager/delete_contact.jsp";
	public static final String NOTES_JSP_PATH = "/html/contactmanager/view_notes.jsp";
	public static final String OUTREACH_LOG_JSP_PATH = "/html/contactmanager/view_outreach_log.jsp";
	public static final String ALL_GROUPS_JSP_PATH = "/html/groupmanager/view.jsp";
	public static final String DETAILS_GROUP_JSP_PATH = "/html/groupmanager/details_group.jsp";
	public static final String ADD_GROUP_JSP_PATH = "/html/groupmanager/add_group.jsp";
	public static final String UPDATE_GROUP_JSP_PATH = "/html/groupmanager/update_group.jsp";

	public static final long MEDIA_CONTACTS_SUBGROUP_ID = 92;
	public static final long WEEKLY_EMAIL_SUBGROUP_ID = 100;

	public static final String ROLE_ADMINISTRATOR = "Contact Administrator";
	public static final String ROLE_MANAGER = "Contact Manager";
	public static final String ROLE_USER = "Contact User";
	public static final String ROLE_NOTES_CONTRIBUTOR = "Contact Notes Contributor";
	public static final String ROLE_OUTREACH_CONTRIBUTOR = "Contact Outreach Contributor";
	public static final String ROLE_MEDIA_CONTACTS_MANAGER = "Media Contact Manager";

	public static final String ACTION_KEY_ADD_CONTACT = "ADD_CONTACT";
	public static final String ACTION_KEY_ADD_CONTACT_NOTE = "ADD_CONTACT_NOTE";
	public static final String ACTION_KEY_ADD_OUTREACH_NOTE = "ADD_OUTREACH_NOTE";
	public static final String ACTION_KEY_MODIFY_CONTACT = "MODIFY_CONTACT";
	public static final String ACTION_KEY_MODIFY_CONTACT_NOTE = "MODIFY_CONTACT_NOTE";
	public static final String ACTION_KEY_MODIFY_OUTREACH_LOG = "MODIFY_OUTREACH_LOG";
	public static final String ACTION_KEY_DELETE_CONTACT = "DELETE_CONTACT";
	public static final String ACTION_KEY_DELETE_CONTACT_NOTE = "DELETE_CONTACT_NOTE";
	public static final String ACTION_KEY_DELETE_OUTREACH_LOG = "DELETE_OUTREACH_NOTE";
	public static final String ACTION_KEY_VIEW_CONTACTS = "VIEW_CONTACTS";
	public static final String ACTION_KEY_VIEW_CONTACT_NOTES = "VIEW_CONTACT_NOTES ";

	public static final String UI_ACTION_PARAM_CURRENT_PAGE = "currentPage";
	public static final String UI_PARAM_CONTACT_ID = "contactId";
	public static final String UI_PARAM_ACTION = "action";
	public static final String UI_PARAM_DATA = "data";
	public static final String UI_PARAM_TARGET_PAGE = "targetPage";
	public static final String UI_PARAM_CONTACT_IMAGE_ID = "contactImageId";
	public static final String UI_PARAM_SUBGROUP_ID = "subGroupId";
	public static final String UI_PARAM_NOT_SUBGROUP_ID = "notSubGroupId";

	public static final String UI_ACTION_DELETE_NOTE = "deleteNote";
	public static final String UI_ACTION_DELETE_OUTREACH_LOG = "deleteOutreachLog";
	public static final String UI_ACTION_VALIDATE_EMAIL = "validateEmail";
	public static final String UI_ACTION_GET_CONTACT_IMAGE = "getContactImage";
	public static final String UI_ACTION_GROUP_CHANGE = "groupChange";
	public static final String UI_ACTION_GET_CONTACTS_JSON = "getContactsJson";
	public static final String UI_ACTION_POTENTIAL_CONTACTS = "getPotentialContacts";

	public static final String CC_ADDRESS_TYPE_BUSINESS = "BUSINESS";
	public static final String CC_ADDRESS_TYPE_PERSONAL = "PERSONAL";
	public static final String CC_ADDRESS_COUNTRY_CODE_US = "US";

	public static final String CC_SOURCE_API = "API";

	public static final String ACTION_ADD = "add";
	public static final String ACTION_UPDATE = "update";

	public static final Map<String, String> LOCALITIES_MAP;
	static {
		LOCALITIES_MAP = new LinkedHashMap<String, String>();
		LOCALITIES_MAP.put("AL", "Alabama");
		LOCALITIES_MAP.put("AK", "Alaska");
		LOCALITIES_MAP.put("AB", "Alberta");
		LOCALITIES_MAP.put("AZ", "Arizona");
		LOCALITIES_MAP.put("AR", "Arkansas");
		LOCALITIES_MAP.put("BC", "British Columbia");
		LOCALITIES_MAP.put("CA", "California");
		LOCALITIES_MAP.put("CO", "Colorado");
		LOCALITIES_MAP.put("CT", "Connecticut");
		LOCALITIES_MAP.put("DE", "Delaware");
		LOCALITIES_MAP.put("DC", "District Of Columbia");
		LOCALITIES_MAP.put("FL", "Florida");
		LOCALITIES_MAP.put("GA", "Georgia");
		LOCALITIES_MAP.put("GU", "Guam");
		LOCALITIES_MAP.put("HI", "Hawaii");
		LOCALITIES_MAP.put("ID", "Idaho");
		LOCALITIES_MAP.put("IL", "Illinois");
		LOCALITIES_MAP.put("IN", "Indiana");
		LOCALITIES_MAP.put("IA", "Iowa");
		LOCALITIES_MAP.put("KS", "Kansas");
		LOCALITIES_MAP.put("KY", "Kentucky");
		LOCALITIES_MAP.put("LA", "Louisiana");
		LOCALITIES_MAP.put("ME", "Maine");
		LOCALITIES_MAP.put("MB", "Manitoba");
		LOCALITIES_MAP.put("MD", "Maryland");
		LOCALITIES_MAP.put("MA", "Massachusetts");
		LOCALITIES_MAP.put("MI", "Michigan");
		LOCALITIES_MAP.put("MN", "Minnesota");
		LOCALITIES_MAP.put("MS", "Mississippi");
		LOCALITIES_MAP.put("MO", "Missouri");
		LOCALITIES_MAP.put("MT", "Montana");
		LOCALITIES_MAP.put("NE", "Nebraska");
		LOCALITIES_MAP.put("NV", "Nevada");
		LOCALITIES_MAP.put("NB", "New Brunswick");
		LOCALITIES_MAP.put("NH", "New Hampshire");
		LOCALITIES_MAP.put("NJ", "New Jersey");
		LOCALITIES_MAP.put("NM", "New Mexico");
		LOCALITIES_MAP.put("NY", "New York");
		LOCALITIES_MAP.put("NF", "Newfoundland and Labrador");
		LOCALITIES_MAP.put("NC", "North Carolina");
		LOCALITIES_MAP.put("ND", "North Dakota");
		LOCALITIES_MAP.put("NT", "Northwest Territories");
		LOCALITIES_MAP.put("NS", "Nova Scotia");
		LOCALITIES_MAP.put("NU", "Nunavut");
		LOCALITIES_MAP.put("OH", "Ohio");
		LOCALITIES_MAP.put("OK", "Oklahoma");
		LOCALITIES_MAP.put("ON", "Ontario");
		LOCALITIES_MAP.put("OR", "Oregon");
		LOCALITIES_MAP.put("PA", "Pennsylvania");
		LOCALITIES_MAP.put("PE", "Prince Edward Island");
		LOCALITIES_MAP.put("PR", "Puerto Rico");
		LOCALITIES_MAP.put("QC", "Quebec");
		LOCALITIES_MAP.put("RI", "Rhode Island");
		LOCALITIES_MAP.put("SK", "Saskatchewan");
		LOCALITIES_MAP.put("SC", "South Carolina");
		LOCALITIES_MAP.put("SD", "South Dakota");
		LOCALITIES_MAP.put("TN", "Tennessee");
		LOCALITIES_MAP.put("TX", "Texas");
		LOCALITIES_MAP.put("UT", "Utah");
		LOCALITIES_MAP.put("VT", "Vermont");
		LOCALITIES_MAP.put("VI", "Virgin Islands");
		LOCALITIES_MAP.put("VA", "Virginia");
		LOCALITIES_MAP.put("WA", "Washington");
		LOCALITIES_MAP.put("WV", "West Virginia");
		LOCALITIES_MAP.put("WI", "Wisconsin");
		LOCALITIES_MAP.put("WY", "Wyoming");
		LOCALITIES_MAP.put("YT", "Yukon Territory");
	}

	public static final Map<String, String> CA_LOCALITIES_MAP;
	static {
		CA_LOCALITIES_MAP = new LinkedHashMap<String, String>();
		CA_LOCALITIES_MAP.put("AB", "Alberta");
		CA_LOCALITIES_MAP.put("BC", "British Columbia");
		CA_LOCALITIES_MAP.put("MB", "Manitoba");
		CA_LOCALITIES_MAP.put("NB", "New Brunswick");
		CA_LOCALITIES_MAP.put("NL", "Newfoundland and Labrador");
		CA_LOCALITIES_MAP.put("NT", "Northwest Territories");
		CA_LOCALITIES_MAP.put("NS", "Nova Scotia");
		CA_LOCALITIES_MAP.put("NU", "Nunavut");
		CA_LOCALITIES_MAP.put("ON", "Ontario");
		CA_LOCALITIES_MAP.put("PE", "Prince Edward Island");
		CA_LOCALITIES_MAP.put("QC", "Quebec");
		CA_LOCALITIES_MAP.put("SK", "Saskatchewan");
		CA_LOCALITIES_MAP.put("YT", "Yukon Territory");
	}

	public static final Map<String, String> US_LOCALITIES_MAP;
	static {
		US_LOCALITIES_MAP = new LinkedHashMap<String, String>();
		US_LOCALITIES_MAP.put("AL", "Alabama");
		US_LOCALITIES_MAP.put("AK", "Alaska");
		US_LOCALITIES_MAP.put("AZ", "Arizona");
		US_LOCALITIES_MAP.put("AR", "Arkansas");
		US_LOCALITIES_MAP.put("CA", "California");
		US_LOCALITIES_MAP.put("CO", "Colorado");
		US_LOCALITIES_MAP.put("CT", "Connecticut");
		US_LOCALITIES_MAP.put("DE", "Delaware");
		US_LOCALITIES_MAP.put("DC", "District Of Columbia");
		US_LOCALITIES_MAP.put("FL", "Florida");
		US_LOCALITIES_MAP.put("GA", "Georgia");
		US_LOCALITIES_MAP.put("GU", "Guam");
		US_LOCALITIES_MAP.put("HI", "Hawaii");
		US_LOCALITIES_MAP.put("ID", "Idaho");
		US_LOCALITIES_MAP.put("IL", "Illinois");
		US_LOCALITIES_MAP.put("IN", "Indiana");
		US_LOCALITIES_MAP.put("IA", "Iowa");
		US_LOCALITIES_MAP.put("KS", "Kansas");
		US_LOCALITIES_MAP.put("KY", "Kentucky");
		US_LOCALITIES_MAP.put("LA", "Louisiana");
		US_LOCALITIES_MAP.put("ME", "Maine");
		US_LOCALITIES_MAP.put("MD", "Maryland");
		US_LOCALITIES_MAP.put("MA", "Massachusetts");
		US_LOCALITIES_MAP.put("MI", "Michigan");
		US_LOCALITIES_MAP.put("MN", "Minnesota");
		US_LOCALITIES_MAP.put("MS", "Mississippi");
		US_LOCALITIES_MAP.put("MO", "Missouri");
		US_LOCALITIES_MAP.put("MT", "Montana");
		US_LOCALITIES_MAP.put("NE", "Nebraska");
		US_LOCALITIES_MAP.put("NV", "Nevada");
		US_LOCALITIES_MAP.put("NH", "New Hampshire");
		US_LOCALITIES_MAP.put("NJ", "New Jersey");
		US_LOCALITIES_MAP.put("NM", "New Mexico");
		US_LOCALITIES_MAP.put("NY", "New York");
		US_LOCALITIES_MAP.put("NC", "North Carolina");
		US_LOCALITIES_MAP.put("ND", "North Dakota");
		US_LOCALITIES_MAP.put("OH", "Ohio");
		US_LOCALITIES_MAP.put("OK", "Oklahoma");
		US_LOCALITIES_MAP.put("OR", "Oregon");
		US_LOCALITIES_MAP.put("PA", "Pennsylvania");
		US_LOCALITIES_MAP.put("PR", "Puerto Rico");
		US_LOCALITIES_MAP.put("RI", "Rhode Island");
		US_LOCALITIES_MAP.put("SC", "South Carolina");
		US_LOCALITIES_MAP.put("SD", "South Dakota");
		US_LOCALITIES_MAP.put("TN", "Tennessee");
		US_LOCALITIES_MAP.put("TX", "Texas");
		US_LOCALITIES_MAP.put("UT", "Utah");
		US_LOCALITIES_MAP.put("VT", "Vermont");
		US_LOCALITIES_MAP.put("VI", "Virgin Islands");
		US_LOCALITIES_MAP.put("VA", "Virginia");
		US_LOCALITIES_MAP.put("WA", "Washington");
		US_LOCALITIES_MAP.put("WV", "West Virginia");
		US_LOCALITIES_MAP.put("WI", "Wisconsin");
		US_LOCALITIES_MAP.put("WY", "Wyoming");
	}

	public static final Map<String, String> OUTREACH_LOG_MEDIUM_OPTIONS;
	static {
		OUTREACH_LOG_MEDIUM_OPTIONS = new LinkedHashMap<String, String>();
		OUTREACH_LOG_MEDIUM_OPTIONS.put("email", "Email");
		OUTREACH_LOG_MEDIUM_OPTIONS.put("person", "In person");
		OUTREACH_LOG_MEDIUM_OPTIONS.put("phone", "Phone");
		OUTREACH_LOG_MEDIUM_OPTIONS.put("other", "Other");
	}

}