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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CExtRealEstateCampaign}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtRealEstateCampaign
 * @generated
 */
@ProviderType
public class CExtRealEstateCampaignWrapper implements CExtRealEstateCampaign,
	ModelWrapper<CExtRealEstateCampaign> {
	public CExtRealEstateCampaignWrapper(
		CExtRealEstateCampaign cExtRealEstateCampaign) {
		_cExtRealEstateCampaign = cExtRealEstateCampaign;
	}

	@Override
	public Class<?> getModelClass() {
		return CExtRealEstateCampaign.class;
	}

	@Override
	public String getModelClassName() {
		return CExtRealEstateCampaign.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organizationId", getOrganizationId());
		attributes.put("cextRealEstateCampaignId", getCextRealEstateCampaignId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("reYear", getReYear());
		attributes.put("reUnderwayAnticipated", isReUnderwayAnticipated());
		attributes.put("reGoal", getReGoal());
		attributes.put("reResult", getReResult());
		attributes.put("rePurpose", getRePurpose());
		attributes.put("reImpact", getReImpact());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long cextRealEstateCampaignId = (Long)attributes.get(
				"cextRealEstateCampaignId");

		if (cextRealEstateCampaignId != null) {
			setCextRealEstateCampaignId(cextRealEstateCampaignId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer reYear = (Integer)attributes.get("reYear");

		if (reYear != null) {
			setReYear(reYear);
		}

		Boolean reUnderwayAnticipated = (Boolean)attributes.get(
				"reUnderwayAnticipated");

		if (reUnderwayAnticipated != null) {
			setReUnderwayAnticipated(reUnderwayAnticipated);
		}

		Integer reGoal = (Integer)attributes.get("reGoal");

		if (reGoal != null) {
			setReGoal(reGoal);
		}

		Integer reResult = (Integer)attributes.get("reResult");

		if (reResult != null) {
			setReResult(reResult);
		}

		String rePurpose = (String)attributes.get("rePurpose");

		if (rePurpose != null) {
			setRePurpose(rePurpose);
		}

		String reImpact = (String)attributes.get("reImpact");

		if (reImpact != null) {
			setReImpact(reImpact);
		}
	}

	@Override
	public Object clone() {
		return new CExtRealEstateCampaignWrapper((CExtRealEstateCampaign)_cExtRealEstateCampaign.clone());
	}

	@Override
	public int compareTo(CExtRealEstateCampaign cExtRealEstateCampaign) {
		return _cExtRealEstateCampaign.compareTo(cExtRealEstateCampaign);
	}

	/**
	* Returns the cext real estate campaign ID of this c ext real estate campaign.
	*
	* @return the cext real estate campaign ID of this c ext real estate campaign
	*/
	@Override
	public long getCextRealEstateCampaignId() {
		return _cExtRealEstateCampaign.getCextRealEstateCampaignId();
	}

	/**
	* Returns the company ID of this c ext real estate campaign.
	*
	* @return the company ID of this c ext real estate campaign
	*/
	@Override
	public long getCompanyId() {
		return _cExtRealEstateCampaign.getCompanyId();
	}

	/**
	* Returns the create date of this c ext real estate campaign.
	*
	* @return the create date of this c ext real estate campaign
	*/
	@Override
	public Date getCreateDate() {
		return _cExtRealEstateCampaign.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cExtRealEstateCampaign.getExpandoBridge();
	}

	/**
	* Returns the modified date of this c ext real estate campaign.
	*
	* @return the modified date of this c ext real estate campaign
	*/
	@Override
	public Date getModifiedDate() {
		return _cExtRealEstateCampaign.getModifiedDate();
	}

	/**
	* Returns the organization ID of this c ext real estate campaign.
	*
	* @return the organization ID of this c ext real estate campaign
	*/
	@Override
	public long getOrganizationId() {
		return _cExtRealEstateCampaign.getOrganizationId();
	}

	/**
	* Returns the primary key of this c ext real estate campaign.
	*
	* @return the primary key of this c ext real estate campaign
	*/
	@Override
	public ucc.portal.service.persistence.CExtRealEstateCampaignPK getPrimaryKey() {
		return _cExtRealEstateCampaign.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cExtRealEstateCampaign.getPrimaryKeyObj();
	}

	/**
	* Returns the re goal of this c ext real estate campaign.
	*
	* @return the re goal of this c ext real estate campaign
	*/
	@Override
	public int getReGoal() {
		return _cExtRealEstateCampaign.getReGoal();
	}

	/**
	* Returns the re impact of this c ext real estate campaign.
	*
	* @return the re impact of this c ext real estate campaign
	*/
	@Override
	public String getReImpact() {
		return _cExtRealEstateCampaign.getReImpact();
	}

	/**
	* Returns the re purpose of this c ext real estate campaign.
	*
	* @return the re purpose of this c ext real estate campaign
	*/
	@Override
	public String getRePurpose() {
		return _cExtRealEstateCampaign.getRePurpose();
	}

	/**
	* Returns the re result of this c ext real estate campaign.
	*
	* @return the re result of this c ext real estate campaign
	*/
	@Override
	public int getReResult() {
		return _cExtRealEstateCampaign.getReResult();
	}

	/**
	* Returns the re underway anticipated of this c ext real estate campaign.
	*
	* @return the re underway anticipated of this c ext real estate campaign
	*/
	@Override
	public boolean getReUnderwayAnticipated() {
		return _cExtRealEstateCampaign.getReUnderwayAnticipated();
	}

	/**
	* Returns the re year of this c ext real estate campaign.
	*
	* @return the re year of this c ext real estate campaign
	*/
	@Override
	public int getReYear() {
		return _cExtRealEstateCampaign.getReYear();
	}

	/**
	* Returns the user ID of this c ext real estate campaign.
	*
	* @return the user ID of this c ext real estate campaign
	*/
	@Override
	public long getUserId() {
		return _cExtRealEstateCampaign.getUserId();
	}

	/**
	* Returns the user uuid of this c ext real estate campaign.
	*
	* @return the user uuid of this c ext real estate campaign
	*/
	@Override
	public String getUserUuid() {
		return _cExtRealEstateCampaign.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _cExtRealEstateCampaign.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _cExtRealEstateCampaign.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cExtRealEstateCampaign.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cExtRealEstateCampaign.isNew();
	}

	/**
	* Returns <code>true</code> if this c ext real estate campaign is re underway anticipated.
	*
	* @return <code>true</code> if this c ext real estate campaign is re underway anticipated; <code>false</code> otherwise
	*/
	@Override
	public boolean isReUnderwayAnticipated() {
		return _cExtRealEstateCampaign.isReUnderwayAnticipated();
	}

	@Override
	public void persist() {
		_cExtRealEstateCampaign.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cExtRealEstateCampaign.setCachedModel(cachedModel);
	}

	/**
	* Sets the cext real estate campaign ID of this c ext real estate campaign.
	*
	* @param cextRealEstateCampaignId the cext real estate campaign ID of this c ext real estate campaign
	*/
	@Override
	public void setCextRealEstateCampaignId(long cextRealEstateCampaignId) {
		_cExtRealEstateCampaign.setCextRealEstateCampaignId(cextRealEstateCampaignId);
	}

	/**
	* Sets the company ID of this c ext real estate campaign.
	*
	* @param companyId the company ID of this c ext real estate campaign
	*/
	@Override
	public void setCompanyId(long companyId) {
		_cExtRealEstateCampaign.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this c ext real estate campaign.
	*
	* @param createDate the create date of this c ext real estate campaign
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_cExtRealEstateCampaign.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cExtRealEstateCampaign.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cExtRealEstateCampaign.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cExtRealEstateCampaign.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this c ext real estate campaign.
	*
	* @param modifiedDate the modified date of this c ext real estate campaign
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_cExtRealEstateCampaign.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_cExtRealEstateCampaign.setNew(n);
	}

	/**
	* Sets the organization ID of this c ext real estate campaign.
	*
	* @param organizationId the organization ID of this c ext real estate campaign
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_cExtRealEstateCampaign.setOrganizationId(organizationId);
	}

	/**
	* Sets the primary key of this c ext real estate campaign.
	*
	* @param primaryKey the primary key of this c ext real estate campaign
	*/
	@Override
	public void setPrimaryKey(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK primaryKey) {
		_cExtRealEstateCampaign.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cExtRealEstateCampaign.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the re goal of this c ext real estate campaign.
	*
	* @param reGoal the re goal of this c ext real estate campaign
	*/
	@Override
	public void setReGoal(int reGoal) {
		_cExtRealEstateCampaign.setReGoal(reGoal);
	}

	/**
	* Sets the re impact of this c ext real estate campaign.
	*
	* @param reImpact the re impact of this c ext real estate campaign
	*/
	@Override
	public void setReImpact(String reImpact) {
		_cExtRealEstateCampaign.setReImpact(reImpact);
	}

	/**
	* Sets the re purpose of this c ext real estate campaign.
	*
	* @param rePurpose the re purpose of this c ext real estate campaign
	*/
	@Override
	public void setRePurpose(String rePurpose) {
		_cExtRealEstateCampaign.setRePurpose(rePurpose);
	}

	/**
	* Sets the re result of this c ext real estate campaign.
	*
	* @param reResult the re result of this c ext real estate campaign
	*/
	@Override
	public void setReResult(int reResult) {
		_cExtRealEstateCampaign.setReResult(reResult);
	}

	/**
	* Sets whether this c ext real estate campaign is re underway anticipated.
	*
	* @param reUnderwayAnticipated the re underway anticipated of this c ext real estate campaign
	*/
	@Override
	public void setReUnderwayAnticipated(boolean reUnderwayAnticipated) {
		_cExtRealEstateCampaign.setReUnderwayAnticipated(reUnderwayAnticipated);
	}

	/**
	* Sets the re year of this c ext real estate campaign.
	*
	* @param reYear the re year of this c ext real estate campaign
	*/
	@Override
	public void setReYear(int reYear) {
		_cExtRealEstateCampaign.setReYear(reYear);
	}

	/**
	* Sets the user ID of this c ext real estate campaign.
	*
	* @param userId the user ID of this c ext real estate campaign
	*/
	@Override
	public void setUserId(long userId) {
		_cExtRealEstateCampaign.setUserId(userId);
	}

	/**
	* Sets the user uuid of this c ext real estate campaign.
	*
	* @param userUuid the user uuid of this c ext real estate campaign
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_cExtRealEstateCampaign.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CExtRealEstateCampaign> toCacheModel() {
		return _cExtRealEstateCampaign.toCacheModel();
	}

	@Override
	public CExtRealEstateCampaign toEscapedModel() {
		return new CExtRealEstateCampaignWrapper(_cExtRealEstateCampaign.toEscapedModel());
	}

	@Override
	public String toString() {
		return _cExtRealEstateCampaign.toString();
	}

	@Override
	public CExtRealEstateCampaign toUnescapedModel() {
		return new CExtRealEstateCampaignWrapper(_cExtRealEstateCampaign.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _cExtRealEstateCampaign.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtRealEstateCampaignWrapper)) {
			return false;
		}

		CExtRealEstateCampaignWrapper cExtRealEstateCampaignWrapper = (CExtRealEstateCampaignWrapper)obj;

		if (Objects.equals(_cExtRealEstateCampaign,
					cExtRealEstateCampaignWrapper._cExtRealEstateCampaign)) {
			return true;
		}

		return false;
	}

	@Override
	public CExtRealEstateCampaign getWrappedModel() {
		return _cExtRealEstateCampaign;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cExtRealEstateCampaign.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cExtRealEstateCampaign.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cExtRealEstateCampaign.resetOriginalValues();
	}

	private final CExtRealEstateCampaign _cExtRealEstateCampaign;
}