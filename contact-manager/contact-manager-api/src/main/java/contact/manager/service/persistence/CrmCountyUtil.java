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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.model.CrmCounty;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM County service. This utility wraps {@link contact.manager.service.persistence.impl.CrmCountyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmCountyPersistence
 * @see contact.manager.service.persistence.impl.CrmCountyPersistenceImpl
 * @generated
 */
@ProviderType
public class CrmCountyUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CrmCounty crmCounty) {
		getPersistence().clearCache(crmCounty);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CrmCounty> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmCounty> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmCounty> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmCounty> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmCounty update(CrmCounty crmCounty) {
		return getPersistence().update(crmCounty);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmCounty update(CrmCounty crmCounty,
		ServiceContext serviceContext) {
		return getPersistence().update(crmCounty, serviceContext);
	}

	/**
	* Returns all the CRM Counties where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Counties
	*/
	public static List<CrmCounty> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<CrmCounty> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<CrmCounty> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmCounty> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<CrmCounty> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmCounty> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM County in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public static CrmCounty findByUuid_First(String uuid,
		OrderByComparator<CrmCounty> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first CRM County in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public static CrmCounty fetchByUuid_First(String uuid,
		OrderByComparator<CrmCounty> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM County in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public static CrmCounty findByUuid_Last(String uuid,
		OrderByComparator<CrmCounty> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM County in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public static CrmCounty fetchByUuid_Last(String uuid,
		OrderByComparator<CrmCounty> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the CRM Counties before and after the current CRM County in the ordered set where uuid = &#63;.
	*
	* @param crmCountyId the primary key of the current CRM County
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM County
	* @throws NoSuchCrmCountyException if a CRM County with the primary key could not be found
	*/
	public static CrmCounty[] findByUuid_PrevAndNext(long crmCountyId,
		String uuid, OrderByComparator<CrmCounty> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence()
				   .findByUuid_PrevAndNext(crmCountyId, uuid, orderByComparator);
	}

	/**
	* Removes all the CRM Counties where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of CRM Counties where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Counties
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the CRM County where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmCountyException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public static CrmCounty findByUUID_G(String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM County where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public static CrmCounty fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM County where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public static CrmCounty fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the CRM County where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM County that was removed
	*/
	public static CrmCounty removeByUUID_G(String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of CRM Counties where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Counties
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the CRM Counties where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Counties
	*/
	public static List<CrmCounty> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<CrmCounty> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<CrmCounty> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<CrmCounty> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<CrmCounty> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<CrmCounty> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM County in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public static CrmCounty findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmCounty> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first CRM County in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public static CrmCounty fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmCounty> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM County in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public static CrmCounty findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmCounty> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM County in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public static CrmCounty fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmCounty> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static CrmCounty[] findByUuid_C_PrevAndNext(long crmCountyId,
		String uuid, long companyId,
		OrderByComparator<CrmCounty> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(crmCountyId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the CRM Counties where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of CRM Counties where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Counties
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the CRM Counties where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching CRM Counties
	*/
	public static List<CrmCounty> findByZipCode(String zipCode) {
		return getPersistence().findByZipCode(zipCode);
	}

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
	public static List<CrmCounty> findByZipCode(String zipCode, int start,
		int end) {
		return getPersistence().findByZipCode(zipCode, start, end);
	}

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
	public static List<CrmCounty> findByZipCode(String zipCode, int start,
		int end, OrderByComparator<CrmCounty> orderByComparator) {
		return getPersistence()
				   .findByZipCode(zipCode, start, end, orderByComparator);
	}

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
	public static List<CrmCounty> findByZipCode(String zipCode, int start,
		int end, OrderByComparator<CrmCounty> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByZipCode(zipCode, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM County in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public static CrmCounty findByZipCode_First(String zipCode,
		OrderByComparator<CrmCounty> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence().findByZipCode_First(zipCode, orderByComparator);
	}

	/**
	* Returns the first CRM County in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public static CrmCounty fetchByZipCode_First(String zipCode,
		OrderByComparator<CrmCounty> orderByComparator) {
		return getPersistence().fetchByZipCode_First(zipCode, orderByComparator);
	}

	/**
	* Returns the last CRM County in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County
	* @throws NoSuchCrmCountyException if a matching CRM County could not be found
	*/
	public static CrmCounty findByZipCode_Last(String zipCode,
		OrderByComparator<CrmCounty> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence().findByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	* Returns the last CRM County in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	public static CrmCounty fetchByZipCode_Last(String zipCode,
		OrderByComparator<CrmCounty> orderByComparator) {
		return getPersistence().fetchByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	* Returns the CRM Counties before and after the current CRM County in the ordered set where zipCode = &#63;.
	*
	* @param crmCountyId the primary key of the current CRM County
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM County
	* @throws NoSuchCrmCountyException if a CRM County with the primary key could not be found
	*/
	public static CrmCounty[] findByZipCode_PrevAndNext(long crmCountyId,
		String zipCode, OrderByComparator<CrmCounty> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence()
				   .findByZipCode_PrevAndNext(crmCountyId, zipCode,
			orderByComparator);
	}

	/**
	* Removes all the CRM Counties where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public static void removeByZipCode(String zipCode) {
		getPersistence().removeByZipCode(zipCode);
	}

	/**
	* Returns the number of CRM Counties where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching CRM Counties
	*/
	public static int countByZipCode(String zipCode) {
		return getPersistence().countByZipCode(zipCode);
	}

	/**
	* Caches the CRM County in the entity cache if it is enabled.
	*
	* @param crmCounty the CRM County
	*/
	public static void cacheResult(CrmCounty crmCounty) {
		getPersistence().cacheResult(crmCounty);
	}

	/**
	* Caches the CRM Counties in the entity cache if it is enabled.
	*
	* @param crmCounties the CRM Counties
	*/
	public static void cacheResult(List<CrmCounty> crmCounties) {
		getPersistence().cacheResult(crmCounties);
	}

	/**
	* Creates a new CRM County with the primary key. Does not add the CRM County to the database.
	*
	* @param crmCountyId the primary key for the new CRM County
	* @return the new CRM County
	*/
	public static CrmCounty create(long crmCountyId) {
		return getPersistence().create(crmCountyId);
	}

	/**
	* Removes the CRM County with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmCountyId the primary key of the CRM County
	* @return the CRM County that was removed
	* @throws NoSuchCrmCountyException if a CRM County with the primary key could not be found
	*/
	public static CrmCounty remove(long crmCountyId)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence().remove(crmCountyId);
	}

	public static CrmCounty updateImpl(CrmCounty crmCounty) {
		return getPersistence().updateImpl(crmCounty);
	}

	/**
	* Returns the CRM County with the primary key or throws a {@link NoSuchCrmCountyException} if it could not be found.
	*
	* @param crmCountyId the primary key of the CRM County
	* @return the CRM County
	* @throws NoSuchCrmCountyException if a CRM County with the primary key could not be found
	*/
	public static CrmCounty findByPrimaryKey(long crmCountyId)
		throws contact.manager.exception.NoSuchCrmCountyException {
		return getPersistence().findByPrimaryKey(crmCountyId);
	}

	/**
	* Returns the CRM County with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmCountyId the primary key of the CRM County
	* @return the CRM County, or <code>null</code> if a CRM County with the primary key could not be found
	*/
	public static CrmCounty fetchByPrimaryKey(long crmCountyId) {
		return getPersistence().fetchByPrimaryKey(crmCountyId);
	}

	public static java.util.Map<java.io.Serializable, CrmCounty> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM Counties.
	*
	* @return the CRM Counties
	*/
	public static List<CrmCounty> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<CrmCounty> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<CrmCounty> findAll(int start, int end,
		OrderByComparator<CrmCounty> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<CrmCounty> findAll(int start, int end,
		OrderByComparator<CrmCounty> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM Counties from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM Counties.
	*
	* @return the number of CRM Counties
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmCountyPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmCountyPersistence, CrmCountyPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CrmCountyPersistence.class);

		ServiceTracker<CrmCountyPersistence, CrmCountyPersistence> serviceTracker =
			new ServiceTracker<CrmCountyPersistence, CrmCountyPersistence>(bundle.getBundleContext(),
				CrmCountyPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}