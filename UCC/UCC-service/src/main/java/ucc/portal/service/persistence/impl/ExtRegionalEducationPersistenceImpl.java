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

import ucc.portal.exception.NoSuchExtRegionalEducationException;

import ucc.portal.model.ExtRegionalEducation;
import ucc.portal.model.impl.ExtRegionalEducationImpl;
import ucc.portal.model.impl.ExtRegionalEducationModelImpl;

import ucc.portal.service.persistence.ExtRegionalEducationPersistence;

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
 * The persistence implementation for the ext regional education service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtRegionalEducationPersistence
 * @see ucc.portal.service.persistence.ExtRegionalEducationUtil
 * @generated
 */
@ProviderType
public class ExtRegionalEducationPersistenceImpl extends BasePersistenceImpl<ExtRegionalEducation>
	implements ExtRegionalEducationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ExtRegionalEducationUtil} to access the ext regional education persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ExtRegionalEducationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtRegionalEducationModelImpl.FINDER_CACHE_ENABLED,
			ExtRegionalEducationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtRegionalEducationModelImpl.FINDER_CACHE_ENABLED,
			ExtRegionalEducationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtRegionalEducationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtRegionalEducationModelImpl.FINDER_CACHE_ENABLED,
			ExtRegionalEducationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtRegionalEducationModelImpl.FINDER_CACHE_ENABLED,
			ExtRegionalEducationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			ExtRegionalEducationModelImpl.USERID_COLUMN_BITMASK |
			ExtRegionalEducationModelImpl.STARTDATEOFATTENDANCE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtRegionalEducationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ext regional educations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching ext regional educations
	 */
	@Override
	public List<ExtRegionalEducation> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext regional educations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtRegionalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext regional educations
	 * @param end the upper bound of the range of ext regional educations (not inclusive)
	 * @return the range of matching ext regional educations
	 */
	@Override
	public List<ExtRegionalEducation> findByUserId(long userId, int start,
		int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext regional educations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtRegionalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext regional educations
	 * @param end the upper bound of the range of ext regional educations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext regional educations
	 */
	@Override
	public List<ExtRegionalEducation> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtRegionalEducation> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext regional educations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtRegionalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of ext regional educations
	 * @param end the upper bound of the range of ext regional educations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ext regional educations
	 */
	@Override
	public List<ExtRegionalEducation> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtRegionalEducation> orderByComparator,
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

		List<ExtRegionalEducation> list = null;

		if (retrieveFromCache) {
			list = (List<ExtRegionalEducation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExtRegionalEducation extRegionalEducation : list) {
					if ((userId != extRegionalEducation.getUserId())) {
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

			query.append(_SQL_SELECT_EXTREGIONALEDUCATION_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExtRegionalEducationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<ExtRegionalEducation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtRegionalEducation>)QueryUtil.list(q,
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
	 * Returns the first ext regional education in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext regional education
	 * @throws NoSuchExtRegionalEducationException if a matching ext regional education could not be found
	 */
	@Override
	public ExtRegionalEducation findByUserId_First(long userId,
		OrderByComparator<ExtRegionalEducation> orderByComparator)
		throws NoSuchExtRegionalEducationException {
		ExtRegionalEducation extRegionalEducation = fetchByUserId_First(userId,
				orderByComparator);

		if (extRegionalEducation != null) {
			return extRegionalEducation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtRegionalEducationException(msg.toString());
	}

	/**
	 * Returns the first ext regional education in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext regional education, or <code>null</code> if a matching ext regional education could not be found
	 */
	@Override
	public ExtRegionalEducation fetchByUserId_First(long userId,
		OrderByComparator<ExtRegionalEducation> orderByComparator) {
		List<ExtRegionalEducation> list = findByUserId(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext regional education in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext regional education
	 * @throws NoSuchExtRegionalEducationException if a matching ext regional education could not be found
	 */
	@Override
	public ExtRegionalEducation findByUserId_Last(long userId,
		OrderByComparator<ExtRegionalEducation> orderByComparator)
		throws NoSuchExtRegionalEducationException {
		ExtRegionalEducation extRegionalEducation = fetchByUserId_Last(userId,
				orderByComparator);

		if (extRegionalEducation != null) {
			return extRegionalEducation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchExtRegionalEducationException(msg.toString());
	}

	/**
	 * Returns the last ext regional education in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext regional education, or <code>null</code> if a matching ext regional education could not be found
	 */
	@Override
	public ExtRegionalEducation fetchByUserId_Last(long userId,
		OrderByComparator<ExtRegionalEducation> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<ExtRegionalEducation> list = findByUserId(userId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext regional educations before and after the current ext regional education in the ordered set where userId = &#63;.
	 *
	 * @param extRegionalEducationId the primary key of the current ext regional education
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext regional education
	 * @throws NoSuchExtRegionalEducationException if a ext regional education with the primary key could not be found
	 */
	@Override
	public ExtRegionalEducation[] findByUserId_PrevAndNext(
		long extRegionalEducationId, long userId,
		OrderByComparator<ExtRegionalEducation> orderByComparator)
		throws NoSuchExtRegionalEducationException {
		ExtRegionalEducation extRegionalEducation = findByPrimaryKey(extRegionalEducationId);

		Session session = null;

		try {
			session = openSession();

			ExtRegionalEducation[] array = new ExtRegionalEducationImpl[3];

			array[0] = getByUserId_PrevAndNext(session, extRegionalEducation,
					userId, orderByComparator, true);

			array[1] = extRegionalEducation;

			array[2] = getByUserId_PrevAndNext(session, extRegionalEducation,
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

	protected ExtRegionalEducation getByUserId_PrevAndNext(Session session,
		ExtRegionalEducation extRegionalEducation, long userId,
		OrderByComparator<ExtRegionalEducation> orderByComparator,
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

		query.append(_SQL_SELECT_EXTREGIONALEDUCATION_WHERE);

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
			query.append(ExtRegionalEducationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(extRegionalEducation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ExtRegionalEducation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext regional educations where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (ExtRegionalEducation extRegionalEducation : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(extRegionalEducation);
		}
	}

	/**
	 * Returns the number of ext regional educations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching ext regional educations
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EXTREGIONALEDUCATION_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "extRegionalEducation.userId = ?";

	public ExtRegionalEducationPersistenceImpl() {
		setModelClass(ExtRegionalEducation.class);
	}

	/**
	 * Caches the ext regional education in the entity cache if it is enabled.
	 *
	 * @param extRegionalEducation the ext regional education
	 */
	@Override
	public void cacheResult(ExtRegionalEducation extRegionalEducation) {
		entityCache.putResult(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtRegionalEducationImpl.class,
			extRegionalEducation.getPrimaryKey(), extRegionalEducation);

		extRegionalEducation.resetOriginalValues();
	}

	/**
	 * Caches the ext regional educations in the entity cache if it is enabled.
	 *
	 * @param extRegionalEducations the ext regional educations
	 */
	@Override
	public void cacheResult(List<ExtRegionalEducation> extRegionalEducations) {
		for (ExtRegionalEducation extRegionalEducation : extRegionalEducations) {
			if (entityCache.getResult(
						ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
						ExtRegionalEducationImpl.class,
						extRegionalEducation.getPrimaryKey()) == null) {
				cacheResult(extRegionalEducation);
			}
			else {
				extRegionalEducation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ext regional educations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExtRegionalEducationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ext regional education.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ExtRegionalEducation extRegionalEducation) {
		entityCache.removeResult(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtRegionalEducationImpl.class, extRegionalEducation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ExtRegionalEducation> extRegionalEducations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ExtRegionalEducation extRegionalEducation : extRegionalEducations) {
			entityCache.removeResult(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
				ExtRegionalEducationImpl.class,
				extRegionalEducation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ext regional education with the primary key. Does not add the ext regional education to the database.
	 *
	 * @param extRegionalEducationId the primary key for the new ext regional education
	 * @return the new ext regional education
	 */
	@Override
	public ExtRegionalEducation create(long extRegionalEducationId) {
		ExtRegionalEducation extRegionalEducation = new ExtRegionalEducationImpl();

		extRegionalEducation.setNew(true);
		extRegionalEducation.setPrimaryKey(extRegionalEducationId);

		extRegionalEducation.setCompanyId(companyProvider.getCompanyId());

		return extRegionalEducation;
	}

	/**
	 * Removes the ext regional education with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param extRegionalEducationId the primary key of the ext regional education
	 * @return the ext regional education that was removed
	 * @throws NoSuchExtRegionalEducationException if a ext regional education with the primary key could not be found
	 */
	@Override
	public ExtRegionalEducation remove(long extRegionalEducationId)
		throws NoSuchExtRegionalEducationException {
		return remove((Serializable)extRegionalEducationId);
	}

	/**
	 * Removes the ext regional education with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ext regional education
	 * @return the ext regional education that was removed
	 * @throws NoSuchExtRegionalEducationException if a ext regional education with the primary key could not be found
	 */
	@Override
	public ExtRegionalEducation remove(Serializable primaryKey)
		throws NoSuchExtRegionalEducationException {
		Session session = null;

		try {
			session = openSession();

			ExtRegionalEducation extRegionalEducation = (ExtRegionalEducation)session.get(ExtRegionalEducationImpl.class,
					primaryKey);

			if (extRegionalEducation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExtRegionalEducationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(extRegionalEducation);
		}
		catch (NoSuchExtRegionalEducationException nsee) {
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
	protected ExtRegionalEducation removeImpl(
		ExtRegionalEducation extRegionalEducation) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(extRegionalEducation)) {
				extRegionalEducation = (ExtRegionalEducation)session.get(ExtRegionalEducationImpl.class,
						extRegionalEducation.getPrimaryKeyObj());
			}

			if (extRegionalEducation != null) {
				session.delete(extRegionalEducation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (extRegionalEducation != null) {
			clearCache(extRegionalEducation);
		}

		return extRegionalEducation;
	}

	@Override
	public ExtRegionalEducation updateImpl(
		ExtRegionalEducation extRegionalEducation) {
		boolean isNew = extRegionalEducation.isNew();

		if (!(extRegionalEducation instanceof ExtRegionalEducationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(extRegionalEducation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(extRegionalEducation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in extRegionalEducation proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExtRegionalEducation implementation " +
				extRegionalEducation.getClass());
		}

		ExtRegionalEducationModelImpl extRegionalEducationModelImpl = (ExtRegionalEducationModelImpl)extRegionalEducation;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (extRegionalEducation.getCreateDate() == null)) {
			if (serviceContext == null) {
				extRegionalEducation.setCreateDate(now);
			}
			else {
				extRegionalEducation.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!extRegionalEducationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				extRegionalEducation.setModifiedDate(now);
			}
			else {
				extRegionalEducation.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (extRegionalEducation.isNew()) {
				session.save(extRegionalEducation);

				extRegionalEducation.setNew(false);
			}
			else {
				extRegionalEducation = (ExtRegionalEducation)session.merge(extRegionalEducation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ExtRegionalEducationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					extRegionalEducationModelImpl.getUserId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((extRegionalEducationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						extRegionalEducationModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { extRegionalEducationModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		entityCache.putResult(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
			ExtRegionalEducationImpl.class,
			extRegionalEducation.getPrimaryKey(), extRegionalEducation, false);

		extRegionalEducation.resetOriginalValues();

		return extRegionalEducation;
	}

	/**
	 * Returns the ext regional education with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext regional education
	 * @return the ext regional education
	 * @throws NoSuchExtRegionalEducationException if a ext regional education with the primary key could not be found
	 */
	@Override
	public ExtRegionalEducation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExtRegionalEducationException {
		ExtRegionalEducation extRegionalEducation = fetchByPrimaryKey(primaryKey);

		if (extRegionalEducation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExtRegionalEducationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return extRegionalEducation;
	}

	/**
	 * Returns the ext regional education with the primary key or throws a {@link NoSuchExtRegionalEducationException} if it could not be found.
	 *
	 * @param extRegionalEducationId the primary key of the ext regional education
	 * @return the ext regional education
	 * @throws NoSuchExtRegionalEducationException if a ext regional education with the primary key could not be found
	 */
	@Override
	public ExtRegionalEducation findByPrimaryKey(long extRegionalEducationId)
		throws NoSuchExtRegionalEducationException {
		return findByPrimaryKey((Serializable)extRegionalEducationId);
	}

	/**
	 * Returns the ext regional education with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext regional education
	 * @return the ext regional education, or <code>null</code> if a ext regional education with the primary key could not be found
	 */
	@Override
	public ExtRegionalEducation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
				ExtRegionalEducationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ExtRegionalEducation extRegionalEducation = (ExtRegionalEducation)serializable;

		if (extRegionalEducation == null) {
			Session session = null;

			try {
				session = openSession();

				extRegionalEducation = (ExtRegionalEducation)session.get(ExtRegionalEducationImpl.class,
						primaryKey);

				if (extRegionalEducation != null) {
					cacheResult(extRegionalEducation);
				}
				else {
					entityCache.putResult(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
						ExtRegionalEducationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
					ExtRegionalEducationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return extRegionalEducation;
	}

	/**
	 * Returns the ext regional education with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param extRegionalEducationId the primary key of the ext regional education
	 * @return the ext regional education, or <code>null</code> if a ext regional education with the primary key could not be found
	 */
	@Override
	public ExtRegionalEducation fetchByPrimaryKey(long extRegionalEducationId) {
		return fetchByPrimaryKey((Serializable)extRegionalEducationId);
	}

	@Override
	public Map<Serializable, ExtRegionalEducation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ExtRegionalEducation> map = new HashMap<Serializable, ExtRegionalEducation>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ExtRegionalEducation extRegionalEducation = fetchByPrimaryKey(primaryKey);

			if (extRegionalEducation != null) {
				map.put(primaryKey, extRegionalEducation);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
					ExtRegionalEducationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ExtRegionalEducation)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EXTREGIONALEDUCATION_WHERE_PKS_IN);

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

			for (ExtRegionalEducation extRegionalEducation : (List<ExtRegionalEducation>)q.list()) {
				map.put(extRegionalEducation.getPrimaryKeyObj(),
					extRegionalEducation);

				cacheResult(extRegionalEducation);

				uncachedPrimaryKeys.remove(extRegionalEducation.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ExtRegionalEducationModelImpl.ENTITY_CACHE_ENABLED,
					ExtRegionalEducationImpl.class, primaryKey, nullModel);
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
	 * Returns all the ext regional educations.
	 *
	 * @return the ext regional educations
	 */
	@Override
	public List<ExtRegionalEducation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext regional educations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtRegionalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext regional educations
	 * @param end the upper bound of the range of ext regional educations (not inclusive)
	 * @return the range of ext regional educations
	 */
	@Override
	public List<ExtRegionalEducation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext regional educations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtRegionalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext regional educations
	 * @param end the upper bound of the range of ext regional educations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ext regional educations
	 */
	@Override
	public List<ExtRegionalEducation> findAll(int start, int end,
		OrderByComparator<ExtRegionalEducation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ext regional educations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtRegionalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext regional educations
	 * @param end the upper bound of the range of ext regional educations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ext regional educations
	 */
	@Override
	public List<ExtRegionalEducation> findAll(int start, int end,
		OrderByComparator<ExtRegionalEducation> orderByComparator,
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

		List<ExtRegionalEducation> list = null;

		if (retrieveFromCache) {
			list = (List<ExtRegionalEducation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EXTREGIONALEDUCATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXTREGIONALEDUCATION;

				if (pagination) {
					sql = sql.concat(ExtRegionalEducationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ExtRegionalEducation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ExtRegionalEducation>)QueryUtil.list(q,
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
	 * Removes all the ext regional educations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExtRegionalEducation extRegionalEducation : findAll()) {
			remove(extRegionalEducation);
		}
	}

	/**
	 * Returns the number of ext regional educations.
	 *
	 * @return the number of ext regional educations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EXTREGIONALEDUCATION);

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
		return ExtRegionalEducationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ext regional education persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ExtRegionalEducationImpl.class.getName());
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
	private static final String _SQL_SELECT_EXTREGIONALEDUCATION = "SELECT extRegionalEducation FROM ExtRegionalEducation extRegionalEducation";
	private static final String _SQL_SELECT_EXTREGIONALEDUCATION_WHERE_PKS_IN = "SELECT extRegionalEducation FROM ExtRegionalEducation extRegionalEducation WHERE extRegionalEducationId IN (";
	private static final String _SQL_SELECT_EXTREGIONALEDUCATION_WHERE = "SELECT extRegionalEducation FROM ExtRegionalEducation extRegionalEducation WHERE ";
	private static final String _SQL_COUNT_EXTREGIONALEDUCATION = "SELECT COUNT(extRegionalEducation) FROM ExtRegionalEducation extRegionalEducation";
	private static final String _SQL_COUNT_EXTREGIONALEDUCATION_WHERE = "SELECT COUNT(extRegionalEducation) FROM ExtRegionalEducation extRegionalEducation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "extRegionalEducation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ExtRegionalEducation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ExtRegionalEducation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ExtRegionalEducationPersistenceImpl.class);
}