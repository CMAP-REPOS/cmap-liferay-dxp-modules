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
public class CrmStateSenateWrapper
	implements CrmStateSenate, ModelWrapper<CrmStateSenate> {

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
		return new CrmStateSenateWrapper(
			(CrmStateSenate)_crmStateSenate.clone());
	}

	@Override
	public int compareTo(contact.manager.model.CrmStateSenate crmStateSenate) {
		return _crmStateSenate.compareTo(crmStateSenate);
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
	 * Returns the create date of this CRM State Senate.
	 *
	 * @return the create date of this CRM State Senate
	 */
	@Override
	public Date getCreateDate() {
		return _crmStateSenate.getCreateDate();
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

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmStateSenate.getExpandoBridge();
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
	 * Returns the modified date of this CRM State Senate.
	 *
	 * @return the modified date of this CRM State Senate
	 */
	@Override
	public Date getModifiedDate() {
		return _crmStateSenate.getModifiedDate();
	}

	/**
	 * Returns the name of this CRM State Senate.
	 *
	 * @return the name of this CRM State Senate
	 */
	@Override
	public String getName() {
		return _crmStateSenate.getName();
	}

	/**
	 * Returns the number of this CRM State Senate.
	 *
	 * @return the number of this CRM State Senate
	 */
	@Override
	public String getNumber() {
		return _crmStateSenate.getNumber();
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

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmStateSenate.getPrimaryKeyObj();
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

	/**
	 * Returns the user name of this CRM State Senate.
	 *
	 * @return the user name of this CRM State Senate
	 */
	@Override
	public String getUserName() {
		return _crmStateSenate.getUserName();
	}

	/**
	 * Returns the user uuid of this CRM State Senate.
	 *
	 * @return the user uuid of this CRM State Senate
	 */
	@Override
	public String getUserUuid() {
		return _crmStateSenate.getUserUuid();
	}

	/**
	 * Returns the uuid of this CRM State Senate.
	 *
	 * @return the uuid of this CRM State Senate
	 */
	@Override
	public String getUuid() {
		return _crmStateSenate.getUuid();
	}

	/**
	 * Returns the zip code of this CRM State Senate.
	 *
	 * @return the zip code of this CRM State Senate
	 */
	@Override
	public String getZipCode() {
		return _crmStateSenate.getZipCode();
	}

	@Override
	public int hashCode() {
		return _crmStateSenate.hashCode();
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
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_crmStateSenate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmStateSenate.setExpandoBridgeAttributes(expandoBridge);
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

	/**
	 * Sets the name of this CRM State Senate.
	 *
	 * @param name the name of this CRM State Senate
	 */
	@Override
	public void setName(String name) {
		_crmStateSenate.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_crmStateSenate.setNew(n);
	}

	/**
	 * Sets the number of this CRM State Senate.
	 *
	 * @param number the number of this CRM State Senate
	 */
	@Override
	public void setNumber(String number) {
		_crmStateSenate.setNumber(number);
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
	public void setUserName(String userName) {
		_crmStateSenate.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this CRM State Senate.
	 *
	 * @param userUuid the user uuid of this CRM State Senate
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_crmStateSenate.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this CRM State Senate.
	 *
	 * @param uuid the uuid of this CRM State Senate
	 */
	@Override
	public void setUuid(String uuid) {
		_crmStateSenate.setUuid(uuid);
	}

	/**
	 * Sets the zip code of this CRM State Senate.
	 *
	 * @param zipCode the zip code of this CRM State Senate
	 */
	@Override
	public void setZipCode(String zipCode) {
		_crmStateSenate.setZipCode(zipCode);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<contact.manager.model.CrmStateSenate> toCacheModel() {

		return _crmStateSenate.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmStateSenate toEscapedModel() {
		return new CrmStateSenateWrapper(_crmStateSenate.toEscapedModel());
	}

	@Override
	public String toString() {
		return _crmStateSenate.toString();
	}

	@Override
	public contact.manager.model.CrmStateSenate toUnescapedModel() {
		return new CrmStateSenateWrapper(_crmStateSenate.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _crmStateSenate.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmStateSenateWrapper)) {
			return false;
		}

		CrmStateSenateWrapper crmStateSenateWrapper =
			(CrmStateSenateWrapper)obj;

		if (Objects.equals(
				_crmStateSenate, crmStateSenateWrapper._crmStateSenate)) {

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