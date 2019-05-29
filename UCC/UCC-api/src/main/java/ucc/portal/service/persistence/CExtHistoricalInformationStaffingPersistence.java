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

import ucc.portal.exception.NoSuchCExtHistoricalInformationStaffingException;

import ucc.portal.model.CExtHistoricalInformationStaffing;

/**
 * The persistence interface for the c ext historical information staffing service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.CExtHistoricalInformationStaffingPersistenceImpl
 * @see CExtHistoricalInformationStaffingUtil
 * @generated
 */
@ProviderType
public interface CExtHistoricalInformationStaffingPersistence
	extends BasePersistence<CExtHistoricalInformationStaffing> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CExtHistoricalInformationStaffingUtil} to access the c ext historical information staffing persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the c ext historical information staffings where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching c ext historical information staffings
	*/
	public java.util.List<CExtHistoricalInformationStaffing> findByOrganizationId(
		long organizationId);

	/**
	* Returns a range of all the c ext historical information staffings where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext historical information staffings
	* @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	* @return the range of matching c ext historical information staffings
	*/
	public java.util.List<CExtHistoricalInformationStaffing> findByOrganizationId(
		long organizationId, int start, int end);

	/**
	* Returns an ordered range of all the c ext historical information staffings where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext historical information staffings
	* @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching c ext historical information staffings
	*/
	public java.util.List<CExtHistoricalInformationStaffing> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator);

	/**
	* Returns an ordered range of all the c ext historical information staffings where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext historical information staffings
	* @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching c ext historical information staffings
	*/
	public java.util.List<CExtHistoricalInformationStaffing> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first c ext historical information staffing in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext historical information staffing
	* @throws NoSuchCExtHistoricalInformationStaffingException if a matching c ext historical information staffing could not be found
	*/
	public CExtHistoricalInformationStaffing findByOrganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator)
		throws NoSuchCExtHistoricalInformationStaffingException;

	/**
	* Returns the first c ext historical information staffing in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext historical information staffing, or <code>null</code> if a matching c ext historical information staffing could not be found
	*/
	public CExtHistoricalInformationStaffing fetchByOrganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator);

	/**
	* Returns the last c ext historical information staffing in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext historical information staffing
	* @throws NoSuchCExtHistoricalInformationStaffingException if a matching c ext historical information staffing could not be found
	*/
	public CExtHistoricalInformationStaffing findByOrganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator)
		throws NoSuchCExtHistoricalInformationStaffingException;

	/**
	* Returns the last c ext historical information staffing in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext historical information staffing, or <code>null</code> if a matching c ext historical information staffing could not be found
	*/
	public CExtHistoricalInformationStaffing fetchByOrganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator);

	/**
	* Returns the c ext historical information staffings before and after the current c ext historical information staffing in the ordered set where organizationId = &#63;.
	*
	* @param cExtHistoricalInformationStaffingPK the primary key of the current c ext historical information staffing
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next c ext historical information staffing
	* @throws NoSuchCExtHistoricalInformationStaffingException if a c ext historical information staffing with the primary key could not be found
	*/
	public CExtHistoricalInformationStaffing[] findByOrganizationId_PrevAndNext(
		ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK,
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator)
		throws NoSuchCExtHistoricalInformationStaffingException;

	/**
	* Removes all the c ext historical information staffings where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	*/
	public void removeByOrganizationId(long organizationId);

	/**
	* Returns the number of c ext historical information staffings where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching c ext historical information staffings
	*/
	public int countByOrganizationId(long organizationId);

	/**
	* Caches the c ext historical information staffing in the entity cache if it is enabled.
	*
	* @param cExtHistoricalInformationStaffing the c ext historical information staffing
	*/
	public void cacheResult(
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing);

	/**
	* Caches the c ext historical information staffings in the entity cache if it is enabled.
	*
	* @param cExtHistoricalInformationStaffings the c ext historical information staffings
	*/
	public void cacheResult(
		java.util.List<CExtHistoricalInformationStaffing> cExtHistoricalInformationStaffings);

	/**
	* Creates a new c ext historical information staffing with the primary key. Does not add the c ext historical information staffing to the database.
	*
	* @param cExtHistoricalInformationStaffingPK the primary key for the new c ext historical information staffing
	* @return the new c ext historical information staffing
	*/
	public CExtHistoricalInformationStaffing create(
		ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK);

	/**
	* Removes the c ext historical information staffing with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtHistoricalInformationStaffingPK the primary key of the c ext historical information staffing
	* @return the c ext historical information staffing that was removed
	* @throws NoSuchCExtHistoricalInformationStaffingException if a c ext historical information staffing with the primary key could not be found
	*/
	public CExtHistoricalInformationStaffing remove(
		ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK)
		throws NoSuchCExtHistoricalInformationStaffingException;

	public CExtHistoricalInformationStaffing updateImpl(
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing);

	/**
	* Returns the c ext historical information staffing with the primary key or throws a {@link NoSuchCExtHistoricalInformationStaffingException} if it could not be found.
	*
	* @param cExtHistoricalInformationStaffingPK the primary key of the c ext historical information staffing
	* @return the c ext historical information staffing
	* @throws NoSuchCExtHistoricalInformationStaffingException if a c ext historical information staffing with the primary key could not be found
	*/
	public CExtHistoricalInformationStaffing findByPrimaryKey(
		ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK)
		throws NoSuchCExtHistoricalInformationStaffingException;

	/**
	* Returns the c ext historical information staffing with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cExtHistoricalInformationStaffingPK the primary key of the c ext historical information staffing
	* @return the c ext historical information staffing, or <code>null</code> if a c ext historical information staffing with the primary key could not be found
	*/
	public CExtHistoricalInformationStaffing fetchByPrimaryKey(
		ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK);

	@Override
	public java.util.Map<java.io.Serializable, CExtHistoricalInformationStaffing> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the c ext historical information staffings.
	*
	* @return the c ext historical information staffings
	*/
	public java.util.List<CExtHistoricalInformationStaffing> findAll();

	/**
	* Returns a range of all the c ext historical information staffings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext historical information staffings
	* @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	* @return the range of c ext historical information staffings
	*/
	public java.util.List<CExtHistoricalInformationStaffing> findAll(
		int start, int end);

	/**
	* Returns an ordered range of all the c ext historical information staffings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext historical information staffings
	* @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c ext historical information staffings
	*/
	public java.util.List<CExtHistoricalInformationStaffing> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator);

	/**
	* Returns an ordered range of all the c ext historical information staffings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext historical information staffings
	* @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of c ext historical information staffings
	*/
	public java.util.List<CExtHistoricalInformationStaffing> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the c ext historical information staffings from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of c ext historical information staffings.
	*
	* @return the number of c ext historical information staffings
	*/
	public int countAll();

	public java.util.Set<String> getCompoundPKColumnNames();
}