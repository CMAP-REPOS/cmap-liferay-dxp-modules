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

import ucc.portal.service.persistence.CExtRealEstateCampaignPK;

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
public class CExtRealEstateCampaignSoap implements Serializable {
	public static CExtRealEstateCampaignSoap toSoapModel(
		CExtRealEstateCampaign model) {
		CExtRealEstateCampaignSoap soapModel = new CExtRealEstateCampaignSoap();

		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setCextRealEstateCampaignId(model.getCextRealEstateCampaignId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setReYear(model.getReYear());
		soapModel.setReUnderwayAnticipated(model.isReUnderwayAnticipated());
		soapModel.setReGoal(model.getReGoal());
		soapModel.setReResult(model.getReResult());
		soapModel.setRePurpose(model.getRePurpose());
		soapModel.setReImpact(model.getReImpact());

		return soapModel;
	}

	public static CExtRealEstateCampaignSoap[] toSoapModels(
		CExtRealEstateCampaign[] models) {
		CExtRealEstateCampaignSoap[] soapModels = new CExtRealEstateCampaignSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CExtRealEstateCampaignSoap[][] toSoapModels(
		CExtRealEstateCampaign[][] models) {
		CExtRealEstateCampaignSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CExtRealEstateCampaignSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CExtRealEstateCampaignSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CExtRealEstateCampaignSoap[] toSoapModels(
		List<CExtRealEstateCampaign> models) {
		List<CExtRealEstateCampaignSoap> soapModels = new ArrayList<CExtRealEstateCampaignSoap>(models.size());

		for (CExtRealEstateCampaign model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CExtRealEstateCampaignSoap[soapModels.size()]);
	}

	public CExtRealEstateCampaignSoap() {
	}

	public CExtRealEstateCampaignPK getPrimaryKey() {
		return new CExtRealEstateCampaignPK(_organizationId,
			_cextRealEstateCampaignId);
	}

	public void setPrimaryKey(CExtRealEstateCampaignPK pk) {
		setOrganizationId(pk.organizationId);
		setCextRealEstateCampaignId(pk.cextRealEstateCampaignId);
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getCextRealEstateCampaignId() {
		return _cextRealEstateCampaignId;
	}

	public void setCextRealEstateCampaignId(long cextRealEstateCampaignId) {
		_cextRealEstateCampaignId = cextRealEstateCampaignId;
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

	public int getReYear() {
		return _reYear;
	}

	public void setReYear(int reYear) {
		_reYear = reYear;
	}

	public boolean getReUnderwayAnticipated() {
		return _reUnderwayAnticipated;
	}

	public boolean isReUnderwayAnticipated() {
		return _reUnderwayAnticipated;
	}

	public void setReUnderwayAnticipated(boolean reUnderwayAnticipated) {
		_reUnderwayAnticipated = reUnderwayAnticipated;
	}

	public int getReGoal() {
		return _reGoal;
	}

	public void setReGoal(int reGoal) {
		_reGoal = reGoal;
	}

	public int getReResult() {
		return _reResult;
	}

	public void setReResult(int reResult) {
		_reResult = reResult;
	}

	public String getRePurpose() {
		return _rePurpose;
	}

	public void setRePurpose(String rePurpose) {
		_rePurpose = rePurpose;
	}

	public String getReImpact() {
		return _reImpact;
	}

	public void setReImpact(String reImpact) {
		_reImpact = reImpact;
	}

	private long _organizationId;
	private long _cextRealEstateCampaignId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private int _reYear;
	private boolean _reUnderwayAnticipated;
	private int _reGoal;
	private int _reResult;
	private String _rePurpose;
	private String _reImpact;
}