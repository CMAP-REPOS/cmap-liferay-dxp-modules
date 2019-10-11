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
 * Provides a wrapper for {@link CrmOutreachLogLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmOutreachLogLocalService
 * @generated
 */
@ProviderType
public class CrmOutreachLogLocalServiceWrapper
	implements CrmOutreachLogLocalService,
		ServiceWrapper<CrmOutreachLogLocalService> {
	public CrmOutreachLogLocalServiceWrapper(
		CrmOutreachLogLocalService crmOutreachLogLocalService) {
		_crmOutreachLogLocalService = crmOutreachLogLocalService;
	}

	/**
	* Adds the CRM Outreach Log to the database. Also notifies the appropriate model listeners.
	*
	* @param crmOutreachLog the CRM Outreach Log
	* @return the CRM Outreach Log that was added
	*/
	@Override
	public contact.manager.model.CrmOutreachLog addCrmOutreachLog(
		contact.manager.model.CrmOutreachLog crmOutreachLog) {
		return _crmOutreachLogLocalService.addCrmOutreachLog(crmOutreachLog);
	}

	@Override
	public int countByCrmContactIdId(long crmContactId) {
		return _crmOutreachLogLocalService.countByCrmContactIdId(crmContactId);
	}

	/**
	* Creates a new CRM Outreach Log with the primary key. Does not add the CRM Outreach Log to the database.
	*
	* @param crmOutreachLogId the primary key for the new CRM Outreach Log
	* @return the new CRM Outreach Log
	*/
	@Override
	public contact.manager.model.CrmOutreachLog createCrmOutreachLog(
		long crmOutreachLogId) {
		return _crmOutreachLogLocalService.createCrmOutreachLog(crmOutreachLogId);
	}

	/**
	* Deletes the CRM Outreach Log from the database. Also notifies the appropriate model listeners.
	*
	* @param crmOutreachLog the CRM Outreach Log
	* @return the CRM Outreach Log that was removed
	*/
	@Override
	public contact.manager.model.CrmOutreachLog deleteCrmOutreachLog(
		contact.manager.model.CrmOutreachLog crmOutreachLog) {
		return _crmOutreachLogLocalService.deleteCrmOutreachLog(crmOutreachLog);
	}

	/**
	* Deletes the CRM Outreach Log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmOutreachLogId the primary key of the CRM Outreach Log
	* @return the CRM Outreach Log that was removed
	* @throws PortalException if a CRM Outreach Log with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmOutreachLog deleteCrmOutreachLog(
		long crmOutreachLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmOutreachLogLocalService.deleteCrmOutreachLog(crmOutreachLogId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmOutreachLogLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmOutreachLogLocalService.dynamicQuery();
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
		return _crmOutreachLogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmOutreachLogLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmOutreachLogLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _crmOutreachLogLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmOutreachLogLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public contact.manager.model.CrmOutreachLog fetchCrmOutreachLog(
		long crmOutreachLogId) {
		return _crmOutreachLogLocalService.fetchCrmOutreachLog(crmOutreachLogId);
	}

	/**
	* Returns the CRM Outreach Log matching the UUID and group.
	*
	* @param uuid the CRM Outreach Log's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	@Override
	public contact.manager.model.CrmOutreachLog fetchCrmOutreachLogByUuidAndGroupId(
		String uuid, long groupId) {
		return _crmOutreachLogLocalService.fetchCrmOutreachLogByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmOutreachLog> findByCrmContactId(
		long crmContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmOutreachLogLocalService.findByCrmContactId(crmContactId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmOutreachLog> findByCrmContactId(
		long crmContactId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmOutreachLogLocalService.findByCrmContactId(crmContactId,
			start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmOutreachLog> findByCrmContactId(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmOutreachLog> orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmOutreachLogLocalService.findByCrmContactId(crmContactId,
			start, end, orderByComparator);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmOutreachLogLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the CRM Outreach Log with the primary key.
	*
	* @param crmOutreachLogId the primary key of the CRM Outreach Log
	* @return the CRM Outreach Log
	* @throws PortalException if a CRM Outreach Log with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmOutreachLog getCrmOutreachLog(
		long crmOutreachLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmOutreachLogLocalService.getCrmOutreachLog(crmOutreachLogId);
	}

	/**
	* Returns the CRM Outreach Log matching the UUID and group.
	*
	* @param uuid the CRM Outreach Log's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Outreach Log
	* @throws PortalException if a matching CRM Outreach Log could not be found
	*/
	@Override
	public contact.manager.model.CrmOutreachLog getCrmOutreachLogByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmOutreachLogLocalService.getCrmOutreachLogByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the CRM Outreach Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @return the range of CRM Outreach Logs
	*/
	@Override
	public java.util.List<contact.manager.model.CrmOutreachLog> getCrmOutreachLogs(
		int start, int end) {
		return _crmOutreachLogLocalService.getCrmOutreachLogs(start, end);
	}

	/**
	* Returns all the CRM Outreach Logs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Outreach Logs
	* @param companyId the primary key of the company
	* @return the matching CRM Outreach Logs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmOutreachLog> getCrmOutreachLogsByUuidAndCompanyId(
		String uuid, long companyId) {
		return _crmOutreachLogLocalService.getCrmOutreachLogsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of CRM Outreach Logs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Outreach Logs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Outreach Logs
	* @param end the upper bound of the range of CRM Outreach Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Outreach Logs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmOutreachLog> getCrmOutreachLogsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmOutreachLog> orderByComparator) {
		return _crmOutreachLogLocalService.getCrmOutreachLogsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of CRM Outreach Logs.
	*
	* @return the number of CRM Outreach Logs
	*/
	@Override
	public int getCrmOutreachLogsCount() {
		return _crmOutreachLogLocalService.getCrmOutreachLogsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmOutreachLogLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmOutreachLogLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _crmOutreachLogLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmOutreachLogLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the CRM Outreach Log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmOutreachLog the CRM Outreach Log
	* @return the CRM Outreach Log that was updated
	*/
	@Override
	public contact.manager.model.CrmOutreachLog updateCrmOutreachLog(
		contact.manager.model.CrmOutreachLog crmOutreachLog) {
		return _crmOutreachLogLocalService.updateCrmOutreachLog(crmOutreachLog);
	}

	@Override
	public CrmOutreachLogLocalService getWrappedService() {
		return _crmOutreachLogLocalService;
	}

	@Override
	public void setWrappedService(
		CrmOutreachLogLocalService crmOutreachLogLocalService) {
		_crmOutreachLogLocalService = crmOutreachLogLocalService;
	}

	private CrmOutreachLogLocalService _crmOutreachLogLocalService;
}