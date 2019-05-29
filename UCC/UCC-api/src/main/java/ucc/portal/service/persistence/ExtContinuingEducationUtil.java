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

import ucc.portal.model.ExtContinuingEducation;

import java.util.List;

/**
 * The persistence utility for the ext continuing education service. This utility wraps {@link ucc.portal.service.persistence.impl.ExtContinuingEducationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtContinuingEducationPersistence
 * @see ucc.portal.service.persistence.impl.ExtContinuingEducationPersistenceImpl
 * @generated
 */
@ProviderType
public class ExtContinuingEducationUtil {
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
	public static void clearCache(ExtContinuingEducation extContinuingEducation) {
		getPersistence().clearCache(extContinuingEducation);
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
	public static List<ExtContinuingEducation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExtContinuingEducation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExtContinuingEducation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExtContinuingEducation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExtContinuingEducation update(
		ExtContinuingEducation extContinuingEducation) {
		return getPersistence().update(extContinuingEducation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExtContinuingEducation update(
		ExtContinuingEducation extContinuingEducation,
		ServiceContext serviceContext) {
		return getPersistence().update(extContinuingEducation, serviceContext);
	}

	/**
	* Returns all the ext continuing educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext continuing educations
	*/
	public static List<ExtContinuingEducation> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

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
	public static List<ExtContinuingEducation> findByUserId(long userId,
		int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

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
	public static List<ExtContinuingEducation> findByUserId(long userId,
		int start, int end,
		OrderByComparator<ExtContinuingEducation> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

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
	public static List<ExtContinuingEducation> findByUserId(long userId,
		int start, int end,
		OrderByComparator<ExtContinuingEducation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ext continuing education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext continuing education
	* @throws NoSuchExtContinuingEducationException if a matching ext continuing education could not be found
	*/
	public static ExtContinuingEducation findByUserId_First(long userId,
		OrderByComparator<ExtContinuingEducation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtContinuingEducationException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first ext continuing education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext continuing education, or <code>null</code> if a matching ext continuing education could not be found
	*/
	public static ExtContinuingEducation fetchByUserId_First(long userId,
		OrderByComparator<ExtContinuingEducation> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last ext continuing education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext continuing education
	* @throws NoSuchExtContinuingEducationException if a matching ext continuing education could not be found
	*/
	public static ExtContinuingEducation findByUserId_Last(long userId,
		OrderByComparator<ExtContinuingEducation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtContinuingEducationException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last ext continuing education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext continuing education, or <code>null</code> if a matching ext continuing education could not be found
	*/
	public static ExtContinuingEducation fetchByUserId_Last(long userId,
		OrderByComparator<ExtContinuingEducation> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the ext continuing educations before and after the current ext continuing education in the ordered set where userId = &#63;.
	*
	* @param extContinuingEducationId the primary key of the current ext continuing education
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext continuing education
	* @throws NoSuchExtContinuingEducationException if a ext continuing education with the primary key could not be found
	*/
	public static ExtContinuingEducation[] findByUserId_PrevAndNext(
		long extContinuingEducationId, long userId,
		OrderByComparator<ExtContinuingEducation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtContinuingEducationException {
		return getPersistence()
				   .findByUserId_PrevAndNext(extContinuingEducationId, userId,
			orderByComparator);
	}

	/**
	* Removes all the ext continuing educations where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of ext continuing educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext continuing educations
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Caches the ext continuing education in the entity cache if it is enabled.
	*
	* @param extContinuingEducation the ext continuing education
	*/
	public static void cacheResult(
		ExtContinuingEducation extContinuingEducation) {
		getPersistence().cacheResult(extContinuingEducation);
	}

	/**
	* Caches the ext continuing educations in the entity cache if it is enabled.
	*
	* @param extContinuingEducations the ext continuing educations
	*/
	public static void cacheResult(
		List<ExtContinuingEducation> extContinuingEducations) {
		getPersistence().cacheResult(extContinuingEducations);
	}

	/**
	* Creates a new ext continuing education with the primary key. Does not add the ext continuing education to the database.
	*
	* @param extContinuingEducationId the primary key for the new ext continuing education
	* @return the new ext continuing education
	*/
	public static ExtContinuingEducation create(long extContinuingEducationId) {
		return getPersistence().create(extContinuingEducationId);
	}

	/**
	* Removes the ext continuing education with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extContinuingEducationId the primary key of the ext continuing education
	* @return the ext continuing education that was removed
	* @throws NoSuchExtContinuingEducationException if a ext continuing education with the primary key could not be found
	*/
	public static ExtContinuingEducation remove(long extContinuingEducationId)
		throws ucc.portal.exception.NoSuchExtContinuingEducationException {
		return getPersistence().remove(extContinuingEducationId);
	}

	public static ExtContinuingEducation updateImpl(
		ExtContinuingEducation extContinuingEducation) {
		return getPersistence().updateImpl(extContinuingEducation);
	}

	/**
	* Returns the ext continuing education with the primary key or throws a {@link NoSuchExtContinuingEducationException} if it could not be found.
	*
	* @param extContinuingEducationId the primary key of the ext continuing education
	* @return the ext continuing education
	* @throws NoSuchExtContinuingEducationException if a ext continuing education with the primary key could not be found
	*/
	public static ExtContinuingEducation findByPrimaryKey(
		long extContinuingEducationId)
		throws ucc.portal.exception.NoSuchExtContinuingEducationException {
		return getPersistence().findByPrimaryKey(extContinuingEducationId);
	}

	/**
	* Returns the ext continuing education with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extContinuingEducationId the primary key of the ext continuing education
	* @return the ext continuing education, or <code>null</code> if a ext continuing education with the primary key could not be found
	*/
	public static ExtContinuingEducation fetchByPrimaryKey(
		long extContinuingEducationId) {
		return getPersistence().fetchByPrimaryKey(extContinuingEducationId);
	}

	public static java.util.Map<java.io.Serializable, ExtContinuingEducation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ext continuing educations.
	*
	* @return the ext continuing educations
	*/
	public static List<ExtContinuingEducation> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ExtContinuingEducation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ExtContinuingEducation> findAll(int start, int end,
		OrderByComparator<ExtContinuingEducation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ExtContinuingEducation> findAll(int start, int end,
		OrderByComparator<ExtContinuingEducation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ext continuing educations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ext continuing educations.
	*
	* @return the number of ext continuing educations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExtContinuingEducationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ExtContinuingEducationPersistence, ExtContinuingEducationPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ExtContinuingEducationPersistence.class);

		ServiceTracker<ExtContinuingEducationPersistence, ExtContinuingEducationPersistence> serviceTracker =
			new ServiceTracker<ExtContinuingEducationPersistence, ExtContinuingEducationPersistence>(bundle.getBundleContext(),
				ExtContinuingEducationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}