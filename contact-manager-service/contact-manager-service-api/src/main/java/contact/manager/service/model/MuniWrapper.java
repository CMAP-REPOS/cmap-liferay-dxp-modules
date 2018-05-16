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
 * This class is a wrapper for {@link Muni}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Muni
 * @generated
 */
@ProviderType
public class MuniWrapper implements Muni, ModelWrapper<Muni> {
	public MuniWrapper(Muni muni) {
		_muni = muni;
	}

	@Override
	public Class<?> getModelClass() {
		return Muni.class;
	}

	@Override
	public String getModelClassName() {
		return Muni.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("muniId", getMuniId());
		attributes.put("muniName", getMuniName());
		attributes.put("zipCode", getZipCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long muniId = (Long)attributes.get("muniId");

		if (muniId != null) {
			setMuniId(muniId);
		}

		String muniName = (String)attributes.get("muniName");

		if (muniName != null) {
			setMuniName(muniName);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _muni.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _muni.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _muni.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _muni.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.Muni> toCacheModel() {
		return _muni.toCacheModel();
	}

	@Override
	public contact.manager.service.model.Muni toEscapedModel() {
		return new MuniWrapper(_muni.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.Muni toUnescapedModel() {
		return new MuniWrapper(_muni.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.service.model.Muni muni) {
		return _muni.compareTo(muni);
	}

	@Override
	public int hashCode() {
		return _muni.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _muni.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new MuniWrapper((Muni)_muni.clone());
	}

	/**
	* Returns the muni name of this muni.
	*
	* @return the muni name of this muni
	*/
	@Override
	public java.lang.String getMuniName() {
		return _muni.getMuniName();
	}

	/**
	* Returns the zip code of this muni.
	*
	* @return the zip code of this muni
	*/
	@Override
	public java.lang.String getZipCode() {
		return _muni.getZipCode();
	}

	@Override
	public java.lang.String toString() {
		return _muni.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _muni.toXmlString();
	}

	/**
	* Returns the muni ID of this muni.
	*
	* @return the muni ID of this muni
	*/
	@Override
	public long getMuniId() {
		return _muni.getMuniId();
	}

	/**
	* Returns the primary key of this muni.
	*
	* @return the primary key of this muni
	*/
	@Override
	public long getPrimaryKey() {
		return _muni.getPrimaryKey();
	}

	@Override
	public void persist() {
		_muni.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_muni.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_muni.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_muni.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_muni.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the muni ID of this muni.
	*
	* @param muniId the muni ID of this muni
	*/
	@Override
	public void setMuniId(long muniId) {
		_muni.setMuniId(muniId);
	}

	/**
	* Sets the muni name of this muni.
	*
	* @param muniName the muni name of this muni
	*/
	@Override
	public void setMuniName(java.lang.String muniName) {
		_muni.setMuniName(muniName);
	}

	@Override
	public void setNew(boolean n) {
		_muni.setNew(n);
	}

	/**
	* Sets the primary key of this muni.
	*
	* @param primaryKey the primary key of this muni
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_muni.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_muni.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the zip code of this muni.
	*
	* @param zipCode the zip code of this muni
	*/
	@Override
	public void setZipCode(java.lang.String zipCode) {
		_muni.setZipCode(zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MuniWrapper)) {
			return false;
		}

		MuniWrapper muniWrapper = (MuniWrapper)obj;

		if (Objects.equals(_muni, muniWrapper._muni)) {
			return true;
		}

		return false;
	}

	@Override
	public Muni getWrappedModel() {
		return _muni;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _muni.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _muni.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_muni.resetOriginalValues();
	}

	private final Muni _muni;
}