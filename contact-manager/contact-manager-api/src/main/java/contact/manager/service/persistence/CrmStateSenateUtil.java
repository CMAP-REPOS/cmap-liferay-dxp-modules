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

import contact.manager.model.CrmStateSenate;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM State Senate service. This utility wraps {@link contact.manager.service.persistence.impl.CrmStateSenatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateSenatePersistence
 * @see contact.manager.service.persistence.impl.CrmStateSenatePersistenceImpl
 * @generated
 */
@ProviderType
public class CrmStateSenateUtil {
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
	public static void clearCache(CrmStateSenate crmStateSenate) {
		getPersistence().clearCache(crmStateSenate);
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
	public static List<CrmStateSenate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmStateSenate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmStateSenate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmStateSenate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmStateSenate update(CrmStateSenate crmStateSenate) {
		return getPersistence().update(crmStateSenate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmStateSenate update(CrmStateSenate crmStateSenate,
		ServiceContext serviceContext) {
		return getPersistence().update(crmStateSenate, serviceContext);
	}

	/**
	* Returns all the CRM State Senates where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM State Senates
	*/
	public static List<CrmStateSenate> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<CrmStateSenate> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<CrmStateSenate> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<CrmStateSenate> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<CrmStateSenate> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<CrmStateSenate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM State Senate in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Senate
	* @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	*/
	public static CrmStateSenate findByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmStateSenate> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateSenateException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first CRM State Senate in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public static CrmStateSenate fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmStateSenate> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM State Senate in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Senate
	* @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	*/
	public static CrmStateSenate findByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmStateSenate> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateSenateException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM State Senate in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public static CrmStateSenate fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmStateSenate> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the CRM State Senates before and after the current CRM State Senate in the ordered set where uuid = &#63;.
	*
	* @param crmStateSenateId the primary key of the current CRM State Senate
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM State Senate
	* @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	*/
	public static CrmStateSenate[] findByUuid_PrevAndNext(
		long crmStateSenateId, java.lang.String uuid,
		OrderByComparator<CrmStateSenate> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateSenateException {
		return getPersistence()
				   .findByUuid_PrevAndNext(crmStateSenateId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the CRM State Senates where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of CRM State Senates where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM State Senates
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the CRM State Senate where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmStateSenateException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM State Senate
	* @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	*/
	public static CrmStateSenate findByUUID_G(java.lang.String uuid,
		long groupId)
		throws contact.manager.exception.NoSuchCrmStateSenateException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM State Senate where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public static CrmStateSenate fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM State Senate where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public static CrmStateSenate fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the CRM State Senate where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM State Senate that was removed
	*/
	public static CrmStateSenate removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws contact.manager.exception.NoSuchCrmStateSenateException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of CRM State Senates where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM State Senates
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the CRM State Senates where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM State Senates
	*/
	public static List<CrmStateSenate> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<CrmStateSenate> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<CrmStateSenate> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmStateSenate> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<CrmStateSenate> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmStateSenate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Senate
	* @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	*/
	public static CrmStateSenate findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmStateSenate> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateSenateException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public static CrmStateSenate fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmStateSenate> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Senate
	* @throws NoSuchCrmStateSenateException if a matching CRM State Senate could not be found
	*/
	public static CrmStateSenate findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmStateSenate> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateSenateException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM State Senate in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public static CrmStateSenate fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmStateSenate> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static CrmStateSenate[] findByUuid_C_PrevAndNext(
		long crmStateSenateId, java.lang.String uuid, long companyId,
		OrderByComparator<CrmStateSenate> orderByComparator)
		throws contact.manager.exception.NoSuchCrmStateSenateException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(crmStateSenateId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the CRM State Senates where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of CRM State Senates where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM State Senates
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the CRM State Senate in the entity cache if it is enabled.
	*
	* @param crmStateSenate the CRM State Senate
	*/
	public static void cacheResult(CrmStateSenate crmStateSenate) {
		getPersistence().cacheResult(crmStateSenate);
	}

	/**
	* Caches the CRM State Senates in the entity cache if it is enabled.
	*
	* @param crmStateSenates the CRM State Senates
	*/
	public static void cacheResult(List<CrmStateSenate> crmStateSenates) {
		getPersistence().cacheResult(crmStateSenates);
	}

	/**
	* Creates a new CRM State Senate with the primary key. Does not add the CRM State Senate to the database.
	*
	* @param crmStateSenateId the primary key for the new CRM State Senate
	* @return the new CRM State Senate
	*/
	public static CrmStateSenate create(long crmStateSenateId) {
		return getPersistence().create(crmStateSenateId);
	}

	/**
	* Removes the CRM State Senate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmStateSenateId the primary key of the CRM State Senate
	* @return the CRM State Senate that was removed
	* @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	*/
	public static CrmStateSenate remove(long crmStateSenateId)
		throws contact.manager.exception.NoSuchCrmStateSenateException {
		return getPersistence().remove(crmStateSenateId);
	}

	public static CrmStateSenate updateImpl(CrmStateSenate crmStateSenate) {
		return getPersistence().updateImpl(crmStateSenate);
	}

	/**
	* Returns the CRM State Senate with the primary key or throws a {@link NoSuchCrmStateSenateException} if it could not be found.
	*
	* @param crmStateSenateId the primary key of the CRM State Senate
	* @return the CRM State Senate
	* @throws NoSuchCrmStateSenateException if a CRM State Senate with the primary key could not be found
	*/
	public static CrmStateSenate findByPrimaryKey(long crmStateSenateId)
		throws contact.manager.exception.NoSuchCrmStateSenateException {
		return getPersistence().findByPrimaryKey(crmStateSenateId);
	}

	/**
	* Returns the CRM State Senate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmStateSenateId the primary key of the CRM State Senate
	* @return the CRM State Senate, or <code>null</code> if a CRM State Senate with the primary key could not be found
	*/
	public static CrmStateSenate fetchByPrimaryKey(long crmStateSenateId) {
		return getPersistence().fetchByPrimaryKey(crmStateSenateId);
	}

	public static java.util.Map<java.io.Serializable, CrmStateSenate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM State Senates.
	*
	* @return the CRM State Senates
	*/
	public static List<CrmStateSenate> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<CrmStateSenate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<CrmStateSenate> findAll(int start, int end,
		OrderByComparator<CrmStateSenate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<CrmStateSenate> findAll(int start, int end,
		OrderByComparator<CrmStateSenate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM State Senates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM State Senates.
	*
	* @return the number of CRM State Senates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmStateSenatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmStateSenatePersistence, CrmStateSenatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(CrmStateSenatePersistence.class);
}