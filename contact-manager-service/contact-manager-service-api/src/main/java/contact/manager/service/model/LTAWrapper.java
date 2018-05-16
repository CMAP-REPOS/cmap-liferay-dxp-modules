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
 * This class is a wrapper for {@link LTA}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LTA
 * @generated
 */
@ProviderType
public class LTAWrapper implements LTA, ModelWrapper<LTA> {
	public LTAWrapper(LTA lta) {
		_lta = lta;
	}

	@Override
	public Class<?> getModelClass() {
		return LTA.class;
	}

	@Override
	public String getModelClassName() {
		return LTA.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ltaId", getLtaId());
		attributes.put("ltaName", getLtaName());
		attributes.put("zipCode", getZipCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ltaId = (Long)attributes.get("ltaId");

		if (ltaId != null) {
			setLtaId(ltaId);
		}

		String ltaName = (String)attributes.get("ltaName");

		if (ltaName != null) {
			setLtaName(ltaName);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _lta.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _lta.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _lta.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _lta.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.LTA> toCacheModel() {
		return _lta.toCacheModel();
	}

	@Override
	public contact.manager.service.model.LTA toEscapedModel() {
		return new LTAWrapper(_lta.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.LTA toUnescapedModel() {
		return new LTAWrapper(_lta.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.service.model.LTA lta) {
		return _lta.compareTo(lta);
	}

	@Override
	public int hashCode() {
		return _lta.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _lta.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LTAWrapper((LTA)_lta.clone());
	}

	/**
	* Returns the lta name of this lta.
	*
	* @return the lta name of this lta
	*/
	@Override
	public java.lang.String getLtaName() {
		return _lta.getLtaName();
	}

	/**
	* Returns the zip code of this lta.
	*
	* @return the zip code of this lta
	*/
	@Override
	public java.lang.String getZipCode() {
		return _lta.getZipCode();
	}

	@Override
	public java.lang.String toString() {
		return _lta.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lta.toXmlString();
	}

	/**
	* Returns the lta ID of this lta.
	*
	* @return the lta ID of this lta
	*/
	@Override
	public long getLtaId() {
		return _lta.getLtaId();
	}

	/**
	* Returns the primary key of this lta.
	*
	* @return the primary key of this lta
	*/
	@Override
	public long getPrimaryKey() {
		return _lta.getPrimaryKey();
	}

	@Override
	public void persist() {
		_lta.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lta.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_lta.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_lta.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_lta.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the lta ID of this lta.
	*
	* @param ltaId the lta ID of this lta
	*/
	@Override
	public void setLtaId(long ltaId) {
		_lta.setLtaId(ltaId);
	}

	/**
	* Sets the lta name of this lta.
	*
	* @param ltaName the lta name of this lta
	*/
	@Override
	public void setLtaName(java.lang.String ltaName) {
		_lta.setLtaName(ltaName);
	}

	@Override
	public void setNew(boolean n) {
		_lta.setNew(n);
	}

	/**
	* Sets the primary key of this lta.
	*
	* @param primaryKey the primary key of this lta
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lta.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_lta.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the zip code of this lta.
	*
	* @param zipCode the zip code of this lta
	*/
	@Override
	public void setZipCode(java.lang.String zipCode) {
		_lta.setZipCode(zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LTAWrapper)) {
			return false;
		}

		LTAWrapper ltaWrapper = (LTAWrapper)obj;

		if (Objects.equals(_lta, ltaWrapper._lta)) {
			return true;
		}

		return false;
	}

	@Override
	public LTA getWrappedModel() {
		return _lta;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _lta.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _lta.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_lta.resetOriginalValues();
	}

	private final LTA _lta;
}