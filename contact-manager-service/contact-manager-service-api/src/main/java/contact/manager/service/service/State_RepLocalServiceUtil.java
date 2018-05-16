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

package contact.manager.service.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for State_Rep. This utility wraps
 * {@link contact.manager.service.service.impl.State_RepLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see State_RepLocalService
 * @see contact.manager.service.service.base.State_RepLocalServiceBaseImpl
 * @see contact.manager.service.service.impl.State_RepLocalServiceImpl
 * @generated
 */
@ProviderType
public class State_RepLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.service.impl.State_RepLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the state_ rep to the database. Also notifies the appropriate model listeners.
	*
	* @param state_Rep the state_ rep
	* @return the state_ rep that was added
	*/
	public static contact.manager.service.model.State_Rep addState_Rep(
		contact.manager.service.model.State_Rep state_Rep) {
		return getService().addState_Rep(state_Rep);
	}

	/**
	* Creates a new state_ rep with the primary key. Does not add the state_ rep to the database.
	*
	* @param stateRepId the primary key for the new state_ rep
	* @return the new state_ rep
	*/
	public static contact.manager.service.model.State_Rep createState_Rep(
		long stateRepId) {
		return getService().createState_Rep(stateRepId);
	}

	/**
	* Deletes the state_ rep from the database. Also notifies the appropriate model listeners.
	*
	* @param state_Rep the state_ rep
	* @return the state_ rep that was removed
	*/
	public static contact.manager.service.model.State_Rep deleteState_Rep(
		contact.manager.service.model.State_Rep state_Rep) {
		return getService().deleteState_Rep(state_Rep);
	}

	/**
	* Deletes the state_ rep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stateRepId the primary key of the state_ rep
	* @return the state_ rep that was removed
	* @throws PortalException if a state_ rep with the primary key could not be found
	*/
	public static contact.manager.service.model.State_Rep deleteState_Rep(
		long stateRepId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteState_Rep(stateRepId);
	}

	public static contact.manager.service.model.State_Rep fetchState_Rep(
		long stateRepId) {
		return getService().fetchState_Rep(stateRepId);
	}

	/**
	* Returns the state_ rep with the primary key.
	*
	* @param stateRepId the primary key of the state_ rep
	* @return the state_ rep
	* @throws PortalException if a state_ rep with the primary key could not be found
	*/
	public static contact.manager.service.model.State_Rep getState_Rep(
		long stateRepId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getState_Rep(stateRepId);
	}

	/**
	* Updates the state_ rep in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param state_Rep the state_ rep
	* @return the state_ rep that was updated
	*/
	public static contact.manager.service.model.State_Rep updateState_Rep(
		contact.manager.service.model.State_Rep state_Rep) {
		return getService().updateState_Rep(state_Rep);
	}

	/**
	* Returns the number of state_ reps.
	*
	* @return the number of state_ reps
	*/
	public static int getState_RepsCount() {
		return getService().getState_RepsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the state_ reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ reps
	* @param end the upper bound of the range of state_ reps (not inclusive)
	* @return the range of state_ reps
	*/
	public static java.util.List<contact.manager.service.model.State_Rep> getState_Reps(
		int start, int end) {
		return getService().getState_Reps(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static State_RepLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<State_RepLocalService, State_RepLocalService> _serviceTracker =
		ServiceTrackerFactory.open(State_RepLocalService.class);
}