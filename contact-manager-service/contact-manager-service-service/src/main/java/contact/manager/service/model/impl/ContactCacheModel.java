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

package contact.manager.service.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import contact.manager.service.model.Contact;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Contact in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Contact
 * @generated
 */
@ProviderType
public class ContactCacheModel implements CacheModel<Contact>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContactCacheModel)) {
			return false;
		}

		ContactCacheModel contactCacheModel = (ContactCacheModel)obj;

		if (contactId == contactCacheModel.contactId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, contactId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(87);

		sb.append("{contactId=");
		sb.append(contactId);
		sb.append(", constantContactId=");
		sb.append(constantContactId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
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
		sb.append(", subGroupsList=");
		sb.append(subGroupsList);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Contact toEntityModel() {
		ContactImpl contactImpl = new ContactImpl();

		contactImpl.setContactId(contactId);
		contactImpl.setConstantContactId(constantContactId);
		contactImpl.setGroupId(groupId);
		contactImpl.setCompanyId(companyId);
		contactImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			contactImpl.setCreateDate(null);
		}
		else {
			contactImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			contactImpl.setModifiedDate(null);
		}
		else {
			contactImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (prefix == null) {
			contactImpl.setPrefix(StringPool.BLANK);
		}
		else {
			contactImpl.setPrefix(prefix);
		}

		if (salutation == null) {
			contactImpl.setSalutation(StringPool.BLANK);
		}
		else {
			contactImpl.setSalutation(salutation);
		}

		if (firstName == null) {
			contactImpl.setFirstName(StringPool.BLANK);
		}
		else {
			contactImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			contactImpl.setMiddleName(StringPool.BLANK);
		}
		else {
			contactImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			contactImpl.setLastName(StringPool.BLANK);
		}
		else {
			contactImpl.setLastName(lastName);
		}

		if (organization == null) {
			contactImpl.setOrganization(StringPool.BLANK);
		}
		else {
			contactImpl.setOrganization(organization);
		}

		if (jobTitle == null) {
			contactImpl.setJobTitle(StringPool.BLANK);
		}
		else {
			contactImpl.setJobTitle(jobTitle);
		}

		if (primaryAddress1 == null) {
			contactImpl.setPrimaryAddress1(StringPool.BLANK);
		}
		else {
			contactImpl.setPrimaryAddress1(primaryAddress1);
		}

		if (primaryAddress2 == null) {
			contactImpl.setPrimaryAddress2(StringPool.BLANK);
		}
		else {
			contactImpl.setPrimaryAddress2(primaryAddress2);
		}

		if (primaryAddressCity == null) {
			contactImpl.setPrimaryAddressCity(StringPool.BLANK);
		}
		else {
			contactImpl.setPrimaryAddressCity(primaryAddressCity);
		}

		if (primaryAddressState == null) {
			contactImpl.setPrimaryAddressState(StringPool.BLANK);
		}
		else {
			contactImpl.setPrimaryAddressState(primaryAddressState);
		}

		if (primaryAddressZip == null) {
			contactImpl.setPrimaryAddressZip(StringPool.BLANK);
		}
		else {
			contactImpl.setPrimaryAddressZip(primaryAddressZip);
		}

		if (primaryAddressCounty == null) {
			contactImpl.setPrimaryAddressCounty(StringPool.BLANK);
		}
		else {
			contactImpl.setPrimaryAddressCounty(primaryAddressCounty);
		}

		if (primaryAddressCountry == null) {
			contactImpl.setPrimaryAddressCountry(StringPool.BLANK);
		}
		else {
			contactImpl.setPrimaryAddressCountry(primaryAddressCountry);
		}

		if (secondaryAddress1 == null) {
			contactImpl.setSecondaryAddress1(StringPool.BLANK);
		}
		else {
			contactImpl.setSecondaryAddress1(secondaryAddress1);
		}

		if (secondaryAddress2 == null) {
			contactImpl.setSecondaryAddress2(StringPool.BLANK);
		}
		else {
			contactImpl.setSecondaryAddress2(secondaryAddress2);
		}

		if (secondaryAddressCity == null) {
			contactImpl.setSecondaryAddressCity(StringPool.BLANK);
		}
		else {
			contactImpl.setSecondaryAddressCity(secondaryAddressCity);
		}

		if (secondaryAddressState == null) {
			contactImpl.setSecondaryAddressState(StringPool.BLANK);
		}
		else {
			contactImpl.setSecondaryAddressState(secondaryAddressState);
		}

		if (secondaryAddressZip == null) {
			contactImpl.setSecondaryAddressZip(StringPool.BLANK);
		}
		else {
			contactImpl.setSecondaryAddressZip(secondaryAddressZip);
		}

		if (secondaryAddressCounty == null) {
			contactImpl.setSecondaryAddressCounty(StringPool.BLANK);
		}
		else {
			contactImpl.setSecondaryAddressCounty(secondaryAddressCounty);
		}

		if (secondaryAddressCountry == null) {
			contactImpl.setSecondaryAddressCountry(StringPool.BLANK);
		}
		else {
			contactImpl.setSecondaryAddressCountry(secondaryAddressCountry);
		}

		if (primaryPhone == null) {
			contactImpl.setPrimaryPhone(StringPool.BLANK);
		}
		else {
			contactImpl.setPrimaryPhone(primaryPhone);
		}

		if (primaryFax == null) {
			contactImpl.setPrimaryFax(StringPool.BLANK);
		}
		else {
			contactImpl.setPrimaryFax(primaryFax);
		}

		if (primaryCell == null) {
			contactImpl.setPrimaryCell(StringPool.BLANK);
		}
		else {
			contactImpl.setPrimaryCell(primaryCell);
		}

		if (primaryEmailAddress == null) {
			contactImpl.setPrimaryEmailAddress(StringPool.BLANK);
		}
		else {
			contactImpl.setPrimaryEmailAddress(primaryEmailAddress);
		}

		if (alternateContact == null) {
			contactImpl.setAlternateContact(StringPool.BLANK);
		}
		else {
			contactImpl.setAlternateContact(alternateContact);
		}

		if (alternateEmail == null) {
			contactImpl.setAlternateEmail(StringPool.BLANK);
		}
		else {
			contactImpl.setAlternateEmail(alternateEmail);
		}

		contactImpl.setIsVip(isVip);

		if (facebookId == null) {
			contactImpl.setFacebookId(StringPool.BLANK);
		}
		else {
			contactImpl.setFacebookId(facebookId);
		}

		if (twitterHandle == null) {
			contactImpl.setTwitterHandle(StringPool.BLANK);
		}
		else {
			contactImpl.setTwitterHandle(twitterHandle);
		}

		if (linkedInUrl == null) {
			contactImpl.setLinkedInUrl(StringPool.BLANK);
		}
		else {
			contactImpl.setLinkedInUrl(linkedInUrl);
		}

		if (status == null) {
			contactImpl.setStatus(StringPool.BLANK);
		}
		else {
			contactImpl.setStatus(status);
		}

		if (kioskUuid == null) {
			contactImpl.setKioskUuid(StringPool.BLANK);
		}
		else {
			contactImpl.setKioskUuid(kioskUuid);
		}

		contactImpl.setImageFileEntryId(imageFileEntryId);

		if (tagsList == null) {
			contactImpl.setTagsList(StringPool.BLANK);
		}
		else {
			contactImpl.setTagsList(tagsList);
		}

		if (subGroupsList == null) {
			contactImpl.setSubGroupsList(StringPool.BLANK);
		}
		else {
			contactImpl.setSubGroupsList(subGroupsList);
		}

		contactImpl.resetOriginalValues();

		return contactImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		contactId = objectInput.readLong();

		constantContactId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
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
		subGroupsList = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(contactId);

		objectOutput.writeLong(constantContactId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
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

		if (subGroupsList == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subGroupsList);
		}
	}

	public long contactId;
	public long constantContactId;
	public long groupId;
	public long companyId;
	public long userId;
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
	public String subGroupsList;
}