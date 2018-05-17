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
	public java.util.List<CrmContact> findByUuid(java.lang.String uuid);

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
	public java.util.List<CrmContact> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<CrmContact> findByUuid(java.lang.String uuid,
		int start, int end,
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
	public java.util.List<CrmContact> findByUuid(java.lang.String uuid,
		int start, int end,
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
	public CrmContact findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the first CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator);

	/**
	* Returns the last CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Returns the last CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByUuid_Last(java.lang.String uuid,
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
	public CrmContact[] findByUuid_PrevAndNext(long crmContactId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Removes all the CRM Contacts where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM Contacts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Contacts
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM Contact where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmContactException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public CrmContact findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmContactException;

	/**
	* Returns the CRM Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the CRM Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public CrmContact fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM Contact where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Contact that was removed
	*/
	public CrmContact removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmContactException;

	/**
	* Returns the number of CRM Contacts where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Contacts
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Contacts
	*/
	public java.util.List<CrmContact> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<CrmContact> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<CrmContact> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
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
	public java.util.List<CrmContact> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
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
	public CrmContact findByUuid_C_First(java.lang.String uuid, long companyId,
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
	public CrmContact fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
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
	public CrmContact findByUuid_C_Last(java.lang.String uuid, long companyId,
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
	public CrmContact fetchByUuid_C_Last(java.lang.String uuid, long companyId,
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
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContact> orderByComparator)
		throws NoSuchCrmContactException;

	/**
	* Removes all the CRM Contacts where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM Contacts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Contacts
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

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

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}