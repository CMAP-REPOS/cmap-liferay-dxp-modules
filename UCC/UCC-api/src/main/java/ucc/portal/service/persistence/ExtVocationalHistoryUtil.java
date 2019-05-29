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

import ucc.portal.model.ExtVocationalHistory;

import java.util.List;

/**
 * The persistence utility for the ext vocational history service. This utility wraps {@link ucc.portal.service.persistence.impl.ExtVocationalHistoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtVocationalHistoryPersistence
 * @see ucc.portal.service.persistence.impl.ExtVocationalHistoryPersistenceImpl
 * @generated
 */
@ProviderType
public class ExtVocationalHistoryUtil {
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
	public static void clearCache(ExtVocationalHistory extVocationalHistory) {
		getPersistence().clearCache(extVocationalHistory);
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
	public static List<ExtVocationalHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExtVocationalHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExtVocationalHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExtVocationalHistory> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExtVocationalHistory update(
		ExtVocationalHistory extVocationalHistory) {
		return getPersistence().update(extVocationalHistory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExtVocationalHistory update(
		ExtVocationalHistory extVocationalHistory, ServiceContext serviceContext) {
		return getPersistence().update(extVocationalHistory, serviceContext);
	}

	/**
	* Returns all the ext vocational histories where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext vocational histories
	*/
	public static List<ExtVocationalHistory> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the ext vocational histories where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @return the range of matching ext vocational histories
	*/
	public static List<ExtVocationalHistory> findByUserId(long userId,
		int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the ext vocational histories where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext vocational histories
	*/
	public static List<ExtVocationalHistory> findByUserId(long userId,
		int start, int end,
		OrderByComparator<ExtVocationalHistory> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ext vocational histories where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext vocational histories
	*/
	public static List<ExtVocationalHistory> findByUserId(long userId,
		int start, int end,
		OrderByComparator<ExtVocationalHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ext vocational history in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext vocational history
	* @throws NoSuchExtVocationalHistoryException if a matching ext vocational history could not be found
	*/
	public static ExtVocationalHistory findByUserId_First(long userId,
		OrderByComparator<ExtVocationalHistory> orderByComparator)
		throws ucc.portal.exception.NoSuchExtVocationalHistoryException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first ext vocational history in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext vocational history, or <code>null</code> if a matching ext vocational history could not be found
	*/
	public static ExtVocationalHistory fetchByUserId_First(long userId,
		OrderByComparator<ExtVocationalHistory> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last ext vocational history in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext vocational history
	* @throws NoSuchExtVocationalHistoryException if a matching ext vocational history could not be found
	*/
	public static ExtVocationalHistory findByUserId_Last(long userId,
		OrderByComparator<ExtVocationalHistory> orderByComparator)
		throws ucc.portal.exception.NoSuchExtVocationalHistoryException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last ext vocational history in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext vocational history, or <code>null</code> if a matching ext vocational history could not be found
	*/
	public static ExtVocationalHistory fetchByUserId_Last(long userId,
		OrderByComparator<ExtVocationalHistory> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the ext vocational histories before and after the current ext vocational history in the ordered set where userId = &#63;.
	*
	* @param extVocationalHistoryId the primary key of the current ext vocational history
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext vocational history
	* @throws NoSuchExtVocationalHistoryException if a ext vocational history with the primary key could not be found
	*/
	public static ExtVocationalHistory[] findByUserId_PrevAndNext(
		long extVocationalHistoryId, long userId,
		OrderByComparator<ExtVocationalHistory> orderByComparator)
		throws ucc.portal.exception.NoSuchExtVocationalHistoryException {
		return getPersistence()
				   .findByUserId_PrevAndNext(extVocationalHistoryId, userId,
			orderByComparator);
	}

	/**
	* Removes all the ext vocational histories where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of ext vocational histories where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext vocational histories
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Caches the ext vocational history in the entity cache if it is enabled.
	*
	* @param extVocationalHistory the ext vocational history
	*/
	public static void cacheResult(ExtVocationalHistory extVocationalHistory) {
		getPersistence().cacheResult(extVocationalHistory);
	}

	/**
	* Caches the ext vocational histories in the entity cache if it is enabled.
	*
	* @param extVocationalHistories the ext vocational histories
	*/
	public static void cacheResult(
		List<ExtVocationalHistory> extVocationalHistories) {
		getPersistence().cacheResult(extVocationalHistories);
	}

	/**
	* Creates a new ext vocational history with the primary key. Does not add the ext vocational history to the database.
	*
	* @param extVocationalHistoryId the primary key for the new ext vocational history
	* @return the new ext vocational history
	*/
	public static ExtVocationalHistory create(long extVocationalHistoryId) {
		return getPersistence().create(extVocationalHistoryId);
	}

	/**
	* Removes the ext vocational history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extVocationalHistoryId the primary key of the ext vocational history
	* @return the ext vocational history that was removed
	* @throws NoSuchExtVocationalHistoryException if a ext vocational history with the primary key could not be found
	*/
	public static ExtVocationalHistory remove(long extVocationalHistoryId)
		throws ucc.portal.exception.NoSuchExtVocationalHistoryException {
		return getPersistence().remove(extVocationalHistoryId);
	}

	public static ExtVocationalHistory updateImpl(
		ExtVocationalHistory extVocationalHistory) {
		return getPersistence().updateImpl(extVocationalHistory);
	}

	/**
	* Returns the ext vocational history with the primary key or throws a {@link NoSuchExtVocationalHistoryException} if it could not be found.
	*
	* @param extVocationalHistoryId the primary key of the ext vocational history
	* @return the ext vocational history
	* @throws NoSuchExtVocationalHistoryException if a ext vocational history with the primary key could not be found
	*/
	public static ExtVocationalHistory findByPrimaryKey(
		long extVocationalHistoryId)
		throws ucc.portal.exception.NoSuchExtVocationalHistoryException {
		return getPersistence().findByPrimaryKey(extVocationalHistoryId);
	}

	/**
	* Returns the ext vocational history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extVocationalHistoryId the primary key of the ext vocational history
	* @return the ext vocational history, or <code>null</code> if a ext vocational history with the primary key could not be found
	*/
	public static ExtVocationalHistory fetchByPrimaryKey(
		long extVocationalHistoryId) {
		return getPersistence().fetchByPrimaryKey(extVocationalHistoryId);
	}

	public static java.util.Map<java.io.Serializable, ExtVocationalHistory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ext vocational histories.
	*
	* @return the ext vocational histories
	*/
	public static List<ExtVocationalHistory> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ext vocational histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @return the range of ext vocational histories
	*/
	public static List<ExtVocationalHistory> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ext vocational histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext vocational histories
	*/
	public static List<ExtVocationalHistory> findAll(int start, int end,
		OrderByComparator<ExtVocationalHistory> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ext vocational histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ext vocational histories
	*/
	public static List<ExtVocationalHistory> findAll(int start, int end,
		OrderByComparator<ExtVocationalHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ext vocational histories from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ext vocational histories.
	*
	* @return the number of ext vocational histories
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExtVocationalHistoryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ExtVocationalHistoryPersistence, ExtVocationalHistoryPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ExtVocationalHistoryPersistence.class);

		ServiceTracker<ExtVocationalHistoryPersistence, ExtVocationalHistoryPersistence> serviceTracker =
			new ServiceTracker<ExtVocationalHistoryPersistence, ExtVocationalHistoryPersistence>(bundle.getBundleContext(),
				ExtVocationalHistoryPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}