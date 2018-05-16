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

import contact.manager.service.exception.NoSuchCountyException;
import contact.manager.service.model.County;
import contact.manager.service.model.impl.CountyImpl;
import contact.manager.service.model.impl.CountyModelImpl;
import contact.manager.service.service.persistence.CountyPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the county service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CountyPersistence
 * @see contact.manager.service.service.persistence.CountyUtil
 * @generated
 */
@ProviderType
public class CountyPersistenceImpl extends BasePersistenceImpl<County>
	implements CountyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CountyUtil} to access the county persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CountyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CountyModelImpl.ENTITY_CACHE_ENABLED,
			CountyModelImpl.FINDER_CACHE_ENABLED, CountyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CountyModelImpl.ENTITY_CACHE_ENABLED,
			CountyModelImpl.FINDER_CACHE_ENABLED, CountyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CountyModelImpl.ENTITY_CACHE_ENABLED,
			CountyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CountyPersistenceImpl() {
		setModelClass(County.class);
	}

	/**
	 * Caches the county in the entity cache if it is enabled.
	 *
	 * @param county the county
	 */
	@Override
	public void cacheResult(County county) {
		entityCache.putResult(CountyModelImpl.ENTITY_CACHE_ENABLED,
			CountyImpl.class, county.getPrimaryKey(), county);

		county.resetOriginalValues();
	}

	/**
	 * Caches the counties in the entity cache if it is enabled.
	 *
	 * @param counties the counties
	 */
	@Override
	public void cacheResult(List<County> counties) {
		for (County county : counties) {
			if (entityCache.getResult(CountyModelImpl.ENTITY_CACHE_ENABLED,
						CountyImpl.class, county.getPrimaryKey()) == null) {
				cacheResult(county);
			}
			else {
				county.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all counties.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CountyImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the county.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(County county) {
		entityCache.removeResult(CountyModelImpl.ENTITY_CACHE_ENABLED,
			CountyImpl.class, county.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<County> counties) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (County county : counties) {
			entityCache.removeResult(CountyModelImpl.ENTITY_CACHE_ENABLED,
				CountyImpl.class, county.getPrimaryKey());
		}
	}

	/**
	 * Creates a new county with the primary key. Does not add the county to the database.
	 *
	 * @param countyId the primary key for the new county
	 * @return the new county
	 */
	@Override
	public County create(long countyId) {
		County county = new CountyImpl();

		county.setNew(true);
		county.setPrimaryKey(countyId);

		return county;
	}

	/**
	 * Removes the county with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param countyId the primary key of the county
	 * @return the county that was removed
	 * @throws NoSuchCountyException if a county with the primary key could not be found
	 */
	@Override
	public County remove(long countyId) throws NoSuchCountyException {
		return remove((Serializable)countyId);
	}

	/**
	 * Removes the county with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the county
	 * @return the county that was removed
	 * @throws NoSuchCountyException if a county with the primary key could not be found
	 */
	@Override
	public County remove(Serializable primaryKey) throws NoSuchCountyException {
		Session session = null;

		try {
			session = openSession();

			County county = (County)session.get(CountyImpl.class, primaryKey);

			if (county == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCountyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(county);
		}
		catch (NoSuchCountyException nsee) {
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
	protected County removeImpl(County county) {
		county = toUnwrappedModel(county);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(county)) {
				county = (County)session.get(CountyImpl.class,
						county.getPrimaryKeyObj());
			}

			if (county != null) {
				session.delete(county);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (county != null) {
			clearCache(county);
		}

		return county;
	}

	@Override
	public County updateImpl(County county) {
		county = toUnwrappedModel(county);

		boolean isNew = county.isNew();

		Session session = null;

		try {
			session = openSession();

			if (county.isNew()) {
				session.save(county);

				county.setNew(false);
			}
			else {
				county = (County)session.merge(county);
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

		entityCache.putResult(CountyModelImpl.ENTITY_CACHE_ENABLED,
			CountyImpl.class, county.getPrimaryKey(), county, false);

		county.resetOriginalValues();

		return county;
	}

	protected County toUnwrappedModel(County county) {
		if (county instanceof CountyImpl) {
			return county;
		}

		CountyImpl countyImpl = new CountyImpl();

		countyImpl.setNew(county.isNew());
		countyImpl.setPrimaryKey(county.getPrimaryKey());

		countyImpl.setCountyId(county.getCountyId());
		countyImpl.setCountyName(county.getCountyName());
		countyImpl.setZipCode(county.getZipCode());

		return countyImpl;
	}

	/**
	 * Returns the county with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the county
	 * @return the county
	 * @throws NoSuchCountyException if a county with the primary key could not be found
	 */
	@Override
	public County findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCountyException {
		County county = fetchByPrimaryKey(primaryKey);

		if (county == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCountyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return county;
	}

	/**
	 * Returns the county with the primary key or throws a {@link NoSuchCountyException} if it could not be found.
	 *
	 * @param countyId the primary key of the county
	 * @return the county
	 * @throws NoSuchCountyException if a county with the primary key could not be found
	 */
	@Override
	public County findByPrimaryKey(long countyId) throws NoSuchCountyException {
		return findByPrimaryKey((Serializable)countyId);
	}

	/**
	 * Returns the county with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the county
	 * @return the county, or <code>null</code> if a county with the primary key could not be found
	 */
	@Override
	public County fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CountyModelImpl.ENTITY_CACHE_ENABLED,
				CountyImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		County county = (County)serializable;

		if (county == null) {
			Session session = null;

			try {
				session = openSession();

				county = (County)session.get(CountyImpl.class, primaryKey);

				if (county != null) {
					cacheResult(county);
				}
				else {
					entityCache.putResult(CountyModelImpl.ENTITY_CACHE_ENABLED,
						CountyImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CountyModelImpl.ENTITY_CACHE_ENABLED,
					CountyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return county;
	}

	/**
	 * Returns the county with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param countyId the primary key of the county
	 * @return the county, or <code>null</code> if a county with the primary key could not be found
	 */
	@Override
	public County fetchByPrimaryKey(long countyId) {
		return fetchByPrimaryKey((Serializable)countyId);
	}

	@Override
	public Map<Serializable, County> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, County> map = new HashMap<Serializable, County>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			County county = fetchByPrimaryKey(primaryKey);

			if (county != null) {
				map.put(primaryKey, county);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CountyModelImpl.ENTITY_CACHE_ENABLED,
					CountyImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (County)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_COUNTY_WHERE_PKS_IN);

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

			for (County county : (List<County>)q.list()) {
				map.put(county.getPrimaryKeyObj(), county);

				cacheResult(county);

				uncachedPrimaryKeys.remove(county.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CountyModelImpl.ENTITY_CACHE_ENABLED,
					CountyImpl.class, primaryKey, nullModel);
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
	 * Returns all the counties.
	 *
	 * @return the counties
	 */
	@Override
	public List<County> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the counties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of counties
	 * @param end the upper bound of the range of counties (not inclusive)
	 * @return the range of counties
	 */
	@Override
	public List<County> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the counties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of counties
	 * @param end the upper bound of the range of counties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of counties
	 */
	@Override
	public List<County> findAll(int start, int end,
		OrderByComparator<County> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the counties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of counties
	 * @param end the upper bound of the range of counties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of counties
	 */
	@Override
	public List<County> findAll(int start, int end,
		OrderByComparator<County> orderByComparator, boolean retrieveFromCache) {
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

		List<County> list = null;

		if (retrieveFromCache) {
			list = (List<County>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_COUNTY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COUNTY;

				if (pagination) {
					sql = sql.concat(CountyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<County>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<County>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the counties from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (County county : findAll()) {
			remove(county);
		}
	}

	/**
	 * Returns the number of counties.
	 *
	 * @return the number of counties
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COUNTY);

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
		return CountyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the county persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CountyImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_COUNTY = "SELECT county FROM County county";
	private static final String _SQL_SELECT_COUNTY_WHERE_PKS_IN = "SELECT county FROM County county WHERE countyId IN (";
	private static final String _SQL_COUNT_COUNTY = "SELECT COUNT(county) FROM County county";
	private static final String _ORDER_BY_ENTITY_ALIAS = "county.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No County exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(CountyPersistenceImpl.class);
}