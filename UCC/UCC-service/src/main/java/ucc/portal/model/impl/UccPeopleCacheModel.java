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

import ucc.portal.model.UccPeople;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UccPeople in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UccPeople
 * @generated
 */
@ProviderType
public class UccPeopleCacheModel implements CacheModel<UccPeople>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UccPeopleCacheModel)) {
			return false;
		}

		UccPeopleCacheModel uccPeopleCacheModel = (UccPeopleCacheModel)obj;

		if (uccPeopleId == uccPeopleCacheModel.uccPeopleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, uccPeopleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uccPeopleId=");
		sb.append(uccPeopleId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", suffix=");
		sb.append(suffix);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", myActive=");
		sb.append(myActive);
		sb.append(", oldUccPeopleId=");
		sb.append(oldUccPeopleId);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", cellPhone=");
		sb.append(cellPhone);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UccPeople toEntityModel() {
		UccPeopleImpl uccPeopleImpl = new UccPeopleImpl();

		uccPeopleImpl.setUccPeopleId(uccPeopleId);

		if (firstName == null) {
			uccPeopleImpl.setFirstName("");
		}
		else {
			uccPeopleImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			uccPeopleImpl.setMiddleName("");
		}
		else {
			uccPeopleImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			uccPeopleImpl.setLastName("");
		}
		else {
			uccPeopleImpl.setLastName(lastName);
		}

		if (suffix == null) {
			uccPeopleImpl.setSuffix("");
		}
		else {
			uccPeopleImpl.setSuffix(suffix);
		}

		if (birthday == null) {
			uccPeopleImpl.setBirthday("");
		}
		else {
			uccPeopleImpl.setBirthday(birthday);
		}

		uccPeopleImpl.setMyActive(myActive);
		uccPeopleImpl.setOldUccPeopleId(oldUccPeopleId);

		if (phone == null) {
			uccPeopleImpl.setPhone("");
		}
		else {
			uccPeopleImpl.setPhone(phone);
		}

		if (emailAddress == null) {
			uccPeopleImpl.setEmailAddress("");
		}
		else {
			uccPeopleImpl.setEmailAddress(emailAddress);
		}

		if (cellPhone == null) {
			uccPeopleImpl.setCellPhone("");
		}
		else {
			uccPeopleImpl.setCellPhone(cellPhone);
		}

		uccPeopleImpl.resetOriginalValues();

		return uccPeopleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uccPeopleId = objectInput.readInt();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		suffix = objectInput.readUTF();
		birthday = objectInput.readUTF();

		myActive = objectInput.readBoolean();

		oldUccPeopleId = objectInput.readInt();
		phone = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		cellPhone = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(uccPeopleId);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (middleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (suffix == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(suffix);
		}

		if (birthday == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(birthday);
		}

		objectOutput.writeBoolean(myActive);

		objectOutput.writeInt(oldUccPeopleId);

		if (phone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (cellPhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cellPhone);
		}
	}

	public int uccPeopleId;
	public String firstName;
	public String middleName;
	public String lastName;
	public String suffix;
	public String birthday;
	public boolean myActive;
	public int oldUccPeopleId;
	public String phone;
	public String emailAddress;
	public String cellPhone;
}