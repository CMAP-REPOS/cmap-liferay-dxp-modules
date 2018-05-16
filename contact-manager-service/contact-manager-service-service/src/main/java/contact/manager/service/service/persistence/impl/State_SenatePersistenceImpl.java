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

import contact.manager.service.exception.NoSuchState_SenateException;
import contact.manager.service.model.State_Senate;
import contact.manager.service.model.impl.State_SenateImpl;
import contact.manager.service.model.impl.State_SenateModelImpl;
import contact.manager.service.service.persistence.State_SenatePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the state_ senate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see State_SenatePersistence
 * @see contact.manager.service.service.persistence.State_SenateUtil
 * @generated
 */
@ProviderType
public class State_SenatePersistenceImpl extends BasePersistenceImpl<State_Senate>
	implements State_SenatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link State_SenateUtil} to access the state_ senate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = State_SenateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(State_SenateModelImpl.ENTITY_CACHE_ENABLED,
			State_SenateModelImpl.FINDER_CACHE_ENABLED, State_SenateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(State_SenateModelImpl.ENTITY_CACHE_ENABLED,
			State_SenateModelImpl.FINDER_CACHE_ENABLED, State_SenateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(State_SenateModelImpl.ENTITY_CACHE_ENABLED,
			State_SenateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public State_SenatePersistenceImpl() {
		setModelClass(State_Senate.class);
	}

	/**
	 * Caches the state_ senate in the entity cache if it is enabled.
	 *
	 * @param state_Senate the state_ senate
	 */
	@Override
	public void cacheResult(State_Senate state_Senate) {
		entityCache.putResult(State_SenateModelImpl.ENTITY_CACHE_ENABLED,
			State_SenateImpl.class, state_Senate.getPrimaryKey(), state_Senate);

		state_Senate.resetOriginalValues();
	}

	/**
	 * Caches the state_ senates in the entity cache if it is enabled.
	 *
	 * @param state_Senates the state_ senates
	 */
	@Override
	public void cacheResult(List<State_Senate> state_Senates) {
		for (State_Senate state_Senate : state_Senates) {
			if (entityCache.getResult(
						State_SenateModelImpl.ENTITY_CACHE_ENABLED,
						State_SenateImpl.class, state_Senate.getPrimaryKey()) == null) {
				cacheResult(state_Senate);
			}
			else {
				state_Senate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all state_ senates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(State_SenateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the state_ senate.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(State_Senate state_Senate) {
		entityCache.removeResult(State_SenateModelImpl.ENTITY_CACHE_ENABLED,
			State_SenateImpl.class, state_Senate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<State_Senate> state_Senates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (State_Senate state_Senate : state_Senates) {
			entityCache.removeResult(State_SenateModelImpl.ENTITY_CACHE_ENABLED,
				State_SenateImpl.class, state_Senate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new state_ senate with the primary key. Does not add the state_ senate to the database.
	 *
	 * @param stateSenateId the primary key for the new state_ senate
	 * @return the new state_ senate
	 */
	@Override
	public State_Senate create(long stateSenateId) {
		State_Senate state_Senate = new State_SenateImpl();

		state_Senate.setNew(true);
		state_Senate.setPrimaryKey(stateSenateId);

		return state_Senate;
	}

	/**
	 * Removes the state_ senate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param stateSenateId the primary key of the state_ senate
	 * @return the state_ senate that was removed
	 * @throws NoSuchState_SenateException if a state_ senate with the primary key could not be found
	 */
	@Override
	public State_Senate remove(long stateSenateId)
		throws NoSuchState_SenateException {
		return remove((Serializable)stateSenateId);
	}

	/**
	 * Removes the state_ senate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the state_ senate
	 * @return the state_ senate that was removed
	 * @throws NoSuchState_SenateException if a state_ senate with the primary key could not be found
	 */
	@Override
	public State_Senate remove(Serializable primaryKey)
		throws NoSuchState_SenateException {
		Session session = null;

		try {
			session = openSession();

			State_Senate state_Senate = (State_Senate)session.get(State_SenateImpl.class,
					primaryKey);

			if (state_Senate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchState_SenateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(state_Senate);
		}
		catch (NoSuchState_SenateException nsee) {
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
	protected State_Senate removeImpl(State_Senate state_Senate) {
		state_Senate = toUnwrappedModel(state_Senate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(state_Senate)) {
				state_Senate = (State_Senate)session.get(State_SenateImpl.class,
						state_Senate.getPrimaryKeyObj());
			}

			if (state_Senate != null) {
				session.delete(state_Senate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (state_Senate != null) {
			clearCache(state_Senate);
		}

		return state_Senate;
	}

	@Override
	public State_Senate updateImpl(State_Senate state_Senate) {
		state_Senate = toUnwrappedModel(state_Senate);

		boolean isNew = state_Senate.isNew();

		Session session = null;

		try {
			session = openSession();

			if (state_Senate.isNew()) {
				session.save(state_Senate);

				state_Senate.setNew(false);
			}
			else {
				state_Senate = (State_Senate)session.merge(state_Senate);
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

		entityCache.putResult(State_SenateModelImpl.ENTITY_CACHE_ENABLED,
			State_SenateImpl.class, state_Senate.getPrimaryKey(), state_Senate,
			false);

		state_Senate.resetOriginalValues();

		return state_Senate;
	}

	protected State_Senate toUnwrappedModel(State_Senate state_Senate) {
		if (state_Senate instanceof State_SenateImpl) {
			return state_Senate;
		}

		State_SenateImpl state_SenateImpl = new State_SenateImpl();

		state_SenateImpl.setNew(state_Senate.isNew());
		state_SenateImpl.setPrimaryKey(state_Senate.getPrimaryKey());

		state_SenateImpl.setStateSenateId(state_Senate.getStateSenateId());
		state_SenateImpl.setStateSenateNumber(state_Senate.getStateSenateNumber());
		state_SenateImpl.setStateSenateName(state_Senate.getStateSenateName());
		state_SenateImpl.setZipCode(state_Senate.getZipCode());

		return state_SenateImpl;
	}

	/**
	 * Returns the state_ senate with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the state_ senate
	 * @return the state_ senate
	 * @throws NoSuchState_SenateException if a state_ senate with the primary key could not be found
	 */
	@Override
	public State_Senate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchState_SenateException {
		State_Senate state_Senate = fetchByPrimaryKey(primaryKey);

		if (state_Senate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchState_SenateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return state_Senate;
	}

	/**
	 * Returns the state_ senate with the primary key or throws a {@link NoSuchState_SenateException} if it could not be found.
	 *
	 * @param stateSenateId the primary key of the state_ senate
	 * @return the state_ senate
	 * @throws NoSuchState_SenateException if a state_ senate with the primary key could not be found
	 */
	@Override
	public State_Senate findByPrimaryKey(long stateSenateId)
		throws NoSuchState_SenateException {
		return findByPrimaryKey((Serializable)stateSenateId);
	}

	/**
	 * Returns the state_ senate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the state_ senate
	 * @return the state_ senate, or <code>null</code> if a state_ senate with the primary key could not be found
	 */
	@Override
	public State_Senate fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(State_SenateModelImpl.ENTITY_CACHE_ENABLED,
				State_SenateImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		State_Senate state_Senate = (State_Senate)serializable;

		if (state_Senate == null) {
			Session session = null;

			try {
				session = openSession();

				state_Senate = (State_Senate)session.get(State_SenateImpl.class,
						primaryKey);

				if (state_Senate != null) {
					cacheResult(state_Senate);
				}
				else {
					entityCache.putResult(State_SenateModelImpl.ENTITY_CACHE_ENABLED,
						State_SenateImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(State_SenateModelImpl.ENTITY_CACHE_ENABLED,
					State_SenateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return state_Senate;
	}

	/**
	 * Returns the state_ senate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param stateSenateId the primary key of the state_ senate
	 * @return the state_ senate, or <code>null</code> if a state_ senate with the primary key could not be found
	 */
	@Override
	public State_Senate fetchByPrimaryKey(long stateSenateId) {
		return fetchByPrimaryKey((Serializable)stateSenateId);
	}

	@Override
	public Map<Serializable, State_Senate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, State_Senate> map = new HashMap<Serializable, State_Senate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			State_Senate state_Senate = fetchByPrimaryKey(primaryKey);

			if (state_Senate != null) {
				map.put(primaryKey, state_Senate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(State_SenateModelImpl.ENTITY_CACHE_ENABLED,
					State_SenateImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (State_Senate)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_STATE_SENATE_WHERE_PKS_IN);

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

			for (State_Senate state_Senate : (List<State_Senate>)q.list()) {
				map.put(state_Senate.getPrimaryKeyObj(), state_Senate);

				cacheResult(state_Senate);

				uncachedPrimaryKeys.remove(state_Senate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(State_SenateModelImpl.ENTITY_CACHE_ENABLED,
					State_SenateImpl.class, primaryKey, nullModel);
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
	 * Returns all the state_ senates.
	 *
	 * @return the state_ senates
	 */
	@Override
	public List<State_Senate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the state_ senates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of state_ senates
	 * @param end the upper bound of the range of state_ senates (not inclusive)
	 * @return the range of state_ senates
	 */
	@Override
	public List<State_Senate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the state_ senates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of state_ senates
	 * @param end the upper bound of the range of state_ senates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of state_ senates
	 */
	@Override
	public List<State_Senate> findAll(int start, int end,
		OrderByComparator<State_Senate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the state_ senates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of state_ senates
	 * @param end the upper bound of the range of state_ senates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of state_ senates
	 */
	@Override
	public List<State_Senate> findAll(int start, int end,
		OrderByComparator<State_Senate> orderByComparator,
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

		List<State_Senate> list = null;

		if (retrieveFromCache) {
			list = (List<State_Senate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_STATE_SENATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATE_SENATE;

				if (pagination) {
					sql = sql.concat(State_SenateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<State_Senate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<State_Senate>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the state_ senates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (State_Senate state_Senate : findAll()) {
			remove(state_Senate);
		}
	}

	/**
	 * Returns the number of state_ senates.
	 *
	 * @return the number of state_ senates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STATE_SENATE);

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
		return State_SenateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the state_ senate persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(State_SenateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_STATE_SENATE = "SELECT state_Senate FROM State_Senate state_Senate";
	private static final String _SQL_SELECT_STATE_SENATE_WHERE_PKS_IN = "SELECT state_Senate FROM State_Senate state_Senate WHERE stateSenateId IN (";
	private static final String _SQL_COUNT_STATE_SENATE = "SELECT COUNT(state_Senate) FROM State_Senate state_Senate";
	private static final String _ORDER_BY_ENTITY_ALIAS = "state_Senate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No State_Senate exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(State_SenatePersistenceImpl.class);
}