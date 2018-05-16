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

package contact.manager.service.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import contact.manager.service.model.County_Commissioner_or_Board_Dist;
import contact.manager.service.model.County_Commissioner_or_Board_DistModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the County_Commissioner_or_Board_Dist service. Represents a row in the &quot;contactmanager_County_Commissioner_or_Board_Dist&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link County_Commissioner_or_Board_DistModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link County_Commissioner_or_Board_DistImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see County_Commissioner_or_Board_DistImpl
 * @see County_Commissioner_or_Board_Dist
 * @see County_Commissioner_or_Board_DistModel
 * @generated
 */
@ProviderType
public class County_Commissioner_or_Board_DistModelImpl extends BaseModelImpl<County_Commissioner_or_Board_Dist>
	implements County_Commissioner_or_Board_DistModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a county_ commissioner_or_ board_ dist model instance should use the {@link County_Commissioner_or_Board_Dist} interface instead.
	 */
	public static final String TABLE_NAME = "contactmanager_County_Commissioner_or_Board_Dist";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ccbdId", Types.BIGINT },
			{ "ccbdNumber", Types.INTEGER },
			{ "ccbdName", Types.VARCHAR },
			{ "zipCode", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("ccbdId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("ccbdNumber", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("ccbdName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("zipCode", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table contactmanager_County_Commissioner_or_Board_Dist (ccbdId LONG not null primary key,ccbdNumber INTEGER,ccbdName VARCHAR(75) null,zipCode VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table contactmanager_County_Commissioner_or_Board_Dist";
	public static final String ORDER_BY_JPQL = " ORDER BY county_Commissioner_or_Board_Dist.ccbdName ASC, county_Commissioner_or_Board_Dist.ccbdNumber ASC";
	public static final String ORDER_BY_SQL = " ORDER BY contactmanager_County_Commissioner_or_Board_Dist.ccbdName ASC, contactmanager_County_Commissioner_or_Board_Dist.ccbdNumber ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.contact.manager.service.model.County_Commissioner_or_Board_Dist"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.contact.manager.service.model.County_Commissioner_or_Board_Dist"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(contact.manager.service.service.util.ServiceProps.get(
				"lock.expiration.time.contact.manager.service.model.County_Commissioner_or_Board_Dist"));

	public County_Commissioner_or_Board_DistModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _ccbdId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCcbdId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ccbdId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return County_Commissioner_or_Board_Dist.class;
	}

	@Override
	public String getModelClassName() {
		return County_Commissioner_or_Board_Dist.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ccbdId", getCcbdId());
		attributes.put("ccbdNumber", getCcbdNumber());
		attributes.put("ccbdName", getCcbdName());
		attributes.put("zipCode", getZipCode());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ccbdId = (Long)attributes.get("ccbdId");

		if (ccbdId != null) {
			setCcbdId(ccbdId);
		}

		Integer ccbdNumber = (Integer)attributes.get("ccbdNumber");

		if (ccbdNumber != null) {
			setCcbdNumber(ccbdNumber);
		}

		String ccbdName = (String)attributes.get("ccbdName");

		if (ccbdName != null) {
			setCcbdName(ccbdName);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@Override
	public long getCcbdId() {
		return _ccbdId;
	}

	@Override
	public void setCcbdId(long ccbdId) {
		_ccbdId = ccbdId;
	}

	@Override
	public int getCcbdNumber() {
		return _ccbdNumber;
	}

	@Override
	public void setCcbdNumber(int ccbdNumber) {
		_ccbdNumber = ccbdNumber;
	}

	@Override
	public String getCcbdName() {
		if (_ccbdName == null) {
			return StringPool.BLANK;
		}
		else {
			return _ccbdName;
		}
	}

	@Override
	public void setCcbdName(String ccbdName) {
		_ccbdName = ccbdName;
	}

	@Override
	public String getZipCode() {
		if (_zipCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _zipCode;
		}
	}

	@Override
	public void setZipCode(String zipCode) {
		_zipCode = zipCode;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			County_Commissioner_or_Board_Dist.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public County_Commissioner_or_Board_Dist toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (County_Commissioner_or_Board_Dist)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		County_Commissioner_or_Board_DistImpl county_Commissioner_or_Board_DistImpl =
			new County_Commissioner_or_Board_DistImpl();

		county_Commissioner_or_Board_DistImpl.setCcbdId(getCcbdId());
		county_Commissioner_or_Board_DistImpl.setCcbdNumber(getCcbdNumber());
		county_Commissioner_or_Board_DistImpl.setCcbdName(getCcbdName());
		county_Commissioner_or_Board_DistImpl.setZipCode(getZipCode());

		county_Commissioner_or_Board_DistImpl.resetOriginalValues();

		return county_Commissioner_or_Board_DistImpl;
	}

	@Override
	public int compareTo(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		int value = 0;

		value = getCcbdName()
					.compareTo(county_Commissioner_or_Board_Dist.getCcbdName());

		if (value != 0) {
			return value;
		}

		if (getCcbdNumber() < county_Commissioner_or_Board_Dist.getCcbdNumber()) {
			value = -1;
		}
		else if (getCcbdNumber() > county_Commissioner_or_Board_Dist.getCcbdNumber()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof County_Commissioner_or_Board_Dist)) {
			return false;
		}

		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist = (County_Commissioner_or_Board_Dist)obj;

		long primaryKey = county_Commissioner_or_Board_Dist.getPrimaryKey();

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
	}

	@Override
	public CacheModel<County_Commissioner_or_Board_Dist> toCacheModel() {
		County_Commissioner_or_Board_DistCacheModel county_Commissioner_or_Board_DistCacheModel =
			new County_Commissioner_or_Board_DistCacheModel();

		county_Commissioner_or_Board_DistCacheModel.ccbdId = getCcbdId();

		county_Commissioner_or_Board_DistCacheModel.ccbdNumber = getCcbdNumber();

		county_Commissioner_or_Board_DistCacheModel.ccbdName = getCcbdName();

		String ccbdName = county_Commissioner_or_Board_DistCacheModel.ccbdName;

		if ((ccbdName != null) && (ccbdName.length() == 0)) {
			county_Commissioner_or_Board_DistCacheModel.ccbdName = null;
		}

		county_Commissioner_or_Board_DistCacheModel.zipCode = getZipCode();

		String zipCode = county_Commissioner_or_Board_DistCacheModel.zipCode;

		if ((zipCode != null) && (zipCode.length() == 0)) {
			county_Commissioner_or_Board_DistCacheModel.zipCode = null;
		}

		return county_Commissioner_or_Board_DistCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{ccbdId=");
		sb.append(getCcbdId());
		sb.append(", ccbdNumber=");
		sb.append(getCcbdNumber());
		sb.append(", ccbdName=");
		sb.append(getCcbdName());
		sb.append(", zipCode=");
		sb.append(getZipCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append(
			"contact.manager.service.model.County_Commissioner_or_Board_Dist");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ccbdId</column-name><column-value><![CDATA[");
		sb.append(getCcbdId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccbdNumber</column-name><column-value><![CDATA[");
		sb.append(getCcbdNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccbdName</column-name><column-value><![CDATA[");
		sb.append(getCcbdName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zipCode</column-name><column-value><![CDATA[");
		sb.append(getZipCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = County_Commissioner_or_Board_Dist.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			County_Commissioner_or_Board_Dist.class
		};
	private long _ccbdId;
	private int _ccbdNumber;
	private String _ccbdName;
	private String _zipCode;
	private County_Commissioner_or_Board_Dist _escapedModel;
}