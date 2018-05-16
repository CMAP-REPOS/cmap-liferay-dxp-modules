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
 * This class is a wrapper for {@link ContactAuditLogChange}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLogChange
 * @generated
 */
@ProviderType
public class ContactAuditLogChangeWrapper implements ContactAuditLogChange,
	ModelWrapper<ContactAuditLogChange> {
	public ContactAuditLogChangeWrapper(
		ContactAuditLogChange contactAuditLogChange) {
		_contactAuditLogChange = contactAuditLogChange;
	}

	@Override
	public Class<?> getModelClass() {
		return ContactAuditLogChange.class;
	}

	@Override
	public String getModelClassName() {
		return ContactAuditLogChange.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contactAuditLogChangeId", getContactAuditLogChangeId());
		attributes.put("contactAuditLogId", getContactAuditLogId());
		attributes.put("fieldName", getFieldName());
		attributes.put("oldValue", getOldValue());
		attributes.put("newValue", getNewValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long contactAuditLogChangeId = (Long)attributes.get(
				"contactAuditLogChangeId");

		if (contactAuditLogChangeId != null) {
			setContactAuditLogChangeId(contactAuditLogChangeId);
		}

		Long contactAuditLogId = (Long)attributes.get("contactAuditLogId");

		if (contactAuditLogId != null) {
			setContactAuditLogId(contactAuditLogId);
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
	public boolean isCachedModel() {
		return _contactAuditLogChange.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _contactAuditLogChange.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _contactAuditLogChange.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _contactAuditLogChange.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.ContactAuditLogChange> toCacheModel() {
		return _contactAuditLogChange.toCacheModel();
	}

	@Override
	public contact.manager.service.model.ContactAuditLogChange toEscapedModel() {
		return new ContactAuditLogChangeWrapper(_contactAuditLogChange.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.ContactAuditLogChange toUnescapedModel() {
		return new ContactAuditLogChangeWrapper(_contactAuditLogChange.toUnescapedModel());
	}

	@Override
	public int compareTo(
		contact.manager.service.model.ContactAuditLogChange contactAuditLogChange) {
		return _contactAuditLogChange.compareTo(contactAuditLogChange);
	}

	@Override
	public int hashCode() {
		return _contactAuditLogChange.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contactAuditLogChange.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ContactAuditLogChangeWrapper((ContactAuditLogChange)_contactAuditLogChange.clone());
	}

	/**
	* Returns the field name of this contact audit log change.
	*
	* @return the field name of this contact audit log change
	*/
	@Override
	public java.lang.String getFieldName() {
		return _contactAuditLogChange.getFieldName();
	}

	/**
	* Returns the new value of this contact audit log change.
	*
	* @return the new value of this contact audit log change
	*/
	@Override
	public java.lang.String getNewValue() {
		return _contactAuditLogChange.getNewValue();
	}

	/**
	* Returns the old value of this contact audit log change.
	*
	* @return the old value of this contact audit log change
	*/
	@Override
	public java.lang.String getOldValue() {
		return _contactAuditLogChange.getOldValue();
	}

	@Override
	public java.lang.String toString() {
		return _contactAuditLogChange.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _contactAuditLogChange.toXmlString();
	}

	/**
	* Returns the contact audit log change ID of this contact audit log change.
	*
	* @return the contact audit log change ID of this contact audit log change
	*/
	@Override
	public long getContactAuditLogChangeId() {
		return _contactAuditLogChange.getContactAuditLogChangeId();
	}

	/**
	* Returns the contact audit log ID of this contact audit log change.
	*
	* @return the contact audit log ID of this contact audit log change
	*/
	@Override
	public long getContactAuditLogId() {
		return _contactAuditLogChange.getContactAuditLogId();
	}

	/**
	* Returns the primary key of this contact audit log change.
	*
	* @return the primary key of this contact audit log change
	*/
	@Override
	public long getPrimaryKey() {
		return _contactAuditLogChange.getPrimaryKey();
	}

	@Override
	public void persist() {
		_contactAuditLogChange.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_contactAuditLogChange.setCachedModel(cachedModel);
	}

	/**
	* Sets the contact audit log change ID of this contact audit log change.
	*
	* @param contactAuditLogChangeId the contact audit log change ID of this contact audit log change
	*/
	@Override
	public void setContactAuditLogChangeId(long contactAuditLogChangeId) {
		_contactAuditLogChange.setContactAuditLogChangeId(contactAuditLogChangeId);
	}

	/**
	* Sets the contact audit log ID of this contact audit log change.
	*
	* @param contactAuditLogId the contact audit log ID of this contact audit log change
	*/
	@Override
	public void setContactAuditLogId(long contactAuditLogId) {
		_contactAuditLogChange.setContactAuditLogId(contactAuditLogId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_contactAuditLogChange.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_contactAuditLogChange.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_contactAuditLogChange.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field name of this contact audit log change.
	*
	* @param fieldName the field name of this contact audit log change
	*/
	@Override
	public void setFieldName(java.lang.String fieldName) {
		_contactAuditLogChange.setFieldName(fieldName);
	}

	@Override
	public void setNew(boolean n) {
		_contactAuditLogChange.setNew(n);
	}

	/**
	* Sets the new value of this contact audit log change.
	*
	* @param newValue the new value of this contact audit log change
	*/
	@Override
	public void setNewValue(java.lang.String newValue) {
		_contactAuditLogChange.setNewValue(newValue);
	}

	/**
	* Sets the old value of this contact audit log change.
	*
	* @param oldValue the old value of this contact audit log change
	*/
	@Override
	public void setOldValue(java.lang.String oldValue) {
		_contactAuditLogChange.setOldValue(oldValue);
	}

	/**
	* Sets the primary key of this contact audit log change.
	*
	* @param primaryKey the primary key of this contact audit log change
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_contactAuditLogChange.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_contactAuditLogChange.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContactAuditLogChangeWrapper)) {
			return false;
		}

		ContactAuditLogChangeWrapper contactAuditLogChangeWrapper = (ContactAuditLogChangeWrapper)obj;

		if (Objects.equals(_contactAuditLogChange,
					contactAuditLogChangeWrapper._contactAuditLogChange)) {
			return true;
		}

		return false;
	}

	@Override
	public ContactAuditLogChange getWrappedModel() {
		return _contactAuditLogChange;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _contactAuditLogChange.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _contactAuditLogChange.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_contactAuditLogChange.resetOriginalValues();
	}

	private final ContactAuditLogChange _contactAuditLogChange;
}