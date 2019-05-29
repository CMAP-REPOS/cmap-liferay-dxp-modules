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
 * This class is a wrapper for {@link UccAssociation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccAssociation
 * @generated
 */
@ProviderType
public class UccAssociationWrapper implements UccAssociation,
	ModelWrapper<UccAssociation> {
	public UccAssociationWrapper(UccAssociation uccAssociation) {
		_uccAssociation = uccAssociation;
	}

	@Override
	public Class<?> getModelClass() {
		return UccAssociation.class;
	}

	@Override
	public String getModelClassName() {
		return UccAssociation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uccAssociationId", getUccAssociationId());
		attributes.put("uccConferenceId", getUccConferenceId());
		attributes.put("name", getName());
		attributes.put("abbreviation", getAbbreviation());
		attributes.put("myActive", isMyActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer uccAssociationId = (Integer)attributes.get("uccAssociationId");

		if (uccAssociationId != null) {
			setUccAssociationId(uccAssociationId);
		}

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

		Boolean myActive = (Boolean)attributes.get("myActive");

		if (myActive != null) {
			setMyActive(myActive);
		}
	}

	@Override
	public Object clone() {
		return new UccAssociationWrapper((UccAssociation)_uccAssociation.clone());
	}

	@Override
	public int compareTo(UccAssociation uccAssociation) {
		return _uccAssociation.compareTo(uccAssociation);
	}

	/**
	* Returns the abbreviation of this ucc association.
	*
	* @return the abbreviation of this ucc association
	*/
	@Override
	public String getAbbreviation() {
		return _uccAssociation.getAbbreviation();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _uccAssociation.getExpandoBridge();
	}

	/**
	* Returns the my active of this ucc association.
	*
	* @return the my active of this ucc association
	*/
	@Override
	public boolean getMyActive() {
		return _uccAssociation.getMyActive();
	}

	/**
	* Returns the name of this ucc association.
	*
	* @return the name of this ucc association
	*/
	@Override
	public String getName() {
		return _uccAssociation.getName();
	}

	/**
	* Returns the primary key of this ucc association.
	*
	* @return the primary key of this ucc association
	*/
	@Override
	public int getPrimaryKey() {
		return _uccAssociation.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _uccAssociation.getPrimaryKeyObj();
	}

	/**
	* Returns the ucc association ID of this ucc association.
	*
	* @return the ucc association ID of this ucc association
	*/
	@Override
	public int getUccAssociationId() {
		return _uccAssociation.getUccAssociationId();
	}

	/**
	* Returns the ucc conference ID of this ucc association.
	*
	* @return the ucc conference ID of this ucc association
	*/
	@Override
	public int getUccConferenceId() {
		return _uccAssociation.getUccConferenceId();
	}

	@Override
	public int hashCode() {
		return _uccAssociation.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _uccAssociation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _uccAssociation.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this ucc association is my active.
	*
	* @return <code>true</code> if this ucc association is my active; <code>false</code> otherwise
	*/
	@Override
	public boolean isMyActive() {
		return _uccAssociation.isMyActive();
	}

	@Override
	public boolean isNew() {
		return _uccAssociation.isNew();
	}

	@Override
	public void persist() {
		_uccAssociation.persist();
	}

	/**
	* Sets the abbreviation of this ucc association.
	*
	* @param abbreviation the abbreviation of this ucc association
	*/
	@Override
	public void setAbbreviation(String abbreviation) {
		_uccAssociation.setAbbreviation(abbreviation);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_uccAssociation.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_uccAssociation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_uccAssociation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_uccAssociation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets whether this ucc association is my active.
	*
	* @param myActive the my active of this ucc association
	*/
	@Override
	public void setMyActive(boolean myActive) {
		_uccAssociation.setMyActive(myActive);
	}

	/**
	* Sets the name of this ucc association.
	*
	* @param name the name of this ucc association
	*/
	@Override
	public void setName(String name) {
		_uccAssociation.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_uccAssociation.setNew(n);
	}

	/**
	* Sets the primary key of this ucc association.
	*
	* @param primaryKey the primary key of this ucc association
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_uccAssociation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_uccAssociation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the ucc association ID of this ucc association.
	*
	* @param uccAssociationId the ucc association ID of this ucc association
	*/
	@Override
	public void setUccAssociationId(int uccAssociationId) {
		_uccAssociation.setUccAssociationId(uccAssociationId);
	}

	/**
	* Sets the ucc conference ID of this ucc association.
	*
	* @param uccConferenceId the ucc conference ID of this ucc association
	*/
	@Override
	public void setUccConferenceId(int uccConferenceId) {
		_uccAssociation.setUccConferenceId(uccConferenceId);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<UccAssociation> toCacheModel() {
		return _uccAssociation.toCacheModel();
	}

	@Override
	public UccAssociation toEscapedModel() {
		return new UccAssociationWrapper(_uccAssociation.toEscapedModel());
	}

	@Override
	public String toString() {
		return _uccAssociation.toString();
	}

	@Override
	public UccAssociation toUnescapedModel() {
		return new UccAssociationWrapper(_uccAssociation.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _uccAssociation.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UccAssociationWrapper)) {
			return false;
		}

		UccAssociationWrapper uccAssociationWrapper = (UccAssociationWrapper)obj;

		if (Objects.equals(_uccAssociation,
					uccAssociationWrapper._uccAssociation)) {
			return true;
		}

		return false;
	}

	@Override
	public UccAssociation getWrappedModel() {
		return _uccAssociation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _uccAssociation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _uccAssociation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_uccAssociation.resetOriginalValues();
	}

	private final UccAssociation _uccAssociation;
}