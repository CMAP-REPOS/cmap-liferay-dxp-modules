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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import ucc.portal.model.ExtValidation;

import java.util.List;

/**
 * The persistence utility for the ext validation service. This utility wraps {@link ucc.portal.service.persistence.impl.ExtValidationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtValidationPersistence
 * @see ucc.portal.service.persistence.impl.ExtValidationPersistenceImpl
 * @generated
 */
@ProviderType
public class ExtValidationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ExtValidation extValidation) {
		getPersistence().clearCache(extValidation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ExtValidation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExtValidation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExtValidation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExtValidation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExtValidation update(ExtValidation extValidation) {
		return getPersistence().update(extValidation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExtValidation update(ExtValidation extValidation,
		ServiceContext serviceContext) {
		return getPersistence().update(extValidation, serviceContext);
	}

	/**
	* Returns all the ext validations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext validations
	*/
	public static List<ExtValidation> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

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
	public static List<ExtValidation> findByUserId(long userId, int start,
		int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

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
	public static List<ExtValidation> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtValidation> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

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
	public static List<ExtValidation> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtValidation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ext validation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext validation
	* @throws NoSuchExtValidationException if a matching ext validation could not be found
	*/
	public static ExtValidation findByUserId_First(long userId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtValidationException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first ext validation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext validation, or <code>null</code> if a matching ext validation could not be found
	*/
	public static ExtValidation fetchByUserId_First(long userId,
		OrderByComparator<ExtValidation> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last ext validation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext validation
	* @throws NoSuchExtValidationException if a matching ext validation could not be found
	*/
	public static ExtValidation findByUserId_Last(long userId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtValidationException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last ext validation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext validation, or <code>null</code> if a matching ext validation could not be found
	*/
	public static ExtValidation fetchByUserId_Last(long userId,
		OrderByComparator<ExtValidation> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the ext validations before and after the current ext validation in the ordered set where userId = &#63;.
	*
	* @param extValidationId the primary key of the current ext validation
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext validation
	* @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	*/
	public static ExtValidation[] findByUserId_PrevAndNext(
		long extValidationId, long userId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtValidationException {
		return getPersistence()
				   .findByUserId_PrevAndNext(extValidationId, userId,
			orderByComparator);
	}

	/**
	* Removes all the ext validations where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of ext validations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext validations
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the ext validations where profileFileEntryId = &#63;.
	*
	* @param profileFileEntryId the profile file entry ID
	* @return the matching ext validations
	*/
	public static List<ExtValidation> findByProfileFileEntryId(
		long profileFileEntryId) {
		return getPersistence().findByProfileFileEntryId(profileFileEntryId);
	}

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
	public static List<ExtValidation> findByProfileFileEntryId(
		long profileFileEntryId, int start, int end) {
		return getPersistence()
				   .findByProfileFileEntryId(profileFileEntryId, start, end);
	}

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
	public static List<ExtValidation> findByProfileFileEntryId(
		long profileFileEntryId, int start, int end,
		OrderByComparator<ExtValidation> orderByComparator) {
		return getPersistence()
				   .findByProfileFileEntryId(profileFileEntryId, start, end,
			orderByComparator);
	}

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
	public static List<ExtValidation> findByProfileFileEntryId(
		long profileFileEntryId, int start, int end,
		OrderByComparator<ExtValidation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByProfileFileEntryId(profileFileEntryId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first ext validation in the ordered set where profileFileEntryId = &#63;.
	*
	* @param profileFileEntryId the profile file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext validation
	* @throws NoSuchExtValidationException if a matching ext validation could not be found
	*/
	public static ExtValidation findByProfileFileEntryId_First(
		long profileFileEntryId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtValidationException {
		return getPersistence()
				   .findByProfileFileEntryId_First(profileFileEntryId,
			orderByComparator);
	}

	/**
	* Returns the first ext validation in the ordered set where profileFileEntryId = &#63;.
	*
	* @param profileFileEntryId the profile file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext validation, or <code>null</code> if a matching ext validation could not be found
	*/
	public static ExtValidation fetchByProfileFileEntryId_First(
		long profileFileEntryId,
		OrderByComparator<ExtValidation> orderByComparator) {
		return getPersistence()
				   .fetchByProfileFileEntryId_First(profileFileEntryId,
			orderByComparator);
	}

	/**
	* Returns the last ext validation in the ordered set where profileFileEntryId = &#63;.
	*
	* @param profileFileEntryId the profile file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext validation
	* @throws NoSuchExtValidationException if a matching ext validation could not be found
	*/
	public static ExtValidation findByProfileFileEntryId_Last(
		long profileFileEntryId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtValidationException {
		return getPersistence()
				   .findByProfileFileEntryId_Last(profileFileEntryId,
			orderByComparator);
	}

	/**
	* Returns the last ext validation in the ordered set where profileFileEntryId = &#63;.
	*
	* @param profileFileEntryId the profile file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext validation, or <code>null</code> if a matching ext validation could not be found
	*/
	public static ExtValidation fetchByProfileFileEntryId_Last(
		long profileFileEntryId,
		OrderByComparator<ExtValidation> orderByComparator) {
		return getPersistence()
				   .fetchByProfileFileEntryId_Last(profileFileEntryId,
			orderByComparator);
	}

	/**
	* Returns the ext validations before and after the current ext validation in the ordered set where profileFileEntryId = &#63;.
	*
	* @param extValidationId the primary key of the current ext validation
	* @param profileFileEntryId the profile file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext validation
	* @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	*/
	public static ExtValidation[] findByProfileFileEntryId_PrevAndNext(
		long extValidationId, long profileFileEntryId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtValidationException {
		return getPersistence()
				   .findByProfileFileEntryId_PrevAndNext(extValidationId,
			profileFileEntryId, orderByComparator);
	}

	/**
	* Removes all the ext validations where profileFileEntryId = &#63; from the database.
	*
	* @param profileFileEntryId the profile file entry ID
	*/
	public static void removeByProfileFileEntryId(long profileFileEntryId) {
		getPersistence().removeByProfileFileEntryId(profileFileEntryId);
	}

	/**
	* Returns the number of ext validations where profileFileEntryId = &#63;.
	*
	* @param profileFileEntryId the profile file entry ID
	* @return the number of matching ext validations
	*/
	public static int countByProfileFileEntryId(long profileFileEntryId) {
		return getPersistence().countByProfileFileEntryId(profileFileEntryId);
	}

	/**
	* Returns all the ext validations where validatorUserId = &#63;.
	*
	* @param validatorUserId the validator user ID
	* @return the matching ext validations
	*/
	public static List<ExtValidation> findByValidatorUserId(
		long validatorUserId) {
		return getPersistence().findByValidatorUserId(validatorUserId);
	}

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
	public static List<ExtValidation> findByValidatorUserId(
		long validatorUserId, int start, int end) {
		return getPersistence()
				   .findByValidatorUserId(validatorUserId, start, end);
	}

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
	public static List<ExtValidation> findByValidatorUserId(
		long validatorUserId, int start, int end,
		OrderByComparator<ExtValidation> orderByComparator) {
		return getPersistence()
				   .findByValidatorUserId(validatorUserId, start, end,
			orderByComparator);
	}

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
	public static List<ExtValidation> findByValidatorUserId(
		long validatorUserId, int start, int end,
		OrderByComparator<ExtValidation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByValidatorUserId(validatorUserId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first ext validation in the ordered set where validatorUserId = &#63;.
	*
	* @param validatorUserId the validator user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext validation
	* @throws NoSuchExtValidationException if a matching ext validation could not be found
	*/
	public static ExtValidation findByValidatorUserId_First(
		long validatorUserId, OrderByComparator<ExtValidation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtValidationException {
		return getPersistence()
				   .findByValidatorUserId_First(validatorUserId,
			orderByComparator);
	}

	/**
	* Returns the first ext validation in the ordered set where validatorUserId = &#63;.
	*
	* @param validatorUserId the validator user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext validation, or <code>null</code> if a matching ext validation could not be found
	*/
	public static ExtValidation fetchByValidatorUserId_First(
		long validatorUserId, OrderByComparator<ExtValidation> orderByComparator) {
		return getPersistence()
				   .fetchByValidatorUserId_First(validatorUserId,
			orderByComparator);
	}

	/**
	* Returns the last ext validation in the ordered set where validatorUserId = &#63;.
	*
	* @param validatorUserId the validator user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext validation
	* @throws NoSuchExtValidationException if a matching ext validation could not be found
	*/
	public static ExtValidation findByValidatorUserId_Last(
		long validatorUserId, OrderByComparator<ExtValidation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtValidationException {
		return getPersistence()
				   .findByValidatorUserId_Last(validatorUserId,
			orderByComparator);
	}

	/**
	* Returns the last ext validation in the ordered set where validatorUserId = &#63;.
	*
	* @param validatorUserId the validator user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext validation, or <code>null</code> if a matching ext validation could not be found
	*/
	public static ExtValidation fetchByValidatorUserId_Last(
		long validatorUserId, OrderByComparator<ExtValidation> orderByComparator) {
		return getPersistence()
				   .fetchByValidatorUserId_Last(validatorUserId,
			orderByComparator);
	}

	/**
	* Returns the ext validations before and after the current ext validation in the ordered set where validatorUserId = &#63;.
	*
	* @param extValidationId the primary key of the current ext validation
	* @param validatorUserId the validator user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext validation
	* @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	*/
	public static ExtValidation[] findByValidatorUserId_PrevAndNext(
		long extValidationId, long validatorUserId,
		OrderByComparator<ExtValidation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtValidationException {
		return getPersistence()
				   .findByValidatorUserId_PrevAndNext(extValidationId,
			validatorUserId, orderByComparator);
	}

	/**
	* Removes all the ext validations where validatorUserId = &#63; from the database.
	*
	* @param validatorUserId the validator user ID
	*/
	public static void removeByValidatorUserId(long validatorUserId) {
		getPersistence().removeByValidatorUserId(validatorUserId);
	}

	/**
	* Returns the number of ext validations where validatorUserId = &#63;.
	*
	* @param validatorUserId the validator user ID
	* @return the number of matching ext validations
	*/
	public static int countByValidatorUserId(long validatorUserId) {
		return getPersistence().countByValidatorUserId(validatorUserId);
	}

	/**
	* Caches the ext validation in the entity cache if it is enabled.
	*
	* @param extValidation the ext validation
	*/
	public static void cacheResult(ExtValidation extValidation) {
		getPersistence().cacheResult(extValidation);
	}

	/**
	* Caches the ext validations in the entity cache if it is enabled.
	*
	* @param extValidations the ext validations
	*/
	public static void cacheResult(List<ExtValidation> extValidations) {
		getPersistence().cacheResult(extValidations);
	}

	/**
	* Creates a new ext validation with the primary key. Does not add the ext validation to the database.
	*
	* @param extValidationId the primary key for the new ext validation
	* @return the new ext validation
	*/
	public static ExtValidation create(long extValidationId) {
		return getPersistence().create(extValidationId);
	}

	/**
	* Removes the ext validation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extValidationId the primary key of the ext validation
	* @return the ext validation that was removed
	* @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	*/
	public static ExtValidation remove(long extValidationId)
		throws ucc.portal.exception.NoSuchExtValidationException {
		return getPersistence().remove(extValidationId);
	}

	public static ExtValidation updateImpl(ExtValidation extValidation) {
		return getPersistence().updateImpl(extValidation);
	}

	/**
	* Returns the ext validation with the primary key or throws a {@link NoSuchExtValidationException} if it could not be found.
	*
	* @param extValidationId the primary key of the ext validation
	* @return the ext validation
	* @throws NoSuchExtValidationException if a ext validation with the primary key could not be found
	*/
	public static ExtValidation findByPrimaryKey(long extValidationId)
		throws ucc.portal.exception.NoSuchExtValidationException {
		return getPersistence().findByPrimaryKey(extValidationId);
	}

	/**
	* Returns the ext validation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extValidationId the primary key of the ext validation
	* @return the ext validation, or <code>null</code> if a ext validation with the primary key could not be found
	*/
	public static ExtValidation fetchByPrimaryKey(long extValidationId) {
		return getPersistence().fetchByPrimaryKey(extValidationId);
	}

	public static java.util.Map<java.io.Serializable, ExtValidation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ext validations.
	*
	* @return the ext validations
	*/
	public static List<ExtValidation> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ExtValidation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ExtValidation> findAll(int start, int end,
		OrderByComparator<ExtValidation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ExtValidation> findAll(int start, int end,
		OrderByComparator<ExtValidation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ext validations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ext validations.
	*
	* @return the number of ext validations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExtValidationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ExtValidationPersistence, ExtValidationPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ExtValidationPersistence.class);

		ServiceTracker<ExtValidationPersistence, ExtValidationPersistence> serviceTracker =
			new ServiceTracker<ExtValidationPersistence, ExtValidationPersistence>(bundle.getBundleContext(),
				ExtValidationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}