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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.service.model.Note;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the note service. This utility wraps {@link contact.manager.service.service.persistence.impl.NotePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NotePersistence
 * @see contact.manager.service.service.persistence.impl.NotePersistenceImpl
 * @generated
 */
@ProviderType
public class NoteUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Note note) {
		getPersistence().clearCache(note);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Note> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Note> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Note> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Note> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Note update(Note note) {
		return getPersistence().update(note);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Note update(Note note, ServiceContext serviceContext) {
		return getPersistence().update(note, serviceContext);
	}

	/**
	* Returns all the notes where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @return the matching notes
	*/
	public static List<Note> findByContactId(long contactId) {
		return getPersistence().findByContactId(contactId);
	}

	/**
	* Returns a range of all the notes where contactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactId the contact ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @return the range of matching notes
	*/
	public static List<Note> findByContactId(long contactId, int start, int end) {
		return getPersistence().findByContactId(contactId, start, end);
	}

	/**
	* Returns an ordered range of all the notes where contactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactId the contact ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching notes
	*/
	public static List<Note> findByContactId(long contactId, int start,
		int end, OrderByComparator<Note> orderByComparator) {
		return getPersistence()
				   .findByContactId(contactId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the notes where contactId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactId the contact ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching notes
	*/
	public static List<Note> findByContactId(long contactId, int start,
		int end, OrderByComparator<Note> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByContactId(contactId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first note in the ordered set where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching note
	* @throws NoSuchNoteException if a matching note could not be found
	*/
	public static Note findByContactId_First(long contactId,
		OrderByComparator<Note> orderByComparator)
		throws contact.manager.service.exception.NoSuchNoteException {
		return getPersistence()
				   .findByContactId_First(contactId, orderByComparator);
	}

	/**
	* Returns the first note in the ordered set where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching note, or <code>null</code> if a matching note could not be found
	*/
	public static Note fetchByContactId_First(long contactId,
		OrderByComparator<Note> orderByComparator) {
		return getPersistence()
				   .fetchByContactId_First(contactId, orderByComparator);
	}

	/**
	* Returns the last note in the ordered set where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching note
	* @throws NoSuchNoteException if a matching note could not be found
	*/
	public static Note findByContactId_Last(long contactId,
		OrderByComparator<Note> orderByComparator)
		throws contact.manager.service.exception.NoSuchNoteException {
		return getPersistence()
				   .findByContactId_Last(contactId, orderByComparator);
	}

	/**
	* Returns the last note in the ordered set where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching note, or <code>null</code> if a matching note could not be found
	*/
	public static Note fetchByContactId_Last(long contactId,
		OrderByComparator<Note> orderByComparator) {
		return getPersistence()
				   .fetchByContactId_Last(contactId, orderByComparator);
	}

	/**
	* Returns the notes before and after the current note in the ordered set where contactId = &#63;.
	*
	* @param id the primary key of the current note
	* @param contactId the contact ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next note
	* @throws NoSuchNoteException if a note with the primary key could not be found
	*/
	public static Note[] findByContactId_PrevAndNext(long id, long contactId,
		OrderByComparator<Note> orderByComparator)
		throws contact.manager.service.exception.NoSuchNoteException {
		return getPersistence()
				   .findByContactId_PrevAndNext(id, contactId, orderByComparator);
	}

	/**
	* Removes all the notes where contactId = &#63; from the database.
	*
	* @param contactId the contact ID
	*/
	public static void removeByContactId(long contactId) {
		getPersistence().removeByContactId(contactId);
	}

	/**
	* Returns the number of notes where contactId = &#63;.
	*
	* @param contactId the contact ID
	* @return the number of matching notes
	*/
	public static int countByContactId(long contactId) {
		return getPersistence().countByContactId(contactId);
	}

	/**
	* Caches the note in the entity cache if it is enabled.
	*
	* @param note the note
	*/
	public static void cacheResult(Note note) {
		getPersistence().cacheResult(note);
	}

	/**
	* Caches the notes in the entity cache if it is enabled.
	*
	* @param notes the notes
	*/
	public static void cacheResult(List<Note> notes) {
		getPersistence().cacheResult(notes);
	}

	/**
	* Creates a new note with the primary key. Does not add the note to the database.
	*
	* @param id the primary key for the new note
	* @return the new note
	*/
	public static Note create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the note
	* @return the note that was removed
	* @throws NoSuchNoteException if a note with the primary key could not be found
	*/
	public static Note remove(long id)
		throws contact.manager.service.exception.NoSuchNoteException {
		return getPersistence().remove(id);
	}

	public static Note updateImpl(Note note) {
		return getPersistence().updateImpl(note);
	}

	/**
	* Returns the note with the primary key or throws a {@link NoSuchNoteException} if it could not be found.
	*
	* @param id the primary key of the note
	* @return the note
	* @throws NoSuchNoteException if a note with the primary key could not be found
	*/
	public static Note findByPrimaryKey(long id)
		throws contact.manager.service.exception.NoSuchNoteException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the note with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the note
	* @return the note, or <code>null</code> if a note with the primary key could not be found
	*/
	public static Note fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, Note> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the notes.
	*
	* @return the notes
	*/
	public static List<Note> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @return the range of notes
	*/
	public static List<Note> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of notes
	*/
	public static List<Note> findAll(int start, int end,
		OrderByComparator<Note> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of notes
	*/
	public static List<Note> findAll(int start, int end,
		OrderByComparator<Note> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the notes from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of notes.
	*
	* @return the number of notes
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static NotePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<NotePersistence, NotePersistence> _serviceTracker =
		ServiceTrackerFactory.open(NotePersistence.class);
}