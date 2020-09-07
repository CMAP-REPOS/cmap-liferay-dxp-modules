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

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.NoSuchContactException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.exception.NoSuchCrmContactException;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.model.CrmTag;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for CrmContact. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface CrmContactLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmContactLocalServiceUtil} to access the CRM Contact local service. Add custom service methods to <code>contact.manager.service.impl.CrmContactLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the CRM Contact to the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmContact the CRM Contact
	 * @return the CRM Contact that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public CrmContact addCrmContact(CrmContact crmContact);

	/**
	 * Adds the CRM Contact to the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmContact the CRM Contact
	 * @return the CRM Contact that was added
	 * @throws PortalException
	 */
	@Indexable(type = IndexableType.REINDEX)
	public CrmContact addCrmContact(
			CrmContact crmContact, ServiceContext serviceContext)
		throws PortalException;

	public void addCrmGroupCrmContact(long crmGroupId, CrmContact crmContact);

	public void addCrmGroupCrmContact(long crmGroupId, long crmContactId);

	public void addCrmGroupCrmContacts(
		long crmGroupId, List<CrmContact> crmContacts);

	public void addCrmGroupCrmContacts(long crmGroupId, long[] crmContactIds);

	public void addCrmTagCrmContact(long crmTagId, CrmContact crmContact);

	public void addCrmTagCrmContact(long crmTagId, long crmContactId);

	public void addCrmTagCrmContacts(
		long crmTagId, List<CrmContact> crmContacts);

	public void addCrmTagCrmContacts(long crmTagId, long[] crmContactIds);

	public void clearCrmGroupCrmContacts(long crmGroupId);

	public void clearCrmTagCrmContacts(long crmTagId);

	/**
	 * Creates a new CRM Contact with the primary key. Does not add the CRM Contact to the database.
	 *
	 * @param crmContactId the primary key for the new CRM Contact
	 * @return the new CRM Contact
	 */
	@Transactional(enabled = false)
	public CrmContact createCrmContact(long crmContactId);

	/**
	 * Deletes the CRM Contact from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmContact the CRM Contact
	 * @return the CRM Contact that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public CrmContact deleteCrmContact(CrmContact crmContact);

	/**
	 * Deletes the CRM Contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmContactId the primary key of the CRM Contact
	 * @return the CRM Contact that was removed
	 * @throws PortalException if a CRM Contact with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public CrmContact deleteCrmContact(long crmContactId)
		throws PortalException;

	@Indexable(type = IndexableType.DELETE)
	public CrmContact deleteCrmContact(
			long crmContactId, ServiceContext serviceContext)
		throws PortalException;

	public void deleteCrmGroupCrmContact(
		long crmGroupId, CrmContact crmContact);

	public void deleteCrmGroupCrmContact(long crmGroupId, long crmContactId);

	public void deleteCrmGroupCrmContacts(
		long crmGroupId, List<CrmContact> crmContacts);

	public void deleteCrmGroupCrmContacts(
		long crmGroupId, long[] crmContactIds);

	public void deleteCrmTagCrmContact(long crmTagId, CrmContact crmContact);

	public void deleteCrmTagCrmContact(long crmTagId, long crmContactId);

	public void deleteCrmTagCrmContacts(
		long crmTagId, List<CrmContact> crmContacts);

	public void deleteCrmTagCrmContacts(long crmTagId, long[] crmContactIds);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmContactModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmContactModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmContact fetchCrmContact(long crmContactId);

	/**
	 * Returns the CRM Contact matching the UUID and group.
	 *
	 * @param uuid the CRM Contact's UUID
	 * @param groupId the primary key of the group
	 * @return the matching CRM Contact, or <code>null</code> if a matching CRM Contact could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmContact fetchCrmContactByUuidAndGroupId(
		String uuid, long groupId);

	public CrmContact findByConstantContactId(long constantContactId)
		throws NoSuchContactException, NoSuchCrmContactException,
			   SystemException;

	public List<CrmContact> findByPrimaryEmailAddress(
			String primaryEmailAddress)
		throws SystemException;

	public List<CrmContact> findByPrimaryEmailAddressAndStatus(
			String primaryEmailAddress, String status)
		throws SystemException;

	public List<CrmContact> findByStatus(String status) throws SystemException;

	public List<CrmContact> findByVipFlag(boolean isVip) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the CRM Contact with the primary key.
	 *
	 * @param crmContactId the primary key of the CRM Contact
	 * @return the CRM Contact
	 * @throws PortalException if a CRM Contact with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmContact getCrmContact(long crmContactId) throws PortalException;

	/**
	 * Returns the CRM Contact matching the UUID and group.
	 *
	 * @param uuid the CRM Contact's UUID
	 * @param groupId the primary key of the group
	 * @return the matching CRM Contact
	 * @throws PortalException if a matching CRM Contact could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmContact getCrmContactByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the CRM Contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>contact.manager.model.impl.CrmContactModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Contacts
	 * @param end the upper bound of the range of CRM Contacts (not inclusive)
	 * @return the range of CRM Contacts
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContact> getCrmContacts(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContact> getCrmContactsByStatus(
			String status, int start, int end, OrderByComparator obc)
		throws SystemException;

	/**
	 * Returns all the CRM Contacts matching the UUID and company.
	 *
	 * @param uuid the UUID of the CRM Contacts
	 * @param companyId the primary key of the company
	 * @return the matching CRM Contacts, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContact> getCrmContactsByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContact> getCrmContactsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmContact> orderByComparator);

	/**
	 * Returns the number of CRM Contacts.
	 *
	 * @return the number of CRM Contacts
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCrmContactsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContact> getCrmGroupCrmContacts(long crmGroupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContact> getCrmGroupCrmContacts(
		long crmGroupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContact> getCrmGroupCrmContacts(
		long crmGroupId, int start, int end,
		OrderByComparator<CrmContact> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCrmGroupCrmContactsCount(long crmGroupId);

	/**
	 * Returns the crmGroupIds of the CRM Groups associated with the CRM Contact.
	 *
	 * @param crmContactId the crmContactId of the CRM Contact
	 * @return long[] the crmGroupIds of CRM Groups associated with the CRM Contact
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long[] getCrmGroupPrimaryKeys(long crmContactId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmGroup> getCrmGroups(long contactId) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContact> getCrmTagCrmContacts(long crmTagId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContact> getCrmTagCrmContacts(
		long crmTagId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContact> getCrmTagCrmContacts(
		long crmTagId, int start, int end,
		OrderByComparator<CrmContact> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCrmTagCrmContactsCount(long crmTagId);

	/**
	 * Returns the crmTagIds of the CRM Tags associated with the CRM Contact.
	 *
	 * @param crmContactId the crmContactId of the CRM Contact
	 * @return long[] the crmTagIds of CRM Tags associated with the CRM Contact
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long[] getCrmTagPrimaryKeys(long crmContactId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmTag> getCrmTags(long contactId) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCrmGroupCrmContact(long crmGroupId, long crmContactId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCrmGroupCrmContacts(long crmGroupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCrmTagCrmContact(long crmTagId, long crmContactId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCrmTagCrmContacts(long crmTagId);

	public void initCrmContactResourcePermissions(long companyId)
		throws PortalException;

	public void initCrmContactResourcePermissions(ServiceContext serviceContext)
		throws PortalException;

	public void setCrmGroupCrmContacts(long crmGroupId, long[] crmContactIds);

	public void setCrmGroups(long contactId, long[] groupIds)
		throws SystemException;

	public void setCrmTagCrmContacts(long crmTagId, long[] crmContactIds);

	public void setCrmTags(long contactId, long[] tagIds)
		throws SystemException;

	/**
	 * Updates the CRM Contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param crmContact the CRM Contact
	 * @return the CRM Contact that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public CrmContact updateCrmContact(CrmContact crmContact);

	@Indexable(type = IndexableType.REINDEX)
	public CrmContact updateCrmContact(
			CrmContact crmContact, ServiceContext serviceContext)
		throws PortalException;

}