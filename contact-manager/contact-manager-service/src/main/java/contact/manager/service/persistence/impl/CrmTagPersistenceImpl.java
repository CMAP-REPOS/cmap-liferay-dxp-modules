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

import contact.manager.exception.NoSuchCrmTagException;
import contact.manager.model.CrmTag;
import contact.manager.model.impl.CrmTagImpl;
import contact.manager.model.impl.CrmTagModelImpl;
import contact.manager.service.persistence.CrmContactPersistence;
import contact.manager.service.persistence.CrmTagPersistence;

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
 * The persistence implementation for the CRM Tag service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CrmTagPersistenceImpl
	extends BasePersistenceImpl<CrmTag> implements CrmTagPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CrmTagUtil</code> to access the CRM Tag persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CrmTagImpl.class.getName();

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
	 * Returns all the CRM Tags where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Tags
	 */
	@Override
	public List<CrmTag> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Tags where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @return the range of matching CRM Tags
	 */
	@Override
	public List<CrmTag> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Tags where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Tags
	 */
	@Deprecated
	@Override
	public List<CrmTag> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmTag> orderByComparator, boolean useFinderCache) {

		return findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Tags where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Tags
	 */
	@Override
	public List<CrmTag> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmTag> orderByComparator) {

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

		List<CrmTag> list = (List<CrmTag>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmTag crmTag : list) {
				if (!uuid.equals(crmTag.getUuid())) {
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

			query.append(_SQL_SELECT_CRMTAG_WHERE);

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
				query.append(CrmTagModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmTag>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmTag>)QueryUtil.list(
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
	 * Returns the first CRM Tag in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Tag
	 * @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	 */
	@Override
	public CrmTag findByUuid_First(
			String uuid, OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException {

		CrmTag crmTag = fetchByUuid_First(uuid, orderByComparator);

		if (crmTag != null) {
			return crmTag;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmTagException(msg.toString());
	}

	/**
	 * Returns the first CRM Tag in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	 */
	@Override
	public CrmTag fetchByUuid_First(
		String uuid, OrderByComparator<CrmTag> orderByComparator) {

		List<CrmTag> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Tag in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Tag
	 * @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	 */
	@Override
	public CrmTag findByUuid_Last(
			String uuid, OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException {

		CrmTag crmTag = fetchByUuid_Last(uuid, orderByComparator);

		if (crmTag != null) {
			return crmTag;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmTagException(msg.toString());
	}

	/**
	 * Returns the last CRM Tag in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	 */
	@Override
	public CrmTag fetchByUuid_Last(
		String uuid, OrderByComparator<CrmTag> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmTag> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Tags before and after the current CRM Tag in the ordered set where uuid = &#63;.
	 *
	 * @param crmTagId the primary key of the current CRM Tag
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Tag
	 * @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	 */
	@Override
	public CrmTag[] findByUuid_PrevAndNext(
			long crmTagId, String uuid,
			OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException {

		uuid = Objects.toString(uuid, "");

		CrmTag crmTag = findByPrimaryKey(crmTagId);

		Session session = null;

		try {
			session = openSession();

			CrmTag[] array = new CrmTagImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, crmTag, uuid, orderByComparator, true);

			array[1] = crmTag;

			array[2] = getByUuid_PrevAndNext(
				session, crmTag, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmTag getByUuid_PrevAndNext(
		Session session, CrmTag crmTag, String uuid,
		OrderByComparator<CrmTag> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMTAG_WHERE);

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
			query.append(CrmTagModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(crmTag)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CrmTag> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Tags where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmTag crmTag :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(crmTag);
		}
	}

	/**
	 * Returns the number of CRM Tags where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Tags
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMTAG_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmTag.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(crmTag.uuid IS NULL OR crmTag.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the CRM Tag where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCrmTagException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Tag
	 * @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	 */
	@Override
	public CrmTag findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmTagException {

		CrmTag crmTag = fetchByUUID_G(uuid, groupId);

		if (crmTag == null) {
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

			throw new NoSuchCrmTagException(msg.toString());
		}

		return crmTag;
	}

	/**
	 * Returns the CRM Tag where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	 */
	@Deprecated
	@Override
	public CrmTag fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the CRM Tag where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	 */
	@Override
	public CrmTag fetchByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = new Object[] {uuid, groupId};

		Object result = finderCache.getResult(
			_finderPathFetchByUUID_G, finderArgs, this);

		if (result instanceof CrmTag) {
			CrmTag crmTag = (CrmTag)result;

			if (!Objects.equals(uuid, crmTag.getUuid()) ||
				(groupId != crmTag.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMTAG_WHERE);

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

				List<CrmTag> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(
						_finderPathFetchByUUID_G, finderArgs, list);
				}
				else {
					CrmTag crmTag = list.get(0);

					result = crmTag;

					cacheResult(crmTag);
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
			return (CrmTag)result;
		}
	}

	/**
	 * Removes the CRM Tag where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Tag that was removed
	 */
	@Override
	public CrmTag removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmTagException {

		CrmTag crmTag = findByUUID_G(uuid, groupId);

		return remove(crmTag);
	}

	/**
	 * Returns the number of CRM Tags where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Tags
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMTAG_WHERE);

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
		"crmTag.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(crmTag.uuid IS NULL OR crmTag.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"crmTag.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the CRM Tags where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Tags
	 */
	@Override
	public List<CrmTag> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Tags where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @return the range of matching CRM Tags
	 */
	@Override
	public List<CrmTag> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Tags where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Tags
	 */
	@Deprecated
	@Override
	public List<CrmTag> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmTag> orderByComparator, boolean useFinderCache) {

		return findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Tags where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Tags
	 */
	@Override
	public List<CrmTag> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmTag> orderByComparator) {

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

		List<CrmTag> list = (List<CrmTag>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CrmTag crmTag : list) {
				if (!uuid.equals(crmTag.getUuid()) ||
					(companyId != crmTag.getCompanyId())) {

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

			query.append(_SQL_SELECT_CRMTAG_WHERE);

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
				query.append(CrmTagModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmTag>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmTag>)QueryUtil.list(
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
	 * Returns the first CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Tag
	 * @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	 */
	@Override
	public CrmTag findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException {

		CrmTag crmTag = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (crmTag != null) {
			return crmTag;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmTagException(msg.toString());
	}

	/**
	 * Returns the first CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	 */
	@Override
	public CrmTag fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CrmTag> orderByComparator) {

		List<CrmTag> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Tag
	 * @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	 */
	@Override
	public CrmTag findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException {

		CrmTag crmTag = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (crmTag != null) {
			return crmTag;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmTagException(msg.toString());
	}

	/**
	 * Returns the last CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	 */
	@Override
	public CrmTag fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CrmTag> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmTag> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Tags before and after the current CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmTagId the primary key of the current CRM Tag
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Tag
	 * @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	 */
	@Override
	public CrmTag[] findByUuid_C_PrevAndNext(
			long crmTagId, String uuid, long companyId,
			OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException {

		uuid = Objects.toString(uuid, "");

		CrmTag crmTag = findByPrimaryKey(crmTagId);

		Session session = null;

		try {
			session = openSession();

			CrmTag[] array = new CrmTagImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, crmTag, uuid, companyId, orderByComparator, true);

			array[1] = crmTag;

			array[2] = getByUuid_C_PrevAndNext(
				session, crmTag, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmTag getByUuid_C_PrevAndNext(
		Session session, CrmTag crmTag, String uuid, long companyId,
		OrderByComparator<CrmTag> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMTAG_WHERE);

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
			query.append(CrmTagModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(crmTag)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CrmTag> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Tags where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmTag crmTag :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(crmTag);
		}
	}

	/**
	 * Returns the number of CRM Tags where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Tags
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMTAG_WHERE);

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
		"crmTag.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(crmTag.uuid IS NULL OR crmTag.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"crmTag.companyId = ?";

	public CrmTagPersistenceImpl() {
		setModelClass(CrmTag.class);

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
	 * Caches the CRM Tag in the entity cache if it is enabled.
	 *
	 * @param crmTag the CRM Tag
	 */
	@Override
	public void cacheResult(CrmTag crmTag) {
		entityCache.putResult(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED, CrmTagImpl.class,
			crmTag.getPrimaryKey(), crmTag);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {crmTag.getUuid(), crmTag.getGroupId()}, crmTag);

		crmTag.resetOriginalValues();
	}

	/**
	 * Caches the CRM Tags in the entity cache if it is enabled.
	 *
	 * @param crmTags the CRM Tags
	 */
	@Override
	public void cacheResult(List<CrmTag> crmTags) {
		for (CrmTag crmTag : crmTags) {
			if (entityCache.getResult(
					CrmTagModelImpl.ENTITY_CACHE_ENABLED, CrmTagImpl.class,
					crmTag.getPrimaryKey()) == null) {

				cacheResult(crmTag);
			}
			else {
				crmTag.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM Tags.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmTagImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM Tag.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmTag crmTag) {
		entityCache.removeResult(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED, CrmTagImpl.class,
			crmTag.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmTagModelImpl)crmTag, true);
	}

	@Override
	public void clearCache(List<CrmTag> crmTags) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmTag crmTag : crmTags) {
			entityCache.removeResult(
				CrmTagModelImpl.ENTITY_CACHE_ENABLED, CrmTagImpl.class,
				crmTag.getPrimaryKey());

			clearUniqueFindersCache((CrmTagModelImpl)crmTag, true);
		}
	}

	protected void cacheUniqueFindersCache(CrmTagModelImpl crmTagModelImpl) {
		Object[] args = new Object[] {
			crmTagModelImpl.getUuid(), crmTagModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, crmTagModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmTagModelImpl crmTagModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				crmTagModelImpl.getUuid(), crmTagModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((crmTagModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				crmTagModelImpl.getOriginalUuid(),
				crmTagModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new CRM Tag with the primary key. Does not add the CRM Tag to the database.
	 *
	 * @param crmTagId the primary key for the new CRM Tag
	 * @return the new CRM Tag
	 */
	@Override
	public CrmTag create(long crmTagId) {
		CrmTag crmTag = new CrmTagImpl();

		crmTag.setNew(true);
		crmTag.setPrimaryKey(crmTagId);

		String uuid = PortalUUIDUtil.generate();

		crmTag.setUuid(uuid);

		crmTag.setCompanyId(CompanyThreadLocal.getCompanyId());

		return crmTag;
	}

	/**
	 * Removes the CRM Tag with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmTagId the primary key of the CRM Tag
	 * @return the CRM Tag that was removed
	 * @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	 */
	@Override
	public CrmTag remove(long crmTagId) throws NoSuchCrmTagException {
		return remove((Serializable)crmTagId);
	}

	/**
	 * Removes the CRM Tag with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM Tag
	 * @return the CRM Tag that was removed
	 * @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	 */
	@Override
	public CrmTag remove(Serializable primaryKey) throws NoSuchCrmTagException {
		Session session = null;

		try {
			session = openSession();

			CrmTag crmTag = (CrmTag)session.get(CrmTagImpl.class, primaryKey);

			if (crmTag == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmTagException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(crmTag);
		}
		catch (NoSuchCrmTagException nsee) {
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
	protected CrmTag removeImpl(CrmTag crmTag) {
		crmTagToCrmContactTableMapper.deleteLeftPrimaryKeyTableMappings(
			crmTag.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmTag)) {
				crmTag = (CrmTag)session.get(
					CrmTagImpl.class, crmTag.getPrimaryKeyObj());
			}

			if (crmTag != null) {
				session.delete(crmTag);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmTag != null) {
			clearCache(crmTag);
		}

		return crmTag;
	}

	@Override
	public CrmTag updateImpl(CrmTag crmTag) {
		boolean isNew = crmTag.isNew();

		if (!(crmTag instanceof CrmTagModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(crmTag.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(crmTag);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in crmTag proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CrmTag implementation " +
					crmTag.getClass());
		}

		CrmTagModelImpl crmTagModelImpl = (CrmTagModelImpl)crmTag;

		if (Validator.isNull(crmTag.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmTag.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmTag.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmTag.setCreateDate(now);
			}
			else {
				crmTag.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmTagModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmTag.setModifiedDate(now);
			}
			else {
				crmTag.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmTag.isNew()) {
				session.save(crmTag);

				crmTag.setNew(false);
			}
			else {
				crmTag = (CrmTag)session.merge(crmTag);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmTagModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {crmTagModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				crmTagModelImpl.getUuid(), crmTagModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((crmTagModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crmTagModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {crmTagModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((crmTagModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crmTagModelImpl.getOriginalUuid(),
					crmTagModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					crmTagModelImpl.getUuid(), crmTagModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}
		}

		entityCache.putResult(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED, CrmTagImpl.class,
			crmTag.getPrimaryKey(), crmTag, false);

		clearUniqueFindersCache(crmTagModelImpl, false);
		cacheUniqueFindersCache(crmTagModelImpl);

		crmTag.resetOriginalValues();

		return crmTag;
	}

	/**
	 * Returns the CRM Tag with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Tag
	 * @return the CRM Tag
	 * @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	 */
	@Override
	public CrmTag findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmTagException {

		CrmTag crmTag = fetchByPrimaryKey(primaryKey);

		if (crmTag == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmTagException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return crmTag;
	}

	/**
	 * Returns the CRM Tag with the primary key or throws a <code>NoSuchCrmTagException</code> if it could not be found.
	 *
	 * @param crmTagId the primary key of the CRM Tag
	 * @return the CRM Tag
	 * @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	 */
	@Override
	public CrmTag findByPrimaryKey(long crmTagId) throws NoSuchCrmTagException {
		return findByPrimaryKey((Serializable)crmTagId);
	}

	/**
	 * Returns the CRM Tag with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Tag
	 * @return the CRM Tag, or <code>null</code> if a CRM Tag with the primary key could not be found
	 */
	@Override
	public CrmTag fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED, CrmTagImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmTag crmTag = (CrmTag)serializable;

		if (crmTag == null) {
			Session session = null;

			try {
				session = openSession();

				crmTag = (CrmTag)session.get(CrmTagImpl.class, primaryKey);

				if (crmTag != null) {
					cacheResult(crmTag);
				}
				else {
					entityCache.putResult(
						CrmTagModelImpl.ENTITY_CACHE_ENABLED, CrmTagImpl.class,
						primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(
					CrmTagModelImpl.ENTITY_CACHE_ENABLED, CrmTagImpl.class,
					primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmTag;
	}

	/**
	 * Returns the CRM Tag with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmTagId the primary key of the CRM Tag
	 * @return the CRM Tag, or <code>null</code> if a CRM Tag with the primary key could not be found
	 */
	@Override
	public CrmTag fetchByPrimaryKey(long crmTagId) {
		return fetchByPrimaryKey((Serializable)crmTagId);
	}

	@Override
	public Map<Serializable, CrmTag> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmTag> map = new HashMap<Serializable, CrmTag>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmTag crmTag = fetchByPrimaryKey(primaryKey);

			if (crmTag != null) {
				map.put(primaryKey, crmTag);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				CrmTagModelImpl.ENTITY_CACHE_ENABLED, CrmTagImpl.class,
				primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmTag)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler(
			uncachedPrimaryKeys.size() * 2 + 1);

		query.append(_SQL_SELECT_CRMTAG_WHERE_PKS_IN);

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

			for (CrmTag crmTag : (List<CrmTag>)q.list()) {
				map.put(crmTag.getPrimaryKeyObj(), crmTag);

				cacheResult(crmTag);

				uncachedPrimaryKeys.remove(crmTag.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					CrmTagModelImpl.ENTITY_CACHE_ENABLED, CrmTagImpl.class,
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
	 * Returns all the CRM Tags.
	 *
	 * @return the CRM Tags
	 */
	@Override
	public List<CrmTag> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Tags.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @return the range of CRM Tags
	 */
	@Override
	public List<CrmTag> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Tags.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of CRM Tags
	 */
	@Deprecated
	@Override
	public List<CrmTag> findAll(
		int start, int end, OrderByComparator<CrmTag> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the CRM Tags.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Tags
	 */
	@Override
	public List<CrmTag> findAll(
		int start, int end, OrderByComparator<CrmTag> orderByComparator) {

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

		List<CrmTag> list = (List<CrmTag>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMTAG);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMTAG;

				if (pagination) {
					sql = sql.concat(CrmTagModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmTag>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmTag>)QueryUtil.list(
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
	 * Removes all the CRM Tags from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmTag crmTag : findAll()) {
			remove(crmTag);
		}
	}

	/**
	 * Returns the number of CRM Tags.
	 *
	 * @return the number of CRM Tags
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMTAG);

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
	 * Returns the primaryKeys of CRM Contacts associated with the CRM Tag.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @return long[] of the primaryKeys of CRM Contacts associated with the CRM Tag
	 */
	@Override
	public long[] getCrmContactPrimaryKeys(long pk) {
		long[] pks = crmTagToCrmContactTableMapper.getRightPrimaryKeys(pk);

		return pks.clone();
	}

	/**
	 * Returns all the CRM Contacts associated with the CRM Tag.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @return the CRM Contacts associated with the CRM Tag
	 */
	@Override
	public List<contact.manager.model.CrmContact> getCrmContacts(long pk) {
		return getCrmContacts(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the CRM Contacts associated with the CRM Tag.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @return the range of CRM Contacts associated with the CRM Tag
	 */
	@Override
	public List<contact.manager.model.CrmContact> getCrmContacts(
		long pk, int start, int end) {

		return getCrmContacts(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts associated with the CRM Tag.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Contacts associated with the CRM Tag
	 */
	@Override
	public List<contact.manager.model.CrmContact> getCrmContacts(
		long pk, int start, int end,
		OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {

		return crmTagToCrmContactTableMapper.getRightBaseModels(
			pk, start, end, orderByComparator);
	}

	/**
	 * Returns the number of CRM Contacts associated with the CRM Tag.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @return the number of CRM Contacts associated with the CRM Tag
	 */
	@Override
	public int getCrmContactsSize(long pk) {
		long[] pks = crmTagToCrmContactTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the CRM Contact is associated with the CRM Tag.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContactPK the primary key of the CRM Contact
	 * @return <code>true</code> if the CRM Contact is associated with the CRM Tag; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCrmContact(long pk, long crmContactPK) {
		return crmTagToCrmContactTableMapper.containsTableMapping(
			pk, crmContactPK);
	}

	/**
	 * Returns <code>true</code> if the CRM Tag has any CRM Contacts associated with it.
	 *
	 * @param pk the primary key of the CRM Tag to check for associations with CRM Contacts
	 * @return <code>true</code> if the CRM Tag has any CRM Contacts associated with it; <code>false</code> otherwise
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
	 * Adds an association between the CRM Tag and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContactPK the primary key of the CRM Contact
	 */
	@Override
	public void addCrmContact(long pk, long crmContactPK) {
		CrmTag crmTag = fetchByPrimaryKey(pk);

		if (crmTag == null) {
			crmTagToCrmContactTableMapper.addTableMapping(
				CompanyThreadLocal.getCompanyId(), pk, crmContactPK);
		}
		else {
			crmTagToCrmContactTableMapper.addTableMapping(
				crmTag.getCompanyId(), pk, crmContactPK);
		}
	}

	/**
	 * Adds an association between the CRM Tag and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContact the CRM Contact
	 */
	@Override
	public void addCrmContact(
		long pk, contact.manager.model.CrmContact crmContact) {

		CrmTag crmTag = fetchByPrimaryKey(pk);

		if (crmTag == null) {
			crmTagToCrmContactTableMapper.addTableMapping(
				CompanyThreadLocal.getCompanyId(), pk,
				crmContact.getPrimaryKey());
		}
		else {
			crmTagToCrmContactTableMapper.addTableMapping(
				crmTag.getCompanyId(), pk, crmContact.getPrimaryKey());
		}
	}

	/**
	 * Adds an association between the CRM Tag and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContactPKs the primary keys of the CRM Contacts
	 */
	@Override
	public void addCrmContacts(long pk, long[] crmContactPKs) {
		long companyId = 0;

		CrmTag crmTag = fetchByPrimaryKey(pk);

		if (crmTag == null) {
			companyId = CompanyThreadLocal.getCompanyId();
		}
		else {
			companyId = crmTag.getCompanyId();
		}

		crmTagToCrmContactTableMapper.addTableMappings(
			companyId, pk, crmContactPKs);
	}

	/**
	 * Adds an association between the CRM Tag and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
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
	 * Clears all associations between the CRM Tag and its CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag to clear the associated CRM Contacts from
	 */
	@Override
	public void clearCrmContacts(long pk) {
		crmTagToCrmContactTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the CRM Tag and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContactPK the primary key of the CRM Contact
	 */
	@Override
	public void removeCrmContact(long pk, long crmContactPK) {
		crmTagToCrmContactTableMapper.deleteTableMapping(pk, crmContactPK);
	}

	/**
	 * Removes the association between the CRM Tag and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContact the CRM Contact
	 */
	@Override
	public void removeCrmContact(
		long pk, contact.manager.model.CrmContact crmContact) {

		crmTagToCrmContactTableMapper.deleteTableMapping(
			pk, crmContact.getPrimaryKey());
	}

	/**
	 * Removes the association between the CRM Tag and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContactPKs the primary keys of the CRM Contacts
	 */
	@Override
	public void removeCrmContacts(long pk, long[] crmContactPKs) {
		crmTagToCrmContactTableMapper.deleteTableMappings(pk, crmContactPKs);
	}

	/**
	 * Removes the association between the CRM Tag and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
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
	 * Sets the CRM Contacts associated with the CRM Tag, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContactPKs the primary keys of the CRM Contacts to be associated with the CRM Tag
	 */
	@Override
	public void setCrmContacts(long pk, long[] crmContactPKs) {
		Set<Long> newCrmContactPKsSet = SetUtil.fromArray(crmContactPKs);
		Set<Long> oldCrmContactPKsSet = SetUtil.fromArray(
			crmTagToCrmContactTableMapper.getRightPrimaryKeys(pk));

		Set<Long> removeCrmContactPKsSet = new HashSet<Long>(
			oldCrmContactPKsSet);

		removeCrmContactPKsSet.removeAll(newCrmContactPKsSet);

		crmTagToCrmContactTableMapper.deleteTableMappings(
			pk, ArrayUtil.toLongArray(removeCrmContactPKsSet));

		newCrmContactPKsSet.removeAll(oldCrmContactPKsSet);

		long companyId = 0;

		CrmTag crmTag = fetchByPrimaryKey(pk);

		if (crmTag == null) {
			companyId = CompanyThreadLocal.getCompanyId();
		}
		else {
			companyId = crmTag.getCompanyId();
		}

		crmTagToCrmContactTableMapper.addTableMappings(
			companyId, pk, ArrayUtil.toLongArray(newCrmContactPKsSet));
	}

	/**
	 * Sets the CRM Contacts associated with the CRM Tag, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContacts the CRM Contacts to be associated with the CRM Tag
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
		return CrmTagModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM Tag persistence.
	 */
	public void afterPropertiesSet() {
		crmTagToCrmContactTableMapper = TableMapperFactory.getTableMapper(
			"crm_contacts_tags", "companyId", "crmTagId", "crmContactId", this,
			crmContactPersistence);

		_finderPathWithPaginationFindAll = new FinderPath(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED,
			CrmTagModelImpl.FINDER_CACHE_ENABLED, CrmTagImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED,
			CrmTagModelImpl.FINDER_CACHE_ENABLED, CrmTagImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED,
			CrmTagModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED,
			CrmTagModelImpl.FINDER_CACHE_ENABLED, CrmTagImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED,
			CrmTagModelImpl.FINDER_CACHE_ENABLED, CrmTagImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			CrmTagModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED,
			CrmTagModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED,
			CrmTagModelImpl.FINDER_CACHE_ENABLED, CrmTagImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			CrmTagModelImpl.UUID_COLUMN_BITMASK |
			CrmTagModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED,
			CrmTagModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED,
			CrmTagModelImpl.FINDER_CACHE_ENABLED, CrmTagImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED,
			CrmTagModelImpl.FINDER_CACHE_ENABLED, CrmTagImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			CrmTagModelImpl.UUID_COLUMN_BITMASK |
			CrmTagModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			CrmTagModelImpl.ENTITY_CACHE_ENABLED,
			CrmTagModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(CrmTagImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("crm_contacts_tags");
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	@BeanReference(type = CrmContactPersistence.class)
	protected CrmContactPersistence crmContactPersistence;

	protected TableMapper<CrmTag, contact.manager.model.CrmContact>
		crmTagToCrmContactTableMapper;

	private static final String _SQL_SELECT_CRMTAG =
		"SELECT crmTag FROM CrmTag crmTag";

	private static final String _SQL_SELECT_CRMTAG_WHERE_PKS_IN =
		"SELECT crmTag FROM CrmTag crmTag WHERE crmTagId IN (";

	private static final String _SQL_SELECT_CRMTAG_WHERE =
		"SELECT crmTag FROM CrmTag crmTag WHERE ";

	private static final String _SQL_COUNT_CRMTAG =
		"SELECT COUNT(crmTag) FROM CrmTag crmTag";

	private static final String _SQL_COUNT_CRMTAG_WHERE =
		"SELECT COUNT(crmTag) FROM CrmTag crmTag WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "crmTag.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CrmTag exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CrmTag exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CrmTagPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}