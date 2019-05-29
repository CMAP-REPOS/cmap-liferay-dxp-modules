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
 * Provides a wrapper for {@link CExtParticipationOtherLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CExtParticipationOtherLocalService
 * @generated
 */
@ProviderType
public class CExtParticipationOtherLocalServiceWrapper
	implements CExtParticipationOtherLocalService,
		ServiceWrapper<CExtParticipationOtherLocalService> {
	public CExtParticipationOtherLocalServiceWrapper(
		CExtParticipationOtherLocalService cExtParticipationOtherLocalService) {
		_cExtParticipationOtherLocalService = cExtParticipationOtherLocalService;
	}

	/**
	* Adds the c ext participation other to the database. Also notifies the appropriate model listeners.
	*
	* @param cExtParticipationOther the c ext participation other
	* @return the c ext participation other that was added
	*/
	@Override
	public ucc.portal.model.CExtParticipationOther addCExtParticipationOther(
		ucc.portal.model.CExtParticipationOther cExtParticipationOther) {
		return _cExtParticipationOtherLocalService.addCExtParticipationOther(cExtParticipationOther);
	}

	/**
	* Creates a new c ext participation other with the primary key. Does not add the c ext participation other to the database.
	*
	* @param cExtParticipationOtherPK the primary key for the new c ext participation other
	* @return the new c ext participation other
	*/
	@Override
	public ucc.portal.model.CExtParticipationOther createCExtParticipationOther(
		ucc.portal.service.persistence.CExtParticipationOtherPK cExtParticipationOtherPK) {
		return _cExtParticipationOtherLocalService.createCExtParticipationOther(cExtParticipationOtherPK);
	}

	/**
	* Deletes the c ext participation other from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtParticipationOther the c ext participation other
	* @return the c ext participation other that was removed
	*/
	@Override
	public ucc.portal.model.CExtParticipationOther deleteCExtParticipationOther(
		ucc.portal.model.CExtParticipationOther cExtParticipationOther) {
		return _cExtParticipationOtherLocalService.deleteCExtParticipationOther(cExtParticipationOther);
	}

	/**
	* Deletes the c ext participation other with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtParticipationOtherPK the primary key of the c ext participation other
	* @return the c ext participation other that was removed
	* @throws PortalException if a c ext participation other with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.CExtParticipationOther deleteCExtParticipationOther(
		ucc.portal.service.persistence.CExtParticipationOtherPK cExtParticipationOtherPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtParticipationOtherLocalService.deleteCExtParticipationOther(cExtParticipationOtherPK);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtParticipationOtherLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cExtParticipationOtherLocalService.dynamicQuery();
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
		return _cExtParticipationOtherLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtParticipationOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cExtParticipationOtherLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtParticipationOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cExtParticipationOtherLocalService.dynamicQuery(dynamicQuery,
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
		return _cExtParticipationOtherLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cExtParticipationOtherLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ucc.portal.model.CExtParticipationOther fetchCExtParticipationOther(
		ucc.portal.service.persistence.CExtParticipationOtherPK cExtParticipationOtherPK) {
		return _cExtParticipationOtherLocalService.fetchCExtParticipationOther(cExtParticipationOtherPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cExtParticipationOtherLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the c ext participation other with the primary key.
	*
	* @param cExtParticipationOtherPK the primary key of the c ext participation other
	* @return the c ext participation other
	* @throws PortalException if a c ext participation other with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.CExtParticipationOther getCExtParticipationOther(
		ucc.portal.service.persistence.CExtParticipationOtherPK cExtParticipationOtherPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtParticipationOtherLocalService.getCExtParticipationOther(cExtParticipationOtherPK);
	}

	/**
	* Returns a range of all the c ext participation others.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtParticipationOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext participation others
	* @param end the upper bound of the range of c ext participation others (not inclusive)
	* @return the range of c ext participation others
	*/
	@Override
	public java.util.List<ucc.portal.model.CExtParticipationOther> getCExtParticipationOthers(
		int start, int end) {
		return _cExtParticipationOtherLocalService.getCExtParticipationOthers(start,
			end);
	}

	/**
	* Returns the number of c ext participation others.
	*
	* @return the number of c ext participation others
	*/
	@Override
	public int getCExtParticipationOthersCount() {
		return _cExtParticipationOtherLocalService.getCExtParticipationOthersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cExtParticipationOtherLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _cExtParticipationOtherLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtParticipationOtherLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the c ext participation other in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cExtParticipationOther the c ext participation other
	* @return the c ext participation other that was updated
	*/
	@Override
	public ucc.portal.model.CExtParticipationOther updateCExtParticipationOther(
		ucc.portal.model.CExtParticipationOther cExtParticipationOther) {
		return _cExtParticipationOtherLocalService.updateCExtParticipationOther(cExtParticipationOther);
	}

	@Override
	public CExtParticipationOtherLocalService getWrappedService() {
		return _cExtParticipationOtherLocalService;
	}

	@Override
	public void setWrappedService(
		CExtParticipationOtherLocalService cExtParticipationOtherLocalService) {
		_cExtParticipationOtherLocalService = cExtParticipationOtherLocalService;
	}

	private CExtParticipationOtherLocalService _cExtParticipationOtherLocalService;
}