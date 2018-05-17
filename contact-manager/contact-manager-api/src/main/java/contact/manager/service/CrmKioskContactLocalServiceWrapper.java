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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CrmKioskContactLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmKioskContactLocalService
 * @generated
 */
@ProviderType
public class CrmKioskContactLocalServiceWrapper
	implements CrmKioskContactLocalService,
		ServiceWrapper<CrmKioskContactLocalService> {
	public CrmKioskContactLocalServiceWrapper(
		CrmKioskContactLocalService crmKioskContactLocalService) {
		_crmKioskContactLocalService = crmKioskContactLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmKioskContactLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmKioskContactLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmKioskContactLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmKioskContactLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmKioskContactLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmKioskContactLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM Kiosk Contact to the database. Also notifies the appropriate model listeners.
	*
	* @param crmKioskContact the CRM Kiosk Contact
	* @return the CRM Kiosk Contact that was added
	*/
	@Override
	public contact.manager.model.CrmKioskContact addCrmKioskContact(
		contact.manager.model.CrmKioskContact crmKioskContact) {
		return _crmKioskContactLocalService.addCrmKioskContact(crmKioskContact);
	}

	/**
	* Creates a new CRM Kiosk Contact with the primary key. Does not add the CRM Kiosk Contact to the database.
	*
	* @param crmKioskContactId the primary key for the new CRM Kiosk Contact
	* @return the new CRM Kiosk Contact
	*/
	@Override
	public contact.manager.model.CrmKioskContact createCrmKioskContact(
		long crmKioskContactId) {
		return _crmKioskContactLocalService.createCrmKioskContact(crmKioskContactId);
	}

	/**
	* Deletes the CRM Kiosk Contact from the database. Also notifies the appropriate model listeners.
	*
	* @param crmKioskContact the CRM Kiosk Contact
	* @return the CRM Kiosk Contact that was removed
	*/
	@Override
	public contact.manager.model.CrmKioskContact deleteCrmKioskContact(
		contact.manager.model.CrmKioskContact crmKioskContact) {
		return _crmKioskContactLocalService.deleteCrmKioskContact(crmKioskContact);
	}

	/**
	* Deletes the CRM Kiosk Contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmKioskContactId the primary key of the CRM Kiosk Contact
	* @return the CRM Kiosk Contact that was removed
	* @throws PortalException if a CRM Kiosk Contact with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmKioskContact deleteCrmKioskContact(
		long crmKioskContactId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmKioskContactLocalService.deleteCrmKioskContact(crmKioskContactId);
	}

	@Override
	public contact.manager.model.CrmKioskContact fetchCrmKioskContact(
		long crmKioskContactId) {
		return _crmKioskContactLocalService.fetchCrmKioskContact(crmKioskContactId);
	}

	/**
	* Returns the CRM Kiosk Contact matching the UUID and group.
	*
	* @param uuid the CRM Kiosk Contact's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Kiosk Contact, or <code>null</code> if a matching CRM Kiosk Contact could not be found
	*/
	@Override
	public contact.manager.model.CrmKioskContact fetchCrmKioskContactByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _crmKioskContactLocalService.fetchCrmKioskContactByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the CRM Kiosk Contact with the primary key.
	*
	* @param crmKioskContactId the primary key of the CRM Kiosk Contact
	* @return the CRM Kiosk Contact
	* @throws PortalException if a CRM Kiosk Contact with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmKioskContact getCrmKioskContact(
		long crmKioskContactId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmKioskContactLocalService.getCrmKioskContact(crmKioskContactId);
	}

	/**
	* Returns the CRM Kiosk Contact matching the UUID and group.
	*
	* @param uuid the CRM Kiosk Contact's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Kiosk Contact
	* @throws PortalException if a matching CRM Kiosk Contact could not be found
	*/
	@Override
	public contact.manager.model.CrmKioskContact getCrmKioskContactByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmKioskContactLocalService.getCrmKioskContactByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the CRM Kiosk Contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmKioskContact the CRM Kiosk Contact
	* @return the CRM Kiosk Contact that was updated
	*/
	@Override
	public contact.manager.model.CrmKioskContact updateCrmKioskContact(
		contact.manager.model.CrmKioskContact crmKioskContact) {
		return _crmKioskContactLocalService.updateCrmKioskContact(crmKioskContact);
	}

	/**
	* Returns the number of CRM Kiosk Contacts.
	*
	* @return the number of CRM Kiosk Contacts
	*/
	@Override
	public int getCrmKioskContactsCount() {
		return _crmKioskContactLocalService.getCrmKioskContactsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmKioskContactLocalService.getOSGiServiceIdentifier();
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
		return _crmKioskContactLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmKioskContactLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmKioskContactLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the CRM Kiosk Contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmKioskContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @return the range of CRM Kiosk Contacts
	*/
	@Override
	public java.util.List<contact.manager.model.CrmKioskContact> getCrmKioskContacts(
		int start, int end) {
		return _crmKioskContactLocalService.getCrmKioskContacts(start, end);
	}

	/**
	* Returns all the CRM Kiosk Contacts matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Kiosk Contacts
	* @param companyId the primary key of the company
	* @return the matching CRM Kiosk Contacts, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmKioskContact> getCrmKioskContactsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _crmKioskContactLocalService.getCrmKioskContactsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of CRM Kiosk Contacts matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Kiosk Contacts
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Kiosk Contacts
	* @param end the upper bound of the range of CRM Kiosk Contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Kiosk Contacts, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmKioskContact> getCrmKioskContactsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmKioskContact> orderByComparator) {
		return _crmKioskContactLocalService.getCrmKioskContactsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
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
		return _crmKioskContactLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmKioskContactLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public CrmKioskContactLocalService getWrappedService() {
		return _crmKioskContactLocalService;
	}

	@Override
	public void setWrappedService(
		CrmKioskContactLocalService crmKioskContactLocalService) {
		_crmKioskContactLocalService = crmKioskContactLocalService;
	}

	private CrmKioskContactLocalService _crmKioskContactLocalService;
}