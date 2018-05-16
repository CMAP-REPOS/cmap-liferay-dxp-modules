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
public class NoteSoap implements Serializable {
	public static NoteSoap toSoapModel(Note model) {
		NoteSoap soapModel = new NoteSoap();

		soapModel.setId(model.getId());
		soapModel.setContactId(model.getContactId());
		soapModel.setUserId(model.getUserId());
		soapModel.setNote(model.getNote());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static NoteSoap[] toSoapModels(Note[] models) {
		NoteSoap[] soapModels = new NoteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NoteSoap[][] toSoapModels(Note[][] models) {
		NoteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NoteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NoteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NoteSoap[] toSoapModels(List<Note> models) {
		List<NoteSoap> soapModels = new ArrayList<NoteSoap>(models.size());

		for (Note model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NoteSoap[soapModels.size()]);
	}

	public NoteSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getContactId() {
		return _contactId;
	}

	public void setContactId(long contactId) {
		_contactId = contactId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
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

	private long _id;
	private long _contactId;
	private long _userId;
	private String _note;
	private Date _createDate;
	private Date _modifiedDate;
}