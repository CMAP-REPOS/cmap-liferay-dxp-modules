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

import contact.manager.model.CrmUsRep;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrmUsRep in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CrmUsRep
 * @generated
 */
@ProviderType
public class CrmUsRepCacheModel implements CacheModel<CrmUsRep>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmUsRepCacheModel)) {
			return false;
		}

		CrmUsRepCacheModel crmUsRepCacheModel = (CrmUsRepCacheModel)obj;

		if (crmUsRepId == crmUsRepCacheModel.crmUsRepId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crmUsRepId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crmUsRepId=");
		sb.append(crmUsRepId);
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
	public CrmUsRep toEntityModel() {
		CrmUsRepImpl crmUsRepImpl = new CrmUsRepImpl();

		if (uuid == null) {
			crmUsRepImpl.setUuid("");
		}
		else {
			crmUsRepImpl.setUuid(uuid);
		}

		crmUsRepImpl.setCrmUsRepId(crmUsRepId);
		crmUsRepImpl.setGroupId(groupId);
		crmUsRepImpl.setCompanyId(companyId);
		crmUsRepImpl.setUserId(userId);

		if (userName == null) {
			crmUsRepImpl.setUserName("");
		}
		else {
			crmUsRepImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crmUsRepImpl.setCreateDate(null);
		}
		else {
			crmUsRepImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crmUsRepImpl.setModifiedDate(null);
		}
		else {
			crmUsRepImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			crmUsRepImpl.setName("");
		}
		else {
			crmUsRepImpl.setName(name);
		}

		if (number == null) {
			crmUsRepImpl.setNumber("");
		}
		else {
			crmUsRepImpl.setNumber(number);
		}

		if (zipCode == null) {
			crmUsRepImpl.setZipCode("");
		}
		else {
			crmUsRepImpl.setZipCode(zipCode);
		}

		crmUsRepImpl.resetOriginalValues();

		return crmUsRepImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crmUsRepId = objectInput.readLong();

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
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(crmUsRepId);

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
	public long crmUsRepId;
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