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
 * This class is a wrapper for {@link CrmMuni}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmMuni
 * @generated
 */
@ProviderType
public class CrmMuniWrapper implements CrmMuni, ModelWrapper<CrmMuni> {
	public CrmMuniWrapper(CrmMuni crmMuni) {
		_crmMuni = crmMuni;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmMuni.class;
	}

	@Override
	public String getModelClassName() {
		return CrmMuni.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmMuniId", getCrmMuniId());
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

		Long crmMuniId = (Long)attributes.get("crmMuniId");

		if (crmMuniId != null) {
			setCrmMuniId(crmMuniId);
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
		return _crmMuni.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmMuni.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmMuni.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmMuni.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmMuni> toCacheModel() {
		return _crmMuni.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmMuni toEscapedModel() {
		return new CrmMuniWrapper(_crmMuni.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmMuni toUnescapedModel() {
		return new CrmMuniWrapper(_crmMuni.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.model.CrmMuni crmMuni) {
		return _crmMuni.compareTo(crmMuni);
	}

	@Override
	public int hashCode() {
		return _crmMuni.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmMuni.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmMuniWrapper((CrmMuni)_crmMuni.clone());
	}

	/**
	* Returns the user name of this CRM Muni.
	*
	* @return the user name of this CRM Muni
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmMuni.getUserName();
	}

	/**
	* Returns the user uuid of this CRM Muni.
	*
	* @return the user uuid of this CRM Muni
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmMuni.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM Muni.
	*
	* @return the uuid of this CRM Muni
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmMuni.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _crmMuni.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmMuni.toXmlString();
	}

	/**
	* Returns the create date of this CRM Muni.
	*
	* @return the create date of this CRM Muni
	*/
	@Override
	public Date getCreateDate() {
		return _crmMuni.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM Muni.
	*
	* @return the modified date of this CRM Muni
	*/
	@Override
	public Date getModifiedDate() {
		return _crmMuni.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM Muni.
	*
	* @return the company ID of this CRM Muni
	*/
	@Override
	public long getCompanyId() {
		return _crmMuni.getCompanyId();
	}

	/**
	* Returns the crm muni ID of this CRM Muni.
	*
	* @return the crm muni ID of this CRM Muni
	*/
	@Override
	public long getCrmMuniId() {
		return _crmMuni.getCrmMuniId();
	}

	/**
	* Returns the group ID of this CRM Muni.
	*
	* @return the group ID of this CRM Muni
	*/
	@Override
	public long getGroupId() {
		return _crmMuni.getGroupId();
	}

	/**
	* Returns the primary key of this CRM Muni.
	*
	* @return the primary key of this CRM Muni
	*/
	@Override
	public long getPrimaryKey() {
		return _crmMuni.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM Muni.
	*
	* @return the user ID of this CRM Muni
	*/
	@Override
	public long getUserId() {
		return _crmMuni.getUserId();
	}

	@Override
	public void persist() {
		_crmMuni.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmMuni.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM Muni.
	*
	* @param companyId the company ID of this CRM Muni
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmMuni.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM Muni.
	*
	* @param createDate the create date of this CRM Muni
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmMuni.setCreateDate(createDate);
	}

	/**
	* Sets the crm muni ID of this CRM Muni.
	*
	* @param crmMuniId the crm muni ID of this CRM Muni
	*/
	@Override
	public void setCrmMuniId(long crmMuniId) {
		_crmMuni.setCrmMuniId(crmMuniId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmMuni.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmMuni.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmMuni.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM Muni.
	*
	* @param groupId the group ID of this CRM Muni
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmMuni.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM Muni.
	*
	* @param modifiedDate the modified date of this CRM Muni
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmMuni.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmMuni.setNew(n);
	}

	/**
	* Sets the primary key of this CRM Muni.
	*
	* @param primaryKey the primary key of this CRM Muni
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmMuni.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmMuni.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM Muni.
	*
	* @param userId the user ID of this CRM Muni
	*/
	@Override
	public void setUserId(long userId) {
		_crmMuni.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM Muni.
	*
	* @param userName the user name of this CRM Muni
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmMuni.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM Muni.
	*
	* @param userUuid the user uuid of this CRM Muni
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmMuni.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM Muni.
	*
	* @param uuid the uuid of this CRM Muni
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmMuni.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmMuniWrapper)) {
			return false;
		}

		CrmMuniWrapper crmMuniWrapper = (CrmMuniWrapper)obj;

		if (Objects.equals(_crmMuni, crmMuniWrapper._crmMuni)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmMuni.getStagedModelType();
	}

	@Override
	public CrmMuni getWrappedModel() {
		return _crmMuni;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmMuni.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmMuni.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmMuni.resetOriginalValues();
	}

	private final CrmMuni _crmMuni;
}