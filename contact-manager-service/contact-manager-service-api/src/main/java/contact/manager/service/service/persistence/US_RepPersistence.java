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

import contact.manager.service.exception.NoSuchUS_RepException;
import contact.manager.service.model.US_Rep;

/**
 * The persistence interface for the us_ rep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.US_RepPersistenceImpl
 * @see US_RepUtil
 * @generated
 */
@ProviderType
public interface US_RepPersistence extends BasePersistence<US_Rep> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link US_RepUtil} to access the us_ rep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the us_ reps where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching us_ reps
	*/
	public java.util.List<US_Rep> findByZipCode(java.lang.String zipCode);

	/**
	* Returns a range of all the us_ reps where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of us_ reps
	* @param end the upper bound of the range of us_ reps (not inclusive)
	* @return the range of matching us_ reps
	*/
	public java.util.List<US_Rep> findByZipCode(java.lang.String zipCode,
		int start, int end);

	/**
	* Returns an ordered range of all the us_ reps where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of us_ reps
	* @param end the upper bound of the range of us_ reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching us_ reps
	*/
	public java.util.List<US_Rep> findByZipCode(java.lang.String zipCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<US_Rep> orderByComparator);

	/**
	* Returns an ordered range of all the us_ reps where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of us_ reps
	* @param end the upper bound of the range of us_ reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching us_ reps
	*/
	public java.util.List<US_Rep> findByZipCode(java.lang.String zipCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<US_Rep> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first us_ rep in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching us_ rep
	* @throws NoSuchUS_RepException if a matching us_ rep could not be found
	*/
	public US_Rep findByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<US_Rep> orderByComparator)
		throws NoSuchUS_RepException;

	/**
	* Returns the first us_ rep in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching us_ rep, or <code>null</code> if a matching us_ rep could not be found
	*/
	public US_Rep fetchByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<US_Rep> orderByComparator);

	/**
	* Returns the last us_ rep in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching us_ rep
	* @throws NoSuchUS_RepException if a matching us_ rep could not be found
	*/
	public US_Rep findByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<US_Rep> orderByComparator)
		throws NoSuchUS_RepException;

	/**
	* Returns the last us_ rep in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching us_ rep, or <code>null</code> if a matching us_ rep could not be found
	*/
	public US_Rep fetchByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<US_Rep> orderByComparator);

	/**
	* Returns the us_ reps before and after the current us_ rep in the ordered set where zipCode = &#63;.
	*
	* @param usRepId the primary key of the current us_ rep
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next us_ rep
	* @throws NoSuchUS_RepException if a us_ rep with the primary key could not be found
	*/
	public US_Rep[] findByZipCode_PrevAndNext(long usRepId,
		java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<US_Rep> orderByComparator)
		throws NoSuchUS_RepException;

	/**
	* Removes all the us_ reps where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public void removeByZipCode(java.lang.String zipCode);

	/**
	* Returns the number of us_ reps where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching us_ reps
	*/
	public int countByZipCode(java.lang.String zipCode);

	/**
	* Caches the us_ rep in the entity cache if it is enabled.
	*
	* @param us_Rep the us_ rep
	*/
	public void cacheResult(US_Rep us_Rep);

	/**
	* Caches the us_ reps in the entity cache if it is enabled.
	*
	* @param us_Reps the us_ reps
	*/
	public void cacheResult(java.util.List<US_Rep> us_Reps);

	/**
	* Creates a new us_ rep with the primary key. Does not add the us_ rep to the database.
	*
	* @param usRepId the primary key for the new us_ rep
	* @return the new us_ rep
	*/
	public US_Rep create(long usRepId);

	/**
	* Removes the us_ rep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param usRepId the primary key of the us_ rep
	* @return the us_ rep that was removed
	* @throws NoSuchUS_RepException if a us_ rep with the primary key could not be found
	*/
	public US_Rep remove(long usRepId) throws NoSuchUS_RepException;

	public US_Rep updateImpl(US_Rep us_Rep);

	/**
	* Returns the us_ rep with the primary key or throws a {@link NoSuchUS_RepException} if it could not be found.
	*
	* @param usRepId the primary key of the us_ rep
	* @return the us_ rep
	* @throws NoSuchUS_RepException if a us_ rep with the primary key could not be found
	*/
	public US_Rep findByPrimaryKey(long usRepId) throws NoSuchUS_RepException;

	/**
	* Returns the us_ rep with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param usRepId the primary key of the us_ rep
	* @return the us_ rep, or <code>null</code> if a us_ rep with the primary key could not be found
	*/
	public US_Rep fetchByPrimaryKey(long usRepId);

	@Override
	public java.util.Map<java.io.Serializable, US_Rep> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the us_ reps.
	*
	* @return the us_ reps
	*/
	public java.util.List<US_Rep> findAll();

	/**
	* Returns a range of all the us_ reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of us_ reps
	* @param end the upper bound of the range of us_ reps (not inclusive)
	* @return the range of us_ reps
	*/
	public java.util.List<US_Rep> findAll(int start, int end);

	/**
	* Returns an ordered range of all the us_ reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of us_ reps
	* @param end the upper bound of the range of us_ reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of us_ reps
	*/
	public java.util.List<US_Rep> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<US_Rep> orderByComparator);

	/**
	* Returns an ordered range of all the us_ reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of us_ reps
	* @param end the upper bound of the range of us_ reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of us_ reps
	*/
	public java.util.List<US_Rep> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<US_Rep> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the us_ reps from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of us_ reps.
	*
	* @return the number of us_ reps
	*/
	public int countAll();
}