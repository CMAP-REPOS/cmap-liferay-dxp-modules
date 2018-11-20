package contact.constantcontact.service.impl;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.HttpMethods;
import com.liferay.portal.kernel.util.PropsUtil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import contact.constantcontact.ConstantContactConstants;
import contact.constantcontact.model.Activity;
import contact.constantcontact.model.ActivityResponse;
import contact.constantcontact.model.ContactApiModel;
import contact.constantcontact.model.ContactList;
import contact.constantcontact.model.ContactsCollectionResponse;
import contact.constantcontact.model.EmailAddress;
import contact.constantcontact.model.EmailCampaign;
import contact.constantcontact.model.EmailCampaignResponse;
import contact.constantcontact.model.UnsubscribeActivitiesResponse;
import contact.constantcontact.model.enums.EmailCampaignStatus;
import contact.constantcontact.service.ConstantContactService;


public class ConstantContactServiceImpl implements ConstantContactService {

	private static String apikey = null;
	private static String apitokenkey = null;
	private static String apitokenvalue = null;
	private static String apibaseurl = null;
	private static String apidefaultcontactlist = null;
	private static int apitimeout = 20000; 

	private HttpURLConnection httpUrlConnection = null;

	private static Log LOGGER = LogFactoryUtil.getLog(ConstantContactServiceImpl.class);
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper().configure(
			SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

	public ConstantContactServiceImpl() {
		staticInitilization();
	}

	public ConstantContactServiceImpl(String apiKey, String apiTokenKey, String apiTokenValue,
			String apiBaseUrl, String apiDefaultContactList) {
		apikey = apiKey;
		apitokenkey = apiTokenKey;
		apitokenvalue = apiTokenValue;
		apibaseurl = apiBaseUrl;
		apidefaultcontactlist = apiDefaultContactList;
	}
	
	public ConstantContactServiceImpl(boolean reset ) {
		if (reset) {
			apikey = null;	
			staticInitilization();
		}
	}

	private void staticInitilization() {
		if (apikey == null) {
			apikey = PropsUtil.get(ConstantContactConstants.CONFIG_API_KEY);
			apitokenkey = PropsUtil.get(ConstantContactConstants.CONFIG_API_TOKEN_KEY);
			apitokenvalue = PropsUtil.get(ConstantContactConstants.CONFIG_API_TOKEN_VALUE);
			apibaseurl = PropsUtil.get(ConstantContactConstants.CONFIG_API_BASE_URL);
			apidefaultcontactlist = PropsUtil
					.get(ConstantContactConstants.CONFIG_API_DEFAULT_CONTACT_LIST);
		}
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.contactmanager.ContactContactService#addContact(com.contactmanager.model.ContactApiModel)
	 */
	@Override
	public ContactApiModel addContact(ContactApiModel model, StringBuffer messageResponse) throws JsonProcessingException {
		LOGGER.trace("#addContact(ContactApiModel) - enter");
		try {
			/*
			 * Contacts created without a List are not visible (marked as "REMOVED") in the Constant
			 * Contact GUI
			 */
			ContactList defaultListModel = new ContactList();
			defaultListModel.id = apidefaultcontactlist;
			model.setLists(new ArrayList<ContactList>());
			model.getLists().add(defaultListModel);
			String contactModelJson = OBJECT_MAPPER.writeValueAsString(model);
			ContactApiModel cm = this.invokeApiAddContact(contactModelJson, messageResponse);
			return cm;

		} catch (Exception ex) {
			ex.printStackTrace();
			LOGGER.error(ex.getMessage(), ex);
			return null;
		}
	}

//	@Override
//	public String addContact(ContactViewModel contactViewModel) {
//		LOGGER.trace("#addContact(ContactViewModel) - enter");
//		String constantContactId = "";
//		try {
//			ContactApiModel apiModel = this.buildApiModel(contactViewModel);
//			ContactApiModel contactApiModel = this.addContact(apiModel);
//
//			constantContactId = contactApiModel.getId();
//		} catch (JsonParseException e) {
//			LOGGER.error("JsonParseException in addContact(ContactViewModel): " + e.getMessage(), e);
//		} catch (JsonMappingException e) {
//			LOGGER.error("JsonMappingException in addContact(ContactViewModel): " + e.getMessage(),
//					e);
//		} catch (IOException e) {
//			LOGGER.error("IOException in addContact(ContactViewModel): " + e.getMessage(), e);
//		} catch (NullPointerException e) {
//			LOGGER.error("NullPointerException in addContact(ContactViewModel): " + e.getMessage(),
//					e);
//		}
//
//		return constantContactId;
//	}

	@Override
	public String addContact(String id, String firstName, String lastName, String organization,
			String email, StringBuffer messageResponse) {

		LOGGER.trace("#addContact(String, String, String, String, String) - enter");
		String constantContactId = "";
		try {
			ContactApiModel apiModel = this.buildApiModel(id, firstName, lastName, organization,
					email);
			ContactApiModel contactApiModel = this.addContact(apiModel, messageResponse);
			if (contactApiModel !=null) {
				constantContactId = contactApiModel.getId();				
			}
		} catch (JsonParseException e) {
			LOGGER.error(
					"JsonParseException in addContact(String, String, String, String, String): "
							+ e.getMessage(), e);
		} catch (JsonMappingException e) {
			LOGGER.error(
					"JsonMappingException in addContact(String, String, String, String, String): "
							+ e.getMessage(), e);
		} catch (IOException e) {
			LOGGER.error(
					"IOException in addContact(String, String, String, String, String): "
							+ e.getMessage(), e);
		}
		return constantContactId;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.contactmanager.ContactContactService#deleteContact(java.lang.String)
	 */
	@Override
	public String deleteContact(String id, StringBuffer response) throws JsonProcessingException {
		LOGGER.trace("#deleteContact - enter");
		try {
			String result = invokeApiDeleteContact(id, response);
			return result;

		} catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
			return null;
		}
	}

	/**
	 * Invoke the ConstantContact API via REST to get contact details
	 * 
	 * @param apiUrl
	 *            , the constant contact endpoint with necessary query params
	 * @return a ContactApiModel object, ie. the parsed API response
	 */
	@Override
	public ContactApiModel getContact(String contactId) throws IOException {
		LOGGER.trace("#getContact - trace");
		ContactApiModel contact = this.invokeApiGetContact(contactId);
		return contact;
	}
	

	@Override
	public List<Activity> getContactActivities(String contactId) {
		LOGGER.trace("#getContactActivities - enter");

		List<Activity> activities = new ArrayList<Activity>();
		String apiUrl = String.format("%scontacts/%s/tracking?api_key=%s", apibaseurl, contactId,
				apikey);
		HttpURLConnection connection = null;
		try {
			connection = this.getHttpUrlConnection(apiUrl, HttpMethods.GET, "0", true, false);
			connection.connect();
			int status = connection.getResponseCode();

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("#getContactActivities - HTTP response code: " + status);
				LOGGER.debug("#getContactActivities - apiUrl: " + apiUrl);
			}

			if (status == HttpServletResponse.SC_OK) {
				String jsonResponse = readApiResponse(connection);
				ActivityResponse response = OBJECT_MAPPER.readValue(jsonResponse,
						ActivityResponse.class);
				activities = response.getResults();
			}
		} catch (MalformedURLException ex) {
			LOGGER.error(ex.getMessage(), ex);
		} catch (IOException ex) {
			LOGGER.error(ex.getMessage(), ex);
		} finally {
			if (connection != null) {
				try {
					connection.disconnect();
				} catch (Exception ex) {
					LOGGER.error(ex.getMessage(), ex);
				}
			}
		}

		if (activities != null && LOGGER.isDebugEnabled()) {
			LOGGER.debug("#getContactActivities - found '" + activities.size()
					+ "' activites for contactId: " + contactId);

		}

		return activities;
	}

	@Override
	public ContactApiModel getContactByEmailAndContactStatus(String email, String contactStatus,
			int limit) {
		LOGGER.trace("#getContactByEmailAndContactStatus - enter");

		String apiUrl = String.format("%scontacts?email=%s&status=%s&limit=%d&api_key=%s",
				apibaseurl, email, contactStatus, limit, apikey);

		ContactApiModel contact = null;
		HttpURLConnection connection = null;
		try {
			connection = this.getHttpUrlConnection(apiUrl, HttpMethods.GET, "0", true, false);
			connection.connect();
			int status = connection.getResponseCode();

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("#getContactByEmailAndContactStatus - HTTP response code: " + status);
				LOGGER.debug("#getContactByEmailAndContactStatus - apiUrl: " + apiUrl);
			}
			
			if (status == HttpServletResponse.SC_OK) {
				String jsonResponse = readApiResponse(connection);
				ContactsCollectionResponse response = OBJECT_MAPPER.readValue(jsonResponse,
						ContactsCollectionResponse.class);

				List<ContactApiModel> contacts = response.getResults();
				if (contacts != null && !contacts.isEmpty()) {
					contact = contacts.get(0);
				}

			}
		} catch (MalformedURLException ex) {
			LOGGER.error(ex.getMessage(), ex);
		} catch (IOException ex) {
			LOGGER.error(ex.getMessage(), ex);
		} finally {
			if (connection != null) {
				try {
					connection.disconnect();
				} catch (Exception ex) {
					LOGGER.error(ex.getMessage(), ex);
				}
			}
		}

		return contact;
	}

