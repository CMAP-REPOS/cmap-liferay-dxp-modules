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
public class CrmContactAuditLogChangeSoap implements Serializable {
	public static CrmContactAuditLogChangeSoap toSoapModel(
		CrmContactAuditLogChange model) {
		CrmContactAuditLogChangeSoap soapModel = new CrmContactAuditLogChangeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCrmContactAuditLogChangeId(model.getCrmContactAuditLogChangeId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCrmContactAuditLogId(model.getCrmContactAuditLogId());
		soapModel.setFieldName(model.getFieldName());
		soapModel.setOldValue(model.getOldValue());
		soapModel.setNewValue(model.getNewValue());

		return soapModel;
	}

	public static CrmContactAuditLogChangeSoap[] toSoapModels(
		CrmContactAuditLogChange[] models) {
		CrmContactAuditLogChangeSoap[] soapModels = new CrmContactAuditLogChangeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CrmContactAuditLogChangeSoap[][] toSoapModels(
		CrmContactAuditLogChange[][] models) {
		CrmContactAuditLogChangeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CrmContactAuditLogChangeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CrmContactAuditLogChangeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CrmContactAuditLogChangeSoap[] toSoapModels(
		List<CrmContactAuditLogChange> models) {
		List<CrmContactAuditLogChangeSoap> soapModels = new ArrayList<CrmContactAuditLogChangeSoap>(models.size());

		for (CrmContactAuditLogChange model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CrmContactAuditLogChangeSoap[soapModels.size()]);
	}

	public CrmContactAuditLogChangeSoap() {
	}

	public long getPrimaryKey() {
		return _crmContactAuditLogChangeId;
	}

	public void setPrimaryKey(long pk) {
		setCrmContactAuditLogChangeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCrmContactAuditLogChangeId() {
		return _crmContactAuditLogChangeId;
	}

	public void setCrmContactAuditLogChangeId(long crmContactAuditLogChangeId) {
		_crmContactAuditLogChangeId = crmContactAuditLogChangeId;
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

	public long getCrmContactAuditLogId() {
		return _crmContactAuditLogId;
	}

	public void setCrmContactAuditLogId(long crmContactAuditLogId) {
		_crmContactAuditLogId = crmContactAuditLogId;
	}

	public String getFieldName() {
		return _fieldName;
	}

	public void setFieldName(String fieldName) {
		_fieldName = fieldName;
	}

	public String getOldValue() {
		return _oldValue;
	}

	public void setOldValue(String oldValue) {
		_oldValue = oldValue;
	}

	public String getNewValue() {
		return _newValue;
	}

	public void setNewValue(String newValue) {
		_newValue = newValue;
	}

	private String _uuid;
	private long _crmContactAuditLogChangeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _crmContactAuditLogId;
	private String _fieldName;
	private String _oldValue;
	private String _newValue;
}