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

import ucc.portal.service.persistence.CExtParticipationOtherPK;

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
public class CExtParticipationOtherSoap implements Serializable {
	public static CExtParticipationOtherSoap toSoapModel(
		CExtParticipationOther model) {
		CExtParticipationOtherSoap soapModel = new CExtParticipationOtherSoap();

		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setCextParticipationOtherId(model.getCextParticipationOtherId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPpGathering(model.getPpGathering());
		soapModel.setPpCount(model.getPpCount());
		soapModel.setPpLay(model.isPpLay());
		soapModel.setPpPastor(model.isPpPastor());
		soapModel.setPpStaff(model.isPpStaff());
		soapModel.setPpOther(model.isPpOther());
		soapModel.setPpAdditionalInformation(model.getPpAdditionalInformation());
		soapModel.setPpPriority(model.getPpPriority());

		return soapModel;
	}

	public static CExtParticipationOtherSoap[] toSoapModels(
		CExtParticipationOther[] models) {
		CExtParticipationOtherSoap[] soapModels = new CExtParticipationOtherSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CExtParticipationOtherSoap[][] toSoapModels(
		CExtParticipationOther[][] models) {
		CExtParticipationOtherSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CExtParticipationOtherSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CExtParticipationOtherSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CExtParticipationOtherSoap[] toSoapModels(
		List<CExtParticipationOther> models) {
		List<CExtParticipationOtherSoap> soapModels = new ArrayList<CExtParticipationOtherSoap>(models.size());

		for (CExtParticipationOther model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CExtParticipationOtherSoap[soapModels.size()]);
	}

	public CExtParticipationOtherSoap() {
	}

	public CExtParticipationOtherPK getPrimaryKey() {
		return new CExtParticipationOtherPK(_organizationId,
			_cextParticipationOtherId);
	}

	public void setPrimaryKey(CExtParticipationOtherPK pk) {
		setOrganizationId(pk.organizationId);
		setCextParticipationOtherId(pk.cextParticipationOtherId);
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getCextParticipationOtherId() {
		return _cextParticipationOtherId;
	}

	public void setCextParticipationOtherId(long cextParticipationOtherId) {
		_cextParticipationOtherId = cextParticipationOtherId;
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

	public String getPpGathering() {
		return _ppGathering;
	}

	public void setPpGathering(String ppGathering) {
		_ppGathering = ppGathering;
	}

	public int getPpCount() {
		return _ppCount;
	}

	public void setPpCount(int ppCount) {
		_ppCount = ppCount;
	}

	public boolean getPpLay() {
		return _ppLay;
	}

	public boolean isPpLay() {
		return _ppLay;
	}

	public void setPpLay(boolean ppLay) {
		_ppLay = ppLay;
	}

	public boolean getPpPastor() {
		return _ppPastor;
	}

	public boolean isPpPastor() {
		return _ppPastor;
	}

	public void setPpPastor(boolean ppPastor) {
		_ppPastor = ppPastor;
	}

	public boolean getPpStaff() {
		return _ppStaff;
	}

	public boolean isPpStaff() {
		return _ppStaff;
	}

	public void setPpStaff(boolean ppStaff) {
		_ppStaff = ppStaff;
	}

	public boolean getPpOther() {
		return _ppOther;
	}

	public boolean isPpOther() {
		return _ppOther;
	}

	public void setPpOther(boolean ppOther) {
		_ppOther = ppOther;
	}

	public String getPpAdditionalInformation() {
		return _ppAdditionalInformation;
	}

	public void setPpAdditionalInformation(String ppAdditionalInformation) {
		_ppAdditionalInformation = ppAdditionalInformation;
	}

	public double getPpPriority() {
		return _ppPriority;
	}

	public void setPpPriority(double ppPriority) {
		_ppPriority = ppPriority;
	}

	private long _organizationId;
	private long _cextParticipationOtherId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ppGathering;
	private int _ppCount;
	private boolean _ppLay;
	private boolean _ppPastor;
	private boolean _ppStaff;
	private boolean _ppOther;
	private String _ppAdditionalInformation;
	private double _ppPriority;
}