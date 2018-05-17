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
}