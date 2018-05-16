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
 * This class is a wrapper for {@link County_Commissioner_or_Board_Dist}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see County_Commissioner_or_Board_Dist
 * @generated
 */
@ProviderType
public class County_Commissioner_or_Board_DistWrapper
	implements County_Commissioner_or_Board_Dist,
		ModelWrapper<County_Commissioner_or_Board_Dist> {
	public County_Commissioner_or_Board_DistWrapper(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		_county_Commissioner_or_Board_Dist = county_Commissioner_or_Board_Dist;
	}

	@Override
	public Class<?> getModelClass() {
		return County_Commissioner_or_Board_Dist.class;
	}

	@Override
	public String getModelClassName() {
		return County_Commissioner_or_Board_Dist.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ccbdId", getCcbdId());
		attributes.put("ccbdNumber", getCcbdNumber());
		attributes.put("ccbdName", getCcbdName());
		attributes.put("zipCode", getZipCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ccbdId = (Long)attributes.get("ccbdId");

		if (ccbdId != null) {
			setCcbdId(ccbdId);
		}

		Integer ccbdNumber = (Integer)attributes.get("ccbdNumber");

		if (ccbdNumber != null) {
			setCcbdNumber(ccbdNumber);
		}

		String ccbdName = (String)attributes.get("ccbdName");

		if (ccbdName != null) {
			setCcbdName(ccbdName);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _county_Commissioner_or_Board_Dist.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _county_Commissioner_or_Board_Dist.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _county_Commissioner_or_Board_Dist.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _county_Commissioner_or_Board_Dist.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.County_Commissioner_or_Board_Dist> toCacheModel() {
		return _county_Commissioner_or_Board_Dist.toCacheModel();
	}

	@Override
	public contact.manager.service.model.County_Commissioner_or_Board_Dist toEscapedModel() {
		return new County_Commissioner_or_Board_DistWrapper(_county_Commissioner_or_Board_Dist.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.County_Commissioner_or_Board_Dist toUnescapedModel() {
		return new County_Commissioner_or_Board_DistWrapper(_county_Commissioner_or_Board_Dist.toUnescapedModel());
	}

	@Override
	public int compareTo(
		contact.manager.service.model.County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		return _county_Commissioner_or_Board_Dist.compareTo(county_Commissioner_or_Board_Dist);
	}

	/**
	* Returns the ccbd number of this county_ commissioner_or_ board_ dist.
	*
	* @return the ccbd number of this county_ commissioner_or_ board_ dist
	*/
	@Override
	public int getCcbdNumber() {
		return _county_Commissioner_or_Board_Dist.getCcbdNumber();
	}

	@Override
	public int hashCode() {
		return _county_Commissioner_or_Board_Dist.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _county_Commissioner_or_Board_Dist.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new County_Commissioner_or_Board_DistWrapper((County_Commissioner_or_Board_Dist)_county_Commissioner_or_Board_Dist.clone());
	}

	/**
	* Returns the ccbd name of this county_ commissioner_or_ board_ dist.
	*
	* @return the ccbd name of this county_ commissioner_or_ board_ dist
	*/
	@Override
	public java.lang.String getCcbdName() {
		return _county_Commissioner_or_Board_Dist.getCcbdName();
	}

	/**
	* Returns the zip code of this county_ commissioner_or_ board_ dist.
	*
	* @return the zip code of this county_ commissioner_or_ board_ dist
	*/
	@Override
	public java.lang.String getZipCode() {
		return _county_Commissioner_or_Board_Dist.getZipCode();
	}

	@Override
	public java.lang.String toString() {
		return _county_Commissioner_or_Board_Dist.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _county_Commissioner_or_Board_Dist.toXmlString();
	}

	/**
	* Returns the ccbd ID of this county_ commissioner_or_ board_ dist.
	*
	* @return the ccbd ID of this county_ commissioner_or_ board_ dist
	*/
	@Override
	public long getCcbdId() {
		return _county_Commissioner_or_Board_Dist.getCcbdId();
	}

	/**
	* Returns the primary key of this county_ commissioner_or_ board_ dist.
	*
	* @return the primary key of this county_ commissioner_or_ board_ dist
	*/
	@Override
	public long getPrimaryKey() {
		return _county_Commissioner_or_Board_Dist.getPrimaryKey();
	}

	@Override
	public void persist() {
		_county_Commissioner_or_Board_Dist.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_county_Commissioner_or_Board_Dist.setCachedModel(cachedModel);
	}

	/**
	* Sets the ccbd ID of this county_ commissioner_or_ board_ dist.
	*
	* @param ccbdId the ccbd ID of this county_ commissioner_or_ board_ dist
	*/
	@Override
	public void setCcbdId(long ccbdId) {
		_county_Commissioner_or_Board_Dist.setCcbdId(ccbdId);
	}

	/**
	* Sets the ccbd name of this county_ commissioner_or_ board_ dist.
	*
	* @param ccbdName the ccbd name of this county_ commissioner_or_ board_ dist
	*/
	@Override
	public void setCcbdName(java.lang.String ccbdName) {
		_county_Commissioner_or_Board_Dist.setCcbdName(ccbdName);
	}

	/**
	* Sets the ccbd number of this county_ commissioner_or_ board_ dist.
	*
	* @param ccbdNumber the ccbd number of this county_ commissioner_or_ board_ dist
	*/
	@Override
	public void setCcbdNumber(int ccbdNumber) {
		_county_Commissioner_or_Board_Dist.setCcbdNumber(ccbdNumber);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_county_Commissioner_or_Board_Dist.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_county_Commissioner_or_Board_Dist.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_county_Commissioner_or_Board_Dist.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_county_Commissioner_or_Board_Dist.setNew(n);
	}

	/**
	* Sets the primary key of this county_ commissioner_or_ board_ dist.
	*
	* @param primaryKey the primary key of this county_ commissioner_or_ board_ dist
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_county_Commissioner_or_Board_Dist.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_county_Commissioner_or_Board_Dist.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the zip code of this county_ commissioner_or_ board_ dist.
	*
	* @param zipCode the zip code of this county_ commissioner_or_ board_ dist
	*/
	@Override
	public void setZipCode(java.lang.String zipCode) {
		_county_Commissioner_or_Board_Dist.setZipCode(zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof County_Commissioner_or_Board_DistWrapper)) {
			return false;
		}

		County_Commissioner_or_Board_DistWrapper county_Commissioner_or_Board_DistWrapper =
			(County_Commissioner_or_Board_DistWrapper)obj;

		if (Objects.equals(_county_Commissioner_or_Board_Dist,
					county_Commissioner_or_Board_DistWrapper._county_Commissioner_or_Board_Dist)) {
			return true;
		}

		return false;
	}

	@Override
	public County_Commissioner_or_Board_Dist getWrappedModel() {
		return _county_Commissioner_or_Board_Dist;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _county_Commissioner_or_Board_Dist.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _county_Commissioner_or_Board_Dist.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_county_Commissioner_or_Board_Dist.resetOriginalValues();
	}

	private final County_Commissioner_or_Board_Dist _county_Commissioner_or_Board_Dist;
}