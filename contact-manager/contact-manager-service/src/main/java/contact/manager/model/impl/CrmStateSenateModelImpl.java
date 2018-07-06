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

import contact.manager.model.CrmStateSenate;
import contact.manager.model.CrmStateSenateModel;
import contact.manager.model.CrmStateSenateSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CrmStateSenate service. Represents a row in the &quot;crm_statesenate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CrmStateSenateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CrmStateSenateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateSenateImpl
 * @see CrmStateSenate
 * @see CrmStateSenateModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class CrmStateSenateModelImpl extends BaseModelImpl<CrmStateSenate>
	implements CrmStateSenateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a CRM State Senate model instance should use the {@link CrmStateSenate} interface instead.
	 */
	public static final String TABLE_NAME = "crm_statesenate";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "crmStateSenateId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "number_", Types.VARCHAR },
			{ "zipCode", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("crmStateSenateId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("number_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("zipCode", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table crm_statesenate (uuid_ VARCHAR(75) null,crmStateSenateId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(500) null,number_ VARCHAR(75) null,zipCode VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table crm_statesenate";
	public static final String ORDER_BY_JPQL = " ORDER BY crmStateSenate.number ASC, crmStateSenate.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY crm_statesenate.number_ ASC, crm_statesenate.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.contact.manager.model.CrmStateSenate"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.contact.manager.model.CrmStateSenate"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.contact.manager.model.CrmStateSenate"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long UUID_COLUMN_BITMASK = 4L;
	public static final long ZIPCODE_COLUMN_BITMASK = 8L;
	public static final long NUMBER_COLUMN_BITMASK = 16L;
	public static final long NAME_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CrmStateSenate toModel(CrmStateSenateSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CrmStateSenate model = new CrmStateSenateImpl();

		model.setUuid(soapModel.getUuid());
		model.setCrmStateSenateId(soapModel.getCrmStateSenateId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());
		model.setNumber(soapModel.getNumber());
		model.setZipCode(soapModel.getZipCode());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CrmStateSenate> toModels(CrmStateSenateSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CrmStateSenate> models = new ArrayList<CrmStateSenate>(soapModels.length);

		for (CrmStateSenateSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(contact.manager.service.util.ServiceProps.get(
				"lock.expiration.time.contact.manager.model.CrmStateSenate"));

	public CrmStateSenateModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _crmStateSenateId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCrmStateSenateId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmStateSenateId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CrmStateSenate.class;
	}

	@Override
	public String getModelClassName() {
		return CrmStateSenate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmStateSenateId", getCrmStateSenateId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("number", getNumber());
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

		Long crmStateSenateId = (Long)attributes.get("crmStateSenateId");

		if (crmStateSenateId != null) {
			setCrmStateSenateId(crmStateSenateId);
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

		String number = (String)attributes.get("number");

		if (number != null) {
			setNumber(number);
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
	public long getCrmStateSenateId() {
		return _crmStateSenateId;
	}

	@Override
	public void setCrmStateSenateId(long crmStateSenateId) {
		_crmStateSenateId = crmStateSenateId;
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
	public String getNumber() {
		if (_number == null) {
			return StringPool.BLANK;
		}
		else {
			return _number;
		}
	}

	@Override
	public void setNumber(String number) {
		_columnBitmask = -1L;

		_number = number;
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
				CrmStateSenate.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			CrmStateSenate.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CrmStateSenate toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CrmStateSenate)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CrmStateSenateImpl crmStateSenateImpl = new CrmStateSenateImpl();

		crmStateSenateImpl.setUuid(getUuid());
		crmStateSenateImpl.setCrmStateSenateId(getCrmStateSenateId());
		crmStateSenateImpl.setGroupId(getGroupId());
		crmStateSenateImpl.setCompanyId(getCompanyId());
		crmStateSenateImpl.setUserId(getUserId());
		crmStateSenateImpl.setUserName(getUserName());
		crmStateSenateImpl.setCreateDate(getCreateDate());
		crmStateSenateImpl.setModifiedDate(getModifiedDate());
		crmStateSenateImpl.setName(getName());
		crmStateSenateImpl.setNumber(getNumber());
		crmStateSenateImpl.setZipCode(getZipCode());

		crmStateSenateImpl.resetOriginalValues();

		return crmStateSenateImpl;
	}

	@Override
	public int compareTo(CrmStateSenate crmStateSenate) {
		int value = 0;

		value = getNumber().compareTo(crmStateSenate.getNumber());

		if (value != 0) {
			return value;
		}

		value = getName().compareTo(crmStateSenate.getName());

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

		if (!(obj instanceof CrmStateSenate)) {
			return false;
		}

		CrmStateSenate crmStateSenate = (CrmStateSenate)obj;

		long primaryKey = crmStateSenate.getPrimaryKey();

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
		CrmStateSenateModelImpl crmStateSenateModelImpl = this;

		crmStateSenateModelImpl._originalUuid = crmStateSenateModelImpl._uuid;

		crmStateSenateModelImpl._originalGroupId = crmStateSenateModelImpl._groupId;

		crmStateSenateModelImpl._setOriginalGroupId = false;

		crmStateSenateModelImpl._originalCompanyId = crmStateSenateModelImpl._companyId;

		crmStateSenateModelImpl._setOriginalCompanyId = false;

		crmStateSenateModelImpl._setModifiedDate = false;

		crmStateSenateModelImpl._originalZipCode = crmStateSenateModelImpl._zipCode;

		crmStateSenateModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CrmStateSenate> toCacheModel() {
		CrmStateSenateCacheModel crmStateSenateCacheModel = new CrmStateSenateCacheModel();

		crmStateSenateCacheModel.uuid = getUuid();

		String uuid = crmStateSenateCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			crmStateSenateCacheModel.uuid = null;
		}

		crmStateSenateCacheModel.crmStateSenateId = getCrmStateSenateId();

		crmStateSenateCacheModel.groupId = getGroupId();

		crmStateSenateCacheModel.companyId = getCompanyId();

		crmStateSenateCacheModel.userId = getUserId();

		crmStateSenateCacheModel.userName = getUserName();

		String userName = crmStateSenateCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			crmStateSenateCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			crmStateSenateCacheModel.createDate = createDate.getTime();
		}
		else {
			crmStateSenateCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			crmStateSenateCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			crmStateSenateCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		crmStateSenateCacheModel.name = getName();

		String name = crmStateSenateCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			crmStateSenateCacheModel.name = null;
		}

		crmStateSenateCacheModel.number = getNumber();

		String number = crmStateSenateCacheModel.number;

		if ((number != null) && (number.length() == 0)) {
			crmStateSenateCacheModel.number = null;
		}

		crmStateSenateCacheModel.zipCode = getZipCode();

		String zipCode = crmStateSenateCacheModel.zipCode;

		if ((zipCode != null) && (zipCode.length() == 0)) {
			crmStateSenateCacheModel.zipCode = null;
		}

		return crmStateSenateCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", crmStateSenateId=");
		sb.append(getCrmStateSenateId());
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
		sb.append(", number=");
		sb.append(getNumber());
		sb.append(", zipCode=");
		sb.append(getZipCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("contact.manager.model.CrmStateSenate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crmStateSenateId</column-name><column-value><![CDATA[");
		sb.append(getCrmStateSenateId());
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
			"<column><column-name>number</column-name><column-value><![CDATA[");
		sb.append(getNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zipCode</column-name><column-value><![CDATA[");
		sb.append(getZipCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CrmStateSenate.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CrmStateSenate.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _crmStateSenateId;
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
	private String _number;
	private String _zipCode;
	private String _originalZipCode;
	private long _columnBitmask;
	private CrmStateSenate _escapedModel;
}