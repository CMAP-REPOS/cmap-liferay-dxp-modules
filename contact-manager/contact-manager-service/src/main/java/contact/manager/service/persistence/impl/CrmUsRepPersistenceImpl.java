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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.exception.NoSuchCrmUsRepException;

import contact.manager.model.CrmUsRep;
import contact.manager.model.impl.CrmUsRepImpl;
import contact.manager.model.impl.CrmUsRepModelImpl;

import contact.manager.service.persistence.CrmUsRepPersistence;

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
 * The persistence implementation for the CRM US Rep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmUsRepPersistence
 * @see contact.manager.service.persistence.CrmUsRepUtil
 * @generated
 */
@ProviderType
public class CrmUsRepPersistenceImpl extends BasePersistenceImpl<CrmUsRep>
	implements CrmUsRepPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmUsRepUtil} to access the CRM US Rep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmUsRepImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, CrmUsRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, CrmUsRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, CrmUsRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, CrmUsRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CrmUsRepModelImpl.UUID_COLUMN_BITMASK |
			CrmUsRepModelImpl.NUMBER_COLUMN_BITMASK |
			CrmUsRepModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM US Reps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM US Reps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @return the range of matching CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator, boolean retrieveFromCache) {
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

		List<CrmUsRep> list = null;

		if (retrieveFromCache) {
			list = (List<CrmUsRep>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmUsRep crmUsRep : list) {
					if (!Objects.equals(uuid, crmUsRep.getUuid())) {
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

			query.append(_SQL_SELECT_CRMUSREP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
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
				query.append(CrmUsRepModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmUsRep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmUsRep>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM US Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep findByUuid_First(String uuid,
		OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException {
		CrmUsRep crmUsRep = fetchByUuid_First(uuid, orderByComparator);

		if (crmUsRep != null) {
			return crmUsRep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmUsRepException(msg.toString());
	}

	/**
	 * Returns the first CRM US Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep fetchByUuid_First(String uuid,
		OrderByComparator<CrmUsRep> orderByComparator) {
		List<CrmUsRep> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM US Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep findByUuid_Last(String uuid,
		OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException {
		CrmUsRep crmUsRep = fetchByUuid_Last(uuid, orderByComparator);

		if (crmUsRep != null) {
			return crmUsRep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmUsRepException(msg.toString());
	}

	/**
	 * Returns the last CRM US Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep fetchByUuid_Last(String uuid,
		OrderByComparator<CrmUsRep> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmUsRep> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM US Reps before and after the current CRM US Rep in the ordered set where uuid = &#63;.
	 *
	 * @param crmUsRepId the primary key of the current CRM US Rep
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM US Rep
	 * @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	 */
	@Override
	public CrmUsRep[] findByUuid_PrevAndNext(long crmUsRepId, String uuid,
		OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException {
		CrmUsRep crmUsRep = findByPrimaryKey(crmUsRepId);

		Session session = null;

		try {
			session = openSession();

			CrmUsRep[] array = new CrmUsRepImpl[3];

			array[0] = getByUuid_PrevAndNext(session, crmUsRep, uuid,
					orderByComparator, true);

			array[1] = crmUsRep;

			array[2] = getByUuid_PrevAndNext(session, crmUsRep, uuid,
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

	protected CrmUsRep getByUuid_PrevAndNext(Session session,
		CrmUsRep crmUsRep, String uuid,
		OrderByComparator<CrmUsRep> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMUSREP_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals("")) {
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
			query.append(CrmUsRepModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmUsRep);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmUsRep> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM US Reps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmUsRep crmUsRep : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmUsRep);
		}
	}

	/**
	 * Returns the number of CRM US Reps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM US Reps
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMUSREP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "crmUsRep.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmUsRep.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(crmUsRep.uuid IS NULL OR crmUsRep.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, CrmUsRepImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmUsRepModelImpl.UUID_COLUMN_BITMASK |
			CrmUsRepModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the CRM US Rep where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmUsRepException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmUsRepException {
		CrmUsRep crmUsRep = fetchByUUID_G(uuid, groupId);

		if (crmUsRep == null) {
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

			throw new NoSuchCrmUsRepException(msg.toString());
		}

		return crmUsRep;
	}

	/**
	 * Returns the CRM US Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the CRM US Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CrmUsRep) {
			CrmUsRep crmUsRep = (CrmUsRep)result;

			if (!Objects.equals(uuid, crmUsRep.getUuid()) ||
					(groupId != crmUsRep.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMUSREP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
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

				List<CrmUsRep> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CrmUsRep crmUsRep = list.get(0);

					result = crmUsRep;

					cacheResult(crmUsRep);
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
			return (CrmUsRep)result;
		}
	}

	/**
	 * Removes the CRM US Rep where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM US Rep that was removed
	 */
	@Override
	public CrmUsRep removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmUsRepException {
		CrmUsRep crmUsRep = findByUUID_G(uuid, groupId);

		return remove(crmUsRep);
	}

	/**
	 * Returns the number of CRM US Reps where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM US Reps
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMUSREP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "crmUsRep.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "crmUsRep.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(crmUsRep.uuid IS NULL OR crmUsRep.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "crmUsRep.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, CrmUsRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, CrmUsRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmUsRepModelImpl.UUID_COLUMN_BITMASK |
			CrmUsRepModelImpl.COMPANYID_COLUMN_BITMASK |
			CrmUsRepModelImpl.NUMBER_COLUMN_BITMASK |
			CrmUsRepModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the CRM US Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM US Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @return the range of matching CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<CrmUsRep> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<CrmUsRep> orderByComparator,
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

		List<CrmUsRep> list = null;

		if (retrieveFromCache) {
			list = (List<CrmUsRep>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmUsRep crmUsRep : list) {
					if (!Objects.equals(uuid, crmUsRep.getUuid()) ||
							(companyId != crmUsRep.getCompanyId())) {
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

			query.append(_SQL_SELECT_CRMUSREP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
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
				query.append(CrmUsRepModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmUsRep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmUsRep>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException {
		CrmUsRep crmUsRep = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (crmUsRep != null) {
			return crmUsRep;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmUsRepException(msg.toString());
	}

	/**
	 * Returns the first CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmUsRep> orderByComparator) {
		List<CrmUsRep> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException {
		CrmUsRep crmUsRep = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (crmUsRep != null) {
			return crmUsRep;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmUsRepException(msg.toString());
	}

	/**
	 * Returns the last CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmUsRep> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmUsRep> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM US Reps before and after the current CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmUsRepId the primary key of the current CRM US Rep
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM US Rep
	 * @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	 */
	@Override
	public CrmUsRep[] findByUuid_C_PrevAndNext(long crmUsRepId, String uuid,
		long companyId, OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException {
		CrmUsRep crmUsRep = findByPrimaryKey(crmUsRepId);

		Session session = null;

		try {
			session = openSession();

			CrmUsRep[] array = new CrmUsRepImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, crmUsRep, uuid,
					companyId, orderByComparator, true);

			array[1] = crmUsRep;

			array[2] = getByUuid_C_PrevAndNext(session, crmUsRep, uuid,
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

	protected CrmUsRep getByUuid_C_PrevAndNext(Session session,
		CrmUsRep crmUsRep, String uuid, long companyId,
		OrderByComparator<CrmUsRep> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMUSREP_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals("")) {
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
			query.append(CrmUsRepModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmUsRep);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmUsRep> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM US Reps where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmUsRep crmUsRep : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmUsRep);
		}
	}

	/**
	 * Returns the number of CRM US Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM US Reps
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMUSREP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "crmUsRep.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "crmUsRep.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(crmUsRep.uuid IS NULL OR crmUsRep.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "crmUsRep.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ZIPCODE = new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, CrmUsRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByZipCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE =
		new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, CrmUsRepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByZipCode",
			new String[] { String.class.getName() },
			CrmUsRepModelImpl.ZIPCODE_COLUMN_BITMASK |
			CrmUsRepModelImpl.NUMBER_COLUMN_BITMASK |
			CrmUsRepModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ZIPCODE = new FinderPath(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByZipCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM US Reps where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findByZipCode(String zipCode) {
		return findByZipCode(zipCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM US Reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @return the range of matching CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findByZipCode(String zipCode, int start, int end) {
		return findByZipCode(zipCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator) {
		return findByZipCode(zipCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator, boolean retrieveFromCache) {
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

		List<CrmUsRep> list = null;

		if (retrieveFromCache) {
			list = (List<CrmUsRep>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmUsRep crmUsRep : list) {
					if (!Objects.equals(zipCode, crmUsRep.getZipCode())) {
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

			query.append(_SQL_SELECT_CRMUSREP_WHERE);

			boolean bindZipCode = false;

			if (zipCode == null) {
				query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_1);
			}
			else if (zipCode.equals("")) {
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
				query.append(CrmUsRepModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmUsRep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmUsRep>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM US Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep findByZipCode_First(String zipCode,
		OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException {
		CrmUsRep crmUsRep = fetchByZipCode_First(zipCode, orderByComparator);

		if (crmUsRep != null) {
			return crmUsRep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append("}");

		throw new NoSuchCrmUsRepException(msg.toString());
	}

	/**
	 * Returns the first CRM US Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep fetchByZipCode_First(String zipCode,
		OrderByComparator<CrmUsRep> orderByComparator) {
		List<CrmUsRep> list = findByZipCode(zipCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM US Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep findByZipCode_Last(String zipCode,
		OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException {
		CrmUsRep crmUsRep = fetchByZipCode_Last(zipCode, orderByComparator);

		if (crmUsRep != null) {
			return crmUsRep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append("}");

		throw new NoSuchCrmUsRepException(msg.toString());
	}

	/**
	 * Returns the last CRM US Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	@Override
	public CrmUsRep fetchByZipCode_Last(String zipCode,
		OrderByComparator<CrmUsRep> orderByComparator) {
		int count = countByZipCode(zipCode);

		if (count == 0) {
			return null;
		}

		List<CrmUsRep> list = findByZipCode(zipCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM US Reps before and after the current CRM US Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param crmUsRepId the primary key of the current CRM US Rep
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM US Rep
	 * @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	 */
	@Override
	public CrmUsRep[] findByZipCode_PrevAndNext(long crmUsRepId,
		String zipCode, OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException {
		CrmUsRep crmUsRep = findByPrimaryKey(crmUsRepId);

		Session session = null;

		try {
			session = openSession();

			CrmUsRep[] array = new CrmUsRepImpl[3];

			array[0] = getByZipCode_PrevAndNext(session, crmUsRep, zipCode,
					orderByComparator, true);

			array[1] = crmUsRep;

			array[2] = getByZipCode_PrevAndNext(session, crmUsRep, zipCode,
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

	protected CrmUsRep getByZipCode_PrevAndNext(Session session,
		CrmUsRep crmUsRep, String zipCode,
		OrderByComparator<CrmUsRep> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMUSREP_WHERE);

		boolean bindZipCode = false;

		if (zipCode == null) {
			query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_1);
		}
		else if (zipCode.equals("")) {
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
			query.append(CrmUsRepModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmUsRep);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmUsRep> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM US Reps where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	@Override
	public void removeByZipCode(String zipCode) {
		for (CrmUsRep crmUsRep : findByZipCode(zipCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmUsRep);
		}
	}

	/**
	 * Returns the number of CRM US Reps where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching CRM US Reps
	 */
	@Override
	public int countByZipCode(String zipCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ZIPCODE;

		Object[] finderArgs = new Object[] { zipCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMUSREP_WHERE);

			boolean bindZipCode = false;

			if (zipCode == null) {
				query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_1);
			}
			else if (zipCode.equals("")) {
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

	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_1 = "crmUsRep.zipCode IS NULL";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_2 = "crmUsRep.zipCode = ?";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_3 = "(crmUsRep.zipCode IS NULL OR crmUsRep.zipCode = '')";

	public CrmUsRepPersistenceImpl() {
		setModelClass(CrmUsRep.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

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
	 * Caches the CRM US Rep in the entity cache if it is enabled.
	 *
	 * @param crmUsRep the CRM US Rep
	 */
	@Override
	public void cacheResult(CrmUsRep crmUsRep) {
		entityCache.putResult(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepImpl.class, crmUsRep.getPrimaryKey(), crmUsRep);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { crmUsRep.getUuid(), crmUsRep.getGroupId() }, crmUsRep);

		crmUsRep.resetOriginalValues();
	}

	/**
	 * Caches the CRM US Reps in the entity cache if it is enabled.
	 *
	 * @param crmUsReps the CRM US Reps
	 */
	@Override
	public void cacheResult(List<CrmUsRep> crmUsReps) {
		for (CrmUsRep crmUsRep : crmUsReps) {
			if (entityCache.getResult(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
						CrmUsRepImpl.class, crmUsRep.getPrimaryKey()) == null) {
				cacheResult(crmUsRep);
			}
			else {
				crmUsRep.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM US Reps.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmUsRepImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM US Rep.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmUsRep crmUsRep) {
		entityCache.removeResult(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepImpl.class, crmUsRep.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmUsRepModelImpl)crmUsRep, true);
	}

	@Override
	public void clearCache(List<CrmUsRep> crmUsReps) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmUsRep crmUsRep : crmUsReps) {
			entityCache.removeResult(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
				CrmUsRepImpl.class, crmUsRep.getPrimaryKey());

			clearUniqueFindersCache((CrmUsRepModelImpl)crmUsRep, true);
		}
	}

	protected void cacheUniqueFindersCache(CrmUsRepModelImpl crmUsRepModelImpl) {
		Object[] args = new Object[] {
				crmUsRepModelImpl.getUuid(), crmUsRepModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			crmUsRepModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmUsRepModelImpl crmUsRepModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					crmUsRepModelImpl.getUuid(), crmUsRepModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((crmUsRepModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmUsRepModelImpl.getOriginalUuid(),
					crmUsRepModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new CRM US Rep with the primary key. Does not add the CRM US Rep to the database.
	 *
	 * @param crmUsRepId the primary key for the new CRM US Rep
	 * @return the new CRM US Rep
	 */
	@Override
	public CrmUsRep create(long crmUsRepId) {
		CrmUsRep crmUsRep = new CrmUsRepImpl();

		crmUsRep.setNew(true);
		crmUsRep.setPrimaryKey(crmUsRepId);

		String uuid = PortalUUIDUtil.generate();

		crmUsRep.setUuid(uuid);

		crmUsRep.setCompanyId(companyProvider.getCompanyId());

		return crmUsRep;
	}

	/**
	 * Removes the CRM US Rep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmUsRepId the primary key of the CRM US Rep
	 * @return the CRM US Rep that was removed
	 * @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	 */
	@Override
	public CrmUsRep remove(long crmUsRepId) throws NoSuchCrmUsRepException {
		return remove((Serializable)crmUsRepId);
	}

	/**
	 * Removes the CRM US Rep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM US Rep
	 * @return the CRM US Rep that was removed
	 * @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	 */
	@Override
	public CrmUsRep remove(Serializable primaryKey)
		throws NoSuchCrmUsRepException {
		Session session = null;

		try {
			session = openSession();

			CrmUsRep crmUsRep = (CrmUsRep)session.get(CrmUsRepImpl.class,
					primaryKey);

			if (crmUsRep == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmUsRepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmUsRep);
		}
		catch (NoSuchCrmUsRepException nsee) {
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
	protected CrmUsRep removeImpl(CrmUsRep crmUsRep) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmUsRep)) {
				crmUsRep = (CrmUsRep)session.get(CrmUsRepImpl.class,
						crmUsRep.getPrimaryKeyObj());
			}

			if (crmUsRep != null) {
				session.delete(crmUsRep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmUsRep != null) {
			clearCache(crmUsRep);
		}

		return crmUsRep;
	}

	@Override
	public CrmUsRep updateImpl(CrmUsRep crmUsRep) {
		boolean isNew = crmUsRep.isNew();

		if (!(crmUsRep instanceof CrmUsRepModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(crmUsRep.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(crmUsRep);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in crmUsRep proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CrmUsRep implementation " +
				crmUsRep.getClass());
		}

		CrmUsRepModelImpl crmUsRepModelImpl = (CrmUsRepModelImpl)crmUsRep;

		if (Validator.isNull(crmUsRep.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmUsRep.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmUsRep.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmUsRep.setCreateDate(now);
			}
			else {
				crmUsRep.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmUsRepModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmUsRep.setModifiedDate(now);
			}
			else {
				crmUsRep.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmUsRep.isNew()) {
				session.save(crmUsRep);

				crmUsRep.setNew(false);
			}
			else {
				crmUsRep = (CrmUsRep)session.merge(crmUsRep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmUsRepModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { crmUsRepModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					crmUsRepModelImpl.getUuid(),
					crmUsRepModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { crmUsRepModelImpl.getZipCode() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((crmUsRepModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { crmUsRepModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { crmUsRepModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((crmUsRepModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmUsRepModelImpl.getOriginalUuid(),
						crmUsRepModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						crmUsRepModelImpl.getUuid(),
						crmUsRepModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((crmUsRepModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmUsRepModelImpl.getOriginalZipCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);

				args = new Object[] { crmUsRepModelImpl.getZipCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);
			}
		}

		entityCache.putResult(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
			CrmUsRepImpl.class, crmUsRep.getPrimaryKey(), crmUsRep, false);

		clearUniqueFindersCache(crmUsRepModelImpl, false);
		cacheUniqueFindersCache(crmUsRepModelImpl);

		crmUsRep.resetOriginalValues();

		return crmUsRep;
	}

	/**
	 * Returns the CRM US Rep with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM US Rep
	 * @return the CRM US Rep
	 * @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	 */
	@Override
	public CrmUsRep findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmUsRepException {
		CrmUsRep crmUsRep = fetchByPrimaryKey(primaryKey);

		if (crmUsRep == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmUsRepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmUsRep;
	}

	/**
	 * Returns the CRM US Rep with the primary key or throws a {@link NoSuchCrmUsRepException} if it could not be found.
	 *
	 * @param crmUsRepId the primary key of the CRM US Rep
	 * @return the CRM US Rep
	 * @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	 */
	@Override
	public CrmUsRep findByPrimaryKey(long crmUsRepId)
		throws NoSuchCrmUsRepException {
		return findByPrimaryKey((Serializable)crmUsRepId);
	}

	/**
	 * Returns the CRM US Rep with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM US Rep
	 * @return the CRM US Rep, or <code>null</code> if a CRM US Rep with the primary key could not be found
	 */
	@Override
	public CrmUsRep fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
				CrmUsRepImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmUsRep crmUsRep = (CrmUsRep)serializable;

		if (crmUsRep == null) {
			Session session = null;

			try {
				session = openSession();

				crmUsRep = (CrmUsRep)session.get(CrmUsRepImpl.class, primaryKey);

				if (crmUsRep != null) {
					cacheResult(crmUsRep);
				}
				else {
					entityCache.putResult(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
						CrmUsRepImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
					CrmUsRepImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmUsRep;
	}

	/**
	 * Returns the CRM US Rep with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmUsRepId the primary key of the CRM US Rep
	 * @return the CRM US Rep, or <code>null</code> if a CRM US Rep with the primary key could not be found
	 */
	@Override
	public CrmUsRep fetchByPrimaryKey(long crmUsRepId) {
		return fetchByPrimaryKey((Serializable)crmUsRepId);
	}

	@Override
	public Map<Serializable, CrmUsRep> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmUsRep> map = new HashMap<Serializable, CrmUsRep>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmUsRep crmUsRep = fetchByPrimaryKey(primaryKey);

			if (crmUsRep != null) {
				map.put(primaryKey, crmUsRep);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
					CrmUsRepImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmUsRep)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMUSREP_WHERE_PKS_IN);

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

			for (CrmUsRep crmUsRep : (List<CrmUsRep>)q.list()) {
				map.put(crmUsRep.getPrimaryKeyObj(), crmUsRep);

				cacheResult(crmUsRep);

				uncachedPrimaryKeys.remove(crmUsRep.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmUsRepModelImpl.ENTITY_CACHE_ENABLED,
					CrmUsRepImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM US Reps.
	 *
	 * @return the CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM US Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @return the range of CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findAll(int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM US Reps
	 */
	@Override
	public List<CrmUsRep> findAll(int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator, boolean retrieveFromCache) {
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

		List<CrmUsRep> list = null;

		if (retrieveFromCache) {
			list = (List<CrmUsRep>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMUSREP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMUSREP;

				if (pagination) {
					sql = sql.concat(CrmUsRepModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmUsRep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmUsRep>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the CRM US Reps from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmUsRep crmUsRep : findAll()) {
			remove(crmUsRep);
		}
	}

	/**
	 * Returns the number of CRM US Reps.
	 *
	 * @return the number of CRM US Reps
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMUSREP);

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
		return CrmUsRepModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM US Rep persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CrmUsRepImpl.class.getName());
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
	private static final String _SQL_SELECT_CRMUSREP = "SELECT crmUsRep FROM CrmUsRep crmUsRep";
	private static final String _SQL_SELECT_CRMUSREP_WHERE_PKS_IN = "SELECT crmUsRep FROM CrmUsRep crmUsRep WHERE crmUsRepId IN (";
	private static final String _SQL_SELECT_CRMUSREP_WHERE = "SELECT crmUsRep FROM CrmUsRep crmUsRep WHERE ";
	private static final String _SQL_COUNT_CRMUSREP = "SELECT COUNT(crmUsRep) FROM CrmUsRep crmUsRep";
	private static final String _SQL_COUNT_CRMUSREP_WHERE = "SELECT COUNT(crmUsRep) FROM CrmUsRep crmUsRep WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmUsRep.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmUsRep exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CrmUsRep exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CrmUsRepPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "number"
			});
}