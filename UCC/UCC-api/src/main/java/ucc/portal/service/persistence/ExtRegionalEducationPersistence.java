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

import ucc.portal.exception.NoSuchExtRegionalEducationException;

import ucc.portal.model.ExtRegionalEducation;

/**
 * The persistence interface for the ext regional education service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.ExtRegionalEducationPersistenceImpl
 * @see ExtRegionalEducationUtil
 * @generated
 */
@ProviderType
public interface ExtRegionalEducationPersistence extends BasePersistence<ExtRegionalEducation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExtRegionalEducationUtil} to access the ext regional education persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ext regional educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext regional educations
	*/
	public java.util.List<ExtRegionalEducation> findByUserId(long userId);

	/**
	* Returns a range of all the ext regional educations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtRegionalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext regional educations
	* @param end the upper bound of the range of ext regional educations (not inclusive)
	* @return the range of matching ext regional educations
	*/
	public java.util.List<ExtRegionalEducation> findByUserId(long userId,
		int start, int end);

	/**
	* Returns an ordered range of all the ext regional educations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtRegionalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext regional educations
	* @param end the upper bound of the range of ext regional educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext regional educations
	*/
	public java.util.List<ExtRegionalEducation> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtRegionalEducation> orderByComparator);

	/**
	* Returns an ordered range of all the ext regional educations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtRegionalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext regional educations
	* @param end the upper bound of the range of ext regional educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext regional educations
	*/
	public java.util.List<ExtRegionalEducation> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtRegionalEducation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ext regional education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext regional education
	* @throws NoSuchExtRegionalEducationException if a matching ext regional education could not be found
	*/
	public ExtRegionalEducation findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtRegionalEducation> orderByComparator)
		throws NoSuchExtRegionalEducationException;

	/**
	* Returns the first ext regional education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext regional education, or <code>null</code> if a matching ext regional education could not be found
	*/
	public ExtRegionalEducation fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtRegionalEducation> orderByComparator);

	/**
	* Returns the last ext regional education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext regional education
	* @throws NoSuchExtRegionalEducationException if a matching ext regional education could not be found
	*/
	public ExtRegionalEducation findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtRegionalEducation> orderByComparator)
		throws NoSuchExtRegionalEducationException;

	/**
	* Returns the last ext regional education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext regional education, or <code>null</code> if a matching ext regional education could not be found
	*/
	public ExtRegionalEducation fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtRegionalEducation> orderByComparator);

	/**
	* Returns the ext regional educations before and after the current ext regional education in the ordered set where userId = &#63;.
	*
	* @param extRegionalEducationId the primary key of the current ext regional education
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext regional education
	* @throws NoSuchExtRegionalEducationException if a ext regional education with the primary key could not be found
	*/
	public ExtRegionalEducation[] findByUserId_PrevAndNext(
		long extRegionalEducationId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtRegionalEducation> orderByComparator)
		throws NoSuchExtRegionalEducationException;

	/**
	* Removes all the ext regional educations where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of ext regional educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext regional educations
	*/
	public int countByUserId(long userId);

	/**
	* Caches the ext regional education in the entity cache if it is enabled.
	*
	* @param extRegionalEducation the ext regional education
	*/
	public void cacheResult(ExtRegionalEducation extRegionalEducation);

	/**
	* Caches the ext regional educations in the entity cache if it is enabled.
	*
	* @param extRegionalEducations the ext regional educations
	*/
	public void cacheResult(
		java.util.List<ExtRegionalEducation> extRegionalEducations);

	/**
	* Creates a new ext regional education with the primary key. Does not add the ext regional education to the database.
	*
	* @param extRegionalEducationId the primary key for the new ext regional education
	* @return the new ext regional education
	*/
	public ExtRegionalEducation create(long extRegionalEducationId);

	/**
	* Removes the ext regional education with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extRegionalEducationId the primary key of the ext regional education
	* @return the ext regional education that was removed
	* @throws NoSuchExtRegionalEducationException if a ext regional education with the primary key could not be found
	*/
	public ExtRegionalEducation remove(long extRegionalEducationId)
		throws NoSuchExtRegionalEducationException;

	public ExtRegionalEducation updateImpl(
		ExtRegionalEducation extRegionalEducation);

	/**
	* Returns the ext regional education with the primary key or throws a {@link NoSuchExtRegionalEducationException} if it could not be found.
	*
	* @param extRegionalEducationId the primary key of the ext regional education
	* @return the ext regional education
	* @throws NoSuchExtRegionalEducationException if a ext regional education with the primary key could not be found
	*/
	public ExtRegionalEducation findByPrimaryKey(long extRegionalEducationId)
		throws NoSuchExtRegionalEducationException;

	/**
	* Returns the ext regional education with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extRegionalEducationId the primary key of the ext regional education
	* @return the ext regional education, or <code>null</code> if a ext regional education with the primary key could not be found
	*/
	public ExtRegionalEducation fetchByPrimaryKey(long extRegionalEducationId);

	@Override
	public java.util.Map<java.io.Serializable, ExtRegionalEducation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ext regional educations.
	*
	* @return the ext regional educations
	*/
	public java.util.List<ExtRegionalEducation> findAll();

	/**
	* Returns a range of all the ext regional educations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtRegionalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext regional educations
	* @param end the upper bound of the range of ext regional educations (not inclusive)
	* @return the range of ext regional educations
	*/
	public java.util.List<ExtRegionalEducation> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ext regional educations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtRegionalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext regional educations
	* @param end the upper bound of the range of ext regional educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext regional educations
	*/
	public java.util.List<ExtRegionalEducation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtRegionalEducation> orderByComparator);

	/**
	* Returns an ordered range of all the ext regional educations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtRegionalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext regional educations
	* @param end the upper bound of the range of ext regional educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ext regional educations
	*/
	public java.util.List<ExtRegionalEducation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtRegionalEducation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ext regional educations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ext regional educations.
	*
	* @return the number of ext regional educations
	*/
	public int countAll();
}