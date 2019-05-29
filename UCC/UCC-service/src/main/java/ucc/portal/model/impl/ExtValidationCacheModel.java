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

package ucc.portal.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import ucc.portal.model.ExtValidation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExtValidation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ExtValidation
 * @generated
 */
@ProviderType
public class ExtValidationCacheModel implements CacheModel<ExtValidation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtValidationCacheModel)) {
			return false;
		}

		ExtValidationCacheModel extValidationCacheModel = (ExtValidationCacheModel)obj;

		if (extValidationId == extValidationCacheModel.extValidationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, extValidationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{extValidationId=");
		sb.append(extValidationId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", profileFileEntryId=");
		sb.append(profileFileEntryId);
		sb.append(", profileFileVersionId=");
		sb.append(profileFileVersionId);
		sb.append(", validatorUserId=");
		sb.append(validatorUserId);
		sb.append(", emailDate=");
		sb.append(emailDate);
		sb.append(", currentStandingAndFitness=");
		sb.append(currentStandingAndFitness);
		sb.append(", currentCriminalBackgroundCheck=");
		sb.append(currentCriminalBackgroundCheck);
		sb.append(", accurateCurrentEmployment=");
		sb.append(accurateCurrentEmployment);
		sb.append(", accurateSelfDisclosure=");
		sb.append(accurateSelfDisclosure);
		sb.append(", signatureJson=");
		sb.append(signatureJson);
		sb.append(", signatureFileEntryId=");
		sb.append(signatureFileEntryId);
		sb.append(", signatureFileVersionId=");
		sb.append(signatureFileVersionId);
		sb.append(", signatureName=");
		sb.append(signatureName);
		sb.append(", signatureTimestamp=");
		sb.append(signatureTimestamp);
		sb.append(", signatureTitle=");
		sb.append(signatureTitle);
		sb.append(", conferenceId=");
		sb.append(conferenceId);
		sb.append(", associationId=");
		sb.append(associationId);
		sb.append(", withholdValidation=");
		sb.append(withholdValidation);
		sb.append(", additionalComments=");
		sb.append(additionalComments);
		sb.append(", submitDate=");
		sb.append(submitDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExtValidation toEntityModel() {
		ExtValidationImpl extValidationImpl = new ExtValidationImpl();

		extValidationImpl.setExtValidationId(extValidationId);
		extValidationImpl.setCompanyId(companyId);
		extValidationImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			extValidationImpl.setCreateDate(null);
		}
		else {
			extValidationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			extValidationImpl.setModifiedDate(null);
		}
		else {
			extValidationImpl.setModifiedDate(new Date(modifiedDate));
		}

		extValidationImpl.setProfileFileEntryId(profileFileEntryId);
		extValidationImpl.setProfileFileVersionId(profileFileVersionId);
		extValidationImpl.setValidatorUserId(validatorUserId);

		if (emailDate == Long.MIN_VALUE) {
			extValidationImpl.setEmailDate(null);
		}
		else {
			extValidationImpl.setEmailDate(new Date(emailDate));
		}

		extValidationImpl.setCurrentStandingAndFitness(currentStandingAndFitness);
		extValidationImpl.setCurrentCriminalBackgroundCheck(currentCriminalBackgroundCheck);
		extValidationImpl.setAccurateCurrentEmployment(accurateCurrentEmployment);
		extValidationImpl.setAccurateSelfDisclosure(accurateSelfDisclosure);

		if (signatureJson == null) {
			extValidationImpl.setSignatureJson("");
		}
		else {
			extValidationImpl.setSignatureJson(signatureJson);
		}

		extValidationImpl.setSignatureFileEntryId(signatureFileEntryId);
		extValidationImpl.setSignatureFileVersionId(signatureFileVersionId);

		if (signatureName == null) {
			extValidationImpl.setSignatureName("");
		}
		else {
			extValidationImpl.setSignatureName(signatureName);
		}

		if (signatureTimestamp == Long.MIN_VALUE) {
			extValidationImpl.setSignatureTimestamp(null);
		}
		else {
			extValidationImpl.setSignatureTimestamp(new Date(signatureTimestamp));
		}

		if (signatureTitle == null) {
			extValidationImpl.setSignatureTitle("");
		}
		else {
			extValidationImpl.setSignatureTitle(signatureTitle);
		}

		extValidationImpl.setConferenceId(conferenceId);
		extValidationImpl.setAssociationId(associationId);
		extValidationImpl.setWithholdValidation(withholdValidation);

		if (additionalComments == null) {
			extValidationImpl.setAdditionalComments("");
		}
		else {
			extValidationImpl.setAdditionalComments(additionalComments);
		}

		if (submitDate == Long.MIN_VALUE) {
			extValidationImpl.setSubmitDate(null);
		}
		else {
			extValidationImpl.setSubmitDate(new Date(submitDate));
		}

		extValidationImpl.resetOriginalValues();

		return extValidationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		extValidationId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		profileFileEntryId = objectInput.readLong();

		profileFileVersionId = objectInput.readLong();

		validatorUserId = objectInput.readLong();
		emailDate = objectInput.readLong();

		currentStandingAndFitness = objectInput.readBoolean();

		currentCriminalBackgroundCheck = objectInput.readBoolean();

		accurateCurrentEmployment = objectInput.readBoolean();

		accurateSelfDisclosure = objectInput.readBoolean();
		signatureJson = objectInput.readUTF();

		signatureFileEntryId = objectInput.readLong();

		signatureFileVersionId = objectInput.readLong();
		signatureName = objectInput.readUTF();
		signatureTimestamp = objectInput.readLong();
		signatureTitle = objectInput.readUTF();

		conferenceId = objectInput.readLong();

		associationId = objectInput.readLong();

		withholdValidation = objectInput.readBoolean();
		additionalComments = objectInput.readUTF();
		submitDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(extValidationId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(profileFileEntryId);

		objectOutput.writeLong(profileFileVersionId);

		objectOutput.writeLong(validatorUserId);
		objectOutput.writeLong(emailDate);

		objectOutput.writeBoolean(currentStandingAndFitness);

		objectOutput.writeBoolean(currentCriminalBackgroundCheck);

		objectOutput.writeBoolean(accurateCurrentEmployment);

		objectOutput.writeBoolean(accurateSelfDisclosure);

		if (signatureJson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatureJson);
		}

		objectOutput.writeLong(signatureFileEntryId);

		objectOutput.writeLong(signatureFileVersionId);

		if (signatureName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatureName);
		}

		objectOutput.writeLong(signatureTimestamp);

		if (signatureTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatureTitle);
		}

		objectOutput.writeLong(conferenceId);

		objectOutput.writeLong(associationId);

		objectOutput.writeBoolean(withholdValidation);

		if (additionalComments == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(additionalComments);
		}

		objectOutput.writeLong(submitDate);
	}

	public long extValidationId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long profileFileEntryId;
	public long profileFileVersionId;
	public long validatorUserId;
	public long emailDate;
	public boolean currentStandingAndFitness;
	public boolean currentCriminalBackgroundCheck;
	public boolean accurateCurrentEmployment;
	public boolean accurateSelfDisclosure;
	public String signatureJson;
	public long signatureFileEntryId;
	public long signatureFileVersionId;
	public String signatureName;
	public long signatureTimestamp;
	public String signatureTitle;
	public long conferenceId;
	public long associationId;
	public boolean withholdValidation;
	public String additionalComments;
	public long submitDate;
}