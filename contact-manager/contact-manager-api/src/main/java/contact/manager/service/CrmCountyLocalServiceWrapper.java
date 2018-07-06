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
 * Provides a wrapper for {@link CrmCountyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmCountyLocalService
 * @generated
 */
@ProviderType
public class CrmCountyLocalServiceWrapper implements CrmCountyLocalService,
	ServiceWrapper<CrmCountyLocalService> {
	public CrmCountyLocalServiceWrapper(
		CrmCountyLocalService crmCountyLocalService) {
		_crmCountyLocalService = crmCountyLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmCountyLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmCountyLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmCountyLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmCountyLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmCountyLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmCountyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM County to the database. Also notifies the appropriate model listeners.
	*
	* @param crmCounty the CRM County
	* @return the CRM County that was added
	*/
	@Override
	public contact.manager.model.CrmCounty addCrmCounty(
		contact.manager.model.CrmCounty crmCounty) {
		return _crmCountyLocalService.addCrmCounty(crmCounty);
	}

	/**
	* Creates a new CRM County with the primary key. Does not add the CRM County to the database.
	*
	* @param crmCountyId the primary key for the new CRM County
	* @return the new CRM County
	*/
	@Override
	public contact.manager.model.CrmCounty createCrmCounty(long crmCountyId) {
		return _crmCountyLocalService.createCrmCounty(crmCountyId);
	}

	/**
	* Deletes the CRM County from the database. Also notifies the appropriate model listeners.
	*
	* @param crmCounty the CRM County
	* @return the CRM County that was removed
	*/
	@Override
	public contact.manager.model.CrmCounty deleteCrmCounty(
		contact.manager.model.CrmCounty crmCounty) {
		return _crmCountyLocalService.deleteCrmCounty(crmCounty);
	}

	/**
	* Deletes the CRM County with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmCountyId the primary key of the CRM County
	* @return the CRM County that was removed
	* @throws PortalException if a CRM County with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmCounty deleteCrmCounty(long crmCountyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmCountyLocalService.deleteCrmCounty(crmCountyId);
	}

	@Override
	public contact.manager.model.CrmCounty fetchCrmCounty(long crmCountyId) {
		return _crmCountyLocalService.fetchCrmCounty(crmCountyId);
	}

	/**
	* Returns the CRM County matching the UUID and group.
	*
	* @param uuid the CRM County's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM County, or <code>null</code> if a matching CRM County could not be found
	*/
	@Override
	public contact.manager.model.CrmCounty fetchCrmCountyByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _crmCountyLocalService.fetchCrmCountyByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the CRM County with the primary key.
	*
	* @param crmCountyId the primary key of the CRM County
	* @return the CRM County
	* @throws PortalException if a CRM County with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmCounty getCrmCounty(long crmCountyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmCountyLocalService.getCrmCounty(crmCountyId);
	}

	/**
	* Returns the CRM County matching the UUID and group.
	*
	* @param uuid the CRM County's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM County
	* @throws PortalException if a matching CRM County could not be found
	*/
	@Override
	public contact.manager.model.CrmCounty getCrmCountyByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmCountyLocalService.getCrmCountyByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the CRM County in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmCounty the CRM County
	* @return the CRM County that was updated
	*/
	@Override
	public contact.manager.model.CrmCounty updateCrmCounty(
		contact.manager.model.CrmCounty crmCounty) {
		return _crmCountyLocalService.updateCrmCounty(crmCounty);
	}

	/**
	* Returns the number of CRM Counties.
	*
	* @return the number of CRM Counties
	*/
	@Override
	public int getCrmCountiesCount() {
		return _crmCountyLocalService.getCrmCountiesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmCountyLocalService.getOSGiServiceIdentifier();
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
		return _crmCountyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmCountyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmCountyLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the CRM Counties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmCountyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @return the range of CRM Counties
	*/
	@Override
	public java.util.List<contact.manager.model.CrmCounty> getCrmCounties(
		int start, int end) {
		return _crmCountyLocalService.getCrmCounties(start, end);
	}

	/**
	* Returns all the CRM Counties matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Counties
	* @param companyId the primary key of the company
	* @return the matching CRM Counties, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmCounty> getCrmCountiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _crmCountyLocalService.getCrmCountiesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of CRM Counties matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Counties
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Counties
	* @param end the upper bound of the range of CRM Counties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Counties, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmCounty> getCrmCountiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmCounty> orderByComparator) {
		return _crmCountyLocalService.getCrmCountiesByUuidAndCompanyId(uuid,
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
		return _crmCountyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmCountyLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CrmCountyLocalService getWrappedService() {
		return _crmCountyLocalService;
	}

	@Override
	public void setWrappedService(CrmCountyLocalService crmCountyLocalService) {
		_crmCountyLocalService = crmCountyLocalService;
	}

	private CrmCountyLocalService _crmCountyLocalService;
}