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
 * The base model interface for the ExtRegionalEducation service. Represents a row in the &quot;UCC_ExtRegionalEducation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ucc.portal.model.impl.ExtRegionalEducationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ucc.portal.model.impl.ExtRegionalEducationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtRegionalEducation
 * @see ucc.portal.model.impl.ExtRegionalEducationImpl
 * @see ucc.portal.model.impl.ExtRegionalEducationModelImpl
 * @generated
 */
@ProviderType
public interface ExtRegionalEducationModel extends BaseModel<ExtRegionalEducation>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ext regional education model instance should use the {@link ExtRegionalEducation} interface instead.
	 */

	/**
	 * Returns the primary key of this ext regional education.
	 *
	 * @return the primary key of this ext regional education
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ext regional education.
	 *
	 * @param primaryKey the primary key of this ext regional education
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ext regional education ID of this ext regional education.
	 *
	 * @return the ext regional education ID of this ext regional education
	 */
	public long getExtRegionalEducationId();

	/**
	 * Sets the ext regional education ID of this ext regional education.
	 *
	 * @param extRegionalEducationId the ext regional education ID of this ext regional education
	 */
	public void setExtRegionalEducationId(long extRegionalEducationId);

	/**
	 * Returns the company ID of this ext regional education.
	 *
	 * @return the company ID of this ext regional education
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ext regional education.
	 *
	 * @param companyId the company ID of this ext regional education
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this ext regional education.
	 *
	 * @return the user ID of this ext regional education
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this ext regional education.
	 *
	 * @param userId the user ID of this ext regional education
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ext regional education.
	 *
	 * @return the user uuid of this ext regional education
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ext regional education.
	 *
	 * @param userUuid the user uuid of this ext regional education
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this ext regional education.
	 *
	 * @return the create date of this ext regional education
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this ext regional education.
	 *
	 * @param createDate the create date of this ext regional education
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ext regional education.
	 *
	 * @return the modified date of this ext regional education
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ext regional education.
	 *
	 * @param modifiedDate the modified date of this ext regional education
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the program or experience of this ext regional education.
	 *
	 * @return the program or experience of this ext regional education
	 */
	@AutoEscape
	public String getProgramOrExperience();

	/**
	 * Sets the program or experience of this ext regional education.
	 *
	 * @param programOrExperience the program or experience of this ext regional education
	 */
	public void setProgramOrExperience(String programOrExperience);

	/**
	 * Returns the city of this ext regional education.
	 *
	 * @return the city of this ext regional education
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this ext regional education.
	 *
	 * @param city the city of this ext regional education
	 */
	public void setCity(String city);

	/**
	 * Returns the region ID of this ext regional education.
	 *
	 * @return the region ID of this ext regional education
	 */
	public long getRegionId();

	/**
	 * Sets the region ID of this ext regional education.
	 *
	 * @param regionId the region ID of this ext regional education
	 */
	public void setRegionId(long regionId);

	/**
	 * Returns the country ID of this ext regional education.
	 *
	 * @return the country ID of this ext regional education
	 */
	public long getCountryId();

	/**
	 * Sets the country ID of this ext regional education.
	 *
	 * @param countryId the country ID of this ext regional education
	 */
	public void setCountryId(long countryId);

	/**
	 * Returns the start date of attendance of this ext regional education.
	 *
	 * @return the start date of attendance of this ext regional education
	 */
	public Date getStartDateOfAttendance();

	/**
	 * Sets the start date of attendance of this ext regional education.
	 *
	 * @param startDateOfAttendance the start date of attendance of this ext regional education
	 */
	public void setStartDateOfAttendance(Date startDateOfAttendance);

	/**
	 * Returns the end date of attendance of this ext regional education.
	 *
	 * @return the end date of attendance of this ext regional education
	 */
	public Date getEndDateOfAttendance();

	/**
	 * Sets the end date of attendance of this ext regional education.
	 *
	 * @param endDateOfAttendance the end date of attendance of this ext regional education
	 */
	public void setEndDateOfAttendance(Date endDateOfAttendance);

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
	public int compareTo(ExtRegionalEducation extRegionalEducation);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ExtRegionalEducation> toCacheModel();

	@Override
	public ExtRegionalEducation toEscapedModel();

	@Override
	public ExtRegionalEducation toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}