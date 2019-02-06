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
 * This class is a wrapper for {@link CrmContactAuditLogChange}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogChange
 * @generated
 */
@ProviderType
public class CrmContactAuditLogChangeWrapper implements CrmContactAuditLogChange,
	ModelWrapper<CrmContactAuditLogChange> {
	public CrmContactAuditLogChangeWrapper(
		CrmContactAuditLogChange crmContactAuditLogChange) {
		_crmContactAuditLogChange = crmContactAuditLogChange;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmContactAuditLogChange.class;
	}

	@Override
	public String getModelClassName() {
		return CrmContactAuditLogChange.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmContactAuditLogChangeId",
			getCrmContactAuditLogChangeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("crmContactAuditLogId", getCrmContactAuditLogId());
		attributes.put("fieldName", getFieldName());
		attributes.put("oldValue", getOldValue());
		attributes.put("newValue", getNewValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long crmContactAuditLogChangeId = (Long)attributes.get(
				"crmContactAuditLogChangeId");

		if (crmContactAuditLogChangeId != null) {
			setCrmContactAuditLogChangeId(crmContactAuditLogChangeId);
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

		Long crmContactAuditLogId = (Long)attributes.get("crmContactAuditLogId");

		if (crmContactAuditLogId != null) {
			setCrmContactAuditLogId(crmContactAuditLogId);
		}

		String fieldName = (String)attributes.get("fieldName");

		if (fieldName != null) {
			setFieldName(fieldName);
		}

		String oldValue = (String)attributes.get("oldValue");

		if (oldValue != null) {
			setOldValue(oldValue);
		}

		String newValue = (String)attributes.get("newValue");

		if (newValue != null) {
			setNewValue(newValue);
		}
	}

	@Override
	public Object clone() {
		return new CrmContactAuditLogChangeWrapper((CrmContactAuditLogChange)_crmContactAuditLogChange.clone());
	}

	@Override
	public int compareTo(CrmContactAuditLogChange crmContactAuditLogChange) {
		return _crmContactAuditLogChange.compareTo(crmContactAuditLogChange);
	}

	/**
	* Returns the company ID of this CRM Contact Audit Log Change.
	*
	* @return the company ID of this CRM Contact Audit Log Change
	*/
	@Override
	public long getCompanyId() {
		return _crmContactAuditLogChange.getCompanyId();
	}

	/**
	* Returns the create date of this CRM Contact Audit Log Change.
	*
	* @return the create date of this CRM Contact Audit Log Change
	*/
	@Override
	public Date getCreateDate() {
		return _crmContactAuditLogChange.getCreateDate();
	}

	/**
	* Returns the crm contact audit log change ID of this CRM Contact Audit Log Change.
	*
	* @return the crm contact audit log change ID of this CRM Contact Audit Log Change
	*/
	@Override
	public long getCrmContactAuditLogChangeId() {
		return _crmContactAuditLogChange.getCrmContactAuditLogChangeId();
	}

	/**
	* Returns the crm contact audit log ID of this CRM Contact Audit Log Change.
	*
	* @return the crm contact audit log ID of this CRM Contact Audit Log Change
	*/
	@Override
	public long getCrmContactAuditLogId() {
		return _crmContactAuditLogChange.getCrmContactAuditLogId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmContactAuditLogChange.getExpandoBridge();
	}

	/**
	* Returns the field name of this CRM Contact Audit Log Change.
	*
	* @return the field name of this CRM Contact Audit Log Change
	*/
	@Override
	public String getFieldName() {
		return _crmContactAuditLogChange.getFieldName();
	}

	/**
	* Returns the group ID of this CRM Contact Audit Log Change.
	*
	* @return the group ID of this CRM Contact Audit Log Change
	*/
	@Override
	public long getGroupId() {
		return _crmContactAuditLogChange.getGroupId();
	}

	/**
	* Returns the modified date of this CRM Contact Audit Log Change.
	*
	* @return the modified date of this CRM Contact Audit Log Change
	*/
	@Override
	public Date getModifiedDate() {
		return _crmContactAuditLogChange.getModifiedDate();
	}

	/**
	* Returns the new value of this CRM Contact Audit Log Change.
	*
	* @return the new value of this CRM Contact Audit Log Change
	*/
	@Override
	public String getNewValue() {
		return _crmContactAuditLogChange.getNewValue();
	}

	/**
	* Returns the old value of this CRM Contact Audit Log Change.
	*
	* @return the old value of this CRM Contact Audit Log Change
	*/
	@Override
	public String getOldValue() {
		return _crmContactAuditLogChange.getOldValue();
	}

	/**
	* Returns the primary key of this CRM Contact Audit Log Change.
	*
	* @return the primary key of this CRM Contact Audit Log Change
	*/
	@Override
	public long getPrimaryKey() {
		return _crmContactAuditLogChange.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmContactAuditLogChange.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this CRM Contact Audit Log Change.
	*
	* @return the user ID of this CRM Contact Audit Log Change
	*/
	@Override
	public long getUserId() {
		return _crmContactAuditLogChange.getUserId();
	}

	/**
	* Returns the user name of this CRM Contact Audit Log Change.
	*
	* @return the user name of this CRM Contact Audit Log Change
	*/
	@Override
	public String getUserName() {
		return _crmContactAuditLogChange.getUserName();
	}

	/**
	* Returns the user uuid of this CRM Contact Audit Log Change.
	*
	* @return the user uuid of this CRM Contact Audit Log Change
	*/
	@Override
	public String getUserUuid() {
		return _crmContactAuditLogChange.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM Contact Audit Log Change.
	*
	* @return the uuid of this CRM Contact Audit Log Change
	*/
	@Override
	public String getUuid() {
		return _crmContactAuditLogChange.getUuid();
	}

	@Override
	public int hashCode() {
		return _crmContactAuditLogChange.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _crmContactAuditLogChange.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmContactAuditLogChange.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmContactAuditLogChange.isNew();
	}

	@Override
	public void persist() {
		_crmContactAuditLogChange.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmContactAuditLogChange.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM Contact Audit Log Change.
	*
	* @param companyId the company ID of this CRM Contact Audit Log Change
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmContactAuditLogChange.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM Contact Audit Log Change.
	*
	* @param createDate the create date of this CRM Contact Audit Log Change
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmContactAuditLogChange.setCreateDate(createDate);
	}

	/**
	* Sets the crm contact audit log change ID of this CRM Contact Audit Log Change.
	*
	* @param crmContactAuditLogChangeId the crm contact audit log change ID of this CRM Contact Audit Log Change
	*/
	@Override
	public void setCrmContactAuditLogChangeId(long crmContactAuditLogChangeId) {
		_crmContactAuditLogChange.setCrmContactAuditLogChangeId(crmContactAuditLogChangeId);
	}

	/**
	* Sets the crm contact audit log ID of this CRM Contact Audit Log Change.
	*
	* @param crmContactAuditLogId the crm contact audit log ID of this CRM Contact Audit Log Change
	*/
	@Override
	public void setCrmContactAuditLogId(long crmContactAuditLogId) {
		_crmContactAuditLogChange.setCrmContactAuditLogId(crmContactAuditLogId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmContactAuditLogChange.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmContactAuditLogChange.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmContactAuditLogChange.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field name of this CRM Contact Audit Log Change.
	*
	* @param fieldName the field name of this CRM Contact Audit Log Change
	*/
	@Override
	public void setFieldName(String fieldName) {
		_crmContactAuditLogChange.setFieldName(fieldName);
	}

	/**
	* Sets the group ID of this CRM Contact Audit Log Change.
	*
	* @param groupId the group ID of this CRM Contact Audit Log Change
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmContactAuditLogChange.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM Contact Audit Log Change.
	*
	* @param modifiedDate the modified date of this CRM Contact Audit Log Change
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmContactAuditLogChange.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmContactAuditLogChange.setNew(n);
	}

	/**
	* Sets the new value of this CRM Contact Audit Log Change.
	*
	* @param newValue the new value of this CRM Contact Audit Log Change
	*/
	@Override
	public void setNewValue(String newValue) {
		_crmContactAuditLogChange.setNewValue(newValue);
	}

	/**
	* Sets the old value of this CRM Contact Audit Log Change.
	*
	* @param oldValue the old value of this CRM Contact Audit Log Change
	*/
	@Override
	public void setOldValue(String oldValue) {
		_crmContactAuditLogChange.setOldValue(oldValue);
	}

	/**
	* Sets the primary key of this CRM Contact Audit Log Change.
	*
	* @param primaryKey the primary key of this CRM Contact Audit Log Change
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmContactAuditLogChange.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmContactAuditLogChange.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM Contact Audit Log Change.
	*
	* @param userId the user ID of this CRM Contact Audit Log Change
	*/
	@Override
	public void setUserId(long userId) {
		_crmContactAuditLogChange.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM Contact Audit Log Change.
	*
	* @param userName the user name of this CRM Contact Audit Log Change
	*/
	@Override
	public void setUserName(String userName) {
		_crmContactAuditLogChange.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM Contact Audit Log Change.
	*
	* @param userUuid the user uuid of this CRM Contact Audit Log Change
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_crmContactAuditLogChange.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM Contact Audit Log Change.
	*
	* @param uuid the uuid of this CRM Contact Audit Log Change
	*/
	@Override
	public void setUuid(String uuid) {
		_crmContactAuditLogChange.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CrmContactAuditLogChange> toCacheModel() {
		return _crmContactAuditLogChange.toCacheModel();
	}

	@Override
	public CrmContactAuditLogChange toEscapedModel() {
		return new CrmContactAuditLogChangeWrapper(_crmContactAuditLogChange.toEscapedModel());
	}

	@Override
	public String toString() {
		return _crmContactAuditLogChange.toString();
	}

	@Override
	public CrmContactAuditLogChange toUnescapedModel() {
		return new CrmContactAuditLogChangeWrapper(_crmContactAuditLogChange.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _crmContactAuditLogChange.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmContactAuditLogChangeWrapper)) {
			return false;
		}

		CrmContactAuditLogChangeWrapper crmContactAuditLogChangeWrapper = (CrmContactAuditLogChangeWrapper)obj;

		if (Objects.equals(_crmContactAuditLogChange,
					crmContactAuditLogChangeWrapper._crmContactAuditLogChange)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmContactAuditLogChange.getStagedModelType();
	}

	@Override
	public CrmContactAuditLogChange getWrappedModel() {
		return _crmContactAuditLogChange;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmContactAuditLogChange.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmContactAuditLogChange.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmContactAuditLogChange.resetOriginalValues();
	}

	private final CrmContactAuditLogChange _crmContactAuditLogChange;
}