	public HttpURLConnection getHttpUrlConnection(String apiUrl, String httpMethod,
			String contentLength, boolean doInput, boolean doOutput) throws IOException {
		if (this.httpUrlConnection != null) {
			return this.httpUrlConnection;
		} else {
			return this
					.setupHttpUrlConnection(apiUrl, httpMethod, contentLength, doInput, doOutput);
		}
	}

	@Override
	public List<EmailCampaign> getSentEmailCampaigns() {
		LOGGER.trace("#getEmailCampaigns - enter");
		
		String apiUrl = String.format("%semailmarketing/campaigns?api_key=%s&status=%s",
				apibaseurl, apikey, EmailCampaignStatus.SENT.toString());

		return getEmailCampaingsWithParams(apiUrl);
	}
	
	@Override
	public List<EmailCampaign> getSentEmailCampaigns(String status, String limit, String date) {
		LOGGER.trace("#getEmailCampaigns - enter");

		String apiUrl = String.format("%semailmarketing/campaigns?api_key=%s&status=%s&limit=%s&modified_since=%s",
				apibaseurl, apikey, status, limit, date);
		System.out.println(apiUrl);
		return getEmailCampaingsWithParams(apiUrl);
	}
	
	private List<EmailCampaign> getEmailCampaingsWithParams(String apiUrl) {
		List<EmailCampaign> emailCampaigns = new ArrayList<EmailCampaign>();
		HttpURLConnection connection = null;
		try {
			connection = this.getHttpUrlConnection(apiUrl, HttpMethods.GET, "0", true, false);
			connection.connect();
			int status = connection.getResponseCode();

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("#getEmailCampaigns - HTTP response code: " + status);
				LOGGER.debug("#getEmailCampaigns - apiUrl: " + apiUrl);
			}

			if (status == HttpServletResponse.SC_OK) {
				String jsonResponse = readApiResponse(connection);
				EmailCampaignResponse response = OBJECT_MAPPER.readValue(jsonResponse,
						EmailCampaignResponse.class);
				emailCampaigns = response.getResults();
			}
		} catch (MalformedURLException ex) {
			LOGGER.error(ex.getMessage(), ex);
		} catch (IOException ex) {
			LOGGER.error(ex.getMessage(), ex);
		} finally {
			if (connection != null) {
				try {
					connection.disconnect();
				} catch (Exception ex) {
					LOGGER.error(ex.getMessage(), ex);
				}
			}
		}

