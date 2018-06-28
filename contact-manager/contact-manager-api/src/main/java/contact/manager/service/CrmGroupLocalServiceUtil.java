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
 * Provides the local service utility for CrmGroup. This utility wraps
 * {@link contact.manager.service.impl.CrmGroupLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmGroupLocalService
 * @see contact.manager.service.base.CrmGroupLocalServiceBaseImpl
 * @see contact.manager.service.impl.CrmGroupLocalServiceImpl
 * @generated
 */
@ProviderType
public class CrmGroupLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.impl.CrmGroupLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean hasCrmContactCrmGroup(long crmContactId,
		long crmGroupId) {
		return getService().hasCrmContactCrmGroup(crmContactId, crmGroupId);
	}

	public static boolean hasCrmContactCrmGroups(long crmContactId) {
		return getService().hasCrmContactCrmGroups(crmContactId);
	}

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
	* Adds the CRM Group to the database. Also notifies the appropriate model listeners.
	*
	* @param crmGroup the CRM Group
	* @return the CRM Group that was added
	*/
	public static contact.manager.model.CrmGroup addCrmGroup(
		contact.manager.model.CrmGroup crmGroup) {
		return getService().addCrmGroup(crmGroup);
	}

	/**
	* Creates a new CRM Group with the primary key. Does not add the CRM Group to the database.
	*
	* @param crmGroupId the primary key for the new CRM Group
	* @return the new CRM Group
	*/
	public static contact.manager.model.CrmGroup createCrmGroup(long crmGroupId) {
		return getService().createCrmGroup(crmGroupId);
	}

	/**
	* Deletes the CRM Group from the database. Also notifies the appropriate model listeners.
	*
	* @param crmGroup the CRM Group
	* @return the CRM Group that was removed
	*/
	public static contact.manager.model.CrmGroup deleteCrmGroup(
		contact.manager.model.CrmGroup crmGroup) {
		return getService().deleteCrmGroup(crmGroup);
	}

	/**
	* Deletes the CRM Group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmGroupId the primary key of the CRM Group
	* @return the CRM Group that was removed
	* @throws PortalException if a CRM Group with the primary key could not be found
	*/
	public static contact.manager.model.CrmGroup deleteCrmGroup(long crmGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCrmGroup(crmGroupId);
	}

	public static contact.manager.model.CrmGroup fetchCrmGroup(long crmGroupId) {
		return getService().fetchCrmGroup(crmGroupId);
	}

	/**
	* Returns the CRM Group matching the UUID and group.
	*
	* @param uuid the CRM Group's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	*/
	public static contact.manager.model.CrmGroup fetchCrmGroupByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchCrmGroupByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the CRM Group with the primary key.
	*
	* @param crmGroupId the primary key of the CRM Group
	* @return the CRM Group
	* @throws PortalException if a CRM Group with the primary key could not be found
	*/
	public static contact.manager.model.CrmGroup getCrmGroup(long crmGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmGroup(crmGroupId);
	}

	/**
	* Returns the CRM Group matching the UUID and group.
	*
	* @param uuid the CRM Group's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Group
	* @throws PortalException if a matching CRM Group could not be found
	*/
	public static contact.manager.model.CrmGroup getCrmGroupByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmGroupByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the CRM Group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmGroup the CRM Group
	* @return the CRM Group that was updated
	*/
	public static contact.manager.model.CrmGroup updateCrmGroup(
		contact.manager.model.CrmGroup crmGroup) {
		return getService().updateCrmGroup(crmGroup);
	}

	public static int countAll() {
		return getService().countAll();
	}

	public static int getCrmContactCrmGroupsCount(long crmContactId) {
		return getService().getCrmContactCrmGroupsCount(crmContactId);
	}

	public static int getCrmContactsCount(long crmGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCrmContactsCount(crmGroupId);
	}

	/**
	* Returns the number of CRM Groups.
	*
	* @return the number of CRM Groups
	*/
	public static int getCrmGroupsCount() {
		return getService().getCrmGroupsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<contact.manager.model.CrmGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	public static java.util.List<contact.manager.model.CrmGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end);
	}

	public static java.util.List<contact.manager.model.CrmGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end, orderByComparator);
	}

	public static java.util.List<contact.manager.model.CrmGroup> getCrmContactCrmGroups(
		long crmContactId) {
		return getService().getCrmContactCrmGroups(crmContactId);
	}

	public static java.util.List<contact.manager.model.CrmGroup> getCrmContactCrmGroups(
		long crmContactId, int start, int end) {
		return getService().getCrmContactCrmGroups(crmContactId, start, end);
	}

	public static java.util.List<contact.manager.model.CrmGroup> getCrmContactCrmGroups(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator) {
		return getService()
				   .getCrmContactCrmGroups(crmContactId, start, end,
			orderByComparator);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long crmGroupId) {
		return getService().getCrmContacts(crmGroupId);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long crmGroupId, int start, int end) {
		return getService().getCrmContacts(crmGroupId, start, end);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long crmGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		return getService()
				   .getCrmContacts(crmGroupId, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the CRM Groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @return the range of CRM Groups
	*/
	public static java.util.List<contact.manager.model.CrmGroup> getCrmGroups(
		int start, int end) {
		return getService().getCrmGroups(start, end);
	}

	public static java.util.List<contact.manager.model.CrmGroup> getCrmGroupsByName(
		java.lang.String crmGroupName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCrmGroupsByName(crmGroupName);
	}

	/**
	* Returns all the CRM Groups matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Groups
	* @param companyId the primary key of the company
	* @return the matching CRM Groups, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmGroup> getCrmGroupsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getCrmGroupsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of CRM Groups matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Groups
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Groups, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmGroup> getCrmGroupsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator) {
		return getService()
				   .getCrmGroupsByUuidAndCompanyId(uuid, companyId, start, end,
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

	/**
	* Returns the crmContactIds of the CRM Contacts associated with the CRM Group.
	*
	* @param crmGroupId the crmGroupId of the CRM Group
	* @return long[] the crmContactIds of CRM Contacts associated with the CRM Group
	*/
	public static long[] getCrmContactPrimaryKeys(long crmGroupId) {
		return getService().getCrmContactPrimaryKeys(crmGroupId);
	}

	public static void addCrmContactCrmGroup(long crmContactId,
		contact.manager.model.CrmGroup crmGroup) {
		getService().addCrmContactCrmGroup(crmContactId, crmGroup);
	}

	public static void addCrmContactCrmGroup(long crmContactId, long crmGroupId) {
		getService().addCrmContactCrmGroup(crmContactId, crmGroupId);
	}

	public static void addCrmContactCrmGroups(long crmContactId,
		java.util.List<contact.manager.model.CrmGroup> crmGroups) {
		getService().addCrmContactCrmGroups(crmContactId, crmGroups);
	}

	public static void addCrmContactCrmGroups(long crmContactId,
		long[] crmGroupIds) {
		getService().addCrmContactCrmGroups(crmContactId, crmGroupIds);
	}

	public static void clearCrmContactCrmGroups(long crmContactId) {
		getService().clearCrmContactCrmGroups(crmContactId);
	}

	public static void deleteCrmContactCrmGroup(long crmContactId,
		contact.manager.model.CrmGroup crmGroup) {
		getService().deleteCrmContactCrmGroup(crmContactId, crmGroup);
	}

	public static void deleteCrmContactCrmGroup(long crmContactId,
		long crmGroupId) {
		getService().deleteCrmContactCrmGroup(crmContactId, crmGroupId);
	}

	public static void deleteCrmContactCrmGroups(long crmContactId,
		java.util.List<contact.manager.model.CrmGroup> crmGroups) {
		getService().deleteCrmContactCrmGroups(crmContactId, crmGroups);
	}

	public static void deleteCrmContactCrmGroups(long crmContactId,
		long[] crmGroupIds) {
		getService().deleteCrmContactCrmGroups(crmContactId, crmGroupIds);
	}

	public static void setCrmContactCrmGroups(long crmContactId,
		long[] crmGroupIds) {
		getService().setCrmContactCrmGroups(crmContactId, crmGroupIds);
	}

	public static void setCrmContacts(long crmGroupPk, long[] crmContactPks)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setCrmContacts(crmGroupPk, crmContactPks);
	}

	public static CrmGroupLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmGroupLocalService, CrmGroupLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CrmGroupLocalService.class);
}