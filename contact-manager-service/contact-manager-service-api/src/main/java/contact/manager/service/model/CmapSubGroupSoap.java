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
public class CmapSubGroupSoap implements Serializable {
	public static CmapSubGroupSoap toSoapModel(CmapSubGroup model) {
		CmapSubGroupSoap soapModel = new CmapSubGroupSoap();

		soapModel.setSubGroupId(model.getSubGroupId());
		soapModel.setSubGroupName(model.getSubGroupName());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static CmapSubGroupSoap[] toSoapModels(CmapSubGroup[] models) {
		CmapSubGroupSoap[] soapModels = new CmapSubGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CmapSubGroupSoap[][] toSoapModels(CmapSubGroup[][] models) {
		CmapSubGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CmapSubGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CmapSubGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CmapSubGroupSoap[] toSoapModels(List<CmapSubGroup> models) {
		List<CmapSubGroupSoap> soapModels = new ArrayList<CmapSubGroupSoap>(models.size());

		for (CmapSubGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CmapSubGroupSoap[soapModels.size()]);
	}

	public CmapSubGroupSoap() {
	}

	public long getPrimaryKey() {
		return _subGroupId;
	}

	public void setPrimaryKey(long pk) {
		setSubGroupId(pk);
	}

	public long getSubGroupId() {
		return _subGroupId;
	}

	public void setSubGroupId(long subGroupId) {
		_subGroupId = subGroupId;
	}

	public String getSubGroupName() {
		return _subGroupName;
	}

	public void setSubGroupName(String subGroupName) {
		_subGroupName = subGroupName;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
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

	private long _subGroupId;
	private String _subGroupName;
	private long _groupId;
	private Date _createDate;
	private Date _modifiedDate;
}