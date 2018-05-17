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
 * Provides a wrapper for {@link CrmContactLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactLocalService
 * @generated
 */
@ProviderType
public class CrmContactLocalServiceWrapper implements CrmContactLocalService,
	ServiceWrapper<CrmContactLocalService> {
	public CrmContactLocalServiceWrapper(
		CrmContactLocalService crmContactLocalService) {
		_crmContactLocalService = crmContactLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmContactLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmContactLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmContactLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmContactLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM Contact to the database. Also notifies the appropriate model listeners.
	*
	* @param crmContact the CRM Contact
	* @return the CRM Contact that was added
	*/
	@Override
	public contact.manager.model.CrmContact addCrmContact(
		contact.manager.model.CrmContact crmContact) {
		return _crmContactLocalService.addCrmContact(crmContact);
	}

	/**
	* Creates a new CRM Contact with the primary key. Does not add the CRM Contact to the database.
	*
	* @param crmContactId the primary key for the new CRM Contact
	* @return the new CRM Contact
	*/
	@Override
	public contact.manager.model.CrmContact createCrmContact(long crmContactId) {
		return _crmContactLocalService.createCrmContact(crmContactId);
	}

	/**
	* Deletes the CRM Contact from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContact the CRM Contact
	* @return the CRM Contact that was removed
	*/
	@Override
	public contact.manager.model.CrmContact deleteCrmContact(
		contact.manager.model.CrmContact crmContact) {
		return _crmContactLocalService.deleteCrmContact(crmContact);
	}

	/**
	* Deletes the CRM Contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactId the primary key of the CRM Contact
	* @return the CRM Contact that was removed
	* @throws PortalException if a CRM Contact with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmContact deleteCrmContact(long crmContactId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactLocalService.deleteCrmContact(crmContactId);
	}

	@Override
	public contact.manager.model.CrmContact fetchCrmContact(long crmContactId) {
		return _crmContactLocalService.fetchCrmContact(crmContactId);
	}

	/**
	* Returns the CRM Contact matching the UUID and group.
	*
	* @param uuid the CRM Contact's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	*/
	@Override
	public contact.manager.model.CrmContact fetchCrmContactByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _crmContactLocalService.fetchCrmContactByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the CRM Contact with the primary key.
	*
	* @param crmContactId the primary key of the CRM Contact
	* @return the CRM Contact
	* @throws PortalException if a CRM Contact with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmContact getCrmContact(long crmContactId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactLocalService.getCrmContact(crmContactId);
	}

	/**
	* Returns the CRM Contact matching the UUID and group.
	*
	* @param uuid the CRM Contact's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Contact
	* @throws PortalException if a matching CRM Contact could not be found
	*/
	@Override
	public contact.manager.model.CrmContact getCrmContactByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactLocalService.getCrmContactByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the CRM Contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmContact the CRM Contact
	* @return the CRM Contact that was updated
	*/
	@Override
	public contact.manager.model.CrmContact updateCrmContact(
		contact.manager.model.CrmContact crmContact) {
		return _crmContactLocalService.updateCrmContact(crmContact);
	}

	/**
	* Returns the number of CRM Contacts.
	*
	* @return the number of CRM Contacts
	*/
	@Override
	public int getCrmContactsCount() {
		return _crmContactLocalService.getCrmContactsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmContactLocalService.getOSGiServiceIdentifier();
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
		return _crmContactLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _crmContactLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _crmContactLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		int start, int end) {
		return _crmContactLocalService.getCrmContacts(start, end);
	}

	/**
	* Returns all the CRM Contacts matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Contacts
	* @param companyId the primary key of the company
	* @return the matching CRM Contacts, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmContactsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _crmContactLocalService.getCrmContactsByUuidAndCompanyId(uuid,
			companyId);
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
	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmContactsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		return _crmContactLocalService.getCrmContactsByUuidAndCompanyId(uuid,
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
		return _crmContactLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmContactLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public CrmContactLocalService getWrappedService() {
		return _crmContactLocalService;
	}

	@Override
	public void setWrappedService(CrmContactLocalService crmContactLocalService) {
		_crmContactLocalService = crmContactLocalService;
	}

	private CrmContactLocalService _crmContactLocalService;
}