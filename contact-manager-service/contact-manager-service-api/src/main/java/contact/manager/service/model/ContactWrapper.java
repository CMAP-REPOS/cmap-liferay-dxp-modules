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

package contact.manager.service.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Contact}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Contact
 * @generated
 */
@ProviderType
public class ContactWrapper implements Contact, ModelWrapper<Contact> {
	public ContactWrapper(Contact contact) {
		_contact = contact;
	}

	@Override
	public Class<?> getModelClass() {
		return Contact.class;
	}

	@Override
	public String getModelClassName() {
		return Contact.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contactId", getContactId());
		attributes.put("constantContactId", getConstantContactId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
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
		attributes.put("primaryFax", getPrimaryFax());
		attributes.put("primaryCell", getPrimaryCell());
		attributes.put("primaryEmailAddress", getPrimaryEmailAddress());
		attributes.put("alternateContact", getAlternateContact());
		attributes.put("alternateEmail", getAlternateEmail());
		attributes.put("isVip", getIsVip());
		attributes.put("facebookId", getFacebookId());
		attributes.put("twitterHandle", getTwitterHandle());
		attributes.put("linkedInUrl", getLinkedInUrl());
		attributes.put("status", getStatus());
		attributes.put("kioskUuid", getKioskUuid());
		attributes.put("imageFileEntryId", getImageFileEntryId());
		attributes.put("tagsList", getTagsList());
		attributes.put("subGroupsList", getSubGroupsList());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
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

		String subGroupsList = (String)attributes.get("subGroupsList");

		if (subGroupsList != null) {
			setSubGroupsList(subGroupsList);
		}
	}

	/**
	* Returns the is vip of this contact.
	*
	* @return the is vip of this contact
	*/
	@Override
	public boolean getIsVip() {
		return _contact.getIsVip();
	}

	@Override
	public boolean isCachedModel() {
		return _contact.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _contact.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this contact is is vip.
	*
	* @return <code>true</code> if this contact is is vip; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsVip() {
		return _contact.isIsVip();
	}

	@Override
	public boolean isNew() {
		return _contact.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _contact.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.Contact> toCacheModel() {
		return _contact.toCacheModel();
	}

	@Override
	public contact.manager.service.model.Contact toEscapedModel() {
		return new ContactWrapper(_contact.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.Contact toUnescapedModel() {
		return new ContactWrapper(_contact.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.service.model.Contact contact) {
		return _contact.compareTo(contact);
	}

	@Override
	public int hashCode() {
		return _contact.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contact.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ContactWrapper((Contact)_contact.clone());
	}

	/**
	* Returns the alternate contact of this contact.
	*
	* @return the alternate contact of this contact
	*/
	@Override
	public java.lang.String getAlternateContact() {
		return _contact.getAlternateContact();
	}

	/**
	* Returns the alternate email of this contact.
	*
	* @return the alternate email of this contact
	*/
	@Override
	public java.lang.String getAlternateEmail() {
		return _contact.getAlternateEmail();
	}

	/**
	* Returns the facebook ID of this contact.
	*
	* @return the facebook ID of this contact
	*/
	@Override
	public java.lang.String getFacebookId() {
		return _contact.getFacebookId();
	}

	/**
	* Returns the first name of this contact.
	*
	* @return the first name of this contact
	*/
	@Override
	public java.lang.String getFirstName() {
		return _contact.getFirstName();
	}

	/**
	* Returns the job title of this contact.
	*
	* @return the job title of this contact
	*/
	@Override
	public java.lang.String getJobTitle() {
		return _contact.getJobTitle();
	}

	/**
	* Returns the kiosk uuid of this contact.
	*
	* @return the kiosk uuid of this contact
	*/
	@Override
	public java.lang.String getKioskUuid() {
		return _contact.getKioskUuid();
	}

	/**
	* Returns the last name of this contact.
	*
	* @return the last name of this contact
	*/
	@Override
	public java.lang.String getLastName() {
		return _contact.getLastName();
	}

	/**
	* Returns the linked in url of this contact.
	*
	* @return the linked in url of this contact
	*/
	@Override
	public java.lang.String getLinkedInUrl() {
		return _contact.getLinkedInUrl();
	}

	/**
	* Returns the middle name of this contact.
	*
	* @return the middle name of this contact
	*/
	@Override
	public java.lang.String getMiddleName() {
		return _contact.getMiddleName();
	}

	/**
	* Returns the organization of this contact.
	*
	* @return the organization of this contact
	*/
	@Override
	public java.lang.String getOrganization() {
		return _contact.getOrganization();
	}

	/**
	* Returns the prefix of this contact.
	*
	* @return the prefix of this contact
	*/
	@Override
	public java.lang.String getPrefix() {
		return _contact.getPrefix();
	}

	/**
	* Returns the primary address1 of this contact.
	*
	* @return the primary address1 of this contact
	*/
	@Override
	public java.lang.String getPrimaryAddress1() {
		return _contact.getPrimaryAddress1();
	}

	/**
	* Returns the primary address2 of this contact.
	*
	* @return the primary address2 of this contact
	*/
	@Override
	public java.lang.String getPrimaryAddress2() {
		return _contact.getPrimaryAddress2();
	}

	/**
	* Returns the primary address city of this contact.
	*
	* @return the primary address city of this contact
	*/
	@Override
	public java.lang.String getPrimaryAddressCity() {
		return _contact.getPrimaryAddressCity();
	}

	/**
	* Returns the primary address country of this contact.
	*
	* @return the primary address country of this contact
	*/
	@Override
	public java.lang.String getPrimaryAddressCountry() {
		return _contact.getPrimaryAddressCountry();
	}

	/**
	* Returns the primary address county of this contact.
	*
	* @return the primary address county of this contact
	*/
	@Override
	public java.lang.String getPrimaryAddressCounty() {
		return _contact.getPrimaryAddressCounty();
	}

	/**
	* Returns the primary address state of this contact.
	*
	* @return the primary address state of this contact
	*/
	@Override
	public java.lang.String getPrimaryAddressState() {
		return _contact.getPrimaryAddressState();
	}

	/**
	* Returns the primary address zip of this contact.
	*
	* @return the primary address zip of this contact
	*/
	@Override
	public java.lang.String getPrimaryAddressZip() {
		return _contact.getPrimaryAddressZip();
	}

	/**
	* Returns the primary cell of this contact.
	*
	* @return the primary cell of this contact
	*/
	@Override
	public java.lang.String getPrimaryCell() {
		return _contact.getPrimaryCell();
	}

	/**
	* Returns the primary email address of this contact.
	*
	* @return the primary email address of this contact
	*/
	@Override
	public java.lang.String getPrimaryEmailAddress() {
		return _contact.getPrimaryEmailAddress();
	}

	/**
	* Returns the primary fax of this contact.
	*
	* @return the primary fax of this contact
	*/
	@Override
	public java.lang.String getPrimaryFax() {
		return _contact.getPrimaryFax();
	}

	/**
	* Returns the primary phone of this contact.
	*
	* @return the primary phone of this contact
	*/
	@Override
	public java.lang.String getPrimaryPhone() {
		return _contact.getPrimaryPhone();
	}

	/**
	* Returns the salutation of this contact.
	*
	* @return the salutation of this contact
	*/
	@Override
	public java.lang.String getSalutation() {
		return _contact.getSalutation();
	}

	/**
	* Returns the secondary address1 of this contact.
	*
	* @return the secondary address1 of this contact
	*/
	@Override
	public java.lang.String getSecondaryAddress1() {
		return _contact.getSecondaryAddress1();
	}

	/**
	* Returns the secondary address2 of this contact.
	*
	* @return the secondary address2 of this contact
	*/
	@Override
	public java.lang.String getSecondaryAddress2() {
		return _contact.getSecondaryAddress2();
	}

	/**
	* Returns the secondary address city of this contact.
	*
	* @return the secondary address city of this contact
	*/
	@Override
	public java.lang.String getSecondaryAddressCity() {
		return _contact.getSecondaryAddressCity();
	}

	/**
	* Returns the secondary address country of this contact.
	*
	* @return the secondary address country of this contact
	*/
	@Override
	public java.lang.String getSecondaryAddressCountry() {
		return _contact.getSecondaryAddressCountry();
	}

	/**
	* Returns the secondary address county of this contact.
	*
	* @return the secondary address county of this contact
	*/
	@Override
	public java.lang.String getSecondaryAddressCounty() {
		return _contact.getSecondaryAddressCounty();
	}

	/**
	* Returns the secondary address state of this contact.
	*
	* @return the secondary address state of this contact
	*/
	@Override
	public java.lang.String getSecondaryAddressState() {
		return _contact.getSecondaryAddressState();
	}

	/**
	* Returns the secondary address zip of this contact.
	*
	* @return the secondary address zip of this contact
	*/
	@Override
	public java.lang.String getSecondaryAddressZip() {
		return _contact.getSecondaryAddressZip();
	}

	/**
	* Returns the status of this contact.
	*
	* @return the status of this contact
	*/
	@Override
	public java.lang.String getStatus() {
		return _contact.getStatus();
	}

	/**
	* Returns the sub groups list of this contact.
	*
	* @return the sub groups list of this contact
	*/
	@Override
	public java.lang.String getSubGroupsList() {
		return _contact.getSubGroupsList();
	}

	/**
	* Returns the tags list of this contact.
	*
	* @return the tags list of this contact
	*/
	@Override
	public java.lang.String getTagsList() {
		return _contact.getTagsList();
	}

	/**
	* Returns the twitter handle of this contact.
	*
	* @return the twitter handle of this contact
	*/
	@Override
	public java.lang.String getTwitterHandle() {
		return _contact.getTwitterHandle();
	}

	/**
	* Returns the user uuid of this contact.
	*
	* @return the user uuid of this contact
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _contact.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _contact.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _contact.toXmlString();
	}

	/**
	* Returns the create date of this contact.
	*
	* @return the create date of this contact
	*/
	@Override
	public Date getCreateDate() {
		return _contact.getCreateDate();
	}

	/**
	* Returns the modified date of this contact.
	*
	* @return the modified date of this contact
	*/
	@Override
	public Date getModifiedDate() {
		return _contact.getModifiedDate();
	}

	/**
	* Returns the company ID of this contact.
	*
	* @return the company ID of this contact
	*/
	@Override
	public long getCompanyId() {
		return _contact.getCompanyId();
	}

	/**
	* Returns the constant contact ID of this contact.
	*
	* @return the constant contact ID of this contact
	*/
	@Override
	public long getConstantContactId() {
		return _contact.getConstantContactId();
	}

	/**
	* Returns the contact ID of this contact.
	*
	* @return the contact ID of this contact
	*/
	@Override
	public long getContactId() {
		return _contact.getContactId();
	}

	/**
	* Returns the group ID of this contact.
	*
	* @return the group ID of this contact
	*/
	@Override
	public long getGroupId() {
		return _contact.getGroupId();
	}

	/**
	* Returns the image file entry ID of this contact.
	*
	* @return the image file entry ID of this contact
	*/
	@Override
	public long getImageFileEntryId() {
		return _contact.getImageFileEntryId();
	}

	/**
	* Returns the primary key of this contact.
	*
	* @return the primary key of this contact
	*/
	@Override
	public long getPrimaryKey() {
		return _contact.getPrimaryKey();
	}

	/**
	* Returns the user ID of this contact.
	*
	* @return the user ID of this contact
	*/
	@Override
	public long getUserId() {
		return _contact.getUserId();
	}

	@Override
	public void persist() {
		_contact.persist();
	}

	/**
	* Sets the alternate contact of this contact.
	*
	* @param alternateContact the alternate contact of this contact
	*/
	@Override
	public void setAlternateContact(java.lang.String alternateContact) {
		_contact.setAlternateContact(alternateContact);
	}

	/**
	* Sets the alternate email of this contact.
	*
	* @param alternateEmail the alternate email of this contact
	*/
	@Override
	public void setAlternateEmail(java.lang.String alternateEmail) {
		_contact.setAlternateEmail(alternateEmail);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_contact.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this contact.
	*
	* @param companyId the company ID of this contact
	*/
	@Override
	public void setCompanyId(long companyId) {
		_contact.setCompanyId(companyId);
	}

	/**
	* Sets the constant contact ID of this contact.
	*
	* @param constantContactId the constant contact ID of this contact
	*/
	@Override
	public void setConstantContactId(long constantContactId) {
		_contact.setConstantContactId(constantContactId);
	}

	/**
	* Sets the contact ID of this contact.
	*
	* @param contactId the contact ID of this contact
	*/
	@Override
	public void setContactId(long contactId) {
		_contact.setContactId(contactId);
	}

	/**
	* Sets the create date of this contact.
	*
	* @param createDate the create date of this contact
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_contact.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_contact.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_contact.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_contact.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the facebook ID of this contact.
	*
	* @param facebookId the facebook ID of this contact
	*/
	@Override
	public void setFacebookId(java.lang.String facebookId) {
		_contact.setFacebookId(facebookId);
	}

	/**
	* Sets the first name of this contact.
	*
	* @param firstName the first name of this contact
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_contact.setFirstName(firstName);
	}

	/**
	* Sets the group ID of this contact.
	*
	* @param groupId the group ID of this contact
	*/
	@Override
	public void setGroupId(long groupId) {
		_contact.setGroupId(groupId);
	}

	/**
	* Sets the image file entry ID of this contact.
	*
	* @param imageFileEntryId the image file entry ID of this contact
	*/
	@Override
	public void setImageFileEntryId(long imageFileEntryId) {
		_contact.setImageFileEntryId(imageFileEntryId);
	}

	/**
	* Sets whether this contact is is vip.
	*
	* @param isVip the is vip of this contact
	*/
	@Override
	public void setIsVip(boolean isVip) {
		_contact.setIsVip(isVip);
	}

	/**
	* Sets the job title of this contact.
	*
	* @param jobTitle the job title of this contact
	*/
	@Override
	public void setJobTitle(java.lang.String jobTitle) {
		_contact.setJobTitle(jobTitle);
	}

	/**
	* Sets the kiosk uuid of this contact.
	*
	* @param kioskUuid the kiosk uuid of this contact
	*/
	@Override
	public void setKioskUuid(java.lang.String kioskUuid) {
		_contact.setKioskUuid(kioskUuid);
	}

	/**
	* Sets the last name of this contact.
	*
	* @param lastName the last name of this contact
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_contact.setLastName(lastName);
	}

	/**
	* Sets the linked in url of this contact.
	*
	* @param linkedInUrl the linked in url of this contact
	*/
	@Override
	public void setLinkedInUrl(java.lang.String linkedInUrl) {
		_contact.setLinkedInUrl(linkedInUrl);
	}

	/**
	* Sets the middle name of this contact.
	*
	* @param middleName the middle name of this contact
	*/
	@Override
	public void setMiddleName(java.lang.String middleName) {
		_contact.setMiddleName(middleName);
	}

	/**
	* Sets the modified date of this contact.
	*
	* @param modifiedDate the modified date of this contact
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_contact.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_contact.setNew(n);
	}

	/**
	* Sets the organization of this contact.
	*
	* @param organization the organization of this contact
	*/
	@Override
	public void setOrganization(java.lang.String organization) {
		_contact.setOrganization(organization);
	}

	/**
	* Sets the prefix of this contact.
	*
	* @param prefix the prefix of this contact
	*/
	@Override
	public void setPrefix(java.lang.String prefix) {
		_contact.setPrefix(prefix);
	}

	/**
	* Sets the primary address1 of this contact.
	*
	* @param primaryAddress1 the primary address1 of this contact
	*/
	@Override
	public void setPrimaryAddress1(java.lang.String primaryAddress1) {
		_contact.setPrimaryAddress1(primaryAddress1);
	}

	/**
	* Sets the primary address2 of this contact.
	*
	* @param primaryAddress2 the primary address2 of this contact
	*/
	@Override
	public void setPrimaryAddress2(java.lang.String primaryAddress2) {
		_contact.setPrimaryAddress2(primaryAddress2);
	}

	/**
	* Sets the primary address city of this contact.
	*
	* @param primaryAddressCity the primary address city of this contact
	*/
	@Override
	public void setPrimaryAddressCity(java.lang.String primaryAddressCity) {
		_contact.setPrimaryAddressCity(primaryAddressCity);
	}

	/**
	* Sets the primary address country of this contact.
	*
	* @param primaryAddressCountry the primary address country of this contact
	*/
	@Override
	public void setPrimaryAddressCountry(java.lang.String primaryAddressCountry) {
		_contact.setPrimaryAddressCountry(primaryAddressCountry);
	}

	/**
	* Sets the primary address county of this contact.
	*
	* @param primaryAddressCounty the primary address county of this contact
	*/
	@Override
	public void setPrimaryAddressCounty(java.lang.String primaryAddressCounty) {
		_contact.setPrimaryAddressCounty(primaryAddressCounty);
	}

	/**
	* Sets the primary address state of this contact.
	*
	* @param primaryAddressState the primary address state of this contact
	*/
	@Override
	public void setPrimaryAddressState(java.lang.String primaryAddressState) {
		_contact.setPrimaryAddressState(primaryAddressState);
	}

	/**
	* Sets the primary address zip of this contact.
	*
	* @param primaryAddressZip the primary address zip of this contact
	*/
	@Override
	public void setPrimaryAddressZip(java.lang.String primaryAddressZip) {
		_contact.setPrimaryAddressZip(primaryAddressZip);
	}

	/**
	* Sets the primary cell of this contact.
	*
	* @param primaryCell the primary cell of this contact
	*/
	@Override
	public void setPrimaryCell(java.lang.String primaryCell) {
		_contact.setPrimaryCell(primaryCell);
	}

	/**
	* Sets the primary email address of this contact.
	*
	* @param primaryEmailAddress the primary email address of this contact
	*/
	@Override
	public void setPrimaryEmailAddress(java.lang.String primaryEmailAddress) {
		_contact.setPrimaryEmailAddress(primaryEmailAddress);
	}

	/**
	* Sets the primary fax of this contact.
	*
	* @param primaryFax the primary fax of this contact
	*/
	@Override
	public void setPrimaryFax(java.lang.String primaryFax) {
		_contact.setPrimaryFax(primaryFax);
	}

	/**
	* Sets the primary key of this contact.
	*
	* @param primaryKey the primary key of this contact
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_contact.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_contact.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the primary phone of this contact.
	*
	* @param primaryPhone the primary phone of this contact
	*/
	@Override
	public void setPrimaryPhone(java.lang.String primaryPhone) {
		_contact.setPrimaryPhone(primaryPhone);
	}

	/**
	* Sets the salutation of this contact.
	*
	* @param salutation the salutation of this contact
	*/
	@Override
	public void setSalutation(java.lang.String salutation) {
		_contact.setSalutation(salutation);
	}

	/**
	* Sets the secondary address1 of this contact.
	*
	* @param secondaryAddress1 the secondary address1 of this contact
	*/
	@Override
	public void setSecondaryAddress1(java.lang.String secondaryAddress1) {
		_contact.setSecondaryAddress1(secondaryAddress1);
	}

	/**
	* Sets the secondary address2 of this contact.
	*
	* @param secondaryAddress2 the secondary address2 of this contact
	*/
	@Override
	public void setSecondaryAddress2(java.lang.String secondaryAddress2) {
		_contact.setSecondaryAddress2(secondaryAddress2);
	}

	/**
	* Sets the secondary address city of this contact.
	*
	* @param secondaryAddressCity the secondary address city of this contact
	*/
	@Override
	public void setSecondaryAddressCity(java.lang.String secondaryAddressCity) {
		_contact.setSecondaryAddressCity(secondaryAddressCity);
	}

	/**
	* Sets the secondary address country of this contact.
	*
	* @param secondaryAddressCountry the secondary address country of this contact
	*/
	@Override
	public void setSecondaryAddressCountry(
		java.lang.String secondaryAddressCountry) {
		_contact.setSecondaryAddressCountry(secondaryAddressCountry);
	}

	/**
	* Sets the secondary address county of this contact.
	*
	* @param secondaryAddressCounty the secondary address county of this contact
	*/
	@Override
	public void setSecondaryAddressCounty(
		java.lang.String secondaryAddressCounty) {
		_contact.setSecondaryAddressCounty(secondaryAddressCounty);
	}

	/**
	* Sets the secondary address state of this contact.
	*
	* @param secondaryAddressState the secondary address state of this contact
	*/
	@Override
	public void setSecondaryAddressState(java.lang.String secondaryAddressState) {
		_contact.setSecondaryAddressState(secondaryAddressState);
	}

	/**
	* Sets the secondary address zip of this contact.
	*
	* @param secondaryAddressZip the secondary address zip of this contact
	*/
	@Override
	public void setSecondaryAddressZip(java.lang.String secondaryAddressZip) {
		_contact.setSecondaryAddressZip(secondaryAddressZip);
	}

	/**
	* Sets the status of this contact.
	*
	* @param status the status of this contact
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_contact.setStatus(status);
	}

	/**
	* Sets the sub groups list of this contact.
	*
	* @param subGroupsList the sub groups list of this contact
	*/
	@Override
	public void setSubGroupsList(java.lang.String subGroupsList) {
		_contact.setSubGroupsList(subGroupsList);
	}

	/**
	* Sets the tags list of this contact.
	*
	* @param tagsList the tags list of this contact
	*/
	@Override
	public void setTagsList(java.lang.String tagsList) {
		_contact.setTagsList(tagsList);
	}

	/**
	* Sets the twitter handle of this contact.
	*
	* @param twitterHandle the twitter handle of this contact
	*/
	@Override
	public void setTwitterHandle(java.lang.String twitterHandle) {
		_contact.setTwitterHandle(twitterHandle);
	}

	/**
	* Sets the user ID of this contact.
	*
	* @param userId the user ID of this contact
	*/
	@Override
	public void setUserId(long userId) {
		_contact.setUserId(userId);
	}

	/**
	* Sets the user uuid of this contact.
	*
	* @param userUuid the user uuid of this contact
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_contact.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContactWrapper)) {
			return false;
		}

		ContactWrapper contactWrapper = (ContactWrapper)obj;

		if (Objects.equals(_contact, contactWrapper._contact)) {
			return true;
		}

		return false;
	}

	@Override
	public Contact getWrappedModel() {
		return _contact;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _contact.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _contact.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_contact.resetOriginalValues();
	}

	private final Contact _contact;
}