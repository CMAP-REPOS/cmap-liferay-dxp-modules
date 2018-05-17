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
 * Provides a wrapper for {@link CrmTagLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmTagLocalService
 * @generated
 */
@ProviderType
public class CrmTagLocalServiceWrapper implements CrmTagLocalService,
	ServiceWrapper<CrmTagLocalService> {
	public CrmTagLocalServiceWrapper(CrmTagLocalService crmTagLocalService) {
		_crmTagLocalService = crmTagLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmTagLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmTagLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmTagLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmTagLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmTagLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmTagLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM Tag to the database. Also notifies the appropriate model listeners.
	*
	* @param crmTag the CRM Tag
	* @return the CRM Tag that was added
	*/
	@Override
	public contact.manager.model.CrmTag addCrmTag(
		contact.manager.model.CrmTag crmTag) {
		return _crmTagLocalService.addCrmTag(crmTag);
	}

	/**
	* Creates a new CRM Tag with the primary key. Does not add the CRM Tag to the database.
	*
	* @param crmTagId the primary key for the new CRM Tag
	* @return the new CRM Tag
	*/
	@Override
	public contact.manager.model.CrmTag createCrmTag(long crmTagId) {
		return _crmTagLocalService.createCrmTag(crmTagId);
	}

	/**
	* Deletes the CRM Tag from the database. Also notifies the appropriate model listeners.
	*
	* @param crmTag the CRM Tag
	* @return the CRM Tag that was removed
	*/
	@Override
	public contact.manager.model.CrmTag deleteCrmTag(
		contact.manager.model.CrmTag crmTag) {
		return _crmTagLocalService.deleteCrmTag(crmTag);
	}

	/**
	* Deletes the CRM Tag with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmTagId the primary key of the CRM Tag
	* @return the CRM Tag that was removed
	* @throws PortalException if a CRM Tag with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmTag deleteCrmTag(long crmTagId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmTagLocalService.deleteCrmTag(crmTagId);
	}

	@Override
	public contact.manager.model.CrmTag fetchCrmTag(long crmTagId) {
		return _crmTagLocalService.fetchCrmTag(crmTagId);
	}

	/**
	* Returns the CRM Tag matching the UUID and group.
	*
	* @param uuid the CRM Tag's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	@Override
	public contact.manager.model.CrmTag fetchCrmTagByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _crmTagLocalService.fetchCrmTagByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the CRM Tag with the primary key.
	*
	* @param crmTagId the primary key of the CRM Tag
	* @return the CRM Tag
	* @throws PortalException if a CRM Tag with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmTag getCrmTag(long crmTagId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmTagLocalService.getCrmTag(crmTagId);
	}

	/**
	* Returns the CRM Tag matching the UUID and group.
	*
	* @param uuid the CRM Tag's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Tag
	* @throws PortalException if a matching CRM Tag could not be found
	*/
	@Override
	public contact.manager.model.CrmTag getCrmTagByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmTagLocalService.getCrmTagByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the CRM Tag in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmTag the CRM Tag
	* @return the CRM Tag that was updated
	*/
	@Override
	public contact.manager.model.CrmTag updateCrmTag(
		contact.manager.model.CrmTag crmTag) {
		return _crmTagLocalService.updateCrmTag(crmTag);
	}

	/**
	* Returns the number of CRM Tags.
	*
	* @return the number of CRM Tags
	*/
	@Override
	public int getCrmTagsCount() {
		return _crmTagLocalService.getCrmTagsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmTagLocalService.getOSGiServiceIdentifier();
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
		return _crmTagLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmTagLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmTagLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the CRM Tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @return the range of CRM Tags
	*/
	@Override
	public java.util.List<contact.manager.model.CrmTag> getCrmTags(int start,
		int end) {
		return _crmTagLocalService.getCrmTags(start, end);
	}

	/**
	* Returns all the CRM Tags matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Tags
	* @param companyId the primary key of the company
	* @return the matching CRM Tags, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmTag> getCrmTagsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _crmTagLocalService.getCrmTagsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of CRM Tags matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Tags
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Tags, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmTag> getCrmTagsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmTag> orderByComparator) {
		return _crmTagLocalService.getCrmTagsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
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
		return _crmTagLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmTagLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CrmTagLocalService getWrappedService() {
		return _crmTagLocalService;
	}

	@Override
	public void setWrappedService(CrmTagLocalService crmTagLocalService) {
		_crmTagLocalService = crmTagLocalService;
	}

	private CrmTagLocalService _crmTagLocalService;
}