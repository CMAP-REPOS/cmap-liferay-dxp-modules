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

import ucc.portal.exception.NoSuchCExtParticipationOtherException;

import ucc.portal.model.CExtParticipationOther;
import ucc.portal.model.impl.CExtParticipationOtherImpl;
import ucc.portal.model.impl.CExtParticipationOtherModelImpl;

import ucc.portal.service.persistence.CExtParticipationOtherPK;
import ucc.portal.service.persistence.CExtParticipationOtherPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the c ext participation other service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtParticipationOtherPersistence
 * @see ucc.portal.service.persistence.CExtParticipationOtherUtil
 * @generated
 */
@ProviderType
public class CExtParticipationOtherPersistenceImpl extends BasePersistenceImpl<CExtParticipationOther>
	implements CExtParticipationOtherPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CExtParticipationOtherUtil} to access the c ext participation other persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CExtParticipationOtherImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationOtherModelImpl.FINDER_CACHE_ENABLED,
			CExtParticipationOtherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationOtherModelImpl.FINDER_CACHE_ENABLED,
			CExtParticipationOtherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationOtherModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationOtherModelImpl.FINDER_CACHE_ENABLED,
			CExtParticipationOtherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrganizationId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationOtherModelImpl.FINDER_CACHE_ENABLED,
			CExtParticipationOtherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrganizationId",
			new String[] { Long.class.getName() },
			CExtParticipationOtherModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			CExtParticipationOtherModelImpl.PPPRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONID = new FinderPath(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationOtherModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrganizationId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the c ext participation others where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching c ext participation others
	 */
	@Override
	public List<CExtParticipationOther> findByOrganizationId(
		long organizationId) {
		return findByOrganizationId(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext participation others where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext participation others
	 * @param end the upper bound of the range of c ext participation others (not inclusive)
	 * @return the range of matching c ext participation others
	 */
	@Override
	public List<CExtParticipationOther> findByOrganizationId(
		long organizationId, int start, int end) {
		return findByOrganizationId(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext participation others where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext participation others
	 * @param end the upper bound of the range of c ext participation others (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching c ext participation others
	 */
	@Override
	public List<CExtParticipationOther> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtParticipationOther> orderByComparator) {
		return findByOrganizationId(organizationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext participation others where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext participation others
	 * @param end the upper bound of the range of c ext participation others (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching c ext participation others
	 */
	@Override
	public List<CExtParticipationOther> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtParticipationOther> orderByComparator,
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

		List<CExtParticipationOther> list = null;

		if (retrieveFromCache) {
			list = (List<CExtParticipationOther>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CExtParticipationOther cExtParticipationOther : list) {
					if ((organizationId != cExtParticipationOther.getOrganizationId())) {
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

			query.append(_SQL_SELECT_CEXTPARTICIPATIONOTHER_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CExtParticipationOtherModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<CExtParticipationOther>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtParticipationOther>)QueryUtil.list(q,
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
	 * Returns the first c ext participation other in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext participation other
	 * @throws NoSuchCExtParticipationOtherException if a matching c ext participation other could not be found
	 */
	@Override
	public CExtParticipationOther findByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtParticipationOther> orderByComparator)
		throws NoSuchCExtParticipationOtherException {
		CExtParticipationOther cExtParticipationOther = fetchByOrganizationId_First(organizationId,
				orderByComparator);

		if (cExtParticipationOther != null) {
			return cExtParticipationOther;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtParticipationOtherException(msg.toString());
	}

	/**
	 * Returns the first c ext participation other in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext participation other, or <code>null</code> if a matching c ext participation other could not be found
	 */
	@Override
	public CExtParticipationOther fetchByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtParticipationOther> orderByComparator) {
		List<CExtParticipationOther> list = findByOrganizationId(organizationId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last c ext participation other in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext participation other
	 * @throws NoSuchCExtParticipationOtherException if a matching c ext participation other could not be found
	 */
	@Override
	public CExtParticipationOther findByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtParticipationOther> orderByComparator)
		throws NoSuchCExtParticipationOtherException {
		CExtParticipationOther cExtParticipationOther = fetchByOrganizationId_Last(organizationId,
				orderByComparator);

		if (cExtParticipationOther != null) {
			return cExtParticipationOther;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtParticipationOtherException(msg.toString());
	}

	/**
	 * Returns the last c ext participation other in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext participation other, or <code>null</code> if a matching c ext participation other could not be found
	 */
	@Override
	public CExtParticipationOther fetchByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtParticipationOther> orderByComparator) {
		int count = countByOrganizationId(organizationId);

		if (count == 0) {
			return null;
		}

		List<CExtParticipationOther> list = findByOrganizationId(organizationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the c ext participation others before and after the current c ext participation other in the ordered set where organizationId = &#63;.
	 *
	 * @param cExtParticipationOtherPK the primary key of the current c ext participation other
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next c ext participation other
	 * @throws NoSuchCExtParticipationOtherException if a c ext participation other with the primary key could not be found
	 */
	@Override
	public CExtParticipationOther[] findByOrganizationId_PrevAndNext(
		CExtParticipationOtherPK cExtParticipationOtherPK, long organizationId,
		OrderByComparator<CExtParticipationOther> orderByComparator)
		throws NoSuchCExtParticipationOtherException {
		CExtParticipationOther cExtParticipationOther = findByPrimaryKey(cExtParticipationOtherPK);

		Session session = null;

		try {
			session = openSession();

			CExtParticipationOther[] array = new CExtParticipationOtherImpl[3];

			array[0] = getByOrganizationId_PrevAndNext(session,
					cExtParticipationOther, organizationId, orderByComparator,
					true);

			array[1] = cExtParticipationOther;

			array[2] = getByOrganizationId_PrevAndNext(session,
					cExtParticipationOther, organizationId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CExtParticipationOther getByOrganizationId_PrevAndNext(
		Session session, CExtParticipationOther cExtParticipationOther,
		long organizationId,
		OrderByComparator<CExtParticipationOther> orderByComparator,
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

		query.append(_SQL_SELECT_CEXTPARTICIPATIONOTHER_WHERE);

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
			query.append(CExtParticipationOtherModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cExtParticipationOther);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CExtParticipationOther> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the c ext participation others where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 */
	@Override
	public void removeByOrganizationId(long organizationId) {
		for (CExtParticipationOther cExtParticipationOther : findByOrganizationId(
				organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cExtParticipationOther);
		}
	}

	/**
	 * Returns the number of c ext participation others where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching c ext participation others
	 */
	@Override
	public int countByOrganizationId(long organizationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONID;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CEXTPARTICIPATIONOTHER_WHERE);

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

	private static final String _FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2 = "cExtParticipationOther.id.organizationId = ?";

	public CExtParticipationOtherPersistenceImpl() {
		setModelClass(CExtParticipationOther.class);
	}

	/**
	 * Caches the c ext participation other in the entity cache if it is enabled.
	 *
	 * @param cExtParticipationOther the c ext participation other
	 */
	@Override
	public void cacheResult(CExtParticipationOther cExtParticipationOther) {
		entityCache.putResult(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationOtherImpl.class,
			cExtParticipationOther.getPrimaryKey(), cExtParticipationOther);

		cExtParticipationOther.resetOriginalValues();
	}

	/**
	 * Caches the c ext participation others in the entity cache if it is enabled.
	 *
	 * @param cExtParticipationOthers the c ext participation others
	 */
	@Override
	public void cacheResult(
		List<CExtParticipationOther> cExtParticipationOthers) {
		for (CExtParticipationOther cExtParticipationOther : cExtParticipationOthers) {
			if (entityCache.getResult(
						CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
						CExtParticipationOtherImpl.class,
						cExtParticipationOther.getPrimaryKey()) == null) {
				cacheResult(cExtParticipationOther);
			}
			else {
				cExtParticipationOther.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c ext participation others.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CExtParticipationOtherImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c ext participation other.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CExtParticipationOther cExtParticipationOther) {
		entityCache.removeResult(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationOtherImpl.class,
			cExtParticipationOther.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CExtParticipationOther> cExtParticipationOthers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CExtParticipationOther cExtParticipationOther : cExtParticipationOthers) {
			entityCache.removeResult(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
				CExtParticipationOtherImpl.class,
				cExtParticipationOther.getPrimaryKey());
		}
	}

	/**
	 * Creates a new c ext participation other with the primary key. Does not add the c ext participation other to the database.
	 *
	 * @param cExtParticipationOtherPK the primary key for the new c ext participation other
	 * @return the new c ext participation other
	 */
	@Override
	public CExtParticipationOther create(
		CExtParticipationOtherPK cExtParticipationOtherPK) {
		CExtParticipationOther cExtParticipationOther = new CExtParticipationOtherImpl();

		cExtParticipationOther.setNew(true);
		cExtParticipationOther.setPrimaryKey(cExtParticipationOtherPK);

		cExtParticipationOther.setCompanyId(companyProvider.getCompanyId());

		return cExtParticipationOther;
	}

	/**
	 * Removes the c ext participation other with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cExtParticipationOtherPK the primary key of the c ext participation other
	 * @return the c ext participation other that was removed
	 * @throws NoSuchCExtParticipationOtherException if a c ext participation other with the primary key could not be found
	 */
	@Override
	public CExtParticipationOther remove(
		CExtParticipationOtherPK cExtParticipationOtherPK)
		throws NoSuchCExtParticipationOtherException {
		return remove((Serializable)cExtParticipationOtherPK);
	}

	/**
	 * Removes the c ext participation other with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c ext participation other
	 * @return the c ext participation other that was removed
	 * @throws NoSuchCExtParticipationOtherException if a c ext participation other with the primary key could not be found
	 */
	@Override
	public CExtParticipationOther remove(Serializable primaryKey)
		throws NoSuchCExtParticipationOtherException {
		Session session = null;

		try {
			session = openSession();

			CExtParticipationOther cExtParticipationOther = (CExtParticipationOther)session.get(CExtParticipationOtherImpl.class,
					primaryKey);

			if (cExtParticipationOther == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCExtParticipationOtherException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cExtParticipationOther);
		}
		catch (NoSuchCExtParticipationOtherException nsee) {
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
	protected CExtParticipationOther removeImpl(
		CExtParticipationOther cExtParticipationOther) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cExtParticipationOther)) {
				cExtParticipationOther = (CExtParticipationOther)session.get(CExtParticipationOtherImpl.class,
						cExtParticipationOther.getPrimaryKeyObj());
			}

			if (cExtParticipationOther != null) {
				session.delete(cExtParticipationOther);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cExtParticipationOther != null) {
			clearCache(cExtParticipationOther);
		}

		return cExtParticipationOther;
	}

	@Override
	public CExtParticipationOther updateImpl(
		CExtParticipationOther cExtParticipationOther) {
		boolean isNew = cExtParticipationOther.isNew();

		if (!(cExtParticipationOther instanceof CExtParticipationOtherModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cExtParticipationOther.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(cExtParticipationOther);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cExtParticipationOther proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CExtParticipationOther implementation " +
				cExtParticipationOther.getClass());
		}

		CExtParticipationOtherModelImpl cExtParticipationOtherModelImpl = (CExtParticipationOtherModelImpl)cExtParticipationOther;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (cExtParticipationOther.getCreateDate() == null)) {
			if (serviceContext == null) {
				cExtParticipationOther.setCreateDate(now);
			}
			else {
				cExtParticipationOther.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!cExtParticipationOtherModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cExtParticipationOther.setModifiedDate(now);
			}
			else {
				cExtParticipationOther.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (cExtParticipationOther.isNew()) {
				session.save(cExtParticipationOther);

				cExtParticipationOther.setNew(false);
			}
			else {
				cExtParticipationOther = (CExtParticipationOther)session.merge(cExtParticipationOther);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CExtParticipationOtherModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					cExtParticipationOtherModelImpl.getOrganizationId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((cExtParticipationOtherModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cExtParticipationOtherModelImpl.getOriginalOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);

				args = new Object[] {
						cExtParticipationOtherModelImpl.getOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);
			}
		}

		entityCache.putResult(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationOtherImpl.class,
			cExtParticipationOther.getPrimaryKey(), cExtParticipationOther,
			false);

		cExtParticipationOther.resetOriginalValues();

		return cExtParticipationOther;
	}

	/**
	 * Returns the c ext participation other with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext participation other
	 * @return the c ext participation other
	 * @throws NoSuchCExtParticipationOtherException if a c ext participation other with the primary key could not be found
	 */
	@Override
	public CExtParticipationOther findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCExtParticipationOtherException {
		CExtParticipationOther cExtParticipationOther = fetchByPrimaryKey(primaryKey);

		if (cExtParticipationOther == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCExtParticipationOtherException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cExtParticipationOther;
	}

	/**
	 * Returns the c ext participation other with the primary key or throws a {@link NoSuchCExtParticipationOtherException} if it could not be found.
	 *
	 * @param cExtParticipationOtherPK the primary key of the c ext participation other
	 * @return the c ext participation other
	 * @throws NoSuchCExtParticipationOtherException if a c ext participation other with the primary key could not be found
	 */
	@Override
	public CExtParticipationOther findByPrimaryKey(
		CExtParticipationOtherPK cExtParticipationOtherPK)
		throws NoSuchCExtParticipationOtherException {
		return findByPrimaryKey((Serializable)cExtParticipationOtherPK);
	}

	/**
	 * Returns the c ext participation other with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext participation other
	 * @return the c ext participation other, or <code>null</code> if a c ext participation other with the primary key could not be found
	 */
	@Override
	public CExtParticipationOther fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
				CExtParticipationOtherImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CExtParticipationOther cExtParticipationOther = (CExtParticipationOther)serializable;

		if (cExtParticipationOther == null) {
			Session session = null;

			try {
				session = openSession();

				cExtParticipationOther = (CExtParticipationOther)session.get(CExtParticipationOtherImpl.class,
						primaryKey);

				if (cExtParticipationOther != null) {
					cacheResult(cExtParticipationOther);
				}
				else {
					entityCache.putResult(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
						CExtParticipationOtherImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CExtParticipationOtherModelImpl.ENTITY_CACHE_ENABLED,
					CExtParticipationOtherImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cExtParticipationOther;
	}

	/**
	 * Returns the c ext participation other with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cExtParticipationOtherPK the primary key of the c ext participation other
	 * @return the c ext participation other, or <code>null</code> if a c ext participation other with the primary key could not be found
	 */
	@Override
	public CExtParticipationOther fetchByPrimaryKey(
		CExtParticipationOtherPK cExtParticipationOtherPK) {
		return fetchByPrimaryKey((Serializable)cExtParticipationOtherPK);
	}

	@Override
	public Map<Serializable, CExtParticipationOther> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CExtParticipationOther> map = new HashMap<Serializable, CExtParticipationOther>();

		for (Serializable primaryKey : primaryKeys) {
			CExtParticipationOther cExtParticipationOther = fetchByPrimaryKey(primaryKey);

			if (cExtParticipationOther != null) {
				map.put(primaryKey, cExtParticipationOther);
			}
		}

		return map;
	}

	/**
	 * Returns all the c ext participation others.
	 *
	 * @return the c ext participation others
	 */
	@Override
	public List<CExtParticipationOther> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext participation others.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext participation others
	 * @param end the upper bound of the range of c ext participation others (not inclusive)
	 * @return the range of c ext participation others
	 */
	@Override
	public List<CExtParticipationOther> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext participation others.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext participation others
	 * @param end the upper bound of the range of c ext participation others (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c ext participation others
	 */
	@Override
	public List<CExtParticipationOther> findAll(int start, int end,
		OrderByComparator<CExtParticipationOther> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext participation others.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext participation others
	 * @param end the upper bound of the range of c ext participation others (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of c ext participation others
	 */
	@Override
	public List<CExtParticipationOther> findAll(int start, int end,
		OrderByComparator<CExtParticipationOther> orderByComparator,
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

		List<CExtParticipationOther> list = null;

		if (retrieveFromCache) {
			list = (List<CExtParticipationOther>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CEXTPARTICIPATIONOTHER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CEXTPARTICIPATIONOTHER;

				if (pagination) {
					sql = sql.concat(CExtParticipationOtherModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CExtParticipationOther>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtParticipationOther>)QueryUtil.list(q,
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
	 * Removes all the c ext participation others from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CExtParticipationOther cExtParticipationOther : findAll()) {
			remove(cExtParticipationOther);
		}
	}

	/**
	 * Returns the number of c ext participation others.
	 *
	 * @return the number of c ext participation others
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CEXTPARTICIPATIONOTHER);

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
		return CExtParticipationOtherModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the c ext participation other persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CExtParticipationOtherImpl.class.getName());
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
	private static final String _SQL_SELECT_CEXTPARTICIPATIONOTHER = "SELECT cExtParticipationOther FROM CExtParticipationOther cExtParticipationOther";
	private static final String _SQL_SELECT_CEXTPARTICIPATIONOTHER_WHERE = "SELECT cExtParticipationOther FROM CExtParticipationOther cExtParticipationOther WHERE ";
	private static final String _SQL_COUNT_CEXTPARTICIPATIONOTHER = "SELECT COUNT(cExtParticipationOther) FROM CExtParticipationOther cExtParticipationOther";
	private static final String _SQL_COUNT_CEXTPARTICIPATIONOTHER_WHERE = "SELECT COUNT(cExtParticipationOther) FROM CExtParticipationOther cExtParticipationOther WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cExtParticipationOther.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CExtParticipationOther exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CExtParticipationOther exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CExtParticipationOtherPersistenceImpl.class);
	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(new String[] {
				"organizationId", "cextParticipationOtherId"
			});
}