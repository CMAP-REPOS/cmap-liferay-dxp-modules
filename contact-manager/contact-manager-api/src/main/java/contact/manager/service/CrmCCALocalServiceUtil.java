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
 * Provides the local service utility for CrmCCA. This utility wraps
 * {@link contact.manager.service.impl.CrmCCALocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmCCALocalService
 * @see contact.manager.service.base.CrmCCALocalServiceBaseImpl
 * @see contact.manager.service.impl.CrmCCALocalServiceImpl
 * @generated
 */
@ProviderType
public class CrmCCALocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.impl.CrmCCALocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the CRM CCA to the database. Also notifies the appropriate model listeners.
	*
	* @param crmCCA the CRM CCA
	* @return the CRM CCA that was added
	*/
	public static contact.manager.model.CrmCCA addCrmCCA(
		contact.manager.model.CrmCCA crmCCA) {
		return getService().addCrmCCA(crmCCA);
	}

	/**
	* Creates a new CRM CCA with the primary key. Does not add the CRM CCA to the database.
	*
	* @param crmCCAId the primary key for the new CRM CCA
	* @return the new CRM CCA
	*/
	public static contact.manager.model.CrmCCA createCrmCCA(long crmCCAId) {
		return getService().createCrmCCA(crmCCAId);
	}

	/**
	* Deletes the CRM CCA from the database. Also notifies the appropriate model listeners.
	*
	* @param crmCCA the CRM CCA
	* @return the CRM CCA that was removed
	*/
	public static contact.manager.model.CrmCCA deleteCrmCCA(
		contact.manager.model.CrmCCA crmCCA) {
		return getService().deleteCrmCCA(crmCCA);
	}

	/**
	* Deletes the CRM CCA with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmCCAId the primary key of the CRM CCA
	* @return the CRM CCA that was removed
	* @throws PortalException if a CRM CCA with the primary key could not be found
	*/
	public static contact.manager.model.CrmCCA deleteCrmCCA(long crmCCAId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCrmCCA(crmCCAId);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static contact.manager.model.CrmCCA fetchCrmCCA(long crmCCAId) {
		return getService().fetchCrmCCA(crmCCAId);
	}

	/**
	* Returns the CRM CCA matching the UUID and group.
	*
	* @param uuid the CRM CCA's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM CCA, or <code>null</code> if a matching CRM CCA could not be found
	*/
	public static contact.manager.model.CrmCCA fetchCrmCCAByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchCrmCCAByUuidAndGroupId(uuid, groupId);
	}

	public static java.util.List<contact.manager.model.CrmCCA> findByZipCode(
		String zipCode) {
		return getService().findByZipCode(zipCode);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the CRM CCA with the primary key.
	*
	* @param crmCCAId the primary key of the CRM CCA
	* @return the CRM CCA
	* @throws PortalException if a CRM CCA with the primary key could not be found
	*/
	public static contact.manager.model.CrmCCA getCrmCCA(long crmCCAId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmCCA(crmCCAId);
	}

	/**
	* Returns the CRM CCA matching the UUID and group.
	*
	* @param uuid the CRM CCA's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM CCA
	* @throws PortalException if a matching CRM CCA could not be found
	*/
	public static contact.manager.model.CrmCCA getCrmCCAByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmCCAByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the CRM CCAs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmCCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM CCAs
	* @param end the upper bound of the range of CRM CCAs (not inclusive)
	* @return the range of CRM CCAs
	*/
	public static java.util.List<contact.manager.model.CrmCCA> getCrmCCAs(
		int start, int end) {
		return getService().getCrmCCAs(start, end);
	}

	/**
	* Returns all the CRM CCAs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM CCAs
	* @param companyId the primary key of the company
	* @return the matching CRM CCAs, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmCCA> getCrmCCAsByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getCrmCCAsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of CRM CCAs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM CCAs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM CCAs
	* @param end the upper bound of the range of CRM CCAs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM CCAs, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmCCA> getCrmCCAsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmCCA> orderByComparator) {
		return getService()
				   .getCrmCCAsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of CRM CCAs.
	*
	* @return the number of CRM CCAs
	*/
	public static int getCrmCCAsCount() {
		return getService().getCrmCCAsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	* Updates the CRM CCA in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmCCA the CRM CCA
	* @return the CRM CCA that was updated
	*/
	public static contact.manager.model.CrmCCA updateCrmCCA(
		contact.manager.model.CrmCCA crmCCA) {
		return getService().updateCrmCCA(crmCCA);
	}

	public static CrmCCALocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmCCALocalService, CrmCCALocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CrmCCALocalService.class);

		ServiceTracker<CrmCCALocalService, CrmCCALocalService> serviceTracker = new ServiceTracker<CrmCCALocalService, CrmCCALocalService>(bundle.getBundleContext(),
				CrmCCALocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}