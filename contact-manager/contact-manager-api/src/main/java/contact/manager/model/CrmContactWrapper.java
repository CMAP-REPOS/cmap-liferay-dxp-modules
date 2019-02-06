/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package contact.manager.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CrmContact}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContact
 * @generated
 */
@ProviderType
public class CrmContactWrapper implements CrmContact, ModelWrapper<CrmContact> {
	public CrmContactWrapper(CrmContact crmContact) {
		_crmContact = crmContact;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmContact.class;
	}

	@Override
	public String getModelClassName() {
		return CrmContact.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmContactId", getCrmContactId());
		attributes.put("constantContactId", getConstantContactId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("prefix", getPrefix());
		attributes.put("salutation", getSalutation());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("organization", getOrganization());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("primaryAddress1", getPrimaryAddress1());
		attributes.put("primaryAddress2", getPrimaryAddress2());
		attributes.put("primaryAddressCity", getPrimaryAddressCity());
		attributes.put("primaryAddressState", getPrimaryAddressState());
		attributes.put("primaryAddressZip", getPrimaryAddressZip());
		attributes.put("primaryAddressCounty", getPrimaryAddressCounty());
		attributes.put("primaryAddressCountry", getPrimaryAddressCountry());
		attributes.put("secondaryAddress1", getSecondaryAddress1());
		attributes.put("secondaryAddress2", getSecondaryAddress2());
		attributes.put("secondaryAddressCity", getSecondaryAddressCity());
		attributes.put("secondaryAddressState", getSecondaryAddressState());
		attributes.put("secondaryAddressZip", getSecondaryAddressZip());
		attributes.put("secondaryAddressCounty", getSecondaryAddressCounty());
		attributes.put("secondaryAddressCountry", getSecondaryAddressCountry());
		attributes.put("primaryPhone", getPrimaryPhone());
		attributes.put("primaryPhoneExtension", getPrimaryPhoneExtension());
		attributes.put("primaryFax", getPrimaryFax());
		attributes.put("primaryCell", getPrimaryCell());
		attributes.put("primaryEmailAddress", getPrimaryEmailAddress());
		attributes.put("alternateContact", getAlternateContact());
		attributes.put("alternateEmail", getAlternateEmail());
		attributes.put("isVip", isIsVip());
		attributes.put("facebookId", getFacebookId());
		attributes.put("twitterHandle", getTwitterHandle());
		attributes.put("linkedInUrl", getLinkedInUrl());
		attributes.put("status", getStatus());
		attributes.put("kioskUuid", getKioskUuid());
		attributes.put("imageFileEntryId", getImageFileEntryId());
		attributes.put("tagsList", getTagsList());
		attributes.put("groupsList", getGroupsList());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long crmContactId = (Long)attributes.get("crmContactId");

		if (crmContactId != null) {
			setCrmContactId(crmContactId);
		}

		Long constantContactId = (Long)attributes.get("constantContactId");

		if (constantContactId != null) {
			setConstantContactId(constantContactId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String prefix = (String)attributes.get("prefix");

		if (prefix != null) {
			setPrefix(prefix);
		}

		String salutation = (String)attributes.get("salutation");

		if (salutation != null) {
			setSalutation(salutation);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		String primaryAddress1 = (String)attributes.get("primaryAddress1");

		if (primaryAddress1 != null) {
			setPrimaryAddress1(primaryAddress1);
		}

		String primaryAddress2 = (String)attributes.get("primaryAddress2");

		if (primaryAddress2 != null) {
			setPrimaryAddress2(primaryAddress2);
		}

		String primaryAddressCity = (String)attributes.get("primaryAddressCity");

		if (primaryAddressCity != null) {
			setPrimaryAddressCity(primaryAddressCity);
		}

		String primaryAddressState = (String)attributes.get(
				"primaryAddressState");

		if (primaryAddressState != null) {
			setPrimaryAddressState(primaryAddressState);
		}

		String primaryAddressZip = (String)attributes.get("primaryAddressZip");

		if (primaryAddressZip != null) {
			setPrimaryAddressZip(primaryAddressZip);
		}

		String primaryAddressCounty = (String)attributes.get(
				"primaryAddressCounty");

		if (primaryAddressCounty != null) {
			setPrimaryAddressCounty(primaryAddressCounty);
		}

		String primaryAddressCountry = (String)attributes.get(
				"primaryAddressCountry");

		if (primaryAddressCountry != null) {
			setPrimaryAddressCountry(primaryAddressCountry);
		}

		String secondaryAddress1 = (String)attributes.get("secondaryAddress1");

		if (secondaryAddress1 != null) {
			setSecondaryAddress1(secondaryAddress1);
		}

		String secondaryAddress2 = (String)attributes.get("secondaryAddress2");

		if (secondaryAddress2 != null) {
			setSecondaryAddress2(secondaryAddress2);
		}

		String secondaryAddressCity = (String)attributes.get(
				"secondaryAddressCity");

		if (secondaryAddressCity != null) {
			setSecondaryAddressCity(secondaryAddressCity);
		}

		String secondaryAddressState = (String)attributes.get(
				"secondaryAddressState");

		if (secondaryAddressState != null) {
			setSecondaryAddressState(secondaryAddressState);
		}

		String secondaryAddressZip = (String)attributes.get(
				"secondaryAddressZip");

		if (secondaryAddressZip != null) {
			setSecondaryAddressZip(secondaryAddressZip);
		}

		String secondaryAddressCounty = (String)attributes.get(
				"secondaryAddressCounty");

		if (secondaryAddressCounty != null) {
			setSecondaryAddressCounty(secondaryAddressCounty);
		}

		String secondaryAddressCountry = (String)attributes.get(
				"secondaryAddressCountry");

		if (secondaryAddressCountry != null) {
			setSecondaryAddressCountry(secondaryAddressCountry);
		}

		String primaryPhone = (String)attributes.get("primaryPhone");

		if (primaryPhone != null) {
			setPrimaryPhone(primaryPhone);
		}

		String primaryPhoneExtension = (String)attributes.get(
				"primaryPhoneExtension");

		if (primaryPhoneExtension != null) {
			setPrimaryPhoneExtension(primaryPhoneExtension);
		}

		String primaryFax = (String)attributes.get("primaryFax");

		if (primaryFax != null) {
			setPrimaryFax(primaryFax);
		}

		String primaryCell = (String)attributes.get("primaryCell");

		if (primaryCell != null) {
			setPrimaryCell(primaryCell);
		}

		String primaryEmailAddress = (String)attributes.get(
				"primaryEmailAddress");

		if (primaryEmailAddress != null) {
			setPrimaryEmailAddress(primaryEmailAddress);
		}

		String alternateContact = (String)attributes.get("alternateContact");

		if (alternateContact != null) {
			setAlternateContact(alternateContact);
		}

		String alternateEmail = (String)attributes.get("alternateEmail");

		if (alternateEmail != null) {
			setAlternateEmail(alternateEmail);
		}

		Boolean isVip = (Boolean)attributes.get("isVip");

		if (isVip != null) {
			setIsVip(isVip);
		}

		String facebookId = (String)attributes.get("facebookId");

		if (facebookId != null) {
			setFacebookId(facebookId);
		}

		String twitterHandle = (String)attributes.get("twitterHandle");

		if (twitterHandle != null) {
			setTwitterHandle(twitterHandle);
		}

		String linkedInUrl = (String)attributes.get("linkedInUrl");

		if (linkedInUrl != null) {
			setLinkedInUrl(linkedInUrl);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String kioskUuid = (String)attributes.get("kioskUuid");

		if (kioskUuid != null) {
			setKioskUuid(kioskUuid);
		}

		Long imageFileEntryId = (Long)attributes.get("imageFileEntryId");

		if (imageFileEntryId != null) {
			setImageFileEntryId(imageFileEntryId);
		}

		String tagsList = (String)attributes.get("tagsList");

		if (tagsList != null) {
			setTagsList(tagsList);
		}

		String groupsList = (String)attributes.get("groupsList");

		if (groupsList != null) {
			setGroupsList(groupsList);
		}
	}

	@Override
	public Object clone() {
		return new CrmContactWrapper((CrmContact)_crmContact.clone());
	}

	@Override
	public int compareTo(CrmContact crmContact) {
		return _crmContact.compareTo(crmContact);
	}

	/**
	* Returns the alternate contact of this CRM Contact.
	*
	* @return the alternate contact of this CRM Contact
	*/
	@Override
	public String getAlternateContact() {
		return _crmContact.getAlternateContact();
	}

	/**
	* Returns the alternate email of this CRM Contact.
	*
	* @return the alternate email of this CRM Contact
	*/
	@Override
	public String getAlternateEmail() {
		return _crmContact.getAlternateEmail();
	}

	/**
	* Returns the company ID of this CRM Contact.
	*
	* @return the company ID of this CRM Contact
	*/
	@Override
	public long getCompanyId() {
		return _crmContact.getCompanyId();
	}

	/**
	* Returns the constant contact ID of this CRM Contact.
	*
	* @return the constant contact ID of this CRM Contact
	*/
	@Override
	public long getConstantContactId() {
		return _crmContact.getConstantContactId();
	}

	/**
	* Returns the create date of this CRM Contact.
	*
	* @return the create date of this CRM Contact
	*/
	@Override
	public Date getCreateDate() {
		return _crmContact.getCreateDate();
	}

	/**
	* Returns the crm contact ID of this CRM Contact.
	*
	* @return the crm contact ID of this CRM Contact
	*/
	@Override
	public long getCrmContactId() {
		return _crmContact.getCrmContactId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmContact.getExpandoBridge();
	}

	/**
	* Returns the facebook ID of this CRM Contact.
	*
	* @return the facebook ID of this CRM Contact
	*/
	@Override
	public String getFacebookId() {
		return _crmContact.getFacebookId();
	}

	/**
	* Returns the first name of this CRM Contact.
	*
	* @return the first name of this CRM Contact
	*/
	@Override
	public String getFirstName() {
		return _crmContact.getFirstName();
	}

	/**
	* Returns the group ID of this CRM Contact.
	*
	* @return the group ID of this CRM Contact
	*/
	@Override
	public long getGroupId() {
		return _crmContact.getGroupId();
	}

	/**
	* Returns the groups list of this CRM Contact.
	*
	* @return the groups list of this CRM Contact
	*/
	@Override
	public String getGroupsList() {
		return _crmContact.getGroupsList();
	}

	/**
	* Returns the image file entry ID of this CRM Contact.
	*
	* @return the image file entry ID of this CRM Contact
	*/
	@Override
	public long getImageFileEntryId() {
		return _crmContact.getImageFileEntryId();
	}

	/**
	* Returns the is vip of this CRM Contact.
	*
	* @return the is vip of this CRM Contact
	*/
	@Override
	public boolean getIsVip() {
		return _crmContact.getIsVip();
	}

	/**
	* Returns the job title of this CRM Contact.
	*
	* @return the job title of this CRM Contact
	*/
	@Override
	public String getJobTitle() {
		return _crmContact.getJobTitle();
	}

	/**
	* Returns the kiosk uuid of this CRM Contact.
	*
	* @return the kiosk uuid of this CRM Contact
	*/
	@Override
	public String getKioskUuid() {
		return _crmContact.getKioskUuid();
	}

	/**
	* Returns the last name of this CRM Contact.
	*
	* @return the last name of this CRM Contact
	*/
	@Override
	public String getLastName() {
		return _crmContact.getLastName();
	}

	/**
	* Returns the linked in url of this CRM Contact.
	*
	* @return the linked in url of this CRM Contact
	*/
	@Override
	public String getLinkedInUrl() {
		return _crmContact.getLinkedInUrl();
	}

	/**
	* Returns the middle name of this CRM Contact.
	*
	* @return the middle name of this CRM Contact
	*/
	@Override
	public String getMiddleName() {
		return _crmContact.getMiddleName();
	}

	/**
	* Returns the modified date of this CRM Contact.
	*
	* @return the modified date of this CRM Contact
	*/
	@Override
	public Date getModifiedDate() {
		return _crmContact.getModifiedDate();
	}

	/**
	* Returns the organization of this CRM Contact.
	*
	* @return the organization of this CRM Contact
	*/
	@Override
	public String getOrganization() {
		return _crmContact.getOrganization();
	}

	/**
	* Returns the prefix of this CRM Contact.
	*
	* @return the prefix of this CRM Contact
	*/
	@Override
	public String getPrefix() {
		return _crmContact.getPrefix();
	}

	/**
	* Returns the primary address1 of this CRM Contact.
	*
	* @return the primary address1 of this CRM Contact
	*/
	@Override
	public String getPrimaryAddress1() {
		return _crmContact.getPrimaryAddress1();
	}

	/**
	* Returns the primary address2 of this CRM Contact.
	*
	* @return the primary address2 of this CRM Contact
	*/
	@Override
	public String getPrimaryAddress2() {
		return _crmContact.getPrimaryAddress2();
	}

	/**
	* Returns the primary address city of this CRM Contact.
	*
	* @return the primary address city of this CRM Contact
	*/
	@Override
	public String getPrimaryAddressCity() {
		return _crmContact.getPrimaryAddressCity();
	}

	/**
	* Returns the primary address country of this CRM Contact.
	*
	* @return the primary address country of this CRM Contact
	*/
	@Override
	public String getPrimaryAddressCountry() {
		return _crmContact.getPrimaryAddressCountry();
	}

	/**
	* Returns the primary address county of this CRM Contact.
	*
	* @return the primary address county of this CRM Contact
	*/
	@Override
	public String getPrimaryAddressCounty() {
		return _crmContact.getPrimaryAddressCounty();
	}

	/**
	* Returns the primary address state of this CRM Contact.
	*
	* @return the primary address state of this CRM Contact
	*/
	@Override
	public String getPrimaryAddressState() {
		return _crmContact.getPrimaryAddressState();
	}

	/**
	* Returns the primary address zip of this CRM Contact.
	*
	* @return the primary address zip of this CRM Contact
	*/
	@Override
	public String getPrimaryAddressZip() {
		return _crmContact.getPrimaryAddressZip();
	}

	/**
	* Returns the primary cell of this CRM Contact.
	*
	* @return the primary cell of this CRM Contact
	*/
	@Override
	public String getPrimaryCell() {
		return _crmContact.getPrimaryCell();
	}

	/**
	* Returns the primary email address of this CRM Contact.
	*
	* @return the primary email address of this CRM Contact
	*/
	@Override
	public String getPrimaryEmailAddress() {
		return _crmContact.getPrimaryEmailAddress();
	}

	/**
	* Returns the primary fax of this CRM Contact.
	*
	* @return the primary fax of this CRM Contact
	*/
	@Override
	public String getPrimaryFax() {
		return _crmContact.getPrimaryFax();
	}

	/**
	* Returns the primary key of this CRM Contact.
	*
	* @return the primary key of this CRM Contact
	*/
	@Override
	public long getPrimaryKey() {
		return _crmContact.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmContact.getPrimaryKeyObj();
	}

	/**
	* Returns the primary phone of this CRM Contact.
	*
	* @return the primary phone of this CRM Contact
	*/
	@Override
	public String getPrimaryPhone() {
		return _crmContact.getPrimaryPhone();
	}

	/**
	* Returns the primary phone extension of this CRM Contact.
	*
	* @return the primary phone extension of this CRM Contact
	*/
	@Override
	public String getPrimaryPhoneExtension() {
		return _crmContact.getPrimaryPhoneExtension();
	}

	/**
	* Returns the salutation of this CRM Contact.
	*
	* @return the salutation of this CRM Contact
	*/
	@Override
	public String getSalutation() {
		return _crmContact.getSalutation();
	}

	/**
	* Returns the secondary address1 of this CRM Contact.
	*
	* @return the secondary address1 of this CRM Contact
	*/
	@Override
	public String getSecondaryAddress1() {
		return _crmContact.getSecondaryAddress1();
	}

	/**
	* Returns the secondary address2 of this CRM Contact.
	*
	* @return the secondary address2 of this CRM Contact
	*/
	@Override
	public String getSecondaryAddress2() {
		return _crmContact.getSecondaryAddress2();
	}

	/**
	* Returns the secondary address city of this CRM Contact.
	*
	* @return the secondary address city of this CRM Contact
	*/
	@Override
	public String getSecondaryAddressCity() {
		return _crmContact.getSecondaryAddressCity();
	}

	/**
	* Returns the secondary address country of this CRM Contact.
	*
	* @return the secondary address country of this CRM Contact
	*/
	@Override
	public String getSecondaryAddressCountry() {
		return _crmContact.getSecondaryAddressCountry();
	}

	/**
	* Returns the secondary address county of this CRM Contact.
	*
	* @return the secondary address county of this CRM Contact
	*/
	@Override
	public String getSecondaryAddressCounty() {
		return _crmContact.getSecondaryAddressCounty();
	}

	/**
	* Returns the secondary address state of this CRM Contact.
	*
	* @return the secondary address state of this CRM Contact
	*/
	@Override
	public String getSecondaryAddressState() {
		return _crmContact.getSecondaryAddressState();
	}

	/**
	* Returns the secondary address zip of this CRM Contact.
	*
	* @return the secondary address zip of this CRM Contact
	*/
	@Override
	public String getSecondaryAddressZip() {
		return _crmContact.getSecondaryAddressZip();
	}

	/**
	* Returns the status of this CRM Contact.
	*
	* @return the status of this CRM Contact
	*/
	@Override
	public String getStatus() {
		return _crmContact.getStatus();
	}

	/**
	* Returns the tags list of this CRM Contact.
	*
	* @return the tags list of this CRM Contact
	*/
	@Override
	public String getTagsList() {
		return _crmContact.getTagsList();
	}

	/**
	* Returns the twitter handle of this CRM Contact.
	*
	* @return the twitter handle of this CRM Contact
	*/
	@Override
	public String getTwitterHandle() {
		return _crmContact.getTwitterHandle();
	}

	/**
	* Returns the user ID of this CRM Contact.
	*
	* @return the user ID of this CRM Contact
	*/
	@Override
	public long getUserId() {
		return _crmContact.getUserId();
	}

	/**
	* Returns the user name of this CRM Contact.
	*
	* @return the user name of this CRM Contact
	*/
	@Override
	public String getUserName() {
		return _crmContact.getUserName();
	}

	/**
	* Returns the user uuid of this CRM Contact.
	*
	* @return the user uuid of this CRM Contact
	*/
	@Override
	public String getUserUuid() {
		return _crmContact.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM Contact.
	*
	* @return the uuid of this CRM Contact
	*/
	@Override
	public String getUuid() {
		return _crmContact.getUuid();
	}

	@Override
	public int hashCode() {
		return _crmContact.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _crmContact.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmContact.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this CRM Contact is is vip.
	*
	* @return <code>true</code> if this CRM Contact is is vip; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsVip() {
		return _crmContact.isIsVip();
	}

	@Override
	public boolean isNew() {
		return _crmContact.isNew();
	}

	@Override
	public void persist() {
		_crmContact.persist();
	}

	/**
	* Sets the alternate contact of this CRM Contact.
	*
	* @param alternateContact the alternate contact of this CRM Contact
	*/
	@Override
	public void setAlternateContact(String alternateContact) {
		_crmContact.setAlternateContact(alternateContact);
	}

	/**
	* Sets the alternate email of this CRM Contact.
	*
	* @param alternateEmail the alternate email of this CRM Contact
	*/
	@Override
	public void setAlternateEmail(String alternateEmail) {
		_crmContact.setAlternateEmail(alternateEmail);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmContact.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM Contact.
	*
	* @param companyId the company ID of this CRM Contact
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmContact.setCompanyId(companyId);
	}

	/**
	* Sets the constant contact ID of this CRM Contact.
	*
	* @param constantContactId the constant contact ID of this CRM Contact
	*/
	@Override
	public void setConstantContactId(long constantContactId) {
		_crmContact.setConstantContactId(constantContactId);
	}

	/**
	* Sets the create date of this CRM Contact.
	*
	* @param createDate the create date of this CRM Contact
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmContact.setCreateDate(createDate);
	}

	/**
	* Sets the crm contact ID of this CRM Contact.
	*
	* @param crmContactId the crm contact ID of this CRM Contact
	*/
	@Override
	public void setCrmContactId(long crmContactId) {
		_crmContact.setCrmContactId(crmContactId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmContact.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmContact.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmContact.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the facebook ID of this CRM Contact.
	*
	* @param facebookId the facebook ID of this CRM Contact
	*/
	@Override
	public void setFacebookId(String facebookId) {
		_crmContact.setFacebookId(facebookId);
	}

	/**
	* Sets the first name of this CRM Contact.
	*
	* @param firstName the first name of this CRM Contact
	*/
	@Override
	public void setFirstName(String firstName) {
		_crmContact.setFirstName(firstName);
	}

	/**
	* Sets the group ID of this CRM Contact.
	*
	* @param groupId the group ID of this CRM Contact
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmContact.setGroupId(groupId);
	}

	/**
	* Sets the groups list of this CRM Contact.
	*
	* @param groupsList the groups list of this CRM Contact
	*/
	@Override
	public void setGroupsList(String groupsList) {
		_crmContact.setGroupsList(groupsList);
	}

	/**
	* Sets the image file entry ID of this CRM Contact.
	*
	* @param imageFileEntryId the image file entry ID of this CRM Contact
	*/
	@Override
	public void setImageFileEntryId(long imageFileEntryId) {
		_crmContact.setImageFileEntryId(imageFileEntryId);
	}

	/**
	* Sets whether this CRM Contact is is vip.
	*
	* @param isVip the is vip of this CRM Contact
	*/
	@Override
	public void setIsVip(boolean isVip) {
		_crmContact.setIsVip(isVip);
	}

	/**
	* Sets the job title of this CRM Contact.
	*
	* @param jobTitle the job title of this CRM Contact
	*/
	@Override
	public void setJobTitle(String jobTitle) {
		_crmContact.setJobTitle(jobTitle);
	}

	/**
	* Sets the kiosk uuid of this CRM Contact.
	*
	* @param kioskUuid the kiosk uuid of this CRM Contact
	*/
	@Override
	public void setKioskUuid(String kioskUuid) {
		_crmContact.setKioskUuid(kioskUuid);
	}

	/**
	* Sets the last name of this CRM Contact.
	*
	* @param lastName the last name of this CRM Contact
	*/
	@Override
	public void setLastName(String lastName) {
		_crmContact.setLastName(lastName);
	}

	/**
	* Sets the linked in url of this CRM Contact.
	*
	* @param linkedInUrl the linked in url of this CRM Contact
	*/
	@Override
	public void setLinkedInUrl(String linkedInUrl) {
		_crmContact.setLinkedInUrl(linkedInUrl);
	}

	/**
	* Sets the middle name of this CRM Contact.
	*
	* @param middleName the middle name of this CRM Contact
	*/
	@Override
	public void setMiddleName(String middleName) {
		_crmContact.setMiddleName(middleName);
	}

	/**
	* Sets the modified date of this CRM Contact.
	*
	* @param modifiedDate the modified date of this CRM Contact
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmContact.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmContact.setNew(n);
	}

	/**
	* Sets the organization of this CRM Contact.
	*
	* @param organization the organization of this CRM Contact
	*/
	@Override
	public void setOrganization(String organization) {
		_crmContact.setOrganization(organization);
	}

	/**
	* Sets the prefix of this CRM Contact.
	*
	* @param prefix the prefix of this CRM Contact
	*/
	@Override
	public void setPrefix(String prefix) {
		_crmContact.setPrefix(prefix);
	}

	/**
	* Sets the primary address1 of this CRM Contact.
	*
	* @param primaryAddress1 the primary address1 of this CRM Contact
	*/
	@Override
	public void setPrimaryAddress1(String primaryAddress1) {
		_crmContact.setPrimaryAddress1(primaryAddress1);
	}

	/**
	* Sets the primary address2 of this CRM Contact.
	*
	* @param primaryAddress2 the primary address2 of this CRM Contact
	*/
	@Override
	public void setPrimaryAddress2(String primaryAddress2) {
		_crmContact.setPrimaryAddress2(primaryAddress2);
	}

	/**
	* Sets the primary address city of this CRM Contact.
	*
	* @param primaryAddressCity the primary address city of this CRM Contact
	*/
	@Override
	public void setPrimaryAddressCity(String primaryAddressCity) {
		_crmContact.setPrimaryAddressCity(primaryAddressCity);
	}

	/**
	* Sets the primary address country of this CRM Contact.
	*
	* @param primaryAddressCountry the primary address country of this CRM Contact
	*/
	@Override
	public void setPrimaryAddressCountry(String primaryAddressCountry) {
		_crmContact.setPrimaryAddressCountry(primaryAddressCountry);
	}

	/**
	* Sets the primary address county of this CRM Contact.
	*
	* @param primaryAddressCounty the primary address county of this CRM Contact
	*/
	@Override
	public void setPrimaryAddressCounty(String primaryAddressCounty) {
		_crmContact.setPrimaryAddressCounty(primaryAddressCounty);
	}

	/**
	* Sets the primary address state of this CRM Contact.
	*
	* @param primaryAddressState the primary address state of this CRM Contact
	*/
	@Override
	public void setPrimaryAddressState(String primaryAddressState) {
		_crmContact.setPrimaryAddressState(primaryAddressState);
	}

	/**
	* Sets the primary address zip of this CRM Contact.
	*
	* @param primaryAddressZip the primary address zip of this CRM Contact
	*/
	@Override
	public void setPrimaryAddressZip(String primaryAddressZip) {
		_crmContact.setPrimaryAddressZip(primaryAddressZip);
	}

	/**
	* Sets the primary cell of this CRM Contact.
	*
	* @param primaryCell the primary cell of this CRM Contact
	*/
	@Override
	public void setPrimaryCell(String primaryCell) {
		_crmContact.setPrimaryCell(primaryCell);
	}

	/**
	* Sets the primary email address of this CRM Contact.
	*
	* @param primaryEmailAddress the primary email address of this CRM Contact
	*/
	@Override
	public void setPrimaryEmailAddress(String primaryEmailAddress) {
		_crmContact.setPrimaryEmailAddress(primaryEmailAddress);
	}

	/**
	* Sets the primary fax of this CRM Contact.
	*
	* @param primaryFax the primary fax of this CRM Contact
	*/
	@Override
	public void setPrimaryFax(String primaryFax) {
		_crmContact.setPrimaryFax(primaryFax);
	}

	/**
	* Sets the primary key of this CRM Contact.
	*
	* @param primaryKey the primary key of this CRM Contact
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmContact.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmContact.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the primary phone of this CRM Contact.
	*
	* @param primaryPhone the primary phone of this CRM Contact
	*/
	@Override
	public void setPrimaryPhone(String primaryPhone) {
		_crmContact.setPrimaryPhone(primaryPhone);
	}

	/**
	* Sets the primary phone extension of this CRM Contact.
	*
	* @param primaryPhoneExtension the primary phone extension of this CRM Contact
	*/
	@Override
	public void setPrimaryPhoneExtension(String primaryPhoneExtension) {
		_crmContact.setPrimaryPhoneExtension(primaryPhoneExtension);
	}

	/**
	* Sets the salutation of this CRM Contact.
	*
	* @param salutation the salutation of this CRM Contact
	*/
	@Override
	public void setSalutation(String salutation) {
		_crmContact.setSalutation(salutation);
	}

	/**
	* Sets the secondary address1 of this CRM Contact.
	*
	* @param secondaryAddress1 the secondary address1 of this CRM Contact
	*/
	@Override
	public void setSecondaryAddress1(String secondaryAddress1) {
		_crmContact.setSecondaryAddress1(secondaryAddress1);
	}

	/**
	* Sets the secondary address2 of this CRM Contact.
	*
	* @param secondaryAddress2 the secondary address2 of this CRM Contact
	*/
	@Override
	public void setSecondaryAddress2(String secondaryAddress2) {
		_crmContact.setSecondaryAddress2(secondaryAddress2);
	}

	/**
	* Sets the secondary address city of this CRM Contact.
	*
	* @param secondaryAddressCity the secondary address city of this CRM Contact
	*/
	@Override
	public void setSecondaryAddressCity(String secondaryAddressCity) {
		_crmContact.setSecondaryAddressCity(secondaryAddressCity);
	}

	/**
	* Sets the secondary address country of this CRM Contact.
	*
	* @param secondaryAddressCountry the secondary address country of this CRM Contact
	*/
	@Override
	public void setSecondaryAddressCountry(String secondaryAddressCountry) {
		_crmContact.setSecondaryAddressCountry(secondaryAddressCountry);
	}

	/**
	* Sets the secondary address county of this CRM Contact.
	*
	* @param secondaryAddressCounty the secondary address county of this CRM Contact
	*/
	@Override
	public void setSecondaryAddressCounty(String secondaryAddressCounty) {
		_crmContact.setSecondaryAddressCounty(secondaryAddressCounty);
	}

	/**
	* Sets the secondary address state of this CRM Contact.
	*
	* @param secondaryAddressState the secondary address state of this CRM Contact
	*/
	@Override
	public void setSecondaryAddressState(String secondaryAddressState) {
		_crmContact.setSecondaryAddressState(secondaryAddressState);
	}

	/**
	* Sets the secondary address zip of this CRM Contact.
	*
	* @param secondaryAddressZip the secondary address zip of this CRM Contact
	*/
	@Override
	public void setSecondaryAddressZip(String secondaryAddressZip) {
		_crmContact.setSecondaryAddressZip(secondaryAddressZip);
	}

	/**
	* Sets the status of this CRM Contact.
	*
	* @param status the status of this CRM Contact
	*/
	@Override
	public void setStatus(String status) {
		_crmContact.setStatus(status);
	}

	/**
	* Sets the tags list of this CRM Contact.
	*
	* @param tagsList the tags list of this CRM Contact
	*/
	@Override
	public void setTagsList(String tagsList) {
		_crmContact.setTagsList(tagsList);
	}

	/**
	* Sets the twitter handle of this CRM Contact.
	*
	* @param twitterHandle the twitter handle of this CRM Contact
	*/
	@Override
	public void setTwitterHandle(String twitterHandle) {
		_crmContact.setTwitterHandle(twitterHandle);
	}

	/**
	* Sets the user ID of this CRM Contact.
	*
	* @param userId the user ID of this CRM Contact
	*/
	@Override
	public void setUserId(long userId) {
		_crmContact.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM Contact.
	*
	* @param userName the user name of this CRM Contact
	*/
	@Override
	public void setUserName(String userName) {
		_crmContact.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM Contact.
	*
	* @param userUuid the user uuid of this CRM Contact
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_crmContact.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM Contact.
	*
	* @param uuid the uuid of this CRM Contact
	*/
	@Override
	public void setUuid(String uuid) {
		_crmContact.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CrmContact> toCacheModel() {
		return _crmContact.toCacheModel();
	}

	@Override
	public CrmContact toEscapedModel() {
		return new CrmContactWrapper(_crmContact.toEscapedModel());
	}

	@Override
	public String toString() {
		return _crmContact.toString();
	}

	@Override
	public CrmContact toUnescapedModel() {
		return new CrmContactWrapper(_crmContact.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _crmContact.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmContactWrapper)) {
			return false;
		}

		CrmContactWrapper crmContactWrapper = (CrmContactWrapper)obj;

		if (Objects.equals(_crmContact, crmContactWrapper._crmContact)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmContact.getStagedModelType();
	}

	@Override
	public CrmContact getWrappedModel() {
		return _crmContact;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmContact.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmContact.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmContact.resetOriginalValues();
	}

	private final CrmContact _crmContact;
}