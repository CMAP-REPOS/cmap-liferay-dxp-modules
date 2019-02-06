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

import contact.manager.exception.NoSuchCrmContactAuditLogChangeException;

import contact.manager.model.CrmContactAuditLogChange;
import contact.manager.model.impl.CrmContactAuditLogChangeImpl;
import contact.manager.model.impl.CrmContactAuditLogChangeModelImpl;

import contact.manager.service.persistence.CrmContactAuditLogChangePersistence;

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
 * The persistence implementation for the CRM Contact Audit Log Change service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogChangePersistence
 * @see contact.manager.service.persistence.CrmContactAuditLogChangeUtil
 * @generated
 */
@ProviderType
public class CrmContactAuditLogChangePersistenceImpl extends BasePersistenceImpl<CrmContactAuditLogChange>
	implements CrmContactAuditLogChangePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmContactAuditLogChangeUtil} to access the CRM Contact Audit Log Change persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmContactAuditLogChangeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogChangeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogChangeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogChangeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogChangeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CrmContactAuditLogChangeModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM Contact Audit Log Changes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Log Changes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @return the range of matching CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findByUuid(String uuid, int start,
		int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findByUuid(String uuid, int start,
		int end, OrderByComparator<CrmContactAuditLogChange> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findByUuid(String uuid, int start,
		int end, OrderByComparator<CrmContactAuditLogChange> orderByComparator,
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

		List<CrmContactAuditLogChange> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContactAuditLogChange>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContactAuditLogChange crmContactAuditLogChange : list) {
					if (!Objects.equals(uuid, crmContactAuditLogChange.getUuid())) {
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

			query.append(_SQL_SELECT_CRMCONTACTAUDITLOGCHANGE_WHERE);

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
				query.append(CrmContactAuditLogChangeModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmContactAuditLogChange>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContactAuditLogChange>)QueryUtil.list(q,
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
	 * Returns the first CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange findByUuid_First(String uuid,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException {
		CrmContactAuditLogChange crmContactAuditLogChange = fetchByUuid_First(uuid,
				orderByComparator);

		if (crmContactAuditLogChange != null) {
			return crmContactAuditLogChange;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmContactAuditLogChangeException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange fetchByUuid_First(String uuid,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {
		List<CrmContactAuditLogChange> list = findByUuid(uuid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange findByUuid_Last(String uuid,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException {
		CrmContactAuditLogChange crmContactAuditLogChange = fetchByUuid_Last(uuid,
				orderByComparator);

		if (crmContactAuditLogChange != null) {
			return crmContactAuditLogChange;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmContactAuditLogChangeException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange fetchByUuid_Last(String uuid,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmContactAuditLogChange> list = findByUuid(uuid, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contact Audit Log Changes before and after the current CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	 *
	 * @param crmContactAuditLogChangeId the primary key of the current CRM Contact Audit Log Change
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLogChange[] findByUuid_PrevAndNext(
		long crmContactAuditLogChangeId, String uuid,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException {
		CrmContactAuditLogChange crmContactAuditLogChange = findByPrimaryKey(crmContactAuditLogChangeId);

		Session session = null;

		try {
			session = openSession();

			CrmContactAuditLogChange[] array = new CrmContactAuditLogChangeImpl[3];

			array[0] = getByUuid_PrevAndNext(session, crmContactAuditLogChange,
					uuid, orderByComparator, true);

			array[1] = crmContactAuditLogChange;

			array[2] = getByUuid_PrevAndNext(session, crmContactAuditLogChange,
					uuid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmContactAuditLogChange getByUuid_PrevAndNext(Session session,
		CrmContactAuditLogChange crmContactAuditLogChange, String uuid,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator,
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

		query.append(_SQL_SELECT_CRMCONTACTAUDITLOGCHANGE_WHERE);

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
			query.append(CrmContactAuditLogChangeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmContactAuditLogChange);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContactAuditLogChange> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contact Audit Log Changes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmContactAuditLogChange crmContactAuditLogChange : findByUuid(
				uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmContactAuditLogChange);
		}
	}

	/**
	 * Returns the number of CRM Contact Audit Log Changes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Contact Audit Log Changes
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCONTACTAUDITLOGCHANGE_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "crmContactAuditLogChange.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmContactAuditLogChange.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(crmContactAuditLogChange.uuid IS NULL OR crmContactAuditLogChange.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogChangeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmContactAuditLogChangeModelImpl.UUID_COLUMN_BITMASK |
			CrmContactAuditLogChangeModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the CRM Contact Audit Log Change where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmContactAuditLogChangeException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmContactAuditLogChangeException {
		CrmContactAuditLogChange crmContactAuditLogChange = fetchByUUID_G(uuid,
				groupId);

		if (crmContactAuditLogChange == null) {
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

			throw new NoSuchCrmContactAuditLogChangeException(msg.toString());
		}

		return crmContactAuditLogChange;
	}

	/**
	 * Returns the CRM Contact Audit Log Change where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the CRM Contact Audit Log Change where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CrmContactAuditLogChange) {
			CrmContactAuditLogChange crmContactAuditLogChange = (CrmContactAuditLogChange)result;

			if (!Objects.equals(uuid, crmContactAuditLogChange.getUuid()) ||
					(groupId != crmContactAuditLogChange.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMCONTACTAUDITLOGCHANGE_WHERE);

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

				List<CrmContactAuditLogChange> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CrmContactAuditLogChange crmContactAuditLogChange = list.get(0);

					result = crmContactAuditLogChange;

					cacheResult(crmContactAuditLogChange);
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
			return (CrmContactAuditLogChange)result;
		}
	}

	/**
	 * Removes the CRM Contact Audit Log Change where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Contact Audit Log Change that was removed
	 */
	@Override
	public CrmContactAuditLogChange removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmContactAuditLogChangeException {
		CrmContactAuditLogChange crmContactAuditLogChange = findByUUID_G(uuid,
				groupId);

		return remove(crmContactAuditLogChange);
	}

	/**
	 * Returns the number of CRM Contact Audit Log Changes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Contact Audit Log Changes
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCONTACTAUDITLOGCHANGE_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "crmContactAuditLogChange.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "crmContactAuditLogChange.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(crmContactAuditLogChange.uuid IS NULL OR crmContactAuditLogChange.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "crmContactAuditLogChange.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogChangeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogChangeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmContactAuditLogChangeModelImpl.UUID_COLUMN_BITMASK |
			CrmContactAuditLogChangeModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findByUuid_C(String uuid,
		long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @return the range of matching CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findByUuid_C(String uuid,
		long companyId, int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findByUuid_C(String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findByUuid_C(String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator,
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

		List<CrmContactAuditLogChange> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContactAuditLogChange>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContactAuditLogChange crmContactAuditLogChange : list) {
					if (!Objects.equals(uuid, crmContactAuditLogChange.getUuid()) ||
							(companyId != crmContactAuditLogChange.getCompanyId())) {
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

			query.append(_SQL_SELECT_CRMCONTACTAUDITLOGCHANGE_WHERE);

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
				query.append(CrmContactAuditLogChangeModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmContactAuditLogChange>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContactAuditLogChange>)QueryUtil.list(q,
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
	 * Returns the first CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange findByUuid_C_First(String uuid,
		long companyId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException {
		CrmContactAuditLogChange crmContactAuditLogChange = fetchByUuid_C_First(uuid,
				companyId, orderByComparator);

		if (crmContactAuditLogChange != null) {
			return crmContactAuditLogChange;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmContactAuditLogChangeException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange fetchByUuid_C_First(String uuid,
		long companyId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {
		List<CrmContactAuditLogChange> list = findByUuid_C(uuid, companyId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange findByUuid_C_Last(String uuid,
		long companyId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException {
		CrmContactAuditLogChange crmContactAuditLogChange = fetchByUuid_C_Last(uuid,
				companyId, orderByComparator);

		if (crmContactAuditLogChange != null) {
			return crmContactAuditLogChange;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmContactAuditLogChangeException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange fetchByUuid_C_Last(String uuid,
		long companyId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmContactAuditLogChange> list = findByUuid_C(uuid, companyId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contact Audit Log Changes before and after the current CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmContactAuditLogChangeId the primary key of the current CRM Contact Audit Log Change
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLogChange[] findByUuid_C_PrevAndNext(
		long crmContactAuditLogChangeId, String uuid, long companyId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException {
		CrmContactAuditLogChange crmContactAuditLogChange = findByPrimaryKey(crmContactAuditLogChangeId);

		Session session = null;

		try {
			session = openSession();

			CrmContactAuditLogChange[] array = new CrmContactAuditLogChangeImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session,
					crmContactAuditLogChange, uuid, companyId,
					orderByComparator, true);

			array[1] = crmContactAuditLogChange;

			array[2] = getByUuid_C_PrevAndNext(session,
					crmContactAuditLogChange, uuid, companyId,
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

	protected CrmContactAuditLogChange getByUuid_C_PrevAndNext(
		Session session, CrmContactAuditLogChange crmContactAuditLogChange,
		String uuid, long companyId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator,
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

		query.append(_SQL_SELECT_CRMCONTACTAUDITLOGCHANGE_WHERE);

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
			query.append(CrmContactAuditLogChangeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmContactAuditLogChange);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContactAuditLogChange> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmContactAuditLogChange crmContactAuditLogChange : findByUuid_C(
				uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmContactAuditLogChange);
		}
	}

	/**
	 * Returns the number of CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Contact Audit Log Changes
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCONTACTAUDITLOGCHANGE_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "crmContactAuditLogChange.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "crmContactAuditLogChange.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(crmContactAuditLogChange.uuid IS NULL OR crmContactAuditLogChange.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "crmContactAuditLogChange.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CRMCONTACTAUDITLOGID =
		new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogChangeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCrmContactAuditLogId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTAUDITLOGID =
		new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED,
			CrmContactAuditLogChangeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCrmContactAuditLogId",
			new String[] { Long.class.getName() },
			CrmContactAuditLogChangeModelImpl.CRMCONTACTAUDITLOGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CRMCONTACTAUDITLOGID = new FinderPath(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCrmContactAuditLogId", new String[] { Long.class.getName() });

	/**
	 * Returns all the CRM Contact Audit Log Changes where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @return the matching CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId) {
		return findByCrmContactAuditLogId(crmContactAuditLogId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Log Changes where crmContactAuditLogId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @return the range of matching CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId, int start, int end) {
		return findByCrmContactAuditLogId(crmContactAuditLogId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes where crmContactAuditLogId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId, int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {
		return findByCrmContactAuditLogId(crmContactAuditLogId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes where crmContactAuditLogId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId, int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTAUDITLOGID;
			finderArgs = new Object[] { crmContactAuditLogId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CRMCONTACTAUDITLOGID;
			finderArgs = new Object[] {
					crmContactAuditLogId,
					
					start, end, orderByComparator
				};
		}

		List<CrmContactAuditLogChange> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContactAuditLogChange>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContactAuditLogChange crmContactAuditLogChange : list) {
					if ((crmContactAuditLogId != crmContactAuditLogChange.getCrmContactAuditLogId())) {
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

			query.append(_SQL_SELECT_CRMCONTACTAUDITLOGCHANGE_WHERE);

			query.append(_FINDER_COLUMN_CRMCONTACTAUDITLOGID_CRMCONTACTAUDITLOGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmContactAuditLogChangeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(crmContactAuditLogId);

				if (!pagination) {
					list = (List<CrmContactAuditLogChange>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContactAuditLogChange>)QueryUtil.list(q,
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
	 * Returns the first CRM Contact Audit Log Change in the ordered set where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange findByCrmContactAuditLogId_First(
		long crmContactAuditLogId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException {
		CrmContactAuditLogChange crmContactAuditLogChange = fetchByCrmContactAuditLogId_First(crmContactAuditLogId,
				orderByComparator);

		if (crmContactAuditLogChange != null) {
			return crmContactAuditLogChange;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("crmContactAuditLogId=");
		msg.append(crmContactAuditLogId);

		msg.append("}");

		throw new NoSuchCrmContactAuditLogChangeException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact Audit Log Change in the ordered set where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange fetchByCrmContactAuditLogId_First(
		long crmContactAuditLogId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {
		List<CrmContactAuditLogChange> list = findByCrmContactAuditLogId(crmContactAuditLogId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact Audit Log Change in the ordered set where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange findByCrmContactAuditLogId_Last(
		long crmContactAuditLogId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException {
		CrmContactAuditLogChange crmContactAuditLogChange = fetchByCrmContactAuditLogId_Last(crmContactAuditLogId,
				orderByComparator);

		if (crmContactAuditLogChange != null) {
			return crmContactAuditLogChange;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("crmContactAuditLogId=");
		msg.append(crmContactAuditLogId);

		msg.append("}");

		throw new NoSuchCrmContactAuditLogChangeException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact Audit Log Change in the ordered set where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	@Override
	public CrmContactAuditLogChange fetchByCrmContactAuditLogId_Last(
		long crmContactAuditLogId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {
		int count = countByCrmContactAuditLogId(crmContactAuditLogId);

		if (count == 0) {
			return null;
		}

		List<CrmContactAuditLogChange> list = findByCrmContactAuditLogId(crmContactAuditLogId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contact Audit Log Changes before and after the current CRM Contact Audit Log Change in the ordered set where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogChangeId the primary key of the current CRM Contact Audit Log Change
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLogChange[] findByCrmContactAuditLogId_PrevAndNext(
		long crmContactAuditLogChangeId, long crmContactAuditLogId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException {
		CrmContactAuditLogChange crmContactAuditLogChange = findByPrimaryKey(crmContactAuditLogChangeId);

		Session session = null;

		try {
			session = openSession();

			CrmContactAuditLogChange[] array = new CrmContactAuditLogChangeImpl[3];

			array[0] = getByCrmContactAuditLogId_PrevAndNext(session,
					crmContactAuditLogChange, crmContactAuditLogId,
					orderByComparator, true);

			array[1] = crmContactAuditLogChange;

			array[2] = getByCrmContactAuditLogId_PrevAndNext(session,
					crmContactAuditLogChange, crmContactAuditLogId,
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

	protected CrmContactAuditLogChange getByCrmContactAuditLogId_PrevAndNext(
		Session session, CrmContactAuditLogChange crmContactAuditLogChange,
		long crmContactAuditLogId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator,
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

		query.append(_SQL_SELECT_CRMCONTACTAUDITLOGCHANGE_WHERE);

		query.append(_FINDER_COLUMN_CRMCONTACTAUDITLOGID_CRMCONTACTAUDITLOGID_2);

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
			query.append(CrmContactAuditLogChangeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(crmContactAuditLogId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(crmContactAuditLogChange);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContactAuditLogChange> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contact Audit Log Changes where crmContactAuditLogId = &#63; from the database.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 */
	@Override
	public void removeByCrmContactAuditLogId(long crmContactAuditLogId) {
		for (CrmContactAuditLogChange crmContactAuditLogChange : findByCrmContactAuditLogId(
				crmContactAuditLogId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmContactAuditLogChange);
		}
	}

	/**
	 * Returns the number of CRM Contact Audit Log Changes where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @return the number of matching CRM Contact Audit Log Changes
	 */
	@Override
	public int countByCrmContactAuditLogId(long crmContactAuditLogId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CRMCONTACTAUDITLOGID;

		Object[] finderArgs = new Object[] { crmContactAuditLogId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCONTACTAUDITLOGCHANGE_WHERE);

			query.append(_FINDER_COLUMN_CRMCONTACTAUDITLOGID_CRMCONTACTAUDITLOGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(crmContactAuditLogId);

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

	private static final String _FINDER_COLUMN_CRMCONTACTAUDITLOGID_CRMCONTACTAUDITLOGID_2 =
		"crmContactAuditLogChange.crmContactAuditLogId = ?";

	public CrmContactAuditLogChangePersistenceImpl() {
		setModelClass(CrmContactAuditLogChange.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

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
	 * Caches the CRM Contact Audit Log Change in the entity cache if it is enabled.
	 *
	 * @param crmContactAuditLogChange the CRM Contact Audit Log Change
	 */
	@Override
	public void cacheResult(CrmContactAuditLogChange crmContactAuditLogChange) {
		entityCache.putResult(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeImpl.class,
			crmContactAuditLogChange.getPrimaryKey(), crmContactAuditLogChange);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] {
				crmContactAuditLogChange.getUuid(),
				crmContactAuditLogChange.getGroupId()
			}, crmContactAuditLogChange);

		crmContactAuditLogChange.resetOriginalValues();
	}

	/**
	 * Caches the CRM Contact Audit Log Changes in the entity cache if it is enabled.
	 *
	 * @param crmContactAuditLogChanges the CRM Contact Audit Log Changes
	 */
	@Override
	public void cacheResult(
		List<CrmContactAuditLogChange> crmContactAuditLogChanges) {
		for (CrmContactAuditLogChange crmContactAuditLogChange : crmContactAuditLogChanges) {
			if (entityCache.getResult(
						CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
						CrmContactAuditLogChangeImpl.class,
						crmContactAuditLogChange.getPrimaryKey()) == null) {
				cacheResult(crmContactAuditLogChange);
			}
			else {
				crmContactAuditLogChange.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM Contact Audit Log Changes.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmContactAuditLogChangeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM Contact Audit Log Change.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmContactAuditLogChange crmContactAuditLogChange) {
		entityCache.removeResult(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeImpl.class,
			crmContactAuditLogChange.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmContactAuditLogChangeModelImpl)crmContactAuditLogChange,
			true);
	}

	@Override
	public void clearCache(
		List<CrmContactAuditLogChange> crmContactAuditLogChanges) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmContactAuditLogChange crmContactAuditLogChange : crmContactAuditLogChanges) {
			entityCache.removeResult(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
				CrmContactAuditLogChangeImpl.class,
				crmContactAuditLogChange.getPrimaryKey());

			clearUniqueFindersCache((CrmContactAuditLogChangeModelImpl)crmContactAuditLogChange,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		CrmContactAuditLogChangeModelImpl crmContactAuditLogChangeModelImpl) {
		Object[] args = new Object[] {
				crmContactAuditLogChangeModelImpl.getUuid(),
				crmContactAuditLogChangeModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			crmContactAuditLogChangeModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmContactAuditLogChangeModelImpl crmContactAuditLogChangeModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					crmContactAuditLogChangeModelImpl.getUuid(),
					crmContactAuditLogChangeModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((crmContactAuditLogChangeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmContactAuditLogChangeModelImpl.getOriginalUuid(),
					crmContactAuditLogChangeModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new CRM Contact Audit Log Change with the primary key. Does not add the CRM Contact Audit Log Change to the database.
	 *
	 * @param crmContactAuditLogChangeId the primary key for the new CRM Contact Audit Log Change
	 * @return the new CRM Contact Audit Log Change
	 */
	@Override
	public CrmContactAuditLogChange create(long crmContactAuditLogChangeId) {
		CrmContactAuditLogChange crmContactAuditLogChange = new CrmContactAuditLogChangeImpl();

		crmContactAuditLogChange.setNew(true);
		crmContactAuditLogChange.setPrimaryKey(crmContactAuditLogChangeId);

		String uuid = PortalUUIDUtil.generate();

		crmContactAuditLogChange.setUuid(uuid);

		crmContactAuditLogChange.setCompanyId(companyProvider.getCompanyId());

		return crmContactAuditLogChange;
	}

	/**
	 * Removes the CRM Contact Audit Log Change with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmContactAuditLogChangeId the primary key of the CRM Contact Audit Log Change
	 * @return the CRM Contact Audit Log Change that was removed
	 * @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLogChange remove(long crmContactAuditLogChangeId)
		throws NoSuchCrmContactAuditLogChangeException {
		return remove((Serializable)crmContactAuditLogChangeId);
	}

	/**
	 * Removes the CRM Contact Audit Log Change with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM Contact Audit Log Change
	 * @return the CRM Contact Audit Log Change that was removed
	 * @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLogChange remove(Serializable primaryKey)
		throws NoSuchCrmContactAuditLogChangeException {
		Session session = null;

		try {
			session = openSession();

			CrmContactAuditLogChange crmContactAuditLogChange = (CrmContactAuditLogChange)session.get(CrmContactAuditLogChangeImpl.class,
					primaryKey);

			if (crmContactAuditLogChange == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmContactAuditLogChangeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmContactAuditLogChange);
		}
		catch (NoSuchCrmContactAuditLogChangeException nsee) {
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
	protected CrmContactAuditLogChange removeImpl(
		CrmContactAuditLogChange crmContactAuditLogChange) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmContactAuditLogChange)) {
				crmContactAuditLogChange = (CrmContactAuditLogChange)session.get(CrmContactAuditLogChangeImpl.class,
						crmContactAuditLogChange.getPrimaryKeyObj());
			}

			if (crmContactAuditLogChange != null) {
				session.delete(crmContactAuditLogChange);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmContactAuditLogChange != null) {
			clearCache(crmContactAuditLogChange);
		}

		return crmContactAuditLogChange;
	}

	@Override
	public CrmContactAuditLogChange updateImpl(
		CrmContactAuditLogChange crmContactAuditLogChange) {
		boolean isNew = crmContactAuditLogChange.isNew();

		if (!(crmContactAuditLogChange instanceof CrmContactAuditLogChangeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(crmContactAuditLogChange.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(crmContactAuditLogChange);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in crmContactAuditLogChange proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CrmContactAuditLogChange implementation " +
				crmContactAuditLogChange.getClass());
		}

		CrmContactAuditLogChangeModelImpl crmContactAuditLogChangeModelImpl = (CrmContactAuditLogChangeModelImpl)crmContactAuditLogChange;

		if (Validator.isNull(crmContactAuditLogChange.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmContactAuditLogChange.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmContactAuditLogChange.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmContactAuditLogChange.setCreateDate(now);
			}
			else {
				crmContactAuditLogChange.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!crmContactAuditLogChangeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmContactAuditLogChange.setModifiedDate(now);
			}
			else {
				crmContactAuditLogChange.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmContactAuditLogChange.isNew()) {
				session.save(crmContactAuditLogChange);

				crmContactAuditLogChange.setNew(false);
			}
			else {
				crmContactAuditLogChange = (CrmContactAuditLogChange)session.merge(crmContactAuditLogChange);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmContactAuditLogChangeModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					crmContactAuditLogChangeModelImpl.getUuid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					crmContactAuditLogChangeModelImpl.getUuid(),
					crmContactAuditLogChangeModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] {
					crmContactAuditLogChangeModelImpl.getCrmContactAuditLogId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CRMCONTACTAUDITLOGID,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTAUDITLOGID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((crmContactAuditLogChangeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactAuditLogChangeModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { crmContactAuditLogChangeModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((crmContactAuditLogChangeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactAuditLogChangeModelImpl.getOriginalUuid(),
						crmContactAuditLogChangeModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						crmContactAuditLogChangeModelImpl.getUuid(),
						crmContactAuditLogChangeModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((crmContactAuditLogChangeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTAUDITLOGID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactAuditLogChangeModelImpl.getOriginalCrmContactAuditLogId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRMCONTACTAUDITLOGID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTAUDITLOGID,
					args);

				args = new Object[] {
						crmContactAuditLogChangeModelImpl.getCrmContactAuditLogId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRMCONTACTAUDITLOGID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTAUDITLOGID,
					args);
			}
		}

		entityCache.putResult(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactAuditLogChangeImpl.class,
			crmContactAuditLogChange.getPrimaryKey(), crmContactAuditLogChange,
			false);

		clearUniqueFindersCache(crmContactAuditLogChangeModelImpl, false);
		cacheUniqueFindersCache(crmContactAuditLogChangeModelImpl);

		crmContactAuditLogChange.resetOriginalValues();

		return crmContactAuditLogChange;
	}

	/**
	 * Returns the CRM Contact Audit Log Change with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Contact Audit Log Change
	 * @return the CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLogChange findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmContactAuditLogChangeException {
		CrmContactAuditLogChange crmContactAuditLogChange = fetchByPrimaryKey(primaryKey);

		if (crmContactAuditLogChange == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmContactAuditLogChangeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmContactAuditLogChange;
	}

	/**
	 * Returns the CRM Contact Audit Log Change with the primary key or throws a {@link NoSuchCrmContactAuditLogChangeException} if it could not be found.
	 *
	 * @param crmContactAuditLogChangeId the primary key of the CRM Contact Audit Log Change
	 * @return the CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLogChange findByPrimaryKey(
		long crmContactAuditLogChangeId)
		throws NoSuchCrmContactAuditLogChangeException {
		return findByPrimaryKey((Serializable)crmContactAuditLogChangeId);
	}

	/**
	 * Returns the CRM Contact Audit Log Change with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Contact Audit Log Change
	 * @return the CRM Contact Audit Log Change, or <code>null</code> if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLogChange fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
				CrmContactAuditLogChangeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmContactAuditLogChange crmContactAuditLogChange = (CrmContactAuditLogChange)serializable;

		if (crmContactAuditLogChange == null) {
			Session session = null;

			try {
				session = openSession();

				crmContactAuditLogChange = (CrmContactAuditLogChange)session.get(CrmContactAuditLogChangeImpl.class,
						primaryKey);

				if (crmContactAuditLogChange != null) {
					cacheResult(crmContactAuditLogChange);
				}
				else {
					entityCache.putResult(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
						CrmContactAuditLogChangeImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
					CrmContactAuditLogChangeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmContactAuditLogChange;
	}

	/**
	 * Returns the CRM Contact Audit Log Change with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmContactAuditLogChangeId the primary key of the CRM Contact Audit Log Change
	 * @return the CRM Contact Audit Log Change, or <code>null</code> if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	@Override
	public CrmContactAuditLogChange fetchByPrimaryKey(
		long crmContactAuditLogChangeId) {
		return fetchByPrimaryKey((Serializable)crmContactAuditLogChangeId);
	}

	@Override
	public Map<Serializable, CrmContactAuditLogChange> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmContactAuditLogChange> map = new HashMap<Serializable, CrmContactAuditLogChange>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmContactAuditLogChange crmContactAuditLogChange = fetchByPrimaryKey(primaryKey);

			if (crmContactAuditLogChange != null) {
				map.put(primaryKey, crmContactAuditLogChange);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
					CrmContactAuditLogChangeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmContactAuditLogChange)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMCONTACTAUDITLOGCHANGE_WHERE_PKS_IN);

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

			for (CrmContactAuditLogChange crmContactAuditLogChange : (List<CrmContactAuditLogChange>)q.list()) {
				map.put(crmContactAuditLogChange.getPrimaryKeyObj(),
					crmContactAuditLogChange);

				cacheResult(crmContactAuditLogChange);

				uncachedPrimaryKeys.remove(crmContactAuditLogChange.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
					CrmContactAuditLogChangeImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM Contact Audit Log Changes.
	 *
	 * @return the CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Log Changes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @return the range of CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findAll(int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM Contact Audit Log Changes
	 */
	@Override
	public List<CrmContactAuditLogChange> findAll(int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator,
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

		List<CrmContactAuditLogChange> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContactAuditLogChange>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMCONTACTAUDITLOGCHANGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMCONTACTAUDITLOGCHANGE;

				if (pagination) {
					sql = sql.concat(CrmContactAuditLogChangeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmContactAuditLogChange>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContactAuditLogChange>)QueryUtil.list(q,
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
	 * Removes all the CRM Contact Audit Log Changes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmContactAuditLogChange crmContactAuditLogChange : findAll()) {
			remove(crmContactAuditLogChange);
		}
	}

	/**
	 * Returns the number of CRM Contact Audit Log Changes.
	 *
	 * @return the number of CRM Contact Audit Log Changes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMCONTACTAUDITLOGCHANGE);

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
		return CrmContactAuditLogChangeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM Contact Audit Log Change persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CrmContactAuditLogChangeImpl.class.getName());
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
	private static final String _SQL_SELECT_CRMCONTACTAUDITLOGCHANGE = "SELECT crmContactAuditLogChange FROM CrmContactAuditLogChange crmContactAuditLogChange";
	private static final String _SQL_SELECT_CRMCONTACTAUDITLOGCHANGE_WHERE_PKS_IN =
		"SELECT crmContactAuditLogChange FROM CrmContactAuditLogChange crmContactAuditLogChange WHERE crmContactAuditLogChangeId IN (";
	private static final String _SQL_SELECT_CRMCONTACTAUDITLOGCHANGE_WHERE = "SELECT crmContactAuditLogChange FROM CrmContactAuditLogChange crmContactAuditLogChange WHERE ";
	private static final String _SQL_COUNT_CRMCONTACTAUDITLOGCHANGE = "SELECT COUNT(crmContactAuditLogChange) FROM CrmContactAuditLogChange crmContactAuditLogChange";
	private static final String _SQL_COUNT_CRMCONTACTAUDITLOGCHANGE_WHERE = "SELECT COUNT(crmContactAuditLogChange) FROM CrmContactAuditLogChange crmContactAuditLogChange WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmContactAuditLogChange.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmContactAuditLogChange exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CrmContactAuditLogChange exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CrmContactAuditLogChangePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}