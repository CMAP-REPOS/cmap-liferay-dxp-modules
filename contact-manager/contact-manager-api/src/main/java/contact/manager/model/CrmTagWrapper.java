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

package contact.manager.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CrmTag}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmTag
 * @generated
 */
@ProviderType
public class CrmTagWrapper implements CrmTag, ModelWrapper<CrmTag> {
	public CrmTagWrapper(CrmTag crmTag) {
		_crmTag = crmTag;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmTag.class;
	}

	@Override
	public String getModelClassName() {
		return CrmTag.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmTagId", getCrmTagId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long crmTagId = (Long)attributes.get("crmTagId");

		if (crmTagId != null) {
			setCrmTagId(crmTagId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _crmTag.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmTag.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmTag.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmTag.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmTag> toCacheModel() {
		return _crmTag.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmTag toEscapedModel() {
		return new CrmTagWrapper(_crmTag.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmTag toUnescapedModel() {
		return new CrmTagWrapper(_crmTag.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.model.CrmTag crmTag) {
		return _crmTag.compareTo(crmTag);
	}

	@Override
	public int hashCode() {
		return _crmTag.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmTag.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmTagWrapper((CrmTag)_crmTag.clone());
	}

	/**
	* Returns the name of this CRM Tag.
	*
	* @return the name of this CRM Tag
	*/
	@Override
	public java.lang.String getName() {
		return _crmTag.getName();
	}

	/**
	* Returns the user name of this CRM Tag.
	*
	* @return the user name of this CRM Tag
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmTag.getUserName();
	}

	/**
	* Returns the user uuid of this CRM Tag.
	*
	* @return the user uuid of this CRM Tag
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmTag.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM Tag.
	*
	* @return the uuid of this CRM Tag
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmTag.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _crmTag.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmTag.toXmlString();
	}

	/**
	* Returns the create date of this CRM Tag.
	*
	* @return the create date of this CRM Tag
	*/
	@Override
	public Date getCreateDate() {
		return _crmTag.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM Tag.
	*
	* @return the modified date of this CRM Tag
	*/
	@Override
	public Date getModifiedDate() {
		return _crmTag.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM Tag.
	*
	* @return the company ID of this CRM Tag
	*/
	@Override
	public long getCompanyId() {
		return _crmTag.getCompanyId();
	}

	/**
	* Returns the crm tag ID of this CRM Tag.
	*
	* @return the crm tag ID of this CRM Tag
	*/
	@Override
	public long getCrmTagId() {
		return _crmTag.getCrmTagId();
	}

	/**
	* Returns the group ID of this CRM Tag.
	*
	* @return the group ID of this CRM Tag
	*/
	@Override
	public long getGroupId() {
		return _crmTag.getGroupId();
	}

	/**
	* Returns the primary key of this CRM Tag.
	*
	* @return the primary key of this CRM Tag
	*/
	@Override
	public long getPrimaryKey() {
		return _crmTag.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM Tag.
	*
	* @return the user ID of this CRM Tag
	*/
	@Override
	public long getUserId() {
		return _crmTag.getUserId();
	}

	@Override
	public void persist() {
		_crmTag.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmTag.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM Tag.
	*
	* @param companyId the company ID of this CRM Tag
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmTag.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM Tag.
	*
	* @param createDate the create date of this CRM Tag
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmTag.setCreateDate(createDate);
	}

	/**
	* Sets the crm tag ID of this CRM Tag.
	*
	* @param crmTagId the crm tag ID of this CRM Tag
	*/
	@Override
	public void setCrmTagId(long crmTagId) {
		_crmTag.setCrmTagId(crmTagId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmTag.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmTag.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmTag.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM Tag.
	*
	* @param groupId the group ID of this CRM Tag
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmTag.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM Tag.
	*
	* @param modifiedDate the modified date of this CRM Tag
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmTag.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this CRM Tag.
	*
	* @param name the name of this CRM Tag
	*/
	@Override
	public void setName(java.lang.String name) {
		_crmTag.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_crmTag.setNew(n);
	}

	/**
	* Sets the primary key of this CRM Tag.
	*
	* @param primaryKey the primary key of this CRM Tag
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmTag.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmTag.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM Tag.
	*
	* @param userId the user ID of this CRM Tag
	*/
	@Override
	public void setUserId(long userId) {
		_crmTag.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM Tag.
	*
	* @param userName the user name of this CRM Tag
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmTag.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM Tag.
	*
	* @param userUuid the user uuid of this CRM Tag
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmTag.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM Tag.
	*
	* @param uuid the uuid of this CRM Tag
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmTag.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmTagWrapper)) {
			return false;
		}

		CrmTagWrapper crmTagWrapper = (CrmTagWrapper)obj;

		if (Objects.equals(_crmTag, crmTagWrapper._crmTag)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmTag.getStagedModelType();
	}

	@Override
	public CrmTag getWrappedModel() {
		return _crmTag;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmTag.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmTag.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmTag.resetOriginalValues();
	}

	private final CrmTag _crmTag;
}