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
 * Provides a wrapper for {@link UccPeopleAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UccPeopleAddressLocalService
 * @generated
 */
@ProviderType
public class UccPeopleAddressLocalServiceWrapper
	implements UccPeopleAddressLocalService,
		ServiceWrapper<UccPeopleAddressLocalService> {
	public UccPeopleAddressLocalServiceWrapper(
		UccPeopleAddressLocalService uccPeopleAddressLocalService) {
		_uccPeopleAddressLocalService = uccPeopleAddressLocalService;
	}

	/**
	* Adds the ucc people address to the database. Also notifies the appropriate model listeners.
	*
	* @param uccPeopleAddress the ucc people address
	* @return the ucc people address that was added
	*/
	@Override
	public ucc.portal.model.UccPeopleAddress addUccPeopleAddress(
		ucc.portal.model.UccPeopleAddress uccPeopleAddress) {
		return _uccPeopleAddressLocalService.addUccPeopleAddress(uccPeopleAddress);
	}

	/**
	* Creates a new ucc people address with the primary key. Does not add the ucc people address to the database.
	*
	* @param uccPeopleAddressId the primary key for the new ucc people address
	* @return the new ucc people address
	*/
	@Override
	public ucc.portal.model.UccPeopleAddress createUccPeopleAddress(
		int uccPeopleAddressId) {
		return _uccPeopleAddressLocalService.createUccPeopleAddress(uccPeopleAddressId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _uccPeopleAddressLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the ucc people address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccPeopleAddressId the primary key of the ucc people address
	* @return the ucc people address that was removed
	* @throws PortalException if a ucc people address with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.UccPeopleAddress deleteUccPeopleAddress(
		int uccPeopleAddressId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _uccPeopleAddressLocalService.deleteUccPeopleAddress(uccPeopleAddressId);
	}

	/**
	* Deletes the ucc people address from the database. Also notifies the appropriate model listeners.
	*
	* @param uccPeopleAddress the ucc people address
	* @return the ucc people address that was removed
	*/
	@Override
	public ucc.portal.model.UccPeopleAddress deleteUccPeopleAddress(
		ucc.portal.model.UccPeopleAddress uccPeopleAddress) {
		return _uccPeopleAddressLocalService.deleteUccPeopleAddress(uccPeopleAddress);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _uccPeopleAddressLocalService.dynamicQuery();
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
		return _uccPeopleAddressLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _uccPeopleAddressLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _uccPeopleAddressLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _uccPeopleAddressLocalService.dynamicQueryCount(dynamicQuery);
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
		return _uccPeopleAddressLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ucc.portal.model.UccPeopleAddress fetchUccPeopleAddress(
		int uccPeopleAddressId) {
		return _uccPeopleAddressLocalService.fetchUccPeopleAddress(uccPeopleAddressId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _uccPeopleAddressLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _uccPeopleAddressLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _uccPeopleAddressLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _uccPeopleAddressLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the ucc people address with the primary key.
	*
	* @param uccPeopleAddressId the primary key of the ucc people address
	* @return the ucc people address
	* @throws PortalException if a ucc people address with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.UccPeopleAddress getUccPeopleAddress(
		int uccPeopleAddressId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _uccPeopleAddressLocalService.getUccPeopleAddress(uccPeopleAddressId);
	}

	/**
	* Returns a range of all the ucc people addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc people addresses
	* @param end the upper bound of the range of ucc people addresses (not inclusive)
	* @return the range of ucc people addresses
	*/
	@Override
	public java.util.List<ucc.portal.model.UccPeopleAddress> getUccPeopleAddresses(
		int start, int end) {
		return _uccPeopleAddressLocalService.getUccPeopleAddresses(start, end);
	}

	/**
	* Returns the number of ucc people addresses.
	*
	* @return the number of ucc people addresses
	*/
	@Override
	public int getUccPeopleAddressesCount() {
		return _uccPeopleAddressLocalService.getUccPeopleAddressesCount();
	}

	/**
	* Updates the ucc people address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param uccPeopleAddress the ucc people address
	* @return the ucc people address that was updated
	*/
	@Override
	public ucc.portal.model.UccPeopleAddress updateUccPeopleAddress(
		ucc.portal.model.UccPeopleAddress uccPeopleAddress) {
		return _uccPeopleAddressLocalService.updateUccPeopleAddress(uccPeopleAddress);
	}

	@Override
	public UccPeopleAddressLocalService getWrappedService() {
		return _uccPeopleAddressLocalService;
	}

	@Override
	public void setWrappedService(
		UccPeopleAddressLocalService uccPeopleAddressLocalService) {
		_uccPeopleAddressLocalService = uccPeopleAddressLocalService;
	}

	private UccPeopleAddressLocalService _uccPeopleAddressLocalService;
}