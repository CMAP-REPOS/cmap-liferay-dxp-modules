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
 * This class is a wrapper for {@link CmapGroup}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CmapGroup
 * @generated
 */
@ProviderType
public class CmapGroupWrapper implements CmapGroup, ModelWrapper<CmapGroup> {
	public CmapGroupWrapper(CmapGroup cmapGroup) {
		_cmapGroup = cmapGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return CmapGroup.class;
	}

	@Override
	public String getModelClassName() {
		return CmapGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("groupId", getGroupId());
		attributes.put("groupName", getGroupName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String groupName = (String)attributes.get("groupName");

		if (groupName != null) {
			setGroupName(groupName);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _cmapGroup.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cmapGroup.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cmapGroup.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cmapGroup.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.CmapGroup> toCacheModel() {
		return _cmapGroup.toCacheModel();
	}

	@Override
	public contact.manager.service.model.CmapGroup toEscapedModel() {
		return new CmapGroupWrapper(_cmapGroup.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.CmapGroup toUnescapedModel() {
		return new CmapGroupWrapper(_cmapGroup.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.service.model.CmapGroup cmapGroup) {
		return _cmapGroup.compareTo(cmapGroup);
	}

	@Override
	public int hashCode() {
		return _cmapGroup.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cmapGroup.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CmapGroupWrapper((CmapGroup)_cmapGroup.clone());
	}

	/**
	* Returns the group name of this cmap group.
	*
	* @return the group name of this cmap group
	*/
	@Override
	public java.lang.String getGroupName() {
		return _cmapGroup.getGroupName();
	}

	@Override
	public java.lang.String toString() {
		return _cmapGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cmapGroup.toXmlString();
	}

	/**
	* Returns the group ID of this cmap group.
	*
	* @return the group ID of this cmap group
	*/
	@Override
	public long getGroupId() {
		return _cmapGroup.getGroupId();
	}

	/**
	* Returns the primary key of this cmap group.
	*
	* @return the primary key of this cmap group
	*/
	@Override
	public long getPrimaryKey() {
		return _cmapGroup.getPrimaryKey();
	}

	@Override
	public void persist() {
		_cmapGroup.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cmapGroup.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cmapGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cmapGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cmapGroup.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this cmap group.
	*
	* @param groupId the group ID of this cmap group
	*/
	@Override
	public void setGroupId(long groupId) {
		_cmapGroup.setGroupId(groupId);
	}

	/**
	* Sets the group name of this cmap group.
	*
	* @param groupName the group name of this cmap group
	*/
	@Override
	public void setGroupName(java.lang.String groupName) {
		_cmapGroup.setGroupName(groupName);
	}

	@Override
	public void setNew(boolean n) {
		_cmapGroup.setNew(n);
	}

	/**
	* Sets the primary key of this cmap group.
	*
	* @param primaryKey the primary key of this cmap group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cmapGroup.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cmapGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CmapGroupWrapper)) {
			return false;
		}

		CmapGroupWrapper cmapGroupWrapper = (CmapGroupWrapper)obj;

		if (Objects.equals(_cmapGroup, cmapGroupWrapper._cmapGroup)) {
			return true;
		}

		return false;
	}

	@Override
	public CmapGroup getWrappedModel() {
		return _cmapGroup;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cmapGroup.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cmapGroup.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cmapGroup.resetOriginalValues();
	}

	private final CmapGroup _cmapGroup;
}