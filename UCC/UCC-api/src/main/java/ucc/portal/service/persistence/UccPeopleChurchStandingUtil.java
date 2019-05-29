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

import ucc.portal.model.UccPeopleChurchStanding;

import java.util.List;

/**
 * The persistence utility for the ucc people church standing service. This utility wraps {@link ucc.portal.service.persistence.impl.UccPeopleChurchStandingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccPeopleChurchStandingPersistence
 * @see ucc.portal.service.persistence.impl.UccPeopleChurchStandingPersistenceImpl
 * @generated
 */
@ProviderType
public class UccPeopleChurchStandingUtil {
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
	public static void clearCache(
		UccPeopleChurchStanding uccPeopleChurchStanding) {
		getPersistence().clearCache(uccPeopleChurchStanding);
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
	public static List<UccPeopleChurchStanding> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UccPeopleChurchStanding> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UccPeopleChurchStanding> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UccPeopleChurchStanding update(
		UccPeopleChurchStanding uccPeopleChurchStanding) {
		return getPersistence().update(uccPeopleChurchStanding);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UccPeopleChurchStanding update(
		UccPeopleChurchStanding uccPeopleChurchStanding,
		ServiceContext serviceContext) {
		return getPersistence().update(uccPeopleChurchStanding, serviceContext);
	}

	/**
	* Returns all the ucc people church standings where uccPeopleId = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @return the matching ucc people church standings
	*/
	public static List<UccPeopleChurchStanding> findByPeopleId(int uccPeopleId) {
		return getPersistence().findByPeopleId(uccPeopleId);
	}

	/**
	* Returns a range of all the ucc people church standings where uccPeopleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccPeopleId the ucc people ID
	* @param start the lower bound of the range of ucc people church standings
	* @param end the upper bound of the range of ucc people church standings (not inclusive)
	* @return the range of matching ucc people church standings
	*/
	public static List<UccPeopleChurchStanding> findByPeopleId(
		int uccPeopleId, int start, int end) {
		return getPersistence().findByPeopleId(uccPeopleId, start, end);
	}

	/**
	* Returns an ordered range of all the ucc people church standings where uccPeopleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccPeopleId the ucc people ID
	* @param start the lower bound of the range of ucc people church standings
	* @param end the upper bound of the range of ucc people church standings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ucc people church standings
	*/
	public static List<UccPeopleChurchStanding> findByPeopleId(
		int uccPeopleId, int start, int end,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator) {
		return getPersistence()
				   .findByPeopleId(uccPeopleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ucc people church standings where uccPeopleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccPeopleId the ucc people ID
	* @param start the lower bound of the range of ucc people church standings
	* @param end the upper bound of the range of ucc people church standings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ucc people church standings
	*/
	public static List<UccPeopleChurchStanding> findByPeopleId(
		int uccPeopleId, int start, int end,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPeopleId(uccPeopleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ucc people church standing in the ordered set where uccPeopleId = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people church standing
	* @throws NoSuchUccPeopleChurchStandingException if a matching ucc people church standing could not be found
	*/
	public static UccPeopleChurchStanding findByPeopleId_First(
		int uccPeopleId,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator)
		throws ucc.portal.exception.NoSuchUccPeopleChurchStandingException {
		return getPersistence()
				   .findByPeopleId_First(uccPeopleId, orderByComparator);
	}

	/**
	* Returns the first ucc people church standing in the ordered set where uccPeopleId = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people church standing, or <code>null</code> if a matching ucc people church standing could not be found
	*/
	public static UccPeopleChurchStanding fetchByPeopleId_First(
		int uccPeopleId,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator) {
		return getPersistence()
				   .fetchByPeopleId_First(uccPeopleId, orderByComparator);
	}

	/**
	* Returns the last ucc people church standing in the ordered set where uccPeopleId = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people church standing
	* @throws NoSuchUccPeopleChurchStandingException if a matching ucc people church standing could not be found
	*/
	public static UccPeopleChurchStanding findByPeopleId_Last(int uccPeopleId,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator)
		throws ucc.portal.exception.NoSuchUccPeopleChurchStandingException {
		return getPersistence()
				   .findByPeopleId_Last(uccPeopleId, orderByComparator);
	}

	/**
	* Returns the last ucc people church standing in the ordered set where uccPeopleId = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people church standing, or <code>null</code> if a matching ucc people church standing could not be found
	*/
	public static UccPeopleChurchStanding fetchByPeopleId_Last(
		int uccPeopleId,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator) {
		return getPersistence()
				   .fetchByPeopleId_Last(uccPeopleId, orderByComparator);
	}

	/**
	* Returns the ucc people church standings before and after the current ucc people church standing in the ordered set where uccPeopleId = &#63;.
	*
	* @param uccPeopleChurchStandingId the primary key of the current ucc people church standing
	* @param uccPeopleId the ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ucc people church standing
	* @throws NoSuchUccPeopleChurchStandingException if a ucc people church standing with the primary key could not be found
	*/
	public static UccPeopleChurchStanding[] findByPeopleId_PrevAndNext(
		int uccPeopleChurchStandingId, int uccPeopleId,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator)
		throws ucc.portal.exception.NoSuchUccPeopleChurchStandingException {
		return getPersistence()
				   .findByPeopleId_PrevAndNext(uccPeopleChurchStandingId,
			uccPeopleId, orderByComparator);
	}

	/**
	* Removes all the ucc people church standings where uccPeopleId = &#63; from the database.
	*
	* @param uccPeopleId the ucc people ID
	*/
	public static void removeByPeopleId(int uccPeopleId) {
		getPersistence().removeByPeopleId(uccPeopleId);
	}

	/**
	* Returns the number of ucc people church standings where uccPeopleId = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @return the number of matching ucc people church standings
	*/
	public static int countByPeopleId(int uccPeopleId) {
		return getPersistence().countByPeopleId(uccPeopleId);
	}

	/**
	* Caches the ucc people church standing in the entity cache if it is enabled.
	*
	* @param uccPeopleChurchStanding the ucc people church standing
	*/
	public static void cacheResult(
		UccPeopleChurchStanding uccPeopleChurchStanding) {
		getPersistence().cacheResult(uccPeopleChurchStanding);
	}

	/**
	* Caches the ucc people church standings in the entity cache if it is enabled.
	*
	* @param uccPeopleChurchStandings the ucc people church standings
	*/
	public static void cacheResult(
		List<UccPeopleChurchStanding> uccPeopleChurchStandings) {
		getPersistence().cacheResult(uccPeopleChurchStandings);
	}

	/**
	* Creates a new ucc people church standing with the primary key. Does not add the ucc people church standing to the database.
	*
	* @param uccPeopleChurchStandingId the primary key for the new ucc people church standing
	* @return the new ucc people church standing
	*/
	public static UccPeopleChurchStanding create(int uccPeopleChurchStandingId) {
		return getPersistence().create(uccPeopleChurchStandingId);
	}

	/**
	* Removes the ucc people church standing with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccPeopleChurchStandingId the primary key of the ucc people church standing
	* @return the ucc people church standing that was removed
	* @throws NoSuchUccPeopleChurchStandingException if a ucc people church standing with the primary key could not be found
	*/
	public static UccPeopleChurchStanding remove(int uccPeopleChurchStandingId)
		throws ucc.portal.exception.NoSuchUccPeopleChurchStandingException {
		return getPersistence().remove(uccPeopleChurchStandingId);
	}

	public static UccPeopleChurchStanding updateImpl(
		UccPeopleChurchStanding uccPeopleChurchStanding) {
		return getPersistence().updateImpl(uccPeopleChurchStanding);
	}

	/**
	* Returns the ucc people church standing with the primary key or throws a {@link NoSuchUccPeopleChurchStandingException} if it could not be found.
	*
	* @param uccPeopleChurchStandingId the primary key of the ucc people church standing
	* @return the ucc people church standing
	* @throws NoSuchUccPeopleChurchStandingException if a ucc people church standing with the primary key could not be found
	*/
	public static UccPeopleChurchStanding findByPrimaryKey(
		int uccPeopleChurchStandingId)
		throws ucc.portal.exception.NoSuchUccPeopleChurchStandingException {
		return getPersistence().findByPrimaryKey(uccPeopleChurchStandingId);
	}

	/**
	* Returns the ucc people church standing with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param uccPeopleChurchStandingId the primary key of the ucc people church standing
	* @return the ucc people church standing, or <code>null</code> if a ucc people church standing with the primary key could not be found
	*/
	public static UccPeopleChurchStanding fetchByPrimaryKey(
		int uccPeopleChurchStandingId) {
		return getPersistence().fetchByPrimaryKey(uccPeopleChurchStandingId);
	}

	public static java.util.Map<java.io.Serializable, UccPeopleChurchStanding> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ucc people church standings.
	*
	* @return the ucc people church standings
	*/
	public static List<UccPeopleChurchStanding> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ucc people church standings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc people church standings
	* @param end the upper bound of the range of ucc people church standings (not inclusive)
	* @return the range of ucc people church standings
	*/
	public static List<UccPeopleChurchStanding> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ucc people church standings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc people church standings
	* @param end the upper bound of the range of ucc people church standings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ucc people church standings
	*/
	public static List<UccPeopleChurchStanding> findAll(int start, int end,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ucc people church standings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc people church standings
	* @param end the upper bound of the range of ucc people church standings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ucc people church standings
	*/
	public static List<UccPeopleChurchStanding> findAll(int start, int end,
		OrderByComparator<UccPeopleChurchStanding> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ucc people church standings from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ucc people church standings.
	*
	* @return the number of ucc people church standings
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static UccPeopleChurchStandingPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UccPeopleChurchStandingPersistence, UccPeopleChurchStandingPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UccPeopleChurchStandingPersistence.class);

		ServiceTracker<UccPeopleChurchStandingPersistence, UccPeopleChurchStandingPersistence> serviceTracker =
			new ServiceTracker<UccPeopleChurchStandingPersistence, UccPeopleChurchStandingPersistence>(bundle.getBundleContext(),
				UccPeopleChurchStandingPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}