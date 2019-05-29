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

import ucc.portal.model.ExtRegionalEducation;

import java.util.List;

/**
 * The persistence utility for the ext regional education service. This utility wraps {@link ucc.portal.service.persistence.impl.ExtRegionalEducationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtRegionalEducationPersistence
 * @see ucc.portal.service.persistence.impl.ExtRegionalEducationPersistenceImpl
 * @generated
 */
@ProviderType
public class ExtRegionalEducationUtil {
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
	public static void clearCache(ExtRegionalEducation extRegionalEducation) {
		getPersistence().clearCache(extRegionalEducation);
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
	public static List<ExtRegionalEducation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExtRegionalEducation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExtRegionalEducation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExtRegionalEducation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExtRegionalEducation update(
		ExtRegionalEducation extRegionalEducation) {
		return getPersistence().update(extRegionalEducation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExtRegionalEducation update(
		ExtRegionalEducation extRegionalEducation, ServiceContext serviceContext) {
		return getPersistence().update(extRegionalEducation, serviceContext);
	}

	/**
	* Returns all the ext regional educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext regional educations
	*/
	public static List<ExtRegionalEducation> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

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
	public static List<ExtRegionalEducation> findByUserId(long userId,
		int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

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
	public static List<ExtRegionalEducation> findByUserId(long userId,
		int start, int end,
		OrderByComparator<ExtRegionalEducation> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

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
	public static List<ExtRegionalEducation> findByUserId(long userId,
		int start, int end,
		OrderByComparator<ExtRegionalEducation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ext regional education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext regional education
	* @throws NoSuchExtRegionalEducationException if a matching ext regional education could not be found
	*/
	public static ExtRegionalEducation findByUserId_First(long userId,
		OrderByComparator<ExtRegionalEducation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtRegionalEducationException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first ext regional education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext regional education, or <code>null</code> if a matching ext regional education could not be found
	*/
	public static ExtRegionalEducation fetchByUserId_First(long userId,
		OrderByComparator<ExtRegionalEducation> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last ext regional education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext regional education
	* @throws NoSuchExtRegionalEducationException if a matching ext regional education could not be found
	*/
	public static ExtRegionalEducation findByUserId_Last(long userId,
		OrderByComparator<ExtRegionalEducation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtRegionalEducationException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last ext regional education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext regional education, or <code>null</code> if a matching ext regional education could not be found
	*/
	public static ExtRegionalEducation fetchByUserId_Last(long userId,
		OrderByComparator<ExtRegionalEducation> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the ext regional educations before and after the current ext regional education in the ordered set where userId = &#63;.
	*
	* @param extRegionalEducationId the primary key of the current ext regional education
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext regional education
	* @throws NoSuchExtRegionalEducationException if a ext regional education with the primary key could not be found
	*/
	public static ExtRegionalEducation[] findByUserId_PrevAndNext(
		long extRegionalEducationId, long userId,
		OrderByComparator<ExtRegionalEducation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtRegionalEducationException {
		return getPersistence()
				   .findByUserId_PrevAndNext(extRegionalEducationId, userId,
			orderByComparator);
	}

	/**
	* Removes all the ext regional educations where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of ext regional educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext regional educations
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Caches the ext regional education in the entity cache if it is enabled.
	*
	* @param extRegionalEducation the ext regional education
	*/
	public static void cacheResult(ExtRegionalEducation extRegionalEducation) {
		getPersistence().cacheResult(extRegionalEducation);
	}

	/**
	* Caches the ext regional educations in the entity cache if it is enabled.
	*
	* @param extRegionalEducations the ext regional educations
	*/
	public static void cacheResult(
		List<ExtRegionalEducation> extRegionalEducations) {
		getPersistence().cacheResult(extRegionalEducations);
	}

	/**
	* Creates a new ext regional education with the primary key. Does not add the ext regional education to the database.
	*
	* @param extRegionalEducationId the primary key for the new ext regional education
	* @return the new ext regional education
	*/
	public static ExtRegionalEducation create(long extRegionalEducationId) {
		return getPersistence().create(extRegionalEducationId);
	}

	/**
	* Removes the ext regional education with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extRegionalEducationId the primary key of the ext regional education
	* @return the ext regional education that was removed
	* @throws NoSuchExtRegionalEducationException if a ext regional education with the primary key could not be found
	*/
	public static ExtRegionalEducation remove(long extRegionalEducationId)
		throws ucc.portal.exception.NoSuchExtRegionalEducationException {
		return getPersistence().remove(extRegionalEducationId);
	}

	public static ExtRegionalEducation updateImpl(
		ExtRegionalEducation extRegionalEducation) {
		return getPersistence().updateImpl(extRegionalEducation);
	}

	/**
	* Returns the ext regional education with the primary key or throws a {@link NoSuchExtRegionalEducationException} if it could not be found.
	*
	* @param extRegionalEducationId the primary key of the ext regional education
	* @return the ext regional education
	* @throws NoSuchExtRegionalEducationException if a ext regional education with the primary key could not be found
	*/
	public static ExtRegionalEducation findByPrimaryKey(
		long extRegionalEducationId)
		throws ucc.portal.exception.NoSuchExtRegionalEducationException {
		return getPersistence().findByPrimaryKey(extRegionalEducationId);
	}

	/**
	* Returns the ext regional education with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extRegionalEducationId the primary key of the ext regional education
	* @return the ext regional education, or <code>null</code> if a ext regional education with the primary key could not be found
	*/
	public static ExtRegionalEducation fetchByPrimaryKey(
		long extRegionalEducationId) {
		return getPersistence().fetchByPrimaryKey(extRegionalEducationId);
	}

	public static java.util.Map<java.io.Serializable, ExtRegionalEducation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ext regional educations.
	*
	* @return the ext regional educations
	*/
	public static List<ExtRegionalEducation> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ExtRegionalEducation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ExtRegionalEducation> findAll(int start, int end,
		OrderByComparator<ExtRegionalEducation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ExtRegionalEducation> findAll(int start, int end,
		OrderByComparator<ExtRegionalEducation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ext regional educations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ext regional educations.
	*
	* @return the number of ext regional educations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExtRegionalEducationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ExtRegionalEducationPersistence, ExtRegionalEducationPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ExtRegionalEducationPersistence.class);

		ServiceTracker<ExtRegionalEducationPersistence, ExtRegionalEducationPersistence> serviceTracker =
			new ServiceTracker<ExtRegionalEducationPersistence, ExtRegionalEducationPersistence>(bundle.getBundleContext(),
				ExtRegionalEducationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}