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
 * Provides the local service utility for ExtVocationalHistory. This utility wraps
 * {@link ucc.portal.service.impl.ExtVocationalHistoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ExtVocationalHistoryLocalService
 * @see ucc.portal.service.base.ExtVocationalHistoryLocalServiceBaseImpl
 * @see ucc.portal.service.impl.ExtVocationalHistoryLocalServiceImpl
 * @generated
 */
@ProviderType
public class ExtVocationalHistoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ucc.portal.service.impl.ExtVocationalHistoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ext vocational history to the database. Also notifies the appropriate model listeners.
	*
	* @param extVocationalHistory the ext vocational history
	* @return the ext vocational history that was added
	*/
	public static ucc.portal.model.ExtVocationalHistory addExtVocationalHistory(
		ucc.portal.model.ExtVocationalHistory extVocationalHistory) {
		return getService().addExtVocationalHistory(extVocationalHistory);
	}

	/**
	* Creates a new ext vocational history with the primary key. Does not add the ext vocational history to the database.
	*
	* @param extVocationalHistoryId the primary key for the new ext vocational history
	* @return the new ext vocational history
	*/
	public static ucc.portal.model.ExtVocationalHistory createExtVocationalHistory(
		long extVocationalHistoryId) {
		return getService().createExtVocationalHistory(extVocationalHistoryId);
	}

	/**
	* Deletes the ext vocational history from the database. Also notifies the appropriate model listeners.
	*
	* @param extVocationalHistory the ext vocational history
	* @return the ext vocational history that was removed
	*/
	public static ucc.portal.model.ExtVocationalHistory deleteExtVocationalHistory(
		ucc.portal.model.ExtVocationalHistory extVocationalHistory) {
		return getService().deleteExtVocationalHistory(extVocationalHistory);
	}

	/**
	* Deletes the ext vocational history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extVocationalHistoryId the primary key of the ext vocational history
	* @return the ext vocational history that was removed
	* @throws PortalException if a ext vocational history with the primary key could not be found
	*/
	public static ucc.portal.model.ExtVocationalHistory deleteExtVocationalHistory(
		long extVocationalHistoryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteExtVocationalHistory(extVocationalHistoryId);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static ucc.portal.model.ExtVocationalHistory fetchExtVocationalHistory(
		long extVocationalHistoryId) {
		return getService().fetchExtVocationalHistory(extVocationalHistoryId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns a range of all the ext vocational histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtVocationalHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext vocational histories
	* @param end the upper bound of the range of ext vocational histories (not inclusive)
	* @return the range of ext vocational histories
	*/
	public static java.util.List<ucc.portal.model.ExtVocationalHistory> getExtVocationalHistories(
		int start, int end) {
		return getService().getExtVocationalHistories(start, end);
	}

	/**
	* Returns the number of ext vocational histories.
	*
	* @return the number of ext vocational histories
	*/
	public static int getExtVocationalHistoriesCount() {
		return getService().getExtVocationalHistoriesCount();
	}

	/**
	* Returns the ext vocational history with the primary key.
	*
	* @param extVocationalHistoryId the primary key of the ext vocational history
	* @return the ext vocational history
	* @throws PortalException if a ext vocational history with the primary key could not be found
	*/
	public static ucc.portal.model.ExtVocationalHistory getExtVocationalHistory(
		long extVocationalHistoryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getExtVocationalHistory(extVocationalHistoryId);
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
	* Updates the ext vocational history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param extVocationalHistory the ext vocational history
	* @return the ext vocational history that was updated
	*/
	public static ucc.portal.model.ExtVocationalHistory updateExtVocationalHistory(
		ucc.portal.model.ExtVocationalHistory extVocationalHistory) {
		return getService().updateExtVocationalHistory(extVocationalHistory);
	}

	public static ExtVocationalHistoryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ExtVocationalHistoryLocalService, ExtVocationalHistoryLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ExtVocationalHistoryLocalService.class);

		ServiceTracker<ExtVocationalHistoryLocalService, ExtVocationalHistoryLocalService> serviceTracker =
			new ServiceTracker<ExtVocationalHistoryLocalService, ExtVocationalHistoryLocalService>(bundle.getBundleContext(),
				ExtVocationalHistoryLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}