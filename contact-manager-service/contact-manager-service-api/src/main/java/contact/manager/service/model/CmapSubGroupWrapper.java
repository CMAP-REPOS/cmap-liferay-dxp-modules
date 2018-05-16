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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CmapSubGroup}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CmapSubGroup
 * @generated
 */
@ProviderType
public class CmapSubGroupWrapper implements CmapSubGroup,
	ModelWrapper<CmapSubGroup> {
	public CmapSubGroupWrapper(CmapSubGroup cmapSubGroup) {
		_cmapSubGroup = cmapSubGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return CmapSubGroup.class;
	}

	@Override
	public String getModelClassName() {
		return CmapSubGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("subGroupId", getSubGroupId());
		attributes.put("subGroupName", getSubGroupName());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long subGroupId = (Long)attributes.get("subGroupId");

		if (subGroupId != null) {
			setSubGroupId(subGroupId);
		}

		String subGroupName = (String)attributes.get("subGroupName");

		if (subGroupName != null) {
			setSubGroupName(subGroupName);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _cmapSubGroup.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cmapSubGroup.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cmapSubGroup.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cmapSubGroup.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.CmapSubGroup> toCacheModel() {
		return _cmapSubGroup.toCacheModel();
	}

	@Override
	public contact.manager.service.model.CmapSubGroup toEscapedModel() {
		return new CmapSubGroupWrapper(_cmapSubGroup.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.CmapSubGroup toUnescapedModel() {
		return new CmapSubGroupWrapper(_cmapSubGroup.toUnescapedModel());
	}

	@Override
	public int compareTo(
		contact.manager.service.model.CmapSubGroup cmapSubGroup) {
		return _cmapSubGroup.compareTo(cmapSubGroup);
	}

	@Override
	public int hashCode() {
		return _cmapSubGroup.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cmapSubGroup.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CmapSubGroupWrapper((CmapSubGroup)_cmapSubGroup.clone());
	}

	/**
	* Returns the sub group name of this cmap sub group.
	*
	* @return the sub group name of this cmap sub group
	*/
	@Override
	public java.lang.String getSubGroupName() {
		return _cmapSubGroup.getSubGroupName();
	}

	@Override
	public java.lang.String toString() {
		return _cmapSubGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cmapSubGroup.toXmlString();
	}

	/**
	* Returns the create date of this cmap sub group.
	*
	* @return the create date of this cmap sub group
	*/
	@Override
	public Date getCreateDate() {
		return _cmapSubGroup.getCreateDate();
	}

	/**
	* Returns the modified date of this cmap sub group.
	*
	* @return the modified date of this cmap sub group
	*/
	@Override
	public Date getModifiedDate() {
		return _cmapSubGroup.getModifiedDate();
	}

	/**
	* Returns the group ID of this cmap sub group.
	*
	* @return the group ID of this cmap sub group
	*/
	@Override
	public long getGroupId() {
		return _cmapSubGroup.getGroupId();
	}

	/**
	* Returns the primary key of this cmap sub group.
	*
	* @return the primary key of this cmap sub group
	*/
	@Override
	public long getPrimaryKey() {
		return _cmapSubGroup.getPrimaryKey();
	}

	/**
	* Returns the sub group ID of this cmap sub group.
	*
	* @return the sub group ID of this cmap sub group
	*/
	@Override
	public long getSubGroupId() {
		return _cmapSubGroup.getSubGroupId();
	}

	@Override
	public void persist() {
		_cmapSubGroup.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cmapSubGroup.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this cmap sub group.
	*
	* @param createDate the create date of this cmap sub group
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_cmapSubGroup.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cmapSubGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cmapSubGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cmapSubGroup.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this cmap sub group.
	*
	* @param groupId the group ID of this cmap sub group
	*/
	@Override
	public void setGroupId(long groupId) {
		_cmapSubGroup.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this cmap sub group.
	*
	* @param modifiedDate the modified date of this cmap sub group
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_cmapSubGroup.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_cmapSubGroup.setNew(n);
	}

	/**
	* Sets the primary key of this cmap sub group.
	*
	* @param primaryKey the primary key of this cmap sub group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cmapSubGroup.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cmapSubGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sub group ID of this cmap sub group.
	*
	* @param subGroupId the sub group ID of this cmap sub group
	*/
	@Override
	public void setSubGroupId(long subGroupId) {
		_cmapSubGroup.setSubGroupId(subGroupId);
	}

	/**
	* Sets the sub group name of this cmap sub group.
	*
	* @param subGroupName the sub group name of this cmap sub group
	*/
	@Override
	public void setSubGroupName(java.lang.String subGroupName) {
		_cmapSubGroup.setSubGroupName(subGroupName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CmapSubGroupWrapper)) {
			return false;
		}

		CmapSubGroupWrapper cmapSubGroupWrapper = (CmapSubGroupWrapper)obj;

		if (Objects.equals(_cmapSubGroup, cmapSubGroupWrapper._cmapSubGroup)) {
			return true;
		}

		return false;
	}

	@Override
	public CmapSubGroup getWrappedModel() {
		return _cmapSubGroup;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cmapSubGroup.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cmapSubGroup.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cmapSubGroup.resetOriginalValues();
	}

	private final CmapSubGroup _cmapSubGroup;
}