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
 * This class is a wrapper for {@link CExtStaffingChurch}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtStaffingChurch
 * @generated
 */
@ProviderType
public class CExtStaffingChurchWrapper implements CExtStaffingChurch,
	ModelWrapper<CExtStaffingChurch> {
	public CExtStaffingChurchWrapper(CExtStaffingChurch cExtStaffingChurch) {
		_cExtStaffingChurch = cExtStaffingChurch;
	}

	@Override
	public Class<?> getModelClass() {
		return CExtStaffingChurch.class;
	}

	@Override
	public String getModelClassName() {
		return CExtStaffingChurch.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organizationId", getOrganizationId());
		attributes.put("cextStaffingChurchId", getCextStaffingChurchId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("sfPosition", getSfPosition());
		attributes.put("sfHeadOfStaff", isSfHeadOfStaff());
		attributes.put("sfCompensation", getSfCompensation());
		attributes.put("sfSupervisedBy", getSfSupervisedBy());
		attributes.put("sfCurrentTenure", getSfCurrentTenure());
		attributes.put("sfPriority", getSfPriority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long cextStaffingChurchId = (Long)attributes.get("cextStaffingChurchId");

		if (cextStaffingChurchId != null) {
			setCextStaffingChurchId(cextStaffingChurchId);
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

		String sfPosition = (String)attributes.get("sfPosition");

		if (sfPosition != null) {
			setSfPosition(sfPosition);
		}

		Boolean sfHeadOfStaff = (Boolean)attributes.get("sfHeadOfStaff");

		if (sfHeadOfStaff != null) {
			setSfHeadOfStaff(sfHeadOfStaff);
		}

		String sfCompensation = (String)attributes.get("sfCompensation");

		if (sfCompensation != null) {
			setSfCompensation(sfCompensation);
		}

		String sfSupervisedBy = (String)attributes.get("sfSupervisedBy");

		if (sfSupervisedBy != null) {
			setSfSupervisedBy(sfSupervisedBy);
		}

		String sfCurrentTenure = (String)attributes.get("sfCurrentTenure");

		if (sfCurrentTenure != null) {
			setSfCurrentTenure(sfCurrentTenure);
		}

		Double sfPriority = (Double)attributes.get("sfPriority");

		if (sfPriority != null) {
			setSfPriority(sfPriority);
		}
	}

	@Override
	public Object clone() {
		return new CExtStaffingChurchWrapper((CExtStaffingChurch)_cExtStaffingChurch.clone());
	}

	@Override
	public int compareTo(CExtStaffingChurch cExtStaffingChurch) {
		return _cExtStaffingChurch.compareTo(cExtStaffingChurch);
	}

	/**
	* Returns the cext staffing church ID of this c ext staffing church.
	*
	* @return the cext staffing church ID of this c ext staffing church
	*/
	@Override
	public long getCextStaffingChurchId() {
		return _cExtStaffingChurch.getCextStaffingChurchId();
	}

	/**
	* Returns the company ID of this c ext staffing church.
	*
	* @return the company ID of this c ext staffing church
	*/
	@Override
	public long getCompanyId() {
		return _cExtStaffingChurch.getCompanyId();
	}

	/**
	* Returns the create date of this c ext staffing church.
	*
	* @return the create date of this c ext staffing church
	*/
	@Override
	public Date getCreateDate() {
		return _cExtStaffingChurch.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cExtStaffingChurch.getExpandoBridge();
	}

	/**
	* Returns the modified date of this c ext staffing church.
	*
	* @return the modified date of this c ext staffing church
	*/
	@Override
	public Date getModifiedDate() {
		return _cExtStaffingChurch.getModifiedDate();
	}

	/**
	* Returns the organization ID of this c ext staffing church.
	*
	* @return the organization ID of this c ext staffing church
	*/
	@Override
	public long getOrganizationId() {
		return _cExtStaffingChurch.getOrganizationId();
	}

	/**
	* Returns the primary key of this c ext staffing church.
	*
	* @return the primary key of this c ext staffing church
	*/
	@Override
	public ucc.portal.service.persistence.CExtStaffingChurchPK getPrimaryKey() {
		return _cExtStaffingChurch.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cExtStaffingChurch.getPrimaryKeyObj();
	}

	/**
	* Returns the sf compensation of this c ext staffing church.
	*
	* @return the sf compensation of this c ext staffing church
	*/
	@Override
	public String getSfCompensation() {
		return _cExtStaffingChurch.getSfCompensation();
	}

	/**
	* Returns the sf current tenure of this c ext staffing church.
	*
	* @return the sf current tenure of this c ext staffing church
	*/
	@Override
	public String getSfCurrentTenure() {
		return _cExtStaffingChurch.getSfCurrentTenure();
	}

	/**
	* Returns the sf head of staff of this c ext staffing church.
	*
	* @return the sf head of staff of this c ext staffing church
	*/
	@Override
	public boolean getSfHeadOfStaff() {
		return _cExtStaffingChurch.getSfHeadOfStaff();
	}

	/**
	* Returns the sf position of this c ext staffing church.
	*
	* @return the sf position of this c ext staffing church
	*/
	@Override
	public String getSfPosition() {
		return _cExtStaffingChurch.getSfPosition();
	}

	/**
	* Returns the sf priority of this c ext staffing church.
	*
	* @return the sf priority of this c ext staffing church
	*/
	@Override
	public double getSfPriority() {
		return _cExtStaffingChurch.getSfPriority();
	}

	/**
	* Returns the sf supervised by of this c ext staffing church.
	*
	* @return the sf supervised by of this c ext staffing church
	*/
	@Override
	public String getSfSupervisedBy() {
		return _cExtStaffingChurch.getSfSupervisedBy();
	}

	/**
	* Returns the user ID of this c ext staffing church.
	*
	* @return the user ID of this c ext staffing church
	*/
	@Override
	public long getUserId() {
		return _cExtStaffingChurch.getUserId();
	}

	/**
	* Returns the user uuid of this c ext staffing church.
	*
	* @return the user uuid of this c ext staffing church
	*/
	@Override
	public String getUserUuid() {
		return _cExtStaffingChurch.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _cExtStaffingChurch.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _cExtStaffingChurch.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cExtStaffingChurch.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cExtStaffingChurch.isNew();
	}

	/**
	* Returns <code>true</code> if this c ext staffing church is sf head of staff.
	*
	* @return <code>true</code> if this c ext staffing church is sf head of staff; <code>false</code> otherwise
	*/
	@Override
	public boolean isSfHeadOfStaff() {
		return _cExtStaffingChurch.isSfHeadOfStaff();
	}

	@Override
	public void persist() {
		_cExtStaffingChurch.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cExtStaffingChurch.setCachedModel(cachedModel);
	}

	/**
	* Sets the cext staffing church ID of this c ext staffing church.
	*
	* @param cextStaffingChurchId the cext staffing church ID of this c ext staffing church
	*/
	@Override
	public void setCextStaffingChurchId(long cextStaffingChurchId) {
		_cExtStaffingChurch.setCextStaffingChurchId(cextStaffingChurchId);
	}

	/**
	* Sets the company ID of this c ext staffing church.
	*
	* @param companyId the company ID of this c ext staffing church
	*/
	@Override
	public void setCompanyId(long companyId) {
		_cExtStaffingChurch.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this c ext staffing church.
	*
	* @param createDate the create date of this c ext staffing church
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_cExtStaffingChurch.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cExtStaffingChurch.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cExtStaffingChurch.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cExtStaffingChurch.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this c ext staffing church.
	*
	* @param modifiedDate the modified date of this c ext staffing church
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_cExtStaffingChurch.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_cExtStaffingChurch.setNew(n);
	}

	/**
	* Sets the organization ID of this c ext staffing church.
	*
	* @param organizationId the organization ID of this c ext staffing church
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_cExtStaffingChurch.setOrganizationId(organizationId);
	}

	/**
	* Sets the primary key of this c ext staffing church.
	*
	* @param primaryKey the primary key of this c ext staffing church
	*/
	@Override
	public void setPrimaryKey(
		ucc.portal.service.persistence.CExtStaffingChurchPK primaryKey) {
		_cExtStaffingChurch.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cExtStaffingChurch.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sf compensation of this c ext staffing church.
	*
	* @param sfCompensation the sf compensation of this c ext staffing church
	*/
	@Override
	public void setSfCompensation(String sfCompensation) {
		_cExtStaffingChurch.setSfCompensation(sfCompensation);
	}

	/**
	* Sets the sf current tenure of this c ext staffing church.
	*
	* @param sfCurrentTenure the sf current tenure of this c ext staffing church
	*/
	@Override
	public void setSfCurrentTenure(String sfCurrentTenure) {
		_cExtStaffingChurch.setSfCurrentTenure(sfCurrentTenure);
	}

	/**
	* Sets whether this c ext staffing church is sf head of staff.
	*
	* @param sfHeadOfStaff the sf head of staff of this c ext staffing church
	*/
	@Override
	public void setSfHeadOfStaff(boolean sfHeadOfStaff) {
		_cExtStaffingChurch.setSfHeadOfStaff(sfHeadOfStaff);
	}

	/**
	* Sets the sf position of this c ext staffing church.
	*
	* @param sfPosition the sf position of this c ext staffing church
	*/
	@Override
	public void setSfPosition(String sfPosition) {
		_cExtStaffingChurch.setSfPosition(sfPosition);
	}

	/**
	* Sets the sf priority of this c ext staffing church.
	*
	* @param sfPriority the sf priority of this c ext staffing church
	*/
	@Override
	public void setSfPriority(double sfPriority) {
		_cExtStaffingChurch.setSfPriority(sfPriority);
	}

	/**
	* Sets the sf supervised by of this c ext staffing church.
	*
	* @param sfSupervisedBy the sf supervised by of this c ext staffing church
	*/
	@Override
	public void setSfSupervisedBy(String sfSupervisedBy) {
		_cExtStaffingChurch.setSfSupervisedBy(sfSupervisedBy);
	}

	/**
	* Sets the user ID of this c ext staffing church.
	*
	* @param userId the user ID of this c ext staffing church
	*/
	@Override
	public void setUserId(long userId) {
		_cExtStaffingChurch.setUserId(userId);
	}

	/**
	* Sets the user uuid of this c ext staffing church.
	*
	* @param userUuid the user uuid of this c ext staffing church
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_cExtStaffingChurch.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CExtStaffingChurch> toCacheModel() {
		return _cExtStaffingChurch.toCacheModel();
	}

	@Override
	public CExtStaffingChurch toEscapedModel() {
		return new CExtStaffingChurchWrapper(_cExtStaffingChurch.toEscapedModel());
	}

	@Override
	public String toString() {
		return _cExtStaffingChurch.toString();
	}

	@Override
	public CExtStaffingChurch toUnescapedModel() {
		return new CExtStaffingChurchWrapper(_cExtStaffingChurch.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _cExtStaffingChurch.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtStaffingChurchWrapper)) {
			return false;
		}

		CExtStaffingChurchWrapper cExtStaffingChurchWrapper = (CExtStaffingChurchWrapper)obj;

		if (Objects.equals(_cExtStaffingChurch,
					cExtStaffingChurchWrapper._cExtStaffingChurch)) {
			return true;
		}

		return false;
	}

	@Override
	public CExtStaffingChurch getWrappedModel() {
		return _cExtStaffingChurch;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cExtStaffingChurch.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cExtStaffingChurch.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cExtStaffingChurch.resetOriginalValues();
	}

	private final CExtStaffingChurch _cExtStaffingChurch;
}