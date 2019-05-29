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
 * Provides the local service utility for CExtOrganization. This utility wraps
 * {@link ucc.portal.service.impl.CExtOrganizationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CExtOrganizationLocalService
 * @see ucc.portal.service.base.CExtOrganizationLocalServiceBaseImpl
 * @see ucc.portal.service.impl.CExtOrganizationLocalServiceImpl
 * @generated
 */
@ProviderType
public class CExtOrganizationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ucc.portal.service.impl.CExtOrganizationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the c ext organization to the database. Also notifies the appropriate model listeners.
	*
	* @param cExtOrganization the c ext organization
	* @return the c ext organization that was added
	*/
	public static ucc.portal.model.CExtOrganization addCExtOrganization(
		ucc.portal.model.CExtOrganization cExtOrganization) {
		return getService().addCExtOrganization(cExtOrganization);
	}

	/**
	* Creates a new c ext organization with the primary key. Does not add the c ext organization to the database.
	*
	* @param organizationId the primary key for the new c ext organization
	* @return the new c ext organization
	*/
	public static ucc.portal.model.CExtOrganization createCExtOrganization(
		long organizationId) {
		return getService().createCExtOrganization(organizationId);
	}

	/**
	* Deletes the c ext organization from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtOrganization the c ext organization
	* @return the c ext organization that was removed
	*/
	public static ucc.portal.model.CExtOrganization deleteCExtOrganization(
		ucc.portal.model.CExtOrganization cExtOrganization) {
		return getService().deleteCExtOrganization(cExtOrganization);
	}

	/**
	* Deletes the c ext organization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param organizationId the primary key of the c ext organization
	* @return the c ext organization that was removed
	* @throws PortalException if a c ext organization with the primary key could not be found
	*/
	public static ucc.portal.model.CExtOrganization deleteCExtOrganization(
		long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCExtOrganization(organizationId);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static ucc.portal.model.CExtOrganization fetchCExtOrganization(
		long organizationId) {
		return getService().fetchCExtOrganization(organizationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the c ext organization with the primary key.
	*
	* @param organizationId the primary key of the c ext organization
	* @return the c ext organization
	* @throws PortalException if a c ext organization with the primary key could not be found
	*/
	public static ucc.portal.model.CExtOrganization getCExtOrganization(
		long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCExtOrganization(organizationId);
	}

	/**
	* Returns a range of all the c ext organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext organizations
	* @param end the upper bound of the range of c ext organizations (not inclusive)
	* @return the range of c ext organizations
	*/
	public static java.util.List<ucc.portal.model.CExtOrganization> getCExtOrganizations(
		int start, int end) {
		return getService().getCExtOrganizations(start, end);
	}

	/**
	* Returns the number of c ext organizations.
	*
	* @return the number of c ext organizations
	*/
	public static int getCExtOrganizationsCount() {
		return getService().getCExtOrganizationsCount();
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
	* Updates the c ext organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cExtOrganization the c ext organization
	* @return the c ext organization that was updated
	*/
	public static ucc.portal.model.CExtOrganization updateCExtOrganization(
		ucc.portal.model.CExtOrganization cExtOrganization) {
		return getService().updateCExtOrganization(cExtOrganization);
	}

	public static CExtOrganizationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CExtOrganizationLocalService, CExtOrganizationLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CExtOrganizationLocalService.class);

		ServiceTracker<CExtOrganizationLocalService, CExtOrganizationLocalService> serviceTracker =
			new ServiceTracker<CExtOrganizationLocalService, CExtOrganizationLocalService>(bundle.getBundleContext(),
				CExtOrganizationLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}