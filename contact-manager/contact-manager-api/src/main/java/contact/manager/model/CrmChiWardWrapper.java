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
 * This class is a wrapper for {@link CrmChiWard}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmChiWard
 * @generated
 */
@ProviderType
public class CrmChiWardWrapper implements CrmChiWard, ModelWrapper<CrmChiWard> {
	public CrmChiWardWrapper(CrmChiWard crmChiWard) {
		_crmChiWard = crmChiWard;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmChiWard.class;
	}

	@Override
	public String getModelClassName() {
		return CrmChiWard.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmChiWardId", getCrmChiWardId());
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

		Long crmChiWardId = (Long)attributes.get("crmChiWardId");

		if (crmChiWardId != null) {
			setCrmChiWardId(crmChiWardId);
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
		return _crmChiWard.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmChiWard.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmChiWard.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmChiWard.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmChiWard> toCacheModel() {
		return _crmChiWard.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmChiWard toEscapedModel() {
		return new CrmChiWardWrapper(_crmChiWard.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmChiWard toUnescapedModel() {
		return new CrmChiWardWrapper(_crmChiWard.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.model.CrmChiWard crmChiWard) {
		return _crmChiWard.compareTo(crmChiWard);
	}

	@Override
	public int hashCode() {
		return _crmChiWard.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmChiWard.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmChiWardWrapper((CrmChiWard)_crmChiWard.clone());
	}

	/**
	* Returns the user name of this CRM Chi Ward.
	*
	* @return the user name of this CRM Chi Ward
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmChiWard.getUserName();
	}

	/**
	* Returns the user uuid of this CRM Chi Ward.
	*
	* @return the user uuid of this CRM Chi Ward
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmChiWard.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM Chi Ward.
	*
	* @return the uuid of this CRM Chi Ward
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmChiWard.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _crmChiWard.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmChiWard.toXmlString();
	}

	/**
	* Returns the create date of this CRM Chi Ward.
	*
	* @return the create date of this CRM Chi Ward
	*/
	@Override
	public Date getCreateDate() {
		return _crmChiWard.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM Chi Ward.
	*
	* @return the modified date of this CRM Chi Ward
	*/
	@Override
	public Date getModifiedDate() {
		return _crmChiWard.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM Chi Ward.
	*
	* @return the company ID of this CRM Chi Ward
	*/
	@Override
	public long getCompanyId() {
		return _crmChiWard.getCompanyId();
	}

	/**
	* Returns the crm chi ward ID of this CRM Chi Ward.
	*
	* @return the crm chi ward ID of this CRM Chi Ward
	*/
	@Override
	public long getCrmChiWardId() {
		return _crmChiWard.getCrmChiWardId();
	}

	/**
	* Returns the group ID of this CRM Chi Ward.
	*
	* @return the group ID of this CRM Chi Ward
	*/
	@Override
	public long getGroupId() {
		return _crmChiWard.getGroupId();
	}

	/**
	* Returns the primary key of this CRM Chi Ward.
	*
	* @return the primary key of this CRM Chi Ward
	*/
	@Override
	public long getPrimaryKey() {
		return _crmChiWard.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM Chi Ward.
	*
	* @return the user ID of this CRM Chi Ward
	*/
	@Override
	public long getUserId() {
		return _crmChiWard.getUserId();
	}

	@Override
	public void persist() {
		_crmChiWard.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmChiWard.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM Chi Ward.
	*
	* @param companyId the company ID of this CRM Chi Ward
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmChiWard.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM Chi Ward.
	*
	* @param createDate the create date of this CRM Chi Ward
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmChiWard.setCreateDate(createDate);
	}

	/**
	* Sets the crm chi ward ID of this CRM Chi Ward.
	*
	* @param crmChiWardId the crm chi ward ID of this CRM Chi Ward
	*/
	@Override
	public void setCrmChiWardId(long crmChiWardId) {
		_crmChiWard.setCrmChiWardId(crmChiWardId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmChiWard.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmChiWard.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmChiWard.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM Chi Ward.
	*
	* @param groupId the group ID of this CRM Chi Ward
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmChiWard.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM Chi Ward.
	*
	* @param modifiedDate the modified date of this CRM Chi Ward
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmChiWard.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmChiWard.setNew(n);
	}

	/**
	* Sets the primary key of this CRM Chi Ward.
	*
	* @param primaryKey the primary key of this CRM Chi Ward
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmChiWard.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmChiWard.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM Chi Ward.
	*
	* @param userId the user ID of this CRM Chi Ward
	*/
	@Override
	public void setUserId(long userId) {
		_crmChiWard.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM Chi Ward.
	*
	* @param userName the user name of this CRM Chi Ward
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmChiWard.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM Chi Ward.
	*
	* @param userUuid the user uuid of this CRM Chi Ward
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmChiWard.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM Chi Ward.
	*
	* @param uuid the uuid of this CRM Chi Ward
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmChiWard.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmChiWardWrapper)) {
			return false;
		}

		CrmChiWardWrapper crmChiWardWrapper = (CrmChiWardWrapper)obj;

		if (Objects.equals(_crmChiWard, crmChiWardWrapper._crmChiWard)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmChiWard.getStagedModelType();
	}

	@Override
	public CrmChiWard getWrappedModel() {
		return _crmChiWard;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmChiWard.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmChiWard.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmChiWard.resetOriginalValues();
	}

	private final CrmChiWard _crmChiWard;
}