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

import contact.manager.exception.NoSuchCrmMuniException;

import contact.manager.model.CrmMuni;
import contact.manager.model.impl.CrmMuniImpl;
import contact.manager.model.impl.CrmMuniModelImpl;

import contact.manager.service.persistence.CrmMuniPersistence;

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
 * The persistence implementation for the CRM Muni service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmMuniPersistence
 * @see contact.manager.service.persistence.CrmMuniUtil
 * @generated
 */
@ProviderType
public class CrmMuniPersistenceImpl extends BasePersistenceImpl<CrmMuni>
	implements CrmMuniPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmMuniUtil} to access the CRM Muni persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmMuniImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, CrmMuniImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, CrmMuniImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, CrmMuniImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, CrmMuniImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CrmMuniModelImpl.UUID_COLUMN_BITMASK |
			CrmMuniModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM Munis where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Munis
	 */
	@Override
	public List<CrmMuni> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Munis where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Munis
	 * @param end the upper bound of the range of CRM Munis (not inclusive)
	 * @return the range of matching CRM Munis
	 */
	@Override
	public List<CrmMuni> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Munis where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Munis
	 * @param end the upper bound of the range of CRM Munis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Munis
	 */
	@Override
	public List<CrmMuni> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmMuni> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Munis where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Munis
	 * @param end the upper bound of the range of CRM Munis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Munis
	 */
	@Override
	public List<CrmMuni> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmMuni> orderByComparator, boolean retrieveFromCache) {
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

		List<CrmMuni> list = null;

		if (retrieveFromCache) {
			list = (List<CrmMuni>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmMuni crmMuni : list) {
					if (!Objects.equals(uuid, crmMuni.getUuid())) {
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

			query.append(_SQL_SELECT_CRMMUNI_WHERE);

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
				query.append(CrmMuniModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmMuni>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmMuni>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM Muni in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Muni
	 * @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni findByUuid_First(String uuid,
		OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException {
		CrmMuni crmMuni = fetchByUuid_First(uuid, orderByComparator);

		if (crmMuni != null) {
			return crmMuni;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmMuniException(msg.toString());
	}

	/**
	 * Returns the first CRM Muni in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni fetchByUuid_First(String uuid,
		OrderByComparator<CrmMuni> orderByComparator) {
		List<CrmMuni> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Muni in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Muni
	 * @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni findByUuid_Last(String uuid,
		OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException {
		CrmMuni crmMuni = fetchByUuid_Last(uuid, orderByComparator);

		if (crmMuni != null) {
			return crmMuni;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmMuniException(msg.toString());
	}

	/**
	 * Returns the last CRM Muni in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni fetchByUuid_Last(String uuid,
		OrderByComparator<CrmMuni> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmMuni> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Munis before and after the current CRM Muni in the ordered set where uuid = &#63;.
	 *
	 * @param crmMuniId the primary key of the current CRM Muni
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Muni
	 * @throws NoSuchCrmMuniException if a CRM Muni with the primary key could not be found
	 */
	@Override
	public CrmMuni[] findByUuid_PrevAndNext(long crmMuniId, String uuid,
		OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException {
		CrmMuni crmMuni = findByPrimaryKey(crmMuniId);

		Session session = null;

		try {
			session = openSession();

			CrmMuni[] array = new CrmMuniImpl[3];

			array[0] = getByUuid_PrevAndNext(session, crmMuni, uuid,
					orderByComparator, true);

			array[1] = crmMuni;

			array[2] = getByUuid_PrevAndNext(session, crmMuni, uuid,
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

	protected CrmMuni getByUuid_PrevAndNext(Session session, CrmMuni crmMuni,
		String uuid, OrderByComparator<CrmMuni> orderByComparator,
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

		query.append(_SQL_SELECT_CRMMUNI_WHERE);

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
			query.append(CrmMuniModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmMuni);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmMuni> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Munis where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmMuni crmMuni : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmMuni);
		}
	}

	/**
	 * Returns the number of CRM Munis where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Munis
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMMUNI_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "crmMuni.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmMuni.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(crmMuni.uuid IS NULL OR crmMuni.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, CrmMuniImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmMuniModelImpl.UUID_COLUMN_BITMASK |
			CrmMuniModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the CRM Muni where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmMuniException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Muni
	 * @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmMuniException {
		CrmMuni crmMuni = fetchByUUID_G(uuid, groupId);

		if (crmMuni == null) {
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

			throw new NoSuchCrmMuniException(msg.toString());
		}

		return crmMuni;
	}

	/**
	 * Returns the CRM Muni where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the CRM Muni where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CrmMuni) {
			CrmMuni crmMuni = (CrmMuni)result;

			if (!Objects.equals(uuid, crmMuni.getUuid()) ||
					(groupId != crmMuni.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMMUNI_WHERE);

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

				List<CrmMuni> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CrmMuni crmMuni = list.get(0);

					result = crmMuni;

					cacheResult(crmMuni);
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
			return (CrmMuni)result;
		}
	}

	/**
	 * Removes the CRM Muni where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Muni that was removed
	 */
	@Override
	public CrmMuni removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmMuniException {
		CrmMuni crmMuni = findByUUID_G(uuid, groupId);

		return remove(crmMuni);
	}

	/**
	 * Returns the number of CRM Munis where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Munis
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMMUNI_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "crmMuni.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "crmMuni.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(crmMuni.uuid IS NULL OR crmMuni.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "crmMuni.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, CrmMuniImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, CrmMuniImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmMuniModelImpl.UUID_COLUMN_BITMASK |
			CrmMuniModelImpl.COMPANYID_COLUMN_BITMASK |
			CrmMuniModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the CRM Munis where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Munis
	 */
	@Override
	public List<CrmMuni> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Munis where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Munis
	 * @param end the upper bound of the range of CRM Munis (not inclusive)
	 * @return the range of matching CRM Munis
	 */
	@Override
	public List<CrmMuni> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Munis where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Munis
	 * @param end the upper bound of the range of CRM Munis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Munis
	 */
	@Override
	public List<CrmMuni> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<CrmMuni> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Munis where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Munis
	 * @param end the upper bound of the range of CRM Munis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Munis
	 */
	@Override
	public List<CrmMuni> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<CrmMuni> orderByComparator,
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

		List<CrmMuni> list = null;

		if (retrieveFromCache) {
			list = (List<CrmMuni>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmMuni crmMuni : list) {
					if (!Objects.equals(uuid, crmMuni.getUuid()) ||
							(companyId != crmMuni.getCompanyId())) {
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

			query.append(_SQL_SELECT_CRMMUNI_WHERE);

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
				query.append(CrmMuniModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmMuni>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmMuni>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM Muni in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Muni
	 * @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException {
		CrmMuni crmMuni = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (crmMuni != null) {
			return crmMuni;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmMuniException(msg.toString());
	}

	/**
	 * Returns the first CRM Muni in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmMuni> orderByComparator) {
		List<CrmMuni> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Muni in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Muni
	 * @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException {
		CrmMuni crmMuni = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (crmMuni != null) {
			return crmMuni;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmMuniException(msg.toString());
	}

	/**
	 * Returns the last CRM Muni in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmMuni> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmMuni> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Munis before and after the current CRM Muni in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmMuniId the primary key of the current CRM Muni
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Muni
	 * @throws NoSuchCrmMuniException if a CRM Muni with the primary key could not be found
	 */
	@Override
	public CrmMuni[] findByUuid_C_PrevAndNext(long crmMuniId, String uuid,
		long companyId, OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException {
		CrmMuni crmMuni = findByPrimaryKey(crmMuniId);

		Session session = null;

		try {
			session = openSession();

			CrmMuni[] array = new CrmMuniImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, crmMuni, uuid,
					companyId, orderByComparator, true);

			array[1] = crmMuni;

			array[2] = getByUuid_C_PrevAndNext(session, crmMuni, uuid,
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

	protected CrmMuni getByUuid_C_PrevAndNext(Session session, CrmMuni crmMuni,
		String uuid, long companyId,
		OrderByComparator<CrmMuni> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMMUNI_WHERE);

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
			query.append(CrmMuniModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmMuni);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmMuni> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Munis where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmMuni crmMuni : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmMuni);
		}
	}

	/**
	 * Returns the number of CRM Munis where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Munis
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMMUNI_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "crmMuni.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "crmMuni.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(crmMuni.uuid IS NULL OR crmMuni.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "crmMuni.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ZIPCODE = new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, CrmMuniImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByZipCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE =
		new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, CrmMuniImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByZipCode",
			new String[] { String.class.getName() },
			CrmMuniModelImpl.ZIPCODE_COLUMN_BITMASK |
			CrmMuniModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ZIPCODE = new FinderPath(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByZipCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM Munis where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching CRM Munis
	 */
	@Override
	public List<CrmMuni> findByZipCode(String zipCode) {
		return findByZipCode(zipCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Munis where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM Munis
	 * @param end the upper bound of the range of CRM Munis (not inclusive)
	 * @return the range of matching CRM Munis
	 */
	@Override
	public List<CrmMuni> findByZipCode(String zipCode, int start, int end) {
		return findByZipCode(zipCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Munis where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM Munis
	 * @param end the upper bound of the range of CRM Munis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Munis
	 */
	@Override
	public List<CrmMuni> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<CrmMuni> orderByComparator) {
		return findByZipCode(zipCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Munis where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM Munis
	 * @param end the upper bound of the range of CRM Munis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Munis
	 */
	@Override
	public List<CrmMuni> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<CrmMuni> orderByComparator, boolean retrieveFromCache) {
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

		List<CrmMuni> list = null;

		if (retrieveFromCache) {
			list = (List<CrmMuni>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmMuni crmMuni : list) {
					if (!Objects.equals(zipCode, crmMuni.getZipCode())) {
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

			query.append(_SQL_SELECT_CRMMUNI_WHERE);

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
				query.append(CrmMuniModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmMuni>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmMuni>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM Muni in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Muni
	 * @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni findByZipCode_First(String zipCode,
		OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException {
		CrmMuni crmMuni = fetchByZipCode_First(zipCode, orderByComparator);

		if (crmMuni != null) {
			return crmMuni;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append("}");

		throw new NoSuchCrmMuniException(msg.toString());
	}

	/**
	 * Returns the first CRM Muni in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni fetchByZipCode_First(String zipCode,
		OrderByComparator<CrmMuni> orderByComparator) {
		List<CrmMuni> list = findByZipCode(zipCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Muni in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Muni
	 * @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni findByZipCode_Last(String zipCode,
		OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException {
		CrmMuni crmMuni = fetchByZipCode_Last(zipCode, orderByComparator);

		if (crmMuni != null) {
			return crmMuni;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append("}");

		throw new NoSuchCrmMuniException(msg.toString());
	}

	/**
	 * Returns the last CRM Muni in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	 */
	@Override
	public CrmMuni fetchByZipCode_Last(String zipCode,
		OrderByComparator<CrmMuni> orderByComparator) {
		int count = countByZipCode(zipCode);

		if (count == 0) {
			return null;
		}

		List<CrmMuni> list = findByZipCode(zipCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Munis before and after the current CRM Muni in the ordered set where zipCode = &#63;.
	 *
	 * @param crmMuniId the primary key of the current CRM Muni
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Muni
	 * @throws NoSuchCrmMuniException if a CRM Muni with the primary key could not be found
	 */
	@Override
	public CrmMuni[] findByZipCode_PrevAndNext(long crmMuniId, String zipCode,
		OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException {
		CrmMuni crmMuni = findByPrimaryKey(crmMuniId);

		Session session = null;

		try {
			session = openSession();

			CrmMuni[] array = new CrmMuniImpl[3];

			array[0] = getByZipCode_PrevAndNext(session, crmMuni, zipCode,
					orderByComparator, true);

			array[1] = crmMuni;

			array[2] = getByZipCode_PrevAndNext(session, crmMuni, zipCode,
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

	protected CrmMuni getByZipCode_PrevAndNext(Session session,
		CrmMuni crmMuni, String zipCode,
		OrderByComparator<CrmMuni> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMMUNI_WHERE);

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
			query.append(CrmMuniModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmMuni);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmMuni> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Munis where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	@Override
	public void removeByZipCode(String zipCode) {
		for (CrmMuni crmMuni : findByZipCode(zipCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmMuni);
		}
	}

	/**
	 * Returns the number of CRM Munis where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching CRM Munis
	 */
	@Override
	public int countByZipCode(String zipCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ZIPCODE;

		Object[] finderArgs = new Object[] { zipCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMMUNI_WHERE);

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

	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_1 = "crmMuni.zipCode IS NULL";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_2 = "crmMuni.zipCode = ?";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_3 = "(crmMuni.zipCode IS NULL OR crmMuni.zipCode = '')";

	public CrmMuniPersistenceImpl() {
		setModelClass(CrmMuni.class);

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
	 * Caches the CRM Muni in the entity cache if it is enabled.
	 *
	 * @param crmMuni the CRM Muni
	 */
	@Override
	public void cacheResult(CrmMuni crmMuni) {
		entityCache.putResult(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniImpl.class, crmMuni.getPrimaryKey(), crmMuni);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { crmMuni.getUuid(), crmMuni.getGroupId() }, crmMuni);

		crmMuni.resetOriginalValues();
	}

	/**
	 * Caches the CRM Munis in the entity cache if it is enabled.
	 *
	 * @param crmMunis the CRM Munis
	 */
	@Override
	public void cacheResult(List<CrmMuni> crmMunis) {
		for (CrmMuni crmMuni : crmMunis) {
			if (entityCache.getResult(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
						CrmMuniImpl.class, crmMuni.getPrimaryKey()) == null) {
				cacheResult(crmMuni);
			}
			else {
				crmMuni.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM Munis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmMuniImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM Muni.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmMuni crmMuni) {
		entityCache.removeResult(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniImpl.class, crmMuni.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmMuniModelImpl)crmMuni, true);
	}

	@Override
	public void clearCache(List<CrmMuni> crmMunis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmMuni crmMuni : crmMunis) {
			entityCache.removeResult(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
				CrmMuniImpl.class, crmMuni.getPrimaryKey());

			clearUniqueFindersCache((CrmMuniModelImpl)crmMuni, true);
		}
	}

	protected void cacheUniqueFindersCache(CrmMuniModelImpl crmMuniModelImpl) {
		Object[] args = new Object[] {
				crmMuniModelImpl.getUuid(), crmMuniModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			crmMuniModelImpl, false);
	}

	protected void clearUniqueFindersCache(CrmMuniModelImpl crmMuniModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					crmMuniModelImpl.getUuid(), crmMuniModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((crmMuniModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmMuniModelImpl.getOriginalUuid(),
					crmMuniModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new CRM Muni with the primary key. Does not add the CRM Muni to the database.
	 *
	 * @param crmMuniId the primary key for the new CRM Muni
	 * @return the new CRM Muni
	 */
	@Override
	public CrmMuni create(long crmMuniId) {
		CrmMuni crmMuni = new CrmMuniImpl();

		crmMuni.setNew(true);
		crmMuni.setPrimaryKey(crmMuniId);

		String uuid = PortalUUIDUtil.generate();

		crmMuni.setUuid(uuid);

		crmMuni.setCompanyId(companyProvider.getCompanyId());

		return crmMuni;
	}

	/**
	 * Removes the CRM Muni with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmMuniId the primary key of the CRM Muni
	 * @return the CRM Muni that was removed
	 * @throws NoSuchCrmMuniException if a CRM Muni with the primary key could not be found
	 */
	@Override
	public CrmMuni remove(long crmMuniId) throws NoSuchCrmMuniException {
		return remove((Serializable)crmMuniId);
	}

	/**
	 * Removes the CRM Muni with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM Muni
	 * @return the CRM Muni that was removed
	 * @throws NoSuchCrmMuniException if a CRM Muni with the primary key could not be found
	 */
	@Override
	public CrmMuni remove(Serializable primaryKey)
		throws NoSuchCrmMuniException {
		Session session = null;

		try {
			session = openSession();

			CrmMuni crmMuni = (CrmMuni)session.get(CrmMuniImpl.class, primaryKey);

			if (crmMuni == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmMuniException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmMuni);
		}
		catch (NoSuchCrmMuniException nsee) {
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
	protected CrmMuni removeImpl(CrmMuni crmMuni) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmMuni)) {
				crmMuni = (CrmMuni)session.get(CrmMuniImpl.class,
						crmMuni.getPrimaryKeyObj());
			}

			if (crmMuni != null) {
				session.delete(crmMuni);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmMuni != null) {
			clearCache(crmMuni);
		}

		return crmMuni;
	}

	@Override
	public CrmMuni updateImpl(CrmMuni crmMuni) {
		boolean isNew = crmMuni.isNew();

		if (!(crmMuni instanceof CrmMuniModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(crmMuni.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(crmMuni);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in crmMuni proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CrmMuni implementation " +
				crmMuni.getClass());
		}

		CrmMuniModelImpl crmMuniModelImpl = (CrmMuniModelImpl)crmMuni;

		if (Validator.isNull(crmMuni.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmMuni.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmMuni.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmMuni.setCreateDate(now);
			}
			else {
				crmMuni.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmMuniModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmMuni.setModifiedDate(now);
			}
			else {
				crmMuni.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmMuni.isNew()) {
				session.save(crmMuni);

				crmMuni.setNew(false);
			}
			else {
				crmMuni = (CrmMuni)session.merge(crmMuni);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmMuniModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { crmMuniModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					crmMuniModelImpl.getUuid(), crmMuniModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { crmMuniModelImpl.getZipCode() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((crmMuniModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { crmMuniModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { crmMuniModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((crmMuniModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmMuniModelImpl.getOriginalUuid(),
						crmMuniModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						crmMuniModelImpl.getUuid(),
						crmMuniModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((crmMuniModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmMuniModelImpl.getOriginalZipCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);

				args = new Object[] { crmMuniModelImpl.getZipCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);
			}
		}

		entityCache.putResult(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
			CrmMuniImpl.class, crmMuni.getPrimaryKey(), crmMuni, false);

		clearUniqueFindersCache(crmMuniModelImpl, false);
		cacheUniqueFindersCache(crmMuniModelImpl);

		crmMuni.resetOriginalValues();

		return crmMuni;
	}

	/**
	 * Returns the CRM Muni with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Muni
	 * @return the CRM Muni
	 * @throws NoSuchCrmMuniException if a CRM Muni with the primary key could not be found
	 */
	@Override
	public CrmMuni findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmMuniException {
		CrmMuni crmMuni = fetchByPrimaryKey(primaryKey);

		if (crmMuni == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmMuniException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmMuni;
	}

	/**
	 * Returns the CRM Muni with the primary key or throws a {@link NoSuchCrmMuniException} if it could not be found.
	 *
	 * @param crmMuniId the primary key of the CRM Muni
	 * @return the CRM Muni
	 * @throws NoSuchCrmMuniException if a CRM Muni with the primary key could not be found
	 */
	@Override
	public CrmMuni findByPrimaryKey(long crmMuniId)
		throws NoSuchCrmMuniException {
		return findByPrimaryKey((Serializable)crmMuniId);
	}

	/**
	 * Returns the CRM Muni with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Muni
	 * @return the CRM Muni, or <code>null</code> if a CRM Muni with the primary key could not be found
	 */
	@Override
	public CrmMuni fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
				CrmMuniImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmMuni crmMuni = (CrmMuni)serializable;

		if (crmMuni == null) {
			Session session = null;

			try {
				session = openSession();

				crmMuni = (CrmMuni)session.get(CrmMuniImpl.class, primaryKey);

				if (crmMuni != null) {
					cacheResult(crmMuni);
				}
				else {
					entityCache.putResult(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
						CrmMuniImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
					CrmMuniImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmMuni;
	}

	/**
	 * Returns the CRM Muni with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmMuniId the primary key of the CRM Muni
	 * @return the CRM Muni, or <code>null</code> if a CRM Muni with the primary key could not be found
	 */
	@Override
	public CrmMuni fetchByPrimaryKey(long crmMuniId) {
		return fetchByPrimaryKey((Serializable)crmMuniId);
	}

	@Override
	public Map<Serializable, CrmMuni> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmMuni> map = new HashMap<Serializable, CrmMuni>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmMuni crmMuni = fetchByPrimaryKey(primaryKey);

			if (crmMuni != null) {
				map.put(primaryKey, crmMuni);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
					CrmMuniImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmMuni)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMMUNI_WHERE_PKS_IN);

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

			for (CrmMuni crmMuni : (List<CrmMuni>)q.list()) {
				map.put(crmMuni.getPrimaryKeyObj(), crmMuni);

				cacheResult(crmMuni);

				uncachedPrimaryKeys.remove(crmMuni.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmMuniModelImpl.ENTITY_CACHE_ENABLED,
					CrmMuniImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM Munis.
	 *
	 * @return the CRM Munis
	 */
	@Override
	public List<CrmMuni> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Munis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Munis
	 * @param end the upper bound of the range of CRM Munis (not inclusive)
	 * @return the range of CRM Munis
	 */
	@Override
	public List<CrmMuni> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Munis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Munis
	 * @param end the upper bound of the range of CRM Munis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Munis
	 */
	@Override
	public List<CrmMuni> findAll(int start, int end,
		OrderByComparator<CrmMuni> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Munis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Munis
	 * @param end the upper bound of the range of CRM Munis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM Munis
	 */
	@Override
	public List<CrmMuni> findAll(int start, int end,
		OrderByComparator<CrmMuni> orderByComparator, boolean retrieveFromCache) {
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

		List<CrmMuni> list = null;

		if (retrieveFromCache) {
			list = (List<CrmMuni>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMMUNI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMMUNI;

				if (pagination) {
					sql = sql.concat(CrmMuniModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmMuni>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmMuni>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the CRM Munis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmMuni crmMuni : findAll()) {
			remove(crmMuni);
		}
	}

	/**
	 * Returns the number of CRM Munis.
	 *
	 * @return the number of CRM Munis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMMUNI);

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
		return CrmMuniModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM Muni persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CrmMuniImpl.class.getName());
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
	private static final String _SQL_SELECT_CRMMUNI = "SELECT crmMuni FROM CrmMuni crmMuni";
	private static final String _SQL_SELECT_CRMMUNI_WHERE_PKS_IN = "SELECT crmMuni FROM CrmMuni crmMuni WHERE crmMuniId IN (";
	private static final String _SQL_SELECT_CRMMUNI_WHERE = "SELECT crmMuni FROM CrmMuni crmMuni WHERE ";
	private static final String _SQL_COUNT_CRMMUNI = "SELECT COUNT(crmMuni) FROM CrmMuni crmMuni";
	private static final String _SQL_COUNT_CRMMUNI_WHERE = "SELECT COUNT(crmMuni) FROM CrmMuni crmMuni WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmMuni.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmMuni exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CrmMuni exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CrmMuniPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}