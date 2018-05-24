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

package contact.manager.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CrmGroupLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmGroupLocalService
 * @generated
 */
@ProviderType
public class CrmGroupLocalServiceWrapper implements CrmGroupLocalService,
	ServiceWrapper<CrmGroupLocalService> {
	public CrmGroupLocalServiceWrapper(
		CrmGroupLocalService crmGroupLocalService) {
		_crmGroupLocalService = crmGroupLocalService;
	}

	@Override
	public boolean hasCrmContactCrmGroup(long crmContactId, long crmGroupId) {
		return _crmGroupLocalService.hasCrmContactCrmGroup(crmContactId,
			crmGroupId);
	}

	@Override
	public boolean hasCrmContactCrmGroups(long crmContactId) {
		return _crmGroupLocalService.hasCrmContactCrmGroups(crmContactId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmGroupLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmGroupLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmGroupLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmGroupLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmGroupLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM Group to the database. Also notifies the appropriate model listeners.
	*
	* @param crmGroup the CRM Group
	* @return the CRM Group that was added
	*/
	@Override
	public contact.manager.model.CrmGroup addCrmGroup(
		contact.manager.model.CrmGroup crmGroup) {
		return _crmGroupLocalService.addCrmGroup(crmGroup);
	}

	/**
	* Creates a new CRM Group with the primary key. Does not add the CRM Group to the database.
	*
	* @param crmGroupId the primary key for the new CRM Group
	* @return the new CRM Group
	*/
	@Override
	public contact.manager.model.CrmGroup createCrmGroup(long crmGroupId) {
		return _crmGroupLocalService.createCrmGroup(crmGroupId);
	}

	/**
	* Deletes the CRM Group from the database. Also notifies the appropriate model listeners.
	*
	* @param crmGroup the CRM Group
	* @return the CRM Group that was removed
	*/
	@Override
	public contact.manager.model.CrmGroup deleteCrmGroup(
		contact.manager.model.CrmGroup crmGroup) {
		return _crmGroupLocalService.deleteCrmGroup(crmGroup);
	}

	/**
	* Deletes the CRM Group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmGroupId the primary key of the CRM Group
	* @return the CRM Group that was removed
	* @throws PortalException if a CRM Group with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmGroup deleteCrmGroup(long crmGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmGroupLocalService.deleteCrmGroup(crmGroupId);
	}

	@Override
	public contact.manager.model.CrmGroup fetchCrmGroup(long crmGroupId) {
		return _crmGroupLocalService.fetchCrmGroup(crmGroupId);
	}

	/**
	* Returns the CRM Group matching the UUID and group.
	*
	* @param uuid the CRM Group's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	*/
	@Override
	public contact.manager.model.CrmGroup fetchCrmGroupByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _crmGroupLocalService.fetchCrmGroupByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the CRM Group with the primary key.
	*
	* @param crmGroupId the primary key of the CRM Group
	* @return the CRM Group
	* @throws PortalException if a CRM Group with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmGroup getCrmGroup(long crmGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmGroupLocalService.getCrmGroup(crmGroupId);
	}

	/**
	* Returns the CRM Group matching the UUID and group.
	*
	* @param uuid the CRM Group's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Group
	* @throws PortalException if a matching CRM Group could not be found
	*/
	@Override
	public contact.manager.model.CrmGroup getCrmGroupByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmGroupLocalService.getCrmGroupByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the CRM Group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmGroup the CRM Group
	* @return the CRM Group that was updated
	*/
	@Override
	public contact.manager.model.CrmGroup updateCrmGroup(
		contact.manager.model.CrmGroup crmGroup) {
		return _crmGroupLocalService.updateCrmGroup(crmGroup);
	}

	@Override
	public int getCrmContactCrmGroupsCount(long crmContactId) {
		return _crmGroupLocalService.getCrmContactCrmGroupsCount(crmContactId);
	}

	@Override
	public int getCrmContactsCount(long crmGroupPk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmGroupLocalService.getCrmContactsCount(crmGroupPk);
	}

	/**
	* Returns the number of CRM Groups.
	*
	* @return the number of CRM Groups
	*/
	@Override
	public int getCrmGroupsCount() {
		return _crmGroupLocalService.getCrmGroupsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmGroupLocalService.getOSGiServiceIdentifier();
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
		return _crmGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmGroupLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<contact.manager.model.CrmGroup> getCrmContactCrmGroups(
		long crmContactId) {
		return _crmGroupLocalService.getCrmContactCrmGroups(crmContactId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmGroup> getCrmContactCrmGroups(
		long crmContactId, int start, int end) {
		return _crmGroupLocalService.getCrmContactCrmGroups(crmContactId,
			start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmGroup> getCrmContactCrmGroups(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator) {
		return _crmGroupLocalService.getCrmContactCrmGroups(crmContactId,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long crmGroupPk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmGroupLocalService.getCrmContacts(crmGroupPk);
	}

	/**
	* Returns a range of all the CRM Groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @return the range of CRM Groups
	*/
	@Override
	public java.util.List<contact.manager.model.CrmGroup> getCrmGroups(
		int start, int end) {
		return _crmGroupLocalService.getCrmGroups(start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmGroup> getCrmGroupsByName(
		java.lang.String crmGroupName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmGroupLocalService.getCrmGroupsByName(crmGroupName);
	}

	/**
	* Returns all the CRM Groups matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Groups
	* @param companyId the primary key of the company
	* @return the matching CRM Groups, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmGroup> getCrmGroupsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _crmGroupLocalService.getCrmGroupsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of CRM Groups matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Groups
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Groups, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmGroup> getCrmGroupsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator) {
		return _crmGroupLocalService.getCrmGroupsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
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
		return _crmGroupLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmGroupLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Returns the crmContactIds of the CRM Contacts associated with the CRM Group.
	*
	* @param crmGroupId the crmGroupId of the CRM Group
	* @return long[] the crmContactIds of CRM Contacts associated with the CRM Group
	*/
	@Override
	public long[] getCrmContactPrimaryKeys(long crmGroupId) {
		return _crmGroupLocalService.getCrmContactPrimaryKeys(crmGroupId);
	}

	@Override
	public void addCrmContactCrmGroup(long crmContactId,
		contact.manager.model.CrmGroup crmGroup) {
		_crmGroupLocalService.addCrmContactCrmGroup(crmContactId, crmGroup);
	}

	@Override
	public void addCrmContactCrmGroup(long crmContactId, long crmGroupId) {
		_crmGroupLocalService.addCrmContactCrmGroup(crmContactId, crmGroupId);
	}

	@Override
	public void addCrmContactCrmGroups(long crmContactId,
		java.util.List<contact.manager.model.CrmGroup> crmGroups) {
		_crmGroupLocalService.addCrmContactCrmGroups(crmContactId, crmGroups);
	}

	@Override
	public void addCrmContactCrmGroups(long crmContactId, long[] crmGroupIds) {
		_crmGroupLocalService.addCrmContactCrmGroups(crmContactId, crmGroupIds);
	}

	@Override
	public void clearCrmContactCrmGroups(long crmContactId) {
		_crmGroupLocalService.clearCrmContactCrmGroups(crmContactId);
	}

	@Override
	public void deleteCrmContactCrmGroup(long crmContactId,
		contact.manager.model.CrmGroup crmGroup) {
		_crmGroupLocalService.deleteCrmContactCrmGroup(crmContactId, crmGroup);
	}

	@Override
	public void deleteCrmContactCrmGroup(long crmContactId, long crmGroupId) {
		_crmGroupLocalService.deleteCrmContactCrmGroup(crmContactId, crmGroupId);
	}

	@Override
	public void deleteCrmContactCrmGroups(long crmContactId,
		java.util.List<contact.manager.model.CrmGroup> crmGroups) {
		_crmGroupLocalService.deleteCrmContactCrmGroups(crmContactId, crmGroups);
	}

	@Override
	public void deleteCrmContactCrmGroups(long crmContactId, long[] crmGroupIds) {
		_crmGroupLocalService.deleteCrmContactCrmGroups(crmContactId,
			crmGroupIds);
	}

	@Override
	public void setCrmContactCrmGroups(long crmContactId, long[] crmGroupIds) {
		_crmGroupLocalService.setCrmContactCrmGroups(crmContactId, crmGroupIds);
	}

	@Override
	public void setCrmContacts(long crmGroupPk, long[] crmContactPks)
		throws com.liferay.portal.kernel.exception.SystemException {
		_crmGroupLocalService.setCrmContacts(crmGroupPk, crmContactPks);
	}

	@Override
	public CrmGroupLocalService getWrappedService() {
		return _crmGroupLocalService;
	}

	@Override
	public void setWrappedService(CrmGroupLocalService crmGroupLocalService) {
		_crmGroupLocalService = crmGroupLocalService;
	}

	private CrmGroupLocalService _crmGroupLocalService;
}