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

package ucc.portal.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import ucc.portal.model.ExtKeyAccomplishment;
import ucc.portal.model.ExtKeyAccomplishmentModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ExtKeyAccomplishment service. Represents a row in the &quot;UCC_ExtKeyAccomplishment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ExtKeyAccomplishmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ExtKeyAccomplishmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtKeyAccomplishmentImpl
 * @see ExtKeyAccomplishment
 * @see ExtKeyAccomplishmentModel
 * @generated
 */
@ProviderType
public class ExtKeyAccomplishmentModelImpl extends BaseModelImpl<ExtKeyAccomplishment>
	implements ExtKeyAccomplishmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ext key accomplishment model instance should use the {@link ExtKeyAccomplishment} interface instead.
	 */
	public static final String TABLE_NAME = "UCC_ExtKeyAccomplishment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "extKeyAccomplishmentId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "locationOrSetting", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "priority", Types.DOUBLE }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("extKeyAccomplishmentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("locationOrSetting", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("priority", Types.DOUBLE);
	}

	public static final String TABLE_SQL_CREATE = "create table UCC_ExtKeyAccomplishment (extKeyAccomplishmentId LONG not null primary key,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,locationOrSetting VARCHAR(75) null,description VARCHAR(75) null,priority DOUBLE)";
	public static final String TABLE_SQL_DROP = "drop table UCC_ExtKeyAccomplishment";
	public static final String ORDER_BY_JPQL = " ORDER BY extKeyAccomplishment.priority DESC";
	public static final String ORDER_BY_SQL = " ORDER BY UCC_ExtKeyAccomplishment.priority DESC";
	public static final String DATA_SOURCE = "extDataSource";
	public static final String SESSION_FACTORY = "extSessionFactory";
	public static final String TX_MANAGER = "extTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(ucc.portal.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.ucc.portal.model.ExtKeyAccomplishment"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(ucc.portal.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.ucc.portal.model.ExtKeyAccomplishment"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(ucc.portal.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.ucc.portal.model.ExtKeyAccomplishment"),
			true);
	public static final long USERID_COLUMN_BITMASK = 1L;
	public static final long PRIORITY_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(ucc.portal.service.util.ServiceProps.get(
				"lock.expiration.time.ucc.portal.model.ExtKeyAccomplishment"));

	public ExtKeyAccomplishmentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _extKeyAccomplishmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setExtKeyAccomplishmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _extKeyAccomplishmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ExtKeyAccomplishment.class;
	}

	@Override
	public String getModelClassName() {
		return ExtKeyAccomplishment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("extKeyAccomplishmentId", getExtKeyAccomplishmentId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("locationOrSetting", getLocationOrSetting());
		attributes.put("description", getDescription());
		attributes.put("priority", getPriority());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long extKeyAccomplishmentId = (Long)attributes.get(
				"extKeyAccomplishmentId");

		if (extKeyAccomplishmentId != null) {
			setExtKeyAccomplishmentId(extKeyAccomplishmentId);
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

		String locationOrSetting = (String)attributes.get("locationOrSetting");

		if (locationOrSetting != null) {
			setLocationOrSetting(locationOrSetting);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Double priority = (Double)attributes.get("priority");

		if (priority != null) {
			setPriority(priority);
		}
	}

	@Override
	public long getExtKeyAccomplishmentId() {
		return _extKeyAccomplishmentId;
	}

	@Override
	public void setExtKeyAccomplishmentId(long extKeyAccomplishmentId) {
		_extKeyAccomplishmentId = extKeyAccomplishmentId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public String getLocationOrSetting() {
		if (_locationOrSetting == null) {
			return "";
		}
		else {
			return _locationOrSetting;
		}
	}

	@Override
	public void setLocationOrSetting(String locationOrSetting) {
		_locationOrSetting = locationOrSetting;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return "";
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public double getPriority() {
		return _priority;
	}

	@Override
	public void setPriority(double priority) {
		_columnBitmask = -1L;

		_priority = priority;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			ExtKeyAccomplishment.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ExtKeyAccomplishment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ExtKeyAccomplishment)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ExtKeyAccomplishmentImpl extKeyAccomplishmentImpl = new ExtKeyAccomplishmentImpl();

		extKeyAccomplishmentImpl.setExtKeyAccomplishmentId(getExtKeyAccomplishmentId());
		extKeyAccomplishmentImpl.setCompanyId(getCompanyId());
		extKeyAccomplishmentImpl.setUserId(getUserId());
		extKeyAccomplishmentImpl.setCreateDate(getCreateDate());
		extKeyAccomplishmentImpl.setModifiedDate(getModifiedDate());
		extKeyAccomplishmentImpl.setLocationOrSetting(getLocationOrSetting());
		extKeyAccomplishmentImpl.setDescription(getDescription());
		extKeyAccomplishmentImpl.setPriority(getPriority());

		extKeyAccomplishmentImpl.resetOriginalValues();

		return extKeyAccomplishmentImpl;
	}

	@Override
	public int compareTo(ExtKeyAccomplishment extKeyAccomplishment) {
		int value = 0;

		if (getPriority() < extKeyAccomplishment.getPriority()) {
			value = -1;
		}
		else if (getPriority() > extKeyAccomplishment.getPriority()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtKeyAccomplishment)) {
			return false;
		}

		ExtKeyAccomplishment extKeyAccomplishment = (ExtKeyAccomplishment)obj;

		long primaryKey = extKeyAccomplishment.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		ExtKeyAccomplishmentModelImpl extKeyAccomplishmentModelImpl = this;

		extKeyAccomplishmentModelImpl._originalUserId = extKeyAccomplishmentModelImpl._userId;

		extKeyAccomplishmentModelImpl._setOriginalUserId = false;

		extKeyAccomplishmentModelImpl._setModifiedDate = false;

		extKeyAccomplishmentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ExtKeyAccomplishment> toCacheModel() {
		ExtKeyAccomplishmentCacheModel extKeyAccomplishmentCacheModel = new ExtKeyAccomplishmentCacheModel();

		extKeyAccomplishmentCacheModel.extKeyAccomplishmentId = getExtKeyAccomplishmentId();

		extKeyAccomplishmentCacheModel.companyId = getCompanyId();

		extKeyAccomplishmentCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			extKeyAccomplishmentCacheModel.createDate = createDate.getTime();
		}
		else {
			extKeyAccomplishmentCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			extKeyAccomplishmentCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			extKeyAccomplishmentCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		extKeyAccomplishmentCacheModel.locationOrSetting = getLocationOrSetting();

		String locationOrSetting = extKeyAccomplishmentCacheModel.locationOrSetting;

		if ((locationOrSetting != null) && (locationOrSetting.length() == 0)) {
			extKeyAccomplishmentCacheModel.locationOrSetting = null;
		}

		extKeyAccomplishmentCacheModel.description = getDescription();

		String description = extKeyAccomplishmentCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			extKeyAccomplishmentCacheModel.description = null;
		}

		extKeyAccomplishmentCacheModel.priority = getPriority();

		return extKeyAccomplishmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{extKeyAccomplishmentId=");
		sb.append(getExtKeyAccomplishmentId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", locationOrSetting=");
		sb.append(getLocationOrSetting());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", priority=");
		sb.append(getPriority());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("ucc.portal.model.ExtKeyAccomplishment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>extKeyAccomplishmentId</column-name><column-value><![CDATA[");
		sb.append(getExtKeyAccomplishmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locationOrSetting</column-name><column-value><![CDATA[");
		sb.append(getLocationOrSetting());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>priority</column-name><column-value><![CDATA[");
		sb.append(getPriority());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = ExtKeyAccomplishment.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			ExtKeyAccomplishment.class, ModelWrapper.class
		};
	private long _extKeyAccomplishmentId;
	private long _companyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _locationOrSetting;
	private String _description;
	private double _priority;
	private long _columnBitmask;
	private ExtKeyAccomplishment _escapedModel;
}