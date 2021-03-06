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
 * Provides a wrapper for {@link CrmUsRepLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmUsRepLocalService
 * @generated
 */
@ProviderType
public class CrmUsRepLocalServiceWrapper
	implements CrmUsRepLocalService, ServiceWrapper<CrmUsRepLocalService> {

	public CrmUsRepLocalServiceWrapper(
		CrmUsRepLocalService crmUsRepLocalService) {

		_crmUsRepLocalService = crmUsRepLocalService;
	}

	/**
	 * Adds the CRM US Rep to the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmUsRep the CRM US Rep
	 * @return the CRM US Rep that was added
	 */
	@Override
	public contact.manager.model.CrmUsRep addCrmUsRep(
		contact.manager.model.CrmUsRep crmUsRep) {

		return _crmUsRepLocalService.addCrmUsRep(crmUsRep);
	}

	/**
	 * Creates a new CRM US Rep with the primary key. Does not add the CRM US Rep to the database.
	 *
	 * @param crmUsRepId the primary key for the new CRM US Rep
	 * @return the new CRM US Rep
	 */
	@Override
	public contact.manager.model.CrmUsRep createCrmUsRep(long crmUsRepId) {
		return _crmUsRepLocalService.createCrmUsRep(crmUsRepId);
	}

	/**
	 * Deletes the CRM US Rep from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmUsRep the CRM US Rep
	 * @return the CRM US Rep that was removed
	 */
	@Override
	public contact.manager.model.CrmUsRep deleteCrmUsRep(
		contact.manager.model.CrmUsRep crmUsRep) {

		return _crmUsRepLocalService.deleteCrmUsRep(crmUsRep);
	}

	/**
	 * Deletes the CRM US Rep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmUsRepId the primary key of the CRM US Rep
	 * @return the CRM US Rep that was removed
	 * @throws PortalException if a CRM US Rep with the primary key could not be found
	 */
	@Override
	public contact.manager.model.CrmUsRep deleteCrmUsRep(long crmUsRepId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crmUsRepLocalService.deleteCrmUsRep(crmUsRepId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crmUsRepLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmUsRepLocalService.dynamicQuery();
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

		return _crmUsRepLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _crmUsRepLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _crmUsRepLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
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

		return _crmUsRepLocalService.dynamicQueryCount(dynamicQuery);
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

		return _crmUsRepLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public contact.manager.model.CrmUsRep fetchCrmUsRep(long crmUsRepId) {
		return _crmUsRepLocalService.fetchCrmUsRep(crmUsRepId);
	}

	/**
	 * Returns the CRM US Rep matching the UUID and group.
	 *
	 * @param uuid the CRM US Rep's UUID
	 * @param groupId the primary key of the group
	 * @return the matching CRM US Rep, or <code>null</code> if a matching CRM US Rep could not be found
	 */
	@Override
	public contact.manager.model.CrmUsRep fetchCrmUsRepByUuidAndGroupId(
		String uuid, long groupId) {

		return _crmUsRepLocalService.fetchCrmUsRepByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmUsRep> findByZipCode(
		String zipCode) {

		return _crmUsRepLocalService.findByZipCode(zipCode);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _crmUsRepLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the CRM US Rep with the primary key.
	 *
	 * @param crmUsRepId the primary key of the CRM US Rep
	 * @return the CRM US Rep
	 * @throws PortalException if a CRM US Rep with the primary key could not be found
	 */
	@Override
	public contact.manager.model.CrmUsRep getCrmUsRep(long crmUsRepId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crmUsRepLocalService.getCrmUsRep(crmUsRepId);
	}

	/**
	 * Returns the CRM US Rep matching the UUID and group.
	 *
	 * @param uuid the CRM US Rep's UUID
	 * @param groupId the primary key of the group
	 * @return the matching CRM US Rep
	 * @throws PortalException if a matching CRM US Rep could not be found
	 */
	@Override
	public contact.manager.model.CrmUsRep getCrmUsRepByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crmUsRepLocalService.getCrmUsRepByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the CRM US Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmUsRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @return the range of CRM US Reps
	 */
	@Override
	public java.util.List<contact.manager.model.CrmUsRep> getCrmUsReps(
		int start, int end) {

		return _crmUsRepLocalService.getCrmUsReps(start, end);
	}

	/**
	 * Returns all the CRM US Reps matching the UUID and company.
	 *
	 * @param uuid the UUID of the CRM US Reps
	 * @param companyId the primary key of the company
	 * @return the matching CRM US Reps, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<contact.manager.model.CrmUsRep>
		getCrmUsRepsByUuidAndCompanyId(String uuid, long companyId) {

		return _crmUsRepLocalService.getCrmUsRepsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of CRM US Reps matching the UUID and company.
	 *
	 * @param uuid the UUID of the CRM US Reps
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of CRM US Reps
	 * @param end the upper bound of the range of CRM US Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching CRM US Reps, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<contact.manager.model.CrmUsRep>
		getCrmUsRepsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<contact.manager.model.CrmUsRep> orderByComparator) {

		return _crmUsRepLocalService.getCrmUsRepsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of CRM US Reps.
	 *
	 * @return the number of CRM US Reps
	 */
	@Override
	public int getCrmUsRepsCount() {
		return _crmUsRepLocalService.getCrmUsRepsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _crmUsRepLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _crmUsRepLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _crmUsRepLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crmUsRepLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the CRM US Rep in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param crmUsRep the CRM US Rep
	 * @return the CRM US Rep that was updated
	 */
	@Override
	public contact.manager.model.CrmUsRep updateCrmUsRep(
		contact.manager.model.CrmUsRep crmUsRep) {

		return _crmUsRepLocalService.updateCrmUsRep(crmUsRep);
	}

	@Override
	public CrmUsRepLocalService getWrappedService() {
		return _crmUsRepLocalService;
	}

	@Override
	public void setWrappedService(CrmUsRepLocalService crmUsRepLocalService) {
		_crmUsRepLocalService = crmUsRepLocalService;
	}

	private CrmUsRepLocalService _crmUsRepLocalService;

}