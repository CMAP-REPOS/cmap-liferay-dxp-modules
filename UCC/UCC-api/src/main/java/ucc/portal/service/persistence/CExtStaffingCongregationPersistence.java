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

import ucc.portal.exception.NoSuchCExtStaffingCongregationException;

import ucc.portal.model.CExtStaffingCongregation;

/**
 * The persistence interface for the c ext staffing congregation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.CExtStaffingCongregationPersistenceImpl
 * @see CExtStaffingCongregationUtil
 * @generated
 */
@ProviderType
public interface CExtStaffingCongregationPersistence extends BasePersistence<CExtStaffingCongregation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CExtStaffingCongregationUtil} to access the c ext staffing congregation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the c ext staffing congregations where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching c ext staffing congregations
	*/
	public java.util.List<CExtStaffingCongregation> findByOrganizationId(
		long organizationId);

	/**
	* Returns a range of all the c ext staffing congregations where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @return the range of matching c ext staffing congregations
	*/
	public java.util.List<CExtStaffingCongregation> findByOrganizationId(
		long organizationId, int start, int end);

	/**
	* Returns an ordered range of all the c ext staffing congregations where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching c ext staffing congregations
	*/
	public java.util.List<CExtStaffingCongregation> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingCongregation> orderByComparator);

	/**
	* Returns an ordered range of all the c ext staffing congregations where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching c ext staffing congregations
	*/
	public java.util.List<CExtStaffingCongregation> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingCongregation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first c ext staffing congregation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext staffing congregation
	* @throws NoSuchCExtStaffingCongregationException if a matching c ext staffing congregation could not be found
	*/
	public CExtStaffingCongregation findByOrganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingCongregation> orderByComparator)
		throws NoSuchCExtStaffingCongregationException;

	/**
	* Returns the first c ext staffing congregation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext staffing congregation, or <code>null</code> if a matching c ext staffing congregation could not be found
	*/
	public CExtStaffingCongregation fetchByOrganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingCongregation> orderByComparator);

	/**
	* Returns the last c ext staffing congregation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext staffing congregation
	* @throws NoSuchCExtStaffingCongregationException if a matching c ext staffing congregation could not be found
	*/
	public CExtStaffingCongregation findByOrganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingCongregation> orderByComparator)
		throws NoSuchCExtStaffingCongregationException;

	/**
	* Returns the last c ext staffing congregation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext staffing congregation, or <code>null</code> if a matching c ext staffing congregation could not be found
	*/
	public CExtStaffingCongregation fetchByOrganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingCongregation> orderByComparator);

	/**
	* Returns the c ext staffing congregations before and after the current c ext staffing congregation in the ordered set where organizationId = &#63;.
	*
	* @param cExtStaffingCongregationPK the primary key of the current c ext staffing congregation
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next c ext staffing congregation
	* @throws NoSuchCExtStaffingCongregationException if a c ext staffing congregation with the primary key could not be found
	*/
	public CExtStaffingCongregation[] findByOrganizationId_PrevAndNext(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK,
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingCongregation> orderByComparator)
		throws NoSuchCExtStaffingCongregationException;

	/**
	* Removes all the c ext staffing congregations where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	*/
	public void removeByOrganizationId(long organizationId);

	/**
	* Returns the number of c ext staffing congregations where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching c ext staffing congregations
	*/
	public int countByOrganizationId(long organizationId);

	/**
	* Caches the c ext staffing congregation in the entity cache if it is enabled.
	*
	* @param cExtStaffingCongregation the c ext staffing congregation
	*/
	public void cacheResult(CExtStaffingCongregation cExtStaffingCongregation);

	/**
	* Caches the c ext staffing congregations in the entity cache if it is enabled.
	*
	* @param cExtStaffingCongregations the c ext staffing congregations
	*/
	public void cacheResult(
		java.util.List<CExtStaffingCongregation> cExtStaffingCongregations);

	/**
	* Creates a new c ext staffing congregation with the primary key. Does not add the c ext staffing congregation to the database.
	*
	* @param cExtStaffingCongregationPK the primary key for the new c ext staffing congregation
	* @return the new c ext staffing congregation
	*/
	public CExtStaffingCongregation create(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK);

	/**
	* Removes the c ext staffing congregation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtStaffingCongregationPK the primary key of the c ext staffing congregation
	* @return the c ext staffing congregation that was removed
	* @throws NoSuchCExtStaffingCongregationException if a c ext staffing congregation with the primary key could not be found
	*/
	public CExtStaffingCongregation remove(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK)
		throws NoSuchCExtStaffingCongregationException;

	public CExtStaffingCongregation updateImpl(
		CExtStaffingCongregation cExtStaffingCongregation);

	/**
	* Returns the c ext staffing congregation with the primary key or throws a {@link NoSuchCExtStaffingCongregationException} if it could not be found.
	*
	* @param cExtStaffingCongregationPK the primary key of the c ext staffing congregation
	* @return the c ext staffing congregation
	* @throws NoSuchCExtStaffingCongregationException if a c ext staffing congregation with the primary key could not be found
	*/
	public CExtStaffingCongregation findByPrimaryKey(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK)
		throws NoSuchCExtStaffingCongregationException;

	/**
	* Returns the c ext staffing congregation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cExtStaffingCongregationPK the primary key of the c ext staffing congregation
	* @return the c ext staffing congregation, or <code>null</code> if a c ext staffing congregation with the primary key could not be found
	*/
	public CExtStaffingCongregation fetchByPrimaryKey(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK);

	@Override
	public java.util.Map<java.io.Serializable, CExtStaffingCongregation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the c ext staffing congregations.
	*
	* @return the c ext staffing congregations
	*/
	public java.util.List<CExtStaffingCongregation> findAll();

	/**
	* Returns a range of all the c ext staffing congregations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @return the range of c ext staffing congregations
	*/
	public java.util.List<CExtStaffingCongregation> findAll(int start, int end);

	/**
	* Returns an ordered range of all the c ext staffing congregations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c ext staffing congregations
	*/
	public java.util.List<CExtStaffingCongregation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingCongregation> orderByComparator);

	/**
	* Returns an ordered range of all the c ext staffing congregations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of c ext staffing congregations
	*/
	public java.util.List<CExtStaffingCongregation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtStaffingCongregation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the c ext staffing congregations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of c ext staffing congregations.
	*
	* @return the number of c ext staffing congregations
	*/
	public int countAll();

	public java.util.Set<String> getCompoundPKColumnNames();
}