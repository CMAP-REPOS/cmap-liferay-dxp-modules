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
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.service.exception.NoSuchCmapSubGroupException;
import contact.manager.service.model.CmapSubGroup;
import contact.manager.service.model.impl.CmapSubGroupImpl;
import contact.manager.service.model.impl.CmapSubGroupModelImpl;
import contact.manager.service.service.persistence.CmapSubGroupPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBGROUPNAME =
		new FinderPath(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapSubGroupModelImpl.FINDER_CACHE_ENABLED, CmapSubGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySubGroupName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBGROUPNAME =
		new FinderPath(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapSubGroupModelImpl.FINDER_CACHE_ENABLED, CmapSubGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySubGroupName",
			new String[] { String.class.getName() },
			CmapSubGroupModelImpl.SUBGROUPNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SUBGROUPNAME = new FinderPath(CmapSubGroupModelImpl.ENTITY_CACHE_ENABLED,
			CmapSubGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySubGroupName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the cmap sub groups where subGroupName = &#63;.
	 *
	 * @param subGroupName the sub group name
	 * @return the matching cmap sub groups
	 */
	@Override
	public List<CmapSubGroup> findBySubGroupName(String subGroupName) {
		return findBySubGroupName(subGroupName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cmap sub groups where subGroupName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param subGroupName the sub group name
	 * @param start the lower bound of the range of cmap sub groups
	 * @param end the upper bound of the range of cmap sub groups (not inclusive)
	 * @return the range of matching cmap sub groups
	 */
	@Override
	public List<CmapSubGroup> findBySubGroupName(String subGroupName,
		int start, int end) {
		return findBySubGroupName(subGroupName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cmap sub groups where subGroupName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param subGroupName the sub group name
	 * @param start the lower bound of the range of cmap sub groups
	 * @param end the upper bound of the range of cmap sub groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cmap sub groups
	 */
	@Override
	public List<CmapSubGroup> findBySubGroupName(String subGroupName,
		int start, int end, OrderByComparator<CmapSubGroup> orderByComparator) {
		return findBySubGroupName(subGroupName, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the cmap sub groups where subGroupName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param subGroupName the sub group name
	 * @param start the lower bound of the range of cmap sub groups
	 * @param end the upper bound of the range of cmap sub groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching cmap sub groups
	 */
	@Override
	public List<CmapSubGroup> findBySubGroupName(String subGroupName,
		int start, int end, OrderByComparator<CmapSubGroup> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBGROUPNAME;
			finderArgs = new Object[] { subGroupName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBGROUPNAME;
			finderArgs = new Object[] {
					subGroupName,
					
					start, end, orderByComparator
				};
		}

		List<CmapSubGroup> list = null;

		if (retrieveFromCache) {
			list = (List<CmapSubGroup>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CmapSubGroup cmapSubGroup : list) {
					if (!Objects.equals(subGroupName,
								cmapSubGroup.getSubGroupName())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CMAPSUBGROUP_WHERE);

			boolean bindSubGroupName = false;

			if (subGroupName == null) {
				query.append(_FINDER_COLUMN_SUBGROUPNAME_SUBGROUPNAME_1);
			}
			else if (subGroupName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SUBGROUPNAME_SUBGROUPNAME_3);
			}
			else {
				bindSubGroupName = true;

				query.append(_FINDER_COLUMN_SUBGROUPNAME_SUBGROUPNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CmapSubGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSubGroupName) {
					qPos.add(subGroupName);
				}

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
	 * Returns the first cmap sub group in the ordered set where subGroupName = &#63;.
	 *
	 * @param subGroupName the sub group name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cmap sub group
	 * @throws NoSuchCmapSubGroupException if a matching cmap sub group could not be found
	 */
	@Override
	public CmapSubGroup findBySubGroupName_First(String subGroupName,
		OrderByComparator<CmapSubGroup> orderByComparator)
		throws NoSuchCmapSubGroupException {
		CmapSubGroup cmapSubGroup = fetchBySubGroupName_First(subGroupName,
				orderByComparator);

		if (cmapSubGroup != null) {
			return cmapSubGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("subGroupName=");
		msg.append(subGroupName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCmapSubGroupException(msg.toString());
	}

	/**
	 * Returns the first cmap sub group in the ordered set where subGroupName = &#63;.
	 *
	 * @param subGroupName the sub group name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cmap sub group, or <code>null</code> if a matching cmap sub group could not be found
	 */
	@Override
	public CmapSubGroup fetchBySubGroupName_First(String subGroupName,
		OrderByComparator<CmapSubGroup> orderByComparator) {
		List<CmapSubGroup> list = findBySubGroupName(subGroupName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cmap sub group in the ordered set where subGroupName = &#63;.
	 *
	 * @param subGroupName the sub group name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cmap sub group
	 * @throws NoSuchCmapSubGroupException if a matching cmap sub group could not be found
	 */
	@Override
	public CmapSubGroup findBySubGroupName_Last(String subGroupName,
		OrderByComparator<CmapSubGroup> orderByComparator)
		throws NoSuchCmapSubGroupException {
		CmapSubGroup cmapSubGroup = fetchBySubGroupName_Last(subGroupName,
				orderByComparator);

		if (cmapSubGroup != null) {
			return cmapSubGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("subGroupName=");
		msg.append(subGroupName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCmapSubGroupException(msg.toString());
	}

	/**
	 * Returns the last cmap sub group in the ordered set where subGroupName = &#63;.
	 *
	 * @param subGroupName the sub group name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cmap sub group, or <code>null</code> if a matching cmap sub group could not be found
	 */
	@Override
	public CmapSubGroup fetchBySubGroupName_Last(String subGroupName,
		OrderByComparator<CmapSubGroup> orderByComparator) {
		int count = countBySubGroupName(subGroupName);

		if (count == 0) {
			return null;
		}

		List<CmapSubGroup> list = findBySubGroupName(subGroupName, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cmap sub groups before and after the current cmap sub group in the ordered set where subGroupName = &#63;.
	 *
	 * @param subGroupId the primary key of the current cmap sub group
	 * @param subGroupName the sub group name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cmap sub group
	 * @throws NoSuchCmapSubGroupException if a cmap sub group with the primary key could not be found
	 */
	@Override
	public CmapSubGroup[] findBySubGroupName_PrevAndNext(long subGroupId,
		String subGroupName, OrderByComparator<CmapSubGroup> orderByComparator)
		throws NoSuchCmapSubGroupException {
		CmapSubGroup cmapSubGroup = findByPrimaryKey(subGroupId);

		Session session = null;

		try {
			session = openSession();

			CmapSubGroup[] array = new CmapSubGroupImpl[3];

			array[0] = getBySubGroupName_PrevAndNext(session, cmapSubGroup,
					subGroupName, orderByComparator, true);

			array[1] = cmapSubGroup;

			array[2] = getBySubGroupName_PrevAndNext(session, cmapSubGroup,
					subGroupName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CmapSubGroup getBySubGroupName_PrevAndNext(Session session,
		CmapSubGroup cmapSubGroup, String subGroupName,
		OrderByComparator<CmapSubGroup> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CMAPSUBGROUP_WHERE);

		boolean bindSubGroupName = false;

		if (subGroupName == null) {
			query.append(_FINDER_COLUMN_SUBGROUPNAME_SUBGROUPNAME_1);
		}
		else if (subGroupName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SUBGROUPNAME_SUBGROUPNAME_3);
		}
		else {
			bindSubGroupName = true;

			query.append(_FINDER_COLUMN_SUBGROUPNAME_SUBGROUPNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CmapSubGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSubGroupName) {
			qPos.add(subGroupName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cmapSubGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CmapSubGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cmap sub groups where subGroupName = &#63; from the database.
	 *
	 * @param subGroupName the sub group name
	 */
	@Override
	public void removeBySubGroupName(String subGroupName) {
		for (CmapSubGroup cmapSubGroup : findBySubGroupName(subGroupName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cmapSubGroup);
		}
	}

	/**
	 * Returns the number of cmap sub groups where subGroupName = &#63;.
	 *
	 * @param subGroupName the sub group name
	 * @return the number of matching cmap sub groups
	 */
	@Override
	public int countBySubGroupName(String subGroupName) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SUBGROUPNAME;

		Object[] finderArgs = new Object[] { subGroupName };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CMAPSUBGROUP_WHERE);

			boolean bindSubGroupName = false;

			if (subGroupName == null) {
				query.append(_FINDER_COLUMN_SUBGROUPNAME_SUBGROUPNAME_1);
			}
			else if (subGroupName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SUBGROUPNAME_SUBGROUPNAME_3);
			}
			else {
				bindSubGroupName = true;

				query.append(_FINDER_COLUMN_SUBGROUPNAME_SUBGROUPNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSubGroupName) {
					qPos.add(subGroupName);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_SUBGROUPNAME_SUBGROUPNAME_1 = "cmapSubGroup.subGroupName IS NULL";
	private static final String _FINDER_COLUMN_SUBGROUPNAME_SUBGROUPNAME_2 = "cmapSubGroup.subGroupName = ?";
	private static final String _FINDER_COLUMN_SUBGROUPNAME_SUBGROUPNAME_3 = "(cmapSubGroup.subGroupName IS NULL OR cmapSubGroup.subGroupName = '')";

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

		if (!CmapSubGroupModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { cmapSubGroupModelImpl.getSubGroupName() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SUBGROUPNAME, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBGROUPNAME,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((cmapSubGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBGROUPNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cmapSubGroupModelImpl.getOriginalSubGroupName()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SUBGROUPNAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBGROUPNAME,
					args);

				args = new Object[] { cmapSubGroupModelImpl.getSubGroupName() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SUBGROUPNAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBGROUPNAME,
					args);
			}
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

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CmapSubGroupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cmap sub group persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CmapSubGroupImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CMAPSUBGROUP = "SELECT cmapSubGroup FROM CmapSubGroup cmapSubGroup";
	private static final String _SQL_SELECT_CMAPSUBGROUP_WHERE_PKS_IN = "SELECT cmapSubGroup FROM CmapSubGroup cmapSubGroup WHERE subGroupId IN (";
	private static final String _SQL_SELECT_CMAPSUBGROUP_WHERE = "SELECT cmapSubGroup FROM CmapSubGroup cmapSubGroup WHERE ";
	private static final String _SQL_COUNT_CMAPSUBGROUP = "SELECT COUNT(cmapSubGroup) FROM CmapSubGroup cmapSubGroup";
	private static final String _SQL_COUNT_CMAPSUBGROUP_WHERE = "SELECT COUNT(cmapSubGroup) FROM CmapSubGroup cmapSubGroup WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cmapSubGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CmapSubGroup exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CmapSubGroup exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CmapSubGroupPersistenceImpl.class);
}