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

import ucc.portal.exception.NoSuchExtDownloadLogException;

import ucc.portal.model.ExtDownloadLog;
import ucc.portal.model.impl.ExtDownloadLogImpl;
import ucc.portal.model.impl.ExtDownloadLogModelImpl;

import ucc.portal.service.persistence.ExtDownloadLogPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Timestamp;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the ext download log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtDownloadLogPersistence
 * @see ucc.portal.service.persistence.ExtDownloadLogUtil
 * @generated
 */
@ProviderType
public class ExtDownloadLogPersistenceImpl extends BasePersistenceImpl<ExtDownloadLog>
	implements ExtDownloadLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ExtDownloadLogUtil} to access the ext download log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ExtDownloadLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
			ExtDownloadLogModelImpl.FINDER_CACHE_ENABLED,
			ExtDownloadLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
			ExtDownloadLogModelImpl.FINDER_CACHE_ENABLED,
			ExtDownloadLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
			ExtDownloadLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
			ExtDownloadLogModelImpl.FINDER_CACHE_ENABLED,
			ExtDownloadLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
			ExtDownloadLogModelImpl.FINDER_CACHE_ENABLED,
			ExtDownloadLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			ExtDownloadLogModelImpl.USERID_COLUMN_BITMASK |
			ExtDownloadLogModelImpl.DOWNLOADDATE_COLUMN_BITMASK |
			ExtDownloadLogModelImpl.WITHDRAWALDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
			ExtDownloadLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ext download logs where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching ext download logs
	 */
	@Override
	public List<ExtDownloadLog> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext download logs where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext download logs
	 * @param end the upper bound of the range of ext download logs (not inclusive)
	 * @return the range of matching ext download logs
	 */
	@Override
	public List<ExtDownloadLog> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext download logs where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext download logs
	 * @param end the upper bound of the range of ext download logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext download logs
	 */
	@Override
	public List<ExtDownloadLog> findByUserId(long userId, int start, int end,
		OrderByComparator<ExtDownloadLog> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext download logs where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext download logs
	 * @param end the upper bound of the range of ext download logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ext download logs
	 */
	@Override
	public List<ExtDownloadLog> findByUserId(long userId, int start, int end,
		OrderByComparator<ExtDownloadLog> orderByComparator,
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

		List<ExtDownloadLog> list = null;

		if (retrieveFromCache) {
			list = (List<ExtDownloadLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExtDownloadLog extDownloadLog : list) {
					if ((userId != extDownloadLog.getUserId())) {
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

			query.append(_SQL_SELECT_EXTDOWNLOADLOG_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExtDownloadLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<ExtDownloadLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtDownloadLog>)QueryUtil.list(q,
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
	 * Returns the first ext download log in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext download log
	 * @throws NoSuchExtDownloadLogException if a matching ext download log could not be found
	 */
	@Override
	public ExtDownloadLog findByUserId_First(long userId,
		OrderByComparator<ExtDownloadLog> orderByComparator)
		throws NoSuchExtDownloadLogException {
		ExtDownloadLog extDownloadLog = fetchByUserId_First(userId,
				orderByComparator);

		if (extDownloadLog != null) {
			return extDownloadLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtDownloadLogException(msg.toString());
	}

	/**
	 * Returns the first ext download log in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext download log, or <code>null</code> if a matching ext download log could not be found
	 */
	@Override
	public ExtDownloadLog fetchByUserId_First(long userId,
		OrderByComparator<ExtDownloadLog> orderByComparator) {
		List<ExtDownloadLog> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext download log in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext download log
	 * @throws NoSuchExtDownloadLogException if a matching ext download log could not be found
	 */
	@Override
	public ExtDownloadLog findByUserId_Last(long userId,
		OrderByComparator<ExtDownloadLog> orderByComparator)
		throws NoSuchExtDownloadLogException {
		ExtDownloadLog extDownloadLog = fetchByUserId_Last(userId,
				orderByComparator);

		if (extDownloadLog != null) {
			return extDownloadLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtDownloadLogException(msg.toString());
	}

	/**
	 * Returns the last ext download log in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext download log, or <code>null</code> if a matching ext download log could not be found
	 */
	@Override
	public ExtDownloadLog fetchByUserId_Last(long userId,
		OrderByComparator<ExtDownloadLog> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<ExtDownloadLog> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext download logs before and after the current ext download log in the ordered set where userId = &#63;.
	 *
	 * @param extDownloadLogId the primary key of the current ext download log
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext download log
	 * @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	 */
	@Override
	public ExtDownloadLog[] findByUserId_PrevAndNext(long extDownloadLogId,
		long userId, OrderByComparator<ExtDownloadLog> orderByComparator)
		throws NoSuchExtDownloadLogException {
		ExtDownloadLog extDownloadLog = findByPrimaryKey(extDownloadLogId);

		Session session = null;

		try {
			session = openSession();

			ExtDownloadLog[] array = new ExtDownloadLogImpl[3];

			array[0] = getByUserId_PrevAndNext(session, extDownloadLog, userId,
					orderByComparator, true);

			array[1] = extDownloadLog;

			array[2] = getByUserId_PrevAndNext(session, extDownloadLog, userId,
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

	protected ExtDownloadLog getByUserId_PrevAndNext(Session session,
		ExtDownloadLog extDownloadLog, long userId,
		OrderByComparator<ExtDownloadLog> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EXTDOWNLOADLOG_WHERE);

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
			query.append(ExtDownloadLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(extDownloadLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ExtDownloadLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext download logs where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (ExtDownloadLog extDownloadLog : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(extDownloadLog);
		}
	}

	/**
	 * Returns the number of ext download logs where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching ext download logs
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EXTDOWNLOADLOG_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "extDownloadLog.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U_W = new FinderPath(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
			ExtDownloadLogModelImpl.FINDER_CACHE_ENABLED,
			ExtDownloadLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByU_W",
			new String[] {
				Long.class.getName(), Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_W = new FinderPath(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
			ExtDownloadLogModelImpl.FINDER_CACHE_ENABLED,
			ExtDownloadLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU_W",
			new String[] { Long.class.getName(), Date.class.getName() },
			ExtDownloadLogModelImpl.USERID_COLUMN_BITMASK |
			ExtDownloadLogModelImpl.WITHDRAWALDATE_COLUMN_BITMASK |
			ExtDownloadLogModelImpl.DOWNLOADDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_W = new FinderPath(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
			ExtDownloadLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_W",
			new String[] { Long.class.getName(), Date.class.getName() });

	/**
	 * Returns all the ext download logs where userId = &#63; and withdrawalDate = &#63;.
	 *
	 * @param userId the user ID
	 * @param withdrawalDate the withdrawal date
	 * @return the matching ext download logs
	 */
	@Override
	public List<ExtDownloadLog> findByU_W(long userId, Date withdrawalDate) {
		return findByU_W(userId, withdrawalDate, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext download logs where userId = &#63; and withdrawalDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param withdrawalDate the withdrawal date
	 * @param start the lower bound of the range of ext download logs
	 * @param end the upper bound of the range of ext download logs (not inclusive)
	 * @return the range of matching ext download logs
	 */
	@Override
	public List<ExtDownloadLog> findByU_W(long userId, Date withdrawalDate,
		int start, int end) {
		return findByU_W(userId, withdrawalDate, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext download logs where userId = &#63; and withdrawalDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param withdrawalDate the withdrawal date
	 * @param start the lower bound of the range of ext download logs
	 * @param end the upper bound of the range of ext download logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext download logs
	 */
	@Override
	public List<ExtDownloadLog> findByU_W(long userId, Date withdrawalDate,
		int start, int end, OrderByComparator<ExtDownloadLog> orderByComparator) {
		return findByU_W(userId, withdrawalDate, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the ext download logs where userId = &#63; and withdrawalDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param withdrawalDate the withdrawal date
	 * @param start the lower bound of the range of ext download logs
	 * @param end the upper bound of the range of ext download logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ext download logs
	 */
	@Override
	public List<ExtDownloadLog> findByU_W(long userId, Date withdrawalDate,
		int start, int end,
		OrderByComparator<ExtDownloadLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_W;
			finderArgs = new Object[] { userId, _getTime(withdrawalDate) };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U_W;
			finderArgs = new Object[] {
					userId, _getTime(withdrawalDate),
					
					start, end, orderByComparator
				};
		}

		List<ExtDownloadLog> list = null;

		if (retrieveFromCache) {
			list = (List<ExtDownloadLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExtDownloadLog extDownloadLog : list) {
					if ((userId != extDownloadLog.getUserId()) ||
							!Objects.equals(withdrawalDate,
								extDownloadLog.getWithdrawalDate())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_EXTDOWNLOADLOG_WHERE);

			query.append(_FINDER_COLUMN_U_W_USERID_2);

			boolean bindWithdrawalDate = false;

			if (withdrawalDate == null) {
				query.append(_FINDER_COLUMN_U_W_WITHDRAWALDATE_1);
			}
			else {
				bindWithdrawalDate = true;

				query.append(_FINDER_COLUMN_U_W_WITHDRAWALDATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExtDownloadLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindWithdrawalDate) {
					qPos.add(new Timestamp(withdrawalDate.getTime()));
				}

				if (!pagination) {
					list = (List<ExtDownloadLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtDownloadLog>)QueryUtil.list(q,
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
	 * Returns the first ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	 *
	 * @param userId the user ID
	 * @param withdrawalDate the withdrawal date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext download log
	 * @throws NoSuchExtDownloadLogException if a matching ext download log could not be found
	 */
	@Override
	public ExtDownloadLog findByU_W_First(long userId, Date withdrawalDate,
		OrderByComparator<ExtDownloadLog> orderByComparator)
		throws NoSuchExtDownloadLogException {
		ExtDownloadLog extDownloadLog = fetchByU_W_First(userId,
				withdrawalDate, orderByComparator);

		if (extDownloadLog != null) {
			return extDownloadLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", withdrawalDate=");
		msg.append(withdrawalDate);

		msg.append("}");

		throw new NoSuchExtDownloadLogException(msg.toString());
	}

	/**
	 * Returns the first ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	 *
	 * @param userId the user ID
	 * @param withdrawalDate the withdrawal date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext download log, or <code>null</code> if a matching ext download log could not be found
	 */
	@Override
	public ExtDownloadLog fetchByU_W_First(long userId, Date withdrawalDate,
		OrderByComparator<ExtDownloadLog> orderByComparator) {
		List<ExtDownloadLog> list = findByU_W(userId, withdrawalDate, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	 *
	 * @param userId the user ID
	 * @param withdrawalDate the withdrawal date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext download log
	 * @throws NoSuchExtDownloadLogException if a matching ext download log could not be found
	 */
	@Override
	public ExtDownloadLog findByU_W_Last(long userId, Date withdrawalDate,
		OrderByComparator<ExtDownloadLog> orderByComparator)
		throws NoSuchExtDownloadLogException {
		ExtDownloadLog extDownloadLog = fetchByU_W_Last(userId, withdrawalDate,
				orderByComparator);

		if (extDownloadLog != null) {
			return extDownloadLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", withdrawalDate=");
		msg.append(withdrawalDate);

		msg.append("}");

		throw new NoSuchExtDownloadLogException(msg.toString());
	}

	/**
	 * Returns the last ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	 *
	 * @param userId the user ID
	 * @param withdrawalDate the withdrawal date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext download log, or <code>null</code> if a matching ext download log could not be found
	 */
	@Override
	public ExtDownloadLog fetchByU_W_Last(long userId, Date withdrawalDate,
		OrderByComparator<ExtDownloadLog> orderByComparator) {
		int count = countByU_W(userId, withdrawalDate);

		if (count == 0) {
			return null;
		}

		List<ExtDownloadLog> list = findByU_W(userId, withdrawalDate,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext download logs before and after the current ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	 *
	 * @param extDownloadLogId the primary key of the current ext download log
	 * @param userId the user ID
	 * @param withdrawalDate the withdrawal date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext download log
	 * @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	 */
	@Override
	public ExtDownloadLog[] findByU_W_PrevAndNext(long extDownloadLogId,
		long userId, Date withdrawalDate,
		OrderByComparator<ExtDownloadLog> orderByComparator)
		throws NoSuchExtDownloadLogException {
		ExtDownloadLog extDownloadLog = findByPrimaryKey(extDownloadLogId);

		Session session = null;

		try {
			session = openSession();

			ExtDownloadLog[] array = new ExtDownloadLogImpl[3];

			array[0] = getByU_W_PrevAndNext(session, extDownloadLog, userId,
					withdrawalDate, orderByComparator, true);

			array[1] = extDownloadLog;

			array[2] = getByU_W_PrevAndNext(session, extDownloadLog, userId,
					withdrawalDate, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ExtDownloadLog getByU_W_PrevAndNext(Session session,
		ExtDownloadLog extDownloadLog, long userId, Date withdrawalDate,
		OrderByComparator<ExtDownloadLog> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_EXTDOWNLOADLOG_WHERE);

		query.append(_FINDER_COLUMN_U_W_USERID_2);

		boolean bindWithdrawalDate = false;

		if (withdrawalDate == null) {
			query.append(_FINDER_COLUMN_U_W_WITHDRAWALDATE_1);
		}
		else {
			bindWithdrawalDate = true;

			query.append(_FINDER_COLUMN_U_W_WITHDRAWALDATE_2);
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
			query.append(ExtDownloadLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (bindWithdrawalDate) {
			qPos.add(new Timestamp(withdrawalDate.getTime()));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(extDownloadLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ExtDownloadLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext download logs where userId = &#63; and withdrawalDate = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param withdrawalDate the withdrawal date
	 */
	@Override
	public void removeByU_W(long userId, Date withdrawalDate) {
		for (ExtDownloadLog extDownloadLog : findByU_W(userId, withdrawalDate,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(extDownloadLog);
		}
	}

	/**
	 * Returns the number of ext download logs where userId = &#63; and withdrawalDate = &#63;.
	 *
	 * @param userId the user ID
	 * @param withdrawalDate the withdrawal date
	 * @return the number of matching ext download logs
	 */
	@Override
	public int countByU_W(long userId, Date withdrawalDate) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_W;

		Object[] finderArgs = new Object[] { userId, _getTime(withdrawalDate) };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_EXTDOWNLOADLOG_WHERE);

			query.append(_FINDER_COLUMN_U_W_USERID_2);

			boolean bindWithdrawalDate = false;

			if (withdrawalDate == null) {
				query.append(_FINDER_COLUMN_U_W_WITHDRAWALDATE_1);
			}
			else {
				bindWithdrawalDate = true;

				query.append(_FINDER_COLUMN_U_W_WITHDRAWALDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindWithdrawalDate) {
					qPos.add(new Timestamp(withdrawalDate.getTime()));
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

	private static final String _FINDER_COLUMN_U_W_USERID_2 = "extDownloadLog.userId = ? AND ";
	private static final String _FINDER_COLUMN_U_W_WITHDRAWALDATE_1 = "extDownloadLog.withdrawalDate IS NULL";
	private static final String _FINDER_COLUMN_U_W_WITHDRAWALDATE_2 = "extDownloadLog.withdrawalDate = ?";

	public ExtDownloadLogPersistenceImpl() {
		setModelClass(ExtDownloadLog.class);
	}

	/**
	 * Caches the ext download log in the entity cache if it is enabled.
	 *
	 * @param extDownloadLog the ext download log
	 */
	@Override
	public void cacheResult(ExtDownloadLog extDownloadLog) {
		entityCache.putResult(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
			ExtDownloadLogImpl.class, extDownloadLog.getPrimaryKey(),
			extDownloadLog);

		extDownloadLog.resetOriginalValues();
	}

	/**
	 * Caches the ext download logs in the entity cache if it is enabled.
	 *
	 * @param extDownloadLogs the ext download logs
	 */
	@Override
	public void cacheResult(List<ExtDownloadLog> extDownloadLogs) {
		for (ExtDownloadLog extDownloadLog : extDownloadLogs) {
			if (entityCache.getResult(
						ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
						ExtDownloadLogImpl.class, extDownloadLog.getPrimaryKey()) == null) {
				cacheResult(extDownloadLog);
			}
			else {
				extDownloadLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ext download logs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExtDownloadLogImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ext download log.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ExtDownloadLog extDownloadLog) {
		entityCache.removeResult(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
			ExtDownloadLogImpl.class, extDownloadLog.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ExtDownloadLog> extDownloadLogs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ExtDownloadLog extDownloadLog : extDownloadLogs) {
			entityCache.removeResult(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
				ExtDownloadLogImpl.class, extDownloadLog.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ext download log with the primary key. Does not add the ext download log to the database.
	 *
	 * @param extDownloadLogId the primary key for the new ext download log
	 * @return the new ext download log
	 */
	@Override
	public ExtDownloadLog create(long extDownloadLogId) {
		ExtDownloadLog extDownloadLog = new ExtDownloadLogImpl();

		extDownloadLog.setNew(true);
		extDownloadLog.setPrimaryKey(extDownloadLogId);

		extDownloadLog.setCompanyId(companyProvider.getCompanyId());

		return extDownloadLog;
	}

	/**
	 * Removes the ext download log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param extDownloadLogId the primary key of the ext download log
	 * @return the ext download log that was removed
	 * @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	 */
	@Override
	public ExtDownloadLog remove(long extDownloadLogId)
		throws NoSuchExtDownloadLogException {
		return remove((Serializable)extDownloadLogId);
	}

	/**
	 * Removes the ext download log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ext download log
	 * @return the ext download log that was removed
	 * @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	 */
	@Override
	public ExtDownloadLog remove(Serializable primaryKey)
		throws NoSuchExtDownloadLogException {
		Session session = null;

		try {
			session = openSession();

			ExtDownloadLog extDownloadLog = (ExtDownloadLog)session.get(ExtDownloadLogImpl.class,
					primaryKey);

			if (extDownloadLog == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExtDownloadLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(extDownloadLog);
		}
		catch (NoSuchExtDownloadLogException nsee) {
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
	protected ExtDownloadLog removeImpl(ExtDownloadLog extDownloadLog) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(extDownloadLog)) {
				extDownloadLog = (ExtDownloadLog)session.get(ExtDownloadLogImpl.class,
						extDownloadLog.getPrimaryKeyObj());
			}

			if (extDownloadLog != null) {
				session.delete(extDownloadLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (extDownloadLog != null) {
			clearCache(extDownloadLog);
		}

		return extDownloadLog;
	}

	@Override
	public ExtDownloadLog updateImpl(ExtDownloadLog extDownloadLog) {
		boolean isNew = extDownloadLog.isNew();

		if (!(extDownloadLog instanceof ExtDownloadLogModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(extDownloadLog.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(extDownloadLog);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in extDownloadLog proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExtDownloadLog implementation " +
				extDownloadLog.getClass());
		}

		ExtDownloadLogModelImpl extDownloadLogModelImpl = (ExtDownloadLogModelImpl)extDownloadLog;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (extDownloadLog.getCreateDate() == null)) {
			if (serviceContext == null) {
				extDownloadLog.setCreateDate(now);
			}
			else {
				extDownloadLog.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!extDownloadLogModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				extDownloadLog.setModifiedDate(now);
			}
			else {
				extDownloadLog.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (extDownloadLog.isNew()) {
				session.save(extDownloadLog);

				extDownloadLog.setNew(false);
			}
			else {
				extDownloadLog = (ExtDownloadLog)session.merge(extDownloadLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ExtDownloadLogModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { extDownloadLogModelImpl.getUserId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
				args);

			args = new Object[] {
					extDownloadLogModelImpl.getUserId(),
					extDownloadLogModelImpl.getWithdrawalDate()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_U_W, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_W,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((extDownloadLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						extDownloadLogModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { extDownloadLogModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}

			if ((extDownloadLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_W.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						extDownloadLogModelImpl.getOriginalUserId(),
						extDownloadLogModelImpl.getOriginalWithdrawalDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_W, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_W,
					args);

				args = new Object[] {
						extDownloadLogModelImpl.getUserId(),
						extDownloadLogModelImpl.getWithdrawalDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_W, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_W,
					args);
			}
		}

		entityCache.putResult(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
			ExtDownloadLogImpl.class, extDownloadLog.getPrimaryKey(),
			extDownloadLog, false);

		extDownloadLog.resetOriginalValues();

		return extDownloadLog;
	}

	/**
	 * Returns the ext download log with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext download log
	 * @return the ext download log
	 * @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	 */
	@Override
	public ExtDownloadLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExtDownloadLogException {
		ExtDownloadLog extDownloadLog = fetchByPrimaryKey(primaryKey);

		if (extDownloadLog == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExtDownloadLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return extDownloadLog;
	}

	/**
	 * Returns the ext download log with the primary key or throws a {@link NoSuchExtDownloadLogException} if it could not be found.
	 *
	 * @param extDownloadLogId the primary key of the ext download log
	 * @return the ext download log
	 * @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	 */
	@Override
	public ExtDownloadLog findByPrimaryKey(long extDownloadLogId)
		throws NoSuchExtDownloadLogException {
		return findByPrimaryKey((Serializable)extDownloadLogId);
	}

	/**
	 * Returns the ext download log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext download log
	 * @return the ext download log, or <code>null</code> if a ext download log with the primary key could not be found
	 */
	@Override
	public ExtDownloadLog fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
				ExtDownloadLogImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ExtDownloadLog extDownloadLog = (ExtDownloadLog)serializable;

		if (extDownloadLog == null) {
			Session session = null;

			try {
				session = openSession();

				extDownloadLog = (ExtDownloadLog)session.get(ExtDownloadLogImpl.class,
						primaryKey);

				if (extDownloadLog != null) {
					cacheResult(extDownloadLog);
				}
				else {
					entityCache.putResult(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
						ExtDownloadLogImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
					ExtDownloadLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return extDownloadLog;
	}

	/**
	 * Returns the ext download log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param extDownloadLogId the primary key of the ext download log
	 * @return the ext download log, or <code>null</code> if a ext download log with the primary key could not be found
	 */
	@Override
	public ExtDownloadLog fetchByPrimaryKey(long extDownloadLogId) {
		return fetchByPrimaryKey((Serializable)extDownloadLogId);
	}

	@Override
	public Map<Serializable, ExtDownloadLog> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ExtDownloadLog> map = new HashMap<Serializable, ExtDownloadLog>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ExtDownloadLog extDownloadLog = fetchByPrimaryKey(primaryKey);

			if (extDownloadLog != null) {
				map.put(primaryKey, extDownloadLog);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
					ExtDownloadLogImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ExtDownloadLog)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EXTDOWNLOADLOG_WHERE_PKS_IN);

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

			for (ExtDownloadLog extDownloadLog : (List<ExtDownloadLog>)q.list()) {
				map.put(extDownloadLog.getPrimaryKeyObj(), extDownloadLog);

				cacheResult(extDownloadLog);

				uncachedPrimaryKeys.remove(extDownloadLog.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ExtDownloadLogModelImpl.ENTITY_CACHE_ENABLED,
					ExtDownloadLogImpl.class, primaryKey, nullModel);
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
	 * Returns all the ext download logs.
	 *
	 * @return the ext download logs
	 */
	@Override
	public List<ExtDownloadLog> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext download logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext download logs
	 * @param end the upper bound of the range of ext download logs (not inclusive)
	 * @return the range of ext download logs
	 */
	@Override
	public List<ExtDownloadLog> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext download logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext download logs
	 * @param end the upper bound of the range of ext download logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ext download logs
	 */
	@Override
	public List<ExtDownloadLog> findAll(int start, int end,
		OrderByComparator<ExtDownloadLog> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext download logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext download logs
	 * @param end the upper bound of the range of ext download logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ext download logs
	 */
	@Override
	public List<ExtDownloadLog> findAll(int start, int end,
		OrderByComparator<ExtDownloadLog> orderByComparator,
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

		List<ExtDownloadLog> list = null;

		if (retrieveFromCache) {
			list = (List<ExtDownloadLog>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EXTDOWNLOADLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXTDOWNLOADLOG;

				if (pagination) {
					sql = sql.concat(ExtDownloadLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ExtDownloadLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtDownloadLog>)QueryUtil.list(q,
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
	 * Removes all the ext download logs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExtDownloadLog extDownloadLog : findAll()) {
			remove(extDownloadLog);
		}
	}

	/**
	 * Returns the number of ext download logs.
	 *
	 * @return the number of ext download logs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EXTDOWNLOADLOG);

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
		return ExtDownloadLogModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ext download log persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ExtDownloadLogImpl.class.getName());
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

	private Long _getTime(Date date) {
		if (date == null) {
			return null;
		}

		return date.getTime();
	}

	private static final String _SQL_SELECT_EXTDOWNLOADLOG = "SELECT extDownloadLog FROM ExtDownloadLog extDownloadLog";
	private static final String _SQL_SELECT_EXTDOWNLOADLOG_WHERE_PKS_IN = "SELECT extDownloadLog FROM ExtDownloadLog extDownloadLog WHERE extDownloadLogId IN (";
	private static final String _SQL_SELECT_EXTDOWNLOADLOG_WHERE = "SELECT extDownloadLog FROM ExtDownloadLog extDownloadLog WHERE ";
	private static final String _SQL_COUNT_EXTDOWNLOADLOG = "SELECT COUNT(extDownloadLog) FROM ExtDownloadLog extDownloadLog";
	private static final String _SQL_COUNT_EXTDOWNLOADLOG_WHERE = "SELECT COUNT(extDownloadLog) FROM ExtDownloadLog extDownloadLog WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "extDownloadLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ExtDownloadLog exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ExtDownloadLog exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ExtDownloadLogPersistenceImpl.class);
}