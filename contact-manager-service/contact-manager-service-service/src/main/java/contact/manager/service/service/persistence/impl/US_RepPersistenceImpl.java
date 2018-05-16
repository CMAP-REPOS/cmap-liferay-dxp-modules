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

import contact.manager.service.exception.NoSuchUS_RepException;
import contact.manager.service.model.US_Rep;
import contact.manager.service.model.impl.US_RepImpl;
import contact.manager.service.model.impl.US_RepModelImpl;
import contact.manager.service.service.persistence.US_RepPersistence;

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
 * The persistence implementation for the us_ rep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see US_RepPersistence
 * @see contact.manager.service.service.persistence.US_RepUtil
 * @generated
 */
@ProviderType
public class US_RepPersistenceImpl extends BasePersistenceImpl<US_Rep>
	implements US_RepPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link US_RepUtil} to access the us_ rep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = US_RepImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(US_RepModelImpl.ENTITY_CACHE_ENABLED,
			US_RepModelImpl.FINDER_CACHE_ENABLED, US_RepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(US_RepModelImpl.ENTITY_CACHE_ENABLED,
			US_RepModelImpl.FINDER_CACHE_ENABLED, US_RepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(US_RepModelImpl.ENTITY_CACHE_ENABLED,
			US_RepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ZIPCODE = new FinderPath(US_RepModelImpl.ENTITY_CACHE_ENABLED,
			US_RepModelImpl.FINDER_CACHE_ENABLED, US_RepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByZipCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE =
		new FinderPath(US_RepModelImpl.ENTITY_CACHE_ENABLED,
			US_RepModelImpl.FINDER_CACHE_ENABLED, US_RepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByZipCode",
			new String[] { String.class.getName() },
			US_RepModelImpl.ZIPCODE_COLUMN_BITMASK |
			US_RepModelImpl.USREPNUMBER_COLUMN_BITMASK |
			US_RepModelImpl.USREPNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ZIPCODE = new FinderPath(US_RepModelImpl.ENTITY_CACHE_ENABLED,
			US_RepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByZipCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the us_ reps where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching us_ reps
	 */
	@Override
	public List<US_Rep> findByZipCode(String zipCode) {
		return findByZipCode(zipCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the us_ reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of us_ reps
	 * @param end the upper bound of the range of us_ reps (not inclusive)
	 * @return the range of matching us_ reps
	 */
	@Override
	public List<US_Rep> findByZipCode(String zipCode, int start, int end) {
		return findByZipCode(zipCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the us_ reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of us_ reps
	 * @param end the upper bound of the range of us_ reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching us_ reps
	 */
	@Override
	public List<US_Rep> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<US_Rep> orderByComparator) {
		return findByZipCode(zipCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the us_ reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of us_ reps
	 * @param end the upper bound of the range of us_ reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching us_ reps
	 */
	@Override
	public List<US_Rep> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<US_Rep> orderByComparator, boolean retrieveFromCache) {
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

		List<US_Rep> list = null;

		if (retrieveFromCache) {
			list = (List<US_Rep>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (US_Rep us_Rep : list) {
					if (!Objects.equals(zipCode, us_Rep.getZipCode())) {
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

			query.append(_SQL_SELECT_US_REP_WHERE);

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
				query.append(US_RepModelImpl.ORDER_BY_JPQL);
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
					list = (List<US_Rep>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<US_Rep>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first us_ rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching us_ rep
	 * @throws NoSuchUS_RepException if a matching us_ rep could not be found
	 */
	@Override
	public US_Rep findByZipCode_First(String zipCode,
		OrderByComparator<US_Rep> orderByComparator)
		throws NoSuchUS_RepException {
		US_Rep us_Rep = fetchByZipCode_First(zipCode, orderByComparator);

		if (us_Rep != null) {
			return us_Rep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUS_RepException(msg.toString());
	}

	/**
	 * Returns the first us_ rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching us_ rep, or <code>null</code> if a matching us_ rep could not be found
	 */
	@Override
	public US_Rep fetchByZipCode_First(String zipCode,
		OrderByComparator<US_Rep> orderByComparator) {
		List<US_Rep> list = findByZipCode(zipCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last us_ rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching us_ rep
	 * @throws NoSuchUS_RepException if a matching us_ rep could not be found
	 */
	@Override
	public US_Rep findByZipCode_Last(String zipCode,
		OrderByComparator<US_Rep> orderByComparator)
		throws NoSuchUS_RepException {
		US_Rep us_Rep = fetchByZipCode_Last(zipCode, orderByComparator);

		if (us_Rep != null) {
			return us_Rep;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUS_RepException(msg.toString());
	}

	/**
	 * Returns the last us_ rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching us_ rep, or <code>null</code> if a matching us_ rep could not be found
	 */
	@Override
	public US_Rep fetchByZipCode_Last(String zipCode,
		OrderByComparator<US_Rep> orderByComparator) {
		int count = countByZipCode(zipCode);

		if (count == 0) {
			return null;
		}

		List<US_Rep> list = findByZipCode(zipCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the us_ reps before and after the current us_ rep in the ordered set where zipCode = &#63;.
	 *
	 * @param usRepId the primary key of the current us_ rep
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next us_ rep
	 * @throws NoSuchUS_RepException if a us_ rep with the primary key could not be found
	 */
	@Override
	public US_Rep[] findByZipCode_PrevAndNext(long usRepId, String zipCode,
		OrderByComparator<US_Rep> orderByComparator)
		throws NoSuchUS_RepException {
		US_Rep us_Rep = findByPrimaryKey(usRepId);

		Session session = null;

		try {
			session = openSession();

			US_Rep[] array = new US_RepImpl[3];

			array[0] = getByZipCode_PrevAndNext(session, us_Rep, zipCode,
					orderByComparator, true);

			array[1] = us_Rep;

			array[2] = getByZipCode_PrevAndNext(session, us_Rep, zipCode,
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

	protected US_Rep getByZipCode_PrevAndNext(Session session, US_Rep us_Rep,
		String zipCode, OrderByComparator<US_Rep> orderByComparator,
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

		query.append(_SQL_SELECT_US_REP_WHERE);

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
			query.append(US_RepModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(us_Rep);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<US_Rep> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the us_ reps where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	@Override
	public void removeByZipCode(String zipCode) {
		for (US_Rep us_Rep : findByZipCode(zipCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(us_Rep);
		}
	}

	/**
	 * Returns the number of us_ reps where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching us_ reps
	 */
	@Override
	public int countByZipCode(String zipCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ZIPCODE;

		Object[] finderArgs = new Object[] { zipCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_US_REP_WHERE);

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

	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_1 = "us_Rep.zipCode IS NULL";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_2 = "us_Rep.zipCode = ?";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_3 = "(us_Rep.zipCode IS NULL OR us_Rep.zipCode = '')";

	public US_RepPersistenceImpl() {
		setModelClass(US_Rep.class);
	}

	/**
	 * Caches the us_ rep in the entity cache if it is enabled.
	 *
	 * @param us_Rep the us_ rep
	 */
	@Override
	public void cacheResult(US_Rep us_Rep) {
		entityCache.putResult(US_RepModelImpl.ENTITY_CACHE_ENABLED,
			US_RepImpl.class, us_Rep.getPrimaryKey(), us_Rep);

		us_Rep.resetOriginalValues();
	}

	/**
	 * Caches the us_ reps in the entity cache if it is enabled.
	 *
	 * @param us_Reps the us_ reps
	 */
	@Override
	public void cacheResult(List<US_Rep> us_Reps) {
		for (US_Rep us_Rep : us_Reps) {
			if (entityCache.getResult(US_RepModelImpl.ENTITY_CACHE_ENABLED,
						US_RepImpl.class, us_Rep.getPrimaryKey()) == null) {
				cacheResult(us_Rep);
			}
			else {
				us_Rep.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all us_ reps.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(US_RepImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the us_ rep.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(US_Rep us_Rep) {
		entityCache.removeResult(US_RepModelImpl.ENTITY_CACHE_ENABLED,
			US_RepImpl.class, us_Rep.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<US_Rep> us_Reps) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (US_Rep us_Rep : us_Reps) {
			entityCache.removeResult(US_RepModelImpl.ENTITY_CACHE_ENABLED,
				US_RepImpl.class, us_Rep.getPrimaryKey());
		}
	}

	/**
	 * Creates a new us_ rep with the primary key. Does not add the us_ rep to the database.
	 *
	 * @param usRepId the primary key for the new us_ rep
	 * @return the new us_ rep
	 */
	@Override
	public US_Rep create(long usRepId) {
		US_Rep us_Rep = new US_RepImpl();

		us_Rep.setNew(true);
		us_Rep.setPrimaryKey(usRepId);

		return us_Rep;
	}

	/**
	 * Removes the us_ rep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usRepId the primary key of the us_ rep
	 * @return the us_ rep that was removed
	 * @throws NoSuchUS_RepException if a us_ rep with the primary key could not be found
	 */
	@Override
	public US_Rep remove(long usRepId) throws NoSuchUS_RepException {
		return remove((Serializable)usRepId);
	}

	/**
	 * Removes the us_ rep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the us_ rep
	 * @return the us_ rep that was removed
	 * @throws NoSuchUS_RepException if a us_ rep with the primary key could not be found
	 */
	@Override
	public US_Rep remove(Serializable primaryKey) throws NoSuchUS_RepException {
		Session session = null;

		try {
			session = openSession();

			US_Rep us_Rep = (US_Rep)session.get(US_RepImpl.class, primaryKey);

			if (us_Rep == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUS_RepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(us_Rep);
		}
		catch (NoSuchUS_RepException nsee) {
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
	protected US_Rep removeImpl(US_Rep us_Rep) {
		us_Rep = toUnwrappedModel(us_Rep);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(us_Rep)) {
				us_Rep = (US_Rep)session.get(US_RepImpl.class,
						us_Rep.getPrimaryKeyObj());
			}

			if (us_Rep != null) {
				session.delete(us_Rep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (us_Rep != null) {
			clearCache(us_Rep);
		}

		return us_Rep;
	}

	@Override
	public US_Rep updateImpl(US_Rep us_Rep) {
		us_Rep = toUnwrappedModel(us_Rep);

		boolean isNew = us_Rep.isNew();

		US_RepModelImpl us_RepModelImpl = (US_RepModelImpl)us_Rep;

		Session session = null;

		try {
			session = openSession();

			if (us_Rep.isNew()) {
				session.save(us_Rep);

				us_Rep.setNew(false);
			}
			else {
				us_Rep = (US_Rep)session.merge(us_Rep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!US_RepModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { us_RepModelImpl.getZipCode() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((us_RepModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						us_RepModelImpl.getOriginalZipCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);

				args = new Object[] { us_RepModelImpl.getZipCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);
			}
		}

		entityCache.putResult(US_RepModelImpl.ENTITY_CACHE_ENABLED,
			US_RepImpl.class, us_Rep.getPrimaryKey(), us_Rep, false);

		us_Rep.resetOriginalValues();

		return us_Rep;
	}

	protected US_Rep toUnwrappedModel(US_Rep us_Rep) {
		if (us_Rep instanceof US_RepImpl) {
			return us_Rep;
		}

		US_RepImpl us_RepImpl = new US_RepImpl();

		us_RepImpl.setNew(us_Rep.isNew());
		us_RepImpl.setPrimaryKey(us_Rep.getPrimaryKey());

		us_RepImpl.setUsRepId(us_Rep.getUsRepId());
		us_RepImpl.setUsRepNumber(us_Rep.getUsRepNumber());
		us_RepImpl.setUsRepName(us_Rep.getUsRepName());
		us_RepImpl.setZipCode(us_Rep.getZipCode());

		return us_RepImpl;
	}

	/**
	 * Returns the us_ rep with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the us_ rep
	 * @return the us_ rep
	 * @throws NoSuchUS_RepException if a us_ rep with the primary key could not be found
	 */
	@Override
	public US_Rep findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUS_RepException {
		US_Rep us_Rep = fetchByPrimaryKey(primaryKey);

		if (us_Rep == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUS_RepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return us_Rep;
	}

	/**
	 * Returns the us_ rep with the primary key or throws a {@link NoSuchUS_RepException} if it could not be found.
	 *
	 * @param usRepId the primary key of the us_ rep
	 * @return the us_ rep
	 * @throws NoSuchUS_RepException if a us_ rep with the primary key could not be found
	 */
	@Override
	public US_Rep findByPrimaryKey(long usRepId) throws NoSuchUS_RepException {
		return findByPrimaryKey((Serializable)usRepId);
	}

	/**
	 * Returns the us_ rep with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the us_ rep
	 * @return the us_ rep, or <code>null</code> if a us_ rep with the primary key could not be found
	 */
	@Override
	public US_Rep fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(US_RepModelImpl.ENTITY_CACHE_ENABLED,
				US_RepImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		US_Rep us_Rep = (US_Rep)serializable;

		if (us_Rep == null) {
			Session session = null;

			try {
				session = openSession();

				us_Rep = (US_Rep)session.get(US_RepImpl.class, primaryKey);

				if (us_Rep != null) {
					cacheResult(us_Rep);
				}
				else {
					entityCache.putResult(US_RepModelImpl.ENTITY_CACHE_ENABLED,
						US_RepImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(US_RepModelImpl.ENTITY_CACHE_ENABLED,
					US_RepImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return us_Rep;
	}

	/**
	 * Returns the us_ rep with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param usRepId the primary key of the us_ rep
	 * @return the us_ rep, or <code>null</code> if a us_ rep with the primary key could not be found
	 */
	@Override
	public US_Rep fetchByPrimaryKey(long usRepId) {
		return fetchByPrimaryKey((Serializable)usRepId);
	}

	@Override
	public Map<Serializable, US_Rep> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, US_Rep> map = new HashMap<Serializable, US_Rep>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			US_Rep us_Rep = fetchByPrimaryKey(primaryKey);

			if (us_Rep != null) {
				map.put(primaryKey, us_Rep);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(US_RepModelImpl.ENTITY_CACHE_ENABLED,
					US_RepImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (US_Rep)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_US_REP_WHERE_PKS_IN);

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

			for (US_Rep us_Rep : (List<US_Rep>)q.list()) {
				map.put(us_Rep.getPrimaryKeyObj(), us_Rep);

				cacheResult(us_Rep);

				uncachedPrimaryKeys.remove(us_Rep.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(US_RepModelImpl.ENTITY_CACHE_ENABLED,
					US_RepImpl.class, primaryKey, nullModel);
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
	 * Returns all the us_ reps.
	 *
	 * @return the us_ reps
	 */
	@Override
	public List<US_Rep> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the us_ reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of us_ reps
	 * @param end the upper bound of the range of us_ reps (not inclusive)
	 * @return the range of us_ reps
	 */
	@Override
	public List<US_Rep> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the us_ reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of us_ reps
	 * @param end the upper bound of the range of us_ reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of us_ reps
	 */
	@Override
	public List<US_Rep> findAll(int start, int end,
		OrderByComparator<US_Rep> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the us_ reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of us_ reps
	 * @param end the upper bound of the range of us_ reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of us_ reps
	 */
	@Override
	public List<US_Rep> findAll(int start, int end,
		OrderByComparator<US_Rep> orderByComparator, boolean retrieveFromCache) {
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

		List<US_Rep> list = null;

		if (retrieveFromCache) {
			list = (List<US_Rep>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_US_REP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_US_REP;

				if (pagination) {
					sql = sql.concat(US_RepModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<US_Rep>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<US_Rep>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the us_ reps from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (US_Rep us_Rep : findAll()) {
			remove(us_Rep);
		}
	}

	/**
	 * Returns the number of us_ reps.
	 *
	 * @return the number of us_ reps
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_US_REP);

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
		return US_RepModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the us_ rep persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(US_RepImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_US_REP = "SELECT us_Rep FROM US_Rep us_Rep";
	private static final String _SQL_SELECT_US_REP_WHERE_PKS_IN = "SELECT us_Rep FROM US_Rep us_Rep WHERE usRepId IN (";
	private static final String _SQL_SELECT_US_REP_WHERE = "SELECT us_Rep FROM US_Rep us_Rep WHERE ";
	private static final String _SQL_COUNT_US_REP = "SELECT COUNT(us_Rep) FROM US_Rep us_Rep";
	private static final String _SQL_COUNT_US_REP_WHERE = "SELECT COUNT(us_Rep) FROM US_Rep us_Rep WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "us_Rep.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No US_Rep exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No US_Rep exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(US_RepPersistenceImpl.class);
}