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
 * Provides a wrapper for {@link CrmNoteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmNoteLocalService
 * @generated
 */
@ProviderType
public class CrmNoteLocalServiceWrapper implements CrmNoteLocalService,
	ServiceWrapper<CrmNoteLocalService> {
	public CrmNoteLocalServiceWrapper(CrmNoteLocalService crmNoteLocalService) {
		_crmNoteLocalService = crmNoteLocalService;
	}

	/**
	* Adds the CRM Note to the database. Also notifies the appropriate model listeners.
	*
	* @param crmNote the CRM Note
	* @return the CRM Note that was added
	*/
	@Override
	public contact.manager.model.CrmNote addCrmNote(
		contact.manager.model.CrmNote crmNote) {
		return _crmNoteLocalService.addCrmNote(crmNote);
	}

	@Override
	public int countByCrmContactId(long crmContactId) {
		return _crmNoteLocalService.countByCrmContactId(crmContactId);
	}

	/**
	* Creates a new CRM Note with the primary key. Does not add the CRM Note to the database.
	*
	* @param crmNoteId the primary key for the new CRM Note
	* @return the new CRM Note
	*/
	@Override
	public contact.manager.model.CrmNote createCrmNote(long crmNoteId) {
		return _crmNoteLocalService.createCrmNote(crmNoteId);
	}

	/**
	* Deletes the CRM Note from the database. Also notifies the appropriate model listeners.
	*
	* @param crmNote the CRM Note
	* @return the CRM Note that was removed
	*/
	@Override
	public contact.manager.model.CrmNote deleteCrmNote(
		contact.manager.model.CrmNote crmNote) {
		return _crmNoteLocalService.deleteCrmNote(crmNote);
	}

	/**
	* Deletes the CRM Note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmNoteId the primary key of the CRM Note
	* @return the CRM Note that was removed
	* @throws PortalException if a CRM Note with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmNote deleteCrmNote(long crmNoteId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmNoteLocalService.deleteCrmNote(crmNoteId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmNoteLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmNoteLocalService.dynamicQuery();
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
		return _crmNoteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmNoteLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmNoteLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _crmNoteLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmNoteLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public contact.manager.model.CrmNote fetchCrmNote(long crmNoteId) {
		return _crmNoteLocalService.fetchCrmNote(crmNoteId);
	}

	/**
	* Returns the CRM Note matching the UUID and group.
	*
	* @param uuid the CRM Note's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	*/
	@Override
	public contact.manager.model.CrmNote fetchCrmNoteByUuidAndGroupId(
		String uuid, long groupId) {
		return _crmNoteLocalService.fetchCrmNoteByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmNote> findByCrmContactId(
		long crmContactId) {
		return _crmNoteLocalService.findByCrmContactId(crmContactId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmNote> findByCrmContactId(
		long crmContactId, int start, int end) {
		return _crmNoteLocalService.findByCrmContactId(crmContactId, start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmNote> findByCrmContactId(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmNote> orderByComparator) {
		return _crmNoteLocalService.findByCrmContactId(crmContactId, start,
			end, orderByComparator);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmNoteLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the CRM Note with the primary key.
	*
	* @param crmNoteId the primary key of the CRM Note
	* @return the CRM Note
	* @throws PortalException if a CRM Note with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmNote getCrmNote(long crmNoteId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmNoteLocalService.getCrmNote(crmNoteId);
	}

	/**
	* Returns the CRM Note matching the UUID and group.
	*
	* @param uuid the CRM Note's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Note
	* @throws PortalException if a matching CRM Note could not be found
	*/
	@Override
	public contact.manager.model.CrmNote getCrmNoteByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmNoteLocalService.getCrmNoteByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the CRM Notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @return the range of CRM Notes
	*/
	@Override
	public java.util.List<contact.manager.model.CrmNote> getCrmNotes(
		int start, int end) {
		return _crmNoteLocalService.getCrmNotes(start, end);
	}

	/**
	* Returns all the CRM Notes matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Notes
	* @param companyId the primary key of the company
	* @return the matching CRM Notes, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmNote> getCrmNotesByUuidAndCompanyId(
		String uuid, long companyId) {
		return _crmNoteLocalService.getCrmNotesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of CRM Notes matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Notes
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Notes
	* @param end the upper bound of the range of CRM Notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Notes, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmNote> getCrmNotesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmNote> orderByComparator) {
		return _crmNoteLocalService.getCrmNotesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of CRM Notes.
	*
	* @return the number of CRM Notes
	*/
	@Override
	public int getCrmNotesCount() {
		return _crmNoteLocalService.getCrmNotesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmNoteLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmNoteLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _crmNoteLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmNoteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the CRM Note in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmNote the CRM Note
	* @return the CRM Note that was updated
	*/
	@Override
	public contact.manager.model.CrmNote updateCrmNote(
		contact.manager.model.CrmNote crmNote) {
		return _crmNoteLocalService.updateCrmNote(crmNote);
	}

	@Override
	public CrmNoteLocalService getWrappedService() {
		return _crmNoteLocalService;
	}

	@Override
	public void setWrappedService(CrmNoteLocalService crmNoteLocalService) {
		_crmNoteLocalService = crmNoteLocalService;
	}

	private CrmNoteLocalService _crmNoteLocalService;
}