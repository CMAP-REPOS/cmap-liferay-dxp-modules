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

import contact.manager.exception.NoSuchCrmStateRepException;

import contact.manager.model.CrmStateRep;
import contact.manager.model.impl.CrmStateRepImpl;
import contact.manager.model.impl.CrmStateRepModelImpl;

import contact.manager.service.persistence.CrmStateRepPersistence;

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
 * The persistence implementation for the CRM State Rep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateRepPersistence
 * @see contact.manager.service.persistence.CrmStateRepUtil
 * @generated
 */
@ProviderType
public class CrmStateRepPersistenceImpl extends BasePersistenceImpl<CrmStateRep>
	implements CrmStateRepPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmStateRepUtil} to access the CRM State Rep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmStateRepImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, CrmStateRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, CrmStateRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, CrmStateRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, CrmStateRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CrmStateRepModelImpl.UUID_COLUMN_BITMASK |
			CrmStateRepModelImpl.NUMBER_COLUMN_BITMASK |
			CrmStateRepModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM State Reps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM State Reps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @return the range of matching CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM State Reps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM State Reps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator,
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

		List<CrmStateRep> list = null;

		if (retrieveFromCache) {
			list = (List<CrmStateRep>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmStateRep crmStateRep : list) {
					if (!Objects.equals(uuid, crmStateRep.getUuid())) {
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

			query.append(_SQL_SELECT_CRMSTATEREP_WHERE);

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
				query.append(CrmStateRepModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmStateRep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmStateRep>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first CRM State Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep findByUuid_First(String uuid,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException {
		CrmStateRep crmStateRep = fetchByUuid_First(uuid, orderByComparator);

		if (crmStateRep != null) {
			return crmStateRep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmStateRepException(msg.toString());
	}

	/**
	 * Returns the first CRM State Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep fetchByUuid_First(String uuid,
		OrderByComparator<CrmStateRep> orderByComparator) {
		List<CrmStateRep> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM State Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep findByUuid_Last(String uuid,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException {
		CrmStateRep crmStateRep = fetchByUuid_Last(uuid, orderByComparator);

		if (crmStateRep != null) {
			return crmStateRep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmStateRepException(msg.toString());
	}

	/**
	 * Returns the last CRM State Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep fetchByUuid_Last(String uuid,
		OrderByComparator<CrmStateRep> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmStateRep> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM State Reps before and after the current CRM State Rep in the ordered set where uuid = &#63;.
	 *
	 * @param crmStateRepId the primary key of the current CRM State Rep
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM State Rep
	 * @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	 */
	@Override
	public CrmStateRep[] findByUuid_PrevAndNext(long crmStateRepId,
		String uuid, OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException {
		CrmStateRep crmStateRep = findByPrimaryKey(crmStateRepId);

		Session session = null;

		try {
			session = openSession();

			CrmStateRep[] array = new CrmStateRepImpl[3];

			array[0] = getByUuid_PrevAndNext(session, crmStateRep, uuid,
					orderByComparator, true);

			array[1] = crmStateRep;

			array[2] = getByUuid_PrevAndNext(session, crmStateRep, uuid,
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

	protected CrmStateRep getByUuid_PrevAndNext(Session session,
		CrmStateRep crmStateRep, String uuid,
		OrderByComparator<CrmStateRep> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMSTATEREP_WHERE);

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
			query.append(CrmStateRepModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmStateRep);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmStateRep> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM State Reps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmStateRep crmStateRep : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmStateRep);
		}
	}

	/**
	 * Returns the number of CRM State Reps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM State Reps
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMSTATEREP_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "crmStateRep.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmStateRep.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(crmStateRep.uuid IS NULL OR crmStateRep.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, CrmStateRepImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmStateRepModelImpl.UUID_COLUMN_BITMASK |
			CrmStateRepModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the CRM State Rep where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmStateRepException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmStateRepException {
		CrmStateRep crmStateRep = fetchByUUID_G(uuid, groupId);

		if (crmStateRep == null) {
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

			throw new NoSuchCrmStateRepException(msg.toString());
		}

		return crmStateRep;
	}

	/**
	 * Returns the CRM State Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the CRM State Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CrmStateRep) {
			CrmStateRep crmStateRep = (CrmStateRep)result;

			if (!Objects.equals(uuid, crmStateRep.getUuid()) ||
					(groupId != crmStateRep.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMSTATEREP_WHERE);

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

				List<CrmStateRep> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CrmStateRep crmStateRep = list.get(0);

					result = crmStateRep;

					cacheResult(crmStateRep);

					if ((crmStateRep.getUuid() == null) ||
							!crmStateRep.getUuid().equals(uuid) ||
							(crmStateRep.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, crmStateRep);
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
			return (CrmStateRep)result;
		}
	}

	/**
	 * Removes the CRM State Rep where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM State Rep that was removed
	 */
	@Override
	public CrmStateRep removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmStateRepException {
		CrmStateRep crmStateRep = findByUUID_G(uuid, groupId);

		return remove(crmStateRep);
	}

	/**
	 * Returns the number of CRM State Reps where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM State Reps
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMSTATEREP_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "crmStateRep.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "crmStateRep.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(crmStateRep.uuid IS NULL OR crmStateRep.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "crmStateRep.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, CrmStateRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, CrmStateRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmStateRepModelImpl.UUID_COLUMN_BITMASK |
			CrmStateRepModelImpl.COMPANYID_COLUMN_BITMASK |
			CrmStateRepModelImpl.NUMBER_COLUMN_BITMASK |
			CrmStateRepModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @return the range of matching CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<CrmStateRep> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<CrmStateRep> orderByComparator,
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

		List<CrmStateRep> list = null;

		if (retrieveFromCache) {
			list = (List<CrmStateRep>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmStateRep crmStateRep : list) {
					if (!Objects.equals(uuid, crmStateRep.getUuid()) ||
							(companyId != crmStateRep.getCompanyId())) {
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

			query.append(_SQL_SELECT_CRMSTATEREP_WHERE);

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
				query.append(CrmStateRepModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmStateRep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmStateRep>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException {
		CrmStateRep crmStateRep = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (crmStateRep != null) {
			return crmStateRep;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmStateRepException(msg.toString());
	}

	/**
	 * Returns the first CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator) {
		List<CrmStateRep> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException {
		CrmStateRep crmStateRep = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (crmStateRep != null) {
			return crmStateRep;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmStateRepException(msg.toString());
	}

	/**
	 * Returns the last CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmStateRep> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM State Reps before and after the current CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmStateRepId the primary key of the current CRM State Rep
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM State Rep
	 * @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	 */
	@Override
	public CrmStateRep[] findByUuid_C_PrevAndNext(long crmStateRepId,
		String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException {
		CrmStateRep crmStateRep = findByPrimaryKey(crmStateRepId);

		Session session = null;

		try {
			session = openSession();

			CrmStateRep[] array = new CrmStateRepImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, crmStateRep, uuid,
					companyId, orderByComparator, true);

			array[1] = crmStateRep;

			array[2] = getByUuid_C_PrevAndNext(session, crmStateRep, uuid,
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

	protected CrmStateRep getByUuid_C_PrevAndNext(Session session,
		CrmStateRep crmStateRep, String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMSTATEREP_WHERE);

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
			query.append(CrmStateRepModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmStateRep);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmStateRep> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM State Reps where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmStateRep crmStateRep : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmStateRep);
		}
	}

	/**
	 * Returns the number of CRM State Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM State Reps
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMSTATEREP_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "crmStateRep.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "crmStateRep.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(crmStateRep.uuid IS NULL OR crmStateRep.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "crmStateRep.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ZIPCODE = new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, CrmStateRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByZipCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE =
		new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, CrmStateRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByZipCode",
			new String[] { String.class.getName() },
			CrmStateRepModelImpl.ZIPCODE_COLUMN_BITMASK |
			CrmStateRepModelImpl.NUMBER_COLUMN_BITMASK |
			CrmStateRepModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ZIPCODE = new FinderPath(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByZipCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM State Reps where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findByZipCode(String zipCode) {
		return findByZipCode(zipCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM State Reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @return the range of matching CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findByZipCode(String zipCode, int start, int end) {
		return findByZipCode(zipCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM State Reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator) {
		return findByZipCode(zipCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM State Reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE;
			finderArgs = new Object[] { zipCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ZIPCODE;
			finderArgs = new Object[] { zipCode, start, end, orderByComparator };
		}

		List<CrmStateRep> list = null;

		if (retrieveFromCache) {
			list = (List<CrmStateRep>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmStateRep crmStateRep : list) {
					if (!Objects.equals(zipCode, crmStateRep.getZipCode())) {
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

			query.append(_SQL_SELECT_CRMSTATEREP_WHERE);

			boolean bindZipCode = false;

			if (zipCode == null) {
				query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_1);
			}
			else if (zipCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_3);
			}
			else {
				bindZipCode = true;

				query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmStateRepModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindZipCode) {
					qPos.add(zipCode);
				}

				if (!pagination) {
					list = (List<CrmStateRep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmStateRep>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first CRM State Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep findByZipCode_First(String zipCode,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException {
		CrmStateRep crmStateRep = fetchByZipCode_First(zipCode,
				orderByComparator);

		if (crmStateRep != null) {
			return crmStateRep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmStateRepException(msg.toString());
	}

	/**
	 * Returns the first CRM State Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep fetchByZipCode_First(String zipCode,
		OrderByComparator<CrmStateRep> orderByComparator) {
		List<CrmStateRep> list = findByZipCode(zipCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM State Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep findByZipCode_Last(String zipCode,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException {
		CrmStateRep crmStateRep = fetchByZipCode_Last(zipCode, orderByComparator);

		if (crmStateRep != null) {
			return crmStateRep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmStateRepException(msg.toString());
	}

	/**
	 * Returns the last CRM State Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	@Override
	public CrmStateRep fetchByZipCode_Last(String zipCode,
		OrderByComparator<CrmStateRep> orderByComparator) {
		int count = countByZipCode(zipCode);

		if (count == 0) {
			return null;
		}

		List<CrmStateRep> list = findByZipCode(zipCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM State Reps before and after the current CRM State Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param crmStateRepId the primary key of the current CRM State Rep
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM State Rep
	 * @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	 */
	@Override
	public CrmStateRep[] findByZipCode_PrevAndNext(long crmStateRepId,
		String zipCode, OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException {
		CrmStateRep crmStateRep = findByPrimaryKey(crmStateRepId);

		Session session = null;

		try {
			session = openSession();

			CrmStateRep[] array = new CrmStateRepImpl[3];

			array[0] = getByZipCode_PrevAndNext(session, crmStateRep, zipCode,
					orderByComparator, true);

			array[1] = crmStateRep;

			array[2] = getByZipCode_PrevAndNext(session, crmStateRep, zipCode,
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

	protected CrmStateRep getByZipCode_PrevAndNext(Session session,
		CrmStateRep crmStateRep, String zipCode,
		OrderByComparator<CrmStateRep> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMSTATEREP_WHERE);

		boolean bindZipCode = false;

		if (zipCode == null) {
			query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_1);
		}
		else if (zipCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_3);
		}
		else {
			bindZipCode = true;

			query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_2);
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
			query.append(CrmStateRepModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindZipCode) {
			qPos.add(zipCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(crmStateRep);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmStateRep> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM State Reps where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	@Override
	public void removeByZipCode(String zipCode) {
		for (CrmStateRep crmStateRep : findByZipCode(zipCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmStateRep);
		}
	}

	/**
	 * Returns the number of CRM State Reps where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching CRM State Reps
	 */
	@Override
	public int countByZipCode(String zipCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ZIPCODE;

		Object[] finderArgs = new Object[] { zipCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMSTATEREP_WHERE);

			boolean bindZipCode = false;

			if (zipCode == null) {
				query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_1);
			}
			else if (zipCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_3);
			}
			else {
				bindZipCode = true;

				query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindZipCode) {
					qPos.add(zipCode);
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

	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_1 = "crmStateRep.zipCode IS NULL";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_2 = "crmStateRep.zipCode = ?";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_3 = "(crmStateRep.zipCode IS NULL OR crmStateRep.zipCode = '')";

	public CrmStateRepPersistenceImpl() {
		setModelClass(CrmStateRep.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");
			dbColumnNames.put("number", "number_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the CRM State Rep in the entity cache if it is enabled.
	 *
	 * @param crmStateRep the CRM State Rep
	 */
	@Override
	public void cacheResult(CrmStateRep crmStateRep) {
		entityCache.putResult(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepImpl.class, crmStateRep.getPrimaryKey(), crmStateRep);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { crmStateRep.getUuid(), crmStateRep.getGroupId() },
			crmStateRep);

		crmStateRep.resetOriginalValues();
	}

	/**
	 * Caches the CRM State Reps in the entity cache if it is enabled.
	 *
	 * @param crmStateReps the CRM State Reps
	 */
	@Override
	public void cacheResult(List<CrmStateRep> crmStateReps) {
		for (CrmStateRep crmStateRep : crmStateReps) {
			if (entityCache.getResult(
						CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
						CrmStateRepImpl.class, crmStateRep.getPrimaryKey()) == null) {
				cacheResult(crmStateRep);
			}
			else {
				crmStateRep.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM State Reps.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmStateRepImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM State Rep.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmStateRep crmStateRep) {
		entityCache.removeResult(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepImpl.class, crmStateRep.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmStateRepModelImpl)crmStateRep, true);
	}

	@Override
	public void clearCache(List<CrmStateRep> crmStateReps) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmStateRep crmStateRep : crmStateReps) {
			entityCache.removeResult(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
				CrmStateRepImpl.class, crmStateRep.getPrimaryKey());

			clearUniqueFindersCache((CrmStateRepModelImpl)crmStateRep, true);
		}
	}

	protected void cacheUniqueFindersCache(
		CrmStateRepModelImpl crmStateRepModelImpl) {
		Object[] args = new Object[] {
				crmStateRepModelImpl.getUuid(),
				crmStateRepModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			crmStateRepModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmStateRepModelImpl crmStateRepModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					crmStateRepModelImpl.getUuid(),
					crmStateRepModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((crmStateRepModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmStateRepModelImpl.getOriginalUuid(),
					crmStateRepModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new CRM State Rep with the primary key. Does not add the CRM State Rep to the database.
	 *
	 * @param crmStateRepId the primary key for the new CRM State Rep
	 * @return the new CRM State Rep
	 */
	@Override
	public CrmStateRep create(long crmStateRepId) {
		CrmStateRep crmStateRep = new CrmStateRepImpl();

		crmStateRep.setNew(true);
		crmStateRep.setPrimaryKey(crmStateRepId);

		String uuid = PortalUUIDUtil.generate();

		crmStateRep.setUuid(uuid);

		crmStateRep.setCompanyId(companyProvider.getCompanyId());

		return crmStateRep;
	}

	/**
	 * Removes the CRM State Rep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmStateRepId the primary key of the CRM State Rep
	 * @return the CRM State Rep that was removed
	 * @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	 */
	@Override
	public CrmStateRep remove(long crmStateRepId)
		throws NoSuchCrmStateRepException {
		return remove((Serializable)crmStateRepId);
	}

	/**
	 * Removes the CRM State Rep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM State Rep
	 * @return the CRM State Rep that was removed
	 * @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	 */
	@Override
	public CrmStateRep remove(Serializable primaryKey)
		throws NoSuchCrmStateRepException {
		Session session = null;

		try {
			session = openSession();

			CrmStateRep crmStateRep = (CrmStateRep)session.get(CrmStateRepImpl.class,
					primaryKey);

			if (crmStateRep == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmStateRepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmStateRep);
		}
		catch (NoSuchCrmStateRepException nsee) {
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
	protected CrmStateRep removeImpl(CrmStateRep crmStateRep) {
		crmStateRep = toUnwrappedModel(crmStateRep);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmStateRep)) {
				crmStateRep = (CrmStateRep)session.get(CrmStateRepImpl.class,
						crmStateRep.getPrimaryKeyObj());
			}

			if (crmStateRep != null) {
				session.delete(crmStateRep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmStateRep != null) {
			clearCache(crmStateRep);
		}

		return crmStateRep;
	}

	@Override
	public CrmStateRep updateImpl(CrmStateRep crmStateRep) {
		crmStateRep = toUnwrappedModel(crmStateRep);

		boolean isNew = crmStateRep.isNew();

		CrmStateRepModelImpl crmStateRepModelImpl = (CrmStateRepModelImpl)crmStateRep;

		if (Validator.isNull(crmStateRep.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmStateRep.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmStateRep.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmStateRep.setCreateDate(now);
			}
			else {
				crmStateRep.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmStateRepModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmStateRep.setModifiedDate(now);
			}
			else {
				crmStateRep.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmStateRep.isNew()) {
				session.save(crmStateRep);

				crmStateRep.setNew(false);
			}
			else {
				crmStateRep = (CrmStateRep)session.merge(crmStateRep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmStateRepModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { crmStateRepModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					crmStateRepModelImpl.getUuid(),
					crmStateRepModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { crmStateRepModelImpl.getZipCode() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((crmStateRepModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmStateRepModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { crmStateRepModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((crmStateRepModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmStateRepModelImpl.getOriginalUuid(),
						crmStateRepModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						crmStateRepModelImpl.getUuid(),
						crmStateRepModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((crmStateRepModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmStateRepModelImpl.getOriginalZipCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);

				args = new Object[] { crmStateRepModelImpl.getZipCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);
			}
		}

		entityCache.putResult(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateRepImpl.class, crmStateRep.getPrimaryKey(), crmStateRep,
			false);

		clearUniqueFindersCache(crmStateRepModelImpl, false);
		cacheUniqueFindersCache(crmStateRepModelImpl);

		crmStateRep.resetOriginalValues();

		return crmStateRep;
	}

	protected CrmStateRep toUnwrappedModel(CrmStateRep crmStateRep) {
		if (crmStateRep instanceof CrmStateRepImpl) {
			return crmStateRep;
		}

		CrmStateRepImpl crmStateRepImpl = new CrmStateRepImpl();

		crmStateRepImpl.setNew(crmStateRep.isNew());
		crmStateRepImpl.setPrimaryKey(crmStateRep.getPrimaryKey());

		crmStateRepImpl.setUuid(crmStateRep.getUuid());
		crmStateRepImpl.setCrmStateRepId(crmStateRep.getCrmStateRepId());
		crmStateRepImpl.setGroupId(crmStateRep.getGroupId());
		crmStateRepImpl.setCompanyId(crmStateRep.getCompanyId());
		crmStateRepImpl.setUserId(crmStateRep.getUserId());
		crmStateRepImpl.setUserName(crmStateRep.getUserName());
		crmStateRepImpl.setCreateDate(crmStateRep.getCreateDate());
		crmStateRepImpl.setModifiedDate(crmStateRep.getModifiedDate());
		crmStateRepImpl.setName(crmStateRep.getName());
		crmStateRepImpl.setNumber(crmStateRep.getNumber());
		crmStateRepImpl.setZipCode(crmStateRep.getZipCode());

		return crmStateRepImpl;
	}

	/**
	 * Returns the CRM State Rep with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM State Rep
	 * @return the CRM State Rep
	 * @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	 */
	@Override
	public CrmStateRep findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmStateRepException {
		CrmStateRep crmStateRep = fetchByPrimaryKey(primaryKey);

		if (crmStateRep == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmStateRepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmStateRep;
	}

	/**
	 * Returns the CRM State Rep with the primary key or throws a {@link NoSuchCrmStateRepException} if it could not be found.
	 *
	 * @param crmStateRepId the primary key of the CRM State Rep
	 * @return the CRM State Rep
	 * @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	 */
	@Override
	public CrmStateRep findByPrimaryKey(long crmStateRepId)
		throws NoSuchCrmStateRepException {
		return findByPrimaryKey((Serializable)crmStateRepId);
	}

	/**
	 * Returns the CRM State Rep with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM State Rep
	 * @return the CRM State Rep, or <code>null</code> if a CRM State Rep with the primary key could not be found
	 */
	@Override
	public CrmStateRep fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
				CrmStateRepImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmStateRep crmStateRep = (CrmStateRep)serializable;

		if (crmStateRep == null) {
			Session session = null;

			try {
				session = openSession();

				crmStateRep = (CrmStateRep)session.get(CrmStateRepImpl.class,
						primaryKey);

				if (crmStateRep != null) {
					cacheResult(crmStateRep);
				}
				else {
					entityCache.putResult(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
						CrmStateRepImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
					CrmStateRepImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmStateRep;
	}

	/**
	 * Returns the CRM State Rep with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmStateRepId the primary key of the CRM State Rep
	 * @return the CRM State Rep, or <code>null</code> if a CRM State Rep with the primary key could not be found
	 */
	@Override
	public CrmStateRep fetchByPrimaryKey(long crmStateRepId) {
		return fetchByPrimaryKey((Serializable)crmStateRepId);
	}

	@Override
	public Map<Serializable, CrmStateRep> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmStateRep> map = new HashMap<Serializable, CrmStateRep>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmStateRep crmStateRep = fetchByPrimaryKey(primaryKey);

			if (crmStateRep != null) {
				map.put(primaryKey, crmStateRep);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
					CrmStateRepImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmStateRep)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMSTATEREP_WHERE_PKS_IN);

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

			for (CrmStateRep crmStateRep : (List<CrmStateRep>)q.list()) {
				map.put(crmStateRep.getPrimaryKeyObj(), crmStateRep);

				cacheResult(crmStateRep);

				uncachedPrimaryKeys.remove(crmStateRep.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmStateRepModelImpl.ENTITY_CACHE_ENABLED,
					CrmStateRepImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM State Reps.
	 *
	 * @return the CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM State Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @return the range of CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM State Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findAll(int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM State Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM State Reps
	 */
	@Override
	public List<CrmStateRep> findAll(int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator,
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

		List<CrmStateRep> list = null;

		if (retrieveFromCache) {
			list = (List<CrmStateRep>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMSTATEREP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMSTATEREP;

				if (pagination) {
					sql = sql.concat(CrmStateRepModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmStateRep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmStateRep>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the CRM State Reps from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmStateRep crmStateRep : findAll()) {
			remove(crmStateRep);
		}
	}

	/**
	 * Returns the number of CRM State Reps.
	 *
	 * @return the number of CRM State Reps
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMSTATEREP);

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
		return CrmStateRepModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM State Rep persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CrmStateRepImpl.class.getName());
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
	private static final String _SQL_SELECT_CRMSTATEREP = "SELECT crmStateRep FROM CrmStateRep crmStateRep";
	private static final String _SQL_SELECT_CRMSTATEREP_WHERE_PKS_IN = "SELECT crmStateRep FROM CrmStateRep crmStateRep WHERE crmStateRepId IN (";
	private static final String _SQL_SELECT_CRMSTATEREP_WHERE = "SELECT crmStateRep FROM CrmStateRep crmStateRep WHERE ";
	private static final String _SQL_COUNT_CRMSTATEREP = "SELECT COUNT(crmStateRep) FROM CrmStateRep crmStateRep";
	private static final String _SQL_COUNT_CRMSTATEREP_WHERE = "SELECT COUNT(crmStateRep) FROM CrmStateRep crmStateRep WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmStateRep.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmStateRep exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CrmStateRep exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CrmStateRepPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "number"
			});
}