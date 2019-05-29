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
 * This class is used by SOAP remote services, specifically {@link ucc.portal.service.http.UccConferenceServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.http.UccConferenceServiceSoap
 * @generated
 */
@ProviderType
public class UccConferenceSoap implements Serializable {
	public static UccConferenceSoap toSoapModel(UccConference model) {
		UccConferenceSoap soapModel = new UccConferenceSoap();

		soapModel.setUccConferenceId(model.getUccConferenceId());
		soapModel.setName(model.getName());
		soapModel.setAbbreviation(model.getAbbreviation());

		return soapModel;
	}

	public static UccConferenceSoap[] toSoapModels(UccConference[] models) {
		UccConferenceSoap[] soapModels = new UccConferenceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UccConferenceSoap[][] toSoapModels(UccConference[][] models) {
		UccConferenceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UccConferenceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UccConferenceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UccConferenceSoap[] toSoapModels(List<UccConference> models) {
		List<UccConferenceSoap> soapModels = new ArrayList<UccConferenceSoap>(models.size());

		for (UccConference model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UccConferenceSoap[soapModels.size()]);
	}

	public UccConferenceSoap() {
	}

	public int getPrimaryKey() {
		return _uccConferenceId;
	}

	public void setPrimaryKey(int pk) {
		setUccConferenceId(pk);
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

	private int _uccConferenceId;
	private String _name;
	private String _abbreviation;
}