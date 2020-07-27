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

import contact.manager.model.CrmStateSenate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrmStateSenate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CrmStateSenateCacheModel
	implements CacheModel<CrmStateSenate>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmStateSenateCacheModel)) {
			return false;
		}

		CrmStateSenateCacheModel crmStateSenateCacheModel =
			(CrmStateSenateCacheModel)obj;

		if (crmStateSenateId == crmStateSenateCacheModel.crmStateSenateId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crmStateSenateId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crmStateSenateId=");
		sb.append(crmStateSenateId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", number=");
		sb.append(number);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CrmStateSenate toEntityModel() {
		CrmStateSenateImpl crmStateSenateImpl = new CrmStateSenateImpl();

		if (uuid == null) {
			crmStateSenateImpl.setUuid("");
		}
		else {
			crmStateSenateImpl.setUuid(uuid);
		}

		crmStateSenateImpl.setCrmStateSenateId(crmStateSenateId);
		crmStateSenateImpl.setGroupId(groupId);
		crmStateSenateImpl.setCompanyId(companyId);
		crmStateSenateImpl.setUserId(userId);

		if (userName == null) {
			crmStateSenateImpl.setUserName("");
		}
		else {
			crmStateSenateImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crmStateSenateImpl.setCreateDate(null);
		}
		else {
			crmStateSenateImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crmStateSenateImpl.setModifiedDate(null);
		}
		else {
			crmStateSenateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			crmStateSenateImpl.setName("");
		}
		else {
			crmStateSenateImpl.setName(name);
		}

		if (number == null) {
			crmStateSenateImpl.setNumber("");
		}
		else {
			crmStateSenateImpl.setNumber(number);
		}

		if (zipCode == null) {
			crmStateSenateImpl.setZipCode("");
		}
		else {
			crmStateSenateImpl.setZipCode(zipCode);
		}

		crmStateSenateImpl.resetOriginalValues();

		return crmStateSenateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crmStateSenateId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		number = objectInput.readUTF();
		zipCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(crmStateSenateId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (number == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(number);
		}

		if (zipCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public String uuid;
	public long crmStateSenateId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String number;
	public String zipCode;

}