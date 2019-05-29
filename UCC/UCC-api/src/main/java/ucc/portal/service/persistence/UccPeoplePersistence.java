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

import ucc.portal.exception.NoSuchUccPeopleException;

import ucc.portal.model.UccPeople;

/**
 * The persistence interface for the ucc people service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.UccPeoplePersistenceImpl
 * @see UccPeopleUtil
 * @generated
 */
@ProviderType
public interface UccPeoplePersistence extends BasePersistence<UccPeople> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UccPeopleUtil} to access the ucc people persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ucc peoples where myActive = &#63;.
	*
	* @param myActive the my active
	* @return the matching ucc peoples
	*/
	public java.util.List<UccPeople> findByActive(boolean myActive);

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
	public java.util.List<UccPeople> findByActive(boolean myActive, int start,
		int end);

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
	public java.util.List<UccPeople> findByActive(boolean myActive, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator);

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
	public java.util.List<UccPeople> findByActive(boolean myActive, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ucc people in the ordered set where myActive = &#63;.
	*
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people
	* @throws NoSuchUccPeopleException if a matching ucc people could not be found
	*/
	public UccPeople findByActive_First(boolean myActive,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator)
		throws NoSuchUccPeopleException;

	/**
	* Returns the first ucc people in the ordered set where myActive = &#63;.
	*
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people, or <code>null</code> if a matching ucc people could not be found
	*/
	public UccPeople fetchByActive_First(boolean myActive,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator);

	/**
	* Returns the last ucc people in the ordered set where myActive = &#63;.
	*
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people
	* @throws NoSuchUccPeopleException if a matching ucc people could not be found
	*/
	public UccPeople findByActive_Last(boolean myActive,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator)
		throws NoSuchUccPeopleException;

	/**
	* Returns the last ucc people in the ordered set where myActive = &#63;.
	*
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people, or <code>null</code> if a matching ucc people could not be found
	*/
	public UccPeople fetchByActive_Last(boolean myActive,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator);

	/**
	* Returns the ucc peoples before and after the current ucc people in the ordered set where myActive = &#63;.
	*
	* @param uccPeopleId the primary key of the current ucc people
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ucc people
	* @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	*/
	public UccPeople[] findByActive_PrevAndNext(int uccPeopleId,
		boolean myActive,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator)
		throws NoSuchUccPeopleException;

	/**
	* Removes all the ucc peoples where myActive = &#63; from the database.
	*
	* @param myActive the my active
	*/
	public void removeByActive(boolean myActive);

	/**
	* Returns the number of ucc peoples where myActive = &#63;.
	*
	* @param myActive the my active
	* @return the number of matching ucc peoples
	*/
	public int countByActive(boolean myActive);

	/**
	* Returns all the ucc peoples where oldUccPeopleId = &#63;.
	*
	* @param oldUccPeopleId the old ucc people ID
	* @return the matching ucc peoples
	*/
	public java.util.List<UccPeople> findByOldUccPeopleId(int oldUccPeopleId);

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
	public java.util.List<UccPeople> findByOldUccPeopleId(int oldUccPeopleId,
		int start, int end);

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
	public java.util.List<UccPeople> findByOldUccPeopleId(int oldUccPeopleId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator);

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
	public java.util.List<UccPeople> findByOldUccPeopleId(int oldUccPeopleId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ucc people in the ordered set where oldUccPeopleId = &#63;.
	*
	* @param oldUccPeopleId the old ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people
	* @throws NoSuchUccPeopleException if a matching ucc people could not be found
	*/
	public UccPeople findByOldUccPeopleId_First(int oldUccPeopleId,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator)
		throws NoSuchUccPeopleException;

	/**
	* Returns the first ucc people in the ordered set where oldUccPeopleId = &#63;.
	*
	* @param oldUccPeopleId the old ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc people, or <code>null</code> if a matching ucc people could not be found
	*/
	public UccPeople fetchByOldUccPeopleId_First(int oldUccPeopleId,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator);

	/**
	* Returns the last ucc people in the ordered set where oldUccPeopleId = &#63;.
	*
	* @param oldUccPeopleId the old ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people
	* @throws NoSuchUccPeopleException if a matching ucc people could not be found
	*/
	public UccPeople findByOldUccPeopleId_Last(int oldUccPeopleId,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator)
		throws NoSuchUccPeopleException;

	/**
	* Returns the last ucc people in the ordered set where oldUccPeopleId = &#63;.
	*
	* @param oldUccPeopleId the old ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc people, or <code>null</code> if a matching ucc people could not be found
	*/
	public UccPeople fetchByOldUccPeopleId_Last(int oldUccPeopleId,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator);

	/**
	* Returns the ucc peoples before and after the current ucc people in the ordered set where oldUccPeopleId = &#63;.
	*
	* @param uccPeopleId the primary key of the current ucc people
	* @param oldUccPeopleId the old ucc people ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ucc people
	* @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	*/
	public UccPeople[] findByOldUccPeopleId_PrevAndNext(int uccPeopleId,
		int oldUccPeopleId,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator)
		throws NoSuchUccPeopleException;

	/**
	* Removes all the ucc peoples where oldUccPeopleId = &#63; from the database.
	*
	* @param oldUccPeopleId the old ucc people ID
	*/
	public void removeByOldUccPeopleId(int oldUccPeopleId);

	/**
	* Returns the number of ucc peoples where oldUccPeopleId = &#63;.
	*
	* @param oldUccPeopleId the old ucc people ID
	* @return the number of matching ucc peoples
	*/
	public int countByOldUccPeopleId(int oldUccPeopleId);

	/**
	* Caches the ucc people in the entity cache if it is enabled.
	*
	* @param uccPeople the ucc people
	*/
	public void cacheResult(UccPeople uccPeople);

	/**
	* Caches the ucc peoples in the entity cache if it is enabled.
	*
	* @param uccPeoples the ucc peoples
	*/
	public void cacheResult(java.util.List<UccPeople> uccPeoples);

	/**
	* Creates a new ucc people with the primary key. Does not add the ucc people to the database.
	*
	* @param uccPeopleId the primary key for the new ucc people
	* @return the new ucc people
	*/
	public UccPeople create(int uccPeopleId);

	/**
	* Removes the ucc people with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccPeopleId the primary key of the ucc people
	* @return the ucc people that was removed
	* @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	*/
	public UccPeople remove(int uccPeopleId) throws NoSuchUccPeopleException;

	public UccPeople updateImpl(UccPeople uccPeople);

	/**
	* Returns the ucc people with the primary key or throws a {@link NoSuchUccPeopleException} if it could not be found.
	*
	* @param uccPeopleId the primary key of the ucc people
	* @return the ucc people
	* @throws NoSuchUccPeopleException if a ucc people with the primary key could not be found
	*/
	public UccPeople findByPrimaryKey(int uccPeopleId)
		throws NoSuchUccPeopleException;

	/**
	* Returns the ucc people with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param uccPeopleId the primary key of the ucc people
	* @return the ucc people, or <code>null</code> if a ucc people with the primary key could not be found
	*/
	public UccPeople fetchByPrimaryKey(int uccPeopleId);

	@Override
	public java.util.Map<java.io.Serializable, UccPeople> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ucc peoples.
	*
	* @return the ucc peoples
	*/
	public java.util.List<UccPeople> findAll();

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
	public java.util.List<UccPeople> findAll(int start, int end);

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
	public java.util.List<UccPeople> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator);

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
	public java.util.List<UccPeople> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccPeople> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ucc peoples from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ucc peoples.
	*
	* @return the number of ucc peoples
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}