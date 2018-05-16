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
 * This class is a wrapper for {@link US_Rep}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see US_Rep
 * @generated
 */
@ProviderType
public class US_RepWrapper implements US_Rep, ModelWrapper<US_Rep> {
	public US_RepWrapper(US_Rep us_Rep) {
		_us_Rep = us_Rep;
	}

	@Override
	public Class<?> getModelClass() {
		return US_Rep.class;
	}

	@Override
	public String getModelClassName() {
		return US_Rep.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("usRepId", getUsRepId());
		attributes.put("usRepNumber", getUsRepNumber());
		attributes.put("usRepName", getUsRepName());
		attributes.put("zipCode", getZipCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long usRepId = (Long)attributes.get("usRepId");

		if (usRepId != null) {
			setUsRepId(usRepId);
		}

		String usRepNumber = (String)attributes.get("usRepNumber");

		if (usRepNumber != null) {
			setUsRepNumber(usRepNumber);
		}

		String usRepName = (String)attributes.get("usRepName");

		if (usRepName != null) {
			setUsRepName(usRepName);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _us_Rep.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _us_Rep.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _us_Rep.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _us_Rep.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.US_Rep> toCacheModel() {
		return _us_Rep.toCacheModel();
	}

	@Override
	public contact.manager.service.model.US_Rep toEscapedModel() {
		return new US_RepWrapper(_us_Rep.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.US_Rep toUnescapedModel() {
		return new US_RepWrapper(_us_Rep.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.service.model.US_Rep us_Rep) {
		return _us_Rep.compareTo(us_Rep);
	}

	@Override
	public int hashCode() {
		return _us_Rep.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _us_Rep.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new US_RepWrapper((US_Rep)_us_Rep.clone());
	}

	/**
	* Returns the us rep name of this us_ rep.
	*
	* @return the us rep name of this us_ rep
	*/
	@Override
	public java.lang.String getUsRepName() {
		return _us_Rep.getUsRepName();
	}

	/**
	* Returns the us rep number of this us_ rep.
	*
	* @return the us rep number of this us_ rep
	*/
	@Override
	public java.lang.String getUsRepNumber() {
		return _us_Rep.getUsRepNumber();
	}

	/**
	* Returns the zip code of this us_ rep.
	*
	* @return the zip code of this us_ rep
	*/
	@Override
	public java.lang.String getZipCode() {
		return _us_Rep.getZipCode();
	}

	@Override
	public java.lang.String toString() {
		return _us_Rep.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _us_Rep.toXmlString();
	}

	/**
	* Returns the primary key of this us_ rep.
	*
	* @return the primary key of this us_ rep
	*/
	@Override
	public long getPrimaryKey() {
		return _us_Rep.getPrimaryKey();
	}

	/**
	* Returns the us rep ID of this us_ rep.
	*
	* @return the us rep ID of this us_ rep
	*/
	@Override
	public long getUsRepId() {
		return _us_Rep.getUsRepId();
	}

	@Override
	public void persist() {
		_us_Rep.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_us_Rep.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_us_Rep.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_us_Rep.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_us_Rep.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_us_Rep.setNew(n);
	}

	/**
	* Sets the primary key of this us_ rep.
	*
	* @param primaryKey the primary key of this us_ rep
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_us_Rep.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_us_Rep.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the us rep ID of this us_ rep.
	*
	* @param usRepId the us rep ID of this us_ rep
	*/
	@Override
	public void setUsRepId(long usRepId) {
		_us_Rep.setUsRepId(usRepId);
	}

	/**
	* Sets the us rep name of this us_ rep.
	*
	* @param usRepName the us rep name of this us_ rep
	*/
	@Override
	public void setUsRepName(java.lang.String usRepName) {
		_us_Rep.setUsRepName(usRepName);
	}

	/**
	* Sets the us rep number of this us_ rep.
	*
	* @param usRepNumber the us rep number of this us_ rep
	*/
	@Override
	public void setUsRepNumber(java.lang.String usRepNumber) {
		_us_Rep.setUsRepNumber(usRepNumber);
	}

	/**
	* Sets the zip code of this us_ rep.
	*
	* @param zipCode the zip code of this us_ rep
	*/
	@Override
	public void setZipCode(java.lang.String zipCode) {
		_us_Rep.setZipCode(zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof US_RepWrapper)) {
			return false;
		}

		US_RepWrapper us_RepWrapper = (US_RepWrapper)obj;

		if (Objects.equals(_us_Rep, us_RepWrapper._us_Rep)) {
			return true;
		}

		return false;
	}

	@Override
	public US_Rep getWrappedModel() {
		return _us_Rep;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _us_Rep.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _us_Rep.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_us_Rep.resetOriginalValues();
	}

	private final US_Rep _us_Rep;
}