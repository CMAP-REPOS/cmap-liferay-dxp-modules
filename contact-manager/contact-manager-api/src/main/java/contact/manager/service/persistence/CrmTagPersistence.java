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

package contact.manager.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import contact.manager.exception.NoSuchCrmTagException;

import contact.manager.model.CrmTag;

/**
 * The persistence interface for the CRM Tag service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmTagPersistenceImpl
 * @see CrmTagUtil
 * @generated
 */
@ProviderType
public interface CrmTagPersistence extends BasePersistence<CrmTag> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmTagUtil} to access the CRM Tag persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM Tags where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Tags
	*/
	public java.util.List<CrmTag> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the CRM Tags where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @return the range of matching CRM Tags
	*/
	public java.util.List<CrmTag> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the CRM Tags where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Tags
	*/
	public java.util.List<CrmTag> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Tags where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Tags
	*/
	public java.util.List<CrmTag> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Tag in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Tag
	* @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	*/
	public CrmTag findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException;

	/**
	* Returns the first CRM Tag in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public CrmTag fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator);

	/**
	* Returns the last CRM Tag in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Tag
	* @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	*/
	public CrmTag findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException;

	/**
	* Returns the last CRM Tag in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public CrmTag fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator);

	/**
	* Returns the CRM Tags before and after the current CRM Tag in the ordered set where uuid = &#63;.
	*
	* @param crmTagId the primary key of the current CRM Tag
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Tag
	* @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	*/
	public CrmTag[] findByUuid_PrevAndNext(long crmTagId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException;

	/**
	* Removes all the CRM Tags where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM Tags where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Tags
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM Tag where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmTagException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Tag
	* @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	*/
	public CrmTag findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmTagException;

	/**
	* Returns the CRM Tag where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public CrmTag fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the CRM Tag where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public CrmTag fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM Tag where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Tag that was removed
	*/
	public CrmTag removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmTagException;

	/**
	* Returns the number of CRM Tags where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Tags
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM Tags where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Tags
	*/
	public java.util.List<CrmTag> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the CRM Tags where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @return the range of matching CRM Tags
	*/
	public java.util.List<CrmTag> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM Tags where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Tags
	*/
	public java.util.List<CrmTag> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Tags where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Tags
	*/
	public java.util.List<CrmTag> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Tag
	* @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	*/
	public CrmTag findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException;

	/**
	* Returns the first CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public CrmTag fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator);

	/**
	* Returns the last CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Tag
	* @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	*/
	public CrmTag findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException;

	/**
	* Returns the last CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	public CrmTag fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator);

	/**
	* Returns the CRM Tags before and after the current CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmTagId the primary key of the current CRM Tag
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Tag
	* @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	*/
	public CrmTag[] findByUuid_C_PrevAndNext(long crmTagId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException;

	/**
	* Removes all the CRM Tags where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM Tags where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Tags
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the CRM Tag in the entity cache if it is enabled.
	*
	* @param crmTag the CRM Tag
	*/
	public void cacheResult(CrmTag crmTag);

	/**
	* Caches the CRM Tags in the entity cache if it is enabled.
	*
	* @param crmTags the CRM Tags
	*/
	public void cacheResult(java.util.List<CrmTag> crmTags);

	/**
	* Creates a new CRM Tag with the primary key. Does not add the CRM Tag to the database.
	*
	* @param crmTagId the primary key for the new CRM Tag
	* @return the new CRM Tag
	*/
	public CrmTag create(long crmTagId);

	/**
	* Removes the CRM Tag with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmTagId the primary key of the CRM Tag
	* @return the CRM Tag that was removed
	* @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	*/
	public CrmTag remove(long crmTagId) throws NoSuchCrmTagException;

	public CrmTag updateImpl(CrmTag crmTag);

	/**
	* Returns the CRM Tag with the primary key or throws a {@link NoSuchCrmTagException} if it could not be found.
	*
	* @param crmTagId the primary key of the CRM Tag
	* @return the CRM Tag
	* @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	*/
	public CrmTag findByPrimaryKey(long crmTagId) throws NoSuchCrmTagException;

	/**
	* Returns the CRM Tag with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmTagId the primary key of the CRM Tag
	* @return the CRM Tag, or <code>null</code> if a CRM Tag with the primary key could not be found
	*/
	public CrmTag fetchByPrimaryKey(long crmTagId);

	@Override
	public java.util.Map<java.io.Serializable, CrmTag> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM Tags.
	*
	* @return the CRM Tags
	*/
	public java.util.List<CrmTag> findAll();

	/**
	* Returns a range of all the CRM Tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @return the range of CRM Tags
	*/
	public java.util.List<CrmTag> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM Tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Tags
	*/
	public java.util.List<CrmTag> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Tags
	*/
	public java.util.List<CrmTag> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmTag> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM Tags from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM Tags.
	*
	* @return the number of CRM Tags
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}