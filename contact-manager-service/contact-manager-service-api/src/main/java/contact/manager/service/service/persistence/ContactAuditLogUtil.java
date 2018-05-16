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

import contact.manager.service.model.ContactAuditLog;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the contact audit log service. This utility wraps {@link contact.manager.service.service.persistence.impl.ContactAuditLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLogPersistence
 * @see contact.manager.service.service.persistence.impl.ContactAuditLogPersistenceImpl
 * @generated
 */
@ProviderType
public class ContactAuditLogUtil {
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
	public static void clearCache(ContactAuditLog contactAuditLog) {
		getPersistence().clearCache(contactAuditLog);
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
	public static List<ContactAuditLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ContactAuditLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ContactAuditLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ContactAuditLog> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ContactAuditLog update(ContactAuditLog contactAuditLog) {
		return getPersistence().update(contactAuditLog);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ContactAuditLog update(ContactAuditLog contactAuditLog,
		ServiceContext serviceContext) {
		return getPersistence().update(contactAuditLog, serviceContext);
	}

	/**
	* Caches the contact audit log in the entity cache if it is enabled.
	*
	* @param contactAuditLog the contact audit log
	*/
	public static void cacheResult(ContactAuditLog contactAuditLog) {
		getPersistence().cacheResult(contactAuditLog);
	}

	/**
	* Caches the contact audit logs in the entity cache if it is enabled.
	*
	* @param contactAuditLogs the contact audit logs
	*/
	public static void cacheResult(List<ContactAuditLog> contactAuditLogs) {
		getPersistence().cacheResult(contactAuditLogs);
	}

	/**
	* Creates a new contact audit log with the primary key. Does not add the contact audit log to the database.
	*
	* @param contactAuditLogId the primary key for the new contact audit log
	* @return the new contact audit log
	*/
	public static ContactAuditLog create(long contactAuditLogId) {
		return getPersistence().create(contactAuditLogId);
	}

	/**
	* Removes the contact audit log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogId the primary key of the contact audit log
	* @return the contact audit log that was removed
	* @throws NoSuchContactAuditLogException if a contact audit log with the primary key could not be found
	*/
	public static ContactAuditLog remove(long contactAuditLogId)
		throws contact.manager.service.exception.NoSuchContactAuditLogException {
		return getPersistence().remove(contactAuditLogId);
	}

	public static ContactAuditLog updateImpl(ContactAuditLog contactAuditLog) {
		return getPersistence().updateImpl(contactAuditLog);
	}

	/**
	* Returns the contact audit log with the primary key or throws a {@link NoSuchContactAuditLogException} if it could not be found.
	*
	* @param contactAuditLogId the primary key of the contact audit log
	* @return the contact audit log
	* @throws NoSuchContactAuditLogException if a contact audit log with the primary key could not be found
	*/
	public static ContactAuditLog findByPrimaryKey(long contactAuditLogId)
		throws contact.manager.service.exception.NoSuchContactAuditLogException {
		return getPersistence().findByPrimaryKey(contactAuditLogId);
	}

	/**
	* Returns the contact audit log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param contactAuditLogId the primary key of the contact audit log
	* @return the contact audit log, or <code>null</code> if a contact audit log with the primary key could not be found
	*/
	public static ContactAuditLog fetchByPrimaryKey(long contactAuditLogId) {
		return getPersistence().fetchByPrimaryKey(contactAuditLogId);
	}

	public static java.util.Map<java.io.Serializable, ContactAuditLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the contact audit logs.
	*
	* @return the contact audit logs
	*/
	public static List<ContactAuditLog> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the contact audit logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @return the range of contact audit logs
	*/
	public static List<ContactAuditLog> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the contact audit logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contact audit logs
	*/
	public static List<ContactAuditLog> findAll(int start, int end,
		OrderByComparator<ContactAuditLog> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the contact audit logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of contact audit logs
	*/
	public static List<ContactAuditLog> findAll(int start, int end,
		OrderByComparator<ContactAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the contact audit logs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of contact audit logs.
	*
	* @return the number of contact audit logs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ContactAuditLogPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContactAuditLogPersistence, ContactAuditLogPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ContactAuditLogPersistence.class);
}