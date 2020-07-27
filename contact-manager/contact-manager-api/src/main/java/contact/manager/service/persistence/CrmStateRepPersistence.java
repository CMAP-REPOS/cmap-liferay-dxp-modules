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
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.exception.NoSuchCrmStateRepException;
import contact.manager.model.CrmStateRep;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the CRM State Rep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateRepUtil
 * @generated
 */
@ProviderType
public interface CrmStateRepPersistence extends BasePersistence<CrmStateRep> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmStateRepUtil} to access the CRM State Rep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, CrmStateRep> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the CRM State Reps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM State Reps
	 */
	public java.util.List<CrmStateRep> findByUuid(String uuid);

	/**
	 * Returns a range of all the CRM State Reps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @return the range of matching CRM State Reps
	 */
	public java.util.List<CrmStateRep> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the CRM State Reps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM State Reps
	 */
	@Deprecated
	public java.util.List<CrmStateRep> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM State Reps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM State Reps
	 */
	public java.util.List<CrmStateRep> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator);

	/**
	 * Returns the first CRM State Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	public CrmStateRep findByUuid_First(
			String uuid, OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	 * Returns the first CRM State Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	public CrmStateRep fetchByUuid_First(
		String uuid, OrderByComparator<CrmStateRep> orderByComparator);

	/**
	 * Returns the last CRM State Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	public CrmStateRep findByUuid_Last(
			String uuid, OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	 * Returns the last CRM State Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	public CrmStateRep fetchByUuid_Last(
		String uuid, OrderByComparator<CrmStateRep> orderByComparator);

	/**
	 * Returns the CRM State Reps before and after the current CRM State Rep in the ordered set where uuid = &#63;.
	 *
	 * @param crmStateRepId the primary key of the current CRM State Rep
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM State Rep
	 * @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	 */
	public CrmStateRep[] findByUuid_PrevAndNext(
			long crmStateRepId, String uuid,
			OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	 * Removes all the CRM State Reps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of CRM State Reps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM State Reps
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the CRM State Rep where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCrmStateRepException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	public CrmStateRep findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmStateRepException;

	/**
	 * Returns the CRM State Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	@Deprecated
	public CrmStateRep fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Returns the CRM State Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	public CrmStateRep fetchByUUID_G(String uuid, long groupId);

	/**
	 * Removes the CRM State Rep where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM State Rep that was removed
	 */
	public CrmStateRep removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmStateRepException;

	/**
	 * Returns the number of CRM State Reps where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM State Reps
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM State Reps
	 */
	public java.util.List<CrmStateRep> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @return the range of matching CRM State Reps
	 */
	public java.util.List<CrmStateRep> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM State Reps
	 */
	@Deprecated
	public java.util.List<CrmStateRep> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM State Reps
	 */
	public java.util.List<CrmStateRep> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator);

	/**
	 * Returns the first CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	public CrmStateRep findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	 * Returns the first CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	public CrmStateRep fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator);

	/**
	 * Returns the last CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	public CrmStateRep findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	 * Returns the last CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	public CrmStateRep fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator);

	/**
	 * Returns the CRM State Reps before and after the current CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmStateRepId the primary key of the current CRM State Rep
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM State Rep
	 * @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	 */
	public CrmStateRep[] findByUuid_C_PrevAndNext(
			long crmStateRepId, String uuid, long companyId,
			OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	 * Removes all the CRM State Reps where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of CRM State Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM State Reps
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the CRM State Reps where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching CRM State Reps
	 */
	public java.util.List<CrmStateRep> findByZipCode(String zipCode);

	/**
	 * Returns a range of all the CRM State Reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @return the range of matching CRM State Reps
	 */
	public java.util.List<CrmStateRep> findByZipCode(
		String zipCode, int start, int end);

	/**
	 * Returns an ordered range of all the CRM State Reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByZipCode(String, int, int, OrderByComparator)}
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM State Reps
	 */
	@Deprecated
	public java.util.List<CrmStateRep> findByZipCode(
		String zipCode, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM State Reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM State Reps
	 */
	public java.util.List<CrmStateRep> findByZipCode(
		String zipCode, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator);

	/**
	 * Returns the first CRM State Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	public CrmStateRep findByZipCode_First(
			String zipCode, OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	 * Returns the first CRM State Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	public CrmStateRep fetchByZipCode_First(
		String zipCode, OrderByComparator<CrmStateRep> orderByComparator);

	/**
	 * Returns the last CRM State Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Rep
	 * @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	 */
	public CrmStateRep findByZipCode_Last(
			String zipCode, OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	 * Returns the last CRM State Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	public CrmStateRep fetchByZipCode_Last(
		String zipCode, OrderByComparator<CrmStateRep> orderByComparator);

	/**
	 * Returns the CRM State Reps before and after the current CRM State Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param crmStateRepId the primary key of the current CRM State Rep
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM State Rep
	 * @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	 */
	public CrmStateRep[] findByZipCode_PrevAndNext(
			long crmStateRepId, String zipCode,
			OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	 * Removes all the CRM State Reps where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	public void removeByZipCode(String zipCode);

	/**
	 * Returns the number of CRM State Reps where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching CRM State Reps
	 */
	public int countByZipCode(String zipCode);

	/**
	 * Caches the CRM State Rep in the entity cache if it is enabled.
	 *
	 * @param crmStateRep the CRM State Rep
	 */
	public void cacheResult(CrmStateRep crmStateRep);

	/**
	 * Caches the CRM State Reps in the entity cache if it is enabled.
	 *
	 * @param crmStateReps the CRM State Reps
	 */
	public void cacheResult(java.util.List<CrmStateRep> crmStateReps);

	/**
	 * Creates a new CRM State Rep with the primary key. Does not add the CRM State Rep to the database.
	 *
	 * @param crmStateRepId the primary key for the new CRM State Rep
	 * @return the new CRM State Rep
	 */
	public CrmStateRep create(long crmStateRepId);

	/**
	 * Removes the CRM State Rep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmStateRepId the primary key of the CRM State Rep
	 * @return the CRM State Rep that was removed
	 * @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	 */
	public CrmStateRep remove(long crmStateRepId)
		throws NoSuchCrmStateRepException;

	public CrmStateRep updateImpl(CrmStateRep crmStateRep);

	/**
	 * Returns the CRM State Rep with the primary key or throws a <code>NoSuchCrmStateRepException</code> if it could not be found.
	 *
	 * @param crmStateRepId the primary key of the CRM State Rep
	 * @return the CRM State Rep
	 * @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	 */
	public CrmStateRep findByPrimaryKey(long crmStateRepId)
		throws NoSuchCrmStateRepException;

	/**
	 * Returns the CRM State Rep with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmStateRepId the primary key of the CRM State Rep
	 * @return the CRM State Rep, or <code>null</code> if a CRM State Rep with the primary key could not be found
	 */
	public CrmStateRep fetchByPrimaryKey(long crmStateRepId);

	/**
	 * Returns all the CRM State Reps.
	 *
	 * @return the CRM State Reps
	 */
	public java.util.List<CrmStateRep> findAll();

	/**
	 * Returns a range of all the CRM State Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @return the range of CRM State Reps
	 */
	public java.util.List<CrmStateRep> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the CRM State Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of CRM State Reps
	 */
	@Deprecated
	public java.util.List<CrmStateRep> findAll(
		int start, int end, OrderByComparator<CrmStateRep> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM State Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM State Reps
	 */
	public java.util.List<CrmStateRep> findAll(
		int start, int end, OrderByComparator<CrmStateRep> orderByComparator);

	/**
	 * Removes all the CRM State Reps from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of CRM State Reps.
	 *
	 * @return the number of CRM State Reps
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}