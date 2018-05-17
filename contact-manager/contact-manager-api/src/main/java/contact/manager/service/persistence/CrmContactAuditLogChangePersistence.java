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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import contact.manager.exception.NoSuchCrmContactAuditLogChangeException;

import contact.manager.model.CrmContactAuditLogChange;

/**
 * The persistence interface for the CRM Contact Audit Log Change service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmContactAuditLogChangePersistenceImpl
 * @see CrmContactAuditLogChangeUtil
 * @generated
 */
@ProviderType
public interface CrmContactAuditLogChangePersistence extends BasePersistence<CrmContactAuditLogChange> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmContactAuditLogChangeUtil} to access the CRM Contact Audit Log Change persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM Contact Audit Log Changes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Contact Audit Log Changes
	*/
	public java.util.List<CrmContactAuditLogChange> findByUuid(
		java.lang.String uuid);

	/**
	* Returns a range of all the CRM Contact Audit Log Changes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contact Audit Log Changes
	* @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	* @return the range of matching CRM Contact Audit Log Changes
	*/
	public java.util.List<CrmContactAuditLogChange> findByUuid(
		java.lang.String uuid, int start, int end);

	/**
	* Returns an ordered range of all the CRM Contact Audit Log Changes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contact Audit Log Changes
	* @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contact Audit Log Changes
	*/
	public java.util.List<CrmContactAuditLogChange> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contact Audit Log Changes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Contact Audit Log Changes
	* @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contact Audit Log Changes
	*/
	public java.util.List<CrmContactAuditLogChange> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log Change
	* @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	*/
	public CrmContactAuditLogChange findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException;

	/**
	* Returns the first CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	*/
	public CrmContactAuditLogChange fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator);

	/**
	* Returns the last CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log Change
	* @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	*/
	public CrmContactAuditLogChange findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException;

	/**
	* Returns the last CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	*/
	public CrmContactAuditLogChange fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator);

	/**
	* Returns the CRM Contact Audit Log Changes before and after the current CRM Contact Audit Log Change in the ordered set where uuid = &#63;.
	*
	* @param crmContactAuditLogChangeId the primary key of the current CRM Contact Audit Log Change
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Contact Audit Log Change
	* @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	*/
	public CrmContactAuditLogChange[] findByUuid_PrevAndNext(
		long crmContactAuditLogChangeId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException;

	/**
	* Removes all the CRM Contact Audit Log Changes where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM Contact Audit Log Changes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Contact Audit Log Changes
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM Contact Audit Log Change where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmContactAuditLogChangeException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Contact Audit Log Change
	* @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	*/
	public CrmContactAuditLogChange findByUUID_G(java.lang.String uuid,
		long groupId) throws NoSuchCrmContactAuditLogChangeException;

	/**
	* Returns the CRM Contact Audit Log Change where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	*/
	public CrmContactAuditLogChange fetchByUUID_G(java.lang.String uuid,
		long groupId);

	/**
	* Returns the CRM Contact Audit Log Change where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	*/
	public CrmContactAuditLogChange fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache);

	/**
	* Removes the CRM Contact Audit Log Change where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Contact Audit Log Change that was removed
	*/
	public CrmContactAuditLogChange removeByUUID_G(java.lang.String uuid,
		long groupId) throws NoSuchCrmContactAuditLogChangeException;

	/**
	* Returns the number of CRM Contact Audit Log Changes where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Contact Audit Log Changes
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Contact Audit Log Changes
	*/
	public java.util.List<CrmContactAuditLogChange> findByUuid_C(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contact Audit Log Changes
	* @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	* @return the range of matching CRM Contact Audit Log Changes
	*/
	public java.util.List<CrmContactAuditLogChange> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contact Audit Log Changes
	* @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Contact Audit Log Changes
	*/
	public java.util.List<CrmContactAuditLogChange> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Contact Audit Log Changes
	* @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Contact Audit Log Changes
	*/
	public java.util.List<CrmContactAuditLogChange> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log Change
	* @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	*/
	public CrmContactAuditLogChange findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException;

	/**
	* Returns the first CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	*/
	public CrmContactAuditLogChange fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator);

	/**
	* Returns the last CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log Change
	* @throws NoSuchCrmContactAuditLogChangeException if a matching CRM Contact Audit Log Change could not be found
	*/
	public CrmContactAuditLogChange findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException;

	/**
	* Returns the last CRM Contact Audit Log Change in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Contact Audit Log Change, or <code>null</code> if a matching CRM Contact Audit Log Change could not be found
	*/
	public CrmContactAuditLogChange fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator);

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
	public CrmContactAuditLogChange[] findByUuid_C_PrevAndNext(
		long crmContactAuditLogChangeId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws NoSuchCrmContactAuditLogChangeException;

	/**
	* Removes all the CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM Contact Audit Log Changes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Contact Audit Log Changes
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the CRM Contact Audit Log Change in the entity cache if it is enabled.
	*
	* @param crmContactAuditLogChange the CRM Contact Audit Log Change
	*/
	public void cacheResult(CrmContactAuditLogChange crmContactAuditLogChange);

	/**
	* Caches the CRM Contact Audit Log Changes in the entity cache if it is enabled.
	*
	* @param crmContactAuditLogChanges the CRM Contact Audit Log Changes
	*/
	public void cacheResult(
		java.util.List<CrmContactAuditLogChange> crmContactAuditLogChanges);

	/**
	* Creates a new CRM Contact Audit Log Change with the primary key. Does not add the CRM Contact Audit Log Change to the database.
	*
	* @param crmContactAuditLogChangeId the primary key for the new CRM Contact Audit Log Change
	* @return the new CRM Contact Audit Log Change
	*/
	public CrmContactAuditLogChange create(long crmContactAuditLogChangeId);

	/**
	* Removes the CRM Contact Audit Log Change with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactAuditLogChangeId the primary key of the CRM Contact Audit Log Change
	* @return the CRM Contact Audit Log Change that was removed
	* @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	*/
	public CrmContactAuditLogChange remove(long crmContactAuditLogChangeId)
		throws NoSuchCrmContactAuditLogChangeException;

	public CrmContactAuditLogChange updateImpl(
		CrmContactAuditLogChange crmContactAuditLogChange);

	/**
	* Returns the CRM Contact Audit Log Change with the primary key or throws a {@link NoSuchCrmContactAuditLogChangeException} if it could not be found.
	*
	* @param crmContactAuditLogChangeId the primary key of the CRM Contact Audit Log Change
	* @return the CRM Contact Audit Log Change
	* @throws NoSuchCrmContactAuditLogChangeException if a CRM Contact Audit Log Change with the primary key could not be found
	*/
	public CrmContactAuditLogChange findByPrimaryKey(
		long crmContactAuditLogChangeId)
		throws NoSuchCrmContactAuditLogChangeException;

	/**
	* Returns the CRM Contact Audit Log Change with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmContactAuditLogChangeId the primary key of the CRM Contact Audit Log Change
	* @return the CRM Contact Audit Log Change, or <code>null</code> if a CRM Contact Audit Log Change with the primary key could not be found
	*/
	public CrmContactAuditLogChange fetchByPrimaryKey(
		long crmContactAuditLogChangeId);

	@Override
	public java.util.Map<java.io.Serializable, CrmContactAuditLogChange> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM Contact Audit Log Changes.
	*
	* @return the CRM Contact Audit Log Changes
	*/
	public java.util.List<CrmContactAuditLogChange> findAll();

	/**
	* Returns a range of all the CRM Contact Audit Log Changes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contact Audit Log Changes
	* @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	* @return the range of CRM Contact Audit Log Changes
	*/
	public java.util.List<CrmContactAuditLogChange> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM Contact Audit Log Changes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contact Audit Log Changes
	* @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Contact Audit Log Changes
	*/
	public java.util.List<CrmContactAuditLogChange> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Contact Audit Log Changes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contact Audit Log Changes
	* @param end the upper bound of the range of CRM Contact Audit Log Changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Contact Audit Log Changes
	*/
	public java.util.List<CrmContactAuditLogChange> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmContactAuditLogChange> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM Contact Audit Log Changes from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM Contact Audit Log Changes.
	*
	* @return the number of CRM Contact Audit Log Changes
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}