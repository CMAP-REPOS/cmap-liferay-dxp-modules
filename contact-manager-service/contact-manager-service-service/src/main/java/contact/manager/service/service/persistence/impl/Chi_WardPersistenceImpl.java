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

import contact.manager.service.exception.NoSuchChi_WardException;
import contact.manager.service.model.Chi_Ward;
import contact.manager.service.model.impl.Chi_WardImpl;
import contact.manager.service.model.impl.Chi_WardModelImpl;
import contact.manager.service.service.persistence.Chi_WardPersistence;

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
 * The persistence implementation for the chi_ ward service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Chi_WardPersistence
 * @see contact.manager.service.service.persistence.Chi_WardUtil
 * @generated
 */
@ProviderType
public class Chi_WardPersistenceImpl extends BasePersistenceImpl<Chi_Ward>
	implements Chi_WardPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Chi_WardUtil} to access the chi_ ward persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Chi_WardImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
			Chi_WardModelImpl.FINDER_CACHE_ENABLED, Chi_WardImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
			Chi_WardModelImpl.FINDER_CACHE_ENABLED, Chi_WardImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
			Chi_WardModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ZIPCODE = new FinderPath(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
			Chi_WardModelImpl.FINDER_CACHE_ENABLED, Chi_WardImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByZipCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE =
		new FinderPath(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
			Chi_WardModelImpl.FINDER_CACHE_ENABLED, Chi_WardImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByZipCode",
			new String[] { String.class.getName() },
			Chi_WardModelImpl.ZIPCODE_COLUMN_BITMASK |
			Chi_WardModelImpl.CHIWARDNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ZIPCODE = new FinderPath(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
			Chi_WardModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByZipCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the chi_ wards where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching chi_ wards
	 */
	@Override
	public List<Chi_Ward> findByZipCode(String zipCode) {
		return findByZipCode(zipCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the chi_ wards where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of chi_ wards
	 * @param end the upper bound of the range of chi_ wards (not inclusive)
	 * @return the range of matching chi_ wards
	 */
	@Override
	public List<Chi_Ward> findByZipCode(String zipCode, int start, int end) {
		return findByZipCode(zipCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the chi_ wards where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of chi_ wards
	 * @param end the upper bound of the range of chi_ wards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching chi_ wards
	 */
	@Override
	public List<Chi_Ward> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<Chi_Ward> orderByComparator) {
		return findByZipCode(zipCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the chi_ wards where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of chi_ wards
	 * @param end the upper bound of the range of chi_ wards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching chi_ wards
	 */
	@Override
	public List<Chi_Ward> findByZipCode(String zipCode, int start, int end,
		OrderByComparator<Chi_Ward> orderByComparator, boolean retrieveFromCache) {
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

		List<Chi_Ward> list = null;

		if (retrieveFromCache) {
			list = (List<Chi_Ward>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Chi_Ward chi_Ward : list) {
					if (!Objects.equals(zipCode, chi_Ward.getZipCode())) {
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

			query.append(_SQL_SELECT_CHI_WARD_WHERE);

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
				query.append(Chi_WardModelImpl.ORDER_BY_JPQL);
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
					list = (List<Chi_Ward>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Chi_Ward>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first chi_ ward in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching chi_ ward
	 * @throws NoSuchChi_WardException if a matching chi_ ward could not be found
	 */
	@Override
	public Chi_Ward findByZipCode_First(String zipCode,
		OrderByComparator<Chi_Ward> orderByComparator)
		throws NoSuchChi_WardException {
		Chi_Ward chi_Ward = fetchByZipCode_First(zipCode, orderByComparator);

		if (chi_Ward != null) {
			return chi_Ward;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchChi_WardException(msg.toString());
	}

	/**
	 * Returns the first chi_ ward in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching chi_ ward, or <code>null</code> if a matching chi_ ward could not be found
	 */
	@Override
	public Chi_Ward fetchByZipCode_First(String zipCode,
		OrderByComparator<Chi_Ward> orderByComparator) {
		List<Chi_Ward> list = findByZipCode(zipCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last chi_ ward in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching chi_ ward
	 * @throws NoSuchChi_WardException if a matching chi_ ward could not be found
	 */
	@Override
	public Chi_Ward findByZipCode_Last(String zipCode,
		OrderByComparator<Chi_Ward> orderByComparator)
		throws NoSuchChi_WardException {
		Chi_Ward chi_Ward = fetchByZipCode_Last(zipCode, orderByComparator);

		if (chi_Ward != null) {
			return chi_Ward;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchChi_WardException(msg.toString());
	}

	/**
	 * Returns the last chi_ ward in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching chi_ ward, or <code>null</code> if a matching chi_ ward could not be found
	 */
	@Override
	public Chi_Ward fetchByZipCode_Last(String zipCode,
		OrderByComparator<Chi_Ward> orderByComparator) {
		int count = countByZipCode(zipCode);

		if (count == 0) {
			return null;
		}

		List<Chi_Ward> list = findByZipCode(zipCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the chi_ wards before and after the current chi_ ward in the ordered set where zipCode = &#63;.
	 *
	 * @param chiWardId the primary key of the current chi_ ward
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next chi_ ward
	 * @throws NoSuchChi_WardException if a chi_ ward with the primary key could not be found
	 */
	@Override
	public Chi_Ward[] findByZipCode_PrevAndNext(long chiWardId, String zipCode,
		OrderByComparator<Chi_Ward> orderByComparator)
		throws NoSuchChi_WardException {
		Chi_Ward chi_Ward = findByPrimaryKey(chiWardId);

		Session session = null;

		try {
			session = openSession();

			Chi_Ward[] array = new Chi_WardImpl[3];

			array[0] = getByZipCode_PrevAndNext(session, chi_Ward, zipCode,
					orderByComparator, true);

			array[1] = chi_Ward;

			array[2] = getByZipCode_PrevAndNext(session, chi_Ward, zipCode,
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

	protected Chi_Ward getByZipCode_PrevAndNext(Session session,
		Chi_Ward chi_Ward, String zipCode,
		OrderByComparator<Chi_Ward> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CHI_WARD_WHERE);

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
			query.append(Chi_WardModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(chi_Ward);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Chi_Ward> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the chi_ wards where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	@Override
	public void removeByZipCode(String zipCode) {
		for (Chi_Ward chi_Ward : findByZipCode(zipCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(chi_Ward);
		}
	}

	/**
	 * Returns the number of chi_ wards where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching chi_ wards
	 */
	@Override
	public int countByZipCode(String zipCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ZIPCODE;

		Object[] finderArgs = new Object[] { zipCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CHI_WARD_WHERE);

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

	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_1 = "chi_Ward.zipCode IS NULL";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_2 = "chi_Ward.zipCode = ?";
	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_3 = "(chi_Ward.zipCode IS NULL OR chi_Ward.zipCode = '')";

	public Chi_WardPersistenceImpl() {
		setModelClass(Chi_Ward.class);
	}

	/**
	 * Caches the chi_ ward in the entity cache if it is enabled.
	 *
	 * @param chi_Ward the chi_ ward
	 */
	@Override
	public void cacheResult(Chi_Ward chi_Ward) {
		entityCache.putResult(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
			Chi_WardImpl.class, chi_Ward.getPrimaryKey(), chi_Ward);

		chi_Ward.resetOriginalValues();
	}

	/**
	 * Caches the chi_ wards in the entity cache if it is enabled.
	 *
	 * @param chi_Wards the chi_ wards
	 */
	@Override
	public void cacheResult(List<Chi_Ward> chi_Wards) {
		for (Chi_Ward chi_Ward : chi_Wards) {
			if (entityCache.getResult(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
						Chi_WardImpl.class, chi_Ward.getPrimaryKey()) == null) {
				cacheResult(chi_Ward);
			}
			else {
				chi_Ward.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all chi_ wards.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Chi_WardImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the chi_ ward.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Chi_Ward chi_Ward) {
		entityCache.removeResult(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
			Chi_WardImpl.class, chi_Ward.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Chi_Ward> chi_Wards) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Chi_Ward chi_Ward : chi_Wards) {
			entityCache.removeResult(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
				Chi_WardImpl.class, chi_Ward.getPrimaryKey());
		}
	}

	/**
	 * Creates a new chi_ ward with the primary key. Does not add the chi_ ward to the database.
	 *
	 * @param chiWardId the primary key for the new chi_ ward
	 * @return the new chi_ ward
	 */
	@Override
	public Chi_Ward create(long chiWardId) {
		Chi_Ward chi_Ward = new Chi_WardImpl();

		chi_Ward.setNew(true);
		chi_Ward.setPrimaryKey(chiWardId);

		return chi_Ward;
	}

	/**
	 * Removes the chi_ ward with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param chiWardId the primary key of the chi_ ward
	 * @return the chi_ ward that was removed
	 * @throws NoSuchChi_WardException if a chi_ ward with the primary key could not be found
	 */
	@Override
	public Chi_Ward remove(long chiWardId) throws NoSuchChi_WardException {
		return remove((Serializable)chiWardId);
	}

	/**
	 * Removes the chi_ ward with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the chi_ ward
	 * @return the chi_ ward that was removed
	 * @throws NoSuchChi_WardException if a chi_ ward with the primary key could not be found
	 */
	@Override
	public Chi_Ward remove(Serializable primaryKey)
		throws NoSuchChi_WardException {
		Session session = null;

		try {
			session = openSession();

			Chi_Ward chi_Ward = (Chi_Ward)session.get(Chi_WardImpl.class,
					primaryKey);

			if (chi_Ward == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchChi_WardException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(chi_Ward);
		}
		catch (NoSuchChi_WardException nsee) {
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
	protected Chi_Ward removeImpl(Chi_Ward chi_Ward) {
		chi_Ward = toUnwrappedModel(chi_Ward);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(chi_Ward)) {
				chi_Ward = (Chi_Ward)session.get(Chi_WardImpl.class,
						chi_Ward.getPrimaryKeyObj());
			}

			if (chi_Ward != null) {
				session.delete(chi_Ward);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (chi_Ward != null) {
			clearCache(chi_Ward);
		}

		return chi_Ward;
	}

	@Override
	public Chi_Ward updateImpl(Chi_Ward chi_Ward) {
		chi_Ward = toUnwrappedModel(chi_Ward);

		boolean isNew = chi_Ward.isNew();

		Chi_WardModelImpl chi_WardModelImpl = (Chi_WardModelImpl)chi_Ward;

		Session session = null;

		try {
			session = openSession();

			if (chi_Ward.isNew()) {
				session.save(chi_Ward);

				chi_Ward.setNew(false);
			}
			else {
				chi_Ward = (Chi_Ward)session.merge(chi_Ward);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!Chi_WardModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { chi_WardModelImpl.getZipCode() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((chi_WardModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						chi_WardModelImpl.getOriginalZipCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);

				args = new Object[] { chi_WardModelImpl.getZipCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ZIPCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ZIPCODE,
					args);
			}
		}

		entityCache.putResult(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
			Chi_WardImpl.class, chi_Ward.getPrimaryKey(), chi_Ward, false);

		chi_Ward.resetOriginalValues();

		return chi_Ward;
	}

	protected Chi_Ward toUnwrappedModel(Chi_Ward chi_Ward) {
		if (chi_Ward instanceof Chi_WardImpl) {
			return chi_Ward;
		}

		Chi_WardImpl chi_WardImpl = new Chi_WardImpl();

		chi_WardImpl.setNew(chi_Ward.isNew());
		chi_WardImpl.setPrimaryKey(chi_Ward.getPrimaryKey());

		chi_WardImpl.setChiWardId(chi_Ward.getChiWardId());
		chi_WardImpl.setChiWardName(chi_Ward.getChiWardName());
		chi_WardImpl.setZipCode(chi_Ward.getZipCode());

		return chi_WardImpl;
	}

	/**
	 * Returns the chi_ ward with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the chi_ ward
	 * @return the chi_ ward
	 * @throws NoSuchChi_WardException if a chi_ ward with the primary key could not be found
	 */
	@Override
	public Chi_Ward findByPrimaryKey(Serializable primaryKey)
		throws NoSuchChi_WardException {
		Chi_Ward chi_Ward = fetchByPrimaryKey(primaryKey);

		if (chi_Ward == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchChi_WardException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return chi_Ward;
	}

	/**
	 * Returns the chi_ ward with the primary key or throws a {@link NoSuchChi_WardException} if it could not be found.
	 *
	 * @param chiWardId the primary key of the chi_ ward
	 * @return the chi_ ward
	 * @throws NoSuchChi_WardException if a chi_ ward with the primary key could not be found
	 */
	@Override
	public Chi_Ward findByPrimaryKey(long chiWardId)
		throws NoSuchChi_WardException {
		return findByPrimaryKey((Serializable)chiWardId);
	}

	/**
	 * Returns the chi_ ward with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the chi_ ward
	 * @return the chi_ ward, or <code>null</code> if a chi_ ward with the primary key could not be found
	 */
	@Override
	public Chi_Ward fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
				Chi_WardImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Chi_Ward chi_Ward = (Chi_Ward)serializable;

		if (chi_Ward == null) {
			Session session = null;

			try {
				session = openSession();

				chi_Ward = (Chi_Ward)session.get(Chi_WardImpl.class, primaryKey);

				if (chi_Ward != null) {
					cacheResult(chi_Ward);
				}
				else {
					entityCache.putResult(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
						Chi_WardImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
					Chi_WardImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return chi_Ward;
	}

	/**
	 * Returns the chi_ ward with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param chiWardId the primary key of the chi_ ward
	 * @return the chi_ ward, or <code>null</code> if a chi_ ward with the primary key could not be found
	 */
	@Override
	public Chi_Ward fetchByPrimaryKey(long chiWardId) {
		return fetchByPrimaryKey((Serializable)chiWardId);
	}

	@Override
	public Map<Serializable, Chi_Ward> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Chi_Ward> map = new HashMap<Serializable, Chi_Ward>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Chi_Ward chi_Ward = fetchByPrimaryKey(primaryKey);

			if (chi_Ward != null) {
				map.put(primaryKey, chi_Ward);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
					Chi_WardImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Chi_Ward)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CHI_WARD_WHERE_PKS_IN);

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

			for (Chi_Ward chi_Ward : (List<Chi_Ward>)q.list()) {
				map.put(chi_Ward.getPrimaryKeyObj(), chi_Ward);

				cacheResult(chi_Ward);

				uncachedPrimaryKeys.remove(chi_Ward.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(Chi_WardModelImpl.ENTITY_CACHE_ENABLED,
					Chi_WardImpl.class, primaryKey, nullModel);
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
	 * Returns all the chi_ wards.
	 *
	 * @return the chi_ wards
	 */
	@Override
	public List<Chi_Ward> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the chi_ wards.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of chi_ wards
	 * @param end the upper bound of the range of chi_ wards (not inclusive)
	 * @return the range of chi_ wards
	 */
	@Override
	public List<Chi_Ward> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the chi_ wards.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of chi_ wards
	 * @param end the upper bound of the range of chi_ wards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of chi_ wards
	 */
	@Override
	public List<Chi_Ward> findAll(int start, int end,
		OrderByComparator<Chi_Ward> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the chi_ wards.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of chi_ wards
	 * @param end the upper bound of the range of chi_ wards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of chi_ wards
	 */
	@Override
	public List<Chi_Ward> findAll(int start, int end,
		OrderByComparator<Chi_Ward> orderByComparator, boolean retrieveFromCache) {
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

		List<Chi_Ward> list = null;

		if (retrieveFromCache) {
			list = (List<Chi_Ward>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CHI_WARD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CHI_WARD;

				if (pagination) {
					sql = sql.concat(Chi_WardModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Chi_Ward>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Chi_Ward>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the chi_ wards from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Chi_Ward chi_Ward : findAll()) {
			remove(chi_Ward);
		}
	}

	/**
	 * Returns the number of chi_ wards.
	 *
	 * @return the number of chi_ wards
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CHI_WARD);

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
		return Chi_WardModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the chi_ ward persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(Chi_WardImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CHI_WARD = "SELECT chi_Ward FROM Chi_Ward chi_Ward";
	private static final String _SQL_SELECT_CHI_WARD_WHERE_PKS_IN = "SELECT chi_Ward FROM Chi_Ward chi_Ward WHERE chiWardId IN (";
	private static final String _SQL_SELECT_CHI_WARD_WHERE = "SELECT chi_Ward FROM Chi_Ward chi_Ward WHERE ";
	private static final String _SQL_COUNT_CHI_WARD = "SELECT COUNT(chi_Ward) FROM Chi_Ward chi_Ward";
	private static final String _SQL_COUNT_CHI_WARD_WHERE = "SELECT COUNT(chi_Ward) FROM Chi_Ward chi_Ward WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "chi_Ward.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Chi_Ward exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Chi_Ward exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(Chi_WardPersistenceImpl.class);
}