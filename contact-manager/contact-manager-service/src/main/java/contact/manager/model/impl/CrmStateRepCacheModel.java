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

import contact.manager.model.CrmStateRep;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrmStateRep in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateRep
 * @generated
 */
@ProviderType
public class CrmStateRepCacheModel implements CacheModel<CrmStateRep>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmStateRepCacheModel)) {
			return false;
		}

		CrmStateRepCacheModel crmStateRepCacheModel = (CrmStateRepCacheModel)obj;

		if (crmStateRepId == crmStateRepCacheModel.crmStateRepId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crmStateRepId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crmStateRepId=");
		sb.append(crmStateRepId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", number=");
		sb.append(number);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CrmStateRep toEntityModel() {
		CrmStateRepImpl crmStateRepImpl = new CrmStateRepImpl();

		if (uuid == null) {
			crmStateRepImpl.setUuid(StringPool.BLANK);
		}
		else {
			crmStateRepImpl.setUuid(uuid);
		}

		crmStateRepImpl.setCrmStateRepId(crmStateRepId);
		crmStateRepImpl.setGroupId(groupId);
		crmStateRepImpl.setCompanyId(companyId);
		crmStateRepImpl.setUserId(userId);

		if (userName == null) {
			crmStateRepImpl.setUserName(StringPool.BLANK);
		}
		else {
			crmStateRepImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crmStateRepImpl.setCreateDate(null);
		}
		else {
			crmStateRepImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crmStateRepImpl.setModifiedDate(null);
		}
		else {
			crmStateRepImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			crmStateRepImpl.setName(StringPool.BLANK);
		}
		else {
			crmStateRepImpl.setName(name);
		}

		if (number == null) {
			crmStateRepImpl.setNumber(StringPool.BLANK);
		}
		else {
			crmStateRepImpl.setNumber(number);
		}

		if (zipCode == null) {
			crmStateRepImpl.setZipCode(StringPool.BLANK);
		}
		else {
			crmStateRepImpl.setZipCode(zipCode);
		}

		crmStateRepImpl.resetOriginalValues();

		return crmStateRepImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crmStateRepId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		number = objectInput.readUTF();
		zipCode = objectInput.readUTF();
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

		objectOutput.writeLong(crmStateRepId);

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

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (number == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(number);
		}

		if (zipCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public String uuid;
	public long crmStateRepId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String number;
	public String zipCode;
}