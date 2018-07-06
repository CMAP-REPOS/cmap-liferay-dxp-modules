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
 * Provides a wrapper for {@link CrmChiWardLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmChiWardLocalService
 * @generated
 */
@ProviderType
public class CrmChiWardLocalServiceWrapper implements CrmChiWardLocalService,
	ServiceWrapper<CrmChiWardLocalService> {
	public CrmChiWardLocalServiceWrapper(
		CrmChiWardLocalService crmChiWardLocalService) {
		_crmChiWardLocalService = crmChiWardLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmChiWardLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmChiWardLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmChiWardLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmChiWardLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmChiWardLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmChiWardLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM Chi Ward to the database. Also notifies the appropriate model listeners.
	*
	* @param crmChiWard the CRM Chi Ward
	* @return the CRM Chi Ward that was added
	*/
	@Override
	public contact.manager.model.CrmChiWard addCrmChiWard(
		contact.manager.model.CrmChiWard crmChiWard) {
		return _crmChiWardLocalService.addCrmChiWard(crmChiWard);
	}

	/**
	* Creates a new CRM Chi Ward with the primary key. Does not add the CRM Chi Ward to the database.
	*
	* @param crmChiWardId the primary key for the new CRM Chi Ward
	* @return the new CRM Chi Ward
	*/
	@Override
	public contact.manager.model.CrmChiWard createCrmChiWard(long crmChiWardId) {
		return _crmChiWardLocalService.createCrmChiWard(crmChiWardId);
	}

	/**
	* Deletes the CRM Chi Ward from the database. Also notifies the appropriate model listeners.
	*
	* @param crmChiWard the CRM Chi Ward
	* @return the CRM Chi Ward that was removed
	*/
	@Override
	public contact.manager.model.CrmChiWard deleteCrmChiWard(
		contact.manager.model.CrmChiWard crmChiWard) {
		return _crmChiWardLocalService.deleteCrmChiWard(crmChiWard);
	}

	/**
	* Deletes the CRM Chi Ward with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmChiWardId the primary key of the CRM Chi Ward
	* @return the CRM Chi Ward that was removed
	* @throws PortalException if a CRM Chi Ward with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmChiWard deleteCrmChiWard(long crmChiWardId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmChiWardLocalService.deleteCrmChiWard(crmChiWardId);
	}

	@Override
	public contact.manager.model.CrmChiWard fetchCrmChiWard(long crmChiWardId) {
		return _crmChiWardLocalService.fetchCrmChiWard(crmChiWardId);
	}

	/**
	* Returns the CRM Chi Ward matching the UUID and group.
	*
	* @param uuid the CRM Chi Ward's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Chi Ward, or <code>null</code> if a matching CRM Chi Ward could not be found
	*/
	@Override
	public contact.manager.model.CrmChiWard fetchCrmChiWardByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _crmChiWardLocalService.fetchCrmChiWardByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the CRM Chi Ward with the primary key.
	*
	* @param crmChiWardId the primary key of the CRM Chi Ward
	* @return the CRM Chi Ward
	* @throws PortalException if a CRM Chi Ward with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmChiWard getCrmChiWard(long crmChiWardId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmChiWardLocalService.getCrmChiWard(crmChiWardId);
	}

	/**
	* Returns the CRM Chi Ward matching the UUID and group.
	*
	* @param uuid the CRM Chi Ward's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Chi Ward
	* @throws PortalException if a matching CRM Chi Ward could not be found
	*/
	@Override
	public contact.manager.model.CrmChiWard getCrmChiWardByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmChiWardLocalService.getCrmChiWardByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the CRM Chi Ward in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmChiWard the CRM Chi Ward
	* @return the CRM Chi Ward that was updated
	*/
	@Override
	public contact.manager.model.CrmChiWard updateCrmChiWard(
		contact.manager.model.CrmChiWard crmChiWard) {
		return _crmChiWardLocalService.updateCrmChiWard(crmChiWard);
	}

	/**
	* Returns the number of CRM Chi Wards.
	*
	* @return the number of CRM Chi Wards
	*/
	@Override
	public int getCrmChiWardsCount() {
		return _crmChiWardLocalService.getCrmChiWardsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmChiWardLocalService.getOSGiServiceIdentifier();
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
		return _crmChiWardLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmChiWardLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmChiWardLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the CRM Chi Wards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmChiWardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @return the range of CRM Chi Wards
	*/
	@Override
	public java.util.List<contact.manager.model.CrmChiWard> getCrmChiWards(
		int start, int end) {
		return _crmChiWardLocalService.getCrmChiWards(start, end);
	}

	/**
	* Returns all the CRM Chi Wards matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Chi Wards
	* @param companyId the primary key of the company
	* @return the matching CRM Chi Wards, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmChiWard> getCrmChiWardsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _crmChiWardLocalService.getCrmChiWardsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of CRM Chi Wards matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Chi Wards
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Chi Wards
	* @param end the upper bound of the range of CRM Chi Wards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Chi Wards, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmChiWard> getCrmChiWardsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmChiWard> orderByComparator) {
		return _crmChiWardLocalService.getCrmChiWardsByUuidAndCompanyId(uuid,
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
		return _crmChiWardLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmChiWardLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public CrmChiWardLocalService getWrappedService() {
		return _crmChiWardLocalService;
	}

	@Override
	public void setWrappedService(CrmChiWardLocalService crmChiWardLocalService) {
		_crmChiWardLocalService = crmChiWardLocalService;
	}

	private CrmChiWardLocalService _crmChiWardLocalService;
}