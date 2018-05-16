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
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.service.exception.NoSuchContactAuditLogException;
import contact.manager.service.model.ContactAuditLog;
import contact.manager.service.model.impl.ContactAuditLogImpl;
import contact.manager.service.model.impl.ContactAuditLogModelImpl;
import contact.manager.service.service.persistence.ContactAuditLogPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the contact audit log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLogPersistence
 * @see contact.manager.service.service.persistence.ContactAuditLogUtil
 * @generated
 */
@ProviderType
public class ContactAuditLogPersistenceImpl extends BasePersistenceImpl<ContactAuditLog>
	implements ContactAuditLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ContactAuditLogUtil} to access the contact audit log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ContactAuditLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			ContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			ContactAuditLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			ContactAuditLogModelImpl.FINDER_CACHE_ENABLED,
			ContactAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			ContactAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ContactAuditLogPersistenceImpl() {
		setModelClass(ContactAuditLog.class);
	}

	/**
	 * Caches the contact audit log in the entity cache if it is enabled.
	 *
	 * @param contactAuditLog the contact audit log
	 */
	@Override
	public void cacheResult(ContactAuditLog contactAuditLog) {
		entityCache.putResult(ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			ContactAuditLogImpl.class, contactAuditLog.getPrimaryKey(),
			contactAuditLog);

		contactAuditLog.resetOriginalValues();
	}

	/**
	 * Caches the contact audit logs in the entity cache if it is enabled.
	 *
	 * @param contactAuditLogs the contact audit logs
	 */
	@Override
	public void cacheResult(List<ContactAuditLog> contactAuditLogs) {
		for (ContactAuditLog contactAuditLog : contactAuditLogs) {
			if (entityCache.getResult(
						ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
						ContactAuditLogImpl.class,
						contactAuditLog.getPrimaryKey()) == null) {
				cacheResult(contactAuditLog);
			}
			else {
				contactAuditLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all contact audit logs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ContactAuditLogImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the contact audit log.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ContactAuditLog contactAuditLog) {
		entityCache.removeResult(ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			ContactAuditLogImpl.class, contactAuditLog.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ContactAuditLog> contactAuditLogs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ContactAuditLog contactAuditLog : contactAuditLogs) {
			entityCache.removeResult(ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
				ContactAuditLogImpl.class, contactAuditLog.getPrimaryKey());
		}
	}

	/**
	 * Creates a new contact audit log with the primary key. Does not add the contact audit log to the database.
	 *
	 * @param contactAuditLogId the primary key for the new contact audit log
	 * @return the new contact audit log
	 */
	@Override
	public ContactAuditLog create(long contactAuditLogId) {
		ContactAuditLog contactAuditLog = new ContactAuditLogImpl();

		contactAuditLog.setNew(true);
		contactAuditLog.setPrimaryKey(contactAuditLogId);

		contactAuditLog.setCompanyId(companyProvider.getCompanyId());

		return contactAuditLog;
	}

	/**
	 * Removes the contact audit log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contactAuditLogId the primary key of the contact audit log
	 * @return the contact audit log that was removed
	 * @throws NoSuchContactAuditLogException if a contact audit log with the primary key could not be found
	 */
	@Override
	public ContactAuditLog remove(long contactAuditLogId)
		throws NoSuchContactAuditLogException {
		return remove((Serializable)contactAuditLogId);
	}

	/**
	 * Removes the contact audit log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the contact audit log
	 * @return the contact audit log that was removed
	 * @throws NoSuchContactAuditLogException if a contact audit log with the primary key could not be found
	 */
	@Override
	public ContactAuditLog remove(Serializable primaryKey)
		throws NoSuchContactAuditLogException {
		Session session = null;

		try {
			session = openSession();

			ContactAuditLog contactAuditLog = (ContactAuditLog)session.get(ContactAuditLogImpl.class,
					primaryKey);

			if (contactAuditLog == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchContactAuditLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(contactAuditLog);
		}
		catch (NoSuchContactAuditLogException nsee) {
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
	protected ContactAuditLog removeImpl(ContactAuditLog contactAuditLog) {
		contactAuditLog = toUnwrappedModel(contactAuditLog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(contactAuditLog)) {
				contactAuditLog = (ContactAuditLog)session.get(ContactAuditLogImpl.class,
						contactAuditLog.getPrimaryKeyObj());
			}

			if (contactAuditLog != null) {
				session.delete(contactAuditLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (contactAuditLog != null) {
			clearCache(contactAuditLog);
		}

		return contactAuditLog;
	}

	@Override
	public ContactAuditLog updateImpl(ContactAuditLog contactAuditLog) {
		contactAuditLog = toUnwrappedModel(contactAuditLog);

		boolean isNew = contactAuditLog.isNew();

		Session session = null;

		try {
			session = openSession();

			if (contactAuditLog.isNew()) {
				session.save(contactAuditLog);

				contactAuditLog.setNew(false);
			}
			else {
				contactAuditLog = (ContactAuditLog)session.merge(contactAuditLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			ContactAuditLogImpl.class, contactAuditLog.getPrimaryKey(),
			contactAuditLog, false);

		contactAuditLog.resetOriginalValues();

		return contactAuditLog;
	}

	protected ContactAuditLog toUnwrappedModel(ContactAuditLog contactAuditLog) {
		if (contactAuditLog instanceof ContactAuditLogImpl) {
			return contactAuditLog;
		}

		ContactAuditLogImpl contactAuditLogImpl = new ContactAuditLogImpl();

		contactAuditLogImpl.setNew(contactAuditLog.isNew());
		contactAuditLogImpl.setPrimaryKey(contactAuditLog.getPrimaryKey());

		contactAuditLogImpl.setContactAuditLogId(contactAuditLog.getContactAuditLogId());
		contactAuditLogImpl.setGroupId(contactAuditLog.getGroupId());
		contactAuditLogImpl.setCompanyId(contactAuditLog.getCompanyId());
		contactAuditLogImpl.setUserId(contactAuditLog.getUserId());
		contactAuditLogImpl.setCreateDate(contactAuditLog.getCreateDate());
		contactAuditLogImpl.setAction(contactAuditLog.getAction());
		contactAuditLogImpl.setConstantContactId(contactAuditLog.getConstantContactId());
		contactAuditLogImpl.setOldSnapshot(contactAuditLog.getOldSnapshot());
		contactAuditLogImpl.setNewSnapshot(contactAuditLog.getNewSnapshot());
		contactAuditLogImpl.setContactId(contactAuditLog.getContactId());

		return contactAuditLogImpl;
	}

	/**
	 * Returns the contact audit log with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the contact audit log
	 * @return the contact audit log
	 * @throws NoSuchContactAuditLogException if a contact audit log with the primary key could not be found
	 */
	@Override
	public ContactAuditLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchContactAuditLogException {
		ContactAuditLog contactAuditLog = fetchByPrimaryKey(primaryKey);

		if (contactAuditLog == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchContactAuditLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return contactAuditLog;
	}

	/**
	 * Returns the contact audit log with the primary key or throws a {@link NoSuchContactAuditLogException} if it could not be found.
	 *
	 * @param contactAuditLogId the primary key of the contact audit log
	 * @return the contact audit log
	 * @throws NoSuchContactAuditLogException if a contact audit log with the primary key could not be found
	 */
	@Override
	public ContactAuditLog findByPrimaryKey(long contactAuditLogId)
		throws NoSuchContactAuditLogException {
		return findByPrimaryKey((Serializable)contactAuditLogId);
	}

	/**
	 * Returns the contact audit log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the contact audit log
	 * @return the contact audit log, or <code>null</code> if a contact audit log with the primary key could not be found
	 */
	@Override
	public ContactAuditLog fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
				ContactAuditLogImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ContactAuditLog contactAuditLog = (ContactAuditLog)serializable;

		if (contactAuditLog == null) {
			Session session = null;

			try {
				session = openSession();

				contactAuditLog = (ContactAuditLog)session.get(ContactAuditLogImpl.class,
						primaryKey);

				if (contactAuditLog != null) {
					cacheResult(contactAuditLog);
				}
				else {
					entityCache.putResult(ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
						ContactAuditLogImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
					ContactAuditLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return contactAuditLog;
	}

	/**
	 * Returns the contact audit log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contactAuditLogId the primary key of the contact audit log
	 * @return the contact audit log, or <code>null</code> if a contact audit log with the primary key could not be found
	 */
	@Override
	public ContactAuditLog fetchByPrimaryKey(long contactAuditLogId) {
		return fetchByPrimaryKey((Serializable)contactAuditLogId);
	}

	@Override
	public Map<Serializable, ContactAuditLog> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ContactAuditLog> map = new HashMap<Serializable, ContactAuditLog>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ContactAuditLog contactAuditLog = fetchByPrimaryKey(primaryKey);

			if (contactAuditLog != null) {
				map.put(primaryKey, contactAuditLog);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
					ContactAuditLogImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ContactAuditLog)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CONTACTAUDITLOG_WHERE_PKS_IN);

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

			for (ContactAuditLog contactAuditLog : (List<ContactAuditLog>)q.list()) {
				map.put(contactAuditLog.getPrimaryKeyObj(), contactAuditLog);

				cacheResult(contactAuditLog);

				uncachedPrimaryKeys.remove(contactAuditLog.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ContactAuditLogModelImpl.ENTITY_CACHE_ENABLED,
					ContactAuditLogImpl.class, primaryKey, nullModel);
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
	 * Returns all the contact audit logs.
	 *
	 * @return the contact audit logs
	 */
	@Override
	public List<ContactAuditLog> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contact audit logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contact audit logs
	 * @param end the upper bound of the range of contact audit logs (not inclusive)
	 * @return the range of contact audit logs
	 */
	@Override
	public List<ContactAuditLog> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the contact audit logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contact audit logs
	 * @param end the upper bound of the range of contact audit logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contact audit logs
	 */
	@Override
	public List<ContactAuditLog> findAll(int start, int end,
		OrderByComparator<ContactAuditLog> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contact audit logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contact audit logs
	 * @param end the upper bound of the range of contact audit logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of contact audit logs
	 */
	@Override
	public List<ContactAuditLog> findAll(int start, int end,
		OrderByComparator<ContactAuditLog> orderByComparator,
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

		List<ContactAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<ContactAuditLog>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CONTACTAUDITLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONTACTAUDITLOG;

				if (pagination) {
					sql = sql.concat(ContactAuditLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ContactAuditLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ContactAuditLog>)QueryUtil.list(q,
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
	 * Removes all the contact audit logs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ContactAuditLog contactAuditLog : findAll()) {
			remove(contactAuditLog);
		}
	}

	/**
	 * Returns the number of contact audit logs.
	 *
	 * @return the number of contact audit logs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONTACTAUDITLOG);

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
	protected Map<String, Integer> getTableColumnsMap() {
		return ContactAuditLogModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the contact audit log persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ContactAuditLogImpl.class.getName());
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
	private static final String _SQL_SELECT_CONTACTAUDITLOG = "SELECT contactAuditLog FROM ContactAuditLog contactAuditLog";
	private static final String _SQL_SELECT_CONTACTAUDITLOG_WHERE_PKS_IN = "SELECT contactAuditLog FROM ContactAuditLog contactAuditLog WHERE contactAuditLogId IN (";
	private static final String _SQL_COUNT_CONTACTAUDITLOG = "SELECT COUNT(contactAuditLog) FROM ContactAuditLog contactAuditLog";
	private static final String _ORDER_BY_ENTITY_ALIAS = "contactAuditLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ContactAuditLog exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ContactAuditLogPersistenceImpl.class);
}