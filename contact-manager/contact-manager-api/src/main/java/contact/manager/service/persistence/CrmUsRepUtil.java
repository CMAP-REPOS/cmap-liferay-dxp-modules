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

import contact.manager.model.CrmUsRep;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the CRM US Rep service. This utility wraps <code>contact.manager.service.persistence.impl.CrmUsRepPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmUsRepPersistence
 * @generated
 */
@ProviderType
public class CrmUsRepUtil {

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
	public static void clearCache(CrmUsRep crmUsRep) {
		getPersistence().clearCache(crmUsRep);
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
	public static Map<Serializable, CrmUsRep> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CrmUsRep> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmUsRep> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmUsRep> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmUsRep update(CrmUsRep crmUsRep) {
		return getPersistence().update(crmUsRep);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmUsRep update(
		CrmUsRep crmUsRep, ServiceContext serviceContext) {

		return getPersistence().update(crmUsRep, serviceContext);
	}

	/**
	 * Returns all the CRM US Reps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM US Reps
	 */
	public static List<CrmUsRep> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the CRM US Reps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @return the range of matching CRM US Reps
	 */
	public static List<CrmUsRep> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM US Reps
	 */
	@Deprecated
	public static List<CrmUsRep> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM US Reps
	 */
	public static List<CrmUsRep> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns the first CRM US Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep findByUuid_First(
			String uuid, OrderByComparator<CrmUsRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first CRM US Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep fetchByUuid_First(
		String uuid, OrderByComparator<CrmUsRep> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last CRM US Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep findByUuid_Last(
			String uuid, OrderByComparator<CrmUsRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last CRM US Rep in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep fetchByUuid_Last(
		String uuid, OrderByComparator<CrmUsRep> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the CRM US Reps before and after the current CRM US Rep in the ordered set where uuid = &#63;.
	 *
	 * @param crmUsRepId the primary key of the current CRM US Rep
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM US Rep
	 * @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	 */
	public static CrmUsRep[] findByUuid_PrevAndNext(
			long crmUsRepId, String uuid,
			OrderByComparator<CrmUsRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().findByUuid_PrevAndNext(
			crmUsRepId, uuid, orderByComparator);
	}

	/**
	 * Removes all the CRM US Reps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of CRM US Reps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM US Reps
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the CRM US Rep where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCrmUsRepException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep findByUUID_G(String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the CRM US Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	@Deprecated
	public static CrmUsRep fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Returns the CRM US Rep where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Removes the CRM US Rep where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM US Rep that was removed
	 */
	public static CrmUsRep removeByUUID_G(String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of CRM US Reps where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM US Reps
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the CRM US Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM US Reps
	 */
	public static List<CrmUsRep> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the CRM US Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @return the range of matching CRM US Reps
	 */
	public static List<CrmUsRep> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM US Reps
	 */
	@Deprecated
	public static List<CrmUsRep> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM US Reps
	 */
	public static List<CrmUsRep> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the first CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CrmUsRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CrmUsRep> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CrmUsRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CrmUsRep> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the CRM US Reps before and after the current CRM US Rep in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmUsRepId the primary key of the current CRM US Rep
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM US Rep
	 * @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	 */
	public static CrmUsRep[] findByUuid_C_PrevAndNext(
			long crmUsRepId, String uuid, long companyId,
			OrderByComparator<CrmUsRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().findByUuid_C_PrevAndNext(
			crmUsRepId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the CRM US Reps where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of CRM US Reps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM US Reps
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the CRM US Reps where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the matching CRM US Reps
	 */
	public static List<CrmUsRep> findByZipCode(String zipCode) {
		return getPersistence().findByZipCode(zipCode);
	}

	/**
	 * Returns a range of all the CRM US Reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @return the range of matching CRM US Reps
	 */
	public static List<CrmUsRep> findByZipCode(
		String zipCode, int start, int end) {

		return getPersistence().findByZipCode(zipCode, start, end);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByZipCode(String, int, int, OrderByComparator)}
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM US Reps
	 */
	@Deprecated
	public static List<CrmUsRep> findByZipCode(
		String zipCode, int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByZipCode(
			zipCode, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps where zipCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param zipCode the zip code
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM US Reps
	 */
	public static List<CrmUsRep> findByZipCode(
		String zipCode, int start, int end,
		OrderByComparator<CrmUsRep> orderByComparator) {

		return getPersistence().findByZipCode(
			zipCode, start, end, orderByComparator);
	}

	/**
	 * Returns the first CRM US Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep findByZipCode_First(
			String zipCode, OrderByComparator<CrmUsRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().findByZipCode_First(zipCode, orderByComparator);
	}

	/**
	 * Returns the first CRM US Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep fetchByZipCode_First(
		String zipCode, OrderByComparator<CrmUsRep> orderByComparator) {

		return getPersistence().fetchByZipCode_First(
			zipCode, orderByComparator);
	}

	/**
	 * Returns the last CRM US Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM US Rep
	 * @throws NoSuchCrmUsRepException if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep findByZipCode_Last(
			String zipCode, OrderByComparator<CrmUsRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().findByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	 * Returns the last CRM US Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	public static CrmUsRep fetchByZipCode_Last(
		String zipCode, OrderByComparator<CrmUsRep> orderByComparator) {

		return getPersistence().fetchByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	 * Returns the CRM US Reps before and after the current CRM US Rep in the ordered set where zipCode = &#63;.
	 *
	 * @param crmUsRepId the primary key of the current CRM US Rep
	 * @param zipCode the zip code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM US Rep
	 * @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	 */
	public static CrmUsRep[] findByZipCode_PrevAndNext(
			long crmUsRepId, String zipCode,
			OrderByComparator<CrmUsRep> orderByComparator)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().findByZipCode_PrevAndNext(
			crmUsRepId, zipCode, orderByComparator);
	}

	/**
	 * Removes all the CRM US Reps where zipCode = &#63; from the database.
	 *
	 * @param zipCode the zip code
	 */
	public static void removeByZipCode(String zipCode) {
		getPersistence().removeByZipCode(zipCode);
	}

	/**
	 * Returns the number of CRM US Reps where zipCode = &#63;.
	 *
	 * @param zipCode the zip code
	 * @return the number of matching CRM US Reps
	 */
	public static int countByZipCode(String zipCode) {
		return getPersistence().countByZipCode(zipCode);
	}

	/**
	 * Caches the CRM US Rep in the entity cache if it is enabled.
	 *
	 * @param crmUsRep the CRM US Rep
	 */
	public static void cacheResult(CrmUsRep crmUsRep) {
		getPersistence().cacheResult(crmUsRep);
	}

	/**
	 * Caches the CRM US Reps in the entity cache if it is enabled.
	 *
	 * @param crmUsReps the CRM US Reps
	 */
	public static void cacheResult(List<CrmUsRep> crmUsReps) {
		getPersistence().cacheResult(crmUsReps);
	}

	/**
	 * Creates a new CRM US Rep with the primary key. Does not add the CRM US Rep to the database.
	 *
	 * @param crmUsRepId the primary key for the new CRM US Rep
	 * @return the new CRM US Rep
	 */
	public static CrmUsRep create(long crmUsRepId) {
		return getPersistence().create(crmUsRepId);
	}

	/**
	 * Removes the CRM US Rep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmUsRepId the primary key of the CRM US Rep
	 * @return the CRM US Rep that was removed
	 * @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	 */
	public static CrmUsRep remove(long crmUsRepId)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().remove(crmUsRepId);
	}

	public static CrmUsRep updateImpl(CrmUsRep crmUsRep) {
		return getPersistence().updateImpl(crmUsRep);
	}

	/**
	 * Returns the CRM US Rep with the primary key or throws a <code>NoSuchCrmUsRepException</code> if it could not be found.
	 *
	 * @param crmUsRepId the primary key of the CRM US Rep
	 * @return the CRM US Rep
	 * @throws NoSuchCrmUsRepException if a CRM US Rep with the primary key could not be found
	 */
	public static CrmUsRep findByPrimaryKey(long crmUsRepId)
		throws contact.manager.exception.NoSuchCrmUsRepException {

		return getPersistence().findByPrimaryKey(crmUsRepId);
	}

	/**
	 * Returns the CRM US Rep with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmUsRepId the primary key of the CRM US Rep
	 * @return the CRM US Rep, or <code>null</code> if a CRM US Rep with the primary key could not be found
	 */
	public static CrmUsRep fetchByPrimaryKey(long crmUsRepId) {
		return getPersistence().fetchByPrimaryKey(crmUsRepId);
	}

	/**
	 * Returns all the CRM US Reps.
	 *
	 * @return the CRM US Reps
	 */
	public static List<CrmUsRep> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the CRM US Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @return the range of CRM US Reps
	 */
	public static List<CrmUsRep> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of CRM US Reps
	 */
	@Deprecated
	public static List<CrmUsRep> findAll(
		int start, int end, OrderByComparator<CrmUsRep> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the CRM US Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM US Reps
	 */
	public static List<CrmUsRep> findAll(
		int start, int end, OrderByComparator<CrmUsRep> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the CRM US Reps from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of CRM US Reps.
	 *
	 * @return the number of CRM US Reps
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmUsRepPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmUsRepPersistence, CrmUsRepPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CrmUsRepPersistence.class);

		ServiceTracker<CrmUsRepPersistence, CrmUsRepPersistence>
			serviceTracker =
				new ServiceTracker<CrmUsRepPersistence, CrmUsRepPersistence>(
					bundle.getBundleContext(), CrmUsRepPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}