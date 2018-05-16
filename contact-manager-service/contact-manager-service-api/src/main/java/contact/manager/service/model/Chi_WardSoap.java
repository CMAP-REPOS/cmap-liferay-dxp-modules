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
public class Chi_WardSoap implements Serializable {
	public static Chi_WardSoap toSoapModel(Chi_Ward model) {
		Chi_WardSoap soapModel = new Chi_WardSoap();

		soapModel.setChiWardId(model.getChiWardId());
		soapModel.setChiWardName(model.getChiWardName());
		soapModel.setZipCode(model.getZipCode());

		return soapModel;
	}

	public static Chi_WardSoap[] toSoapModels(Chi_Ward[] models) {
		Chi_WardSoap[] soapModels = new Chi_WardSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Chi_WardSoap[][] toSoapModels(Chi_Ward[][] models) {
		Chi_WardSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Chi_WardSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Chi_WardSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Chi_WardSoap[] toSoapModels(List<Chi_Ward> models) {
		List<Chi_WardSoap> soapModels = new ArrayList<Chi_WardSoap>(models.size());

		for (Chi_Ward model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Chi_WardSoap[soapModels.size()]);
	}

	public Chi_WardSoap() {
	}

	public long getPrimaryKey() {
		return _chiWardId;
	}

	public void setPrimaryKey(long pk) {
		setChiWardId(pk);
	}

	public long getChiWardId() {
		return _chiWardId;
	}

	public void setChiWardId(long chiWardId) {
		_chiWardId = chiWardId;
	}

	public String getChiWardName() {
		return _chiWardName;
	}

	public void setChiWardName(String chiWardName) {
		_chiWardName = chiWardName;
	}

	public String getZipCode() {
		return _zipCode;
	}

	public void setZipCode(String zipCode) {
		_zipCode = zipCode;
	}

	private long _chiWardId;
	private String _chiWardName;
	private String _zipCode;
}