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
 * Provides a wrapper for {@link CmapTagLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CmapTagLocalService
 * @generated
 */
@ProviderType
public class CmapTagLocalServiceWrapper implements CmapTagLocalService,
	ServiceWrapper<CmapTagLocalService> {
	public CmapTagLocalServiceWrapper(CmapTagLocalService cmapTagLocalService) {
		_cmapTagLocalService = cmapTagLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cmapTagLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cmapTagLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cmapTagLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cmapTagLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cmapTagLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the cmap tag to the database. Also notifies the appropriate model listeners.
	*
	* @param cmapTag the cmap tag
	* @return the cmap tag that was added
	*/
	@Override
	public contact.manager.service.model.CmapTag addCmapTag(
		contact.manager.service.model.CmapTag cmapTag) {
		return _cmapTagLocalService.addCmapTag(cmapTag);
	}

	/**
	* Creates a new cmap tag with the primary key. Does not add the cmap tag to the database.
	*
	* @param tagId the primary key for the new cmap tag
	* @return the new cmap tag
	*/
	@Override
	public contact.manager.service.model.CmapTag createCmapTag(long tagId) {
		return _cmapTagLocalService.createCmapTag(tagId);
	}

	/**
	* Deletes the cmap tag from the database. Also notifies the appropriate model listeners.
	*
	* @param cmapTag the cmap tag
	* @return the cmap tag that was removed
	*/
	@Override
	public contact.manager.service.model.CmapTag deleteCmapTag(
		contact.manager.service.model.CmapTag cmapTag) {
		return _cmapTagLocalService.deleteCmapTag(cmapTag);
	}

	/**
	* Deletes the cmap tag with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tagId the primary key of the cmap tag
	* @return the cmap tag that was removed
	* @throws PortalException if a cmap tag with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.CmapTag deleteCmapTag(long tagId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cmapTagLocalService.deleteCmapTag(tagId);
	}

	@Override
	public contact.manager.service.model.CmapTag fetchCmapTag(long tagId) {
		return _cmapTagLocalService.fetchCmapTag(tagId);
	}

	/**
	* Returns the cmap tag with the primary key.
	*
	* @param tagId the primary key of the cmap tag
	* @return the cmap tag
	* @throws PortalException if a cmap tag with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.CmapTag getCmapTag(long tagId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cmapTagLocalService.getCmapTag(tagId);
	}

	/**
	* Updates the cmap tag in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cmapTag the cmap tag
	* @return the cmap tag that was updated
	*/
	@Override
	public contact.manager.service.model.CmapTag updateCmapTag(
		contact.manager.service.model.CmapTag cmapTag) {
		return _cmapTagLocalService.updateCmapTag(cmapTag);
	}

	/**
	* Returns the number of cmap tags.
	*
	* @return the number of cmap tags
	*/
	@Override
	public int getCmapTagsCount() {
		return _cmapTagLocalService.getCmapTagsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _cmapTagLocalService.getOSGiServiceIdentifier();
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
		return _cmapTagLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CmapTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cmapTagLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CmapTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cmapTagLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the cmap tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CmapTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap tags
	* @param end the upper bound of the range of cmap tags (not inclusive)
	* @return the range of cmap tags
	*/
	@Override
	public java.util.List<contact.manager.service.model.CmapTag> getCmapTags(
		int start, int end) {
		return _cmapTagLocalService.getCmapTags(start, end);
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
		return _cmapTagLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cmapTagLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CmapTagLocalService getWrappedService() {
		return _cmapTagLocalService;
	}

	@Override
	public void setWrappedService(CmapTagLocalService cmapTagLocalService) {
		_cmapTagLocalService = cmapTagLocalService;
	}

	private CmapTagLocalService _cmapTagLocalService;
}