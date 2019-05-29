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

import ucc.portal.exception.NoSuchUccAssociationException;

import ucc.portal.model.UccAssociation;
import ucc.portal.model.impl.UccAssociationImpl;
import ucc.portal.model.impl.UccAssociationModelImpl;

import ucc.portal.service.persistence.UccAssociationPersistence;

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
 * The persistence implementation for the ucc association service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccAssociationPersistence
 * @see ucc.portal.service.persistence.UccAssociationUtil
 * @generated
 */
@ProviderType
public class UccAssociationPersistenceImpl extends BasePersistenceImpl<UccAssociation>
	implements UccAssociationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UccAssociationUtil} to access the ucc association persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UccAssociationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
			UccAssociationModelImpl.FINDER_CACHE_ENABLED,
			UccAssociationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
			UccAssociationModelImpl.FINDER_CACHE_ENABLED,
			UccAssociationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
			UccAssociationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONFERENCEID =
		new FinderPath(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
			UccAssociationModelImpl.FINDER_CACHE_ENABLED,
			UccAssociationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByConferenceId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFERENCEID =
		new FinderPath(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
			UccAssociationModelImpl.FINDER_CACHE_ENABLED,
			UccAssociationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByConferenceId",
			new String[] { Integer.class.getName() },
			UccAssociationModelImpl.UCCCONFERENCEID_COLUMN_BITMASK |
			UccAssociationModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONFERENCEID = new FinderPath(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
			UccAssociationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByConferenceId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the ucc associations where uccConferenceId = &#63;.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @return the matching ucc associations
	 */
	@Override
	public List<UccAssociation> findByConferenceId(int uccConferenceId) {
		return findByConferenceId(uccConferenceId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ucc associations where uccConferenceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param start the lower bound of the range of ucc associations
	 * @param end the upper bound of the range of ucc associations (not inclusive)
	 * @return the range of matching ucc associations
	 */
	@Override
	public List<UccAssociation> findByConferenceId(int uccConferenceId,
		int start, int end) {
		return findByConferenceId(uccConferenceId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ucc associations where uccConferenceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param start the lower bound of the range of ucc associations
	 * @param end the upper bound of the range of ucc associations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ucc associations
	 */
	@Override
	public List<UccAssociation> findByConferenceId(int uccConferenceId,
		int start, int end, OrderByComparator<UccAssociation> orderByComparator) {
		return findByConferenceId(uccConferenceId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ucc associations where uccConferenceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param start the lower bound of the range of ucc associations
	 * @param end the upper bound of the range of ucc associations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ucc associations
	 */
	@Override
	public List<UccAssociation> findByConferenceId(int uccConferenceId,
		int start, int end,
		OrderByComparator<UccAssociation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFERENCEID;
			finderArgs = new Object[] { uccConferenceId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONFERENCEID;
			finderArgs = new Object[] {
					uccConferenceId,
					
					start, end, orderByComparator
				};
		}

		List<UccAssociation> list = null;

		if (retrieveFromCache) {
			list = (List<UccAssociation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UccAssociation uccAssociation : list) {
					if ((uccConferenceId != uccAssociation.getUccConferenceId())) {
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

			query.append(_SQL_SELECT_UCCASSOCIATION_WHERE);

			query.append(_FINDER_COLUMN_CONFERENCEID_UCCCONFERENCEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UccAssociationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(uccConferenceId);

				if (!pagination) {
					list = (List<UccAssociation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UccAssociation>)QueryUtil.list(q,
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
	 * Returns the first ucc association in the ordered set where uccConferenceId = &#63;.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ucc association
	 * @throws NoSuchUccAssociationException if a matching ucc association could not be found
	 */
	@Override
	public UccAssociation findByConferenceId_First(int uccConferenceId,
		OrderByComparator<UccAssociation> orderByComparator)
		throws NoSuchUccAssociationException {
		UccAssociation uccAssociation = fetchByConferenceId_First(uccConferenceId,
				orderByComparator);

		if (uccAssociation != null) {
			return uccAssociation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uccConferenceId=");
		msg.append(uccConferenceId);

		msg.append("}");

		throw new NoSuchUccAssociationException(msg.toString());
	}

	/**
	 * Returns the first ucc association in the ordered set where uccConferenceId = &#63;.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ucc association, or <code>null</code> if a matching ucc association could not be found
	 */
	@Override
	public UccAssociation fetchByConferenceId_First(int uccConferenceId,
		OrderByComparator<UccAssociation> orderByComparator) {
		List<UccAssociation> list = findByConferenceId(uccConferenceId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ucc association in the ordered set where uccConferenceId = &#63;.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ucc association
	 * @throws NoSuchUccAssociationException if a matching ucc association could not be found
	 */
	@Override
	public UccAssociation findByConferenceId_Last(int uccConferenceId,
		OrderByComparator<UccAssociation> orderByComparator)
		throws NoSuchUccAssociationException {
		UccAssociation uccAssociation = fetchByConferenceId_Last(uccConferenceId,
				orderByComparator);

		if (uccAssociation != null) {
			return uccAssociation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uccConferenceId=");
		msg.append(uccConferenceId);

		msg.append("}");

		throw new NoSuchUccAssociationException(msg.toString());
	}

	/**
	 * Returns the last ucc association in the ordered set where uccConferenceId = &#63;.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ucc association, or <code>null</code> if a matching ucc association could not be found
	 */
	@Override
	public UccAssociation fetchByConferenceId_Last(int uccConferenceId,
		OrderByComparator<UccAssociation> orderByComparator) {
		int count = countByConferenceId(uccConferenceId);

		if (count == 0) {
			return null;
		}

		List<UccAssociation> list = findByConferenceId(uccConferenceId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ucc associations before and after the current ucc association in the ordered set where uccConferenceId = &#63;.
	 *
	 * @param uccAssociationId the primary key of the current ucc association
	 * @param uccConferenceId the ucc conference ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ucc association
	 * @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	 */
	@Override
	public UccAssociation[] findByConferenceId_PrevAndNext(
		int uccAssociationId, int uccConferenceId,
		OrderByComparator<UccAssociation> orderByComparator)
		throws NoSuchUccAssociationException {
		UccAssociation uccAssociation = findByPrimaryKey(uccAssociationId);

		Session session = null;

		try {
			session = openSession();

			UccAssociation[] array = new UccAssociationImpl[3];

			array[0] = getByConferenceId_PrevAndNext(session, uccAssociation,
					uccConferenceId, orderByComparator, true);

			array[1] = uccAssociation;

			array[2] = getByConferenceId_PrevAndNext(session, uccAssociation,
					uccConferenceId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UccAssociation getByConferenceId_PrevAndNext(Session session,
		UccAssociation uccAssociation, int uccConferenceId,
		OrderByComparator<UccAssociation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_UCCASSOCIATION_WHERE);

		query.append(_FINDER_COLUMN_CONFERENCEID_UCCCONFERENCEID_2);

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
			query.append(UccAssociationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(uccConferenceId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(uccAssociation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UccAssociation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ucc associations where uccConferenceId = &#63; from the database.
	 *
	 * @param uccConferenceId the ucc conference ID
	 */
	@Override
	public void removeByConferenceId(int uccConferenceId) {
		for (UccAssociation uccAssociation : findByConferenceId(
				uccConferenceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(uccAssociation);
		}
	}

	/**
	 * Returns the number of ucc associations where uccConferenceId = &#63;.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @return the number of matching ucc associations
	 */
	@Override
	public int countByConferenceId(int uccConferenceId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONFERENCEID;

		Object[] finderArgs = new Object[] { uccConferenceId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_UCCASSOCIATION_WHERE);

			query.append(_FINDER_COLUMN_CONFERENCEID_UCCCONFERENCEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(uccConferenceId);

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

	private static final String _FINDER_COLUMN_CONFERENCEID_UCCCONFERENCEID_2 = "uccAssociation.uccConferenceId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_A = new FinderPath(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
			UccAssociationModelImpl.FINDER_CACHE_ENABLED,
			UccAssociationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_A",
			new String[] {
				Integer.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_A = new FinderPath(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
			UccAssociationModelImpl.FINDER_CACHE_ENABLED,
			UccAssociationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_A",
			new String[] { Integer.class.getName(), Boolean.class.getName() },
			UccAssociationModelImpl.UCCCONFERENCEID_COLUMN_BITMASK |
			UccAssociationModelImpl.MYACTIVE_COLUMN_BITMASK |
			UccAssociationModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_A = new FinderPath(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
			UccAssociationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_A",
			new String[] { Integer.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param myActive the my active
	 * @return the matching ucc associations
	 */
	@Override
	public List<UccAssociation> findByC_A(int uccConferenceId, boolean myActive) {
		return findByC_A(uccConferenceId, myActive, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param myActive the my active
	 * @param start the lower bound of the range of ucc associations
	 * @param end the upper bound of the range of ucc associations (not inclusive)
	 * @return the range of matching ucc associations
	 */
	@Override
	public List<UccAssociation> findByC_A(int uccConferenceId,
		boolean myActive, int start, int end) {
		return findByC_A(uccConferenceId, myActive, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param myActive the my active
	 * @param start the lower bound of the range of ucc associations
	 * @param end the upper bound of the range of ucc associations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ucc associations
	 */
	@Override
	public List<UccAssociation> findByC_A(int uccConferenceId,
		boolean myActive, int start, int end,
		OrderByComparator<UccAssociation> orderByComparator) {
		return findByC_A(uccConferenceId, myActive, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param myActive the my active
	 * @param start the lower bound of the range of ucc associations
	 * @param end the upper bound of the range of ucc associations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ucc associations
	 */
	@Override
	public List<UccAssociation> findByC_A(int uccConferenceId,
		boolean myActive, int start, int end,
		OrderByComparator<UccAssociation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_A;
			finderArgs = new Object[] { uccConferenceId, myActive };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_A;
			finderArgs = new Object[] {
					uccConferenceId, myActive,
					
					start, end, orderByComparator
				};
		}

		List<UccAssociation> list = null;

		if (retrieveFromCache) {
			list = (List<UccAssociation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UccAssociation uccAssociation : list) {
					if ((uccConferenceId != uccAssociation.getUccConferenceId()) ||
							(myActive != uccAssociation.isMyActive())) {
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

			query.append(_SQL_SELECT_UCCASSOCIATION_WHERE);

			query.append(_FINDER_COLUMN_C_A_UCCCONFERENCEID_2);

			query.append(_FINDER_COLUMN_C_A_MYACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UccAssociationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(uccConferenceId);

				qPos.add(myActive);

				if (!pagination) {
					list = (List<UccAssociation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UccAssociation>)QueryUtil.list(q,
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
	 * Returns the first ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ucc association
	 * @throws NoSuchUccAssociationException if a matching ucc association could not be found
	 */
	@Override
	public UccAssociation findByC_A_First(int uccConferenceId,
		boolean myActive, OrderByComparator<UccAssociation> orderByComparator)
		throws NoSuchUccAssociationException {
		UccAssociation uccAssociation = fetchByC_A_First(uccConferenceId,
				myActive, orderByComparator);

		if (uccAssociation != null) {
			return uccAssociation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uccConferenceId=");
		msg.append(uccConferenceId);

		msg.append(", myActive=");
		msg.append(myActive);

		msg.append("}");

		throw new NoSuchUccAssociationException(msg.toString());
	}

	/**
	 * Returns the first ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ucc association, or <code>null</code> if a matching ucc association could not be found
	 */
	@Override
	public UccAssociation fetchByC_A_First(int uccConferenceId,
		boolean myActive, OrderByComparator<UccAssociation> orderByComparator) {
		List<UccAssociation> list = findByC_A(uccConferenceId, myActive, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ucc association
	 * @throws NoSuchUccAssociationException if a matching ucc association could not be found
	 */
	@Override
	public UccAssociation findByC_A_Last(int uccConferenceId, boolean myActive,
		OrderByComparator<UccAssociation> orderByComparator)
		throws NoSuchUccAssociationException {
		UccAssociation uccAssociation = fetchByC_A_Last(uccConferenceId,
				myActive, orderByComparator);

		if (uccAssociation != null) {
			return uccAssociation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uccConferenceId=");
		msg.append(uccConferenceId);

		msg.append(", myActive=");
		msg.append(myActive);

		msg.append("}");

		throw new NoSuchUccAssociationException(msg.toString());
	}

	/**
	 * Returns the last ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ucc association, or <code>null</code> if a matching ucc association could not be found
	 */
	@Override
	public UccAssociation fetchByC_A_Last(int uccConferenceId,
		boolean myActive, OrderByComparator<UccAssociation> orderByComparator) {
		int count = countByC_A(uccConferenceId, myActive);

		if (count == 0) {
			return null;
		}

		List<UccAssociation> list = findByC_A(uccConferenceId, myActive,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ucc associations before and after the current ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	 *
	 * @param uccAssociationId the primary key of the current ucc association
	 * @param uccConferenceId the ucc conference ID
	 * @param myActive the my active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ucc association
	 * @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	 */
	@Override
	public UccAssociation[] findByC_A_PrevAndNext(int uccAssociationId,
		int uccConferenceId, boolean myActive,
		OrderByComparator<UccAssociation> orderByComparator)
		throws NoSuchUccAssociationException {
		UccAssociation uccAssociation = findByPrimaryKey(uccAssociationId);

		Session session = null;

		try {
			session = openSession();

			UccAssociation[] array = new UccAssociationImpl[3];

			array[0] = getByC_A_PrevAndNext(session, uccAssociation,
					uccConferenceId, myActive, orderByComparator, true);

			array[1] = uccAssociation;

			array[2] = getByC_A_PrevAndNext(session, uccAssociation,
					uccConferenceId, myActive, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UccAssociation getByC_A_PrevAndNext(Session session,
		UccAssociation uccAssociation, int uccConferenceId, boolean myActive,
		OrderByComparator<UccAssociation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_UCCASSOCIATION_WHERE);

		query.append(_FINDER_COLUMN_C_A_UCCCONFERENCEID_2);

		query.append(_FINDER_COLUMN_C_A_MYACTIVE_2);

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
			query.append(UccAssociationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(uccConferenceId);

		qPos.add(myActive);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(uccAssociation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UccAssociation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ucc associations where uccConferenceId = &#63; and myActive = &#63; from the database.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param myActive the my active
	 */
	@Override
	public void removeByC_A(int uccConferenceId, boolean myActive) {
		for (UccAssociation uccAssociation : findByC_A(uccConferenceId,
				myActive, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(uccAssociation);
		}
	}

	/**
	 * Returns the number of ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	 *
	 * @param uccConferenceId the ucc conference ID
	 * @param myActive the my active
	 * @return the number of matching ucc associations
	 */
	@Override
	public int countByC_A(int uccConferenceId, boolean myActive) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_A;

		Object[] finderArgs = new Object[] { uccConferenceId, myActive };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_UCCASSOCIATION_WHERE);

			query.append(_FINDER_COLUMN_C_A_UCCCONFERENCEID_2);

			query.append(_FINDER_COLUMN_C_A_MYACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(uccConferenceId);

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

	private static final String _FINDER_COLUMN_C_A_UCCCONFERENCEID_2 = "uccAssociation.uccConferenceId = ? AND ";
	private static final String _FINDER_COLUMN_C_A_MYACTIVE_2 = "uccAssociation.myActive = ?";

	public UccAssociationPersistenceImpl() {
		setModelClass(UccAssociation.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uccAssociationId", "associationId");
			dbColumnNames.put("uccConferenceId", "conferenceId");
			dbColumnNames.put("name", "association_name");
			dbColumnNames.put("abbreviation", "assocabb");
			dbColumnNames.put("myActive", "active");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the ucc association in the entity cache if it is enabled.
	 *
	 * @param uccAssociation the ucc association
	 */
	@Override
	public void cacheResult(UccAssociation uccAssociation) {
		entityCache.putResult(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
			UccAssociationImpl.class, uccAssociation.getPrimaryKey(),
			uccAssociation);

		uccAssociation.resetOriginalValues();
	}

	/**
	 * Caches the ucc associations in the entity cache if it is enabled.
	 *
	 * @param uccAssociations the ucc associations
	 */
	@Override
	public void cacheResult(List<UccAssociation> uccAssociations) {
		for (UccAssociation uccAssociation : uccAssociations) {
			if (entityCache.getResult(
						UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
						UccAssociationImpl.class, uccAssociation.getPrimaryKey()) == null) {
				cacheResult(uccAssociation);
			}
			else {
				uccAssociation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ucc associations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UccAssociationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ucc association.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UccAssociation uccAssociation) {
		entityCache.removeResult(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
			UccAssociationImpl.class, uccAssociation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UccAssociation> uccAssociations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UccAssociation uccAssociation : uccAssociations) {
			entityCache.removeResult(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
				UccAssociationImpl.class, uccAssociation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ucc association with the primary key. Does not add the ucc association to the database.
	 *
	 * @param uccAssociationId the primary key for the new ucc association
	 * @return the new ucc association
	 */
	@Override
	public UccAssociation create(int uccAssociationId) {
		UccAssociation uccAssociation = new UccAssociationImpl();

		uccAssociation.setNew(true);
		uccAssociation.setPrimaryKey(uccAssociationId);

		return uccAssociation;
	}

	/**
	 * Removes the ucc association with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param uccAssociationId the primary key of the ucc association
	 * @return the ucc association that was removed
	 * @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	 */
	@Override
	public UccAssociation remove(int uccAssociationId)
		throws NoSuchUccAssociationException {
		return remove((Serializable)uccAssociationId);
	}

	/**
	 * Removes the ucc association with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ucc association
	 * @return the ucc association that was removed
	 * @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	 */
	@Override
	public UccAssociation remove(Serializable primaryKey)
		throws NoSuchUccAssociationException {
		Session session = null;

		try {
			session = openSession();

			UccAssociation uccAssociation = (UccAssociation)session.get(UccAssociationImpl.class,
					primaryKey);

			if (uccAssociation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUccAssociationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(uccAssociation);
		}
		catch (NoSuchUccAssociationException nsee) {
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
	protected UccAssociation removeImpl(UccAssociation uccAssociation) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(uccAssociation)) {
				uccAssociation = (UccAssociation)session.get(UccAssociationImpl.class,
						uccAssociation.getPrimaryKeyObj());
			}

			if (uccAssociation != null) {
				session.delete(uccAssociation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (uccAssociation != null) {
			clearCache(uccAssociation);
		}

		return uccAssociation;
	}

	@Override
	public UccAssociation updateImpl(UccAssociation uccAssociation) {
		boolean isNew = uccAssociation.isNew();

		if (!(uccAssociation instanceof UccAssociationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(uccAssociation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(uccAssociation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in uccAssociation proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom UccAssociation implementation " +
				uccAssociation.getClass());
		}

		UccAssociationModelImpl uccAssociationModelImpl = (UccAssociationModelImpl)uccAssociation;

		Session session = null;

		try {
			session = openSession();

			if (uccAssociation.isNew()) {
				session.save(uccAssociation);

				uccAssociation.setNew(false);
			}
			else {
				uccAssociation = (UccAssociation)session.merge(uccAssociation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!UccAssociationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					uccAssociationModelImpl.getUccConferenceId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CONFERENCEID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFERENCEID,
				args);

			args = new Object[] {
					uccAssociationModelImpl.getUccConferenceId(),
					uccAssociationModelImpl.isMyActive()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_C_A, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_A,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((uccAssociationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFERENCEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						uccAssociationModelImpl.getOriginalUccConferenceId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONFERENCEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFERENCEID,
					args);

				args = new Object[] { uccAssociationModelImpl.getUccConferenceId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONFERENCEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFERENCEID,
					args);
			}

			if ((uccAssociationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						uccAssociationModelImpl.getOriginalUccConferenceId(),
						uccAssociationModelImpl.getOriginalMyActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_C_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_A,
					args);

				args = new Object[] {
						uccAssociationModelImpl.getUccConferenceId(),
						uccAssociationModelImpl.isMyActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_C_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_A,
					args);
			}
		}

		entityCache.putResult(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
			UccAssociationImpl.class, uccAssociation.getPrimaryKey(),
			uccAssociation, false);

		uccAssociation.resetOriginalValues();

		return uccAssociation;
	}

	/**
	 * Returns the ucc association with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ucc association
	 * @return the ucc association
	 * @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	 */
	@Override
	public UccAssociation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUccAssociationException {
		UccAssociation uccAssociation = fetchByPrimaryKey(primaryKey);

		if (uccAssociation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUccAssociationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return uccAssociation;
	}

	/**
	 * Returns the ucc association with the primary key or throws a {@link NoSuchUccAssociationException} if it could not be found.
	 *
	 * @param uccAssociationId the primary key of the ucc association
	 * @return the ucc association
	 * @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	 */
	@Override
	public UccAssociation findByPrimaryKey(int uccAssociationId)
		throws NoSuchUccAssociationException {
		return findByPrimaryKey((Serializable)uccAssociationId);
	}

	/**
	 * Returns the ucc association with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ucc association
	 * @return the ucc association, or <code>null</code> if a ucc association with the primary key could not be found
	 */
	@Override
	public UccAssociation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
				UccAssociationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		UccAssociation uccAssociation = (UccAssociation)serializable;

		if (uccAssociation == null) {
			Session session = null;

			try {
				session = openSession();

				uccAssociation = (UccAssociation)session.get(UccAssociationImpl.class,
						primaryKey);

				if (uccAssociation != null) {
					cacheResult(uccAssociation);
				}
				else {
					entityCache.putResult(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
						UccAssociationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
					UccAssociationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return uccAssociation;
	}

	/**
	 * Returns the ucc association with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param uccAssociationId the primary key of the ucc association
	 * @return the ucc association, or <code>null</code> if a ucc association with the primary key could not be found
	 */
	@Override
	public UccAssociation fetchByPrimaryKey(int uccAssociationId) {
		return fetchByPrimaryKey((Serializable)uccAssociationId);
	}

	@Override
	public Map<Serializable, UccAssociation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, UccAssociation> map = new HashMap<Serializable, UccAssociation>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			UccAssociation uccAssociation = fetchByPrimaryKey(primaryKey);

			if (uccAssociation != null) {
				map.put(primaryKey, uccAssociation);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
					UccAssociationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (UccAssociation)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_UCCASSOCIATION_WHERE_PKS_IN);

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

			for (UccAssociation uccAssociation : (List<UccAssociation>)q.list()) {
				map.put(uccAssociation.getPrimaryKeyObj(), uccAssociation);

				cacheResult(uccAssociation);

				uncachedPrimaryKeys.remove(uccAssociation.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(UccAssociationModelImpl.ENTITY_CACHE_ENABLED,
					UccAssociationImpl.class, primaryKey, nullModel);
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
	 * Returns all the ucc associations.
	 *
	 * @return the ucc associations
	 */
	@Override
	public List<UccAssociation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ucc associations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc associations
	 * @param end the upper bound of the range of ucc associations (not inclusive)
	 * @return the range of ucc associations
	 */
	@Override
	public List<UccAssociation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ucc associations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc associations
	 * @param end the upper bound of the range of ucc associations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ucc associations
	 */
	@Override
	public List<UccAssociation> findAll(int start, int end,
		OrderByComparator<UccAssociation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ucc associations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc associations
	 * @param end the upper bound of the range of ucc associations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ucc associations
	 */
	@Override
	public List<UccAssociation> findAll(int start, int end,
		OrderByComparator<UccAssociation> orderByComparator,
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

		List<UccAssociation> list = null;

		if (retrieveFromCache) {
			list = (List<UccAssociation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_UCCASSOCIATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_UCCASSOCIATION;

				if (pagination) {
					sql = sql.concat(UccAssociationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UccAssociation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UccAssociation>)QueryUtil.list(q,
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
	 * Removes all the ucc associations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UccAssociation uccAssociation : findAll()) {
			remove(uccAssociation);
		}
	}

	/**
	 * Returns the number of ucc associations.
	 *
	 * @return the number of ucc associations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_UCCASSOCIATION);

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
		return UccAssociationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ucc association persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(UccAssociationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_UCCASSOCIATION = "SELECT uccAssociation FROM UccAssociation uccAssociation";
	private static final String _SQL_SELECT_UCCASSOCIATION_WHERE_PKS_IN = "SELECT uccAssociation FROM UccAssociation uccAssociation WHERE associationId IN (";
	private static final String _SQL_SELECT_UCCASSOCIATION_WHERE = "SELECT uccAssociation FROM UccAssociation uccAssociation WHERE ";
	private static final String _SQL_COUNT_UCCASSOCIATION = "SELECT COUNT(uccAssociation) FROM UccAssociation uccAssociation";
	private static final String _SQL_COUNT_UCCASSOCIATION_WHERE = "SELECT COUNT(uccAssociation) FROM UccAssociation uccAssociation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "uccAssociation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UccAssociation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UccAssociation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(UccAssociationPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uccAssociationId", "uccConferenceId", "name", "abbreviation",
				"myActive"
			});
}