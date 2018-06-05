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

import contact.manager.exception.NoSuchCrmOutreachLogException;

import contact.manager.model.CrmOutreachLog;

/**
 * The persistence interface for the CRM Outreach Log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmOutreachLogPersistenceImpl
 * @see CrmOutreachLogUtil
 * @generated
 */
@ProviderType
public interface CrmOutreachLogPersistence extends BasePersistence<CrmOutreachLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmOutreachLogUtil} to access the CRM Outreach Log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM Outreach Logs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the CRM Outreach Logs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @return the range of matching CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM Outreach Logs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Outreach Logs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Outreach Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException;

	/**
	* Returns the first CRM Outreach Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator);

	/**
	* Returns the last CRM Outreach Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException;

	/**
	* Returns the last CRM Outreach Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator);

	/**
	* Returns the CRM Outreach Logs before and after the current CRM Outreach Log in the ordered set where uuid = &#63;.
	*
	* @param crmOutreachLogId the primary key of the current CRM Outreach Log
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	*/
	public CrmOutreachLog[] findByUuid_PrevAndNext(long crmOutreachLogId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException;

	/**
	* Removes all the CRM Outreach Logs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM Outreach Logs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Outreach Logs
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM Outreach Log where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmOutreachLogException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmOutreachLogException;

	/**
	* Returns the CRM Outreach Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the CRM Outreach Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM Outreach Log where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Outreach Log that was removed
	*/
	public CrmOutreachLog removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmOutreachLogException;

	/**
	* Returns the number of CRM Outreach Logs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Outreach Logs
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @return the range of matching CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException;

	/**
	* Returns the first CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator);

	/**
	* Returns the last CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException;

	/**
	* Returns the last CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator);

	/**
	* Returns the CRM Outreach Logs before and after the current CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmOutreachLogId the primary key of the current CRM Outreach Log
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	*/
	public CrmOutreachLog[] findByUuid_C_PrevAndNext(long crmOutreachLogId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException;

	/**
	* Removes all the CRM Outreach Logs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Outreach Logs
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the CRM Outreach Logs where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @return the matching CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findByCrmContactId(long crmContactId);

	/**
	* Returns a range of all the CRM Outreach Logs where crmContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param crmContactId the crm contact ID
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @return the range of matching CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findByCrmContactId(
		long crmContactId, int start, int end);

	/**
	* Returns an ordered range of all the CRM Outreach Logs where crmContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param crmContactId the crm contact ID
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findByCrmContactId(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Outreach Logs where crmContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param crmContactId the crm contact ID
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findByCrmContactId(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Outreach Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog findByCrmContactId_First(long crmContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException;

	/**
	* Returns the first CRM Outreach Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog fetchByCrmContactId_First(long crmContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator);

	/**
	* Returns the last CRM Outreach Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog findByCrmContactId_Last(long crmContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException;

	/**
	* Returns the last CRM Outreach Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public CrmOutreachLog fetchByCrmContactId_Last(long crmContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator);

	/**
	* Returns the CRM Outreach Logs before and after the current CRM Outreach Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmOutreachLogId the primary key of the current CRM Outreach Log
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	*/
	public CrmOutreachLog[] findByCrmContactId_PrevAndNext(
		long crmOutreachLogId, long crmContactId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator)
		throws NoSuchCrmOutreachLogException;

	/**
	* Removes all the CRM Outreach Logs where crmContactId = &#63; from the database.
	*
	* @param crmContactId the crm contact ID
	*/
	public void removeByCrmContactId(long crmContactId);

	/**
	* Returns the number of CRM Outreach Logs where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @return the number of matching CRM Outreach Logs
	*/
	public int countByCrmContactId(long crmContactId);

	/**
	* Caches the CRM Outreach Log in the entity cache if it is enabled.
	*
	* @param crmOutreachLog the CRM Outreach Log
	*/
	public void cacheResult(CrmOutreachLog crmOutreachLog);

	/**
	* Caches the CRM Outreach Logs in the entity cache if it is enabled.
	*
	* @param crmOutreachLogs the CRM Outreach Logs
	*/
	public void cacheResult(java.util.List<CrmOutreachLog> crmOutreachLogs);

	/**
	* Creates a new CRM Outreach Log with the primary key. Does not add the CRM Outreach Log to the database.
	*
	* @param crmOutreachLogId the primary key for the new CRM Outreach Log
	* @return the new CRM Outreach Log
	*/
	public CrmOutreachLog create(long crmOutreachLogId);

	/**
	* Removes the CRM Outreach Log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmOutreachLogId the primary key of the CRM Outreach Log
	* @return the CRM Outreach Log that was removed
	* @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	*/
	public CrmOutreachLog remove(long crmOutreachLogId)
		throws NoSuchCrmOutreachLogException;

	public CrmOutreachLog updateImpl(CrmOutreachLog crmOutreachLog);

	/**
	* Returns the CRM Outreach Log with the primary key or throws a {@link NoSuchCrmOutreachLogException} if it could not be found.
	*
	* @param crmOutreachLogId the primary key of the CRM Outreach Log
	* @return the CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	*/
	public CrmOutreachLog findByPrimaryKey(long crmOutreachLogId)
		throws NoSuchCrmOutreachLogException;

	/**
	* Returns the CRM Outreach Log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmOutreachLogId the primary key of the CRM Outreach Log
	* @return the CRM Outreach Log, or <code>null</code> if a CRM Outreach Log with the primary key could not be found
	*/
	public CrmOutreachLog fetchByPrimaryKey(long crmOutreachLogId);

	@Override
	public java.util.Map<java.io.Serializable, CrmOutreachLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM Outreach Logs.
	*
	* @return the CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findAll();

	/**
	* Returns a range of all the CRM Outreach Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @return the range of CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM Outreach Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Outreach Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Outreach Logs
	*/
	public java.util.List<CrmOutreachLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmOutreachLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM Outreach Logs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM Outreach Logs.
	*
	* @return the number of CRM Outreach Logs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}