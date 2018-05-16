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
 * This class is a wrapper for {@link ContactAuditLog}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLog
 * @generated
 */
@ProviderType
public class ContactAuditLogWrapper implements ContactAuditLog,
	ModelWrapper<ContactAuditLog> {
	public ContactAuditLogWrapper(ContactAuditLog contactAuditLog) {
		_contactAuditLog = contactAuditLog;
	}

	@Override
	public Class<?> getModelClass() {
		return ContactAuditLog.class;
	}

	@Override
	public String getModelClassName() {
		return ContactAuditLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contactAuditLogId", getContactAuditLogId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("action", getAction());
		attributes.put("constantContactId", getConstantContactId());
		attributes.put("oldSnapshot", getOldSnapshot());
		attributes.put("newSnapshot", getNewSnapshot());
		attributes.put("contactId", getContactId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long contactAuditLogId = (Long)attributes.get("contactAuditLogId");

		if (contactAuditLogId != null) {
			setContactAuditLogId(contactAuditLogId);
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

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String action = (String)attributes.get("action");

		if (action != null) {
			setAction(action);
		}

		Long constantContactId = (Long)attributes.get("constantContactId");

		if (constantContactId != null) {
			setConstantContactId(constantContactId);
		}

		String oldSnapshot = (String)attributes.get("oldSnapshot");

		if (oldSnapshot != null) {
			setOldSnapshot(oldSnapshot);
		}

		String newSnapshot = (String)attributes.get("newSnapshot");

		if (newSnapshot != null) {
			setNewSnapshot(newSnapshot);
		}

		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _contactAuditLog.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _contactAuditLog.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _contactAuditLog.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _contactAuditLog.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.ContactAuditLog> toCacheModel() {
		return _contactAuditLog.toCacheModel();
	}

	@Override
	public contact.manager.service.model.ContactAuditLog toEscapedModel() {
		return new ContactAuditLogWrapper(_contactAuditLog.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.ContactAuditLog toUnescapedModel() {
		return new ContactAuditLogWrapper(_contactAuditLog.toUnescapedModel());
	}

	@Override
	public int compareTo(
		contact.manager.service.model.ContactAuditLog contactAuditLog) {
		return _contactAuditLog.compareTo(contactAuditLog);
	}

	@Override
	public int hashCode() {
		return _contactAuditLog.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contactAuditLog.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ContactAuditLogWrapper((ContactAuditLog)_contactAuditLog.clone());
	}

	/**
	* Returns the action of this contact audit log.
	*
	* @return the action of this contact audit log
	*/
	@Override
	public java.lang.String getAction() {
		return _contactAuditLog.getAction();
	}

	/**
	* Returns the new snapshot of this contact audit log.
	*
	* @return the new snapshot of this contact audit log
	*/
	@Override
	public java.lang.String getNewSnapshot() {
		return _contactAuditLog.getNewSnapshot();
	}

	/**
	* Returns the old snapshot of this contact audit log.
	*
	* @return the old snapshot of this contact audit log
	*/
	@Override
	public java.lang.String getOldSnapshot() {
		return _contactAuditLog.getOldSnapshot();
	}

	/**
	* Returns the user uuid of this contact audit log.
	*
	* @return the user uuid of this contact audit log
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _contactAuditLog.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _contactAuditLog.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _contactAuditLog.toXmlString();
	}

	/**
	* Returns the create date of this contact audit log.
	*
	* @return the create date of this contact audit log
	*/
	@Override
	public Date getCreateDate() {
		return _contactAuditLog.getCreateDate();
	}

	/**
	* Returns the company ID of this contact audit log.
	*
	* @return the company ID of this contact audit log
	*/
	@Override
	public long getCompanyId() {
		return _contactAuditLog.getCompanyId();
	}

	/**
	* Returns the constant contact ID of this contact audit log.
	*
	* @return the constant contact ID of this contact audit log
	*/
	@Override
	public long getConstantContactId() {
		return _contactAuditLog.getConstantContactId();
	}

	/**
	* Returns the contact audit log ID of this contact audit log.
	*
	* @return the contact audit log ID of this contact audit log
	*/
	@Override
	public long getContactAuditLogId() {
		return _contactAuditLog.getContactAuditLogId();
	}

	/**
	* Returns the contact ID of this contact audit log.
	*
	* @return the contact ID of this contact audit log
	*/
	@Override
	public long getContactId() {
		return _contactAuditLog.getContactId();
	}

	/**
	* Returns the group ID of this contact audit log.
	*
	* @return the group ID of this contact audit log
	*/
	@Override
	public long getGroupId() {
		return _contactAuditLog.getGroupId();
	}

	/**
	* Returns the primary key of this contact audit log.
	*
	* @return the primary key of this contact audit log
	*/
	@Override
	public long getPrimaryKey() {
		return _contactAuditLog.getPrimaryKey();
	}

	/**
	* Returns the user ID of this contact audit log.
	*
	* @return the user ID of this contact audit log
	*/
	@Override
	public long getUserId() {
		return _contactAuditLog.getUserId();
	}

	@Override
	public void persist() {
		_contactAuditLog.persist();
	}

	/**
	* Sets the action of this contact audit log.
	*
	* @param action the action of this contact audit log
	*/
	@Override
	public void setAction(java.lang.String action) {
		_contactAuditLog.setAction(action);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_contactAuditLog.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this contact audit log.
	*
	* @param companyId the company ID of this contact audit log
	*/
	@Override
	public void setCompanyId(long companyId) {
		_contactAuditLog.setCompanyId(companyId);
	}

	/**
	* Sets the constant contact ID of this contact audit log.
	*
	* @param constantContactId the constant contact ID of this contact audit log
	*/
	@Override
	public void setConstantContactId(long constantContactId) {
		_contactAuditLog.setConstantContactId(constantContactId);
	}

	/**
	* Sets the contact audit log ID of this contact audit log.
	*
	* @param contactAuditLogId the contact audit log ID of this contact audit log
	*/
	@Override
	public void setContactAuditLogId(long contactAuditLogId) {
		_contactAuditLog.setContactAuditLogId(contactAuditLogId);
	}

	/**
	* Sets the contact ID of this contact audit log.
	*
	* @param contactId the contact ID of this contact audit log
	*/
	@Override
	public void setContactId(long contactId) {
		_contactAuditLog.setContactId(contactId);
	}

	/**
	* Sets the create date of this contact audit log.
	*
	* @param createDate the create date of this contact audit log
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_contactAuditLog.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_contactAuditLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_contactAuditLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_contactAuditLog.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this contact audit log.
	*
	* @param groupId the group ID of this contact audit log
	*/
	@Override
	public void setGroupId(long groupId) {
		_contactAuditLog.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_contactAuditLog.setNew(n);
	}

	/**
	* Sets the new snapshot of this contact audit log.
	*
	* @param newSnapshot the new snapshot of this contact audit log
	*/
	@Override
	public void setNewSnapshot(java.lang.String newSnapshot) {
		_contactAuditLog.setNewSnapshot(newSnapshot);
	}

	/**
	* Sets the old snapshot of this contact audit log.
	*
	* @param oldSnapshot the old snapshot of this contact audit log
	*/
	@Override
	public void setOldSnapshot(java.lang.String oldSnapshot) {
		_contactAuditLog.setOldSnapshot(oldSnapshot);
	}

	/**
	* Sets the primary key of this contact audit log.
	*
	* @param primaryKey the primary key of this contact audit log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_contactAuditLog.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_contactAuditLog.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this contact audit log.
	*
	* @param userId the user ID of this contact audit log
	*/
	@Override
	public void setUserId(long userId) {
		_contactAuditLog.setUserId(userId);
	}

	/**
	* Sets the user uuid of this contact audit log.
	*
	* @param userUuid the user uuid of this contact audit log
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_contactAuditLog.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContactAuditLogWrapper)) {
			return false;
		}

		ContactAuditLogWrapper contactAuditLogWrapper = (ContactAuditLogWrapper)obj;

		if (Objects.equals(_contactAuditLog,
					contactAuditLogWrapper._contactAuditLog)) {
			return true;
		}

		return false;
	}

	@Override
	public ContactAuditLog getWrappedModel() {
		return _contactAuditLog;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _contactAuditLog.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _contactAuditLog.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_contactAuditLog.resetOriginalValues();
	}

	private final ContactAuditLog _contactAuditLog;
}