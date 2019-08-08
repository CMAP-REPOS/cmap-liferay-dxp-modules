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
 * Provides the local service utility for CrmContact. This utility wraps
 * {@link contact.manager.service.impl.CrmContactLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactLocalService
 * @see contact.manager.service.base.CrmContactLocalServiceBaseImpl
 * @see contact.manager.service.impl.CrmContactLocalServiceImpl
 * @generated
 */
@ProviderType
public class CrmContactLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.impl.CrmContactLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the CRM Contact to the database. Also notifies the appropriate model listeners.
	*
	* @param crmContact the CRM Contact
	* @return the CRM Contact that was added
	*/
	public static contact.manager.model.CrmContact addCrmContact(
		contact.manager.model.CrmContact crmContact) {
		return getService().addCrmContact(crmContact);
	}

	/**
	* Adds the CRM Contact to the database. Also notifies the appropriate model listeners.
	*
	* @param crmContact the CRM Contact
	* @return the CRM Contact that was added
	* @throws PortalException
	*/
	public static contact.manager.model.CrmContact addCrmContact(
		contact.manager.model.CrmContact crmContact,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().addCrmContact(crmContact, serviceContext);
	}

	public static void addCrmGroupCrmContact(long crmGroupId,
		contact.manager.model.CrmContact crmContact) {
		getService().addCrmGroupCrmContact(crmGroupId, crmContact);
	}

	public static void addCrmGroupCrmContact(long crmGroupId, long crmContactId) {
		getService().addCrmGroupCrmContact(crmGroupId, crmContactId);
	}

	public static void addCrmGroupCrmContacts(long crmGroupId,
		java.util.List<contact.manager.model.CrmContact> crmContacts) {
		getService().addCrmGroupCrmContacts(crmGroupId, crmContacts);
	}

	public static void addCrmGroupCrmContacts(long crmGroupId,
		long[] crmContactIds) {
		getService().addCrmGroupCrmContacts(crmGroupId, crmContactIds);
	}

	public static void addCrmTagCrmContact(long crmTagId,
		contact.manager.model.CrmContact crmContact) {
		getService().addCrmTagCrmContact(crmTagId, crmContact);
	}

	public static void addCrmTagCrmContact(long crmTagId, long crmContactId) {
		getService().addCrmTagCrmContact(crmTagId, crmContactId);
	}

	public static void addCrmTagCrmContacts(long crmTagId,
		java.util.List<contact.manager.model.CrmContact> crmContacts) {
		getService().addCrmTagCrmContacts(crmTagId, crmContacts);
	}

	public static void addCrmTagCrmContacts(long crmTagId, long[] crmContactIds) {
		getService().addCrmTagCrmContacts(crmTagId, crmContactIds);
	}

	public static void clearCrmGroupCrmContacts(long crmGroupId) {
		getService().clearCrmGroupCrmContacts(crmGroupId);
	}

	public static void clearCrmTagCrmContacts(long crmTagId) {
		getService().clearCrmTagCrmContacts(crmTagId);
	}

	/**
	* Creates a new CRM Contact with the primary key. Does not add the CRM Contact to the database.
	*
	* @param crmContactId the primary key for the new CRM Contact
	* @return the new CRM Contact
	*/
	public static contact.manager.model.CrmContact createCrmContact(
		long crmContactId) {
		return getService().createCrmContact(crmContactId);
	}

	/**
	* Deletes the CRM Contact from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContact the CRM Contact
	* @return the CRM Contact that was removed
	*/
	public static contact.manager.model.CrmContact deleteCrmContact(
		contact.manager.model.CrmContact crmContact) {
		return getService().deleteCrmContact(crmContact);
	}

	/**
	* Deletes the CRM Contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactId the primary key of the CRM Contact
	* @return the CRM Contact that was removed
	* @throws PortalException if a CRM Contact with the primary key could not be found
	*/
	public static contact.manager.model.CrmContact deleteCrmContact(
		long crmContactId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCrmContact(crmContactId);
	}

	public static contact.manager.model.CrmContact deleteCrmContact(
		long crmContactId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCrmContact(crmContactId, serviceContext);
	}

	public static void deleteCrmGroupCrmContact(long crmGroupId,
		contact.manager.model.CrmContact crmContact) {
		getService().deleteCrmGroupCrmContact(crmGroupId, crmContact);
	}

	public static void deleteCrmGroupCrmContact(long crmGroupId,
		long crmContactId) {
		getService().deleteCrmGroupCrmContact(crmGroupId, crmContactId);
	}

	public static void deleteCrmGroupCrmContacts(long crmGroupId,
		java.util.List<contact.manager.model.CrmContact> crmContacts) {
		getService().deleteCrmGroupCrmContacts(crmGroupId, crmContacts);
	}

	public static void deleteCrmGroupCrmContacts(long crmGroupId,
		long[] crmContactIds) {
		getService().deleteCrmGroupCrmContacts(crmGroupId, crmContactIds);
	}

	public static void deleteCrmTagCrmContact(long crmTagId,
		contact.manager.model.CrmContact crmContact) {
		getService().deleteCrmTagCrmContact(crmTagId, crmContact);
	}

	public static void deleteCrmTagCrmContact(long crmTagId, long crmContactId) {
		getService().deleteCrmTagCrmContact(crmTagId, crmContactId);
	}

	public static void deleteCrmTagCrmContacts(long crmTagId,
		java.util.List<contact.manager.model.CrmContact> crmContacts) {
		getService().deleteCrmTagCrmContacts(crmTagId, crmContacts);
	}

	public static void deleteCrmTagCrmContacts(long crmTagId,
		long[] crmContactIds) {
		getService().deleteCrmTagCrmContacts(crmTagId, crmContactIds);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static contact.manager.model.CrmContact fetchCrmContact(
		long crmContactId) {
		return getService().fetchCrmContact(crmContactId);
	}

	/**
	* Returns the CRM Contact matching the UUID and group.
	*
	* @param uuid the CRM Contact's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	public static contact.manager.model.CrmContact fetchCrmContactByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchCrmContactByUuidAndGroupId(uuid, groupId);
	}

	public static contact.manager.model.CrmContact findByConstantContactId(
		long constantContactId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.NoSuchContactException,
			contact.manager.exception.NoSuchCrmContactException {
		return getService().findByConstantContactId(constantContactId);
	}

	public static java.util.List<contact.manager.model.CrmContact> findByPrimaryEmailAddress(
		String primaryEmailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByPrimaryEmailAddress(primaryEmailAddress);
	}

	public static java.util.List<contact.manager.model.CrmContact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status);
	}

	public static java.util.List<contact.manager.model.CrmContact> findByStatus(
		String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByStatus(status);
	}

	public static java.util.List<contact.manager.model.CrmContact> findByVipFlag(
		boolean isVip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByVipFlag(isVip);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the CRM Contact with the primary key.
	*
	* @param crmContactId the primary key of the CRM Contact
	* @return the CRM Contact
	* @throws PortalException if a CRM Contact with the primary key could not be found
	*/
	public static contact.manager.model.CrmContact getCrmContact(
		long crmContactId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmContact(crmContactId);
	}

	/**
	* Returns the CRM Contact matching the UUID and group.
	*
	* @param uuid the CRM Contact's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Contact
	* @throws PortalException if a matching CRM Contact could not be found
	*/
	public static contact.manager.model.CrmContact getCrmContactByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmContactByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the CRM Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @return the range of CRM Contacts
	*/
	public static java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		int start, int end) {
		return getService().getCrmContacts(start, end);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContactsByStatus(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCrmContactsByStatus(status, start, end, obc);
	}

	/**
	* Returns all the CRM Contacts matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Contacts
	* @param companyId the primary key of the company
	* @return the matching CRM Contacts, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmContact> getCrmContactsByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getCrmContactsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of CRM Contacts matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Contacts
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Contacts
	* @param end the upper bound of the range of CRM Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Contacts, or an empty list if no matches were found
	*/
	public static java.util.List<contact.manager.model.CrmContact> getCrmContactsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		return getService()
				   .getCrmContactsByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of CRM Contacts.
	*
	* @return the number of CRM Contacts
	*/
	public static int getCrmContactsCount() {
		return getService().getCrmContactsCount();
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmGroupCrmContacts(
		long crmGroupId) {
		return getService().getCrmGroupCrmContacts(crmGroupId);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmGroupCrmContacts(
		long crmGroupId, int start, int end) {
		return getService().getCrmGroupCrmContacts(crmGroupId, start, end);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmGroupCrmContacts(
		long crmGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		return getService()
				   .getCrmGroupCrmContacts(crmGroupId, start, end,
			orderByComparator);
	}

	public static int getCrmGroupCrmContactsCount(long crmGroupId) {
		return getService().getCrmGroupCrmContactsCount(crmGroupId);
	}

	/**
	* Returns the crmGroupIds of the CRM Groups associated with the CRM Contact.
	*
	* @param crmContactId the crmContactId of the CRM Contact
	* @return long[] the crmGroupIds of CRM Groups associated with the CRM Contact
	*/
	public static long[] getCrmGroupPrimaryKeys(long crmContactId) {
		return getService().getCrmGroupPrimaryKeys(crmContactId);
	}

	public static java.util.List<contact.manager.model.CrmGroup> getCrmGroups(
		long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCrmGroups(contactId);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmTagCrmContacts(
		long crmTagId) {
		return getService().getCrmTagCrmContacts(crmTagId);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmTagCrmContacts(
		long crmTagId, int start, int end) {
		return getService().getCrmTagCrmContacts(crmTagId, start, end);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmTagCrmContacts(
		long crmTagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		return getService()
				   .getCrmTagCrmContacts(crmTagId, start, end, orderByComparator);
	}

	public static int getCrmTagCrmContactsCount(long crmTagId) {
		return getService().getCrmTagCrmContactsCount(crmTagId);
	}

	/**
	* Returns the crmTagIds of the CRM Tags associated with the CRM Contact.
	*
	* @param crmContactId the crmContactId of the CRM Contact
	* @return long[] the crmTagIds of CRM Tags associated with the CRM Contact
	*/
	public static long[] getCrmTagPrimaryKeys(long crmContactId) {
		return getService().getCrmTagPrimaryKeys(crmContactId);
	}

	public static java.util.List<contact.manager.model.CrmTag> getCrmTags(
		long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCrmTags(contactId);
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

	public static boolean hasCrmGroupCrmContact(long crmGroupId,
		long crmContactId) {
		return getService().hasCrmGroupCrmContact(crmGroupId, crmContactId);
	}

	public static boolean hasCrmGroupCrmContacts(long crmGroupId) {
		return getService().hasCrmGroupCrmContacts(crmGroupId);
	}

	public static boolean hasCrmTagCrmContact(long crmTagId, long crmContactId) {
		return getService().hasCrmTagCrmContact(crmTagId, crmContactId);
	}

	public static boolean hasCrmTagCrmContacts(long crmTagId) {
		return getService().hasCrmTagCrmContacts(crmTagId);
	}

	public static void initCrmContactResourcePermissions(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().initCrmContactResourcePermissions(companyId);
	}

	public static void initCrmContactResourcePermissions(
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().initCrmContactResourcePermissions(serviceContext);
	}

	public static void setCrmGroupCrmContacts(long crmGroupId,
		long[] crmContactIds) {
		getService().setCrmGroupCrmContacts(crmGroupId, crmContactIds);
	}

	public static void setCrmGroups(long contactId, long[] groupIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setCrmGroups(contactId, groupIds);
	}

	public static void setCrmTagCrmContacts(long crmTagId, long[] crmContactIds) {
		getService().setCrmTagCrmContacts(crmTagId, crmContactIds);
	}

	public static void setCrmTags(long contactId, long[] tagIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setCrmTags(contactId, tagIds);
	}

	/**
	* Updates the CRM Contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmContact the CRM Contact
	* @return the CRM Contact that was updated
	*/
	public static contact.manager.model.CrmContact updateCrmContact(
		contact.manager.model.CrmContact crmContact) {
		return getService().updateCrmContact(crmContact);
	}

	public static contact.manager.model.CrmContact updateCrmContact(
		contact.manager.model.CrmContact crmContact,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updateCrmContact(crmContact, serviceContext);
	}

	public static CrmContactLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmContactLocalService, CrmContactLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CrmContactLocalService.class);

		ServiceTracker<CrmContactLocalService, CrmContactLocalService> serviceTracker =
			new ServiceTracker<CrmContactLocalService, CrmContactLocalService>(bundle.getBundleContext(),
				CrmContactLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}