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
 * Provides a wrapper for {@link CrmContactAuditLogLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogLocalService
 * @generated
 */
@ProviderType
public class CrmContactAuditLogLocalServiceWrapper
	implements CrmContactAuditLogLocalService,
		ServiceWrapper<CrmContactAuditLogLocalService> {
	public CrmContactAuditLogLocalServiceWrapper(
		CrmContactAuditLogLocalService crmContactAuditLogLocalService) {
		_crmContactAuditLogLocalService = crmContactAuditLogLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmContactAuditLogLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmContactAuditLogLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmContactAuditLogLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmContactAuditLogLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactAuditLogLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactAuditLogLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM Contact Audit Log to the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactAuditLog the CRM Contact Audit Log
	* @return the CRM Contact Audit Log that was added
	*/
	@Override
	public contact.manager.model.CrmContactAuditLog addCrmContactAuditLog(
		contact.manager.model.CrmContactAuditLog crmContactAuditLog) {
		return _crmContactAuditLogLocalService.addCrmContactAuditLog(crmContactAuditLog);
	}

	/**
	* Creates a new CRM Contact Audit Log with the primary key. Does not add the CRM Contact Audit Log to the database.
	*
	* @param crmContactAuditLogId the primary key for the new CRM Contact Audit Log
	* @return the new CRM Contact Audit Log
	*/
	@Override
	public contact.manager.model.CrmContactAuditLog createCrmContactAuditLog(
		long crmContactAuditLogId) {
		return _crmContactAuditLogLocalService.createCrmContactAuditLog(crmContactAuditLogId);
	}

	/**
	* Deletes the CRM Contact Audit Log from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactAuditLog the CRM Contact Audit Log
	* @return the CRM Contact Audit Log that was removed
	*/
	@Override
	public contact.manager.model.CrmContactAuditLog deleteCrmContactAuditLog(
		contact.manager.model.CrmContactAuditLog crmContactAuditLog) {
		return _crmContactAuditLogLocalService.deleteCrmContactAuditLog(crmContactAuditLog);
	}

	/**
	* Deletes the CRM Contact Audit Log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	* @return the CRM Contact Audit Log that was removed
	* @throws PortalException if a CRM Contact Audit Log with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmContactAuditLog deleteCrmContactAuditLog(
		long crmContactAuditLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactAuditLogLocalService.deleteCrmContactAuditLog(crmContactAuditLogId);
	}

	@Override
	public contact.manager.model.CrmContactAuditLog fetchCrmContactAuditLog(
		long crmContactAuditLogId) {
		return _crmContactAuditLogLocalService.fetchCrmContactAuditLog(crmContactAuditLogId);
	}

	/**
	* Returns the CRM Contact Audit Log matching the UUID and group.
	*
	* @param uuid the CRM Contact Audit Log's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	@Override
	public contact.manager.model.CrmContactAuditLog fetchCrmContactAuditLogByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _crmContactAuditLogLocalService.fetchCrmContactAuditLogByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the CRM Contact Audit Log with the primary key.
	*
	* @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	* @return the CRM Contact Audit Log
	* @throws PortalException if a CRM Contact Audit Log with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmContactAuditLog getCrmContactAuditLog(
		long crmContactAuditLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactAuditLogLocalService.getCrmContactAuditLog(crmContactAuditLogId);
	}

	/**
	* Returns the CRM Contact Audit Log matching the UUID and group.
	*
	* @param uuid the CRM Contact Audit Log's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Contact Audit Log
	* @throws PortalException if a matching CRM Contact Audit Log could not be found
	*/
	@Override
	public contact.manager.model.CrmContactAuditLog getCrmContactAuditLogByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactAuditLogLocalService.getCrmContactAuditLogByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the CRM Contact Audit Log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmContactAuditLog the CRM Contact Audit Log
	* @return the CRM Contact Audit Log that was updated
	*/
	@Override
	public contact.manager.model.CrmContactAuditLog updateCrmContactAuditLog(
		contact.manager.model.CrmContactAuditLog crmContactAuditLog) {
		return _crmContactAuditLogLocalService.updateCrmContactAuditLog(crmContactAuditLog);
	}

	@Override
	public int countByCrmContactId(long crmContactId) {
		return _crmContactAuditLogLocalService.countByCrmContactId(crmContactId);
	}

	/**
	* Returns the number of CRM Contact Audit Logs.
	*
	* @return the number of CRM Contact Audit Logs
	*/
	@Override
	public int getCrmContactAuditLogsCount() {
		return _crmContactAuditLogLocalService.getCrmContactAuditLogsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmContactAuditLogLocalService.getOSGiServiceIdentifier();
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
		return _crmContactAuditLogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmContactAuditLogLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmContactAuditLogLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContactAuditLog> findByCrmContactId(
		long crmContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactAuditLogLocalService.findByCrmContactId(crmContactId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContactAuditLog> findByCrmContactId(
		long crmContactId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactAuditLogLocalService.findByCrmContactId(crmContactId,
			start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContactAuditLog> findByCrmContactId(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContactAuditLog> orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactAuditLogLocalService.findByCrmContactId(crmContactId,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the CRM Contact Audit Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @return the range of CRM Contact Audit Logs
	*/
	@Override
	public java.util.List<contact.manager.model.CrmContactAuditLog> getCrmContactAuditLogs(
		int start, int end) {
		return _crmContactAuditLogLocalService.getCrmContactAuditLogs(start, end);
	}

	/**
	* Returns all the CRM Contact Audit Logs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Contact Audit Logs
	* @param companyId the primary key of the company
	* @return the matching CRM Contact Audit Logs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmContactAuditLog> getCrmContactAuditLogsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _crmContactAuditLogLocalService.getCrmContactAuditLogsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of CRM Contact Audit Logs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Contact Audit Logs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Contact Audit Logs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmContactAuditLog> getCrmContactAuditLogsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContactAuditLog> orderByComparator) {
		return _crmContactAuditLogLocalService.getCrmContactAuditLogsByUuidAndCompanyId(uuid,
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
		return _crmContactAuditLogLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmContactAuditLogLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public CrmContactAuditLogLocalService getWrappedService() {
		return _crmContactAuditLogLocalService;
	}

	@Override
	public void setWrappedService(
		CrmContactAuditLogLocalService crmContactAuditLogLocalService) {
		_crmContactAuditLogLocalService = crmContactAuditLogLocalService;
	}

	private CrmContactAuditLogLocalService _crmContactAuditLogLocalService;
}