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

import ucc.portal.exception.NoSuchExtReferenceException;

import ucc.portal.model.ExtReference;
import ucc.portal.model.impl.ExtReferenceImpl;
import ucc.portal.model.impl.ExtReferenceModelImpl;

import ucc.portal.service.persistence.ExtReferencePersistence;

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
 * The persistence implementation for the ext reference service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtReferencePersistence
 * @see ucc.portal.service.persistence.ExtReferenceUtil
 * @generated
 */
@ProviderType
public class ExtReferencePersistenceImpl extends BasePersistenceImpl<ExtReference>
	implements ExtReferencePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ExtReferenceUtil} to access the ext reference persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ExtReferenceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
			ExtReferenceModelImpl.FINDER_CACHE_ENABLED, ExtReferenceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
			ExtReferenceModelImpl.FINDER_CACHE_ENABLED, ExtReferenceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
			ExtReferenceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
			ExtReferenceModelImpl.FINDER_CACHE_ENABLED, ExtReferenceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
			ExtReferenceModelImpl.FINDER_CACHE_ENABLED, ExtReferenceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			ExtReferenceModelImpl.USERID_COLUMN_BITMASK |
			ExtReferenceModelImpl.EMAILDATE_COLUMN_BITMASK |
			ExtReferenceModelImpl.USERLASTNAME_COLUMN_BITMASK |
			ExtReferenceModelImpl.USERFIRSTNAME_COLUMN_BITMASK |
			ExtReferenceModelImpl.USERMIDDLENAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
			ExtReferenceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ext references where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching ext references
	 */
	@Override
	public List<ExtReference> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext references where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext references
	 * @param end the upper bound of the range of ext references (not inclusive)
	 * @return the range of matching ext references
	 */
	@Override
	public List<ExtReference> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext references where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext references
	 * @param end the upper bound of the range of ext references (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext references
	 */
	@Override
	public List<ExtReference> findByUserId(long userId, int start, int end,
		OrderByComparator<ExtReference> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext references where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext references
	 * @param end the upper bound of the range of ext references (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ext references
	 */
	@Override
	public List<ExtReference> findByUserId(long userId, int start, int end,
		OrderByComparator<ExtReference> orderByComparator,
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

		List<ExtReference> list = null;

		if (retrieveFromCache) {
			list = (List<ExtReference>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExtReference extReference : list) {
					if ((userId != extReference.getUserId())) {
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

			query.append(_SQL_SELECT_EXTREFERENCE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExtReferenceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<ExtReference>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtReference>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ext reference in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext reference
	 * @throws NoSuchExtReferenceException if a matching ext reference could not be found
	 */
	@Override
	public ExtReference findByUserId_First(long userId,
		OrderByComparator<ExtReference> orderByComparator)
		throws NoSuchExtReferenceException {
		ExtReference extReference = fetchByUserId_First(userId,
				orderByComparator);

		if (extReference != null) {
			return extReference;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtReferenceException(msg.toString());
	}

	/**
	 * Returns the first ext reference in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext reference, or <code>null</code> if a matching ext reference could not be found
	 */
	@Override
	public ExtReference fetchByUserId_First(long userId,
		OrderByComparator<ExtReference> orderByComparator) {
		List<ExtReference> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext reference in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext reference
	 * @throws NoSuchExtReferenceException if a matching ext reference could not be found
	 */
	@Override
	public ExtReference findByUserId_Last(long userId,
		OrderByComparator<ExtReference> orderByComparator)
		throws NoSuchExtReferenceException {
		ExtReference extReference = fetchByUserId_Last(userId, orderByComparator);

		if (extReference != null) {
			return extReference;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtReferenceException(msg.toString());
	}

	/**
	 * Returns the last ext reference in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext reference, or <code>null</code> if a matching ext reference could not be found
	 */
	@Override
	public ExtReference fetchByUserId_Last(long userId,
		OrderByComparator<ExtReference> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<ExtReference> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext references before and after the current ext reference in the ordered set where userId = &#63;.
	 *
	 * @param extReferenceId the primary key of the current ext reference
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext reference
	 * @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	 */
	@Override
	public ExtReference[] findByUserId_PrevAndNext(long extReferenceId,
		long userId, OrderByComparator<ExtReference> orderByComparator)
		throws NoSuchExtReferenceException {
		ExtReference extReference = findByPrimaryKey(extReferenceId);

		Session session = null;

		try {
			session = openSession();

			ExtReference[] array = new ExtReferenceImpl[3];

			array[0] = getByUserId_PrevAndNext(session, extReference, userId,
					orderByComparator, true);

			array[1] = extReference;

			array[2] = getByUserId_PrevAndNext(session, extReference, userId,
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

	protected ExtReference getByUserId_PrevAndNext(Session session,
		ExtReference extReference, long userId,
		OrderByComparator<ExtReference> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EXTREFERENCE_WHERE);

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
			query.append(ExtReferenceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(extReference);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ExtReference> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext references where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (ExtReference extReference : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(extReference);
		}
	}

	/**
	 * Returns the number of ext references where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching ext references
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EXTREFERENCE_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "extReference.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUSERID =
		new FinderPath(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
			ExtReferenceModelImpl.FINDER_CACHE_ENABLED, ExtReferenceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUSERID =
		new FinderPath(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
			ExtReferenceModelImpl.FINDER_CACHE_ENABLED, ExtReferenceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUserId",
			new String[] { Long.class.getName() },
			ExtReferenceModelImpl.REFERENCEUSERID_COLUMN_BITMASK |
			ExtReferenceModelImpl.EMAILDATE_COLUMN_BITMASK |
			ExtReferenceModelImpl.USERLASTNAME_COLUMN_BITMASK |
			ExtReferenceModelImpl.USERFIRSTNAME_COLUMN_BITMASK |
			ExtReferenceModelImpl.USERMIDDLENAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUSERID = new FinderPath(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
			ExtReferenceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByReferenceUserId", new String[] { Long.class.getName() });

	/**
	 * Returns all the ext references where referenceUserId = &#63;.
	 *
	 * @param referenceUserId the reference user ID
	 * @return the matching ext references
	 */
	@Override
	public List<ExtReference> findByReferenceUserId(long referenceUserId) {
		return findByReferenceUserId(referenceUserId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext references where referenceUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUserId the reference user ID
	 * @param start the lower bound of the range of ext references
	 * @param end the upper bound of the range of ext references (not inclusive)
	 * @return the range of matching ext references
	 */
	@Override
	public List<ExtReference> findByReferenceUserId(long referenceUserId,
		int start, int end) {
		return findByReferenceUserId(referenceUserId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext references where referenceUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUserId the reference user ID
	 * @param start the lower bound of the range of ext references
	 * @param end the upper bound of the range of ext references (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext references
	 */
	@Override
	public List<ExtReference> findByReferenceUserId(long referenceUserId,
		int start, int end, OrderByComparator<ExtReference> orderByComparator) {
		return findByReferenceUserId(referenceUserId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext references where referenceUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUserId the reference user ID
	 * @param start the lower bound of the range of ext references
	 * @param end the upper bound of the range of ext references (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ext references
	 */
	@Override
	public List<ExtReference> findByReferenceUserId(long referenceUserId,
		int start, int end, OrderByComparator<ExtReference> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUSERID;
			finderArgs = new Object[] { referenceUserId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUSERID;
			finderArgs = new Object[] {
					referenceUserId,
					
					start, end, orderByComparator
				};
		}

		List<ExtReference> list = null;

		if (retrieveFromCache) {
			list = (List<ExtReference>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExtReference extReference : list) {
					if ((referenceUserId != extReference.getReferenceUserId())) {
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

			query.append(_SQL_SELECT_EXTREFERENCE_WHERE);

			query.append(_FINDER_COLUMN_REFERENCEUSERID_REFERENCEUSERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExtReferenceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(referenceUserId);

				if (!pagination) {
					list = (List<ExtReference>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtReference>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ext reference in the ordered set where referenceUserId = &#63;.
	 *
	 * @param referenceUserId the reference user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext reference
	 * @throws NoSuchExtReferenceException if a matching ext reference could not be found
	 */
	@Override
	public ExtReference findByReferenceUserId_First(long referenceUserId,
		OrderByComparator<ExtReference> orderByComparator)
		throws NoSuchExtReferenceException {
		ExtReference extReference = fetchByReferenceUserId_First(referenceUserId,
				orderByComparator);

		if (extReference != null) {
			return extReference;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUserId=");
		msg.append(referenceUserId);

		msg.append("}");

		throw new NoSuchExtReferenceException(msg.toString());
	}

	/**
	 * Returns the first ext reference in the ordered set where referenceUserId = &#63;.
	 *
	 * @param referenceUserId the reference user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext reference, or <code>null</code> if a matching ext reference could not be found
	 */
	@Override
	public ExtReference fetchByReferenceUserId_First(long referenceUserId,
		OrderByComparator<ExtReference> orderByComparator) {
		List<ExtReference> list = findByReferenceUserId(referenceUserId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext reference in the ordered set where referenceUserId = &#63;.
	 *
	 * @param referenceUserId the reference user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext reference
	 * @throws NoSuchExtReferenceException if a matching ext reference could not be found
	 */
	@Override
	public ExtReference findByReferenceUserId_Last(long referenceUserId,
		OrderByComparator<ExtReference> orderByComparator)
		throws NoSuchExtReferenceException {
		ExtReference extReference = fetchByReferenceUserId_Last(referenceUserId,
				orderByComparator);

		if (extReference != null) {
			return extReference;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUserId=");
		msg.append(referenceUserId);

		msg.append("}");

		throw new NoSuchExtReferenceException(msg.toString());
	}

	/**
	 * Returns the last ext reference in the ordered set where referenceUserId = &#63;.
	 *
	 * @param referenceUserId the reference user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext reference, or <code>null</code> if a matching ext reference could not be found
	 */
	@Override
	public ExtReference fetchByReferenceUserId_Last(long referenceUserId,
		OrderByComparator<ExtReference> orderByComparator) {
		int count = countByReferenceUserId(referenceUserId);

		if (count == 0) {
			return null;
		}

		List<ExtReference> list = findByReferenceUserId(referenceUserId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext references before and after the current ext reference in the ordered set where referenceUserId = &#63;.
	 *
	 * @param extReferenceId the primary key of the current ext reference
	 * @param referenceUserId the reference user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext reference
	 * @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	 */
	@Override
	public ExtReference[] findByReferenceUserId_PrevAndNext(
		long extReferenceId, long referenceUserId,
		OrderByComparator<ExtReference> orderByComparator)
		throws NoSuchExtReferenceException {
		ExtReference extReference = findByPrimaryKey(extReferenceId);

		Session session = null;

		try {
			session = openSession();

			ExtReference[] array = new ExtReferenceImpl[3];

			array[0] = getByReferenceUserId_PrevAndNext(session, extReference,
					referenceUserId, orderByComparator, true);

			array[1] = extReference;

			array[2] = getByReferenceUserId_PrevAndNext(session, extReference,
					referenceUserId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ExtReference getByReferenceUserId_PrevAndNext(Session session,
		ExtReference extReference, long referenceUserId,
		OrderByComparator<ExtReference> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EXTREFERENCE_WHERE);

		query.append(_FINDER_COLUMN_REFERENCEUSERID_REFERENCEUSERID_2);

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
			query.append(ExtReferenceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(referenceUserId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(extReference);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ExtReference> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext references where referenceUserId = &#63; from the database.
	 *
	 * @param referenceUserId the reference user ID
	 */
	@Override
	public void removeByReferenceUserId(long referenceUserId) {
		for (ExtReference extReference : findByReferenceUserId(
				referenceUserId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(extReference);
		}
	}

	/**
	 * Returns the number of ext references where referenceUserId = &#63;.
	 *
	 * @param referenceUserId the reference user ID
	 * @return the number of matching ext references
	 */
	@Override
	public int countByReferenceUserId(long referenceUserId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUSERID;

		Object[] finderArgs = new Object[] { referenceUserId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EXTREFERENCE_WHERE);

			query.append(_FINDER_COLUMN_REFERENCEUSERID_REFERENCEUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(referenceUserId);

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

	private static final String _FINDER_COLUMN_REFERENCEUSERID_REFERENCEUSERID_2 =
		"extReference.referenceUserId = ?";

	public ExtReferencePersistenceImpl() {
		setModelClass(ExtReference.class);
	}

	/**
	 * Caches the ext reference in the entity cache if it is enabled.
	 *
	 * @param extReference the ext reference
	 */
	@Override
	public void cacheResult(ExtReference extReference) {
		entityCache.putResult(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
			ExtReferenceImpl.class, extReference.getPrimaryKey(), extReference);

		extReference.resetOriginalValues();
	}

	/**
	 * Caches the ext references in the entity cache if it is enabled.
	 *
	 * @param extReferences the ext references
	 */
	@Override
	public void cacheResult(List<ExtReference> extReferences) {
		for (ExtReference extReference : extReferences) {
			if (entityCache.getResult(
						ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
						ExtReferenceImpl.class, extReference.getPrimaryKey()) == null) {
				cacheResult(extReference);
			}
			else {
				extReference.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ext references.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExtReferenceImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ext reference.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ExtReference extReference) {
		entityCache.removeResult(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
			ExtReferenceImpl.class, extReference.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ExtReference> extReferences) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ExtReference extReference : extReferences) {
			entityCache.removeResult(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
				ExtReferenceImpl.class, extReference.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ext reference with the primary key. Does not add the ext reference to the database.
	 *
	 * @param extReferenceId the primary key for the new ext reference
	 * @return the new ext reference
	 */
	@Override
	public ExtReference create(long extReferenceId) {
		ExtReference extReference = new ExtReferenceImpl();

		extReference.setNew(true);
		extReference.setPrimaryKey(extReferenceId);

		extReference.setCompanyId(companyProvider.getCompanyId());

		return extReference;
	}

	/**
	 * Removes the ext reference with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param extReferenceId the primary key of the ext reference
	 * @return the ext reference that was removed
	 * @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	 */
	@Override
	public ExtReference remove(long extReferenceId)
		throws NoSuchExtReferenceException {
		return remove((Serializable)extReferenceId);
	}

	/**
	 * Removes the ext reference with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ext reference
	 * @return the ext reference that was removed
	 * @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	 */
	@Override
	public ExtReference remove(Serializable primaryKey)
		throws NoSuchExtReferenceException {
		Session session = null;

		try {
			session = openSession();

			ExtReference extReference = (ExtReference)session.get(ExtReferenceImpl.class,
					primaryKey);

			if (extReference == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExtReferenceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(extReference);
		}
		catch (NoSuchExtReferenceException nsee) {
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
	protected ExtReference removeImpl(ExtReference extReference) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(extReference)) {
				extReference = (ExtReference)session.get(ExtReferenceImpl.class,
						extReference.getPrimaryKeyObj());
			}

			if (extReference != null) {
				session.delete(extReference);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (extReference != null) {
			clearCache(extReference);
		}

		return extReference;
	}

	@Override
	public ExtReference updateImpl(ExtReference extReference) {
		boolean isNew = extReference.isNew();

		if (!(extReference instanceof ExtReferenceModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(extReference.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(extReference);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in extReference proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExtReference implementation " +
				extReference.getClass());
		}

		ExtReferenceModelImpl extReferenceModelImpl = (ExtReferenceModelImpl)extReference;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (extReference.getCreateDate() == null)) {
			if (serviceContext == null) {
				extReference.setCreateDate(now);
			}
			else {
				extReference.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!extReferenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				extReference.setModifiedDate(now);
			}
			else {
				extReference.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (extReference.isNew()) {
				session.save(extReference);

				extReference.setNew(false);
			}
			else {
				extReference = (ExtReference)session.merge(extReference);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ExtReferenceModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { extReferenceModelImpl.getUserId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
				args);

			args = new Object[] { extReferenceModelImpl.getReferenceUserId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUSERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUSERID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((extReferenceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						extReferenceModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { extReferenceModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}

			if ((extReferenceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						extReferenceModelImpl.getOriginalReferenceUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUSERID,
					args);

				args = new Object[] { extReferenceModelImpl.getReferenceUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUSERID,
					args);
			}
		}

		entityCache.putResult(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
			ExtReferenceImpl.class, extReference.getPrimaryKey(), extReference,
			false);

		extReference.resetOriginalValues();

		return extReference;
	}

	/**
	 * Returns the ext reference with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext reference
	 * @return the ext reference
	 * @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	 */
	@Override
	public ExtReference findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExtReferenceException {
		ExtReference extReference = fetchByPrimaryKey(primaryKey);

		if (extReference == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExtReferenceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return extReference;
	}

	/**
	 * Returns the ext reference with the primary key or throws a {@link NoSuchExtReferenceException} if it could not be found.
	 *
	 * @param extReferenceId the primary key of the ext reference
	 * @return the ext reference
	 * @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	 */
	@Override
	public ExtReference findByPrimaryKey(long extReferenceId)
		throws NoSuchExtReferenceException {
		return findByPrimaryKey((Serializable)extReferenceId);
	}

	/**
	 * Returns the ext reference with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext reference
	 * @return the ext reference, or <code>null</code> if a ext reference with the primary key could not be found
	 */
	@Override
	public ExtReference fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
				ExtReferenceImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ExtReference extReference = (ExtReference)serializable;

		if (extReference == null) {
			Session session = null;

			try {
				session = openSession();

				extReference = (ExtReference)session.get(ExtReferenceImpl.class,
						primaryKey);

				if (extReference != null) {
					cacheResult(extReference);
				}
				else {
					entityCache.putResult(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
						ExtReferenceImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
					ExtReferenceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return extReference;
	}

	/**
	 * Returns the ext reference with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param extReferenceId the primary key of the ext reference
	 * @return the ext reference, or <code>null</code> if a ext reference with the primary key could not be found
	 */
	@Override
	public ExtReference fetchByPrimaryKey(long extReferenceId) {
		return fetchByPrimaryKey((Serializable)extReferenceId);
	}

	@Override
	public Map<Serializable, ExtReference> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ExtReference> map = new HashMap<Serializable, ExtReference>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ExtReference extReference = fetchByPrimaryKey(primaryKey);

			if (extReference != null) {
				map.put(primaryKey, extReference);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
					ExtReferenceImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ExtReference)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EXTREFERENCE_WHERE_PKS_IN);

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

			for (ExtReference extReference : (List<ExtReference>)q.list()) {
				map.put(extReference.getPrimaryKeyObj(), extReference);

				cacheResult(extReference);

				uncachedPrimaryKeys.remove(extReference.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ExtReferenceModelImpl.ENTITY_CACHE_ENABLED,
					ExtReferenceImpl.class, primaryKey, nullModel);
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
	 * Returns all the ext references.
	 *
	 * @return the ext references
	 */
	@Override
	public List<ExtReference> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext references.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext references
	 * @param end the upper bound of the range of ext references (not inclusive)
	 * @return the range of ext references
	 */
	@Override
	public List<ExtReference> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext references.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext references
	 * @param end the upper bound of the range of ext references (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ext references
	 */
	@Override
	public List<ExtReference> findAll(int start, int end,
		OrderByComparator<ExtReference> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext references.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext references
	 * @param end the upper bound of the range of ext references (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ext references
	 */
	@Override
	public List<ExtReference> findAll(int start, int end,
		OrderByComparator<ExtReference> orderByComparator,
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

		List<ExtReference> list = null;

		if (retrieveFromCache) {
			list = (List<ExtReference>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EXTREFERENCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXTREFERENCE;

				if (pagination) {
					sql = sql.concat(ExtReferenceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ExtReference>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtReference>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ext references from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExtReference extReference : findAll()) {
			remove(extReference);
		}
	}

	/**
	 * Returns the number of ext references.
	 *
	 * @return the number of ext references
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EXTREFERENCE);

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
		return ExtReferenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ext reference persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ExtReferenceImpl.class.getName());
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
	private static final String _SQL_SELECT_EXTREFERENCE = "SELECT extReference FROM ExtReference extReference";
	private static final String _SQL_SELECT_EXTREFERENCE_WHERE_PKS_IN = "SELECT extReference FROM ExtReference extReference WHERE extReferenceId IN (";
	private static final String _SQL_SELECT_EXTREFERENCE_WHERE = "SELECT extReference FROM ExtReference extReference WHERE ";
	private static final String _SQL_COUNT_EXTREFERENCE = "SELECT COUNT(extReference) FROM ExtReference extReference";
	private static final String _SQL_COUNT_EXTREFERENCE_WHERE = "SELECT COUNT(extReference) FROM ExtReference extReference WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "extReference.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ExtReference exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ExtReference exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ExtReferencePersistenceImpl.class);
}