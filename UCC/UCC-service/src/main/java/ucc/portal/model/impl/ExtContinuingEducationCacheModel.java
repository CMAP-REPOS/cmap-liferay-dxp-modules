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

import ucc.portal.model.ExtContinuingEducation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExtContinuingEducation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ExtContinuingEducation
 * @generated
 */
@ProviderType
public class ExtContinuingEducationCacheModel implements CacheModel<ExtContinuingEducation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtContinuingEducationCacheModel)) {
			return false;
		}

		ExtContinuingEducationCacheModel extContinuingEducationCacheModel = (ExtContinuingEducationCacheModel)obj;

		if (extContinuingEducationId == extContinuingEducationCacheModel.extContinuingEducationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, extContinuingEducationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{extContinuingEducationId=");
		sb.append(extContinuingEducationId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", institutionOrProgram=");
		sb.append(institutionOrProgram);
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
		sb.append(", degreeOrCertification=");
		sb.append(degreeOrCertification);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExtContinuingEducation toEntityModel() {
		ExtContinuingEducationImpl extContinuingEducationImpl = new ExtContinuingEducationImpl();

		extContinuingEducationImpl.setExtContinuingEducationId(extContinuingEducationId);
		extContinuingEducationImpl.setCompanyId(companyId);
		extContinuingEducationImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			extContinuingEducationImpl.setCreateDate(null);
		}
		else {
			extContinuingEducationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			extContinuingEducationImpl.setModifiedDate(null);
		}
		else {
			extContinuingEducationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (institutionOrProgram == null) {
			extContinuingEducationImpl.setInstitutionOrProgram("");
		}
		else {
			extContinuingEducationImpl.setInstitutionOrProgram(institutionOrProgram);
		}

		if (city == null) {
			extContinuingEducationImpl.setCity("");
		}
		else {
			extContinuingEducationImpl.setCity(city);
		}

		extContinuingEducationImpl.setRegionId(regionId);
		extContinuingEducationImpl.setCountryId(countryId);

		if (startDateOfAttendance == Long.MIN_VALUE) {
			extContinuingEducationImpl.setStartDateOfAttendance(null);
		}
		else {
			extContinuingEducationImpl.setStartDateOfAttendance(new Date(
					startDateOfAttendance));
		}

		if (endDateOfAttendance == Long.MIN_VALUE) {
			extContinuingEducationImpl.setEndDateOfAttendance(null);
		}
		else {
			extContinuingEducationImpl.setEndDateOfAttendance(new Date(
					endDateOfAttendance));
		}

		if (degreeOrCertification == null) {
			extContinuingEducationImpl.setDegreeOrCertification("");
		}
		else {
			extContinuingEducationImpl.setDegreeOrCertification(degreeOrCertification);
		}

		extContinuingEducationImpl.resetOriginalValues();

		return extContinuingEducationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		extContinuingEducationId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		institutionOrProgram = objectInput.readUTF();
		city = objectInput.readUTF();

		regionId = objectInput.readLong();

		countryId = objectInput.readLong();
		startDateOfAttendance = objectInput.readLong();
		endDateOfAttendance = objectInput.readLong();
		degreeOrCertification = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(extContinuingEducationId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (institutionOrProgram == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(institutionOrProgram);
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

		if (degreeOrCertification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(degreeOrCertification);
		}
	}

	public long extContinuingEducationId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String institutionOrProgram;
	public String city;
	public long regionId;
	public long countryId;
	public long startDateOfAttendance;
	public long endDateOfAttendance;
	public String degreeOrCertification;
}