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

import contact.manager.exception.NoSuchCrmGroupException;

import contact.manager.model.CrmGroup;

/**
 * The persistence interface for the CRM Group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmGroupPersistenceImpl
 * @see CrmGroupUtil
 * @generated
 */
@ProviderType
public interface CrmGroupPersistence extends BasePersistence<CrmGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmGroupUtil} to access the CRM Group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM Groups where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Groups
	*/
	public java.util.List<CrmGroup> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the CRM Groups where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @return the range of matching CRM Groups
	*/
	public java.util.List<CrmGroup> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM Groups where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Groups
	*/
	public java.util.List<CrmGroup> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Groups where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Groups
	*/
	public java.util.List<CrmGroup> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Group
	* @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	*/
	public CrmGroup findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException;

	/**
	* Returns the first CRM Group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	*/
	public CrmGroup fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator);

	/**
	* Returns the last CRM Group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Group
	* @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	*/
	public CrmGroup findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException;

	/**
	* Returns the last CRM Group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	*/
	public CrmGroup fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator);

	/**
	* Returns the CRM Groups before and after the current CRM Group in the ordered set where uuid = &#63;.
	*
	* @param crmGroupId the primary key of the current CRM Group
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Group
	* @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	*/
	public CrmGroup[] findByUuid_PrevAndNext(long crmGroupId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException;

	/**
	* Removes all the CRM Groups where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM Groups where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Groups
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM Group where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmGroupException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Group
	* @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	*/
	public CrmGroup findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmGroupException;

	/**
	* Returns the CRM Group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	*/
	public CrmGroup fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the CRM Group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	*/
	public CrmGroup fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM Group where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Group that was removed
	*/
	public CrmGroup removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmGroupException;

	/**
	* Returns the number of CRM Groups where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Groups
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM Groups where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Groups
	*/
	public java.util.List<CrmGroup> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the CRM Groups where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @return the range of matching CRM Groups
	*/
	public java.util.List<CrmGroup> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM Groups where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Groups
	*/
	public java.util.List<CrmGroup> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Groups where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Groups
	*/
	public java.util.List<CrmGroup> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Group
	* @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	*/
	public CrmGroup findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException;

	/**
	* Returns the first CRM Group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	*/
	public CrmGroup fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator);

	/**
	* Returns the last CRM Group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Group
	* @throws NoSuchCrmGroupException if a matching CRM Group could not be found
	*/
	public CrmGroup findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException;

	/**
	* Returns the last CRM Group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	*/
	public CrmGroup fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator);

	/**
	* Returns the CRM Groups before and after the current CRM Group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmGroupId the primary key of the current CRM Group
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Group
	* @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	*/
	public CrmGroup[] findByUuid_C_PrevAndNext(long crmGroupId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator)
		throws NoSuchCrmGroupException;

	/**
	* Removes all the CRM Groups where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM Groups where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Groups
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the CRM Group in the entity cache if it is enabled.
	*
	* @param crmGroup the CRM Group
	*/
	public void cacheResult(CrmGroup crmGroup);

	/**
	* Caches the CRM Groups in the entity cache if it is enabled.
	*
	* @param crmGroups the CRM Groups
	*/
	public void cacheResult(java.util.List<CrmGroup> crmGroups);

	/**
	* Creates a new CRM Group with the primary key. Does not add the CRM Group to the database.
	*
	* @param crmGroupId the primary key for the new CRM Group
	* @return the new CRM Group
	*/
	public CrmGroup create(long crmGroupId);

	/**
	* Removes the CRM Group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmGroupId the primary key of the CRM Group
	* @return the CRM Group that was removed
	* @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	*/
	public CrmGroup remove(long crmGroupId) throws NoSuchCrmGroupException;

	public CrmGroup updateImpl(CrmGroup crmGroup);

	/**
	* Returns the CRM Group with the primary key or throws a {@link NoSuchCrmGroupException} if it could not be found.
	*
	* @param crmGroupId the primary key of the CRM Group
	* @return the CRM Group
	* @throws NoSuchCrmGroupException if a CRM Group with the primary key could not be found
	*/
	public CrmGroup findByPrimaryKey(long crmGroupId)
		throws NoSuchCrmGroupException;

	/**
	* Returns the CRM Group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmGroupId the primary key of the CRM Group
	* @return the CRM Group, or <code>null</code> if a CRM Group with the primary key could not be found
	*/
	public CrmGroup fetchByPrimaryKey(long crmGroupId);

	@Override
	public java.util.Map<java.io.Serializable, CrmGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM Groups.
	*
	* @return the CRM Groups
	*/
	public java.util.List<CrmGroup> findAll();

	/**
	* Returns a range of all the CRM Groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @return the range of CRM Groups
	*/
	public java.util.List<CrmGroup> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM Groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Groups
	*/
	public java.util.List<CrmGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Groups
	*/
	public java.util.List<CrmGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM Groups from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM Groups.
	*
	* @return the number of CRM Groups
	*/
	public int countAll();

	/**
	* Returns the primaryKeys of CRM Contacts associated with the CRM Group.
	*
	* @param pk the primary key of the CRM Group
	* @return long[] of the primaryKeys of CRM Contacts associated with the CRM Group
	*/
	public long[] getCrmContactPrimaryKeys(long pk);

	/**
	* Returns all the CRM Contacts associated with the CRM Group.
	*
	* @param pk the primary key of the CRM Group
	* @return the CRM Contacts associated with the CRM Group
	*/
	public java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long pk);

	/**
	* Returns a range of all the CRM Contacts associated with the CRM Group.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the CRM Group
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @return the range of CRM Contacts associated with the CRM Group
	*/
	public java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long pk, int start, int end);

	/**
	* Returns an ordered range of all the CRM Contacts associated with the CRM Group.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the CRM Group
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Contacts associated with the CRM Group
	*/
	public java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator);

	/**
	* Returns the number of CRM Contacts associated with the CRM Group.
	*
	* @param pk the primary key of the CRM Group
	* @return the number of CRM Contacts associated with the CRM Group
	*/
	public int getCrmContactsSize(long pk);

	/**
	* Returns <code>true</code> if the CRM Contact is associated with the CRM Group.
	*
	* @param pk the primary key of the CRM Group
	* @param crmContactPK the primary key of the CRM Contact
	* @return <code>true</code> if the CRM Contact is associated with the CRM Group; <code>false</code> otherwise
	*/
	public boolean containsCrmContact(long pk, long crmContactPK);

	/**
	* Returns <code>true</code> if the CRM Group has any CRM Contacts associated with it.
	*
	* @param pk the primary key of the CRM Group to check for associations with CRM Contacts
	* @return <code>true</code> if the CRM Group has any CRM Contacts associated with it; <code>false</code> otherwise
	*/
	public boolean containsCrmContacts(long pk);

	/**
	* Adds an association between the CRM Group and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Group
	* @param crmContactPK the primary key of the CRM Contact
	*/
	public void addCrmContact(long pk, long crmContactPK);

	/**
	* Adds an association between the CRM Group and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Group
	* @param crmContact the CRM Contact
	*/
	public void addCrmContact(long pk,
		contact.manager.model.CrmContact crmContact);

	/**
	* Adds an association between the CRM Group and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Group
	* @param crmContactPKs the primary keys of the CRM Contacts
	*/
	public void addCrmContacts(long pk, long[] crmContactPKs);

	/**
	* Adds an association between the CRM Group and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Group
	* @param crmContacts the CRM Contacts
	*/
	public void addCrmContacts(long pk,
		java.util.List<contact.manager.model.CrmContact> crmContacts);

	/**
	* Clears all associations between the CRM Group and its CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Group to clear the associated CRM Contacts from
	*/
	public void clearCrmContacts(long pk);

	/**
	* Removes the association between the CRM Group and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Group
	* @param crmContactPK the primary key of the CRM Contact
	*/
	public void removeCrmContact(long pk, long crmContactPK);

	/**
	* Removes the association between the CRM Group and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Group
	* @param crmContact the CRM Contact
	*/
	public void removeCrmContact(long pk,
		contact.manager.model.CrmContact crmContact);

	/**
	* Removes the association between the CRM Group and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Group
	* @param crmContactPKs the primary keys of the CRM Contacts
	*/
	public void removeCrmContacts(long pk, long[] crmContactPKs);

	/**
	* Removes the association between the CRM Group and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Group
	* @param crmContacts the CRM Contacts
	*/
	public void removeCrmContacts(long pk,
		java.util.List<contact.manager.model.CrmContact> crmContacts);

	/**
	* Sets the CRM Contacts associated with the CRM Group, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Group
	* @param crmContactPKs the primary keys of the CRM Contacts to be associated with the CRM Group
	*/
	public void setCrmContacts(long pk, long[] crmContactPKs);

	/**
	* Sets the CRM Contacts associated with the CRM Group, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the CRM Group
	* @param crmContacts the CRM Contacts to be associated with the CRM Group
	*/
	public void setCrmContacts(long pk,
		java.util.List<contact.manager.model.CrmContact> crmContacts);

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}