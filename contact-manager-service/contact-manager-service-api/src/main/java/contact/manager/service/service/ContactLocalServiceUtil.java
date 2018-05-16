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
 * Provides the local service utility for Contact. This utility wraps
 * {@link contact.manager.service.service.impl.ContactLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ContactLocalService
 * @see contact.manager.service.service.base.ContactLocalServiceBaseImpl
 * @see contact.manager.service.service.impl.ContactLocalServiceImpl
 * @generated
 */
@ProviderType
public class ContactLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.service.impl.ContactLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean hasCmapSubGroupContact(long subGroupId, long contactId) {
		return getService().hasCmapSubGroupContact(subGroupId, contactId);
	}

	public static boolean hasCmapSubGroupContacts(long subGroupId) {
		return getService().hasCmapSubGroupContacts(subGroupId);
	}

	public static boolean hasCmapTagContact(long tagId, long contactId) {
		return getService().hasCmapTagContact(tagId, contactId);
	}

	public static boolean hasCmapTagContacts(long tagId) {
		return getService().hasCmapTagContacts(tagId);
	}

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
	* Adds the contact to the database. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was added
	*/
	public static contact.manager.service.model.Contact addContact(
		contact.manager.service.model.Contact contact) {
		return getService().addContact(contact);
	}

	/**
	* Creates a new contact with the primary key. Does not add the contact to the database.
	*
	* @param contactId the primary key for the new contact
	* @return the new contact
	*/
	public static contact.manager.service.model.Contact createContact(
		long contactId) {
		return getService().createContact(contactId);
	}

	/**
	* Deletes the contact from the database. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was removed
	*/
	public static contact.manager.service.model.Contact deleteContact(
		contact.manager.service.model.Contact contact) {
		return getService().deleteContact(contact);
	}

	/**
	* Deletes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactId the primary key of the contact
	* @return the contact that was removed
	* @throws PortalException if a contact with the primary key could not be found
	*/
	public static contact.manager.service.model.Contact deleteContact(
		long contactId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteContact(contactId);
	}

	public static contact.manager.service.model.Contact fetchContact(
		long contactId) {
		return getService().fetchContact(contactId);
	}

	/**
	* Returns the contact with the primary key.
	*
	* @param contactId the primary key of the contact
	* @return the contact
	* @throws PortalException if a contact with the primary key could not be found
	*/
	public static contact.manager.service.model.Contact getContact(
		long contactId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getContact(contactId);
	}

	/**
	* Updates the contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was updated
	*/
	public static contact.manager.service.model.Contact updateContact(
		contact.manager.service.model.Contact contact) {
		return getService().updateContact(contact);
	}

	public static int getCmapSubGroupContactsCount(long subGroupId) {
		return getService().getCmapSubGroupContactsCount(subGroupId);
	}

	public static int getCmapTagContactsCount(long tagId) {
		return getService().getCmapTagContactsCount(tagId);
	}

	/**
	* Returns the number of contacts.
	*
	* @return the number of contacts
	*/
	public static int getContactsCount() {
		return getService().getContactsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<contact.manager.service.model.Contact> getCmapSubGroupContacts(
		long subGroupId) {
		return getService().getCmapSubGroupContacts(subGroupId);
	}

	public static java.util.List<contact.manager.service.model.Contact> getCmapSubGroupContacts(
		long subGroupId, int start, int end) {
		return getService().getCmapSubGroupContacts(subGroupId, start, end);
	}

	public static java.util.List<contact.manager.service.model.Contact> getCmapSubGroupContacts(
		long subGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.service.model.Contact> orderByComparator) {
		return getService()
				   .getCmapSubGroupContacts(subGroupId, start, end,
			orderByComparator);
	}

	public static java.util.List<contact.manager.service.model.Contact> getCmapTagContacts(
		long tagId) {
		return getService().getCmapTagContacts(tagId);
	}

	public static java.util.List<contact.manager.service.model.Contact> getCmapTagContacts(
		long tagId, int start, int end) {
		return getService().getCmapTagContacts(tagId, start, end);
	}

	public static java.util.List<contact.manager.service.model.Contact> getCmapTagContacts(
		long tagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.service.model.Contact> orderByComparator) {
		return getService()
				   .getCmapTagContacts(tagId, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of contacts
	*/
	public static java.util.List<contact.manager.service.model.Contact> getContacts(
		int start, int end) {
		return getService().getContacts(start, end);
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
	* Returns the subGroupIds of the cmap sub groups associated with the contact.
	*
	* @param contactId the contactId of the contact
	* @return long[] the subGroupIds of cmap sub groups associated with the contact
	*/
	public static long[] getCmapSubGroupPrimaryKeys(long contactId) {
		return getService().getCmapSubGroupPrimaryKeys(contactId);
	}

	/**
	* Returns the tagIds of the cmap tags associated with the contact.
	*
	* @param contactId the contactId of the contact
	* @return long[] the tagIds of cmap tags associated with the contact
	*/
	public static long[] getCmapTagPrimaryKeys(long contactId) {
		return getService().getCmapTagPrimaryKeys(contactId);
	}

	public static void addCmapSubGroupContact(long subGroupId,
		contact.manager.service.model.Contact contact) {
		getService().addCmapSubGroupContact(subGroupId, contact);
	}

	public static void addCmapSubGroupContact(long subGroupId, long contactId) {
		getService().addCmapSubGroupContact(subGroupId, contactId);
	}

	public static void addCmapSubGroupContacts(long subGroupId,
		java.util.List<contact.manager.service.model.Contact> contacts) {
		getService().addCmapSubGroupContacts(subGroupId, contacts);
	}

	public static void addCmapSubGroupContacts(long subGroupId,
		long[] contactIds) {
		getService().addCmapSubGroupContacts(subGroupId, contactIds);
	}

	public static void addCmapTagContact(long tagId,
		contact.manager.service.model.Contact contact) {
		getService().addCmapTagContact(tagId, contact);
	}

	public static void addCmapTagContact(long tagId, long contactId) {
		getService().addCmapTagContact(tagId, contactId);
	}

	public static void addCmapTagContacts(long tagId,
		java.util.List<contact.manager.service.model.Contact> contacts) {
		getService().addCmapTagContacts(tagId, contacts);
	}

	public static void addCmapTagContacts(long tagId, long[] contactIds) {
		getService().addCmapTagContacts(tagId, contactIds);
	}

	public static void clearCmapSubGroupContacts(long subGroupId) {
		getService().clearCmapSubGroupContacts(subGroupId);
	}

	public static void clearCmapTagContacts(long tagId) {
		getService().clearCmapTagContacts(tagId);
	}

	public static void deleteCmapSubGroupContact(long subGroupId,
		contact.manager.service.model.Contact contact) {
		getService().deleteCmapSubGroupContact(subGroupId, contact);
	}

	public static void deleteCmapSubGroupContact(long subGroupId, long contactId) {
		getService().deleteCmapSubGroupContact(subGroupId, contactId);
	}

	public static void deleteCmapSubGroupContacts(long subGroupId,
		java.util.List<contact.manager.service.model.Contact> contacts) {
		getService().deleteCmapSubGroupContacts(subGroupId, contacts);
	}

	public static void deleteCmapSubGroupContacts(long subGroupId,
		long[] contactIds) {
		getService().deleteCmapSubGroupContacts(subGroupId, contactIds);
	}

	public static void deleteCmapTagContact(long tagId,
		contact.manager.service.model.Contact contact) {
		getService().deleteCmapTagContact(tagId, contact);
	}

	public static void deleteCmapTagContact(long tagId, long contactId) {
		getService().deleteCmapTagContact(tagId, contactId);
	}

	public static void deleteCmapTagContacts(long tagId,
		java.util.List<contact.manager.service.model.Contact> contacts) {
		getService().deleteCmapTagContacts(tagId, contacts);
	}

	public static void deleteCmapTagContacts(long tagId, long[] contactIds) {
		getService().deleteCmapTagContacts(tagId, contactIds);
	}

	public static void setCmapSubGroupContacts(long subGroupId,
		long[] contactIds) {
		getService().setCmapSubGroupContacts(subGroupId, contactIds);
	}

	public static void setCmapTagContacts(long tagId, long[] contactIds) {
		getService().setCmapTagContacts(tagId, contactIds);
	}

	public static ContactLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContactLocalService, ContactLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ContactLocalService.class);
}