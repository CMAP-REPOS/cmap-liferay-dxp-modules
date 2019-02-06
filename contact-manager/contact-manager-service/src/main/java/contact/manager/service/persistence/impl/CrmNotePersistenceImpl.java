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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.exception.NoSuchCrmNoteException;

import contact.manager.model.CrmNote;
import contact.manager.model.impl.CrmNoteImpl;
import contact.manager.model.impl.CrmNoteModelImpl;

import contact.manager.service.persistence.CrmNotePersistence;

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
 * The persistence implementation for the CRM Note service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmNotePersistence
 * @see contact.manager.service.persistence.CrmNoteUtil
 * @generated
 */
@ProviderType
public class CrmNotePersistenceImpl extends BasePersistenceImpl<CrmNote>
	implements CrmNotePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmNoteUtil} to access the CRM Note persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmNoteImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, CrmNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, CrmNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, CrmNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, CrmNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CrmNoteModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM Notes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Notes
	 */
	@Override
	public List<CrmNote> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Notes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @return the range of matching CRM Notes
	 */
	@Override
	public List<CrmNote> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Notes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Notes
	 */
	@Override
	public List<CrmNote> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmNote> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Notes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Notes
	 */
	@Override
	public List<CrmNote> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmNote> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<CrmNote> list = null;

		if (retrieveFromCache) {
			list = (List<CrmNote>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmNote crmNote : list) {
					if (!Objects.equals(uuid, crmNote.getUuid())) {
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

			query.append(_SQL_SELECT_CRMNOTE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmNoteModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmNote>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM Note in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote findByUuid_First(String uuid,
		OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException {
		CrmNote crmNote = fetchByUuid_First(uuid, orderByComparator);

		if (crmNote != null) {
			return crmNote;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmNoteException(msg.toString());
	}

	/**
	 * Returns the first CRM Note in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote fetchByUuid_First(String uuid,
		OrderByComparator<CrmNote> orderByComparator) {
		List<CrmNote> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Note in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote findByUuid_Last(String uuid,
		OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException {
		CrmNote crmNote = fetchByUuid_Last(uuid, orderByComparator);

		if (crmNote != null) {
			return crmNote;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchCrmNoteException(msg.toString());
	}

	/**
	 * Returns the last CRM Note in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote fetchByUuid_Last(String uuid,
		OrderByComparator<CrmNote> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmNote> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Notes before and after the current CRM Note in the ordered set where uuid = &#63;.
	 *
	 * @param crmNoteId the primary key of the current CRM Note
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Note
	 * @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	 */
	@Override
	public CrmNote[] findByUuid_PrevAndNext(long crmNoteId, String uuid,
		OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException {
		CrmNote crmNote = findByPrimaryKey(crmNoteId);

		Session session = null;

		try {
			session = openSession();

			CrmNote[] array = new CrmNoteImpl[3];

			array[0] = getByUuid_PrevAndNext(session, crmNote, uuid,
					orderByComparator, true);

			array[1] = crmNote;

			array[2] = getByUuid_PrevAndNext(session, crmNote, uuid,
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

	protected CrmNote getByUuid_PrevAndNext(Session session, CrmNote crmNote,
		String uuid, OrderByComparator<CrmNote> orderByComparator,
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

		query.append(_SQL_SELECT_CRMNOTE_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
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
			query.append(CrmNoteModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmNote);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmNote> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Notes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmNote crmNote : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmNote);
		}
	}

	/**
	 * Returns the number of CRM Notes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Notes
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMNOTE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "crmNote.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmNote.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(crmNote.uuid IS NULL OR crmNote.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, CrmNoteImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmNoteModelImpl.UUID_COLUMN_BITMASK |
			CrmNoteModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the CRM Note where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmNoteException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmNoteException {
		CrmNote crmNote = fetchByUUID_G(uuid, groupId);

		if (crmNote == null) {
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

			throw new NoSuchCrmNoteException(msg.toString());
		}

		return crmNote;
	}

	/**
	 * Returns the CRM Note where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the CRM Note where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CrmNote) {
			CrmNote crmNote = (CrmNote)result;

			if (!Objects.equals(uuid, crmNote.getUuid()) ||
					(groupId != crmNote.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMNOTE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
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

				List<CrmNote> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CrmNote crmNote = list.get(0);

					result = crmNote;

					cacheResult(crmNote);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

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
			return (CrmNote)result;
		}
	}

	/**
	 * Removes the CRM Note where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Note that was removed
	 */
	@Override
	public CrmNote removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmNoteException {
		CrmNote crmNote = findByUUID_G(uuid, groupId);

		return remove(crmNote);
	}

	/**
	 * Returns the number of CRM Notes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Notes
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMNOTE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "crmNote.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "crmNote.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(crmNote.uuid IS NULL OR crmNote.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "crmNote.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, CrmNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, CrmNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmNoteModelImpl.UUID_COLUMN_BITMASK |
			CrmNoteModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the CRM Notes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Notes
	 */
	@Override
	public List<CrmNote> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Notes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @return the range of matching CRM Notes
	 */
	@Override
	public List<CrmNote> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Notes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Notes
	 */
	@Override
	public List<CrmNote> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<CrmNote> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Notes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Notes
	 */
	@Override
	public List<CrmNote> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<CrmNote> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<CrmNote> list = null;

		if (retrieveFromCache) {
			list = (List<CrmNote>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmNote crmNote : list) {
					if (!Objects.equals(uuid, crmNote.getUuid()) ||
							(companyId != crmNote.getCompanyId())) {
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

			query.append(_SQL_SELECT_CRMNOTE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmNoteModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmNote>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException {
		CrmNote crmNote = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (crmNote != null) {
			return crmNote;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmNoteException(msg.toString());
	}

	/**
	 * Returns the first CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmNote> orderByComparator) {
		List<CrmNote> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException {
		CrmNote crmNote = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (crmNote != null) {
			return crmNote;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchCrmNoteException(msg.toString());
	}

	/**
	 * Returns the last CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmNote> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmNote> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Notes before and after the current CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmNoteId the primary key of the current CRM Note
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Note
	 * @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	 */
	@Override
	public CrmNote[] findByUuid_C_PrevAndNext(long crmNoteId, String uuid,
		long companyId, OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException {
		CrmNote crmNote = findByPrimaryKey(crmNoteId);

		Session session = null;

		try {
			session = openSession();

			CrmNote[] array = new CrmNoteImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, crmNote, uuid,
					companyId, orderByComparator, true);

			array[1] = crmNote;

			array[2] = getByUuid_C_PrevAndNext(session, crmNote, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmNote getByUuid_C_PrevAndNext(Session session, CrmNote crmNote,
		String uuid, long companyId,
		OrderByComparator<CrmNote> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMNOTE_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(CrmNoteModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmNote);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmNote> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Notes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmNote crmNote : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmNote);
		}
	}

	/**
	 * Returns the number of CRM Notes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Notes
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMNOTE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "crmNote.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "crmNote.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(crmNote.uuid IS NULL OR crmNote.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "crmNote.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CRMCONTACTID =
		new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, CrmNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCrmContactId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID =
		new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, CrmNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCrmContactId",
			new String[] { Long.class.getName() },
			CrmNoteModelImpl.CRMCONTACTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CRMCONTACTID = new FinderPath(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCrmContactId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the CRM Notes where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @return the matching CRM Notes
	 */
	@Override
	public List<CrmNote> findByCrmContactId(long crmContactId) {
		return findByCrmContactId(crmContactId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Notes where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @return the range of matching CRM Notes
	 */
	@Override
	public List<CrmNote> findByCrmContactId(long crmContactId, int start,
		int end) {
		return findByCrmContactId(crmContactId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Notes where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Notes
	 */
	@Override
	public List<CrmNote> findByCrmContactId(long crmContactId, int start,
		int end, OrderByComparator<CrmNote> orderByComparator) {
		return findByCrmContactId(crmContactId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the CRM Notes where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Notes
	 */
	@Override
	public List<CrmNote> findByCrmContactId(long crmContactId, int start,
		int end, OrderByComparator<CrmNote> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID;
			finderArgs = new Object[] { crmContactId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CRMCONTACTID;
			finderArgs = new Object[] {
					crmContactId,
					
					start, end, orderByComparator
				};
		}

		List<CrmNote> list = null;

		if (retrieveFromCache) {
			list = (List<CrmNote>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmNote crmNote : list) {
					if ((crmContactId != crmNote.getCrmContactId())) {
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

			query.append(_SQL_SELECT_CRMNOTE_WHERE);

			query.append(_FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(crmContactId);

				if (!pagination) {
					list = (List<CrmNote>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM Note in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote findByCrmContactId_First(long crmContactId,
		OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException {
		CrmNote crmNote = fetchByCrmContactId_First(crmContactId,
				orderByComparator);

		if (crmNote != null) {
			return crmNote;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("crmContactId=");
		msg.append(crmContactId);

		msg.append("}");

		throw new NoSuchCrmNoteException(msg.toString());
	}

	/**
	 * Returns the first CRM Note in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote fetchByCrmContactId_First(long crmContactId,
		OrderByComparator<CrmNote> orderByComparator) {
		List<CrmNote> list = findByCrmContactId(crmContactId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Note in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote findByCrmContactId_Last(long crmContactId,
		OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException {
		CrmNote crmNote = fetchByCrmContactId_Last(crmContactId,
				orderByComparator);

		if (crmNote != null) {
			return crmNote;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("crmContactId=");
		msg.append(crmContactId);

		msg.append("}");

		throw new NoSuchCrmNoteException(msg.toString());
	}

	/**
	 * Returns the last CRM Note in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	@Override
	public CrmNote fetchByCrmContactId_Last(long crmContactId,
		OrderByComparator<CrmNote> orderByComparator) {
		int count = countByCrmContactId(crmContactId);

		if (count == 0) {
			return null;
		}

		List<CrmNote> list = findByCrmContactId(crmContactId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Notes before and after the current CRM Note in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmNoteId the primary key of the current CRM Note
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Note
	 * @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	 */
	@Override
	public CrmNote[] findByCrmContactId_PrevAndNext(long crmNoteId,
		long crmContactId, OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException {
		CrmNote crmNote = findByPrimaryKey(crmNoteId);

		Session session = null;

		try {
			session = openSession();

			CrmNote[] array = new CrmNoteImpl[3];

			array[0] = getByCrmContactId_PrevAndNext(session, crmNote,
					crmContactId, orderByComparator, true);

			array[1] = crmNote;

			array[2] = getByCrmContactId_PrevAndNext(session, crmNote,
					crmContactId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmNote getByCrmContactId_PrevAndNext(Session session,
		CrmNote crmNote, long crmContactId,
		OrderByComparator<CrmNote> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMNOTE_WHERE);

		query.append(_FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2);

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
			query.append(CrmNoteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(crmContactId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(crmNote);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmNote> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Notes where crmContactId = &#63; from the database.
	 *
	 * @param crmContactId the crm contact ID
	 */
	@Override
	public void removeByCrmContactId(long crmContactId) {
		for (CrmNote crmNote : findByCrmContactId(crmContactId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmNote);
		}
	}

	/**
	 * Returns the number of CRM Notes where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @return the number of matching CRM Notes
	 */
	@Override
	public int countByCrmContactId(long crmContactId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CRMCONTACTID;

		Object[] finderArgs = new Object[] { crmContactId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMNOTE_WHERE);

			query.append(_FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(crmContactId);

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

	private static final String _FINDER_COLUMN_CRMCONTACTID_CRMCONTACTID_2 = "crmNote.crmContactId = ?";

	public CrmNotePersistenceImpl() {
		setModelClass(CrmNote.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the CRM Note in the entity cache if it is enabled.
	 *
	 * @param crmNote the CRM Note
	 */
	@Override
	public void cacheResult(CrmNote crmNote) {
		entityCache.putResult(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteImpl.class, crmNote.getPrimaryKey(), crmNote);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { crmNote.getUuid(), crmNote.getGroupId() }, crmNote);

		crmNote.resetOriginalValues();
	}

	/**
	 * Caches the CRM Notes in the entity cache if it is enabled.
	 *
	 * @param crmNotes the CRM Notes
	 */
	@Override
	public void cacheResult(List<CrmNote> crmNotes) {
		for (CrmNote crmNote : crmNotes) {
			if (entityCache.getResult(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
						CrmNoteImpl.class, crmNote.getPrimaryKey()) == null) {
				cacheResult(crmNote);
			}
			else {
				crmNote.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM Notes.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmNoteImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM Note.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmNote crmNote) {
		entityCache.removeResult(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteImpl.class, crmNote.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmNoteModelImpl)crmNote, true);
	}

	@Override
	public void clearCache(List<CrmNote> crmNotes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmNote crmNote : crmNotes) {
			entityCache.removeResult(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
				CrmNoteImpl.class, crmNote.getPrimaryKey());

			clearUniqueFindersCache((CrmNoteModelImpl)crmNote, true);
		}
	}

	protected void cacheUniqueFindersCache(CrmNoteModelImpl crmNoteModelImpl) {
		Object[] args = new Object[] {
				crmNoteModelImpl.getUuid(), crmNoteModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			crmNoteModelImpl, false);
	}

	protected void clearUniqueFindersCache(CrmNoteModelImpl crmNoteModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					crmNoteModelImpl.getUuid(), crmNoteModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((crmNoteModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmNoteModelImpl.getOriginalUuid(),
					crmNoteModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new CRM Note with the primary key. Does not add the CRM Note to the database.
	 *
	 * @param crmNoteId the primary key for the new CRM Note
	 * @return the new CRM Note
	 */
	@Override
	public CrmNote create(long crmNoteId) {
		CrmNote crmNote = new CrmNoteImpl();

		crmNote.setNew(true);
		crmNote.setPrimaryKey(crmNoteId);

		String uuid = PortalUUIDUtil.generate();

		crmNote.setUuid(uuid);

		crmNote.setCompanyId(companyProvider.getCompanyId());

		return crmNote;
	}

	/**
	 * Removes the CRM Note with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmNoteId the primary key of the CRM Note
	 * @return the CRM Note that was removed
	 * @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	 */
	@Override
	public CrmNote remove(long crmNoteId) throws NoSuchCrmNoteException {
		return remove((Serializable)crmNoteId);
	}

	/**
	 * Removes the CRM Note with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM Note
	 * @return the CRM Note that was removed
	 * @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	 */
	@Override
	public CrmNote remove(Serializable primaryKey)
		throws NoSuchCrmNoteException {
		Session session = null;

		try {
			session = openSession();

			CrmNote crmNote = (CrmNote)session.get(CrmNoteImpl.class, primaryKey);

			if (crmNote == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmNoteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmNote);
		}
		catch (NoSuchCrmNoteException nsee) {
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
	protected CrmNote removeImpl(CrmNote crmNote) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmNote)) {
				crmNote = (CrmNote)session.get(CrmNoteImpl.class,
						crmNote.getPrimaryKeyObj());
			}

			if (crmNote != null) {
				session.delete(crmNote);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmNote != null) {
			clearCache(crmNote);
		}

		return crmNote;
	}

	@Override
	public CrmNote updateImpl(CrmNote crmNote) {
		boolean isNew = crmNote.isNew();

		if (!(crmNote instanceof CrmNoteModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(crmNote.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(crmNote);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in crmNote proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CrmNote implementation " +
				crmNote.getClass());
		}

		CrmNoteModelImpl crmNoteModelImpl = (CrmNoteModelImpl)crmNote;

		if (Validator.isNull(crmNote.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmNote.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmNote.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmNote.setCreateDate(now);
			}
			else {
				crmNote.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmNoteModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmNote.setModifiedDate(now);
			}
			else {
				crmNote.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmNote.isNew()) {
				session.save(crmNote);

				crmNote.setNew(false);
			}
			else {
				crmNote = (CrmNote)session.merge(crmNote);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmNoteModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { crmNoteModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					crmNoteModelImpl.getUuid(), crmNoteModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { crmNoteModelImpl.getCrmContactId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CRMCONTACTID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((crmNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { crmNoteModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { crmNoteModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((crmNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmNoteModelImpl.getOriginalUuid(),
						crmNoteModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						crmNoteModelImpl.getUuid(),
						crmNoteModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((crmNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmNoteModelImpl.getOriginalCrmContactId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRMCONTACTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID,
					args);

				args = new Object[] { crmNoteModelImpl.getCrmContactId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRMCONTACTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRMCONTACTID,
					args);
			}
		}

		entityCache.putResult(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
			CrmNoteImpl.class, crmNote.getPrimaryKey(), crmNote, false);

		clearUniqueFindersCache(crmNoteModelImpl, false);
		cacheUniqueFindersCache(crmNoteModelImpl);

		crmNote.resetOriginalValues();

		return crmNote;
	}

	/**
	 * Returns the CRM Note with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Note
	 * @return the CRM Note
	 * @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	 */
	@Override
	public CrmNote findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmNoteException {
		CrmNote crmNote = fetchByPrimaryKey(primaryKey);

		if (crmNote == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmNoteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmNote;
	}

	/**
	 * Returns the CRM Note with the primary key or throws a {@link NoSuchCrmNoteException} if it could not be found.
	 *
	 * @param crmNoteId the primary key of the CRM Note
	 * @return the CRM Note
	 * @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	 */
	@Override
	public CrmNote findByPrimaryKey(long crmNoteId)
		throws NoSuchCrmNoteException {
		return findByPrimaryKey((Serializable)crmNoteId);
	}

	/**
	 * Returns the CRM Note with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Note
	 * @return the CRM Note, or <code>null</code> if a CRM Note with the primary key could not be found
	 */
	@Override
	public CrmNote fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
				CrmNoteImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmNote crmNote = (CrmNote)serializable;

		if (crmNote == null) {
			Session session = null;

			try {
				session = openSession();

				crmNote = (CrmNote)session.get(CrmNoteImpl.class, primaryKey);

				if (crmNote != null) {
					cacheResult(crmNote);
				}
				else {
					entityCache.putResult(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
						CrmNoteImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
					CrmNoteImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmNote;
	}

	/**
	 * Returns the CRM Note with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmNoteId the primary key of the CRM Note
	 * @return the CRM Note, or <code>null</code> if a CRM Note with the primary key could not be found
	 */
	@Override
	public CrmNote fetchByPrimaryKey(long crmNoteId) {
		return fetchByPrimaryKey((Serializable)crmNoteId);
	}

	@Override
	public Map<Serializable, CrmNote> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmNote> map = new HashMap<Serializable, CrmNote>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmNote crmNote = fetchByPrimaryKey(primaryKey);

			if (crmNote != null) {
				map.put(primaryKey, crmNote);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
					CrmNoteImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmNote)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMNOTE_WHERE_PKS_IN);

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

			for (CrmNote crmNote : (List<CrmNote>)q.list()) {
				map.put(crmNote.getPrimaryKeyObj(), crmNote);

				cacheResult(crmNote);

				uncachedPrimaryKeys.remove(crmNote.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmNoteModelImpl.ENTITY_CACHE_ENABLED,
					CrmNoteImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM Notes.
	 *
	 * @return the CRM Notes
	 */
	@Override
	public List<CrmNote> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Notes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @return the range of CRM Notes
	 */
	@Override
	public List<CrmNote> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Notes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Notes
	 */
	@Override
	public List<CrmNote> findAll(int start, int end,
		OrderByComparator<CrmNote> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Notes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM Notes
	 */
	@Override
	public List<CrmNote> findAll(int start, int end,
		OrderByComparator<CrmNote> orderByComparator, boolean retrieveFromCache) {
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

		List<CrmNote> list = null;

		if (retrieveFromCache) {
			list = (List<CrmNote>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMNOTE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMNOTE;

				if (pagination) {
					sql = sql.concat(CrmNoteModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmNote>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmNote>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the CRM Notes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmNote crmNote : findAll()) {
			remove(crmNote);
		}
	}

	/**
	 * Returns the number of CRM Notes.
	 *
	 * @return the number of CRM Notes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMNOTE);

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
		return CrmNoteModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM Note persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CrmNoteImpl.class.getName());
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
	private static final String _SQL_SELECT_CRMNOTE = "SELECT crmNote FROM CrmNote crmNote";
	private static final String _SQL_SELECT_CRMNOTE_WHERE_PKS_IN = "SELECT crmNote FROM CrmNote crmNote WHERE crmNoteId IN (";
	private static final String _SQL_SELECT_CRMNOTE_WHERE = "SELECT crmNote FROM CrmNote crmNote WHERE ";
	private static final String _SQL_COUNT_CRMNOTE = "SELECT COUNT(crmNote) FROM CrmNote crmNote";
	private static final String _SQL_COUNT_CRMNOTE_WHERE = "SELECT COUNT(crmNote) FROM CrmNote crmNote WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmNote.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmNote exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CrmNote exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CrmNotePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}