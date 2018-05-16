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

import contact.manager.service.model.LTA;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the lta service. This utility wraps {@link contact.manager.service.service.persistence.impl.LTAPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LTAPersistence
 * @see contact.manager.service.service.persistence.impl.LTAPersistenceImpl
 * @generated
 */
@ProviderType
public class LTAUtil {
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
	public static void clearCache(LTA lta) {
		getPersistence().clearCache(lta);
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
	public static List<LTA> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LTA> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LTA> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<LTA> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LTA update(LTA lta) {
		return getPersistence().update(lta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LTA update(LTA lta, ServiceContext serviceContext) {
		return getPersistence().update(lta, serviceContext);
	}

	/**
	* Returns all the ltas where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching ltas
	*/
	public static List<LTA> findByZipCode(java.lang.String zipCode) {
		return getPersistence().findByZipCode(zipCode);
	}

	/**
	* Returns a range of all the ltas where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @return the range of matching ltas
	*/
	public static List<LTA> findByZipCode(java.lang.String zipCode, int start,
		int end) {
		return getPersistence().findByZipCode(zipCode, start, end);
	}

	/**
	* Returns an ordered range of all the ltas where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ltas
	*/
	public static List<LTA> findByZipCode(java.lang.String zipCode, int start,
		int end, OrderByComparator<LTA> orderByComparator) {
		return getPersistence()
				   .findByZipCode(zipCode, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ltas where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ltas
	*/
	public static List<LTA> findByZipCode(java.lang.String zipCode, int start,
		int end, OrderByComparator<LTA> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByZipCode(zipCode, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first lta in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lta
	* @throws NoSuchLTAException if a matching lta could not be found
	*/
	public static LTA findByZipCode_First(java.lang.String zipCode,
		OrderByComparator<LTA> orderByComparator)
		throws contact.manager.service.exception.NoSuchLTAException {
		return getPersistence().findByZipCode_First(zipCode, orderByComparator);
	}

	/**
	* Returns the first lta in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lta, or <code>null</code> if a matching lta could not be found
	*/
	public static LTA fetchByZipCode_First(java.lang.String zipCode,
		OrderByComparator<LTA> orderByComparator) {
		return getPersistence().fetchByZipCode_First(zipCode, orderByComparator);
	}

	/**
	* Returns the last lta in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lta
	* @throws NoSuchLTAException if a matching lta could not be found
	*/
	public static LTA findByZipCode_Last(java.lang.String zipCode,
		OrderByComparator<LTA> orderByComparator)
		throws contact.manager.service.exception.NoSuchLTAException {
		return getPersistence().findByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	* Returns the last lta in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lta, or <code>null</code> if a matching lta could not be found
	*/
	public static LTA fetchByZipCode_Last(java.lang.String zipCode,
		OrderByComparator<LTA> orderByComparator) {
		return getPersistence().fetchByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	* Returns the ltas before and after the current lta in the ordered set where zipCode = &#63;.
	*
	* @param ltaId the primary key of the current lta
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lta
	* @throws NoSuchLTAException if a lta with the primary key could not be found
	*/
	public static LTA[] findByZipCode_PrevAndNext(long ltaId,
		java.lang.String zipCode, OrderByComparator<LTA> orderByComparator)
		throws contact.manager.service.exception.NoSuchLTAException {
		return getPersistence()
				   .findByZipCode_PrevAndNext(ltaId, zipCode, orderByComparator);
	}

	/**
	* Removes all the ltas where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public static void removeByZipCode(java.lang.String zipCode) {
		getPersistence().removeByZipCode(zipCode);
	}

	/**
	* Returns the number of ltas where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching ltas
	*/
	public static int countByZipCode(java.lang.String zipCode) {
		return getPersistence().countByZipCode(zipCode);
	}

	/**
	* Caches the lta in the entity cache if it is enabled.
	*
	* @param lta the lta
	*/
	public static void cacheResult(LTA lta) {
		getPersistence().cacheResult(lta);
	}

	/**
	* Caches the ltas in the entity cache if it is enabled.
	*
	* @param ltas the ltas
	*/
	public static void cacheResult(List<LTA> ltas) {
		getPersistence().cacheResult(ltas);
	}

	/**
	* Creates a new lta with the primary key. Does not add the lta to the database.
	*
	* @param ltaId the primary key for the new lta
	* @return the new lta
	*/
	public static LTA create(long ltaId) {
		return getPersistence().create(ltaId);
	}

	/**
	* Removes the lta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ltaId the primary key of the lta
	* @return the lta that was removed
	* @throws NoSuchLTAException if a lta with the primary key could not be found
	*/
	public static LTA remove(long ltaId)
		throws contact.manager.service.exception.NoSuchLTAException {
		return getPersistence().remove(ltaId);
	}

	public static LTA updateImpl(LTA lta) {
		return getPersistence().updateImpl(lta);
	}

	/**
	* Returns the lta with the primary key or throws a {@link NoSuchLTAException} if it could not be found.
	*
	* @param ltaId the primary key of the lta
	* @return the lta
	* @throws NoSuchLTAException if a lta with the primary key could not be found
	*/
	public static LTA findByPrimaryKey(long ltaId)
		throws contact.manager.service.exception.NoSuchLTAException {
		return getPersistence().findByPrimaryKey(ltaId);
	}

	/**
	* Returns the lta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ltaId the primary key of the lta
	* @return the lta, or <code>null</code> if a lta with the primary key could not be found
	*/
	public static LTA fetchByPrimaryKey(long ltaId) {
		return getPersistence().fetchByPrimaryKey(ltaId);
	}

	public static java.util.Map<java.io.Serializable, LTA> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ltas.
	*
	* @return the ltas
	*/
	public static List<LTA> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ltas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @return the range of ltas
	*/
	public static List<LTA> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ltas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ltas
	*/
	public static List<LTA> findAll(int start, int end,
		OrderByComparator<LTA> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ltas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ltas
	*/
	public static List<LTA> findAll(int start, int end,
		OrderByComparator<LTA> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ltas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ltas.
	*
	* @return the number of ltas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LTAPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LTAPersistence, LTAPersistence> _serviceTracker =
		ServiceTrackerFactory.open(LTAPersistence.class);
}