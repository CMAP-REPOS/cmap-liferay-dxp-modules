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
public class State_RepSoap implements Serializable {
	public static State_RepSoap toSoapModel(State_Rep model) {
		State_RepSoap soapModel = new State_RepSoap();

		soapModel.setStateRepId(model.getStateRepId());
		soapModel.setStateRepNumber(model.getStateRepNumber());
		soapModel.setStateRepName(model.getStateRepName());
		soapModel.setZipCode(model.getZipCode());

		return soapModel;
	}

	public static State_RepSoap[] toSoapModels(State_Rep[] models) {
		State_RepSoap[] soapModels = new State_RepSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static State_RepSoap[][] toSoapModels(State_Rep[][] models) {
		State_RepSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new State_RepSoap[models.length][models[0].length];
		}
		else {
			soapModels = new State_RepSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static State_RepSoap[] toSoapModels(List<State_Rep> models) {
		List<State_RepSoap> soapModels = new ArrayList<State_RepSoap>(models.size());

		for (State_Rep model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new State_RepSoap[soapModels.size()]);
	}

	public State_RepSoap() {
	}

	public long getPrimaryKey() {
		return _stateRepId;
	}

	public void setPrimaryKey(long pk) {
		setStateRepId(pk);
	}

	public long getStateRepId() {
		return _stateRepId;
	}

	public void setStateRepId(long stateRepId) {
		_stateRepId = stateRepId;
	}

	public int getStateRepNumber() {
		return _stateRepNumber;
	}

	public void setStateRepNumber(int stateRepNumber) {
		_stateRepNumber = stateRepNumber;
	}

	public String getStateRepName() {
		return _stateRepName;
	}

	public void setStateRepName(String stateRepName) {
		_stateRepName = stateRepName;
	}

	public String getZipCode() {
		return _zipCode;
	}

	public void setZipCode(String zipCode) {
		_zipCode = zipCode;
	}

	private long _stateRepId;
	private int _stateRepNumber;
	private String _stateRepName;
	private String _zipCode;
}