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

package contact.manager.service.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for County_Commissioner_or_Board_Dist. This utility wraps
 * {@link contact.manager.service.service.impl.County_Commissioner_or_Board_DistLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see County_Commissioner_or_Board_DistLocalService
 * @see contact.manager.service.service.base.County_Commissioner_or_Board_DistLocalServiceBaseImpl
 * @see contact.manager.service.service.impl.County_Commissioner_or_Board_DistLocalServiceImpl
 * @generated
 */
@ProviderType
public class County_Commissioner_or_Board_DistLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.service.impl.County_Commissioner_or_Board_DistLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
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
	* Adds the county_ commissioner_or_ board_ dist to the database. Also notifies the appropriate model listeners.
	*
	* @param county_Commissioner_or_Board_Dist the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist that was added
	*/
	public static contact.manager.service.model.County_Commissioner_or_Board_Dist addCounty_Commissioner_or_Board_Dist(
		contact.manager.service.model.County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		return getService()
				   .addCounty_Commissioner_or_Board_Dist(county_Commissioner_or_Board_Dist);
	}

	/**
	* Creates a new county_ commissioner_or_ board_ dist with the primary key. Does not add the county_ commissioner_or_ board_ dist to the database.
	*
	* @param ccbdId the primary key for the new county_ commissioner_or_ board_ dist
	* @return the new county_ commissioner_or_ board_ dist
	*/
	public static contact.manager.service.model.County_Commissioner_or_Board_Dist createCounty_Commissioner_or_Board_Dist(
		long ccbdId) {
		return getService().createCounty_Commissioner_or_Board_Dist(ccbdId);
	}

	/**
	* Deletes the county_ commissioner_or_ board_ dist from the database. Also notifies the appropriate model listeners.
	*
	* @param county_Commissioner_or_Board_Dist the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist that was removed
	*/
	public static contact.manager.service.model.County_Commissioner_or_Board_Dist deleteCounty_Commissioner_or_Board_Dist(
		contact.manager.service.model.County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		return getService()
				   .deleteCounty_Commissioner_or_Board_Dist(county_Commissioner_or_Board_Dist);
	}

	/**
	* Deletes the county_ commissioner_or_ board_ dist with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist that was removed
	* @throws PortalException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	*/
	public static contact.manager.service.model.County_Commissioner_or_Board_Dist deleteCounty_Commissioner_or_Board_Dist(
		long ccbdId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCounty_Commissioner_or_Board_Dist(ccbdId);
	}

	public static contact.manager.service.model.County_Commissioner_or_Board_Dist fetchCounty_Commissioner_or_Board_Dist(
		long ccbdId) {
		return getService().fetchCounty_Commissioner_or_Board_Dist(ccbdId);
	}

	/**
	* Returns the county_ commissioner_or_ board_ dist with the primary key.
	*
	* @param ccbdId the primary key of the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist
	* @throws PortalException if a county_ commissioner_or_ board_ dist with the primary key could not be found
	*/
	public static contact.manager.service.model.County_Commissioner_or_Board_Dist getCounty_Commissioner_or_Board_Dist(
		long ccbdId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCounty_Commissioner_or_Board_Dist(ccbdId);
	}

	/**
	* Updates the county_ commissioner_or_ board_ dist in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param county_Commissioner_or_Board_Dist the county_ commissioner_or_ board_ dist
	* @return the county_ commissioner_or_ board_ dist that was updated
	*/
	public static contact.manager.service.model.County_Commissioner_or_Board_Dist updateCounty_Commissioner_or_Board_Dist(
		contact.manager.service.model.County_Commissioner_or_Board_Dist county_Commissioner_or_Board_Dist) {
		return getService()
				   .updateCounty_Commissioner_or_Board_Dist(county_Commissioner_or_Board_Dist);
	}

	/**
	* Returns the number of county_ commissioner_or_ board_ dists.
	*
	* @return the number of county_ commissioner_or_ board_ dists
	*/
	public static int getCounty_Commissioner_or_Board_DistsCount() {
		return getService().getCounty_Commissioner_or_Board_DistsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the county_ commissioner_or_ board_ dists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.County_Commissioner_or_Board_DistModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of county_ commissioner_or_ board_ dists
	* @param end the upper bound of the range of county_ commissioner_or_ board_ dists (not inclusive)
	* @return the range of county_ commissioner_or_ board_ dists
	*/
	public static java.util.List<contact.manager.service.model.County_Commissioner_or_Board_Dist> getCounty_Commissioner_or_Board_Dists(
		int start, int end) {
		return getService().getCounty_Commissioner_or_Board_Dists(start, end);
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

	public static County_Commissioner_or_Board_DistLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<County_Commissioner_or_Board_DistLocalService, County_Commissioner_or_Board_DistLocalService> _serviceTracker =
		ServiceTrackerFactory.open(County_Commissioner_or_Board_DistLocalService.class);
}