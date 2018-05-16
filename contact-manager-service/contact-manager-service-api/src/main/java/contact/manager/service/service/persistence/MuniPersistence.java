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

import contact.manager.service.exception.NoSuchMuniException;
import contact.manager.service.model.Muni;

/**
 * The persistence interface for the muni service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.MuniPersistenceImpl
 * @see MuniUtil
 * @generated
 */
@ProviderType
public interface MuniPersistence extends BasePersistence<Muni> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MuniUtil} to access the muni persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the muni in the entity cache if it is enabled.
	*
	* @param muni the muni
	*/
	public void cacheResult(Muni muni);

	/**
	* Caches the munis in the entity cache if it is enabled.
	*
	* @param munis the munis
	*/
	public void cacheResult(java.util.List<Muni> munis);

	/**
	* Creates a new muni with the primary key. Does not add the muni to the database.
	*
	* @param muniId the primary key for the new muni
	* @return the new muni
	*/
	public Muni create(long muniId);

	/**
	* Removes the muni with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param muniId the primary key of the muni
	* @return the muni that was removed
	* @throws NoSuchMuniException if a muni with the primary key could not be found
	*/
	public Muni remove(long muniId) throws NoSuchMuniException;

	public Muni updateImpl(Muni muni);

	/**
	* Returns the muni with the primary key or throws a {@link NoSuchMuniException} if it could not be found.
	*
	* @param muniId the primary key of the muni
	* @return the muni
	* @throws NoSuchMuniException if a muni with the primary key could not be found
	*/
	public Muni findByPrimaryKey(long muniId) throws NoSuchMuniException;

	/**
	* Returns the muni with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param muniId the primary key of the muni
	* @return the muni, or <code>null</code> if a muni with the primary key could not be found
	*/
	public Muni fetchByPrimaryKey(long muniId);

	@Override
	public java.util.Map<java.io.Serializable, Muni> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the munis.
	*
	* @return the munis
	*/
	public java.util.List<Muni> findAll();

	/**
	* Returns a range of all the munis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of munis
	* @param end the upper bound of the range of munis (not inclusive)
	* @return the range of munis
	*/
	public java.util.List<Muni> findAll(int start, int end);

	/**
	* Returns an ordered range of all the munis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of munis
	* @param end the upper bound of the range of munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of munis
	*/
	public java.util.List<Muni> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Muni> orderByComparator);

	/**
	* Returns an ordered range of all the munis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MuniModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of munis
	* @param end the upper bound of the range of munis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of munis
	*/
	public java.util.List<Muni> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Muni> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the munis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of munis.
	*
	* @return the number of munis
	*/
	public int countAll();
}