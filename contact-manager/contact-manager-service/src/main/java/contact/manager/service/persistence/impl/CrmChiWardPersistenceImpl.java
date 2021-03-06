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

import contact.manager.exception.NoSuchCrmChiWardException;
import contact.manager.model.CrmChiWard;
import contact.manager.model.impl.CrmChiWardImpl;
import contact.manager.model.impl.CrmChiWardModelImpl;
import contact.manager.service.persistence.CrmChiWardPersistence;

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
 * The persistence implementation for the CRM Chi Ward service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CrmChiWardPersistenceImpl
	extends BasePersistenceImpl<CrmChiWard> implements CrmChiWardPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CrmChiWardUtil</code> to access the CRM Chi Ward persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CrmChiWardImpl.class.getName();

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
	 * Returns all the CRM Chi Wards where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Chi Wards
	 */
	@Override
	public List<CrmChiWard> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Chi Wards where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmChiWardModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Chi Wards
	 * @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	 * @return the range of matching CRM Chi Wards
	 */
	@Override
	public List<CrmChiWard> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Chi Wards where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmChiWardModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Chi Wards
	 * @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Chi Wards
	 */
	@Deprecated
	@Override
	public List<CrmChiWard> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmChiWard> orderByComparator,
		boolean useFinderCache) {

		return findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Chi Wards where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmChiWardModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Chi Wards
	 * @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Chi Wards
	 */
	@Override
	public List<CrmChiWard> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmChiWard> orderByComparator) {

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

		List<CrmChiWard> list = (List<CrmChiWard>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmChiWard crmChiWard : list) {
				if (!uuid.equals(crmChiWard.getUuid())) {
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

			query.append(_SQL_SELECT_CRMCHIWARD_WHERE);

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
				query.append(CrmChiWardModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmChiWard>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmChiWard>)QueryUtil.list(
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
	 * Returns the first CRM Chi Ward in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Chi Ward
	 * @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard findByUuid_First(
			String uuid, OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException {

		CrmChiWard crmChiWard = fetchByUuid_First(uuid, orderByComparator);

		if (crmChiWard != null) {
			return crmChiWard;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmChiWardException(msg.toString());
	}

	/**
	 * Returns the first CRM Chi Ward in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard fetchByUuid_First(
		String uuid, OrderByComparator<CrmChiWard> orderByComparator) {

		List<CrmChiWard> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Chi Ward in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Chi Ward
	 * @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard findByUuid_Last(
			String uuid, OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException {

		CrmChiWard crmChiWard = fetchByUuid_Last(uuid, orderByComparator);

		if (crmChiWard != null) {
			return crmChiWard;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmChiWardException(msg.toString());
	}

	/**
	 * Returns the last CRM Chi Ward in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard fetchByUuid_Last(
		String uuid, OrderByComparator<CrmChiWard> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmChiWard> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Chi Wards before and after the current CRM Chi Ward in the ordered set where uuid = &#63;.
	 *
	 * @param crmChiWardId the primary key of the current CRM Chi Ward
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Chi Ward
	 * @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	 */
	@Override
	public CrmChiWard[] findByUuid_PrevAndNext(
			long crmChiWardId, String uuid,
			OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException {

		uuid = Objects.toString(uuid, "");

		CrmChiWard crmChiWard = findByPrimaryKey(crmChiWardId);

		Session session = null;

		try {
			session = openSession();

			CrmChiWard[] array = new CrmChiWardImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, crmChiWard, uuid, orderByComparator, true);

			array[1] = crmChiWard;

			array[2] = getByUuid_PrevAndNext(
				session, crmChiWard, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmChiWard getByUuid_PrevAndNext(
		Session session, CrmChiWard crmChiWard, String uuid,
		OrderByComparator<CrmChiWard> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMCHIWARD_WHERE);

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
			query.append(CrmChiWardModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(crmChiWard)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CrmChiWard> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Chi Wards where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmChiWard crmChiWard :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(crmChiWard);
		}
	}

	/**
	 * Returns the number of CRM Chi Wards where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Chi Wards
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCHIWARD_WHERE);

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
		"crmChiWard.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(crmChiWard.uuid IS NULL OR crmChiWard.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the CRM Chi Ward where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCrmChiWardException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Chi Ward
	 * @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmChiWardException {

		CrmChiWard crmChiWard = fetchByUUID_G(uuid, groupId);

		if (crmChiWard == null) {
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

			throw new NoSuchCrmChiWardException(msg.toString());
		}

		return crmChiWard;
	}

	/**
	 * Returns the CRM Chi Ward where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	 */
	@Deprecated
	@Override
	public CrmChiWard fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the CRM Chi Ward where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard fetchByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = new Object[] {uuid, groupId};

		Object result = finderCache.getResult(
			_finderPathFetchByUUID_G, finderArgs, this);

		if (result instanceof CrmChiWard) {
			CrmChiWard crmChiWard = (CrmChiWard)result;

			if (!Objects.equals(uuid, crmChiWard.getUuid()) ||
				(groupId != crmChiWard.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMCHIWARD_WHERE);

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

				List<CrmChiWard> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(
						_finderPathFetchByUUID_G, finderArgs, list);
				}
				else {
					CrmChiWard crmChiWard = list.get(0);

					result = crmChiWard;

					cacheResult(crmChiWard);
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
			return (CrmChiWard)result;
		}
	}

	/**
	 * Removes the CRM Chi Ward where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Chi Ward that was removed
	 */
	@Override
	public CrmChiWard removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmChiWardException {

		CrmChiWard crmChiWard = findByUUID_G(uuid, groupId);

		return remove(crmChiWard);
	}

	/**
	 * Returns the number of CRM Chi Wards where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Chi Wards
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCHIWARD_WHERE);

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
		"crmChiWard.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(crmChiWard.uuid IS NULL OR crmChiWard.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"crmChiWard.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the CRM Chi Wards where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Chi Wards
	 */
	@Override
	public List<CrmChiWard> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Chi Wards where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmChiWardModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Chi Wards
	 * @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	 * @return the range of matching CRM Chi Wards
	 */
	@Override
	public List<CrmChiWard> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Chi Wards where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmChiWardModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Chi Wards
	 * @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Chi Wards
	 */
	@Deprecated
	@Override
	public List<CrmChiWard> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmChiWard> orderByComparator,
		boolean useFinderCache) {

		return findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Chi Wards where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmChiWardModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Chi Wards
	 * @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Chi Wards
	 */
	@Override
	public List<CrmChiWard> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmChiWard> orderByComparator) {

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

		List<CrmChiWard> list = (List<CrmChiWard>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmChiWard crmChiWard : list) {
				if (!uuid.equals(crmChiWard.getUuid()) ||
					(companyId != crmChiWard.getCompanyId())) {

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

			query.append(_SQL_SELECT_CRMCHIWARD_WHERE);

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
				query.append(CrmChiWardModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmChiWard>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmChiWard>)QueryUtil.list(
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
	 * Returns the first CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Chi Ward
	 * @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException {

		CrmChiWard crmChiWard = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (crmChiWard != null) {
			return crmChiWard;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmChiWardException(msg.toString());
	}

	/**
	 * Returns the first CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CrmChiWard> orderByComparator) {

		List<CrmChiWard> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Chi Ward
	 * @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException {

		CrmChiWard crmChiWard = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (crmChiWard != null) {
			return crmChiWard;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmChiWardException(msg.toString());
	}

	/**
	 * Returns the last CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CrmChiWard> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmChiWard> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Chi Wards before and after the current CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmChiWardId the primary key of the current CRM Chi Ward
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Chi Ward
	 * @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	 */
	@Override
	public CrmChiWard[] findByUuid_C_PrevAndNext(
			long crmChiWardId, String uuid, long companyId,
			OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException {

		uuid = Objects.toString(uuid, "");

		CrmChiWard crmChiWard = findByPrimaryKey(crmChiWardId);

		Session session = null;

		try {
			session = openSession();

			CrmChiWard[] array = new CrmChiWardImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, crmChiWard, uuid, companyId, orderByComparator, true);

			array[1] = crmChiWard;

			array[2] = getByUuid_C_PrevAndNext(
				session, crmChiWard, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmChiWard getByUuid_C_PrevAndNext(
		Session session, CrmChiWard crmChiWard, String uuid, long companyId,
		OrderByComparator<CrmChiWard> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMCHIWARD_WHERE);

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
			query.append(CrmChiWardModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(crmChiWard)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CrmChiWard> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Chi Wards where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmChiWard crmChiWard :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(crmChiWard);
		}
	}

	/**
	 * Returns the number of CRM Chi Wards where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Chi Wards
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCHIWARD_WHERE);

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
		"crmChiWard.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(crmChiWard.uuid IS NULL OR crmChiWard.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"crmChiWard.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByZipCode;
	private FinderPath _finderPathWithoutPaginationFindByZipCode;
	private FinderPath _finderPathCountByZipCode;

	/**
	 * Returns all the CRM Chi Wards where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching CRM Chi Wards
	 */
	@Override
	public List<CrmChiWard> findByZipCode(String zipCode) {
		return findByZipCode(
			zipCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Chi Wards where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmChiWardModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM Chi Wards
	 * @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	 * @return the range of matching CRM Chi Wards
	 */
	@Override
	public List<CrmChiWard> findByZipCode(String zipCode, int start, int end) {
		return findByZipCode(zipCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Chi Wards where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmChiWardModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByZipCode(String, int, int, OrderByComparator)}
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM Chi Wards
	 * @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Chi Wards
	 */
	@Deprecated
	@Override
	public List<CrmChiWard> findByZipCode(
		String zipCode, int start, int end,
		OrderByComparator<CrmChiWard> orderByComparator,
		boolean useFinderCache) {

		return findByZipCode(zipCode, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Chi Wards where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmChiWardModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM Chi Wards
	 * @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Chi Wards
	 */
	@Override
	public List<CrmChiWard> findByZipCode(
		String zipCode, int start, int end,
		OrderByComparator<CrmChiWard> orderByComparator) {

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

		List<CrmChiWard> list = (List<CrmChiWard>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmChiWard crmChiWard : list) {
				if (!zipCode.equals(crmChiWard.getZipCode())) {
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

			query.append(_SQL_SELECT_CRMCHIWARD_WHERE);

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
				query.append(CrmChiWardModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmChiWard>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmChiWard>)QueryUtil.list(
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
	 * Returns the first CRM Chi Ward in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Chi Ward
	 * @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard findByZipCode_First(
			String zipCode, OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException {

		CrmChiWard crmChiWard = fetchByZipCode_First(
			zipCode, orderByComparator);

		if (crmChiWard != null) {
			return crmChiWard;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append("}");

		throw new NoSuchCrmChiWardException(msg.toString());
	}

	/**
	 * Returns the first CRM Chi Ward in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard fetchByZipCode_First(
		String zipCode, OrderByComparator<CrmChiWard> orderByComparator) {

		List<CrmChiWard> list = findByZipCode(zipCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Chi Ward in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Chi Ward
	 * @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard findByZipCode_Last(
			String zipCode, OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException {

		CrmChiWard crmChiWard = fetchByZipCode_Last(zipCode, orderByComparator);

		if (crmChiWard != null) {
			return crmChiWard;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("zipCode=");
		msg.append(zipCode);

		msg.append("}");

		throw new NoSuchCrmChiWardException(msg.toString());
	}

	/**
	 * Returns the last CRM Chi Ward in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	 */
	@Override
	public CrmChiWard fetchByZipCode_Last(
		String zipCode, OrderByComparator<CrmChiWard> orderByComparator) {

		int count = countByZipCode(zipCode);

		if (count == 0) {
			return null;
		}

		List<CrmChiWard> list = findByZipCode(
			zipCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Chi Wards before and after the current CRM Chi Ward in the ordered set where zipCode = &#63;.
	 *
	 * @param crmChiWardId the primary key of the current CRM Chi Ward
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Chi Ward
	 * @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	 */
	@Override
	public CrmChiWard[] findByZipCode_PrevAndNext(
			long crmChiWardId, String zipCode,
			OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException {

		zipCode = Objects.toString(zipCode, "");

		CrmChiWard crmChiWard = findByPrimaryKey(crmChiWardId);

		Session session = null;

		try {
			session = openSession();

			CrmChiWard[] array = new CrmChiWardImpl[3];

			array[0] = getByZipCode_PrevAndNext(
				session, crmChiWard, zipCode, orderByComparator, true);

			array[1] = crmChiWard;

			array[2] = getByZipCode_PrevAndNext(
				session, crmChiWard, zipCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmChiWard getByZipCode_PrevAndNext(
		Session session, CrmChiWard crmChiWard, String zipCode,
		OrderByComparator<CrmChiWard> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMCHIWARD_WHERE);

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
			query.append(CrmChiWardModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(crmChiWard)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CrmChiWard> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Chi Wards where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	@Override
	public void removeByZipCode(String zipCode) {
		for (CrmChiWard crmChiWard :
				findByZipCode(
					zipCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(crmChiWard);
		}
	}

	/**
	 * Returns the number of CRM Chi Wards where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching CRM Chi Wards
	 */
	@Override
	public int countByZipCode(String zipCode) {
		zipCode = Objects.toString(zipCode, "");

		FinderPath finderPath = _finderPathCountByZipCode;

		Object[] finderArgs = new Object[] {zipCode};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCHIWARD_WHERE);

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
		"crmChiWard.zipCode = ?";

	private static final String _FINDER_COLUMN_ZIPCODE_ZIPCODE_3 =
		"(crmChiWard.zipCode IS NULL OR crmChiWard.zipCode = '')";

	public CrmChiWardPersistenceImpl() {
		setModelClass(CrmChiWard.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

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
	 * Caches the CRM Chi Ward in the entity cache if it is enabled.
	 *
	 * @param crmChiWard the CRM Chi Ward
	 */
	@Override
	public void cacheResult(CrmChiWard crmChiWard) {
		entityCache.putResult(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED, CrmChiWardImpl.class,
			crmChiWard.getPrimaryKey(), crmChiWard);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {crmChiWard.getUuid(), crmChiWard.getGroupId()},
			crmChiWard);

		crmChiWard.resetOriginalValues();
	}

	/**
	 * Caches the CRM Chi Wards in the entity cache if it is enabled.
	 *
	 * @param crmChiWards the CRM Chi Wards
	 */
	@Override
	public void cacheResult(List<CrmChiWard> crmChiWards) {
		for (CrmChiWard crmChiWard : crmChiWards) {
			if (entityCache.getResult(
					CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
					CrmChiWardImpl.class, crmChiWard.getPrimaryKey()) == null) {

				cacheResult(crmChiWard);
			}
			else {
				crmChiWard.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM Chi Wards.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmChiWardImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM Chi Ward.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmChiWard crmChiWard) {
		entityCache.removeResult(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED, CrmChiWardImpl.class,
			crmChiWard.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmChiWardModelImpl)crmChiWard, true);
	}

	@Override
	public void clearCache(List<CrmChiWard> crmChiWards) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmChiWard crmChiWard : crmChiWards) {
			entityCache.removeResult(
				CrmChiWardModelImpl.ENTITY_CACHE_ENABLED, CrmChiWardImpl.class,
				crmChiWard.getPrimaryKey());

			clearUniqueFindersCache((CrmChiWardModelImpl)crmChiWard, true);
		}
	}

	protected void cacheUniqueFindersCache(
		CrmChiWardModelImpl crmChiWardModelImpl) {

		Object[] args = new Object[] {
			crmChiWardModelImpl.getUuid(), crmChiWardModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, crmChiWardModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmChiWardModelImpl crmChiWardModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				crmChiWardModelImpl.getUuid(), crmChiWardModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((crmChiWardModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				crmChiWardModelImpl.getOriginalUuid(),
				crmChiWardModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new CRM Chi Ward with the primary key. Does not add the CRM Chi Ward to the database.
	 *
	 * @param crmChiWardId the primary key for the new CRM Chi Ward
	 * @return the new CRM Chi Ward
	 */
	@Override
	public CrmChiWard create(long crmChiWardId) {
		CrmChiWard crmChiWard = new CrmChiWardImpl();

		crmChiWard.setNew(true);
		crmChiWard.setPrimaryKey(crmChiWardId);

		String uuid = PortalUUIDUtil.generate();

		crmChiWard.setUuid(uuid);

		crmChiWard.setCompanyId(CompanyThreadLocal.getCompanyId());

		return crmChiWard;
	}

	/**
	 * Removes the CRM Chi Ward with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmChiWardId the primary key of the CRM Chi Ward
	 * @return the CRM Chi Ward that was removed
	 * @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	 */
	@Override
	public CrmChiWard remove(long crmChiWardId)
		throws NoSuchCrmChiWardException {

		return remove((Serializable)crmChiWardId);
	}

	/**
	 * Removes the CRM Chi Ward with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM Chi Ward
	 * @return the CRM Chi Ward that was removed
	 * @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	 */
	@Override
	public CrmChiWard remove(Serializable primaryKey)
		throws NoSuchCrmChiWardException {

		Session session = null;

		try {
			session = openSession();

			CrmChiWard crmChiWard = (CrmChiWard)session.get(
				CrmChiWardImpl.class, primaryKey);

			if (crmChiWard == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmChiWardException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(crmChiWard);
		}
		catch (NoSuchCrmChiWardException nsee) {
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
	protected CrmChiWard removeImpl(CrmChiWard crmChiWard) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmChiWard)) {
				crmChiWard = (CrmChiWard)session.get(
					CrmChiWardImpl.class, crmChiWard.getPrimaryKeyObj());
			}

			if (crmChiWard != null) {
				session.delete(crmChiWard);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmChiWard != null) {
			clearCache(crmChiWard);
		}

		return crmChiWard;
	}

	@Override
	public CrmChiWard updateImpl(CrmChiWard crmChiWard) {
		boolean isNew = crmChiWard.isNew();

		if (!(crmChiWard instanceof CrmChiWardModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(crmChiWard.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(crmChiWard);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in crmChiWard proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CrmChiWard implementation " +
					crmChiWard.getClass());
		}

		CrmChiWardModelImpl crmChiWardModelImpl =
			(CrmChiWardModelImpl)crmChiWard;

		if (Validator.isNull(crmChiWard.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmChiWard.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmChiWard.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmChiWard.setCreateDate(now);
			}
			else {
				crmChiWard.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmChiWardModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmChiWard.setModifiedDate(now);
			}
			else {
				crmChiWard.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmChiWard.isNew()) {
				session.save(crmChiWard);

				crmChiWard.setNew(false);
			}
			else {
				crmChiWard = (CrmChiWard)session.merge(crmChiWard);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmChiWardModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {crmChiWardModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				crmChiWardModelImpl.getUuid(),
				crmChiWardModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {crmChiWardModelImpl.getZipCode()};

			finderCache.removeResult(_finderPathCountByZipCode, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByZipCode, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((crmChiWardModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crmChiWardModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {crmChiWardModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((crmChiWardModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crmChiWardModelImpl.getOriginalUuid(),
					crmChiWardModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					crmChiWardModelImpl.getUuid(),
					crmChiWardModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((crmChiWardModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByZipCode.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					crmChiWardModelImpl.getOriginalZipCode()
				};

				finderCache.removeResult(_finderPathCountByZipCode, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByZipCode, args);

				args = new Object[] {crmChiWardModelImpl.getZipCode()};

				finderCache.removeResult(_finderPathCountByZipCode, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByZipCode, args);
			}
		}

		entityCache.putResult(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED, CrmChiWardImpl.class,
			crmChiWard.getPrimaryKey(), crmChiWard, false);

		clearUniqueFindersCache(crmChiWardModelImpl, false);
		cacheUniqueFindersCache(crmChiWardModelImpl);

		crmChiWard.resetOriginalValues();

		return crmChiWard;
	}

	/**
	 * Returns the CRM Chi Ward with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Chi Ward
	 * @return the CRM Chi Ward
	 * @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	 */
	@Override
	public CrmChiWard findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmChiWardException {

		CrmChiWard crmChiWard = fetchByPrimaryKey(primaryKey);

		if (crmChiWard == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmChiWardException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return crmChiWard;
	}

	/**
	 * Returns the CRM Chi Ward with the primary key or throws a <code>NoSuchCrmChiWardException</code> if it could not be found.
	 *
	 * @param crmChiWardId the primary key of the CRM Chi Ward
	 * @return the CRM Chi Ward
	 * @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	 */
	@Override
	public CrmChiWard findByPrimaryKey(long crmChiWardId)
		throws NoSuchCrmChiWardException {

		return findByPrimaryKey((Serializable)crmChiWardId);
	}

	/**
	 * Returns the CRM Chi Ward with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Chi Ward
	 * @return the CRM Chi Ward, or <code>null</code> if a CRM Chi Ward with the primary key could not be found
	 */
	@Override
	public CrmChiWard fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED, CrmChiWardImpl.class,
			primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmChiWard crmChiWard = (CrmChiWard)serializable;

		if (crmChiWard == null) {
			Session session = null;

			try {
				session = openSession();

				crmChiWard = (CrmChiWard)session.get(
					CrmChiWardImpl.class, primaryKey);

				if (crmChiWard != null) {
					cacheResult(crmChiWard);
				}
				else {
					entityCache.putResult(
						CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
						CrmChiWardImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(
					CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
					CrmChiWardImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmChiWard;
	}

	/**
	 * Returns the CRM Chi Ward with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmChiWardId the primary key of the CRM Chi Ward
	 * @return the CRM Chi Ward, or <code>null</code> if a CRM Chi Ward with the primary key could not be found
	 */
	@Override
	public CrmChiWard fetchByPrimaryKey(long crmChiWardId) {
		return fetchByPrimaryKey((Serializable)crmChiWardId);
	}

	@Override
	public Map<Serializable, CrmChiWard> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmChiWard> map =
			new HashMap<Serializable, CrmChiWard>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmChiWard crmChiWard = fetchByPrimaryKey(primaryKey);

			if (crmChiWard != null) {
				map.put(primaryKey, crmChiWard);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				CrmChiWardModelImpl.ENTITY_CACHE_ENABLED, CrmChiWardImpl.class,
				primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmChiWard)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler(
			uncachedPrimaryKeys.size() * 2 + 1);

		query.append(_SQL_SELECT_CRMCHIWARD_WHERE_PKS_IN);

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

			for (CrmChiWard crmChiWard : (List<CrmChiWard>)q.list()) {
				map.put(crmChiWard.getPrimaryKeyObj(), crmChiWard);

				cacheResult(crmChiWard);

				uncachedPrimaryKeys.remove(crmChiWard.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
					CrmChiWardImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM Chi Wards.
	 *
	 * @return the CRM Chi Wards
	 */
	@Override
	public List<CrmChiWard> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Chi Wards.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmChiWardModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Chi Wards
	 * @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	 * @return the range of CRM Chi Wards
	 */
	@Override
	public List<CrmChiWard> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Chi Wards.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmChiWardModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of CRM Chi Wards
	 * @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of CRM Chi Wards
	 */
	@Deprecated
	@Override
	public List<CrmChiWard> findAll(
		int start, int end, OrderByComparator<CrmChiWard> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Chi Wards.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmChiWardModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Chi Wards
	 * @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Chi Wards
	 */
	@Override
	public List<CrmChiWard> findAll(
		int start, int end, OrderByComparator<CrmChiWard> orderByComparator) {

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

		List<CrmChiWard> list = (List<CrmChiWard>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMCHIWARD);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMCHIWARD;

				if (pagination) {
					sql = sql.concat(CrmChiWardModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmChiWard>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmChiWard>)QueryUtil.list(
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
	 * Removes all the CRM Chi Wards from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmChiWard crmChiWard : findAll()) {
			remove(crmChiWard);
		}
	}

	/**
	 * Returns the number of CRM Chi Wards.
	 *
	 * @return the number of CRM Chi Wards
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMCHIWARD);

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
		return CrmChiWardModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM Chi Ward persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, CrmChiWardImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, CrmChiWardImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, CrmChiWardImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, CrmChiWardImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			CrmChiWardModelImpl.UUID_COLUMN_BITMASK |
			CrmChiWardModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, CrmChiWardImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			CrmChiWardModelImpl.UUID_COLUMN_BITMASK |
			CrmChiWardModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, CrmChiWardImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, CrmChiWardImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			CrmChiWardModelImpl.UUID_COLUMN_BITMASK |
			CrmChiWardModelImpl.COMPANYID_COLUMN_BITMASK |
			CrmChiWardModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByZipCode = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, CrmChiWardImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByZipCode",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByZipCode = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, CrmChiWardImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByZipCode",
			new String[] {String.class.getName()},
			CrmChiWardModelImpl.ZIPCODE_COLUMN_BITMASK |
			CrmChiWardModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByZipCode = new FinderPath(
			CrmChiWardModelImpl.ENTITY_CACHE_ENABLED,
			CrmChiWardModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByZipCode",
			new String[] {String.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(CrmChiWardImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CRMCHIWARD =
		"SELECT crmChiWard FROM CrmChiWard crmChiWard";

	private static final String _SQL_SELECT_CRMCHIWARD_WHERE_PKS_IN =
		"SELECT crmChiWard FROM CrmChiWard crmChiWard WHERE crmChiWardId IN (";

	private static final String _SQL_SELECT_CRMCHIWARD_WHERE =
		"SELECT crmChiWard FROM CrmChiWard crmChiWard WHERE ";

	private static final String _SQL_COUNT_CRMCHIWARD =
		"SELECT COUNT(crmChiWard) FROM CrmChiWard crmChiWard";

	private static final String _SQL_COUNT_CRMCHIWARD_WHERE =
		"SELECT COUNT(crmChiWard) FROM CrmChiWard crmChiWard WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "crmChiWard.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CrmChiWard exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CrmChiWard exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CrmChiWardPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}