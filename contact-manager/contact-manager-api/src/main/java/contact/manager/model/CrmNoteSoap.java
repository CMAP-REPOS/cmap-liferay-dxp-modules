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
 * This class is used by SOAP remote services, specifically {@link contact.manager.service.http.CrmNoteServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.http.CrmNoteServiceSoap
 * @generated
 */
@ProviderType
public class CrmNoteSoap implements Serializable {
	public static CrmNoteSoap toSoapModel(CrmNote model) {
		CrmNoteSoap soapModel = new CrmNoteSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCrmNoteId(model.getCrmNoteId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCrmContactId(model.getCrmContactId());
		soapModel.setNote(model.getNote());

		return soapModel;
	}

	public static CrmNoteSoap[] toSoapModels(CrmNote[] models) {
		CrmNoteSoap[] soapModels = new CrmNoteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CrmNoteSoap[][] toSoapModels(CrmNote[][] models) {
		CrmNoteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CrmNoteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CrmNoteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CrmNoteSoap[] toSoapModels(List<CrmNote> models) {
		List<CrmNoteSoap> soapModels = new ArrayList<CrmNoteSoap>(models.size());

		for (CrmNote model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CrmNoteSoap[soapModels.size()]);
	}

	public CrmNoteSoap() {
	}

	public long getPrimaryKey() {
		return _crmNoteId;
	}

	public void setPrimaryKey(long pk) {
		setCrmNoteId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCrmNoteId() {
		return _crmNoteId;
	}

	public void setCrmNoteId(long crmNoteId) {
		_crmNoteId = crmNoteId;
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

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	private String _uuid;
	private long _crmNoteId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _crmContactId;
	private String _note;
}