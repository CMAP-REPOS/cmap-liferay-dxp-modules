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
public class CountySoap implements Serializable {
	public static CountySoap toSoapModel(County model) {
		CountySoap soapModel = new CountySoap();

		soapModel.setCountyId(model.getCountyId());
		soapModel.setCountyName(model.getCountyName());
		soapModel.setZipCode(model.getZipCode());

		return soapModel;
	}

	public static CountySoap[] toSoapModels(County[] models) {
		CountySoap[] soapModels = new CountySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CountySoap[][] toSoapModels(County[][] models) {
		CountySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CountySoap[models.length][models[0].length];
		}
		else {
			soapModels = new CountySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CountySoap[] toSoapModels(List<County> models) {
		List<CountySoap> soapModels = new ArrayList<CountySoap>(models.size());

		for (County model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CountySoap[soapModels.size()]);
	}

	public CountySoap() {
	}

	public long getPrimaryKey() {
		return _countyId;
	}

	public void setPrimaryKey(long pk) {
		setCountyId(pk);
	}

	public long getCountyId() {
		return _countyId;
	}

	public void setCountyId(long countyId) {
		_countyId = countyId;
	}

	public String getCountyName() {
		return _countyName;
	}

	public void setCountyName(String countyName) {
		_countyName = countyName;
	}

	public String getZipCode() {
		return _zipCode;
	}

	public void setZipCode(String zipCode) {
		_zipCode = zipCode;
	}

	private long _countyId;
	private String _countyName;
	private String _zipCode;
}