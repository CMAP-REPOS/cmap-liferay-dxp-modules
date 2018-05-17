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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.model.CrmChiWard;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM Chi Ward service. This utility wraps {@link contact.manager.service.persistence.impl.CrmChiWardPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmChiWardPersistence
 * @see contact.manager.service.persistence.impl.CrmChiWardPersistenceImpl
 * @generated
 */
@ProviderType
public class CrmChiWardUtil {
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
	public static void clearCache(CrmChiWard crmChiWard) {
		getPersistence().clearCache(crmChiWard);
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
	public static List<CrmChiWard> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmChiWard> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmChiWard> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmChiWard> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmChiWard update(CrmChiWard crmChiWard) {
		return getPersistence().update(crmChiWard);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmChiWard update(CrmChiWard crmChiWard,
		ServiceContext serviceContext) {
		return getPersistence().update(crmChiWard, serviceContext);
	}

	/**
	* Returns all the CRM Chi Wards where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Chi Wards
	*/
	public static List<CrmChiWard> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<CrmChiWard> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<CrmChiWard> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<CrmChiWard> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<CrmChiWard> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<CrmChiWard> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM Chi Ward in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	*/
	public static CrmChiWard findByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmChiWard> orderByComparator)
		throws contact.manager.exception.NoSuchCrmChiWardException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first CRM Chi Ward in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public static CrmChiWard fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmChiWard> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Chi Ward in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	*/
	public static CrmChiWard findByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmChiWard> orderByComparator)
		throws contact.manager.exception.NoSuchCrmChiWardException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Chi Ward in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public static CrmChiWard fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmChiWard> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the CRM Chi Wards before and after the current CRM Chi Ward in the ordered set where uuid = &#63;.
	*
	* @param crmChiWardId the primary key of the current CRM Chi Ward
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	*/
	public static CrmChiWard[] findByUuid_PrevAndNext(long crmChiWardId,
		java.lang.String uuid, OrderByComparator<CrmChiWard> orderByComparator)
		throws contact.manager.exception.NoSuchCrmChiWardException {
		return getPersistence()
				   .findByUuid_PrevAndNext(crmChiWardId, uuid, orderByComparator);
	}

	/**
	* Removes all the CRM Chi Wards where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of CRM Chi Wards where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Chi Wards
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the CRM Chi Ward where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmChiWardException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	*/
	public static CrmChiWard findByUUID_G(java.lang.String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmChiWardException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Chi Ward where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public static CrmChiWard fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Chi Ward where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public static CrmChiWard fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the CRM Chi Ward where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Chi Ward that was removed
	*/
	public static CrmChiWard removeByUUID_G(java.lang.String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmChiWardException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of CRM Chi Wards where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Chi Wards
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the CRM Chi Wards where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Chi Wards
	*/
	public static List<CrmChiWard> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<CrmChiWard> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<CrmChiWard> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmChiWard> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<CrmChiWard> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmChiWard> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	*/
	public static CrmChiWard findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmChiWard> orderByComparator)
		throws contact.manager.exception.NoSuchCrmChiWardException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public static CrmChiWard fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmChiWard> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a matching CRM Chi Ward could not be found
	*/
	public static CrmChiWard findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmChiWard> orderByComparator)
		throws contact.manager.exception.NoSuchCrmChiWardException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Chi Ward in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	public static CrmChiWard fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmChiWard> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static CrmChiWard[] findByUuid_C_PrevAndNext(long crmChiWardId,
		java.lang.String uuid, long companyId,
		OrderByComparator<CrmChiWard> orderByComparator)
		throws contact.manager.exception.NoSuchCrmChiWardException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(crmChiWardId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the CRM Chi Wards where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of CRM Chi Wards where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Chi Wards
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the CRM Chi Ward in the entity cache if it is enabled.
	*
	* @param crmChiWard the CRM Chi Ward
	*/
	public static void cacheResult(CrmChiWard crmChiWard) {
		getPersistence().cacheResult(crmChiWard);
	}

	/**
	* Caches the CRM Chi Wards in the entity cache if it is enabled.
	*
	* @param crmChiWards the CRM Chi Wards
	*/
	public static void cacheResult(List<CrmChiWard> crmChiWards) {
		getPersistence().cacheResult(crmChiWards);
	}

	/**
	* Creates a new CRM Chi Ward with the primary key. Does not add the CRM Chi Ward to the database.
	*
	* @param crmChiWardId the primary key for the new CRM Chi Ward
	* @return the new CRM Chi Ward
	*/
	public static CrmChiWard create(long crmChiWardId) {
		return getPersistence().create(crmChiWardId);
	}

	/**
	* Removes the CRM Chi Ward with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmChiWardId the primary key of the CRM Chi Ward
	* @return the CRM Chi Ward that was removed
	* @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	*/
	public static CrmChiWard remove(long crmChiWardId)
		throws contact.manager.exception.NoSuchCrmChiWardException {
		return getPersistence().remove(crmChiWardId);
	}

	public static CrmChiWard updateImpl(CrmChiWard crmChiWard) {
		return getPersistence().updateImpl(crmChiWard);
	}

	/**
	* Returns the CRM Chi Ward with the primary key or throws a {@link NoSuchCrmChiWardException} if it could not be found.
	*
	* @param crmChiWardId the primary key of the CRM Chi Ward
	* @return the CRM Chi Ward
	* @throws NoSuchCrmChiWardException if a CRM Chi Ward with the primary key could not be found
	*/
	public static CrmChiWard findByPrimaryKey(long crmChiWardId)
		throws contact.manager.exception.NoSuchCrmChiWardException {
		return getPersistence().findByPrimaryKey(crmChiWardId);
	}

	/**
	* Returns the CRM Chi Ward with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmChiWardId the primary key of the CRM Chi Ward
	* @return the CRM Chi Ward, or <code>null</code> if a CRM Chi Ward with the primary key could not be found
	*/
	public static CrmChiWard fetchByPrimaryKey(long crmChiWardId) {
		return getPersistence().fetchByPrimaryKey(crmChiWardId);
	}

	public static java.util.Map<java.io.Serializable, CrmChiWard> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM Chi Wards.
	*
	* @return the CRM Chi Wards
	*/
	public static List<CrmChiWard> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<CrmChiWard> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<CrmChiWard> findAll(int start, int end,
		OrderByComparator<CrmChiWard> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<CrmChiWard> findAll(int start, int end,
		OrderByComparator<CrmChiWard> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM Chi Wards from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM Chi Wards.
	*
	* @return the number of CRM Chi Wards
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmChiWardPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmChiWardPersistence, CrmChiWardPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CrmChiWardPersistence.class);
}