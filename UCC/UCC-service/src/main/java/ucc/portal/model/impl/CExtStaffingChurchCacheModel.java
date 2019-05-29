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

import ucc.portal.model.CExtStaffingChurch;

import ucc.portal.service.persistence.CExtStaffingChurchPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CExtStaffingChurch in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CExtStaffingChurch
 * @generated
 */
@ProviderType
public class CExtStaffingChurchCacheModel implements CacheModel<CExtStaffingChurch>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtStaffingChurchCacheModel)) {
			return false;
		}

		CExtStaffingChurchCacheModel cExtStaffingChurchCacheModel = (CExtStaffingChurchCacheModel)obj;

		if (cExtStaffingChurchPK.equals(
					cExtStaffingChurchCacheModel.cExtStaffingChurchPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cExtStaffingChurchPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{organizationId=");
		sb.append(organizationId);
		sb.append(", cextStaffingChurchId=");
		sb.append(cextStaffingChurchId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", sfPosition=");
		sb.append(sfPosition);
		sb.append(", sfHeadOfStaff=");
		sb.append(sfHeadOfStaff);
		sb.append(", sfCompensation=");
		sb.append(sfCompensation);
		sb.append(", sfSupervisedBy=");
		sb.append(sfSupervisedBy);
		sb.append(", sfCurrentTenure=");
		sb.append(sfCurrentTenure);
		sb.append(", sfPriority=");
		sb.append(sfPriority);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CExtStaffingChurch toEntityModel() {
		CExtStaffingChurchImpl cExtStaffingChurchImpl = new CExtStaffingChurchImpl();

		cExtStaffingChurchImpl.setOrganizationId(organizationId);
		cExtStaffingChurchImpl.setCextStaffingChurchId(cextStaffingChurchId);
		cExtStaffingChurchImpl.setCompanyId(companyId);
		cExtStaffingChurchImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			cExtStaffingChurchImpl.setCreateDate(null);
		}
		else {
			cExtStaffingChurchImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cExtStaffingChurchImpl.setModifiedDate(null);
		}
		else {
			cExtStaffingChurchImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (sfPosition == null) {
			cExtStaffingChurchImpl.setSfPosition("");
		}
		else {
			cExtStaffingChurchImpl.setSfPosition(sfPosition);
		}

		cExtStaffingChurchImpl.setSfHeadOfStaff(sfHeadOfStaff);

		if (sfCompensation == null) {
			cExtStaffingChurchImpl.setSfCompensation("");
		}
		else {
			cExtStaffingChurchImpl.setSfCompensation(sfCompensation);
		}

		if (sfSupervisedBy == null) {
			cExtStaffingChurchImpl.setSfSupervisedBy("");
		}
		else {
			cExtStaffingChurchImpl.setSfSupervisedBy(sfSupervisedBy);
		}

		if (sfCurrentTenure == null) {
			cExtStaffingChurchImpl.setSfCurrentTenure("");
		}
		else {
			cExtStaffingChurchImpl.setSfCurrentTenure(sfCurrentTenure);
		}

		cExtStaffingChurchImpl.setSfPriority(sfPriority);

		cExtStaffingChurchImpl.resetOriginalValues();

		return cExtStaffingChurchImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		organizationId = objectInput.readLong();

		cextStaffingChurchId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		sfPosition = objectInput.readUTF();

		sfHeadOfStaff = objectInput.readBoolean();
		sfCompensation = objectInput.readUTF();
		sfSupervisedBy = objectInput.readUTF();
		sfCurrentTenure = objectInput.readUTF();

		sfPriority = objectInput.readDouble();

		cExtStaffingChurchPK = new CExtStaffingChurchPK(organizationId,
				cextStaffingChurchId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(organizationId);

		objectOutput.writeLong(cextStaffingChurchId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (sfPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sfPosition);
		}

		objectOutput.writeBoolean(sfHeadOfStaff);

		if (sfCompensation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sfCompensation);
		}

		if (sfSupervisedBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sfSupervisedBy);
		}

		if (sfCurrentTenure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sfCurrentTenure);
		}

		objectOutput.writeDouble(sfPriority);
	}

	public long organizationId;
	public long cextStaffingChurchId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String sfPosition;
	public boolean sfHeadOfStaff;
	public String sfCompensation;
	public String sfSupervisedBy;
	public String sfCurrentTenure;
	public double sfPriority;
	public transient CExtStaffingChurchPK cExtStaffingChurchPK;
}