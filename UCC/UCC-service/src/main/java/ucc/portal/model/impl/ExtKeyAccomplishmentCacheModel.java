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

package ucc.portal.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import ucc.portal.model.ExtKeyAccomplishment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExtKeyAccomplishment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ExtKeyAccomplishment
 * @generated
 */
@ProviderType
public class ExtKeyAccomplishmentCacheModel implements CacheModel<ExtKeyAccomplishment>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtKeyAccomplishmentCacheModel)) {
			return false;
		}

		ExtKeyAccomplishmentCacheModel extKeyAccomplishmentCacheModel = (ExtKeyAccomplishmentCacheModel)obj;

		if (extKeyAccomplishmentId == extKeyAccomplishmentCacheModel.extKeyAccomplishmentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, extKeyAccomplishmentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{extKeyAccomplishmentId=");
		sb.append(extKeyAccomplishmentId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", locationOrSetting=");
		sb.append(locationOrSetting);
		sb.append(", description=");
		sb.append(description);
		sb.append(", priority=");
		sb.append(priority);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExtKeyAccomplishment toEntityModel() {
		ExtKeyAccomplishmentImpl extKeyAccomplishmentImpl = new ExtKeyAccomplishmentImpl();

		extKeyAccomplishmentImpl.setExtKeyAccomplishmentId(extKeyAccomplishmentId);
		extKeyAccomplishmentImpl.setCompanyId(companyId);
		extKeyAccomplishmentImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			extKeyAccomplishmentImpl.setCreateDate(null);
		}
		else {
			extKeyAccomplishmentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			extKeyAccomplishmentImpl.setModifiedDate(null);
		}
		else {
			extKeyAccomplishmentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (locationOrSetting == null) {
			extKeyAccomplishmentImpl.setLocationOrSetting("");
		}
		else {
			extKeyAccomplishmentImpl.setLocationOrSetting(locationOrSetting);
		}

		if (description == null) {
			extKeyAccomplishmentImpl.setDescription("");
		}
		else {
			extKeyAccomplishmentImpl.setDescription(description);
		}

		extKeyAccomplishmentImpl.setPriority(priority);

		extKeyAccomplishmentImpl.resetOriginalValues();

		return extKeyAccomplishmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		extKeyAccomplishmentId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		locationOrSetting = objectInput.readUTF();
		description = objectInput.readUTF();

		priority = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(extKeyAccomplishmentId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (locationOrSetting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locationOrSetting);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeDouble(priority);
	}

	public long extKeyAccomplishmentId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String locationOrSetting;
	public String description;
	public double priority;
}