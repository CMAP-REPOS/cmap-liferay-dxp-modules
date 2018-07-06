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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link contact.manager.service.http.CrmContactServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.http.CrmContactServiceSoap
 * @generated
 */
@ProviderType
public class CrmContactSoap implements Serializable {
	public static CrmContactSoap toSoapModel(CrmContact model) {
		CrmContactSoap soapModel = new CrmContactSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCrmContactId(model.getCrmContactId());
		soapModel.setConstantContactId(model.getConstantContactId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPrefix(model.getPrefix());
		soapModel.setSalutation(model.getSalutation());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setMiddleName(model.getMiddleName());
		soapModel.setLastName(model.getLastName());
		soapModel.setOrganization(model.getOrganization());
		soapModel.setJobTitle(model.getJobTitle());
		soapModel.setPrimaryAddress1(model.getPrimaryAddress1());
		soapModel.setPrimaryAddress2(model.getPrimaryAddress2());
		soapModel.setPrimaryAddressCity(model.getPrimaryAddressCity());
		soapModel.setPrimaryAddressState(model.getPrimaryAddressState());
		soapModel.setPrimaryAddressZip(model.getPrimaryAddressZip());
		soapModel.setPrimaryAddressCounty(model.getPrimaryAddressCounty());
		soapModel.setPrimaryAddressCountry(model.getPrimaryAddressCountry());
		soapModel.setSecondaryAddress1(model.getSecondaryAddress1());
		soapModel.setSecondaryAddress2(model.getSecondaryAddress2());
		soapModel.setSecondaryAddressCity(model.getSecondaryAddressCity());
		soapModel.setSecondaryAddressState(model.getSecondaryAddressState());
		soapModel.setSecondaryAddressZip(model.getSecondaryAddressZip());
		soapModel.setSecondaryAddressCounty(model.getSecondaryAddressCounty());
		soapModel.setSecondaryAddressCountry(model.getSecondaryAddressCountry());
		soapModel.setPrimaryPhone(model.getPrimaryPhone());
		soapModel.setPrimaryPhoneExtension(model.getPrimaryPhoneExtension());
		soapModel.setPrimaryFax(model.getPrimaryFax());
		soapModel.setPrimaryCell(model.getPrimaryCell());
		soapModel.setPrimaryEmailAddress(model.getPrimaryEmailAddress());
		soapModel.setAlternateContact(model.getAlternateContact());
		soapModel.setAlternateEmail(model.getAlternateEmail());
		soapModel.setIsVip(model.getIsVip());
		soapModel.setFacebookId(model.getFacebookId());
		soapModel.setTwitterHandle(model.getTwitterHandle());
		soapModel.setLinkedInUrl(model.getLinkedInUrl());
		soapModel.setStatus(model.getStatus());
		soapModel.setKioskUuid(model.getKioskUuid());
		soapModel.setImageFileEntryId(model.getImageFileEntryId());
		soapModel.setTagsList(model.getTagsList());
		soapModel.setGroupsList(model.getGroupsList());

		return soapModel;
	}

	public static CrmContactSoap[] toSoapModels(CrmContact[] models) {
		CrmContactSoap[] soapModels = new CrmContactSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CrmContactSoap[][] toSoapModels(CrmContact[][] models) {
		CrmContactSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CrmContactSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CrmContactSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CrmContactSoap[] toSoapModels(List<CrmContact> models) {
		List<CrmContactSoap> soapModels = new ArrayList<CrmContactSoap>(models.size());

		for (CrmContact model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CrmContactSoap[soapModels.size()]);
	}

	public CrmContactSoap() {
	}

	public long getPrimaryKey() {
		return _crmContactId;
	}

	public void setPrimaryKey(long pk) {
		setCrmContactId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCrmContactId() {
		return _crmContactId;
	}

	public void setCrmContactId(long crmContactId) {
		_crmContactId = crmContactId;
	}

	public long getConstantContactId() {
		return _constantContactId;
	}

	public void setConstantContactId(long constantContactId) {
		_constantContactId = constantContactId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getPrefix() {
		return _prefix;
	}

	public void setPrefix(String prefix) {
		_prefix = prefix;
	}

	public String getSalutation() {
		return _salutation;
	}

	public void setSalutation(String salutation) {
		_salutation = salutation;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getMiddleName() {
		return _middleName;
	}

	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getOrganization() {
		return _organization;
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	public String getJobTitle() {
		return _jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;
	}

	public String getPrimaryAddress1() {
		return _primaryAddress1;
	}

	public void setPrimaryAddress1(String primaryAddress1) {
		_primaryAddress1 = primaryAddress1;
	}

	public String getPrimaryAddress2() {
		return _primaryAddress2;
	}

	public void setPrimaryAddress2(String primaryAddress2) {
		_primaryAddress2 = primaryAddress2;
	}

	public String getPrimaryAddressCity() {
		return _primaryAddressCity;
	}

	public void setPrimaryAddressCity(String primaryAddressCity) {
		_primaryAddressCity = primaryAddressCity;
	}

	public String getPrimaryAddressState() {
		return _primaryAddressState;
	}

	public void setPrimaryAddressState(String primaryAddressState) {
		_primaryAddressState = primaryAddressState;
	}

	public String getPrimaryAddressZip() {
		return _primaryAddressZip;
	}

	public void setPrimaryAddressZip(String primaryAddressZip) {
		_primaryAddressZip = primaryAddressZip;
	}

	public String getPrimaryAddressCounty() {
		return _primaryAddressCounty;
	}

	public void setPrimaryAddressCounty(String primaryAddressCounty) {
		_primaryAddressCounty = primaryAddressCounty;
	}

	public String getPrimaryAddressCountry() {
		return _primaryAddressCountry;
	}

	public void setPrimaryAddressCountry(String primaryAddressCountry) {
		_primaryAddressCountry = primaryAddressCountry;
	}

	public String getSecondaryAddress1() {
		return _secondaryAddress1;
	}

	public void setSecondaryAddress1(String secondaryAddress1) {
		_secondaryAddress1 = secondaryAddress1;
	}

	public String getSecondaryAddress2() {
		return _secondaryAddress2;
	}

	public void setSecondaryAddress2(String secondaryAddress2) {
		_secondaryAddress2 = secondaryAddress2;
	}

	public String getSecondaryAddressCity() {
		return _secondaryAddressCity;
	}

	public void setSecondaryAddressCity(String secondaryAddressCity) {
		_secondaryAddressCity = secondaryAddressCity;
	}

	public String getSecondaryAddressState() {
		return _secondaryAddressState;
	}

	public void setSecondaryAddressState(String secondaryAddressState) {
		_secondaryAddressState = secondaryAddressState;
	}

	public String getSecondaryAddressZip() {
		return _secondaryAddressZip;
	}

	public void setSecondaryAddressZip(String secondaryAddressZip) {
		_secondaryAddressZip = secondaryAddressZip;
	}

	public String getSecondaryAddressCounty() {
		return _secondaryAddressCounty;
	}

	public void setSecondaryAddressCounty(String secondaryAddressCounty) {
		_secondaryAddressCounty = secondaryAddressCounty;
	}

	public String getSecondaryAddressCountry() {
		return _secondaryAddressCountry;
	}

	public void setSecondaryAddressCountry(String secondaryAddressCountry) {
		_secondaryAddressCountry = secondaryAddressCountry;
	}

	public String getPrimaryPhone() {
		return _primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		_primaryPhone = primaryPhone;
	}

	public String getPrimaryPhoneExtension() {
		return _primaryPhoneExtension;
	}

	public void setPrimaryPhoneExtension(String primaryPhoneExtension) {
		_primaryPhoneExtension = primaryPhoneExtension;
	}

	public String getPrimaryFax() {
		return _primaryFax;
	}

	public void setPrimaryFax(String primaryFax) {
		_primaryFax = primaryFax;
	}

	public String getPrimaryCell() {
		return _primaryCell;
	}

	public void setPrimaryCell(String primaryCell) {
		_primaryCell = primaryCell;
	}

	public String getPrimaryEmailAddress() {
		return _primaryEmailAddress;
	}

	public void setPrimaryEmailAddress(String primaryEmailAddress) {
		_primaryEmailAddress = primaryEmailAddress;
	}

	public String getAlternateContact() {
		return _alternateContact;
	}

	public void setAlternateContact(String alternateContact) {
		_alternateContact = alternateContact;
	}

	public String getAlternateEmail() {
		return _alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		_alternateEmail = alternateEmail;
	}

	public boolean getIsVip() {
		return _isVip;
	}

	public boolean isIsVip() {
		return _isVip;
	}

	public void setIsVip(boolean isVip) {
		_isVip = isVip;
	}

	public String getFacebookId() {
		return _facebookId;
	}

	public void setFacebookId(String facebookId) {
		_facebookId = facebookId;
	}

	public String getTwitterHandle() {
		return _twitterHandle;
	}

	public void setTwitterHandle(String twitterHandle) {
		_twitterHandle = twitterHandle;
	}

	public String getLinkedInUrl() {
		return _linkedInUrl;
	}

	public void setLinkedInUrl(String linkedInUrl) {
		_linkedInUrl = linkedInUrl;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getKioskUuid() {
		return _kioskUuid;
	}

	public void setKioskUuid(String kioskUuid) {
		_kioskUuid = kioskUuid;
	}

	public long getImageFileEntryId() {
		return _imageFileEntryId;
	}

	public void setImageFileEntryId(long imageFileEntryId) {
		_imageFileEntryId = imageFileEntryId;
	}

	public String getTagsList() {
		return _tagsList;
	}

	public void setTagsList(String tagsList) {
		_tagsList = tagsList;
	}

	public String getGroupsList() {
		return _groupsList;
	}

	public void setGroupsList(String groupsList) {
		_groupsList = groupsList;
	}

	private String _uuid;
	private long _crmContactId;
	private long _constantContactId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _prefix;
	private String _salutation;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private String _organization;
	private String _jobTitle;
	private String _primaryAddress1;
	private String _primaryAddress2;
	private String _primaryAddressCity;
	private String _primaryAddressState;
	private String _primaryAddressZip;
	private String _primaryAddressCounty;
	private String _primaryAddressCountry;
	private String _secondaryAddress1;
	private String _secondaryAddress2;
	private String _secondaryAddressCity;
	private String _secondaryAddressState;
	private String _secondaryAddressZip;
	private String _secondaryAddressCounty;
	private String _secondaryAddressCountry;
	private String _primaryPhone;
	private String _primaryPhoneExtension;
	private String _primaryFax;
	private String _primaryCell;
	private String _primaryEmailAddress;
	private String _alternateContact;
	private String _alternateEmail;
	private boolean _isVip;
	private String _facebookId;
	private String _twitterHandle;
	private String _linkedInUrl;
	private String _status;
	private String _kioskUuid;
	private long _imageFileEntryId;
	private String _tagsList;
	private String _groupsList;
}