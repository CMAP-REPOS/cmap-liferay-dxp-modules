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
 * Provides a wrapper for {@link ExtKeyAccomplishmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExtKeyAccomplishmentLocalService
 * @generated
 */
@ProviderType
public class ExtKeyAccomplishmentLocalServiceWrapper
	implements ExtKeyAccomplishmentLocalService,
		ServiceWrapper<ExtKeyAccomplishmentLocalService> {
	public ExtKeyAccomplishmentLocalServiceWrapper(
		ExtKeyAccomplishmentLocalService extKeyAccomplishmentLocalService) {
		_extKeyAccomplishmentLocalService = extKeyAccomplishmentLocalService;
	}

	/**
	* Adds the ext key accomplishment to the database. Also notifies the appropriate model listeners.
	*
	* @param extKeyAccomplishment the ext key accomplishment
	* @return the ext key accomplishment that was added
	*/
	@Override
	public ucc.portal.model.ExtKeyAccomplishment addExtKeyAccomplishment(
		ucc.portal.model.ExtKeyAccomplishment extKeyAccomplishment) {
		return _extKeyAccomplishmentLocalService.addExtKeyAccomplishment(extKeyAccomplishment);
	}

	/**
	* Creates a new ext key accomplishment with the primary key. Does not add the ext key accomplishment to the database.
	*
	* @param extKeyAccomplishmentId the primary key for the new ext key accomplishment
	* @return the new ext key accomplishment
	*/
	@Override
	public ucc.portal.model.ExtKeyAccomplishment createExtKeyAccomplishment(
		long extKeyAccomplishmentId) {
		return _extKeyAccomplishmentLocalService.createExtKeyAccomplishment(extKeyAccomplishmentId);
	}

	/**
	* Deletes the ext key accomplishment from the database. Also notifies the appropriate model listeners.
	*
	* @param extKeyAccomplishment the ext key accomplishment
	* @return the ext key accomplishment that was removed
	*/
	@Override
	public ucc.portal.model.ExtKeyAccomplishment deleteExtKeyAccomplishment(
		ucc.portal.model.ExtKeyAccomplishment extKeyAccomplishment) {
		return _extKeyAccomplishmentLocalService.deleteExtKeyAccomplishment(extKeyAccomplishment);
	}

	/**
	* Deletes the ext key accomplishment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extKeyAccomplishmentId the primary key of the ext key accomplishment
	* @return the ext key accomplishment that was removed
	* @throws PortalException if a ext key accomplishment with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.ExtKeyAccomplishment deleteExtKeyAccomplishment(
		long extKeyAccomplishmentId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _extKeyAccomplishmentLocalService.deleteExtKeyAccomplishment(extKeyAccomplishmentId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _extKeyAccomplishmentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _extKeyAccomplishmentLocalService.dynamicQuery();
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
		return _extKeyAccomplishmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _extKeyAccomplishmentLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _extKeyAccomplishmentLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _extKeyAccomplishmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _extKeyAccomplishmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ucc.portal.model.ExtKeyAccomplishment fetchExtKeyAccomplishment(
		long extKeyAccomplishmentId) {
		return _extKeyAccomplishmentLocalService.fetchExtKeyAccomplishment(extKeyAccomplishmentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _extKeyAccomplishmentLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the ext key accomplishment with the primary key.
	*
	* @param extKeyAccomplishmentId the primary key of the ext key accomplishment
	* @return the ext key accomplishment
	* @throws PortalException if a ext key accomplishment with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.ExtKeyAccomplishment getExtKeyAccomplishment(
		long extKeyAccomplishmentId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _extKeyAccomplishmentLocalService.getExtKeyAccomplishment(extKeyAccomplishmentId);
	}

	/**
	* Returns a range of all the ext key accomplishments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtKeyAccomplishmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext key accomplishments
	* @param end the upper bound of the range of ext key accomplishments (not inclusive)
	* @return the range of ext key accomplishments
	*/
	@Override
	public java.util.List<ucc.portal.model.ExtKeyAccomplishment> getExtKeyAccomplishments(
		int start, int end) {
		return _extKeyAccomplishmentLocalService.getExtKeyAccomplishments(start,
			end);
	}

	/**
	* Returns the number of ext key accomplishments.
	*
	* @return the number of ext key accomplishments
	*/
	@Override
	public int getExtKeyAccomplishmentsCount() {
		return _extKeyAccomplishmentLocalService.getExtKeyAccomplishmentsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _extKeyAccomplishmentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _extKeyAccomplishmentLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _extKeyAccomplishmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the ext key accomplishment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param extKeyAccomplishment the ext key accomplishment
	* @return the ext key accomplishment that was updated
	*/
	@Override
	public ucc.portal.model.ExtKeyAccomplishment updateExtKeyAccomplishment(
		ucc.portal.model.ExtKeyAccomplishment extKeyAccomplishment) {
		return _extKeyAccomplishmentLocalService.updateExtKeyAccomplishment(extKeyAccomplishment);
	}

	@Override
	public ExtKeyAccomplishmentLocalService getWrappedService() {
		return _extKeyAccomplishmentLocalService;
	}

	@Override
	public void setWrappedService(
		ExtKeyAccomplishmentLocalService extKeyAccomplishmentLocalService) {
		_extKeyAccomplishmentLocalService = extKeyAccomplishmentLocalService;
	}

	private ExtKeyAccomplishmentLocalService _extKeyAccomplishmentLocalService;
}