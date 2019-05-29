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

package ucc.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import ucc.portal.model.ExtKeyAccomplishment;

import java.util.List;

/**
 * The persistence utility for the ext key accomplishment service. This utility wraps {@link ucc.portal.service.persistence.impl.ExtKeyAccomplishmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtKeyAccomplishmentPersistence
 * @see ucc.portal.service.persistence.impl.ExtKeyAccomplishmentPersistenceImpl
 * @generated
 */
@ProviderType
public class ExtKeyAccomplishmentUtil {
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
	public static void clearCache(ExtKeyAccomplishment extKeyAccomplishment) {
		getPersistence().clearCache(extKeyAccomplishment);
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
	public static List<ExtKeyAccomplishment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExtKeyAccomplishment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExtKeyAccomplishment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExtKeyAccomplishment update(
		ExtKeyAccomplishment extKeyAccomplishment) {
		return getPersistence().update(extKeyAccomplishment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExtKeyAccomplishment update(
		ExtKeyAccomplishment extKeyAccomplishment, ServiceContext serviceContext) {
		return getPersistence().update(extKeyAccomplishment, serviceContext);
	}

	/**
	* Returns all the ext key accomplishments where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext key accomplishments
	*/
	public static List<ExtKeyAccomplishment> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the ext key accomplishments where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @return the range of matching ext key accomplishments
	*/
	public static List<ExtKeyAccomplishment> findByUserId(long userId,
		int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the ext key accomplishments where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext key accomplishments
	*/
	public static List<ExtKeyAccomplishment> findByUserId(long userId,
		int start, int end,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ext key accomplishments where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext key accomplishments
	*/
	public static List<ExtKeyAccomplishment> findByUserId(long userId,
		int start, int end,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ext key accomplishment in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext key accomplishment
	* @throws NoSuchExtKeyAccomplishmentException if a matching ext key accomplishment could not be found
	*/
	public static ExtKeyAccomplishment findByUserId_First(long userId,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator)
		throws ucc.portal.exception.NoSuchExtKeyAccomplishmentException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first ext key accomplishment in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext key accomplishment, or <code>null</code> if a matching ext key accomplishment could not be found
	*/
	public static ExtKeyAccomplishment fetchByUserId_First(long userId,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last ext key accomplishment in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext key accomplishment
	* @throws NoSuchExtKeyAccomplishmentException if a matching ext key accomplishment could not be found
	*/
	public static ExtKeyAccomplishment findByUserId_Last(long userId,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator)
		throws ucc.portal.exception.NoSuchExtKeyAccomplishmentException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last ext key accomplishment in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext key accomplishment, or <code>null</code> if a matching ext key accomplishment could not be found
	*/
	public static ExtKeyAccomplishment fetchByUserId_Last(long userId,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the ext key accomplishments before and after the current ext key accomplishment in the ordered set where userId = &#63;.
	*
	* @param extKeyAccomplishmentId the primary key of the current ext key accomplishment
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext key accomplishment
	* @throws NoSuchExtKeyAccomplishmentException if a ext key accomplishment with the primary key could not be found
	*/
	public static ExtKeyAccomplishment[] findByUserId_PrevAndNext(
		long extKeyAccomplishmentId, long userId,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator)
		throws ucc.portal.exception.NoSuchExtKeyAccomplishmentException {
		return getPersistence()
				   .findByUserId_PrevAndNext(extKeyAccomplishmentId, userId,
			orderByComparator);
	}

	/**
	* Removes all the ext key accomplishments where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of ext key accomplishments where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext key accomplishments
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Caches the ext key accomplishment in the entity cache if it is enabled.
	*
	* @param extKeyAccomplishment the ext key accomplishment
	*/
	public static void cacheResult(ExtKeyAccomplishment extKeyAccomplishment) {
		getPersistence().cacheResult(extKeyAccomplishment);
	}

	/**
	* Caches the ext key accomplishments in the entity cache if it is enabled.
	*
	* @param extKeyAccomplishments the ext key accomplishments
	*/
	public static void cacheResult(
		List<ExtKeyAccomplishment> extKeyAccomplishments) {
		getPersistence().cacheResult(extKeyAccomplishments);
	}

	/**
	* Creates a new ext key accomplishment with the primary key. Does not add the ext key accomplishment to the database.
	*
	* @param extKeyAccomplishmentId the primary key for the new ext key accomplishment
	* @return the new ext key accomplishment
	*/
	public static ExtKeyAccomplishment create(long extKeyAccomplishmentId) {
		return getPersistence().create(extKeyAccomplishmentId);
	}

	/**
	* Removes the ext key accomplishment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extKeyAccomplishmentId the primary key of the ext key accomplishment
	* @return the ext key accomplishment that was removed
	* @throws NoSuchExtKeyAccomplishmentException if a ext key accomplishment with the primary key could not be found
	*/
	public static ExtKeyAccomplishment remove(long extKeyAccomplishmentId)
		throws ucc.portal.exception.NoSuchExtKeyAccomplishmentException {
		return getPersistence().remove(extKeyAccomplishmentId);
	}

	public static ExtKeyAccomplishment updateImpl(
		ExtKeyAccomplishment extKeyAccomplishment) {
		return getPersistence().updateImpl(extKeyAccomplishment);
	}

	/**
	* Returns the ext key accomplishment with the primary key or throws a {@link NoSuchExtKeyAccomplishmentException} if it could not be found.
	*
	* @param extKeyAccomplishmentId the primary key of the ext key accomplishment
	* @return the ext key accomplishment
	* @throws NoSuchExtKeyAccomplishmentException if a ext key accomplishment with the primary key could not be found
	*/
	public static ExtKeyAccomplishment findByPrimaryKey(
		long extKeyAccomplishmentId)
		throws ucc.portal.exception.NoSuchExtKeyAccomplishmentException {
		return getPersistence().findByPrimaryKey(extKeyAccomplishmentId);
	}

	/**
	* Returns the ext key accomplishment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extKeyAccomplishmentId the primary key of the ext key accomplishment
	* @return the ext key accomplishment, or <code>null</code> if a ext key accomplishment with the primary key could not be found
	*/
	public static ExtKeyAccomplishment fetchByPrimaryKey(
		long extKeyAccomplishmentId) {
		return getPersistence().fetchByPrimaryKey(extKeyAccomplishmentId);
	}

	public static java.util.Map<java.io.Serializable, ExtKeyAccomplishment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ext key accomplishments.
	*
	* @return the ext key accomplishments
	*/
	public static List<ExtKeyAccomplishment> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ext key accomplishments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @return the range of ext key accomplishments
	*/
	public static List<ExtKeyAccomplishment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ext key accomplishments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext key accomplishments
	*/
	public static List<ExtKeyAccomplishment> findAll(int start, int end,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ext key accomplishments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ext key accomplishments
	*/
	public static List<ExtKeyAccomplishment> findAll(int start, int end,
		OrderByComparator<ExtKeyAccomplishment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ext key accomplishments from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ext key accomplishments.
	*
	* @return the number of ext key accomplishments
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExtKeyAccomplishmentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ExtKeyAccomplishmentPersistence, ExtKeyAccomplishmentPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ExtKeyAccomplishmentPersistence.class);

		ServiceTracker<ExtKeyAccomplishmentPersistence, ExtKeyAccomplishmentPersistence> serviceTracker =
			new ServiceTracker<ExtKeyAccomplishmentPersistence, ExtKeyAccomplishmentPersistence>(bundle.getBundleContext(),
				ExtKeyAccomplishmentPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}