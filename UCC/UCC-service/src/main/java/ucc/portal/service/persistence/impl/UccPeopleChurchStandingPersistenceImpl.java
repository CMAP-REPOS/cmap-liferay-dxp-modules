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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ucc.portal.exception.NoSuchUccPeopleChurchStandingException;

import ucc.portal.model.UccPeopleChurchStanding;
import ucc.portal.model.impl.UccPeopleChurchStandingImpl;
import ucc.portal.model.impl.UccPeopleChurchStandingModelImpl;

import ucc.portal.service.persistence.UccPeopleChurchStandingPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the ucc people church standing service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccPeopleChurchStandingPersistence
 * @see ucc.portal.service.persistence.UccPeopleChurchStandingUtil
 * @generated
 */
@ProviderType
public class UccPeopleChurchStandingPersistenceImpl extends BasePersistenceImpl<UccPeopleChurchStanding>
	implements UccPeopleChurchStandingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UccPeopleChurchStandingUtil} to access the ucc people church standing persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UccPeopleChurchStandingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleChurchStandingModelImpl.FINDER_CACHE_ENABLED,
			UccPeopleChurchStandingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleChurchStandingModelImpl.FINDER_CACHE_ENABLED,
			UccPeopleChurchStandingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleChurchStandingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PEOPLEID = new FinderPath(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleChurchStandingModelImpl.FINDER_CACHE_ENABLED,
			UccPeopleChurchStandingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPeopleId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PEOPLEID =
		new FinderPath(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleChurchStandingModelImpl.FINDER_CACHE_ENABLED,
			UccPeopleChurchStandingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPeopleId",
			new String[] { Integer.class.getName() },
			UccPeopleChurchStandingModelImpl.UCCPEOPLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PEOPLEID = new FinderPath(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleChurchStandingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPeopleId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the ucc people church standings where uccPeopleId = &#63;.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @return the matching ucc people church standings
	 */
	@Override
	public List<UccPeopleChurchStanding> findByPeopleId(int uccPeopleId) {
		return findByPeopleId(uccPeopleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ucc people church standings where uccPeopleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param start the lower bound of the range of ucc people church standings
	 * @param end the upper bound of the range of ucc people church standings (not inclusive)
	 * @return the range of matching ucc people church standings
	 */
	@Override
	public List<UccPeopleChurchStanding> findByPeopleId(int uccPeopleId,
		int start, int end) {
		return findByPeopleId(uccPeopleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ucc people church standings where uccPeopleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param start the lower bound of the range of ucc people church standings
	 * @param end the upper bound of the range of ucc people church standings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ucc people church standings
	 */
	@Override
	public List<UccPeopleChurchStanding> findByPeopleId(int uccPeopleId,
		int start, int end,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator) {
		return findByPeopleId(uccPeopleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ucc people church standings where uccPeopleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param start the lower bound of the range of ucc people church standings
	 * @param end the upper bound of the range of ucc people church standings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ucc people church standings
	 */
	@Override
	public List<UccPeopleChurchStanding> findByPeopleId(int uccPeopleId,
		int start, int end,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PEOPLEID;
			finderArgs = new Object[] { uccPeopleId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PEOPLEID;
			finderArgs = new Object[] { uccPeopleId, start, end, orderByComparator };
		}

		List<UccPeopleChurchStanding> list = null;

		if (retrieveFromCache) {
			list = (List<UccPeopleChurchStanding>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UccPeopleChurchStanding uccPeopleChurchStanding : list) {
					if ((uccPeopleId != uccPeopleChurchStanding.getUccPeopleId())) {
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

			query.append(_SQL_SELECT_UCCPEOPLECHURCHSTANDING_WHERE);

			query.append(_FINDER_COLUMN_PEOPLEID_UCCPEOPLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UccPeopleChurchStandingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(uccPeopleId);

				if (!pagination) {
					list = (List<UccPeopleChurchStanding>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UccPeopleChurchStanding>)QueryUtil.list(q,
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
	 * Returns the first ucc people church standing in the ordered set where uccPeopleId = &#63;.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ucc people church standing
	 * @throws NoSuchUccPeopleChurchStandingException if a matching ucc people church standing could not be found
	 */
	@Override
	public UccPeopleChurchStanding findByPeopleId_First(int uccPeopleId,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator)
		throws NoSuchUccPeopleChurchStandingException {
		UccPeopleChurchStanding uccPeopleChurchStanding = fetchByPeopleId_First(uccPeopleId,
				orderByComparator);

		if (uccPeopleChurchStanding != null) {
			return uccPeopleChurchStanding;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uccPeopleId=");
		msg.append(uccPeopleId);

		msg.append("}");

		throw new NoSuchUccPeopleChurchStandingException(msg.toString());
	}

	/**
	 * Returns the first ucc people church standing in the ordered set where uccPeopleId = &#63;.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ucc people church standing, or <code>null</code> if a matching ucc people church standing could not be found
	 */
	@Override
	public UccPeopleChurchStanding fetchByPeopleId_First(int uccPeopleId,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator) {
		List<UccPeopleChurchStanding> list = findByPeopleId(uccPeopleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ucc people church standing in the ordered set where uccPeopleId = &#63;.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ucc people church standing
	 * @throws NoSuchUccPeopleChurchStandingException if a matching ucc people church standing could not be found
	 */
	@Override
	public UccPeopleChurchStanding findByPeopleId_Last(int uccPeopleId,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator)
		throws NoSuchUccPeopleChurchStandingException {
		UccPeopleChurchStanding uccPeopleChurchStanding = fetchByPeopleId_Last(uccPeopleId,
				orderByComparator);

		if (uccPeopleChurchStanding != null) {
			return uccPeopleChurchStanding;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uccPeopleId=");
		msg.append(uccPeopleId);

		msg.append("}");

		throw new NoSuchUccPeopleChurchStandingException(msg.toString());
	}

	/**
	 * Returns the last ucc people church standing in the ordered set where uccPeopleId = &#63;.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ucc people church standing, or <code>null</code> if a matching ucc people church standing could not be found
	 */
	@Override
	public UccPeopleChurchStanding fetchByPeopleId_Last(int uccPeopleId,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator) {
		int count = countByPeopleId(uccPeopleId);

		if (count == 0) {
			return null;
		}

		List<UccPeopleChurchStanding> list = findByPeopleId(uccPeopleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ucc people church standings before and after the current ucc people church standing in the ordered set where uccPeopleId = &#63;.
	 *
	 * @param uccPeopleChurchStandingId the primary key of the current ucc people church standing
	 * @param uccPeopleId the ucc people ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ucc people church standing
	 * @throws NoSuchUccPeopleChurchStandingException if a ucc people church standing with the primary key could not be found
	 */
	@Override
	public UccPeopleChurchStanding[] findByPeopleId_PrevAndNext(
		int uccPeopleChurchStandingId, int uccPeopleId,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator)
		throws NoSuchUccPeopleChurchStandingException {
		UccPeopleChurchStanding uccPeopleChurchStanding = findByPrimaryKey(uccPeopleChurchStandingId);

		Session session = null;

		try {
			session = openSession();

			UccPeopleChurchStanding[] array = new UccPeopleChurchStandingImpl[3];

			array[0] = getByPeopleId_PrevAndNext(session,
					uccPeopleChurchStanding, uccPeopleId, orderByComparator,
					true);

			array[1] = uccPeopleChurchStanding;

			array[2] = getByPeopleId_PrevAndNext(session,
					uccPeopleChurchStanding, uccPeopleId, orderByComparator,
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

	protected UccPeopleChurchStanding getByPeopleId_PrevAndNext(
		Session session, UccPeopleChurchStanding uccPeopleChurchStanding,
		int uccPeopleId,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator,
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

		query.append(_SQL_SELECT_UCCPEOPLECHURCHSTANDING_WHERE);

		query.append(_FINDER_COLUMN_PEOPLEID_UCCPEOPLEID_2);

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
			query.append(UccPeopleChurchStandingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(uccPeopleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(uccPeopleChurchStanding);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UccPeopleChurchStanding> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ucc people church standings where uccPeopleId = &#63; from the database.
	 *
	 * @param uccPeopleId the ucc people ID
	 */
	@Override
	public void removeByPeopleId(int uccPeopleId) {
		for (UccPeopleChurchStanding uccPeopleChurchStanding : findByPeopleId(
				uccPeopleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(uccPeopleChurchStanding);
		}
	}

	/**
	 * Returns the number of ucc people church standings where uccPeopleId = &#63;.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @return the number of matching ucc people church standings
	 */
	@Override
	public int countByPeopleId(int uccPeopleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PEOPLEID;

		Object[] finderArgs = new Object[] { uccPeopleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_UCCPEOPLECHURCHSTANDING_WHERE);

			query.append(_FINDER_COLUMN_PEOPLEID_UCCPEOPLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(uccPeopleId);

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

	private static final String _FINDER_COLUMN_PEOPLEID_UCCPEOPLEID_2 = "uccPeopleChurchStanding.uccPeopleId = ?";

	public UccPeopleChurchStandingPersistenceImpl() {
		setModelClass(UccPeopleChurchStanding.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uccPeopleChurchStandingId",
				"peopleChurchStandingId");
			dbColumnNames.put("uccPeopleId", "peopleId");
			dbColumnNames.put("uccConferenceId", "conferenceId");
			dbColumnNames.put("uccAssociationId", "associationId");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the ucc people church standing in the entity cache if it is enabled.
	 *
	 * @param uccPeopleChurchStanding the ucc people church standing
	 */
	@Override
	public void cacheResult(UccPeopleChurchStanding uccPeopleChurchStanding) {
		entityCache.putResult(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleChurchStandingImpl.class,
			uccPeopleChurchStanding.getPrimaryKey(), uccPeopleChurchStanding);

		uccPeopleChurchStanding.resetOriginalValues();
	}

	/**
	 * Caches the ucc people church standings in the entity cache if it is enabled.
	 *
	 * @param uccPeopleChurchStandings the ucc people church standings
	 */
	@Override
	public void cacheResult(
		List<UccPeopleChurchStanding> uccPeopleChurchStandings) {
		for (UccPeopleChurchStanding uccPeopleChurchStanding : uccPeopleChurchStandings) {
			if (entityCache.getResult(
						UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
						UccPeopleChurchStandingImpl.class,
						uccPeopleChurchStanding.getPrimaryKey()) == null) {
				cacheResult(uccPeopleChurchStanding);
			}
			else {
				uccPeopleChurchStanding.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ucc people church standings.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UccPeopleChurchStandingImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ucc people church standing.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UccPeopleChurchStanding uccPeopleChurchStanding) {
		entityCache.removeResult(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleChurchStandingImpl.class,
			uccPeopleChurchStanding.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<UccPeopleChurchStanding> uccPeopleChurchStandings) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UccPeopleChurchStanding uccPeopleChurchStanding : uccPeopleChurchStandings) {
			entityCache.removeResult(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
				UccPeopleChurchStandingImpl.class,
				uccPeopleChurchStanding.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ucc people church standing with the primary key. Does not add the ucc people church standing to the database.
	 *
	 * @param uccPeopleChurchStandingId the primary key for the new ucc people church standing
	 * @return the new ucc people church standing
	 */
	@Override
	public UccPeopleChurchStanding create(int uccPeopleChurchStandingId) {
		UccPeopleChurchStanding uccPeopleChurchStanding = new UccPeopleChurchStandingImpl();

		uccPeopleChurchStanding.setNew(true);
		uccPeopleChurchStanding.setPrimaryKey(uccPeopleChurchStandingId);

		return uccPeopleChurchStanding;
	}

	/**
	 * Removes the ucc people church standing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param uccPeopleChurchStandingId the primary key of the ucc people church standing
	 * @return the ucc people church standing that was removed
	 * @throws NoSuchUccPeopleChurchStandingException if a ucc people church standing with the primary key could not be found
	 */
	@Override
	public UccPeopleChurchStanding remove(int uccPeopleChurchStandingId)
		throws NoSuchUccPeopleChurchStandingException {
		return remove((Serializable)uccPeopleChurchStandingId);
	}

	/**
	 * Removes the ucc people church standing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ucc people church standing
	 * @return the ucc people church standing that was removed
	 * @throws NoSuchUccPeopleChurchStandingException if a ucc people church standing with the primary key could not be found
	 */
	@Override
	public UccPeopleChurchStanding remove(Serializable primaryKey)
		throws NoSuchUccPeopleChurchStandingException {
		Session session = null;

		try {
			session = openSession();

			UccPeopleChurchStanding uccPeopleChurchStanding = (UccPeopleChurchStanding)session.get(UccPeopleChurchStandingImpl.class,
					primaryKey);

			if (uccPeopleChurchStanding == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUccPeopleChurchStandingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(uccPeopleChurchStanding);
		}
		catch (NoSuchUccPeopleChurchStandingException nsee) {
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
	protected UccPeopleChurchStanding removeImpl(
		UccPeopleChurchStanding uccPeopleChurchStanding) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(uccPeopleChurchStanding)) {
				uccPeopleChurchStanding = (UccPeopleChurchStanding)session.get(UccPeopleChurchStandingImpl.class,
						uccPeopleChurchStanding.getPrimaryKeyObj());
			}

			if (uccPeopleChurchStanding != null) {
				session.delete(uccPeopleChurchStanding);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (uccPeopleChurchStanding != null) {
			clearCache(uccPeopleChurchStanding);
		}

		return uccPeopleChurchStanding;
	}

	@Override
	public UccPeopleChurchStanding updateImpl(
		UccPeopleChurchStanding uccPeopleChurchStanding) {
		boolean isNew = uccPeopleChurchStanding.isNew();

		if (!(uccPeopleChurchStanding instanceof UccPeopleChurchStandingModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(uccPeopleChurchStanding.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(uccPeopleChurchStanding);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in uccPeopleChurchStanding proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom UccPeopleChurchStanding implementation " +
				uccPeopleChurchStanding.getClass());
		}

		UccPeopleChurchStandingModelImpl uccPeopleChurchStandingModelImpl = (UccPeopleChurchStandingModelImpl)uccPeopleChurchStanding;

		Session session = null;

		try {
			session = openSession();

			if (uccPeopleChurchStanding.isNew()) {
				session.save(uccPeopleChurchStanding);

				uccPeopleChurchStanding.setNew(false);
			}
			else {
				uccPeopleChurchStanding = (UccPeopleChurchStanding)session.merge(uccPeopleChurchStanding);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!UccPeopleChurchStandingModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					uccPeopleChurchStandingModelImpl.getUccPeopleId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_PEOPLEID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PEOPLEID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((uccPeopleChurchStandingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PEOPLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						uccPeopleChurchStandingModelImpl.getOriginalUccPeopleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PEOPLEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PEOPLEID,
					args);

				args = new Object[] {
						uccPeopleChurchStandingModelImpl.getUccPeopleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PEOPLEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PEOPLEID,
					args);
			}
		}

		entityCache.putResult(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleChurchStandingImpl.class,
			uccPeopleChurchStanding.getPrimaryKey(), uccPeopleChurchStanding,
			false);

		uccPeopleChurchStanding.resetOriginalValues();

		return uccPeopleChurchStanding;
	}

	/**
	 * Returns the ucc people church standing with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ucc people church standing
	 * @return the ucc people church standing
	 * @throws NoSuchUccPeopleChurchStandingException if a ucc people church standing with the primary key could not be found
	 */
	@Override
	public UccPeopleChurchStanding findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUccPeopleChurchStandingException {
		UccPeopleChurchStanding uccPeopleChurchStanding = fetchByPrimaryKey(primaryKey);

		if (uccPeopleChurchStanding == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUccPeopleChurchStandingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return uccPeopleChurchStanding;
	}

	/**
	 * Returns the ucc people church standing with the primary key or throws a {@link NoSuchUccPeopleChurchStandingException} if it could not be found.
	 *
	 * @param uccPeopleChurchStandingId the primary key of the ucc people church standing
	 * @return the ucc people church standing
	 * @throws NoSuchUccPeopleChurchStandingException if a ucc people church standing with the primary key could not be found
	 */
	@Override
	public UccPeopleChurchStanding findByPrimaryKey(
		int uccPeopleChurchStandingId)
		throws NoSuchUccPeopleChurchStandingException {
		return findByPrimaryKey((Serializable)uccPeopleChurchStandingId);
	}

	/**
	 * Returns the ucc people church standing with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ucc people church standing
	 * @return the ucc people church standing, or <code>null</code> if a ucc people church standing with the primary key could not be found
	 */
	@Override
	public UccPeopleChurchStanding fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
				UccPeopleChurchStandingImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		UccPeopleChurchStanding uccPeopleChurchStanding = (UccPeopleChurchStanding)serializable;

		if (uccPeopleChurchStanding == null) {
			Session session = null;

			try {
				session = openSession();

				uccPeopleChurchStanding = (UccPeopleChurchStanding)session.get(UccPeopleChurchStandingImpl.class,
						primaryKey);

				if (uccPeopleChurchStanding != null) {
					cacheResult(uccPeopleChurchStanding);
				}
				else {
					entityCache.putResult(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
						UccPeopleChurchStandingImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
					UccPeopleChurchStandingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return uccPeopleChurchStanding;
	}

	/**
	 * Returns the ucc people church standing with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param uccPeopleChurchStandingId the primary key of the ucc people church standing
	 * @return the ucc people church standing, or <code>null</code> if a ucc people church standing with the primary key could not be found
	 */
	@Override
	public UccPeopleChurchStanding fetchByPrimaryKey(
		int uccPeopleChurchStandingId) {
		return fetchByPrimaryKey((Serializable)uccPeopleChurchStandingId);
	}

	@Override
	public Map<Serializable, UccPeopleChurchStanding> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, UccPeopleChurchStanding> map = new HashMap<Serializable, UccPeopleChurchStanding>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			UccPeopleChurchStanding uccPeopleChurchStanding = fetchByPrimaryKey(primaryKey);

			if (uccPeopleChurchStanding != null) {
				map.put(primaryKey, uccPeopleChurchStanding);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
					UccPeopleChurchStandingImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (UccPeopleChurchStanding)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_UCCPEOPLECHURCHSTANDING_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((int)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (UccPeopleChurchStanding uccPeopleChurchStanding : (List<UccPeopleChurchStanding>)q.list()) {
				map.put(uccPeopleChurchStanding.getPrimaryKeyObj(),
					uccPeopleChurchStanding);

				cacheResult(uccPeopleChurchStanding);

				uncachedPrimaryKeys.remove(uccPeopleChurchStanding.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(UccPeopleChurchStandingModelImpl.ENTITY_CACHE_ENABLED,
					UccPeopleChurchStandingImpl.class, primaryKey, nullModel);
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
	 * Returns all the ucc people church standings.
	 *
	 * @return the ucc people church standings
	 */
	@Override
	public List<UccPeopleChurchStanding> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ucc people church standings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc people church standings
	 * @param end the upper bound of the range of ucc people church standings (not inclusive)
	 * @return the range of ucc people church standings
	 */
	@Override
	public List<UccPeopleChurchStanding> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ucc people church standings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc people church standings
	 * @param end the upper bound of the range of ucc people church standings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ucc people church standings
	 */
	@Override
	public List<UccPeopleChurchStanding> findAll(int start, int end,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ucc people church standings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc people church standings
	 * @param end the upper bound of the range of ucc people church standings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ucc people church standings
	 */
	@Override
	public List<UccPeopleChurchStanding> findAll(int start, int end,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator,
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

		List<UccPeopleChurchStanding> list = null;

		if (retrieveFromCache) {
			list = (List<UccPeopleChurchStanding>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_UCCPEOPLECHURCHSTANDING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_UCCPEOPLECHURCHSTANDING;

				if (pagination) {
					sql = sql.concat(UccPeopleChurchStandingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UccPeopleChurchStanding>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UccPeopleChurchStanding>)QueryUtil.list(q,
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
	 * Removes all the ucc people church standings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UccPeopleChurchStanding uccPeopleChurchStanding : findAll()) {
			remove(uccPeopleChurchStanding);
		}
	}

	/**
	 * Returns the number of ucc people church standings.
	 *
	 * @return the number of ucc people church standings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_UCCPEOPLECHURCHSTANDING);

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
		return UccPeopleChurchStandingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ucc people church standing persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(UccPeopleChurchStandingImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_UCCPEOPLECHURCHSTANDING = "SELECT uccPeopleChurchStanding FROM UccPeopleChurchStanding uccPeopleChurchStanding";
	private static final String _SQL_SELECT_UCCPEOPLECHURCHSTANDING_WHERE_PKS_IN =
		"SELECT uccPeopleChurchStanding FROM UccPeopleChurchStanding uccPeopleChurchStanding WHERE peopleChurchStandingId IN (";
	private static final String _SQL_SELECT_UCCPEOPLECHURCHSTANDING_WHERE = "SELECT uccPeopleChurchStanding FROM UccPeopleChurchStanding uccPeopleChurchStanding WHERE ";
	private static final String _SQL_COUNT_UCCPEOPLECHURCHSTANDING = "SELECT COUNT(uccPeopleChurchStanding) FROM UccPeopleChurchStanding uccPeopleChurchStanding";
	private static final String _SQL_COUNT_UCCPEOPLECHURCHSTANDING_WHERE = "SELECT COUNT(uccPeopleChurchStanding) FROM UccPeopleChurchStanding uccPeopleChurchStanding WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "uccPeopleChurchStanding.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UccPeopleChurchStanding exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UccPeopleChurchStanding exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(UccPeopleChurchStandingPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uccPeopleChurchStandingId", "uccPeopleId", "uccConferenceId",
				"uccAssociationId"
			});
}