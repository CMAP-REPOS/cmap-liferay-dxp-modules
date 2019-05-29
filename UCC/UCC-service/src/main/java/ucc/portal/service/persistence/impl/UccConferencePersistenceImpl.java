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

package ucc.portal.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ucc.portal.exception.NoSuchUccConferenceException;

import ucc.portal.model.UccConference;
import ucc.portal.model.impl.UccConferenceImpl;
import ucc.portal.model.impl.UccConferenceModelImpl;

import ucc.portal.service.persistence.UccConferencePersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the ucc conference service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccConferencePersistence
 * @see ucc.portal.service.persistence.UccConferenceUtil
 * @generated
 */
@ProviderType
public class UccConferencePersistenceImpl extends BasePersistenceImpl<UccConference>
	implements UccConferencePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UccConferenceUtil} to access the ucc conference persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UccConferenceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
			UccConferenceModelImpl.FINDER_CACHE_ENABLED,
			UccConferenceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
			UccConferenceModelImpl.FINDER_CACHE_ENABLED,
			UccConferenceImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
			UccConferenceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UccConferencePersistenceImpl() {
		setModelClass(UccConference.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uccConferenceId", "conferenceId");
			dbColumnNames.put("name", "conference_name");
			dbColumnNames.put("abbreviation", "confabbr");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the ucc conference in the entity cache if it is enabled.
	 *
	 * @param uccConference the ucc conference
	 */
	@Override
	public void cacheResult(UccConference uccConference) {
		entityCache.putResult(UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
			UccConferenceImpl.class, uccConference.getPrimaryKey(),
			uccConference);

		uccConference.resetOriginalValues();
	}

	/**
	 * Caches the ucc conferences in the entity cache if it is enabled.
	 *
	 * @param uccConferences the ucc conferences
	 */
	@Override
	public void cacheResult(List<UccConference> uccConferences) {
		for (UccConference uccConference : uccConferences) {
			if (entityCache.getResult(
						UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
						UccConferenceImpl.class, uccConference.getPrimaryKey()) == null) {
				cacheResult(uccConference);
			}
			else {
				uccConference.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ucc conferences.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UccConferenceImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ucc conference.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UccConference uccConference) {
		entityCache.removeResult(UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
			UccConferenceImpl.class, uccConference.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UccConference> uccConferences) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UccConference uccConference : uccConferences) {
			entityCache.removeResult(UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
				UccConferenceImpl.class, uccConference.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ucc conference with the primary key. Does not add the ucc conference to the database.
	 *
	 * @param uccConferenceId the primary key for the new ucc conference
	 * @return the new ucc conference
	 */
	@Override
	public UccConference create(int uccConferenceId) {
		UccConference uccConference = new UccConferenceImpl();

		uccConference.setNew(true);
		uccConference.setPrimaryKey(uccConferenceId);

		return uccConference;
	}

	/**
	 * Removes the ucc conference with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param uccConferenceId the primary key of the ucc conference
	 * @return the ucc conference that was removed
	 * @throws NoSuchUccConferenceException if a ucc conference with the primary key could not be found
	 */
	@Override
	public UccConference remove(int uccConferenceId)
		throws NoSuchUccConferenceException {
		return remove((Serializable)uccConferenceId);
	}

	/**
	 * Removes the ucc conference with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ucc conference
	 * @return the ucc conference that was removed
	 * @throws NoSuchUccConferenceException if a ucc conference with the primary key could not be found
	 */
	@Override
	public UccConference remove(Serializable primaryKey)
		throws NoSuchUccConferenceException {
		Session session = null;

		try {
			session = openSession();

			UccConference uccConference = (UccConference)session.get(UccConferenceImpl.class,
					primaryKey);

			if (uccConference == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUccConferenceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(uccConference);
		}
		catch (NoSuchUccConferenceException nsee) {
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
	protected UccConference removeImpl(UccConference uccConference) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(uccConference)) {
				uccConference = (UccConference)session.get(UccConferenceImpl.class,
						uccConference.getPrimaryKeyObj());
			}

			if (uccConference != null) {
				session.delete(uccConference);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (uccConference != null) {
			clearCache(uccConference);
		}

		return uccConference;
	}

	@Override
	public UccConference updateImpl(UccConference uccConference) {
		boolean isNew = uccConference.isNew();

		Session session = null;

		try {
			session = openSession();

			if (uccConference.isNew()) {
				session.save(uccConference);

				uccConference.setNew(false);
			}
			else {
				uccConference = (UccConference)session.merge(uccConference);
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

		entityCache.putResult(UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
			UccConferenceImpl.class, uccConference.getPrimaryKey(),
			uccConference, false);

		uccConference.resetOriginalValues();

		return uccConference;
	}

	/**
	 * Returns the ucc conference with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ucc conference
	 * @return the ucc conference
	 * @throws NoSuchUccConferenceException if a ucc conference with the primary key could not be found
	 */
	@Override
	public UccConference findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUccConferenceException {
		UccConference uccConference = fetchByPrimaryKey(primaryKey);

		if (uccConference == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUccConferenceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return uccConference;
	}

	/**
	 * Returns the ucc conference with the primary key or throws a {@link NoSuchUccConferenceException} if it could not be found.
	 *
	 * @param uccConferenceId the primary key of the ucc conference
	 * @return the ucc conference
	 * @throws NoSuchUccConferenceException if a ucc conference with the primary key could not be found
	 */
	@Override
	public UccConference findByPrimaryKey(int uccConferenceId)
		throws NoSuchUccConferenceException {
		return findByPrimaryKey((Serializable)uccConferenceId);
	}

	/**
	 * Returns the ucc conference with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ucc conference
	 * @return the ucc conference, or <code>null</code> if a ucc conference with the primary key could not be found
	 */
	@Override
	public UccConference fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
				UccConferenceImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		UccConference uccConference = (UccConference)serializable;

		if (uccConference == null) {
			Session session = null;

			try {
				session = openSession();

				uccConference = (UccConference)session.get(UccConferenceImpl.class,
						primaryKey);

				if (uccConference != null) {
					cacheResult(uccConference);
				}
				else {
					entityCache.putResult(UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
						UccConferenceImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
					UccConferenceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return uccConference;
	}

	/**
	 * Returns the ucc conference with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param uccConferenceId the primary key of the ucc conference
	 * @return the ucc conference, or <code>null</code> if a ucc conference with the primary key could not be found
	 */
	@Override
	public UccConference fetchByPrimaryKey(int uccConferenceId) {
		return fetchByPrimaryKey((Serializable)uccConferenceId);
	}

	@Override
	public Map<Serializable, UccConference> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, UccConference> map = new HashMap<Serializable, UccConference>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			UccConference uccConference = fetchByPrimaryKey(primaryKey);

			if (uccConference != null) {
				map.put(primaryKey, uccConference);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
					UccConferenceImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (UccConference)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_UCCCONFERENCE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((int)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (UccConference uccConference : (List<UccConference>)q.list()) {
				map.put(uccConference.getPrimaryKeyObj(), uccConference);

				cacheResult(uccConference);

				uncachedPrimaryKeys.remove(uccConference.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(UccConferenceModelImpl.ENTITY_CACHE_ENABLED,
					UccConferenceImpl.class, primaryKey, nullModel);
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
	 * Returns all the ucc conferences.
	 *
	 * @return the ucc conferences
	 */
	@Override
	public List<UccConference> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ucc conferences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccConferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc conferences
	 * @param end the upper bound of the range of ucc conferences (not inclusive)
	 * @return the range of ucc conferences
	 */
	@Override
	public List<UccConference> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ucc conferences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccConferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc conferences
	 * @param end the upper bound of the range of ucc conferences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ucc conferences
	 */
	@Override
	public List<UccConference> findAll(int start, int end,
		OrderByComparator<UccConference> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ucc conferences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccConferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ucc conferences
	 * @param end the upper bound of the range of ucc conferences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ucc conferences
	 */
	@Override
	public List<UccConference> findAll(int start, int end,
		OrderByComparator<UccConference> orderByComparator,
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

		List<UccConference> list = null;

		if (retrieveFromCache) {
			list = (List<UccConference>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_UCCCONFERENCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_UCCCONFERENCE;

				if (pagination) {
					sql = sql.concat(UccConferenceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UccConference>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UccConference>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ucc conferences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UccConference uccConference : findAll()) {
			remove(uccConference);
		}
	}

	/**
	 * Returns the number of ucc conferences.
	 *
	 * @return the number of ucc conferences
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_UCCCONFERENCE);

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
		return UccConferenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ucc conference persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(UccConferenceImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_UCCCONFERENCE = "SELECT uccConference FROM UccConference uccConference";
	private static final String _SQL_SELECT_UCCCONFERENCE_WHERE_PKS_IN = "SELECT uccConference FROM UccConference uccConference WHERE conferenceId IN (";
	private static final String _SQL_COUNT_UCCCONFERENCE = "SELECT COUNT(uccConference) FROM UccConference uccConference";
	private static final String _ORDER_BY_ENTITY_ALIAS = "uccConference.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UccConference exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(UccConferencePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uccConferenceId", "name", "abbreviation"
			});
}