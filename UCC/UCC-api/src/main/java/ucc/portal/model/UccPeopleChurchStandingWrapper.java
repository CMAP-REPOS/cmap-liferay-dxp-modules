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
 * This class is a wrapper for {@link UccPeopleChurchStanding}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccPeopleChurchStanding
 * @generated
 */
@ProviderType
public class UccPeopleChurchStandingWrapper implements UccPeopleChurchStanding,
	ModelWrapper<UccPeopleChurchStanding> {
	public UccPeopleChurchStandingWrapper(
		UccPeopleChurchStanding uccPeopleChurchStanding) {
		_uccPeopleChurchStanding = uccPeopleChurchStanding;
	}

	@Override
	public Class<?> getModelClass() {
		return UccPeopleChurchStanding.class;
	}

	@Override
	public String getModelClassName() {
		return UccPeopleChurchStanding.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uccPeopleChurchStandingId",
			getUccPeopleChurchStandingId());
		attributes.put("uccPeopleId", getUccPeopleId());
		attributes.put("uccConferenceId", getUccConferenceId());
		attributes.put("uccAssociationId", getUccAssociationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer uccPeopleChurchStandingId = (Integer)attributes.get(
				"uccPeopleChurchStandingId");

		if (uccPeopleChurchStandingId != null) {
			setUccPeopleChurchStandingId(uccPeopleChurchStandingId);
		}

		Integer uccPeopleId = (Integer)attributes.get("uccPeopleId");

		if (uccPeopleId != null) {
			setUccPeopleId(uccPeopleId);
		}

		Integer uccConferenceId = (Integer)attributes.get("uccConferenceId");

		if (uccConferenceId != null) {
			setUccConferenceId(uccConferenceId);
		}

		Integer uccAssociationId = (Integer)attributes.get("uccAssociationId");

		if (uccAssociationId != null) {
			setUccAssociationId(uccAssociationId);
		}
	}

	@Override
	public Object clone() {
		return new UccPeopleChurchStandingWrapper((UccPeopleChurchStanding)_uccPeopleChurchStanding.clone());
	}

	@Override
	public int compareTo(UccPeopleChurchStanding uccPeopleChurchStanding) {
		return _uccPeopleChurchStanding.compareTo(uccPeopleChurchStanding);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _uccPeopleChurchStanding.getExpandoBridge();
	}

	/**
	* Returns the primary key of this ucc people church standing.
	*
	* @return the primary key of this ucc people church standing
	*/
	@Override
	public int getPrimaryKey() {
		return _uccPeopleChurchStanding.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _uccPeopleChurchStanding.getPrimaryKeyObj();
	}

	/**
	* Returns the ucc association ID of this ucc people church standing.
	*
	* @return the ucc association ID of this ucc people church standing
	*/
	@Override
	public int getUccAssociationId() {
		return _uccPeopleChurchStanding.getUccAssociationId();
	}

	/**
	* Returns the ucc conference ID of this ucc people church standing.
	*
	* @return the ucc conference ID of this ucc people church standing
	*/
	@Override
	public int getUccConferenceId() {
		return _uccPeopleChurchStanding.getUccConferenceId();
	}

	/**
	* Returns the ucc people church standing ID of this ucc people church standing.
	*
	* @return the ucc people church standing ID of this ucc people church standing
	*/
	@Override
	public int getUccPeopleChurchStandingId() {
		return _uccPeopleChurchStanding.getUccPeopleChurchStandingId();
	}

	/**
	* Returns the ucc people ID of this ucc people church standing.
	*
	* @return the ucc people ID of this ucc people church standing
	*/
	@Override
	public int getUccPeopleId() {
		return _uccPeopleChurchStanding.getUccPeopleId();
	}

	@Override
	public int hashCode() {
		return _uccPeopleChurchStanding.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _uccPeopleChurchStanding.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _uccPeopleChurchStanding.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _uccPeopleChurchStanding.isNew();
	}

	@Override
	public void persist() {
		_uccPeopleChurchStanding.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_uccPeopleChurchStanding.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_uccPeopleChurchStanding.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_uccPeopleChurchStanding.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_uccPeopleChurchStanding.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_uccPeopleChurchStanding.setNew(n);
	}

	/**
	* Sets the primary key of this ucc people church standing.
	*
	* @param primaryKey the primary key of this ucc people church standing
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_uccPeopleChurchStanding.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_uccPeopleChurchStanding.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the ucc association ID of this ucc people church standing.
	*
	* @param uccAssociationId the ucc association ID of this ucc people church standing
	*/
	@Override
	public void setUccAssociationId(int uccAssociationId) {
		_uccPeopleChurchStanding.setUccAssociationId(uccAssociationId);
	}

	/**
	* Sets the ucc conference ID of this ucc people church standing.
	*
	* @param uccConferenceId the ucc conference ID of this ucc people church standing
	*/
	@Override
	public void setUccConferenceId(int uccConferenceId) {
		_uccPeopleChurchStanding.setUccConferenceId(uccConferenceId);
	}

	/**
	* Sets the ucc people church standing ID of this ucc people church standing.
	*
	* @param uccPeopleChurchStandingId the ucc people church standing ID of this ucc people church standing
	*/
	@Override
	public void setUccPeopleChurchStandingId(int uccPeopleChurchStandingId) {
		_uccPeopleChurchStanding.setUccPeopleChurchStandingId(uccPeopleChurchStandingId);
	}

	/**
	* Sets the ucc people ID of this ucc people church standing.
	*
	* @param uccPeopleId the ucc people ID of this ucc people church standing
	*/
	@Override
	public void setUccPeopleId(int uccPeopleId) {
		_uccPeopleChurchStanding.setUccPeopleId(uccPeopleId);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<UccPeopleChurchStanding> toCacheModel() {
		return _uccPeopleChurchStanding.toCacheModel();
	}

	@Override
	public UccPeopleChurchStanding toEscapedModel() {
		return new UccPeopleChurchStandingWrapper(_uccPeopleChurchStanding.toEscapedModel());
	}

	@Override
	public String toString() {
		return _uccPeopleChurchStanding.toString();
	}

	@Override
	public UccPeopleChurchStanding toUnescapedModel() {
		return new UccPeopleChurchStandingWrapper(_uccPeopleChurchStanding.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _uccPeopleChurchStanding.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UccPeopleChurchStandingWrapper)) {
			return false;
		}

		UccPeopleChurchStandingWrapper uccPeopleChurchStandingWrapper = (UccPeopleChurchStandingWrapper)obj;

		if (Objects.equals(_uccPeopleChurchStanding,
					uccPeopleChurchStandingWrapper._uccPeopleChurchStanding)) {
			return true;
		}

		return false;
	}

	@Override
	public UccPeopleChurchStanding getWrappedModel() {
		return _uccPeopleChurchStanding;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _uccPeopleChurchStanding.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _uccPeopleChurchStanding.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_uccPeopleChurchStanding.resetOriginalValues();
	}

	private final UccPeopleChurchStanding _uccPeopleChurchStanding;
}