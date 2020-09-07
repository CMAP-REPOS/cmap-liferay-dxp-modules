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
public class CrmTagSoap implements Serializable {

	public static CrmTagSoap toSoapModel(CrmTag model) {
		CrmTagSoap soapModel = new CrmTagSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCrmTagId(model.getCrmTagId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static CrmTagSoap[] toSoapModels(CrmTag[] models) {
		CrmTagSoap[] soapModels = new CrmTagSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CrmTagSoap[][] toSoapModels(CrmTag[][] models) {
		CrmTagSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CrmTagSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CrmTagSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CrmTagSoap[] toSoapModels(List<CrmTag> models) {
		List<CrmTagSoap> soapModels = new ArrayList<CrmTagSoap>(models.size());

		for (CrmTag model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CrmTagSoap[soapModels.size()]);
	}

	public CrmTagSoap() {
	}

	public long getPrimaryKey() {
		return _crmTagId;
	}

	public void setPrimaryKey(long pk) {
		setCrmTagId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCrmTagId() {
		return _crmTagId;
	}

	public void setCrmTagId(long crmTagId) {
		_crmTagId = crmTagId;
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private String _uuid;
	private long _crmTagId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;

}