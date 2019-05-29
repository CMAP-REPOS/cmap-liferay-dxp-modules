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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ExtKeyAccomplishment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtKeyAccomplishment
 * @generated
 */
@ProviderType
public class ExtKeyAccomplishmentWrapper implements ExtKeyAccomplishment,
	ModelWrapper<ExtKeyAccomplishment> {
	public ExtKeyAccomplishmentWrapper(
		ExtKeyAccomplishment extKeyAccomplishment) {
		_extKeyAccomplishment = extKeyAccomplishment;
	}

	@Override
	public Class<?> getModelClass() {
		return ExtKeyAccomplishment.class;
	}

	@Override
	public String getModelClassName() {
		return ExtKeyAccomplishment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("extKeyAccomplishmentId", getExtKeyAccomplishmentId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("locationOrSetting", getLocationOrSetting());
		attributes.put("description", getDescription());
		attributes.put("priority", getPriority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long extKeyAccomplishmentId = (Long)attributes.get(
				"extKeyAccomplishmentId");

		if (extKeyAccomplishmentId != null) {
			setExtKeyAccomplishmentId(extKeyAccomplishmentId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String locationOrSetting = (String)attributes.get("locationOrSetting");

		if (locationOrSetting != null) {
			setLocationOrSetting(locationOrSetting);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Double priority = (Double)attributes.get("priority");

		if (priority != null) {
			setPriority(priority);
		}
	}

	@Override
	public Object clone() {
		return new ExtKeyAccomplishmentWrapper((ExtKeyAccomplishment)_extKeyAccomplishment.clone());
	}

	@Override
	public int compareTo(ExtKeyAccomplishment extKeyAccomplishment) {
		return _extKeyAccomplishment.compareTo(extKeyAccomplishment);
	}

	/**
	* Returns the company ID of this ext key accomplishment.
	*
	* @return the company ID of this ext key accomplishment
	*/
	@Override
	public long getCompanyId() {
		return _extKeyAccomplishment.getCompanyId();
	}

	/**
	* Returns the create date of this ext key accomplishment.
	*
	* @return the create date of this ext key accomplishment
	*/
	@Override
	public Date getCreateDate() {
		return _extKeyAccomplishment.getCreateDate();
	}

	/**
	* Returns the description of this ext key accomplishment.
	*
	* @return the description of this ext key accomplishment
	*/
	@Override
	public String getDescription() {
		return _extKeyAccomplishment.getDescription();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _extKeyAccomplishment.getExpandoBridge();
	}

	/**
	* Returns the ext key accomplishment ID of this ext key accomplishment.
	*
	* @return the ext key accomplishment ID of this ext key accomplishment
	*/
	@Override
	public long getExtKeyAccomplishmentId() {
		return _extKeyAccomplishment.getExtKeyAccomplishmentId();
	}

	/**
	* Returns the location or setting of this ext key accomplishment.
	*
	* @return the location or setting of this ext key accomplishment
	*/
	@Override
	public String getLocationOrSetting() {
		return _extKeyAccomplishment.getLocationOrSetting();
	}

	/**
	* Returns the modified date of this ext key accomplishment.
	*
	* @return the modified date of this ext key accomplishment
	*/
	@Override
	public Date getModifiedDate() {
		return _extKeyAccomplishment.getModifiedDate();
	}

	/**
	* Returns the primary key of this ext key accomplishment.
	*
	* @return the primary key of this ext key accomplishment
	*/
	@Override
	public long getPrimaryKey() {
		return _extKeyAccomplishment.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _extKeyAccomplishment.getPrimaryKeyObj();
	}

	/**
	* Returns the priority of this ext key accomplishment.
	*
	* @return the priority of this ext key accomplishment
	*/
	@Override
	public double getPriority() {
		return _extKeyAccomplishment.getPriority();
	}

	/**
	* Returns the user ID of this ext key accomplishment.
	*
	* @return the user ID of this ext key accomplishment
	*/
	@Override
	public long getUserId() {
		return _extKeyAccomplishment.getUserId();
	}

	/**
	* Returns the user uuid of this ext key accomplishment.
	*
	* @return the user uuid of this ext key accomplishment
	*/
	@Override
	public String getUserUuid() {
		return _extKeyAccomplishment.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _extKeyAccomplishment.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _extKeyAccomplishment.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _extKeyAccomplishment.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _extKeyAccomplishment.isNew();
	}

	@Override
	public void persist() {
		_extKeyAccomplishment.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_extKeyAccomplishment.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this ext key accomplishment.
	*
	* @param companyId the company ID of this ext key accomplishment
	*/
	@Override
	public void setCompanyId(long companyId) {
		_extKeyAccomplishment.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this ext key accomplishment.
	*
	* @param createDate the create date of this ext key accomplishment
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_extKeyAccomplishment.setCreateDate(createDate);
	}

	/**
	* Sets the description of this ext key accomplishment.
	*
	* @param description the description of this ext key accomplishment
	*/
	@Override
	public void setDescription(String description) {
		_extKeyAccomplishment.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_extKeyAccomplishment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_extKeyAccomplishment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_extKeyAccomplishment.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ext key accomplishment ID of this ext key accomplishment.
	*
	* @param extKeyAccomplishmentId the ext key accomplishment ID of this ext key accomplishment
	*/
	@Override
	public void setExtKeyAccomplishmentId(long extKeyAccomplishmentId) {
		_extKeyAccomplishment.setExtKeyAccomplishmentId(extKeyAccomplishmentId);
	}

	/**
	* Sets the location or setting of this ext key accomplishment.
	*
	* @param locationOrSetting the location or setting of this ext key accomplishment
	*/
	@Override
	public void setLocationOrSetting(String locationOrSetting) {
		_extKeyAccomplishment.setLocationOrSetting(locationOrSetting);
	}

	/**
	* Sets the modified date of this ext key accomplishment.
	*
	* @param modifiedDate the modified date of this ext key accomplishment
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_extKeyAccomplishment.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_extKeyAccomplishment.setNew(n);
	}

	/**
	* Sets the primary key of this ext key accomplishment.
	*
	* @param primaryKey the primary key of this ext key accomplishment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_extKeyAccomplishment.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_extKeyAccomplishment.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the priority of this ext key accomplishment.
	*
	* @param priority the priority of this ext key accomplishment
	*/
	@Override
	public void setPriority(double priority) {
		_extKeyAccomplishment.setPriority(priority);
	}

	/**
	* Sets the user ID of this ext key accomplishment.
	*
	* @param userId the user ID of this ext key accomplishment
	*/
	@Override
	public void setUserId(long userId) {
		_extKeyAccomplishment.setUserId(userId);
	}

	/**
	* Sets the user uuid of this ext key accomplishment.
	*
	* @param userUuid the user uuid of this ext key accomplishment
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_extKeyAccomplishment.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ExtKeyAccomplishment> toCacheModel() {
		return _extKeyAccomplishment.toCacheModel();
	}

	@Override
	public ExtKeyAccomplishment toEscapedModel() {
		return new ExtKeyAccomplishmentWrapper(_extKeyAccomplishment.toEscapedModel());
	}

	@Override
	public String toString() {
		return _extKeyAccomplishment.toString();
	}

	@Override
	public ExtKeyAccomplishment toUnescapedModel() {
		return new ExtKeyAccomplishmentWrapper(_extKeyAccomplishment.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _extKeyAccomplishment.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtKeyAccomplishmentWrapper)) {
			return false;
		}

		ExtKeyAccomplishmentWrapper extKeyAccomplishmentWrapper = (ExtKeyAccomplishmentWrapper)obj;

		if (Objects.equals(_extKeyAccomplishment,
					extKeyAccomplishmentWrapper._extKeyAccomplishment)) {
			return true;
		}

		return false;
	}

	@Override
	public ExtKeyAccomplishment getWrappedModel() {
		return _extKeyAccomplishment;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _extKeyAccomplishment.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _extKeyAccomplishment.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_extKeyAccomplishment.resetOriginalValues();
	}

	private final ExtKeyAccomplishment _extKeyAccomplishment;
}