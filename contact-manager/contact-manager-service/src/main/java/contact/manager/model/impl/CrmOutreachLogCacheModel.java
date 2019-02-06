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

import contact.manager.model.CrmOutreachLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrmOutreachLog in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CrmOutreachLog
 * @generated
 */
@ProviderType
public class CrmOutreachLogCacheModel implements CacheModel<CrmOutreachLog>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmOutreachLogCacheModel)) {
			return false;
		}

		CrmOutreachLogCacheModel crmOutreachLogCacheModel = (CrmOutreachLogCacheModel)obj;

		if (crmOutreachLogId == crmOutreachLogCacheModel.crmOutreachLogId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crmOutreachLogId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crmOutreachLogId=");
		sb.append(crmOutreachLogId);
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
		sb.append(", medium=");
		sb.append(medium);
		sb.append(", activityType=");
		sb.append(activityType);
		sb.append(", outreachDate=");
		sb.append(outreachDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CrmOutreachLog toEntityModel() {
		CrmOutreachLogImpl crmOutreachLogImpl = new CrmOutreachLogImpl();

		if (uuid == null) {
			crmOutreachLogImpl.setUuid("");
		}
		else {
			crmOutreachLogImpl.setUuid(uuid);
		}

		crmOutreachLogImpl.setCrmOutreachLogId(crmOutreachLogId);
		crmOutreachLogImpl.setGroupId(groupId);
		crmOutreachLogImpl.setCompanyId(companyId);
		crmOutreachLogImpl.setUserId(userId);

		if (userName == null) {
			crmOutreachLogImpl.setUserName("");
		}
		else {
			crmOutreachLogImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crmOutreachLogImpl.setCreateDate(null);
		}
		else {
			crmOutreachLogImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crmOutreachLogImpl.setModifiedDate(null);
		}
		else {
			crmOutreachLogImpl.setModifiedDate(new Date(modifiedDate));
		}

		crmOutreachLogImpl.setCrmContactId(crmContactId);

		if (note == null) {
			crmOutreachLogImpl.setNote("");
		}
		else {
			crmOutreachLogImpl.setNote(note);
		}

		if (medium == null) {
			crmOutreachLogImpl.setMedium("");
		}
		else {
			crmOutreachLogImpl.setMedium(medium);
		}

		if (activityType == null) {
			crmOutreachLogImpl.setActivityType("");
		}
		else {
			crmOutreachLogImpl.setActivityType(activityType);
		}

		if (outreachDate == Long.MIN_VALUE) {
			crmOutreachLogImpl.setOutreachDate(null);
		}
		else {
			crmOutreachLogImpl.setOutreachDate(new Date(outreachDate));
		}

		crmOutreachLogImpl.resetOriginalValues();

		return crmOutreachLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crmOutreachLogId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		crmContactId = objectInput.readLong();
		note = objectInput.readUTF();
		medium = objectInput.readUTF();
		activityType = objectInput.readUTF();
		outreachDate = objectInput.readLong();
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

		objectOutput.writeLong(crmOutreachLogId);

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

		if (medium == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medium);
		}

		if (activityType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(activityType);
		}

		objectOutput.writeLong(outreachDate);
	}

	public String uuid;
	public long crmOutreachLogId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long crmContactId;
	public String note;
	public String medium;
	public String activityType;
	public long outreachDate;
}