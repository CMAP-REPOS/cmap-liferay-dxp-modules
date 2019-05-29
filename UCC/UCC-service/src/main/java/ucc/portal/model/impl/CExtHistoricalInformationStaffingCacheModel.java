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

import ucc.portal.model.CExtHistoricalInformationStaffing;

import ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CExtHistoricalInformationStaffing in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CExtHistoricalInformationStaffing
 * @generated
 */
@ProviderType
public class CExtHistoricalInformationStaffingCacheModel implements CacheModel<CExtHistoricalInformationStaffing>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtHistoricalInformationStaffingCacheModel)) {
			return false;
		}

		CExtHistoricalInformationStaffingCacheModel cExtHistoricalInformationStaffingCacheModel =
			(CExtHistoricalInformationStaffingCacheModel)obj;

		if (cExtHistoricalInformationStaffingPK.equals(
					cExtHistoricalInformationStaffingCacheModel.cExtHistoricalInformationStaffingPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cExtHistoricalInformationStaffingPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{organizationId=");
		sb.append(organizationId);
		sb.append(", cextHistoricalInformationStaffingId=");
		sb.append(cextHistoricalInformationStaffingId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", hiMinisterName=");
		sb.append(hiMinisterName);
		sb.append(", hiMinisterUCCStanding=");
		sb.append(hiMinisterUCCStanding);
		sb.append(", hiMinisterStartYearOfService=");
		sb.append(hiMinisterStartYearOfService);
		sb.append(", hiMinisterEndYearOfService=");
		sb.append(hiMinisterEndYearOfService);
		sb.append(", hiPriority=");
		sb.append(hiPriority);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CExtHistoricalInformationStaffing toEntityModel() {
		CExtHistoricalInformationStaffingImpl cExtHistoricalInformationStaffingImpl =
			new CExtHistoricalInformationStaffingImpl();

		cExtHistoricalInformationStaffingImpl.setOrganizationId(organizationId);
		cExtHistoricalInformationStaffingImpl.setCextHistoricalInformationStaffingId(cextHistoricalInformationStaffingId);
		cExtHistoricalInformationStaffingImpl.setCompanyId(companyId);
		cExtHistoricalInformationStaffingImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			cExtHistoricalInformationStaffingImpl.setCreateDate(null);
		}
		else {
			cExtHistoricalInformationStaffingImpl.setCreateDate(new Date(
					createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cExtHistoricalInformationStaffingImpl.setModifiedDate(null);
		}
		else {
			cExtHistoricalInformationStaffingImpl.setModifiedDate(new Date(
					modifiedDate));
		}

		if (hiMinisterName == null) {
			cExtHistoricalInformationStaffingImpl.setHiMinisterName("");
		}
		else {
			cExtHistoricalInformationStaffingImpl.setHiMinisterName(hiMinisterName);
		}

		cExtHistoricalInformationStaffingImpl.setHiMinisterUCCStanding(hiMinisterUCCStanding);
		cExtHistoricalInformationStaffingImpl.setHiMinisterStartYearOfService(hiMinisterStartYearOfService);
		cExtHistoricalInformationStaffingImpl.setHiMinisterEndYearOfService(hiMinisterEndYearOfService);
		cExtHistoricalInformationStaffingImpl.setHiPriority(hiPriority);

		cExtHistoricalInformationStaffingImpl.resetOriginalValues();

		return cExtHistoricalInformationStaffingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		organizationId = objectInput.readLong();

		cextHistoricalInformationStaffingId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		hiMinisterName = objectInput.readUTF();

		hiMinisterUCCStanding = objectInput.readBoolean();

		hiMinisterStartYearOfService = objectInput.readInt();

		hiMinisterEndYearOfService = objectInput.readInt();

		hiPriority = objectInput.readDouble();

		cExtHistoricalInformationStaffingPK = new CExtHistoricalInformationStaffingPK(organizationId,
				cextHistoricalInformationStaffingId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(organizationId);

		objectOutput.writeLong(cextHistoricalInformationStaffingId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (hiMinisterName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hiMinisterName);
		}

		objectOutput.writeBoolean(hiMinisterUCCStanding);

		objectOutput.writeInt(hiMinisterStartYearOfService);

		objectOutput.writeInt(hiMinisterEndYearOfService);

		objectOutput.writeDouble(hiPriority);
	}

	public long organizationId;
	public long cextHistoricalInformationStaffingId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String hiMinisterName;
	public boolean hiMinisterUCCStanding;
	public int hiMinisterStartYearOfService;
	public int hiMinisterEndYearOfService;
	public double hiPriority;
	public transient CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK;
}