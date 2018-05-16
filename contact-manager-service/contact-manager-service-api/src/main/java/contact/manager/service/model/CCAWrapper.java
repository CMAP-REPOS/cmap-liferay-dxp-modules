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
 * This class is a wrapper for {@link CCA}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CCA
 * @generated
 */
@ProviderType
public class CCAWrapper implements CCA, ModelWrapper<CCA> {
	public CCAWrapper(CCA cca) {
		_cca = cca;
	}

	@Override
	public Class<?> getModelClass() {
		return CCA.class;
	}

	@Override
	public String getModelClassName() {
		return CCA.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ccaId", getCcaId());
		attributes.put("ccaName", getCcaName());
		attributes.put("zipCode", getZipCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ccaId = (Long)attributes.get("ccaId");

		if (ccaId != null) {
			setCcaId(ccaId);
		}

		String ccaName = (String)attributes.get("ccaName");

		if (ccaName != null) {
			setCcaName(ccaName);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _cca.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cca.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cca.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cca.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.CCA> toCacheModel() {
		return _cca.toCacheModel();
	}

	@Override
	public contact.manager.service.model.CCA toEscapedModel() {
		return new CCAWrapper(_cca.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.CCA toUnescapedModel() {
		return new CCAWrapper(_cca.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.service.model.CCA cca) {
		return _cca.compareTo(cca);
	}

	@Override
	public int hashCode() {
		return _cca.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cca.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CCAWrapper((CCA)_cca.clone());
	}

	/**
	* Returns the cca name of this cca.
	*
	* @return the cca name of this cca
	*/
	@Override
	public java.lang.String getCcaName() {
		return _cca.getCcaName();
	}

	/**
	* Returns the zip code of this cca.
	*
	* @return the zip code of this cca
	*/
	@Override
	public java.lang.String getZipCode() {
		return _cca.getZipCode();
	}

	@Override
	public java.lang.String toString() {
		return _cca.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cca.toXmlString();
	}

	/**
	* Returns the cca ID of this cca.
	*
	* @return the cca ID of this cca
	*/
	@Override
	public long getCcaId() {
		return _cca.getCcaId();
	}

	/**
	* Returns the primary key of this cca.
	*
	* @return the primary key of this cca
	*/
	@Override
	public long getPrimaryKey() {
		return _cca.getPrimaryKey();
	}

	@Override
	public void persist() {
		_cca.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cca.setCachedModel(cachedModel);
	}

	/**
	* Sets the cca ID of this cca.
	*
	* @param ccaId the cca ID of this cca
	*/
	@Override
	public void setCcaId(long ccaId) {
		_cca.setCcaId(ccaId);
	}

	/**
	* Sets the cca name of this cca.
	*
	* @param ccaName the cca name of this cca
	*/
	@Override
	public void setCcaName(java.lang.String ccaName) {
		_cca.setCcaName(ccaName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cca.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cca.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cca.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_cca.setNew(n);
	}

	/**
	* Sets the primary key of this cca.
	*
	* @param primaryKey the primary key of this cca
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cca.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cca.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the zip code of this cca.
	*
	* @param zipCode the zip code of this cca
	*/
	@Override
	public void setZipCode(java.lang.String zipCode) {
		_cca.setZipCode(zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CCAWrapper)) {
			return false;
		}

		CCAWrapper ccaWrapper = (CCAWrapper)obj;

		if (Objects.equals(_cca, ccaWrapper._cca)) {
			return true;
		}

		return false;
	}

	@Override
	public CCA getWrappedModel() {
		return _cca;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cca.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cca.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cca.resetOriginalValues();
	}

	private final CCA _cca;
}