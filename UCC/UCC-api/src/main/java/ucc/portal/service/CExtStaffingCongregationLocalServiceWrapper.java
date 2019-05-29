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

package ucc.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CExtStaffingCongregationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CExtStaffingCongregationLocalService
 * @generated
 */
@ProviderType
public class CExtStaffingCongregationLocalServiceWrapper
	implements CExtStaffingCongregationLocalService,
		ServiceWrapper<CExtStaffingCongregationLocalService> {
	public CExtStaffingCongregationLocalServiceWrapper(
		CExtStaffingCongregationLocalService cExtStaffingCongregationLocalService) {
		_cExtStaffingCongregationLocalService = cExtStaffingCongregationLocalService;
	}

	/**
	* Adds the c ext staffing congregation to the database. Also notifies the appropriate model listeners.
	*
	* @param cExtStaffingCongregation the c ext staffing congregation
	* @return the c ext staffing congregation that was added
	*/
	@Override
	public ucc.portal.model.CExtStaffingCongregation addCExtStaffingCongregation(
		ucc.portal.model.CExtStaffingCongregation cExtStaffingCongregation) {
		return _cExtStaffingCongregationLocalService.addCExtStaffingCongregation(cExtStaffingCongregation);
	}

	/**
	* Creates a new c ext staffing congregation with the primary key. Does not add the c ext staffing congregation to the database.
	*
	* @param cExtStaffingCongregationPK the primary key for the new c ext staffing congregation
	* @return the new c ext staffing congregation
	*/
	@Override
	public ucc.portal.model.CExtStaffingCongregation createCExtStaffingCongregation(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK) {
		return _cExtStaffingCongregationLocalService.createCExtStaffingCongregation(cExtStaffingCongregationPK);
	}

	/**
	* Deletes the c ext staffing congregation from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtStaffingCongregation the c ext staffing congregation
	* @return the c ext staffing congregation that was removed
	*/
	@Override
	public ucc.portal.model.CExtStaffingCongregation deleteCExtStaffingCongregation(
		ucc.portal.model.CExtStaffingCongregation cExtStaffingCongregation) {
		return _cExtStaffingCongregationLocalService.deleteCExtStaffingCongregation(cExtStaffingCongregation);
	}

	/**
	* Deletes the c ext staffing congregation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtStaffingCongregationPK the primary key of the c ext staffing congregation
	* @return the c ext staffing congregation that was removed
	* @throws PortalException if a c ext staffing congregation with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.CExtStaffingCongregation deleteCExtStaffingCongregation(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtStaffingCongregationLocalService.deleteCExtStaffingCongregation(cExtStaffingCongregationPK);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtStaffingCongregationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cExtStaffingCongregationLocalService.dynamicQuery();
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
		return _cExtStaffingCongregationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cExtStaffingCongregationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cExtStaffingCongregationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _cExtStaffingCongregationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cExtStaffingCongregationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ucc.portal.model.CExtStaffingCongregation fetchCExtStaffingCongregation(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK) {
		return _cExtStaffingCongregationLocalService.fetchCExtStaffingCongregation(cExtStaffingCongregationPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cExtStaffingCongregationLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the c ext staffing congregation with the primary key.
	*
	* @param cExtStaffingCongregationPK the primary key of the c ext staffing congregation
	* @return the c ext staffing congregation
	* @throws PortalException if a c ext staffing congregation with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.CExtStaffingCongregation getCExtStaffingCongregation(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtStaffingCongregationLocalService.getCExtStaffingCongregation(cExtStaffingCongregationPK);
	}

	/**
	* Returns a range of all the c ext staffing congregations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @return the range of c ext staffing congregations
	*/
	@Override
	public java.util.List<ucc.portal.model.CExtStaffingCongregation> getCExtStaffingCongregations(
		int start, int end) {
		return _cExtStaffingCongregationLocalService.getCExtStaffingCongregations(start,
			end);
	}

	/**
	* Returns the number of c ext staffing congregations.
	*
	* @return the number of c ext staffing congregations
	*/
	@Override
	public int getCExtStaffingCongregationsCount() {
		return _cExtStaffingCongregationLocalService.getCExtStaffingCongregationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cExtStaffingCongregationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _cExtStaffingCongregationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtStaffingCongregationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the c ext staffing congregation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cExtStaffingCongregation the c ext staffing congregation
	* @return the c ext staffing congregation that was updated
	*/
	@Override
	public ucc.portal.model.CExtStaffingCongregation updateCExtStaffingCongregation(
		ucc.portal.model.CExtStaffingCongregation cExtStaffingCongregation) {
		return _cExtStaffingCongregationLocalService.updateCExtStaffingCongregation(cExtStaffingCongregation);
	}

	@Override
	public CExtStaffingCongregationLocalService getWrappedService() {
		return _cExtStaffingCongregationLocalService;
	}

	@Override
	public void setWrappedService(
		CExtStaffingCongregationLocalService cExtStaffingCongregationLocalService) {
		_cExtStaffingCongregationLocalService = cExtStaffingCongregationLocalService;
	}

	private CExtStaffingCongregationLocalService _cExtStaffingCongregationLocalService;
}