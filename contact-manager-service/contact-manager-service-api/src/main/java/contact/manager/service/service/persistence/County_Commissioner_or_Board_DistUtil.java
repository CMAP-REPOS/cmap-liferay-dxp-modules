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

import contact.manager.service.model.County_Commissioner_or_Board_Dist;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the county_ commissioner_or_ board_ dist service. This utility wraps {@link contact.manager.service.service.persistence.impl.County_Commissioner_or_Board_DistPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see County_Commissioner_or_Board_DistPersistence
 * @see contact.manager.service.service.persistence.impl.County_Commissioner_or_Board_DistPersistenceImpl
 * @generated
 */
@ProviderType
public class County_Commissioner_or_Board_DistUtil {
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
	public static void clearCache(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		getPersistence().clearCache(county_Commissioner_or_Board_Dist);
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
	public static List<County_Commissioner_or_Board_Dist> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<County_Commissioner_or_Board_Dist> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<County_Commissioner_or_Board_Dist> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static County_Commissioner_or_Board_Dist update(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		return getPersistence().update(county_Commissioner_or_Board_Dist);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static County_Commissioner_or_Board_Dist update(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(county_Commissioner_or_Board_Dist, serviceContext);
	}

	/**
	* Caches the county_ commissioner_or_ board_ dist in the entity cache if it is enabled.
	*
	* @param county_Commissioner_or_Board_Dist the county_ commissioner_or_ board_ dist
	*/
	public static void cacheResult(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		getPersistence().cacheResult(county_Commissioner_or_Board_Dist);
	}

	/**
	* Caches the county_ commissioner_or_ board_ dists in the entity cache if it is enabled.
	*
	* @param county_Commissioner_or_Board_Dists the county_ commissioner_or_ board_ dists
	*/
	public static void cacheResult(
		List<County_Commissioner_or_Board_Dist> county_Commissioner_or_Board_Dists) {
		getPersistence().cacheResult(county_Commissioner_or_Board_Dists);
	}

	/**
	* Creates a new county_ commissioner_or_ board_ dist with the primary key. Does not add the county_ commissioner_or_ board_ dist to the database.
	*
	* @param ccbdId the primary key for the new county_ commissioner_or_ board_ dist
	* @return the new county_ commissioner_or_ board_ dist
	*/
	public static County_Commissioner_or_Board_Dist create(long ccbdId) {
		return getPersistence().create(ccbdId);
	}

	/**
	* Removes the county_ commissioner_or_ board_ dist with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist that was removed
	* @throws NoSuchCounty_Commissioner_or_Board_DistException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	*/
	public static County_Commissioner_or_Board_Dist remove(long ccbdId)
		throws contact.manager.service.exception.NoSuchCounty_Commissioner_or_Board_DistException {
		return getPersistence().remove(ccbdId);
	}

	public static County_Commissioner_or_Board_Dist updateImpl(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		return getPersistence().updateImpl(county_Commissioner_or_Board_Dist);
	}

	/**
	* Returns the county_ commissioner_or_ board_ dist with the primary key or throws a {@link NoSuchCounty_Commissioner_or_Board_DistException} if it could not be found.
	*
	* @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist
	* @throws NoSuchCounty_Commissioner_or_Board_DistException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	*/
	public static County_Commissioner_or_Board_Dist findByPrimaryKey(
		long ccbdId)
		throws contact.manager.service.exception.NoSuchCounty_Commissioner_or_Board_DistException {
		return getPersistence().findByPrimaryKey(ccbdId);
	}

	/**
	* Returns the county_ commissioner_or_ board_ dist with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist, or <code>null</code> if a county_ commissioner_or_ board_ dist with the primary key could not be found
	*/
	public static County_Commissioner_or_Board_Dist fetchByPrimaryKey(
		long ccbdId) {
		return getPersistence().fetchByPrimaryKey(ccbdId);
	}

	public static java.util.Map<java.io.Serializable, County_Commissioner_or_Board_Dist> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the county_ commissioner_or_ board_ dists.
	*
	* @return the county_ commissioner_or_ board_ dists
	*/
	public static List<County_Commissioner_or_Board_Dist> findAll() {
		return getPersistence().findAll();
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
	public static List<County_Commissioner_or_Board_Dist> findAll(int start,
		int end) {
		return getPersistence().findAll(start, end);
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
	public static List<County_Commissioner_or_Board_Dist> findAll(int start,
		int end,
		OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<County_Commissioner_or_Board_Dist> findAll(int start,
		int end,
		OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the county_ commissioner_or_ board_ dists from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of county_ commissioner_or_ board_ dists.
	*
	* @return the number of county_ commissioner_or_ board_ dists
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static County_Commissioner_or_Board_DistPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<County_Commissioner_or_Board_DistPersistence, County_Commissioner_or_Board_DistPersistence> _serviceTracker =
		ServiceTrackerFactory.open(County_Commissioner_or_Board_DistPersistence.class);
}