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

package contact.manager.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.model.CrmGroup;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM Group service. This utility wraps {@link contact.manager.service.persistence.impl.CrmGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmGroupPersistence
 * @see contact.manager.service.persistence.impl.CrmGroupPersistenceImpl
 * @generated
 */
@ProviderType
public class CrmGroupUtil {
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
	public static void clearCache(CrmGroup crmGroup) {
		getPersistence().clearCache(crmGroup);
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
	public static List<CrmGroup> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmGroup> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmGroup update(CrmGroup crmGroup) {
		return getPersistence().update(crmGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmGroup update(CrmGroup crmGroup,
		ServiceContext serviceContext) {
		return getPersistence().update(crmGroup, serviceContext);
	}

	/**
	* Caches the CRM Group in the entity cache if it is enabled.
	*
	* @param crmGroup the CRM Group
	*/
	public static void cacheResult(CrmGroup crmGroup) {
		getPersistence().cacheResult(crmGroup);
	}

	/**
	* Caches the CRM Groups in the entity cache if it is enabled.
	*
	* @param crmGroups the CRM Groups
	*/
	public static void cacheResult(List<CrmGroup> crmGroups) {
		getPersistence().cacheResult(crmGroups);
	}

	/**
	* Creates a new CRM Group with the primary key. Does not add the CRM Group to the database.
	*
	* @param crmGroupId the primary key for the new CRM Group
	* @return the new CRM Group
	*/
	public static CrmGroup create(long crmGroupId) {
		return getPersistence().create(crmGroupId);
	}

	/**
	* Removes the CRM Group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmGroupId the primary key of the CRM Group
	* @return the CRM Group that was removed
	* @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	*/
	public static CrmGroup remove(long crmGroupId)
		throws contact.manager.exception.NoSuchCrmGroupException {
		return getPersistence().remove(crmGroupId);
	}

	public static CrmGroup updateImpl(CrmGroup crmGroup) {
		return getPersistence().updateImpl(crmGroup);
	}

	/**
	* Returns the CRM Group with the primary key or throws a {@link NoSuchCrmGroupException} if it could not be found.
	*
	* @param crmGroupId the primary key of the CRM Group
	* @return the CRM Group
	* @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	*/
	public static CrmGroup findByPrimaryKey(long crmGroupId)
		throws contact.manager.exception.NoSuchCrmGroupException {
		return getPersistence().findByPrimaryKey(crmGroupId);
	}

	/**
	* Returns the CRM Group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmGroupId the primary key of the CRM Group
	* @return the CRM Group, or <code>null</code> if a CRM Group with the primary key could not be found
	*/
	public static CrmGroup fetchByPrimaryKey(long crmGroupId) {
		return getPersistence().fetchByPrimaryKey(crmGroupId);
	}

	public static java.util.Map<java.io.Serializable, CrmGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM Groups.
	*
	* @return the CRM Groups
	*/
	public static List<CrmGroup> findAll() {
		return getPersistence().findAll();
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
	public static List<CrmGroup> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<CrmGroup> findAll(int start, int end,
		OrderByComparator<CrmGroup> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<CrmGroup> findAll(int start, int end,
		OrderByComparator<CrmGroup> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM Groups from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM Groups.
	*
	* @return the number of CRM Groups
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CrmGroupPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmGroupPersistence, CrmGroupPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CrmGroupPersistence.class);
}