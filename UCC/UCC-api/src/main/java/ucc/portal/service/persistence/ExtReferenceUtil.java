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

import ucc.portal.model.ExtReference;

import java.util.List;

/**
 * The persistence utility for the ext reference service. This utility wraps {@link ucc.portal.service.persistence.impl.ExtReferencePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtReferencePersistence
 * @see ucc.portal.service.persistence.impl.ExtReferencePersistenceImpl
 * @generated
 */
@ProviderType
public class ExtReferenceUtil {
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
	public static void clearCache(ExtReference extReference) {
		getPersistence().clearCache(extReference);
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
	public static List<ExtReference> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExtReference> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExtReference> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExtReference> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExtReference update(ExtReference extReference) {
		return getPersistence().update(extReference);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExtReference update(ExtReference extReference,
		ServiceContext serviceContext) {
		return getPersistence().update(extReference, serviceContext);
	}

	/**
	* Returns all the ext references where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext references
	*/
	public static List<ExtReference> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

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
	public static List<ExtReference> findByUserId(long userId, int start,
		int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

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
	public static List<ExtReference> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtReference> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

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
	public static List<ExtReference> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtReference> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ext reference in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext reference
	* @throws NoSuchExtReferenceException if a matching ext reference could not be found
	*/
	public static ExtReference findByUserId_First(long userId,
		OrderByComparator<ExtReference> orderByComparator)
		throws ucc.portal.exception.NoSuchExtReferenceException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first ext reference in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext reference, or <code>null</code> if a matching ext reference could not be found
	*/
	public static ExtReference fetchByUserId_First(long userId,
		OrderByComparator<ExtReference> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last ext reference in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext reference
	* @throws NoSuchExtReferenceException if a matching ext reference could not be found
	*/
	public static ExtReference findByUserId_Last(long userId,
		OrderByComparator<ExtReference> orderByComparator)
		throws ucc.portal.exception.NoSuchExtReferenceException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last ext reference in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext reference, or <code>null</code> if a matching ext reference could not be found
	*/
	public static ExtReference fetchByUserId_Last(long userId,
		OrderByComparator<ExtReference> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the ext references before and after the current ext reference in the ordered set where userId = &#63;.
	*
	* @param extReferenceId the primary key of the current ext reference
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext reference
	* @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	*/
	public static ExtReference[] findByUserId_PrevAndNext(long extReferenceId,
		long userId, OrderByComparator<ExtReference> orderByComparator)
		throws ucc.portal.exception.NoSuchExtReferenceException {
		return getPersistence()
				   .findByUserId_PrevAndNext(extReferenceId, userId,
			orderByComparator);
	}

	/**
	* Removes all the ext references where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of ext references where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext references
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the ext references where referenceUserId = &#63;.
	*
	* @param referenceUserId the reference user ID
	* @return the matching ext references
	*/
	public static List<ExtReference> findByReferenceUserId(long referenceUserId) {
		return getPersistence().findByReferenceUserId(referenceUserId);
	}

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
	public static List<ExtReference> findByReferenceUserId(
		long referenceUserId, int start, int end) {
		return getPersistence()
				   .findByReferenceUserId(referenceUserId, start, end);
	}

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
	public static List<ExtReference> findByReferenceUserId(
		long referenceUserId, int start, int end,
		OrderByComparator<ExtReference> orderByComparator) {
		return getPersistence()
				   .findByReferenceUserId(referenceUserId, start, end,
			orderByComparator);
	}

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
	public static List<ExtReference> findByReferenceUserId(
		long referenceUserId, int start, int end,
		OrderByComparator<ExtReference> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByReferenceUserId(referenceUserId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first ext reference in the ordered set where referenceUserId = &#63;.
	*
	* @param referenceUserId the reference user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext reference
	* @throws NoSuchExtReferenceException if a matching ext reference could not be found
	*/
	public static ExtReference findByReferenceUserId_First(
		long referenceUserId, OrderByComparator<ExtReference> orderByComparator)
		throws ucc.portal.exception.NoSuchExtReferenceException {
		return getPersistence()
				   .findByReferenceUserId_First(referenceUserId,
			orderByComparator);
	}

	/**
	* Returns the first ext reference in the ordered set where referenceUserId = &#63;.
	*
	* @param referenceUserId the reference user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext reference, or <code>null</code> if a matching ext reference could not be found
	*/
	public static ExtReference fetchByReferenceUserId_First(
		long referenceUserId, OrderByComparator<ExtReference> orderByComparator) {
		return getPersistence()
				   .fetchByReferenceUserId_First(referenceUserId,
			orderByComparator);
	}

	/**
	* Returns the last ext reference in the ordered set where referenceUserId = &#63;.
	*
	* @param referenceUserId the reference user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext reference
	* @throws NoSuchExtReferenceException if a matching ext reference could not be found
	*/
	public static ExtReference findByReferenceUserId_Last(
		long referenceUserId, OrderByComparator<ExtReference> orderByComparator)
		throws ucc.portal.exception.NoSuchExtReferenceException {
		return getPersistence()
				   .findByReferenceUserId_Last(referenceUserId,
			orderByComparator);
	}

	/**
	* Returns the last ext reference in the ordered set where referenceUserId = &#63;.
	*
	* @param referenceUserId the reference user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext reference, or <code>null</code> if a matching ext reference could not be found
	*/
	public static ExtReference fetchByReferenceUserId_Last(
		long referenceUserId, OrderByComparator<ExtReference> orderByComparator) {
		return getPersistence()
				   .fetchByReferenceUserId_Last(referenceUserId,
			orderByComparator);
	}

	/**
	* Returns the ext references before and after the current ext reference in the ordered set where referenceUserId = &#63;.
	*
	* @param extReferenceId the primary key of the current ext reference
	* @param referenceUserId the reference user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext reference
	* @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	*/
	public static ExtReference[] findByReferenceUserId_PrevAndNext(
		long extReferenceId, long referenceUserId,
		OrderByComparator<ExtReference> orderByComparator)
		throws ucc.portal.exception.NoSuchExtReferenceException {
		return getPersistence()
				   .findByReferenceUserId_PrevAndNext(extReferenceId,
			referenceUserId, orderByComparator);
	}

	/**
	* Removes all the ext references where referenceUserId = &#63; from the database.
	*
	* @param referenceUserId the reference user ID
	*/
	public static void removeByReferenceUserId(long referenceUserId) {
		getPersistence().removeByReferenceUserId(referenceUserId);
	}

	/**
	* Returns the number of ext references where referenceUserId = &#63;.
	*
	* @param referenceUserId the reference user ID
	* @return the number of matching ext references
	*/
	public static int countByReferenceUserId(long referenceUserId) {
		return getPersistence().countByReferenceUserId(referenceUserId);
	}

	/**
	* Caches the ext reference in the entity cache if it is enabled.
	*
	* @param extReference the ext reference
	*/
	public static void cacheResult(ExtReference extReference) {
		getPersistence().cacheResult(extReference);
	}

	/**
	* Caches the ext references in the entity cache if it is enabled.
	*
	* @param extReferences the ext references
	*/
	public static void cacheResult(List<ExtReference> extReferences) {
		getPersistence().cacheResult(extReferences);
	}

	/**
	* Creates a new ext reference with the primary key. Does not add the ext reference to the database.
	*
	* @param extReferenceId the primary key for the new ext reference
	* @return the new ext reference
	*/
	public static ExtReference create(long extReferenceId) {
		return getPersistence().create(extReferenceId);
	}

	/**
	* Removes the ext reference with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extReferenceId the primary key of the ext reference
	* @return the ext reference that was removed
	* @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	*/
	public static ExtReference remove(long extReferenceId)
		throws ucc.portal.exception.NoSuchExtReferenceException {
		return getPersistence().remove(extReferenceId);
	}

	public static ExtReference updateImpl(ExtReference extReference) {
		return getPersistence().updateImpl(extReference);
	}

	/**
	* Returns the ext reference with the primary key or throws a {@link NoSuchExtReferenceException} if it could not be found.
	*
	* @param extReferenceId the primary key of the ext reference
	* @return the ext reference
	* @throws NoSuchExtReferenceException if a ext reference with the primary key could not be found
	*/
	public static ExtReference findByPrimaryKey(long extReferenceId)
		throws ucc.portal.exception.NoSuchExtReferenceException {
		return getPersistence().findByPrimaryKey(extReferenceId);
	}

	/**
	* Returns the ext reference with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extReferenceId the primary key of the ext reference
	* @return the ext reference, or <code>null</code> if a ext reference with the primary key could not be found
	*/
	public static ExtReference fetchByPrimaryKey(long extReferenceId) {
		return getPersistence().fetchByPrimaryKey(extReferenceId);
	}

	public static java.util.Map<java.io.Serializable, ExtReference> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ext references.
	*
	* @return the ext references
	*/
	public static List<ExtReference> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ExtReference> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ExtReference> findAll(int start, int end,
		OrderByComparator<ExtReference> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ExtReference> findAll(int start, int end,
		OrderByComparator<ExtReference> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ext references from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ext references.
	*
	* @return the number of ext references
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExtReferencePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ExtReferencePersistence, ExtReferencePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ExtReferencePersistence.class);

		ServiceTracker<ExtReferencePersistence, ExtReferencePersistence> serviceTracker =
			new ServiceTracker<ExtReferencePersistence, ExtReferencePersistence>(bundle.getBundleContext(),
				ExtReferencePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}