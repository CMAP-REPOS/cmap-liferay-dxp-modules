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

import contact.manager.service.model.State_Senate;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the state_ senate service. This utility wraps {@link contact.manager.service.service.persistence.impl.State_SenatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see State_SenatePersistence
 * @see contact.manager.service.service.persistence.impl.State_SenatePersistenceImpl
 * @generated
 */
@ProviderType
public class State_SenateUtil {
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
	public static void clearCache(State_Senate state_Senate) {
		getPersistence().clearCache(state_Senate);
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
	public static List<State_Senate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<State_Senate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<State_Senate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<State_Senate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static State_Senate update(State_Senate state_Senate) {
		return getPersistence().update(state_Senate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static State_Senate update(State_Senate state_Senate,
		ServiceContext serviceContext) {
		return getPersistence().update(state_Senate, serviceContext);
	}

	/**
	* Caches the state_ senate in the entity cache if it is enabled.
	*
	* @param state_Senate the state_ senate
	*/
	public static void cacheResult(State_Senate state_Senate) {
		getPersistence().cacheResult(state_Senate);
	}

	/**
	* Caches the state_ senates in the entity cache if it is enabled.
	*
	* @param state_Senates the state_ senates
	*/
	public static void cacheResult(List<State_Senate> state_Senates) {
		getPersistence().cacheResult(state_Senates);
	}

	/**
	* Creates a new state_ senate with the primary key. Does not add the state_ senate to the database.
	*
	* @param stateSenateId the primary key for the new state_ senate
	* @return the new state_ senate
	*/
	public static State_Senate create(long stateSenateId) {
		return getPersistence().create(stateSenateId);
	}

	/**
	* Removes the state_ senate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stateSenateId the primary key of the state_ senate
	* @return the state_ senate that was removed
	* @throws NoSuchState_SenateException if a state_ senate with the primary key could not be found
	*/
	public static State_Senate remove(long stateSenateId)
		throws contact.manager.service.exception.NoSuchState_SenateException {
		return getPersistence().remove(stateSenateId);
	}

	public static State_Senate updateImpl(State_Senate state_Senate) {
		return getPersistence().updateImpl(state_Senate);
	}

	/**
	* Returns the state_ senate with the primary key or throws a {@link NoSuchState_SenateException} if it could not be found.
	*
	* @param stateSenateId the primary key of the state_ senate
	* @return the state_ senate
	* @throws NoSuchState_SenateException if a state_ senate with the primary key could not be found
	*/
	public static State_Senate findByPrimaryKey(long stateSenateId)
		throws contact.manager.service.exception.NoSuchState_SenateException {
		return getPersistence().findByPrimaryKey(stateSenateId);
	}

	/**
	* Returns the state_ senate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stateSenateId the primary key of the state_ senate
	* @return the state_ senate, or <code>null</code> if a state_ senate with the primary key could not be found
	*/
	public static State_Senate fetchByPrimaryKey(long stateSenateId) {
		return getPersistence().fetchByPrimaryKey(stateSenateId);
	}

	public static java.util.Map<java.io.Serializable, State_Senate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the state_ senates.
	*
	* @return the state_ senates
	*/
	public static List<State_Senate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the state_ senates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ senates
	* @param end the upper bound of the range of state_ senates (not inclusive)
	* @return the range of state_ senates
	*/
	public static List<State_Senate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the state_ senates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ senates
	* @param end the upper bound of the range of state_ senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of state_ senates
	*/
	public static List<State_Senate> findAll(int start, int end,
		OrderByComparator<State_Senate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the state_ senates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ senates
	* @param end the upper bound of the range of state_ senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of state_ senates
	*/
	public static List<State_Senate> findAll(int start, int end,
		OrderByComparator<State_Senate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the state_ senates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of state_ senates.
	*
	* @return the number of state_ senates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static State_SenatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<State_SenatePersistence, State_SenatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(State_SenatePersistence.class);
}