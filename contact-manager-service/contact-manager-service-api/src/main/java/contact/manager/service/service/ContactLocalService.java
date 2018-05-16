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

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.service.model.Contact;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Contact. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ContactLocalServiceUtil
 * @see contact.manager.service.service.base.ContactLocalServiceBaseImpl
 * @see contact.manager.service.service.impl.ContactLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ContactLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContactLocalServiceUtil} to access the contact local service. Add custom service methods to {@link contact.manager.service.service.impl.ContactLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCmapSubGroupContact(long subGroupId, long contactId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCmapSubGroupContacts(long subGroupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCmapTagContact(long tagId, long contactId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCmapTagContacts(long tagId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Adds the contact to the database. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Contact addContact(Contact contact);

	/**
	* Creates a new contact with the primary key. Does not add the contact to the database.
	*
	* @param contactId the primary key for the new contact
	* @return the new contact
	*/
	public Contact createContact(long contactId);

	/**
	* Deletes the contact from the database. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Contact deleteContact(Contact contact);

	/**
	* Deletes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactId the primary key of the contact
	* @return the contact that was removed
	* @throws PortalException if a contact with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Contact deleteContact(long contactId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Contact fetchContact(long contactId);

	/**
	* Returns the contact with the primary key.
	*
	* @param contactId the primary key of the contact
	* @return the contact
	* @throws PortalException if a contact with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Contact getContact(long contactId) throws PortalException;

	/**
	* Updates the contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Contact updateContact(Contact contact);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCmapSubGroupContactsCount(long subGroupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCmapTagContactsCount(long tagId);

	/**
	* Returns the number of contacts.
	*
	* @return the number of contacts
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getContactsCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Contact> getCmapSubGroupContacts(long subGroupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Contact> getCmapSubGroupContacts(long subGroupId, int start,
		int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Contact> getCmapSubGroupContacts(long subGroupId, int start,
		int end, OrderByComparator<Contact> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Contact> getCmapTagContacts(long tagId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Contact> getCmapTagContacts(long tagId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Contact> getCmapTagContacts(long tagId, int start, int end,
		OrderByComparator<Contact> orderByComparator);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Contact> getContacts(int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	/**
	* Returns the subGroupIds of the cmap sub groups associated with the contact.
	*
	* @param contactId the contactId of the contact
	* @return long[] the subGroupIds of cmap sub groups associated with the contact
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long[] getCmapSubGroupPrimaryKeys(long contactId);

	/**
	* Returns the tagIds of the cmap tags associated with the contact.
	*
	* @param contactId the contactId of the contact
	* @return long[] the tagIds of cmap tags associated with the contact
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long[] getCmapTagPrimaryKeys(long contactId);

	public void addCmapSubGroupContact(long subGroupId, Contact contact);

	public void addCmapSubGroupContact(long subGroupId, long contactId);

	public void addCmapSubGroupContacts(long subGroupId, List<Contact> contacts);

	public void addCmapSubGroupContacts(long subGroupId, long[] contactIds);

	public void addCmapTagContact(long tagId, Contact contact);

	public void addCmapTagContact(long tagId, long contactId);

	public void addCmapTagContacts(long tagId, List<Contact> contacts);

	public void addCmapTagContacts(long tagId, long[] contactIds);

	public void clearCmapSubGroupContacts(long subGroupId);

	public void clearCmapTagContacts(long tagId);

	public void deleteCmapSubGroupContact(long subGroupId, Contact contact);

	public void deleteCmapSubGroupContact(long subGroupId, long contactId);

	public void deleteCmapSubGroupContacts(long subGroupId,
		List<Contact> contacts);

	public void deleteCmapSubGroupContacts(long subGroupId, long[] contactIds);

	public void deleteCmapTagContact(long tagId, Contact contact);

	public void deleteCmapTagContact(long tagId, long contactId);

	public void deleteCmapTagContacts(long tagId, List<Contact> contacts);

	public void deleteCmapTagContacts(long tagId, long[] contactIds);

	public void setCmapSubGroupContacts(long subGroupId, long[] contactIds);

	public void setCmapTagContacts(long tagId, long[] contactIds);
}