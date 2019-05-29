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

package ucc.portal.service.persistence.impl;

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
import com.liferay.portal.spring.extender.service.ServiceReference;

import ucc.portal.exception.NoSuchCExtStaffingChurchException;

import ucc.portal.model.CExtStaffingChurch;
import ucc.portal.model.impl.CExtStaffingChurchImpl;
import ucc.portal.model.impl.CExtStaffingChurchModelImpl;

import ucc.portal.service.persistence.CExtStaffingChurchPK;
import ucc.portal.service.persistence.CExtStaffingChurchPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the c ext staffing church service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtStaffingChurchPersistence
 * @see ucc.portal.service.persistence.CExtStaffingChurchUtil
 * @generated
 */
@ProviderType
public class CExtStaffingChurchPersistenceImpl extends BasePersistenceImpl<CExtStaffingChurch>
	implements CExtStaffingChurchPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CExtStaffingChurchUtil} to access the c ext staffing church persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CExtStaffingChurchImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingChurchModelImpl.FINDER_CACHE_ENABLED,
			CExtStaffingChurchImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingChurchModelImpl.FINDER_CACHE_ENABLED,
			CExtStaffingChurchImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingChurchModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingChurchModelImpl.FINDER_CACHE_ENABLED,
			CExtStaffingChurchImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrganizationId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingChurchModelImpl.FINDER_CACHE_ENABLED,
			CExtStaffingChurchImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrganizationId",
			new String[] { Long.class.getName() },
			CExtStaffingChurchModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			CExtStaffingChurchModelImpl.SFPRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONID = new FinderPath(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingChurchModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrganizationId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the c ext staffing churchs where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching c ext staffing churchs
	 */
	@Override
	public List<CExtStaffingChurch> findByOrganizationId(long organizationId) {
		return findByOrganizationId(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext staffing churchs where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext staffing churchs
	 * @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	 * @return the range of matching c ext staffing churchs
	 */
	@Override
	public List<CExtStaffingChurch> findByOrganizationId(long organizationId,
		int start, int end) {
		return findByOrganizationId(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext staffing churchs where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext staffing churchs
	 * @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching c ext staffing churchs
	 */
	@Override
	public List<CExtStaffingChurch> findByOrganizationId(long organizationId,
		int start, int end,
		OrderByComparator<CExtStaffingChurch> orderByComparator) {
		return findByOrganizationId(organizationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext staffing churchs where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext staffing churchs
	 * @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching c ext staffing churchs
	 */
	@Override
	public List<CExtStaffingChurch> findByOrganizationId(long organizationId,
		int start, int end,
		OrderByComparator<CExtStaffingChurch> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID;
			finderArgs = new Object[] { organizationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID;
			finderArgs = new Object[] {
					organizationId,
					
					start, end, orderByComparator
				};
		}

		List<CExtStaffingChurch> list = null;

		if (retrieveFromCache) {
			list = (List<CExtStaffingChurch>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CExtStaffingChurch cExtStaffingChurch : list) {
					if ((organizationId != cExtStaffingChurch.getOrganizationId())) {
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

			query.append(_SQL_SELECT_CEXTSTAFFINGCHURCH_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CExtStaffingChurchModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<CExtStaffingChurch>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtStaffingChurch>)QueryUtil.list(q,
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
	 * Returns the first c ext staffing church in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext staffing church
	 * @throws NoSuchCExtStaffingChurchException if a matching c ext staffing church could not be found
	 */
	@Override
	public CExtStaffingChurch findByOrganizationId_First(long organizationId,
		OrderByComparator<CExtStaffingChurch> orderByComparator)
		throws NoSuchCExtStaffingChurchException {
		CExtStaffingChurch cExtStaffingChurch = fetchByOrganizationId_First(organizationId,
				orderByComparator);

		if (cExtStaffingChurch != null) {
			return cExtStaffingChurch;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtStaffingChurchException(msg.toString());
	}

	/**
	 * Returns the first c ext staffing church in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext staffing church, or <code>null</code> if a matching c ext staffing church could not be found
	 */
	@Override
	public CExtStaffingChurch fetchByOrganizationId_First(long organizationId,
		OrderByComparator<CExtStaffingChurch> orderByComparator) {
		List<CExtStaffingChurch> list = findByOrganizationId(organizationId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last c ext staffing church in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext staffing church
	 * @throws NoSuchCExtStaffingChurchException if a matching c ext staffing church could not be found
	 */
	@Override
	public CExtStaffingChurch findByOrganizationId_Last(long organizationId,
		OrderByComparator<CExtStaffingChurch> orderByComparator)
		throws NoSuchCExtStaffingChurchException {
		CExtStaffingChurch cExtStaffingChurch = fetchByOrganizationId_Last(organizationId,
				orderByComparator);

		if (cExtStaffingChurch != null) {
			return cExtStaffingChurch;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtStaffingChurchException(msg.toString());
	}

	/**
	 * Returns the last c ext staffing church in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext staffing church, or <code>null</code> if a matching c ext staffing church could not be found
	 */
	@Override
	public CExtStaffingChurch fetchByOrganizationId_Last(long organizationId,
		OrderByComparator<CExtStaffingChurch> orderByComparator) {
		int count = countByOrganizationId(organizationId);

		if (count == 0) {
			return null;
		}

		List<CExtStaffingChurch> list = findByOrganizationId(organizationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the c ext staffing churchs before and after the current c ext staffing church in the ordered set where organizationId = &#63;.
	 *
	 * @param cExtStaffingChurchPK the primary key of the current c ext staffing church
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next c ext staffing church
	 * @throws NoSuchCExtStaffingChurchException if a c ext staffing church with the primary key could not be found
	 */
	@Override
	public CExtStaffingChurch[] findByOrganizationId_PrevAndNext(
		CExtStaffingChurchPK cExtStaffingChurchPK, long organizationId,
		OrderByComparator<CExtStaffingChurch> orderByComparator)
		throws NoSuchCExtStaffingChurchException {
		CExtStaffingChurch cExtStaffingChurch = findByPrimaryKey(cExtStaffingChurchPK);

		Session session = null;

		try {
			session = openSession();

			CExtStaffingChurch[] array = new CExtStaffingChurchImpl[3];

			array[0] = getByOrganizationId_PrevAndNext(session,
					cExtStaffingChurch, organizationId, orderByComparator, true);

			array[1] = cExtStaffingChurch;

			array[2] = getByOrganizationId_PrevAndNext(session,
					cExtStaffingChurch, organizationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CExtStaffingChurch getByOrganizationId_PrevAndNext(
		Session session, CExtStaffingChurch cExtStaffingChurch,
		long organizationId,
		OrderByComparator<CExtStaffingChurch> orderByComparator,
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

		query.append(_SQL_SELECT_CEXTSTAFFINGCHURCH_WHERE);

		query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

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
			query.append(CExtStaffingChurchModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cExtStaffingChurch);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CExtStaffingChurch> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the c ext staffing churchs where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 */
	@Override
	public void removeByOrganizationId(long organizationId) {
		for (CExtStaffingChurch cExtStaffingChurch : findByOrganizationId(
				organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cExtStaffingChurch);
		}
	}

	/**
	 * Returns the number of c ext staffing churchs where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching c ext staffing churchs
	 */
	@Override
	public int countByOrganizationId(long organizationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONID;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CEXTSTAFFINGCHURCH_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

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

	private static final String _FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2 = "cExtStaffingChurch.id.organizationId = ?";

	public CExtStaffingChurchPersistenceImpl() {
		setModelClass(CExtStaffingChurch.class);
	}

	/**
	 * Caches the c ext staffing church in the entity cache if it is enabled.
	 *
	 * @param cExtStaffingChurch the c ext staffing church
	 */
	@Override
	public void cacheResult(CExtStaffingChurch cExtStaffingChurch) {
		entityCache.putResult(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingChurchImpl.class, cExtStaffingChurch.getPrimaryKey(),
			cExtStaffingChurch);

		cExtStaffingChurch.resetOriginalValues();
	}

	/**
	 * Caches the c ext staffing churchs in the entity cache if it is enabled.
	 *
	 * @param cExtStaffingChurchs the c ext staffing churchs
	 */
	@Override
	public void cacheResult(List<CExtStaffingChurch> cExtStaffingChurchs) {
		for (CExtStaffingChurch cExtStaffingChurch : cExtStaffingChurchs) {
			if (entityCache.getResult(
						CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
						CExtStaffingChurchImpl.class,
						cExtStaffingChurch.getPrimaryKey()) == null) {
				cacheResult(cExtStaffingChurch);
			}
			else {
				cExtStaffingChurch.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c ext staffing churchs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CExtStaffingChurchImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c ext staffing church.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CExtStaffingChurch cExtStaffingChurch) {
		entityCache.removeResult(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingChurchImpl.class, cExtStaffingChurch.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CExtStaffingChurch> cExtStaffingChurchs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CExtStaffingChurch cExtStaffingChurch : cExtStaffingChurchs) {
			entityCache.removeResult(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
				CExtStaffingChurchImpl.class, cExtStaffingChurch.getPrimaryKey());
		}
	}

	/**
	 * Creates a new c ext staffing church with the primary key. Does not add the c ext staffing church to the database.
	 *
	 * @param cExtStaffingChurchPK the primary key for the new c ext staffing church
	 * @return the new c ext staffing church
	 */
	@Override
	public CExtStaffingChurch create(CExtStaffingChurchPK cExtStaffingChurchPK) {
		CExtStaffingChurch cExtStaffingChurch = new CExtStaffingChurchImpl();

		cExtStaffingChurch.setNew(true);
		cExtStaffingChurch.setPrimaryKey(cExtStaffingChurchPK);

		cExtStaffingChurch.setCompanyId(companyProvider.getCompanyId());

		return cExtStaffingChurch;
	}

	/**
	 * Removes the c ext staffing church with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cExtStaffingChurchPK the primary key of the c ext staffing church
	 * @return the c ext staffing church that was removed
	 * @throws NoSuchCExtStaffingChurchException if a c ext staffing church with the primary key could not be found
	 */
	@Override
	public CExtStaffingChurch remove(CExtStaffingChurchPK cExtStaffingChurchPK)
		throws NoSuchCExtStaffingChurchException {
		return remove((Serializable)cExtStaffingChurchPK);
	}

	/**
	 * Removes the c ext staffing church with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c ext staffing church
	 * @return the c ext staffing church that was removed
	 * @throws NoSuchCExtStaffingChurchException if a c ext staffing church with the primary key could not be found
	 */
	@Override
	public CExtStaffingChurch remove(Serializable primaryKey)
		throws NoSuchCExtStaffingChurchException {
		Session session = null;

		try {
			session = openSession();

			CExtStaffingChurch cExtStaffingChurch = (CExtStaffingChurch)session.get(CExtStaffingChurchImpl.class,
					primaryKey);

			if (cExtStaffingChurch == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCExtStaffingChurchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cExtStaffingChurch);
		}
		catch (NoSuchCExtStaffingChurchException nsee) {
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
	protected CExtStaffingChurch removeImpl(
		CExtStaffingChurch cExtStaffingChurch) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cExtStaffingChurch)) {
				cExtStaffingChurch = (CExtStaffingChurch)session.get(CExtStaffingChurchImpl.class,
						cExtStaffingChurch.getPrimaryKeyObj());
			}

			if (cExtStaffingChurch != null) {
				session.delete(cExtStaffingChurch);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cExtStaffingChurch != null) {
			clearCache(cExtStaffingChurch);
		}

		return cExtStaffingChurch;
	}

	@Override
	public CExtStaffingChurch updateImpl(CExtStaffingChurch cExtStaffingChurch) {
		boolean isNew = cExtStaffingChurch.isNew();

		if (!(cExtStaffingChurch instanceof CExtStaffingChurchModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cExtStaffingChurch.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(cExtStaffingChurch);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cExtStaffingChurch proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CExtStaffingChurch implementation " +
				cExtStaffingChurch.getClass());
		}

		CExtStaffingChurchModelImpl cExtStaffingChurchModelImpl = (CExtStaffingChurchModelImpl)cExtStaffingChurch;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (cExtStaffingChurch.getCreateDate() == null)) {
			if (serviceContext == null) {
				cExtStaffingChurch.setCreateDate(now);
			}
			else {
				cExtStaffingChurch.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!cExtStaffingChurchModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cExtStaffingChurch.setModifiedDate(now);
			}
			else {
				cExtStaffingChurch.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (cExtStaffingChurch.isNew()) {
				session.save(cExtStaffingChurch);

				cExtStaffingChurch.setNew(false);
			}
			else {
				cExtStaffingChurch = (CExtStaffingChurch)session.merge(cExtStaffingChurch);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CExtStaffingChurchModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					cExtStaffingChurchModelImpl.getOrganizationId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((cExtStaffingChurchModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cExtStaffingChurchModelImpl.getOriginalOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);

				args = new Object[] {
						cExtStaffingChurchModelImpl.getOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);
			}
		}

		entityCache.putResult(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingChurchImpl.class, cExtStaffingChurch.getPrimaryKey(),
			cExtStaffingChurch, false);

		cExtStaffingChurch.resetOriginalValues();

		return cExtStaffingChurch;
	}

	/**
	 * Returns the c ext staffing church with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext staffing church
	 * @return the c ext staffing church
	 * @throws NoSuchCExtStaffingChurchException if a c ext staffing church with the primary key could not be found
	 */
	@Override
	public CExtStaffingChurch findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCExtStaffingChurchException {
		CExtStaffingChurch cExtStaffingChurch = fetchByPrimaryKey(primaryKey);

		if (cExtStaffingChurch == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCExtStaffingChurchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cExtStaffingChurch;
	}

	/**
	 * Returns the c ext staffing church with the primary key or throws a {@link NoSuchCExtStaffingChurchException} if it could not be found.
	 *
	 * @param cExtStaffingChurchPK the primary key of the c ext staffing church
	 * @return the c ext staffing church
	 * @throws NoSuchCExtStaffingChurchException if a c ext staffing church with the primary key could not be found
	 */
	@Override
	public CExtStaffingChurch findByPrimaryKey(
		CExtStaffingChurchPK cExtStaffingChurchPK)
		throws NoSuchCExtStaffingChurchException {
		return findByPrimaryKey((Serializable)cExtStaffingChurchPK);
	}

	/**
	 * Returns the c ext staffing church with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext staffing church
	 * @return the c ext staffing church, or <code>null</code> if a c ext staffing church with the primary key could not be found
	 */
	@Override
	public CExtStaffingChurch fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
				CExtStaffingChurchImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CExtStaffingChurch cExtStaffingChurch = (CExtStaffingChurch)serializable;

		if (cExtStaffingChurch == null) {
			Session session = null;

			try {
				session = openSession();

				cExtStaffingChurch = (CExtStaffingChurch)session.get(CExtStaffingChurchImpl.class,
						primaryKey);

				if (cExtStaffingChurch != null) {
					cacheResult(cExtStaffingChurch);
				}
				else {
					entityCache.putResult(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
						CExtStaffingChurchImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CExtStaffingChurchModelImpl.ENTITY_CACHE_ENABLED,
					CExtStaffingChurchImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cExtStaffingChurch;
	}

	/**
	 * Returns the c ext staffing church with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cExtStaffingChurchPK the primary key of the c ext staffing church
	 * @return the c ext staffing church, or <code>null</code> if a c ext staffing church with the primary key could not be found
	 */
	@Override
	public CExtStaffingChurch fetchByPrimaryKey(
		CExtStaffingChurchPK cExtStaffingChurchPK) {
		return fetchByPrimaryKey((Serializable)cExtStaffingChurchPK);
	}

	@Override
	public Map<Serializable, CExtStaffingChurch> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CExtStaffingChurch> map = new HashMap<Serializable, CExtStaffingChurch>();

		for (Serializable primaryKey : primaryKeys) {
			CExtStaffingChurch cExtStaffingChurch = fetchByPrimaryKey(primaryKey);

			if (cExtStaffingChurch != null) {
				map.put(primaryKey, cExtStaffingChurch);
			}
		}

		return map;
	}

	/**
	 * Returns all the c ext staffing churchs.
	 *
	 * @return the c ext staffing churchs
	 */
	@Override
	public List<CExtStaffingChurch> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext staffing churchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext staffing churchs
	 * @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	 * @return the range of c ext staffing churchs
	 */
	@Override
	public List<CExtStaffingChurch> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext staffing churchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext staffing churchs
	 * @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c ext staffing churchs
	 */
	@Override
	public List<CExtStaffingChurch> findAll(int start, int end,
		OrderByComparator<CExtStaffingChurch> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext staffing churchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext staffing churchs
	 * @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of c ext staffing churchs
	 */
	@Override
	public List<CExtStaffingChurch> findAll(int start, int end,
		OrderByComparator<CExtStaffingChurch> orderByComparator,
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

		List<CExtStaffingChurch> list = null;

		if (retrieveFromCache) {
			list = (List<CExtStaffingChurch>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CEXTSTAFFINGCHURCH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CEXTSTAFFINGCHURCH;

				if (pagination) {
					sql = sql.concat(CExtStaffingChurchModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CExtStaffingChurch>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtStaffingChurch>)QueryUtil.list(q,
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
	 * Removes all the c ext staffing churchs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CExtStaffingChurch cExtStaffingChurch : findAll()) {
			remove(cExtStaffingChurch);
		}
	}

	/**
	 * Returns the number of c ext staffing churchs.
	 *
	 * @return the number of c ext staffing churchs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CEXTSTAFFINGCHURCH);

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
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CExtStaffingChurchModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the c ext staffing church persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CExtStaffingChurchImpl.class.getName());
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
	private static final String _SQL_SELECT_CEXTSTAFFINGCHURCH = "SELECT cExtStaffingChurch FROM CExtStaffingChurch cExtStaffingChurch";
	private static final String _SQL_SELECT_CEXTSTAFFINGCHURCH_WHERE = "SELECT cExtStaffingChurch FROM CExtStaffingChurch cExtStaffingChurch WHERE ";
	private static final String _SQL_COUNT_CEXTSTAFFINGCHURCH = "SELECT COUNT(cExtStaffingChurch) FROM CExtStaffingChurch cExtStaffingChurch";
	private static final String _SQL_COUNT_CEXTSTAFFINGCHURCH_WHERE = "SELECT COUNT(cExtStaffingChurch) FROM CExtStaffingChurch cExtStaffingChurch WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cExtStaffingChurch.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CExtStaffingChurch exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CExtStaffingChurch exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CExtStaffingChurchPersistenceImpl.class);
	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(new String[] {
				"organizationId", "cextStaffingChurchId"
			});
}