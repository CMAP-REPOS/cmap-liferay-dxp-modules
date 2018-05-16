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

import contact.manager.service.exception.NoSuchCCAException;
import contact.manager.service.model.CCA;
import contact.manager.service.model.impl.CCAImpl;
import contact.manager.service.model.impl.CCAModelImpl;
import contact.manager.service.service.persistence.CCAPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the cca service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CCAPersistence
 * @see contact.manager.service.service.persistence.CCAUtil
 * @generated
 */
@ProviderType
public class CCAPersistenceImpl extends BasePersistenceImpl<CCA>
	implements CCAPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CCAUtil} to access the cca persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CCAImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CCAModelImpl.ENTITY_CACHE_ENABLED,
			CCAModelImpl.FINDER_CACHE_ENABLED, CCAImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CCAModelImpl.ENTITY_CACHE_ENABLED,
			CCAModelImpl.FINDER_CACHE_ENABLED, CCAImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CCAModelImpl.ENTITY_CACHE_ENABLED,
			CCAModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CCAPersistenceImpl() {
		setModelClass(CCA.class);
	}

	/**
	 * Caches the cca in the entity cache if it is enabled.
	 *
	 * @param cca the cca
	 */
	@Override
	public void cacheResult(CCA cca) {
		entityCache.putResult(CCAModelImpl.ENTITY_CACHE_ENABLED, CCAImpl.class,
			cca.getPrimaryKey(), cca);

		cca.resetOriginalValues();
	}

	/**
	 * Caches the ccas in the entity cache if it is enabled.
	 *
	 * @param ccas the ccas
	 */
	@Override
	public void cacheResult(List<CCA> ccas) {
		for (CCA cca : ccas) {
			if (entityCache.getResult(CCAModelImpl.ENTITY_CACHE_ENABLED,
						CCAImpl.class, cca.getPrimaryKey()) == null) {
				cacheResult(cca);
			}
			else {
				cca.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ccas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CCAImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cca.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CCA cca) {
		entityCache.removeResult(CCAModelImpl.ENTITY_CACHE_ENABLED,
			CCAImpl.class, cca.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CCA> ccas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CCA cca : ccas) {
			entityCache.removeResult(CCAModelImpl.ENTITY_CACHE_ENABLED,
				CCAImpl.class, cca.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cca with the primary key. Does not add the cca to the database.
	 *
	 * @param ccaId the primary key for the new cca
	 * @return the new cca
	 */
	@Override
	public CCA create(long ccaId) {
		CCA cca = new CCAImpl();

		cca.setNew(true);
		cca.setPrimaryKey(ccaId);

		return cca;
	}

	/**
	 * Removes the cca with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ccaId the primary key of the cca
	 * @return the cca that was removed
	 * @throws NoSuchCCAException if a cca with the primary key could not be found
	 */
	@Override
	public CCA remove(long ccaId) throws NoSuchCCAException {
		return remove((Serializable)ccaId);
	}

	/**
	 * Removes the cca with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cca
	 * @return the cca that was removed
	 * @throws NoSuchCCAException if a cca with the primary key could not be found
	 */
	@Override
	public CCA remove(Serializable primaryKey) throws NoSuchCCAException {
		Session session = null;

		try {
			session = openSession();

			CCA cca = (CCA)session.get(CCAImpl.class, primaryKey);

			if (cca == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCCAException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cca);
		}
		catch (NoSuchCCAException nsee) {
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
	protected CCA removeImpl(CCA cca) {
		cca = toUnwrappedModel(cca);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cca)) {
				cca = (CCA)session.get(CCAImpl.class, cca.getPrimaryKeyObj());
			}

			if (cca != null) {
				session.delete(cca);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cca != null) {
			clearCache(cca);
		}

		return cca;
	}

	@Override
	public CCA updateImpl(CCA cca) {
		cca = toUnwrappedModel(cca);

		boolean isNew = cca.isNew();

		Session session = null;

		try {
			session = openSession();

			if (cca.isNew()) {
				session.save(cca);

				cca.setNew(false);
			}
			else {
				cca = (CCA)session.merge(cca);
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

		entityCache.putResult(CCAModelImpl.ENTITY_CACHE_ENABLED, CCAImpl.class,
			cca.getPrimaryKey(), cca, false);

		cca.resetOriginalValues();

		return cca;
	}

	protected CCA toUnwrappedModel(CCA cca) {
		if (cca instanceof CCAImpl) {
			return cca;
		}

		CCAImpl ccaImpl = new CCAImpl();

		ccaImpl.setNew(cca.isNew());
		ccaImpl.setPrimaryKey(cca.getPrimaryKey());

		ccaImpl.setCcaId(cca.getCcaId());
		ccaImpl.setCcaName(cca.getCcaName());
		ccaImpl.setZipCode(cca.getZipCode());

		return ccaImpl;
	}

	/**
	 * Returns the cca with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cca
	 * @return the cca
	 * @throws NoSuchCCAException if a cca with the primary key could not be found
	 */
	@Override
	public CCA findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCCAException {
		CCA cca = fetchByPrimaryKey(primaryKey);

		if (cca == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCCAException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cca;
	}

	/**
	 * Returns the cca with the primary key or throws a {@link NoSuchCCAException} if it could not be found.
	 *
	 * @param ccaId the primary key of the cca
	 * @return the cca
	 * @throws NoSuchCCAException if a cca with the primary key could not be found
	 */
	@Override
	public CCA findByPrimaryKey(long ccaId) throws NoSuchCCAException {
		return findByPrimaryKey((Serializable)ccaId);
	}

	/**
	 * Returns the cca with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cca
	 * @return the cca, or <code>null</code> if a cca with the primary key could not be found
	 */
	@Override
	public CCA fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CCAModelImpl.ENTITY_CACHE_ENABLED,
				CCAImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CCA cca = (CCA)serializable;

		if (cca == null) {
			Session session = null;

			try {
				session = openSession();

				cca = (CCA)session.get(CCAImpl.class, primaryKey);

				if (cca != null) {
					cacheResult(cca);
				}
				else {
					entityCache.putResult(CCAModelImpl.ENTITY_CACHE_ENABLED,
						CCAImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CCAModelImpl.ENTITY_CACHE_ENABLED,
					CCAImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cca;
	}

	/**
	 * Returns the cca with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ccaId the primary key of the cca
	 * @return the cca, or <code>null</code> if a cca with the primary key could not be found
	 */
	@Override
	public CCA fetchByPrimaryKey(long ccaId) {
		return fetchByPrimaryKey((Serializable)ccaId);
	}

	@Override
	public Map<Serializable, CCA> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CCA> map = new HashMap<Serializable, CCA>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CCA cca = fetchByPrimaryKey(primaryKey);

			if (cca != null) {
				map.put(primaryKey, cca);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CCAModelImpl.ENTITY_CACHE_ENABLED,
					CCAImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CCA)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CCA_WHERE_PKS_IN);

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

			for (CCA cca : (List<CCA>)q.list()) {
				map.put(cca.getPrimaryKeyObj(), cca);

				cacheResult(cca);

				uncachedPrimaryKeys.remove(cca.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CCAModelImpl.ENTITY_CACHE_ENABLED,
					CCAImpl.class, primaryKey, nullModel);
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
	 * Returns all the ccas.
	 *
	 * @return the ccas
	 */
	@Override
	public List<CCA> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ccas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ccas
	 * @param end the upper bound of the range of ccas (not inclusive)
	 * @return the range of ccas
	 */
	@Override
	public List<CCA> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ccas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ccas
	 * @param end the upper bound of the range of ccas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ccas
	 */
	@Override
	public List<CCA> findAll(int start, int end,
		OrderByComparator<CCA> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ccas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ccas
	 * @param end the upper bound of the range of ccas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ccas
	 */
	@Override
	public List<CCA> findAll(int start, int end,
		OrderByComparator<CCA> orderByComparator, boolean retrieveFromCache) {
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

		List<CCA> list = null;

		if (retrieveFromCache) {
			list = (List<CCA>)finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CCA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CCA;

				if (pagination) {
					sql = sql.concat(CCAModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CCA>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CCA>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Removes all the ccas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CCA cca : findAll()) {
			remove(cca);
		}
	}

	/**
	 * Returns the number of ccas.
	 *
	 * @return the number of ccas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CCA);

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
		return CCAModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cca persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CCAImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CCA = "SELECT cca FROM CCA cca";
	private static final String _SQL_SELECT_CCA_WHERE_PKS_IN = "SELECT cca FROM CCA cca WHERE ccaId IN (";
	private static final String _SQL_COUNT_CCA = "SELECT COUNT(cca) FROM CCA cca";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cca.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CCA exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(CCAPersistenceImpl.class);
}