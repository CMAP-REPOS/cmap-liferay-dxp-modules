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

import contact.manager.model.CrmContactAuditLogChange;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the CRM Contact Audit Log Change service. This utility wraps <code>contact.manager.service.persistence.impl.CrmContactAuditLogChangePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogChangePersistence
 * @generated
 */
@ProviderType
public class CrmContactAuditLogChangeUtil {

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
	public static void clearCache(
		CrmContactAuditLogChange crmContactAuditLogChange) {

		getPersistence().clearCache(crmContactAuditLogChange);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CrmContactAuditLogChange>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CrmContactAuditLogChange> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmContactAuditLogChange> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmContactAuditLogChange> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmContactAuditLogChange update(
		CrmContactAuditLogChange crmContactAuditLogChange) {

		return getPersistence().update(crmContactAuditLogChange);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmContactAuditLogChange update(
		CrmContactAuditLogChange crmContactAuditLogChange,
		ServiceContext serviceContext) {

		return getPersistence().update(
			crmContactAuditLogChange, serviceContext);
	}

	/**
	 * Returns all the CRM Contact Audit Log Changes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Contact Audit Log Changes
	 */
	public static List<CrmContactAuditLogChange> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Log Changes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmContactAuditLogChangeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @return the range of matching CRM Contact Audit Log Changes
	 */
	public static List<CrmContactAuditLogChange> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmContactAuditLogChangeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Contact Audit Log Changes
	 */
	@Deprecated
	public static List<CrmContactAuditLogChange> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmContactAuditLogChangeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contact Audit Log Changes
	 */
	public static List<CrmContactAuditLogChange> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns the first CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange findByUuid_First(
			String uuid,
			OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange fetchByUuid_First(
		String uuid,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange findByUuid_Last(
			String uuid,
			OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange fetchByUuid_Last(
		String uuid,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the CRM Contact Audit Log Changes before and after the current CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	 *
	 * @param crmContactAuditLogChangeId the primary key of the current CRM Contact Audit Log Change
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	public static CrmContactAuditLogChange[] findByUuid_PrevAndNext(
			long crmContactAuditLogChangeId, String uuid,
			OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().findByUuid_PrevAndNext(
			crmContactAuditLogChangeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the CRM Contact Audit Log Changes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of CRM Contact Audit Log Changes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Contact Audit Log Changes
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the CRM Contact Audit Log Change where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCrmContactAuditLogChangeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange findByUUID_G(
			String uuid, long groupId)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the CRM Contact Audit Log Change where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	@Deprecated
	public static CrmContactAuditLogChange fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Returns the CRM Contact Audit Log Change where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Removes the CRM Contact Audit Log Change where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Contact Audit Log Change that was removed
	 */
	public static CrmContactAuditLogChange removeByUUID_G(
			String uuid, long groupId)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of CRM Contact Audit Log Changes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Contact Audit Log Changes
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Contact Audit Log Changes
	 */
	public static List<CrmContactAuditLogChange> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmContactAuditLogChangeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @return the range of matching CRM Contact Audit Log Changes
	 */
	public static List<CrmContactAuditLogChange> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmContactAuditLogChangeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Contact Audit Log Changes
	 */
	@Deprecated
	public static List<CrmContactAuditLogChange> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmContactAuditLogChangeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contact Audit Log Changes
	 */
	public static List<CrmContactAuditLogChange> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the first CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the CRM Contact Audit Log Changes before and after the current CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmContactAuditLogChangeId the primary key of the current CRM Contact Audit Log Change
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	public static CrmContactAuditLogChange[] findByUuid_C_PrevAndNext(
			long crmContactAuditLogChangeId, String uuid, long companyId,
			OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().findByUuid_C_PrevAndNext(
			crmContactAuditLogChangeId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Contact Audit Log Changes
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the CRM Contact Audit Log Changes where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @return the matching CRM Contact Audit Log Changes
	 */
	public static List<CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId) {

		return getPersistence().findByCrmContactAuditLogId(
			crmContactAuditLogId);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Log Changes where crmContactAuditLogId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmContactAuditLogChangeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @return the range of matching CRM Contact Audit Log Changes
	 */
	public static List<CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId, int start, int end) {

		return getPersistence().findByCrmContactAuditLogId(
			crmContactAuditLogId, start, end);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes where crmContactAuditLogId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmContactAuditLogChangeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByCrmContactAuditLogId(long, int, int, OrderByComparator)}
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Contact Audit Log Changes
	 */
	@Deprecated
	public static List<CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId, int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCrmContactAuditLogId(
			crmContactAuditLogId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes where crmContactAuditLogId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmContactAuditLogChangeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Contact Audit Log Changes
	 */
	public static List<CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId, int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {

		return getPersistence().findByCrmContactAuditLogId(
			crmContactAuditLogId, start, end, orderByComparator);
	}

	/**
	 * Returns the first CRM Contact Audit Log Change in the ordered set where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange findByCrmContactAuditLogId_First(
			long crmContactAuditLogId,
			OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().findByCrmContactAuditLogId_First(
			crmContactAuditLogId, orderByComparator);
	}

	/**
	 * Returns the first CRM Contact Audit Log Change in the ordered set where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange fetchByCrmContactAuditLogId_First(
		long crmContactAuditLogId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {

		return getPersistence().fetchByCrmContactAuditLogId_First(
			crmContactAuditLogId, orderByComparator);
	}

	/**
	 * Returns the last CRM Contact Audit Log Change in the ordered set where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange findByCrmContactAuditLogId_Last(
			long crmContactAuditLogId,
			OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().findByCrmContactAuditLogId_Last(
			crmContactAuditLogId, orderByComparator);
	}

	/**
	 * Returns the last CRM Contact Audit Log Change in the ordered set where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	 */
	public static CrmContactAuditLogChange fetchByCrmContactAuditLogId_Last(
		long crmContactAuditLogId,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {

		return getPersistence().fetchByCrmContactAuditLogId_Last(
			crmContactAuditLogId, orderByComparator);
	}

	/**
	 * Returns the CRM Contact Audit Log Changes before and after the current CRM Contact Audit Log Change in the ordered set where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogChangeId the primary key of the current CRM Contact Audit Log Change
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	public static CrmContactAuditLogChange[]
			findByCrmContactAuditLogId_PrevAndNext(
				long crmContactAuditLogChangeId, long crmContactAuditLogId,
				OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().findByCrmContactAuditLogId_PrevAndNext(
			crmContactAuditLogChangeId, crmContactAuditLogId,
			orderByComparator);
	}

	/**
	 * Removes all the CRM Contact Audit Log Changes where crmContactAuditLogId = &#63; from the database.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 */
	public static void removeByCrmContactAuditLogId(long crmContactAuditLogId) {
		getPersistence().removeByCrmContactAuditLogId(crmContactAuditLogId);
	}

	/**
	 * Returns the number of CRM Contact Audit Log Changes where crmContactAuditLogId = &#63;.
	 *
	 * @param crmContactAuditLogId the crm contact audit log ID
	 * @return the number of matching CRM Contact Audit Log Changes
	 */
	public static int countByCrmContactAuditLogId(long crmContactAuditLogId) {
		return getPersistence().countByCrmContactAuditLogId(
			crmContactAuditLogId);
	}

	/**
	 * Caches the CRM Contact Audit Log Change in the entity cache if it is enabled.
	 *
	 * @param crmContactAuditLogChange the CRM Contact Audit Log Change
	 */
	public static void cacheResult(
		CrmContactAuditLogChange crmContactAuditLogChange) {

		getPersistence().cacheResult(crmContactAuditLogChange);
	}

	/**
	 * Caches the CRM Contact Audit Log Changes in the entity cache if it is enabled.
	 *
	 * @param crmContactAuditLogChanges the CRM Contact Audit Log Changes
	 */
	public static void cacheResult(
		List<CrmContactAuditLogChange> crmContactAuditLogChanges) {

		getPersistence().cacheResult(crmContactAuditLogChanges);
	}

	/**
	 * Creates a new CRM Contact Audit Log Change with the primary key. Does not add the CRM Contact Audit Log Change to the database.
	 *
	 * @param crmContactAuditLogChangeId the primary key for the new CRM Contact Audit Log Change
	 * @return the new CRM Contact Audit Log Change
	 */
	public static CrmContactAuditLogChange create(
		long crmContactAuditLogChangeId) {

		return getPersistence().create(crmContactAuditLogChangeId);
	}

	/**
	 * Removes the CRM Contact Audit Log Change with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmContactAuditLogChangeId the primary key of the CRM Contact Audit Log Change
	 * @return the CRM Contact Audit Log Change that was removed
	 * @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	public static CrmContactAuditLogChange remove(
			long crmContactAuditLogChangeId)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().remove(crmContactAuditLogChangeId);
	}

	public static CrmContactAuditLogChange updateImpl(
		CrmContactAuditLogChange crmContactAuditLogChange) {

		return getPersistence().updateImpl(crmContactAuditLogChange);
	}

	/**
	 * Returns the CRM Contact Audit Log Change with the primary key or throws a <code>NoSuchCrmContactAuditLogChangeException</code> if it could not be found.
	 *
	 * @param crmContactAuditLogChangeId the primary key of the CRM Contact Audit Log Change
	 * @return the CRM Contact Audit Log Change
	 * @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	public static CrmContactAuditLogChange findByPrimaryKey(
			long crmContactAuditLogChangeId)
		throws contact.manager.exception.
			NoSuchCrmContactAuditLogChangeException {

		return getPersistence().findByPrimaryKey(crmContactAuditLogChangeId);
	}

	/**
	 * Returns the CRM Contact Audit Log Change with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmContactAuditLogChangeId the primary key of the CRM Contact Audit Log Change
	 * @return the CRM Contact Audit Log Change, or <code>null</code> if a CRM Contact Audit Log Change with the primary key could not be found
	 */
	public static CrmContactAuditLogChange fetchByPrimaryKey(
		long crmContactAuditLogChangeId) {

		return getPersistence().fetchByPrimaryKey(crmContactAuditLogChangeId);
	}

	/**
	 * Returns all the CRM Contact Audit Log Changes.
	 *
	 * @return the CRM Contact Audit Log Changes
	 */
	public static List<CrmContactAuditLogChange> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the CRM Contact Audit Log Changes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmContactAuditLogChangeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @return the range of CRM Contact Audit Log Changes
	 */
	public static List<CrmContactAuditLogChange> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmContactAuditLogChangeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of CRM Contact Audit Log Changes
	 */
	@Deprecated
	public static List<CrmContactAuditLogChange> findAll(
		int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the CRM Contact Audit Log Changes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmContactAuditLogChangeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contact Audit Log Changes
	 * @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Contact Audit Log Changes
	 */
	public static List<CrmContactAuditLogChange> findAll(
		int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the CRM Contact Audit Log Changes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of CRM Contact Audit Log Changes.
	 *
	 * @return the number of CRM Contact Audit Log Changes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmContactAuditLogChangePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<CrmContactAuditLogChangePersistence,
		 CrmContactAuditLogChangePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			CrmContactAuditLogChangePersistence.class);

		ServiceTracker
			<CrmContactAuditLogChangePersistence,
			 CrmContactAuditLogChangePersistence> serviceTracker =
				new ServiceTracker
					<CrmContactAuditLogChangePersistence,
					 CrmContactAuditLogChangePersistence>(
						 bundle.getBundleContext(),
						 CrmContactAuditLogChangePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}