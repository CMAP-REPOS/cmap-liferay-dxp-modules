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

import ucc.portal.exception.NoSuchCExtChurchFinancesIncomeOtherException;

import ucc.portal.model.CExtChurchFinancesIncomeOther;

/**
 * The persistence interface for the c ext church finances income other service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.CExtChurchFinancesIncomeOtherPersistenceImpl
 * @see CExtChurchFinancesIncomeOtherUtil
 * @generated
 */
@ProviderType
public interface CExtChurchFinancesIncomeOtherPersistence
	extends BasePersistence<CExtChurchFinancesIncomeOther> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CExtChurchFinancesIncomeOtherUtil} to access the c ext church finances income other persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the c ext church finances income others where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching c ext church finances income others
	*/
	public java.util.List<CExtChurchFinancesIncomeOther> findByOrganizationId(
		long organizationId);

	/**
	* Returns a range of all the c ext church finances income others where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext church finances income others
	* @param end the upper bound of the range of c ext church finances income others (not inclusive)
	* @return the range of matching c ext church finances income others
	*/
	public java.util.List<CExtChurchFinancesIncomeOther> findByOrganizationId(
		long organizationId, int start, int end);

	/**
	* Returns an ordered range of all the c ext church finances income others where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext church finances income others
	* @param end the upper bound of the range of c ext church finances income others (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching c ext church finances income others
	*/
	public java.util.List<CExtChurchFinancesIncomeOther> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator);

	/**
	* Returns an ordered range of all the c ext church finances income others where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext church finances income others
	* @param end the upper bound of the range of c ext church finances income others (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching c ext church finances income others
	*/
	public java.util.List<CExtChurchFinancesIncomeOther> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first c ext church finances income other in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext church finances income other
	* @throws NoSuchCExtChurchFinancesIncomeOtherException if a matching c ext church finances income other could not be found
	*/
	public CExtChurchFinancesIncomeOther findByOrganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator)
		throws NoSuchCExtChurchFinancesIncomeOtherException;

	/**
	* Returns the first c ext church finances income other in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext church finances income other, or <code>null</code> if a matching c ext church finances income other could not be found
	*/
	public CExtChurchFinancesIncomeOther fetchByOrganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator);

	/**
	* Returns the last c ext church finances income other in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext church finances income other
	* @throws NoSuchCExtChurchFinancesIncomeOtherException if a matching c ext church finances income other could not be found
	*/
	public CExtChurchFinancesIncomeOther findByOrganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator)
		throws NoSuchCExtChurchFinancesIncomeOtherException;

	/**
	* Returns the last c ext church finances income other in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext church finances income other, or <code>null</code> if a matching c ext church finances income other could not be found
	*/
	public CExtChurchFinancesIncomeOther fetchByOrganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator);

	/**
	* Returns the c ext church finances income others before and after the current c ext church finances income other in the ordered set where organizationId = &#63;.
	*
	* @param cExtChurchFinancesIncomeOtherPK the primary key of the current c ext church finances income other
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next c ext church finances income other
	* @throws NoSuchCExtChurchFinancesIncomeOtherException if a c ext church finances income other with the primary key could not be found
	*/
	public CExtChurchFinancesIncomeOther[] findByOrganizationId_PrevAndNext(
		ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK,
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator)
		throws NoSuchCExtChurchFinancesIncomeOtherException;

	/**
	* Removes all the c ext church finances income others where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	*/
	public void removeByOrganizationId(long organizationId);

	/**
	* Returns the number of c ext church finances income others where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching c ext church finances income others
	*/
	public int countByOrganizationId(long organizationId);

	/**
	* Caches the c ext church finances income other in the entity cache if it is enabled.
	*
	* @param cExtChurchFinancesIncomeOther the c ext church finances income other
	*/
	public void cacheResult(
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther);

	/**
	* Caches the c ext church finances income others in the entity cache if it is enabled.
	*
	* @param cExtChurchFinancesIncomeOthers the c ext church finances income others
	*/
	public void cacheResult(
		java.util.List<CExtChurchFinancesIncomeOther> cExtChurchFinancesIncomeOthers);

	/**
	* Creates a new c ext church finances income other with the primary key. Does not add the c ext church finances income other to the database.
	*
	* @param cExtChurchFinancesIncomeOtherPK the primary key for the new c ext church finances income other
	* @return the new c ext church finances income other
	*/
	public CExtChurchFinancesIncomeOther create(
		ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK);

	/**
	* Removes the c ext church finances income other with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtChurchFinancesIncomeOtherPK the primary key of the c ext church finances income other
	* @return the c ext church finances income other that was removed
	* @throws NoSuchCExtChurchFinancesIncomeOtherException if a c ext church finances income other with the primary key could not be found
	*/
	public CExtChurchFinancesIncomeOther remove(
		ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK)
		throws NoSuchCExtChurchFinancesIncomeOtherException;

	public CExtChurchFinancesIncomeOther updateImpl(
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther);

	/**
	* Returns the c ext church finances income other with the primary key or throws a {@link NoSuchCExtChurchFinancesIncomeOtherException} if it could not be found.
	*
	* @param cExtChurchFinancesIncomeOtherPK the primary key of the c ext church finances income other
	* @return the c ext church finances income other
	* @throws NoSuchCExtChurchFinancesIncomeOtherException if a c ext church finances income other with the primary key could not be found
	*/
	public CExtChurchFinancesIncomeOther findByPrimaryKey(
		ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK)
		throws NoSuchCExtChurchFinancesIncomeOtherException;

	/**
	* Returns the c ext church finances income other with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cExtChurchFinancesIncomeOtherPK the primary key of the c ext church finances income other
	* @return the c ext church finances income other, or <code>null</code> if a c ext church finances income other with the primary key could not be found
	*/
	public CExtChurchFinancesIncomeOther fetchByPrimaryKey(
		ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK);

	@Override
	public java.util.Map<java.io.Serializable, CExtChurchFinancesIncomeOther> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the c ext church finances income others.
	*
	* @return the c ext church finances income others
	*/
	public java.util.List<CExtChurchFinancesIncomeOther> findAll();

	/**
	* Returns a range of all the c ext church finances income others.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext church finances income others
	* @param end the upper bound of the range of c ext church finances income others (not inclusive)
	* @return the range of c ext church finances income others
	*/
	public java.util.List<CExtChurchFinancesIncomeOther> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the c ext church finances income others.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext church finances income others
	* @param end the upper bound of the range of c ext church finances income others (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c ext church finances income others
	*/
	public java.util.List<CExtChurchFinancesIncomeOther> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator);

	/**
	* Returns an ordered range of all the c ext church finances income others.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext church finances income others
	* @param end the upper bound of the range of c ext church finances income others (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of c ext church finances income others
	*/
	public java.util.List<CExtChurchFinancesIncomeOther> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtChurchFinancesIncomeOther> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the c ext church finances income others from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of c ext church finances income others.
	*
	* @return the number of c ext church finances income others
	*/
	public int countAll();

	public java.util.Set<String> getCompoundPKColumnNames();
}