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

import contact.manager.service.exception.NoSuchContactException;
import contact.manager.service.model.Contact;

/**
 * The persistence interface for the contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.ContactPersistenceImpl
 * @see ContactUtil
 * @generated
 */
@ProviderType
public interface ContactPersistence extends BasePersistence<Contact> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContactUtil} to access the contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the contact in the entity cache if it is enabled.
	*
	* @param contact the contact
	*/
	public void cacheResult(Contact contact);

	/**
	* Caches the contacts in the entity cache if it is enabled.
	*
	* @param contacts the contacts
	*/
	public void cacheResult(java.util.List<Contact> contacts);

	/**
	* Creates a new contact with the primary key. Does not add the contact to the database.
	*
	* @param contactId the primary key for the new contact
	* @return the new contact
	*/
	public Contact create(long contactId);

	/**
	* Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactId the primary key of the contact
	* @return the contact that was removed
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public Contact remove(long contactId) throws NoSuchContactException;

	public Contact updateImpl(Contact contact);

	/**
	* Returns the contact with the primary key or throws a {@link NoSuchContactException} if it could not be found.
	*
	* @param contactId the primary key of the contact
	* @return the contact
	* @throws NoSuchContactException if a contact with the primary key could not be found
	*/
	public Contact findByPrimaryKey(long contactId)
		throws NoSuchContactException;

	/**
	* Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param contactId the primary key of the contact
	* @return the contact, or <code>null</code> if a contact with the primary key could not be found
	*/
	public Contact fetchByPrimaryKey(long contactId);

	@Override
	public java.util.Map<java.io.Serializable, Contact> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the contacts.
	*
	* @return the contacts
	*/
	public java.util.List<Contact> findAll();

	/**
	* Returns a range of all the contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of contacts
	*/
	public java.util.List<Contact> findAll(int start, int end);

	/**
	* Returns an ordered range of all the contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contacts
	*/
	public java.util.List<Contact> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator);

	/**
	* Returns an ordered range of all the contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of contacts
	*/
	public java.util.List<Contact> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the contacts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of contacts.
	*
	* @return the number of contacts
	*/
	public int countAll();

	/**
	* Returns the primaryKeys of cmap tags associated with the contact.
	*
	* @param pk the primary key of the contact
	* @return long[] of the primaryKeys of cmap tags associated with the contact
	*/
	public long[] getCmapTagPrimaryKeys(long pk);

	/**
	* Returns all the cmap tags associated with the contact.
	*
	* @param pk the primary key of the contact
	* @return the cmap tags associated with the contact
	*/
	public java.util.List<contact.manager.service.model.CmapTag> getCmapTags(
		long pk);

	/**
	* Returns a range of all the cmap tags associated with the contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the contact
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of cmap tags associated with the contact
	*/
	public java.util.List<contact.manager.service.model.CmapTag> getCmapTags(
		long pk, int start, int end);

	/**
	* Returns an ordered range of all the cmap tags associated with the contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the contact
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cmap tags associated with the contact
	*/
	public java.util.List<contact.manager.service.model.CmapTag> getCmapTags(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.service.model.CmapTag> orderByComparator);

	/**
	* Returns the number of cmap tags associated with the contact.
	*
	* @param pk the primary key of the contact
	* @return the number of cmap tags associated with the contact
	*/
	public int getCmapTagsSize(long pk);

	/**
	* Returns <code>true</code> if the cmap tag is associated with the contact.
	*
	* @param pk the primary key of the contact
	* @param cmapTagPK the primary key of the cmap tag
	* @return <code>true</code> if the cmap tag is associated with the contact; <code>false</code> otherwise
	*/
	public boolean containsCmapTag(long pk, long cmapTagPK);

	/**
	* Returns <code>true</code> if the contact has any cmap tags associated with it.
	*
	* @param pk the primary key of the contact to check for associations with cmap tags
	* @return <code>true</code> if the contact has any cmap tags associated with it; <code>false</code> otherwise
	*/
	public boolean containsCmapTags(long pk);

	/**
	* Adds an association between the contact and the cmap tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTagPK the primary key of the cmap tag
	*/
	public void addCmapTag(long pk, long cmapTagPK);

	/**
	* Adds an association between the contact and the cmap tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTag the cmap tag
	*/
	public void addCmapTag(long pk,
		contact.manager.service.model.CmapTag cmapTag);

	/**
	* Adds an association between the contact and the cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTagPKs the primary keys of the cmap tags
	*/
	public void addCmapTags(long pk, long[] cmapTagPKs);

	/**
	* Adds an association between the contact and the cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTags the cmap tags
	*/
	public void addCmapTags(long pk,
		java.util.List<contact.manager.service.model.CmapTag> cmapTags);

	/**
	* Clears all associations between the contact and its cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact to clear the associated cmap tags from
	*/
	public void clearCmapTags(long pk);

	/**
	* Removes the association between the contact and the cmap tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTagPK the primary key of the cmap tag
	*/
	public void removeCmapTag(long pk, long cmapTagPK);

	/**
	* Removes the association between the contact and the cmap tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTag the cmap tag
	*/
	public void removeCmapTag(long pk,
		contact.manager.service.model.CmapTag cmapTag);

	/**
	* Removes the association between the contact and the cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTagPKs the primary keys of the cmap tags
	*/
	public void removeCmapTags(long pk, long[] cmapTagPKs);

	/**
	* Removes the association between the contact and the cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTags the cmap tags
	*/
	public void removeCmapTags(long pk,
		java.util.List<contact.manager.service.model.CmapTag> cmapTags);

	/**
	* Sets the cmap tags associated with the contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTagPKs the primary keys of the cmap tags to be associated with the contact
	*/
	public void setCmapTags(long pk, long[] cmapTagPKs);

	/**
	* Sets the cmap tags associated with the contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapTags the cmap tags to be associated with the contact
	*/
	public void setCmapTags(long pk,
		java.util.List<contact.manager.service.model.CmapTag> cmapTags);

	/**
	* Returns the primaryKeys of cmap sub groups associated with the contact.
	*
	* @param pk the primary key of the contact
	* @return long[] of the primaryKeys of cmap sub groups associated with the contact
	*/
	public long[] getCmapSubGroupPrimaryKeys(long pk);

	/**
	* Returns all the cmap sub groups associated with the contact.
	*
	* @param pk the primary key of the contact
	* @return the cmap sub groups associated with the contact
	*/
	public java.util.List<contact.manager.service.model.CmapSubGroup> getCmapSubGroups(
		long pk);

	/**
	* Returns a range of all the cmap sub groups associated with the contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the contact
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of cmap sub groups associated with the contact
	*/
	public java.util.List<contact.manager.service.model.CmapSubGroup> getCmapSubGroups(
		long pk, int start, int end);

	/**
	* Returns an ordered range of all the cmap sub groups associated with the contact.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the contact
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cmap sub groups associated with the contact
	*/
	public java.util.List<contact.manager.service.model.CmapSubGroup> getCmapSubGroups(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.service.model.CmapSubGroup> orderByComparator);

	/**
	* Returns the number of cmap sub groups associated with the contact.
	*
	* @param pk the primary key of the contact
	* @return the number of cmap sub groups associated with the contact
	*/
	public int getCmapSubGroupsSize(long pk);

	/**
	* Returns <code>true</code> if the cmap sub group is associated with the contact.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroupPK the primary key of the cmap sub group
	* @return <code>true</code> if the cmap sub group is associated with the contact; <code>false</code> otherwise
	*/
	public boolean containsCmapSubGroup(long pk, long cmapSubGroupPK);

	/**
	* Returns <code>true</code> if the contact has any cmap sub groups associated with it.
	*
	* @param pk the primary key of the contact to check for associations with cmap sub groups
	* @return <code>true</code> if the contact has any cmap sub groups associated with it; <code>false</code> otherwise
	*/
	public boolean containsCmapSubGroups(long pk);

	/**
	* Adds an association between the contact and the cmap sub group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroupPK the primary key of the cmap sub group
	*/
	public void addCmapSubGroup(long pk, long cmapSubGroupPK);

	/**
	* Adds an association between the contact and the cmap sub group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroup the cmap sub group
	*/
	public void addCmapSubGroup(long pk,
		contact.manager.service.model.CmapSubGroup cmapSubGroup);

	/**
	* Adds an association between the contact and the cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroupPKs the primary keys of the cmap sub groups
	*/
	public void addCmapSubGroups(long pk, long[] cmapSubGroupPKs);

	/**
	* Adds an association between the contact and the cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroups the cmap sub groups
	*/
	public void addCmapSubGroups(long pk,
		java.util.List<contact.manager.service.model.CmapSubGroup> cmapSubGroups);

	/**
	* Clears all associations between the contact and its cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact to clear the associated cmap sub groups from
	*/
	public void clearCmapSubGroups(long pk);

	/**
	* Removes the association between the contact and the cmap sub group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroupPK the primary key of the cmap sub group
	*/
	public void removeCmapSubGroup(long pk, long cmapSubGroupPK);

	/**
	* Removes the association between the contact and the cmap sub group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroup the cmap sub group
	*/
	public void removeCmapSubGroup(long pk,
		contact.manager.service.model.CmapSubGroup cmapSubGroup);

	/**
	* Removes the association between the contact and the cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroupPKs the primary keys of the cmap sub groups
	*/
	public void removeCmapSubGroups(long pk, long[] cmapSubGroupPKs);

	/**
	* Removes the association between the contact and the cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroups the cmap sub groups
	*/
	public void removeCmapSubGroups(long pk,
		java.util.List<contact.manager.service.model.CmapSubGroup> cmapSubGroups);

	/**
	* Sets the cmap sub groups associated with the contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroupPKs the primary keys of the cmap sub groups to be associated with the contact
	*/
	public void setCmapSubGroups(long pk, long[] cmapSubGroupPKs);

	/**
	* Sets the cmap sub groups associated with the contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the contact
	* @param cmapSubGroups the cmap sub groups to be associated with the contact
	*/
	public void setCmapSubGroups(long pk,
		java.util.List<contact.manager.service.model.CmapSubGroup> cmapSubGroups);
}