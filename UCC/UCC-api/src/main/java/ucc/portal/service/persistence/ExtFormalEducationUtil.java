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

import ucc.portal.model.ExtFormalEducation;

import java.util.List;

/**
 * The persistence utility for the ext formal education service. This utility wraps {@link ucc.portal.service.persistence.impl.ExtFormalEducationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtFormalEducationPersistence
 * @see ucc.portal.service.persistence.impl.ExtFormalEducationPersistenceImpl
 * @generated
 */
@ProviderType
public class ExtFormalEducationUtil {
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
	public static void clearCache(ExtFormalEducation extFormalEducation) {
		getPersistence().clearCache(extFormalEducation);
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
	public static List<ExtFormalEducation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExtFormalEducation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExtFormalEducation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExtFormalEducation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExtFormalEducation update(
		ExtFormalEducation extFormalEducation) {
		return getPersistence().update(extFormalEducation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExtFormalEducation update(
		ExtFormalEducation extFormalEducation, ServiceContext serviceContext) {
		return getPersistence().update(extFormalEducation, serviceContext);
	}

	/**
	* Returns all the ext formal educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext formal educations
	*/
	public static List<ExtFormalEducation> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

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
	public static List<ExtFormalEducation> findByUserId(long userId, int start,
		int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

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
	public static List<ExtFormalEducation> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtFormalEducation> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

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
	public static List<ExtFormalEducation> findByUserId(long userId, int start,
		int end, OrderByComparator<ExtFormalEducation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ext formal education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext formal education
	* @throws NoSuchExtFormalEducationException if a matching ext formal education could not be found
	*/
	public static ExtFormalEducation findByUserId_First(long userId,
		OrderByComparator<ExtFormalEducation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtFormalEducationException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first ext formal education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext formal education, or <code>null</code> if a matching ext formal education could not be found
	*/
	public static ExtFormalEducation fetchByUserId_First(long userId,
		OrderByComparator<ExtFormalEducation> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last ext formal education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext formal education
	* @throws NoSuchExtFormalEducationException if a matching ext formal education could not be found
	*/
	public static ExtFormalEducation findByUserId_Last(long userId,
		OrderByComparator<ExtFormalEducation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtFormalEducationException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last ext formal education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext formal education, or <code>null</code> if a matching ext formal education could not be found
	*/
	public static ExtFormalEducation fetchByUserId_Last(long userId,
		OrderByComparator<ExtFormalEducation> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the ext formal educations before and after the current ext formal education in the ordered set where userId = &#63;.
	*
	* @param extFormalEducationId the primary key of the current ext formal education
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext formal education
	* @throws NoSuchExtFormalEducationException if a ext formal education with the primary key could not be found
	*/
	public static ExtFormalEducation[] findByUserId_PrevAndNext(
		long extFormalEducationId, long userId,
		OrderByComparator<ExtFormalEducation> orderByComparator)
		throws ucc.portal.exception.NoSuchExtFormalEducationException {
		return getPersistence()
				   .findByUserId_PrevAndNext(extFormalEducationId, userId,
			orderByComparator);
	}

	/**
	* Removes all the ext formal educations where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of ext formal educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext formal educations
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Caches the ext formal education in the entity cache if it is enabled.
	*
	* @param extFormalEducation the ext formal education
	*/
	public static void cacheResult(ExtFormalEducation extFormalEducation) {
		getPersistence().cacheResult(extFormalEducation);
	}

	/**
	* Caches the ext formal educations in the entity cache if it is enabled.
	*
	* @param extFormalEducations the ext formal educations
	*/
	public static void cacheResult(List<ExtFormalEducation> extFormalEducations) {
		getPersistence().cacheResult(extFormalEducations);
	}

	/**
	* Creates a new ext formal education with the primary key. Does not add the ext formal education to the database.
	*
	* @param extFormalEducationId the primary key for the new ext formal education
	* @return the new ext formal education
	*/
	public static ExtFormalEducation create(long extFormalEducationId) {
		return getPersistence().create(extFormalEducationId);
	}

	/**
	* Removes the ext formal education with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extFormalEducationId the primary key of the ext formal education
	* @return the ext formal education that was removed
	* @throws NoSuchExtFormalEducationException if a ext formal education with the primary key could not be found
	*/
	public static ExtFormalEducation remove(long extFormalEducationId)
		throws ucc.portal.exception.NoSuchExtFormalEducationException {
		return getPersistence().remove(extFormalEducationId);
	}

	public static ExtFormalEducation updateImpl(
		ExtFormalEducation extFormalEducation) {
		return getPersistence().updateImpl(extFormalEducation);
	}

	/**
	* Returns the ext formal education with the primary key or throws a {@link NoSuchExtFormalEducationException} if it could not be found.
	*
	* @param extFormalEducationId the primary key of the ext formal education
	* @return the ext formal education
	* @throws NoSuchExtFormalEducationException if a ext formal education with the primary key could not be found
	*/
	public static ExtFormalEducation findByPrimaryKey(long extFormalEducationId)
		throws ucc.portal.exception.NoSuchExtFormalEducationException {
		return getPersistence().findByPrimaryKey(extFormalEducationId);
	}

	/**
	* Returns the ext formal education with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extFormalEducationId the primary key of the ext formal education
	* @return the ext formal education, or <code>null</code> if a ext formal education with the primary key could not be found
	*/
	public static ExtFormalEducation fetchByPrimaryKey(
		long extFormalEducationId) {
		return getPersistence().fetchByPrimaryKey(extFormalEducationId);
	}

	public static java.util.Map<java.io.Serializable, ExtFormalEducation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ext formal educations.
	*
	* @return the ext formal educations
	*/
	public static List<ExtFormalEducation> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ExtFormalEducation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ExtFormalEducation> findAll(int start, int end,
		OrderByComparator<ExtFormalEducation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ExtFormalEducation> findAll(int start, int end,
		OrderByComparator<ExtFormalEducation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ext formal educations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ext formal educations.
	*
	* @return the number of ext formal educations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExtFormalEducationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ExtFormalEducationPersistence, ExtFormalEducationPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ExtFormalEducationPersistence.class);

		ServiceTracker<ExtFormalEducationPersistence, ExtFormalEducationPersistence> serviceTracker =
			new ServiceTracker<ExtFormalEducationPersistence, ExtFormalEducationPersistence>(bundle.getBundleContext(),
				ExtFormalEducationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}