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

import contact.manager.exception.NoSuchCrmCCAException;
import contact.manager.model.CrmCCA;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the CRM CCA service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmCCAUtil
 * @generated
 */
@ProviderType
public interface CrmCCAPersistence extends BasePersistence<CrmCCA> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmCCAUtil} to access the CRM CCA persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, CrmCCA> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the CRM CCAs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM CCAs
	 */
	public java.util.List<CrmCCA> findByUuid(String uuid);

	/**
	 * Returns a range of all the CRM CCAs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCCAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @return the range of matching CRM CCAs
	 */
	public java.util.List<CrmCCA> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the CRM CCAs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCCAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM CCAs
	 */
	@Deprecated
	public java.util.List<CrmCCA> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmCCA> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM CCAs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCCAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM CCAs
	 */
	public java.util.List<CrmCCA> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmCCA> orderByComparator);

	/**
	 * Returns the first CRM CCA in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	public CrmCCA findByUuid_First(
			String uuid, OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException;

	/**
	 * Returns the first CRM CCA in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	public CrmCCA fetchByUuid_First(
		String uuid, OrderByComparator<CrmCCA> orderByComparator);

	/**
	 * Returns the last CRM CCA in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	public CrmCCA findByUuid_Last(
			String uuid, OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException;

	/**
	 * Returns the last CRM CCA in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	public CrmCCA fetchByUuid_Last(
		String uuid, OrderByComparator<CrmCCA> orderByComparator);

	/**
	 * Returns the CRM CCAs before and after the current CRM CCA in the ordered set where uuid = &#63;.
	 *
	 * @param crmCCAId the primary key of the current CRM CCA
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM CCA
	 * @throws NoSuchCrmCCAException if a CRM CCA with the primary key could not be found
	 */
	public CrmCCA[] findByUuid_PrevAndNext(
			long crmCCAId, String uuid,
			OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException;

	/**
	 * Removes all the CRM CCAs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of CRM CCAs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM CCAs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the CRM CCA where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCrmCCAException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	public CrmCCA findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmCCAException;

	/**
	 * Returns the CRM CCA where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	@Deprecated
	public CrmCCA fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Returns the CRM CCA where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	public CrmCCA fetchByUUID_G(String uuid, long groupId);

	/**
	 * Removes the CRM CCA where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM CCA that was removed
	 */
	public CrmCCA removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmCCAException;

	/**
	 * Returns the number of CRM CCAs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM CCAs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the CRM CCAs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM CCAs
	 */
	public java.util.List<CrmCCA> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the CRM CCAs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCCAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @return the range of matching CRM CCAs
	 */
	public java.util.List<CrmCCA> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the CRM CCAs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCCAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM CCAs
	 */
	@Deprecated
	public java.util.List<CrmCCA> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmCCA> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM CCAs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCCAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM CCAs
	 */
	public java.util.List<CrmCCA> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmCCA> orderByComparator);

	/**
	 * Returns the first CRM CCA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	public CrmCCA findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException;

	/**
	 * Returns the first CRM CCA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	public CrmCCA fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CrmCCA> orderByComparator);

	/**
	 * Returns the last CRM CCA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	public CrmCCA findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException;

	/**
	 * Returns the last CRM CCA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	public CrmCCA fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CrmCCA> orderByComparator);

	/**
	 * Returns the CRM CCAs before and after the current CRM CCA in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmCCAId the primary key of the current CRM CCA
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM CCA
	 * @throws NoSuchCrmCCAException if a CRM CCA with the primary key could not be found
	 */
	public CrmCCA[] findByUuid_C_PrevAndNext(
			long crmCCAId, String uuid, long companyId,
			OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException;

	/**
	 * Removes all the CRM CCAs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of CRM CCAs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM CCAs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the CRM CCAs where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching CRM CCAs
	 */
	public java.util.List<CrmCCA> findByZipCode(String zipCode);

	/**
	 * Returns a range of all the CRM CCAs where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCCAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @return the range of matching CRM CCAs
	 */
	public java.util.List<CrmCCA> findByZipCode(
		String zipCode, int start, int end);

	/**
	 * Returns an ordered range of all the CRM CCAs where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCCAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByZipCode(String, int, int, OrderByComparator)}
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM CCAs
	 */
	@Deprecated
	public java.util.List<CrmCCA> findByZipCode(
		String zipCode, int start, int end,
		OrderByComparator<CrmCCA> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM CCAs where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCCAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM CCAs
	 */
	public java.util.List<CrmCCA> findByZipCode(
		String zipCode, int start, int end,
		OrderByComparator<CrmCCA> orderByComparator);

	/**
	 * Returns the first CRM CCA in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	public CrmCCA findByZipCode_First(
			String zipCode, OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException;

	/**
	 * Returns the first CRM CCA in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	public CrmCCA fetchByZipCode_First(
		String zipCode, OrderByComparator<CrmCCA> orderByComparator);

	/**
	 * Returns the last CRM CCA in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM CCA
	 * @throws NoSuchCrmCCAException if a matching CRM CCA could not be found
	 */
	public CrmCCA findByZipCode_Last(
			String zipCode, OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException;

	/**
	 * Returns the last CRM CCA in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	 */
	public CrmCCA fetchByZipCode_Last(
		String zipCode, OrderByComparator<CrmCCA> orderByComparator);

	/**
	 * Returns the CRM CCAs before and after the current CRM CCA in the ordered set where zipCode = &#63;.
	 *
	 * @param crmCCAId the primary key of the current CRM CCA
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM CCA
	 * @throws NoSuchCrmCCAException if a CRM CCA with the primary key could not be found
	 */
	public CrmCCA[] findByZipCode_PrevAndNext(
			long crmCCAId, String zipCode,
			OrderByComparator<CrmCCA> orderByComparator)
		throws NoSuchCrmCCAException;

	/**
	 * Removes all the CRM CCAs where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	public void removeByZipCode(String zipCode);

	/**
	 * Returns the number of CRM CCAs where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching CRM CCAs
	 */
	public int countByZipCode(String zipCode);

	/**
	 * Caches the CRM CCA in the entity cache if it is enabled.
	 *
	 * @param crmCCA the CRM CCA
	 */
	public void cacheResult(CrmCCA crmCCA);

	/**
	 * Caches the CRM CCAs in the entity cache if it is enabled.
	 *
	 * @param crmCCAs the CRM CCAs
	 */
	public void cacheResult(java.util.List<CrmCCA> crmCCAs);

	/**
	 * Creates a new CRM CCA with the primary key. Does not add the CRM CCA to the database.
	 *
	 * @param crmCCAId the primary key for the new CRM CCA
	 * @return the new CRM CCA
	 */
	public CrmCCA create(long crmCCAId);

	/**
	 * Removes the CRM CCA with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmCCAId the primary key of the CRM CCA
	 * @return the CRM CCA that was removed
	 * @throws NoSuchCrmCCAException if a CRM CCA with the primary key could not be found
	 */
	public CrmCCA remove(long crmCCAId) throws NoSuchCrmCCAException;

	public CrmCCA updateImpl(CrmCCA crmCCA);

	/**
	 * Returns the CRM CCA with the primary key or throws a <code>NoSuchCrmCCAException</code> if it could not be found.
	 *
	 * @param crmCCAId the primary key of the CRM CCA
	 * @return the CRM CCA
	 * @throws NoSuchCrmCCAException if a CRM CCA with the primary key could not be found
	 */
	public CrmCCA findByPrimaryKey(long crmCCAId) throws NoSuchCrmCCAException;

	/**
	 * Returns the CRM CCA with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmCCAId the primary key of the CRM CCA
	 * @return the CRM CCA, or <code>null</code> if a CRM CCA with the primary key could not be found
	 */
	public CrmCCA fetchByPrimaryKey(long crmCCAId);

	/**
	 * Returns all the CRM CCAs.
	 *
	 * @return the CRM CCAs
	 */
	public java.util.List<CrmCCA> findAll();

	/**
	 * Returns a range of all the CRM CCAs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCCAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @return the range of CRM CCAs
	 */
	public java.util.List<CrmCCA> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the CRM CCAs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCCAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of CRM CCAs
	 */
	@Deprecated
	public java.util.List<CrmCCA> findAll(
		int start, int end, OrderByComparator<CrmCCA> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM CCAs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmCCAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM CCAs
	 * @param end the upper bound of the range of CRM CCAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM CCAs
	 */
	public java.util.List<CrmCCA> findAll(
		int start, int end, OrderByComparator<CrmCCA> orderByComparator);

	/**
	 * Removes all the CRM CCAs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of CRM CCAs.
	 *
	 * @return the number of CRM CCAs
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}