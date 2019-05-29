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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ucc.portal.exception.NoSuchCExtOrganizationException;

import ucc.portal.model.CExtOrganization;
import ucc.portal.model.impl.CExtOrganizationImpl;
import ucc.portal.model.impl.CExtOrganizationModelImpl;

import ucc.portal.service.persistence.CExtOrganizationPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the c ext organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtOrganizationPersistence
 * @see ucc.portal.service.persistence.CExtOrganizationUtil
 * @generated
 */
@ProviderType
public class CExtOrganizationPersistenceImpl extends BasePersistenceImpl<CExtOrganization>
	implements CExtOrganizationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CExtOrganizationUtil} to access the c ext organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CExtOrganizationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			CExtOrganizationModelImpl.FINDER_CACHE_ENABLED,
			CExtOrganizationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			CExtOrganizationModelImpl.FINDER_CACHE_ENABLED,
			CExtOrganizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			CExtOrganizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CExtOrganizationPersistenceImpl() {
		setModelClass(CExtOrganization.class);
	}

	/**
	 * Caches the c ext organization in the entity cache if it is enabled.
	 *
	 * @param cExtOrganization the c ext organization
	 */
	@Override
	public void cacheResult(CExtOrganization cExtOrganization) {
		entityCache.putResult(CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			CExtOrganizationImpl.class, cExtOrganization.getPrimaryKey(),
			cExtOrganization);

		cExtOrganization.resetOriginalValues();
	}

	/**
	 * Caches the c ext organizations in the entity cache if it is enabled.
	 *
	 * @param cExtOrganizations the c ext organizations
	 */
	@Override
	public void cacheResult(List<CExtOrganization> cExtOrganizations) {
		for (CExtOrganization cExtOrganization : cExtOrganizations) {
			if (entityCache.getResult(
						CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
						CExtOrganizationImpl.class,
						cExtOrganization.getPrimaryKey()) == null) {
				cacheResult(cExtOrganization);
			}
			else {
				cExtOrganization.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c ext organizations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CExtOrganizationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c ext organization.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CExtOrganization cExtOrganization) {
		entityCache.removeResult(CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			CExtOrganizationImpl.class, cExtOrganization.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CExtOrganization> cExtOrganizations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CExtOrganization cExtOrganization : cExtOrganizations) {
			entityCache.removeResult(CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
				CExtOrganizationImpl.class, cExtOrganization.getPrimaryKey());
		}
	}

	/**
	 * Creates a new c ext organization with the primary key. Does not add the c ext organization to the database.
	 *
	 * @param organizationId the primary key for the new c ext organization
	 * @return the new c ext organization
	 */
	@Override
	public CExtOrganization create(long organizationId) {
		CExtOrganization cExtOrganization = new CExtOrganizationImpl();

		cExtOrganization.setNew(true);
		cExtOrganization.setPrimaryKey(organizationId);

		cExtOrganization.setCompanyId(companyProvider.getCompanyId());

		return cExtOrganization;
	}

	/**
	 * Removes the c ext organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param organizationId the primary key of the c ext organization
	 * @return the c ext organization that was removed
	 * @throws NoSuchCExtOrganizationException if a c ext organization with the primary key could not be found
	 */
	@Override
	public CExtOrganization remove(long organizationId)
		throws NoSuchCExtOrganizationException {
		return remove((Serializable)organizationId);
	}

	/**
	 * Removes the c ext organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c ext organization
	 * @return the c ext organization that was removed
	 * @throws NoSuchCExtOrganizationException if a c ext organization with the primary key could not be found
	 */
	@Override
	public CExtOrganization remove(Serializable primaryKey)
		throws NoSuchCExtOrganizationException {
		Session session = null;

		try {
			session = openSession();

			CExtOrganization cExtOrganization = (CExtOrganization)session.get(CExtOrganizationImpl.class,
					primaryKey);

			if (cExtOrganization == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCExtOrganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cExtOrganization);
		}
		catch (NoSuchCExtOrganizationException nsee) {
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
	protected CExtOrganization removeImpl(CExtOrganization cExtOrganization) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cExtOrganization)) {
				cExtOrganization = (CExtOrganization)session.get(CExtOrganizationImpl.class,
						cExtOrganization.getPrimaryKeyObj());
			}

			if (cExtOrganization != null) {
				session.delete(cExtOrganization);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cExtOrganization != null) {
			clearCache(cExtOrganization);
		}

		return cExtOrganization;
	}

	@Override
	public CExtOrganization updateImpl(CExtOrganization cExtOrganization) {
		boolean isNew = cExtOrganization.isNew();

		if (!(cExtOrganization instanceof CExtOrganizationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cExtOrganization.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(cExtOrganization);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cExtOrganization proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CExtOrganization implementation " +
				cExtOrganization.getClass());
		}

		CExtOrganizationModelImpl cExtOrganizationModelImpl = (CExtOrganizationModelImpl)cExtOrganization;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (cExtOrganization.getCreateDate() == null)) {
			if (serviceContext == null) {
				cExtOrganization.setCreateDate(now);
			}
			else {
				cExtOrganization.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!cExtOrganizationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cExtOrganization.setModifiedDate(now);
			}
			else {
				cExtOrganization.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (cExtOrganization.isNew()) {
				session.save(cExtOrganization);

				cExtOrganization.setNew(false);
			}
			else {
				cExtOrganization = (CExtOrganization)session.merge(cExtOrganization);
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

		entityCache.putResult(CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			CExtOrganizationImpl.class, cExtOrganization.getPrimaryKey(),
			cExtOrganization, false);

		cExtOrganization.resetOriginalValues();

		return cExtOrganization;
	}

	/**
	 * Returns the c ext organization with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext organization
	 * @return the c ext organization
	 * @throws NoSuchCExtOrganizationException if a c ext organization with the primary key could not be found
	 */
	@Override
	public CExtOrganization findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCExtOrganizationException {
		CExtOrganization cExtOrganization = fetchByPrimaryKey(primaryKey);

		if (cExtOrganization == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCExtOrganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cExtOrganization;
	}

	/**
	 * Returns the c ext organization with the primary key or throws a {@link NoSuchCExtOrganizationException} if it could not be found.
	 *
	 * @param organizationId the primary key of the c ext organization
	 * @return the c ext organization
	 * @throws NoSuchCExtOrganizationException if a c ext organization with the primary key could not be found
	 */
	@Override
	public CExtOrganization findByPrimaryKey(long organizationId)
		throws NoSuchCExtOrganizationException {
		return findByPrimaryKey((Serializable)organizationId);
	}

	/**
	 * Returns the c ext organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c ext organization
	 * @return the c ext organization, or <code>null</code> if a c ext organization with the primary key could not be found
	 */
	@Override
	public CExtOrganization fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
				CExtOrganizationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CExtOrganization cExtOrganization = (CExtOrganization)serializable;

		if (cExtOrganization == null) {
			Session session = null;

			try {
				session = openSession();

				cExtOrganization = (CExtOrganization)session.get(CExtOrganizationImpl.class,
						primaryKey);

				if (cExtOrganization != null) {
					cacheResult(cExtOrganization);
				}
				else {
					entityCache.putResult(CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
						CExtOrganizationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
					CExtOrganizationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cExtOrganization;
	}

	/**
	 * Returns the c ext organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param organizationId the primary key of the c ext organization
	 * @return the c ext organization, or <code>null</code> if a c ext organization with the primary key could not be found
	 */
	@Override
	public CExtOrganization fetchByPrimaryKey(long organizationId) {
		return fetchByPrimaryKey((Serializable)organizationId);
	}

	@Override
	public Map<Serializable, CExtOrganization> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CExtOrganization> map = new HashMap<Serializable, CExtOrganization>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CExtOrganization cExtOrganization = fetchByPrimaryKey(primaryKey);

			if (cExtOrganization != null) {
				map.put(primaryKey, cExtOrganization);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
					CExtOrganizationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CExtOrganization)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CEXTORGANIZATION_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (CExtOrganization cExtOrganization : (List<CExtOrganization>)q.list()) {
				map.put(cExtOrganization.getPrimaryKeyObj(), cExtOrganization);

				cacheResult(cExtOrganization);

				uncachedPrimaryKeys.remove(cExtOrganization.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CExtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
					CExtOrganizationImpl.class, primaryKey, nullModel);
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
	 * Returns all the c ext organizations.
	 *
	 * @return the c ext organizations
	 */
	@Override
	public List<CExtOrganization> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c ext organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext organizations
	 * @param end the upper bound of the range of c ext organizations (not inclusive)
	 * @return the range of c ext organizations
	 */
	@Override
	public List<CExtOrganization> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c ext organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext organizations
	 * @param end the upper bound of the range of c ext organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c ext organizations
	 */
	@Override
	public List<CExtOrganization> findAll(int start, int end,
		OrderByComparator<CExtOrganization> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the c ext organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c ext organizations
	 * @param end the upper bound of the range of c ext organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of c ext organizations
	 */
	@Override
	public List<CExtOrganization> findAll(int start, int end,
		OrderByComparator<CExtOrganization> orderByComparator,
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

		List<CExtOrganization> list = null;

		if (retrieveFromCache) {
			list = (List<CExtOrganization>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CEXTORGANIZATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CEXTORGANIZATION;

				if (pagination) {
					sql = sql.concat(CExtOrganizationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CExtOrganization>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CExtOrganization>)QueryUtil.list(q,
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
	 * Removes all the c ext organizations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CExtOrganization cExtOrganization : findAll()) {
			remove(cExtOrganization);
		}
	}

	/**
	 * Returns the number of c ext organizations.
	 *
	 * @return the number of c ext organizations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CEXTORGANIZATION);

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
		return CExtOrganizationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the c ext organization persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CExtOrganizationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CEXTORGANIZATION = "SELECT cExtOrganization FROM CExtOrganization cExtOrganization";
	private static final String _SQL_SELECT_CEXTORGANIZATION_WHERE_PKS_IN = "SELECT cExtOrganization FROM CExtOrganization cExtOrganization WHERE organizationId IN (";
	private static final String _SQL_COUNT_CEXTORGANIZATION = "SELECT COUNT(cExtOrganization) FROM CExtOrganization cExtOrganization";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cExtOrganization.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CExtOrganization exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(CExtOrganizationPersistenceImpl.class);
}