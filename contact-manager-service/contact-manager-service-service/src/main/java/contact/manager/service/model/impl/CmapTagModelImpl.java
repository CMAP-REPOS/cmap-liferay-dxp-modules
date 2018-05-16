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

import contact.manager.service.model.CmapTag;
import contact.manager.service.model.CmapTagModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CmapTag service. Represents a row in the &quot;contactmanager_CmapTag&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CmapTagModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CmapTagImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CmapTagImpl
 * @see CmapTag
 * @see CmapTagModel
 * @generated
 */
@ProviderType
public class CmapTagModelImpl extends BaseModelImpl<CmapTag>
	implements CmapTagModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cmap tag model instance should use the {@link CmapTag} interface instead.
	 */
	public static final String TABLE_NAME = "contactmanager_CmapTag";
	public static final Object[][] TABLE_COLUMNS = {
			{ "tagId", Types.BIGINT },
			{ "tagName", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tagId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("tagName", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table contactmanager_CmapTag (tagId LONG not null primary key,tagName VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table contactmanager_CmapTag";
	public static final String ORDER_BY_JPQL = " ORDER BY cmapTag.tagId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY contactmanager_CmapTag.tagId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.contact.manager.service.model.CmapTag"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(contact.manager.service.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.contact.manager.service.model.CmapTag"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(contact.manager.service.service.util.ServiceProps.get(
				"lock.expiration.time.contact.manager.service.model.CmapTag"));

	public CmapTagModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tagId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTagId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tagId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CmapTag.class;
	}

	@Override
	public String getModelClassName() {
		return CmapTag.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tagId", getTagId());
		attributes.put("tagName", getTagName());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tagId = (Long)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}

		String tagName = (String)attributes.get("tagName");

		if (tagName != null) {
			setTagName(tagName);
		}
	}

	@Override
	public long getTagId() {
		return _tagId;
	}

	@Override
	public void setTagId(long tagId) {
		_tagId = tagId;
	}

	@Override
	public String getTagName() {
		if (_tagName == null) {
			return StringPool.BLANK;
		}
		else {
			return _tagName;
		}
	}

	@Override
	public void setTagName(String tagName) {
		_tagName = tagName;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CmapTag.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CmapTag toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CmapTag)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CmapTagImpl cmapTagImpl = new CmapTagImpl();

		cmapTagImpl.setTagId(getTagId());
		cmapTagImpl.setTagName(getTagName());

		cmapTagImpl.resetOriginalValues();

		return cmapTagImpl;
	}

	@Override
	public int compareTo(CmapTag cmapTag) {
		long primaryKey = cmapTag.getPrimaryKey();

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

		if (!(obj instanceof CmapTag)) {
			return false;
		}

		CmapTag cmapTag = (CmapTag)obj;

		long primaryKey = cmapTag.getPrimaryKey();

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
	public CacheModel<CmapTag> toCacheModel() {
		CmapTagCacheModel cmapTagCacheModel = new CmapTagCacheModel();

		cmapTagCacheModel.tagId = getTagId();

		cmapTagCacheModel.tagName = getTagName();

		String tagName = cmapTagCacheModel.tagName;

		if ((tagName != null) && (tagName.length() == 0)) {
			cmapTagCacheModel.tagName = null;
		}

		return cmapTagCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{tagId=");
		sb.append(getTagId());
		sb.append(", tagName=");
		sb.append(getTagName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("contact.manager.service.model.CmapTag");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>tagId</column-name><column-value><![CDATA[");
		sb.append(getTagId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tagName</column-name><column-value><![CDATA[");
		sb.append(getTagName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CmapTag.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CmapTag.class
		};
	private long _tagId;
	private String _tagName;
	private CmapTag _escapedModel;
}