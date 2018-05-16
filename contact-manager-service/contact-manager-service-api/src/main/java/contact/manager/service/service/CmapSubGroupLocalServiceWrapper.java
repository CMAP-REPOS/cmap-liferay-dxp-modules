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
 * Provides a wrapper for {@link CmapSubGroupLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CmapSubGroupLocalService
 * @generated
 */
@ProviderType
public class CmapSubGroupLocalServiceWrapper implements CmapSubGroupLocalService,
	ServiceWrapper<CmapSubGroupLocalService> {
	public CmapSubGroupLocalServiceWrapper(
		CmapSubGroupLocalService cmapSubGroupLocalService) {
		_cmapSubGroupLocalService = cmapSubGroupLocalService;
	}

	@Override
	public boolean hasContactCmapSubGroup(long contactId, long subGroupId) {
		return _cmapSubGroupLocalService.hasContactCmapSubGroup(contactId,
			subGroupId);
	}

	@Override
	public boolean hasContactCmapSubGroups(long contactId) {
		return _cmapSubGroupLocalService.hasContactCmapSubGroups(contactId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cmapSubGroupLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cmapSubGroupLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cmapSubGroupLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cmapSubGroupLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cmapSubGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the cmap sub group to the database. Also notifies the appropriate model listeners.
	*
	* @param cmapSubGroup the cmap sub group
	* @return the cmap sub group that was added
	*/
	@Override
	public contact.manager.service.model.CmapSubGroup addCmapSubGroup(
		contact.manager.service.model.CmapSubGroup cmapSubGroup) {
		return _cmapSubGroupLocalService.addCmapSubGroup(cmapSubGroup);
	}

	/**
	* Creates a new cmap sub group with the primary key. Does not add the cmap sub group to the database.
	*
	* @param subGroupId the primary key for the new cmap sub group
	* @return the new cmap sub group
	*/
	@Override
	public contact.manager.service.model.CmapSubGroup createCmapSubGroup(
		long subGroupId) {
		return _cmapSubGroupLocalService.createCmapSubGroup(subGroupId);
	}

	/**
	* Deletes the cmap sub group from the database. Also notifies the appropriate model listeners.
	*
	* @param cmapSubGroup the cmap sub group
	* @return the cmap sub group that was removed
	*/
	@Override
	public contact.manager.service.model.CmapSubGroup deleteCmapSubGroup(
		contact.manager.service.model.CmapSubGroup cmapSubGroup) {
		return _cmapSubGroupLocalService.deleteCmapSubGroup(cmapSubGroup);
	}

	/**
	* Deletes the cmap sub group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subGroupId the primary key of the cmap sub group
	* @return the cmap sub group that was removed
	* @throws PortalException if a cmap sub group with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.CmapSubGroup deleteCmapSubGroup(
		long subGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cmapSubGroupLocalService.deleteCmapSubGroup(subGroupId);
	}

	@Override
	public contact.manager.service.model.CmapSubGroup fetchCmapSubGroup(
		long subGroupId) {
		return _cmapSubGroupLocalService.fetchCmapSubGroup(subGroupId);
	}

	/**
	* Returns the cmap sub group with the primary key.
	*
	* @param subGroupId the primary key of the cmap sub group
	* @return the cmap sub group
	* @throws PortalException if a cmap sub group with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.CmapSubGroup getCmapSubGroup(
		long subGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cmapSubGroupLocalService.getCmapSubGroup(subGroupId);
	}

	/**
	* Updates the cmap sub group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cmapSubGroup the cmap sub group
	* @return the cmap sub group that was updated
	*/
	@Override
	public contact.manager.service.model.CmapSubGroup updateCmapSubGroup(
		contact.manager.service.model.CmapSubGroup cmapSubGroup) {
		return _cmapSubGroupLocalService.updateCmapSubGroup(cmapSubGroup);
	}

	/**
	* Returns the number of cmap sub groups.
	*
	* @return the number of cmap sub groups
	*/
	@Override
	public int getCmapSubGroupsCount() {
		return _cmapSubGroupLocalService.getCmapSubGroupsCount();
	}

	@Override
	public int getContactCmapSubGroupsCount(long contactId) {
		return _cmapSubGroupLocalService.getContactCmapSubGroupsCount(contactId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _cmapSubGroupLocalService.getOSGiServiceIdentifier();
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
		return _cmapSubGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cmapSubGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cmapSubGroupLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the cmap sub groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap sub groups
	* @param end the upper bound of the range of cmap sub groups (not inclusive)
	* @return the range of cmap sub groups
	*/
	@Override
	public java.util.List<contact.manager.service.model.CmapSubGroup> getCmapSubGroups(
		int start, int end) {
		return _cmapSubGroupLocalService.getCmapSubGroups(start, end);
	}

	@Override
	public java.util.List<contact.manager.service.model.CmapSubGroup> getContactCmapSubGroups(
		long contactId) {
		return _cmapSubGroupLocalService.getContactCmapSubGroups(contactId);
	}

	@Override
	public java.util.List<contact.manager.service.model.CmapSubGroup> getContactCmapSubGroups(
		long contactId, int start, int end) {
		return _cmapSubGroupLocalService.getContactCmapSubGroups(contactId,
			start, end);
	}

	@Override
	public java.util.List<contact.manager.service.model.CmapSubGroup> getContactCmapSubGroups(
		long contactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.service.model.CmapSubGroup> orderByComparator) {
		return _cmapSubGroupLocalService.getContactCmapSubGroups(contactId,
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
		return _cmapSubGroupLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cmapSubGroupLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Returns the contactIds of the contacts associated with the cmap sub group.
	*
	* @param subGroupId the subGroupId of the cmap sub group
	* @return long[] the contactIds of contacts associated with the cmap sub group
	*/
	@Override
	public long[] getContactPrimaryKeys(long subGroupId) {
		return _cmapSubGroupLocalService.getContactPrimaryKeys(subGroupId);
	}

	@Override
	public void addContactCmapSubGroup(long contactId,
		contact.manager.service.model.CmapSubGroup cmapSubGroup) {
		_cmapSubGroupLocalService.addContactCmapSubGroup(contactId, cmapSubGroup);
	}

	@Override
	public void addContactCmapSubGroup(long contactId, long subGroupId) {
		_cmapSubGroupLocalService.addContactCmapSubGroup(contactId, subGroupId);
	}

	@Override
	public void addContactCmapSubGroups(long contactId,
		java.util.List<contact.manager.service.model.CmapSubGroup> cmapSubGroups) {
		_cmapSubGroupLocalService.addContactCmapSubGroups(contactId,
			cmapSubGroups);
	}

	@Override
	public void addContactCmapSubGroups(long contactId, long[] subGroupIds) {
		_cmapSubGroupLocalService.addContactCmapSubGroups(contactId, subGroupIds);
	}

	@Override
	public void clearContactCmapSubGroups(long contactId) {
		_cmapSubGroupLocalService.clearContactCmapSubGroups(contactId);
	}

	@Override
	public void deleteContactCmapSubGroup(long contactId,
		contact.manager.service.model.CmapSubGroup cmapSubGroup) {
		_cmapSubGroupLocalService.deleteContactCmapSubGroup(contactId,
			cmapSubGroup);
	}

	@Override
	public void deleteContactCmapSubGroup(long contactId, long subGroupId) {
		_cmapSubGroupLocalService.deleteContactCmapSubGroup(contactId,
			subGroupId);
	}

	@Override
	public void deleteContactCmapSubGroups(long contactId,
		java.util.List<contact.manager.service.model.CmapSubGroup> cmapSubGroups) {
		_cmapSubGroupLocalService.deleteContactCmapSubGroups(contactId,
			cmapSubGroups);
	}

	@Override
	public void deleteContactCmapSubGroups(long contactId, long[] subGroupIds) {
		_cmapSubGroupLocalService.deleteContactCmapSubGroups(contactId,
			subGroupIds);
	}

	@Override
	public void setContactCmapSubGroups(long contactId, long[] subGroupIds) {
		_cmapSubGroupLocalService.setContactCmapSubGroups(contactId, subGroupIds);
	}

	@Override
	public CmapSubGroupLocalService getWrappedService() {
		return _cmapSubGroupLocalService;
	}

	@Override
	public void setWrappedService(
		CmapSubGroupLocalService cmapSubGroupLocalService) {
		_cmapSubGroupLocalService = cmapSubGroupLocalService;
	}

	private CmapSubGroupLocalService _cmapSubGroupLocalService;
}