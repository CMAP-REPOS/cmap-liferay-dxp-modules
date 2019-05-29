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

import ucc.portal.exception.NoSuchCExtHistoricalInformationStaffingException;

import ucc.portal.model.CExtHistoricalInformationStaffing;
import ucc.portal.model.impl.CExtHistoricalInformationStaffingImpl;
import ucc.portal.model.impl.CExtHistoricalInformationStaffingModelImpl;

import ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK;
import ucc.portal.service.persistence.CExtHistoricalInformationStaffingPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the c ext historical information staffing service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtHistoricalInformationStaffingPersistence
 * @see ucc.portal.service.persistence.CExtHistoricalInformationStaffingUtil
 * @generated
 */
@ProviderType
public class CExtHistoricalInformationStaffingPersistenceImpl
	extends BasePersistenceImpl<CExtHistoricalInformationStaffing>
	implements CExtHistoricalInformationStaffingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CExtHistoricalInformationStaffingUtil} to access the c ext historical information staffing persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CExtHistoricalInformationStaffingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
			CExtHistoricalInformationStaffingModelImpl.FINDER_CACHE_ENABLED,
			CExtHistoricalInformationStaffingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
			CExtHistoricalInformationStaffingModelImpl.FINDER_CACHE_ENABLED,
			CExtHistoricalInformationStaffingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
			CExtHistoricalInformationStaffingModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
			CExtHistoricalInformationStaffingModelImpl.FINDER_CACHE_ENABLED,
			CExtHistoricalInformationStaffingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrganizationId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
			CExtHistoricalInformationStaffingModelImpl.FINDER_CACHE_ENABLED,
			CExtHistoricalInformationStaffingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrganizationId",
			new String[] { Long.class.getName() },
			CExtHistoricalInformationStaffingModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			CExtHistoricalInformationStaffingModelImpl.HIPRIORITY_COLUMN_BITMASK |
			CExtHistoricalInformationStaffingModelImpl.HIMINISTERSTARTYEAROFSERVICE_COLUMN_BITMASK |
			CExtHistoricalInformationStaffingModelImpl.HIMINISTERENDYEAROFSERVICE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONID = new FinderPath(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
			CExtHistoricalInformationStaffingModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOrganizationId", new String[] { Long.class.getName() });

	/**
	 * Returns all the c ext historical information staffings where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching c ext historical information staffings
	 */
	@Override
	public List<CExtHistoricalInformationStaffing> findByOrganizationId(
		long organizationId) {
		return findByOrganizationId(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext historical information staffings where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext historical information staffings
	 * @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	 * @return the range of matching c ext historical information staffings
	 */
	@Override
	public List<CExtHistoricalInformationStaffing> findByOrganizationId(
		long organizationId, int start, int end) {
		return findByOrganizationId(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext historical information staffings where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext historical information staffings
	 * @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching c ext historical information staffings
	 */
	@Override
	public List<CExtHistoricalInformationStaffing> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator) {
		return findByOrganizationId(organizationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext historical information staffings where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext historical information staffings
	 * @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching c ext historical information staffings
	 */
	@Override
	public List<CExtHistoricalInformationStaffing> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator,
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

		List<CExtHistoricalInformationStaffing> list = null;

		if (retrieveFromCache) {
			list = (List<CExtHistoricalInformationStaffing>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing : list) {
					if ((organizationId != cExtHistoricalInformationStaffing.getOrganizationId())) {
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

			query.append(_SQL_SELECT_CEXTHISTORICALINFORMATIONSTAFFING_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CExtHistoricalInformationStaffingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<CExtHistoricalInformationStaffing>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtHistoricalInformationStaffing>)QueryUtil.list(q,
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
	 * Returns the first c ext historical information staffing in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext historical information staffing
	 * @throws NoSuchCExtHistoricalInformationStaffingException if a matching c ext historical information staffing could not be found
	 */
	@Override
	public CExtHistoricalInformationStaffing findByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator)
		throws NoSuchCExtHistoricalInformationStaffingException {
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing = fetchByOrganizationId_First(organizationId,
				orderByComparator);

		if (cExtHistoricalInformationStaffing != null) {
			return cExtHistoricalInformationStaffing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtHistoricalInformationStaffingException(msg.toString());
	}

	/**
	 * Returns the first c ext historical information staffing in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext historical information staffing, or <code>null</code> if a matching c ext historical information staffing could not be found
	 */
	@Override
	public CExtHistoricalInformationStaffing fetchByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator) {
		List<CExtHistoricalInformationStaffing> list = findByOrganizationId(organizationId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last c ext historical information staffing in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext historical information staffing
	 * @throws NoSuchCExtHistoricalInformationStaffingException if a matching c ext historical information staffing could not be found
	 */
	@Override
	public CExtHistoricalInformationStaffing findByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator)
		throws NoSuchCExtHistoricalInformationStaffingException {
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing = fetchByOrganizationId_Last(organizationId,
				orderByComparator);

		if (cExtHistoricalInformationStaffing != null) {
			return cExtHistoricalInformationStaffing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtHistoricalInformationStaffingException(msg.toString());
	}

	/**
	 * Returns the last c ext historical information staffing in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext historical information staffing, or <code>null</code> if a matching c ext historical information staffing could not be found
	 */
	@Override
	public CExtHistoricalInformationStaffing fetchByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator) {
		int count = countByOrganizationId(organizationId);

		if (count == 0) {
			return null;
		}

		List<CExtHistoricalInformationStaffing> list = findByOrganizationId(organizationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the c ext historical information staffings before and after the current c ext historical information staffing in the ordered set where organizationId = &#63;.
	 *
	 * @param cExtHistoricalInformationStaffingPK the primary key of the current c ext historical information staffing
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next c ext historical information staffing
	 * @throws NoSuchCExtHistoricalInformationStaffingException if a c ext historical information staffing with the primary key could not be found
	 */
	@Override
	public CExtHistoricalInformationStaffing[] findByOrganizationId_PrevAndNext(
		CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK,
		long organizationId,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator)
		throws NoSuchCExtHistoricalInformationStaffingException {
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing = findByPrimaryKey(cExtHistoricalInformationStaffingPK);

		Session session = null;

		try {
			session = openSession();

			CExtHistoricalInformationStaffing[] array = new CExtHistoricalInformationStaffingImpl[3];

			array[0] = getByOrganizationId_PrevAndNext(session,
					cExtHistoricalInformationStaffing, organizationId,
					orderByComparator, true);

			array[1] = cExtHistoricalInformationStaffing;

			array[2] = getByOrganizationId_PrevAndNext(session,
					cExtHistoricalInformationStaffing, organizationId,
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

	protected CExtHistoricalInformationStaffing getByOrganizationId_PrevAndNext(
		Session session,
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing,
		long organizationId,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator,
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

		query.append(_SQL_SELECT_CEXTHISTORICALINFORMATIONSTAFFING_WHERE);

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
			query.append(CExtHistoricalInformationStaffingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cExtHistoricalInformationStaffing);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CExtHistoricalInformationStaffing> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the c ext historical information staffings where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 */
	@Override
	public void removeByOrganizationId(long organizationId) {
		for (CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing : findByOrganizationId(
				organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cExtHistoricalInformationStaffing);
		}
	}

	/**
	 * Returns the number of c ext historical information staffings where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching c ext historical information staffings
	 */
	@Override
	public int countByOrganizationId(long organizationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONID;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CEXTHISTORICALINFORMATIONSTAFFING_WHERE);

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

	private static final String _FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2 = "cExtHistoricalInformationStaffing.id.organizationId = ?";

	public CExtHistoricalInformationStaffingPersistenceImpl() {
		setModelClass(CExtHistoricalInformationStaffing.class);
	}

	/**
	 * Caches the c ext historical information staffing in the entity cache if it is enabled.
	 *
	 * @param cExtHistoricalInformationStaffing the c ext historical information staffing
	 */
	@Override
	public void cacheResult(
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing) {
		entityCache.putResult(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
			CExtHistoricalInformationStaffingImpl.class,
			cExtHistoricalInformationStaffing.getPrimaryKey(),
			cExtHistoricalInformationStaffing);

		cExtHistoricalInformationStaffing.resetOriginalValues();
	}

	/**
	 * Caches the c ext historical information staffings in the entity cache if it is enabled.
	 *
	 * @param cExtHistoricalInformationStaffings the c ext historical information staffings
	 */
	@Override
	public void cacheResult(
		List<CExtHistoricalInformationStaffing> cExtHistoricalInformationStaffings) {
		for (CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing : cExtHistoricalInformationStaffings) {
			if (entityCache.getResult(
						CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
						CExtHistoricalInformationStaffingImpl.class,
						cExtHistoricalInformationStaffing.getPrimaryKey()) == null) {
				cacheResult(cExtHistoricalInformationStaffing);
			}
			else {
				cExtHistoricalInformationStaffing.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c ext historical information staffings.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CExtHistoricalInformationStaffingImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c ext historical information staffing.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing) {
		entityCache.removeResult(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
			CExtHistoricalInformationStaffingImpl.class,
			cExtHistoricalInformationStaffing.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<CExtHistoricalInformationStaffing> cExtHistoricalInformationStaffings) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing : cExtHistoricalInformationStaffings) {
			entityCache.removeResult(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
				CExtHistoricalInformationStaffingImpl.class,
				cExtHistoricalInformationStaffing.getPrimaryKey());
		}
	}

	/**
	 * Creates a new c ext historical information staffing with the primary key. Does not add the c ext historical information staffing to the database.
	 *
	 * @param cExtHistoricalInformationStaffingPK the primary key for the new c ext historical information staffing
	 * @return the new c ext historical information staffing
	 */
	@Override
	public CExtHistoricalInformationStaffing create(
		CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK) {
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing = new CExtHistoricalInformationStaffingImpl();

		cExtHistoricalInformationStaffing.setNew(true);
		cExtHistoricalInformationStaffing.setPrimaryKey(cExtHistoricalInformationStaffingPK);

		cExtHistoricalInformationStaffing.setCompanyId(companyProvider.getCompanyId());

		return cExtHistoricalInformationStaffing;
	}

	/**
	 * Removes the c ext historical information staffing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cExtHistoricalInformationStaffingPK the primary key of the c ext historical information staffing
	 * @return the c ext historical information staffing that was removed
	 * @throws NoSuchCExtHistoricalInformationStaffingException if a c ext historical information staffing with the primary key could not be found
	 */
	@Override
	public CExtHistoricalInformationStaffing remove(
		CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK)
		throws NoSuchCExtHistoricalInformationStaffingException {
		return remove((Serializable)cExtHistoricalInformationStaffingPK);
	}

	/**
	 * Removes the c ext historical information staffing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c ext historical information staffing
	 * @return the c ext historical information staffing that was removed
	 * @throws NoSuchCExtHistoricalInformationStaffingException if a c ext historical information staffing with the primary key could not be found
	 */
	@Override
	public CExtHistoricalInformationStaffing remove(Serializable primaryKey)
		throws NoSuchCExtHistoricalInformationStaffingException {
		Session session = null;

		try {
			session = openSession();

			CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing = (CExtHistoricalInformationStaffing)session.get(CExtHistoricalInformationStaffingImpl.class,
					primaryKey);

			if (cExtHistoricalInformationStaffing == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCExtHistoricalInformationStaffingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cExtHistoricalInformationStaffing);
		}
		catch (NoSuchCExtHistoricalInformationStaffingException nsee) {
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
	protected CExtHistoricalInformationStaffing removeImpl(
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cExtHistoricalInformationStaffing)) {
				cExtHistoricalInformationStaffing = (CExtHistoricalInformationStaffing)session.get(CExtHistoricalInformationStaffingImpl.class,
						cExtHistoricalInformationStaffing.getPrimaryKeyObj());
			}

			if (cExtHistoricalInformationStaffing != null) {
				session.delete(cExtHistoricalInformationStaffing);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cExtHistoricalInformationStaffing != null) {
			clearCache(cExtHistoricalInformationStaffing);
		}

		return cExtHistoricalInformationStaffing;
	}

	@Override
	public CExtHistoricalInformationStaffing updateImpl(
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing) {
		boolean isNew = cExtHistoricalInformationStaffing.isNew();

		if (!(cExtHistoricalInformationStaffing instanceof CExtHistoricalInformationStaffingModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
						cExtHistoricalInformationStaffing.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(cExtHistoricalInformationStaffing);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cExtHistoricalInformationStaffing proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CExtHistoricalInformationStaffing implementation " +
				cExtHistoricalInformationStaffing.getClass());
		}

		CExtHistoricalInformationStaffingModelImpl cExtHistoricalInformationStaffingModelImpl =
			(CExtHistoricalInformationStaffingModelImpl)cExtHistoricalInformationStaffing;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew &&
				(cExtHistoricalInformationStaffing.getCreateDate() == null)) {
			if (serviceContext == null) {
				cExtHistoricalInformationStaffing.setCreateDate(now);
			}
			else {
				cExtHistoricalInformationStaffing.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!cExtHistoricalInformationStaffingModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cExtHistoricalInformationStaffing.setModifiedDate(now);
			}
			else {
				cExtHistoricalInformationStaffing.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (cExtHistoricalInformationStaffing.isNew()) {
				session.save(cExtHistoricalInformationStaffing);

				cExtHistoricalInformationStaffing.setNew(false);
			}
			else {
				cExtHistoricalInformationStaffing = (CExtHistoricalInformationStaffing)session.merge(cExtHistoricalInformationStaffing);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CExtHistoricalInformationStaffingModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					cExtHistoricalInformationStaffingModelImpl.getOrganizationId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((cExtHistoricalInformationStaffingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cExtHistoricalInformationStaffingModelImpl.getOriginalOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);

				args = new Object[] {
						cExtHistoricalInformationStaffingModelImpl.getOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);
			}
		}

		entityCache.putResult(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
			CExtHistoricalInformationStaffingImpl.class,
			cExtHistoricalInformationStaffing.getPrimaryKey(),
			cExtHistoricalInformationStaffing, false);

		cExtHistoricalInformationStaffing.resetOriginalValues();

		return cExtHistoricalInformationStaffing;
	}

	/**
	 * Returns the c ext historical information staffing with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext historical information staffing
	 * @return the c ext historical information staffing
	 * @throws NoSuchCExtHistoricalInformationStaffingException if a c ext historical information staffing with the primary key could not be found
	 */
	@Override
	public CExtHistoricalInformationStaffing findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchCExtHistoricalInformationStaffingException {
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing = fetchByPrimaryKey(primaryKey);

		if (cExtHistoricalInformationStaffing == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCExtHistoricalInformationStaffingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cExtHistoricalInformationStaffing;
	}

	/**
	 * Returns the c ext historical information staffing with the primary key or throws a {@link NoSuchCExtHistoricalInformationStaffingException} if it could not be found.
	 *
	 * @param cExtHistoricalInformationStaffingPK the primary key of the c ext historical information staffing
	 * @return the c ext historical information staffing
	 * @throws NoSuchCExtHistoricalInformationStaffingException if a c ext historical information staffing with the primary key could not be found
	 */
	@Override
	public CExtHistoricalInformationStaffing findByPrimaryKey(
		CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK)
		throws NoSuchCExtHistoricalInformationStaffingException {
		return findByPrimaryKey((Serializable)cExtHistoricalInformationStaffingPK);
	}

	/**
	 * Returns the c ext historical information staffing with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext historical information staffing
	 * @return the c ext historical information staffing, or <code>null</code> if a c ext historical information staffing with the primary key could not be found
	 */
	@Override
	public CExtHistoricalInformationStaffing fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
				CExtHistoricalInformationStaffingImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing = (CExtHistoricalInformationStaffing)serializable;

		if (cExtHistoricalInformationStaffing == null) {
			Session session = null;

			try {
				session = openSession();

				cExtHistoricalInformationStaffing = (CExtHistoricalInformationStaffing)session.get(CExtHistoricalInformationStaffingImpl.class,
						primaryKey);

				if (cExtHistoricalInformationStaffing != null) {
					cacheResult(cExtHistoricalInformationStaffing);
				}
				else {
					entityCache.putResult(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
						CExtHistoricalInformationStaffingImpl.class,
						primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CExtHistoricalInformationStaffingModelImpl.ENTITY_CACHE_ENABLED,
					CExtHistoricalInformationStaffingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cExtHistoricalInformationStaffing;
	}

	/**
	 * Returns the c ext historical information staffing with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cExtHistoricalInformationStaffingPK the primary key of the c ext historical information staffing
	 * @return the c ext historical information staffing, or <code>null</code> if a c ext historical information staffing with the primary key could not be found
	 */
	@Override
	public CExtHistoricalInformationStaffing fetchByPrimaryKey(
		CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK) {
		return fetchByPrimaryKey((Serializable)cExtHistoricalInformationStaffingPK);
	}

	@Override
	public Map<Serializable, CExtHistoricalInformationStaffing> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CExtHistoricalInformationStaffing> map = new HashMap<Serializable, CExtHistoricalInformationStaffing>();

		for (Serializable primaryKey : primaryKeys) {
			CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing = fetchByPrimaryKey(primaryKey);

			if (cExtHistoricalInformationStaffing != null) {
				map.put(primaryKey, cExtHistoricalInformationStaffing);
			}
		}

		return map;
	}

	/**
	 * Returns all the c ext historical information staffings.
	 *
	 * @return the c ext historical information staffings
	 */
	@Override
	public List<CExtHistoricalInformationStaffing> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext historical information staffings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext historical information staffings
	 * @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	 * @return the range of c ext historical information staffings
	 */
	@Override
	public List<CExtHistoricalInformationStaffing> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext historical information staffings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext historical information staffings
	 * @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c ext historical information staffings
	 */
	@Override
	public List<CExtHistoricalInformationStaffing> findAll(int start, int end,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext historical information staffings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext historical information staffings
	 * @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of c ext historical information staffings
	 */
	@Override
	public List<CExtHistoricalInformationStaffing> findAll(int start, int end,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator,
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

		List<CExtHistoricalInformationStaffing> list = null;

		if (retrieveFromCache) {
			list = (List<CExtHistoricalInformationStaffing>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CEXTHISTORICALINFORMATIONSTAFFING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CEXTHISTORICALINFORMATIONSTAFFING;

				if (pagination) {
					sql = sql.concat(CExtHistoricalInformationStaffingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CExtHistoricalInformationStaffing>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtHistoricalInformationStaffing>)QueryUtil.list(q,
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
	 * Removes all the c ext historical information staffings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing : findAll()) {
			remove(cExtHistoricalInformationStaffing);
		}
	}

	/**
	 * Returns the number of c ext historical information staffings.
	 *
	 * @return the number of c ext historical information staffings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CEXTHISTORICALINFORMATIONSTAFFING);

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
		return CExtHistoricalInformationStaffingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the c ext historical information staffing persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CExtHistoricalInformationStaffingImpl.class.getName());
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
	private static final String _SQL_SELECT_CEXTHISTORICALINFORMATIONSTAFFING = "SELECT cExtHistoricalInformationStaffing FROM CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing";
	private static final String _SQL_SELECT_CEXTHISTORICALINFORMATIONSTAFFING_WHERE =
		"SELECT cExtHistoricalInformationStaffing FROM CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing WHERE ";
	private static final String _SQL_COUNT_CEXTHISTORICALINFORMATIONSTAFFING = "SELECT COUNT(cExtHistoricalInformationStaffing) FROM CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing";
	private static final String _SQL_COUNT_CEXTHISTORICALINFORMATIONSTAFFING_WHERE =
		"SELECT COUNT(cExtHistoricalInformationStaffing) FROM CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cExtHistoricalInformationStaffing.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CExtHistoricalInformationStaffing exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CExtHistoricalInformationStaffing exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CExtHistoricalInformationStaffingPersistenceImpl.class);
	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(new String[] {
				"organizationId", "cextHistoricalInformationStaffingId"
			});
}