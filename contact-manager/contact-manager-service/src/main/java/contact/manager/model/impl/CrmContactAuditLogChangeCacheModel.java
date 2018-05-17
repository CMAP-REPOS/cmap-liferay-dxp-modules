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
import com.liferay.portal.kernel.util.StringPool;

import contact.manager.model.CrmContactAuditLogChange;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrmContactAuditLogChange in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogChange
 * @generated
 */
@ProviderType
public class CrmContactAuditLogChangeCacheModel implements CacheModel<CrmContactAuditLogChange>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmContactAuditLogChangeCacheModel)) {
			return false;
		}

		CrmContactAuditLogChangeCacheModel crmContactAuditLogChangeCacheModel = (CrmContactAuditLogChangeCacheModel)obj;

		if (crmContactAuditLogChangeId == crmContactAuditLogChangeCacheModel.crmContactAuditLogChangeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crmContactAuditLogChangeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crmContactAuditLogChangeId=");
		sb.append(crmContactAuditLogChangeId);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CrmContactAuditLogChange toEntityModel() {
		CrmContactAuditLogChangeImpl crmContactAuditLogChangeImpl = new CrmContactAuditLogChangeImpl();

		if (uuid == null) {
			crmContactAuditLogChangeImpl.setUuid(StringPool.BLANK);
		}
		else {
			crmContactAuditLogChangeImpl.setUuid(uuid);
		}

		crmContactAuditLogChangeImpl.setCrmContactAuditLogChangeId(crmContactAuditLogChangeId);
		crmContactAuditLogChangeImpl.setGroupId(groupId);
		crmContactAuditLogChangeImpl.setCompanyId(companyId);
		crmContactAuditLogChangeImpl.setUserId(userId);

		if (userName == null) {
			crmContactAuditLogChangeImpl.setUserName(StringPool.BLANK);
		}
		else {
			crmContactAuditLogChangeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crmContactAuditLogChangeImpl.setCreateDate(null);
		}
		else {
			crmContactAuditLogChangeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crmContactAuditLogChangeImpl.setModifiedDate(null);
		}
		else {
			crmContactAuditLogChangeImpl.setModifiedDate(new Date(modifiedDate));
		}

		crmContactAuditLogChangeImpl.resetOriginalValues();

		return crmContactAuditLogChangeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crmContactAuditLogChangeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(crmContactAuditLogChangeId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long crmContactAuditLogChangeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
}