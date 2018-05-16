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

import contact.manager.service.exception.NoSuchMuniException;
import contact.manager.service.model.Muni;
import contact.manager.service.model.impl.MuniImpl;
import contact.manager.service.model.impl.MuniModelImpl;
import contact.manager.service.service.persistence.MuniPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the muni service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MuniPersistence
 * @see contact.manager.service.service.persistence.MuniUtil
 * @generated
 */
@ProviderType
public class MuniPersistenceImpl extends BasePersistenceImpl<Muni>
	implements MuniPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MuniUtil} to access the muni persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MuniImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MuniModelImpl.ENTITY_CACHE_ENABLED,
			MuniModelImpl.FINDER_CACHE_ENABLED, MuniImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MuniModelImpl.ENTITY_CACHE_ENABLED,
			MuniModelImpl.FINDER_CACHE_ENABLED, MuniImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MuniModelImpl.ENTITY_CACHE_ENABLED,
			MuniModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public MuniPersistenceImpl() {
		setModelClass(Muni.class);
	}

	/**
	 * Caches the muni in the entity cache if it is enabled.
	 *
	 * @param muni the muni
	 */
	@Override
	public void cacheResult(Muni muni) {
		entityCache.putResult(MuniModelImpl.ENTITY_CACHE_ENABLED,
			MuniImpl.class, muni.getPrimaryKey(), muni);

		muni.resetOriginalValues();
	}

	/**
	 * Caches the munis in the entity cache if it is enabled.
	 *
	 * @param munis the munis
	 */
	@Override
	public void cacheResult(List<Muni> munis) {
		for (Muni muni : munis) {
			if (entityCache.getResult(MuniModelImpl.ENTITY_CACHE_ENABLED,
						MuniImpl.class, muni.getPrimaryKey()) == null) {
				cacheResult(muni);
			}
			else {
				muni.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all munis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MuniImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the muni.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Muni muni) {
		entityCache.removeResult(MuniModelImpl.ENTITY_CACHE_ENABLED,
			MuniImpl.class, muni.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Muni> munis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Muni muni : munis) {
			entityCache.removeResult(MuniModelImpl.ENTITY_CACHE_ENABLED,
				MuniImpl.class, muni.getPrimaryKey());
		}
	}

	/**
	 * Creates a new muni with the primary key. Does not add the muni to the database.
	 *
	 * @param muniId the primary key for the new muni
	 * @return the new muni
	 */
	@Override
	public Muni create(long muniId) {
		Muni muni = new MuniImpl();

		muni.setNew(true);
		muni.setPrimaryKey(muniId);

		return muni;
	}

	/**
	 * Removes the muni with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param muniId the primary key of the muni
	 * @return the muni that was removed
	 * @throws NoSuchMuniException if a muni with the primary key could not be found
	 */
	@Override
	public Muni remove(long muniId) throws NoSuchMuniException {
		return remove((Serializable)muniId);
	}

	/**
	 * Removes the muni with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the muni
	 * @return the muni that was removed
	 * @throws NoSuchMuniException if a muni with the primary key could not be found
	 */
	@Override
	public Muni remove(Serializable primaryKey) throws NoSuchMuniException {
		Session session = null;

		try {
			session = openSession();

			Muni muni = (Muni)session.get(MuniImpl.class, primaryKey);

			if (muni == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMuniException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(muni);
		}
		catch (NoSuchMuniException nsee) {
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
	protected Muni removeImpl(Muni muni) {
		muni = toUnwrappedModel(muni);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(muni)) {
				muni = (Muni)session.get(MuniImpl.class, muni.getPrimaryKeyObj());
			}

			if (muni != null) {
				session.delete(muni);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (muni != null) {
			clearCache(muni);
		}

		return muni;
	}

	@Override
	public Muni updateImpl(Muni muni) {
		muni = toUnwrappedModel(muni);

		boolean isNew = muni.isNew();

		Session session = null;

		try {
			session = openSession();

			if (muni.isNew()) {
				session.save(muni);

				muni.setNew(false);
			}
			else {
				muni = (Muni)session.merge(muni);
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

		entityCache.putResult(MuniModelImpl.ENTITY_CACHE_ENABLED,
			MuniImpl.class, muni.getPrimaryKey(), muni, false);

		muni.resetOriginalValues();

		return muni;
	}

	protected Muni toUnwrappedModel(Muni muni) {
		if (muni instanceof MuniImpl) {
			return muni;
		}

		MuniImpl muniImpl = new MuniImpl();

		muniImpl.setNew(muni.isNew());
		muniImpl.setPrimaryKey(muni.getPrimaryKey());

		muniImpl.setMuniId(muni.getMuniId());
		muniImpl.setMuniName(muni.getMuniName());
		muniImpl.setZipCode(muni.getZipCode());

		return muniImpl;
	}

	/**
	 * Returns the muni with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the muni
	 * @return the muni
	 * @throws NoSuchMuniException if a muni with the primary key could not be found
	 */
	@Override
	public Muni findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMuniException {
		Muni muni = fetchByPrimaryKey(primaryKey);

		if (muni == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMuniException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return muni;
	}

	/**
	 * Returns the muni with the primary key or throws a {@link NoSuchMuniException} if it could not be found.
	 *
	 * @param muniId the primary key of the muni
	 * @return the muni
	 * @throws NoSuchMuniException if a muni with the primary key could not be found
	 */
	@Override
	public Muni findByPrimaryKey(long muniId) throws NoSuchMuniException {
		return findByPrimaryKey((Serializable)muniId);
	}

	/**
	 * Returns the muni with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the muni
	 * @return the muni, or <code>null</code> if a muni with the primary key could not be found
	 */
	@Override
	public Muni fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(MuniModelImpl.ENTITY_CACHE_ENABLED,
				MuniImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Muni muni = (Muni)serializable;

		if (muni == null) {
			Session session = null;

			try {
				session = openSession();

				muni = (Muni)session.get(MuniImpl.class, primaryKey);

				if (muni != null) {
					cacheResult(muni);
				}
				else {
					entityCache.putResult(MuniModelImpl.ENTITY_CACHE_ENABLED,
						MuniImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(MuniModelImpl.ENTITY_CACHE_ENABLED,
					MuniImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return muni;
	}

	/**
	 * Returns the muni with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param muniId the primary key of the muni
	 * @return the muni, or <code>null</code> if a muni with the primary key could not be found
	 */
	@Override
	public Muni fetchByPrimaryKey(long muniId) {
		return fetchByPrimaryKey((Serializable)muniId);
	}

	@Override
	public Map<Serializable, Muni> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Muni> map = new HashMap<Serializable, Muni>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Muni muni = fetchByPrimaryKey(primaryKey);

			if (muni != null) {
				map.put(primaryKey, muni);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(MuniModelImpl.ENTITY_CACHE_ENABLED,
					MuniImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Muni)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_MUNI_WHERE_PKS_IN);

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

			for (Muni muni : (List<Muni>)q.list()) {
				map.put(muni.getPrimaryKeyObj(), muni);

				cacheResult(muni);

				uncachedPrimaryKeys.remove(muni.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(MuniModelImpl.ENTITY_CACHE_ENABLED,
					MuniImpl.class, primaryKey, nullModel);
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
	 * Returns all the munis.
	 *
	 * @return the munis
	 */
	@Override
	public List<Muni> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the munis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of munis
	 * @param end the upper bound of the range of munis (not inclusive)
	 * @return the range of munis
	 */
	@Override
	public List<Muni> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the munis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of munis
	 * @param end the upper bound of the range of munis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of munis
	 */
	@Override
	public List<Muni> findAll(int start, int end,
		OrderByComparator<Muni> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the munis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of munis
	 * @param end the upper bound of the range of munis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of munis
	 */
	@Override
	public List<Muni> findAll(int start, int end,
		OrderByComparator<Muni> orderByComparator, boolean retrieveFromCache) {
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

		List<Muni> list = null;

		if (retrieveFromCache) {
			list = (List<Muni>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_MUNI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MUNI;

				if (pagination) {
					sql = sql.concat(MuniModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Muni>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Muni>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the munis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Muni muni : findAll()) {
			remove(muni);
		}
	}

	/**
	 * Returns the number of munis.
	 *
	 * @return the number of munis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MUNI);

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
		return MuniModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the muni persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(MuniImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_MUNI = "SELECT muni FROM Muni muni";
	private static final String _SQL_SELECT_MUNI_WHERE_PKS_IN = "SELECT muni FROM Muni muni WHERE muniId IN (";
	private static final String _SQL_COUNT_MUNI = "SELECT COUNT(muni) FROM Muni muni";
	private static final String _ORDER_BY_ENTITY_ALIAS = "muni.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Muni exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(MuniPersistenceImpl.class);
}