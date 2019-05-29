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

package ucc.portal.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ExtDownloadLog. This utility wraps
 * {@link ucc.portal.service.impl.ExtDownloadLogLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ExtDownloadLogLocalService
 * @see ucc.portal.service.base.ExtDownloadLogLocalServiceBaseImpl
 * @see ucc.portal.service.impl.ExtDownloadLogLocalServiceImpl
 * @generated
 */
@ProviderType
public class ExtDownloadLogLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ucc.portal.service.impl.ExtDownloadLogLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ext download log to the database. Also notifies the appropriate model listeners.
	*
	* @param extDownloadLog the ext download log
	* @return the ext download log that was added
	*/
	public static ucc.portal.model.ExtDownloadLog addExtDownloadLog(
		ucc.portal.model.ExtDownloadLog extDownloadLog) {
		return getService().addExtDownloadLog(extDownloadLog);
	}

	/**
	* Creates a new ext download log with the primary key. Does not add the ext download log to the database.
	*
	* @param extDownloadLogId the primary key for the new ext download log
	* @return the new ext download log
	*/
	public static ucc.portal.model.ExtDownloadLog createExtDownloadLog(
		long extDownloadLogId) {
		return getService().createExtDownloadLog(extDownloadLogId);
	}

	/**
	* Deletes the ext download log from the database. Also notifies the appropriate model listeners.
	*
	* @param extDownloadLog the ext download log
	* @return the ext download log that was removed
	*/
	public static ucc.portal.model.ExtDownloadLog deleteExtDownloadLog(
		ucc.portal.model.ExtDownloadLog extDownloadLog) {
		return getService().deleteExtDownloadLog(extDownloadLog);
	}

	/**
	* Deletes the ext download log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extDownloadLogId the primary key of the ext download log
	* @return the ext download log that was removed
	* @throws PortalException if a ext download log with the primary key could not be found
	*/
	public static ucc.portal.model.ExtDownloadLog deleteExtDownloadLog(
		long extDownloadLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteExtDownloadLog(extDownloadLogId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static ucc.portal.model.ExtDownloadLog fetchExtDownloadLog(
		long extDownloadLogId) {
		return getService().fetchExtDownloadLog(extDownloadLogId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the ext download log with the primary key.
	*
	* @param extDownloadLogId the primary key of the ext download log
	* @return the ext download log
	* @throws PortalException if a ext download log with the primary key could not be found
	*/
	public static ucc.portal.model.ExtDownloadLog getExtDownloadLog(
		long extDownloadLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getExtDownloadLog(extDownloadLogId);
	}

	/**
	* Returns a range of all the ext download logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @return the range of ext download logs
	*/
	public static java.util.List<ucc.portal.model.ExtDownloadLog> getExtDownloadLogs(
		int start, int end) {
		return getService().getExtDownloadLogs(start, end);
	}

	/**
	* Returns the number of ext download logs.
	*
	* @return the number of ext download logs
	*/
	public static int getExtDownloadLogsCount() {
		return getService().getExtDownloadLogsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
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

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the ext download log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param extDownloadLog the ext download log
	* @return the ext download log that was updated
	*/
	public static ucc.portal.model.ExtDownloadLog updateExtDownloadLog(
		ucc.portal.model.ExtDownloadLog extDownloadLog) {
		return getService().updateExtDownloadLog(extDownloadLog);
	}

	public static ExtDownloadLogLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ExtDownloadLogLocalService, ExtDownloadLogLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ExtDownloadLogLocalService.class);

		ServiceTracker<ExtDownloadLogLocalService, ExtDownloadLogLocalService> serviceTracker =
			new ServiceTracker<ExtDownloadLogLocalService, ExtDownloadLogLocalService>(bundle.getBundleContext(),
				ExtDownloadLogLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}