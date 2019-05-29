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

import ucc.portal.model.UccPeopleAddress;

import java.util.List;

/**
 * The persistence utility for the ucc people address service. This utility wraps {@link ucc.portal.service.persistence.impl.UccPeopleAddressPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UccPeopleAddressPersistence
 * @see ucc.portal.service.persistence.impl.UccPeopleAddressPersistenceImpl
 * @generated
 */
@ProviderType
public class UccPeopleAddressUtil {
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
	public static void clearCache(UccPeopleAddress uccPeopleAddress) {
		getPersistence().clearCache(uccPeopleAddress);
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
	public static List<UccPeopleAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UccPeopleAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UccPeopleAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UccPeopleAddress> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UccPeopleAddress update(UccPeopleAddress uccPeopleAddress) {
		return getPersistence().update(uccPeopleAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UccPeopleAddress update(UccPeopleAddress uccPeopleAddress,
		ServiceContext serviceContext) {
		return getPersistence().update(uccPeopleAddress, serviceContext);
	}

	/**
	* Returns all the ucc people addresses where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param type the type
	* @param myActive the my active
	* @return the matching ucc people addresses
	*/
	public static List<UccPeopleAddress> findByP_T_A(int uccPeopleId,
		String type, boolean myActive) {
		return getPersistence().findByP_T_A(uccPeopleId, type, myActive);
	}

	/**
	* Returns a range of all the ucc people addresses where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccPeopleId the ucc people ID
	* @param type the type
	* @param myActive the my active
	* @param start the lower bound of the range of ucc people addresses
	* @param end the upper bound of the range of ucc people addresses (not inclusive)
	* @return the range of matching ucc people addresses
	*/
	public static List<UccPeopleAddress> findByP_T_A(int uccPeopleId,
		String type, boolean myActive, int start, int end) {
		return getPersistence()
				   .findByP_T_A(uccPeopleId, type, myActive, start, end);
	}

	/**
	* Returns an ordered range of all the ucc people addresses where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccPeopleId the ucc people ID
	* @param type the type
	* @param myActive the my active
	* @param start the lower bound of the range of ucc people addresses
	* @param end the upper bound of the range of ucc people addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ucc people addresses
	*/
	public static List<UccPeopleAddress> findByP_T_A(int uccPeopleId,
		String type, boolean myActive, int start, int end,
		OrderByComparator<UccPeopleAddress> orderByComparator) {
		return getPersistence()
				   .findByP_T_A(uccPeopleId, type, myActive, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the ucc people addresses where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccPeopleId the ucc people ID
	* @param type the type
	* @param myActive the my active
	* @param start the lower bound of the range of ucc people addresses
	* @param end the upper bound of the range of ucc people addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ucc people addresses
	*/
	public static List<UccPeopleAddress> findByP_T_A(int uccPeopleId,
		String type, boolean myActive, int start, int end,
		OrderByComparator<UccPeopleAddress> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_T_A(uccPeopleId, type, myActive, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first ucc people address in the ordered set where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param type the type
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people address
	* @throws NoSuchUccPeopleAddressException if a matching ucc people address could not be found
	*/
	public static UccPeopleAddress findByP_T_A_First(int uccPeopleId,
		String type, boolean myActive,
		OrderByComparator<UccPeopleAddress> orderByComparator)
		throws ucc.portal.exception.NoSuchUccPeopleAddressException {
		return getPersistence()
				   .findByP_T_A_First(uccPeopleId, type, myActive,
			orderByComparator);
	}

	/**
	* Returns the first ucc people address in the ordered set where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param type the type
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people address, or <code>null</code> if a matching ucc people address could not be found
	*/
	public static UccPeopleAddress fetchByP_T_A_First(int uccPeopleId,
		String type, boolean myActive,
		OrderByComparator<UccPeopleAddress> orderByComparator) {
		return getPersistence()
				   .fetchByP_T_A_First(uccPeopleId, type, myActive,
			orderByComparator);
	}

	/**
	* Returns the last ucc people address in the ordered set where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param type the type
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people address
	* @throws NoSuchUccPeopleAddressException if a matching ucc people address could not be found
	*/
	public static UccPeopleAddress findByP_T_A_Last(int uccPeopleId,
		String type, boolean myActive,
		OrderByComparator<UccPeopleAddress> orderByComparator)
		throws ucc.portal.exception.NoSuchUccPeopleAddressException {
		return getPersistence()
				   .findByP_T_A_Last(uccPeopleId, type, myActive,
			orderByComparator);
	}

	/**
	* Returns the last ucc people address in the ordered set where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param type the type
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people address, or <code>null</code> if a matching ucc people address could not be found
	*/
	public static UccPeopleAddress fetchByP_T_A_Last(int uccPeopleId,
		String type, boolean myActive,
		OrderByComparator<UccPeopleAddress> orderByComparator) {
		return getPersistence()
				   .fetchByP_T_A_Last(uccPeopleId, type, myActive,
			orderByComparator);
	}

	/**
	* Returns the ucc people addresses before and after the current ucc people address in the ordered set where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	*
	* @param uccPeopleAddressId the primary key of the current ucc people address
	* @param uccPeopleId the ucc people ID
	* @param type the type
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ucc people address
	* @throws NoSuchUccPeopleAddressException if a ucc people address with the primary key could not be found
	*/
	public static UccPeopleAddress[] findByP_T_A_PrevAndNext(
		int uccPeopleAddressId, int uccPeopleId, String type, boolean myActive,
		OrderByComparator<UccPeopleAddress> orderByComparator)
		throws ucc.portal.exception.NoSuchUccPeopleAddressException {
		return getPersistence()
				   .findByP_T_A_PrevAndNext(uccPeopleAddressId, uccPeopleId,
			type, myActive, orderByComparator);
	}

	/**
	* Removes all the ucc people addresses where uccPeopleId = &#63; and type = &#63; and myActive = &#63; from the database.
	*
	* @param uccPeopleId the ucc people ID
	* @param type the type
	* @param myActive the my active
	*/
	public static void removeByP_T_A(int uccPeopleId, String type,
		boolean myActive) {
		getPersistence().removeByP_T_A(uccPeopleId, type, myActive);
	}

	/**
	* Returns the number of ucc people addresses where uccPeopleId = &#63; and type = &#63; and myActive = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param type the type
	* @param myActive the my active
	* @return the number of matching ucc people addresses
	*/
	public static int countByP_T_A(int uccPeopleId, String type,
		boolean myActive) {
		return getPersistence().countByP_T_A(uccPeopleId, type, myActive);
	}

	/**
	* Caches the ucc people address in the entity cache if it is enabled.
	*
	* @param uccPeopleAddress the ucc people address
	*/
	public static void cacheResult(UccPeopleAddress uccPeopleAddress) {
		getPersistence().cacheResult(uccPeopleAddress);
	}

	/**
	* Caches the ucc people addresses in the entity cache if it is enabled.
	*
	* @param uccPeopleAddresses the ucc people addresses
	*/
	public static void cacheResult(List<UccPeopleAddress> uccPeopleAddresses) {
		getPersistence().cacheResult(uccPeopleAddresses);
	}

	/**
	* Creates a new ucc people address with the primary key. Does not add the ucc people address to the database.
	*
	* @param uccPeopleAddressId the primary key for the new ucc people address
	* @return the new ucc people address
	*/
	public static UccPeopleAddress create(int uccPeopleAddressId) {
		return getPersistence().create(uccPeopleAddressId);
	}

	/**
	* Removes the ucc people address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccPeopleAddressId the primary key of the ucc people address
	* @return the ucc people address that was removed
	* @throws NoSuchUccPeopleAddressException if a ucc people address with the primary key could not be found
	*/
	public static UccPeopleAddress remove(int uccPeopleAddressId)
		throws ucc.portal.exception.NoSuchUccPeopleAddressException {
		return getPersistence().remove(uccPeopleAddressId);
	}

	public static UccPeopleAddress updateImpl(UccPeopleAddress uccPeopleAddress) {
		return getPersistence().updateImpl(uccPeopleAddress);
	}

	/**
	* Returns the ucc people address with the primary key or throws a {@link NoSuchUccPeopleAddressException} if it could not be found.
	*
	* @param uccPeopleAddressId the primary key of the ucc people address
	* @return the ucc people address
	* @throws NoSuchUccPeopleAddressException if a ucc people address with the primary key could not be found
	*/
	public static UccPeopleAddress findByPrimaryKey(int uccPeopleAddressId)
		throws ucc.portal.exception.NoSuchUccPeopleAddressException {
		return getPersistence().findByPrimaryKey(uccPeopleAddressId);
	}

	/**
	* Returns the ucc people address with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param uccPeopleAddressId the primary key of the ucc people address
	* @return the ucc people address, or <code>null</code> if a ucc people address with the primary key could not be found
	*/
	public static UccPeopleAddress fetchByPrimaryKey(int uccPeopleAddressId) {
		return getPersistence().fetchByPrimaryKey(uccPeopleAddressId);
	}

	public static java.util.Map<java.io.Serializable, UccPeopleAddress> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ucc people addresses.
	*
	* @return the ucc people addresses
	*/
	public static List<UccPeopleAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ucc people addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc people addresses
	* @param end the upper bound of the range of ucc people addresses (not inclusive)
	* @return the range of ucc people addresses
	*/
	public static List<UccPeopleAddress> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ucc people addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc people addresses
	* @param end the upper bound of the range of ucc people addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ucc people addresses
	*/
	public static List<UccPeopleAddress> findAll(int start, int end,
		OrderByComparator<UccPeopleAddress> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ucc people addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc people addresses
	* @param end the upper bound of the range of ucc people addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ucc people addresses
	*/
	public static List<UccPeopleAddress> findAll(int start, int end,
		OrderByComparator<UccPeopleAddress> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ucc people addresses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ucc people addresses.
	*
	* @return the number of ucc people addresses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static UccPeopleAddressPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UccPeopleAddressPersistence, UccPeopleAddressPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UccPeopleAddressPersistence.class);

		ServiceTracker<UccPeopleAddressPersistence, UccPeopleAddressPersistence> serviceTracker =
			new ServiceTracker<UccPeopleAddressPersistence, UccPeopleAddressPersistence>(bundle.getBundleContext(),
				UccPeopleAddressPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}