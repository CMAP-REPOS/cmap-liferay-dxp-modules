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
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
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
import java.lang.reflect.InvocationHandler;

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
 * @generated
 */
@ProviderType
public class CrmOutreachLogPersistenceImpl
	extends BasePersistenceImpl<CrmOutreachLog>
	implements CrmOutreachLogPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CrmOutreachLogUtil</code> to access the CRM Outreach Log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CrmOutreachLogImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmOutreachLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmOutreachLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Outreach Logs
	 */
	@Deprecated
	@Override
	public List<CrmOutreachLog> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator,
		boolean useFinderCache) {

		return findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmOutreachLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator) {

		uuid = Objects.toString(uuid, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByUuid;
			finderArgs = new Object[] {uuid};
		}
		else {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<CrmOutreachLog> list = (List<CrmOutreachLog>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmOutreachLog crmOutreachLog : list) {
				if (!uuid.equals(crmOutreachLog.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
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
					list = (List<CrmOutreachLog>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmOutreachLog>)QueryUtil.list(
						q, getDialect(), start, end);
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
	public CrmOutreachLog findByUuid_First(
			String uuid, OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {

		CrmOutreachLog crmOutreachLog = fetchByUuid_First(
			uuid, orderByComparator);

		if (crmOutreachLog != null) {
			return crmOutreachLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

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
	public CrmOutreachLog fetchByUuid_First(
		String uuid, OrderByComparator<CrmOutreachLog> orderByComparator) {

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
	public CrmOutreachLog findByUuid_Last(
			String uuid, OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {

		CrmOutreachLog crmOutreachLog = fetchByUuid_Last(
			uuid, orderByComparator);

		if (crmOutreachLog != null) {
			return crmOutreachLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

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
	public CrmOutreachLog fetchByUuid_Last(
		String uuid, OrderByComparator<CrmOutreachLog> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmOutreachLog> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

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
	public CrmOutreachLog[] findByUuid_PrevAndNext(
			long crmOutreachLogId, String uuid,
			OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {

		uuid = Objects.toString(uuid, "");

		CrmOutreachLog crmOutreachLog = findByPrimaryKey(crmOutreachLogId);

		Session session = null;

		try {
			session = openSession();

			CrmOutreachLog[] array = new CrmOutreachLogImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, crmOutreachLog, uuid, orderByComparator, true);

			array[1] = crmOutreachLog;

			array[2] = getByUuid_PrevAndNext(
				session, crmOutreachLog, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmOutreachLog getByUuid_PrevAndNext(
		Session session, CrmOutreachLog crmOutreachLog, String uuid,
		OrderByComparator<CrmOutreachLog> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

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
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						crmOutreachLog)) {

				qPos.add(orderByConditionValue);
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
		for (CrmOutreachLog crmOutreachLog :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

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
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMOUTREACHLOG_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
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

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"crmOutreachLog.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(crmOutreachLog.uuid IS NULL OR crmOutreachLog.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the CRM Outreach Log where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCrmOutreachLogException</code> if it could not be found.
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

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchCrmOutreachLogException(msg.toString());
		}

		return crmOutreachLog;
	}

	/**
	 * Returns the CRM Outreach Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	 */
	@Deprecated
	@Override
	public CrmOutreachLog fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the CRM Outreach Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	 */
	@Override
	public CrmOutreachLog fetchByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = new Object[] {uuid, groupId};

		Object result = finderCache.getResult(
			_finderPathFetchByUUID_G, finderArgs, this);

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

			if (uuid.isEmpty()) {
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
					finderCache.putResult(
						_finderPathFetchByUUID_G, finderArgs, list);
				}
				else {
					CrmOutreachLog crmOutreachLog = list.get(0);

					result = crmOutreachLog;

					cacheResult(crmOutreachLog);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(_finderPathFetchByUUID_G, finderArgs);

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
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMOUTREACHLOG_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
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

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"crmOutreachLog.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(crmOutreachLog.uuid IS NULL OR crmOutreachLog.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"crmOutreachLog.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmOutreachLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @return the range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmOutreachLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Outreach Logs
	 */
	@Deprecated
	@Override
	public List<CrmOutreachLog> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator,
		boolean useFinderCache) {

		return findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmOutreachLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<CrmOutreachLog> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator) {

		uuid = Objects.toString(uuid, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByUuid_C;
			finderArgs = new Object[] {uuid, companyId};
		}
		else {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<CrmOutreachLog> list = (List<CrmOutreachLog>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmOutreachLog crmOutreachLog : list) {
				if (!uuid.equals(crmOutreachLog.getUuid()) ||
					(companyId != crmOutreachLog.getCompanyId())) {

					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
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
					list = (List<CrmOutreachLog>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmOutreachLog>)QueryUtil.list(
						q, getDialect(), start, end);
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
	public CrmOutreachLog findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {

		CrmOutreachLog crmOutreachLog = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (crmOutreachLog != null) {
			return crmOutreachLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

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
	public CrmOutreachLog fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CrmOutreachLog> orderByComparator) {

		List<CrmOutreachLog> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

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
	public CrmOutreachLog findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {

		CrmOutreachLog crmOutreachLog = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (crmOutreachLog != null) {
			return crmOutreachLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

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
	public CrmOutreachLog fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CrmOutreachLog> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmOutreachLog> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

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
	public CrmOutreachLog[] findByUuid_C_PrevAndNext(
			long crmOutreachLogId, String uuid, long companyId,
			OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {

		uuid = Objects.toString(uuid, "");

		CrmOutreachLog crmOutreachLog = findByPrimaryKey(crmOutreachLogId);

		Session session = null;

		try {
			session = openSession();

			CrmOutreachLog[] array = new CrmOutreachLogImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, crmOutreachLog, uuid, companyId, orderByComparator,
				true);

			array[1] = crmOutreachLog;

			array[2] = getByUuid_C_PrevAndNext(
				session, crmOutreachLog, uuid, companyId, orderByComparator,
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

	protected CrmOutreachLog getByUuid_C_PrevAndNext(
		Session session, CrmOutreachLog crmOutreachLog, String uuid,
		long companyId, OrderByComparator<CrmOutreachLog> orderByComparator,
		boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

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
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						crmOutreachLog)) {

				qPos.add(orderByConditionValue);
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
		for (CrmOutreachLog crmOutreachLog :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

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
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMOUTREACHLOG_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
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

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"crmOutreachLog.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(crmOutreachLog.uuid IS NULL OR crmOutreachLog.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"crmOutreachLog.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByCrmContactId;
	private FinderPath _finderPathWithoutPaginationFindByCrmContactId;
	private FinderPath _finderPathCountByCrmContactId;

	/**
	 * Returns all the CRM Outreach Logs where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @return the matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByCrmContactId(long crmContactId) {
		return findByCrmContactId(
			crmContactId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Outreach Logs where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmOutreachLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @return the range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByCrmContactId(
		long crmContactId, int start, int end) {

		return findByCrmContactId(crmContactId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmOutreachLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByCrmContactId(long, int, int, OrderByComparator)}
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Outreach Logs
	 */
	@Deprecated
	@Override
	public List<CrmOutreachLog> findByCrmContactId(
		long crmContactId, int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator,
		boolean useFinderCache) {

		return findByCrmContactId(crmContactId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmOutreachLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findByCrmContactId(
		long crmContactId, int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByCrmContactId;
			finderArgs = new Object[] {crmContactId};
		}
		else {
			finderPath = _finderPathWithPaginationFindByCrmContactId;
			finderArgs = new Object[] {
				crmContactId, start, end, orderByComparator
			};
		}

		List<CrmOutreachLog> list = (List<CrmOutreachLog>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmOutreachLog crmOutreachLog : list) {
				if ((crmContactId != crmOutreachLog.getCrmContactId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

			query.append(_FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
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
					list = (List<CrmOutreachLog>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmOutreachLog>)QueryUtil.list(
						q, getDialect(), start, end);
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
	public CrmOutreachLog findByCrmContactId_First(
			long crmContactId,
			OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {

		CrmOutreachLog crmOutreachLog = fetchByCrmContactId_First(
			crmContactId, orderByComparator);

		if (crmOutreachLog != null) {
			return crmOutreachLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("crmContactId=");
		msg.append(crmContactId);

		msg.append("}");

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
	public CrmOutreachLog fetchByCrmContactId_First(
		long crmContactId,
		OrderByComparator<CrmOutreachLog> orderByComparator) {

		List<CrmOutreachLog> list = findByCrmContactId(
			crmContactId, 0, 1, orderByComparator);

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
	public CrmOutreachLog findByCrmContactId_Last(
			long crmContactId,
			OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException {

		CrmOutreachLog crmOutreachLog = fetchByCrmContactId_Last(
			crmContactId, orderByComparator);

		if (crmOutreachLog != null) {
			return crmOutreachLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("crmContactId=");
		msg.append(crmContactId);

		msg.append("}");

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
	public CrmOutreachLog fetchByCrmContactId_Last(
		long crmContactId,
		OrderByComparator<CrmOutreachLog> orderByComparator) {

		int count = countByCrmContactId(crmContactId);

		if (count == 0) {
			return null;
		}

		List<CrmOutreachLog> list = findByCrmContactId(
			crmContactId, count - 1, count, orderByComparator);

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

			array[0] = getByCrmContactId_PrevAndNext(
				session, crmOutreachLog, crmContactId, orderByComparator, true);

			array[1] = crmOutreachLog;

			array[2] = getByCrmContactId_PrevAndNext(
				session, crmOutreachLog, crmContactId, orderByComparator,
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

	protected CrmOutreachLog getByCrmContactId_PrevAndNext(
		Session session, CrmOutreachLog crmOutreachLog, long crmContactId,
		OrderByComparator<CrmOutreachLog> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE);

		query.append(_FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

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
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						crmOutreachLog)) {

				qPos.add(orderByConditionValue);
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
		for (CrmOutreachLog crmOutreachLog :
				findByCrmContactId(
					crmContactId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

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
		FinderPath finderPath = _finderPathCountByCrmContactId;

		Object[] finderArgs = new Object[] {crmContactId};

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

	private static final String _FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2 =
		"crmOutreachLog.crmContactId = ?";

	public CrmOutreachLogPersistenceImpl() {
		setModelClass(CrmOutreachLog.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
				"_dbColumnNames");

			field.setAccessible(true);

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
		entityCache.putResult(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogImpl.class, crmOutreachLog.getPrimaryKey(),
			crmOutreachLog);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				crmOutreachLog.getUuid(), crmOutreachLog.getGroupId()
			},
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
					CrmOutreachLogImpl.class, crmOutreachLog.getPrimaryKey()) ==
						null) {

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
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
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
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmOutreachLog crmOutreachLog) {
		entityCache.removeResult(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
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
			entityCache.removeResult(
				CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
				CrmOutreachLogImpl.class, crmOutreachLog.getPrimaryKey());

			clearUniqueFindersCache(
				(CrmOutreachLogModelImpl)crmOutreachLog, true);
		}
	}

	protected void cacheUniqueFindersCache(
		CrmOutreachLogModelImpl crmOutreachLogModelImpl) {

		Object[] args = new Object[] {
			crmOutreachLogModelImpl.getUuid(),
			crmOutreachLogModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, crmOutreachLogModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmOutreachLogModelImpl crmOutreachLogModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				crmOutreachLogModelImpl.getUuid(),
				crmOutreachLogModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((crmOutreachLogModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				crmOutreachLogModelImpl.getOriginalUuid(),
				crmOutreachLogModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
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

		crmOutreachLog.setCompanyId(CompanyThreadLocal.getCompanyId());

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

			CrmOutreachLog crmOutreachLog = (CrmOutreachLog)session.get(
				CrmOutreachLogImpl.class, primaryKey);

			if (crmOutreachLog == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmOutreachLogException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
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
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmOutreachLog)) {
				crmOutreachLog = (CrmOutreachLog)session.get(
					CrmOutreachLogImpl.class,
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
		boolean isNew = crmOutreachLog.isNew();

		if (!(crmOutreachLog instanceof CrmOutreachLogModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(crmOutreachLog.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					crmOutreachLog);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in crmOutreachLog proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CrmOutreachLog implementation " +
					crmOutreachLog.getClass());
		}

		CrmOutreachLogModelImpl crmOutreachLogModelImpl =
			(CrmOutreachLogModelImpl)crmOutreachLog;

		if (Validator.isNull(crmOutreachLog.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmOutreachLog.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

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
				crmOutreachLog.setModifiedDate(
					serviceContext.getModifiedDate(now));
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
		else if (isNew) {
			Object[] args = new Object[] {crmOutreachLogModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				crmOutreachLogModelImpl.getUuid(),
				crmOutreachLogModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {crmOutreachLogModelImpl.getCrmContactId()};

			finderCache.removeResult(_finderPathCountByCrmContactId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCrmContactId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((crmOutreachLogModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crmOutreachLogModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {crmOutreachLogModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((crmOutreachLogModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crmOutreachLogModelImpl.getOriginalUuid(),
					crmOutreachLogModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					crmOutreachLogModelImpl.getUuid(),
					crmOutreachLogModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((crmOutreachLogModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCrmContactId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					crmOutreachLogModelImpl.getOriginalCrmContactId()
				};

				finderCache.removeResult(_finderPathCountByCrmContactId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCrmContactId, args);

				args = new Object[] {crmOutreachLogModelImpl.getCrmContactId()};

				finderCache.removeResult(_finderPathCountByCrmContactId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCrmContactId, args);
			}
		}

		entityCache.putResult(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogImpl.class, crmOutreachLog.getPrimaryKey(),
			crmOutreachLog, false);

		clearUniqueFindersCache(crmOutreachLogModelImpl, false);
		cacheUniqueFindersCache(crmOutreachLogModelImpl);

		crmOutreachLog.resetOriginalValues();

		return crmOutreachLog;
	}

	/**
	 * Returns the CRM Outreach Log with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
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

			throw new NoSuchCrmOutreachLogException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return crmOutreachLog;
	}

	/**
	 * Returns the CRM Outreach Log with the primary key or throws a <code>NoSuchCrmOutreachLogException</code> if it could not be found.
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
		Serializable serializable = entityCache.getResult(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmOutreachLog crmOutreachLog = (CrmOutreachLog)serializable;

		if (crmOutreachLog == null) {
			Session session = null;

			try {
				session = openSession();

				crmOutreachLog = (CrmOutreachLog)session.get(
					CrmOutreachLogImpl.class, primaryKey);

				if (crmOutreachLog != null) {
					cacheResult(crmOutreachLog);
				}
				else {
					entityCache.putResult(
						CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
						CrmOutreachLogImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(
					CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
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

		Map<Serializable, CrmOutreachLog> map =
			new HashMap<Serializable, CrmOutreachLog>();

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
			Serializable serializable = entityCache.getResult(
				CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
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

		StringBundler query = new StringBundler(
			uncachedPrimaryKeys.size() * 2 + 1);

		query.append(_SQL_SELECT_CRMOUTREACHLOG_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (CrmOutreachLog crmOutreachLog :
					(List<CrmOutreachLog>)q.list()) {

				map.put(crmOutreachLog.getPrimaryKeyObj(), crmOutreachLog);

				cacheResult(crmOutreachLog);

				uncachedPrimaryKeys.remove(crmOutreachLog.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmOutreachLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmOutreachLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of CRM Outreach Logs
	 */
	@Deprecated
	@Override
	public List<CrmOutreachLog> findAll(
		int start, int end, OrderByComparator<CrmOutreachLog> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Outreach Logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmOutreachLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Outreach Logs
	 * @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Outreach Logs
	 */
	@Override
	public List<CrmOutreachLog> findAll(
		int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindAll;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<CrmOutreachLog> list = (List<CrmOutreachLog>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMOUTREACHLOG);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

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
					list = (List<CrmOutreachLog>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmOutreachLog>)QueryUtil.list(
						q, getDialect(), start, end);
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
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMOUTREACHLOG);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

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
		_finderPathWithPaginationFindAll = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);

		_finderPathCountAll = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid", new String[] {String.class.getName()},
			CrmOutreachLogModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			CrmOutreachLogModelImpl.UUID_COLUMN_BITMASK |
			CrmOutreachLogModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			CrmOutreachLogModelImpl.UUID_COLUMN_BITMASK |
			CrmOutreachLogModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByCrmContactId = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCrmContactId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCrmContactId = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED,
			CrmOutreachLogImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCrmContactId", new String[] {Long.class.getName()},
			CrmOutreachLogModelImpl.CRMCONTACTID_COLUMN_BITMASK);

		_finderPathCountByCrmContactId = new FinderPath(
			CrmOutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			CrmOutreachLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCrmContactId",
			new String[] {Long.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(CrmOutreachLogImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CRMOUTREACHLOG =
		"SELECT crmOutreachLog FROM CrmOutreachLog crmOutreachLog";

	private static final String _SQL_SELECT_CRMOUTREACHLOG_WHERE_PKS_IN =
		"SELECT crmOutreachLog FROM CrmOutreachLog crmOutreachLog WHERE crmOutreachLogId IN (";

	private static final String _SQL_SELECT_CRMOUTREACHLOG_WHERE =
		"SELECT crmOutreachLog FROM CrmOutreachLog crmOutreachLog WHERE ";

	private static final String _SQL_COUNT_CRMOUTREACHLOG =
		"SELECT COUNT(crmOutreachLog) FROM CrmOutreachLog crmOutreachLog";

	private static final String _SQL_COUNT_CRMOUTREACHLOG_WHERE =
		"SELECT COUNT(crmOutreachLog) FROM CrmOutreachLog crmOutreachLog WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "crmOutreachLog.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CrmOutreachLog exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CrmOutreachLog exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CrmOutreachLogPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}