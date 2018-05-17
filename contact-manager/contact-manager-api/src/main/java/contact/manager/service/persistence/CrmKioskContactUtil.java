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

import contact.manager.model.CrmKioskContact;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM Kiosk Contact service. This utility wraps {@link contact.manager.service.persistence.impl.CrmKioskContactPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmKioskContactPersistence
 * @see contact.manager.service.persistence.impl.CrmKioskContactPersistenceImpl
 * @generated
 */
@ProviderType
public class CrmKioskContactUtil {
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
	public static void clearCache(CrmKioskContact crmKioskContact) {
		getPersistence().clearCache(crmKioskContact);
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
	public static List<CrmKioskContact> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmKioskContact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmKioskContact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmKioskContact> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmKioskContact update(CrmKioskContact crmKioskContact) {
		return getPersistence().update(crmKioskContact);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmKioskContact update(CrmKioskContact crmKioskContact,
		ServiceContext serviceContext) {
		return getPersistence().update(crmKioskContact, serviceContext);
	}

	/**
	* Returns all the CRM Kiosk Contacts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Kiosk Contacts
	*/
	public static List<CrmKioskContact> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the CRM Kiosk Contacts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @return the range of matching CRM Kiosk Contacts
	*/
	public static List<CrmKioskContact> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Kiosk Contacts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Kiosk Contacts
	*/
	public static List<CrmKioskContact> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<CrmKioskContact> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Kiosk Contacts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Kiosk Contacts
	*/
	public static List<CrmKioskContact> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<CrmKioskContact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM Kiosk Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	*/
	public static CrmKioskContact findByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmKioskContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmKioskContactException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first CRM Kiosk Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	public static CrmKioskContact fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmKioskContact> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Kiosk Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	*/
	public static CrmKioskContact findByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmKioskContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmKioskContactException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Kiosk Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	public static CrmKioskContact fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmKioskContact> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the CRM Kiosk Contacts before and after the current CRM Kiosk Contact in the ordered set where uuid = &#63;.
	*
	* @param crmKioskContactId the primary key of the current CRM Kiosk Contact
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	*/
	public static CrmKioskContact[] findByUuid_PrevAndNext(
		long crmKioskContactId, java.lang.String uuid,
		OrderByComparator<CrmKioskContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmKioskContactException {
		return getPersistence()
				   .findByUuid_PrevAndNext(crmKioskContactId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the CRM Kiosk Contacts where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of CRM Kiosk Contacts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Kiosk Contacts
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the CRM Kiosk Contact where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmKioskContactException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	*/
	public static CrmKioskContact findByUUID_G(java.lang.String uuid,
		long groupId)
		throws contact.manager.exception.NoSuchCrmKioskContactException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Kiosk Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	public static CrmKioskContact fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Kiosk Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	public static CrmKioskContact fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the CRM Kiosk Contact where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Kiosk Contact that was removed
	*/
	public static CrmKioskContact removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws contact.manager.exception.NoSuchCrmKioskContactException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of CRM Kiosk Contacts where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Kiosk Contacts
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Kiosk Contacts
	*/
	public static List<CrmKioskContact> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @return the range of matching CRM Kiosk Contacts
	*/
	public static List<CrmKioskContact> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Kiosk Contacts
	*/
	public static List<CrmKioskContact> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmKioskContact> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Kiosk Contacts
	*/
	public static List<CrmKioskContact> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmKioskContact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	*/
	public static CrmKioskContact findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmKioskContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmKioskContactException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	public static CrmKioskContact fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmKioskContact> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a matching CRM Kiosk Contact could not be found
	*/
	public static CrmKioskContact findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmKioskContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmKioskContactException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	public static CrmKioskContact fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmKioskContact> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the CRM Kiosk Contacts before and after the current CRM Kiosk Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmKioskContactId the primary key of the current CRM Kiosk Contact
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	*/
	public static CrmKioskContact[] findByUuid_C_PrevAndNext(
		long crmKioskContactId, java.lang.String uuid, long companyId,
		OrderByComparator<CrmKioskContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmKioskContactException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(crmKioskContactId, uuid,
			companyId, orderByComparator);
	}

	/**
	* Removes all the CRM Kiosk Contacts where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of CRM Kiosk Contacts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Kiosk Contacts
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the CRM Kiosk Contact in the entity cache if it is enabled.
	*
	* @param crmKioskContact the CRM Kiosk Contact
	*/
	public static void cacheResult(CrmKioskContact crmKioskContact) {
		getPersistence().cacheResult(crmKioskContact);
	}

	/**
	* Caches the CRM Kiosk Contacts in the entity cache if it is enabled.
	*
	* @param crmKioskContacts the CRM Kiosk Contacts
	*/
	public static void cacheResult(List<CrmKioskContact> crmKioskContacts) {
		getPersistence().cacheResult(crmKioskContacts);
	}

	/**
	* Creates a new CRM Kiosk Contact with the primary key. Does not add the CRM Kiosk Contact to the database.
	*
	* @param crmKioskContactId the primary key for the new CRM Kiosk Contact
	* @return the new CRM Kiosk Contact
	*/
	public static CrmKioskContact create(long crmKioskContactId) {
		return getPersistence().create(crmKioskContactId);
	}

	/**
	* Removes the CRM Kiosk Contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmKioskContactId the primary key of the CRM Kiosk Contact
	* @return the CRM Kiosk Contact that was removed
	* @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	*/
	public static CrmKioskContact remove(long crmKioskContactId)
		throws contact.manager.exception.NoSuchCrmKioskContactException {
		return getPersistence().remove(crmKioskContactId);
	}

	public static CrmKioskContact updateImpl(CrmKioskContact crmKioskContact) {
		return getPersistence().updateImpl(crmKioskContact);
	}

	/**
	* Returns the CRM Kiosk Contact with the primary key or throws a {@link NoSuchCrmKioskContactException} if it could not be found.
	*
	* @param crmKioskContactId the primary key of the CRM Kiosk Contact
	* @return the CRM Kiosk Contact
	* @throws NoSuchCrmKioskContactException if a CRM Kiosk Contact with the primary key could not be found
	*/
	public static CrmKioskContact findByPrimaryKey(long crmKioskContactId)
		throws contact.manager.exception.NoSuchCrmKioskContactException {
		return getPersistence().findByPrimaryKey(crmKioskContactId);
	}

	/**
	* Returns the CRM Kiosk Contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmKioskContactId the primary key of the CRM Kiosk Contact
	* @return the CRM Kiosk Contact, or <code>null</code> if a CRM Kiosk Contact with the primary key could not be found
	*/
	public static CrmKioskContact fetchByPrimaryKey(long crmKioskContactId) {
		return getPersistence().fetchByPrimaryKey(crmKioskContactId);
	}

	public static java.util.Map<java.io.Serializable, CrmKioskContact> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM Kiosk Contacts.
	*
	* @return the CRM Kiosk Contacts
	*/
	public static List<CrmKioskContact> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the CRM Kiosk Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @return the range of CRM Kiosk Contacts
	*/
	public static List<CrmKioskContact> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the CRM Kiosk Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Kiosk Contacts
	*/
	public static List<CrmKioskContact> findAll(int start, int end,
		OrderByComparator<CrmKioskContact> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Kiosk Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Kiosk Contacts
	*/
	public static List<CrmKioskContact> findAll(int start, int end,
		OrderByComparator<CrmKioskContact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM Kiosk Contacts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM Kiosk Contacts.
	*
	* @return the number of CRM Kiosk Contacts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmKioskContactPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmKioskContactPersistence, CrmKioskContactPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CrmKioskContactPersistence.class);
}