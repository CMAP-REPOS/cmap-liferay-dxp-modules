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

import contact.manager.exception.NoSuchCrmCountyException;

import contact.manager.model.CrmCounty;

/**
 * The persistence interface for the CRM County service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmCountyPersistenceImpl
 * @see CrmCountyUtil
 * @generated
 */
@ProviderType
public interface CrmCountyPersistence extends BasePersistence<CrmCounty> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmCountyUtil} to access the CRM County persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM Counties where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Counties
	*/
	public java.util.List<CrmCounty> findByUuid(String uuid);

	/**
	* Returns a range of all the CRM Counties where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @return the range of matching CRM Counties
	*/
	public java.util.List<CrmCounty> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the CRM Counties where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Counties
	*/
	public java.util.List<CrmCounty> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Counties where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Counties
	*/
	public java.util.List<CrmCounty> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM County in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public CrmCounty findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator)
		throws NoSuchCrmCountyException;

	/**
	* Returns the first CRM County in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public CrmCounty fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator);

	/**
	* Returns the last CRM County in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public CrmCounty findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator)
		throws NoSuchCrmCountyException;

	/**
	* Returns the last CRM County in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public CrmCounty fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator);

	/**
	* Returns the CRM Counties before and after the current CRM County in the ordered set where uuid = &#63;.
	*
	* @param crmCountyId the primary key of the current CRM County
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM County
	* @throws NoSuchCrmCountyException if a CRM County with the primary key could not be found
	*/
	public CrmCounty[] findByUuid_PrevAndNext(long crmCountyId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator)
		throws NoSuchCrmCountyException;

	/**
	* Removes all the CRM Counties where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of CRM Counties where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Counties
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the CRM County where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmCountyException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public CrmCounty findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmCountyException;

	/**
	* Returns the CRM County where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public CrmCounty fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the CRM County where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public CrmCounty fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM County where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM County that was removed
	*/
	public CrmCounty removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmCountyException;

	/**
	* Returns the number of CRM Counties where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Counties
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the CRM Counties where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Counties
	*/
	public java.util.List<CrmCounty> findByUuid_C(String uuid, long companyId);

	/**
	* Returns a range of all the CRM Counties where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @return the range of matching CRM Counties
	*/
	public java.util.List<CrmCounty> findByUuid_C(String uuid, long companyId,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM Counties where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Counties
	*/
	public java.util.List<CrmCounty> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Counties where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Counties
	*/
	public java.util.List<CrmCounty> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM County in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public CrmCounty findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator)
		throws NoSuchCrmCountyException;

	/**
	* Returns the first CRM County in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public CrmCounty fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator);

	/**
	* Returns the last CRM County in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public CrmCounty findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator)
		throws NoSuchCrmCountyException;

	/**
	* Returns the last CRM County in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public CrmCounty fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator);

	/**
	* Returns the CRM Counties before and after the current CRM County in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmCountyId the primary key of the current CRM County
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM County
	* @throws NoSuchCrmCountyException if a CRM County with the primary key could not be found
	*/
	public CrmCounty[] findByUuid_C_PrevAndNext(long crmCountyId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator)
		throws NoSuchCrmCountyException;

	/**
	* Removes all the CRM Counties where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of CRM Counties where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Counties
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the CRM Counties where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching CRM Counties
	*/
	public java.util.List<CrmCounty> findByZipCode(String zipCode);

	/**
	* Returns a range of all the CRM Counties where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @return the range of matching CRM Counties
	*/
	public java.util.List<CrmCounty> findByZipCode(String zipCode, int start,
		int end);

	/**
	* Returns an ordered range of all the CRM Counties where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Counties
	*/
	public java.util.List<CrmCounty> findByZipCode(String zipCode, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Counties where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Counties
	*/
	public java.util.List<CrmCounty> findByZipCode(String zipCode, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM County in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public CrmCounty findByZipCode_First(String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator)
		throws NoSuchCrmCountyException;

	/**
	* Returns the first CRM County in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public CrmCounty fetchByZipCode_First(String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator);

	/**
	* Returns the last CRM County in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public CrmCounty findByZipCode_Last(String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator)
		throws NoSuchCrmCountyException;

	/**
	* Returns the last CRM County in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public CrmCounty fetchByZipCode_Last(String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator);

	/**
	* Returns the CRM Counties before and after the current CRM County in the ordered set where zipCode = &#63;.
	*
	* @param crmCountyId the primary key of the current CRM County
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM County
	* @throws NoSuchCrmCountyException if a CRM County with the primary key could not be found
	*/
	public CrmCounty[] findByZipCode_PrevAndNext(long crmCountyId,
		String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator)
		throws NoSuchCrmCountyException;

	/**
	* Removes all the CRM Counties where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public void removeByZipCode(String zipCode);

	/**
	* Returns the number of CRM Counties where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching CRM Counties
	*/
	public int countByZipCode(String zipCode);

	/**
	* Caches the CRM County in the entity cache if it is enabled.
	*
	* @param crmCounty the CRM County
	*/
	public void cacheResult(CrmCounty crmCounty);

	/**
	* Caches the CRM Counties in the entity cache if it is enabled.
	*
	* @param crmCounties the CRM Counties
	*/
	public void cacheResult(java.util.List<CrmCounty> crmCounties);

	/**
	* Creates a new CRM County with the primary key. Does not add the CRM County to the database.
	*
	* @param crmCountyId the primary key for the new CRM County
	* @return the new CRM County
	*/
	public CrmCounty create(long crmCountyId);

	/**
	* Removes the CRM County with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmCountyId the primary key of the CRM County
	* @return the CRM County that was removed
	* @throws NoSuchCrmCountyException if a CRM County with the primary key could not be found
	*/
	public CrmCounty remove(long crmCountyId) throws NoSuchCrmCountyException;

	public CrmCounty updateImpl(CrmCounty crmCounty);

	/**
	* Returns the CRM County with the primary key or throws a {@link NoSuchCrmCountyException} if it could not be found.
	*
	* @param crmCountyId the primary key of the CRM County
	* @return the CRM County
	* @throws NoSuchCrmCountyException if a CRM County with the primary key could not be found
	*/
	public CrmCounty findByPrimaryKey(long crmCountyId)
		throws NoSuchCrmCountyException;

	/**
	* Returns the CRM County with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmCountyId the primary key of the CRM County
	* @return the CRM County, or <code>null</code> if a CRM County with the primary key could not be found
	*/
	public CrmCounty fetchByPrimaryKey(long crmCountyId);

	@Override
	public java.util.Map<java.io.Serializable, CrmCounty> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM Counties.
	*
	* @return the CRM Counties
	*/
	public java.util.List<CrmCounty> findAll();

	/**
	* Returns a range of all the CRM Counties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @return the range of CRM Counties
	*/
	public java.util.List<CrmCounty> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM Counties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Counties
	*/
	public java.util.List<CrmCounty> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Counties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Counties
	*/
	public java.util.List<CrmCounty> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCounty> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM Counties from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM Counties.
	*
	* @return the number of CRM Counties
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}