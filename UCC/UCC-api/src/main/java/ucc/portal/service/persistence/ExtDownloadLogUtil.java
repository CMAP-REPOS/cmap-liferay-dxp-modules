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

import ucc.portal.model.ExtDownloadLog;

import java.util.Date;
import java.util.List;

/**
 * The persistence utility for the ext download log service. This utility wraps {@link ucc.portal.service.persistence.impl.ExtDownloadLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtDownloadLogPersistence
 * @see ucc.portal.service.persistence.impl.ExtDownloadLogPersistenceImpl
 * @generated
 */
@ProviderType
public class ExtDownloadLogUtil {
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
	public static void clearCache(ExtDownloadLog extDownloadLog) {
		getPersistence().clearCache(extDownloadLog);
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
	public static List<ExtDownloadLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExtDownloadLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExtDownloadLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExtDownloadLog> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExtDownloadLog update(ExtDownloadLog extDownloadLog) {
		return getPersistence().update(extDownloadLog);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExtDownloadLog update(ExtDownloadLog extDownloadLog,
		ServiceContext serviceContext) {
		return getPersistence().update(extDownloadLog, serviceContext);
	}

	/**
	* Returns all the ext download logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext download logs
	*/
	public static List<ExtDownloadLog> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the ext download logs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @return the range of matching ext download logs
	*/
	public static List<ExtDownloadLog> findByUserId(long userId, int start,
		int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the ext download logs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext download logs
	*/
	public static List<ExtDownloadLog> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtDownloadLog> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ext download logs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext download logs
	*/
	public static List<ExtDownloadLog> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtDownloadLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ext download log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext download log
	* @throws NoSuchExtDownloadLogException if a matching ext download log could not be found
	*/
	public static ExtDownloadLog findByUserId_First(long userId,
		OrderByComparator<ExtDownloadLog> orderByComparator)
		throws ucc.portal.exception.NoSuchExtDownloadLogException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first ext download log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext download log, or <code>null</code> if a matching ext download log could not be found
	*/
	public static ExtDownloadLog fetchByUserId_First(long userId,
		OrderByComparator<ExtDownloadLog> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last ext download log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext download log
	* @throws NoSuchExtDownloadLogException if a matching ext download log could not be found
	*/
	public static ExtDownloadLog findByUserId_Last(long userId,
		OrderByComparator<ExtDownloadLog> orderByComparator)
		throws ucc.portal.exception.NoSuchExtDownloadLogException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last ext download log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext download log, or <code>null</code> if a matching ext download log could not be found
	*/
	public static ExtDownloadLog fetchByUserId_Last(long userId,
		OrderByComparator<ExtDownloadLog> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the ext download logs before and after the current ext download log in the ordered set where userId = &#63;.
	*
	* @param extDownloadLogId the primary key of the current ext download log
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext download log
	* @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	*/
	public static ExtDownloadLog[] findByUserId_PrevAndNext(
		long extDownloadLogId, long userId,
		OrderByComparator<ExtDownloadLog> orderByComparator)
		throws ucc.portal.exception.NoSuchExtDownloadLogException {
		return getPersistence()
				   .findByUserId_PrevAndNext(extDownloadLogId, userId,
			orderByComparator);
	}

	/**
	* Removes all the ext download logs where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of ext download logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext download logs
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the ext download logs where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @return the matching ext download logs
	*/
	public static List<ExtDownloadLog> findByU_W(long userId,
		Date withdrawalDate) {
		return getPersistence().findByU_W(userId, withdrawalDate);
	}

	/**
	* Returns a range of all the ext download logs where userId = &#63; and withdrawalDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @return the range of matching ext download logs
	*/
	public static List<ExtDownloadLog> findByU_W(long userId,
		Date withdrawalDate, int start, int end) {
		return getPersistence().findByU_W(userId, withdrawalDate, start, end);
	}

	/**
	* Returns an ordered range of all the ext download logs where userId = &#63; and withdrawalDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext download logs
	*/
	public static List<ExtDownloadLog> findByU_W(long userId,
		Date withdrawalDate, int start, int end,
		OrderByComparator<ExtDownloadLog> orderByComparator) {
		return getPersistence()
				   .findByU_W(userId, withdrawalDate, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the ext download logs where userId = &#63; and withdrawalDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext download logs
	*/
	public static List<ExtDownloadLog> findByU_W(long userId,
		Date withdrawalDate, int start, int end,
		OrderByComparator<ExtDownloadLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByU_W(userId, withdrawalDate, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext download log
	* @throws NoSuchExtDownloadLogException if a matching ext download log could not be found
	*/
	public static ExtDownloadLog findByU_W_First(long userId,
		Date withdrawalDate, OrderByComparator<ExtDownloadLog> orderByComparator)
		throws ucc.portal.exception.NoSuchExtDownloadLogException {
		return getPersistence()
				   .findByU_W_First(userId, withdrawalDate, orderByComparator);
	}

	/**
	* Returns the first ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext download log, or <code>null</code> if a matching ext download log could not be found
	*/
	public static ExtDownloadLog fetchByU_W_First(long userId,
		Date withdrawalDate, OrderByComparator<ExtDownloadLog> orderByComparator) {
		return getPersistence()
				   .fetchByU_W_First(userId, withdrawalDate, orderByComparator);
	}

	/**
	* Returns the last ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext download log
	* @throws NoSuchExtDownloadLogException if a matching ext download log could not be found
	*/
	public static ExtDownloadLog findByU_W_Last(long userId,
		Date withdrawalDate, OrderByComparator<ExtDownloadLog> orderByComparator)
		throws ucc.portal.exception.NoSuchExtDownloadLogException {
		return getPersistence()
				   .findByU_W_Last(userId, withdrawalDate, orderByComparator);
	}

	/**
	* Returns the last ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext download log, or <code>null</code> if a matching ext download log could not be found
	*/
	public static ExtDownloadLog fetchByU_W_Last(long userId,
		Date withdrawalDate, OrderByComparator<ExtDownloadLog> orderByComparator) {
		return getPersistence()
				   .fetchByU_W_Last(userId, withdrawalDate, orderByComparator);
	}

	/**
	* Returns the ext download logs before and after the current ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param extDownloadLogId the primary key of the current ext download log
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext download log
	* @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	*/
	public static ExtDownloadLog[] findByU_W_PrevAndNext(
		long extDownloadLogId, long userId, Date withdrawalDate,
		OrderByComparator<ExtDownloadLog> orderByComparator)
		throws ucc.portal.exception.NoSuchExtDownloadLogException {
		return getPersistence()
				   .findByU_W_PrevAndNext(extDownloadLogId, userId,
			withdrawalDate, orderByComparator);
	}

	/**
	* Removes all the ext download logs where userId = &#63; and withdrawalDate = &#63; from the database.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	*/
	public static void removeByU_W(long userId, Date withdrawalDate) {
		getPersistence().removeByU_W(userId, withdrawalDate);
	}

	/**
	* Returns the number of ext download logs where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @return the number of matching ext download logs
	*/
	public static int countByU_W(long userId, Date withdrawalDate) {
		return getPersistence().countByU_W(userId, withdrawalDate);
	}

	/**
	* Caches the ext download log in the entity cache if it is enabled.
	*
	* @param extDownloadLog the ext download log
	*/
	public static void cacheResult(ExtDownloadLog extDownloadLog) {
		getPersistence().cacheResult(extDownloadLog);
	}

	/**
	* Caches the ext download logs in the entity cache if it is enabled.
	*
	* @param extDownloadLogs the ext download logs
	*/
	public static void cacheResult(List<ExtDownloadLog> extDownloadLogs) {
		getPersistence().cacheResult(extDownloadLogs);
	}

	/**
	* Creates a new ext download log with the primary key. Does not add the ext download log to the database.
	*
	* @param extDownloadLogId the primary key for the new ext download log
	* @return the new ext download log
	*/
	public static ExtDownloadLog create(long extDownloadLogId) {
		return getPersistence().create(extDownloadLogId);
	}

	/**
	* Removes the ext download log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extDownloadLogId the primary key of the ext download log
	* @return the ext download log that was removed
	* @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	*/
	public static ExtDownloadLog remove(long extDownloadLogId)
		throws ucc.portal.exception.NoSuchExtDownloadLogException {
		return getPersistence().remove(extDownloadLogId);
	}

	public static ExtDownloadLog updateImpl(ExtDownloadLog extDownloadLog) {
		return getPersistence().updateImpl(extDownloadLog);
	}

	/**
	* Returns the ext download log with the primary key or throws a {@link NoSuchExtDownloadLogException} if it could not be found.
	*
	* @param extDownloadLogId the primary key of the ext download log
	* @return the ext download log
	* @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	*/
	public static ExtDownloadLog findByPrimaryKey(long extDownloadLogId)
		throws ucc.portal.exception.NoSuchExtDownloadLogException {
		return getPersistence().findByPrimaryKey(extDownloadLogId);
	}

	/**
	* Returns the ext download log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extDownloadLogId the primary key of the ext download log
	* @return the ext download log, or <code>null</code> if a ext download log with the primary key could not be found
	*/
	public static ExtDownloadLog fetchByPrimaryKey(long extDownloadLogId) {
		return getPersistence().fetchByPrimaryKey(extDownloadLogId);
	}

	public static java.util.Map<java.io.Serializable, ExtDownloadLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ext download logs.
	*
	* @return the ext download logs
	*/
	public static List<ExtDownloadLog> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ext download logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @return the range of ext download logs
	*/
	public static List<ExtDownloadLog> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ext download logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext download logs
	*/
	public static List<ExtDownloadLog> findAll(int start, int end,
		OrderByComparator<ExtDownloadLog> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ext download logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ext download logs
	*/
	public static List<ExtDownloadLog> findAll(int start, int end,
		OrderByComparator<ExtDownloadLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ext download logs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ext download logs.
	*
	* @return the number of ext download logs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExtDownloadLogPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ExtDownloadLogPersistence, ExtDownloadLogPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ExtDownloadLogPersistence.class);

		ServiceTracker<ExtDownloadLogPersistence, ExtDownloadLogPersistence> serviceTracker =
			new ServiceTracker<ExtDownloadLogPersistence, ExtDownloadLogPersistence>(bundle.getBundleContext(),
				ExtDownloadLogPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}