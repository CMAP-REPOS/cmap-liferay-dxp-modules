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

import ucc.portal.exception.NoSuchCExtParticipationException;

import ucc.portal.model.CExtParticipation;

/**
 * The persistence interface for the c ext participation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.CExtParticipationPersistenceImpl
 * @see CExtParticipationUtil
 * @generated
 */
@ProviderType
public interface CExtParticipationPersistence extends BasePersistence<CExtParticipation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CExtParticipationUtil} to access the c ext participation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the c ext participations where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching c ext participations
	*/
	public java.util.List<CExtParticipation> findByOrganizationId(
		long organizationId);

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
	public java.util.List<CExtParticipation> findByOrganizationId(
		long organizationId, int start, int end);

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
	public java.util.List<CExtParticipation> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtParticipation> orderByComparator);

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
	public java.util.List<CExtParticipation> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtParticipation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first c ext participation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext participation
	* @throws NoSuchCExtParticipationException if a matching c ext participation could not be found
	*/
	public CExtParticipation findByOrganizationId_First(long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtParticipation> orderByComparator)
		throws NoSuchCExtParticipationException;

	/**
	* Returns the first c ext participation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	*/
	public CExtParticipation fetchByOrganizationId_First(long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtParticipation> orderByComparator);

	/**
	* Returns the last c ext participation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext participation
	* @throws NoSuchCExtParticipationException if a matching c ext participation could not be found
	*/
	public CExtParticipation findByOrganizationId_Last(long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtParticipation> orderByComparator)
		throws NoSuchCExtParticipationException;

	/**
	* Returns the last c ext participation in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	*/
	public CExtParticipation fetchByOrganizationId_Last(long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtParticipation> orderByComparator);

	/**
	* Returns the c ext participations before and after the current c ext participation in the ordered set where organizationId = &#63;.
	*
	* @param cExtParticipationPK the primary key of the current c ext participation
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next c ext participation
	* @throws NoSuchCExtParticipationException if a c ext participation with the primary key could not be found
	*/
	public CExtParticipation[] findByOrganizationId_PrevAndNext(
		ucc.portal.service.persistence.CExtParticipationPK cExtParticipationPK,
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator<CExtParticipation> orderByComparator)
		throws NoSuchCExtParticipationException;

	/**
	* Removes all the c ext participations where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	*/
	public void removeByOrganizationId(long organizationId);

	/**
	* Returns the number of c ext participations where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching c ext participations
	*/
	public int countByOrganizationId(long organizationId);

	/**
	* Returns the c ext participation where organizationId = &#63; and ppGatheringId = &#63; or throws a {@link NoSuchCExtParticipationException} if it could not be found.
	*
	* @param organizationId the organization ID
	* @param ppGatheringId the pp gathering ID
	* @return the matching c ext participation
	* @throws NoSuchCExtParticipationException if a matching c ext participation could not be found
	*/
	public CExtParticipation findByO_GI(long organizationId,
		String ppGatheringId) throws NoSuchCExtParticipationException;

	/**
	* Returns the c ext participation where organizationId = &#63; and ppGatheringId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param organizationId the organization ID
	* @param ppGatheringId the pp gathering ID
	* @return the matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	*/
	public CExtParticipation fetchByO_GI(long organizationId,
		String ppGatheringId);

	/**
	* Returns the c ext participation where organizationId = &#63; and ppGatheringId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param organizationId the organization ID
	* @param ppGatheringId the pp gathering ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	*/
	public CExtParticipation fetchByO_GI(long organizationId,
		String ppGatheringId, boolean retrieveFromCache);

	/**
	* Removes the c ext participation where organizationId = &#63; and ppGatheringId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @param ppGatheringId the pp gathering ID
	* @return the c ext participation that was removed
	*/
	public CExtParticipation removeByO_GI(long organizationId,
		String ppGatheringId) throws NoSuchCExtParticipationException;

	/**
	* Returns the number of c ext participations where organizationId = &#63; and ppGatheringId = &#63;.
	*
	* @param organizationId the organization ID
	* @param ppGatheringId the pp gathering ID
	* @return the number of matching c ext participations
	*/
	public int countByO_GI(long organizationId, String ppGatheringId);

	/**
	* Returns the c ext participation where organizationId = &#63; and ppGatheringKey = &#63; or throws a {@link NoSuchCExtParticipationException} if it could not be found.
	*
	* @param organizationId the organization ID
	* @param ppGatheringKey the pp gathering key
	* @return the matching c ext participation
	* @throws NoSuchCExtParticipationException if a matching c ext participation could not be found
	*/
	public CExtParticipation findByO_GK(long organizationId,
		String ppGatheringKey) throws NoSuchCExtParticipationException;

	/**
	* Returns the c ext participation where organizationId = &#63; and ppGatheringKey = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param organizationId the organization ID
	* @param ppGatheringKey the pp gathering key
	* @return the matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	*/
	public CExtParticipation fetchByO_GK(long organizationId,
		String ppGatheringKey);

	/**
	* Returns the c ext participation where organizationId = &#63; and ppGatheringKey = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param organizationId the organization ID
	* @param ppGatheringKey the pp gathering key
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching c ext participation, or <code>null</code> if a matching c ext participation could not be found
	*/
	public CExtParticipation fetchByO_GK(long organizationId,
		String ppGatheringKey, boolean retrieveFromCache);

	/**
	* Removes the c ext participation where organizationId = &#63; and ppGatheringKey = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @param ppGatheringKey the pp gathering key
	* @return the c ext participation that was removed
	*/
	public CExtParticipation removeByO_GK(long organizationId,
		String ppGatheringKey) throws NoSuchCExtParticipationException;

	/**
	* Returns the number of c ext participations where organizationId = &#63; and ppGatheringKey = &#63;.
	*
	* @param organizationId the organization ID
	* @param ppGatheringKey the pp gathering key
	* @return the number of matching c ext participations
	*/
	public int countByO_GK(long organizationId, String ppGatheringKey);

	/**
	* Caches the c ext participation in the entity cache if it is enabled.
	*
	* @param cExtParticipation the c ext participation
	*/
	public void cacheResult(CExtParticipation cExtParticipation);

	/**
	* Caches the c ext participations in the entity cache if it is enabled.
	*
	* @param cExtParticipations the c ext participations
	*/
	public void cacheResult(
		java.util.List<CExtParticipation> cExtParticipations);

	/**
	* Creates a new c ext participation with the primary key. Does not add the c ext participation to the database.
	*
	* @param cExtParticipationPK the primary key for the new c ext participation
	* @return the new c ext participation
	*/
	public CExtParticipation create(
		ucc.portal.service.persistence.CExtParticipationPK cExtParticipationPK);

	/**
	* Removes the c ext participation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtParticipationPK the primary key of the c ext participation
	* @return the c ext participation that was removed
	* @throws NoSuchCExtParticipationException if a c ext participation with the primary key could not be found
	*/
	public CExtParticipation remove(
		ucc.portal.service.persistence.CExtParticipationPK cExtParticipationPK)
		throws NoSuchCExtParticipationException;

	public CExtParticipation updateImpl(CExtParticipation cExtParticipation);

	/**
	* Returns the c ext participation with the primary key or throws a {@link NoSuchCExtParticipationException} if it could not be found.
	*
	* @param cExtParticipationPK the primary key of the c ext participation
	* @return the c ext participation
	* @throws NoSuchCExtParticipationException if a c ext participation with the primary key could not be found
	*/
	public CExtParticipation findByPrimaryKey(
		ucc.portal.service.persistence.CExtParticipationPK cExtParticipationPK)
		throws NoSuchCExtParticipationException;

	/**
	* Returns the c ext participation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cExtParticipationPK the primary key of the c ext participation
	* @return the c ext participation, or <code>null</code> if a c ext participation with the primary key could not be found
	*/
	public CExtParticipation fetchByPrimaryKey(
		ucc.portal.service.persistence.CExtParticipationPK cExtParticipationPK);

	@Override
	public java.util.Map<java.io.Serializable, CExtParticipation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the c ext participations.
	*
	* @return the c ext participations
	*/
	public java.util.List<CExtParticipation> findAll();

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
	public java.util.List<CExtParticipation> findAll(int start, int end);

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
	public java.util.List<CExtParticipation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtParticipation> orderByComparator);

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
	public java.util.List<CExtParticipation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CExtParticipation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the c ext participations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of c ext participations.
	*
	* @return the number of c ext participations
	*/
	public int countAll();

	public java.util.Set<String> getCompoundPKColumnNames();
}