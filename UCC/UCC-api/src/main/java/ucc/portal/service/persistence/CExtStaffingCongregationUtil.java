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

import ucc.portal.model.CExtStaffingCongregation;

import java.util.List;

/**
 * The persistence utility for the c ext staffing congregation service. This utility wraps {@link ucc.portal.service.persistence.impl.CExtStaffingCongregationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtStaffingCongregationPersistence
 * @see ucc.portal.service.persistence.impl.CExtStaffingCongregationPersistenceImpl
 * @generated
 */
@ProviderType
public class CExtStaffingCongregationUtil {
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
	public static void clearCache(
		CExtStaffingCongregation cExtStaffingCongregation) {
		getPersistence().clearCache(cExtStaffingCongregation);
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
	public static List<CExtStaffingCongregation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CExtStaffingCongregation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CExtStaffingCongregation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CExtStaffingCongregation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CExtStaffingCongregation update(
		CExtStaffingCongregation cExtStaffingCongregation) {
		return getPersistence().update(cExtStaffingCongregation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CExtStaffingCongregation update(
		CExtStaffingCongregation cExtStaffingCongregation,
		ServiceContext serviceContext) {
		return getPersistence().update(cExtStaffingCongregation, serviceContext);
	}

	/**
	* Returns all the c ext staffing congregations where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching c ext staffing congregations
	*/
	public static List<CExtStaffingCongregation> findByOrganizationId(
		long organizationId) {
		return getPersistence().findByOrganizationId(organizationId);
	}

	/**
	* Returns a range of all the c ext staffing congregations where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @return the range of matching c ext staffing congregations
	*/
	public static List<CExtStaffingCongregation> findByOrganizationId(
		long organizationId, int start, int end) {
		return getPersistence().findByOrganizationId(organizationId, start, end);
	}

	/**
	* Returns an ordered range of all the c ext staffing congregations where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching c ext staffing congregations
	*/
	public static List<CExtStaffingCongregation> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtStaffingCongregation> orderByComparator) {
		return getPersistence()
				   .findByOrganizationId(organizationId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the c ext staffing congregations where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching c ext staffing congregations
	*/
	public static List<CExtStaffingCongregation> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtStaffingCongregation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOrganizationId(organizationId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first c ext staffing congregation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext staffing congregation
	* @throws NoSuchCExtStaffingCongregationException if a matching c ext staffing congregation could not be found
	*/
	public static CExtStaffingCongregation findByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtStaffingCongregation> orderByComparator)
		throws ucc.portal.exception.NoSuchCExtStaffingCongregationException {
		return getPersistence()
				   .findByOrganizationId_First(organizationId, orderByComparator);
	}

	/**
	* Returns the first c ext staffing congregation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext staffing congregation, or <code>null</code> if a matching c ext staffing congregation could not be found
	*/
	public static CExtStaffingCongregation fetchByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtStaffingCongregation> orderByComparator) {
		return getPersistence()
				   .fetchByOrganizationId_First(organizationId,
			orderByComparator);
	}

	/**
	* Returns the last c ext staffing congregation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext staffing congregation
	* @throws NoSuchCExtStaffingCongregationException if a matching c ext staffing congregation could not be found
	*/
	public static CExtStaffingCongregation findByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtStaffingCongregation> orderByComparator)
		throws ucc.portal.exception.NoSuchCExtStaffingCongregationException {
		return getPersistence()
				   .findByOrganizationId_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the last c ext staffing congregation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext staffing congregation, or <code>null</code> if a matching c ext staffing congregation could not be found
	*/
	public static CExtStaffingCongregation fetchByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtStaffingCongregation> orderByComparator) {
		return getPersistence()
				   .fetchByOrganizationId_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the c ext staffing congregations before and after the current c ext staffing congregation in the ordered set where organizationId = &#63;.
	*
	* @param cExtStaffingCongregationPK the primary key of the current c ext staffing congregation
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next c ext staffing congregation
	* @throws NoSuchCExtStaffingCongregationException if a c ext staffing congregation with the primary key could not be found
	*/
	public static CExtStaffingCongregation[] findByOrganizationId_PrevAndNext(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK,
		long organizationId,
		OrderByComparator<CExtStaffingCongregation> orderByComparator)
		throws ucc.portal.exception.NoSuchCExtStaffingCongregationException {
		return getPersistence()
				   .findByOrganizationId_PrevAndNext(cExtStaffingCongregationPK,
			organizationId, orderByComparator);
	}

	/**
	* Removes all the c ext staffing congregations where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	*/
	public static void removeByOrganizationId(long organizationId) {
		getPersistence().removeByOrganizationId(organizationId);
	}

	/**
	* Returns the number of c ext staffing congregations where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching c ext staffing congregations
	*/
	public static int countByOrganizationId(long organizationId) {
		return getPersistence().countByOrganizationId(organizationId);
	}

	/**
	* Caches the c ext staffing congregation in the entity cache if it is enabled.
	*
	* @param cExtStaffingCongregation the c ext staffing congregation
	*/
	public static void cacheResult(
		CExtStaffingCongregation cExtStaffingCongregation) {
		getPersistence().cacheResult(cExtStaffingCongregation);
	}

	/**
	* Caches the c ext staffing congregations in the entity cache if it is enabled.
	*
	* @param cExtStaffingCongregations the c ext staffing congregations
	*/
	public static void cacheResult(
		List<CExtStaffingCongregation> cExtStaffingCongregations) {
		getPersistence().cacheResult(cExtStaffingCongregations);
	}

	/**
	* Creates a new c ext staffing congregation with the primary key. Does not add the c ext staffing congregation to the database.
	*
	* @param cExtStaffingCongregationPK the primary key for the new c ext staffing congregation
	* @return the new c ext staffing congregation
	*/
	public static CExtStaffingCongregation create(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK) {
		return getPersistence().create(cExtStaffingCongregationPK);
	}

	/**
	* Removes the c ext staffing congregation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtStaffingCongregationPK the primary key of the c ext staffing congregation
	* @return the c ext staffing congregation that was removed
	* @throws NoSuchCExtStaffingCongregationException if a c ext staffing congregation with the primary key could not be found
	*/
	public static CExtStaffingCongregation remove(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK)
		throws ucc.portal.exception.NoSuchCExtStaffingCongregationException {
		return getPersistence().remove(cExtStaffingCongregationPK);
	}

	public static CExtStaffingCongregation updateImpl(
		CExtStaffingCongregation cExtStaffingCongregation) {
		return getPersistence().updateImpl(cExtStaffingCongregation);
	}

	/**
	* Returns the c ext staffing congregation with the primary key or throws a {@link NoSuchCExtStaffingCongregationException} if it could not be found.
	*
	* @param cExtStaffingCongregationPK the primary key of the c ext staffing congregation
	* @return the c ext staffing congregation
	* @throws NoSuchCExtStaffingCongregationException if a c ext staffing congregation with the primary key could not be found
	*/
	public static CExtStaffingCongregation findByPrimaryKey(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK)
		throws ucc.portal.exception.NoSuchCExtStaffingCongregationException {
		return getPersistence().findByPrimaryKey(cExtStaffingCongregationPK);
	}

	/**
	* Returns the c ext staffing congregation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cExtStaffingCongregationPK the primary key of the c ext staffing congregation
	* @return the c ext staffing congregation, or <code>null</code> if a c ext staffing congregation with the primary key could not be found
	*/
	public static CExtStaffingCongregation fetchByPrimaryKey(
		ucc.portal.service.persistence.CExtStaffingCongregationPK cExtStaffingCongregationPK) {
		return getPersistence().fetchByPrimaryKey(cExtStaffingCongregationPK);
	}

	public static java.util.Map<java.io.Serializable, CExtStaffingCongregation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the c ext staffing congregations.
	*
	* @return the c ext staffing congregations
	*/
	public static List<CExtStaffingCongregation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the c ext staffing congregations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @return the range of c ext staffing congregations
	*/
	public static List<CExtStaffingCongregation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the c ext staffing congregations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c ext staffing congregations
	*/
	public static List<CExtStaffingCongregation> findAll(int start, int end,
		OrderByComparator<CExtStaffingCongregation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the c ext staffing congregations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtStaffingCongregationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext staffing congregations
	* @param end the upper bound of the range of c ext staffing congregations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of c ext staffing congregations
	*/
	public static List<CExtStaffingCongregation> findAll(int start, int end,
		OrderByComparator<CExtStaffingCongregation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the c ext staffing congregations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of c ext staffing congregations.
	*
	* @return the number of c ext staffing congregations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static CExtStaffingCongregationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CExtStaffingCongregationPersistence, CExtStaffingCongregationPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CExtStaffingCongregationPersistence.class);

		ServiceTracker<CExtStaffingCongregationPersistence, CExtStaffingCongregationPersistence> serviceTracker =
			new ServiceTracker<CExtStaffingCongregationPersistence, CExtStaffingCongregationPersistence>(bundle.getBundleContext(),
				CExtStaffingCongregationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}