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

import contact.manager.model.CrmKioskSurvey;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM Kiosk Survey service. This utility wraps {@link contact.manager.service.persistence.impl.CrmKioskSurveyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmKioskSurveyPersistence
 * @see contact.manager.service.persistence.impl.CrmKioskSurveyPersistenceImpl
 * @generated
 */
@ProviderType
public class CrmKioskSurveyUtil {
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
	public static void clearCache(CrmKioskSurvey crmKioskSurvey) {
		getPersistence().clearCache(crmKioskSurvey);
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
	public static List<CrmKioskSurvey> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmKioskSurvey> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmKioskSurvey> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmKioskSurvey> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmKioskSurvey update(CrmKioskSurvey crmKioskSurvey) {
		return getPersistence().update(crmKioskSurvey);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmKioskSurvey update(CrmKioskSurvey crmKioskSurvey,
		ServiceContext serviceContext) {
		return getPersistence().update(crmKioskSurvey, serviceContext);
	}

	/**
	* Returns all the CRM Kiosk Surveies where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Kiosk Surveies
	*/
	public static List<CrmKioskSurvey> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the CRM Kiosk Surveies where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @return the range of matching CRM Kiosk Surveies
	*/
	public static List<CrmKioskSurvey> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Kiosk Surveies where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Kiosk Surveies
	*/
	public static List<CrmKioskSurvey> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<CrmKioskSurvey> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Kiosk Surveies where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Kiosk Surveies
	*/
	public static List<CrmKioskSurvey> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<CrmKioskSurvey> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM Kiosk Survey in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	*/
	public static CrmKioskSurvey findByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws contact.manager.exception.NoSuchCrmKioskSurveyException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first CRM Kiosk Survey in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	public static CrmKioskSurvey fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmKioskSurvey> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Kiosk Survey in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	*/
	public static CrmKioskSurvey findByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws contact.manager.exception.NoSuchCrmKioskSurveyException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Kiosk Survey in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	public static CrmKioskSurvey fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmKioskSurvey> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the CRM Kiosk Surveies before and after the current CRM Kiosk Survey in the ordered set where uuid = &#63;.
	*
	* @param crmKioskSurveyId the primary key of the current CRM Kiosk Survey
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	*/
	public static CrmKioskSurvey[] findByUuid_PrevAndNext(
		long crmKioskSurveyId, java.lang.String uuid,
		OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws contact.manager.exception.NoSuchCrmKioskSurveyException {
		return getPersistence()
				   .findByUuid_PrevAndNext(crmKioskSurveyId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the CRM Kiosk Surveies where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of CRM Kiosk Surveies where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Kiosk Surveies
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the CRM Kiosk Survey where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmKioskSurveyException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	*/
	public static CrmKioskSurvey findByUUID_G(java.lang.String uuid,
		long groupId)
		throws contact.manager.exception.NoSuchCrmKioskSurveyException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Kiosk Survey where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	public static CrmKioskSurvey fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Kiosk Survey where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	public static CrmKioskSurvey fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the CRM Kiosk Survey where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Kiosk Survey that was removed
	*/
	public static CrmKioskSurvey removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws contact.manager.exception.NoSuchCrmKioskSurveyException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of CRM Kiosk Surveies where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Kiosk Surveies
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Kiosk Surveies
	*/
	public static List<CrmKioskSurvey> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @return the range of matching CRM Kiosk Surveies
	*/
	public static List<CrmKioskSurvey> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Kiosk Surveies
	*/
	public static List<CrmKioskSurvey> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmKioskSurvey> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Kiosk Surveies
	*/
	public static List<CrmKioskSurvey> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmKioskSurvey> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	*/
	public static CrmKioskSurvey findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws contact.manager.exception.NoSuchCrmKioskSurveyException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	public static CrmKioskSurvey fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmKioskSurvey> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	*/
	public static CrmKioskSurvey findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws contact.manager.exception.NoSuchCrmKioskSurveyException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	public static CrmKioskSurvey fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmKioskSurvey> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the CRM Kiosk Surveies before and after the current CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmKioskSurveyId the primary key of the current CRM Kiosk Survey
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	*/
	public static CrmKioskSurvey[] findByUuid_C_PrevAndNext(
		long crmKioskSurveyId, java.lang.String uuid, long companyId,
		OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws contact.manager.exception.NoSuchCrmKioskSurveyException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(crmKioskSurveyId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Kiosk Surveies
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the CRM Kiosk Survey in the entity cache if it is enabled.
	*
	* @param crmKioskSurvey the CRM Kiosk Survey
	*/
	public static void cacheResult(CrmKioskSurvey crmKioskSurvey) {
		getPersistence().cacheResult(crmKioskSurvey);
	}

	/**
	* Caches the CRM Kiosk Surveies in the entity cache if it is enabled.
	*
	* @param crmKioskSurveies the CRM Kiosk Surveies
	*/
	public static void cacheResult(List<CrmKioskSurvey> crmKioskSurveies) {
		getPersistence().cacheResult(crmKioskSurveies);
	}

	/**
	* Creates a new CRM Kiosk Survey with the primary key. Does not add the CRM Kiosk Survey to the database.
	*
	* @param crmKioskSurveyId the primary key for the new CRM Kiosk Survey
	* @return the new CRM Kiosk Survey
	*/
	public static CrmKioskSurvey create(long crmKioskSurveyId) {
		return getPersistence().create(crmKioskSurveyId);
	}

	/**
	* Removes the CRM Kiosk Survey with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmKioskSurveyId the primary key of the CRM Kiosk Survey
	* @return the CRM Kiosk Survey that was removed
	* @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	*/
	public static CrmKioskSurvey remove(long crmKioskSurveyId)
		throws contact.manager.exception.NoSuchCrmKioskSurveyException {
		return getPersistence().remove(crmKioskSurveyId);
	}

	public static CrmKioskSurvey updateImpl(CrmKioskSurvey crmKioskSurvey) {
		return getPersistence().updateImpl(crmKioskSurvey);
	}

	/**
	* Returns the CRM Kiosk Survey with the primary key or throws a {@link NoSuchCrmKioskSurveyException} if it could not be found.
	*
	* @param crmKioskSurveyId the primary key of the CRM Kiosk Survey
	* @return the CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	*/
	public static CrmKioskSurvey findByPrimaryKey(long crmKioskSurveyId)
		throws contact.manager.exception.NoSuchCrmKioskSurveyException {
		return getPersistence().findByPrimaryKey(crmKioskSurveyId);
	}

	/**
	* Returns the CRM Kiosk Survey with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmKioskSurveyId the primary key of the CRM Kiosk Survey
	* @return the CRM Kiosk Survey, or <code>null</code> if a CRM Kiosk Survey with the primary key could not be found
	*/
	public static CrmKioskSurvey fetchByPrimaryKey(long crmKioskSurveyId) {
		return getPersistence().fetchByPrimaryKey(crmKioskSurveyId);
	}

	public static java.util.Map<java.io.Serializable, CrmKioskSurvey> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM Kiosk Surveies.
	*
	* @return the CRM Kiosk Surveies
	*/
	public static List<CrmKioskSurvey> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the CRM Kiosk Surveies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @return the range of CRM Kiosk Surveies
	*/
	public static List<CrmKioskSurvey> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the CRM Kiosk Surveies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Kiosk Surveies
	*/
	public static List<CrmKioskSurvey> findAll(int start, int end,
		OrderByComparator<CrmKioskSurvey> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Kiosk Surveies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Kiosk Surveies
	*/
	public static List<CrmKioskSurvey> findAll(int start, int end,
		OrderByComparator<CrmKioskSurvey> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM Kiosk Surveies from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM Kiosk Surveies.
	*
	* @return the number of CRM Kiosk Surveies
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmKioskSurveyPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmKioskSurveyPersistence, CrmKioskSurveyPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CrmKioskSurveyPersistence.class);
}