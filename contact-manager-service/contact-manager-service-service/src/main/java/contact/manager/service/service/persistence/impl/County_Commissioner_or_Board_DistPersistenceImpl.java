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

import contact.manager.service.exception.NoSuchCounty_Commissioner_or_Board_DistException;
import contact.manager.service.model.County_Commissioner_or_Board_Dist;
import contact.manager.service.model.impl.County_Commissioner_or_Board_DistImpl;
import contact.manager.service.model.impl.County_Commissioner_or_Board_DistModelImpl;
import contact.manager.service.service.persistence.County_Commissioner_or_Board_DistPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the county_ commissioner_or_ board_ dist service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see County_Commissioner_or_Board_DistPersistence
 * @see contact.manager.service.service.persistence.County_Commissioner_or_Board_DistUtil
 * @generated
 */
@ProviderType
public class County_Commissioner_or_Board_DistPersistenceImpl
	extends BasePersistenceImpl<County_Commissioner_or_Board_Dist>
	implements County_Commissioner_or_Board_DistPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link County_Commissioner_or_Board_DistUtil} to access the county_ commissioner_or_ board_ dist persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = County_Commissioner_or_Board_DistImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
			County_Commissioner_or_Board_DistModelImpl.FINDER_CACHE_ENABLED,
			County_Commissioner_or_Board_DistImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
			County_Commissioner_or_Board_DistModelImpl.FINDER_CACHE_ENABLED,
			County_Commissioner_or_Board_DistImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
			County_Commissioner_or_Board_DistModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public County_Commissioner_or_Board_DistPersistenceImpl() {
		setModelClass(County_Commissioner_or_Board_Dist.class);
	}

	/**
	 * Caches the county_ commissioner_or_ board_ dist in the entity cache if it is enabled.
	 *
	 * @param county_Commissioner_or_Board_Dist the county_ commissioner_or_ board_ dist
	 */
	@Override
	public void cacheResult(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		entityCache.putResult(County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
			County_Commissioner_or_Board_DistImpl.class,
			county_Commissioner_or_Board_Dist.getPrimaryKey(),
			county_Commissioner_or_Board_Dist);

		county_Commissioner_or_Board_Dist.resetOriginalValues();
	}

	/**
	 * Caches the county_ commissioner_or_ board_ dists in the entity cache if it is enabled.
	 *
	 * @param county_Commissioner_or_Board_Dists the county_ commissioner_or_ board_ dists
	 */
	@Override
	public void cacheResult(
		List<County_Commissioner_or_Board_Dist> county_Commissioner_or_Board_Dists) {
		for (County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist : county_Commissioner_or_Board_Dists) {
			if (entityCache.getResult(
						County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
						County_Commissioner_or_Board_DistImpl.class,
						county_Commissioner_or_Board_Dist.getPrimaryKey()) == null) {
				cacheResult(county_Commissioner_or_Board_Dist);
			}
			else {
				county_Commissioner_or_Board_Dist.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all county_ commissioner_or_ board_ dists.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(County_Commissioner_or_Board_DistImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the county_ commissioner_or_ board_ dist.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		entityCache.removeResult(County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
			County_Commissioner_or_Board_DistImpl.class,
			county_Commissioner_or_Board_Dist.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<County_Commissioner_or_Board_Dist> county_Commissioner_or_Board_Dists) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist : county_Commissioner_or_Board_Dists) {
			entityCache.removeResult(County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
				County_Commissioner_or_Board_DistImpl.class,
				county_Commissioner_or_Board_Dist.getPrimaryKey());
		}
	}

	/**
	 * Creates a new county_ commissioner_or_ board_ dist with the primary key. Does not add the county_ commissioner_or_ board_ dist to the database.
	 *
	 * @param ccbdId the primary key for the new county_ commissioner_or_ board_ dist
	 * @return the new county_ commissioner_or_ board_ dist
	 */
	@Override
	public County_Commissioner_or_Board_Dist create(long ccbdId) {
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist = new County_Commissioner_or_Board_DistImpl();

		county_Commissioner_or_Board_Dist.setNew(true);
		county_Commissioner_or_Board_Dist.setPrimaryKey(ccbdId);

		return county_Commissioner_or_Board_Dist;
	}

	/**
	 * Removes the county_ commissioner_or_ board_ dist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	 * @return the county_ commissioner_or_ board_ dist that was removed
	 * @throws NoSuchCounty_Commissioner_or_Board_DistException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	 */
	@Override
	public County_Commissioner_or_Board_Dist remove(long ccbdId)
		throws NoSuchCounty_Commissioner_or_Board_DistException {
		return remove((Serializable)ccbdId);
	}

	/**
	 * Removes the county_ commissioner_or_ board_ dist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the county_ commissioner_or_ board_ dist
	 * @return the county_ commissioner_or_ board_ dist that was removed
	 * @throws NoSuchCounty_Commissioner_or_Board_DistException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	 */
	@Override
	public County_Commissioner_or_Board_Dist remove(Serializable primaryKey)
		throws NoSuchCounty_Commissioner_or_Board_DistException {
		Session session = null;

		try {
			session = openSession();

			County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist = (County_Commissioner_or_Board_Dist)session.get(County_Commissioner_or_Board_DistImpl.class,
					primaryKey);

			if (county_Commissioner_or_Board_Dist == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCounty_Commissioner_or_Board_DistException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(county_Commissioner_or_Board_Dist);
		}
		catch (NoSuchCounty_Commissioner_or_Board_DistException nsee) {
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
	protected County_Commissioner_or_Board_Dist removeImpl(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		county_Commissioner_or_Board_Dist = toUnwrappedModel(county_Commissioner_or_Board_Dist);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(county_Commissioner_or_Board_Dist)) {
				county_Commissioner_or_Board_Dist = (County_Commissioner_or_Board_Dist)session.get(County_Commissioner_or_Board_DistImpl.class,
						county_Commissioner_or_Board_Dist.getPrimaryKeyObj());
			}

			if (county_Commissioner_or_Board_Dist != null) {
				session.delete(county_Commissioner_or_Board_Dist);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (county_Commissioner_or_Board_Dist != null) {
			clearCache(county_Commissioner_or_Board_Dist);
		}

		return county_Commissioner_or_Board_Dist;
	}

	@Override
	public County_Commissioner_or_Board_Dist updateImpl(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		county_Commissioner_or_Board_Dist = toUnwrappedModel(county_Commissioner_or_Board_Dist);

		boolean isNew = county_Commissioner_or_Board_Dist.isNew();

		Session session = null;

		try {
			session = openSession();

			if (county_Commissioner_or_Board_Dist.isNew()) {
				session.save(county_Commissioner_or_Board_Dist);

				county_Commissioner_or_Board_Dist.setNew(false);
			}
			else {
				county_Commissioner_or_Board_Dist = (County_Commissioner_or_Board_Dist)session.merge(county_Commissioner_or_Board_Dist);
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

		entityCache.putResult(County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
			County_Commissioner_or_Board_DistImpl.class,
			county_Commissioner_or_Board_Dist.getPrimaryKey(),
			county_Commissioner_or_Board_Dist, false);

		county_Commissioner_or_Board_Dist.resetOriginalValues();

		return county_Commissioner_or_Board_Dist;
	}

	protected County_Commissioner_or_Board_Dist toUnwrappedModel(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		if (county_Commissioner_or_Board_Dist instanceof County_Commissioner_or_Board_DistImpl) {
			return county_Commissioner_or_Board_Dist;
		}

		County_Commissioner_or_Board_DistImpl county_Commissioner_or_Board_DistImpl =
			new County_Commissioner_or_Board_DistImpl();

		county_Commissioner_or_Board_DistImpl.setNew(county_Commissioner_or_Board_Dist.isNew());
		county_Commissioner_or_Board_DistImpl.setPrimaryKey(county_Commissioner_or_Board_Dist.getPrimaryKey());

		county_Commissioner_or_Board_DistImpl.setCcbdId(county_Commissioner_or_Board_Dist.getCcbdId());
		county_Commissioner_or_Board_DistImpl.setCcbdNumber(county_Commissioner_or_Board_Dist.getCcbdNumber());
		county_Commissioner_or_Board_DistImpl.setCcbdName(county_Commissioner_or_Board_Dist.getCcbdName());
		county_Commissioner_or_Board_DistImpl.setZipCode(county_Commissioner_or_Board_Dist.getZipCode());

		return county_Commissioner_or_Board_DistImpl;
	}

	/**
	 * Returns the county_ commissioner_or_ board_ dist with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the county_ commissioner_or_ board_ dist
	 * @return the county_ commissioner_or_ board_ dist
	 * @throws NoSuchCounty_Commissioner_or_Board_DistException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	 */
	@Override
	public County_Commissioner_or_Board_Dist findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchCounty_Commissioner_or_Board_DistException {
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist = fetchByPrimaryKey(primaryKey);

		if (county_Commissioner_or_Board_Dist == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCounty_Commissioner_or_Board_DistException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return county_Commissioner_or_Board_Dist;
	}

	/**
	 * Returns the county_ commissioner_or_ board_ dist with the primary key or throws a {@link NoSuchCounty_Commissioner_or_Board_DistException} if it could not be found.
	 *
	 * @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	 * @return the county_ commissioner_or_ board_ dist
	 * @throws NoSuchCounty_Commissioner_or_Board_DistException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	 */
	@Override
	public County_Commissioner_or_Board_Dist findByPrimaryKey(long ccbdId)
		throws NoSuchCounty_Commissioner_or_Board_DistException {
		return findByPrimaryKey((Serializable)ccbdId);
	}

	/**
	 * Returns the county_ commissioner_or_ board_ dist with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the county_ commissioner_or_ board_ dist
	 * @return the county_ commissioner_or_ board_ dist, or <code>null</code> if a county_ commissioner_or_ board_ dist with the primary key could not be found
	 */
	@Override
	public County_Commissioner_or_Board_Dist fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
				County_Commissioner_or_Board_DistImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist = (County_Commissioner_or_Board_Dist)serializable;

		if (county_Commissioner_or_Board_Dist == null) {
			Session session = null;

			try {
				session = openSession();

				county_Commissioner_or_Board_Dist = (County_Commissioner_or_Board_Dist)session.get(County_Commissioner_or_Board_DistImpl.class,
						primaryKey);

				if (county_Commissioner_or_Board_Dist != null) {
					cacheResult(county_Commissioner_or_Board_Dist);
				}
				else {
					entityCache.putResult(County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
						County_Commissioner_or_Board_DistImpl.class,
						primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
					County_Commissioner_or_Board_DistImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return county_Commissioner_or_Board_Dist;
	}

	/**
	 * Returns the county_ commissioner_or_ board_ dist with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	 * @return the county_ commissioner_or_ board_ dist, or <code>null</code> if a county_ commissioner_or_ board_ dist with the primary key could not be found
	 */
	@Override
	public County_Commissioner_or_Board_Dist fetchByPrimaryKey(long ccbdId) {
		return fetchByPrimaryKey((Serializable)ccbdId);
	}

	@Override
	public Map<Serializable, County_Commissioner_or_Board_Dist> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, County_Commissioner_or_Board_Dist> map = new HashMap<Serializable, County_Commissioner_or_Board_Dist>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist = fetchByPrimaryKey(primaryKey);

			if (county_Commissioner_or_Board_Dist != null) {
				map.put(primaryKey, county_Commissioner_or_Board_Dist);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
					County_Commissioner_or_Board_DistImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(County_Commissioner_or_Board_Dist)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_COUNTY_COMMISSIONER_OR_BOARD_DIST_WHERE_PKS_IN);

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

			for (County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist : (List<County_Commissioner_or_Board_Dist>)q.list()) {
				map.put(county_Commissioner_or_Board_Dist.getPrimaryKeyObj(),
					county_Commissioner_or_Board_Dist);

				cacheResult(county_Commissioner_or_Board_Dist);

				uncachedPrimaryKeys.remove(county_Commissioner_or_Board_Dist.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(County_Commissioner_or_Board_DistModelImpl.ENTITY_CACHE_ENABLED,
					County_Commissioner_or_Board_DistImpl.class, primaryKey,
					nullModel);
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
	 * Returns all the county_ commissioner_or_ board_ dists.
	 *
	 * @return the county_ commissioner_or_ board_ dists
	 */
	@Override
	public List<County_Commissioner_or_Board_Dist> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the county_ commissioner_or_ board_ dists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of county_ commissioner_or_ board_ dists
	 * @param end the upper bound of the range of county_ commissioner_or_ board_ dists (not inclusive)
	 * @return the range of county_ commissioner_or_ board_ dists
	 */
	@Override
	public List<County_Commissioner_or_Board_Dist> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the county_ commissioner_or_ board_ dists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of county_ commissioner_or_ board_ dists
	 * @param end the upper bound of the range of county_ commissioner_or_ board_ dists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of county_ commissioner_or_ board_ dists
	 */
	@Override
	public List<County_Commissioner_or_Board_Dist> findAll(int start, int end,
		OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the county_ commissioner_or_ board_ dists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of county_ commissioner_or_ board_ dists
	 * @param end the upper bound of the range of county_ commissioner_or_ board_ dists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of county_ commissioner_or_ board_ dists
	 */
	@Override
	public List<County_Commissioner_or_Board_Dist> findAll(int start, int end,
		OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator,
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

		List<County_Commissioner_or_Board_Dist> list = null;

		if (retrieveFromCache) {
			list = (List<County_Commissioner_or_Board_Dist>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_COUNTY_COMMISSIONER_OR_BOARD_DIST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COUNTY_COMMISSIONER_OR_BOARD_DIST;

				if (pagination) {
					sql = sql.concat(County_Commissioner_or_Board_DistModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<County_Commissioner_or_Board_Dist>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<County_Commissioner_or_Board_Dist>)QueryUtil.list(q,
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
	 * Removes all the county_ commissioner_or_ board_ dists from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist : findAll()) {
			remove(county_Commissioner_or_Board_Dist);
		}
	}

	/**
	 * Returns the number of county_ commissioner_or_ board_ dists.
	 *
	 * @return the number of county_ commissioner_or_ board_ dists
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COUNTY_COMMISSIONER_OR_BOARD_DIST);

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
		return County_Commissioner_or_Board_DistModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the county_ commissioner_or_ board_ dist persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(County_Commissioner_or_Board_DistImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_COUNTY_COMMISSIONER_OR_BOARD_DIST = "SELECT county_Commissioner_or_Board_Dist FROM County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist";
	private static final String _SQL_SELECT_COUNTY_COMMISSIONER_OR_BOARD_DIST_WHERE_PKS_IN =
		"SELECT county_Commissioner_or_Board_Dist FROM County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist WHERE ccbdId IN (";
	private static final String _SQL_COUNT_COUNTY_COMMISSIONER_OR_BOARD_DIST = "SELECT COUNT(county_Commissioner_or_Board_Dist) FROM County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist";
	private static final String _ORDER_BY_ENTITY_ALIAS = "county_Commissioner_or_Board_Dist.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No County_Commissioner_or_Board_Dist exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(County_Commissioner_or_Board_DistPersistenceImpl.class);
}