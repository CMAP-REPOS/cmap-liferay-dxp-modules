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

package contact.manager.service.model;

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
public class ContactAuditLogSoap implements Serializable {
	public static ContactAuditLogSoap toSoapModel(ContactAuditLog model) {
		ContactAuditLogSoap soapModel = new ContactAuditLogSoap();

		soapModel.setContactAuditLogId(model.getContactAuditLogId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setAction(model.getAction());
		soapModel.setConstantContactId(model.getConstantContactId());
		soapModel.setOldSnapshot(model.getOldSnapshot());
		soapModel.setNewSnapshot(model.getNewSnapshot());
		soapModel.setContactId(model.getContactId());

		return soapModel;
	}

	public static ContactAuditLogSoap[] toSoapModels(ContactAuditLog[] models) {
		ContactAuditLogSoap[] soapModels = new ContactAuditLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ContactAuditLogSoap[][] toSoapModels(
		ContactAuditLog[][] models) {
		ContactAuditLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ContactAuditLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ContactAuditLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ContactAuditLogSoap[] toSoapModels(
		List<ContactAuditLog> models) {
		List<ContactAuditLogSoap> soapModels = new ArrayList<ContactAuditLogSoap>(models.size());

		for (ContactAuditLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ContactAuditLogSoap[soapModels.size()]);
	}

	public ContactAuditLogSoap() {
	}

	public long getPrimaryKey() {
		return _contactAuditLogId;
	}

	public void setPrimaryKey(long pk) {
		setContactAuditLogId(pk);
	}

	public long getContactAuditLogId() {
		return _contactAuditLogId;
	}

	public void setContactAuditLogId(long contactAuditLogId) {
		_contactAuditLogId = contactAuditLogId;
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

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getAction() {
		return _action;
	}

	public void setAction(String action) {
		_action = action;
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

	public long getContactId() {
		return _contactId;
	}

	public void setContactId(long contactId) {
		_contactId = contactId;
	}

	private long _contactAuditLogId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private String _action;
	private long _constantContactId;
	private String _oldSnapshot;
	private String _newSnapshot;
	private long _contactId;
}