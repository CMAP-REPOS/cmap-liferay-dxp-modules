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
 * This class is a wrapper for {@link CrmKioskSurvey}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmKioskSurvey
 * @generated
 */
@ProviderType
public class CrmKioskSurveyWrapper implements CrmKioskSurvey,
	ModelWrapper<CrmKioskSurvey> {
	public CrmKioskSurveyWrapper(CrmKioskSurvey crmKioskSurvey) {
		_crmKioskSurvey = crmKioskSurvey;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmKioskSurvey.class;
	}

	@Override
	public String getModelClassName() {
		return CrmKioskSurvey.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmKioskSurveyId", getCrmKioskSurveyId());
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

		Long crmKioskSurveyId = (Long)attributes.get("crmKioskSurveyId");

		if (crmKioskSurveyId != null) {
			setCrmKioskSurveyId(crmKioskSurveyId);
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
		return _crmKioskSurvey.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmKioskSurvey.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmKioskSurvey.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmKioskSurvey.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmKioskSurvey> toCacheModel() {
		return _crmKioskSurvey.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmKioskSurvey toEscapedModel() {
		return new CrmKioskSurveyWrapper(_crmKioskSurvey.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmKioskSurvey toUnescapedModel() {
		return new CrmKioskSurveyWrapper(_crmKioskSurvey.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.model.CrmKioskSurvey crmKioskSurvey) {
		return _crmKioskSurvey.compareTo(crmKioskSurvey);
	}

	@Override
	public int hashCode() {
		return _crmKioskSurvey.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmKioskSurvey.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmKioskSurveyWrapper((CrmKioskSurvey)_crmKioskSurvey.clone());
	}

	/**
	* Returns the user name of this CRM Kiosk Survey.
	*
	* @return the user name of this CRM Kiosk Survey
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmKioskSurvey.getUserName();
	}

	/**
	* Returns the user uuid of this CRM Kiosk Survey.
	*
	* @return the user uuid of this CRM Kiosk Survey
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmKioskSurvey.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM Kiosk Survey.
	*
	* @return the uuid of this CRM Kiosk Survey
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmKioskSurvey.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _crmKioskSurvey.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmKioskSurvey.toXmlString();
	}

	/**
	* Returns the create date of this CRM Kiosk Survey.
	*
	* @return the create date of this CRM Kiosk Survey
	*/
	@Override
	public Date getCreateDate() {
		return _crmKioskSurvey.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM Kiosk Survey.
	*
	* @return the modified date of this CRM Kiosk Survey
	*/
	@Override
	public Date getModifiedDate() {
		return _crmKioskSurvey.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM Kiosk Survey.
	*
	* @return the company ID of this CRM Kiosk Survey
	*/
	@Override
	public long getCompanyId() {
		return _crmKioskSurvey.getCompanyId();
	}

	/**
	* Returns the crm kiosk survey ID of this CRM Kiosk Survey.
	*
	* @return the crm kiosk survey ID of this CRM Kiosk Survey
	*/
	@Override
	public long getCrmKioskSurveyId() {
		return _crmKioskSurvey.getCrmKioskSurveyId();
	}

	/**
	* Returns the group ID of this CRM Kiosk Survey.
	*
	* @return the group ID of this CRM Kiosk Survey
	*/
	@Override
	public long getGroupId() {
		return _crmKioskSurvey.getGroupId();
	}

	/**
	* Returns the primary key of this CRM Kiosk Survey.
	*
	* @return the primary key of this CRM Kiosk Survey
	*/
	@Override
	public long getPrimaryKey() {
		return _crmKioskSurvey.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM Kiosk Survey.
	*
	* @return the user ID of this CRM Kiosk Survey
	*/
	@Override
	public long getUserId() {
		return _crmKioskSurvey.getUserId();
	}

	@Override
	public void persist() {
		_crmKioskSurvey.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmKioskSurvey.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM Kiosk Survey.
	*
	* @param companyId the company ID of this CRM Kiosk Survey
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmKioskSurvey.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM Kiosk Survey.
	*
	* @param createDate the create date of this CRM Kiosk Survey
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmKioskSurvey.setCreateDate(createDate);
	}

	/**
	* Sets the crm kiosk survey ID of this CRM Kiosk Survey.
	*
	* @param crmKioskSurveyId the crm kiosk survey ID of this CRM Kiosk Survey
	*/
	@Override
	public void setCrmKioskSurveyId(long crmKioskSurveyId) {
		_crmKioskSurvey.setCrmKioskSurveyId(crmKioskSurveyId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmKioskSurvey.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmKioskSurvey.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmKioskSurvey.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM Kiosk Survey.
	*
	* @param groupId the group ID of this CRM Kiosk Survey
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmKioskSurvey.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM Kiosk Survey.
	*
	* @param modifiedDate the modified date of this CRM Kiosk Survey
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmKioskSurvey.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmKioskSurvey.setNew(n);
	}

	/**
	* Sets the primary key of this CRM Kiosk Survey.
	*
	* @param primaryKey the primary key of this CRM Kiosk Survey
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmKioskSurvey.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmKioskSurvey.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM Kiosk Survey.
	*
	* @param userId the user ID of this CRM Kiosk Survey
	*/
	@Override
	public void setUserId(long userId) {
		_crmKioskSurvey.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM Kiosk Survey.
	*
	* @param userName the user name of this CRM Kiosk Survey
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmKioskSurvey.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM Kiosk Survey.
	*
	* @param userUuid the user uuid of this CRM Kiosk Survey
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmKioskSurvey.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM Kiosk Survey.
	*
	* @param uuid the uuid of this CRM Kiosk Survey
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmKioskSurvey.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmKioskSurveyWrapper)) {
			return false;
		}

		CrmKioskSurveyWrapper crmKioskSurveyWrapper = (CrmKioskSurveyWrapper)obj;

		if (Objects.equals(_crmKioskSurvey,
					crmKioskSurveyWrapper._crmKioskSurvey)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmKioskSurvey.getStagedModelType();
	}

	@Override
	public CrmKioskSurvey getWrappedModel() {
		return _crmKioskSurvey;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmKioskSurvey.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmKioskSurvey.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmKioskSurvey.resetOriginalValues();
	}

	private final CrmKioskSurvey _crmKioskSurvey;
}