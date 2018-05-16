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

import contact.manager.service.exception.NoSuchCmapGroupException;
import contact.manager.service.model.CmapGroup;
import contact.manager.service.model.impl.CmapGroupImpl;
import contact.manager.service.model.impl.CmapGroupModelImpl;
import contact.manager.service.service.persistence.CmapGroupPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the cmap group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CmapGroupPersistence
 * @see contact.manager.service.service.persistence.CmapGroupUtil
 * @generated
 */
@ProviderType
public class CmapGroupPersistenceImpl extends BasePersistenceImpl<CmapGroup>
	implements CmapGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CmapGroupUtil} to access the cmap group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CmapGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapGroupModelImpl.FINDER_CACHE_ENABLED, CmapGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapGroupModelImpl.FINDER_CACHE_ENABLED, CmapGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CmapGroupPersistenceImpl() {
		setModelClass(CmapGroup.class);
	}

	/**
	 * Caches the cmap group in the entity cache if it is enabled.
	 *
	 * @param cmapGroup the cmap group
	 */
	@Override
	public void cacheResult(CmapGroup cmapGroup) {
		entityCache.putResult(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapGroupImpl.class, cmapGroup.getPrimaryKey(), cmapGroup);

		cmapGroup.resetOriginalValues();
	}

	/**
	 * Caches the cmap groups in the entity cache if it is enabled.
	 *
	 * @param cmapGroups the cmap groups
	 */
	@Override
	public void cacheResult(List<CmapGroup> cmapGroups) {
		for (CmapGroup cmapGroup : cmapGroups) {
			if (entityCache.getResult(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
						CmapGroupImpl.class, cmapGroup.getPrimaryKey()) == null) {
				cacheResult(cmapGroup);
			}
			else {
				cmapGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cmap groups.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CmapGroupImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cmap group.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CmapGroup cmapGroup) {
		entityCache.removeResult(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapGroupImpl.class, cmapGroup.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CmapGroup> cmapGroups) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CmapGroup cmapGroup : cmapGroups) {
			entityCache.removeResult(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
				CmapGroupImpl.class, cmapGroup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cmap group with the primary key. Does not add the cmap group to the database.
	 *
	 * @param groupId the primary key for the new cmap group
	 * @return the new cmap group
	 */
	@Override
	public CmapGroup create(long groupId) {
		CmapGroup cmapGroup = new CmapGroupImpl();

		cmapGroup.setNew(true);
		cmapGroup.setPrimaryKey(groupId);

		return cmapGroup;
	}

	/**
	 * Removes the cmap group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupId the primary key of the cmap group
	 * @return the cmap group that was removed
	 * @throws NoSuchCmapGroupException if a cmap group with the primary key could not be found
	 */
	@Override
	public CmapGroup remove(long groupId) throws NoSuchCmapGroupException {
		return remove((Serializable)groupId);
	}

	/**
	 * Removes the cmap group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cmap group
	 * @return the cmap group that was removed
	 * @throws NoSuchCmapGroupException if a cmap group with the primary key could not be found
	 */
	@Override
	public CmapGroup remove(Serializable primaryKey)
		throws NoSuchCmapGroupException {
		Session session = null;

		try {
			session = openSession();

			CmapGroup cmapGroup = (CmapGroup)session.get(CmapGroupImpl.class,
					primaryKey);

			if (cmapGroup == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCmapGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cmapGroup);
		}
		catch (NoSuchCmapGroupException nsee) {
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
	protected CmapGroup removeImpl(CmapGroup cmapGroup) {
		cmapGroup = toUnwrappedModel(cmapGroup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cmapGroup)) {
				cmapGroup = (CmapGroup)session.get(CmapGroupImpl.class,
						cmapGroup.getPrimaryKeyObj());
			}

			if (cmapGroup != null) {
				session.delete(cmapGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cmapGroup != null) {
			clearCache(cmapGroup);
		}

		return cmapGroup;
	}

	@Override
	public CmapGroup updateImpl(CmapGroup cmapGroup) {
		cmapGroup = toUnwrappedModel(cmapGroup);

		boolean isNew = cmapGroup.isNew();

		Session session = null;

		try {
			session = openSession();

			if (cmapGroup.isNew()) {
				session.save(cmapGroup);

				cmapGroup.setNew(false);
			}
			else {
				cmapGroup = (CmapGroup)session.merge(cmapGroup);
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

		entityCache.putResult(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapGroupImpl.class, cmapGroup.getPrimaryKey(), cmapGroup, false);

		cmapGroup.resetOriginalValues();

		return cmapGroup;
	}

	protected CmapGroup toUnwrappedModel(CmapGroup cmapGroup) {
		if (cmapGroup instanceof CmapGroupImpl) {
			return cmapGroup;
		}

		CmapGroupImpl cmapGroupImpl = new CmapGroupImpl();

		cmapGroupImpl.setNew(cmapGroup.isNew());
		cmapGroupImpl.setPrimaryKey(cmapGroup.getPrimaryKey());

		cmapGroupImpl.setGroupId(cmapGroup.getGroupId());
		cmapGroupImpl.setGroupName(cmapGroup.getGroupName());

		return cmapGroupImpl;
	}

	/**
	 * Returns the cmap group with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cmap group
	 * @return the cmap group
	 * @throws NoSuchCmapGroupException if a cmap group with the primary key could not be found
	 */
	@Override
	public CmapGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCmapGroupException {
		CmapGroup cmapGroup = fetchByPrimaryKey(primaryKey);

		if (cmapGroup == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCmapGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cmapGroup;
	}

	/**
	 * Returns the cmap group with the primary key or throws a {@link NoSuchCmapGroupException} if it could not be found.
	 *
	 * @param groupId the primary key of the cmap group
	 * @return the cmap group
	 * @throws NoSuchCmapGroupException if a cmap group with the primary key could not be found
	 */
	@Override
	public CmapGroup findByPrimaryKey(long groupId)
		throws NoSuchCmapGroupException {
		return findByPrimaryKey((Serializable)groupId);
	}

	/**
	 * Returns the cmap group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cmap group
	 * @return the cmap group, or <code>null</code> if a cmap group with the primary key could not be found
	 */
	@Override
	public CmapGroup fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
				CmapGroupImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CmapGroup cmapGroup = (CmapGroup)serializable;

		if (cmapGroup == null) {
			Session session = null;

			try {
				session = openSession();

				cmapGroup = (CmapGroup)session.get(CmapGroupImpl.class,
						primaryKey);

				if (cmapGroup != null) {
					cacheResult(cmapGroup);
				}
				else {
					entityCache.putResult(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
						CmapGroupImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
					CmapGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cmapGroup;
	}

	/**
	 * Returns the cmap group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param groupId the primary key of the cmap group
	 * @return the cmap group, or <code>null</code> if a cmap group with the primary key could not be found
	 */
	@Override
	public CmapGroup fetchByPrimaryKey(long groupId) {
		return fetchByPrimaryKey((Serializable)groupId);
	}

	@Override
	public Map<Serializable, CmapGroup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CmapGroup> map = new HashMap<Serializable, CmapGroup>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CmapGroup cmapGroup = fetchByPrimaryKey(primaryKey);

			if (cmapGroup != null) {
				map.put(primaryKey, cmapGroup);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
					CmapGroupImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CmapGroup)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CMAPGROUP_WHERE_PKS_IN);

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

			for (CmapGroup cmapGroup : (List<CmapGroup>)q.list()) {
				map.put(cmapGroup.getPrimaryKeyObj(), cmapGroup);

				cacheResult(cmapGroup);

				uncachedPrimaryKeys.remove(cmapGroup.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CmapGroupModelImpl.ENTITY_CACHE_ENABLED,
					CmapGroupImpl.class, primaryKey, nullModel);
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
	 * Returns all the cmap groups.
	 *
	 * @return the cmap groups
	 */
	@Override
	public List<CmapGroup> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cmap groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmap groups
	 * @param end the upper bound of the range of cmap groups (not inclusive)
	 * @return the range of cmap groups
	 */
	@Override
	public List<CmapGroup> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cmap groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmap groups
	 * @param end the upper bound of the range of cmap groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cmap groups
	 */
	@Override
	public List<CmapGroup> findAll(int start, int end,
		OrderByComparator<CmapGroup> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cmap groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmap groups
	 * @param end the upper bound of the range of cmap groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of cmap groups
	 */
	@Override
	public List<CmapGroup> findAll(int start, int end,
		OrderByComparator<CmapGroup> orderByComparator,
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

		List<CmapGroup> list = null;

		if (retrieveFromCache) {
			list = (List<CmapGroup>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CMAPGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CMAPGROUP;

				if (pagination) {
					sql = sql.concat(CmapGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CmapGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CmapGroup>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the cmap groups from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CmapGroup cmapGroup : findAll()) {
			remove(cmapGroup);
		}
	}

	/**
	 * Returns the number of cmap groups.
	 *
	 * @return the number of cmap groups
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CMAPGROUP);

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
		return CmapGroupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cmap group persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CmapGroupImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CMAPGROUP = "SELECT cmapGroup FROM CmapGroup cmapGroup";
	private static final String _SQL_SELECT_CMAPGROUP_WHERE_PKS_IN = "SELECT cmapGroup FROM CmapGroup cmapGroup WHERE groupId IN (";
	private static final String _SQL_COUNT_CMAPGROUP = "SELECT COUNT(cmapGroup) FROM CmapGroup cmapGroup";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cmapGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CmapGroup exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(CmapGroupPersistenceImpl.class);
}