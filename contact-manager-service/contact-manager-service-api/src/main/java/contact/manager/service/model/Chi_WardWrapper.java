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
 * This class is a wrapper for {@link Chi_Ward}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Chi_Ward
 * @generated
 */
@ProviderType
public class Chi_WardWrapper implements Chi_Ward, ModelWrapper<Chi_Ward> {
	public Chi_WardWrapper(Chi_Ward chi_Ward) {
		_chi_Ward = chi_Ward;
	}

	@Override
	public Class<?> getModelClass() {
		return Chi_Ward.class;
	}

	@Override
	public String getModelClassName() {
		return Chi_Ward.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("chiWardId", getChiWardId());
		attributes.put("chiWardName", getChiWardName());
		attributes.put("zipCode", getZipCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long chiWardId = (Long)attributes.get("chiWardId");

		if (chiWardId != null) {
			setChiWardId(chiWardId);
		}

		String chiWardName = (String)attributes.get("chiWardName");

		if (chiWardName != null) {
			setChiWardName(chiWardName);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _chi_Ward.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _chi_Ward.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _chi_Ward.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _chi_Ward.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.Chi_Ward> toCacheModel() {
		return _chi_Ward.toCacheModel();
	}

	@Override
	public contact.manager.service.model.Chi_Ward toEscapedModel() {
		return new Chi_WardWrapper(_chi_Ward.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.Chi_Ward toUnescapedModel() {
		return new Chi_WardWrapper(_chi_Ward.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.service.model.Chi_Ward chi_Ward) {
		return _chi_Ward.compareTo(chi_Ward);
	}

	@Override
	public int hashCode() {
		return _chi_Ward.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _chi_Ward.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new Chi_WardWrapper((Chi_Ward)_chi_Ward.clone());
	}

	/**
	* Returns the chi ward name of this chi_ ward.
	*
	* @return the chi ward name of this chi_ ward
	*/
	@Override
	public java.lang.String getChiWardName() {
		return _chi_Ward.getChiWardName();
	}

	/**
	* Returns the zip code of this chi_ ward.
	*
	* @return the zip code of this chi_ ward
	*/
	@Override
	public java.lang.String getZipCode() {
		return _chi_Ward.getZipCode();
	}

	@Override
	public java.lang.String toString() {
		return _chi_Ward.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _chi_Ward.toXmlString();
	}

	/**
	* Returns the chi ward ID of this chi_ ward.
	*
	* @return the chi ward ID of this chi_ ward
	*/
	@Override
	public long getChiWardId() {
		return _chi_Ward.getChiWardId();
	}

	/**
	* Returns the primary key of this chi_ ward.
	*
	* @return the primary key of this chi_ ward
	*/
	@Override
	public long getPrimaryKey() {
		return _chi_Ward.getPrimaryKey();
	}

	@Override
	public void persist() {
		_chi_Ward.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_chi_Ward.setCachedModel(cachedModel);
	}

	/**
	* Sets the chi ward ID of this chi_ ward.
	*
	* @param chiWardId the chi ward ID of this chi_ ward
	*/
	@Override
	public void setChiWardId(long chiWardId) {
		_chi_Ward.setChiWardId(chiWardId);
	}

	/**
	* Sets the chi ward name of this chi_ ward.
	*
	* @param chiWardName the chi ward name of this chi_ ward
	*/
	@Override
	public void setChiWardName(java.lang.String chiWardName) {
		_chi_Ward.setChiWardName(chiWardName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_chi_Ward.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_chi_Ward.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_chi_Ward.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_chi_Ward.setNew(n);
	}

	/**
	* Sets the primary key of this chi_ ward.
	*
	* @param primaryKey the primary key of this chi_ ward
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_chi_Ward.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_chi_Ward.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the zip code of this chi_ ward.
	*
	* @param zipCode the zip code of this chi_ ward
	*/
	@Override
	public void setZipCode(java.lang.String zipCode) {
		_chi_Ward.setZipCode(zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Chi_WardWrapper)) {
			return false;
		}

		Chi_WardWrapper chi_WardWrapper = (Chi_WardWrapper)obj;

		if (Objects.equals(_chi_Ward, chi_WardWrapper._chi_Ward)) {
			return true;
		}

		return false;
	}

	@Override
	public Chi_Ward getWrappedModel() {
		return _chi_Ward;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _chi_Ward.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _chi_Ward.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_chi_Ward.resetOriginalValues();
	}

	private final Chi_Ward _chi_Ward;
}