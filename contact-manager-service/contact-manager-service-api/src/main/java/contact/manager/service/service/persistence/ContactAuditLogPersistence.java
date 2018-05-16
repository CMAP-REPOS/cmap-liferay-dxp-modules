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

import contact.manager.service.exception.NoSuchContactAuditLogException;
import contact.manager.service.model.ContactAuditLog;

/**
 * The persistence interface for the contact audit log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.ContactAuditLogPersistenceImpl
 * @see ContactAuditLogUtil
 * @generated
 */
@ProviderType
public interface ContactAuditLogPersistence extends BasePersistence<ContactAuditLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContactAuditLogUtil} to access the contact audit log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the contact audit logs where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @return the matching contact audit logs
	*/
	public java.util.List<ContactAuditLog> findByConstantContactId(
		long constantContactId);

	/**
	* Returns a range of all the contact audit logs where constantContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param constantContactId the constant contact ID
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @return the range of matching contact audit logs
	*/
	public java.util.List<ContactAuditLog> findByConstantContactId(
		long constantContactId, int start, int end);

	/**
	* Returns an ordered range of all the contact audit logs where constantContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param constantContactId the constant contact ID
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contact audit logs
	*/
	public java.util.List<ContactAuditLog> findByConstantContactId(
		long constantContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator);

	/**
	* Returns an ordered range of all the contact audit logs where constantContactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param constantContactId the constant contact ID
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching contact audit logs
	*/
	public java.util.List<ContactAuditLog> findByConstantContactId(
		long constantContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first contact audit log in the ordered set where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact audit log
	* @throws NoSuchContactAuditLogException if a matching contact audit log could not be found
	*/
	public ContactAuditLog findByConstantContactId_First(
		long constantContactId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator)
		throws NoSuchContactAuditLogException;

	/**
	* Returns the first contact audit log in the ordered set where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact audit log, or <code>null</code> if a matching contact audit log could not be found
	*/
	public ContactAuditLog fetchByConstantContactId_First(
		long constantContactId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator);

	/**
	* Returns the last contact audit log in the ordered set where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact audit log
	* @throws NoSuchContactAuditLogException if a matching contact audit log could not be found
	*/
	public ContactAuditLog findByConstantContactId_Last(
		long constantContactId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator)
		throws NoSuchContactAuditLogException;

	/**
	* Returns the last contact audit log in the ordered set where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact audit log, or <code>null</code> if a matching contact audit log could not be found
	*/
	public ContactAuditLog fetchByConstantContactId_Last(
		long constantContactId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator);

	/**
	* Returns the contact audit logs before and after the current contact audit log in the ordered set where constantContactId = &#63;.
	*
	* @param contactAuditLogId the primary key of the current contact audit log
	* @param constantContactId the constant contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact audit log
	* @throws NoSuchContactAuditLogException if a contact audit log with the primary key could not be found
	*/
	public ContactAuditLog[] findByConstantContactId_PrevAndNext(
		long contactAuditLogId, long constantContactId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator)
		throws NoSuchContactAuditLogException;

	/**
	* Removes all the contact audit logs where constantContactId = &#63; from the database.
	*
	* @param constantContactId the constant contact ID
	*/
	public void removeByConstantContactId(long constantContactId);

	/**
	* Returns the number of contact audit logs where constantContactId = &#63;.
	*
	* @param constantContactId the constant contact ID
	* @return the number of matching contact audit logs
	*/
	public int countByConstantContactId(long constantContactId);

	/**
	* Returns all the contact audit logs where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @return the matching contact audit logs
	*/
	public java.util.List<ContactAuditLog> findByContactId(long contactId);

	/**
	* Returns a range of all the contact audit logs where contactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactId the contact ID
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @return the range of matching contact audit logs
	*/
	public java.util.List<ContactAuditLog> findByContactId(long contactId,
		int start, int end);

	/**
	* Returns an ordered range of all the contact audit logs where contactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactId the contact ID
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contact audit logs
	*/
	public java.util.List<ContactAuditLog> findByContactId(long contactId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator);

	/**
	* Returns an ordered range of all the contact audit logs where contactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactId the contact ID
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching contact audit logs
	*/
	public java.util.List<ContactAuditLog> findByContactId(long contactId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first contact audit log in the ordered set where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact audit log
	* @throws NoSuchContactAuditLogException if a matching contact audit log could not be found
	*/
	public ContactAuditLog findByContactId_First(long contactId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator)
		throws NoSuchContactAuditLogException;

	/**
	* Returns the first contact audit log in the ordered set where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact audit log, or <code>null</code> if a matching contact audit log could not be found
	*/
	public ContactAuditLog fetchByContactId_First(long contactId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator);

	/**
	* Returns the last contact audit log in the ordered set where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact audit log
	* @throws NoSuchContactAuditLogException if a matching contact audit log could not be found
	*/
	public ContactAuditLog findByContactId_Last(long contactId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator)
		throws NoSuchContactAuditLogException;

	/**
	* Returns the last contact audit log in the ordered set where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact audit log, or <code>null</code> if a matching contact audit log could not be found
	*/
	public ContactAuditLog fetchByContactId_Last(long contactId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator);

	/**
	* Returns the contact audit logs before and after the current contact audit log in the ordered set where contactId = &#63;.
	*
	* @param contactAuditLogId the primary key of the current contact audit log
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact audit log
	* @throws NoSuchContactAuditLogException if a contact audit log with the primary key could not be found
	*/
	public ContactAuditLog[] findByContactId_PrevAndNext(
		long contactAuditLogId, long contactId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator)
		throws NoSuchContactAuditLogException;

	/**
	* Removes all the contact audit logs where contactId = &#63; from the database.
	*
	* @param contactId the contact ID
	*/
	public void removeByContactId(long contactId);

	/**
	* Returns the number of contact audit logs where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @return the number of matching contact audit logs
	*/
	public int countByContactId(long contactId);

	/**
	* Caches the contact audit log in the entity cache if it is enabled.
	*
	* @param contactAuditLog the contact audit log
	*/
	public void cacheResult(ContactAuditLog contactAuditLog);

	/**
	* Caches the contact audit logs in the entity cache if it is enabled.
	*
	* @param contactAuditLogs the contact audit logs
	*/
	public void cacheResult(java.util.List<ContactAuditLog> contactAuditLogs);

	/**
	* Creates a new contact audit log with the primary key. Does not add the contact audit log to the database.
	*
	* @param contactAuditLogId the primary key for the new contact audit log
	* @return the new contact audit log
	*/
	public ContactAuditLog create(long contactAuditLogId);

	/**
	* Removes the contact audit log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactAuditLogId the primary key of the contact audit log
	* @return the contact audit log that was removed
	* @throws NoSuchContactAuditLogException if a contact audit log with the primary key could not be found
	*/
	public ContactAuditLog remove(long contactAuditLogId)
		throws NoSuchContactAuditLogException;

	public ContactAuditLog updateImpl(ContactAuditLog contactAuditLog);

	/**
	* Returns the contact audit log with the primary key or throws a {@link NoSuchContactAuditLogException} if it could not be found.
	*
	* @param contactAuditLogId the primary key of the contact audit log
	* @return the contact audit log
	* @throws NoSuchContactAuditLogException if a contact audit log with the primary key could not be found
	*/
	public ContactAuditLog findByPrimaryKey(long contactAuditLogId)
		throws NoSuchContactAuditLogException;

	/**
	* Returns the contact audit log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param contactAuditLogId the primary key of the contact audit log
	* @return the contact audit log, or <code>null</code> if a contact audit log with the primary key could not be found
	*/
	public ContactAuditLog fetchByPrimaryKey(long contactAuditLogId);

	@Override
	public java.util.Map<java.io.Serializable, ContactAuditLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the contact audit logs.
	*
	* @return the contact audit logs
	*/
	public java.util.List<ContactAuditLog> findAll();

	/**
	* Returns a range of all the contact audit logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @return the range of contact audit logs
	*/
	public java.util.List<ContactAuditLog> findAll(int start, int end);

	/**
	* Returns an ordered range of all the contact audit logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contact audit logs
	*/
	public java.util.List<ContactAuditLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator);

	/**
	* Returns an ordered range of all the contact audit logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contact audit logs
	* @param end the upper bound of the range of contact audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of contact audit logs
	*/
	public java.util.List<ContactAuditLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the contact audit logs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of contact audit logs.
	*
	* @return the number of contact audit logs
	*/
	public int countAll();
}