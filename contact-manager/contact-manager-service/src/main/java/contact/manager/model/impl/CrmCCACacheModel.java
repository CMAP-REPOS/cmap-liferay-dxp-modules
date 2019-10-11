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

import contact.manager.model.CrmCCA;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrmCCA in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CrmCCA
 * @generated
 */
@ProviderType
public class CrmCCACacheModel implements CacheModel<CrmCCA>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmCCACacheModel)) {
			return false;
		}

		CrmCCACacheModel crmCCACacheModel = (CrmCCACacheModel)obj;

		if (crmCCAId == crmCCACacheModel.crmCCAId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crmCCAId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crmCCAId=");
		sb.append(crmCCAId);
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
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CrmCCA toEntityModel() {
		CrmCCAImpl crmCCAImpl = new CrmCCAImpl();

		if (uuid == null) {
			crmCCAImpl.setUuid("");
		}
		else {
			crmCCAImpl.setUuid(uuid);
		}

		crmCCAImpl.setCrmCCAId(crmCCAId);
		crmCCAImpl.setGroupId(groupId);
		crmCCAImpl.setCompanyId(companyId);
		crmCCAImpl.setUserId(userId);

		if (userName == null) {
			crmCCAImpl.setUserName("");
		}
		else {
			crmCCAImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crmCCAImpl.setCreateDate(null);
		}
		else {
			crmCCAImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crmCCAImpl.setModifiedDate(null);
		}
		else {
			crmCCAImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			crmCCAImpl.setName("");
		}
		else {
			crmCCAImpl.setName(name);
		}

		if (zipCode == null) {
			crmCCAImpl.setZipCode("");
		}
		else {
			crmCCAImpl.setZipCode(zipCode);
		}

		crmCCAImpl.resetOriginalValues();

		return crmCCAImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crmCCAId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		zipCode = objectInput.readUTF();
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

		objectOutput.writeLong(crmCCAId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (zipCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public String uuid;
	public long crmCCAId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String zipCode;
}