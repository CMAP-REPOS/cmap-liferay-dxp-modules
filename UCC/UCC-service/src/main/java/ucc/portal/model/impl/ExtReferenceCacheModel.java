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

import ucc.portal.model.ExtReference;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExtReference in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ExtReference
 * @generated
 */
@ProviderType
public class ExtReferenceCacheModel implements CacheModel<ExtReference>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtReferenceCacheModel)) {
			return false;
		}

		ExtReferenceCacheModel extReferenceCacheModel = (ExtReferenceCacheModel)obj;

		if (extReferenceId == extReferenceCacheModel.extReferenceId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, extReferenceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(61);

		sb.append("{extReferenceId=");
		sb.append(extReferenceId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", referenceUserId=");
		sb.append(referenceUserId);
		sb.append(", userCreated=");
		sb.append(userCreated);
		sb.append(", emailDate=");
		sb.append(emailDate);
		sb.append(", resendEmail=");
		sb.append(resendEmail);
		sb.append(", roleAndRelationship=");
		sb.append(roleAndRelationship);
		sb.append(", areasOfStrength=");
		sb.append(areasOfStrength);
		sb.append(", areasOfGrowth=");
		sb.append(areasOfGrowth);
		sb.append(", significantExperience=");
		sb.append(significantExperience);
		sb.append(", additionalComments=");
		sb.append(additionalComments);
		sb.append(", submitDate=");
		sb.append(submitDate);
		sb.append(", userFirstName=");
		sb.append(userFirstName);
		sb.append(", userMiddleName=");
		sb.append(userMiddleName);
		sb.append(", userLastName=");
		sb.append(userLastName);
		sb.append(", userEmailAddress=");
		sb.append(userEmailAddress);
		sb.append(", addressStreet1=");
		sb.append(addressStreet1);
		sb.append(", addressStreet2=");
		sb.append(addressStreet2);
		sb.append(", addressStreet3=");
		sb.append(addressStreet3);
		sb.append(", addressCity=");
		sb.append(addressCity);
		sb.append(", addressZip=");
		sb.append(addressZip);
		sb.append(", addressRegionId=");
		sb.append(addressRegionId);
		sb.append(", addressCountryId=");
		sb.append(addressCountryId);
		sb.append(", addressTypeId=");
		sb.append(addressTypeId);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append(", phoneExtension=");
		sb.append(phoneExtension);
		sb.append(", phoneTypeId=");
		sb.append(phoneTypeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExtReference toEntityModel() {
		ExtReferenceImpl extReferenceImpl = new ExtReferenceImpl();

		extReferenceImpl.setExtReferenceId(extReferenceId);
		extReferenceImpl.setCompanyId(companyId);
		extReferenceImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			extReferenceImpl.setCreateDate(null);
		}
		else {
			extReferenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			extReferenceImpl.setModifiedDate(null);
		}
		else {
			extReferenceImpl.setModifiedDate(new Date(modifiedDate));
		}

		extReferenceImpl.setReferenceUserId(referenceUserId);
		extReferenceImpl.setUserCreated(userCreated);

		if (emailDate == Long.MIN_VALUE) {
			extReferenceImpl.setEmailDate(null);
		}
		else {
			extReferenceImpl.setEmailDate(new Date(emailDate));
		}

		extReferenceImpl.setResendEmail(resendEmail);

		if (roleAndRelationship == null) {
			extReferenceImpl.setRoleAndRelationship("");
		}
		else {
			extReferenceImpl.setRoleAndRelationship(roleAndRelationship);
		}

		if (areasOfStrength == null) {
			extReferenceImpl.setAreasOfStrength("");
		}
		else {
			extReferenceImpl.setAreasOfStrength(areasOfStrength);
		}

		if (areasOfGrowth == null) {
			extReferenceImpl.setAreasOfGrowth("");
		}
		else {
			extReferenceImpl.setAreasOfGrowth(areasOfGrowth);
		}

		if (significantExperience == null) {
			extReferenceImpl.setSignificantExperience("");
		}
		else {
			extReferenceImpl.setSignificantExperience(significantExperience);
		}

		if (additionalComments == null) {
			extReferenceImpl.setAdditionalComments("");
		}
		else {
			extReferenceImpl.setAdditionalComments(additionalComments);
		}

		if (submitDate == Long.MIN_VALUE) {
			extReferenceImpl.setSubmitDate(null);
		}
		else {
			extReferenceImpl.setSubmitDate(new Date(submitDate));
		}

		if (userFirstName == null) {
			extReferenceImpl.setUserFirstName("");
		}
		else {
			extReferenceImpl.setUserFirstName(userFirstName);
		}

		if (userMiddleName == null) {
			extReferenceImpl.setUserMiddleName("");
		}
		else {
			extReferenceImpl.setUserMiddleName(userMiddleName);
		}

		if (userLastName == null) {
			extReferenceImpl.setUserLastName("");
		}
		else {
			extReferenceImpl.setUserLastName(userLastName);
		}

		if (userEmailAddress == null) {
			extReferenceImpl.setUserEmailAddress("");
		}
		else {
			extReferenceImpl.setUserEmailAddress(userEmailAddress);
		}

		if (addressStreet1 == null) {
			extReferenceImpl.setAddressStreet1("");
		}
		else {
			extReferenceImpl.setAddressStreet1(addressStreet1);
		}

		if (addressStreet2 == null) {
			extReferenceImpl.setAddressStreet2("");
		}
		else {
			extReferenceImpl.setAddressStreet2(addressStreet2);
		}

		if (addressStreet3 == null) {
			extReferenceImpl.setAddressStreet3("");
		}
		else {
			extReferenceImpl.setAddressStreet3(addressStreet3);
		}

		if (addressCity == null) {
			extReferenceImpl.setAddressCity("");
		}
		else {
			extReferenceImpl.setAddressCity(addressCity);
		}

		if (addressZip == null) {
			extReferenceImpl.setAddressZip("");
		}
		else {
			extReferenceImpl.setAddressZip(addressZip);
		}

		extReferenceImpl.setAddressRegionId(addressRegionId);
		extReferenceImpl.setAddressCountryId(addressCountryId);
		extReferenceImpl.setAddressTypeId(addressTypeId);

		if (phoneNumber == null) {
			extReferenceImpl.setPhoneNumber("");
		}
		else {
			extReferenceImpl.setPhoneNumber(phoneNumber);
		}

		if (phoneExtension == null) {
			extReferenceImpl.setPhoneExtension("");
		}
		else {
			extReferenceImpl.setPhoneExtension(phoneExtension);
		}

		extReferenceImpl.setPhoneTypeId(phoneTypeId);

		extReferenceImpl.resetOriginalValues();

		return extReferenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		extReferenceId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		referenceUserId = objectInput.readLong();

		userCreated = objectInput.readBoolean();
		emailDate = objectInput.readLong();

		resendEmail = objectInput.readBoolean();
		roleAndRelationship = objectInput.readUTF();
		areasOfStrength = objectInput.readUTF();
		areasOfGrowth = objectInput.readUTF();
		significantExperience = objectInput.readUTF();
		additionalComments = objectInput.readUTF();
		submitDate = objectInput.readLong();
		userFirstName = objectInput.readUTF();
		userMiddleName = objectInput.readUTF();
		userLastName = objectInput.readUTF();
		userEmailAddress = objectInput.readUTF();
		addressStreet1 = objectInput.readUTF();
		addressStreet2 = objectInput.readUTF();
		addressStreet3 = objectInput.readUTF();
		addressCity = objectInput.readUTF();
		addressZip = objectInput.readUTF();

		addressRegionId = objectInput.readLong();

		addressCountryId = objectInput.readLong();

		addressTypeId = objectInput.readInt();
		phoneNumber = objectInput.readUTF();
		phoneExtension = objectInput.readUTF();

		phoneTypeId = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(extReferenceId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(referenceUserId);

		objectOutput.writeBoolean(userCreated);
		objectOutput.writeLong(emailDate);

		objectOutput.writeBoolean(resendEmail);

		if (roleAndRelationship == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roleAndRelationship);
		}

		if (areasOfStrength == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(areasOfStrength);
		}

		if (areasOfGrowth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(areasOfGrowth);
		}

		if (significantExperience == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(significantExperience);
		}

		if (additionalComments == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(additionalComments);
		}

		objectOutput.writeLong(submitDate);

		if (userFirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userFirstName);
		}

		if (userMiddleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userMiddleName);
		}

		if (userLastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userLastName);
		}

		if (userEmailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userEmailAddress);
		}

		if (addressStreet1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressStreet1);
		}

		if (addressStreet2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressStreet2);
		}

		if (addressStreet3 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressStreet3);
		}

		if (addressCity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressCity);
		}

		if (addressZip == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressZip);
		}

		objectOutput.writeLong(addressRegionId);

		objectOutput.writeLong(addressCountryId);

		objectOutput.writeInt(addressTypeId);

		if (phoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(phoneNumber);
		}

		if (phoneExtension == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(phoneExtension);
		}

		objectOutput.writeInt(phoneTypeId);
	}

	public long extReferenceId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long referenceUserId;
	public boolean userCreated;
	public long emailDate;
	public boolean resendEmail;
	public String roleAndRelationship;
	public String areasOfStrength;
	public String areasOfGrowth;
	public String significantExperience;
	public String additionalComments;
	public long submitDate;
	public String userFirstName;
	public String userMiddleName;
	public String userLastName;
	public String userEmailAddress;
	public String addressStreet1;
	public String addressStreet2;
	public String addressStreet3;
	public String addressCity;
	public String addressZip;
	public long addressRegionId;
	public long addressCountryId;
	public int addressTypeId;
	public String phoneNumber;
	public String phoneExtension;
	public int phoneTypeId;
}