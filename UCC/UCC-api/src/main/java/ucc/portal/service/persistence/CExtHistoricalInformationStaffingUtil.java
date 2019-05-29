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

import ucc.portal.model.CExtHistoricalInformationStaffing;

import java.util.List;

/**
 * The persistence utility for the c ext historical information staffing service. This utility wraps {@link ucc.portal.service.persistence.impl.CExtHistoricalInformationStaffingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtHistoricalInformationStaffingPersistence
 * @see ucc.portal.service.persistence.impl.CExtHistoricalInformationStaffingPersistenceImpl
 * @generated
 */
@ProviderType
public class CExtHistoricalInformationStaffingUtil {
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
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing) {
		getPersistence().clearCache(cExtHistoricalInformationStaffing);
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
	public static List<CExtHistoricalInformationStaffing> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CExtHistoricalInformationStaffing> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CExtHistoricalInformationStaffing> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CExtHistoricalInformationStaffing update(
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing) {
		return getPersistence().update(cExtHistoricalInformationStaffing);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CExtHistoricalInformationStaffing update(
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(cExtHistoricalInformationStaffing, serviceContext);
	}

	/**
	* Returns all the c ext historical information staffings where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching c ext historical information staffings
	*/
	public static List<CExtHistoricalInformationStaffing> findByOrganizationId(
		long organizationId) {
		return getPersistence().findByOrganizationId(organizationId);
	}

	/**
	* Returns a range of all the c ext historical information staffings where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext historical information staffings
	* @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	* @return the range of matching c ext historical information staffings
	*/
	public static List<CExtHistoricalInformationStaffing> findByOrganizationId(
		long organizationId, int start, int end) {
		return getPersistence().findByOrganizationId(organizationId, start, end);
	}

	/**
	* Returns an ordered range of all the c ext historical information staffings where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext historical information staffings
	* @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching c ext historical information staffings
	*/
	public static List<CExtHistoricalInformationStaffing> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator) {
		return getPersistence()
				   .findByOrganizationId(organizationId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the c ext historical information staffings where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext historical information staffings
	* @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching c ext historical information staffings
	*/
	public static List<CExtHistoricalInformationStaffing> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOrganizationId(organizationId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first c ext historical information staffing in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext historical information staffing
	* @throws NoSuchCExtHistoricalInformationStaffingException if a matching c ext historical information staffing could not be found
	*/
	public static CExtHistoricalInformationStaffing findByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator)
		throws ucc.portal.exception.NoSuchCExtHistoricalInformationStaffingException {
		return getPersistence()
				   .findByOrganizationId_First(organizationId, orderByComparator);
	}

	/**
	* Returns the first c ext historical information staffing in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext historical information staffing, or <code>null</code> if a matching c ext historical information staffing could not be found
	*/
	public static CExtHistoricalInformationStaffing fetchByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator) {
		return getPersistence()
				   .fetchByOrganizationId_First(organizationId,
			orderByComparator);
	}

	/**
	* Returns the last c ext historical information staffing in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext historical information staffing
	* @throws NoSuchCExtHistoricalInformationStaffingException if a matching c ext historical information staffing could not be found
	*/
	public static CExtHistoricalInformationStaffing findByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator)
		throws ucc.portal.exception.NoSuchCExtHistoricalInformationStaffingException {
		return getPersistence()
				   .findByOrganizationId_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the last c ext historical information staffing in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext historical information staffing, or <code>null</code> if a matching c ext historical information staffing could not be found
	*/
	public static CExtHistoricalInformationStaffing fetchByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator) {
		return getPersistence()
				   .fetchByOrganizationId_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the c ext historical information staffings before and after the current c ext historical information staffing in the ordered set where organizationId = &#63;.
	*
	* @param cExtHistoricalInformationStaffingPK the primary key of the current c ext historical information staffing
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next c ext historical information staffing
	* @throws NoSuchCExtHistoricalInformationStaffingException if a c ext historical information staffing with the primary key could not be found
	*/
	public static CExtHistoricalInformationStaffing[] findByOrganizationId_PrevAndNext(
		ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK,
		long organizationId,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator)
		throws ucc.portal.exception.NoSuchCExtHistoricalInformationStaffingException {
		return getPersistence()
				   .findByOrganizationId_PrevAndNext(cExtHistoricalInformationStaffingPK,
			organizationId, orderByComparator);
	}

	/**
	* Removes all the c ext historical information staffings where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	*/
	public static void removeByOrganizationId(long organizationId) {
		getPersistence().removeByOrganizationId(organizationId);
	}

	/**
	* Returns the number of c ext historical information staffings where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching c ext historical information staffings
	*/
	public static int countByOrganizationId(long organizationId) {
		return getPersistence().countByOrganizationId(organizationId);
	}

	/**
	* Caches the c ext historical information staffing in the entity cache if it is enabled.
	*
	* @param cExtHistoricalInformationStaffing the c ext historical information staffing
	*/
	public static void cacheResult(
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing) {
		getPersistence().cacheResult(cExtHistoricalInformationStaffing);
	}

	/**
	* Caches the c ext historical information staffings in the entity cache if it is enabled.
	*
	* @param cExtHistoricalInformationStaffings the c ext historical information staffings
	*/
	public static void cacheResult(
		List<CExtHistoricalInformationStaffing> cExtHistoricalInformationStaffings) {
		getPersistence().cacheResult(cExtHistoricalInformationStaffings);
	}

	/**
	* Creates a new c ext historical information staffing with the primary key. Does not add the c ext historical information staffing to the database.
	*
	* @param cExtHistoricalInformationStaffingPK the primary key for the new c ext historical information staffing
	* @return the new c ext historical information staffing
	*/
	public static CExtHistoricalInformationStaffing create(
		ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK) {
		return getPersistence().create(cExtHistoricalInformationStaffingPK);
	}

	/**
	* Removes the c ext historical information staffing with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtHistoricalInformationStaffingPK the primary key of the c ext historical information staffing
	* @return the c ext historical information staffing that was removed
	* @throws NoSuchCExtHistoricalInformationStaffingException if a c ext historical information staffing with the primary key could not be found
	*/
	public static CExtHistoricalInformationStaffing remove(
		ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK)
		throws ucc.portal.exception.NoSuchCExtHistoricalInformationStaffingException {
		return getPersistence().remove(cExtHistoricalInformationStaffingPK);
	}

	public static CExtHistoricalInformationStaffing updateImpl(
		CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing) {
		return getPersistence().updateImpl(cExtHistoricalInformationStaffing);
	}

	/**
	* Returns the c ext historical information staffing with the primary key or throws a {@link NoSuchCExtHistoricalInformationStaffingException} if it could not be found.
	*
	* @param cExtHistoricalInformationStaffingPK the primary key of the c ext historical information staffing
	* @return the c ext historical information staffing
	* @throws NoSuchCExtHistoricalInformationStaffingException if a c ext historical information staffing with the primary key could not be found
	*/
	public static CExtHistoricalInformationStaffing findByPrimaryKey(
		ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK)
		throws ucc.portal.exception.NoSuchCExtHistoricalInformationStaffingException {
		return getPersistence()
				   .findByPrimaryKey(cExtHistoricalInformationStaffingPK);
	}

	/**
	* Returns the c ext historical information staffing with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cExtHistoricalInformationStaffingPK the primary key of the c ext historical information staffing
	* @return the c ext historical information staffing, or <code>null</code> if a c ext historical information staffing with the primary key could not be found
	*/
	public static CExtHistoricalInformationStaffing fetchByPrimaryKey(
		ucc.portal.service.persistence.CExtHistoricalInformationStaffingPK cExtHistoricalInformationStaffingPK) {
		return getPersistence()
				   .fetchByPrimaryKey(cExtHistoricalInformationStaffingPK);
	}

	public static java.util.Map<java.io.Serializable, CExtHistoricalInformationStaffing> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the c ext historical information staffings.
	*
	* @return the c ext historical information staffings
	*/
	public static List<CExtHistoricalInformationStaffing> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the c ext historical information staffings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext historical information staffings
	* @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	* @return the range of c ext historical information staffings
	*/
	public static List<CExtHistoricalInformationStaffing> findAll(int start,
		int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the c ext historical information staffings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext historical information staffings
	* @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c ext historical information staffings
	*/
	public static List<CExtHistoricalInformationStaffing> findAll(int start,
		int end,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the c ext historical information staffings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtHistoricalInformationStaffingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext historical information staffings
	* @param end the upper bound of the range of c ext historical information staffings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of c ext historical information staffings
	*/
	public static List<CExtHistoricalInformationStaffing> findAll(int start,
		int end,
		OrderByComparator<CExtHistoricalInformationStaffing> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the c ext historical information staffings from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of c ext historical information staffings.
	*
	* @return the number of c ext historical information staffings
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static CExtHistoricalInformationStaffingPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CExtHistoricalInformationStaffingPersistence, CExtHistoricalInformationStaffingPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CExtHistoricalInformationStaffingPersistence.class);

		ServiceTracker<CExtHistoricalInformationStaffingPersistence, CExtHistoricalInformationStaffingPersistence> serviceTracker =
			new ServiceTracker<CExtHistoricalInformationStaffingPersistence, CExtHistoricalInformationStaffingPersistence>(bundle.getBundleContext(),
				CExtHistoricalInformationStaffingPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}