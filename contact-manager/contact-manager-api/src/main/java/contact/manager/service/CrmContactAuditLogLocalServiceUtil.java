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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CrmContactAuditLog. This utility wraps
 * <code>contact.manager.service.impl.CrmContactAuditLogLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogLocalService
 * @generated
 */
@ProviderType
public class CrmContactAuditLogLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>contact.manager.service.impl.CrmContactAuditLogLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the CRM Contact Audit Log to the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmContactAuditLog the CRM Contact Audit Log
	 * @return the CRM Contact Audit Log that was added
	 */
	public static contact.manager.model.CrmContactAuditLog
		addCrmContactAuditLog(
			contact.manager.model.CrmContactAuditLog crmContactAuditLog) {

		return getService().addCrmContactAuditLog(crmContactAuditLog);
	}

	public static int countByCrmContactId(long crmContactId) {
		return getService().countByCrmContactId(crmContactId);
	}

	/**
	 * Creates a new CRM Contact Audit Log with the primary key. Does not add the CRM Contact Audit Log to the database.
	 *
	 * @param crmContactAuditLogId the primary key for the new CRM Contact Audit Log
	 * @return the new CRM Contact Audit Log
	 */
	public static contact.manager.model.CrmContactAuditLog
		createCrmContactAuditLog(long crmContactAuditLogId) {

		return getService().createCrmContactAuditLog(crmContactAuditLogId);
	}

	/**
	 * Deletes the CRM Contact Audit Log from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmContactAuditLog the CRM Contact Audit Log
	 * @return the CRM Contact Audit Log that was removed
	 */
	public static contact.manager.model.CrmContactAuditLog
		deleteCrmContactAuditLog(
			contact.manager.model.CrmContactAuditLog crmContactAuditLog) {

		return getService().deleteCrmContactAuditLog(crmContactAuditLog);
	}

	/**
	 * Deletes the CRM Contact Audit Log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	 * @return the CRM Contact Audit Log that was removed
	 * @throws PortalException if a CRM Contact Audit Log with the primary key could not be found
	 */
	public static contact.manager.model.CrmContactAuditLog
			deleteCrmContactAuditLog(long crmContactAuditLogId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCrmContactAuditLog(crmContactAuditLogId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmContactAuditLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmContactAuditLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static contact.manager.model.CrmContactAuditLog
		fetchCrmContactAuditLog(long crmContactAuditLogId) {

		return getService().fetchCrmContactAuditLog(crmContactAuditLogId);
	}

	/**
	 * Returns the CRM Contact Audit Log matching the UUID and group.
	 *
	 * @param uuid the CRM Contact Audit Log's UUID
	 * @param groupId the primary key of the group
	 * @return the matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	 */
	public static contact.manager.model.CrmContactAuditLog
		fetchCrmContactAuditLogByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchCrmContactAuditLogByUuidAndGroupId(
			uuid, groupId);
	}

	public static java.util.List<contact.manager.model.CrmContactAuditLog>
			findByCrmContactId(long crmContactId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().findByCrmContactId(crmContactId);
	}

	public static java.util.List<contact.manager.model.CrmContactAuditLog>
			findByCrmContactId(long crmContactId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().findByCrmContactId(crmContactId, start, end);
	}

	public static java.util.List<contact.manager.model.CrmContactAuditLog>
			findByCrmContactId(
				long crmContactId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<contact.manager.model.CrmContactAuditLog>
						orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().findByCrmContactId(
			crmContactId, start, end, orderByComparator);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the CRM Contact Audit Log with the primary key.
	 *
	 * @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	 * @return the CRM Contact Audit Log
	 * @throws PortalException if a CRM Contact Audit Log with the primary key could not be found
	 */
	public static contact.manager.model.CrmContactAuditLog
			getCrmContactAuditLog(long crmContactAuditLogId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCrmContactAuditLog(crmContactAuditLogId);
	}

	/**
	 * Returns the CRM Contact Audit Log matching the UUID and group.
	 *
	 * @param uuid the CRM Contact Audit Log's UUID
	 * @param groupId the primary key of the group
	 * @return the matching CRM Contact Audit Log
	 * @throws PortalException if a matching CRM Contact Audit Log could not be found
	 */
	public static contact.manager.model.CrmContactAuditLog
			getCrmContactAuditLogByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCrmContactAuditLogByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the CRM Contact Audit Logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmContactAuditLogModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contact Audit Logs
	 * @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	 * @return the range of CRM Contact Audit Logs
	 */
	public static java.util.List<contact.manager.model.CrmContactAuditLog>
		getCrmContactAuditLogs(int start, int end) {

		return getService().getCrmContactAuditLogs(start, end);
	}

	/**
	 * Returns all the CRM Contact Audit Logs matching the UUID and company.
	 *
	 * @param uuid the UUID of the CRM Contact Audit Logs
	 * @param companyId the primary key of the company
	 * @return the matching CRM Contact Audit Logs, or an empty list if no matches were found
	 */
	public static java.util.List<contact.manager.model.CrmContactAuditLog>
		getCrmContactAuditLogsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getCrmContactAuditLogsByUuidAndCompanyId(
			uuid, companyId);
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
	public static java.util.List<contact.manager.model.CrmContactAuditLog>
		getCrmContactAuditLogsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<contact.manager.model.CrmContactAuditLog> orderByComparator) {

		return getService().getCrmContactAuditLogsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of CRM Contact Audit Logs.
	 *
	 * @return the number of CRM Contact Audit Logs
	 */
	public static int getCrmContactAuditLogsCount() {
		return getService().getCrmContactAuditLogsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the CRM Contact Audit Log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param crmContactAuditLog the CRM Contact Audit Log
	 * @return the CRM Contact Audit Log that was updated
	 */
	public static contact.manager.model.CrmContactAuditLog
		updateCrmContactAuditLog(
			contact.manager.model.CrmContactAuditLog crmContactAuditLog) {

		return getService().updateCrmContactAuditLog(crmContactAuditLog);
	}

	public static CrmContactAuditLogLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<CrmContactAuditLogLocalService, CrmContactAuditLogLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			CrmContactAuditLogLocalService.class);

		ServiceTracker
			<CrmContactAuditLogLocalService, CrmContactAuditLogLocalService>
				serviceTracker =
					new ServiceTracker
						<CrmContactAuditLogLocalService,
						 CrmContactAuditLogLocalService>(
							 bundle.getBundleContext(),
							 CrmContactAuditLogLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}