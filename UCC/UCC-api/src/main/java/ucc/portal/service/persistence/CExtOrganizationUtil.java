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

package ucc.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import ucc.portal.model.CExtOrganization;

import java.util.List;

/**
 * The persistence utility for the c ext organization service. This utility wraps {@link ucc.portal.service.persistence.impl.CExtOrganizationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtOrganizationPersistence
 * @see ucc.portal.service.persistence.impl.CExtOrganizationPersistenceImpl
 * @generated
 */
@ProviderType
public class CExtOrganizationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CExtOrganization cExtOrganization) {
		getPersistence().clearCache(cExtOrganization);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CExtOrganization> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CExtOrganization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CExtOrganization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CExtOrganization> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CExtOrganization update(CExtOrganization cExtOrganization) {
		return getPersistence().update(cExtOrganization);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CExtOrganization update(CExtOrganization cExtOrganization,
		ServiceContext serviceContext) {
		return getPersistence().update(cExtOrganization, serviceContext);
	}

	/**
	* Caches the c ext organization in the entity cache if it is enabled.
	*
	* @param cExtOrganization the c ext organization
	*/
	public static void cacheResult(CExtOrganization cExtOrganization) {
		getPersistence().cacheResult(cExtOrganization);
	}

	/**
	* Caches the c ext organizations in the entity cache if it is enabled.
	*
	* @param cExtOrganizations the c ext organizations
	*/
	public static void cacheResult(List<CExtOrganization> cExtOrganizations) {
		getPersistence().cacheResult(cExtOrganizations);
	}

	/**
	* Creates a new c ext organization with the primary key. Does not add the c ext organization to the database.
	*
	* @param organizationId the primary key for the new c ext organization
	* @return the new c ext organization
	*/
	public static CExtOrganization create(long organizationId) {
		return getPersistence().create(organizationId);
	}

	/**
	* Removes the c ext organization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param organizationId the primary key of the c ext organization
	* @return the c ext organization that was removed
	* @throws NoSuchCExtOrganizationException if a c ext organization with the primary key could not be found
	*/
	public static CExtOrganization remove(long organizationId)
		throws ucc.portal.exception.NoSuchCExtOrganizationException {
		return getPersistence().remove(organizationId);
	}

	public static CExtOrganization updateImpl(CExtOrganization cExtOrganization) {
		return getPersistence().updateImpl(cExtOrganization);
	}

	/**
	* Returns the c ext organization with the primary key or throws a {@link NoSuchCExtOrganizationException} if it could not be found.
	*
	* @param organizationId the primary key of the c ext organization
	* @return the c ext organization
	* @throws NoSuchCExtOrganizationException if a c ext organization with the primary key could not be found
	*/
	public static CExtOrganization findByPrimaryKey(long organizationId)
		throws ucc.portal.exception.NoSuchCExtOrganizationException {
		return getPersistence().findByPrimaryKey(organizationId);
	}

	/**
	* Returns the c ext organization with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param organizationId the primary key of the c ext organization
	* @return the c ext organization, or <code>null</code> if a c ext organization with the primary key could not be found
	*/
	public static CExtOrganization fetchByPrimaryKey(long organizationId) {
		return getPersistence().fetchByPrimaryKey(organizationId);
	}

	public static java.util.Map<java.io.Serializable, CExtOrganization> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the c ext organizations.
	*
	* @return the c ext organizations
	*/
	public static List<CExtOrganization> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the c ext organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext organizations
	* @param end the upper bound of the range of c ext organizations (not inclusive)
	* @return the range of c ext organizations
	*/
	public static List<CExtOrganization> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the c ext organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext organizations
	* @param end the upper bound of the range of c ext organizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c ext organizations
	*/
	public static List<CExtOrganization> findAll(int start, int end,
		OrderByComparator<CExtOrganization> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the c ext organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext organizations
	* @param end the upper bound of the range of c ext organizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of c ext organizations
	*/
	public static List<CExtOrganization> findAll(int start, int end,
		OrderByComparator<CExtOrganization> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the c ext organizations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of c ext organizations.
	*
	* @return the number of c ext organizations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CExtOrganizationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CExtOrganizationPersistence, CExtOrganizationPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CExtOrganizationPersistence.class);

		ServiceTracker<CExtOrganizationPersistence, CExtOrganizationPersistence> serviceTracker =
			new ServiceTracker<CExtOrganizationPersistence, CExtOrganizationPersistence>(bundle.getBundleContext(),
				CExtOrganizationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}