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
 * The base model interface for the CrmChiWard service. Represents a row in the &quot;crm_chiward&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link contact.manager.model.impl.CrmChiWardModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link contact.manager.model.impl.CrmChiWardImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmChiWard
 * @see contact.manager.model.impl.CrmChiWardImpl
 * @see contact.manager.model.impl.CrmChiWardModelImpl
 * @generated
 */
@ProviderType
public interface CrmChiWardModel extends BaseModel<CrmChiWard>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a CRM Chi Ward model instance should use the {@link CrmChiWard} interface instead.
	 */

	/**
	 * Returns the primary key of this CRM Chi Ward.
	 *
	 * @return the primary key of this CRM Chi Ward
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this CRM Chi Ward.
	 *
	 * @param primaryKey the primary key of this CRM Chi Ward
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this CRM Chi Ward.
	 *
	 * @return the uuid of this CRM Chi Ward
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this CRM Chi Ward.
	 *
	 * @param uuid the uuid of this CRM Chi Ward
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the crm chi ward ID of this CRM Chi Ward.
	 *
	 * @return the crm chi ward ID of this CRM Chi Ward
	 */
	public long getCrmChiWardId();

	/**
	 * Sets the crm chi ward ID of this CRM Chi Ward.
	 *
	 * @param crmChiWardId the crm chi ward ID of this CRM Chi Ward
	 */
	public void setCrmChiWardId(long crmChiWardId);

	/**
	 * Returns the group ID of this CRM Chi Ward.
	 *
	 * @return the group ID of this CRM Chi Ward
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this CRM Chi Ward.
	 *
	 * @param groupId the group ID of this CRM Chi Ward
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this CRM Chi Ward.
	 *
	 * @return the company ID of this CRM Chi Ward
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this CRM Chi Ward.
	 *
	 * @param companyId the company ID of this CRM Chi Ward
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this CRM Chi Ward.
	 *
	 * @return the user ID of this CRM Chi Ward
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this CRM Chi Ward.
	 *
	 * @param userId the user ID of this CRM Chi Ward
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this CRM Chi Ward.
	 *
	 * @return the user uuid of this CRM Chi Ward
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this CRM Chi Ward.
	 *
	 * @param userUuid the user uuid of this CRM Chi Ward
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this CRM Chi Ward.
	 *
	 * @return the user name of this CRM Chi Ward
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this CRM Chi Ward.
	 *
	 * @param userName the user name of this CRM Chi Ward
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this CRM Chi Ward.
	 *
	 * @return the create date of this CRM Chi Ward
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this CRM Chi Ward.
	 *
	 * @param createDate the create date of this CRM Chi Ward
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this CRM Chi Ward.
	 *
	 * @return the modified date of this CRM Chi Ward
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this CRM Chi Ward.
	 *
	 * @param modifiedDate the modified date of this CRM Chi Ward
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this CRM Chi Ward.
	 *
	 * @return the name of this CRM Chi Ward
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this CRM Chi Ward.
	 *
	 * @param name the name of this CRM Chi Ward
	 */
	public void setName(String name);

	/**
	 * Returns the zip code of this CRM Chi Ward.
	 *
	 * @return the zip code of this CRM Chi Ward
	 */
	@AutoEscape
	public String getZipCode();

	/**
	 * Sets the zip code of this CRM Chi Ward.
	 *
	 * @param zipCode the zip code of this CRM Chi Ward
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
	public int compareTo(contact.manager.model.CrmChiWard crmChiWard);

	@Override
	public int hashCode();

	@Override
	public CacheModel<contact.manager.model.CrmChiWard> toCacheModel();

	@Override
	public contact.manager.model.CrmChiWard toEscapedModel();

	@Override
	public contact.manager.model.CrmChiWard toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}