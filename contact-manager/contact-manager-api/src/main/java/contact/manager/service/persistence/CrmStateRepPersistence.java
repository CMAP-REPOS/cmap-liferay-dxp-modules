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

import contact.manager.exception.NoSuchCrmStateRepException;

import contact.manager.model.CrmStateRep;

/**
 * The persistence interface for the CRM State Rep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmStateRepPersistenceImpl
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

	/**
	* Returns all the CRM State Reps where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM State Reps
	*/
	public java.util.List<CrmStateRep> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the CRM State Reps where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM State Reps
	* @param end the upper bound of the range of CRM State Reps (not inclusive)
	* @return the range of matching CRM State Reps
	*/
	public java.util.List<CrmStateRep> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM State Reps where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM State Reps
	* @param end the upper bound of the range of CRM State Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM State Reps
	*/
	public java.util.List<CrmStateRep> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator);

	/**
	* Returns an ordered range of all the CRM State Reps where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM State Reps
	* @param end the upper bound of the range of CRM State Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM State Reps
	*/
	public java.util.List<CrmStateRep> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM State Rep in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Rep
	* @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	*/
	public CrmStateRep findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	* Returns the first CRM State Rep in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public CrmStateRep fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator);

	/**
	* Returns the last CRM State Rep in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Rep
	* @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	*/
	public CrmStateRep findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	* Returns the last CRM State Rep in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public CrmStateRep fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator);

	/**
	* Returns the CRM State Reps before and after the current CRM State Rep in the ordered set where uuid = &#63;.
	*
	* @param crmStateRepId the primary key of the current CRM State Rep
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM State Rep
	* @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	*/
	public CrmStateRep[] findByUuid_PrevAndNext(long crmStateRepId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	* Removes all the CRM State Reps where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM State Reps where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM State Reps
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM State Rep where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmStateRepException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM State Rep
	* @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	*/
	public CrmStateRep findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmStateRepException;

	/**
	* Returns the CRM State Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public CrmStateRep fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the CRM State Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public CrmStateRep fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM State Rep where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM State Rep that was removed
	*/
	public CrmStateRep removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmStateRepException;

	/**
	* Returns the number of CRM State Reps where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM State Reps
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM State Reps
	*/
	public java.util.List<CrmStateRep> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM State Reps
	* @param end the upper bound of the range of CRM State Reps (not inclusive)
	* @return the range of matching CRM State Reps
	*/
	public java.util.List<CrmStateRep> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM State Reps
	* @param end the upper bound of the range of CRM State Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM State Reps
	*/
	public java.util.List<CrmStateRep> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator);

	/**
	* Returns an ordered range of all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM State Reps
	* @param end the upper bound of the range of CRM State Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM State Reps
	*/
	public java.util.List<CrmStateRep> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Rep
	* @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	*/
	public CrmStateRep findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	* Returns the first CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public CrmStateRep fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator);

	/**
	* Returns the last CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Rep
	* @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	*/
	public CrmStateRep findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	* Returns the last CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public CrmStateRep fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator);

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
	public CrmStateRep[] findByUuid_C_PrevAndNext(long crmStateRepId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator)
		throws NoSuchCrmStateRepException;

	/**
	* Removes all the CRM State Reps where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM State Reps where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM State Reps
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

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
	* Returns the CRM State Rep with the primary key or throws a {@link NoSuchCrmStateRepException} if it could not be found.
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

	@Override
	public java.util.Map<java.io.Serializable, CrmStateRep> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM State Reps
	* @param end the upper bound of the range of CRM State Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM State Reps
	*/
	public java.util.List<CrmStateRep> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator);

	/**
	* Returns an ordered range of all the CRM State Reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM State Reps
	* @param end the upper bound of the range of CRM State Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM State Reps
	*/
	public java.util.List<CrmStateRep> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateRep> orderByComparator,
		boolean retrieveFromCache);

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
	public java.util.Set<java.lang.String> getBadColumnNames();
}