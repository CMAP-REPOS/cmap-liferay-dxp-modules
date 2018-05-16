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
public class CmapGroupSoap implements Serializable {
	public static CmapGroupSoap toSoapModel(CmapGroup model) {
		CmapGroupSoap soapModel = new CmapGroupSoap();

		soapModel.setGroupId(model.getGroupId());
		soapModel.setGroupName(model.getGroupName());

		return soapModel;
	}

	public static CmapGroupSoap[] toSoapModels(CmapGroup[] models) {
		CmapGroupSoap[] soapModels = new CmapGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CmapGroupSoap[][] toSoapModels(CmapGroup[][] models) {
		CmapGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CmapGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CmapGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CmapGroupSoap[] toSoapModels(List<CmapGroup> models) {
		List<CmapGroupSoap> soapModels = new ArrayList<CmapGroupSoap>(models.size());

		for (CmapGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CmapGroupSoap[soapModels.size()]);
	}

	public CmapGroupSoap() {
	}

	public long getPrimaryKey() {
		return _groupId;
	}

	public void setPrimaryKey(long pk) {
		setGroupId(pk);
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getGroupName() {
		return _groupName;
	}

	public void setGroupName(String groupName) {
		_groupName = groupName;
	}

	private long _groupId;
	private String _groupName;
}