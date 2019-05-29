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
 * Provides a wrapper for {@link ExtVocationalHistoryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExtVocationalHistoryLocalService
 * @generated
 */
@ProviderType
public class ExtVocationalHistoryLocalServiceWrapper
	implements ExtVocationalHistoryLocalService,
		ServiceWrapper<ExtVocationalHistoryLocalService> {
	public ExtVocationalHistoryLocalServiceWrapper(
		ExtVocationalHistoryLocalService extVocationalHistoryLocalService) {
		_extVocationalHistoryLocalService = extVocationalHistoryLocalService;
	}

	/**
	* Adds the ext vocational history to the database. Also notifies the appropriate model listeners.
	*
	* @param extVocationalHistory the ext vocational history
	* @return the ext vocational history that was added
	*/
	@Override
	public ucc.portal.model.ExtVocationalHistory addExtVocationalHistory(
		ucc.portal.model.ExtVocationalHistory extVocationalHistory) {
		return _extVocationalHistoryLocalService.addExtVocationalHistory(extVocationalHistory);
	}

	/**
	* Creates a new ext vocational history with the primary key. Does not add the ext vocational history to the database.
	*
	* @param extVocationalHistoryId the primary key for the new ext vocational history
	* @return the new ext vocational history
	*/
	@Override
	public ucc.portal.model.ExtVocationalHistory createExtVocationalHistory(
		long extVocationalHistoryId) {
		return _extVocationalHistoryLocalService.createExtVocationalHistory(extVocationalHistoryId);
	}

	/**
	* Deletes the ext vocational history from the database. Also notifies the appropriate model listeners.
	*
	* @param extVocationalHistory the ext vocational history
	* @return the ext vocational history that was removed
	*/
	@Override
	public ucc.portal.model.ExtVocationalHistory deleteExtVocationalHistory(
		ucc.portal.model.ExtVocationalHistory extVocationalHistory) {
		return _extVocationalHistoryLocalService.deleteExtVocationalHistory(extVocationalHistory);
	}

	/**
	* Deletes the ext vocational history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extVocationalHistoryId the primary key of the ext vocational history
	* @return the ext vocational history that was removed
	* @throws PortalException if a ext vocational history with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.ExtVocationalHistory deleteExtVocationalHistory(
		long extVocationalHistoryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _extVocationalHistoryLocalService.deleteExtVocationalHistory(extVocationalHistoryId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _extVocationalHistoryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _extVocationalHistoryLocalService.dynamicQuery();
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
		return _extVocationalHistoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _extVocationalHistoryLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _extVocationalHistoryLocalService.dynamicQuery(dynamicQuery,
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
		return _extVocationalHistoryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _extVocationalHistoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ucc.portal.model.ExtVocationalHistory fetchExtVocationalHistory(
		long extVocationalHistoryId) {
		return _extVocationalHistoryLocalService.fetchExtVocationalHistory(extVocationalHistoryId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _extVocationalHistoryLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns a range of all the ext vocational histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @return the range of ext vocational histories
	*/
	@Override
	public java.util.List<ucc.portal.model.ExtVocationalHistory> getExtVocationalHistories(
		int start, int end) {
		return _extVocationalHistoryLocalService.getExtVocationalHistories(start,
			end);
	}

	/**
	* Returns the number of ext vocational histories.
	*
	* @return the number of ext vocational histories
	*/
	@Override
	public int getExtVocationalHistoriesCount() {
		return _extVocationalHistoryLocalService.getExtVocationalHistoriesCount();
	}

	/**
	* Returns the ext vocational history with the primary key.
	*
	* @param extVocationalHistoryId the primary key of the ext vocational history
	* @return the ext vocational history
	* @throws PortalException if a ext vocational history with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.ExtVocationalHistory getExtVocationalHistory(
		long extVocationalHistoryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _extVocationalHistoryLocalService.getExtVocationalHistory(extVocationalHistoryId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _extVocationalHistoryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _extVocationalHistoryLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _extVocationalHistoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the ext vocational history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param extVocationalHistory the ext vocational history
	* @return the ext vocational history that was updated
	*/
	@Override
	public ucc.portal.model.ExtVocationalHistory updateExtVocationalHistory(
		ucc.portal.model.ExtVocationalHistory extVocationalHistory) {
		return _extVocationalHistoryLocalService.updateExtVocationalHistory(extVocationalHistory);
	}

	@Override
	public ExtVocationalHistoryLocalService getWrappedService() {
		return _extVocationalHistoryLocalService;
	}

	@Override
	public void setWrappedService(
		ExtVocationalHistoryLocalService extVocationalHistoryLocalService) {
		_extVocationalHistoryLocalService = extVocationalHistoryLocalService;
	}

	private ExtVocationalHistoryLocalService _extVocationalHistoryLocalService;
}