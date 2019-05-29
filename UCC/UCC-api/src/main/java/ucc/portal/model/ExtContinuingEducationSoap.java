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
public class ExtContinuingEducationSoap implements Serializable {
	public static ExtContinuingEducationSoap toSoapModel(
		ExtContinuingEducation model) {
		ExtContinuingEducationSoap soapModel = new ExtContinuingEducationSoap();

		soapModel.setExtContinuingEducationId(model.getExtContinuingEducationId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setInstitutionOrProgram(model.getInstitutionOrProgram());
		soapModel.setCity(model.getCity());
		soapModel.setRegionId(model.getRegionId());
		soapModel.setCountryId(model.getCountryId());
		soapModel.setStartDateOfAttendance(model.getStartDateOfAttendance());
		soapModel.setEndDateOfAttendance(model.getEndDateOfAttendance());
		soapModel.setDegreeOrCertification(model.getDegreeOrCertification());

		return soapModel;
	}

	public static ExtContinuingEducationSoap[] toSoapModels(
		ExtContinuingEducation[] models) {
		ExtContinuingEducationSoap[] soapModels = new ExtContinuingEducationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ExtContinuingEducationSoap[][] toSoapModels(
		ExtContinuingEducation[][] models) {
		ExtContinuingEducationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ExtContinuingEducationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ExtContinuingEducationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ExtContinuingEducationSoap[] toSoapModels(
		List<ExtContinuingEducation> models) {
		List<ExtContinuingEducationSoap> soapModels = new ArrayList<ExtContinuingEducationSoap>(models.size());

		for (ExtContinuingEducation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ExtContinuingEducationSoap[soapModels.size()]);
	}

	public ExtContinuingEducationSoap() {
	}

	public long getPrimaryKey() {
		return _extContinuingEducationId;
	}

	public void setPrimaryKey(long pk) {
		setExtContinuingEducationId(pk);
	}

	public long getExtContinuingEducationId() {
		return _extContinuingEducationId;
	}

	public void setExtContinuingEducationId(long extContinuingEducationId) {
		_extContinuingEducationId = extContinuingEducationId;
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

	public String getInstitutionOrProgram() {
		return _institutionOrProgram;
	}

	public void setInstitutionOrProgram(String institutionOrProgram) {
		_institutionOrProgram = institutionOrProgram;
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

	public Date getStartDateOfAttendance() {
		return _startDateOfAttendance;
	}

	public void setStartDateOfAttendance(Date startDateOfAttendance) {
		_startDateOfAttendance = startDateOfAttendance;
	}

	public Date getEndDateOfAttendance() {
		return _endDateOfAttendance;
	}

	public void setEndDateOfAttendance(Date endDateOfAttendance) {
		_endDateOfAttendance = endDateOfAttendance;
	}

	public String getDegreeOrCertification() {
		return _degreeOrCertification;
	}

	public void setDegreeOrCertification(String degreeOrCertification) {
		_degreeOrCertification = degreeOrCertification;
	}

	private long _extContinuingEducationId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _institutionOrProgram;
	private String _city;
	private long _regionId;
	private long _countryId;
	private Date _startDateOfAttendance;
	private Date _endDateOfAttendance;
	private String _degreeOrCertification;
}