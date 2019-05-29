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
 * Provides the local service utility for CExtStaffingChurch. This utility wraps
 * {@link ucc.portal.service.impl.CExtStaffingChurchLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CExtStaffingChurchLocalService
 * @see ucc.portal.service.base.CExtStaffingChurchLocalServiceBaseImpl
 * @see ucc.portal.service.impl.CExtStaffingChurchLocalServiceImpl
 * @generated
 */
@ProviderType
public class CExtStaffingChurchLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ucc.portal.service.impl.CExtStaffingChurchLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the c ext staffing church to the database. Also notifies the appropriate model listeners.
	*
	* @param cExtStaffingChurch the c ext staffing church
	* @return the c ext staffing church that was added
	*/
	public static ucc.portal.model.CExtStaffingChurch addCExtStaffingChurch(
		ucc.portal.model.CExtStaffingChurch cExtStaffingChurch) {
		return getService().addCExtStaffingChurch(cExtStaffingChurch);
	}

	/**
	* Creates a new c ext staffing church with the primary key. Does not add the c ext staffing church to the database.
	*
	* @param cExtStaffingChurchPK the primary key for the new c ext staffing church
	* @return the new c ext staffing church
	*/
	public static ucc.portal.model.CExtStaffingChurch createCExtStaffingChurch(
		ucc.portal.service.persistence.CExtStaffingChurchPK cExtStaffingChurchPK) {
		return getService().createCExtStaffingChurch(cExtStaffingChurchPK);
	}

	/**
	* Deletes the c ext staffing church from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtStaffingChurch the c ext staffing church
	* @return the c ext staffing church that was removed
	*/
	public static ucc.portal.model.CExtStaffingChurch deleteCExtStaffingChurch(
		ucc.portal.model.CExtStaffingChurch cExtStaffingChurch) {
		return getService().deleteCExtStaffingChurch(cExtStaffingChurch);
	}

	/**
	* Deletes the c ext staffing church with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtStaffingChurchPK the primary key of the c ext staffing church
	* @return the c ext staffing church that was removed
	* @throws PortalException if a c ext staffing church with the primary key could not be found
	*/
	public static ucc.portal.model.CExtStaffingChurch deleteCExtStaffingChurch(
		ucc.portal.service.persistence.CExtStaffingChurchPK cExtStaffingChurchPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCExtStaffingChurch(cExtStaffingChurchPK);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static ucc.portal.model.CExtStaffingChurch fetchCExtStaffingChurch(
		ucc.portal.service.persistence.CExtStaffingChurchPK cExtStaffingChurchPK) {
		return getService().fetchCExtStaffingChurch(cExtStaffingChurchPK);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the c ext staffing church with the primary key.
	*
	* @param cExtStaffingChurchPK the primary key of the c ext staffing church
	* @return the c ext staffing church
	* @throws PortalException if a c ext staffing church with the primary key could not be found
	*/
	public static ucc.portal.model.CExtStaffingChurch getCExtStaffingChurch(
		ucc.portal.service.persistence.CExtStaffingChurchPK cExtStaffingChurchPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCExtStaffingChurch(cExtStaffingChurchPK);
	}

	/**
	* Returns a range of all the c ext staffing churchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtStaffingChurchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext staffing churchs
	* @param end the upper bound of the range of c ext staffing churchs (not inclusive)
	* @return the range of c ext staffing churchs
	*/
	public static java.util.List<ucc.portal.model.CExtStaffingChurch> getCExtStaffingChurchs(
		int start, int end) {
		return getService().getCExtStaffingChurchs(start, end);
	}

	/**
	* Returns the number of c ext staffing churchs.
	*
	* @return the number of c ext staffing churchs
	*/
	public static int getCExtStaffingChurchsCount() {
		return getService().getCExtStaffingChurchsCount();
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
	* Updates the c ext staffing church in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cExtStaffingChurch the c ext staffing church
	* @return the c ext staffing church that was updated
	*/
	public static ucc.portal.model.CExtStaffingChurch updateCExtStaffingChurch(
		ucc.portal.model.CExtStaffingChurch cExtStaffingChurch) {
		return getService().updateCExtStaffingChurch(cExtStaffingChurch);
	}

	public static CExtStaffingChurchLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CExtStaffingChurchLocalService, CExtStaffingChurchLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CExtStaffingChurchLocalService.class);

		ServiceTracker<CExtStaffingChurchLocalService, CExtStaffingChurchLocalService> serviceTracker =
			new ServiceTracker<CExtStaffingChurchLocalService, CExtStaffingChurchLocalService>(bundle.getBundleContext(),
				CExtStaffingChurchLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}