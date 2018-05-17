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

import contact.manager.exception.NoSuchCrmStateSenateException;

import contact.manager.model.CrmStateSenate;
import contact.manager.model.impl.CrmStateSenateImpl;
import contact.manager.model.impl.CrmStateSenateModelImpl;

import contact.manager.service.persistence.CrmStateSenatePersistence;

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
 * The persistence implementation for the CRM State Senate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateSenatePersistence
 * @see contact.manager.service.persistence.CrmStateSenateUtil
 * @generated
 */
@ProviderType
public class CrmStateSenatePersistenceImpl extends BasePersistenceImpl<CrmStateSenate>
	implements CrmStateSenatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmStateSenateUtil} to access the CRM State Senate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmStateSenateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateModelImpl.FINDER_CACHE_ENABLED,
			CrmStateSenateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateModelImpl.FINDER_CACHE_ENABLED,
			CrmStateSenateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateModelImpl.FINDER_CACHE_ENABLED,
			CrmStateSenateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateModelImpl.FINDER_CACHE_ENABLED,
			CrmStateSenateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CrmStateSenateModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM State Senates where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM State Senates
	 */
	@Override
	public List<CrmStateSenate> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM State Senates where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM State Senates
	 * @param end the upper bound of the range of CRM State Senates (not inclusive)
	 * @return the range of matching CRM State Senates
	 */
	@Override
	public List<CrmStateSenate> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM State Senates where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM State Senates
	 * @param end the upper bound of the range of CRM State Senates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM State Senates
	 */
	@Override
	public List<CrmStateSenate> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmStateSenate> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM State Senates where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM State Senates
	 * @param end the upper bound of the range of CRM State Senates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM State Senates
	 */
	@Override
	public List<CrmStateSenate> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmStateSenate> orderByComparator,
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

		List<CrmStateSenate> list = null;

		if (retrieveFromCache) {
			list = (List<CrmStateSenate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmStateSenate crmStateSenate : list) {
					if (!Objects.equals(uuid, crmStateSenate.getUuid())) {
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

			query.append(_SQL_SELECT_CRMSTATESENATE_WHERE);

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
				query.append(CrmStateSenateModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmStateSenate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmStateSenate>)QueryUtil.list(q,
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
	 * Returns the first CRM State Senate in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Senate
	 * @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	 */
	@Override
	public CrmStateSenate findByUuid_First(String uuid,
		OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException {
		CrmStateSenate crmStateSenate = fetchByUuid_First(uuid,
				orderByComparator);

		if (crmStateSenate != null) {
			return crmStateSenate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmStateSenateException(msg.toString());
	}

	/**
	 * Returns the first CRM State Senate in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	 */
	@Override
	public CrmStateSenate fetchByUuid_First(String uuid,
		OrderByComparator<CrmStateSenate> orderByComparator) {
		List<CrmStateSenate> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM State Senate in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Senate
	 * @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	 */
	@Override
	public CrmStateSenate findByUuid_Last(String uuid,
		OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException {
		CrmStateSenate crmStateSenate = fetchByUuid_Last(uuid, orderByComparator);

		if (crmStateSenate != null) {
			return crmStateSenate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmStateSenateException(msg.toString());
	}

	/**
	 * Returns the last CRM State Senate in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	 */
	@Override
	public CrmStateSenate fetchByUuid_Last(String uuid,
		OrderByComparator<CrmStateSenate> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmStateSenate> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM State Senates before and after the current CRM State Senate in the ordered set where uuid = &#63;.
	 *
	 * @param crmStateSenateId the primary key of the current CRM State Senate
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM State Senate
	 * @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	 */
	@Override
	public CrmStateSenate[] findByUuid_PrevAndNext(long crmStateSenateId,
		String uuid, OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException {
		CrmStateSenate crmStateSenate = findByPrimaryKey(crmStateSenateId);

		Session session = null;

		try {
			session = openSession();

			CrmStateSenate[] array = new CrmStateSenateImpl[3];

			array[0] = getByUuid_PrevAndNext(session, crmStateSenate, uuid,
					orderByComparator, true);

			array[1] = crmStateSenate;

			array[2] = getByUuid_PrevAndNext(session, crmStateSenate, uuid,
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

	protected CrmStateSenate getByUuid_PrevAndNext(Session session,
		CrmStateSenate crmStateSenate, String uuid,
		OrderByComparator<CrmStateSenate> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMSTATESENATE_WHERE);

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
			query.append(CrmStateSenateModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmStateSenate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmStateSenate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM State Senates where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmStateSenate crmStateSenate : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmStateSenate);
		}
	}

	/**
	 * Returns the number of CRM State Senates where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM State Senates
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMSTATESENATE_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "crmStateSenate.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmStateSenate.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(crmStateSenate.uuid IS NULL OR crmStateSenate.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateModelImpl.FINDER_CACHE_ENABLED,
			CrmStateSenateImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmStateSenateModelImpl.UUID_COLUMN_BITMASK |
			CrmStateSenateModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the CRM State Senate where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmStateSenateException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM State Senate
	 * @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	 */
	@Override
	public CrmStateSenate findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmStateSenateException {
		CrmStateSenate crmStateSenate = fetchByUUID_G(uuid, groupId);

		if (crmStateSenate == null) {
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

			throw new NoSuchCrmStateSenateException(msg.toString());
		}

		return crmStateSenate;
	}

	/**
	 * Returns the CRM State Senate where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	 */
	@Override
	public CrmStateSenate fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the CRM State Senate where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	 */
	@Override
	public CrmStateSenate fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CrmStateSenate) {
			CrmStateSenate crmStateSenate = (CrmStateSenate)result;

			if (!Objects.equals(uuid, crmStateSenate.getUuid()) ||
					(groupId != crmStateSenate.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMSTATESENATE_WHERE);

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

				List<CrmStateSenate> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CrmStateSenate crmStateSenate = list.get(0);

					result = crmStateSenate;

					cacheResult(crmStateSenate);

					if ((crmStateSenate.getUuid() == null) ||
							!crmStateSenate.getUuid().equals(uuid) ||
							(crmStateSenate.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, crmStateSenate);
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
			return (CrmStateSenate)result;
		}
	}

	/**
	 * Removes the CRM State Senate where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM State Senate that was removed
	 */
	@Override
	public CrmStateSenate removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmStateSenateException {
		CrmStateSenate crmStateSenate = findByUUID_G(uuid, groupId);

		return remove(crmStateSenate);
	}

	/**
	 * Returns the number of CRM State Senates where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM State Senates
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMSTATESENATE_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "crmStateSenate.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "crmStateSenate.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(crmStateSenate.uuid IS NULL OR crmStateSenate.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "crmStateSenate.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateModelImpl.FINDER_CACHE_ENABLED,
			CrmStateSenateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateModelImpl.FINDER_CACHE_ENABLED,
			CrmStateSenateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmStateSenateModelImpl.UUID_COLUMN_BITMASK |
			CrmStateSenateModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the CRM State Senates where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM State Senates
	 */
	@Override
	public List<CrmStateSenate> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM State Senates where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM State Senates
	 * @param end the upper bound of the range of CRM State Senates (not inclusive)
	 * @return the range of matching CRM State Senates
	 */
	@Override
	public List<CrmStateSenate> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM State Senates where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM State Senates
	 * @param end the upper bound of the range of CRM State Senates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM State Senates
	 */
	@Override
	public List<CrmStateSenate> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<CrmStateSenate> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM State Senates where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM State Senates
	 * @param end the upper bound of the range of CRM State Senates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM State Senates
	 */
	@Override
	public List<CrmStateSenate> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<CrmStateSenate> orderByComparator,
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

		List<CrmStateSenate> list = null;

		if (retrieveFromCache) {
			list = (List<CrmStateSenate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmStateSenate crmStateSenate : list) {
					if (!Objects.equals(uuid, crmStateSenate.getUuid()) ||
							(companyId != crmStateSenate.getCompanyId())) {
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

			query.append(_SQL_SELECT_CRMSTATESENATE_WHERE);

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
				query.append(CrmStateSenateModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmStateSenate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmStateSenate>)QueryUtil.list(q,
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
	 * Returns the first CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Senate
	 * @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	 */
	@Override
	public CrmStateSenate findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException {
		CrmStateSenate crmStateSenate = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (crmStateSenate != null) {
			return crmStateSenate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmStateSenateException(msg.toString());
	}

	/**
	 * Returns the first CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	 */
	@Override
	public CrmStateSenate fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmStateSenate> orderByComparator) {
		List<CrmStateSenate> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Senate
	 * @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	 */
	@Override
	public CrmStateSenate findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException {
		CrmStateSenate crmStateSenate = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (crmStateSenate != null) {
			return crmStateSenate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmStateSenateException(msg.toString());
	}

	/**
	 * Returns the last CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	 */
	@Override
	public CrmStateSenate fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmStateSenate> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmStateSenate> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM State Senates before and after the current CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmStateSenateId the primary key of the current CRM State Senate
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM State Senate
	 * @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	 */
	@Override
	public CrmStateSenate[] findByUuid_C_PrevAndNext(long crmStateSenateId,
		String uuid, long companyId,
		OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException {
		CrmStateSenate crmStateSenate = findByPrimaryKey(crmStateSenateId);

		Session session = null;

		try {
			session = openSession();

			CrmStateSenate[] array = new CrmStateSenateImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, crmStateSenate, uuid,
					companyId, orderByComparator, true);

			array[1] = crmStateSenate;

			array[2] = getByUuid_C_PrevAndNext(session, crmStateSenate, uuid,
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

	protected CrmStateSenate getByUuid_C_PrevAndNext(Session session,
		CrmStateSenate crmStateSenate, String uuid, long companyId,
		OrderByComparator<CrmStateSenate> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMSTATESENATE_WHERE);

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
			query.append(CrmStateSenateModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmStateSenate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmStateSenate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM State Senates where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmStateSenate crmStateSenate : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmStateSenate);
		}
	}

	/**
	 * Returns the number of CRM State Senates where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM State Senates
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMSTATESENATE_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "crmStateSenate.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "crmStateSenate.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(crmStateSenate.uuid IS NULL OR crmStateSenate.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "crmStateSenate.companyId = ?";

	public CrmStateSenatePersistenceImpl() {
		setModelClass(CrmStateSenate.class);

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
	 * Caches the CRM State Senate in the entity cache if it is enabled.
	 *
	 * @param crmStateSenate the CRM State Senate
	 */
	@Override
	public void cacheResult(CrmStateSenate crmStateSenate) {
		entityCache.putResult(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateImpl.class, crmStateSenate.getPrimaryKey(),
			crmStateSenate);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { crmStateSenate.getUuid(), crmStateSenate.getGroupId() },
			crmStateSenate);

		crmStateSenate.resetOriginalValues();
	}

	/**
	 * Caches the CRM State Senates in the entity cache if it is enabled.
	 *
	 * @param crmStateSenates the CRM State Senates
	 */
	@Override
	public void cacheResult(List<CrmStateSenate> crmStateSenates) {
		for (CrmStateSenate crmStateSenate : crmStateSenates) {
			if (entityCache.getResult(
						CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
						CrmStateSenateImpl.class, crmStateSenate.getPrimaryKey()) == null) {
				cacheResult(crmStateSenate);
			}
			else {
				crmStateSenate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM State Senates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmStateSenateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM State Senate.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmStateSenate crmStateSenate) {
		entityCache.removeResult(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateImpl.class, crmStateSenate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmStateSenateModelImpl)crmStateSenate, true);
	}

	@Override
	public void clearCache(List<CrmStateSenate> crmStateSenates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmStateSenate crmStateSenate : crmStateSenates) {
			entityCache.removeResult(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
				CrmStateSenateImpl.class, crmStateSenate.getPrimaryKey());

			clearUniqueFindersCache((CrmStateSenateModelImpl)crmStateSenate,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		CrmStateSenateModelImpl crmStateSenateModelImpl) {
		Object[] args = new Object[] {
				crmStateSenateModelImpl.getUuid(),
				crmStateSenateModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			crmStateSenateModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmStateSenateModelImpl crmStateSenateModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					crmStateSenateModelImpl.getUuid(),
					crmStateSenateModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((crmStateSenateModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmStateSenateModelImpl.getOriginalUuid(),
					crmStateSenateModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new CRM State Senate with the primary key. Does not add the CRM State Senate to the database.
	 *
	 * @param crmStateSenateId the primary key for the new CRM State Senate
	 * @return the new CRM State Senate
	 */
	@Override
	public CrmStateSenate create(long crmStateSenateId) {
		CrmStateSenate crmStateSenate = new CrmStateSenateImpl();

		crmStateSenate.setNew(true);
		crmStateSenate.setPrimaryKey(crmStateSenateId);

		String uuid = PortalUUIDUtil.generate();

		crmStateSenate.setUuid(uuid);

		crmStateSenate.setCompanyId(companyProvider.getCompanyId());

		return crmStateSenate;
	}

	/**
	 * Removes the CRM State Senate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmStateSenateId the primary key of the CRM State Senate
	 * @return the CRM State Senate that was removed
	 * @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	 */
	@Override
	public CrmStateSenate remove(long crmStateSenateId)
		throws NoSuchCrmStateSenateException {
		return remove((Serializable)crmStateSenateId);
	}

	/**
	 * Removes the CRM State Senate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM State Senate
	 * @return the CRM State Senate that was removed
	 * @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	 */
	@Override
	public CrmStateSenate remove(Serializable primaryKey)
		throws NoSuchCrmStateSenateException {
		Session session = null;

		try {
			session = openSession();

			CrmStateSenate crmStateSenate = (CrmStateSenate)session.get(CrmStateSenateImpl.class,
					primaryKey);

			if (crmStateSenate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmStateSenateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmStateSenate);
		}
		catch (NoSuchCrmStateSenateException nsee) {
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
	protected CrmStateSenate removeImpl(CrmStateSenate crmStateSenate) {
		crmStateSenate = toUnwrappedModel(crmStateSenate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmStateSenate)) {
				crmStateSenate = (CrmStateSenate)session.get(CrmStateSenateImpl.class,
						crmStateSenate.getPrimaryKeyObj());
			}

			if (crmStateSenate != null) {
				session.delete(crmStateSenate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmStateSenate != null) {
			clearCache(crmStateSenate);
		}

		return crmStateSenate;
	}

	@Override
	public CrmStateSenate updateImpl(CrmStateSenate crmStateSenate) {
		crmStateSenate = toUnwrappedModel(crmStateSenate);

		boolean isNew = crmStateSenate.isNew();

		CrmStateSenateModelImpl crmStateSenateModelImpl = (CrmStateSenateModelImpl)crmStateSenate;

		if (Validator.isNull(crmStateSenate.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmStateSenate.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmStateSenate.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmStateSenate.setCreateDate(now);
			}
			else {
				crmStateSenate.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmStateSenateModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmStateSenate.setModifiedDate(now);
			}
			else {
				crmStateSenate.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmStateSenate.isNew()) {
				session.save(crmStateSenate);

				crmStateSenate.setNew(false);
			}
			else {
				crmStateSenate = (CrmStateSenate)session.merge(crmStateSenate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmStateSenateModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { crmStateSenateModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					crmStateSenateModelImpl.getUuid(),
					crmStateSenateModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((crmStateSenateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmStateSenateModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { crmStateSenateModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((crmStateSenateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmStateSenateModelImpl.getOriginalUuid(),
						crmStateSenateModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						crmStateSenateModelImpl.getUuid(),
						crmStateSenateModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
			CrmStateSenateImpl.class, crmStateSenate.getPrimaryKey(),
			crmStateSenate, false);

		clearUniqueFindersCache(crmStateSenateModelImpl, false);
		cacheUniqueFindersCache(crmStateSenateModelImpl);

		crmStateSenate.resetOriginalValues();

		return crmStateSenate;
	}

	protected CrmStateSenate toUnwrappedModel(CrmStateSenate crmStateSenate) {
		if (crmStateSenate instanceof CrmStateSenateImpl) {
			return crmStateSenate;
		}

		CrmStateSenateImpl crmStateSenateImpl = new CrmStateSenateImpl();

		crmStateSenateImpl.setNew(crmStateSenate.isNew());
		crmStateSenateImpl.setPrimaryKey(crmStateSenate.getPrimaryKey());

		crmStateSenateImpl.setUuid(crmStateSenate.getUuid());
		crmStateSenateImpl.setCrmStateSenateId(crmStateSenate.getCrmStateSenateId());
		crmStateSenateImpl.setGroupId(crmStateSenate.getGroupId());
		crmStateSenateImpl.setCompanyId(crmStateSenate.getCompanyId());
		crmStateSenateImpl.setUserId(crmStateSenate.getUserId());
		crmStateSenateImpl.setUserName(crmStateSenate.getUserName());
		crmStateSenateImpl.setCreateDate(crmStateSenate.getCreateDate());
		crmStateSenateImpl.setModifiedDate(crmStateSenate.getModifiedDate());

		return crmStateSenateImpl;
	}

	/**
	 * Returns the CRM State Senate with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM State Senate
	 * @return the CRM State Senate
	 * @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	 */
	@Override
	public CrmStateSenate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmStateSenateException {
		CrmStateSenate crmStateSenate = fetchByPrimaryKey(primaryKey);

		if (crmStateSenate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmStateSenateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmStateSenate;
	}

	/**
	 * Returns the CRM State Senate with the primary key or throws a {@link NoSuchCrmStateSenateException} if it could not be found.
	 *
	 * @param crmStateSenateId the primary key of the CRM State Senate
	 * @return the CRM State Senate
	 * @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	 */
	@Override
	public CrmStateSenate findByPrimaryKey(long crmStateSenateId)
		throws NoSuchCrmStateSenateException {
		return findByPrimaryKey((Serializable)crmStateSenateId);
	}

	/**
	 * Returns the CRM State Senate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM State Senate
	 * @return the CRM State Senate, or <code>null</code> if a CRM State Senate with the primary key could not be found
	 */
	@Override
	public CrmStateSenate fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
				CrmStateSenateImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmStateSenate crmStateSenate = (CrmStateSenate)serializable;

		if (crmStateSenate == null) {
			Session session = null;

			try {
				session = openSession();

				crmStateSenate = (CrmStateSenate)session.get(CrmStateSenateImpl.class,
						primaryKey);

				if (crmStateSenate != null) {
					cacheResult(crmStateSenate);
				}
				else {
					entityCache.putResult(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
						CrmStateSenateImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
					CrmStateSenateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmStateSenate;
	}

	/**
	 * Returns the CRM State Senate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmStateSenateId the primary key of the CRM State Senate
	 * @return the CRM State Senate, or <code>null</code> if a CRM State Senate with the primary key could not be found
	 */
	@Override
	public CrmStateSenate fetchByPrimaryKey(long crmStateSenateId) {
		return fetchByPrimaryKey((Serializable)crmStateSenateId);
	}

	@Override
	public Map<Serializable, CrmStateSenate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmStateSenate> map = new HashMap<Serializable, CrmStateSenate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmStateSenate crmStateSenate = fetchByPrimaryKey(primaryKey);

			if (crmStateSenate != null) {
				map.put(primaryKey, crmStateSenate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
					CrmStateSenateImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmStateSenate)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMSTATESENATE_WHERE_PKS_IN);

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

			for (CrmStateSenate crmStateSenate : (List<CrmStateSenate>)q.list()) {
				map.put(crmStateSenate.getPrimaryKeyObj(), crmStateSenate);

				cacheResult(crmStateSenate);

				uncachedPrimaryKeys.remove(crmStateSenate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmStateSenateModelImpl.ENTITY_CACHE_ENABLED,
					CrmStateSenateImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM State Senates.
	 *
	 * @return the CRM State Senates
	 */
	@Override
	public List<CrmStateSenate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM State Senates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM State Senates
	 * @param end the upper bound of the range of CRM State Senates (not inclusive)
	 * @return the range of CRM State Senates
	 */
	@Override
	public List<CrmStateSenate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM State Senates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM State Senates
	 * @param end the upper bound of the range of CRM State Senates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM State Senates
	 */
	@Override
	public List<CrmStateSenate> findAll(int start, int end,
		OrderByComparator<CrmStateSenate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM State Senates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM State Senates
	 * @param end the upper bound of the range of CRM State Senates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM State Senates
	 */
	@Override
	public List<CrmStateSenate> findAll(int start, int end,
		OrderByComparator<CrmStateSenate> orderByComparator,
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

		List<CrmStateSenate> list = null;

		if (retrieveFromCache) {
			list = (List<CrmStateSenate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMSTATESENATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMSTATESENATE;

				if (pagination) {
					sql = sql.concat(CrmStateSenateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmStateSenate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmStateSenate>)QueryUtil.list(q,
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
	 * Removes all the CRM State Senates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmStateSenate crmStateSenate : findAll()) {
			remove(crmStateSenate);
		}
	}

	/**
	 * Returns the number of CRM State Senates.
	 *
	 * @return the number of CRM State Senates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMSTATESENATE);

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
		return CrmStateSenateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM State Senate persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CrmStateSenateImpl.class.getName());
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
	private static final String _SQL_SELECT_CRMSTATESENATE = "SELECT crmStateSenate FROM CrmStateSenate crmStateSenate";
	private static final String _SQL_SELECT_CRMSTATESENATE_WHERE_PKS_IN = "SELECT crmStateSenate FROM CrmStateSenate crmStateSenate WHERE crmStateSenateId IN (";
	private static final String _SQL_SELECT_CRMSTATESENATE_WHERE = "SELECT crmStateSenate FROM CrmStateSenate crmStateSenate WHERE ";
	private static final String _SQL_COUNT_CRMSTATESENATE = "SELECT COUNT(crmStateSenate) FROM CrmStateSenate crmStateSenate";
	private static final String _SQL_COUNT_CRMSTATESENATE_WHERE = "SELECT COUNT(crmStateSenate) FROM CrmStateSenate crmStateSenate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmStateSenate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmStateSenate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CrmStateSenate exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CrmStateSenatePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}