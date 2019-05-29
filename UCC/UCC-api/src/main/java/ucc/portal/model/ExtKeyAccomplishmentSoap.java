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
public class ExtKeyAccomplishmentSoap implements Serializable {
	public static ExtKeyAccomplishmentSoap toSoapModel(
		ExtKeyAccomplishment model) {
		ExtKeyAccomplishmentSoap soapModel = new ExtKeyAccomplishmentSoap();

		soapModel.setExtKeyAccomplishmentId(model.getExtKeyAccomplishmentId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setLocationOrSetting(model.getLocationOrSetting());
		soapModel.setDescription(model.getDescription());
		soapModel.setPriority(model.getPriority());

		return soapModel;
	}

	public static ExtKeyAccomplishmentSoap[] toSoapModels(
		ExtKeyAccomplishment[] models) {
		ExtKeyAccomplishmentSoap[] soapModels = new ExtKeyAccomplishmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ExtKeyAccomplishmentSoap[][] toSoapModels(
		ExtKeyAccomplishment[][] models) {
		ExtKeyAccomplishmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ExtKeyAccomplishmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ExtKeyAccomplishmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ExtKeyAccomplishmentSoap[] toSoapModels(
		List<ExtKeyAccomplishment> models) {
		List<ExtKeyAccomplishmentSoap> soapModels = new ArrayList<ExtKeyAccomplishmentSoap>(models.size());

		for (ExtKeyAccomplishment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ExtKeyAccomplishmentSoap[soapModels.size()]);
	}

	public ExtKeyAccomplishmentSoap() {
	}

	public long getPrimaryKey() {
		return _extKeyAccomplishmentId;
	}

	public void setPrimaryKey(long pk) {
		setExtKeyAccomplishmentId(pk);
	}

	public long getExtKeyAccomplishmentId() {
		return _extKeyAccomplishmentId;
	}

	public void setExtKeyAccomplishmentId(long extKeyAccomplishmentId) {
		_extKeyAccomplishmentId = extKeyAccomplishmentId;
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

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getPriority() {
		return _priority;
	}

	public void setPriority(double priority) {
		_priority = priority;
	}

	private long _extKeyAccomplishmentId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _locationOrSetting;
	private String _description;
	private double _priority;
}