		if (emailCampaigns != null && LOGGER.isDebugEnabled()) {
			LOGGER.debug("#getEmailCampaigns - found '" + emailCampaigns.size() + "'");

		}
		
		return emailCampaigns;
	}
	
	@Override
	public List<Activity> getUnsubscribedContacts(String campaignId, String createdSinceDate) {
		LOGGER.trace("#getUnsubscribedContacts - enter");

		String apiUrl = String.format(
				"%semailmarketing/campaigns/%s/tracking/unsubscribes?api_key=%s&created_since=%s",
				apibaseurl, campaignId, apikey, createdSinceDate);
		System.out.println("#getUnsubscribedContacts: "+apiUrl);

		return getContactActivity(apiUrl);
	}
	
	@Override
	public List<Activity> getBouncedContacts(String campaignId, String createdSinceDate) {
		LOGGER.trace("#getBouncedContacts - enter");

		String apiUrl = String.format(
				"%semailmarketing/campaigns/%s/tracking/bounces?api_key=%s&created_since=%s",
				apibaseurl, campaignId, apikey, createdSinceDate);
		System.out.println("#getBouncedContacts: "+apiUrl);
		
		return getContactActivity(apiUrl);
	}
	
	@Override
	public List<Activity> getEmailOpenContacts(String campaignId, String createdSinceDate) {
		LOGGER.trace("#getEmailOpenContacts - enter");

		String apiUrl = String.format(
				"%semailmarketing/campaigns/%s/tracking/opens?api_key=%s&created_since=%s",
				apibaseurl, campaignId, apikey, createdSinceDate);
		System.out.println("#getEmailOpenContacts: "+apiUrl);
		
		return getContactActivity(apiUrl);
	}
	
	@Override
	public List<Activity> getEmailSentContacts(String campaignId, String createdSinceDate) {
		LOGGER.trace("#getBouncedContacts - enter");

		String apiUrl = String.format(
				"%semailmarketing/campaigns/%s/tracking/sends?api_key=%s&created_since=%s",
				apibaseurl, campaignId, apikey, createdSinceDate);
		System.out.println("#getBouncedContacts: "+apiUrl);
		
		return getContactActivity(apiUrl);
	}
	
	@Override
	public List<Activity> getForwardedContacts(String campaignId, String createdSinceDate) {
		LOGGER.trace("#getForwardedContacts - enter");

		String apiUrl = String.format(
				"%semailmarketing/campaigns/%s/tracking/forwards?api_key=%s&created_since=%s",
				apibaseurl, campaignId, apikey, createdSinceDate);
		System.out.println("#getForwardedContacts: "+apiUrl);
		
		return getContactActivity(apiUrl);
	}
	
	@Override
	public List<Activity> getEmailClickContacts(String campaignId, String createdSinceDate) {
		LOGGER.trace("#getEmailClickContacts - enter");

		String apiUrl = String.format(
				"%semailmarketing/campaigns/%s/tracking/clicks?api_key=%s&created_since=%s",
				apibaseurl, campaignId, apikey, createdSinceDate);
		System.out.println("#getEmailClickContacts: "+apiUrl);

		return getContactActivity(apiUrl);
	}
	
	
	
	private List<Activity> getContactActivity(String apiUrl){
		List<Activity> unsubActivities = new ArrayList<Activity>();
		HttpURLConnection connection = null;
		try {
			connection = this.getHttpUrlConnection(apiUrl, HttpMethods.GET, "0", true, false);
			connection.connect();
			int status = connection.getResponseCode();

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("#getUnsubscribedContacts - HTTP response code: " + status);
				LOGGER.debug("#getUnsubscribedContacts - apiUrl: " + apiUrl);
			}

			if (status == HttpServletResponse.SC_OK) {
				String jsonResponse = readApiResponse(connection);
				UnsubscribeActivitiesResponse response = OBJECT_MAPPER.readValue(jsonResponse,
						UnsubscribeActivitiesResponse.class);
				unsubActivities = response.getResults();
			} else {
				System.out.println("ERROR for: " + apiUrl);
			}
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
			LOGGER.error(ex.getMessage(), ex);
		} catch (IOException ex) {
			ex.printStackTrace();
			LOGGER.error(ex.getMessage(), ex);
		} finally {
			if (connection != null) {
				try {
					connection.disconnect();
				} catch (Exception ex) {
					LOGGER.error(ex.getMessage(), ex);
				}
			}
		}

		if (unsubActivities != null && LOGGER.isDebugEnabled()) {
			LOGGER.debug("#getUnsubscribedContacts - found '" + unsubActivities.size());

		}

		return unsubActivities;
	}
	
	

	public void setHttpUrlConnection(HttpURLConnection httpUrlConnection) {
		this.httpUrlConnection = httpUrlConnection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.contactmanager.ContactContactService#updateContact(com.contactmanager.model.ContactApiModel
	 * )
	 */
	@Override
	public String updateContact(ContactApiModel model, StringBuffer response) throws IOException {
		LOGGER.trace("#updateContact - enter");
		/*
		 * Lists and Notes aren't modified here, but are removed if they aren't passed back to the
		 * API
		 */
		ContactApiModel existingContact = getContact(model.getId());
		if (existingContact != null) {
			model.setLists(existingContact.getLists());
			model.setNotes(existingContact.getNotes());
		}
		
		
		String contactModelJson = OBJECT_MAPPER.writeValueAsString(model);
		String result = null;
		
		
		String apiUrl = apibaseurl + "contacts/" + model.getId()
				+ "?action_by=ACTION_BY_OWNER&api_key=" + apikey;

		HttpURLConnection connection = null;
		try {
			connection = this.getHttpUrlConnection(apiUrl, HttpMethods.PUT,
					Integer.toString(contactModelJson.getBytes().length), true, true);

			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
					connection.getOutputStream()));
			out.write(contactModelJson);
			out.close();

			int status = connection.getResponseCode();
			
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("#updateContact - HTTP response code: " + status);
				LOGGER.debug("#updateContact - apiUrl: " + apiUrl);
			}
			
			switch (status) {
			case HttpServletResponse.SC_CREATED:
				LOGGER.debug("#invokeApiAddContact - 201: Contact was successfully created");
				break;
			case HttpServletResponse.SC_BAD_REQUEST:
				LOGGER.debug("#invokeApiAddContact - 400: Either JSON was malformed or there was a data validation error");
				response.append("400");
				break;
			case HttpServletResponse.SC_UNAUTHORIZED:
				LOGGER.debug("#invokeApiAddContact - 401: Authentication failure");
				response.append("401");
				break;
			case HttpServletResponse.SC_NOT_ACCEPTABLE:
				LOGGER.debug("#invokeApiAddContact - 406: Unsupported Accept Header value, must be application/json");
				response.append("406");
				break;
			case HttpServletResponse.SC_CONFLICT:
				LOGGER.debug("#invokeApiAddContact - 409: The email address provided is already in use");
				response.append("409");
				break;
			case HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE:
				LOGGER.debug("#invokeApiAddContact - 415: Unsupported content-type in the header, use application/json");
				response.append("415");
				break;
			case HttpServletResponse.SC_INTERNAL_SERVER_ERROR:
				LOGGER.debug("#invokeApiAddContact - 500: Internal server error occurred");
				response.append("500");
				break;
			default:
				break;
		}
			
			
			
			if (status == HttpServletResponse.SC_OK) {
				response.append("200");
				result = readApiResponse(connection);
			}
		} finally {
			if (connection != null) {
				try {
					connection.disconnect();
				} catch (Exception ex) {
					ex.printStackTrace();
					LOGGER.error(ex.getMessage(), ex);
				}
			}
		}

		return result;
	}

