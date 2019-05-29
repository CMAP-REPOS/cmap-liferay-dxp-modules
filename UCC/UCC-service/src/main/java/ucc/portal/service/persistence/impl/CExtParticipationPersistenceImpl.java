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

import ucc.portal.exception.NoSuchCExtParticipationException;

import ucc.portal.model.CExtParticipation;
import ucc.portal.model.impl.CExtParticipationImpl;
import ucc.portal.model.impl.CExtParticipationModelImpl;

import ucc.portal.service.persistence.CExtParticipationPK;
import ucc.portal.service.persistence.CExtParticipationPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the c ext participation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtParticipationPersistence
 * @see ucc.portal.service.persistence.CExtParticipationUtil
 * @generated
 */
@ProviderType
public class CExtParticipationPersistenceImpl extends BasePersistenceImpl<CExtParticipation>
	implements CExtParticipationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CExtParticipationUtil} to access the c ext participation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CExtParticipationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationModelImpl.FINDER_CACHE_ENABLED,
			CExtParticipationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationModelImpl.FINDER_CACHE_ENABLED,
			CExtParticipationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationModelImpl.FINDER_CACHE_ENABLED,
			CExtParticipationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrganizationId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationModelImpl.FINDER_CACHE_ENABLED,
			CExtParticipationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrganizationId",
			new String[] { Long.class.getName() },
			CExtParticipationModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			CExtParticipationModelImpl.PPPRIORITY_COLUMN_BITMASK |
			CExtParticipationModelImpl.PPGATHERINGKEY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONID = new FinderPath(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrganizationId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the c ext participations where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching c ext participations
	 */
	@Override
	public List<CExtParticipation> findByOrganizationId(long organizationId) {
		return findByOrganizationId(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext participations where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext participations
	 * @param end the upper bound of the range of c ext participations (not inclusive)
	 * @return the range of matching c ext participations
	 */
	@Override
	public List<CExtParticipation> findByOrganizationId(long organizationId,
		int start, int end) {
		return findByOrganizationId(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext participations where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext participations
	 * @param end the upper bound of the range of c ext participations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching c ext participations
	 */
	@Override
	public List<CExtParticipation> findByOrganizationId(long organizationId,
		int start, int end,
		OrderByComparator<CExtParticipation> orderByComparator) {
		return findByOrganizationId(organizationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext participations where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext participations
	 * @param end the upper bound of the range of c ext participations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching c ext participations
	 */
	@Override
	public List<CExtParticipation> findByOrganizationId(long organizationId,
		int start, int end,
		OrderByComparator<CExtParticipation> orderByComparator,
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

		List<CExtParticipation> list = null;

		if (retrieveFromCache) {
			list = (List<CExtParticipation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CExtParticipation cExtParticipation : list) {
					if ((organizationId != cExtParticipation.getOrganizationId())) {
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

			query.append(_SQL_SELECT_CEXTPARTICIPATION_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CExtParticipationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<CExtParticipation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtParticipation>)QueryUtil.list(q,
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
	 * Returns the first c ext participation in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext participation
	 * @throws NoSuchCExtParticipationException if a matching c ext participation could not be found
	 */
	@Override
	public CExtParticipation findByOrganizationId_First(long organizationId,
		OrderByComparator<CExtParticipation> orderByComparator)
		throws NoSuchCExtParticipationException {
		CExtParticipation cExtParticipation = fetchByOrganizationId_First(organizationId,
				orderByComparator);

		if (cExtParticipation != null) {
			return cExtParticipation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtParticipationException(msg.toString());
	}

	/**
	 * Returns the first c ext participation in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	 */
	@Override
	public CExtParticipation fetchByOrganizationId_First(long organizationId,
		OrderByComparator<CExtParticipation> orderByComparator) {
		List<CExtParticipation> list = findByOrganizationId(organizationId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last c ext participation in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext participation
	 * @throws NoSuchCExtParticipationException if a matching c ext participation could not be found
	 */
	@Override
	public CExtParticipation findByOrganizationId_Last(long organizationId,
		OrderByComparator<CExtParticipation> orderByComparator)
		throws NoSuchCExtParticipationException {
		CExtParticipation cExtParticipation = fetchByOrganizationId_Last(organizationId,
				orderByComparator);

		if (cExtParticipation != null) {
			return cExtParticipation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtParticipationException(msg.toString());
	}

	/**
	 * Returns the last c ext participation in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	 */
	@Override
	public CExtParticipation fetchByOrganizationId_Last(long organizationId,
		OrderByComparator<CExtParticipation> orderByComparator) {
		int count = countByOrganizationId(organizationId);

		if (count == 0) {
			return null;
		}

		List<CExtParticipation> list = findByOrganizationId(organizationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the c ext participations before and after the current c ext participation in the ordered set where organizationId = &#63;.
	 *
	 * @param cExtParticipationPK the primary key of the current c ext participation
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next c ext participation
	 * @throws NoSuchCExtParticipationException if a c ext participation with the primary key could not be found
	 */
	@Override
	public CExtParticipation[] findByOrganizationId_PrevAndNext(
		CExtParticipationPK cExtParticipationPK, long organizationId,
		OrderByComparator<CExtParticipation> orderByComparator)
		throws NoSuchCExtParticipationException {
		CExtParticipation cExtParticipation = findByPrimaryKey(cExtParticipationPK);

		Session session = null;

		try {
			session = openSession();

			CExtParticipation[] array = new CExtParticipationImpl[3];

			array[0] = getByOrganizationId_PrevAndNext(session,
					cExtParticipation, organizationId, orderByComparator, true);

			array[1] = cExtParticipation;

			array[2] = getByOrganizationId_PrevAndNext(session,
					cExtParticipation, organizationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CExtParticipation getByOrganizationId_PrevAndNext(
		Session session, CExtParticipation cExtParticipation,
		long organizationId,
		OrderByComparator<CExtParticipation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CEXTPARTICIPATION_WHERE);

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
			query.append(CExtParticipationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cExtParticipation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CExtParticipation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the c ext participations where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 */
	@Override
	public void removeByOrganizationId(long organizationId) {
		for (CExtParticipation cExtParticipation : findByOrganizationId(
				organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cExtParticipation);
		}
	}

	/**
	 * Returns the number of c ext participations where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching c ext participations
	 */
	@Override
	public int countByOrganizationId(long organizationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONID;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CEXTPARTICIPATION_WHERE);

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

	private static final String _FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2 = "cExtParticipation.id.organizationId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_O_GI = new FinderPath(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationModelImpl.FINDER_CACHE_ENABLED,
			CExtParticipationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByO_GI",
			new String[] { Long.class.getName(), String.class.getName() },
			CExtParticipationModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			CExtParticipationModelImpl.PPGATHERINGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_O_GI = new FinderPath(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByO_GI",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the c ext participation where organizationId = &#63; and ppGatheringId = &#63; or throws a {@link NoSuchCExtParticipationException} if it could not be found.
	 *
	 * @param organizationId the organization ID
	 * @param ppGatheringId the pp gathering ID
	 * @return the matching c ext participation
	 * @throws NoSuchCExtParticipationException if a matching c ext participation could not be found
	 */
	@Override
	public CExtParticipation findByO_GI(long organizationId,
		String ppGatheringId) throws NoSuchCExtParticipationException {
		CExtParticipation cExtParticipation = fetchByO_GI(organizationId,
				ppGatheringId);

		if (cExtParticipation == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("organizationId=");
			msg.append(organizationId);

			msg.append(", ppGatheringId=");
			msg.append(ppGatheringId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchCExtParticipationException(msg.toString());
		}

		return cExtParticipation;
	}

	/**
	 * Returns the c ext participation where organizationId = &#63; and ppGatheringId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param organizationId the organization ID
	 * @param ppGatheringId the pp gathering ID
	 * @return the matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	 */
	@Override
	public CExtParticipation fetchByO_GI(long organizationId,
		String ppGatheringId) {
		return fetchByO_GI(organizationId, ppGatheringId, true);
	}

	/**
	 * Returns the c ext participation where organizationId = &#63; and ppGatheringId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param organizationId the organization ID
	 * @param ppGatheringId the pp gathering ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	 */
	@Override
	public CExtParticipation fetchByO_GI(long organizationId,
		String ppGatheringId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { organizationId, ppGatheringId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_O_GI,
					finderArgs, this);
		}

		if (result instanceof CExtParticipation) {
			CExtParticipation cExtParticipation = (CExtParticipation)result;

			if ((organizationId != cExtParticipation.getOrganizationId()) ||
					!Objects.equals(ppGatheringId,
						cExtParticipation.getPpGatheringId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CEXTPARTICIPATION_WHERE);

			query.append(_FINDER_COLUMN_O_GI_ORGANIZATIONID_2);

			boolean bindPpGatheringId = false;

			if (ppGatheringId == null) {
				query.append(_FINDER_COLUMN_O_GI_PPGATHERINGID_1);
			}
			else if (ppGatheringId.equals("")) {
				query.append(_FINDER_COLUMN_O_GI_PPGATHERINGID_3);
			}
			else {
				bindPpGatheringId = true;

				query.append(_FINDER_COLUMN_O_GI_PPGATHERINGID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (bindPpGatheringId) {
					qPos.add(ppGatheringId);
				}

				List<CExtParticipation> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_O_GI,
						finderArgs, list);
				}
				else {
					CExtParticipation cExtParticipation = list.get(0);

					result = cExtParticipation;

					cacheResult(cExtParticipation);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_O_GI, finderArgs);

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
			return (CExtParticipation)result;
		}
	}

	/**
	 * Removes the c ext participation where organizationId = &#63; and ppGatheringId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 * @param ppGatheringId the pp gathering ID
	 * @return the c ext participation that was removed
	 */
	@Override
	public CExtParticipation removeByO_GI(long organizationId,
		String ppGatheringId) throws NoSuchCExtParticipationException {
		CExtParticipation cExtParticipation = findByO_GI(organizationId,
				ppGatheringId);

		return remove(cExtParticipation);
	}

	/**
	 * Returns the number of c ext participations where organizationId = &#63; and ppGatheringId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param ppGatheringId the pp gathering ID
	 * @return the number of matching c ext participations
	 */
	@Override
	public int countByO_GI(long organizationId, String ppGatheringId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_O_GI;

		Object[] finderArgs = new Object[] { organizationId, ppGatheringId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CEXTPARTICIPATION_WHERE);

			query.append(_FINDER_COLUMN_O_GI_ORGANIZATIONID_2);

			boolean bindPpGatheringId = false;

			if (ppGatheringId == null) {
				query.append(_FINDER_COLUMN_O_GI_PPGATHERINGID_1);
			}
			else if (ppGatheringId.equals("")) {
				query.append(_FINDER_COLUMN_O_GI_PPGATHERINGID_3);
			}
			else {
				bindPpGatheringId = true;

				query.append(_FINDER_COLUMN_O_GI_PPGATHERINGID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (bindPpGatheringId) {
					qPos.add(ppGatheringId);
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

	private static final String _FINDER_COLUMN_O_GI_ORGANIZATIONID_2 = "cExtParticipation.id.organizationId = ? AND ";
	private static final String _FINDER_COLUMN_O_GI_PPGATHERINGID_1 = "cExtParticipation.ppGatheringId IS NULL";
	private static final String _FINDER_COLUMN_O_GI_PPGATHERINGID_2 = "cExtParticipation.ppGatheringId = ?";
	private static final String _FINDER_COLUMN_O_GI_PPGATHERINGID_3 = "(cExtParticipation.ppGatheringId IS NULL OR cExtParticipation.ppGatheringId = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_O_GK = new FinderPath(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationModelImpl.FINDER_CACHE_ENABLED,
			CExtParticipationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByO_GK",
			new String[] { Long.class.getName(), String.class.getName() },
			CExtParticipationModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			CExtParticipationModelImpl.PPGATHERINGKEY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_O_GK = new FinderPath(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByO_GK",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the c ext participation where organizationId = &#63; and ppGatheringKey = &#63; or throws a {@link NoSuchCExtParticipationException} if it could not be found.
	 *
	 * @param organizationId the organization ID
	 * @param ppGatheringKey the pp gathering key
	 * @return the matching c ext participation
	 * @throws NoSuchCExtParticipationException if a matching c ext participation could not be found
	 */
	@Override
	public CExtParticipation findByO_GK(long organizationId,
		String ppGatheringKey) throws NoSuchCExtParticipationException {
		CExtParticipation cExtParticipation = fetchByO_GK(organizationId,
				ppGatheringKey);

		if (cExtParticipation == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("organizationId=");
			msg.append(organizationId);

			msg.append(", ppGatheringKey=");
			msg.append(ppGatheringKey);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchCExtParticipationException(msg.toString());
		}

		return cExtParticipation;
	}

	/**
	 * Returns the c ext participation where organizationId = &#63; and ppGatheringKey = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param organizationId the organization ID
	 * @param ppGatheringKey the pp gathering key
	 * @return the matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	 */
	@Override
	public CExtParticipation fetchByO_GK(long organizationId,
		String ppGatheringKey) {
		return fetchByO_GK(organizationId, ppGatheringKey, true);
	}

	/**
	 * Returns the c ext participation where organizationId = &#63; and ppGatheringKey = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param organizationId the organization ID
	 * @param ppGatheringKey the pp gathering key
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	 */
	@Override
	public CExtParticipation fetchByO_GK(long organizationId,
		String ppGatheringKey, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { organizationId, ppGatheringKey };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_O_GK,
					finderArgs, this);
		}

		if (result instanceof CExtParticipation) {
			CExtParticipation cExtParticipation = (CExtParticipation)result;

			if ((organizationId != cExtParticipation.getOrganizationId()) ||
					!Objects.equals(ppGatheringKey,
						cExtParticipation.getPpGatheringKey())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CEXTPARTICIPATION_WHERE);

			query.append(_FINDER_COLUMN_O_GK_ORGANIZATIONID_2);

			boolean bindPpGatheringKey = false;

			if (ppGatheringKey == null) {
				query.append(_FINDER_COLUMN_O_GK_PPGATHERINGKEY_1);
			}
			else if (ppGatheringKey.equals("")) {
				query.append(_FINDER_COLUMN_O_GK_PPGATHERINGKEY_3);
			}
			else {
				bindPpGatheringKey = true;

				query.append(_FINDER_COLUMN_O_GK_PPGATHERINGKEY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (bindPpGatheringKey) {
					qPos.add(ppGatheringKey);
				}

				List<CExtParticipation> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_O_GK,
						finderArgs, list);
				}
				else {
					CExtParticipation cExtParticipation = list.get(0);

					result = cExtParticipation;

					cacheResult(cExtParticipation);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_O_GK, finderArgs);

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
			return (CExtParticipation)result;
		}
	}

	/**
	 * Removes the c ext participation where organizationId = &#63; and ppGatheringKey = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 * @param ppGatheringKey the pp gathering key
	 * @return the c ext participation that was removed
	 */
	@Override
	public CExtParticipation removeByO_GK(long organizationId,
		String ppGatheringKey) throws NoSuchCExtParticipationException {
		CExtParticipation cExtParticipation = findByO_GK(organizationId,
				ppGatheringKey);

		return remove(cExtParticipation);
	}

	/**
	 * Returns the number of c ext participations where organizationId = &#63; and ppGatheringKey = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param ppGatheringKey the pp gathering key
	 * @return the number of matching c ext participations
	 */
	@Override
	public int countByO_GK(long organizationId, String ppGatheringKey) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_O_GK;

		Object[] finderArgs = new Object[] { organizationId, ppGatheringKey };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CEXTPARTICIPATION_WHERE);

			query.append(_FINDER_COLUMN_O_GK_ORGANIZATIONID_2);

			boolean bindPpGatheringKey = false;

			if (ppGatheringKey == null) {
				query.append(_FINDER_COLUMN_O_GK_PPGATHERINGKEY_1);
			}
			else if (ppGatheringKey.equals("")) {
				query.append(_FINDER_COLUMN_O_GK_PPGATHERINGKEY_3);
			}
			else {
				bindPpGatheringKey = true;

				query.append(_FINDER_COLUMN_O_GK_PPGATHERINGKEY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (bindPpGatheringKey) {
					qPos.add(ppGatheringKey);
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

	private static final String _FINDER_COLUMN_O_GK_ORGANIZATIONID_2 = "cExtParticipation.id.organizationId = ? AND ";
	private static final String _FINDER_COLUMN_O_GK_PPGATHERINGKEY_1 = "cExtParticipation.ppGatheringKey IS NULL";
	private static final String _FINDER_COLUMN_O_GK_PPGATHERINGKEY_2 = "cExtParticipation.ppGatheringKey = ?";
	private static final String _FINDER_COLUMN_O_GK_PPGATHERINGKEY_3 = "(cExtParticipation.ppGatheringKey IS NULL OR cExtParticipation.ppGatheringKey = '')";

	public CExtParticipationPersistenceImpl() {
		setModelClass(CExtParticipation.class);
	}

	/**
	 * Caches the c ext participation in the entity cache if it is enabled.
	 *
	 * @param cExtParticipation the c ext participation
	 */
	@Override
	public void cacheResult(CExtParticipation cExtParticipation) {
		entityCache.putResult(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationImpl.class, cExtParticipation.getPrimaryKey(),
			cExtParticipation);

		finderCache.putResult(FINDER_PATH_FETCH_BY_O_GI,
			new Object[] {
				cExtParticipation.getOrganizationId(),
				cExtParticipation.getPpGatheringId()
			}, cExtParticipation);

		finderCache.putResult(FINDER_PATH_FETCH_BY_O_GK,
			new Object[] {
				cExtParticipation.getOrganizationId(),
				cExtParticipation.getPpGatheringKey()
			}, cExtParticipation);

		cExtParticipation.resetOriginalValues();
	}

	/**
	 * Caches the c ext participations in the entity cache if it is enabled.
	 *
	 * @param cExtParticipations the c ext participations
	 */
	@Override
	public void cacheResult(List<CExtParticipation> cExtParticipations) {
		for (CExtParticipation cExtParticipation : cExtParticipations) {
			if (entityCache.getResult(
						CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
						CExtParticipationImpl.class,
						cExtParticipation.getPrimaryKey()) == null) {
				cacheResult(cExtParticipation);
			}
			else {
				cExtParticipation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c ext participations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CExtParticipationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c ext participation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CExtParticipation cExtParticipation) {
		entityCache.removeResult(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationImpl.class, cExtParticipation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CExtParticipationModelImpl)cExtParticipation,
			true);
	}

	@Override
	public void clearCache(List<CExtParticipation> cExtParticipations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CExtParticipation cExtParticipation : cExtParticipations) {
			entityCache.removeResult(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
				CExtParticipationImpl.class, cExtParticipation.getPrimaryKey());

			clearUniqueFindersCache((CExtParticipationModelImpl)cExtParticipation,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		CExtParticipationModelImpl cExtParticipationModelImpl) {
		Object[] args = new Object[] {
				cExtParticipationModelImpl.getOrganizationId(),
				cExtParticipationModelImpl.getPpGatheringId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_O_GI, args, Long.valueOf(1),
			false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_O_GI, args,
			cExtParticipationModelImpl, false);

		args = new Object[] {
				cExtParticipationModelImpl.getOrganizationId(),
				cExtParticipationModelImpl.getPpGatheringKey()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_O_GK, args, Long.valueOf(1),
			false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_O_GK, args,
			cExtParticipationModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CExtParticipationModelImpl cExtParticipationModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					cExtParticipationModelImpl.getOrganizationId(),
					cExtParticipationModelImpl.getPpGatheringId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_O_GI, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_O_GI, args);
		}

		if ((cExtParticipationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_O_GI.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					cExtParticipationModelImpl.getOriginalOrganizationId(),
					cExtParticipationModelImpl.getOriginalPpGatheringId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_O_GI, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_O_GI, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					cExtParticipationModelImpl.getOrganizationId(),
					cExtParticipationModelImpl.getPpGatheringKey()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_O_GK, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_O_GK, args);
		}

		if ((cExtParticipationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_O_GK.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					cExtParticipationModelImpl.getOriginalOrganizationId(),
					cExtParticipationModelImpl.getOriginalPpGatheringKey()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_O_GK, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_O_GK, args);
		}
	}

	/**
	 * Creates a new c ext participation with the primary key. Does not add the c ext participation to the database.
	 *
	 * @param cExtParticipationPK the primary key for the new c ext participation
	 * @return the new c ext participation
	 */
	@Override
	public CExtParticipation create(CExtParticipationPK cExtParticipationPK) {
		CExtParticipation cExtParticipation = new CExtParticipationImpl();

		cExtParticipation.setNew(true);
		cExtParticipation.setPrimaryKey(cExtParticipationPK);

		cExtParticipation.setCompanyId(companyProvider.getCompanyId());

		return cExtParticipation;
	}

	/**
	 * Removes the c ext participation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cExtParticipationPK the primary key of the c ext participation
	 * @return the c ext participation that was removed
	 * @throws NoSuchCExtParticipationException if a c ext participation with the primary key could not be found
	 */
	@Override
	public CExtParticipation remove(CExtParticipationPK cExtParticipationPK)
		throws NoSuchCExtParticipationException {
		return remove((Serializable)cExtParticipationPK);
	}

	/**
	 * Removes the c ext participation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c ext participation
	 * @return the c ext participation that was removed
	 * @throws NoSuchCExtParticipationException if a c ext participation with the primary key could not be found
	 */
	@Override
	public CExtParticipation remove(Serializable primaryKey)
		throws NoSuchCExtParticipationException {
		Session session = null;

		try {
			session = openSession();

			CExtParticipation cExtParticipation = (CExtParticipation)session.get(CExtParticipationImpl.class,
					primaryKey);

			if (cExtParticipation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCExtParticipationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cExtParticipation);
		}
		catch (NoSuchCExtParticipationException nsee) {
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
	protected CExtParticipation removeImpl(CExtParticipation cExtParticipation) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cExtParticipation)) {
				cExtParticipation = (CExtParticipation)session.get(CExtParticipationImpl.class,
						cExtParticipation.getPrimaryKeyObj());
			}

			if (cExtParticipation != null) {
				session.delete(cExtParticipation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cExtParticipation != null) {
			clearCache(cExtParticipation);
		}

		return cExtParticipation;
	}

	@Override
	public CExtParticipation updateImpl(CExtParticipation cExtParticipation) {
		boolean isNew = cExtParticipation.isNew();

		if (!(cExtParticipation instanceof CExtParticipationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cExtParticipation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(cExtParticipation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cExtParticipation proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CExtParticipation implementation " +
				cExtParticipation.getClass());
		}

		CExtParticipationModelImpl cExtParticipationModelImpl = (CExtParticipationModelImpl)cExtParticipation;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (cExtParticipation.getCreateDate() == null)) {
			if (serviceContext == null) {
				cExtParticipation.setCreateDate(now);
			}
			else {
				cExtParticipation.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!cExtParticipationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cExtParticipation.setModifiedDate(now);
			}
			else {
				cExtParticipation.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (cExtParticipation.isNew()) {
				session.save(cExtParticipation);

				cExtParticipation.setNew(false);
			}
			else {
				cExtParticipation = (CExtParticipation)session.merge(cExtParticipation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CExtParticipationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					cExtParticipationModelImpl.getOrganizationId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((cExtParticipationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cExtParticipationModelImpl.getOriginalOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);

				args = new Object[] {
						cExtParticipationModelImpl.getOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);
			}
		}

		entityCache.putResult(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
			CExtParticipationImpl.class, cExtParticipation.getPrimaryKey(),
			cExtParticipation, false);

		clearUniqueFindersCache(cExtParticipationModelImpl, false);
		cacheUniqueFindersCache(cExtParticipationModelImpl);

		cExtParticipation.resetOriginalValues();

		return cExtParticipation;
	}

	/**
	 * Returns the c ext participation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext participation
	 * @return the c ext participation
	 * @throws NoSuchCExtParticipationException if a c ext participation with the primary key could not be found
	 */
	@Override
	public CExtParticipation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCExtParticipationException {
		CExtParticipation cExtParticipation = fetchByPrimaryKey(primaryKey);

		if (cExtParticipation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCExtParticipationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cExtParticipation;
	}

	/**
	 * Returns the c ext participation with the primary key or throws a {@link NoSuchCExtParticipationException} if it could not be found.
	 *
	 * @param cExtParticipationPK the primary key of the c ext participation
	 * @return the c ext participation
	 * @throws NoSuchCExtParticipationException if a c ext participation with the primary key could not be found
	 */
	@Override
	public CExtParticipation findByPrimaryKey(
		CExtParticipationPK cExtParticipationPK)
		throws NoSuchCExtParticipationException {
		return findByPrimaryKey((Serializable)cExtParticipationPK);
	}

	/**
	 * Returns the c ext participation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext participation
	 * @return the c ext participation, or <code>null</code> if a c ext participation with the primary key could not be found
	 */
	@Override
	public CExtParticipation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
				CExtParticipationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CExtParticipation cExtParticipation = (CExtParticipation)serializable;

		if (cExtParticipation == null) {
			Session session = null;

			try {
				session = openSession();

				cExtParticipation = (CExtParticipation)session.get(CExtParticipationImpl.class,
						primaryKey);

				if (cExtParticipation != null) {
					cacheResult(cExtParticipation);
				}
				else {
					entityCache.putResult(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
						CExtParticipationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CExtParticipationModelImpl.ENTITY_CACHE_ENABLED,
					CExtParticipationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cExtParticipation;
	}

	/**
	 * Returns the c ext participation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cExtParticipationPK the primary key of the c ext participation
	 * @return the c ext participation, or <code>null</code> if a c ext participation with the primary key could not be found
	 */
	@Override
	public CExtParticipation fetchByPrimaryKey(
		CExtParticipationPK cExtParticipationPK) {
		return fetchByPrimaryKey((Serializable)cExtParticipationPK);
	}

	@Override
	public Map<Serializable, CExtParticipation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CExtParticipation> map = new HashMap<Serializable, CExtParticipation>();

		for (Serializable primaryKey : primaryKeys) {
			CExtParticipation cExtParticipation = fetchByPrimaryKey(primaryKey);

			if (cExtParticipation != null) {
				map.put(primaryKey, cExtParticipation);
			}
		}

		return map;
	}

	/**
	 * Returns all the c ext participations.
	 *
	 * @return the c ext participations
	 */
	@Override
	public List<CExtParticipation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext participations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext participations
	 * @param end the upper bound of the range of c ext participations (not inclusive)
	 * @return the range of c ext participations
	 */
	@Override
	public List<CExtParticipation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext participations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext participations
	 * @param end the upper bound of the range of c ext participations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c ext participations
	 */
	@Override
	public List<CExtParticipation> findAll(int start, int end,
		OrderByComparator<CExtParticipation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext participations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext participations
	 * @param end the upper bound of the range of c ext participations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of c ext participations
	 */
	@Override
	public List<CExtParticipation> findAll(int start, int end,
		OrderByComparator<CExtParticipation> orderByComparator,
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

		List<CExtParticipation> list = null;

		if (retrieveFromCache) {
			list = (List<CExtParticipation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CEXTPARTICIPATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CEXTPARTICIPATION;

				if (pagination) {
					sql = sql.concat(CExtParticipationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CExtParticipation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtParticipation>)QueryUtil.list(q,
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
	 * Removes all the c ext participations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CExtParticipation cExtParticipation : findAll()) {
			remove(cExtParticipation);
		}
	}

	/**
	 * Returns the number of c ext participations.
	 *
	 * @return the number of c ext participations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CEXTPARTICIPATION);

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
		return CExtParticipationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the c ext participation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CExtParticipationImpl.class.getName());
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
	private static final String _SQL_SELECT_CEXTPARTICIPATION = "SELECT cExtParticipation FROM CExtParticipation cExtParticipation";
	private static final String _SQL_SELECT_CEXTPARTICIPATION_WHERE = "SELECT cExtParticipation FROM CExtParticipation cExtParticipation WHERE ";
	private static final String _SQL_COUNT_CEXTPARTICIPATION = "SELECT COUNT(cExtParticipation) FROM CExtParticipation cExtParticipation";
	private static final String _SQL_COUNT_CEXTPARTICIPATION_WHERE = "SELECT COUNT(cExtParticipation) FROM CExtParticipation cExtParticipation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cExtParticipation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CExtParticipation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CExtParticipation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CExtParticipationPersistenceImpl.class);
	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(new String[] {
				"organizationId", "cextParticipationId"
			});
}