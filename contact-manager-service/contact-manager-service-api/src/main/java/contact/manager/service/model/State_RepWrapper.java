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
 * This class is a wrapper for {@link State_Rep}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see State_Rep
 * @generated
 */
@ProviderType
public class State_RepWrapper implements State_Rep, ModelWrapper<State_Rep> {
	public State_RepWrapper(State_Rep state_Rep) {
		_state_Rep = state_Rep;
	}

	@Override
	public Class<?> getModelClass() {
		return State_Rep.class;
	}

	@Override
	public String getModelClassName() {
		return State_Rep.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stateRepId", getStateRepId());
		attributes.put("stateRepNumber", getStateRepNumber());
		attributes.put("stateRepName", getStateRepName());
		attributes.put("zipCode", getZipCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long stateRepId = (Long)attributes.get("stateRepId");

		if (stateRepId != null) {
			setStateRepId(stateRepId);
		}

		Integer stateRepNumber = (Integer)attributes.get("stateRepNumber");

		if (stateRepNumber != null) {
			setStateRepNumber(stateRepNumber);
		}

		String stateRepName = (String)attributes.get("stateRepName");

		if (stateRepName != null) {
			setStateRepName(stateRepName);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _state_Rep.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _state_Rep.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _state_Rep.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _state_Rep.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.State_Rep> toCacheModel() {
		return _state_Rep.toCacheModel();
	}

	@Override
	public contact.manager.service.model.State_Rep toEscapedModel() {
		return new State_RepWrapper(_state_Rep.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.State_Rep toUnescapedModel() {
		return new State_RepWrapper(_state_Rep.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.service.model.State_Rep state_Rep) {
		return _state_Rep.compareTo(state_Rep);
	}

	/**
	* Returns the state rep number of this state_ rep.
	*
	* @return the state rep number of this state_ rep
	*/
	@Override
	public int getStateRepNumber() {
		return _state_Rep.getStateRepNumber();
	}

	@Override
	public int hashCode() {
		return _state_Rep.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _state_Rep.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new State_RepWrapper((State_Rep)_state_Rep.clone());
	}

	/**
	* Returns the state rep name of this state_ rep.
	*
	* @return the state rep name of this state_ rep
	*/
	@Override
	public java.lang.String getStateRepName() {
		return _state_Rep.getStateRepName();
	}

	/**
	* Returns the zip code of this state_ rep.
	*
	* @return the zip code of this state_ rep
	*/
	@Override
	public java.lang.String getZipCode() {
		return _state_Rep.getZipCode();
	}

	@Override
	public java.lang.String toString() {
		return _state_Rep.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _state_Rep.toXmlString();
	}

	/**
	* Returns the primary key of this state_ rep.
	*
	* @return the primary key of this state_ rep
	*/
	@Override
	public long getPrimaryKey() {
		return _state_Rep.getPrimaryKey();
	}

	/**
	* Returns the state rep ID of this state_ rep.
	*
	* @return the state rep ID of this state_ rep
	*/
	@Override
	public long getStateRepId() {
		return _state_Rep.getStateRepId();
	}

	@Override
	public void persist() {
		_state_Rep.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_state_Rep.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_state_Rep.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_state_Rep.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_state_Rep.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_state_Rep.setNew(n);
	}

	/**
	* Sets the primary key of this state_ rep.
	*
	* @param primaryKey the primary key of this state_ rep
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_state_Rep.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_state_Rep.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the state rep ID of this state_ rep.
	*
	* @param stateRepId the state rep ID of this state_ rep
	*/
	@Override
	public void setStateRepId(long stateRepId) {
		_state_Rep.setStateRepId(stateRepId);
	}

	/**
	* Sets the state rep name of this state_ rep.
	*
	* @param stateRepName the state rep name of this state_ rep
	*/
	@Override
	public void setStateRepName(java.lang.String stateRepName) {
		_state_Rep.setStateRepName(stateRepName);
	}

	/**
	* Sets the state rep number of this state_ rep.
	*
	* @param stateRepNumber the state rep number of this state_ rep
	*/
	@Override
	public void setStateRepNumber(int stateRepNumber) {
		_state_Rep.setStateRepNumber(stateRepNumber);
	}

	/**
	* Sets the zip code of this state_ rep.
	*
	* @param zipCode the zip code of this state_ rep
	*/
	@Override
	public void setZipCode(java.lang.String zipCode) {
		_state_Rep.setZipCode(zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof State_RepWrapper)) {
			return false;
		}

		State_RepWrapper state_RepWrapper = (State_RepWrapper)obj;

		if (Objects.equals(_state_Rep, state_RepWrapper._state_Rep)) {
			return true;
		}

		return false;
	}

	@Override
	public State_Rep getWrappedModel() {
		return _state_Rep;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _state_Rep.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _state_Rep.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_state_Rep.resetOriginalValues();
	}

	private final State_Rep _state_Rep;
}