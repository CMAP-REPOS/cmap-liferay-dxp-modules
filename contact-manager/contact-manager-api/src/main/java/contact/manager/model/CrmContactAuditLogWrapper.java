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
 * This class is a wrapper for {@link CrmContactAuditLog}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLog
 * @generated
 */
@ProviderType
public class CrmContactAuditLogWrapper implements CrmContactAuditLog,
	ModelWrapper<CrmContactAuditLog> {
	public CrmContactAuditLogWrapper(CrmContactAuditLog crmContactAuditLog) {
		_crmContactAuditLog = crmContactAuditLog;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmContactAuditLog.class;
	}

	@Override
	public String getModelClassName() {
		return CrmContactAuditLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmContactAuditLogId", getCrmContactAuditLogId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long crmContactAuditLogId = (Long)attributes.get("crmContactAuditLogId");

		if (crmContactAuditLogId != null) {
			setCrmContactAuditLogId(crmContactAuditLogId);
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
	}

	@Override
	public boolean isCachedModel() {
		return _crmContactAuditLog.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmContactAuditLog.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmContactAuditLog.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmContactAuditLog.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmContactAuditLog> toCacheModel() {
		return _crmContactAuditLog.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmContactAuditLog toEscapedModel() {
		return new CrmContactAuditLogWrapper(_crmContactAuditLog.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmContactAuditLog toUnescapedModel() {
		return new CrmContactAuditLogWrapper(_crmContactAuditLog.toUnescapedModel());
	}

	@Override
	public int compareTo(
		contact.manager.model.CrmContactAuditLog crmContactAuditLog) {
		return _crmContactAuditLog.compareTo(crmContactAuditLog);
	}

	@Override
	public int hashCode() {
		return _crmContactAuditLog.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmContactAuditLog.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmContactAuditLogWrapper((CrmContactAuditLog)_crmContactAuditLog.clone());
	}

	/**
	* Returns the user name of this CRM Contact Audit Log.
	*
	* @return the user name of this CRM Contact Audit Log
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmContactAuditLog.getUserName();
	}

	/**
	* Returns the user uuid of this CRM Contact Audit Log.
	*
	* @return the user uuid of this CRM Contact Audit Log
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmContactAuditLog.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM Contact Audit Log.
	*
	* @return the uuid of this CRM Contact Audit Log
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmContactAuditLog.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _crmContactAuditLog.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmContactAuditLog.toXmlString();
	}

	/**
	* Returns the create date of this CRM Contact Audit Log.
	*
	* @return the create date of this CRM Contact Audit Log
	*/
	@Override
	public Date getCreateDate() {
		return _crmContactAuditLog.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM Contact Audit Log.
	*
	* @return the modified date of this CRM Contact Audit Log
	*/
	@Override
	public Date getModifiedDate() {
		return _crmContactAuditLog.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM Contact Audit Log.
	*
	* @return the company ID of this CRM Contact Audit Log
	*/
	@Override
	public long getCompanyId() {
		return _crmContactAuditLog.getCompanyId();
	}

	/**
	* Returns the crm contact audit log ID of this CRM Contact Audit Log.
	*
	* @return the crm contact audit log ID of this CRM Contact Audit Log
	*/
	@Override
	public long getCrmContactAuditLogId() {
		return _crmContactAuditLog.getCrmContactAuditLogId();
	}

	/**
	* Returns the group ID of this CRM Contact Audit Log.
	*
	* @return the group ID of this CRM Contact Audit Log
	*/
	@Override
	public long getGroupId() {
		return _crmContactAuditLog.getGroupId();
	}

	/**
	* Returns the primary key of this CRM Contact Audit Log.
	*
	* @return the primary key of this CRM Contact Audit Log
	*/
	@Override
	public long getPrimaryKey() {
		return _crmContactAuditLog.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM Contact Audit Log.
	*
	* @return the user ID of this CRM Contact Audit Log
	*/
	@Override
	public long getUserId() {
		return _crmContactAuditLog.getUserId();
	}

	@Override
	public void persist() {
		_crmContactAuditLog.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmContactAuditLog.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM Contact Audit Log.
	*
	* @param companyId the company ID of this CRM Contact Audit Log
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmContactAuditLog.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM Contact Audit Log.
	*
	* @param createDate the create date of this CRM Contact Audit Log
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmContactAuditLog.setCreateDate(createDate);
	}

	/**
	* Sets the crm contact audit log ID of this CRM Contact Audit Log.
	*
	* @param crmContactAuditLogId the crm contact audit log ID of this CRM Contact Audit Log
	*/
	@Override
	public void setCrmContactAuditLogId(long crmContactAuditLogId) {
		_crmContactAuditLog.setCrmContactAuditLogId(crmContactAuditLogId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmContactAuditLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmContactAuditLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmContactAuditLog.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM Contact Audit Log.
	*
	* @param groupId the group ID of this CRM Contact Audit Log
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmContactAuditLog.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM Contact Audit Log.
	*
	* @param modifiedDate the modified date of this CRM Contact Audit Log
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmContactAuditLog.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmContactAuditLog.setNew(n);
	}

	/**
	* Sets the primary key of this CRM Contact Audit Log.
	*
	* @param primaryKey the primary key of this CRM Contact Audit Log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmContactAuditLog.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmContactAuditLog.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM Contact Audit Log.
	*
	* @param userId the user ID of this CRM Contact Audit Log
	*/
	@Override
	public void setUserId(long userId) {
		_crmContactAuditLog.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM Contact Audit Log.
	*
	* @param userName the user name of this CRM Contact Audit Log
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmContactAuditLog.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM Contact Audit Log.
	*
	* @param userUuid the user uuid of this CRM Contact Audit Log
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmContactAuditLog.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM Contact Audit Log.
	*
	* @param uuid the uuid of this CRM Contact Audit Log
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmContactAuditLog.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmContactAuditLogWrapper)) {
			return false;
		}

		CrmContactAuditLogWrapper crmContactAuditLogWrapper = (CrmContactAuditLogWrapper)obj;

		if (Objects.equals(_crmContactAuditLog,
					crmContactAuditLogWrapper._crmContactAuditLog)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmContactAuditLog.getStagedModelType();
	}

	@Override
	public CrmContactAuditLog getWrappedModel() {
		return _crmContactAuditLog;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmContactAuditLog.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmContactAuditLog.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmContactAuditLog.resetOriginalValues();
	}

	private final CrmContactAuditLog _crmContactAuditLog;
}