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

import contact.manager.model.CrmNote;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM Note service. This utility wraps {@link contact.manager.service.persistence.impl.CrmNotePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmNotePersistence
 * @see contact.manager.service.persistence.impl.CrmNotePersistenceImpl
 * @generated
 */
@ProviderType
public class CrmNoteUtil {
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
	public static void clearCache(CrmNote crmNote) {
		getPersistence().clearCache(crmNote);
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
	public static List<CrmNote> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmNote> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmNote> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CrmNote> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmNote update(CrmNote crmNote) {
		return getPersistence().update(crmNote);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmNote update(CrmNote crmNote, ServiceContext serviceContext) {
		return getPersistence().update(crmNote, serviceContext);
	}

	/**
	* Returns all the CRM Notes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Notes
	*/
	public static List<CrmNote> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the CRM Notes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @return the range of matching CRM Notes
	*/
	public static List<CrmNote> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Notes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Notes
	*/
	public static List<CrmNote> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<CrmNote> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Notes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Notes
	*/
	public static List<CrmNote> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<CrmNote> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM Note in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Note
	* @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	*/
	public static CrmNote findByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmNote> orderByComparator)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first CRM Note in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	*/
	public static CrmNote fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmNote> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Note in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Note
	* @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	*/
	public static CrmNote findByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmNote> orderByComparator)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Note in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	*/
	public static CrmNote fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmNote> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the CRM Notes before and after the current CRM Note in the ordered set where uuid = &#63;.
	*
	* @param crmNoteId the primary key of the current CRM Note
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Note
	* @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	*/
	public static CrmNote[] findByUuid_PrevAndNext(long crmNoteId,
		java.lang.String uuid, OrderByComparator<CrmNote> orderByComparator)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence()
				   .findByUuid_PrevAndNext(crmNoteId, uuid, orderByComparator);
	}

	/**
	* Removes all the CRM Notes where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of CRM Notes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Notes
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the CRM Note where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmNoteException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Note
	* @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	*/
	public static CrmNote findByUUID_G(java.lang.String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Note where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	*/
	public static CrmNote fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Note where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	*/
	public static CrmNote fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the CRM Note where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Note that was removed
	*/
	public static CrmNote removeByUUID_G(java.lang.String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of CRM Notes where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Notes
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the CRM Notes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Notes
	*/
	public static List<CrmNote> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the CRM Notes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @return the range of matching CRM Notes
	*/
	public static List<CrmNote> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Notes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Notes
	*/
	public static List<CrmNote> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmNote> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Notes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Notes
	*/
	public static List<CrmNote> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmNote> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Note
	* @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	*/
	public static CrmNote findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmNote> orderByComparator)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	*/
	public static CrmNote fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmNote> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Note
	* @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	*/
	public static CrmNote findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmNote> orderByComparator)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	*/
	public static CrmNote fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmNote> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the CRM Notes before and after the current CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmNoteId the primary key of the current CRM Note
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Note
	* @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	*/
	public static CrmNote[] findByUuid_C_PrevAndNext(long crmNoteId,
		java.lang.String uuid, long companyId,
		OrderByComparator<CrmNote> orderByComparator)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(crmNoteId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the CRM Notes where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of CRM Notes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Notes
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the CRM Notes where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @return the matching CRM Notes
	*/
	public static List<CrmNote> findByCrmContactId(long crmContactId) {
		return getPersistence().findByCrmContactId(crmContactId);
	}

	/**
	* Returns a range of all the CRM Notes where crmContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param crmContactId the crm contact ID
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @return the range of matching CRM Notes
	*/
	public static List<CrmNote> findByCrmContactId(long crmContactId,
		int start, int end) {
		return getPersistence().findByCrmContactId(crmContactId, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Notes where crmContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param crmContactId the crm contact ID
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Notes
	*/
	public static List<CrmNote> findByCrmContactId(long crmContactId,
		int start, int end, OrderByComparator<CrmNote> orderByComparator) {
		return getPersistence()
				   .findByCrmContactId(crmContactId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Notes where crmContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param crmContactId the crm contact ID
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Notes
	*/
	public static List<CrmNote> findByCrmContactId(long crmContactId,
		int start, int end, OrderByComparator<CrmNote> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCrmContactId(crmContactId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Note in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Note
	* @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	*/
	public static CrmNote findByCrmContactId_First(long crmContactId,
		OrderByComparator<CrmNote> orderByComparator)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence()
				   .findByCrmContactId_First(crmContactId, orderByComparator);
	}

	/**
	* Returns the first CRM Note in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	*/
	public static CrmNote fetchByCrmContactId_First(long crmContactId,
		OrderByComparator<CrmNote> orderByComparator) {
		return getPersistence()
				   .fetchByCrmContactId_First(crmContactId, orderByComparator);
	}

	/**
	* Returns the last CRM Note in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Note
	* @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	*/
	public static CrmNote findByCrmContactId_Last(long crmContactId,
		OrderByComparator<CrmNote> orderByComparator)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence()
				   .findByCrmContactId_Last(crmContactId, orderByComparator);
	}

	/**
	* Returns the last CRM Note in the ordered set where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	*/
	public static CrmNote fetchByCrmContactId_Last(long crmContactId,
		OrderByComparator<CrmNote> orderByComparator) {
		return getPersistence()
				   .fetchByCrmContactId_Last(crmContactId, orderByComparator);
	}

	/**
	* Returns the CRM Notes before and after the current CRM Note in the ordered set where crmContactId = &#63;.
	*
	* @param crmNoteId the primary key of the current CRM Note
	* @param crmContactId the crm contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Note
	* @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	*/
	public static CrmNote[] findByCrmContactId_PrevAndNext(long crmNoteId,
		long crmContactId, OrderByComparator<CrmNote> orderByComparator)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence()
				   .findByCrmContactId_PrevAndNext(crmNoteId, crmContactId,
			orderByComparator);
	}

	/**
	* Removes all the CRM Notes where crmContactId = &#63; from the database.
	*
	* @param crmContactId the crm contact ID
	*/
	public static void removeByCrmContactId(long crmContactId) {
		getPersistence().removeByCrmContactId(crmContactId);
	}

	/**
	* Returns the number of CRM Notes where crmContactId = &#63;.
	*
	* @param crmContactId the crm contact ID
	* @return the number of matching CRM Notes
	*/
	public static int countByCrmContactId(long crmContactId) {
		return getPersistence().countByCrmContactId(crmContactId);
	}

	/**
	* Caches the CRM Note in the entity cache if it is enabled.
	*
	* @param crmNote the CRM Note
	*/
	public static void cacheResult(CrmNote crmNote) {
		getPersistence().cacheResult(crmNote);
	}

	/**
	* Caches the CRM Notes in the entity cache if it is enabled.
	*
	* @param crmNotes the CRM Notes
	*/
	public static void cacheResult(List<CrmNote> crmNotes) {
		getPersistence().cacheResult(crmNotes);
	}

	/**
	* Creates a new CRM Note with the primary key. Does not add the CRM Note to the database.
	*
	* @param crmNoteId the primary key for the new CRM Note
	* @return the new CRM Note
	*/
	public static CrmNote create(long crmNoteId) {
		return getPersistence().create(crmNoteId);
	}

	/**
	* Removes the CRM Note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmNoteId the primary key of the CRM Note
	* @return the CRM Note that was removed
	* @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	*/
	public static CrmNote remove(long crmNoteId)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence().remove(crmNoteId);
	}

	public static CrmNote updateImpl(CrmNote crmNote) {
		return getPersistence().updateImpl(crmNote);
	}

	/**
	* Returns the CRM Note with the primary key or throws a {@link NoSuchCrmNoteException} if it could not be found.
	*
	* @param crmNoteId the primary key of the CRM Note
	* @return the CRM Note
	* @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	*/
	public static CrmNote findByPrimaryKey(long crmNoteId)
		throws contact.manager.exception.NoSuchCrmNoteException {
		return getPersistence().findByPrimaryKey(crmNoteId);
	}

	/**
	* Returns the CRM Note with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmNoteId the primary key of the CRM Note
	* @return the CRM Note, or <code>null</code> if a CRM Note with the primary key could not be found
	*/
	public static CrmNote fetchByPrimaryKey(long crmNoteId) {
		return getPersistence().fetchByPrimaryKey(crmNoteId);
	}

	public static java.util.Map<java.io.Serializable, CrmNote> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM Notes.
	*
	* @return the CRM Notes
	*/
	public static List<CrmNote> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the CRM Notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @return the range of CRM Notes
	*/
	public static List<CrmNote> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the CRM Notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Notes
	*/
	public static List<CrmNote> findAll(int start, int end,
		OrderByComparator<CrmNote> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Notes
	*/
	public static List<CrmNote> findAll(int start, int end,
		OrderByComparator<CrmNote> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM Notes from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM Notes.
	*
	* @return the number of CRM Notes
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmNotePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmNotePersistence, CrmNotePersistence> _serviceTracker =
		ServiceTrackerFactory.open(CrmNotePersistence.class);
}