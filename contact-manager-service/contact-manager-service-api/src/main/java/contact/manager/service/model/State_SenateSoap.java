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
public class State_SenateSoap implements Serializable {
	public static State_SenateSoap toSoapModel(State_Senate model) {
		State_SenateSoap soapModel = new State_SenateSoap();

		soapModel.setStateSenateId(model.getStateSenateId());
		soapModel.setStateSenateNumber(model.getStateSenateNumber());
		soapModel.setStateSenateName(model.getStateSenateName());
		soapModel.setZipCode(model.getZipCode());

		return soapModel;
	}

	public static State_SenateSoap[] toSoapModels(State_Senate[] models) {
		State_SenateSoap[] soapModels = new State_SenateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static State_SenateSoap[][] toSoapModels(State_Senate[][] models) {
		State_SenateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new State_SenateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new State_SenateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static State_SenateSoap[] toSoapModels(List<State_Senate> models) {
		List<State_SenateSoap> soapModels = new ArrayList<State_SenateSoap>(models.size());

		for (State_Senate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new State_SenateSoap[soapModels.size()]);
	}

	public State_SenateSoap() {
	}

	public long getPrimaryKey() {
		return _stateSenateId;
	}

	public void setPrimaryKey(long pk) {
		setStateSenateId(pk);
	}

	public long getStateSenateId() {
		return _stateSenateId;
	}

	public void setStateSenateId(long stateSenateId) {
		_stateSenateId = stateSenateId;
	}

	public int getStateSenateNumber() {
		return _stateSenateNumber;
	}

	public void setStateSenateNumber(int stateSenateNumber) {
		_stateSenateNumber = stateSenateNumber;
	}

	public String getStateSenateName() {
		return _stateSenateName;
	}

	public void setStateSenateName(String stateSenateName) {
		_stateSenateName = stateSenateName;
	}

	public String getZipCode() {
		return _zipCode;
	}

	public void setZipCode(String zipCode) {
		_zipCode = zipCode;
	}

	private long _stateSenateId;
	private int _stateSenateNumber;
	private String _stateSenateName;
	private String _zipCode;
}