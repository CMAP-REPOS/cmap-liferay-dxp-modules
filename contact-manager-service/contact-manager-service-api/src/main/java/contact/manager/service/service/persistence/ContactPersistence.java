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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import contact.manager.service.exception.NoSuchContactException;
import contact.manager.service.model.Contact;

/**
 * The persistence interface for the contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.ContactPersistenceImpl
 * @see ContactUtil
 * @generated
 */
@ProviderType
public interface ContactPersistence extends BasePersistence<Contact> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContactUtil} to access the contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the contacts where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @return the matching contacts
	*/
	public java.util.List<Contact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress);

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
	public java.util.List<Contact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress, int start, int end);

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
	public java.util.List<Contact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

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
	public java.util.List<Contact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public Contact findByPrimaryEmailAddress_First(
		java.lang.String primaryEmailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException;

	/**
	* Returns the first contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public Contact fetchByPrimaryEmailAddress_First(
		java.lang.String primaryEmailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

	/**
	* Returns the last contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public Contact findByPrimaryEmailAddress_Last(
		java.lang.String primaryEmailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException;

	/**
	* Returns the last contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public Contact fetchByPrimaryEmailAddress_Last(
		java.lang.String primaryEmailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

	/**
	* Returns the contacts before and after the current contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param contactId the primary key of the current contact
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public Contact[] findByPrimaryEmailAddress_PrevAndNext(long contactId,
		java.lang.String primaryEmailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException;

	/**
	* Removes all the contacts where primaryEmailAddress = &#63; from the database.
	*
	* @param primaryEmailAddress the primary email address
	*/
	public void removeByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress);

	/**
	* Returns the number of contacts where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @return the number of matching contacts
	*/
	public int countByPrimaryEmailAddress(java.lang.String primaryEmailAddress);

	/**
	* Returns all the contacts where status = &#63;.
	*
	* @param status the status
	* @return the matching contacts
	*/
	public java.util.List<Contact> findByStatus(java.lang.String status);

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
	public java.util.List<Contact> findByStatus(java.lang.String status,
		int start, int end);

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
	public java.util.List<Contact> findByStatus(java.lang.String status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

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
	public java.util.List<Contact> findByStatus(java.lang.String status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public Contact findByStatus_First(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException;

	/**
	* Returns the first contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public Contact fetchByStatus_First(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

	/**
	* Returns the last contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public Contact findByStatus_Last(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException;

	/**
	* Returns the last contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public Contact fetchByStatus_Last(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

	/**
	* Returns the contacts before and after the current contact in the ordered set where status = &#63;.
	*
	* @param contactId the primary key of the current contact
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public Contact[] findByStatus_PrevAndNext(long contactId,
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException;

	/**
	* Removes all the contacts where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByStatus(java.lang.String status);

	/**
	* Returns the number of contacts where status = &#63;.
	*
	* @param status the status
	* @return the number of matching contacts
	*/
	public int countByStatus(java.lang.String status);

	/**
	* Returns all the contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @return the matching contacts
	*/
	public java.util.List<Contact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status);

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
	public java.util.List<Contact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status,
		int start, int end);

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
	public java.util.List<Contact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

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
	public java.util.List<Contact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public Contact findByPrimaryEmailAddressAndStatus_First(
		java.lang.String primaryEmailAddress, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException;

	/**
	* Returns the first contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public Contact fetchByPrimaryEmailAddressAndStatus_First(
		java.lang.String primaryEmailAddress, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

	/**
	* Returns the last contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public Contact findByPrimaryEmailAddressAndStatus_Last(
		java.lang.String primaryEmailAddress, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException;

	/**
	* Returns the last contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public Contact fetchByPrimaryEmailAddressAndStatus_Last(
		java.lang.String primaryEmailAddress, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

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
	public Contact[] findByPrimaryEmailAddressAndStatus_PrevAndNext(
		long contactId, java.lang.String primaryEmailAddress,
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException;

	/**
	* Removes all the contacts where primaryEmailAddress = &#63; and status = &#63; from the database.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	*/
	public void removeByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status);

	/**
	* Returns the number of contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @return the number of matching contacts
	*/
	public int countByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status);

	/**
	* Returns the contact where constantContactId = &#63; or throws a {@link NoSuchContactException} if it could not be found.
	*
	* @param constantContactId the constant contact ID
	* @return the matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public Contact findByConstantContactId(long constantContactId)
		throws NoSuchContactException;

	/**
	* Returns the contact where constantContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param constantContactId the constant contact ID
	* @return the matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public Contact fetchByConstantContactId(long constantContactId);

	/**
	* Returns the contact where constantContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param constantContactId the constant contact ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public Contact fetchByConstantContactId(long constantContactId,
		boolean retrieveFromCache);

	/**
	* Removes the contact where constantContactId = &#63; from the database.
	*
	* @param constantContactId the constant contact ID
	* @return the contact that was removed
	*/
	public Contact removeByConstantContactId(long constantContactId)
		throws NoSuchContactException;

	/**
	* Returns the number of contacts where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @return the number of matching contacts
	*/
	public int countByConstantContactId(long constantContactId);

	/**
	* Returns all the contacts where isVip = &#63;.
	*
	* @param isVip the is vip
	* @return the matching contacts
	*/
	public java.util.List<Contact> findByVipFlag(boolean isVip);

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
	public java.util.List<Contact> findByVipFlag(boolean isVip, int start,
		int end);

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
	public java.util.List<Contact> findByVipFlag(boolean isVip, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

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
	public java.util.List<Contact> findByVipFlag(boolean isVip, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public Contact findByVipFlag_First(boolean isVip,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException;

	/**
	* Returns the first contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public Contact fetchByVipFlag_First(boolean isVip,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

	/**
	* Returns the last contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact
	* @throws NoSuchContactException if a matching contact could not be found
	*/
	public Contact findByVipFlag_Last(boolean isVip,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException;

	/**
	* Returns the last contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact, or <code>null</code> if a matching contact could not be found
	*/
	public Contact fetchByVipFlag_Last(boolean isVip,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

	/**
	* Returns the contacts before and after the current contact in the ordered set where isVip = &#63;.
	*
	* @param contactId the primary key of the current contact
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public Contact[] findByVipFlag_PrevAndNext(long contactId, boolean isVip,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException;

	/**
	* Removes all the contacts where isVip = &#63; from the database.
	*
	* @param isVip the is vip
	*/
	public void removeByVipFlag(boolean isVip);

	/**
	* Returns the number of contacts where isVip = &#63;.
	*
	* @param isVip the is vip
	* @return the number of matching contacts
	*/
	public int countByVipFlag(boolean isVip);

	/**
	* Caches the contact in the entity cache if it is enabled.
	*
	* @param contact the contact
	*/
	public void cacheResult(Contact contact);

	/**
	* Caches the contacts in the entity cache if it is enabled.
	*
	* @param contacts the contacts
	*/
	public void cacheResult(java.util.List<Contact> contacts);

	/**
	* Creates a new contact with the primary key. Does not add the contact to the database.
	*
	* @param contactId the primary key for the new contact
	* @return the new contact
	*/
	public Contact create(long contactId);

	/**
	* Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactId the primary key of the contact
	* @return the contact that was removed
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public Contact remove(long contactId) throws NoSuchContactException;

	public Contact updateImpl(Contact contact);

	/**
	* Returns the contact with the primary key or throws a {@link NoSuchContactException} if it could not be found.
	*
	* @param contactId the primary key of the contact
	* @return the contact
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public Contact findByPrimaryKey(long contactId)
		throws NoSuchContactException;

	/**
	* Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param contactId the primary key of the contact
	* @return the contact, or <code>null</code> if a contact with the primary key could not be found
	*/
	public Contact fetchByPrimaryKey(long contactId);

	@Override
	public java.util.Map<java.io.Serializable, Contact> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the contacts.
	*
	* @return the contacts
	*/
	public java.util.List<Contact> findAll();

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
	public java.util.List<Contact> findAll(int start, int end);

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
	public java.util.List<Contact> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

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
	public java.util.List<Contact> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the contacts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of contacts.
	*
	* @return the number of contacts
	*/
	public int countAll();
}