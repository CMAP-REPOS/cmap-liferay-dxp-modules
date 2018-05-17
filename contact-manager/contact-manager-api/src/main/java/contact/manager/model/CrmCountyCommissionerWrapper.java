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
 * This class is a wrapper for {@link CrmCountyCommissioner}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmCountyCommissioner
 * @generated
 */
@ProviderType
public class CrmCountyCommissionerWrapper implements CrmCountyCommissioner,
	ModelWrapper<CrmCountyCommissioner> {
	public CrmCountyCommissionerWrapper(
		CrmCountyCommissioner crmCountyCommissioner) {
		_crmCountyCommissioner = crmCountyCommissioner;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmCountyCommissioner.class;
	}

	@Override
	public String getModelClassName() {
		return CrmCountyCommissioner.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmCountyCommissionerOrBoardDistId",
			getCrmCountyCommissionerOrBoardDistId());
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

		Long crmCountyCommissionerOrBoardDistId = (Long)attributes.get(
				"crmCountyCommissionerOrBoardDistId");

		if (crmCountyCommissionerOrBoardDistId != null) {
			setCrmCountyCommissionerOrBoardDistId(crmCountyCommissionerOrBoardDistId);
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
	public boolean isCachedModel() {
		return _crmCountyCommissioner.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmCountyCommissioner.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmCountyCommissioner.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmCountyCommissioner.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmCountyCommissioner> toCacheModel() {
		return _crmCountyCommissioner.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmCountyCommissioner toEscapedModel() {
		return new CrmCountyCommissionerWrapper(_crmCountyCommissioner.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmCountyCommissioner toUnescapedModel() {
		return new CrmCountyCommissionerWrapper(_crmCountyCommissioner.toUnescapedModel());
	}

	@Override
	public int compareTo(
		contact.manager.model.CrmCountyCommissioner crmCountyCommissioner) {
		return _crmCountyCommissioner.compareTo(crmCountyCommissioner);
	}

	@Override
	public int hashCode() {
		return _crmCountyCommissioner.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmCountyCommissioner.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmCountyCommissionerWrapper((CrmCountyCommissioner)_crmCountyCommissioner.clone());
	}

	/**
	* Returns the name of this CRM County Commissioner.
	*
	* @return the name of this CRM County Commissioner
	*/
	@Override
	public java.lang.String getName() {
		return _crmCountyCommissioner.getName();
	}

	/**
	* Returns the number of this CRM County Commissioner.
	*
	* @return the number of this CRM County Commissioner
	*/
	@Override
	public java.lang.String getNumber() {
		return _crmCountyCommissioner.getNumber();
	}

	/**
	* Returns the user name of this CRM County Commissioner.
	*
	* @return the user name of this CRM County Commissioner
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmCountyCommissioner.getUserName();
	}

	/**
	* Returns the user uuid of this CRM County Commissioner.
	*
	* @return the user uuid of this CRM County Commissioner
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmCountyCommissioner.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM County Commissioner.
	*
	* @return the uuid of this CRM County Commissioner
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmCountyCommissioner.getUuid();
	}

	/**
	* Returns the zip code of this CRM County Commissioner.
	*
	* @return the zip code of this CRM County Commissioner
	*/
	@Override
	public java.lang.String getZipCode() {
		return _crmCountyCommissioner.getZipCode();
	}

	@Override
	public java.lang.String toString() {
		return _crmCountyCommissioner.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmCountyCommissioner.toXmlString();
	}

	/**
	* Returns the create date of this CRM County Commissioner.
	*
	* @return the create date of this CRM County Commissioner
	*/
	@Override
	public Date getCreateDate() {
		return _crmCountyCommissioner.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM County Commissioner.
	*
	* @return the modified date of this CRM County Commissioner
	*/
	@Override
	public Date getModifiedDate() {
		return _crmCountyCommissioner.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM County Commissioner.
	*
	* @return the company ID of this CRM County Commissioner
	*/
	@Override
	public long getCompanyId() {
		return _crmCountyCommissioner.getCompanyId();
	}

	/**
	* Returns the crm county commissioner or board dist ID of this CRM County Commissioner.
	*
	* @return the crm county commissioner or board dist ID of this CRM County Commissioner
	*/
	@Override
	public long getCrmCountyCommissionerOrBoardDistId() {
		return _crmCountyCommissioner.getCrmCountyCommissionerOrBoardDistId();
	}

	/**
	* Returns the group ID of this CRM County Commissioner.
	*
	* @return the group ID of this CRM County Commissioner
	*/
	@Override
	public long getGroupId() {
		return _crmCountyCommissioner.getGroupId();
	}

	/**
	* Returns the primary key of this CRM County Commissioner.
	*
	* @return the primary key of this CRM County Commissioner
	*/
	@Override
	public long getPrimaryKey() {
		return _crmCountyCommissioner.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM County Commissioner.
	*
	* @return the user ID of this CRM County Commissioner
	*/
	@Override
	public long getUserId() {
		return _crmCountyCommissioner.getUserId();
	}

	@Override
	public void persist() {
		_crmCountyCommissioner.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmCountyCommissioner.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM County Commissioner.
	*
	* @param companyId the company ID of this CRM County Commissioner
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmCountyCommissioner.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM County Commissioner.
	*
	* @param createDate the create date of this CRM County Commissioner
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmCountyCommissioner.setCreateDate(createDate);
	}

	/**
	* Sets the crm county commissioner or board dist ID of this CRM County Commissioner.
	*
	* @param crmCountyCommissionerOrBoardDistId the crm county commissioner or board dist ID of this CRM County Commissioner
	*/
	@Override
	public void setCrmCountyCommissionerOrBoardDistId(
		long crmCountyCommissionerOrBoardDistId) {
		_crmCountyCommissioner.setCrmCountyCommissionerOrBoardDistId(crmCountyCommissionerOrBoardDistId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmCountyCommissioner.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmCountyCommissioner.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmCountyCommissioner.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM County Commissioner.
	*
	* @param groupId the group ID of this CRM County Commissioner
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmCountyCommissioner.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM County Commissioner.
	*
	* @param modifiedDate the modified date of this CRM County Commissioner
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmCountyCommissioner.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this CRM County Commissioner.
	*
	* @param name the name of this CRM County Commissioner
	*/
	@Override
	public void setName(java.lang.String name) {
		_crmCountyCommissioner.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_crmCountyCommissioner.setNew(n);
	}

	/**
	* Sets the number of this CRM County Commissioner.
	*
	* @param number the number of this CRM County Commissioner
	*/
	@Override
	public void setNumber(java.lang.String number) {
		_crmCountyCommissioner.setNumber(number);
	}

	/**
	* Sets the primary key of this CRM County Commissioner.
	*
	* @param primaryKey the primary key of this CRM County Commissioner
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmCountyCommissioner.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmCountyCommissioner.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM County Commissioner.
	*
	* @param userId the user ID of this CRM County Commissioner
	*/
	@Override
	public void setUserId(long userId) {
		_crmCountyCommissioner.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM County Commissioner.
	*
	* @param userName the user name of this CRM County Commissioner
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmCountyCommissioner.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM County Commissioner.
	*
	* @param userUuid the user uuid of this CRM County Commissioner
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmCountyCommissioner.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM County Commissioner.
	*
	* @param uuid the uuid of this CRM County Commissioner
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmCountyCommissioner.setUuid(uuid);
	}

	/**
	* Sets the zip code of this CRM County Commissioner.
	*
	* @param zipCode the zip code of this CRM County Commissioner
	*/
	@Override
	public void setZipCode(java.lang.String zipCode) {
		_crmCountyCommissioner.setZipCode(zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmCountyCommissionerWrapper)) {
			return false;
		}

		CrmCountyCommissionerWrapper crmCountyCommissionerWrapper = (CrmCountyCommissionerWrapper)obj;

		if (Objects.equals(_crmCountyCommissioner,
					crmCountyCommissionerWrapper._crmCountyCommissioner)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmCountyCommissioner.getStagedModelType();
	}

	@Override
	public CrmCountyCommissioner getWrappedModel() {
		return _crmCountyCommissioner;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmCountyCommissioner.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmCountyCommissioner.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmCountyCommissioner.resetOriginalValues();
	}

	private final CrmCountyCommissioner _crmCountyCommissioner;
}