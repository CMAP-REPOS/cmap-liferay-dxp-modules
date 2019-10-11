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

import contact.manager.model.CrmCountyCommissioner;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM County Commissioner service. This utility wraps {@link contact.manager.service.persistence.impl.CrmCountyCommissionerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmCountyCommissionerPersistence
 * @see contact.manager.service.persistence.impl.CrmCountyCommissionerPersistenceImpl
 * @generated
 */
@ProviderType
public class CrmCountyCommissionerUtil {
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
	public static void clearCache(CrmCountyCommissioner crmCountyCommissioner) {
		getPersistence().clearCache(crmCountyCommissioner);
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
	public static List<CrmCountyCommissioner> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmCountyCommissioner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmCountyCommissioner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmCountyCommissioner update(
		CrmCountyCommissioner crmCountyCommissioner) {
		return getPersistence().update(crmCountyCommissioner);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmCountyCommissioner update(
		CrmCountyCommissioner crmCountyCommissioner,
		ServiceContext serviceContext) {
		return getPersistence().update(crmCountyCommissioner, serviceContext);
	}

	/**
	* Returns all the CRM County Commissioners where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the CRM County Commissioners where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @return the range of matching CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findByUuid(String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the CRM County Commissioners where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findByUuid(String uuid,
		int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM County Commissioners where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findByUuid(String uuid,
		int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM County Commissioner in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner findByUuid_First(String uuid,
		OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first CRM County Commissioner in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner fetchByUuid_First(String uuid,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM County Commissioner in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner findByUuid_Last(String uuid,
		OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM County Commissioner in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner fetchByUuid_Last(String uuid,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the CRM County Commissioners before and after the current CRM County Commissioner in the ordered set where uuid = &#63;.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the current CRM County Commissioner
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	*/
	public static CrmCountyCommissioner[] findByUuid_PrevAndNext(
		long crmCountyCommissionerOrBoardDistId, String uuid,
		OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence()
				   .findByUuid_PrevAndNext(crmCountyCommissionerOrBoardDistId,
			uuid, orderByComparator);
	}

	/**
	* Removes all the CRM County Commissioners where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of CRM County Commissioners where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM County Commissioners
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the CRM County Commissioner where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmCountyCommissionerException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner findByUUID_G(String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM County Commissioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM County Commissioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner fetchByUUID_G(String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the CRM County Commissioner where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM County Commissioner that was removed
	*/
	public static CrmCountyCommissioner removeByUUID_G(String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of CRM County Commissioners where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM County Commissioners
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findByUuid_C(String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @return the range of matching CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findByUuid_C(String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findByUuid_C(String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findByUuid_C(String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner findByUuid_C_First(String uuid,
		long companyId,
		OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner fetchByUuid_C_First(String uuid,
		long companyId,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner findByUuid_C_Last(String uuid,
		long companyId,
		OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner fetchByUuid_C_Last(String uuid,
		long companyId,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the CRM County Commissioners before and after the current CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the current CRM County Commissioner
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	*/
	public static CrmCountyCommissioner[] findByUuid_C_PrevAndNext(
		long crmCountyCommissionerOrBoardDistId, String uuid, long companyId,
		OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(crmCountyCommissionerOrBoardDistId,
			uuid, companyId, orderByComparator);
	}

	/**
	* Removes all the CRM County Commissioners where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM County Commissioners
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the CRM County Commissioners where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findByZipCode(String zipCode) {
		return getPersistence().findByZipCode(zipCode);
	}

	/**
	* Returns a range of all the CRM County Commissioners where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @return the range of matching CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findByZipCode(String zipCode,
		int start, int end) {
		return getPersistence().findByZipCode(zipCode, start, end);
	}

	/**
	* Returns an ordered range of all the CRM County Commissioners where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findByZipCode(String zipCode,
		int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {
		return getPersistence()
				   .findByZipCode(zipCode, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM County Commissioners where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findByZipCode(String zipCode,
		int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByZipCode(zipCode, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM County Commissioner in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner findByZipCode_First(String zipCode,
		OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence().findByZipCode_First(zipCode, orderByComparator);
	}

	/**
	* Returns the first CRM County Commissioner in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner fetchByZipCode_First(String zipCode,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {
		return getPersistence().fetchByZipCode_First(zipCode, orderByComparator);
	}

	/**
	* Returns the last CRM County Commissioner in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner findByZipCode_Last(String zipCode,
		OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence().findByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	* Returns the last CRM County Commissioner in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public static CrmCountyCommissioner fetchByZipCode_Last(String zipCode,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {
		return getPersistence().fetchByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	* Returns the CRM County Commissioners before and after the current CRM County Commissioner in the ordered set where zipCode = &#63;.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the current CRM County Commissioner
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	*/
	public static CrmCountyCommissioner[] findByZipCode_PrevAndNext(
		long crmCountyCommissionerOrBoardDistId, String zipCode,
		OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence()
				   .findByZipCode_PrevAndNext(crmCountyCommissionerOrBoardDistId,
			zipCode, orderByComparator);
	}

	/**
	* Removes all the CRM County Commissioners where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public static void removeByZipCode(String zipCode) {
		getPersistence().removeByZipCode(zipCode);
	}

	/**
	* Returns the number of CRM County Commissioners where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching CRM County Commissioners
	*/
	public static int countByZipCode(String zipCode) {
		return getPersistence().countByZipCode(zipCode);
	}

	/**
	* Caches the CRM County Commissioner in the entity cache if it is enabled.
	*
	* @param crmCountyCommissioner the CRM County Commissioner
	*/
	public static void cacheResult(CrmCountyCommissioner crmCountyCommissioner) {
		getPersistence().cacheResult(crmCountyCommissioner);
	}

	/**
	* Caches the CRM County Commissioners in the entity cache if it is enabled.
	*
	* @param crmCountyCommissioners the CRM County Commissioners
	*/
	public static void cacheResult(
		List<CrmCountyCommissioner> crmCountyCommissioners) {
		getPersistence().cacheResult(crmCountyCommissioners);
	}

	/**
	* Creates a new CRM County Commissioner with the primary key. Does not add the CRM County Commissioner to the database.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key for the new CRM County Commissioner
	* @return the new CRM County Commissioner
	*/
	public static CrmCountyCommissioner create(
		long crmCountyCommissionerOrBoardDistId) {
		return getPersistence().create(crmCountyCommissionerOrBoardDistId);
	}

	/**
	* Removes the CRM County Commissioner with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the CRM County Commissioner
	* @return the CRM County Commissioner that was removed
	* @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	*/
	public static CrmCountyCommissioner remove(
		long crmCountyCommissionerOrBoardDistId)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence().remove(crmCountyCommissionerOrBoardDistId);
	}

	public static CrmCountyCommissioner updateImpl(
		CrmCountyCommissioner crmCountyCommissioner) {
		return getPersistence().updateImpl(crmCountyCommissioner);
	}

	/**
	* Returns the CRM County Commissioner with the primary key or throws a {@link NoSuchCrmCountyCommissionerException} if it could not be found.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the CRM County Commissioner
	* @return the CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	*/
	public static CrmCountyCommissioner findByPrimaryKey(
		long crmCountyCommissionerOrBoardDistId)
		throws contact.manager.exception.NoSuchCrmCountyCommissionerException {
		return getPersistence()
				   .findByPrimaryKey(crmCountyCommissionerOrBoardDistId);
	}

	/**
	* Returns the CRM County Commissioner with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the CRM County Commissioner
	* @return the CRM County Commissioner, or <code>null</code> if a CRM County Commissioner with the primary key could not be found
	*/
	public static CrmCountyCommissioner fetchByPrimaryKey(
		long crmCountyCommissionerOrBoardDistId) {
		return getPersistence()
				   .fetchByPrimaryKey(crmCountyCommissionerOrBoardDistId);
	}

	public static java.util.Map<java.io.Serializable, CrmCountyCommissioner> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM County Commissioners.
	*
	* @return the CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the CRM County Commissioners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @return the range of CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the CRM County Commissioners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findAll(int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM County Commissioners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM County Commissioners
	*/
	public static List<CrmCountyCommissioner> findAll(int start, int end,
		OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM County Commissioners from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM County Commissioners.
	*
	* @return the number of CRM County Commissioners
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmCountyCommissionerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmCountyCommissionerPersistence, CrmCountyCommissionerPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CrmCountyCommissionerPersistence.class);

		ServiceTracker<CrmCountyCommissionerPersistence, CrmCountyCommissionerPersistence> serviceTracker =
			new ServiceTracker<CrmCountyCommissionerPersistence, CrmCountyCommissionerPersistence>(bundle.getBundleContext(),
				CrmCountyCommissionerPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}