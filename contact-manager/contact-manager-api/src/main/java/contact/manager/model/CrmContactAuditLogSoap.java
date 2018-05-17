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

package contact.manager.model;

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
public class CrmContactAuditLogSoap implements Serializable {
	public static CrmContactAuditLogSoap toSoapModel(CrmContactAuditLog model) {
		CrmContactAuditLogSoap soapModel = new CrmContactAuditLogSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCrmContactAuditLogId(model.getCrmContactAuditLogId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCrmContactId(model.getCrmContactId());
		soapModel.setConstantContactId(model.getConstantContactId());
		soapModel.setOldSnapshot(model.getOldSnapshot());
		soapModel.setNewSnapshot(model.getNewSnapshot());

		return soapModel;
	}

	public static CrmContactAuditLogSoap[] toSoapModels(
		CrmContactAuditLog[] models) {
		CrmContactAuditLogSoap[] soapModels = new CrmContactAuditLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CrmContactAuditLogSoap[][] toSoapModels(
		CrmContactAuditLog[][] models) {
		CrmContactAuditLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CrmContactAuditLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CrmContactAuditLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CrmContactAuditLogSoap[] toSoapModels(
		List<CrmContactAuditLog> models) {
		List<CrmContactAuditLogSoap> soapModels = new ArrayList<CrmContactAuditLogSoap>(models.size());

		for (CrmContactAuditLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CrmContactAuditLogSoap[soapModels.size()]);
	}

	public CrmContactAuditLogSoap() {
	}

	public long getPrimaryKey() {
		return _crmContactAuditLogId;
	}

	public void setPrimaryKey(long pk) {
		setCrmContactAuditLogId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCrmContactAuditLogId() {
		return _crmContactAuditLogId;
	}

	public void setCrmContactAuditLogId(long crmContactAuditLogId) {
		_crmContactAuditLogId = crmContactAuditLogId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
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

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
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

	public long getCrmContactId() {
		return _crmContactId;
	}

	public void setCrmContactId(long crmContactId) {
		_crmContactId = crmContactId;
	}

	public long getConstantContactId() {
		return _constantContactId;
	}

	public void setConstantContactId(long constantContactId) {
		_constantContactId = constantContactId;
	}

	public String getOldSnapshot() {
		return _oldSnapshot;
	}

	public void setOldSnapshot(String oldSnapshot) {
		_oldSnapshot = oldSnapshot;
	}

	public String getNewSnapshot() {
		return _newSnapshot;
	}

	public void setNewSnapshot(String newSnapshot) {
		_newSnapshot = newSnapshot;
	}

	private String _uuid;
	private long _crmContactAuditLogId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _crmContactId;
	private long _constantContactId;
	private String _oldSnapshot;
	private String _newSnapshot;
}