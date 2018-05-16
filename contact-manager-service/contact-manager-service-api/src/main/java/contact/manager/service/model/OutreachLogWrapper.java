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

package contact.manager.service.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link OutreachLog}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OutreachLog
 * @generated
 */
@ProviderType
public class OutreachLogWrapper implements OutreachLog,
	ModelWrapper<OutreachLog> {
	public OutreachLogWrapper(OutreachLog outreachLog) {
		_outreachLog = outreachLog;
	}

	@Override
	public Class<?> getModelClass() {
		return OutreachLog.class;
	}

	@Override
	public String getModelClassName() {
		return OutreachLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("contactId", getContactId());
		attributes.put("note", getNote());
		attributes.put("medium", getMedium());
		attributes.put("activityType", getActivityType());
		attributes.put("outreachDate", getOutreachDate());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		String medium = (String)attributes.get("medium");

		if (medium != null) {
			setMedium(medium);
		}

		String activityType = (String)attributes.get("activityType");

		if (activityType != null) {
			setActivityType(activityType);
		}

		Date outreachDate = (Date)attributes.get("outreachDate");

		if (outreachDate != null) {
			setOutreachDate(outreachDate);
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
		return _outreachLog.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _outreachLog.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _outreachLog.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _outreachLog.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.OutreachLog> toCacheModel() {
		return _outreachLog.toCacheModel();
	}

	@Override
	public contact.manager.service.model.OutreachLog toEscapedModel() {
		return new OutreachLogWrapper(_outreachLog.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.OutreachLog toUnescapedModel() {
		return new OutreachLogWrapper(_outreachLog.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.service.model.OutreachLog outreachLog) {
		return _outreachLog.compareTo(outreachLog);
	}

	@Override
	public int hashCode() {
		return _outreachLog.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _outreachLog.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new OutreachLogWrapper((OutreachLog)_outreachLog.clone());
	}

	/**
	* Returns the activity type of this outreach log.
	*
	* @return the activity type of this outreach log
	*/
	@Override
	public java.lang.String getActivityType() {
		return _outreachLog.getActivityType();
	}

	/**
	* Returns the medium of this outreach log.
	*
	* @return the medium of this outreach log
	*/
	@Override
	public java.lang.String getMedium() {
		return _outreachLog.getMedium();
	}

	/**
	* Returns the note of this outreach log.
	*
	* @return the note of this outreach log
	*/
	@Override
	public java.lang.String getNote() {
		return _outreachLog.getNote();
	}

	/**
	* Returns the user uuid of this outreach log.
	*
	* @return the user uuid of this outreach log
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _outreachLog.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _outreachLog.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _outreachLog.toXmlString();
	}

	/**
	* Returns the create date of this outreach log.
	*
	* @return the create date of this outreach log
	*/
	@Override
	public Date getCreateDate() {
		return _outreachLog.getCreateDate();
	}

	/**
	* Returns the modified date of this outreach log.
	*
	* @return the modified date of this outreach log
	*/
	@Override
	public Date getModifiedDate() {
		return _outreachLog.getModifiedDate();
	}

	/**
	* Returns the outreach date of this outreach log.
	*
	* @return the outreach date of this outreach log
	*/
	@Override
	public Date getOutreachDate() {
		return _outreachLog.getOutreachDate();
	}

	/**
	* Returns the contact ID of this outreach log.
	*
	* @return the contact ID of this outreach log
	*/
	@Override
	public long getContactId() {
		return _outreachLog.getContactId();
	}

	/**
	* Returns the ID of this outreach log.
	*
	* @return the ID of this outreach log
	*/
	@Override
	public long getId() {
		return _outreachLog.getId();
	}

	/**
	* Returns the primary key of this outreach log.
	*
	* @return the primary key of this outreach log
	*/
	@Override
	public long getPrimaryKey() {
		return _outreachLog.getPrimaryKey();
	}

	/**
	* Returns the user ID of this outreach log.
	*
	* @return the user ID of this outreach log
	*/
	@Override
	public long getUserId() {
		return _outreachLog.getUserId();
	}

	@Override
	public void persist() {
		_outreachLog.persist();
	}

	/**
	* Sets the activity type of this outreach log.
	*
	* @param activityType the activity type of this outreach log
	*/
	@Override
	public void setActivityType(java.lang.String activityType) {
		_outreachLog.setActivityType(activityType);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_outreachLog.setCachedModel(cachedModel);
	}

	/**
	* Sets the contact ID of this outreach log.
	*
	* @param contactId the contact ID of this outreach log
	*/
	@Override
	public void setContactId(long contactId) {
		_outreachLog.setContactId(contactId);
	}

	/**
	* Sets the create date of this outreach log.
	*
	* @param createDate the create date of this outreach log
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_outreachLog.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_outreachLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_outreachLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_outreachLog.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this outreach log.
	*
	* @param id the ID of this outreach log
	*/
	@Override
	public void setId(long id) {
		_outreachLog.setId(id);
	}

	/**
	* Sets the medium of this outreach log.
	*
	* @param medium the medium of this outreach log
	*/
	@Override
	public void setMedium(java.lang.String medium) {
		_outreachLog.setMedium(medium);
	}

	/**
	* Sets the modified date of this outreach log.
	*
	* @param modifiedDate the modified date of this outreach log
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_outreachLog.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_outreachLog.setNew(n);
	}

	/**
	* Sets the note of this outreach log.
	*
	* @param note the note of this outreach log
	*/
	@Override
	public void setNote(java.lang.String note) {
		_outreachLog.setNote(note);
	}

	/**
	* Sets the outreach date of this outreach log.
	*
	* @param outreachDate the outreach date of this outreach log
	*/
	@Override
	public void setOutreachDate(Date outreachDate) {
		_outreachLog.setOutreachDate(outreachDate);
	}

	/**
	* Sets the primary key of this outreach log.
	*
	* @param primaryKey the primary key of this outreach log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_outreachLog.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_outreachLog.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this outreach log.
	*
	* @param userId the user ID of this outreach log
	*/
	@Override
	public void setUserId(long userId) {
		_outreachLog.setUserId(userId);
	}

	/**
	* Sets the user uuid of this outreach log.
	*
	* @param userUuid the user uuid of this outreach log
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_outreachLog.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OutreachLogWrapper)) {
			return false;
		}

		OutreachLogWrapper outreachLogWrapper = (OutreachLogWrapper)obj;

		if (Objects.equals(_outreachLog, outreachLogWrapper._outreachLog)) {
			return true;
		}

		return false;
	}

	@Override
	public OutreachLog getWrappedModel() {
		return _outreachLog;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _outreachLog.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _outreachLog.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_outreachLog.resetOriginalValues();
	}

	private final OutreachLog _outreachLog;
}