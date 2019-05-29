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

import ucc.portal.exception.NoSuchExtContinuingEducationException;

import ucc.portal.model.ExtContinuingEducation;

/**
 * The persistence interface for the ext continuing education service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.ExtContinuingEducationPersistenceImpl
 * @see ExtContinuingEducationUtil
 * @generated
 */
@ProviderType
public interface ExtContinuingEducationPersistence extends BasePersistence<ExtContinuingEducation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExtContinuingEducationUtil} to access the ext continuing education persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ext continuing educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext continuing educations
	*/
	public java.util.List<ExtContinuingEducation> findByUserId(long userId);

	/**
	* Returns a range of all the ext continuing educations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtContinuingEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext continuing educations
	* @param end the upper bound of the range of ext continuing educations (not inclusive)
	* @return the range of matching ext continuing educations
	*/
	public java.util.List<ExtContinuingEducation> findByUserId(long userId,
		int start, int end);

	/**
	* Returns an ordered range of all the ext continuing educations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtContinuingEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext continuing educations
	* @param end the upper bound of the range of ext continuing educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext continuing educations
	*/
	public java.util.List<ExtContinuingEducation> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtContinuingEducation> orderByComparator);

	/**
	* Returns an ordered range of all the ext continuing educations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtContinuingEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext continuing educations
	* @param end the upper bound of the range of ext continuing educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext continuing educations
	*/
	public java.util.List<ExtContinuingEducation> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtContinuingEducation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ext continuing education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext continuing education
	* @throws NoSuchExtContinuingEducationException if a matching ext continuing education could not be found
	*/
	public ExtContinuingEducation findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtContinuingEducation> orderByComparator)
		throws NoSuchExtContinuingEducationException;

	/**
	* Returns the first ext continuing education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext continuing education, or <code>null</code> if a matching ext continuing education could not be found
	*/
	public ExtContinuingEducation fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtContinuingEducation> orderByComparator);

	/**
	* Returns the last ext continuing education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext continuing education
	* @throws NoSuchExtContinuingEducationException if a matching ext continuing education could not be found
	*/
	public ExtContinuingEducation findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtContinuingEducation> orderByComparator)
		throws NoSuchExtContinuingEducationException;

	/**
	* Returns the last ext continuing education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext continuing education, or <code>null</code> if a matching ext continuing education could not be found
	*/
	public ExtContinuingEducation fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtContinuingEducation> orderByComparator);

	/**
	* Returns the ext continuing educations before and after the current ext continuing education in the ordered set where userId = &#63;.
	*
	* @param extContinuingEducationId the primary key of the current ext continuing education
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext continuing education
	* @throws NoSuchExtContinuingEducationException if a ext continuing education with the primary key could not be found
	*/
	public ExtContinuingEducation[] findByUserId_PrevAndNext(
		long extContinuingEducationId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtContinuingEducation> orderByComparator)
		throws NoSuchExtContinuingEducationException;

	/**
	* Removes all the ext continuing educations where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of ext continuing educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext continuing educations
	*/
	public int countByUserId(long userId);

	/**
	* Caches the ext continuing education in the entity cache if it is enabled.
	*
	* @param extContinuingEducation the ext continuing education
	*/
	public void cacheResult(ExtContinuingEducation extContinuingEducation);

	/**
	* Caches the ext continuing educations in the entity cache if it is enabled.
	*
	* @param extContinuingEducations the ext continuing educations
	*/
	public void cacheResult(
		java.util.List<ExtContinuingEducation> extContinuingEducations);

	/**
	* Creates a new ext continuing education with the primary key. Does not add the ext continuing education to the database.
	*
	* @param extContinuingEducationId the primary key for the new ext continuing education
	* @return the new ext continuing education
	*/
	public ExtContinuingEducation create(long extContinuingEducationId);

	/**
	* Removes the ext continuing education with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extContinuingEducationId the primary key of the ext continuing education
	* @return the ext continuing education that was removed
	* @throws NoSuchExtContinuingEducationException if a ext continuing education with the primary key could not be found
	*/
	public ExtContinuingEducation remove(long extContinuingEducationId)
		throws NoSuchExtContinuingEducationException;

	public ExtContinuingEducation updateImpl(
		ExtContinuingEducation extContinuingEducation);

	/**
	* Returns the ext continuing education with the primary key or throws a {@link NoSuchExtContinuingEducationException} if it could not be found.
	*
	* @param extContinuingEducationId the primary key of the ext continuing education
	* @return the ext continuing education
	* @throws NoSuchExtContinuingEducationException if a ext continuing education with the primary key could not be found
	*/
	public ExtContinuingEducation findByPrimaryKey(
		long extContinuingEducationId)
		throws NoSuchExtContinuingEducationException;

	/**
	* Returns the ext continuing education with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extContinuingEducationId the primary key of the ext continuing education
	* @return the ext continuing education, or <code>null</code> if a ext continuing education with the primary key could not be found
	*/
	public ExtContinuingEducation fetchByPrimaryKey(
		long extContinuingEducationId);

	@Override
	public java.util.Map<java.io.Serializable, ExtContinuingEducation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ext continuing educations.
	*
	* @return the ext continuing educations
	*/
	public java.util.List<ExtContinuingEducation> findAll();

	/**
	* Returns a range of all the ext continuing educations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtContinuingEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext continuing educations
	* @param end the upper bound of the range of ext continuing educations (not inclusive)
	* @return the range of ext continuing educations
	*/
	public java.util.List<ExtContinuingEducation> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ext continuing educations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtContinuingEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext continuing educations
	* @param end the upper bound of the range of ext continuing educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext continuing educations
	*/
	public java.util.List<ExtContinuingEducation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtContinuingEducation> orderByComparator);

	/**
	* Returns an ordered range of all the ext continuing educations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtContinuingEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext continuing educations
	* @param end the upper bound of the range of ext continuing educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ext continuing educations
	*/
	public java.util.List<ExtContinuingEducation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtContinuingEducation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ext continuing educations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ext continuing educations.
	*
	* @return the number of ext continuing educations
	*/
	public int countAll();
}