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

import contact.manager.model.CrmNote;
import contact.manager.model.CrmNoteModel;

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
 * The base model implementation for the CrmNote service. Represents a row in the &quot;crm_note&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>CrmNoteModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CrmNoteImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmNoteImpl
 * @generated
 */
@ProviderType
public class CrmNoteModelImpl
	extends BaseModelImpl<CrmNote> implements CrmNoteModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a CRM Note model instance should use the <code>CrmNote</code> interface instead.
	 */
	public static final String TABLE_NAME = "crm_note";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"crmNoteId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"crmContactId", Types.BIGINT}, {"note", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("crmNoteId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("crmContactId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("note", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table crm_note (uuid_ VARCHAR(75) null,crmNoteId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,crmContactId LONG,note TEXT null)";

	public static final String TABLE_SQL_DROP = "drop table crm_note";

	public static final String ORDER_BY_JPQL =
		" ORDER BY crmNote.crmNoteId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY crm_note.crmNoteId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		contact.manager.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.contact.manager.model.CrmNote"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		contact.manager.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.contact.manager.model.CrmNote"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		contact.manager.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.contact.manager.model.CrmNote"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long CRMCONTACTID_COLUMN_BITMASK = 2L;

	public static final long GROUPID_COLUMN_BITMASK = 4L;

	public static final long UUID_COLUMN_BITMASK = 8L;

	public static final long CRMNOTEID_COLUMN_BITMASK = 16L;

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		contact.manager.service.util.ServiceProps.get(
			"lock.expiration.time.contact.manager.model.CrmNote"));

	public CrmNoteModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _crmNoteId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCrmNoteId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _crmNoteId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CrmNote.class;
	}

	@Override
	public String getModelClassName() {
		return CrmNote.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CrmNote, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CrmNote, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CrmNote, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((CrmNote)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CrmNote, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CrmNote, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CrmNote)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CrmNote, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CrmNote, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, CrmNote>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			CrmNote.class.getClassLoader(), CrmNote.class, ModelWrapper.class);

		try {
			Constructor<CrmNote> constructor =
				(Constructor<CrmNote>)proxyClass.getConstructor(
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

	private static final Map<String, Function<CrmNote, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<CrmNote, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<CrmNote, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<CrmNote, Object>>();
		Map<String, BiConsumer<CrmNote, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<CrmNote, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<CrmNote, Object>() {

				@Override
				public Object apply(CrmNote crmNote) {
					return crmNote.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<CrmNote, Object>() {

				@Override
				public void accept(CrmNote crmNote, Object uuid) {
					crmNote.setUuid((String)uuid);
				}

			});
		attributeGetterFunctions.put(
			"crmNoteId",
			new Function<CrmNote, Object>() {

				@Override
				public Object apply(CrmNote crmNote) {
					return crmNote.getCrmNoteId();
				}

			});
		attributeSetterBiConsumers.put(
			"crmNoteId",
			new BiConsumer<CrmNote, Object>() {

				@Override
				public void accept(CrmNote crmNote, Object crmNoteId) {
					crmNote.setCrmNoteId((Long)crmNoteId);
				}

			});
		attributeGetterFunctions.put(
			"groupId",
			new Function<CrmNote, Object>() {

				@Override
				public Object apply(CrmNote crmNote) {
					return crmNote.getGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"groupId",
			new BiConsumer<CrmNote, Object>() {

				@Override
				public void accept(CrmNote crmNote, Object groupId) {
					crmNote.setGroupId((Long)groupId);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<CrmNote, Object>() {

				@Override
				public Object apply(CrmNote crmNote) {
					return crmNote.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<CrmNote, Object>() {

				@Override
				public void accept(CrmNote crmNote, Object companyId) {
					crmNote.setCompanyId((Long)companyId);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<CrmNote, Object>() {

				@Override
				public Object apply(CrmNote crmNote) {
					return crmNote.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<CrmNote, Object>() {

				@Override
				public void accept(CrmNote crmNote, Object userId) {
					crmNote.setUserId((Long)userId);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<CrmNote, Object>() {

				@Override
				public Object apply(CrmNote crmNote) {
					return crmNote.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<CrmNote, Object>() {

				@Override
				public void accept(CrmNote crmNote, Object userName) {
					crmNote.setUserName((String)userName);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<CrmNote, Object>() {

				@Override
				public Object apply(CrmNote crmNote) {
					return crmNote.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<CrmNote, Object>() {

				@Override
				public void accept(CrmNote crmNote, Object createDate) {
					crmNote.setCreateDate((Date)createDate);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<CrmNote, Object>() {

				@Override
				public Object apply(CrmNote crmNote) {
					return crmNote.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<CrmNote, Object>() {

				@Override
				public void accept(CrmNote crmNote, Object modifiedDate) {
					crmNote.setModifiedDate((Date)modifiedDate);
				}

			});
		attributeGetterFunctions.put(
			"crmContactId",
			new Function<CrmNote, Object>() {

				@Override
				public Object apply(CrmNote crmNote) {
					return crmNote.getCrmContactId();
				}

			});
		attributeSetterBiConsumers.put(
			"crmContactId",
			new BiConsumer<CrmNote, Object>() {

				@Override
				public void accept(CrmNote crmNote, Object crmContactId) {
					crmNote.setCrmContactId((Long)crmContactId);
				}

			});
		attributeGetterFunctions.put(
			"note",
			new Function<CrmNote, Object>() {

				@Override
				public Object apply(CrmNote crmNote) {
					return crmNote.getNote();
				}

			});
		attributeSetterBiConsumers.put(
			"note",
			new BiConsumer<CrmNote, Object>() {

				@Override
				public void accept(CrmNote crmNote, Object note) {
					crmNote.setNote((String)note);
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
	public long getCrmNoteId() {
		return _crmNoteId;
	}

	@Override
	public void setCrmNoteId(long crmNoteId) {
		_crmNoteId = crmNoteId;
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
			return "";
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
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(CrmNote.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), CrmNote.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CrmNote toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CrmNote>
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
		CrmNoteImpl crmNoteImpl = new CrmNoteImpl();

		crmNoteImpl.setUuid(getUuid());
		crmNoteImpl.setCrmNoteId(getCrmNoteId());
		crmNoteImpl.setGroupId(getGroupId());
		crmNoteImpl.setCompanyId(getCompanyId());
		crmNoteImpl.setUserId(getUserId());
		crmNoteImpl.setUserName(getUserName());
		crmNoteImpl.setCreateDate(getCreateDate());
		crmNoteImpl.setModifiedDate(getModifiedDate());
		crmNoteImpl.setCrmContactId(getCrmContactId());
		crmNoteImpl.setNote(getNote());

		crmNoteImpl.resetOriginalValues();

		return crmNoteImpl;
	}

	@Override
	public int compareTo(CrmNote crmNote) {
		long primaryKey = crmNote.getPrimaryKey();

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

		if (!(obj instanceof CrmNote)) {
			return false;
		}

		CrmNote crmNote = (CrmNote)obj;

		long primaryKey = crmNote.getPrimaryKey();

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
		CrmNoteModelImpl crmNoteModelImpl = this;

		crmNoteModelImpl._originalUuid = crmNoteModelImpl._uuid;

		crmNoteModelImpl._originalGroupId = crmNoteModelImpl._groupId;

		crmNoteModelImpl._setOriginalGroupId = false;

		crmNoteModelImpl._originalCompanyId = crmNoteModelImpl._companyId;

		crmNoteModelImpl._setOriginalCompanyId = false;

		crmNoteModelImpl._setModifiedDate = false;

		crmNoteModelImpl._originalCrmContactId = crmNoteModelImpl._crmContactId;

		crmNoteModelImpl._setOriginalCrmContactId = false;

		crmNoteModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CrmNote> toCacheModel() {
		CrmNoteCacheModel crmNoteCacheModel = new CrmNoteCacheModel();

		crmNoteCacheModel.uuid = getUuid();

		String uuid = crmNoteCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			crmNoteCacheModel.uuid = null;
		}

		crmNoteCacheModel.crmNoteId = getCrmNoteId();

		crmNoteCacheModel.groupId = getGroupId();

		crmNoteCacheModel.companyId = getCompanyId();

		crmNoteCacheModel.userId = getUserId();

		crmNoteCacheModel.userName = getUserName();

		String userName = crmNoteCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			crmNoteCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			crmNoteCacheModel.createDate = createDate.getTime();
		}
		else {
			crmNoteCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			crmNoteCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			crmNoteCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		crmNoteCacheModel.crmContactId = getCrmContactId();

		crmNoteCacheModel.note = getNote();

		String note = crmNoteCacheModel.note;

		if ((note != null) && (note.length() == 0)) {
			crmNoteCacheModel.note = null;
		}

		return crmNoteCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CrmNote, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CrmNote, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CrmNote, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((CrmNote)this));
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
		Map<String, Function<CrmNote, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<CrmNote, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CrmNote, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((CrmNote)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, CrmNote>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private long _crmNoteId;
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
	private long _columnBitmask;
	private CrmNote _escapedModel;

}