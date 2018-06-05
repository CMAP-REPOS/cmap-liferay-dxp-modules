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

import contact.manager.exception.NoSuchCrmChiWardException;

import contact.manager.model.CrmChiWard;

/**
 * The persistence interface for the CRM Chi Ward service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmChiWardPersistenceImpl
 * @see CrmChiWardUtil
 * @generated
 */
@ProviderType
public interface CrmChiWardPersistence extends BasePersistence<CrmChiWard> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmChiWardUtil} to access the CRM Chi Ward persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM Chi Wards where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the CRM Chi Wards where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @return the range of matching CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM Chi Wards where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Chi Wards where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Chi Ward in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException;

	/**
	* Returns the first CRM Chi Ward in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator);

	/**
	* Returns the last CRM Chi Ward in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException;

	/**
	* Returns the last CRM Chi Ward in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator);

	/**
	* Returns the CRM Chi Wards before and after the current CRM Chi Ward in the ordered set where uuid = &#63;.
	*
	* @param crmChiWardId the primary key of the current CRM Chi Ward
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	*/
	public CrmChiWard[] findByUuid_PrevAndNext(long crmChiWardId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException;

	/**
	* Removes all the CRM Chi Wards where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM Chi Wards where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Chi Wards
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM Chi Ward where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmChiWardException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmChiWardException;

	/**
	* Returns the CRM Chi Ward where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the CRM Chi Ward where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM Chi Ward where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Chi Ward that was removed
	*/
	public CrmChiWard removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmChiWardException;

	/**
	* Returns the number of CRM Chi Wards where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Chi Wards
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM Chi Wards where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the CRM Chi Wards where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @return the range of matching CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM Chi Wards where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Chi Wards where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException;

	/**
	* Returns the first CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator);

	/**
	* Returns the last CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException;

	/**
	* Returns the last CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator);

	/**
	* Returns the CRM Chi Wards before and after the current CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmChiWardId the primary key of the current CRM Chi Ward
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	*/
	public CrmChiWard[] findByUuid_C_PrevAndNext(long crmChiWardId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException;

	/**
	* Removes all the CRM Chi Wards where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM Chi Wards where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Chi Wards
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the CRM Chi Wards where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findByZipCode(java.lang.String zipCode);

	/**
	* Returns a range of all the CRM Chi Wards where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @return the range of matching CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findByZipCode(java.lang.String zipCode,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM Chi Wards where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findByZipCode(java.lang.String zipCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Chi Wards where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findByZipCode(java.lang.String zipCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Chi Ward in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard findByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException;

	/**
	* Returns the first CRM Chi Ward in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard fetchByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator);

	/**
	* Returns the last CRM Chi Ward in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard findByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException;

	/**
	* Returns the last CRM Chi Ward in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public CrmChiWard fetchByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator);

	/**
	* Returns the CRM Chi Wards before and after the current CRM Chi Ward in the ordered set where zipCode = &#63;.
	*
	* @param crmChiWardId the primary key of the current CRM Chi Ward
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	*/
	public CrmChiWard[] findByZipCode_PrevAndNext(long crmChiWardId,
		java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator)
		throws NoSuchCrmChiWardException;

	/**
	* Removes all the CRM Chi Wards where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public void removeByZipCode(java.lang.String zipCode);

	/**
	* Returns the number of CRM Chi Wards where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching CRM Chi Wards
	*/
	public int countByZipCode(java.lang.String zipCode);

	/**
	* Caches the CRM Chi Ward in the entity cache if it is enabled.
	*
	* @param crmChiWard the CRM Chi Ward
	*/
	public void cacheResult(CrmChiWard crmChiWard);

	/**
	* Caches the CRM Chi Wards in the entity cache if it is enabled.
	*
	* @param crmChiWards the CRM Chi Wards
	*/
	public void cacheResult(java.util.List<CrmChiWard> crmChiWards);

	/**
	* Creates a new CRM Chi Ward with the primary key. Does not add the CRM Chi Ward to the database.
	*
	* @param crmChiWardId the primary key for the new CRM Chi Ward
	* @return the new CRM Chi Ward
	*/
	public CrmChiWard create(long crmChiWardId);

	/**
	* Removes the CRM Chi Ward with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmChiWardId the primary key of the CRM Chi Ward
	* @return the CRM Chi Ward that was removed
	* @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	*/
	public CrmChiWard remove(long crmChiWardId)
		throws NoSuchCrmChiWardException;

	public CrmChiWard updateImpl(CrmChiWard crmChiWard);

	/**
	* Returns the CRM Chi Ward with the primary key or throws a {@link NoSuchCrmChiWardException} if it could not be found.
	*
	* @param crmChiWardId the primary key of the CRM Chi Ward
	* @return the CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	*/
	public CrmChiWard findByPrimaryKey(long crmChiWardId)
		throws NoSuchCrmChiWardException;

	/**
	* Returns the CRM Chi Ward with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmChiWardId the primary key of the CRM Chi Ward
	* @return the CRM Chi Ward, or <code>null</code> if a CRM Chi Ward with the primary key could not be found
	*/
	public CrmChiWard fetchByPrimaryKey(long crmChiWardId);

	@Override
	public java.util.Map<java.io.Serializable, CrmChiWard> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM Chi Wards.
	*
	* @return the CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findAll();

	/**
	* Returns a range of all the CRM Chi Wards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @return the range of CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM Chi Wards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Chi Wards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Chi Wards
	*/
	public java.util.List<CrmChiWard> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmChiWard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM Chi Wards from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM Chi Wards.
	*
	* @return the number of CRM Chi Wards
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}