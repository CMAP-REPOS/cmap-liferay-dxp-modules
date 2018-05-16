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

import contact.manager.service.exception.NoSuchChi_WardException;
import contact.manager.service.model.Chi_Ward;

/**
 * The persistence interface for the chi_ ward service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.Chi_WardPersistenceImpl
 * @see Chi_WardUtil
 * @generated
 */
@ProviderType
public interface Chi_WardPersistence extends BasePersistence<Chi_Ward> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Chi_WardUtil} to access the chi_ ward persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the chi_ wards where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching chi_ wards
	*/
	public java.util.List<Chi_Ward> findByZipCode(java.lang.String zipCode);

	/**
	* Returns a range of all the chi_ wards where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @return the range of matching chi_ wards
	*/
	public java.util.List<Chi_Ward> findByZipCode(java.lang.String zipCode,
		int start, int end);

	/**
	* Returns an ordered range of all the chi_ wards where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching chi_ wards
	*/
	public java.util.List<Chi_Ward> findByZipCode(java.lang.String zipCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Chi_Ward> orderByComparator);

	/**
	* Returns an ordered range of all the chi_ wards where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching chi_ wards
	*/
	public java.util.List<Chi_Ward> findByZipCode(java.lang.String zipCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Chi_Ward> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first chi_ ward in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching chi_ ward
	* @throws NoSuchChi_WardException if a matching chi_ ward could not be found
	*/
	public Chi_Ward findByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<Chi_Ward> orderByComparator)
		throws NoSuchChi_WardException;

	/**
	* Returns the first chi_ ward in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching chi_ ward, or <code>null</code> if a matching chi_ ward could not be found
	*/
	public Chi_Ward fetchByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<Chi_Ward> orderByComparator);

	/**
	* Returns the last chi_ ward in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching chi_ ward
	* @throws NoSuchChi_WardException if a matching chi_ ward could not be found
	*/
	public Chi_Ward findByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<Chi_Ward> orderByComparator)
		throws NoSuchChi_WardException;

	/**
	* Returns the last chi_ ward in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching chi_ ward, or <code>null</code> if a matching chi_ ward could not be found
	*/
	public Chi_Ward fetchByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<Chi_Ward> orderByComparator);

	/**
	* Returns the chi_ wards before and after the current chi_ ward in the ordered set where zipCode = &#63;.
	*
	* @param chiWardId the primary key of the current chi_ ward
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next chi_ ward
	* @throws NoSuchChi_WardException if a chi_ ward with the primary key could not be found
	*/
	public Chi_Ward[] findByZipCode_PrevAndNext(long chiWardId,
		java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<Chi_Ward> orderByComparator)
		throws NoSuchChi_WardException;

	/**
	* Removes all the chi_ wards where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public void removeByZipCode(java.lang.String zipCode);

	/**
	* Returns the number of chi_ wards where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching chi_ wards
	*/
	public int countByZipCode(java.lang.String zipCode);

	/**
	* Caches the chi_ ward in the entity cache if it is enabled.
	*
	* @param chi_Ward the chi_ ward
	*/
	public void cacheResult(Chi_Ward chi_Ward);

	/**
	* Caches the chi_ wards in the entity cache if it is enabled.
	*
	* @param chi_Wards the chi_ wards
	*/
	public void cacheResult(java.util.List<Chi_Ward> chi_Wards);

	/**
	* Creates a new chi_ ward with the primary key. Does not add the chi_ ward to the database.
	*
	* @param chiWardId the primary key for the new chi_ ward
	* @return the new chi_ ward
	*/
	public Chi_Ward create(long chiWardId);

	/**
	* Removes the chi_ ward with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param chiWardId the primary key of the chi_ ward
	* @return the chi_ ward that was removed
	* @throws NoSuchChi_WardException if a chi_ ward with the primary key could not be found
	*/
	public Chi_Ward remove(long chiWardId) throws NoSuchChi_WardException;

	public Chi_Ward updateImpl(Chi_Ward chi_Ward);

	/**
	* Returns the chi_ ward with the primary key or throws a {@link NoSuchChi_WardException} if it could not be found.
	*
	* @param chiWardId the primary key of the chi_ ward
	* @return the chi_ ward
	* @throws NoSuchChi_WardException if a chi_ ward with the primary key could not be found
	*/
	public Chi_Ward findByPrimaryKey(long chiWardId)
		throws NoSuchChi_WardException;

	/**
	* Returns the chi_ ward with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param chiWardId the primary key of the chi_ ward
	* @return the chi_ ward, or <code>null</code> if a chi_ ward with the primary key could not be found
	*/
	public Chi_Ward fetchByPrimaryKey(long chiWardId);

	@Override
	public java.util.Map<java.io.Serializable, Chi_Ward> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the chi_ wards.
	*
	* @return the chi_ wards
	*/
	public java.util.List<Chi_Ward> findAll();

	/**
	* Returns a range of all the chi_ wards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @return the range of chi_ wards
	*/
	public java.util.List<Chi_Ward> findAll(int start, int end);

	/**
	* Returns an ordered range of all the chi_ wards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of chi_ wards
	*/
	public java.util.List<Chi_Ward> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Chi_Ward> orderByComparator);

	/**
	* Returns an ordered range of all the chi_ wards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of chi_ wards
	*/
	public java.util.List<Chi_Ward> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Chi_Ward> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the chi_ wards from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of chi_ wards.
	*
	* @return the number of chi_ wards
	*/
	public int countAll();
}