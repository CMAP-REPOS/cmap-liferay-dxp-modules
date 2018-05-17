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
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.exception.NoSuchCrmKioskContactException;

import contact.manager.model.CrmKioskContact;
import contact.manager.model.impl.CrmKioskContactImpl;
import contact.manager.model.impl.CrmKioskContactModelImpl;

import contact.manager.service.persistence.CrmKioskContactPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

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
 * The persistence implementation for the CRM Kiosk Contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmKioskContactPersistence
 * @see contact.manager.service.persistence.CrmKioskContactUtil
 * @generated
 */
@ProviderType
public class CrmKioskContactPersistenceImpl extends BasePersistenceImpl<CrmKioskContact>
	implements CrmKioskContactPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmKioskContactUtil} to access the CRM Kiosk Contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmKioskContactImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskContactImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskContactImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CrmKioskContactModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM Kiosk Contacts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Kiosk Contacts
	 */
	@Override
	public List<CrmKioskContact> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Kiosk Contacts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Kiosk Contacts
	 * @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	 * @return the range of matching CRM Kiosk Contacts
	 */
	@Override
	public List<CrmKioskContact> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Kiosk Contacts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Kiosk Contacts
	 * @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Kiosk Contacts
	 */
	@Override
	public List<CrmKioskContact> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmKioskContact> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Kiosk Contacts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Kiosk Contacts
	 * @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Kiosk Contacts
	 */
	@Override
	public List<CrmKioskContact> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmKioskContact> orderByComparator,
		boolean retrieveFromCache) {
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

		List<CrmKioskContact> list = null;

		if (retrieveFromCache) {
			list = (List<CrmKioskContact>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmKioskContact crmKioskContact : list) {
					if (!Objects.equals(uuid, crmKioskContact.getUuid())) {
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

			query.append(_SQL_SELECT_CRMKIOSKCONTACT_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
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
				query.append(CrmKioskContactModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmKioskContact>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmKioskContact>)QueryUtil.list(q,
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
	 * Returns the first CRM Kiosk Contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Kiosk Contact
	 * @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	 */
	@Override
	public CrmKioskContact findByUuid_First(String uuid,
		OrderByComparator<CrmKioskContact> orderByComparator)
		throws NoSuchCrmKioskContactException {
		CrmKioskContact crmKioskContact = fetchByUuid_First(uuid,
				orderByComparator);

		if (crmKioskContact != null) {
			return crmKioskContact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmKioskContactException(msg.toString());
	}

	/**
	 * Returns the first CRM Kiosk Contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	 */
	@Override
	public CrmKioskContact fetchByUuid_First(String uuid,
		OrderByComparator<CrmKioskContact> orderByComparator) {
		List<CrmKioskContact> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Kiosk Contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Kiosk Contact
	 * @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	 */
	@Override
	public CrmKioskContact findByUuid_Last(String uuid,
		OrderByComparator<CrmKioskContact> orderByComparator)
		throws NoSuchCrmKioskContactException {
		CrmKioskContact crmKioskContact = fetchByUuid_Last(uuid,
				orderByComparator);

		if (crmKioskContact != null) {
			return crmKioskContact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmKioskContactException(msg.toString());
	}

	/**
	 * Returns the last CRM Kiosk Contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	 */
	@Override
	public CrmKioskContact fetchByUuid_Last(String uuid,
		OrderByComparator<CrmKioskContact> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmKioskContact> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Kiosk Contacts before and after the current CRM Kiosk Contact in the ordered set where uuid = &#63;.
	 *
	 * @param crmKioskContactId the primary key of the current CRM Kiosk Contact
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Kiosk Contact
	 * @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	 */
	@Override
	public CrmKioskContact[] findByUuid_PrevAndNext(long crmKioskContactId,
		String uuid, OrderByComparator<CrmKioskContact> orderByComparator)
		throws NoSuchCrmKioskContactException {
		CrmKioskContact crmKioskContact = findByPrimaryKey(crmKioskContactId);

		Session session = null;

		try {
			session = openSession();

			CrmKioskContact[] array = new CrmKioskContactImpl[3];

			array[0] = getByUuid_PrevAndNext(session, crmKioskContact, uuid,
					orderByComparator, true);

			array[1] = crmKioskContact;

			array[2] = getByUuid_PrevAndNext(session, crmKioskContact, uuid,
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

	protected CrmKioskContact getByUuid_PrevAndNext(Session session,
		CrmKioskContact crmKioskContact, String uuid,
		OrderByComparator<CrmKioskContact> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMKIOSKCONTACT_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
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
			query.append(CrmKioskContactModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmKioskContact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmKioskContact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Kiosk Contacts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmKioskContact crmKioskContact : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmKioskContact);
		}
	}

	/**
	 * Returns the number of CRM Kiosk Contacts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Kiosk Contacts
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMKIOSKCONTACT_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "crmKioskContact.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmKioskContact.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(crmKioskContact.uuid IS NULL OR crmKioskContact.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskContactImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmKioskContactModelImpl.UUID_COLUMN_BITMASK |
			CrmKioskContactModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the CRM Kiosk Contact where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmKioskContactException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Kiosk Contact
	 * @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	 */
	@Override
	public CrmKioskContact findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmKioskContactException {
		CrmKioskContact crmKioskContact = fetchByUUID_G(uuid, groupId);

		if (crmKioskContact == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchCrmKioskContactException(msg.toString());
		}

		return crmKioskContact;
	}

	/**
	 * Returns the CRM Kiosk Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	 */
	@Override
	public CrmKioskContact fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the CRM Kiosk Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	 */
	@Override
	public CrmKioskContact fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CrmKioskContact) {
			CrmKioskContact crmKioskContact = (CrmKioskContact)result;

			if (!Objects.equals(uuid, crmKioskContact.getUuid()) ||
					(groupId != crmKioskContact.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMKIOSKCONTACT_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
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

				List<CrmKioskContact> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CrmKioskContact crmKioskContact = list.get(0);

					result = crmKioskContact;

					cacheResult(crmKioskContact);

					if ((crmKioskContact.getUuid() == null) ||
							!crmKioskContact.getUuid().equals(uuid) ||
							(crmKioskContact.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, crmKioskContact);
					}
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
			return (CrmKioskContact)result;
		}
	}

	/**
	 * Removes the CRM Kiosk Contact where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Kiosk Contact that was removed
	 */
	@Override
	public CrmKioskContact removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmKioskContactException {
		CrmKioskContact crmKioskContact = findByUUID_G(uuid, groupId);

		return remove(crmKioskContact);
	}

	/**
	 * Returns the number of CRM Kiosk Contacts where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Kiosk Contacts
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMKIOSKCONTACT_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "crmKioskContact.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "crmKioskContact.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(crmKioskContact.uuid IS NULL OR crmKioskContact.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "crmKioskContact.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskContactImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmKioskContactModelImpl.UUID_COLUMN_BITMASK |
			CrmKioskContactModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Kiosk Contacts
	 */
	@Override
	public List<CrmKioskContact> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Kiosk Contacts
	 * @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	 * @return the range of matching CRM Kiosk Contacts
	 */
	@Override
	public List<CrmKioskContact> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Kiosk Contacts
	 * @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Kiosk Contacts
	 */
	@Override
	public List<CrmKioskContact> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<CrmKioskContact> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Kiosk Contacts
	 * @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Kiosk Contacts
	 */
	@Override
	public List<CrmKioskContact> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<CrmKioskContact> orderByComparator,
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

		List<CrmKioskContact> list = null;

		if (retrieveFromCache) {
			list = (List<CrmKioskContact>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmKioskContact crmKioskContact : list) {
					if (!Objects.equals(uuid, crmKioskContact.getUuid()) ||
							(companyId != crmKioskContact.getCompanyId())) {
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

			query.append(_SQL_SELECT_CRMKIOSKCONTACT_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
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
				query.append(CrmKioskContactModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmKioskContact>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmKioskContact>)QueryUtil.list(q,
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
	 * Returns the first CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Kiosk Contact
	 * @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	 */
	@Override
	public CrmKioskContact findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmKioskContact> orderByComparator)
		throws NoSuchCrmKioskContactException {
		CrmKioskContact crmKioskContact = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (crmKioskContact != null) {
			return crmKioskContact;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmKioskContactException(msg.toString());
	}

	/**
	 * Returns the first CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	 */
	@Override
	public CrmKioskContact fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmKioskContact> orderByComparator) {
		List<CrmKioskContact> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Kiosk Contact
	 * @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	 */
	@Override
	public CrmKioskContact findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmKioskContact> orderByComparator)
		throws NoSuchCrmKioskContactException {
		CrmKioskContact crmKioskContact = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (crmKioskContact != null) {
			return crmKioskContact;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmKioskContactException(msg.toString());
	}

	/**
	 * Returns the last CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	 */
	@Override
	public CrmKioskContact fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmKioskContact> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmKioskContact> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Kiosk Contacts before and after the current CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmKioskContactId the primary key of the current CRM Kiosk Contact
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Kiosk Contact
	 * @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	 */
	@Override
	public CrmKioskContact[] findByUuid_C_PrevAndNext(long crmKioskContactId,
		String uuid, long companyId,
		OrderByComparator<CrmKioskContact> orderByComparator)
		throws NoSuchCrmKioskContactException {
		CrmKioskContact crmKioskContact = findByPrimaryKey(crmKioskContactId);

		Session session = null;

		try {
			session = openSession();

			CrmKioskContact[] array = new CrmKioskContactImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, crmKioskContact, uuid,
					companyId, orderByComparator, true);

			array[1] = crmKioskContact;

			array[2] = getByUuid_C_PrevAndNext(session, crmKioskContact, uuid,
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

	protected CrmKioskContact getByUuid_C_PrevAndNext(Session session,
		CrmKioskContact crmKioskContact, String uuid, long companyId,
		OrderByComparator<CrmKioskContact> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMKIOSKCONTACT_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
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
			query.append(CrmKioskContactModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmKioskContact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmKioskContact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmKioskContact crmKioskContact : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmKioskContact);
		}
	}

	/**
	 * Returns the number of CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Kiosk Contacts
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMKIOSKCONTACT_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "crmKioskContact.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "crmKioskContact.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(crmKioskContact.uuid IS NULL OR crmKioskContact.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "crmKioskContact.companyId = ?";

	public CrmKioskContactPersistenceImpl() {
		setModelClass(CrmKioskContact.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

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
	 * Caches the CRM Kiosk Contact in the entity cache if it is enabled.
	 *
	 * @param crmKioskContact the CRM Kiosk Contact
	 */
	@Override
	public void cacheResult(CrmKioskContact crmKioskContact) {
		entityCache.putResult(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactImpl.class, crmKioskContact.getPrimaryKey(),
			crmKioskContact);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { crmKioskContact.getUuid(), crmKioskContact.getGroupId() },
			crmKioskContact);

		crmKioskContact.resetOriginalValues();
	}

	/**
	 * Caches the CRM Kiosk Contacts in the entity cache if it is enabled.
	 *
	 * @param crmKioskContacts the CRM Kiosk Contacts
	 */
	@Override
	public void cacheResult(List<CrmKioskContact> crmKioskContacts) {
		for (CrmKioskContact crmKioskContact : crmKioskContacts) {
			if (entityCache.getResult(
						CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
						CrmKioskContactImpl.class,
						crmKioskContact.getPrimaryKey()) == null) {
				cacheResult(crmKioskContact);
			}
			else {
				crmKioskContact.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM Kiosk Contacts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmKioskContactImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM Kiosk Contact.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmKioskContact crmKioskContact) {
		entityCache.removeResult(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactImpl.class, crmKioskContact.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmKioskContactModelImpl)crmKioskContact, true);
	}

	@Override
	public void clearCache(List<CrmKioskContact> crmKioskContacts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmKioskContact crmKioskContact : crmKioskContacts) {
			entityCache.removeResult(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
				CrmKioskContactImpl.class, crmKioskContact.getPrimaryKey());

			clearUniqueFindersCache((CrmKioskContactModelImpl)crmKioskContact,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		CrmKioskContactModelImpl crmKioskContactModelImpl) {
		Object[] args = new Object[] {
				crmKioskContactModelImpl.getUuid(),
				crmKioskContactModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			crmKioskContactModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmKioskContactModelImpl crmKioskContactModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					crmKioskContactModelImpl.getUuid(),
					crmKioskContactModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((crmKioskContactModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmKioskContactModelImpl.getOriginalUuid(),
					crmKioskContactModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new CRM Kiosk Contact with the primary key. Does not add the CRM Kiosk Contact to the database.
	 *
	 * @param crmKioskContactId the primary key for the new CRM Kiosk Contact
	 * @return the new CRM Kiosk Contact
	 */
	@Override
	public CrmKioskContact create(long crmKioskContactId) {
		CrmKioskContact crmKioskContact = new CrmKioskContactImpl();

		crmKioskContact.setNew(true);
		crmKioskContact.setPrimaryKey(crmKioskContactId);

		String uuid = PortalUUIDUtil.generate();

		crmKioskContact.setUuid(uuid);

		crmKioskContact.setCompanyId(companyProvider.getCompanyId());

		return crmKioskContact;
	}

	/**
	 * Removes the CRM Kiosk Contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmKioskContactId the primary key of the CRM Kiosk Contact
	 * @return the CRM Kiosk Contact that was removed
	 * @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	 */
	@Override
	public CrmKioskContact remove(long crmKioskContactId)
		throws NoSuchCrmKioskContactException {
		return remove((Serializable)crmKioskContactId);
	}

	/**
	 * Removes the CRM Kiosk Contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM Kiosk Contact
	 * @return the CRM Kiosk Contact that was removed
	 * @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	 */
	@Override
	public CrmKioskContact remove(Serializable primaryKey)
		throws NoSuchCrmKioskContactException {
		Session session = null;

		try {
			session = openSession();

			CrmKioskContact crmKioskContact = (CrmKioskContact)session.get(CrmKioskContactImpl.class,
					primaryKey);

			if (crmKioskContact == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmKioskContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmKioskContact);
		}
		catch (NoSuchCrmKioskContactException nsee) {
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
	protected CrmKioskContact removeImpl(CrmKioskContact crmKioskContact) {
		crmKioskContact = toUnwrappedModel(crmKioskContact);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmKioskContact)) {
				crmKioskContact = (CrmKioskContact)session.get(CrmKioskContactImpl.class,
						crmKioskContact.getPrimaryKeyObj());
			}

			if (crmKioskContact != null) {
				session.delete(crmKioskContact);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmKioskContact != null) {
			clearCache(crmKioskContact);
		}

		return crmKioskContact;
	}

	@Override
	public CrmKioskContact updateImpl(CrmKioskContact crmKioskContact) {
		crmKioskContact = toUnwrappedModel(crmKioskContact);

		boolean isNew = crmKioskContact.isNew();

		CrmKioskContactModelImpl crmKioskContactModelImpl = (CrmKioskContactModelImpl)crmKioskContact;

		if (Validator.isNull(crmKioskContact.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmKioskContact.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmKioskContact.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmKioskContact.setCreateDate(now);
			}
			else {
				crmKioskContact.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmKioskContactModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmKioskContact.setModifiedDate(now);
			}
			else {
				crmKioskContact.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmKioskContact.isNew()) {
				session.save(crmKioskContact);

				crmKioskContact.setNew(false);
			}
			else {
				crmKioskContact = (CrmKioskContact)session.merge(crmKioskContact);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmKioskContactModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { crmKioskContactModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					crmKioskContactModelImpl.getUuid(),
					crmKioskContactModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((crmKioskContactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmKioskContactModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { crmKioskContactModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((crmKioskContactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmKioskContactModelImpl.getOriginalUuid(),
						crmKioskContactModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						crmKioskContactModelImpl.getUuid(),
						crmKioskContactModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskContactImpl.class, crmKioskContact.getPrimaryKey(),
			crmKioskContact, false);

		clearUniqueFindersCache(crmKioskContactModelImpl, false);
		cacheUniqueFindersCache(crmKioskContactModelImpl);

		crmKioskContact.resetOriginalValues();

		return crmKioskContact;
	}

	protected CrmKioskContact toUnwrappedModel(CrmKioskContact crmKioskContact) {
		if (crmKioskContact instanceof CrmKioskContactImpl) {
			return crmKioskContact;
		}

		CrmKioskContactImpl crmKioskContactImpl = new CrmKioskContactImpl();

		crmKioskContactImpl.setNew(crmKioskContact.isNew());
		crmKioskContactImpl.setPrimaryKey(crmKioskContact.getPrimaryKey());

		crmKioskContactImpl.setUuid(crmKioskContact.getUuid());
		crmKioskContactImpl.setCrmKioskContactId(crmKioskContact.getCrmKioskContactId());
		crmKioskContactImpl.setGroupId(crmKioskContact.getGroupId());
		crmKioskContactImpl.setCompanyId(crmKioskContact.getCompanyId());
		crmKioskContactImpl.setUserId(crmKioskContact.getUserId());
		crmKioskContactImpl.setUserName(crmKioskContact.getUserName());
		crmKioskContactImpl.setCreateDate(crmKioskContact.getCreateDate());
		crmKioskContactImpl.setModifiedDate(crmKioskContact.getModifiedDate());

		return crmKioskContactImpl;
	}

	/**
	 * Returns the CRM Kiosk Contact with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Kiosk Contact
	 * @return the CRM Kiosk Contact
	 * @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	 */
	@Override
	public CrmKioskContact findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmKioskContactException {
		CrmKioskContact crmKioskContact = fetchByPrimaryKey(primaryKey);

		if (crmKioskContact == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmKioskContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmKioskContact;
	}

	/**
	 * Returns the CRM Kiosk Contact with the primary key or throws a {@link NoSuchCrmKioskContactException} if it could not be found.
	 *
	 * @param crmKioskContactId the primary key of the CRM Kiosk Contact
	 * @return the CRM Kiosk Contact
	 * @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	 */
	@Override
	public CrmKioskContact findByPrimaryKey(long crmKioskContactId)
		throws NoSuchCrmKioskContactException {
		return findByPrimaryKey((Serializable)crmKioskContactId);
	}

	/**
	 * Returns the CRM Kiosk Contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Kiosk Contact
	 * @return the CRM Kiosk Contact, or <code>null</code> if a CRM Kiosk Contact with the primary key could not be found
	 */
	@Override
	public CrmKioskContact fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
				CrmKioskContactImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmKioskContact crmKioskContact = (CrmKioskContact)serializable;

		if (crmKioskContact == null) {
			Session session = null;

			try {
				session = openSession();

				crmKioskContact = (CrmKioskContact)session.get(CrmKioskContactImpl.class,
						primaryKey);

				if (crmKioskContact != null) {
					cacheResult(crmKioskContact);
				}
				else {
					entityCache.putResult(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
						CrmKioskContactImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
					CrmKioskContactImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmKioskContact;
	}

	/**
	 * Returns the CRM Kiosk Contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmKioskContactId the primary key of the CRM Kiosk Contact
	 * @return the CRM Kiosk Contact, or <code>null</code> if a CRM Kiosk Contact with the primary key could not be found
	 */
	@Override
	public CrmKioskContact fetchByPrimaryKey(long crmKioskContactId) {
		return fetchByPrimaryKey((Serializable)crmKioskContactId);
	}

	@Override
	public Map<Serializable, CrmKioskContact> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmKioskContact> map = new HashMap<Serializable, CrmKioskContact>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmKioskContact crmKioskContact = fetchByPrimaryKey(primaryKey);

			if (crmKioskContact != null) {
				map.put(primaryKey, crmKioskContact);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
					CrmKioskContactImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmKioskContact)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMKIOSKCONTACT_WHERE_PKS_IN);

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

			for (CrmKioskContact crmKioskContact : (List<CrmKioskContact>)q.list()) {
				map.put(crmKioskContact.getPrimaryKeyObj(), crmKioskContact);

				cacheResult(crmKioskContact);

				uncachedPrimaryKeys.remove(crmKioskContact.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmKioskContactModelImpl.ENTITY_CACHE_ENABLED,
					CrmKioskContactImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM Kiosk Contacts.
	 *
	 * @return the CRM Kiosk Contacts
	 */
	@Override
	public List<CrmKioskContact> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Kiosk Contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Kiosk Contacts
	 * @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	 * @return the range of CRM Kiosk Contacts
	 */
	@Override
	public List<CrmKioskContact> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Kiosk Contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Kiosk Contacts
	 * @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Kiosk Contacts
	 */
	@Override
	public List<CrmKioskContact> findAll(int start, int end,
		OrderByComparator<CrmKioskContact> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Kiosk Contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Kiosk Contacts
	 * @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM Kiosk Contacts
	 */
	@Override
	public List<CrmKioskContact> findAll(int start, int end,
		OrderByComparator<CrmKioskContact> orderByComparator,
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

		List<CrmKioskContact> list = null;

		if (retrieveFromCache) {
			list = (List<CrmKioskContact>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMKIOSKCONTACT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMKIOSKCONTACT;

				if (pagination) {
					sql = sql.concat(CrmKioskContactModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmKioskContact>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmKioskContact>)QueryUtil.list(q,
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
	 * Removes all the CRM Kiosk Contacts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmKioskContact crmKioskContact : findAll()) {
			remove(crmKioskContact);
		}
	}

	/**
	 * Returns the number of CRM Kiosk Contacts.
	 *
	 * @return the number of CRM Kiosk Contacts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMKIOSKCONTACT);

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
		return CrmKioskContactModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM Kiosk Contact persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CrmKioskContactImpl.class.getName());
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
	private static final String _SQL_SELECT_CRMKIOSKCONTACT = "SELECT crmKioskContact FROM CrmKioskContact crmKioskContact";
	private static final String _SQL_SELECT_CRMKIOSKCONTACT_WHERE_PKS_IN = "SELECT crmKioskContact FROM CrmKioskContact crmKioskContact WHERE crmKioskContactId IN (";
	private static final String _SQL_SELECT_CRMKIOSKCONTACT_WHERE = "SELECT crmKioskContact FROM CrmKioskContact crmKioskContact WHERE ";
	private static final String _SQL_COUNT_CRMKIOSKCONTACT = "SELECT COUNT(crmKioskContact) FROM CrmKioskContact crmKioskContact";
	private static final String _SQL_COUNT_CRMKIOSKCONTACT_WHERE = "SELECT COUNT(crmKioskContact) FROM CrmKioskContact crmKioskContact WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmKioskContact.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmKioskContact exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CrmKioskContact exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CrmKioskContactPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}