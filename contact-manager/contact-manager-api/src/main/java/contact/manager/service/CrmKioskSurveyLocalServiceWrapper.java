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
 * Provides a wrapper for {@link CrmKioskSurveyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmKioskSurveyLocalService
 * @generated
 */
@ProviderType
public class CrmKioskSurveyLocalServiceWrapper
	implements CrmKioskSurveyLocalService,
		ServiceWrapper<CrmKioskSurveyLocalService> {
	public CrmKioskSurveyLocalServiceWrapper(
		CrmKioskSurveyLocalService crmKioskSurveyLocalService) {
		_crmKioskSurveyLocalService = crmKioskSurveyLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _crmKioskSurveyLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crmKioskSurveyLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _crmKioskSurveyLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _crmKioskSurveyLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmKioskSurveyLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmKioskSurveyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the CRM Kiosk Survey to the database. Also notifies the appropriate model listeners.
	*
	* @param crmKioskSurvey the CRM Kiosk Survey
	* @return the CRM Kiosk Survey that was added
	*/
	@Override
	public contact.manager.model.CrmKioskSurvey addCrmKioskSurvey(
		contact.manager.model.CrmKioskSurvey crmKioskSurvey) {
		return _crmKioskSurveyLocalService.addCrmKioskSurvey(crmKioskSurvey);
	}

	/**
	* Creates a new CRM Kiosk Survey with the primary key. Does not add the CRM Kiosk Survey to the database.
	*
	* @param crmKioskSurveyId the primary key for the new CRM Kiosk Survey
	* @return the new CRM Kiosk Survey
	*/
	@Override
	public contact.manager.model.CrmKioskSurvey createCrmKioskSurvey(
		long crmKioskSurveyId) {
		return _crmKioskSurveyLocalService.createCrmKioskSurvey(crmKioskSurveyId);
	}

	/**
	* Deletes the CRM Kiosk Survey from the database. Also notifies the appropriate model listeners.
	*
	* @param crmKioskSurvey the CRM Kiosk Survey
	* @return the CRM Kiosk Survey that was removed
	*/
	@Override
	public contact.manager.model.CrmKioskSurvey deleteCrmKioskSurvey(
		contact.manager.model.CrmKioskSurvey crmKioskSurvey) {
		return _crmKioskSurveyLocalService.deleteCrmKioskSurvey(crmKioskSurvey);
	}

	/**
	* Deletes the CRM Kiosk Survey with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmKioskSurveyId the primary key of the CRM Kiosk Survey
	* @return the CRM Kiosk Survey that was removed
	* @throws PortalException if a CRM Kiosk Survey with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmKioskSurvey deleteCrmKioskSurvey(
		long crmKioskSurveyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmKioskSurveyLocalService.deleteCrmKioskSurvey(crmKioskSurveyId);
	}

	@Override
	public contact.manager.model.CrmKioskSurvey fetchCrmKioskSurvey(
		long crmKioskSurveyId) {
		return _crmKioskSurveyLocalService.fetchCrmKioskSurvey(crmKioskSurveyId);
	}

	/**
	* Returns the CRM Kiosk Survey matching the UUID and group.
	*
	* @param uuid the CRM Kiosk Survey's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	@Override
	public contact.manager.model.CrmKioskSurvey fetchCrmKioskSurveyByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _crmKioskSurveyLocalService.fetchCrmKioskSurveyByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the CRM Kiosk Survey with the primary key.
	*
	* @param crmKioskSurveyId the primary key of the CRM Kiosk Survey
	* @return the CRM Kiosk Survey
	* @throws PortalException if a CRM Kiosk Survey with the primary key could not be found
	*/
	@Override
	public contact.manager.model.CrmKioskSurvey getCrmKioskSurvey(
		long crmKioskSurveyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmKioskSurveyLocalService.getCrmKioskSurvey(crmKioskSurveyId);
	}

	/**
	* Returns the CRM Kiosk Survey matching the UUID and group.
	*
	* @param uuid the CRM Kiosk Survey's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Kiosk Survey
	* @throws PortalException if a matching CRM Kiosk Survey could not be found
	*/
	@Override
	public contact.manager.model.CrmKioskSurvey getCrmKioskSurveyByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmKioskSurveyLocalService.getCrmKioskSurveyByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the CRM Kiosk Survey in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmKioskSurvey the CRM Kiosk Survey
	* @return the CRM Kiosk Survey that was updated
	*/
	@Override
	public contact.manager.model.CrmKioskSurvey updateCrmKioskSurvey(
		contact.manager.model.CrmKioskSurvey crmKioskSurvey) {
		return _crmKioskSurveyLocalService.updateCrmKioskSurvey(crmKioskSurvey);
	}

	/**
	* Returns the number of CRM Kiosk Surveies.
	*
	* @return the number of CRM Kiosk Surveies
	*/
	@Override
	public int getCrmKioskSurveiesCount() {
		return _crmKioskSurveyLocalService.getCrmKioskSurveiesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmKioskSurveyLocalService.getOSGiServiceIdentifier();
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
		return _crmKioskSurveyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmKioskSurveyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crmKioskSurveyLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the CRM Kiosk Surveies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @return the range of CRM Kiosk Surveies
	*/
	@Override
	public java.util.List<contact.manager.model.CrmKioskSurvey> getCrmKioskSurveies(
		int start, int end) {
		return _crmKioskSurveyLocalService.getCrmKioskSurveies(start, end);
	}

	/**
	* Returns all the CRM Kiosk Surveies matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Kiosk Surveies
	* @param companyId the primary key of the company
	* @return the matching CRM Kiosk Surveies, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmKioskSurvey> getCrmKioskSurveiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _crmKioskSurveyLocalService.getCrmKioskSurveiesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of CRM Kiosk Surveies matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Kiosk Surveies
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Kiosk Surveies, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<contact.manager.model.CrmKioskSurvey> getCrmKioskSurveiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmKioskSurvey> orderByComparator) {
		return _crmKioskSurveyLocalService.getCrmKioskSurveiesByUuidAndCompanyId(uuid,
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
		return _crmKioskSurveyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crmKioskSurveyLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public CrmKioskSurveyLocalService getWrappedService() {
		return _crmKioskSurveyLocalService;
	}

	@Override
	public void setWrappedService(
		CrmKioskSurveyLocalService crmKioskSurveyLocalService) {
		_crmKioskSurveyLocalService = crmKioskSurveyLocalService;
	}

	private CrmKioskSurveyLocalService _crmKioskSurveyLocalService;
}