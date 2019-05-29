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
 * This class is a wrapper for {@link ExtFormalEducation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtFormalEducation
 * @generated
 */
@ProviderType
public class ExtFormalEducationWrapper implements ExtFormalEducation,
	ModelWrapper<ExtFormalEducation> {
	public ExtFormalEducationWrapper(ExtFormalEducation extFormalEducation) {
		_extFormalEducation = extFormalEducation;
	}

	@Override
	public Class<?> getModelClass() {
		return ExtFormalEducation.class;
	}

	@Override
	public String getModelClassName() {
		return ExtFormalEducation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("extFormalEducationId", getExtFormalEducationId());
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
		Long extFormalEducationId = (Long)attributes.get("extFormalEducationId");

		if (extFormalEducationId != null) {
			setExtFormalEducationId(extFormalEducationId);
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
		return new ExtFormalEducationWrapper((ExtFormalEducation)_extFormalEducation.clone());
	}

	@Override
	public int compareTo(ExtFormalEducation extFormalEducation) {
		return _extFormalEducation.compareTo(extFormalEducation);
	}

	/**
	* Returns the city of this ext formal education.
	*
	* @return the city of this ext formal education
	*/
	@Override
	public String getCity() {
		return _extFormalEducation.getCity();
	}

	/**
	* Returns the company ID of this ext formal education.
	*
	* @return the company ID of this ext formal education
	*/
	@Override
	public long getCompanyId() {
		return _extFormalEducation.getCompanyId();
	}

	/**
	* Returns the country ID of this ext formal education.
	*
	* @return the country ID of this ext formal education
	*/
	@Override
	public long getCountryId() {
		return _extFormalEducation.getCountryId();
	}

	/**
	* Returns the create date of this ext formal education.
	*
	* @return the create date of this ext formal education
	*/
	@Override
	public Date getCreateDate() {
		return _extFormalEducation.getCreateDate();
	}

	/**
	* Returns the degree or certification of this ext formal education.
	*
	* @return the degree or certification of this ext formal education
	*/
	@Override
	public String getDegreeOrCertification() {
		return _extFormalEducation.getDegreeOrCertification();
	}

	/**
	* Returns the end date of attendance of this ext formal education.
	*
	* @return the end date of attendance of this ext formal education
	*/
	@Override
	public Date getEndDateOfAttendance() {
		return _extFormalEducation.getEndDateOfAttendance();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _extFormalEducation.getExpandoBridge();
	}

	/**
	* Returns the ext formal education ID of this ext formal education.
	*
	* @return the ext formal education ID of this ext formal education
	*/
	@Override
	public long getExtFormalEducationId() {
		return _extFormalEducation.getExtFormalEducationId();
	}

	/**
	* Returns the institution or program of this ext formal education.
	*
	* @return the institution or program of this ext formal education
	*/
	@Override
	public String getInstitutionOrProgram() {
		return _extFormalEducation.getInstitutionOrProgram();
	}

	/**
	* Returns the modified date of this ext formal education.
	*
	* @return the modified date of this ext formal education
	*/
	@Override
	public Date getModifiedDate() {
		return _extFormalEducation.getModifiedDate();
	}

	/**
	* Returns the primary key of this ext formal education.
	*
	* @return the primary key of this ext formal education
	*/
	@Override
	public long getPrimaryKey() {
		return _extFormalEducation.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _extFormalEducation.getPrimaryKeyObj();
	}

	/**
	* Returns the region ID of this ext formal education.
	*
	* @return the region ID of this ext formal education
	*/
	@Override
	public long getRegionId() {
		return _extFormalEducation.getRegionId();
	}

	/**
	* Returns the start date of attendance of this ext formal education.
	*
	* @return the start date of attendance of this ext formal education
	*/
	@Override
	public Date getStartDateOfAttendance() {
		return _extFormalEducation.getStartDateOfAttendance();
	}

	/**
	* Returns the user ID of this ext formal education.
	*
	* @return the user ID of this ext formal education
	*/
	@Override
	public long getUserId() {
		return _extFormalEducation.getUserId();
	}

	/**
	* Returns the user uuid of this ext formal education.
	*
	* @return the user uuid of this ext formal education
	*/
	@Override
	public String getUserUuid() {
		return _extFormalEducation.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _extFormalEducation.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _extFormalEducation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _extFormalEducation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _extFormalEducation.isNew();
	}

	@Override
	public void persist() {
		_extFormalEducation.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_extFormalEducation.setCachedModel(cachedModel);
	}

	/**
	* Sets the city of this ext formal education.
	*
	* @param city the city of this ext formal education
	*/
	@Override
	public void setCity(String city) {
		_extFormalEducation.setCity(city);
	}

	/**
	* Sets the company ID of this ext formal education.
	*
	* @param companyId the company ID of this ext formal education
	*/
	@Override
	public void setCompanyId(long companyId) {
		_extFormalEducation.setCompanyId(companyId);
	}

	/**
	* Sets the country ID of this ext formal education.
	*
	* @param countryId the country ID of this ext formal education
	*/
	@Override
	public void setCountryId(long countryId) {
		_extFormalEducation.setCountryId(countryId);
	}

	/**
	* Sets the create date of this ext formal education.
	*
	* @param createDate the create date of this ext formal education
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_extFormalEducation.setCreateDate(createDate);
	}

	/**
	* Sets the degree or certification of this ext formal education.
	*
	* @param degreeOrCertification the degree or certification of this ext formal education
	*/
	@Override
	public void setDegreeOrCertification(String degreeOrCertification) {
		_extFormalEducation.setDegreeOrCertification(degreeOrCertification);
	}

	/**
	* Sets the end date of attendance of this ext formal education.
	*
	* @param endDateOfAttendance the end date of attendance of this ext formal education
	*/
	@Override
	public void setEndDateOfAttendance(Date endDateOfAttendance) {
		_extFormalEducation.setEndDateOfAttendance(endDateOfAttendance);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_extFormalEducation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_extFormalEducation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_extFormalEducation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ext formal education ID of this ext formal education.
	*
	* @param extFormalEducationId the ext formal education ID of this ext formal education
	*/
	@Override
	public void setExtFormalEducationId(long extFormalEducationId) {
		_extFormalEducation.setExtFormalEducationId(extFormalEducationId);
	}

	/**
	* Sets the institution or program of this ext formal education.
	*
	* @param institutionOrProgram the institution or program of this ext formal education
	*/
	@Override
	public void setInstitutionOrProgram(String institutionOrProgram) {
		_extFormalEducation.setInstitutionOrProgram(institutionOrProgram);
	}

	/**
	* Sets the modified date of this ext formal education.
	*
	* @param modifiedDate the modified date of this ext formal education
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_extFormalEducation.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_extFormalEducation.setNew(n);
	}

	/**
	* Sets the primary key of this ext formal education.
	*
	* @param primaryKey the primary key of this ext formal education
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_extFormalEducation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_extFormalEducation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the region ID of this ext formal education.
	*
	* @param regionId the region ID of this ext formal education
	*/
	@Override
	public void setRegionId(long regionId) {
		_extFormalEducation.setRegionId(regionId);
	}

	/**
	* Sets the start date of attendance of this ext formal education.
	*
	* @param startDateOfAttendance the start date of attendance of this ext formal education
	*/
	@Override
	public void setStartDateOfAttendance(Date startDateOfAttendance) {
		_extFormalEducation.setStartDateOfAttendance(startDateOfAttendance);
	}

	/**
	* Sets the user ID of this ext formal education.
	*
	* @param userId the user ID of this ext formal education
	*/
	@Override
	public void setUserId(long userId) {
		_extFormalEducation.setUserId(userId);
	}

	/**
	* Sets the user uuid of this ext formal education.
	*
	* @param userUuid the user uuid of this ext formal education
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_extFormalEducation.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ExtFormalEducation> toCacheModel() {
		return _extFormalEducation.toCacheModel();
	}

	@Override
	public ExtFormalEducation toEscapedModel() {
		return new ExtFormalEducationWrapper(_extFormalEducation.toEscapedModel());
	}

	@Override
	public String toString() {
		return _extFormalEducation.toString();
	}

	@Override
	public ExtFormalEducation toUnescapedModel() {
		return new ExtFormalEducationWrapper(_extFormalEducation.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _extFormalEducation.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtFormalEducationWrapper)) {
			return false;
		}

		ExtFormalEducationWrapper extFormalEducationWrapper = (ExtFormalEducationWrapper)obj;

		if (Objects.equals(_extFormalEducation,
					extFormalEducationWrapper._extFormalEducation)) {
			return true;
		}

		return false;
	}

	@Override
	public ExtFormalEducation getWrappedModel() {
		return _extFormalEducation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _extFormalEducation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _extFormalEducation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_extFormalEducation.resetOriginalValues();
	}

	private final ExtFormalEducation _extFormalEducation;
}