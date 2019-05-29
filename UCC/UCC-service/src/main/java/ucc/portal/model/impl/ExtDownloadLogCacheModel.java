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

import ucc.portal.model.ExtDownloadLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExtDownloadLog in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ExtDownloadLog
 * @generated
 */
@ProviderType
public class ExtDownloadLogCacheModel implements CacheModel<ExtDownloadLog>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtDownloadLogCacheModel)) {
			return false;
		}

		ExtDownloadLogCacheModel extDownloadLogCacheModel = (ExtDownloadLogCacheModel)obj;

		if (extDownloadLogId == extDownloadLogCacheModel.extDownloadLogId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, extDownloadLogId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{extDownloadLogId=");
		sb.append(extDownloadLogId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", profileFileEntryId=");
		sb.append(profileFileEntryId);
		sb.append(", profileFileVersionId=");
		sb.append(profileFileVersionId);
		sb.append(", searchAndCallUserId=");
		sb.append(searchAndCallUserId);
		sb.append(", conferenceIds=");
		sb.append(conferenceIds);
		sb.append(", downloadDate=");
		sb.append(downloadDate);
		sb.append(", withdrawalDate=");
		sb.append(withdrawalDate);
		sb.append(", fitnessReview=");
		sb.append(fitnessReview);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExtDownloadLog toEntityModel() {
		ExtDownloadLogImpl extDownloadLogImpl = new ExtDownloadLogImpl();

		extDownloadLogImpl.setExtDownloadLogId(extDownloadLogId);
		extDownloadLogImpl.setCompanyId(companyId);
		extDownloadLogImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			extDownloadLogImpl.setCreateDate(null);
		}
		else {
			extDownloadLogImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			extDownloadLogImpl.setModifiedDate(null);
		}
		else {
			extDownloadLogImpl.setModifiedDate(new Date(modifiedDate));
		}

		extDownloadLogImpl.setProfileFileEntryId(profileFileEntryId);
		extDownloadLogImpl.setProfileFileVersionId(profileFileVersionId);
		extDownloadLogImpl.setSearchAndCallUserId(searchAndCallUserId);

		if (conferenceIds == null) {
			extDownloadLogImpl.setConferenceIds("");
		}
		else {
			extDownloadLogImpl.setConferenceIds(conferenceIds);
		}

		if (downloadDate == Long.MIN_VALUE) {
			extDownloadLogImpl.setDownloadDate(null);
		}
		else {
			extDownloadLogImpl.setDownloadDate(new Date(downloadDate));
		}

		if (withdrawalDate == Long.MIN_VALUE) {
			extDownloadLogImpl.setWithdrawalDate(null);
		}
		else {
			extDownloadLogImpl.setWithdrawalDate(new Date(withdrawalDate));
		}

		extDownloadLogImpl.setFitnessReview(fitnessReview);

		extDownloadLogImpl.resetOriginalValues();

		return extDownloadLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		extDownloadLogId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		profileFileEntryId = objectInput.readLong();

		profileFileVersionId = objectInput.readLong();

		searchAndCallUserId = objectInput.readLong();
		conferenceIds = objectInput.readUTF();
		downloadDate = objectInput.readLong();
		withdrawalDate = objectInput.readLong();

		fitnessReview = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(extDownloadLogId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(profileFileEntryId);

		objectOutput.writeLong(profileFileVersionId);

		objectOutput.writeLong(searchAndCallUserId);

		if (conferenceIds == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(conferenceIds);
		}

		objectOutput.writeLong(downloadDate);
		objectOutput.writeLong(withdrawalDate);

		objectOutput.writeBoolean(fitnessReview);
	}

	public long extDownloadLogId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long profileFileEntryId;
	public long profileFileVersionId;
	public long searchAndCallUserId;
	public String conferenceIds;
	public long downloadDate;
	public long withdrawalDate;
	public boolean fitnessReview;
}