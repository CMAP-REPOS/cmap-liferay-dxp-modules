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

package contact.manager.service.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.service.model.CmapSubGroup;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the cmap sub group service. This utility wraps {@link contact.manager.service.service.persistence.impl.CmapSubGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CmapSubGroupPersistence
 * @see contact.manager.service.service.persistence.impl.CmapSubGroupPersistenceImpl
 * @generated
 */
@ProviderType
public class CmapSubGroupUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CmapSubGroup cmapSubGroup) {
		getPersistence().clearCache(cmapSubGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CmapSubGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CmapSubGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CmapSubGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CmapSubGroup> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CmapSubGroup update(CmapSubGroup cmapSubGroup) {
		return getPersistence().update(cmapSubGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CmapSubGroup update(CmapSubGroup cmapSubGroup,
		ServiceContext serviceContext) {
		return getPersistence().update(cmapSubGroup, serviceContext);
	}

	/**
	* Returns all the cmap sub groups where subGroupName = &#63;.
	*
	* @param subGroupName the sub group name
	* @return the matching cmap sub groups
	*/
	public static List<CmapSubGroup> findBySubGroupName(
		java.lang.String subGroupName) {
		return getPersistence().findBySubGroupName(subGroupName);
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
	public static List<CmapSubGroup> findBySubGroupName(
		java.lang.String subGroupName, int start, int end) {
		return getPersistence().findBySubGroupName(subGroupName, start, end);
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
	public static List<CmapSubGroup> findBySubGroupName(
		java.lang.String subGroupName, int start, int end,
		OrderByComparator<CmapSubGroup> orderByComparator) {
		return getPersistence()
				   .findBySubGroupName(subGroupName, start, end,
			orderByComparator);
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
	public static List<CmapSubGroup> findBySubGroupName(
		java.lang.String subGroupName, int start, int end,
		OrderByComparator<CmapSubGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySubGroupName(subGroupName, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first cmap sub group in the ordered set where subGroupName = &#63;.
	*
	* @param subGroupName the sub group name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cmap sub group
	* @throws NoSuchCmapSubGroupException if a matching cmap sub group could not be found
	*/
	public static CmapSubGroup findBySubGroupName_First(
		java.lang.String subGroupName,
		OrderByComparator<CmapSubGroup> orderByComparator)
		throws contact.manager.service.exception.NoSuchCmapSubGroupException {
		return getPersistence()
				   .findBySubGroupName_First(subGroupName, orderByComparator);
	}

	/**
	* Returns the first cmap sub group in the ordered set where subGroupName = &#63;.
	*
	* @param subGroupName the sub group name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cmap sub group, or <code>null</code> if a matching cmap sub group could not be found
	*/
	public static CmapSubGroup fetchBySubGroupName_First(
		java.lang.String subGroupName,
		OrderByComparator<CmapSubGroup> orderByComparator) {
		return getPersistence()
				   .fetchBySubGroupName_First(subGroupName, orderByComparator);
	}

	/**
	* Returns the last cmap sub group in the ordered set where subGroupName = &#63;.
	*
	* @param subGroupName the sub group name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cmap sub group
	* @throws NoSuchCmapSubGroupException if a matching cmap sub group could not be found
	*/
	public static CmapSubGroup findBySubGroupName_Last(
		java.lang.String subGroupName,
		OrderByComparator<CmapSubGroup> orderByComparator)
		throws contact.manager.service.exception.NoSuchCmapSubGroupException {
		return getPersistence()
				   .findBySubGroupName_Last(subGroupName, orderByComparator);
	}

	/**
	* Returns the last cmap sub group in the ordered set where subGroupName = &#63;.
	*
	* @param subGroupName the sub group name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cmap sub group, or <code>null</code> if a matching cmap sub group could not be found
	*/
	public static CmapSubGroup fetchBySubGroupName_Last(
		java.lang.String subGroupName,
		OrderByComparator<CmapSubGroup> orderByComparator) {
		return getPersistence()
				   .fetchBySubGroupName_Last(subGroupName, orderByComparator);
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
	public static CmapSubGroup[] findBySubGroupName_PrevAndNext(
		long subGroupId, java.lang.String subGroupName,
		OrderByComparator<CmapSubGroup> orderByComparator)
		throws contact.manager.service.exception.NoSuchCmapSubGroupException {
		return getPersistence()
				   .findBySubGroupName_PrevAndNext(subGroupId, subGroupName,
			orderByComparator);
	}

	/**
	* Removes all the cmap sub groups where subGroupName = &#63; from the database.
	*
	* @param subGroupName the sub group name
	*/
	public static void removeBySubGroupName(java.lang.String subGroupName) {
		getPersistence().removeBySubGroupName(subGroupName);
	}

	/**
	* Returns the number of cmap sub groups where subGroupName = &#63;.
	*
	* @param subGroupName the sub group name
	* @return the number of matching cmap sub groups
	*/
	public static int countBySubGroupName(java.lang.String subGroupName) {
		return getPersistence().countBySubGroupName(subGroupName);
	}

	/**
	* Caches the cmap sub group in the entity cache if it is enabled.
	*
	* @param cmapSubGroup the cmap sub group
	*/
	public static void cacheResult(CmapSubGroup cmapSubGroup) {
		getPersistence().cacheResult(cmapSubGroup);
	}

	/**
	* Caches the cmap sub groups in the entity cache if it is enabled.
	*
	* @param cmapSubGroups the cmap sub groups
	*/
	public static void cacheResult(List<CmapSubGroup> cmapSubGroups) {
		getPersistence().cacheResult(cmapSubGroups);
	}

	/**
	* Creates a new cmap sub group with the primary key. Does not add the cmap sub group to the database.
	*
	* @param subGroupId the primary key for the new cmap sub group
	* @return the new cmap sub group
	*/
	public static CmapSubGroup create(long subGroupId) {
		return getPersistence().create(subGroupId);
	}

	/**
	* Removes the cmap sub group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subGroupId the primary key of the cmap sub group
	* @return the cmap sub group that was removed
	* @throws NoSuchCmapSubGroupException if a cmap sub group with the primary key could not be found
	*/
	public static CmapSubGroup remove(long subGroupId)
		throws contact.manager.service.exception.NoSuchCmapSubGroupException {
		return getPersistence().remove(subGroupId);
	}

	public static CmapSubGroup updateImpl(CmapSubGroup cmapSubGroup) {
		return getPersistence().updateImpl(cmapSubGroup);
	}

	/**
	* Returns the cmap sub group with the primary key or throws a {@link NoSuchCmapSubGroupException} if it could not be found.
	*
	* @param subGroupId the primary key of the cmap sub group
	* @return the cmap sub group
	* @throws NoSuchCmapSubGroupException if a cmap sub group with the primary key could not be found
	*/
	public static CmapSubGroup findByPrimaryKey(long subGroupId)
		throws contact.manager.service.exception.NoSuchCmapSubGroupException {
		return getPersistence().findByPrimaryKey(subGroupId);
	}

	/**
	* Returns the cmap sub group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subGroupId the primary key of the cmap sub group
	* @return the cmap sub group, or <code>null</code> if a cmap sub group with the primary key could not be found
	*/
	public static CmapSubGroup fetchByPrimaryKey(long subGroupId) {
		return getPersistence().fetchByPrimaryKey(subGroupId);
	}

	public static java.util.Map<java.io.Serializable, CmapSubGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the cmap sub groups.
	*
	* @return the cmap sub groups
	*/
	public static List<CmapSubGroup> findAll() {
		return getPersistence().findAll();
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
	public static List<CmapSubGroup> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<CmapSubGroup> findAll(int start, int end,
		OrderByComparator<CmapSubGroup> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<CmapSubGroup> findAll(int start, int end,
		OrderByComparator<CmapSubGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the cmap sub groups from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cmap sub groups.
	*
	* @return the number of cmap sub groups
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CmapSubGroupPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CmapSubGroupPersistence, CmapSubGroupPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CmapSubGroupPersistence.class);
}