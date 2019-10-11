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
 * The base model interface for the CrmCounty service. Represents a row in the &quot;crm_county&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link contact.manager.model.impl.CrmCountyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link contact.manager.model.impl.CrmCountyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmCounty
 * @see contact.manager.model.impl.CrmCountyImpl
 * @see contact.manager.model.impl.CrmCountyModelImpl
 * @generated
 */
@ProviderType
public interface CrmCountyModel extends BaseModel<CrmCounty>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a CRM County model instance should use the {@link CrmCounty} interface instead.
	 */

	/**
	 * Returns the primary key of this CRM County.
	 *
	 * @return the primary key of this CRM County
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this CRM County.
	 *
	 * @param primaryKey the primary key of this CRM County
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this CRM County.
	 *
	 * @return the uuid of this CRM County
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this CRM County.
	 *
	 * @param uuid the uuid of this CRM County
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the crm county ID of this CRM County.
	 *
	 * @return the crm county ID of this CRM County
	 */
	public long getCrmCountyId();

	/**
	 * Sets the crm county ID of this CRM County.
	 *
	 * @param crmCountyId the crm county ID of this CRM County
	 */
	public void setCrmCountyId(long crmCountyId);

	/**
	 * Returns the group ID of this CRM County.
	 *
	 * @return the group ID of this CRM County
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this CRM County.
	 *
	 * @param groupId the group ID of this CRM County
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this CRM County.
	 *
	 * @return the company ID of this CRM County
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this CRM County.
	 *
	 * @param companyId the company ID of this CRM County
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this CRM County.
	 *
	 * @return the user ID of this CRM County
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this CRM County.
	 *
	 * @param userId the user ID of this CRM County
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this CRM County.
	 *
	 * @return the user uuid of this CRM County
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this CRM County.
	 *
	 * @param userUuid the user uuid of this CRM County
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this CRM County.
	 *
	 * @return the user name of this CRM County
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this CRM County.
	 *
	 * @param userName the user name of this CRM County
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this CRM County.
	 *
	 * @return the create date of this CRM County
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this CRM County.
	 *
	 * @param createDate the create date of this CRM County
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this CRM County.
	 *
	 * @return the modified date of this CRM County
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this CRM County.
	 *
	 * @param modifiedDate the modified date of this CRM County
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this CRM County.
	 *
	 * @return the name of this CRM County
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this CRM County.
	 *
	 * @param name the name of this CRM County
	 */
	public void setName(String name);

	/**
	 * Returns the zip code of this CRM County.
	 *
	 * @return the zip code of this CRM County
	 */
	@AutoEscape
	public String getZipCode();

	/**
	 * Sets the zip code of this CRM County.
	 *
	 * @param zipCode the zip code of this CRM County
	 */
	public void setZipCode(String zipCode);

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
	public int compareTo(CrmCounty crmCounty);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CrmCounty> toCacheModel();

	@Override
	public CrmCounty toEscapedModel();

	@Override
	public CrmCounty toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}