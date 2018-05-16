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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link State_SenateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see State_SenateLocalService
 * @generated
 */
@ProviderType
public class State_SenateLocalServiceWrapper implements State_SenateLocalService,
	ServiceWrapper<State_SenateLocalService> {
	public State_SenateLocalServiceWrapper(
		State_SenateLocalService state_SenateLocalService) {
		_state_SenateLocalService = state_SenateLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _state_SenateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _state_SenateLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _state_SenateLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _state_SenateLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _state_SenateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the state_ senate to the database. Also notifies the appropriate model listeners.
	*
	* @param state_Senate the state_ senate
	* @return the state_ senate that was added
	*/
	@Override
	public contact.manager.service.model.State_Senate addState_Senate(
		contact.manager.service.model.State_Senate state_Senate) {
		return _state_SenateLocalService.addState_Senate(state_Senate);
	}

	/**
	* Creates a new state_ senate with the primary key. Does not add the state_ senate to the database.
	*
	* @param stateSenateId the primary key for the new state_ senate
	* @return the new state_ senate
	*/
	@Override
	public contact.manager.service.model.State_Senate createState_Senate(
		long stateSenateId) {
		return _state_SenateLocalService.createState_Senate(stateSenateId);
	}

	/**
	* Deletes the state_ senate from the database. Also notifies the appropriate model listeners.
	*
	* @param state_Senate the state_ senate
	* @return the state_ senate that was removed
	*/
	@Override
	public contact.manager.service.model.State_Senate deleteState_Senate(
		contact.manager.service.model.State_Senate state_Senate) {
		return _state_SenateLocalService.deleteState_Senate(state_Senate);
	}

	/**
	* Deletes the state_ senate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stateSenateId the primary key of the state_ senate
	* @return the state_ senate that was removed
	* @throws PortalException if a state_ senate with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.State_Senate deleteState_Senate(
		long stateSenateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _state_SenateLocalService.deleteState_Senate(stateSenateId);
	}

	@Override
	public contact.manager.service.model.State_Senate fetchState_Senate(
		long stateSenateId) {
		return _state_SenateLocalService.fetchState_Senate(stateSenateId);
	}

	/**
	* Returns the state_ senate with the primary key.
	*
	* @param stateSenateId the primary key of the state_ senate
	* @return the state_ senate
	* @throws PortalException if a state_ senate with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.State_Senate getState_Senate(
		long stateSenateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _state_SenateLocalService.getState_Senate(stateSenateId);
	}

	/**
	* Updates the state_ senate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param state_Senate the state_ senate
	* @return the state_ senate that was updated
	*/
	@Override
	public contact.manager.service.model.State_Senate updateState_Senate(
		contact.manager.service.model.State_Senate state_Senate) {
		return _state_SenateLocalService.updateState_Senate(state_Senate);
	}

	/**
	* Returns the number of state_ senates.
	*
	* @return the number of state_ senates
	*/
	@Override
	public int getState_SenatesCount() {
		return _state_SenateLocalService.getState_SenatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _state_SenateLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _state_SenateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _state_SenateLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _state_SenateLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the state_ senates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ senates
	* @param end the upper bound of the range of state_ senates (not inclusive)
	* @return the range of state_ senates
	*/
	@Override
	public java.util.List<contact.manager.service.model.State_Senate> getState_Senates(
		int start, int end) {
		return _state_SenateLocalService.getState_Senates(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _state_SenateLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _state_SenateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public State_SenateLocalService getWrappedService() {
		return _state_SenateLocalService;
	}

	@Override
	public void setWrappedService(
		State_SenateLocalService state_SenateLocalService) {
		_state_SenateLocalService = state_SenateLocalService;
	}

	private State_SenateLocalService _state_SenateLocalService;
}