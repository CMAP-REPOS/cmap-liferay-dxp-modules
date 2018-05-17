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
 * This class is a wrapper for {@link CrmStateSenate}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateSenate
 * @generated
 */
@ProviderType
public class CrmStateSenateWrapper implements CrmStateSenate,
	ModelWrapper<CrmStateSenate> {
	public CrmStateSenateWrapper(CrmStateSenate crmStateSenate) {
		_crmStateSenate = crmStateSenate;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmStateSenate.class;
	}

	@Override
	public String getModelClassName() {
		return CrmStateSenate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmStateSenateId", getCrmStateSenateId());
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

		Long crmStateSenateId = (Long)attributes.get("crmStateSenateId");

		if (crmStateSenateId != null) {
			setCrmStateSenateId(crmStateSenateId);
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
		return _crmStateSenate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmStateSenate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmStateSenate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmStateSenate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmStateSenate> toCacheModel() {
		return _crmStateSenate.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmStateSenate toEscapedModel() {
		return new CrmStateSenateWrapper(_crmStateSenate.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmStateSenate toUnescapedModel() {
		return new CrmStateSenateWrapper(_crmStateSenate.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.model.CrmStateSenate crmStateSenate) {
		return _crmStateSenate.compareTo(crmStateSenate);
	}

	@Override
	public int hashCode() {
		return _crmStateSenate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmStateSenate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmStateSenateWrapper((CrmStateSenate)_crmStateSenate.clone());
	}

	/**
	* Returns the user name of this CRM State Senate.
	*
	* @return the user name of this CRM State Senate
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmStateSenate.getUserName();
	}

	/**
	* Returns the user uuid of this CRM State Senate.
	*
	* @return the user uuid of this CRM State Senate
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmStateSenate.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM State Senate.
	*
	* @return the uuid of this CRM State Senate
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmStateSenate.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _crmStateSenate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmStateSenate.toXmlString();
	}

	/**
	* Returns the create date of this CRM State Senate.
	*
	* @return the create date of this CRM State Senate
	*/
	@Override
	public Date getCreateDate() {
		return _crmStateSenate.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM State Senate.
	*
	* @return the modified date of this CRM State Senate
	*/
	@Override
	public Date getModifiedDate() {
		return _crmStateSenate.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM State Senate.
	*
	* @return the company ID of this CRM State Senate
	*/
	@Override
	public long getCompanyId() {
		return _crmStateSenate.getCompanyId();
	}

	/**
	* Returns the crm state senate ID of this CRM State Senate.
	*
	* @return the crm state senate ID of this CRM State Senate
	*/
	@Override
	public long getCrmStateSenateId() {
		return _crmStateSenate.getCrmStateSenateId();
	}

	/**
	* Returns the group ID of this CRM State Senate.
	*
	* @return the group ID of this CRM State Senate
	*/
	@Override
	public long getGroupId() {
		return _crmStateSenate.getGroupId();
	}

	/**
	* Returns the primary key of this CRM State Senate.
	*
	* @return the primary key of this CRM State Senate
	*/
	@Override
	public long getPrimaryKey() {
		return _crmStateSenate.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM State Senate.
	*
	* @return the user ID of this CRM State Senate
	*/
	@Override
	public long getUserId() {
		return _crmStateSenate.getUserId();
	}

	@Override
	public void persist() {
		_crmStateSenate.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmStateSenate.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM State Senate.
	*
	* @param companyId the company ID of this CRM State Senate
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmStateSenate.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM State Senate.
	*
	* @param createDate the create date of this CRM State Senate
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmStateSenate.setCreateDate(createDate);
	}

	/**
	* Sets the crm state senate ID of this CRM State Senate.
	*
	* @param crmStateSenateId the crm state senate ID of this CRM State Senate
	*/
	@Override
	public void setCrmStateSenateId(long crmStateSenateId) {
		_crmStateSenate.setCrmStateSenateId(crmStateSenateId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmStateSenate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmStateSenate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmStateSenate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM State Senate.
	*
	* @param groupId the group ID of this CRM State Senate
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmStateSenate.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM State Senate.
	*
	* @param modifiedDate the modified date of this CRM State Senate
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmStateSenate.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmStateSenate.setNew(n);
	}

	/**
	* Sets the primary key of this CRM State Senate.
	*
	* @param primaryKey the primary key of this CRM State Senate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmStateSenate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmStateSenate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM State Senate.
	*
	* @param userId the user ID of this CRM State Senate
	*/
	@Override
	public void setUserId(long userId) {
		_crmStateSenate.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM State Senate.
	*
	* @param userName the user name of this CRM State Senate
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmStateSenate.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM State Senate.
	*
	* @param userUuid the user uuid of this CRM State Senate
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmStateSenate.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM State Senate.
	*
	* @param uuid the uuid of this CRM State Senate
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmStateSenate.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmStateSenateWrapper)) {
			return false;
		}

		CrmStateSenateWrapper crmStateSenateWrapper = (CrmStateSenateWrapper)obj;

		if (Objects.equals(_crmStateSenate,
					crmStateSenateWrapper._crmStateSenate)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmStateSenate.getStagedModelType();
	}

	@Override
	public CrmStateSenate getWrappedModel() {
		return _crmStateSenate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmStateSenate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmStateSenate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmStateSenate.resetOriginalValues();
	}

	private final CrmStateSenate _crmStateSenate;
}