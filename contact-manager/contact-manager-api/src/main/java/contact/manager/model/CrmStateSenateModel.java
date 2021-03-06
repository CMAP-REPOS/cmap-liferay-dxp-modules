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
 * The base model interface for the CrmStateSenate service. Represents a row in the &quot;crm_statesenate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>contact.manager.model.impl.CrmStateSenateModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>contact.manager.model.impl.CrmStateSenateImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateSenate
 * @generated
 */
@ProviderType
public interface CrmStateSenateModel
	extends BaseModel<CrmStateSenate>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a CRM State Senate model instance should use the {@link CrmStateSenate} interface instead.
	 */

	/**
	 * Returns the primary key of this CRM State Senate.
	 *
	 * @return the primary key of this CRM State Senate
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this CRM State Senate.
	 *
	 * @param primaryKey the primary key of this CRM State Senate
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this CRM State Senate.
	 *
	 * @return the uuid of this CRM State Senate
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this CRM State Senate.
	 *
	 * @param uuid the uuid of this CRM State Senate
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the crm state senate ID of this CRM State Senate.
	 *
	 * @return the crm state senate ID of this CRM State Senate
	 */
	public long getCrmStateSenateId();

	/**
	 * Sets the crm state senate ID of this CRM State Senate.
	 *
	 * @param crmStateSenateId the crm state senate ID of this CRM State Senate
	 */
	public void setCrmStateSenateId(long crmStateSenateId);

	/**
	 * Returns the group ID of this CRM State Senate.
	 *
	 * @return the group ID of this CRM State Senate
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this CRM State Senate.
	 *
	 * @param groupId the group ID of this CRM State Senate
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this CRM State Senate.
	 *
	 * @return the company ID of this CRM State Senate
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this CRM State Senate.
	 *
	 * @param companyId the company ID of this CRM State Senate
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this CRM State Senate.
	 *
	 * @return the user ID of this CRM State Senate
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this CRM State Senate.
	 *
	 * @param userId the user ID of this CRM State Senate
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this CRM State Senate.
	 *
	 * @return the user uuid of this CRM State Senate
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this CRM State Senate.
	 *
	 * @param userUuid the user uuid of this CRM State Senate
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this CRM State Senate.
	 *
	 * @return the user name of this CRM State Senate
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this CRM State Senate.
	 *
	 * @param userName the user name of this CRM State Senate
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this CRM State Senate.
	 *
	 * @return the create date of this CRM State Senate
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this CRM State Senate.
	 *
	 * @param createDate the create date of this CRM State Senate
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this CRM State Senate.
	 *
	 * @return the modified date of this CRM State Senate
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this CRM State Senate.
	 *
	 * @param modifiedDate the modified date of this CRM State Senate
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this CRM State Senate.
	 *
	 * @return the name of this CRM State Senate
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this CRM State Senate.
	 *
	 * @param name the name of this CRM State Senate
	 */
	public void setName(String name);

	/**
	 * Returns the number of this CRM State Senate.
	 *
	 * @return the number of this CRM State Senate
	 */
	@AutoEscape
	public String getNumber();

	/**
	 * Sets the number of this CRM State Senate.
	 *
	 * @param number the number of this CRM State Senate
	 */
	public void setNumber(String number);

	/**
	 * Returns the zip code of this CRM State Senate.
	 *
	 * @return the zip code of this CRM State Senate
	 */
	@AutoEscape
	public String getZipCode();

	/**
	 * Sets the zip code of this CRM State Senate.
	 *
	 * @param zipCode the zip code of this CRM State Senate
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
	public int compareTo(contact.manager.model.CrmStateSenate crmStateSenate);

	@Override
	public int hashCode();

	@Override
	public CacheModel<contact.manager.model.CrmStateSenate> toCacheModel();

	@Override
	public contact.manager.model.CrmStateSenate toEscapedModel();

	@Override
	public contact.manager.model.CrmStateSenate toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}