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
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import contact.manager.model.CrmChiWard;
import contact.manager.model.CrmChiWardModel;
import contact.manager.model.CrmChiWardSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CrmChiWard service. Represents a row in the &quot;crm_chiward&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CrmChiWardModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CrmChiWardImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmChiWardImpl
 * @see CrmChiWard
 * @see CrmChiWardModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class CrmChiWardModelImpl extends BaseModelImpl<CrmChiWard>
	implements CrmChiWardModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a CRM Chi Ward model instance should use the {@link CrmChiWard} interface instead.
	 */
	public static final String TABLE_NAME = "crm_chiward";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "crmChiWardId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "zipCode", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

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

	public static final String TABLE_SQL_CREATE = "create table crm_chiward (uuid_ VARCHAR(75) null,crmChiWardId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(500) null,zipCode VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table crm_chiward";
	public static final String ORDER_BY_JPQL = " ORDER BY crmChiWard.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY crm_chiward.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.contact.manager.model.CrmChiWard"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.contact.manager.model.CrmChiWard"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.contact.manager.model.CrmChiWard"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long UUID_COLUMN_BITMASK = 4L;
	public static final long ZIPCODE_COLUMN_BITMASK = 8L;
	public static final long NAME_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CrmChiWard toModel(CrmChiWardSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CrmChiWard model = new CrmChiWardImpl();

		model.setUuid(soapModel.getUuid());
		model.setCrmChiWardId(soapModel.getCrmChiWardId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());
		model.setZipCode(soapModel.getZipCode());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CrmChiWard> toModels(CrmChiWardSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CrmChiWard> models = new ArrayList<CrmChiWard>(soapModels.length);

		for (CrmChiWardSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(contact.manager.service.util.ServiceProps.get(
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

		attributes.put("uuid", getUuid());
		attributes.put("crmChiWardId", getCrmChiWardId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("zipCode", getZipCode());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long crmChiWardId = (Long)attributes.get("crmChiWardId");

		if (crmChiWardId != null) {
			setCrmChiWardId(crmChiWardId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getCrmChiWardId() {
		return _crmChiWardId;
	}

	@Override
	public void setCrmChiWardId(long crmChiWardId) {
		_crmChiWardId = crmChiWardId;
	}

	@JSON
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

	@JSON
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

	@JSON
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
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
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

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
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

	@JSON
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
		return new StagedModelType(PortalUtil.getClassNameId(
				CrmChiWard.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			CrmChiWard.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CrmChiWard toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CrmChiWard)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
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
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", crmChiWardId=");
		sb.append(getCrmChiWardId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", zipCode=");
		sb.append(getZipCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("contact.manager.model.CrmChiWard");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crmChiWardId</column-name><column-value><![CDATA[");
		sb.append(getCrmChiWardId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
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
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
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
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zipCode</column-name><column-value><![CDATA[");
		sb.append(getZipCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CrmChiWard.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CrmChiWard.class
		};
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