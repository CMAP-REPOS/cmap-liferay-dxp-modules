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

import ucc.portal.exception.NoSuchExtKeyAccomplishmentException;

import ucc.portal.model.ExtKeyAccomplishment;

/**
 * The persistence interface for the ext key accomplishment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.ExtKeyAccomplishmentPersistenceImpl
 * @see ExtKeyAccomplishmentUtil
 * @generated
 */
@ProviderType
public interface ExtKeyAccomplishmentPersistence extends BasePersistence<ExtKeyAccomplishment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExtKeyAccomplishmentUtil} to access the ext key accomplishment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ext key accomplishments where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext key accomplishments
	*/
	public java.util.List<ExtKeyAccomplishment> findByUserId(long userId);

	/**
	* Returns a range of all the ext key accomplishments where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @return the range of matching ext key accomplishments
	*/
	public java.util.List<ExtKeyAccomplishment> findByUserId(long userId,
		int start, int end);

	/**
	* Returns an ordered range of all the ext key accomplishments where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext key accomplishments
	*/
	public java.util.List<ExtKeyAccomplishment> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtKeyAccomplishment> orderByComparator);

	/**
	* Returns an ordered range of all the ext key accomplishments where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext key accomplishments
	*/
	public java.util.List<ExtKeyAccomplishment> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtKeyAccomplishment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ext key accomplishment in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext key accomplishment
	* @throws NoSuchExtKeyAccomplishmentException if a matching ext key accomplishment could not be found
	*/
	public ExtKeyAccomplishment findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtKeyAccomplishment> orderByComparator)
		throws NoSuchExtKeyAccomplishmentException;

	/**
	* Returns the first ext key accomplishment in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext key accomplishment, or <code>null</code> if a matching ext key accomplishment could not be found
	*/
	public ExtKeyAccomplishment fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtKeyAccomplishment> orderByComparator);

	/**
	* Returns the last ext key accomplishment in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext key accomplishment
	* @throws NoSuchExtKeyAccomplishmentException if a matching ext key accomplishment could not be found
	*/
	public ExtKeyAccomplishment findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtKeyAccomplishment> orderByComparator)
		throws NoSuchExtKeyAccomplishmentException;

	/**
	* Returns the last ext key accomplishment in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext key accomplishment, or <code>null</code> if a matching ext key accomplishment could not be found
	*/
	public ExtKeyAccomplishment fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtKeyAccomplishment> orderByComparator);

	/**
	* Returns the ext key accomplishments before and after the current ext key accomplishment in the ordered set where userId = &#63;.
	*
	* @param extKeyAccomplishmentId the primary key of the current ext key accomplishment
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext key accomplishment
	* @throws NoSuchExtKeyAccomplishmentException if a ext key accomplishment with the primary key could not be found
	*/
	public ExtKeyAccomplishment[] findByUserId_PrevAndNext(
		long extKeyAccomplishmentId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtKeyAccomplishment> orderByComparator)
		throws NoSuchExtKeyAccomplishmentException;

	/**
	* Removes all the ext key accomplishments where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of ext key accomplishments where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext key accomplishments
	*/
	public int countByUserId(long userId);

	/**
	* Caches the ext key accomplishment in the entity cache if it is enabled.
	*
	* @param extKeyAccomplishment the ext key accomplishment
	*/
	public void cacheResult(ExtKeyAccomplishment extKeyAccomplishment);

	/**
	* Caches the ext key accomplishments in the entity cache if it is enabled.
	*
	* @param extKeyAccomplishments the ext key accomplishments
	*/
	public void cacheResult(
		java.util.List<ExtKeyAccomplishment> extKeyAccomplishments);

	/**
	* Creates a new ext key accomplishment with the primary key. Does not add the ext key accomplishment to the database.
	*
	* @param extKeyAccomplishmentId the primary key for the new ext key accomplishment
	* @return the new ext key accomplishment
	*/
	public ExtKeyAccomplishment create(long extKeyAccomplishmentId);

	/**
	* Removes the ext key accomplishment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extKeyAccomplishmentId the primary key of the ext key accomplishment
	* @return the ext key accomplishment that was removed
	* @throws NoSuchExtKeyAccomplishmentException if a ext key accomplishment with the primary key could not be found
	*/
	public ExtKeyAccomplishment remove(long extKeyAccomplishmentId)
		throws NoSuchExtKeyAccomplishmentException;

	public ExtKeyAccomplishment updateImpl(
		ExtKeyAccomplishment extKeyAccomplishment);

	/**
	* Returns the ext key accomplishment with the primary key or throws a {@link NoSuchExtKeyAccomplishmentException} if it could not be found.
	*
	* @param extKeyAccomplishmentId the primary key of the ext key accomplishment
	* @return the ext key accomplishment
	* @throws NoSuchExtKeyAccomplishmentException if a ext key accomplishment with the primary key could not be found
	*/
	public ExtKeyAccomplishment findByPrimaryKey(long extKeyAccomplishmentId)
		throws NoSuchExtKeyAccomplishmentException;

	/**
	* Returns the ext key accomplishment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extKeyAccomplishmentId the primary key of the ext key accomplishment
	* @return the ext key accomplishment, or <code>null</code> if a ext key accomplishment with the primary key could not be found
	*/
	public ExtKeyAccomplishment fetchByPrimaryKey(long extKeyAccomplishmentId);

	@Override
	public java.util.Map<java.io.Serializable, ExtKeyAccomplishment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ext key accomplishments.
	*
	* @return the ext key accomplishments
	*/
	public java.util.List<ExtKeyAccomplishment> findAll();

	/**
	* Returns a range of all the ext key accomplishments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @return the range of ext key accomplishments
	*/
	public java.util.List<ExtKeyAccomplishment> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ext key accomplishments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext key accomplishments
	*/
	public java.util.List<ExtKeyAccomplishment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtKeyAccomplishment> orderByComparator);

	/**
	* Returns an ordered range of all the ext key accomplishments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ext key accomplishments
	*/
	public java.util.List<ExtKeyAccomplishment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtKeyAccomplishment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ext key accomplishments from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ext key accomplishments.
	*
	* @return the number of ext key accomplishments
	*/
	public int countAll();
}