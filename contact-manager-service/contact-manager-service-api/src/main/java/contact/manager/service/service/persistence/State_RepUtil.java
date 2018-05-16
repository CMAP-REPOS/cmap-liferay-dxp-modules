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

import contact.manager.service.model.State_Rep;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the state_ rep service. This utility wraps {@link contact.manager.service.service.persistence.impl.State_RepPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see State_RepPersistence
 * @see contact.manager.service.service.persistence.impl.State_RepPersistenceImpl
 * @generated
 */
@ProviderType
public class State_RepUtil {
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
	public static void clearCache(State_Rep state_Rep) {
		getPersistence().clearCache(state_Rep);
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
	public static List<State_Rep> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<State_Rep> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<State_Rep> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<State_Rep> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static State_Rep update(State_Rep state_Rep) {
		return getPersistence().update(state_Rep);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static State_Rep update(State_Rep state_Rep,
		ServiceContext serviceContext) {
		return getPersistence().update(state_Rep, serviceContext);
	}

	/**
	* Caches the state_ rep in the entity cache if it is enabled.
	*
	* @param state_Rep the state_ rep
	*/
	public static void cacheResult(State_Rep state_Rep) {
		getPersistence().cacheResult(state_Rep);
	}

	/**
	* Caches the state_ reps in the entity cache if it is enabled.
	*
	* @param state_Reps the state_ reps
	*/
	public static void cacheResult(List<State_Rep> state_Reps) {
		getPersistence().cacheResult(state_Reps);
	}

	/**
	* Creates a new state_ rep with the primary key. Does not add the state_ rep to the database.
	*
	* @param stateRepId the primary key for the new state_ rep
	* @return the new state_ rep
	*/
	public static State_Rep create(long stateRepId) {
		return getPersistence().create(stateRepId);
	}

	/**
	* Removes the state_ rep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stateRepId the primary key of the state_ rep
	* @return the state_ rep that was removed
	* @throws NoSuchState_RepException if a state_ rep with the primary key could not be found
	*/
	public static State_Rep remove(long stateRepId)
		throws contact.manager.service.exception.NoSuchState_RepException {
		return getPersistence().remove(stateRepId);
	}

	public static State_Rep updateImpl(State_Rep state_Rep) {
		return getPersistence().updateImpl(state_Rep);
	}

	/**
	* Returns the state_ rep with the primary key or throws a {@link NoSuchState_RepException} if it could not be found.
	*
	* @param stateRepId the primary key of the state_ rep
	* @return the state_ rep
	* @throws NoSuchState_RepException if a state_ rep with the primary key could not be found
	*/
	public static State_Rep findByPrimaryKey(long stateRepId)
		throws contact.manager.service.exception.NoSuchState_RepException {
		return getPersistence().findByPrimaryKey(stateRepId);
	}

	/**
	* Returns the state_ rep with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stateRepId the primary key of the state_ rep
	* @return the state_ rep, or <code>null</code> if a state_ rep with the primary key could not be found
	*/
	public static State_Rep fetchByPrimaryKey(long stateRepId) {
		return getPersistence().fetchByPrimaryKey(stateRepId);
	}

	public static java.util.Map<java.io.Serializable, State_Rep> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the state_ reps.
	*
	* @return the state_ reps
	*/
	public static List<State_Rep> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the state_ reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ reps
	* @param end the upper bound of the range of state_ reps (not inclusive)
	* @return the range of state_ reps
	*/
	public static List<State_Rep> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the state_ reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ reps
	* @param end the upper bound of the range of state_ reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of state_ reps
	*/
	public static List<State_Rep> findAll(int start, int end,
		OrderByComparator<State_Rep> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the state_ reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ reps
	* @param end the upper bound of the range of state_ reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of state_ reps
	*/
	public static List<State_Rep> findAll(int start, int end,
		OrderByComparator<State_Rep> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the state_ reps from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of state_ reps.
	*
	* @return the number of state_ reps
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static State_RepPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<State_RepPersistence, State_RepPersistence> _serviceTracker =
		ServiceTrackerFactory.open(State_RepPersistence.class);
}