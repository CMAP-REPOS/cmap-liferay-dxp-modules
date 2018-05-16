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

package contact.manager.service.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.service.exception.NoSuchOutreachLogException;
import contact.manager.service.model.OutreachLog;
import contact.manager.service.model.impl.OutreachLogImpl;
import contact.manager.service.model.impl.OutreachLogModelImpl;
import contact.manager.service.service.persistence.OutreachLogPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the outreach log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OutreachLogPersistence
 * @see contact.manager.service.service.persistence.OutreachLogUtil
 * @generated
 */
@ProviderType
public class OutreachLogPersistenceImpl extends BasePersistenceImpl<OutreachLog>
	implements OutreachLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OutreachLogUtil} to access the outreach log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OutreachLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			OutreachLogModelImpl.FINDER_CACHE_ENABLED, OutreachLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			OutreachLogModelImpl.FINDER_CACHE_ENABLED, OutreachLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			OutreachLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTACTID =
		new FinderPath(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			OutreachLogModelImpl.FINDER_CACHE_ENABLED, OutreachLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByContactId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTACTID =
		new FinderPath(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			OutreachLogModelImpl.FINDER_CACHE_ENABLED, OutreachLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByContactId",
			new String[] { Long.class.getName() },
			OutreachLogModelImpl.CONTACTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTACTID = new FinderPath(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			OutreachLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByContactId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the outreach logs where contactId = &#63;.
	 *
	 * @param contactId the contact ID
	 * @return the matching outreach logs
	 */
	@Override
	public List<OutreachLog> findByContactId(long contactId) {
		return findByContactId(contactId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the outreach logs where contactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contactId the contact ID
	 * @param start the lower bound of the range of outreach logs
	 * @param end the upper bound of the range of outreach logs (not inclusive)
	 * @return the range of matching outreach logs
	 */
	@Override
	public List<OutreachLog> findByContactId(long contactId, int start, int end) {
		return findByContactId(contactId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the outreach logs where contactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contactId the contact ID
	 * @param start the lower bound of the range of outreach logs
	 * @param end the upper bound of the range of outreach logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching outreach logs
	 */
	@Override
	public List<OutreachLog> findByContactId(long contactId, int start,
		int end, OrderByComparator<OutreachLog> orderByComparator) {
		return findByContactId(contactId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the outreach logs where contactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contactId the contact ID
	 * @param start the lower bound of the range of outreach logs
	 * @param end the upper bound of the range of outreach logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching outreach logs
	 */
	@Override
	public List<OutreachLog> findByContactId(long contactId, int start,
		int end, OrderByComparator<OutreachLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTACTID;
			finderArgs = new Object[] { contactId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTACTID;
			finderArgs = new Object[] { contactId, start, end, orderByComparator };
		}

		List<OutreachLog> list = null;

		if (retrieveFromCache) {
			list = (List<OutreachLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OutreachLog outreachLog : list) {
					if ((contactId != outreachLog.getContactId())) {
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

			query.append(_SQL_SELECT_OUTREACHLOG_WHERE);

			query.append(_FINDER_COLUMN_CONTACTID_CONTACTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OutreachLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(contactId);

				if (!pagination) {
					list = (List<OutreachLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<OutreachLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first outreach log in the ordered set where contactId = &#63;.
	 *
	 * @param contactId the contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching outreach log
	 * @throws NoSuchOutreachLogException if a matching outreach log could not be found
	 */
	@Override
	public OutreachLog findByContactId_First(long contactId,
		OrderByComparator<OutreachLog> orderByComparator)
		throws NoSuchOutreachLogException {
		OutreachLog outreachLog = fetchByContactId_First(contactId,
				orderByComparator);

		if (outreachLog != null) {
			return outreachLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("contactId=");
		msg.append(contactId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOutreachLogException(msg.toString());
	}

	/**
	 * Returns the first outreach log in the ordered set where contactId = &#63;.
	 *
	 * @param contactId the contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching outreach log, or <code>null</code> if a matching outreach log could not be found
	 */
	@Override
	public OutreachLog fetchByContactId_First(long contactId,
		OrderByComparator<OutreachLog> orderByComparator) {
		List<OutreachLog> list = findByContactId(contactId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last outreach log in the ordered set where contactId = &#63;.
	 *
	 * @param contactId the contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching outreach log
	 * @throws NoSuchOutreachLogException if a matching outreach log could not be found
	 */
	@Override
	public OutreachLog findByContactId_Last(long contactId,
		OrderByComparator<OutreachLog> orderByComparator)
		throws NoSuchOutreachLogException {
		OutreachLog outreachLog = fetchByContactId_Last(contactId,
				orderByComparator);

		if (outreachLog != null) {
			return outreachLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("contactId=");
		msg.append(contactId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOutreachLogException(msg.toString());
	}

	/**
	 * Returns the last outreach log in the ordered set where contactId = &#63;.
	 *
	 * @param contactId the contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching outreach log, or <code>null</code> if a matching outreach log could not be found
	 */
	@Override
	public OutreachLog fetchByContactId_Last(long contactId,
		OrderByComparator<OutreachLog> orderByComparator) {
		int count = countByContactId(contactId);

		if (count == 0) {
			return null;
		}

		List<OutreachLog> list = findByContactId(contactId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the outreach logs before and after the current outreach log in the ordered set where contactId = &#63;.
	 *
	 * @param id the primary key of the current outreach log
	 * @param contactId the contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next outreach log
	 * @throws NoSuchOutreachLogException if a outreach log with the primary key could not be found
	 */
	@Override
	public OutreachLog[] findByContactId_PrevAndNext(long id, long contactId,
		OrderByComparator<OutreachLog> orderByComparator)
		throws NoSuchOutreachLogException {
		OutreachLog outreachLog = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OutreachLog[] array = new OutreachLogImpl[3];

			array[0] = getByContactId_PrevAndNext(session, outreachLog,
					contactId, orderByComparator, true);

			array[1] = outreachLog;

			array[2] = getByContactId_PrevAndNext(session, outreachLog,
					contactId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OutreachLog getByContactId_PrevAndNext(Session session,
		OutreachLog outreachLog, long contactId,
		OrderByComparator<OutreachLog> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OUTREACHLOG_WHERE);

		query.append(_FINDER_COLUMN_CONTACTID_CONTACTID_2);

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
			query.append(OutreachLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(contactId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(outreachLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OutreachLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the outreach logs where contactId = &#63; from the database.
	 *
	 * @param contactId the contact ID
	 */
	@Override
	public void removeByContactId(long contactId) {
		for (OutreachLog outreachLog : findByContactId(contactId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(outreachLog);
		}
	}

	/**
	 * Returns the number of outreach logs where contactId = &#63;.
	 *
	 * @param contactId the contact ID
	 * @return the number of matching outreach logs
	 */
	@Override
	public int countByContactId(long contactId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTACTID;

		Object[] finderArgs = new Object[] { contactId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OUTREACHLOG_WHERE);

			query.append(_FINDER_COLUMN_CONTACTID_CONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(contactId);

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

	private static final String _FINDER_COLUMN_CONTACTID_CONTACTID_2 = "outreachLog.contactId = ?";

	public OutreachLogPersistenceImpl() {
		setModelClass(OutreachLog.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("id", "id_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the outreach log in the entity cache if it is enabled.
	 *
	 * @param outreachLog the outreach log
	 */
	@Override
	public void cacheResult(OutreachLog outreachLog) {
		entityCache.putResult(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			OutreachLogImpl.class, outreachLog.getPrimaryKey(), outreachLog);

		outreachLog.resetOriginalValues();
	}

	/**
	 * Caches the outreach logs in the entity cache if it is enabled.
	 *
	 * @param outreachLogs the outreach logs
	 */
	@Override
	public void cacheResult(List<OutreachLog> outreachLogs) {
		for (OutreachLog outreachLog : outreachLogs) {
			if (entityCache.getResult(
						OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
						OutreachLogImpl.class, outreachLog.getPrimaryKey()) == null) {
				cacheResult(outreachLog);
			}
			else {
				outreachLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all outreach logs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OutreachLogImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the outreach log.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OutreachLog outreachLog) {
		entityCache.removeResult(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			OutreachLogImpl.class, outreachLog.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<OutreachLog> outreachLogs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OutreachLog outreachLog : outreachLogs) {
			entityCache.removeResult(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
				OutreachLogImpl.class, outreachLog.getPrimaryKey());
		}
	}

	/**
	 * Creates a new outreach log with the primary key. Does not add the outreach log to the database.
	 *
	 * @param id the primary key for the new outreach log
	 * @return the new outreach log
	 */
	@Override
	public OutreachLog create(long id) {
		OutreachLog outreachLog = new OutreachLogImpl();

		outreachLog.setNew(true);
		outreachLog.setPrimaryKey(id);

		return outreachLog;
	}

	/**
	 * Removes the outreach log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the outreach log
	 * @return the outreach log that was removed
	 * @throws NoSuchOutreachLogException if a outreach log with the primary key could not be found
	 */
	@Override
	public OutreachLog remove(long id) throws NoSuchOutreachLogException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the outreach log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the outreach log
	 * @return the outreach log that was removed
	 * @throws NoSuchOutreachLogException if a outreach log with the primary key could not be found
	 */
	@Override
	public OutreachLog remove(Serializable primaryKey)
		throws NoSuchOutreachLogException {
		Session session = null;

		try {
			session = openSession();

			OutreachLog outreachLog = (OutreachLog)session.get(OutreachLogImpl.class,
					primaryKey);

			if (outreachLog == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOutreachLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(outreachLog);
		}
		catch (NoSuchOutreachLogException nsee) {
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
	protected OutreachLog removeImpl(OutreachLog outreachLog) {
		outreachLog = toUnwrappedModel(outreachLog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(outreachLog)) {
				outreachLog = (OutreachLog)session.get(OutreachLogImpl.class,
						outreachLog.getPrimaryKeyObj());
			}

			if (outreachLog != null) {
				session.delete(outreachLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (outreachLog != null) {
			clearCache(outreachLog);
		}

		return outreachLog;
	}

	@Override
	public OutreachLog updateImpl(OutreachLog outreachLog) {
		outreachLog = toUnwrappedModel(outreachLog);

		boolean isNew = outreachLog.isNew();

		OutreachLogModelImpl outreachLogModelImpl = (OutreachLogModelImpl)outreachLog;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (outreachLog.getCreateDate() == null)) {
			if (serviceContext == null) {
				outreachLog.setCreateDate(now);
			}
			else {
				outreachLog.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!outreachLogModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				outreachLog.setModifiedDate(now);
			}
			else {
				outreachLog.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (outreachLog.isNew()) {
				session.save(outreachLog);

				outreachLog.setNew(false);
			}
			else {
				outreachLog = (OutreachLog)session.merge(outreachLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!OutreachLogModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { outreachLogModelImpl.getContactId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTACTID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTACTID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((outreachLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTACTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						outreachLogModelImpl.getOriginalContactId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTACTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTACTID,
					args);

				args = new Object[] { outreachLogModelImpl.getContactId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTACTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTACTID,
					args);
			}
		}

		entityCache.putResult(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
			OutreachLogImpl.class, outreachLog.getPrimaryKey(), outreachLog,
			false);

		outreachLog.resetOriginalValues();

		return outreachLog;
	}

	protected OutreachLog toUnwrappedModel(OutreachLog outreachLog) {
		if (outreachLog instanceof OutreachLogImpl) {
			return outreachLog;
		}

		OutreachLogImpl outreachLogImpl = new OutreachLogImpl();

		outreachLogImpl.setNew(outreachLog.isNew());
		outreachLogImpl.setPrimaryKey(outreachLog.getPrimaryKey());

		outreachLogImpl.setId(outreachLog.getId());
		outreachLogImpl.setUserId(outreachLog.getUserId());
		outreachLogImpl.setContactId(outreachLog.getContactId());
		outreachLogImpl.setNote(outreachLog.getNote());
		outreachLogImpl.setMedium(outreachLog.getMedium());
		outreachLogImpl.setActivityType(outreachLog.getActivityType());
		outreachLogImpl.setOutreachDate(outreachLog.getOutreachDate());
		outreachLogImpl.setCreateDate(outreachLog.getCreateDate());
		outreachLogImpl.setModifiedDate(outreachLog.getModifiedDate());

		return outreachLogImpl;
	}

	/**
	 * Returns the outreach log with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the outreach log
	 * @return the outreach log
	 * @throws NoSuchOutreachLogException if a outreach log with the primary key could not be found
	 */
	@Override
	public OutreachLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOutreachLogException {
		OutreachLog outreachLog = fetchByPrimaryKey(primaryKey);

		if (outreachLog == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOutreachLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return outreachLog;
	}

	/**
	 * Returns the outreach log with the primary key or throws a {@link NoSuchOutreachLogException} if it could not be found.
	 *
	 * @param id the primary key of the outreach log
	 * @return the outreach log
	 * @throws NoSuchOutreachLogException if a outreach log with the primary key could not be found
	 */
	@Override
	public OutreachLog findByPrimaryKey(long id)
		throws NoSuchOutreachLogException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the outreach log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the outreach log
	 * @return the outreach log, or <code>null</code> if a outreach log with the primary key could not be found
	 */
	@Override
	public OutreachLog fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
				OutreachLogImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		OutreachLog outreachLog = (OutreachLog)serializable;

		if (outreachLog == null) {
			Session session = null;

			try {
				session = openSession();

				outreachLog = (OutreachLog)session.get(OutreachLogImpl.class,
						primaryKey);

				if (outreachLog != null) {
					cacheResult(outreachLog);
				}
				else {
					entityCache.putResult(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
						OutreachLogImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
					OutreachLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return outreachLog;
	}

	/**
	 * Returns the outreach log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the outreach log
	 * @return the outreach log, or <code>null</code> if a outreach log with the primary key could not be found
	 */
	@Override
	public OutreachLog fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, OutreachLog> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, OutreachLog> map = new HashMap<Serializable, OutreachLog>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			OutreachLog outreachLog = fetchByPrimaryKey(primaryKey);

			if (outreachLog != null) {
				map.put(primaryKey, outreachLog);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
					OutreachLogImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (OutreachLog)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_OUTREACHLOG_WHERE_PKS_IN);

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

			for (OutreachLog outreachLog : (List<OutreachLog>)q.list()) {
				map.put(outreachLog.getPrimaryKeyObj(), outreachLog);

				cacheResult(outreachLog);

				uncachedPrimaryKeys.remove(outreachLog.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(OutreachLogModelImpl.ENTITY_CACHE_ENABLED,
					OutreachLogImpl.class, primaryKey, nullModel);
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
	 * Returns all the outreach logs.
	 *
	 * @return the outreach logs
	 */
	@Override
	public List<OutreachLog> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the outreach logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of outreach logs
	 * @param end the upper bound of the range of outreach logs (not inclusive)
	 * @return the range of outreach logs
	 */
	@Override
	public List<OutreachLog> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the outreach logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of outreach logs
	 * @param end the upper bound of the range of outreach logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of outreach logs
	 */
	@Override
	public List<OutreachLog> findAll(int start, int end,
		OrderByComparator<OutreachLog> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the outreach logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of outreach logs
	 * @param end the upper bound of the range of outreach logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of outreach logs
	 */
	@Override
	public List<OutreachLog> findAll(int start, int end,
		OrderByComparator<OutreachLog> orderByComparator,
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

		List<OutreachLog> list = null;

		if (retrieveFromCache) {
			list = (List<OutreachLog>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_OUTREACHLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OUTREACHLOG;

				if (pagination) {
					sql = sql.concat(OutreachLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OutreachLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<OutreachLog>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the outreach logs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OutreachLog outreachLog : findAll()) {
			remove(outreachLog);
		}
	}

	/**
	 * Returns the number of outreach logs.
	 *
	 * @return the number of outreach logs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OUTREACHLOG);

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
		return OutreachLogModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the outreach log persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(OutreachLogImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_OUTREACHLOG = "SELECT outreachLog FROM OutreachLog outreachLog";
	private static final String _SQL_SELECT_OUTREACHLOG_WHERE_PKS_IN = "SELECT outreachLog FROM OutreachLog outreachLog WHERE id_ IN (";
	private static final String _SQL_SELECT_OUTREACHLOG_WHERE = "SELECT outreachLog FROM OutreachLog outreachLog WHERE ";
	private static final String _SQL_COUNT_OUTREACHLOG = "SELECT COUNT(outreachLog) FROM OutreachLog outreachLog";
	private static final String _SQL_COUNT_OUTREACHLOG_WHERE = "SELECT COUNT(outreachLog) FROM OutreachLog outreachLog WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "outreachLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OutreachLog exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OutreachLog exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(OutreachLogPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}