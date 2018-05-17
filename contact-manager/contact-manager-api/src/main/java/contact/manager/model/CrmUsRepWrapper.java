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
 * This class is a wrapper for {@link CrmUsRep}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmUsRep
 * @generated
 */
@ProviderType
public class CrmUsRepWrapper implements CrmUsRep, ModelWrapper<CrmUsRep> {
	public CrmUsRepWrapper(CrmUsRep crmUsRep) {
		_crmUsRep = crmUsRep;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmUsRep.class;
	}

	@Override
	public String getModelClassName() {
		return CrmUsRep.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmUsRepId", getCrmUsRepId());
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

		Long crmUsRepId = (Long)attributes.get("crmUsRepId");

		if (crmUsRepId != null) {
			setCrmUsRepId(crmUsRepId);
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
		return _crmUsRep.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmUsRep.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmUsRep.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmUsRep.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmUsRep> toCacheModel() {
		return _crmUsRep.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmUsRep toEscapedModel() {
		return new CrmUsRepWrapper(_crmUsRep.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmUsRep toUnescapedModel() {
		return new CrmUsRepWrapper(_crmUsRep.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.model.CrmUsRep crmUsRep) {
		return _crmUsRep.compareTo(crmUsRep);
	}

	@Override
	public int hashCode() {
		return _crmUsRep.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmUsRep.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmUsRepWrapper((CrmUsRep)_crmUsRep.clone());
	}

	/**
	* Returns the user name of this CRM US Rep.
	*
	* @return the user name of this CRM US Rep
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmUsRep.getUserName();
	}

	/**
	* Returns the user uuid of this CRM US Rep.
	*
	* @return the user uuid of this CRM US Rep
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmUsRep.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM US Rep.
	*
	* @return the uuid of this CRM US Rep
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmUsRep.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _crmUsRep.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmUsRep.toXmlString();
	}

	/**
	* Returns the create date of this CRM US Rep.
	*
	* @return the create date of this CRM US Rep
	*/
	@Override
	public Date getCreateDate() {
		return _crmUsRep.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM US Rep.
	*
	* @return the modified date of this CRM US Rep
	*/
	@Override
	public Date getModifiedDate() {
		return _crmUsRep.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM US Rep.
	*
	* @return the company ID of this CRM US Rep
	*/
	@Override
	public long getCompanyId() {
		return _crmUsRep.getCompanyId();
	}

	/**
	* Returns the crm us rep ID of this CRM US Rep.
	*
	* @return the crm us rep ID of this CRM US Rep
	*/
	@Override
	public long getCrmUsRepId() {
		return _crmUsRep.getCrmUsRepId();
	}

	/**
	* Returns the group ID of this CRM US Rep.
	*
	* @return the group ID of this CRM US Rep
	*/
	@Override
	public long getGroupId() {
		return _crmUsRep.getGroupId();
	}

	/**
	* Returns the primary key of this CRM US Rep.
	*
	* @return the primary key of this CRM US Rep
	*/
	@Override
	public long getPrimaryKey() {
		return _crmUsRep.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM US Rep.
	*
	* @return the user ID of this CRM US Rep
	*/
	@Override
	public long getUserId() {
		return _crmUsRep.getUserId();
	}

	@Override
	public void persist() {
		_crmUsRep.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmUsRep.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM US Rep.
	*
	* @param companyId the company ID of this CRM US Rep
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmUsRep.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM US Rep.
	*
	* @param createDate the create date of this CRM US Rep
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmUsRep.setCreateDate(createDate);
	}

	/**
	* Sets the crm us rep ID of this CRM US Rep.
	*
	* @param crmUsRepId the crm us rep ID of this CRM US Rep
	*/
	@Override
	public void setCrmUsRepId(long crmUsRepId) {
		_crmUsRep.setCrmUsRepId(crmUsRepId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmUsRep.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmUsRep.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmUsRep.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM US Rep.
	*
	* @param groupId the group ID of this CRM US Rep
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmUsRep.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM US Rep.
	*
	* @param modifiedDate the modified date of this CRM US Rep
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmUsRep.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmUsRep.setNew(n);
	}

	/**
	* Sets the primary key of this CRM US Rep.
	*
	* @param primaryKey the primary key of this CRM US Rep
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmUsRep.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmUsRep.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM US Rep.
	*
	* @param userId the user ID of this CRM US Rep
	*/
	@Override
	public void setUserId(long userId) {
		_crmUsRep.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM US Rep.
	*
	* @param userName the user name of this CRM US Rep
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmUsRep.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM US Rep.
	*
	* @param userUuid the user uuid of this CRM US Rep
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmUsRep.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM US Rep.
	*
	* @param uuid the uuid of this CRM US Rep
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmUsRep.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmUsRepWrapper)) {
			return false;
		}

		CrmUsRepWrapper crmUsRepWrapper = (CrmUsRepWrapper)obj;

		if (Objects.equals(_crmUsRep, crmUsRepWrapper._crmUsRep)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmUsRep.getStagedModelType();
	}

	@Override
	public CrmUsRep getWrappedModel() {
		return _crmUsRep;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmUsRep.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmUsRep.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmUsRep.resetOriginalValues();
	}

	private final CrmUsRep _crmUsRep;
}