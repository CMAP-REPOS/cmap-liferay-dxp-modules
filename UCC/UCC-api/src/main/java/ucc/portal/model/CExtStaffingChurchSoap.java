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

import ucc.portal.service.persistence.CExtStaffingChurchPK;

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
public class CExtStaffingChurchSoap implements Serializable {
	public static CExtStaffingChurchSoap toSoapModel(CExtStaffingChurch model) {
		CExtStaffingChurchSoap soapModel = new CExtStaffingChurchSoap();

		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setCextStaffingChurchId(model.getCextStaffingChurchId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSfPosition(model.getSfPosition());
		soapModel.setSfHeadOfStaff(model.isSfHeadOfStaff());
		soapModel.setSfCompensation(model.getSfCompensation());
		soapModel.setSfSupervisedBy(model.getSfSupervisedBy());
		soapModel.setSfCurrentTenure(model.getSfCurrentTenure());
		soapModel.setSfPriority(model.getSfPriority());

		return soapModel;
	}

	public static CExtStaffingChurchSoap[] toSoapModels(
		CExtStaffingChurch[] models) {
		CExtStaffingChurchSoap[] soapModels = new CExtStaffingChurchSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CExtStaffingChurchSoap[][] toSoapModels(
		CExtStaffingChurch[][] models) {
		CExtStaffingChurchSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CExtStaffingChurchSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CExtStaffingChurchSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CExtStaffingChurchSoap[] toSoapModels(
		List<CExtStaffingChurch> models) {
		List<CExtStaffingChurchSoap> soapModels = new ArrayList<CExtStaffingChurchSoap>(models.size());

		for (CExtStaffingChurch model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CExtStaffingChurchSoap[soapModels.size()]);
	}

	public CExtStaffingChurchSoap() {
	}

	public CExtStaffingChurchPK getPrimaryKey() {
		return new CExtStaffingChurchPK(_organizationId, _cextStaffingChurchId);
	}

	public void setPrimaryKey(CExtStaffingChurchPK pk) {
		setOrganizationId(pk.organizationId);
		setCextStaffingChurchId(pk.cextStaffingChurchId);
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getCextStaffingChurchId() {
		return _cextStaffingChurchId;
	}

	public void setCextStaffingChurchId(long cextStaffingChurchId) {
		_cextStaffingChurchId = cextStaffingChurchId;
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

	public String getSfPosition() {
		return _sfPosition;
	}

	public void setSfPosition(String sfPosition) {
		_sfPosition = sfPosition;
	}

	public boolean getSfHeadOfStaff() {
		return _sfHeadOfStaff;
	}

	public boolean isSfHeadOfStaff() {
		return _sfHeadOfStaff;
	}

	public void setSfHeadOfStaff(boolean sfHeadOfStaff) {
		_sfHeadOfStaff = sfHeadOfStaff;
	}

	public String getSfCompensation() {
		return _sfCompensation;
	}

	public void setSfCompensation(String sfCompensation) {
		_sfCompensation = sfCompensation;
	}

	public String getSfSupervisedBy() {
		return _sfSupervisedBy;
	}

	public void setSfSupervisedBy(String sfSupervisedBy) {
		_sfSupervisedBy = sfSupervisedBy;
	}

	public String getSfCurrentTenure() {
		return _sfCurrentTenure;
	}

	public void setSfCurrentTenure(String sfCurrentTenure) {
		_sfCurrentTenure = sfCurrentTenure;
	}

	public double getSfPriority() {
		return _sfPriority;
	}

	public void setSfPriority(double sfPriority) {
		_sfPriority = sfPriority;
	}

	private long _organizationId;
	private long _cextStaffingChurchId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _sfPosition;
	private boolean _sfHeadOfStaff;
	private String _sfCompensation;
	private String _sfSupervisedBy;
	private String _sfCurrentTenure;
	private double _sfPriority;
}