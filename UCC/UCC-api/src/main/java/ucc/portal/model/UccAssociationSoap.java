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
 * This class is used by SOAP remote services, specifically {@link ucc.portal.service.http.UccAssociationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.http.UccAssociationServiceSoap
 * @generated
 */
@ProviderType
public class UccAssociationSoap implements Serializable {
	public static UccAssociationSoap toSoapModel(UccAssociation model) {
		UccAssociationSoap soapModel = new UccAssociationSoap();

		soapModel.setUccAssociationId(model.getUccAssociationId());
		soapModel.setUccConferenceId(model.getUccConferenceId());
		soapModel.setName(model.getName());
		soapModel.setAbbreviation(model.getAbbreviation());
		soapModel.setMyActive(model.isMyActive());

		return soapModel;
	}

	public static UccAssociationSoap[] toSoapModels(UccAssociation[] models) {
		UccAssociationSoap[] soapModels = new UccAssociationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UccAssociationSoap[][] toSoapModels(UccAssociation[][] models) {
		UccAssociationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UccAssociationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UccAssociationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UccAssociationSoap[] toSoapModels(List<UccAssociation> models) {
		List<UccAssociationSoap> soapModels = new ArrayList<UccAssociationSoap>(models.size());

		for (UccAssociation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UccAssociationSoap[soapModels.size()]);
	}

	public UccAssociationSoap() {
	}

	public int getPrimaryKey() {
		return _uccAssociationId;
	}

	public void setPrimaryKey(int pk) {
		setUccAssociationId(pk);
	}

	public int getUccAssociationId() {
		return _uccAssociationId;
	}

	public void setUccAssociationId(int uccAssociationId) {
		_uccAssociationId = uccAssociationId;
	}

	public int getUccConferenceId() {
		return _uccConferenceId;
	}

	public void setUccConferenceId(int uccConferenceId) {
		_uccConferenceId = uccConferenceId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getAbbreviation() {
		return _abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		_abbreviation = abbreviation;
	}

	public boolean getMyActive() {
		return _myActive;
	}

	public boolean isMyActive() {
		return _myActive;
	}

	public void setMyActive(boolean myActive) {
		_myActive = myActive;
	}

	private int _uccAssociationId;
	private int _uccConferenceId;
	private String _name;
	private String _abbreviation;
	private boolean _myActive;
}