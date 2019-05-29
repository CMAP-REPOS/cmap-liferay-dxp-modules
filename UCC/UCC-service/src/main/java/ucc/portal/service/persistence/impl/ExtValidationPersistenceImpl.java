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

import ucc.portal.exception.NoSuchExtValidationException;

import ucc.portal.model.ExtValidation;
import ucc.portal.model.impl.ExtValidationImpl;
import ucc.portal.model.impl.ExtValidationModelImpl;

import ucc.portal.service.persistence.ExtValidationPersistence;

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
 * The persistence implementation for the ext validation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtValidationPersistence
 * @see ucc.portal.service.persistence.ExtValidationUtil
 * @generated
 */
@ProviderType
public class ExtValidationPersistenceImpl extends BasePersistenceImpl<ExtValidation>
	implements ExtValidationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ExtValidationUtil} to access the ext validation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ExtValidationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationModelImpl.FINDER_CACHE_ENABLED,
			ExtValidationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationModelImpl.FINDER_CACHE_ENABLED,
			ExtValidationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationModelImpl.FINDER_CACHE_ENABLED,
			ExtValidationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationModelImpl.FINDER_CACHE_ENABLED,
			ExtValidationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUserId", new String[] { Long.class.getName() },
			ExtValidationModelImpl.USERID_COLUMN_BITMASK |
			ExtValidationModelImpl.EMAILDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ext validations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching ext validations
	 */
	@Override
	public List<ExtValidation> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext validations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext validations
	 * @param end the upper bound of the range of ext validations (not inclusive)
	 * @return the range of matching ext validations
	 */
	@Override
	public List<ExtValidation> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext validations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext validations
	 * @param end the upper bound of the range of ext validations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext validations
	 */
	@Override
	public List<ExtValidation> findByUserId(long userId, int start, int end,
		OrderByComparator<ExtValidation> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext validations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext validations
	 * @param end the upper bound of the range of ext validations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ext validations
	 */
	@Override
	public List<ExtValidation> findByUserId(long userId, int start, int end,
		OrderByComparator<ExtValidation> orderByComparator,
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

		List<ExtValidation> list = null;

		if (retrieveFromCache) {
			list = (List<ExtValidation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExtValidation extValidation : list) {
					if ((userId != extValidation.getUserId())) {
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

			query.append(_SQL_SELECT_EXTVALIDATION_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExtValidationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<ExtValidation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtValidation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ext validation in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext validation
	 * @throws NoSuchExtValidationException if a matching ext validation could not be found
	 */
	@Override
	public ExtValidation findByUserId_First(long userId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException {
		ExtValidation extValidation = fetchByUserId_First(userId,
				orderByComparator);

		if (extValidation != null) {
			return extValidation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtValidationException(msg.toString());
	}

	/**
	 * Returns the first ext validation in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext validation, or <code>null</code> if a matching ext validation could not be found
	 */
	@Override
	public ExtValidation fetchByUserId_First(long userId,
		OrderByComparator<ExtValidation> orderByComparator) {
		List<ExtValidation> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext validation in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext validation
	 * @throws NoSuchExtValidationException if a matching ext validation could not be found
	 */
	@Override
	public ExtValidation findByUserId_Last(long userId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException {
		ExtValidation extValidation = fetchByUserId_Last(userId,
				orderByComparator);

		if (extValidation != null) {
			return extValidation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtValidationException(msg.toString());
	}

	/**
	 * Returns the last ext validation in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext validation, or <code>null</code> if a matching ext validation could not be found
	 */
	@Override
	public ExtValidation fetchByUserId_Last(long userId,
		OrderByComparator<ExtValidation> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<ExtValidation> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext validations before and after the current ext validation in the ordered set where userId = &#63;.
	 *
	 * @param extValidationId the primary key of the current ext validation
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext validation
	 * @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	 */
	@Override
	public ExtValidation[] findByUserId_PrevAndNext(long extValidationId,
		long userId, OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException {
		ExtValidation extValidation = findByPrimaryKey(extValidationId);

		Session session = null;

		try {
			session = openSession();

			ExtValidation[] array = new ExtValidationImpl[3];

			array[0] = getByUserId_PrevAndNext(session, extValidation, userId,
					orderByComparator, true);

			array[1] = extValidation;

			array[2] = getByUserId_PrevAndNext(session, extValidation, userId,
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

	protected ExtValidation getByUserId_PrevAndNext(Session session,
		ExtValidation extValidation, long userId,
		OrderByComparator<ExtValidation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EXTVALIDATION_WHERE);

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
			query.append(ExtValidationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(extValidation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ExtValidation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext validations where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (ExtValidation extValidation : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(extValidation);
		}
	}

	/**
	 * Returns the number of ext validations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching ext validations
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EXTVALIDATION_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "extValidation.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PROFILEFILEENTRYID =
		new FinderPath(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationModelImpl.FINDER_CACHE_ENABLED,
			ExtValidationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByProfileFileEntryId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROFILEFILEENTRYID =
		new FinderPath(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationModelImpl.FINDER_CACHE_ENABLED,
			ExtValidationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByProfileFileEntryId", new String[] { Long.class.getName() },
			ExtValidationModelImpl.PROFILEFILEENTRYID_COLUMN_BITMASK |
			ExtValidationModelImpl.EMAILDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PROFILEFILEENTRYID = new FinderPath(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByProfileFileEntryId", new String[] { Long.class.getName() });

	/**
	 * Returns all the ext validations where profileFileEntryId = &#63;.
	 *
	 * @param profileFileEntryId the profile file entry ID
	 * @return the matching ext validations
	 */
	@Override
	public List<ExtValidation> findByProfileFileEntryId(long profileFileEntryId) {
		return findByProfileFileEntryId(profileFileEntryId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext validations where profileFileEntryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param profileFileEntryId the profile file entry ID
	 * @param start the lower bound of the range of ext validations
	 * @param end the upper bound of the range of ext validations (not inclusive)
	 * @return the range of matching ext validations
	 */
	@Override
	public List<ExtValidation> findByProfileFileEntryId(
		long profileFileEntryId, int start, int end) {
		return findByProfileFileEntryId(profileFileEntryId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext validations where profileFileEntryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param profileFileEntryId the profile file entry ID
	 * @param start the lower bound of the range of ext validations
	 * @param end the upper bound of the range of ext validations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext validations
	 */
	@Override
	public List<ExtValidation> findByProfileFileEntryId(
		long profileFileEntryId, int start, int end,
		OrderByComparator<ExtValidation> orderByComparator) {
		return findByProfileFileEntryId(profileFileEntryId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext validations where profileFileEntryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param profileFileEntryId the profile file entry ID
	 * @param start the lower bound of the range of ext validations
	 * @param end the upper bound of the range of ext validations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ext validations
	 */
	@Override
	public List<ExtValidation> findByProfileFileEntryId(
		long profileFileEntryId, int start, int end,
		OrderByComparator<ExtValidation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROFILEFILEENTRYID;
			finderArgs = new Object[] { profileFileEntryId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PROFILEFILEENTRYID;
			finderArgs = new Object[] {
					profileFileEntryId,
					
					start, end, orderByComparator
				};
		}

		List<ExtValidation> list = null;

		if (retrieveFromCache) {
			list = (List<ExtValidation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExtValidation extValidation : list) {
					if ((profileFileEntryId != extValidation.getProfileFileEntryId())) {
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

			query.append(_SQL_SELECT_EXTVALIDATION_WHERE);

			query.append(_FINDER_COLUMN_PROFILEFILEENTRYID_PROFILEFILEENTRYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExtValidationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(profileFileEntryId);

				if (!pagination) {
					list = (List<ExtValidation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtValidation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ext validation in the ordered set where profileFileEntryId = &#63;.
	 *
	 * @param profileFileEntryId the profile file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext validation
	 * @throws NoSuchExtValidationException if a matching ext validation could not be found
	 */
	@Override
	public ExtValidation findByProfileFileEntryId_First(
		long profileFileEntryId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException {
		ExtValidation extValidation = fetchByProfileFileEntryId_First(profileFileEntryId,
				orderByComparator);

		if (extValidation != null) {
			return extValidation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("profileFileEntryId=");
		msg.append(profileFileEntryId);

		msg.append("}");

		throw new NoSuchExtValidationException(msg.toString());
	}

	/**
	 * Returns the first ext validation in the ordered set where profileFileEntryId = &#63;.
	 *
	 * @param profileFileEntryId the profile file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext validation, or <code>null</code> if a matching ext validation could not be found
	 */
	@Override
	public ExtValidation fetchByProfileFileEntryId_First(
		long profileFileEntryId,
		OrderByComparator<ExtValidation> orderByComparator) {
		List<ExtValidation> list = findByProfileFileEntryId(profileFileEntryId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext validation in the ordered set where profileFileEntryId = &#63;.
	 *
	 * @param profileFileEntryId the profile file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext validation
	 * @throws NoSuchExtValidationException if a matching ext validation could not be found
	 */
	@Override
	public ExtValidation findByProfileFileEntryId_Last(
		long profileFileEntryId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException {
		ExtValidation extValidation = fetchByProfileFileEntryId_Last(profileFileEntryId,
				orderByComparator);

		if (extValidation != null) {
			return extValidation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("profileFileEntryId=");
		msg.append(profileFileEntryId);

		msg.append("}");

		throw new NoSuchExtValidationException(msg.toString());
	}

	/**
	 * Returns the last ext validation in the ordered set where profileFileEntryId = &#63;.
	 *
	 * @param profileFileEntryId the profile file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext validation, or <code>null</code> if a matching ext validation could not be found
	 */
	@Override
	public ExtValidation fetchByProfileFileEntryId_Last(
		long profileFileEntryId,
		OrderByComparator<ExtValidation> orderByComparator) {
		int count = countByProfileFileEntryId(profileFileEntryId);

		if (count == 0) {
			return null;
		}

		List<ExtValidation> list = findByProfileFileEntryId(profileFileEntryId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext validations before and after the current ext validation in the ordered set where profileFileEntryId = &#63;.
	 *
	 * @param extValidationId the primary key of the current ext validation
	 * @param profileFileEntryId the profile file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext validation
	 * @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	 */
	@Override
	public ExtValidation[] findByProfileFileEntryId_PrevAndNext(
		long extValidationId, long profileFileEntryId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException {
		ExtValidation extValidation = findByPrimaryKey(extValidationId);

		Session session = null;

		try {
			session = openSession();

			ExtValidation[] array = new ExtValidationImpl[3];

			array[0] = getByProfileFileEntryId_PrevAndNext(session,
					extValidation, profileFileEntryId, orderByComparator, true);

			array[1] = extValidation;

			array[2] = getByProfileFileEntryId_PrevAndNext(session,
					extValidation, profileFileEntryId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ExtValidation getByProfileFileEntryId_PrevAndNext(
		Session session, ExtValidation extValidation, long profileFileEntryId,
		OrderByComparator<ExtValidation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EXTVALIDATION_WHERE);

		query.append(_FINDER_COLUMN_PROFILEFILEENTRYID_PROFILEFILEENTRYID_2);

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
			query.append(ExtValidationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(profileFileEntryId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(extValidation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ExtValidation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext validations where profileFileEntryId = &#63; from the database.
	 *
	 * @param profileFileEntryId the profile file entry ID
	 */
	@Override
	public void removeByProfileFileEntryId(long profileFileEntryId) {
		for (ExtValidation extValidation : findByProfileFileEntryId(
				profileFileEntryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(extValidation);
		}
	}

	/**
	 * Returns the number of ext validations where profileFileEntryId = &#63;.
	 *
	 * @param profileFileEntryId the profile file entry ID
	 * @return the number of matching ext validations
	 */
	@Override
	public int countByProfileFileEntryId(long profileFileEntryId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PROFILEFILEENTRYID;

		Object[] finderArgs = new Object[] { profileFileEntryId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EXTVALIDATION_WHERE);

			query.append(_FINDER_COLUMN_PROFILEFILEENTRYID_PROFILEFILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(profileFileEntryId);

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

	private static final String _FINDER_COLUMN_PROFILEFILEENTRYID_PROFILEFILEENTRYID_2 =
		"extValidation.profileFileEntryId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VALIDATORUSERID =
		new FinderPath(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationModelImpl.FINDER_CACHE_ENABLED,
			ExtValidationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByValidatorUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VALIDATORUSERID =
		new FinderPath(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationModelImpl.FINDER_CACHE_ENABLED,
			ExtValidationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByValidatorUserId", new String[] { Long.class.getName() },
			ExtValidationModelImpl.VALIDATORUSERID_COLUMN_BITMASK |
			ExtValidationModelImpl.EMAILDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VALIDATORUSERID = new FinderPath(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByValidatorUserId", new String[] { Long.class.getName() });

	/**
	 * Returns all the ext validations where validatorUserId = &#63;.
	 *
	 * @param validatorUserId the validator user ID
	 * @return the matching ext validations
	 */
	@Override
	public List<ExtValidation> findByValidatorUserId(long validatorUserId) {
		return findByValidatorUserId(validatorUserId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext validations where validatorUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param validatorUserId the validator user ID
	 * @param start the lower bound of the range of ext validations
	 * @param end the upper bound of the range of ext validations (not inclusive)
	 * @return the range of matching ext validations
	 */
	@Override
	public List<ExtValidation> findByValidatorUserId(long validatorUserId,
		int start, int end) {
		return findByValidatorUserId(validatorUserId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext validations where validatorUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param validatorUserId the validator user ID
	 * @param start the lower bound of the range of ext validations
	 * @param end the upper bound of the range of ext validations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext validations
	 */
	@Override
	public List<ExtValidation> findByValidatorUserId(long validatorUserId,
		int start, int end, OrderByComparator<ExtValidation> orderByComparator) {
		return findByValidatorUserId(validatorUserId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext validations where validatorUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param validatorUserId the validator user ID
	 * @param start the lower bound of the range of ext validations
	 * @param end the upper bound of the range of ext validations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ext validations
	 */
	@Override
	public List<ExtValidation> findByValidatorUserId(long validatorUserId,
		int start, int end, OrderByComparator<ExtValidation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VALIDATORUSERID;
			finderArgs = new Object[] { validatorUserId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VALIDATORUSERID;
			finderArgs = new Object[] {
					validatorUserId,
					
					start, end, orderByComparator
				};
		}

		List<ExtValidation> list = null;

		if (retrieveFromCache) {
			list = (List<ExtValidation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExtValidation extValidation : list) {
					if ((validatorUserId != extValidation.getValidatorUserId())) {
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

			query.append(_SQL_SELECT_EXTVALIDATION_WHERE);

			query.append(_FINDER_COLUMN_VALIDATORUSERID_VALIDATORUSERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExtValidationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(validatorUserId);

				if (!pagination) {
					list = (List<ExtValidation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtValidation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ext validation in the ordered set where validatorUserId = &#63;.
	 *
	 * @param validatorUserId the validator user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext validation
	 * @throws NoSuchExtValidationException if a matching ext validation could not be found
	 */
	@Override
	public ExtValidation findByValidatorUserId_First(long validatorUserId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException {
		ExtValidation extValidation = fetchByValidatorUserId_First(validatorUserId,
				orderByComparator);

		if (extValidation != null) {
			return extValidation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("validatorUserId=");
		msg.append(validatorUserId);

		msg.append("}");

		throw new NoSuchExtValidationException(msg.toString());
	}

	/**
	 * Returns the first ext validation in the ordered set where validatorUserId = &#63;.
	 *
	 * @param validatorUserId the validator user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext validation, or <code>null</code> if a matching ext validation could not be found
	 */
	@Override
	public ExtValidation fetchByValidatorUserId_First(long validatorUserId,
		OrderByComparator<ExtValidation> orderByComparator) {
		List<ExtValidation> list = findByValidatorUserId(validatorUserId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext validation in the ordered set where validatorUserId = &#63;.
	 *
	 * @param validatorUserId the validator user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext validation
	 * @throws NoSuchExtValidationException if a matching ext validation could not be found
	 */
	@Override
	public ExtValidation findByValidatorUserId_Last(long validatorUserId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException {
		ExtValidation extValidation = fetchByValidatorUserId_Last(validatorUserId,
				orderByComparator);

		if (extValidation != null) {
			return extValidation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("validatorUserId=");
		msg.append(validatorUserId);

		msg.append("}");

		throw new NoSuchExtValidationException(msg.toString());
	}

	/**
	 * Returns the last ext validation in the ordered set where validatorUserId = &#63;.
	 *
	 * @param validatorUserId the validator user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext validation, or <code>null</code> if a matching ext validation could not be found
	 */
	@Override
	public ExtValidation fetchByValidatorUserId_Last(long validatorUserId,
		OrderByComparator<ExtValidation> orderByComparator) {
		int count = countByValidatorUserId(validatorUserId);

		if (count == 0) {
			return null;
		}

		List<ExtValidation> list = findByValidatorUserId(validatorUserId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext validations before and after the current ext validation in the ordered set where validatorUserId = &#63;.
	 *
	 * @param extValidationId the primary key of the current ext validation
	 * @param validatorUserId the validator user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext validation
	 * @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	 */
	@Override
	public ExtValidation[] findByValidatorUserId_PrevAndNext(
		long extValidationId, long validatorUserId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException {
		ExtValidation extValidation = findByPrimaryKey(extValidationId);

		Session session = null;

		try {
			session = openSession();

			ExtValidation[] array = new ExtValidationImpl[3];

			array[0] = getByValidatorUserId_PrevAndNext(session, extValidation,
					validatorUserId, orderByComparator, true);

			array[1] = extValidation;

			array[2] = getByValidatorUserId_PrevAndNext(session, extValidation,
					validatorUserId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ExtValidation getByValidatorUserId_PrevAndNext(Session session,
		ExtValidation extValidation, long validatorUserId,
		OrderByComparator<ExtValidation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EXTVALIDATION_WHERE);

		query.append(_FINDER_COLUMN_VALIDATORUSERID_VALIDATORUSERID_2);

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
			query.append(ExtValidationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(validatorUserId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(extValidation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ExtValidation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext validations where validatorUserId = &#63; from the database.
	 *
	 * @param validatorUserId the validator user ID
	 */
	@Override
	public void removeByValidatorUserId(long validatorUserId) {
		for (ExtValidation extValidation : findByValidatorUserId(
				validatorUserId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(extValidation);
		}
	}

	/**
	 * Returns the number of ext validations where validatorUserId = &#63;.
	 *
	 * @param validatorUserId the validator user ID
	 * @return the number of matching ext validations
	 */
	@Override
	public int countByValidatorUserId(long validatorUserId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VALIDATORUSERID;

		Object[] finderArgs = new Object[] { validatorUserId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EXTVALIDATION_WHERE);

			query.append(_FINDER_COLUMN_VALIDATORUSERID_VALIDATORUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(validatorUserId);

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

	private static final String _FINDER_COLUMN_VALIDATORUSERID_VALIDATORUSERID_2 =
		"extValidation.validatorUserId = ?";

	public ExtValidationPersistenceImpl() {
		setModelClass(ExtValidation.class);
	}

	/**
	 * Caches the ext validation in the entity cache if it is enabled.
	 *
	 * @param extValidation the ext validation
	 */
	@Override
	public void cacheResult(ExtValidation extValidation) {
		entityCache.putResult(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationImpl.class, extValidation.getPrimaryKey(),
			extValidation);

		extValidation.resetOriginalValues();
	}

	/**
	 * Caches the ext validations in the entity cache if it is enabled.
	 *
	 * @param extValidations the ext validations
	 */
	@Override
	public void cacheResult(List<ExtValidation> extValidations) {
		for (ExtValidation extValidation : extValidations) {
			if (entityCache.getResult(
						ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
						ExtValidationImpl.class, extValidation.getPrimaryKey()) == null) {
				cacheResult(extValidation);
			}
			else {
				extValidation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ext validations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExtValidationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ext validation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ExtValidation extValidation) {
		entityCache.removeResult(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationImpl.class, extValidation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ExtValidation> extValidations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ExtValidation extValidation : extValidations) {
			entityCache.removeResult(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
				ExtValidationImpl.class, extValidation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ext validation with the primary key. Does not add the ext validation to the database.
	 *
	 * @param extValidationId the primary key for the new ext validation
	 * @return the new ext validation
	 */
	@Override
	public ExtValidation create(long extValidationId) {
		ExtValidation extValidation = new ExtValidationImpl();

		extValidation.setNew(true);
		extValidation.setPrimaryKey(extValidationId);

		extValidation.setCompanyId(companyProvider.getCompanyId());

		return extValidation;
	}

	/**
	 * Removes the ext validation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param extValidationId the primary key of the ext validation
	 * @return the ext validation that was removed
	 * @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	 */
	@Override
	public ExtValidation remove(long extValidationId)
		throws NoSuchExtValidationException {
		return remove((Serializable)extValidationId);
	}

	/**
	 * Removes the ext validation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ext validation
	 * @return the ext validation that was removed
	 * @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	 */
	@Override
	public ExtValidation remove(Serializable primaryKey)
		throws NoSuchExtValidationException {
		Session session = null;

		try {
			session = openSession();

			ExtValidation extValidation = (ExtValidation)session.get(ExtValidationImpl.class,
					primaryKey);

			if (extValidation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExtValidationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(extValidation);
		}
		catch (NoSuchExtValidationException nsee) {
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
	protected ExtValidation removeImpl(ExtValidation extValidation) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(extValidation)) {
				extValidation = (ExtValidation)session.get(ExtValidationImpl.class,
						extValidation.getPrimaryKeyObj());
			}

			if (extValidation != null) {
				session.delete(extValidation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (extValidation != null) {
			clearCache(extValidation);
		}

		return extValidation;
	}

	@Override
	public ExtValidation updateImpl(ExtValidation extValidation) {
		boolean isNew = extValidation.isNew();

		if (!(extValidation instanceof ExtValidationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(extValidation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(extValidation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in extValidation proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExtValidation implementation " +
				extValidation.getClass());
		}

		ExtValidationModelImpl extValidationModelImpl = (ExtValidationModelImpl)extValidation;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (extValidation.getCreateDate() == null)) {
			if (serviceContext == null) {
				extValidation.setCreateDate(now);
			}
			else {
				extValidation.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!extValidationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				extValidation.setModifiedDate(now);
			}
			else {
				extValidation.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (extValidation.isNew()) {
				session.save(extValidation);

				extValidation.setNew(false);
			}
			else {
				extValidation = (ExtValidation)session.merge(extValidation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ExtValidationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { extValidationModelImpl.getUserId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
				args);

			args = new Object[] { extValidationModelImpl.getProfileFileEntryId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_PROFILEFILEENTRYID,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROFILEFILEENTRYID,
				args);

			args = new Object[] { extValidationModelImpl.getValidatorUserId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_VALIDATORUSERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VALIDATORUSERID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((extValidationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						extValidationModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { extValidationModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}

			if ((extValidationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROFILEFILEENTRYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						extValidationModelImpl.getOriginalProfileFileEntryId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PROFILEFILEENTRYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROFILEFILEENTRYID,
					args);

				args = new Object[] {
						extValidationModelImpl.getProfileFileEntryId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PROFILEFILEENTRYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROFILEFILEENTRYID,
					args);
			}

			if ((extValidationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VALIDATORUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						extValidationModelImpl.getOriginalValidatorUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VALIDATORUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VALIDATORUSERID,
					args);

				args = new Object[] { extValidationModelImpl.getValidatorUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VALIDATORUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VALIDATORUSERID,
					args);
			}
		}

		entityCache.putResult(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
			ExtValidationImpl.class, extValidation.getPrimaryKey(),
			extValidation, false);

		extValidation.resetOriginalValues();

		return extValidation;
	}

	/**
	 * Returns the ext validation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext validation
	 * @return the ext validation
	 * @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	 */
	@Override
	public ExtValidation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExtValidationException {
		ExtValidation extValidation = fetchByPrimaryKey(primaryKey);

		if (extValidation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExtValidationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return extValidation;
	}

	/**
	 * Returns the ext validation with the primary key or throws a {@link NoSuchExtValidationException} if it could not be found.
	 *
	 * @param extValidationId the primary key of the ext validation
	 * @return the ext validation
	 * @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	 */
	@Override
	public ExtValidation findByPrimaryKey(long extValidationId)
		throws NoSuchExtValidationException {
		return findByPrimaryKey((Serializable)extValidationId);
	}

	/**
	 * Returns the ext validation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext validation
	 * @return the ext validation, or <code>null</code> if a ext validation with the primary key could not be found
	 */
	@Override
	public ExtValidation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
				ExtValidationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ExtValidation extValidation = (ExtValidation)serializable;

		if (extValidation == null) {
			Session session = null;

			try {
				session = openSession();

				extValidation = (ExtValidation)session.get(ExtValidationImpl.class,
						primaryKey);

				if (extValidation != null) {
					cacheResult(extValidation);
				}
				else {
					entityCache.putResult(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
						ExtValidationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
					ExtValidationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return extValidation;
	}

	/**
	 * Returns the ext validation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param extValidationId the primary key of the ext validation
	 * @return the ext validation, or <code>null</code> if a ext validation with the primary key could not be found
	 */
	@Override
	public ExtValidation fetchByPrimaryKey(long extValidationId) {
		return fetchByPrimaryKey((Serializable)extValidationId);
	}

	@Override
	public Map<Serializable, ExtValidation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ExtValidation> map = new HashMap<Serializable, ExtValidation>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ExtValidation extValidation = fetchByPrimaryKey(primaryKey);

			if (extValidation != null) {
				map.put(primaryKey, extValidation);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
					ExtValidationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ExtValidation)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EXTVALIDATION_WHERE_PKS_IN);

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

			for (ExtValidation extValidation : (List<ExtValidation>)q.list()) {
				map.put(extValidation.getPrimaryKeyObj(), extValidation);

				cacheResult(extValidation);

				uncachedPrimaryKeys.remove(extValidation.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ExtValidationModelImpl.ENTITY_CACHE_ENABLED,
					ExtValidationImpl.class, primaryKey, nullModel);
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
	 * Returns all the ext validations.
	 *
	 * @return the ext validations
	 */
	@Override
	public List<ExtValidation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext validations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext validations
	 * @param end the upper bound of the range of ext validations (not inclusive)
	 * @return the range of ext validations
	 */
	@Override
	public List<ExtValidation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext validations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext validations
	 * @param end the upper bound of the range of ext validations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ext validations
	 */
	@Override
	public List<ExtValidation> findAll(int start, int end,
		OrderByComparator<ExtValidation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext validations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext validations
	 * @param end the upper bound of the range of ext validations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ext validations
	 */
	@Override
	public List<ExtValidation> findAll(int start, int end,
		OrderByComparator<ExtValidation> orderByComparator,
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

		List<ExtValidation> list = null;

		if (retrieveFromCache) {
			list = (List<ExtValidation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EXTVALIDATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXTVALIDATION;

				if (pagination) {
					sql = sql.concat(ExtValidationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ExtValidation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtValidation>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ext validations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExtValidation extValidation : findAll()) {
			remove(extValidation);
		}
	}

	/**
	 * Returns the number of ext validations.
	 *
	 * @return the number of ext validations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EXTVALIDATION);

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
		return ExtValidationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ext validation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ExtValidationImpl.class.getName());
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
	private static final String _SQL_SELECT_EXTVALIDATION = "SELECT extValidation FROM ExtValidation extValidation";
	private static final String _SQL_SELECT_EXTVALIDATION_WHERE_PKS_IN = "SELECT extValidation FROM ExtValidation extValidation WHERE extValidationId IN (";
	private static final String _SQL_SELECT_EXTVALIDATION_WHERE = "SELECT extValidation FROM ExtValidation extValidation WHERE ";
	private static final String _SQL_COUNT_EXTVALIDATION = "SELECT COUNT(extValidation) FROM ExtValidation extValidation";
	private static final String _SQL_COUNT_EXTVALIDATION_WHERE = "SELECT COUNT(extValidation) FROM ExtValidation extValidation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "extValidation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ExtValidation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ExtValidation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ExtValidationPersistenceImpl.class);
}