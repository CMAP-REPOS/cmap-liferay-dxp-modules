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

import ucc.portal.exception.NoSuchUccPeopleChurchStandingException;

import ucc.portal.model.UccPeopleChurchStanding;

/**
 * The persistence interface for the ucc people church standing service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.UccPeopleChurchStandingPersistenceImpl
 * @see UccPeopleChurchStandingUtil
 * @generated
 */
@ProviderType
public interface UccPeopleChurchStandingPersistence extends BasePersistence<UccPeopleChurchStanding> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UccPeopleChurchStandingUtil} to access the ucc people church standing persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ucc people church standings where uccPeopleId = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @return the matching ucc people church standings
	*/
	public java.util.List<UccPeopleChurchStanding> findByPeopleId(
		int uccPeopleId);

	/**
	* Returns a range of all the ucc people church standings where uccPeopleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccPeopleId the ucc people ID
	* @param start the lower bound of the range of ucc people church standings
	* @param end the upper bound of the range of ucc people church standings (not inclusive)
	* @return the range of matching ucc people church standings
	*/
	public java.util.List<UccPeopleChurchStanding> findByPeopleId(
		int uccPeopleId, int start, int end);

	/**
	* Returns an ordered range of all the ucc people church standings where uccPeopleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccPeopleId the ucc people ID
	* @param start the lower bound of the range of ucc people church standings
	* @param end the upper bound of the range of ucc people church standings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ucc people church standings
	*/
	public java.util.List<UccPeopleChurchStanding> findByPeopleId(
		int uccPeopleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeopleChurchStanding> orderByComparator);

	/**
	* Returns an ordered range of all the ucc people church standings where uccPeopleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccPeopleId the ucc people ID
	* @param start the lower bound of the range of ucc people church standings
	* @param end the upper bound of the range of ucc people church standings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ucc people church standings
	*/
	public java.util.List<UccPeopleChurchStanding> findByPeopleId(
		int uccPeopleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeopleChurchStanding> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ucc people church standing in the ordered set where uccPeopleId = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people church standing
	* @throws NoSuchUccPeopleChurchStandingException if a matching ucc people church standing could not be found
	*/
	public UccPeopleChurchStanding findByPeopleId_First(int uccPeopleId,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeopleChurchStanding> orderByComparator)
		throws NoSuchUccPeopleChurchStandingException;

	/**
	* Returns the first ucc people church standing in the ordered set where uccPeopleId = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people church standing, or <code>null</code> if a matching ucc people church standing could not be found
	*/
	public UccPeopleChurchStanding fetchByPeopleId_First(int uccPeopleId,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeopleChurchStanding> orderByComparator);

	/**
	* Returns the last ucc people church standing in the ordered set where uccPeopleId = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people church standing
	* @throws NoSuchUccPeopleChurchStandingException if a matching ucc people church standing could not be found
	*/
	public UccPeopleChurchStanding findByPeopleId_Last(int uccPeopleId,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeopleChurchStanding> orderByComparator)
		throws NoSuchUccPeopleChurchStandingException;

	/**
	* Returns the last ucc people church standing in the ordered set where uccPeopleId = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people church standing, or <code>null</code> if a matching ucc people church standing could not be found
	*/
	public UccPeopleChurchStanding fetchByPeopleId_Last(int uccPeopleId,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeopleChurchStanding> orderByComparator);

	/**
	* Returns the ucc people church standings before and after the current ucc people church standing in the ordered set where uccPeopleId = &#63;.
	*
	* @param uccPeopleChurchStandingId the primary key of the current ucc people church standing
	* @param uccPeopleId the ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ucc people church standing
	* @throws NoSuchUccPeopleChurchStandingException if a ucc people church standing with the primary key could not be found
	*/
	public UccPeopleChurchStanding[] findByPeopleId_PrevAndNext(
		int uccPeopleChurchStandingId, int uccPeopleId,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeopleChurchStanding> orderByComparator)
		throws NoSuchUccPeopleChurchStandingException;

	/**
	* Removes all the ucc people church standings where uccPeopleId = &#63; from the database.
	*
	* @param uccPeopleId the ucc people ID
	*/
	public void removeByPeopleId(int uccPeopleId);

	/**
	* Returns the number of ucc people church standings where uccPeopleId = &#63;.
	*
	* @param uccPeopleId the ucc people ID
	* @return the number of matching ucc people church standings
	*/
	public int countByPeopleId(int uccPeopleId);

	/**
	* Caches the ucc people church standing in the entity cache if it is enabled.
	*
	* @param uccPeopleChurchStanding the ucc people church standing
	*/
	public void cacheResult(UccPeopleChurchStanding uccPeopleChurchStanding);

	/**
	* Caches the ucc people church standings in the entity cache if it is enabled.
	*
	* @param uccPeopleChurchStandings the ucc people church standings
	*/
	public void cacheResult(
		java.util.List<UccPeopleChurchStanding> uccPeopleChurchStandings);

	/**
	* Creates a new ucc people church standing with the primary key. Does not add the ucc people church standing to the database.
	*
	* @param uccPeopleChurchStandingId the primary key for the new ucc people church standing
	* @return the new ucc people church standing
	*/
	public UccPeopleChurchStanding create(int uccPeopleChurchStandingId);

	/**
	* Removes the ucc people church standing with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccPeopleChurchStandingId the primary key of the ucc people church standing
	* @return the ucc people church standing that was removed
	* @throws NoSuchUccPeopleChurchStandingException if a ucc people church standing with the primary key could not be found
	*/
	public UccPeopleChurchStanding remove(int uccPeopleChurchStandingId)
		throws NoSuchUccPeopleChurchStandingException;

	public UccPeopleChurchStanding updateImpl(
		UccPeopleChurchStanding uccPeopleChurchStanding);

	/**
	* Returns the ucc people church standing with the primary key or throws a {@link NoSuchUccPeopleChurchStandingException} if it could not be found.
	*
	* @param uccPeopleChurchStandingId the primary key of the ucc people church standing
	* @return the ucc people church standing
	* @throws NoSuchUccPeopleChurchStandingException if a ucc people church standing with the primary key could not be found
	*/
	public UccPeopleChurchStanding findByPrimaryKey(
		int uccPeopleChurchStandingId)
		throws NoSuchUccPeopleChurchStandingException;

	/**
	* Returns the ucc people church standing with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param uccPeopleChurchStandingId the primary key of the ucc people church standing
	* @return the ucc people church standing, or <code>null</code> if a ucc people church standing with the primary key could not be found
	*/
	public UccPeopleChurchStanding fetchByPrimaryKey(
		int uccPeopleChurchStandingId);

	@Override
	public java.util.Map<java.io.Serializable, UccPeopleChurchStanding> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ucc people church standings.
	*
	* @return the ucc people church standings
	*/
	public java.util.List<UccPeopleChurchStanding> findAll();

	/**
	* Returns a range of all the ucc people church standings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc people church standings
	* @param end the upper bound of the range of ucc people church standings (not inclusive)
	* @return the range of ucc people church standings
	*/
	public java.util.List<UccPeopleChurchStanding> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ucc people church standings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc people church standings
	* @param end the upper bound of the range of ucc people church standings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ucc people church standings
	*/
	public java.util.List<UccPeopleChurchStanding> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeopleChurchStanding> orderByComparator);

	/**
	* Returns an ordered range of all the ucc people church standings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccPeopleChurchStandingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc people church standings
	* @param end the upper bound of the range of ucc people church standings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ucc people church standings
	*/
	public java.util.List<UccPeopleChurchStanding> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeopleChurchStanding> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ucc people church standings from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ucc people church standings.
	*
	* @return the number of ucc people church standings
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}