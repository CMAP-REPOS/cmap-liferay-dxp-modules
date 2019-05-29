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

import ucc.portal.service.persistence.CExtParticipationPK;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CExtParticipation service. Represents a row in the &quot;UCC_CExtParticipation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ucc.portal.model.impl.CExtParticipationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ucc.portal.model.impl.CExtParticipationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtParticipation
 * @see ucc.portal.model.impl.CExtParticipationImpl
 * @see ucc.portal.model.impl.CExtParticipationModelImpl
 * @generated
 */
@ProviderType
public interface CExtParticipationModel extends BaseModel<CExtParticipation>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a c ext participation model instance should use the {@link CExtParticipation} interface instead.
	 */

	/**
	 * Returns the primary key of this c ext participation.
	 *
	 * @return the primary key of this c ext participation
	 */
	public CExtParticipationPK getPrimaryKey();

	/**
	 * Sets the primary key of this c ext participation.
	 *
	 * @param primaryKey the primary key of this c ext participation
	 */
	public void setPrimaryKey(CExtParticipationPK primaryKey);

	/**
	 * Returns the organization ID of this c ext participation.
	 *
	 * @return the organization ID of this c ext participation
	 */
	public long getOrganizationId();

	/**
	 * Sets the organization ID of this c ext participation.
	 *
	 * @param organizationId the organization ID of this c ext participation
	 */
	public void setOrganizationId(long organizationId);

	/**
	 * Returns the cext participation ID of this c ext participation.
	 *
	 * @return the cext participation ID of this c ext participation
	 */
	public long getCextParticipationId();

	/**
	 * Sets the cext participation ID of this c ext participation.
	 *
	 * @param cextParticipationId the cext participation ID of this c ext participation
	 */
	public void setCextParticipationId(long cextParticipationId);

	/**
	 * Returns the company ID of this c ext participation.
	 *
	 * @return the company ID of this c ext participation
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this c ext participation.
	 *
	 * @param companyId the company ID of this c ext participation
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this c ext participation.
	 *
	 * @return the user ID of this c ext participation
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this c ext participation.
	 *
	 * @param userId the user ID of this c ext participation
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this c ext participation.
	 *
	 * @return the user uuid of this c ext participation
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this c ext participation.
	 *
	 * @param userUuid the user uuid of this c ext participation
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this c ext participation.
	 *
	 * @return the create date of this c ext participation
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this c ext participation.
	 *
	 * @param createDate the create date of this c ext participation
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this c ext participation.
	 *
	 * @return the modified date of this c ext participation
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this c ext participation.
	 *
	 * @param modifiedDate the modified date of this c ext participation
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the pp gathering ID of this c ext participation.
	 *
	 * @return the pp gathering ID of this c ext participation
	 */
	@AutoEscape
	public String getPpGatheringId();

	/**
	 * Sets the pp gathering ID of this c ext participation.
	 *
	 * @param ppGatheringId the pp gathering ID of this c ext participation
	 */
	public void setPpGatheringId(String ppGatheringId);

	/**
	 * Returns the pp gathering key of this c ext participation.
	 *
	 * @return the pp gathering key of this c ext participation
	 */
	@AutoEscape
	public String getPpGatheringKey();

	/**
	 * Sets the pp gathering key of this c ext participation.
	 *
	 * @param ppGatheringKey the pp gathering key of this c ext participation
	 */
	public void setPpGatheringKey(String ppGatheringKey);

	/**
	 * Returns the pp count of this c ext participation.
	 *
	 * @return the pp count of this c ext participation
	 */
	public int getPpCount();

	/**
	 * Sets the pp count of this c ext participation.
	 *
	 * @param ppCount the pp count of this c ext participation
	 */
	public void setPpCount(int ppCount);

	/**
	 * Returns the pp lay of this c ext participation.
	 *
	 * @return the pp lay of this c ext participation
	 */
	public boolean getPpLay();

	/**
	 * Returns <code>true</code> if this c ext participation is pp lay.
	 *
	 * @return <code>true</code> if this c ext participation is pp lay; <code>false</code> otherwise
	 */
	public boolean isPpLay();

	/**
	 * Sets whether this c ext participation is pp lay.
	 *
	 * @param ppLay the pp lay of this c ext participation
	 */
	public void setPpLay(boolean ppLay);

	/**
	 * Returns the pp pastor of this c ext participation.
	 *
	 * @return the pp pastor of this c ext participation
	 */
	public boolean getPpPastor();

	/**
	 * Returns <code>true</code> if this c ext participation is pp pastor.
	 *
	 * @return <code>true</code> if this c ext participation is pp pastor; <code>false</code> otherwise
	 */
	public boolean isPpPastor();

	/**
	 * Sets whether this c ext participation is pp pastor.
	 *
	 * @param ppPastor the pp pastor of this c ext participation
	 */
	public void setPpPastor(boolean ppPastor);

	/**
	 * Returns the pp staff of this c ext participation.
	 *
	 * @return the pp staff of this c ext participation
	 */
	public boolean getPpStaff();

	/**
	 * Returns <code>true</code> if this c ext participation is pp staff.
	 *
	 * @return <code>true</code> if this c ext participation is pp staff; <code>false</code> otherwise
	 */
	public boolean isPpStaff();

	/**
	 * Sets whether this c ext participation is pp staff.
	 *
	 * @param ppStaff the pp staff of this c ext participation
	 */
	public void setPpStaff(boolean ppStaff);

	/**
	 * Returns the pp other of this c ext participation.
	 *
	 * @return the pp other of this c ext participation
	 */
	public boolean getPpOther();

	/**
	 * Returns <code>true</code> if this c ext participation is pp other.
	 *
	 * @return <code>true</code> if this c ext participation is pp other; <code>false</code> otherwise
	 */
	public boolean isPpOther();

	/**
	 * Sets whether this c ext participation is pp other.
	 *
	 * @param ppOther the pp other of this c ext participation
	 */
	public void setPpOther(boolean ppOther);

	/**
	 * Returns the pp gathering additional key of this c ext participation.
	 *
	 * @return the pp gathering additional key of this c ext participation
	 */
	@AutoEscape
	public String getPpGatheringAdditionalKey();

	/**
	 * Sets the pp gathering additional key of this c ext participation.
	 *
	 * @param ppGatheringAdditionalKey the pp gathering additional key of this c ext participation
	 */
	public void setPpGatheringAdditionalKey(String ppGatheringAdditionalKey);

	/**
	 * Returns the pp gathering additional type of this c ext participation.
	 *
	 * @return the pp gathering additional type of this c ext participation
	 */
	@AutoEscape
	public String getPpGatheringAdditionalType();

	/**
	 * Sets the pp gathering additional type of this c ext participation.
	 *
	 * @param ppGatheringAdditionalType the pp gathering additional type of this c ext participation
	 */
	public void setPpGatheringAdditionalType(String ppGatheringAdditionalType);

	/**
	 * Returns the pp additional information of this c ext participation.
	 *
	 * @return the pp additional information of this c ext participation
	 */
	@AutoEscape
	public String getPpAdditionalInformation();

	/**
	 * Sets the pp additional information of this c ext participation.
	 *
	 * @param ppAdditionalInformation the pp additional information of this c ext participation
	 */
	public void setPpAdditionalInformation(String ppAdditionalInformation);

	/**
	 * Returns the pp priority of this c ext participation.
	 *
	 * @return the pp priority of this c ext participation
	 */
	public double getPpPriority();

	/**
	 * Sets the pp priority of this c ext participation.
	 *
	 * @param ppPriority the pp priority of this c ext participation
	 */
	public void setPpPriority(double ppPriority);

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
	public int compareTo(CExtParticipation cExtParticipation);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CExtParticipation> toCacheModel();

	@Override
	public CExtParticipation toEscapedModel();

	@Override
	public CExtParticipation toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}