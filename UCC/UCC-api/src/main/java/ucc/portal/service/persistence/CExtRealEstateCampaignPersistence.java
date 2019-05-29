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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import ucc.portal.exception.NoSuchCExtRealEstateCampaignException;

import ucc.portal.model.CExtRealEstateCampaign;

/**
 * The persistence interface for the c ext real estate campaign service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.CExtRealEstateCampaignPersistenceImpl
 * @see CExtRealEstateCampaignUtil
 * @generated
 */
@ProviderType
public interface CExtRealEstateCampaignPersistence extends BasePersistence<CExtRealEstateCampaign> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CExtRealEstateCampaignUtil} to access the c ext real estate campaign persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the c ext real estate campaigns where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching c ext real estate campaigns
	*/
	public java.util.List<CExtRealEstateCampaign> findByOrganizationId(
		long organizationId);

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
	public java.util.List<CExtRealEstateCampaign> findByOrganizationId(
		long organizationId, int start, int end);

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
	public java.util.List<CExtRealEstateCampaign> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtRealEstateCampaign> orderByComparator);

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
	public java.util.List<CExtRealEstateCampaign> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtRealEstateCampaign> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first c ext real estate campaign in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext real estate campaign
	* @throws NoSuchCExtRealEstateCampaignException if a matching c ext real estate campaign could not be found
	*/
	public CExtRealEstateCampaign findByOrganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtRealEstateCampaign> orderByComparator)
		throws NoSuchCExtRealEstateCampaignException;

	/**
	* Returns the first c ext real estate campaign in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext real estate campaign, or <code>null</code> if a matching c ext real estate campaign could not be found
	*/
	public CExtRealEstateCampaign fetchByOrganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtRealEstateCampaign> orderByComparator);

	/**
	* Returns the last c ext real estate campaign in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext real estate campaign
	* @throws NoSuchCExtRealEstateCampaignException if a matching c ext real estate campaign could not be found
	*/
	public CExtRealEstateCampaign findByOrganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtRealEstateCampaign> orderByComparator)
		throws NoSuchCExtRealEstateCampaignException;

	/**
	* Returns the last c ext real estate campaign in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext real estate campaign, or <code>null</code> if a matching c ext real estate campaign could not be found
	*/
	public CExtRealEstateCampaign fetchByOrganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtRealEstateCampaign> orderByComparator);

	/**
	* Returns the c ext real estate campaigns before and after the current c ext real estate campaign in the ordered set where organizationId = &#63;.
	*
	* @param cExtRealEstateCampaignPK the primary key of the current c ext real estate campaign
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next c ext real estate campaign
	* @throws NoSuchCExtRealEstateCampaignException if a c ext real estate campaign with the primary key could not be found
	*/
	public CExtRealEstateCampaign[] findByOrganizationId_PrevAndNext(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK,
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtRealEstateCampaign> orderByComparator)
		throws NoSuchCExtRealEstateCampaignException;

	/**
	* Removes all the c ext real estate campaigns where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	*/
	public void removeByOrganizationId(long organizationId);

	/**
	* Returns the number of c ext real estate campaigns where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching c ext real estate campaigns
	*/
	public int countByOrganizationId(long organizationId);

	/**
	* Caches the c ext real estate campaign in the entity cache if it is enabled.
	*
	* @param cExtRealEstateCampaign the c ext real estate campaign
	*/
	public void cacheResult(CExtRealEstateCampaign cExtRealEstateCampaign);

	/**
	* Caches the c ext real estate campaigns in the entity cache if it is enabled.
	*
	* @param cExtRealEstateCampaigns the c ext real estate campaigns
	*/
	public void cacheResult(
		java.util.List<CExtRealEstateCampaign> cExtRealEstateCampaigns);

	/**
	* Creates a new c ext real estate campaign with the primary key. Does not add the c ext real estate campaign to the database.
	*
	* @param cExtRealEstateCampaignPK the primary key for the new c ext real estate campaign
	* @return the new c ext real estate campaign
	*/
	public CExtRealEstateCampaign create(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK);

	/**
	* Removes the c ext real estate campaign with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtRealEstateCampaignPK the primary key of the c ext real estate campaign
	* @return the c ext real estate campaign that was removed
	* @throws NoSuchCExtRealEstateCampaignException if a c ext real estate campaign with the primary key could not be found
	*/
	public CExtRealEstateCampaign remove(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK)
		throws NoSuchCExtRealEstateCampaignException;

	public CExtRealEstateCampaign updateImpl(
		CExtRealEstateCampaign cExtRealEstateCampaign);

	/**
	* Returns the c ext real estate campaign with the primary key or throws a {@link NoSuchCExtRealEstateCampaignException} if it could not be found.
	*
	* @param cExtRealEstateCampaignPK the primary key of the c ext real estate campaign
	* @return the c ext real estate campaign
	* @throws NoSuchCExtRealEstateCampaignException if a c ext real estate campaign with the primary key could not be found
	*/
	public CExtRealEstateCampaign findByPrimaryKey(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK)
		throws NoSuchCExtRealEstateCampaignException;

	/**
	* Returns the c ext real estate campaign with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cExtRealEstateCampaignPK the primary key of the c ext real estate campaign
	* @return the c ext real estate campaign, or <code>null</code> if a c ext real estate campaign with the primary key could not be found
	*/
	public CExtRealEstateCampaign fetchByPrimaryKey(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK);

	@Override
	public java.util.Map<java.io.Serializable, CExtRealEstateCampaign> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the c ext real estate campaigns.
	*
	* @return the c ext real estate campaigns
	*/
	public java.util.List<CExtRealEstateCampaign> findAll();

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
	public java.util.List<CExtRealEstateCampaign> findAll(int start, int end);

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
	public java.util.List<CExtRealEstateCampaign> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtRealEstateCampaign> orderByComparator);

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
	public java.util.List<CExtRealEstateCampaign> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtRealEstateCampaign> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the c ext real estate campaigns from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of c ext real estate campaigns.
	*
	* @return the number of c ext real estate campaigns
	*/
	public int countAll();

	public java.util.Set<String> getCompoundPKColumnNames();
}