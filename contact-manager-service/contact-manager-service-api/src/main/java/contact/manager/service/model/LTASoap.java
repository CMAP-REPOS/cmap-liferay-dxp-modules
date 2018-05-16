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
public class LTASoap implements Serializable {
	public static LTASoap toSoapModel(LTA model) {
		LTASoap soapModel = new LTASoap();

		soapModel.setLtaId(model.getLtaId());
		soapModel.setLtaName(model.getLtaName());
		soapModel.setZipCode(model.getZipCode());

		return soapModel;
	}

	public static LTASoap[] toSoapModels(LTA[] models) {
		LTASoap[] soapModels = new LTASoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LTASoap[][] toSoapModels(LTA[][] models) {
		LTASoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LTASoap[models.length][models[0].length];
		}
		else {
			soapModels = new LTASoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LTASoap[] toSoapModels(List<LTA> models) {
		List<LTASoap> soapModels = new ArrayList<LTASoap>(models.size());

		for (LTA model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LTASoap[soapModels.size()]);
	}

	public LTASoap() {
	}

	public long getPrimaryKey() {
		return _ltaId;
	}

	public void setPrimaryKey(long pk) {
		setLtaId(pk);
	}

	public long getLtaId() {
		return _ltaId;
	}

	public void setLtaId(long ltaId) {
		_ltaId = ltaId;
	}

	public String getLtaName() {
		return _ltaName;
	}

	public void setLtaName(String ltaName) {
		_ltaName = ltaName;
	}

	public String getZipCode() {
		return _zipCode;
	}

	public void setZipCode(String zipCode) {
		_zipCode = zipCode;
	}

	private long _ltaId;
	private String _ltaName;
	private String _zipCode;
}