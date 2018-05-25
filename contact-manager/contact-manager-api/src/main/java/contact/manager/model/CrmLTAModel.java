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
 * The base model interface for the CrmLTA service. Represents a row in the &quot;crm_lta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link contact.manager.model.impl.CrmLTAModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link contact.manager.model.impl.CrmLTAImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmLTA
 * @see contact.manager.model.impl.CrmLTAImpl
 * @see contact.manager.model.impl.CrmLTAModelImpl
 * @generated
 */
@ProviderType
public interface CrmLTAModel extends BaseModel<CrmLTA>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a CRM LTA model instance should use the {@link CrmLTA} interface instead.
	 */

	/**
	 * Returns the primary key of this CRM LTA.
	 *
	 * @return the primary key of this CRM LTA
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this CRM LTA.
	 *
	 * @param primaryKey the primary key of this CRM LTA
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this CRM LTA.
	 *
	 * @return the uuid of this CRM LTA
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this CRM LTA.
	 *
	 * @param uuid the uuid of this CRM LTA
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the crm lta ID of this CRM LTA.
	 *
	 * @return the crm lta ID of this CRM LTA
	 */
	public long getCrmLTAId();

	/**
	 * Sets the crm lta ID of this CRM LTA.
	 *
	 * @param crmLTAId the crm lta ID of this CRM LTA
	 */
	public void setCrmLTAId(long crmLTAId);

	/**
	 * Returns the group ID of this CRM LTA.
	 *
	 * @return the group ID of this CRM LTA
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this CRM LTA.
	 *
	 * @param groupId the group ID of this CRM LTA
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this CRM LTA.
	 *
	 * @return the company ID of this CRM LTA
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this CRM LTA.
	 *
	 * @param companyId the company ID of this CRM LTA
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this CRM LTA.
	 *
	 * @return the user ID of this CRM LTA
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this CRM LTA.
	 *
	 * @param userId the user ID of this CRM LTA
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this CRM LTA.
	 *
	 * @return the user uuid of this CRM LTA
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this CRM LTA.
	 *
	 * @param userUuid the user uuid of this CRM LTA
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this CRM LTA.
	 *
	 * @return the user name of this CRM LTA
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this CRM LTA.
	 *
	 * @param userName the user name of this CRM LTA
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this CRM LTA.
	 *
	 * @return the create date of this CRM LTA
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this CRM LTA.
	 *
	 * @param createDate the create date of this CRM LTA
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this CRM LTA.
	 *
	 * @return the modified date of this CRM LTA
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this CRM LTA.
	 *
	 * @param modifiedDate the modified date of this CRM LTA
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this CRM LTA.
	 *
	 * @return the name of this CRM LTA
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this CRM LTA.
	 *
	 * @param name the name of this CRM LTA
	 */
	public void setName(String name);

	/**
	 * Returns the zip code of this CRM LTA.
	 *
	 * @return the zip code of this CRM LTA
	 */
	@AutoEscape
	public String getZipCode();

	/**
	 * Sets the zip code of this CRM LTA.
	 *
	 * @param zipCode the zip code of this CRM LTA
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
	public int compareTo(contact.manager.model.CrmLTA crmLTA);

	@Override
	public int hashCode();

	@Override
	public CacheModel<contact.manager.model.CrmLTA> toCacheModel();

	@Override
	public contact.manager.model.CrmLTA toEscapedModel();

	@Override
	public contact.manager.model.CrmLTA toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}