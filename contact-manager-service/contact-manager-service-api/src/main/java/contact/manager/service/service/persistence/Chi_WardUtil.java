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

package contact.manager.service.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.service.model.Chi_Ward;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the chi_ ward service. This utility wraps {@link contact.manager.service.service.persistence.impl.Chi_WardPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Chi_WardPersistence
 * @see contact.manager.service.service.persistence.impl.Chi_WardPersistenceImpl
 * @generated
 */
@ProviderType
public class Chi_WardUtil {
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
	public static void clearCache(Chi_Ward chi_Ward) {
		getPersistence().clearCache(chi_Ward);
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
	public static List<Chi_Ward> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Chi_Ward> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Chi_Ward> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Chi_Ward> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Chi_Ward update(Chi_Ward chi_Ward) {
		return getPersistence().update(chi_Ward);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Chi_Ward update(Chi_Ward chi_Ward,
		ServiceContext serviceContext) {
		return getPersistence().update(chi_Ward, serviceContext);
	}

	/**
	* Returns all the chi_ wards where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching chi_ wards
	*/
	public static List<Chi_Ward> findByZipCode(java.lang.String zipCode) {
		return getPersistence().findByZipCode(zipCode);
	}

	/**
	* Returns a range of all the chi_ wards where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @return the range of matching chi_ wards
	*/
	public static List<Chi_Ward> findByZipCode(java.lang.String zipCode,
		int start, int end) {
		return getPersistence().findByZipCode(zipCode, start, end);
	}

	/**
	* Returns an ordered range of all the chi_ wards where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching chi_ wards
	*/
	public static List<Chi_Ward> findByZipCode(java.lang.String zipCode,
		int start, int end, OrderByComparator<Chi_Ward> orderByComparator) {
		return getPersistence()
				   .findByZipCode(zipCode, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the chi_ wards where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching chi_ wards
	*/
	public static List<Chi_Ward> findByZipCode(java.lang.String zipCode,
		int start, int end, OrderByComparator<Chi_Ward> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByZipCode(zipCode, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first chi_ ward in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching chi_ ward
	* @throws NoSuchChi_WardException if a matching chi_ ward could not be found
	*/
	public static Chi_Ward findByZipCode_First(java.lang.String zipCode,
		OrderByComparator<Chi_Ward> orderByComparator)
		throws contact.manager.service.exception.NoSuchChi_WardException {
		return getPersistence().findByZipCode_First(zipCode, orderByComparator);
	}

	/**
	* Returns the first chi_ ward in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching chi_ ward, or <code>null</code> if a matching chi_ ward could not be found
	*/
	public static Chi_Ward fetchByZipCode_First(java.lang.String zipCode,
		OrderByComparator<Chi_Ward> orderByComparator) {
		return getPersistence().fetchByZipCode_First(zipCode, orderByComparator);
	}

	/**
	* Returns the last chi_ ward in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching chi_ ward
	* @throws NoSuchChi_WardException if a matching chi_ ward could not be found
	*/
	public static Chi_Ward findByZipCode_Last(java.lang.String zipCode,
		OrderByComparator<Chi_Ward> orderByComparator)
		throws contact.manager.service.exception.NoSuchChi_WardException {
		return getPersistence().findByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	* Returns the last chi_ ward in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching chi_ ward, or <code>null</code> if a matching chi_ ward could not be found
	*/
	public static Chi_Ward fetchByZipCode_Last(java.lang.String zipCode,
		OrderByComparator<Chi_Ward> orderByComparator) {
		return getPersistence().fetchByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	* Returns the chi_ wards before and after the current chi_ ward in the ordered set where zipCode = &#63;.
	*
	* @param chiWardId the primary key of the current chi_ ward
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next chi_ ward
	* @throws NoSuchChi_WardException if a chi_ ward with the primary key could not be found
	*/
	public static Chi_Ward[] findByZipCode_PrevAndNext(long chiWardId,
		java.lang.String zipCode, OrderByComparator<Chi_Ward> orderByComparator)
		throws contact.manager.service.exception.NoSuchChi_WardException {
		return getPersistence()
				   .findByZipCode_PrevAndNext(chiWardId, zipCode,
			orderByComparator);
	}

	/**
	* Removes all the chi_ wards where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public static void removeByZipCode(java.lang.String zipCode) {
		getPersistence().removeByZipCode(zipCode);
	}

	/**
	* Returns the number of chi_ wards where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching chi_ wards
	*/
	public static int countByZipCode(java.lang.String zipCode) {
		return getPersistence().countByZipCode(zipCode);
	}

	/**
	* Caches the chi_ ward in the entity cache if it is enabled.
	*
	* @param chi_Ward the chi_ ward
	*/
	public static void cacheResult(Chi_Ward chi_Ward) {
		getPersistence().cacheResult(chi_Ward);
	}

	/**
	* Caches the chi_ wards in the entity cache if it is enabled.
	*
	* @param chi_Wards the chi_ wards
	*/
	public static void cacheResult(List<Chi_Ward> chi_Wards) {
		getPersistence().cacheResult(chi_Wards);
	}

	/**
	* Creates a new chi_ ward with the primary key. Does not add the chi_ ward to the database.
	*
	* @param chiWardId the primary key for the new chi_ ward
	* @return the new chi_ ward
	*/
	public static Chi_Ward create(long chiWardId) {
		return getPersistence().create(chiWardId);
	}

	/**
	* Removes the chi_ ward with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param chiWardId the primary key of the chi_ ward
	* @return the chi_ ward that was removed
	* @throws NoSuchChi_WardException if a chi_ ward with the primary key could not be found
	*/
	public static Chi_Ward remove(long chiWardId)
		throws contact.manager.service.exception.NoSuchChi_WardException {
		return getPersistence().remove(chiWardId);
	}

	public static Chi_Ward updateImpl(Chi_Ward chi_Ward) {
		return getPersistence().updateImpl(chi_Ward);
	}

	/**
	* Returns the chi_ ward with the primary key or throws a {@link NoSuchChi_WardException} if it could not be found.
	*
	* @param chiWardId the primary key of the chi_ ward
	* @return the chi_ ward
	* @throws NoSuchChi_WardException if a chi_ ward with the primary key could not be found
	*/
	public static Chi_Ward findByPrimaryKey(long chiWardId)
		throws contact.manager.service.exception.NoSuchChi_WardException {
		return getPersistence().findByPrimaryKey(chiWardId);
	}

	/**
	* Returns the chi_ ward with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param chiWardId the primary key of the chi_ ward
	* @return the chi_ ward, or <code>null</code> if a chi_ ward with the primary key could not be found
	*/
	public static Chi_Ward fetchByPrimaryKey(long chiWardId) {
		return getPersistence().fetchByPrimaryKey(chiWardId);
	}

	public static java.util.Map<java.io.Serializable, Chi_Ward> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the chi_ wards.
	*
	* @return the chi_ wards
	*/
	public static List<Chi_Ward> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the chi_ wards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @return the range of chi_ wards
	*/
	public static List<Chi_Ward> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the chi_ wards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of chi_ wards
	*/
	public static List<Chi_Ward> findAll(int start, int end,
		OrderByComparator<Chi_Ward> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the chi_ wards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of chi_ wards
	*/
	public static List<Chi_Ward> findAll(int start, int end,
		OrderByComparator<Chi_Ward> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the chi_ wards from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of chi_ wards.
	*
	* @return the number of chi_ wards
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Chi_WardPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<Chi_WardPersistence, Chi_WardPersistence> _serviceTracker =
		ServiceTrackerFactory.open(Chi_WardPersistence.class);
}