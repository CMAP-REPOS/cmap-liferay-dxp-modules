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
public class US_RepSoap implements Serializable {
	public static US_RepSoap toSoapModel(US_Rep model) {
		US_RepSoap soapModel = new US_RepSoap();

		soapModel.setUsRepId(model.getUsRepId());
		soapModel.setUsRepNumber(model.getUsRepNumber());
		soapModel.setUsRepName(model.getUsRepName());
		soapModel.setZipCode(model.getZipCode());

		return soapModel;
	}

	public static US_RepSoap[] toSoapModels(US_Rep[] models) {
		US_RepSoap[] soapModels = new US_RepSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static US_RepSoap[][] toSoapModels(US_Rep[][] models) {
		US_RepSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new US_RepSoap[models.length][models[0].length];
		}
		else {
			soapModels = new US_RepSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static US_RepSoap[] toSoapModels(List<US_Rep> models) {
		List<US_RepSoap> soapModels = new ArrayList<US_RepSoap>(models.size());

		for (US_Rep model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new US_RepSoap[soapModels.size()]);
	}

	public US_RepSoap() {
	}

	public long getPrimaryKey() {
		return _usRepId;
	}

	public void setPrimaryKey(long pk) {
		setUsRepId(pk);
	}

	public long getUsRepId() {
		return _usRepId;
	}

	public void setUsRepId(long usRepId) {
		_usRepId = usRepId;
	}

	public String getUsRepNumber() {
		return _usRepNumber;
	}

	public void setUsRepNumber(String usRepNumber) {
		_usRepNumber = usRepNumber;
	}

	public String getUsRepName() {
		return _usRepName;
	}

	public void setUsRepName(String usRepName) {
		_usRepName = usRepName;
	}

	public String getZipCode() {
		return _zipCode;
	}

	public void setZipCode(String zipCode) {
		_zipCode = zipCode;
	}

	private long _usRepId;
	private String _usRepNumber;
	private String _usRepName;
	private String _zipCode;
}