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
 * This class is a wrapper for {@link Note}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Note
 * @generated
 */
@ProviderType
public class NoteWrapper implements Note, ModelWrapper<Note> {
	public NoteWrapper(Note note) {
		_note = note;
	}

	@Override
	public Class<?> getModelClass() {
		return Note.class;
	}

	@Override
	public String getModelClassName() {
		return Note.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("contactId", getContactId());
		attributes.put("userId", getUserId());
		attributes.put("note", getNote());
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

		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
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
		return _note.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _note.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _note.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _note.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<contact.manager.service.model.Note> toCacheModel() {
		return _note.toCacheModel();
	}

	@Override
	public contact.manager.service.model.Note toEscapedModel() {
		return new NoteWrapper(_note.toEscapedModel());
	}

	@Override
	public contact.manager.service.model.Note toUnescapedModel() {
		return new NoteWrapper(_note.toUnescapedModel());
	}

	@Override
	public int compareTo(contact.manager.service.model.Note note) {
		return _note.compareTo(note);
	}

	@Override
	public int hashCode() {
		return _note.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _note.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new NoteWrapper((Note)_note.clone());
	}

	/**
	* Returns the note of this note.
	*
	* @return the note of this note
	*/
	@Override
	public java.lang.String getNote() {
		return _note.getNote();
	}

	/**
	* Returns the user uuid of this note.
	*
	* @return the user uuid of this note
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _note.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _note.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _note.toXmlString();
	}

	/**
	* Returns the create date of this note.
	*
	* @return the create date of this note
	*/
	@Override
	public Date getCreateDate() {
		return _note.getCreateDate();
	}

	/**
	* Returns the modified date of this note.
	*
	* @return the modified date of this note
	*/
	@Override
	public Date getModifiedDate() {
		return _note.getModifiedDate();
	}

	/**
	* Returns the contact ID of this note.
	*
	* @return the contact ID of this note
	*/
	@Override
	public long getContactId() {
		return _note.getContactId();
	}

	/**
	* Returns the ID of this note.
	*
	* @return the ID of this note
	*/
	@Override
	public long getId() {
		return _note.getId();
	}

	/**
	* Returns the primary key of this note.
	*
	* @return the primary key of this note
	*/
	@Override
	public long getPrimaryKey() {
		return _note.getPrimaryKey();
	}

	/**
	* Returns the user ID of this note.
	*
	* @return the user ID of this note
	*/
	@Override
	public long getUserId() {
		return _note.getUserId();
	}

	@Override
	public void persist() {
		_note.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_note.setCachedModel(cachedModel);
	}

	/**
	* Sets the contact ID of this note.
	*
	* @param contactId the contact ID of this note
	*/
	@Override
	public void setContactId(long contactId) {
		_note.setContactId(contactId);
	}

	/**
	* Sets the create date of this note.
	*
	* @param createDate the create date of this note
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_note.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_note.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_note.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_note.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this note.
	*
	* @param id the ID of this note
	*/
	@Override
	public void setId(long id) {
		_note.setId(id);
	}

	/**
	* Sets the modified date of this note.
	*
	* @param modifiedDate the modified date of this note
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_note.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_note.setNew(n);
	}

	/**
	* Sets the note of this note.
	*
	* @param note the note of this note
	*/
	@Override
	public void setNote(java.lang.String note) {
		_note.setNote(note);
	}

	/**
	* Sets the primary key of this note.
	*
	* @param primaryKey the primary key of this note
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_note.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_note.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this note.
	*
	* @param userId the user ID of this note
	*/
	@Override
	public void setUserId(long userId) {
		_note.setUserId(userId);
	}

	/**
	* Sets the user uuid of this note.
	*
	* @param userUuid the user uuid of this note
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_note.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NoteWrapper)) {
			return false;
		}

		NoteWrapper noteWrapper = (NoteWrapper)obj;

		if (Objects.equals(_note, noteWrapper._note)) {
			return true;
		}

		return false;
	}

	@Override
	public Note getWrappedModel() {
		return _note;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _note.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _note.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_note.resetOriginalValues();
	}

	private final Note _note;
}