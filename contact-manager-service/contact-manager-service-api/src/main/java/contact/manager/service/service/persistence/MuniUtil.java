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

import contact.manager.service.model.Muni;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the muni service. This utility wraps {@link contact.manager.service.service.persistence.impl.MuniPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MuniPersistence
 * @see contact.manager.service.service.persistence.impl.MuniPersistenceImpl
 * @generated
 */
@ProviderType
public class MuniUtil {
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
	public static void clearCache(Muni muni) {
		getPersistence().clearCache(muni);
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
	public static List<Muni> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Muni> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Muni> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Muni> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Muni update(Muni muni) {
		return getPersistence().update(muni);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Muni update(Muni muni, ServiceContext serviceContext) {
		return getPersistence().update(muni, serviceContext);
	}

	/**
	* Returns all the munis where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching munis
	*/
	public static List<Muni> findByZipCode(java.lang.String zipCode) {
		return getPersistence().findByZipCode(zipCode);
	}

	/**
	* Returns a range of all the munis where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of munis
	* @param end the upper bound of the range of munis (not inclusive)
	* @return the range of matching munis
	*/
	public static List<Muni> findByZipCode(java.lang.String zipCode, int start,
		int end) {
		return getPersistence().findByZipCode(zipCode, start, end);
	}

	/**
	* Returns an ordered range of all the munis where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of munis
	* @param end the upper bound of the range of munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching munis
	*/
	public static List<Muni> findByZipCode(java.lang.String zipCode, int start,
		int end, OrderByComparator<Muni> orderByComparator) {
		return getPersistence()
				   .findByZipCode(zipCode, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the munis where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of munis
	* @param end the upper bound of the range of munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching munis
	*/
	public static List<Muni> findByZipCode(java.lang.String zipCode, int start,
		int end, OrderByComparator<Muni> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByZipCode(zipCode, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first muni in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching muni
	* @throws NoSuchMuniException if a matching muni could not be found
	*/
	public static Muni findByZipCode_First(java.lang.String zipCode,
		OrderByComparator<Muni> orderByComparator)
		throws contact.manager.service.exception.NoSuchMuniException {
		return getPersistence().findByZipCode_First(zipCode, orderByComparator);
	}

	/**
	* Returns the first muni in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching muni, or <code>null</code> if a matching muni could not be found
	*/
	public static Muni fetchByZipCode_First(java.lang.String zipCode,
		OrderByComparator<Muni> orderByComparator) {
		return getPersistence().fetchByZipCode_First(zipCode, orderByComparator);
	}

	/**
	* Returns the last muni in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching muni
	* @throws NoSuchMuniException if a matching muni could not be found
	*/
	public static Muni findByZipCode_Last(java.lang.String zipCode,
		OrderByComparator<Muni> orderByComparator)
		throws contact.manager.service.exception.NoSuchMuniException {
		return getPersistence().findByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	* Returns the last muni in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching muni, or <code>null</code> if a matching muni could not be found
	*/
	public static Muni fetchByZipCode_Last(java.lang.String zipCode,
		OrderByComparator<Muni> orderByComparator) {
		return getPersistence().fetchByZipCode_Last(zipCode, orderByComparator);
	}

	/**
	* Returns the munis before and after the current muni in the ordered set where zipCode = &#63;.
	*
	* @param muniId the primary key of the current muni
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next muni
	* @throws NoSuchMuniException if a muni with the primary key could not be found
	*/
	public static Muni[] findByZipCode_PrevAndNext(long muniId,
		java.lang.String zipCode, OrderByComparator<Muni> orderByComparator)
		throws contact.manager.service.exception.NoSuchMuniException {
		return getPersistence()
				   .findByZipCode_PrevAndNext(muniId, zipCode, orderByComparator);
	}

	/**
	* Removes all the munis where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public static void removeByZipCode(java.lang.String zipCode) {
		getPersistence().removeByZipCode(zipCode);
	}

	/**
	* Returns the number of munis where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching munis
	*/
	public static int countByZipCode(java.lang.String zipCode) {
		return getPersistence().countByZipCode(zipCode);
	}

	/**
	* Caches the muni in the entity cache if it is enabled.
	*
	* @param muni the muni
	*/
	public static void cacheResult(Muni muni) {
		getPersistence().cacheResult(muni);
	}

	/**
	* Caches the munis in the entity cache if it is enabled.
	*
	* @param munis the munis
	*/
	public static void cacheResult(List<Muni> munis) {
		getPersistence().cacheResult(munis);
	}

	/**
	* Creates a new muni with the primary key. Does not add the muni to the database.
	*
	* @param muniId the primary key for the new muni
	* @return the new muni
	*/
	public static Muni create(long muniId) {
		return getPersistence().create(muniId);
	}

	/**
	* Removes the muni with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param muniId the primary key of the muni
	* @return the muni that was removed
	* @throws NoSuchMuniException if a muni with the primary key could not be found
	*/
	public static Muni remove(long muniId)
		throws contact.manager.service.exception.NoSuchMuniException {
		return getPersistence().remove(muniId);
	}

	public static Muni updateImpl(Muni muni) {
		return getPersistence().updateImpl(muni);
	}

	/**
	* Returns the muni with the primary key or throws a {@link NoSuchMuniException} if it could not be found.
	*
	* @param muniId the primary key of the muni
	* @return the muni
	* @throws NoSuchMuniException if a muni with the primary key could not be found
	*/
	public static Muni findByPrimaryKey(long muniId)
		throws contact.manager.service.exception.NoSuchMuniException {
		return getPersistence().findByPrimaryKey(muniId);
	}

	/**
	* Returns the muni with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param muniId the primary key of the muni
	* @return the muni, or <code>null</code> if a muni with the primary key could not be found
	*/
	public static Muni fetchByPrimaryKey(long muniId) {
		return getPersistence().fetchByPrimaryKey(muniId);
	}

	public static java.util.Map<java.io.Serializable, Muni> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the munis.
	*
	* @return the munis
	*/
	public static List<Muni> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the munis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of munis
	* @param end the upper bound of the range of munis (not inclusive)
	* @return the range of munis
	*/
	public static List<Muni> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the munis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of munis
	* @param end the upper bound of the range of munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of munis
	*/
	public static List<Muni> findAll(int start, int end,
		OrderByComparator<Muni> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the munis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of munis
	* @param end the upper bound of the range of munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of munis
	*/
	public static List<Muni> findAll(int start, int end,
		OrderByComparator<Muni> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the munis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of munis.
	*
	* @return the number of munis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MuniPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MuniPersistence, MuniPersistence> _serviceTracker =
		ServiceTrackerFactory.open(MuniPersistence.class);
}