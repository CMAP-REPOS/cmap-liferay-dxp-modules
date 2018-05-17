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
 * This class is a wrapper for {@link CrmNote}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmNote
 * @generated
 */
@ProviderType
public class CrmNoteWrapper implements CrmNote, ModelWrapper<CrmNote> {
	public CrmNoteWrapper(CrmNote crmNote) {
		_crmNote = crmNote;
	}

	@Override
	public Class<?> getModelClass() {
		return CrmNote.class;
	}

	@Override
	public String getModelClassName() {
		return CrmNote.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmNoteId", getCrmNoteId());
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

		Long crmNoteId = (Long)attributes.get("crmNoteId");

		if (crmNoteId != null) {
			setCrmNoteId(crmNoteId);
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
		return _crmNote.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _crmNote.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _crmNote.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _crmNote.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.model.CrmNote> toCacheModel() {
		return _crmNote.toCacheModel();
	}

	@Override
	public contact.manager.model.CrmNote toEscapedModel() {
		return new CrmNoteWrapper(_crmNote.toEscapedModel());
	}

	@Override
	public contact.manager.model.CrmNote toUnescapedModel() {
		return new CrmNoteWrapper(_crmNote.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.model.CrmNote crmNote) {
		return _crmNote.compareTo(crmNote);
	}

	@Override
	public int hashCode() {
		return _crmNote.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmNote.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CrmNoteWrapper((CrmNote)_crmNote.clone());
	}

	/**
	* Returns the user name of this CRM Note.
	*
	* @return the user name of this CRM Note
	*/
	@Override
	public java.lang.String getUserName() {
		return _crmNote.getUserName();
	}

	/**
	* Returns the user uuid of this CRM Note.
	*
	* @return the user uuid of this CRM Note
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _crmNote.getUserUuid();
	}

	/**
	* Returns the uuid of this CRM Note.
	*
	* @return the uuid of this CRM Note
	*/
	@Override
	public java.lang.String getUuid() {
		return _crmNote.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _crmNote.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmNote.toXmlString();
	}

	/**
	* Returns the create date of this CRM Note.
	*
	* @return the create date of this CRM Note
	*/
	@Override
	public Date getCreateDate() {
		return _crmNote.getCreateDate();
	}

	/**
	* Returns the modified date of this CRM Note.
	*
	* @return the modified date of this CRM Note
	*/
	@Override
	public Date getModifiedDate() {
		return _crmNote.getModifiedDate();
	}

	/**
	* Returns the company ID of this CRM Note.
	*
	* @return the company ID of this CRM Note
	*/
	@Override
	public long getCompanyId() {
		return _crmNote.getCompanyId();
	}

	/**
	* Returns the crm note ID of this CRM Note.
	*
	* @return the crm note ID of this CRM Note
	*/
	@Override
	public long getCrmNoteId() {
		return _crmNote.getCrmNoteId();
	}

	/**
	* Returns the group ID of this CRM Note.
	*
	* @return the group ID of this CRM Note
	*/
	@Override
	public long getGroupId() {
		return _crmNote.getGroupId();
	}

	/**
	* Returns the primary key of this CRM Note.
	*
	* @return the primary key of this CRM Note
	*/
	@Override
	public long getPrimaryKey() {
		return _crmNote.getPrimaryKey();
	}

	/**
	* Returns the user ID of this CRM Note.
	*
	* @return the user ID of this CRM Note
	*/
	@Override
	public long getUserId() {
		return _crmNote.getUserId();
	}

	@Override
	public void persist() {
		_crmNote.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmNote.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this CRM Note.
	*
	* @param companyId the company ID of this CRM Note
	*/
	@Override
	public void setCompanyId(long companyId) {
		_crmNote.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this CRM Note.
	*
	* @param createDate the create date of this CRM Note
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_crmNote.setCreateDate(createDate);
	}

	/**
	* Sets the crm note ID of this CRM Note.
	*
	* @param crmNoteId the crm note ID of this CRM Note
	*/
	@Override
	public void setCrmNoteId(long crmNoteId) {
		_crmNote.setCrmNoteId(crmNoteId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_crmNote.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_crmNote.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_crmNote.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this CRM Note.
	*
	* @param groupId the group ID of this CRM Note
	*/
	@Override
	public void setGroupId(long groupId) {
		_crmNote.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this CRM Note.
	*
	* @param modifiedDate the modified date of this CRM Note
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_crmNote.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_crmNote.setNew(n);
	}

	/**
	* Sets the primary key of this CRM Note.
	*
	* @param primaryKey the primary key of this CRM Note
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_crmNote.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_crmNote.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this CRM Note.
	*
	* @param userId the user ID of this CRM Note
	*/
	@Override
	public void setUserId(long userId) {
		_crmNote.setUserId(userId);
	}

	/**
	* Sets the user name of this CRM Note.
	*
	* @param userName the user name of this CRM Note
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_crmNote.setUserName(userName);
	}

	/**
	* Sets the user uuid of this CRM Note.
	*
	* @param userUuid the user uuid of this CRM Note
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_crmNote.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this CRM Note.
	*
	* @param uuid the uuid of this CRM Note
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_crmNote.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmNoteWrapper)) {
			return false;
		}

		CrmNoteWrapper crmNoteWrapper = (CrmNoteWrapper)obj;

		if (Objects.equals(_crmNote, crmNoteWrapper._crmNote)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _crmNote.getStagedModelType();
	}

	@Override
	public CrmNote getWrappedModel() {
		return _crmNote;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _crmNote.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _crmNote.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_crmNote.resetOriginalValues();
	}

	private final CrmNote _crmNote;
}