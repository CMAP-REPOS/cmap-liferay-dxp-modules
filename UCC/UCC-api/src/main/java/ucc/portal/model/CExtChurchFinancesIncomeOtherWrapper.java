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
 * This class is a wrapper for {@link CExtChurchFinancesIncomeOther}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtChurchFinancesIncomeOther
 * @generated
 */
@ProviderType
public class CExtChurchFinancesIncomeOtherWrapper
	implements CExtChurchFinancesIncomeOther,
		ModelWrapper<CExtChurchFinancesIncomeOther> {
	public CExtChurchFinancesIncomeOtherWrapper(
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther) {
		_cExtChurchFinancesIncomeOther = cExtChurchFinancesIncomeOther;
	}

	@Override
	public Class<?> getModelClass() {
		return CExtChurchFinancesIncomeOther.class;
	}

	@Override
	public String getModelClassName() {
		return CExtChurchFinancesIncomeOther.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organizationId", getOrganizationId());
		attributes.put("cextChurchFinancesIncomeOtherId",
			getCextChurchFinancesIncomeOtherId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fnIncomeOther", getFnIncomeOther());
		attributes.put("fnIncomeOtherDescription", getFnIncomeOtherDescription());
		attributes.put("fnPriority", getFnPriority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long cextChurchFinancesIncomeOtherId = (Long)attributes.get(
				"cextChurchFinancesIncomeOtherId");

		if (cextChurchFinancesIncomeOtherId != null) {
			setCextChurchFinancesIncomeOtherId(cextChurchFinancesIncomeOtherId);
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

		Integer fnIncomeOther = (Integer)attributes.get("fnIncomeOther");

		if (fnIncomeOther != null) {
			setFnIncomeOther(fnIncomeOther);
		}

		String fnIncomeOtherDescription = (String)attributes.get(
				"fnIncomeOtherDescription");

		if (fnIncomeOtherDescription != null) {
			setFnIncomeOtherDescription(fnIncomeOtherDescription);
		}

		Double fnPriority = (Double)attributes.get("fnPriority");

		if (fnPriority != null) {
			setFnPriority(fnPriority);
		}
	}

	@Override
	public Object clone() {
		return new CExtChurchFinancesIncomeOtherWrapper((CExtChurchFinancesIncomeOther)_cExtChurchFinancesIncomeOther.clone());
	}

	@Override
	public int compareTo(
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther) {
		return _cExtChurchFinancesIncomeOther.compareTo(cExtChurchFinancesIncomeOther);
	}

	/**
	* Returns the cext church finances income other ID of this c ext church finances income other.
	*
	* @return the cext church finances income other ID of this c ext church finances income other
	*/
	@Override
	public long getCextChurchFinancesIncomeOtherId() {
		return _cExtChurchFinancesIncomeOther.getCextChurchFinancesIncomeOtherId();
	}

	/**
	* Returns the company ID of this c ext church finances income other.
	*
	* @return the company ID of this c ext church finances income other
	*/
	@Override
	public long getCompanyId() {
		return _cExtChurchFinancesIncomeOther.getCompanyId();
	}

	/**
	* Returns the create date of this c ext church finances income other.
	*
	* @return the create date of this c ext church finances income other
	*/
	@Override
	public Date getCreateDate() {
		return _cExtChurchFinancesIncomeOther.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cExtChurchFinancesIncomeOther.getExpandoBridge();
	}

	/**
	* Returns the fn income other of this c ext church finances income other.
	*
	* @return the fn income other of this c ext church finances income other
	*/
	@Override
	public int getFnIncomeOther() {
		return _cExtChurchFinancesIncomeOther.getFnIncomeOther();
	}

	/**
	* Returns the fn income other description of this c ext church finances income other.
	*
	* @return the fn income other description of this c ext church finances income other
	*/
	@Override
	public String getFnIncomeOtherDescription() {
		return _cExtChurchFinancesIncomeOther.getFnIncomeOtherDescription();
	}

	/**
	* Returns the fn priority of this c ext church finances income other.
	*
	* @return the fn priority of this c ext church finances income other
	*/
	@Override
	public double getFnPriority() {
		return _cExtChurchFinancesIncomeOther.getFnPriority();
	}

	/**
	* Returns the modified date of this c ext church finances income other.
	*
	* @return the modified date of this c ext church finances income other
	*/
	@Override
	public Date getModifiedDate() {
		return _cExtChurchFinancesIncomeOther.getModifiedDate();
	}

	/**
	* Returns the organization ID of this c ext church finances income other.
	*
	* @return the organization ID of this c ext church finances income other
	*/
	@Override
	public long getOrganizationId() {
		return _cExtChurchFinancesIncomeOther.getOrganizationId();
	}

	/**
	* Returns the primary key of this c ext church finances income other.
	*
	* @return the primary key of this c ext church finances income other
	*/
	@Override
	public ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK getPrimaryKey() {
		return _cExtChurchFinancesIncomeOther.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cExtChurchFinancesIncomeOther.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this c ext church finances income other.
	*
	* @return the user ID of this c ext church finances income other
	*/
	@Override
	public long getUserId() {
		return _cExtChurchFinancesIncomeOther.getUserId();
	}

	/**
	* Returns the user uuid of this c ext church finances income other.
	*
	* @return the user uuid of this c ext church finances income other
	*/
	@Override
	public String getUserUuid() {
		return _cExtChurchFinancesIncomeOther.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _cExtChurchFinancesIncomeOther.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _cExtChurchFinancesIncomeOther.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cExtChurchFinancesIncomeOther.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cExtChurchFinancesIncomeOther.isNew();
	}

	@Override
	public void persist() {
		_cExtChurchFinancesIncomeOther.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cExtChurchFinancesIncomeOther.setCachedModel(cachedModel);
	}

	/**
	* Sets the cext church finances income other ID of this c ext church finances income other.
	*
	* @param cextChurchFinancesIncomeOtherId the cext church finances income other ID of this c ext church finances income other
	*/
	@Override
	public void setCextChurchFinancesIncomeOtherId(
		long cextChurchFinancesIncomeOtherId) {
		_cExtChurchFinancesIncomeOther.setCextChurchFinancesIncomeOtherId(cextChurchFinancesIncomeOtherId);
	}

	/**
	* Sets the company ID of this c ext church finances income other.
	*
	* @param companyId the company ID of this c ext church finances income other
	*/
	@Override
	public void setCompanyId(long companyId) {
		_cExtChurchFinancesIncomeOther.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this c ext church finances income other.
	*
	* @param createDate the create date of this c ext church finances income other
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_cExtChurchFinancesIncomeOther.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cExtChurchFinancesIncomeOther.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cExtChurchFinancesIncomeOther.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cExtChurchFinancesIncomeOther.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fn income other of this c ext church finances income other.
	*
	* @param fnIncomeOther the fn income other of this c ext church finances income other
	*/
	@Override
	public void setFnIncomeOther(int fnIncomeOther) {
		_cExtChurchFinancesIncomeOther.setFnIncomeOther(fnIncomeOther);
	}

	/**
	* Sets the fn income other description of this c ext church finances income other.
	*
	* @param fnIncomeOtherDescription the fn income other description of this c ext church finances income other
	*/
	@Override
	public void setFnIncomeOtherDescription(String fnIncomeOtherDescription) {
		_cExtChurchFinancesIncomeOther.setFnIncomeOtherDescription(fnIncomeOtherDescription);
	}

	/**
	* Sets the fn priority of this c ext church finances income other.
	*
	* @param fnPriority the fn priority of this c ext church finances income other
	*/
	@Override
	public void setFnPriority(double fnPriority) {
		_cExtChurchFinancesIncomeOther.setFnPriority(fnPriority);
	}

	/**
	* Sets the modified date of this c ext church finances income other.
	*
	* @param modifiedDate the modified date of this c ext church finances income other
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_cExtChurchFinancesIncomeOther.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_cExtChurchFinancesIncomeOther.setNew(n);
	}

	/**
	* Sets the organization ID of this c ext church finances income other.
	*
	* @param organizationId the organization ID of this c ext church finances income other
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_cExtChurchFinancesIncomeOther.setOrganizationId(organizationId);
	}

	/**
	* Sets the primary key of this c ext church finances income other.
	*
	* @param primaryKey the primary key of this c ext church finances income other
	*/
	@Override
	public void setPrimaryKey(
		ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK primaryKey) {
		_cExtChurchFinancesIncomeOther.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cExtChurchFinancesIncomeOther.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this c ext church finances income other.
	*
	* @param userId the user ID of this c ext church finances income other
	*/
	@Override
	public void setUserId(long userId) {
		_cExtChurchFinancesIncomeOther.setUserId(userId);
	}

	/**
	* Sets the user uuid of this c ext church finances income other.
	*
	* @param userUuid the user uuid of this c ext church finances income other
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_cExtChurchFinancesIncomeOther.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CExtChurchFinancesIncomeOther> toCacheModel() {
		return _cExtChurchFinancesIncomeOther.toCacheModel();
	}

	@Override
	public CExtChurchFinancesIncomeOther toEscapedModel() {
		return new CExtChurchFinancesIncomeOtherWrapper(_cExtChurchFinancesIncomeOther.toEscapedModel());
	}

	@Override
	public String toString() {
		return _cExtChurchFinancesIncomeOther.toString();
	}

	@Override
	public CExtChurchFinancesIncomeOther toUnescapedModel() {
		return new CExtChurchFinancesIncomeOtherWrapper(_cExtChurchFinancesIncomeOther.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _cExtChurchFinancesIncomeOther.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtChurchFinancesIncomeOtherWrapper)) {
			return false;
		}

		CExtChurchFinancesIncomeOtherWrapper cExtChurchFinancesIncomeOtherWrapper =
			(CExtChurchFinancesIncomeOtherWrapper)obj;

		if (Objects.equals(_cExtChurchFinancesIncomeOther,
					cExtChurchFinancesIncomeOtherWrapper._cExtChurchFinancesIncomeOther)) {
			return true;
		}

		return false;
	}

	@Override
	public CExtChurchFinancesIncomeOther getWrappedModel() {
		return _cExtChurchFinancesIncomeOther;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cExtChurchFinancesIncomeOther.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cExtChurchFinancesIncomeOther.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cExtChurchFinancesIncomeOther.resetOriginalValues();
	}

	private final CExtChurchFinancesIncomeOther _cExtChurchFinancesIncomeOther;
}