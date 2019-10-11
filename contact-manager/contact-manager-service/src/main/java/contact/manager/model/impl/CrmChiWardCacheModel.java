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

import contact.manager.model.CrmChiWard;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrmChiWard in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CrmChiWard
 * @generated
 */
@ProviderType
public class CrmChiWardCacheModel implements CacheModel<CrmChiWard>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmChiWardCacheModel)) {
			return false;
		}

		CrmChiWardCacheModel crmChiWardCacheModel = (CrmChiWardCacheModel)obj;

		if (crmChiWardId == crmChiWardCacheModel.crmChiWardId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crmChiWardId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crmChiWardId=");
		sb.append(crmChiWardId);
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
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CrmChiWard toEntityModel() {
		CrmChiWardImpl crmChiWardImpl = new CrmChiWardImpl();

		if (uuid == null) {
			crmChiWardImpl.setUuid("");
		}
		else {
			crmChiWardImpl.setUuid(uuid);
		}

		crmChiWardImpl.setCrmChiWardId(crmChiWardId);
		crmChiWardImpl.setGroupId(groupId);
		crmChiWardImpl.setCompanyId(companyId);
		crmChiWardImpl.setUserId(userId);

		if (userName == null) {
			crmChiWardImpl.setUserName("");
		}
		else {
			crmChiWardImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crmChiWardImpl.setCreateDate(null);
		}
		else {
			crmChiWardImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crmChiWardImpl.setModifiedDate(null);
		}
		else {
			crmChiWardImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			crmChiWardImpl.setName("");
		}
		else {
			crmChiWardImpl.setName(name);
		}

		if (zipCode == null) {
			crmChiWardImpl.setZipCode("");
		}
		else {
			crmChiWardImpl.setZipCode(zipCode);
		}

		crmChiWardImpl.resetOriginalValues();

		return crmChiWardImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crmChiWardId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
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

		objectOutput.writeLong(crmChiWardId);

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

		if (zipCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public String uuid;
	public long crmChiWardId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String zipCode;
}