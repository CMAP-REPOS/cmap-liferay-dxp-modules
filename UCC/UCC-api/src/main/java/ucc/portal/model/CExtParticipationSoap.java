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

import ucc.portal.service.persistence.CExtParticipationPK;

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
public class CExtParticipationSoap implements Serializable {
	public static CExtParticipationSoap toSoapModel(CExtParticipation model) {
		CExtParticipationSoap soapModel = new CExtParticipationSoap();

		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setCextParticipationId(model.getCextParticipationId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPpGatheringId(model.getPpGatheringId());
		soapModel.setPpGatheringKey(model.getPpGatheringKey());
		soapModel.setPpCount(model.getPpCount());
		soapModel.setPpLay(model.isPpLay());
		soapModel.setPpPastor(model.isPpPastor());
		soapModel.setPpStaff(model.isPpStaff());
		soapModel.setPpOther(model.isPpOther());
		soapModel.setPpGatheringAdditionalKey(model.getPpGatheringAdditionalKey());
		soapModel.setPpGatheringAdditionalType(model.getPpGatheringAdditionalType());
		soapModel.setPpAdditionalInformation(model.getPpAdditionalInformation());
		soapModel.setPpPriority(model.getPpPriority());

		return soapModel;
	}

	public static CExtParticipationSoap[] toSoapModels(
		CExtParticipation[] models) {
		CExtParticipationSoap[] soapModels = new CExtParticipationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CExtParticipationSoap[][] toSoapModels(
		CExtParticipation[][] models) {
		CExtParticipationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CExtParticipationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CExtParticipationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CExtParticipationSoap[] toSoapModels(
		List<CExtParticipation> models) {
		List<CExtParticipationSoap> soapModels = new ArrayList<CExtParticipationSoap>(models.size());

		for (CExtParticipation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CExtParticipationSoap[soapModels.size()]);
	}

	public CExtParticipationSoap() {
	}

	public CExtParticipationPK getPrimaryKey() {
		return new CExtParticipationPK(_organizationId, _cextParticipationId);
	}

	public void setPrimaryKey(CExtParticipationPK pk) {
		setOrganizationId(pk.organizationId);
		setCextParticipationId(pk.cextParticipationId);
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getCextParticipationId() {
		return _cextParticipationId;
	}

	public void setCextParticipationId(long cextParticipationId) {
		_cextParticipationId = cextParticipationId;
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

	public String getPpGatheringId() {
		return _ppGatheringId;
	}

	public void setPpGatheringId(String ppGatheringId) {
		_ppGatheringId = ppGatheringId;
	}

	public String getPpGatheringKey() {
		return _ppGatheringKey;
	}

	public void setPpGatheringKey(String ppGatheringKey) {
		_ppGatheringKey = ppGatheringKey;
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

	public String getPpGatheringAdditionalKey() {
		return _ppGatheringAdditionalKey;
	}

	public void setPpGatheringAdditionalKey(String ppGatheringAdditionalKey) {
		_ppGatheringAdditionalKey = ppGatheringAdditionalKey;
	}

	public String getPpGatheringAdditionalType() {
		return _ppGatheringAdditionalType;
	}

	public void setPpGatheringAdditionalType(String ppGatheringAdditionalType) {
		_ppGatheringAdditionalType = ppGatheringAdditionalType;
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
	private long _cextParticipationId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ppGatheringId;
	private String _ppGatheringKey;
	private int _ppCount;
	private boolean _ppLay;
	private boolean _ppPastor;
	private boolean _ppStaff;
	private boolean _ppOther;
	private String _ppGatheringAdditionalKey;
	private String _ppGatheringAdditionalType;
	private String _ppAdditionalInformation;
	private double _ppPriority;
}