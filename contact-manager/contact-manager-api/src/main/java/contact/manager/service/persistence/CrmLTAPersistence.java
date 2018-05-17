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

import contact.manager.exception.NoSuchCrmLTAException;

import contact.manager.model.CrmLTA;

/**
 * The persistence interface for the CRM LTA service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmLTAPersistenceImpl
 * @see CrmLTAUtil
 * @generated
 */
@ProviderType
public interface CrmLTAPersistence extends BasePersistence<CrmLTA> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmLTAUtil} to access the CRM LTA persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM LTAs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM LTAs
	*/
	public java.util.List<CrmLTA> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the CRM LTAs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @return the range of matching CRM LTAs
	*/
	public java.util.List<CrmLTA> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the CRM LTAs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM LTAs
	*/
	public java.util.List<CrmLTA> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator);

	/**
	* Returns an ordered range of all the CRM LTAs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM LTAs
	*/
	public java.util.List<CrmLTA> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM LTA in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM LTA
	* @throws NoSuchCrmLTAException if a matching CRM LTA could not be found
	*/
	public CrmLTA findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	* Returns the first CRM LTA in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	*/
	public CrmLTA fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator);

	/**
	* Returns the last CRM LTA in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM LTA
	* @throws NoSuchCrmLTAException if a matching CRM LTA could not be found
	*/
	public CrmLTA findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	* Returns the last CRM LTA in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	*/
	public CrmLTA fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator);

	/**
	* Returns the CRM LTAs before and after the current CRM LTA in the ordered set where uuid = &#63;.
	*
	* @param crmLTAId the primary key of the current CRM LTA
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM LTA
	* @throws NoSuchCrmLTAException if a CRM LTA with the primary key could not be found
	*/
	public CrmLTA[] findByUuid_PrevAndNext(long crmLTAId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	* Removes all the CRM LTAs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM LTAs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM LTAs
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM LTA where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmLTAException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM LTA
	* @throws NoSuchCrmLTAException if a matching CRM LTA could not be found
	*/
	public CrmLTA findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmLTAException;

	/**
	* Returns the CRM LTA where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	*/
	public CrmLTA fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the CRM LTA where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	*/
	public CrmLTA fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM LTA where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM LTA that was removed
	*/
	public CrmLTA removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmLTAException;

	/**
	* Returns the number of CRM LTAs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM LTAs
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM LTAs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM LTAs
	*/
	public java.util.List<CrmLTA> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the CRM LTAs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @return the range of matching CRM LTAs
	*/
	public java.util.List<CrmLTA> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM LTAs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM LTAs
	*/
	public java.util.List<CrmLTA> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator);

	/**
	* Returns an ordered range of all the CRM LTAs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM LTAs
	*/
	public java.util.List<CrmLTA> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM LTA in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM LTA
	* @throws NoSuchCrmLTAException if a matching CRM LTA could not be found
	*/
	public CrmLTA findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	* Returns the first CRM LTA in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	*/
	public CrmLTA fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator);

	/**
	* Returns the last CRM LTA in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM LTA
	* @throws NoSuchCrmLTAException if a matching CRM LTA could not be found
	*/
	public CrmLTA findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	* Returns the last CRM LTA in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	*/
	public CrmLTA fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator);

	/**
	* Returns the CRM LTAs before and after the current CRM LTA in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmLTAId the primary key of the current CRM LTA
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM LTA
	* @throws NoSuchCrmLTAException if a CRM LTA with the primary key could not be found
	*/
	public CrmLTA[] findByUuid_C_PrevAndNext(long crmLTAId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator)
		throws NoSuchCrmLTAException;

	/**
	* Removes all the CRM LTAs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM LTAs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM LTAs
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the CRM LTA in the entity cache if it is enabled.
	*
	* @param crmLTA the CRM LTA
	*/
	public void cacheResult(CrmLTA crmLTA);

	/**
	* Caches the CRM LTAs in the entity cache if it is enabled.
	*
	* @param crmLTAs the CRM LTAs
	*/
	public void cacheResult(java.util.List<CrmLTA> crmLTAs);

	/**
	* Creates a new CRM LTA with the primary key. Does not add the CRM LTA to the database.
	*
	* @param crmLTAId the primary key for the new CRM LTA
	* @return the new CRM LTA
	*/
	public CrmLTA create(long crmLTAId);

	/**
	* Removes the CRM LTA with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmLTAId the primary key of the CRM LTA
	* @return the CRM LTA that was removed
	* @throws NoSuchCrmLTAException if a CRM LTA with the primary key could not be found
	*/
	public CrmLTA remove(long crmLTAId) throws NoSuchCrmLTAException;

	public CrmLTA updateImpl(CrmLTA crmLTA);

	/**
	* Returns the CRM LTA with the primary key or throws a {@link NoSuchCrmLTAException} if it could not be found.
	*
	* @param crmLTAId the primary key of the CRM LTA
	* @return the CRM LTA
	* @throws NoSuchCrmLTAException if a CRM LTA with the primary key could not be found
	*/
	public CrmLTA findByPrimaryKey(long crmLTAId) throws NoSuchCrmLTAException;

	/**
	* Returns the CRM LTA with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmLTAId the primary key of the CRM LTA
	* @return the CRM LTA, or <code>null</code> if a CRM LTA with the primary key could not be found
	*/
	public CrmLTA fetchByPrimaryKey(long crmLTAId);

	@Override
	public java.util.Map<java.io.Serializable, CrmLTA> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM LTAs.
	*
	* @return the CRM LTAs
	*/
	public java.util.List<CrmLTA> findAll();

	/**
	* Returns a range of all the CRM LTAs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @return the range of CRM LTAs
	*/
	public java.util.List<CrmLTA> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM LTAs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM LTAs
	*/
	public java.util.List<CrmLTA> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator);

	/**
	* Returns an ordered range of all the CRM LTAs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM LTAs
	*/
	public java.util.List<CrmLTA> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmLTA> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM LTAs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM LTAs.
	*
	* @return the number of CRM LTAs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}