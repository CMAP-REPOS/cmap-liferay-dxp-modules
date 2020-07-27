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
 * The base model interface for the CrmUsRep service. Represents a row in the &quot;crm_usrep&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>contact.manager.model.impl.CrmUsRepModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>contact.manager.model.impl.CrmUsRepImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmUsRep
 * @generated
 */
@ProviderType
public interface CrmUsRepModel
	extends BaseModel<CrmUsRep>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a CRM US Rep model instance should use the {@link CrmUsRep} interface instead.
	 */

	/**
	 * Returns the primary key of this CRM US Rep.
	 *
	 * @return the primary key of this CRM US Rep
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this CRM US Rep.
	 *
	 * @param primaryKey the primary key of this CRM US Rep
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this CRM US Rep.
	 *
	 * @return the uuid of this CRM US Rep
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this CRM US Rep.
	 *
	 * @param uuid the uuid of this CRM US Rep
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the crm us rep ID of this CRM US Rep.
	 *
	 * @return the crm us rep ID of this CRM US Rep
	 */
	public long getCrmUsRepId();

	/**
	 * Sets the crm us rep ID of this CRM US Rep.
	 *
	 * @param crmUsRepId the crm us rep ID of this CRM US Rep
	 */
	public void setCrmUsRepId(long crmUsRepId);

	/**
	 * Returns the group ID of this CRM US Rep.
	 *
	 * @return the group ID of this CRM US Rep
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this CRM US Rep.
	 *
	 * @param groupId the group ID of this CRM US Rep
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this CRM US Rep.
	 *
	 * @return the company ID of this CRM US Rep
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this CRM US Rep.
	 *
	 * @param companyId the company ID of this CRM US Rep
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this CRM US Rep.
	 *
	 * @return the user ID of this CRM US Rep
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this CRM US Rep.
	 *
	 * @param userId the user ID of this CRM US Rep
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this CRM US Rep.
	 *
	 * @return the user uuid of this CRM US Rep
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this CRM US Rep.
	 *
	 * @param userUuid the user uuid of this CRM US Rep
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this CRM US Rep.
	 *
	 * @return the user name of this CRM US Rep
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this CRM US Rep.
	 *
	 * @param userName the user name of this CRM US Rep
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this CRM US Rep.
	 *
	 * @return the create date of this CRM US Rep
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this CRM US Rep.
	 *
	 * @param createDate the create date of this CRM US Rep
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this CRM US Rep.
	 *
	 * @return the modified date of this CRM US Rep
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this CRM US Rep.
	 *
	 * @param modifiedDate the modified date of this CRM US Rep
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this CRM US Rep.
	 *
	 * @return the name of this CRM US Rep
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this CRM US Rep.
	 *
	 * @param name the name of this CRM US Rep
	 */
	public void setName(String name);

	/**
	 * Returns the number of this CRM US Rep.
	 *
	 * @return the number of this CRM US Rep
	 */
	@AutoEscape
	public String getNumber();

	/**
	 * Sets the number of this CRM US Rep.
	 *
	 * @param number the number of this CRM US Rep
	 */
	public void setNumber(String number);

	/**
	 * Returns the zip code of this CRM US Rep.
	 *
	 * @return the zip code of this CRM US Rep
	 */
	@AutoEscape
	public String getZipCode();

	/**
	 * Sets the zip code of this CRM US Rep.
	 *
	 * @param zipCode the zip code of this CRM US Rep
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
	public int compareTo(contact.manager.model.CrmUsRep crmUsRep);

	@Override
	public int hashCode();

	@Override
	public CacheModel<contact.manager.model.CrmUsRep> toCacheModel();

	@Override
	public contact.manager.model.CrmUsRep toEscapedModel();

	@Override
	public contact.manager.model.CrmUsRep toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}