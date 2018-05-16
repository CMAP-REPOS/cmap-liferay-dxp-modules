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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link County}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see County
 * @generated
 */
@ProviderType
public class CountyWrapper implements County, ModelWrapper<County> {
	public CountyWrapper(County county) {
		_county = county;
	}

	@Override
	public Class<?> getModelClass() {
		return County.class;
	}

	@Override
	public String getModelClassName() {
		return County.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("countyId", getCountyId());
		attributes.put("countyName", getCountyName());
		attributes.put("zipCode", getZipCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long countyId = (Long)attributes.get("countyId");

		if (countyId != null) {
			setCountyId(countyId);
		}

		String countyName = (String)attributes.get("countyName");

		if (countyName != null) {
			setCountyName(countyName);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _county.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _county.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _county.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _county.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.County> toCacheModel() {
		return _county.toCacheModel();
	}

	@Override
	public contact.manager.service.model.County toEscapedModel() {
		return new CountyWrapper(_county.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.County toUnescapedModel() {
		return new CountyWrapper(_county.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.service.model.County county) {
		return _county.compareTo(county);
	}

	@Override
	public int hashCode() {
		return _county.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _county.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CountyWrapper((County)_county.clone());
	}

	/**
	* Returns the county name of this county.
	*
	* @return the county name of this county
	*/
	@Override
	public java.lang.String getCountyName() {
		return _county.getCountyName();
	}

	/**
	* Returns the zip code of this county.
	*
	* @return the zip code of this county
	*/
	@Override
	public java.lang.String getZipCode() {
		return _county.getZipCode();
	}

	@Override
	public java.lang.String toString() {
		return _county.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _county.toXmlString();
	}

	/**
	* Returns the county ID of this county.
	*
	* @return the county ID of this county
	*/
	@Override
	public long getCountyId() {
		return _county.getCountyId();
	}

	/**
	* Returns the primary key of this county.
	*
	* @return the primary key of this county
	*/
	@Override
	public long getPrimaryKey() {
		return _county.getPrimaryKey();
	}

	@Override
	public void persist() {
		_county.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_county.setCachedModel(cachedModel);
	}

	/**
	* Sets the county ID of this county.
	*
	* @param countyId the county ID of this county
	*/
	@Override
	public void setCountyId(long countyId) {
		_county.setCountyId(countyId);
	}

	/**
	* Sets the county name of this county.
	*
	* @param countyName the county name of this county
	*/
	@Override
	public void setCountyName(java.lang.String countyName) {
		_county.setCountyName(countyName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_county.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_county.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_county.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_county.setNew(n);
	}

	/**
	* Sets the primary key of this county.
	*
	* @param primaryKey the primary key of this county
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_county.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_county.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the zip code of this county.
	*
	* @param zipCode the zip code of this county
	*/
	@Override
	public void setZipCode(java.lang.String zipCode) {
		_county.setZipCode(zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CountyWrapper)) {
			return false;
		}

		CountyWrapper countyWrapper = (CountyWrapper)obj;

		if (Objects.equals(_county, countyWrapper._county)) {
			return true;
		}

		return false;
	}

	@Override
	public County getWrappedModel() {
		return _county;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _county.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _county.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_county.resetOriginalValues();
	}

	private final County _county;
}