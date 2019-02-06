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

import contact.manager.model.CrmStateRep;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM State Rep service. This utility wraps {@link contact.manager.service.persistence.impl.CrmStateRepPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateRepPersistence
 * @see contact.manager.service.persistence.impl.CrmStateRepPersistenceImpl
 * @generated
 */
@ProviderType
public class CrmStateRepUtil {
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
	public static void clearCache(CrmStateRep crmStateRep) {
		getPersistence().clearCache(crmStateRep);
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
	public static List<CrmStateRep> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmStateRep> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmStateRep> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmStateRep update(CrmStateRep crmStateRep) {
		return getPersistence().update(crmStateRep);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmStateRep update(CrmStateRep crmStateRep,
		ServiceContext serviceContext) {
		return getPersistence().update(crmStateRep, serviceContext);
	}

	/**
	* Returns all the CRM State Reps where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM State Reps
	*/
	public static List<CrmStateRep> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<CrmStateRep> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<CrmStateRep> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<CrmStateRep> findByUuid(String uuid, int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM State Rep in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Rep
	* @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep findByUuid_First(String uuid,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first CRM State Rep in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep fetchByUuid_First(String uuid,
		OrderByComparator<CrmStateRep> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM State Rep in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Rep
	* @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep findByUuid_Last(String uuid,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM State Rep in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep fetchByUuid_Last(String uuid,
		OrderByComparator<CrmStateRep> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the CRM State Reps before and after the current CRM State Rep in the ordered set where uuid = &#63;.
	*
	* @param crmStateRepId the primary key of the current CRM State Rep
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM State Rep
	* @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	*/
	public static CrmStateRep[] findByUuid_PrevAndNext(long crmStateRepId,
		String uuid, OrderByComparator<CrmStateRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence()
				   .findByUuid_PrevAndNext(crmStateRepId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the CRM State Reps where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of CRM State Reps where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM State Reps
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the CRM State Rep where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmStateRepException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM State Rep
	* @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep findByUUID_G(String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM State Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM State Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the CRM State Rep where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM State Rep that was removed
	*/
	public static CrmStateRep removeByUUID_G(String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of CRM State Reps where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM State Reps
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the CRM State Reps where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM State Reps
	*/
	public static List<CrmStateRep> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<CrmStateRep> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<CrmStateRep> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<CrmStateRep> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<CrmStateRep> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<CrmStateRep> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Rep
	* @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Rep
	* @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM State Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static CrmStateRep[] findByUuid_C_PrevAndNext(long crmStateRepId,
		String uuid, long companyId,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(crmStateRepId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the CRM State Reps where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of CRM State Reps where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM State Reps
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the CRM State Reps where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching CRM State Reps
	*/
	public static List<CrmStateRep> findByZipCode(String zipCode) {
		return getPersistence().findByZipCode(zipCode);
	}

	/**
	* Returns a range of all the CRM State Reps where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM State Reps
	* @param end the upper bound of the range of CRM State Reps (not inclusive)
	* @return the range of matching CRM State Reps
	*/
	public static List<CrmStateRep> findByZipCode(String zipCode, int start,
		int end) {
		return getPersistence().findByZipCode(zipCode, start, end);
	}

	/**
	* Returns an ordered range of all the CRM State Reps where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM State Reps
	* @param end the upper bound of the range of CRM State Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM State Reps
	*/
	public static List<CrmStateRep> findByZipCode(String zipCode, int start,
		int end, OrderByComparator<CrmStateRep> orderByComparator) {
		return getPersistence()
				   .findByZipCode(zipCode, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM State Reps where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmStateRepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of CRM State Reps
	* @param end the upper bound of the range of CRM State Reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM State Reps
	*/
	public static List<CrmStateRep> findByZipCode(String zipCode, int start,
		int end, OrderByComparator<CrmStateRep> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByZipCode(zipCode, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM State Rep in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Rep
	* @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep findByZipCode_First(String zipCode,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence().findByZipCode_First(zipCode, orderByComparator);
	}

	/**
	* Returns the first CRM State Rep in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep fetchByZipCode_First(String zipCode,
		OrderByComparator<CrmStateRep> orderByComparator) {
		return getPersistence().fetchByZipCode_First(zipCode, orderByComparator);
	}

	/**
	* Returns the last CRM State Rep in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Rep
	* @throws NoSuchCrmStateRepException if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep findByZipCode_Last(String zipCode,
		OrderByComparator<CrmStateRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence().findByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	* Returns the last CRM State Rep in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	*/
	public static CrmStateRep fetchByZipCode_Last(String zipCode,
		OrderByComparator<CrmStateRep> orderByComparator) {
		return getPersistence().fetchByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	* Returns the CRM State Reps before and after the current CRM State Rep in the ordered set where zipCode = &#63;.
	*
	* @param crmStateRepId the primary key of the current CRM State Rep
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM State Rep
	* @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	*/
	public static CrmStateRep[] findByZipCode_PrevAndNext(long crmStateRepId,
		String zipCode, OrderByComparator<CrmStateRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence()
				   .findByZipCode_PrevAndNext(crmStateRepId, zipCode,
			orderByComparator);
	}

	/**
	* Removes all the CRM State Reps where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public static void removeByZipCode(String zipCode) {
		getPersistence().removeByZipCode(zipCode);
	}

	/**
	* Returns the number of CRM State Reps where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching CRM State Reps
	*/
	public static int countByZipCode(String zipCode) {
		return getPersistence().countByZipCode(zipCode);
	}

	/**
	* Caches the CRM State Rep in the entity cache if it is enabled.
	*
	* @param crmStateRep the CRM State Rep
	*/
	public static void cacheResult(CrmStateRep crmStateRep) {
		getPersistence().cacheResult(crmStateRep);
	}

	/**
	* Caches the CRM State Reps in the entity cache if it is enabled.
	*
	* @param crmStateReps the CRM State Reps
	*/
	public static void cacheResult(List<CrmStateRep> crmStateReps) {
		getPersistence().cacheResult(crmStateReps);
	}

	/**
	* Creates a new CRM State Rep with the primary key. Does not add the CRM State Rep to the database.
	*
	* @param crmStateRepId the primary key for the new CRM State Rep
	* @return the new CRM State Rep
	*/
	public static CrmStateRep create(long crmStateRepId) {
		return getPersistence().create(crmStateRepId);
	}

	/**
	* Removes the CRM State Rep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmStateRepId the primary key of the CRM State Rep
	* @return the CRM State Rep that was removed
	* @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	*/
	public static CrmStateRep remove(long crmStateRepId)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence().remove(crmStateRepId);
	}

	public static CrmStateRep updateImpl(CrmStateRep crmStateRep) {
		return getPersistence().updateImpl(crmStateRep);
	}

	/**
	* Returns the CRM State Rep with the primary key or throws a {@link NoSuchCrmStateRepException} if it could not be found.
	*
	* @param crmStateRepId the primary key of the CRM State Rep
	* @return the CRM State Rep
	* @throws NoSuchCrmStateRepException if a CRM State Rep with the primary key could not be found
	*/
	public static CrmStateRep findByPrimaryKey(long crmStateRepId)
		throws contact.manager.exception.NoSuchCrmStateRepException {
		return getPersistence().findByPrimaryKey(crmStateRepId);
	}

	/**
	* Returns the CRM State Rep with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmStateRepId the primary key of the CRM State Rep
	* @return the CRM State Rep, or <code>null</code> if a CRM State Rep with the primary key could not be found
	*/
	public static CrmStateRep fetchByPrimaryKey(long crmStateRepId) {
		return getPersistence().fetchByPrimaryKey(crmStateRepId);
	}

	public static java.util.Map<java.io.Serializable, CrmStateRep> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM State Reps.
	*
	* @return the CRM State Reps
	*/
	public static List<CrmStateRep> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<CrmStateRep> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<CrmStateRep> findAll(int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<CrmStateRep> findAll(int start, int end,
		OrderByComparator<CrmStateRep> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM State Reps from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM State Reps.
	*
	* @return the number of CRM State Reps
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmStateRepPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmStateRepPersistence, CrmStateRepPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CrmStateRepPersistence.class);

		ServiceTracker<CrmStateRepPersistence, CrmStateRepPersistence> serviceTracker =
			new ServiceTracker<CrmStateRepPersistence, CrmStateRepPersistence>(bundle.getBundleContext(),
				CrmStateRepPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}