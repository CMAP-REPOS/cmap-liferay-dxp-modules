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

package ucc.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import ucc.portal.exception.NoSuchCExtStaffingChurchException;

import ucc.portal.model.CExtStaffingChurch;

/**
 * The persistence interface for the c ext staffing church service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.CExtStaffingChurchPersistenceImpl
 * @see CExtStaffingChurchUtil
 * @generated
 */
@ProviderType
public interface CExtStaffingChurchPersistence extends BasePersistence<CExtStaffingChurch> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CExtStaffingChurchUtil} to access the c ext staffing church persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the c ext staffing churchs where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching c ext staffing churchs
	*/
	public java.util.List<CExtStaffingChurch> findByOrganizationId(
		long organizationId);

	/**
	* Returns a range of all the c ext staffing churchs where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext staffing churchs
	* @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	* @return the range of matching c ext staffing churchs
	*/
	public java.util.List<CExtStaffingChurch> findByOrganizationId(
		long organizationId, int start, int end);

	/**
	* Returns an ordered range of all the c ext staffing churchs where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext staffing churchs
	* @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching c ext staffing churchs
	*/
	public java.util.List<CExtStaffingChurch> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingChurch> orderByComparator);

	/**
	* Returns an ordered range of all the c ext staffing churchs where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext staffing churchs
	* @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching c ext staffing churchs
	*/
	public java.util.List<CExtStaffingChurch> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingChurch> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first c ext staffing church in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext staffing church
	* @throws NoSuchCExtStaffingChurchException if a matching c ext staffing church could not be found
	*/
	public CExtStaffingChurch findByOrganizationId_First(long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingChurch> orderByComparator)
		throws NoSuchCExtStaffingChurchException;

	/**
	* Returns the first c ext staffing church in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext staffing church, or <code>null</code> if a matching c ext staffing church could not be found
	*/
	public CExtStaffingChurch fetchByOrganizationId_First(long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingChurch> orderByComparator);

	/**
	* Returns the last c ext staffing church in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext staffing church
	* @throws NoSuchCExtStaffingChurchException if a matching c ext staffing church could not be found
	*/
	public CExtStaffingChurch findByOrganizationId_Last(long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingChurch> orderByComparator)
		throws NoSuchCExtStaffingChurchException;

	/**
	* Returns the last c ext staffing church in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext staffing church, or <code>null</code> if a matching c ext staffing church could not be found
	*/
	public CExtStaffingChurch fetchByOrganizationId_Last(long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingChurch> orderByComparator);

	/**
	* Returns the c ext staffing churchs before and after the current c ext staffing church in the ordered set where organizationId = &#63;.
	*
	* @param cExtStaffingChurchPK the primary key of the current c ext staffing church
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next c ext staffing church
	* @throws NoSuchCExtStaffingChurchException if a c ext staffing church with the primary key could not be found
	*/
	public CExtStaffingChurch[] findByOrganizationId_PrevAndNext(
		ucc.portal.service.persistence.CExtStaffingChurchPK cExtStaffingChurchPK,
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingChurch> orderByComparator)
		throws NoSuchCExtStaffingChurchException;

	/**
	* Removes all the c ext staffing churchs where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	*/
	public void removeByOrganizationId(long organizationId);

	/**
	* Returns the number of c ext staffing churchs where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching c ext staffing churchs
	*/
	public int countByOrganizationId(long organizationId);

	/**
	* Caches the c ext staffing church in the entity cache if it is enabled.
	*
	* @param cExtStaffingChurch the c ext staffing church
	*/
	public void cacheResult(CExtStaffingChurch cExtStaffingChurch);

	/**
	* Caches the c ext staffing churchs in the entity cache if it is enabled.
	*
	* @param cExtStaffingChurchs the c ext staffing churchs
	*/
	public void cacheResult(
		java.util.List<CExtStaffingChurch> cExtStaffingChurchs);

	/**
	* Creates a new c ext staffing church with the primary key. Does not add the c ext staffing church to the database.
	*
	* @param cExtStaffingChurchPK the primary key for the new c ext staffing church
	* @return the new c ext staffing church
	*/
	public CExtStaffingChurch create(
		ucc.portal.service.persistence.CExtStaffingChurchPK cExtStaffingChurchPK);

	/**
	* Removes the c ext staffing church with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtStaffingChurchPK the primary key of the c ext staffing church
	* @return the c ext staffing church that was removed
	* @throws NoSuchCExtStaffingChurchException if a c ext staffing church with the primary key could not be found
	*/
	public CExtStaffingChurch remove(
		ucc.portal.service.persistence.CExtStaffingChurchPK cExtStaffingChurchPK)
		throws NoSuchCExtStaffingChurchException;

	public CExtStaffingChurch updateImpl(CExtStaffingChurch cExtStaffingChurch);

	/**
	* Returns the c ext staffing church with the primary key or throws a {@link NoSuchCExtStaffingChurchException} if it could not be found.
	*
	* @param cExtStaffingChurchPK the primary key of the c ext staffing church
	* @return the c ext staffing church
	* @throws NoSuchCExtStaffingChurchException if a c ext staffing church with the primary key could not be found
	*/
	public CExtStaffingChurch findByPrimaryKey(
		ucc.portal.service.persistence.CExtStaffingChurchPK cExtStaffingChurchPK)
		throws NoSuchCExtStaffingChurchException;

	/**
	* Returns the c ext staffing church with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cExtStaffingChurchPK the primary key of the c ext staffing church
	* @return the c ext staffing church, or <code>null</code> if a c ext staffing church with the primary key could not be found
	*/
	public CExtStaffingChurch fetchByPrimaryKey(
		ucc.portal.service.persistence.CExtStaffingChurchPK cExtStaffingChurchPK);

	@Override
	public java.util.Map<java.io.Serializable, CExtStaffingChurch> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the c ext staffing churchs.
	*
	* @return the c ext staffing churchs
	*/
	public java.util.List<CExtStaffingChurch> findAll();

	/**
	* Returns a range of all the c ext staffing churchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext staffing churchs
	* @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	* @return the range of c ext staffing churchs
	*/
	public java.util.List<CExtStaffingChurch> findAll(int start, int end);

	/**
	* Returns an ordered range of all the c ext staffing churchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext staffing churchs
	* @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c ext staffing churchs
	*/
	public java.util.List<CExtStaffingChurch> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingChurch> orderByComparator);

	/**
	* Returns an ordered range of all the c ext staffing churchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext staffing churchs
	* @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of c ext staffing churchs
	*/
	public java.util.List<CExtStaffingChurch> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingChurch> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the c ext staffing churchs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of c ext staffing churchs.
	*
	* @return the number of c ext staffing churchs
	*/
	public int countAll();

	public java.util.Set<String> getCompoundPKColumnNames();
}