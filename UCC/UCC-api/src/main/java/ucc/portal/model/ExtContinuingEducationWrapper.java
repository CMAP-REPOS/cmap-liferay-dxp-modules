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
 * This class is a wrapper for {@link ExtContinuingEducation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtContinuingEducation
 * @generated
 */
@ProviderType
public class ExtContinuingEducationWrapper implements ExtContinuingEducation,
	ModelWrapper<ExtContinuingEducation> {
	public ExtContinuingEducationWrapper(
		ExtContinuingEducation extContinuingEducation) {
		_extContinuingEducation = extContinuingEducation;
	}

	@Override
	public Class<?> getModelClass() {
		return ExtContinuingEducation.class;
	}

	@Override
	public String getModelClassName() {
		return ExtContinuingEducation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("extContinuingEducationId", getExtContinuingEducationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("institutionOrProgram", getInstitutionOrProgram());
		attributes.put("city", getCity());
		attributes.put("regionId", getRegionId());
		attributes.put("countryId", getCountryId());
		attributes.put("startDateOfAttendance", getStartDateOfAttendance());
		attributes.put("endDateOfAttendance", getEndDateOfAttendance());
		attributes.put("degreeOrCertification", getDegreeOrCertification());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long extContinuingEducationId = (Long)attributes.get(
				"extContinuingEducationId");

		if (extContinuingEducationId != null) {
			setExtContinuingEducationId(extContinuingEducationId);
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

		String institutionOrProgram = (String)attributes.get(
				"institutionOrProgram");

		if (institutionOrProgram != null) {
			setInstitutionOrProgram(institutionOrProgram);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		Long regionId = (Long)attributes.get("regionId");

		if (regionId != null) {
			setRegionId(regionId);
		}

		Long countryId = (Long)attributes.get("countryId");

		if (countryId != null) {
			setCountryId(countryId);
		}

		Date startDateOfAttendance = (Date)attributes.get(
				"startDateOfAttendance");

		if (startDateOfAttendance != null) {
			setStartDateOfAttendance(startDateOfAttendance);
		}

		Date endDateOfAttendance = (Date)attributes.get("endDateOfAttendance");

		if (endDateOfAttendance != null) {
			setEndDateOfAttendance(endDateOfAttendance);
		}

		String degreeOrCertification = (String)attributes.get(
				"degreeOrCertification");

		if (degreeOrCertification != null) {
			setDegreeOrCertification(degreeOrCertification);
		}
	}

	@Override
	public Object clone() {
		return new ExtContinuingEducationWrapper((ExtContinuingEducation)_extContinuingEducation.clone());
	}

	@Override
	public int compareTo(ExtContinuingEducation extContinuingEducation) {
		return _extContinuingEducation.compareTo(extContinuingEducation);
	}

	/**
	* Returns the city of this ext continuing education.
	*
	* @return the city of this ext continuing education
	*/
	@Override
	public String getCity() {
		return _extContinuingEducation.getCity();
	}

	/**
	* Returns the company ID of this ext continuing education.
	*
	* @return the company ID of this ext continuing education
	*/
	@Override
	public long getCompanyId() {
		return _extContinuingEducation.getCompanyId();
	}

	/**
	* Returns the country ID of this ext continuing education.
	*
	* @return the country ID of this ext continuing education
	*/
	@Override
	public long getCountryId() {
		return _extContinuingEducation.getCountryId();
	}

	/**
	* Returns the create date of this ext continuing education.
	*
	* @return the create date of this ext continuing education
	*/
	@Override
	public Date getCreateDate() {
		return _extContinuingEducation.getCreateDate();
	}

	/**
	* Returns the degree or certification of this ext continuing education.
	*
	* @return the degree or certification of this ext continuing education
	*/
	@Override
	public String getDegreeOrCertification() {
		return _extContinuingEducation.getDegreeOrCertification();
	}

	/**
	* Returns the end date of attendance of this ext continuing education.
	*
	* @return the end date of attendance of this ext continuing education
	*/
	@Override
	public Date getEndDateOfAttendance() {
		return _extContinuingEducation.getEndDateOfAttendance();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _extContinuingEducation.getExpandoBridge();
	}

	/**
	* Returns the ext continuing education ID of this ext continuing education.
	*
	* @return the ext continuing education ID of this ext continuing education
	*/
	@Override
	public long getExtContinuingEducationId() {
		return _extContinuingEducation.getExtContinuingEducationId();
	}

	/**
	* Returns the institution or program of this ext continuing education.
	*
	* @return the institution or program of this ext continuing education
	*/
	@Override
	public String getInstitutionOrProgram() {
		return _extContinuingEducation.getInstitutionOrProgram();
	}

	/**
	* Returns the modified date of this ext continuing education.
	*
	* @return the modified date of this ext continuing education
	*/
	@Override
	public Date getModifiedDate() {
		return _extContinuingEducation.getModifiedDate();
	}

	/**
	* Returns the primary key of this ext continuing education.
	*
	* @return the primary key of this ext continuing education
	*/
	@Override
	public long getPrimaryKey() {
		return _extContinuingEducation.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _extContinuingEducation.getPrimaryKeyObj();
	}

	/**
	* Returns the region ID of this ext continuing education.
	*
	* @return the region ID of this ext continuing education
	*/
	@Override
	public long getRegionId() {
		return _extContinuingEducation.getRegionId();
	}

	/**
	* Returns the start date of attendance of this ext continuing education.
	*
	* @return the start date of attendance of this ext continuing education
	*/
	@Override
	public Date getStartDateOfAttendance() {
		return _extContinuingEducation.getStartDateOfAttendance();
	}

	/**
	* Returns the user ID of this ext continuing education.
	*
	* @return the user ID of this ext continuing education
	*/
	@Override
	public long getUserId() {
		return _extContinuingEducation.getUserId();
	}

	/**
	* Returns the user uuid of this ext continuing education.
	*
	* @return the user uuid of this ext continuing education
	*/
	@Override
	public String getUserUuid() {
		return _extContinuingEducation.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _extContinuingEducation.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _extContinuingEducation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _extContinuingEducation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _extContinuingEducation.isNew();
	}

	@Override
	public void persist() {
		_extContinuingEducation.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_extContinuingEducation.setCachedModel(cachedModel);
	}

	/**
	* Sets the city of this ext continuing education.
	*
	* @param city the city of this ext continuing education
	*/
	@Override
	public void setCity(String city) {
		_extContinuingEducation.setCity(city);
	}

	/**
	* Sets the company ID of this ext continuing education.
	*
	* @param companyId the company ID of this ext continuing education
	*/
	@Override
	public void setCompanyId(long companyId) {
		_extContinuingEducation.setCompanyId(companyId);
	}

	/**
	* Sets the country ID of this ext continuing education.
	*
	* @param countryId the country ID of this ext continuing education
	*/
	@Override
	public void setCountryId(long countryId) {
		_extContinuingEducation.setCountryId(countryId);
	}

	/**
	* Sets the create date of this ext continuing education.
	*
	* @param createDate the create date of this ext continuing education
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_extContinuingEducation.setCreateDate(createDate);
	}

	/**
	* Sets the degree or certification of this ext continuing education.
	*
	* @param degreeOrCertification the degree or certification of this ext continuing education
	*/
	@Override
	public void setDegreeOrCertification(String degreeOrCertification) {
		_extContinuingEducation.setDegreeOrCertification(degreeOrCertification);
	}

	/**
	* Sets the end date of attendance of this ext continuing education.
	*
	* @param endDateOfAttendance the end date of attendance of this ext continuing education
	*/
	@Override
	public void setEndDateOfAttendance(Date endDateOfAttendance) {
		_extContinuingEducation.setEndDateOfAttendance(endDateOfAttendance);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_extContinuingEducation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_extContinuingEducation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_extContinuingEducation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ext continuing education ID of this ext continuing education.
	*
	* @param extContinuingEducationId the ext continuing education ID of this ext continuing education
	*/
	@Override
	public void setExtContinuingEducationId(long extContinuingEducationId) {
		_extContinuingEducation.setExtContinuingEducationId(extContinuingEducationId);
	}

	/**
	* Sets the institution or program of this ext continuing education.
	*
	* @param institutionOrProgram the institution or program of this ext continuing education
	*/
	@Override
	public void setInstitutionOrProgram(String institutionOrProgram) {
		_extContinuingEducation.setInstitutionOrProgram(institutionOrProgram);
	}

	/**
	* Sets the modified date of this ext continuing education.
	*
	* @param modifiedDate the modified date of this ext continuing education
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_extContinuingEducation.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_extContinuingEducation.setNew(n);
	}

	/**
	* Sets the primary key of this ext continuing education.
	*
	* @param primaryKey the primary key of this ext continuing education
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_extContinuingEducation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_extContinuingEducation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the region ID of this ext continuing education.
	*
	* @param regionId the region ID of this ext continuing education
	*/
	@Override
	public void setRegionId(long regionId) {
		_extContinuingEducation.setRegionId(regionId);
	}

	/**
	* Sets the start date of attendance of this ext continuing education.
	*
	* @param startDateOfAttendance the start date of attendance of this ext continuing education
	*/
	@Override
	public void setStartDateOfAttendance(Date startDateOfAttendance) {
		_extContinuingEducation.setStartDateOfAttendance(startDateOfAttendance);
	}

	/**
	* Sets the user ID of this ext continuing education.
	*
	* @param userId the user ID of this ext continuing education
	*/
	@Override
	public void setUserId(long userId) {
		_extContinuingEducation.setUserId(userId);
	}

	/**
	* Sets the user uuid of this ext continuing education.
	*
	* @param userUuid the user uuid of this ext continuing education
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_extContinuingEducation.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ExtContinuingEducation> toCacheModel() {
		return _extContinuingEducation.toCacheModel();
	}

	@Override
	public ExtContinuingEducation toEscapedModel() {
		return new ExtContinuingEducationWrapper(_extContinuingEducation.toEscapedModel());
	}

	@Override
	public String toString() {
		return _extContinuingEducation.toString();
	}

	@Override
	public ExtContinuingEducation toUnescapedModel() {
		return new ExtContinuingEducationWrapper(_extContinuingEducation.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _extContinuingEducation.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtContinuingEducationWrapper)) {
			return false;
		}

		ExtContinuingEducationWrapper extContinuingEducationWrapper = (ExtContinuingEducationWrapper)obj;

		if (Objects.equals(_extContinuingEducation,
					extContinuingEducationWrapper._extContinuingEducation)) {
			return true;
		}

		return false;
	}

	@Override
	public ExtContinuingEducation getWrappedModel() {
		return _extContinuingEducation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _extContinuingEducation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _extContinuingEducation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_extContinuingEducation.resetOriginalValues();
	}

	private final ExtContinuingEducation _extContinuingEducation;
}