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

import ucc.portal.model.CExtRealEstateCampaign;

import java.util.List;

/**
 * The persistence utility for the c ext real estate campaign service. This utility wraps {@link ucc.portal.service.persistence.impl.CExtRealEstateCampaignPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtRealEstateCampaignPersistence
 * @see ucc.portal.service.persistence.impl.CExtRealEstateCampaignPersistenceImpl
 * @generated
 */
@ProviderType
public class CExtRealEstateCampaignUtil {
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
	public static void clearCache(CExtRealEstateCampaign cExtRealEstateCampaign) {
		getPersistence().clearCache(cExtRealEstateCampaign);
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
	public static List<CExtRealEstateCampaign> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CExtRealEstateCampaign> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CExtRealEstateCampaign> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CExtRealEstateCampaign update(
		CExtRealEstateCampaign cExtRealEstateCampaign) {
		return getPersistence().update(cExtRealEstateCampaign);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CExtRealEstateCampaign update(
		CExtRealEstateCampaign cExtRealEstateCampaign,
		ServiceContext serviceContext) {
		return getPersistence().update(cExtRealEstateCampaign, serviceContext);
	}

	/**
	* Returns all the c ext real estate campaigns where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching c ext real estate campaigns
	*/
	public static List<CExtRealEstateCampaign> findByOrganizationId(
		long organizationId) {
		return getPersistence().findByOrganizationId(organizationId);
	}

	/**
	* Returns a range of all the c ext real estate campaigns where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext real estate campaigns
	* @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	* @return the range of matching c ext real estate campaigns
	*/
	public static List<CExtRealEstateCampaign> findByOrganizationId(
		long organizationId, int start, int end) {
		return getPersistence().findByOrganizationId(organizationId, start, end);
	}

	/**
	* Returns an ordered range of all the c ext real estate campaigns where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext real estate campaigns
	* @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching c ext real estate campaigns
	*/
	public static List<CExtRealEstateCampaign> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator) {
		return getPersistence()
				   .findByOrganizationId(organizationId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the c ext real estate campaigns where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of c ext real estate campaigns
	* @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching c ext real estate campaigns
	*/
	public static List<CExtRealEstateCampaign> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOrganizationId(organizationId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first c ext real estate campaign in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext real estate campaign
	* @throws NoSuchCExtRealEstateCampaignException if a matching c ext real estate campaign could not be found
	*/
	public static CExtRealEstateCampaign findByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator)
		throws ucc.portal.exception.NoSuchCExtRealEstateCampaignException {
		return getPersistence()
				   .findByOrganizationId_First(organizationId, orderByComparator);
	}

	/**
	* Returns the first c ext real estate campaign in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext real estate campaign, or <code>null</code> if a matching c ext real estate campaign could not be found
	*/
	public static CExtRealEstateCampaign fetchByOrganizationId_First(
		long organizationId,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator) {
		return getPersistence()
				   .fetchByOrganizationId_First(organizationId,
			orderByComparator);
	}

	/**
	* Returns the last c ext real estate campaign in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext real estate campaign
	* @throws NoSuchCExtRealEstateCampaignException if a matching c ext real estate campaign could not be found
	*/
	public static CExtRealEstateCampaign findByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator)
		throws ucc.portal.exception.NoSuchCExtRealEstateCampaignException {
		return getPersistence()
				   .findByOrganizationId_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the last c ext real estate campaign in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext real estate campaign, or <code>null</code> if a matching c ext real estate campaign could not be found
	*/
	public static CExtRealEstateCampaign fetchByOrganizationId_Last(
		long organizationId,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator) {
		return getPersistence()
				   .fetchByOrganizationId_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the c ext real estate campaigns before and after the current c ext real estate campaign in the ordered set where organizationId = &#63;.
	*
	* @param cExtRealEstateCampaignPK the primary key of the current c ext real estate campaign
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next c ext real estate campaign
	* @throws NoSuchCExtRealEstateCampaignException if a c ext real estate campaign with the primary key could not be found
	*/
	public static CExtRealEstateCampaign[] findByOrganizationId_PrevAndNext(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK,
		long organizationId,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator)
		throws ucc.portal.exception.NoSuchCExtRealEstateCampaignException {
		return getPersistence()
				   .findByOrganizationId_PrevAndNext(cExtRealEstateCampaignPK,
			organizationId, orderByComparator);
	}

	/**
	* Removes all the c ext real estate campaigns where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	*/
	public static void removeByOrganizationId(long organizationId) {
		getPersistence().removeByOrganizationId(organizationId);
	}

	/**
	* Returns the number of c ext real estate campaigns where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching c ext real estate campaigns
	*/
	public static int countByOrganizationId(long organizationId) {
		return getPersistence().countByOrganizationId(organizationId);
	}

	/**
	* Caches the c ext real estate campaign in the entity cache if it is enabled.
	*
	* @param cExtRealEstateCampaign the c ext real estate campaign
	*/
	public static void cacheResult(
		CExtRealEstateCampaign cExtRealEstateCampaign) {
		getPersistence().cacheResult(cExtRealEstateCampaign);
	}

	/**
	* Caches the c ext real estate campaigns in the entity cache if it is enabled.
	*
	* @param cExtRealEstateCampaigns the c ext real estate campaigns
	*/
	public static void cacheResult(
		List<CExtRealEstateCampaign> cExtRealEstateCampaigns) {
		getPersistence().cacheResult(cExtRealEstateCampaigns);
	}

	/**
	* Creates a new c ext real estate campaign with the primary key. Does not add the c ext real estate campaign to the database.
	*
	* @param cExtRealEstateCampaignPK the primary key for the new c ext real estate campaign
	* @return the new c ext real estate campaign
	*/
	public static CExtRealEstateCampaign create(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK) {
		return getPersistence().create(cExtRealEstateCampaignPK);
	}

	/**
	* Removes the c ext real estate campaign with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtRealEstateCampaignPK the primary key of the c ext real estate campaign
	* @return the c ext real estate campaign that was removed
	* @throws NoSuchCExtRealEstateCampaignException if a c ext real estate campaign with the primary key could not be found
	*/
	public static CExtRealEstateCampaign remove(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK)
		throws ucc.portal.exception.NoSuchCExtRealEstateCampaignException {
		return getPersistence().remove(cExtRealEstateCampaignPK);
	}

	public static CExtRealEstateCampaign updateImpl(
		CExtRealEstateCampaign cExtRealEstateCampaign) {
		return getPersistence().updateImpl(cExtRealEstateCampaign);
	}

	/**
	* Returns the c ext real estate campaign with the primary key or throws a {@link NoSuchCExtRealEstateCampaignException} if it could not be found.
	*
	* @param cExtRealEstateCampaignPK the primary key of the c ext real estate campaign
	* @return the c ext real estate campaign
	* @throws NoSuchCExtRealEstateCampaignException if a c ext real estate campaign with the primary key could not be found
	*/
	public static CExtRealEstateCampaign findByPrimaryKey(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK)
		throws ucc.portal.exception.NoSuchCExtRealEstateCampaignException {
		return getPersistence().findByPrimaryKey(cExtRealEstateCampaignPK);
	}

	/**
	* Returns the c ext real estate campaign with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cExtRealEstateCampaignPK the primary key of the c ext real estate campaign
	* @return the c ext real estate campaign, or <code>null</code> if a c ext real estate campaign with the primary key could not be found
	*/
	public static CExtRealEstateCampaign fetchByPrimaryKey(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK) {
		return getPersistence().fetchByPrimaryKey(cExtRealEstateCampaignPK);
	}

	public static java.util.Map<java.io.Serializable, CExtRealEstateCampaign> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the c ext real estate campaigns.
	*
	* @return the c ext real estate campaigns
	*/
	public static List<CExtRealEstateCampaign> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the c ext real estate campaigns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext real estate campaigns
	* @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	* @return the range of c ext real estate campaigns
	*/
	public static List<CExtRealEstateCampaign> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the c ext real estate campaigns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext real estate campaigns
	* @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c ext real estate campaigns
	*/
	public static List<CExtRealEstateCampaign> findAll(int start, int end,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the c ext real estate campaigns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext real estate campaigns
	* @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of c ext real estate campaigns
	*/
	public static List<CExtRealEstateCampaign> findAll(int start, int end,
		OrderByComparator<CExtRealEstateCampaign> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the c ext real estate campaigns from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of c ext real estate campaigns.
	*
	* @return the number of c ext real estate campaigns
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static CExtRealEstateCampaignPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CExtRealEstateCampaignPersistence, CExtRealEstateCampaignPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CExtRealEstateCampaignPersistence.class);

		ServiceTracker<CExtRealEstateCampaignPersistence, CExtRealEstateCampaignPersistence> serviceTracker =
			new ServiceTracker<CExtRealEstateCampaignPersistence, CExtRealEstateCampaignPersistence>(bundle.getBundleContext(),
				CExtRealEstateCampaignPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}