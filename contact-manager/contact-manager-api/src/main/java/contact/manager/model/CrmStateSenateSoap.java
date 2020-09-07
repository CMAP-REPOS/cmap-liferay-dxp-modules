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
public class CrmStateSenateSoap implements Serializable {

	public static CrmStateSenateSoap toSoapModel(CrmStateSenate model) {
		CrmStateSenateSoap soapModel = new CrmStateSenateSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCrmStateSenateId(model.getCrmStateSenateId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setNumber(model.getNumber());
		soapModel.setZipCode(model.getZipCode());

		return soapModel;
	}

	public static CrmStateSenateSoap[] toSoapModels(CrmStateSenate[] models) {
		CrmStateSenateSoap[] soapModels = new CrmStateSenateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CrmStateSenateSoap[][] toSoapModels(
		CrmStateSenate[][] models) {

		CrmStateSenateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new CrmStateSenateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CrmStateSenateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CrmStateSenateSoap[] toSoapModels(
		List<CrmStateSenate> models) {

		List<CrmStateSenateSoap> soapModels = new ArrayList<CrmStateSenateSoap>(
			models.size());

		for (CrmStateSenate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CrmStateSenateSoap[soapModels.size()]);
	}

	public CrmStateSenateSoap() {
	}

	public long getPrimaryKey() {
		return _crmStateSenateId;
	}

	public void setPrimaryKey(long pk) {
		setCrmStateSenateId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCrmStateSenateId() {
		return _crmStateSenateId;
	}

	public void setCrmStateSenateId(long crmStateSenateId) {
		_crmStateSenateId = crmStateSenateId;
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

	public String getNumber() {
		return _number;
	}

	public void setNumber(String number) {
		_number = number;
	}

	public String getZipCode() {
		return _zipCode;
	}

	public void setZipCode(String zipCode) {
		_zipCode = zipCode;
	}

	private String _uuid;
	private long _crmStateSenateId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _number;
	private String _zipCode;

}