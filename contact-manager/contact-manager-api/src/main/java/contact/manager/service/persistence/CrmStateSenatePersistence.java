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

import contact.manager.exception.NoSuchCrmStateSenateException;

import contact.manager.model.CrmStateSenate;

/**
 * The persistence interface for the CRM State Senate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmStateSenatePersistenceImpl
 * @see CrmStateSenateUtil
 * @generated
 */
@ProviderType
public interface CrmStateSenatePersistence extends BasePersistence<CrmStateSenate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmStateSenateUtil} to access the CRM State Senate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM State Senates where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the CRM State Senates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @return the range of matching CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM State Senates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator);

	/**
	* Returns an ordered range of all the CRM State Senates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM State Senate in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Senate
	* @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException;

	/**
	* Returns the first CRM State Senate in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator);

	/**
	* Returns the last CRM State Senate in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Senate
	* @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException;

	/**
	* Returns the last CRM State Senate in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator);

	/**
	* Returns the CRM State Senates before and after the current CRM State Senate in the ordered set where uuid = &#63;.
	*
	* @param crmStateSenateId the primary key of the current CRM State Senate
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM State Senate
	* @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	*/
	public CrmStateSenate[] findByUuid_PrevAndNext(long crmStateSenateId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException;

	/**
	* Removes all the CRM State Senates where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM State Senates where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM State Senates
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM State Senate where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmStateSenateException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM State Senate
	* @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmStateSenateException;

	/**
	* Returns the CRM State Senate where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the CRM State Senate where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM State Senate where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM State Senate that was removed
	*/
	public CrmStateSenate removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmStateSenateException;

	/**
	* Returns the number of CRM State Senates where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM State Senates
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM State Senates where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the CRM State Senates where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @return the range of matching CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM State Senates where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator);

	/**
	* Returns an ordered range of all the CRM State Senates where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Senate
	* @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException;

	/**
	* Returns the first CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator);

	/**
	* Returns the last CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Senate
	* @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException;

	/**
	* Returns the last CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator);

	/**
	* Returns the CRM State Senates before and after the current CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmStateSenateId the primary key of the current CRM State Senate
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM State Senate
	* @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	*/
	public CrmStateSenate[] findByUuid_C_PrevAndNext(long crmStateSenateId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException;

	/**
	* Removes all the CRM State Senates where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM State Senates where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM State Senates
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the CRM State Senates where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findByZipCode(
		java.lang.String zipCode);

	/**
	* Returns a range of all the CRM State Senates where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @return the range of matching CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findByZipCode(
		java.lang.String zipCode, int start, int end);

	/**
	* Returns an ordered range of all the CRM State Senates where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findByZipCode(
		java.lang.String zipCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator);

	/**
	* Returns an ordered range of all the CRM State Senates where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findByZipCode(
		java.lang.String zipCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM State Senate in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Senate
	* @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate findByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException;

	/**
	* Returns the first CRM State Senate in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate fetchByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator);

	/**
	* Returns the last CRM State Senate in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Senate
	* @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate findByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException;

	/**
	* Returns the last CRM State Senate in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public CrmStateSenate fetchByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator);

	/**
	* Returns the CRM State Senates before and after the current CRM State Senate in the ordered set where zipCode = &#63;.
	*
	* @param crmStateSenateId the primary key of the current CRM State Senate
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM State Senate
	* @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	*/
	public CrmStateSenate[] findByZipCode_PrevAndNext(long crmStateSenateId,
		java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator)
		throws NoSuchCrmStateSenateException;

	/**
	* Removes all the CRM State Senates where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public void removeByZipCode(java.lang.String zipCode);

	/**
	* Returns the number of CRM State Senates where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching CRM State Senates
	*/
	public int countByZipCode(java.lang.String zipCode);

	/**
	* Caches the CRM State Senate in the entity cache if it is enabled.
	*
	* @param crmStateSenate the CRM State Senate
	*/
	public void cacheResult(CrmStateSenate crmStateSenate);

	/**
	* Caches the CRM State Senates in the entity cache if it is enabled.
	*
	* @param crmStateSenates the CRM State Senates
	*/
	public void cacheResult(java.util.List<CrmStateSenate> crmStateSenates);

	/**
	* Creates a new CRM State Senate with the primary key. Does not add the CRM State Senate to the database.
	*
	* @param crmStateSenateId the primary key for the new CRM State Senate
	* @return the new CRM State Senate
	*/
	public CrmStateSenate create(long crmStateSenateId);

	/**
	* Removes the CRM State Senate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmStateSenateId the primary key of the CRM State Senate
	* @return the CRM State Senate that was removed
	* @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	*/
	public CrmStateSenate remove(long crmStateSenateId)
		throws NoSuchCrmStateSenateException;

	public CrmStateSenate updateImpl(CrmStateSenate crmStateSenate);

	/**
	* Returns the CRM State Senate with the primary key or throws a {@link NoSuchCrmStateSenateException} if it could not be found.
	*
	* @param crmStateSenateId the primary key of the CRM State Senate
	* @return the CRM State Senate
	* @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	*/
	public CrmStateSenate findByPrimaryKey(long crmStateSenateId)
		throws NoSuchCrmStateSenateException;

	/**
	* Returns the CRM State Senate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmStateSenateId the primary key of the CRM State Senate
	* @return the CRM State Senate, or <code>null</code> if a CRM State Senate with the primary key could not be found
	*/
	public CrmStateSenate fetchByPrimaryKey(long crmStateSenateId);

	@Override
	public java.util.Map<java.io.Serializable, CrmStateSenate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM State Senates.
	*
	* @return the CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findAll();

	/**
	* Returns a range of all the CRM State Senates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @return the range of CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM State Senates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator);

	/**
	* Returns an ordered range of all the CRM State Senates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM State Senates
	*/
	public java.util.List<CrmStateSenate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmStateSenate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM State Senates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM State Senates.
	*
	* @return the number of CRM State Senates
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}