//	@Override
//	public String updateContact(ContactViewModel contactViewModel) throws IOException {
//
//		ContactApiModel apiModel = this.buildApiModel(contactViewModel);
//		this.updateContact(apiModel);
//
//		return contactViewModel.getConstantContactId();
//	}
//
//	private ContactApiModel buildApiModel(ContactViewModel contactViewModel) {
//		ContactApiModel apiModel = new ContactApiModel();
//
//		apiModel.setId(contactViewModel.getConstantContactId());
//		apiModel.setFirstName(contactViewModel.getFirstName());
//		apiModel.setLastName(contactViewModel.getLastName());
//		apiModel.setCompanyName(contactViewModel.getOrganization());
//		EmailAddress apiEmailAddressModel = new EmailAddress();
//		apiEmailAddressModel.setEmailAddress(contactViewModel.getEmailAddress());
//		apiModel.setEmailAddresses(new ArrayList<EmailAddress>());
//		apiModel.getEmailAddresses().add(apiEmailAddressModel);
//
//		return apiModel;
//	}

	private ContactApiModel buildApiModel(String id, String firstName, String lastName,
			String organization, String email) {
		ContactApiModel apiModel = new ContactApiModel();

		apiModel.setId(id);
		apiModel.setFirstName(firstName);
		apiModel.setLastName(lastName);
		apiModel.setCompanyName(organization);
		EmailAddress apiEmailAddressModel = new EmailAddress();
		apiEmailAddressModel.setEmailAddress(email);
		apiModel.setEmailAddresses(new ArrayList<EmailAddress>());
		apiModel.getEmailAddresses().add(apiEmailAddressModel);

		return apiModel;
	}

	private ContactApiModel invokeApiAddContact(String contactModelJson, StringBuffer response) {
		LOGGER.trace("#invokeApiAddContact - enter");
		ContactApiModel contactApiModel = null;
		String apiUrl = apibaseurl + "contacts?action_by=ACTION_BY_OWNER&api_key=" + apikey;
		HttpURLConnection connection = null;
		try {
			connection = this.getHttpUrlConnection(apiUrl, HttpMethods.POST,
					Integer.toString(contactModelJson.getBytes().length), true, true);
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
					connection.getOutputStream()));
			out.write(contactModelJson);
			out.close();
			int status = connection.getResponseCode();
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("#invokeApiAddContact - apiUrl: " + apiUrl);
				LOGGER.debug("#invokeApiAddContact - json: " + contactModelJson);
				LOGGER.debug("#invokeApiAddContact - HTTP response code: " + status);
			}
			
			switch (status) {
				case HttpServletResponse.SC_CREATED:
					LOGGER.debug("#invokeApiAddContact - 201: Contact was successfully created");
					break;
				case HttpServletResponse.SC_BAD_REQUEST:
					LOGGER.debug("#invokeApiAddContact - 400: Either JSON was malformed or there was a data validation error");
					response.append("400");
					break;
				case HttpServletResponse.SC_UNAUTHORIZED:
					LOGGER.debug("#invokeApiAddContact - 401: Authentication failure");
					response.append("401");
					break;
				case HttpServletResponse.SC_NOT_ACCEPTABLE:
					LOGGER.debug("#invokeApiAddContact - 406: Unsupported Accept Header value, must be application/json");
					response.append("406");
					break;
				case HttpServletResponse.SC_CONFLICT:
					LOGGER.debug("#invokeApiAddContact - 409: The email address provided is already in use");
					response.append("409");
					break;
				case HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE:
					LOGGER.debug("#invokeApiAddContact - 415: Unsupported content-type in the header, use application/json");
					response.append("415");
					break;
				case HttpServletResponse.SC_INTERNAL_SERVER_ERROR:
					LOGGER.debug("#invokeApiAddContact - 500: Internal server error occurred");
					response.append("500");
					break;
				default:
					break;
			}
			
			if (status == HttpServletResponse.SC_CREATED) {
				String jsonResponse = readApiResponse(connection);
				contactApiModel = OBJECT_MAPPER.readValue(jsonResponse, ContactApiModel.class);
			}
		} catch (MalformedURLException ex) {
			LOGGER.error(ex.getMessage(), ex);
		} catch (IOException ex) {
			LOGGER.error(ex.getMessage(), ex);
		} finally {
			if (connection != null) {
				try {
					connection.disconnect();
				} catch (Exception ex) {
					LOGGER.error(ex.getMessage(), ex);
				}
			}
		}
		return contactApiModel;
	}

	private String invokeApiDeleteContact(String contactModelId, StringBuffer response) {
		LOGGER.trace("#invokeApiDeleteContact - enter");

		String apiUrl = apibaseurl + "contacts/" + contactModelId + "?api_key=" + apikey;

		HttpURLConnection connection = null;
		try {
			connection = this.getHttpUrlConnection(apiUrl, HttpMethods.DELETE, "0", true, true);

			int status = connection.getResponseCode();

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("#invokeApiDeleteContact - HTTP response code: " + status);
				LOGGER.debug("#invokeApiDeleteContact - apiUrl: " + apiUrl);
			}

			if (status == HttpServletResponse.SC_OK || status == HttpServletResponse.SC_NO_CONTENT) {
				response.append(status);
				return readApiResponse(connection);
			}
		} catch (MalformedURLException ex) {
			LOGGER.error(ex.getMessage(), ex);
		} catch (IOException ex) {
			LOGGER.error(ex.getMessage(), ex);
		} finally {
			if (connection != null) {
				try {
					connection.disconnect();
				} catch (Exception ex) {
					LOGGER.error(ex.getMessage(), ex);
				}
			}
		}
		return null;
	}

	/**
	 * Invoke the ConstantContact API via REST to get contact details
	 * 
	 * @param apiUrl
	 *            , the constant contact endpoint with necessary query params
	 * @return a ContactApiModel object, ie. the parsed API response
	 * @throws IOException
	 */
	private ContactApiModel invokeApiGetContact(String contactId) throws IOException {
		LOGGER.trace("#invokeApiGetContact - enter");

		ContactApiModel contactApiModel = null;
		String apiUrl = String.format("%scontacts/%s?api_key=%s", apibaseurl, contactId, apikey);
		HttpURLConnection connection = null;
		try {
			connection = this.getHttpUrlConnection(apiUrl, HttpMethods.GET, "0", true, false);
			connection.connect();
			int status = connection.getResponseCode();

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("#invokeApiGetContact - HTTP response code: " + status);
				LOGGER.debug("#invokeApiGetContact - apiUrl: " + apiUrl);
			}
			
			if (status == HttpServletResponse.SC_OK) {
				String jsonResponse = readApiResponse(connection);
				contactApiModel = OBJECT_MAPPER.readValue(jsonResponse, ContactApiModel.class);
			}
		} finally {
			if (connection != null) {
				try {
					connection.disconnect();
				} catch (Exception ex) {
					LOGGER.error(ex.getMessage(), ex);
				}
			}
		}
		return contactApiModel;
	}
	
	
	

	/**
	 * Read the API response (JSON) and return as a String
	 * 
	 * @param connection
	 * @return the JSON response as a String
	 * @throws IOException
	 */
	private String readApiResponse(HttpURLConnection connection) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line + "\n");
		}
		br.close();
		LOGGER.debug("#readApiResponse - raw json response: " + sb.toString());
		return sb.toString();
	}

	private HttpURLConnection setupHttpUrlConnection(String apiUrl, String httpMethod,
			String contentLength, boolean doInput, boolean doOutput) throws IOException {
		HttpURLConnection connection = null;
		URL url = new URL(apiUrl);
		connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod(httpMethod);

		if (HttpMethods.POST.equals(httpMethod) || HttpMethods.PUT.equals(httpMethod)) {
			connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		}

		connection.setRequestProperty("Content-length", contentLength);
		connection.setRequestProperty(this.apitokenkey, apitokenvalue);
		connection.setUseCaches(false);
		connection.setAllowUserInteraction(false);
		connection.setConnectTimeout(apitimeout);
		connection.setReadTimeout(apitimeout);

		connection.setDoInput(doInput);
		connection.setDoOutput(doOutput);

		return connection;
	}

}
