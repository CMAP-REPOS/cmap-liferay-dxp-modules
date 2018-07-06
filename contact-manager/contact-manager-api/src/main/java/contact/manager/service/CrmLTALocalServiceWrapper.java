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
 * Provides a wrapper for {@link CrmLTALocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmLTALocalService
 * @generated
 */
@ProviderType
public class CrmLTALocalServiceWrapper implements CrmLTALocalService,
	ServiceWrapper<CrmLTALocalService> {
	public CrmLTALocalServiceWrapper(CrmLTALocalService crmLTALocalService) {
		_crmLTALocalService = crmLTALocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmLTALocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmLTALocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmLTALocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmLTALocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmLTALocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmLTALocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM LTA to the database. Also notifies the appropriate model listeners.
	*
	* @param crmLTA the CRM LTA
	* @return the CRM LTA that was added
	*/
	@Override
	public contact.manager.model.CrmLTA addCrmLTA(
		contact.manager.model.CrmLTA crmLTA) {
		return _crmLTALocalService.addCrmLTA(crmLTA);
	}

	/**
	* Creates a new CRM LTA with the primary key. Does not add the CRM LTA to the database.
	*
	* @param crmLTAId the primary key for the new CRM LTA
	* @return the new CRM LTA
	*/
	@Override
	public contact.manager.model.CrmLTA createCrmLTA(long crmLTAId) {
		return _crmLTALocalService.createCrmLTA(crmLTAId);
	}

	/**
	* Deletes the CRM LTA from the database. Also notifies the appropriate model listeners.
	*
	* @param crmLTA the CRM LTA
	* @return the CRM LTA that was removed
	*/
	@Override
	public contact.manager.model.CrmLTA deleteCrmLTA(
		contact.manager.model.CrmLTA crmLTA) {
		return _crmLTALocalService.deleteCrmLTA(crmLTA);
	}

	/**
	* Deletes the CRM LTA with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmLTAId the primary key of the CRM LTA
	* @return the CRM LTA that was removed
	* @throws PortalException if a CRM LTA with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmLTA deleteCrmLTA(long crmLTAId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmLTALocalService.deleteCrmLTA(crmLTAId);
	}

	@Override
	public contact.manager.model.CrmLTA fetchCrmLTA(long crmLTAId) {
		return _crmLTALocalService.fetchCrmLTA(crmLTAId);
	}

	/**
	* Returns the CRM LTA matching the UUID and group.
	*
	* @param uuid the CRM LTA's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	*/
	@Override
	public contact.manager.model.CrmLTA fetchCrmLTAByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _crmLTALocalService.fetchCrmLTAByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the CRM LTA with the primary key.
	*
	* @param crmLTAId the primary key of the CRM LTA
	* @return the CRM LTA
	* @throws PortalException if a CRM LTA with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmLTA getCrmLTA(long crmLTAId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmLTALocalService.getCrmLTA(crmLTAId);
	}

	/**
	* Returns the CRM LTA matching the UUID and group.
	*
	* @param uuid the CRM LTA's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM LTA
	* @throws PortalException if a matching CRM LTA could not be found
	*/
	@Override
	public contact.manager.model.CrmLTA getCrmLTAByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmLTALocalService.getCrmLTAByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the CRM LTA in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmLTA the CRM LTA
	* @return the CRM LTA that was updated
	*/
	@Override
	public contact.manager.model.CrmLTA updateCrmLTA(
		contact.manager.model.CrmLTA crmLTA) {
		return _crmLTALocalService.updateCrmLTA(crmLTA);
	}

	/**
	* Returns the number of CRM LTAs.
	*
	* @return the number of CRM LTAs
	*/
	@Override
	public int getCrmLTAsCount() {
		return _crmLTALocalService.getCrmLTAsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmLTALocalService.getOSGiServiceIdentifier();
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
		return _crmLTALocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmLTALocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmLTALocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the CRM LTAs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @return the range of CRM LTAs
	*/
	@Override
	public java.util.List<contact.manager.model.CrmLTA> getCrmLTAs(int start,
		int end) {
		return _crmLTALocalService.getCrmLTAs(start, end);
	}

	/**
	* Returns all the CRM LTAs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM LTAs
	* @param companyId the primary key of the company
	* @return the matching CRM LTAs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmLTA> getCrmLTAsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _crmLTALocalService.getCrmLTAsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of CRM LTAs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM LTAs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM LTAs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmLTA> getCrmLTAsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmLTA> orderByComparator) {
		return _crmLTALocalService.getCrmLTAsByUuidAndCompanyId(uuid,
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
		return _crmLTALocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmLTALocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CrmLTALocalService getWrappedService() {
		return _crmLTALocalService;
	}

	@Override
	public void setWrappedService(CrmLTALocalService crmLTALocalService) {
		_crmLTALocalService = crmLTALocalService;
	}

	private CrmLTALocalService _crmLTALocalService;
}