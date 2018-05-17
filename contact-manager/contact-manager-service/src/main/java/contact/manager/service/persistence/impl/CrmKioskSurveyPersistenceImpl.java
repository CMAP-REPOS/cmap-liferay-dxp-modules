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

import contact.manager.exception.NoSuchCrmKioskSurveyException;

import contact.manager.model.CrmKioskSurvey;
import contact.manager.model.impl.CrmKioskSurveyImpl;
import contact.manager.model.impl.CrmKioskSurveyModelImpl;

import contact.manager.service.persistence.CrmKioskSurveyPersistence;

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
 * The persistence implementation for the CRM Kiosk Survey service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmKioskSurveyPersistence
 * @see contact.manager.service.persistence.CrmKioskSurveyUtil
 * @generated
 */
@ProviderType
public class CrmKioskSurveyPersistenceImpl extends BasePersistenceImpl<CrmKioskSurvey>
	implements CrmKioskSurveyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmKioskSurveyUtil} to access the CRM Kiosk Survey persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmKioskSurveyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskSurveyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskSurveyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskSurveyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskSurveyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CrmKioskSurveyModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the CRM Kiosk Surveies where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Kiosk Surveies
	 */
	@Override
	public List<CrmKioskSurvey> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Kiosk Surveies where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Kiosk Surveies
	 * @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	 * @return the range of matching CRM Kiosk Surveies
	 */
	@Override
	public List<CrmKioskSurvey> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Kiosk Surveies where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Kiosk Surveies
	 * @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Kiosk Surveies
	 */
	@Override
	public List<CrmKioskSurvey> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmKioskSurvey> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Kiosk Surveies where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Kiosk Surveies
	 * @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Kiosk Surveies
	 */
	@Override
	public List<CrmKioskSurvey> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmKioskSurvey> orderByComparator,
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

		List<CrmKioskSurvey> list = null;

		if (retrieveFromCache) {
			list = (List<CrmKioskSurvey>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmKioskSurvey crmKioskSurvey : list) {
					if (!Objects.equals(uuid, crmKioskSurvey.getUuid())) {
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

			query.append(_SQL_SELECT_CRMKIOSKSURVEY_WHERE);

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
				query.append(CrmKioskSurveyModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmKioskSurvey>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmKioskSurvey>)QueryUtil.list(q,
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
	 * Returns the first CRM Kiosk Survey in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Kiosk Survey
	 * @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	 */
	@Override
	public CrmKioskSurvey findByUuid_First(String uuid,
		OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws NoSuchCrmKioskSurveyException {
		CrmKioskSurvey crmKioskSurvey = fetchByUuid_First(uuid,
				orderByComparator);

		if (crmKioskSurvey != null) {
			return crmKioskSurvey;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmKioskSurveyException(msg.toString());
	}

	/**
	 * Returns the first CRM Kiosk Survey in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	 */
	@Override
	public CrmKioskSurvey fetchByUuid_First(String uuid,
		OrderByComparator<CrmKioskSurvey> orderByComparator) {
		List<CrmKioskSurvey> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Kiosk Survey in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Kiosk Survey
	 * @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	 */
	@Override
	public CrmKioskSurvey findByUuid_Last(String uuid,
		OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws NoSuchCrmKioskSurveyException {
		CrmKioskSurvey crmKioskSurvey = fetchByUuid_Last(uuid, orderByComparator);

		if (crmKioskSurvey != null) {
			return crmKioskSurvey;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmKioskSurveyException(msg.toString());
	}

	/**
	 * Returns the last CRM Kiosk Survey in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	 */
	@Override
	public CrmKioskSurvey fetchByUuid_Last(String uuid,
		OrderByComparator<CrmKioskSurvey> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CrmKioskSurvey> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Kiosk Surveies before and after the current CRM Kiosk Survey in the ordered set where uuid = &#63;.
	 *
	 * @param crmKioskSurveyId the primary key of the current CRM Kiosk Survey
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Kiosk Survey
	 * @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	 */
	@Override
	public CrmKioskSurvey[] findByUuid_PrevAndNext(long crmKioskSurveyId,
		String uuid, OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws NoSuchCrmKioskSurveyException {
		CrmKioskSurvey crmKioskSurvey = findByPrimaryKey(crmKioskSurveyId);

		Session session = null;

		try {
			session = openSession();

			CrmKioskSurvey[] array = new CrmKioskSurveyImpl[3];

			array[0] = getByUuid_PrevAndNext(session, crmKioskSurvey, uuid,
					orderByComparator, true);

			array[1] = crmKioskSurvey;

			array[2] = getByUuid_PrevAndNext(session, crmKioskSurvey, uuid,
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

	protected CrmKioskSurvey getByUuid_PrevAndNext(Session session,
		CrmKioskSurvey crmKioskSurvey, String uuid,
		OrderByComparator<CrmKioskSurvey> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRMKIOSKSURVEY_WHERE);

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
			query.append(CrmKioskSurveyModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmKioskSurvey);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmKioskSurvey> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Kiosk Surveies where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CrmKioskSurvey crmKioskSurvey : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmKioskSurvey);
		}
	}

	/**
	 * Returns the number of CRM Kiosk Surveies where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Kiosk Surveies
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRMKIOSKSURVEY_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "crmKioskSurvey.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "crmKioskSurvey.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(crmKioskSurvey.uuid IS NULL OR crmKioskSurvey.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskSurveyImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmKioskSurveyModelImpl.UUID_COLUMN_BITMASK |
			CrmKioskSurveyModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the CRM Kiosk Survey where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmKioskSurveyException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Kiosk Survey
	 * @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	 */
	@Override
	public CrmKioskSurvey findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmKioskSurveyException {
		CrmKioskSurvey crmKioskSurvey = fetchByUUID_G(uuid, groupId);

		if (crmKioskSurvey == null) {
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

			throw new NoSuchCrmKioskSurveyException(msg.toString());
		}

		return crmKioskSurvey;
	}

	/**
	 * Returns the CRM Kiosk Survey where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	 */
	@Override
	public CrmKioskSurvey fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the CRM Kiosk Survey where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	 */
	@Override
	public CrmKioskSurvey fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CrmKioskSurvey) {
			CrmKioskSurvey crmKioskSurvey = (CrmKioskSurvey)result;

			if (!Objects.equals(uuid, crmKioskSurvey.getUuid()) ||
					(groupId != crmKioskSurvey.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMKIOSKSURVEY_WHERE);

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

				List<CrmKioskSurvey> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CrmKioskSurvey crmKioskSurvey = list.get(0);

					result = crmKioskSurvey;

					cacheResult(crmKioskSurvey);

					if ((crmKioskSurvey.getUuid() == null) ||
							!crmKioskSurvey.getUuid().equals(uuid) ||
							(crmKioskSurvey.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, crmKioskSurvey);
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
			return (CrmKioskSurvey)result;
		}
	}

	/**
	 * Removes the CRM Kiosk Survey where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Kiosk Survey that was removed
	 */
	@Override
	public CrmKioskSurvey removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmKioskSurveyException {
		CrmKioskSurvey crmKioskSurvey = findByUUID_G(uuid, groupId);

		return remove(crmKioskSurvey);
	}

	/**
	 * Returns the number of CRM Kiosk Surveies where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Kiosk Surveies
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMKIOSKSURVEY_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "crmKioskSurvey.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "crmKioskSurvey.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(crmKioskSurvey.uuid IS NULL OR crmKioskSurvey.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "crmKioskSurvey.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskSurveyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyModelImpl.FINDER_CACHE_ENABLED,
			CrmKioskSurveyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CrmKioskSurveyModelImpl.UUID_COLUMN_BITMASK |
			CrmKioskSurveyModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Kiosk Surveies
	 */
	@Override
	public List<CrmKioskSurvey> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Kiosk Surveies
	 * @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	 * @return the range of matching CRM Kiosk Surveies
	 */
	@Override
	public List<CrmKioskSurvey> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Kiosk Surveies
	 * @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Kiosk Surveies
	 */
	@Override
	public List<CrmKioskSurvey> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<CrmKioskSurvey> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Kiosk Surveies
	 * @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching CRM Kiosk Surveies
	 */
	@Override
	public List<CrmKioskSurvey> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<CrmKioskSurvey> orderByComparator,
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

		List<CrmKioskSurvey> list = null;

		if (retrieveFromCache) {
			list = (List<CrmKioskSurvey>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CrmKioskSurvey crmKioskSurvey : list) {
					if (!Objects.equals(uuid, crmKioskSurvey.getUuid()) ||
							(companyId != crmKioskSurvey.getCompanyId())) {
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

			query.append(_SQL_SELECT_CRMKIOSKSURVEY_WHERE);

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
				query.append(CrmKioskSurveyModelImpl.ORDER_BY_JPQL);
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
					list = (List<CrmKioskSurvey>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmKioskSurvey>)QueryUtil.list(q,
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
	 * Returns the first CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Kiosk Survey
	 * @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	 */
	@Override
	public CrmKioskSurvey findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws NoSuchCrmKioskSurveyException {
		CrmKioskSurvey crmKioskSurvey = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (crmKioskSurvey != null) {
			return crmKioskSurvey;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmKioskSurveyException(msg.toString());
	}

	/**
	 * Returns the first CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	 */
	@Override
	public CrmKioskSurvey fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmKioskSurvey> orderByComparator) {
		List<CrmKioskSurvey> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Kiosk Survey
	 * @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	 */
	@Override
	public CrmKioskSurvey findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws NoSuchCrmKioskSurveyException {
		CrmKioskSurvey crmKioskSurvey = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (crmKioskSurvey != null) {
			return crmKioskSurvey;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCrmKioskSurveyException(msg.toString());
	}

	/**
	 * Returns the last CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	 */
	@Override
	public CrmKioskSurvey fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmKioskSurvey> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CrmKioskSurvey> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the CRM Kiosk Surveies before and after the current CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmKioskSurveyId the primary key of the current CRM Kiosk Survey
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Kiosk Survey
	 * @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	 */
	@Override
	public CrmKioskSurvey[] findByUuid_C_PrevAndNext(long crmKioskSurveyId,
		String uuid, long companyId,
		OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws NoSuchCrmKioskSurveyException {
		CrmKioskSurvey crmKioskSurvey = findByPrimaryKey(crmKioskSurveyId);

		Session session = null;

		try {
			session = openSession();

			CrmKioskSurvey[] array = new CrmKioskSurveyImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, crmKioskSurvey, uuid,
					companyId, orderByComparator, true);

			array[1] = crmKioskSurvey;

			array[2] = getByUuid_C_PrevAndNext(session, crmKioskSurvey, uuid,
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

	protected CrmKioskSurvey getByUuid_C_PrevAndNext(Session session,
		CrmKioskSurvey crmKioskSurvey, String uuid, long companyId,
		OrderByComparator<CrmKioskSurvey> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRMKIOSKSURVEY_WHERE);

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
			query.append(CrmKioskSurveyModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(crmKioskSurvey);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CrmKioskSurvey> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CrmKioskSurvey crmKioskSurvey : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(crmKioskSurvey);
		}
	}

	/**
	 * Returns the number of CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Kiosk Surveies
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMKIOSKSURVEY_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "crmKioskSurvey.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "crmKioskSurvey.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(crmKioskSurvey.uuid IS NULL OR crmKioskSurvey.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "crmKioskSurvey.companyId = ?";

	public CrmKioskSurveyPersistenceImpl() {
		setModelClass(CrmKioskSurvey.class);

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
	 * Caches the CRM Kiosk Survey in the entity cache if it is enabled.
	 *
	 * @param crmKioskSurvey the CRM Kiosk Survey
	 */
	@Override
	public void cacheResult(CrmKioskSurvey crmKioskSurvey) {
		entityCache.putResult(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyImpl.class, crmKioskSurvey.getPrimaryKey(),
			crmKioskSurvey);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { crmKioskSurvey.getUuid(), crmKioskSurvey.getGroupId() },
			crmKioskSurvey);

		crmKioskSurvey.resetOriginalValues();
	}

	/**
	 * Caches the CRM Kiosk Surveies in the entity cache if it is enabled.
	 *
	 * @param crmKioskSurveies the CRM Kiosk Surveies
	 */
	@Override
	public void cacheResult(List<CrmKioskSurvey> crmKioskSurveies) {
		for (CrmKioskSurvey crmKioskSurvey : crmKioskSurveies) {
			if (entityCache.getResult(
						CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
						CrmKioskSurveyImpl.class, crmKioskSurvey.getPrimaryKey()) == null) {
				cacheResult(crmKioskSurvey);
			}
			else {
				crmKioskSurvey.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM Kiosk Surveies.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmKioskSurveyImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM Kiosk Survey.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmKioskSurvey crmKioskSurvey) {
		entityCache.removeResult(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyImpl.class, crmKioskSurvey.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CrmKioskSurveyModelImpl)crmKioskSurvey, true);
	}

	@Override
	public void clearCache(List<CrmKioskSurvey> crmKioskSurveies) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmKioskSurvey crmKioskSurvey : crmKioskSurveies) {
			entityCache.removeResult(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
				CrmKioskSurveyImpl.class, crmKioskSurvey.getPrimaryKey());

			clearUniqueFindersCache((CrmKioskSurveyModelImpl)crmKioskSurvey,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		CrmKioskSurveyModelImpl crmKioskSurveyModelImpl) {
		Object[] args = new Object[] {
				crmKioskSurveyModelImpl.getUuid(),
				crmKioskSurveyModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			crmKioskSurveyModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CrmKioskSurveyModelImpl crmKioskSurveyModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					crmKioskSurveyModelImpl.getUuid(),
					crmKioskSurveyModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((crmKioskSurveyModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					crmKioskSurveyModelImpl.getOriginalUuid(),
					crmKioskSurveyModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new CRM Kiosk Survey with the primary key. Does not add the CRM Kiosk Survey to the database.
	 *
	 * @param crmKioskSurveyId the primary key for the new CRM Kiosk Survey
	 * @return the new CRM Kiosk Survey
	 */
	@Override
	public CrmKioskSurvey create(long crmKioskSurveyId) {
		CrmKioskSurvey crmKioskSurvey = new CrmKioskSurveyImpl();

		crmKioskSurvey.setNew(true);
		crmKioskSurvey.setPrimaryKey(crmKioskSurveyId);

		String uuid = PortalUUIDUtil.generate();

		crmKioskSurvey.setUuid(uuid);

		crmKioskSurvey.setCompanyId(companyProvider.getCompanyId());

		return crmKioskSurvey;
	}

	/**
	 * Removes the CRM Kiosk Survey with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmKioskSurveyId the primary key of the CRM Kiosk Survey
	 * @return the CRM Kiosk Survey that was removed
	 * @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	 */
	@Override
	public CrmKioskSurvey remove(long crmKioskSurveyId)
		throws NoSuchCrmKioskSurveyException {
		return remove((Serializable)crmKioskSurveyId);
	}

	/**
	 * Removes the CRM Kiosk Survey with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM Kiosk Survey
	 * @return the CRM Kiosk Survey that was removed
	 * @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	 */
	@Override
	public CrmKioskSurvey remove(Serializable primaryKey)
		throws NoSuchCrmKioskSurveyException {
		Session session = null;

		try {
			session = openSession();

			CrmKioskSurvey crmKioskSurvey = (CrmKioskSurvey)session.get(CrmKioskSurveyImpl.class,
					primaryKey);

			if (crmKioskSurvey == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmKioskSurveyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmKioskSurvey);
		}
		catch (NoSuchCrmKioskSurveyException nsee) {
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
	protected CrmKioskSurvey removeImpl(CrmKioskSurvey crmKioskSurvey) {
		crmKioskSurvey = toUnwrappedModel(crmKioskSurvey);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmKioskSurvey)) {
				crmKioskSurvey = (CrmKioskSurvey)session.get(CrmKioskSurveyImpl.class,
						crmKioskSurvey.getPrimaryKeyObj());
			}

			if (crmKioskSurvey != null) {
				session.delete(crmKioskSurvey);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmKioskSurvey != null) {
			clearCache(crmKioskSurvey);
		}

		return crmKioskSurvey;
	}

	@Override
	public CrmKioskSurvey updateImpl(CrmKioskSurvey crmKioskSurvey) {
		crmKioskSurvey = toUnwrappedModel(crmKioskSurvey);

		boolean isNew = crmKioskSurvey.isNew();

		CrmKioskSurveyModelImpl crmKioskSurveyModelImpl = (CrmKioskSurveyModelImpl)crmKioskSurvey;

		if (Validator.isNull(crmKioskSurvey.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			crmKioskSurvey.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmKioskSurvey.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmKioskSurvey.setCreateDate(now);
			}
			else {
				crmKioskSurvey.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmKioskSurveyModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmKioskSurvey.setModifiedDate(now);
			}
			else {
				crmKioskSurvey.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmKioskSurvey.isNew()) {
				session.save(crmKioskSurvey);

				crmKioskSurvey.setNew(false);
			}
			else {
				crmKioskSurvey = (CrmKioskSurvey)session.merge(crmKioskSurvey);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CrmKioskSurveyModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { crmKioskSurveyModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					crmKioskSurveyModelImpl.getUuid(),
					crmKioskSurveyModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((crmKioskSurveyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmKioskSurveyModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { crmKioskSurveyModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((crmKioskSurveyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmKioskSurveyModelImpl.getOriginalUuid(),
						crmKioskSurveyModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						crmKioskSurveyModelImpl.getUuid(),
						crmKioskSurveyModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
			CrmKioskSurveyImpl.class, crmKioskSurvey.getPrimaryKey(),
			crmKioskSurvey, false);

		clearUniqueFindersCache(crmKioskSurveyModelImpl, false);
		cacheUniqueFindersCache(crmKioskSurveyModelImpl);

		crmKioskSurvey.resetOriginalValues();

		return crmKioskSurvey;
	}

	protected CrmKioskSurvey toUnwrappedModel(CrmKioskSurvey crmKioskSurvey) {
		if (crmKioskSurvey instanceof CrmKioskSurveyImpl) {
			return crmKioskSurvey;
		}

		CrmKioskSurveyImpl crmKioskSurveyImpl = new CrmKioskSurveyImpl();

		crmKioskSurveyImpl.setNew(crmKioskSurvey.isNew());
		crmKioskSurveyImpl.setPrimaryKey(crmKioskSurvey.getPrimaryKey());

		crmKioskSurveyImpl.setUuid(crmKioskSurvey.getUuid());
		crmKioskSurveyImpl.setCrmKioskSurveyId(crmKioskSurvey.getCrmKioskSurveyId());
		crmKioskSurveyImpl.setGroupId(crmKioskSurvey.getGroupId());
		crmKioskSurveyImpl.setCompanyId(crmKioskSurvey.getCompanyId());
		crmKioskSurveyImpl.setUserId(crmKioskSurvey.getUserId());
		crmKioskSurveyImpl.setUserName(crmKioskSurvey.getUserName());
		crmKioskSurveyImpl.setCreateDate(crmKioskSurvey.getCreateDate());
		crmKioskSurveyImpl.setModifiedDate(crmKioskSurvey.getModifiedDate());

		return crmKioskSurveyImpl;
	}

	/**
	 * Returns the CRM Kiosk Survey with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Kiosk Survey
	 * @return the CRM Kiosk Survey
	 * @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	 */
	@Override
	public CrmKioskSurvey findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmKioskSurveyException {
		CrmKioskSurvey crmKioskSurvey = fetchByPrimaryKey(primaryKey);

		if (crmKioskSurvey == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmKioskSurveyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmKioskSurvey;
	}

	/**
	 * Returns the CRM Kiosk Survey with the primary key or throws a {@link NoSuchCrmKioskSurveyException} if it could not be found.
	 *
	 * @param crmKioskSurveyId the primary key of the CRM Kiosk Survey
	 * @return the CRM Kiosk Survey
	 * @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	 */
	@Override
	public CrmKioskSurvey findByPrimaryKey(long crmKioskSurveyId)
		throws NoSuchCrmKioskSurveyException {
		return findByPrimaryKey((Serializable)crmKioskSurveyId);
	}

	/**
	 * Returns the CRM Kiosk Survey with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Kiosk Survey
	 * @return the CRM Kiosk Survey, or <code>null</code> if a CRM Kiosk Survey with the primary key could not be found
	 */
	@Override
	public CrmKioskSurvey fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
				CrmKioskSurveyImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmKioskSurvey crmKioskSurvey = (CrmKioskSurvey)serializable;

		if (crmKioskSurvey == null) {
			Session session = null;

			try {
				session = openSession();

				crmKioskSurvey = (CrmKioskSurvey)session.get(CrmKioskSurveyImpl.class,
						primaryKey);

				if (crmKioskSurvey != null) {
					cacheResult(crmKioskSurvey);
				}
				else {
					entityCache.putResult(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
						CrmKioskSurveyImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
					CrmKioskSurveyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmKioskSurvey;
	}

	/**
	 * Returns the CRM Kiosk Survey with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmKioskSurveyId the primary key of the CRM Kiosk Survey
	 * @return the CRM Kiosk Survey, or <code>null</code> if a CRM Kiosk Survey with the primary key could not be found
	 */
	@Override
	public CrmKioskSurvey fetchByPrimaryKey(long crmKioskSurveyId) {
		return fetchByPrimaryKey((Serializable)crmKioskSurveyId);
	}

	@Override
	public Map<Serializable, CrmKioskSurvey> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmKioskSurvey> map = new HashMap<Serializable, CrmKioskSurvey>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmKioskSurvey crmKioskSurvey = fetchByPrimaryKey(primaryKey);

			if (crmKioskSurvey != null) {
				map.put(primaryKey, crmKioskSurvey);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
					CrmKioskSurveyImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmKioskSurvey)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMKIOSKSURVEY_WHERE_PKS_IN);

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

			for (CrmKioskSurvey crmKioskSurvey : (List<CrmKioskSurvey>)q.list()) {
				map.put(crmKioskSurvey.getPrimaryKeyObj(), crmKioskSurvey);

				cacheResult(crmKioskSurvey);

				uncachedPrimaryKeys.remove(crmKioskSurvey.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmKioskSurveyModelImpl.ENTITY_CACHE_ENABLED,
					CrmKioskSurveyImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM Kiosk Surveies.
	 *
	 * @return the CRM Kiosk Surveies
	 */
	@Override
	public List<CrmKioskSurvey> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Kiosk Surveies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Kiosk Surveies
	 * @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	 * @return the range of CRM Kiosk Surveies
	 */
	@Override
	public List<CrmKioskSurvey> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Kiosk Surveies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Kiosk Surveies
	 * @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Kiosk Surveies
	 */
	@Override
	public List<CrmKioskSurvey> findAll(int start, int end,
		OrderByComparator<CrmKioskSurvey> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Kiosk Surveies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Kiosk Surveies
	 * @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM Kiosk Surveies
	 */
	@Override
	public List<CrmKioskSurvey> findAll(int start, int end,
		OrderByComparator<CrmKioskSurvey> orderByComparator,
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

		List<CrmKioskSurvey> list = null;

		if (retrieveFromCache) {
			list = (List<CrmKioskSurvey>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMKIOSKSURVEY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMKIOSKSURVEY;

				if (pagination) {
					sql = sql.concat(CrmKioskSurveyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmKioskSurvey>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmKioskSurvey>)QueryUtil.list(q,
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
	 * Removes all the CRM Kiosk Surveies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmKioskSurvey crmKioskSurvey : findAll()) {
			remove(crmKioskSurvey);
		}
	}

	/**
	 * Returns the number of CRM Kiosk Surveies.
	 *
	 * @return the number of CRM Kiosk Surveies
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMKIOSKSURVEY);

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
		return CrmKioskSurveyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM Kiosk Survey persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CrmKioskSurveyImpl.class.getName());
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
	private static final String _SQL_SELECT_CRMKIOSKSURVEY = "SELECT crmKioskSurvey FROM CrmKioskSurvey crmKioskSurvey";
	private static final String _SQL_SELECT_CRMKIOSKSURVEY_WHERE_PKS_IN = "SELECT crmKioskSurvey FROM CrmKioskSurvey crmKioskSurvey WHERE crmKioskSurveyId IN (";
	private static final String _SQL_SELECT_CRMKIOSKSURVEY_WHERE = "SELECT crmKioskSurvey FROM CrmKioskSurvey crmKioskSurvey WHERE ";
	private static final String _SQL_COUNT_CRMKIOSKSURVEY = "SELECT COUNT(crmKioskSurvey) FROM CrmKioskSurvey crmKioskSurvey";
	private static final String _SQL_COUNT_CRMKIOSKSURVEY_WHERE = "SELECT COUNT(crmKioskSurvey) FROM CrmKioskSurvey crmKioskSurvey WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmKioskSurvey.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmKioskSurvey exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CrmKioskSurvey exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CrmKioskSurveyPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}