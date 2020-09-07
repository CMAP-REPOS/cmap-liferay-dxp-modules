package contact.constantcontact.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class Address {
	private String addressType;
	private String city;
	private String countryCode;
	private String id;
	private String line1;
	private String line2;
	private String line3;
	private String postalCode;
	private String stateCode;
	private String state;
	private String subPostalCode;

	public Address() {
	}

	/**
	 * REQUIRED when including an address; Mailing address type, valid values are PERSONAL, BUSINESS
	 * 
	 * @return
	 */
	@JsonProperty("address_type")
	public String getAddressType() {
		return addressType;
	}

	/**
	 * The city of the contact's address
	 * 
	 * @return
	 */
	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	/**
	 * Standard ISO 3166-1 2-letter country code for the contact
	 * 
	 * @return
	 */
	@JsonProperty("country_code")
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Unique ID for the physical address
	 * 
	 * @return
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * Street Address line 1
	 * 
	 * @return
	 */
	@JsonProperty("line1")
	public String getLine1() {
		return line1;
	}

	/**
	 * Street Address line 2
	 * 
	 * @return
	 */
	@JsonProperty("line2")
	public String getLine2() {
		return line2;
	}

	/**
	 * Street Address line 3
	 * 
	 * @return
	 */
	@JsonProperty("line3")
	public String getLine3() {
		return line3;
	}

	/**
	 * The contact's Postal ZIP code. NOTE: For postal codes with white space between characters,
	 * the characters after the first white space are broken out into the sub_postal_code field.
	 * 
	 * @return
	 */
	@JsonProperty("postal_code")
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * This field accepts any state or province name. However, if a valid 2 letter US state or
	 * Canadian province is entered in the state_code field, the system resolves the code to a state
	 * or province and overwrites any name manually entered in this field.
	 * 
	 * @return
	 */
	@JsonProperty("state")
	public String getState() {
		return state;
	}

	/**
	 * Standard 2 letter abbreviation for contact's state or Canadian province; if state_code is
	 * entered, the system overwrites the state property with the resolved US state or Canadien
	 * province name.
	 * 
	 * @return
	 */
	@JsonProperty("state_code")
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * Use if Contact address has a sub-Postal ZIP code. See NOTE in postal_code about ZIP codes
	 * with white spaces.
	 * 
	 * @return
	 */
	@JsonProperty("sub_postal_code")
	public String getSubPostalCode() {
		return subPostalCode;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public void setSubPostalCode(String subPostalCode) {
		this.subPostalCode = subPostalCode;
	}

}
