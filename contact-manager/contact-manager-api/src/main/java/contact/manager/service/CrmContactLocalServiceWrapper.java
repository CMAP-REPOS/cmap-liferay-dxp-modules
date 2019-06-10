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
	* Adds the CRM Contact to the database. Also notifies the appropriate model listeners.
	*
	* @param crmContact the CRM Contact
	* @return the CRM Contact that was added
	* @throws PortalException
	*/
	@Override
	public contact.manager.model.CrmContact addCrmContact(
		contact.manager.model.CrmContact crmContact,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactLocalService.addCrmContact(crmContact, serviceContext);
	}

	@Override
	public void addCrmGroupCrmContact(long crmGroupId,
		contact.manager.model.CrmContact crmContact) {
		_crmContactLocalService.addCrmGroupCrmContact(crmGroupId, crmContact);
	}

	@Override
	public void addCrmGroupCrmContact(long crmGroupId, long crmContactId) {
		_crmContactLocalService.addCrmGroupCrmContact(crmGroupId, crmContactId);
	}

	@Override
	public void addCrmGroupCrmContacts(long crmGroupId,
		java.util.List<contact.manager.model.CrmContact> crmContacts) {
		_crmContactLocalService.addCrmGroupCrmContacts(crmGroupId, crmContacts);
	}

	@Override
	public void addCrmGroupCrmContacts(long crmGroupId, long[] crmContactIds) {
		_crmContactLocalService.addCrmGroupCrmContacts(crmGroupId, crmContactIds);
	}

	@Override
	public void addCrmTagCrmContact(long crmTagId,
		contact.manager.model.CrmContact crmContact) {
		_crmContactLocalService.addCrmTagCrmContact(crmTagId, crmContact);
	}

	@Override
	public void addCrmTagCrmContact(long crmTagId, long crmContactId) {
		_crmContactLocalService.addCrmTagCrmContact(crmTagId, crmContactId);
	}

	@Override
	public void addCrmTagCrmContacts(long crmTagId,
		java.util.List<contact.manager.model.CrmContact> crmContacts) {
		_crmContactLocalService.addCrmTagCrmContacts(crmTagId, crmContacts);
	}

	@Override
	public void addCrmTagCrmContacts(long crmTagId, long[] crmContactIds) {
		_crmContactLocalService.addCrmTagCrmContacts(crmTagId, crmContactIds);
	}

	@Override
	public void clearCrmGroupCrmContacts(long crmGroupId) {
		_crmContactLocalService.clearCrmGroupCrmContacts(crmGroupId);
	}

	@Override
	public void clearCrmTagCrmContacts(long crmTagId) {
		_crmContactLocalService.clearCrmTagCrmContacts(crmTagId);
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
	public contact.manager.model.CrmContact deleteCrmContact(
		long crmContactId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactLocalService.deleteCrmContact(crmContactId,
			serviceContext);
	}

	@Override
	public void deleteCrmGroupCrmContact(long crmGroupId,
		contact.manager.model.CrmContact crmContact) {
		_crmContactLocalService.deleteCrmGroupCrmContact(crmGroupId, crmContact);
	}

	@Override
	public void deleteCrmGroupCrmContact(long crmGroupId, long crmContactId) {
		_crmContactLocalService.deleteCrmGroupCrmContact(crmGroupId,
			crmContactId);
	}

	@Override
	public void deleteCrmGroupCrmContacts(long crmGroupId,
		java.util.List<contact.manager.model.CrmContact> crmContacts) {
		_crmContactLocalService.deleteCrmGroupCrmContacts(crmGroupId,
			crmContacts);
	}

	@Override
	public void deleteCrmGroupCrmContacts(long crmGroupId, long[] crmContactIds) {
		_crmContactLocalService.deleteCrmGroupCrmContacts(crmGroupId,
			crmContactIds);
	}

	@Override
	public void deleteCrmTagCrmContact(long crmTagId,
		contact.manager.model.CrmContact crmContact) {
		_crmContactLocalService.deleteCrmTagCrmContact(crmTagId, crmContact);
	}

	@Override
	public void deleteCrmTagCrmContact(long crmTagId, long crmContactId) {
		_crmContactLocalService.deleteCrmTagCrmContact(crmTagId, crmContactId);
	}

	@Override
	public void deleteCrmTagCrmContacts(long crmTagId,
		java.util.List<contact.manager.model.CrmContact> crmContacts) {
		_crmContactLocalService.deleteCrmTagCrmContacts(crmTagId, crmContacts);
	}

	@Override
	public void deleteCrmTagCrmContacts(long crmTagId, long[] crmContactIds) {
		_crmContactLocalService.deleteCrmTagCrmContacts(crmTagId, crmContactIds);
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
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmContactLocalService.dynamicQuery();
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
		String uuid, long groupId) {
		return _crmContactLocalService.fetchCrmContactByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public contact.manager.model.CrmContact findByConstantContactId(
		long constantContactId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.NoSuchContactException,
			contact.manager.exception.NoSuchCrmContactException {
		return _crmContactLocalService.findByConstantContactId(constantContactId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> findByPrimaryEmailAddress(
		String primaryEmailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactLocalService.findByPrimaryEmailAddress(primaryEmailAddress);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactLocalService.findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> findByStatus(
		String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactLocalService.findByStatus(status);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> findByVipFlag(
		boolean isVip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactLocalService.findByVipFlag(isVip);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmContactLocalService.getActionableDynamicQuery();
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
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactLocalService.getCrmContactByUuidAndGroupId(uuid,
			groupId);
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

	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmContactsByStatus(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactLocalService.getCrmContactsByStatus(status, start,
			end, obc);
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
		String uuid, long companyId) {
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
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		return _crmContactLocalService.getCrmContactsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
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

	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmGroupCrmContacts(
		long crmGroupId) {
		return _crmContactLocalService.getCrmGroupCrmContacts(crmGroupId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmGroupCrmContacts(
		long crmGroupId, int start, int end) {
		return _crmContactLocalService.getCrmGroupCrmContacts(crmGroupId,
			start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmGroupCrmContacts(
		long crmGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		return _crmContactLocalService.getCrmGroupCrmContacts(crmGroupId,
			start, end, orderByComparator);
	}

	@Override
	public int getCrmGroupCrmContactsCount(long crmGroupId) {
		return _crmContactLocalService.getCrmGroupCrmContactsCount(crmGroupId);
	}

	/**
	* Returns the crmGroupIds of the CRM Groups associated with the CRM Contact.
	*
	* @param crmContactId the crmContactId of the CRM Contact
	* @return long[] the crmGroupIds of CRM Groups associated with the CRM Contact
	*/
	@Override
	public long[] getCrmGroupPrimaryKeys(long crmContactId) {
		return _crmContactLocalService.getCrmGroupPrimaryKeys(crmContactId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmGroup> getCrmGroups(
		long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactLocalService.getCrmGroups(contactId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmTagCrmContacts(
		long crmTagId) {
		return _crmContactLocalService.getCrmTagCrmContacts(crmTagId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmTagCrmContacts(
		long crmTagId, int start, int end) {
		return _crmContactLocalService.getCrmTagCrmContacts(crmTagId, start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmTagCrmContacts(
		long crmTagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		return _crmContactLocalService.getCrmTagCrmContacts(crmTagId, start,
			end, orderByComparator);
	}

	@Override
	public int getCrmTagCrmContactsCount(long crmTagId) {
		return _crmContactLocalService.getCrmTagCrmContactsCount(crmTagId);
	}

	/**
	* Returns the crmTagIds of the CRM Tags associated with the CRM Contact.
	*
	* @param crmContactId the crmContactId of the CRM Contact
	* @return long[] the crmTagIds of CRM Tags associated with the CRM Contact
	*/
	@Override
	public long[] getCrmTagPrimaryKeys(long crmContactId) {
		return _crmContactLocalService.getCrmTagPrimaryKeys(crmContactId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmTag> getCrmTags(
		long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactLocalService.getCrmTags(contactId);
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
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _crmContactLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public boolean hasCrmGroupCrmContact(long crmGroupId, long crmContactId) {
		return _crmContactLocalService.hasCrmGroupCrmContact(crmGroupId,
			crmContactId);
	}

	@Override
	public boolean hasCrmGroupCrmContacts(long crmGroupId) {
		return _crmContactLocalService.hasCrmGroupCrmContacts(crmGroupId);
	}

	@Override
	public boolean hasCrmTagCrmContact(long crmTagId, long crmContactId) {
		return _crmContactLocalService.hasCrmTagCrmContact(crmTagId,
			crmContactId);
	}

	@Override
	public boolean hasCrmTagCrmContacts(long crmTagId) {
		return _crmContactLocalService.hasCrmTagCrmContacts(crmTagId);
	}

	@Override
	public void initCrmContactResourcePermissions(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_crmContactLocalService.initCrmContactResourcePermissions(companyId);
	}

	@Override
	public void initCrmContactResourcePermissions(
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		_crmContactLocalService.initCrmContactResourcePermissions(serviceContext);
	}

	@Override
	public void setCrmGroupCrmContacts(long crmGroupId, long[] crmContactIds) {
		_crmContactLocalService.setCrmGroupCrmContacts(crmGroupId, crmContactIds);
	}

	@Override
	public void setCrmGroups(long contactId, long[] groupIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_crmContactLocalService.setCrmGroups(contactId, groupIds);
	}

	@Override
	public void setCrmTagCrmContacts(long crmTagId, long[] crmContactIds) {
		_crmContactLocalService.setCrmTagCrmContacts(crmTagId, crmContactIds);
	}

	@Override
	public void setCrmTags(long contactId, long[] tagIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_crmContactLocalService.setCrmTags(contactId, tagIds);
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

	@Override
	public contact.manager.model.CrmContact updateCrmContact(
		contact.manager.model.CrmContact crmContact,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactLocalService.updateCrmContact(crmContact,
			serviceContext);
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