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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link UccConference}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccConference
 * @generated
 */
@ProviderType
public class UccConferenceWrapper implements UccConference,
	ModelWrapper<UccConference> {
	public UccConferenceWrapper(UccConference uccConference) {
		_uccConference = uccConference;
	}

	@Override
	public Class<?> getModelClass() {
		return UccConference.class;
	}

	@Override
	public String getModelClassName() {
		return UccConference.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uccConferenceId", getUccConferenceId());
		attributes.put("name", getName());
		attributes.put("abbreviation", getAbbreviation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer uccConferenceId = (Integer)attributes.get("uccConferenceId");

		if (uccConferenceId != null) {
			setUccConferenceId(uccConferenceId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String abbreviation = (String)attributes.get("abbreviation");

		if (abbreviation != null) {
			setAbbreviation(abbreviation);
		}
	}

	@Override
	public Object clone() {
		return new UccConferenceWrapper((UccConference)_uccConference.clone());
	}

	@Override
	public int compareTo(UccConference uccConference) {
		return _uccConference.compareTo(uccConference);
	}

	/**
	* Returns the abbreviation of this ucc conference.
	*
	* @return the abbreviation of this ucc conference
	*/
	@Override
	public String getAbbreviation() {
		return _uccConference.getAbbreviation();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _uccConference.getExpandoBridge();
	}

	/**
	* Returns the name of this ucc conference.
	*
	* @return the name of this ucc conference
	*/
	@Override
	public String getName() {
		return _uccConference.getName();
	}

	/**
	* Returns the primary key of this ucc conference.
	*
	* @return the primary key of this ucc conference
	*/
	@Override
	public int getPrimaryKey() {
		return _uccConference.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _uccConference.getPrimaryKeyObj();
	}

	/**
	* Returns the ucc conference ID of this ucc conference.
	*
	* @return the ucc conference ID of this ucc conference
	*/
	@Override
	public int getUccConferenceId() {
		return _uccConference.getUccConferenceId();
	}

	@Override
	public int hashCode() {
		return _uccConference.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _uccConference.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _uccConference.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _uccConference.isNew();
	}

	@Override
	public void persist() {
		_uccConference.persist();
	}

	/**
	* Sets the abbreviation of this ucc conference.
	*
	* @param abbreviation the abbreviation of this ucc conference
	*/
	@Override
	public void setAbbreviation(String abbreviation) {
		_uccConference.setAbbreviation(abbreviation);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_uccConference.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_uccConference.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_uccConference.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_uccConference.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the name of this ucc conference.
	*
	* @param name the name of this ucc conference
	*/
	@Override
	public void setName(String name) {
		_uccConference.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_uccConference.setNew(n);
	}

	/**
	* Sets the primary key of this ucc conference.
	*
	* @param primaryKey the primary key of this ucc conference
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_uccConference.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_uccConference.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the ucc conference ID of this ucc conference.
	*
	* @param uccConferenceId the ucc conference ID of this ucc conference
	*/
	@Override
	public void setUccConferenceId(int uccConferenceId) {
		_uccConference.setUccConferenceId(uccConferenceId);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<UccConference> toCacheModel() {
		return _uccConference.toCacheModel();
	}

	@Override
	public UccConference toEscapedModel() {
		return new UccConferenceWrapper(_uccConference.toEscapedModel());
	}

	@Override
	public String toString() {
		return _uccConference.toString();
	}

	@Override
	public UccConference toUnescapedModel() {
		return new UccConferenceWrapper(_uccConference.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _uccConference.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UccConferenceWrapper)) {
			return false;
		}

		UccConferenceWrapper uccConferenceWrapper = (UccConferenceWrapper)obj;

		if (Objects.equals(_uccConference, uccConferenceWrapper._uccConference)) {
			return true;
		}

		return false;
	}

	@Override
	public UccConference getWrappedModel() {
		return _uccConference;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _uccConference.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _uccConference.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_uccConference.resetOriginalValues();
	}

	private final UccConference _uccConference;
}