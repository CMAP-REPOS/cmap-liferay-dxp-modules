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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ExtDownloadLog service. Represents a row in the &quot;UCC_ExtDownloadLog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ucc.portal.model.impl.ExtDownloadLogModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ucc.portal.model.impl.ExtDownloadLogImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtDownloadLog
 * @see ucc.portal.model.impl.ExtDownloadLogImpl
 * @see ucc.portal.model.impl.ExtDownloadLogModelImpl
 * @generated
 */
@ProviderType
public interface ExtDownloadLogModel extends BaseModel<ExtDownloadLog>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ext download log model instance should use the {@link ExtDownloadLog} interface instead.
	 */

	/**
	 * Returns the primary key of this ext download log.
	 *
	 * @return the primary key of this ext download log
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ext download log.
	 *
	 * @param primaryKey the primary key of this ext download log
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ext download log ID of this ext download log.
	 *
	 * @return the ext download log ID of this ext download log
	 */
	public long getExtDownloadLogId();

	/**
	 * Sets the ext download log ID of this ext download log.
	 *
	 * @param extDownloadLogId the ext download log ID of this ext download log
	 */
	public void setExtDownloadLogId(long extDownloadLogId);

	/**
	 * Returns the company ID of this ext download log.
	 *
	 * @return the company ID of this ext download log
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ext download log.
	 *
	 * @param companyId the company ID of this ext download log
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this ext download log.
	 *
	 * @return the user ID of this ext download log
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this ext download log.
	 *
	 * @param userId the user ID of this ext download log
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ext download log.
	 *
	 * @return the user uuid of this ext download log
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ext download log.
	 *
	 * @param userUuid the user uuid of this ext download log
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this ext download log.
	 *
	 * @return the create date of this ext download log
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this ext download log.
	 *
	 * @param createDate the create date of this ext download log
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ext download log.
	 *
	 * @return the modified date of this ext download log
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ext download log.
	 *
	 * @param modifiedDate the modified date of this ext download log
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the profile file entry ID of this ext download log.
	 *
	 * @return the profile file entry ID of this ext download log
	 */
	public long getProfileFileEntryId();

	/**
	 * Sets the profile file entry ID of this ext download log.
	 *
	 * @param profileFileEntryId the profile file entry ID of this ext download log
	 */
	public void setProfileFileEntryId(long profileFileEntryId);

	/**
	 * Returns the profile file version ID of this ext download log.
	 *
	 * @return the profile file version ID of this ext download log
	 */
	public long getProfileFileVersionId();

	/**
	 * Sets the profile file version ID of this ext download log.
	 *
	 * @param profileFileVersionId the profile file version ID of this ext download log
	 */
	public void setProfileFileVersionId(long profileFileVersionId);

	/**
	 * Returns the search and call user ID of this ext download log.
	 *
	 * @return the search and call user ID of this ext download log
	 */
	public long getSearchAndCallUserId();

	/**
	 * Sets the search and call user ID of this ext download log.
	 *
	 * @param searchAndCallUserId the search and call user ID of this ext download log
	 */
	public void setSearchAndCallUserId(long searchAndCallUserId);

	/**
	 * Returns the search and call user uuid of this ext download log.
	 *
	 * @return the search and call user uuid of this ext download log
	 */
	public String getSearchAndCallUserUuid();

	/**
	 * Sets the search and call user uuid of this ext download log.
	 *
	 * @param searchAndCallUserUuid the search and call user uuid of this ext download log
	 */
	public void setSearchAndCallUserUuid(String searchAndCallUserUuid);

	/**
	 * Returns the conference IDs of this ext download log.
	 *
	 * @return the conference IDs of this ext download log
	 */
	@AutoEscape
	public String getConferenceIds();

	/**
	 * Sets the conference IDs of this ext download log.
	 *
	 * @param conferenceIds the conference IDs of this ext download log
	 */
	public void setConferenceIds(String conferenceIds);

	/**
	 * Returns the download date of this ext download log.
	 *
	 * @return the download date of this ext download log
	 */
	public Date getDownloadDate();

	/**
	 * Sets the download date of this ext download log.
	 *
	 * @param downloadDate the download date of this ext download log
	 */
	public void setDownloadDate(Date downloadDate);

	/**
	 * Returns the withdrawal date of this ext download log.
	 *
	 * @return the withdrawal date of this ext download log
	 */
	public Date getWithdrawalDate();

	/**
	 * Sets the withdrawal date of this ext download log.
	 *
	 * @param withdrawalDate the withdrawal date of this ext download log
	 */
	public void setWithdrawalDate(Date withdrawalDate);

	/**
	 * Returns the fitness review of this ext download log.
	 *
	 * @return the fitness review of this ext download log
	 */
	public boolean getFitnessReview();

	/**
	 * Returns <code>true</code> if this ext download log is fitness review.
	 *
	 * @return <code>true</code> if this ext download log is fitness review; <code>false</code> otherwise
	 */
	public boolean isFitnessReview();

	/**
	 * Sets whether this ext download log is fitness review.
	 *
	 * @param fitnessReview the fitness review of this ext download log
	 */
	public void setFitnessReview(boolean fitnessReview);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ExtDownloadLog extDownloadLog);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ExtDownloadLog> toCacheModel();

	@Override
	public ExtDownloadLog toEscapedModel();

	@Override
	public ExtDownloadLog toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}