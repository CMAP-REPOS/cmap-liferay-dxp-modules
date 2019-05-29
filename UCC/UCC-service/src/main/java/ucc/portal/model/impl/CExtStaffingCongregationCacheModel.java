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

import ucc.portal.model.CExtStaffingCongregation;

import ucc.portal.service.persistence.CExtStaffingCongregationPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CExtStaffingCongregation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CExtStaffingCongregation
 * @generated
 */
@ProviderType
public class CExtStaffingCongregationCacheModel implements CacheModel<CExtStaffingCongregation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtStaffingCongregationCacheModel)) {
			return false;
		}

		CExtStaffingCongregationCacheModel cExtStaffingCongregationCacheModel = (CExtStaffingCongregationCacheModel)obj;

		if (cExtStaffingCongregationPK.equals(
					cExtStaffingCongregationCacheModel.cExtStaffingCongregationPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cExtStaffingCongregationPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{organizationId=");
		sb.append(organizationId);
		sb.append(", cextStaffingCongregationId=");
		sb.append(cextStaffingCongregationId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", sfMinisterName=");
		sb.append(sfMinisterName);
		sb.append(", sfMinisterRetired=");
		sb.append(sfMinisterRetired);
		sb.append(", sfMinisterCovenant=");
		sb.append(sfMinisterCovenant);
		sb.append(", sfMinistrySetting=");
		sb.append(sfMinistrySetting);
		sb.append(", sfMinistryRole=");
		sb.append(sfMinistryRole);
		sb.append(", sfPriority=");
		sb.append(sfPriority);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CExtStaffingCongregation toEntityModel() {
		CExtStaffingCongregationImpl cExtStaffingCongregationImpl = new CExtStaffingCongregationImpl();

		cExtStaffingCongregationImpl.setOrganizationId(organizationId);
		cExtStaffingCongregationImpl.setCextStaffingCongregationId(cextStaffingCongregationId);
		cExtStaffingCongregationImpl.setCompanyId(companyId);
		cExtStaffingCongregationImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			cExtStaffingCongregationImpl.setCreateDate(null);
		}
		else {
			cExtStaffingCongregationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cExtStaffingCongregationImpl.setModifiedDate(null);
		}
		else {
			cExtStaffingCongregationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (sfMinisterName == null) {
			cExtStaffingCongregationImpl.setSfMinisterName("");
		}
		else {
			cExtStaffingCongregationImpl.setSfMinisterName(sfMinisterName);
		}

		cExtStaffingCongregationImpl.setSfMinisterRetired(sfMinisterRetired);

		if (sfMinisterCovenant == null) {
			cExtStaffingCongregationImpl.setSfMinisterCovenant("");
		}
		else {
			cExtStaffingCongregationImpl.setSfMinisterCovenant(sfMinisterCovenant);
		}

		if (sfMinistrySetting == null) {
			cExtStaffingCongregationImpl.setSfMinistrySetting("");
		}
		else {
			cExtStaffingCongregationImpl.setSfMinistrySetting(sfMinistrySetting);
		}

		if (sfMinistryRole == null) {
			cExtStaffingCongregationImpl.setSfMinistryRole("");
		}
		else {
			cExtStaffingCongregationImpl.setSfMinistryRole(sfMinistryRole);
		}

		cExtStaffingCongregationImpl.setSfPriority(sfPriority);

		cExtStaffingCongregationImpl.resetOriginalValues();

		return cExtStaffingCongregationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		organizationId = objectInput.readLong();

		cextStaffingCongregationId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		sfMinisterName = objectInput.readUTF();

		sfMinisterRetired = objectInput.readBoolean();
		sfMinisterCovenant = objectInput.readUTF();
		sfMinistrySetting = objectInput.readUTF();
		sfMinistryRole = objectInput.readUTF();

		sfPriority = objectInput.readDouble();

		cExtStaffingCongregationPK = new CExtStaffingCongregationPK(organizationId,
				cextStaffingCongregationId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(organizationId);

		objectOutput.writeLong(cextStaffingCongregationId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (sfMinisterName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sfMinisterName);
		}

		objectOutput.writeBoolean(sfMinisterRetired);

		if (sfMinisterCovenant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sfMinisterCovenant);
		}

		if (sfMinistrySetting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sfMinistrySetting);
		}

		if (sfMinistryRole == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sfMinistryRole);
		}

		objectOutput.writeDouble(sfPriority);
	}

	public long organizationId;
	public long cextStaffingCongregationId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String sfMinisterName;
	public boolean sfMinisterRetired;
	public String sfMinisterCovenant;
	public String sfMinistrySetting;
	public String sfMinistryRole;
	public double sfPriority;
	public transient CExtStaffingCongregationPK cExtStaffingCongregationPK;
}