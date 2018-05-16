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

import contact.manager.service.model.Contact;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the contact service. This utility wraps {@link contact.manager.service.service.persistence.impl.ContactPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactPersistence
 * @see contact.manager.service.service.persistence.impl.ContactPersistenceImpl
 * @generated
 */
@ProviderType
public class ContactUtil {
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
	public static void clearCache(Contact contact) {
		getPersistence().clearCache(contact);
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
	public static List<Contact> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Contact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Contact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Contact> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Contact update(Contact contact) {
		return getPersistence().update(contact);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Contact update(Contact contact, ServiceContext serviceContext) {
		return getPersistence().update(contact, serviceContext);
	}

	/**
	* Returns all the contacts where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @return the matching contacts
	*/
	public static List<Contact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress) {
		return getPersistence().findByPrimaryEmailAddress(primaryEmailAddress);
	}

	/**
	* Returns a range of all the contacts where primaryEmailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of matching contacts
	*/
	public static List<Contact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress, int start, int end) {
		return getPersistence()
				   .findByPrimaryEmailAddress(primaryEmailAddress, start, end);
	}

	/**
	* Returns an ordered range of all the contacts where primaryEmailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contacts
	*/
	public static List<Contact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress, int start, int end,
		OrderByComparator<Contact> orderByComparator) {
		return getPersistence()
				   .findByPrimaryEmailAddress(primaryEmailAddress, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the contacts where primaryEmailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching contacts
	*/
	public static List<Contact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress, int start, int end,
		OrderByComparator<Contact> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByPrimaryEmailAddress(primaryEmailAddress, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public static Contact findByPrimaryEmailAddress_First(
		java.lang.String primaryEmailAddress,
		OrderByComparator<Contact> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence()
				   .findByPrimaryEmailAddress_First(primaryEmailAddress,
			orderByComparator);
	}

	/**
	* Returns the first contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public static Contact fetchByPrimaryEmailAddress_First(
		java.lang.String primaryEmailAddress,
		OrderByComparator<Contact> orderByComparator) {
		return getPersistence()
				   .fetchByPrimaryEmailAddress_First(primaryEmailAddress,
			orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public static Contact findByPrimaryEmailAddress_Last(
		java.lang.String primaryEmailAddress,
		OrderByComparator<Contact> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence()
				   .findByPrimaryEmailAddress_Last(primaryEmailAddress,
			orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public static Contact fetchByPrimaryEmailAddress_Last(
		java.lang.String primaryEmailAddress,
		OrderByComparator<Contact> orderByComparator) {
		return getPersistence()
				   .fetchByPrimaryEmailAddress_Last(primaryEmailAddress,
			orderByComparator);
	}

	/**
	* Returns the contacts before and after the current contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param contactId the primary key of the current contact
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public static Contact[] findByPrimaryEmailAddress_PrevAndNext(
		long contactId, java.lang.String primaryEmailAddress,
		OrderByComparator<Contact> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence()
				   .findByPrimaryEmailAddress_PrevAndNext(contactId,
			primaryEmailAddress, orderByComparator);
	}

	/**
	* Removes all the contacts where primaryEmailAddress = &#63; from the database.
	*
	* @param primaryEmailAddress the primary email address
	*/
	public static void removeByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress) {
		getPersistence().removeByPrimaryEmailAddress(primaryEmailAddress);
	}

	/**
	* Returns the number of contacts where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @return the number of matching contacts
	*/
	public static int countByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress) {
		return getPersistence().countByPrimaryEmailAddress(primaryEmailAddress);
	}

	/**
	* Returns all the contacts where status = &#63;.
	*
	* @param status the status
	* @return the matching contacts
	*/
	public static List<Contact> findByStatus(java.lang.String status) {
		return getPersistence().findByStatus(status);
	}

	/**
	* Returns a range of all the contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of matching contacts
	*/
	public static List<Contact> findByStatus(java.lang.String status,
		int start, int end) {
		return getPersistence().findByStatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contacts
	*/
	public static List<Contact> findByStatus(java.lang.String status,
		int start, int end, OrderByComparator<Contact> orderByComparator) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching contacts
	*/
	public static List<Contact> findByStatus(java.lang.String status,
		int start, int end, OrderByComparator<Contact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public static Contact findByStatus_First(java.lang.String status,
		OrderByComparator<Contact> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the first contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public static Contact fetchByStatus_First(java.lang.String status,
		OrderByComparator<Contact> orderByComparator) {
		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public static Contact findByStatus_Last(java.lang.String status,
		OrderByComparator<Contact> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public static Contact fetchByStatus_Last(java.lang.String status,
		OrderByComparator<Contact> orderByComparator) {
		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the contacts before and after the current contact in the ordered set where status = &#63;.
	*
	* @param contactId the primary key of the current contact
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public static Contact[] findByStatus_PrevAndNext(long contactId,
		java.lang.String status, OrderByComparator<Contact> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence()
				   .findByStatus_PrevAndNext(contactId, status,
			orderByComparator);
	}

	/**
	* Removes all the contacts where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeByStatus(java.lang.String status) {
		getPersistence().removeByStatus(status);
	}

	/**
	* Returns the number of contacts where status = &#63;.
	*
	* @param status the status
	* @return the number of matching contacts
	*/
	public static int countByStatus(java.lang.String status) {
		return getPersistence().countByStatus(status);
	}

	/**
	* Returns all the contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @return the matching contacts
	*/
	public static List<Contact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status) {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status);
	}

	/**
	* Returns a range of all the contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of matching contacts
	*/
	public static List<Contact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status,
		int start, int end) {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status, start, end);
	}

	/**
	* Returns an ordered range of all the contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contacts
	*/
	public static List<Contact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status,
		int start, int end, OrderByComparator<Contact> orderByComparator) {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching contacts
	*/
	public static List<Contact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status,
		int start, int end, OrderByComparator<Contact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public static Contact findByPrimaryEmailAddressAndStatus_First(
		java.lang.String primaryEmailAddress, java.lang.String status,
		OrderByComparator<Contact> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus_First(primaryEmailAddress,
			status, orderByComparator);
	}

	/**
	* Returns the first contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public static Contact fetchByPrimaryEmailAddressAndStatus_First(
		java.lang.String primaryEmailAddress, java.lang.String status,
		OrderByComparator<Contact> orderByComparator) {
		return getPersistence()
				   .fetchByPrimaryEmailAddressAndStatus_First(primaryEmailAddress,
			status, orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public static Contact findByPrimaryEmailAddressAndStatus_Last(
		java.lang.String primaryEmailAddress, java.lang.String status,
		OrderByComparator<Contact> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus_Last(primaryEmailAddress,
			status, orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public static Contact fetchByPrimaryEmailAddressAndStatus_Last(
		java.lang.String primaryEmailAddress, java.lang.String status,
		OrderByComparator<Contact> orderByComparator) {
		return getPersistence()
				   .fetchByPrimaryEmailAddressAndStatus_Last(primaryEmailAddress,
			status, orderByComparator);
	}

	/**
	* Returns the contacts before and after the current contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param contactId the primary key of the current contact
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public static Contact[] findByPrimaryEmailAddressAndStatus_PrevAndNext(
		long contactId, java.lang.String primaryEmailAddress,
		java.lang.String status, OrderByComparator<Contact> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus_PrevAndNext(contactId,
			primaryEmailAddress, status, orderByComparator);
	}

	/**
	* Removes all the contacts where primaryEmailAddress = &#63; and status = &#63; from the database.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	*/
	public static void removeByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status) {
		getPersistence()
			.removeByPrimaryEmailAddressAndStatus(primaryEmailAddress, status);
	}

	/**
	* Returns the number of contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @return the number of matching contacts
	*/
	public static int countByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status) {
		return getPersistence()
				   .countByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status);
	}

	/**
	* Returns the contact where constantContactId = &#63; or throws a {@link NoSuchContactException} if it could not be found.
	*
	* @param constantContactId the constant contact ID
	* @return the matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public static Contact findByConstantContactId(long constantContactId)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence().findByConstantContactId(constantContactId);
	}

	/**
	* Returns the contact where constantContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param constantContactId the constant contact ID
	* @return the matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public static Contact fetchByConstantContactId(long constantContactId) {
		return getPersistence().fetchByConstantContactId(constantContactId);
	}

	/**
	* Returns the contact where constantContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param constantContactId the constant contact ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public static Contact fetchByConstantContactId(long constantContactId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByConstantContactId(constantContactId,
			retrieveFromCache);
	}

	/**
	* Removes the contact where constantContactId = &#63; from the database.
	*
	* @param constantContactId the constant contact ID
	* @return the contact that was removed
	*/
	public static Contact removeByConstantContactId(long constantContactId)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence().removeByConstantContactId(constantContactId);
	}

	/**
	* Returns the number of contacts where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @return the number of matching contacts
	*/
	public static int countByConstantContactId(long constantContactId) {
		return getPersistence().countByConstantContactId(constantContactId);
	}

	/**
	* Returns all the contacts where isVip = &#63;.
	*
	* @param isVip the is vip
	* @return the matching contacts
	*/
	public static List<Contact> findByVipFlag(boolean isVip) {
		return getPersistence().findByVipFlag(isVip);
	}

	/**
	* Returns a range of all the contacts where isVip = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isVip the is vip
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of matching contacts
	*/
	public static List<Contact> findByVipFlag(boolean isVip, int start, int end) {
		return getPersistence().findByVipFlag(isVip, start, end);
	}

	/**
	* Returns an ordered range of all the contacts where isVip = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isVip the is vip
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contacts
	*/
	public static List<Contact> findByVipFlag(boolean isVip, int start,
		int end, OrderByComparator<Contact> orderByComparator) {
		return getPersistence()
				   .findByVipFlag(isVip, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the contacts where isVip = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isVip the is vip
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching contacts
	*/
	public static List<Contact> findByVipFlag(boolean isVip, int start,
		int end, OrderByComparator<Contact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVipFlag(isVip, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public static Contact findByVipFlag_First(boolean isVip,
		OrderByComparator<Contact> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence().findByVipFlag_First(isVip, orderByComparator);
	}

	/**
	* Returns the first contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public static Contact fetchByVipFlag_First(boolean isVip,
		OrderByComparator<Contact> orderByComparator) {
		return getPersistence().fetchByVipFlag_First(isVip, orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public static Contact findByVipFlag_Last(boolean isVip,
		OrderByComparator<Contact> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence().findByVipFlag_Last(isVip, orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public static Contact fetchByVipFlag_Last(boolean isVip,
		OrderByComparator<Contact> orderByComparator) {
		return getPersistence().fetchByVipFlag_Last(isVip, orderByComparator);
	}

	/**
	* Returns the contacts before and after the current contact in the ordered set where isVip = &#63;.
	*
	* @param contactId the primary key of the current contact
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public static Contact[] findByVipFlag_PrevAndNext(long contactId,
		boolean isVip, OrderByComparator<Contact> orderByComparator)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence()
				   .findByVipFlag_PrevAndNext(contactId, isVip,
			orderByComparator);
	}

	/**
	* Removes all the contacts where isVip = &#63; from the database.
	*
	* @param isVip the is vip
	*/
	public static void removeByVipFlag(boolean isVip) {
		getPersistence().removeByVipFlag(isVip);
	}

	/**
	* Returns the number of contacts where isVip = &#63;.
	*
	* @param isVip the is vip
	* @return the number of matching contacts
	*/
	public static int countByVipFlag(boolean isVip) {
		return getPersistence().countByVipFlag(isVip);
	}

	/**
	* Caches the contact in the entity cache if it is enabled.
	*
	* @param contact the contact
	*/
	public static void cacheResult(Contact contact) {
		getPersistence().cacheResult(contact);
	}

	/**
	* Caches the contacts in the entity cache if it is enabled.
	*
	* @param contacts the contacts
	*/
	public static void cacheResult(List<Contact> contacts) {
		getPersistence().cacheResult(contacts);
	}

	/**
	* Creates a new contact with the primary key. Does not add the contact to the database.
	*
	* @param contactId the primary key for the new contact
	* @return the new contact
	*/
	public static Contact create(long contactId) {
		return getPersistence().create(contactId);
	}

	/**
	* Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactId the primary key of the contact
	* @return the contact that was removed
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public static Contact remove(long contactId)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence().remove(contactId);
	}

	public static Contact updateImpl(Contact contact) {
		return getPersistence().updateImpl(contact);
	}

	/**
	* Returns the contact with the primary key or throws a {@link NoSuchContactException} if it could not be found.
	*
	* @param contactId the primary key of the contact
	* @return the contact
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public static Contact findByPrimaryKey(long contactId)
		throws contact.manager.service.exception.NoSuchContactException {
		return getPersistence().findByPrimaryKey(contactId);
	}

	/**
	* Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param contactId the primary key of the contact
	* @return the contact, or <code>null</code> if a contact with the primary key could not be found
	*/
	public static Contact fetchByPrimaryKey(long contactId) {
		return getPersistence().fetchByPrimaryKey(contactId);
	}

	public static java.util.Map<java.io.Serializable, Contact> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the contacts.
	*
	* @return the contacts
	*/
	public static List<Contact> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of contacts
	*/
	public static List<Contact> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contacts
	*/
	public static List<Contact> findAll(int start, int end,
		OrderByComparator<Contact> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of contacts
	*/
	public static List<Contact> findAll(int start, int end,
		OrderByComparator<Contact> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the contacts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of contacts.
	*
	* @return the number of contacts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	/**
	* Returns the primaryKeys of cmap tags associated with the contact.
	*
	* @param pk the primary key of the contact
	* @return long[] of the primaryKeys of cmap tags associated with the contact
	*/
	public static long[] getCmapTagPrimaryKeys(long pk) {
		return getPersistence().getCmapTagPrimaryKeys(pk);
	}

	/**
	* Returns all the cmap tags associated with the contact.
	*
	* @param pk the primary key of the contact
	* @return the cmap tags associated with the contact
	*/
	public static List<contact.manager.service.model.CmapTag> getCmapTags(
		long pk) {
		return getPersistence().getCmapTags(pk);
	}

	/**
	* Returns a range of all the cmap tags associated with the contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the contact
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of cmap tags associated with the contact
	*/
	public static List<contact.manager.service.model.CmapTag> getCmapTags(
		long pk, int start, int end) {
		return getPersistence().getCmapTags(pk, start, end);
	}

	/**
	* Returns an ordered range of all the cmap tags associated with the contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the contact
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cmap tags associated with the contact
	*/
	public static List<contact.manager.service.model.CmapTag> getCmapTags(
		long pk, int start, int end,
		OrderByComparator<contact.manager.service.model.CmapTag> orderByComparator) {
		return getPersistence().getCmapTags(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of cmap tags associated with the contact.
	*
	* @param pk the primary key of the contact
	* @return the number of cmap tags associated with the contact
	*/
	public static int getCmapTagsSize(long pk) {
		return getPersistence().getCmapTagsSize(pk);
	}

	/**
	* Returns <code>true</code> if the cmap tag is associated with the contact.
	*
	* @param pk the primary key of the contact
	* @param cmapTagPK the primary key of the cmap tag
	* @return <code>true</code> if the cmap tag is associated with the contact; <code>false</code> otherwise
	*/
	public static boolean containsCmapTag(long pk, long cmapTagPK) {
		return getPersistence().containsCmapTag(pk, cmapTagPK);
	}

	/**
	* Returns <code>true</code> if the contact has any cmap tags associated with it.
	*
	* @param pk the primary key of the contact to check for associations with cmap tags
	* @return <code>true</code> if the contact has any cmap tags associated with it; <code>false</code> otherwise
	*/
	public static boolean containsCmapTags(long pk) {
		return getPersistence().containsCmapTags(pk);
	}

	/**
	* Adds an association between the contact and the cmap tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTagPK the primary key of the cmap tag
	*/
	public static void addCmapTag(long pk, long cmapTagPK) {
		getPersistence().addCmapTag(pk, cmapTagPK);
	}

	/**
	* Adds an association between the contact and the cmap tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTag the cmap tag
	*/
	public static void addCmapTag(long pk,
		contact.manager.service.model.CmapTag cmapTag) {
		getPersistence().addCmapTag(pk, cmapTag);
	}

	/**
	* Adds an association between the contact and the cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTagPKs the primary keys of the cmap tags
	*/
	public static void addCmapTags(long pk, long[] cmapTagPKs) {
		getPersistence().addCmapTags(pk, cmapTagPKs);
	}

	/**
	* Adds an association between the contact and the cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTags the cmap tags
	*/
	public static void addCmapTags(long pk,
		List<contact.manager.service.model.CmapTag> cmapTags) {
		getPersistence().addCmapTags(pk, cmapTags);
	}

	/**
	* Clears all associations between the contact and its cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact to clear the associated cmap tags from
	*/
	public static void clearCmapTags(long pk) {
		getPersistence().clearCmapTags(pk);
	}

	/**
	* Removes the association between the contact and the cmap tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTagPK the primary key of the cmap tag
	*/
	public static void removeCmapTag(long pk, long cmapTagPK) {
		getPersistence().removeCmapTag(pk, cmapTagPK);
	}

	/**
	* Removes the association between the contact and the cmap tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTag the cmap tag
	*/
	public static void removeCmapTag(long pk,
		contact.manager.service.model.CmapTag cmapTag) {
		getPersistence().removeCmapTag(pk, cmapTag);
	}

	/**
	* Removes the association between the contact and the cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTagPKs the primary keys of the cmap tags
	*/
	public static void removeCmapTags(long pk, long[] cmapTagPKs) {
		getPersistence().removeCmapTags(pk, cmapTagPKs);
	}

	/**
	* Removes the association between the contact and the cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTags the cmap tags
	*/
	public static void removeCmapTags(long pk,
		List<contact.manager.service.model.CmapTag> cmapTags) {
		getPersistence().removeCmapTags(pk, cmapTags);
	}

	/**
	* Sets the cmap tags associated with the contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTagPKs the primary keys of the cmap tags to be associated with the contact
	*/
	public static void setCmapTags(long pk, long[] cmapTagPKs) {
		getPersistence().setCmapTags(pk, cmapTagPKs);
	}

	/**
	* Sets the cmap tags associated with the contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTags the cmap tags to be associated with the contact
	*/
	public static void setCmapTags(long pk,
		List<contact.manager.service.model.CmapTag> cmapTags) {
		getPersistence().setCmapTags(pk, cmapTags);
	}

	/**
	* Returns the primaryKeys of cmap sub groups associated with the contact.
	*
	* @param pk the primary key of the contact
	* @return long[] of the primaryKeys of cmap sub groups associated with the contact
	*/
	public static long[] getCmapSubGroupPrimaryKeys(long pk) {
		return getPersistence().getCmapSubGroupPrimaryKeys(pk);
	}

	/**
	* Returns all the cmap sub groups associated with the contact.
	*
	* @param pk the primary key of the contact
	* @return the cmap sub groups associated with the contact
	*/
	public static List<contact.manager.service.model.CmapSubGroup> getCmapSubGroups(
		long pk) {
		return getPersistence().getCmapSubGroups(pk);
	}

	/**
	* Returns a range of all the cmap sub groups associated with the contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the contact
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of cmap sub groups associated with the contact
	*/
	public static List<contact.manager.service.model.CmapSubGroup> getCmapSubGroups(
		long pk, int start, int end) {
		return getPersistence().getCmapSubGroups(pk, start, end);
	}

	/**
	* Returns an ordered range of all the cmap sub groups associated with the contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the contact
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cmap sub groups associated with the contact
	*/
	public static List<contact.manager.service.model.CmapSubGroup> getCmapSubGroups(
		long pk, int start, int end,
		OrderByComparator<contact.manager.service.model.CmapSubGroup> orderByComparator) {
		return getPersistence()
				   .getCmapSubGroups(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of cmap sub groups associated with the contact.
	*
	* @param pk the primary key of the contact
	* @return the number of cmap sub groups associated with the contact
	*/
	public static int getCmapSubGroupsSize(long pk) {
		return getPersistence().getCmapSubGroupsSize(pk);
	}

	/**
	* Returns <code>true</code> if the cmap sub group is associated with the contact.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroupPK the primary key of the cmap sub group
	* @return <code>true</code> if the cmap sub group is associated with the contact; <code>false</code> otherwise
	*/
	public static boolean containsCmapSubGroup(long pk, long cmapSubGroupPK) {
		return getPersistence().containsCmapSubGroup(pk, cmapSubGroupPK);
	}

	/**
	* Returns <code>true</code> if the contact has any cmap sub groups associated with it.
	*
	* @param pk the primary key of the contact to check for associations with cmap sub groups
	* @return <code>true</code> if the contact has any cmap sub groups associated with it; <code>false</code> otherwise
	*/
	public static boolean containsCmapSubGroups(long pk) {
		return getPersistence().containsCmapSubGroups(pk);
	}

	/**
	* Adds an association between the contact and the cmap sub group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroupPK the primary key of the cmap sub group
	*/
	public static void addCmapSubGroup(long pk, long cmapSubGroupPK) {
		getPersistence().addCmapSubGroup(pk, cmapSubGroupPK);
	}

	/**
	* Adds an association between the contact and the cmap sub group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroup the cmap sub group
	*/
	public static void addCmapSubGroup(long pk,
		contact.manager.service.model.CmapSubGroup cmapSubGroup) {
		getPersistence().addCmapSubGroup(pk, cmapSubGroup);
	}

	/**
	* Adds an association between the contact and the cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroupPKs the primary keys of the cmap sub groups
	*/
	public static void addCmapSubGroups(long pk, long[] cmapSubGroupPKs) {
		getPersistence().addCmapSubGroups(pk, cmapSubGroupPKs);
	}

	/**
	* Adds an association between the contact and the cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroups the cmap sub groups
	*/
	public static void addCmapSubGroups(long pk,
		List<contact.manager.service.model.CmapSubGroup> cmapSubGroups) {
		getPersistence().addCmapSubGroups(pk, cmapSubGroups);
	}

	/**
	* Clears all associations between the contact and its cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact to clear the associated cmap sub groups from
	*/
	public static void clearCmapSubGroups(long pk) {
		getPersistence().clearCmapSubGroups(pk);
	}

	/**
	* Removes the association between the contact and the cmap sub group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroupPK the primary key of the cmap sub group
	*/
	public static void removeCmapSubGroup(long pk, long cmapSubGroupPK) {
		getPersistence().removeCmapSubGroup(pk, cmapSubGroupPK);
	}

	/**
	* Removes the association between the contact and the cmap sub group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroup the cmap sub group
	*/
	public static void removeCmapSubGroup(long pk,
		contact.manager.service.model.CmapSubGroup cmapSubGroup) {
		getPersistence().removeCmapSubGroup(pk, cmapSubGroup);
	}

	/**
	* Removes the association between the contact and the cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroupPKs the primary keys of the cmap sub groups
	*/
	public static void removeCmapSubGroups(long pk, long[] cmapSubGroupPKs) {
		getPersistence().removeCmapSubGroups(pk, cmapSubGroupPKs);
	}

	/**
	* Removes the association between the contact and the cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroups the cmap sub groups
	*/
	public static void removeCmapSubGroups(long pk,
		List<contact.manager.service.model.CmapSubGroup> cmapSubGroups) {
		getPersistence().removeCmapSubGroups(pk, cmapSubGroups);
	}

	/**
	* Sets the cmap sub groups associated with the contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroupPKs the primary keys of the cmap sub groups to be associated with the contact
	*/
	public static void setCmapSubGroups(long pk, long[] cmapSubGroupPKs) {
		getPersistence().setCmapSubGroups(pk, cmapSubGroupPKs);
	}

	/**
	* Sets the cmap sub groups associated with the contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroups the cmap sub groups to be associated with the contact
	*/
	public static void setCmapSubGroups(long pk,
		List<contact.manager.service.model.CmapSubGroup> cmapSubGroups) {
		getPersistence().setCmapSubGroups(pk, cmapSubGroups);
	}

	public static ContactPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContactPersistence, ContactPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ContactPersistence.class);
}