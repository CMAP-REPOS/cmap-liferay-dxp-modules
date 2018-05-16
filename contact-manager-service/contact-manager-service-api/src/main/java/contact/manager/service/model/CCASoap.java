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
public class CCASoap implements Serializable {
	public static CCASoap toSoapModel(CCA model) {
		CCASoap soapModel = new CCASoap();

		soapModel.setCcaId(model.getCcaId());
		soapModel.setCcaName(model.getCcaName());
		soapModel.setZipCode(model.getZipCode());

		return soapModel;
	}

	public static CCASoap[] toSoapModels(CCA[] models) {
		CCASoap[] soapModels = new CCASoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CCASoap[][] toSoapModels(CCA[][] models) {
		CCASoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CCASoap[models.length][models[0].length];
		}
		else {
			soapModels = new CCASoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CCASoap[] toSoapModels(List<CCA> models) {
		List<CCASoap> soapModels = new ArrayList<CCASoap>(models.size());

		for (CCA model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CCASoap[soapModels.size()]);
	}

	public CCASoap() {
	}

	public long getPrimaryKey() {
		return _ccaId;
	}

	public void setPrimaryKey(long pk) {
		setCcaId(pk);
	}

	public long getCcaId() {
		return _ccaId;
	}

	public void setCcaId(long ccaId) {
		_ccaId = ccaId;
	}

	public String getCcaName() {
		return _ccaName;
	}

	public void setCcaName(String ccaName) {
		_ccaName = ccaName;
	}

	public String getZipCode() {
		return _zipCode;
	}

	public void setZipCode(String zipCode) {
		_zipCode = zipCode;
	}

	private long _ccaId;
	private String _ccaName;
	private String _zipCode;
}