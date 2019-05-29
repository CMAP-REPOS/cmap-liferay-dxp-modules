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

import ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK;

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
public class CExtHistoricalInformationStaffingSoap implements Serializable {
	public static CExtHistoricalInformationStaffingSoap toSoapModel(
		CExtHistoricalInformationStaffing model) {
		CExtHistoricalInformationStaffingSoap soapModel = new CExtHistoricalInformationStaffingSoap();

		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setCextHistoricalInformationStaffingId(model.getCextHistoricalInformationStaffingId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setHiMinisterName(model.getHiMinisterName());
		soapModel.setHiMinisterUCCStanding(model.isHiMinisterUCCStanding());
		soapModel.setHiMinisterStartYearOfService(model.getHiMinisterStartYearOfService());
		soapModel.setHiMinisterEndYearOfService(model.getHiMinisterEndYearOfService());
		soapModel.setHiPriority(model.getHiPriority());

		return soapModel;
	}

	public static CExtHistoricalInformationStaffingSoap[] toSoapModels(
		CExtHistoricalInformationStaffing[] models) {
		CExtHistoricalInformationStaffingSoap[] soapModels = new CExtHistoricalInformationStaffingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CExtHistoricalInformationStaffingSoap[][] toSoapModels(
		CExtHistoricalInformationStaffing[][] models) {
		CExtHistoricalInformationStaffingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CExtHistoricalInformationStaffingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CExtHistoricalInformationStaffingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CExtHistoricalInformationStaffingSoap[] toSoapModels(
		List<CExtHistoricalInformationStaffing> models) {
		List<CExtHistoricalInformationStaffingSoap> soapModels = new ArrayList<CExtHistoricalInformationStaffingSoap>(models.size());

		for (CExtHistoricalInformationStaffing model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CExtHistoricalInformationStaffingSoap[soapModels.size()]);
	}

	public CExtHistoricalInformationStaffingSoap() {
	}

	public CExtHistoricalInformationStaffingPK getPrimaryKey() {
		return new CExtHistoricalInformationStaffingPK(_organizationId,
			_cextHistoricalInformationStaffingId);
	}

	public void setPrimaryKey(CExtHistoricalInformationStaffingPK pk) {
		setOrganizationId(pk.organizationId);
		setCextHistoricalInformationStaffingId(pk.cextHistoricalInformationStaffingId);
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getCextHistoricalInformationStaffingId() {
		return _cextHistoricalInformationStaffingId;
	}

	public void setCextHistoricalInformationStaffingId(
		long cextHistoricalInformationStaffingId) {
		_cextHistoricalInformationStaffingId = cextHistoricalInformationStaffingId;
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

	public String getHiMinisterName() {
		return _hiMinisterName;
	}

	public void setHiMinisterName(String hiMinisterName) {
		_hiMinisterName = hiMinisterName;
	}

	public boolean getHiMinisterUCCStanding() {
		return _hiMinisterUCCStanding;
	}

	public boolean isHiMinisterUCCStanding() {
		return _hiMinisterUCCStanding;
	}

	public void setHiMinisterUCCStanding(boolean hiMinisterUCCStanding) {
		_hiMinisterUCCStanding = hiMinisterUCCStanding;
	}

	public int getHiMinisterStartYearOfService() {
		return _hiMinisterStartYearOfService;
	}

	public void setHiMinisterStartYearOfService(
		int hiMinisterStartYearOfService) {
		_hiMinisterStartYearOfService = hiMinisterStartYearOfService;
	}

	public int getHiMinisterEndYearOfService() {
		return _hiMinisterEndYearOfService;
	}

	public void setHiMinisterEndYearOfService(int hiMinisterEndYearOfService) {
		_hiMinisterEndYearOfService = hiMinisterEndYearOfService;
	}

	public double getHiPriority() {
		return _hiPriority;
	}

	public void setHiPriority(double hiPriority) {
		_hiPriority = hiPriority;
	}

	private long _organizationId;
	private long _cextHistoricalInformationStaffingId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _hiMinisterName;
	private boolean _hiMinisterUCCStanding;
	private int _hiMinisterStartYearOfService;
	private int _hiMinisterEndYearOfService;
	private double _hiPriority;
}