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

import contact.manager.service.model.OutreachLog;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the outreach log service. This utility wraps {@link contact.manager.service.service.persistence.impl.OutreachLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OutreachLogPersistence
 * @see contact.manager.service.service.persistence.impl.OutreachLogPersistenceImpl
 * @generated
 */
@ProviderType
public class OutreachLogUtil {
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
	public static void clearCache(OutreachLog outreachLog) {
		getPersistence().clearCache(outreachLog);
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
	public static List<OutreachLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OutreachLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OutreachLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OutreachLog> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OutreachLog update(OutreachLog outreachLog) {
		return getPersistence().update(outreachLog);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OutreachLog update(OutreachLog outreachLog,
		ServiceContext serviceContext) {
		return getPersistence().update(outreachLog, serviceContext);
	}

	/**
	* Returns all the outreach logs where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @return the matching outreach logs
	*/
	public static List<OutreachLog> findByContactId(long contactId) {
		return getPersistence().findByContactId(contactId);
	}

	/**
	* Returns a range of all the outreach logs where contactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactId the contact ID
	* @param start the lower bound of the range of outreach logs
	* @param end the upper bound of the range of outreach logs (not inclusive)
	* @return the range of matching outreach logs
	*/
	public static List<OutreachLog> findByContactId(long contactId, int start,
		int end) {
		return getPersistence().findByContactId(contactId, start, end);
	}

	/**
	* Returns an ordered range of all the outreach logs where contactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactId the contact ID
	* @param start the lower bound of the range of outreach logs
	* @param end the upper bound of the range of outreach logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching outreach logs
	*/
	public static List<OutreachLog> findByContactId(long contactId, int start,
		int end, OrderByComparator<OutreachLog> orderByComparator) {
		return getPersistence()
				   .findByContactId(contactId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the outreach logs where contactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactId the contact ID
	* @param start the lower bound of the range of outreach logs
	* @param end the upper bound of the range of outreach logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching outreach logs
	*/
	public static List<OutreachLog> findByContactId(long contactId, int start,
		int end, OrderByComparator<OutreachLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByContactId(contactId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first outreach log in the ordered set where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching outreach log
	* @throws NoSuchOutreachLogException if a matching outreach log could not be found
	*/
	public static OutreachLog findByContactId_First(long contactId,
		OrderByComparator<OutreachLog> orderByComparator)
		throws contact.manager.service.exception.NoSuchOutreachLogException {
		return getPersistence()
				   .findByContactId_First(contactId, orderByComparator);
	}

	/**
	* Returns the first outreach log in the ordered set where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching outreach log, or <code>null</code> if a matching outreach log could not be found
	*/
	public static OutreachLog fetchByContactId_First(long contactId,
		OrderByComparator<OutreachLog> orderByComparator) {
		return getPersistence()
				   .fetchByContactId_First(contactId, orderByComparator);
	}

	/**
	* Returns the last outreach log in the ordered set where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching outreach log
	* @throws NoSuchOutreachLogException if a matching outreach log could not be found
	*/
	public static OutreachLog findByContactId_Last(long contactId,
		OrderByComparator<OutreachLog> orderByComparator)
		throws contact.manager.service.exception.NoSuchOutreachLogException {
		return getPersistence()
				   .findByContactId_Last(contactId, orderByComparator);
	}

	/**
	* Returns the last outreach log in the ordered set where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching outreach log, or <code>null</code> if a matching outreach log could not be found
	*/
	public static OutreachLog fetchByContactId_Last(long contactId,
		OrderByComparator<OutreachLog> orderByComparator) {
		return getPersistence()
				   .fetchByContactId_Last(contactId, orderByComparator);
	}

	/**
	* Returns the outreach logs before and after the current outreach log in the ordered set where contactId = &#63;.
	*
	* @param id the primary key of the current outreach log
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next outreach log
	* @throws NoSuchOutreachLogException if a outreach log with the primary key could not be found
	*/
	public static OutreachLog[] findByContactId_PrevAndNext(long id,
		long contactId, OrderByComparator<OutreachLog> orderByComparator)
		throws contact.manager.service.exception.NoSuchOutreachLogException {
		return getPersistence()
				   .findByContactId_PrevAndNext(id, contactId, orderByComparator);
	}

	/**
	* Removes all the outreach logs where contactId = &#63; from the database.
	*
	* @param contactId the contact ID
	*/
	public static void removeByContactId(long contactId) {
		getPersistence().removeByContactId(contactId);
	}

	/**
	* Returns the number of outreach logs where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @return the number of matching outreach logs
	*/
	public static int countByContactId(long contactId) {
		return getPersistence().countByContactId(contactId);
	}

	/**
	* Caches the outreach log in the entity cache if it is enabled.
	*
	* @param outreachLog the outreach log
	*/
	public static void cacheResult(OutreachLog outreachLog) {
		getPersistence().cacheResult(outreachLog);
	}

	/**
	* Caches the outreach logs in the entity cache if it is enabled.
	*
	* @param outreachLogs the outreach logs
	*/
	public static void cacheResult(List<OutreachLog> outreachLogs) {
		getPersistence().cacheResult(outreachLogs);
	}

	/**
	* Creates a new outreach log with the primary key. Does not add the outreach log to the database.
	*
	* @param id the primary key for the new outreach log
	* @return the new outreach log
	*/
	public static OutreachLog create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the outreach log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the outreach log
	* @return the outreach log that was removed
	* @throws NoSuchOutreachLogException if a outreach log with the primary key could not be found
	*/
	public static OutreachLog remove(long id)
		throws contact.manager.service.exception.NoSuchOutreachLogException {
		return getPersistence().remove(id);
	}

	public static OutreachLog updateImpl(OutreachLog outreachLog) {
		return getPersistence().updateImpl(outreachLog);
	}

	/**
	* Returns the outreach log with the primary key or throws a {@link NoSuchOutreachLogException} if it could not be found.
	*
	* @param id the primary key of the outreach log
	* @return the outreach log
	* @throws NoSuchOutreachLogException if a outreach log with the primary key could not be found
	*/
	public static OutreachLog findByPrimaryKey(long id)
		throws contact.manager.service.exception.NoSuchOutreachLogException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the outreach log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the outreach log
	* @return the outreach log, or <code>null</code> if a outreach log with the primary key could not be found
	*/
	public static OutreachLog fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, OutreachLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the outreach logs.
	*
	* @return the outreach logs
	*/
	public static List<OutreachLog> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the outreach logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of outreach logs
	* @param end the upper bound of the range of outreach logs (not inclusive)
	* @return the range of outreach logs
	*/
	public static List<OutreachLog> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the outreach logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of outreach logs
	* @param end the upper bound of the range of outreach logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of outreach logs
	*/
	public static List<OutreachLog> findAll(int start, int end,
		OrderByComparator<OutreachLog> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the outreach logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of outreach logs
	* @param end the upper bound of the range of outreach logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of outreach logs
	*/
	public static List<OutreachLog> findAll(int start, int end,
		OrderByComparator<OutreachLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the outreach logs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of outreach logs.
	*
	* @return the number of outreach logs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static OutreachLogPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OutreachLogPersistence, OutreachLogPersistence> _serviceTracker =
		ServiceTrackerFactory.open(OutreachLogPersistence.class);
}