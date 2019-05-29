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

import ucc.portal.exception.NoSuchExtReferenceException;

import ucc.portal.model.ExtReference;

/**
 * The persistence interface for the ext reference service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.ExtReferencePersistenceImpl
 * @see ExtReferenceUtil
 * @generated
 */
@ProviderType
public interface ExtReferencePersistence extends BasePersistence<ExtReference> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExtReferenceUtil} to access the ext reference persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ext references where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext references
	*/
	public java.util.List<ExtReference> findByUserId(long userId);

	/**
	* Returns a range of all the ext references where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext references
	* @param end the upper bound of the range of ext references (not inclusive)
	* @return the range of matching ext references
	*/
	public java.util.List<ExtReference> findByUserId(long userId, int start,
		int end);

	/**
	* Returns an ordered range of all the ext references where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext references
	* @param end the upper bound of the range of ext references (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext references
	*/
	public java.util.List<ExtReference> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator);

	/**
	* Returns an ordered range of all the ext references where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext references
	* @param end the upper bound of the range of ext references (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext references
	*/
	public java.util.List<ExtReference> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ext reference in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext reference
	* @throws NoSuchExtReferenceException if a matching ext reference could not be found
	*/
	public ExtReference findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator)
		throws NoSuchExtReferenceException;

	/**
	* Returns the first ext reference in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext reference, or <code>null</code> if a matching ext reference could not be found
	*/
	public ExtReference fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator);

	/**
	* Returns the last ext reference in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext reference
	* @throws NoSuchExtReferenceException if a matching ext reference could not be found
	*/
	public ExtReference findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator)
		throws NoSuchExtReferenceException;

	/**
	* Returns the last ext reference in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext reference, or <code>null</code> if a matching ext reference could not be found
	*/
	public ExtReference fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator);

	/**
	* Returns the ext references before and after the current ext reference in the ordered set where userId = &#63;.
	*
	* @param extReferenceId the primary key of the current ext reference
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext reference
	* @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	*/
	public ExtReference[] findByUserId_PrevAndNext(long extReferenceId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator)
		throws NoSuchExtReferenceException;

	/**
	* Removes all the ext references where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of ext references where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext references
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the ext references where referenceUserId = &#63;.
	*
	* @param referenceUserId the reference user ID
	* @return the matching ext references
	*/
	public java.util.List<ExtReference> findByReferenceUserId(
		long referenceUserId);

	/**
	* Returns a range of all the ext references where referenceUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUserId the reference user ID
	* @param start the lower bound of the range of ext references
	* @param end the upper bound of the range of ext references (not inclusive)
	* @return the range of matching ext references
	*/
	public java.util.List<ExtReference> findByReferenceUserId(
		long referenceUserId, int start, int end);

	/**
	* Returns an ordered range of all the ext references where referenceUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUserId the reference user ID
	* @param start the lower bound of the range of ext references
	* @param end the upper bound of the range of ext references (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext references
	*/
	public java.util.List<ExtReference> findByReferenceUserId(
		long referenceUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator);

	/**
	* Returns an ordered range of all the ext references where referenceUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUserId the reference user ID
	* @param start the lower bound of the range of ext references
	* @param end the upper bound of the range of ext references (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext references
	*/
	public java.util.List<ExtReference> findByReferenceUserId(
		long referenceUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ext reference in the ordered set where referenceUserId = &#63;.
	*
	* @param referenceUserId the reference user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext reference
	* @throws NoSuchExtReferenceException if a matching ext reference could not be found
	*/
	public ExtReference findByReferenceUserId_First(long referenceUserId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator)
		throws NoSuchExtReferenceException;

	/**
	* Returns the first ext reference in the ordered set where referenceUserId = &#63;.
	*
	* @param referenceUserId the reference user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext reference, or <code>null</code> if a matching ext reference could not be found
	*/
	public ExtReference fetchByReferenceUserId_First(long referenceUserId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator);

	/**
	* Returns the last ext reference in the ordered set where referenceUserId = &#63;.
	*
	* @param referenceUserId the reference user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext reference
	* @throws NoSuchExtReferenceException if a matching ext reference could not be found
	*/
	public ExtReference findByReferenceUserId_Last(long referenceUserId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator)
		throws NoSuchExtReferenceException;

	/**
	* Returns the last ext reference in the ordered set where referenceUserId = &#63;.
	*
	* @param referenceUserId the reference user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext reference, or <code>null</code> if a matching ext reference could not be found
	*/
	public ExtReference fetchByReferenceUserId_Last(long referenceUserId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator);

	/**
	* Returns the ext references before and after the current ext reference in the ordered set where referenceUserId = &#63;.
	*
	* @param extReferenceId the primary key of the current ext reference
	* @param referenceUserId the reference user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext reference
	* @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	*/
	public ExtReference[] findByReferenceUserId_PrevAndNext(
		long extReferenceId, long referenceUserId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator)
		throws NoSuchExtReferenceException;

	/**
	* Removes all the ext references where referenceUserId = &#63; from the database.
	*
	* @param referenceUserId the reference user ID
	*/
	public void removeByReferenceUserId(long referenceUserId);

	/**
	* Returns the number of ext references where referenceUserId = &#63;.
	*
	* @param referenceUserId the reference user ID
	* @return the number of matching ext references
	*/
	public int countByReferenceUserId(long referenceUserId);

	/**
	* Caches the ext reference in the entity cache if it is enabled.
	*
	* @param extReference the ext reference
	*/
	public void cacheResult(ExtReference extReference);

	/**
	* Caches the ext references in the entity cache if it is enabled.
	*
	* @param extReferences the ext references
	*/
	public void cacheResult(java.util.List<ExtReference> extReferences);

	/**
	* Creates a new ext reference with the primary key. Does not add the ext reference to the database.
	*
	* @param extReferenceId the primary key for the new ext reference
	* @return the new ext reference
	*/
	public ExtReference create(long extReferenceId);

	/**
	* Removes the ext reference with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extReferenceId the primary key of the ext reference
	* @return the ext reference that was removed
	* @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	*/
	public ExtReference remove(long extReferenceId)
		throws NoSuchExtReferenceException;

	public ExtReference updateImpl(ExtReference extReference);

	/**
	* Returns the ext reference with the primary key or throws a {@link NoSuchExtReferenceException} if it could not be found.
	*
	* @param extReferenceId the primary key of the ext reference
	* @return the ext reference
	* @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	*/
	public ExtReference findByPrimaryKey(long extReferenceId)
		throws NoSuchExtReferenceException;

	/**
	* Returns the ext reference with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extReferenceId the primary key of the ext reference
	* @return the ext reference, or <code>null</code> if a ext reference with the primary key could not be found
	*/
	public ExtReference fetchByPrimaryKey(long extReferenceId);

	@Override
	public java.util.Map<java.io.Serializable, ExtReference> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ext references.
	*
	* @return the ext references
	*/
	public java.util.List<ExtReference> findAll();

	/**
	* Returns a range of all the ext references.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext references
	* @param end the upper bound of the range of ext references (not inclusive)
	* @return the range of ext references
	*/
	public java.util.List<ExtReference> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ext references.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext references
	* @param end the upper bound of the range of ext references (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext references
	*/
	public java.util.List<ExtReference> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator);

	/**
	* Returns an ordered range of all the ext references.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext references
	* @param end the upper bound of the range of ext references (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ext references
	*/
	public java.util.List<ExtReference> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtReference> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ext references from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ext references.
	*
	* @return the number of ext references
	*/
	public int countAll();
}