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
 * This class is a wrapper for {@link ExtValidation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtValidation
 * @generated
 */
@ProviderType
public class ExtValidationWrapper implements ExtValidation,
	ModelWrapper<ExtValidation> {
	public ExtValidationWrapper(ExtValidation extValidation) {
		_extValidation = extValidation;
	}

	@Override
	public Class<?> getModelClass() {
		return ExtValidation.class;
	}

	@Override
	public String getModelClassName() {
		return ExtValidation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("extValidationId", getExtValidationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("profileFileEntryId", getProfileFileEntryId());
		attributes.put("profileFileVersionId", getProfileFileVersionId());
		attributes.put("validatorUserId", getValidatorUserId());
		attributes.put("emailDate", getEmailDate());
		attributes.put("currentStandingAndFitness",
			isCurrentStandingAndFitness());
		attributes.put("currentCriminalBackgroundCheck",
			isCurrentCriminalBackgroundCheck());
		attributes.put("accurateCurrentEmployment",
			isAccurateCurrentEmployment());
		attributes.put("accurateSelfDisclosure", isAccurateSelfDisclosure());
		attributes.put("signatureJson", getSignatureJson());
		attributes.put("signatureFileEntryId", getSignatureFileEntryId());
		attributes.put("signatureFileVersionId", getSignatureFileVersionId());
		attributes.put("signatureName", getSignatureName());
		attributes.put("signatureTimestamp", getSignatureTimestamp());
		attributes.put("signatureTitle", getSignatureTitle());
		attributes.put("conferenceId", getConferenceId());
		attributes.put("associationId", getAssociationId());
		attributes.put("withholdValidation", isWithholdValidation());
		attributes.put("additionalComments", getAdditionalComments());
		attributes.put("submitDate", getSubmitDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long extValidationId = (Long)attributes.get("extValidationId");

		if (extValidationId != null) {
			setExtValidationId(extValidationId);
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

		Long profileFileEntryId = (Long)attributes.get("profileFileEntryId");

		if (profileFileEntryId != null) {
			setProfileFileEntryId(profileFileEntryId);
		}

		Long profileFileVersionId = (Long)attributes.get("profileFileVersionId");

		if (profileFileVersionId != null) {
			setProfileFileVersionId(profileFileVersionId);
		}

		Long validatorUserId = (Long)attributes.get("validatorUserId");

		if (validatorUserId != null) {
			setValidatorUserId(validatorUserId);
		}

		Date emailDate = (Date)attributes.get("emailDate");

		if (emailDate != null) {
			setEmailDate(emailDate);
		}

		Boolean currentStandingAndFitness = (Boolean)attributes.get(
				"currentStandingAndFitness");

		if (currentStandingAndFitness != null) {
			setCurrentStandingAndFitness(currentStandingAndFitness);
		}

		Boolean currentCriminalBackgroundCheck = (Boolean)attributes.get(
				"currentCriminalBackgroundCheck");

		if (currentCriminalBackgroundCheck != null) {
			setCurrentCriminalBackgroundCheck(currentCriminalBackgroundCheck);
		}

		Boolean accurateCurrentEmployment = (Boolean)attributes.get(
				"accurateCurrentEmployment");

		if (accurateCurrentEmployment != null) {
			setAccurateCurrentEmployment(accurateCurrentEmployment);
		}

		Boolean accurateSelfDisclosure = (Boolean)attributes.get(
				"accurateSelfDisclosure");

		if (accurateSelfDisclosure != null) {
			setAccurateSelfDisclosure(accurateSelfDisclosure);
		}

		String signatureJson = (String)attributes.get("signatureJson");

		if (signatureJson != null) {
			setSignatureJson(signatureJson);
		}

		Long signatureFileEntryId = (Long)attributes.get("signatureFileEntryId");

		if (signatureFileEntryId != null) {
			setSignatureFileEntryId(signatureFileEntryId);
		}

		Long signatureFileVersionId = (Long)attributes.get(
				"signatureFileVersionId");

		if (signatureFileVersionId != null) {
			setSignatureFileVersionId(signatureFileVersionId);
		}

		String signatureName = (String)attributes.get("signatureName");

		if (signatureName != null) {
			setSignatureName(signatureName);
		}

		Date signatureTimestamp = (Date)attributes.get("signatureTimestamp");

		if (signatureTimestamp != null) {
			setSignatureTimestamp(signatureTimestamp);
		}

		String signatureTitle = (String)attributes.get("signatureTitle");

		if (signatureTitle != null) {
			setSignatureTitle(signatureTitle);
		}

		Long conferenceId = (Long)attributes.get("conferenceId");

		if (conferenceId != null) {
			setConferenceId(conferenceId);
		}

		Long associationId = (Long)attributes.get("associationId");

		if (associationId != null) {
			setAssociationId(associationId);
		}

		Boolean withholdValidation = (Boolean)attributes.get(
				"withholdValidation");

		if (withholdValidation != null) {
			setWithholdValidation(withholdValidation);
		}

		String additionalComments = (String)attributes.get("additionalComments");

		if (additionalComments != null) {
			setAdditionalComments(additionalComments);
		}

		Date submitDate = (Date)attributes.get("submitDate");

		if (submitDate != null) {
			setSubmitDate(submitDate);
		}
	}

	@Override
	public Object clone() {
		return new ExtValidationWrapper((ExtValidation)_extValidation.clone());
	}

	@Override
	public int compareTo(ExtValidation extValidation) {
		return _extValidation.compareTo(extValidation);
	}

	/**
	* Returns the accurate current employment of this ext validation.
	*
	* @return the accurate current employment of this ext validation
	*/
	@Override
	public boolean getAccurateCurrentEmployment() {
		return _extValidation.getAccurateCurrentEmployment();
	}

	/**
	* Returns the accurate self disclosure of this ext validation.
	*
	* @return the accurate self disclosure of this ext validation
	*/
	@Override
	public boolean getAccurateSelfDisclosure() {
		return _extValidation.getAccurateSelfDisclosure();
	}

	/**
	* Returns the additional comments of this ext validation.
	*
	* @return the additional comments of this ext validation
	*/
	@Override
	public String getAdditionalComments() {
		return _extValidation.getAdditionalComments();
	}

	/**
	* Returns the association ID of this ext validation.
	*
	* @return the association ID of this ext validation
	*/
	@Override
	public long getAssociationId() {
		return _extValidation.getAssociationId();
	}

	/**
	* Returns the company ID of this ext validation.
	*
	* @return the company ID of this ext validation
	*/
	@Override
	public long getCompanyId() {
		return _extValidation.getCompanyId();
	}

	/**
	* Returns the conference ID of this ext validation.
	*
	* @return the conference ID of this ext validation
	*/
	@Override
	public long getConferenceId() {
		return _extValidation.getConferenceId();
	}

	/**
	* Returns the create date of this ext validation.
	*
	* @return the create date of this ext validation
	*/
	@Override
	public Date getCreateDate() {
		return _extValidation.getCreateDate();
	}

	/**
	* Returns the current criminal background check of this ext validation.
	*
	* @return the current criminal background check of this ext validation
	*/
	@Override
	public boolean getCurrentCriminalBackgroundCheck() {
		return _extValidation.getCurrentCriminalBackgroundCheck();
	}

	/**
	* Returns the current standing and fitness of this ext validation.
	*
	* @return the current standing and fitness of this ext validation
	*/
	@Override
	public boolean getCurrentStandingAndFitness() {
		return _extValidation.getCurrentStandingAndFitness();
	}

	/**
	* Returns the email date of this ext validation.
	*
	* @return the email date of this ext validation
	*/
	@Override
	public Date getEmailDate() {
		return _extValidation.getEmailDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _extValidation.getExpandoBridge();
	}

	/**
	* Returns the ext validation ID of this ext validation.
	*
	* @return the ext validation ID of this ext validation
	*/
	@Override
	public long getExtValidationId() {
		return _extValidation.getExtValidationId();
	}

	/**
	* Returns the modified date of this ext validation.
	*
	* @return the modified date of this ext validation
	*/
	@Override
	public Date getModifiedDate() {
		return _extValidation.getModifiedDate();
	}

	/**
	* Returns the primary key of this ext validation.
	*
	* @return the primary key of this ext validation
	*/
	@Override
	public long getPrimaryKey() {
		return _extValidation.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _extValidation.getPrimaryKeyObj();
	}

	/**
	* Returns the profile file entry ID of this ext validation.
	*
	* @return the profile file entry ID of this ext validation
	*/
	@Override
	public long getProfileFileEntryId() {
		return _extValidation.getProfileFileEntryId();
	}

	/**
	* Returns the profile file version ID of this ext validation.
	*
	* @return the profile file version ID of this ext validation
	*/
	@Override
	public long getProfileFileVersionId() {
		return _extValidation.getProfileFileVersionId();
	}

	/**
	* Returns the signature file entry ID of this ext validation.
	*
	* @return the signature file entry ID of this ext validation
	*/
	@Override
	public long getSignatureFileEntryId() {
		return _extValidation.getSignatureFileEntryId();
	}

	/**
	* Returns the signature file version ID of this ext validation.
	*
	* @return the signature file version ID of this ext validation
	*/
	@Override
	public long getSignatureFileVersionId() {
		return _extValidation.getSignatureFileVersionId();
	}

	/**
	* Returns the signature json of this ext validation.
	*
	* @return the signature json of this ext validation
	*/
	@Override
	public String getSignatureJson() {
		return _extValidation.getSignatureJson();
	}

	/**
	* Returns the signature name of this ext validation.
	*
	* @return the signature name of this ext validation
	*/
	@Override
	public String getSignatureName() {
		return _extValidation.getSignatureName();
	}

	/**
	* Returns the signature timestamp of this ext validation.
	*
	* @return the signature timestamp of this ext validation
	*/
	@Override
	public Date getSignatureTimestamp() {
		return _extValidation.getSignatureTimestamp();
	}

	/**
	* Returns the signature title of this ext validation.
	*
	* @return the signature title of this ext validation
	*/
	@Override
	public String getSignatureTitle() {
		return _extValidation.getSignatureTitle();
	}

	/**
	* Returns the submit date of this ext validation.
	*
	* @return the submit date of this ext validation
	*/
	@Override
	public Date getSubmitDate() {
		return _extValidation.getSubmitDate();
	}

	/**
	* Returns the user ID of this ext validation.
	*
	* @return the user ID of this ext validation
	*/
	@Override
	public long getUserId() {
		return _extValidation.getUserId();
	}

	/**
	* Returns the user uuid of this ext validation.
	*
	* @return the user uuid of this ext validation
	*/
	@Override
	public String getUserUuid() {
		return _extValidation.getUserUuid();
	}

	/**
	* Returns the validator user ID of this ext validation.
	*
	* @return the validator user ID of this ext validation
	*/
	@Override
	public long getValidatorUserId() {
		return _extValidation.getValidatorUserId();
	}

	/**
	* Returns the validator user uuid of this ext validation.
	*
	* @return the validator user uuid of this ext validation
	*/
	@Override
	public String getValidatorUserUuid() {
		return _extValidation.getValidatorUserUuid();
	}

	/**
	* Returns the withhold validation of this ext validation.
	*
	* @return the withhold validation of this ext validation
	*/
	@Override
	public boolean getWithholdValidation() {
		return _extValidation.getWithholdValidation();
	}

	@Override
	public int hashCode() {
		return _extValidation.hashCode();
	}

	/**
	* Returns <code>true</code> if this ext validation is accurate current employment.
	*
	* @return <code>true</code> if this ext validation is accurate current employment; <code>false</code> otherwise
	*/
	@Override
	public boolean isAccurateCurrentEmployment() {
		return _extValidation.isAccurateCurrentEmployment();
	}

	/**
	* Returns <code>true</code> if this ext validation is accurate self disclosure.
	*
	* @return <code>true</code> if this ext validation is accurate self disclosure; <code>false</code> otherwise
	*/
	@Override
	public boolean isAccurateSelfDisclosure() {
		return _extValidation.isAccurateSelfDisclosure();
	}

	@Override
	public boolean isCachedModel() {
		return _extValidation.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this ext validation is current criminal background check.
	*
	* @return <code>true</code> if this ext validation is current criminal background check; <code>false</code> otherwise
	*/
	@Override
	public boolean isCurrentCriminalBackgroundCheck() {
		return _extValidation.isCurrentCriminalBackgroundCheck();
	}

	/**
	* Returns <code>true</code> if this ext validation is current standing and fitness.
	*
	* @return <code>true</code> if this ext validation is current standing and fitness; <code>false</code> otherwise
	*/
	@Override
	public boolean isCurrentStandingAndFitness() {
		return _extValidation.isCurrentStandingAndFitness();
	}

	@Override
	public boolean isEscapedModel() {
		return _extValidation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _extValidation.isNew();
	}

	/**
	* Returns <code>true</code> if this ext validation is withhold validation.
	*
	* @return <code>true</code> if this ext validation is withhold validation; <code>false</code> otherwise
	*/
	@Override
	public boolean isWithholdValidation() {
		return _extValidation.isWithholdValidation();
	}

	@Override
	public void persist() {
		_extValidation.persist();
	}

	/**
	* Sets whether this ext validation is accurate current employment.
	*
	* @param accurateCurrentEmployment the accurate current employment of this ext validation
	*/
	@Override
	public void setAccurateCurrentEmployment(boolean accurateCurrentEmployment) {
		_extValidation.setAccurateCurrentEmployment(accurateCurrentEmployment);
	}

	/**
	* Sets whether this ext validation is accurate self disclosure.
	*
	* @param accurateSelfDisclosure the accurate self disclosure of this ext validation
	*/
	@Override
	public void setAccurateSelfDisclosure(boolean accurateSelfDisclosure) {
		_extValidation.setAccurateSelfDisclosure(accurateSelfDisclosure);
	}

	/**
	* Sets the additional comments of this ext validation.
	*
	* @param additionalComments the additional comments of this ext validation
	*/
	@Override
	public void setAdditionalComments(String additionalComments) {
		_extValidation.setAdditionalComments(additionalComments);
	}

	/**
	* Sets the association ID of this ext validation.
	*
	* @param associationId the association ID of this ext validation
	*/
	@Override
	public void setAssociationId(long associationId) {
		_extValidation.setAssociationId(associationId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_extValidation.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this ext validation.
	*
	* @param companyId the company ID of this ext validation
	*/
	@Override
	public void setCompanyId(long companyId) {
		_extValidation.setCompanyId(companyId);
	}

	/**
	* Sets the conference ID of this ext validation.
	*
	* @param conferenceId the conference ID of this ext validation
	*/
	@Override
	public void setConferenceId(long conferenceId) {
		_extValidation.setConferenceId(conferenceId);
	}

	/**
	* Sets the create date of this ext validation.
	*
	* @param createDate the create date of this ext validation
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_extValidation.setCreateDate(createDate);
	}

	/**
	* Sets whether this ext validation is current criminal background check.
	*
	* @param currentCriminalBackgroundCheck the current criminal background check of this ext validation
	*/
	@Override
	public void setCurrentCriminalBackgroundCheck(
		boolean currentCriminalBackgroundCheck) {
		_extValidation.setCurrentCriminalBackgroundCheck(currentCriminalBackgroundCheck);
	}

	/**
	* Sets whether this ext validation is current standing and fitness.
	*
	* @param currentStandingAndFitness the current standing and fitness of this ext validation
	*/
	@Override
	public void setCurrentStandingAndFitness(boolean currentStandingAndFitness) {
		_extValidation.setCurrentStandingAndFitness(currentStandingAndFitness);
	}

	/**
	* Sets the email date of this ext validation.
	*
	* @param emailDate the email date of this ext validation
	*/
	@Override
	public void setEmailDate(Date emailDate) {
		_extValidation.setEmailDate(emailDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_extValidation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_extValidation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_extValidation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ext validation ID of this ext validation.
	*
	* @param extValidationId the ext validation ID of this ext validation
	*/
	@Override
	public void setExtValidationId(long extValidationId) {
		_extValidation.setExtValidationId(extValidationId);
	}

	/**
	* Sets the modified date of this ext validation.
	*
	* @param modifiedDate the modified date of this ext validation
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_extValidation.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_extValidation.setNew(n);
	}

	/**
	* Sets the primary key of this ext validation.
	*
	* @param primaryKey the primary key of this ext validation
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_extValidation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_extValidation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the profile file entry ID of this ext validation.
	*
	* @param profileFileEntryId the profile file entry ID of this ext validation
	*/
	@Override
	public void setProfileFileEntryId(long profileFileEntryId) {
		_extValidation.setProfileFileEntryId(profileFileEntryId);
	}

	/**
	* Sets the profile file version ID of this ext validation.
	*
	* @param profileFileVersionId the profile file version ID of this ext validation
	*/
	@Override
	public void setProfileFileVersionId(long profileFileVersionId) {
		_extValidation.setProfileFileVersionId(profileFileVersionId);
	}

	/**
	* Sets the signature file entry ID of this ext validation.
	*
	* @param signatureFileEntryId the signature file entry ID of this ext validation
	*/
	@Override
	public void setSignatureFileEntryId(long signatureFileEntryId) {
		_extValidation.setSignatureFileEntryId(signatureFileEntryId);
	}

	/**
	* Sets the signature file version ID of this ext validation.
	*
	* @param signatureFileVersionId the signature file version ID of this ext validation
	*/
	@Override
	public void setSignatureFileVersionId(long signatureFileVersionId) {
		_extValidation.setSignatureFileVersionId(signatureFileVersionId);
	}

	/**
	* Sets the signature json of this ext validation.
	*
	* @param signatureJson the signature json of this ext validation
	*/
	@Override
	public void setSignatureJson(String signatureJson) {
		_extValidation.setSignatureJson(signatureJson);
	}

	/**
	* Sets the signature name of this ext validation.
	*
	* @param signatureName the signature name of this ext validation
	*/
	@Override
	public void setSignatureName(String signatureName) {
		_extValidation.setSignatureName(signatureName);
	}

	/**
	* Sets the signature timestamp of this ext validation.
	*
	* @param signatureTimestamp the signature timestamp of this ext validation
	*/
	@Override
	public void setSignatureTimestamp(Date signatureTimestamp) {
		_extValidation.setSignatureTimestamp(signatureTimestamp);
	}

	/**
	* Sets the signature title of this ext validation.
	*
	* @param signatureTitle the signature title of this ext validation
	*/
	@Override
	public void setSignatureTitle(String signatureTitle) {
		_extValidation.setSignatureTitle(signatureTitle);
	}

	/**
	* Sets the submit date of this ext validation.
	*
	* @param submitDate the submit date of this ext validation
	*/
	@Override
	public void setSubmitDate(Date submitDate) {
		_extValidation.setSubmitDate(submitDate);
	}

	/**
	* Sets the user ID of this ext validation.
	*
	* @param userId the user ID of this ext validation
	*/
	@Override
	public void setUserId(long userId) {
		_extValidation.setUserId(userId);
	}

	/**
	* Sets the user uuid of this ext validation.
	*
	* @param userUuid the user uuid of this ext validation
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_extValidation.setUserUuid(userUuid);
	}

	/**
	* Sets the validator user ID of this ext validation.
	*
	* @param validatorUserId the validator user ID of this ext validation
	*/
	@Override
	public void setValidatorUserId(long validatorUserId) {
		_extValidation.setValidatorUserId(validatorUserId);
	}

	/**
	* Sets the validator user uuid of this ext validation.
	*
	* @param validatorUserUuid the validator user uuid of this ext validation
	*/
	@Override
	public void setValidatorUserUuid(String validatorUserUuid) {
		_extValidation.setValidatorUserUuid(validatorUserUuid);
	}

	/**
	* Sets whether this ext validation is withhold validation.
	*
	* @param withholdValidation the withhold validation of this ext validation
	*/
	@Override
	public void setWithholdValidation(boolean withholdValidation) {
		_extValidation.setWithholdValidation(withholdValidation);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ExtValidation> toCacheModel() {
		return _extValidation.toCacheModel();
	}

	@Override
	public ExtValidation toEscapedModel() {
		return new ExtValidationWrapper(_extValidation.toEscapedModel());
	}

	@Override
	public String toString() {
		return _extValidation.toString();
	}

	@Override
	public ExtValidation toUnescapedModel() {
		return new ExtValidationWrapper(_extValidation.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _extValidation.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtValidationWrapper)) {
			return false;
		}

		ExtValidationWrapper extValidationWrapper = (ExtValidationWrapper)obj;

		if (Objects.equals(_extValidation, extValidationWrapper._extValidation)) {
			return true;
		}

		return false;
	}

	@Override
	public ExtValidation getWrappedModel() {
		return _extValidation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _extValidation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _extValidation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_extValidation.resetOriginalValues();
	}

	private final ExtValidation _extValidation;
}