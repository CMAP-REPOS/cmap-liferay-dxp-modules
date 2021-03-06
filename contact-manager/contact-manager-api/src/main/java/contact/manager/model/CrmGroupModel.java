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
 * The base model interface for the CrmGroup service. Represents a row in the &quot;crm_group&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>contact.manager.model.impl.CrmGroupModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>contact.manager.model.impl.CrmGroupImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmGroup
 * @generated
 */
@ProviderType
public interface CrmGroupModel
	extends BaseModel<CrmGroup>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a CRM Group model instance should use the {@link CrmGroup} interface instead.
	 */

	/**
	 * Returns the primary key of this CRM Group.
	 *
	 * @return the primary key of this CRM Group
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this CRM Group.
	 *
	 * @param primaryKey the primary key of this CRM Group
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this CRM Group.
	 *
	 * @return the uuid of this CRM Group
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this CRM Group.
	 *
	 * @param uuid the uuid of this CRM Group
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the crm group ID of this CRM Group.
	 *
	 * @return the crm group ID of this CRM Group
	 */
	public long getCrmGroupId();

	/**
	 * Sets the crm group ID of this CRM Group.
	 *
	 * @param crmGroupId the crm group ID of this CRM Group
	 */
	public void setCrmGroupId(long crmGroupId);

	/**
	 * Returns the group ID of this CRM Group.
	 *
	 * @return the group ID of this CRM Group
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this CRM Group.
	 *
	 * @param groupId the group ID of this CRM Group
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this CRM Group.
	 *
	 * @return the company ID of this CRM Group
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this CRM Group.
	 *
	 * @param companyId the company ID of this CRM Group
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this CRM Group.
	 *
	 * @return the user ID of this CRM Group
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this CRM Group.
	 *
	 * @param userId the user ID of this CRM Group
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this CRM Group.
	 *
	 * @return the user uuid of this CRM Group
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this CRM Group.
	 *
	 * @param userUuid the user uuid of this CRM Group
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this CRM Group.
	 *
	 * @return the user name of this CRM Group
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this CRM Group.
	 *
	 * @param userName the user name of this CRM Group
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this CRM Group.
	 *
	 * @return the create date of this CRM Group
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this CRM Group.
	 *
	 * @param createDate the create date of this CRM Group
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this CRM Group.
	 *
	 * @return the modified date of this CRM Group
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this CRM Group.
	 *
	 * @param modifiedDate the modified date of this CRM Group
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this CRM Group.
	 *
	 * @return the name of this CRM Group
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this CRM Group.
	 *
	 * @param name the name of this CRM Group
	 */
	public void setName(String name);

	/**
	 * Returns the crm contacts count of this CRM Group.
	 *
	 * @return the crm contacts count of this CRM Group
	 */
	public long getCrmContactsCount();

	/**
	 * Sets the crm contacts count of this CRM Group.
	 *
	 * @param crmContactsCount the crm contacts count of this CRM Group
	 */
	public void setCrmContactsCount(long crmContactsCount);

	/**
	 * Returns the status of this CRM Group.
	 *
	 * @return the status of this CRM Group
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this CRM Group.
	 *
	 * @param status the status of this CRM Group
	 */
	public void setStatus(String status);

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
	public int compareTo(contact.manager.model.CrmGroup crmGroup);

	@Override
	public int hashCode();

	@Override
	public CacheModel<contact.manager.model.CrmGroup> toCacheModel();

	@Override
	public contact.manager.model.CrmGroup toEscapedModel();

	@Override
	public contact.manager.model.CrmGroup toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}