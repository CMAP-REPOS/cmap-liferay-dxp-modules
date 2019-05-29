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

import ucc.portal.exception.NoSuchExtValidationException;

import ucc.portal.model.ExtValidation;

/**
 * The persistence interface for the ext validation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.ExtValidationPersistenceImpl
 * @see ExtValidationUtil
 * @generated
 */
@ProviderType
public interface ExtValidationPersistence extends BasePersistence<ExtValidation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExtValidationUtil} to access the ext validation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ext validations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext validations
	*/
	public java.util.List<ExtValidation> findByUserId(long userId);

	/**
	* Returns a range of all the ext validations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @return the range of matching ext validations
	*/
	public java.util.List<ExtValidation> findByUserId(long userId, int start,
		int end);

	/**
	* Returns an ordered range of all the ext validations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext validations
	*/
	public java.util.List<ExtValidation> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator);

	/**
	* Returns an ordered range of all the ext validations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext validations
	*/
	public java.util.List<ExtValidation> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ext validation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext validation
	* @throws NoSuchExtValidationException if a matching ext validation could not be found
	*/
	public ExtValidation findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException;

	/**
	* Returns the first ext validation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext validation, or <code>null</code> if a matching ext validation could not be found
	*/
	public ExtValidation fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator);

	/**
	* Returns the last ext validation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext validation
	* @throws NoSuchExtValidationException if a matching ext validation could not be found
	*/
	public ExtValidation findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException;

	/**
	* Returns the last ext validation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext validation, or <code>null</code> if a matching ext validation could not be found
	*/
	public ExtValidation fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator);

	/**
	* Returns the ext validations before and after the current ext validation in the ordered set where userId = &#63;.
	*
	* @param extValidationId the primary key of the current ext validation
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext validation
	* @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	*/
	public ExtValidation[] findByUserId_PrevAndNext(long extValidationId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException;

	/**
	* Removes all the ext validations where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of ext validations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext validations
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the ext validations where profileFileEntryId = &#63;.
	*
	* @param profileFileEntryId the profile file entry ID
	* @return the matching ext validations
	*/
	public java.util.List<ExtValidation> findByProfileFileEntryId(
		long profileFileEntryId);

	/**
	* Returns a range of all the ext validations where profileFileEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param profileFileEntryId the profile file entry ID
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @return the range of matching ext validations
	*/
	public java.util.List<ExtValidation> findByProfileFileEntryId(
		long profileFileEntryId, int start, int end);

	/**
	* Returns an ordered range of all the ext validations where profileFileEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param profileFileEntryId the profile file entry ID
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext validations
	*/
	public java.util.List<ExtValidation> findByProfileFileEntryId(
		long profileFileEntryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator);

	/**
	* Returns an ordered range of all the ext validations where profileFileEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param profileFileEntryId the profile file entry ID
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext validations
	*/
	public java.util.List<ExtValidation> findByProfileFileEntryId(
		long profileFileEntryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ext validation in the ordered set where profileFileEntryId = &#63;.
	*
	* @param profileFileEntryId the profile file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext validation
	* @throws NoSuchExtValidationException if a matching ext validation could not be found
	*/
	public ExtValidation findByProfileFileEntryId_First(
		long profileFileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException;

	/**
	* Returns the first ext validation in the ordered set where profileFileEntryId = &#63;.
	*
	* @param profileFileEntryId the profile file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext validation, or <code>null</code> if a matching ext validation could not be found
	*/
	public ExtValidation fetchByProfileFileEntryId_First(
		long profileFileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator);

	/**
	* Returns the last ext validation in the ordered set where profileFileEntryId = &#63;.
	*
	* @param profileFileEntryId the profile file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext validation
	* @throws NoSuchExtValidationException if a matching ext validation could not be found
	*/
	public ExtValidation findByProfileFileEntryId_Last(
		long profileFileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException;

	/**
	* Returns the last ext validation in the ordered set where profileFileEntryId = &#63;.
	*
	* @param profileFileEntryId the profile file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext validation, or <code>null</code> if a matching ext validation could not be found
	*/
	public ExtValidation fetchByProfileFileEntryId_Last(
		long profileFileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator);

	/**
	* Returns the ext validations before and after the current ext validation in the ordered set where profileFileEntryId = &#63;.
	*
	* @param extValidationId the primary key of the current ext validation
	* @param profileFileEntryId the profile file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext validation
	* @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	*/
	public ExtValidation[] findByProfileFileEntryId_PrevAndNext(
		long extValidationId, long profileFileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException;

	/**
	* Removes all the ext validations where profileFileEntryId = &#63; from the database.
	*
	* @param profileFileEntryId the profile file entry ID
	*/
	public void removeByProfileFileEntryId(long profileFileEntryId);

	/**
	* Returns the number of ext validations where profileFileEntryId = &#63;.
	*
	* @param profileFileEntryId the profile file entry ID
	* @return the number of matching ext validations
	*/
	public int countByProfileFileEntryId(long profileFileEntryId);

	/**
	* Returns all the ext validations where validatorUserId = &#63;.
	*
	* @param validatorUserId the validator user ID
	* @return the matching ext validations
	*/
	public java.util.List<ExtValidation> findByValidatorUserId(
		long validatorUserId);

	/**
	* Returns a range of all the ext validations where validatorUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param validatorUserId the validator user ID
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @return the range of matching ext validations
	*/
	public java.util.List<ExtValidation> findByValidatorUserId(
		long validatorUserId, int start, int end);

	/**
	* Returns an ordered range of all the ext validations where validatorUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param validatorUserId the validator user ID
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext validations
	*/
	public java.util.List<ExtValidation> findByValidatorUserId(
		long validatorUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator);

	/**
	* Returns an ordered range of all the ext validations where validatorUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param validatorUserId the validator user ID
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext validations
	*/
	public java.util.List<ExtValidation> findByValidatorUserId(
		long validatorUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ext validation in the ordered set where validatorUserId = &#63;.
	*
	* @param validatorUserId the validator user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext validation
	* @throws NoSuchExtValidationException if a matching ext validation could not be found
	*/
	public ExtValidation findByValidatorUserId_First(long validatorUserId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException;

	/**
	* Returns the first ext validation in the ordered set where validatorUserId = &#63;.
	*
	* @param validatorUserId the validator user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext validation, or <code>null</code> if a matching ext validation could not be found
	*/
	public ExtValidation fetchByValidatorUserId_First(long validatorUserId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator);

	/**
	* Returns the last ext validation in the ordered set where validatorUserId = &#63;.
	*
	* @param validatorUserId the validator user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext validation
	* @throws NoSuchExtValidationException if a matching ext validation could not be found
	*/
	public ExtValidation findByValidatorUserId_Last(long validatorUserId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException;

	/**
	* Returns the last ext validation in the ordered set where validatorUserId = &#63;.
	*
	* @param validatorUserId the validator user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext validation, or <code>null</code> if a matching ext validation could not be found
	*/
	public ExtValidation fetchByValidatorUserId_Last(long validatorUserId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator);

	/**
	* Returns the ext validations before and after the current ext validation in the ordered set where validatorUserId = &#63;.
	*
	* @param extValidationId the primary key of the current ext validation
	* @param validatorUserId the validator user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext validation
	* @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	*/
	public ExtValidation[] findByValidatorUserId_PrevAndNext(
		long extValidationId, long validatorUserId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator)
		throws NoSuchExtValidationException;

	/**
	* Removes all the ext validations where validatorUserId = &#63; from the database.
	*
	* @param validatorUserId the validator user ID
	*/
	public void removeByValidatorUserId(long validatorUserId);

	/**
	* Returns the number of ext validations where validatorUserId = &#63;.
	*
	* @param validatorUserId the validator user ID
	* @return the number of matching ext validations
	*/
	public int countByValidatorUserId(long validatorUserId);

	/**
	* Caches the ext validation in the entity cache if it is enabled.
	*
	* @param extValidation the ext validation
	*/
	public void cacheResult(ExtValidation extValidation);

	/**
	* Caches the ext validations in the entity cache if it is enabled.
	*
	* @param extValidations the ext validations
	*/
	public void cacheResult(java.util.List<ExtValidation> extValidations);

	/**
	* Creates a new ext validation with the primary key. Does not add the ext validation to the database.
	*
	* @param extValidationId the primary key for the new ext validation
	* @return the new ext validation
	*/
	public ExtValidation create(long extValidationId);

	/**
	* Removes the ext validation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extValidationId the primary key of the ext validation
	* @return the ext validation that was removed
	* @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	*/
	public ExtValidation remove(long extValidationId)
		throws NoSuchExtValidationException;

	public ExtValidation updateImpl(ExtValidation extValidation);

	/**
	* Returns the ext validation with the primary key or throws a {@link NoSuchExtValidationException} if it could not be found.
	*
	* @param extValidationId the primary key of the ext validation
	* @return the ext validation
	* @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	*/
	public ExtValidation findByPrimaryKey(long extValidationId)
		throws NoSuchExtValidationException;

	/**
	* Returns the ext validation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extValidationId the primary key of the ext validation
	* @return the ext validation, or <code>null</code> if a ext validation with the primary key could not be found
	*/
	public ExtValidation fetchByPrimaryKey(long extValidationId);

	@Override
	public java.util.Map<java.io.Serializable, ExtValidation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ext validations.
	*
	* @return the ext validations
	*/
	public java.util.List<ExtValidation> findAll();

	/**
	* Returns a range of all the ext validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @return the range of ext validations
	*/
	public java.util.List<ExtValidation> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ext validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext validations
	*/
	public java.util.List<ExtValidation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator);

	/**
	* Returns an ordered range of all the ext validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ext validations
	*/
	public java.util.List<ExtValidation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtValidation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ext validations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ext validations.
	*
	* @return the number of ext validations
	*/
	public int countAll();
}