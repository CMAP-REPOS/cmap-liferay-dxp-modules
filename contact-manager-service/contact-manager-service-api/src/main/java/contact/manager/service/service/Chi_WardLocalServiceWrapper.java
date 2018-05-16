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
 * Provides a wrapper for {@link Chi_WardLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Chi_WardLocalService
 * @generated
 */
@ProviderType
public class Chi_WardLocalServiceWrapper implements Chi_WardLocalService,
	ServiceWrapper<Chi_WardLocalService> {
	public Chi_WardLocalServiceWrapper(
		Chi_WardLocalService chi_WardLocalService) {
		_chi_WardLocalService = chi_WardLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _chi_WardLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _chi_WardLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _chi_WardLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _chi_WardLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _chi_WardLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the chi_ ward to the database. Also notifies the appropriate model listeners.
	*
	* @param chi_Ward the chi_ ward
	* @return the chi_ ward that was added
	*/
	@Override
	public contact.manager.service.model.Chi_Ward addChi_Ward(
		contact.manager.service.model.Chi_Ward chi_Ward) {
		return _chi_WardLocalService.addChi_Ward(chi_Ward);
	}

	/**
	* Creates a new chi_ ward with the primary key. Does not add the chi_ ward to the database.
	*
	* @param chiWardId the primary key for the new chi_ ward
	* @return the new chi_ ward
	*/
	@Override
	public contact.manager.service.model.Chi_Ward createChi_Ward(long chiWardId) {
		return _chi_WardLocalService.createChi_Ward(chiWardId);
	}

	/**
	* Deletes the chi_ ward from the database. Also notifies the appropriate model listeners.
	*
	* @param chi_Ward the chi_ ward
	* @return the chi_ ward that was removed
	*/
	@Override
	public contact.manager.service.model.Chi_Ward deleteChi_Ward(
		contact.manager.service.model.Chi_Ward chi_Ward) {
		return _chi_WardLocalService.deleteChi_Ward(chi_Ward);
	}

	/**
	* Deletes the chi_ ward with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param chiWardId the primary key of the chi_ ward
	* @return the chi_ ward that was removed
	* @throws PortalException if a chi_ ward with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.Chi_Ward deleteChi_Ward(long chiWardId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _chi_WardLocalService.deleteChi_Ward(chiWardId);
	}

	@Override
	public contact.manager.service.model.Chi_Ward fetchChi_Ward(long chiWardId) {
		return _chi_WardLocalService.fetchChi_Ward(chiWardId);
	}

	/**
	* Returns the chi_ ward with the primary key.
	*
	* @param chiWardId the primary key of the chi_ ward
	* @return the chi_ ward
	* @throws PortalException if a chi_ ward with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.Chi_Ward getChi_Ward(long chiWardId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _chi_WardLocalService.getChi_Ward(chiWardId);
	}

	/**
	* Updates the chi_ ward in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param chi_Ward the chi_ ward
	* @return the chi_ ward that was updated
	*/
	@Override
	public contact.manager.service.model.Chi_Ward updateChi_Ward(
		contact.manager.service.model.Chi_Ward chi_Ward) {
		return _chi_WardLocalService.updateChi_Ward(chi_Ward);
	}

	/**
	* Returns the number of chi_ wards.
	*
	* @return the number of chi_ wards
	*/
	@Override
	public int getChi_WardsCount() {
		return _chi_WardLocalService.getChi_WardsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _chi_WardLocalService.getOSGiServiceIdentifier();
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
		return _chi_WardLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _chi_WardLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _chi_WardLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the chi_ wards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.Chi_WardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chi_ wards
	* @param end the upper bound of the range of chi_ wards (not inclusive)
	* @return the range of chi_ wards
	*/
	@Override
	public java.util.List<contact.manager.service.model.Chi_Ward> getChi_Wards(
		int start, int end) {
		return _chi_WardLocalService.getChi_Wards(start, end);
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
		return _chi_WardLocalService.dynamicQueryCount(dynamicQuery);
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
		return _chi_WardLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public Chi_WardLocalService getWrappedService() {
		return _chi_WardLocalService;
	}

	@Override
	public void setWrappedService(Chi_WardLocalService chi_WardLocalService) {
		_chi_WardLocalService = chi_WardLocalService;
	}

	private Chi_WardLocalService _chi_WardLocalService;
}