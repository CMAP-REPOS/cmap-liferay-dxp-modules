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

import ucc.portal.exception.NoSuchExtVocationalHistoryException;

import ucc.portal.model.ExtVocationalHistory;
import ucc.portal.model.impl.ExtVocationalHistoryImpl;
import ucc.portal.model.impl.ExtVocationalHistoryModelImpl;

import ucc.portal.service.persistence.ExtVocationalHistoryPersistence;

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
 * The persistence implementation for the ext vocational history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtVocationalHistoryPersistence
 * @see ucc.portal.service.persistence.ExtVocationalHistoryUtil
 * @generated
 */
@ProviderType
public class ExtVocationalHistoryPersistenceImpl extends BasePersistenceImpl<ExtVocationalHistory>
	implements ExtVocationalHistoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ExtVocationalHistoryUtil} to access the ext vocational history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ExtVocationalHistoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ExtVocationalHistoryModelImpl.FINDER_CACHE_ENABLED,
			ExtVocationalHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ExtVocationalHistoryModelImpl.FINDER_CACHE_ENABLED,
			ExtVocationalHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ExtVocationalHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ExtVocationalHistoryModelImpl.FINDER_CACHE_ENABLED,
			ExtVocationalHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ExtVocationalHistoryModelImpl.FINDER_CACHE_ENABLED,
			ExtVocationalHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			ExtVocationalHistoryModelImpl.USERID_COLUMN_BITMASK |
			ExtVocationalHistoryModelImpl.STARTDATEOFSERVICE_COLUMN_BITMASK |
			ExtVocationalHistoryModelImpl.ENDDATEOFSERVICE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ExtVocationalHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ext vocational histories where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching ext vocational histories
	 */
	@Override
	public List<ExtVocationalHistory> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext vocational histories where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext vocational histories
	 * @param end the upper bound of the range of ext vocational histories (not inclusive)
	 * @return the range of matching ext vocational histories
	 */
	@Override
	public List<ExtVocationalHistory> findByUserId(long userId, int start,
		int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext vocational histories where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext vocational histories
	 * @param end the upper bound of the range of ext vocational histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext vocational histories
	 */
	@Override
	public List<ExtVocationalHistory> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtVocationalHistory> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext vocational histories where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext vocational histories
	 * @param end the upper bound of the range of ext vocational histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ext vocational histories
	 */
	@Override
	public List<ExtVocationalHistory> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtVocationalHistory> orderByComparator,
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

		List<ExtVocationalHistory> list = null;

		if (retrieveFromCache) {
			list = (List<ExtVocationalHistory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExtVocationalHistory extVocationalHistory : list) {
					if ((userId != extVocationalHistory.getUserId())) {
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

			query.append(_SQL_SELECT_EXTVOCATIONALHISTORY_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExtVocationalHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<ExtVocationalHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtVocationalHistory>)QueryUtil.list(q,
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
	 * Returns the first ext vocational history in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext vocational history
	 * @throws NoSuchExtVocationalHistoryException if a matching ext vocational history could not be found
	 */
	@Override
	public ExtVocationalHistory findByUserId_First(long userId,
		OrderByComparator<ExtVocationalHistory> orderByComparator)
		throws NoSuchExtVocationalHistoryException {
		ExtVocationalHistory extVocationalHistory = fetchByUserId_First(userId,
				orderByComparator);

		if (extVocationalHistory != null) {
			return extVocationalHistory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtVocationalHistoryException(msg.toString());
	}

	/**
	 * Returns the first ext vocational history in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext vocational history, or <code>null</code> if a matching ext vocational history could not be found
	 */
	@Override
	public ExtVocationalHistory fetchByUserId_First(long userId,
		OrderByComparator<ExtVocationalHistory> orderByComparator) {
		List<ExtVocationalHistory> list = findByUserId(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext vocational history in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext vocational history
	 * @throws NoSuchExtVocationalHistoryException if a matching ext vocational history could not be found
	 */
	@Override
	public ExtVocationalHistory findByUserId_Last(long userId,
		OrderByComparator<ExtVocationalHistory> orderByComparator)
		throws NoSuchExtVocationalHistoryException {
		ExtVocationalHistory extVocationalHistory = fetchByUserId_Last(userId,
				orderByComparator);

		if (extVocationalHistory != null) {
			return extVocationalHistory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtVocationalHistoryException(msg.toString());
	}

	/**
	 * Returns the last ext vocational history in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext vocational history, or <code>null</code> if a matching ext vocational history could not be found
	 */
	@Override
	public ExtVocationalHistory fetchByUserId_Last(long userId,
		OrderByComparator<ExtVocationalHistory> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<ExtVocationalHistory> list = findByUserId(userId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext vocational histories before and after the current ext vocational history in the ordered set where userId = &#63;.
	 *
	 * @param extVocationalHistoryId the primary key of the current ext vocational history
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext vocational history
	 * @throws NoSuchExtVocationalHistoryException if a ext vocational history with the primary key could not be found
	 */
	@Override
	public ExtVocationalHistory[] findByUserId_PrevAndNext(
		long extVocationalHistoryId, long userId,
		OrderByComparator<ExtVocationalHistory> orderByComparator)
		throws NoSuchExtVocationalHistoryException {
		ExtVocationalHistory extVocationalHistory = findByPrimaryKey(extVocationalHistoryId);

		Session session = null;

		try {
			session = openSession();

			ExtVocationalHistory[] array = new ExtVocationalHistoryImpl[3];

			array[0] = getByUserId_PrevAndNext(session, extVocationalHistory,
					userId, orderByComparator, true);

			array[1] = extVocationalHistory;

			array[2] = getByUserId_PrevAndNext(session, extVocationalHistory,
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

	protected ExtVocationalHistory getByUserId_PrevAndNext(Session session,
		ExtVocationalHistory extVocationalHistory, long userId,
		OrderByComparator<ExtVocationalHistory> orderByComparator,
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

		query.append(_SQL_SELECT_EXTVOCATIONALHISTORY_WHERE);

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
			query.append(ExtVocationalHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(extVocationalHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ExtVocationalHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext vocational histories where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (ExtVocationalHistory extVocationalHistory : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(extVocationalHistory);
		}
	}

	/**
	 * Returns the number of ext vocational histories where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching ext vocational histories
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EXTVOCATIONALHISTORY_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "extVocationalHistory.userId = ?";

	public ExtVocationalHistoryPersistenceImpl() {
		setModelClass(ExtVocationalHistory.class);
	}

	/**
	 * Caches the ext vocational history in the entity cache if it is enabled.
	 *
	 * @param extVocationalHistory the ext vocational history
	 */
	@Override
	public void cacheResult(ExtVocationalHistory extVocationalHistory) {
		entityCache.putResult(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ExtVocationalHistoryImpl.class,
			extVocationalHistory.getPrimaryKey(), extVocationalHistory);

		extVocationalHistory.resetOriginalValues();
	}

	/**
	 * Caches the ext vocational histories in the entity cache if it is enabled.
	 *
	 * @param extVocationalHistories the ext vocational histories
	 */
	@Override
	public void cacheResult(List<ExtVocationalHistory> extVocationalHistories) {
		for (ExtVocationalHistory extVocationalHistory : extVocationalHistories) {
			if (entityCache.getResult(
						ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
						ExtVocationalHistoryImpl.class,
						extVocationalHistory.getPrimaryKey()) == null) {
				cacheResult(extVocationalHistory);
			}
			else {
				extVocationalHistory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ext vocational histories.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExtVocationalHistoryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ext vocational history.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ExtVocationalHistory extVocationalHistory) {
		entityCache.removeResult(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ExtVocationalHistoryImpl.class, extVocationalHistory.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ExtVocationalHistory> extVocationalHistories) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ExtVocationalHistory extVocationalHistory : extVocationalHistories) {
			entityCache.removeResult(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
				ExtVocationalHistoryImpl.class,
				extVocationalHistory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ext vocational history with the primary key. Does not add the ext vocational history to the database.
	 *
	 * @param extVocationalHistoryId the primary key for the new ext vocational history
	 * @return the new ext vocational history
	 */
	@Override
	public ExtVocationalHistory create(long extVocationalHistoryId) {
		ExtVocationalHistory extVocationalHistory = new ExtVocationalHistoryImpl();

		extVocationalHistory.setNew(true);
		extVocationalHistory.setPrimaryKey(extVocationalHistoryId);

		extVocationalHistory.setCompanyId(companyProvider.getCompanyId());

		return extVocationalHistory;
	}

	/**
	 * Removes the ext vocational history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param extVocationalHistoryId the primary key of the ext vocational history
	 * @return the ext vocational history that was removed
	 * @throws NoSuchExtVocationalHistoryException if a ext vocational history with the primary key could not be found
	 */
	@Override
	public ExtVocationalHistory remove(long extVocationalHistoryId)
		throws NoSuchExtVocationalHistoryException {
		return remove((Serializable)extVocationalHistoryId);
	}

	/**
	 * Removes the ext vocational history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ext vocational history
	 * @return the ext vocational history that was removed
	 * @throws NoSuchExtVocationalHistoryException if a ext vocational history with the primary key could not be found
	 */
	@Override
	public ExtVocationalHistory remove(Serializable primaryKey)
		throws NoSuchExtVocationalHistoryException {
		Session session = null;

		try {
			session = openSession();

			ExtVocationalHistory extVocationalHistory = (ExtVocationalHistory)session.get(ExtVocationalHistoryImpl.class,
					primaryKey);

			if (extVocationalHistory == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExtVocationalHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(extVocationalHistory);
		}
		catch (NoSuchExtVocationalHistoryException nsee) {
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
	protected ExtVocationalHistory removeImpl(
		ExtVocationalHistory extVocationalHistory) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(extVocationalHistory)) {
				extVocationalHistory = (ExtVocationalHistory)session.get(ExtVocationalHistoryImpl.class,
						extVocationalHistory.getPrimaryKeyObj());
			}

			if (extVocationalHistory != null) {
				session.delete(extVocationalHistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (extVocationalHistory != null) {
			clearCache(extVocationalHistory);
		}

		return extVocationalHistory;
	}

	@Override
	public ExtVocationalHistory updateImpl(
		ExtVocationalHistory extVocationalHistory) {
		boolean isNew = extVocationalHistory.isNew();

		if (!(extVocationalHistory instanceof ExtVocationalHistoryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(extVocationalHistory.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(extVocationalHistory);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in extVocationalHistory proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExtVocationalHistory implementation " +
				extVocationalHistory.getClass());
		}

		ExtVocationalHistoryModelImpl extVocationalHistoryModelImpl = (ExtVocationalHistoryModelImpl)extVocationalHistory;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (extVocationalHistory.getCreateDate() == null)) {
			if (serviceContext == null) {
				extVocationalHistory.setCreateDate(now);
			}
			else {
				extVocationalHistory.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!extVocationalHistoryModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				extVocationalHistory.setModifiedDate(now);
			}
			else {
				extVocationalHistory.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (extVocationalHistory.isNew()) {
				session.save(extVocationalHistory);

				extVocationalHistory.setNew(false);
			}
			else {
				extVocationalHistory = (ExtVocationalHistory)session.merge(extVocationalHistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ExtVocationalHistoryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					extVocationalHistoryModelImpl.getUserId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((extVocationalHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						extVocationalHistoryModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { extVocationalHistoryModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		entityCache.putResult(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ExtVocationalHistoryImpl.class,
			extVocationalHistory.getPrimaryKey(), extVocationalHistory, false);

		extVocationalHistory.resetOriginalValues();

		return extVocationalHistory;
	}

	/**
	 * Returns the ext vocational history with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext vocational history
	 * @return the ext vocational history
	 * @throws NoSuchExtVocationalHistoryException if a ext vocational history with the primary key could not be found
	 */
	@Override
	public ExtVocationalHistory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExtVocationalHistoryException {
		ExtVocationalHistory extVocationalHistory = fetchByPrimaryKey(primaryKey);

		if (extVocationalHistory == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExtVocationalHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return extVocationalHistory;
	}

	/**
	 * Returns the ext vocational history with the primary key or throws a {@link NoSuchExtVocationalHistoryException} if it could not be found.
	 *
	 * @param extVocationalHistoryId the primary key of the ext vocational history
	 * @return the ext vocational history
	 * @throws NoSuchExtVocationalHistoryException if a ext vocational history with the primary key could not be found
	 */
	@Override
	public ExtVocationalHistory findByPrimaryKey(long extVocationalHistoryId)
		throws NoSuchExtVocationalHistoryException {
		return findByPrimaryKey((Serializable)extVocationalHistoryId);
	}

	/**
	 * Returns the ext vocational history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext vocational history
	 * @return the ext vocational history, or <code>null</code> if a ext vocational history with the primary key could not be found
	 */
	@Override
	public ExtVocationalHistory fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
				ExtVocationalHistoryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ExtVocationalHistory extVocationalHistory = (ExtVocationalHistory)serializable;

		if (extVocationalHistory == null) {
			Session session = null;

			try {
				session = openSession();

				extVocationalHistory = (ExtVocationalHistory)session.get(ExtVocationalHistoryImpl.class,
						primaryKey);

				if (extVocationalHistory != null) {
					cacheResult(extVocationalHistory);
				}
				else {
					entityCache.putResult(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
						ExtVocationalHistoryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
					ExtVocationalHistoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return extVocationalHistory;
	}

	/**
	 * Returns the ext vocational history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param extVocationalHistoryId the primary key of the ext vocational history
	 * @return the ext vocational history, or <code>null</code> if a ext vocational history with the primary key could not be found
	 */
	@Override
	public ExtVocationalHistory fetchByPrimaryKey(long extVocationalHistoryId) {
		return fetchByPrimaryKey((Serializable)extVocationalHistoryId);
	}

	@Override
	public Map<Serializable, ExtVocationalHistory> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ExtVocationalHistory> map = new HashMap<Serializable, ExtVocationalHistory>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ExtVocationalHistory extVocationalHistory = fetchByPrimaryKey(primaryKey);

			if (extVocationalHistory != null) {
				map.put(primaryKey, extVocationalHistory);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
					ExtVocationalHistoryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ExtVocationalHistory)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EXTVOCATIONALHISTORY_WHERE_PKS_IN);

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

			for (ExtVocationalHistory extVocationalHistory : (List<ExtVocationalHistory>)q.list()) {
				map.put(extVocationalHistory.getPrimaryKeyObj(),
					extVocationalHistory);

				cacheResult(extVocationalHistory);

				uncachedPrimaryKeys.remove(extVocationalHistory.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ExtVocationalHistoryModelImpl.ENTITY_CACHE_ENABLED,
					ExtVocationalHistoryImpl.class, primaryKey, nullModel);
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
	 * Returns all the ext vocational histories.
	 *
	 * @return the ext vocational histories
	 */
	@Override
	public List<ExtVocationalHistory> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext vocational histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext vocational histories
	 * @param end the upper bound of the range of ext vocational histories (not inclusive)
	 * @return the range of ext vocational histories
	 */
	@Override
	public List<ExtVocationalHistory> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext vocational histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext vocational histories
	 * @param end the upper bound of the range of ext vocational histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ext vocational histories
	 */
	@Override
	public List<ExtVocationalHistory> findAll(int start, int end,
		OrderByComparator<ExtVocationalHistory> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext vocational histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext vocational histories
	 * @param end the upper bound of the range of ext vocational histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ext vocational histories
	 */
	@Override
	public List<ExtVocationalHistory> findAll(int start, int end,
		OrderByComparator<ExtVocationalHistory> orderByComparator,
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

		List<ExtVocationalHistory> list = null;

		if (retrieveFromCache) {
			list = (List<ExtVocationalHistory>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EXTVOCATIONALHISTORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXTVOCATIONALHISTORY;

				if (pagination) {
					sql = sql.concat(ExtVocationalHistoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ExtVocationalHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtVocationalHistory>)QueryUtil.list(q,
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
	 * Removes all the ext vocational histories from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExtVocationalHistory extVocationalHistory : findAll()) {
			remove(extVocationalHistory);
		}
	}

	/**
	 * Returns the number of ext vocational histories.
	 *
	 * @return the number of ext vocational histories
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EXTVOCATIONALHISTORY);

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
		return ExtVocationalHistoryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ext vocational history persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ExtVocationalHistoryImpl.class.getName());
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
	private static final String _SQL_SELECT_EXTVOCATIONALHISTORY = "SELECT extVocationalHistory FROM ExtVocationalHistory extVocationalHistory";
	private static final String _SQL_SELECT_EXTVOCATIONALHISTORY_WHERE_PKS_IN = "SELECT extVocationalHistory FROM ExtVocationalHistory extVocationalHistory WHERE extVocationalHistoryId IN (";
	private static final String _SQL_SELECT_EXTVOCATIONALHISTORY_WHERE = "SELECT extVocationalHistory FROM ExtVocationalHistory extVocationalHistory WHERE ";
	private static final String _SQL_COUNT_EXTVOCATIONALHISTORY = "SELECT COUNT(extVocationalHistory) FROM ExtVocationalHistory extVocationalHistory";
	private static final String _SQL_COUNT_EXTVOCATIONALHISTORY_WHERE = "SELECT COUNT(extVocationalHistory) FROM ExtVocationalHistory extVocationalHistory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "extVocationalHistory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ExtVocationalHistory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ExtVocationalHistory exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ExtVocationalHistoryPersistenceImpl.class);
}