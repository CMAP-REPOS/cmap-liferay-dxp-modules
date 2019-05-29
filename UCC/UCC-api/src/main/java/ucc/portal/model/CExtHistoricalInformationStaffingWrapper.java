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
 * This class is a wrapper for {@link CExtHistoricalInformationStaffing}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtHistoricalInformationStaffing
 * @generated
 */
@ProviderType
public class CExtHistoricalInformationStaffingWrapper
	implements CExtHistoricalInformationStaffing,
		ModelWrapper<CExtHistoricalInformationStaffing> {
	public CExtHistoricalInformationStaffingWrapper(
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing) {
		_cExtHistoricalInformationStaffing = cExtHistoricalInformationStaffing;
	}

	@Override
	public Class<?> getModelClass() {
		return CExtHistoricalInformationStaffing.class;
	}

	@Override
	public String getModelClassName() {
		return CExtHistoricalInformationStaffing.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organizationId", getOrganizationId());
		attributes.put("cextHistoricalInformationStaffingId",
			getCextHistoricalInformationStaffingId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("hiMinisterName", getHiMinisterName());
		attributes.put("hiMinisterUCCStanding", isHiMinisterUCCStanding());
		attributes.put("hiMinisterStartYearOfService",
			getHiMinisterStartYearOfService());
		attributes.put("hiMinisterEndYearOfService",
			getHiMinisterEndYearOfService());
		attributes.put("hiPriority", getHiPriority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long cextHistoricalInformationStaffingId = (Long)attributes.get(
				"cextHistoricalInformationStaffingId");

		if (cextHistoricalInformationStaffingId != null) {
			setCextHistoricalInformationStaffingId(cextHistoricalInformationStaffingId);
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

		String hiMinisterName = (String)attributes.get("hiMinisterName");

		if (hiMinisterName != null) {
			setHiMinisterName(hiMinisterName);
		}

		Boolean hiMinisterUCCStanding = (Boolean)attributes.get(
				"hiMinisterUCCStanding");

		if (hiMinisterUCCStanding != null) {
			setHiMinisterUCCStanding(hiMinisterUCCStanding);
		}

		Integer hiMinisterStartYearOfService = (Integer)attributes.get(
				"hiMinisterStartYearOfService");

		if (hiMinisterStartYearOfService != null) {
			setHiMinisterStartYearOfService(hiMinisterStartYearOfService);
		}

		Integer hiMinisterEndYearOfService = (Integer)attributes.get(
				"hiMinisterEndYearOfService");

		if (hiMinisterEndYearOfService != null) {
			setHiMinisterEndYearOfService(hiMinisterEndYearOfService);
		}

		Double hiPriority = (Double)attributes.get("hiPriority");

		if (hiPriority != null) {
			setHiPriority(hiPriority);
		}
	}

	@Override
	public Object clone() {
		return new CExtHistoricalInformationStaffingWrapper((CExtHistoricalInformationStaffing)_cExtHistoricalInformationStaffing.clone());
	}

	@Override
	public int compareTo(
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing) {
		return _cExtHistoricalInformationStaffing.compareTo(cExtHistoricalInformationStaffing);
	}

	/**
	* Returns the cext historical information staffing ID of this c ext historical information staffing.
	*
	* @return the cext historical information staffing ID of this c ext historical information staffing
	*/
	@Override
	public long getCextHistoricalInformationStaffingId() {
		return _cExtHistoricalInformationStaffing.getCextHistoricalInformationStaffingId();
	}

	/**
	* Returns the company ID of this c ext historical information staffing.
	*
	* @return the company ID of this c ext historical information staffing
	*/
	@Override
	public long getCompanyId() {
		return _cExtHistoricalInformationStaffing.getCompanyId();
	}

	/**
	* Returns the create date of this c ext historical information staffing.
	*
	* @return the create date of this c ext historical information staffing
	*/
	@Override
	public Date getCreateDate() {
		return _cExtHistoricalInformationStaffing.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cExtHistoricalInformationStaffing.getExpandoBridge();
	}

	/**
	* Returns the hi minister end year of service of this c ext historical information staffing.
	*
	* @return the hi minister end year of service of this c ext historical information staffing
	*/
	@Override
	public int getHiMinisterEndYearOfService() {
		return _cExtHistoricalInformationStaffing.getHiMinisterEndYearOfService();
	}

	/**
	* Returns the hi minister name of this c ext historical information staffing.
	*
	* @return the hi minister name of this c ext historical information staffing
	*/
	@Override
	public String getHiMinisterName() {
		return _cExtHistoricalInformationStaffing.getHiMinisterName();
	}

	/**
	* Returns the hi minister start year of service of this c ext historical information staffing.
	*
	* @return the hi minister start year of service of this c ext historical information staffing
	*/
	@Override
	public int getHiMinisterStartYearOfService() {
		return _cExtHistoricalInformationStaffing.getHiMinisterStartYearOfService();
	}

	/**
	* Returns the hi minister ucc standing of this c ext historical information staffing.
	*
	* @return the hi minister ucc standing of this c ext historical information staffing
	*/
	@Override
	public boolean getHiMinisterUCCStanding() {
		return _cExtHistoricalInformationStaffing.getHiMinisterUCCStanding();
	}

	/**
	* Returns the hi priority of this c ext historical information staffing.
	*
	* @return the hi priority of this c ext historical information staffing
	*/
	@Override
	public double getHiPriority() {
		return _cExtHistoricalInformationStaffing.getHiPriority();
	}

	/**
	* Returns the modified date of this c ext historical information staffing.
	*
	* @return the modified date of this c ext historical information staffing
	*/
	@Override
	public Date getModifiedDate() {
		return _cExtHistoricalInformationStaffing.getModifiedDate();
	}

	/**
	* Returns the organization ID of this c ext historical information staffing.
	*
	* @return the organization ID of this c ext historical information staffing
	*/
	@Override
	public long getOrganizationId() {
		return _cExtHistoricalInformationStaffing.getOrganizationId();
	}

	/**
	* Returns the primary key of this c ext historical information staffing.
	*
	* @return the primary key of this c ext historical information staffing
	*/
	@Override
	public ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK getPrimaryKey() {
		return _cExtHistoricalInformationStaffing.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cExtHistoricalInformationStaffing.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this c ext historical information staffing.
	*
	* @return the user ID of this c ext historical information staffing
	*/
	@Override
	public long getUserId() {
		return _cExtHistoricalInformationStaffing.getUserId();
	}

	/**
	* Returns the user uuid of this c ext historical information staffing.
	*
	* @return the user uuid of this c ext historical information staffing
	*/
	@Override
	public String getUserUuid() {
		return _cExtHistoricalInformationStaffing.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _cExtHistoricalInformationStaffing.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _cExtHistoricalInformationStaffing.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cExtHistoricalInformationStaffing.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this c ext historical information staffing is hi minister ucc standing.
	*
	* @return <code>true</code> if this c ext historical information staffing is hi minister ucc standing; <code>false</code> otherwise
	*/
	@Override
	public boolean isHiMinisterUCCStanding() {
		return _cExtHistoricalInformationStaffing.isHiMinisterUCCStanding();
	}

	@Override
	public boolean isNew() {
		return _cExtHistoricalInformationStaffing.isNew();
	}

	@Override
	public void persist() {
		_cExtHistoricalInformationStaffing.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cExtHistoricalInformationStaffing.setCachedModel(cachedModel);
	}

	/**
	* Sets the cext historical information staffing ID of this c ext historical information staffing.
	*
	* @param cextHistoricalInformationStaffingId the cext historical information staffing ID of this c ext historical information staffing
	*/
	@Override
	public void setCextHistoricalInformationStaffingId(
		long cextHistoricalInformationStaffingId) {
		_cExtHistoricalInformationStaffing.setCextHistoricalInformationStaffingId(cextHistoricalInformationStaffingId);
	}

	/**
	* Sets the company ID of this c ext historical information staffing.
	*
	* @param companyId the company ID of this c ext historical information staffing
	*/
	@Override
	public void setCompanyId(long companyId) {
		_cExtHistoricalInformationStaffing.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this c ext historical information staffing.
	*
	* @param createDate the create date of this c ext historical information staffing
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_cExtHistoricalInformationStaffing.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cExtHistoricalInformationStaffing.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cExtHistoricalInformationStaffing.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cExtHistoricalInformationStaffing.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the hi minister end year of service of this c ext historical information staffing.
	*
	* @param hiMinisterEndYearOfService the hi minister end year of service of this c ext historical information staffing
	*/
	@Override
	public void setHiMinisterEndYearOfService(int hiMinisterEndYearOfService) {
		_cExtHistoricalInformationStaffing.setHiMinisterEndYearOfService(hiMinisterEndYearOfService);
	}

	/**
	* Sets the hi minister name of this c ext historical information staffing.
	*
	* @param hiMinisterName the hi minister name of this c ext historical information staffing
	*/
	@Override
	public void setHiMinisterName(String hiMinisterName) {
		_cExtHistoricalInformationStaffing.setHiMinisterName(hiMinisterName);
	}

	/**
	* Sets the hi minister start year of service of this c ext historical information staffing.
	*
	* @param hiMinisterStartYearOfService the hi minister start year of service of this c ext historical information staffing
	*/
	@Override
	public void setHiMinisterStartYearOfService(
		int hiMinisterStartYearOfService) {
		_cExtHistoricalInformationStaffing.setHiMinisterStartYearOfService(hiMinisterStartYearOfService);
	}

	/**
	* Sets whether this c ext historical information staffing is hi minister ucc standing.
	*
	* @param hiMinisterUCCStanding the hi minister ucc standing of this c ext historical information staffing
	*/
	@Override
	public void setHiMinisterUCCStanding(boolean hiMinisterUCCStanding) {
		_cExtHistoricalInformationStaffing.setHiMinisterUCCStanding(hiMinisterUCCStanding);
	}

	/**
	* Sets the hi priority of this c ext historical information staffing.
	*
	* @param hiPriority the hi priority of this c ext historical information staffing
	*/
	@Override
	public void setHiPriority(double hiPriority) {
		_cExtHistoricalInformationStaffing.setHiPriority(hiPriority);
	}

	/**
	* Sets the modified date of this c ext historical information staffing.
	*
	* @param modifiedDate the modified date of this c ext historical information staffing
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_cExtHistoricalInformationStaffing.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_cExtHistoricalInformationStaffing.setNew(n);
	}

	/**
	* Sets the organization ID of this c ext historical information staffing.
	*
	* @param organizationId the organization ID of this c ext historical information staffing
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_cExtHistoricalInformationStaffing.setOrganizationId(organizationId);
	}

	/**
	* Sets the primary key of this c ext historical information staffing.
	*
	* @param primaryKey the primary key of this c ext historical information staffing
	*/
	@Override
	public void setPrimaryKey(
		ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK primaryKey) {
		_cExtHistoricalInformationStaffing.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cExtHistoricalInformationStaffing.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this c ext historical information staffing.
	*
	* @param userId the user ID of this c ext historical information staffing
	*/
	@Override
	public void setUserId(long userId) {
		_cExtHistoricalInformationStaffing.setUserId(userId);
	}

	/**
	* Sets the user uuid of this c ext historical information staffing.
	*
	* @param userUuid the user uuid of this c ext historical information staffing
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_cExtHistoricalInformationStaffing.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CExtHistoricalInformationStaffing> toCacheModel() {
		return _cExtHistoricalInformationStaffing.toCacheModel();
	}

	@Override
	public CExtHistoricalInformationStaffing toEscapedModel() {
		return new CExtHistoricalInformationStaffingWrapper(_cExtHistoricalInformationStaffing.toEscapedModel());
	}

	@Override
	public String toString() {
		return _cExtHistoricalInformationStaffing.toString();
	}

	@Override
	public CExtHistoricalInformationStaffing toUnescapedModel() {
		return new CExtHistoricalInformationStaffingWrapper(_cExtHistoricalInformationStaffing.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _cExtHistoricalInformationStaffing.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtHistoricalInformationStaffingWrapper)) {
			return false;
		}

		CExtHistoricalInformationStaffingWrapper cExtHistoricalInformationStaffingWrapper =
			(CExtHistoricalInformationStaffingWrapper)obj;

		if (Objects.equals(_cExtHistoricalInformationStaffing,
					cExtHistoricalInformationStaffingWrapper._cExtHistoricalInformationStaffing)) {
			return true;
		}

		return false;
	}

	@Override
	public CExtHistoricalInformationStaffing getWrappedModel() {
		return _cExtHistoricalInformationStaffing;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cExtHistoricalInformationStaffing.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cExtHistoricalInformationStaffing.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cExtHistoricalInformationStaffing.resetOriginalValues();
	}

	private final CExtHistoricalInformationStaffing _cExtHistoricalInformationStaffing;
}