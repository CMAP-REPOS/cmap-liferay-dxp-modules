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

import ucc.portal.exception.NoSuchExtFormalEducationException;

import ucc.portal.model.ExtFormalEducation;

/**
 * The persistence interface for the ext formal education service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.ExtFormalEducationPersistenceImpl
 * @see ExtFormalEducationUtil
 * @generated
 */
@ProviderType
public interface ExtFormalEducationPersistence extends BasePersistence<ExtFormalEducation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExtFormalEducationUtil} to access the ext formal education persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ext formal educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext formal educations
	*/
	public java.util.List<ExtFormalEducation> findByUserId(long userId);

	/**
	* Returns a range of all the ext formal educations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtFormalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext formal educations
	* @param end the upper bound of the range of ext formal educations (not inclusive)
	* @return the range of matching ext formal educations
	*/
	public java.util.List<ExtFormalEducation> findByUserId(long userId,
		int start, int end);

	/**
	* Returns an ordered range of all the ext formal educations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtFormalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext formal educations
	* @param end the upper bound of the range of ext formal educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext formal educations
	*/
	public java.util.List<ExtFormalEducation> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtFormalEducation> orderByComparator);

	/**
	* Returns an ordered range of all the ext formal educations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtFormalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext formal educations
	* @param end the upper bound of the range of ext formal educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext formal educations
	*/
	public java.util.List<ExtFormalEducation> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtFormalEducation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ext formal education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext formal education
	* @throws NoSuchExtFormalEducationException if a matching ext formal education could not be found
	*/
	public ExtFormalEducation findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtFormalEducation> orderByComparator)
		throws NoSuchExtFormalEducationException;

	/**
	* Returns the first ext formal education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext formal education, or <code>null</code> if a matching ext formal education could not be found
	*/
	public ExtFormalEducation fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtFormalEducation> orderByComparator);

	/**
	* Returns the last ext formal education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext formal education
	* @throws NoSuchExtFormalEducationException if a matching ext formal education could not be found
	*/
	public ExtFormalEducation findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtFormalEducation> orderByComparator)
		throws NoSuchExtFormalEducationException;

	/**
	* Returns the last ext formal education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext formal education, or <code>null</code> if a matching ext formal education could not be found
	*/
	public ExtFormalEducation fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtFormalEducation> orderByComparator);

	/**
	* Returns the ext formal educations before and after the current ext formal education in the ordered set where userId = &#63;.
	*
	* @param extFormalEducationId the primary key of the current ext formal education
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext formal education
	* @throws NoSuchExtFormalEducationException if a ext formal education with the primary key could not be found
	*/
	public ExtFormalEducation[] findByUserId_PrevAndNext(
		long extFormalEducationId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtFormalEducation> orderByComparator)
		throws NoSuchExtFormalEducationException;

	/**
	* Removes all the ext formal educations where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of ext formal educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext formal educations
	*/
	public int countByUserId(long userId);

	/**
	* Caches the ext formal education in the entity cache if it is enabled.
	*
	* @param extFormalEducation the ext formal education
	*/
	public void cacheResult(ExtFormalEducation extFormalEducation);

	/**
	* Caches the ext formal educations in the entity cache if it is enabled.
	*
	* @param extFormalEducations the ext formal educations
	*/
	public void cacheResult(
		java.util.List<ExtFormalEducation> extFormalEducations);

	/**
	* Creates a new ext formal education with the primary key. Does not add the ext formal education to the database.
	*
	* @param extFormalEducationId the primary key for the new ext formal education
	* @return the new ext formal education
	*/
	public ExtFormalEducation create(long extFormalEducationId);

	/**
	* Removes the ext formal education with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extFormalEducationId the primary key of the ext formal education
	* @return the ext formal education that was removed
	* @throws NoSuchExtFormalEducationException if a ext formal education with the primary key could not be found
	*/
	public ExtFormalEducation remove(long extFormalEducationId)
		throws NoSuchExtFormalEducationException;

	public ExtFormalEducation updateImpl(ExtFormalEducation extFormalEducation);

	/**
	* Returns the ext formal education with the primary key or throws a {@link NoSuchExtFormalEducationException} if it could not be found.
	*
	* @param extFormalEducationId the primary key of the ext formal education
	* @return the ext formal education
	* @throws NoSuchExtFormalEducationException if a ext formal education with the primary key could not be found
	*/
	public ExtFormalEducation findByPrimaryKey(long extFormalEducationId)
		throws NoSuchExtFormalEducationException;

	/**
	* Returns the ext formal education with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extFormalEducationId the primary key of the ext formal education
	* @return the ext formal education, or <code>null</code> if a ext formal education with the primary key could not be found
	*/
	public ExtFormalEducation fetchByPrimaryKey(long extFormalEducationId);

	@Override
	public java.util.Map<java.io.Serializable, ExtFormalEducation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ext formal educations.
	*
	* @return the ext formal educations
	*/
	public java.util.List<ExtFormalEducation> findAll();

	/**
	* Returns a range of all the ext formal educations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtFormalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext formal educations
	* @param end the upper bound of the range of ext formal educations (not inclusive)
	* @return the range of ext formal educations
	*/
	public java.util.List<ExtFormalEducation> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ext formal educations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtFormalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext formal educations
	* @param end the upper bound of the range of ext formal educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext formal educations
	*/
	public java.util.List<ExtFormalEducation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtFormalEducation> orderByComparator);

	/**
	* Returns an ordered range of all the ext formal educations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtFormalEducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext formal educations
	* @param end the upper bound of the range of ext formal educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ext formal educations
	*/
	public java.util.List<ExtFormalEducation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtFormalEducation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ext formal educations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ext formal educations.
	*
	* @return the number of ext formal educations
	*/
	public int countAll();
}