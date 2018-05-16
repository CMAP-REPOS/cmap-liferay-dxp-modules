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
 * Provides a wrapper for {@link ContactAuditLogLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLogLocalService
 * @generated
 */
@ProviderType
public class ContactAuditLogLocalServiceWrapper
	implements ContactAuditLogLocalService,
		ServiceWrapper<ContactAuditLogLocalService> {
	public ContactAuditLogLocalServiceWrapper(
		ContactAuditLogLocalService contactAuditLogLocalService) {
		_contactAuditLogLocalService = contactAuditLogLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _contactAuditLogLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contactAuditLogLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _contactAuditLogLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contactAuditLogLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contactAuditLogLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the contact audit log to the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLog the contact audit log
	* @return the contact audit log that was added
	*/
	@Override
	public contact.manager.service.model.ContactAuditLog addContactAuditLog(
		contact.manager.service.model.ContactAuditLog contactAuditLog) {
		return _contactAuditLogLocalService.addContactAuditLog(contactAuditLog);
	}

	/**
	* Creates a new contact audit log with the primary key. Does not add the contact audit log to the database.
	*
	* @param contactAuditLogId the primary key for the new contact audit log
	* @return the new contact audit log
	*/
	@Override
	public contact.manager.service.model.ContactAuditLog createContactAuditLog(
		long contactAuditLogId) {
		return _contactAuditLogLocalService.createContactAuditLog(contactAuditLogId);
	}

	/**
	* Deletes the contact audit log from the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLog the contact audit log
	* @return the contact audit log that was removed
	*/
	@Override
	public contact.manager.service.model.ContactAuditLog deleteContactAuditLog(
		contact.manager.service.model.ContactAuditLog contactAuditLog) {
		return _contactAuditLogLocalService.deleteContactAuditLog(contactAuditLog);
	}

	/**
	* Deletes the contact audit log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogId the primary key of the contact audit log
	* @return the contact audit log that was removed
	* @throws PortalException if a contact audit log with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.ContactAuditLog deleteContactAuditLog(
		long contactAuditLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contactAuditLogLocalService.deleteContactAuditLog(contactAuditLogId);
	}

	@Override
	public contact.manager.service.model.ContactAuditLog fetchContactAuditLog(
		long contactAuditLogId) {
		return _contactAuditLogLocalService.fetchContactAuditLog(contactAuditLogId);
	}

	/**
	* Returns the contact audit log with the primary key.
	*
	* @param contactAuditLogId the primary key of the contact audit log
	* @return the contact audit log
	* @throws PortalException if a contact audit log with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.ContactAuditLog getContactAuditLog(
		long contactAuditLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contactAuditLogLocalService.getContactAuditLog(contactAuditLogId);
	}

	/**
	* Updates the contact audit log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLog the contact audit log
	* @return the contact audit log that was updated
	*/
	@Override
	public contact.manager.service.model.ContactAuditLog updateContactAuditLog(
		contact.manager.service.model.ContactAuditLog contactAuditLog) {
		return _contactAuditLogLocalService.updateContactAuditLog(contactAuditLog);
	}

	/**
	* Returns the number of contact audit logs.
	*
	* @return the number of contact audit logs
	*/
	@Override
	public int getContactAuditLogsCount() {
		return _contactAuditLogLocalService.getContactAuditLogsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _contactAuditLogLocalService.getOSGiServiceIdentifier();
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
		return _contactAuditLogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _contactAuditLogLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _contactAuditLogLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the contact audit logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @return the range of contact audit logs
	*/
	@Override
	public java.util.List<contact.manager.service.model.ContactAuditLog> getContactAuditLogs(
		int start, int end) {
		return _contactAuditLogLocalService.getContactAuditLogs(start, end);
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
		return _contactAuditLogLocalService.dynamicQueryCount(dynamicQuery);
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
		return _contactAuditLogLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ContactAuditLogLocalService getWrappedService() {
		return _contactAuditLogLocalService;
	}

	@Override
	public void setWrappedService(
		ContactAuditLogLocalService contactAuditLogLocalService) {
		_contactAuditLogLocalService = contactAuditLogLocalService;
	}

	private ContactAuditLogLocalService _contactAuditLogLocalService;
}