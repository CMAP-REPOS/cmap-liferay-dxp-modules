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

package ucc.portal.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ExtDownloadLogSoap implements Serializable {
	public static ExtDownloadLogSoap toSoapModel(ExtDownloadLog model) {
		ExtDownloadLogSoap soapModel = new ExtDownloadLogSoap();

		soapModel.setExtDownloadLogId(model.getExtDownloadLogId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setProfileFileEntryId(model.getProfileFileEntryId());
		soapModel.setProfileFileVersionId(model.getProfileFileVersionId());
		soapModel.setSearchAndCallUserId(model.getSearchAndCallUserId());
		soapModel.setConferenceIds(model.getConferenceIds());
		soapModel.setDownloadDate(model.getDownloadDate());
		soapModel.setWithdrawalDate(model.getWithdrawalDate());
		soapModel.setFitnessReview(model.isFitnessReview());

		return soapModel;
	}

	public static ExtDownloadLogSoap[] toSoapModels(ExtDownloadLog[] models) {
		ExtDownloadLogSoap[] soapModels = new ExtDownloadLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ExtDownloadLogSoap[][] toSoapModels(ExtDownloadLog[][] models) {
		ExtDownloadLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ExtDownloadLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ExtDownloadLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ExtDownloadLogSoap[] toSoapModels(List<ExtDownloadLog> models) {
		List<ExtDownloadLogSoap> soapModels = new ArrayList<ExtDownloadLogSoap>(models.size());

		for (ExtDownloadLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ExtDownloadLogSoap[soapModels.size()]);
	}

	public ExtDownloadLogSoap() {
	}

	public long getPrimaryKey() {
		return _extDownloadLogId;
	}

	public void setPrimaryKey(long pk) {
		setExtDownloadLogId(pk);
	}

	public long getExtDownloadLogId() {
		return _extDownloadLogId;
	}

	public void setExtDownloadLogId(long extDownloadLogId) {
		_extDownloadLogId = extDownloadLogId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getProfileFileEntryId() {
		return _profileFileEntryId;
	}

	public void setProfileFileEntryId(long profileFileEntryId) {
		_profileFileEntryId = profileFileEntryId;
	}

	public long getProfileFileVersionId() {
		return _profileFileVersionId;
	}

	public void setProfileFileVersionId(long profileFileVersionId) {
		_profileFileVersionId = profileFileVersionId;
	}

	public long getSearchAndCallUserId() {
		return _searchAndCallUserId;
	}

	public void setSearchAndCallUserId(long searchAndCallUserId) {
		_searchAndCallUserId = searchAndCallUserId;
	}

	public String getConferenceIds() {
		return _conferenceIds;
	}

	public void setConferenceIds(String conferenceIds) {
		_conferenceIds = conferenceIds;
	}

	public Date getDownloadDate() {
		return _downloadDate;
	}

	public void setDownloadDate(Date downloadDate) {
		_downloadDate = downloadDate;
	}

	public Date getWithdrawalDate() {
		return _withdrawalDate;
	}

	public void setWithdrawalDate(Date withdrawalDate) {
		_withdrawalDate = withdrawalDate;
	}

	public boolean getFitnessReview() {
		return _fitnessReview;
	}

	public boolean isFitnessReview() {
		return _fitnessReview;
	}

	public void setFitnessReview(boolean fitnessReview) {
		_fitnessReview = fitnessReview;
	}

	private long _extDownloadLogId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _profileFileEntryId;
	private long _profileFileVersionId;
	private long _searchAndCallUserId;
	private String _conferenceIds;
	private Date _downloadDate;
	private Date _withdrawalDate;
	private boolean _fitnessReview;
}