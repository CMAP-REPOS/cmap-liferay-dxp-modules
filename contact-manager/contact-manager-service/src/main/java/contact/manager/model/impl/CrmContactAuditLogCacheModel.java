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

import contact.manager.model.CrmContactAuditLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrmContactAuditLog in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLog
 * @generated
 */
@ProviderType
public class CrmContactAuditLogCacheModel implements CacheModel<CrmContactAuditLog>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmContactAuditLogCacheModel)) {
			return false;
		}

		CrmContactAuditLogCacheModel crmContactAuditLogCacheModel = (CrmContactAuditLogCacheModel)obj;

		if (crmContactAuditLogId == crmContactAuditLogCacheModel.crmContactAuditLogId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crmContactAuditLogId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crmContactAuditLogId=");
		sb.append(crmContactAuditLogId);
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
		sb.append(", crmContactId=");
		sb.append(crmContactId);
		sb.append(", constantContactId=");
		sb.append(constantContactId);
		sb.append(", action=");
		sb.append(action);
		sb.append(", oldSnapshot=");
		sb.append(oldSnapshot);
		sb.append(", newSnapshot=");
		sb.append(newSnapshot);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CrmContactAuditLog toEntityModel() {
		CrmContactAuditLogImpl crmContactAuditLogImpl = new CrmContactAuditLogImpl();

		if (uuid == null) {
			crmContactAuditLogImpl.setUuid("");
		}
		else {
			crmContactAuditLogImpl.setUuid(uuid);
		}

		crmContactAuditLogImpl.setCrmContactAuditLogId(crmContactAuditLogId);
		crmContactAuditLogImpl.setGroupId(groupId);
		crmContactAuditLogImpl.setCompanyId(companyId);
		crmContactAuditLogImpl.setUserId(userId);

		if (userName == null) {
			crmContactAuditLogImpl.setUserName("");
		}
		else {
			crmContactAuditLogImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crmContactAuditLogImpl.setCreateDate(null);
		}
		else {
			crmContactAuditLogImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crmContactAuditLogImpl.setModifiedDate(null);
		}
		else {
			crmContactAuditLogImpl.setModifiedDate(new Date(modifiedDate));
		}

		crmContactAuditLogImpl.setCrmContactId(crmContactId);
		crmContactAuditLogImpl.setConstantContactId(constantContactId);

		if (action == null) {
			crmContactAuditLogImpl.setAction("");
		}
		else {
			crmContactAuditLogImpl.setAction(action);
		}

		if (oldSnapshot == null) {
			crmContactAuditLogImpl.setOldSnapshot("");
		}
		else {
			crmContactAuditLogImpl.setOldSnapshot(oldSnapshot);
		}

		if (newSnapshot == null) {
			crmContactAuditLogImpl.setNewSnapshot("");
		}
		else {
			crmContactAuditLogImpl.setNewSnapshot(newSnapshot);
		}

		crmContactAuditLogImpl.resetOriginalValues();

		return crmContactAuditLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crmContactAuditLogId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		crmContactId = objectInput.readLong();

		constantContactId = objectInput.readLong();
		action = objectInput.readUTF();
		oldSnapshot = objectInput.readUTF();
		newSnapshot = objectInput.readUTF();
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

		objectOutput.writeLong(crmContactAuditLogId);

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

		objectOutput.writeLong(crmContactId);

		objectOutput.writeLong(constantContactId);

		if (action == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(action);
		}

		if (oldSnapshot == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(oldSnapshot);
		}

		if (newSnapshot == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newSnapshot);
		}
	}

	public String uuid;
	public long crmContactAuditLogId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long crmContactId;
	public long constantContactId;
	public String action;
	public String oldSnapshot;
	public String newSnapshot;
}