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

import contact.manager.exception.NoSuchCrmLTAException;
import contact.manager.model.CrmLTA;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the CRM LTA service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmLTAUtil
 * @generated
 */
@ProviderType
public interface CrmLTAPersistence extends BasePersistence<CrmLTA> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmLTAUtil} to access the CRM LTA persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, CrmLTA> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the CRM LTAs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM LTAs
	 */
	public java.util.List<CrmLTA> findByUuid(String uuid);

	/**
	 * Returns a range of all the CRM LTAs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @return the range of matching CRM LTAs
	 */
	public java.util.List<CrmLTA> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the CRM LTAs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM LTAs
	 */
	@Deprecated
	public java.util.List<CrmLTA> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmLTA> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM LTAs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM LTAs
	 */
	public java.util.List<CrmLTA> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmLTA> orderByComparator);

	/**
	 * Returns the first CRM LTA in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM LTA
	 * @throws NoSuchCrmLTAException if a matching CRM LTA could not be found
	 */
	public CrmLTA findByUuid_First(
			String uuid, OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	 * Returns the first CRM LTA in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	 */
	public CrmLTA fetchByUuid_First(
		String uuid, OrderByComparator<CrmLTA> orderByComparator);

	/**
	 * Returns the last CRM LTA in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM LTA
	 * @throws NoSuchCrmLTAException if a matching CRM LTA could not be found
	 */
	public CrmLTA findByUuid_Last(
			String uuid, OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	 * Returns the last CRM LTA in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	 */
	public CrmLTA fetchByUuid_Last(
		String uuid, OrderByComparator<CrmLTA> orderByComparator);

	/**
	 * Returns the CRM LTAs before and after the current CRM LTA in the ordered set where uuid = &#63;.
	 *
	 * @param crmLTAId the primary key of the current CRM LTA
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM LTA
	 * @throws NoSuchCrmLTAException if a CRM LTA with the primary key could not be found
	 */
	public CrmLTA[] findByUuid_PrevAndNext(
			long crmLTAId, String uuid,
			OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	 * Removes all the CRM LTAs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of CRM LTAs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM LTAs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the CRM LTA where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCrmLTAException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM LTA
	 * @throws NoSuchCrmLTAException if a matching CRM LTA could not be found
	 */
	public CrmLTA findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmLTAException;

	/**
	 * Returns the CRM LTA where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	 */
	@Deprecated
	public CrmLTA fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Returns the CRM LTA where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	 */
	public CrmLTA fetchByUUID_G(String uuid, long groupId);

	/**
	 * Removes the CRM LTA where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM LTA that was removed
	 */
	public CrmLTA removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmLTAException;

	/**
	 * Returns the number of CRM LTAs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM LTAs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the CRM LTAs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM LTAs
	 */
	public java.util.List<CrmLTA> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the CRM LTAs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @return the range of matching CRM LTAs
	 */
	public java.util.List<CrmLTA> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the CRM LTAs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM LTAs
	 */
	@Deprecated
	public java.util.List<CrmLTA> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmLTA> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM LTAs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM LTAs
	 */
	public java.util.List<CrmLTA> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmLTA> orderByComparator);

	/**
	 * Returns the first CRM LTA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM LTA
	 * @throws NoSuchCrmLTAException if a matching CRM LTA could not be found
	 */
	public CrmLTA findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	 * Returns the first CRM LTA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	 */
	public CrmLTA fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CrmLTA> orderByComparator);

	/**
	 * Returns the last CRM LTA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM LTA
	 * @throws NoSuchCrmLTAException if a matching CRM LTA could not be found
	 */
	public CrmLTA findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	 * Returns the last CRM LTA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	 */
	public CrmLTA fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CrmLTA> orderByComparator);

	/**
	 * Returns the CRM LTAs before and after the current CRM LTA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmLTAId the primary key of the current CRM LTA
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM LTA
	 * @throws NoSuchCrmLTAException if a CRM LTA with the primary key could not be found
	 */
	public CrmLTA[] findByUuid_C_PrevAndNext(
			long crmLTAId, String uuid, long companyId,
			OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	 * Removes all the CRM LTAs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of CRM LTAs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM LTAs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the CRM LTAs where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching CRM LTAs
	 */
	public java.util.List<CrmLTA> findByZipCode(String zipCode);

	/**
	 * Returns a range of all the CRM LTAs where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @return the range of matching CRM LTAs
	 */
	public java.util.List<CrmLTA> findByZipCode(
		String zipCode, int start, int end);

	/**
	 * Returns an ordered range of all the CRM LTAs where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByZipCode(String, int, int, OrderByComparator)}
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM LTAs
	 */
	@Deprecated
	public java.util.List<CrmLTA> findByZipCode(
		String zipCode, int start, int end,
		OrderByComparator<CrmLTA> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM LTAs where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM LTAs
	 */
	public java.util.List<CrmLTA> findByZipCode(
		String zipCode, int start, int end,
		OrderByComparator<CrmLTA> orderByComparator);

	/**
	 * Returns the first CRM LTA in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM LTA
	 * @throws NoSuchCrmLTAException if a matching CRM LTA could not be found
	 */
	public CrmLTA findByZipCode_First(
			String zipCode, OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	 * Returns the first CRM LTA in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	 */
	public CrmLTA fetchByZipCode_First(
		String zipCode, OrderByComparator<CrmLTA> orderByComparator);

	/**
	 * Returns the last CRM LTA in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM LTA
	 * @throws NoSuchCrmLTAException if a matching CRM LTA could not be found
	 */
	public CrmLTA findByZipCode_Last(
			String zipCode, OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	 * Returns the last CRM LTA in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	 */
	public CrmLTA fetchByZipCode_Last(
		String zipCode, OrderByComparator<CrmLTA> orderByComparator);

	/**
	 * Returns the CRM LTAs before and after the current CRM LTA in the ordered set where zipCode = &#63;.
	 *
	 * @param crmLTAId the primary key of the current CRM LTA
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM LTA
	 * @throws NoSuchCrmLTAException if a CRM LTA with the primary key could not be found
	 */
	public CrmLTA[] findByZipCode_PrevAndNext(
			long crmLTAId, String zipCode,
			OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	 * Removes all the CRM LTAs where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	public void removeByZipCode(String zipCode);

	/**
	 * Returns the number of CRM LTAs where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching CRM LTAs
	 */
	public int countByZipCode(String zipCode);

	/**
	 * Caches the CRM LTA in the entity cache if it is enabled.
	 *
	 * @param crmLTA the CRM LTA
	 */
	public void cacheResult(CrmLTA crmLTA);

	/**
	 * Caches the CRM LTAs in the entity cache if it is enabled.
	 *
	 * @param crmLTAs the CRM LTAs
	 */
	public void cacheResult(java.util.List<CrmLTA> crmLTAs);

	/**
	 * Creates a new CRM LTA with the primary key. Does not add the CRM LTA to the database.
	 *
	 * @param crmLTAId the primary key for the new CRM LTA
	 * @return the new CRM LTA
	 */
	public CrmLTA create(long crmLTAId);

	/**
	 * Removes the CRM LTA with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmLTAId the primary key of the CRM LTA
	 * @return the CRM LTA that was removed
	 * @throws NoSuchCrmLTAException if a CRM LTA with the primary key could not be found
	 */
	public CrmLTA remove(long crmLTAId) throws NoSuchCrmLTAException;

	public CrmLTA updateImpl(CrmLTA crmLTA);

	/**
	 * Returns the CRM LTA with the primary key or throws a <code>NoSuchCrmLTAException</code> if it could not be found.
	 *
	 * @param crmLTAId the primary key of the CRM LTA
	 * @return the CRM LTA
	 * @throws NoSuchCrmLTAException if a CRM LTA with the primary key could not be found
	 */
	public CrmLTA findByPrimaryKey(long crmLTAId) throws NoSuchCrmLTAException;

	/**
	 * Returns the CRM LTA with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmLTAId the primary key of the CRM LTA
	 * @return the CRM LTA, or <code>null</code> if a CRM LTA with the primary key could not be found
	 */
	public CrmLTA fetchByPrimaryKey(long crmLTAId);

	/**
	 * Returns all the CRM LTAs.
	 *
	 * @return the CRM LTAs
	 */
	public java.util.List<CrmLTA> findAll();

	/**
	 * Returns a range of all the CRM LTAs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @return the range of CRM LTAs
	 */
	public java.util.List<CrmLTA> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the CRM LTAs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of CRM LTAs
	 */
	@Deprecated
	public java.util.List<CrmLTA> findAll(
		int start, int end, OrderByComparator<CrmLTA> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM LTAs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM LTAs
	 */
	public java.util.List<CrmLTA> findAll(
		int start, int end, OrderByComparator<CrmLTA> orderByComparator);

	/**
	 * Removes all the CRM LTAs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of CRM LTAs.
	 *
	 * @return the number of CRM LTAs
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}