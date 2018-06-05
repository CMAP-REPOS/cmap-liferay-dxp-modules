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

import contact.manager.model.CrmContactAuditLog;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM Contact Audit Log service. This utility wraps {@link contact.manager.service.persistence.impl.CrmContactAuditLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogPersistence
 * @see contact.manager.service.persistence.impl.CrmContactAuditLogPersistenceImpl
 * @generated
 */
@ProviderType
public class CrmContactAuditLogUtil {
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
	public static void clearCache(CrmContactAuditLog crmContactAuditLog) {
		getPersistence().clearCache(crmContactAuditLog);
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
	public static List<CrmContactAuditLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmContactAuditLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmContactAuditLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmContactAuditLog update(
		CrmContactAuditLog crmContactAuditLog) {
		return getPersistence().update(crmContactAuditLog);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmContactAuditLog update(
		CrmContactAuditLog crmContactAuditLog, ServiceContext serviceContext) {
		return getPersistence().update(crmContactAuditLog, serviceContext);
	}

	/**
	* Returns all the CRM Contact Audit Logs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the CRM Contact Audit Logs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @return the range of matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog findByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog findByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the CRM Contact Audit Logs before and after the current CRM Contact Audit Log in the ordered set where uuid = &#63;.
	*
	* @param crmContactAuditLogId the primary key of the current CRM Contact Audit Log
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	*/
	public static CrmContactAuditLog[] findByUuid_PrevAndNext(
		long crmContactAuditLogId, java.lang.String uuid,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence()
				   .findByUuid_PrevAndNext(crmContactAuditLogId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the CRM Contact Audit Logs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of CRM Contact Audit Logs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Contact Audit Logs
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the CRM Contact Audit Log where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmContactAuditLogException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog findByUUID_G(java.lang.String uuid,
		long groupId)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Contact Audit Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Contact Audit Log where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the CRM Contact Audit Log where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Contact Audit Log that was removed
	*/
	public static CrmContactAuditLog removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of CRM Contact Audit Logs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Contact Audit Logs
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @return the range of matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the CRM Contact Audit Logs before and after the current CRM Contact Audit Log in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmContactAuditLogId the primary key of the current CRM Contact Audit Log
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	*/
	public static CrmContactAuditLog[] findByUuid_C_PrevAndNext(
		long crmContactAuditLogId, java.lang.String uuid, long companyId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(crmContactAuditLogId, uuid,
			companyId, orderByComparator);
	}

	/**
	* Removes all the CRM Contact Audit Logs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of CRM Contact Audit Logs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Contact Audit Logs
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the CRM Contact Audit Logs where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @return the matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByCrmContactId(long crmContactId) {
		return getPersistence().findByCrmContactId(crmContactId);
	}

	/**
	* Returns a range of all the CRM Contact Audit Logs where crmContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param crmContactId the crm contact ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @return the range of matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByCrmContactId(
		long crmContactId, int start, int end) {
		return getPersistence().findByCrmContactId(crmContactId, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where crmContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param crmContactId the crm contact ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByCrmContactId(
		long crmContactId, int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence()
				   .findByCrmContactId(crmContactId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where crmContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param crmContactId the crm contact ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByCrmContactId(
		long crmContactId, int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCrmContactId(crmContactId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog findByCrmContactId_First(
		long crmContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence()
				   .findByCrmContactId_First(crmContactId, orderByComparator);
	}

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog fetchByCrmContactId_First(
		long crmContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence()
				   .fetchByCrmContactId_First(crmContactId, orderByComparator);
	}

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog findByCrmContactId_Last(
		long crmContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence()
				   .findByCrmContactId_Last(crmContactId, orderByComparator);
	}

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog fetchByCrmContactId_Last(
		long crmContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence()
				   .fetchByCrmContactId_Last(crmContactId, orderByComparator);
	}

	/**
	* Returns the CRM Contact Audit Logs before and after the current CRM Contact Audit Log in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactAuditLogId the primary key of the current CRM Contact Audit Log
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	*/
	public static CrmContactAuditLog[] findByCrmContactId_PrevAndNext(
		long crmContactAuditLogId, long crmContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence()
				   .findByCrmContactId_PrevAndNext(crmContactAuditLogId,
			crmContactId, orderByComparator);
	}

	/**
	* Removes all the CRM Contact Audit Logs where crmContactId = &#63; from the database.
	*
	* @param crmContactId the crm contact ID
	*/
	public static void removeByCrmContactId(long crmContactId) {
		getPersistence().removeByCrmContactId(crmContactId);
	}

	/**
	* Returns the number of CRM Contact Audit Logs where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @return the number of matching CRM Contact Audit Logs
	*/
	public static int countByCrmContactId(long crmContactId) {
		return getPersistence().countByCrmContactId(crmContactId);
	}

	/**
	* Returns all the CRM Contact Audit Logs where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @return the matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByConstantContactId(
		long constantContactId) {
		return getPersistence().findByConstantContactId(constantContactId);
	}

	/**
	* Returns a range of all the CRM Contact Audit Logs where constantContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param constantContactId the constant contact ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @return the range of matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByConstantContactId(
		long constantContactId, int start, int end) {
		return getPersistence()
				   .findByConstantContactId(constantContactId, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where constantContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param constantContactId the constant contact ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByConstantContactId(
		long constantContactId, int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence()
				   .findByConstantContactId(constantContactId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs where constantContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param constantContactId the constant contact ID
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findByConstantContactId(
		long constantContactId, int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByConstantContactId(constantContactId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog findByConstantContactId_First(
		long constantContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence()
				   .findByConstantContactId_First(constantContactId,
			orderByComparator);
	}

	/**
	* Returns the first CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog fetchByConstantContactId_First(
		long constantContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence()
				   .fetchByConstantContactId_First(constantContactId,
			orderByComparator);
	}

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog findByConstantContactId_Last(
		long constantContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence()
				   .findByConstantContactId_Last(constantContactId,
			orderByComparator);
	}

	/**
	* Returns the last CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	public static CrmContactAuditLog fetchByConstantContactId_Last(
		long constantContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence()
				   .fetchByConstantContactId_Last(constantContactId,
			orderByComparator);
	}

	/**
	* Returns the CRM Contact Audit Logs before and after the current CRM Contact Audit Log in the ordered set where constantContactId = &#63;.
	*
	* @param crmContactAuditLogId the primary key of the current CRM Contact Audit Log
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	*/
	public static CrmContactAuditLog[] findByConstantContactId_PrevAndNext(
		long crmContactAuditLogId, long constantContactId,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence()
				   .findByConstantContactId_PrevAndNext(crmContactAuditLogId,
			constantContactId, orderByComparator);
	}

	/**
	* Removes all the CRM Contact Audit Logs where constantContactId = &#63; from the database.
	*
	* @param constantContactId the constant contact ID
	*/
	public static void removeByConstantContactId(long constantContactId) {
		getPersistence().removeByConstantContactId(constantContactId);
	}

	/**
	* Returns the number of CRM Contact Audit Logs where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @return the number of matching CRM Contact Audit Logs
	*/
	public static int countByConstantContactId(long constantContactId) {
		return getPersistence().countByConstantContactId(constantContactId);
	}

	/**
	* Caches the CRM Contact Audit Log in the entity cache if it is enabled.
	*
	* @param crmContactAuditLog the CRM Contact Audit Log
	*/
	public static void cacheResult(CrmContactAuditLog crmContactAuditLog) {
		getPersistence().cacheResult(crmContactAuditLog);
	}

	/**
	* Caches the CRM Contact Audit Logs in the entity cache if it is enabled.
	*
	* @param crmContactAuditLogs the CRM Contact Audit Logs
	*/
	public static void cacheResult(List<CrmContactAuditLog> crmContactAuditLogs) {
		getPersistence().cacheResult(crmContactAuditLogs);
	}

	/**
	* Creates a new CRM Contact Audit Log with the primary key. Does not add the CRM Contact Audit Log to the database.
	*
	* @param crmContactAuditLogId the primary key for the new CRM Contact Audit Log
	* @return the new CRM Contact Audit Log
	*/
	public static CrmContactAuditLog create(long crmContactAuditLogId) {
		return getPersistence().create(crmContactAuditLogId);
	}

	/**
	* Removes the CRM Contact Audit Log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	* @return the CRM Contact Audit Log that was removed
	* @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	*/
	public static CrmContactAuditLog remove(long crmContactAuditLogId)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence().remove(crmContactAuditLogId);
	}

	public static CrmContactAuditLog updateImpl(
		CrmContactAuditLog crmContactAuditLog) {
		return getPersistence().updateImpl(crmContactAuditLog);
	}

	/**
	* Returns the CRM Contact Audit Log with the primary key or throws a {@link NoSuchCrmContactAuditLogException} if it could not be found.
	*
	* @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	* @return the CRM Contact Audit Log
	* @throws NoSuchCrmContactAuditLogException if a CRM Contact Audit Log with the primary key could not be found
	*/
	public static CrmContactAuditLog findByPrimaryKey(long crmContactAuditLogId)
		throws contact.manager.exception.NoSuchCrmContactAuditLogException {
		return getPersistence().findByPrimaryKey(crmContactAuditLogId);
	}

	/**
	* Returns the CRM Contact Audit Log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	* @return the CRM Contact Audit Log, or <code>null</code> if a CRM Contact Audit Log with the primary key could not be found
	*/
	public static CrmContactAuditLog fetchByPrimaryKey(
		long crmContactAuditLogId) {
		return getPersistence().fetchByPrimaryKey(crmContactAuditLogId);
	}

	public static java.util.Map<java.io.Serializable, CrmContactAuditLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM Contact Audit Logs.
	*
	* @return the CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the CRM Contact Audit Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @return the range of CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findAll(int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contact Audit Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Contact Audit Logs
	*/
	public static List<CrmContactAuditLog> findAll(int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM Contact Audit Logs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM Contact Audit Logs.
	*
	* @return the number of CRM Contact Audit Logs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmContactAuditLogPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmContactAuditLogPersistence, CrmContactAuditLogPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CrmContactAuditLogPersistence.class);
}