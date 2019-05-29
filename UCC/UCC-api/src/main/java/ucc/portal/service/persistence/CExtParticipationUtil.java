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

import ucc.portal.model.CExtParticipation;

import java.util.List;

/**
 * The persistence utility for the c ext participation service. This utility wraps {@link ucc.portal.service.persistence.impl.CExtParticipationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtParticipationPersistence
 * @see ucc.portal.service.persistence.impl.CExtParticipationPersistenceImpl
 * @generated
 */
@ProviderType
public class CExtParticipationUtil {
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
	public static void clearCache(CExtParticipation cExtParticipation) {
		getPersistence().clearCache(cExtParticipation);
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
	public static List<CExtParticipation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CExtParticipation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CExtParticipation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CExtParticipation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CExtParticipation update(CExtParticipation cExtParticipation) {
		return getPersistence().update(cExtParticipation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CExtParticipation update(
		CExtParticipation cExtParticipation, ServiceContext serviceContext) {
		return getPersistence().update(cExtParticipation, serviceContext);
	}

	/**
	* Returns all the c ext participations where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching c ext participations
	*/
	public static List<CExtParticipation> findByOrganizationId(
		long organizationId) {
		return getPersistence().findByOrganizationId(organizationId);
	}

	/**
	* Returns a range of all the c ext participations where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext participations
	* @param end the upper bound of the range of c ext participations (not inclusive)
	* @return the range of matching c ext participations
	*/
	public static List<CExtParticipation> findByOrganizationId(
		long organizationId, int start, int end) {
		return getPersistence().findByOrganizationId(organizationId, start, end);
	}

	/**
	* Returns an ordered range of all the c ext participations where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext participations
	* @param end the upper bound of the range of c ext participations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching c ext participations
	*/
	public static List<CExtParticipation> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtParticipation> orderByComparator) {
		return getPersistence()
				   .findByOrganizationId(organizationId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the c ext participations where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext participations
	* @param end the upper bound of the range of c ext participations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching c ext participations
	*/
	public static List<CExtParticipation> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtParticipation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOrganizationId(organizationId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first c ext participation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext participation
	* @throws NoSuchCExtParticipationException if a matching c ext participation could not be found
	*/
	public static CExtParticipation findByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtParticipation> orderByComparator)
		throws ucc.portal.exception.NoSuchCExtParticipationException {
		return getPersistence()
				   .findByOrganizationId_First(organizationId, orderByComparator);
	}

	/**
	* Returns the first c ext participation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	*/
	public static CExtParticipation fetchByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtParticipation> orderByComparator) {
		return getPersistence()
				   .fetchByOrganizationId_First(organizationId,
			orderByComparator);
	}

	/**
	* Returns the last c ext participation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext participation
	* @throws NoSuchCExtParticipationException if a matching c ext participation could not be found
	*/
	public static CExtParticipation findByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtParticipation> orderByComparator)
		throws ucc.portal.exception.NoSuchCExtParticipationException {
		return getPersistence()
				   .findByOrganizationId_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the last c ext participation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	*/
	public static CExtParticipation fetchByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtParticipation> orderByComparator) {
		return getPersistence()
				   .fetchByOrganizationId_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the c ext participations before and after the current c ext participation in the ordered set where organizationId = &#63;.
	*
	* @param cExtParticipationPK the primary key of the current c ext participation
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next c ext participation
	* @throws NoSuchCExtParticipationException if a c ext participation with the primary key could not be found
	*/
	public static CExtParticipation[] findByOrganizationId_PrevAndNext(
		ucc.portal.service.persistence.CExtParticipationPK cExtParticipationPK,
		long organizationId,
		OrderByComparator<CExtParticipation> orderByComparator)
		throws ucc.portal.exception.NoSuchCExtParticipationException {
		return getPersistence()
				   .findByOrganizationId_PrevAndNext(cExtParticipationPK,
			organizationId, orderByComparator);
	}

	/**
	* Removes all the c ext participations where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	*/
	public static void removeByOrganizationId(long organizationId) {
		getPersistence().removeByOrganizationId(organizationId);
	}

	/**
	* Returns the number of c ext participations where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching c ext participations
	*/
	public static int countByOrganizationId(long organizationId) {
		return getPersistence().countByOrganizationId(organizationId);
	}

	/**
	* Returns the c ext participation where organizationId = &#63; and ppGatheringId = &#63; or throws a {@link NoSuchCExtParticipationException} if it could not be found.
	*
	* @param organizationId the organization ID
	* @param ppGatheringId the pp gathering ID
	* @return the matching c ext participation
	* @throws NoSuchCExtParticipationException if a matching c ext participation could not be found
	*/
	public static CExtParticipation findByO_GI(long organizationId,
		String ppGatheringId)
		throws ucc.portal.exception.NoSuchCExtParticipationException {
		return getPersistence().findByO_GI(organizationId, ppGatheringId);
	}

	/**
	* Returns the c ext participation where organizationId = &#63; and ppGatheringId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param organizationId the organization ID
	* @param ppGatheringId the pp gathering ID
	* @return the matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	*/
	public static CExtParticipation fetchByO_GI(long organizationId,
		String ppGatheringId) {
		return getPersistence().fetchByO_GI(organizationId, ppGatheringId);
	}

	/**
	* Returns the c ext participation where organizationId = &#63; and ppGatheringId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param organizationId the organization ID
	* @param ppGatheringId the pp gathering ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	*/
	public static CExtParticipation fetchByO_GI(long organizationId,
		String ppGatheringId, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByO_GI(organizationId, ppGatheringId, retrieveFromCache);
	}

	/**
	* Removes the c ext participation where organizationId = &#63; and ppGatheringId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @param ppGatheringId the pp gathering ID
	* @return the c ext participation that was removed
	*/
	public static CExtParticipation removeByO_GI(long organizationId,
		String ppGatheringId)
		throws ucc.portal.exception.NoSuchCExtParticipationException {
		return getPersistence().removeByO_GI(organizationId, ppGatheringId);
	}

	/**
	* Returns the number of c ext participations where organizationId = &#63; and ppGatheringId = &#63;.
	*
	* @param organizationId the organization ID
	* @param ppGatheringId the pp gathering ID
	* @return the number of matching c ext participations
	*/
	public static int countByO_GI(long organizationId, String ppGatheringId) {
		return getPersistence().countByO_GI(organizationId, ppGatheringId);
	}

	/**
	* Returns the c ext participation where organizationId = &#63; and ppGatheringKey = &#63; or throws a {@link NoSuchCExtParticipationException} if it could not be found.
	*
	* @param organizationId the organization ID
	* @param ppGatheringKey the pp gathering key
	* @return the matching c ext participation
	* @throws NoSuchCExtParticipationException if a matching c ext participation could not be found
	*/
	public static CExtParticipation findByO_GK(long organizationId,
		String ppGatheringKey)
		throws ucc.portal.exception.NoSuchCExtParticipationException {
		return getPersistence().findByO_GK(organizationId, ppGatheringKey);
	}

	/**
	* Returns the c ext participation where organizationId = &#63; and ppGatheringKey = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param organizationId the organization ID
	* @param ppGatheringKey the pp gathering key
	* @return the matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	*/
	public static CExtParticipation fetchByO_GK(long organizationId,
		String ppGatheringKey) {
		return getPersistence().fetchByO_GK(organizationId, ppGatheringKey);
	}

	/**
	* Returns the c ext participation where organizationId = &#63; and ppGatheringKey = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param organizationId the organization ID
	* @param ppGatheringKey the pp gathering key
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	*/
	public static CExtParticipation fetchByO_GK(long organizationId,
		String ppGatheringKey, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByO_GK(organizationId, ppGatheringKey,
			retrieveFromCache);
	}

	/**
	* Removes the c ext participation where organizationId = &#63; and ppGatheringKey = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @param ppGatheringKey the pp gathering key
	* @return the c ext participation that was removed
	*/
	public static CExtParticipation removeByO_GK(long organizationId,
		String ppGatheringKey)
		throws ucc.portal.exception.NoSuchCExtParticipationException {
		return getPersistence().removeByO_GK(organizationId, ppGatheringKey);
	}

	/**
	* Returns the number of c ext participations where organizationId = &#63; and ppGatheringKey = &#63;.
	*
	* @param organizationId the organization ID
	* @param ppGatheringKey the pp gathering key
	* @return the number of matching c ext participations
	*/
	public static int countByO_GK(long organizationId, String ppGatheringKey) {
		return getPersistence().countByO_GK(organizationId, ppGatheringKey);
	}

	/**
	* Caches the c ext participation in the entity cache if it is enabled.
	*
	* @param cExtParticipation the c ext participation
	*/
	public static void cacheResult(CExtParticipation cExtParticipation) {
		getPersistence().cacheResult(cExtParticipation);
	}

	/**
	* Caches the c ext participations in the entity cache if it is enabled.
	*
	* @param cExtParticipations the c ext participations
	*/
	public static void cacheResult(List<CExtParticipation> cExtParticipations) {
		getPersistence().cacheResult(cExtParticipations);
	}

	/**
	* Creates a new c ext participation with the primary key. Does not add the c ext participation to the database.
	*
	* @param cExtParticipationPK the primary key for the new c ext participation
	* @return the new c ext participation
	*/
	public static CExtParticipation create(
		ucc.portal.service.persistence.CExtParticipationPK cExtParticipationPK) {
		return getPersistence().create(cExtParticipationPK);
	}

	/**
	* Removes the c ext participation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtParticipationPK the primary key of the c ext participation
	* @return the c ext participation that was removed
	* @throws NoSuchCExtParticipationException if a c ext participation with the primary key could not be found
	*/
	public static CExtParticipation remove(
		ucc.portal.service.persistence.CExtParticipationPK cExtParticipationPK)
		throws ucc.portal.exception.NoSuchCExtParticipationException {
		return getPersistence().remove(cExtParticipationPK);
	}

	public static CExtParticipation updateImpl(
		CExtParticipation cExtParticipation) {
		return getPersistence().updateImpl(cExtParticipation);
	}

	/**
	* Returns the c ext participation with the primary key or throws a {@link NoSuchCExtParticipationException} if it could not be found.
	*
	* @param cExtParticipationPK the primary key of the c ext participation
	* @return the c ext participation
	* @throws NoSuchCExtParticipationException if a c ext participation with the primary key could not be found
	*/
	public static CExtParticipation findByPrimaryKey(
		ucc.portal.service.persistence.CExtParticipationPK cExtParticipationPK)
		throws ucc.portal.exception.NoSuchCExtParticipationException {
		return getPersistence().findByPrimaryKey(cExtParticipationPK);
	}

	/**
	* Returns the c ext participation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cExtParticipationPK the primary key of the c ext participation
	* @return the c ext participation, or <code>null</code> if a c ext participation with the primary key could not be found
	*/
	public static CExtParticipation fetchByPrimaryKey(
		ucc.portal.service.persistence.CExtParticipationPK cExtParticipationPK) {
		return getPersistence().fetchByPrimaryKey(cExtParticipationPK);
	}

	public static java.util.Map<java.io.Serializable, CExtParticipation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the c ext participations.
	*
	* @return the c ext participations
	*/
	public static List<CExtParticipation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the c ext participations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext participations
	* @param end the upper bound of the range of c ext participations (not inclusive)
	* @return the range of c ext participations
	*/
	public static List<CExtParticipation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the c ext participations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext participations
	* @param end the upper bound of the range of c ext participations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c ext participations
	*/
	public static List<CExtParticipation> findAll(int start, int end,
		OrderByComparator<CExtParticipation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the c ext participations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtParticipationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext participations
	* @param end the upper bound of the range of c ext participations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of c ext participations
	*/
	public static List<CExtParticipation> findAll(int start, int end,
		OrderByComparator<CExtParticipation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the c ext participations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of c ext participations.
	*
	* @return the number of c ext participations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static CExtParticipationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CExtParticipationPersistence, CExtParticipationPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CExtParticipationPersistence.class);

		ServiceTracker<CExtParticipationPersistence, CExtParticipationPersistence> serviceTracker =
			new ServiceTracker<CExtParticipationPersistence, CExtParticipationPersistence>(bundle.getBundleContext(),
				CExtParticipationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}