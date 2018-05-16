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

import contact.manager.service.exception.NoSuchCmapTagException;
import contact.manager.service.model.CmapTag;
import contact.manager.service.model.impl.CmapTagImpl;
import contact.manager.service.model.impl.CmapTagModelImpl;
import contact.manager.service.service.persistence.CmapTagPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the cmap tag service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CmapTagPersistence
 * @see contact.manager.service.service.persistence.CmapTagUtil
 * @generated
 */
@ProviderType
public class CmapTagPersistenceImpl extends BasePersistenceImpl<CmapTag>
	implements CmapTagPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CmapTagUtil} to access the cmap tag persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CmapTagImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
			CmapTagModelImpl.FINDER_CACHE_ENABLED, CmapTagImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
			CmapTagModelImpl.FINDER_CACHE_ENABLED, CmapTagImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
			CmapTagModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CmapTagPersistenceImpl() {
		setModelClass(CmapTag.class);
	}

	/**
	 * Caches the cmap tag in the entity cache if it is enabled.
	 *
	 * @param cmapTag the cmap tag
	 */
	@Override
	public void cacheResult(CmapTag cmapTag) {
		entityCache.putResult(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
			CmapTagImpl.class, cmapTag.getPrimaryKey(), cmapTag);

		cmapTag.resetOriginalValues();
	}

	/**
	 * Caches the cmap tags in the entity cache if it is enabled.
	 *
	 * @param cmapTags the cmap tags
	 */
	@Override
	public void cacheResult(List<CmapTag> cmapTags) {
		for (CmapTag cmapTag : cmapTags) {
			if (entityCache.getResult(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
						CmapTagImpl.class, cmapTag.getPrimaryKey()) == null) {
				cacheResult(cmapTag);
			}
			else {
				cmapTag.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cmap tags.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CmapTagImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cmap tag.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CmapTag cmapTag) {
		entityCache.removeResult(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
			CmapTagImpl.class, cmapTag.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CmapTag> cmapTags) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CmapTag cmapTag : cmapTags) {
			entityCache.removeResult(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
				CmapTagImpl.class, cmapTag.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cmap tag with the primary key. Does not add the cmap tag to the database.
	 *
	 * @param tagId the primary key for the new cmap tag
	 * @return the new cmap tag
	 */
	@Override
	public CmapTag create(long tagId) {
		CmapTag cmapTag = new CmapTagImpl();

		cmapTag.setNew(true);
		cmapTag.setPrimaryKey(tagId);

		return cmapTag;
	}

	/**
	 * Removes the cmap tag with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tagId the primary key of the cmap tag
	 * @return the cmap tag that was removed
	 * @throws NoSuchCmapTagException if a cmap tag with the primary key could not be found
	 */
	@Override
	public CmapTag remove(long tagId) throws NoSuchCmapTagException {
		return remove((Serializable)tagId);
	}

	/**
	 * Removes the cmap tag with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cmap tag
	 * @return the cmap tag that was removed
	 * @throws NoSuchCmapTagException if a cmap tag with the primary key could not be found
	 */
	@Override
	public CmapTag remove(Serializable primaryKey)
		throws NoSuchCmapTagException {
		Session session = null;

		try {
			session = openSession();

			CmapTag cmapTag = (CmapTag)session.get(CmapTagImpl.class, primaryKey);

			if (cmapTag == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCmapTagException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cmapTag);
		}
		catch (NoSuchCmapTagException nsee) {
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
	protected CmapTag removeImpl(CmapTag cmapTag) {
		cmapTag = toUnwrappedModel(cmapTag);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cmapTag)) {
				cmapTag = (CmapTag)session.get(CmapTagImpl.class,
						cmapTag.getPrimaryKeyObj());
			}

			if (cmapTag != null) {
				session.delete(cmapTag);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cmapTag != null) {
			clearCache(cmapTag);
		}

		return cmapTag;
	}

	@Override
	public CmapTag updateImpl(CmapTag cmapTag) {
		cmapTag = toUnwrappedModel(cmapTag);

		boolean isNew = cmapTag.isNew();

		Session session = null;

		try {
			session = openSession();

			if (cmapTag.isNew()) {
				session.save(cmapTag);

				cmapTag.setNew(false);
			}
			else {
				cmapTag = (CmapTag)session.merge(cmapTag);
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

		entityCache.putResult(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
			CmapTagImpl.class, cmapTag.getPrimaryKey(), cmapTag, false);

		cmapTag.resetOriginalValues();

		return cmapTag;
	}

	protected CmapTag toUnwrappedModel(CmapTag cmapTag) {
		if (cmapTag instanceof CmapTagImpl) {
			return cmapTag;
		}

		CmapTagImpl cmapTagImpl = new CmapTagImpl();

		cmapTagImpl.setNew(cmapTag.isNew());
		cmapTagImpl.setPrimaryKey(cmapTag.getPrimaryKey());

		cmapTagImpl.setTagId(cmapTag.getTagId());
		cmapTagImpl.setTagName(cmapTag.getTagName());

		return cmapTagImpl;
	}

	/**
	 * Returns the cmap tag with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cmap tag
	 * @return the cmap tag
	 * @throws NoSuchCmapTagException if a cmap tag with the primary key could not be found
	 */
	@Override
	public CmapTag findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCmapTagException {
		CmapTag cmapTag = fetchByPrimaryKey(primaryKey);

		if (cmapTag == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCmapTagException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cmapTag;
	}

	/**
	 * Returns the cmap tag with the primary key or throws a {@link NoSuchCmapTagException} if it could not be found.
	 *
	 * @param tagId the primary key of the cmap tag
	 * @return the cmap tag
	 * @throws NoSuchCmapTagException if a cmap tag with the primary key could not be found
	 */
	@Override
	public CmapTag findByPrimaryKey(long tagId) throws NoSuchCmapTagException {
		return findByPrimaryKey((Serializable)tagId);
	}

	/**
	 * Returns the cmap tag with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cmap tag
	 * @return the cmap tag, or <code>null</code> if a cmap tag with the primary key could not be found
	 */
	@Override
	public CmapTag fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
				CmapTagImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CmapTag cmapTag = (CmapTag)serializable;

		if (cmapTag == null) {
			Session session = null;

			try {
				session = openSession();

				cmapTag = (CmapTag)session.get(CmapTagImpl.class, primaryKey);

				if (cmapTag != null) {
					cacheResult(cmapTag);
				}
				else {
					entityCache.putResult(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
						CmapTagImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
					CmapTagImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cmapTag;
	}

	/**
	 * Returns the cmap tag with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tagId the primary key of the cmap tag
	 * @return the cmap tag, or <code>null</code> if a cmap tag with the primary key could not be found
	 */
	@Override
	public CmapTag fetchByPrimaryKey(long tagId) {
		return fetchByPrimaryKey((Serializable)tagId);
	}

	@Override
	public Map<Serializable, CmapTag> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CmapTag> map = new HashMap<Serializable, CmapTag>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CmapTag cmapTag = fetchByPrimaryKey(primaryKey);

			if (cmapTag != null) {
				map.put(primaryKey, cmapTag);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
					CmapTagImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CmapTag)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CMAPTAG_WHERE_PKS_IN);

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

			for (CmapTag cmapTag : (List<CmapTag>)q.list()) {
				map.put(cmapTag.getPrimaryKeyObj(), cmapTag);

				cacheResult(cmapTag);

				uncachedPrimaryKeys.remove(cmapTag.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CmapTagModelImpl.ENTITY_CACHE_ENABLED,
					CmapTagImpl.class, primaryKey, nullModel);
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
	 * Returns all the cmap tags.
	 *
	 * @return the cmap tags
	 */
	@Override
	public List<CmapTag> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cmap tags.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmap tags
	 * @param end the upper bound of the range of cmap tags (not inclusive)
	 * @return the range of cmap tags
	 */
	@Override
	public List<CmapTag> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cmap tags.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmap tags
	 * @param end the upper bound of the range of cmap tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cmap tags
	 */
	@Override
	public List<CmapTag> findAll(int start, int end,
		OrderByComparator<CmapTag> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cmap tags.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmap tags
	 * @param end the upper bound of the range of cmap tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of cmap tags
	 */
	@Override
	public List<CmapTag> findAll(int start, int end,
		OrderByComparator<CmapTag> orderByComparator, boolean retrieveFromCache) {
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

		List<CmapTag> list = null;

		if (retrieveFromCache) {
			list = (List<CmapTag>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CMAPTAG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CMAPTAG;

				if (pagination) {
					sql = sql.concat(CmapTagModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CmapTag>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CmapTag>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the cmap tags from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CmapTag cmapTag : findAll()) {
			remove(cmapTag);
		}
	}

	/**
	 * Returns the number of cmap tags.
	 *
	 * @return the number of cmap tags
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CMAPTAG);

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
		return CmapTagModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cmap tag persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CmapTagImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CMAPTAG = "SELECT cmapTag FROM CmapTag cmapTag";
	private static final String _SQL_SELECT_CMAPTAG_WHERE_PKS_IN = "SELECT cmapTag FROM CmapTag cmapTag WHERE tagId IN (";
	private static final String _SQL_COUNT_CMAPTAG = "SELECT COUNT(cmapTag) FROM CmapTag cmapTag";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cmapTag.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CmapTag exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(CmapTagPersistenceImpl.class);
}