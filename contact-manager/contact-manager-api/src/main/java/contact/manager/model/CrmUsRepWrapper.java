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
		attributes.put("name", getName());
		attributes.put("number", getNumber());
		attributes.put("zipCode", getZipCode());

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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String number = (String)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@Override
	public Object clone() {
		return new CrmUsRepWrapper((CrmUsRep)_crmUsRep.clone());
	}

	@Override
	public int compareTo(CrmUsRep crmUsRep) {
		return _crmUsRep.compareTo(crmUsRep);
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
	* Returns the create date of this CRM US Rep.
	*
	* @return the create date of this CRM US Rep
	*/
	@Override
	public Date getCreateDate() {
		return _crmUsRep.getCreateDate();
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

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmUsRep.getExpandoBridge();
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
	* Returns the modified date of this CRM US Rep.
	*
	* @return the modified date of this CRM US Rep
	*/
	@Override
	public Date getModifiedDate() {
		return _crmUsRep.getModifiedDate();
	}

	/**
	* Returns the name of this CRM US Rep.
	*
	* @return the name of this CRM US Rep
	*/
	@Override
	public String getName() {
		return _crmUsRep.getName();
	}

	/**
	* Returns the number of this CRM US Rep.
	*
	* @return the number of this CRM US Rep
	*/
	@Override
	public String getNumber() {
		return _crmUsRep.getNumber();
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

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmUsRep.getPrimaryKeyObj();
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

	/**
	* Returns the user name of this CRM US Rep.
	*
	* @return the user name of this CRM US Rep
	*/
	@Override
	public String getUserName() {
		return _crmUsRep.getUserName();
	}

	/**
	* Returns the user uuid of this CRM US Rep.
	*
	* @return the user uuid of this CRM US Rep
	*/
	@Override
	public String getUserUuid() {
		return _crmUsRep.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM US Rep.
	*
	* @return the uuid of this CRM US Rep
	*/
	@Override
	public String getUuid() {
		return _crmUsRep.getUuid();
	}

	/**
	* Returns the zip code of this CRM US Rep.
	*
	* @return the zip code of this CRM US Rep
	*/
	@Override
	public String getZipCode() {
		return _crmUsRep.getZipCode();
	}

	@Override
	public int hashCode() {
		return _crmUsRep.hashCode();
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
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmUsRep.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmUsRep.setExpandoBridgeAttributes(expandoBridge);
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

	/**
	* Sets the name of this CRM US Rep.
	*
	* @param name the name of this CRM US Rep
	*/
	@Override
	public void setName(String name) {
		_crmUsRep.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_crmUsRep.setNew(n);
	}

	/**
	* Sets the number of this CRM US Rep.
	*
	* @param number the number of this CRM US Rep
	*/
	@Override
	public void setNumber(String number) {
		_crmUsRep.setNumber(number);
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
	public void setUserName(String userName) {
		_crmUsRep.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM US Rep.
	*
	* @param userUuid the user uuid of this CRM US Rep
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_crmUsRep.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM US Rep.
	*
	* @param uuid the uuid of this CRM US Rep
	*/
	@Override
	public void setUuid(String uuid) {
		_crmUsRep.setUuid(uuid);
	}

	/**
	* Sets the zip code of this CRM US Rep.
	*
	* @param zipCode the zip code of this CRM US Rep
	*/
	@Override
	public void setZipCode(String zipCode) {
		_crmUsRep.setZipCode(zipCode);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CrmUsRep> toCacheModel() {
		return _crmUsRep.toCacheModel();
	}

	@Override
	public CrmUsRep toEscapedModel() {
		return new CrmUsRepWrapper(_crmUsRep.toEscapedModel());
	}

	@Override
	public String toString() {
		return _crmUsRep.toString();
	}

	@Override
	public CrmUsRep toUnescapedModel() {
		return new CrmUsRepWrapper(_crmUsRep.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _crmUsRep.toXmlString();
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