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

import contact.manager.exception.NoSuchCrmCountyCommissionerException;

import contact.manager.model.CrmCountyCommissioner;

/**
 * The persistence interface for the CRM County Commissioner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmCountyCommissionerPersistenceImpl
 * @see CrmCountyCommissionerUtil
 * @generated
 */
@ProviderType
public interface CrmCountyCommissionerPersistence extends BasePersistence<CrmCountyCommissioner> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmCountyCommissionerUtil} to access the CRM County Commissioner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM County Commissioners where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM County Commissioners
	*/
	public java.util.List<CrmCountyCommissioner> findByUuid(
		java.lang.String uuid);

	/**
	* Returns a range of all the CRM County Commissioners where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @return the range of matching CRM County Commissioners
	*/
	public java.util.List<CrmCountyCommissioner> findByUuid(
		java.lang.String uuid, int start, int end);

	/**
	* Returns an ordered range of all the CRM County Commissioners where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM County Commissioners
	*/
	public java.util.List<CrmCountyCommissioner> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator);

	/**
	* Returns an ordered range of all the CRM County Commissioners where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM County Commissioners
	*/
	public java.util.List<CrmCountyCommissioner> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM County Commissioner in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	*/
	public CrmCountyCommissioner findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException;

	/**
	* Returns the first CRM County Commissioner in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public CrmCountyCommissioner fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator);

	/**
	* Returns the last CRM County Commissioner in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	*/
	public CrmCountyCommissioner findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException;

	/**
	* Returns the last CRM County Commissioner in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public CrmCountyCommissioner fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator);

	/**
	* Returns the CRM County Commissioners before and after the current CRM County Commissioner in the ordered set where uuid = &#63;.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the current CRM County Commissioner
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	*/
	public CrmCountyCommissioner[] findByUuid_PrevAndNext(
		long crmCountyCommissionerOrBoardDistId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException;

	/**
	* Removes all the CRM County Commissioners where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM County Commissioners where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM County Commissioners
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM County Commissioner where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmCountyCommissionerException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	*/
	public CrmCountyCommissioner findByUUID_G(java.lang.String uuid,
		long groupId) throws NoSuchCrmCountyCommissionerException;

	/**
	* Returns the CRM County Commissioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public CrmCountyCommissioner fetchByUUID_G(java.lang.String uuid,
		long groupId);

	/**
	* Returns the CRM County Commissioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public CrmCountyCommissioner fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache);

	/**
	* Removes the CRM County Commissioner where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM County Commissioner that was removed
	*/
	public CrmCountyCommissioner removeByUUID_G(java.lang.String uuid,
		long groupId) throws NoSuchCrmCountyCommissionerException;

	/**
	* Returns the number of CRM County Commissioners where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM County Commissioners
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM County Commissioners
	*/
	public java.util.List<CrmCountyCommissioner> findByUuid_C(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of all the CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @return the range of matching CRM County Commissioners
	*/
	public java.util.List<CrmCountyCommissioner> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM County Commissioners
	*/
	public java.util.List<CrmCountyCommissioner> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator);

	/**
	* Returns an ordered range of all the CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM County Commissioners
	*/
	public java.util.List<CrmCountyCommissioner> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	*/
	public CrmCountyCommissioner findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException;

	/**
	* Returns the first CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public CrmCountyCommissioner fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator);

	/**
	* Returns the last CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a matching CRM County Commissioner could not be found
	*/
	public CrmCountyCommissioner findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException;

	/**
	* Returns the last CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	public CrmCountyCommissioner fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator);

	/**
	* Returns the CRM County Commissioners before and after the current CRM County Commissioner in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the current CRM County Commissioner
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	*/
	public CrmCountyCommissioner[] findByUuid_C_PrevAndNext(
		long crmCountyCommissionerOrBoardDistId, java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator)
		throws NoSuchCrmCountyCommissionerException;

	/**
	* Removes all the CRM County Commissioners where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM County Commissioners where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM County Commissioners
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the CRM County Commissioner in the entity cache if it is enabled.
	*
	* @param crmCountyCommissioner the CRM County Commissioner
	*/
	public void cacheResult(CrmCountyCommissioner crmCountyCommissioner);

	/**
	* Caches the CRM County Commissioners in the entity cache if it is enabled.
	*
	* @param crmCountyCommissioners the CRM County Commissioners
	*/
	public void cacheResult(
		java.util.List<CrmCountyCommissioner> crmCountyCommissioners);

	/**
	* Creates a new CRM County Commissioner with the primary key. Does not add the CRM County Commissioner to the database.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key for the new CRM County Commissioner
	* @return the new CRM County Commissioner
	*/
	public CrmCountyCommissioner create(long crmCountyCommissionerOrBoardDistId);

	/**
	* Removes the CRM County Commissioner with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the CRM County Commissioner
	* @return the CRM County Commissioner that was removed
	* @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	*/
	public CrmCountyCommissioner remove(long crmCountyCommissionerOrBoardDistId)
		throws NoSuchCrmCountyCommissionerException;

	public CrmCountyCommissioner updateImpl(
		CrmCountyCommissioner crmCountyCommissioner);

	/**
	* Returns the CRM County Commissioner with the primary key or throws a {@link NoSuchCrmCountyCommissionerException} if it could not be found.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the CRM County Commissioner
	* @return the CRM County Commissioner
	* @throws NoSuchCrmCountyCommissionerException if a CRM County Commissioner with the primary key could not be found
	*/
	public CrmCountyCommissioner findByPrimaryKey(
		long crmCountyCommissionerOrBoardDistId)
		throws NoSuchCrmCountyCommissionerException;

	/**
	* Returns the CRM County Commissioner with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the CRM County Commissioner
	* @return the CRM County Commissioner, or <code>null</code> if a CRM County Commissioner with the primary key could not be found
	*/
	public CrmCountyCommissioner fetchByPrimaryKey(
		long crmCountyCommissionerOrBoardDistId);

	@Override
	public java.util.Map<java.io.Serializable, CrmCountyCommissioner> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM County Commissioners.
	*
	* @return the CRM County Commissioners
	*/
	public java.util.List<CrmCountyCommissioner> findAll();

	/**
	* Returns a range of all the CRM County Commissioners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @return the range of CRM County Commissioners
	*/
	public java.util.List<CrmCountyCommissioner> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM County Commissioners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM County Commissioners
	*/
	public java.util.List<CrmCountyCommissioner> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator);

	/**
	* Returns an ordered range of all the CRM County Commissioners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM County Commissioners
	*/
	public java.util.List<CrmCountyCommissioner> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmCountyCommissioner> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM County Commissioners from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM County Commissioners.
	*
	* @return the number of CRM County Commissioners
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}