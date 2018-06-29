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
 * Provides a wrapper for {@link CrmStateSenateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateSenateLocalService
 * @generated
 */
@ProviderType
public class CrmStateSenateLocalServiceWrapper
	implements CrmStateSenateLocalService,
		ServiceWrapper<CrmStateSenateLocalService> {
	public CrmStateSenateLocalServiceWrapper(
		CrmStateSenateLocalService crmStateSenateLocalService) {
		_crmStateSenateLocalService = crmStateSenateLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmStateSenateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmStateSenateLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmStateSenateLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmStateSenateLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmStateSenateLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmStateSenateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM State Senate to the database. Also notifies the appropriate model listeners.
	*
	* @param crmStateSenate the CRM State Senate
	* @return the CRM State Senate that was added
	*/
	@Override
	public contact.manager.model.CrmStateSenate addCrmStateSenate(
		contact.manager.model.CrmStateSenate crmStateSenate) {
		return _crmStateSenateLocalService.addCrmStateSenate(crmStateSenate);
	}

	/**
	* Creates a new CRM State Senate with the primary key. Does not add the CRM State Senate to the database.
	*
	* @param crmStateSenateId the primary key for the new CRM State Senate
	* @return the new CRM State Senate
	*/
	@Override
	public contact.manager.model.CrmStateSenate createCrmStateSenate(
		long crmStateSenateId) {
		return _crmStateSenateLocalService.createCrmStateSenate(crmStateSenateId);
	}

	/**
	* Deletes the CRM State Senate from the database. Also notifies the appropriate model listeners.
	*
	* @param crmStateSenate the CRM State Senate
	* @return the CRM State Senate that was removed
	*/
	@Override
	public contact.manager.model.CrmStateSenate deleteCrmStateSenate(
		contact.manager.model.CrmStateSenate crmStateSenate) {
		return _crmStateSenateLocalService.deleteCrmStateSenate(crmStateSenate);
	}

	/**
	* Deletes the CRM State Senate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmStateSenateId the primary key of the CRM State Senate
	* @return the CRM State Senate that was removed
	* @throws PortalException if a CRM State Senate with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmStateSenate deleteCrmStateSenate(
		long crmStateSenateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmStateSenateLocalService.deleteCrmStateSenate(crmStateSenateId);
	}

	@Override
	public contact.manager.model.CrmStateSenate fetchCrmStateSenate(
		long crmStateSenateId) {
		return _crmStateSenateLocalService.fetchCrmStateSenate(crmStateSenateId);
	}

	/**
	* Returns the CRM State Senate matching the UUID and group.
	*
	* @param uuid the CRM State Senate's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	@Override
	public contact.manager.model.CrmStateSenate fetchCrmStateSenateByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _crmStateSenateLocalService.fetchCrmStateSenateByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the CRM State Senate with the primary key.
	*
	* @param crmStateSenateId the primary key of the CRM State Senate
	* @return the CRM State Senate
	* @throws PortalException if a CRM State Senate with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmStateSenate getCrmStateSenate(
		long crmStateSenateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmStateSenateLocalService.getCrmStateSenate(crmStateSenateId);
	}

	/**
	* Returns the CRM State Senate matching the UUID and group.
	*
	* @param uuid the CRM State Senate's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM State Senate
	* @throws PortalException if a matching CRM State Senate could not be found
	*/
	@Override
	public contact.manager.model.CrmStateSenate getCrmStateSenateByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmStateSenateLocalService.getCrmStateSenateByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the CRM State Senate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmStateSenate the CRM State Senate
	* @return the CRM State Senate that was updated
	*/
	@Override
	public contact.manager.model.CrmStateSenate updateCrmStateSenate(
		contact.manager.model.CrmStateSenate crmStateSenate) {
		return _crmStateSenateLocalService.updateCrmStateSenate(crmStateSenate);
	}

	/**
	* Returns the number of CRM State Senates.
	*
	* @return the number of CRM State Senates
	*/
	@Override
	public int getCrmStateSenatesCount() {
		return _crmStateSenateLocalService.getCrmStateSenatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmStateSenateLocalService.getOSGiServiceIdentifier();
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
		return _crmStateSenateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmStateSenateLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmStateSenateLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<contact.manager.model.CrmStateSenate> findByZipCode(
		java.lang.String zipCode) {
		return _crmStateSenateLocalService.findByZipCode(zipCode);
	}

	/**
	* Returns a range of all the CRM State Senates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @return the range of CRM State Senates
	*/
	@Override
	public java.util.List<contact.manager.model.CrmStateSenate> getCrmStateSenates(
		int start, int end) {
		return _crmStateSenateLocalService.getCrmStateSenates(start, end);
	}

	/**
	* Returns all the CRM State Senates matching the UUID and company.
	*
	* @param uuid the UUID of the CRM State Senates
	* @param companyId the primary key of the company
	* @return the matching CRM State Senates, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmStateSenate> getCrmStateSenatesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _crmStateSenateLocalService.getCrmStateSenatesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of CRM State Senates matching the UUID and company.
	*
	* @param uuid the UUID of the CRM State Senates
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM State Senates, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmStateSenate> getCrmStateSenatesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmStateSenate> orderByComparator) {
		return _crmStateSenateLocalService.getCrmStateSenatesByUuidAndCompanyId(uuid,
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
		return _crmStateSenateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmStateSenateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public CrmStateSenateLocalService getWrappedService() {
		return _crmStateSenateLocalService;
	}

	@Override
	public void setWrappedService(
		CrmStateSenateLocalService crmStateSenateLocalService) {
		_crmStateSenateLocalService = crmStateSenateLocalService;
	}

	private CrmStateSenateLocalService _crmStateSenateLocalService;
}