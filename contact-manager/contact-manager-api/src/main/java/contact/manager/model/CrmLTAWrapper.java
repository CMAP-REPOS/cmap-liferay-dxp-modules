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
 * This class is a wrapper for {@link CrmLTA}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmLTA
 * @generated
 */
@ProviderType
public class CrmLTAWrapper implements CrmLTA, ModelWrapper<CrmLTA> {
	public CrmLTAWrapper(CrmLTA crmLTA) {
		_crmLTA = crmLTA;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmLTA.class;
	}

	@Override
	public String getModelClassName() {
		return CrmLTA.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmLTAId", getCrmLTAId());
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

		Long crmLTAId = (Long)attributes.get("crmLTAId");

		if (crmLTAId != null) {
			setCrmLTAId(crmLTAId);
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
		return new CrmLTAWrapper((CrmLTA)_crmLTA.clone());
	}

	@Override
	public int compareTo(CrmLTA crmLTA) {
		return _crmLTA.compareTo(crmLTA);
	}

	/**
	* Returns the company ID of this CRM LTA.
	*
	* @return the company ID of this CRM LTA
	*/
	@Override
	public long getCompanyId() {
		return _crmLTA.getCompanyId();
	}

	/**
	* Returns the create date of this CRM LTA.
	*
	* @return the create date of this CRM LTA
	*/
	@Override
	public Date getCreateDate() {
		return _crmLTA.getCreateDate();
	}

	/**
	* Returns the crm lta ID of this CRM LTA.
	*
	* @return the crm lta ID of this CRM LTA
	*/
	@Override
	public long getCrmLTAId() {
		return _crmLTA.getCrmLTAId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmLTA.getExpandoBridge();
	}

	/**
	* Returns the group ID of this CRM LTA.
	*
	* @return the group ID of this CRM LTA
	*/
	@Override
	public long getGroupId() {
		return _crmLTA.getGroupId();
	}

	/**
	* Returns the modified date of this CRM LTA.
	*
	* @return the modified date of this CRM LTA
	*/
	@Override
	public Date getModifiedDate() {
		return _crmLTA.getModifiedDate();
	}

	/**
	* Returns the name of this CRM LTA.
	*
	* @return the name of this CRM LTA
	*/
	@Override
	public String getName() {
		return _crmLTA.getName();
	}

	/**
	* Returns the primary key of this CRM LTA.
	*
	* @return the primary key of this CRM LTA
	*/
	@Override
	public long getPrimaryKey() {
		return _crmLTA.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmLTA.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this CRM LTA.
	*
	* @return the user ID of this CRM LTA
	*/
	@Override
	public long getUserId() {
		return _crmLTA.getUserId();
	}

	/**
	* Returns the user name of this CRM LTA.
	*
	* @return the user name of this CRM LTA
	*/
	@Override
	public String getUserName() {
		return _crmLTA.getUserName();
	}

	/**
	* Returns the user uuid of this CRM LTA.
	*
	* @return the user uuid of this CRM LTA
	*/
	@Override
	public String getUserUuid() {
		return _crmLTA.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM LTA.
	*
	* @return the uuid of this CRM LTA
	*/
	@Override
	public String getUuid() {
		return _crmLTA.getUuid();
	}

	/**
	* Returns the zip code of this CRM LTA.
	*
	* @return the zip code of this CRM LTA
	*/
	@Override
	public String getZipCode() {
		return _crmLTA.getZipCode();
	}

	@Override
	public int hashCode() {
		return _crmLTA.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _crmLTA.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmLTA.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmLTA.isNew();
	}

	@Override
	public void persist() {
		_crmLTA.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmLTA.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM LTA.
	*
	* @param companyId the company ID of this CRM LTA
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmLTA.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM LTA.
	*
	* @param createDate the create date of this CRM LTA
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmLTA.setCreateDate(createDate);
	}

	/**
	* Sets the crm lta ID of this CRM LTA.
	*
	* @param crmLTAId the crm lta ID of this CRM LTA
	*/
	@Override
	public void setCrmLTAId(long crmLTAId) {
		_crmLTA.setCrmLTAId(crmLTAId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmLTA.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmLTA.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmLTA.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM LTA.
	*
	* @param groupId the group ID of this CRM LTA
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmLTA.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM LTA.
	*
	* @param modifiedDate the modified date of this CRM LTA
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmLTA.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this CRM LTA.
	*
	* @param name the name of this CRM LTA
	*/
	@Override
	public void setName(String name) {
		_crmLTA.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_crmLTA.setNew(n);
	}

	/**
	* Sets the primary key of this CRM LTA.
	*
	* @param primaryKey the primary key of this CRM LTA
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmLTA.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmLTA.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM LTA.
	*
	* @param userId the user ID of this CRM LTA
	*/
	@Override
	public void setUserId(long userId) {
		_crmLTA.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM LTA.
	*
	* @param userName the user name of this CRM LTA
	*/
	@Override
	public void setUserName(String userName) {
		_crmLTA.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM LTA.
	*
	* @param userUuid the user uuid of this CRM LTA
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_crmLTA.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM LTA.
	*
	* @param uuid the uuid of this CRM LTA
	*/
	@Override
	public void setUuid(String uuid) {
		_crmLTA.setUuid(uuid);
	}

	/**
	* Sets the zip code of this CRM LTA.
	*
	* @param zipCode the zip code of this CRM LTA
	*/
	@Override
	public void setZipCode(String zipCode) {
		_crmLTA.setZipCode(zipCode);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CrmLTA> toCacheModel() {
		return _crmLTA.toCacheModel();
	}

	@Override
	public CrmLTA toEscapedModel() {
		return new CrmLTAWrapper(_crmLTA.toEscapedModel());
	}

	@Override
	public String toString() {
		return _crmLTA.toString();
	}

	@Override
	public CrmLTA toUnescapedModel() {
		return new CrmLTAWrapper(_crmLTA.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _crmLTA.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmLTAWrapper)) {
			return false;
		}

		CrmLTAWrapper crmLTAWrapper = (CrmLTAWrapper)obj;

		if (Objects.equals(_crmLTA, crmLTAWrapper._crmLTA)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmLTA.getStagedModelType();
	}

	@Override
	public CrmLTA getWrappedModel() {
		return _crmLTA;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmLTA.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmLTA.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmLTA.resetOriginalValues();
	}

	private final CrmLTA _crmLTA;
}