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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ucc.portal.exception.NoSuchCExtRealEstateCampaignException;

import ucc.portal.model.CExtRealEstateCampaign;
import ucc.portal.model.impl.CExtRealEstateCampaignImpl;
import ucc.portal.model.impl.CExtRealEstateCampaignModelImpl;

import ucc.portal.service.persistence.CExtRealEstateCampaignPK;
import ucc.portal.service.persistence.CExtRealEstateCampaignPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the c ext real estate campaign service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtRealEstateCampaignPersistence
 * @see ucc.portal.service.persistence.CExtRealEstateCampaignUtil
 * @generated
 */
@ProviderType
public class CExtRealEstateCampaignPersistenceImpl extends BasePersistenceImpl<CExtRealEstateCampaign>
	implements CExtRealEstateCampaignPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CExtRealEstateCampaignUtil} to access the c ext real estate campaign persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CExtRealEstateCampaignImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
			CExtRealEstateCampaignModelImpl.FINDER_CACHE_ENABLED,
			CExtRealEstateCampaignImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
			CExtRealEstateCampaignModelImpl.FINDER_CACHE_ENABLED,
			CExtRealEstateCampaignImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
			CExtRealEstateCampaignModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
			CExtRealEstateCampaignModelImpl.FINDER_CACHE_ENABLED,
			CExtRealEstateCampaignImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrganizationId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
			CExtRealEstateCampaignModelImpl.FINDER_CACHE_ENABLED,
			CExtRealEstateCampaignImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrganizationId",
			new String[] { Long.class.getName() },
			CExtRealEstateCampaignModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			CExtRealEstateCampaignModelImpl.REYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONID = new FinderPath(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
			CExtRealEstateCampaignModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrganizationId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the c ext real estate campaigns where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching c ext real estate campaigns
	 */
	@Override
	public List<CExtRealEstateCampaign> findByOrganizationId(
		long organizationId) {
		return findByOrganizationId(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext real estate campaigns where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext real estate campaigns
	 * @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	 * @return the range of matching c ext real estate campaigns
	 */
	@Override
	public List<CExtRealEstateCampaign> findByOrganizationId(
		long organizationId, int start, int end) {
		return findByOrganizationId(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext real estate campaigns where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext real estate campaigns
	 * @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching c ext real estate campaigns
	 */
	@Override
	public List<CExtRealEstateCampaign> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator) {
		return findByOrganizationId(organizationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext real estate campaigns where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of c ext real estate campaigns
	 * @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching c ext real estate campaigns
	 */
	@Override
	public List<CExtRealEstateCampaign> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID;
			finderArgs = new Object[] { organizationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID;
			finderArgs = new Object[] {
					organizationId,
					
					start, end, orderByComparator
				};
		}

		List<CExtRealEstateCampaign> list = null;

		if (retrieveFromCache) {
			list = (List<CExtRealEstateCampaign>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CExtRealEstateCampaign cExtRealEstateCampaign : list) {
					if ((organizationId != cExtRealEstateCampaign.getOrganizationId())) {
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

			query.append(_SQL_SELECT_CEXTREALESTATECAMPAIGN_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CExtRealEstateCampaignModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<CExtRealEstateCampaign>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtRealEstateCampaign>)QueryUtil.list(q,
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
	 * Returns the first c ext real estate campaign in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext real estate campaign
	 * @throws NoSuchCExtRealEstateCampaignException if a matching c ext real estate campaign could not be found
	 */
	@Override
	public CExtRealEstateCampaign findByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator)
		throws NoSuchCExtRealEstateCampaignException {
		CExtRealEstateCampaign cExtRealEstateCampaign = fetchByOrganizationId_First(organizationId,
				orderByComparator);

		if (cExtRealEstateCampaign != null) {
			return cExtRealEstateCampaign;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtRealEstateCampaignException(msg.toString());
	}

	/**
	 * Returns the first c ext real estate campaign in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching c ext real estate campaign, or <code>null</code> if a matching c ext real estate campaign could not be found
	 */
	@Override
	public CExtRealEstateCampaign fetchByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator) {
		List<CExtRealEstateCampaign> list = findByOrganizationId(organizationId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last c ext real estate campaign in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext real estate campaign
	 * @throws NoSuchCExtRealEstateCampaignException if a matching c ext real estate campaign could not be found
	 */
	@Override
	public CExtRealEstateCampaign findByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator)
		throws NoSuchCExtRealEstateCampaignException {
		CExtRealEstateCampaign cExtRealEstateCampaign = fetchByOrganizationId_Last(organizationId,
				orderByComparator);

		if (cExtRealEstateCampaign != null) {
			return cExtRealEstateCampaign;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchCExtRealEstateCampaignException(msg.toString());
	}

	/**
	 * Returns the last c ext real estate campaign in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching c ext real estate campaign, or <code>null</code> if a matching c ext real estate campaign could not be found
	 */
	@Override
	public CExtRealEstateCampaign fetchByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator) {
		int count = countByOrganizationId(organizationId);

		if (count == 0) {
			return null;
		}

		List<CExtRealEstateCampaign> list = findByOrganizationId(organizationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the c ext real estate campaigns before and after the current c ext real estate campaign in the ordered set where organizationId = &#63;.
	 *
	 * @param cExtRealEstateCampaignPK the primary key of the current c ext real estate campaign
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next c ext real estate campaign
	 * @throws NoSuchCExtRealEstateCampaignException if a c ext real estate campaign with the primary key could not be found
	 */
	@Override
	public CExtRealEstateCampaign[] findByOrganizationId_PrevAndNext(
		CExtRealEstateCampaignPK cExtRealEstateCampaignPK, long organizationId,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator)
		throws NoSuchCExtRealEstateCampaignException {
		CExtRealEstateCampaign cExtRealEstateCampaign = findByPrimaryKey(cExtRealEstateCampaignPK);

		Session session = null;

		try {
			session = openSession();

			CExtRealEstateCampaign[] array = new CExtRealEstateCampaignImpl[3];

			array[0] = getByOrganizationId_PrevAndNext(session,
					cExtRealEstateCampaign, organizationId, orderByComparator,
					true);

			array[1] = cExtRealEstateCampaign;

			array[2] = getByOrganizationId_PrevAndNext(session,
					cExtRealEstateCampaign, organizationId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CExtRealEstateCampaign getByOrganizationId_PrevAndNext(
		Session session, CExtRealEstateCampaign cExtRealEstateCampaign,
		long organizationId,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator,
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

		query.append(_SQL_SELECT_CEXTREALESTATECAMPAIGN_WHERE);

		query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

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
			query.append(CExtRealEstateCampaignModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cExtRealEstateCampaign);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CExtRealEstateCampaign> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the c ext real estate campaigns where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 */
	@Override
	public void removeByOrganizationId(long organizationId) {
		for (CExtRealEstateCampaign cExtRealEstateCampaign : findByOrganizationId(
				organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cExtRealEstateCampaign);
		}
	}

	/**
	 * Returns the number of c ext real estate campaigns where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching c ext real estate campaigns
	 */
	@Override
	public int countByOrganizationId(long organizationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONID;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CEXTREALESTATECAMPAIGN_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

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

	private static final String _FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2 = "cExtRealEstateCampaign.id.organizationId = ?";

	public CExtRealEstateCampaignPersistenceImpl() {
		setModelClass(CExtRealEstateCampaign.class);
	}

	/**
	 * Caches the c ext real estate campaign in the entity cache if it is enabled.
	 *
	 * @param cExtRealEstateCampaign the c ext real estate campaign
	 */
	@Override
	public void cacheResult(CExtRealEstateCampaign cExtRealEstateCampaign) {
		entityCache.putResult(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
			CExtRealEstateCampaignImpl.class,
			cExtRealEstateCampaign.getPrimaryKey(), cExtRealEstateCampaign);

		cExtRealEstateCampaign.resetOriginalValues();
	}

	/**
	 * Caches the c ext real estate campaigns in the entity cache if it is enabled.
	 *
	 * @param cExtRealEstateCampaigns the c ext real estate campaigns
	 */
	@Override
	public void cacheResult(
		List<CExtRealEstateCampaign> cExtRealEstateCampaigns) {
		for (CExtRealEstateCampaign cExtRealEstateCampaign : cExtRealEstateCampaigns) {
			if (entityCache.getResult(
						CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
						CExtRealEstateCampaignImpl.class,
						cExtRealEstateCampaign.getPrimaryKey()) == null) {
				cacheResult(cExtRealEstateCampaign);
			}
			else {
				cExtRealEstateCampaign.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c ext real estate campaigns.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CExtRealEstateCampaignImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c ext real estate campaign.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CExtRealEstateCampaign cExtRealEstateCampaign) {
		entityCache.removeResult(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
			CExtRealEstateCampaignImpl.class,
			cExtRealEstateCampaign.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CExtRealEstateCampaign> cExtRealEstateCampaigns) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CExtRealEstateCampaign cExtRealEstateCampaign : cExtRealEstateCampaigns) {
			entityCache.removeResult(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
				CExtRealEstateCampaignImpl.class,
				cExtRealEstateCampaign.getPrimaryKey());
		}
	}

	/**
	 * Creates a new c ext real estate campaign with the primary key. Does not add the c ext real estate campaign to the database.
	 *
	 * @param cExtRealEstateCampaignPK the primary key for the new c ext real estate campaign
	 * @return the new c ext real estate campaign
	 */
	@Override
	public CExtRealEstateCampaign create(
		CExtRealEstateCampaignPK cExtRealEstateCampaignPK) {
		CExtRealEstateCampaign cExtRealEstateCampaign = new CExtRealEstateCampaignImpl();

		cExtRealEstateCampaign.setNew(true);
		cExtRealEstateCampaign.setPrimaryKey(cExtRealEstateCampaignPK);

		cExtRealEstateCampaign.setCompanyId(companyProvider.getCompanyId());

		return cExtRealEstateCampaign;
	}

	/**
	 * Removes the c ext real estate campaign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cExtRealEstateCampaignPK the primary key of the c ext real estate campaign
	 * @return the c ext real estate campaign that was removed
	 * @throws NoSuchCExtRealEstateCampaignException if a c ext real estate campaign with the primary key could not be found
	 */
	@Override
	public CExtRealEstateCampaign remove(
		CExtRealEstateCampaignPK cExtRealEstateCampaignPK)
		throws NoSuchCExtRealEstateCampaignException {
		return remove((Serializable)cExtRealEstateCampaignPK);
	}

	/**
	 * Removes the c ext real estate campaign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c ext real estate campaign
	 * @return the c ext real estate campaign that was removed
	 * @throws NoSuchCExtRealEstateCampaignException if a c ext real estate campaign with the primary key could not be found
	 */
	@Override
	public CExtRealEstateCampaign remove(Serializable primaryKey)
		throws NoSuchCExtRealEstateCampaignException {
		Session session = null;

		try {
			session = openSession();

			CExtRealEstateCampaign cExtRealEstateCampaign = (CExtRealEstateCampaign)session.get(CExtRealEstateCampaignImpl.class,
					primaryKey);

			if (cExtRealEstateCampaign == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCExtRealEstateCampaignException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cExtRealEstateCampaign);
		}
		catch (NoSuchCExtRealEstateCampaignException nsee) {
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
	protected CExtRealEstateCampaign removeImpl(
		CExtRealEstateCampaign cExtRealEstateCampaign) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cExtRealEstateCampaign)) {
				cExtRealEstateCampaign = (CExtRealEstateCampaign)session.get(CExtRealEstateCampaignImpl.class,
						cExtRealEstateCampaign.getPrimaryKeyObj());
			}

			if (cExtRealEstateCampaign != null) {
				session.delete(cExtRealEstateCampaign);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cExtRealEstateCampaign != null) {
			clearCache(cExtRealEstateCampaign);
		}

		return cExtRealEstateCampaign;
	}

	@Override
	public CExtRealEstateCampaign updateImpl(
		CExtRealEstateCampaign cExtRealEstateCampaign) {
		boolean isNew = cExtRealEstateCampaign.isNew();

		if (!(cExtRealEstateCampaign instanceof CExtRealEstateCampaignModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cExtRealEstateCampaign.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(cExtRealEstateCampaign);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cExtRealEstateCampaign proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CExtRealEstateCampaign implementation " +
				cExtRealEstateCampaign.getClass());
		}

		CExtRealEstateCampaignModelImpl cExtRealEstateCampaignModelImpl = (CExtRealEstateCampaignModelImpl)cExtRealEstateCampaign;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (cExtRealEstateCampaign.getCreateDate() == null)) {
			if (serviceContext == null) {
				cExtRealEstateCampaign.setCreateDate(now);
			}
			else {
				cExtRealEstateCampaign.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!cExtRealEstateCampaignModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cExtRealEstateCampaign.setModifiedDate(now);
			}
			else {
				cExtRealEstateCampaign.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (cExtRealEstateCampaign.isNew()) {
				session.save(cExtRealEstateCampaign);

				cExtRealEstateCampaign.setNew(false);
			}
			else {
				cExtRealEstateCampaign = (CExtRealEstateCampaign)session.merge(cExtRealEstateCampaign);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CExtRealEstateCampaignModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					cExtRealEstateCampaignModelImpl.getOrganizationId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((cExtRealEstateCampaignModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cExtRealEstateCampaignModelImpl.getOriginalOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);

				args = new Object[] {
						cExtRealEstateCampaignModelImpl.getOrganizationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);
			}
		}

		entityCache.putResult(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
			CExtRealEstateCampaignImpl.class,
			cExtRealEstateCampaign.getPrimaryKey(), cExtRealEstateCampaign,
			false);

		cExtRealEstateCampaign.resetOriginalValues();

		return cExtRealEstateCampaign;
	}

	/**
	 * Returns the c ext real estate campaign with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext real estate campaign
	 * @return the c ext real estate campaign
	 * @throws NoSuchCExtRealEstateCampaignException if a c ext real estate campaign with the primary key could not be found
	 */
	@Override
	public CExtRealEstateCampaign findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCExtRealEstateCampaignException {
		CExtRealEstateCampaign cExtRealEstateCampaign = fetchByPrimaryKey(primaryKey);

		if (cExtRealEstateCampaign == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCExtRealEstateCampaignException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cExtRealEstateCampaign;
	}

	/**
	 * Returns the c ext real estate campaign with the primary key or throws a {@link NoSuchCExtRealEstateCampaignException} if it could not be found.
	 *
	 * @param cExtRealEstateCampaignPK the primary key of the c ext real estate campaign
	 * @return the c ext real estate campaign
	 * @throws NoSuchCExtRealEstateCampaignException if a c ext real estate campaign with the primary key could not be found
	 */
	@Override
	public CExtRealEstateCampaign findByPrimaryKey(
		CExtRealEstateCampaignPK cExtRealEstateCampaignPK)
		throws NoSuchCExtRealEstateCampaignException {
		return findByPrimaryKey((Serializable)cExtRealEstateCampaignPK);
	}

	/**
	 * Returns the c ext real estate campaign with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext real estate campaign
	 * @return the c ext real estate campaign, or <code>null</code> if a c ext real estate campaign with the primary key could not be found
	 */
	@Override
	public CExtRealEstateCampaign fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
				CExtRealEstateCampaignImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CExtRealEstateCampaign cExtRealEstateCampaign = (CExtRealEstateCampaign)serializable;

		if (cExtRealEstateCampaign == null) {
			Session session = null;

			try {
				session = openSession();

				cExtRealEstateCampaign = (CExtRealEstateCampaign)session.get(CExtRealEstateCampaignImpl.class,
						primaryKey);

				if (cExtRealEstateCampaign != null) {
					cacheResult(cExtRealEstateCampaign);
				}
				else {
					entityCache.putResult(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
						CExtRealEstateCampaignImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CExtRealEstateCampaignModelImpl.ENTITY_CACHE_ENABLED,
					CExtRealEstateCampaignImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cExtRealEstateCampaign;
	}

	/**
	 * Returns the c ext real estate campaign with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cExtRealEstateCampaignPK the primary key of the c ext real estate campaign
	 * @return the c ext real estate campaign, or <code>null</code> if a c ext real estate campaign with the primary key could not be found
	 */
	@Override
	public CExtRealEstateCampaign fetchByPrimaryKey(
		CExtRealEstateCampaignPK cExtRealEstateCampaignPK) {
		return fetchByPrimaryKey((Serializable)cExtRealEstateCampaignPK);
	}

	@Override
	public Map<Serializable, CExtRealEstateCampaign> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CExtRealEstateCampaign> map = new HashMap<Serializable, CExtRealEstateCampaign>();

		for (Serializable primaryKey : primaryKeys) {
			CExtRealEstateCampaign cExtRealEstateCampaign = fetchByPrimaryKey(primaryKey);

			if (cExtRealEstateCampaign != null) {
				map.put(primaryKey, cExtRealEstateCampaign);
			}
		}

		return map;
	}

	/**
	 * Returns all the c ext real estate campaigns.
	 *
	 * @return the c ext real estate campaigns
	 */
	@Override
	public List<CExtRealEstateCampaign> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext real estate campaigns.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext real estate campaigns
	 * @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	 * @return the range of c ext real estate campaigns
	 */
	@Override
	public List<CExtRealEstateCampaign> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext real estate campaigns.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext real estate campaigns
	 * @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c ext real estate campaigns
	 */
	@Override
	public List<CExtRealEstateCampaign> findAll(int start, int end,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext real estate campaigns.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext real estate campaigns
	 * @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of c ext real estate campaigns
	 */
	@Override
	public List<CExtRealEstateCampaign> findAll(int start, int end,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator,
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

		List<CExtRealEstateCampaign> list = null;

		if (retrieveFromCache) {
			list = (List<CExtRealEstateCampaign>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CEXTREALESTATECAMPAIGN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CEXTREALESTATECAMPAIGN;

				if (pagination) {
					sql = sql.concat(CExtRealEstateCampaignModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CExtRealEstateCampaign>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtRealEstateCampaign>)QueryUtil.list(q,
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
	 * Removes all the c ext real estate campaigns from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CExtRealEstateCampaign cExtRealEstateCampaign : findAll()) {
			remove(cExtRealEstateCampaign);
		}
	}

	/**
	 * Returns the number of c ext real estate campaigns.
	 *
	 * @return the number of c ext real estate campaigns
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CEXTREALESTATECAMPAIGN);

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
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CExtRealEstateCampaignModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the c ext real estate campaign persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CExtRealEstateCampaignImpl.class.getName());
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
	private static final String _SQL_SELECT_CEXTREALESTATECAMPAIGN = "SELECT cExtRealEstateCampaign FROM CExtRealEstateCampaign cExtRealEstateCampaign";
	private static final String _SQL_SELECT_CEXTREALESTATECAMPAIGN_WHERE = "SELECT cExtRealEstateCampaign FROM CExtRealEstateCampaign cExtRealEstateCampaign WHERE ";
	private static final String _SQL_COUNT_CEXTREALESTATECAMPAIGN = "SELECT COUNT(cExtRealEstateCampaign) FROM CExtRealEstateCampaign cExtRealEstateCampaign";
	private static final String _SQL_COUNT_CEXTREALESTATECAMPAIGN_WHERE = "SELECT COUNT(cExtRealEstateCampaign) FROM CExtRealEstateCampaign cExtRealEstateCampaign WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cExtRealEstateCampaign.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CExtRealEstateCampaign exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CExtRealEstateCampaign exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CExtRealEstateCampaignPersistenceImpl.class);
	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(new String[] {
				"organizationId", "cextRealEstateCampaignId"
			});
}