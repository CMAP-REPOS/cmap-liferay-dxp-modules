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

import contact.manager.service.exception.NoSuchCmapGroupException;
import contact.manager.service.model.CmapGroup;

/**
 * The persistence interface for the cmap group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.CmapGroupPersistenceImpl
 * @see CmapGroupUtil
 * @generated
 */
@ProviderType
public interface CmapGroupPersistence extends BasePersistence<CmapGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CmapGroupUtil} to access the cmap group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the cmap group in the entity cache if it is enabled.
	*
	* @param cmapGroup the cmap group
	*/
	public void cacheResult(CmapGroup cmapGroup);

	/**
	* Caches the cmap groups in the entity cache if it is enabled.
	*
	* @param cmapGroups the cmap groups
	*/
	public void cacheResult(java.util.List<CmapGroup> cmapGroups);

	/**
	* Creates a new cmap group with the primary key. Does not add the cmap group to the database.
	*
	* @param groupId the primary key for the new cmap group
	* @return the new cmap group
	*/
	public CmapGroup create(long groupId);

	/**
	* Removes the cmap group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupId the primary key of the cmap group
	* @return the cmap group that was removed
	* @throws NoSuchCmapGroupException if a cmap group with the primary key could not be found
	*/
	public CmapGroup remove(long groupId) throws NoSuchCmapGroupException;

	public CmapGroup updateImpl(CmapGroup cmapGroup);

	/**
	* Returns the cmap group with the primary key or throws a {@link NoSuchCmapGroupException} if it could not be found.
	*
	* @param groupId the primary key of the cmap group
	* @return the cmap group
	* @throws NoSuchCmapGroupException if a cmap group with the primary key could not be found
	*/
	public CmapGroup findByPrimaryKey(long groupId)
		throws NoSuchCmapGroupException;

	/**
	* Returns the cmap group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param groupId the primary key of the cmap group
	* @return the cmap group, or <code>null</code> if a cmap group with the primary key could not be found
	*/
	public CmapGroup fetchByPrimaryKey(long groupId);

	@Override
	public java.util.Map<java.io.Serializable, CmapGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the cmap groups.
	*
	* @return the cmap groups
	*/
	public java.util.List<CmapGroup> findAll();

	/**
	* Returns a range of all the cmap groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap groups
	* @param end the upper bound of the range of cmap groups (not inclusive)
	* @return the range of cmap groups
	*/
	public java.util.List<CmapGroup> findAll(int start, int end);

	/**
	* Returns an ordered range of all the cmap groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap groups
	* @param end the upper bound of the range of cmap groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cmap groups
	*/
	public java.util.List<CmapGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CmapGroup> orderByComparator);

	/**
	* Returns an ordered range of all the cmap groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap groups
	* @param end the upper bound of the range of cmap groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of cmap groups
	*/
	public java.util.List<CmapGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CmapGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the cmap groups from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of cmap groups.
	*
	* @return the number of cmap groups
	*/
	public int countAll();
}