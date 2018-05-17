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

package contact.manager.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import contact.manager.model.CrmContact;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrmContact in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContact
 * @generated
 */
@ProviderType
public class CrmContactCacheModel implements CacheModel<CrmContact>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmContactCacheModel)) {
			return false;
		}

		CrmContactCacheModel crmContactCacheModel = (CrmContactCacheModel)obj;

		if (crmContactId == crmContactCacheModel.crmContactId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crmContactId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(93);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crmContactId=");
		sb.append(crmContactId);
		sb.append(", constantContactId=");
		sb.append(constantContactId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", prefix=");
		sb.append(prefix);
		sb.append(", salutation=");
		sb.append(salutation);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", organization=");
		sb.append(organization);
		sb.append(", jobTitle=");
		sb.append(jobTitle);
		sb.append(", primaryAddress1=");
		sb.append(primaryAddress1);
		sb.append(", primaryAddress2=");
		sb.append(primaryAddress2);
		sb.append(", primaryAddressCity=");
		sb.append(primaryAddressCity);
		sb.append(", primaryAddressState=");
		sb.append(primaryAddressState);
		sb.append(", primaryAddressZip=");
		sb.append(primaryAddressZip);
		sb.append(", primaryAddressCounty=");
		sb.append(primaryAddressCounty);
		sb.append(", primaryAddressCountry=");
		sb.append(primaryAddressCountry);
		sb.append(", secondaryAddress1=");
		sb.append(secondaryAddress1);
		sb.append(", secondaryAddress2=");
		sb.append(secondaryAddress2);
		sb.append(", secondaryAddressCity=");
		sb.append(secondaryAddressCity);
		sb.append(", secondaryAddressState=");
		sb.append(secondaryAddressState);
		sb.append(", secondaryAddressZip=");
		sb.append(secondaryAddressZip);
		sb.append(", secondaryAddressCounty=");
		sb.append(secondaryAddressCounty);
		sb.append(", secondaryAddressCountry=");
		sb.append(secondaryAddressCountry);
		sb.append(", primaryPhone=");
		sb.append(primaryPhone);
		sb.append(", primaryPhoneExtension=");
		sb.append(primaryPhoneExtension);
		sb.append(", primaryFax=");
		sb.append(primaryFax);
		sb.append(", primaryCell=");
		sb.append(primaryCell);
		sb.append(", primaryEmailAddress=");
		sb.append(primaryEmailAddress);
		sb.append(", alternateContact=");
		sb.append(alternateContact);
		sb.append(", alternateEmail=");
		sb.append(alternateEmail);
		sb.append(", isVip=");
		sb.append(isVip);
		sb.append(", facebookId=");
		sb.append(facebookId);
		sb.append(", twitterHandle=");
		sb.append(twitterHandle);
		sb.append(", linkedInUrl=");
		sb.append(linkedInUrl);
		sb.append(", status=");
		sb.append(status);
		sb.append(", kioskUuid=");
		sb.append(kioskUuid);
		sb.append(", imageFileEntryId=");
		sb.append(imageFileEntryId);
		sb.append(", tagsList=");
		sb.append(tagsList);
		sb.append(", groupsList=");
		sb.append(groupsList);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CrmContact toEntityModel() {
		CrmContactImpl crmContactImpl = new CrmContactImpl();

		if (uuid == null) {
			crmContactImpl.setUuid(StringPool.BLANK);
		}
		else {
			crmContactImpl.setUuid(uuid);
		}

		crmContactImpl.setCrmContactId(crmContactId);
		crmContactImpl.setConstantContactId(constantContactId);
		crmContactImpl.setGroupId(groupId);
		crmContactImpl.setCompanyId(companyId);
		crmContactImpl.setUserId(userId);

		if (userName == null) {
			crmContactImpl.setUserName(StringPool.BLANK);
		}
		else {
			crmContactImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crmContactImpl.setCreateDate(null);
		}
		else {
			crmContactImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crmContactImpl.setModifiedDate(null);
		}
		else {
			crmContactImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (prefix == null) {
			crmContactImpl.setPrefix(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrefix(prefix);
		}

		if (salutation == null) {
			crmContactImpl.setSalutation(StringPool.BLANK);
		}
		else {
			crmContactImpl.setSalutation(salutation);
		}

		if (firstName == null) {
			crmContactImpl.setFirstName(StringPool.BLANK);
		}
		else {
			crmContactImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			crmContactImpl.setMiddleName(StringPool.BLANK);
		}
		else {
			crmContactImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			crmContactImpl.setLastName(StringPool.BLANK);
		}
		else {
			crmContactImpl.setLastName(lastName);
		}

		if (organization == null) {
			crmContactImpl.setOrganization(StringPool.BLANK);
		}
		else {
			crmContactImpl.setOrganization(organization);
		}

		if (jobTitle == null) {
			crmContactImpl.setJobTitle(StringPool.BLANK);
		}
		else {
			crmContactImpl.setJobTitle(jobTitle);
		}

		if (primaryAddress1 == null) {
			crmContactImpl.setPrimaryAddress1(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrimaryAddress1(primaryAddress1);
		}

		if (primaryAddress2 == null) {
			crmContactImpl.setPrimaryAddress2(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrimaryAddress2(primaryAddress2);
		}

		if (primaryAddressCity == null) {
			crmContactImpl.setPrimaryAddressCity(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrimaryAddressCity(primaryAddressCity);
		}

		if (primaryAddressState == null) {
			crmContactImpl.setPrimaryAddressState(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrimaryAddressState(primaryAddressState);
		}

		if (primaryAddressZip == null) {
			crmContactImpl.setPrimaryAddressZip(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrimaryAddressZip(primaryAddressZip);
		}

		if (primaryAddressCounty == null) {
			crmContactImpl.setPrimaryAddressCounty(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrimaryAddressCounty(primaryAddressCounty);
		}

		if (primaryAddressCountry == null) {
			crmContactImpl.setPrimaryAddressCountry(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrimaryAddressCountry(primaryAddressCountry);
		}

		if (secondaryAddress1 == null) {
			crmContactImpl.setSecondaryAddress1(StringPool.BLANK);
		}
		else {
			crmContactImpl.setSecondaryAddress1(secondaryAddress1);
		}

		if (secondaryAddress2 == null) {
			crmContactImpl.setSecondaryAddress2(StringPool.BLANK);
		}
		else {
			crmContactImpl.setSecondaryAddress2(secondaryAddress2);
		}

		if (secondaryAddressCity == null) {
			crmContactImpl.setSecondaryAddressCity(StringPool.BLANK);
		}
		else {
			crmContactImpl.setSecondaryAddressCity(secondaryAddressCity);
		}

		if (secondaryAddressState == null) {
			crmContactImpl.setSecondaryAddressState(StringPool.BLANK);
		}
		else {
			crmContactImpl.setSecondaryAddressState(secondaryAddressState);
		}

		if (secondaryAddressZip == null) {
			crmContactImpl.setSecondaryAddressZip(StringPool.BLANK);
		}
		else {
			crmContactImpl.setSecondaryAddressZip(secondaryAddressZip);
		}

		if (secondaryAddressCounty == null) {
			crmContactImpl.setSecondaryAddressCounty(StringPool.BLANK);
		}
		else {
			crmContactImpl.setSecondaryAddressCounty(secondaryAddressCounty);
		}

		if (secondaryAddressCountry == null) {
			crmContactImpl.setSecondaryAddressCountry(StringPool.BLANK);
		}
		else {
			crmContactImpl.setSecondaryAddressCountry(secondaryAddressCountry);
		}

		if (primaryPhone == null) {
			crmContactImpl.setPrimaryPhone(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrimaryPhone(primaryPhone);
		}

		if (primaryPhoneExtension == null) {
			crmContactImpl.setPrimaryPhoneExtension(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrimaryPhoneExtension(primaryPhoneExtension);
		}

		if (primaryFax == null) {
			crmContactImpl.setPrimaryFax(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrimaryFax(primaryFax);
		}

		if (primaryCell == null) {
			crmContactImpl.setPrimaryCell(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrimaryCell(primaryCell);
		}

		if (primaryEmailAddress == null) {
			crmContactImpl.setPrimaryEmailAddress(StringPool.BLANK);
		}
		else {
			crmContactImpl.setPrimaryEmailAddress(primaryEmailAddress);
		}

		if (alternateContact == null) {
			crmContactImpl.setAlternateContact(StringPool.BLANK);
		}
		else {
			crmContactImpl.setAlternateContact(alternateContact);
		}

		if (alternateEmail == null) {
			crmContactImpl.setAlternateEmail(StringPool.BLANK);
		}
		else {
			crmContactImpl.setAlternateEmail(alternateEmail);
		}

		crmContactImpl.setIsVip(isVip);

		if (facebookId == null) {
			crmContactImpl.setFacebookId(StringPool.BLANK);
		}
		else {
			crmContactImpl.setFacebookId(facebookId);
		}

		if (twitterHandle == null) {
			crmContactImpl.setTwitterHandle(StringPool.BLANK);
		}
		else {
			crmContactImpl.setTwitterHandle(twitterHandle);
		}

		if (linkedInUrl == null) {
			crmContactImpl.setLinkedInUrl(StringPool.BLANK);
		}
		else {
			crmContactImpl.setLinkedInUrl(linkedInUrl);
		}

		if (status == null) {
			crmContactImpl.setStatus(StringPool.BLANK);
		}
		else {
			crmContactImpl.setStatus(status);
		}

		if (kioskUuid == null) {
			crmContactImpl.setKioskUuid(StringPool.BLANK);
		}
		else {
			crmContactImpl.setKioskUuid(kioskUuid);
		}

		crmContactImpl.setImageFileEntryId(imageFileEntryId);

		if (tagsList == null) {
			crmContactImpl.setTagsList(StringPool.BLANK);
		}
		else {
			crmContactImpl.setTagsList(tagsList);
		}

		if (groupsList == null) {
			crmContactImpl.setGroupsList(StringPool.BLANK);
		}
		else {
			crmContactImpl.setGroupsList(groupsList);
		}

		crmContactImpl.resetOriginalValues();

		return crmContactImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crmContactId = objectInput.readLong();

		constantContactId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		prefix = objectInput.readUTF();
		salutation = objectInput.readUTF();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		organization = objectInput.readUTF();
		jobTitle = objectInput.readUTF();
		primaryAddress1 = objectInput.readUTF();
		primaryAddress2 = objectInput.readUTF();
		primaryAddressCity = objectInput.readUTF();
		primaryAddressState = objectInput.readUTF();
		primaryAddressZip = objectInput.readUTF();
		primaryAddressCounty = objectInput.readUTF();
		primaryAddressCountry = objectInput.readUTF();
		secondaryAddress1 = objectInput.readUTF();
		secondaryAddress2 = objectInput.readUTF();
		secondaryAddressCity = objectInput.readUTF();
		secondaryAddressState = objectInput.readUTF();
		secondaryAddressZip = objectInput.readUTF();
		secondaryAddressCounty = objectInput.readUTF();
		secondaryAddressCountry = objectInput.readUTF();
		primaryPhone = objectInput.readUTF();
		primaryPhoneExtension = objectInput.readUTF();
		primaryFax = objectInput.readUTF();
		primaryCell = objectInput.readUTF();
		primaryEmailAddress = objectInput.readUTF();
		alternateContact = objectInput.readUTF();
		alternateEmail = objectInput.readUTF();

		isVip = objectInput.readBoolean();
		facebookId = objectInput.readUTF();
		twitterHandle = objectInput.readUTF();
		linkedInUrl = objectInput.readUTF();
		status = objectInput.readUTF();
		kioskUuid = objectInput.readUTF();

		imageFileEntryId = objectInput.readLong();
		tagsList = objectInput.readUTF();
		groupsList = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(crmContactId);

		objectOutput.writeLong(constantContactId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (prefix == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(prefix);
		}

		if (salutation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(salutation);
		}

		if (firstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (middleName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		if (lastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (organization == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organization);
		}

		if (jobTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jobTitle);
		}

		if (primaryAddress1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(primaryAddress1);
		}

		if (primaryAddress2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(primaryAddress2);
		}

		if (primaryAddressCity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(primaryAddressCity);
		}

		if (primaryAddressState == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(primaryAddressState);
		}

		if (primaryAddressZip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(primaryAddressZip);
		}

		if (primaryAddressCounty == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(primaryAddressCounty);
		}

		if (primaryAddressCountry == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(primaryAddressCountry);
		}

		if (secondaryAddress1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secondaryAddress1);
		}

		if (secondaryAddress2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secondaryAddress2);
		}

		if (secondaryAddressCity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secondaryAddressCity);
		}

		if (secondaryAddressState == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secondaryAddressState);
		}

		if (secondaryAddressZip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secondaryAddressZip);
		}

		if (secondaryAddressCounty == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secondaryAddressCounty);
		}

		if (secondaryAddressCountry == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secondaryAddressCountry);
		}

		if (primaryPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(primaryPhone);
		}

		if (primaryPhoneExtension == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(primaryPhoneExtension);
		}

		if (primaryFax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(primaryFax);
		}

		if (primaryCell == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(primaryCell);
		}

		if (primaryEmailAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(primaryEmailAddress);
		}

		if (alternateContact == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(alternateContact);
		}

		if (alternateEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(alternateEmail);
		}

		objectOutput.writeBoolean(isVip);

		if (facebookId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(facebookId);
		}

		if (twitterHandle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(twitterHandle);
		}

		if (linkedInUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(linkedInUrl);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (kioskUuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kioskUuid);
		}

		objectOutput.writeLong(imageFileEntryId);

		if (tagsList == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tagsList);
		}

		if (groupsList == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(groupsList);
		}
	}

	public String uuid;
	public long crmContactId;
	public long constantContactId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String prefix;
	public String salutation;
	public String firstName;
	public String middleName;
	public String lastName;
	public String organization;
	public String jobTitle;
	public String primaryAddress1;
	public String primaryAddress2;
	public String primaryAddressCity;
	public String primaryAddressState;
	public String primaryAddressZip;
	public String primaryAddressCounty;
	public String primaryAddressCountry;
	public String secondaryAddress1;
	public String secondaryAddress2;
	public String secondaryAddressCity;
	public String secondaryAddressState;
	public String secondaryAddressZip;
	public String secondaryAddressCounty;
	public String secondaryAddressCountry;
	public String primaryPhone;
	public String primaryPhoneExtension;
	public String primaryFax;
	public String primaryCell;
	public String primaryEmailAddress;
	public String alternateContact;
	public String alternateEmail;
	public boolean isVip;
	public String facebookId;
	public String twitterHandle;
	public String linkedInUrl;
	public String status;
	public String kioskUuid;
	public long imageFileEntryId;
	public String tagsList;
	public String groupsList;
}