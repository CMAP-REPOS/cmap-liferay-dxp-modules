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

import contact.manager.service.exception.NoSuchCounty_Commissioner_or_Board_DistException;
import contact.manager.service.model.County_Commissioner_or_Board_Dist;

/**
 * The persistence interface for the county_ commissioner_or_ board_ dist service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.County_Commissioner_or_Board_DistPersistenceImpl
 * @see County_Commissioner_or_Board_DistUtil
 * @generated
 */
@ProviderType
public interface County_Commissioner_or_Board_DistPersistence
	extends BasePersistence<County_Commissioner_or_Board_Dist> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link County_Commissioner_or_Board_DistUtil} to access the county_ commissioner_or_ board_ dist persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the county_ commissioner_or_ board_ dists where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching county_ commissioner_or_ board_ dists
	*/
	public java.util.List<County_Commissioner_or_Board_Dist> findByZipCode(
		java.lang.String zipCode);

	/**
	* Returns a range of all the county_ commissioner_or_ board_ dists where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of county_ commissioner_or_ board_ dists
	* @param end the upper bound of the range of county_ commissioner_or_ board_ dists (not inclusive)
	* @return the range of matching county_ commissioner_or_ board_ dists
	*/
	public java.util.List<County_Commissioner_or_Board_Dist> findByZipCode(
		java.lang.String zipCode, int start, int end);

	/**
	* Returns an ordered range of all the county_ commissioner_or_ board_ dists where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of county_ commissioner_or_ board_ dists
	* @param end the upper bound of the range of county_ commissioner_or_ board_ dists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching county_ commissioner_or_ board_ dists
	*/
	public java.util.List<County_Commissioner_or_Board_Dist> findByZipCode(
		java.lang.String zipCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator);

	/**
	* Returns an ordered range of all the county_ commissioner_or_ board_ dists where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of county_ commissioner_or_ board_ dists
	* @param end the upper bound of the range of county_ commissioner_or_ board_ dists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching county_ commissioner_or_ board_ dists
	*/
	public java.util.List<County_Commissioner_or_Board_Dist> findByZipCode(
		java.lang.String zipCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first county_ commissioner_or_ board_ dist in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching county_ commissioner_or_ board_ dist
	* @throws NoSuchCounty_Commissioner_or_Board_DistException if a matching county_ commissioner_or_ board_ dist could not be found
	*/
	public County_Commissioner_or_Board_Dist findByZipCode_First(
		java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator)
		throws NoSuchCounty_Commissioner_or_Board_DistException;

	/**
	* Returns the first county_ commissioner_or_ board_ dist in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching county_ commissioner_or_ board_ dist, or <code>null</code> if a matching county_ commissioner_or_ board_ dist could not be found
	*/
	public County_Commissioner_or_Board_Dist fetchByZipCode_First(
		java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator);

	/**
	* Returns the last county_ commissioner_or_ board_ dist in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching county_ commissioner_or_ board_ dist
	* @throws NoSuchCounty_Commissioner_or_Board_DistException if a matching county_ commissioner_or_ board_ dist could not be found
	*/
	public County_Commissioner_or_Board_Dist findByZipCode_Last(
		java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator)
		throws NoSuchCounty_Commissioner_or_Board_DistException;

	/**
	* Returns the last county_ commissioner_or_ board_ dist in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching county_ commissioner_or_ board_ dist, or <code>null</code> if a matching county_ commissioner_or_ board_ dist could not be found
	*/
	public County_Commissioner_or_Board_Dist fetchByZipCode_Last(
		java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator);

	/**
	* Returns the county_ commissioner_or_ board_ dists before and after the current county_ commissioner_or_ board_ dist in the ordered set where zipCode = &#63;.
	*
	* @param ccbdId the primary key of the current county_ commissioner_or_ board_ dist
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next county_ commissioner_or_ board_ dist
	* @throws NoSuchCounty_Commissioner_or_Board_DistException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	*/
	public County_Commissioner_or_Board_Dist[] findByZipCode_PrevAndNext(
		long ccbdId, java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator)
		throws NoSuchCounty_Commissioner_or_Board_DistException;

	/**
	* Removes all the county_ commissioner_or_ board_ dists where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public void removeByZipCode(java.lang.String zipCode);

	/**
	* Returns the number of county_ commissioner_or_ board_ dists where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching county_ commissioner_or_ board_ dists
	*/
	public int countByZipCode(java.lang.String zipCode);

	/**
	* Caches the county_ commissioner_or_ board_ dist in the entity cache if it is enabled.
	*
	* @param county_Commissioner_or_Board_Dist the county_ commissioner_or_ board_ dist
	*/
	public void cacheResult(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist);

	/**
	* Caches the county_ commissioner_or_ board_ dists in the entity cache if it is enabled.
	*
	* @param county_Commissioner_or_Board_Dists the county_ commissioner_or_ board_ dists
	*/
	public void cacheResult(
		java.util.List<County_Commissioner_or_Board_Dist> county_Commissioner_or_Board_Dists);

	/**
	* Creates a new county_ commissioner_or_ board_ dist with the primary key. Does not add the county_ commissioner_or_ board_ dist to the database.
	*
	* @param ccbdId the primary key for the new county_ commissioner_or_ board_ dist
	* @return the new county_ commissioner_or_ board_ dist
	*/
	public County_Commissioner_or_Board_Dist create(long ccbdId);

	/**
	* Removes the county_ commissioner_or_ board_ dist with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist that was removed
	* @throws NoSuchCounty_Commissioner_or_Board_DistException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	*/
	public County_Commissioner_or_Board_Dist remove(long ccbdId)
		throws NoSuchCounty_Commissioner_or_Board_DistException;

	public County_Commissioner_or_Board_Dist updateImpl(
		County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist);

	/**
	* Returns the county_ commissioner_or_ board_ dist with the primary key or throws a {@link NoSuchCounty_Commissioner_or_Board_DistException} if it could not be found.
	*
	* @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist
	* @throws NoSuchCounty_Commissioner_or_Board_DistException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	*/
	public County_Commissioner_or_Board_Dist findByPrimaryKey(long ccbdId)
		throws NoSuchCounty_Commissioner_or_Board_DistException;

	/**
	* Returns the county_ commissioner_or_ board_ dist with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist, or <code>null</code> if a county_ commissioner_or_ board_ dist with the primary key could not be found
	*/
	public County_Commissioner_or_Board_Dist fetchByPrimaryKey(long ccbdId);

	@Override
	public java.util.Map<java.io.Serializable, County_Commissioner_or_Board_Dist> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the county_ commissioner_or_ board_ dists.
	*
	* @return the county_ commissioner_or_ board_ dists
	*/
	public java.util.List<County_Commissioner_or_Board_Dist> findAll();

	/**
	* Returns a range of all the county_ commissioner_or_ board_ dists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of county_ commissioner_or_ board_ dists
	* @param end the upper bound of the range of county_ commissioner_or_ board_ dists (not inclusive)
	* @return the range of county_ commissioner_or_ board_ dists
	*/
	public java.util.List<County_Commissioner_or_Board_Dist> findAll(
		int start, int end);

	/**
	* Returns an ordered range of all the county_ commissioner_or_ board_ dists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of county_ commissioner_or_ board_ dists
	* @param end the upper bound of the range of county_ commissioner_or_ board_ dists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of county_ commissioner_or_ board_ dists
	*/
	public java.util.List<County_Commissioner_or_Board_Dist> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator);

	/**
	* Returns an ordered range of all the county_ commissioner_or_ board_ dists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of county_ commissioner_or_ board_ dists
	* @param end the upper bound of the range of county_ commissioner_or_ board_ dists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of county_ commissioner_or_ board_ dists
	*/
	public java.util.List<County_Commissioner_or_Board_Dist> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<County_Commissioner_or_Board_Dist> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the county_ commissioner_or_ board_ dists from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of county_ commissioner_or_ board_ dists.
	*
	* @return the number of county_ commissioner_or_ board_ dists
	*/
	public int countAll();
}