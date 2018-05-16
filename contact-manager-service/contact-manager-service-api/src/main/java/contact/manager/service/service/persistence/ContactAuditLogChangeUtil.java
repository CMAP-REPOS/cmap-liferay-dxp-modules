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

import contact.manager.service.model.ContactAuditLogChange;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the contact audit log change service. This utility wraps {@link contact.manager.service.service.persistence.impl.ContactAuditLogChangePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLogChangePersistence
 * @see contact.manager.service.service.persistence.impl.ContactAuditLogChangePersistenceImpl
 * @generated
 */
@ProviderType
public class ContactAuditLogChangeUtil {
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
	public static void clearCache(ContactAuditLogChange contactAuditLogChange) {
		getPersistence().clearCache(contactAuditLogChange);
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
	public static List<ContactAuditLogChange> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ContactAuditLogChange> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ContactAuditLogChange> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ContactAuditLogChange> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ContactAuditLogChange update(
		ContactAuditLogChange contactAuditLogChange) {
		return getPersistence().update(contactAuditLogChange);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ContactAuditLogChange update(
		ContactAuditLogChange contactAuditLogChange,
		ServiceContext serviceContext) {
		return getPersistence().update(contactAuditLogChange, serviceContext);
	}

	/**
	* Returns all the contact audit log changes where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogId the contact audit log ID
	* @return the matching contact audit log changes
	*/
	public static List<ContactAuditLogChange> findByContactAuditLogId(
		long contactAuditLogId) {
		return getPersistence().findByContactAuditLogId(contactAuditLogId);
	}

	/**
	* Returns a range of all the contact audit log changes where contactAuditLogId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactAuditLogId the contact audit log ID
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @return the range of matching contact audit log changes
	*/
	public static List<ContactAuditLogChange> findByContactAuditLogId(
		long contactAuditLogId, int start, int end) {
		return getPersistence()
				   .findByContactAuditLogId(contactAuditLogId, start, end);
	}

	/**
	* Returns an ordered range of all the contact audit log changes where contactAuditLogId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactAuditLogId the contact audit log ID
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contact audit log changes
	*/
	public static List<ContactAuditLogChange> findByContactAuditLogId(
		long contactAuditLogId, int start, int end,
		OrderByComparator<ContactAuditLogChange> orderByComparator) {
		return getPersistence()
				   .findByContactAuditLogId(contactAuditLogId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the contact audit log changes where contactAuditLogId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactAuditLogId the contact audit log ID
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching contact audit log changes
	*/
	public static List<ContactAuditLogChange> findByContactAuditLogId(
		long contactAuditLogId, int start, int end,
		OrderByComparator<ContactAuditLogChange> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByContactAuditLogId(contactAuditLogId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first contact audit log change in the ordered set where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogId the contact audit log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact audit log change
	* @throws NoSuchContactAuditLogChangeException if a matching contact audit log change could not be found
	*/
	public static ContactAuditLogChange findByContactAuditLogId_First(
		long contactAuditLogId,
		OrderByComparator<ContactAuditLogChange> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactAuditLogChangeException {
		return getPersistence()
				   .findByContactAuditLogId_First(contactAuditLogId,
			orderByComparator);
	}

	/**
	* Returns the first contact audit log change in the ordered set where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogId the contact audit log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact audit log change, or <code>null</code> if a matching contact audit log change could not be found
	*/
	public static ContactAuditLogChange fetchByContactAuditLogId_First(
		long contactAuditLogId,
		OrderByComparator<ContactAuditLogChange> orderByComparator) {
		return getPersistence()
				   .fetchByContactAuditLogId_First(contactAuditLogId,
			orderByComparator);
	}

	/**
	* Returns the last contact audit log change in the ordered set where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogId the contact audit log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact audit log change
	* @throws NoSuchContactAuditLogChangeException if a matching contact audit log change could not be found
	*/
	public static ContactAuditLogChange findByContactAuditLogId_Last(
		long contactAuditLogId,
		OrderByComparator<ContactAuditLogChange> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactAuditLogChangeException {
		return getPersistence()
				   .findByContactAuditLogId_Last(contactAuditLogId,
			orderByComparator);
	}

	/**
	* Returns the last contact audit log change in the ordered set where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogId the contact audit log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact audit log change, or <code>null</code> if a matching contact audit log change could not be found
	*/
	public static ContactAuditLogChange fetchByContactAuditLogId_Last(
		long contactAuditLogId,
		OrderByComparator<ContactAuditLogChange> orderByComparator) {
		return getPersistence()
				   .fetchByContactAuditLogId_Last(contactAuditLogId,
			orderByComparator);
	}

	/**
	* Returns the contact audit log changes before and after the current contact audit log change in the ordered set where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogChangeId the primary key of the current contact audit log change
	* @param contactAuditLogId the contact audit log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact audit log change
	* @throws NoSuchContactAuditLogChangeException if a contact audit log change with the primary key could not be found
	*/
	public static ContactAuditLogChange[] findByContactAuditLogId_PrevAndNext(
		long contactAuditLogChangeId, long contactAuditLogId,
		OrderByComparator<ContactAuditLogChange> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactAuditLogChangeException {
		return getPersistence()
				   .findByContactAuditLogId_PrevAndNext(contactAuditLogChangeId,
			contactAuditLogId, orderByComparator);
	}

	/**
	* Removes all the contact audit log changes where contactAuditLogId = &#63; from the database.
	*
	* @param contactAuditLogId the contact audit log ID
	*/
	public static void removeByContactAuditLogId(long contactAuditLogId) {
		getPersistence().removeByContactAuditLogId(contactAuditLogId);
	}

	/**
	* Returns the number of contact audit log changes where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogId the contact audit log ID
	* @return the number of matching contact audit log changes
	*/
	public static int countByContactAuditLogId(long contactAuditLogId) {
		return getPersistence().countByContactAuditLogId(contactAuditLogId);
	}

	/**
	* Caches the contact audit log change in the entity cache if it is enabled.
	*
	* @param contactAuditLogChange the contact audit log change
	*/
	public static void cacheResult(ContactAuditLogChange contactAuditLogChange) {
		getPersistence().cacheResult(contactAuditLogChange);
	}

	/**
	* Caches the contact audit log changes in the entity cache if it is enabled.
	*
	* @param contactAuditLogChanges the contact audit log changes
	*/
	public static void cacheResult(
		List<ContactAuditLogChange> contactAuditLogChanges) {
		getPersistence().cacheResult(contactAuditLogChanges);
	}

	/**
	* Creates a new contact audit log change with the primary key. Does not add the contact audit log change to the database.
	*
	* @param contactAuditLogChangeId the primary key for the new contact audit log change
	* @return the new contact audit log change
	*/
	public static ContactAuditLogChange create(long contactAuditLogChangeId) {
		return getPersistence().create(contactAuditLogChangeId);
	}

	/**
	* Removes the contact audit log change with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogChangeId the primary key of the contact audit log change
	* @return the contact audit log change that was removed
	* @throws NoSuchContactAuditLogChangeException if a contact audit log change with the primary key could not be found
	*/
	public static ContactAuditLogChange remove(long contactAuditLogChangeId)
		throws contact.manager.service.exception.NoSuchContactAuditLogChangeException {
		return getPersistence().remove(contactAuditLogChangeId);
	}

	public static ContactAuditLogChange updateImpl(
		ContactAuditLogChange contactAuditLogChange) {
		return getPersistence().updateImpl(contactAuditLogChange);
	}

	/**
	* Returns the contact audit log change with the primary key or throws a {@link NoSuchContactAuditLogChangeException} if it could not be found.
	*
	* @param contactAuditLogChangeId the primary key of the contact audit log change
	* @return the contact audit log change
	* @throws NoSuchContactAuditLogChangeException if a contact audit log change with the primary key could not be found
	*/
	public static ContactAuditLogChange findByPrimaryKey(
		long contactAuditLogChangeId)
		throws contact.manager.service.exception.NoSuchContactAuditLogChangeException {
		return getPersistence().findByPrimaryKey(contactAuditLogChangeId);
	}

	/**
	* Returns the contact audit log change with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param contactAuditLogChangeId the primary key of the contact audit log change
	* @return the contact audit log change, or <code>null</code> if a contact audit log change with the primary key could not be found
	*/
	public static ContactAuditLogChange fetchByPrimaryKey(
		long contactAuditLogChangeId) {
		return getPersistence().fetchByPrimaryKey(contactAuditLogChangeId);
	}

	public static java.util.Map<java.io.Serializable, ContactAuditLogChange> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the contact audit log changes.
	*
	* @return the contact audit log changes
	*/
	public static List<ContactAuditLogChange> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the contact audit log changes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @return the range of contact audit log changes
	*/
	public static List<ContactAuditLogChange> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the contact audit log changes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contact audit log changes
	*/
	public static List<ContactAuditLogChange> findAll(int start, int end,
		OrderByComparator<ContactAuditLogChange> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the contact audit log changes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of contact audit log changes
	*/
	public static List<ContactAuditLogChange> findAll(int start, int end,
		OrderByComparator<ContactAuditLogChange> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the contact audit log changes from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of contact audit log changes.
	*
	* @return the number of contact audit log changes
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ContactAuditLogChangePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContactAuditLogChangePersistence, ContactAuditLogChangePersistence> _serviceTracker =
		ServiceTrackerFactory.open(ContactAuditLogChangePersistence.class);
}