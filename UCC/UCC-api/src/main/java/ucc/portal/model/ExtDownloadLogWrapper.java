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
 * This class is a wrapper for {@link ExtDownloadLog}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtDownloadLog
 * @generated
 */
@ProviderType
public class ExtDownloadLogWrapper implements ExtDownloadLog,
	ModelWrapper<ExtDownloadLog> {
	public ExtDownloadLogWrapper(ExtDownloadLog extDownloadLog) {
		_extDownloadLog = extDownloadLog;
	}

	@Override
	public Class<?> getModelClass() {
		return ExtDownloadLog.class;
	}

	@Override
	public String getModelClassName() {
		return ExtDownloadLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("extDownloadLogId", getExtDownloadLogId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("profileFileEntryId", getProfileFileEntryId());
		attributes.put("profileFileVersionId", getProfileFileVersionId());
		attributes.put("searchAndCallUserId", getSearchAndCallUserId());
		attributes.put("conferenceIds", getConferenceIds());
		attributes.put("downloadDate", getDownloadDate());
		attributes.put("withdrawalDate", getWithdrawalDate());
		attributes.put("fitnessReview", isFitnessReview());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long extDownloadLogId = (Long)attributes.get("extDownloadLogId");

		if (extDownloadLogId != null) {
			setExtDownloadLogId(extDownloadLogId);
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

		Long profileFileEntryId = (Long)attributes.get("profileFileEntryId");

		if (profileFileEntryId != null) {
			setProfileFileEntryId(profileFileEntryId);
		}

		Long profileFileVersionId = (Long)attributes.get("profileFileVersionId");

		if (profileFileVersionId != null) {
			setProfileFileVersionId(profileFileVersionId);
		}

		Long searchAndCallUserId = (Long)attributes.get("searchAndCallUserId");

		if (searchAndCallUserId != null) {
			setSearchAndCallUserId(searchAndCallUserId);
		}

		String conferenceIds = (String)attributes.get("conferenceIds");

		if (conferenceIds != null) {
			setConferenceIds(conferenceIds);
		}

		Date downloadDate = (Date)attributes.get("downloadDate");

		if (downloadDate != null) {
			setDownloadDate(downloadDate);
		}

		Date withdrawalDate = (Date)attributes.get("withdrawalDate");

		if (withdrawalDate != null) {
			setWithdrawalDate(withdrawalDate);
		}

		Boolean fitnessReview = (Boolean)attributes.get("fitnessReview");

		if (fitnessReview != null) {
			setFitnessReview(fitnessReview);
		}
	}

	@Override
	public Object clone() {
		return new ExtDownloadLogWrapper((ExtDownloadLog)_extDownloadLog.clone());
	}

	@Override
	public int compareTo(ExtDownloadLog extDownloadLog) {
		return _extDownloadLog.compareTo(extDownloadLog);
	}

	/**
	* Returns the company ID of this ext download log.
	*
	* @return the company ID of this ext download log
	*/
	@Override
	public long getCompanyId() {
		return _extDownloadLog.getCompanyId();
	}

	/**
	* Returns the conference IDs of this ext download log.
	*
	* @return the conference IDs of this ext download log
	*/
	@Override
	public String getConferenceIds() {
		return _extDownloadLog.getConferenceIds();
	}

	/**
	* Returns the create date of this ext download log.
	*
	* @return the create date of this ext download log
	*/
	@Override
	public Date getCreateDate() {
		return _extDownloadLog.getCreateDate();
	}

	/**
	* Returns the download date of this ext download log.
	*
	* @return the download date of this ext download log
	*/
	@Override
	public Date getDownloadDate() {
		return _extDownloadLog.getDownloadDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _extDownloadLog.getExpandoBridge();
	}

	/**
	* Returns the ext download log ID of this ext download log.
	*
	* @return the ext download log ID of this ext download log
	*/
	@Override
	public long getExtDownloadLogId() {
		return _extDownloadLog.getExtDownloadLogId();
	}

	/**
	* Returns the fitness review of this ext download log.
	*
	* @return the fitness review of this ext download log
	*/
	@Override
	public boolean getFitnessReview() {
		return _extDownloadLog.getFitnessReview();
	}

	/**
	* Returns the modified date of this ext download log.
	*
	* @return the modified date of this ext download log
	*/
	@Override
	public Date getModifiedDate() {
		return _extDownloadLog.getModifiedDate();
	}

	/**
	* Returns the primary key of this ext download log.
	*
	* @return the primary key of this ext download log
	*/
	@Override
	public long getPrimaryKey() {
		return _extDownloadLog.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _extDownloadLog.getPrimaryKeyObj();
	}

	/**
	* Returns the profile file entry ID of this ext download log.
	*
	* @return the profile file entry ID of this ext download log
	*/
	@Override
	public long getProfileFileEntryId() {
		return _extDownloadLog.getProfileFileEntryId();
	}

	/**
	* Returns the profile file version ID of this ext download log.
	*
	* @return the profile file version ID of this ext download log
	*/
	@Override
	public long getProfileFileVersionId() {
		return _extDownloadLog.getProfileFileVersionId();
	}

	/**
	* Returns the search and call user ID of this ext download log.
	*
	* @return the search and call user ID of this ext download log
	*/
	@Override
	public long getSearchAndCallUserId() {
		return _extDownloadLog.getSearchAndCallUserId();
	}

	/**
	* Returns the search and call user uuid of this ext download log.
	*
	* @return the search and call user uuid of this ext download log
	*/
	@Override
	public String getSearchAndCallUserUuid() {
		return _extDownloadLog.getSearchAndCallUserUuid();
	}

	/**
	* Returns the user ID of this ext download log.
	*
	* @return the user ID of this ext download log
	*/
	@Override
	public long getUserId() {
		return _extDownloadLog.getUserId();
	}

	/**
	* Returns the user uuid of this ext download log.
	*
	* @return the user uuid of this ext download log
	*/
	@Override
	public String getUserUuid() {
		return _extDownloadLog.getUserUuid();
	}

	/**
	* Returns the withdrawal date of this ext download log.
	*
	* @return the withdrawal date of this ext download log
	*/
	@Override
	public Date getWithdrawalDate() {
		return _extDownloadLog.getWithdrawalDate();
	}

	@Override
	public int hashCode() {
		return _extDownloadLog.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _extDownloadLog.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _extDownloadLog.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this ext download log is fitness review.
	*
	* @return <code>true</code> if this ext download log is fitness review; <code>false</code> otherwise
	*/
	@Override
	public boolean isFitnessReview() {
		return _extDownloadLog.isFitnessReview();
	}

	@Override
	public boolean isNew() {
		return _extDownloadLog.isNew();
	}

	@Override
	public void persist() {
		_extDownloadLog.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_extDownloadLog.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this ext download log.
	*
	* @param companyId the company ID of this ext download log
	*/
	@Override
	public void setCompanyId(long companyId) {
		_extDownloadLog.setCompanyId(companyId);
	}

	/**
	* Sets the conference IDs of this ext download log.
	*
	* @param conferenceIds the conference IDs of this ext download log
	*/
	@Override
	public void setConferenceIds(String conferenceIds) {
		_extDownloadLog.setConferenceIds(conferenceIds);
	}

	/**
	* Sets the create date of this ext download log.
	*
	* @param createDate the create date of this ext download log
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_extDownloadLog.setCreateDate(createDate);
	}

	/**
	* Sets the download date of this ext download log.
	*
	* @param downloadDate the download date of this ext download log
	*/
	@Override
	public void setDownloadDate(Date downloadDate) {
		_extDownloadLog.setDownloadDate(downloadDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_extDownloadLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_extDownloadLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_extDownloadLog.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ext download log ID of this ext download log.
	*
	* @param extDownloadLogId the ext download log ID of this ext download log
	*/
	@Override
	public void setExtDownloadLogId(long extDownloadLogId) {
		_extDownloadLog.setExtDownloadLogId(extDownloadLogId);
	}

	/**
	* Sets whether this ext download log is fitness review.
	*
	* @param fitnessReview the fitness review of this ext download log
	*/
	@Override
	public void setFitnessReview(boolean fitnessReview) {
		_extDownloadLog.setFitnessReview(fitnessReview);
	}

	/**
	* Sets the modified date of this ext download log.
	*
	* @param modifiedDate the modified date of this ext download log
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_extDownloadLog.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_extDownloadLog.setNew(n);
	}

	/**
	* Sets the primary key of this ext download log.
	*
	* @param primaryKey the primary key of this ext download log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_extDownloadLog.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_extDownloadLog.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the profile file entry ID of this ext download log.
	*
	* @param profileFileEntryId the profile file entry ID of this ext download log
	*/
	@Override
	public void setProfileFileEntryId(long profileFileEntryId) {
		_extDownloadLog.setProfileFileEntryId(profileFileEntryId);
	}

	/**
	* Sets the profile file version ID of this ext download log.
	*
	* @param profileFileVersionId the profile file version ID of this ext download log
	*/
	@Override
	public void setProfileFileVersionId(long profileFileVersionId) {
		_extDownloadLog.setProfileFileVersionId(profileFileVersionId);
	}

	/**
	* Sets the search and call user ID of this ext download log.
	*
	* @param searchAndCallUserId the search and call user ID of this ext download log
	*/
	@Override
	public void setSearchAndCallUserId(long searchAndCallUserId) {
		_extDownloadLog.setSearchAndCallUserId(searchAndCallUserId);
	}

	/**
	* Sets the search and call user uuid of this ext download log.
	*
	* @param searchAndCallUserUuid the search and call user uuid of this ext download log
	*/
	@Override
	public void setSearchAndCallUserUuid(String searchAndCallUserUuid) {
		_extDownloadLog.setSearchAndCallUserUuid(searchAndCallUserUuid);
	}

	/**
	* Sets the user ID of this ext download log.
	*
	* @param userId the user ID of this ext download log
	*/
	@Override
	public void setUserId(long userId) {
		_extDownloadLog.setUserId(userId);
	}

	/**
	* Sets the user uuid of this ext download log.
	*
	* @param userUuid the user uuid of this ext download log
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_extDownloadLog.setUserUuid(userUuid);
	}

	/**
	* Sets the withdrawal date of this ext download log.
	*
	* @param withdrawalDate the withdrawal date of this ext download log
	*/
	@Override
	public void setWithdrawalDate(Date withdrawalDate) {
		_extDownloadLog.setWithdrawalDate(withdrawalDate);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ExtDownloadLog> toCacheModel() {
		return _extDownloadLog.toCacheModel();
	}

	@Override
	public ExtDownloadLog toEscapedModel() {
		return new ExtDownloadLogWrapper(_extDownloadLog.toEscapedModel());
	}

	@Override
	public String toString() {
		return _extDownloadLog.toString();
	}

	@Override
	public ExtDownloadLog toUnescapedModel() {
		return new ExtDownloadLogWrapper(_extDownloadLog.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _extDownloadLog.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtDownloadLogWrapper)) {
			return false;
		}

		ExtDownloadLogWrapper extDownloadLogWrapper = (ExtDownloadLogWrapper)obj;

		if (Objects.equals(_extDownloadLog,
					extDownloadLogWrapper._extDownloadLog)) {
			return true;
		}

		return false;
	}

	@Override
	public ExtDownloadLog getWrappedModel() {
		return _extDownloadLog;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _extDownloadLog.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _extDownloadLog.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_extDownloadLog.resetOriginalValues();
	}

	private final ExtDownloadLog _extDownloadLog;
}