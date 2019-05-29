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

import ucc.portal.exception.NoSuchCExtStaffingCongregationException;

import ucc.portal.model.CExtStaffingCongregation;
import ucc.portal.model.impl.CExtStaffingCongregationImpl;
import ucc.portal.model.impl.CExtStaffingCongregationModelImpl;

import ucc.portal.service.persistence.CExtStaffingCongregationPK;
import ucc.portal.service.persistence.CExtStaffingCongregationPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the c ext staffing congregation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtStaffingCongregationPersistence
 * @see ucc.portal.service.persistence.CExtStaffingCongregationUtil
 * @generated
 */
@ProviderType
public class CExtStaffingCongregationPersistenceImpl extends BasePersistenceImpl<CExtStaffingCongregation>
	implements CExtStaffingCongregationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CExtStaffingCongregationUtil} to access the c ext staffing congregation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CExtStaffingCongregationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingCongregationModelImpl.FINDER_CACHE_ENABLED,
			CExtStaffingCongregationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingCongregationModelImpl.FINDER_CACHE_ENABLED,
			CExtStaffingCongregationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingCongregationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingCongregationModelImpl.FINDER_CACHE_ENABLED,
			CExtStaffingCongregationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrganizationId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingCongregationModelImpl.FINDER_CACHE_ENABLED,
			CExtStaffingCongregationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrganizationId",
			new String[] { Long.class.getName() },
			CExtStaffingCongregationModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			CExtStaffingCongregationModelImpl.SFPRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONID = new FinderPath(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingCongregationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrganizationId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the c ext staffing congregations where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching c ext staffing congregations
	 */
	@Override
	public List<CExtStaffingCongregation> findByOrganizationId(
		long organizationId) {
		return findByOrganizationId(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext staffing congregations where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext staffing congregations
	 * @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	 * @return the range of matching c ext staffing congregations
	 */
	@Override
	public List<CExtStaffingCongregation> findByOrganizationId(
		long organizationId, int start, int end) {
		return findByOrganizationId(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext staffing congregations where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext staffing congregations
	 * @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching c ext staffing congregations
	 */
	@Override
	public List<CExtStaffingCongregation> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtStaffingCongregation> orderByComparator) {
		return findByOrganizationId(organizationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext staffing congregations where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext staffing congregations
	 * @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching c ext staffing congregations
	 */
	@Override
	public List<CExtStaffingCongregation> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtStaffingCongregation> orderByComparator,
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

		List<CExtStaffingCongregation> list = null;

		if (retrieveFromCache) {
			list = (List<CExtStaffingCongregation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CExtStaffingCongregation cExtStaffingCongregation : list) {
					if ((organizationId != cExtStaffingCongregation.getOrganizationId())) {
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

			query.append(_SQL_SELECT_CEXTSTAFFINGCONGREGATION_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CExtStaffingCongregationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<CExtStaffingCongregation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtStaffingCongregation>)QueryUtil.list(q,
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
	 * Returns the first c ext staffing congregation in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext staffing congregation
	 * @throws NoSuchCExtStaffingCongregationException if a matching c ext staffing congregation could not be found
	 */
	@Override
	public CExtStaffingCongregation findByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtStaffingCongregation> orderByComparator)
		throws NoSuchCExtStaffingCongregationException {
		CExtStaffingCongregation cExtStaffingCongregation = fetchByOrganizationId_First(organizationId,
				orderByComparator);

		if (cExtStaffingCongregation != null) {
			return cExtStaffingCongregation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtStaffingCongregationException(msg.toString());
	}

	/**
	 * Returns the first c ext staffing congregation in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext staffing congregation, or <code>null</code> if a matching c ext staffing congregation could not be found
	 */
	@Override
	public CExtStaffingCongregation fetchByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtStaffingCongregation> orderByComparator) {
		List<CExtStaffingCongregation> list = findByOrganizationId(organizationId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last c ext staffing congregation in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext staffing congregation
	 * @throws NoSuchCExtStaffingCongregationException if a matching c ext staffing congregation could not be found
	 */
	@Override
	public CExtStaffingCongregation findByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtStaffingCongregation> orderByComparator)
		throws NoSuchCExtStaffingCongregationException {
		CExtStaffingCongregation cExtStaffingCongregation = fetchByOrganizationId_Last(organizationId,
				orderByComparator);

		if (cExtStaffingCongregation != null) {
			return cExtStaffingCongregation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtStaffingCongregationException(msg.toString());
	}

	/**
	 * Returns the last c ext staffing congregation in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext staffing congregation, or <code>null</code> if a matching c ext staffing congregation could not be found
	 */
	@Override
	public CExtStaffingCongregation fetchByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtStaffingCongregation> orderByComparator) {
		int count = countByOrganizationId(organizationId);

		if (count == 0) {
			return null;
		}

		List<CExtStaffingCongregation> list = findByOrganizationId(organizationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the c ext staffing congregations before and after the current c ext staffing congregation in the ordered set where organizationId = &#63;.
	 *
	 * @param cExtStaffingCongregationPK the primary key of the current c ext staffing congregation
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next c ext staffing congregation
	 * @throws NoSuchCExtStaffingCongregationException if a c ext staffing congregation with the primary key could not be found
	 */
	@Override
	public CExtStaffingCongregation[] findByOrganizationId_PrevAndNext(
		CExtStaffingCongregationPK cExtStaffingCongregationPK,
		long organizationId,
		OrderByComparator<CExtStaffingCongregation> orderByComparator)
		throws NoSuchCExtStaffingCongregationException {
		CExtStaffingCongregation cExtStaffingCongregation = findByPrimaryKey(cExtStaffingCongregationPK);

		Session session = null;

		try {
			session = openSession();

			CExtStaffingCongregation[] array = new CExtStaffingCongregationImpl[3];

			array[0] = getByOrganizationId_PrevAndNext(session,
					cExtStaffingCongregation, organizationId,
					orderByComparator, true);

			array[1] = cExtStaffingCongregation;

			array[2] = getByOrganizationId_PrevAndNext(session,
					cExtStaffingCongregation, organizationId,
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

	protected CExtStaffingCongregation getByOrganizationId_PrevAndNext(
		Session session, CExtStaffingCongregation cExtStaffingCongregation,
		long organizationId,
		OrderByComparator<CExtStaffingCongregation> orderByComparator,
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

		query.append(_SQL_SELECT_CEXTSTAFFINGCONGREGATION_WHERE);

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
			query.append(CExtStaffingCongregationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cExtStaffingCongregation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CExtStaffingCongregation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the c ext staffing congregations where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 */
	@Override
	public void removeByOrganizationId(long organizationId) {
		for (CExtStaffingCongregation cExtStaffingCongregation : findByOrganizationId(
				organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cExtStaffingCongregation);
		}
	}

	/**
	 * Returns the number of c ext staffing congregations where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching c ext staffing congregations
	 */
	@Override
	public int countByOrganizationId(long organizationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONID;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CEXTSTAFFINGCONGREGATION_WHERE);

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

	private static final String _FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2 = "cExtStaffingCongregation.id.organizationId = ?";

	public CExtStaffingCongregationPersistenceImpl() {
		setModelClass(CExtStaffingCongregation.class);
	}

	/**
	 * Caches the c ext staffing congregation in the entity cache if it is enabled.
	 *
	 * @param cExtStaffingCongregation the c ext staffing congregation
	 */
	@Override
	public void cacheResult(CExtStaffingCongregation cExtStaffingCongregation) {
		entityCache.putResult(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingCongregationImpl.class,
			cExtStaffingCongregation.getPrimaryKey(), cExtStaffingCongregation);

		cExtStaffingCongregation.resetOriginalValues();
	}

	/**
	 * Caches the c ext staffing congregations in the entity cache if it is enabled.
	 *
	 * @param cExtStaffingCongregations the c ext staffing congregations
	 */
	@Override
	public void cacheResult(
		List<CExtStaffingCongregation> cExtStaffingCongregations) {
		for (CExtStaffingCongregation cExtStaffingCongregation : cExtStaffingCongregations) {
			if (entityCache.getResult(
						CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
						CExtStaffingCongregationImpl.class,
						cExtStaffingCongregation.getPrimaryKey()) == null) {
				cacheResult(cExtStaffingCongregation);
			}
			else {
				cExtStaffingCongregation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c ext staffing congregations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CExtStaffingCongregationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c ext staffing congregation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CExtStaffingCongregation cExtStaffingCongregation) {
		entityCache.removeResult(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingCongregationImpl.class,
			cExtStaffingCongregation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<CExtStaffingCongregation> cExtStaffingCongregations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CExtStaffingCongregation cExtStaffingCongregation : cExtStaffingCongregations) {
			entityCache.removeResult(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
				CExtStaffingCongregationImpl.class,
				cExtStaffingCongregation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new c ext staffing congregation with the primary key. Does not add the c ext staffing congregation to the database.
	 *
	 * @param cExtStaffingCongregationPK the primary key for the new c ext staffing congregation
	 * @return the new c ext staffing congregation
	 */
	@Override
	public CExtStaffingCongregation create(
		CExtStaffingCongregationPK cExtStaffingCongregationPK) {
		CExtStaffingCongregation cExtStaffingCongregation = new CExtStaffingCongregationImpl();

		cExtStaffingCongregation.setNew(true);
		cExtStaffingCongregation.setPrimaryKey(cExtStaffingCongregationPK);

		cExtStaffingCongregation.setCompanyId(companyProvider.getCompanyId());

		return cExtStaffingCongregation;
	}

	/**
	 * Removes the c ext staffing congregation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cExtStaffingCongregationPK the primary key of the c ext staffing congregation
	 * @return the c ext staffing congregation that was removed
	 * @throws NoSuchCExtStaffingCongregationException if a c ext staffing congregation with the primary key could not be found
	 */
	@Override
	public CExtStaffingCongregation remove(
		CExtStaffingCongregationPK cExtStaffingCongregationPK)
		throws NoSuchCExtStaffingCongregationException {
		return remove((Serializable)cExtStaffingCongregationPK);
	}

	/**
	 * Removes the c ext staffing congregation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c ext staffing congregation
	 * @return the c ext staffing congregation that was removed
	 * @throws NoSuchCExtStaffingCongregationException if a c ext staffing congregation with the primary key could not be found
	 */
	@Override
	public CExtStaffingCongregation remove(Serializable primaryKey)
		throws NoSuchCExtStaffingCongregationException {
		Session session = null;

		try {
			session = openSession();

			CExtStaffingCongregation cExtStaffingCongregation = (CExtStaffingCongregation)session.get(CExtStaffingCongregationImpl.class,
					primaryKey);

			if (cExtStaffingCongregation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCExtStaffingCongregationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cExtStaffingCongregation);
		}
		catch (NoSuchCExtStaffingCongregationException nsee) {
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
	protected CExtStaffingCongregation removeImpl(
		CExtStaffingCongregation cExtStaffingCongregation) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cExtStaffingCongregation)) {
				cExtStaffingCongregation = (CExtStaffingCongregation)session.get(CExtStaffingCongregationImpl.class,
						cExtStaffingCongregation.getPrimaryKeyObj());
			}

			if (cExtStaffingCongregation != null) {
				session.delete(cExtStaffingCongregation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cExtStaffingCongregation != null) {
			clearCache(cExtStaffingCongregation);
		}

		return cExtStaffingCongregation;
	}

	@Override
	public CExtStaffingCongregation updateImpl(
		CExtStaffingCongregation cExtStaffingCongregation) {
		boolean isNew = cExtStaffingCongregation.isNew();

		if (!(cExtStaffingCongregation instanceof CExtStaffingCongregationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cExtStaffingCongregation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(cExtStaffingCongregation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cExtStaffingCongregation proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CExtStaffingCongregation implementation " +
				cExtStaffingCongregation.getClass());
		}

		CExtStaffingCongregationModelImpl cExtStaffingCongregationModelImpl = (CExtStaffingCongregationModelImpl)cExtStaffingCongregation;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (cExtStaffingCongregation.getCreateDate() == null)) {
			if (serviceContext == null) {
				cExtStaffingCongregation.setCreateDate(now);
			}
			else {
				cExtStaffingCongregation.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!cExtStaffingCongregationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cExtStaffingCongregation.setModifiedDate(now);
			}
			else {
				cExtStaffingCongregation.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (cExtStaffingCongregation.isNew()) {
				session.save(cExtStaffingCongregation);

				cExtStaffingCongregation.setNew(false);
			}
			else {
				cExtStaffingCongregation = (CExtStaffingCongregation)session.merge(cExtStaffingCongregation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CExtStaffingCongregationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					cExtStaffingCongregationModelImpl.getOrganizationId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((cExtStaffingCongregationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cExtStaffingCongregationModelImpl.getOriginalOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);

				args = new Object[] {
						cExtStaffingCongregationModelImpl.getOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);
			}
		}

		entityCache.putResult(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
			CExtStaffingCongregationImpl.class,
			cExtStaffingCongregation.getPrimaryKey(), cExtStaffingCongregation,
			false);

		cExtStaffingCongregation.resetOriginalValues();

		return cExtStaffingCongregation;
	}

	/**
	 * Returns the c ext staffing congregation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext staffing congregation
	 * @return the c ext staffing congregation
	 * @throws NoSuchCExtStaffingCongregationException if a c ext staffing congregation with the primary key could not be found
	 */
	@Override
	public CExtStaffingCongregation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCExtStaffingCongregationException {
		CExtStaffingCongregation cExtStaffingCongregation = fetchByPrimaryKey(primaryKey);

		if (cExtStaffingCongregation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCExtStaffingCongregationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cExtStaffingCongregation;
	}

	/**
	 * Returns the c ext staffing congregation with the primary key or throws a {@link NoSuchCExtStaffingCongregationException} if it could not be found.
	 *
	 * @param cExtStaffingCongregationPK the primary key of the c ext staffing congregation
	 * @return the c ext staffing congregation
	 * @throws NoSuchCExtStaffingCongregationException if a c ext staffing congregation with the primary key could not be found
	 */
	@Override
	public CExtStaffingCongregation findByPrimaryKey(
		CExtStaffingCongregationPK cExtStaffingCongregationPK)
		throws NoSuchCExtStaffingCongregationException {
		return findByPrimaryKey((Serializable)cExtStaffingCongregationPK);
	}

	/**
	 * Returns the c ext staffing congregation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext staffing congregation
	 * @return the c ext staffing congregation, or <code>null</code> if a c ext staffing congregation with the primary key could not be found
	 */
	@Override
	public CExtStaffingCongregation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
				CExtStaffingCongregationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CExtStaffingCongregation cExtStaffingCongregation = (CExtStaffingCongregation)serializable;

		if (cExtStaffingCongregation == null) {
			Session session = null;

			try {
				session = openSession();

				cExtStaffingCongregation = (CExtStaffingCongregation)session.get(CExtStaffingCongregationImpl.class,
						primaryKey);

				if (cExtStaffingCongregation != null) {
					cacheResult(cExtStaffingCongregation);
				}
				else {
					entityCache.putResult(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
						CExtStaffingCongregationImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CExtStaffingCongregationModelImpl.ENTITY_CACHE_ENABLED,
					CExtStaffingCongregationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cExtStaffingCongregation;
	}

	/**
	 * Returns the c ext staffing congregation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cExtStaffingCongregationPK the primary key of the c ext staffing congregation
	 * @return the c ext staffing congregation, or <code>null</code> if a c ext staffing congregation with the primary key could not be found
	 */
	@Override
	public CExtStaffingCongregation fetchByPrimaryKey(
		CExtStaffingCongregationPK cExtStaffingCongregationPK) {
		return fetchByPrimaryKey((Serializable)cExtStaffingCongregationPK);
	}

	@Override
	public Map<Serializable, CExtStaffingCongregation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CExtStaffingCongregation> map = new HashMap<Serializable, CExtStaffingCongregation>();

		for (Serializable primaryKey : primaryKeys) {
			CExtStaffingCongregation cExtStaffingCongregation = fetchByPrimaryKey(primaryKey);

			if (cExtStaffingCongregation != null) {
				map.put(primaryKey, cExtStaffingCongregation);
			}
		}

		return map;
	}

	/**
	 * Returns all the c ext staffing congregations.
	 *
	 * @return the c ext staffing congregations
	 */
	@Override
	public List<CExtStaffingCongregation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext staffing congregations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext staffing congregations
	 * @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	 * @return the range of c ext staffing congregations
	 */
	@Override
	public List<CExtStaffingCongregation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext staffing congregations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext staffing congregations
	 * @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c ext staffing congregations
	 */
	@Override
	public List<CExtStaffingCongregation> findAll(int start, int end,
		OrderByComparator<CExtStaffingCongregation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext staffing congregations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext staffing congregations
	 * @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of c ext staffing congregations
	 */
	@Override
	public List<CExtStaffingCongregation> findAll(int start, int end,
		OrderByComparator<CExtStaffingCongregation> orderByComparator,
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

		List<CExtStaffingCongregation> list = null;

		if (retrieveFromCache) {
			list = (List<CExtStaffingCongregation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CEXTSTAFFINGCONGREGATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CEXTSTAFFINGCONGREGATION;

				if (pagination) {
					sql = sql.concat(CExtStaffingCongregationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CExtStaffingCongregation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtStaffingCongregation>)QueryUtil.list(q,
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
	 * Removes all the c ext staffing congregations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CExtStaffingCongregation cExtStaffingCongregation : findAll()) {
			remove(cExtStaffingCongregation);
		}
	}

	/**
	 * Returns the number of c ext staffing congregations.
	 *
	 * @return the number of c ext staffing congregations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CEXTSTAFFINGCONGREGATION);

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
		return CExtStaffingCongregationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the c ext staffing congregation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CExtStaffingCongregationImpl.class.getName());
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
	private static final String _SQL_SELECT_CEXTSTAFFINGCONGREGATION = "SELECT cExtStaffingCongregation FROM CExtStaffingCongregation cExtStaffingCongregation";
	private static final String _SQL_SELECT_CEXTSTAFFINGCONGREGATION_WHERE = "SELECT cExtStaffingCongregation FROM CExtStaffingCongregation cExtStaffingCongregation WHERE ";
	private static final String _SQL_COUNT_CEXTSTAFFINGCONGREGATION = "SELECT COUNT(cExtStaffingCongregation) FROM CExtStaffingCongregation cExtStaffingCongregation";
	private static final String _SQL_COUNT_CEXTSTAFFINGCONGREGATION_WHERE = "SELECT COUNT(cExtStaffingCongregation) FROM CExtStaffingCongregation cExtStaffingCongregation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cExtStaffingCongregation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CExtStaffingCongregation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CExtStaffingCongregation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CExtStaffingCongregationPersistenceImpl.class);
	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(new String[] {
				"organizationId", "cextStaffingCongregationId"
			});
}