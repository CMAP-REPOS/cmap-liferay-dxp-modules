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
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import contact.manager.model.CrmTag;
import contact.manager.model.CrmTagModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CrmTag service. Represents a row in the &quot;crm_tag&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CrmTagModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CrmTagImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmTagImpl
 * @see CrmTag
 * @see CrmTagModel
 * @generated
 */
@ProviderType
public class CrmTagModelImpl extends BaseModelImpl<CrmTag>
	implements CrmTagModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a CRM Tag model instance should use the {@link CrmTag} interface instead.
	 */
	public static final String TABLE_NAME = "crm_tag";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "crmTagId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("crmTagId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table crm_tag (uuid_ VARCHAR(75) null,crmTagId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(500) null)";
	public static final String TABLE_SQL_DROP = "drop table crm_tag";
	public static final String ORDER_BY_JPQL = " ORDER BY crmTag.crmTagId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY crm_tag.crmTagId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.contact.manager.model.CrmTag"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.contact.manager.model.CrmTag"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.contact.manager.model.CrmTag"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long UUID_COLUMN_BITMASK = 4L;
	public static final long CRMTAGID_COLUMN_BITMASK = 8L;
	public static final String MAPPING_TABLE_CRM_CONTACTS_TAGS_NAME = "crm_contacts_tags";
	public static final Object[][] MAPPING_TABLE_CRM_CONTACTS_TAGS_COLUMNS = {
			{ "companyId", Types.BIGINT },
			{ "crmContactId", Types.BIGINT },
			{ "crmTagId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_CRM_CONTACTS_TAGS_SQL_CREATE = "create table crm_contacts_tags (companyId LONG not null,crmContactId LONG not null,crmTagId LONG not null,primary key (crmContactId, crmTagId))";
	public static final boolean FINDER_CACHE_ENABLED_CRM_CONTACTS_TAGS = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.crm_contacts_tags"), true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(contact.manager.service.util.ServiceProps.get(
				"lock.expiration.time.contact.manager.model.CrmTag"));

	public CrmTagModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _crmTagId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCrmTagId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmTagId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CrmTag.class;
	}

	@Override
	public String getModelClassName() {
		return CrmTag.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmTagId", getCrmTagId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());

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

		Long crmTagId = (Long)attributes.get("crmTagId");

		if (crmTagId != null) {
			setCrmTagId(crmTagId);
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
	}

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

	@Override
	public long getCrmTagId() {
		return _crmTagId;
	}

	@Override
	public void setCrmTagId(long crmTagId) {
		_crmTagId = crmTagId;
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
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

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
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				CrmTag.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			CrmTag.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CrmTag toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CrmTag)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CrmTagImpl crmTagImpl = new CrmTagImpl();

		crmTagImpl.setUuid(getUuid());
		crmTagImpl.setCrmTagId(getCrmTagId());
		crmTagImpl.setGroupId(getGroupId());
		crmTagImpl.setCompanyId(getCompanyId());
		crmTagImpl.setUserId(getUserId());
		crmTagImpl.setUserName(getUserName());
		crmTagImpl.setCreateDate(getCreateDate());
		crmTagImpl.setModifiedDate(getModifiedDate());
		crmTagImpl.setName(getName());

		crmTagImpl.resetOriginalValues();

		return crmTagImpl;
	}

	@Override
	public int compareTo(CrmTag crmTag) {
		long primaryKey = crmTag.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CrmTag)) {
			return false;
		}

		CrmTag crmTag = (CrmTag)obj;

		long primaryKey = crmTag.getPrimaryKey();

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
		CrmTagModelImpl crmTagModelImpl = this;

		crmTagModelImpl._originalUuid = crmTagModelImpl._uuid;

		crmTagModelImpl._originalGroupId = crmTagModelImpl._groupId;

		crmTagModelImpl._setOriginalGroupId = false;

		crmTagModelImpl._originalCompanyId = crmTagModelImpl._companyId;

		crmTagModelImpl._setOriginalCompanyId = false;

		crmTagModelImpl._setModifiedDate = false;

		crmTagModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CrmTag> toCacheModel() {
		CrmTagCacheModel crmTagCacheModel = new CrmTagCacheModel();

		crmTagCacheModel.uuid = getUuid();

		String uuid = crmTagCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			crmTagCacheModel.uuid = null;
		}

		crmTagCacheModel.crmTagId = getCrmTagId();

		crmTagCacheModel.groupId = getGroupId();

		crmTagCacheModel.companyId = getCompanyId();

		crmTagCacheModel.userId = getUserId();

		crmTagCacheModel.userName = getUserName();

		String userName = crmTagCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			crmTagCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			crmTagCacheModel.createDate = createDate.getTime();
		}
		else {
			crmTagCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			crmTagCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			crmTagCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		crmTagCacheModel.name = getName();

		String name = crmTagCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			crmTagCacheModel.name = null;
		}

		return crmTagCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", crmTagId=");
		sb.append(getCrmTagId());
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("contact.manager.model.CrmTag");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crmTagId</column-name><column-value><![CDATA[");
		sb.append(getCrmTagId());
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

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CrmTag.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CrmTag.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _crmTagId;
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
	private long _columnBitmask;
	private CrmTag _escapedModel;
}