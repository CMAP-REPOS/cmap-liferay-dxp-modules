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
 * Provides a wrapper for {@link CrmCountyCommissionerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmCountyCommissionerLocalService
 * @generated
 */
@ProviderType
public class CrmCountyCommissionerLocalServiceWrapper
	implements CrmCountyCommissionerLocalService,
		ServiceWrapper<CrmCountyCommissionerLocalService> {
	public CrmCountyCommissionerLocalServiceWrapper(
		CrmCountyCommissionerLocalService crmCountyCommissionerLocalService) {
		_crmCountyCommissionerLocalService = crmCountyCommissionerLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmCountyCommissionerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmCountyCommissionerLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmCountyCommissionerLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmCountyCommissionerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmCountyCommissionerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmCountyCommissionerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM County Commissioner to the database. Also notifies the appropriate model listeners.
	*
	* @param crmCountyCommissioner the CRM County Commissioner
	* @return the CRM County Commissioner that was added
	*/
	@Override
	public contact.manager.model.CrmCountyCommissioner addCrmCountyCommissioner(
		contact.manager.model.CrmCountyCommissioner crmCountyCommissioner) {
		return _crmCountyCommissionerLocalService.addCrmCountyCommissioner(crmCountyCommissioner);
	}

	/**
	* Creates a new CRM County Commissioner with the primary key. Does not add the CRM County Commissioner to the database.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key for the new CRM County Commissioner
	* @return the new CRM County Commissioner
	*/
	@Override
	public contact.manager.model.CrmCountyCommissioner createCrmCountyCommissioner(
		long crmCountyCommissionerOrBoardDistId) {
		return _crmCountyCommissionerLocalService.createCrmCountyCommissioner(crmCountyCommissionerOrBoardDistId);
	}

	/**
	* Deletes the CRM County Commissioner from the database. Also notifies the appropriate model listeners.
	*
	* @param crmCountyCommissioner the CRM County Commissioner
	* @return the CRM County Commissioner that was removed
	*/
	@Override
	public contact.manager.model.CrmCountyCommissioner deleteCrmCountyCommissioner(
		contact.manager.model.CrmCountyCommissioner crmCountyCommissioner) {
		return _crmCountyCommissionerLocalService.deleteCrmCountyCommissioner(crmCountyCommissioner);
	}

	/**
	* Deletes the CRM County Commissioner with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the CRM County Commissioner
	* @return the CRM County Commissioner that was removed
	* @throws PortalException if a CRM County Commissioner with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmCountyCommissioner deleteCrmCountyCommissioner(
		long crmCountyCommissionerOrBoardDistId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmCountyCommissionerLocalService.deleteCrmCountyCommissioner(crmCountyCommissionerOrBoardDistId);
	}

	@Override
	public contact.manager.model.CrmCountyCommissioner fetchCrmCountyCommissioner(
		long crmCountyCommissionerOrBoardDistId) {
		return _crmCountyCommissionerLocalService.fetchCrmCountyCommissioner(crmCountyCommissionerOrBoardDistId);
	}

	/**
	* Returns the CRM County Commissioner matching the UUID and group.
	*
	* @param uuid the CRM County Commissioner's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM County Commissioner, or <code>null</code> if a matching CRM County Commissioner could not be found
	*/
	@Override
	public contact.manager.model.CrmCountyCommissioner fetchCrmCountyCommissionerByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _crmCountyCommissionerLocalService.fetchCrmCountyCommissionerByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the CRM County Commissioner with the primary key.
	*
	* @param crmCountyCommissionerOrBoardDistId the primary key of the CRM County Commissioner
	* @return the CRM County Commissioner
	* @throws PortalException if a CRM County Commissioner with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmCountyCommissioner getCrmCountyCommissioner(
		long crmCountyCommissionerOrBoardDistId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmCountyCommissionerLocalService.getCrmCountyCommissioner(crmCountyCommissionerOrBoardDistId);
	}

	/**
	* Returns the CRM County Commissioner matching the UUID and group.
	*
	* @param uuid the CRM County Commissioner's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM County Commissioner
	* @throws PortalException if a matching CRM County Commissioner could not be found
	*/
	@Override
	public contact.manager.model.CrmCountyCommissioner getCrmCountyCommissionerByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmCountyCommissionerLocalService.getCrmCountyCommissionerByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the CRM County Commissioner in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmCountyCommissioner the CRM County Commissioner
	* @return the CRM County Commissioner that was updated
	*/
	@Override
	public contact.manager.model.CrmCountyCommissioner updateCrmCountyCommissioner(
		contact.manager.model.CrmCountyCommissioner crmCountyCommissioner) {
		return _crmCountyCommissionerLocalService.updateCrmCountyCommissioner(crmCountyCommissioner);
	}

	/**
	* Returns the number of CRM County Commissioners.
	*
	* @return the number of CRM County Commissioners
	*/
	@Override
	public int getCrmCountyCommissionersCount() {
		return _crmCountyCommissionerLocalService.getCrmCountyCommissionersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmCountyCommissionerLocalService.getOSGiServiceIdentifier();
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
		return _crmCountyCommissionerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmCountyCommissionerLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmCountyCommissionerLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the CRM County Commissioners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmCountyCommissionerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @return the range of CRM County Commissioners
	*/
	@Override
	public java.util.List<contact.manager.model.CrmCountyCommissioner> getCrmCountyCommissioners(
		int start, int end) {
		return _crmCountyCommissionerLocalService.getCrmCountyCommissioners(start,
			end);
	}

	/**
	* Returns all the CRM County Commissioners matching the UUID and company.
	*
	* @param uuid the UUID of the CRM County Commissioners
	* @param companyId the primary key of the company
	* @return the matching CRM County Commissioners, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmCountyCommissioner> getCrmCountyCommissionersByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _crmCountyCommissionerLocalService.getCrmCountyCommissionersByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of CRM County Commissioners matching the UUID and company.
	*
	* @param uuid the UUID of the CRM County Commissioners
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM County Commissioners
	* @param end the upper bound of the range of CRM County Commissioners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM County Commissioners, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmCountyCommissioner> getCrmCountyCommissionersByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmCountyCommissioner> orderByComparator) {
		return _crmCountyCommissionerLocalService.getCrmCountyCommissionersByUuidAndCompanyId(uuid,
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
		return _crmCountyCommissionerLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmCountyCommissionerLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public CrmCountyCommissionerLocalService getWrappedService() {
		return _crmCountyCommissionerLocalService;
	}

	@Override
	public void setWrappedService(
		CrmCountyCommissionerLocalService crmCountyCommissionerLocalService) {
		_crmCountyCommissionerLocalService = crmCountyCommissionerLocalService;
	}

	private CrmCountyCommissionerLocalService _crmCountyCommissionerLocalService;
}