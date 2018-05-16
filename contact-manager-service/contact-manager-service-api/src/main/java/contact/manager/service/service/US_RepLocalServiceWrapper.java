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
 * Provides a wrapper for {@link US_RepLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see US_RepLocalService
 * @generated
 */
@ProviderType
public class US_RepLocalServiceWrapper implements US_RepLocalService,
	ServiceWrapper<US_RepLocalService> {
	public US_RepLocalServiceWrapper(US_RepLocalService us_RepLocalService) {
		_us_RepLocalService = us_RepLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _us_RepLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _us_RepLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _us_RepLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _us_RepLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _us_RepLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the us_ rep to the database. Also notifies the appropriate model listeners.
	*
	* @param us_Rep the us_ rep
	* @return the us_ rep that was added
	*/
	@Override
	public contact.manager.service.model.US_Rep addUS_Rep(
		contact.manager.service.model.US_Rep us_Rep) {
		return _us_RepLocalService.addUS_Rep(us_Rep);
	}

	/**
	* Creates a new us_ rep with the primary key. Does not add the us_ rep to the database.
	*
	* @param usRepId the primary key for the new us_ rep
	* @return the new us_ rep
	*/
	@Override
	public contact.manager.service.model.US_Rep createUS_Rep(long usRepId) {
		return _us_RepLocalService.createUS_Rep(usRepId);
	}

	/**
	* Deletes the us_ rep from the database. Also notifies the appropriate model listeners.
	*
	* @param us_Rep the us_ rep
	* @return the us_ rep that was removed
	*/
	@Override
	public contact.manager.service.model.US_Rep deleteUS_Rep(
		contact.manager.service.model.US_Rep us_Rep) {
		return _us_RepLocalService.deleteUS_Rep(us_Rep);
	}

	/**
	* Deletes the us_ rep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param usRepId the primary key of the us_ rep
	* @return the us_ rep that was removed
	* @throws PortalException if a us_ rep with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.US_Rep deleteUS_Rep(long usRepId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _us_RepLocalService.deleteUS_Rep(usRepId);
	}

	@Override
	public contact.manager.service.model.US_Rep fetchUS_Rep(long usRepId) {
		return _us_RepLocalService.fetchUS_Rep(usRepId);
	}

	/**
	* Returns the us_ rep with the primary key.
	*
	* @param usRepId the primary key of the us_ rep
	* @return the us_ rep
	* @throws PortalException if a us_ rep with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.US_Rep getUS_Rep(long usRepId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _us_RepLocalService.getUS_Rep(usRepId);
	}

	/**
	* Updates the us_ rep in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param us_Rep the us_ rep
	* @return the us_ rep that was updated
	*/
	@Override
	public contact.manager.service.model.US_Rep updateUS_Rep(
		contact.manager.service.model.US_Rep us_Rep) {
		return _us_RepLocalService.updateUS_Rep(us_Rep);
	}

	/**
	* Returns the number of us_ reps.
	*
	* @return the number of us_ reps
	*/
	@Override
	public int getUS_RepsCount() {
		return _us_RepLocalService.getUS_RepsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _us_RepLocalService.getOSGiServiceIdentifier();
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
		return _us_RepLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _us_RepLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _us_RepLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the us_ reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.US_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of us_ reps
	* @param end the upper bound of the range of us_ reps (not inclusive)
	* @return the range of us_ reps
	*/
	@Override
	public java.util.List<contact.manager.service.model.US_Rep> getUS_Reps(
		int start, int end) {
		return _us_RepLocalService.getUS_Reps(start, end);
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
		return _us_RepLocalService.dynamicQueryCount(dynamicQuery);
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
		return _us_RepLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public US_RepLocalService getWrappedService() {
		return _us_RepLocalService;
	}

	@Override
	public void setWrappedService(US_RepLocalService us_RepLocalService) {
		_us_RepLocalService = us_RepLocalService;
	}

	private US_RepLocalService _us_RepLocalService;
}