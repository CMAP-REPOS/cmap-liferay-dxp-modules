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
 * Provides a wrapper for {@link County_Commissioner_or_Board_DistLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see County_Commissioner_or_Board_DistLocalService
 * @generated
 */
@ProviderType
public class County_Commissioner_or_Board_DistLocalServiceWrapper
	implements County_Commissioner_or_Board_DistLocalService,
		ServiceWrapper<County_Commissioner_or_Board_DistLocalService> {
	public County_Commissioner_or_Board_DistLocalServiceWrapper(
		County_Commissioner_or_Board_DistLocalService county_Commissioner_or_Board_DistLocalService) {
		_county_Commissioner_or_Board_DistLocalService = county_Commissioner_or_Board_DistLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _county_Commissioner_or_Board_DistLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _county_Commissioner_or_Board_DistLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _county_Commissioner_or_Board_DistLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _county_Commissioner_or_Board_DistLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _county_Commissioner_or_Board_DistLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the county_ commissioner_or_ board_ dist to the database. Also notifies the appropriate model listeners.
	*
	* @param county_Commissioner_or_Board_Dist the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist that was added
	*/
	@Override
	public contact.manager.service.model.County_Commissioner_or_Board_Dist addCounty_Commissioner_or_Board_Dist(
		contact.manager.service.model.County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		return _county_Commissioner_or_Board_DistLocalService.addCounty_Commissioner_or_Board_Dist(county_Commissioner_or_Board_Dist);
	}

	/**
	* Creates a new county_ commissioner_or_ board_ dist with the primary key. Does not add the county_ commissioner_or_ board_ dist to the database.
	*
	* @param ccbdId the primary key for the new county_ commissioner_or_ board_ dist
	* @return the new county_ commissioner_or_ board_ dist
	*/
	@Override
	public contact.manager.service.model.County_Commissioner_or_Board_Dist createCounty_Commissioner_or_Board_Dist(
		long ccbdId) {
		return _county_Commissioner_or_Board_DistLocalService.createCounty_Commissioner_or_Board_Dist(ccbdId);
	}

	/**
	* Deletes the county_ commissioner_or_ board_ dist from the database. Also notifies the appropriate model listeners.
	*
	* @param county_Commissioner_or_Board_Dist the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist that was removed
	*/
	@Override
	public contact.manager.service.model.County_Commissioner_or_Board_Dist deleteCounty_Commissioner_or_Board_Dist(
		contact.manager.service.model.County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		return _county_Commissioner_or_Board_DistLocalService.deleteCounty_Commissioner_or_Board_Dist(county_Commissioner_or_Board_Dist);
	}

	/**
	* Deletes the county_ commissioner_or_ board_ dist with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist that was removed
	* @throws PortalException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.County_Commissioner_or_Board_Dist deleteCounty_Commissioner_or_Board_Dist(
		long ccbdId) throws com.liferay.portal.kernel.exception.PortalException {
		return _county_Commissioner_or_Board_DistLocalService.deleteCounty_Commissioner_or_Board_Dist(ccbdId);
	}

	@Override
	public contact.manager.service.model.County_Commissioner_or_Board_Dist fetchCounty_Commissioner_or_Board_Dist(
		long ccbdId) {
		return _county_Commissioner_or_Board_DistLocalService.fetchCounty_Commissioner_or_Board_Dist(ccbdId);
	}

	/**
	* Returns the county_ commissioner_or_ board_ dist with the primary key.
	*
	* @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist
	* @throws PortalException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.County_Commissioner_or_Board_Dist getCounty_Commissioner_or_Board_Dist(
		long ccbdId) throws com.liferay.portal.kernel.exception.PortalException {
		return _county_Commissioner_or_Board_DistLocalService.getCounty_Commissioner_or_Board_Dist(ccbdId);
	}

	/**
	* Updates the county_ commissioner_or_ board_ dist in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param county_Commissioner_or_Board_Dist the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist that was updated
	*/
	@Override
	public contact.manager.service.model.County_Commissioner_or_Board_Dist updateCounty_Commissioner_or_Board_Dist(
		contact.manager.service.model.County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		return _county_Commissioner_or_Board_DistLocalService.updateCounty_Commissioner_or_Board_Dist(county_Commissioner_or_Board_Dist);
	}

	/**
	* Returns the number of county_ commissioner_or_ board_ dists.
	*
	* @return the number of county_ commissioner_or_ board_ dists
	*/
	@Override
	public int getCounty_Commissioner_or_Board_DistsCount() {
		return _county_Commissioner_or_Board_DistLocalService.getCounty_Commissioner_or_Board_DistsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _county_Commissioner_or_Board_DistLocalService.getOSGiServiceIdentifier();
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
		return _county_Commissioner_or_Board_DistLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _county_Commissioner_or_Board_DistLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _county_Commissioner_or_Board_DistLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the county_ commissioner_or_ board_ dists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of county_ commissioner_or_ board_ dists
	* @param end the upper bound of the range of county_ commissioner_or_ board_ dists (not inclusive)
	* @return the range of county_ commissioner_or_ board_ dists
	*/
	@Override
	public java.util.List<contact.manager.service.model.County_Commissioner_or_Board_Dist> getCounty_Commissioner_or_Board_Dists(
		int start, int end) {
		return _county_Commissioner_or_Board_DistLocalService.getCounty_Commissioner_or_Board_Dists(start,
			end);
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
		return _county_Commissioner_or_Board_DistLocalService.dynamicQueryCount(dynamicQuery);
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
		return _county_Commissioner_or_Board_DistLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public County_Commissioner_or_Board_DistLocalService getWrappedService() {
		return _county_Commissioner_or_Board_DistLocalService;
	}

	@Override
	public void setWrappedService(
		County_Commissioner_or_Board_DistLocalService county_Commissioner_or_Board_DistLocalService) {
		_county_Commissioner_or_Board_DistLocalService = county_Commissioner_or_Board_DistLocalService;
	}

	private County_Commissioner_or_Board_DistLocalService _county_Commissioner_or_Board_DistLocalService;
}