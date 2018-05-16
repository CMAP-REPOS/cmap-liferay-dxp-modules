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
 * Provides a wrapper for {@link MuniLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MuniLocalService
 * @generated
 */
@ProviderType
public class MuniLocalServiceWrapper implements MuniLocalService,
	ServiceWrapper<MuniLocalService> {
	public MuniLocalServiceWrapper(MuniLocalService muniLocalService) {
		_muniLocalService = muniLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _muniLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _muniLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _muniLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _muniLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _muniLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the muni to the database. Also notifies the appropriate model listeners.
	*
	* @param muni the muni
	* @return the muni that was added
	*/
	@Override
	public contact.manager.service.model.Muni addMuni(
		contact.manager.service.model.Muni muni) {
		return _muniLocalService.addMuni(muni);
	}

	/**
	* Creates a new muni with the primary key. Does not add the muni to the database.
	*
	* @param muniId the primary key for the new muni
	* @return the new muni
	*/
	@Override
	public contact.manager.service.model.Muni createMuni(long muniId) {
		return _muniLocalService.createMuni(muniId);
	}

	/**
	* Deletes the muni from the database. Also notifies the appropriate model listeners.
	*
	* @param muni the muni
	* @return the muni that was removed
	*/
	@Override
	public contact.manager.service.model.Muni deleteMuni(
		contact.manager.service.model.Muni muni) {
		return _muniLocalService.deleteMuni(muni);
	}

	/**
	* Deletes the muni with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param muniId the primary key of the muni
	* @return the muni that was removed
	* @throws PortalException if a muni with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.Muni deleteMuni(long muniId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _muniLocalService.deleteMuni(muniId);
	}

	@Override
	public contact.manager.service.model.Muni fetchMuni(long muniId) {
		return _muniLocalService.fetchMuni(muniId);
	}

	/**
	* Returns the muni with the primary key.
	*
	* @param muniId the primary key of the muni
	* @return the muni
	* @throws PortalException if a muni with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.Muni getMuni(long muniId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _muniLocalService.getMuni(muniId);
	}

	/**
	* Updates the muni in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param muni the muni
	* @return the muni that was updated
	*/
	@Override
	public contact.manager.service.model.Muni updateMuni(
		contact.manager.service.model.Muni muni) {
		return _muniLocalService.updateMuni(muni);
	}

	/**
	* Returns the number of munis.
	*
	* @return the number of munis
	*/
	@Override
	public int getMunisCount() {
		return _muniLocalService.getMunisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _muniLocalService.getOSGiServiceIdentifier();
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
		return _muniLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _muniLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _muniLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the munis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of munis
	* @param end the upper bound of the range of munis (not inclusive)
	* @return the range of munis
	*/
	@Override
	public java.util.List<contact.manager.service.model.Muni> getMunis(
		int start, int end) {
		return _muniLocalService.getMunis(start, end);
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
		return _muniLocalService.dynamicQueryCount(dynamicQuery);
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
		return _muniLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public MuniLocalService getWrappedService() {
		return _muniLocalService;
	}

	@Override
	public void setWrappedService(MuniLocalService muniLocalService) {
		_muniLocalService = muniLocalService;
	}

	private MuniLocalService _muniLocalService;
}