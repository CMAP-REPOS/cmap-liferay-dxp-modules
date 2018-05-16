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
 * This class is a wrapper for {@link CmapTag}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CmapTag
 * @generated
 */
@ProviderType
public class CmapTagWrapper implements CmapTag, ModelWrapper<CmapTag> {
	public CmapTagWrapper(CmapTag cmapTag) {
		_cmapTag = cmapTag;
	}

	@Override
	public Class<?> getModelClass() {
		return CmapTag.class;
	}

	@Override
	public String getModelClassName() {
		return CmapTag.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tagId", getTagId());
		attributes.put("tagName", getTagName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tagId = (Long)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}

		String tagName = (String)attributes.get("tagName");

		if (tagName != null) {
			setTagName(tagName);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _cmapTag.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cmapTag.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cmapTag.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cmapTag.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.CmapTag> toCacheModel() {
		return _cmapTag.toCacheModel();
	}

	@Override
	public contact.manager.service.model.CmapTag toEscapedModel() {
		return new CmapTagWrapper(_cmapTag.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.CmapTag toUnescapedModel() {
		return new CmapTagWrapper(_cmapTag.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.service.model.CmapTag cmapTag) {
		return _cmapTag.compareTo(cmapTag);
	}

	@Override
	public int hashCode() {
		return _cmapTag.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cmapTag.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CmapTagWrapper((CmapTag)_cmapTag.clone());
	}

	/**
	* Returns the tag name of this cmap tag.
	*
	* @return the tag name of this cmap tag
	*/
	@Override
	public java.lang.String getTagName() {
		return _cmapTag.getTagName();
	}

	@Override
	public java.lang.String toString() {
		return _cmapTag.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cmapTag.toXmlString();
	}

	/**
	* Returns the primary key of this cmap tag.
	*
	* @return the primary key of this cmap tag
	*/
	@Override
	public long getPrimaryKey() {
		return _cmapTag.getPrimaryKey();
	}

	/**
	* Returns the tag ID of this cmap tag.
	*
	* @return the tag ID of this cmap tag
	*/
	@Override
	public long getTagId() {
		return _cmapTag.getTagId();
	}

	@Override
	public void persist() {
		_cmapTag.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cmapTag.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cmapTag.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cmapTag.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cmapTag.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_cmapTag.setNew(n);
	}

	/**
	* Sets the primary key of this cmap tag.
	*
	* @param primaryKey the primary key of this cmap tag
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cmapTag.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cmapTag.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tag ID of this cmap tag.
	*
	* @param tagId the tag ID of this cmap tag
	*/
	@Override
	public void setTagId(long tagId) {
		_cmapTag.setTagId(tagId);
	}

	/**
	* Sets the tag name of this cmap tag.
	*
	* @param tagName the tag name of this cmap tag
	*/
	@Override
	public void setTagName(java.lang.String tagName) {
		_cmapTag.setTagName(tagName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CmapTagWrapper)) {
			return false;
		}

		CmapTagWrapper cmapTagWrapper = (CmapTagWrapper)obj;

		if (Objects.equals(_cmapTag, cmapTagWrapper._cmapTag)) {
			return true;
		}

		return false;
	}

	@Override
	public CmapTag getWrappedModel() {
		return _cmapTag;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cmapTag.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cmapTag.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cmapTag.resetOriginalValues();
	}

	private final CmapTag _cmapTag;
}