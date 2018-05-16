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

import contact.manager.service.exception.NoSuchCmapTagException;
import contact.manager.service.model.CmapTag;

/**
 * The persistence interface for the cmap tag service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.CmapTagPersistenceImpl
 * @see CmapTagUtil
 * @generated
 */
@ProviderType
public interface CmapTagPersistence extends BasePersistence<CmapTag> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CmapTagUtil} to access the cmap tag persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the cmap tag in the entity cache if it is enabled.
	*
	* @param cmapTag the cmap tag
	*/
	public void cacheResult(CmapTag cmapTag);

	/**
	* Caches the cmap tags in the entity cache if it is enabled.
	*
	* @param cmapTags the cmap tags
	*/
	public void cacheResult(java.util.List<CmapTag> cmapTags);

	/**
	* Creates a new cmap tag with the primary key. Does not add the cmap tag to the database.
	*
	* @param tagId the primary key for the new cmap tag
	* @return the new cmap tag
	*/
	public CmapTag create(long tagId);

	/**
	* Removes the cmap tag with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tagId the primary key of the cmap tag
	* @return the cmap tag that was removed
	* @throws NoSuchCmapTagException if a cmap tag with the primary key could not be found
	*/
	public CmapTag remove(long tagId) throws NoSuchCmapTagException;

	public CmapTag updateImpl(CmapTag cmapTag);

	/**
	* Returns the cmap tag with the primary key or throws a {@link NoSuchCmapTagException} if it could not be found.
	*
	* @param tagId the primary key of the cmap tag
	* @return the cmap tag
	* @throws NoSuchCmapTagException if a cmap tag with the primary key could not be found
	*/
	public CmapTag findByPrimaryKey(long tagId) throws NoSuchCmapTagException;

	/**
	* Returns the cmap tag with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tagId the primary key of the cmap tag
	* @return the cmap tag, or <code>null</code> if a cmap tag with the primary key could not be found
	*/
	public CmapTag fetchByPrimaryKey(long tagId);

	@Override
	public java.util.Map<java.io.Serializable, CmapTag> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the cmap tags.
	*
	* @return the cmap tags
	*/
	public java.util.List<CmapTag> findAll();

	/**
	* Returns a range of all the cmap tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap tags
	* @param end the upper bound of the range of cmap tags (not inclusive)
	* @return the range of cmap tags
	*/
	public java.util.List<CmapTag> findAll(int start, int end);

	/**
	* Returns an ordered range of all the cmap tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap tags
	* @param end the upper bound of the range of cmap tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cmap tags
	*/
	public java.util.List<CmapTag> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CmapTag> orderByComparator);

	/**
	* Returns an ordered range of all the cmap tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CmapTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap tags
	* @param end the upper bound of the range of cmap tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of cmap tags
	*/
	public java.util.List<CmapTag> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CmapTag> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the cmap tags from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of cmap tags.
	*
	* @return the number of cmap tags
	*/
	public int countAll();
}