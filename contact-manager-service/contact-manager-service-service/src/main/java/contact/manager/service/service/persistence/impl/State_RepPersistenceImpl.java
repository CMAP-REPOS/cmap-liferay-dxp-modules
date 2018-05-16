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

package contact.manager.service.service.persistence.impl;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.service.exception.NoSuchState_RepException;
import contact.manager.service.model.State_Rep;
import contact.manager.service.model.impl.State_RepImpl;
import contact.manager.service.model.impl.State_RepModelImpl;
import contact.manager.service.service.persistence.State_RepPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the state_ rep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see State_RepPersistence
 * @see contact.manager.service.service.persistence.State_RepUtil
 * @generated
 */
@ProviderType
public class State_RepPersistenceImpl extends BasePersistenceImpl<State_Rep>
	implements State_RepPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link State_RepUtil} to access the state_ rep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = State_RepImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(State_RepModelImpl.ENTITY_CACHE_ENABLED,
			State_RepModelImpl.FINDER_CACHE_ENABLED, State_RepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(State_RepModelImpl.ENTITY_CACHE_ENABLED,
			State_RepModelImpl.FINDER_CACHE_ENABLED, State_RepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(State_RepModelImpl.ENTITY_CACHE_ENABLED,
			State_RepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ZIPCODE = new FinderPath(State_RepModelImpl.ENTITY_CACHE_ENABLED,
			State_RepModelImpl.FINDER_CACHE_ENABLED, State_RepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByZipCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE =
		new FinderPath(State_RepModelImpl.ENTITY_CACHE_ENABLED,
			State_RepModelImpl.FINDER_CACHE_ENABLED, State_RepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByZipCode",
			new String[] { String.class.getName() },
			State_RepModelImpl.ZIPCODE_COLUMN_BITMASK |
			State_RepModelImpl.STATEREPNUMBER_COLUMN_BITMASK |
			State_RepModelImpl.STATEREPNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ZIPCODE = new FinderPath(State_RepModelImpl.ENTITY_CACHE_ENABLED,
			State_RepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByZipCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the state_ reps where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching state_ reps
	 */
	@Override
	public List<State_Rep> findByZipCode(String zipCode) {
		return findByZipCode(zipCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the state_ reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of state_ reps
	 * @param end the upper bound of the range of state_ reps (not inclusive)
	 * @return the range of matching state_ reps
	 */
	@Override
	public List<State_Rep> findByZipCode(String zipCode, int start, int end) {
		return findByZipCode(zipCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the state_ reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of state_ reps
	 * @param end the upper bound of the range of state_ reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching state_ reps
	 */
	@Override
	public List<State_Rep> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<State_Rep> orderByComparator) {
		return findByZipCode(zipCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the state_ reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of state_ reps
	 * @param end the upper bound of the range of state_ reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching state_ reps
	 */
	@Override
	public List<State_Rep> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<State_Rep> orderByComparator,
		boolean retrieveFromCache) {
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

		List<State_Rep> list = null;

		if (retrieveFromCache) {
			list = (List<State_Rep>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (State_Rep state_Rep : list) {
					if (!Objects.equals(zipCode, state_Rep.getZipCode())) {
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

			query.append(_SQL_SELECT_STATE_REP_WHERE);

			boolean bindZipCode = false;

			if (zipCode == null) {
				query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_1);
			}
			else if (zipCode.equals(StringPool.BLANK)) {
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
				query.append(State_RepModelImpl.ORDER_BY_JPQL);
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
					list = (List<State_Rep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<State_Rep>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first state_ rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching state_ rep
	 * @throws NoSuchState_RepException if a matching state_ rep could not be found
	 */
	@Override
	public State_Rep findByZipCode_First(String zipCode,
		OrderByComparator<State_Rep> orderByComparator)
		throws NoSuchState_RepException {
		State_Rep state_Rep = fetchByZipCode_First(zipCode, orderByComparator);

		if (state_Rep != null) {
			return state_Rep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchState_RepException(msg.toString());
	}

	/**
	 * Returns the first state_ rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching state_ rep, or <code>null</code> if a matching state_ rep could not be found
	 */
	@Override
	public State_Rep fetchByZipCode_First(String zipCode,
		OrderByComparator<State_Rep> orderByComparator) {
		List<State_Rep> list = findByZipCode(zipCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last state_ rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching state_ rep
	 * @throws NoSuchState_RepException if a matching state_ rep could not be found
	 */
	@Override
	public State_Rep findByZipCode_Last(String zipCode,
		OrderByComparator<State_Rep> orderByComparator)
		throws NoSuchState_RepException {
		State_Rep state_Rep = fetchByZipCode_Last(zipCode, orderByComparator);

		if (state_Rep != null) {
			return state_Rep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchState_RepException(msg.toString());
	}

	/**
	 * Returns the last state_ rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching state_ rep, or <code>null</code> if a matching state_ rep could not be found
	 */
	@Override
	public State_Rep fetchByZipCode_Last(String zipCode,
		OrderByComparator<State_Rep> orderByComparator) {
		int count = countByZipCode(zipCode);

		if (count == 0) {
			return null;
		}

		List<State_Rep> list = findByZipCode(zipCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the state_ reps before and after the current state_ rep in the ordered set where zipCode = &#63;.
	 *
	 * @param stateRepId the primary key of the current state_ rep
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next state_ rep
	 * @throws NoSuchState_RepException if a state_ rep with the primary key could not be found
	 */
	@Override
	public State_Rep[] findByZipCode_PrevAndNext(long stateRepId,
		String zipCode, OrderByComparator<State_Rep> orderByComparator)
		throws NoSuchState_RepException {
		State_Rep state_Rep = findByPrimaryKey(stateRepId);

		Session session = null;

		try {
			session = openSession();

			State_Rep[] array = new State_RepImpl[3];

			array[0] = getByZipCode_PrevAndNext(session, state_Rep, zipCode,
					orderByComparator, true);

			array[1] = state_Rep;

			array[2] = getByZipCode_PrevAndNext(session, state_Rep, zipCode,
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

	protected State_Rep getByZipCode_PrevAndNext(Session session,
		State_Rep state_Rep, String zipCode,
		OrderByComparator<State_Rep> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_STATE_REP_WHERE);

		boolean bindZipCode = false;

		if (zipCode == null) {
			query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_1);
		}
		else if (zipCode.equals(StringPool.BLANK)) {
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
			query.append(State_RepModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(state_Rep);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<State_Rep> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the state_ reps where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	@Override
	public void removeByZipCode(String zipCode) {
		for (State_Rep state_Rep : findByZipCode(zipCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(state_Rep);
		}
	}

	/**
	 * Returns the number of state_ reps where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching state_ reps
	 */
	@Override
	public int countByZipCode(String zipCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ZIPCODE;

		Object[] finderArgs = new Object[] { zipCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_STATE_REP_WHERE);

			boolean bindZipCode = false;

			if (zipCode == null) {
				query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_1);
			}
			else if (zipCode.equals(StringPool.BLANK)) {
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

	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_1 = "state_Rep.zipCode IS NULL";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_2 = "state_Rep.zipCode = ?";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_3 = "(state_Rep.zipCode IS NULL OR state_Rep.zipCode = '')";

	public State_RepPersistenceImpl() {
		setModelClass(State_Rep.class);
	}

	/**
	 * Caches the state_ rep in the entity cache if it is enabled.
	 *
	 * @param state_Rep the state_ rep
	 */
	@Override
	public void cacheResult(State_Rep state_Rep) {
		entityCache.putResult(State_RepModelImpl.ENTITY_CACHE_ENABLED,
			State_RepImpl.class, state_Rep.getPrimaryKey(), state_Rep);

		state_Rep.resetOriginalValues();
	}

	/**
	 * Caches the state_ reps in the entity cache if it is enabled.
	 *
	 * @param state_Reps the state_ reps
	 */
	@Override
	public void cacheResult(List<State_Rep> state_Reps) {
		for (State_Rep state_Rep : state_Reps) {
			if (entityCache.getResult(State_RepModelImpl.ENTITY_CACHE_ENABLED,
						State_RepImpl.class, state_Rep.getPrimaryKey()) == null) {
				cacheResult(state_Rep);
			}
			else {
				state_Rep.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all state_ reps.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(State_RepImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the state_ rep.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(State_Rep state_Rep) {
		entityCache.removeResult(State_RepModelImpl.ENTITY_CACHE_ENABLED,
			State_RepImpl.class, state_Rep.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<State_Rep> state_Reps) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (State_Rep state_Rep : state_Reps) {
			entityCache.removeResult(State_RepModelImpl.ENTITY_CACHE_ENABLED,
				State_RepImpl.class, state_Rep.getPrimaryKey());
		}
	}

	/**
	 * Creates a new state_ rep with the primary key. Does not add the state_ rep to the database.
	 *
	 * @param stateRepId the primary key for the new state_ rep
	 * @return the new state_ rep
	 */
	@Override
	public State_Rep create(long stateRepId) {
		State_Rep state_Rep = new State_RepImpl();

		state_Rep.setNew(true);
		state_Rep.setPrimaryKey(stateRepId);

		return state_Rep;
	}

	/**
	 * Removes the state_ rep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param stateRepId the primary key of the state_ rep
	 * @return the state_ rep that was removed
	 * @throws NoSuchState_RepException if a state_ rep with the primary key could not be found
	 */
	@Override
	public State_Rep remove(long stateRepId) throws NoSuchState_RepException {
		return remove((Serializable)stateRepId);
	}

	/**
	 * Removes the state_ rep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the state_ rep
	 * @return the state_ rep that was removed
	 * @throws NoSuchState_RepException if a state_ rep with the primary key could not be found
	 */
	@Override
	public State_Rep remove(Serializable primaryKey)
		throws NoSuchState_RepException {
		Session session = null;

		try {
			session = openSession();

			State_Rep state_Rep = (State_Rep)session.get(State_RepImpl.class,
					primaryKey);

			if (state_Rep == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchState_RepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(state_Rep);
		}
		catch (NoSuchState_RepException nsee) {
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
	protected State_Rep removeImpl(State_Rep state_Rep) {
		state_Rep = toUnwrappedModel(state_Rep);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(state_Rep)) {
				state_Rep = (State_Rep)session.get(State_RepImpl.class,
						state_Rep.getPrimaryKeyObj());
			}

			if (state_Rep != null) {
				session.delete(state_Rep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (state_Rep != null) {
			clearCache(state_Rep);
		}

		return state_Rep;
	}

	@Override
	public State_Rep updateImpl(State_Rep state_Rep) {
		state_Rep = toUnwrappedModel(state_Rep);

		boolean isNew = state_Rep.isNew();

		State_RepModelImpl state_RepModelImpl = (State_RepModelImpl)state_Rep;

		Session session = null;

		try {
			session = openSession();

			if (state_Rep.isNew()) {
				session.save(state_Rep);

				state_Rep.setNew(false);
			}
			else {
				state_Rep = (State_Rep)session.merge(state_Rep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!State_RepModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { state_RepModelImpl.getZipCode() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((state_RepModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						state_RepModelImpl.getOriginalZipCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);

				args = new Object[] { state_RepModelImpl.getZipCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);
			}
		}

		entityCache.putResult(State_RepModelImpl.ENTITY_CACHE_ENABLED,
			State_RepImpl.class, state_Rep.getPrimaryKey(), state_Rep, false);

		state_Rep.resetOriginalValues();

		return state_Rep;
	}

	protected State_Rep toUnwrappedModel(State_Rep state_Rep) {
		if (state_Rep instanceof State_RepImpl) {
			return state_Rep;
		}

		State_RepImpl state_RepImpl = new State_RepImpl();

		state_RepImpl.setNew(state_Rep.isNew());
		state_RepImpl.setPrimaryKey(state_Rep.getPrimaryKey());

		state_RepImpl.setStateRepId(state_Rep.getStateRepId());
		state_RepImpl.setStateRepNumber(state_Rep.getStateRepNumber());
		state_RepImpl.setStateRepName(state_Rep.getStateRepName());
		state_RepImpl.setZipCode(state_Rep.getZipCode());

		return state_RepImpl;
	}

	/**
	 * Returns the state_ rep with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the state_ rep
	 * @return the state_ rep
	 * @throws NoSuchState_RepException if a state_ rep with the primary key could not be found
	 */
	@Override
	public State_Rep findByPrimaryKey(Serializable primaryKey)
		throws NoSuchState_RepException {
		State_Rep state_Rep = fetchByPrimaryKey(primaryKey);

		if (state_Rep == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchState_RepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return state_Rep;
	}

	/**
	 * Returns the state_ rep with the primary key or throws a {@link NoSuchState_RepException} if it could not be found.
	 *
	 * @param stateRepId the primary key of the state_ rep
	 * @return the state_ rep
	 * @throws NoSuchState_RepException if a state_ rep with the primary key could not be found
	 */
	@Override
	public State_Rep findByPrimaryKey(long stateRepId)
		throws NoSuchState_RepException {
		return findByPrimaryKey((Serializable)stateRepId);
	}

	/**
	 * Returns the state_ rep with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the state_ rep
	 * @return the state_ rep, or <code>null</code> if a state_ rep with the primary key could not be found
	 */
	@Override
	public State_Rep fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(State_RepModelImpl.ENTITY_CACHE_ENABLED,
				State_RepImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		State_Rep state_Rep = (State_Rep)serializable;

		if (state_Rep == null) {
			Session session = null;

			try {
				session = openSession();

				state_Rep = (State_Rep)session.get(State_RepImpl.class,
						primaryKey);

				if (state_Rep != null) {
					cacheResult(state_Rep);
				}
				else {
					entityCache.putResult(State_RepModelImpl.ENTITY_CACHE_ENABLED,
						State_RepImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(State_RepModelImpl.ENTITY_CACHE_ENABLED,
					State_RepImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return state_Rep;
	}

	/**
	 * Returns the state_ rep with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param stateRepId the primary key of the state_ rep
	 * @return the state_ rep, or <code>null</code> if a state_ rep with the primary key could not be found
	 */
	@Override
	public State_Rep fetchByPrimaryKey(long stateRepId) {
		return fetchByPrimaryKey((Serializable)stateRepId);
	}

	@Override
	public Map<Serializable, State_Rep> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, State_Rep> map = new HashMap<Serializable, State_Rep>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			State_Rep state_Rep = fetchByPrimaryKey(primaryKey);

			if (state_Rep != null) {
				map.put(primaryKey, state_Rep);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(State_RepModelImpl.ENTITY_CACHE_ENABLED,
					State_RepImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (State_Rep)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_STATE_REP_WHERE_PKS_IN);

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

			for (State_Rep state_Rep : (List<State_Rep>)q.list()) {
				map.put(state_Rep.getPrimaryKeyObj(), state_Rep);

				cacheResult(state_Rep);

				uncachedPrimaryKeys.remove(state_Rep.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(State_RepModelImpl.ENTITY_CACHE_ENABLED,
					State_RepImpl.class, primaryKey, nullModel);
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
	 * Returns all the state_ reps.
	 *
	 * @return the state_ reps
	 */
	@Override
	public List<State_Rep> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the state_ reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of state_ reps
	 * @param end the upper bound of the range of state_ reps (not inclusive)
	 * @return the range of state_ reps
	 */
	@Override
	public List<State_Rep> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the state_ reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of state_ reps
	 * @param end the upper bound of the range of state_ reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of state_ reps
	 */
	@Override
	public List<State_Rep> findAll(int start, int end,
		OrderByComparator<State_Rep> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the state_ reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of state_ reps
	 * @param end the upper bound of the range of state_ reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of state_ reps
	 */
	@Override
	public List<State_Rep> findAll(int start, int end,
		OrderByComparator<State_Rep> orderByComparator,
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

		List<State_Rep> list = null;

		if (retrieveFromCache) {
			list = (List<State_Rep>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_STATE_REP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATE_REP;

				if (pagination) {
					sql = sql.concat(State_RepModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<State_Rep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<State_Rep>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the state_ reps from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (State_Rep state_Rep : findAll()) {
			remove(state_Rep);
		}
	}

	/**
	 * Returns the number of state_ reps.
	 *
	 * @return the number of state_ reps
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STATE_REP);

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
	protected Map<String, Integer> getTableColumnsMap() {
		return State_RepModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the state_ rep persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(State_RepImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_STATE_REP = "SELECT state_Rep FROM State_Rep state_Rep";
	private static final String _SQL_SELECT_STATE_REP_WHERE_PKS_IN = "SELECT state_Rep FROM State_Rep state_Rep WHERE stateRepId IN (";
	private static final String _SQL_SELECT_STATE_REP_WHERE = "SELECT state_Rep FROM State_Rep state_Rep WHERE ";
	private static final String _SQL_COUNT_STATE_REP = "SELECT COUNT(state_Rep) FROM State_Rep state_Rep";
	private static final String _SQL_COUNT_STATE_REP_WHERE = "SELECT COUNT(state_Rep) FROM State_Rep state_Rep WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "state_Rep.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No State_Rep exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No State_Rep exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(State_RepPersistenceImpl.class);
}