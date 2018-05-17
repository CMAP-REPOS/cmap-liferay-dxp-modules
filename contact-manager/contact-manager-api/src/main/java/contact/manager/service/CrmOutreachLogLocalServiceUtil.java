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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CrmOutreachLog. This utility wraps
 * {@link contact.manager.service.impl.CrmOutreachLogLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmOutreachLogLocalService
 * @see contact.manager.service.base.CrmOutreachLogLocalServiceBaseImpl
 * @see contact.manager.service.impl.CrmOutreachLogLocalServiceImpl
 * @generated
 */
@ProviderType
public class CrmOutreachLogLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.impl.CrmOutreachLogLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM Outreach Log to the database. Also notifies the appropriate model listeners.
	*
	* @param crmOutreachLog the CRM Outreach Log
	* @return the CRM Outreach Log that was added
	*/
	public static contact.manager.model.CrmOutreachLog addCrmOutreachLog(
		contact.manager.model.CrmOutreachLog crmOutreachLog) {
		return getService().addCrmOutreachLog(crmOutreachLog);
	}

	/**
	* Creates a new CRM Outreach Log with the primary key. Does not add the CRM Outreach Log to the database.
	*
	* @param crmOutreachLogId the primary key for the new CRM Outreach Log
	* @return the new CRM Outreach Log
	*/
	public static contact.manager.model.CrmOutreachLog createCrmOutreachLog(
		long crmOutreachLogId) {
		return getService().createCrmOutreachLog(crmOutreachLogId);
	}

	/**
	* Deletes the CRM Outreach Log from the database. Also notifies the appropriate model listeners.
	*
	* @param crmOutreachLog the CRM Outreach Log
	* @return the CRM Outreach Log that was removed
	*/
	public static contact.manager.model.CrmOutreachLog deleteCrmOutreachLog(
		contact.manager.model.CrmOutreachLog crmOutreachLog) {
		return getService().deleteCrmOutreachLog(crmOutreachLog);
	}

	/**
	* Deletes the CRM Outreach Log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmOutreachLogId the primary key of the CRM Outreach Log
	* @return the CRM Outreach Log that was removed
	* @throws PortalException if a CRM Outreach Log with the primary key could not be found
	*/
	public static contact.manager.model.CrmOutreachLog deleteCrmOutreachLog(
		long crmOutreachLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCrmOutreachLog(crmOutreachLogId);
	}

	public static contact.manager.model.CrmOutreachLog fetchCrmOutreachLog(
		long crmOutreachLogId) {
		return getService().fetchCrmOutreachLog(crmOutreachLogId);
	}

	/**
	* Returns the CRM Outreach Log matching the UUID and group.
	*
	* @param uuid the CRM Outreach Log's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Outreach Log, or <code>null</code> if a matching CRM Outreach Log could not be found
	*/
	public static contact.manager.model.CrmOutreachLog fetchCrmOutreachLogByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchCrmOutreachLogByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the CRM Outreach Log with the primary key.
	*
	* @param crmOutreachLogId the primary key of the CRM Outreach Log
	* @return the CRM Outreach Log
	* @throws PortalException if a CRM Outreach Log with the primary key could not be found
	*/
	public static contact.manager.model.CrmOutreachLog getCrmOutreachLog(
		long crmOutreachLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmOutreachLog(crmOutreachLogId);
	}

	/**
	* Returns the CRM Outreach Log matching the UUID and group.
	*
	* @param uuid the CRM Outreach Log's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Outreach Log
	* @throws PortalException if a matching CRM Outreach Log could not be found
	*/
	public static contact.manager.model.CrmOutreachLog getCrmOutreachLogByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmOutreachLogByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the CRM Outreach Log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmOutreachLog the CRM Outreach Log
	* @return the CRM Outreach Log that was updated
	*/
	public static contact.manager.model.CrmOutreachLog updateCrmOutreachLog(
		contact.manager.model.CrmOutreachLog crmOutreachLog) {
		return getService().updateCrmOutreachLog(crmOutreachLog);
	}

	/**
	* Returns the number of CRM Outreach Logs.
	*
	* @return the number of CRM Outreach Logs
	*/
	public static int getCrmOutreachLogsCount() {
		return getService().getCrmOutreachLogsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmOutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
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
	public static java.util.List<contact.manager.model.CrmOutreachLog> getCrmOutreachLogs(
		int start, int end) {
		return getService().getCrmOutreachLogs(start, end);
	}

	/**
	* Returns all the CRM Outreach Logs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Outreach Logs
	* @param companyId the primary key of the company
	* @return the matching CRM Outreach Logs, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmOutreachLog> getCrmOutreachLogsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getCrmOutreachLogsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<contact.manager.model.CrmOutreachLog> getCrmOutreachLogsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmOutreachLog> orderByComparator) {
		return getService()
				   .getCrmOutreachLogsByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
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

	public static CrmOutreachLogLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmOutreachLogLocalService, CrmOutreachLogLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CrmOutreachLogLocalService.class);
}