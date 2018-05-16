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
 * Provides a wrapper for {@link CCALocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CCALocalService
 * @generated
 */
@ProviderType
public class CCALocalServiceWrapper implements CCALocalService,
	ServiceWrapper<CCALocalService> {
	public CCALocalServiceWrapper(CCALocalService ccaLocalService) {
		_ccaLocalService = ccaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ccaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ccaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ccaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ccaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ccaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the cca to the database. Also notifies the appropriate model listeners.
	*
	* @param cca the cca
	* @return the cca that was added
	*/
	@Override
	public contact.manager.service.model.CCA addCCA(
		contact.manager.service.model.CCA cca) {
		return _ccaLocalService.addCCA(cca);
	}

	/**
	* Creates a new cca with the primary key. Does not add the cca to the database.
	*
	* @param ccaId the primary key for the new cca
	* @return the new cca
	*/
	@Override
	public contact.manager.service.model.CCA createCCA(long ccaId) {
		return _ccaLocalService.createCCA(ccaId);
	}

	/**
	* Deletes the cca from the database. Also notifies the appropriate model listeners.
	*
	* @param cca the cca
	* @return the cca that was removed
	*/
	@Override
	public contact.manager.service.model.CCA deleteCCA(
		contact.manager.service.model.CCA cca) {
		return _ccaLocalService.deleteCCA(cca);
	}

	/**
	* Deletes the cca with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ccaId the primary key of the cca
	* @return the cca that was removed
	* @throws PortalException if a cca with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.CCA deleteCCA(long ccaId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ccaLocalService.deleteCCA(ccaId);
	}

	@Override
	public contact.manager.service.model.CCA fetchCCA(long ccaId) {
		return _ccaLocalService.fetchCCA(ccaId);
	}

	/**
	* Returns the cca with the primary key.
	*
	* @param ccaId the primary key of the cca
	* @return the cca
	* @throws PortalException if a cca with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.CCA getCCA(long ccaId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ccaLocalService.getCCA(ccaId);
	}

	/**
	* Updates the cca in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cca the cca
	* @return the cca that was updated
	*/
	@Override
	public contact.manager.service.model.CCA updateCCA(
		contact.manager.service.model.CCA cca) {
		return _ccaLocalService.updateCCA(cca);
	}

	/**
	* Returns the number of ccas.
	*
	* @return the number of ccas
	*/
	@Override
	public int getCCAsCount() {
		return _ccaLocalService.getCCAsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ccaLocalService.getOSGiServiceIdentifier();
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
		return _ccaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ccaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ccaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the ccas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ccas
	* @param end the upper bound of the range of ccas (not inclusive)
	* @return the range of ccas
	*/
	@Override
	public java.util.List<contact.manager.service.model.CCA> getCCAs(
		int start, int end) {
		return _ccaLocalService.getCCAs(start, end);
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
		return _ccaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ccaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CCALocalService getWrappedService() {
		return _ccaLocalService;
	}

	@Override
	public void setWrappedService(CCALocalService ccaLocalService) {
		_ccaLocalService = ccaLocalService;
	}

	private CCALocalService _ccaLocalService;
}