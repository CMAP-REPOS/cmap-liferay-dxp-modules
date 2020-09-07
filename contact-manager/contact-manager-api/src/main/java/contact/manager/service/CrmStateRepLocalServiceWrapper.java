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
 * Provides a wrapper for {@link CrmStateRepLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateRepLocalService
 * @generated
 */
@ProviderType
public class CrmStateRepLocalServiceWrapper
	implements CrmStateRepLocalService,
			   ServiceWrapper<CrmStateRepLocalService> {

	public CrmStateRepLocalServiceWrapper(
		CrmStateRepLocalService crmStateRepLocalService) {

		_crmStateRepLocalService = crmStateRepLocalService;
	}

	/**
	 * Adds the CRM State Rep to the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmStateRep the CRM State Rep
	 * @return the CRM State Rep that was added
	 */
	@Override
	public contact.manager.model.CrmStateRep addCrmStateRep(
		contact.manager.model.CrmStateRep crmStateRep) {

		return _crmStateRepLocalService.addCrmStateRep(crmStateRep);
	}

	/**
	 * Creates a new CRM State Rep with the primary key. Does not add the CRM State Rep to the database.
	 *
	 * @param crmStateRepId the primary key for the new CRM State Rep
	 * @return the new CRM State Rep
	 */
	@Override
	public contact.manager.model.CrmStateRep createCrmStateRep(
		long crmStateRepId) {

		return _crmStateRepLocalService.createCrmStateRep(crmStateRepId);
	}

	/**
	 * Deletes the CRM State Rep from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmStateRep the CRM State Rep
	 * @return the CRM State Rep that was removed
	 */
	@Override
	public contact.manager.model.CrmStateRep deleteCrmStateRep(
		contact.manager.model.CrmStateRep crmStateRep) {

		return _crmStateRepLocalService.deleteCrmStateRep(crmStateRep);
	}

	/**
	 * Deletes the CRM State Rep with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmStateRepId the primary key of the CRM State Rep
	 * @return the CRM State Rep that was removed
	 * @throws PortalException if a CRM State Rep with the primary key could not be found
	 */
	@Override
	public contact.manager.model.CrmStateRep deleteCrmStateRep(
			long crmStateRepId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crmStateRepLocalService.deleteCrmStateRep(crmStateRepId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crmStateRepLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmStateRepLocalService.dynamicQuery();
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

		return _crmStateRepLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _crmStateRepLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _crmStateRepLocalService.dynamicQuery(
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

		return _crmStateRepLocalService.dynamicQueryCount(dynamicQuery);
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

		return _crmStateRepLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public contact.manager.model.CrmStateRep fetchCrmStateRep(
		long crmStateRepId) {

		return _crmStateRepLocalService.fetchCrmStateRep(crmStateRepId);
	}

	/**
	 * Returns the CRM State Rep matching the UUID and group.
	 *
	 * @param uuid the CRM State Rep's UUID
	 * @param groupId the primary key of the group
	 * @return the matching CRM State Rep, or <code>null</code> if a matching CRM State Rep could not be found
	 */
	@Override
	public contact.manager.model.CrmStateRep fetchCrmStateRepByUuidAndGroupId(
		String uuid, long groupId) {

		return _crmStateRepLocalService.fetchCrmStateRepByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmStateRep> findByZipCode(
		String zipCode) {

		return _crmStateRepLocalService.findByZipCode(zipCode);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _crmStateRepLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the CRM State Rep with the primary key.
	 *
	 * @param crmStateRepId the primary key of the CRM State Rep
	 * @return the CRM State Rep
	 * @throws PortalException if a CRM State Rep with the primary key could not be found
	 */
	@Override
	public contact.manager.model.CrmStateRep getCrmStateRep(long crmStateRepId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crmStateRepLocalService.getCrmStateRep(crmStateRepId);
	}

	/**
	 * Returns the CRM State Rep matching the UUID and group.
	 *
	 * @param uuid the CRM State Rep's UUID
	 * @param groupId the primary key of the group
	 * @return the matching CRM State Rep
	 * @throws PortalException if a matching CRM State Rep could not be found
	 */
	@Override
	public contact.manager.model.CrmStateRep getCrmStateRepByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crmStateRepLocalService.getCrmStateRepByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the CRM State Reps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmStateRepModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @return the range of CRM State Reps
	 */
	@Override
	public java.util.List<contact.manager.model.CrmStateRep> getCrmStateReps(
		int start, int end) {

		return _crmStateRepLocalService.getCrmStateReps(start, end);
	}

	/**
	 * Returns all the CRM State Reps matching the UUID and company.
	 *
	 * @param uuid the UUID of the CRM State Reps
	 * @param companyId the primary key of the company
	 * @return the matching CRM State Reps, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<contact.manager.model.CrmStateRep>
		getCrmStateRepsByUuidAndCompanyId(String uuid, long companyId) {

		return _crmStateRepLocalService.getCrmStateRepsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of CRM State Reps matching the UUID and company.
	 *
	 * @param uuid the UUID of the CRM State Reps
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of CRM State Reps
	 * @param end the upper bound of the range of CRM State Reps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching CRM State Reps, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<contact.manager.model.CrmStateRep>
		getCrmStateRepsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<contact.manager.model.CrmStateRep> orderByComparator) {

		return _crmStateRepLocalService.getCrmStateRepsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of CRM State Reps.
	 *
	 * @return the number of CRM State Reps
	 */
	@Override
	public int getCrmStateRepsCount() {
		return _crmStateRepLocalService.getCrmStateRepsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _crmStateRepLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _crmStateRepLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _crmStateRepLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crmStateRepLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the CRM State Rep in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param crmStateRep the CRM State Rep
	 * @return the CRM State Rep that was updated
	 */
	@Override
	public contact.manager.model.CrmStateRep updateCrmStateRep(
		contact.manager.model.CrmStateRep crmStateRep) {

		return _crmStateRepLocalService.updateCrmStateRep(crmStateRep);
	}

	@Override
	public CrmStateRepLocalService getWrappedService() {
		return _crmStateRepLocalService;
	}

	@Override
	public void setWrappedService(
		CrmStateRepLocalService crmStateRepLocalService) {

		_crmStateRepLocalService = crmStateRepLocalService;
	}

	private CrmStateRepLocalService _crmStateRepLocalService;

}