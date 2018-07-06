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
 * Provides the local service utility for CrmStateSenate. This utility wraps
 * {@link contact.manager.service.impl.CrmStateSenateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateSenateLocalService
 * @see contact.manager.service.base.CrmStateSenateLocalServiceBaseImpl
 * @see contact.manager.service.impl.CrmStateSenateLocalServiceImpl
 * @generated
 */
@ProviderType
public class CrmStateSenateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.impl.CrmStateSenateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the CRM State Senate to the database. Also notifies the appropriate model listeners.
	*
	* @param crmStateSenate the CRM State Senate
	* @return the CRM State Senate that was added
	*/
	public static contact.manager.model.CrmStateSenate addCrmStateSenate(
		contact.manager.model.CrmStateSenate crmStateSenate) {
		return getService().addCrmStateSenate(crmStateSenate);
	}

	/**
	* Creates a new CRM State Senate with the primary key. Does not add the CRM State Senate to the database.
	*
	* @param crmStateSenateId the primary key for the new CRM State Senate
	* @return the new CRM State Senate
	*/
	public static contact.manager.model.CrmStateSenate createCrmStateSenate(
		long crmStateSenateId) {
		return getService().createCrmStateSenate(crmStateSenateId);
	}

	/**
	* Deletes the CRM State Senate from the database. Also notifies the appropriate model listeners.
	*
	* @param crmStateSenate the CRM State Senate
	* @return the CRM State Senate that was removed
	*/
	public static contact.manager.model.CrmStateSenate deleteCrmStateSenate(
		contact.manager.model.CrmStateSenate crmStateSenate) {
		return getService().deleteCrmStateSenate(crmStateSenate);
	}

	/**
	* Deletes the CRM State Senate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmStateSenateId the primary key of the CRM State Senate
	* @return the CRM State Senate that was removed
	* @throws PortalException if a CRM State Senate with the primary key could not be found
	*/
	public static contact.manager.model.CrmStateSenate deleteCrmStateSenate(
		long crmStateSenateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCrmStateSenate(crmStateSenateId);
	}

	public static contact.manager.model.CrmStateSenate fetchCrmStateSenate(
		long crmStateSenateId) {
		return getService().fetchCrmStateSenate(crmStateSenateId);
	}

	/**
	* Returns the CRM State Senate matching the UUID and group.
	*
	* @param uuid the CRM State Senate's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM State Senate, or <code>null</code> if a matching CRM State Senate could not be found
	*/
	public static contact.manager.model.CrmStateSenate fetchCrmStateSenateByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchCrmStateSenateByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the CRM State Senate with the primary key.
	*
	* @param crmStateSenateId the primary key of the CRM State Senate
	* @return the CRM State Senate
	* @throws PortalException if a CRM State Senate with the primary key could not be found
	*/
	public static contact.manager.model.CrmStateSenate getCrmStateSenate(
		long crmStateSenateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmStateSenate(crmStateSenateId);
	}

	/**
	* Returns the CRM State Senate matching the UUID and group.
	*
	* @param uuid the CRM State Senate's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM State Senate
	* @throws PortalException if a matching CRM State Senate could not be found
	*/
	public static contact.manager.model.CrmStateSenate getCrmStateSenateByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmStateSenateByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the CRM State Senate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmStateSenate the CRM State Senate
	* @return the CRM State Senate that was updated
	*/
	public static contact.manager.model.CrmStateSenate updateCrmStateSenate(
		contact.manager.model.CrmStateSenate crmStateSenate) {
		return getService().updateCrmStateSenate(crmStateSenate);
	}

	/**
	* Returns the number of CRM State Senates.
	*
	* @return the number of CRM State Senates
	*/
	public static int getCrmStateSenatesCount() {
		return getService().getCrmStateSenatesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the CRM State Senates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmStateSenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @return the range of CRM State Senates
	*/
	public static java.util.List<contact.manager.model.CrmStateSenate> getCrmStateSenates(
		int start, int end) {
		return getService().getCrmStateSenates(start, end);
	}

	/**
	* Returns all the CRM State Senates matching the UUID and company.
	*
	* @param uuid the UUID of the CRM State Senates
	* @param companyId the primary key of the company
	* @return the matching CRM State Senates, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmStateSenate> getCrmStateSenatesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getCrmStateSenatesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of CRM State Senates matching the UUID and company.
	*
	* @param uuid the UUID of the CRM State Senates
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM State Senates
	* @param end the upper bound of the range of CRM State Senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM State Senates, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmStateSenate> getCrmStateSenatesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmStateSenate> orderByComparator) {
		return getService()
				   .getCrmStateSenatesByUuidAndCompanyId(uuid, companyId,
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

	public static CrmStateSenateLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmStateSenateLocalService, CrmStateSenateLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CrmStateSenateLocalService.class);
}