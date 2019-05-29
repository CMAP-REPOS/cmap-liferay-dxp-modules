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
 * This class is a wrapper for {@link ExtVocationalHistory}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtVocationalHistory
 * @generated
 */
@ProviderType
public class ExtVocationalHistoryWrapper implements ExtVocationalHistory,
	ModelWrapper<ExtVocationalHistory> {
	public ExtVocationalHistoryWrapper(
		ExtVocationalHistory extVocationalHistory) {
		_extVocationalHistory = extVocationalHistory;
	}

	@Override
	public Class<?> getModelClass() {
		return ExtVocationalHistory.class;
	}

	@Override
	public String getModelClassName() {
		return ExtVocationalHistory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("extVocationalHistoryId", getExtVocationalHistoryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("locationOrSetting", getLocationOrSetting());
		attributes.put("city", getCity());
		attributes.put("regionId", getRegionId());
		attributes.put("countryId", getCountryId());
		attributes.put("startDateOfService", getStartDateOfService());
		attributes.put("endDateOfService", getEndDateOfService());
		attributes.put("titleOrPosition", getTitleOrPosition());
		attributes.put("jobTypeId", getJobTypeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long extVocationalHistoryId = (Long)attributes.get(
				"extVocationalHistoryId");

		if (extVocationalHistoryId != null) {
			setExtVocationalHistoryId(extVocationalHistoryId);
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

		String locationOrSetting = (String)attributes.get("locationOrSetting");

		if (locationOrSetting != null) {
			setLocationOrSetting(locationOrSetting);
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

		Date startDateOfService = (Date)attributes.get("startDateOfService");

		if (startDateOfService != null) {
			setStartDateOfService(startDateOfService);
		}

		Date endDateOfService = (Date)attributes.get("endDateOfService");

		if (endDateOfService != null) {
			setEndDateOfService(endDateOfService);
		}

		String titleOrPosition = (String)attributes.get("titleOrPosition");

		if (titleOrPosition != null) {
			setTitleOrPosition(titleOrPosition);
		}

		Integer jobTypeId = (Integer)attributes.get("jobTypeId");

		if (jobTypeId != null) {
			setJobTypeId(jobTypeId);
		}
	}

	@Override
	public Object clone() {
		return new ExtVocationalHistoryWrapper((ExtVocationalHistory)_extVocationalHistory.clone());
	}

	@Override
	public int compareTo(ExtVocationalHistory extVocationalHistory) {
		return _extVocationalHistory.compareTo(extVocationalHistory);
	}

	/**
	* Returns the city of this ext vocational history.
	*
	* @return the city of this ext vocational history
	*/
	@Override
	public String getCity() {
		return _extVocationalHistory.getCity();
	}

	/**
	* Returns the company ID of this ext vocational history.
	*
	* @return the company ID of this ext vocational history
	*/
	@Override
	public long getCompanyId() {
		return _extVocationalHistory.getCompanyId();
	}

	/**
	* Returns the country ID of this ext vocational history.
	*
	* @return the country ID of this ext vocational history
	*/
	@Override
	public long getCountryId() {
		return _extVocationalHistory.getCountryId();
	}

	/**
	* Returns the create date of this ext vocational history.
	*
	* @return the create date of this ext vocational history
	*/
	@Override
	public Date getCreateDate() {
		return _extVocationalHistory.getCreateDate();
	}

	/**
	* Returns the end date of service of this ext vocational history.
	*
	* @return the end date of service of this ext vocational history
	*/
	@Override
	public Date getEndDateOfService() {
		return _extVocationalHistory.getEndDateOfService();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _extVocationalHistory.getExpandoBridge();
	}

	/**
	* Returns the ext vocational history ID of this ext vocational history.
	*
	* @return the ext vocational history ID of this ext vocational history
	*/
	@Override
	public long getExtVocationalHistoryId() {
		return _extVocationalHistory.getExtVocationalHistoryId();
	}

	/**
	* Returns the job type ID of this ext vocational history.
	*
	* @return the job type ID of this ext vocational history
	*/
	@Override
	public int getJobTypeId() {
		return _extVocationalHistory.getJobTypeId();
	}

	/**
	* Returns the location or setting of this ext vocational history.
	*
	* @return the location or setting of this ext vocational history
	*/
	@Override
	public String getLocationOrSetting() {
		return _extVocationalHistory.getLocationOrSetting();
	}

	/**
	* Returns the modified date of this ext vocational history.
	*
	* @return the modified date of this ext vocational history
	*/
	@Override
	public Date getModifiedDate() {
		return _extVocationalHistory.getModifiedDate();
	}

	/**
	* Returns the primary key of this ext vocational history.
	*
	* @return the primary key of this ext vocational history
	*/
	@Override
	public long getPrimaryKey() {
		return _extVocationalHistory.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _extVocationalHistory.getPrimaryKeyObj();
	}

	/**
	* Returns the region ID of this ext vocational history.
	*
	* @return the region ID of this ext vocational history
	*/
	@Override
	public long getRegionId() {
		return _extVocationalHistory.getRegionId();
	}

	/**
	* Returns the start date of service of this ext vocational history.
	*
	* @return the start date of service of this ext vocational history
	*/
	@Override
	public Date getStartDateOfService() {
		return _extVocationalHistory.getStartDateOfService();
	}

	/**
	* Returns the title or position of this ext vocational history.
	*
	* @return the title or position of this ext vocational history
	*/
	@Override
	public String getTitleOrPosition() {
		return _extVocationalHistory.getTitleOrPosition();
	}

	/**
	* Returns the user ID of this ext vocational history.
	*
	* @return the user ID of this ext vocational history
	*/
	@Override
	public long getUserId() {
		return _extVocationalHistory.getUserId();
	}

	/**
	* Returns the user uuid of this ext vocational history.
	*
	* @return the user uuid of this ext vocational history
	*/
	@Override
	public String getUserUuid() {
		return _extVocationalHistory.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _extVocationalHistory.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _extVocationalHistory.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _extVocationalHistory.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _extVocationalHistory.isNew();
	}

	@Override
	public void persist() {
		_extVocationalHistory.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_extVocationalHistory.setCachedModel(cachedModel);
	}

	/**
	* Sets the city of this ext vocational history.
	*
	* @param city the city of this ext vocational history
	*/
	@Override
	public void setCity(String city) {
		_extVocationalHistory.setCity(city);
	}

	/**
	* Sets the company ID of this ext vocational history.
	*
	* @param companyId the company ID of this ext vocational history
	*/
	@Override
	public void setCompanyId(long companyId) {
		_extVocationalHistory.setCompanyId(companyId);
	}

	/**
	* Sets the country ID of this ext vocational history.
	*
	* @param countryId the country ID of this ext vocational history
	*/
	@Override
	public void setCountryId(long countryId) {
		_extVocationalHistory.setCountryId(countryId);
	}

	/**
	* Sets the create date of this ext vocational history.
	*
	* @param createDate the create date of this ext vocational history
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_extVocationalHistory.setCreateDate(createDate);
	}

	/**
	* Sets the end date of service of this ext vocational history.
	*
	* @param endDateOfService the end date of service of this ext vocational history
	*/
	@Override
	public void setEndDateOfService(Date endDateOfService) {
		_extVocationalHistory.setEndDateOfService(endDateOfService);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_extVocationalHistory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_extVocationalHistory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_extVocationalHistory.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ext vocational history ID of this ext vocational history.
	*
	* @param extVocationalHistoryId the ext vocational history ID of this ext vocational history
	*/
	@Override
	public void setExtVocationalHistoryId(long extVocationalHistoryId) {
		_extVocationalHistory.setExtVocationalHistoryId(extVocationalHistoryId);
	}

	/**
	* Sets the job type ID of this ext vocational history.
	*
	* @param jobTypeId the job type ID of this ext vocational history
	*/
	@Override
	public void setJobTypeId(int jobTypeId) {
		_extVocationalHistory.setJobTypeId(jobTypeId);
	}

	/**
	* Sets the location or setting of this ext vocational history.
	*
	* @param locationOrSetting the location or setting of this ext vocational history
	*/
	@Override
	public void setLocationOrSetting(String locationOrSetting) {
		_extVocationalHistory.setLocationOrSetting(locationOrSetting);
	}

	/**
	* Sets the modified date of this ext vocational history.
	*
	* @param modifiedDate the modified date of this ext vocational history
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_extVocationalHistory.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_extVocationalHistory.setNew(n);
	}

	/**
	* Sets the primary key of this ext vocational history.
	*
	* @param primaryKey the primary key of this ext vocational history
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_extVocationalHistory.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_extVocationalHistory.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the region ID of this ext vocational history.
	*
	* @param regionId the region ID of this ext vocational history
	*/
	@Override
	public void setRegionId(long regionId) {
		_extVocationalHistory.setRegionId(regionId);
	}

	/**
	* Sets the start date of service of this ext vocational history.
	*
	* @param startDateOfService the start date of service of this ext vocational history
	*/
	@Override
	public void setStartDateOfService(Date startDateOfService) {
		_extVocationalHistory.setStartDateOfService(startDateOfService);
	}

	/**
	* Sets the title or position of this ext vocational history.
	*
	* @param titleOrPosition the title or position of this ext vocational history
	*/
	@Override
	public void setTitleOrPosition(String titleOrPosition) {
		_extVocationalHistory.setTitleOrPosition(titleOrPosition);
	}

	/**
	* Sets the user ID of this ext vocational history.
	*
	* @param userId the user ID of this ext vocational history
	*/
	@Override
	public void setUserId(long userId) {
		_extVocationalHistory.setUserId(userId);
	}

	/**
	* Sets the user uuid of this ext vocational history.
	*
	* @param userUuid the user uuid of this ext vocational history
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_extVocationalHistory.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ExtVocationalHistory> toCacheModel() {
		return _extVocationalHistory.toCacheModel();
	}

	@Override
	public ExtVocationalHistory toEscapedModel() {
		return new ExtVocationalHistoryWrapper(_extVocationalHistory.toEscapedModel());
	}

	@Override
	public String toString() {
		return _extVocationalHistory.toString();
	}

	@Override
	public ExtVocationalHistory toUnescapedModel() {
		return new ExtVocationalHistoryWrapper(_extVocationalHistory.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _extVocationalHistory.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtVocationalHistoryWrapper)) {
			return false;
		}

		ExtVocationalHistoryWrapper extVocationalHistoryWrapper = (ExtVocationalHistoryWrapper)obj;

		if (Objects.equals(_extVocationalHistory,
					extVocationalHistoryWrapper._extVocationalHistory)) {
			return true;
		}

		return false;
	}

	@Override
	public ExtVocationalHistory getWrappedModel() {
		return _extVocationalHistory;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _extVocationalHistory.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _extVocationalHistory.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_extVocationalHistory.resetOriginalValues();
	}

	private final ExtVocationalHistory _extVocationalHistory;
}