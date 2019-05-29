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

import ucc.portal.exception.NoSuchUccPeopleAddressException;

import ucc.portal.model.UccPeopleAddress;
import ucc.portal.model.impl.UccPeopleAddressImpl;
import ucc.portal.model.impl.UccPeopleAddressModelImpl;

import ucc.portal.service.persistence.UccPeopleAddressPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the ucc people address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccPeopleAddressPersistence
 * @see ucc.portal.service.persistence.UccPeopleAddressUtil
 * @generated
 */
@ProviderType
public class UccPeopleAddressPersistenceImpl extends BasePersistenceImpl<UccPeopleAddress>
	implements UccPeopleAddressPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UccPeopleAddressUtil} to access the ucc people address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UccPeopleAddressImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleAddressModelImpl.FINDER_CACHE_ENABLED,
			UccPeopleAddressImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleAddressModelImpl.FINDER_CACHE_ENABLED,
			UccPeopleAddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleAddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_T_A = new FinderPath(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleAddressModelImpl.FINDER_CACHE_ENABLED,
			UccPeopleAddressImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByP_T_A",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_T_A = new FinderPath(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleAddressModelImpl.FINDER_CACHE_ENABLED,
			UccPeopleAddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_T_A",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			UccPeopleAddressModelImpl.UCCPEOPLEID_COLUMN_BITMASK |
			UccPeopleAddressModelImpl.TYPE_COLUMN_BITMASK |
			UccPeopleAddressModelImpl.MYACTIVE_COLUMN_BITMASK |
			UccPeopleAddressModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_T_A = new FinderPath(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleAddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_T_A",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the ucc people addresses where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param type the type
	 * @param myActive the my active
	 * @return the matching ucc people addresses
	 */
	@Override
	public List<UccPeopleAddress> findByP_T_A(int uccPeopleId, String type,
		boolean myActive) {
		return findByP_T_A(uccPeopleId, type, myActive, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ucc people addresses where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param type the type
	 * @param myActive the my active
	 * @param start the lower bound of the range of ucc people addresses
	 * @param end the upper bound of the range of ucc people addresses (not inclusive)
	 * @return the range of matching ucc people addresses
	 */
	@Override
	public List<UccPeopleAddress> findByP_T_A(int uccPeopleId, String type,
		boolean myActive, int start, int end) {
		return findByP_T_A(uccPeopleId, type, myActive, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ucc people addresses where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param type the type
	 * @param myActive the my active
	 * @param start the lower bound of the range of ucc people addresses
	 * @param end the upper bound of the range of ucc people addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ucc people addresses
	 */
	@Override
	public List<UccPeopleAddress> findByP_T_A(int uccPeopleId, String type,
		boolean myActive, int start, int end,
		OrderByComparator<UccPeopleAddress> orderByComparator) {
		return findByP_T_A(uccPeopleId, type, myActive, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ucc people addresses where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param type the type
	 * @param myActive the my active
	 * @param start the lower bound of the range of ucc people addresses
	 * @param end the upper bound of the range of ucc people addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ucc people addresses
	 */
	@Override
	public List<UccPeopleAddress> findByP_T_A(int uccPeopleId, String type,
		boolean myActive, int start, int end,
		OrderByComparator<UccPeopleAddress> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_T_A;
			finderArgs = new Object[] { uccPeopleId, type, myActive };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_T_A;
			finderArgs = new Object[] {
					uccPeopleId, type, myActive,
					
					start, end, orderByComparator
				};
		}

		List<UccPeopleAddress> list = null;

		if (retrieveFromCache) {
			list = (List<UccPeopleAddress>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UccPeopleAddress uccPeopleAddress : list) {
					if ((uccPeopleId != uccPeopleAddress.getUccPeopleId()) ||
							!Objects.equals(type, uccPeopleAddress.getType()) ||
							(myActive != uccPeopleAddress.isMyActive())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_UCCPEOPLEADDRESS_WHERE);

			query.append(_FINDER_COLUMN_P_T_A_UCCPEOPLEID_2);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_P_T_A_TYPE_1);
			}
			else if (type.equals("")) {
				query.append(_FINDER_COLUMN_P_T_A_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_P_T_A_TYPE_2);
			}

			query.append(_FINDER_COLUMN_P_T_A_MYACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UccPeopleAddressModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(uccPeopleId);

				if (bindType) {
					qPos.add(type);
				}

				qPos.add(myActive);

				if (!pagination) {
					list = (List<UccPeopleAddress>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UccPeopleAddress>)QueryUtil.list(q,
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
	 * Returns the first ucc people address in the ordered set where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param type the type
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ucc people address
	 * @throws NoSuchUccPeopleAddressException if a matching ucc people address could not be found
	 */
	@Override
	public UccPeopleAddress findByP_T_A_First(int uccPeopleId, String type,
		boolean myActive, OrderByComparator<UccPeopleAddress> orderByComparator)
		throws NoSuchUccPeopleAddressException {
		UccPeopleAddress uccPeopleAddress = fetchByP_T_A_First(uccPeopleId,
				type, myActive, orderByComparator);

		if (uccPeopleAddress != null) {
			return uccPeopleAddress;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uccPeopleId=");
		msg.append(uccPeopleId);

		msg.append(", type=");
		msg.append(type);

		msg.append(", myActive=");
		msg.append(myActive);

		msg.append("}");

		throw new NoSuchUccPeopleAddressException(msg.toString());
	}

	/**
	 * Returns the first ucc people address in the ordered set where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param type the type
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ucc people address, or <code>null</code> if a matching ucc people address could not be found
	 */
	@Override
	public UccPeopleAddress fetchByP_T_A_First(int uccPeopleId, String type,
		boolean myActive, OrderByComparator<UccPeopleAddress> orderByComparator) {
		List<UccPeopleAddress> list = findByP_T_A(uccPeopleId, type, myActive,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ucc people address in the ordered set where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param type the type
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ucc people address
	 * @throws NoSuchUccPeopleAddressException if a matching ucc people address could not be found
	 */
	@Override
	public UccPeopleAddress findByP_T_A_Last(int uccPeopleId, String type,
		boolean myActive, OrderByComparator<UccPeopleAddress> orderByComparator)
		throws NoSuchUccPeopleAddressException {
		UccPeopleAddress uccPeopleAddress = fetchByP_T_A_Last(uccPeopleId,
				type, myActive, orderByComparator);

		if (uccPeopleAddress != null) {
			return uccPeopleAddress;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uccPeopleId=");
		msg.append(uccPeopleId);

		msg.append(", type=");
		msg.append(type);

		msg.append(", myActive=");
		msg.append(myActive);

		msg.append("}");

		throw new NoSuchUccPeopleAddressException(msg.toString());
	}

	/**
	 * Returns the last ucc people address in the ordered set where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param type the type
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ucc people address, or <code>null</code> if a matching ucc people address could not be found
	 */
	@Override
	public UccPeopleAddress fetchByP_T_A_Last(int uccPeopleId, String type,
		boolean myActive, OrderByComparator<UccPeopleAddress> orderByComparator) {
		int count = countByP_T_A(uccPeopleId, type, myActive);

		if (count == 0) {
			return null;
		}

		List<UccPeopleAddress> list = findByP_T_A(uccPeopleId, type, myActive,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ucc people addresses before and after the current ucc people address in the ordered set where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	 *
	 * @param uccPeopleAddressId the primary key of the current ucc people address
	 * @param uccPeopleId the ucc people ID
	 * @param type the type
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ucc people address
	 * @throws NoSuchUccPeopleAddressException if a ucc people address with the primary key could not be found
	 */
	@Override
	public UccPeopleAddress[] findByP_T_A_PrevAndNext(int uccPeopleAddressId,
		int uccPeopleId, String type, boolean myActive,
		OrderByComparator<UccPeopleAddress> orderByComparator)
		throws NoSuchUccPeopleAddressException {
		UccPeopleAddress uccPeopleAddress = findByPrimaryKey(uccPeopleAddressId);

		Session session = null;

		try {
			session = openSession();

			UccPeopleAddress[] array = new UccPeopleAddressImpl[3];

			array[0] = getByP_T_A_PrevAndNext(session, uccPeopleAddress,
					uccPeopleId, type, myActive, orderByComparator, true);

			array[1] = uccPeopleAddress;

			array[2] = getByP_T_A_PrevAndNext(session, uccPeopleAddress,
					uccPeopleId, type, myActive, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UccPeopleAddress getByP_T_A_PrevAndNext(Session session,
		UccPeopleAddress uccPeopleAddress, int uccPeopleId, String type,
		boolean myActive,
		OrderByComparator<UccPeopleAddress> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_UCCPEOPLEADDRESS_WHERE);

		query.append(_FINDER_COLUMN_P_T_A_UCCPEOPLEID_2);

		boolean bindType = false;

		if (type == null) {
			query.append(_FINDER_COLUMN_P_T_A_TYPE_1);
		}
		else if (type.equals("")) {
			query.append(_FINDER_COLUMN_P_T_A_TYPE_3);
		}
		else {
			bindType = true;

			query.append(_FINDER_COLUMN_P_T_A_TYPE_2);
		}

		query.append(_FINDER_COLUMN_P_T_A_MYACTIVE_2);

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
			query.append(UccPeopleAddressModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(uccPeopleId);

		if (bindType) {
			qPos.add(type);
		}

		qPos.add(myActive);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(uccPeopleAddress);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UccPeopleAddress> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ucc people addresses where uccPeopleId = &#63; and type = &#63; and myActive = &#63; from the database.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param type the type
	 * @param myActive the my active
	 */
	@Override
	public void removeByP_T_A(int uccPeopleId, String type, boolean myActive) {
		for (UccPeopleAddress uccPeopleAddress : findByP_T_A(uccPeopleId, type,
				myActive, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(uccPeopleAddress);
		}
	}

	/**
	 * Returns the number of ucc people addresses where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	 *
	 * @param uccPeopleId the ucc people ID
	 * @param type the type
	 * @param myActive the my active
	 * @return the number of matching ucc people addresses
	 */
	@Override
	public int countByP_T_A(int uccPeopleId, String type, boolean myActive) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_T_A;

		Object[] finderArgs = new Object[] { uccPeopleId, type, myActive };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_UCCPEOPLEADDRESS_WHERE);

			query.append(_FINDER_COLUMN_P_T_A_UCCPEOPLEID_2);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_P_T_A_TYPE_1);
			}
			else if (type.equals("")) {
				query.append(_FINDER_COLUMN_P_T_A_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_P_T_A_TYPE_2);
			}

			query.append(_FINDER_COLUMN_P_T_A_MYACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(uccPeopleId);

				if (bindType) {
					qPos.add(type);
				}

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

	private static final String _FINDER_COLUMN_P_T_A_UCCPEOPLEID_2 = "uccPeopleAddress.uccPeopleId = ? AND ";
	private static final String _FINDER_COLUMN_P_T_A_TYPE_1 = "uccPeopleAddress.type IS NULL AND ";
	private static final String _FINDER_COLUMN_P_T_A_TYPE_2 = "uccPeopleAddress.type = ? AND ";
	private static final String _FINDER_COLUMN_P_T_A_TYPE_3 = "(uccPeopleAddress.type IS NULL OR uccPeopleAddress.type = '') AND ";
	private static final String _FINDER_COLUMN_P_T_A_MYACTIVE_2 = "uccPeopleAddress.myActive = ?";

	public UccPeopleAddressPersistenceImpl() {
		setModelClass(UccPeopleAddress.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uccPeopleAddressId", "addressEntryId");
			dbColumnNames.put("uccPeopleId", "peopleId");
			dbColumnNames.put("street1", "address1");
			dbColumnNames.put("street2", "address2");
			dbColumnNames.put("region", "state");
			dbColumnNames.put("zip", "zipCode");
			dbColumnNames.put("zipPlus", "zip4");
			dbColumnNames.put("type", "addressType");
			dbColumnNames.put("myActive", "active");
			dbColumnNames.put("inactiveDate", "inactive_date");
			dbColumnNames.put("modifiedBy", "modified_by");
			dbColumnNames.put("modifiedDate", "modified_date");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the ucc people address in the entity cache if it is enabled.
	 *
	 * @param uccPeopleAddress the ucc people address
	 */
	@Override
	public void cacheResult(UccPeopleAddress uccPeopleAddress) {
		entityCache.putResult(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleAddressImpl.class, uccPeopleAddress.getPrimaryKey(),
			uccPeopleAddress);

		uccPeopleAddress.resetOriginalValues();
	}

	/**
	 * Caches the ucc people addresses in the entity cache if it is enabled.
	 *
	 * @param uccPeopleAddresses the ucc people addresses
	 */
	@Override
	public void cacheResult(List<UccPeopleAddress> uccPeopleAddresses) {
		for (UccPeopleAddress uccPeopleAddress : uccPeopleAddresses) {
			if (entityCache.getResult(
						UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
						UccPeopleAddressImpl.class,
						uccPeopleAddress.getPrimaryKey()) == null) {
				cacheResult(uccPeopleAddress);
			}
			else {
				uccPeopleAddress.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ucc people addresses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UccPeopleAddressImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ucc people address.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UccPeopleAddress uccPeopleAddress) {
		entityCache.removeResult(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleAddressImpl.class, uccPeopleAddress.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UccPeopleAddress> uccPeopleAddresses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UccPeopleAddress uccPeopleAddress : uccPeopleAddresses) {
			entityCache.removeResult(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
				UccPeopleAddressImpl.class, uccPeopleAddress.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ucc people address with the primary key. Does not add the ucc people address to the database.
	 *
	 * @param uccPeopleAddressId the primary key for the new ucc people address
	 * @return the new ucc people address
	 */
	@Override
	public UccPeopleAddress create(int uccPeopleAddressId) {
		UccPeopleAddress uccPeopleAddress = new UccPeopleAddressImpl();

		uccPeopleAddress.setNew(true);
		uccPeopleAddress.setPrimaryKey(uccPeopleAddressId);

		return uccPeopleAddress;
	}

	/**
	 * Removes the ucc people address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param uccPeopleAddressId the primary key of the ucc people address
	 * @return the ucc people address that was removed
	 * @throws NoSuchUccPeopleAddressException if a ucc people address with the primary key could not be found
	 */
	@Override
	public UccPeopleAddress remove(int uccPeopleAddressId)
		throws NoSuchUccPeopleAddressException {
		return remove((Serializable)uccPeopleAddressId);
	}

	/**
	 * Removes the ucc people address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ucc people address
	 * @return the ucc people address that was removed
	 * @throws NoSuchUccPeopleAddressException if a ucc people address with the primary key could not be found
	 */
	@Override
	public UccPeopleAddress remove(Serializable primaryKey)
		throws NoSuchUccPeopleAddressException {
		Session session = null;

		try {
			session = openSession();

			UccPeopleAddress uccPeopleAddress = (UccPeopleAddress)session.get(UccPeopleAddressImpl.class,
					primaryKey);

			if (uccPeopleAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUccPeopleAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(uccPeopleAddress);
		}
		catch (NoSuchUccPeopleAddressException nsee) {
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
	protected UccPeopleAddress removeImpl(UccPeopleAddress uccPeopleAddress) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(uccPeopleAddress)) {
				uccPeopleAddress = (UccPeopleAddress)session.get(UccPeopleAddressImpl.class,
						uccPeopleAddress.getPrimaryKeyObj());
			}

			if (uccPeopleAddress != null) {
				session.delete(uccPeopleAddress);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (uccPeopleAddress != null) {
			clearCache(uccPeopleAddress);
		}

		return uccPeopleAddress;
	}

	@Override
	public UccPeopleAddress updateImpl(UccPeopleAddress uccPeopleAddress) {
		boolean isNew = uccPeopleAddress.isNew();

		if (!(uccPeopleAddress instanceof UccPeopleAddressModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(uccPeopleAddress.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(uccPeopleAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in uccPeopleAddress proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom UccPeopleAddress implementation " +
				uccPeopleAddress.getClass());
		}

		UccPeopleAddressModelImpl uccPeopleAddressModelImpl = (UccPeopleAddressModelImpl)uccPeopleAddress;

		Session session = null;

		try {
			session = openSession();

			if (uccPeopleAddress.isNew()) {
				session.save(uccPeopleAddress);

				uccPeopleAddress.setNew(false);
			}
			else {
				uccPeopleAddress = (UccPeopleAddress)session.merge(uccPeopleAddress);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!UccPeopleAddressModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					uccPeopleAddressModelImpl.getUccPeopleId(),
					uccPeopleAddressModelImpl.getType(),
					uccPeopleAddressModelImpl.isMyActive()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_P_T_A, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_T_A,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((uccPeopleAddressModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_T_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						uccPeopleAddressModelImpl.getOriginalUccPeopleId(),
						uccPeopleAddressModelImpl.getOriginalType(),
						uccPeopleAddressModelImpl.getOriginalMyActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_T_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_T_A,
					args);

				args = new Object[] {
						uccPeopleAddressModelImpl.getUccPeopleId(),
						uccPeopleAddressModelImpl.getType(),
						uccPeopleAddressModelImpl.isMyActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_T_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_T_A,
					args);
			}
		}

		entityCache.putResult(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
			UccPeopleAddressImpl.class, uccPeopleAddress.getPrimaryKey(),
			uccPeopleAddress, false);

		uccPeopleAddress.resetOriginalValues();

		return uccPeopleAddress;
	}

	/**
	 * Returns the ucc people address with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ucc people address
	 * @return the ucc people address
	 * @throws NoSuchUccPeopleAddressException if a ucc people address with the primary key could not be found
	 */
	@Override
	public UccPeopleAddress findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUccPeopleAddressException {
		UccPeopleAddress uccPeopleAddress = fetchByPrimaryKey(primaryKey);

		if (uccPeopleAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUccPeopleAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return uccPeopleAddress;
	}

	/**
	 * Returns the ucc people address with the primary key or throws a {@link NoSuchUccPeopleAddressException} if it could not be found.
	 *
	 * @param uccPeopleAddressId the primary key of the ucc people address
	 * @return the ucc people address
	 * @throws NoSuchUccPeopleAddressException if a ucc people address with the primary key could not be found
	 */
	@Override
	public UccPeopleAddress findByPrimaryKey(int uccPeopleAddressId)
		throws NoSuchUccPeopleAddressException {
		return findByPrimaryKey((Serializable)uccPeopleAddressId);
	}

	/**
	 * Returns the ucc people address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ucc people address
	 * @return the ucc people address, or <code>null</code> if a ucc people address with the primary key could not be found
	 */
	@Override
	public UccPeopleAddress fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
				UccPeopleAddressImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		UccPeopleAddress uccPeopleAddress = (UccPeopleAddress)serializable;

		if (uccPeopleAddress == null) {
			Session session = null;

			try {
				session = openSession();

				uccPeopleAddress = (UccPeopleAddress)session.get(UccPeopleAddressImpl.class,
						primaryKey);

				if (uccPeopleAddress != null) {
					cacheResult(uccPeopleAddress);
				}
				else {
					entityCache.putResult(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
						UccPeopleAddressImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
					UccPeopleAddressImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return uccPeopleAddress;
	}

	/**
	 * Returns the ucc people address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param uccPeopleAddressId the primary key of the ucc people address
	 * @return the ucc people address, or <code>null</code> if a ucc people address with the primary key could not be found
	 */
	@Override
	public UccPeopleAddress fetchByPrimaryKey(int uccPeopleAddressId) {
		return fetchByPrimaryKey((Serializable)uccPeopleAddressId);
	}

	@Override
	public Map<Serializable, UccPeopleAddress> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, UccPeopleAddress> map = new HashMap<Serializable, UccPeopleAddress>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			UccPeopleAddress uccPeopleAddress = fetchByPrimaryKey(primaryKey);

			if (uccPeopleAddress != null) {
				map.put(primaryKey, uccPeopleAddress);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
					UccPeopleAddressImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (UccPeopleAddress)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_UCCPEOPLEADDRESS_WHERE_PKS_IN);

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

			for (UccPeopleAddress uccPeopleAddress : (List<UccPeopleAddress>)q.list()) {
				map.put(uccPeopleAddress.getPrimaryKeyObj(), uccPeopleAddress);

				cacheResult(uccPeopleAddress);

				uncachedPrimaryKeys.remove(uccPeopleAddress.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(UccPeopleAddressModelImpl.ENTITY_CACHE_ENABLED,
					UccPeopleAddressImpl.class, primaryKey, nullModel);
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
	 * Returns all the ucc people addresses.
	 *
	 * @return the ucc people addresses
	 */
	@Override
	public List<UccPeopleAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ucc people addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc people addresses
	 * @param end the upper bound of the range of ucc people addresses (not inclusive)
	 * @return the range of ucc people addresses
	 */
	@Override
	public List<UccPeopleAddress> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ucc people addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc people addresses
	 * @param end the upper bound of the range of ucc people addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ucc people addresses
	 */
	@Override
	public List<UccPeopleAddress> findAll(int start, int end,
		OrderByComparator<UccPeopleAddress> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ucc people addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc people addresses
	 * @param end the upper bound of the range of ucc people addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ucc people addresses
	 */
	@Override
	public List<UccPeopleAddress> findAll(int start, int end,
		OrderByComparator<UccPeopleAddress> orderByComparator,
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

		List<UccPeopleAddress> list = null;

		if (retrieveFromCache) {
			list = (List<UccPeopleAddress>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_UCCPEOPLEADDRESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_UCCPEOPLEADDRESS;

				if (pagination) {
					sql = sql.concat(UccPeopleAddressModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UccPeopleAddress>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UccPeopleAddress>)QueryUtil.list(q,
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
	 * Removes all the ucc people addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UccPeopleAddress uccPeopleAddress : findAll()) {
			remove(uccPeopleAddress);
		}
	}

	/**
	 * Returns the number of ucc people addresses.
	 *
	 * @return the number of ucc people addresses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_UCCPEOPLEADDRESS);

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
		return UccPeopleAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ucc people address persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(UccPeopleAddressImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_UCCPEOPLEADDRESS = "SELECT uccPeopleAddress FROM UccPeopleAddress uccPeopleAddress";
	private static final String _SQL_SELECT_UCCPEOPLEADDRESS_WHERE_PKS_IN = "SELECT uccPeopleAddress FROM UccPeopleAddress uccPeopleAddress WHERE addressEntryId IN (";
	private static final String _SQL_SELECT_UCCPEOPLEADDRESS_WHERE = "SELECT uccPeopleAddress FROM UccPeopleAddress uccPeopleAddress WHERE ";
	private static final String _SQL_COUNT_UCCPEOPLEADDRESS = "SELECT COUNT(uccPeopleAddress) FROM UccPeopleAddress uccPeopleAddress";
	private static final String _SQL_COUNT_UCCPEOPLEADDRESS_WHERE = "SELECT COUNT(uccPeopleAddress) FROM UccPeopleAddress uccPeopleAddress WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "uccPeopleAddress.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UccPeopleAddress exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UccPeopleAddress exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(UccPeopleAddressPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uccPeopleAddressId", "uccPeopleId", "street1", "street2",
				"region", "zip", "zipPlus", "type", "myActive", "inactiveDate",
				"modifiedBy", "modifiedDate"
			});
}