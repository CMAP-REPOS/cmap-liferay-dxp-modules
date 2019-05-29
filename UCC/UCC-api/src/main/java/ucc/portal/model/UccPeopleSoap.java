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
public class UccPeopleSoap implements Serializable {
	public static UccPeopleSoap toSoapModel(UccPeople model) {
		UccPeopleSoap soapModel = new UccPeopleSoap();

		soapModel.setUccPeopleId(model.getUccPeopleId());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setMiddleName(model.getMiddleName());
		soapModel.setLastName(model.getLastName());
		soapModel.setSuffix(model.getSuffix());
		soapModel.setBirthday(model.getBirthday());
		soapModel.setMyActive(model.isMyActive());
		soapModel.setOldUccPeopleId(model.getOldUccPeopleId());
		soapModel.setPhone(model.getPhone());
		soapModel.setEmailAddress(model.getEmailAddress());
		soapModel.setCellPhone(model.getCellPhone());

		return soapModel;
	}

	public static UccPeopleSoap[] toSoapModels(UccPeople[] models) {
		UccPeopleSoap[] soapModels = new UccPeopleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UccPeopleSoap[][] toSoapModels(UccPeople[][] models) {
		UccPeopleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UccPeopleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UccPeopleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UccPeopleSoap[] toSoapModels(List<UccPeople> models) {
		List<UccPeopleSoap> soapModels = new ArrayList<UccPeopleSoap>(models.size());

		for (UccPeople model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UccPeopleSoap[soapModels.size()]);
	}

	public UccPeopleSoap() {
	}

	public int getPrimaryKey() {
		return _uccPeopleId;
	}

	public void setPrimaryKey(int pk) {
		setUccPeopleId(pk);
	}

	public int getUccPeopleId() {
		return _uccPeopleId;
	}

	public void setUccPeopleId(int uccPeopleId) {
		_uccPeopleId = uccPeopleId;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getMiddleName() {
		return _middleName;
	}

	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getSuffix() {
		return _suffix;
	}

	public void setSuffix(String suffix) {
		_suffix = suffix;
	}

	public String getBirthday() {
		return _birthday;
	}

	public void setBirthday(String birthday) {
		_birthday = birthday;
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

	public int getOldUccPeopleId() {
		return _oldUccPeopleId;
	}

	public void setOldUccPeopleId(int oldUccPeopleId) {
		_oldUccPeopleId = oldUccPeopleId;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getEmailAddress() {
		return _emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	public String getCellPhone() {
		return _cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		_cellPhone = cellPhone;
	}

	private int _uccPeopleId;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private String _suffix;
	private String _birthday;
	private boolean _myActive;
	private int _oldUccPeopleId;
	private String _phone;
	private String _emailAddress;
	private String _cellPhone;
}