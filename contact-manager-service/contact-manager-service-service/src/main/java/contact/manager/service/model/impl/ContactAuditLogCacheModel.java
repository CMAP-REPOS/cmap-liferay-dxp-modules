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

import contact.manager.service.model.ContactAuditLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ContactAuditLog in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLog
 * @generated
 */
@ProviderType
public class ContactAuditLogCacheModel implements CacheModel<ContactAuditLog>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContactAuditLogCacheModel)) {
			return false;
		}

		ContactAuditLogCacheModel contactAuditLogCacheModel = (ContactAuditLogCacheModel)obj;

		if (contactAuditLogId == contactAuditLogCacheModel.contactAuditLogId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, contactAuditLogId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{contactAuditLogId=");
		sb.append(contactAuditLogId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", action=");
		sb.append(action);
		sb.append(", constantContactId=");
		sb.append(constantContactId);
		sb.append(", oldSnapshot=");
		sb.append(oldSnapshot);
		sb.append(", newSnapshot=");
		sb.append(newSnapshot);
		sb.append(", contactId=");
		sb.append(contactId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ContactAuditLog toEntityModel() {
		ContactAuditLogImpl contactAuditLogImpl = new ContactAuditLogImpl();

		contactAuditLogImpl.setContactAuditLogId(contactAuditLogId);
		contactAuditLogImpl.setGroupId(groupId);
		contactAuditLogImpl.setCompanyId(companyId);
		contactAuditLogImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			contactAuditLogImpl.setCreateDate(null);
		}
		else {
			contactAuditLogImpl.setCreateDate(new Date(createDate));
		}

		if (action == null) {
			contactAuditLogImpl.setAction(StringPool.BLANK);
		}
		else {
			contactAuditLogImpl.setAction(action);
		}

		contactAuditLogImpl.setConstantContactId(constantContactId);

		if (oldSnapshot == null) {
			contactAuditLogImpl.setOldSnapshot(StringPool.BLANK);
		}
		else {
			contactAuditLogImpl.setOldSnapshot(oldSnapshot);
		}

		if (newSnapshot == null) {
			contactAuditLogImpl.setNewSnapshot(StringPool.BLANK);
		}
		else {
			contactAuditLogImpl.setNewSnapshot(newSnapshot);
		}

		contactAuditLogImpl.setContactId(contactId);

		contactAuditLogImpl.resetOriginalValues();

		return contactAuditLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		contactAuditLogId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		action = objectInput.readUTF();

		constantContactId = objectInput.readLong();
		oldSnapshot = objectInput.readUTF();
		newSnapshot = objectInput.readUTF();

		contactId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(contactAuditLogId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);

		if (action == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(action);
		}

		objectOutput.writeLong(constantContactId);

		if (oldSnapshot == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oldSnapshot);
		}

		if (newSnapshot == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(newSnapshot);
		}

		objectOutput.writeLong(contactId);
	}

	public long contactAuditLogId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createDate;
	public String action;
	public long constantContactId;
	public String oldSnapshot;
	public String newSnapshot;
	public long contactId;
}