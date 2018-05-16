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
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import contact.manager.service.model.OutreachLog;
import contact.manager.service.model.OutreachLogModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the OutreachLog service. Represents a row in the &quot;contactmanager_OutreachLog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link OutreachLogModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OutreachLogImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OutreachLogImpl
 * @see OutreachLog
 * @see OutreachLogModel
 * @generated
 */
@ProviderType
public class OutreachLogModelImpl extends BaseModelImpl<OutreachLog>
	implements OutreachLogModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a outreach log model instance should use the {@link OutreachLog} interface instead.
	 */
	public static final String TABLE_NAME = "contactmanager_OutreachLog";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "contactId", Types.BIGINT },
			{ "note", Types.VARCHAR },
			{ "medium", Types.VARCHAR },
			{ "activityType", Types.VARCHAR },
			{ "outreachDate", Types.TIMESTAMP },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("contactId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("note", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("medium", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("activityType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("outreachDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table contactmanager_OutreachLog (id_ LONG not null primary key,userId LONG,contactId LONG,note VARCHAR(75) null,medium VARCHAR(75) null,activityType VARCHAR(75) null,outreachDate DATE null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table contactmanager_OutreachLog";
	public static final String ORDER_BY_JPQL = " ORDER BY outreachLog.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY contactmanager_OutreachLog.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.contact.manager.service.model.OutreachLog"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.contact.manager.service.model.OutreachLog"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(contact.manager.service.service.util.ServiceProps.get(
				"lock.expiration.time.contact.manager.service.model.OutreachLog"));

	public OutreachLogModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OutreachLog.class;
	}

	@Override
	public String getModelClassName() {
		return OutreachLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("contactId", getContactId());
		attributes.put("note", getNote());
		attributes.put("medium", getMedium());
		attributes.put("activityType", getActivityType());
		attributes.put("outreachDate", getOutreachDate());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
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
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
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
	public long getContactId() {
		return _contactId;
	}

	@Override
	public void setContactId(long contactId) {
		_contactId = contactId;
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
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			OutreachLog.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OutreachLog toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (OutreachLog)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		OutreachLogImpl outreachLogImpl = new OutreachLogImpl();

		outreachLogImpl.setId(getId());
		outreachLogImpl.setUserId(getUserId());
		outreachLogImpl.setContactId(getContactId());
		outreachLogImpl.setNote(getNote());
		outreachLogImpl.setMedium(getMedium());
		outreachLogImpl.setActivityType(getActivityType());
		outreachLogImpl.setOutreachDate(getOutreachDate());
		outreachLogImpl.setCreateDate(getCreateDate());
		outreachLogImpl.setModifiedDate(getModifiedDate());

		outreachLogImpl.resetOriginalValues();

		return outreachLogImpl;
	}

	@Override
	public int compareTo(OutreachLog outreachLog) {
		long primaryKey = outreachLog.getPrimaryKey();

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

		if (!(obj instanceof OutreachLog)) {
			return false;
		}

		OutreachLog outreachLog = (OutreachLog)obj;

		long primaryKey = outreachLog.getPrimaryKey();

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
		OutreachLogModelImpl outreachLogModelImpl = this;

		outreachLogModelImpl._setModifiedDate = false;
	}

	@Override
	public CacheModel<OutreachLog> toCacheModel() {
		OutreachLogCacheModel outreachLogCacheModel = new OutreachLogCacheModel();

		outreachLogCacheModel.id = getId();

		outreachLogCacheModel.userId = getUserId();

		outreachLogCacheModel.contactId = getContactId();

		outreachLogCacheModel.note = getNote();

		String note = outreachLogCacheModel.note;

		if ((note != null) && (note.length() == 0)) {
			outreachLogCacheModel.note = null;
		}

		outreachLogCacheModel.medium = getMedium();

		String medium = outreachLogCacheModel.medium;

		if ((medium != null) && (medium.length() == 0)) {
			outreachLogCacheModel.medium = null;
		}

		outreachLogCacheModel.activityType = getActivityType();

		String activityType = outreachLogCacheModel.activityType;

		if ((activityType != null) && (activityType.length() == 0)) {
			outreachLogCacheModel.activityType = null;
		}

		Date outreachDate = getOutreachDate();

		if (outreachDate != null) {
			outreachLogCacheModel.outreachDate = outreachDate.getTime();
		}
		else {
			outreachLogCacheModel.outreachDate = Long.MIN_VALUE;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			outreachLogCacheModel.createDate = createDate.getTime();
		}
		else {
			outreachLogCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			outreachLogCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			outreachLogCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return outreachLogCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", contactId=");
		sb.append(getContactId());
		sb.append(", note=");
		sb.append(getNote());
		sb.append(", medium=");
		sb.append(getMedium());
		sb.append(", activityType=");
		sb.append(getActivityType());
		sb.append(", outreachDate=");
		sb.append(getOutreachDate());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("contact.manager.service.model.OutreachLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
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

	private static final ClassLoader _classLoader = OutreachLog.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			OutreachLog.class
		};
	private long _id;
	private long _userId;
	private long _contactId;
	private String _note;
	private String _medium;
	private String _activityType;
	private Date _outreachDate;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private OutreachLog _escapedModel;
}