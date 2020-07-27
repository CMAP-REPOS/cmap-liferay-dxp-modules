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
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.exception.NoSuchCrmTagException;
import contact.manager.model.CrmTag;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the CRM Tag service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
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
	@Override
	public Map<Serializable, CrmTag> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the CRM Tags where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Tags
	 */
	public java.util.List<CrmTag> findByUuid(String uuid);

	/**
	 * Returns a range of all the CRM Tags where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @return the range of matching CRM Tags
	 */
	public java.util.List<CrmTag> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the CRM Tags where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Tags
	 */
	@Deprecated
	public java.util.List<CrmTag> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmTag> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM Tags where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Tags
	 */
	public java.util.List<CrmTag> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmTag> orderByComparator);

	/**
	 * Returns the first CRM Tag in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Tag
	 * @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	 */
	public CrmTag findByUuid_First(
			String uuid, OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException;

	/**
	 * Returns the first CRM Tag in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	 */
	public CrmTag fetchByUuid_First(
		String uuid, OrderByComparator<CrmTag> orderByComparator);

	/**
	 * Returns the last CRM Tag in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Tag
	 * @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	 */
	public CrmTag findByUuid_Last(
			String uuid, OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException;

	/**
	 * Returns the last CRM Tag in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	 */
	public CrmTag fetchByUuid_Last(
		String uuid, OrderByComparator<CrmTag> orderByComparator);

	/**
	 * Returns the CRM Tags before and after the current CRM Tag in the ordered set where uuid = &#63;.
	 *
	 * @param crmTagId the primary key of the current CRM Tag
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Tag
	 * @throws NoSuchCrmTagException if a CRM Tag with the primary key could not be found
	 */
	public CrmTag[] findByUuid_PrevAndNext(
			long crmTagId, String uuid,
			OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException;

	/**
	 * Removes all the CRM Tags where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of CRM Tags where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Tags
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the CRM Tag where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCrmTagException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Tag
	 * @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	 */
	public CrmTag findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmTagException;

	/**
	 * Returns the CRM Tag where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	 */
	@Deprecated
	public CrmTag fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Returns the CRM Tag where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	 */
	public CrmTag fetchByUUID_G(String uuid, long groupId);

	/**
	 * Removes the CRM Tag where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Tag that was removed
	 */
	public CrmTag removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmTagException;

	/**
	 * Returns the number of CRM Tags where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Tags
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the CRM Tags where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Tags
	 */
	public java.util.List<CrmTag> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the CRM Tags where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @return the range of matching CRM Tags
	 */
	public java.util.List<CrmTag> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the CRM Tags where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Tags
	 */
	@Deprecated
	public java.util.List<CrmTag> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmTag> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM Tags where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Tags
	 */
	public java.util.List<CrmTag> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmTag> orderByComparator);

	/**
	 * Returns the first CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Tag
	 * @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	 */
	public CrmTag findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException;

	/**
	 * Returns the first CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	 */
	public CrmTag fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CrmTag> orderByComparator);

	/**
	 * Returns the last CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Tag
	 * @throws NoSuchCrmTagException if a matching CRM Tag could not be found
	 */
	public CrmTag findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException;

	/**
	 * Returns the last CRM Tag in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	 */
	public CrmTag fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CrmTag> orderByComparator);

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
	public CrmTag[] findByUuid_C_PrevAndNext(
			long crmTagId, String uuid, long companyId,
			OrderByComparator<CrmTag> orderByComparator)
		throws NoSuchCrmTagException;

	/**
	 * Removes all the CRM Tags where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of CRM Tags where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Tags
	 */
	public int countByUuid_C(String uuid, long companyId);

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
	 * Returns the CRM Tag with the primary key or throws a <code>NoSuchCrmTagException</code> if it could not be found.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of CRM Tags
	 */
	@Deprecated
	public java.util.List<CrmTag> findAll(
		int start, int end, OrderByComparator<CrmTag> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM Tags.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Tags
	 */
	public java.util.List<CrmTag> findAll(
		int start, int end, OrderByComparator<CrmTag> orderByComparator);

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

	/**
	 * Returns the primaryKeys of CRM Contacts associated with the CRM Tag.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @return long[] of the primaryKeys of CRM Contacts associated with the CRM Tag
	 */
	public long[] getCrmContactPrimaryKeys(long pk);

	/**
	 * Returns all the CRM Contacts associated with the CRM Tag.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @return the CRM Contacts associated with the CRM Tag
	 */
	public java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long pk);

	/**
	 * Returns a range of all the CRM Contacts associated with the CRM Tag.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @return the range of CRM Contacts associated with the CRM Tag
	 */
	public java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long pk, int start, int end);

	/**
	 * Returns an ordered range of all the CRM Contacts associated with the CRM Tag.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmTagModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param start the lower bound of the range of CRM Tags
	 * @param end the upper bound of the range of CRM Tags (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Contacts associated with the CRM Tag
	 */
	public java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long pk, int start, int end,
		OrderByComparator<contact.manager.model.CrmContact> orderByComparator);

	/**
	 * Returns the number of CRM Contacts associated with the CRM Tag.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @return the number of CRM Contacts associated with the CRM Tag
	 */
	public int getCrmContactsSize(long pk);

	/**
	 * Returns <code>true</code> if the CRM Contact is associated with the CRM Tag.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContactPK the primary key of the CRM Contact
	 * @return <code>true</code> if the CRM Contact is associated with the CRM Tag; <code>false</code> otherwise
	 */
	public boolean containsCrmContact(long pk, long crmContactPK);

	/**
	 * Returns <code>true</code> if the CRM Tag has any CRM Contacts associated with it.
	 *
	 * @param pk the primary key of the CRM Tag to check for associations with CRM Contacts
	 * @return <code>true</code> if the CRM Tag has any CRM Contacts associated with it; <code>false</code> otherwise
	 */
	public boolean containsCrmContacts(long pk);

	/**
	 * Adds an association between the CRM Tag and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContactPK the primary key of the CRM Contact
	 */
	public void addCrmContact(long pk, long crmContactPK);

	/**
	 * Adds an association between the CRM Tag and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContact the CRM Contact
	 */
	public void addCrmContact(
		long pk, contact.manager.model.CrmContact crmContact);

	/**
	 * Adds an association between the CRM Tag and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContactPKs the primary keys of the CRM Contacts
	 */
	public void addCrmContacts(long pk, long[] crmContactPKs);

	/**
	 * Adds an association between the CRM Tag and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContacts the CRM Contacts
	 */
	public void addCrmContacts(
		long pk, java.util.List<contact.manager.model.CrmContact> crmContacts);

	/**
	 * Clears all associations between the CRM Tag and its CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag to clear the associated CRM Contacts from
	 */
	public void clearCrmContacts(long pk);

	/**
	 * Removes the association between the CRM Tag and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContactPK the primary key of the CRM Contact
	 */
	public void removeCrmContact(long pk, long crmContactPK);

	/**
	 * Removes the association between the CRM Tag and the CRM Contact. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContact the CRM Contact
	 */
	public void removeCrmContact(
		long pk, contact.manager.model.CrmContact crmContact);

	/**
	 * Removes the association between the CRM Tag and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContactPKs the primary keys of the CRM Contacts
	 */
	public void removeCrmContacts(long pk, long[] crmContactPKs);

	/**
	 * Removes the association between the CRM Tag and the CRM Contacts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContacts the CRM Contacts
	 */
	public void removeCrmContacts(
		long pk, java.util.List<contact.manager.model.CrmContact> crmContacts);

	/**
	 * Sets the CRM Contacts associated with the CRM Tag, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContactPKs the primary keys of the CRM Contacts to be associated with the CRM Tag
	 */
	public void setCrmContacts(long pk, long[] crmContactPKs);

	/**
	 * Sets the CRM Contacts associated with the CRM Tag, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the CRM Tag
	 * @param crmContacts the CRM Contacts to be associated with the CRM Tag
	 */
	public void setCrmContacts(
		long pk, java.util.List<contact.manager.model.CrmContact> crmContacts);

	@Override
	public Set<String> getBadColumnNames();

}