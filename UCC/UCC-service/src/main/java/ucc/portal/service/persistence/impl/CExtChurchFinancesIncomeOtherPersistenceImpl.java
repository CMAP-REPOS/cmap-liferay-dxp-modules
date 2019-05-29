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

import ucc.portal.exception.NoSuchCExtChurchFinancesIncomeOtherException;

import ucc.portal.model.CExtChurchFinancesIncomeOther;
import ucc.portal.model.impl.CExtChurchFinancesIncomeOtherImpl;
import ucc.portal.model.impl.CExtChurchFinancesIncomeOtherModelImpl;

import ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK;
import ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the c ext church finances income other service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtChurchFinancesIncomeOtherPersistence
 * @see ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherUtil
 * @generated
 */
@ProviderType
public class CExtChurchFinancesIncomeOtherPersistenceImpl
	extends BasePersistenceImpl<CExtChurchFinancesIncomeOther>
	implements CExtChurchFinancesIncomeOtherPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CExtChurchFinancesIncomeOtherUtil} to access the c ext church finances income other persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CExtChurchFinancesIncomeOtherImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherModelImpl.FINDER_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherModelImpl.FINDER_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherModelImpl.FINDER_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrganizationId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherModelImpl.FINDER_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrganizationId",
			new String[] { Long.class.getName() },
			CExtChurchFinancesIncomeOtherModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			CExtChurchFinancesIncomeOtherModelImpl.FNPRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONID = new FinderPath(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOrganizationId", new String[] { Long.class.getName() });

	/**
	 * Returns all the c ext church finances income others where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching c ext church finances income others
	 */
	@Override
	public List<CExtChurchFinancesIncomeOther> findByOrganizationId(
		long organizationId) {
		return findByOrganizationId(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext church finances income others where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext church finances income others
	 * @param end the upper bound of the range of c ext church finances income others (not inclusive)
	 * @return the range of matching c ext church finances income others
	 */
	@Override
	public List<CExtChurchFinancesIncomeOther> findByOrganizationId(
		long organizationId, int start, int end) {
		return findByOrganizationId(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext church finances income others where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext church finances income others
	 * @param end the upper bound of the range of c ext church finances income others (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching c ext church finances income others
	 */
	@Override
	public List<CExtChurchFinancesIncomeOther> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator) {
		return findByOrganizationId(organizationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext church finances income others where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext church finances income others
	 * @param end the upper bound of the range of c ext church finances income others (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching c ext church finances income others
	 */
	@Override
	public List<CExtChurchFinancesIncomeOther> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator,
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

		List<CExtChurchFinancesIncomeOther> list = null;

		if (retrieveFromCache) {
			list = (List<CExtChurchFinancesIncomeOther>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther : list) {
					if ((organizationId != cExtChurchFinancesIncomeOther.getOrganizationId())) {
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

			query.append(_SQL_SELECT_CEXTCHURCHFINANCESINCOMEOTHER_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CExtChurchFinancesIncomeOtherModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<CExtChurchFinancesIncomeOther>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtChurchFinancesIncomeOther>)QueryUtil.list(q,
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
	 * Returns the first c ext church finances income other in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext church finances income other
	 * @throws NoSuchCExtChurchFinancesIncomeOtherException if a matching c ext church finances income other could not be found
	 */
	@Override
	public CExtChurchFinancesIncomeOther findByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator)
		throws NoSuchCExtChurchFinancesIncomeOtherException {
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther = fetchByOrganizationId_First(organizationId,
				orderByComparator);

		if (cExtChurchFinancesIncomeOther != null) {
			return cExtChurchFinancesIncomeOther;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtChurchFinancesIncomeOtherException(msg.toString());
	}

	/**
	 * Returns the first c ext church finances income other in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext church finances income other, or <code>null</code> if a matching c ext church finances income other could not be found
	 */
	@Override
	public CExtChurchFinancesIncomeOther fetchByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator) {
		List<CExtChurchFinancesIncomeOther> list = findByOrganizationId(organizationId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last c ext church finances income other in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext church finances income other
	 * @throws NoSuchCExtChurchFinancesIncomeOtherException if a matching c ext church finances income other could not be found
	 */
	@Override
	public CExtChurchFinancesIncomeOther findByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator)
		throws NoSuchCExtChurchFinancesIncomeOtherException {
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther = fetchByOrganizationId_Last(organizationId,
				orderByComparator);

		if (cExtChurchFinancesIncomeOther != null) {
			return cExtChurchFinancesIncomeOther;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtChurchFinancesIncomeOtherException(msg.toString());
	}

	/**
	 * Returns the last c ext church finances income other in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext church finances income other, or <code>null</code> if a matching c ext church finances income other could not be found
	 */
	@Override
	public CExtChurchFinancesIncomeOther fetchByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator) {
		int count = countByOrganizationId(organizationId);

		if (count == 0) {
			return null;
		}

		List<CExtChurchFinancesIncomeOther> list = findByOrganizationId(organizationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the c ext church finances income others before and after the current c ext church finances income other in the ordered set where organizationId = &#63;.
	 *
	 * @param cExtChurchFinancesIncomeOtherPK the primary key of the current c ext church finances income other
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next c ext church finances income other
	 * @throws NoSuchCExtChurchFinancesIncomeOtherException if a c ext church finances income other with the primary key could not be found
	 */
	@Override
	public CExtChurchFinancesIncomeOther[] findByOrganizationId_PrevAndNext(
		CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK,
		long organizationId,
		OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator)
		throws NoSuchCExtChurchFinancesIncomeOtherException {
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther = findByPrimaryKey(cExtChurchFinancesIncomeOtherPK);

		Session session = null;

		try {
			session = openSession();

			CExtChurchFinancesIncomeOther[] array = new CExtChurchFinancesIncomeOtherImpl[3];

			array[0] = getByOrganizationId_PrevAndNext(session,
					cExtChurchFinancesIncomeOther, organizationId,
					orderByComparator, true);

			array[1] = cExtChurchFinancesIncomeOther;

			array[2] = getByOrganizationId_PrevAndNext(session,
					cExtChurchFinancesIncomeOther, organizationId,
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

	protected CExtChurchFinancesIncomeOther getByOrganizationId_PrevAndNext(
		Session session,
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther,
		long organizationId,
		OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator,
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

		query.append(_SQL_SELECT_CEXTCHURCHFINANCESINCOMEOTHER_WHERE);

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
			query.append(CExtChurchFinancesIncomeOtherModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cExtChurchFinancesIncomeOther);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CExtChurchFinancesIncomeOther> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the c ext church finances income others where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 */
	@Override
	public void removeByOrganizationId(long organizationId) {
		for (CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther : findByOrganizationId(
				organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cExtChurchFinancesIncomeOther);
		}
	}

	/**
	 * Returns the number of c ext church finances income others where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching c ext church finances income others
	 */
	@Override
	public int countByOrganizationId(long organizationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONID;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CEXTCHURCHFINANCESINCOMEOTHER_WHERE);

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

	private static final String _FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2 = "cExtChurchFinancesIncomeOther.id.organizationId = ?";

	public CExtChurchFinancesIncomeOtherPersistenceImpl() {
		setModelClass(CExtChurchFinancesIncomeOther.class);
	}

	/**
	 * Caches the c ext church finances income other in the entity cache if it is enabled.
	 *
	 * @param cExtChurchFinancesIncomeOther the c ext church finances income other
	 */
	@Override
	public void cacheResult(
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther) {
		entityCache.putResult(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherImpl.class,
			cExtChurchFinancesIncomeOther.getPrimaryKey(),
			cExtChurchFinancesIncomeOther);

		cExtChurchFinancesIncomeOther.resetOriginalValues();
	}

	/**
	 * Caches the c ext church finances income others in the entity cache if it is enabled.
	 *
	 * @param cExtChurchFinancesIncomeOthers the c ext church finances income others
	 */
	@Override
	public void cacheResult(
		List<CExtChurchFinancesIncomeOther> cExtChurchFinancesIncomeOthers) {
		for (CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther : cExtChurchFinancesIncomeOthers) {
			if (entityCache.getResult(
						CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
						CExtChurchFinancesIncomeOtherImpl.class,
						cExtChurchFinancesIncomeOther.getPrimaryKey()) == null) {
				cacheResult(cExtChurchFinancesIncomeOther);
			}
			else {
				cExtChurchFinancesIncomeOther.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c ext church finances income others.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CExtChurchFinancesIncomeOtherImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c ext church finances income other.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther) {
		entityCache.removeResult(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherImpl.class,
			cExtChurchFinancesIncomeOther.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<CExtChurchFinancesIncomeOther> cExtChurchFinancesIncomeOthers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther : cExtChurchFinancesIncomeOthers) {
			entityCache.removeResult(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
				CExtChurchFinancesIncomeOtherImpl.class,
				cExtChurchFinancesIncomeOther.getPrimaryKey());
		}
	}

	/**
	 * Creates a new c ext church finances income other with the primary key. Does not add the c ext church finances income other to the database.
	 *
	 * @param cExtChurchFinancesIncomeOtherPK the primary key for the new c ext church finances income other
	 * @return the new c ext church finances income other
	 */
	@Override
	public CExtChurchFinancesIncomeOther create(
		CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK) {
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther = new CExtChurchFinancesIncomeOtherImpl();

		cExtChurchFinancesIncomeOther.setNew(true);
		cExtChurchFinancesIncomeOther.setPrimaryKey(cExtChurchFinancesIncomeOtherPK);

		cExtChurchFinancesIncomeOther.setCompanyId(companyProvider.getCompanyId());

		return cExtChurchFinancesIncomeOther;
	}

	/**
	 * Removes the c ext church finances income other with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cExtChurchFinancesIncomeOtherPK the primary key of the c ext church finances income other
	 * @return the c ext church finances income other that was removed
	 * @throws NoSuchCExtChurchFinancesIncomeOtherException if a c ext church finances income other with the primary key could not be found
	 */
	@Override
	public CExtChurchFinancesIncomeOther remove(
		CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK)
		throws NoSuchCExtChurchFinancesIncomeOtherException {
		return remove((Serializable)cExtChurchFinancesIncomeOtherPK);
	}

	/**
	 * Removes the c ext church finances income other with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c ext church finances income other
	 * @return the c ext church finances income other that was removed
	 * @throws NoSuchCExtChurchFinancesIncomeOtherException if a c ext church finances income other with the primary key could not be found
	 */
	@Override
	public CExtChurchFinancesIncomeOther remove(Serializable primaryKey)
		throws NoSuchCExtChurchFinancesIncomeOtherException {
		Session session = null;

		try {
			session = openSession();

			CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther = (CExtChurchFinancesIncomeOther)session.get(CExtChurchFinancesIncomeOtherImpl.class,
					primaryKey);

			if (cExtChurchFinancesIncomeOther == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCExtChurchFinancesIncomeOtherException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cExtChurchFinancesIncomeOther);
		}
		catch (NoSuchCExtChurchFinancesIncomeOtherException nsee) {
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
	protected CExtChurchFinancesIncomeOther removeImpl(
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cExtChurchFinancesIncomeOther)) {
				cExtChurchFinancesIncomeOther = (CExtChurchFinancesIncomeOther)session.get(CExtChurchFinancesIncomeOtherImpl.class,
						cExtChurchFinancesIncomeOther.getPrimaryKeyObj());
			}

			if (cExtChurchFinancesIncomeOther != null) {
				session.delete(cExtChurchFinancesIncomeOther);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cExtChurchFinancesIncomeOther != null) {
			clearCache(cExtChurchFinancesIncomeOther);
		}

		return cExtChurchFinancesIncomeOther;
	}

	@Override
	public CExtChurchFinancesIncomeOther updateImpl(
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther) {
		boolean isNew = cExtChurchFinancesIncomeOther.isNew();

		if (!(cExtChurchFinancesIncomeOther instanceof CExtChurchFinancesIncomeOtherModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cExtChurchFinancesIncomeOther.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(cExtChurchFinancesIncomeOther);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cExtChurchFinancesIncomeOther proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CExtChurchFinancesIncomeOther implementation " +
				cExtChurchFinancesIncomeOther.getClass());
		}

		CExtChurchFinancesIncomeOtherModelImpl cExtChurchFinancesIncomeOtherModelImpl =
			(CExtChurchFinancesIncomeOtherModelImpl)cExtChurchFinancesIncomeOther;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (cExtChurchFinancesIncomeOther.getCreateDate() == null)) {
			if (serviceContext == null) {
				cExtChurchFinancesIncomeOther.setCreateDate(now);
			}
			else {
				cExtChurchFinancesIncomeOther.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!cExtChurchFinancesIncomeOtherModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cExtChurchFinancesIncomeOther.setModifiedDate(now);
			}
			else {
				cExtChurchFinancesIncomeOther.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (cExtChurchFinancesIncomeOther.isNew()) {
				session.save(cExtChurchFinancesIncomeOther);

				cExtChurchFinancesIncomeOther.setNew(false);
			}
			else {
				cExtChurchFinancesIncomeOther = (CExtChurchFinancesIncomeOther)session.merge(cExtChurchFinancesIncomeOther);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CExtChurchFinancesIncomeOtherModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					cExtChurchFinancesIncomeOtherModelImpl.getOrganizationId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((cExtChurchFinancesIncomeOtherModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cExtChurchFinancesIncomeOtherModelImpl.getOriginalOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);

				args = new Object[] {
						cExtChurchFinancesIncomeOtherModelImpl.getOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);
			}
		}

		entityCache.putResult(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtChurchFinancesIncomeOtherImpl.class,
			cExtChurchFinancesIncomeOther.getPrimaryKey(),
			cExtChurchFinancesIncomeOther, false);

		cExtChurchFinancesIncomeOther.resetOriginalValues();

		return cExtChurchFinancesIncomeOther;
	}

	/**
	 * Returns the c ext church finances income other with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext church finances income other
	 * @return the c ext church finances income other
	 * @throws NoSuchCExtChurchFinancesIncomeOtherException if a c ext church finances income other with the primary key could not be found
	 */
	@Override
	public CExtChurchFinancesIncomeOther findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchCExtChurchFinancesIncomeOtherException {
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther = fetchByPrimaryKey(primaryKey);

		if (cExtChurchFinancesIncomeOther == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCExtChurchFinancesIncomeOtherException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cExtChurchFinancesIncomeOther;
	}

	/**
	 * Returns the c ext church finances income other with the primary key or throws a {@link NoSuchCExtChurchFinancesIncomeOtherException} if it could not be found.
	 *
	 * @param cExtChurchFinancesIncomeOtherPK the primary key of the c ext church finances income other
	 * @return the c ext church finances income other
	 * @throws NoSuchCExtChurchFinancesIncomeOtherException if a c ext church finances income other with the primary key could not be found
	 */
	@Override
	public CExtChurchFinancesIncomeOther findByPrimaryKey(
		CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK)
		throws NoSuchCExtChurchFinancesIncomeOtherException {
		return findByPrimaryKey((Serializable)cExtChurchFinancesIncomeOtherPK);
	}

	/**
	 * Returns the c ext church finances income other with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext church finances income other
	 * @return the c ext church finances income other, or <code>null</code> if a c ext church finances income other with the primary key could not be found
	 */
	@Override
	public CExtChurchFinancesIncomeOther fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
				CExtChurchFinancesIncomeOtherImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther = (CExtChurchFinancesIncomeOther)serializable;

		if (cExtChurchFinancesIncomeOther == null) {
			Session session = null;

			try {
				session = openSession();

				cExtChurchFinancesIncomeOther = (CExtChurchFinancesIncomeOther)session.get(CExtChurchFinancesIncomeOtherImpl.class,
						primaryKey);

				if (cExtChurchFinancesIncomeOther != null) {
					cacheResult(cExtChurchFinancesIncomeOther);
				}
				else {
					entityCache.putResult(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
						CExtChurchFinancesIncomeOtherImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CExtChurchFinancesIncomeOtherModelImpl.ENTITY_CACHE_ENABLED,
					CExtChurchFinancesIncomeOtherImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cExtChurchFinancesIncomeOther;
	}

	/**
	 * Returns the c ext church finances income other with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cExtChurchFinancesIncomeOtherPK the primary key of the c ext church finances income other
	 * @return the c ext church finances income other, or <code>null</code> if a c ext church finances income other with the primary key could not be found
	 */
	@Override
	public CExtChurchFinancesIncomeOther fetchByPrimaryKey(
		CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK) {
		return fetchByPrimaryKey((Serializable)cExtChurchFinancesIncomeOtherPK);
	}

	@Override
	public Map<Serializable, CExtChurchFinancesIncomeOther> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CExtChurchFinancesIncomeOther> map = new HashMap<Serializable, CExtChurchFinancesIncomeOther>();

		for (Serializable primaryKey : primaryKeys) {
			CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther = fetchByPrimaryKey(primaryKey);

			if (cExtChurchFinancesIncomeOther != null) {
				map.put(primaryKey, cExtChurchFinancesIncomeOther);
			}
		}

		return map;
	}

	/**
	 * Returns all the c ext church finances income others.
	 *
	 * @return the c ext church finances income others
	 */
	@Override
	public List<CExtChurchFinancesIncomeOther> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext church finances income others.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext church finances income others
	 * @param end the upper bound of the range of c ext church finances income others (not inclusive)
	 * @return the range of c ext church finances income others
	 */
	@Override
	public List<CExtChurchFinancesIncomeOther> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext church finances income others.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext church finances income others
	 * @param end the upper bound of the range of c ext church finances income others (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c ext church finances income others
	 */
	@Override
	public List<CExtChurchFinancesIncomeOther> findAll(int start, int end,
		OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext church finances income others.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext church finances income others
	 * @param end the upper bound of the range of c ext church finances income others (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of c ext church finances income others
	 */
	@Override
	public List<CExtChurchFinancesIncomeOther> findAll(int start, int end,
		OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator,
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

		List<CExtChurchFinancesIncomeOther> list = null;

		if (retrieveFromCache) {
			list = (List<CExtChurchFinancesIncomeOther>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CEXTCHURCHFINANCESINCOMEOTHER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CEXTCHURCHFINANCESINCOMEOTHER;

				if (pagination) {
					sql = sql.concat(CExtChurchFinancesIncomeOtherModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CExtChurchFinancesIncomeOther>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtChurchFinancesIncomeOther>)QueryUtil.list(q,
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
	 * Removes all the c ext church finances income others from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther : findAll()) {
			remove(cExtChurchFinancesIncomeOther);
		}
	}

	/**
	 * Returns the number of c ext church finances income others.
	 *
	 * @return the number of c ext church finances income others
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CEXTCHURCHFINANCESINCOMEOTHER);

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
		return CExtChurchFinancesIncomeOtherModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the c ext church finances income other persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CExtChurchFinancesIncomeOtherImpl.class.getName());
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
	private static final String _SQL_SELECT_CEXTCHURCHFINANCESINCOMEOTHER = "SELECT cExtChurchFinancesIncomeOther FROM CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther";
	private static final String _SQL_SELECT_CEXTCHURCHFINANCESINCOMEOTHER_WHERE = "SELECT cExtChurchFinancesIncomeOther FROM CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther WHERE ";
	private static final String _SQL_COUNT_CEXTCHURCHFINANCESINCOMEOTHER = "SELECT COUNT(cExtChurchFinancesIncomeOther) FROM CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther";
	private static final String _SQL_COUNT_CEXTCHURCHFINANCESINCOMEOTHER_WHERE = "SELECT COUNT(cExtChurchFinancesIncomeOther) FROM CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cExtChurchFinancesIncomeOther.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CExtChurchFinancesIncomeOther exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CExtChurchFinancesIncomeOther exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CExtChurchFinancesIncomeOtherPersistenceImpl.class);
	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(new String[] {
				"organizationId", "cextChurchFinancesIncomeOtherId"
			});
}