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
 * This class is a wrapper for {@link ExtReference}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtReference
 * @generated
 */
@ProviderType
public class ExtReferenceWrapper implements ExtReference,
	ModelWrapper<ExtReference> {
	public ExtReferenceWrapper(ExtReference extReference) {
		_extReference = extReference;
	}

	@Override
	public Class<?> getModelClass() {
		return ExtReference.class;
	}

	@Override
	public String getModelClassName() {
		return ExtReference.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("extReferenceId", getExtReferenceId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("referenceUserId", getReferenceUserId());
		attributes.put("userCreated", isUserCreated());
		attributes.put("emailDate", getEmailDate());
		attributes.put("resendEmail", isResendEmail());
		attributes.put("roleAndRelationship", getRoleAndRelationship());
		attributes.put("areasOfStrength", getAreasOfStrength());
		attributes.put("areasOfGrowth", getAreasOfGrowth());
		attributes.put("significantExperience", getSignificantExperience());
		attributes.put("additionalComments", getAdditionalComments());
		attributes.put("submitDate", getSubmitDate());
		attributes.put("userFirstName", getUserFirstName());
		attributes.put("userMiddleName", getUserMiddleName());
		attributes.put("userLastName", getUserLastName());
		attributes.put("userEmailAddress", getUserEmailAddress());
		attributes.put("addressStreet1", getAddressStreet1());
		attributes.put("addressStreet2", getAddressStreet2());
		attributes.put("addressStreet3", getAddressStreet3());
		attributes.put("addressCity", getAddressCity());
		attributes.put("addressZip", getAddressZip());
		attributes.put("addressRegionId", getAddressRegionId());
		attributes.put("addressCountryId", getAddressCountryId());
		attributes.put("addressTypeId", getAddressTypeId());
		attributes.put("phoneNumber", getPhoneNumber());
		attributes.put("phoneExtension", getPhoneExtension());
		attributes.put("phoneTypeId", getPhoneTypeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long extReferenceId = (Long)attributes.get("extReferenceId");

		if (extReferenceId != null) {
			setExtReferenceId(extReferenceId);
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

		Long referenceUserId = (Long)attributes.get("referenceUserId");

		if (referenceUserId != null) {
			setReferenceUserId(referenceUserId);
		}

		Boolean userCreated = (Boolean)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		Date emailDate = (Date)attributes.get("emailDate");

		if (emailDate != null) {
			setEmailDate(emailDate);
		}

		Boolean resendEmail = (Boolean)attributes.get("resendEmail");

		if (resendEmail != null) {
			setResendEmail(resendEmail);
		}

		String roleAndRelationship = (String)attributes.get(
				"roleAndRelationship");

		if (roleAndRelationship != null) {
			setRoleAndRelationship(roleAndRelationship);
		}

		String areasOfStrength = (String)attributes.get("areasOfStrength");

		if (areasOfStrength != null) {
			setAreasOfStrength(areasOfStrength);
		}

		String areasOfGrowth = (String)attributes.get("areasOfGrowth");

		if (areasOfGrowth != null) {
			setAreasOfGrowth(areasOfGrowth);
		}

		String significantExperience = (String)attributes.get(
				"significantExperience");

		if (significantExperience != null) {
			setSignificantExperience(significantExperience);
		}

		String additionalComments = (String)attributes.get("additionalComments");

		if (additionalComments != null) {
			setAdditionalComments(additionalComments);
		}

		Date submitDate = (Date)attributes.get("submitDate");

		if (submitDate != null) {
			setSubmitDate(submitDate);
		}

		String userFirstName = (String)attributes.get("userFirstName");

		if (userFirstName != null) {
			setUserFirstName(userFirstName);
		}

		String userMiddleName = (String)attributes.get("userMiddleName");

		if (userMiddleName != null) {
			setUserMiddleName(userMiddleName);
		}

		String userLastName = (String)attributes.get("userLastName");

		if (userLastName != null) {
			setUserLastName(userLastName);
		}

		String userEmailAddress = (String)attributes.get("userEmailAddress");

		if (userEmailAddress != null) {
			setUserEmailAddress(userEmailAddress);
		}

		String addressStreet1 = (String)attributes.get("addressStreet1");

		if (addressStreet1 != null) {
			setAddressStreet1(addressStreet1);
		}

		String addressStreet2 = (String)attributes.get("addressStreet2");

		if (addressStreet2 != null) {
			setAddressStreet2(addressStreet2);
		}

		String addressStreet3 = (String)attributes.get("addressStreet3");

		if (addressStreet3 != null) {
			setAddressStreet3(addressStreet3);
		}

		String addressCity = (String)attributes.get("addressCity");

		if (addressCity != null) {
			setAddressCity(addressCity);
		}

		String addressZip = (String)attributes.get("addressZip");

		if (addressZip != null) {
			setAddressZip(addressZip);
		}

		Long addressRegionId = (Long)attributes.get("addressRegionId");

		if (addressRegionId != null) {
			setAddressRegionId(addressRegionId);
		}

		Long addressCountryId = (Long)attributes.get("addressCountryId");

		if (addressCountryId != null) {
			setAddressCountryId(addressCountryId);
		}

		Integer addressTypeId = (Integer)attributes.get("addressTypeId");

		if (addressTypeId != null) {
			setAddressTypeId(addressTypeId);
		}

		String phoneNumber = (String)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}

		String phoneExtension = (String)attributes.get("phoneExtension");

		if (phoneExtension != null) {
			setPhoneExtension(phoneExtension);
		}

		Integer phoneTypeId = (Integer)attributes.get("phoneTypeId");

		if (phoneTypeId != null) {
			setPhoneTypeId(phoneTypeId);
		}
	}

	@Override
	public Object clone() {
		return new ExtReferenceWrapper((ExtReference)_extReference.clone());
	}

	@Override
	public int compareTo(ExtReference extReference) {
		return _extReference.compareTo(extReference);
	}

	/**
	* Returns the additional comments of this ext reference.
	*
	* @return the additional comments of this ext reference
	*/
	@Override
	public String getAdditionalComments() {
		return _extReference.getAdditionalComments();
	}

	/**
	* Returns the address city of this ext reference.
	*
	* @return the address city of this ext reference
	*/
	@Override
	public String getAddressCity() {
		return _extReference.getAddressCity();
	}

	/**
	* Returns the address country ID of this ext reference.
	*
	* @return the address country ID of this ext reference
	*/
	@Override
	public long getAddressCountryId() {
		return _extReference.getAddressCountryId();
	}

	/**
	* Returns the address region ID of this ext reference.
	*
	* @return the address region ID of this ext reference
	*/
	@Override
	public long getAddressRegionId() {
		return _extReference.getAddressRegionId();
	}

	/**
	* Returns the address street1 of this ext reference.
	*
	* @return the address street1 of this ext reference
	*/
	@Override
	public String getAddressStreet1() {
		return _extReference.getAddressStreet1();
	}

	/**
	* Returns the address street2 of this ext reference.
	*
	* @return the address street2 of this ext reference
	*/
	@Override
	public String getAddressStreet2() {
		return _extReference.getAddressStreet2();
	}

	/**
	* Returns the address street3 of this ext reference.
	*
	* @return the address street3 of this ext reference
	*/
	@Override
	public String getAddressStreet3() {
		return _extReference.getAddressStreet3();
	}

	/**
	* Returns the address type ID of this ext reference.
	*
	* @return the address type ID of this ext reference
	*/
	@Override
	public int getAddressTypeId() {
		return _extReference.getAddressTypeId();
	}

	/**
	* Returns the address zip of this ext reference.
	*
	* @return the address zip of this ext reference
	*/
	@Override
	public String getAddressZip() {
		return _extReference.getAddressZip();
	}

	/**
	* Returns the areas of growth of this ext reference.
	*
	* @return the areas of growth of this ext reference
	*/
	@Override
	public String getAreasOfGrowth() {
		return _extReference.getAreasOfGrowth();
	}

	/**
	* Returns the areas of strength of this ext reference.
	*
	* @return the areas of strength of this ext reference
	*/
	@Override
	public String getAreasOfStrength() {
		return _extReference.getAreasOfStrength();
	}

	/**
	* Returns the company ID of this ext reference.
	*
	* @return the company ID of this ext reference
	*/
	@Override
	public long getCompanyId() {
		return _extReference.getCompanyId();
	}

	/**
	* Returns the create date of this ext reference.
	*
	* @return the create date of this ext reference
	*/
	@Override
	public Date getCreateDate() {
		return _extReference.getCreateDate();
	}

	/**
	* Returns the email date of this ext reference.
	*
	* @return the email date of this ext reference
	*/
	@Override
	public Date getEmailDate() {
		return _extReference.getEmailDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _extReference.getExpandoBridge();
	}

	/**
	* Returns the ext reference ID of this ext reference.
	*
	* @return the ext reference ID of this ext reference
	*/
	@Override
	public long getExtReferenceId() {
		return _extReference.getExtReferenceId();
	}

	/**
	* Returns the modified date of this ext reference.
	*
	* @return the modified date of this ext reference
	*/
	@Override
	public Date getModifiedDate() {
		return _extReference.getModifiedDate();
	}

	/**
	* Returns the phone extension of this ext reference.
	*
	* @return the phone extension of this ext reference
	*/
	@Override
	public String getPhoneExtension() {
		return _extReference.getPhoneExtension();
	}

	/**
	* Returns the phone number of this ext reference.
	*
	* @return the phone number of this ext reference
	*/
	@Override
	public String getPhoneNumber() {
		return _extReference.getPhoneNumber();
	}

	/**
	* Returns the phone type ID of this ext reference.
	*
	* @return the phone type ID of this ext reference
	*/
	@Override
	public int getPhoneTypeId() {
		return _extReference.getPhoneTypeId();
	}

	/**
	* Returns the primary key of this ext reference.
	*
	* @return the primary key of this ext reference
	*/
	@Override
	public long getPrimaryKey() {
		return _extReference.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _extReference.getPrimaryKeyObj();
	}

	/**
	* Returns the reference user ID of this ext reference.
	*
	* @return the reference user ID of this ext reference
	*/
	@Override
	public long getReferenceUserId() {
		return _extReference.getReferenceUserId();
	}

	/**
	* Returns the reference user uuid of this ext reference.
	*
	* @return the reference user uuid of this ext reference
	*/
	@Override
	public String getReferenceUserUuid() {
		return _extReference.getReferenceUserUuid();
	}

	/**
	* Returns the resend email of this ext reference.
	*
	* @return the resend email of this ext reference
	*/
	@Override
	public boolean getResendEmail() {
		return _extReference.getResendEmail();
	}

	/**
	* Returns the role and relationship of this ext reference.
	*
	* @return the role and relationship of this ext reference
	*/
	@Override
	public String getRoleAndRelationship() {
		return _extReference.getRoleAndRelationship();
	}

	/**
	* Returns the significant experience of this ext reference.
	*
	* @return the significant experience of this ext reference
	*/
	@Override
	public String getSignificantExperience() {
		return _extReference.getSignificantExperience();
	}

	/**
	* Returns the submit date of this ext reference.
	*
	* @return the submit date of this ext reference
	*/
	@Override
	public Date getSubmitDate() {
		return _extReference.getSubmitDate();
	}

	/**
	* Returns the user created of this ext reference.
	*
	* @return the user created of this ext reference
	*/
	@Override
	public boolean getUserCreated() {
		return _extReference.getUserCreated();
	}

	/**
	* Returns the user email address of this ext reference.
	*
	* @return the user email address of this ext reference
	*/
	@Override
	public String getUserEmailAddress() {
		return _extReference.getUserEmailAddress();
	}

	/**
	* Returns the user first name of this ext reference.
	*
	* @return the user first name of this ext reference
	*/
	@Override
	public String getUserFirstName() {
		return _extReference.getUserFirstName();
	}

	/**
	* Returns the user ID of this ext reference.
	*
	* @return the user ID of this ext reference
	*/
	@Override
	public long getUserId() {
		return _extReference.getUserId();
	}

	/**
	* Returns the user last name of this ext reference.
	*
	* @return the user last name of this ext reference
	*/
	@Override
	public String getUserLastName() {
		return _extReference.getUserLastName();
	}

	/**
	* Returns the user middle name of this ext reference.
	*
	* @return the user middle name of this ext reference
	*/
	@Override
	public String getUserMiddleName() {
		return _extReference.getUserMiddleName();
	}

	/**
	* Returns the user uuid of this ext reference.
	*
	* @return the user uuid of this ext reference
	*/
	@Override
	public String getUserUuid() {
		return _extReference.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _extReference.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _extReference.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _extReference.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _extReference.isNew();
	}

	/**
	* Returns <code>true</code> if this ext reference is resend email.
	*
	* @return <code>true</code> if this ext reference is resend email; <code>false</code> otherwise
	*/
	@Override
	public boolean isResendEmail() {
		return _extReference.isResendEmail();
	}

	/**
	* Returns <code>true</code> if this ext reference is user created.
	*
	* @return <code>true</code> if this ext reference is user created; <code>false</code> otherwise
	*/
	@Override
	public boolean isUserCreated() {
		return _extReference.isUserCreated();
	}

	@Override
	public void persist() {
		_extReference.persist();
	}

	/**
	* Sets the additional comments of this ext reference.
	*
	* @param additionalComments the additional comments of this ext reference
	*/
	@Override
	public void setAdditionalComments(String additionalComments) {
		_extReference.setAdditionalComments(additionalComments);
	}

	/**
	* Sets the address city of this ext reference.
	*
	* @param addressCity the address city of this ext reference
	*/
	@Override
	public void setAddressCity(String addressCity) {
		_extReference.setAddressCity(addressCity);
	}

	/**
	* Sets the address country ID of this ext reference.
	*
	* @param addressCountryId the address country ID of this ext reference
	*/
	@Override
	public void setAddressCountryId(long addressCountryId) {
		_extReference.setAddressCountryId(addressCountryId);
	}

	/**
	* Sets the address region ID of this ext reference.
	*
	* @param addressRegionId the address region ID of this ext reference
	*/
	@Override
	public void setAddressRegionId(long addressRegionId) {
		_extReference.setAddressRegionId(addressRegionId);
	}

	/**
	* Sets the address street1 of this ext reference.
	*
	* @param addressStreet1 the address street1 of this ext reference
	*/
	@Override
	public void setAddressStreet1(String addressStreet1) {
		_extReference.setAddressStreet1(addressStreet1);
	}

	/**
	* Sets the address street2 of this ext reference.
	*
	* @param addressStreet2 the address street2 of this ext reference
	*/
	@Override
	public void setAddressStreet2(String addressStreet2) {
		_extReference.setAddressStreet2(addressStreet2);
	}

	/**
	* Sets the address street3 of this ext reference.
	*
	* @param addressStreet3 the address street3 of this ext reference
	*/
	@Override
	public void setAddressStreet3(String addressStreet3) {
		_extReference.setAddressStreet3(addressStreet3);
	}

	/**
	* Sets the address type ID of this ext reference.
	*
	* @param addressTypeId the address type ID of this ext reference
	*/
	@Override
	public void setAddressTypeId(int addressTypeId) {
		_extReference.setAddressTypeId(addressTypeId);
	}

	/**
	* Sets the address zip of this ext reference.
	*
	* @param addressZip the address zip of this ext reference
	*/
	@Override
	public void setAddressZip(String addressZip) {
		_extReference.setAddressZip(addressZip);
	}

	/**
	* Sets the areas of growth of this ext reference.
	*
	* @param areasOfGrowth the areas of growth of this ext reference
	*/
	@Override
	public void setAreasOfGrowth(String areasOfGrowth) {
		_extReference.setAreasOfGrowth(areasOfGrowth);
	}

	/**
	* Sets the areas of strength of this ext reference.
	*
	* @param areasOfStrength the areas of strength of this ext reference
	*/
	@Override
	public void setAreasOfStrength(String areasOfStrength) {
		_extReference.setAreasOfStrength(areasOfStrength);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_extReference.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this ext reference.
	*
	* @param companyId the company ID of this ext reference
	*/
	@Override
	public void setCompanyId(long companyId) {
		_extReference.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this ext reference.
	*
	* @param createDate the create date of this ext reference
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_extReference.setCreateDate(createDate);
	}

	/**
	* Sets the email date of this ext reference.
	*
	* @param emailDate the email date of this ext reference
	*/
	@Override
	public void setEmailDate(Date emailDate) {
		_extReference.setEmailDate(emailDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_extReference.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_extReference.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_extReference.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ext reference ID of this ext reference.
	*
	* @param extReferenceId the ext reference ID of this ext reference
	*/
	@Override
	public void setExtReferenceId(long extReferenceId) {
		_extReference.setExtReferenceId(extReferenceId);
	}

	/**
	* Sets the modified date of this ext reference.
	*
	* @param modifiedDate the modified date of this ext reference
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_extReference.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_extReference.setNew(n);
	}

	/**
	* Sets the phone extension of this ext reference.
	*
	* @param phoneExtension the phone extension of this ext reference
	*/
	@Override
	public void setPhoneExtension(String phoneExtension) {
		_extReference.setPhoneExtension(phoneExtension);
	}

	/**
	* Sets the phone number of this ext reference.
	*
	* @param phoneNumber the phone number of this ext reference
	*/
	@Override
	public void setPhoneNumber(String phoneNumber) {
		_extReference.setPhoneNumber(phoneNumber);
	}

	/**
	* Sets the phone type ID of this ext reference.
	*
	* @param phoneTypeId the phone type ID of this ext reference
	*/
	@Override
	public void setPhoneTypeId(int phoneTypeId) {
		_extReference.setPhoneTypeId(phoneTypeId);
	}

	/**
	* Sets the primary key of this ext reference.
	*
	* @param primaryKey the primary key of this ext reference
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_extReference.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_extReference.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference user ID of this ext reference.
	*
	* @param referenceUserId the reference user ID of this ext reference
	*/
	@Override
	public void setReferenceUserId(long referenceUserId) {
		_extReference.setReferenceUserId(referenceUserId);
	}

	/**
	* Sets the reference user uuid of this ext reference.
	*
	* @param referenceUserUuid the reference user uuid of this ext reference
	*/
	@Override
	public void setReferenceUserUuid(String referenceUserUuid) {
		_extReference.setReferenceUserUuid(referenceUserUuid);
	}

	/**
	* Sets whether this ext reference is resend email.
	*
	* @param resendEmail the resend email of this ext reference
	*/
	@Override
	public void setResendEmail(boolean resendEmail) {
		_extReference.setResendEmail(resendEmail);
	}

	/**
	* Sets the role and relationship of this ext reference.
	*
	* @param roleAndRelationship the role and relationship of this ext reference
	*/
	@Override
	public void setRoleAndRelationship(String roleAndRelationship) {
		_extReference.setRoleAndRelationship(roleAndRelationship);
	}

	/**
	* Sets the significant experience of this ext reference.
	*
	* @param significantExperience the significant experience of this ext reference
	*/
	@Override
	public void setSignificantExperience(String significantExperience) {
		_extReference.setSignificantExperience(significantExperience);
	}

	/**
	* Sets the submit date of this ext reference.
	*
	* @param submitDate the submit date of this ext reference
	*/
	@Override
	public void setSubmitDate(Date submitDate) {
		_extReference.setSubmitDate(submitDate);
	}

	/**
	* Sets whether this ext reference is user created.
	*
	* @param userCreated the user created of this ext reference
	*/
	@Override
	public void setUserCreated(boolean userCreated) {
		_extReference.setUserCreated(userCreated);
	}

	/**
	* Sets the user email address of this ext reference.
	*
	* @param userEmailAddress the user email address of this ext reference
	*/
	@Override
	public void setUserEmailAddress(String userEmailAddress) {
		_extReference.setUserEmailAddress(userEmailAddress);
	}

	/**
	* Sets the user first name of this ext reference.
	*
	* @param userFirstName the user first name of this ext reference
	*/
	@Override
	public void setUserFirstName(String userFirstName) {
		_extReference.setUserFirstName(userFirstName);
	}

	/**
	* Sets the user ID of this ext reference.
	*
	* @param userId the user ID of this ext reference
	*/
	@Override
	public void setUserId(long userId) {
		_extReference.setUserId(userId);
	}

	/**
	* Sets the user last name of this ext reference.
	*
	* @param userLastName the user last name of this ext reference
	*/
	@Override
	public void setUserLastName(String userLastName) {
		_extReference.setUserLastName(userLastName);
	}

	/**
	* Sets the user middle name of this ext reference.
	*
	* @param userMiddleName the user middle name of this ext reference
	*/
	@Override
	public void setUserMiddleName(String userMiddleName) {
		_extReference.setUserMiddleName(userMiddleName);
	}

	/**
	* Sets the user uuid of this ext reference.
	*
	* @param userUuid the user uuid of this ext reference
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_extReference.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ExtReference> toCacheModel() {
		return _extReference.toCacheModel();
	}

	@Override
	public ExtReference toEscapedModel() {
		return new ExtReferenceWrapper(_extReference.toEscapedModel());
	}

	@Override
	public String toString() {
		return _extReference.toString();
	}

	@Override
	public ExtReference toUnescapedModel() {
		return new ExtReferenceWrapper(_extReference.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _extReference.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtReferenceWrapper)) {
			return false;
		}

		ExtReferenceWrapper extReferenceWrapper = (ExtReferenceWrapper)obj;

		if (Objects.equals(_extReference, extReferenceWrapper._extReference)) {
			return true;
		}

		return false;
	}

	@Override
	public ExtReference getWrappedModel() {
		return _extReference;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _extReference.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _extReference.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_extReference.resetOriginalValues();
	}

	private final ExtReference _extReference;
}