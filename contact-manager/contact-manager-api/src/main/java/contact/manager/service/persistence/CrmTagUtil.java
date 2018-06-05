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

import contact.manager.model.CrmTag;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the CRM Tag service. This utility wraps {@link contact.manager.service.persistence.impl.CrmTagPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmTagPersistence
 * @see contact.manager.service.persistence.impl.CrmTagPersistenceImpl
 * @generated
 */
@ProviderType
public class CrmTagUtil {
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
	public static void clearCache(CrmTag crmTag) {
		getPersistence().clearCache(crmTag);
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
	public static List<CrmTag> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CrmTag> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CrmTag> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<CrmTag> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CrmTag update(CrmTag crmTag) {
		return getPersistence().update(crmTag);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CrmTag update(CrmTag crmTag, ServiceContext serviceContext) {
		return getPersistence().update(crmTag, serviceContext);
	}

	/**
	* Returns all the CRM Tags where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Tags
	*/
	public static List<CrmTag> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the CRM Tags where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @return the range of matching CRM Tags
	*/
	public static List<CrmTag> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Tags where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Tags
	*/
	public static List<CrmTag> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<CrmTag> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Tags where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Tags
	*/
	public static List<CrmTag> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<CrmTag> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first CRM Tag in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Tag
	* @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	*/
	public static CrmTag findByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmTag> orderByComparator)
		throws contact.manager.exception.NoSuchCrmTagException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first CRM Tag in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public static CrmTag fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<CrmTag> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Tag in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Tag
	* @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	*/
	public static CrmTag findByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmTag> orderByComparator)
		throws contact.manager.exception.NoSuchCrmTagException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last CRM Tag in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public static CrmTag fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<CrmTag> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the CRM Tags before and after the current CRM Tag in the ordered set where uuid = &#63;.
	*
	* @param crmTagId the primary key of the current CRM Tag
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Tag
	* @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	*/
	public static CrmTag[] findByUuid_PrevAndNext(long crmTagId,
		java.lang.String uuid, OrderByComparator<CrmTag> orderByComparator)
		throws contact.manager.exception.NoSuchCrmTagException {
		return getPersistence()
				   .findByUuid_PrevAndNext(crmTagId, uuid, orderByComparator);
	}

	/**
	* Removes all the CRM Tags where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of CRM Tags where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Tags
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the CRM Tag where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmTagException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Tag
	* @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	*/
	public static CrmTag findByUUID_G(java.lang.String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmTagException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Tag where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public static CrmTag fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the CRM Tag where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public static CrmTag fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the CRM Tag where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Tag that was removed
	*/
	public static CrmTag removeByUUID_G(java.lang.String uuid, long groupId)
		throws contact.manager.exception.NoSuchCrmTagException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of CRM Tags where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Tags
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the CRM Tags where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Tags
	*/
	public static List<CrmTag> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the CRM Tags where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @return the range of matching CRM Tags
	*/
	public static List<CrmTag> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Tags where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Tags
	*/
	public static List<CrmTag> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmTag> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Tags where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Tags
	*/
	public static List<CrmTag> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmTag> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Tag
	* @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	*/
	public static CrmTag findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmTag> orderByComparator)
		throws contact.manager.exception.NoSuchCrmTagException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public static CrmTag fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<CrmTag> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Tag
	* @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	*/
	public static CrmTag findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmTag> orderByComparator)
		throws contact.manager.exception.NoSuchCrmTagException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public static CrmTag fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<CrmTag> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the CRM Tags before and after the current CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmTagId the primary key of the current CRM Tag
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Tag
	* @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	*/
	public static CrmTag[] findByUuid_C_PrevAndNext(long crmTagId,
		java.lang.String uuid, long companyId,
		OrderByComparator<CrmTag> orderByComparator)
		throws contact.manager.exception.NoSuchCrmTagException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(crmTagId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the CRM Tags where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of CRM Tags where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Tags
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the CRM Tag in the entity cache if it is enabled.
	*
	* @param crmTag the CRM Tag
	*/
	public static void cacheResult(CrmTag crmTag) {
		getPersistence().cacheResult(crmTag);
	}

	/**
	* Caches the CRM Tags in the entity cache if it is enabled.
	*
	* @param crmTags the CRM Tags
	*/
	public static void cacheResult(List<CrmTag> crmTags) {
		getPersistence().cacheResult(crmTags);
	}

	/**
	* Creates a new CRM Tag with the primary key. Does not add the CRM Tag to the database.
	*
	* @param crmTagId the primary key for the new CRM Tag
	* @return the new CRM Tag
	*/
	public static CrmTag create(long crmTagId) {
		return getPersistence().create(crmTagId);
	}

	/**
	* Removes the CRM Tag with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmTagId the primary key of the CRM Tag
	* @return the CRM Tag that was removed
	* @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	*/
	public static CrmTag remove(long crmTagId)
		throws contact.manager.exception.NoSuchCrmTagException {
		return getPersistence().remove(crmTagId);
	}

	public static CrmTag updateImpl(CrmTag crmTag) {
		return getPersistence().updateImpl(crmTag);
	}

	/**
	* Returns the CRM Tag with the primary key or throws a {@link NoSuchCrmTagException} if it could not be found.
	*
	* @param crmTagId the primary key of the CRM Tag
	* @return the CRM Tag
	* @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	*/
	public static CrmTag findByPrimaryKey(long crmTagId)
		throws contact.manager.exception.NoSuchCrmTagException {
		return getPersistence().findByPrimaryKey(crmTagId);
	}

	/**
	* Returns the CRM Tag with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmTagId the primary key of the CRM Tag
	* @return the CRM Tag, or <code>null</code> if a CRM Tag with the primary key could not be found
	*/
	public static CrmTag fetchByPrimaryKey(long crmTagId) {
		return getPersistence().fetchByPrimaryKey(crmTagId);
	}

	public static java.util.Map<java.io.Serializable, CrmTag> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the CRM Tags.
	*
	* @return the CRM Tags
	*/
	public static List<CrmTag> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the CRM Tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @return the range of CRM Tags
	*/
	public static List<CrmTag> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the CRM Tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Tags
	*/
	public static List<CrmTag> findAll(int start, int end,
		OrderByComparator<CrmTag> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the CRM Tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Tags
	*/
	public static List<CrmTag> findAll(int start, int end,
		OrderByComparator<CrmTag> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the CRM Tags from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of CRM Tags.
	*
	* @return the number of CRM Tags
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	/**
	* Returns the primaryKeys of CRM Contacts associated with the CRM Tag.
	*
	* @param pk the primary key of the CRM Tag
	* @return long[] of the primaryKeys of CRM Contacts associated with the CRM Tag
	*/
	public static long[] getCrmContactPrimaryKeys(long pk) {
		return getPersistence().getCrmContactPrimaryKeys(pk);
	}

	/**
	* Returns all the CRM Contacts associated with the CRM Tag.
	*
	* @param pk the primary key of the CRM Tag
	* @return the CRM Contacts associated with the CRM Tag
	*/
	public static List<contact.manager.model.CrmContact> getCrmContacts(long pk) {
		return getPersistence().getCrmContacts(pk);
	}

	/**
	* Returns a range of all the CRM Contacts associated with the CRM Tag.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the CRM Tag
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @return the range of CRM Contacts associated with the CRM Tag
	*/
	public static List<contact.manager.model.CrmContact> getCrmContacts(
		long pk, int start, int end) {
		return getPersistence().getCrmContacts(pk, start, end);
	}

	/**
	* Returns an ordered range of all the CRM Contacts associated with the CRM Tag.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the CRM Tag
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Contacts associated with the CRM Tag
	*/
	public static List<contact.manager.model.CrmContact> getCrmContacts(
		long pk, int start, int end,
		OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		return getPersistence().getCrmContacts(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of CRM Contacts associated with the CRM Tag.
	*
	* @param pk the primary key of the CRM Tag
	* @return the number of CRM Contacts associated with the CRM Tag
	*/
	public static int getCrmContactsSize(long pk) {
		return getPersistence().getCrmContactsSize(pk);
	}

	/**
	* Returns <code>true</code> if the CRM Contact is associated with the CRM Tag.
	*
	* @param pk the primary key of the CRM Tag
	* @param crmContactPK the primary key of the CRM Contact
	* @return <code>true</code> if the CRM Contact is associated with the CRM Tag; <code>false</code> otherwise
	*/
	public static boolean containsCrmContact(long pk, long crmContactPK) {
		return getPersistence().containsCrmContact(pk, crmContactPK);
	}

	/**
	* Returns <code>true</code> if the CRM Tag has any CRM Contacts associated with it.
	*
	* @param pk the primary key of the CRM Tag to check for associations with CRM Contacts
	* @return <code>true</code> if the CRM Tag has any CRM Contacts associated with it; <code>false</code> otherwise
	*/
	public static boolean containsCrmContacts(long pk) {
		return getPersistence().containsCrmContacts(pk);
	}

	/**
	* Adds an association between the CRM Tag and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Tag
	* @param crmContactPK the primary key of the CRM Contact
	*/
	public static void addCrmContact(long pk, long crmContactPK) {
		getPersistence().addCrmContact(pk, crmContactPK);
	}

	/**
	* Adds an association between the CRM Tag and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Tag
	* @param crmContact the CRM Contact
	*/
	public static void addCrmContact(long pk,
		contact.manager.model.CrmContact crmContact) {
		getPersistence().addCrmContact(pk, crmContact);
	}

	/**
	* Adds an association between the CRM Tag and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Tag
	* @param crmContactPKs the primary keys of the CRM Contacts
	*/
	public static void addCrmContacts(long pk, long[] crmContactPKs) {
		getPersistence().addCrmContacts(pk, crmContactPKs);
	}

	/**
	* Adds an association between the CRM Tag and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Tag
	* @param crmContacts the CRM Contacts
	*/
	public static void addCrmContacts(long pk,
		List<contact.manager.model.CrmContact> crmContacts) {
		getPersistence().addCrmContacts(pk, crmContacts);
	}

	/**
	* Clears all associations between the CRM Tag and its CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Tag to clear the associated CRM Contacts from
	*/
	public static void clearCrmContacts(long pk) {
		getPersistence().clearCrmContacts(pk);
	}

	/**
	* Removes the association between the CRM Tag and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Tag
	* @param crmContactPK the primary key of the CRM Contact
	*/
	public static void removeCrmContact(long pk, long crmContactPK) {
		getPersistence().removeCrmContact(pk, crmContactPK);
	}

	/**
	* Removes the association between the CRM Tag and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Tag
	* @param crmContact the CRM Contact
	*/
	public static void removeCrmContact(long pk,
		contact.manager.model.CrmContact crmContact) {
		getPersistence().removeCrmContact(pk, crmContact);
	}

	/**
	* Removes the association between the CRM Tag and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Tag
	* @param crmContactPKs the primary keys of the CRM Contacts
	*/
	public static void removeCrmContacts(long pk, long[] crmContactPKs) {
		getPersistence().removeCrmContacts(pk, crmContactPKs);
	}

	/**
	* Removes the association between the CRM Tag and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Tag
	* @param crmContacts the CRM Contacts
	*/
	public static void removeCrmContacts(long pk,
		List<contact.manager.model.CrmContact> crmContacts) {
		getPersistence().removeCrmContacts(pk, crmContacts);
	}

	/**
	* Sets the CRM Contacts associated with the CRM Tag, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Tag
	* @param crmContactPKs the primary keys of the CRM Contacts to be associated with the CRM Tag
	*/
	public static void setCrmContacts(long pk, long[] crmContactPKs) {
		getPersistence().setCrmContacts(pk, crmContactPKs);
	}

	/**
	* Sets the CRM Contacts associated with the CRM Tag, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Tag
	* @param crmContacts the CRM Contacts to be associated with the CRM Tag
	*/
	public static void setCrmContacts(long pk,
		List<contact.manager.model.CrmContact> crmContacts) {
		getPersistence().setCrmContacts(pk, crmContacts);
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CrmTagPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmTagPersistence, CrmTagPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CrmTagPersistence.class);
}