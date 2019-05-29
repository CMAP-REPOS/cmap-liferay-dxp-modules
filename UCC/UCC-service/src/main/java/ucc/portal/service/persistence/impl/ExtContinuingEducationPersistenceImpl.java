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

import ucc.portal.exception.NoSuchExtContinuingEducationException;

import ucc.portal.model.ExtContinuingEducation;
import ucc.portal.model.impl.ExtContinuingEducationImpl;
import ucc.portal.model.impl.ExtContinuingEducationModelImpl;

import ucc.portal.service.persistence.ExtContinuingEducationPersistence;

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
 * The persistence implementation for the ext continuing education service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtContinuingEducationPersistence
 * @see ucc.portal.service.persistence.ExtContinuingEducationUtil
 * @generated
 */
@ProviderType
public class ExtContinuingEducationPersistenceImpl extends BasePersistenceImpl<ExtContinuingEducation>
	implements ExtContinuingEducationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ExtContinuingEducationUtil} to access the ext continuing education persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ExtContinuingEducationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtContinuingEducationModelImpl.FINDER_CACHE_ENABLED,
			ExtContinuingEducationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtContinuingEducationModelImpl.FINDER_CACHE_ENABLED,
			ExtContinuingEducationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtContinuingEducationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtContinuingEducationModelImpl.FINDER_CACHE_ENABLED,
			ExtContinuingEducationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtContinuingEducationModelImpl.FINDER_CACHE_ENABLED,
			ExtContinuingEducationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			ExtContinuingEducationModelImpl.USERID_COLUMN_BITMASK |
			ExtContinuingEducationModelImpl.STARTDATEOFATTENDANCE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtContinuingEducationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ext continuing educations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching ext continuing educations
	 */
	@Override
	public List<ExtContinuingEducation> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext continuing educations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtContinuingEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext continuing educations
	 * @param end the upper bound of the range of ext continuing educations (not inclusive)
	 * @return the range of matching ext continuing educations
	 */
	@Override
	public List<ExtContinuingEducation> findByUserId(long userId, int start,
		int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext continuing educations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtContinuingEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext continuing educations
	 * @param end the upper bound of the range of ext continuing educations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext continuing educations
	 */
	@Override
	public List<ExtContinuingEducation> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtContinuingEducation> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext continuing educations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtContinuingEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext continuing educations
	 * @param end the upper bound of the range of ext continuing educations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ext continuing educations
	 */
	@Override
	public List<ExtContinuingEducation> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtContinuingEducation> orderByComparator,
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

		List<ExtContinuingEducation> list = null;

		if (retrieveFromCache) {
			list = (List<ExtContinuingEducation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExtContinuingEducation extContinuingEducation : list) {
					if ((userId != extContinuingEducation.getUserId())) {
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

			query.append(_SQL_SELECT_EXTCONTINUINGEDUCATION_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExtContinuingEducationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<ExtContinuingEducation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtContinuingEducation>)QueryUtil.list(q,
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
	 * Returns the first ext continuing education in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext continuing education
	 * @throws NoSuchExtContinuingEducationException if a matching ext continuing education could not be found
	 */
	@Override
	public ExtContinuingEducation findByUserId_First(long userId,
		OrderByComparator<ExtContinuingEducation> orderByComparator)
		throws NoSuchExtContinuingEducationException {
		ExtContinuingEducation extContinuingEducation = fetchByUserId_First(userId,
				orderByComparator);

		if (extContinuingEducation != null) {
			return extContinuingEducation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtContinuingEducationException(msg.toString());
	}

	/**
	 * Returns the first ext continuing education in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext continuing education, or <code>null</code> if a matching ext continuing education could not be found
	 */
	@Override
	public ExtContinuingEducation fetchByUserId_First(long userId,
		OrderByComparator<ExtContinuingEducation> orderByComparator) {
		List<ExtContinuingEducation> list = findByUserId(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext continuing education in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext continuing education
	 * @throws NoSuchExtContinuingEducationException if a matching ext continuing education could not be found
	 */
	@Override
	public ExtContinuingEducation findByUserId_Last(long userId,
		OrderByComparator<ExtContinuingEducation> orderByComparator)
		throws NoSuchExtContinuingEducationException {
		ExtContinuingEducation extContinuingEducation = fetchByUserId_Last(userId,
				orderByComparator);

		if (extContinuingEducation != null) {
			return extContinuingEducation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtContinuingEducationException(msg.toString());
	}

	/**
	 * Returns the last ext continuing education in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext continuing education, or <code>null</code> if a matching ext continuing education could not be found
	 */
	@Override
	public ExtContinuingEducation fetchByUserId_Last(long userId,
		OrderByComparator<ExtContinuingEducation> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<ExtContinuingEducation> list = findByUserId(userId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext continuing educations before and after the current ext continuing education in the ordered set where userId = &#63;.
	 *
	 * @param extContinuingEducationId the primary key of the current ext continuing education
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext continuing education
	 * @throws NoSuchExtContinuingEducationException if a ext continuing education with the primary key could not be found
	 */
	@Override
	public ExtContinuingEducation[] findByUserId_PrevAndNext(
		long extContinuingEducationId, long userId,
		OrderByComparator<ExtContinuingEducation> orderByComparator)
		throws NoSuchExtContinuingEducationException {
		ExtContinuingEducation extContinuingEducation = findByPrimaryKey(extContinuingEducationId);

		Session session = null;

		try {
			session = openSession();

			ExtContinuingEducation[] array = new ExtContinuingEducationImpl[3];

			array[0] = getByUserId_PrevAndNext(session, extContinuingEducation,
					userId, orderByComparator, true);

			array[1] = extContinuingEducation;

			array[2] = getByUserId_PrevAndNext(session, extContinuingEducation,
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

	protected ExtContinuingEducation getByUserId_PrevAndNext(Session session,
		ExtContinuingEducation extContinuingEducation, long userId,
		OrderByComparator<ExtContinuingEducation> orderByComparator,
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

		query.append(_SQL_SELECT_EXTCONTINUINGEDUCATION_WHERE);

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
			query.append(ExtContinuingEducationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(extContinuingEducation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ExtContinuingEducation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext continuing educations where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (ExtContinuingEducation extContinuingEducation : findByUserId(
				userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(extContinuingEducation);
		}
	}

	/**
	 * Returns the number of ext continuing educations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching ext continuing educations
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EXTCONTINUINGEDUCATION_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "extContinuingEducation.userId = ?";

	public ExtContinuingEducationPersistenceImpl() {
		setModelClass(ExtContinuingEducation.class);
	}

	/**
	 * Caches the ext continuing education in the entity cache if it is enabled.
	 *
	 * @param extContinuingEducation the ext continuing education
	 */
	@Override
	public void cacheResult(ExtContinuingEducation extContinuingEducation) {
		entityCache.putResult(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtContinuingEducationImpl.class,
			extContinuingEducation.getPrimaryKey(), extContinuingEducation);

		extContinuingEducation.resetOriginalValues();
	}

	/**
	 * Caches the ext continuing educations in the entity cache if it is enabled.
	 *
	 * @param extContinuingEducations the ext continuing educations
	 */
	@Override
	public void cacheResult(
		List<ExtContinuingEducation> extContinuingEducations) {
		for (ExtContinuingEducation extContinuingEducation : extContinuingEducations) {
			if (entityCache.getResult(
						ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
						ExtContinuingEducationImpl.class,
						extContinuingEducation.getPrimaryKey()) == null) {
				cacheResult(extContinuingEducation);
			}
			else {
				extContinuingEducation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ext continuing educations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExtContinuingEducationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ext continuing education.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ExtContinuingEducation extContinuingEducation) {
		entityCache.removeResult(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtContinuingEducationImpl.class,
			extContinuingEducation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ExtContinuingEducation> extContinuingEducations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ExtContinuingEducation extContinuingEducation : extContinuingEducations) {
			entityCache.removeResult(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
				ExtContinuingEducationImpl.class,
				extContinuingEducation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ext continuing education with the primary key. Does not add the ext continuing education to the database.
	 *
	 * @param extContinuingEducationId the primary key for the new ext continuing education
	 * @return the new ext continuing education
	 */
	@Override
	public ExtContinuingEducation create(long extContinuingEducationId) {
		ExtContinuingEducation extContinuingEducation = new ExtContinuingEducationImpl();

		extContinuingEducation.setNew(true);
		extContinuingEducation.setPrimaryKey(extContinuingEducationId);

		extContinuingEducation.setCompanyId(companyProvider.getCompanyId());

		return extContinuingEducation;
	}

	/**
	 * Removes the ext continuing education with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param extContinuingEducationId the primary key of the ext continuing education
	 * @return the ext continuing education that was removed
	 * @throws NoSuchExtContinuingEducationException if a ext continuing education with the primary key could not be found
	 */
	@Override
	public ExtContinuingEducation remove(long extContinuingEducationId)
		throws NoSuchExtContinuingEducationException {
		return remove((Serializable)extContinuingEducationId);
	}

	/**
	 * Removes the ext continuing education with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ext continuing education
	 * @return the ext continuing education that was removed
	 * @throws NoSuchExtContinuingEducationException if a ext continuing education with the primary key could not be found
	 */
	@Override
	public ExtContinuingEducation remove(Serializable primaryKey)
		throws NoSuchExtContinuingEducationException {
		Session session = null;

		try {
			session = openSession();

			ExtContinuingEducation extContinuingEducation = (ExtContinuingEducation)session.get(ExtContinuingEducationImpl.class,
					primaryKey);

			if (extContinuingEducation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExtContinuingEducationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(extContinuingEducation);
		}
		catch (NoSuchExtContinuingEducationException nsee) {
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
	protected ExtContinuingEducation removeImpl(
		ExtContinuingEducation extContinuingEducation) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(extContinuingEducation)) {
				extContinuingEducation = (ExtContinuingEducation)session.get(ExtContinuingEducationImpl.class,
						extContinuingEducation.getPrimaryKeyObj());
			}

			if (extContinuingEducation != null) {
				session.delete(extContinuingEducation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (extContinuingEducation != null) {
			clearCache(extContinuingEducation);
		}

		return extContinuingEducation;
	}

	@Override
	public ExtContinuingEducation updateImpl(
		ExtContinuingEducation extContinuingEducation) {
		boolean isNew = extContinuingEducation.isNew();

		if (!(extContinuingEducation instanceof ExtContinuingEducationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(extContinuingEducation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(extContinuingEducation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in extContinuingEducation proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExtContinuingEducation implementation " +
				extContinuingEducation.getClass());
		}

		ExtContinuingEducationModelImpl extContinuingEducationModelImpl = (ExtContinuingEducationModelImpl)extContinuingEducation;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (extContinuingEducation.getCreateDate() == null)) {
			if (serviceContext == null) {
				extContinuingEducation.setCreateDate(now);
			}
			else {
				extContinuingEducation.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!extContinuingEducationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				extContinuingEducation.setModifiedDate(now);
			}
			else {
				extContinuingEducation.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (extContinuingEducation.isNew()) {
				session.save(extContinuingEducation);

				extContinuingEducation.setNew(false);
			}
			else {
				extContinuingEducation = (ExtContinuingEducation)session.merge(extContinuingEducation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ExtContinuingEducationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					extContinuingEducationModelImpl.getUserId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((extContinuingEducationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						extContinuingEducationModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { extContinuingEducationModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		entityCache.putResult(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtContinuingEducationImpl.class,
			extContinuingEducation.getPrimaryKey(), extContinuingEducation,
			false);

		extContinuingEducation.resetOriginalValues();

		return extContinuingEducation;
	}

	/**
	 * Returns the ext continuing education with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext continuing education
	 * @return the ext continuing education
	 * @throws NoSuchExtContinuingEducationException if a ext continuing education with the primary key could not be found
	 */
	@Override
	public ExtContinuingEducation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExtContinuingEducationException {
		ExtContinuingEducation extContinuingEducation = fetchByPrimaryKey(primaryKey);

		if (extContinuingEducation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExtContinuingEducationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return extContinuingEducation;
	}

	/**
	 * Returns the ext continuing education with the primary key or throws a {@link NoSuchExtContinuingEducationException} if it could not be found.
	 *
	 * @param extContinuingEducationId the primary key of the ext continuing education
	 * @return the ext continuing education
	 * @throws NoSuchExtContinuingEducationException if a ext continuing education with the primary key could not be found
	 */
	@Override
	public ExtContinuingEducation findByPrimaryKey(
		long extContinuingEducationId)
		throws NoSuchExtContinuingEducationException {
		return findByPrimaryKey((Serializable)extContinuingEducationId);
	}

	/**
	 * Returns the ext continuing education with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext continuing education
	 * @return the ext continuing education, or <code>null</code> if a ext continuing education with the primary key could not be found
	 */
	@Override
	public ExtContinuingEducation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
				ExtContinuingEducationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ExtContinuingEducation extContinuingEducation = (ExtContinuingEducation)serializable;

		if (extContinuingEducation == null) {
			Session session = null;

			try {
				session = openSession();

				extContinuingEducation = (ExtContinuingEducation)session.get(ExtContinuingEducationImpl.class,
						primaryKey);

				if (extContinuingEducation != null) {
					cacheResult(extContinuingEducation);
				}
				else {
					entityCache.putResult(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
						ExtContinuingEducationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
					ExtContinuingEducationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return extContinuingEducation;
	}

	/**
	 * Returns the ext continuing education with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param extContinuingEducationId the primary key of the ext continuing education
	 * @return the ext continuing education, or <code>null</code> if a ext continuing education with the primary key could not be found
	 */
	@Override
	public ExtContinuingEducation fetchByPrimaryKey(
		long extContinuingEducationId) {
		return fetchByPrimaryKey((Serializable)extContinuingEducationId);
	}

	@Override
	public Map<Serializable, ExtContinuingEducation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ExtContinuingEducation> map = new HashMap<Serializable, ExtContinuingEducation>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ExtContinuingEducation extContinuingEducation = fetchByPrimaryKey(primaryKey);

			if (extContinuingEducation != null) {
				map.put(primaryKey, extContinuingEducation);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
					ExtContinuingEducationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ExtContinuingEducation)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EXTCONTINUINGEDUCATION_WHERE_PKS_IN);

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

			for (ExtContinuingEducation extContinuingEducation : (List<ExtContinuingEducation>)q.list()) {
				map.put(extContinuingEducation.getPrimaryKeyObj(),
					extContinuingEducation);

				cacheResult(extContinuingEducation);

				uncachedPrimaryKeys.remove(extContinuingEducation.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ExtContinuingEducationModelImpl.ENTITY_CACHE_ENABLED,
					ExtContinuingEducationImpl.class, primaryKey, nullModel);
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
	 * Returns all the ext continuing educations.
	 *
	 * @return the ext continuing educations
	 */
	@Override
	public List<ExtContinuingEducation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext continuing educations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtContinuingEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext continuing educations
	 * @param end the upper bound of the range of ext continuing educations (not inclusive)
	 * @return the range of ext continuing educations
	 */
	@Override
	public List<ExtContinuingEducation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext continuing educations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtContinuingEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext continuing educations
	 * @param end the upper bound of the range of ext continuing educations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ext continuing educations
	 */
	@Override
	public List<ExtContinuingEducation> findAll(int start, int end,
		OrderByComparator<ExtContinuingEducation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext continuing educations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtContinuingEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext continuing educations
	 * @param end the upper bound of the range of ext continuing educations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ext continuing educations
	 */
	@Override
	public List<ExtContinuingEducation> findAll(int start, int end,
		OrderByComparator<ExtContinuingEducation> orderByComparator,
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

		List<ExtContinuingEducation> list = null;

		if (retrieveFromCache) {
			list = (List<ExtContinuingEducation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EXTCONTINUINGEDUCATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXTCONTINUINGEDUCATION;

				if (pagination) {
					sql = sql.concat(ExtContinuingEducationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ExtContinuingEducation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtContinuingEducation>)QueryUtil.list(q,
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
	 * Removes all the ext continuing educations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExtContinuingEducation extContinuingEducation : findAll()) {
			remove(extContinuingEducation);
		}
	}

	/**
	 * Returns the number of ext continuing educations.
	 *
	 * @return the number of ext continuing educations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EXTCONTINUINGEDUCATION);

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
		return ExtContinuingEducationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ext continuing education persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ExtContinuingEducationImpl.class.getName());
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
	private static final String _SQL_SELECT_EXTCONTINUINGEDUCATION = "SELECT extContinuingEducation FROM ExtContinuingEducation extContinuingEducation";
	private static final String _SQL_SELECT_EXTCONTINUINGEDUCATION_WHERE_PKS_IN = "SELECT extContinuingEducation FROM ExtContinuingEducation extContinuingEducation WHERE extContinuingEducationId IN (";
	private static final String _SQL_SELECT_EXTCONTINUINGEDUCATION_WHERE = "SELECT extContinuingEducation FROM ExtContinuingEducation extContinuingEducation WHERE ";
	private static final String _SQL_COUNT_EXTCONTINUINGEDUCATION = "SELECT COUNT(extContinuingEducation) FROM ExtContinuingEducation extContinuingEducation";
	private static final String _SQL_COUNT_EXTCONTINUINGEDUCATION_WHERE = "SELECT COUNT(extContinuingEducation) FROM ExtContinuingEducation extContinuingEducation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "extContinuingEducation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ExtContinuingEducation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ExtContinuingEducation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ExtContinuingEducationPersistenceImpl.class);
}