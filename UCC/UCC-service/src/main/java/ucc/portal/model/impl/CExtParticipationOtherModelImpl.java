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

package ucc.portal.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import ucc.portal.model.CExtParticipationOther;
import ucc.portal.model.CExtParticipationOtherModel;

import ucc.portal.service.persistence.CExtParticipationOtherPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CExtParticipationOther service. Represents a row in the &quot;UCC_CExtParticipationOther&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CExtParticipationOtherModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CExtParticipationOtherImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtParticipationOtherImpl
 * @see CExtParticipationOther
 * @see CExtParticipationOtherModel
 * @generated
 */
@ProviderType
public class CExtParticipationOtherModelImpl extends BaseModelImpl<CExtParticipationOther>
	implements CExtParticipationOtherModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a c ext participation other model instance should use the {@link CExtParticipationOther} interface instead.
	 */
	public static final String TABLE_NAME = "UCC_CExtParticipationOther";
	public static final Object[][] TABLE_COLUMNS = {
			{ "organizationId", Types.BIGINT },
			{ "cextParticipationOtherId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "ppGathering", Types.VARCHAR },
			{ "ppCount", Types.INTEGER },
			{ "ppLay", Types.BOOLEAN },
			{ "ppPastor", Types.BOOLEAN },
			{ "ppStaff", Types.BOOLEAN },
			{ "ppOther", Types.BOOLEAN },
			{ "ppAdditionalInformation", Types.VARCHAR },
			{ "ppPriority", Types.DOUBLE }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("organizationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("cextParticipationOtherId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("ppGathering", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ppCount", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("ppLay", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("ppPastor", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("ppStaff", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("ppOther", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("ppAdditionalInformation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ppPriority", Types.DOUBLE);
	}

	public static final String TABLE_SQL_CREATE = "create table UCC_CExtParticipationOther (organizationId LONG not null,cextParticipationOtherId LONG not null,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,ppGathering VARCHAR(75) null,ppCount INTEGER,ppLay BOOLEAN,ppPastor BOOLEAN,ppStaff BOOLEAN,ppOther BOOLEAN,ppAdditionalInformation VARCHAR(75) null,ppPriority DOUBLE,primary key (organizationId, cextParticipationOtherId))";
	public static final String TABLE_SQL_DROP = "drop table UCC_CExtParticipationOther";
	public static final String ORDER_BY_JPQL = " ORDER BY cExtParticipationOther.ppPriority ASC";
	public static final String ORDER_BY_SQL = " ORDER BY UCC_CExtParticipationOther.ppPriority ASC";
	public static final String DATA_SOURCE = "extDataSource";
	public static final String SESSION_FACTORY = "extSessionFactory";
	public static final String TX_MANAGER = "extTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(ucc.portal.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.ucc.portal.model.CExtParticipationOther"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(ucc.portal.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.ucc.portal.model.CExtParticipationOther"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(ucc.portal.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.ucc.portal.model.CExtParticipationOther"),
			true);
	public static final long ORGANIZATIONID_COLUMN_BITMASK = 1L;
	public static final long PPPRIORITY_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(ucc.portal.service.util.ServiceProps.get(
				"lock.expiration.time.ucc.portal.model.CExtParticipationOther"));

	public CExtParticipationOtherModelImpl() {
	}

	@Override
	public CExtParticipationOtherPK getPrimaryKey() {
		return new CExtParticipationOtherPK(_organizationId,
			_cextParticipationOtherId);
	}

	@Override
	public void setPrimaryKey(CExtParticipationOtherPK primaryKey) {
		setOrganizationId(primaryKey.organizationId);
		setCextParticipationOtherId(primaryKey.cextParticipationOtherId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new CExtParticipationOtherPK(_organizationId,
			_cextParticipationOtherId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((CExtParticipationOtherPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return CExtParticipationOther.class;
	}

	@Override
	public String getModelClassName() {
		return CExtParticipationOther.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organizationId", getOrganizationId());
		attributes.put("cextParticipationOtherId", getCextParticipationOtherId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ppGathering", getPpGathering());
		attributes.put("ppCount", getPpCount());
		attributes.put("ppLay", isPpLay());
		attributes.put("ppPastor", isPpPastor());
		attributes.put("ppStaff", isPpStaff());
		attributes.put("ppOther", isPpOther());
		attributes.put("ppAdditionalInformation", getPpAdditionalInformation());
		attributes.put("ppPriority", getPpPriority());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long cextParticipationOtherId = (Long)attributes.get(
				"cextParticipationOtherId");

		if (cextParticipationOtherId != null) {
			setCextParticipationOtherId(cextParticipationOtherId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String ppGathering = (String)attributes.get("ppGathering");

		if (ppGathering != null) {
			setPpGathering(ppGathering);
		}

		Integer ppCount = (Integer)attributes.get("ppCount");

		if (ppCount != null) {
			setPpCount(ppCount);
		}

		Boolean ppLay = (Boolean)attributes.get("ppLay");

		if (ppLay != null) {
			setPpLay(ppLay);
		}

		Boolean ppPastor = (Boolean)attributes.get("ppPastor");

		if (ppPastor != null) {
			setPpPastor(ppPastor);
		}

		Boolean ppStaff = (Boolean)attributes.get("ppStaff");

		if (ppStaff != null) {
			setPpStaff(ppStaff);
		}

		Boolean ppOther = (Boolean)attributes.get("ppOther");

		if (ppOther != null) {
			setPpOther(ppOther);
		}

		String ppAdditionalInformation = (String)attributes.get(
				"ppAdditionalInformation");

		if (ppAdditionalInformation != null) {
			setPpAdditionalInformation(ppAdditionalInformation);
		}

		Double ppPriority = (Double)attributes.get("ppPriority");

		if (ppPriority != null) {
			setPpPriority(ppPriority);
		}
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_columnBitmask |= ORGANIZATIONID_COLUMN_BITMASK;

		if (!_setOriginalOrganizationId) {
			_setOriginalOrganizationId = true;

			_originalOrganizationId = _organizationId;
		}

		_organizationId = organizationId;
	}

	public long getOriginalOrganizationId() {
		return _originalOrganizationId;
	}

	@Override
	public long getCextParticipationOtherId() {
		return _cextParticipationOtherId;
	}

	@Override
	public void setCextParticipationOtherId(long cextParticipationOtherId) {
		_cextParticipationOtherId = cextParticipationOtherId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
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
	public String getPpGathering() {
		if (_ppGathering == null) {
			return "";
		}
		else {
			return _ppGathering;
		}
	}

	@Override
	public void setPpGathering(String ppGathering) {
		_ppGathering = ppGathering;
	}

	@Override
	public int getPpCount() {
		return _ppCount;
	}

	@Override
	public void setPpCount(int ppCount) {
		_ppCount = ppCount;
	}

	@Override
	public boolean getPpLay() {
		return _ppLay;
	}

	@Override
	public boolean isPpLay() {
		return _ppLay;
	}

	@Override
	public void setPpLay(boolean ppLay) {
		_ppLay = ppLay;
	}

	@Override
	public boolean getPpPastor() {
		return _ppPastor;
	}

	@Override
	public boolean isPpPastor() {
		return _ppPastor;
	}

	@Override
	public void setPpPastor(boolean ppPastor) {
		_ppPastor = ppPastor;
	}

	@Override
	public boolean getPpStaff() {
		return _ppStaff;
	}

	@Override
	public boolean isPpStaff() {
		return _ppStaff;
	}

	@Override
	public void setPpStaff(boolean ppStaff) {
		_ppStaff = ppStaff;
	}

	@Override
	public boolean getPpOther() {
		return _ppOther;
	}

	@Override
	public boolean isPpOther() {
		return _ppOther;
	}

	@Override
	public void setPpOther(boolean ppOther) {
		_ppOther = ppOther;
	}

	@Override
	public String getPpAdditionalInformation() {
		if (_ppAdditionalInformation == null) {
			return "";
		}
		else {
			return _ppAdditionalInformation;
		}
	}

	@Override
	public void setPpAdditionalInformation(String ppAdditionalInformation) {
		_ppAdditionalInformation = ppAdditionalInformation;
	}

	@Override
	public double getPpPriority() {
		return _ppPriority;
	}

	@Override
	public void setPpPriority(double ppPriority) {
		_columnBitmask = -1L;

		_ppPriority = ppPriority;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public CExtParticipationOther toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CExtParticipationOther)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CExtParticipationOtherImpl cExtParticipationOtherImpl = new CExtParticipationOtherImpl();

		cExtParticipationOtherImpl.setOrganizationId(getOrganizationId());
		cExtParticipationOtherImpl.setCextParticipationOtherId(getCextParticipationOtherId());
		cExtParticipationOtherImpl.setCompanyId(getCompanyId());
		cExtParticipationOtherImpl.setUserId(getUserId());
		cExtParticipationOtherImpl.setCreateDate(getCreateDate());
		cExtParticipationOtherImpl.setModifiedDate(getModifiedDate());
		cExtParticipationOtherImpl.setPpGathering(getPpGathering());
		cExtParticipationOtherImpl.setPpCount(getPpCount());
		cExtParticipationOtherImpl.setPpLay(isPpLay());
		cExtParticipationOtherImpl.setPpPastor(isPpPastor());
		cExtParticipationOtherImpl.setPpStaff(isPpStaff());
		cExtParticipationOtherImpl.setPpOther(isPpOther());
		cExtParticipationOtherImpl.setPpAdditionalInformation(getPpAdditionalInformation());
		cExtParticipationOtherImpl.setPpPriority(getPpPriority());

		cExtParticipationOtherImpl.resetOriginalValues();

		return cExtParticipationOtherImpl;
	}

	@Override
	public int compareTo(CExtParticipationOther cExtParticipationOther) {
		int value = 0;

		if (getPpPriority() < cExtParticipationOther.getPpPriority()) {
			value = -1;
		}
		else if (getPpPriority() > cExtParticipationOther.getPpPriority()) {
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

		if (!(obj instanceof CExtParticipationOther)) {
			return false;
		}

		CExtParticipationOther cExtParticipationOther = (CExtParticipationOther)obj;

		CExtParticipationOtherPK primaryKey = cExtParticipationOther.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
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
		CExtParticipationOtherModelImpl cExtParticipationOtherModelImpl = this;

		cExtParticipationOtherModelImpl._originalOrganizationId = cExtParticipationOtherModelImpl._organizationId;

		cExtParticipationOtherModelImpl._setOriginalOrganizationId = false;

		cExtParticipationOtherModelImpl._setModifiedDate = false;

		cExtParticipationOtherModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CExtParticipationOther> toCacheModel() {
		CExtParticipationOtherCacheModel cExtParticipationOtherCacheModel = new CExtParticipationOtherCacheModel();

		cExtParticipationOtherCacheModel.cExtParticipationOtherPK = getPrimaryKey();

		cExtParticipationOtherCacheModel.organizationId = getOrganizationId();

		cExtParticipationOtherCacheModel.cextParticipationOtherId = getCextParticipationOtherId();

		cExtParticipationOtherCacheModel.companyId = getCompanyId();

		cExtParticipationOtherCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			cExtParticipationOtherCacheModel.createDate = createDate.getTime();
		}
		else {
			cExtParticipationOtherCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			cExtParticipationOtherCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			cExtParticipationOtherCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		cExtParticipationOtherCacheModel.ppGathering = getPpGathering();

		String ppGathering = cExtParticipationOtherCacheModel.ppGathering;

		if ((ppGathering != null) && (ppGathering.length() == 0)) {
			cExtParticipationOtherCacheModel.ppGathering = null;
		}

		cExtParticipationOtherCacheModel.ppCount = getPpCount();

		cExtParticipationOtherCacheModel.ppLay = isPpLay();

		cExtParticipationOtherCacheModel.ppPastor = isPpPastor();

		cExtParticipationOtherCacheModel.ppStaff = isPpStaff();

		cExtParticipationOtherCacheModel.ppOther = isPpOther();

		cExtParticipationOtherCacheModel.ppAdditionalInformation = getPpAdditionalInformation();

		String ppAdditionalInformation = cExtParticipationOtherCacheModel.ppAdditionalInformation;

		if ((ppAdditionalInformation != null) &&
				(ppAdditionalInformation.length() == 0)) {
			cExtParticipationOtherCacheModel.ppAdditionalInformation = null;
		}

		cExtParticipationOtherCacheModel.ppPriority = getPpPriority();

		return cExtParticipationOtherCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{organizationId=");
		sb.append(getOrganizationId());
		sb.append(", cextParticipationOtherId=");
		sb.append(getCextParticipationOtherId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", ppGathering=");
		sb.append(getPpGathering());
		sb.append(", ppCount=");
		sb.append(getPpCount());
		sb.append(", ppLay=");
		sb.append(isPpLay());
		sb.append(", ppPastor=");
		sb.append(isPpPastor());
		sb.append(", ppStaff=");
		sb.append(isPpStaff());
		sb.append(", ppOther=");
		sb.append(isPpOther());
		sb.append(", ppAdditionalInformation=");
		sb.append(getPpAdditionalInformation());
		sb.append(", ppPriority=");
		sb.append(getPpPriority());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("ucc.portal.model.CExtParticipationOther");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cextParticipationOtherId</column-name><column-value><![CDATA[");
		sb.append(getCextParticipationOtherId());
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
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppGathering</column-name><column-value><![CDATA[");
		sb.append(getPpGathering());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppCount</column-name><column-value><![CDATA[");
		sb.append(getPpCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppLay</column-name><column-value><![CDATA[");
		sb.append(isPpLay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppPastor</column-name><column-value><![CDATA[");
		sb.append(isPpPastor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppStaff</column-name><column-value><![CDATA[");
		sb.append(isPpStaff());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppOther</column-name><column-value><![CDATA[");
		sb.append(isPpOther());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppAdditionalInformation</column-name><column-value><![CDATA[");
		sb.append(getPpAdditionalInformation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppPriority</column-name><column-value><![CDATA[");
		sb.append(getPpPriority());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CExtParticipationOther.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CExtParticipationOther.class, ModelWrapper.class
		};
	private long _organizationId;
	private long _originalOrganizationId;
	private boolean _setOriginalOrganizationId;
	private long _cextParticipationOtherId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _ppGathering;
	private int _ppCount;
	private boolean _ppLay;
	private boolean _ppPastor;
	private boolean _ppStaff;
	private boolean _ppOther;
	private String _ppAdditionalInformation;
	private double _ppPriority;
	private long _columnBitmask;
	private CExtParticipationOther _escapedModel;
}