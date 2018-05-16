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

import contact.manager.service.exception.NoSuchLTAException;
import contact.manager.service.model.LTA;
import contact.manager.service.model.impl.LTAImpl;
import contact.manager.service.model.impl.LTAModelImpl;
import contact.manager.service.service.persistence.LTAPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the lta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LTAPersistence
 * @see contact.manager.service.service.persistence.LTAUtil
 * @generated
 */
@ProviderType
public class LTAPersistenceImpl extends BasePersistenceImpl<LTA>
	implements LTAPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LTAUtil} to access the lta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LTAImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LTAModelImpl.ENTITY_CACHE_ENABLED,
			LTAModelImpl.FINDER_CACHE_ENABLED, LTAImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LTAModelImpl.ENTITY_CACHE_ENABLED,
			LTAModelImpl.FINDER_CACHE_ENABLED, LTAImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LTAModelImpl.ENTITY_CACHE_ENABLED,
			LTAModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LTAPersistenceImpl() {
		setModelClass(LTA.class);
	}

	/**
	 * Caches the lta in the entity cache if it is enabled.
	 *
	 * @param lta the lta
	 */
	@Override
	public void cacheResult(LTA lta) {
		entityCache.putResult(LTAModelImpl.ENTITY_CACHE_ENABLED, LTAImpl.class,
			lta.getPrimaryKey(), lta);

		lta.resetOriginalValues();
	}

	/**
	 * Caches the ltas in the entity cache if it is enabled.
	 *
	 * @param ltas the ltas
	 */
	@Override
	public void cacheResult(List<LTA> ltas) {
		for (LTA lta : ltas) {
			if (entityCache.getResult(LTAModelImpl.ENTITY_CACHE_ENABLED,
						LTAImpl.class, lta.getPrimaryKey()) == null) {
				cacheResult(lta);
			}
			else {
				lta.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ltas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LTAImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lta.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LTA lta) {
		entityCache.removeResult(LTAModelImpl.ENTITY_CACHE_ENABLED,
			LTAImpl.class, lta.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LTA> ltas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LTA lta : ltas) {
			entityCache.removeResult(LTAModelImpl.ENTITY_CACHE_ENABLED,
				LTAImpl.class, lta.getPrimaryKey());
		}
	}

	/**
	 * Creates a new lta with the primary key. Does not add the lta to the database.
	 *
	 * @param ltaId the primary key for the new lta
	 * @return the new lta
	 */
	@Override
	public LTA create(long ltaId) {
		LTA lta = new LTAImpl();

		lta.setNew(true);
		lta.setPrimaryKey(ltaId);

		return lta;
	}

	/**
	 * Removes the lta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ltaId the primary key of the lta
	 * @return the lta that was removed
	 * @throws NoSuchLTAException if a lta with the primary key could not be found
	 */
	@Override
	public LTA remove(long ltaId) throws NoSuchLTAException {
		return remove((Serializable)ltaId);
	}

	/**
	 * Removes the lta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lta
	 * @return the lta that was removed
	 * @throws NoSuchLTAException if a lta with the primary key could not be found
	 */
	@Override
	public LTA remove(Serializable primaryKey) throws NoSuchLTAException {
		Session session = null;

		try {
			session = openSession();

			LTA lta = (LTA)session.get(LTAImpl.class, primaryKey);

			if (lta == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLTAException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lta);
		}
		catch (NoSuchLTAException nsee) {
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
	protected LTA removeImpl(LTA lta) {
		lta = toUnwrappedModel(lta);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lta)) {
				lta = (LTA)session.get(LTAImpl.class, lta.getPrimaryKeyObj());
			}

			if (lta != null) {
				session.delete(lta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lta != null) {
			clearCache(lta);
		}

		return lta;
	}

	@Override
	public LTA updateImpl(LTA lta) {
		lta = toUnwrappedModel(lta);

		boolean isNew = lta.isNew();

		Session session = null;

		try {
			session = openSession();

			if (lta.isNew()) {
				session.save(lta);

				lta.setNew(false);
			}
			else {
				lta = (LTA)session.merge(lta);
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

		entityCache.putResult(LTAModelImpl.ENTITY_CACHE_ENABLED, LTAImpl.class,
			lta.getPrimaryKey(), lta, false);

		lta.resetOriginalValues();

		return lta;
	}

	protected LTA toUnwrappedModel(LTA lta) {
		if (lta instanceof LTAImpl) {
			return lta;
		}

		LTAImpl ltaImpl = new LTAImpl();

		ltaImpl.setNew(lta.isNew());
		ltaImpl.setPrimaryKey(lta.getPrimaryKey());

		ltaImpl.setLtaId(lta.getLtaId());
		ltaImpl.setLtaName(lta.getLtaName());
		ltaImpl.setZipCode(lta.getZipCode());

		return ltaImpl;
	}

	/**
	 * Returns the lta with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lta
	 * @return the lta
	 * @throws NoSuchLTAException if a lta with the primary key could not be found
	 */
	@Override
	public LTA findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLTAException {
		LTA lta = fetchByPrimaryKey(primaryKey);

		if (lta == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLTAException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lta;
	}

	/**
	 * Returns the lta with the primary key or throws a {@link NoSuchLTAException} if it could not be found.
	 *
	 * @param ltaId the primary key of the lta
	 * @return the lta
	 * @throws NoSuchLTAException if a lta with the primary key could not be found
	 */
	@Override
	public LTA findByPrimaryKey(long ltaId) throws NoSuchLTAException {
		return findByPrimaryKey((Serializable)ltaId);
	}

	/**
	 * Returns the lta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lta
	 * @return the lta, or <code>null</code> if a lta with the primary key could not be found
	 */
	@Override
	public LTA fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(LTAModelImpl.ENTITY_CACHE_ENABLED,
				LTAImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		LTA lta = (LTA)serializable;

		if (lta == null) {
			Session session = null;

			try {
				session = openSession();

				lta = (LTA)session.get(LTAImpl.class, primaryKey);

				if (lta != null) {
					cacheResult(lta);
				}
				else {
					entityCache.putResult(LTAModelImpl.ENTITY_CACHE_ENABLED,
						LTAImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LTAModelImpl.ENTITY_CACHE_ENABLED,
					LTAImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lta;
	}

	/**
	 * Returns the lta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ltaId the primary key of the lta
	 * @return the lta, or <code>null</code> if a lta with the primary key could not be found
	 */
	@Override
	public LTA fetchByPrimaryKey(long ltaId) {
		return fetchByPrimaryKey((Serializable)ltaId);
	}

	@Override
	public Map<Serializable, LTA> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LTA> map = new HashMap<Serializable, LTA>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LTA lta = fetchByPrimaryKey(primaryKey);

			if (lta != null) {
				map.put(primaryKey, lta);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(LTAModelImpl.ENTITY_CACHE_ENABLED,
					LTAImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (LTA)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LTA_WHERE_PKS_IN);

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

			for (LTA lta : (List<LTA>)q.list()) {
				map.put(lta.getPrimaryKeyObj(), lta);

				cacheResult(lta);

				uncachedPrimaryKeys.remove(lta.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LTAModelImpl.ENTITY_CACHE_ENABLED,
					LTAImpl.class, primaryKey, nullModel);
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
	 * Returns all the ltas.
	 *
	 * @return the ltas
	 */
	@Override
	public List<LTA> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ltas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ltas
	 * @param end the upper bound of the range of ltas (not inclusive)
	 * @return the range of ltas
	 */
	@Override
	public List<LTA> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ltas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ltas
	 * @param end the upper bound of the range of ltas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ltas
	 */
	@Override
	public List<LTA> findAll(int start, int end,
		OrderByComparator<LTA> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ltas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ltas
	 * @param end the upper bound of the range of ltas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ltas
	 */
	@Override
	public List<LTA> findAll(int start, int end,
		OrderByComparator<LTA> orderByComparator, boolean retrieveFromCache) {
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

		List<LTA> list = null;

		if (retrieveFromCache) {
			list = (List<LTA>)finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LTA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LTA;

				if (pagination) {
					sql = sql.concat(LTAModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LTA>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LTA>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Removes all the ltas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LTA lta : findAll()) {
			remove(lta);
		}
	}

	/**
	 * Returns the number of ltas.
	 *
	 * @return the number of ltas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LTA);

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
		return LTAModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the lta persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LTAImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_LTA = "SELECT lta FROM LTA lta";
	private static final String _SQL_SELECT_LTA_WHERE_PKS_IN = "SELECT lta FROM LTA lta WHERE ltaId IN (";
	private static final String _SQL_COUNT_LTA = "SELECT COUNT(lta) FROM LTA lta";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lta.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LTA exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(LTAPersistenceImpl.class);
}