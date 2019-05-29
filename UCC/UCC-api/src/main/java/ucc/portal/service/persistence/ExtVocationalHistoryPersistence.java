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

import ucc.portal.exception.NoSuchExtVocationalHistoryException;

import ucc.portal.model.ExtVocationalHistory;

/**
 * The persistence interface for the ext vocational history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.ExtVocationalHistoryPersistenceImpl
 * @see ExtVocationalHistoryUtil
 * @generated
 */
@ProviderType
public interface ExtVocationalHistoryPersistence extends BasePersistence<ExtVocationalHistory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExtVocationalHistoryUtil} to access the ext vocational history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ext vocational histories where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext vocational histories
	*/
	public java.util.List<ExtVocationalHistory> findByUserId(long userId);

	/**
	* Returns a range of all the ext vocational histories where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @return the range of matching ext vocational histories
	*/
	public java.util.List<ExtVocationalHistory> findByUserId(long userId,
		int start, int end);

	/**
	* Returns an ordered range of all the ext vocational histories where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext vocational histories
	*/
	public java.util.List<ExtVocationalHistory> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtVocationalHistory> orderByComparator);

	/**
	* Returns an ordered range of all the ext vocational histories where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext vocational histories
	*/
	public java.util.List<ExtVocationalHistory> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtVocationalHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ext vocational history in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext vocational history
	* @throws NoSuchExtVocationalHistoryException if a matching ext vocational history could not be found
	*/
	public ExtVocationalHistory findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtVocationalHistory> orderByComparator)
		throws NoSuchExtVocationalHistoryException;

	/**
	* Returns the first ext vocational history in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext vocational history, or <code>null</code> if a matching ext vocational history could not be found
	*/
	public ExtVocationalHistory fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtVocationalHistory> orderByComparator);

	/**
	* Returns the last ext vocational history in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext vocational history
	* @throws NoSuchExtVocationalHistoryException if a matching ext vocational history could not be found
	*/
	public ExtVocationalHistory findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtVocationalHistory> orderByComparator)
		throws NoSuchExtVocationalHistoryException;

	/**
	* Returns the last ext vocational history in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext vocational history, or <code>null</code> if a matching ext vocational history could not be found
	*/
	public ExtVocationalHistory fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtVocationalHistory> orderByComparator);

	/**
	* Returns the ext vocational histories before and after the current ext vocational history in the ordered set where userId = &#63;.
	*
	* @param extVocationalHistoryId the primary key of the current ext vocational history
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext vocational history
	* @throws NoSuchExtVocationalHistoryException if a ext vocational history with the primary key could not be found
	*/
	public ExtVocationalHistory[] findByUserId_PrevAndNext(
		long extVocationalHistoryId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtVocationalHistory> orderByComparator)
		throws NoSuchExtVocationalHistoryException;

	/**
	* Removes all the ext vocational histories where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of ext vocational histories where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext vocational histories
	*/
	public int countByUserId(long userId);

	/**
	* Caches the ext vocational history in the entity cache if it is enabled.
	*
	* @param extVocationalHistory the ext vocational history
	*/
	public void cacheResult(ExtVocationalHistory extVocationalHistory);

	/**
	* Caches the ext vocational histories in the entity cache if it is enabled.
	*
	* @param extVocationalHistories the ext vocational histories
	*/
	public void cacheResult(
		java.util.List<ExtVocationalHistory> extVocationalHistories);

	/**
	* Creates a new ext vocational history with the primary key. Does not add the ext vocational history to the database.
	*
	* @param extVocationalHistoryId the primary key for the new ext vocational history
	* @return the new ext vocational history
	*/
	public ExtVocationalHistory create(long extVocationalHistoryId);

	/**
	* Removes the ext vocational history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extVocationalHistoryId the primary key of the ext vocational history
	* @return the ext vocational history that was removed
	* @throws NoSuchExtVocationalHistoryException if a ext vocational history with the primary key could not be found
	*/
	public ExtVocationalHistory remove(long extVocationalHistoryId)
		throws NoSuchExtVocationalHistoryException;

	public ExtVocationalHistory updateImpl(
		ExtVocationalHistory extVocationalHistory);

	/**
	* Returns the ext vocational history with the primary key or throws a {@link NoSuchExtVocationalHistoryException} if it could not be found.
	*
	* @param extVocationalHistoryId the primary key of the ext vocational history
	* @return the ext vocational history
	* @throws NoSuchExtVocationalHistoryException if a ext vocational history with the primary key could not be found
	*/
	public ExtVocationalHistory findByPrimaryKey(long extVocationalHistoryId)
		throws NoSuchExtVocationalHistoryException;

	/**
	* Returns the ext vocational history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extVocationalHistoryId the primary key of the ext vocational history
	* @return the ext vocational history, or <code>null</code> if a ext vocational history with the primary key could not be found
	*/
	public ExtVocationalHistory fetchByPrimaryKey(long extVocationalHistoryId);

	@Override
	public java.util.Map<java.io.Serializable, ExtVocationalHistory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ext vocational histories.
	*
	* @return the ext vocational histories
	*/
	public java.util.List<ExtVocationalHistory> findAll();

	/**
	* Returns a range of all the ext vocational histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @return the range of ext vocational histories
	*/
	public java.util.List<ExtVocationalHistory> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ext vocational histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext vocational histories
	*/
	public java.util.List<ExtVocationalHistory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtVocationalHistory> orderByComparator);

	/**
	* Returns an ordered range of all the ext vocational histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ext vocational histories
	*/
	public java.util.List<ExtVocationalHistory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtVocationalHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ext vocational histories from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ext vocational histories.
	*
	* @return the number of ext vocational histories
	*/
	public int countAll();
}