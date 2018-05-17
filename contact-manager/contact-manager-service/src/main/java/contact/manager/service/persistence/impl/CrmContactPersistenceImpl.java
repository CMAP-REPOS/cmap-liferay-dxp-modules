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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.service.persistence.impl.TableMapper;
import com.liferay.portal.kernel.service.persistence.impl.TableMapperFactory;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.exception.NoSuchCrmContactException;

import contact.manager.model.CrmContact;
import contact.manager.model.impl.CrmContactImpl;
import contact.manager.model.impl.CrmContactModelImpl;

import contact.manager.service.persistence.CrmContactPersistence;
import contact.manager.service.persistence.CrmGroupPersistence;
import contact.manager.service.persistence.CrmTagPersistence;

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
 * The persistence implementation for the CRM Contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactPersistence
 * @see contact.manager.service.persistence.CrmContactUtil
 * @generated
 */
@ProviderType
public class CrmContactPersistenceImpl extends BasePersistenceImpl<CrmContact>
	implements CrmContactPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmContactUtil} to access the CRM Contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmContactImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CrmContactModelImpl.UUID_COLUMN_BITMASK |
			CrmContactModelImpl.LASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM Contacts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contacts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @return the range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmContact> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmContact> orderByComparator,
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

		List<CrmContact> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContact>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContact crmContact : list) {
					if (!Objects.equals(uuid, crmContact.getUuid())) {
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

			query.append(_SQL_SELECT_CRMCONTACT_WHERE);

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
				query.append(CrmContactModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM Contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByUuid_First(String uuid,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByUuid_First(uuid, orderByComparator);

		if (crmContact != null) {
			return crmContact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByUuid_First(String uuid,
		OrderByComparator<CrmContact> orderByComparator) {
		List<CrmContact> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByUuid_Last(String uuid,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByUuid_Last(uuid, orderByComparator);

		if (crmContact != null) {
			return crmContact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByUuid_Last(String uuid,
		OrderByComparator<CrmContact> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmContact> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contacts before and after the current CRM Contact in the ordered set where uuid = &#63;.
	 *
	 * @param crmContactId the primary key of the current CRM Contact
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact
	 * @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	 */
	@Override
	public CrmContact[] findByUuid_PrevAndNext(long crmContactId, String uuid,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = findByPrimaryKey(crmContactId);

		Session session = null;

		try {
			session = openSession();

			CrmContact[] array = new CrmContactImpl[3];

			array[0] = getByUuid_PrevAndNext(session, crmContact, uuid,
					orderByComparator, true);

			array[1] = crmContact;

			array[2] = getByUuid_PrevAndNext(session, crmContact, uuid,
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

	protected CrmContact getByUuid_PrevAndNext(Session session,
		CrmContact crmContact, String uuid,
		OrderByComparator<CrmContact> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMCONTACT_WHERE);

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
			query.append(CrmContactModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmContact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contacts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmContact crmContact : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmContact);
		}
	}

	/**
	 * Returns the number of CRM Contacts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Contacts
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCONTACT_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "crmContact.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmContact.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(crmContact.uuid IS NULL OR crmContact.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmContactModelImpl.UUID_COLUMN_BITMASK |
			CrmContactModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the CRM Contact where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmContactException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByUUID_G(uuid, groupId);

		if (crmContact == null) {
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

			throw new NoSuchCrmContactException(msg.toString());
		}

		return crmContact;
	}

	/**
	 * Returns the CRM Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the CRM Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CrmContact) {
			CrmContact crmContact = (CrmContact)result;

			if (!Objects.equals(uuid, crmContact.getUuid()) ||
					(groupId != crmContact.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMCONTACT_WHERE);

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

				List<CrmContact> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CrmContact crmContact = list.get(0);

					result = crmContact;

					cacheResult(crmContact);

					if ((crmContact.getUuid() == null) ||
							!crmContact.getUuid().equals(uuid) ||
							(crmContact.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, crmContact);
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
			return (CrmContact)result;
		}
	}

	/**
	 * Removes the CRM Contact where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Contact that was removed
	 */
	@Override
	public CrmContact removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmContactException {
		CrmContact crmContact = findByUUID_G(uuid, groupId);

		return remove(crmContact);
	}

	/**
	 * Returns the number of CRM Contacts where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Contacts
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCONTACT_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "crmContact.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "crmContact.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(crmContact.uuid IS NULL OR crmContact.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "crmContact.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmContactModelImpl.UUID_COLUMN_BITMASK |
			CrmContactModelImpl.COMPANYID_COLUMN_BITMASK |
			CrmContactModelImpl.LASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @return the range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<CrmContact> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<CrmContact> orderByComparator,
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

		List<CrmContact> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContact>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContact crmContact : list) {
					if (!Objects.equals(uuid, crmContact.getUuid()) ||
							(companyId != crmContact.getCompanyId())) {
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

			query.append(_SQL_SELECT_CRMCONTACT_WHERE);

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
				query.append(CrmContactModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (crmContact != null) {
			return crmContact;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmContact> orderByComparator) {
		List<CrmContact> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (crmContact != null) {
			return crmContact;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmContact> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmContact> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contacts before and after the current CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmContactId the primary key of the current CRM Contact
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact
	 * @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	 */
	@Override
	public CrmContact[] findByUuid_C_PrevAndNext(long crmContactId,
		String uuid, long companyId,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = findByPrimaryKey(crmContactId);

		Session session = null;

		try {
			session = openSession();

			CrmContact[] array = new CrmContactImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, crmContact, uuid,
					companyId, orderByComparator, true);

			array[1] = crmContact;

			array[2] = getByUuid_C_PrevAndNext(session, crmContact, uuid,
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

	protected CrmContact getByUuid_C_PrevAndNext(Session session,
		CrmContact crmContact, String uuid, long companyId,
		OrderByComparator<CrmContact> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMCONTACT_WHERE);

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
			query.append(CrmContactModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmContact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contacts where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmContact crmContact : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmContact);
		}
	}

	/**
	 * Returns the number of CRM Contacts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Contacts
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCONTACT_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "crmContact.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "crmContact.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(crmContact.uuid IS NULL OR crmContact.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "crmContact.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS =
		new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPrimaryEmailAddress",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS =
		new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPrimaryEmailAddress",
			new String[] { String.class.getName() },
			CrmContactModelImpl.PRIMARYEMAILADDRESS_COLUMN_BITMASK |
			CrmContactModelImpl.LASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESS = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPrimaryEmailAddress",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM Contacts where primaryEmailAddress = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @return the matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByPrimaryEmailAddress(
		String primaryEmailAddress) {
		return findByPrimaryEmailAddress(primaryEmailAddress,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contacts where primaryEmailAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @return the range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByPrimaryEmailAddress(
		String primaryEmailAddress, int start, int end) {
		return findByPrimaryEmailAddress(primaryEmailAddress, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts where primaryEmailAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByPrimaryEmailAddress(
		String primaryEmailAddress, int start, int end,
		OrderByComparator<CrmContact> orderByComparator) {
		return findByPrimaryEmailAddress(primaryEmailAddress, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts where primaryEmailAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByPrimaryEmailAddress(
		String primaryEmailAddress, int start, int end,
		OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS;
			finderArgs = new Object[] { primaryEmailAddress };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS;
			finderArgs = new Object[] {
					primaryEmailAddress,
					
					start, end, orderByComparator
				};
		}

		List<CrmContact> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContact>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContact crmContact : list) {
					if (!Objects.equals(primaryEmailAddress,
								crmContact.getPrimaryEmailAddress())) {
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

			query.append(_SQL_SELECT_CRMCONTACT_WHERE);

			boolean bindPrimaryEmailAddress = false;

			if (primaryEmailAddress == null) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_1);
			}
			else if (primaryEmailAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_3);
			}
			else {
				bindPrimaryEmailAddress = true;

				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmContactModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPrimaryEmailAddress) {
					qPos.add(primaryEmailAddress);
				}

				if (!pagination) {
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByPrimaryEmailAddress_First(
		String primaryEmailAddress,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByPrimaryEmailAddress_First(primaryEmailAddress,
				orderByComparator);

		if (crmContact != null) {
			return crmContact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("primaryEmailAddress=");
		msg.append(primaryEmailAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByPrimaryEmailAddress_First(
		String primaryEmailAddress,
		OrderByComparator<CrmContact> orderByComparator) {
		List<CrmContact> list = findByPrimaryEmailAddress(primaryEmailAddress,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByPrimaryEmailAddress_Last(
		String primaryEmailAddress,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByPrimaryEmailAddress_Last(primaryEmailAddress,
				orderByComparator);

		if (crmContact != null) {
			return crmContact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("primaryEmailAddress=");
		msg.append(primaryEmailAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByPrimaryEmailAddress_Last(
		String primaryEmailAddress,
		OrderByComparator<CrmContact> orderByComparator) {
		int count = countByPrimaryEmailAddress(primaryEmailAddress);

		if (count == 0) {
			return null;
		}

		List<CrmContact> list = findByPrimaryEmailAddress(primaryEmailAddress,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contacts before and after the current CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	 *
	 * @param crmContactId the primary key of the current CRM Contact
	 * @param primaryEmailAddress the primary email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact
	 * @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	 */
	@Override
	public CrmContact[] findByPrimaryEmailAddress_PrevAndNext(
		long crmContactId, String primaryEmailAddress,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = findByPrimaryKey(crmContactId);

		Session session = null;

		try {
			session = openSession();

			CrmContact[] array = new CrmContactImpl[3];

			array[0] = getByPrimaryEmailAddress_PrevAndNext(session,
					crmContact, primaryEmailAddress, orderByComparator, true);

			array[1] = crmContact;

			array[2] = getByPrimaryEmailAddress_PrevAndNext(session,
					crmContact, primaryEmailAddress, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CrmContact getByPrimaryEmailAddress_PrevAndNext(Session session,
		CrmContact crmContact, String primaryEmailAddress,
		OrderByComparator<CrmContact> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMCONTACT_WHERE);

		boolean bindPrimaryEmailAddress = false;

		if (primaryEmailAddress == null) {
			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_1);
		}
		else if (primaryEmailAddress.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_3);
		}
		else {
			bindPrimaryEmailAddress = true;

			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_2);
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
			query.append(CrmContactModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPrimaryEmailAddress) {
			qPos.add(primaryEmailAddress);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(crmContact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contacts where primaryEmailAddress = &#63; from the database.
	 *
	 * @param primaryEmailAddress the primary email address
	 */
	@Override
	public void removeByPrimaryEmailAddress(String primaryEmailAddress) {
		for (CrmContact crmContact : findByPrimaryEmailAddress(
				primaryEmailAddress, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmContact);
		}
	}

	/**
	 * Returns the number of CRM Contacts where primaryEmailAddress = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @return the number of matching CRM Contacts
	 */
	@Override
	public int countByPrimaryEmailAddress(String primaryEmailAddress) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESS;

		Object[] finderArgs = new Object[] { primaryEmailAddress };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCONTACT_WHERE);

			boolean bindPrimaryEmailAddress = false;

			if (primaryEmailAddress == null) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_1);
			}
			else if (primaryEmailAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_3);
			}
			else {
				bindPrimaryEmailAddress = true;

				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPrimaryEmailAddress) {
					qPos.add(primaryEmailAddress);
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

	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_1 =
		"crmContact.primaryEmailAddress IS NULL";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_2 =
		"crmContact.primaryEmailAddress = ?";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_3 =
		"(crmContact.primaryEmailAddress IS NULL OR crmContact.primaryEmailAddress = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
			new String[] { String.class.getName() },
			CrmContactModelImpl.STATUS_COLUMN_BITMASK |
			CrmContactModelImpl.LASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM Contacts where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByStatus(String status) {
		return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contacts where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @return the range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByStatus(String status, int start, int end) {
		return findByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByStatus(String status, int start, int end,
		OrderByComparator<CrmContact> orderByComparator) {
		return findByStatus(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByStatus(String status, int start, int end,
		OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status, start, end, orderByComparator };
		}

		List<CrmContact> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContact>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContact crmContact : list) {
					if (!Objects.equals(status, crmContact.getStatus())) {
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

			query.append(_SQL_SELECT_CRMCONTACT_WHERE);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmContactModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM Contact in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByStatus_First(String status,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByStatus_First(status, orderByComparator);

		if (crmContact != null) {
			return crmContact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByStatus_First(String status,
		OrderByComparator<CrmContact> orderByComparator) {
		List<CrmContact> list = findByStatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByStatus_Last(String status,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByStatus_Last(status, orderByComparator);

		if (crmContact != null) {
			return crmContact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByStatus_Last(String status,
		OrderByComparator<CrmContact> orderByComparator) {
		int count = countByStatus(status);

		if (count == 0) {
			return null;
		}

		List<CrmContact> list = findByStatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contacts before and after the current CRM Contact in the ordered set where status = &#63;.
	 *
	 * @param crmContactId the primary key of the current CRM Contact
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact
	 * @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	 */
	@Override
	public CrmContact[] findByStatus_PrevAndNext(long crmContactId,
		String status, OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = findByPrimaryKey(crmContactId);

		Session session = null;

		try {
			session = openSession();

			CrmContact[] array = new CrmContactImpl[3];

			array[0] = getByStatus_PrevAndNext(session, crmContact, status,
					orderByComparator, true);

			array[1] = crmContact;

			array[2] = getByStatus_PrevAndNext(session, crmContact, status,
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

	protected CrmContact getByStatus_PrevAndNext(Session session,
		CrmContact crmContact, String status,
		OrderByComparator<CrmContact> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMCONTACT_WHERE);

		boolean bindStatus = false;

		if (status == null) {
			query.append(_FINDER_COLUMN_STATUS_STATUS_1);
		}
		else if (status.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);
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
			query.append(CrmContactModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmContact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contacts where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeByStatus(String status) {
		for (CrmContact crmContact : findByStatus(status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmContact);
		}
	}

	/**
	 * Returns the number of CRM Contacts where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching CRM Contacts
	 */
	@Override
	public int countByStatus(String status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCONTACT_WHERE);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
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

	private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "crmContact.status IS NULL";
	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "crmContact.status = ?";
	private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(crmContact.status IS NULL OR crmContact.status = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS =
		new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPrimaryEmailAddressAndStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS =
		new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPrimaryEmailAddressAndStatus",
			new String[] { String.class.getName(), String.class.getName() },
			CrmContactModelImpl.PRIMARYEMAILADDRESS_COLUMN_BITMASK |
			CrmContactModelImpl.STATUS_COLUMN_BITMASK |
			CrmContactModelImpl.LASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESSANDSTATUS =
		new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPrimaryEmailAddressAndStatus",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @return the matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status) {
		return findByPrimaryEmailAddressAndStatus(primaryEmailAddress, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @return the range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status, int start, int end) {
		return findByPrimaryEmailAddressAndStatus(primaryEmailAddress, status,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status, int start, int end,
		OrderByComparator<CrmContact> orderByComparator) {
		return findByPrimaryEmailAddressAndStatus(primaryEmailAddress, status,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status, int start, int end,
		OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS;
			finderArgs = new Object[] { primaryEmailAddress, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS;
			finderArgs = new Object[] {
					primaryEmailAddress, status,
					
					start, end, orderByComparator
				};
		}

		List<CrmContact> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContact>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContact crmContact : list) {
					if (!Objects.equals(primaryEmailAddress,
								crmContact.getPrimaryEmailAddress()) ||
							!Objects.equals(status, crmContact.getStatus())) {
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

			query.append(_SQL_SELECT_CRMCONTACT_WHERE);

			boolean bindPrimaryEmailAddress = false;

			if (primaryEmailAddress == null) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_1);
			}
			else if (primaryEmailAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_3);
			}
			else {
				bindPrimaryEmailAddress = true;

				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_2);
			}

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmContactModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPrimaryEmailAddress) {
					qPos.add(primaryEmailAddress);
				}

				if (bindStatus) {
					qPos.add(status);
				}

				if (!pagination) {
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByPrimaryEmailAddressAndStatus_First(
		String primaryEmailAddress, String status,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByPrimaryEmailAddressAndStatus_First(primaryEmailAddress,
				status, orderByComparator);

		if (crmContact != null) {
			return crmContact;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("primaryEmailAddress=");
		msg.append(primaryEmailAddress);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByPrimaryEmailAddressAndStatus_First(
		String primaryEmailAddress, String status,
		OrderByComparator<CrmContact> orderByComparator) {
		List<CrmContact> list = findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
				status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByPrimaryEmailAddressAndStatus_Last(
		String primaryEmailAddress, String status,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByPrimaryEmailAddressAndStatus_Last(primaryEmailAddress,
				status, orderByComparator);

		if (crmContact != null) {
			return crmContact;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("primaryEmailAddress=");
		msg.append(primaryEmailAddress);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByPrimaryEmailAddressAndStatus_Last(
		String primaryEmailAddress, String status,
		OrderByComparator<CrmContact> orderByComparator) {
		int count = countByPrimaryEmailAddressAndStatus(primaryEmailAddress,
				status);

		if (count == 0) {
			return null;
		}

		List<CrmContact> list = findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
				status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contacts before and after the current CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param crmContactId the primary key of the current CRM Contact
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact
	 * @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	 */
	@Override
	public CrmContact[] findByPrimaryEmailAddressAndStatus_PrevAndNext(
		long crmContactId, String primaryEmailAddress, String status,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = findByPrimaryKey(crmContactId);

		Session session = null;

		try {
			session = openSession();

			CrmContact[] array = new CrmContactImpl[3];

			array[0] = getByPrimaryEmailAddressAndStatus_PrevAndNext(session,
					crmContact, primaryEmailAddress, status, orderByComparator,
					true);

			array[1] = crmContact;

			array[2] = getByPrimaryEmailAddressAndStatus_PrevAndNext(session,
					crmContact, primaryEmailAddress, status, orderByComparator,
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

	protected CrmContact getByPrimaryEmailAddressAndStatus_PrevAndNext(
		Session session, CrmContact crmContact, String primaryEmailAddress,
		String status, OrderByComparator<CrmContact> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMCONTACT_WHERE);

		boolean bindPrimaryEmailAddress = false;

		if (primaryEmailAddress == null) {
			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_1);
		}
		else if (primaryEmailAddress.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_3);
		}
		else {
			bindPrimaryEmailAddress = true;

			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_2);
		}

		boolean bindStatus = false;

		if (status == null) {
			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_1);
		}
		else if (status.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_2);
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
			query.append(CrmContactModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPrimaryEmailAddress) {
			qPos.add(primaryEmailAddress);
		}

		if (bindStatus) {
			qPos.add(status);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(crmContact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63; from the database.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 */
	@Override
	public void removeByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status) {
		for (CrmContact crmContact : findByPrimaryEmailAddressAndStatus(
				primaryEmailAddress, status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmContact);
		}
	}

	/**
	 * Returns the number of CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @return the number of matching CRM Contacts
	 */
	@Override
	public int countByPrimaryEmailAddressAndStatus(String primaryEmailAddress,
		String status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESSANDSTATUS;

		Object[] finderArgs = new Object[] { primaryEmailAddress, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMCONTACT_WHERE);

			boolean bindPrimaryEmailAddress = false;

			if (primaryEmailAddress == null) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_1);
			}
			else if (primaryEmailAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_3);
			}
			else {
				bindPrimaryEmailAddress = true;

				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_2);
			}

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPrimaryEmailAddress) {
					qPos.add(primaryEmailAddress);
				}

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

	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_1 =
		"crmContact.primaryEmailAddress IS NULL AND ";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_2 =
		"crmContact.primaryEmailAddress = ? AND ";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_3 =
		"(crmContact.primaryEmailAddress IS NULL OR crmContact.primaryEmailAddress = '') AND ";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_1 =
		"crmContact.status IS NULL";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_2 =
		"crmContact.status = ?";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_3 =
		"(crmContact.status IS NULL OR crmContact.status = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_CONSTANTCONTACTID = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByConstantContactId",
			new String[] { Long.class.getName() },
			CrmContactModelImpl.CONSTANTCONTACTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONSTANTCONTACTID = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConstantContactId", new String[] { Long.class.getName() });

	/**
	 * Returns the CRM Contact where constantContactId = &#63; or throws a {@link NoSuchCrmContactException} if it could not be found.
	 *
	 * @param constantContactId the constant contact ID
	 * @return the matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByConstantContactId(long constantContactId)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByConstantContactId(constantContactId);

		if (crmContact == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("constantContactId=");
			msg.append(constantContactId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchCrmContactException(msg.toString());
		}

		return crmContact;
	}

	/**
	 * Returns the CRM Contact where constantContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param constantContactId the constant contact ID
	 * @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByConstantContactId(long constantContactId) {
		return fetchByConstantContactId(constantContactId, true);
	}

	/**
	 * Returns the CRM Contact where constantContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param constantContactId the constant contact ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByConstantContactId(long constantContactId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { constantContactId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
					finderArgs, this);
		}

		if (result instanceof CrmContact) {
			CrmContact crmContact = (CrmContact)result;

			if ((constantContactId != crmContact.getConstantContactId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CRMCONTACT_WHERE);

			query.append(_FINDER_COLUMN_CONSTANTCONTACTID_CONSTANTCONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(constantContactId);

				List<CrmContact> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"CrmContactPersistenceImpl.fetchByConstantContactId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CrmContact crmContact = list.get(0);

					result = crmContact;

					cacheResult(crmContact);

					if ((crmContact.getConstantContactId() != constantContactId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
							finderArgs, crmContact);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
					finderArgs);

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
			return (CrmContact)result;
		}
	}

	/**
	 * Removes the CRM Contact where constantContactId = &#63; from the database.
	 *
	 * @param constantContactId the constant contact ID
	 * @return the CRM Contact that was removed
	 */
	@Override
	public CrmContact removeByConstantContactId(long constantContactId)
		throws NoSuchCrmContactException {
		CrmContact crmContact = findByConstantContactId(constantContactId);

		return remove(crmContact);
	}

	/**
	 * Returns the number of CRM Contacts where constantContactId = &#63;.
	 *
	 * @param constantContactId the constant contact ID
	 * @return the number of matching CRM Contacts
	 */
	@Override
	public int countByConstantContactId(long constantContactId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONSTANTCONTACTID;

		Object[] finderArgs = new Object[] { constantContactId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCONTACT_WHERE);

			query.append(_FINDER_COLUMN_CONSTANTCONTACTID_CONSTANTCONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(constantContactId);

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

	private static final String _FINDER_COLUMN_CONSTANTCONTACTID_CONSTANTCONTACTID_2 =
		"crmContact.constantContactId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VIPFLAG = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVipFlag",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VIPFLAG =
		new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, CrmContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVipFlag",
			new String[] { Boolean.class.getName() },
			CrmContactModelImpl.ISVIP_COLUMN_BITMASK |
			CrmContactModelImpl.LASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VIPFLAG = new FinderPath(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVipFlag",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the CRM Contacts where isVip = &#63;.
	 *
	 * @param isVip the is vip
	 * @return the matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByVipFlag(boolean isVip) {
		return findByVipFlag(isVip, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contacts where isVip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isVip the is vip
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @return the range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByVipFlag(boolean isVip, int start, int end) {
		return findByVipFlag(isVip, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts where isVip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isVip the is vip
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByVipFlag(boolean isVip, int start, int end,
		OrderByComparator<CrmContact> orderByComparator) {
		return findByVipFlag(isVip, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts where isVip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isVip the is vip
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Contacts
	 */
	@Override
	public List<CrmContact> findByVipFlag(boolean isVip, int start, int end,
		OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VIPFLAG;
			finderArgs = new Object[] { isVip };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VIPFLAG;
			finderArgs = new Object[] { isVip, start, end, orderByComparator };
		}

		List<CrmContact> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContact>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmContact crmContact : list) {
					if ((isVip != crmContact.getIsVip())) {
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

			query.append(_SQL_SELECT_CRMCONTACT_WHERE);

			query.append(_FINDER_COLUMN_VIPFLAG_ISVIP_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CrmContactModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isVip);

				if (!pagination) {
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first CRM Contact in the ordered set where isVip = &#63;.
	 *
	 * @param isVip the is vip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByVipFlag_First(boolean isVip,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByVipFlag_First(isVip, orderByComparator);

		if (crmContact != null) {
			return crmContact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isVip=");
		msg.append(isVip);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactException(msg.toString());
	}

	/**
	 * Returns the first CRM Contact in the ordered set where isVip = &#63;.
	 *
	 * @param isVip the is vip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByVipFlag_First(boolean isVip,
		OrderByComparator<CrmContact> orderByComparator) {
		List<CrmContact> list = findByVipFlag(isVip, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Contact in the ordered set where isVip = &#63;.
	 *
	 * @param isVip the is vip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact
	 * @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact findByVipFlag_Last(boolean isVip,
		OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByVipFlag_Last(isVip, orderByComparator);

		if (crmContact != null) {
			return crmContact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isVip=");
		msg.append(isVip);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmContactException(msg.toString());
	}

	/**
	 * Returns the last CRM Contact in the ordered set where isVip = &#63;.
	 *
	 * @param isVip the is vip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Override
	public CrmContact fetchByVipFlag_Last(boolean isVip,
		OrderByComparator<CrmContact> orderByComparator) {
		int count = countByVipFlag(isVip);

		if (count == 0) {
			return null;
		}

		List<CrmContact> list = findByVipFlag(isVip, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Contacts before and after the current CRM Contact in the ordered set where isVip = &#63;.
	 *
	 * @param crmContactId the primary key of the current CRM Contact
	 * @param isVip the is vip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact
	 * @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	 */
	@Override
	public CrmContact[] findByVipFlag_PrevAndNext(long crmContactId,
		boolean isVip, OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException {
		CrmContact crmContact = findByPrimaryKey(crmContactId);

		Session session = null;

		try {
			session = openSession();

			CrmContact[] array = new CrmContactImpl[3];

			array[0] = getByVipFlag_PrevAndNext(session, crmContact, isVip,
					orderByComparator, true);

			array[1] = crmContact;

			array[2] = getByVipFlag_PrevAndNext(session, crmContact, isVip,
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

	protected CrmContact getByVipFlag_PrevAndNext(Session session,
		CrmContact crmContact, boolean isVip,
		OrderByComparator<CrmContact> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMCONTACT_WHERE);

		query.append(_FINDER_COLUMN_VIPFLAG_ISVIP_2);

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
			query.append(CrmContactModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isVip);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(crmContact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmContact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Contacts where isVip = &#63; from the database.
	 *
	 * @param isVip the is vip
	 */
	@Override
	public void removeByVipFlag(boolean isVip) {
		for (CrmContact crmContact : findByVipFlag(isVip, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(crmContact);
		}
	}

	/**
	 * Returns the number of CRM Contacts where isVip = &#63;.
	 *
	 * @param isVip the is vip
	 * @return the number of matching CRM Contacts
	 */
	@Override
	public int countByVipFlag(boolean isVip) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VIPFLAG;

		Object[] finderArgs = new Object[] { isVip };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMCONTACT_WHERE);

			query.append(_FINDER_COLUMN_VIPFLAG_ISVIP_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isVip);

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

	private static final String _FINDER_COLUMN_VIPFLAG_ISVIP_2 = "crmContact.isVip = ?";

	public CrmContactPersistenceImpl() {
		setModelClass(CrmContact.class);

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
	 * Caches the CRM Contact in the entity cache if it is enabled.
	 *
	 * @param crmContact the CRM Contact
	 */
	@Override
	public void cacheResult(CrmContact crmContact) {
		entityCache.putResult(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactImpl.class, crmContact.getPrimaryKey(), crmContact);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { crmContact.getUuid(), crmContact.getGroupId() },
			crmContact);

		finderCache.putResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
			new Object[] { crmContact.getConstantContactId() }, crmContact);

		crmContact.resetOriginalValues();
	}

	/**
	 * Caches the CRM Contacts in the entity cache if it is enabled.
	 *
	 * @param crmContacts the CRM Contacts
	 */
	@Override
	public void cacheResult(List<CrmContact> crmContacts) {
		for (CrmContact crmContact : crmContacts) {
			if (entityCache.getResult(
						CrmContactModelImpl.ENTITY_CACHE_ENABLED,
						CrmContactImpl.class, crmContact.getPrimaryKey()) == null) {
				cacheResult(crmContact);
			}
			else {
				crmContact.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM Contacts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmContactImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM Contact.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmContact crmContact) {
		entityCache.removeResult(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactImpl.class, crmContact.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmContactModelImpl)crmContact, true);
	}

	@Override
	public void clearCache(List<CrmContact> crmContacts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmContact crmContact : crmContacts) {
			entityCache.removeResult(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
				CrmContactImpl.class, crmContact.getPrimaryKey());

			clearUniqueFindersCache((CrmContactModelImpl)crmContact, true);
		}
	}

	protected void cacheUniqueFindersCache(
		CrmContactModelImpl crmContactModelImpl) {
		Object[] args = new Object[] {
				crmContactModelImpl.getUuid(), crmContactModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			crmContactModelImpl, false);

		args = new Object[] { crmContactModelImpl.getConstantContactId() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_CONSTANTCONTACTID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID, args,
			crmContactModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmContactModelImpl crmContactModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					crmContactModelImpl.getUuid(),
					crmContactModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((crmContactModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmContactModelImpl.getOriginalUuid(),
					crmContactModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					crmContactModelImpl.getConstantContactId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CONSTANTCONTACTID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
				args);
		}

		if ((crmContactModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CONSTANTCONTACTID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmContactModelImpl.getOriginalConstantContactId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CONSTANTCONTACTID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
				args);
		}
	}

	/**
	 * Creates a new CRM Contact with the primary key. Does not add the CRM Contact to the database.
	 *
	 * @param crmContactId the primary key for the new CRM Contact
	 * @return the new CRM Contact
	 */
	@Override
	public CrmContact create(long crmContactId) {
		CrmContact crmContact = new CrmContactImpl();

		crmContact.setNew(true);
		crmContact.setPrimaryKey(crmContactId);

		String uuid = PortalUUIDUtil.generate();

		crmContact.setUuid(uuid);

		crmContact.setCompanyId(companyProvider.getCompanyId());

		return crmContact;
	}

	/**
	 * Removes the CRM Contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmContactId the primary key of the CRM Contact
	 * @return the CRM Contact that was removed
	 * @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	 */
	@Override
	public CrmContact remove(long crmContactId)
		throws NoSuchCrmContactException {
		return remove((Serializable)crmContactId);
	}

	/**
	 * Removes the CRM Contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM Contact
	 * @return the CRM Contact that was removed
	 * @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	 */
	@Override
	public CrmContact remove(Serializable primaryKey)
		throws NoSuchCrmContactException {
		Session session = null;

		try {
			session = openSession();

			CrmContact crmContact = (CrmContact)session.get(CrmContactImpl.class,
					primaryKey);

			if (crmContact == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmContact);
		}
		catch (NoSuchCrmContactException nsee) {
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
	protected CrmContact removeImpl(CrmContact crmContact) {
		crmContact = toUnwrappedModel(crmContact);

		crmContactToCrmGroupTableMapper.deleteLeftPrimaryKeyTableMappings(crmContact.getPrimaryKey());

		crmContactToCrmTagTableMapper.deleteLeftPrimaryKeyTableMappings(crmContact.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmContact)) {
				crmContact = (CrmContact)session.get(CrmContactImpl.class,
						crmContact.getPrimaryKeyObj());
			}

			if (crmContact != null) {
				session.delete(crmContact);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmContact != null) {
			clearCache(crmContact);
		}

		return crmContact;
	}

	@Override
	public CrmContact updateImpl(CrmContact crmContact) {
		crmContact = toUnwrappedModel(crmContact);

		boolean isNew = crmContact.isNew();

		CrmContactModelImpl crmContactModelImpl = (CrmContactModelImpl)crmContact;

		if (Validator.isNull(crmContact.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmContact.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmContact.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmContact.setCreateDate(now);
			}
			else {
				crmContact.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmContactModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmContact.setModifiedDate(now);
			}
			else {
				crmContact.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmContact.isNew()) {
				session.save(crmContact);

				crmContact.setNew(false);
			}
			else {
				crmContact = (CrmContact)session.merge(crmContact);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmContactModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { crmContactModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					crmContactModelImpl.getUuid(),
					crmContactModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { crmContactModelImpl.getPrimaryEmailAddress() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESS,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS,
				args);

			args = new Object[] { crmContactModelImpl.getStatus() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
				args);

			args = new Object[] {
					crmContactModelImpl.getPrimaryEmailAddress(),
					crmContactModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESSANDSTATUS,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS,
				args);

			args = new Object[] { crmContactModelImpl.getIsVip() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_VIPFLAG, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VIPFLAG,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((crmContactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { crmContactModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((crmContactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactModelImpl.getOriginalUuid(),
						crmContactModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						crmContactModelImpl.getUuid(),
						crmContactModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((crmContactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactModelImpl.getOriginalPrimaryEmailAddress()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS,
					args);

				args = new Object[] { crmContactModelImpl.getPrimaryEmailAddress() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS,
					args);
			}

			if ((crmContactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { crmContactModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}

			if ((crmContactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactModelImpl.getOriginalPrimaryEmailAddress(),
						crmContactModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESSANDSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS,
					args);

				args = new Object[] {
						crmContactModelImpl.getPrimaryEmailAddress(),
						crmContactModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESSANDSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS,
					args);
			}

			if ((crmContactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VIPFLAG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmContactModelImpl.getOriginalIsVip()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VIPFLAG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VIPFLAG,
					args);

				args = new Object[] { crmContactModelImpl.getIsVip() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VIPFLAG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VIPFLAG,
					args);
			}
		}

		entityCache.putResult(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
			CrmContactImpl.class, crmContact.getPrimaryKey(), crmContact, false);

		clearUniqueFindersCache(crmContactModelImpl, false);
		cacheUniqueFindersCache(crmContactModelImpl);

		crmContact.resetOriginalValues();

		return crmContact;
	}

	protected CrmContact toUnwrappedModel(CrmContact crmContact) {
		if (crmContact instanceof CrmContactImpl) {
			return crmContact;
		}

		CrmContactImpl crmContactImpl = new CrmContactImpl();

		crmContactImpl.setNew(crmContact.isNew());
		crmContactImpl.setPrimaryKey(crmContact.getPrimaryKey());

		crmContactImpl.setUuid(crmContact.getUuid());
		crmContactImpl.setCrmContactId(crmContact.getCrmContactId());
		crmContactImpl.setConstantContactId(crmContact.getConstantContactId());
		crmContactImpl.setGroupId(crmContact.getGroupId());
		crmContactImpl.setCompanyId(crmContact.getCompanyId());
		crmContactImpl.setUserId(crmContact.getUserId());
		crmContactImpl.setUserName(crmContact.getUserName());
		crmContactImpl.setCreateDate(crmContact.getCreateDate());
		crmContactImpl.setModifiedDate(crmContact.getModifiedDate());
		crmContactImpl.setPrefix(crmContact.getPrefix());
		crmContactImpl.setSalutation(crmContact.getSalutation());
		crmContactImpl.setFirstName(crmContact.getFirstName());
		crmContactImpl.setMiddleName(crmContact.getMiddleName());
		crmContactImpl.setLastName(crmContact.getLastName());
		crmContactImpl.setOrganization(crmContact.getOrganization());
		crmContactImpl.setJobTitle(crmContact.getJobTitle());
		crmContactImpl.setPrimaryAddress1(crmContact.getPrimaryAddress1());
		crmContactImpl.setPrimaryAddress2(crmContact.getPrimaryAddress2());
		crmContactImpl.setPrimaryAddressCity(crmContact.getPrimaryAddressCity());
		crmContactImpl.setPrimaryAddressState(crmContact.getPrimaryAddressState());
		crmContactImpl.setPrimaryAddressZip(crmContact.getPrimaryAddressZip());
		crmContactImpl.setPrimaryAddressCounty(crmContact.getPrimaryAddressCounty());
		crmContactImpl.setPrimaryAddressCountry(crmContact.getPrimaryAddressCountry());
		crmContactImpl.setSecondaryAddress1(crmContact.getSecondaryAddress1());
		crmContactImpl.setSecondaryAddress2(crmContact.getSecondaryAddress2());
		crmContactImpl.setSecondaryAddressCity(crmContact.getSecondaryAddressCity());
		crmContactImpl.setSecondaryAddressState(crmContact.getSecondaryAddressState());
		crmContactImpl.setSecondaryAddressZip(crmContact.getSecondaryAddressZip());
		crmContactImpl.setSecondaryAddressCounty(crmContact.getSecondaryAddressCounty());
		crmContactImpl.setSecondaryAddressCountry(crmContact.getSecondaryAddressCountry());
		crmContactImpl.setPrimaryPhone(crmContact.getPrimaryPhone());
		crmContactImpl.setPrimaryPhoneExtension(crmContact.getPrimaryPhoneExtension());
		crmContactImpl.setPrimaryFax(crmContact.getPrimaryFax());
		crmContactImpl.setPrimaryCell(crmContact.getPrimaryCell());
		crmContactImpl.setPrimaryEmailAddress(crmContact.getPrimaryEmailAddress());
		crmContactImpl.setAlternateContact(crmContact.getAlternateContact());
		crmContactImpl.setAlternateEmail(crmContact.getAlternateEmail());
		crmContactImpl.setIsVip(crmContact.isIsVip());
		crmContactImpl.setFacebookId(crmContact.getFacebookId());
		crmContactImpl.setTwitterHandle(crmContact.getTwitterHandle());
		crmContactImpl.setLinkedInUrl(crmContact.getLinkedInUrl());
		crmContactImpl.setStatus(crmContact.getStatus());
		crmContactImpl.setKioskUuid(crmContact.getKioskUuid());
		crmContactImpl.setImageFileEntryId(crmContact.getImageFileEntryId());
		crmContactImpl.setTagsList(crmContact.getTagsList());
		crmContactImpl.setGroupsList(crmContact.getGroupsList());

		return crmContactImpl;
	}

	/**
	 * Returns the CRM Contact with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Contact
	 * @return the CRM Contact
	 * @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	 */
	@Override
	public CrmContact findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmContactException {
		CrmContact crmContact = fetchByPrimaryKey(primaryKey);

		if (crmContact == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmContact;
	}

	/**
	 * Returns the CRM Contact with the primary key or throws a {@link NoSuchCrmContactException} if it could not be found.
	 *
	 * @param crmContactId the primary key of the CRM Contact
	 * @return the CRM Contact
	 * @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	 */
	@Override
	public CrmContact findByPrimaryKey(long crmContactId)
		throws NoSuchCrmContactException {
		return findByPrimaryKey((Serializable)crmContactId);
	}

	/**
	 * Returns the CRM Contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Contact
	 * @return the CRM Contact, or <code>null</code> if a CRM Contact with the primary key could not be found
	 */
	@Override
	public CrmContact fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
				CrmContactImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmContact crmContact = (CrmContact)serializable;

		if (crmContact == null) {
			Session session = null;

			try {
				session = openSession();

				crmContact = (CrmContact)session.get(CrmContactImpl.class,
						primaryKey);

				if (crmContact != null) {
					cacheResult(crmContact);
				}
				else {
					entityCache.putResult(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
						CrmContactImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
					CrmContactImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmContact;
	}

	/**
	 * Returns the CRM Contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmContactId the primary key of the CRM Contact
	 * @return the CRM Contact, or <code>null</code> if a CRM Contact with the primary key could not be found
	 */
	@Override
	public CrmContact fetchByPrimaryKey(long crmContactId) {
		return fetchByPrimaryKey((Serializable)crmContactId);
	}

	@Override
	public Map<Serializable, CrmContact> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmContact> map = new HashMap<Serializable, CrmContact>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmContact crmContact = fetchByPrimaryKey(primaryKey);

			if (crmContact != null) {
				map.put(primaryKey, crmContact);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
					CrmContactImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmContact)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMCONTACT_WHERE_PKS_IN);

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

			for (CrmContact crmContact : (List<CrmContact>)q.list()) {
				map.put(crmContact.getPrimaryKeyObj(), crmContact);

				cacheResult(crmContact);

				uncachedPrimaryKeys.remove(crmContact.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmContactModelImpl.ENTITY_CACHE_ENABLED,
					CrmContactImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM Contacts.
	 *
	 * @return the CRM Contacts
	 */
	@Override
	public List<CrmContact> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @return the range of CRM Contacts
	 */
	@Override
	public List<CrmContact> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Contacts
	 */
	@Override
	public List<CrmContact> findAll(int start, int end,
		OrderByComparator<CrmContact> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM Contacts
	 */
	@Override
	public List<CrmContact> findAll(int start, int end,
		OrderByComparator<CrmContact> orderByComparator,
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

		List<CrmContact> list = null;

		if (retrieveFromCache) {
			list = (List<CrmContact>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMCONTACT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMCONTACT;

				if (pagination) {
					sql = sql.concat(CrmContactModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmContact>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the CRM Contacts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmContact crmContact : findAll()) {
			remove(crmContact);
		}
	}

	/**
	 * Returns the number of CRM Contacts.
	 *
	 * @return the number of CRM Contacts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMCONTACT);

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

	/**
	 * Returns the primaryKeys of CRM Groups associated with the CRM Contact.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @return long[] of the primaryKeys of CRM Groups associated with the CRM Contact
	 */
	@Override
	public long[] getCrmGroupPrimaryKeys(long pk) {
		long[] pks = crmContactToCrmGroupTableMapper.getRightPrimaryKeys(pk);

		return pks.clone();
	}

	/**
	 * Returns all the CRM Groups associated with the CRM Contact.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @return the CRM Groups associated with the CRM Contact
	 */
	@Override
	public List<contact.manager.model.CrmGroup> getCrmGroups(long pk) {
		return getCrmGroups(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the CRM Groups associated with the CRM Contact.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @return the range of CRM Groups associated with the CRM Contact
	 */
	@Override
	public List<contact.manager.model.CrmGroup> getCrmGroups(long pk,
		int start, int end) {
		return getCrmGroups(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Groups associated with the CRM Contact.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Groups associated with the CRM Contact
	 */
	@Override
	public List<contact.manager.model.CrmGroup> getCrmGroups(long pk,
		int start, int end,
		OrderByComparator<contact.manager.model.CrmGroup> orderByComparator) {
		return crmContactToCrmGroupTableMapper.getRightBaseModels(pk, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of CRM Groups associated with the CRM Contact.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @return the number of CRM Groups associated with the CRM Contact
	 */
	@Override
	public int getCrmGroupsSize(long pk) {
		long[] pks = crmContactToCrmGroupTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the CRM Group is associated with the CRM Contact.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmGroupPK the primary key of the CRM Group
	 * @return <code>true</code> if the CRM Group is associated with the CRM Contact; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCrmGroup(long pk, long crmGroupPK) {
		return crmContactToCrmGroupTableMapper.containsTableMapping(pk,
			crmGroupPK);
	}

	/**
	 * Returns <code>true</code> if the CRM Contact has any CRM Groups associated with it.
	 *
	 * @param pk the primary key of the CRM Contact to check for associations with CRM Groups
	 * @return <code>true</code> if the CRM Contact has any CRM Groups associated with it; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCrmGroups(long pk) {
		if (getCrmGroupsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the CRM Contact and the CRM Group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmGroupPK the primary key of the CRM Group
	 */
	@Override
	public void addCrmGroup(long pk, long crmGroupPK) {
		CrmContact crmContact = fetchByPrimaryKey(pk);

		if (crmContact == null) {
			crmContactToCrmGroupTableMapper.addTableMapping(companyProvider.getCompanyId(),
				pk, crmGroupPK);
		}
		else {
			crmContactToCrmGroupTableMapper.addTableMapping(crmContact.getCompanyId(),
				pk, crmGroupPK);
		}
	}

	/**
	 * Adds an association between the CRM Contact and the CRM Group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmGroup the CRM Group
	 */
	@Override
	public void addCrmGroup(long pk, contact.manager.model.CrmGroup crmGroup) {
		CrmContact crmContact = fetchByPrimaryKey(pk);

		if (crmContact == null) {
			crmContactToCrmGroupTableMapper.addTableMapping(companyProvider.getCompanyId(),
				pk, crmGroup.getPrimaryKey());
		}
		else {
			crmContactToCrmGroupTableMapper.addTableMapping(crmContact.getCompanyId(),
				pk, crmGroup.getPrimaryKey());
		}
	}

	/**
	 * Adds an association between the CRM Contact and the CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmGroupPKs the primary keys of the CRM Groups
	 */
	@Override
	public void addCrmGroups(long pk, long[] crmGroupPKs) {
		long companyId = 0;

		CrmContact crmContact = fetchByPrimaryKey(pk);

		if (crmContact == null) {
			companyId = companyProvider.getCompanyId();
		}
		else {
			companyId = crmContact.getCompanyId();
		}

		crmContactToCrmGroupTableMapper.addTableMappings(companyId, pk,
			crmGroupPKs);
	}

	/**
	 * Adds an association between the CRM Contact and the CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmGroups the CRM Groups
	 */
	@Override
	public void addCrmGroups(long pk,
		List<contact.manager.model.CrmGroup> crmGroups) {
		addCrmGroups(pk,
			ListUtil.toLongArray(crmGroups,
				contact.manager.model.CrmGroup.CRM_GROUP_ID_ACCESSOR));
	}

	/**
	 * Clears all associations between the CRM Contact and its CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact to clear the associated CRM Groups from
	 */
	@Override
	public void clearCrmGroups(long pk) {
		crmContactToCrmGroupTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the CRM Contact and the CRM Group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmGroupPK the primary key of the CRM Group
	 */
	@Override
	public void removeCrmGroup(long pk, long crmGroupPK) {
		crmContactToCrmGroupTableMapper.deleteTableMapping(pk, crmGroupPK);
	}

	/**
	 * Removes the association between the CRM Contact and the CRM Group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmGroup the CRM Group
	 */
	@Override
	public void removeCrmGroup(long pk, contact.manager.model.CrmGroup crmGroup) {
		crmContactToCrmGroupTableMapper.deleteTableMapping(pk,
			crmGroup.getPrimaryKey());
	}

	/**
	 * Removes the association between the CRM Contact and the CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmGroupPKs the primary keys of the CRM Groups
	 */
	@Override
	public void removeCrmGroups(long pk, long[] crmGroupPKs) {
		crmContactToCrmGroupTableMapper.deleteTableMappings(pk, crmGroupPKs);
	}

	/**
	 * Removes the association between the CRM Contact and the CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmGroups the CRM Groups
	 */
	@Override
	public void removeCrmGroups(long pk,
		List<contact.manager.model.CrmGroup> crmGroups) {
		removeCrmGroups(pk,
			ListUtil.toLongArray(crmGroups,
				contact.manager.model.CrmGroup.CRM_GROUP_ID_ACCESSOR));
	}

	/**
	 * Sets the CRM Groups associated with the CRM Contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmGroupPKs the primary keys of the CRM Groups to be associated with the CRM Contact
	 */
	@Override
	public void setCrmGroups(long pk, long[] crmGroupPKs) {
		Set<Long> newCrmGroupPKsSet = SetUtil.fromArray(crmGroupPKs);
		Set<Long> oldCrmGroupPKsSet = SetUtil.fromArray(crmContactToCrmGroupTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeCrmGroupPKsSet = new HashSet<Long>(oldCrmGroupPKsSet);

		removeCrmGroupPKsSet.removeAll(newCrmGroupPKsSet);

		crmContactToCrmGroupTableMapper.deleteTableMappings(pk,
			ArrayUtil.toLongArray(removeCrmGroupPKsSet));

		newCrmGroupPKsSet.removeAll(oldCrmGroupPKsSet);

		long companyId = 0;

		CrmContact crmContact = fetchByPrimaryKey(pk);

		if (crmContact == null) {
			companyId = companyProvider.getCompanyId();
		}
		else {
			companyId = crmContact.getCompanyId();
		}

		crmContactToCrmGroupTableMapper.addTableMappings(companyId, pk,
			ArrayUtil.toLongArray(newCrmGroupPKsSet));
	}

	/**
	 * Sets the CRM Groups associated with the CRM Contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmGroups the CRM Groups to be associated with the CRM Contact
	 */
	@Override
	public void setCrmGroups(long pk,
		List<contact.manager.model.CrmGroup> crmGroups) {
		try {
			long[] crmGroupPKs = new long[crmGroups.size()];

			for (int i = 0; i < crmGroups.size(); i++) {
				contact.manager.model.CrmGroup crmGroup = crmGroups.get(i);

				crmGroupPKs[i] = crmGroup.getPrimaryKey();
			}

			setCrmGroups(pk, crmGroupPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
	}

	/**
	 * Returns the primaryKeys of CRM Tags associated with the CRM Contact.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @return long[] of the primaryKeys of CRM Tags associated with the CRM Contact
	 */
	@Override
	public long[] getCrmTagPrimaryKeys(long pk) {
		long[] pks = crmContactToCrmTagTableMapper.getRightPrimaryKeys(pk);

		return pks.clone();
	}

	/**
	 * Returns all the CRM Tags associated with the CRM Contact.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @return the CRM Tags associated with the CRM Contact
	 */
	@Override
	public List<contact.manager.model.CrmTag> getCrmTags(long pk) {
		return getCrmTags(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the CRM Tags associated with the CRM Contact.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @return the range of CRM Tags associated with the CRM Contact
	 */
	@Override
	public List<contact.manager.model.CrmTag> getCrmTags(long pk, int start,
		int end) {
		return getCrmTags(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Tags associated with the CRM Contact.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Tags associated with the CRM Contact
	 */
	@Override
	public List<contact.manager.model.CrmTag> getCrmTags(long pk, int start,
		int end,
		OrderByComparator<contact.manager.model.CrmTag> orderByComparator) {
		return crmContactToCrmTagTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of CRM Tags associated with the CRM Contact.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @return the number of CRM Tags associated with the CRM Contact
	 */
	@Override
	public int getCrmTagsSize(long pk) {
		long[] pks = crmContactToCrmTagTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the CRM Tag is associated with the CRM Contact.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmTagPK the primary key of the CRM Tag
	 * @return <code>true</code> if the CRM Tag is associated with the CRM Contact; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCrmTag(long pk, long crmTagPK) {
		return crmContactToCrmTagTableMapper.containsTableMapping(pk, crmTagPK);
	}

	/**
	 * Returns <code>true</code> if the CRM Contact has any CRM Tags associated with it.
	 *
	 * @param pk the primary key of the CRM Contact to check for associations with CRM Tags
	 * @return <code>true</code> if the CRM Contact has any CRM Tags associated with it; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCrmTags(long pk) {
		if (getCrmTagsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the CRM Contact and the CRM Tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmTagPK the primary key of the CRM Tag
	 */
	@Override
	public void addCrmTag(long pk, long crmTagPK) {
		CrmContact crmContact = fetchByPrimaryKey(pk);

		if (crmContact == null) {
			crmContactToCrmTagTableMapper.addTableMapping(companyProvider.getCompanyId(),
				pk, crmTagPK);
		}
		else {
			crmContactToCrmTagTableMapper.addTableMapping(crmContact.getCompanyId(),
				pk, crmTagPK);
		}
	}

	/**
	 * Adds an association between the CRM Contact and the CRM Tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmTag the CRM Tag
	 */
	@Override
	public void addCrmTag(long pk, contact.manager.model.CrmTag crmTag) {
		CrmContact crmContact = fetchByPrimaryKey(pk);

		if (crmContact == null) {
			crmContactToCrmTagTableMapper.addTableMapping(companyProvider.getCompanyId(),
				pk, crmTag.getPrimaryKey());
		}
		else {
			crmContactToCrmTagTableMapper.addTableMapping(crmContact.getCompanyId(),
				pk, crmTag.getPrimaryKey());
		}
	}

	/**
	 * Adds an association between the CRM Contact and the CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmTagPKs the primary keys of the CRM Tags
	 */
	@Override
	public void addCrmTags(long pk, long[] crmTagPKs) {
		long companyId = 0;

		CrmContact crmContact = fetchByPrimaryKey(pk);

		if (crmContact == null) {
			companyId = companyProvider.getCompanyId();
		}
		else {
			companyId = crmContact.getCompanyId();
		}

		crmContactToCrmTagTableMapper.addTableMappings(companyId, pk, crmTagPKs);
	}

	/**
	 * Adds an association between the CRM Contact and the CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmTags the CRM Tags
	 */
	@Override
	public void addCrmTags(long pk, List<contact.manager.model.CrmTag> crmTags) {
		addCrmTags(pk,
			ListUtil.toLongArray(crmTags,
				contact.manager.model.CrmTag.CRM_TAG_ID_ACCESSOR));
	}

	/**
	 * Clears all associations between the CRM Contact and its CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact to clear the associated CRM Tags from
	 */
	@Override
	public void clearCrmTags(long pk) {
		crmContactToCrmTagTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the CRM Contact and the CRM Tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmTagPK the primary key of the CRM Tag
	 */
	@Override
	public void removeCrmTag(long pk, long crmTagPK) {
		crmContactToCrmTagTableMapper.deleteTableMapping(pk, crmTagPK);
	}

	/**
	 * Removes the association between the CRM Contact and the CRM Tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmTag the CRM Tag
	 */
	@Override
	public void removeCrmTag(long pk, contact.manager.model.CrmTag crmTag) {
		crmContactToCrmTagTableMapper.deleteTableMapping(pk,
			crmTag.getPrimaryKey());
	}

	/**
	 * Removes the association between the CRM Contact and the CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmTagPKs the primary keys of the CRM Tags
	 */
	@Override
	public void removeCrmTags(long pk, long[] crmTagPKs) {
		crmContactToCrmTagTableMapper.deleteTableMappings(pk, crmTagPKs);
	}

	/**
	 * Removes the association between the CRM Contact and the CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmTags the CRM Tags
	 */
	@Override
	public void removeCrmTags(long pk,
		List<contact.manager.model.CrmTag> crmTags) {
		removeCrmTags(pk,
			ListUtil.toLongArray(crmTags,
				contact.manager.model.CrmTag.CRM_TAG_ID_ACCESSOR));
	}

	/**
	 * Sets the CRM Tags associated with the CRM Contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmTagPKs the primary keys of the CRM Tags to be associated with the CRM Contact
	 */
	@Override
	public void setCrmTags(long pk, long[] crmTagPKs) {
		Set<Long> newCrmTagPKsSet = SetUtil.fromArray(crmTagPKs);
		Set<Long> oldCrmTagPKsSet = SetUtil.fromArray(crmContactToCrmTagTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeCrmTagPKsSet = new HashSet<Long>(oldCrmTagPKsSet);

		removeCrmTagPKsSet.removeAll(newCrmTagPKsSet);

		crmContactToCrmTagTableMapper.deleteTableMappings(pk,
			ArrayUtil.toLongArray(removeCrmTagPKsSet));

		newCrmTagPKsSet.removeAll(oldCrmTagPKsSet);

		long companyId = 0;

		CrmContact crmContact = fetchByPrimaryKey(pk);

		if (crmContact == null) {
			companyId = companyProvider.getCompanyId();
		}
		else {
			companyId = crmContact.getCompanyId();
		}

		crmContactToCrmTagTableMapper.addTableMappings(companyId, pk,
			ArrayUtil.toLongArray(newCrmTagPKsSet));
	}

	/**
	 * Sets the CRM Tags associated with the CRM Contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Contact
	 * @param crmTags the CRM Tags to be associated with the CRM Contact
	 */
	@Override
	public void setCrmTags(long pk, List<contact.manager.model.CrmTag> crmTags) {
		try {
			long[] crmTagPKs = new long[crmTags.size()];

			for (int i = 0; i < crmTags.size(); i++) {
				contact.manager.model.CrmTag crmTag = crmTags.get(i);

				crmTagPKs[i] = crmTag.getPrimaryKey();
			}

			setCrmTags(pk, crmTagPKs);
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
		return CrmContactModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM Contact persistence.
	 */
	public void afterPropertiesSet() {
		crmContactToCrmGroupTableMapper = TableMapperFactory.getTableMapper("crm_contacts_groups",
				"companyId", "crmContactId", "crmGroupId", this,
				crmGroupPersistence);

		crmContactToCrmTagTableMapper = TableMapperFactory.getTableMapper("crm_contacts_tags",
				"companyId", "crmContactId", "crmTagId", this, crmTagPersistence);
	}

	public void destroy() {
		entityCache.removeCache(CrmContactImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("crm_contacts_groups");
		TableMapperFactory.removeTableMapper("crm_contacts_tags");
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	@BeanReference(type = CrmGroupPersistence.class)
	protected CrmGroupPersistence crmGroupPersistence;
	protected TableMapper<CrmContact, contact.manager.model.CrmGroup> crmContactToCrmGroupTableMapper;
	@BeanReference(type = CrmTagPersistence.class)
	protected CrmTagPersistence crmTagPersistence;
	protected TableMapper<CrmContact, contact.manager.model.CrmTag> crmContactToCrmTagTableMapper;
	private static final String _SQL_SELECT_CRMCONTACT = "SELECT crmContact FROM CrmContact crmContact";
	private static final String _SQL_SELECT_CRMCONTACT_WHERE_PKS_IN = "SELECT crmContact FROM CrmContact crmContact WHERE crmContactId IN (";
	private static final String _SQL_SELECT_CRMCONTACT_WHERE = "SELECT crmContact FROM CrmContact crmContact WHERE ";
	private static final String _SQL_COUNT_CRMCONTACT = "SELECT COUNT(crmContact) FROM CrmContact crmContact";
	private static final String _SQL_COUNT_CRMCONTACT_WHERE = "SELECT COUNT(crmContact) FROM CrmContact crmContact WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmContact.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmContact exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CrmContact exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CrmContactPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}