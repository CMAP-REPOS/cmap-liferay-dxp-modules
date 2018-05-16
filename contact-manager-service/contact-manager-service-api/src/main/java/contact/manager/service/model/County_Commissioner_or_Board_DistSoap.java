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
public class County_Commissioner_or_Board_DistSoap implements Serializable {
	public static County_Commissioner_or_Board_DistSoap toSoapModel(
		County_Commissioner_or_Board_Dist model) {
		County_Commissioner_or_Board_DistSoap soapModel = new County_Commissioner_or_Board_DistSoap();

		soapModel.setCcbdId(model.getCcbdId());
		soapModel.setCcbdNumber(model.getCcbdNumber());
		soapModel.setCcbdName(model.getCcbdName());
		soapModel.setZipCode(model.getZipCode());

		return soapModel;
	}

	public static County_Commissioner_or_Board_DistSoap[] toSoapModels(
		County_Commissioner_or_Board_Dist[] models) {
		County_Commissioner_or_Board_DistSoap[] soapModels = new County_Commissioner_or_Board_DistSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static County_Commissioner_or_Board_DistSoap[][] toSoapModels(
		County_Commissioner_or_Board_Dist[][] models) {
		County_Commissioner_or_Board_DistSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new County_Commissioner_or_Board_DistSoap[models.length][models[0].length];
		}
		else {
			soapModels = new County_Commissioner_or_Board_DistSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static County_Commissioner_or_Board_DistSoap[] toSoapModels(
		List<County_Commissioner_or_Board_Dist> models) {
		List<County_Commissioner_or_Board_DistSoap> soapModels = new ArrayList<County_Commissioner_or_Board_DistSoap>(models.size());

		for (County_Commissioner_or_Board_Dist model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new County_Commissioner_or_Board_DistSoap[soapModels.size()]);
	}

	public County_Commissioner_or_Board_DistSoap() {
	}

	public long getPrimaryKey() {
		return _ccbdId;
	}

	public void setPrimaryKey(long pk) {
		setCcbdId(pk);
	}

	public long getCcbdId() {
		return _ccbdId;
	}

	public void setCcbdId(long ccbdId) {
		_ccbdId = ccbdId;
	}

	public int getCcbdNumber() {
		return _ccbdNumber;
	}

	public void setCcbdNumber(int ccbdNumber) {
		_ccbdNumber = ccbdNumber;
	}

	public String getCcbdName() {
		return _ccbdName;
	}

	public void setCcbdName(String ccbdName) {
		_ccbdName = ccbdName;
	}

	public String getZipCode() {
		return _zipCode;
	}

	public void setZipCode(String zipCode) {
		_zipCode = zipCode;
	}

	private long _ccbdId;
	private int _ccbdNumber;
	private String _ccbdName;
	private String _zipCode;
}