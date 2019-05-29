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
 * Provides a wrapper for {@link ExtValidationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExtValidationLocalService
 * @generated
 */
@ProviderType
public class ExtValidationLocalServiceWrapper
	implements ExtValidationLocalService,
		ServiceWrapper<ExtValidationLocalService> {
	public ExtValidationLocalServiceWrapper(
		ExtValidationLocalService extValidationLocalService) {
		_extValidationLocalService = extValidationLocalService;
	}

	/**
	* Adds the ext validation to the database. Also notifies the appropriate model listeners.
	*
	* @param extValidation the ext validation
	* @return the ext validation that was added
	*/
	@Override
	public ucc.portal.model.ExtValidation addExtValidation(
		ucc.portal.model.ExtValidation extValidation) {
		return _extValidationLocalService.addExtValidation(extValidation);
	}

	/**
	* Creates a new ext validation with the primary key. Does not add the ext validation to the database.
	*
	* @param extValidationId the primary key for the new ext validation
	* @return the new ext validation
	*/
	@Override
	public ucc.portal.model.ExtValidation createExtValidation(
		long extValidationId) {
		return _extValidationLocalService.createExtValidation(extValidationId);
	}

	/**
	* Deletes the ext validation from the database. Also notifies the appropriate model listeners.
	*
	* @param extValidation the ext validation
	* @return the ext validation that was removed
	*/
	@Override
	public ucc.portal.model.ExtValidation deleteExtValidation(
		ucc.portal.model.ExtValidation extValidation) {
		return _extValidationLocalService.deleteExtValidation(extValidation);
	}

	/**
	* Deletes the ext validation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extValidationId the primary key of the ext validation
	* @return the ext validation that was removed
	* @throws PortalException if a ext validation with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.ExtValidation deleteExtValidation(
		long extValidationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _extValidationLocalService.deleteExtValidation(extValidationId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _extValidationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _extValidationLocalService.dynamicQuery();
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
		return _extValidationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _extValidationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _extValidationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _extValidationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _extValidationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ucc.portal.model.ExtValidation fetchExtValidation(
		long extValidationId) {
		return _extValidationLocalService.fetchExtValidation(extValidationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _extValidationLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the ext validation with the primary key.
	*
	* @param extValidationId the primary key of the ext validation
	* @return the ext validation
	* @throws PortalException if a ext validation with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.ExtValidation getExtValidation(long extValidationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _extValidationLocalService.getExtValidation(extValidationId);
	}

	/**
	* Returns a range of all the ext validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.ExtValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext validations
	* @param end the upper bound of the range of ext validations (not inclusive)
	* @return the range of ext validations
	*/
	@Override
	public java.util.List<ucc.portal.model.ExtValidation> getExtValidations(
		int start, int end) {
		return _extValidationLocalService.getExtValidations(start, end);
	}

	/**
	* Returns the number of ext validations.
	*
	* @return the number of ext validations
	*/
	@Override
	public int getExtValidationsCount() {
		return _extValidationLocalService.getExtValidationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _extValidationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _extValidationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _extValidationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the ext validation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param extValidation the ext validation
	* @return the ext validation that was updated
	*/
	@Override
	public ucc.portal.model.ExtValidation updateExtValidation(
		ucc.portal.model.ExtValidation extValidation) {
		return _extValidationLocalService.updateExtValidation(extValidation);
	}

	@Override
	public ExtValidationLocalService getWrappedService() {
		return _extValidationLocalService;
	}

	@Override
	public void setWrappedService(
		ExtValidationLocalService extValidationLocalService) {
		_extValidationLocalService = extValidationLocalService;
	}

	private ExtValidationLocalService _extValidationLocalService;
}