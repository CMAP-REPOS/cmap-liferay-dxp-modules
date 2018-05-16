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

import contact.manager.service.exception.NoSuchCCAException;
import contact.manager.service.model.CCA;

/**
 * The persistence interface for the cca service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.CCAPersistenceImpl
 * @see CCAUtil
 * @generated
 */
@ProviderType
public interface CCAPersistence extends BasePersistence<CCA> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CCAUtil} to access the cca persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the cca in the entity cache if it is enabled.
	*
	* @param cca the cca
	*/
	public void cacheResult(CCA cca);

	/**
	* Caches the ccas in the entity cache if it is enabled.
	*
	* @param ccas the ccas
	*/
	public void cacheResult(java.util.List<CCA> ccas);

	/**
	* Creates a new cca with the primary key. Does not add the cca to the database.
	*
	* @param ccaId the primary key for the new cca
	* @return the new cca
	*/
	public CCA create(long ccaId);

	/**
	* Removes the cca with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ccaId the primary key of the cca
	* @return the cca that was removed
	* @throws NoSuchCCAException if a cca with the primary key could not be found
	*/
	public CCA remove(long ccaId) throws NoSuchCCAException;

	public CCA updateImpl(CCA cca);

	/**
	* Returns the cca with the primary key or throws a {@link NoSuchCCAException} if it could not be found.
	*
	* @param ccaId the primary key of the cca
	* @return the cca
	* @throws NoSuchCCAException if a cca with the primary key could not be found
	*/
	public CCA findByPrimaryKey(long ccaId) throws NoSuchCCAException;

	/**
	* Returns the cca with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ccaId the primary key of the cca
	* @return the cca, or <code>null</code> if a cca with the primary key could not be found
	*/
	public CCA fetchByPrimaryKey(long ccaId);

	@Override
	public java.util.Map<java.io.Serializable, CCA> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ccas.
	*
	* @return the ccas
	*/
	public java.util.List<CCA> findAll();

	/**
	* Returns a range of all the ccas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ccas
	* @param end the upper bound of the range of ccas (not inclusive)
	* @return the range of ccas
	*/
	public java.util.List<CCA> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ccas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ccas
	* @param end the upper bound of the range of ccas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ccas
	*/
	public java.util.List<CCA> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CCA> orderByComparator);

	/**
	* Returns an ordered range of all the ccas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CCAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ccas
	* @param end the upper bound of the range of ccas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ccas
	*/
	public java.util.List<CCA> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CCA> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ccas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ccas.
	*
	* @return the number of ccas
	*/
	public int countAll();
}