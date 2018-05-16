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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NoteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NoteLocalService
 * @generated
 */
@ProviderType
public class NoteLocalServiceWrapper implements NoteLocalService,
	ServiceWrapper<NoteLocalService> {
	public NoteLocalServiceWrapper(NoteLocalService noteLocalService) {
		_noteLocalService = noteLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _noteLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _noteLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _noteLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _noteLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _noteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the note to the database. Also notifies the appropriate model listeners.
	*
	* @param note the note
	* @return the note that was added
	*/
	@Override
	public contact.manager.service.model.Note addNote(
		contact.manager.service.model.Note note) {
		return _noteLocalService.addNote(note);
	}

	/**
	* Creates a new note with the primary key. Does not add the note to the database.
	*
	* @param id the primary key for the new note
	* @return the new note
	*/
	@Override
	public contact.manager.service.model.Note createNote(long id) {
		return _noteLocalService.createNote(id);
	}

	/**
	* Deletes the note from the database. Also notifies the appropriate model listeners.
	*
	* @param note the note
	* @return the note that was removed
	*/
	@Override
	public contact.manager.service.model.Note deleteNote(
		contact.manager.service.model.Note note) {
		return _noteLocalService.deleteNote(note);
	}

	/**
	* Deletes the note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the note
	* @return the note that was removed
	* @throws PortalException if a note with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.Note deleteNote(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _noteLocalService.deleteNote(id);
	}

	@Override
	public contact.manager.service.model.Note fetchNote(long id) {
		return _noteLocalService.fetchNote(id);
	}

	/**
	* Returns the note with the primary key.
	*
	* @param id the primary key of the note
	* @return the note
	* @throws PortalException if a note with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.Note getNote(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _noteLocalService.getNote(id);
	}

	/**
	* Updates the note in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param note the note
	* @return the note that was updated
	*/
	@Override
	public contact.manager.service.model.Note updateNote(
		contact.manager.service.model.Note note) {
		return _noteLocalService.updateNote(note);
	}

	/**
	* Returns the number of notes.
	*
	* @return the number of notes
	*/
	@Override
	public int getNotesCount() {
		return _noteLocalService.getNotesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _noteLocalService.getOSGiServiceIdentifier();
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
		return _noteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _noteLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _noteLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @return the range of notes
	*/
	@Override
	public java.util.List<contact.manager.service.model.Note> getNotes(
		int start, int end) {
		return _noteLocalService.getNotes(start, end);
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
		return _noteLocalService.dynamicQueryCount(dynamicQuery);
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
		return _noteLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public NoteLocalService getWrappedService() {
		return _noteLocalService;
	}

	@Override
	public void setWrappedService(NoteLocalService noteLocalService) {
		_noteLocalService = noteLocalService;
	}

	private NoteLocalService _noteLocalService;
}