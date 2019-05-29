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
 * Provides the local service utility for UccAssociation. This utility wraps
 * {@link ucc.portal.service.impl.UccAssociationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see UccAssociationLocalService
 * @see ucc.portal.service.base.UccAssociationLocalServiceBaseImpl
 * @see ucc.portal.service.impl.UccAssociationLocalServiceImpl
 * @generated
 */
@ProviderType
public class UccAssociationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ucc.portal.service.impl.UccAssociationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ucc association to the database. Also notifies the appropriate model listeners.
	*
	* @param uccAssociation the ucc association
	* @return the ucc association that was added
	*/
	public static ucc.portal.model.UccAssociation addUccAssociation(
		ucc.portal.model.UccAssociation uccAssociation) {
		return getService().addUccAssociation(uccAssociation);
	}

	/**
	* Creates a new ucc association with the primary key. Does not add the ucc association to the database.
	*
	* @param uccAssociationId the primary key for the new ucc association
	* @return the new ucc association
	*/
	public static ucc.portal.model.UccAssociation createUccAssociation(
		int uccAssociationId) {
		return getService().createUccAssociation(uccAssociationId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the ucc association with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccAssociationId the primary key of the ucc association
	* @return the ucc association that was removed
	* @throws PortalException if a ucc association with the primary key could not be found
	*/
	public static ucc.portal.model.UccAssociation deleteUccAssociation(
		int uccAssociationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteUccAssociation(uccAssociationId);
	}

	/**
	* Deletes the ucc association from the database. Also notifies the appropriate model listeners.
	*
	* @param uccAssociation the ucc association
	* @return the ucc association that was removed
	*/
	public static ucc.portal.model.UccAssociation deleteUccAssociation(
		ucc.portal.model.UccAssociation uccAssociation) {
		return getService().deleteUccAssociation(uccAssociation);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static ucc.portal.model.UccAssociation fetchUccAssociation(
		int uccAssociationId) {
		return getService().fetchUccAssociation(uccAssociationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
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
	* Returns the ucc association with the primary key.
	*
	* @param uccAssociationId the primary key of the ucc association
	* @return the ucc association
	* @throws PortalException if a ucc association with the primary key could not be found
	*/
	public static ucc.portal.model.UccAssociation getUccAssociation(
		int uccAssociationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUccAssociation(uccAssociationId);
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
	public static java.util.List<ucc.portal.model.UccAssociation> getUccAssociations(
		int start, int end) {
		return getService().getUccAssociations(start, end);
	}

	/**
	* Returns the number of ucc associations.
	*
	* @return the number of ucc associations
	*/
	public static int getUccAssociationsCount() {
		return getService().getUccAssociationsCount();
	}

	/**
	* Updates the ucc association in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param uccAssociation the ucc association
	* @return the ucc association that was updated
	*/
	public static ucc.portal.model.UccAssociation updateUccAssociation(
		ucc.portal.model.UccAssociation uccAssociation) {
		return getService().updateUccAssociation(uccAssociation);
	}

	public static UccAssociationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UccAssociationLocalService, UccAssociationLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UccAssociationLocalService.class);

		ServiceTracker<UccAssociationLocalService, UccAssociationLocalService> serviceTracker =
			new ServiceTracker<UccAssociationLocalService, UccAssociationLocalService>(bundle.getBundleContext(),
				UccAssociationLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}