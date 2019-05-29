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
 * This class is a wrapper for {@link ExtRegionalEducation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtRegionalEducation
 * @generated
 */
@ProviderType
public class ExtRegionalEducationWrapper implements ExtRegionalEducation,
	ModelWrapper<ExtRegionalEducation> {
	public ExtRegionalEducationWrapper(
		ExtRegionalEducation extRegionalEducation) {
		_extRegionalEducation = extRegionalEducation;
	}

	@Override
	public Class<?> getModelClass() {
		return ExtRegionalEducation.class;
	}

	@Override
	public String getModelClassName() {
		return ExtRegionalEducation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("extRegionalEducationId", getExtRegionalEducationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("programOrExperience", getProgramOrExperience());
		attributes.put("city", getCity());
		attributes.put("regionId", getRegionId());
		attributes.put("countryId", getCountryId());
		attributes.put("startDateOfAttendance", getStartDateOfAttendance());
		attributes.put("endDateOfAttendance", getEndDateOfAttendance());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long extRegionalEducationId = (Long)attributes.get(
				"extRegionalEducationId");

		if (extRegionalEducationId != null) {
			setExtRegionalEducationId(extRegionalEducationId);
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

		String programOrExperience = (String)attributes.get(
				"programOrExperience");

		if (programOrExperience != null) {
			setProgramOrExperience(programOrExperience);
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
	}

	@Override
	public Object clone() {
		return new ExtRegionalEducationWrapper((ExtRegionalEducation)_extRegionalEducation.clone());
	}

	@Override
	public int compareTo(ExtRegionalEducation extRegionalEducation) {
		return _extRegionalEducation.compareTo(extRegionalEducation);
	}

	/**
	* Returns the city of this ext regional education.
	*
	* @return the city of this ext regional education
	*/
	@Override
	public String getCity() {
		return _extRegionalEducation.getCity();
	}

	/**
	* Returns the company ID of this ext regional education.
	*
	* @return the company ID of this ext regional education
	*/
	@Override
	public long getCompanyId() {
		return _extRegionalEducation.getCompanyId();
	}

	/**
	* Returns the country ID of this ext regional education.
	*
	* @return the country ID of this ext regional education
	*/
	@Override
	public long getCountryId() {
		return _extRegionalEducation.getCountryId();
	}

	/**
	* Returns the create date of this ext regional education.
	*
	* @return the create date of this ext regional education
	*/
	@Override
	public Date getCreateDate() {
		return _extRegionalEducation.getCreateDate();
	}

	/**
	* Returns the end date of attendance of this ext regional education.
	*
	* @return the end date of attendance of this ext regional education
	*/
	@Override
	public Date getEndDateOfAttendance() {
		return _extRegionalEducation.getEndDateOfAttendance();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _extRegionalEducation.getExpandoBridge();
	}

	/**
	* Returns the ext regional education ID of this ext regional education.
	*
	* @return the ext regional education ID of this ext regional education
	*/
	@Override
	public long getExtRegionalEducationId() {
		return _extRegionalEducation.getExtRegionalEducationId();
	}

	/**
	* Returns the modified date of this ext regional education.
	*
	* @return the modified date of this ext regional education
	*/
	@Override
	public Date getModifiedDate() {
		return _extRegionalEducation.getModifiedDate();
	}

	/**
	* Returns the primary key of this ext regional education.
	*
	* @return the primary key of this ext regional education
	*/
	@Override
	public long getPrimaryKey() {
		return _extRegionalEducation.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _extRegionalEducation.getPrimaryKeyObj();
	}

	/**
	* Returns the program or experience of this ext regional education.
	*
	* @return the program or experience of this ext regional education
	*/
	@Override
	public String getProgramOrExperience() {
		return _extRegionalEducation.getProgramOrExperience();
	}

	/**
	* Returns the region ID of this ext regional education.
	*
	* @return the region ID of this ext regional education
	*/
	@Override
	public long getRegionId() {
		return _extRegionalEducation.getRegionId();
	}

	/**
	* Returns the start date of attendance of this ext regional education.
	*
	* @return the start date of attendance of this ext regional education
	*/
	@Override
	public Date getStartDateOfAttendance() {
		return _extRegionalEducation.getStartDateOfAttendance();
	}

	/**
	* Returns the user ID of this ext regional education.
	*
	* @return the user ID of this ext regional education
	*/
	@Override
	public long getUserId() {
		return _extRegionalEducation.getUserId();
	}

	/**
	* Returns the user uuid of this ext regional education.
	*
	* @return the user uuid of this ext regional education
	*/
	@Override
	public String getUserUuid() {
		return _extRegionalEducation.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _extRegionalEducation.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _extRegionalEducation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _extRegionalEducation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _extRegionalEducation.isNew();
	}

	@Override
	public void persist() {
		_extRegionalEducation.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_extRegionalEducation.setCachedModel(cachedModel);
	}

	/**
	* Sets the city of this ext regional education.
	*
	* @param city the city of this ext regional education
	*/
	@Override
	public void setCity(String city) {
		_extRegionalEducation.setCity(city);
	}

	/**
	* Sets the company ID of this ext regional education.
	*
	* @param companyId the company ID of this ext regional education
	*/
	@Override
	public void setCompanyId(long companyId) {
		_extRegionalEducation.setCompanyId(companyId);
	}

	/**
	* Sets the country ID of this ext regional education.
	*
	* @param countryId the country ID of this ext regional education
	*/
	@Override
	public void setCountryId(long countryId) {
		_extRegionalEducation.setCountryId(countryId);
	}

	/**
	* Sets the create date of this ext regional education.
	*
	* @param createDate the create date of this ext regional education
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_extRegionalEducation.setCreateDate(createDate);
	}

	/**
	* Sets the end date of attendance of this ext regional education.
	*
	* @param endDateOfAttendance the end date of attendance of this ext regional education
	*/
	@Override
	public void setEndDateOfAttendance(Date endDateOfAttendance) {
		_extRegionalEducation.setEndDateOfAttendance(endDateOfAttendance);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_extRegionalEducation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_extRegionalEducation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_extRegionalEducation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ext regional education ID of this ext regional education.
	*
	* @param extRegionalEducationId the ext regional education ID of this ext regional education
	*/
	@Override
	public void setExtRegionalEducationId(long extRegionalEducationId) {
		_extRegionalEducation.setExtRegionalEducationId(extRegionalEducationId);
	}

	/**
	* Sets the modified date of this ext regional education.
	*
	* @param modifiedDate the modified date of this ext regional education
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_extRegionalEducation.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_extRegionalEducation.setNew(n);
	}

	/**
	* Sets the primary key of this ext regional education.
	*
	* @param primaryKey the primary key of this ext regional education
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_extRegionalEducation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_extRegionalEducation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the program or experience of this ext regional education.
	*
	* @param programOrExperience the program or experience of this ext regional education
	*/
	@Override
	public void setProgramOrExperience(String programOrExperience) {
		_extRegionalEducation.setProgramOrExperience(programOrExperience);
	}

	/**
	* Sets the region ID of this ext regional education.
	*
	* @param regionId the region ID of this ext regional education
	*/
	@Override
	public void setRegionId(long regionId) {
		_extRegionalEducation.setRegionId(regionId);
	}

	/**
	* Sets the start date of attendance of this ext regional education.
	*
	* @param startDateOfAttendance the start date of attendance of this ext regional education
	*/
	@Override
	public void setStartDateOfAttendance(Date startDateOfAttendance) {
		_extRegionalEducation.setStartDateOfAttendance(startDateOfAttendance);
	}

	/**
	* Sets the user ID of this ext regional education.
	*
	* @param userId the user ID of this ext regional education
	*/
	@Override
	public void setUserId(long userId) {
		_extRegionalEducation.setUserId(userId);
	}

	/**
	* Sets the user uuid of this ext regional education.
	*
	* @param userUuid the user uuid of this ext regional education
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_extRegionalEducation.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ExtRegionalEducation> toCacheModel() {
		return _extRegionalEducation.toCacheModel();
	}

	@Override
	public ExtRegionalEducation toEscapedModel() {
		return new ExtRegionalEducationWrapper(_extRegionalEducation.toEscapedModel());
	}

	@Override
	public String toString() {
		return _extRegionalEducation.toString();
	}

	@Override
	public ExtRegionalEducation toUnescapedModel() {
		return new ExtRegionalEducationWrapper(_extRegionalEducation.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _extRegionalEducation.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtRegionalEducationWrapper)) {
			return false;
		}

		ExtRegionalEducationWrapper extRegionalEducationWrapper = (ExtRegionalEducationWrapper)obj;

		if (Objects.equals(_extRegionalEducation,
					extRegionalEducationWrapper._extRegionalEducation)) {
			return true;
		}

		return false;
	}

	@Override
	public ExtRegionalEducation getWrappedModel() {
		return _extRegionalEducation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _extRegionalEducation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _extRegionalEducation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_extRegionalEducation.resetOriginalValues();
	}

	private final ExtRegionalEducation _extRegionalEducation;
}