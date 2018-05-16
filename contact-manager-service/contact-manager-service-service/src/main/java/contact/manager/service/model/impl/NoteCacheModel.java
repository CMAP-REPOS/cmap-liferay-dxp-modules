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

import contact.manager.service.model.Note;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Note in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Note
 * @generated
 */
@ProviderType
public class NoteCacheModel implements CacheModel<Note>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NoteCacheModel)) {
			return false;
		}

		NoteCacheModel noteCacheModel = (NoteCacheModel)obj;

		if (id == noteCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", contactId=");
		sb.append(contactId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", note=");
		sb.append(note);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Note toEntityModel() {
		NoteImpl noteImpl = new NoteImpl();

		noteImpl.setId(id);
		noteImpl.setContactId(contactId);
		noteImpl.setUserId(userId);

		if (note == null) {
			noteImpl.setNote(StringPool.BLANK);
		}
		else {
			noteImpl.setNote(note);
		}

		if (createDate == Long.MIN_VALUE) {
			noteImpl.setCreateDate(null);
		}
		else {
			noteImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			noteImpl.setModifiedDate(null);
		}
		else {
			noteImpl.setModifiedDate(new Date(modifiedDate));
		}

		noteImpl.resetOriginalValues();

		return noteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		contactId = objectInput.readLong();

		userId = objectInput.readLong();
		note = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(contactId);

		objectOutput.writeLong(userId);

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long id;
	public long contactId;
	public long userId;
	public String note;
	public long createDate;
	public long modifiedDate;
}