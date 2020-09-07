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
 * This class is a wrapper for {@link CrmCounty}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmCounty
 * @generated
 */
@ProviderType
public class CrmCountyWrapper implements CrmCounty, ModelWrapper<CrmCounty> {

	public CrmCountyWrapper(CrmCounty crmCounty) {
		_crmCounty = crmCounty;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmCounty.class;
	}

	@Override
	public String getModelClassName() {
		return CrmCounty.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmCountyId", getCrmCountyId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("zipCode", getZipCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long crmCountyId = (Long)attributes.get("crmCountyId");

		if (crmCountyId != null) {
			setCrmCountyId(crmCountyId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@Override
	public Object clone() {
		return new CrmCountyWrapper((CrmCounty)_crmCounty.clone());
	}

	@Override
	public int compareTo(contact.manager.model.CrmCounty crmCounty) {
		return _crmCounty.compareTo(crmCounty);
	}

	/**
	 * Returns the company ID of this CRM County.
	 *
	 * @return the company ID of this CRM County
	 */
	@Override
	public long getCompanyId() {
		return _crmCounty.getCompanyId();
	}

	/**
	 * Returns the create date of this CRM County.
	 *
	 * @return the create date of this CRM County
	 */
	@Override
	public Date getCreateDate() {
		return _crmCounty.getCreateDate();
	}

	/**
	 * Returns the crm county ID of this CRM County.
	 *
	 * @return the crm county ID of this CRM County
	 */
	@Override
	public long getCrmCountyId() {
		return _crmCounty.getCrmCountyId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmCounty.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this CRM County.
	 *
	 * @return the group ID of this CRM County
	 */
	@Override
	public long getGroupId() {
		return _crmCounty.getGroupId();
	}

	/**
	 * Returns the modified date of this CRM County.
	 *
	 * @return the modified date of this CRM County
	 */
	@Override
	public Date getModifiedDate() {
		return _crmCounty.getModifiedDate();
	}

	/**
	 * Returns the name of this CRM County.
	 *
	 * @return the name of this CRM County
	 */
	@Override
	public String getName() {
		return _crmCounty.getName();
	}

	/**
	 * Returns the primary key of this CRM County.
	 *
	 * @return the primary key of this CRM County
	 */
	@Override
	public long getPrimaryKey() {
		return _crmCounty.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmCounty.getPrimaryKeyObj();
	}

	/**
	 * Returns the user ID of this CRM County.
	 *
	 * @return the user ID of this CRM County
	 */
	@Override
	public long getUserId() {
		return _crmCounty.getUserId();
	}

	/**
	 * Returns the user name of this CRM County.
	 *
	 * @return the user name of this CRM County
	 */
	@Override
	public String getUserName() {
		return _crmCounty.getUserName();
	}

	/**
	 * Returns the user uuid of this CRM County.
	 *
	 * @return the user uuid of this CRM County
	 */
	@Override
	public String getUserUuid() {
		return _crmCounty.getUserUuid();
	}

	/**
	 * Returns the uuid of this CRM County.
	 *
	 * @return the uuid of this CRM County
	 */
	@Override
	public String getUuid() {
		return _crmCounty.getUuid();
	}

	/**
	 * Returns the zip code of this CRM County.
	 *
	 * @return the zip code of this CRM County
	 */
	@Override
	public String getZipCode() {
		return _crmCounty.getZipCode();
	}

	@Override
	public int hashCode() {
		return _crmCounty.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _crmCounty.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmCounty.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmCounty.isNew();
	}

	@Override
	public void persist() {
		_crmCounty.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmCounty.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this CRM County.
	 *
	 * @param companyId the company ID of this CRM County
	 */
	@Override
	public void setCompanyId(long companyId) {
		_crmCounty.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this CRM County.
	 *
	 * @param createDate the create date of this CRM County
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_crmCounty.setCreateDate(createDate);
	}

	/**
	 * Sets the crm county ID of this CRM County.
	 *
	 * @param crmCountyId the crm county ID of this CRM County
	 */
	@Override
	public void setCrmCountyId(long crmCountyId) {
		_crmCounty.setCrmCountyId(crmCountyId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_crmCounty.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmCounty.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmCounty.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this CRM County.
	 *
	 * @param groupId the group ID of this CRM County
	 */
	@Override
	public void setGroupId(long groupId) {
		_crmCounty.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this CRM County.
	 *
	 * @param modifiedDate the modified date of this CRM County
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmCounty.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this CRM County.
	 *
	 * @param name the name of this CRM County
	 */
	@Override
	public void setName(String name) {
		_crmCounty.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_crmCounty.setNew(n);
	}

	/**
	 * Sets the primary key of this CRM County.
	 *
	 * @param primaryKey the primary key of this CRM County
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmCounty.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmCounty.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the user ID of this CRM County.
	 *
	 * @param userId the user ID of this CRM County
	 */
	@Override
	public void setUserId(long userId) {
		_crmCounty.setUserId(userId);
	}

	/**
	 * Sets the user name of this CRM County.
	 *
	 * @param userName the user name of this CRM County
	 */
	@Override
	public void setUserName(String userName) {
		_crmCounty.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this CRM County.
	 *
	 * @param userUuid the user uuid of this CRM County
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_crmCounty.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this CRM County.
	 *
	 * @param uuid the uuid of this CRM County
	 */
	@Override
	public void setUuid(String uuid) {
		_crmCounty.setUuid(uuid);
	}

	/**
	 * Sets the zip code of this CRM County.
	 *
	 * @param zipCode the zip code of this CRM County
	 */
	@Override
	public void setZipCode(String zipCode) {
		_crmCounty.setZipCode(zipCode);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<contact.manager.model.CrmCounty> toCacheModel() {

		return _crmCounty.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmCounty toEscapedModel() {
		return new CrmCountyWrapper(_crmCounty.toEscapedModel());
	}

	@Override
	public String toString() {
		return _crmCounty.toString();
	}

	@Override
	public contact.manager.model.CrmCounty toUnescapedModel() {
		return new CrmCountyWrapper(_crmCounty.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _crmCounty.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmCountyWrapper)) {
			return false;
		}

		CrmCountyWrapper crmCountyWrapper = (CrmCountyWrapper)obj;

		if (Objects.equals(_crmCounty, crmCountyWrapper._crmCounty)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmCounty.getStagedModelType();
	}

	@Override
	public CrmCounty getWrappedModel() {
		return _crmCounty;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmCounty.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmCounty.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmCounty.resetOriginalValues();
	}

	private final CrmCounty _crmCounty;

}