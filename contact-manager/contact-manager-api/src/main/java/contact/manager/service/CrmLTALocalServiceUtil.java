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
 * Provides the local service utility for CrmLTA. This utility wraps
 * <code>contact.manager.service.impl.CrmLTALocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmLTALocalService
 * @generated
 */
@ProviderType
public class CrmLTALocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>contact.manager.service.impl.CrmLTALocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the CRM LTA to the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmLTA the CRM LTA
	 * @return the CRM LTA that was added
	 */
	public static contact.manager.model.CrmLTA addCrmLTA(
		contact.manager.model.CrmLTA crmLTA) {

		return getService().addCrmLTA(crmLTA);
	}

	/**
	 * Creates a new CRM LTA with the primary key. Does not add the CRM LTA to the database.
	 *
	 * @param crmLTAId the primary key for the new CRM LTA
	 * @return the new CRM LTA
	 */
	public static contact.manager.model.CrmLTA createCrmLTA(long crmLTAId) {
		return getService().createCrmLTA(crmLTAId);
	}

	/**
	 * Deletes the CRM LTA from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmLTA the CRM LTA
	 * @return the CRM LTA that was removed
	 */
	public static contact.manager.model.CrmLTA deleteCrmLTA(
		contact.manager.model.CrmLTA crmLTA) {

		return getService().deleteCrmLTA(crmLTA);
	}

	/**
	 * Deletes the CRM LTA with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmLTAId the primary key of the CRM LTA
	 * @return the CRM LTA that was removed
	 * @throws PortalException if a CRM LTA with the primary key could not be found
	 */
	public static contact.manager.model.CrmLTA deleteCrmLTA(long crmLTAId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCrmLTA(crmLTAId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static contact.manager.model.CrmLTA fetchCrmLTA(long crmLTAId) {
		return getService().fetchCrmLTA(crmLTAId);
	}

	/**
	 * Returns the CRM LTA matching the UUID and group.
	 *
	 * @param uuid the CRM LTA's UUID
	 * @param groupId the primary key of the group
	 * @return the matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	 */
	public static contact.manager.model.CrmLTA fetchCrmLTAByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchCrmLTAByUuidAndGroupId(uuid, groupId);
	}

	public static java.util.List<contact.manager.model.CrmLTA> findByZipCode(
		String zipCode) {

		return getService().findByZipCode(zipCode);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the CRM LTA with the primary key.
	 *
	 * @param crmLTAId the primary key of the CRM LTA
	 * @return the CRM LTA
	 * @throws PortalException if a CRM LTA with the primary key could not be found
	 */
	public static contact.manager.model.CrmLTA getCrmLTA(long crmLTAId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCrmLTA(crmLTAId);
	}

	/**
	 * Returns the CRM LTA matching the UUID and group.
	 *
	 * @param uuid the CRM LTA's UUID
	 * @param groupId the primary key of the group
	 * @return the matching CRM LTA
	 * @throws PortalException if a matching CRM LTA could not be found
	 */
	public static contact.manager.model.CrmLTA getCrmLTAByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCrmLTAByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the CRM LTAs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmLTAModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @return the range of CRM LTAs
	 */
	public static java.util.List<contact.manager.model.CrmLTA> getCrmLTAs(
		int start, int end) {

		return getService().getCrmLTAs(start, end);
	}

	/**
	 * Returns all the CRM LTAs matching the UUID and company.
	 *
	 * @param uuid the UUID of the CRM LTAs
	 * @param companyId the primary key of the company
	 * @return the matching CRM LTAs, or an empty list if no matches were found
	 */
	public static java.util.List<contact.manager.model.CrmLTA>
		getCrmLTAsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getCrmLTAsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of CRM LTAs matching the UUID and company.
	 *
	 * @param uuid the UUID of the CRM LTAs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of CRM LTAs
	 * @param end the upper bound of the range of CRM LTAs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching CRM LTAs, or an empty list if no matches were found
	 */
	public static java.util.List<contact.manager.model.CrmLTA>
		getCrmLTAsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<contact.manager.model.CrmLTA> orderByComparator) {

		return getService().getCrmLTAsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of CRM LTAs.
	 *
	 * @return the number of CRM LTAs
	 */
	public static int getCrmLTAsCount() {
		return getService().getCrmLTAsCount();
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
	 * Updates the CRM LTA in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param crmLTA the CRM LTA
	 * @return the CRM LTA that was updated
	 */
	public static contact.manager.model.CrmLTA updateCrmLTA(
		contact.manager.model.CrmLTA crmLTA) {

		return getService().updateCrmLTA(crmLTA);
	}

	public static CrmLTALocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmLTALocalService, CrmLTALocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CrmLTALocalService.class);

		ServiceTracker<CrmLTALocalService, CrmLTALocalService> serviceTracker =
			new ServiceTracker<CrmLTALocalService, CrmLTALocalService>(
				bundle.getBundleContext(), CrmLTALocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}