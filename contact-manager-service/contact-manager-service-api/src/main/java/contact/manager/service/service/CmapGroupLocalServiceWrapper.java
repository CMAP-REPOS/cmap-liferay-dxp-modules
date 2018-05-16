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
 * Provides a wrapper for {@link CmapGroupLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CmapGroupLocalService
 * @generated
 */
@ProviderType
public class CmapGroupLocalServiceWrapper implements CmapGroupLocalService,
	ServiceWrapper<CmapGroupLocalService> {
	public CmapGroupLocalServiceWrapper(
		CmapGroupLocalService cmapGroupLocalService) {
		_cmapGroupLocalService = cmapGroupLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cmapGroupLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cmapGroupLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cmapGroupLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cmapGroupLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cmapGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the cmap group to the database. Also notifies the appropriate model listeners.
	*
	* @param cmapGroup the cmap group
	* @return the cmap group that was added
	*/
	@Override
	public contact.manager.service.model.CmapGroup addCmapGroup(
		contact.manager.service.model.CmapGroup cmapGroup) {
		return _cmapGroupLocalService.addCmapGroup(cmapGroup);
	}

	/**
	* Creates a new cmap group with the primary key. Does not add the cmap group to the database.
	*
	* @param groupId the primary key for the new cmap group
	* @return the new cmap group
	*/
	@Override
	public contact.manager.service.model.CmapGroup createCmapGroup(long groupId) {
		return _cmapGroupLocalService.createCmapGroup(groupId);
	}

	/**
	* Deletes the cmap group from the database. Also notifies the appropriate model listeners.
	*
	* @param cmapGroup the cmap group
	* @return the cmap group that was removed
	*/
	@Override
	public contact.manager.service.model.CmapGroup deleteCmapGroup(
		contact.manager.service.model.CmapGroup cmapGroup) {
		return _cmapGroupLocalService.deleteCmapGroup(cmapGroup);
	}

	/**
	* Deletes the cmap group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupId the primary key of the cmap group
	* @return the cmap group that was removed
	* @throws PortalException if a cmap group with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.CmapGroup deleteCmapGroup(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cmapGroupLocalService.deleteCmapGroup(groupId);
	}

	@Override
	public contact.manager.service.model.CmapGroup fetchCmapGroup(long groupId) {
		return _cmapGroupLocalService.fetchCmapGroup(groupId);
	}

	/**
	* Returns the cmap group with the primary key.
	*
	* @param groupId the primary key of the cmap group
	* @return the cmap group
	* @throws PortalException if a cmap group with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.CmapGroup getCmapGroup(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cmapGroupLocalService.getCmapGroup(groupId);
	}

	/**
	* Updates the cmap group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cmapGroup the cmap group
	* @return the cmap group that was updated
	*/
	@Override
	public contact.manager.service.model.CmapGroup updateCmapGroup(
		contact.manager.service.model.CmapGroup cmapGroup) {
		return _cmapGroupLocalService.updateCmapGroup(cmapGroup);
	}

	/**
	* Returns the number of cmap groups.
	*
	* @return the number of cmap groups
	*/
	@Override
	public int getCmapGroupsCount() {
		return _cmapGroupLocalService.getCmapGroupsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _cmapGroupLocalService.getOSGiServiceIdentifier();
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
		return _cmapGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CmapGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cmapGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CmapGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cmapGroupLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the cmap groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CmapGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap groups
	* @param end the upper bound of the range of cmap groups (not inclusive)
	* @return the range of cmap groups
	*/
	@Override
	public java.util.List<contact.manager.service.model.CmapGroup> getCmapGroups(
		int start, int end) {
		return _cmapGroupLocalService.getCmapGroups(start, end);
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
		return _cmapGroupLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cmapGroupLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CmapGroupLocalService getWrappedService() {
		return _cmapGroupLocalService;
	}

	@Override
	public void setWrappedService(CmapGroupLocalService cmapGroupLocalService) {
		_cmapGroupLocalService = cmapGroupLocalService;
	}

	private CmapGroupLocalService _cmapGroupLocalService;
}