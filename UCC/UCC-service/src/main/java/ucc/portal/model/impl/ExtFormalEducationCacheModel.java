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

import ucc.portal.model.ExtFormalEducation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExtFormalEducation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ExtFormalEducation
 * @generated
 */
@ProviderType
public class ExtFormalEducationCacheModel implements CacheModel<ExtFormalEducation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtFormalEducationCacheModel)) {
			return false;
		}

		ExtFormalEducationCacheModel extFormalEducationCacheModel = (ExtFormalEducationCacheModel)obj;

		if (extFormalEducationId == extFormalEducationCacheModel.extFormalEducationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, extFormalEducationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{extFormalEducationId=");
		sb.append(extFormalEducationId);
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
	public ExtFormalEducation toEntityModel() {
		ExtFormalEducationImpl extFormalEducationImpl = new ExtFormalEducationImpl();

		extFormalEducationImpl.setExtFormalEducationId(extFormalEducationId);
		extFormalEducationImpl.setCompanyId(companyId);
		extFormalEducationImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			extFormalEducationImpl.setCreateDate(null);
		}
		else {
			extFormalEducationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			extFormalEducationImpl.setModifiedDate(null);
		}
		else {
			extFormalEducationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (institutionOrProgram == null) {
			extFormalEducationImpl.setInstitutionOrProgram("");
		}
		else {
			extFormalEducationImpl.setInstitutionOrProgram(institutionOrProgram);
		}

		if (city == null) {
			extFormalEducationImpl.setCity("");
		}
		else {
			extFormalEducationImpl.setCity(city);
		}

		extFormalEducationImpl.setRegionId(regionId);
		extFormalEducationImpl.setCountryId(countryId);

		if (startDateOfAttendance == Long.MIN_VALUE) {
			extFormalEducationImpl.setStartDateOfAttendance(null);
		}
		else {
			extFormalEducationImpl.setStartDateOfAttendance(new Date(
					startDateOfAttendance));
		}

		if (endDateOfAttendance == Long.MIN_VALUE) {
			extFormalEducationImpl.setEndDateOfAttendance(null);
		}
		else {
			extFormalEducationImpl.setEndDateOfAttendance(new Date(
					endDateOfAttendance));
		}

		if (degreeOrCertification == null) {
			extFormalEducationImpl.setDegreeOrCertification("");
		}
		else {
			extFormalEducationImpl.setDegreeOrCertification(degreeOrCertification);
		}

		extFormalEducationImpl.resetOriginalValues();

		return extFormalEducationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		extFormalEducationId = objectInput.readLong();

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
		objectOutput.writeLong(extFormalEducationId);

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

	public long extFormalEducationId;
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