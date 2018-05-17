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

import contact.manager.exception.NoSuchCrmOutreachLogException;

import contact.manager.model.CrmOutreachLog;
import contact.manager.model.impl.CrmOutreachLogImpl;
import contact.manager.model.impl.CrmOutreachLogModelImpl;

import contact.manager.service.persistence.CrmOutreachLogPersistence;

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
 * The persistence implementation for the CRM Outreach Log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmOutreachLogPersistence
 * @see contact.manager.service.persistence.CrmOutreachLogUtil
 * @generated
 */
@ProviderType
public class CrmOutreachLogPersistenceImpl extends BasePersistenceImpl<CrmOutreachLog>
	implements CrmOutreachLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmOutreachLogUtil} to access the CRM Outreach Log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmOutreachLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CrmOutreachLogModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM Outreach Logs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Outreach Logs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @return the range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator,
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

		List<CrmOutreachLog> list = null;

		if (retrieveFromCache) {
			list = (List<CrmOutreachLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmOutreachLog crmOutreachLog : list) {
					if (!Objects.equals(uuid, crmOutreachLog.getUuid())) {
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

			query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

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
				query.append(CrmOutreachLogModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmOutreachLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmOutreachLog>)QueryUtil.list(q,
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
	 * Returns the first CRM Outreach Log in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Outreach Log
	 * @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog findByUuid_First(String uuid,
		OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {
		CrmOutreachLog crmOutreachLog = fetchByUuid_First(uuid,
				orderByComparator);

		if (crmOutreachLog != null) {
			return crmOutreachLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmOutreachLogException(msg.toString());
	}

	/**
	 * Returns the first CRM Outreach Log in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog fetchByUuid_First(String uuid,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		List<CrmOutreachLog> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Outreach Log in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Outreach Log
	 * @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog findByUuid_Last(String uuid,
		OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {
		CrmOutreachLog crmOutreachLog = fetchByUuid_Last(uuid, orderByComparator);

		if (crmOutreachLog != null) {
			return crmOutreachLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmOutreachLogException(msg.toString());
	}

	/**
	 * Returns the last CRM Outreach Log in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog fetchByUuid_Last(String uuid,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmOutreachLog> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Outreach Logs before and after the current CRM Outreach Log in the ordered set where uuid = &#63;.
	 *
	 * @param crmOutreachLogId the primary key of the current CRM Outreach Log
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Outreach Log
	 * @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	 */
	@Override
	public CrmOutreachLog[] findByUuid_PrevAndNext(long crmOutreachLogId,
		String uuid, OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {
		CrmOutreachLog crmOutreachLog = findByPrimaryKey(crmOutreachLogId);

		Session session = null;

		try {
			session = openSession();

			CrmOutreachLog[] array = new CrmOutreachLogImpl[3];

			array[0] = getByUuid_PrevAndNext(session, crmOutreachLog, uuid,
					orderByComparator, true);

			array[1] = crmOutreachLog;

			array[2] = getByUuid_PrevAndNext(session, crmOutreachLog, uuid,
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

	protected CrmOutreachLog getByUuid_PrevAndNext(Session session,
		CrmOutreachLog crmOutreachLog, String uuid,
		OrderByComparator<CrmOutreachLog> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

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
			query.append(CrmOutreachLogModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmOutreachLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmOutreachLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Outreach Logs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmOutreachLog crmOutreachLog : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmOutreachLog);
		}
	}

	/**
	 * Returns the number of CRM Outreach Logs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Outreach Logs
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMOUTREACHLOG_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "crmOutreachLog.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmOutreachLog.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(crmOutreachLog.uuid IS NULL OR crmOutreachLog.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmOutreachLogModelImpl.UUID_COLUMN_BITMASK |
			CrmOutreachLogModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the CRM Outreach Log where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmOutreachLogException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Outreach Log
	 * @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmOutreachLogException {
		CrmOutreachLog crmOutreachLog = fetchByUUID_G(uuid, groupId);

		if (crmOutreachLog == null) {
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

			throw new NoSuchCrmOutreachLogException(msg.toString());
		}

		return crmOutreachLog;
	}

	/**
	 * Returns the CRM Outreach Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the CRM Outreach Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CrmOutreachLog) {
			CrmOutreachLog crmOutreachLog = (CrmOutreachLog)result;

			if (!Objects.equals(uuid, crmOutreachLog.getUuid()) ||
					(groupId != crmOutreachLog.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

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

				List<CrmOutreachLog> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CrmOutreachLog crmOutreachLog = list.get(0);

					result = crmOutreachLog;

					cacheResult(crmOutreachLog);

					if ((crmOutreachLog.getUuid() == null) ||
							!crmOutreachLog.getUuid().equals(uuid) ||
							(crmOutreachLog.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, crmOutreachLog);
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
			return (CrmOutreachLog)result;
		}
	}

	/**
	 * Removes the CRM Outreach Log where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Outreach Log that was removed
	 */
	@Override
	public CrmOutreachLog removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmOutreachLogException {
		CrmOutreachLog crmOutreachLog = findByUUID_G(uuid, groupId);

		return remove(crmOutreachLog);
	}

	/**
	 * Returns the number of CRM Outreach Logs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Outreach Logs
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMOUTREACHLOG_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "crmOutreachLog.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "crmOutreachLog.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(crmOutreachLog.uuid IS NULL OR crmOutreachLog.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "crmOutreachLog.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmOutreachLogModelImpl.UUID_COLUMN_BITMASK |
			CrmOutreachLogModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @return the range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<CrmOutreachLog> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator,
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

		List<CrmOutreachLog> list = null;

		if (retrieveFromCache) {
			list = (List<CrmOutreachLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmOutreachLog crmOutreachLog : list) {
					if (!Objects.equals(uuid, crmOutreachLog.getUuid()) ||
							(companyId != crmOutreachLog.getCompanyId())) {
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

			query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

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
				query.append(CrmOutreachLogModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmOutreachLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmOutreachLog>)QueryUtil.list(q,
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
	 * Returns the first CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Outreach Log
	 * @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {
		CrmOutreachLog crmOutreachLog = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (crmOutreachLog != null) {
			return crmOutreachLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmOutreachLogException(msg.toString());
	}

	/**
	 * Returns the first CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		List<CrmOutreachLog> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Outreach Log
	 * @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {
		CrmOutreachLog crmOutreachLog = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (crmOutreachLog != null) {
			return crmOutreachLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmOutreachLogException(msg.toString());
	}

	/**
	 * Returns the last CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmOutreachLog> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Outreach Logs before and after the current CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmOutreachLogId the primary key of the current CRM Outreach Log
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Outreach Log
	 * @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	 */
	@Override
	public CrmOutreachLog[] findByUuid_C_PrevAndNext(long crmOutreachLogId,
		String uuid, long companyId,
		OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {
		CrmOutreachLog crmOutreachLog = findByPrimaryKey(crmOutreachLogId);

		Session session = null;

		try {
			session = openSession();

			CrmOutreachLog[] array = new CrmOutreachLogImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, crmOutreachLog, uuid,
					companyId, orderByComparator, true);

			array[1] = crmOutreachLog;

			array[2] = getByUuid_C_PrevAndNext(session, crmOutreachLog, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmOutreachLog getByUuid_C_PrevAndNext(Session session,
		CrmOutreachLog crmOutreachLog, String uuid, long companyId,
		OrderByComparator<CrmOutreachLog> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

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
			query.append(CrmOutreachLogModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmOutreachLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmOutreachLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Outreach Logs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmOutreachLog crmOutreachLog : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmOutreachLog);
		}
	}

	/**
	 * Returns the number of CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Outreach Logs
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMOUTREACHLOG_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "crmOutreachLog.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "crmOutreachLog.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(crmOutreachLog.uuid IS NULL OR crmOutreachLog.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "crmOutreachLog.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CRMCONTACTID =
		new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCrmContactId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID =
		new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCrmContactId",
			new String[] { Long.class.getName() },
			CrmOutreachLogModelImpl.CRMCONTACTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CRMCONTACTID = new FinderPath(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCrmContactId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the CRM Outreach Logs where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @return the matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByCrmContactId(long crmContactId) {
		return findByCrmContactId(crmContactId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Outreach Logs where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @return the range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByCrmContactId(long crmContactId,
		int start, int end) {
		return findByCrmContactId(crmContactId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByCrmContactId(long crmContactId,
		int start, int end, OrderByComparator<CrmOutreachLog> orderByComparator) {
		return findByCrmContactId(crmContactId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByCrmContactId(long crmContactId,
		int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator,
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

		List<CrmOutreachLog> list = null;

		if (retrieveFromCache) {
			list = (List<CrmOutreachLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmOutreachLog crmOutreachLog : list) {
					if ((crmContactId != crmOutreachLog.getCrmContactId())) {
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

			query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

			query.append(_FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmOutreachLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(crmContactId);

				if (!pagination) {
					list = (List<CrmOutreachLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmOutreachLog>)QueryUtil.list(q,
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
	 * Returns the first CRM Outreach Log in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Outreach Log
	 * @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog findByCrmContactId_First(long crmContactId,
		OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {
		CrmOutreachLog crmOutreachLog = fetchByCrmContactId_First(crmContactId,
				orderByComparator);

		if (crmOutreachLog != null) {
			return crmOutreachLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("crmContactId=");
		msg.append(crmContactId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmOutreachLogException(msg.toString());
	}

	/**
	 * Returns the first CRM Outreach Log in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog fetchByCrmContactId_First(long crmContactId,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		List<CrmOutreachLog> list = findByCrmContactId(crmContactId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Outreach Log in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Outreach Log
	 * @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog findByCrmContactId_Last(long crmContactId,
		OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {
		CrmOutreachLog crmOutreachLog = fetchByCrmContactId_Last(crmContactId,
				orderByComparator);

		if (crmOutreachLog != null) {
			return crmOutreachLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("crmContactId=");
		msg.append(crmContactId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmOutreachLogException(msg.toString());
	}

	/**
	 * Returns the last CRM Outreach Log in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog fetchByCrmContactId_Last(long crmContactId,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		int count = countByCrmContactId(crmContactId);

		if (count == 0) {
			return null;
		}

		List<CrmOutreachLog> list = findByCrmContactId(crmContactId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Outreach Logs before and after the current CRM Outreach Log in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmOutreachLogId the primary key of the current CRM Outreach Log
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Outreach Log
	 * @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	 */
	@Override
	public CrmOutreachLog[] findByCrmContactId_PrevAndNext(
		long crmOutreachLogId, long crmContactId,
		OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {
		CrmOutreachLog crmOutreachLog = findByPrimaryKey(crmOutreachLogId);

		Session session = null;

		try {
			session = openSession();

			CrmOutreachLog[] array = new CrmOutreachLogImpl[3];

			array[0] = getByCrmContactId_PrevAndNext(session, crmOutreachLog,
					crmContactId, orderByComparator, true);

			array[1] = crmOutreachLog;

			array[2] = getByCrmContactId_PrevAndNext(session, crmOutreachLog,
					crmContactId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmOutreachLog getByCrmContactId_PrevAndNext(Session session,
		CrmOutreachLog crmOutreachLog, long crmContactId,
		OrderByComparator<CrmOutreachLog> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

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
			query.append(CrmOutreachLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(crmContactId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(crmOutreachLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmOutreachLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Outreach Logs where crmContactId = &#63; from the database.
	 *
	 * @param crmContactId the crm contact ID
	 */
	@Override
	public void removeByCrmContactId(long crmContactId) {
		for (CrmOutreachLog crmOutreachLog : findByCrmContactId(crmContactId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmOutreachLog);
		}
	}

	/**
	 * Returns the number of CRM Outreach Logs where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @return the number of matching CRM Outreach Logs
	 */
	@Override
	public int countByCrmContactId(long crmContactId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CRMCONTACTID;

		Object[] finderArgs = new Object[] { crmContactId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMOUTREACHLOG_WHERE);

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

	private static final String _FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2 = "crmOutreachLog.crmContactId = ?";

	public CrmOutreachLogPersistenceImpl() {
		setModelClass(CrmOutreachLog.class);

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
	 * Caches the CRM Outreach Log in the entity cache if it is enabled.
	 *
	 * @param crmOutreachLog the CRM Outreach Log
	 */
	@Override
	public void cacheResult(CrmOutreachLog crmOutreachLog) {
		entityCache.putResult(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogImpl.class, crmOutreachLog.getPrimaryKey(),
			crmOutreachLog);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { crmOutreachLog.getUuid(), crmOutreachLog.getGroupId() },
			crmOutreachLog);

		crmOutreachLog.resetOriginalValues();
	}

	/**
	 * Caches the CRM Outreach Logs in the entity cache if it is enabled.
	 *
	 * @param crmOutreachLogs the CRM Outreach Logs
	 */
	@Override
	public void cacheResult(List<CrmOutreachLog> crmOutreachLogs) {
		for (CrmOutreachLog crmOutreachLog : crmOutreachLogs) {
			if (entityCache.getResult(
						CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
						CrmOutreachLogImpl.class, crmOutreachLog.getPrimaryKey()) == null) {
				cacheResult(crmOutreachLog);
			}
			else {
				crmOutreachLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM Outreach Logs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmOutreachLogImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM Outreach Log.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmOutreachLog crmOutreachLog) {
		entityCache.removeResult(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogImpl.class, crmOutreachLog.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmOutreachLogModelImpl)crmOutreachLog, true);
	}

	@Override
	public void clearCache(List<CrmOutreachLog> crmOutreachLogs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmOutreachLog crmOutreachLog : crmOutreachLogs) {
			entityCache.removeResult(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
				CrmOutreachLogImpl.class, crmOutreachLog.getPrimaryKey());

			clearUniqueFindersCache((CrmOutreachLogModelImpl)crmOutreachLog,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		CrmOutreachLogModelImpl crmOutreachLogModelImpl) {
		Object[] args = new Object[] {
				crmOutreachLogModelImpl.getUuid(),
				crmOutreachLogModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			crmOutreachLogModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmOutreachLogModelImpl crmOutreachLogModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					crmOutreachLogModelImpl.getUuid(),
					crmOutreachLogModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((crmOutreachLogModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmOutreachLogModelImpl.getOriginalUuid(),
					crmOutreachLogModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new CRM Outreach Log with the primary key. Does not add the CRM Outreach Log to the database.
	 *
	 * @param crmOutreachLogId the primary key for the new CRM Outreach Log
	 * @return the new CRM Outreach Log
	 */
	@Override
	public CrmOutreachLog create(long crmOutreachLogId) {
		CrmOutreachLog crmOutreachLog = new CrmOutreachLogImpl();

		crmOutreachLog.setNew(true);
		crmOutreachLog.setPrimaryKey(crmOutreachLogId);

		String uuid = PortalUUIDUtil.generate();

		crmOutreachLog.setUuid(uuid);

		crmOutreachLog.setCompanyId(companyProvider.getCompanyId());

		return crmOutreachLog;
	}

	/**
	 * Removes the CRM Outreach Log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmOutreachLogId the primary key of the CRM Outreach Log
	 * @return the CRM Outreach Log that was removed
	 * @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	 */
	@Override
	public CrmOutreachLog remove(long crmOutreachLogId)
		throws NoSuchCrmOutreachLogException {
		return remove((Serializable)crmOutreachLogId);
	}

	/**
	 * Removes the CRM Outreach Log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM Outreach Log
	 * @return the CRM Outreach Log that was removed
	 * @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	 */
	@Override
	public CrmOutreachLog remove(Serializable primaryKey)
		throws NoSuchCrmOutreachLogException {
		Session session = null;

		try {
			session = openSession();

			CrmOutreachLog crmOutreachLog = (CrmOutreachLog)session.get(CrmOutreachLogImpl.class,
					primaryKey);

			if (crmOutreachLog == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmOutreachLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmOutreachLog);
		}
		catch (NoSuchCrmOutreachLogException nsee) {
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
	protected CrmOutreachLog removeImpl(CrmOutreachLog crmOutreachLog) {
		crmOutreachLog = toUnwrappedModel(crmOutreachLog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmOutreachLog)) {
				crmOutreachLog = (CrmOutreachLog)session.get(CrmOutreachLogImpl.class,
						crmOutreachLog.getPrimaryKeyObj());
			}

			if (crmOutreachLog != null) {
				session.delete(crmOutreachLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmOutreachLog != null) {
			clearCache(crmOutreachLog);
		}

		return crmOutreachLog;
	}

	@Override
	public CrmOutreachLog updateImpl(CrmOutreachLog crmOutreachLog) {
		crmOutreachLog = toUnwrappedModel(crmOutreachLog);

		boolean isNew = crmOutreachLog.isNew();

		CrmOutreachLogModelImpl crmOutreachLogModelImpl = (CrmOutreachLogModelImpl)crmOutreachLog;

		if (Validator.isNull(crmOutreachLog.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmOutreachLog.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmOutreachLog.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmOutreachLog.setCreateDate(now);
			}
			else {
				crmOutreachLog.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmOutreachLogModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmOutreachLog.setModifiedDate(now);
			}
			else {
				crmOutreachLog.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmOutreachLog.isNew()) {
				session.save(crmOutreachLog);

				crmOutreachLog.setNew(false);
			}
			else {
				crmOutreachLog = (CrmOutreachLog)session.merge(crmOutreachLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmOutreachLogModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { crmOutreachLogModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					crmOutreachLogModelImpl.getUuid(),
					crmOutreachLogModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { crmOutreachLogModelImpl.getCrmContactId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CRMCONTACTID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((crmOutreachLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmOutreachLogModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { crmOutreachLogModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((crmOutreachLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmOutreachLogModelImpl.getOriginalUuid(),
						crmOutreachLogModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						crmOutreachLogModelImpl.getUuid(),
						crmOutreachLogModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((crmOutreachLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmOutreachLogModelImpl.getOriginalCrmContactId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRMCONTACTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID,
					args);

				args = new Object[] { crmOutreachLogModelImpl.getCrmContactId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRMCONTACTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID,
					args);
			}
		}

		entityCache.putResult(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogImpl.class, crmOutreachLog.getPrimaryKey(),
			crmOutreachLog, false);

		clearUniqueFindersCache(crmOutreachLogModelImpl, false);
		cacheUniqueFindersCache(crmOutreachLogModelImpl);

		crmOutreachLog.resetOriginalValues();

		return crmOutreachLog;
	}

	protected CrmOutreachLog toUnwrappedModel(CrmOutreachLog crmOutreachLog) {
		if (crmOutreachLog instanceof CrmOutreachLogImpl) {
			return crmOutreachLog;
		}

		CrmOutreachLogImpl crmOutreachLogImpl = new CrmOutreachLogImpl();

		crmOutreachLogImpl.setNew(crmOutreachLog.isNew());
		crmOutreachLogImpl.setPrimaryKey(crmOutreachLog.getPrimaryKey());

		crmOutreachLogImpl.setUuid(crmOutreachLog.getUuid());
		crmOutreachLogImpl.setCrmOutreachLogId(crmOutreachLog.getCrmOutreachLogId());
		crmOutreachLogImpl.setGroupId(crmOutreachLog.getGroupId());
		crmOutreachLogImpl.setCompanyId(crmOutreachLog.getCompanyId());
		crmOutreachLogImpl.setUserId(crmOutreachLog.getUserId());
		crmOutreachLogImpl.setUserName(crmOutreachLog.getUserName());
		crmOutreachLogImpl.setCreateDate(crmOutreachLog.getCreateDate());
		crmOutreachLogImpl.setModifiedDate(crmOutreachLog.getModifiedDate());
		crmOutreachLogImpl.setCrmContactId(crmOutreachLog.getCrmContactId());
		crmOutreachLogImpl.setNote(crmOutreachLog.getNote());
		crmOutreachLogImpl.setMedium(crmOutreachLog.getMedium());
		crmOutreachLogImpl.setActivityType(crmOutreachLog.getActivityType());
		crmOutreachLogImpl.setOutreachDate(crmOutreachLog.getOutreachDate());

		return crmOutreachLogImpl;
	}

	/**
	 * Returns the CRM Outreach Log with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Outreach Log
	 * @return the CRM Outreach Log
	 * @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	 */
	@Override
	public CrmOutreachLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmOutreachLogException {
		CrmOutreachLog crmOutreachLog = fetchByPrimaryKey(primaryKey);

		if (crmOutreachLog == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmOutreachLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmOutreachLog;
	}

	/**
	 * Returns the CRM Outreach Log with the primary key or throws a {@link NoSuchCrmOutreachLogException} if it could not be found.
	 *
	 * @param crmOutreachLogId the primary key of the CRM Outreach Log
	 * @return the CRM Outreach Log
	 * @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	 */
	@Override
	public CrmOutreachLog findByPrimaryKey(long crmOutreachLogId)
		throws NoSuchCrmOutreachLogException {
		return findByPrimaryKey((Serializable)crmOutreachLogId);
	}

	/**
	 * Returns the CRM Outreach Log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Outreach Log
	 * @return the CRM Outreach Log, or <code>null</code> if a CRM Outreach Log with the primary key could not be found
	 */
	@Override
	public CrmOutreachLog fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
				CrmOutreachLogImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmOutreachLog crmOutreachLog = (CrmOutreachLog)serializable;

		if (crmOutreachLog == null) {
			Session session = null;

			try {
				session = openSession();

				crmOutreachLog = (CrmOutreachLog)session.get(CrmOutreachLogImpl.class,
						primaryKey);

				if (crmOutreachLog != null) {
					cacheResult(crmOutreachLog);
				}
				else {
					entityCache.putResult(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
						CrmOutreachLogImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
					CrmOutreachLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmOutreachLog;
	}

	/**
	 * Returns the CRM Outreach Log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmOutreachLogId the primary key of the CRM Outreach Log
	 * @return the CRM Outreach Log, or <code>null</code> if a CRM Outreach Log with the primary key could not be found
	 */
	@Override
	public CrmOutreachLog fetchByPrimaryKey(long crmOutreachLogId) {
		return fetchByPrimaryKey((Serializable)crmOutreachLogId);
	}

	@Override
	public Map<Serializable, CrmOutreachLog> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmOutreachLog> map = new HashMap<Serializable, CrmOutreachLog>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmOutreachLog crmOutreachLog = fetchByPrimaryKey(primaryKey);

			if (crmOutreachLog != null) {
				map.put(primaryKey, crmOutreachLog);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
					CrmOutreachLogImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmOutreachLog)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE_PKS_IN);

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

			for (CrmOutreachLog crmOutreachLog : (List<CrmOutreachLog>)q.list()) {
				map.put(crmOutreachLog.getPrimaryKeyObj(), crmOutreachLog);

				cacheResult(crmOutreachLog);

				uncachedPrimaryKeys.remove(crmOutreachLog.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
					CrmOutreachLogImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM Outreach Logs.
	 *
	 * @return the CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Outreach Logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @return the range of CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findAll(int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findAll(int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator,
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

		List<CrmOutreachLog> list = null;

		if (retrieveFromCache) {
			list = (List<CrmOutreachLog>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMOUTREACHLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMOUTREACHLOG;

				if (pagination) {
					sql = sql.concat(CrmOutreachLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmOutreachLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmOutreachLog>)QueryUtil.list(q,
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
	 * Removes all the CRM Outreach Logs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmOutreachLog crmOutreachLog : findAll()) {
			remove(crmOutreachLog);
		}
	}

	/**
	 * Returns the number of CRM Outreach Logs.
	 *
	 * @return the number of CRM Outreach Logs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMOUTREACHLOG);

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
		return CrmOutreachLogModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM Outreach Log persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CrmOutreachLogImpl.class.getName());
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
	private static final String _SQL_SELECT_CRMOUTREACHLOG = "SELECT crmOutreachLog FROM CrmOutreachLog crmOutreachLog";
	private static final String _SQL_SELECT_CRMOUTREACHLOG_WHERE_PKS_IN = "SELECT crmOutreachLog FROM CrmOutreachLog crmOutreachLog WHERE crmOutreachLogId IN (";
	private static final String _SQL_SELECT_CRMOUTREACHLOG_WHERE = "SELECT crmOutreachLog FROM CrmOutreachLog crmOutreachLog WHERE ";
	private static final String _SQL_COUNT_CRMOUTREACHLOG = "SELECT COUNT(crmOutreachLog) FROM CrmOutreachLog crmOutreachLog";
	private static final String _SQL_COUNT_CRMOUTREACHLOG_WHERE = "SELECT COUNT(crmOutreachLog) FROM CrmOutreachLog crmOutreachLog WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmOutreachLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmOutreachLog exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CrmOutreachLog exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CrmOutreachLogPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}