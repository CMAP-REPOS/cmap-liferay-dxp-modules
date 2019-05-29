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
 * This class is a wrapper for {@link CExtStaffingCongregation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtStaffingCongregation
 * @generated
 */
@ProviderType
public class CExtStaffingCongregationWrapper implements CExtStaffingCongregation,
	ModelWrapper<CExtStaffingCongregation> {
	public CExtStaffingCongregationWrapper(
		CExtStaffingCongregation cExtStaffingCongregation) {
		_cExtStaffingCongregation = cExtStaffingCongregation;
	}

	@Override
	public Class<?> getModelClass() {
		return CExtStaffingCongregation.class;
	}

	@Override
	public String getModelClassName() {
		return CExtStaffingCongregation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organizationId", getOrganizationId());
		attributes.put("cextStaffingCongregationId",
			getCextStaffingCongregationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("sfMinisterName", getSfMinisterName());
		attributes.put("sfMinisterRetired", isSfMinisterRetired());
		attributes.put("sfMinisterCovenant", getSfMinisterCovenant());
		attributes.put("sfMinistrySetting", getSfMinistrySetting());
		attributes.put("sfMinistryRole", getSfMinistryRole());
		attributes.put("sfPriority", getSfPriority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long cextStaffingCongregationId = (Long)attributes.get(
				"cextStaffingCongregationId");

		if (cextStaffingCongregationId != null) {
			setCextStaffingCongregationId(cextStaffingCongregationId);
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

		String sfMinisterName = (String)attributes.get("sfMinisterName");

		if (sfMinisterName != null) {
			setSfMinisterName(sfMinisterName);
		}

		Boolean sfMinisterRetired = (Boolean)attributes.get("sfMinisterRetired");

		if (sfMinisterRetired != null) {
			setSfMinisterRetired(sfMinisterRetired);
		}

		String sfMinisterCovenant = (String)attributes.get("sfMinisterCovenant");

		if (sfMinisterCovenant != null) {
			setSfMinisterCovenant(sfMinisterCovenant);
		}

		String sfMinistrySetting = (String)attributes.get("sfMinistrySetting");

		if (sfMinistrySetting != null) {
			setSfMinistrySetting(sfMinistrySetting);
		}

		String sfMinistryRole = (String)attributes.get("sfMinistryRole");

		if (sfMinistryRole != null) {
			setSfMinistryRole(sfMinistryRole);
		}

		Double sfPriority = (Double)attributes.get("sfPriority");

		if (sfPriority != null) {
			setSfPriority(sfPriority);
		}
	}

	@Override
	public Object clone() {
		return new CExtStaffingCongregationWrapper((CExtStaffingCongregation)_cExtStaffingCongregation.clone());
	}

	@Override
	public int compareTo(CExtStaffingCongregation cExtStaffingCongregation) {
		return _cExtStaffingCongregation.compareTo(cExtStaffingCongregation);
	}

	/**
	* Returns the cext staffing congregation ID of this c ext staffing congregation.
	*
	* @return the cext staffing congregation ID of this c ext staffing congregation
	*/
	@Override
	public long getCextStaffingCongregationId() {
		return _cExtStaffingCongregation.getCextStaffingCongregationId();
	}

	/**
	* Returns the company ID of this c ext staffing congregation.
	*
	* @return the company ID of this c ext staffing congregation
	*/
	@Override
	public long getCompanyId() {
		return _cExtStaffingCongregation.getCompanyId();
	}

	/**
	* Returns the create date of this c ext staffing congregation.
	*
	* @return the create date of this c ext staffing congregation
	*/
	@Override
	public Date getCreateDate() {
		return _cExtStaffingCongregation.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cExtStaffingCongregation.getExpandoBridge();
	}

	/**
	* Returns the modified date of this c ext staffing congregation.
	*
	* @return the modified date of this c ext staffing congregation
	*/
	@Override
	public Date getModifiedDate() {
		return _cExtStaffingCongregation.getModifiedDate();
	}

	/**
	* Returns the organization ID of this c ext staffing congregation.
	*
	* @return the organization ID of this c ext staffing congregation
	*/
	@Override
	public long getOrganizationId() {
		return _cExtStaffingCongregation.getOrganizationId();
	}

	/**
	* Returns the primary key of this c ext staffing congregation.
	*
	* @return the primary key of this c ext staffing congregation
	*/
	@Override
	public ucc.portal.service.persistence.CExtStaffingCongregationPK getPrimaryKey() {
		return _cExtStaffingCongregation.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cExtStaffingCongregation.getPrimaryKeyObj();
	}

	/**
	* Returns the sf minister covenant of this c ext staffing congregation.
	*
	* @return the sf minister covenant of this c ext staffing congregation
	*/
	@Override
	public String getSfMinisterCovenant() {
		return _cExtStaffingCongregation.getSfMinisterCovenant();
	}

	/**
	* Returns the sf minister name of this c ext staffing congregation.
	*
	* @return the sf minister name of this c ext staffing congregation
	*/
	@Override
	public String getSfMinisterName() {
		return _cExtStaffingCongregation.getSfMinisterName();
	}

	/**
	* Returns the sf minister retired of this c ext staffing congregation.
	*
	* @return the sf minister retired of this c ext staffing congregation
	*/
	@Override
	public boolean getSfMinisterRetired() {
		return _cExtStaffingCongregation.getSfMinisterRetired();
	}

	/**
	* Returns the sf ministry role of this c ext staffing congregation.
	*
	* @return the sf ministry role of this c ext staffing congregation
	*/
	@Override
	public String getSfMinistryRole() {
		return _cExtStaffingCongregation.getSfMinistryRole();
	}

	/**
	* Returns the sf ministry setting of this c ext staffing congregation.
	*
	* @return the sf ministry setting of this c ext staffing congregation
	*/
	@Override
	public String getSfMinistrySetting() {
		return _cExtStaffingCongregation.getSfMinistrySetting();
	}

	/**
	* Returns the sf priority of this c ext staffing congregation.
	*
	* @return the sf priority of this c ext staffing congregation
	*/
	@Override
	public double getSfPriority() {
		return _cExtStaffingCongregation.getSfPriority();
	}

	/**
	* Returns the user ID of this c ext staffing congregation.
	*
	* @return the user ID of this c ext staffing congregation
	*/
	@Override
	public long getUserId() {
		return _cExtStaffingCongregation.getUserId();
	}

	/**
	* Returns the user uuid of this c ext staffing congregation.
	*
	* @return the user uuid of this c ext staffing congregation
	*/
	@Override
	public String getUserUuid() {
		return _cExtStaffingCongregation.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _cExtStaffingCongregation.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _cExtStaffingCongregation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cExtStaffingCongregation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cExtStaffingCongregation.isNew();
	}

	/**
	* Returns <code>true</code> if this c ext staffing congregation is sf minister retired.
	*
	* @return <code>true</code> if this c ext staffing congregation is sf minister retired; <code>false</code> otherwise
	*/
	@Override
	public boolean isSfMinisterRetired() {
		return _cExtStaffingCongregation.isSfMinisterRetired();
	}

	@Override
	public void persist() {
		_cExtStaffingCongregation.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cExtStaffingCongregation.setCachedModel(cachedModel);
	}

	/**
	* Sets the cext staffing congregation ID of this c ext staffing congregation.
	*
	* @param cextStaffingCongregationId the cext staffing congregation ID of this c ext staffing congregation
	*/
	@Override
	public void setCextStaffingCongregationId(long cextStaffingCongregationId) {
		_cExtStaffingCongregation.setCextStaffingCongregationId(cextStaffingCongregationId);
	}

	/**
	* Sets the company ID of this c ext staffing congregation.
	*
	* @param companyId the company ID of this c ext staffing congregation
	*/
	@Override
	public void setCompanyId(long companyId) {
		_cExtStaffingCongregation.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this c ext staffing congregation.
	*
	* @param createDate the create date of this c ext staffing congregation
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_cExtStaffingCongregation.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cExtStaffingCongregation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cExtStaffingCongregation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cExtStaffingCongregation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this c ext staffing congregation.
	*
	* @param modifiedDate the modified date of this c ext staffing congregation
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_cExtStaffingCongregation.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_cExtStaffingCongregation.setNew(n);
	}

	/**
	* Sets the organization ID of this c ext staffing congregation.
	*
	* @param organizationId the organization ID of this c ext staffing congregation
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_cExtStaffingCongregation.setOrganizationId(organizationId);
	}

	/**
	* Sets the primary key of this c ext staffing congregation.
	*
	* @param primaryKey the primary key of this c ext staffing congregation
	*/
	@Override
	public void setPrimaryKey(
		ucc.portal.service.persistence.CExtStaffingCongregationPK primaryKey) {
		_cExtStaffingCongregation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cExtStaffingCongregation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sf minister covenant of this c ext staffing congregation.
	*
	* @param sfMinisterCovenant the sf minister covenant of this c ext staffing congregation
	*/
	@Override
	public void setSfMinisterCovenant(String sfMinisterCovenant) {
		_cExtStaffingCongregation.setSfMinisterCovenant(sfMinisterCovenant);
	}

	/**
	* Sets the sf minister name of this c ext staffing congregation.
	*
	* @param sfMinisterName the sf minister name of this c ext staffing congregation
	*/
	@Override
	public void setSfMinisterName(String sfMinisterName) {
		_cExtStaffingCongregation.setSfMinisterName(sfMinisterName);
	}

	/**
	* Sets whether this c ext staffing congregation is sf minister retired.
	*
	* @param sfMinisterRetired the sf minister retired of this c ext staffing congregation
	*/
	@Override
	public void setSfMinisterRetired(boolean sfMinisterRetired) {
		_cExtStaffingCongregation.setSfMinisterRetired(sfMinisterRetired);
	}

	/**
	* Sets the sf ministry role of this c ext staffing congregation.
	*
	* @param sfMinistryRole the sf ministry role of this c ext staffing congregation
	*/
	@Override
	public void setSfMinistryRole(String sfMinistryRole) {
		_cExtStaffingCongregation.setSfMinistryRole(sfMinistryRole);
	}

	/**
	* Sets the sf ministry setting of this c ext staffing congregation.
	*
	* @param sfMinistrySetting the sf ministry setting of this c ext staffing congregation
	*/
	@Override
	public void setSfMinistrySetting(String sfMinistrySetting) {
		_cExtStaffingCongregation.setSfMinistrySetting(sfMinistrySetting);
	}

	/**
	* Sets the sf priority of this c ext staffing congregation.
	*
	* @param sfPriority the sf priority of this c ext staffing congregation
	*/
	@Override
	public void setSfPriority(double sfPriority) {
		_cExtStaffingCongregation.setSfPriority(sfPriority);
	}

	/**
	* Sets the user ID of this c ext staffing congregation.
	*
	* @param userId the user ID of this c ext staffing congregation
	*/
	@Override
	public void setUserId(long userId) {
		_cExtStaffingCongregation.setUserId(userId);
	}

	/**
	* Sets the user uuid of this c ext staffing congregation.
	*
	* @param userUuid the user uuid of this c ext staffing congregation
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_cExtStaffingCongregation.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CExtStaffingCongregation> toCacheModel() {
		return _cExtStaffingCongregation.toCacheModel();
	}

	@Override
	public CExtStaffingCongregation toEscapedModel() {
		return new CExtStaffingCongregationWrapper(_cExtStaffingCongregation.toEscapedModel());
	}

	@Override
	public String toString() {
		return _cExtStaffingCongregation.toString();
	}

	@Override
	public CExtStaffingCongregation toUnescapedModel() {
		return new CExtStaffingCongregationWrapper(_cExtStaffingCongregation.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _cExtStaffingCongregation.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtStaffingCongregationWrapper)) {
			return false;
		}

		CExtStaffingCongregationWrapper cExtStaffingCongregationWrapper = (CExtStaffingCongregationWrapper)obj;

		if (Objects.equals(_cExtStaffingCongregation,
					cExtStaffingCongregationWrapper._cExtStaffingCongregation)) {
			return true;
		}

		return false;
	}

	@Override
	public CExtStaffingCongregation getWrappedModel() {
		return _cExtStaffingCongregation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cExtStaffingCongregation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cExtStaffingCongregation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cExtStaffingCongregation.resetOriginalValues();
	}

	private final CExtStaffingCongregation _cExtStaffingCongregation;
}