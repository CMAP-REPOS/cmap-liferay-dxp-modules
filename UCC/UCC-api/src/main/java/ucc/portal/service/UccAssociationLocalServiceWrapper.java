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
 * Provides a wrapper for {@link UccAssociationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UccAssociationLocalService
 * @generated
 */
@ProviderType
public class UccAssociationLocalServiceWrapper
	implements UccAssociationLocalService,
		ServiceWrapper<UccAssociationLocalService> {
	public UccAssociationLocalServiceWrapper(
		UccAssociationLocalService uccAssociationLocalService) {
		_uccAssociationLocalService = uccAssociationLocalService;
	}

	/**
	* Adds the ucc association to the database. Also notifies the appropriate model listeners.
	*
	* @param uccAssociation the ucc association
	* @return the ucc association that was added
	*/
	@Override
	public ucc.portal.model.UccAssociation addUccAssociation(
		ucc.portal.model.UccAssociation uccAssociation) {
		return _uccAssociationLocalService.addUccAssociation(uccAssociation);
	}

	/**
	* Creates a new ucc association with the primary key. Does not add the ucc association to the database.
	*
	* @param uccAssociationId the primary key for the new ucc association
	* @return the new ucc association
	*/
	@Override
	public ucc.portal.model.UccAssociation createUccAssociation(
		int uccAssociationId) {
		return _uccAssociationLocalService.createUccAssociation(uccAssociationId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _uccAssociationLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the ucc association with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccAssociationId the primary key of the ucc association
	* @return the ucc association that was removed
	* @throws PortalException if a ucc association with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.UccAssociation deleteUccAssociation(
		int uccAssociationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _uccAssociationLocalService.deleteUccAssociation(uccAssociationId);
	}

	/**
	* Deletes the ucc association from the database. Also notifies the appropriate model listeners.
	*
	* @param uccAssociation the ucc association
	* @return the ucc association that was removed
	*/
	@Override
	public ucc.portal.model.UccAssociation deleteUccAssociation(
		ucc.portal.model.UccAssociation uccAssociation) {
		return _uccAssociationLocalService.deleteUccAssociation(uccAssociation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _uccAssociationLocalService.dynamicQuery();
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
		return _uccAssociationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _uccAssociationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _uccAssociationLocalService.dynamicQuery(dynamicQuery, start,
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
		return _uccAssociationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _uccAssociationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ucc.portal.model.UccAssociation fetchUccAssociation(
		int uccAssociationId) {
		return _uccAssociationLocalService.fetchUccAssociation(uccAssociationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _uccAssociationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _uccAssociationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _uccAssociationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _uccAssociationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the ucc association with the primary key.
	*
	* @param uccAssociationId the primary key of the ucc association
	* @return the ucc association
	* @throws PortalException if a ucc association with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.UccAssociation getUccAssociation(
		int uccAssociationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _uccAssociationLocalService.getUccAssociation(uccAssociationId);
	}

	/**
	* Returns a range of all the ucc associations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @return the range of ucc associations
	*/
	@Override
	public java.util.List<ucc.portal.model.UccAssociation> getUccAssociations(
		int start, int end) {
		return _uccAssociationLocalService.getUccAssociations(start, end);
	}

	/**
	* Returns the number of ucc associations.
	*
	* @return the number of ucc associations
	*/
	@Override
	public int getUccAssociationsCount() {
		return _uccAssociationLocalService.getUccAssociationsCount();
	}

	/**
	* Updates the ucc association in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param uccAssociation the ucc association
	* @return the ucc association that was updated
	*/
	@Override
	public ucc.portal.model.UccAssociation updateUccAssociation(
		ucc.portal.model.UccAssociation uccAssociation) {
		return _uccAssociationLocalService.updateUccAssociation(uccAssociation);
	}

	@Override
	public UccAssociationLocalService getWrappedService() {
		return _uccAssociationLocalService;
	}

	@Override
	public void setWrappedService(
		UccAssociationLocalService uccAssociationLocalService) {
		_uccAssociationLocalService = uccAssociationLocalService;
	}

	private UccAssociationLocalService _uccAssociationLocalService;
}