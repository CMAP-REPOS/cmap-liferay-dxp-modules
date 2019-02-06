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

import contact.manager.exception.NoSuchCrmCCAException;

import contact.manager.model.CrmCCA;
import contact.manager.model.impl.CrmCCAImpl;
import contact.manager.model.impl.CrmCCAModelImpl;

import contact.manager.service.persistence.CrmCCAPersistence;

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
 * The persistence implementation for the CRM CCA service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmCCAPersistence
 * @see contact.manager.service.persistence.CrmCCAUtil
 * @generated
 */
@ProviderType
public class CrmCCAPersistenceImpl extends BasePersistenceImpl<CrmCCA>
	implements CrmCCAPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmCCAUtil} to access the CRM CCA persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmCCAImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, CrmCCAImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, CrmCCAImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, CrmCCAImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, CrmCCAImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CrmCCAModelImpl.UUID_COLUMN_BITMASK |
			CrmCCAModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM CCAs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM CCAs
	 */
	@Override
	public List<CrmCCA> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM CCAs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @return the range of matching CRM CCAs
	 */
	@Override
	public List<CrmCCA> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM CCAs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM CCAs
	 */
	@Override
	public List<CrmCCA> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmCCA> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM CCAs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM CCAs
	 */
	@Override
	public List<CrmCCA> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmCCA> orderByComparator, boolean retrieveFromCache) {
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

		List<CrmCCA> list = null;

		if (retrieveFromCache) {
			list = (List<CrmCCA>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmCCA crmCCA : list) {
					if (!Objects.equals(uuid, crmCCA.getUuid())) {
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

			query.append(_SQL_SELECT_CRMCCA_WHERE);

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
				query.append(CrmCCAModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmCCA>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmCCA>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first CRM CCA in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA findByUuid_First(String uuid,
		OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException {
		CrmCCA crmCCA = fetchByUuid_First(uuid, orderByComparator);

		if (crmCCA != null) {
			return crmCCA;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmCCAException(msg.toString());
	}

	/**
	 * Returns the first CRM CCA in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA fetchByUuid_First(String uuid,
		OrderByComparator<CrmCCA> orderByComparator) {
		List<CrmCCA> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM CCA in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA findByUuid_Last(String uuid,
		OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException {
		CrmCCA crmCCA = fetchByUuid_Last(uuid, orderByComparator);

		if (crmCCA != null) {
			return crmCCA;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmCCAException(msg.toString());
	}

	/**
	 * Returns the last CRM CCA in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA fetchByUuid_Last(String uuid,
		OrderByComparator<CrmCCA> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmCCA> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM CCAs before and after the current CRM CCA in the ordered set where uuid = &#63;.
	 *
	 * @param crmCCAId the primary key of the current CRM CCA
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM CCA
	 * @throws NoSuchCrmCCAException if a CRM CCA with the primary key could not be found
	 */
	@Override
	public CrmCCA[] findByUuid_PrevAndNext(long crmCCAId, String uuid,
		OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException {
		CrmCCA crmCCA = findByPrimaryKey(crmCCAId);

		Session session = null;

		try {
			session = openSession();

			CrmCCA[] array = new CrmCCAImpl[3];

			array[0] = getByUuid_PrevAndNext(session, crmCCA, uuid,
					orderByComparator, true);

			array[1] = crmCCA;

			array[2] = getByUuid_PrevAndNext(session, crmCCA, uuid,
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

	protected CrmCCA getByUuid_PrevAndNext(Session session, CrmCCA crmCCA,
		String uuid, OrderByComparator<CrmCCA> orderByComparator,
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

		query.append(_SQL_SELECT_CRMCCA_WHERE);

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
			query.append(CrmCCAModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmCCA);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmCCA> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM CCAs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmCCA crmCCA : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmCCA);
		}
	}

	/**
	 * Returns the number of CRM CCAs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM CCAs
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCCA_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "crmCCA.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmCCA.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(crmCCA.uuid IS NULL OR crmCCA.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, CrmCCAImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmCCAModelImpl.UUID_COLUMN_BITMASK |
			CrmCCAModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the CRM CCA where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmCCAException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmCCAException {
		CrmCCA crmCCA = fetchByUUID_G(uuid, groupId);

		if (crmCCA == null) {
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

			throw new NoSuchCrmCCAException(msg.toString());
		}

		return crmCCA;
	}

	/**
	 * Returns the CRM CCA where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the CRM CCA where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CrmCCA) {
			CrmCCA crmCCA = (CrmCCA)result;

			if (!Objects.equals(uuid, crmCCA.getUuid()) ||
					(groupId != crmCCA.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMCCA_WHERE);

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

				List<CrmCCA> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CrmCCA crmCCA = list.get(0);

					result = crmCCA;

					cacheResult(crmCCA);
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
			return (CrmCCA)result;
		}
	}

	/**
	 * Removes the CRM CCA where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM CCA that was removed
	 */
	@Override
	public CrmCCA removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmCCAException {
		CrmCCA crmCCA = findByUUID_G(uuid, groupId);

		return remove(crmCCA);
	}

	/**
	 * Returns the number of CRM CCAs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM CCAs
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCCA_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "crmCCA.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "crmCCA.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(crmCCA.uuid IS NULL OR crmCCA.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "crmCCA.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, CrmCCAImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, CrmCCAImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmCCAModelImpl.UUID_COLUMN_BITMASK |
			CrmCCAModelImpl.COMPANYID_COLUMN_BITMASK |
			CrmCCAModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the CRM CCAs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM CCAs
	 */
	@Override
	public List<CrmCCA> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM CCAs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @return the range of matching CRM CCAs
	 */
	@Override
	public List<CrmCCA> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM CCAs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM CCAs
	 */
	@Override
	public List<CrmCCA> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<CrmCCA> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM CCAs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM CCAs
	 */
	@Override
	public List<CrmCCA> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<CrmCCA> orderByComparator,
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

		List<CrmCCA> list = null;

		if (retrieveFromCache) {
			list = (List<CrmCCA>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmCCA crmCCA : list) {
					if (!Objects.equals(uuid, crmCCA.getUuid()) ||
							(companyId != crmCCA.getCompanyId())) {
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

			query.append(_SQL_SELECT_CRMCCA_WHERE);

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
				query.append(CrmCCAModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmCCA>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmCCA>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first CRM CCA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException {
		CrmCCA crmCCA = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (crmCCA != null) {
			return crmCCA;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmCCAException(msg.toString());
	}

	/**
	 * Returns the first CRM CCA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmCCA> orderByComparator) {
		List<CrmCCA> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM CCA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException {
		CrmCCA crmCCA = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (crmCCA != null) {
			return crmCCA;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmCCAException(msg.toString());
	}

	/**
	 * Returns the last CRM CCA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmCCA> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmCCA> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM CCAs before and after the current CRM CCA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmCCAId the primary key of the current CRM CCA
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM CCA
	 * @throws NoSuchCrmCCAException if a CRM CCA with the primary key could not be found
	 */
	@Override
	public CrmCCA[] findByUuid_C_PrevAndNext(long crmCCAId, String uuid,
		long companyId, OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException {
		CrmCCA crmCCA = findByPrimaryKey(crmCCAId);

		Session session = null;

		try {
			session = openSession();

			CrmCCA[] array = new CrmCCAImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, crmCCA, uuid,
					companyId, orderByComparator, true);

			array[1] = crmCCA;

			array[2] = getByUuid_C_PrevAndNext(session, crmCCA, uuid,
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

	protected CrmCCA getByUuid_C_PrevAndNext(Session session, CrmCCA crmCCA,
		String uuid, long companyId,
		OrderByComparator<CrmCCA> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMCCA_WHERE);

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
			query.append(CrmCCAModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmCCA);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmCCA> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM CCAs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmCCA crmCCA : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmCCA);
		}
	}

	/**
	 * Returns the number of CRM CCAs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM CCAs
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCCA_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "crmCCA.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "crmCCA.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(crmCCA.uuid IS NULL OR crmCCA.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "crmCCA.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ZIPCODE = new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, CrmCCAImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByZipCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE =
		new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, CrmCCAImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByZipCode",
			new String[] { String.class.getName() },
			CrmCCAModelImpl.ZIPCODE_COLUMN_BITMASK |
			CrmCCAModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ZIPCODE = new FinderPath(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByZipCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM CCAs where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching CRM CCAs
	 */
	@Override
	public List<CrmCCA> findByZipCode(String zipCode) {
		return findByZipCode(zipCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM CCAs where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @return the range of matching CRM CCAs
	 */
	@Override
	public List<CrmCCA> findByZipCode(String zipCode, int start, int end) {
		return findByZipCode(zipCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM CCAs where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM CCAs
	 */
	@Override
	public List<CrmCCA> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<CrmCCA> orderByComparator) {
		return findByZipCode(zipCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM CCAs where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM CCAs
	 */
	@Override
	public List<CrmCCA> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<CrmCCA> orderByComparator, boolean retrieveFromCache) {
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

		List<CrmCCA> list = null;

		if (retrieveFromCache) {
			list = (List<CrmCCA>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmCCA crmCCA : list) {
					if (!Objects.equals(zipCode, crmCCA.getZipCode())) {
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

			query.append(_SQL_SELECT_CRMCCA_WHERE);

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
				query.append(CrmCCAModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmCCA>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmCCA>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first CRM CCA in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA findByZipCode_First(String zipCode,
		OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException {
		CrmCCA crmCCA = fetchByZipCode_First(zipCode, orderByComparator);

		if (crmCCA != null) {
			return crmCCA;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append("}");

		throw new NoSuchCrmCCAException(msg.toString());
	}

	/**
	 * Returns the first CRM CCA in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA fetchByZipCode_First(String zipCode,
		OrderByComparator<CrmCCA> orderByComparator) {
		List<CrmCCA> list = findByZipCode(zipCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM CCA in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA findByZipCode_Last(String zipCode,
		OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException {
		CrmCCA crmCCA = fetchByZipCode_Last(zipCode, orderByComparator);

		if (crmCCA != null) {
			return crmCCA;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append("}");

		throw new NoSuchCrmCCAException(msg.toString());
	}

	/**
	 * Returns the last CRM CCA in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	@Override
	public CrmCCA fetchByZipCode_Last(String zipCode,
		OrderByComparator<CrmCCA> orderByComparator) {
		int count = countByZipCode(zipCode);

		if (count == 0) {
			return null;
		}

		List<CrmCCA> list = findByZipCode(zipCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM CCAs before and after the current CRM CCA in the ordered set where zipCode = &#63;.
	 *
	 * @param crmCCAId the primary key of the current CRM CCA
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM CCA
	 * @throws NoSuchCrmCCAException if a CRM CCA with the primary key could not be found
	 */
	@Override
	public CrmCCA[] findByZipCode_PrevAndNext(long crmCCAId, String zipCode,
		OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException {
		CrmCCA crmCCA = findByPrimaryKey(crmCCAId);

		Session session = null;

		try {
			session = openSession();

			CrmCCA[] array = new CrmCCAImpl[3];

			array[0] = getByZipCode_PrevAndNext(session, crmCCA, zipCode,
					orderByComparator, true);

			array[1] = crmCCA;

			array[2] = getByZipCode_PrevAndNext(session, crmCCA, zipCode,
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

	protected CrmCCA getByZipCode_PrevAndNext(Session session, CrmCCA crmCCA,
		String zipCode, OrderByComparator<CrmCCA> orderByComparator,
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

		query.append(_SQL_SELECT_CRMCCA_WHERE);

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
			query.append(CrmCCAModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmCCA);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmCCA> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM CCAs where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	@Override
	public void removeByZipCode(String zipCode) {
		for (CrmCCA crmCCA : findByZipCode(zipCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmCCA);
		}
	}

	/**
	 * Returns the number of CRM CCAs where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching CRM CCAs
	 */
	@Override
	public int countByZipCode(String zipCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ZIPCODE;

		Object[] finderArgs = new Object[] { zipCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCCA_WHERE);

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

	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_1 = "crmCCA.zipCode IS NULL";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_2 = "crmCCA.zipCode = ?";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_3 = "(crmCCA.zipCode IS NULL OR crmCCA.zipCode = '')";

	public CrmCCAPersistenceImpl() {
		setModelClass(CrmCCA.class);

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
	 * Caches the CRM CCA in the entity cache if it is enabled.
	 *
	 * @param crmCCA the CRM CCA
	 */
	@Override
	public void cacheResult(CrmCCA crmCCA) {
		entityCache.putResult(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAImpl.class, crmCCA.getPrimaryKey(), crmCCA);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { crmCCA.getUuid(), crmCCA.getGroupId() }, crmCCA);

		crmCCA.resetOriginalValues();
	}

	/**
	 * Caches the CRM CCAs in the entity cache if it is enabled.
	 *
	 * @param crmCCAs the CRM CCAs
	 */
	@Override
	public void cacheResult(List<CrmCCA> crmCCAs) {
		for (CrmCCA crmCCA : crmCCAs) {
			if (entityCache.getResult(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
						CrmCCAImpl.class, crmCCA.getPrimaryKey()) == null) {
				cacheResult(crmCCA);
			}
			else {
				crmCCA.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM CCAs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmCCAImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM CCA.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmCCA crmCCA) {
		entityCache.removeResult(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAImpl.class, crmCCA.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmCCAModelImpl)crmCCA, true);
	}

	@Override
	public void clearCache(List<CrmCCA> crmCCAs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmCCA crmCCA : crmCCAs) {
			entityCache.removeResult(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
				CrmCCAImpl.class, crmCCA.getPrimaryKey());

			clearUniqueFindersCache((CrmCCAModelImpl)crmCCA, true);
		}
	}

	protected void cacheUniqueFindersCache(CrmCCAModelImpl crmCCAModelImpl) {
		Object[] args = new Object[] {
				crmCCAModelImpl.getUuid(), crmCCAModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			crmCCAModelImpl, false);
	}

	protected void clearUniqueFindersCache(CrmCCAModelImpl crmCCAModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					crmCCAModelImpl.getUuid(), crmCCAModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((crmCCAModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmCCAModelImpl.getOriginalUuid(),
					crmCCAModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new CRM CCA with the primary key. Does not add the CRM CCA to the database.
	 *
	 * @param crmCCAId the primary key for the new CRM CCA
	 * @return the new CRM CCA
	 */
	@Override
	public CrmCCA create(long crmCCAId) {
		CrmCCA crmCCA = new CrmCCAImpl();

		crmCCA.setNew(true);
		crmCCA.setPrimaryKey(crmCCAId);

		String uuid = PortalUUIDUtil.generate();

		crmCCA.setUuid(uuid);

		crmCCA.setCompanyId(companyProvider.getCompanyId());

		return crmCCA;
	}

	/**
	 * Removes the CRM CCA with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmCCAId the primary key of the CRM CCA
	 * @return the CRM CCA that was removed
	 * @throws NoSuchCrmCCAException if a CRM CCA with the primary key could not be found
	 */
	@Override
	public CrmCCA remove(long crmCCAId) throws NoSuchCrmCCAException {
		return remove((Serializable)crmCCAId);
	}

	/**
	 * Removes the CRM CCA with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM CCA
	 * @return the CRM CCA that was removed
	 * @throws NoSuchCrmCCAException if a CRM CCA with the primary key could not be found
	 */
	@Override
	public CrmCCA remove(Serializable primaryKey) throws NoSuchCrmCCAException {
		Session session = null;

		try {
			session = openSession();

			CrmCCA crmCCA = (CrmCCA)session.get(CrmCCAImpl.class, primaryKey);

			if (crmCCA == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmCCAException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmCCA);
		}
		catch (NoSuchCrmCCAException nsee) {
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
	protected CrmCCA removeImpl(CrmCCA crmCCA) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmCCA)) {
				crmCCA = (CrmCCA)session.get(CrmCCAImpl.class,
						crmCCA.getPrimaryKeyObj());
			}

			if (crmCCA != null) {
				session.delete(crmCCA);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmCCA != null) {
			clearCache(crmCCA);
		}

		return crmCCA;
	}

	@Override
	public CrmCCA updateImpl(CrmCCA crmCCA) {
		boolean isNew = crmCCA.isNew();

		if (!(crmCCA instanceof CrmCCAModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(crmCCA.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(crmCCA);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in crmCCA proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CrmCCA implementation " +
				crmCCA.getClass());
		}

		CrmCCAModelImpl crmCCAModelImpl = (CrmCCAModelImpl)crmCCA;

		if (Validator.isNull(crmCCA.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmCCA.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmCCA.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmCCA.setCreateDate(now);
			}
			else {
				crmCCA.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmCCAModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmCCA.setModifiedDate(now);
			}
			else {
				crmCCA.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmCCA.isNew()) {
				session.save(crmCCA);

				crmCCA.setNew(false);
			}
			else {
				crmCCA = (CrmCCA)session.merge(crmCCA);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmCCAModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { crmCCAModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					crmCCAModelImpl.getUuid(), crmCCAModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { crmCCAModelImpl.getZipCode() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((crmCCAModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { crmCCAModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { crmCCAModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((crmCCAModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmCCAModelImpl.getOriginalUuid(),
						crmCCAModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						crmCCAModelImpl.getUuid(),
						crmCCAModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((crmCCAModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmCCAModelImpl.getOriginalZipCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);

				args = new Object[] { crmCCAModelImpl.getZipCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);
			}
		}

		entityCache.putResult(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
			CrmCCAImpl.class, crmCCA.getPrimaryKey(), crmCCA, false);

		clearUniqueFindersCache(crmCCAModelImpl, false);
		cacheUniqueFindersCache(crmCCAModelImpl);

		crmCCA.resetOriginalValues();

		return crmCCA;
	}

	/**
	 * Returns the CRM CCA with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM CCA
	 * @return the CRM CCA
	 * @throws NoSuchCrmCCAException if a CRM CCA with the primary key could not be found
	 */
	@Override
	public CrmCCA findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmCCAException {
		CrmCCA crmCCA = fetchByPrimaryKey(primaryKey);

		if (crmCCA == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmCCAException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmCCA;
	}

	/**
	 * Returns the CRM CCA with the primary key or throws a {@link NoSuchCrmCCAException} if it could not be found.
	 *
	 * @param crmCCAId the primary key of the CRM CCA
	 * @return the CRM CCA
	 * @throws NoSuchCrmCCAException if a CRM CCA with the primary key could not be found
	 */
	@Override
	public CrmCCA findByPrimaryKey(long crmCCAId) throws NoSuchCrmCCAException {
		return findByPrimaryKey((Serializable)crmCCAId);
	}

	/**
	 * Returns the CRM CCA with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM CCA
	 * @return the CRM CCA, or <code>null</code> if a CRM CCA with the primary key could not be found
	 */
	@Override
	public CrmCCA fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
				CrmCCAImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmCCA crmCCA = (CrmCCA)serializable;

		if (crmCCA == null) {
			Session session = null;

			try {
				session = openSession();

				crmCCA = (CrmCCA)session.get(CrmCCAImpl.class, primaryKey);

				if (crmCCA != null) {
					cacheResult(crmCCA);
				}
				else {
					entityCache.putResult(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
						CrmCCAImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
					CrmCCAImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmCCA;
	}

	/**
	 * Returns the CRM CCA with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmCCAId the primary key of the CRM CCA
	 * @return the CRM CCA, or <code>null</code> if a CRM CCA with the primary key could not be found
	 */
	@Override
	public CrmCCA fetchByPrimaryKey(long crmCCAId) {
		return fetchByPrimaryKey((Serializable)crmCCAId);
	}

	@Override
	public Map<Serializable, CrmCCA> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmCCA> map = new HashMap<Serializable, CrmCCA>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmCCA crmCCA = fetchByPrimaryKey(primaryKey);

			if (crmCCA != null) {
				map.put(primaryKey, crmCCA);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
					CrmCCAImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmCCA)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMCCA_WHERE_PKS_IN);

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

			for (CrmCCA crmCCA : (List<CrmCCA>)q.list()) {
				map.put(crmCCA.getPrimaryKeyObj(), crmCCA);

				cacheResult(crmCCA);

				uncachedPrimaryKeys.remove(crmCCA.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmCCAModelImpl.ENTITY_CACHE_ENABLED,
					CrmCCAImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM CCAs.
	 *
	 * @return the CRM CCAs
	 */
	@Override
	public List<CrmCCA> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM CCAs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @return the range of CRM CCAs
	 */
	@Override
	public List<CrmCCA> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM CCAs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM CCAs
	 */
	@Override
	public List<CrmCCA> findAll(int start, int end,
		OrderByComparator<CrmCCA> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM CCAs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM CCAs
	 */
	@Override
	public List<CrmCCA> findAll(int start, int end,
		OrderByComparator<CrmCCA> orderByComparator, boolean retrieveFromCache) {
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

		List<CrmCCA> list = null;

		if (retrieveFromCache) {
			list = (List<CrmCCA>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMCCA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMCCA;

				if (pagination) {
					sql = sql.concat(CrmCCAModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmCCA>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmCCA>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the CRM CCAs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmCCA crmCCA : findAll()) {
			remove(crmCCA);
		}
	}

	/**
	 * Returns the number of CRM CCAs.
	 *
	 * @return the number of CRM CCAs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMCCA);

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
		return CrmCCAModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM CCA persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CrmCCAImpl.class.getName());
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
	private static final String _SQL_SELECT_CRMCCA = "SELECT crmCCA FROM CrmCCA crmCCA";
	private static final String _SQL_SELECT_CRMCCA_WHERE_PKS_IN = "SELECT crmCCA FROM CrmCCA crmCCA WHERE crmCCAId IN (";
	private static final String _SQL_SELECT_CRMCCA_WHERE = "SELECT crmCCA FROM CrmCCA crmCCA WHERE ";
	private static final String _SQL_COUNT_CRMCCA = "SELECT COUNT(crmCCA) FROM CrmCCA crmCCA";
	private static final String _SQL_COUNT_CRMCCA_WHERE = "SELECT COUNT(crmCCA) FROM CrmCCA crmCCA WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmCCA.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmCCA exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CrmCCA exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CrmCCAPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}