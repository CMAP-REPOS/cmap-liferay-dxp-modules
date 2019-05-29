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

import ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK;

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
public class CExtChurchFinancesIncomeOtherSoap implements Serializable {
	public static CExtChurchFinancesIncomeOtherSoap toSoapModel(
		CExtChurchFinancesIncomeOther model) {
		CExtChurchFinancesIncomeOtherSoap soapModel = new CExtChurchFinancesIncomeOtherSoap();

		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setCextChurchFinancesIncomeOtherId(model.getCextChurchFinancesIncomeOtherId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFnIncomeOther(model.getFnIncomeOther());
		soapModel.setFnIncomeOtherDescription(model.getFnIncomeOtherDescription());
		soapModel.setFnPriority(model.getFnPriority());

		return soapModel;
	}

	public static CExtChurchFinancesIncomeOtherSoap[] toSoapModels(
		CExtChurchFinancesIncomeOther[] models) {
		CExtChurchFinancesIncomeOtherSoap[] soapModels = new CExtChurchFinancesIncomeOtherSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CExtChurchFinancesIncomeOtherSoap[][] toSoapModels(
		CExtChurchFinancesIncomeOther[][] models) {
		CExtChurchFinancesIncomeOtherSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CExtChurchFinancesIncomeOtherSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CExtChurchFinancesIncomeOtherSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CExtChurchFinancesIncomeOtherSoap[] toSoapModels(
		List<CExtChurchFinancesIncomeOther> models) {
		List<CExtChurchFinancesIncomeOtherSoap> soapModels = new ArrayList<CExtChurchFinancesIncomeOtherSoap>(models.size());

		for (CExtChurchFinancesIncomeOther model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CExtChurchFinancesIncomeOtherSoap[soapModels.size()]);
	}

	public CExtChurchFinancesIncomeOtherSoap() {
	}

	public CExtChurchFinancesIncomeOtherPK getPrimaryKey() {
		return new CExtChurchFinancesIncomeOtherPK(_organizationId,
			_cextChurchFinancesIncomeOtherId);
	}

	public void setPrimaryKey(CExtChurchFinancesIncomeOtherPK pk) {
		setOrganizationId(pk.organizationId);
		setCextChurchFinancesIncomeOtherId(pk.cextChurchFinancesIncomeOtherId);
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getCextChurchFinancesIncomeOtherId() {
		return _cextChurchFinancesIncomeOtherId;
	}

	public void setCextChurchFinancesIncomeOtherId(
		long cextChurchFinancesIncomeOtherId) {
		_cextChurchFinancesIncomeOtherId = cextChurchFinancesIncomeOtherId;
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

	public int getFnIncomeOther() {
		return _fnIncomeOther;
	}

	public void setFnIncomeOther(int fnIncomeOther) {
		_fnIncomeOther = fnIncomeOther;
	}

	public String getFnIncomeOtherDescription() {
		return _fnIncomeOtherDescription;
	}

	public void setFnIncomeOtherDescription(String fnIncomeOtherDescription) {
		_fnIncomeOtherDescription = fnIncomeOtherDescription;
	}

	public double getFnPriority() {
		return _fnPriority;
	}

	public void setFnPriority(double fnPriority) {
		_fnPriority = fnPriority;
	}

	private long _organizationId;
	private long _cextChurchFinancesIncomeOtherId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private int _fnIncomeOther;
	private String _fnIncomeOtherDescription;
	private double _fnPriority;
}