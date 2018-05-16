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

import contact.manager.service.exception.NoSuchState_SenateException;
import contact.manager.service.model.State_Senate;

/**
 * The persistence interface for the state_ senate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.State_SenatePersistenceImpl
 * @see State_SenateUtil
 * @generated
 */
@ProviderType
public interface State_SenatePersistence extends BasePersistence<State_Senate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link State_SenateUtil} to access the state_ senate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the state_ senates where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching state_ senates
	*/
	public java.util.List<State_Senate> findByZipCode(java.lang.String zipCode);

	/**
	* Returns a range of all the state_ senates where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of state_ senates
	* @param end the upper bound of the range of state_ senates (not inclusive)
	* @return the range of matching state_ senates
	*/
	public java.util.List<State_Senate> findByZipCode(
		java.lang.String zipCode, int start, int end);

	/**
	* Returns an ordered range of all the state_ senates where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of state_ senates
	* @param end the upper bound of the range of state_ senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching state_ senates
	*/
	public java.util.List<State_Senate> findByZipCode(
		java.lang.String zipCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<State_Senate> orderByComparator);

	/**
	* Returns an ordered range of all the state_ senates where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of state_ senates
	* @param end the upper bound of the range of state_ senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching state_ senates
	*/
	public java.util.List<State_Senate> findByZipCode(
		java.lang.String zipCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<State_Senate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first state_ senate in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching state_ senate
	* @throws NoSuchState_SenateException if a matching state_ senate could not be found
	*/
	public State_Senate findByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<State_Senate> orderByComparator)
		throws NoSuchState_SenateException;

	/**
	* Returns the first state_ senate in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching state_ senate, or <code>null</code> if a matching state_ senate could not be found
	*/
	public State_Senate fetchByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<State_Senate> orderByComparator);

	/**
	* Returns the last state_ senate in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching state_ senate
	* @throws NoSuchState_SenateException if a matching state_ senate could not be found
	*/
	public State_Senate findByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<State_Senate> orderByComparator)
		throws NoSuchState_SenateException;

	/**
	* Returns the last state_ senate in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching state_ senate, or <code>null</code> if a matching state_ senate could not be found
	*/
	public State_Senate fetchByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<State_Senate> orderByComparator);

	/**
	* Returns the state_ senates before and after the current state_ senate in the ordered set where zipCode = &#63;.
	*
	* @param stateSenateId the primary key of the current state_ senate
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next state_ senate
	* @throws NoSuchState_SenateException if a state_ senate with the primary key could not be found
	*/
	public State_Senate[] findByZipCode_PrevAndNext(long stateSenateId,
		java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<State_Senate> orderByComparator)
		throws NoSuchState_SenateException;

	/**
	* Removes all the state_ senates where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public void removeByZipCode(java.lang.String zipCode);

	/**
	* Returns the number of state_ senates where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching state_ senates
	*/
	public int countByZipCode(java.lang.String zipCode);

	/**
	* Caches the state_ senate in the entity cache if it is enabled.
	*
	* @param state_Senate the state_ senate
	*/
	public void cacheResult(State_Senate state_Senate);

	/**
	* Caches the state_ senates in the entity cache if it is enabled.
	*
	* @param state_Senates the state_ senates
	*/
	public void cacheResult(java.util.List<State_Senate> state_Senates);

	/**
	* Creates a new state_ senate with the primary key. Does not add the state_ senate to the database.
	*
	* @param stateSenateId the primary key for the new state_ senate
	* @return the new state_ senate
	*/
	public State_Senate create(long stateSenateId);

	/**
	* Removes the state_ senate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stateSenateId the primary key of the state_ senate
	* @return the state_ senate that was removed
	* @throws NoSuchState_SenateException if a state_ senate with the primary key could not be found
	*/
	public State_Senate remove(long stateSenateId)
		throws NoSuchState_SenateException;

	public State_Senate updateImpl(State_Senate state_Senate);

	/**
	* Returns the state_ senate with the primary key or throws a {@link NoSuchState_SenateException} if it could not be found.
	*
	* @param stateSenateId the primary key of the state_ senate
	* @return the state_ senate
	* @throws NoSuchState_SenateException if a state_ senate with the primary key could not be found
	*/
	public State_Senate findByPrimaryKey(long stateSenateId)
		throws NoSuchState_SenateException;

	/**
	* Returns the state_ senate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stateSenateId the primary key of the state_ senate
	* @return the state_ senate, or <code>null</code> if a state_ senate with the primary key could not be found
	*/
	public State_Senate fetchByPrimaryKey(long stateSenateId);

	@Override
	public java.util.Map<java.io.Serializable, State_Senate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the state_ senates.
	*
	* @return the state_ senates
	*/
	public java.util.List<State_Senate> findAll();

	/**
	* Returns a range of all the state_ senates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ senates
	* @param end the upper bound of the range of state_ senates (not inclusive)
	* @return the range of state_ senates
	*/
	public java.util.List<State_Senate> findAll(int start, int end);

	/**
	* Returns an ordered range of all the state_ senates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ senates
	* @param end the upper bound of the range of state_ senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of state_ senates
	*/
	public java.util.List<State_Senate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<State_Senate> orderByComparator);

	/**
	* Returns an ordered range of all the state_ senates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link State_SenateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of state_ senates
	* @param end the upper bound of the range of state_ senates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of state_ senates
	*/
	public java.util.List<State_Senate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<State_Senate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the state_ senates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of state_ senates.
	*
	* @return the number of state_ senates
	*/
	public int countAll();
}