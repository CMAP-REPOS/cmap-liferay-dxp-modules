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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ContactLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContactLocalService
 * @generated
 */
@ProviderType
public class ContactLocalServiceWrapper implements ContactLocalService,
	ServiceWrapper<ContactLocalService> {
	public ContactLocalServiceWrapper(ContactLocalService contactLocalService) {
		_contactLocalService = contactLocalService;
	}

	@Override
	public boolean hasCmapSubGroupContact(long subGroupId, long contactId) {
		return _contactLocalService.hasCmapSubGroupContact(subGroupId, contactId);
	}

	@Override
	public boolean hasCmapSubGroupContacts(long subGroupId) {
		return _contactLocalService.hasCmapSubGroupContacts(subGroupId);
	}

	@Override
	public boolean hasCmapTagContact(long tagId, long contactId) {
		return _contactLocalService.hasCmapTagContact(tagId, contactId);
	}

	@Override
	public boolean hasCmapTagContacts(long tagId) {
		return _contactLocalService.hasCmapTagContacts(tagId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _contactLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contactLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _contactLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contactLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contactLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the contact to the database. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was added
	*/
	@Override
	public contact.manager.service.model.Contact addContact(
		contact.manager.service.model.Contact contact) {
		return _contactLocalService.addContact(contact);
	}

	/**
	* Creates a new contact with the primary key. Does not add the contact to the database.
	*
	* @param contactId the primary key for the new contact
	* @return the new contact
	*/
	@Override
	public contact.manager.service.model.Contact createContact(long contactId) {
		return _contactLocalService.createContact(contactId);
	}

	/**
	* Deletes the contact from the database. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was removed
	*/
	@Override
	public contact.manager.service.model.Contact deleteContact(
		contact.manager.service.model.Contact contact) {
		return _contactLocalService.deleteContact(contact);
	}

	/**
	* Deletes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactId the primary key of the contact
	* @return the contact that was removed
	* @throws PortalException if a contact with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.Contact deleteContact(long contactId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contactLocalService.deleteContact(contactId);
	}

	@Override
	public contact.manager.service.model.Contact fetchContact(long contactId) {
		return _contactLocalService.fetchContact(contactId);
	}

	/**
	* Returns the contact with the primary key.
	*
	* @param contactId the primary key of the contact
	* @return the contact
	* @throws PortalException if a contact with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.Contact getContact(long contactId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contactLocalService.getContact(contactId);
	}

	/**
	* Updates the contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was updated
	*/
	@Override
	public contact.manager.service.model.Contact updateContact(
		contact.manager.service.model.Contact contact) {
		return _contactLocalService.updateContact(contact);
	}

	@Override
	public int getCmapSubGroupContactsCount(long subGroupId) {
		return _contactLocalService.getCmapSubGroupContactsCount(subGroupId);
	}

	@Override
	public int getCmapTagContactsCount(long tagId) {
		return _contactLocalService.getCmapTagContactsCount(tagId);
	}

	/**
	* Returns the number of contacts.
	*
	* @return the number of contacts
	*/
	@Override
	public int getContactsCount() {
		return _contactLocalService.getContactsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _contactLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _contactLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _contactLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _contactLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<contact.manager.service.model.Contact> getCmapSubGroupContacts(
		long subGroupId) {
		return _contactLocalService.getCmapSubGroupContacts(subGroupId);
	}

	@Override
	public java.util.List<contact.manager.service.model.Contact> getCmapSubGroupContacts(
		long subGroupId, int start, int end) {
		return _contactLocalService.getCmapSubGroupContacts(subGroupId, start,
			end);
	}

	@Override
	public java.util.List<contact.manager.service.model.Contact> getCmapSubGroupContacts(
		long subGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.service.model.Contact> orderByComparator) {
		return _contactLocalService.getCmapSubGroupContacts(subGroupId, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<contact.manager.service.model.Contact> getCmapTagContacts(
		long tagId) {
		return _contactLocalService.getCmapTagContacts(tagId);
	}

	@Override
	public java.util.List<contact.manager.service.model.Contact> getCmapTagContacts(
		long tagId, int start, int end) {
		return _contactLocalService.getCmapTagContacts(tagId, start, end);
	}

	@Override
	public java.util.List<contact.manager.service.model.Contact> getCmapTagContacts(
		long tagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.service.model.Contact> orderByComparator) {
		return _contactLocalService.getCmapTagContacts(tagId, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<contact.manager.service.model.Contact> getContacts(
		int start, int end) {
		return _contactLocalService.getContacts(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _contactLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _contactLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Returns the subGroupIds of the cmap sub groups associated with the contact.
	*
	* @param contactId the contactId of the contact
	* @return long[] the subGroupIds of cmap sub groups associated with the contact
	*/
	@Override
	public long[] getCmapSubGroupPrimaryKeys(long contactId) {
		return _contactLocalService.getCmapSubGroupPrimaryKeys(contactId);
	}

	/**
	* Returns the tagIds of the cmap tags associated with the contact.
	*
	* @param contactId the contactId of the contact
	* @return long[] the tagIds of cmap tags associated with the contact
	*/
	@Override
	public long[] getCmapTagPrimaryKeys(long contactId) {
		return _contactLocalService.getCmapTagPrimaryKeys(contactId);
	}

	@Override
	public void addCmapSubGroupContact(long subGroupId,
		contact.manager.service.model.Contact contact) {
		_contactLocalService.addCmapSubGroupContact(subGroupId, contact);
	}

	@Override
	public void addCmapSubGroupContact(long subGroupId, long contactId) {
		_contactLocalService.addCmapSubGroupContact(subGroupId, contactId);
	}

	@Override
	public void addCmapSubGroupContacts(long subGroupId,
		java.util.List<contact.manager.service.model.Contact> contacts) {
		_contactLocalService.addCmapSubGroupContacts(subGroupId, contacts);
	}

	@Override
	public void addCmapSubGroupContacts(long subGroupId, long[] contactIds) {
		_contactLocalService.addCmapSubGroupContacts(subGroupId, contactIds);
	}

	@Override
	public void addCmapTagContact(long tagId,
		contact.manager.service.model.Contact contact) {
		_contactLocalService.addCmapTagContact(tagId, contact);
	}

	@Override
	public void addCmapTagContact(long tagId, long contactId) {
		_contactLocalService.addCmapTagContact(tagId, contactId);
	}

	@Override
	public void addCmapTagContacts(long tagId,
		java.util.List<contact.manager.service.model.Contact> contacts) {
		_contactLocalService.addCmapTagContacts(tagId, contacts);
	}

	@Override
	public void addCmapTagContacts(long tagId, long[] contactIds) {
		_contactLocalService.addCmapTagContacts(tagId, contactIds);
	}

	@Override
	public void clearCmapSubGroupContacts(long subGroupId) {
		_contactLocalService.clearCmapSubGroupContacts(subGroupId);
	}

	@Override
	public void clearCmapTagContacts(long tagId) {
		_contactLocalService.clearCmapTagContacts(tagId);
	}

	@Override
	public void deleteCmapSubGroupContact(long subGroupId,
		contact.manager.service.model.Contact contact) {
		_contactLocalService.deleteCmapSubGroupContact(subGroupId, contact);
	}

	@Override
	public void deleteCmapSubGroupContact(long subGroupId, long contactId) {
		_contactLocalService.deleteCmapSubGroupContact(subGroupId, contactId);
	}

	@Override
	public void deleteCmapSubGroupContacts(long subGroupId,
		java.util.List<contact.manager.service.model.Contact> contacts) {
		_contactLocalService.deleteCmapSubGroupContacts(subGroupId, contacts);
	}

	@Override
	public void deleteCmapSubGroupContacts(long subGroupId, long[] contactIds) {
		_contactLocalService.deleteCmapSubGroupContacts(subGroupId, contactIds);
	}

	@Override
	public void deleteCmapTagContact(long tagId,
		contact.manager.service.model.Contact contact) {
		_contactLocalService.deleteCmapTagContact(tagId, contact);
	}

	@Override
	public void deleteCmapTagContact(long tagId, long contactId) {
		_contactLocalService.deleteCmapTagContact(tagId, contactId);
	}

	@Override
	public void deleteCmapTagContacts(long tagId,
		java.util.List<contact.manager.service.model.Contact> contacts) {
		_contactLocalService.deleteCmapTagContacts(tagId, contacts);
	}

	@Override
	public void deleteCmapTagContacts(long tagId, long[] contactIds) {
		_contactLocalService.deleteCmapTagContacts(tagId, contactIds);
	}

	@Override
	public void setCmapSubGroupContacts(long subGroupId, long[] contactIds) {
		_contactLocalService.setCmapSubGroupContacts(subGroupId, contactIds);
	}

	@Override
	public void setCmapTagContacts(long tagId, long[] contactIds) {
		_contactLocalService.setCmapTagContacts(tagId, contactIds);
	}

	@Override
	public ContactLocalService getWrappedService() {
		return _contactLocalService;
	}

	@Override
	public void setWrappedService(ContactLocalService contactLocalService) {
		_contactLocalService = contactLocalService;
	}

	private ContactLocalService _contactLocalService;
}