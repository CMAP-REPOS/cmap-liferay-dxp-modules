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

import contact.manager.exception.NoSuchCrmUsRepException;

import contact.manager.model.CrmUsRep;

/**
 * The persistence interface for the CRM US Rep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmUsRepPersistenceImpl
 * @see CrmUsRepUtil
 * @generated
 */
@ProviderType
public interface CrmUsRepPersistence extends BasePersistence<CrmUsRep> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmUsRepUtil} to access the CRM US Rep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM US Reps where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM US Reps
	*/
	public java.util.List<CrmUsRep> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the CRM US Reps where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM US Reps
	* @param end the upper bound of the range of CRM US Reps (not inclusive)
	* @return the range of matching CRM US Reps
	*/
	public java.util.List<CrmUsRep> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM US Reps where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM US Reps
	* @param end the upper bound of the range of CRM US Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM US Reps
	*/
	public java.util.List<CrmUsRep> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator);

	/**
	* Returns an ordered range of all the CRM US Reps where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM US Reps
	* @param end the upper bound of the range of CRM US Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM US Reps
	*/
	public java.util.List<CrmUsRep> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM US Rep in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM US Rep
	* @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	*/
	public CrmUsRep findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException;

	/**
	* Returns the first CRM US Rep in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	*/
	public CrmUsRep fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator);

	/**
	* Returns the last CRM US Rep in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM US Rep
	* @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	*/
	public CrmUsRep findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException;

	/**
	* Returns the last CRM US Rep in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	*/
	public CrmUsRep fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator);

	/**
	* Returns the CRM US Reps before and after the current CRM US Rep in the ordered set where uuid = &#63;.
	*
	* @param crmUsRepId the primary key of the current CRM US Rep
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM US Rep
	* @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	*/
	public CrmUsRep[] findByUuid_PrevAndNext(long crmUsRepId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException;

	/**
	* Removes all the CRM US Reps where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM US Reps where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM US Reps
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM US Rep where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmUsRepException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM US Rep
	* @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	*/
	public CrmUsRep findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmUsRepException;

	/**
	* Returns the CRM US Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	*/
	public CrmUsRep fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the CRM US Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	*/
	public CrmUsRep fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM US Rep where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM US Rep that was removed
	*/
	public CrmUsRep removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmUsRepException;

	/**
	* Returns the number of CRM US Reps where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM US Reps
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM US Reps where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM US Reps
	*/
	public java.util.List<CrmUsRep> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the CRM US Reps where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM US Reps
	* @param end the upper bound of the range of CRM US Reps (not inclusive)
	* @return the range of matching CRM US Reps
	*/
	public java.util.List<CrmUsRep> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM US Reps where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM US Reps
	* @param end the upper bound of the range of CRM US Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM US Reps
	*/
	public java.util.List<CrmUsRep> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator);

	/**
	* Returns an ordered range of all the CRM US Reps where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM US Reps
	* @param end the upper bound of the range of CRM US Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM US Reps
	*/
	public java.util.List<CrmUsRep> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM US Rep
	* @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	*/
	public CrmUsRep findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException;

	/**
	* Returns the first CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	*/
	public CrmUsRep fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator);

	/**
	* Returns the last CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM US Rep
	* @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	*/
	public CrmUsRep findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException;

	/**
	* Returns the last CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	*/
	public CrmUsRep fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator);

	/**
	* Returns the CRM US Reps before and after the current CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmUsRepId the primary key of the current CRM US Rep
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM US Rep
	* @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	*/
	public CrmUsRep[] findByUuid_C_PrevAndNext(long crmUsRepId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException;

	/**
	* Removes all the CRM US Reps where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM US Reps where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM US Reps
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the CRM US Reps where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching CRM US Reps
	*/
	public java.util.List<CrmUsRep> findByZipCode(java.lang.String zipCode);

	/**
	* Returns a range of all the CRM US Reps where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM US Reps
	* @param end the upper bound of the range of CRM US Reps (not inclusive)
	* @return the range of matching CRM US Reps
	*/
	public java.util.List<CrmUsRep> findByZipCode(java.lang.String zipCode,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM US Reps where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM US Reps
	* @param end the upper bound of the range of CRM US Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM US Reps
	*/
	public java.util.List<CrmUsRep> findByZipCode(java.lang.String zipCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator);

	/**
	* Returns an ordered range of all the CRM US Reps where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM US Reps
	* @param end the upper bound of the range of CRM US Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM US Reps
	*/
	public java.util.List<CrmUsRep> findByZipCode(java.lang.String zipCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM US Rep in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM US Rep
	* @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	*/
	public CrmUsRep findByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException;

	/**
	* Returns the first CRM US Rep in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	*/
	public CrmUsRep fetchByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator);

	/**
	* Returns the last CRM US Rep in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM US Rep
	* @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	*/
	public CrmUsRep findByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException;

	/**
	* Returns the last CRM US Rep in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	*/
	public CrmUsRep fetchByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator);

	/**
	* Returns the CRM US Reps before and after the current CRM US Rep in the ordered set where zipCode = &#63;.
	*
	* @param crmUsRepId the primary key of the current CRM US Rep
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM US Rep
	* @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	*/
	public CrmUsRep[] findByZipCode_PrevAndNext(long crmUsRepId,
		java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator)
		throws NoSuchCrmUsRepException;

	/**
	* Removes all the CRM US Reps where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public void removeByZipCode(java.lang.String zipCode);

	/**
	* Returns the number of CRM US Reps where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching CRM US Reps
	*/
	public int countByZipCode(java.lang.String zipCode);

	/**
	* Caches the CRM US Rep in the entity cache if it is enabled.
	*
	* @param crmUsRep the CRM US Rep
	*/
	public void cacheResult(CrmUsRep crmUsRep);

	/**
	* Caches the CRM US Reps in the entity cache if it is enabled.
	*
	* @param crmUsReps the CRM US Reps
	*/
	public void cacheResult(java.util.List<CrmUsRep> crmUsReps);

	/**
	* Creates a new CRM US Rep with the primary key. Does not add the CRM US Rep to the database.
	*
	* @param crmUsRepId the primary key for the new CRM US Rep
	* @return the new CRM US Rep
	*/
	public CrmUsRep create(long crmUsRepId);

	/**
	* Removes the CRM US Rep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmUsRepId the primary key of the CRM US Rep
	* @return the CRM US Rep that was removed
	* @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	*/
	public CrmUsRep remove(long crmUsRepId) throws NoSuchCrmUsRepException;

	public CrmUsRep updateImpl(CrmUsRep crmUsRep);

	/**
	* Returns the CRM US Rep with the primary key or throws a {@link NoSuchCrmUsRepException} if it could not be found.
	*
	* @param crmUsRepId the primary key of the CRM US Rep
	* @return the CRM US Rep
	* @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	*/
	public CrmUsRep findByPrimaryKey(long crmUsRepId)
		throws NoSuchCrmUsRepException;

	/**
	* Returns the CRM US Rep with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmUsRepId the primary key of the CRM US Rep
	* @return the CRM US Rep, or <code>null</code> if a CRM US Rep with the primary key could not be found
	*/
	public CrmUsRep fetchByPrimaryKey(long crmUsRepId);

	@Override
	public java.util.Map<java.io.Serializable, CrmUsRep> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM US Reps.
	*
	* @return the CRM US Reps
	*/
	public java.util.List<CrmUsRep> findAll();

	/**
	* Returns a range of all the CRM US Reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM US Reps
	* @param end the upper bound of the range of CRM US Reps (not inclusive)
	* @return the range of CRM US Reps
	*/
	public java.util.List<CrmUsRep> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM US Reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM US Reps
	* @param end the upper bound of the range of CRM US Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM US Reps
	*/
	public java.util.List<CrmUsRep> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator);

	/**
	* Returns an ordered range of all the CRM US Reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmUsRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM US Reps
	* @param end the upper bound of the range of CRM US Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM US Reps
	*/
	public java.util.List<CrmUsRep> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmUsRep> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM US Reps from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM US Reps.
	*
	* @return the number of CRM US Reps
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}