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

import contact.manager.exception.NoSuchCrmKioskContactException;

import contact.manager.model.CrmKioskContact;

/**
 * The persistence interface for the CRM Kiosk Contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmKioskContactPersistenceImpl
 * @see CrmKioskContactUtil
 * @generated
 */
@ProviderType
public interface CrmKioskContactPersistence extends BasePersistence<CrmKioskContact> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmKioskContactUtil} to access the CRM Kiosk Contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM Kiosk Contacts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Kiosk Contacts
	*/
	public java.util.List<CrmKioskContact> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the CRM Kiosk Contacts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @return the range of matching CRM Kiosk Contacts
	*/
	public java.util.List<CrmKioskContact> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM Kiosk Contacts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Kiosk Contacts
	*/
	public java.util.List<CrmKioskContact> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Kiosk Contacts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Kiosk Contacts
	*/
	public java.util.List<CrmKioskContact> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Kiosk Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	*/
	public CrmKioskContact findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator)
		throws NoSuchCrmKioskContactException;

	/**
	* Returns the first CRM Kiosk Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	public CrmKioskContact fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator);

	/**
	* Returns the last CRM Kiosk Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	*/
	public CrmKioskContact findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator)
		throws NoSuchCrmKioskContactException;

	/**
	* Returns the last CRM Kiosk Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	public CrmKioskContact fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator);

	/**
	* Returns the CRM Kiosk Contacts before and after the current CRM Kiosk Contact in the ordered set where uuid = &#63;.
	*
	* @param crmKioskContactId the primary key of the current CRM Kiosk Contact
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	*/
	public CrmKioskContact[] findByUuid_PrevAndNext(long crmKioskContactId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator)
		throws NoSuchCrmKioskContactException;

	/**
	* Removes all the CRM Kiosk Contacts where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM Kiosk Contacts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Kiosk Contacts
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM Kiosk Contact where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmKioskContactException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	*/
	public CrmKioskContact findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmKioskContactException;

	/**
	* Returns the CRM Kiosk Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	public CrmKioskContact fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the CRM Kiosk Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	public CrmKioskContact fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM Kiosk Contact where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Kiosk Contact that was removed
	*/
	public CrmKioskContact removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmKioskContactException;

	/**
	* Returns the number of CRM Kiosk Contacts where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Kiosk Contacts
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Kiosk Contacts
	*/
	public java.util.List<CrmKioskContact> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @return the range of matching CRM Kiosk Contacts
	*/
	public java.util.List<CrmKioskContact> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Kiosk Contacts
	*/
	public java.util.List<CrmKioskContact> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Kiosk Contacts
	*/
	public java.util.List<CrmKioskContact> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	*/
	public CrmKioskContact findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator)
		throws NoSuchCrmKioskContactException;

	/**
	* Returns the first CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	public CrmKioskContact fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator);

	/**
	* Returns the last CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	*/
	public CrmKioskContact findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator)
		throws NoSuchCrmKioskContactException;

	/**
	* Returns the last CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	public CrmKioskContact fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator);

	/**
	* Returns the CRM Kiosk Contacts before and after the current CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmKioskContactId the primary key of the current CRM Kiosk Contact
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	*/
	public CrmKioskContact[] findByUuid_C_PrevAndNext(long crmKioskContactId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator)
		throws NoSuchCrmKioskContactException;

	/**
	* Removes all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Kiosk Contacts
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the CRM Kiosk Contact in the entity cache if it is enabled.
	*
	* @param crmKioskContact the CRM Kiosk Contact
	*/
	public void cacheResult(CrmKioskContact crmKioskContact);

	/**
	* Caches the CRM Kiosk Contacts in the entity cache if it is enabled.
	*
	* @param crmKioskContacts the CRM Kiosk Contacts
	*/
	public void cacheResult(java.util.List<CrmKioskContact> crmKioskContacts);

	/**
	* Creates a new CRM Kiosk Contact with the primary key. Does not add the CRM Kiosk Contact to the database.
	*
	* @param crmKioskContactId the primary key for the new CRM Kiosk Contact
	* @return the new CRM Kiosk Contact
	*/
	public CrmKioskContact create(long crmKioskContactId);

	/**
	* Removes the CRM Kiosk Contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmKioskContactId the primary key of the CRM Kiosk Contact
	* @return the CRM Kiosk Contact that was removed
	* @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	*/
	public CrmKioskContact remove(long crmKioskContactId)
		throws NoSuchCrmKioskContactException;

	public CrmKioskContact updateImpl(CrmKioskContact crmKioskContact);

	/**
	* Returns the CRM Kiosk Contact with the primary key or throws a {@link NoSuchCrmKioskContactException} if it could not be found.
	*
	* @param crmKioskContactId the primary key of the CRM Kiosk Contact
	* @return the CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	*/
	public CrmKioskContact findByPrimaryKey(long crmKioskContactId)
		throws NoSuchCrmKioskContactException;

	/**
	* Returns the CRM Kiosk Contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmKioskContactId the primary key of the CRM Kiosk Contact
	* @return the CRM Kiosk Contact, or <code>null</code> if a CRM Kiosk Contact with the primary key could not be found
	*/
	public CrmKioskContact fetchByPrimaryKey(long crmKioskContactId);

	@Override
	public java.util.Map<java.io.Serializable, CrmKioskContact> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM Kiosk Contacts.
	*
	* @return the CRM Kiosk Contacts
	*/
	public java.util.List<CrmKioskContact> findAll();

	/**
	* Returns a range of all the CRM Kiosk Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @return the range of CRM Kiosk Contacts
	*/
	public java.util.List<CrmKioskContact> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM Kiosk Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Kiosk Contacts
	*/
	public java.util.List<CrmKioskContact> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Kiosk Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Kiosk Contacts
	*/
	public java.util.List<CrmKioskContact> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM Kiosk Contacts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM Kiosk Contacts.
	*
	* @return the number of CRM Kiosk Contacts
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}