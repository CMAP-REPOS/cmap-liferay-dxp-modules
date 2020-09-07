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

package contact.manager.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import contact.manager.model.CrmChiWard;
import contact.manager.model.CrmChiWardModel;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the CrmChiWard service. Represents a row in the &quot;crm_chiward&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>CrmChiWardModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CrmChiWardImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmChiWardImpl
 * @generated
 */
@ProviderType
public class CrmChiWardModelImpl
	extends BaseModelImpl<CrmChiWard> implements CrmChiWardModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a CRM Chi Ward model instance should use the <code>CrmChiWard</code> interface instead.
	 */
	public static final String TABLE_NAME = "crm_chiward";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"crmChiWardId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"name", Types.VARCHAR}, {"zipCode", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("crmChiWardId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("zipCode", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table crm_chiward (uuid_ VARCHAR(75) null,crmChiWardId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(500) null,zipCode VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table crm_chiward";

	public static final String ORDER_BY_JPQL = " ORDER BY crmChiWard.name ASC";

	public static final String ORDER_BY_SQL = " ORDER BY crm_chiward.name ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		contact.manager.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.contact.manager.model.CrmChiWard"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		contact.manager.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.contact.manager.model.CrmChiWard"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		contact.manager.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.contact.manager.model.CrmChiWard"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long UUID_COLUMN_BITMASK = 4L;

	public static final long ZIPCODE_COLUMN_BITMASK = 8L;

	public static final long NAME_COLUMN_BITMASK = 16L;

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		contact.manager.service.util.ServiceProps.get(
			"lock.expiration.time.contact.manager.model.CrmChiWard"));

	public CrmChiWardModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _crmChiWardId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCrmChiWardId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmChiWardId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CrmChiWard.class;
	}

	@Override
	public String getModelClassName() {
		return CrmChiWard.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CrmChiWard, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CrmChiWard, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CrmChiWard, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((CrmChiWard)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CrmChiWard, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CrmChiWard, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CrmChiWard)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CrmChiWard, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CrmChiWard, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, CrmChiWard>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			CrmChiWard.class.getClassLoader(), CrmChiWard.class,
			ModelWrapper.class);

		try {
			Constructor<CrmChiWard> constructor =
				(Constructor<CrmChiWard>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<CrmChiWard, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<CrmChiWard, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<CrmChiWard, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<CrmChiWard, Object>>();
		Map<String, BiConsumer<CrmChiWard, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<CrmChiWard, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<CrmChiWard, Object>() {

				@Override
				public Object apply(CrmChiWard crmChiWard) {
					return crmChiWard.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<CrmChiWard, Object>() {

				@Override
				public void accept(CrmChiWard crmChiWard, Object uuid) {
					crmChiWard.setUuid((String)uuid);
				}

			});
		attributeGetterFunctions.put(
			"crmChiWardId",
			new Function<CrmChiWard, Object>() {

				@Override
				public Object apply(CrmChiWard crmChiWard) {
					return crmChiWard.getCrmChiWardId();
				}

			});
		attributeSetterBiConsumers.put(
			"crmChiWardId",
			new BiConsumer<CrmChiWard, Object>() {

				@Override
				public void accept(CrmChiWard crmChiWard, Object crmChiWardId) {
					crmChiWard.setCrmChiWardId((Long)crmChiWardId);
				}

			});
		attributeGetterFunctions.put(
			"groupId",
			new Function<CrmChiWard, Object>() {

				@Override
				public Object apply(CrmChiWard crmChiWard) {
					return crmChiWard.getGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"groupId",
			new BiConsumer<CrmChiWard, Object>() {

				@Override
				public void accept(CrmChiWard crmChiWard, Object groupId) {
					crmChiWard.setGroupId((Long)groupId);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<CrmChiWard, Object>() {

				@Override
				public Object apply(CrmChiWard crmChiWard) {
					return crmChiWard.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<CrmChiWard, Object>() {

				@Override
				public void accept(CrmChiWard crmChiWard, Object companyId) {
					crmChiWard.setCompanyId((Long)companyId);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<CrmChiWard, Object>() {

				@Override
				public Object apply(CrmChiWard crmChiWard) {
					return crmChiWard.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<CrmChiWard, Object>() {

				@Override
				public void accept(CrmChiWard crmChiWard, Object userId) {
					crmChiWard.setUserId((Long)userId);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<CrmChiWard, Object>() {

				@Override
				public Object apply(CrmChiWard crmChiWard) {
					return crmChiWard.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<CrmChiWard, Object>() {

				@Override
				public void accept(CrmChiWard crmChiWard, Object userName) {
					crmChiWard.setUserName((String)userName);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<CrmChiWard, Object>() {

				@Override
				public Object apply(CrmChiWard crmChiWard) {
					return crmChiWard.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<CrmChiWard, Object>() {

				@Override
				public void accept(CrmChiWard crmChiWard, Object createDate) {
					crmChiWard.setCreateDate((Date)createDate);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<CrmChiWard, Object>() {

				@Override
				public Object apply(CrmChiWard crmChiWard) {
					return crmChiWard.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<CrmChiWard, Object>() {

				@Override
				public void accept(CrmChiWard crmChiWard, Object modifiedDate) {
					crmChiWard.setModifiedDate((Date)modifiedDate);
				}

			});
		attributeGetterFunctions.put(
			"name",
			new Function<CrmChiWard, Object>() {

				@Override
				public Object apply(CrmChiWard crmChiWard) {
					return crmChiWard.getName();
				}

			});
		attributeSetterBiConsumers.put(
			"name",
			new BiConsumer<CrmChiWard, Object>() {

				@Override
				public void accept(CrmChiWard crmChiWard, Object name) {
					crmChiWard.setName((String)name);
				}

			});
		attributeGetterFunctions.put(
			"zipCode",
			new Function<CrmChiWard, Object>() {

				@Override
				public Object apply(CrmChiWard crmChiWard) {
					return crmChiWard.getZipCode();
				}

			});
		attributeSetterBiConsumers.put(
			"zipCode",
			new BiConsumer<CrmChiWard, Object>() {

				@Override
				public void accept(CrmChiWard crmChiWard, Object zipCode) {
					crmChiWard.setZipCode((String)zipCode);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getCrmChiWardId() {
		return _crmChiWardId;
	}

	@Override
	public void setCrmChiWardId(long crmChiWardId) {
		_crmChiWardId = crmChiWardId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
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

	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
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
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask = -1L;

		_name = name;
	}

	@Override
	public String getZipCode() {
		if (_zipCode == null) {
			return "";
		}
		else {
			return _zipCode;
		}
	}

	@Override
	public void setZipCode(String zipCode) {
		_columnBitmask |= ZIPCODE_COLUMN_BITMASK;

		if (_originalZipCode == null) {
			_originalZipCode = _zipCode;
		}

		_zipCode = zipCode;
	}

	public String getOriginalZipCode() {
		return GetterUtil.getString(_originalZipCode);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(CrmChiWard.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), CrmChiWard.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CrmChiWard toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CrmChiWard>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CrmChiWardImpl crmChiWardImpl = new CrmChiWardImpl();

		crmChiWardImpl.setUuid(getUuid());
		crmChiWardImpl.setCrmChiWardId(getCrmChiWardId());
		crmChiWardImpl.setGroupId(getGroupId());
		crmChiWardImpl.setCompanyId(getCompanyId());
		crmChiWardImpl.setUserId(getUserId());
		crmChiWardImpl.setUserName(getUserName());
		crmChiWardImpl.setCreateDate(getCreateDate());
		crmChiWardImpl.setModifiedDate(getModifiedDate());
		crmChiWardImpl.setName(getName());
		crmChiWardImpl.setZipCode(getZipCode());

		crmChiWardImpl.resetOriginalValues();

		return crmChiWardImpl;
	}

	@Override
	public int compareTo(CrmChiWard crmChiWard) {
		int value = 0;

		value = getName().compareTo(crmChiWard.getName());

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

		if (!(obj instanceof CrmChiWard)) {
			return false;
		}

		CrmChiWard crmChiWard = (CrmChiWard)obj;

		long primaryKey = crmChiWard.getPrimaryKey();

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
		CrmChiWardModelImpl crmChiWardModelImpl = this;

		crmChiWardModelImpl._originalUuid = crmChiWardModelImpl._uuid;

		crmChiWardModelImpl._originalGroupId = crmChiWardModelImpl._groupId;

		crmChiWardModelImpl._setOriginalGroupId = false;

		crmChiWardModelImpl._originalCompanyId = crmChiWardModelImpl._companyId;

		crmChiWardModelImpl._setOriginalCompanyId = false;

		crmChiWardModelImpl._setModifiedDate = false;

		crmChiWardModelImpl._originalZipCode = crmChiWardModelImpl._zipCode;

		crmChiWardModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CrmChiWard> toCacheModel() {
		CrmChiWardCacheModel crmChiWardCacheModel = new CrmChiWardCacheModel();

		crmChiWardCacheModel.uuid = getUuid();

		String uuid = crmChiWardCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			crmChiWardCacheModel.uuid = null;
		}

		crmChiWardCacheModel.crmChiWardId = getCrmChiWardId();

		crmChiWardCacheModel.groupId = getGroupId();

		crmChiWardCacheModel.companyId = getCompanyId();

		crmChiWardCacheModel.userId = getUserId();

		crmChiWardCacheModel.userName = getUserName();

		String userName = crmChiWardCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			crmChiWardCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			crmChiWardCacheModel.createDate = createDate.getTime();
		}
		else {
			crmChiWardCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			crmChiWardCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			crmChiWardCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		crmChiWardCacheModel.name = getName();

		String name = crmChiWardCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			crmChiWardCacheModel.name = null;
		}

		crmChiWardCacheModel.zipCode = getZipCode();

		String zipCode = crmChiWardCacheModel.zipCode;

		if ((zipCode != null) && (zipCode.length() == 0)) {
			crmChiWardCacheModel.zipCode = null;
		}

		return crmChiWardCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CrmChiWard, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CrmChiWard, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CrmChiWard, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((CrmChiWard)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<CrmChiWard, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<CrmChiWard, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CrmChiWard, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((CrmChiWard)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, CrmChiWard>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private long _crmChiWardId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _name;
	private String _zipCode;
	private String _originalZipCode;
	private long _columnBitmask;
	private CrmChiWard _escapedModel;

}