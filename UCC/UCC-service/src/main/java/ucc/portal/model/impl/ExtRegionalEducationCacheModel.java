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

import ucc.portal.model.ExtRegionalEducation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExtRegionalEducation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ExtRegionalEducation
 * @generated
 */
@ProviderType
public class ExtRegionalEducationCacheModel implements CacheModel<ExtRegionalEducation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtRegionalEducationCacheModel)) {
			return false;
		}

		ExtRegionalEducationCacheModel extRegionalEducationCacheModel = (ExtRegionalEducationCacheModel)obj;

		if (extRegionalEducationId == extRegionalEducationCacheModel.extRegionalEducationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, extRegionalEducationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{extRegionalEducationId=");
		sb.append(extRegionalEducationId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", programOrExperience=");
		sb.append(programOrExperience);
		sb.append(", city=");
		sb.append(city);
		sb.append(", regionId=");
		sb.append(regionId);
		sb.append(", countryId=");
		sb.append(countryId);
		sb.append(", startDateOfAttendance=");
		sb.append(startDateOfAttendance);
		sb.append(", endDateOfAttendance=");
		sb.append(endDateOfAttendance);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExtRegionalEducation toEntityModel() {
		ExtRegionalEducationImpl extRegionalEducationImpl = new ExtRegionalEducationImpl();

		extRegionalEducationImpl.setExtRegionalEducationId(extRegionalEducationId);
		extRegionalEducationImpl.setCompanyId(companyId);
		extRegionalEducationImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			extRegionalEducationImpl.setCreateDate(null);
		}
		else {
			extRegionalEducationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			extRegionalEducationImpl.setModifiedDate(null);
		}
		else {
			extRegionalEducationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (programOrExperience == null) {
			extRegionalEducationImpl.setProgramOrExperience("");
		}
		else {
			extRegionalEducationImpl.setProgramOrExperience(programOrExperience);
		}

		if (city == null) {
			extRegionalEducationImpl.setCity("");
		}
		else {
			extRegionalEducationImpl.setCity(city);
		}

		extRegionalEducationImpl.setRegionId(regionId);
		extRegionalEducationImpl.setCountryId(countryId);

		if (startDateOfAttendance == Long.MIN_VALUE) {
			extRegionalEducationImpl.setStartDateOfAttendance(null);
		}
		else {
			extRegionalEducationImpl.setStartDateOfAttendance(new Date(
					startDateOfAttendance));
		}

		if (endDateOfAttendance == Long.MIN_VALUE) {
			extRegionalEducationImpl.setEndDateOfAttendance(null);
		}
		else {
			extRegionalEducationImpl.setEndDateOfAttendance(new Date(
					endDateOfAttendance));
		}

		extRegionalEducationImpl.resetOriginalValues();

		return extRegionalEducationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		extRegionalEducationId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		programOrExperience = objectInput.readUTF();
		city = objectInput.readUTF();

		regionId = objectInput.readLong();

		countryId = objectInput.readLong();
		startDateOfAttendance = objectInput.readLong();
		endDateOfAttendance = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(extRegionalEducationId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (programOrExperience == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(programOrExperience);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		objectOutput.writeLong(regionId);

		objectOutput.writeLong(countryId);
		objectOutput.writeLong(startDateOfAttendance);
		objectOutput.writeLong(endDateOfAttendance);
	}

	public long extRegionalEducationId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String programOrExperience;
	public String city;
	public long regionId;
	public long countryId;
	public long startDateOfAttendance;
	public long endDateOfAttendance;
}