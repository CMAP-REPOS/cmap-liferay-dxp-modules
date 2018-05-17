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

package contact.manager.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
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

import contact.manager.exception.NoSuchCrmGroupException;

import contact.manager.model.CrmGroup;
import contact.manager.model.impl.CrmGroupImpl;
import contact.manager.model.impl.CrmGroupModelImpl;

import contact.manager.service.persistence.CrmContactPersistence;
import contact.manager.service.persistence.CrmGroupPersistence;

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
 * The persistence implementation for the CRM Group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmGroupPersistence
 * @see contact.manager.service.persistence.CrmGroupUtil
 * @generated
 */
@ProviderType
public class CrmGroupPersistenceImpl extends BasePersistenceImpl<CrmGroup>
	implements CrmGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrmGroupUtil} to access the CRM Group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrmGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, CrmGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CrmGroupPersistenceImpl() {
		setModelClass(CrmGroup.class);
	}

	/**
	 * Caches the CRM Group in the entity cache if it is enabled.
	 *
	 * @param crmGroup the CRM Group
	 */
	@Override
	public void cacheResult(CrmGroup crmGroup) {
		entityCache.putResult(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupImpl.class, crmGroup.getPrimaryKey(), crmGroup);

		crmGroup.resetOriginalValues();
	}

	/**
	 * Caches the CRM Groups in the entity cache if it is enabled.
	 *
	 * @param crmGroups the CRM Groups
	 */
	@Override
	public void cacheResult(List<CrmGroup> crmGroups) {
		for (CrmGroup crmGroup : crmGroups) {
			if (entityCache.getResult(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
						CrmGroupImpl.class, crmGroup.getPrimaryKey()) == null) {
				cacheResult(crmGroup);
			}
			else {
				crmGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all CRM Groups.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CrmGroupImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the CRM Group.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrmGroup crmGroup) {
		entityCache.removeResult(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupImpl.class, crmGroup.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CrmGroup> crmGroups) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CrmGroup crmGroup : crmGroups) {
			entityCache.removeResult(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
				CrmGroupImpl.class, crmGroup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new CRM Group with the primary key. Does not add the CRM Group to the database.
	 *
	 * @param crmGroupId the primary key for the new CRM Group
	 * @return the new CRM Group
	 */
	@Override
	public CrmGroup create(long crmGroupId) {
		CrmGroup crmGroup = new CrmGroupImpl();

		crmGroup.setNew(true);
		crmGroup.setPrimaryKey(crmGroupId);

		crmGroup.setCompanyId(companyProvider.getCompanyId());

		return crmGroup;
	}

	/**
	 * Removes the CRM Group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmGroupId the primary key of the CRM Group
	 * @return the CRM Group that was removed
	 * @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup remove(long crmGroupId) throws NoSuchCrmGroupException {
		return remove((Serializable)crmGroupId);
	}

	/**
	 * Removes the CRM Group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the CRM Group
	 * @return the CRM Group that was removed
	 * @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup remove(Serializable primaryKey)
		throws NoSuchCrmGroupException {
		Session session = null;

		try {
			session = openSession();

			CrmGroup crmGroup = (CrmGroup)session.get(CrmGroupImpl.class,
					primaryKey);

			if (crmGroup == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCrmGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmGroup);
		}
		catch (NoSuchCrmGroupException nsee) {
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
	protected CrmGroup removeImpl(CrmGroup crmGroup) {
		crmGroup = toUnwrappedModel(crmGroup);

		crmGroupToCrmContactTableMapper.deleteLeftPrimaryKeyTableMappings(crmGroup.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmGroup)) {
				crmGroup = (CrmGroup)session.get(CrmGroupImpl.class,
						crmGroup.getPrimaryKeyObj());
			}

			if (crmGroup != null) {
				session.delete(crmGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmGroup != null) {
			clearCache(crmGroup);
		}

		return crmGroup;
	}

	@Override
	public CrmGroup updateImpl(CrmGroup crmGroup) {
		crmGroup = toUnwrappedModel(crmGroup);

		boolean isNew = crmGroup.isNew();

		CrmGroupModelImpl crmGroupModelImpl = (CrmGroupModelImpl)crmGroup;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crmGroup.getCreateDate() == null)) {
			if (serviceContext == null) {
				crmGroup.setCreateDate(now);
			}
			else {
				crmGroup.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crmGroupModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crmGroup.setModifiedDate(now);
			}
			else {
				crmGroup.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crmGroup.isNew()) {
				session.save(crmGroup);

				crmGroup.setNew(false);
			}
			else {
				crmGroup = (CrmGroup)session.merge(crmGroup);
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

		entityCache.putResult(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
			CrmGroupImpl.class, crmGroup.getPrimaryKey(), crmGroup, false);

		crmGroup.resetOriginalValues();

		return crmGroup;
	}

	protected CrmGroup toUnwrappedModel(CrmGroup crmGroup) {
		if (crmGroup instanceof CrmGroupImpl) {
			return crmGroup;
		}

		CrmGroupImpl crmGroupImpl = new CrmGroupImpl();

		crmGroupImpl.setNew(crmGroup.isNew());
		crmGroupImpl.setPrimaryKey(crmGroup.getPrimaryKey());

		crmGroupImpl.setCrmGroupId(crmGroup.getCrmGroupId());
		crmGroupImpl.setGroupId(crmGroup.getGroupId());
		crmGroupImpl.setCompanyId(crmGroup.getCompanyId());
		crmGroupImpl.setUserId(crmGroup.getUserId());
		crmGroupImpl.setUserName(crmGroup.getUserName());
		crmGroupImpl.setCreateDate(crmGroup.getCreateDate());
		crmGroupImpl.setModifiedDate(crmGroup.getModifiedDate());
		crmGroupImpl.setName(crmGroup.getName());

		return crmGroupImpl;
	}

	/**
	 * Returns the CRM Group with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Group
	 * @return the CRM Group
	 * @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCrmGroupException {
		CrmGroup crmGroup = fetchByPrimaryKey(primaryKey);

		if (crmGroup == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCrmGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmGroup;
	}

	/**
	 * Returns the CRM Group with the primary key or throws a {@link NoSuchCrmGroupException} if it could not be found.
	 *
	 * @param crmGroupId the primary key of the CRM Group
	 * @return the CRM Group
	 * @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup findByPrimaryKey(long crmGroupId)
		throws NoSuchCrmGroupException {
		return findByPrimaryKey((Serializable)crmGroupId);
	}

	/**
	 * Returns the CRM Group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the CRM Group
	 * @return the CRM Group, or <code>null</code> if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
				CrmGroupImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CrmGroup crmGroup = (CrmGroup)serializable;

		if (crmGroup == null) {
			Session session = null;

			try {
				session = openSession();

				crmGroup = (CrmGroup)session.get(CrmGroupImpl.class, primaryKey);

				if (crmGroup != null) {
					cacheResult(crmGroup);
				}
				else {
					entityCache.putResult(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
						CrmGroupImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
					CrmGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmGroup;
	}

	/**
	 * Returns the CRM Group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmGroupId the primary key of the CRM Group
	 * @return the CRM Group, or <code>null</code> if a CRM Group with the primary key could not be found
	 */
	@Override
	public CrmGroup fetchByPrimaryKey(long crmGroupId) {
		return fetchByPrimaryKey((Serializable)crmGroupId);
	}

	@Override
	public Map<Serializable, CrmGroup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CrmGroup> map = new HashMap<Serializable, CrmGroup>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CrmGroup crmGroup = fetchByPrimaryKey(primaryKey);

			if (crmGroup != null) {
				map.put(primaryKey, crmGroup);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
					CrmGroupImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CrmGroup)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRMGROUP_WHERE_PKS_IN);

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

			for (CrmGroup crmGroup : (List<CrmGroup>)q.list()) {
				map.put(crmGroup.getPrimaryKeyObj(), crmGroup);

				cacheResult(crmGroup);

				uncachedPrimaryKeys.remove(crmGroup.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CrmGroupModelImpl.ENTITY_CACHE_ENABLED,
					CrmGroupImpl.class, primaryKey, nullModel);
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
	 * Returns all the CRM Groups.
	 *
	 * @return the CRM Groups
	 */
	@Override
	public List<CrmGroup> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the CRM Groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @return the range of CRM Groups
	 */
	@Override
	public List<CrmGroup> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Groups
	 */
	@Override
	public List<CrmGroup> findAll(int start, int end,
		OrderByComparator<CrmGroup> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the CRM Groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of CRM Groups
	 */
	@Override
	public List<CrmGroup> findAll(int start, int end,
		OrderByComparator<CrmGroup> orderByComparator, boolean retrieveFromCache) {
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

		List<CrmGroup> list = null;

		if (retrieveFromCache) {
			list = (List<CrmGroup>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRMGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMGROUP;

				if (pagination) {
					sql = sql.concat(CrmGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CrmGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CrmGroup>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the CRM Groups from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CrmGroup crmGroup : findAll()) {
			remove(crmGroup);
		}
	}

	/**
	 * Returns the number of CRM Groups.
	 *
	 * @return the number of CRM Groups
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRMGROUP);

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
	 * Returns the primaryKeys of CRM Contacts associated with the CRM Group.
	 *
	 * @param pk the primary key of the CRM Group
	 * @return long[] of the primaryKeys of CRM Contacts associated with the CRM Group
	 */
	@Override
	public long[] getCrmContactPrimaryKeys(long pk) {
		long[] pks = crmGroupToCrmContactTableMapper.getRightPrimaryKeys(pk);

		return pks.clone();
	}

	/**
	 * Returns all the CRM Contacts associated with the CRM Group.
	 *
	 * @param pk the primary key of the CRM Group
	 * @return the CRM Contacts associated with the CRM Group
	 */
	@Override
	public List<contact.manager.model.CrmContact> getCrmContacts(long pk) {
		return getCrmContacts(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the CRM Contacts associated with the CRM Group.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the CRM Group
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @return the range of CRM Contacts associated with the CRM Group
	 */
	@Override
	public List<contact.manager.model.CrmContact> getCrmContacts(long pk,
		int start, int end) {
		return getCrmContacts(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the CRM Contacts associated with the CRM Group.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the CRM Group
	 * @param start the lower bound of the range of CRM Groups
	 * @param end the upper bound of the range of CRM Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Contacts associated with the CRM Group
	 */
	@Override
	public List<contact.manager.model.CrmContact> getCrmContacts(long pk,
		int start, int end,
		OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		return crmGroupToCrmContactTableMapper.getRightBaseModels(pk, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of CRM Contacts associated with the CRM Group.
	 *
	 * @param pk the primary key of the CRM Group
	 * @return the number of CRM Contacts associated with the CRM Group
	 */
	@Override
	public int getCrmContactsSize(long pk) {
		long[] pks = crmGroupToCrmContactTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the CRM Contact is associated with the CRM Group.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContactPK the primary key of the CRM Contact
	 * @return <code>true</code> if the CRM Contact is associated with the CRM Group; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCrmContact(long pk, long crmContactPK) {
		return crmGroupToCrmContactTableMapper.containsTableMapping(pk,
			crmContactPK);
	}

	/**
	 * Returns <code>true</code> if the CRM Group has any CRM Contacts associated with it.
	 *
	 * @param pk the primary key of the CRM Group to check for associations with CRM Contacts
	 * @return <code>true</code> if the CRM Group has any CRM Contacts associated with it; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCrmContacts(long pk) {
		if (getCrmContactsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the CRM Group and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContactPK the primary key of the CRM Contact
	 */
	@Override
	public void addCrmContact(long pk, long crmContactPK) {
		CrmGroup crmGroup = fetchByPrimaryKey(pk);

		if (crmGroup == null) {
			crmGroupToCrmContactTableMapper.addTableMapping(companyProvider.getCompanyId(),
				pk, crmContactPK);
		}
		else {
			crmGroupToCrmContactTableMapper.addTableMapping(crmGroup.getCompanyId(),
				pk, crmContactPK);
		}
	}

	/**
	 * Adds an association between the CRM Group and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContact the CRM Contact
	 */
	@Override
	public void addCrmContact(long pk,
		contact.manager.model.CrmContact crmContact) {
		CrmGroup crmGroup = fetchByPrimaryKey(pk);

		if (crmGroup == null) {
			crmGroupToCrmContactTableMapper.addTableMapping(companyProvider.getCompanyId(),
				pk, crmContact.getPrimaryKey());
		}
		else {
			crmGroupToCrmContactTableMapper.addTableMapping(crmGroup.getCompanyId(),
				pk, crmContact.getPrimaryKey());
		}
	}

	/**
	 * Adds an association between the CRM Group and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContactPKs the primary keys of the CRM Contacts
	 */
	@Override
	public void addCrmContacts(long pk, long[] crmContactPKs) {
		long companyId = 0;

		CrmGroup crmGroup = fetchByPrimaryKey(pk);

		if (crmGroup == null) {
			companyId = companyProvider.getCompanyId();
		}
		else {
			companyId = crmGroup.getCompanyId();
		}

		crmGroupToCrmContactTableMapper.addTableMappings(companyId, pk,
			crmContactPKs);
	}

	/**
	 * Adds an association between the CRM Group and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContacts the CRM Contacts
	 */
	@Override
	public void addCrmContacts(long pk,
		List<contact.manager.model.CrmContact> crmContacts) {
		addCrmContacts(pk,
			ListUtil.toLongArray(crmContacts,
				contact.manager.model.CrmContact.CRM_CONTACT_ID_ACCESSOR));
	}

	/**
	 * Clears all associations between the CRM Group and its CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group to clear the associated CRM Contacts from
	 */
	@Override
	public void clearCrmContacts(long pk) {
		crmGroupToCrmContactTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the CRM Group and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContactPK the primary key of the CRM Contact
	 */
	@Override
	public void removeCrmContact(long pk, long crmContactPK) {
		crmGroupToCrmContactTableMapper.deleteTableMapping(pk, crmContactPK);
	}

	/**
	 * Removes the association between the CRM Group and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContact the CRM Contact
	 */
	@Override
	public void removeCrmContact(long pk,
		contact.manager.model.CrmContact crmContact) {
		crmGroupToCrmContactTableMapper.deleteTableMapping(pk,
			crmContact.getPrimaryKey());
	}

	/**
	 * Removes the association between the CRM Group and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContactPKs the primary keys of the CRM Contacts
	 */
	@Override
	public void removeCrmContacts(long pk, long[] crmContactPKs) {
		crmGroupToCrmContactTableMapper.deleteTableMappings(pk, crmContactPKs);
	}

	/**
	 * Removes the association between the CRM Group and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContacts the CRM Contacts
	 */
	@Override
	public void removeCrmContacts(long pk,
		List<contact.manager.model.CrmContact> crmContacts) {
		removeCrmContacts(pk,
			ListUtil.toLongArray(crmContacts,
				contact.manager.model.CrmContact.CRM_CONTACT_ID_ACCESSOR));
	}

	/**
	 * Sets the CRM Contacts associated with the CRM Group, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContactPKs the primary keys of the CRM Contacts to be associated with the CRM Group
	 */
	@Override
	public void setCrmContacts(long pk, long[] crmContactPKs) {
		Set<Long> newCrmContactPKsSet = SetUtil.fromArray(crmContactPKs);
		Set<Long> oldCrmContactPKsSet = SetUtil.fromArray(crmGroupToCrmContactTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeCrmContactPKsSet = new HashSet<Long>(oldCrmContactPKsSet);

		removeCrmContactPKsSet.removeAll(newCrmContactPKsSet);

		crmGroupToCrmContactTableMapper.deleteTableMappings(pk,
			ArrayUtil.toLongArray(removeCrmContactPKsSet));

		newCrmContactPKsSet.removeAll(oldCrmContactPKsSet);

		long companyId = 0;

		CrmGroup crmGroup = fetchByPrimaryKey(pk);

		if (crmGroup == null) {
			companyId = companyProvider.getCompanyId();
		}
		else {
			companyId = crmGroup.getCompanyId();
		}

		crmGroupToCrmContactTableMapper.addTableMappings(companyId, pk,
			ArrayUtil.toLongArray(newCrmContactPKsSet));
	}

	/**
	 * Sets the CRM Contacts associated with the CRM Group, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Group
	 * @param crmContacts the CRM Contacts to be associated with the CRM Group
	 */
	@Override
	public void setCrmContacts(long pk,
		List<contact.manager.model.CrmContact> crmContacts) {
		try {
			long[] crmContactPKs = new long[crmContacts.size()];

			for (int i = 0; i < crmContacts.size(); i++) {
				contact.manager.model.CrmContact crmContact = crmContacts.get(i);

				crmContactPKs[i] = crmContact.getPrimaryKey();
			}

			setCrmContacts(pk, crmContactPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CrmGroupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the CRM Group persistence.
	 */
	public void afterPropertiesSet() {
		crmGroupToCrmContactTableMapper = TableMapperFactory.getTableMapper("crm_contacts_groups",
				"companyId", "crmGroupId", "crmContactId", this,
				crmContactPersistence);
	}

	public void destroy() {
		entityCache.removeCache(CrmGroupImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("crm_contacts_groups");
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	@BeanReference(type = CrmContactPersistence.class)
	protected CrmContactPersistence crmContactPersistence;
	protected TableMapper<CrmGroup, contact.manager.model.CrmContact> crmGroupToCrmContactTableMapper;
	private static final String _SQL_SELECT_CRMGROUP = "SELECT crmGroup FROM CrmGroup crmGroup";
	private static final String _SQL_SELECT_CRMGROUP_WHERE_PKS_IN = "SELECT crmGroup FROM CrmGroup crmGroup WHERE crmGroupId IN (";
	private static final String _SQL_COUNT_CRMGROUP = "SELECT COUNT(crmGroup) FROM CrmGroup crmGroup";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrmGroup exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(CrmGroupPersistenceImpl.class);
}