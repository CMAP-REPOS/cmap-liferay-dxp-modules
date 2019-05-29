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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link UccPeopleAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccPeopleAddress
 * @generated
 */
@ProviderType
public class UccPeopleAddressWrapper implements UccPeopleAddress,
	ModelWrapper<UccPeopleAddress> {
	public UccPeopleAddressWrapper(UccPeopleAddress uccPeopleAddress) {
		_uccPeopleAddress = uccPeopleAddress;
	}

	@Override
	public Class<?> getModelClass() {
		return UccPeopleAddress.class;
	}

	@Override
	public String getModelClassName() {
		return UccPeopleAddress.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uccPeopleAddressId", getUccPeopleAddressId());
		attributes.put("uccPeopleId", getUccPeopleId());
		attributes.put("street1", getStreet1());
		attributes.put("street2", getStreet2());
		attributes.put("city", getCity());
		attributes.put("region", getRegion());
		attributes.put("zip", getZip());
		attributes.put("zipPlus", getZipPlus());
		attributes.put("type", getType());
		attributes.put("country", getCountry());
		attributes.put("myActive", isMyActive());
		attributes.put("inactiveDate", getInactiveDate());
		attributes.put("modifiedBy", getModifiedBy());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer uccPeopleAddressId = (Integer)attributes.get(
				"uccPeopleAddressId");

		if (uccPeopleAddressId != null) {
			setUccPeopleAddressId(uccPeopleAddressId);
		}

		Integer uccPeopleId = (Integer)attributes.get("uccPeopleId");

		if (uccPeopleId != null) {
			setUccPeopleId(uccPeopleId);
		}

		String street1 = (String)attributes.get("street1");

		if (street1 != null) {
			setStreet1(street1);
		}

		String street2 = (String)attributes.get("street2");

		if (street2 != null) {
			setStreet2(street2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String region = (String)attributes.get("region");

		if (region != null) {
			setRegion(region);
		}

		String zip = (String)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}

		String zipPlus = (String)attributes.get("zipPlus");

		if (zipPlus != null) {
			setZipPlus(zipPlus);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		Boolean myActive = (Boolean)attributes.get("myActive");

		if (myActive != null) {
			setMyActive(myActive);
		}

		Date inactiveDate = (Date)attributes.get("inactiveDate");

		if (inactiveDate != null) {
			setInactiveDate(inactiveDate);
		}

		String modifiedBy = (String)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public Object clone() {
		return new UccPeopleAddressWrapper((UccPeopleAddress)_uccPeopleAddress.clone());
	}

	@Override
	public int compareTo(UccPeopleAddress uccPeopleAddress) {
		return _uccPeopleAddress.compareTo(uccPeopleAddress);
	}

	/**
	* Returns the city of this ucc people address.
	*
	* @return the city of this ucc people address
	*/
	@Override
	public String getCity() {
		return _uccPeopleAddress.getCity();
	}

	/**
	* Returns the country of this ucc people address.
	*
	* @return the country of this ucc people address
	*/
	@Override
	public String getCountry() {
		return _uccPeopleAddress.getCountry();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _uccPeopleAddress.getExpandoBridge();
	}

	/**
	* Returns the inactive date of this ucc people address.
	*
	* @return the inactive date of this ucc people address
	*/
	@Override
	public Date getInactiveDate() {
		return _uccPeopleAddress.getInactiveDate();
	}

	/**
	* Returns the modified by of this ucc people address.
	*
	* @return the modified by of this ucc people address
	*/
	@Override
	public String getModifiedBy() {
		return _uccPeopleAddress.getModifiedBy();
	}

	/**
	* Returns the modified date of this ucc people address.
	*
	* @return the modified date of this ucc people address
	*/
	@Override
	public Date getModifiedDate() {
		return _uccPeopleAddress.getModifiedDate();
	}

	/**
	* Returns the my active of this ucc people address.
	*
	* @return the my active of this ucc people address
	*/
	@Override
	public boolean getMyActive() {
		return _uccPeopleAddress.getMyActive();
	}

	/**
	* Returns the primary key of this ucc people address.
	*
	* @return the primary key of this ucc people address
	*/
	@Override
	public int getPrimaryKey() {
		return _uccPeopleAddress.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _uccPeopleAddress.getPrimaryKeyObj();
	}

	/**
	* Returns the region of this ucc people address.
	*
	* @return the region of this ucc people address
	*/
	@Override
	public String getRegion() {
		return _uccPeopleAddress.getRegion();
	}

	/**
	* Returns the street1 of this ucc people address.
	*
	* @return the street1 of this ucc people address
	*/
	@Override
	public String getStreet1() {
		return _uccPeopleAddress.getStreet1();
	}

	/**
	* Returns the street2 of this ucc people address.
	*
	* @return the street2 of this ucc people address
	*/
	@Override
	public String getStreet2() {
		return _uccPeopleAddress.getStreet2();
	}

	/**
	* Returns the type of this ucc people address.
	*
	* @return the type of this ucc people address
	*/
	@Override
	public String getType() {
		return _uccPeopleAddress.getType();
	}

	/**
	* Returns the ucc people address ID of this ucc people address.
	*
	* @return the ucc people address ID of this ucc people address
	*/
	@Override
	public int getUccPeopleAddressId() {
		return _uccPeopleAddress.getUccPeopleAddressId();
	}

	/**
	* Returns the ucc people ID of this ucc people address.
	*
	* @return the ucc people ID of this ucc people address
	*/
	@Override
	public int getUccPeopleId() {
		return _uccPeopleAddress.getUccPeopleId();
	}

	/**
	* Returns the zip of this ucc people address.
	*
	* @return the zip of this ucc people address
	*/
	@Override
	public String getZip() {
		return _uccPeopleAddress.getZip();
	}

	/**
	* Returns the zip plus of this ucc people address.
	*
	* @return the zip plus of this ucc people address
	*/
	@Override
	public String getZipPlus() {
		return _uccPeopleAddress.getZipPlus();
	}

	@Override
	public int hashCode() {
		return _uccPeopleAddress.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _uccPeopleAddress.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _uccPeopleAddress.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this ucc people address is my active.
	*
	* @return <code>true</code> if this ucc people address is my active; <code>false</code> otherwise
	*/
	@Override
	public boolean isMyActive() {
		return _uccPeopleAddress.isMyActive();
	}

	@Override
	public boolean isNew() {
		return _uccPeopleAddress.isNew();
	}

	@Override
	public void persist() {
		_uccPeopleAddress.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_uccPeopleAddress.setCachedModel(cachedModel);
	}

	/**
	* Sets the city of this ucc people address.
	*
	* @param city the city of this ucc people address
	*/
	@Override
	public void setCity(String city) {
		_uccPeopleAddress.setCity(city);
	}

	/**
	* Sets the country of this ucc people address.
	*
	* @param country the country of this ucc people address
	*/
	@Override
	public void setCountry(String country) {
		_uccPeopleAddress.setCountry(country);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_uccPeopleAddress.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_uccPeopleAddress.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_uccPeopleAddress.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the inactive date of this ucc people address.
	*
	* @param inactiveDate the inactive date of this ucc people address
	*/
	@Override
	public void setInactiveDate(Date inactiveDate) {
		_uccPeopleAddress.setInactiveDate(inactiveDate);
	}

	/**
	* Sets the modified by of this ucc people address.
	*
	* @param modifiedBy the modified by of this ucc people address
	*/
	@Override
	public void setModifiedBy(String modifiedBy) {
		_uccPeopleAddress.setModifiedBy(modifiedBy);
	}

	/**
	* Sets the modified date of this ucc people address.
	*
	* @param modifiedDate the modified date of this ucc people address
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_uccPeopleAddress.setModifiedDate(modifiedDate);
	}

	/**
	* Sets whether this ucc people address is my active.
	*
	* @param myActive the my active of this ucc people address
	*/
	@Override
	public void setMyActive(boolean myActive) {
		_uccPeopleAddress.setMyActive(myActive);
	}

	@Override
	public void setNew(boolean n) {
		_uccPeopleAddress.setNew(n);
	}

	/**
	* Sets the primary key of this ucc people address.
	*
	* @param primaryKey the primary key of this ucc people address
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_uccPeopleAddress.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_uccPeopleAddress.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the region of this ucc people address.
	*
	* @param region the region of this ucc people address
	*/
	@Override
	public void setRegion(String region) {
		_uccPeopleAddress.setRegion(region);
	}

	/**
	* Sets the street1 of this ucc people address.
	*
	* @param street1 the street1 of this ucc people address
	*/
	@Override
	public void setStreet1(String street1) {
		_uccPeopleAddress.setStreet1(street1);
	}

	/**
	* Sets the street2 of this ucc people address.
	*
	* @param street2 the street2 of this ucc people address
	*/
	@Override
	public void setStreet2(String street2) {
		_uccPeopleAddress.setStreet2(street2);
	}

	/**
	* Sets the type of this ucc people address.
	*
	* @param type the type of this ucc people address
	*/
	@Override
	public void setType(String type) {
		_uccPeopleAddress.setType(type);
	}

	/**
	* Sets the ucc people address ID of this ucc people address.
	*
	* @param uccPeopleAddressId the ucc people address ID of this ucc people address
	*/
	@Override
	public void setUccPeopleAddressId(int uccPeopleAddressId) {
		_uccPeopleAddress.setUccPeopleAddressId(uccPeopleAddressId);
	}

	/**
	* Sets the ucc people ID of this ucc people address.
	*
	* @param uccPeopleId the ucc people ID of this ucc people address
	*/
	@Override
	public void setUccPeopleId(int uccPeopleId) {
		_uccPeopleAddress.setUccPeopleId(uccPeopleId);
	}

	/**
	* Sets the zip of this ucc people address.
	*
	* @param zip the zip of this ucc people address
	*/
	@Override
	public void setZip(String zip) {
		_uccPeopleAddress.setZip(zip);
	}

	/**
	* Sets the zip plus of this ucc people address.
	*
	* @param zipPlus the zip plus of this ucc people address
	*/
	@Override
	public void setZipPlus(String zipPlus) {
		_uccPeopleAddress.setZipPlus(zipPlus);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<UccPeopleAddress> toCacheModel() {
		return _uccPeopleAddress.toCacheModel();
	}

	@Override
	public UccPeopleAddress toEscapedModel() {
		return new UccPeopleAddressWrapper(_uccPeopleAddress.toEscapedModel());
	}

	@Override
	public String toString() {
		return _uccPeopleAddress.toString();
	}

	@Override
	public UccPeopleAddress toUnescapedModel() {
		return new UccPeopleAddressWrapper(_uccPeopleAddress.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _uccPeopleAddress.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UccPeopleAddressWrapper)) {
			return false;
		}

		UccPeopleAddressWrapper uccPeopleAddressWrapper = (UccPeopleAddressWrapper)obj;

		if (Objects.equals(_uccPeopleAddress,
					uccPeopleAddressWrapper._uccPeopleAddress)) {
			return true;
		}

		return false;
	}

	@Override
	public UccPeopleAddress getWrappedModel() {
		return _uccPeopleAddress;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _uccPeopleAddress.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _uccPeopleAddress.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_uccPeopleAddress.resetOriginalValues();
	}

	private final UccPeopleAddress _uccPeopleAddress;
}