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

import ucc.portal.exception.NoSuchUccAssociationException;

import ucc.portal.model.UccAssociation;

/**
 * The persistence interface for the ucc association service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.UccAssociationPersistenceImpl
 * @see UccAssociationUtil
 * @generated
 */
@ProviderType
public interface UccAssociationPersistence extends BasePersistence<UccAssociation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UccAssociationUtil} to access the ucc association persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ucc associations where uccConferenceId = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @return the matching ucc associations
	*/
	public java.util.List<UccAssociation> findByConferenceId(
		int uccConferenceId);

	/**
	* Returns a range of all the ucc associations where uccConferenceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccConferenceId the ucc conference ID
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @return the range of matching ucc associations
	*/
	public java.util.List<UccAssociation> findByConferenceId(
		int uccConferenceId, int start, int end);

	/**
	* Returns an ordered range of all the ucc associations where uccConferenceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccConferenceId the ucc conference ID
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ucc associations
	*/
	public java.util.List<UccAssociation> findByConferenceId(
		int uccConferenceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator);

	/**
	* Returns an ordered range of all the ucc associations where uccConferenceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccConferenceId the ucc conference ID
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ucc associations
	*/
	public java.util.List<UccAssociation> findByConferenceId(
		int uccConferenceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ucc association in the ordered set where uccConferenceId = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc association
	* @throws NoSuchUccAssociationException if a matching ucc association could not be found
	*/
	public UccAssociation findByConferenceId_First(int uccConferenceId,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator)
		throws NoSuchUccAssociationException;

	/**
	* Returns the first ucc association in the ordered set where uccConferenceId = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc association, or <code>null</code> if a matching ucc association could not be found
	*/
	public UccAssociation fetchByConferenceId_First(int uccConferenceId,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator);

	/**
	* Returns the last ucc association in the ordered set where uccConferenceId = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc association
	* @throws NoSuchUccAssociationException if a matching ucc association could not be found
	*/
	public UccAssociation findByConferenceId_Last(int uccConferenceId,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator)
		throws NoSuchUccAssociationException;

	/**
	* Returns the last ucc association in the ordered set where uccConferenceId = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc association, or <code>null</code> if a matching ucc association could not be found
	*/
	public UccAssociation fetchByConferenceId_Last(int uccConferenceId,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator);

	/**
	* Returns the ucc associations before and after the current ucc association in the ordered set where uccConferenceId = &#63;.
	*
	* @param uccAssociationId the primary key of the current ucc association
	* @param uccConferenceId the ucc conference ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ucc association
	* @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	*/
	public UccAssociation[] findByConferenceId_PrevAndNext(
		int uccAssociationId, int uccConferenceId,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator)
		throws NoSuchUccAssociationException;

	/**
	* Removes all the ucc associations where uccConferenceId = &#63; from the database.
	*
	* @param uccConferenceId the ucc conference ID
	*/
	public void removeByConferenceId(int uccConferenceId);

	/**
	* Returns the number of ucc associations where uccConferenceId = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @return the number of matching ucc associations
	*/
	public int countByConferenceId(int uccConferenceId);

	/**
	* Returns all the ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @return the matching ucc associations
	*/
	public java.util.List<UccAssociation> findByC_A(int uccConferenceId,
		boolean myActive);

	/**
	* Returns a range of all the ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @return the range of matching ucc associations
	*/
	public java.util.List<UccAssociation> findByC_A(int uccConferenceId,
		boolean myActive, int start, int end);

	/**
	* Returns an ordered range of all the ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ucc associations
	*/
	public java.util.List<UccAssociation> findByC_A(int uccConferenceId,
		boolean myActive, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator);

	/**
	* Returns an ordered range of all the ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ucc associations
	*/
	public java.util.List<UccAssociation> findByC_A(int uccConferenceId,
		boolean myActive, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc association
	* @throws NoSuchUccAssociationException if a matching ucc association could not be found
	*/
	public UccAssociation findByC_A_First(int uccConferenceId,
		boolean myActive,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator)
		throws NoSuchUccAssociationException;

	/**
	* Returns the first ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ucc association, or <code>null</code> if a matching ucc association could not be found
	*/
	public UccAssociation fetchByC_A_First(int uccConferenceId,
		boolean myActive,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator);

	/**
	* Returns the last ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc association
	* @throws NoSuchUccAssociationException if a matching ucc association could not be found
	*/
	public UccAssociation findByC_A_Last(int uccConferenceId, boolean myActive,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator)
		throws NoSuchUccAssociationException;

	/**
	* Returns the last ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ucc association, or <code>null</code> if a matching ucc association could not be found
	*/
	public UccAssociation fetchByC_A_Last(int uccConferenceId,
		boolean myActive,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator);

	/**
	* Returns the ucc associations before and after the current ucc association in the ordered set where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccAssociationId the primary key of the current ucc association
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ucc association
	* @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	*/
	public UccAssociation[] findByC_A_PrevAndNext(int uccAssociationId,
		int uccConferenceId, boolean myActive,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator)
		throws NoSuchUccAssociationException;

	/**
	* Removes all the ucc associations where uccConferenceId = &#63; and myActive = &#63; from the database.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	*/
	public void removeByC_A(int uccConferenceId, boolean myActive);

	/**
	* Returns the number of ucc associations where uccConferenceId = &#63; and myActive = &#63;.
	*
	* @param uccConferenceId the ucc conference ID
	* @param myActive the my active
	* @return the number of matching ucc associations
	*/
	public int countByC_A(int uccConferenceId, boolean myActive);

	/**
	* Caches the ucc association in the entity cache if it is enabled.
	*
	* @param uccAssociation the ucc association
	*/
	public void cacheResult(UccAssociation uccAssociation);

	/**
	* Caches the ucc associations in the entity cache if it is enabled.
	*
	* @param uccAssociations the ucc associations
	*/
	public void cacheResult(java.util.List<UccAssociation> uccAssociations);

	/**
	* Creates a new ucc association with the primary key. Does not add the ucc association to the database.
	*
	* @param uccAssociationId the primary key for the new ucc association
	* @return the new ucc association
	*/
	public UccAssociation create(int uccAssociationId);

	/**
	* Removes the ucc association with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param uccAssociationId the primary key of the ucc association
	* @return the ucc association that was removed
	* @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	*/
	public UccAssociation remove(int uccAssociationId)
		throws NoSuchUccAssociationException;

	public UccAssociation updateImpl(UccAssociation uccAssociation);

	/**
	* Returns the ucc association with the primary key or throws a {@link NoSuchUccAssociationException} if it could not be found.
	*
	* @param uccAssociationId the primary key of the ucc association
	* @return the ucc association
	* @throws NoSuchUccAssociationException if a ucc association with the primary key could not be found
	*/
	public UccAssociation findByPrimaryKey(int uccAssociationId)
		throws NoSuchUccAssociationException;

	/**
	* Returns the ucc association with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param uccAssociationId the primary key of the ucc association
	* @return the ucc association, or <code>null</code> if a ucc association with the primary key could not be found
	*/
	public UccAssociation fetchByPrimaryKey(int uccAssociationId);

	@Override
	public java.util.Map<java.io.Serializable, UccAssociation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ucc associations.
	*
	* @return the ucc associations
	*/
	public java.util.List<UccAssociation> findAll();

	/**
	* Returns a range of all the ucc associations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @return the range of ucc associations
	*/
	public java.util.List<UccAssociation> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ucc associations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ucc associations
	*/
	public java.util.List<UccAssociation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator);

	/**
	* Returns an ordered range of all the ucc associations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UccAssociationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ucc associations
	* @param end the upper bound of the range of ucc associations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ucc associations
	*/
	public java.util.List<UccAssociation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UccAssociation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ucc associations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ucc associations.
	*
	* @return the number of ucc associations
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}