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
 * Provides a wrapper for {@link ContactAuditLogChangeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLogChangeLocalService
 * @generated
 */
@ProviderType
public class ContactAuditLogChangeLocalServiceWrapper
	implements ContactAuditLogChangeLocalService,
		ServiceWrapper<ContactAuditLogChangeLocalService> {
	public ContactAuditLogChangeLocalServiceWrapper(
		ContactAuditLogChangeLocalService contactAuditLogChangeLocalService) {
		_contactAuditLogChangeLocalService = contactAuditLogChangeLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _contactAuditLogChangeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contactAuditLogChangeLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _contactAuditLogChangeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contactAuditLogChangeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contactAuditLogChangeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the contact audit log change to the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogChange the contact audit log change
	* @return the contact audit log change that was added
	*/
	@Override
	public contact.manager.service.model.ContactAuditLogChange addContactAuditLogChange(
		contact.manager.service.model.ContactAuditLogChange contactAuditLogChange) {
		return _contactAuditLogChangeLocalService.addContactAuditLogChange(contactAuditLogChange);
	}

	/**
	* Creates a new contact audit log change with the primary key. Does not add the contact audit log change to the database.
	*
	* @param contactAuditLogChangeId the primary key for the new contact audit log change
	* @return the new contact audit log change
	*/
	@Override
	public contact.manager.service.model.ContactAuditLogChange createContactAuditLogChange(
		long contactAuditLogChangeId) {
		return _contactAuditLogChangeLocalService.createContactAuditLogChange(contactAuditLogChangeId);
	}

	/**
	* Deletes the contact audit log change from the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogChange the contact audit log change
	* @return the contact audit log change that was removed
	*/
	@Override
	public contact.manager.service.model.ContactAuditLogChange deleteContactAuditLogChange(
		contact.manager.service.model.ContactAuditLogChange contactAuditLogChange) {
		return _contactAuditLogChangeLocalService.deleteContactAuditLogChange(contactAuditLogChange);
	}

	/**
	* Deletes the contact audit log change with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogChangeId the primary key of the contact audit log change
	* @return the contact audit log change that was removed
	* @throws PortalException if a contact audit log change with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.ContactAuditLogChange deleteContactAuditLogChange(
		long contactAuditLogChangeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contactAuditLogChangeLocalService.deleteContactAuditLogChange(contactAuditLogChangeId);
	}

	@Override
	public contact.manager.service.model.ContactAuditLogChange fetchContactAuditLogChange(
		long contactAuditLogChangeId) {
		return _contactAuditLogChangeLocalService.fetchContactAuditLogChange(contactAuditLogChangeId);
	}

	/**
	* Returns the contact audit log change with the primary key.
	*
	* @param contactAuditLogChangeId the primary key of the contact audit log change
	* @return the contact audit log change
	* @throws PortalException if a contact audit log change with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.ContactAuditLogChange getContactAuditLogChange(
		long contactAuditLogChangeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contactAuditLogChangeLocalService.getContactAuditLogChange(contactAuditLogChangeId);
	}

	/**
	* Updates the contact audit log change in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogChange the contact audit log change
	* @return the contact audit log change that was updated
	*/
	@Override
	public contact.manager.service.model.ContactAuditLogChange updateContactAuditLogChange(
		contact.manager.service.model.ContactAuditLogChange contactAuditLogChange) {
		return _contactAuditLogChangeLocalService.updateContactAuditLogChange(contactAuditLogChange);
	}

	/**
	* Returns the number of contact audit log changes.
	*
	* @return the number of contact audit log changes
	*/
	@Override
	public int getContactAuditLogChangesCount() {
		return _contactAuditLogChangeLocalService.getContactAuditLogChangesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _contactAuditLogChangeLocalService.getOSGiServiceIdentifier();
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
		return _contactAuditLogChangeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _contactAuditLogChangeLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _contactAuditLogChangeLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the contact audit log changes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @return the range of contact audit log changes
	*/
	@Override
	public java.util.List<contact.manager.service.model.ContactAuditLogChange> getContactAuditLogChanges(
		int start, int end) {
		return _contactAuditLogChangeLocalService.getContactAuditLogChanges(start,
			end);
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
		return _contactAuditLogChangeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _contactAuditLogChangeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ContactAuditLogChangeLocalService getWrappedService() {
		return _contactAuditLogChangeLocalService;
	}

	@Override
	public void setWrappedService(
		ContactAuditLogChangeLocalService contactAuditLogChangeLocalService) {
		_contactAuditLogChangeLocalService = contactAuditLogChangeLocalService;
	}

	private ContactAuditLogChangeLocalService _contactAuditLogChangeLocalService;
}