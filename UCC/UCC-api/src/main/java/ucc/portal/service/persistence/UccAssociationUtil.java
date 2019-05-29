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

import ucc.portal.model.UccAssociation;

import java.util.List;

/**
 * The persistence utility for the ucc association service. This utility wraps {@link ucc.portal.service.persistence.impl.UccAssociationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccAssociationPersistence
 * @see ucc.portal.service.persistence.impl.UccAssociationPersistenceImpl
 * @generated
 */
@ProviderType
public class UccAssociationUtil {
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
	public static void clearCache(UccAssociation uccAssociation) {
		getPersistence().clearCache(uccAssociation);
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
	public static List<UccAssociation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UccAssociation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UccAssociation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UccAssociation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UccAssociation update(UccAssociation uccAssociation) {
		return getPersistence().update(uccAssociation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UccAssociation update(UccAssociation uccAssociation,
		ServiceContext serviceContext) {
		return getPersistence().update(uccAssociation, serviceContext);
	}

	/**
	* Returns all the ucc associations where uccConferenceId = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @return the matching ucc associations
	*/
	public static List<UccAssociation> findByConferenceId(int uccConferenceId) {
		return getPersistence().findByConferenceId(uccConferenceId);
	}

	/**
	* Returns a range of all the ucc associations where uccConferenceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccConferenceId the ucc conference ID
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @return the range of matching ucc associations
	*/
	public static List<UccAssociation> findByConferenceId(int uccConferenceId,
		int start, int end) {
		return getPersistence().findByConferenceId(uccConferenceId, start, end);
	}

	/**
	* Returns an ordered range of all the ucc associations where uccConferenceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccConferenceId the ucc conference ID
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ucc associations
	*/
	public static List<UccAssociation> findByConferenceId(int uccConferenceId,
		int start, int end, OrderByComparator<UccAssociation> orderByComparator) {
		return getPersistence()
				   .findByConferenceId(uccConferenceId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the ucc associations where uccConferenceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccConferenceId the ucc conference ID
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ucc associations
	*/
	public static List<UccAssociation> findByConferenceId(int uccConferenceId,
		int start, int end,
		OrderByComparator<UccAssociation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByConferenceId(uccConferenceId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first ucc association in the ordered set where uccConferenceId = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc association
	* @throws NoSuchUccAssociationException if a matching ucc association could not be found
	*/
	public static UccAssociation findByConferenceId_First(int uccConferenceId,
		OrderByComparator<UccAssociation> orderByComparator)
		throws ucc.portal.exception.NoSuchUccAssociationException {
		return getPersistence()
				   .findByConferenceId_First(uccConferenceId, orderByComparator);
	}

	/**
	* Returns the first ucc association in the ordered set where uccConferenceId = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc association, or <code>null</code> if a matching ucc association could not be found
	*/
	public static UccAssociation fetchByConferenceId_First(
		int uccConferenceId, OrderByComparator<UccAssociation> orderByComparator) {
		return getPersistence()
				   .fetchByConferenceId_First(uccConferenceId, orderByComparator);
	}

	/**
	* Returns the last ucc association in the ordered set where uccConferenceId = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc association
	* @throws NoSuchUccAssociationException if a matching ucc association could not be found
	*/
	public static UccAssociation findByConferenceId_Last(int uccConferenceId,
		OrderByComparator<UccAssociation> orderByComparator)
		throws ucc.portal.exception.NoSuchUccAssociationException {
		return getPersistence()
				   .findByConferenceId_Last(uccConferenceId, orderByComparator);
	}

	/**
	* Returns the last ucc association in the ordered set where uccConferenceId = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc association, or <code>null</code> if a matching ucc association could not be found
	*/
	public static UccAssociation fetchByConferenceId_Last(int uccConferenceId,
		OrderByComparator<UccAssociation> orderByComparator) {
		return getPersistence()
				   .fetchByConferenceId_Last(uccConferenceId, orderByComparator);
	}

	/**
	* Returns the ucc associations before and after the current ucc association in the ordered set where uccConferenceId = &#63;.
	*
	* @param uccAssociationId the primary key of the current ucc association
	* @param uccConferenceId the ucc conference ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ucc association
	* @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	*/
	public static UccAssociation[] findByConferenceId_PrevAndNext(
		int uccAssociationId, int uccConferenceId,
		OrderByComparator<UccAssociation> orderByComparator)
		throws ucc.portal.exception.NoSuchUccAssociationException {
		return getPersistence()
				   .findByConferenceId_PrevAndNext(uccAssociationId,
			uccConferenceId, orderByComparator);
	}

	/**
	* Removes all the ucc associations where uccConferenceId = &#63; from the database.
	*
	* @param uccConferenceId the ucc conference ID
	*/
	public static void removeByConferenceId(int uccConferenceId) {
		getPersistence().removeByConferenceId(uccConferenceId);
	}

	/**
	* Returns the number of ucc associations where uccConferenceId = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @return the number of matching ucc associations
	*/
	public static int countByConferenceId(int uccConferenceId) {
		return getPersistence().countByConferenceId(uccConferenceId);
	}

	/**
	* Returns all the ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @return the matching ucc associations
	*/
	public static List<UccAssociation> findByC_A(int uccConferenceId,
		boolean myActive) {
		return getPersistence().findByC_A(uccConferenceId, myActive);
	}

	/**
	* Returns a range of all the ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @return the range of matching ucc associations
	*/
	public static List<UccAssociation> findByC_A(int uccConferenceId,
		boolean myActive, int start, int end) {
		return getPersistence().findByC_A(uccConferenceId, myActive, start, end);
	}

	/**
	* Returns an ordered range of all the ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ucc associations
	*/
	public static List<UccAssociation> findByC_A(int uccConferenceId,
		boolean myActive, int start, int end,
		OrderByComparator<UccAssociation> orderByComparator) {
		return getPersistence()
				   .findByC_A(uccConferenceId, myActive, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ucc associations
	*/
	public static List<UccAssociation> findByC_A(int uccConferenceId,
		boolean myActive, int start, int end,
		OrderByComparator<UccAssociation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByC_A(uccConferenceId, myActive, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc association
	* @throws NoSuchUccAssociationException if a matching ucc association could not be found
	*/
	public static UccAssociation findByC_A_First(int uccConferenceId,
		boolean myActive, OrderByComparator<UccAssociation> orderByComparator)
		throws ucc.portal.exception.NoSuchUccAssociationException {
		return getPersistence()
				   .findByC_A_First(uccConferenceId, myActive, orderByComparator);
	}

	/**
	* Returns the first ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc association, or <code>null</code> if a matching ucc association could not be found
	*/
	public static UccAssociation fetchByC_A_First(int uccConferenceId,
		boolean myActive, OrderByComparator<UccAssociation> orderByComparator) {
		return getPersistence()
				   .fetchByC_A_First(uccConferenceId, myActive,
			orderByComparator);
	}

	/**
	* Returns the last ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc association
	* @throws NoSuchUccAssociationException if a matching ucc association could not be found
	*/
	public static UccAssociation findByC_A_Last(int uccConferenceId,
		boolean myActive, OrderByComparator<UccAssociation> orderByComparator)
		throws ucc.portal.exception.NoSuchUccAssociationException {
		return getPersistence()
				   .findByC_A_Last(uccConferenceId, myActive, orderByComparator);
	}

	/**
	* Returns the last ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc association, or <code>null</code> if a matching ucc association could not be found
	*/
	public static UccAssociation fetchByC_A_Last(int uccConferenceId,
		boolean myActive, OrderByComparator<UccAssociation> orderByComparator) {
		return getPersistence()
				   .fetchByC_A_Last(uccConferenceId, myActive, orderByComparator);
	}

	/**
	* Returns the ucc associations before and after the current ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccAssociationId the primary key of the current ucc association
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ucc association
	* @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	*/
	public static UccAssociation[] findByC_A_PrevAndNext(int uccAssociationId,
		int uccConferenceId, boolean myActive,
		OrderByComparator<UccAssociation> orderByComparator)
		throws ucc.portal.exception.NoSuchUccAssociationException {
		return getPersistence()
				   .findByC_A_PrevAndNext(uccAssociationId, uccConferenceId,
			myActive, orderByComparator);
	}

	/**
	* Removes all the ucc associations where uccConferenceId = &#63; and myActive = &#63; from the database.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	*/
	public static void removeByC_A(int uccConferenceId, boolean myActive) {
		getPersistence().removeByC_A(uccConferenceId, myActive);
	}

	/**
	* Returns the number of ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @return the number of matching ucc associations
	*/
	public static int countByC_A(int uccConferenceId, boolean myActive) {
		return getPersistence().countByC_A(uccConferenceId, myActive);
	}

	/**
	* Caches the ucc association in the entity cache if it is enabled.
	*
	* @param uccAssociation the ucc association
	*/
	public static void cacheResult(UccAssociation uccAssociation) {
		getPersistence().cacheResult(uccAssociation);
	}

	/**
	* Caches the ucc associations in the entity cache if it is enabled.
	*
	* @param uccAssociations the ucc associations
	*/
	public static void cacheResult(List<UccAssociation> uccAssociations) {
		getPersistence().cacheResult(uccAssociations);
	}

	/**
	* Creates a new ucc association with the primary key. Does not add the ucc association to the database.
	*
	* @param uccAssociationId the primary key for the new ucc association
	* @return the new ucc association
	*/
	public static UccAssociation create(int uccAssociationId) {
		return getPersistence().create(uccAssociationId);
	}

	/**
	* Removes the ucc association with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccAssociationId the primary key of the ucc association
	* @return the ucc association that was removed
	* @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	*/
	public static UccAssociation remove(int uccAssociationId)
		throws ucc.portal.exception.NoSuchUccAssociationException {
		return getPersistence().remove(uccAssociationId);
	}

	public static UccAssociation updateImpl(UccAssociation uccAssociation) {
		return getPersistence().updateImpl(uccAssociation);
	}

	/**
	* Returns the ucc association with the primary key or throws a {@link NoSuchUccAssociationException} if it could not be found.
	*
	* @param uccAssociationId the primary key of the ucc association
	* @return the ucc association
	* @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	*/
	public static UccAssociation findByPrimaryKey(int uccAssociationId)
		throws ucc.portal.exception.NoSuchUccAssociationException {
		return getPersistence().findByPrimaryKey(uccAssociationId);
	}

	/**
	* Returns the ucc association with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param uccAssociationId the primary key of the ucc association
	* @return the ucc association, or <code>null</code> if a ucc association with the primary key could not be found
	*/
	public static UccAssociation fetchByPrimaryKey(int uccAssociationId) {
		return getPersistence().fetchByPrimaryKey(uccAssociationId);
	}

	public static java.util.Map<java.io.Serializable, UccAssociation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ucc associations.
	*
	* @return the ucc associations
	*/
	public static List<UccAssociation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ucc associations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @return the range of ucc associations
	*/
	public static List<UccAssociation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ucc associations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ucc associations
	*/
	public static List<UccAssociation> findAll(int start, int end,
		OrderByComparator<UccAssociation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ucc associations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ucc associations
	*/
	public static List<UccAssociation> findAll(int start, int end,
		OrderByComparator<UccAssociation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ucc associations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ucc associations.
	*
	* @return the number of ucc associations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static UccAssociationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UccAssociationPersistence, UccAssociationPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UccAssociationPersistence.class);

		ServiceTracker<UccAssociationPersistence, UccAssociationPersistence> serviceTracker =
			new ServiceTracker<UccAssociationPersistence, UccAssociationPersistence>(bundle.getBundleContext(),
				UccAssociationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}