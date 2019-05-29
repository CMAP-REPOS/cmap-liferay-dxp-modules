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

import ucc.portal.model.UccConference;

import java.util.List;

/**
 * The persistence utility for the ucc conference service. This utility wraps {@link ucc.portal.service.persistence.impl.UccConferencePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccConferencePersistence
 * @see ucc.portal.service.persistence.impl.UccConferencePersistenceImpl
 * @generated
 */
@ProviderType
public class UccConferenceUtil {
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
	public static void clearCache(UccConference uccConference) {
		getPersistence().clearCache(uccConference);
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
	public static List<UccConference> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UccConference> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UccConference> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UccConference> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UccConference update(UccConference uccConference) {
		return getPersistence().update(uccConference);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UccConference update(UccConference uccConference,
		ServiceContext serviceContext) {
		return getPersistence().update(uccConference, serviceContext);
	}

	/**
	* Caches the ucc conference in the entity cache if it is enabled.
	*
	* @param uccConference the ucc conference
	*/
	public static void cacheResult(UccConference uccConference) {
		getPersistence().cacheResult(uccConference);
	}

	/**
	* Caches the ucc conferences in the entity cache if it is enabled.
	*
	* @param uccConferences the ucc conferences
	*/
	public static void cacheResult(List<UccConference> uccConferences) {
		getPersistence().cacheResult(uccConferences);
	}

	/**
	* Creates a new ucc conference with the primary key. Does not add the ucc conference to the database.
	*
	* @param uccConferenceId the primary key for the new ucc conference
	* @return the new ucc conference
	*/
	public static UccConference create(int uccConferenceId) {
		return getPersistence().create(uccConferenceId);
	}

	/**
	* Removes the ucc conference with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccConferenceId the primary key of the ucc conference
	* @return the ucc conference that was removed
	* @throws NoSuchUccConferenceException if a ucc conference with the primary key could not be found
	*/
	public static UccConference remove(int uccConferenceId)
		throws ucc.portal.exception.NoSuchUccConferenceException {
		return getPersistence().remove(uccConferenceId);
	}

	public static UccConference updateImpl(UccConference uccConference) {
		return getPersistence().updateImpl(uccConference);
	}

	/**
	* Returns the ucc conference with the primary key or throws a {@link NoSuchUccConferenceException} if it could not be found.
	*
	* @param uccConferenceId the primary key of the ucc conference
	* @return the ucc conference
	* @throws NoSuchUccConferenceException if a ucc conference with the primary key could not be found
	*/
	public static UccConference findByPrimaryKey(int uccConferenceId)
		throws ucc.portal.exception.NoSuchUccConferenceException {
		return getPersistence().findByPrimaryKey(uccConferenceId);
	}

	/**
	* Returns the ucc conference with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param uccConferenceId the primary key of the ucc conference
	* @return the ucc conference, or <code>null</code> if a ucc conference with the primary key could not be found
	*/
	public static UccConference fetchByPrimaryKey(int uccConferenceId) {
		return getPersistence().fetchByPrimaryKey(uccConferenceId);
	}

	public static java.util.Map<java.io.Serializable, UccConference> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ucc conferences.
	*
	* @return the ucc conferences
	*/
	public static List<UccConference> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ucc conferences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccConferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc conferences
	* @param end the upper bound of the range of ucc conferences (not inclusive)
	* @return the range of ucc conferences
	*/
	public static List<UccConference> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ucc conferences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccConferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc conferences
	* @param end the upper bound of the range of ucc conferences (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ucc conferences
	*/
	public static List<UccConference> findAll(int start, int end,
		OrderByComparator<UccConference> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ucc conferences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccConferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc conferences
	* @param end the upper bound of the range of ucc conferences (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ucc conferences
	*/
	public static List<UccConference> findAll(int start, int end,
		OrderByComparator<UccConference> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ucc conferences from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ucc conferences.
	*
	* @return the number of ucc conferences
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static UccConferencePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UccConferencePersistence, UccConferencePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UccConferencePersistence.class);

		ServiceTracker<UccConferencePersistence, UccConferencePersistence> serviceTracker =
			new ServiceTracker<UccConferencePersistence, UccConferencePersistence>(bundle.getBundleContext(),
				UccConferencePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}