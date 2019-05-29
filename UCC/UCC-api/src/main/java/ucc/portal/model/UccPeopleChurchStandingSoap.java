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

package ucc.portal.model;

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
public class UccPeopleChurchStandingSoap implements Serializable {
	public static UccPeopleChurchStandingSoap toSoapModel(
		UccPeopleChurchStanding model) {
		UccPeopleChurchStandingSoap soapModel = new UccPeopleChurchStandingSoap();

		soapModel.setUccPeopleChurchStandingId(model.getUccPeopleChurchStandingId());
		soapModel.setUccPeopleId(model.getUccPeopleId());
		soapModel.setUccConferenceId(model.getUccConferenceId());
		soapModel.setUccAssociationId(model.getUccAssociationId());

		return soapModel;
	}

	public static UccPeopleChurchStandingSoap[] toSoapModels(
		UccPeopleChurchStanding[] models) {
		UccPeopleChurchStandingSoap[] soapModels = new UccPeopleChurchStandingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UccPeopleChurchStandingSoap[][] toSoapModels(
		UccPeopleChurchStanding[][] models) {
		UccPeopleChurchStandingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UccPeopleChurchStandingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UccPeopleChurchStandingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UccPeopleChurchStandingSoap[] toSoapModels(
		List<UccPeopleChurchStanding> models) {
		List<UccPeopleChurchStandingSoap> soapModels = new ArrayList<UccPeopleChurchStandingSoap>(models.size());

		for (UccPeopleChurchStanding model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UccPeopleChurchStandingSoap[soapModels.size()]);
	}

	public UccPeopleChurchStandingSoap() {
	}

	public int getPrimaryKey() {
		return _uccPeopleChurchStandingId;
	}

	public void setPrimaryKey(int pk) {
		setUccPeopleChurchStandingId(pk);
	}

	public int getUccPeopleChurchStandingId() {
		return _uccPeopleChurchStandingId;
	}

	public void setUccPeopleChurchStandingId(int uccPeopleChurchStandingId) {
		_uccPeopleChurchStandingId = uccPeopleChurchStandingId;
	}

	public int getUccPeopleId() {
		return _uccPeopleId;
	}

	public void setUccPeopleId(int uccPeopleId) {
		_uccPeopleId = uccPeopleId;
	}

	public int getUccConferenceId() {
		return _uccConferenceId;
	}

	public void setUccConferenceId(int uccConferenceId) {
		_uccConferenceId = uccConferenceId;
	}

	public int getUccAssociationId() {
		return _uccAssociationId;
	}

	public void setUccAssociationId(int uccAssociationId) {
		_uccAssociationId = uccAssociationId;
	}

	private int _uccPeopleChurchStandingId;
	private int _uccPeopleId;
	private int _uccConferenceId;
	private int _uccAssociationId;
}