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

import contact.manager.model.CrmCountyCommissioner;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrmCountyCommissioner in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CrmCountyCommissionerCacheModel
	implements CacheModel<CrmCountyCommissioner>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmCountyCommissionerCacheModel)) {
			return false;
		}

		CrmCountyCommissionerCacheModel crmCountyCommissionerCacheModel =
			(CrmCountyCommissionerCacheModel)obj;

		if (crmCountyCommissionerOrBoardDistId ==
				crmCountyCommissionerCacheModel.
					crmCountyCommissionerOrBoardDistId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crmCountyCommissionerOrBoardDistId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", crmCountyCommissionerOrBoardDistId=");
		sb.append(crmCountyCommissionerOrBoardDistId);
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
	public CrmCountyCommissioner toEntityModel() {
		CrmCountyCommissionerImpl crmCountyCommissionerImpl =
			new CrmCountyCommissionerImpl();

		if (uuid == null) {
			crmCountyCommissionerImpl.setUuid("");
		}
		else {
			crmCountyCommissionerImpl.setUuid(uuid);
		}

		crmCountyCommissionerImpl.setCrmCountyCommissionerOrBoardDistId(
			crmCountyCommissionerOrBoardDistId);
		crmCountyCommissionerImpl.setGroupId(groupId);
		crmCountyCommissionerImpl.setCompanyId(companyId);
		crmCountyCommissionerImpl.setUserId(userId);

		if (userName == null) {
			crmCountyCommissionerImpl.setUserName("");
		}
		else {
			crmCountyCommissionerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crmCountyCommissionerImpl.setCreateDate(null);
		}
		else {
			crmCountyCommissionerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crmCountyCommissionerImpl.setModifiedDate(null);
		}
		else {
			crmCountyCommissionerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			crmCountyCommissionerImpl.setName("");
		}
		else {
			crmCountyCommissionerImpl.setName(name);
		}

		if (number == null) {
			crmCountyCommissionerImpl.setNumber("");
		}
		else {
			crmCountyCommissionerImpl.setNumber(number);
		}

		if (zipCode == null) {
			crmCountyCommissionerImpl.setZipCode("");
		}
		else {
			crmCountyCommissionerImpl.setZipCode(zipCode);
		}

		crmCountyCommissionerImpl.resetOriginalValues();

		return crmCountyCommissionerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		crmCountyCommissionerOrBoardDistId = objectInput.readLong();

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
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(crmCountyCommissionerOrBoardDistId);

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

		if (number == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(number);
		}

		if (zipCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public String uuid;
	public long crmCountyCommissionerOrBoardDistId;
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