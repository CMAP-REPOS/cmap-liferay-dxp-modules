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
 * The base model interface for the CrmContactAuditLog service. Represents a row in the &quot;crm_contactauditlog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link contact.manager.model.impl.CrmContactAuditLogModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link contact.manager.model.impl.CrmContactAuditLogImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLog
 * @see contact.manager.model.impl.CrmContactAuditLogImpl
 * @see contact.manager.model.impl.CrmContactAuditLogModelImpl
 * @generated
 */
@ProviderType
public interface CrmContactAuditLogModel extends BaseModel<CrmContactAuditLog>,
	GroupedModel, ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a CRM Contact Audit Log model instance should use the {@link CrmContactAuditLog} interface instead.
	 */

	/**
	 * Returns the primary key of this CRM Contact Audit Log.
	 *
	 * @return the primary key of this CRM Contact Audit Log
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this CRM Contact Audit Log.
	 *
	 * @param primaryKey the primary key of this CRM Contact Audit Log
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this CRM Contact Audit Log.
	 *
	 * @return the uuid of this CRM Contact Audit Log
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this CRM Contact Audit Log.
	 *
	 * @param uuid the uuid of this CRM Contact Audit Log
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the crm contact audit log ID of this CRM Contact Audit Log.
	 *
	 * @return the crm contact audit log ID of this CRM Contact Audit Log
	 */
	public long getCrmContactAuditLogId();

	/**
	 * Sets the crm contact audit log ID of this CRM Contact Audit Log.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID of this CRM Contact Audit Log
	 */
	public void setCrmContactAuditLogId(long crmContactAuditLogId);

	/**
	 * Returns the group ID of this CRM Contact Audit Log.
	 *
	 * @return the group ID of this CRM Contact Audit Log
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this CRM Contact Audit Log.
	 *
	 * @param groupId the group ID of this CRM Contact Audit Log
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this CRM Contact Audit Log.
	 *
	 * @return the company ID of this CRM Contact Audit Log
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this CRM Contact Audit Log.
	 *
	 * @param companyId the company ID of this CRM Contact Audit Log
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this CRM Contact Audit Log.
	 *
	 * @return the user ID of this CRM Contact Audit Log
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this CRM Contact Audit Log.
	 *
	 * @param userId the user ID of this CRM Contact Audit Log
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this CRM Contact Audit Log.
	 *
	 * @return the user uuid of this CRM Contact Audit Log
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this CRM Contact Audit Log.
	 *
	 * @param userUuid the user uuid of this CRM Contact Audit Log
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this CRM Contact Audit Log.
	 *
	 * @return the user name of this CRM Contact Audit Log
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this CRM Contact Audit Log.
	 *
	 * @param userName the user name of this CRM Contact Audit Log
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this CRM Contact Audit Log.
	 *
	 * @return the create date of this CRM Contact Audit Log
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this CRM Contact Audit Log.
	 *
	 * @param createDate the create date of this CRM Contact Audit Log
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this CRM Contact Audit Log.
	 *
	 * @return the modified date of this CRM Contact Audit Log
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this CRM Contact Audit Log.
	 *
	 * @param modifiedDate the modified date of this CRM Contact Audit Log
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the crm contact ID of this CRM Contact Audit Log.
	 *
	 * @return the crm contact ID of this CRM Contact Audit Log
	 */
	public long getCrmContactId();

	/**
	 * Sets the crm contact ID of this CRM Contact Audit Log.
	 *
	 * @param crmContactId the crm contact ID of this CRM Contact Audit Log
	 */
	public void setCrmContactId(long crmContactId);

	/**
	 * Returns the constant contact ID of this CRM Contact Audit Log.
	 *
	 * @return the constant contact ID of this CRM Contact Audit Log
	 */
	public long getConstantContactId();

	/**
	 * Sets the constant contact ID of this CRM Contact Audit Log.
	 *
	 * @param constantContactId the constant contact ID of this CRM Contact Audit Log
	 */
	public void setConstantContactId(long constantContactId);

	/**
	 * Returns the action of this CRM Contact Audit Log.
	 *
	 * @return the action of this CRM Contact Audit Log
	 */
	@AutoEscape
	public String getAction();

	/**
	 * Sets the action of this CRM Contact Audit Log.
	 *
	 * @param action the action of this CRM Contact Audit Log
	 */
	public void setAction(String action);

	/**
	 * Returns the old snapshot of this CRM Contact Audit Log.
	 *
	 * @return the old snapshot of this CRM Contact Audit Log
	 */
	@AutoEscape
	public String getOldSnapshot();

	/**
	 * Sets the old snapshot of this CRM Contact Audit Log.
	 *
	 * @param oldSnapshot the old snapshot of this CRM Contact Audit Log
	 */
	public void setOldSnapshot(String oldSnapshot);

	/**
	 * Returns the new snapshot of this CRM Contact Audit Log.
	 *
	 * @return the new snapshot of this CRM Contact Audit Log
	 */
	@AutoEscape
	public String getNewSnapshot();

	/**
	 * Sets the new snapshot of this CRM Contact Audit Log.
	 *
	 * @param newSnapshot the new snapshot of this CRM Contact Audit Log
	 */
	public void setNewSnapshot(String newSnapshot);

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
	public int compareTo(
		contact.manager.model.CrmContactAuditLog crmContactAuditLog);

	@Override
	public int hashCode();

	@Override
	public CacheModel<contact.manager.model.CrmContactAuditLog> toCacheModel();

	@Override
	public contact.manager.model.CrmContactAuditLog toEscapedModel();

	@Override
	public contact.manager.model.CrmContactAuditLog toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}