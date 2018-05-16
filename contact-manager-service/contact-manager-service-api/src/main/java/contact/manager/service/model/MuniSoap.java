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
public class MuniSoap implements Serializable {
	public static MuniSoap toSoapModel(Muni model) {
		MuniSoap soapModel = new MuniSoap();

		soapModel.setMuniId(model.getMuniId());
		soapModel.setMuniName(model.getMuniName());
		soapModel.setZipCode(model.getZipCode());

		return soapModel;
	}

	public static MuniSoap[] toSoapModels(Muni[] models) {
		MuniSoap[] soapModels = new MuniSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MuniSoap[][] toSoapModels(Muni[][] models) {
		MuniSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MuniSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MuniSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MuniSoap[] toSoapModels(List<Muni> models) {
		List<MuniSoap> soapModels = new ArrayList<MuniSoap>(models.size());

		for (Muni model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MuniSoap[soapModels.size()]);
	}

	public MuniSoap() {
	}

	public long getPrimaryKey() {
		return _muniId;
	}

	public void setPrimaryKey(long pk) {
		setMuniId(pk);
	}

	public long getMuniId() {
		return _muniId;
	}

	public void setMuniId(long muniId) {
		_muniId = muniId;
	}

	public String getMuniName() {
		return _muniName;
	}

	public void setMuniName(String muniName) {
		_muniName = muniName;
	}

	public String getZipCode() {
		return _zipCode;
	}

	public void setZipCode(String zipCode) {
		_zipCode = zipCode;
	}

	private long _muniId;
	private String _muniName;
	private String _zipCode;
}