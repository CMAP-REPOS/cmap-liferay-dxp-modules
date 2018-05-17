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

package contact.manager.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CrmKioskSurvey service. Represents a row in the &quot;crm_kiosksurvey&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link contact.manager.model.impl.CrmKioskSurveyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link contact.manager.model.impl.CrmKioskSurveyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmKioskSurvey
 * @see contact.manager.model.impl.CrmKioskSurveyImpl
 * @see contact.manager.model.impl.CrmKioskSurveyModelImpl
 * @generated
 */
@ProviderType
public interface CrmKioskSurveyModel extends BaseModel<CrmKioskSurvey>,
	GroupedModel, ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a CRM Kiosk Survey model instance should use the {@link CrmKioskSurvey} interface instead.
	 */

	/**
	 * Returns the primary key of this CRM Kiosk Survey.
	 *
	 * @return the primary key of this CRM Kiosk Survey
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this CRM Kiosk Survey.
	 *
	 * @param primaryKey the primary key of this CRM Kiosk Survey
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this CRM Kiosk Survey.
	 *
	 * @return the uuid of this CRM Kiosk Survey
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this CRM Kiosk Survey.
	 *
	 * @param uuid the uuid of this CRM Kiosk Survey
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the crm kiosk survey ID of this CRM Kiosk Survey.
	 *
	 * @return the crm kiosk survey ID of this CRM Kiosk Survey
	 */
	public long getCrmKioskSurveyId();

	/**
	 * Sets the crm kiosk survey ID of this CRM Kiosk Survey.
	 *
	 * @param crmKioskSurveyId the crm kiosk survey ID of this CRM Kiosk Survey
	 */
	public void setCrmKioskSurveyId(long crmKioskSurveyId);

	/**
	 * Returns the group ID of this CRM Kiosk Survey.
	 *
	 * @return the group ID of this CRM Kiosk Survey
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this CRM Kiosk Survey.
	 *
	 * @param groupId the group ID of this CRM Kiosk Survey
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this CRM Kiosk Survey.
	 *
	 * @return the company ID of this CRM Kiosk Survey
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this CRM Kiosk Survey.
	 *
	 * @param companyId the company ID of this CRM Kiosk Survey
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this CRM Kiosk Survey.
	 *
	 * @return the user ID of this CRM Kiosk Survey
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this CRM Kiosk Survey.
	 *
	 * @param userId the user ID of this CRM Kiosk Survey
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this CRM Kiosk Survey.
	 *
	 * @return the user uuid of this CRM Kiosk Survey
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this CRM Kiosk Survey.
	 *
	 * @param userUuid the user uuid of this CRM Kiosk Survey
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this CRM Kiosk Survey.
	 *
	 * @return the user name of this CRM Kiosk Survey
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this CRM Kiosk Survey.
	 *
	 * @param userName the user name of this CRM Kiosk Survey
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this CRM Kiosk Survey.
	 *
	 * @return the create date of this CRM Kiosk Survey
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this CRM Kiosk Survey.
	 *
	 * @param createDate the create date of this CRM Kiosk Survey
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this CRM Kiosk Survey.
	 *
	 * @return the modified date of this CRM Kiosk Survey
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this CRM Kiosk Survey.
	 *
	 * @param modifiedDate the modified date of this CRM Kiosk Survey
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

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
	public int compareTo(contact.manager.model.CrmKioskSurvey crmKioskSurvey);

	@Override
	public int hashCode();

	@Override
	public CacheModel<contact.manager.model.CrmKioskSurvey> toCacheModel();

	@Override
	public contact.manager.model.CrmKioskSurvey toEscapedModel();

	@Override
	public contact.manager.model.CrmKioskSurvey toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}