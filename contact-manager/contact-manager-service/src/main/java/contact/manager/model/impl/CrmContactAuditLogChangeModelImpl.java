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

import contact.manager.model.CrmContactAuditLogChange;
import contact.manager.model.CrmContactAuditLogChangeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CrmContactAuditLogChange service. Represents a row in the &quot;crm_contactauditlogchange&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CrmContactAuditLogChangeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CrmContactAuditLogChangeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogChangeImpl
 * @see CrmContactAuditLogChange
 * @see CrmContactAuditLogChangeModel
 * @generated
 */
@ProviderType
public class CrmContactAuditLogChangeModelImpl extends BaseModelImpl<CrmContactAuditLogChange>
	implements CrmContactAuditLogChangeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a CRM Contact Audit Log Change model instance should use the {@link CrmContactAuditLogChange} interface instead.
	 */
	public static final String TABLE_NAME = "crm_contactauditlogchange";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "crmContactAuditLogChangeId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("crmContactAuditLogChangeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table crm_contactauditlogchange (uuid_ VARCHAR(75) null,crmContactAuditLogChangeId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table crm_contactauditlogchange";
	public static final String ORDER_BY_JPQL = " ORDER BY crmContactAuditLogChange.crmContactAuditLogChangeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY crm_contactauditlogchange.crmContactAuditLogChangeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.contact.manager.model.CrmContactAuditLogChange"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.contact.manager.model.CrmContactAuditLogChange"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.contact.manager.model.CrmContactAuditLogChange"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long UUID_COLUMN_BITMASK = 4L;
	public static final long CRMCONTACTAUDITLOGCHANGEID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(contact.manager.service.util.ServiceProps.get(
				"lock.expiration.time.contact.manager.model.CrmContactAuditLogChange"));

	public CrmContactAuditLogChangeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _crmContactAuditLogChangeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCrmContactAuditLogChangeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmContactAuditLogChangeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CrmContactAuditLogChange.class;
	}

	@Override
	public String getModelClassName() {
		return CrmContactAuditLogChange.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmContactAuditLogChangeId",
			getCrmContactAuditLogChangeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

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

		Long crmContactAuditLogChangeId = (Long)attributes.get(
				"crmContactAuditLogChangeId");

		if (crmContactAuditLogChangeId != null) {
			setCrmContactAuditLogChangeId(crmContactAuditLogChangeId);
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
	public long getCrmContactAuditLogChangeId() {
		return _crmContactAuditLogChangeId;
	}

	@Override
	public void setCrmContactAuditLogChangeId(long crmContactAuditLogChangeId) {
		_crmContactAuditLogChangeId = crmContactAuditLogChangeId;
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
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				CrmContactAuditLogChange.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			CrmContactAuditLogChange.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CrmContactAuditLogChange toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CrmContactAuditLogChange)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CrmContactAuditLogChangeImpl crmContactAuditLogChangeImpl = new CrmContactAuditLogChangeImpl();

		crmContactAuditLogChangeImpl.setUuid(getUuid());
		crmContactAuditLogChangeImpl.setCrmContactAuditLogChangeId(getCrmContactAuditLogChangeId());
		crmContactAuditLogChangeImpl.setGroupId(getGroupId());
		crmContactAuditLogChangeImpl.setCompanyId(getCompanyId());
		crmContactAuditLogChangeImpl.setUserId(getUserId());
		crmContactAuditLogChangeImpl.setUserName(getUserName());
		crmContactAuditLogChangeImpl.setCreateDate(getCreateDate());
		crmContactAuditLogChangeImpl.setModifiedDate(getModifiedDate());

		crmContactAuditLogChangeImpl.resetOriginalValues();

		return crmContactAuditLogChangeImpl;
	}

	@Override
	public int compareTo(CrmContactAuditLogChange crmContactAuditLogChange) {
		long primaryKey = crmContactAuditLogChange.getPrimaryKey();

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

		if (!(obj instanceof CrmContactAuditLogChange)) {
			return false;
		}

		CrmContactAuditLogChange crmContactAuditLogChange = (CrmContactAuditLogChange)obj;

		long primaryKey = crmContactAuditLogChange.getPrimaryKey();

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
		CrmContactAuditLogChangeModelImpl crmContactAuditLogChangeModelImpl = this;

		crmContactAuditLogChangeModelImpl._originalUuid = crmContactAuditLogChangeModelImpl._uuid;

		crmContactAuditLogChangeModelImpl._originalGroupId = crmContactAuditLogChangeModelImpl._groupId;

		crmContactAuditLogChangeModelImpl._setOriginalGroupId = false;

		crmContactAuditLogChangeModelImpl._originalCompanyId = crmContactAuditLogChangeModelImpl._companyId;

		crmContactAuditLogChangeModelImpl._setOriginalCompanyId = false;

		crmContactAuditLogChangeModelImpl._setModifiedDate = false;

		crmContactAuditLogChangeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CrmContactAuditLogChange> toCacheModel() {
		CrmContactAuditLogChangeCacheModel crmContactAuditLogChangeCacheModel = new CrmContactAuditLogChangeCacheModel();

		crmContactAuditLogChangeCacheModel.uuid = getUuid();

		String uuid = crmContactAuditLogChangeCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			crmContactAuditLogChangeCacheModel.uuid = null;
		}

		crmContactAuditLogChangeCacheModel.crmContactAuditLogChangeId = getCrmContactAuditLogChangeId();

		crmContactAuditLogChangeCacheModel.groupId = getGroupId();

		crmContactAuditLogChangeCacheModel.companyId = getCompanyId();

		crmContactAuditLogChangeCacheModel.userId = getUserId();

		crmContactAuditLogChangeCacheModel.userName = getUserName();

		String userName = crmContactAuditLogChangeCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			crmContactAuditLogChangeCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			crmContactAuditLogChangeCacheModel.createDate = createDate.getTime();
		}
		else {
			crmContactAuditLogChangeCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			crmContactAuditLogChangeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			crmContactAuditLogChangeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return crmContactAuditLogChangeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", crmContactAuditLogChangeId=");
		sb.append(getCrmContactAuditLogChangeId());
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("contact.manager.model.CrmContactAuditLogChange");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crmContactAuditLogChangeId</column-name><column-value><![CDATA[");
		sb.append(getCrmContactAuditLogChangeId());
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

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CrmContactAuditLogChange.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CrmContactAuditLogChange.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _crmContactAuditLogChangeId;
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
	private long _columnBitmask;
	private CrmContactAuditLogChange _escapedModel;
}