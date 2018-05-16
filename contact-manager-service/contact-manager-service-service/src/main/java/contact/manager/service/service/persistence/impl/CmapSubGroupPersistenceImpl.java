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

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.service.persistence.impl.TableMapper;
import com.liferay.portal.kernel.service.persistence.impl.TableMapperFactory;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.service.exception.NoSuchCmapSubGroupException;
import contact.manager.service.model.CmapSubGroup;
import contact.manager.service.model.impl.CmapSubGroupImpl;
import contact.manager.service.model.impl.CmapSubGroupModelImpl;
import contact.manager.service.service.persistence.CmapSubGroupPersistence;
import contact.manager.service.service.persistence.ContactPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the cmap sub group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CmapSubGroupPersistence
 * @see contact.manager.service.service.persistence.CmapSubGroupUtil
 * @generated
 */
@ProviderType
public class CmapSubGroupPersistenceImpl extends BasePersistenceImpl<CmapSubGroup>
	implements CmapSubGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CmapSubGroupUtil} to access the cmap sub group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CmapSubGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapSubGroupModelImpl.FINDER_CACHE_ENABLED, CmapSubGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapSubGroupModelImpl.FINDER_CACHE_ENABLED, CmapSubGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapSubGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CmapSubGroupPersistenceImpl() {
		setModelClass(CmapSubGroup.class);
	}

	/**
	 * Caches the cmap sub group in the entity cache if it is enabled.
	 *
	 * @param cmapSubGroup the cmap sub group
	 */
	@Override
	public void cacheResult(CmapSubGroup cmapSubGroup) {
		entityCache.putResult(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapSubGroupImpl.class, cmapSubGroup.getPrimaryKey(), cmapSubGroup);

		cmapSubGroup.resetOriginalValues();
	}

	/**
	 * Caches the cmap sub groups in the entity cache if it is enabled.
	 *
	 * @param cmapSubGroups the cmap sub groups
	 */
	@Override
	public void cacheResult(List<CmapSubGroup> cmapSubGroups) {
		for (CmapSubGroup cmapSubGroup : cmapSubGroups) {
			if (entityCache.getResult(
						CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
						CmapSubGroupImpl.class, cmapSubGroup.getPrimaryKey()) == null) {
				cacheResult(cmapSubGroup);
			}
			else {
				cmapSubGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cmap sub groups.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CmapSubGroupImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cmap sub group.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CmapSubGroup cmapSubGroup) {
		entityCache.removeResult(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapSubGroupImpl.class, cmapSubGroup.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CmapSubGroup> cmapSubGroups) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CmapSubGroup cmapSubGroup : cmapSubGroups) {
			entityCache.removeResult(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
				CmapSubGroupImpl.class, cmapSubGroup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cmap sub group with the primary key. Does not add the cmap sub group to the database.
	 *
	 * @param subGroupId the primary key for the new cmap sub group
	 * @return the new cmap sub group
	 */
	@Override
	public CmapSubGroup create(long subGroupId) {
		CmapSubGroup cmapSubGroup = new CmapSubGroupImpl();

		cmapSubGroup.setNew(true);
		cmapSubGroup.setPrimaryKey(subGroupId);

		return cmapSubGroup;
	}

	/**
	 * Removes the cmap sub group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subGroupId the primary key of the cmap sub group
	 * @return the cmap sub group that was removed
	 * @throws NoSuchCmapSubGroupException if a cmap sub group with the primary key could not be found
	 */
	@Override
	public CmapSubGroup remove(long subGroupId)
		throws NoSuchCmapSubGroupException {
		return remove((Serializable)subGroupId);
	}

	/**
	 * Removes the cmap sub group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cmap sub group
	 * @return the cmap sub group that was removed
	 * @throws NoSuchCmapSubGroupException if a cmap sub group with the primary key could not be found
	 */
	@Override
	public CmapSubGroup remove(Serializable primaryKey)
		throws NoSuchCmapSubGroupException {
		Session session = null;

		try {
			session = openSession();

			CmapSubGroup cmapSubGroup = (CmapSubGroup)session.get(CmapSubGroupImpl.class,
					primaryKey);

			if (cmapSubGroup == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCmapSubGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cmapSubGroup);
		}
		catch (NoSuchCmapSubGroupException nsee) {
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
	protected CmapSubGroup removeImpl(CmapSubGroup cmapSubGroup) {
		cmapSubGroup = toUnwrappedModel(cmapSubGroup);

		cmapSubGroupToContactTableMapper.deleteLeftPrimaryKeyTableMappings(cmapSubGroup.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cmapSubGroup)) {
				cmapSubGroup = (CmapSubGroup)session.get(CmapSubGroupImpl.class,
						cmapSubGroup.getPrimaryKeyObj());
			}

			if (cmapSubGroup != null) {
				session.delete(cmapSubGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cmapSubGroup != null) {
			clearCache(cmapSubGroup);
		}

		return cmapSubGroup;
	}

	@Override
	public CmapSubGroup updateImpl(CmapSubGroup cmapSubGroup) {
		cmapSubGroup = toUnwrappedModel(cmapSubGroup);

		boolean isNew = cmapSubGroup.isNew();

		CmapSubGroupModelImpl cmapSubGroupModelImpl = (CmapSubGroupModelImpl)cmapSubGroup;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (cmapSubGroup.getCreateDate() == null)) {
			if (serviceContext == null) {
				cmapSubGroup.setCreateDate(now);
			}
			else {
				cmapSubGroup.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!cmapSubGroupModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cmapSubGroup.setModifiedDate(now);
			}
			else {
				cmapSubGroup.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (cmapSubGroup.isNew()) {
				session.save(cmapSubGroup);

				cmapSubGroup.setNew(false);
			}
			else {
				cmapSubGroup = (CmapSubGroup)session.merge(cmapSubGroup);
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

		entityCache.putResult(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapSubGroupImpl.class, cmapSubGroup.getPrimaryKey(), cmapSubGroup,
			false);

		cmapSubGroup.resetOriginalValues();

		return cmapSubGroup;
	}

	protected CmapSubGroup toUnwrappedModel(CmapSubGroup cmapSubGroup) {
		if (cmapSubGroup instanceof CmapSubGroupImpl) {
			return cmapSubGroup;
		}

		CmapSubGroupImpl cmapSubGroupImpl = new CmapSubGroupImpl();

		cmapSubGroupImpl.setNew(cmapSubGroup.isNew());
		cmapSubGroupImpl.setPrimaryKey(cmapSubGroup.getPrimaryKey());

		cmapSubGroupImpl.setSubGroupId(cmapSubGroup.getSubGroupId());
		cmapSubGroupImpl.setSubGroupName(cmapSubGroup.getSubGroupName());
		cmapSubGroupImpl.setGroupId(cmapSubGroup.getGroupId());
		cmapSubGroupImpl.setCreateDate(cmapSubGroup.getCreateDate());
		cmapSubGroupImpl.setModifiedDate(cmapSubGroup.getModifiedDate());

		return cmapSubGroupImpl;
	}

	/**
	 * Returns the cmap sub group with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cmap sub group
	 * @return the cmap sub group
	 * @throws NoSuchCmapSubGroupException if a cmap sub group with the primary key could not be found
	 */
	@Override
	public CmapSubGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCmapSubGroupException {
		CmapSubGroup cmapSubGroup = fetchByPrimaryKey(primaryKey);

		if (cmapSubGroup == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCmapSubGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cmapSubGroup;
	}

	/**
	 * Returns the cmap sub group with the primary key or throws a {@link NoSuchCmapSubGroupException} if it could not be found.
	 *
	 * @param subGroupId the primary key of the cmap sub group
	 * @return the cmap sub group
	 * @throws NoSuchCmapSubGroupException if a cmap sub group with the primary key could not be found
	 */
	@Override
	public CmapSubGroup findByPrimaryKey(long subGroupId)
		throws NoSuchCmapSubGroupException {
		return findByPrimaryKey((Serializable)subGroupId);
	}

	/**
	 * Returns the cmap sub group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cmap sub group
	 * @return the cmap sub group, or <code>null</code> if a cmap sub group with the primary key could not be found
	 */
	@Override
	public CmapSubGroup fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
				CmapSubGroupImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CmapSubGroup cmapSubGroup = (CmapSubGroup)serializable;

		if (cmapSubGroup == null) {
			Session session = null;

			try {
				session = openSession();

				cmapSubGroup = (CmapSubGroup)session.get(CmapSubGroupImpl.class,
						primaryKey);

				if (cmapSubGroup != null) {
					cacheResult(cmapSubGroup);
				}
				else {
					entityCache.putResult(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
						CmapSubGroupImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
					CmapSubGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cmapSubGroup;
	}

	/**
	 * Returns the cmap sub group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subGroupId the primary key of the cmap sub group
	 * @return the cmap sub group, or <code>null</code> if a cmap sub group with the primary key could not be found
	 */
	@Override
	public CmapSubGroup fetchByPrimaryKey(long subGroupId) {
		return fetchByPrimaryKey((Serializable)subGroupId);
	}

	@Override
	public Map<Serializable, CmapSubGroup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CmapSubGroup> map = new HashMap<Serializable, CmapSubGroup>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CmapSubGroup cmapSubGroup = fetchByPrimaryKey(primaryKey);

			if (cmapSubGroup != null) {
				map.put(primaryKey, cmapSubGroup);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
					CmapSubGroupImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CmapSubGroup)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CMAPSUBGROUP_WHERE_PKS_IN);

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

			for (CmapSubGroup cmapSubGroup : (List<CmapSubGroup>)q.list()) {
				map.put(cmapSubGroup.getPrimaryKeyObj(), cmapSubGroup);

				cacheResult(cmapSubGroup);

				uncachedPrimaryKeys.remove(cmapSubGroup.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
					CmapSubGroupImpl.class, primaryKey, nullModel);
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
	 * Returns all the cmap sub groups.
	 *
	 * @return the cmap sub groups
	 */
	@Override
	public List<CmapSubGroup> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cmap sub groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmap sub groups
	 * @param end the upper bound of the range of cmap sub groups (not inclusive)
	 * @return the range of cmap sub groups
	 */
	@Override
	public List<CmapSubGroup> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cmap sub groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmap sub groups
	 * @param end the upper bound of the range of cmap sub groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cmap sub groups
	 */
	@Override
	public List<CmapSubGroup> findAll(int start, int end,
		OrderByComparator<CmapSubGroup> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cmap sub groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmap sub groups
	 * @param end the upper bound of the range of cmap sub groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of cmap sub groups
	 */
	@Override
	public List<CmapSubGroup> findAll(int start, int end,
		OrderByComparator<CmapSubGroup> orderByComparator,
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

		List<CmapSubGroup> list = null;

		if (retrieveFromCache) {
			list = (List<CmapSubGroup>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CMAPSUBGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CMAPSUBGROUP;

				if (pagination) {
					sql = sql.concat(CmapSubGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CmapSubGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CmapSubGroup>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the cmap sub groups from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CmapSubGroup cmapSubGroup : findAll()) {
			remove(cmapSubGroup);
		}
	}

	/**
	 * Returns the number of cmap sub groups.
	 *
	 * @return the number of cmap sub groups
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CMAPSUBGROUP);

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

	/**
	 * Returns the primaryKeys of contacts associated with the cmap sub group.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @return long[] of the primaryKeys of contacts associated with the cmap sub group
	 */
	@Override
	public long[] getContactPrimaryKeys(long pk) {
		long[] pks = cmapSubGroupToContactTableMapper.getRightPrimaryKeys(pk);

		return pks.clone();
	}

	/**
	 * Returns all the contacts associated with the cmap sub group.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @return the contacts associated with the cmap sub group
	 */
	@Override
	public List<contact.manager.service.model.Contact> getContacts(long pk) {
		return getContacts(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the contacts associated with the cmap sub group.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param start the lower bound of the range of cmap sub groups
	 * @param end the upper bound of the range of cmap sub groups (not inclusive)
	 * @return the range of contacts associated with the cmap sub group
	 */
	@Override
	public List<contact.manager.service.model.Contact> getContacts(long pk,
		int start, int end) {
		return getContacts(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the contacts associated with the cmap sub group.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param start the lower bound of the range of cmap sub groups
	 * @param end the upper bound of the range of cmap sub groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contacts associated with the cmap sub group
	 */
	@Override
	public List<contact.manager.service.model.Contact> getContacts(long pk,
		int start, int end,
		OrderByComparator<contact.manager.service.model.Contact> orderByComparator) {
		return cmapSubGroupToContactTableMapper.getRightBaseModels(pk, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of contacts associated with the cmap sub group.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @return the number of contacts associated with the cmap sub group
	 */
	@Override
	public int getContactsSize(long pk) {
		long[] pks = cmapSubGroupToContactTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the contact is associated with the cmap sub group.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param contactPK the primary key of the contact
	 * @return <code>true</code> if the contact is associated with the cmap sub group; <code>false</code> otherwise
	 */
	@Override
	public boolean containsContact(long pk, long contactPK) {
		return cmapSubGroupToContactTableMapper.containsTableMapping(pk,
			contactPK);
	}

	/**
	 * Returns <code>true</code> if the cmap sub group has any contacts associated with it.
	 *
	 * @param pk the primary key of the cmap sub group to check for associations with contacts
	 * @return <code>true</code> if the cmap sub group has any contacts associated with it; <code>false</code> otherwise
	 */
	@Override
	public boolean containsContacts(long pk) {
		if (getContactsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the cmap sub group and the contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param contactPK the primary key of the contact
	 */
	@Override
	public void addContact(long pk, long contactPK) {
		CmapSubGroup cmapSubGroup = fetchByPrimaryKey(pk);

		if (cmapSubGroup == null) {
			cmapSubGroupToContactTableMapper.addTableMapping(companyProvider.getCompanyId(),
				pk, contactPK);
		}
		else {
			cmapSubGroupToContactTableMapper.addTableMapping(cmapSubGroup.getCompanyId(),
				pk, contactPK);
		}
	}

	/**
	 * Adds an association between the cmap sub group and the contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param contact the contact
	 */
	@Override
	public void addContact(long pk,
		contact.manager.service.model.Contact contact) {
		CmapSubGroup cmapSubGroup = fetchByPrimaryKey(pk);

		if (cmapSubGroup == null) {
			cmapSubGroupToContactTableMapper.addTableMapping(companyProvider.getCompanyId(),
				pk, contact.getPrimaryKey());
		}
		else {
			cmapSubGroupToContactTableMapper.addTableMapping(cmapSubGroup.getCompanyId(),
				pk, contact.getPrimaryKey());
		}
	}

	/**
	 * Adds an association between the cmap sub group and the contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param contactPKs the primary keys of the contacts
	 */
	@Override
	public void addContacts(long pk, long[] contactPKs) {
		long companyId = 0;

		CmapSubGroup cmapSubGroup = fetchByPrimaryKey(pk);

		if (cmapSubGroup == null) {
			companyId = companyProvider.getCompanyId();
		}
		else {
			companyId = cmapSubGroup.getCompanyId();
		}

		cmapSubGroupToContactTableMapper.addTableMappings(companyId, pk,
			contactPKs);
	}

	/**
	 * Adds an association between the cmap sub group and the contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param contacts the contacts
	 */
	@Override
	public void addContacts(long pk,
		List<contact.manager.service.model.Contact> contacts) {
		addContacts(pk,
			ListUtil.toLongArray(contacts,
				contact.manager.service.model.Contact.CONTACT_ID_ACCESSOR));
	}

	/**
	 * Clears all associations between the cmap sub group and its contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the cmap sub group to clear the associated contacts from
	 */
	@Override
	public void clearContacts(long pk) {
		cmapSubGroupToContactTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the cmap sub group and the contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param contactPK the primary key of the contact
	 */
	@Override
	public void removeContact(long pk, long contactPK) {
		cmapSubGroupToContactTableMapper.deleteTableMapping(pk, contactPK);
	}

	/**
	 * Removes the association between the cmap sub group and the contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param contact the contact
	 */
	@Override
	public void removeContact(long pk,
		contact.manager.service.model.Contact contact) {
		cmapSubGroupToContactTableMapper.deleteTableMapping(pk,
			contact.getPrimaryKey());
	}

	/**
	 * Removes the association between the cmap sub group and the contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param contactPKs the primary keys of the contacts
	 */
	@Override
	public void removeContacts(long pk, long[] contactPKs) {
		cmapSubGroupToContactTableMapper.deleteTableMappings(pk, contactPKs);
	}

	/**
	 * Removes the association between the cmap sub group and the contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param contacts the contacts
	 */
	@Override
	public void removeContacts(long pk,
		List<contact.manager.service.model.Contact> contacts) {
		removeContacts(pk,
			ListUtil.toLongArray(contacts,
				contact.manager.service.model.Contact.CONTACT_ID_ACCESSOR));
	}

	/**
	 * Sets the contacts associated with the cmap sub group, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param contactPKs the primary keys of the contacts to be associated with the cmap sub group
	 */
	@Override
	public void setContacts(long pk, long[] contactPKs) {
		Set<Long> newContactPKsSet = SetUtil.fromArray(contactPKs);
		Set<Long> oldContactPKsSet = SetUtil.fromArray(cmapSubGroupToContactTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeContactPKsSet = new HashSet<Long>(oldContactPKsSet);

		removeContactPKsSet.removeAll(newContactPKsSet);

		cmapSubGroupToContactTableMapper.deleteTableMappings(pk,
			ArrayUtil.toLongArray(removeContactPKsSet));

		newContactPKsSet.removeAll(oldContactPKsSet);

		long companyId = 0;

		CmapSubGroup cmapSubGroup = fetchByPrimaryKey(pk);

		if (cmapSubGroup == null) {
			companyId = companyProvider.getCompanyId();
		}
		else {
			companyId = cmapSubGroup.getCompanyId();
		}

		cmapSubGroupToContactTableMapper.addTableMappings(companyId, pk,
			ArrayUtil.toLongArray(newContactPKsSet));
	}

	/**
	 * Sets the contacts associated with the cmap sub group, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the cmap sub group
	 * @param contacts the contacts to be associated with the cmap sub group
	 */
	@Override
	public void setContacts(long pk,
		List<contact.manager.service.model.Contact> contacts) {
		try {
			long[] contactPKs = new long[contacts.size()];

			for (int i = 0; i < contacts.size(); i++) {
				contact.manager.service.model.Contact contact = contacts.get(i);

				contactPKs[i] = contact.getPrimaryKey();
			}

			setContacts(pk, contactPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CmapSubGroupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cmap sub group persistence.
	 */
	public void afterPropertiesSet() {
		cmapSubGroupToContactTableMapper = TableMapperFactory.getTableMapper("contactmanager_Contacts_CmapSubGroups",
				"companyId", "subGroupId", "contactId", this, contactPersistence);
	}

	public void destroy() {
		entityCache.removeCache(CmapSubGroupImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper(
			"contactmanager_Contacts_CmapSubGroups");
	}

	@ServiceReference(type = CompanyProvider.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	@BeanReference(type = ContactPersistence.class)
	protected ContactPersistence contactPersistence;
	protected TableMapper<CmapSubGroup, contact.manager.service.model.Contact> cmapSubGroupToContactTableMapper;
	private static final String _SQL_SELECT_CMAPSUBGROUP = "SELECT cmapSubGroup FROM CmapSubGroup cmapSubGroup";
	private static final String _SQL_SELECT_CMAPSUBGROUP_WHERE_PKS_IN = "SELECT cmapSubGroup FROM CmapSubGroup cmapSubGroup WHERE subGroupId IN (";
	private static final String _SQL_COUNT_CMAPSUBGROUP = "SELECT COUNT(cmapSubGroup) FROM CmapSubGroup cmapSubGroup";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cmapSubGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CmapSubGroup exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(CmapSubGroupPersistenceImpl.class);
}