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
public class CrmKioskContactSoap implements Serializable {
	public static CrmKioskContactSoap toSoapModel(CrmKioskContact model) {
		CrmKioskContactSoap soapModel = new CrmKioskContactSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCrmKioskContactId(model.getCrmKioskContactId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static CrmKioskContactSoap[] toSoapModels(CrmKioskContact[] models) {
		CrmKioskContactSoap[] soapModels = new CrmKioskContactSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CrmKioskContactSoap[][] toSoapModels(
		CrmKioskContact[][] models) {
		CrmKioskContactSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CrmKioskContactSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CrmKioskContactSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CrmKioskContactSoap[] toSoapModels(
		List<CrmKioskContact> models) {
		List<CrmKioskContactSoap> soapModels = new ArrayList<CrmKioskContactSoap>(models.size());

		for (CrmKioskContact model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CrmKioskContactSoap[soapModels.size()]);
	}

	public CrmKioskContactSoap() {
	}

	public long getPrimaryKey() {
		return _crmKioskContactId;
	}

	public void setPrimaryKey(long pk) {
		setCrmKioskContactId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCrmKioskContactId() {
		return _crmKioskContactId;
	}

	public void setCrmKioskContactId(long crmKioskContactId) {
		_crmKioskContactId = crmKioskContactId;
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
	private long _crmKioskContactId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
}