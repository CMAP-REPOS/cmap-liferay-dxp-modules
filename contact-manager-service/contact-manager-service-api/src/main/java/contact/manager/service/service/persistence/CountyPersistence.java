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

package contact.manager.service.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import contact.manager.service.exception.NoSuchCountyException;
import contact.manager.service.model.County;

/**
 * The persistence interface for the county service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.CountyPersistenceImpl
 * @see CountyUtil
 * @generated
 */
@ProviderType
public interface CountyPersistence extends BasePersistence<County> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CountyUtil} to access the county persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the county in the entity cache if it is enabled.
	*
	* @param county the county
	*/
	public void cacheResult(County county);

	/**
	* Caches the counties in the entity cache if it is enabled.
	*
	* @param counties the counties
	*/
	public void cacheResult(java.util.List<County> counties);

	/**
	* Creates a new county with the primary key. Does not add the county to the database.
	*
	* @param countyId the primary key for the new county
	* @return the new county
	*/
	public County create(long countyId);

	/**
	* Removes the county with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param countyId the primary key of the county
	* @return the county that was removed
	* @throws NoSuchCountyException if a county with the primary key could not be found
	*/
	public County remove(long countyId) throws NoSuchCountyException;

	public County updateImpl(County county);

	/**
	* Returns the county with the primary key or throws a {@link NoSuchCountyException} if it could not be found.
	*
	* @param countyId the primary key of the county
	* @return the county
	* @throws NoSuchCountyException if a county with the primary key could not be found
	*/
	public County findByPrimaryKey(long countyId) throws NoSuchCountyException;

	/**
	* Returns the county with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param countyId the primary key of the county
	* @return the county, or <code>null</code> if a county with the primary key could not be found
	*/
	public County fetchByPrimaryKey(long countyId);

	@Override
	public java.util.Map<java.io.Serializable, County> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the counties.
	*
	* @return the counties
	*/
	public java.util.List<County> findAll();

	/**
	* Returns a range of all the counties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of counties
	* @param end the upper bound of the range of counties (not inclusive)
	* @return the range of counties
	*/
	public java.util.List<County> findAll(int start, int end);

	/**
	* Returns an ordered range of all the counties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of counties
	* @param end the upper bound of the range of counties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of counties
	*/
	public java.util.List<County> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<County> orderByComparator);

	/**
	* Returns an ordered range of all the counties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of counties
	* @param end the upper bound of the range of counties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of counties
	*/
	public java.util.List<County> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<County> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the counties from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of counties.
	*
	* @return the number of counties
	*/
	public int countAll();
}