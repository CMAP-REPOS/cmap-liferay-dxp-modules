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

import contact.manager.model.CrmNote;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrmNote in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CrmNote
 * @generated
 */
@ProviderType
public class CrmNoteCacheModel implements CacheModel<CrmNote>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmNoteCacheModel)) {
			return false;
		}

		CrmNoteCacheModel crmNoteCacheModel = (CrmNoteCacheModel)obj;

		if (crmNoteId == crmNoteCacheModel.crmNoteId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crmNoteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crmNoteId=");
		sb.append(crmNoteId);
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
		sb.append(", note=");
		sb.append(note);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CrmNote toEntityModel() {
		CrmNoteImpl crmNoteImpl = new CrmNoteImpl();

		if (uuid == null) {
			crmNoteImpl.setUuid("");
		}
		else {
			crmNoteImpl.setUuid(uuid);
		}

		crmNoteImpl.setCrmNoteId(crmNoteId);
		crmNoteImpl.setGroupId(groupId);
		crmNoteImpl.setCompanyId(companyId);
		crmNoteImpl.setUserId(userId);

		if (userName == null) {
			crmNoteImpl.setUserName("");
		}
		else {
			crmNoteImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crmNoteImpl.setCreateDate(null);
		}
		else {
			crmNoteImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crmNoteImpl.setModifiedDate(null);
		}
		else {
			crmNoteImpl.setModifiedDate(new Date(modifiedDate));
		}

		crmNoteImpl.setCrmContactId(crmContactId);

		if (note == null) {
			crmNoteImpl.setNote("");
		}
		else {
			crmNoteImpl.setNote(note);
		}

		crmNoteImpl.resetOriginalValues();

		return crmNoteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crmNoteId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		crmContactId = objectInput.readLong();
		note = objectInput.readUTF();
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

		objectOutput.writeLong(crmNoteId);

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

		if (note == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(note);
		}
	}

	public String uuid;
	public long crmNoteId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long crmContactId;
	public String note;
}