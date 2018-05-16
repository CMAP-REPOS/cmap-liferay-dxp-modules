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
 * Provides a wrapper for {@link OutreachLogLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OutreachLogLocalService
 * @generated
 */
@ProviderType
public class OutreachLogLocalServiceWrapper implements OutreachLogLocalService,
	ServiceWrapper<OutreachLogLocalService> {
	public OutreachLogLocalServiceWrapper(
		OutreachLogLocalService outreachLogLocalService) {
		_outreachLogLocalService = outreachLogLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _outreachLogLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _outreachLogLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _outreachLogLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _outreachLogLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _outreachLogLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the outreach log to the database. Also notifies the appropriate model listeners.
	*
	* @param outreachLog the outreach log
	* @return the outreach log that was added
	*/
	@Override
	public contact.manager.service.model.OutreachLog addOutreachLog(
		contact.manager.service.model.OutreachLog outreachLog) {
		return _outreachLogLocalService.addOutreachLog(outreachLog);
	}

	/**
	* Creates a new outreach log with the primary key. Does not add the outreach log to the database.
	*
	* @param id the primary key for the new outreach log
	* @return the new outreach log
	*/
	@Override
	public contact.manager.service.model.OutreachLog createOutreachLog(long id) {
		return _outreachLogLocalService.createOutreachLog(id);
	}

	/**
	* Deletes the outreach log from the database. Also notifies the appropriate model listeners.
	*
	* @param outreachLog the outreach log
	* @return the outreach log that was removed
	*/
	@Override
	public contact.manager.service.model.OutreachLog deleteOutreachLog(
		contact.manager.service.model.OutreachLog outreachLog) {
		return _outreachLogLocalService.deleteOutreachLog(outreachLog);
	}

	/**
	* Deletes the outreach log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the outreach log
	* @return the outreach log that was removed
	* @throws PortalException if a outreach log with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.OutreachLog deleteOutreachLog(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _outreachLogLocalService.deleteOutreachLog(id);
	}

	@Override
	public contact.manager.service.model.OutreachLog fetchOutreachLog(long id) {
		return _outreachLogLocalService.fetchOutreachLog(id);
	}

	/**
	* Returns the outreach log with the primary key.
	*
	* @param id the primary key of the outreach log
	* @return the outreach log
	* @throws PortalException if a outreach log with the primary key could not be found
	*/
	@Override
	public contact.manager.service.model.OutreachLog getOutreachLog(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _outreachLogLocalService.getOutreachLog(id);
	}

	/**
	* Updates the outreach log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param outreachLog the outreach log
	* @return the outreach log that was updated
	*/
	@Override
	public contact.manager.service.model.OutreachLog updateOutreachLog(
		contact.manager.service.model.OutreachLog outreachLog) {
		return _outreachLogLocalService.updateOutreachLog(outreachLog);
	}

	/**
	* Returns the number of outreach logs.
	*
	* @return the number of outreach logs
	*/
	@Override
	public int getOutreachLogsCount() {
		return _outreachLogLocalService.getOutreachLogsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _outreachLogLocalService.getOSGiServiceIdentifier();
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
		return _outreachLogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _outreachLogLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _outreachLogLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the outreach logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of outreach logs
	* @param end the upper bound of the range of outreach logs (not inclusive)
	* @return the range of outreach logs
	*/
	@Override
	public java.util.List<contact.manager.service.model.OutreachLog> getOutreachLogs(
		int start, int end) {
		return _outreachLogLocalService.getOutreachLogs(start, end);
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
		return _outreachLogLocalService.dynamicQueryCount(dynamicQuery);
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
		return _outreachLogLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public OutreachLogLocalService getWrappedService() {
		return _outreachLogLocalService;
	}

	@Override
	public void setWrappedService(
		OutreachLogLocalService outreachLogLocalService) {
		_outreachLogLocalService = outreachLogLocalService;
	}

	private OutreachLogLocalService _outreachLogLocalService;
}