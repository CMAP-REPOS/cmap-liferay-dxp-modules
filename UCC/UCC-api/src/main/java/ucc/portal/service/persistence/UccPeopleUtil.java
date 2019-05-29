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

import ucc.portal.model.UccPeople;

import java.util.List;

/**
 * The persistence utility for the ucc people service. This utility wraps {@link ucc.portal.service.persistence.impl.UccPeoplePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccPeoplePersistence
 * @see ucc.portal.service.persistence.impl.UccPeoplePersistenceImpl
 * @generated
 */
@ProviderType
public class UccPeopleUtil {
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
	public static void clearCache(UccPeople uccPeople) {
		getPersistence().clearCache(uccPeople);
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
	public static List<UccPeople> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UccPeople> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UccPeople> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UccPeople> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UccPeople update(UccPeople uccPeople) {
		return getPersistence().update(uccPeople);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UccPeople update(UccPeople uccPeople,
		ServiceContext serviceContext) {
		return getPersistence().update(uccPeople, serviceContext);
	}

	/**
	* Returns all the ucc peoples where myActive = &#63;.
	*
	* @param myActive the my active
	* @return the matching ucc peoples
	*/
	public static List<UccPeople> findByActive(boolean myActive) {
		return getPersistence().findByActive(myActive);
	}

	/**
	* Returns a range of all the ucc peoples where myActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param myActive the my active
	* @param start the lower bound of the range of ucc peoples
	* @param end the upper bound of the range of ucc peoples (not inclusive)
	* @return the range of matching ucc peoples
	*/
	public static List<UccPeople> findByActive(boolean myActive, int start,
		int end) {
		return getPersistence().findByActive(myActive, start, end);
	}

	/**
	* Returns an ordered range of all the ucc peoples where myActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param myActive the my active
	* @param start the lower bound of the range of ucc peoples
	* @param end the upper bound of the range of ucc peoples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ucc peoples
	*/
	public static List<UccPeople> findByActive(boolean myActive, int start,
		int end, OrderByComparator<UccPeople> orderByComparator) {
		return getPersistence()
				   .findByActive(myActive, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ucc peoples where myActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param myActive the my active
	* @param start the lower bound of the range of ucc peoples
	* @param end the upper bound of the range of ucc peoples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ucc peoples
	*/
	public static List<UccPeople> findByActive(boolean myActive, int start,
		int end, OrderByComparator<UccPeople> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByActive(myActive, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ucc people in the ordered set where myActive = &#63;.
	*
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people
	* @throws NoSuchUccPeopleException if a matching ucc people could not be found
	*/
	public static UccPeople findByActive_First(boolean myActive,
		OrderByComparator<UccPeople> orderByComparator)
		throws ucc.portal.exception.NoSuchUccPeopleException {
		return getPersistence().findByActive_First(myActive, orderByComparator);
	}

	/**
	* Returns the first ucc people in the ordered set where myActive = &#63;.
	*
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people, or <code>null</code> if a matching ucc people could not be found
	*/
	public static UccPeople fetchByActive_First(boolean myActive,
		OrderByComparator<UccPeople> orderByComparator) {
		return getPersistence().fetchByActive_First(myActive, orderByComparator);
	}

	/**
	* Returns the last ucc people in the ordered set where myActive = &#63;.
	*
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people
	* @throws NoSuchUccPeopleException if a matching ucc people could not be found
	*/
	public static UccPeople findByActive_Last(boolean myActive,
		OrderByComparator<UccPeople> orderByComparator)
		throws ucc.portal.exception.NoSuchUccPeopleException {
		return getPersistence().findByActive_Last(myActive, orderByComparator);
	}

	/**
	* Returns the last ucc people in the ordered set where myActive = &#63;.
	*
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people, or <code>null</code> if a matching ucc people could not be found
	*/
	public static UccPeople fetchByActive_Last(boolean myActive,
		OrderByComparator<UccPeople> orderByComparator) {
		return getPersistence().fetchByActive_Last(myActive, orderByComparator);
	}

	/**
	* Returns the ucc peoples before and after the current ucc people in the ordered set where myActive = &#63;.
	*
	* @param uccPeopleId the primary key of the current ucc people
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ucc people
	* @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	*/
	public static UccPeople[] findByActive_PrevAndNext(int uccPeopleId,
		boolean myActive, OrderByComparator<UccPeople> orderByComparator)
		throws ucc.portal.exception.NoSuchUccPeopleException {
		return getPersistence()
				   .findByActive_PrevAndNext(uccPeopleId, myActive,
			orderByComparator);
	}

	/**
	* Removes all the ucc peoples where myActive = &#63; from the database.
	*
	* @param myActive the my active
	*/
	public static void removeByActive(boolean myActive) {
		getPersistence().removeByActive(myActive);
	}

	/**
	* Returns the number of ucc peoples where myActive = &#63;.
	*
	* @param myActive the my active
	* @return the number of matching ucc peoples
	*/
	public static int countByActive(boolean myActive) {
		return getPersistence().countByActive(myActive);
	}

	/**
	* Returns all the ucc peoples where oldUccPeopleId = &#63;.
	*
	* @param oldUccPeopleId the old ucc people ID
	* @return the matching ucc peoples
	*/
	public static List<UccPeople> findByOldUccPeopleId(int oldUccPeopleId) {
		return getPersistence().findByOldUccPeopleId(oldUccPeopleId);
	}

	/**
	* Returns a range of all the ucc peoples where oldUccPeopleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param oldUccPeopleId the old ucc people ID
	* @param start the lower bound of the range of ucc peoples
	* @param end the upper bound of the range of ucc peoples (not inclusive)
	* @return the range of matching ucc peoples
	*/
	public static List<UccPeople> findByOldUccPeopleId(int oldUccPeopleId,
		int start, int end) {
		return getPersistence().findByOldUccPeopleId(oldUccPeopleId, start, end);
	}

	/**
	* Returns an ordered range of all the ucc peoples where oldUccPeopleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param oldUccPeopleId the old ucc people ID
	* @param start the lower bound of the range of ucc peoples
	* @param end the upper bound of the range of ucc peoples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ucc peoples
	*/
	public static List<UccPeople> findByOldUccPeopleId(int oldUccPeopleId,
		int start, int end, OrderByComparator<UccPeople> orderByComparator) {
		return getPersistence()
				   .findByOldUccPeopleId(oldUccPeopleId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the ucc peoples where oldUccPeopleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param oldUccPeopleId the old ucc people ID
	* @param start the lower bound of the range of ucc peoples
	* @param end the upper bound of the range of ucc peoples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ucc peoples
	*/
	public static List<UccPeople> findByOldUccPeopleId(int oldUccPeopleId,
		int start, int end, OrderByComparator<UccPeople> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOldUccPeopleId(oldUccPeopleId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first ucc people in the ordered set where oldUccPeopleId = &#63;.
	*
	* @param oldUccPeopleId the old ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people
	* @throws NoSuchUccPeopleException if a matching ucc people could not be found
	*/
	public static UccPeople findByOldUccPeopleId_First(int oldUccPeopleId,
		OrderByComparator<UccPeople> orderByComparator)
		throws ucc.portal.exception.NoSuchUccPeopleException {
		return getPersistence()
				   .findByOldUccPeopleId_First(oldUccPeopleId, orderByComparator);
	}

	/**
	* Returns the first ucc people in the ordered set where oldUccPeopleId = &#63;.
	*
	* @param oldUccPeopleId the old ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people, or <code>null</code> if a matching ucc people could not be found
	*/
	public static UccPeople fetchByOldUccPeopleId_First(int oldUccPeopleId,
		OrderByComparator<UccPeople> orderByComparator) {
		return getPersistence()
				   .fetchByOldUccPeopleId_First(oldUccPeopleId,
			orderByComparator);
	}

	/**
	* Returns the last ucc people in the ordered set where oldUccPeopleId = &#63;.
	*
	* @param oldUccPeopleId the old ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people
	* @throws NoSuchUccPeopleException if a matching ucc people could not be found
	*/
	public static UccPeople findByOldUccPeopleId_Last(int oldUccPeopleId,
		OrderByComparator<UccPeople> orderByComparator)
		throws ucc.portal.exception.NoSuchUccPeopleException {
		return getPersistence()
				   .findByOldUccPeopleId_Last(oldUccPeopleId, orderByComparator);
	}

	/**
	* Returns the last ucc people in the ordered set where oldUccPeopleId = &#63;.
	*
	* @param oldUccPeopleId the old ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people, or <code>null</code> if a matching ucc people could not be found
	*/
	public static UccPeople fetchByOldUccPeopleId_Last(int oldUccPeopleId,
		OrderByComparator<UccPeople> orderByComparator) {
		return getPersistence()
				   .fetchByOldUccPeopleId_Last(oldUccPeopleId, orderByComparator);
	}

	/**
	* Returns the ucc peoples before and after the current ucc people in the ordered set where oldUccPeopleId = &#63;.
	*
	* @param uccPeopleId the primary key of the current ucc people
	* @param oldUccPeopleId the old ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ucc people
	* @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	*/
	public static UccPeople[] findByOldUccPeopleId_PrevAndNext(
		int uccPeopleId, int oldUccPeopleId,
		OrderByComparator<UccPeople> orderByComparator)
		throws ucc.portal.exception.NoSuchUccPeopleException {
		return getPersistence()
				   .findByOldUccPeopleId_PrevAndNext(uccPeopleId,
			oldUccPeopleId, orderByComparator);
	}

	/**
	* Removes all the ucc peoples where oldUccPeopleId = &#63; from the database.
	*
	* @param oldUccPeopleId the old ucc people ID
	*/
	public static void removeByOldUccPeopleId(int oldUccPeopleId) {
		getPersistence().removeByOldUccPeopleId(oldUccPeopleId);
	}

	/**
	* Returns the number of ucc peoples where oldUccPeopleId = &#63;.
	*
	* @param oldUccPeopleId the old ucc people ID
	* @return the number of matching ucc peoples
	*/
	public static int countByOldUccPeopleId(int oldUccPeopleId) {
		return getPersistence().countByOldUccPeopleId(oldUccPeopleId);
	}

	/**
	* Caches the ucc people in the entity cache if it is enabled.
	*
	* @param uccPeople the ucc people
	*/
	public static void cacheResult(UccPeople uccPeople) {
		getPersistence().cacheResult(uccPeople);
	}

	/**
	* Caches the ucc peoples in the entity cache if it is enabled.
	*
	* @param uccPeoples the ucc peoples
	*/
	public static void cacheResult(List<UccPeople> uccPeoples) {
		getPersistence().cacheResult(uccPeoples);
	}

	/**
	* Creates a new ucc people with the primary key. Does not add the ucc people to the database.
	*
	* @param uccPeopleId the primary key for the new ucc people
	* @return the new ucc people
	*/
	public static UccPeople create(int uccPeopleId) {
		return getPersistence().create(uccPeopleId);
	}

	/**
	* Removes the ucc people with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccPeopleId the primary key of the ucc people
	* @return the ucc people that was removed
	* @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	*/
	public static UccPeople remove(int uccPeopleId)
		throws ucc.portal.exception.NoSuchUccPeopleException {
		return getPersistence().remove(uccPeopleId);
	}

	public static UccPeople updateImpl(UccPeople uccPeople) {
		return getPersistence().updateImpl(uccPeople);
	}

	/**
	* Returns the ucc people with the primary key or throws a {@link NoSuchUccPeopleException} if it could not be found.
	*
	* @param uccPeopleId the primary key of the ucc people
	* @return the ucc people
	* @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	*/
	public static UccPeople findByPrimaryKey(int uccPeopleId)
		throws ucc.portal.exception.NoSuchUccPeopleException {
		return getPersistence().findByPrimaryKey(uccPeopleId);
	}

	/**
	* Returns the ucc people with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param uccPeopleId the primary key of the ucc people
	* @return the ucc people, or <code>null</code> if a ucc people with the primary key could not be found
	*/
	public static UccPeople fetchByPrimaryKey(int uccPeopleId) {
		return getPersistence().fetchByPrimaryKey(uccPeopleId);
	}

	public static java.util.Map<java.io.Serializable, UccPeople> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ucc peoples.
	*
	* @return the ucc peoples
	*/
	public static List<UccPeople> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ucc peoples.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc peoples
	* @param end the upper bound of the range of ucc peoples (not inclusive)
	* @return the range of ucc peoples
	*/
	public static List<UccPeople> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ucc peoples.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc peoples
	* @param end the upper bound of the range of ucc peoples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ucc peoples
	*/
	public static List<UccPeople> findAll(int start, int end,
		OrderByComparator<UccPeople> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ucc peoples.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc peoples
	* @param end the upper bound of the range of ucc peoples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ucc peoples
	*/
	public static List<UccPeople> findAll(int start, int end,
		OrderByComparator<UccPeople> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ucc peoples from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ucc peoples.
	*
	* @return the number of ucc peoples
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static UccPeoplePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UccPeoplePersistence, UccPeoplePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UccPeoplePersistence.class);

		ServiceTracker<UccPeoplePersistence, UccPeoplePersistence> serviceTracker =
			new ServiceTracker<UccPeoplePersistence, UccPeoplePersistence>(bundle.getBundleContext(),
				UccPeoplePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}