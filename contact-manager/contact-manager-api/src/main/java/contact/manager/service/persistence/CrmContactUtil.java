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

import contact.manager.model.CrmContact;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM Contact service. This utility wraps {@link contact.manager.service.persistence.impl.CrmContactPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactPersistence
 * @see contact.manager.service.persistence.impl.CrmContactPersistenceImpl
 * @generated
 */
@ProviderType
public class CrmContactUtil {
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
	public static void clearCache(CrmContact crmContact) {
		getPersistence().clearCache(crmContact);
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
	public static List<CrmContact> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmContact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmContact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmContact update(CrmContact crmContact) {
		return getPersistence().update(crmContact);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmContact update(CrmContact crmContact,
		ServiceContext serviceContext) {
		return getPersistence().update(crmContact, serviceContext);
	}

	/**
	* Returns all the CRM Contacts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Contacts
	*/
	public static List<CrmContact> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the CRM Contacts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public static List<CrmContact> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where uuid = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public static CrmContact[] findByUuid_PrevAndNext(long crmContactId,
		java.lang.String uuid, OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByUuid_PrevAndNext(crmContactId, uuid, orderByComparator);
	}

	/**
	* Removes all the CRM Contacts where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of CRM Contacts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Contacts
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the CRM Contact where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmContactException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByUUID_G(java.lang.String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Contact where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the CRM Contact where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Contact that was removed
	*/
	public static CrmContact removeByUUID_G(java.lang.String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of CRM Contacts where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Contacts
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Contacts
	*/
	public static List<CrmContact> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public static List<CrmContact> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public static CrmContact[] findByUuid_C_PrevAndNext(long crmContactId,
		java.lang.String uuid, long companyId,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(crmContactId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the CRM Contacts where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of CRM Contacts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Contacts
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the CRM Contacts where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @return the matching CRM Contacts
	*/
	public static List<CrmContact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress) {
		return getPersistence().findByPrimaryEmailAddress(primaryEmailAddress);
	}

	/**
	* Returns a range of all the CRM Contacts where primaryEmailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public static List<CrmContact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress, int start, int end) {
		return getPersistence()
				   .findByPrimaryEmailAddress(primaryEmailAddress, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where primaryEmailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress, int start, int end,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .findByPrimaryEmailAddress(primaryEmailAddress, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where primaryEmailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress, int start, int end,
		OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPrimaryEmailAddress(primaryEmailAddress, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByPrimaryEmailAddress_First(
		java.lang.String primaryEmailAddress,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByPrimaryEmailAddress_First(primaryEmailAddress,
			orderByComparator);
	}

	/**
	* Returns the first CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByPrimaryEmailAddress_First(
		java.lang.String primaryEmailAddress,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .fetchByPrimaryEmailAddress_First(primaryEmailAddress,
			orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByPrimaryEmailAddress_Last(
		java.lang.String primaryEmailAddress,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByPrimaryEmailAddress_Last(primaryEmailAddress,
			orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByPrimaryEmailAddress_Last(
		java.lang.String primaryEmailAddress,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .fetchByPrimaryEmailAddress_Last(primaryEmailAddress,
			orderByComparator);
	}

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where primaryEmailAddress = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param primaryEmailAddress the primary email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public static CrmContact[] findByPrimaryEmailAddress_PrevAndNext(
		long crmContactId, java.lang.String primaryEmailAddress,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByPrimaryEmailAddress_PrevAndNext(crmContactId,
			primaryEmailAddress, orderByComparator);
	}

	/**
	* Removes all the CRM Contacts where primaryEmailAddress = &#63; from the database.
	*
	* @param primaryEmailAddress the primary email address
	*/
	public static void removeByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress) {
		getPersistence().removeByPrimaryEmailAddress(primaryEmailAddress);
	}

	/**
	* Returns the number of CRM Contacts where primaryEmailAddress = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @return the number of matching CRM Contacts
	*/
	public static int countByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress) {
		return getPersistence().countByPrimaryEmailAddress(primaryEmailAddress);
	}

	/**
	* Returns all the CRM Contacts where status = &#63;.
	*
	* @param status the status
	* @return the matching CRM Contacts
	*/
	public static List<CrmContact> findByStatus(java.lang.String status) {
		return getPersistence().findByStatus(status);
	}

	/**
	* Returns a range of all the CRM Contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public static List<CrmContact> findByStatus(java.lang.String status,
		int start, int end) {
		return getPersistence().findByStatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByStatus(java.lang.String status,
		int start, int end, OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByStatus(java.lang.String status,
		int start, int end, OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM Contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByStatus_First(java.lang.String status,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the first CRM Contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByStatus_First(java.lang.String status,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByStatus_Last(java.lang.String status,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByStatus_Last(java.lang.String status,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where status = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public static CrmContact[] findByStatus_PrevAndNext(long crmContactId,
		java.lang.String status, OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByStatus_PrevAndNext(crmContactId, status,
			orderByComparator);
	}

	/**
	* Removes all the CRM Contacts where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeByStatus(java.lang.String status) {
		getPersistence().removeByStatus(status);
	}

	/**
	* Returns the number of CRM Contacts where status = &#63;.
	*
	* @param status the status
	* @return the number of matching CRM Contacts
	*/
	public static int countByStatus(java.lang.String status) {
		return getPersistence().countByStatus(status);
	}

	/**
	* Returns all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @return the matching CRM Contacts
	*/
	public static List<CrmContact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status) {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status);
	}

	/**
	* Returns a range of all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public static List<CrmContact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status,
		int start, int end) {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status,
		int start, int end, OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status,
		int start, int end, OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByPrimaryEmailAddressAndStatus_First(
		java.lang.String primaryEmailAddress, java.lang.String status,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus_First(primaryEmailAddress,
			status, orderByComparator);
	}

	/**
	* Returns the first CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByPrimaryEmailAddressAndStatus_First(
		java.lang.String primaryEmailAddress, java.lang.String status,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .fetchByPrimaryEmailAddressAndStatus_First(primaryEmailAddress,
			status, orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByPrimaryEmailAddressAndStatus_Last(
		java.lang.String primaryEmailAddress, java.lang.String status,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus_Last(primaryEmailAddress,
			status, orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByPrimaryEmailAddressAndStatus_Last(
		java.lang.String primaryEmailAddress, java.lang.String status,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .fetchByPrimaryEmailAddressAndStatus_Last(primaryEmailAddress,
			status, orderByComparator);
	}

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public static CrmContact[] findByPrimaryEmailAddressAndStatus_PrevAndNext(
		long crmContactId, java.lang.String primaryEmailAddress,
		java.lang.String status, OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByPrimaryEmailAddressAndStatus_PrevAndNext(crmContactId,
			primaryEmailAddress, status, orderByComparator);
	}

	/**
	* Removes all the CRM Contacts where primaryEmailAddress = &#63; and status = &#63; from the database.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	*/
	public static void removeByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status) {
		getPersistence()
			.removeByPrimaryEmailAddressAndStatus(primaryEmailAddress, status);
	}

	/**
	* Returns the number of CRM Contacts where primaryEmailAddress = &#63; and status = &#63;.
	*
	* @param primaryEmailAddress the primary email address
	* @param status the status
	* @return the number of matching CRM Contacts
	*/
	public static int countByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status) {
		return getPersistence()
				   .countByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status);
	}

	/**
	* Returns all the CRM Contacts where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @return the matching CRM Contacts
	*/
	public static List<CrmContact> findByName(java.lang.String firstName,
		java.lang.String middleName, java.lang.String lastName) {
		return getPersistence().findByName(firstName, middleName, lastName);
	}

	/**
	* Returns a range of all the CRM Contacts where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public static List<CrmContact> findByName(java.lang.String firstName,
		java.lang.String middleName, java.lang.String lastName, int start,
		int end) {
		return getPersistence()
				   .findByName(firstName, middleName, lastName, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByName(java.lang.String firstName,
		java.lang.String middleName, java.lang.String lastName, int start,
		int end, OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .findByName(firstName, middleName, lastName, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByName(java.lang.String firstName,
		java.lang.String middleName, java.lang.String lastName, int start,
		int end, OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByName(firstName, middleName, lastName, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Contact in the ordered set where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByName_First(java.lang.String firstName,
		java.lang.String middleName, java.lang.String lastName,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByName_First(firstName, middleName, lastName,
			orderByComparator);
	}

	/**
	* Returns the first CRM Contact in the ordered set where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByName_First(java.lang.String firstName,
		java.lang.String middleName, java.lang.String lastName,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .fetchByName_First(firstName, middleName, lastName,
			orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByName_Last(java.lang.String firstName,
		java.lang.String middleName, java.lang.String lastName,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByName_Last(firstName, middleName, lastName,
			orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByName_Last(java.lang.String firstName,
		java.lang.String middleName, java.lang.String lastName,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .fetchByName_Last(firstName, middleName, lastName,
			orderByComparator);
	}

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public static CrmContact[] findByName_PrevAndNext(long crmContactId,
		java.lang.String firstName, java.lang.String middleName,
		java.lang.String lastName,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByName_PrevAndNext(crmContactId, firstName, middleName,
			lastName, orderByComparator);
	}

	/**
	* Removes all the CRM Contacts where firstName = &#63; and middleName = &#63; and lastName = &#63; from the database.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	*/
	public static void removeByName(java.lang.String firstName,
		java.lang.String middleName, java.lang.String lastName) {
		getPersistence().removeByName(firstName, middleName, lastName);
	}

	/**
	* Returns the number of CRM Contacts where firstName = &#63; and middleName = &#63; and lastName = &#63;.
	*
	* @param firstName the first name
	* @param middleName the middle name
	* @param lastName the last name
	* @return the number of matching CRM Contacts
	*/
	public static int countByName(java.lang.String firstName,
		java.lang.String middleName, java.lang.String lastName) {
		return getPersistence().countByName(firstName, middleName, lastName);
	}

	/**
	* Returns the CRM Contact where constantContactId = &#63; or throws a {@link NoSuchCrmContactException} if it could not be found.
	*
	* @param constantContactId the constant contact ID
	* @return the matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByConstantContactId(long constantContactId)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence().findByConstantContactId(constantContactId);
	}

	/**
	* Returns the CRM Contact where constantContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param constantContactId the constant contact ID
	* @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByConstantContactId(long constantContactId) {
		return getPersistence().fetchByConstantContactId(constantContactId);
	}

	/**
	* Returns the CRM Contact where constantContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param constantContactId the constant contact ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByConstantContactId(long constantContactId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByConstantContactId(constantContactId,
			retrieveFromCache);
	}

	/**
	* Removes the CRM Contact where constantContactId = &#63; from the database.
	*
	* @param constantContactId the constant contact ID
	* @return the CRM Contact that was removed
	*/
	public static CrmContact removeByConstantContactId(long constantContactId)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence().removeByConstantContactId(constantContactId);
	}

	/**
	* Returns the number of CRM Contacts where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @return the number of matching CRM Contacts
	*/
	public static int countByConstantContactId(long constantContactId) {
		return getPersistence().countByConstantContactId(constantContactId);
	}

	/**
	* Returns all the CRM Contacts where isVip = &#63;.
	*
	* @param isVip the is vip
	* @return the matching CRM Contacts
	*/
	public static List<CrmContact> findByVipFlag(boolean isVip) {
		return getPersistence().findByVipFlag(isVip);
	}

	/**
	* Returns a range of all the CRM Contacts where isVip = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isVip the is vip
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of matching CRM Contacts
	*/
	public static List<CrmContact> findByVipFlag(boolean isVip, int start,
		int end) {
		return getPersistence().findByVipFlag(isVip, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where isVip = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isVip the is vip
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByVipFlag(boolean isVip, int start,
		int end, OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence()
				   .findByVipFlag(isVip, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contacts where isVip = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isVip the is vip
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contacts
	*/
	public static List<CrmContact> findByVipFlag(boolean isVip, int start,
		int end, OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVipFlag(isVip, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM Contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByVipFlag_First(boolean isVip,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence().findByVipFlag_First(isVip, orderByComparator);
	}

	/**
	* Returns the first CRM Contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByVipFlag_First(boolean isVip,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence().fetchByVipFlag_First(isVip, orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact
	* @throws NoSuchCrmContactException if a matching CRM Contact could not be found
	*/
	public static CrmContact findByVipFlag_Last(boolean isVip,
		OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence().findByVipFlag_Last(isVip, orderByComparator);
	}

	/**
	* Returns the last CRM Contact in the ordered set where isVip = &#63;.
	*
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static CrmContact fetchByVipFlag_Last(boolean isVip,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence().fetchByVipFlag_Last(isVip, orderByComparator);
	}

	/**
	* Returns the CRM Contacts before and after the current CRM Contact in the ordered set where isVip = &#63;.
	*
	* @param crmContactId the primary key of the current CRM Contact
	* @param isVip the is vip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public static CrmContact[] findByVipFlag_PrevAndNext(long crmContactId,
		boolean isVip, OrderByComparator<CrmContact> orderByComparator)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence()
				   .findByVipFlag_PrevAndNext(crmContactId, isVip,
			orderByComparator);
	}

	/**
	* Removes all the CRM Contacts where isVip = &#63; from the database.
	*
	* @param isVip the is vip
	*/
	public static void removeByVipFlag(boolean isVip) {
		getPersistence().removeByVipFlag(isVip);
	}

	/**
	* Returns the number of CRM Contacts where isVip = &#63;.
	*
	* @param isVip the is vip
	* @return the number of matching CRM Contacts
	*/
	public static int countByVipFlag(boolean isVip) {
		return getPersistence().countByVipFlag(isVip);
	}

	/**
	* Caches the CRM Contact in the entity cache if it is enabled.
	*
	* @param crmContact the CRM Contact
	*/
	public static void cacheResult(CrmContact crmContact) {
		getPersistence().cacheResult(crmContact);
	}

	/**
	* Caches the CRM Contacts in the entity cache if it is enabled.
	*
	* @param crmContacts the CRM Contacts
	*/
	public static void cacheResult(List<CrmContact> crmContacts) {
		getPersistence().cacheResult(crmContacts);
	}

	/**
	* Creates a new CRM Contact with the primary key. Does not add the CRM Contact to the database.
	*
	* @param crmContactId the primary key for the new CRM Contact
	* @return the new CRM Contact
	*/
	public static CrmContact create(long crmContactId) {
		return getPersistence().create(crmContactId);
	}

	/**
	* Removes the CRM Contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactId the primary key of the CRM Contact
	* @return the CRM Contact that was removed
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public static CrmContact remove(long crmContactId)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence().remove(crmContactId);
	}

	public static CrmContact updateImpl(CrmContact crmContact) {
		return getPersistence().updateImpl(crmContact);
	}

	/**
	* Returns the CRM Contact with the primary key or throws a {@link NoSuchCrmContactException} if it could not be found.
	*
	* @param crmContactId the primary key of the CRM Contact
	* @return the CRM Contact
	* @throws NoSuchCrmContactException if a CRM Contact with the primary key could not be found
	*/
	public static CrmContact findByPrimaryKey(long crmContactId)
		throws contact.manager.exception.NoSuchCrmContactException {
		return getPersistence().findByPrimaryKey(crmContactId);
	}

	/**
	* Returns the CRM Contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmContactId the primary key of the CRM Contact
	* @return the CRM Contact, or <code>null</code> if a CRM Contact with the primary key could not be found
	*/
	public static CrmContact fetchByPrimaryKey(long crmContactId) {
		return getPersistence().fetchByPrimaryKey(crmContactId);
	}

	public static java.util.Map<java.io.Serializable, CrmContact> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM Contacts.
	*
	* @return the CRM Contacts
	*/
	public static List<CrmContact> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the CRM Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of CRM Contacts
	*/
	public static List<CrmContact> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Contacts
	*/
	public static List<CrmContact> findAll(int start, int end,
		OrderByComparator<CrmContact> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Contacts
	*/
	public static List<CrmContact> findAll(int start, int end,
		OrderByComparator<CrmContact> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM Contacts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM Contacts.
	*
	* @return the number of CRM Contacts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	/**
	* Returns the primaryKeys of CRM Groups associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @return long[] of the primaryKeys of CRM Groups associated with the CRM Contact
	*/
	public static long[] getCrmGroupPrimaryKeys(long pk) {
		return getPersistence().getCrmGroupPrimaryKeys(pk);
	}

	/**
	* Returns all the CRM Groups associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @return the CRM Groups associated with the CRM Contact
	*/
	public static List<contact.manager.model.CrmGroup> getCrmGroups(long pk) {
		return getPersistence().getCrmGroups(pk);
	}

	/**
	* Returns a range of all the CRM Groups associated with the CRM Contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the CRM Contact
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of CRM Groups associated with the CRM Contact
	*/
	public static List<contact.manager.model.CrmGroup> getCrmGroups(long pk,
		int start, int end) {
		return getPersistence().getCrmGroups(pk, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Groups associated with the CRM Contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the CRM Contact
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Groups associated with the CRM Contact
	*/
	public static List<contact.manager.model.CrmGroup> getCrmGroups(long pk,
		int start, int end,
		OrderByComparator<contact.manager.model.CrmGroup> orderByComparator) {
		return getPersistence().getCrmGroups(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of CRM Groups associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @return the number of CRM Groups associated with the CRM Contact
	*/
	public static int getCrmGroupsSize(long pk) {
		return getPersistence().getCrmGroupsSize(pk);
	}

	/**
	* Returns <code>true</code> if the CRM Group is associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroupPK the primary key of the CRM Group
	* @return <code>true</code> if the CRM Group is associated with the CRM Contact; <code>false</code> otherwise
	*/
	public static boolean containsCrmGroup(long pk, long crmGroupPK) {
		return getPersistence().containsCrmGroup(pk, crmGroupPK);
	}

	/**
	* Returns <code>true</code> if the CRM Contact has any CRM Groups associated with it.
	*
	* @param pk the primary key of the CRM Contact to check for associations with CRM Groups
	* @return <code>true</code> if the CRM Contact has any CRM Groups associated with it; <code>false</code> otherwise
	*/
	public static boolean containsCrmGroups(long pk) {
		return getPersistence().containsCrmGroups(pk);
	}

	/**
	* Adds an association between the CRM Contact and the CRM Group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroupPK the primary key of the CRM Group
	*/
	public static void addCrmGroup(long pk, long crmGroupPK) {
		getPersistence().addCrmGroup(pk, crmGroupPK);
	}

	/**
	* Adds an association between the CRM Contact and the CRM Group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroup the CRM Group
	*/
	public static void addCrmGroup(long pk,
		contact.manager.model.CrmGroup crmGroup) {
		getPersistence().addCrmGroup(pk, crmGroup);
	}

	/**
	* Adds an association between the CRM Contact and the CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroupPKs the primary keys of the CRM Groups
	*/
	public static void addCrmGroups(long pk, long[] crmGroupPKs) {
		getPersistence().addCrmGroups(pk, crmGroupPKs);
	}

	/**
	* Adds an association between the CRM Contact and the CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroups the CRM Groups
	*/
	public static void addCrmGroups(long pk,
		List<contact.manager.model.CrmGroup> crmGroups) {
		getPersistence().addCrmGroups(pk, crmGroups);
	}

	/**
	* Clears all associations between the CRM Contact and its CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact to clear the associated CRM Groups from
	*/
	public static void clearCrmGroups(long pk) {
		getPersistence().clearCrmGroups(pk);
	}

	/**
	* Removes the association between the CRM Contact and the CRM Group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroupPK the primary key of the CRM Group
	*/
	public static void removeCrmGroup(long pk, long crmGroupPK) {
		getPersistence().removeCrmGroup(pk, crmGroupPK);
	}

	/**
	* Removes the association between the CRM Contact and the CRM Group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroup the CRM Group
	*/
	public static void removeCrmGroup(long pk,
		contact.manager.model.CrmGroup crmGroup) {
		getPersistence().removeCrmGroup(pk, crmGroup);
	}

	/**
	* Removes the association between the CRM Contact and the CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroupPKs the primary keys of the CRM Groups
	*/
	public static void removeCrmGroups(long pk, long[] crmGroupPKs) {
		getPersistence().removeCrmGroups(pk, crmGroupPKs);
	}

	/**
	* Removes the association between the CRM Contact and the CRM Groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroups the CRM Groups
	*/
	public static void removeCrmGroups(long pk,
		List<contact.manager.model.CrmGroup> crmGroups) {
		getPersistence().removeCrmGroups(pk, crmGroups);
	}

	/**
	* Sets the CRM Groups associated with the CRM Contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroupPKs the primary keys of the CRM Groups to be associated with the CRM Contact
	*/
	public static void setCrmGroups(long pk, long[] crmGroupPKs) {
		getPersistence().setCrmGroups(pk, crmGroupPKs);
	}

	/**
	* Sets the CRM Groups associated with the CRM Contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmGroups the CRM Groups to be associated with the CRM Contact
	*/
	public static void setCrmGroups(long pk,
		List<contact.manager.model.CrmGroup> crmGroups) {
		getPersistence().setCrmGroups(pk, crmGroups);
	}

	/**
	* Returns the primaryKeys of CRM Tags associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @return long[] of the primaryKeys of CRM Tags associated with the CRM Contact
	*/
	public static long[] getCrmTagPrimaryKeys(long pk) {
		return getPersistence().getCrmTagPrimaryKeys(pk);
	}

	/**
	* Returns all the CRM Tags associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @return the CRM Tags associated with the CRM Contact
	*/
	public static List<contact.manager.model.CrmTag> getCrmTags(long pk) {
		return getPersistence().getCrmTags(pk);
	}

	/**
	* Returns a range of all the CRM Tags associated with the CRM Contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the CRM Contact
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of CRM Tags associated with the CRM Contact
	*/
	public static List<contact.manager.model.CrmTag> getCrmTags(long pk,
		int start, int end) {
		return getPersistence().getCrmTags(pk, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Tags associated with the CRM Contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the CRM Contact
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Tags associated with the CRM Contact
	*/
	public static List<contact.manager.model.CrmTag> getCrmTags(long pk,
		int start, int end,
		OrderByComparator<contact.manager.model.CrmTag> orderByComparator) {
		return getPersistence().getCrmTags(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of CRM Tags associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @return the number of CRM Tags associated with the CRM Contact
	*/
	public static int getCrmTagsSize(long pk) {
		return getPersistence().getCrmTagsSize(pk);
	}

	/**
	* Returns <code>true</code> if the CRM Tag is associated with the CRM Contact.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTagPK the primary key of the CRM Tag
	* @return <code>true</code> if the CRM Tag is associated with the CRM Contact; <code>false</code> otherwise
	*/
	public static boolean containsCrmTag(long pk, long crmTagPK) {
		return getPersistence().containsCrmTag(pk, crmTagPK);
	}

	/**
	* Returns <code>true</code> if the CRM Contact has any CRM Tags associated with it.
	*
	* @param pk the primary key of the CRM Contact to check for associations with CRM Tags
	* @return <code>true</code> if the CRM Contact has any CRM Tags associated with it; <code>false</code> otherwise
	*/
	public static boolean containsCrmTags(long pk) {
		return getPersistence().containsCrmTags(pk);
	}

	/**
	* Adds an association between the CRM Contact and the CRM Tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTagPK the primary key of the CRM Tag
	*/
	public static void addCrmTag(long pk, long crmTagPK) {
		getPersistence().addCrmTag(pk, crmTagPK);
	}

	/**
	* Adds an association between the CRM Contact and the CRM Tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTag the CRM Tag
	*/
	public static void addCrmTag(long pk, contact.manager.model.CrmTag crmTag) {
		getPersistence().addCrmTag(pk, crmTag);
	}

	/**
	* Adds an association between the CRM Contact and the CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTagPKs the primary keys of the CRM Tags
	*/
	public static void addCrmTags(long pk, long[] crmTagPKs) {
		getPersistence().addCrmTags(pk, crmTagPKs);
	}

	/**
	* Adds an association between the CRM Contact and the CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTags the CRM Tags
	*/
	public static void addCrmTags(long pk,
		List<contact.manager.model.CrmTag> crmTags) {
		getPersistence().addCrmTags(pk, crmTags);
	}

	/**
	* Clears all associations between the CRM Contact and its CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact to clear the associated CRM Tags from
	*/
	public static void clearCrmTags(long pk) {
		getPersistence().clearCrmTags(pk);
	}

	/**
	* Removes the association between the CRM Contact and the CRM Tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTagPK the primary key of the CRM Tag
	*/
	public static void removeCrmTag(long pk, long crmTagPK) {
		getPersistence().removeCrmTag(pk, crmTagPK);
	}

	/**
	* Removes the association between the CRM Contact and the CRM Tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTag the CRM Tag
	*/
	public static void removeCrmTag(long pk, contact.manager.model.CrmTag crmTag) {
		getPersistence().removeCrmTag(pk, crmTag);
	}

	/**
	* Removes the association between the CRM Contact and the CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTagPKs the primary keys of the CRM Tags
	*/
	public static void removeCrmTags(long pk, long[] crmTagPKs) {
		getPersistence().removeCrmTags(pk, crmTagPKs);
	}

	/**
	* Removes the association between the CRM Contact and the CRM Tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTags the CRM Tags
	*/
	public static void removeCrmTags(long pk,
		List<contact.manager.model.CrmTag> crmTags) {
		getPersistence().removeCrmTags(pk, crmTags);
	}

	/**
	* Sets the CRM Tags associated with the CRM Contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTagPKs the primary keys of the CRM Tags to be associated with the CRM Contact
	*/
	public static void setCrmTags(long pk, long[] crmTagPKs) {
		getPersistence().setCrmTags(pk, crmTagPKs);
	}

	/**
	* Sets the CRM Tags associated with the CRM Contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Contact
	* @param crmTags the CRM Tags to be associated with the CRM Contact
	*/
	public static void setCrmTags(long pk,
		List<contact.manager.model.CrmTag> crmTags) {
		getPersistence().setCrmTags(pk, crmTags);
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmContactPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmContactPersistence, CrmContactPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CrmContactPersistence.class);
}