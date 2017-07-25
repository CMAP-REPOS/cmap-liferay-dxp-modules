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

package com.cmap.services.custom.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.cmap.services.custom.service.http.UtilServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.cmap.services.custom.service.http.UtilServiceSoap
 * @generated
 */
@ProviderType
public class UtilSoap implements Serializable {
	public static UtilSoap toSoapModel(Util model) {
		UtilSoap soapModel = new UtilSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setUtilId(model.getUtilId());

		return soapModel;
	}

	public static UtilSoap[] toSoapModels(Util[] models) {
		UtilSoap[] soapModels = new UtilSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UtilSoap[][] toSoapModels(Util[][] models) {
		UtilSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UtilSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UtilSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UtilSoap[] toSoapModels(List<Util> models) {
		List<UtilSoap> soapModels = new ArrayList<UtilSoap>(models.size());

		for (Util model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UtilSoap[soapModels.size()]);
	}

	public UtilSoap() {
	}

	public long getPrimaryKey() {
		return _utilId;
	}

	public void setPrimaryKey(long pk) {
		setUtilId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getUtilId() {
		return _utilId;
	}

	public void setUtilId(long utilId) {
		_utilId = utilId;
	}

	private String _uuid;
	private long _utilId;
}