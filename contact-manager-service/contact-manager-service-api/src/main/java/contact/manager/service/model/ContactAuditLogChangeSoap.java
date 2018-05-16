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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ContactAuditLogChangeSoap implements Serializable {
	public static ContactAuditLogChangeSoap toSoapModel(
		ContactAuditLogChange model) {
		ContactAuditLogChangeSoap soapModel = new ContactAuditLogChangeSoap();

		soapModel.setContactAuditLogChangeId(model.getContactAuditLogChangeId());
		soapModel.setContactAuditLogId(model.getContactAuditLogId());
		soapModel.setFieldName(model.getFieldName());
		soapModel.setOldValue(model.getOldValue());
		soapModel.setNewValue(model.getNewValue());

		return soapModel;
	}

	public static ContactAuditLogChangeSoap[] toSoapModels(
		ContactAuditLogChange[] models) {
		ContactAuditLogChangeSoap[] soapModels = new ContactAuditLogChangeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ContactAuditLogChangeSoap[][] toSoapModels(
		ContactAuditLogChange[][] models) {
		ContactAuditLogChangeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ContactAuditLogChangeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ContactAuditLogChangeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ContactAuditLogChangeSoap[] toSoapModels(
		List<ContactAuditLogChange> models) {
		List<ContactAuditLogChangeSoap> soapModels = new ArrayList<ContactAuditLogChangeSoap>(models.size());

		for (ContactAuditLogChange model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ContactAuditLogChangeSoap[soapModels.size()]);
	}

	public ContactAuditLogChangeSoap() {
	}

	public long getPrimaryKey() {
		return _contactAuditLogChangeId;
	}

	public void setPrimaryKey(long pk) {
		setContactAuditLogChangeId(pk);
	}

	public long getContactAuditLogChangeId() {
		return _contactAuditLogChangeId;
	}

	public void setContactAuditLogChangeId(long contactAuditLogChangeId) {
		_contactAuditLogChangeId = contactAuditLogChangeId;
	}

	public long getContactAuditLogId() {
		return _contactAuditLogId;
	}

	public void setContactAuditLogId(long contactAuditLogId) {
		_contactAuditLogId = contactAuditLogId;
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

	private long _contactAuditLogChangeId;
	private long _contactAuditLogId;
	private String _fieldName;
	private String _oldValue;
	private String _newValue;
}