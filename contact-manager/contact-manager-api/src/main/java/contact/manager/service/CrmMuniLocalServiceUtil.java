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
 * Provides the local service utility for CrmMuni. This utility wraps
 * {@link contact.manager.service.impl.CrmMuniLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmMuniLocalService
 * @see contact.manager.service.base.CrmMuniLocalServiceBaseImpl
 * @see contact.manager.service.impl.CrmMuniLocalServiceImpl
 * @generated
 */
@ProviderType
public class CrmMuniLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.impl.CrmMuniLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the CRM Muni to the database. Also notifies the appropriate model listeners.
	*
	* @param crmMuni the CRM Muni
	* @return the CRM Muni that was added
	*/
	public static contact.manager.model.CrmMuni addCrmMuni(
		contact.manager.model.CrmMuni crmMuni) {
		return getService().addCrmMuni(crmMuni);
	}

	/**
	* Creates a new CRM Muni with the primary key. Does not add the CRM Muni to the database.
	*
	* @param crmMuniId the primary key for the new CRM Muni
	* @return the new CRM Muni
	*/
	public static contact.manager.model.CrmMuni createCrmMuni(long crmMuniId) {
		return getService().createCrmMuni(crmMuniId);
	}

	/**
	* Deletes the CRM Muni from the database. Also notifies the appropriate model listeners.
	*
	* @param crmMuni the CRM Muni
	* @return the CRM Muni that was removed
	*/
	public static contact.manager.model.CrmMuni deleteCrmMuni(
		contact.manager.model.CrmMuni crmMuni) {
		return getService().deleteCrmMuni(crmMuni);
	}

	/**
	* Deletes the CRM Muni with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmMuniId the primary key of the CRM Muni
	* @return the CRM Muni that was removed
	* @throws PortalException if a CRM Muni with the primary key could not be found
	*/
	public static contact.manager.model.CrmMuni deleteCrmMuni(long crmMuniId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCrmMuni(crmMuniId);
	}

	public static contact.manager.model.CrmMuni fetchCrmMuni(long crmMuniId) {
		return getService().fetchCrmMuni(crmMuniId);
	}

	/**
	* Returns the CRM Muni matching the UUID and group.
	*
	* @param uuid the CRM Muni's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Muni, or <code>null</code> if a matching CRM Muni could not be found
	*/
	public static contact.manager.model.CrmMuni fetchCrmMuniByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchCrmMuniByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the CRM Muni with the primary key.
	*
	* @param crmMuniId the primary key of the CRM Muni
	* @return the CRM Muni
	* @throws PortalException if a CRM Muni with the primary key could not be found
	*/
	public static contact.manager.model.CrmMuni getCrmMuni(long crmMuniId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmMuni(crmMuniId);
	}

	/**
	* Returns the CRM Muni matching the UUID and group.
	*
	* @param uuid the CRM Muni's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Muni
	* @throws PortalException if a matching CRM Muni could not be found
	*/
	public static contact.manager.model.CrmMuni getCrmMuniByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmMuniByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the CRM Muni in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmMuni the CRM Muni
	* @return the CRM Muni that was updated
	*/
	public static contact.manager.model.CrmMuni updateCrmMuni(
		contact.manager.model.CrmMuni crmMuni) {
		return getService().updateCrmMuni(crmMuni);
	}

	/**
	* Returns the number of CRM Munis.
	*
	* @return the number of CRM Munis
	*/
	public static int getCrmMunisCount() {
		return getService().getCrmMunisCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<contact.manager.model.CrmMuni> findByZipCode(
		java.lang.String zipCode) {
		return getService().findByZipCode(zipCode);
	}

	/**
	* Returns a range of all the CRM Munis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmMuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @return the range of CRM Munis
	*/
	public static java.util.List<contact.manager.model.CrmMuni> getCrmMunis(
		int start, int end) {
		return getService().getCrmMunis(start, end);
	}

	/**
	* Returns all the CRM Munis matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Munis
	* @param companyId the primary key of the company
	* @return the matching CRM Munis, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmMuni> getCrmMunisByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getCrmMunisByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of CRM Munis matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Munis
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Munis
	* @param end the upper bound of the range of CRM Munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Munis, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmMuni> getCrmMunisByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmMuni> orderByComparator) {
		return getService()
				   .getCrmMunisByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
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

	public static CrmMuniLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmMuniLocalService, CrmMuniLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CrmMuniLocalService.class);
}