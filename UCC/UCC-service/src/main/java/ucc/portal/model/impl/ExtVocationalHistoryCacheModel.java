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

import ucc.portal.model.ExtVocationalHistory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExtVocationalHistory in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ExtVocationalHistory
 * @generated
 */
@ProviderType
public class ExtVocationalHistoryCacheModel implements CacheModel<ExtVocationalHistory>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtVocationalHistoryCacheModel)) {
			return false;
		}

		ExtVocationalHistoryCacheModel extVocationalHistoryCacheModel = (ExtVocationalHistoryCacheModel)obj;

		if (extVocationalHistoryId == extVocationalHistoryCacheModel.extVocationalHistoryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, extVocationalHistoryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{extVocationalHistoryId=");
		sb.append(extVocationalHistoryId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", locationOrSetting=");
		sb.append(locationOrSetting);
		sb.append(", city=");
		sb.append(city);
		sb.append(", regionId=");
		sb.append(regionId);
		sb.append(", countryId=");
		sb.append(countryId);
		sb.append(", startDateOfService=");
		sb.append(startDateOfService);
		sb.append(", endDateOfService=");
		sb.append(endDateOfService);
		sb.append(", titleOrPosition=");
		sb.append(titleOrPosition);
		sb.append(", jobTypeId=");
		sb.append(jobTypeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExtVocationalHistory toEntityModel() {
		ExtVocationalHistoryImpl extVocationalHistoryImpl = new ExtVocationalHistoryImpl();

		extVocationalHistoryImpl.setExtVocationalHistoryId(extVocationalHistoryId);
		extVocationalHistoryImpl.setCompanyId(companyId);
		extVocationalHistoryImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			extVocationalHistoryImpl.setCreateDate(null);
		}
		else {
			extVocationalHistoryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			extVocationalHistoryImpl.setModifiedDate(null);
		}
		else {
			extVocationalHistoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (locationOrSetting == null) {
			extVocationalHistoryImpl.setLocationOrSetting("");
		}
		else {
			extVocationalHistoryImpl.setLocationOrSetting(locationOrSetting);
		}

		if (city == null) {
			extVocationalHistoryImpl.setCity("");
		}
		else {
			extVocationalHistoryImpl.setCity(city);
		}

		extVocationalHistoryImpl.setRegionId(regionId);
		extVocationalHistoryImpl.setCountryId(countryId);

		if (startDateOfService == Long.MIN_VALUE) {
			extVocationalHistoryImpl.setStartDateOfService(null);
		}
		else {
			extVocationalHistoryImpl.setStartDateOfService(new Date(
					startDateOfService));
		}

		if (endDateOfService == Long.MIN_VALUE) {
			extVocationalHistoryImpl.setEndDateOfService(null);
		}
		else {
			extVocationalHistoryImpl.setEndDateOfService(new Date(
					endDateOfService));
		}

		if (titleOrPosition == null) {
			extVocationalHistoryImpl.setTitleOrPosition("");
		}
		else {
			extVocationalHistoryImpl.setTitleOrPosition(titleOrPosition);
		}

		extVocationalHistoryImpl.setJobTypeId(jobTypeId);

		extVocationalHistoryImpl.resetOriginalValues();

		return extVocationalHistoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		extVocationalHistoryId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		locationOrSetting = objectInput.readUTF();
		city = objectInput.readUTF();

		regionId = objectInput.readLong();

		countryId = objectInput.readLong();
		startDateOfService = objectInput.readLong();
		endDateOfService = objectInput.readLong();
		titleOrPosition = objectInput.readUTF();

		jobTypeId = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(extVocationalHistoryId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (locationOrSetting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locationOrSetting);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		objectOutput.writeLong(regionId);

		objectOutput.writeLong(countryId);
		objectOutput.writeLong(startDateOfService);
		objectOutput.writeLong(endDateOfService);

		if (titleOrPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(titleOrPosition);
		}

		objectOutput.writeInt(jobTypeId);
	}

	public long extVocationalHistoryId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String locationOrSetting;
	public String city;
	public long regionId;
	public long countryId;
	public long startDateOfService;
	public long endDateOfService;
	public String titleOrPosition;
	public int jobTypeId;
}