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

package contact.manager.service.persistence.impl;

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
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.exception.NoSuchCrmCountyCommissionerException;
import contact.manager.model.CrmCountyCommissioner;
import contact.manager.model.impl.CrmCountyCommissionerImpl;
import contact.manager.model.impl.CrmCountyCommissionerModelImpl;
import contact.manager.service.persistence.CrmCountyCommissionerPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the CRM County Commissioner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CrmCountyCommissionerPersistenceImpl
	extends BasePersistenceImpl<CrmCountyCommissioner>
	implements CrmCountyCommissionerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CrmCountyCommissionerUtil</code> to access the CRM County Commissioner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CrmCountyCommissionerImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the CRM County Commissioners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM County Commissioners
	 */
	@Override
	public List<CrmCountyCommissioner> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM County Commissioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCountyCommissionerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM County Commissioners
	 * @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	 * @return the range of matching CRM County Commissioners
	 */
	@Override
	public List<CrmCountyCommissioner> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM County Commissioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCountyCommissionerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM County Commissioners
	 * @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM County Commissioners
	 */
	@Deprecated
	@Override
	public List<CrmCountyCommissioner> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean useFinderCache) {

		return findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM County Commissioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCountyCommissionerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM County Commissioners
	 * @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM County Commissioners
	 */
	@Override
	public List<CrmCountyCommissioner> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {

		uuid = Objects.toString(uuid, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByUuid;
			finderArgs = new Object[] {uuid};
		}
		else {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<CrmCountyCommissioner> list =
			(List<CrmCountyCommissioner>)finderCache.getResult(
				finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmCountyCommissioner crmCountyCommissioner : list) {
				if (!uuid.equals(crmCountyCommissioner.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CRMCOUNTYCOMMISSIONER_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(CrmCountyCommissionerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<CrmCountyCommissioner>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmCountyCommissioner>)QueryUtil.list(
						q, getDialect(), start, end);
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
	 * Returns the first CRM County Commissioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM County Commissioner
	 * @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner findByUuid_First(
			String uuid,
			OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException {

		CrmCountyCommissioner crmCountyCommissioner = fetchByUuid_First(
			uuid, orderByComparator);

		if (crmCountyCommissioner != null) {
			return crmCountyCommissioner;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmCountyCommissionerException(msg.toString());
	}

	/**
	 * Returns the first CRM County Commissioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner fetchByUuid_First(
		String uuid,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {

		List<CrmCountyCommissioner> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM County Commissioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM County Commissioner
	 * @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner findByUuid_Last(
			String uuid,
			OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException {

		CrmCountyCommissioner crmCountyCommissioner = fetchByUuid_Last(
			uuid, orderByComparator);

		if (crmCountyCommissioner != null) {
			return crmCountyCommissioner;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmCountyCommissionerException(msg.toString());
	}

	/**
	 * Returns the last CRM County Commissioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner fetchByUuid_Last(
		String uuid,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmCountyCommissioner> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM County Commissioners before and after the current CRM County Commissioner in the ordered set where uuid = &#63;.
	 *
	 * @param crmCountyCommissionerOrBoardDistId the primary key of the current CRM County Commissioner
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM County Commissioner
	 * @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	 */
	@Override
	public CrmCountyCommissioner[] findByUuid_PrevAndNext(
			long crmCountyCommissionerOrBoardDistId, String uuid,
			OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException {

		uuid = Objects.toString(uuid, "");

		CrmCountyCommissioner crmCountyCommissioner = findByPrimaryKey(
			crmCountyCommissionerOrBoardDistId);

		Session session = null;

		try {
			session = openSession();

			CrmCountyCommissioner[] array = new CrmCountyCommissionerImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, crmCountyCommissioner, uuid, orderByComparator, true);

			array[1] = crmCountyCommissioner;

			array[2] = getByUuid_PrevAndNext(
				session, crmCountyCommissioner, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmCountyCommissioner getByUuid_PrevAndNext(
		Session session, CrmCountyCommissioner crmCountyCommissioner,
		String uuid, OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMCOUNTYCOMMISSIONER_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

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
			query.append(CrmCountyCommissionerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						crmCountyCommissioner)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CrmCountyCommissioner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM County Commissioners where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmCountyCommissioner crmCountyCommissioner :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(crmCountyCommissioner);
		}
	}

	/**
	 * Returns the number of CRM County Commissioners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM County Commissioners
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCOUNTYCOMMISSIONER_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
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

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"crmCountyCommissioner.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(crmCountyCommissioner.uuid IS NULL OR crmCountyCommissioner.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the CRM County Commissioner where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCrmCountyCommissionerException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM County Commissioner
	 * @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmCountyCommissionerException {

		CrmCountyCommissioner crmCountyCommissioner = fetchByUUID_G(
			uuid, groupId);

		if (crmCountyCommissioner == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchCrmCountyCommissionerException(msg.toString());
		}

		return crmCountyCommissioner;
	}

	/**
	 * Returns the CRM County Commissioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	 */
	@Deprecated
	@Override
	public CrmCountyCommissioner fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the CRM County Commissioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner fetchByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = new Object[] {uuid, groupId};

		Object result = finderCache.getResult(
			_finderPathFetchByUUID_G, finderArgs, this);

		if (result instanceof CrmCountyCommissioner) {
			CrmCountyCommissioner crmCountyCommissioner =
				(CrmCountyCommissioner)result;

			if (!Objects.equals(uuid, crmCountyCommissioner.getUuid()) ||
				(groupId != crmCountyCommissioner.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMCOUNTYCOMMISSIONER_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<CrmCountyCommissioner> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(
						_finderPathFetchByUUID_G, finderArgs, list);
				}
				else {
					CrmCountyCommissioner crmCountyCommissioner = list.get(0);

					result = crmCountyCommissioner;

					cacheResult(crmCountyCommissioner);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(_finderPathFetchByUUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (CrmCountyCommissioner)result;
		}
	}

	/**
	 * Removes the CRM County Commissioner where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM County Commissioner that was removed
	 */
	@Override
	public CrmCountyCommissioner removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmCountyCommissionerException {

		CrmCountyCommissioner crmCountyCommissioner = findByUUID_G(
			uuid, groupId);

		return remove(crmCountyCommissioner);
	}

	/**
	 * Returns the number of CRM County Commissioners where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM County Commissioners
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCOUNTYCOMMISSIONER_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"crmCountyCommissioner.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(crmCountyCommissioner.uuid IS NULL OR crmCountyCommissioner.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"crmCountyCommissioner.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM County Commissioners
	 */
	@Override
	public List<CrmCountyCommissioner> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCountyCommissionerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM County Commissioners
	 * @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	 * @return the range of matching CRM County Commissioners
	 */
	@Override
	public List<CrmCountyCommissioner> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCountyCommissionerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM County Commissioners
	 * @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM County Commissioners
	 */
	@Deprecated
	@Override
	public List<CrmCountyCommissioner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean useFinderCache) {

		return findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCountyCommissionerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM County Commissioners
	 * @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM County Commissioners
	 */
	@Override
	public List<CrmCountyCommissioner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {

		uuid = Objects.toString(uuid, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByUuid_C;
			finderArgs = new Object[] {uuid, companyId};
		}
		else {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<CrmCountyCommissioner> list =
			(List<CrmCountyCommissioner>)finderCache.getResult(
				finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmCountyCommissioner crmCountyCommissioner : list) {
				if (!uuid.equals(crmCountyCommissioner.getUuid()) ||
					(companyId != crmCountyCommissioner.getCompanyId())) {

					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CRMCOUNTYCOMMISSIONER_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(CrmCountyCommissionerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<CrmCountyCommissioner>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmCountyCommissioner>)QueryUtil.list(
						q, getDialect(), start, end);
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
	 * Returns the first CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM County Commissioner
	 * @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException {

		CrmCountyCommissioner crmCountyCommissioner = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (crmCountyCommissioner != null) {
			return crmCountyCommissioner;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmCountyCommissionerException(msg.toString());
	}

	/**
	 * Returns the first CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {

		List<CrmCountyCommissioner> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM County Commissioner
	 * @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException {

		CrmCountyCommissioner crmCountyCommissioner = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (crmCountyCommissioner != null) {
			return crmCountyCommissioner;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmCountyCommissionerException(msg.toString());
	}

	/**
	 * Returns the last CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmCountyCommissioner> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM County Commissioners before and after the current CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmCountyCommissionerOrBoardDistId the primary key of the current CRM County Commissioner
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM County Commissioner
	 * @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	 */
	@Override
	public CrmCountyCommissioner[] findByUuid_C_PrevAndNext(
			long crmCountyCommissionerOrBoardDistId, String uuid,
			long companyId,
			OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException {

		uuid = Objects.toString(uuid, "");

		CrmCountyCommissioner crmCountyCommissioner = findByPrimaryKey(
			crmCountyCommissionerOrBoardDistId);

		Session session = null;

		try {
			session = openSession();

			CrmCountyCommissioner[] array = new CrmCountyCommissionerImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, crmCountyCommissioner, uuid, companyId,
				orderByComparator, true);

			array[1] = crmCountyCommissioner;

			array[2] = getByUuid_C_PrevAndNext(
				session, crmCountyCommissioner, uuid, companyId,
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

	protected CrmCountyCommissioner getByUuid_C_PrevAndNext(
		Session session, CrmCountyCommissioner crmCountyCommissioner,
		String uuid, long companyId,
		OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMCOUNTYCOMMISSIONER_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

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
			query.append(CrmCountyCommissionerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						crmCountyCommissioner)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CrmCountyCommissioner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM County Commissioners where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmCountyCommissioner crmCountyCommissioner :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(crmCountyCommissioner);
		}
	}

	/**
	 * Returns the number of CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM County Commissioners
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCOUNTYCOMMISSIONER_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"crmCountyCommissioner.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(crmCountyCommissioner.uuid IS NULL OR crmCountyCommissioner.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"crmCountyCommissioner.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByZipCode;
	private FinderPath _finderPathWithoutPaginationFindByZipCode;
	private FinderPath _finderPathCountByZipCode;

	/**
	 * Returns all the CRM County Commissioners where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching CRM County Commissioners
	 */
	@Override
	public List<CrmCountyCommissioner> findByZipCode(String zipCode) {
		return findByZipCode(
			zipCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM County Commissioners where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCountyCommissionerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM County Commissioners
	 * @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	 * @return the range of matching CRM County Commissioners
	 */
	@Override
	public List<CrmCountyCommissioner> findByZipCode(
		String zipCode, int start, int end) {

		return findByZipCode(zipCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM County Commissioners where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCountyCommissionerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByZipCode(String, int, int, OrderByComparator)}
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM County Commissioners
	 * @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM County Commissioners
	 */
	@Deprecated
	@Override
	public List<CrmCountyCommissioner> findByZipCode(
		String zipCode, int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean useFinderCache) {

		return findByZipCode(zipCode, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM County Commissioners where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCountyCommissionerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM County Commissioners
	 * @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM County Commissioners
	 */
	@Override
	public List<CrmCountyCommissioner> findByZipCode(
		String zipCode, int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {

		zipCode = Objects.toString(zipCode, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByZipCode;
			finderArgs = new Object[] {zipCode};
		}
		else {
			finderPath = _finderPathWithPaginationFindByZipCode;
			finderArgs = new Object[] {zipCode, start, end, orderByComparator};
		}

		List<CrmCountyCommissioner> list =
			(List<CrmCountyCommissioner>)finderCache.getResult(
				finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmCountyCommissioner crmCountyCommissioner : list) {
				if (!zipCode.equals(crmCountyCommissioner.getZipCode())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CRMCOUNTYCOMMISSIONER_WHERE);

			boolean bindZipCode = false;

			if (zipCode.isEmpty()) {
				query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_3);
			}
			else {
				bindZipCode = true;

				query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(CrmCountyCommissionerModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmCountyCommissioner>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmCountyCommissioner>)QueryUtil.list(
						q, getDialect(), start, end);
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
	 * Returns the first CRM County Commissioner in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM County Commissioner
	 * @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner findByZipCode_First(
			String zipCode,
			OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException {

		CrmCountyCommissioner crmCountyCommissioner = fetchByZipCode_First(
			zipCode, orderByComparator);

		if (crmCountyCommissioner != null) {
			return crmCountyCommissioner;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append("}");

		throw new NoSuchCrmCountyCommissionerException(msg.toString());
	}

	/**
	 * Returns the first CRM County Commissioner in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner fetchByZipCode_First(
		String zipCode,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {

		List<CrmCountyCommissioner> list = findByZipCode(
			zipCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM County Commissioner in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM County Commissioner
	 * @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner findByZipCode_Last(
			String zipCode,
			OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException {

		CrmCountyCommissioner crmCountyCommissioner = fetchByZipCode_Last(
			zipCode, orderByComparator);

		if (crmCountyCommissioner != null) {
			return crmCountyCommissioner;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append("}");

		throw new NoSuchCrmCountyCommissionerException(msg.toString());
	}

	/**
	 * Returns the last CRM County Commissioner in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	 */
	@Override
	public CrmCountyCommissioner fetchByZipCode_Last(
		String zipCode,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {

		int count = countByZipCode(zipCode);

		if (count == 0) {
			return null;
		}

		List<CrmCountyCommissioner> list = findByZipCode(
			zipCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM County Commissioners before and after the current CRM County Commissioner in the ordered set where zipCode = &#63;.
	 *
	 * @param crmCountyCommissionerOrBoardDistId the primary key of the current CRM County Commissioner
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM County Commissioner
	 * @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	 */
	@Override
	public CrmCountyCommissioner[] findByZipCode_PrevAndNext(
			long crmCountyCommissionerOrBoardDistId, String zipCode,
			OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException {

		zipCode = Objects.toString(zipCode, "");

		CrmCountyCommissioner crmCountyCommissioner = findByPrimaryKey(
			crmCountyCommissionerOrBoardDistId);

		Session session = null;

		try {
			session = openSession();

			CrmCountyCommissioner[] array = new CrmCountyCommissionerImpl[3];

			array[0] = getByZipCode_PrevAndNext(
				session, crmCountyCommissioner, zipCode, orderByComparator,
				true);

			array[1] = crmCountyCommissioner;

			array[2] = getByZipCode_PrevAndNext(
				session, crmCountyCommissioner, zipCode, orderByComparator,
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

	protected CrmCountyCommissioner getByZipCode_PrevAndNext(
		Session session, CrmCountyCommissioner crmCountyCommissioner,
		String zipCode,
		OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMCOUNTYCOMMISSIONER_WHERE);

		boolean bindZipCode = false;

		if (zipCode.isEmpty()) {
			query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_3);
		}
		else {
			bindZipCode = true;

			query.append(_FINDER_COLUMN_ZIPCODE_ZIPCODE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

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
			query.append(CrmCountyCommissionerModelImpl.ORDER_BY_JPQL);
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
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						crmCountyCommissioner)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CrmCountyCommissioner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM County Commissioners where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	@Override
	public void removeByZipCode(String zipCode) {
		for (CrmCountyCommissioner crmCountyCommissioner :
				findByZipCode(
					zipCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(crmCountyCommissioner);
		}
	}

	/**
	 * Returns the number of CRM County Commissioners where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching CRM County Commissioners
	 */
	@Override
	public int countByZipCode(String zipCode) {
		zipCode = Objects.toString(zipCode, "");

		FinderPath finderPath = _finderPathCountByZipCode;

		Object[] finderArgs = new Object[] {zipCode};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCOUNTYCOMMISSIONER_WHERE);

			boolean bindZipCode = false;

			if (zipCode.isEmpty()) {
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

	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_2 =
		"crmCountyCommissioner.zipCode = ?";

	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_3 =
		"(crmCountyCommissioner.zipCode IS NULL OR crmCountyCommissioner.zipCode = '')";

	public CrmCountyCommissionerPersistenceImpl() {
		setModelClass(CrmCountyCommissioner.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("number", "number_");

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
				"_dbColumnNames");

			field.setAccessible(true);

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the CRM County Commissioner in the entity cache if it is enabled.
	 *
	 * @param crmCountyCommissioner the CRM County Commissioner
	 */
	@Override
	public void cacheResult(CrmCountyCommissioner crmCountyCommissioner) {
		entityCache.putResult(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class,
			crmCountyCommissioner.getPrimaryKey(), crmCountyCommissioner);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				crmCountyCommissioner.getUuid(),
				crmCountyCommissioner.getGroupId()
			},
			crmCountyCommissioner);

		crmCountyCommissioner.resetOriginalValues();
	}

	/**
	 * Caches the CRM County Commissioners in the entity cache if it is enabled.
	 *
	 * @param crmCountyCommissioners the CRM County Commissioners
	 */
	@Override
	public void cacheResult(
		List<CrmCountyCommissioner> crmCountyCommissioners) {

		for (CrmCountyCommissioner crmCountyCommissioner :
				crmCountyCommissioners) {

			if (entityCache.getResult(
					CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
					CrmCountyCommissionerImpl.class,
					crmCountyCommissioner.getPrimaryKey()) == null) {

				cacheResult(crmCountyCommissioner);
			}
			else {
				crmCountyCommissioner.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM County Commissioners.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmCountyCommissionerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM County Commissioner.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmCountyCommissioner crmCountyCommissioner) {
		entityCache.removeResult(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class,
			crmCountyCommissioner.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(CrmCountyCommissionerModelImpl)crmCountyCommissioner, true);
	}

	@Override
	public void clearCache(List<CrmCountyCommissioner> crmCountyCommissioners) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmCountyCommissioner crmCountyCommissioner :
				crmCountyCommissioners) {

			entityCache.removeResult(
				CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
				CrmCountyCommissionerImpl.class,
				crmCountyCommissioner.getPrimaryKey());

			clearUniqueFindersCache(
				(CrmCountyCommissionerModelImpl)crmCountyCommissioner, true);
		}
	}

	protected void cacheUniqueFindersCache(
		CrmCountyCommissionerModelImpl crmCountyCommissionerModelImpl) {

		Object[] args = new Object[] {
			crmCountyCommissionerModelImpl.getUuid(),
			crmCountyCommissionerModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, crmCountyCommissionerModelImpl,
			false);
	}

	protected void clearUniqueFindersCache(
		CrmCountyCommissionerModelImpl crmCountyCommissionerModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				crmCountyCommissionerModelImpl.getUuid(),
				crmCountyCommissionerModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((crmCountyCommissionerModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				crmCountyCommissionerModelImpl.getOriginalUuid(),
				crmCountyCommissionerModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new CRM County Commissioner with the primary key. Does not add the CRM County Commissioner to the database.
	 *
	 * @param crmCountyCommissionerOrBoardDistId the primary key for the new CRM County Commissioner
	 * @return the new CRM County Commissioner
	 */
	@Override
	public CrmCountyCommissioner create(
		long crmCountyCommissionerOrBoardDistId) {

		CrmCountyCommissioner crmCountyCommissioner =
			new CrmCountyCommissionerImpl();

		crmCountyCommissioner.setNew(true);
		crmCountyCommissioner.setPrimaryKey(crmCountyCommissionerOrBoardDistId);

		String uuid = PortalUUIDUtil.generate();

		crmCountyCommissioner.setUuid(uuid);

		crmCountyCommissioner.setCompanyId(CompanyThreadLocal.getCompanyId());

		return crmCountyCommissioner;
	}

	/**
	 * Removes the CRM County Commissioner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmCountyCommissionerOrBoardDistId the primary key of the CRM County Commissioner
	 * @return the CRM County Commissioner that was removed
	 * @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	 */
	@Override
	public CrmCountyCommissioner remove(long crmCountyCommissionerOrBoardDistId)
		throws NoSuchCrmCountyCommissionerException {

		return remove((Serializable)crmCountyCommissionerOrBoardDistId);
	}

	/**
	 * Removes the CRM County Commissioner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM County Commissioner
	 * @return the CRM County Commissioner that was removed
	 * @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	 */
	@Override
	public CrmCountyCommissioner remove(Serializable primaryKey)
		throws NoSuchCrmCountyCommissionerException {

		Session session = null;

		try {
			session = openSession();

			CrmCountyCommissioner crmCountyCommissioner =
				(CrmCountyCommissioner)session.get(
					CrmCountyCommissionerImpl.class, primaryKey);

			if (crmCountyCommissioner == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmCountyCommissionerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(crmCountyCommissioner);
		}
		catch (NoSuchCrmCountyCommissionerException nsee) {
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
	protected CrmCountyCommissioner removeImpl(
		CrmCountyCommissioner crmCountyCommissioner) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmCountyCommissioner)) {
				crmCountyCommissioner = (CrmCountyCommissioner)session.get(
					CrmCountyCommissionerImpl.class,
					crmCountyCommissioner.getPrimaryKeyObj());
			}

			if (crmCountyCommissioner != null) {
				session.delete(crmCountyCommissioner);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmCountyCommissioner != null) {
			clearCache(crmCountyCommissioner);
		}

		return crmCountyCommissioner;
	}

	@Override
	public CrmCountyCommissioner updateImpl(
		CrmCountyCommissioner crmCountyCommissioner) {

		boolean isNew = crmCountyCommissioner.isNew();

		if (!(crmCountyCommissioner instanceof
				CrmCountyCommissionerModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(crmCountyCommissioner.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					crmCountyCommissioner);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in crmCountyCommissioner proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CrmCountyCommissioner implementation " +
					crmCountyCommissioner.getClass());
		}

		CrmCountyCommissionerModelImpl crmCountyCommissionerModelImpl =
			(CrmCountyCommissionerModelImpl)crmCountyCommissioner;

		if (Validator.isNull(crmCountyCommissioner.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmCountyCommissioner.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmCountyCommissioner.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmCountyCommissioner.setCreateDate(now);
			}
			else {
				crmCountyCommissioner.setCreateDate(
					serviceContext.getCreateDate(now));
			}
		}

		if (!crmCountyCommissionerModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmCountyCommissioner.setModifiedDate(now);
			}
			else {
				crmCountyCommissioner.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmCountyCommissioner.isNew()) {
				session.save(crmCountyCommissioner);

				crmCountyCommissioner.setNew(false);
			}
			else {
				crmCountyCommissioner = (CrmCountyCommissioner)session.merge(
					crmCountyCommissioner);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmCountyCommissionerModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {
				crmCountyCommissionerModelImpl.getUuid()
			};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				crmCountyCommissionerModelImpl.getUuid(),
				crmCountyCommissionerModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {crmCountyCommissionerModelImpl.getZipCode()};

			finderCache.removeResult(_finderPathCountByZipCode, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByZipCode, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((crmCountyCommissionerModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crmCountyCommissionerModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {crmCountyCommissionerModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((crmCountyCommissionerModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crmCountyCommissionerModelImpl.getOriginalUuid(),
					crmCountyCommissionerModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					crmCountyCommissionerModelImpl.getUuid(),
					crmCountyCommissionerModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((crmCountyCommissionerModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByZipCode.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					crmCountyCommissionerModelImpl.getOriginalZipCode()
				};

				finderCache.removeResult(_finderPathCountByZipCode, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByZipCode, args);

				args = new Object[] {
					crmCountyCommissionerModelImpl.getZipCode()
				};

				finderCache.removeResult(_finderPathCountByZipCode, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByZipCode, args);
			}
		}

		entityCache.putResult(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class,
			crmCountyCommissioner.getPrimaryKey(), crmCountyCommissioner,
			false);

		clearUniqueFindersCache(crmCountyCommissionerModelImpl, false);
		cacheUniqueFindersCache(crmCountyCommissionerModelImpl);

		crmCountyCommissioner.resetOriginalValues();

		return crmCountyCommissioner;
	}

	/**
	 * Returns the CRM County Commissioner with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM County Commissioner
	 * @return the CRM County Commissioner
	 * @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	 */
	@Override
	public CrmCountyCommissioner findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmCountyCommissionerException {

		CrmCountyCommissioner crmCountyCommissioner = fetchByPrimaryKey(
			primaryKey);

		if (crmCountyCommissioner == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmCountyCommissionerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return crmCountyCommissioner;
	}

	/**
	 * Returns the CRM County Commissioner with the primary key or throws a <code>NoSuchCrmCountyCommissionerException</code> if it could not be found.
	 *
	 * @param crmCountyCommissionerOrBoardDistId the primary key of the CRM County Commissioner
	 * @return the CRM County Commissioner
	 * @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	 */
	@Override
	public CrmCountyCommissioner findByPrimaryKey(
			long crmCountyCommissionerOrBoardDistId)
		throws NoSuchCrmCountyCommissionerException {

		return findByPrimaryKey(
			(Serializable)crmCountyCommissionerOrBoardDistId);
	}

	/**
	 * Returns the CRM County Commissioner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM County Commissioner
	 * @return the CRM County Commissioner, or <code>null</code> if a CRM County Commissioner with the primary key could not be found
	 */
	@Override
	public CrmCountyCommissioner fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmCountyCommissioner crmCountyCommissioner =
			(CrmCountyCommissioner)serializable;

		if (crmCountyCommissioner == null) {
			Session session = null;

			try {
				session = openSession();

				crmCountyCommissioner = (CrmCountyCommissioner)session.get(
					CrmCountyCommissionerImpl.class, primaryKey);

				if (crmCountyCommissioner != null) {
					cacheResult(crmCountyCommissioner);
				}
				else {
					entityCache.putResult(
						CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
						CrmCountyCommissionerImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(
					CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
					CrmCountyCommissionerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmCountyCommissioner;
	}

	/**
	 * Returns the CRM County Commissioner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmCountyCommissionerOrBoardDistId the primary key of the CRM County Commissioner
	 * @return the CRM County Commissioner, or <code>null</code> if a CRM County Commissioner with the primary key could not be found
	 */
	@Override
	public CrmCountyCommissioner fetchByPrimaryKey(
		long crmCountyCommissionerOrBoardDistId) {

		return fetchByPrimaryKey(
			(Serializable)crmCountyCommissionerOrBoardDistId);
	}

	@Override
	public Map<Serializable, CrmCountyCommissioner> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmCountyCommissioner> map =
			new HashMap<Serializable, CrmCountyCommissioner>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmCountyCommissioner crmCountyCommissioner = fetchByPrimaryKey(
				primaryKey);

			if (crmCountyCommissioner != null) {
				map.put(primaryKey, crmCountyCommissioner);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
				CrmCountyCommissionerImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmCountyCommissioner)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler(
			uncachedPrimaryKeys.size() * 2 + 1);

		query.append(_SQL_SELECT_CRMCOUNTYCOMMISSIONER_WHERE_PKS_IN);

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

			for (CrmCountyCommissioner crmCountyCommissioner :
					(List<CrmCountyCommissioner>)q.list()) {

				map.put(
					crmCountyCommissioner.getPrimaryKeyObj(),
					crmCountyCommissioner);

				cacheResult(crmCountyCommissioner);

				uncachedPrimaryKeys.remove(
					crmCountyCommissioner.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
					CrmCountyCommissionerImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM County Commissioners.
	 *
	 * @return the CRM County Commissioners
	 */
	@Override
	public List<CrmCountyCommissioner> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM County Commissioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCountyCommissionerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM County Commissioners
	 * @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	 * @return the range of CRM County Commissioners
	 */
	@Override
	public List<CrmCountyCommissioner> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM County Commissioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCountyCommissionerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of CRM County Commissioners
	 * @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of CRM County Commissioners
	 */
	@Deprecated
	@Override
	public List<CrmCountyCommissioner> findAll(
		int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM County Commissioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCountyCommissionerModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM County Commissioners
	 * @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM County Commissioners
	 */
	@Override
	public List<CrmCountyCommissioner> findAll(
		int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindAll;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<CrmCountyCommissioner> list =
			(List<CrmCountyCommissioner>)finderCache.getResult(
				finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMCOUNTYCOMMISSIONER);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMCOUNTYCOMMISSIONER;

				if (pagination) {
					sql = sql.concat(
						CrmCountyCommissionerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmCountyCommissioner>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmCountyCommissioner>)QueryUtil.list(
						q, getDialect(), start, end);
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
	 * Removes all the CRM County Commissioners from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmCountyCommissioner crmCountyCommissioner : findAll()) {
			remove(crmCountyCommissioner);
		}
	}

	/**
	 * Returns the number of CRM County Commissioners.
	 *
	 * @return the number of CRM County Commissioners
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMCOUNTYCOMMISSIONER);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

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
		return CrmCountyCommissionerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM County Commissioner persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			CrmCountyCommissionerModelImpl.UUID_COLUMN_BITMASK |
			CrmCountyCommissionerModelImpl.NUMBER_COLUMN_BITMASK |
			CrmCountyCommissionerModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			CrmCountyCommissionerModelImpl.UUID_COLUMN_BITMASK |
			CrmCountyCommissionerModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			CrmCountyCommissionerModelImpl.UUID_COLUMN_BITMASK |
			CrmCountyCommissionerModelImpl.COMPANYID_COLUMN_BITMASK |
			CrmCountyCommissionerModelImpl.NUMBER_COLUMN_BITMASK |
			CrmCountyCommissionerModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByZipCode = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByZipCode",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByZipCode = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED,
			CrmCountyCommissionerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByZipCode",
			new String[] {String.class.getName()},
			CrmCountyCommissionerModelImpl.ZIPCODE_COLUMN_BITMASK |
			CrmCountyCommissionerModelImpl.NUMBER_COLUMN_BITMASK |
			CrmCountyCommissionerModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByZipCode = new FinderPath(
			CrmCountyCommissionerModelImpl.ENTITY_CACHE_ENABLED,
			CrmCountyCommissionerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByZipCode",
			new String[] {String.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(CrmCountyCommissionerImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CRMCOUNTYCOMMISSIONER =
		"SELECT crmCountyCommissioner FROM CrmCountyCommissioner crmCountyCommissioner";

	private static final String _SQL_SELECT_CRMCOUNTYCOMMISSIONER_WHERE_PKS_IN =
		"SELECT crmCountyCommissioner FROM CrmCountyCommissioner crmCountyCommissioner WHERE crmCountyCommissionerOrBoardDistId IN (";

	private static final String _SQL_SELECT_CRMCOUNTYCOMMISSIONER_WHERE =
		"SELECT crmCountyCommissioner FROM CrmCountyCommissioner crmCountyCommissioner WHERE ";

	private static final String _SQL_COUNT_CRMCOUNTYCOMMISSIONER =
		"SELECT COUNT(crmCountyCommissioner) FROM CrmCountyCommissioner crmCountyCommissioner";

	private static final String _SQL_COUNT_CRMCOUNTYCOMMISSIONER_WHERE =
		"SELECT COUNT(crmCountyCommissioner) FROM CrmCountyCommissioner crmCountyCommissioner WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"crmCountyCommissioner.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CrmCountyCommissioner exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CrmCountyCommissioner exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CrmCountyCommissionerPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "number"});

}