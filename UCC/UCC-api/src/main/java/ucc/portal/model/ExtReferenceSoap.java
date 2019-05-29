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

package ucc.portal.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ExtReferenceSoap implements Serializable {
	public static ExtReferenceSoap toSoapModel(ExtReference model) {
		ExtReferenceSoap soapModel = new ExtReferenceSoap();

		soapModel.setExtReferenceId(model.getExtReferenceId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setReferenceUserId(model.getReferenceUserId());
		soapModel.setUserCreated(model.isUserCreated());
		soapModel.setEmailDate(model.getEmailDate());
		soapModel.setResendEmail(model.isResendEmail());
		soapModel.setRoleAndRelationship(model.getRoleAndRelationship());
		soapModel.setAreasOfStrength(model.getAreasOfStrength());
		soapModel.setAreasOfGrowth(model.getAreasOfGrowth());
		soapModel.setSignificantExperience(model.getSignificantExperience());
		soapModel.setAdditionalComments(model.getAdditionalComments());
		soapModel.setSubmitDate(model.getSubmitDate());
		soapModel.setUserFirstName(model.getUserFirstName());
		soapModel.setUserMiddleName(model.getUserMiddleName());
		soapModel.setUserLastName(model.getUserLastName());
		soapModel.setUserEmailAddress(model.getUserEmailAddress());
		soapModel.setAddressStreet1(model.getAddressStreet1());
		soapModel.setAddressStreet2(model.getAddressStreet2());
		soapModel.setAddressStreet3(model.getAddressStreet3());
		soapModel.setAddressCity(model.getAddressCity());
		soapModel.setAddressZip(model.getAddressZip());
		soapModel.setAddressRegionId(model.getAddressRegionId());
		soapModel.setAddressCountryId(model.getAddressCountryId());
		soapModel.setAddressTypeId(model.getAddressTypeId());
		soapModel.setPhoneNumber(model.getPhoneNumber());
		soapModel.setPhoneExtension(model.getPhoneExtension());
		soapModel.setPhoneTypeId(model.getPhoneTypeId());

		return soapModel;
	}

	public static ExtReferenceSoap[] toSoapModels(ExtReference[] models) {
		ExtReferenceSoap[] soapModels = new ExtReferenceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ExtReferenceSoap[][] toSoapModels(ExtReference[][] models) {
		ExtReferenceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ExtReferenceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ExtReferenceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ExtReferenceSoap[] toSoapModels(List<ExtReference> models) {
		List<ExtReferenceSoap> soapModels = new ArrayList<ExtReferenceSoap>(models.size());

		for (ExtReference model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ExtReferenceSoap[soapModels.size()]);
	}

	public ExtReferenceSoap() {
	}

	public long getPrimaryKey() {
		return _extReferenceId;
	}

	public void setPrimaryKey(long pk) {
		setExtReferenceId(pk);
	}

	public long getExtReferenceId() {
		return _extReferenceId;
	}

	public void setExtReferenceId(long extReferenceId) {
		_extReferenceId = extReferenceId;
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

	public long getReferenceUserId() {
		return _referenceUserId;
	}

	public void setReferenceUserId(long referenceUserId) {
		_referenceUserId = referenceUserId;
	}

	public boolean getUserCreated() {
		return _userCreated;
	}

	public boolean isUserCreated() {
		return _userCreated;
	}

	public void setUserCreated(boolean userCreated) {
		_userCreated = userCreated;
	}

	public Date getEmailDate() {
		return _emailDate;
	}

	public void setEmailDate(Date emailDate) {
		_emailDate = emailDate;
	}

	public boolean getResendEmail() {
		return _resendEmail;
	}

	public boolean isResendEmail() {
		return _resendEmail;
	}

	public void setResendEmail(boolean resendEmail) {
		_resendEmail = resendEmail;
	}

	public String getRoleAndRelationship() {
		return _roleAndRelationship;
	}

	public void setRoleAndRelationship(String roleAndRelationship) {
		_roleAndRelationship = roleAndRelationship;
	}

	public String getAreasOfStrength() {
		return _areasOfStrength;
	}

	public void setAreasOfStrength(String areasOfStrength) {
		_areasOfStrength = areasOfStrength;
	}

	public String getAreasOfGrowth() {
		return _areasOfGrowth;
	}

	public void setAreasOfGrowth(String areasOfGrowth) {
		_areasOfGrowth = areasOfGrowth;
	}

	public String getSignificantExperience() {
		return _significantExperience;
	}

	public void setSignificantExperience(String significantExperience) {
		_significantExperience = significantExperience;
	}

	public String getAdditionalComments() {
		return _additionalComments;
	}

	public void setAdditionalComments(String additionalComments) {
		_additionalComments = additionalComments;
	}

	public Date getSubmitDate() {
		return _submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		_submitDate = submitDate;
	}

	public String getUserFirstName() {
		return _userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		_userFirstName = userFirstName;
	}

	public String getUserMiddleName() {
		return _userMiddleName;
	}

	public void setUserMiddleName(String userMiddleName) {
		_userMiddleName = userMiddleName;
	}

	public String getUserLastName() {
		return _userLastName;
	}

	public void setUserLastName(String userLastName) {
		_userLastName = userLastName;
	}

	public String getUserEmailAddress() {
		return _userEmailAddress;
	}

	public void setUserEmailAddress(String userEmailAddress) {
		_userEmailAddress = userEmailAddress;
	}

	public String getAddressStreet1() {
		return _addressStreet1;
	}

	public void setAddressStreet1(String addressStreet1) {
		_addressStreet1 = addressStreet1;
	}

	public String getAddressStreet2() {
		return _addressStreet2;
	}

	public void setAddressStreet2(String addressStreet2) {
		_addressStreet2 = addressStreet2;
	}

	public String getAddressStreet3() {
		return _addressStreet3;
	}

	public void setAddressStreet3(String addressStreet3) {
		_addressStreet3 = addressStreet3;
	}

	public String getAddressCity() {
		return _addressCity;
	}

	public void setAddressCity(String addressCity) {
		_addressCity = addressCity;
	}

	public String getAddressZip() {
		return _addressZip;
	}

	public void setAddressZip(String addressZip) {
		_addressZip = addressZip;
	}

	public long getAddressRegionId() {
		return _addressRegionId;
	}

	public void setAddressRegionId(long addressRegionId) {
		_addressRegionId = addressRegionId;
	}

	public long getAddressCountryId() {
		return _addressCountryId;
	}

	public void setAddressCountryId(long addressCountryId) {
		_addressCountryId = addressCountryId;
	}

	public int getAddressTypeId() {
		return _addressTypeId;
	}

	public void setAddressTypeId(int addressTypeId) {
		_addressTypeId = addressTypeId;
	}

	public String getPhoneNumber() {
		return _phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	public String getPhoneExtension() {
		return _phoneExtension;
	}

	public void setPhoneExtension(String phoneExtension) {
		_phoneExtension = phoneExtension;
	}

	public int getPhoneTypeId() {
		return _phoneTypeId;
	}

	public void setPhoneTypeId(int phoneTypeId) {
		_phoneTypeId = phoneTypeId;
	}

	private long _extReferenceId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _referenceUserId;
	private boolean _userCreated;
	private Date _emailDate;
	private boolean _resendEmail;
	private String _roleAndRelationship;
	private String _areasOfStrength;
	private String _areasOfGrowth;
	private String _significantExperience;
	private String _additionalComments;
	private Date _submitDate;
	private String _userFirstName;
	private String _userMiddleName;
	private String _userLastName;
	private String _userEmailAddress;
	private String _addressStreet1;
	private String _addressStreet2;
	private String _addressStreet3;
	private String _addressCity;
	private String _addressZip;
	private long _addressRegionId;
	private long _addressCountryId;
	private int _addressTypeId;
	private String _phoneNumber;
	private String _phoneExtension;
	private int _phoneTypeId;
}