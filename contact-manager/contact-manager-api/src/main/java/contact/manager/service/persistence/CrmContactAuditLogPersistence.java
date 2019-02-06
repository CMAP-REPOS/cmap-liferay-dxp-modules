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

import contact.manager.exception.NoSuchCrmContactAuditLogException;

import contact.manager.model.CrmContactAuditLog;

/**
 * The persistence interface for the CRM Contact Audit Log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmContactAuditLogPersistenceImpl
 * @see CrmContactAuditLogUtil
 * @generated
 */
@ProviderType
public interface CrmContactAuditLogPersistence extends BasePersistence<CrmContactAuditLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmContactAuditLogUtil} to access the CRM Contact Audit Log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM Contact Audit Logs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByUuid(String uuid);

	/**
	* Returns a range of all the CRM Contact Audit Logs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @return the range of matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByUuid(String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByUuid(String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByUuid(String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns the CRM Contact Audit Logs before and after the current CRM Contact Audit Log in the ordered set where uuid = &#63;.
	*
	* @param crmContactAuditLogId the primary key of the current CRM Contact Audit Log
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	*/
	public CrmContactAuditLog[] findByUuid_PrevAndNext(
		long crmContactAuditLogId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Removes all the CRM Contact Audit Logs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of CRM Contact Audit Logs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Contact Audit Logs
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the CRM Contact Audit Log where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmContactAuditLogException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Returns the CRM Contact Audit Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the CRM Contact Audit Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM Contact Audit Log where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Contact Audit Log that was removed
	*/
	public CrmContactAuditLog removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Returns the number of CRM Contact Audit Logs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Contact Audit Logs
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByUuid_C(String uuid,
		long companyId);

	/**
	* Returns a range of all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @return the range of matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByUuid_C(String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByUuid_C(String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByUuid_C(String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns the CRM Contact Audit Logs before and after the current CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmContactAuditLogId the primary key of the current CRM Contact Audit Log
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	*/
	public CrmContactAuditLog[] findByUuid_C_PrevAndNext(
		long crmContactAuditLogId, String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Removes all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Contact Audit Logs
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the CRM Contact Audit Logs where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @return the matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByCrmContactId(
		long crmContactId);

	/**
	* Returns a range of all the CRM Contact Audit Logs where crmContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param crmContactId the crm contact ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @return the range of matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByCrmContactId(
		long crmContactId, int start, int end);

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where crmContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param crmContactId the crm contact ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByCrmContactId(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where crmContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param crmContactId the crm contact ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByCrmContactId(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog findByCrmContactId_First(long crmContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog fetchByCrmContactId_First(long crmContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog findByCrmContactId_Last(long crmContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog fetchByCrmContactId_Last(long crmContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns the CRM Contact Audit Logs before and after the current CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactAuditLogId the primary key of the current CRM Contact Audit Log
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	*/
	public CrmContactAuditLog[] findByCrmContactId_PrevAndNext(
		long crmContactAuditLogId, long crmContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Removes all the CRM Contact Audit Logs where crmContactId = &#63; from the database.
	*
	* @param crmContactId the crm contact ID
	*/
	public void removeByCrmContactId(long crmContactId);

	/**
	* Returns the number of CRM Contact Audit Logs where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @return the number of matching CRM Contact Audit Logs
	*/
	public int countByCrmContactId(long crmContactId);

	/**
	* Returns all the CRM Contact Audit Logs where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @return the matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByConstantContactId(
		long constantContactId);

	/**
	* Returns a range of all the CRM Contact Audit Logs where constantContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param constantContactId the constant contact ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @return the range of matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByConstantContactId(
		long constantContactId, int start, int end);

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where constantContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param constantContactId the constant contact ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByConstantContactId(
		long constantContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where constantContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param constantContactId the constant contact ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findByConstantContactId(
		long constantContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog findByConstantContactId_First(
		long constantContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog fetchByConstantContactId_First(
		long constantContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog findByConstantContactId_Last(
		long constantContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public CrmContactAuditLog fetchByConstantContactId_Last(
		long constantContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns the CRM Contact Audit Logs before and after the current CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	*
	* @param crmContactAuditLogId the primary key of the current CRM Contact Audit Log
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	*/
	public CrmContactAuditLog[] findByConstantContactId_PrevAndNext(
		long crmContactAuditLogId, long constantContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Removes all the CRM Contact Audit Logs where constantContactId = &#63; from the database.
	*
	* @param constantContactId the constant contact ID
	*/
	public void removeByConstantContactId(long constantContactId);

	/**
	* Returns the number of CRM Contact Audit Logs where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @return the number of matching CRM Contact Audit Logs
	*/
	public int countByConstantContactId(long constantContactId);

	/**
	* Caches the CRM Contact Audit Log in the entity cache if it is enabled.
	*
	* @param crmContactAuditLog the CRM Contact Audit Log
	*/
	public void cacheResult(CrmContactAuditLog crmContactAuditLog);

	/**
	* Caches the CRM Contact Audit Logs in the entity cache if it is enabled.
	*
	* @param crmContactAuditLogs the CRM Contact Audit Logs
	*/
	public void cacheResult(
		java.util.List<CrmContactAuditLog> crmContactAuditLogs);

	/**
	* Creates a new CRM Contact Audit Log with the primary key. Does not add the CRM Contact Audit Log to the database.
	*
	* @param crmContactAuditLogId the primary key for the new CRM Contact Audit Log
	* @return the new CRM Contact Audit Log
	*/
	public CrmContactAuditLog create(long crmContactAuditLogId);

	/**
	* Removes the CRM Contact Audit Log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	* @return the CRM Contact Audit Log that was removed
	* @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	*/
	public CrmContactAuditLog remove(long crmContactAuditLogId)
		throws NoSuchCrmContactAuditLogException;

	public CrmContactAuditLog updateImpl(CrmContactAuditLog crmContactAuditLog);

	/**
	* Returns the CRM Contact Audit Log with the primary key or throws a {@link NoSuchCrmContactAuditLogException} if it could not be found.
	*
	* @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	* @return the CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	*/
	public CrmContactAuditLog findByPrimaryKey(long crmContactAuditLogId)
		throws NoSuchCrmContactAuditLogException;

	/**
	* Returns the CRM Contact Audit Log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	* @return the CRM Contact Audit Log, or <code>null</code> if a CRM Contact Audit Log with the primary key could not be found
	*/
	public CrmContactAuditLog fetchByPrimaryKey(long crmContactAuditLogId);

	@Override
	public java.util.Map<java.io.Serializable, CrmContactAuditLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM Contact Audit Logs.
	*
	* @return the CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findAll();

	/**
	* Returns a range of all the CRM Contact Audit Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @return the range of CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Contact Audit Logs
	*/
	public java.util.List<CrmContactAuditLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM Contact Audit Logs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM Contact Audit Logs.
	*
	* @return the number of CRM Contact Audit Logs
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}