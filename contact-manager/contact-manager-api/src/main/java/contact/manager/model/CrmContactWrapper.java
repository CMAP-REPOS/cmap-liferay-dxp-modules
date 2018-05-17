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
 * This class is a wrapper for {@link CrmContact}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContact
 * @generated
 */
@ProviderType
public class CrmContactWrapper implements CrmContact, ModelWrapper<CrmContact> {
	public CrmContactWrapper(CrmContact crmContact) {
		_crmContact = crmContact;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmContact.class;
	}

	@Override
	public String getModelClassName() {
		return CrmContact.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmContactId", getCrmContactId());
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

		Long crmContactId = (Long)attributes.get("crmContactId");

		if (crmContactId != null) {
			setCrmContactId(crmContactId);
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
		return _crmContact.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmContact.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmContact.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmContact.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmContact> toCacheModel() {
		return _crmContact.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmContact toEscapedModel() {
		return new CrmContactWrapper(_crmContact.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmContact toUnescapedModel() {
		return new CrmContactWrapper(_crmContact.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.model.CrmContact crmContact) {
		return _crmContact.compareTo(crmContact);
	}

	@Override
	public int hashCode() {
		return _crmContact.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmContact.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmContactWrapper((CrmContact)_crmContact.clone());
	}

	/**
	* Returns the user name of this CRM Contact.
	*
	* @return the user name of this CRM Contact
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmContact.getUserName();
	}

	/**
	* Returns the user uuid of this CRM Contact.
	*
	* @return the user uuid of this CRM Contact
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmContact.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM Contact.
	*
	* @return the uuid of this CRM Contact
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmContact.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _crmContact.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmContact.toXmlString();
	}

	/**
	* Returns the create date of this CRM Contact.
	*
	* @return the create date of this CRM Contact
	*/
	@Override
	public Date getCreateDate() {
		return _crmContact.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM Contact.
	*
	* @return the modified date of this CRM Contact
	*/
	@Override
	public Date getModifiedDate() {
		return _crmContact.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM Contact.
	*
	* @return the company ID of this CRM Contact
	*/
	@Override
	public long getCompanyId() {
		return _crmContact.getCompanyId();
	}

	/**
	* Returns the crm contact ID of this CRM Contact.
	*
	* @return the crm contact ID of this CRM Contact
	*/
	@Override
	public long getCrmContactId() {
		return _crmContact.getCrmContactId();
	}

	/**
	* Returns the group ID of this CRM Contact.
	*
	* @return the group ID of this CRM Contact
	*/
	@Override
	public long getGroupId() {
		return _crmContact.getGroupId();
	}

	/**
	* Returns the primary key of this CRM Contact.
	*
	* @return the primary key of this CRM Contact
	*/
	@Override
	public long getPrimaryKey() {
		return _crmContact.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM Contact.
	*
	* @return the user ID of this CRM Contact
	*/
	@Override
	public long getUserId() {
		return _crmContact.getUserId();
	}

	@Override
	public void persist() {
		_crmContact.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmContact.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM Contact.
	*
	* @param companyId the company ID of this CRM Contact
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmContact.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM Contact.
	*
	* @param createDate the create date of this CRM Contact
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmContact.setCreateDate(createDate);
	}

	/**
	* Sets the crm contact ID of this CRM Contact.
	*
	* @param crmContactId the crm contact ID of this CRM Contact
	*/
	@Override
	public void setCrmContactId(long crmContactId) {
		_crmContact.setCrmContactId(crmContactId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmContact.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmContact.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmContact.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM Contact.
	*
	* @param groupId the group ID of this CRM Contact
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmContact.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM Contact.
	*
	* @param modifiedDate the modified date of this CRM Contact
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmContact.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmContact.setNew(n);
	}

	/**
	* Sets the primary key of this CRM Contact.
	*
	* @param primaryKey the primary key of this CRM Contact
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmContact.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmContact.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM Contact.
	*
	* @param userId the user ID of this CRM Contact
	*/
	@Override
	public void setUserId(long userId) {
		_crmContact.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM Contact.
	*
	* @param userName the user name of this CRM Contact
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmContact.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM Contact.
	*
	* @param userUuid the user uuid of this CRM Contact
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmContact.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM Contact.
	*
	* @param uuid the uuid of this CRM Contact
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmContact.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmContactWrapper)) {
			return false;
		}

		CrmContactWrapper crmContactWrapper = (CrmContactWrapper)obj;

		if (Objects.equals(_crmContact, crmContactWrapper._crmContact)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmContact.getStagedModelType();
	}

	@Override
	public CrmContact getWrappedModel() {
		return _crmContact;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmContact.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmContact.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmContact.resetOriginalValues();
	}

	private final CrmContact _crmContact;
}