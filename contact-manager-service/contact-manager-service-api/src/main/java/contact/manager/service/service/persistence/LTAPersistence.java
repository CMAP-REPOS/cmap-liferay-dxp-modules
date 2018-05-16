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

import contact.manager.service.exception.NoSuchLTAException;
import contact.manager.service.model.LTA;

/**
 * The persistence interface for the lta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.LTAPersistenceImpl
 * @see LTAUtil
 * @generated
 */
@ProviderType
public interface LTAPersistence extends BasePersistence<LTA> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LTAUtil} to access the lta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ltas where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the matching ltas
	*/
	public java.util.List<LTA> findByZipCode(java.lang.String zipCode);

	/**
	* Returns a range of all the ltas where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @return the range of matching ltas
	*/
	public java.util.List<LTA> findByZipCode(java.lang.String zipCode,
		int start, int end);

	/**
	* Returns an ordered range of all the ltas where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ltas
	*/
	public java.util.List<LTA> findByZipCode(java.lang.String zipCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LTA> orderByComparator);

	/**
	* Returns an ordered range of all the ltas where zipCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param zipCode the zip code
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ltas
	*/
	public java.util.List<LTA> findByZipCode(java.lang.String zipCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LTA> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first lta in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lta
	* @throws NoSuchLTAException if a matching lta could not be found
	*/
	public LTA findByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<LTA> orderByComparator)
		throws NoSuchLTAException;

	/**
	* Returns the first lta in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lta, or <code>null</code> if a matching lta could not be found
	*/
	public LTA fetchByZipCode_First(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<LTA> orderByComparator);

	/**
	* Returns the last lta in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lta
	* @throws NoSuchLTAException if a matching lta could not be found
	*/
	public LTA findByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<LTA> orderByComparator)
		throws NoSuchLTAException;

	/**
	* Returns the last lta in the ordered set where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lta, or <code>null</code> if a matching lta could not be found
	*/
	public LTA fetchByZipCode_Last(java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<LTA> orderByComparator);

	/**
	* Returns the ltas before and after the current lta in the ordered set where zipCode = &#63;.
	*
	* @param ltaId the primary key of the current lta
	* @param zipCode the zip code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lta
	* @throws NoSuchLTAException if a lta with the primary key could not be found
	*/
	public LTA[] findByZipCode_PrevAndNext(long ltaId,
		java.lang.String zipCode,
		com.liferay.portal.kernel.util.OrderByComparator<LTA> orderByComparator)
		throws NoSuchLTAException;

	/**
	* Removes all the ltas where zipCode = &#63; from the database.
	*
	* @param zipCode the zip code
	*/
	public void removeByZipCode(java.lang.String zipCode);

	/**
	* Returns the number of ltas where zipCode = &#63;.
	*
	* @param zipCode the zip code
	* @return the number of matching ltas
	*/
	public int countByZipCode(java.lang.String zipCode);

	/**
	* Caches the lta in the entity cache if it is enabled.
	*
	* @param lta the lta
	*/
	public void cacheResult(LTA lta);

	/**
	* Caches the ltas in the entity cache if it is enabled.
	*
	* @param ltas the ltas
	*/
	public void cacheResult(java.util.List<LTA> ltas);

	/**
	* Creates a new lta with the primary key. Does not add the lta to the database.
	*
	* @param ltaId the primary key for the new lta
	* @return the new lta
	*/
	public LTA create(long ltaId);

	/**
	* Removes the lta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ltaId the primary key of the lta
	* @return the lta that was removed
	* @throws NoSuchLTAException if a lta with the primary key could not be found
	*/
	public LTA remove(long ltaId) throws NoSuchLTAException;

	public LTA updateImpl(LTA lta);

	/**
	* Returns the lta with the primary key or throws a {@link NoSuchLTAException} if it could not be found.
	*
	* @param ltaId the primary key of the lta
	* @return the lta
	* @throws NoSuchLTAException if a lta with the primary key could not be found
	*/
	public LTA findByPrimaryKey(long ltaId) throws NoSuchLTAException;

	/**
	* Returns the lta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ltaId the primary key of the lta
	* @return the lta, or <code>null</code> if a lta with the primary key could not be found
	*/
	public LTA fetchByPrimaryKey(long ltaId);

	@Override
	public java.util.Map<java.io.Serializable, LTA> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ltas.
	*
	* @return the ltas
	*/
	public java.util.List<LTA> findAll();

	/**
	* Returns a range of all the ltas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @return the range of ltas
	*/
	public java.util.List<LTA> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ltas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ltas
	*/
	public java.util.List<LTA> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LTA> orderByComparator);

	/**
	* Returns an ordered range of all the ltas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ltas
	* @param end the upper bound of the range of ltas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ltas
	*/
	public java.util.List<LTA> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LTA> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ltas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ltas.
	*
	* @return the number of ltas
	*/
	public int countAll();
}