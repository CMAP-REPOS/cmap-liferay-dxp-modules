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
 * Provides a wrapper for {@link CrmMuniLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmMuniLocalService
 * @generated
 */
@ProviderType
public class CrmMuniLocalServiceWrapper implements CrmMuniLocalService,
	ServiceWrapper<CrmMuniLocalService> {
	public CrmMuniLocalServiceWrapper(CrmMuniLocalService crmMuniLocalService) {
		_crmMuniLocalService = crmMuniLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmMuniLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmMuniLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmMuniLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmMuniLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmMuniLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmMuniLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM Muni to the database. Also notifies the appropriate model listeners.
	*
	* @param crmMuni the CRM Muni
	* @return the CRM Muni that was added
	*/
	@Override
	public contact.manager.model.CrmMuni addCrmMuni(
		contact.manager.model.CrmMuni crmMuni) {
		return _crmMuniLocalService.addCrmMuni(crmMuni);
	}

	/**
	* Creates a new CRM Muni with the primary key. Does not add the CRM Muni to the database.
	*
	* @param crmMuniId the primary key for the new CRM Muni
	* @return the new CRM Muni
	*/
	@Override
	public contact.manager.model.CrmMuni createCrmMuni(long crmMuniId) {
		return _crmMuniLocalService.createCrmMuni(crmMuniId);
	}

	/**
	* Deletes the CRM Muni from the database. Also notifies the appropriate model listeners.
	*
	* @param crmMuni the CRM Muni
	* @return the CRM Muni that was removed
	*/
	@Override
	public contact.manager.model.CrmMuni deleteCrmMuni(
		contact.manager.model.CrmMuni crmMuni) {
		return _crmMuniLocalService.deleteCrmMuni(crmMuni);
	}

	/**
	* Deletes the CRM Muni with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmMuniId the primary key of the CRM Muni
	* @return the CRM Muni that was removed
	* @throws PortalException if a CRM Muni with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmMuni deleteCrmMuni(long crmMuniId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmMuniLocalService.deleteCrmMuni(crmMuniId);
	}

	@Override
	public contact.manager.model.CrmMuni fetchCrmMuni(long crmMuniId) {
		return _crmMuniLocalService.fetchCrmMuni(crmMuniId);
	}

	/**
	* Returns the CRM Muni matching the UUID and group.
	*
	* @param uuid the CRM Muni's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	*/
	@Override
	public contact.manager.model.CrmMuni fetchCrmMuniByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _crmMuniLocalService.fetchCrmMuniByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the CRM Muni with the primary key.
	*
	* @param crmMuniId the primary key of the CRM Muni
	* @return the CRM Muni
	* @throws PortalException if a CRM Muni with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmMuni getCrmMuni(long crmMuniId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmMuniLocalService.getCrmMuni(crmMuniId);
	}

	/**
	* Returns the CRM Muni matching the UUID and group.
	*
	* @param uuid the CRM Muni's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Muni
	* @throws PortalException if a matching CRM Muni could not be found
	*/
	@Override
	public contact.manager.model.CrmMuni getCrmMuniByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmMuniLocalService.getCrmMuniByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the CRM Muni in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmMuni the CRM Muni
	* @return the CRM Muni that was updated
	*/
	@Override
	public contact.manager.model.CrmMuni updateCrmMuni(
		contact.manager.model.CrmMuni crmMuni) {
		return _crmMuniLocalService.updateCrmMuni(crmMuni);
	}

	/**
	* Returns the number of CRM Munis.
	*
	* @return the number of CRM Munis
	*/
	@Override
	public int getCrmMunisCount() {
		return _crmMuniLocalService.getCrmMunisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmMuniLocalService.getOSGiServiceIdentifier();
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
		return _crmMuniLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmMuniLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmMuniLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the CRM Munis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @return the range of CRM Munis
	*/
	@Override
	public java.util.List<contact.manager.model.CrmMuni> getCrmMunis(
		int start, int end) {
		return _crmMuniLocalService.getCrmMunis(start, end);
	}

	/**
	* Returns all the CRM Munis matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Munis
	* @param companyId the primary key of the company
	* @return the matching CRM Munis, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmMuni> getCrmMunisByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _crmMuniLocalService.getCrmMunisByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of CRM Munis matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Munis
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Munis, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmMuni> getCrmMunisByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmMuni> orderByComparator) {
		return _crmMuniLocalService.getCrmMunisByUuidAndCompanyId(uuid,
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
		return _crmMuniLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmMuniLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CrmMuniLocalService getWrappedService() {
		return _crmMuniLocalService;
	}

	@Override
	public void setWrappedService(CrmMuniLocalService crmMuniLocalService) {
		_crmMuniLocalService = crmMuniLocalService;
	}

	private CrmMuniLocalService _crmMuniLocalService;
}