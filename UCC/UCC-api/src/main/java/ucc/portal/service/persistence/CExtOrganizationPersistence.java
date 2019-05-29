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

import ucc.portal.exception.NoSuchCExtOrganizationException;

import ucc.portal.model.CExtOrganization;

/**
 * The persistence interface for the c ext organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.CExtOrganizationPersistenceImpl
 * @see CExtOrganizationUtil
 * @generated
 */
@ProviderType
public interface CExtOrganizationPersistence extends BasePersistence<CExtOrganization> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CExtOrganizationUtil} to access the c ext organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the c ext organization in the entity cache if it is enabled.
	*
	* @param cExtOrganization the c ext organization
	*/
	public void cacheResult(CExtOrganization cExtOrganization);

	/**
	* Caches the c ext organizations in the entity cache if it is enabled.
	*
	* @param cExtOrganizations the c ext organizations
	*/
	public void cacheResult(java.util.List<CExtOrganization> cExtOrganizations);

	/**
	* Creates a new c ext organization with the primary key. Does not add the c ext organization to the database.
	*
	* @param organizationId the primary key for the new c ext organization
	* @return the new c ext organization
	*/
	public CExtOrganization create(long organizationId);

	/**
	* Removes the c ext organization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param organizationId the primary key of the c ext organization
	* @return the c ext organization that was removed
	* @throws NoSuchCExtOrganizationException if a c ext organization with the primary key could not be found
	*/
	public CExtOrganization remove(long organizationId)
		throws NoSuchCExtOrganizationException;

	public CExtOrganization updateImpl(CExtOrganization cExtOrganization);

	/**
	* Returns the c ext organization with the primary key or throws a {@link NoSuchCExtOrganizationException} if it could not be found.
	*
	* @param organizationId the primary key of the c ext organization
	* @return the c ext organization
	* @throws NoSuchCExtOrganizationException if a c ext organization with the primary key could not be found
	*/
	public CExtOrganization findByPrimaryKey(long organizationId)
		throws NoSuchCExtOrganizationException;

	/**
	* Returns the c ext organization with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param organizationId the primary key of the c ext organization
	* @return the c ext organization, or <code>null</code> if a c ext organization with the primary key could not be found
	*/
	public CExtOrganization fetchByPrimaryKey(long organizationId);

	@Override
	public java.util.Map<java.io.Serializable, CExtOrganization> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the c ext organizations.
	*
	* @return the c ext organizations
	*/
	public java.util.List<CExtOrganization> findAll();

	/**
	* Returns a range of all the c ext organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext organizations
	* @param end the upper bound of the range of c ext organizations (not inclusive)
	* @return the range of c ext organizations
	*/
	public java.util.List<CExtOrganization> findAll(int start, int end);

	/**
	* Returns an ordered range of all the c ext organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext organizations
	* @param end the upper bound of the range of c ext organizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c ext organizations
	*/
	public java.util.List<CExtOrganization> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtOrganization> orderByComparator);

	/**
	* Returns an ordered range of all the c ext organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext organizations
	* @param end the upper bound of the range of c ext organizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of c ext organizations
	*/
	public java.util.List<CExtOrganization> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtOrganization> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the c ext organizations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of c ext organizations.
	*
	* @return the number of c ext organizations
	*/
	public int countAll();
}