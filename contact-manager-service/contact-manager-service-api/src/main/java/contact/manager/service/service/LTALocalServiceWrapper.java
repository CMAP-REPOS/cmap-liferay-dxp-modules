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
 * Provides a wrapper for {@link LTALocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LTALocalService
 * @generated
 */
@ProviderType
public class LTALocalServiceWrapper implements LTALocalService,
	ServiceWrapper<LTALocalService> {
	public LTALocalServiceWrapper(LTALocalService ltaLocalService) {
		_ltaLocalService = ltaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ltaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ltaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ltaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ltaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ltaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the lta to the database. Also notifies the appropriate model listeners.
	*
	* @param lta the lta
	* @return the lta that was added
	*/
	@Override
	public contact.manager.service.model.LTA addLTA(
		contact.manager.service.model.LTA lta) {
		return _ltaLocalService.addLTA(lta);
	}

	/**
	* Creates a new lta with the primary key. Does not add the lta to the database.
	*
	* @param ltaId the primary key for the new lta
	* @return the new lta
	*/
	@Override
	public contact.manager.service.model.LTA createLTA(long ltaId) {
		return _ltaLocalService.createLTA(ltaId);
	}

	/**
	* Deletes the lta from the database. Also notifies the appropriate model listeners.
	*
	* @param lta the lta
	* @return the lta that was removed
	*/
	@Override
	public contact.manager.service.model.LTA deleteLTA(
		contact.manager.service.model.LTA lta) {
		return _ltaLocalService.deleteLTA(lta);
	}

	/**
	* Deletes the lta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ltaId the primary key of the lta
	* @return the lta that was removed
	* @throws PortalException if a lta with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.LTA deleteLTA(long ltaId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ltaLocalService.deleteLTA(ltaId);
	}

	@Override
	public contact.manager.service.model.LTA fetchLTA(long ltaId) {
		return _ltaLocalService.fetchLTA(ltaId);
	}

	/**
	* Returns the lta with the primary key.
	*
	* @param ltaId the primary key of the lta
	* @return the lta
	* @throws PortalException if a lta with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.LTA getLTA(long ltaId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ltaLocalService.getLTA(ltaId);
	}

	/**
	* Updates the lta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lta the lta
	* @return the lta that was updated
	*/
	@Override
	public contact.manager.service.model.LTA updateLTA(
		contact.manager.service.model.LTA lta) {
		return _ltaLocalService.updateLTA(lta);
	}

	/**
	* Returns the number of ltas.
	*
	* @return the number of ltas
	*/
	@Override
	public int getLTAsCount() {
		return _ltaLocalService.getLTAsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ltaLocalService.getOSGiServiceIdentifier();
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
		return _ltaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ltaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ltaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the ltas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @return the range of ltas
	*/
	@Override
	public java.util.List<contact.manager.service.model.LTA> getLTAs(
		int start, int end) {
		return _ltaLocalService.getLTAs(start, end);
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
		return _ltaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ltaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public LTALocalService getWrappedService() {
		return _ltaLocalService;
	}

	@Override
	public void setWrappedService(LTALocalService ltaLocalService) {
		_ltaLocalService = ltaLocalService;
	}

	private LTALocalService _ltaLocalService;
}