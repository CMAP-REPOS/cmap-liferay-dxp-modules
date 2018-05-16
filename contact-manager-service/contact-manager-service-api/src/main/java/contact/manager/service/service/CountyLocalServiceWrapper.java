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
 * Provides a wrapper for {@link CountyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CountyLocalService
 * @generated
 */
@ProviderType
public class CountyLocalServiceWrapper implements CountyLocalService,
	ServiceWrapper<CountyLocalService> {
	public CountyLocalServiceWrapper(CountyLocalService countyLocalService) {
		_countyLocalService = countyLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _countyLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _countyLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _countyLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _countyLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _countyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the county to the database. Also notifies the appropriate model listeners.
	*
	* @param county the county
	* @return the county that was added
	*/
	@Override
	public contact.manager.service.model.County addCounty(
		contact.manager.service.model.County county) {
		return _countyLocalService.addCounty(county);
	}

	/**
	* Creates a new county with the primary key. Does not add the county to the database.
	*
	* @param countyId the primary key for the new county
	* @return the new county
	*/
	@Override
	public contact.manager.service.model.County createCounty(long countyId) {
		return _countyLocalService.createCounty(countyId);
	}

	/**
	* Deletes the county from the database. Also notifies the appropriate model listeners.
	*
	* @param county the county
	* @return the county that was removed
	*/
	@Override
	public contact.manager.service.model.County deleteCounty(
		contact.manager.service.model.County county) {
		return _countyLocalService.deleteCounty(county);
	}

	/**
	* Deletes the county with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param countyId the primary key of the county
	* @return the county that was removed
	* @throws PortalException if a county with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.County deleteCounty(long countyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _countyLocalService.deleteCounty(countyId);
	}

	@Override
	public contact.manager.service.model.County fetchCounty(long countyId) {
		return _countyLocalService.fetchCounty(countyId);
	}

	/**
	* Returns the county with the primary key.
	*
	* @param countyId the primary key of the county
	* @return the county
	* @throws PortalException if a county with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.County getCounty(long countyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _countyLocalService.getCounty(countyId);
	}

	/**
	* Updates the county in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param county the county
	* @return the county that was updated
	*/
	@Override
	public contact.manager.service.model.County updateCounty(
		contact.manager.service.model.County county) {
		return _countyLocalService.updateCounty(county);
	}

	/**
	* Returns the number of counties.
	*
	* @return the number of counties
	*/
	@Override
	public int getCountiesCount() {
		return _countyLocalService.getCountiesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _countyLocalService.getOSGiServiceIdentifier();
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
		return _countyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _countyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _countyLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the counties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of counties
	* @param end the upper bound of the range of counties (not inclusive)
	* @return the range of counties
	*/
	@Override
	public java.util.List<contact.manager.service.model.County> getCounties(
		int start, int end) {
		return _countyLocalService.getCounties(start, end);
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
		return _countyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _countyLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CountyLocalService getWrappedService() {
		return _countyLocalService;
	}

	@Override
	public void setWrappedService(CountyLocalService countyLocalService) {
		_countyLocalService = countyLocalService;
	}

	private CountyLocalService _countyLocalService;
}