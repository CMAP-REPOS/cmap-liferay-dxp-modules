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

import contact.manager.model.CrmOutreachLog;
import contact.manager.model.CrmOutreachLogModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CrmOutreachLog service. Represents a row in the &quot;crm_outreachlog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CrmOutreachLogModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CrmOutreachLogImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmOutreachLogImpl
 * @see CrmOutreachLog
 * @see CrmOutreachLogModel
 * @generated
 */
@ProviderType
public class CrmOutreachLogModelImpl extends BaseModelImpl<CrmOutreachLog>
	implements CrmOutreachLogModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a CRM Outreach Log model instance should use the {@link CrmOutreachLog} interface instead.
	 */
	public static final String TABLE_NAME = "crm_outreachlog";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "crmOutreachLogId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "crmContactId", Types.BIGINT },
			{ "note", Types.VARCHAR },
			{ "medium", Types.VARCHAR },
			{ "activityType", Types.VARCHAR },
			{ "outreachDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("crmOutreachLogId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("crmContactId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("note", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("medium", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("activityType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("outreachDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table crm_outreachlog (uuid_ VARCHAR(75) null,crmOutreachLogId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,crmContactId LONG,note TEXT null,medium VARCHAR(75) null,activityType VARCHAR(75) null,outreachDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table crm_outreachlog";
	public static final String ORDER_BY_JPQL = " ORDER BY crmOutreachLog.crmOutreachLogId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY crm_outreachlog.crmOutreachLogId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.contact.manager.model.CrmOutreachLog"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.contact.manager.model.CrmOutreachLog"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(contact.manager.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.contact.manager.model.CrmOutreachLog"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long CRMCONTACTID_COLUMN_BITMASK = 2L;
	public static final long GROUPID_COLUMN_BITMASK = 4L;
	public static final long UUID_COLUMN_BITMASK = 8L;
	public static final long CRMOUTREACHLOGID_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(contact.manager.service.util.ServiceProps.get(
				"lock.expiration.time.contact.manager.model.CrmOutreachLog"));

	public CrmOutreachLogModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _crmOutreachLogId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCrmOutreachLogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmOutreachLogId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CrmOutreachLog.class;
	}

	@Override
	public String getModelClassName() {
		return CrmOutreachLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("crmOutreachLogId", getCrmOutreachLogId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("crmContactId", getCrmContactId());
		attributes.put("note", getNote());
		attributes.put("medium", getMedium());
		attributes.put("activityType", getActivityType());
		attributes.put("outreachDate", getOutreachDate());

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

		Long crmOutreachLogId = (Long)attributes.get("crmOutreachLogId");

		if (crmOutreachLogId != null) {
			setCrmOutreachLogId(crmOutreachLogId);
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

		Long crmContactId = (Long)attributes.get("crmContactId");

		if (crmContactId != null) {
			setCrmContactId(crmContactId);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		String medium = (String)attributes.get("medium");

		if (medium != null) {
			setMedium(medium);
		}

		String activityType = (String)attributes.get("activityType");

		if (activityType != null) {
			setActivityType(activityType);
		}

		Date outreachDate = (Date)attributes.get("outreachDate");

		if (outreachDate != null) {
			setOutreachDate(outreachDate);
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
	public long getCrmOutreachLogId() {
		return _crmOutreachLogId;
	}

	@Override
	public void setCrmOutreachLogId(long crmOutreachLogId) {
		_crmOutreachLogId = crmOutreachLogId;
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
	public long getCrmContactId() {
		return _crmContactId;
	}

	@Override
	public void setCrmContactId(long crmContactId) {
		_columnBitmask |= CRMCONTACTID_COLUMN_BITMASK;

		if (!_setOriginalCrmContactId) {
			_setOriginalCrmContactId = true;

			_originalCrmContactId = _crmContactId;
		}

		_crmContactId = crmContactId;
	}

	public long getOriginalCrmContactId() {
		return _originalCrmContactId;
	}

	@Override
	public String getNote() {
		if (_note == null) {
			return StringPool.BLANK;
		}
		else {
			return _note;
		}
	}

	@Override
	public void setNote(String note) {
		_note = note;
	}

	@Override
	public String getMedium() {
		if (_medium == null) {
			return StringPool.BLANK;
		}
		else {
			return _medium;
		}
	}

	@Override
	public void setMedium(String medium) {
		_medium = medium;
	}

	@Override
	public String getActivityType() {
		if (_activityType == null) {
			return StringPool.BLANK;
		}
		else {
			return _activityType;
		}
	}

	@Override
	public void setActivityType(String activityType) {
		_activityType = activityType;
	}

	@Override
	public Date getOutreachDate() {
		return _outreachDate;
	}

	@Override
	public void setOutreachDate(Date outreachDate) {
		_outreachDate = outreachDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				CrmOutreachLog.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			CrmOutreachLog.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CrmOutreachLog toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CrmOutreachLog)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CrmOutreachLogImpl crmOutreachLogImpl = new CrmOutreachLogImpl();

		crmOutreachLogImpl.setUuid(getUuid());
		crmOutreachLogImpl.setCrmOutreachLogId(getCrmOutreachLogId());
		crmOutreachLogImpl.setGroupId(getGroupId());
		crmOutreachLogImpl.setCompanyId(getCompanyId());
		crmOutreachLogImpl.setUserId(getUserId());
		crmOutreachLogImpl.setUserName(getUserName());
		crmOutreachLogImpl.setCreateDate(getCreateDate());
		crmOutreachLogImpl.setModifiedDate(getModifiedDate());
		crmOutreachLogImpl.setCrmContactId(getCrmContactId());
		crmOutreachLogImpl.setNote(getNote());
		crmOutreachLogImpl.setMedium(getMedium());
		crmOutreachLogImpl.setActivityType(getActivityType());
		crmOutreachLogImpl.setOutreachDate(getOutreachDate());

		crmOutreachLogImpl.resetOriginalValues();

		return crmOutreachLogImpl;
	}

	@Override
	public int compareTo(CrmOutreachLog crmOutreachLog) {
		long primaryKey = crmOutreachLog.getPrimaryKey();

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

		if (!(obj instanceof CrmOutreachLog)) {
			return false;
		}

		CrmOutreachLog crmOutreachLog = (CrmOutreachLog)obj;

		long primaryKey = crmOutreachLog.getPrimaryKey();

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
		CrmOutreachLogModelImpl crmOutreachLogModelImpl = this;

		crmOutreachLogModelImpl._originalUuid = crmOutreachLogModelImpl._uuid;

		crmOutreachLogModelImpl._originalGroupId = crmOutreachLogModelImpl._groupId;

		crmOutreachLogModelImpl._setOriginalGroupId = false;

		crmOutreachLogModelImpl._originalCompanyId = crmOutreachLogModelImpl._companyId;

		crmOutreachLogModelImpl._setOriginalCompanyId = false;

		crmOutreachLogModelImpl._setModifiedDate = false;

		crmOutreachLogModelImpl._originalCrmContactId = crmOutreachLogModelImpl._crmContactId;

		crmOutreachLogModelImpl._setOriginalCrmContactId = false;

		crmOutreachLogModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CrmOutreachLog> toCacheModel() {
		CrmOutreachLogCacheModel crmOutreachLogCacheModel = new CrmOutreachLogCacheModel();

		crmOutreachLogCacheModel.uuid = getUuid();

		String uuid = crmOutreachLogCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			crmOutreachLogCacheModel.uuid = null;
		}

		crmOutreachLogCacheModel.crmOutreachLogId = getCrmOutreachLogId();

		crmOutreachLogCacheModel.groupId = getGroupId();

		crmOutreachLogCacheModel.companyId = getCompanyId();

		crmOutreachLogCacheModel.userId = getUserId();

		crmOutreachLogCacheModel.userName = getUserName();

		String userName = crmOutreachLogCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			crmOutreachLogCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			crmOutreachLogCacheModel.createDate = createDate.getTime();
		}
		else {
			crmOutreachLogCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			crmOutreachLogCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			crmOutreachLogCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		crmOutreachLogCacheModel.crmContactId = getCrmContactId();

		crmOutreachLogCacheModel.note = getNote();

		String note = crmOutreachLogCacheModel.note;

		if ((note != null) && (note.length() == 0)) {
			crmOutreachLogCacheModel.note = null;
		}

		crmOutreachLogCacheModel.medium = getMedium();

		String medium = crmOutreachLogCacheModel.medium;

		if ((medium != null) && (medium.length() == 0)) {
			crmOutreachLogCacheModel.medium = null;
		}

		crmOutreachLogCacheModel.activityType = getActivityType();

		String activityType = crmOutreachLogCacheModel.activityType;

		if ((activityType != null) && (activityType.length() == 0)) {
			crmOutreachLogCacheModel.activityType = null;
		}

		Date outreachDate = getOutreachDate();

		if (outreachDate != null) {
			crmOutreachLogCacheModel.outreachDate = outreachDate.getTime();
		}
		else {
			crmOutreachLogCacheModel.outreachDate = Long.MIN_VALUE;
		}

		return crmOutreachLogCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", crmOutreachLogId=");
		sb.append(getCrmOutreachLogId());
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
		sb.append(", crmContactId=");
		sb.append(getCrmContactId());
		sb.append(", note=");
		sb.append(getNote());
		sb.append(", medium=");
		sb.append(getMedium());
		sb.append(", activityType=");
		sb.append(getActivityType());
		sb.append(", outreachDate=");
		sb.append(getOutreachDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("contact.manager.model.CrmOutreachLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crmOutreachLogId</column-name><column-value><![CDATA[");
		sb.append(getCrmOutreachLogId());
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
			"<column><column-name>crmContactId</column-name><column-value><![CDATA[");
		sb.append(getCrmContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>medium</column-name><column-value><![CDATA[");
		sb.append(getMedium());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>activityType</column-name><column-value><![CDATA[");
		sb.append(getActivityType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>outreachDate</column-name><column-value><![CDATA[");
		sb.append(getOutreachDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CrmOutreachLog.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CrmOutreachLog.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _crmOutreachLogId;
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
	private long _crmContactId;
	private long _originalCrmContactId;
	private boolean _setOriginalCrmContactId;
	private String _note;
	private String _medium;
	private String _activityType;
	private Date _outreachDate;
	private long _columnBitmask;
	private CrmOutreachLog _escapedModel;
}