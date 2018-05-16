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

package contact.manager.service.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.service.model.CCA;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the cca service. This utility wraps {@link contact.manager.service.service.persistence.impl.CCAPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CCAPersistence
 * @see contact.manager.service.service.persistence.impl.CCAPersistenceImpl
 * @generated
 */
@ProviderType
public class CCAUtil {
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
	public static void clearCache(CCA cca) {
		getPersistence().clearCache(cca);
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
	public static List<CCA> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CCA> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CCA> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<CCA> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CCA update(CCA cca) {
		return getPersistence().update(cca);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CCA update(CCA cca, ServiceContext serviceContext) {
		return getPersistence().update(cca, serviceContext);
	}

	/**
	* Caches the cca in the entity cache if it is enabled.
	*
	* @param cca the cca
	*/
	public static void cacheResult(CCA cca) {
		getPersistence().cacheResult(cca);
	}

	/**
	* Caches the ccas in the entity cache if it is enabled.
	*
	* @param ccas the ccas
	*/
	public static void cacheResult(List<CCA> ccas) {
		getPersistence().cacheResult(ccas);
	}

	/**
	* Creates a new cca with the primary key. Does not add the cca to the database.
	*
	* @param ccaId the primary key for the new cca
	* @return the new cca
	*/
	public static CCA create(long ccaId) {
		return getPersistence().create(ccaId);
	}

	/**
	* Removes the cca with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ccaId the primary key of the cca
	* @return the cca that was removed
	* @throws NoSuchCCAException if a cca with the primary key could not be found
	*/
	public static CCA remove(long ccaId)
		throws contact.manager.service.exception.NoSuchCCAException {
		return getPersistence().remove(ccaId);
	}

	public static CCA updateImpl(CCA cca) {
		return getPersistence().updateImpl(cca);
	}

	/**
	* Returns the cca with the primary key or throws a {@link NoSuchCCAException} if it could not be found.
	*
	* @param ccaId the primary key of the cca
	* @return the cca
	* @throws NoSuchCCAException if a cca with the primary key could not be found
	*/
	public static CCA findByPrimaryKey(long ccaId)
		throws contact.manager.service.exception.NoSuchCCAException {
		return getPersistence().findByPrimaryKey(ccaId);
	}

	/**
	* Returns the cca with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ccaId the primary key of the cca
	* @return the cca, or <code>null</code> if a cca with the primary key could not be found
	*/
	public static CCA fetchByPrimaryKey(long ccaId) {
		return getPersistence().fetchByPrimaryKey(ccaId);
	}

	public static java.util.Map<java.io.Serializable, CCA> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ccas.
	*
	* @return the ccas
	*/
	public static List<CCA> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ccas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ccas
	* @param end the upper bound of the range of ccas (not inclusive)
	* @return the range of ccas
	*/
	public static List<CCA> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ccas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ccas
	* @param end the upper bound of the range of ccas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ccas
	*/
	public static List<CCA> findAll(int start, int end,
		OrderByComparator<CCA> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ccas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ccas
	* @param end the upper bound of the range of ccas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ccas
	*/
	public static List<CCA> findAll(int start, int end,
		OrderByComparator<CCA> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ccas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ccas.
	*
	* @return the number of ccas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CCAPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CCAPersistence, CCAPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CCAPersistence.class);
}