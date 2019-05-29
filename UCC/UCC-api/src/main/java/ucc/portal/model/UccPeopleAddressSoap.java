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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class UccPeopleAddressSoap implements Serializable {
	public static UccPeopleAddressSoap toSoapModel(UccPeopleAddress model) {
		UccPeopleAddressSoap soapModel = new UccPeopleAddressSoap();

		soapModel.setUccPeopleAddressId(model.getUccPeopleAddressId());
		soapModel.setUccPeopleId(model.getUccPeopleId());
		soapModel.setStreet1(model.getStreet1());
		soapModel.setStreet2(model.getStreet2());
		soapModel.setCity(model.getCity());
		soapModel.setRegion(model.getRegion());
		soapModel.setZip(model.getZip());
		soapModel.setZipPlus(model.getZipPlus());
		soapModel.setType(model.getType());
		soapModel.setCountry(model.getCountry());
		soapModel.setMyActive(model.isMyActive());
		soapModel.setInactiveDate(model.getInactiveDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static UccPeopleAddressSoap[] toSoapModels(UccPeopleAddress[] models) {
		UccPeopleAddressSoap[] soapModels = new UccPeopleAddressSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UccPeopleAddressSoap[][] toSoapModels(
		UccPeopleAddress[][] models) {
		UccPeopleAddressSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UccPeopleAddressSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UccPeopleAddressSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UccPeopleAddressSoap[] toSoapModels(
		List<UccPeopleAddress> models) {
		List<UccPeopleAddressSoap> soapModels = new ArrayList<UccPeopleAddressSoap>(models.size());

		for (UccPeopleAddress model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UccPeopleAddressSoap[soapModels.size()]);
	}

	public UccPeopleAddressSoap() {
	}

	public int getPrimaryKey() {
		return _uccPeopleAddressId;
	}

	public void setPrimaryKey(int pk) {
		setUccPeopleAddressId(pk);
	}

	public int getUccPeopleAddressId() {
		return _uccPeopleAddressId;
	}

	public void setUccPeopleAddressId(int uccPeopleAddressId) {
		_uccPeopleAddressId = uccPeopleAddressId;
	}

	public int getUccPeopleId() {
		return _uccPeopleId;
	}

	public void setUccPeopleId(int uccPeopleId) {
		_uccPeopleId = uccPeopleId;
	}

	public String getStreet1() {
		return _street1;
	}

	public void setStreet1(String street1) {
		_street1 = street1;
	}

	public String getStreet2() {
		return _street2;
	}

	public void setStreet2(String street2) {
		_street2 = street2;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getRegion() {
		return _region;
	}

	public void setRegion(String region) {
		_region = region;
	}

	public String getZip() {
		return _zip;
	}

	public void setZip(String zip) {
		_zip = zip;
	}

	public String getZipPlus() {
		return _zipPlus;
	}

	public void setZipPlus(String zipPlus) {
		_zipPlus = zipPlus;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
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

	public Date getInactiveDate() {
		return _inactiveDate;
	}

	public void setInactiveDate(Date inactiveDate) {
		_inactiveDate = inactiveDate;
	}

	public String getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private int _uccPeopleAddressId;
	private int _uccPeopleId;
	private String _street1;
	private String _street2;
	private String _city;
	private String _region;
	private String _zip;
	private String _zipPlus;
	private String _type;
	private String _country;
	private boolean _myActive;
	private Date _inactiveDate;
	private String _modifiedBy;
	private Date _modifiedDate;
}