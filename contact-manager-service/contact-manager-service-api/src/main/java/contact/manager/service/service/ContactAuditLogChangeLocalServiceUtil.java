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
 * Provides the local service utility for ContactAuditLogChange. This utility wraps
 * {@link contact.manager.service.service.impl.ContactAuditLogChangeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLogChangeLocalService
 * @see contact.manager.service.service.base.ContactAuditLogChangeLocalServiceBaseImpl
 * @see contact.manager.service.service.impl.ContactAuditLogChangeLocalServiceImpl
 * @generated
 */
@ProviderType
public class ContactAuditLogChangeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.service.impl.ContactAuditLogChangeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
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
	* Adds the contact audit log change to the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogChange the contact audit log change
	* @return the contact audit log change that was added
	*/
	public static contact.manager.service.model.ContactAuditLogChange addContactAuditLogChange(
		contact.manager.service.model.ContactAuditLogChange contactAuditLogChange) {
		return getService().addContactAuditLogChange(contactAuditLogChange);
	}

	/**
	* Creates a new contact audit log change with the primary key. Does not add the contact audit log change to the database.
	*
	* @param contactAuditLogChangeId the primary key for the new contact audit log change
	* @return the new contact audit log change
	*/
	public static contact.manager.service.model.ContactAuditLogChange createContactAuditLogChange(
		long contactAuditLogChangeId) {
		return getService().createContactAuditLogChange(contactAuditLogChangeId);
	}

	/**
	* Deletes the contact audit log change from the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogChange the contact audit log change
	* @return the contact audit log change that was removed
	*/
	public static contact.manager.service.model.ContactAuditLogChange deleteContactAuditLogChange(
		contact.manager.service.model.ContactAuditLogChange contactAuditLogChange) {
		return getService().deleteContactAuditLogChange(contactAuditLogChange);
	}

	/**
	* Deletes the contact audit log change with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogChangeId the primary key of the contact audit log change
	* @return the contact audit log change that was removed
	* @throws PortalException if a contact audit log change with the primary key could not be found
	*/
	public static contact.manager.service.model.ContactAuditLogChange deleteContactAuditLogChange(
		long contactAuditLogChangeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteContactAuditLogChange(contactAuditLogChangeId);
	}

	public static contact.manager.service.model.ContactAuditLogChange fetchContactAuditLogChange(
		long contactAuditLogChangeId) {
		return getService().fetchContactAuditLogChange(contactAuditLogChangeId);
	}

	/**
	* Returns the contact audit log change with the primary key.
	*
	* @param contactAuditLogChangeId the primary key of the contact audit log change
	* @return the contact audit log change
	* @throws PortalException if a contact audit log change with the primary key could not be found
	*/
	public static contact.manager.service.model.ContactAuditLogChange getContactAuditLogChange(
		long contactAuditLogChangeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getContactAuditLogChange(contactAuditLogChangeId);
	}

	/**
	* Updates the contact audit log change in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogChange the contact audit log change
	* @return the contact audit log change that was updated
	*/
	public static contact.manager.service.model.ContactAuditLogChange updateContactAuditLogChange(
		contact.manager.service.model.ContactAuditLogChange contactAuditLogChange) {
		return getService().updateContactAuditLogChange(contactAuditLogChange);
	}

	/**
	* Returns the number of contact audit log changes.
	*
	* @return the number of contact audit log changes
	*/
	public static int getContactAuditLogChangesCount() {
		return getService().getContactAuditLogChangesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<contact.manager.service.model.ContactAuditLogChange> getContactAuditLogChanges(
		int start, int end) {
		return getService().getContactAuditLogChanges(start, end);
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

	public static ContactAuditLogChangeLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContactAuditLogChangeLocalService, ContactAuditLogChangeLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ContactAuditLogChangeLocalService.class);
}