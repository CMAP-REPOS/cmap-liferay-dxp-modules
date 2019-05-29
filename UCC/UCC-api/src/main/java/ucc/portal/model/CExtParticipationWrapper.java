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
 * This class is a wrapper for {@link CExtParticipation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtParticipation
 * @generated
 */
@ProviderType
public class CExtParticipationWrapper implements CExtParticipation,
	ModelWrapper<CExtParticipation> {
	public CExtParticipationWrapper(CExtParticipation cExtParticipation) {
		_cExtParticipation = cExtParticipation;
	}

	@Override
	public Class<?> getModelClass() {
		return CExtParticipation.class;
	}

	@Override
	public String getModelClassName() {
		return CExtParticipation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organizationId", getOrganizationId());
		attributes.put("cextParticipationId", getCextParticipationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ppGatheringId", getPpGatheringId());
		attributes.put("ppGatheringKey", getPpGatheringKey());
		attributes.put("ppCount", getPpCount());
		attributes.put("ppLay", isPpLay());
		attributes.put("ppPastor", isPpPastor());
		attributes.put("ppStaff", isPpStaff());
		attributes.put("ppOther", isPpOther());
		attributes.put("ppGatheringAdditionalKey", getPpGatheringAdditionalKey());
		attributes.put("ppGatheringAdditionalType",
			getPpGatheringAdditionalType());
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

		Long cextParticipationId = (Long)attributes.get("cextParticipationId");

		if (cextParticipationId != null) {
			setCextParticipationId(cextParticipationId);
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

		String ppGatheringId = (String)attributes.get("ppGatheringId");

		if (ppGatheringId != null) {
			setPpGatheringId(ppGatheringId);
		}

		String ppGatheringKey = (String)attributes.get("ppGatheringKey");

		if (ppGatheringKey != null) {
			setPpGatheringKey(ppGatheringKey);
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

		String ppGatheringAdditionalKey = (String)attributes.get(
				"ppGatheringAdditionalKey");

		if (ppGatheringAdditionalKey != null) {
			setPpGatheringAdditionalKey(ppGatheringAdditionalKey);
		}

		String ppGatheringAdditionalType = (String)attributes.get(
				"ppGatheringAdditionalType");

		if (ppGatheringAdditionalType != null) {
			setPpGatheringAdditionalType(ppGatheringAdditionalType);
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
		return new CExtParticipationWrapper((CExtParticipation)_cExtParticipation.clone());
	}

	@Override
	public int compareTo(CExtParticipation cExtParticipation) {
		return _cExtParticipation.compareTo(cExtParticipation);
	}

	/**
	* Returns the cext participation ID of this c ext participation.
	*
	* @return the cext participation ID of this c ext participation
	*/
	@Override
	public long getCextParticipationId() {
		return _cExtParticipation.getCextParticipationId();
	}

	/**
	* Returns the company ID of this c ext participation.
	*
	* @return the company ID of this c ext participation
	*/
	@Override
	public long getCompanyId() {
		return _cExtParticipation.getCompanyId();
	}

	/**
	* Returns the create date of this c ext participation.
	*
	* @return the create date of this c ext participation
	*/
	@Override
	public Date getCreateDate() {
		return _cExtParticipation.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cExtParticipation.getExpandoBridge();
	}

	/**
	* Returns the modified date of this c ext participation.
	*
	* @return the modified date of this c ext participation
	*/
	@Override
	public Date getModifiedDate() {
		return _cExtParticipation.getModifiedDate();
	}

	/**
	* Returns the organization ID of this c ext participation.
	*
	* @return the organization ID of this c ext participation
	*/
	@Override
	public long getOrganizationId() {
		return _cExtParticipation.getOrganizationId();
	}

	/**
	* Returns the pp additional information of this c ext participation.
	*
	* @return the pp additional information of this c ext participation
	*/
	@Override
	public String getPpAdditionalInformation() {
		return _cExtParticipation.getPpAdditionalInformation();
	}

	/**
	* Returns the pp count of this c ext participation.
	*
	* @return the pp count of this c ext participation
	*/
	@Override
	public int getPpCount() {
		return _cExtParticipation.getPpCount();
	}

	/**
	* Returns the pp gathering additional key of this c ext participation.
	*
	* @return the pp gathering additional key of this c ext participation
	*/
	@Override
	public String getPpGatheringAdditionalKey() {
		return _cExtParticipation.getPpGatheringAdditionalKey();
	}

	/**
	* Returns the pp gathering additional type of this c ext participation.
	*
	* @return the pp gathering additional type of this c ext participation
	*/
	@Override
	public String getPpGatheringAdditionalType() {
		return _cExtParticipation.getPpGatheringAdditionalType();
	}

	/**
	* Returns the pp gathering ID of this c ext participation.
	*
	* @return the pp gathering ID of this c ext participation
	*/
	@Override
	public String getPpGatheringId() {
		return _cExtParticipation.getPpGatheringId();
	}

	/**
	* Returns the pp gathering key of this c ext participation.
	*
	* @return the pp gathering key of this c ext participation
	*/
	@Override
	public String getPpGatheringKey() {
		return _cExtParticipation.getPpGatheringKey();
	}

	/**
	* Returns the pp lay of this c ext participation.
	*
	* @return the pp lay of this c ext participation
	*/
	@Override
	public boolean getPpLay() {
		return _cExtParticipation.getPpLay();
	}

	/**
	* Returns the pp other of this c ext participation.
	*
	* @return the pp other of this c ext participation
	*/
	@Override
	public boolean getPpOther() {
		return _cExtParticipation.getPpOther();
	}

	/**
	* Returns the pp pastor of this c ext participation.
	*
	* @return the pp pastor of this c ext participation
	*/
	@Override
	public boolean getPpPastor() {
		return _cExtParticipation.getPpPastor();
	}

	/**
	* Returns the pp priority of this c ext participation.
	*
	* @return the pp priority of this c ext participation
	*/
	@Override
	public double getPpPriority() {
		return _cExtParticipation.getPpPriority();
	}

	/**
	* Returns the pp staff of this c ext participation.
	*
	* @return the pp staff of this c ext participation
	*/
	@Override
	public boolean getPpStaff() {
		return _cExtParticipation.getPpStaff();
	}

	/**
	* Returns the primary key of this c ext participation.
	*
	* @return the primary key of this c ext participation
	*/
	@Override
	public ucc.portal.service.persistence.CExtParticipationPK getPrimaryKey() {
		return _cExtParticipation.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cExtParticipation.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this c ext participation.
	*
	* @return the user ID of this c ext participation
	*/
	@Override
	public long getUserId() {
		return _cExtParticipation.getUserId();
	}

	/**
	* Returns the user uuid of this c ext participation.
	*
	* @return the user uuid of this c ext participation
	*/
	@Override
	public String getUserUuid() {
		return _cExtParticipation.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _cExtParticipation.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _cExtParticipation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cExtParticipation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cExtParticipation.isNew();
	}

	/**
	* Returns <code>true</code> if this c ext participation is pp lay.
	*
	* @return <code>true</code> if this c ext participation is pp lay; <code>false</code> otherwise
	*/
	@Override
	public boolean isPpLay() {
		return _cExtParticipation.isPpLay();
	}

	/**
	* Returns <code>true</code> if this c ext participation is pp other.
	*
	* @return <code>true</code> if this c ext participation is pp other; <code>false</code> otherwise
	*/
	@Override
	public boolean isPpOther() {
		return _cExtParticipation.isPpOther();
	}

	/**
	* Returns <code>true</code> if this c ext participation is pp pastor.
	*
	* @return <code>true</code> if this c ext participation is pp pastor; <code>false</code> otherwise
	*/
	@Override
	public boolean isPpPastor() {
		return _cExtParticipation.isPpPastor();
	}

	/**
	* Returns <code>true</code> if this c ext participation is pp staff.
	*
	* @return <code>true</code> if this c ext participation is pp staff; <code>false</code> otherwise
	*/
	@Override
	public boolean isPpStaff() {
		return _cExtParticipation.isPpStaff();
	}

	@Override
	public void persist() {
		_cExtParticipation.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cExtParticipation.setCachedModel(cachedModel);
	}

	/**
	* Sets the cext participation ID of this c ext participation.
	*
	* @param cextParticipationId the cext participation ID of this c ext participation
	*/
	@Override
	public void setCextParticipationId(long cextParticipationId) {
		_cExtParticipation.setCextParticipationId(cextParticipationId);
	}

	/**
	* Sets the company ID of this c ext participation.
	*
	* @param companyId the company ID of this c ext participation
	*/
	@Override
	public void setCompanyId(long companyId) {
		_cExtParticipation.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this c ext participation.
	*
	* @param createDate the create date of this c ext participation
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_cExtParticipation.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cExtParticipation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cExtParticipation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cExtParticipation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this c ext participation.
	*
	* @param modifiedDate the modified date of this c ext participation
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_cExtParticipation.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_cExtParticipation.setNew(n);
	}

	/**
	* Sets the organization ID of this c ext participation.
	*
	* @param organizationId the organization ID of this c ext participation
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_cExtParticipation.setOrganizationId(organizationId);
	}

	/**
	* Sets the pp additional information of this c ext participation.
	*
	* @param ppAdditionalInformation the pp additional information of this c ext participation
	*/
	@Override
	public void setPpAdditionalInformation(String ppAdditionalInformation) {
		_cExtParticipation.setPpAdditionalInformation(ppAdditionalInformation);
	}

	/**
	* Sets the pp count of this c ext participation.
	*
	* @param ppCount the pp count of this c ext participation
	*/
	@Override
	public void setPpCount(int ppCount) {
		_cExtParticipation.setPpCount(ppCount);
	}

	/**
	* Sets the pp gathering additional key of this c ext participation.
	*
	* @param ppGatheringAdditionalKey the pp gathering additional key of this c ext participation
	*/
	@Override
	public void setPpGatheringAdditionalKey(String ppGatheringAdditionalKey) {
		_cExtParticipation.setPpGatheringAdditionalKey(ppGatheringAdditionalKey);
	}

	/**
	* Sets the pp gathering additional type of this c ext participation.
	*
	* @param ppGatheringAdditionalType the pp gathering additional type of this c ext participation
	*/
	@Override
	public void setPpGatheringAdditionalType(String ppGatheringAdditionalType) {
		_cExtParticipation.setPpGatheringAdditionalType(ppGatheringAdditionalType);
	}

	/**
	* Sets the pp gathering ID of this c ext participation.
	*
	* @param ppGatheringId the pp gathering ID of this c ext participation
	*/
	@Override
	public void setPpGatheringId(String ppGatheringId) {
		_cExtParticipation.setPpGatheringId(ppGatheringId);
	}

	/**
	* Sets the pp gathering key of this c ext participation.
	*
	* @param ppGatheringKey the pp gathering key of this c ext participation
	*/
	@Override
	public void setPpGatheringKey(String ppGatheringKey) {
		_cExtParticipation.setPpGatheringKey(ppGatheringKey);
	}

	/**
	* Sets whether this c ext participation is pp lay.
	*
	* @param ppLay the pp lay of this c ext participation
	*/
	@Override
	public void setPpLay(boolean ppLay) {
		_cExtParticipation.setPpLay(ppLay);
	}

	/**
	* Sets whether this c ext participation is pp other.
	*
	* @param ppOther the pp other of this c ext participation
	*/
	@Override
	public void setPpOther(boolean ppOther) {
		_cExtParticipation.setPpOther(ppOther);
	}

	/**
	* Sets whether this c ext participation is pp pastor.
	*
	* @param ppPastor the pp pastor of this c ext participation
	*/
	@Override
	public void setPpPastor(boolean ppPastor) {
		_cExtParticipation.setPpPastor(ppPastor);
	}

	/**
	* Sets the pp priority of this c ext participation.
	*
	* @param ppPriority the pp priority of this c ext participation
	*/
	@Override
	public void setPpPriority(double ppPriority) {
		_cExtParticipation.setPpPriority(ppPriority);
	}

	/**
	* Sets whether this c ext participation is pp staff.
	*
	* @param ppStaff the pp staff of this c ext participation
	*/
	@Override
	public void setPpStaff(boolean ppStaff) {
		_cExtParticipation.setPpStaff(ppStaff);
	}

	/**
	* Sets the primary key of this c ext participation.
	*
	* @param primaryKey the primary key of this c ext participation
	*/
	@Override
	public void setPrimaryKey(
		ucc.portal.service.persistence.CExtParticipationPK primaryKey) {
		_cExtParticipation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cExtParticipation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this c ext participation.
	*
	* @param userId the user ID of this c ext participation
	*/
	@Override
	public void setUserId(long userId) {
		_cExtParticipation.setUserId(userId);
	}

	/**
	* Sets the user uuid of this c ext participation.
	*
	* @param userUuid the user uuid of this c ext participation
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_cExtParticipation.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CExtParticipation> toCacheModel() {
		return _cExtParticipation.toCacheModel();
	}

	@Override
	public CExtParticipation toEscapedModel() {
		return new CExtParticipationWrapper(_cExtParticipation.toEscapedModel());
	}

	@Override
	public String toString() {
		return _cExtParticipation.toString();
	}

	@Override
	public CExtParticipation toUnescapedModel() {
		return new CExtParticipationWrapper(_cExtParticipation.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _cExtParticipation.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtParticipationWrapper)) {
			return false;
		}

		CExtParticipationWrapper cExtParticipationWrapper = (CExtParticipationWrapper)obj;

		if (Objects.equals(_cExtParticipation,
					cExtParticipationWrapper._cExtParticipation)) {
			return true;
		}

		return false;
	}

	@Override
	public CExtParticipation getWrappedModel() {
		return _cExtParticipation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cExtParticipation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cExtParticipation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cExtParticipation.resetOriginalValues();
	}

	private final CExtParticipation _cExtParticipation;
}