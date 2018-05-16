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

import contact.manager.service.model.ContactAuditLogChange;
import contact.manager.service.model.ContactAuditLogChangeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ContactAuditLogChange service. Represents a row in the &quot;contactmanager_ContactAuditLogChange&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ContactAuditLogChangeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContactAuditLogChangeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLogChangeImpl
 * @see ContactAuditLogChange
 * @see ContactAuditLogChangeModel
 * @generated
 */
@ProviderType
public class ContactAuditLogChangeModelImpl extends BaseModelImpl<ContactAuditLogChange>
	implements ContactAuditLogChangeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a contact audit log change model instance should use the {@link ContactAuditLogChange} interface instead.
	 */
	public static final String TABLE_NAME = "contactmanager_ContactAuditLogChange";
	public static final Object[][] TABLE_COLUMNS = {
			{ "contactAuditLogChangeId", Types.BIGINT },
			{ "contactAuditLogId", Types.BIGINT },
			{ "fieldName", Types.VARCHAR },
			{ "oldValue", Types.VARCHAR },
			{ "newValue", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("contactAuditLogChangeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("contactAuditLogId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("fieldName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("oldValue", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("newValue", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table contactmanager_ContactAuditLogChange (contactAuditLogChangeId LONG not null primary key,contactAuditLogId LONG,fieldName VARCHAR(75) null,oldValue VARCHAR(75) null,newValue VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table contactmanager_ContactAuditLogChange";
	public static final String ORDER_BY_JPQL = " ORDER BY contactAuditLogChange.contactAuditLogChangeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY contactmanager_ContactAuditLogChange.contactAuditLogChangeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.contact.manager.service.model.ContactAuditLogChange"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.contact.manager.service.model.ContactAuditLogChange"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(contact.manager.service.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.contact.manager.service.model.ContactAuditLogChange"),
			true);
	public static final long CONTACTAUDITLOGID_COLUMN_BITMASK = 1L;
	public static final long CONTACTAUDITLOGCHANGEID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(contact.manager.service.service.util.ServiceProps.get(
				"lock.expiration.time.contact.manager.service.model.ContactAuditLogChange"));

	public ContactAuditLogChangeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _contactAuditLogChangeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setContactAuditLogChangeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contactAuditLogChangeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ContactAuditLogChange.class;
	}

	@Override
	public String getModelClassName() {
		return ContactAuditLogChange.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contactAuditLogChangeId", getContactAuditLogChangeId());
		attributes.put("contactAuditLogId", getContactAuditLogId());
		attributes.put("fieldName", getFieldName());
		attributes.put("oldValue", getOldValue());
		attributes.put("newValue", getNewValue());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long contactAuditLogChangeId = (Long)attributes.get(
				"contactAuditLogChangeId");

		if (contactAuditLogChangeId != null) {
			setContactAuditLogChangeId(contactAuditLogChangeId);
		}

		Long contactAuditLogId = (Long)attributes.get("contactAuditLogId");

		if (contactAuditLogId != null) {
			setContactAuditLogId(contactAuditLogId);
		}

		String fieldName = (String)attributes.get("fieldName");

		if (fieldName != null) {
			setFieldName(fieldName);
		}

		String oldValue = (String)attributes.get("oldValue");

		if (oldValue != null) {
			setOldValue(oldValue);
		}

		String newValue = (String)attributes.get("newValue");

		if (newValue != null) {
			setNewValue(newValue);
		}
	}

	@Override
	public long getContactAuditLogChangeId() {
		return _contactAuditLogChangeId;
	}

	@Override
	public void setContactAuditLogChangeId(long contactAuditLogChangeId) {
		_columnBitmask = -1L;

		_contactAuditLogChangeId = contactAuditLogChangeId;
	}

	@Override
	public long getContactAuditLogId() {
		return _contactAuditLogId;
	}

	@Override
	public void setContactAuditLogId(long contactAuditLogId) {
		_columnBitmask |= CONTACTAUDITLOGID_COLUMN_BITMASK;

		if (!_setOriginalContactAuditLogId) {
			_setOriginalContactAuditLogId = true;

			_originalContactAuditLogId = _contactAuditLogId;
		}

		_contactAuditLogId = contactAuditLogId;
	}

	public long getOriginalContactAuditLogId() {
		return _originalContactAuditLogId;
	}

	@Override
	public String getFieldName() {
		if (_fieldName == null) {
			return StringPool.BLANK;
		}
		else {
			return _fieldName;
		}
	}

	@Override
	public void setFieldName(String fieldName) {
		_fieldName = fieldName;
	}

	@Override
	public String getOldValue() {
		if (_oldValue == null) {
			return StringPool.BLANK;
		}
		else {
			return _oldValue;
		}
	}

	@Override
	public void setOldValue(String oldValue) {
		_oldValue = oldValue;
	}

	@Override
	public String getNewValue() {
		if (_newValue == null) {
			return StringPool.BLANK;
		}
		else {
			return _newValue;
		}
	}

	@Override
	public void setNewValue(String newValue) {
		_newValue = newValue;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ContactAuditLogChange.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ContactAuditLogChange toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ContactAuditLogChange)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ContactAuditLogChangeImpl contactAuditLogChangeImpl = new ContactAuditLogChangeImpl();

		contactAuditLogChangeImpl.setContactAuditLogChangeId(getContactAuditLogChangeId());
		contactAuditLogChangeImpl.setContactAuditLogId(getContactAuditLogId());
		contactAuditLogChangeImpl.setFieldName(getFieldName());
		contactAuditLogChangeImpl.setOldValue(getOldValue());
		contactAuditLogChangeImpl.setNewValue(getNewValue());

		contactAuditLogChangeImpl.resetOriginalValues();

		return contactAuditLogChangeImpl;
	}

	@Override
	public int compareTo(ContactAuditLogChange contactAuditLogChange) {
		int value = 0;

		if (getContactAuditLogChangeId() < contactAuditLogChange.getContactAuditLogChangeId()) {
			value = -1;
		}
		else if (getContactAuditLogChangeId() > contactAuditLogChange.getContactAuditLogChangeId()) {
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

		if (!(obj instanceof ContactAuditLogChange)) {
			return false;
		}

		ContactAuditLogChange contactAuditLogChange = (ContactAuditLogChange)obj;

		long primaryKey = contactAuditLogChange.getPrimaryKey();

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
		ContactAuditLogChangeModelImpl contactAuditLogChangeModelImpl = this;

		contactAuditLogChangeModelImpl._originalContactAuditLogId = contactAuditLogChangeModelImpl._contactAuditLogId;

		contactAuditLogChangeModelImpl._setOriginalContactAuditLogId = false;

		contactAuditLogChangeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ContactAuditLogChange> toCacheModel() {
		ContactAuditLogChangeCacheModel contactAuditLogChangeCacheModel = new ContactAuditLogChangeCacheModel();

		contactAuditLogChangeCacheModel.contactAuditLogChangeId = getContactAuditLogChangeId();

		contactAuditLogChangeCacheModel.contactAuditLogId = getContactAuditLogId();

		contactAuditLogChangeCacheModel.fieldName = getFieldName();

		String fieldName = contactAuditLogChangeCacheModel.fieldName;

		if ((fieldName != null) && (fieldName.length() == 0)) {
			contactAuditLogChangeCacheModel.fieldName = null;
		}

		contactAuditLogChangeCacheModel.oldValue = getOldValue();

		String oldValue = contactAuditLogChangeCacheModel.oldValue;

		if ((oldValue != null) && (oldValue.length() == 0)) {
			contactAuditLogChangeCacheModel.oldValue = null;
		}

		contactAuditLogChangeCacheModel.newValue = getNewValue();

		String newValue = contactAuditLogChangeCacheModel.newValue;

		if ((newValue != null) && (newValue.length() == 0)) {
			contactAuditLogChangeCacheModel.newValue = null;
		}

		return contactAuditLogChangeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{contactAuditLogChangeId=");
		sb.append(getContactAuditLogChangeId());
		sb.append(", contactAuditLogId=");
		sb.append(getContactAuditLogId());
		sb.append(", fieldName=");
		sb.append(getFieldName());
		sb.append(", oldValue=");
		sb.append(getOldValue());
		sb.append(", newValue=");
		sb.append(getNewValue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("contact.manager.service.model.ContactAuditLogChange");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>contactAuditLogChangeId</column-name><column-value><![CDATA[");
		sb.append(getContactAuditLogChangeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactAuditLogId</column-name><column-value><![CDATA[");
		sb.append(getContactAuditLogId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fieldName</column-name><column-value><![CDATA[");
		sb.append(getFieldName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oldValue</column-name><column-value><![CDATA[");
		sb.append(getOldValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>newValue</column-name><column-value><![CDATA[");
		sb.append(getNewValue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = ContactAuditLogChange.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			ContactAuditLogChange.class
		};
	private long _contactAuditLogChangeId;
	private long _contactAuditLogId;
	private long _originalContactAuditLogId;
	private boolean _setOriginalContactAuditLogId;
	private String _fieldName;
	private String _oldValue;
	private String _newValue;
	private long _columnBitmask;
	private ContactAuditLogChange _escapedModel;
}