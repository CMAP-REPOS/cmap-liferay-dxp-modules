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

import com.liferay.portal.kernel.bean.BeanReference;
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
import com.liferay.portal.kernel.service.persistence.impl.TableMapper;
import com.liferay.portal.kernel.service.persistence.impl.TableMapperFactory;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.exception.NoSuchCrmGroupException;
import contact.manager.model.CrmGroup;
import contact.manager.model.impl.CrmGroupImpl;
import contact.manager.model.impl.CrmGroupModelImpl;
import contact.manager.service.persistence.CrmContactPersistence;
import contact.manager.service.persistence.CrmGroupPersistence;

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
 * The persistence implementation for the CRM Group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CrmGroupPersistenceImpl
	extends BasePersistenceImpl<CrmGroup> implements CrmGroupPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CrmGroupUtil</code> to access the CRM Group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CrmGroupImpl.class.getName();

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
	 * Returns all the CRM Groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Groups
	 */
	@Override
	public List<CrmGroup> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @return the range of matching CRM Groups
	 */
	@Override
	public List<CrmGroup> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Groups
	 */
	@Deprecated
	@Override
	public List<CrmGroup> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmGroup> orderByComparator, boolean useFinderCache) {

		return findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Groups
	 */
	@Override
	public List<CrmGroup> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmGroup> orderByComparator) {

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

		List<CrmGroup> list = (List<CrmGroup>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmGroup crmGroup : list) {
				if (!uuid.equals(crmGroup.getUuid())) {
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

			query.append(_SQL_SELECT_CRMGROUP_WHERE);

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
				query.append(CrmGroupModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmGroup>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmGroup>)QueryUtil.list(
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
	 * Returns the first CRM Group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Group
	 * @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup findByUuid_First(
			String uuid, OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException {

		CrmGroup crmGroup = fetchByUuid_First(uuid, orderByComparator);

		if (crmGroup != null) {
			return crmGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmGroupException(msg.toString());
	}

	/**
	 * Returns the first CRM Group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup fetchByUuid_First(
		String uuid, OrderByComparator<CrmGroup> orderByComparator) {

		List<CrmGroup> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Group
	 * @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup findByUuid_Last(
			String uuid, OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException {

		CrmGroup crmGroup = fetchByUuid_Last(uuid, orderByComparator);

		if (crmGroup != null) {
			return crmGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmGroupException(msg.toString());
	}

	/**
	 * Returns the last CRM Group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup fetchByUuid_Last(
		String uuid, OrderByComparator<CrmGroup> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmGroup> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Groups before and after the current CRM Group in the ordered set where uuid = &#63;.
	 *
	 * @param crmGroupId the primary key of the current CRM Group
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Group
	 * @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup[] findByUuid_PrevAndNext(
			long crmGroupId, String uuid,
			OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException {

		uuid = Objects.toString(uuid, "");

		CrmGroup crmGroup = findByPrimaryKey(crmGroupId);

		Session session = null;

		try {
			session = openSession();

			CrmGroup[] array = new CrmGroupImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, crmGroup, uuid, orderByComparator, true);

			array[1] = crmGroup;

			array[2] = getByUuid_PrevAndNext(
				session, crmGroup, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmGroup getByUuid_PrevAndNext(
		Session session, CrmGroup crmGroup, String uuid,
		OrderByComparator<CrmGroup> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMGROUP_WHERE);

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
			query.append(CrmGroupModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(crmGroup)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CrmGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Groups where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmGroup crmGroup :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(crmGroup);
		}
	}

	/**
	 * Returns the number of CRM Groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Groups
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMGROUP_WHERE);

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
		"crmGroup.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(crmGroup.uuid IS NULL OR crmGroup.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the CRM Group where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCrmGroupException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Group
	 * @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmGroupException {

		CrmGroup crmGroup = fetchByUUID_G(uuid, groupId);

		if (crmGroup == null) {
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

			throw new NoSuchCrmGroupException(msg.toString());
		}

		return crmGroup;
	}

	/**
	 * Returns the CRM Group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	 */
	@Deprecated
	@Override
	public CrmGroup fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the CRM Group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup fetchByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = new Object[] {uuid, groupId};

		Object result = finderCache.getResult(
			_finderPathFetchByUUID_G, finderArgs, this);

		if (result instanceof CrmGroup) {
			CrmGroup crmGroup = (CrmGroup)result;

			if (!Objects.equals(uuid, crmGroup.getUuid()) ||
				(groupId != crmGroup.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMGROUP_WHERE);

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

				List<CrmGroup> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(
						_finderPathFetchByUUID_G, finderArgs, list);
				}
				else {
					CrmGroup crmGroup = list.get(0);

					result = crmGroup;

					cacheResult(crmGroup);
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
			return (CrmGroup)result;
		}
	}

	/**
	 * Removes the CRM Group where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Group that was removed
	 */
	@Override
	public CrmGroup removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmGroupException {

		CrmGroup crmGroup = findByUUID_G(uuid, groupId);

		return remove(crmGroup);
	}

	/**
	 * Returns the number of CRM Groups where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Groups
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMGROUP_WHERE);

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
		"crmGroup.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(crmGroup.uuid IS NULL OR crmGroup.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"crmGroup.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the CRM Groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Groups
	 */
	@Override
	public List<CrmGroup> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @return the range of matching CRM Groups
	 */
	@Override
	public List<CrmGroup> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Groups
	 */
	@Deprecated
	@Override
	public List<CrmGroup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmGroup> orderByComparator, boolean useFinderCache) {

		return findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Groups
	 */
	@Override
	public List<CrmGroup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmGroup> orderByComparator) {

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

		List<CrmGroup> list = (List<CrmGroup>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmGroup crmGroup : list) {
				if (!uuid.equals(crmGroup.getUuid()) ||
					(companyId != crmGroup.getCompanyId())) {

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

			query.append(_SQL_SELECT_CRMGROUP_WHERE);

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
				query.append(CrmGroupModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmGroup>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmGroup>)QueryUtil.list(
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
	 * Returns the first CRM Group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Group
	 * @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException {

		CrmGroup crmGroup = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (crmGroup != null) {
			return crmGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmGroupException(msg.toString());
	}

	/**
	 * Returns the first CRM Group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CrmGroup> orderByComparator) {

		List<CrmGroup> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Group
	 * @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException {

		CrmGroup crmGroup = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (crmGroup != null) {
			return crmGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmGroupException(msg.toString());
	}

	/**
	 * Returns the last CRM Group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CrmGroup> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmGroup> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Groups before and after the current CRM Group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmGroupId the primary key of the current CRM Group
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Group
	 * @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup[] findByUuid_C_PrevAndNext(
			long crmGroupId, String uuid, long companyId,
			OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException {

		uuid = Objects.toString(uuid, "");

		CrmGroup crmGroup = findByPrimaryKey(crmGroupId);

		Session session = null;

		try {
			session = openSession();

			CrmGroup[] array = new CrmGroupImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, crmGroup, uuid, companyId, orderByComparator, true);

			array[1] = crmGroup;

			array[2] = getByUuid_C_PrevAndNext(
				session, crmGroup, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmGroup getByUuid_C_PrevAndNext(
		Session session, CrmGroup crmGroup, String uuid, long companyId,
		OrderByComparator<CrmGroup> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMGROUP_WHERE);

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
			query.append(CrmGroupModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(crmGroup)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CrmGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Groups where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmGroup crmGroup :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(crmGroup);
		}
	}

	/**
	 * Returns the number of CRM Groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Groups
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMGROUP_WHERE);

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
		"crmGroup.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(crmGroup.uuid IS NULL OR crmGroup.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"crmGroup.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByName;
	private FinderPath _finderPathWithoutPaginationFindByName;
	private FinderPath _finderPathCountByName;

	/**
	 * Returns all the CRM Groups where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching CRM Groups
	 */
	@Override
	public List<CrmGroup> findByName(String name) {
		return findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Groups where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @return the range of matching CRM Groups
	 */
	@Override
	public List<CrmGroup> findByName(String name, int start, int end) {
		return findByName(name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Groups where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByName(String, int, int, OrderByComparator)}
	 * @param name the name
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Groups
	 */
	@Deprecated
	@Override
	public List<CrmGroup> findByName(
		String name, int start, int end,
		OrderByComparator<CrmGroup> orderByComparator, boolean useFinderCache) {

		return findByName(name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Groups where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Groups
	 */
	@Override
	public List<CrmGroup> findByName(
		String name, int start, int end,
		OrderByComparator<CrmGroup> orderByComparator) {

		name = Objects.toString(name, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByName;
			finderArgs = new Object[] {name};
		}
		else {
			finderPath = _finderPathWithPaginationFindByName;
			finderArgs = new Object[] {name, start, end, orderByComparator};
		}

		List<CrmGroup> list = (List<CrmGroup>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmGroup crmGroup : list) {
				if (!name.equals(crmGroup.getName())) {
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

			query.append(_SQL_SELECT_CRMGROUP_WHERE);

			boolean bindName = false;

			if (name.isEmpty()) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(CrmGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				if (!pagination) {
					list = (List<CrmGroup>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmGroup>)QueryUtil.list(
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
	 * Returns the first CRM Group in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Group
	 * @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup findByName_First(
			String name, OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException {

		CrmGroup crmGroup = fetchByName_First(name, orderByComparator);

		if (crmGroup != null) {
			return crmGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append("}");

		throw new NoSuchCrmGroupException(msg.toString());
	}

	/**
	 * Returns the first CRM Group in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup fetchByName_First(
		String name, OrderByComparator<CrmGroup> orderByComparator) {

		List<CrmGroup> list = findByName(name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Group in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Group
	 * @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup findByName_Last(
			String name, OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException {

		CrmGroup crmGroup = fetchByName_Last(name, orderByComparator);

		if (crmGroup != null) {
			return crmGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append("}");

		throw new NoSuchCrmGroupException(msg.toString());
	}

	/**
	 * Returns the last CRM Group in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup fetchByName_Last(
		String name, OrderByComparator<CrmGroup> orderByComparator) {

		int count = countByName(name);

		if (count == 0) {
			return null;
		}

		List<CrmGroup> list = findByName(
			name, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Groups before and after the current CRM Group in the ordered set where name = &#63;.
	 *
	 * @param crmGroupId the primary key of the current CRM Group
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Group
	 * @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup[] findByName_PrevAndNext(
			long crmGroupId, String name,
			OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException {

		name = Objects.toString(name, "");

		CrmGroup crmGroup = findByPrimaryKey(crmGroupId);

		Session session = null;

		try {
			session = openSession();

			CrmGroup[] array = new CrmGroupImpl[3];

			array[0] = getByName_PrevAndNext(
				session, crmGroup, name, orderByComparator, true);

			array[1] = crmGroup;

			array[2] = getByName_PrevAndNext(
				session, crmGroup, name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmGroup getByName_PrevAndNext(
		Session session, CrmGroup crmGroup, String name,
		OrderByComparator<CrmGroup> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMGROUP_WHERE);

		boolean bindName = false;

		if (name.isEmpty()) {
			query.append(_FINDER_COLUMN_NAME_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_NAME_NAME_2);
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
			query.append(CrmGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(crmGroup)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CrmGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Groups where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	@Override
	public void removeByName(String name) {
		for (CrmGroup crmGroup :
				findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(crmGroup);
		}
	}

	/**
	 * Returns the number of CRM Groups where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching CRM Groups
	 */
	@Override
	public int countByName(String name) {
		name = Objects.toString(name, "");

		FinderPath finderPath = _finderPathCountByName;

		Object[] finderArgs = new Object[] {name};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMGROUP_WHERE);

			boolean bindName = false;

			if (name.isEmpty()) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_NAME_NAME_2 =
		"crmGroup.name = ?";

	private static final String _FINDER_COLUMN_NAME_NAME_3 =
		"(crmGroup.name IS NULL OR crmGroup.name = '')";

	private FinderPath _finderPathWithPaginationFindByStatus;
	private FinderPath _finderPathWithoutPaginationFindByStatus;
	private FinderPath _finderPathCountByStatus;

	/**
	 * Returns all the CRM Groups where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching CRM Groups
	 */
	@Override
	public List<CrmGroup> findByStatus(String status) {
		return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Groups where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @return the range of matching CRM Groups
	 */
	@Override
	public List<CrmGroup> findByStatus(String status, int start, int end) {
		return findByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Groups where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByStatus(String, int, int, OrderByComparator)}
	 * @param status the status
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Groups
	 */
	@Deprecated
	@Override
	public List<CrmGroup> findByStatus(
		String status, int start, int end,
		OrderByComparator<CrmGroup> orderByComparator, boolean useFinderCache) {

		return findByStatus(status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Groups where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Groups
	 */
	@Override
	public List<CrmGroup> findByStatus(
		String status, int start, int end,
		OrderByComparator<CrmGroup> orderByComparator) {

		status = Objects.toString(status, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByStatus;
			finderArgs = new Object[] {status};
		}
		else {
			finderPath = _finderPathWithPaginationFindByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<CrmGroup> list = (List<CrmGroup>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmGroup crmGroup : list) {
				if (!status.equals(crmGroup.getStatus())) {
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

			query.append(_SQL_SELECT_CRMGROUP_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(CrmGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStatus) {
					qPos.add(status);
				}

				if (!pagination) {
					list = (List<CrmGroup>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmGroup>)QueryUtil.list(
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
	 * Returns the first CRM Group in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Group
	 * @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup findByStatus_First(
			String status, OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException {

		CrmGroup crmGroup = fetchByStatus_First(status, orderByComparator);

		if (crmGroup != null) {
			return crmGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append("}");

		throw new NoSuchCrmGroupException(msg.toString());
	}

	/**
	 * Returns the first CRM Group in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup fetchByStatus_First(
		String status, OrderByComparator<CrmGroup> orderByComparator) {

		List<CrmGroup> list = findByStatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Group in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Group
	 * @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup findByStatus_Last(
			String status, OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException {

		CrmGroup crmGroup = fetchByStatus_Last(status, orderByComparator);

		if (crmGroup != null) {
			return crmGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append("}");

		throw new NoSuchCrmGroupException(msg.toString());
	}

	/**
	 * Returns the last CRM Group in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	 */
	@Override
	public CrmGroup fetchByStatus_Last(
		String status, OrderByComparator<CrmGroup> orderByComparator) {

		int count = countByStatus(status);

		if (count == 0) {
			return null;
		}

		List<CrmGroup> list = findByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Groups before and after the current CRM Group in the ordered set where status = &#63;.
	 *
	 * @param crmGroupId the primary key of the current CRM Group
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Group
	 * @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup[] findByStatus_PrevAndNext(
			long crmGroupId, String status,
			OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException {

		status = Objects.toString(status, "");

		CrmGroup crmGroup = findByPrimaryKey(crmGroupId);

		Session session = null;

		try {
			session = openSession();

			CrmGroup[] array = new CrmGroupImpl[3];

			array[0] = getByStatus_PrevAndNext(
				session, crmGroup, status, orderByComparator, true);

			array[1] = crmGroup;

			array[2] = getByStatus_PrevAndNext(
				session, crmGroup, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmGroup getByStatus_PrevAndNext(
		Session session, CrmGroup crmGroup, String status,
		OrderByComparator<CrmGroup> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMGROUP_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			query.append(_FINDER_COLUMN_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);
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
			query.append(CrmGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindStatus) {
			qPos.add(status);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(crmGroup)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CrmGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Groups where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeByStatus(String status) {
		for (CrmGroup crmGroup :
				findByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(crmGroup);
		}
	}

	/**
	 * Returns the number of CRM Groups where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching CRM Groups
	 */
	@Override
	public int countByStatus(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMGROUP_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStatus) {
					qPos.add(status);
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

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 =
		"crmGroup.status = ?";

	private static final String _FINDER_COLUMN_STATUS_STATUS_3 =
		"(crmGroup.status IS NULL OR crmGroup.status = '')";

	public CrmGroupPersistenceImpl() {
		setModelClass(CrmGroup.class);

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
	 * Caches the CRM Group in the entity cache if it is enabled.
	 *
	 * @param crmGroup the CRM Group
	 */
	@Override
	public void cacheResult(CrmGroup crmGroup) {
		entityCache.putResult(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED, CrmGroupImpl.class,
			crmGroup.getPrimaryKey(), crmGroup);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {crmGroup.getUuid(), crmGroup.getGroupId()}, crmGroup);

		crmGroup.resetOriginalValues();
	}

	/**
	 * Caches the CRM Groups in the entity cache if it is enabled.
	 *
	 * @param crmGroups the CRM Groups
	 */
	@Override
	public void cacheResult(List<CrmGroup> crmGroups) {
		for (CrmGroup crmGroup : crmGroups) {
			if (entityCache.getResult(
					CrmGroupModelImpl.ENTITY_CACHE_ENABLED, CrmGroupImpl.class,
					crmGroup.getPrimaryKey()) == null) {

				cacheResult(crmGroup);
			}
			else {
				crmGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM Groups.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmGroupImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM Group.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmGroup crmGroup) {
		entityCache.removeResult(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED, CrmGroupImpl.class,
			crmGroup.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmGroupModelImpl)crmGroup, true);
	}

	@Override
	public void clearCache(List<CrmGroup> crmGroups) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmGroup crmGroup : crmGroups) {
			entityCache.removeResult(
				CrmGroupModelImpl.ENTITY_CACHE_ENABLED, CrmGroupImpl.class,
				crmGroup.getPrimaryKey());

			clearUniqueFindersCache((CrmGroupModelImpl)crmGroup, true);
		}
	}

	protected void cacheUniqueFindersCache(
		CrmGroupModelImpl crmGroupModelImpl) {

		Object[] args = new Object[] {
			crmGroupModelImpl.getUuid(), crmGroupModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, crmGroupModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmGroupModelImpl crmGroupModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				crmGroupModelImpl.getUuid(), crmGroupModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((crmGroupModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				crmGroupModelImpl.getOriginalUuid(),
				crmGroupModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new CRM Group with the primary key. Does not add the CRM Group to the database.
	 *
	 * @param crmGroupId the primary key for the new CRM Group
	 * @return the new CRM Group
	 */
	@Override
	public CrmGroup create(long crmGroupId) {
		CrmGroup crmGroup = new CrmGroupImpl();

		crmGroup.setNew(true);
		crmGroup.setPrimaryKey(crmGroupId);

		String uuid = PortalUUIDUtil.generate();

		crmGroup.setUuid(uuid);

		crmGroup.setCompanyId(CompanyThreadLocal.getCompanyId());

		return crmGroup;
	}

	/**
	 * Removes the CRM Group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmGroupId the primary key of the CRM Group
	 * @return the CRM Group that was removed
	 * @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup remove(long crmGroupId) throws NoSuchCrmGroupException {
		return remove((Serializable)crmGroupId);
	}

	/**
	 * Removes the CRM Group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM Group
	 * @return the CRM Group that was removed
	 * @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup remove(Serializable primaryKey)
		throws NoSuchCrmGroupException {

		Session session = null;

		try {
			session = openSession();

			CrmGroup crmGroup = (CrmGroup)session.get(
				CrmGroupImpl.class, primaryKey);

			if (crmGroup == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmGroupException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(crmGroup);
		}
		catch (NoSuchCrmGroupException nsee) {
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
	protected CrmGroup removeImpl(CrmGroup crmGroup) {
		crmGroupToCrmContactTableMapper.deleteLeftPrimaryKeyTableMappings(
			crmGroup.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmGroup)) {
				crmGroup = (CrmGroup)session.get(
					CrmGroupImpl.class, crmGroup.getPrimaryKeyObj());
			}

			if (crmGroup != null) {
				session.delete(crmGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmGroup != null) {
			clearCache(crmGroup);
		}

		return crmGroup;
	}

	@Override
	public CrmGroup updateImpl(CrmGroup crmGroup) {
		boolean isNew = crmGroup.isNew();

		if (!(crmGroup instanceof CrmGroupModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(crmGroup.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(crmGroup);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in crmGroup proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CrmGroup implementation " +
					crmGroup.getClass());
		}

		CrmGroupModelImpl crmGroupModelImpl = (CrmGroupModelImpl)crmGroup;

		if (Validator.isNull(crmGroup.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmGroup.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmGroup.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmGroup.setCreateDate(now);
			}
			else {
				crmGroup.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmGroupModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmGroup.setModifiedDate(now);
			}
			else {
				crmGroup.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmGroup.isNew()) {
				session.save(crmGroup);

				crmGroup.setNew(false);
			}
			else {
				crmGroup = (CrmGroup)session.merge(crmGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmGroupModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {crmGroupModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				crmGroupModelImpl.getUuid(), crmGroupModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {crmGroupModelImpl.getName()};

			finderCache.removeResult(_finderPathCountByName, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByName, args);

			args = new Object[] {crmGroupModelImpl.getStatus()};

			finderCache.removeResult(_finderPathCountByStatus, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByStatus, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((crmGroupModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crmGroupModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {crmGroupModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((crmGroupModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crmGroupModelImpl.getOriginalUuid(),
					crmGroupModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					crmGroupModelImpl.getUuid(),
					crmGroupModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((crmGroupModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByName.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crmGroupModelImpl.getOriginalName()
				};

				finderCache.removeResult(_finderPathCountByName, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByName, args);

				args = new Object[] {crmGroupModelImpl.getName()};

				finderCache.removeResult(_finderPathCountByName, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByName, args);
			}

			if ((crmGroupModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByStatus.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crmGroupModelImpl.getOriginalStatus()
				};

				finderCache.removeResult(_finderPathCountByStatus, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByStatus, args);

				args = new Object[] {crmGroupModelImpl.getStatus()};

				finderCache.removeResult(_finderPathCountByStatus, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByStatus, args);
			}
		}

		entityCache.putResult(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED, CrmGroupImpl.class,
			crmGroup.getPrimaryKey(), crmGroup, false);

		clearUniqueFindersCache(crmGroupModelImpl, false);
		cacheUniqueFindersCache(crmGroupModelImpl);

		crmGroup.resetOriginalValues();

		return crmGroup;
	}

	/**
	 * Returns the CRM Group with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Group
	 * @return the CRM Group
	 * @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmGroupException {

		CrmGroup crmGroup = fetchByPrimaryKey(primaryKey);

		if (crmGroup == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmGroupException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return crmGroup;
	}

	/**
	 * Returns the CRM Group with the primary key or throws a <code>NoSuchCrmGroupException</code> if it could not be found.
	 *
	 * @param crmGroupId the primary key of the CRM Group
	 * @return the CRM Group
	 * @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup findByPrimaryKey(long crmGroupId)
		throws NoSuchCrmGroupException {

		return findByPrimaryKey((Serializable)crmGroupId);
	}

	/**
	 * Returns the CRM Group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Group
	 * @return the CRM Group, or <code>null</code> if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED, CrmGroupImpl.class,
			primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmGroup crmGroup = (CrmGroup)serializable;

		if (crmGroup == null) {
			Session session = null;

			try {
				session = openSession();

				crmGroup = (CrmGroup)session.get(
					CrmGroupImpl.class, primaryKey);

				if (crmGroup != null) {
					cacheResult(crmGroup);
				}
				else {
					entityCache.putResult(
						CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
						CrmGroupImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(
					CrmGroupModelImpl.ENTITY_CACHE_ENABLED, CrmGroupImpl.class,
					primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmGroup;
	}

	/**
	 * Returns the CRM Group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmGroupId the primary key of the CRM Group
	 * @return the CRM Group, or <code>null</code> if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup fetchByPrimaryKey(long crmGroupId) {
		return fetchByPrimaryKey((Serializable)crmGroupId);
	}

	@Override
	public Map<Serializable, CrmGroup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmGroup> map = new HashMap<Serializable, CrmGroup>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmGroup crmGroup = fetchByPrimaryKey(primaryKey);

			if (crmGroup != null) {
				map.put(primaryKey, crmGroup);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				CrmGroupModelImpl.ENTITY_CACHE_ENABLED, CrmGroupImpl.class,
				primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmGroup)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler(
			uncachedPrimaryKeys.size() * 2 + 1);

		query.append(_SQL_SELECT_CRMGROUP_WHERE_PKS_IN);

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

			for (CrmGroup crmGroup : (List<CrmGroup>)q.list()) {
				map.put(crmGroup.getPrimaryKeyObj(), crmGroup);

				cacheResult(crmGroup);

				uncachedPrimaryKeys.remove(crmGroup.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					CrmGroupModelImpl.ENTITY_CACHE_ENABLED, CrmGroupImpl.class,
					primaryKey, nullModel);
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
	 * Returns all the CRM Groups.
	 *
	 * @return the CRM Groups
	 */
	@Override
	public List<CrmGroup> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @return the range of CRM Groups
	 */
	@Override
	public List<CrmGroup> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of CRM Groups
	 */
	@Deprecated
	@Override
	public List<CrmGroup> findAll(
		int start, int end, OrderByComparator<CrmGroup> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Groups
	 */
	@Override
	public List<CrmGroup> findAll(
		int start, int end, OrderByComparator<CrmGroup> orderByComparator) {

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

		List<CrmGroup> list = (List<CrmGroup>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMGROUP);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMGROUP;

				if (pagination) {
					sql = sql.concat(CrmGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmGroup>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmGroup>)QueryUtil.list(
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
	 * Removes all the CRM Groups from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmGroup crmGroup : findAll()) {
			remove(crmGroup);
		}
	}

	/**
	 * Returns the number of CRM Groups.
	 *
	 * @return the number of CRM Groups
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMGROUP);

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

	/**
	 * Returns the primaryKeys of CRM Contacts associated with the CRM Group.
	 *
	 * @param pk the primary key of the CRM Group
	 * @return long[] of the primaryKeys of CRM Contacts associated with the CRM Group
	 */
	@Override
	public long[] getCrmContactPrimaryKeys(long pk) {
		long[] pks = crmGroupToCrmContactTableMapper.getRightPrimaryKeys(pk);

		return pks.clone();
	}

	/**
	 * Returns all the CRM Contacts associated with the CRM Group.
	 *
	 * @param pk the primary key of the CRM Group
	 * @return the CRM Contacts associated with the CRM Group
	 */
	@Override
	public List<contact.manager.model.CrmContact> getCrmContacts(long pk) {
		return getCrmContacts(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the CRM Contacts associated with the CRM Group.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the CRM Group
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @return the range of CRM Contacts associated with the CRM Group
	 */
	@Override
	public List<contact.manager.model.CrmContact> getCrmContacts(
		long pk, int start, int end) {

		return getCrmContacts(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts associated with the CRM Group.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmGroupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the CRM Group
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Contacts associated with the CRM Group
	 */
	@Override
	public List<contact.manager.model.CrmContact> getCrmContacts(
		long pk, int start, int end,
		OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {

		return crmGroupToCrmContactTableMapper.getRightBaseModels(
			pk, start, end, orderByComparator);
	}

	/**
	 * Returns the number of CRM Contacts associated with the CRM Group.
	 *
	 * @param pk the primary key of the CRM Group
	 * @return the number of CRM Contacts associated with the CRM Group
	 */
	@Override
	public int getCrmContactsSize(long pk) {
		long[] pks = crmGroupToCrmContactTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the CRM Contact is associated with the CRM Group.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContactPK the primary key of the CRM Contact
	 * @return <code>true</code> if the CRM Contact is associated with the CRM Group; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCrmContact(long pk, long crmContactPK) {
		return crmGroupToCrmContactTableMapper.containsTableMapping(
			pk, crmContactPK);
	}

	/**
	 * Returns <code>true</code> if the CRM Group has any CRM Contacts associated with it.
	 *
	 * @param pk the primary key of the CRM Group to check for associations with CRM Contacts
	 * @return <code>true</code> if the CRM Group has any CRM Contacts associated with it; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCrmContacts(long pk) {
		if (getCrmContactsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the CRM Group and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContactPK the primary key of the CRM Contact
	 */
	@Override
	public void addCrmContact(long pk, long crmContactPK) {
		CrmGroup crmGroup = fetchByPrimaryKey(pk);

		if (crmGroup == null) {
			crmGroupToCrmContactTableMapper.addTableMapping(
				CompanyThreadLocal.getCompanyId(), pk, crmContactPK);
		}
		else {
			crmGroupToCrmContactTableMapper.addTableMapping(
				crmGroup.getCompanyId(), pk, crmContactPK);
		}
	}

	/**
	 * Adds an association between the CRM Group and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContact the CRM Contact
	 */
	@Override
	public void addCrmContact(
		long pk, contact.manager.model.CrmContact crmContact) {

		CrmGroup crmGroup = fetchByPrimaryKey(pk);

		if (crmGroup == null) {
			crmGroupToCrmContactTableMapper.addTableMapping(
				CompanyThreadLocal.getCompanyId(), pk,
				crmContact.getPrimaryKey());
		}
		else {
			crmGroupToCrmContactTableMapper.addTableMapping(
				crmGroup.getCompanyId(), pk, crmContact.getPrimaryKey());
		}
	}

	/**
	 * Adds an association between the CRM Group and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContactPKs the primary keys of the CRM Contacts
	 */
	@Override
	public void addCrmContacts(long pk, long[] crmContactPKs) {
		long companyId = 0;

		CrmGroup crmGroup = fetchByPrimaryKey(pk);

		if (crmGroup == null) {
			companyId = CompanyThreadLocal.getCompanyId();
		}
		else {
			companyId = crmGroup.getCompanyId();
		}

		crmGroupToCrmContactTableMapper.addTableMappings(
			companyId, pk, crmContactPKs);
	}

	/**
	 * Adds an association between the CRM Group and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContacts the CRM Contacts
	 */
	@Override
	public void addCrmContacts(
		long pk, List<contact.manager.model.CrmContact> crmContacts) {

		addCrmContacts(
			pk,
			ListUtil.toLongArray(
				crmContacts,
				contact.manager.model.CrmContact.CRM_CONTACT_ID_ACCESSOR));
	}

	/**
	 * Clears all associations between the CRM Group and its CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group to clear the associated CRM Contacts from
	 */
	@Override
	public void clearCrmContacts(long pk) {
		crmGroupToCrmContactTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the CRM Group and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContactPK the primary key of the CRM Contact
	 */
	@Override
	public void removeCrmContact(long pk, long crmContactPK) {
		crmGroupToCrmContactTableMapper.deleteTableMapping(pk, crmContactPK);
	}

	/**
	 * Removes the association between the CRM Group and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContact the CRM Contact
	 */
	@Override
	public void removeCrmContact(
		long pk, contact.manager.model.CrmContact crmContact) {

		crmGroupToCrmContactTableMapper.deleteTableMapping(
			pk, crmContact.getPrimaryKey());
	}

	/**
	 * Removes the association between the CRM Group and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContactPKs the primary keys of the CRM Contacts
	 */
	@Override
	public void removeCrmContacts(long pk, long[] crmContactPKs) {
		crmGroupToCrmContactTableMapper.deleteTableMappings(pk, crmContactPKs);
	}

	/**
	 * Removes the association between the CRM Group and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContacts the CRM Contacts
	 */
	@Override
	public void removeCrmContacts(
		long pk, List<contact.manager.model.CrmContact> crmContacts) {

		removeCrmContacts(
			pk,
			ListUtil.toLongArray(
				crmContacts,
				contact.manager.model.CrmContact.CRM_CONTACT_ID_ACCESSOR));
	}

	/**
	 * Sets the CRM Contacts associated with the CRM Group, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContactPKs the primary keys of the CRM Contacts to be associated with the CRM Group
	 */
	@Override
	public void setCrmContacts(long pk, long[] crmContactPKs) {
		Set<Long> newCrmContactPKsSet = SetUtil.fromArray(crmContactPKs);
		Set<Long> oldCrmContactPKsSet = SetUtil.fromArray(
			crmGroupToCrmContactTableMapper.getRightPrimaryKeys(pk));

		Set<Long> removeCrmContactPKsSet = new HashSet<Long>(
			oldCrmContactPKsSet);

		removeCrmContactPKsSet.removeAll(newCrmContactPKsSet);

		crmGroupToCrmContactTableMapper.deleteTableMappings(
			pk, ArrayUtil.toLongArray(removeCrmContactPKsSet));

		newCrmContactPKsSet.removeAll(oldCrmContactPKsSet);

		long companyId = 0;

		CrmGroup crmGroup = fetchByPrimaryKey(pk);

		if (crmGroup == null) {
			companyId = CompanyThreadLocal.getCompanyId();
		}
		else {
			companyId = crmGroup.getCompanyId();
		}

		crmGroupToCrmContactTableMapper.addTableMappings(
			companyId, pk, ArrayUtil.toLongArray(newCrmContactPKsSet));
	}

	/**
	 * Sets the CRM Contacts associated with the CRM Group, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContacts the CRM Contacts to be associated with the CRM Group
	 */
	@Override
	public void setCrmContacts(
		long pk, List<contact.manager.model.CrmContact> crmContacts) {

		try {
			long[] crmContactPKs = new long[crmContacts.size()];

			for (int i = 0; i < crmContacts.size(); i++) {
				contact.manager.model.CrmContact crmContact = crmContacts.get(
					i);

				crmContactPKs[i] = crmContact.getPrimaryKey();
			}

			setCrmContacts(pk, crmContactPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CrmGroupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM Group persistence.
	 */
	public void afterPropertiesSet() {
		crmGroupToCrmContactTableMapper = TableMapperFactory.getTableMapper(
			"crm_contacts_groups", "companyId", "crmGroupId", "crmContactId",
			this, crmContactPersistence);

		_finderPathWithPaginationFindAll = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			CrmGroupModelImpl.UUID_COLUMN_BITMASK |
			CrmGroupModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			CrmGroupModelImpl.UUID_COLUMN_BITMASK |
			CrmGroupModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			CrmGroupModelImpl.UUID_COLUMN_BITMASK |
			CrmGroupModelImpl.COMPANYID_COLUMN_BITMASK |
			CrmGroupModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByName = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByName = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByName",
			new String[] {String.class.getName()},
			CrmGroupModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByName = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByStatus = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByStatus = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
			new String[] {String.class.getName()},
			CrmGroupModelImpl.STATUS_COLUMN_BITMASK |
			CrmGroupModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByStatus = new FinderPath(
			CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] {String.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(CrmGroupImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("crm_contacts_groups");
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	@BeanReference(type = CrmContactPersistence.class)
	protected CrmContactPersistence crmContactPersistence;

	protected TableMapper<CrmGroup, contact.manager.model.CrmContact>
		crmGroupToCrmContactTableMapper;

	private static final String _SQL_SELECT_CRMGROUP =
		"SELECT crmGroup FROM CrmGroup crmGroup";

	private static final String _SQL_SELECT_CRMGROUP_WHERE_PKS_IN =
		"SELECT crmGroup FROM CrmGroup crmGroup WHERE crmGroupId IN (";

	private static final String _SQL_SELECT_CRMGROUP_WHERE =
		"SELECT crmGroup FROM CrmGroup crmGroup WHERE ";

	private static final String _SQL_COUNT_CRMGROUP =
		"SELECT COUNT(crmGroup) FROM CrmGroup crmGroup";

	private static final String _SQL_COUNT_CRMGROUP_WHERE =
		"SELECT COUNT(crmGroup) FROM CrmGroup crmGroup WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "crmGroup.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CrmGroup exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CrmGroup exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CrmGroupPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}