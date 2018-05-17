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
public class CrmContactSoap implements Serializable {
	public static CrmContactSoap toSoapModel(CrmContact model) {
		CrmContactSoap soapModel = new CrmContactSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCrmContactId(model.getCrmContactId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static CrmContactSoap[] toSoapModels(CrmContact[] models) {
		CrmContactSoap[] soapModels = new CrmContactSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CrmContactSoap[][] toSoapModels(CrmContact[][] models) {
		CrmContactSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CrmContactSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CrmContactSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CrmContactSoap[] toSoapModels(List<CrmContact> models) {
		List<CrmContactSoap> soapModels = new ArrayList<CrmContactSoap>(models.size());

		for (CrmContact model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CrmContactSoap[soapModels.size()]);
	}

	public CrmContactSoap() {
	}

	public long getPrimaryKey() {
		return _crmContactId;
	}

	public void setPrimaryKey(long pk) {
		setCrmContactId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCrmContactId() {
		return _crmContactId;
	}

	public void setCrmContactId(long crmContactId) {
		_crmContactId = crmContactId;
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

	private String _uuid;
	private long _crmContactId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
}