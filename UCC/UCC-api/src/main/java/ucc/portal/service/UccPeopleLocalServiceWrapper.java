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

package ucc.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UccPeopleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UccPeopleLocalService
 * @generated
 */
@ProviderType
public class UccPeopleLocalServiceWrapper implements UccPeopleLocalService,
	ServiceWrapper<UccPeopleLocalService> {
	public UccPeopleLocalServiceWrapper(
		UccPeopleLocalService uccPeopleLocalService) {
		_uccPeopleLocalService = uccPeopleLocalService;
	}

	/**
	* Adds the ucc people to the database. Also notifies the appropriate model listeners.
	*
	* @param uccPeople the ucc people
	* @return the ucc people that was added
	*/
	@Override
	public ucc.portal.model.UccPeople addUccPeople(
		ucc.portal.model.UccPeople uccPeople) {
		return _uccPeopleLocalService.addUccPeople(uccPeople);
	}

	/**
	* Creates a new ucc people with the primary key. Does not add the ucc people to the database.
	*
	* @param uccPeopleId the primary key for the new ucc people
	* @return the new ucc people
	*/
	@Override
	public ucc.portal.model.UccPeople createUccPeople(int uccPeopleId) {
		return _uccPeopleLocalService.createUccPeople(uccPeopleId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _uccPeopleLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the ucc people with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccPeopleId the primary key of the ucc people
	* @return the ucc people that was removed
	* @throws PortalException if a ucc people with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.UccPeople deleteUccPeople(int uccPeopleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _uccPeopleLocalService.deleteUccPeople(uccPeopleId);
	}

	/**
	* Deletes the ucc people from the database. Also notifies the appropriate model listeners.
	*
	* @param uccPeople the ucc people
	* @return the ucc people that was removed
	*/
	@Override
	public ucc.portal.model.UccPeople deleteUccPeople(
		ucc.portal.model.UccPeople uccPeople) {
		return _uccPeopleLocalService.deleteUccPeople(uccPeople);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _uccPeopleLocalService.dynamicQuery();
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
		return _uccPeopleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _uccPeopleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _uccPeopleLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _uccPeopleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _uccPeopleLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ucc.portal.model.UccPeople fetchUccPeople(int uccPeopleId) {
		return _uccPeopleLocalService.fetchUccPeople(uccPeopleId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _uccPeopleLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _uccPeopleLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _uccPeopleLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _uccPeopleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the ucc people with the primary key.
	*
	* @param uccPeopleId the primary key of the ucc people
	* @return the ucc people
	* @throws PortalException if a ucc people with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.UccPeople getUccPeople(int uccPeopleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _uccPeopleLocalService.getUccPeople(uccPeopleId);
	}

	/**
	* Returns a range of all the ucc peoples.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc peoples
	* @param end the upper bound of the range of ucc peoples (not inclusive)
	* @return the range of ucc peoples
	*/
	@Override
	public java.util.List<ucc.portal.model.UccPeople> getUccPeoples(int start,
		int end) {
		return _uccPeopleLocalService.getUccPeoples(start, end);
	}

	/**
	* Returns the number of ucc peoples.
	*
	* @return the number of ucc peoples
	*/
	@Override
	public int getUccPeoplesCount() {
		return _uccPeopleLocalService.getUccPeoplesCount();
	}

	/**
	* Updates the ucc people in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param uccPeople the ucc people
	* @return the ucc people that was updated
	*/
	@Override
	public ucc.portal.model.UccPeople updateUccPeople(
		ucc.portal.model.UccPeople uccPeople) {
		return _uccPeopleLocalService.updateUccPeople(uccPeople);
	}

	@Override
	public UccPeopleLocalService getWrappedService() {
		return _uccPeopleLocalService;
	}

	@Override
	public void setWrappedService(UccPeopleLocalService uccPeopleLocalService) {
		_uccPeopleLocalService = uccPeopleLocalService;
	}

	private UccPeopleLocalService _uccPeopleLocalService;
}