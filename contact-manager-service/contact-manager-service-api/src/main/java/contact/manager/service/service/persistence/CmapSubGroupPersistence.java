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

package contact.manager.service.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import contact.manager.service.exception.NoSuchCmapSubGroupException;
import contact.manager.service.model.CmapSubGroup;

/**
 * The persistence interface for the cmap sub group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.CmapSubGroupPersistenceImpl
 * @see CmapSubGroupUtil
 * @generated
 */
@ProviderType
public interface CmapSubGroupPersistence extends BasePersistence<CmapSubGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CmapSubGroupUtil} to access the cmap sub group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the cmap sub group in the entity cache if it is enabled.
	*
	* @param cmapSubGroup the cmap sub group
	*/
	public void cacheResult(CmapSubGroup cmapSubGroup);

	/**
	* Caches the cmap sub groups in the entity cache if it is enabled.
	*
	* @param cmapSubGroups the cmap sub groups
	*/
	public void cacheResult(java.util.List<CmapSubGroup> cmapSubGroups);

	/**
	* Creates a new cmap sub group with the primary key. Does not add the cmap sub group to the database.
	*
	* @param subGroupId the primary key for the new cmap sub group
	* @return the new cmap sub group
	*/
	public CmapSubGroup create(long subGroupId);

	/**
	* Removes the cmap sub group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subGroupId the primary key of the cmap sub group
	* @return the cmap sub group that was removed
	* @throws NoSuchCmapSubGroupException if a cmap sub group with the primary key could not be found
	*/
	public CmapSubGroup remove(long subGroupId)
		throws NoSuchCmapSubGroupException;

	public CmapSubGroup updateImpl(CmapSubGroup cmapSubGroup);

	/**
	* Returns the cmap sub group with the primary key or throws a {@link NoSuchCmapSubGroupException} if it could not be found.
	*
	* @param subGroupId the primary key of the cmap sub group
	* @return the cmap sub group
	* @throws NoSuchCmapSubGroupException if a cmap sub group with the primary key could not be found
	*/
	public CmapSubGroup findByPrimaryKey(long subGroupId)
		throws NoSuchCmapSubGroupException;

	/**
	* Returns the cmap sub group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subGroupId the primary key of the cmap sub group
	* @return the cmap sub group, or <code>null</code> if a cmap sub group with the primary key could not be found
	*/
	public CmapSubGroup fetchByPrimaryKey(long subGroupId);

	@Override
	public java.util.Map<java.io.Serializable, CmapSubGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the cmap sub groups.
	*
	* @return the cmap sub groups
	*/
	public java.util.List<CmapSubGroup> findAll();

	/**
	* Returns a range of all the cmap sub groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap sub groups
	* @param end the upper bound of the range of cmap sub groups (not inclusive)
	* @return the range of cmap sub groups
	*/
	public java.util.List<CmapSubGroup> findAll(int start, int end);

	/**
	* Returns an ordered range of all the cmap sub groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap sub groups
	* @param end the upper bound of the range of cmap sub groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cmap sub groups
	*/
	public java.util.List<CmapSubGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CmapSubGroup> orderByComparator);

	/**
	* Returns an ordered range of all the cmap sub groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap sub groups
	* @param end the upper bound of the range of cmap sub groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of cmap sub groups
	*/
	public java.util.List<CmapSubGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CmapSubGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the cmap sub groups from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of cmap sub groups.
	*
	* @return the number of cmap sub groups
	*/
	public int countAll();

	/**
	* Returns the primaryKeys of contacts associated with the cmap sub group.
	*
	* @param pk the primary key of the cmap sub group
	* @return long[] of the primaryKeys of contacts associated with the cmap sub group
	*/
	public long[] getContactPrimaryKeys(long pk);

	/**
	* Returns all the contacts associated with the cmap sub group.
	*
	* @param pk the primary key of the cmap sub group
	* @return the contacts associated with the cmap sub group
	*/
	public java.util.List<contact.manager.service.model.Contact> getContacts(
		long pk);

	/**
	* Returns a range of all the contacts associated with the cmap sub group.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the cmap sub group
	* @param start the lower bound of the range of cmap sub groups
	* @param end the upper bound of the range of cmap sub groups (not inclusive)
	* @return the range of contacts associated with the cmap sub group
	*/
	public java.util.List<contact.manager.service.model.Contact> getContacts(
		long pk, int start, int end);

	/**
	* Returns an ordered range of all the contacts associated with the cmap sub group.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the cmap sub group
	* @param start the lower bound of the range of cmap sub groups
	* @param end the upper bound of the range of cmap sub groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contacts associated with the cmap sub group
	*/
	public java.util.List<contact.manager.service.model.Contact> getContacts(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.service.model.Contact> orderByComparator);

	/**
	* Returns the number of contacts associated with the cmap sub group.
	*
	* @param pk the primary key of the cmap sub group
	* @return the number of contacts associated with the cmap sub group
	*/
	public int getContactsSize(long pk);

	/**
	* Returns <code>true</code> if the contact is associated with the cmap sub group.
	*
	* @param pk the primary key of the cmap sub group
	* @param contactPK the primary key of the contact
	* @return <code>true</code> if the contact is associated with the cmap sub group; <code>false</code> otherwise
	*/
	public boolean containsContact(long pk, long contactPK);

	/**
	* Returns <code>true</code> if the cmap sub group has any contacts associated with it.
	*
	* @param pk the primary key of the cmap sub group to check for associations with contacts
	* @return <code>true</code> if the cmap sub group has any contacts associated with it; <code>false</code> otherwise
	*/
	public boolean containsContacts(long pk);

	/**
	* Adds an association between the cmap sub group and the contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the cmap sub group
	* @param contactPK the primary key of the contact
	*/
	public void addContact(long pk, long contactPK);

	/**
	* Adds an association between the cmap sub group and the contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the cmap sub group
	* @param contact the contact
	*/
	public void addContact(long pk,
		contact.manager.service.model.Contact contact);

	/**
	* Adds an association between the cmap sub group and the contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the cmap sub group
	* @param contactPKs the primary keys of the contacts
	*/
	public void addContacts(long pk, long[] contactPKs);

	/**
	* Adds an association between the cmap sub group and the contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the cmap sub group
	* @param contacts the contacts
	*/
	public void addContacts(long pk,
		java.util.List<contact.manager.service.model.Contact> contacts);

	/**
	* Clears all associations between the cmap sub group and its contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the cmap sub group to clear the associated contacts from
	*/
	public void clearContacts(long pk);

	/**
	* Removes the association between the cmap sub group and the contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the cmap sub group
	* @param contactPK the primary key of the contact
	*/
	public void removeContact(long pk, long contactPK);

	/**
	* Removes the association between the cmap sub group and the contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the cmap sub group
	* @param contact the contact
	*/
	public void removeContact(long pk,
		contact.manager.service.model.Contact contact);

	/**
	* Removes the association between the cmap sub group and the contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the cmap sub group
	* @param contactPKs the primary keys of the contacts
	*/
	public void removeContacts(long pk, long[] contactPKs);

	/**
	* Removes the association between the cmap sub group and the contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the cmap sub group
	* @param contacts the contacts
	*/
	public void removeContacts(long pk,
		java.util.List<contact.manager.service.model.Contact> contacts);

	/**
	* Sets the contacts associated with the cmap sub group, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the cmap sub group
	* @param contactPKs the primary keys of the contacts to be associated with the cmap sub group
	*/
	public void setContacts(long pk, long[] contactPKs);

	/**
	* Sets the contacts associated with the cmap sub group, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the cmap sub group
	* @param contacts the contacts to be associated with the cmap sub group
	*/
	public void setContacts(long pk,
		java.util.List<contact.manager.service.model.Contact> contacts);
}