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
public class ExtVocationalHistorySoap implements Serializable {
	public static ExtVocationalHistorySoap toSoapModel(
		ExtVocationalHistory model) {
		ExtVocationalHistorySoap soapModel = new ExtVocationalHistorySoap();

		soapModel.setExtVocationalHistoryId(model.getExtVocationalHistoryId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setLocationOrSetting(model.getLocationOrSetting());
		soapModel.setCity(model.getCity());
		soapModel.setRegionId(model.getRegionId());
		soapModel.setCountryId(model.getCountryId());
		soapModel.setStartDateOfService(model.getStartDateOfService());
		soapModel.setEndDateOfService(model.getEndDateOfService());
		soapModel.setTitleOrPosition(model.getTitleOrPosition());
		soapModel.setJobTypeId(model.getJobTypeId());

		return soapModel;
	}

	public static ExtVocationalHistorySoap[] toSoapModels(
		ExtVocationalHistory[] models) {
		ExtVocationalHistorySoap[] soapModels = new ExtVocationalHistorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ExtVocationalHistorySoap[][] toSoapModels(
		ExtVocationalHistory[][] models) {
		ExtVocationalHistorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ExtVocationalHistorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new ExtVocationalHistorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ExtVocationalHistorySoap[] toSoapModels(
		List<ExtVocationalHistory> models) {
		List<ExtVocationalHistorySoap> soapModels = new ArrayList<ExtVocationalHistorySoap>(models.size());

		for (ExtVocationalHistory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ExtVocationalHistorySoap[soapModels.size()]);
	}

	public ExtVocationalHistorySoap() {
	}

	public long getPrimaryKey() {
		return _extVocationalHistoryId;
	}

	public void setPrimaryKey(long pk) {
		setExtVocationalHistoryId(pk);
	}

	public long getExtVocationalHistoryId() {
		return _extVocationalHistoryId;
	}

	public void setExtVocationalHistoryId(long extVocationalHistoryId) {
		_extVocationalHistoryId = extVocationalHistoryId;
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

	public String getLocationOrSetting() {
		return _locationOrSetting;
	}

	public void setLocationOrSetting(String locationOrSetting) {
		_locationOrSetting = locationOrSetting;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public long getRegionId() {
		return _regionId;
	}

	public void setRegionId(long regionId) {
		_regionId = regionId;
	}

	public long getCountryId() {
		return _countryId;
	}

	public void setCountryId(long countryId) {
		_countryId = countryId;
	}

	public Date getStartDateOfService() {
		return _startDateOfService;
	}

	public void setStartDateOfService(Date startDateOfService) {
		_startDateOfService = startDateOfService;
	}

	public Date getEndDateOfService() {
		return _endDateOfService;
	}

	public void setEndDateOfService(Date endDateOfService) {
		_endDateOfService = endDateOfService;
	}

	public String getTitleOrPosition() {
		return _titleOrPosition;
	}

	public void setTitleOrPosition(String titleOrPosition) {
		_titleOrPosition = titleOrPosition;
	}

	public int getJobTypeId() {
		return _jobTypeId;
	}

	public void setJobTypeId(int jobTypeId) {
		_jobTypeId = jobTypeId;
	}

	private long _extVocationalHistoryId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _locationOrSetting;
	private String _city;
	private long _regionId;
	private long _countryId;
	private Date _startDateOfService;
	private Date _endDateOfService;
	private String _titleOrPosition;
	private int _jobTypeId;
}