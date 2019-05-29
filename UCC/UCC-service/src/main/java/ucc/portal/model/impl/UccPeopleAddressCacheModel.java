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

package ucc.portal.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import ucc.portal.model.UccPeopleAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UccPeopleAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UccPeopleAddress
 * @generated
 */
@ProviderType
public class UccPeopleAddressCacheModel implements CacheModel<UccPeopleAddress>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UccPeopleAddressCacheModel)) {
			return false;
		}

		UccPeopleAddressCacheModel uccPeopleAddressCacheModel = (UccPeopleAddressCacheModel)obj;

		if (uccPeopleAddressId == uccPeopleAddressCacheModel.uccPeopleAddressId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, uccPeopleAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uccPeopleAddressId=");
		sb.append(uccPeopleAddressId);
		sb.append(", uccPeopleId=");
		sb.append(uccPeopleId);
		sb.append(", street1=");
		sb.append(street1);
		sb.append(", street2=");
		sb.append(street2);
		sb.append(", city=");
		sb.append(city);
		sb.append(", region=");
		sb.append(region);
		sb.append(", zip=");
		sb.append(zip);
		sb.append(", zipPlus=");
		sb.append(zipPlus);
		sb.append(", type=");
		sb.append(type);
		sb.append(", country=");
		sb.append(country);
		sb.append(", myActive=");
		sb.append(myActive);
		sb.append(", inactiveDate=");
		sb.append(inactiveDate);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UccPeopleAddress toEntityModel() {
		UccPeopleAddressImpl uccPeopleAddressImpl = new UccPeopleAddressImpl();

		uccPeopleAddressImpl.setUccPeopleAddressId(uccPeopleAddressId);
		uccPeopleAddressImpl.setUccPeopleId(uccPeopleId);

		if (street1 == null) {
			uccPeopleAddressImpl.setStreet1("");
		}
		else {
			uccPeopleAddressImpl.setStreet1(street1);
		}

		if (street2 == null) {
			uccPeopleAddressImpl.setStreet2("");
		}
		else {
			uccPeopleAddressImpl.setStreet2(street2);
		}

		if (city == null) {
			uccPeopleAddressImpl.setCity("");
		}
		else {
			uccPeopleAddressImpl.setCity(city);
		}

		if (region == null) {
			uccPeopleAddressImpl.setRegion("");
		}
		else {
			uccPeopleAddressImpl.setRegion(region);
		}

		if (zip == null) {
			uccPeopleAddressImpl.setZip("");
		}
		else {
			uccPeopleAddressImpl.setZip(zip);
		}

		if (zipPlus == null) {
			uccPeopleAddressImpl.setZipPlus("");
		}
		else {
			uccPeopleAddressImpl.setZipPlus(zipPlus);
		}

		if (type == null) {
			uccPeopleAddressImpl.setType("");
		}
		else {
			uccPeopleAddressImpl.setType(type);
		}

		if (country == null) {
			uccPeopleAddressImpl.setCountry("");
		}
		else {
			uccPeopleAddressImpl.setCountry(country);
		}

		uccPeopleAddressImpl.setMyActive(myActive);

		if (inactiveDate == Long.MIN_VALUE) {
			uccPeopleAddressImpl.setInactiveDate(null);
		}
		else {
			uccPeopleAddressImpl.setInactiveDate(new Date(inactiveDate));
		}

		if (modifiedBy == null) {
			uccPeopleAddressImpl.setModifiedBy("");
		}
		else {
			uccPeopleAddressImpl.setModifiedBy(modifiedBy);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			uccPeopleAddressImpl.setModifiedDate(null);
		}
		else {
			uccPeopleAddressImpl.setModifiedDate(new Date(modifiedDate));
		}

		uccPeopleAddressImpl.resetOriginalValues();

		return uccPeopleAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uccPeopleAddressId = objectInput.readInt();

		uccPeopleId = objectInput.readInt();
		street1 = objectInput.readUTF();
		street2 = objectInput.readUTF();
		city = objectInput.readUTF();
		region = objectInput.readUTF();
		zip = objectInput.readUTF();
		zipPlus = objectInput.readUTF();
		type = objectInput.readUTF();
		country = objectInput.readUTF();

		myActive = objectInput.readBoolean();
		inactiveDate = objectInput.readLong();
		modifiedBy = objectInput.readUTF();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(uccPeopleAddressId);

		objectOutput.writeInt(uccPeopleId);

		if (street1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(street1);
		}

		if (street2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(street2);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (region == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(region);
		}

		if (zip == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zip);
		}

		if (zipPlus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zipPlus);
		}

		if (type == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}

		objectOutput.writeBoolean(myActive);
		objectOutput.writeLong(inactiveDate);

		if (modifiedBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modifiedBy);
		}

		objectOutput.writeLong(modifiedDate);
	}

	public int uccPeopleAddressId;
	public int uccPeopleId;
	public String street1;
	public String street2;
	public String city;
	public String region;
	public String zip;
	public String zipPlus;
	public String type;
	public String country;
	public boolean myActive;
	public long inactiveDate;
	public String modifiedBy;
	public long modifiedDate;
}