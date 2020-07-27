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
 * This class is a wrapper for {@link CrmStateRep}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateRep
 * @generated
 */
@ProviderType
public class CrmStateRepWrapper
	implements CrmStateRep, ModelWrapper<CrmStateRep> {

	public CrmStateRepWrapper(CrmStateRep crmStateRep) {
		_crmStateRep = crmStateRep;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmStateRep.class;
	}

	@Override
	public String getModelClassName() {
		return CrmStateRep.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmStateRepId", getCrmStateRepId());
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

		Long crmStateRepId = (Long)attributes.get("crmStateRepId");

		if (crmStateRepId != null) {
			setCrmStateRepId(crmStateRepId);
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
		return new CrmStateRepWrapper((CrmStateRep)_crmStateRep.clone());
	}

	@Override
	public int compareTo(contact.manager.model.CrmStateRep crmStateRep) {
		return _crmStateRep.compareTo(crmStateRep);
	}

	/**
	 * Returns the company ID of this CRM State Rep.
	 *
	 * @return the company ID of this CRM State Rep
	 */
	@Override
	public long getCompanyId() {
		return _crmStateRep.getCompanyId();
	}

	/**
	 * Returns the create date of this CRM State Rep.
	 *
	 * @return the create date of this CRM State Rep
	 */
	@Override
	public Date getCreateDate() {
		return _crmStateRep.getCreateDate();
	}

	/**
	 * Returns the crm state rep ID of this CRM State Rep.
	 *
	 * @return the crm state rep ID of this CRM State Rep
	 */
	@Override
	public long getCrmStateRepId() {
		return _crmStateRep.getCrmStateRepId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmStateRep.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this CRM State Rep.
	 *
	 * @return the group ID of this CRM State Rep
	 */
	@Override
	public long getGroupId() {
		return _crmStateRep.getGroupId();
	}

	/**
	 * Returns the modified date of this CRM State Rep.
	 *
	 * @return the modified date of this CRM State Rep
	 */
	@Override
	public Date getModifiedDate() {
		return _crmStateRep.getModifiedDate();
	}

	/**
	 * Returns the name of this CRM State Rep.
	 *
	 * @return the name of this CRM State Rep
	 */
	@Override
	public String getName() {
		return _crmStateRep.getName();
	}

	/**
	 * Returns the number of this CRM State Rep.
	 *
	 * @return the number of this CRM State Rep
	 */
	@Override
	public String getNumber() {
		return _crmStateRep.getNumber();
	}

	/**
	 * Returns the primary key of this CRM State Rep.
	 *
	 * @return the primary key of this CRM State Rep
	 */
	@Override
	public long getPrimaryKey() {
		return _crmStateRep.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmStateRep.getPrimaryKeyObj();
	}

	/**
	 * Returns the user ID of this CRM State Rep.
	 *
	 * @return the user ID of this CRM State Rep
	 */
	@Override
	public long getUserId() {
		return _crmStateRep.getUserId();
	}

	/**
	 * Returns the user name of this CRM State Rep.
	 *
	 * @return the user name of this CRM State Rep
	 */
	@Override
	public String getUserName() {
		return _crmStateRep.getUserName();
	}

	/**
	 * Returns the user uuid of this CRM State Rep.
	 *
	 * @return the user uuid of this CRM State Rep
	 */
	@Override
	public String getUserUuid() {
		return _crmStateRep.getUserUuid();
	}

	/**
	 * Returns the uuid of this CRM State Rep.
	 *
	 * @return the uuid of this CRM State Rep
	 */
	@Override
	public String getUuid() {
		return _crmStateRep.getUuid();
	}

	/**
	 * Returns the zip code of this CRM State Rep.
	 *
	 * @return the zip code of this CRM State Rep
	 */
	@Override
	public String getZipCode() {
		return _crmStateRep.getZipCode();
	}

	@Override
	public int hashCode() {
		return _crmStateRep.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _crmStateRep.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmStateRep.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmStateRep.isNew();
	}

	@Override
	public void persist() {
		_crmStateRep.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmStateRep.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this CRM State Rep.
	 *
	 * @param companyId the company ID of this CRM State Rep
	 */
	@Override
	public void setCompanyId(long companyId) {
		_crmStateRep.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this CRM State Rep.
	 *
	 * @param createDate the create date of this CRM State Rep
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_crmStateRep.setCreateDate(createDate);
	}

	/**
	 * Sets the crm state rep ID of this CRM State Rep.
	 *
	 * @param crmStateRepId the crm state rep ID of this CRM State Rep
	 */
	@Override
	public void setCrmStateRepId(long crmStateRepId) {
		_crmStateRep.setCrmStateRepId(crmStateRepId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_crmStateRep.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmStateRep.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmStateRep.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this CRM State Rep.
	 *
	 * @param groupId the group ID of this CRM State Rep
	 */
	@Override
	public void setGroupId(long groupId) {
		_crmStateRep.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this CRM State Rep.
	 *
	 * @param modifiedDate the modified date of this CRM State Rep
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmStateRep.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this CRM State Rep.
	 *
	 * @param name the name of this CRM State Rep
	 */
	@Override
	public void setName(String name) {
		_crmStateRep.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_crmStateRep.setNew(n);
	}

	/**
	 * Sets the number of this CRM State Rep.
	 *
	 * @param number the number of this CRM State Rep
	 */
	@Override
	public void setNumber(String number) {
		_crmStateRep.setNumber(number);
	}

	/**
	 * Sets the primary key of this CRM State Rep.
	 *
	 * @param primaryKey the primary key of this CRM State Rep
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmStateRep.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmStateRep.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the user ID of this CRM State Rep.
	 *
	 * @param userId the user ID of this CRM State Rep
	 */
	@Override
	public void setUserId(long userId) {
		_crmStateRep.setUserId(userId);
	}

	/**
	 * Sets the user name of this CRM State Rep.
	 *
	 * @param userName the user name of this CRM State Rep
	 */
	@Override
	public void setUserName(String userName) {
		_crmStateRep.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this CRM State Rep.
	 *
	 * @param userUuid the user uuid of this CRM State Rep
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_crmStateRep.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this CRM State Rep.
	 *
	 * @param uuid the uuid of this CRM State Rep
	 */
	@Override
	public void setUuid(String uuid) {
		_crmStateRep.setUuid(uuid);
	}

	/**
	 * Sets the zip code of this CRM State Rep.
	 *
	 * @param zipCode the zip code of this CRM State Rep
	 */
	@Override
	public void setZipCode(String zipCode) {
		_crmStateRep.setZipCode(zipCode);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<contact.manager.model.CrmStateRep> toCacheModel() {

		return _crmStateRep.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmStateRep toEscapedModel() {
		return new CrmStateRepWrapper(_crmStateRep.toEscapedModel());
	}

	@Override
	public String toString() {
		return _crmStateRep.toString();
	}

	@Override
	public contact.manager.model.CrmStateRep toUnescapedModel() {
		return new CrmStateRepWrapper(_crmStateRep.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _crmStateRep.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmStateRepWrapper)) {
			return false;
		}

		CrmStateRepWrapper crmStateRepWrapper = (CrmStateRepWrapper)obj;

		if (Objects.equals(_crmStateRep, crmStateRepWrapper._crmStateRep)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmStateRep.getStagedModelType();
	}

	@Override
	public CrmStateRep getWrappedModel() {
		return _crmStateRep;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmStateRep.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmStateRep.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmStateRep.resetOriginalValues();
	}

	private final CrmStateRep _crmStateRep;

}