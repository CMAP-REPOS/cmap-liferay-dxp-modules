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

import contact.manager.exception.NoSuchCrmMuniException;

import contact.manager.model.CrmMuni;

/**
 * The persistence interface for the CRM Muni service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmMuniPersistenceImpl
 * @see CrmMuniUtil
 * @generated
 */
@ProviderType
public interface CrmMuniPersistence extends BasePersistence<CrmMuni> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmMuniUtil} to access the CRM Muni persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM Munis where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Munis
	*/
	public java.util.List<CrmMuni> findByUuid(String uuid);

	/**
	* Returns a range of all the CRM Munis where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @return the range of matching CRM Munis
	*/
	public java.util.List<CrmMuni> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the CRM Munis where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Munis
	*/
	public java.util.List<CrmMuni> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Munis where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Munis
	*/
	public java.util.List<CrmMuni> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Muni in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Muni
	* @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	*/
	public CrmMuni findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException;

	/**
	* Returns the first CRM Muni in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	*/
	public CrmMuni fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator);

	/**
	* Returns the last CRM Muni in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Muni
	* @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	*/
	public CrmMuni findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException;

	/**
	* Returns the last CRM Muni in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	*/
	public CrmMuni fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator);

	/**
	* Returns the CRM Munis before and after the current CRM Muni in the ordered set where uuid = &#63;.
	*
	* @param crmMuniId the primary key of the current CRM Muni
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Muni
	* @throws NoSuchCrmMuniException if a CRM Muni with the primary key could not be found
	*/
	public CrmMuni[] findByUuid_PrevAndNext(long crmMuniId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException;

	/**
	* Removes all the CRM Munis where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of CRM Munis where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Munis
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the CRM Muni where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmMuniException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Muni
	* @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	*/
	public CrmMuni findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmMuniException;

	/**
	* Returns the CRM Muni where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	*/
	public CrmMuni fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the CRM Muni where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	*/
	public CrmMuni fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM Muni where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Muni that was removed
	*/
	public CrmMuni removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmMuniException;

	/**
	* Returns the number of CRM Munis where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Munis
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the CRM Munis where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Munis
	*/
	public java.util.List<CrmMuni> findByUuid_C(String uuid, long companyId);

	/**
	* Returns a range of all the CRM Munis where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @return the range of matching CRM Munis
	*/
	public java.util.List<CrmMuni> findByUuid_C(String uuid, long companyId,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM Munis where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Munis
	*/
	public java.util.List<CrmMuni> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Munis where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Munis
	*/
	public java.util.List<CrmMuni> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Muni in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Muni
	* @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	*/
	public CrmMuni findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException;

	/**
	* Returns the first CRM Muni in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	*/
	public CrmMuni fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator);

	/**
	* Returns the last CRM Muni in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Muni
	* @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	*/
	public CrmMuni findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException;

	/**
	* Returns the last CRM Muni in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	*/
	public CrmMuni fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator);

	/**
	* Returns the CRM Munis before and after the current CRM Muni in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmMuniId the primary key of the current CRM Muni
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Muni
	* @throws NoSuchCrmMuniException if a CRM Muni with the primary key could not be found
	*/
	public CrmMuni[] findByUuid_C_PrevAndNext(long crmMuniId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException;

	/**
	* Removes all the CRM Munis where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of CRM Munis where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Munis
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the CRM Munis where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching CRM Munis
	*/
	public java.util.List<CrmMuni> findByZipCode(String zipCode);

	/**
	* Returns a range of all the CRM Munis where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @return the range of matching CRM Munis
	*/
	public java.util.List<CrmMuni> findByZipCode(String zipCode, int start,
		int end);

	/**
	* Returns an ordered range of all the CRM Munis where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Munis
	*/
	public java.util.List<CrmMuni> findByZipCode(String zipCode, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Munis where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Munis
	*/
	public java.util.List<CrmMuni> findByZipCode(String zipCode, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Muni in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Muni
	* @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	*/
	public CrmMuni findByZipCode_First(String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException;

	/**
	* Returns the first CRM Muni in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	*/
	public CrmMuni fetchByZipCode_First(String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator);

	/**
	* Returns the last CRM Muni in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Muni
	* @throws NoSuchCrmMuniException if a matching CRM Muni could not be found
	*/
	public CrmMuni findByZipCode_Last(String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException;

	/**
	* Returns the last CRM Muni in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	*/
	public CrmMuni fetchByZipCode_Last(String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator);

	/**
	* Returns the CRM Munis before and after the current CRM Muni in the ordered set where zipCode = &#63;.
	*
	* @param crmMuniId the primary key of the current CRM Muni
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Muni
	* @throws NoSuchCrmMuniException if a CRM Muni with the primary key could not be found
	*/
	public CrmMuni[] findByZipCode_PrevAndNext(long crmMuniId, String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator)
		throws NoSuchCrmMuniException;

	/**
	* Removes all the CRM Munis where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public void removeByZipCode(String zipCode);

	/**
	* Returns the number of CRM Munis where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching CRM Munis
	*/
	public int countByZipCode(String zipCode);

	/**
	* Caches the CRM Muni in the entity cache if it is enabled.
	*
	* @param crmMuni the CRM Muni
	*/
	public void cacheResult(CrmMuni crmMuni);

	/**
	* Caches the CRM Munis in the entity cache if it is enabled.
	*
	* @param crmMunis the CRM Munis
	*/
	public void cacheResult(java.util.List<CrmMuni> crmMunis);

	/**
	* Creates a new CRM Muni with the primary key. Does not add the CRM Muni to the database.
	*
	* @param crmMuniId the primary key for the new CRM Muni
	* @return the new CRM Muni
	*/
	public CrmMuni create(long crmMuniId);

	/**
	* Removes the CRM Muni with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmMuniId the primary key of the CRM Muni
	* @return the CRM Muni that was removed
	* @throws NoSuchCrmMuniException if a CRM Muni with the primary key could not be found
	*/
	public CrmMuni remove(long crmMuniId) throws NoSuchCrmMuniException;

	public CrmMuni updateImpl(CrmMuni crmMuni);

	/**
	* Returns the CRM Muni with the primary key or throws a {@link NoSuchCrmMuniException} if it could not be found.
	*
	* @param crmMuniId the primary key of the CRM Muni
	* @return the CRM Muni
	* @throws NoSuchCrmMuniException if a CRM Muni with the primary key could not be found
	*/
	public CrmMuni findByPrimaryKey(long crmMuniId)
		throws NoSuchCrmMuniException;

	/**
	* Returns the CRM Muni with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmMuniId the primary key of the CRM Muni
	* @return the CRM Muni, or <code>null</code> if a CRM Muni with the primary key could not be found
	*/
	public CrmMuni fetchByPrimaryKey(long crmMuniId);

	@Override
	public java.util.Map<java.io.Serializable, CrmMuni> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM Munis.
	*
	* @return the CRM Munis
	*/
	public java.util.List<CrmMuni> findAll();

	/**
	* Returns a range of all the CRM Munis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @return the range of CRM Munis
	*/
	public java.util.List<CrmMuni> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM Munis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Munis
	*/
	public java.util.List<CrmMuni> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Munis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Munis
	*/
	public java.util.List<CrmMuni> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmMuni> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM Munis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM Munis.
	*
	* @return the number of CRM Munis
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}