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

import contact.manager.model.CrmOutreachLog;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM Outreach Log service. This utility wraps {@link contact.manager.service.persistence.impl.CrmOutreachLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmOutreachLogPersistence
 * @see contact.manager.service.persistence.impl.CrmOutreachLogPersistenceImpl
 * @generated
 */
@ProviderType
public class CrmOutreachLogUtil {
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
	public static void clearCache(CrmOutreachLog crmOutreachLog) {
		getPersistence().clearCache(crmOutreachLog);
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
	public static List<CrmOutreachLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmOutreachLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmOutreachLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmOutreachLog update(CrmOutreachLog crmOutreachLog) {
		return getPersistence().update(crmOutreachLog);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmOutreachLog update(CrmOutreachLog crmOutreachLog,
		ServiceContext serviceContext) {
		return getPersistence().update(crmOutreachLog, serviceContext);
	}

	/**
	* Returns all the CRM Outreach Logs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Outreach Logs
	*/
	public static List<CrmOutreachLog> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the CRM Outreach Logs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @return the range of matching CRM Outreach Logs
	*/
	public static List<CrmOutreachLog> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Outreach Logs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Outreach Logs
	*/
	public static List<CrmOutreachLog> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<CrmOutreachLog> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Outreach Logs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Outreach Logs
	*/
	public static List<CrmOutreachLog> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM Outreach Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	*/
	public static CrmOutreachLog findByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmOutreachLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmOutreachLogException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first CRM Outreach Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public static CrmOutreachLog fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Outreach Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	*/
	public static CrmOutreachLog findByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmOutreachLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmOutreachLogException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Outreach Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public static CrmOutreachLog fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the CRM Outreach Logs before and after the current CRM Outreach Log in the ordered set where uuid = &#63;.
	*
	* @param crmOutreachLogId the primary key of the current CRM Outreach Log
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	*/
	public static CrmOutreachLog[] findByUuid_PrevAndNext(
		long crmOutreachLogId, java.lang.String uuid,
		OrderByComparator<CrmOutreachLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmOutreachLogException {
		return getPersistence()
				   .findByUuid_PrevAndNext(crmOutreachLogId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the CRM Outreach Logs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of CRM Outreach Logs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Outreach Logs
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the CRM Outreach Log where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmOutreachLogException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	*/
	public static CrmOutreachLog findByUUID_G(java.lang.String uuid,
		long groupId)
		throws contact.manager.exception.NoSuchCrmOutreachLogException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Outreach Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public static CrmOutreachLog fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Outreach Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public static CrmOutreachLog fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the CRM Outreach Log where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Outreach Log that was removed
	*/
	public static CrmOutreachLog removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws contact.manager.exception.NoSuchCrmOutreachLogException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of CRM Outreach Logs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Outreach Logs
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Outreach Logs
	*/
	public static List<CrmOutreachLog> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @return the range of matching CRM Outreach Logs
	*/
	public static List<CrmOutreachLog> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Outreach Logs
	*/
	public static List<CrmOutreachLog> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Outreach Logs
	*/
	public static List<CrmOutreachLog> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	*/
	public static CrmOutreachLog findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmOutreachLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmOutreachLogException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public static CrmOutreachLog fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmOutreachLog> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a matching CRM Outreach Log could not be found
	*/
	public static CrmOutreachLog findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmOutreachLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmOutreachLogException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public static CrmOutreachLog fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmOutreachLog> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the CRM Outreach Logs before and after the current CRM Outreach Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmOutreachLogId the primary key of the current CRM Outreach Log
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	*/
	public static CrmOutreachLog[] findByUuid_C_PrevAndNext(
		long crmOutreachLogId, java.lang.String uuid, long companyId,
		OrderByComparator<CrmOutreachLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmOutreachLogException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(crmOutreachLogId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the CRM Outreach Logs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of CRM Outreach Logs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Outreach Logs
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the CRM Outreach Log in the entity cache if it is enabled.
	*
	* @param crmOutreachLog the CRM Outreach Log
	*/
	public static void cacheResult(CrmOutreachLog crmOutreachLog) {
		getPersistence().cacheResult(crmOutreachLog);
	}

	/**
	* Caches the CRM Outreach Logs in the entity cache if it is enabled.
	*
	* @param crmOutreachLogs the CRM Outreach Logs
	*/
	public static void cacheResult(List<CrmOutreachLog> crmOutreachLogs) {
		getPersistence().cacheResult(crmOutreachLogs);
	}

	/**
	* Creates a new CRM Outreach Log with the primary key. Does not add the CRM Outreach Log to the database.
	*
	* @param crmOutreachLogId the primary key for the new CRM Outreach Log
	* @return the new CRM Outreach Log
	*/
	public static CrmOutreachLog create(long crmOutreachLogId) {
		return getPersistence().create(crmOutreachLogId);
	}

	/**
	* Removes the CRM Outreach Log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmOutreachLogId the primary key of the CRM Outreach Log
	* @return the CRM Outreach Log that was removed
	* @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	*/
	public static CrmOutreachLog remove(long crmOutreachLogId)
		throws contact.manager.exception.NoSuchCrmOutreachLogException {
		return getPersistence().remove(crmOutreachLogId);
	}

	public static CrmOutreachLog updateImpl(CrmOutreachLog crmOutreachLog) {
		return getPersistence().updateImpl(crmOutreachLog);
	}

	/**
	* Returns the CRM Outreach Log with the primary key or throws a {@link NoSuchCrmOutreachLogException} if it could not be found.
	*
	* @param crmOutreachLogId the primary key of the CRM Outreach Log
	* @return the CRM Outreach Log
	* @throws NoSuchCrmOutreachLogException if a CRM Outreach Log with the primary key could not be found
	*/
	public static CrmOutreachLog findByPrimaryKey(long crmOutreachLogId)
		throws contact.manager.exception.NoSuchCrmOutreachLogException {
		return getPersistence().findByPrimaryKey(crmOutreachLogId);
	}

	/**
	* Returns the CRM Outreach Log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmOutreachLogId the primary key of the CRM Outreach Log
	* @return the CRM Outreach Log, or <code>null</code> if a CRM Outreach Log with the primary key could not be found
	*/
	public static CrmOutreachLog fetchByPrimaryKey(long crmOutreachLogId) {
		return getPersistence().fetchByPrimaryKey(crmOutreachLogId);
	}

	public static java.util.Map<java.io.Serializable, CrmOutreachLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM Outreach Logs.
	*
	* @return the CRM Outreach Logs
	*/
	public static List<CrmOutreachLog> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the CRM Outreach Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @return the range of CRM Outreach Logs
	*/
	public static List<CrmOutreachLog> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the CRM Outreach Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Outreach Logs
	*/
	public static List<CrmOutreachLog> findAll(int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Outreach Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Outreach Logs
	*/
	public static List<CrmOutreachLog> findAll(int start, int end,
		OrderByComparator<CrmOutreachLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM Outreach Logs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM Outreach Logs.
	*
	* @return the number of CRM Outreach Logs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmOutreachLogPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmOutreachLogPersistence, CrmOutreachLogPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CrmOutreachLogPersistence.class);
}