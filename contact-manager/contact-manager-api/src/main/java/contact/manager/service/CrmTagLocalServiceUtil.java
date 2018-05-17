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
 * Provides the local service utility for CrmTag. This utility wraps
 * {@link contact.manager.service.impl.CrmTagLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmTagLocalService
 * @see contact.manager.service.base.CrmTagLocalServiceBaseImpl
 * @see contact.manager.service.impl.CrmTagLocalServiceImpl
 * @generated
 */
@ProviderType
public class CrmTagLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.impl.CrmTagLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean hasCrmContactCrmTag(long crmContactId, long crmTagId) {
		return getService().hasCrmContactCrmTag(crmContactId, crmTagId);
	}

	public static boolean hasCrmContactCrmTags(long crmContactId) {
		return getService().hasCrmContactCrmTags(crmContactId);
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
	* Adds the CRM Tag to the database. Also notifies the appropriate model listeners.
	*
	* @param crmTag the CRM Tag
	* @return the CRM Tag that was added
	*/
	public static contact.manager.model.CrmTag addCrmTag(
		contact.manager.model.CrmTag crmTag) {
		return getService().addCrmTag(crmTag);
	}

	/**
	* Creates a new CRM Tag with the primary key. Does not add the CRM Tag to the database.
	*
	* @param crmTagId the primary key for the new CRM Tag
	* @return the new CRM Tag
	*/
	public static contact.manager.model.CrmTag createCrmTag(long crmTagId) {
		return getService().createCrmTag(crmTagId);
	}

	/**
	* Deletes the CRM Tag from the database. Also notifies the appropriate model listeners.
	*
	* @param crmTag the CRM Tag
	* @return the CRM Tag that was removed
	*/
	public static contact.manager.model.CrmTag deleteCrmTag(
		contact.manager.model.CrmTag crmTag) {
		return getService().deleteCrmTag(crmTag);
	}

	/**
	* Deletes the CRM Tag with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmTagId the primary key of the CRM Tag
	* @return the CRM Tag that was removed
	* @throws PortalException if a CRM Tag with the primary key could not be found
	*/
	public static contact.manager.model.CrmTag deleteCrmTag(long crmTagId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCrmTag(crmTagId);
	}

	public static contact.manager.model.CrmTag fetchCrmTag(long crmTagId) {
		return getService().fetchCrmTag(crmTagId);
	}

	/**
	* Returns the CRM Tag matching the UUID and group.
	*
	* @param uuid the CRM Tag's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public static contact.manager.model.CrmTag fetchCrmTagByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchCrmTagByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the CRM Tag with the primary key.
	*
	* @param crmTagId the primary key of the CRM Tag
	* @return the CRM Tag
	* @throws PortalException if a CRM Tag with the primary key could not be found
	*/
	public static contact.manager.model.CrmTag getCrmTag(long crmTagId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmTag(crmTagId);
	}

	/**
	* Returns the CRM Tag matching the UUID and group.
	*
	* @param uuid the CRM Tag's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Tag
	* @throws PortalException if a matching CRM Tag could not be found
	*/
	public static contact.manager.model.CrmTag getCrmTagByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmTagByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the CRM Tag in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmTag the CRM Tag
	* @return the CRM Tag that was updated
	*/
	public static contact.manager.model.CrmTag updateCrmTag(
		contact.manager.model.CrmTag crmTag) {
		return getService().updateCrmTag(crmTag);
	}

	public static int getCrmContactCrmTagsCount(long crmContactId) {
		return getService().getCrmContactCrmTagsCount(crmContactId);
	}

	/**
	* Returns the number of CRM Tags.
	*
	* @return the number of CRM Tags
	*/
	public static int getCrmTagsCount() {
		return getService().getCrmTagsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<contact.manager.model.CrmTag> getCrmContactCrmTags(
		long crmContactId) {
		return getService().getCrmContactCrmTags(crmContactId);
	}

	public static java.util.List<contact.manager.model.CrmTag> getCrmContactCrmTags(
		long crmContactId, int start, int end) {
		return getService().getCrmContactCrmTags(crmContactId, start, end);
	}

	public static java.util.List<contact.manager.model.CrmTag> getCrmContactCrmTags(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmTag> orderByComparator) {
		return getService()
				   .getCrmContactCrmTags(crmContactId, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the CRM Tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @return the range of CRM Tags
	*/
	public static java.util.List<contact.manager.model.CrmTag> getCrmTags(
		int start, int end) {
		return getService().getCrmTags(start, end);
	}

	/**
	* Returns all the CRM Tags matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Tags
	* @param companyId the primary key of the company
	* @return the matching CRM Tags, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmTag> getCrmTagsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getCrmTagsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of CRM Tags matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Tags
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Tags, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmTag> getCrmTagsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmTag> orderByComparator) {
		return getService()
				   .getCrmTagsByUuidAndCompanyId(uuid, companyId, start, end,
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
	* Returns the crmContactIds of the CRM Contacts associated with the CRM Tag.
	*
	* @param crmTagId the crmTagId of the CRM Tag
	* @return long[] the crmContactIds of CRM Contacts associated with the CRM Tag
	*/
	public static long[] getCrmContactPrimaryKeys(long crmTagId) {
		return getService().getCrmContactPrimaryKeys(crmTagId);
	}

	public static void addCrmContactCrmTag(long crmContactId,
		contact.manager.model.CrmTag crmTag) {
		getService().addCrmContactCrmTag(crmContactId, crmTag);
	}

	public static void addCrmContactCrmTag(long crmContactId, long crmTagId) {
		getService().addCrmContactCrmTag(crmContactId, crmTagId);
	}

	public static void addCrmContactCrmTags(long crmContactId,
		java.util.List<contact.manager.model.CrmTag> crmTags) {
		getService().addCrmContactCrmTags(crmContactId, crmTags);
	}

	public static void addCrmContactCrmTags(long crmContactId, long[] crmTagIds) {
		getService().addCrmContactCrmTags(crmContactId, crmTagIds);
	}

	public static void clearCrmContactCrmTags(long crmContactId) {
		getService().clearCrmContactCrmTags(crmContactId);
	}

	public static void deleteCrmContactCrmTag(long crmContactId,
		contact.manager.model.CrmTag crmTag) {
		getService().deleteCrmContactCrmTag(crmContactId, crmTag);
	}

	public static void deleteCrmContactCrmTag(long crmContactId, long crmTagId) {
		getService().deleteCrmContactCrmTag(crmContactId, crmTagId);
	}

	public static void deleteCrmContactCrmTags(long crmContactId,
		java.util.List<contact.manager.model.CrmTag> crmTags) {
		getService().deleteCrmContactCrmTags(crmContactId, crmTags);
	}

	public static void deleteCrmContactCrmTags(long crmContactId,
		long[] crmTagIds) {
		getService().deleteCrmContactCrmTags(crmContactId, crmTagIds);
	}

	public static void setCrmContactCrmTags(long crmContactId, long[] crmTagIds) {
		getService().setCrmContactCrmTags(crmContactId, crmTagIds);
	}

	public static CrmTagLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmTagLocalService, CrmTagLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CrmTagLocalService.class);
}