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
 * This class is a wrapper for {@link CrmOutreachLog}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmOutreachLog
 * @generated
 */
@ProviderType
public class CrmOutreachLogWrapper implements CrmOutreachLog,
	ModelWrapper<CrmOutreachLog> {
	public CrmOutreachLogWrapper(CrmOutreachLog crmOutreachLog) {
		_crmOutreachLog = crmOutreachLog;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmOutreachLog.class;
	}

	@Override
	public String getModelClassName() {
		return CrmOutreachLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmOutreachLogId", getCrmOutreachLogId());
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

		Long crmOutreachLogId = (Long)attributes.get("crmOutreachLogId");

		if (crmOutreachLogId != null) {
			setCrmOutreachLogId(crmOutreachLogId);
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
		return _crmOutreachLog.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmOutreachLog.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmOutreachLog.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmOutreachLog.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmOutreachLog> toCacheModel() {
		return _crmOutreachLog.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmOutreachLog toEscapedModel() {
		return new CrmOutreachLogWrapper(_crmOutreachLog.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmOutreachLog toUnescapedModel() {
		return new CrmOutreachLogWrapper(_crmOutreachLog.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.model.CrmOutreachLog crmOutreachLog) {
		return _crmOutreachLog.compareTo(crmOutreachLog);
	}

	@Override
	public int hashCode() {
		return _crmOutreachLog.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmOutreachLog.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmOutreachLogWrapper((CrmOutreachLog)_crmOutreachLog.clone());
	}

	/**
	* Returns the user name of this CRM Outreach Log.
	*
	* @return the user name of this CRM Outreach Log
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmOutreachLog.getUserName();
	}

	/**
	* Returns the user uuid of this CRM Outreach Log.
	*
	* @return the user uuid of this CRM Outreach Log
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmOutreachLog.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM Outreach Log.
	*
	* @return the uuid of this CRM Outreach Log
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmOutreachLog.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _crmOutreachLog.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmOutreachLog.toXmlString();
	}

	/**
	* Returns the create date of this CRM Outreach Log.
	*
	* @return the create date of this CRM Outreach Log
	*/
	@Override
	public Date getCreateDate() {
		return _crmOutreachLog.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM Outreach Log.
	*
	* @return the modified date of this CRM Outreach Log
	*/
	@Override
	public Date getModifiedDate() {
		return _crmOutreachLog.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM Outreach Log.
	*
	* @return the company ID of this CRM Outreach Log
	*/
	@Override
	public long getCompanyId() {
		return _crmOutreachLog.getCompanyId();
	}

	/**
	* Returns the crm outreach log ID of this CRM Outreach Log.
	*
	* @return the crm outreach log ID of this CRM Outreach Log
	*/
	@Override
	public long getCrmOutreachLogId() {
		return _crmOutreachLog.getCrmOutreachLogId();
	}

	/**
	* Returns the group ID of this CRM Outreach Log.
	*
	* @return the group ID of this CRM Outreach Log
	*/
	@Override
	public long getGroupId() {
		return _crmOutreachLog.getGroupId();
	}

	/**
	* Returns the primary key of this CRM Outreach Log.
	*
	* @return the primary key of this CRM Outreach Log
	*/
	@Override
	public long getPrimaryKey() {
		return _crmOutreachLog.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM Outreach Log.
	*
	* @return the user ID of this CRM Outreach Log
	*/
	@Override
	public long getUserId() {
		return _crmOutreachLog.getUserId();
	}

	@Override
	public void persist() {
		_crmOutreachLog.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmOutreachLog.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM Outreach Log.
	*
	* @param companyId the company ID of this CRM Outreach Log
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmOutreachLog.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM Outreach Log.
	*
	* @param createDate the create date of this CRM Outreach Log
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmOutreachLog.setCreateDate(createDate);
	}

	/**
	* Sets the crm outreach log ID of this CRM Outreach Log.
	*
	* @param crmOutreachLogId the crm outreach log ID of this CRM Outreach Log
	*/
	@Override
	public void setCrmOutreachLogId(long crmOutreachLogId) {
		_crmOutreachLog.setCrmOutreachLogId(crmOutreachLogId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmOutreachLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmOutreachLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmOutreachLog.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM Outreach Log.
	*
	* @param groupId the group ID of this CRM Outreach Log
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmOutreachLog.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM Outreach Log.
	*
	* @param modifiedDate the modified date of this CRM Outreach Log
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmOutreachLog.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmOutreachLog.setNew(n);
	}

	/**
	* Sets the primary key of this CRM Outreach Log.
	*
	* @param primaryKey the primary key of this CRM Outreach Log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmOutreachLog.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmOutreachLog.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM Outreach Log.
	*
	* @param userId the user ID of this CRM Outreach Log
	*/
	@Override
	public void setUserId(long userId) {
		_crmOutreachLog.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM Outreach Log.
	*
	* @param userName the user name of this CRM Outreach Log
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmOutreachLog.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM Outreach Log.
	*
	* @param userUuid the user uuid of this CRM Outreach Log
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmOutreachLog.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM Outreach Log.
	*
	* @param uuid the uuid of this CRM Outreach Log
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmOutreachLog.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmOutreachLogWrapper)) {
			return false;
		}

		CrmOutreachLogWrapper crmOutreachLogWrapper = (CrmOutreachLogWrapper)obj;

		if (Objects.equals(_crmOutreachLog,
					crmOutreachLogWrapper._crmOutreachLog)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmOutreachLog.getStagedModelType();
	}

	@Override
	public CrmOutreachLog getWrappedModel() {
		return _crmOutreachLog;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmOutreachLog.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmOutreachLog.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmOutreachLog.resetOriginalValues();
	}

	private final CrmOutreachLog _crmOutreachLog;
}