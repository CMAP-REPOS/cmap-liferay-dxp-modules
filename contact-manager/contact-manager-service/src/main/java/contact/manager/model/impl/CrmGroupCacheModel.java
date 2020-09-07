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

import contact.manager.model.CrmGroup;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrmGroup in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CrmGroupCacheModel
	implements CacheModel<CrmGroup>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmGroupCacheModel)) {
			return false;
		}

		CrmGroupCacheModel crmGroupCacheModel = (CrmGroupCacheModel)obj;

		if (crmGroupId == crmGroupCacheModel.crmGroupId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crmGroupId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crmGroupId=");
		sb.append(crmGroupId);
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
		sb.append(", crmContactsCount=");
		sb.append(crmContactsCount);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CrmGroup toEntityModel() {
		CrmGroupImpl crmGroupImpl = new CrmGroupImpl();

		if (uuid == null) {
			crmGroupImpl.setUuid("");
		}
		else {
			crmGroupImpl.setUuid(uuid);
		}

		crmGroupImpl.setCrmGroupId(crmGroupId);
		crmGroupImpl.setGroupId(groupId);
		crmGroupImpl.setCompanyId(companyId);
		crmGroupImpl.setUserId(userId);

		if (userName == null) {
			crmGroupImpl.setUserName("");
		}
		else {
			crmGroupImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crmGroupImpl.setCreateDate(null);
		}
		else {
			crmGroupImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crmGroupImpl.setModifiedDate(null);
		}
		else {
			crmGroupImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			crmGroupImpl.setName("");
		}
		else {
			crmGroupImpl.setName(name);
		}

		crmGroupImpl.setCrmContactsCount(crmContactsCount);

		if (status == null) {
			crmGroupImpl.setStatus("");
		}
		else {
			crmGroupImpl.setStatus(status);
		}

		crmGroupImpl.resetOriginalValues();

		return crmGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crmGroupId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();

		crmContactsCount = objectInput.readLong();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(crmGroupId);

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

		objectOutput.writeLong(crmContactsCount);

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public String uuid;
	public long crmGroupId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public long crmContactsCount;
	public String status;

}