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

import contact.manager.service.model.CmapSubGroup;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CmapSubGroup in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CmapSubGroup
 * @generated
 */
@ProviderType
public class CmapSubGroupCacheModel implements CacheModel<CmapSubGroup>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CmapSubGroupCacheModel)) {
			return false;
		}

		CmapSubGroupCacheModel cmapSubGroupCacheModel = (CmapSubGroupCacheModel)obj;

		if (subGroupId == cmapSubGroupCacheModel.subGroupId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, subGroupId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{subGroupId=");
		sb.append(subGroupId);
		sb.append(", subGroupName=");
		sb.append(subGroupName);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CmapSubGroup toEntityModel() {
		CmapSubGroupImpl cmapSubGroupImpl = new CmapSubGroupImpl();

		cmapSubGroupImpl.setSubGroupId(subGroupId);

		if (subGroupName == null) {
			cmapSubGroupImpl.setSubGroupName(StringPool.BLANK);
		}
		else {
			cmapSubGroupImpl.setSubGroupName(subGroupName);
		}

		cmapSubGroupImpl.setGroupId(groupId);

		if (createDate == Long.MIN_VALUE) {
			cmapSubGroupImpl.setCreateDate(null);
		}
		else {
			cmapSubGroupImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cmapSubGroupImpl.setModifiedDate(null);
		}
		else {
			cmapSubGroupImpl.setModifiedDate(new Date(modifiedDate));
		}

		cmapSubGroupImpl.resetOriginalValues();

		return cmapSubGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		subGroupId = objectInput.readLong();
		subGroupName = objectInput.readUTF();

		groupId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(subGroupId);

		if (subGroupName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subGroupName);
		}

		objectOutput.writeLong(groupId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long subGroupId;
	public String subGroupName;
	public long groupId;
	public long createDate;
	public long modifiedDate;
}