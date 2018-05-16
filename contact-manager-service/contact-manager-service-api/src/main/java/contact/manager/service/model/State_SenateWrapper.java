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
 * This class is a wrapper for {@link State_Senate}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see State_Senate
 * @generated
 */
@ProviderType
public class State_SenateWrapper implements State_Senate,
	ModelWrapper<State_Senate> {
	public State_SenateWrapper(State_Senate state_Senate) {
		_state_Senate = state_Senate;
	}

	@Override
	public Class<?> getModelClass() {
		return State_Senate.class;
	}

	@Override
	public String getModelClassName() {
		return State_Senate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stateSenateId", getStateSenateId());
		attributes.put("stateSenateNumber", getStateSenateNumber());
		attributes.put("stateSenateName", getStateSenateName());
		attributes.put("zipCode", getZipCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long stateSenateId = (Long)attributes.get("stateSenateId");

		if (stateSenateId != null) {
			setStateSenateId(stateSenateId);
		}

		Integer stateSenateNumber = (Integer)attributes.get("stateSenateNumber");

		if (stateSenateNumber != null) {
			setStateSenateNumber(stateSenateNumber);
		}

		String stateSenateName = (String)attributes.get("stateSenateName");

		if (stateSenateName != null) {
			setStateSenateName(stateSenateName);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _state_Senate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _state_Senate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _state_Senate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _state_Senate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.State_Senate> toCacheModel() {
		return _state_Senate.toCacheModel();
	}

	@Override
	public contact.manager.service.model.State_Senate toEscapedModel() {
		return new State_SenateWrapper(_state_Senate.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.State_Senate toUnescapedModel() {
		return new State_SenateWrapper(_state_Senate.toUnescapedModel());
	}

	@Override
	public int compareTo(
		contact.manager.service.model.State_Senate state_Senate) {
		return _state_Senate.compareTo(state_Senate);
	}

	/**
	* Returns the state senate number of this state_ senate.
	*
	* @return the state senate number of this state_ senate
	*/
	@Override
	public int getStateSenateNumber() {
		return _state_Senate.getStateSenateNumber();
	}

	@Override
	public int hashCode() {
		return _state_Senate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _state_Senate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new State_SenateWrapper((State_Senate)_state_Senate.clone());
	}

	/**
	* Returns the state senate name of this state_ senate.
	*
	* @return the state senate name of this state_ senate
	*/
	@Override
	public java.lang.String getStateSenateName() {
		return _state_Senate.getStateSenateName();
	}

	/**
	* Returns the zip code of this state_ senate.
	*
	* @return the zip code of this state_ senate
	*/
	@Override
	public java.lang.String getZipCode() {
		return _state_Senate.getZipCode();
	}

	@Override
	public java.lang.String toString() {
		return _state_Senate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _state_Senate.toXmlString();
	}

	/**
	* Returns the primary key of this state_ senate.
	*
	* @return the primary key of this state_ senate
	*/
	@Override
	public long getPrimaryKey() {
		return _state_Senate.getPrimaryKey();
	}

	/**
	* Returns the state senate ID of this state_ senate.
	*
	* @return the state senate ID of this state_ senate
	*/
	@Override
	public long getStateSenateId() {
		return _state_Senate.getStateSenateId();
	}

	@Override
	public void persist() {
		_state_Senate.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_state_Senate.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_state_Senate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_state_Senate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_state_Senate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_state_Senate.setNew(n);
	}

	/**
	* Sets the primary key of this state_ senate.
	*
	* @param primaryKey the primary key of this state_ senate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_state_Senate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_state_Senate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the state senate ID of this state_ senate.
	*
	* @param stateSenateId the state senate ID of this state_ senate
	*/
	@Override
	public void setStateSenateId(long stateSenateId) {
		_state_Senate.setStateSenateId(stateSenateId);
	}

	/**
	* Sets the state senate name of this state_ senate.
	*
	* @param stateSenateName the state senate name of this state_ senate
	*/
	@Override
	public void setStateSenateName(java.lang.String stateSenateName) {
		_state_Senate.setStateSenateName(stateSenateName);
	}

	/**
	* Sets the state senate number of this state_ senate.
	*
	* @param stateSenateNumber the state senate number of this state_ senate
	*/
	@Override
	public void setStateSenateNumber(int stateSenateNumber) {
		_state_Senate.setStateSenateNumber(stateSenateNumber);
	}

	/**
	* Sets the zip code of this state_ senate.
	*
	* @param zipCode the zip code of this state_ senate
	*/
	@Override
	public void setZipCode(java.lang.String zipCode) {
		_state_Senate.setZipCode(zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof State_SenateWrapper)) {
			return false;
		}

		State_SenateWrapper state_SenateWrapper = (State_SenateWrapper)obj;

		if (Objects.equals(_state_Senate, state_SenateWrapper._state_Senate)) {
			return true;
		}

		return false;
	}

	@Override
	public State_Senate getWrappedModel() {
		return _state_Senate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _state_Senate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _state_Senate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_state_Senate.resetOriginalValues();
	}

	private final State_Senate _state_Senate;
}