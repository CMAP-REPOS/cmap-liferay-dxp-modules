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
 * Provides a wrapper for {@link CExtChurchFinancesIncomeOtherLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CExtChurchFinancesIncomeOtherLocalService
 * @generated
 */
@ProviderType
public class CExtChurchFinancesIncomeOtherLocalServiceWrapper
	implements CExtChurchFinancesIncomeOtherLocalService,
		ServiceWrapper<CExtChurchFinancesIncomeOtherLocalService> {
	public CExtChurchFinancesIncomeOtherLocalServiceWrapper(
		CExtChurchFinancesIncomeOtherLocalService cExtChurchFinancesIncomeOtherLocalService) {
		_cExtChurchFinancesIncomeOtherLocalService = cExtChurchFinancesIncomeOtherLocalService;
	}

	/**
	* Adds the c ext church finances income other to the database. Also notifies the appropriate model listeners.
	*
	* @param cExtChurchFinancesIncomeOther the c ext church finances income other
	* @return the c ext church finances income other that was added
	*/
	@Override
	public ucc.portal.model.CExtChurchFinancesIncomeOther addCExtChurchFinancesIncomeOther(
		ucc.portal.model.CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther) {
		return _cExtChurchFinancesIncomeOtherLocalService.addCExtChurchFinancesIncomeOther(cExtChurchFinancesIncomeOther);
	}

	/**
	* Creates a new c ext church finances income other with the primary key. Does not add the c ext church finances income other to the database.
	*
	* @param cExtChurchFinancesIncomeOtherPK the primary key for the new c ext church finances income other
	* @return the new c ext church finances income other
	*/
	@Override
	public ucc.portal.model.CExtChurchFinancesIncomeOther createCExtChurchFinancesIncomeOther(
		ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK) {
		return _cExtChurchFinancesIncomeOtherLocalService.createCExtChurchFinancesIncomeOther(cExtChurchFinancesIncomeOtherPK);
	}

	/**
	* Deletes the c ext church finances income other from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtChurchFinancesIncomeOther the c ext church finances income other
	* @return the c ext church finances income other that was removed
	*/
	@Override
	public ucc.portal.model.CExtChurchFinancesIncomeOther deleteCExtChurchFinancesIncomeOther(
		ucc.portal.model.CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther) {
		return _cExtChurchFinancesIncomeOtherLocalService.deleteCExtChurchFinancesIncomeOther(cExtChurchFinancesIncomeOther);
	}

	/**
	* Deletes the c ext church finances income other with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtChurchFinancesIncomeOtherPK the primary key of the c ext church finances income other
	* @return the c ext church finances income other that was removed
	* @throws PortalException if a c ext church finances income other with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.CExtChurchFinancesIncomeOther deleteCExtChurchFinancesIncomeOther(
		ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtChurchFinancesIncomeOtherLocalService.deleteCExtChurchFinancesIncomeOther(cExtChurchFinancesIncomeOtherPK);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtChurchFinancesIncomeOtherLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cExtChurchFinancesIncomeOtherLocalService.dynamicQuery();
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
		return _cExtChurchFinancesIncomeOtherLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cExtChurchFinancesIncomeOtherLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cExtChurchFinancesIncomeOtherLocalService.dynamicQuery(dynamicQuery,
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
		return _cExtChurchFinancesIncomeOtherLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cExtChurchFinancesIncomeOtherLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ucc.portal.model.CExtChurchFinancesIncomeOther fetchCExtChurchFinancesIncomeOther(
		ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK) {
		return _cExtChurchFinancesIncomeOtherLocalService.fetchCExtChurchFinancesIncomeOther(cExtChurchFinancesIncomeOtherPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cExtChurchFinancesIncomeOtherLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the c ext church finances income other with the primary key.
	*
	* @param cExtChurchFinancesIncomeOtherPK the primary key of the c ext church finances income other
	* @return the c ext church finances income other
	* @throws PortalException if a c ext church finances income other with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.CExtChurchFinancesIncomeOther getCExtChurchFinancesIncomeOther(
		ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtChurchFinancesIncomeOtherLocalService.getCExtChurchFinancesIncomeOther(cExtChurchFinancesIncomeOtherPK);
	}

	/**
	* Returns a range of all the c ext church finances income others.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext church finances income others
	* @param end the upper bound of the range of c ext church finances income others (not inclusive)
	* @return the range of c ext church finances income others
	*/
	@Override
	public java.util.List<ucc.portal.model.CExtChurchFinancesIncomeOther> getCExtChurchFinancesIncomeOthers(
		int start, int end) {
		return _cExtChurchFinancesIncomeOtherLocalService.getCExtChurchFinancesIncomeOthers(start,
			end);
	}

	/**
	* Returns the number of c ext church finances income others.
	*
	* @return the number of c ext church finances income others
	*/
	@Override
	public int getCExtChurchFinancesIncomeOthersCount() {
		return _cExtChurchFinancesIncomeOtherLocalService.getCExtChurchFinancesIncomeOthersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cExtChurchFinancesIncomeOtherLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _cExtChurchFinancesIncomeOtherLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtChurchFinancesIncomeOtherLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the c ext church finances income other in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cExtChurchFinancesIncomeOther the c ext church finances income other
	* @return the c ext church finances income other that was updated
	*/
	@Override
	public ucc.portal.model.CExtChurchFinancesIncomeOther updateCExtChurchFinancesIncomeOther(
		ucc.portal.model.CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther) {
		return _cExtChurchFinancesIncomeOtherLocalService.updateCExtChurchFinancesIncomeOther(cExtChurchFinancesIncomeOther);
	}

	@Override
	public CExtChurchFinancesIncomeOtherLocalService getWrappedService() {
		return _cExtChurchFinancesIncomeOtherLocalService;
	}

	@Override
	public void setWrappedService(
		CExtChurchFinancesIncomeOtherLocalService cExtChurchFinancesIncomeOtherLocalService) {
		_cExtChurchFinancesIncomeOtherLocalService = cExtChurchFinancesIncomeOtherLocalService;
	}

	private CExtChurchFinancesIncomeOtherLocalService _cExtChurchFinancesIncomeOtherLocalService;
}