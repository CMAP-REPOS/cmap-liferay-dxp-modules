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
 * This class is a wrapper for {@link CrmGroup}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmGroup
 * @generated
 */
@ProviderType
public class CrmGroupWrapper implements CrmGroup, ModelWrapper<CrmGroup> {
	public CrmGroupWrapper(CrmGroup crmGroup) {
		_crmGroup = crmGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmGroup.class;
	}

	@Override
	public String getModelClassName() {
		return CrmGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmGroupId", getCrmGroupId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("crmContactsCount", getCrmContactsCount());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long crmGroupId = (Long)attributes.get("crmGroupId");

		if (crmGroupId != null) {
			setCrmGroupId(crmGroupId);
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

		Long crmContactsCount = (Long)attributes.get("crmContactsCount");

		if (crmContactsCount != null) {
			setCrmContactsCount(crmContactsCount);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public Object clone() {
		return new CrmGroupWrapper((CrmGroup)_crmGroup.clone());
	}

	@Override
	public int compareTo(CrmGroup crmGroup) {
		return _crmGroup.compareTo(crmGroup);
	}

	/**
	* Returns the company ID of this CRM Group.
	*
	* @return the company ID of this CRM Group
	*/
	@Override
	public long getCompanyId() {
		return _crmGroup.getCompanyId();
	}

	/**
	* Returns the create date of this CRM Group.
	*
	* @return the create date of this CRM Group
	*/
	@Override
	public Date getCreateDate() {
		return _crmGroup.getCreateDate();
	}

	/**
	* Returns the crm contacts count of this CRM Group.
	*
	* @return the crm contacts count of this CRM Group
	*/
	@Override
	public long getCrmContactsCount() {
		return _crmGroup.getCrmContactsCount();
	}

	/**
	* Returns the crm group ID of this CRM Group.
	*
	* @return the crm group ID of this CRM Group
	*/
	@Override
	public long getCrmGroupId() {
		return _crmGroup.getCrmGroupId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmGroup.getExpandoBridge();
	}

	/**
	* Returns the group ID of this CRM Group.
	*
	* @return the group ID of this CRM Group
	*/
	@Override
	public long getGroupId() {
		return _crmGroup.getGroupId();
	}

	/**
	* Returns the modified date of this CRM Group.
	*
	* @return the modified date of this CRM Group
	*/
	@Override
	public Date getModifiedDate() {
		return _crmGroup.getModifiedDate();
	}

	/**
	* Returns the name of this CRM Group.
	*
	* @return the name of this CRM Group
	*/
	@Override
	public String getName() {
		return _crmGroup.getName();
	}

	/**
	* Returns the primary key of this CRM Group.
	*
	* @return the primary key of this CRM Group
	*/
	@Override
	public long getPrimaryKey() {
		return _crmGroup.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmGroup.getPrimaryKeyObj();
	}

	/**
	* Returns the status of this CRM Group.
	*
	* @return the status of this CRM Group
	*/
	@Override
	public String getStatus() {
		return _crmGroup.getStatus();
	}

	/**
	* Returns the user ID of this CRM Group.
	*
	* @return the user ID of this CRM Group
	*/
	@Override
	public long getUserId() {
		return _crmGroup.getUserId();
	}

	/**
	* Returns the user name of this CRM Group.
	*
	* @return the user name of this CRM Group
	*/
	@Override
	public String getUserName() {
		return _crmGroup.getUserName();
	}

	/**
	* Returns the user uuid of this CRM Group.
	*
	* @return the user uuid of this CRM Group
	*/
	@Override
	public String getUserUuid() {
		return _crmGroup.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM Group.
	*
	* @return the uuid of this CRM Group
	*/
	@Override
	public String getUuid() {
		return _crmGroup.getUuid();
	}

	@Override
	public int hashCode() {
		return _crmGroup.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _crmGroup.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmGroup.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmGroup.isNew();
	}

	@Override
	public void persist() {
		_crmGroup.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmGroup.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM Group.
	*
	* @param companyId the company ID of this CRM Group
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmGroup.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM Group.
	*
	* @param createDate the create date of this CRM Group
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmGroup.setCreateDate(createDate);
	}

	/**
	* Sets the crm contacts count of this CRM Group.
	*
	* @param crmContactsCount the crm contacts count of this CRM Group
	*/
	@Override
	public void setCrmContactsCount(long crmContactsCount) {
		_crmGroup.setCrmContactsCount(crmContactsCount);
	}

	/**
	* Sets the crm group ID of this CRM Group.
	*
	* @param crmGroupId the crm group ID of this CRM Group
	*/
	@Override
	public void setCrmGroupId(long crmGroupId) {
		_crmGroup.setCrmGroupId(crmGroupId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmGroup.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM Group.
	*
	* @param groupId the group ID of this CRM Group
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmGroup.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM Group.
	*
	* @param modifiedDate the modified date of this CRM Group
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmGroup.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this CRM Group.
	*
	* @param name the name of this CRM Group
	*/
	@Override
	public void setName(String name) {
		_crmGroup.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_crmGroup.setNew(n);
	}

	/**
	* Sets the primary key of this CRM Group.
	*
	* @param primaryKey the primary key of this CRM Group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmGroup.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this CRM Group.
	*
	* @param status the status of this CRM Group
	*/
	@Override
	public void setStatus(String status) {
		_crmGroup.setStatus(status);
	}

	/**
	* Sets the user ID of this CRM Group.
	*
	* @param userId the user ID of this CRM Group
	*/
	@Override
	public void setUserId(long userId) {
		_crmGroup.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM Group.
	*
	* @param userName the user name of this CRM Group
	*/
	@Override
	public void setUserName(String userName) {
		_crmGroup.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM Group.
	*
	* @param userUuid the user uuid of this CRM Group
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_crmGroup.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM Group.
	*
	* @param uuid the uuid of this CRM Group
	*/
	@Override
	public void setUuid(String uuid) {
		_crmGroup.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CrmGroup> toCacheModel() {
		return _crmGroup.toCacheModel();
	}

	@Override
	public CrmGroup toEscapedModel() {
		return new CrmGroupWrapper(_crmGroup.toEscapedModel());
	}

	@Override
	public String toString() {
		return _crmGroup.toString();
	}

	@Override
	public CrmGroup toUnescapedModel() {
		return new CrmGroupWrapper(_crmGroup.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _crmGroup.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmGroupWrapper)) {
			return false;
		}

		CrmGroupWrapper crmGroupWrapper = (CrmGroupWrapper)obj;

		if (Objects.equals(_crmGroup, crmGroupWrapper._crmGroup)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmGroup.getStagedModelType();
	}

	@Override
	public CrmGroup getWrappedModel() {
		return _crmGroup;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmGroup.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmGroup.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmGroup.resetOriginalValues();
	}

	private final CrmGroup _crmGroup;
}