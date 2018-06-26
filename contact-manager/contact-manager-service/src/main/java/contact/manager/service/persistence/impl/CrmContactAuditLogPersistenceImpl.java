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

package contact.manager.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.exception.NoSuchCrmContactAuditLogException;

import contact.manager.model.CrmContactAuditLog;
import contact.manager.model.impl.CrmContactAuditLogImpl;
import contact.manager.model.impl.CrmContactAuditLogModelImpl;

import contact.manager.service.persistence.CrmContactAuditLogPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the CRM Contact Audit Log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogPersistence
 * @see contact.manager.service.persistence.CrmContactAuditLogUtil
 * @generated
 */
@ProviderType
public class CrmContactAuditLogPersistenceImpl extends BasePersistenceImpl<CrmContactAuditLog>
	implements CrmContactAuditLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmContactAuditLogUtil} to access the CRM Contact Audit Log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmContactAuditLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CrmContactAuditLogModelImpl.UUID_COLUMN_BITMASK |
			CrmContactAuditLogModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM Contact Audit Logs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Logs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @return the range of matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Logs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Logs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<CrmContactAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContactAuditLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContactAuditLog crmContactAuditLog : list) {
					if (!Objects.equals(uuid, crmContactAuditLog.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CRMCONTACTAUDITLOG_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmContactAuditLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<CrmContactAuditLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContactAuditLog>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first CRM Contact Audit Log in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog findByUuid_First(String uuid,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = fetchByUuid_First(uuid,
				orderByComparator);

		if (crmContactAuditLog != null) {
			return crmContactAuditLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactAuditLogException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact Audit Log in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog fetchByUuid_First(String uuid,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		List<CrmContactAuditLog> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact Audit Log in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog findByUuid_Last(String uuid,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = fetchByUuid_Last(uuid,
				orderByComparator);

		if (crmContactAuditLog != null) {
			return crmContactAuditLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactAuditLogException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact Audit Log in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog fetchByUuid_Last(String uuid,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmContactAuditLog> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contact Audit Logs before and after the current CRM Contact Audit Log in the ordered set where uuid = &#63;.
	 *
	 * @param crmContactAuditLogId the primary key of the current CRM Contact Audit Log
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLog[] findByUuid_PrevAndNext(
		long crmContactAuditLogId, String uuid,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = findByPrimaryKey(crmContactAuditLogId);

		Session session = null;

		try {
			session = openSession();

			CrmContactAuditLog[] array = new CrmContactAuditLogImpl[3];

			array[0] = getByUuid_PrevAndNext(session, crmContactAuditLog, uuid,
					orderByComparator, true);

			array[1] = crmContactAuditLog;

			array[2] = getByUuid_PrevAndNext(session, crmContactAuditLog, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmContactAuditLog getByUuid_PrevAndNext(Session session,
		CrmContactAuditLog crmContactAuditLog, String uuid,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMCONTACTAUDITLOG_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CrmContactAuditLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(crmContactAuditLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContactAuditLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contact Audit Logs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmContactAuditLog crmContactAuditLog : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmContactAuditLog);
		}
	}

	/**
	 * Returns the number of CRM Contact Audit Logs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Contact Audit Logs
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCONTACTAUDITLOG_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "crmContactAuditLog.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmContactAuditLog.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(crmContactAuditLog.uuid IS NULL OR crmContactAuditLog.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmContactAuditLogModelImpl.UUID_COLUMN_BITMASK |
			CrmContactAuditLogModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the CRM Contact Audit Log where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmContactAuditLogException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = fetchByUUID_G(uuid, groupId);

		if (crmContactAuditLog == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchCrmContactAuditLogException(msg.toString());
		}

		return crmContactAuditLog;
	}

	/**
	 * Returns the CRM Contact Audit Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the CRM Contact Audit Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CrmContactAuditLog) {
			CrmContactAuditLog crmContactAuditLog = (CrmContactAuditLog)result;

			if (!Objects.equals(uuid, crmContactAuditLog.getUuid()) ||
					(groupId != crmContactAuditLog.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMCONTACTAUDITLOG_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<CrmContactAuditLog> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CrmContactAuditLog crmContactAuditLog = list.get(0);

					result = crmContactAuditLog;

					cacheResult(crmContactAuditLog);

					if ((crmContactAuditLog.getUuid() == null) ||
							!crmContactAuditLog.getUuid().equals(uuid) ||
							(crmContactAuditLog.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, crmContactAuditLog);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (CrmContactAuditLog)result;
		}
	}

	/**
	 * Removes the CRM Contact Audit Log where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Contact Audit Log that was removed
	 */
	@Override
	public CrmContactAuditLog removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = findByUUID_G(uuid, groupId);

		return remove(crmContactAuditLog);
	}

	/**
	 * Returns the number of CRM Contact Audit Logs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Contact Audit Logs
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCONTACTAUDITLOG_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "crmContactAuditLog.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "crmContactAuditLog.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(crmContactAuditLog.uuid IS NULL OR crmContactAuditLog.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "crmContactAuditLog.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmContactAuditLogModelImpl.UUID_COLUMN_BITMASK |
			CrmContactAuditLogModelImpl.COMPANYID_COLUMN_BITMASK |
			CrmContactAuditLogModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @return the range of matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<CrmContactAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContactAuditLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContactAuditLog crmContactAuditLog : list) {
					if (!Objects.equals(uuid, crmContactAuditLog.getUuid()) ||
							(companyId != crmContactAuditLog.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CRMCONTACTAUDITLOG_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmContactAuditLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<CrmContactAuditLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContactAuditLog>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = fetchByUuid_C_First(uuid,
				companyId, orderByComparator);

		if (crmContactAuditLog != null) {
			return crmContactAuditLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactAuditLogException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		List<CrmContactAuditLog> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = fetchByUuid_C_Last(uuid,
				companyId, orderByComparator);

		if (crmContactAuditLog != null) {
			return crmContactAuditLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactAuditLogException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmContactAuditLog> list = findByUuid_C(uuid, companyId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contact Audit Logs before and after the current CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmContactAuditLogId the primary key of the current CRM Contact Audit Log
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLog[] findByUuid_C_PrevAndNext(
		long crmContactAuditLogId, String uuid, long companyId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = findByPrimaryKey(crmContactAuditLogId);

		Session session = null;

		try {
			session = openSession();

			CrmContactAuditLog[] array = new CrmContactAuditLogImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, crmContactAuditLog,
					uuid, companyId, orderByComparator, true);

			array[1] = crmContactAuditLog;

			array[2] = getByUuid_C_PrevAndNext(session, crmContactAuditLog,
					uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmContactAuditLog getByUuid_C_PrevAndNext(Session session,
		CrmContactAuditLog crmContactAuditLog, String uuid, long companyId,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMCONTACTAUDITLOG_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CrmContactAuditLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(crmContactAuditLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContactAuditLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmContactAuditLog crmContactAuditLog : findByUuid_C(uuid,
				companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmContactAuditLog);
		}
	}

	/**
	 * Returns the number of CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Contact Audit Logs
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCONTACTAUDITLOG_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "crmContactAuditLog.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "crmContactAuditLog.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(crmContactAuditLog.uuid IS NULL OR crmContactAuditLog.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "crmContactAuditLog.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CRMCONTACTID =
		new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCrmContactId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID =
		new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCrmContactId",
			new String[] { Long.class.getName() },
			CrmContactAuditLogModelImpl.CRMCONTACTID_COLUMN_BITMASK |
			CrmContactAuditLogModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CRMCONTACTID = new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCrmContactId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the CRM Contact Audit Logs where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @return the matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByCrmContactId(long crmContactId) {
		return findByCrmContactId(crmContactId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Logs where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @return the range of matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByCrmContactId(long crmContactId,
		int start, int end) {
		return findByCrmContactId(crmContactId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Logs where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByCrmContactId(long crmContactId,
		int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return findByCrmContactId(crmContactId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Logs where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByCrmContactId(long crmContactId,
		int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID;
			finderArgs = new Object[] { crmContactId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CRMCONTACTID;
			finderArgs = new Object[] {
					crmContactId,
					
					start, end, orderByComparator
				};
		}

		List<CrmContactAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContactAuditLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContactAuditLog crmContactAuditLog : list) {
					if ((crmContactId != crmContactAuditLog.getCrmContactId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CRMCONTACTAUDITLOG_WHERE);

			query.append(_FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmContactAuditLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(crmContactId);

				if (!pagination) {
					list = (List<CrmContactAuditLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContactAuditLog>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog findByCrmContactId_First(long crmContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = fetchByCrmContactId_First(crmContactId,
				orderByComparator);

		if (crmContactAuditLog != null) {
			return crmContactAuditLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("crmContactId=");
		msg.append(crmContactId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactAuditLogException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog fetchByCrmContactId_First(long crmContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		List<CrmContactAuditLog> list = findByCrmContactId(crmContactId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog findByCrmContactId_Last(long crmContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = fetchByCrmContactId_Last(crmContactId,
				orderByComparator);

		if (crmContactAuditLog != null) {
			return crmContactAuditLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("crmContactId=");
		msg.append(crmContactId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactAuditLogException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog fetchByCrmContactId_Last(long crmContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		int count = countByCrmContactId(crmContactId);

		if (count == 0) {
			return null;
		}

		List<CrmContactAuditLog> list = findByCrmContactId(crmContactId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contact Audit Logs before and after the current CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactAuditLogId the primary key of the current CRM Contact Audit Log
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLog[] findByCrmContactId_PrevAndNext(
		long crmContactAuditLogId, long crmContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = findByPrimaryKey(crmContactAuditLogId);

		Session session = null;

		try {
			session = openSession();

			CrmContactAuditLog[] array = new CrmContactAuditLogImpl[3];

			array[0] = getByCrmContactId_PrevAndNext(session,
					crmContactAuditLog, crmContactId, orderByComparator, true);

			array[1] = crmContactAuditLog;

			array[2] = getByCrmContactId_PrevAndNext(session,
					crmContactAuditLog, crmContactId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmContactAuditLog getByCrmContactId_PrevAndNext(
		Session session, CrmContactAuditLog crmContactAuditLog,
		long crmContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMCONTACTAUDITLOG_WHERE);

		query.append(_FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CrmContactAuditLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(crmContactId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(crmContactAuditLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContactAuditLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contact Audit Logs where crmContactId = &#63; from the database.
	 *
	 * @param crmContactId the crm contact ID
	 */
	@Override
	public void removeByCrmContactId(long crmContactId) {
		for (CrmContactAuditLog crmContactAuditLog : findByCrmContactId(
				crmContactId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmContactAuditLog);
		}
	}

	/**
	 * Returns the number of CRM Contact Audit Logs where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @return the number of matching CRM Contact Audit Logs
	 */
	@Override
	public int countByCrmContactId(long crmContactId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CRMCONTACTID;

		Object[] finderArgs = new Object[] { crmContactId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCONTACTAUDITLOG_WHERE);

			query.append(_FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(crmContactId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2 = "crmContactAuditLog.crmContactId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONSTANTCONTACTID =
		new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConstantContactId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSTANTCONTACTID =
		new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConstantContactId", new String[] { Long.class.getName() },
			CrmContactAuditLogModelImpl.CONSTANTCONTACTID_COLUMN_BITMASK |
			CrmContactAuditLogModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONSTANTCONTACTID = new FinderPath(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConstantContactId", new String[] { Long.class.getName() });

	/**
	 * Returns all the CRM Contact Audit Logs where constantContactId = &#63;.
	 *
	 * @param constantContactId the constant contact ID
	 * @return the matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByConstantContactId(
		long constantContactId) {
		return findByConstantContactId(constantContactId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Logs where constantContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param constantContactId the constant contact ID
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @return the range of matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByConstantContactId(
		long constantContactId, int start, int end) {
		return findByConstantContactId(constantContactId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Logs where constantContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param constantContactId the constant contact ID
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByConstantContactId(
		long constantContactId, int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return findByConstantContactId(constantContactId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Logs where constantContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param constantContactId the constant contact ID
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findByConstantContactId(
		long constantContactId, int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSTANTCONTACTID;
			finderArgs = new Object[] { constantContactId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONSTANTCONTACTID;
			finderArgs = new Object[] {
					constantContactId,
					
					start, end, orderByComparator
				};
		}

		List<CrmContactAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContactAuditLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContactAuditLog crmContactAuditLog : list) {
					if ((constantContactId != crmContactAuditLog.getConstantContactId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CRMCONTACTAUDITLOG_WHERE);

			query.append(_FINDER_COLUMN_CONSTANTCONTACTID_CONSTANTCONTACTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmContactAuditLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(constantContactId);

				if (!pagination) {
					list = (List<CrmContactAuditLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContactAuditLog>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	 *
	 * @param constantContactId the constant contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog findByConstantContactId_First(
		long constantContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = fetchByConstantContactId_First(constantContactId,
				orderByComparator);

		if (crmContactAuditLog != null) {
			return crmContactAuditLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("constantContactId=");
		msg.append(constantContactId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactAuditLogException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	 *
	 * @param constantContactId the constant contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog fetchByConstantContactId_First(
		long constantContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		List<CrmContactAuditLog> list = findByConstantContactId(constantContactId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	 *
	 * @param constantContactId the constant contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog findByConstantContactId_Last(
		long constantContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = fetchByConstantContactId_Last(constantContactId,
				orderByComparator);

		if (crmContactAuditLog != null) {
			return crmContactAuditLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("constantContactId=");
		msg.append(constantContactId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactAuditLogException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	 *
	 * @param constantContactId the constant contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	 */
	@Override
	public CrmContactAuditLog fetchByConstantContactId_Last(
		long constantContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		int count = countByConstantContactId(constantContactId);

		if (count == 0) {
			return null;
		}

		List<CrmContactAuditLog> list = findByConstantContactId(constantContactId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contact Audit Logs before and after the current CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	 *
	 * @param crmContactAuditLogId the primary key of the current CRM Contact Audit Log
	 * @param constantContactId the constant contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLog[] findByConstantContactId_PrevAndNext(
		long crmContactAuditLogId, long constantContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = findByPrimaryKey(crmContactAuditLogId);

		Session session = null;

		try {
			session = openSession();

			CrmContactAuditLog[] array = new CrmContactAuditLogImpl[3];

			array[0] = getByConstantContactId_PrevAndNext(session,
					crmContactAuditLog, constantContactId, orderByComparator,
					true);

			array[1] = crmContactAuditLog;

			array[2] = getByConstantContactId_PrevAndNext(session,
					crmContactAuditLog, constantContactId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmContactAuditLog getByConstantContactId_PrevAndNext(
		Session session, CrmContactAuditLog crmContactAuditLog,
		long constantContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMCONTACTAUDITLOG_WHERE);

		query.append(_FINDER_COLUMN_CONSTANTCONTACTID_CONSTANTCONTACTID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CrmContactAuditLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(constantContactId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(crmContactAuditLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContactAuditLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contact Audit Logs where constantContactId = &#63; from the database.
	 *
	 * @param constantContactId the constant contact ID
	 */
	@Override
	public void removeByConstantContactId(long constantContactId) {
		for (CrmContactAuditLog crmContactAuditLog : findByConstantContactId(
				constantContactId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmContactAuditLog);
		}
	}

	/**
	 * Returns the number of CRM Contact Audit Logs where constantContactId = &#63;.
	 *
	 * @param constantContactId the constant contact ID
	 * @return the number of matching CRM Contact Audit Logs
	 */
	@Override
	public int countByConstantContactId(long constantContactId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONSTANTCONTACTID;

		Object[] finderArgs = new Object[] { constantContactId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCONTACTAUDITLOG_WHERE);

			query.append(_FINDER_COLUMN_CONSTANTCONTACTID_CONSTANTCONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(constantContactId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CONSTANTCONTACTID_CONSTANTCONTACTID_2 =
		"crmContactAuditLog.constantContactId = ?";

	public CrmContactAuditLogPersistenceImpl() {
		setModelClass(CrmContactAuditLog.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the CRM Contact Audit Log in the entity cache if it is enabled.
	 *
	 * @param crmContactAuditLog the CRM Contact Audit Log
	 */
	@Override
	public void cacheResult(CrmContactAuditLog crmContactAuditLog) {
		entityCache.putResult(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogImpl.class, crmContactAuditLog.getPrimaryKey(),
			crmContactAuditLog);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] {
				crmContactAuditLog.getUuid(), crmContactAuditLog.getGroupId()
			}, crmContactAuditLog);

		crmContactAuditLog.resetOriginalValues();
	}

	/**
	 * Caches the CRM Contact Audit Logs in the entity cache if it is enabled.
	 *
	 * @param crmContactAuditLogs the CRM Contact Audit Logs
	 */
	@Override
	public void cacheResult(List<CrmContactAuditLog> crmContactAuditLogs) {
		for (CrmContactAuditLog crmContactAuditLog : crmContactAuditLogs) {
			if (entityCache.getResult(
						CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
						CrmContactAuditLogImpl.class,
						crmContactAuditLog.getPrimaryKey()) == null) {
				cacheResult(crmContactAuditLog);
			}
			else {
				crmContactAuditLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM Contact Audit Logs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmContactAuditLogImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM Contact Audit Log.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmContactAuditLog crmContactAuditLog) {
		entityCache.removeResult(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogImpl.class, crmContactAuditLog.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmContactAuditLogModelImpl)crmContactAuditLog,
			true);
	}

	@Override
	public void clearCache(List<CrmContactAuditLog> crmContactAuditLogs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmContactAuditLog crmContactAuditLog : crmContactAuditLogs) {
			entityCache.removeResult(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
				CrmContactAuditLogImpl.class, crmContactAuditLog.getPrimaryKey());

			clearUniqueFindersCache((CrmContactAuditLogModelImpl)crmContactAuditLog,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		CrmContactAuditLogModelImpl crmContactAuditLogModelImpl) {
		Object[] args = new Object[] {
				crmContactAuditLogModelImpl.getUuid(),
				crmContactAuditLogModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			crmContactAuditLogModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmContactAuditLogModelImpl crmContactAuditLogModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					crmContactAuditLogModelImpl.getUuid(),
					crmContactAuditLogModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((crmContactAuditLogModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmContactAuditLogModelImpl.getOriginalUuid(),
					crmContactAuditLogModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new CRM Contact Audit Log with the primary key. Does not add the CRM Contact Audit Log to the database.
	 *
	 * @param crmContactAuditLogId the primary key for the new CRM Contact Audit Log
	 * @return the new CRM Contact Audit Log
	 */
	@Override
	public CrmContactAuditLog create(long crmContactAuditLogId) {
		CrmContactAuditLog crmContactAuditLog = new CrmContactAuditLogImpl();

		crmContactAuditLog.setNew(true);
		crmContactAuditLog.setPrimaryKey(crmContactAuditLogId);

		String uuid = PortalUUIDUtil.generate();

		crmContactAuditLog.setUuid(uuid);

		crmContactAuditLog.setCompanyId(companyProvider.getCompanyId());

		return crmContactAuditLog;
	}

	/**
	 * Removes the CRM Contact Audit Log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	 * @return the CRM Contact Audit Log that was removed
	 * @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLog remove(long crmContactAuditLogId)
		throws NoSuchCrmContactAuditLogException {
		return remove((Serializable)crmContactAuditLogId);
	}

	/**
	 * Removes the CRM Contact Audit Log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM Contact Audit Log
	 * @return the CRM Contact Audit Log that was removed
	 * @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLog remove(Serializable primaryKey)
		throws NoSuchCrmContactAuditLogException {
		Session session = null;

		try {
			session = openSession();

			CrmContactAuditLog crmContactAuditLog = (CrmContactAuditLog)session.get(CrmContactAuditLogImpl.class,
					primaryKey);

			if (crmContactAuditLog == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmContactAuditLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmContactAuditLog);
		}
		catch (NoSuchCrmContactAuditLogException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CrmContactAuditLog removeImpl(
		CrmContactAuditLog crmContactAuditLog) {
		crmContactAuditLog = toUnwrappedModel(crmContactAuditLog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmContactAuditLog)) {
				crmContactAuditLog = (CrmContactAuditLog)session.get(CrmContactAuditLogImpl.class,
						crmContactAuditLog.getPrimaryKeyObj());
			}

			if (crmContactAuditLog != null) {
				session.delete(crmContactAuditLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmContactAuditLog != null) {
			clearCache(crmContactAuditLog);
		}

		return crmContactAuditLog;
	}

	@Override
	public CrmContactAuditLog updateImpl(CrmContactAuditLog crmContactAuditLog) {
		crmContactAuditLog = toUnwrappedModel(crmContactAuditLog);

		boolean isNew = crmContactAuditLog.isNew();

		CrmContactAuditLogModelImpl crmContactAuditLogModelImpl = (CrmContactAuditLogModelImpl)crmContactAuditLog;

		if (Validator.isNull(crmContactAuditLog.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmContactAuditLog.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmContactAuditLog.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmContactAuditLog.setCreateDate(now);
			}
			else {
				crmContactAuditLog.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!crmContactAuditLogModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmContactAuditLog.setModifiedDate(now);
			}
			else {
				crmContactAuditLog.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmContactAuditLog.isNew()) {
				session.save(crmContactAuditLog);

				crmContactAuditLog.setNew(false);
			}
			else {
				crmContactAuditLog = (CrmContactAuditLog)session.merge(crmContactAuditLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmContactAuditLogModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { crmContactAuditLogModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					crmContactAuditLogModelImpl.getUuid(),
					crmContactAuditLogModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { crmContactAuditLogModelImpl.getCrmContactId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CRMCONTACTID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID,
				args);

			args = new Object[] {
					crmContactAuditLogModelImpl.getConstantContactId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CONSTANTCONTACTID,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSTANTCONTACTID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((crmContactAuditLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactAuditLogModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { crmContactAuditLogModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((crmContactAuditLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactAuditLogModelImpl.getOriginalUuid(),
						crmContactAuditLogModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						crmContactAuditLogModelImpl.getUuid(),
						crmContactAuditLogModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((crmContactAuditLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactAuditLogModelImpl.getOriginalCrmContactId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRMCONTACTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID,
					args);

				args = new Object[] {
						crmContactAuditLogModelImpl.getCrmContactId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRMCONTACTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID,
					args);
			}

			if ((crmContactAuditLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSTANTCONTACTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactAuditLogModelImpl.getOriginalConstantContactId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONSTANTCONTACTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSTANTCONTACTID,
					args);

				args = new Object[] {
						crmContactAuditLogModelImpl.getConstantContactId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONSTANTCONTACTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSTANTCONTACTID,
					args);
			}
		}

		entityCache.putResult(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogImpl.class, crmContactAuditLog.getPrimaryKey(),
			crmContactAuditLog, false);

		clearUniqueFindersCache(crmContactAuditLogModelImpl, false);
		cacheUniqueFindersCache(crmContactAuditLogModelImpl);

		crmContactAuditLog.resetOriginalValues();

		return crmContactAuditLog;
	}

	protected CrmContactAuditLog toUnwrappedModel(
		CrmContactAuditLog crmContactAuditLog) {
		if (crmContactAuditLog instanceof CrmContactAuditLogImpl) {
			return crmContactAuditLog;
		}

		CrmContactAuditLogImpl crmContactAuditLogImpl = new CrmContactAuditLogImpl();

		crmContactAuditLogImpl.setNew(crmContactAuditLog.isNew());
		crmContactAuditLogImpl.setPrimaryKey(crmContactAuditLog.getPrimaryKey());

		crmContactAuditLogImpl.setUuid(crmContactAuditLog.getUuid());
		crmContactAuditLogImpl.setCrmContactAuditLogId(crmContactAuditLog.getCrmContactAuditLogId());
		crmContactAuditLogImpl.setGroupId(crmContactAuditLog.getGroupId());
		crmContactAuditLogImpl.setCompanyId(crmContactAuditLog.getCompanyId());
		crmContactAuditLogImpl.setUserId(crmContactAuditLog.getUserId());
		crmContactAuditLogImpl.setUserName(crmContactAuditLog.getUserName());
		crmContactAuditLogImpl.setCreateDate(crmContactAuditLog.getCreateDate());
		crmContactAuditLogImpl.setModifiedDate(crmContactAuditLog.getModifiedDate());
		crmContactAuditLogImpl.setCrmContactId(crmContactAuditLog.getCrmContactId());
		crmContactAuditLogImpl.setConstantContactId(crmContactAuditLog.getConstantContactId());
		crmContactAuditLogImpl.setAction(crmContactAuditLog.getAction());
		crmContactAuditLogImpl.setOldSnapshot(crmContactAuditLog.getOldSnapshot());
		crmContactAuditLogImpl.setNewSnapshot(crmContactAuditLog.getNewSnapshot());

		return crmContactAuditLogImpl;
	}

	/**
	 * Returns the CRM Contact Audit Log with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Contact Audit Log
	 * @return the CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmContactAuditLogException {
		CrmContactAuditLog crmContactAuditLog = fetchByPrimaryKey(primaryKey);

		if (crmContactAuditLog == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmContactAuditLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmContactAuditLog;
	}

	/**
	 * Returns the CRM Contact Audit Log with the primary key or throws a {@link NoSuchCrmContactAuditLogException} if it could not be found.
	 *
	 * @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	 * @return the CRM Contact Audit Log
	 * @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLog findByPrimaryKey(long crmContactAuditLogId)
		throws NoSuchCrmContactAuditLogException {
		return findByPrimaryKey((Serializable)crmContactAuditLogId);
	}

	/**
	 * Returns the CRM Contact Audit Log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Contact Audit Log
	 * @return the CRM Contact Audit Log, or <code>null</code> if a CRM Contact Audit Log with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLog fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
				CrmContactAuditLogImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmContactAuditLog crmContactAuditLog = (CrmContactAuditLog)serializable;

		if (crmContactAuditLog == null) {
			Session session = null;

			try {
				session = openSession();

				crmContactAuditLog = (CrmContactAuditLog)session.get(CrmContactAuditLogImpl.class,
						primaryKey);

				if (crmContactAuditLog != null) {
					cacheResult(crmContactAuditLog);
				}
				else {
					entityCache.putResult(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
						CrmContactAuditLogImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
					CrmContactAuditLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmContactAuditLog;
	}

	/**
	 * Returns the CRM Contact Audit Log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	 * @return the CRM Contact Audit Log, or <code>null</code> if a CRM Contact Audit Log with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLog fetchByPrimaryKey(long crmContactAuditLogId) {
		return fetchByPrimaryKey((Serializable)crmContactAuditLogId);
	}

	@Override
	public Map<Serializable, CrmContactAuditLog> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmContactAuditLog> map = new HashMap<Serializable, CrmContactAuditLog>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmContactAuditLog crmContactAuditLog = fetchByPrimaryKey(primaryKey);

			if (crmContactAuditLog != null) {
				map.put(primaryKey, crmContactAuditLog);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
					CrmContactAuditLogImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmContactAuditLog)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMCONTACTAUDITLOG_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (CrmContactAuditLog crmContactAuditLog : (List<CrmContactAuditLog>)q.list()) {
				map.put(crmContactAuditLog.getPrimaryKeyObj(),
					crmContactAuditLog);

				cacheResult(crmContactAuditLog);

				uncachedPrimaryKeys.remove(crmContactAuditLog.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
					CrmContactAuditLogImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the CRM Contact Audit Logs.
	 *
	 * @return the CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @return the range of CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findAll(int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM Contact Audit Logs
	 */
	@Override
	public List<CrmContactAuditLog> findAll(int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CrmContactAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContactAuditLog>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMCONTACTAUDITLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMCONTACTAUDITLOG;

				if (pagination) {
					sql = sql.concat(CrmContactAuditLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmContactAuditLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContactAuditLog>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the CRM Contact Audit Logs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmContactAuditLog crmContactAuditLog : findAll()) {
			remove(crmContactAuditLog);
		}
	}

	/**
	 * Returns the number of CRM Contact Audit Logs.
	 *
	 * @return the number of CRM Contact Audit Logs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMCONTACTAUDITLOG);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CrmContactAuditLogModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM Contact Audit Log persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CrmContactAuditLogImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CRMCONTACTAUDITLOG = "SELECT crmContactAuditLog FROM CrmContactAuditLog crmContactAuditLog";
	private static final String _SQL_SELECT_CRMCONTACTAUDITLOG_WHERE_PKS_IN = "SELECT crmContactAuditLog FROM CrmContactAuditLog crmContactAuditLog WHERE crmContactAuditLogId IN (";
	private static final String _SQL_SELECT_CRMCONTACTAUDITLOG_WHERE = "SELECT crmContactAuditLog FROM CrmContactAuditLog crmContactAuditLog WHERE ";
	private static final String _SQL_COUNT_CRMCONTACTAUDITLOG = "SELECT COUNT(crmContactAuditLog) FROM CrmContactAuditLog crmContactAuditLog";
	private static final String _SQL_COUNT_CRMCONTACTAUDITLOG_WHERE = "SELECT COUNT(crmContactAuditLog) FROM CrmContactAuditLog crmContactAuditLog WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmContactAuditLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmContactAuditLog exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CrmContactAuditLog exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CrmContactAuditLogPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}