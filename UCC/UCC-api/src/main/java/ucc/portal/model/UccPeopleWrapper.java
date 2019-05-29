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

package ucc.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link UccPeople}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccPeople
 * @generated
 */
@ProviderType
public class UccPeopleWrapper implements UccPeople, ModelWrapper<UccPeople> {
	public UccPeopleWrapper(UccPeople uccPeople) {
		_uccPeople = uccPeople;
	}

	@Override
	public Class<?> getModelClass() {
		return UccPeople.class;
	}

	@Override
	public String getModelClassName() {
		return UccPeople.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uccPeopleId", getUccPeopleId());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("suffix", getSuffix());
		attributes.put("birthday", getBirthday());
		attributes.put("myActive", isMyActive());
		attributes.put("oldUccPeopleId", getOldUccPeopleId());
		attributes.put("phone", getPhone());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("cellPhone", getCellPhone());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer uccPeopleId = (Integer)attributes.get("uccPeopleId");

		if (uccPeopleId != null) {
			setUccPeopleId(uccPeopleId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String suffix = (String)attributes.get("suffix");

		if (suffix != null) {
			setSuffix(suffix);
		}

		String birthday = (String)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		Boolean myActive = (Boolean)attributes.get("myActive");

		if (myActive != null) {
			setMyActive(myActive);
		}

		Integer oldUccPeopleId = (Integer)attributes.get("oldUccPeopleId");

		if (oldUccPeopleId != null) {
			setOldUccPeopleId(oldUccPeopleId);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String cellPhone = (String)attributes.get("cellPhone");

		if (cellPhone != null) {
			setCellPhone(cellPhone);
		}
	}

	@Override
	public Object clone() {
		return new UccPeopleWrapper((UccPeople)_uccPeople.clone());
	}

	@Override
	public int compareTo(UccPeople uccPeople) {
		return _uccPeople.compareTo(uccPeople);
	}

	/**
	* Returns the birthday of this ucc people.
	*
	* @return the birthday of this ucc people
	*/
	@Override
	public String getBirthday() {
		return _uccPeople.getBirthday();
	}

	/**
	* Returns the cell phone of this ucc people.
	*
	* @return the cell phone of this ucc people
	*/
	@Override
	public String getCellPhone() {
		return _uccPeople.getCellPhone();
	}

	/**
	* Returns the email address of this ucc people.
	*
	* @return the email address of this ucc people
	*/
	@Override
	public String getEmailAddress() {
		return _uccPeople.getEmailAddress();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _uccPeople.getExpandoBridge();
	}

	/**
	* Returns the first name of this ucc people.
	*
	* @return the first name of this ucc people
	*/
	@Override
	public String getFirstName() {
		return _uccPeople.getFirstName();
	}

	/**
	* Returns the last name of this ucc people.
	*
	* @return the last name of this ucc people
	*/
	@Override
	public String getLastName() {
		return _uccPeople.getLastName();
	}

	/**
	* Returns the middle name of this ucc people.
	*
	* @return the middle name of this ucc people
	*/
	@Override
	public String getMiddleName() {
		return _uccPeople.getMiddleName();
	}

	/**
	* Returns the my active of this ucc people.
	*
	* @return the my active of this ucc people
	*/
	@Override
	public boolean getMyActive() {
		return _uccPeople.getMyActive();
	}

	/**
	* Returns the old ucc people ID of this ucc people.
	*
	* @return the old ucc people ID of this ucc people
	*/
	@Override
	public int getOldUccPeopleId() {
		return _uccPeople.getOldUccPeopleId();
	}

	/**
	* Returns the phone of this ucc people.
	*
	* @return the phone of this ucc people
	*/
	@Override
	public String getPhone() {
		return _uccPeople.getPhone();
	}

	/**
	* Returns the primary key of this ucc people.
	*
	* @return the primary key of this ucc people
	*/
	@Override
	public int getPrimaryKey() {
		return _uccPeople.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _uccPeople.getPrimaryKeyObj();
	}

	/**
	* Returns the suffix of this ucc people.
	*
	* @return the suffix of this ucc people
	*/
	@Override
	public String getSuffix() {
		return _uccPeople.getSuffix();
	}

	/**
	* Returns the ucc people ID of this ucc people.
	*
	* @return the ucc people ID of this ucc people
	*/
	@Override
	public int getUccPeopleId() {
		return _uccPeople.getUccPeopleId();
	}

	@Override
	public int hashCode() {
		return _uccPeople.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _uccPeople.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _uccPeople.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this ucc people is my active.
	*
	* @return <code>true</code> if this ucc people is my active; <code>false</code> otherwise
	*/
	@Override
	public boolean isMyActive() {
		return _uccPeople.isMyActive();
	}

	@Override
	public boolean isNew() {
		return _uccPeople.isNew();
	}

	@Override
	public void persist() {
		_uccPeople.persist();
	}

	/**
	* Sets the birthday of this ucc people.
	*
	* @param birthday the birthday of this ucc people
	*/
	@Override
	public void setBirthday(String birthday) {
		_uccPeople.setBirthday(birthday);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_uccPeople.setCachedModel(cachedModel);
	}

	/**
	* Sets the cell phone of this ucc people.
	*
	* @param cellPhone the cell phone of this ucc people
	*/
	@Override
	public void setCellPhone(String cellPhone) {
		_uccPeople.setCellPhone(cellPhone);
	}

	/**
	* Sets the email address of this ucc people.
	*
	* @param emailAddress the email address of this ucc people
	*/
	@Override
	public void setEmailAddress(String emailAddress) {
		_uccPeople.setEmailAddress(emailAddress);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_uccPeople.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_uccPeople.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_uccPeople.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the first name of this ucc people.
	*
	* @param firstName the first name of this ucc people
	*/
	@Override
	public void setFirstName(String firstName) {
		_uccPeople.setFirstName(firstName);
	}

	/**
	* Sets the last name of this ucc people.
	*
	* @param lastName the last name of this ucc people
	*/
	@Override
	public void setLastName(String lastName) {
		_uccPeople.setLastName(lastName);
	}

	/**
	* Sets the middle name of this ucc people.
	*
	* @param middleName the middle name of this ucc people
	*/
	@Override
	public void setMiddleName(String middleName) {
		_uccPeople.setMiddleName(middleName);
	}

	/**
	* Sets whether this ucc people is my active.
	*
	* @param myActive the my active of this ucc people
	*/
	@Override
	public void setMyActive(boolean myActive) {
		_uccPeople.setMyActive(myActive);
	}

	@Override
	public void setNew(boolean n) {
		_uccPeople.setNew(n);
	}

	/**
	* Sets the old ucc people ID of this ucc people.
	*
	* @param oldUccPeopleId the old ucc people ID of this ucc people
	*/
	@Override
	public void setOldUccPeopleId(int oldUccPeopleId) {
		_uccPeople.setOldUccPeopleId(oldUccPeopleId);
	}

	/**
	* Sets the phone of this ucc people.
	*
	* @param phone the phone of this ucc people
	*/
	@Override
	public void setPhone(String phone) {
		_uccPeople.setPhone(phone);
	}

	/**
	* Sets the primary key of this ucc people.
	*
	* @param primaryKey the primary key of this ucc people
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_uccPeople.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_uccPeople.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the suffix of this ucc people.
	*
	* @param suffix the suffix of this ucc people
	*/
	@Override
	public void setSuffix(String suffix) {
		_uccPeople.setSuffix(suffix);
	}

	/**
	* Sets the ucc people ID of this ucc people.
	*
	* @param uccPeopleId the ucc people ID of this ucc people
	*/
	@Override
	public void setUccPeopleId(int uccPeopleId) {
		_uccPeople.setUccPeopleId(uccPeopleId);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<UccPeople> toCacheModel() {
		return _uccPeople.toCacheModel();
	}

	@Override
	public UccPeople toEscapedModel() {
		return new UccPeopleWrapper(_uccPeople.toEscapedModel());
	}

	@Override
	public String toString() {
		return _uccPeople.toString();
	}

	@Override
	public UccPeople toUnescapedModel() {
		return new UccPeopleWrapper(_uccPeople.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _uccPeople.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UccPeopleWrapper)) {
			return false;
		}

		UccPeopleWrapper uccPeopleWrapper = (UccPeopleWrapper)obj;

		if (Objects.equals(_uccPeople, uccPeopleWrapper._uccPeople)) {
			return true;
		}

		return false;
	}

	@Override
	public UccPeople getWrappedModel() {
		return _uccPeople;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _uccPeople.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _uccPeople.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_uccPeople.resetOriginalValues();
	}

	private final UccPeople _uccPeople;
}