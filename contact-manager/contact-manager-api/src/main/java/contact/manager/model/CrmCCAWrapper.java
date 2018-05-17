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
 * This class is a wrapper for {@link CrmCCA}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmCCA
 * @generated
 */
@ProviderType
public class CrmCCAWrapper implements CrmCCA, ModelWrapper<CrmCCA> {
	public CrmCCAWrapper(CrmCCA crmCCA) {
		_crmCCA = crmCCA;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmCCA.class;
	}

	@Override
	public String getModelClassName() {
		return CrmCCA.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmCCAId", getCrmCCAId());
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

		Long crmCCAId = (Long)attributes.get("crmCCAId");

		if (crmCCAId != null) {
			setCrmCCAId(crmCCAId);
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
		return _crmCCA.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmCCA.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmCCA.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmCCA.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmCCA> toCacheModel() {
		return _crmCCA.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmCCA toEscapedModel() {
		return new CrmCCAWrapper(_crmCCA.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmCCA toUnescapedModel() {
		return new CrmCCAWrapper(_crmCCA.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.model.CrmCCA crmCCA) {
		return _crmCCA.compareTo(crmCCA);
	}

	@Override
	public int hashCode() {
		return _crmCCA.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmCCA.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmCCAWrapper((CrmCCA)_crmCCA.clone());
	}

	/**
	* Returns the user name of this CRM CCA.
	*
	* @return the user name of this CRM CCA
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmCCA.getUserName();
	}

	/**
	* Returns the user uuid of this CRM CCA.
	*
	* @return the user uuid of this CRM CCA
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmCCA.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM CCA.
	*
	* @return the uuid of this CRM CCA
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmCCA.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _crmCCA.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmCCA.toXmlString();
	}

	/**
	* Returns the create date of this CRM CCA.
	*
	* @return the create date of this CRM CCA
	*/
	@Override
	public Date getCreateDate() {
		return _crmCCA.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM CCA.
	*
	* @return the modified date of this CRM CCA
	*/
	@Override
	public Date getModifiedDate() {
		return _crmCCA.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM CCA.
	*
	* @return the company ID of this CRM CCA
	*/
	@Override
	public long getCompanyId() {
		return _crmCCA.getCompanyId();
	}

	/**
	* Returns the crm cca ID of this CRM CCA.
	*
	* @return the crm cca ID of this CRM CCA
	*/
	@Override
	public long getCrmCCAId() {
		return _crmCCA.getCrmCCAId();
	}

	/**
	* Returns the group ID of this CRM CCA.
	*
	* @return the group ID of this CRM CCA
	*/
	@Override
	public long getGroupId() {
		return _crmCCA.getGroupId();
	}

	/**
	* Returns the primary key of this CRM CCA.
	*
	* @return the primary key of this CRM CCA
	*/
	@Override
	public long getPrimaryKey() {
		return _crmCCA.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM CCA.
	*
	* @return the user ID of this CRM CCA
	*/
	@Override
	public long getUserId() {
		return _crmCCA.getUserId();
	}

	@Override
	public void persist() {
		_crmCCA.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmCCA.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM CCA.
	*
	* @param companyId the company ID of this CRM CCA
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmCCA.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM CCA.
	*
	* @param createDate the create date of this CRM CCA
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmCCA.setCreateDate(createDate);
	}

	/**
	* Sets the crm cca ID of this CRM CCA.
	*
	* @param crmCCAId the crm cca ID of this CRM CCA
	*/
	@Override
	public void setCrmCCAId(long crmCCAId) {
		_crmCCA.setCrmCCAId(crmCCAId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmCCA.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmCCA.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmCCA.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM CCA.
	*
	* @param groupId the group ID of this CRM CCA
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmCCA.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM CCA.
	*
	* @param modifiedDate the modified date of this CRM CCA
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmCCA.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmCCA.setNew(n);
	}

	/**
	* Sets the primary key of this CRM CCA.
	*
	* @param primaryKey the primary key of this CRM CCA
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmCCA.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmCCA.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM CCA.
	*
	* @param userId the user ID of this CRM CCA
	*/
	@Override
	public void setUserId(long userId) {
		_crmCCA.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM CCA.
	*
	* @param userName the user name of this CRM CCA
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmCCA.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM CCA.
	*
	* @param userUuid the user uuid of this CRM CCA
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmCCA.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM CCA.
	*
	* @param uuid the uuid of this CRM CCA
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmCCA.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmCCAWrapper)) {
			return false;
		}

		CrmCCAWrapper crmCCAWrapper = (CrmCCAWrapper)obj;

		if (Objects.equals(_crmCCA, crmCCAWrapper._crmCCA)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmCCA.getStagedModelType();
	}

	@Override
	public CrmCCA getWrappedModel() {
		return _crmCCA;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmCCA.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmCCA.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmCCA.resetOriginalValues();
	}

	private final CrmCCA _crmCCA;
}