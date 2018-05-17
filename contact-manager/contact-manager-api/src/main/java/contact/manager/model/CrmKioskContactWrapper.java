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
 * This class is a wrapper for {@link CrmKioskContact}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmKioskContact
 * @generated
 */
@ProviderType
public class CrmKioskContactWrapper implements CrmKioskContact,
	ModelWrapper<CrmKioskContact> {
	public CrmKioskContactWrapper(CrmKioskContact crmKioskContact) {
		_crmKioskContact = crmKioskContact;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmKioskContact.class;
	}

	@Override
	public String getModelClassName() {
		return CrmKioskContact.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmKioskContactId", getCrmKioskContactId());
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

		Long crmKioskContactId = (Long)attributes.get("crmKioskContactId");

		if (crmKioskContactId != null) {
			setCrmKioskContactId(crmKioskContactId);
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
		return _crmKioskContact.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmKioskContact.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmKioskContact.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmKioskContact.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmKioskContact> toCacheModel() {
		return _crmKioskContact.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmKioskContact toEscapedModel() {
		return new CrmKioskContactWrapper(_crmKioskContact.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmKioskContact toUnescapedModel() {
		return new CrmKioskContactWrapper(_crmKioskContact.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.model.CrmKioskContact crmKioskContact) {
		return _crmKioskContact.compareTo(crmKioskContact);
	}

	@Override
	public int hashCode() {
		return _crmKioskContact.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmKioskContact.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmKioskContactWrapper((CrmKioskContact)_crmKioskContact.clone());
	}

	/**
	* Returns the user name of this CRM Kiosk Contact.
	*
	* @return the user name of this CRM Kiosk Contact
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmKioskContact.getUserName();
	}

	/**
	* Returns the user uuid of this CRM Kiosk Contact.
	*
	* @return the user uuid of this CRM Kiosk Contact
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmKioskContact.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM Kiosk Contact.
	*
	* @return the uuid of this CRM Kiosk Contact
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmKioskContact.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _crmKioskContact.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmKioskContact.toXmlString();
	}

	/**
	* Returns the create date of this CRM Kiosk Contact.
	*
	* @return the create date of this CRM Kiosk Contact
	*/
	@Override
	public Date getCreateDate() {
		return _crmKioskContact.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM Kiosk Contact.
	*
	* @return the modified date of this CRM Kiosk Contact
	*/
	@Override
	public Date getModifiedDate() {
		return _crmKioskContact.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM Kiosk Contact.
	*
	* @return the company ID of this CRM Kiosk Contact
	*/
	@Override
	public long getCompanyId() {
		return _crmKioskContact.getCompanyId();
	}

	/**
	* Returns the crm kiosk contact ID of this CRM Kiosk Contact.
	*
	* @return the crm kiosk contact ID of this CRM Kiosk Contact
	*/
	@Override
	public long getCrmKioskContactId() {
		return _crmKioskContact.getCrmKioskContactId();
	}

	/**
	* Returns the group ID of this CRM Kiosk Contact.
	*
	* @return the group ID of this CRM Kiosk Contact
	*/
	@Override
	public long getGroupId() {
		return _crmKioskContact.getGroupId();
	}

	/**
	* Returns the primary key of this CRM Kiosk Contact.
	*
	* @return the primary key of this CRM Kiosk Contact
	*/
	@Override
	public long getPrimaryKey() {
		return _crmKioskContact.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM Kiosk Contact.
	*
	* @return the user ID of this CRM Kiosk Contact
	*/
	@Override
	public long getUserId() {
		return _crmKioskContact.getUserId();
	}

	@Override
	public void persist() {
		_crmKioskContact.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmKioskContact.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM Kiosk Contact.
	*
	* @param companyId the company ID of this CRM Kiosk Contact
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmKioskContact.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM Kiosk Contact.
	*
	* @param createDate the create date of this CRM Kiosk Contact
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmKioskContact.setCreateDate(createDate);
	}

	/**
	* Sets the crm kiosk contact ID of this CRM Kiosk Contact.
	*
	* @param crmKioskContactId the crm kiosk contact ID of this CRM Kiosk Contact
	*/
	@Override
	public void setCrmKioskContactId(long crmKioskContactId) {
		_crmKioskContact.setCrmKioskContactId(crmKioskContactId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmKioskContact.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmKioskContact.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmKioskContact.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM Kiosk Contact.
	*
	* @param groupId the group ID of this CRM Kiosk Contact
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmKioskContact.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM Kiosk Contact.
	*
	* @param modifiedDate the modified date of this CRM Kiosk Contact
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmKioskContact.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmKioskContact.setNew(n);
	}

	/**
	* Sets the primary key of this CRM Kiosk Contact.
	*
	* @param primaryKey the primary key of this CRM Kiosk Contact
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmKioskContact.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmKioskContact.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM Kiosk Contact.
	*
	* @param userId the user ID of this CRM Kiosk Contact
	*/
	@Override
	public void setUserId(long userId) {
		_crmKioskContact.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM Kiosk Contact.
	*
	* @param userName the user name of this CRM Kiosk Contact
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmKioskContact.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM Kiosk Contact.
	*
	* @param userUuid the user uuid of this CRM Kiosk Contact
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmKioskContact.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM Kiosk Contact.
	*
	* @param uuid the uuid of this CRM Kiosk Contact
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmKioskContact.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmKioskContactWrapper)) {
			return false;
		}

		CrmKioskContactWrapper crmKioskContactWrapper = (CrmKioskContactWrapper)obj;

		if (Objects.equals(_crmKioskContact,
					crmKioskContactWrapper._crmKioskContact)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmKioskContact.getStagedModelType();
	}

	@Override
	public CrmKioskContact getWrappedModel() {
		return _crmKioskContact;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmKioskContact.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmKioskContact.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmKioskContact.resetOriginalValues();
	}

	private final CrmKioskContact _crmKioskContact;
}