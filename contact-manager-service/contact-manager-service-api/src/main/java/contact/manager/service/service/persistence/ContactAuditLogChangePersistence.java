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

import contact.manager.service.exception.NoSuchContactAuditLogChangeException;
import contact.manager.service.model.ContactAuditLogChange;

/**
 * The persistence interface for the contact audit log change service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.ContactAuditLogChangePersistenceImpl
 * @see ContactAuditLogChangeUtil
 * @generated
 */
@ProviderType
public interface ContactAuditLogChangePersistence extends BasePersistence<ContactAuditLogChange> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContactAuditLogChangeUtil} to access the contact audit log change persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the contact audit log changes where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogId the contact audit log ID
	* @return the matching contact audit log changes
	*/
	public java.util.List<ContactAuditLogChange> findByContactAuditLogId(
		long contactAuditLogId);

	/**
	* Returns a range of all the contact audit log changes where contactAuditLogId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactAuditLogId the contact audit log ID
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @return the range of matching contact audit log changes
	*/
	public java.util.List<ContactAuditLogChange> findByContactAuditLogId(
		long contactAuditLogId, int start, int end);

	/**
	* Returns an ordered range of all the contact audit log changes where contactAuditLogId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactAuditLogId the contact audit log ID
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contact audit log changes
	*/
	public java.util.List<ContactAuditLogChange> findByContactAuditLogId(
		long contactAuditLogId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLogChange> orderByComparator);

	/**
	* Returns an ordered range of all the contact audit log changes where contactAuditLogId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactAuditLogId the contact audit log ID
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching contact audit log changes
	*/
	public java.util.List<ContactAuditLogChange> findByContactAuditLogId(
		long contactAuditLogId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLogChange> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first contact audit log change in the ordered set where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogId the contact audit log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact audit log change
	* @throws NoSuchContactAuditLogChangeException if a matching contact audit log change could not be found
	*/
	public ContactAuditLogChange findByContactAuditLogId_First(
		long contactAuditLogId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLogChange> orderByComparator)
		throws NoSuchContactAuditLogChangeException;

	/**
	* Returns the first contact audit log change in the ordered set where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogId the contact audit log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact audit log change, or <code>null</code> if a matching contact audit log change could not be found
	*/
	public ContactAuditLogChange fetchByContactAuditLogId_First(
		long contactAuditLogId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLogChange> orderByComparator);

	/**
	* Returns the last contact audit log change in the ordered set where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogId the contact audit log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact audit log change
	* @throws NoSuchContactAuditLogChangeException if a matching contact audit log change could not be found
	*/
	public ContactAuditLogChange findByContactAuditLogId_Last(
		long contactAuditLogId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLogChange> orderByComparator)
		throws NoSuchContactAuditLogChangeException;

	/**
	* Returns the last contact audit log change in the ordered set where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogId the contact audit log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact audit log change, or <code>null</code> if a matching contact audit log change could not be found
	*/
	public ContactAuditLogChange fetchByContactAuditLogId_Last(
		long contactAuditLogId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLogChange> orderByComparator);

	/**
	* Returns the contact audit log changes before and after the current contact audit log change in the ordered set where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogChangeId the primary key of the current contact audit log change
	* @param contactAuditLogId the contact audit log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact audit log change
	* @throws NoSuchContactAuditLogChangeException if a contact audit log change with the primary key could not be found
	*/
	public ContactAuditLogChange[] findByContactAuditLogId_PrevAndNext(
		long contactAuditLogChangeId, long contactAuditLogId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLogChange> orderByComparator)
		throws NoSuchContactAuditLogChangeException;

	/**
	* Removes all the contact audit log changes where contactAuditLogId = &#63; from the database.
	*
	* @param contactAuditLogId the contact audit log ID
	*/
	public void removeByContactAuditLogId(long contactAuditLogId);

	/**
	* Returns the number of contact audit log changes where contactAuditLogId = &#63;.
	*
	* @param contactAuditLogId the contact audit log ID
	* @return the number of matching contact audit log changes
	*/
	public int countByContactAuditLogId(long contactAuditLogId);

	/**
	* Caches the contact audit log change in the entity cache if it is enabled.
	*
	* @param contactAuditLogChange the contact audit log change
	*/
	public void cacheResult(ContactAuditLogChange contactAuditLogChange);

	/**
	* Caches the contact audit log changes in the entity cache if it is enabled.
	*
	* @param contactAuditLogChanges the contact audit log changes
	*/
	public void cacheResult(
		java.util.List<ContactAuditLogChange> contactAuditLogChanges);

	/**
	* Creates a new contact audit log change with the primary key. Does not add the contact audit log change to the database.
	*
	* @param contactAuditLogChangeId the primary key for the new contact audit log change
	* @return the new contact audit log change
	*/
	public ContactAuditLogChange create(long contactAuditLogChangeId);

	/**
	* Removes the contact audit log change with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogChangeId the primary key of the contact audit log change
	* @return the contact audit log change that was removed
	* @throws NoSuchContactAuditLogChangeException if a contact audit log change with the primary key could not be found
	*/
	public ContactAuditLogChange remove(long contactAuditLogChangeId)
		throws NoSuchContactAuditLogChangeException;

	public ContactAuditLogChange updateImpl(
		ContactAuditLogChange contactAuditLogChange);

	/**
	* Returns the contact audit log change with the primary key or throws a {@link NoSuchContactAuditLogChangeException} if it could not be found.
	*
	* @param contactAuditLogChangeId the primary key of the contact audit log change
	* @return the contact audit log change
	* @throws NoSuchContactAuditLogChangeException if a contact audit log change with the primary key could not be found
	*/
	public ContactAuditLogChange findByPrimaryKey(long contactAuditLogChangeId)
		throws NoSuchContactAuditLogChangeException;

	/**
	* Returns the contact audit log change with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param contactAuditLogChangeId the primary key of the contact audit log change
	* @return the contact audit log change, or <code>null</code> if a contact audit log change with the primary key could not be found
	*/
	public ContactAuditLogChange fetchByPrimaryKey(long contactAuditLogChangeId);

	@Override
	public java.util.Map<java.io.Serializable, ContactAuditLogChange> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the contact audit log changes.
	*
	* @return the contact audit log changes
	*/
	public java.util.List<ContactAuditLogChange> findAll();

	/**
	* Returns a range of all the contact audit log changes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @return the range of contact audit log changes
	*/
	public java.util.List<ContactAuditLogChange> findAll(int start, int end);

	/**
	* Returns an ordered range of all the contact audit log changes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contact audit log changes
	*/
	public java.util.List<ContactAuditLogChange> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLogChange> orderByComparator);

	/**
	* Returns an ordered range of all the contact audit log changes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogChangeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit log changes
	* @param end the upper bound of the range of contact audit log changes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of contact audit log changes
	*/
	public java.util.List<ContactAuditLogChange> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLogChange> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the contact audit log changes from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of contact audit log changes.
	*
	* @return the number of contact audit log changes
	*/
	public int countAll();
}