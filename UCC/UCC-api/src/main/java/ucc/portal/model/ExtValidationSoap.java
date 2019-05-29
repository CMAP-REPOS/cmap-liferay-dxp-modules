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
public class ExtValidationSoap implements Serializable {
	public static ExtValidationSoap toSoapModel(ExtValidation model) {
		ExtValidationSoap soapModel = new ExtValidationSoap();

		soapModel.setExtValidationId(model.getExtValidationId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setProfileFileEntryId(model.getProfileFileEntryId());
		soapModel.setProfileFileVersionId(model.getProfileFileVersionId());
		soapModel.setValidatorUserId(model.getValidatorUserId());
		soapModel.setEmailDate(model.getEmailDate());
		soapModel.setCurrentStandingAndFitness(model.isCurrentStandingAndFitness());
		soapModel.setCurrentCriminalBackgroundCheck(model.isCurrentCriminalBackgroundCheck());
		soapModel.setAccurateCurrentEmployment(model.isAccurateCurrentEmployment());
		soapModel.setAccurateSelfDisclosure(model.isAccurateSelfDisclosure());
		soapModel.setSignatureJson(model.getSignatureJson());
		soapModel.setSignatureFileEntryId(model.getSignatureFileEntryId());
		soapModel.setSignatureFileVersionId(model.getSignatureFileVersionId());
		soapModel.setSignatureName(model.getSignatureName());
		soapModel.setSignatureTimestamp(model.getSignatureTimestamp());
		soapModel.setSignatureTitle(model.getSignatureTitle());
		soapModel.setConferenceId(model.getConferenceId());
		soapModel.setAssociationId(model.getAssociationId());
		soapModel.setWithholdValidation(model.isWithholdValidation());
		soapModel.setAdditionalComments(model.getAdditionalComments());
		soapModel.setSubmitDate(model.getSubmitDate());

		return soapModel;
	}

	public static ExtValidationSoap[] toSoapModels(ExtValidation[] models) {
		ExtValidationSoap[] soapModels = new ExtValidationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ExtValidationSoap[][] toSoapModels(ExtValidation[][] models) {
		ExtValidationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ExtValidationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ExtValidationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ExtValidationSoap[] toSoapModels(List<ExtValidation> models) {
		List<ExtValidationSoap> soapModels = new ArrayList<ExtValidationSoap>(models.size());

		for (ExtValidation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ExtValidationSoap[soapModels.size()]);
	}

	public ExtValidationSoap() {
	}

	public long getPrimaryKey() {
		return _extValidationId;
	}

	public void setPrimaryKey(long pk) {
		setExtValidationId(pk);
	}

	public long getExtValidationId() {
		return _extValidationId;
	}

	public void setExtValidationId(long extValidationId) {
		_extValidationId = extValidationId;
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

	public long getProfileFileEntryId() {
		return _profileFileEntryId;
	}

	public void setProfileFileEntryId(long profileFileEntryId) {
		_profileFileEntryId = profileFileEntryId;
	}

	public long getProfileFileVersionId() {
		return _profileFileVersionId;
	}

	public void setProfileFileVersionId(long profileFileVersionId) {
		_profileFileVersionId = profileFileVersionId;
	}

	public long getValidatorUserId() {
		return _validatorUserId;
	}

	public void setValidatorUserId(long validatorUserId) {
		_validatorUserId = validatorUserId;
	}

	public Date getEmailDate() {
		return _emailDate;
	}

	public void setEmailDate(Date emailDate) {
		_emailDate = emailDate;
	}

	public boolean getCurrentStandingAndFitness() {
		return _currentStandingAndFitness;
	}

	public boolean isCurrentStandingAndFitness() {
		return _currentStandingAndFitness;
	}

	public void setCurrentStandingAndFitness(boolean currentStandingAndFitness) {
		_currentStandingAndFitness = currentStandingAndFitness;
	}

	public boolean getCurrentCriminalBackgroundCheck() {
		return _currentCriminalBackgroundCheck;
	}

	public boolean isCurrentCriminalBackgroundCheck() {
		return _currentCriminalBackgroundCheck;
	}

	public void setCurrentCriminalBackgroundCheck(
		boolean currentCriminalBackgroundCheck) {
		_currentCriminalBackgroundCheck = currentCriminalBackgroundCheck;
	}

	public boolean getAccurateCurrentEmployment() {
		return _accurateCurrentEmployment;
	}

	public boolean isAccurateCurrentEmployment() {
		return _accurateCurrentEmployment;
	}

	public void setAccurateCurrentEmployment(boolean accurateCurrentEmployment) {
		_accurateCurrentEmployment = accurateCurrentEmployment;
	}

	public boolean getAccurateSelfDisclosure() {
		return _accurateSelfDisclosure;
	}

	public boolean isAccurateSelfDisclosure() {
		return _accurateSelfDisclosure;
	}

	public void setAccurateSelfDisclosure(boolean accurateSelfDisclosure) {
		_accurateSelfDisclosure = accurateSelfDisclosure;
	}

	public String getSignatureJson() {
		return _signatureJson;
	}

	public void setSignatureJson(String signatureJson) {
		_signatureJson = signatureJson;
	}

	public long getSignatureFileEntryId() {
		return _signatureFileEntryId;
	}

	public void setSignatureFileEntryId(long signatureFileEntryId) {
		_signatureFileEntryId = signatureFileEntryId;
	}

	public long getSignatureFileVersionId() {
		return _signatureFileVersionId;
	}

	public void setSignatureFileVersionId(long signatureFileVersionId) {
		_signatureFileVersionId = signatureFileVersionId;
	}

	public String getSignatureName() {
		return _signatureName;
	}

	public void setSignatureName(String signatureName) {
		_signatureName = signatureName;
	}

	public Date getSignatureTimestamp() {
		return _signatureTimestamp;
	}

	public void setSignatureTimestamp(Date signatureTimestamp) {
		_signatureTimestamp = signatureTimestamp;
	}

	public String getSignatureTitle() {
		return _signatureTitle;
	}

	public void setSignatureTitle(String signatureTitle) {
		_signatureTitle = signatureTitle;
	}

	public long getConferenceId() {
		return _conferenceId;
	}

	public void setConferenceId(long conferenceId) {
		_conferenceId = conferenceId;
	}

	public long getAssociationId() {
		return _associationId;
	}

	public void setAssociationId(long associationId) {
		_associationId = associationId;
	}

	public boolean getWithholdValidation() {
		return _withholdValidation;
	}

	public boolean isWithholdValidation() {
		return _withholdValidation;
	}

	public void setWithholdValidation(boolean withholdValidation) {
		_withholdValidation = withholdValidation;
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

	private long _extValidationId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _profileFileEntryId;
	private long _profileFileVersionId;
	private long _validatorUserId;
	private Date _emailDate;
	private boolean _currentStandingAndFitness;
	private boolean _currentCriminalBackgroundCheck;
	private boolean _accurateCurrentEmployment;
	private boolean _accurateSelfDisclosure;
	private String _signatureJson;
	private long _signatureFileEntryId;
	private long _signatureFileVersionId;
	private String _signatureName;
	private Date _signatureTimestamp;
	private String _signatureTitle;
	private long _conferenceId;
	private long _associationId;
	private boolean _withholdValidation;
	private String _additionalComments;
	private Date _submitDate;
}