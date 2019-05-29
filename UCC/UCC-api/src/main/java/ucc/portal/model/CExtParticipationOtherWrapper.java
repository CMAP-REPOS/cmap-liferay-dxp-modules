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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CExtParticipationOther}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtParticipationOther
 * @generated
 */
@ProviderType
public class CExtParticipationOtherWrapper implements CExtParticipationOther,
	ModelWrapper<CExtParticipationOther> {
	public CExtParticipationOtherWrapper(
		CExtParticipationOther cExtParticipationOther) {
		_cExtParticipationOther = cExtParticipationOther;
	}

	@Override
	public Class<?> getModelClass() {
		return CExtParticipationOther.class;
	}

	@Override
	public String getModelClassName() {
		return CExtParticipationOther.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organizationId", getOrganizationId());
		attributes.put("cextParticipationOtherId", getCextParticipationOtherId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ppGathering", getPpGathering());
		attributes.put("ppCount", getPpCount());
		attributes.put("ppLay", isPpLay());
		attributes.put("ppPastor", isPpPastor());
		attributes.put("ppStaff", isPpStaff());
		attributes.put("ppOther", isPpOther());
		attributes.put("ppAdditionalInformation", getPpAdditionalInformation());
		attributes.put("ppPriority", getPpPriority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long cextParticipationOtherId = (Long)attributes.get(
				"cextParticipationOtherId");

		if (cextParticipationOtherId != null) {
			setCextParticipationOtherId(cextParticipationOtherId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String ppGathering = (String)attributes.get("ppGathering");

		if (ppGathering != null) {
			setPpGathering(ppGathering);
		}

		Integer ppCount = (Integer)attributes.get("ppCount");

		if (ppCount != null) {
			setPpCount(ppCount);
		}

		Boolean ppLay = (Boolean)attributes.get("ppLay");

		if (ppLay != null) {
			setPpLay(ppLay);
		}

		Boolean ppPastor = (Boolean)attributes.get("ppPastor");

		if (ppPastor != null) {
			setPpPastor(ppPastor);
		}

		Boolean ppStaff = (Boolean)attributes.get("ppStaff");

		if (ppStaff != null) {
			setPpStaff(ppStaff);
		}

		Boolean ppOther = (Boolean)attributes.get("ppOther");

		if (ppOther != null) {
			setPpOther(ppOther);
		}

		String ppAdditionalInformation = (String)attributes.get(
				"ppAdditionalInformation");

		if (ppAdditionalInformation != null) {
			setPpAdditionalInformation(ppAdditionalInformation);
		}

		Double ppPriority = (Double)attributes.get("ppPriority");

		if (ppPriority != null) {
			setPpPriority(ppPriority);
		}
	}

	@Override
	public Object clone() {
		return new CExtParticipationOtherWrapper((CExtParticipationOther)_cExtParticipationOther.clone());
	}

	@Override
	public int compareTo(CExtParticipationOther cExtParticipationOther) {
		return _cExtParticipationOther.compareTo(cExtParticipationOther);
	}

	/**
	* Returns the cext participation other ID of this c ext participation other.
	*
	* @return the cext participation other ID of this c ext participation other
	*/
	@Override
	public long getCextParticipationOtherId() {
		return _cExtParticipationOther.getCextParticipationOtherId();
	}

	/**
	* Returns the company ID of this c ext participation other.
	*
	* @return the company ID of this c ext participation other
	*/
	@Override
	public long getCompanyId() {
		return _cExtParticipationOther.getCompanyId();
	}

	/**
	* Returns the create date of this c ext participation other.
	*
	* @return the create date of this c ext participation other
	*/
	@Override
	public Date getCreateDate() {
		return _cExtParticipationOther.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cExtParticipationOther.getExpandoBridge();
	}

	/**
	* Returns the modified date of this c ext participation other.
	*
	* @return the modified date of this c ext participation other
	*/
	@Override
	public Date getModifiedDate() {
		return _cExtParticipationOther.getModifiedDate();
	}

	/**
	* Returns the organization ID of this c ext participation other.
	*
	* @return the organization ID of this c ext participation other
	*/
	@Override
	public long getOrganizationId() {
		return _cExtParticipationOther.getOrganizationId();
	}

	/**
	* Returns the pp additional information of this c ext participation other.
	*
	* @return the pp additional information of this c ext participation other
	*/
	@Override
	public String getPpAdditionalInformation() {
		return _cExtParticipationOther.getPpAdditionalInformation();
	}

	/**
	* Returns the pp count of this c ext participation other.
	*
	* @return the pp count of this c ext participation other
	*/
	@Override
	public int getPpCount() {
		return _cExtParticipationOther.getPpCount();
	}

	/**
	* Returns the pp gathering of this c ext participation other.
	*
	* @return the pp gathering of this c ext participation other
	*/
	@Override
	public String getPpGathering() {
		return _cExtParticipationOther.getPpGathering();
	}

	/**
	* Returns the pp lay of this c ext participation other.
	*
	* @return the pp lay of this c ext participation other
	*/
	@Override
	public boolean getPpLay() {
		return _cExtParticipationOther.getPpLay();
	}

	/**
	* Returns the pp other of this c ext participation other.
	*
	* @return the pp other of this c ext participation other
	*/
	@Override
	public boolean getPpOther() {
		return _cExtParticipationOther.getPpOther();
	}

	/**
	* Returns the pp pastor of this c ext participation other.
	*
	* @return the pp pastor of this c ext participation other
	*/
	@Override
	public boolean getPpPastor() {
		return _cExtParticipationOther.getPpPastor();
	}

	/**
	* Returns the pp priority of this c ext participation other.
	*
	* @return the pp priority of this c ext participation other
	*/
	@Override
	public double getPpPriority() {
		return _cExtParticipationOther.getPpPriority();
	}

	/**
	* Returns the pp staff of this c ext participation other.
	*
	* @return the pp staff of this c ext participation other
	*/
	@Override
	public boolean getPpStaff() {
		return _cExtParticipationOther.getPpStaff();
	}

	/**
	* Returns the primary key of this c ext participation other.
	*
	* @return the primary key of this c ext participation other
	*/
	@Override
	public ucc.portal.service.persistence.CExtParticipationOtherPK getPrimaryKey() {
		return _cExtParticipationOther.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cExtParticipationOther.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this c ext participation other.
	*
	* @return the user ID of this c ext participation other
	*/
	@Override
	public long getUserId() {
		return _cExtParticipationOther.getUserId();
	}

	/**
	* Returns the user uuid of this c ext participation other.
	*
	* @return the user uuid of this c ext participation other
	*/
	@Override
	public String getUserUuid() {
		return _cExtParticipationOther.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _cExtParticipationOther.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _cExtParticipationOther.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cExtParticipationOther.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cExtParticipationOther.isNew();
	}

	/**
	* Returns <code>true</code> if this c ext participation other is pp lay.
	*
	* @return <code>true</code> if this c ext participation other is pp lay; <code>false</code> otherwise
	*/
	@Override
	public boolean isPpLay() {
		return _cExtParticipationOther.isPpLay();
	}

	/**
	* Returns <code>true</code> if this c ext participation other is pp other.
	*
	* @return <code>true</code> if this c ext participation other is pp other; <code>false</code> otherwise
	*/
	@Override
	public boolean isPpOther() {
		return _cExtParticipationOther.isPpOther();
	}

	/**
	* Returns <code>true</code> if this c ext participation other is pp pastor.
	*
	* @return <code>true</code> if this c ext participation other is pp pastor; <code>false</code> otherwise
	*/
	@Override
	public boolean isPpPastor() {
		return _cExtParticipationOther.isPpPastor();
	}

	/**
	* Returns <code>true</code> if this c ext participation other is pp staff.
	*
	* @return <code>true</code> if this c ext participation other is pp staff; <code>false</code> otherwise
	*/
	@Override
	public boolean isPpStaff() {
		return _cExtParticipationOther.isPpStaff();
	}

	@Override
	public void persist() {
		_cExtParticipationOther.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cExtParticipationOther.setCachedModel(cachedModel);
	}

	/**
	* Sets the cext participation other ID of this c ext participation other.
	*
	* @param cextParticipationOtherId the cext participation other ID of this c ext participation other
	*/
	@Override
	public void setCextParticipationOtherId(long cextParticipationOtherId) {
		_cExtParticipationOther.setCextParticipationOtherId(cextParticipationOtherId);
	}

	/**
	* Sets the company ID of this c ext participation other.
	*
	* @param companyId the company ID of this c ext participation other
	*/
	@Override
	public void setCompanyId(long companyId) {
		_cExtParticipationOther.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this c ext participation other.
	*
	* @param createDate the create date of this c ext participation other
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_cExtParticipationOther.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cExtParticipationOther.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cExtParticipationOther.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cExtParticipationOther.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this c ext participation other.
	*
	* @param modifiedDate the modified date of this c ext participation other
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_cExtParticipationOther.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_cExtParticipationOther.setNew(n);
	}

	/**
	* Sets the organization ID of this c ext participation other.
	*
	* @param organizationId the organization ID of this c ext participation other
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_cExtParticipationOther.setOrganizationId(organizationId);
	}

	/**
	* Sets the pp additional information of this c ext participation other.
	*
	* @param ppAdditionalInformation the pp additional information of this c ext participation other
	*/
	@Override
	public void setPpAdditionalInformation(String ppAdditionalInformation) {
		_cExtParticipationOther.setPpAdditionalInformation(ppAdditionalInformation);
	}

	/**
	* Sets the pp count of this c ext participation other.
	*
	* @param ppCount the pp count of this c ext participation other
	*/
	@Override
	public void setPpCount(int ppCount) {
		_cExtParticipationOther.setPpCount(ppCount);
	}

	/**
	* Sets the pp gathering of this c ext participation other.
	*
	* @param ppGathering the pp gathering of this c ext participation other
	*/
	@Override
	public void setPpGathering(String ppGathering) {
		_cExtParticipationOther.setPpGathering(ppGathering);
	}

	/**
	* Sets whether this c ext participation other is pp lay.
	*
	* @param ppLay the pp lay of this c ext participation other
	*/
	@Override
	public void setPpLay(boolean ppLay) {
		_cExtParticipationOther.setPpLay(ppLay);
	}

	/**
	* Sets whether this c ext participation other is pp other.
	*
	* @param ppOther the pp other of this c ext participation other
	*/
	@Override
	public void setPpOther(boolean ppOther) {
		_cExtParticipationOther.setPpOther(ppOther);
	}

	/**
	* Sets whether this c ext participation other is pp pastor.
	*
	* @param ppPastor the pp pastor of this c ext participation other
	*/
	@Override
	public void setPpPastor(boolean ppPastor) {
		_cExtParticipationOther.setPpPastor(ppPastor);
	}

	/**
	* Sets the pp priority of this c ext participation other.
	*
	* @param ppPriority the pp priority of this c ext participation other
	*/
	@Override
	public void setPpPriority(double ppPriority) {
		_cExtParticipationOther.setPpPriority(ppPriority);
	}

	/**
	* Sets whether this c ext participation other is pp staff.
	*
	* @param ppStaff the pp staff of this c ext participation other
	*/
	@Override
	public void setPpStaff(boolean ppStaff) {
		_cExtParticipationOther.setPpStaff(ppStaff);
	}

	/**
	* Sets the primary key of this c ext participation other.
	*
	* @param primaryKey the primary key of this c ext participation other
	*/
	@Override
	public void setPrimaryKey(
		ucc.portal.service.persistence.CExtParticipationOtherPK primaryKey) {
		_cExtParticipationOther.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cExtParticipationOther.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this c ext participation other.
	*
	* @param userId the user ID of this c ext participation other
	*/
	@Override
	public void setUserId(long userId) {
		_cExtParticipationOther.setUserId(userId);
	}

	/**
	* Sets the user uuid of this c ext participation other.
	*
	* @param userUuid the user uuid of this c ext participation other
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_cExtParticipationOther.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CExtParticipationOther> toCacheModel() {
		return _cExtParticipationOther.toCacheModel();
	}

	@Override
	public CExtParticipationOther toEscapedModel() {
		return new CExtParticipationOtherWrapper(_cExtParticipationOther.toEscapedModel());
	}

	@Override
	public String toString() {
		return _cExtParticipationOther.toString();
	}

	@Override
	public CExtParticipationOther toUnescapedModel() {
		return new CExtParticipationOtherWrapper(_cExtParticipationOther.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _cExtParticipationOther.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtParticipationOtherWrapper)) {
			return false;
		}

		CExtParticipationOtherWrapper cExtParticipationOtherWrapper = (CExtParticipationOtherWrapper)obj;

		if (Objects.equals(_cExtParticipationOther,
					cExtParticipationOtherWrapper._cExtParticipationOther)) {
			return true;
		}

		return false;
	}

	@Override
	public CExtParticipationOther getWrappedModel() {
		return _cExtParticipationOther;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cExtParticipationOther.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cExtParticipationOther.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cExtParticipationOther.resetOriginalValues();
	}

	private final CExtParticipationOther _cExtParticipationOther;
}