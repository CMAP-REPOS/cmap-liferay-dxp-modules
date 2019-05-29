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

import ucc.portal.exception.NoSuchUccConferenceException;

import ucc.portal.model.UccConference;

/**
 * The persistence interface for the ucc conference service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.UccConferencePersistenceImpl
 * @see UccConferenceUtil
 * @generated
 */
@ProviderType
public interface UccConferencePersistence extends BasePersistence<UccConference> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UccConferenceUtil} to access the ucc conference persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the ucc conference in the entity cache if it is enabled.
	*
	* @param uccConference the ucc conference
	*/
	public void cacheResult(UccConference uccConference);

	/**
	* Caches the ucc conferences in the entity cache if it is enabled.
	*
	* @param uccConferences the ucc conferences
	*/
	public void cacheResult(java.util.List<UccConference> uccConferences);

	/**
	* Creates a new ucc conference with the primary key. Does not add the ucc conference to the database.
	*
	* @param uccConferenceId the primary key for the new ucc conference
	* @return the new ucc conference
	*/
	public UccConference create(int uccConferenceId);

	/**
	* Removes the ucc conference with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccConferenceId the primary key of the ucc conference
	* @return the ucc conference that was removed
	* @throws NoSuchUccConferenceException if a ucc conference with the primary key could not be found
	*/
	public UccConference remove(int uccConferenceId)
		throws NoSuchUccConferenceException;

	public UccConference updateImpl(UccConference uccConference);

	/**
	* Returns the ucc conference with the primary key or throws a {@link NoSuchUccConferenceException} if it could not be found.
	*
	* @param uccConferenceId the primary key of the ucc conference
	* @return the ucc conference
	* @throws NoSuchUccConferenceException if a ucc conference with the primary key could not be found
	*/
	public UccConference findByPrimaryKey(int uccConferenceId)
		throws NoSuchUccConferenceException;

	/**
	* Returns the ucc conference with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param uccConferenceId the primary key of the ucc conference
	* @return the ucc conference, or <code>null</code> if a ucc conference with the primary key could not be found
	*/
	public UccConference fetchByPrimaryKey(int uccConferenceId);

	@Override
	public java.util.Map<java.io.Serializable, UccConference> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ucc conferences.
	*
	* @return the ucc conferences
	*/
	public java.util.List<UccConference> findAll();

	/**
	* Returns a range of all the ucc conferences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccConferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc conferences
	* @param end the upper bound of the range of ucc conferences (not inclusive)
	* @return the range of ucc conferences
	*/
	public java.util.List<UccConference> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ucc conferences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccConferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc conferences
	* @param end the upper bound of the range of ucc conferences (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ucc conferences
	*/
	public java.util.List<UccConference> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccConference> orderByComparator);

	/**
	* Returns an ordered range of all the ucc conferences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccConferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc conferences
	* @param end the upper bound of the range of ucc conferences (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ucc conferences
	*/
	public java.util.List<UccConference> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccConference> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ucc conferences from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ucc conferences.
	*
	* @return the number of ucc conferences
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}