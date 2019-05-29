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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ucc.portal.exception.NoSuchExtKeyAccomplishmentException;

import ucc.portal.model.ExtKeyAccomplishment;
import ucc.portal.model.impl.ExtKeyAccomplishmentImpl;
import ucc.portal.model.impl.ExtKeyAccomplishmentModelImpl;

import ucc.portal.service.persistence.ExtKeyAccomplishmentPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the ext key accomplishment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtKeyAccomplishmentPersistence
 * @see ucc.portal.service.persistence.ExtKeyAccomplishmentUtil
 * @generated
 */
@ProviderType
public class ExtKeyAccomplishmentPersistenceImpl extends BasePersistenceImpl<ExtKeyAccomplishment>
	implements ExtKeyAccomplishmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ExtKeyAccomplishmentUtil} to access the ext key accomplishment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ExtKeyAccomplishmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
			ExtKeyAccomplishmentModelImpl.FINDER_CACHE_ENABLED,
			ExtKeyAccomplishmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
			ExtKeyAccomplishmentModelImpl.FINDER_CACHE_ENABLED,
			ExtKeyAccomplishmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
			ExtKeyAccomplishmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
			ExtKeyAccomplishmentModelImpl.FINDER_CACHE_ENABLED,
			ExtKeyAccomplishmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
			ExtKeyAccomplishmentModelImpl.FINDER_CACHE_ENABLED,
			ExtKeyAccomplishmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			ExtKeyAccomplishmentModelImpl.USERID_COLUMN_BITMASK |
			ExtKeyAccomplishmentModelImpl.PRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
			ExtKeyAccomplishmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ext key accomplishments where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching ext key accomplishments
	 */
	@Override
	public List<ExtKeyAccomplishment> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext key accomplishments where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext key accomplishments
	 * @param end the upper bound of the range of ext key accomplishments (not inclusive)
	 * @return the range of matching ext key accomplishments
	 */
	@Override
	public List<ExtKeyAccomplishment> findByUserId(long userId, int start,
		int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext key accomplishments where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext key accomplishments
	 * @param end the upper bound of the range of ext key accomplishments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext key accomplishments
	 */
	@Override
	public List<ExtKeyAccomplishment> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtKeyAccomplishment> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext key accomplishments where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext key accomplishments
	 * @param end the upper bound of the range of ext key accomplishments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ext key accomplishments
	 */
	@Override
	public List<ExtKeyAccomplishment> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtKeyAccomplishment> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<ExtKeyAccomplishment> list = null;

		if (retrieveFromCache) {
			list = (List<ExtKeyAccomplishment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExtKeyAccomplishment extKeyAccomplishment : list) {
					if ((userId != extKeyAccomplishment.getUserId())) {
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

			query.append(_SQL_SELECT_EXTKEYACCOMPLISHMENT_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExtKeyAccomplishmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<ExtKeyAccomplishment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtKeyAccomplishment>)QueryUtil.list(q,
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
	 * Returns the first ext key accomplishment in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext key accomplishment
	 * @throws NoSuchExtKeyAccomplishmentException if a matching ext key accomplishment could not be found
	 */
	@Override
	public ExtKeyAccomplishment findByUserId_First(long userId,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator)
		throws NoSuchExtKeyAccomplishmentException {
		ExtKeyAccomplishment extKeyAccomplishment = fetchByUserId_First(userId,
				orderByComparator);

		if (extKeyAccomplishment != null) {
			return extKeyAccomplishment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtKeyAccomplishmentException(msg.toString());
	}

	/**
	 * Returns the first ext key accomplishment in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext key accomplishment, or <code>null</code> if a matching ext key accomplishment could not be found
	 */
	@Override
	public ExtKeyAccomplishment fetchByUserId_First(long userId,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator) {
		List<ExtKeyAccomplishment> list = findByUserId(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext key accomplishment in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext key accomplishment
	 * @throws NoSuchExtKeyAccomplishmentException if a matching ext key accomplishment could not be found
	 */
	@Override
	public ExtKeyAccomplishment findByUserId_Last(long userId,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator)
		throws NoSuchExtKeyAccomplishmentException {
		ExtKeyAccomplishment extKeyAccomplishment = fetchByUserId_Last(userId,
				orderByComparator);

		if (extKeyAccomplishment != null) {
			return extKeyAccomplishment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtKeyAccomplishmentException(msg.toString());
	}

	/**
	 * Returns the last ext key accomplishment in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext key accomplishment, or <code>null</code> if a matching ext key accomplishment could not be found
	 */
	@Override
	public ExtKeyAccomplishment fetchByUserId_Last(long userId,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<ExtKeyAccomplishment> list = findByUserId(userId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext key accomplishments before and after the current ext key accomplishment in the ordered set where userId = &#63;.
	 *
	 * @param extKeyAccomplishmentId the primary key of the current ext key accomplishment
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext key accomplishment
	 * @throws NoSuchExtKeyAccomplishmentException if a ext key accomplishment with the primary key could not be found
	 */
	@Override
	public ExtKeyAccomplishment[] findByUserId_PrevAndNext(
		long extKeyAccomplishmentId, long userId,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator)
		throws NoSuchExtKeyAccomplishmentException {
		ExtKeyAccomplishment extKeyAccomplishment = findByPrimaryKey(extKeyAccomplishmentId);

		Session session = null;

		try {
			session = openSession();

			ExtKeyAccomplishment[] array = new ExtKeyAccomplishmentImpl[3];

			array[0] = getByUserId_PrevAndNext(session, extKeyAccomplishment,
					userId, orderByComparator, true);

			array[1] = extKeyAccomplishment;

			array[2] = getByUserId_PrevAndNext(session, extKeyAccomplishment,
					userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ExtKeyAccomplishment getByUserId_PrevAndNext(Session session,
		ExtKeyAccomplishment extKeyAccomplishment, long userId,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator,
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

		query.append(_SQL_SELECT_EXTKEYACCOMPLISHMENT_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

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
			query.append(ExtKeyAccomplishmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(extKeyAccomplishment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ExtKeyAccomplishment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext key accomplishments where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (ExtKeyAccomplishment extKeyAccomplishment : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(extKeyAccomplishment);
		}
	}

	/**
	 * Returns the number of ext key accomplishments where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching ext key accomplishments
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EXTKEYACCOMPLISHMENT_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "extKeyAccomplishment.userId = ?";

	public ExtKeyAccomplishmentPersistenceImpl() {
		setModelClass(ExtKeyAccomplishment.class);
	}

	/**
	 * Caches the ext key accomplishment in the entity cache if it is enabled.
	 *
	 * @param extKeyAccomplishment the ext key accomplishment
	 */
	@Override
	public void cacheResult(ExtKeyAccomplishment extKeyAccomplishment) {
		entityCache.putResult(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
			ExtKeyAccomplishmentImpl.class,
			extKeyAccomplishment.getPrimaryKey(), extKeyAccomplishment);

		extKeyAccomplishment.resetOriginalValues();
	}

	/**
	 * Caches the ext key accomplishments in the entity cache if it is enabled.
	 *
	 * @param extKeyAccomplishments the ext key accomplishments
	 */
	@Override
	public void cacheResult(List<ExtKeyAccomplishment> extKeyAccomplishments) {
		for (ExtKeyAccomplishment extKeyAccomplishment : extKeyAccomplishments) {
			if (entityCache.getResult(
						ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
						ExtKeyAccomplishmentImpl.class,
						extKeyAccomplishment.getPrimaryKey()) == null) {
				cacheResult(extKeyAccomplishment);
			}
			else {
				extKeyAccomplishment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ext key accomplishments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExtKeyAccomplishmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ext key accomplishment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ExtKeyAccomplishment extKeyAccomplishment) {
		entityCache.removeResult(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
			ExtKeyAccomplishmentImpl.class, extKeyAccomplishment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ExtKeyAccomplishment> extKeyAccomplishments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ExtKeyAccomplishment extKeyAccomplishment : extKeyAccomplishments) {
			entityCache.removeResult(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
				ExtKeyAccomplishmentImpl.class,
				extKeyAccomplishment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ext key accomplishment with the primary key. Does not add the ext key accomplishment to the database.
	 *
	 * @param extKeyAccomplishmentId the primary key for the new ext key accomplishment
	 * @return the new ext key accomplishment
	 */
	@Override
	public ExtKeyAccomplishment create(long extKeyAccomplishmentId) {
		ExtKeyAccomplishment extKeyAccomplishment = new ExtKeyAccomplishmentImpl();

		extKeyAccomplishment.setNew(true);
		extKeyAccomplishment.setPrimaryKey(extKeyAccomplishmentId);

		extKeyAccomplishment.setCompanyId(companyProvider.getCompanyId());

		return extKeyAccomplishment;
	}

	/**
	 * Removes the ext key accomplishment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param extKeyAccomplishmentId the primary key of the ext key accomplishment
	 * @return the ext key accomplishment that was removed
	 * @throws NoSuchExtKeyAccomplishmentException if a ext key accomplishment with the primary key could not be found
	 */
	@Override
	public ExtKeyAccomplishment remove(long extKeyAccomplishmentId)
		throws NoSuchExtKeyAccomplishmentException {
		return remove((Serializable)extKeyAccomplishmentId);
	}

	/**
	 * Removes the ext key accomplishment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ext key accomplishment
	 * @return the ext key accomplishment that was removed
	 * @throws NoSuchExtKeyAccomplishmentException if a ext key accomplishment with the primary key could not be found
	 */
	@Override
	public ExtKeyAccomplishment remove(Serializable primaryKey)
		throws NoSuchExtKeyAccomplishmentException {
		Session session = null;

		try {
			session = openSession();

			ExtKeyAccomplishment extKeyAccomplishment = (ExtKeyAccomplishment)session.get(ExtKeyAccomplishmentImpl.class,
					primaryKey);

			if (extKeyAccomplishment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExtKeyAccomplishmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(extKeyAccomplishment);
		}
		catch (NoSuchExtKeyAccomplishmentException nsee) {
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
	protected ExtKeyAccomplishment removeImpl(
		ExtKeyAccomplishment extKeyAccomplishment) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(extKeyAccomplishment)) {
				extKeyAccomplishment = (ExtKeyAccomplishment)session.get(ExtKeyAccomplishmentImpl.class,
						extKeyAccomplishment.getPrimaryKeyObj());
			}

			if (extKeyAccomplishment != null) {
				session.delete(extKeyAccomplishment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (extKeyAccomplishment != null) {
			clearCache(extKeyAccomplishment);
		}

		return extKeyAccomplishment;
	}

	@Override
	public ExtKeyAccomplishment updateImpl(
		ExtKeyAccomplishment extKeyAccomplishment) {
		boolean isNew = extKeyAccomplishment.isNew();

		if (!(extKeyAccomplishment instanceof ExtKeyAccomplishmentModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(extKeyAccomplishment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(extKeyAccomplishment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in extKeyAccomplishment proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExtKeyAccomplishment implementation " +
				extKeyAccomplishment.getClass());
		}

		ExtKeyAccomplishmentModelImpl extKeyAccomplishmentModelImpl = (ExtKeyAccomplishmentModelImpl)extKeyAccomplishment;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (extKeyAccomplishment.getCreateDate() == null)) {
			if (serviceContext == null) {
				extKeyAccomplishment.setCreateDate(now);
			}
			else {
				extKeyAccomplishment.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!extKeyAccomplishmentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				extKeyAccomplishment.setModifiedDate(now);
			}
			else {
				extKeyAccomplishment.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (extKeyAccomplishment.isNew()) {
				session.save(extKeyAccomplishment);

				extKeyAccomplishment.setNew(false);
			}
			else {
				extKeyAccomplishment = (ExtKeyAccomplishment)session.merge(extKeyAccomplishment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ExtKeyAccomplishmentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					extKeyAccomplishmentModelImpl.getUserId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((extKeyAccomplishmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						extKeyAccomplishmentModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { extKeyAccomplishmentModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		entityCache.putResult(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
			ExtKeyAccomplishmentImpl.class,
			extKeyAccomplishment.getPrimaryKey(), extKeyAccomplishment, false);

		extKeyAccomplishment.resetOriginalValues();

		return extKeyAccomplishment;
	}

	/**
	 * Returns the ext key accomplishment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext key accomplishment
	 * @return the ext key accomplishment
	 * @throws NoSuchExtKeyAccomplishmentException if a ext key accomplishment with the primary key could not be found
	 */
	@Override
	public ExtKeyAccomplishment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExtKeyAccomplishmentException {
		ExtKeyAccomplishment extKeyAccomplishment = fetchByPrimaryKey(primaryKey);

		if (extKeyAccomplishment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExtKeyAccomplishmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return extKeyAccomplishment;
	}

	/**
	 * Returns the ext key accomplishment with the primary key or throws a {@link NoSuchExtKeyAccomplishmentException} if it could not be found.
	 *
	 * @param extKeyAccomplishmentId the primary key of the ext key accomplishment
	 * @return the ext key accomplishment
	 * @throws NoSuchExtKeyAccomplishmentException if a ext key accomplishment with the primary key could not be found
	 */
	@Override
	public ExtKeyAccomplishment findByPrimaryKey(long extKeyAccomplishmentId)
		throws NoSuchExtKeyAccomplishmentException {
		return findByPrimaryKey((Serializable)extKeyAccomplishmentId);
	}

	/**
	 * Returns the ext key accomplishment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext key accomplishment
	 * @return the ext key accomplishment, or <code>null</code> if a ext key accomplishment with the primary key could not be found
	 */
	@Override
	public ExtKeyAccomplishment fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
				ExtKeyAccomplishmentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ExtKeyAccomplishment extKeyAccomplishment = (ExtKeyAccomplishment)serializable;

		if (extKeyAccomplishment == null) {
			Session session = null;

			try {
				session = openSession();

				extKeyAccomplishment = (ExtKeyAccomplishment)session.get(ExtKeyAccomplishmentImpl.class,
						primaryKey);

				if (extKeyAccomplishment != null) {
					cacheResult(extKeyAccomplishment);
				}
				else {
					entityCache.putResult(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
						ExtKeyAccomplishmentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
					ExtKeyAccomplishmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return extKeyAccomplishment;
	}

	/**
	 * Returns the ext key accomplishment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param extKeyAccomplishmentId the primary key of the ext key accomplishment
	 * @return the ext key accomplishment, or <code>null</code> if a ext key accomplishment with the primary key could not be found
	 */
	@Override
	public ExtKeyAccomplishment fetchByPrimaryKey(long extKeyAccomplishmentId) {
		return fetchByPrimaryKey((Serializable)extKeyAccomplishmentId);
	}

	@Override
	public Map<Serializable, ExtKeyAccomplishment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ExtKeyAccomplishment> map = new HashMap<Serializable, ExtKeyAccomplishment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ExtKeyAccomplishment extKeyAccomplishment = fetchByPrimaryKey(primaryKey);

			if (extKeyAccomplishment != null) {
				map.put(primaryKey, extKeyAccomplishment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
					ExtKeyAccomplishmentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ExtKeyAccomplishment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EXTKEYACCOMPLISHMENT_WHERE_PKS_IN);

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

			for (ExtKeyAccomplishment extKeyAccomplishment : (List<ExtKeyAccomplishment>)q.list()) {
				map.put(extKeyAccomplishment.getPrimaryKeyObj(),
					extKeyAccomplishment);

				cacheResult(extKeyAccomplishment);

				uncachedPrimaryKeys.remove(extKeyAccomplishment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ExtKeyAccomplishmentModelImpl.ENTITY_CACHE_ENABLED,
					ExtKeyAccomplishmentImpl.class, primaryKey, nullModel);
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
	 * Returns all the ext key accomplishments.
	 *
	 * @return the ext key accomplishments
	 */
	@Override
	public List<ExtKeyAccomplishment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext key accomplishments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext key accomplishments
	 * @param end the upper bound of the range of ext key accomplishments (not inclusive)
	 * @return the range of ext key accomplishments
	 */
	@Override
	public List<ExtKeyAccomplishment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext key accomplishments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext key accomplishments
	 * @param end the upper bound of the range of ext key accomplishments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ext key accomplishments
	 */
	@Override
	public List<ExtKeyAccomplishment> findAll(int start, int end,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext key accomplishments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext key accomplishments
	 * @param end the upper bound of the range of ext key accomplishments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ext key accomplishments
	 */
	@Override
	public List<ExtKeyAccomplishment> findAll(int start, int end,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator,
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

		List<ExtKeyAccomplishment> list = null;

		if (retrieveFromCache) {
			list = (List<ExtKeyAccomplishment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EXTKEYACCOMPLISHMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXTKEYACCOMPLISHMENT;

				if (pagination) {
					sql = sql.concat(ExtKeyAccomplishmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ExtKeyAccomplishment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtKeyAccomplishment>)QueryUtil.list(q,
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
	 * Removes all the ext key accomplishments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExtKeyAccomplishment extKeyAccomplishment : findAll()) {
			remove(extKeyAccomplishment);
		}
	}

	/**
	 * Returns the number of ext key accomplishments.
	 *
	 * @return the number of ext key accomplishments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EXTKEYACCOMPLISHMENT);

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
		return ExtKeyAccomplishmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ext key accomplishment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ExtKeyAccomplishmentImpl.class.getName());
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
	private static final String _SQL_SELECT_EXTKEYACCOMPLISHMENT = "SELECT extKeyAccomplishment FROM ExtKeyAccomplishment extKeyAccomplishment";
	private static final String _SQL_SELECT_EXTKEYACCOMPLISHMENT_WHERE_PKS_IN = "SELECT extKeyAccomplishment FROM ExtKeyAccomplishment extKeyAccomplishment WHERE extKeyAccomplishmentId IN (";
	private static final String _SQL_SELECT_EXTKEYACCOMPLISHMENT_WHERE = "SELECT extKeyAccomplishment FROM ExtKeyAccomplishment extKeyAccomplishment WHERE ";
	private static final String _SQL_COUNT_EXTKEYACCOMPLISHMENT = "SELECT COUNT(extKeyAccomplishment) FROM ExtKeyAccomplishment extKeyAccomplishment";
	private static final String _SQL_COUNT_EXTKEYACCOMPLISHMENT_WHERE = "SELECT COUNT(extKeyAccomplishment) FROM ExtKeyAccomplishment extKeyAccomplishment WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "extKeyAccomplishment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ExtKeyAccomplishment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ExtKeyAccomplishment exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ExtKeyAccomplishmentPersistenceImpl.class);
}