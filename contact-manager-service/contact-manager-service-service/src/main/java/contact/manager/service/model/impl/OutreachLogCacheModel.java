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

import contact.manager.service.model.OutreachLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OutreachLog in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see OutreachLog
 * @generated
 */
@ProviderType
public class OutreachLogCacheModel implements CacheModel<OutreachLog>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OutreachLogCacheModel)) {
			return false;
		}

		OutreachLogCacheModel outreachLogCacheModel = (OutreachLogCacheModel)obj;

		if (id == outreachLogCacheModel.id) {
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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", contactId=");
		sb.append(contactId);
		sb.append(", note=");
		sb.append(note);
		sb.append(", medium=");
		sb.append(medium);
		sb.append(", activityType=");
		sb.append(activityType);
		sb.append(", outreachDate=");
		sb.append(outreachDate);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OutreachLog toEntityModel() {
		OutreachLogImpl outreachLogImpl = new OutreachLogImpl();

		outreachLogImpl.setId(id);
		outreachLogImpl.setUserId(userId);
		outreachLogImpl.setContactId(contactId);

		if (note == null) {
			outreachLogImpl.setNote(StringPool.BLANK);
		}
		else {
			outreachLogImpl.setNote(note);
		}

		if (medium == null) {
			outreachLogImpl.setMedium(StringPool.BLANK);
		}
		else {
			outreachLogImpl.setMedium(medium);
		}

		if (activityType == null) {
			outreachLogImpl.setActivityType(StringPool.BLANK);
		}
		else {
			outreachLogImpl.setActivityType(activityType);
		}

		if (outreachDate == Long.MIN_VALUE) {
			outreachLogImpl.setOutreachDate(null);
		}
		else {
			outreachLogImpl.setOutreachDate(new Date(outreachDate));
		}

		if (createDate == Long.MIN_VALUE) {
			outreachLogImpl.setCreateDate(null);
		}
		else {
			outreachLogImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			outreachLogImpl.setModifiedDate(null);
		}
		else {
			outreachLogImpl.setModifiedDate(new Date(modifiedDate));
		}

		outreachLogImpl.resetOriginalValues();

		return outreachLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		userId = objectInput.readLong();

		contactId = objectInput.readLong();
		note = objectInput.readUTF();
		medium = objectInput.readUTF();
		activityType = objectInput.readUTF();
		outreachDate = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(contactId);

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		if (medium == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(medium);
		}

		if (activityType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityType);
		}

		objectOutput.writeLong(outreachDate);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long id;
	public long userId;
	public long contactId;
	public String note;
	public String medium;
	public String activityType;
	public long outreachDate;
	public long createDate;
	public long modifiedDate;
}