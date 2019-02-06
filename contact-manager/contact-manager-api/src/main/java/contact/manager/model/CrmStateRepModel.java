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
 * The base model interface for the CrmStateRep service. Represents a row in the &quot;crm_staterep&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link contact.manager.model.impl.CrmStateRepModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link contact.manager.model.impl.CrmStateRepImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateRep
 * @see contact.manager.model.impl.CrmStateRepImpl
 * @see contact.manager.model.impl.CrmStateRepModelImpl
 * @generated
 */
@ProviderType
public interface CrmStateRepModel extends BaseModel<CrmStateRep>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a CRM State Rep model instance should use the {@link CrmStateRep} interface instead.
	 */

	/**
	 * Returns the primary key of this CRM State Rep.
	 *
	 * @return the primary key of this CRM State Rep
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this CRM State Rep.
	 *
	 * @param primaryKey the primary key of this CRM State Rep
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this CRM State Rep.
	 *
	 * @return the uuid of this CRM State Rep
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this CRM State Rep.
	 *
	 * @param uuid the uuid of this CRM State Rep
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the crm state rep ID of this CRM State Rep.
	 *
	 * @return the crm state rep ID of this CRM State Rep
	 */
	public long getCrmStateRepId();

	/**
	 * Sets the crm state rep ID of this CRM State Rep.
	 *
	 * @param crmStateRepId the crm state rep ID of this CRM State Rep
	 */
	public void setCrmStateRepId(long crmStateRepId);

	/**
	 * Returns the group ID of this CRM State Rep.
	 *
	 * @return the group ID of this CRM State Rep
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this CRM State Rep.
	 *
	 * @param groupId the group ID of this CRM State Rep
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this CRM State Rep.
	 *
	 * @return the company ID of this CRM State Rep
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this CRM State Rep.
	 *
	 * @param companyId the company ID of this CRM State Rep
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this CRM State Rep.
	 *
	 * @return the user ID of this CRM State Rep
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this CRM State Rep.
	 *
	 * @param userId the user ID of this CRM State Rep
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this CRM State Rep.
	 *
	 * @return the user uuid of this CRM State Rep
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this CRM State Rep.
	 *
	 * @param userUuid the user uuid of this CRM State Rep
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this CRM State Rep.
	 *
	 * @return the user name of this CRM State Rep
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this CRM State Rep.
	 *
	 * @param userName the user name of this CRM State Rep
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this CRM State Rep.
	 *
	 * @return the create date of this CRM State Rep
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this CRM State Rep.
	 *
	 * @param createDate the create date of this CRM State Rep
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this CRM State Rep.
	 *
	 * @return the modified date of this CRM State Rep
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this CRM State Rep.
	 *
	 * @param modifiedDate the modified date of this CRM State Rep
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this CRM State Rep.
	 *
	 * @return the name of this CRM State Rep
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this CRM State Rep.
	 *
	 * @param name the name of this CRM State Rep
	 */
	public void setName(String name);

	/**
	 * Returns the number of this CRM State Rep.
	 *
	 * @return the number of this CRM State Rep
	 */
	@AutoEscape
	public String getNumber();

	/**
	 * Sets the number of this CRM State Rep.
	 *
	 * @param number the number of this CRM State Rep
	 */
	public void setNumber(String number);

	/**
	 * Returns the zip code of this CRM State Rep.
	 *
	 * @return the zip code of this CRM State Rep
	 */
	@AutoEscape
	public String getZipCode();

	/**
	 * Sets the zip code of this CRM State Rep.
	 *
	 * @param zipCode the zip code of this CRM State Rep
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
	public int compareTo(CrmStateRep crmStateRep);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CrmStateRep> toCacheModel();

	@Override
	public CrmStateRep toEscapedModel();

	@Override
	public CrmStateRep toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}