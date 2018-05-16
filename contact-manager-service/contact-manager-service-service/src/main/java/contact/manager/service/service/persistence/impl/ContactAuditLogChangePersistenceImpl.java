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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.service.exception.NoSuchContactAuditLogChangeException;
import contact.manager.service.model.ContactAuditLogChange;
import contact.manager.service.model.impl.ContactAuditLogChangeImpl;
import contact.manager.service.model.impl.ContactAuditLogChangeModelImpl;
import contact.manager.service.service.persistence.ContactAuditLogChangePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the contact audit log change service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLogChangePersistence
 * @see contact.manager.service.service.persistence.ContactAuditLogChangeUtil
 * @generated
 */
@ProviderType
public class ContactAuditLogChangePersistenceImpl extends BasePersistenceImpl<ContactAuditLogChange>
	implements ContactAuditLogChangePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ContactAuditLogChangeUtil} to access the contact audit log change persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ContactAuditLogChangeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			ContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED,
			ContactAuditLogChangeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			ContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED,
			ContactAuditLogChangeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			ContactAuditLogChangeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ContactAuditLogChangePersistenceImpl() {
		setModelClass(ContactAuditLogChange.class);
	}

	/**
	 * Caches the contact audit log change in the entity cache if it is enabled.
	 *
	 * @param contactAuditLogChange the contact audit log change
	 */
	@Override
	public void cacheResult(ContactAuditLogChange contactAuditLogChange) {
		entityCache.putResult(ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			ContactAuditLogChangeImpl.class,
			contactAuditLogChange.getPrimaryKey(), contactAuditLogChange);

		contactAuditLogChange.resetOriginalValues();
	}

	/**
	 * Caches the contact audit log changes in the entity cache if it is enabled.
	 *
	 * @param contactAuditLogChanges the contact audit log changes
	 */
	@Override
	public void cacheResult(List<ContactAuditLogChange> contactAuditLogChanges) {
		for (ContactAuditLogChange contactAuditLogChange : contactAuditLogChanges) {
			if (entityCache.getResult(
						ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
						ContactAuditLogChangeImpl.class,
						contactAuditLogChange.getPrimaryKey()) == null) {
				cacheResult(contactAuditLogChange);
			}
			else {
				contactAuditLogChange.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all contact audit log changes.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ContactAuditLogChangeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the contact audit log change.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ContactAuditLogChange contactAuditLogChange) {
		entityCache.removeResult(ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			ContactAuditLogChangeImpl.class,
			contactAuditLogChange.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ContactAuditLogChange> contactAuditLogChanges) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ContactAuditLogChange contactAuditLogChange : contactAuditLogChanges) {
			entityCache.removeResult(ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
				ContactAuditLogChangeImpl.class,
				contactAuditLogChange.getPrimaryKey());
		}
	}

	/**
	 * Creates a new contact audit log change with the primary key. Does not add the contact audit log change to the database.
	 *
	 * @param contactAuditLogChangeId the primary key for the new contact audit log change
	 * @return the new contact audit log change
	 */
	@Override
	public ContactAuditLogChange create(long contactAuditLogChangeId) {
		ContactAuditLogChange contactAuditLogChange = new ContactAuditLogChangeImpl();

		contactAuditLogChange.setNew(true);
		contactAuditLogChange.setPrimaryKey(contactAuditLogChangeId);

		return contactAuditLogChange;
	}

	/**
	 * Removes the contact audit log change with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contactAuditLogChangeId the primary key of the contact audit log change
	 * @return the contact audit log change that was removed
	 * @throws NoSuchContactAuditLogChangeException if a contact audit log change with the primary key could not be found
	 */
	@Override
	public ContactAuditLogChange remove(long contactAuditLogChangeId)
		throws NoSuchContactAuditLogChangeException {
		return remove((Serializable)contactAuditLogChangeId);
	}

	/**
	 * Removes the contact audit log change with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the contact audit log change
	 * @return the contact audit log change that was removed
	 * @throws NoSuchContactAuditLogChangeException if a contact audit log change with the primary key could not be found
	 */
	@Override
	public ContactAuditLogChange remove(Serializable primaryKey)
		throws NoSuchContactAuditLogChangeException {
		Session session = null;

		try {
			session = openSession();

			ContactAuditLogChange contactAuditLogChange = (ContactAuditLogChange)session.get(ContactAuditLogChangeImpl.class,
					primaryKey);

			if (contactAuditLogChange == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchContactAuditLogChangeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(contactAuditLogChange);
		}
		catch (NoSuchContactAuditLogChangeException nsee) {
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
	protected ContactAuditLogChange removeImpl(
		ContactAuditLogChange contactAuditLogChange) {
		contactAuditLogChange = toUnwrappedModel(contactAuditLogChange);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(contactAuditLogChange)) {
				contactAuditLogChange = (ContactAuditLogChange)session.get(ContactAuditLogChangeImpl.class,
						contactAuditLogChange.getPrimaryKeyObj());
			}

			if (contactAuditLogChange != null) {
				session.delete(contactAuditLogChange);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (contactAuditLogChange != null) {
			clearCache(contactAuditLogChange);
		}

		return contactAuditLogChange;
	}

	@Override
	public ContactAuditLogChange updateImpl(
		ContactAuditLogChange contactAuditLogChange) {
		contactAuditLogChange = toUnwrappedModel(contactAuditLogChange);

		boolean isNew = contactAuditLogChange.isNew();

		Session session = null;

		try {
			session = openSession();

			if (contactAuditLogChange.isNew()) {
				session.save(contactAuditLogChange);

				contactAuditLogChange.setNew(false);
			}
			else {
				contactAuditLogChange = (ContactAuditLogChange)session.merge(contactAuditLogChange);
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

		entityCache.putResult(ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
			ContactAuditLogChangeImpl.class,
			contactAuditLogChange.getPrimaryKey(), contactAuditLogChange, false);

		contactAuditLogChange.resetOriginalValues();

		return contactAuditLogChange;
	}

	protected ContactAuditLogChange toUnwrappedModel(
		ContactAuditLogChange contactAuditLogChange) {
		if (contactAuditLogChange instanceof ContactAuditLogChangeImpl) {
			return contactAuditLogChange;
		}

		ContactAuditLogChangeImpl contactAuditLogChangeImpl = new ContactAuditLogChangeImpl();

		contactAuditLogChangeImpl.setNew(contactAuditLogChange.isNew());
		contactAuditLogChangeImpl.setPrimaryKey(contactAuditLogChange.getPrimaryKey());

		contactAuditLogChangeImpl.setContactAuditLogChangeId(contactAuditLogChange.getContactAuditLogChangeId());
		contactAuditLogChangeImpl.setContactAuditLogId(contactAuditLogChange.getContactAuditLogId());
		contactAuditLogChangeImpl.setFieldName(contactAuditLogChange.getFieldName());
		contactAuditLogChangeImpl.setOldValue(contactAuditLogChange.getOldValue());
		contactAuditLogChangeImpl.setNewValue(contactAuditLogChange.getNewValue());

		return contactAuditLogChangeImpl;
	}

	/**
	 * Returns the contact audit log change with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the contact audit log change
	 * @return the contact audit log change
	 * @throws NoSuchContactAuditLogChangeException if a contact audit log change with the primary key could not be found
	 */
	@Override
	public ContactAuditLogChange findByPrimaryKey(Serializable primaryKey)
		throws NoSuchContactAuditLogChangeException {
		ContactAuditLogChange contactAuditLogChange = fetchByPrimaryKey(primaryKey);

		if (contactAuditLogChange == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchContactAuditLogChangeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return contactAuditLogChange;
	}

	/**
	 * Returns the contact audit log change with the primary key or throws a {@link NoSuchContactAuditLogChangeException} if it could not be found.
	 *
	 * @param contactAuditLogChangeId the primary key of the contact audit log change
	 * @return the contact audit log change
	 * @throws NoSuchContactAuditLogChangeException if a contact audit log change with the primary key could not be found
	 */
	@Override
	public ContactAuditLogChange findByPrimaryKey(long contactAuditLogChangeId)
		throws NoSuchContactAuditLogChangeException {
		return findByPrimaryKey((Serializable)contactAuditLogChangeId);
	}

	/**
	 * Returns the contact audit log change with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the contact audit log change
	 * @return the contact audit log change, or <code>null</code> if a contact audit log change with the primary key could not be found
	 */
	@Override
	public ContactAuditLogChange fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
				ContactAuditLogChangeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ContactAuditLogChange contactAuditLogChange = (ContactAuditLogChange)serializable;

		if (contactAuditLogChange == null) {
			Session session = null;

			try {
				session = openSession();

				contactAuditLogChange = (ContactAuditLogChange)session.get(ContactAuditLogChangeImpl.class,
						primaryKey);

				if (contactAuditLogChange != null) {
					cacheResult(contactAuditLogChange);
				}
				else {
					entityCache.putResult(ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
						ContactAuditLogChangeImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
					ContactAuditLogChangeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return contactAuditLogChange;
	}

	/**
	 * Returns the contact audit log change with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contactAuditLogChangeId the primary key of the contact audit log change
	 * @return the contact audit log change, or <code>null</code> if a contact audit log change with the primary key could not be found
	 */
	@Override
	public ContactAuditLogChange fetchByPrimaryKey(long contactAuditLogChangeId) {
		return fetchByPrimaryKey((Serializable)contactAuditLogChangeId);
	}

	@Override
	public Map<Serializable, ContactAuditLogChange> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ContactAuditLogChange> map = new HashMap<Serializable, ContactAuditLogChange>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ContactAuditLogChange contactAuditLogChange = fetchByPrimaryKey(primaryKey);

			if (contactAuditLogChange != null) {
				map.put(primaryKey, contactAuditLogChange);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
					ContactAuditLogChangeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ContactAuditLogChange)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CONTACTAUDITLOGCHANGE_WHERE_PKS_IN);

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

			for (ContactAuditLogChange contactAuditLogChange : (List<ContactAuditLogChange>)q.list()) {
				map.put(contactAuditLogChange.getPrimaryKeyObj(),
					contactAuditLogChange);

				cacheResult(contactAuditLogChange);

				uncachedPrimaryKeys.remove(contactAuditLogChange.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ContactAuditLogChangeModelImpl.ENTITY_CACHE_ENABLED,
					ContactAuditLogChangeImpl.class, primaryKey, nullModel);
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
	 * Returns all the contact audit log changes.
	 *
	 * @return the contact audit log changes
	 */
	@Override
	public List<ContactAuditLogChange> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contact audit log changes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contact audit log changes
	 * @param end the upper bound of the range of contact audit log changes (not inclusive)
	 * @return the range of contact audit log changes
	 */
	@Override
	public List<ContactAuditLogChange> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the contact audit log changes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contact audit log changes
	 * @param end the upper bound of the range of contact audit log changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contact audit log changes
	 */
	@Override
	public List<ContactAuditLogChange> findAll(int start, int end,
		OrderByComparator<ContactAuditLogChange> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contact audit log changes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contact audit log changes
	 * @param end the upper bound of the range of contact audit log changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of contact audit log changes
	 */
	@Override
	public List<ContactAuditLogChange> findAll(int start, int end,
		OrderByComparator<ContactAuditLogChange> orderByComparator,
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

		List<ContactAuditLogChange> list = null;

		if (retrieveFromCache) {
			list = (List<ContactAuditLogChange>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CONTACTAUDITLOGCHANGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONTACTAUDITLOGCHANGE;

				if (pagination) {
					sql = sql.concat(ContactAuditLogChangeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ContactAuditLogChange>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ContactAuditLogChange>)QueryUtil.list(q,
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
	 * Removes all the contact audit log changes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ContactAuditLogChange contactAuditLogChange : findAll()) {
			remove(contactAuditLogChange);
		}
	}

	/**
	 * Returns the number of contact audit log changes.
	 *
	 * @return the number of contact audit log changes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONTACTAUDITLOGCHANGE);

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
		return ContactAuditLogChangeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the contact audit log change persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ContactAuditLogChangeImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CONTACTAUDITLOGCHANGE = "SELECT contactAuditLogChange FROM ContactAuditLogChange contactAuditLogChange";
	private static final String _SQL_SELECT_CONTACTAUDITLOGCHANGE_WHERE_PKS_IN = "SELECT contactAuditLogChange FROM ContactAuditLogChange contactAuditLogChange WHERE contactAuditLogChangeId IN (";
	private static final String _SQL_COUNT_CONTACTAUDITLOGCHANGE = "SELECT COUNT(contactAuditLogChange) FROM ContactAuditLogChange contactAuditLogChange";
	private static final String _ORDER_BY_ENTITY_ALIAS = "contactAuditLogChange.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ContactAuditLogChange exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ContactAuditLogChangePersistenceImpl.class);
}