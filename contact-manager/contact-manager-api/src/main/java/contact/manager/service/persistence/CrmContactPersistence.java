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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import contact.manager.exception.NoSuchCrmContactException;

import contact.manager.model.CrmContact;

/**
 * The persistence interface for the CRM Contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmContactPersistenceImpl
 * @see CrmContactUtil
 * @generated
 */
@ProviderType
public interface CrmContactPersistence extends BasePersistence<CrmContact> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmContactUtil} to access the CRM Contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM Contacts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByUuid(String uuid);

	/**
	* Returns a range of all the CRM Contacts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the CRM Contacts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contacts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the first CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the last CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the last CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public CrmContact[] findByUuid_PrevAndNext(long crmContactId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Removes all the CRM Contacts where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of CRM Contacts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Contacts
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the CRM Contact where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmContactException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmContactException;

	/**
	* Returns the CRM Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the CRM Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM Contact where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Contact that was removed
	*/
	public CrmContact removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmContactException;

	/**
	* Returns the number of CRM Contacts where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Contacts
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByUuid_C(String uuid, long companyId);

	/**
	* Returns a range of all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByUuid_C(String uuid, long companyId,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the first CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the last CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the last CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public CrmContact[] findByUuid_C_PrevAndNext(long crmContactId,
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Removes all the CRM Contacts where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of CRM Contacts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Contacts
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the CRM Contacts where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @return the matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByPrimaryEmailAddress(
		String primaryEmailAddress);

	/**
	* Returns a range of all the CRM Contacts where primaryEmailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByPrimaryEmailAddress(
		String primaryEmailAddress, int start, int end);

	/**
	* Returns an ordered range of all the CRM Contacts where primaryEmailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByPrimaryEmailAddress(
		String primaryEmailAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contacts where primaryEmailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByPrimaryEmailAddress(
		String primaryEmailAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByPrimaryEmailAddress_First(
		String primaryEmailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the first CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByPrimaryEmailAddress_First(
		String primaryEmailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the last CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByPrimaryEmailAddress_Last(
		String primaryEmailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the last CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByPrimaryEmailAddress_Last(
		String primaryEmailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public CrmContact[] findByPrimaryEmailAddress_PrevAndNext(
		long crmContactId, String primaryEmailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Removes all the CRM Contacts where primaryEmailAddress = &#63; from the database.
	*
	* @param primaryEmailAddress the primary email address
	*/
	public void removeByPrimaryEmailAddress(String primaryEmailAddress);

	/**
	* Returns the number of CRM Contacts where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @return the number of matching CRM Contacts
	*/
	public int countByPrimaryEmailAddress(String primaryEmailAddress);

	/**
	* Returns all the CRM Contacts where status = &#63;.
	*
	* @param status the status
	* @return the matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByStatus(String status);

	/**
	* Returns a range of all the CRM Contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByStatus(String status, int start,
		int end);

	/**
	* Returns an ordered range of all the CRM Contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByStatus(String status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByStatus(String status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByStatus_First(String status,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the first CRM Contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByStatus_First(String status,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the last CRM Contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByStatus_Last(String status,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the last CRM Contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByStatus_Last(String status,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where status = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public CrmContact[] findByStatus_PrevAndNext(long crmContactId,
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Removes all the CRM Contacts where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByStatus(String status);

	/**
	* Returns the number of CRM Contacts where status = &#63;.
	*
	* @param status the status
	* @return the number of matching CRM Contacts
	*/
	public int countByStatus(String status);

	/**
	* Returns all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @return the matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status);

	/**
	* Returns a range of all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status, int start, int end);

	/**
	* Returns an ordered range of all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByPrimaryEmailAddressAndStatus_First(
		String primaryEmailAddress, String status,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the first CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByPrimaryEmailAddressAndStatus_First(
		String primaryEmailAddress, String status,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the last CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByPrimaryEmailAddressAndStatus_Last(
		String primaryEmailAddress, String status,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the last CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByPrimaryEmailAddressAndStatus_Last(
		String primaryEmailAddress, String status,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public CrmContact[] findByPrimaryEmailAddressAndStatus_PrevAndNext(
		long crmContactId, String primaryEmailAddress, String status,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Removes all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63; from the database.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	*/
	public void removeByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status);

	/**
	* Returns the number of CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @return the number of matching CRM Contacts
	*/
	public int countByPrimaryEmailAddressAndStatus(String primaryEmailAddress,
		String status);

	/**
	* Returns all the CRM Contacts where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @return the matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByName(String firstName,
		String middleName, String lastName);

	/**
	* Returns a range of all the CRM Contacts where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByName(String firstName,
		String middleName, String lastName, int start, int end);

	/**
	* Returns an ordered range of all the CRM Contacts where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByName(String firstName,
		String middleName, String lastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contacts where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByName(String firstName,
		String middleName, String lastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact in the ordered set where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByName_First(String firstName, String middleName,
		String lastName,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the first CRM Contact in the ordered set where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByName_First(String firstName, String middleName,
		String lastName,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the last CRM Contact in the ordered set where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByName_Last(String firstName, String middleName,
		String lastName,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the last CRM Contact in the ordered set where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByName_Last(String firstName, String middleName,
		String lastName,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public CrmContact[] findByName_PrevAndNext(long crmContactId,
		String firstName, String middleName, String lastName,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Removes all the CRM Contacts where firstName = &#63; and middleName = &#63; and lastName = &#63; from the database.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	*/
	public void removeByName(String firstName, String middleName,
		String lastName);

	/**
	* Returns the number of CRM Contacts where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @return the number of matching CRM Contacts
	*/
	public int countByName(String firstName, String middleName, String lastName);

	/**
	* Returns the CRM Contact where constantContactId = &#63; or throws a {@link NoSuchCrmContactException} if it could not be found.
	*
	* @param constantContactId the constant contact ID
	* @return the matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByConstantContactId(long constantContactId)
		throws NoSuchCrmContactException;

	/**
	* Returns the CRM Contact where constantContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param constantContactId the constant contact ID
	* @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByConstantContactId(long constantContactId);

	/**
	* Returns the CRM Contact where constantContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param constantContactId the constant contact ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByConstantContactId(long constantContactId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM Contact where constantContactId = &#63; from the database.
	*
	* @param constantContactId the constant contact ID
	* @return the CRM Contact that was removed
	*/
	public CrmContact removeByConstantContactId(long constantContactId)
		throws NoSuchCrmContactException;

	/**
	* Returns the number of CRM Contacts where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @return the number of matching CRM Contacts
	*/
	public int countByConstantContactId(long constantContactId);

	/**
	* Returns all the CRM Contacts where isVip = &#63;.
	*
	* @param isVip the is vip
	* @return the matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByVipFlag(boolean isVip);

	/**
	* Returns a range of all the CRM Contacts where isVip = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isVip the is vip
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByVipFlag(boolean isVip, int start,
		int end);

	/**
	* Returns an ordered range of all the CRM Contacts where isVip = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isVip the is vip
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByVipFlag(boolean isVip, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contacts where isVip = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isVip the is vip
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByVipFlag(boolean isVip, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByVipFlag_First(boolean isVip,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the first CRM Contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByVipFlag_First(boolean isVip,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the last CRM Contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByVipFlag_Last(boolean isVip,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the last CRM Contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByVipFlag_Last(boolean isVip,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where isVip = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public CrmContact[] findByVipFlag_PrevAndNext(long crmContactId,
		boolean isVip,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Removes all the CRM Contacts where isVip = &#63; from the database.
	*
	* @param isVip the is vip
	*/
	public void removeByVipFlag(boolean isVip);

	/**
	* Returns the number of CRM Contacts where isVip = &#63;.
	*
	* @param isVip the is vip
	* @return the number of matching CRM Contacts
	*/
	public int countByVipFlag(boolean isVip);

	/**
	* Caches the CRM Contact in the entity cache if it is enabled.
	*
	* @param crmContact the CRM Contact
	*/
	public void cacheResult(CrmContact crmContact);

	/**
	* Caches the CRM Contacts in the entity cache if it is enabled.
	*
	* @param crmContacts the CRM Contacts
	*/
	public void cacheResult(java.util.List<CrmContact> crmContacts);

	/**
	* Creates a new CRM Contact with the primary key. Does not add the CRM Contact to the database.
	*
	* @param crmContactId the primary key for the new CRM Contact
	* @return the new CRM Contact
	*/
	public CrmContact create(long crmContactId);

	/**
	* Removes the CRM Contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactId the primary key of the CRM Contact
	* @return the CRM Contact that was removed
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public CrmContact remove(long crmContactId)
		throws NoSuchCrmContactException;

	public CrmContact updateImpl(CrmContact crmContact);

	/**
	* Returns the CRM Contact with the primary key or throws a {@link NoSuchCrmContactException} if it could not be found.
	*
	* @param crmContactId the primary key of the CRM Contact
	* @return the CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public CrmContact findByPrimaryKey(long crmContactId)
		throws NoSuchCrmContactException;

	/**
	* Returns the CRM Contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmContactId the primary key of the CRM Contact
	* @return the CRM Contact, or <code>null</code> if a CRM Contact with the primary key could not be found
	*/
	public CrmContact fetchByPrimaryKey(long crmContactId);

	@Override
	public java.util.Map<java.io.Serializable, CrmContact> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM Contacts.
	*
	* @return the CRM Contacts
	*/
	public java.util.List<CrmContact> findAll();

	/**
	* Returns a range of all the CRM Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of CRM Contacts
	*/
	public java.util.List<CrmContact> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Contacts
	*/
	public java.util.List<CrmContact> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Contacts
	*/
	public java.util.List<CrmContact> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM Contacts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM Contacts.
	*
	* @return the number of CRM Contacts
	*/
	public int countAll();

	/**
	* Returns the primaryKeys of CRM Groups associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @return long[] of the primaryKeys of CRM Groups associated with the CRM Contact
	*/
	public long[] getCrmGroupPrimaryKeys(long pk);

	/**
	* Returns all the CRM Groups associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @return the CRM Groups associated with the CRM Contact
	*/
	public java.util.List<contact.manager.model.CrmGroup> getCrmGroups(long pk);

	/**
	* Returns a range of all the CRM Groups associated with the CRM Contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the CRM Contact
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of CRM Groups associated with the CRM Contact
	*/
	public java.util.List<contact.manager.model.CrmGroup> getCrmGroups(
		long pk, int start, int end);

	/**
	* Returns an ordered range of all the CRM Groups associated with the CRM Contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the CRM Contact
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Groups associated with the CRM Contact
	*/
	public java.util.List<contact.manager.model.CrmGroup> getCrmGroups(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator);

	/**
	* Returns the number of CRM Groups associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @return the number of CRM Groups associated with the CRM Contact
	*/
	public int getCrmGroupsSize(long pk);

	/**
	* Returns <code>true</code> if the CRM Group is associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroupPK the primary key of the CRM Group
	* @return <code>true</code> if the CRM Group is associated with the CRM Contact; <code>false</code> otherwise
	*/
	public boolean containsCrmGroup(long pk, long crmGroupPK);

	/**
	* Returns <code>true</code> if the CRM Contact has any CRM Groups associated with it.
	*
	* @param pk the primary key of the CRM Contact to check for associations with CRM Groups
	* @return <code>true</code> if the CRM Contact has any CRM Groups associated with it; <code>false</code> otherwise
	*/
	public boolean containsCrmGroups(long pk);

	/**
	* Adds an association between the CRM Contact and the CRM Group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroupPK the primary key of the CRM Group
	*/
	public void addCrmGroup(long pk, long crmGroupPK);

	/**
	* Adds an association between the CRM Contact and the CRM Group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroup the CRM Group
	*/
	public void addCrmGroup(long pk, contact.manager.model.CrmGroup crmGroup);

	/**
	* Adds an association between the CRM Contact and the CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroupPKs the primary keys of the CRM Groups
	*/
	public void addCrmGroups(long pk, long[] crmGroupPKs);

	/**
	* Adds an association between the CRM Contact and the CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroups the CRM Groups
	*/
	public void addCrmGroups(long pk,
		java.util.List<contact.manager.model.CrmGroup> crmGroups);

	/**
	* Clears all associations between the CRM Contact and its CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact to clear the associated CRM Groups from
	*/
	public void clearCrmGroups(long pk);

	/**
	* Removes the association between the CRM Contact and the CRM Group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroupPK the primary key of the CRM Group
	*/
	public void removeCrmGroup(long pk, long crmGroupPK);

	/**
	* Removes the association between the CRM Contact and the CRM Group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroup the CRM Group
	*/
	public void removeCrmGroup(long pk, contact.manager.model.CrmGroup crmGroup);

	/**
	* Removes the association between the CRM Contact and the CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroupPKs the primary keys of the CRM Groups
	*/
	public void removeCrmGroups(long pk, long[] crmGroupPKs);

	/**
	* Removes the association between the CRM Contact and the CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroups the CRM Groups
	*/
	public void removeCrmGroups(long pk,
		java.util.List<contact.manager.model.CrmGroup> crmGroups);

	/**
	* Sets the CRM Groups associated with the CRM Contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroupPKs the primary keys of the CRM Groups to be associated with the CRM Contact
	*/
	public void setCrmGroups(long pk, long[] crmGroupPKs);

	/**
	* Sets the CRM Groups associated with the CRM Contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroups the CRM Groups to be associated with the CRM Contact
	*/
	public void setCrmGroups(long pk,
		java.util.List<contact.manager.model.CrmGroup> crmGroups);

	/**
	* Returns the primaryKeys of CRM Tags associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @return long[] of the primaryKeys of CRM Tags associated with the CRM Contact
	*/
	public long[] getCrmTagPrimaryKeys(long pk);

	/**
	* Returns all the CRM Tags associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @return the CRM Tags associated with the CRM Contact
	*/
	public java.util.List<contact.manager.model.CrmTag> getCrmTags(long pk);

	/**
	* Returns a range of all the CRM Tags associated with the CRM Contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the CRM Contact
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of CRM Tags associated with the CRM Contact
	*/
	public java.util.List<contact.manager.model.CrmTag> getCrmTags(long pk,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM Tags associated with the CRM Contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the CRM Contact
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Tags associated with the CRM Contact
	*/
	public java.util.List<contact.manager.model.CrmTag> getCrmTags(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmTag> orderByComparator);

	/**
	* Returns the number of CRM Tags associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @return the number of CRM Tags associated with the CRM Contact
	*/
	public int getCrmTagsSize(long pk);

	/**
	* Returns <code>true</code> if the CRM Tag is associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTagPK the primary key of the CRM Tag
	* @return <code>true</code> if the CRM Tag is associated with the CRM Contact; <code>false</code> otherwise
	*/
	public boolean containsCrmTag(long pk, long crmTagPK);

	/**
	* Returns <code>true</code> if the CRM Contact has any CRM Tags associated with it.
	*
	* @param pk the primary key of the CRM Contact to check for associations with CRM Tags
	* @return <code>true</code> if the CRM Contact has any CRM Tags associated with it; <code>false</code> otherwise
	*/
	public boolean containsCrmTags(long pk);

	/**
	* Adds an association between the CRM Contact and the CRM Tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTagPK the primary key of the CRM Tag
	*/
	public void addCrmTag(long pk, long crmTagPK);

	/**
	* Adds an association between the CRM Contact and the CRM Tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTag the CRM Tag
	*/
	public void addCrmTag(long pk, contact.manager.model.CrmTag crmTag);

	/**
	* Adds an association between the CRM Contact and the CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTagPKs the primary keys of the CRM Tags
	*/
	public void addCrmTags(long pk, long[] crmTagPKs);

	/**
	* Adds an association between the CRM Contact and the CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTags the CRM Tags
	*/
	public void addCrmTags(long pk,
		java.util.List<contact.manager.model.CrmTag> crmTags);

	/**
	* Clears all associations between the CRM Contact and its CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact to clear the associated CRM Tags from
	*/
	public void clearCrmTags(long pk);

	/**
	* Removes the association between the CRM Contact and the CRM Tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTagPK the primary key of the CRM Tag
	*/
	public void removeCrmTag(long pk, long crmTagPK);

	/**
	* Removes the association between the CRM Contact and the CRM Tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTag the CRM Tag
	*/
	public void removeCrmTag(long pk, contact.manager.model.CrmTag crmTag);

	/**
	* Removes the association between the CRM Contact and the CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTagPKs the primary keys of the CRM Tags
	*/
	public void removeCrmTags(long pk, long[] crmTagPKs);

	/**
	* Removes the association between the CRM Contact and the CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTags the CRM Tags
	*/
	public void removeCrmTags(long pk,
		java.util.List<contact.manager.model.CrmTag> crmTags);

	/**
	* Sets the CRM Tags associated with the CRM Contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTagPKs the primary keys of the CRM Tags to be associated with the CRM Contact
	*/
	public void setCrmTags(long pk, long[] crmTagPKs);

	/**
	* Sets the CRM Tags associated with the CRM Contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTags the CRM Tags to be associated with the CRM Contact
	*/
	public void setCrmTags(long pk,
		java.util.List<contact.manager.model.CrmTag> crmTags);

	@Override
	public java.util.Set<String> getBadColumnNames();
}