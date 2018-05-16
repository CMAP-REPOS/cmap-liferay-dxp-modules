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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import contact.manager.service.exception.NoSuchState_RepException;
import contact.manager.service.model.State_Rep;

/**
 * The persistence interface for the state_ rep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.State_RepPersistenceImpl
 * @see State_RepUtil
 * @generated
 */
@ProviderType
public interface State_RepPersistence extends BasePersistence<State_Rep> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link State_RepUtil} to access the state_ rep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the state_ rep in the entity cache if it is enabled.
	*
	* @param state_Rep the state_ rep
	*/
	public void cacheResult(State_Rep state_Rep);

	/**
	* Caches the state_ reps in the entity cache if it is enabled.
	*
	* @param state_Reps the state_ reps
	*/
	public void cacheResult(java.util.List<State_Rep> state_Reps);

	/**
	* Creates a new state_ rep with the primary key. Does not add the state_ rep to the database.
	*
	* @param stateRepId the primary key for the new state_ rep
	* @return the new state_ rep
	*/
	public State_Rep create(long stateRepId);

	/**
	* Removes the state_ rep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stateRepId the primary key of the state_ rep
	* @return the state_ rep that was removed
	* @throws NoSuchState_RepException if a state_ rep with the primary key could not be found
	*/
	public State_Rep remove(long stateRepId) throws NoSuchState_RepException;

	public State_Rep updateImpl(State_Rep state_Rep);

	/**
	* Returns the state_ rep with the primary key or throws a {@link NoSuchState_RepException} if it could not be found.
	*
	* @param stateRepId the primary key of the state_ rep
	* @return the state_ rep
	* @throws NoSuchState_RepException if a state_ rep with the primary key could not be found
	*/
	public State_Rep findByPrimaryKey(long stateRepId)
		throws NoSuchState_RepException;

	/**
	* Returns the state_ rep with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stateRepId the primary key of the state_ rep
	* @return the state_ rep, or <code>null</code> if a state_ rep with the primary key could not be found
	*/
	public State_Rep fetchByPrimaryKey(long stateRepId);

	@Override
	public java.util.Map<java.io.Serializable, State_Rep> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the state_ reps.
	*
	* @return the state_ reps
	*/
	public java.util.List<State_Rep> findAll();

	/**
	* Returns a range of all the state_ reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ reps
	* @param end the upper bound of the range of state_ reps (not inclusive)
	* @return the range of state_ reps
	*/
	public java.util.List<State_Rep> findAll(int start, int end);

	/**
	* Returns an ordered range of all the state_ reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ reps
	* @param end the upper bound of the range of state_ reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of state_ reps
	*/
	public java.util.List<State_Rep> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<State_Rep> orderByComparator);

	/**
	* Returns an ordered range of all the state_ reps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_RepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ reps
	* @param end the upper bound of the range of state_ reps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of state_ reps
	*/
	public java.util.List<State_Rep> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<State_Rep> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the state_ reps from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of state_ reps.
	*
	* @return the number of state_ reps
	*/
	public int countAll();
}