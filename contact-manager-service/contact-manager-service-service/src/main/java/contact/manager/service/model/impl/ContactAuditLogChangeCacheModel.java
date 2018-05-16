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

import contact.manager.service.model.ContactAuditLogChange;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ContactAuditLogChange in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLogChange
 * @generated
 */
@ProviderType
public class ContactAuditLogChangeCacheModel implements CacheModel<ContactAuditLogChange>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContactAuditLogChangeCacheModel)) {
			return false;
		}

		ContactAuditLogChangeCacheModel contactAuditLogChangeCacheModel = (ContactAuditLogChangeCacheModel)obj;

		if (contactAuditLogChangeId == contactAuditLogChangeCacheModel.contactAuditLogChangeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, contactAuditLogChangeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{contactAuditLogChangeId=");
		sb.append(contactAuditLogChangeId);
		sb.append(", contactAuditLogId=");
		sb.append(contactAuditLogId);
		sb.append(", fieldName=");
		sb.append(fieldName);
		sb.append(", oldValue=");
		sb.append(oldValue);
		sb.append(", newValue=");
		sb.append(newValue);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ContactAuditLogChange toEntityModel() {
		ContactAuditLogChangeImpl contactAuditLogChangeImpl = new ContactAuditLogChangeImpl();

		contactAuditLogChangeImpl.setContactAuditLogChangeId(contactAuditLogChangeId);
		contactAuditLogChangeImpl.setContactAuditLogId(contactAuditLogId);

		if (fieldName == null) {
			contactAuditLogChangeImpl.setFieldName(StringPool.BLANK);
		}
		else {
			contactAuditLogChangeImpl.setFieldName(fieldName);
		}

		if (oldValue == null) {
			contactAuditLogChangeImpl.setOldValue(StringPool.BLANK);
		}
		else {
			contactAuditLogChangeImpl.setOldValue(oldValue);
		}

		if (newValue == null) {
			contactAuditLogChangeImpl.setNewValue(StringPool.BLANK);
		}
		else {
			contactAuditLogChangeImpl.setNewValue(newValue);
		}

		contactAuditLogChangeImpl.resetOriginalValues();

		return contactAuditLogChangeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		contactAuditLogChangeId = objectInput.readLong();

		contactAuditLogId = objectInput.readLong();
		fieldName = objectInput.readUTF();
		oldValue = objectInput.readUTF();
		newValue = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(contactAuditLogChangeId);

		objectOutput.writeLong(contactAuditLogId);

		if (fieldName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldName);
		}

		if (oldValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oldValue);
		}

		if (newValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(newValue);
		}
	}

	public long contactAuditLogChangeId;
	public long contactAuditLogId;
	public String fieldName;
	public String oldValue;
	public String newValue;
}