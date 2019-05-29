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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ExtValidation. This utility wraps
 * {@link ucc.portal.service.impl.ExtValidationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ExtValidationLocalService
 * @see ucc.portal.service.base.ExtValidationLocalServiceBaseImpl
 * @see ucc.portal.service.impl.ExtValidationLocalServiceImpl
 * @generated
 */
@ProviderType
public class ExtValidationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ucc.portal.service.impl.ExtValidationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ext validation to the database. Also notifies the appropriate model listeners.
	*
	* @param extValidation the ext validation
	* @return the ext validation that was added
	*/
	public static ucc.portal.model.ExtValidation addExtValidation(
		ucc.portal.model.ExtValidation extValidation) {
		return getService().addExtValidation(extValidation);
	}

	/**
	* Creates a new ext validation with the primary key. Does not add the ext validation to the database.
	*
	* @param extValidationId the primary key for the new ext validation
	* @return the new ext validation
	*/
	public static ucc.portal.model.ExtValidation createExtValidation(
		long extValidationId) {
		return getService().createExtValidation(extValidationId);
	}

	/**
	* Deletes the ext validation from the database. Also notifies the appropriate model listeners.
	*
	* @param extValidation the ext validation
	* @return the ext validation that was removed
	*/
	public static ucc.portal.model.ExtValidation deleteExtValidation(
		ucc.portal.model.ExtValidation extValidation) {
		return getService().deleteExtValidation(extValidation);
	}

	/**
	* Deletes the ext validation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extValidationId the primary key of the ext validation
	* @return the ext validation that was removed
	* @throws PortalException if a ext validation with the primary key could not be found
	*/
	public static ucc.portal.model.ExtValidation deleteExtValidation(
		long extValidationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteExtValidation(extValidationId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ucc.portal.model.ExtValidation fetchExtValidation(
		long extValidationId) {
		return getService().fetchExtValidation(extValidationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the ext validation with the primary key.
	*
	* @param extValidationId the primary key of the ext validation
	* @return the ext validation
	* @throws PortalException if a ext validation with the primary key could not be found
	*/
	public static ucc.portal.model.ExtValidation getExtValidation(
		long extValidationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getExtValidation(extValidationId);
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
	public static java.util.List<ucc.portal.model.ExtValidation> getExtValidations(
		int start, int end) {
		return getService().getExtValidations(start, end);
	}

	/**
	* Returns the number of ext validations.
	*
	* @return the number of ext validations
	*/
	public static int getExtValidationsCount() {
		return getService().getExtValidationsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the ext validation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param extValidation the ext validation
	* @return the ext validation that was updated
	*/
	public static ucc.portal.model.ExtValidation updateExtValidation(
		ucc.portal.model.ExtValidation extValidation) {
		return getService().updateExtValidation(extValidation);
	}

	public static ExtValidationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ExtValidationLocalService, ExtValidationLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ExtValidationLocalService.class);

		ServiceTracker<ExtValidationLocalService, ExtValidationLocalService> serviceTracker =
			new ServiceTracker<ExtValidationLocalService, ExtValidationLocalService>(bundle.getBundleContext(),
				ExtValidationLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}