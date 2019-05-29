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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ucc.portal.exception.NoSuchUccPeopleException;

import ucc.portal.model.UccPeople;
import ucc.portal.model.impl.UccPeopleImpl;
import ucc.portal.model.impl.UccPeopleModelImpl;

import ucc.portal.service.persistence.UccPeoplePersistence;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the ucc people service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccPeoplePersistence
 * @see ucc.portal.service.persistence.UccPeopleUtil
 * @generated
 */
@ProviderType
public class UccPeoplePersistenceImpl extends BasePersistenceImpl<UccPeople>
	implements UccPeoplePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UccPeopleUtil} to access the ucc people persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UccPeopleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleModelImpl.FINDER_CACHE_ENABLED, UccPeopleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleModelImpl.FINDER_CACHE_ENABLED, UccPeopleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVE = new FinderPath(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleModelImpl.FINDER_CACHE_ENABLED, UccPeopleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByActive",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE =
		new FinderPath(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleModelImpl.FINDER_CACHE_ENABLED, UccPeopleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByActive",
			new String[] { Boolean.class.getName() },
			UccPeopleModelImpl.MYACTIVE_COLUMN_BITMASK |
			UccPeopleModelImpl.LASTNAME_COLUMN_BITMASK |
			UccPeopleModelImpl.FIRSTNAME_COLUMN_BITMASK |
			UccPeopleModelImpl.MIDDLENAME_COLUMN_BITMASK |
			UccPeopleModelImpl.SUFFIX_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVE = new FinderPath(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActive",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the ucc peoples where myActive = &#63;.
	 *
	 * @param myActive the my active
	 * @return the matching ucc peoples
	 */
	@Override
	public List<UccPeople> findByActive(boolean myActive) {
		return findByActive(myActive, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ucc peoples where myActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param myActive the my active
	 * @param start the lower bound of the range of ucc peoples
	 * @param end the upper bound of the range of ucc peoples (not inclusive)
	 * @return the range of matching ucc peoples
	 */
	@Override
	public List<UccPeople> findByActive(boolean myActive, int start, int end) {
		return findByActive(myActive, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ucc peoples where myActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param myActive the my active
	 * @param start the lower bound of the range of ucc peoples
	 * @param end the upper bound of the range of ucc peoples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ucc peoples
	 */
	@Override
	public List<UccPeople> findByActive(boolean myActive, int start, int end,
		OrderByComparator<UccPeople> orderByComparator) {
		return findByActive(myActive, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ucc peoples where myActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param myActive the my active
	 * @param start the lower bound of the range of ucc peoples
	 * @param end the upper bound of the range of ucc peoples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ucc peoples
	 */
	@Override
	public List<UccPeople> findByActive(boolean myActive, int start, int end,
		OrderByComparator<UccPeople> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE;
			finderArgs = new Object[] { myActive };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVE;
			finderArgs = new Object[] { myActive, start, end, orderByComparator };
		}

		List<UccPeople> list = null;

		if (retrieveFromCache) {
			list = (List<UccPeople>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UccPeople uccPeople : list) {
					if ((myActive != uccPeople.isMyActive())) {
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

			query.append(_SQL_SELECT_UCCPEOPLE_WHERE);

			query.append(_FINDER_COLUMN_ACTIVE_MYACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UccPeopleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(myActive);

				if (!pagination) {
					list = (List<UccPeople>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UccPeople>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ucc people in the ordered set where myActive = &#63;.
	 *
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ucc people
	 * @throws NoSuchUccPeopleException if a matching ucc people could not be found
	 */
	@Override
	public UccPeople findByActive_First(boolean myActive,
		OrderByComparator<UccPeople> orderByComparator)
		throws NoSuchUccPeopleException {
		UccPeople uccPeople = fetchByActive_First(myActive, orderByComparator);

		if (uccPeople != null) {
			return uccPeople;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("myActive=");
		msg.append(myActive);

		msg.append("}");

		throw new NoSuchUccPeopleException(msg.toString());
	}

	/**
	 * Returns the first ucc people in the ordered set where myActive = &#63;.
	 *
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ucc people, or <code>null</code> if a matching ucc people could not be found
	 */
	@Override
	public UccPeople fetchByActive_First(boolean myActive,
		OrderByComparator<UccPeople> orderByComparator) {
		List<UccPeople> list = findByActive(myActive, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ucc people in the ordered set where myActive = &#63;.
	 *
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ucc people
	 * @throws NoSuchUccPeopleException if a matching ucc people could not be found
	 */
	@Override
	public UccPeople findByActive_Last(boolean myActive,
		OrderByComparator<UccPeople> orderByComparator)
		throws NoSuchUccPeopleException {
		UccPeople uccPeople = fetchByActive_Last(myActive, orderByComparator);

		if (uccPeople != null) {
			return uccPeople;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("myActive=");
		msg.append(myActive);

		msg.append("}");

		throw new NoSuchUccPeopleException(msg.toString());
	}

	/**
	 * Returns the last ucc people in the ordered set where myActive = &#63;.
	 *
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ucc people, or <code>null</code> if a matching ucc people could not be found
	 */
	@Override
	public UccPeople fetchByActive_Last(boolean myActive,
		OrderByComparator<UccPeople> orderByComparator) {
		int count = countByActive(myActive);

		if (count == 0) {
			return null;
		}

		List<UccPeople> list = findByActive(myActive, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ucc peoples before and after the current ucc people in the ordered set where myActive = &#63;.
	 *
	 * @param uccPeopleId the primary key of the current ucc people
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ucc people
	 * @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	 */
	@Override
	public UccPeople[] findByActive_PrevAndNext(int uccPeopleId,
		boolean myActive, OrderByComparator<UccPeople> orderByComparator)
		throws NoSuchUccPeopleException {
		UccPeople uccPeople = findByPrimaryKey(uccPeopleId);

		Session session = null;

		try {
			session = openSession();

			UccPeople[] array = new UccPeopleImpl[3];

			array[0] = getByActive_PrevAndNext(session, uccPeople, myActive,
					orderByComparator, true);

			array[1] = uccPeople;

			array[2] = getByActive_PrevAndNext(session, uccPeople, myActive,
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

	protected UccPeople getByActive_PrevAndNext(Session session,
		UccPeople uccPeople, boolean myActive,
		OrderByComparator<UccPeople> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_UCCPEOPLE_WHERE);

		query.append(_FINDER_COLUMN_ACTIVE_MYACTIVE_2);

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
			query.append(UccPeopleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(myActive);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(uccPeople);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UccPeople> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ucc peoples where myActive = &#63; from the database.
	 *
	 * @param myActive the my active
	 */
	@Override
	public void removeByActive(boolean myActive) {
		for (UccPeople uccPeople : findByActive(myActive, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(uccPeople);
		}
	}

	/**
	 * Returns the number of ucc peoples where myActive = &#63;.
	 *
	 * @param myActive the my active
	 * @return the number of matching ucc peoples
	 */
	@Override
	public int countByActive(boolean myActive) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ACTIVE;

		Object[] finderArgs = new Object[] { myActive };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_UCCPEOPLE_WHERE);

			query.append(_FINDER_COLUMN_ACTIVE_MYACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(myActive);

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

	private static final String _FINDER_COLUMN_ACTIVE_MYACTIVE_2 = "uccPeople.myActive = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OLDUCCPEOPLEID =
		new FinderPath(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleModelImpl.FINDER_CACHE_ENABLED, UccPeopleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOldUccPeopleId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OLDUCCPEOPLEID =
		new FinderPath(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleModelImpl.FINDER_CACHE_ENABLED, UccPeopleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOldUccPeopleId",
			new String[] { Integer.class.getName() },
			UccPeopleModelImpl.OLDUCCPEOPLEID_COLUMN_BITMASK |
			UccPeopleModelImpl.LASTNAME_COLUMN_BITMASK |
			UccPeopleModelImpl.FIRSTNAME_COLUMN_BITMASK |
			UccPeopleModelImpl.MIDDLENAME_COLUMN_BITMASK |
			UccPeopleModelImpl.SUFFIX_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OLDUCCPEOPLEID = new FinderPath(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOldUccPeopleId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the ucc peoples where oldUccPeopleId = &#63;.
	 *
	 * @param oldUccPeopleId the old ucc people ID
	 * @return the matching ucc peoples
	 */
	@Override
	public List<UccPeople> findByOldUccPeopleId(int oldUccPeopleId) {
		return findByOldUccPeopleId(oldUccPeopleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ucc peoples where oldUccPeopleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param oldUccPeopleId the old ucc people ID
	 * @param start the lower bound of the range of ucc peoples
	 * @param end the upper bound of the range of ucc peoples (not inclusive)
	 * @return the range of matching ucc peoples
	 */
	@Override
	public List<UccPeople> findByOldUccPeopleId(int oldUccPeopleId, int start,
		int end) {
		return findByOldUccPeopleId(oldUccPeopleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ucc peoples where oldUccPeopleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param oldUccPeopleId the old ucc people ID
	 * @param start the lower bound of the range of ucc peoples
	 * @param end the upper bound of the range of ucc peoples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ucc peoples
	 */
	@Override
	public List<UccPeople> findByOldUccPeopleId(int oldUccPeopleId, int start,
		int end, OrderByComparator<UccPeople> orderByComparator) {
		return findByOldUccPeopleId(oldUccPeopleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ucc peoples where oldUccPeopleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param oldUccPeopleId the old ucc people ID
	 * @param start the lower bound of the range of ucc peoples
	 * @param end the upper bound of the range of ucc peoples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ucc peoples
	 */
	@Override
	public List<UccPeople> findByOldUccPeopleId(int oldUccPeopleId, int start,
		int end, OrderByComparator<UccPeople> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OLDUCCPEOPLEID;
			finderArgs = new Object[] { oldUccPeopleId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OLDUCCPEOPLEID;
			finderArgs = new Object[] {
					oldUccPeopleId,
					
					start, end, orderByComparator
				};
		}

		List<UccPeople> list = null;

		if (retrieveFromCache) {
			list = (List<UccPeople>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UccPeople uccPeople : list) {
					if ((oldUccPeopleId != uccPeople.getOldUccPeopleId())) {
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

			query.append(_SQL_SELECT_UCCPEOPLE_WHERE);

			query.append(_FINDER_COLUMN_OLDUCCPEOPLEID_OLDUCCPEOPLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UccPeopleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(oldUccPeopleId);

				if (!pagination) {
					list = (List<UccPeople>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UccPeople>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ucc people in the ordered set where oldUccPeopleId = &#63;.
	 *
	 * @param oldUccPeopleId the old ucc people ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ucc people
	 * @throws NoSuchUccPeopleException if a matching ucc people could not be found
	 */
	@Override
	public UccPeople findByOldUccPeopleId_First(int oldUccPeopleId,
		OrderByComparator<UccPeople> orderByComparator)
		throws NoSuchUccPeopleException {
		UccPeople uccPeople = fetchByOldUccPeopleId_First(oldUccPeopleId,
				orderByComparator);

		if (uccPeople != null) {
			return uccPeople;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("oldUccPeopleId=");
		msg.append(oldUccPeopleId);

		msg.append("}");

		throw new NoSuchUccPeopleException(msg.toString());
	}

	/**
	 * Returns the first ucc people in the ordered set where oldUccPeopleId = &#63;.
	 *
	 * @param oldUccPeopleId the old ucc people ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ucc people, or <code>null</code> if a matching ucc people could not be found
	 */
	@Override
	public UccPeople fetchByOldUccPeopleId_First(int oldUccPeopleId,
		OrderByComparator<UccPeople> orderByComparator) {
		List<UccPeople> list = findByOldUccPeopleId(oldUccPeopleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ucc people in the ordered set where oldUccPeopleId = &#63;.
	 *
	 * @param oldUccPeopleId the old ucc people ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ucc people
	 * @throws NoSuchUccPeopleException if a matching ucc people could not be found
	 */
	@Override
	public UccPeople findByOldUccPeopleId_Last(int oldUccPeopleId,
		OrderByComparator<UccPeople> orderByComparator)
		throws NoSuchUccPeopleException {
		UccPeople uccPeople = fetchByOldUccPeopleId_Last(oldUccPeopleId,
				orderByComparator);

		if (uccPeople != null) {
			return uccPeople;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("oldUccPeopleId=");
		msg.append(oldUccPeopleId);

		msg.append("}");

		throw new NoSuchUccPeopleException(msg.toString());
	}

	/**
	 * Returns the last ucc people in the ordered set where oldUccPeopleId = &#63;.
	 *
	 * @param oldUccPeopleId the old ucc people ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ucc people, or <code>null</code> if a matching ucc people could not be found
	 */
	@Override
	public UccPeople fetchByOldUccPeopleId_Last(int oldUccPeopleId,
		OrderByComparator<UccPeople> orderByComparator) {
		int count = countByOldUccPeopleId(oldUccPeopleId);

		if (count == 0) {
			return null;
		}

		List<UccPeople> list = findByOldUccPeopleId(oldUccPeopleId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ucc peoples before and after the current ucc people in the ordered set where oldUccPeopleId = &#63;.
	 *
	 * @param uccPeopleId the primary key of the current ucc people
	 * @param oldUccPeopleId the old ucc people ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ucc people
	 * @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	 */
	@Override
	public UccPeople[] findByOldUccPeopleId_PrevAndNext(int uccPeopleId,
		int oldUccPeopleId, OrderByComparator<UccPeople> orderByComparator)
		throws NoSuchUccPeopleException {
		UccPeople uccPeople = findByPrimaryKey(uccPeopleId);

		Session session = null;

		try {
			session = openSession();

			UccPeople[] array = new UccPeopleImpl[3];

			array[0] = getByOldUccPeopleId_PrevAndNext(session, uccPeople,
					oldUccPeopleId, orderByComparator, true);

			array[1] = uccPeople;

			array[2] = getByOldUccPeopleId_PrevAndNext(session, uccPeople,
					oldUccPeopleId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UccPeople getByOldUccPeopleId_PrevAndNext(Session session,
		UccPeople uccPeople, int oldUccPeopleId,
		OrderByComparator<UccPeople> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_UCCPEOPLE_WHERE);

		query.append(_FINDER_COLUMN_OLDUCCPEOPLEID_OLDUCCPEOPLEID_2);

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
			query.append(UccPeopleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(oldUccPeopleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(uccPeople);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UccPeople> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ucc peoples where oldUccPeopleId = &#63; from the database.
	 *
	 * @param oldUccPeopleId the old ucc people ID
	 */
	@Override
	public void removeByOldUccPeopleId(int oldUccPeopleId) {
		for (UccPeople uccPeople : findByOldUccPeopleId(oldUccPeopleId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(uccPeople);
		}
	}

	/**
	 * Returns the number of ucc peoples where oldUccPeopleId = &#63;.
	 *
	 * @param oldUccPeopleId the old ucc people ID
	 * @return the number of matching ucc peoples
	 */
	@Override
	public int countByOldUccPeopleId(int oldUccPeopleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OLDUCCPEOPLEID;

		Object[] finderArgs = new Object[] { oldUccPeopleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_UCCPEOPLE_WHERE);

			query.append(_FINDER_COLUMN_OLDUCCPEOPLEID_OLDUCCPEOPLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(oldUccPeopleId);

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

	private static final String _FINDER_COLUMN_OLDUCCPEOPLEID_OLDUCCPEOPLEID_2 = "uccPeople.oldUccPeopleId = ?";

	public UccPeoplePersistenceImpl() {
		setModelClass(UccPeople.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uccPeopleId", "peopleId");
			dbColumnNames.put("firstName", "first");
			dbColumnNames.put("middleName", "middle");
			dbColumnNames.put("lastName", "last");
			dbColumnNames.put("birthday", "dateOfBirth");
			dbColumnNames.put("myActive", "active");
			dbColumnNames.put("oldUccPeopleId", "old_peopleId");
			dbColumnNames.put("emailAddress", "email");
			dbColumnNames.put("cellPhone", "cell_phone");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the ucc people in the entity cache if it is enabled.
	 *
	 * @param uccPeople the ucc people
	 */
	@Override
	public void cacheResult(UccPeople uccPeople) {
		entityCache.putResult(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleImpl.class, uccPeople.getPrimaryKey(), uccPeople);

		uccPeople.resetOriginalValues();
	}

	/**
	 * Caches the ucc peoples in the entity cache if it is enabled.
	 *
	 * @param uccPeoples the ucc peoples
	 */
	@Override
	public void cacheResult(List<UccPeople> uccPeoples) {
		for (UccPeople uccPeople : uccPeoples) {
			if (entityCache.getResult(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
						UccPeopleImpl.class, uccPeople.getPrimaryKey()) == null) {
				cacheResult(uccPeople);
			}
			else {
				uccPeople.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ucc peoples.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UccPeopleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ucc people.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UccPeople uccPeople) {
		entityCache.removeResult(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleImpl.class, uccPeople.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UccPeople> uccPeoples) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UccPeople uccPeople : uccPeoples) {
			entityCache.removeResult(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
				UccPeopleImpl.class, uccPeople.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ucc people with the primary key. Does not add the ucc people to the database.
	 *
	 * @param uccPeopleId the primary key for the new ucc people
	 * @return the new ucc people
	 */
	@Override
	public UccPeople create(int uccPeopleId) {
		UccPeople uccPeople = new UccPeopleImpl();

		uccPeople.setNew(true);
		uccPeople.setPrimaryKey(uccPeopleId);

		return uccPeople;
	}

	/**
	 * Removes the ucc people with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param uccPeopleId the primary key of the ucc people
	 * @return the ucc people that was removed
	 * @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	 */
	@Override
	public UccPeople remove(int uccPeopleId) throws NoSuchUccPeopleException {
		return remove((Serializable)uccPeopleId);
	}

	/**
	 * Removes the ucc people with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ucc people
	 * @return the ucc people that was removed
	 * @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	 */
	@Override
	public UccPeople remove(Serializable primaryKey)
		throws NoSuchUccPeopleException {
		Session session = null;

		try {
			session = openSession();

			UccPeople uccPeople = (UccPeople)session.get(UccPeopleImpl.class,
					primaryKey);

			if (uccPeople == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUccPeopleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(uccPeople);
		}
		catch (NoSuchUccPeopleException nsee) {
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
	protected UccPeople removeImpl(UccPeople uccPeople) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(uccPeople)) {
				uccPeople = (UccPeople)session.get(UccPeopleImpl.class,
						uccPeople.getPrimaryKeyObj());
			}

			if (uccPeople != null) {
				session.delete(uccPeople);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (uccPeople != null) {
			clearCache(uccPeople);
		}

		return uccPeople;
	}

	@Override
	public UccPeople updateImpl(UccPeople uccPeople) {
		boolean isNew = uccPeople.isNew();

		if (!(uccPeople instanceof UccPeopleModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(uccPeople.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(uccPeople);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in uccPeople proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom UccPeople implementation " +
				uccPeople.getClass());
		}

		UccPeopleModelImpl uccPeopleModelImpl = (UccPeopleModelImpl)uccPeople;

		Session session = null;

		try {
			session = openSession();

			if (uccPeople.isNew()) {
				session.save(uccPeople);

				uccPeople.setNew(false);
			}
			else {
				uccPeople = (UccPeople)session.merge(uccPeople);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!UccPeopleModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { uccPeopleModelImpl.isMyActive() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
				args);

			args = new Object[] { uccPeopleModelImpl.getOldUccPeopleId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_OLDUCCPEOPLEID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OLDUCCPEOPLEID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((uccPeopleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						uccPeopleModelImpl.getOriginalMyActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
					args);

				args = new Object[] { uccPeopleModelImpl.isMyActive() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
					args);
			}

			if ((uccPeopleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OLDUCCPEOPLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						uccPeopleModelImpl.getOriginalOldUccPeopleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OLDUCCPEOPLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OLDUCCPEOPLEID,
					args);

				args = new Object[] { uccPeopleModelImpl.getOldUccPeopleId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OLDUCCPEOPLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OLDUCCPEOPLEID,
					args);
			}
		}

		entityCache.putResult(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleImpl.class, uccPeople.getPrimaryKey(), uccPeople, false);

		uccPeople.resetOriginalValues();

		return uccPeople;
	}

	/**
	 * Returns the ucc people with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ucc people
	 * @return the ucc people
	 * @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	 */
	@Override
	public UccPeople findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUccPeopleException {
		UccPeople uccPeople = fetchByPrimaryKey(primaryKey);

		if (uccPeople == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUccPeopleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return uccPeople;
	}

	/**
	 * Returns the ucc people with the primary key or throws a {@link NoSuchUccPeopleException} if it could not be found.
	 *
	 * @param uccPeopleId the primary key of the ucc people
	 * @return the ucc people
	 * @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	 */
	@Override
	public UccPeople findByPrimaryKey(int uccPeopleId)
		throws NoSuchUccPeopleException {
		return findByPrimaryKey((Serializable)uccPeopleId);
	}

	/**
	 * Returns the ucc people with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ucc people
	 * @return the ucc people, or <code>null</code> if a ucc people with the primary key could not be found
	 */
	@Override
	public UccPeople fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
				UccPeopleImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		UccPeople uccPeople = (UccPeople)serializable;

		if (uccPeople == null) {
			Session session = null;

			try {
				session = openSession();

				uccPeople = (UccPeople)session.get(UccPeopleImpl.class,
						primaryKey);

				if (uccPeople != null) {
					cacheResult(uccPeople);
				}
				else {
					entityCache.putResult(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
						UccPeopleImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
					UccPeopleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return uccPeople;
	}

	/**
	 * Returns the ucc people with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param uccPeopleId the primary key of the ucc people
	 * @return the ucc people, or <code>null</code> if a ucc people with the primary key could not be found
	 */
	@Override
	public UccPeople fetchByPrimaryKey(int uccPeopleId) {
		return fetchByPrimaryKey((Serializable)uccPeopleId);
	}

	@Override
	public Map<Serializable, UccPeople> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, UccPeople> map = new HashMap<Serializable, UccPeople>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			UccPeople uccPeople = fetchByPrimaryKey(primaryKey);

			if (uccPeople != null) {
				map.put(primaryKey, uccPeople);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
					UccPeopleImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (UccPeople)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_UCCPEOPLE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((int)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (UccPeople uccPeople : (List<UccPeople>)q.list()) {
				map.put(uccPeople.getPrimaryKeyObj(), uccPeople);

				cacheResult(uccPeople);

				uncachedPrimaryKeys.remove(uccPeople.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(UccPeopleModelImpl.ENTITY_CACHE_ENABLED,
					UccPeopleImpl.class, primaryKey, nullModel);
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
	 * Returns all the ucc peoples.
	 *
	 * @return the ucc peoples
	 */
	@Override
	public List<UccPeople> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ucc peoples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc peoples
	 * @param end the upper bound of the range of ucc peoples (not inclusive)
	 * @return the range of ucc peoples
	 */
	@Override
	public List<UccPeople> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ucc peoples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc peoples
	 * @param end the upper bound of the range of ucc peoples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ucc peoples
	 */
	@Override
	public List<UccPeople> findAll(int start, int end,
		OrderByComparator<UccPeople> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ucc peoples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc peoples
	 * @param end the upper bound of the range of ucc peoples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ucc peoples
	 */
	@Override
	public List<UccPeople> findAll(int start, int end,
		OrderByComparator<UccPeople> orderByComparator,
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

		List<UccPeople> list = null;

		if (retrieveFromCache) {
			list = (List<UccPeople>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_UCCPEOPLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_UCCPEOPLE;

				if (pagination) {
					sql = sql.concat(UccPeopleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UccPeople>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UccPeople>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ucc peoples from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UccPeople uccPeople : findAll()) {
			remove(uccPeople);
		}
	}

	/**
	 * Returns the number of ucc peoples.
	 *
	 * @return the number of ucc peoples
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_UCCPEOPLE);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return UccPeopleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ucc people persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(UccPeopleImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_UCCPEOPLE = "SELECT uccPeople FROM UccPeople uccPeople";
	private static final String _SQL_SELECT_UCCPEOPLE_WHERE_PKS_IN = "SELECT uccPeople FROM UccPeople uccPeople WHERE peopleId IN (";
	private static final String _SQL_SELECT_UCCPEOPLE_WHERE = "SELECT uccPeople FROM UccPeople uccPeople WHERE ";
	private static final String _SQL_COUNT_UCCPEOPLE = "SELECT COUNT(uccPeople) FROM UccPeople uccPeople";
	private static final String _SQL_COUNT_UCCPEOPLE_WHERE = "SELECT COUNT(uccPeople) FROM UccPeople uccPeople WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "uccPeople.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UccPeople exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UccPeople exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(UccPeoplePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uccPeopleId", "firstName", "middleName", "lastName", "birthday",
				"myActive", "oldUccPeopleId", "emailAddress", "cellPhone"
			});
}