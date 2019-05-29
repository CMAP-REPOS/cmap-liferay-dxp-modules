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

import ucc.portal.service.persistence.CExtStaffingCongregationPK;

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
public class CExtStaffingCongregationSoap implements Serializable {
	public static CExtStaffingCongregationSoap toSoapModel(
		CExtStaffingCongregation model) {
		CExtStaffingCongregationSoap soapModel = new CExtStaffingCongregationSoap();

		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setCextStaffingCongregationId(model.getCextStaffingCongregationId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSfMinisterName(model.getSfMinisterName());
		soapModel.setSfMinisterRetired(model.isSfMinisterRetired());
		soapModel.setSfMinisterCovenant(model.getSfMinisterCovenant());
		soapModel.setSfMinistrySetting(model.getSfMinistrySetting());
		soapModel.setSfMinistryRole(model.getSfMinistryRole());
		soapModel.setSfPriority(model.getSfPriority());

		return soapModel;
	}

	public static CExtStaffingCongregationSoap[] toSoapModels(
		CExtStaffingCongregation[] models) {
		CExtStaffingCongregationSoap[] soapModels = new CExtStaffingCongregationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CExtStaffingCongregationSoap[][] toSoapModels(
		CExtStaffingCongregation[][] models) {
		CExtStaffingCongregationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CExtStaffingCongregationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CExtStaffingCongregationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CExtStaffingCongregationSoap[] toSoapModels(
		List<CExtStaffingCongregation> models) {
		List<CExtStaffingCongregationSoap> soapModels = new ArrayList<CExtStaffingCongregationSoap>(models.size());

		for (CExtStaffingCongregation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CExtStaffingCongregationSoap[soapModels.size()]);
	}

	public CExtStaffingCongregationSoap() {
	}

	public CExtStaffingCongregationPK getPrimaryKey() {
		return new CExtStaffingCongregationPK(_organizationId,
			_cextStaffingCongregationId);
	}

	public void setPrimaryKey(CExtStaffingCongregationPK pk) {
		setOrganizationId(pk.organizationId);
		setCextStaffingCongregationId(pk.cextStaffingCongregationId);
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getCextStaffingCongregationId() {
		return _cextStaffingCongregationId;
	}

	public void setCextStaffingCongregationId(long cextStaffingCongregationId) {
		_cextStaffingCongregationId = cextStaffingCongregationId;
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

	public String getSfMinisterName() {
		return _sfMinisterName;
	}

	public void setSfMinisterName(String sfMinisterName) {
		_sfMinisterName = sfMinisterName;
	}

	public boolean getSfMinisterRetired() {
		return _sfMinisterRetired;
	}

	public boolean isSfMinisterRetired() {
		return _sfMinisterRetired;
	}

	public void setSfMinisterRetired(boolean sfMinisterRetired) {
		_sfMinisterRetired = sfMinisterRetired;
	}

	public String getSfMinisterCovenant() {
		return _sfMinisterCovenant;
	}

	public void setSfMinisterCovenant(String sfMinisterCovenant) {
		_sfMinisterCovenant = sfMinisterCovenant;
	}

	public String getSfMinistrySetting() {
		return _sfMinistrySetting;
	}

	public void setSfMinistrySetting(String sfMinistrySetting) {
		_sfMinistrySetting = sfMinistrySetting;
	}

	public String getSfMinistryRole() {
		return _sfMinistryRole;
	}

	public void setSfMinistryRole(String sfMinistryRole) {
		_sfMinistryRole = sfMinistryRole;
	}

	public double getSfPriority() {
		return _sfPriority;
	}

	public void setSfPriority(double sfPriority) {
		_sfPriority = sfPriority;
	}

	private long _organizationId;
	private long _cextStaffingCongregationId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _sfMinisterName;
	private boolean _sfMinisterRetired;
	private String _sfMinisterCovenant;
	private String _sfMinistrySetting;
	private String _sfMinistryRole;
	private double _sfPriority;
}