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

import contact.manager.service.exception.NoSuchNoteException;
import contact.manager.service.model.Note;

/**
 * The persistence interface for the note service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.NotePersistenceImpl
 * @see NoteUtil
 * @generated
 */
@ProviderType
public interface NotePersistence extends BasePersistence<Note> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NoteUtil} to access the note persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the note in the entity cache if it is enabled.
	*
	* @param note the note
	*/
	public void cacheResult(Note note);

	/**
	* Caches the notes in the entity cache if it is enabled.
	*
	* @param notes the notes
	*/
	public void cacheResult(java.util.List<Note> notes);

	/**
	* Creates a new note with the primary key. Does not add the note to the database.
	*
	* @param id the primary key for the new note
	* @return the new note
	*/
	public Note create(long id);

	/**
	* Removes the note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the note
	* @return the note that was removed
	* @throws NoSuchNoteException if a note with the primary key could not be found
	*/
	public Note remove(long id) throws NoSuchNoteException;

	public Note updateImpl(Note note);

	/**
	* Returns the note with the primary key or throws a {@link NoSuchNoteException} if it could not be found.
	*
	* @param id the primary key of the note
	* @return the note
	* @throws NoSuchNoteException if a note with the primary key could not be found
	*/
	public Note findByPrimaryKey(long id) throws NoSuchNoteException;

	/**
	* Returns the note with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the note
	* @return the note, or <code>null</code> if a note with the primary key could not be found
	*/
	public Note fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, Note> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the notes.
	*
	* @return the notes
	*/
	public java.util.List<Note> findAll();

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
	public java.util.List<Note> findAll(int start, int end);

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
	public java.util.List<Note> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

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
	public java.util.List<Note> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the notes from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of notes.
	*
	* @return the number of notes
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}