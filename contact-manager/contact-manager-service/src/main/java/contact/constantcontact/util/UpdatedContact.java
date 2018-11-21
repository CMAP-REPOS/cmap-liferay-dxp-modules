package contact.constantcontact.util;

import java.util.Date;

public class UpdatedContact {

	private Date createDate;
	private Date modifiedDate;
	private long contactId;
	private String action;
	private String firstName;
	private String lastName;
	private String primaryAddress1;
	private String primaryAddressCity;
	private String primaryAddressState;
	private String primaryAddressZip;
	private String primaryPhone;
	private String primaryEmailAddress;
	private long userId;
	private String userFirstName;
	private String userLastName;
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public long getContactId() {
		return contactId;
	}
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPrimaryAddress1() {
		return primaryAddress1;
	}
	public void setPrimaryAddress1(String primaryAddress1) {
		this.primaryAddress1 = primaryAddress1;
	}
	public String getPrimaryAddressCity() {
		return primaryAddressCity;
	}
	public void setPrimaryAddressCity(String primaryAddressCity) {
		this.primaryAddressCity = primaryAddressCity;
	}
	public String getPrimaryAddressState() {
		return primaryAddressState;
	}
	public void setPrimaryAddressState(String primaryAddressState) {
		this.primaryAddressState = primaryAddressState;
	}
	public String getPrimaryAddressZip() {
		return primaryAddressZip;
	}
	public void setPrimaryAddressZip(String primaryAddressZip) {
		this.primaryAddressZip = primaryAddressZip;
	}
	public String getPrimaryPhone() {
		return primaryPhone;
	}
	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}
	public String getPrimaryEmailAddress() {
		return primaryEmailAddress;
	}
	public void setPrimaryEmailAddress(String primaryEmailAddress) {
		this.primaryEmailAddress = primaryEmailAddress;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
}
