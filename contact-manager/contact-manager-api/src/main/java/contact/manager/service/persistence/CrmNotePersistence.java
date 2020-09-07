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

import contact.manager.exception.NoSuchCrmNoteException;
import contact.manager.model.CrmNote;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the CRM Note service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmNoteUtil
 * @generated
 */
@ProviderType
public interface CrmNotePersistence extends BasePersistence<CrmNote> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmNoteUtil} to access the CRM Note persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, CrmNote> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the CRM Notes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching CRM Notes
	 */
	public java.util.List<CrmNote> findByUuid(String uuid);

	/**
	 * Returns a range of all the CRM Notes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmNoteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @return the range of matching CRM Notes
	 */
	public java.util.List<CrmNote> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the CRM Notes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmNoteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Notes
	 */
	@Deprecated
	public java.util.List<CrmNote> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmNote> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM Notes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmNoteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Notes
	 */
	public java.util.List<CrmNote> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CrmNote> orderByComparator);

	/**
	 * Returns the first CRM Note in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	public CrmNote findByUuid_First(
			String uuid, OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException;

	/**
	 * Returns the first CRM Note in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	public CrmNote fetchByUuid_First(
		String uuid, OrderByComparator<CrmNote> orderByComparator);

	/**
	 * Returns the last CRM Note in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	public CrmNote findByUuid_Last(
			String uuid, OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException;

	/**
	 * Returns the last CRM Note in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	public CrmNote fetchByUuid_Last(
		String uuid, OrderByComparator<CrmNote> orderByComparator);

	/**
	 * Returns the CRM Notes before and after the current CRM Note in the ordered set where uuid = &#63;.
	 *
	 * @param crmNoteId the primary key of the current CRM Note
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Note
	 * @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	 */
	public CrmNote[] findByUuid_PrevAndNext(
			long crmNoteId, String uuid,
			OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException;

	/**
	 * Removes all the CRM Notes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of CRM Notes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching CRM Notes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the CRM Note where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCrmNoteException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	public CrmNote findByUUID_G(String uuid, long groupId)
		throws NoSuchCrmNoteException;

	/**
	 * Returns the CRM Note where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	@Deprecated
	public CrmNote fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Returns the CRM Note where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	public CrmNote fetchByUUID_G(String uuid, long groupId);

	/**
	 * Removes the CRM Note where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the CRM Note that was removed
	 */
	public CrmNote removeByUUID_G(String uuid, long groupId)
		throws NoSuchCrmNoteException;

	/**
	 * Returns the number of CRM Notes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching CRM Notes
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the CRM Notes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching CRM Notes
	 */
	public java.util.List<CrmNote> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the CRM Notes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmNoteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @return the range of matching CRM Notes
	 */
	public java.util.List<CrmNote> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the CRM Notes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmNoteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Notes
	 */
	@Deprecated
	public java.util.List<CrmNote> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmNote> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM Notes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmNoteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Notes
	 */
	public java.util.List<CrmNote> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CrmNote> orderByComparator);

	/**
	 * Returns the first CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	public CrmNote findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException;

	/**
	 * Returns the first CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	public CrmNote fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CrmNote> orderByComparator);

	/**
	 * Returns the last CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	public CrmNote findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException;

	/**
	 * Returns the last CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	public CrmNote fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CrmNote> orderByComparator);

	/**
	 * Returns the CRM Notes before and after the current CRM Note in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param crmNoteId the primary key of the current CRM Note
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Note
	 * @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	 */
	public CrmNote[] findByUuid_C_PrevAndNext(
			long crmNoteId, String uuid, long companyId,
			OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException;

	/**
	 * Removes all the CRM Notes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of CRM Notes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching CRM Notes
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the CRM Notes where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @return the matching CRM Notes
	 */
	public java.util.List<CrmNote> findByCrmContactId(long crmContactId);

	/**
	 * Returns a range of all the CRM Notes where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmNoteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @return the range of matching CRM Notes
	 */
	public java.util.List<CrmNote> findByCrmContactId(
		long crmContactId, int start, int end);

	/**
	 * Returns an ordered range of all the CRM Notes where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmNoteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByCrmContactId(long, int, int, OrderByComparator)}
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching CRM Notes
	 */
	@Deprecated
	public java.util.List<CrmNote> findByCrmContactId(
		long crmContactId, int start, int end,
		OrderByComparator<CrmNote> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM Notes where crmContactId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmNoteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crmContactId the crm contact ID
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching CRM Notes
	 */
	public java.util.List<CrmNote> findByCrmContactId(
		long crmContactId, int start, int end,
		OrderByComparator<CrmNote> orderByComparator);

	/**
	 * Returns the first CRM Note in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	public CrmNote findByCrmContactId_First(
			long crmContactId, OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException;

	/**
	 * Returns the first CRM Note in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	public CrmNote fetchByCrmContactId_First(
		long crmContactId, OrderByComparator<CrmNote> orderByComparator);

	/**
	 * Returns the last CRM Note in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Note
	 * @throws NoSuchCrmNoteException if a matching CRM Note could not be found
	 */
	public CrmNote findByCrmContactId_Last(
			long crmContactId, OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException;

	/**
	 * Returns the last CRM Note in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching CRM Note, or <code>null</code> if a matching CRM Note could not be found
	 */
	public CrmNote fetchByCrmContactId_Last(
		long crmContactId, OrderByComparator<CrmNote> orderByComparator);

	/**
	 * Returns the CRM Notes before and after the current CRM Note in the ordered set where crmContactId = &#63;.
	 *
	 * @param crmNoteId the primary key of the current CRM Note
	 * @param crmContactId the crm contact ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next CRM Note
	 * @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	 */
	public CrmNote[] findByCrmContactId_PrevAndNext(
			long crmNoteId, long crmContactId,
			OrderByComparator<CrmNote> orderByComparator)
		throws NoSuchCrmNoteException;

	/**
	 * Removes all the CRM Notes where crmContactId = &#63; from the database.
	 *
	 * @param crmContactId the crm contact ID
	 */
	public void removeByCrmContactId(long crmContactId);

	/**
	 * Returns the number of CRM Notes where crmContactId = &#63;.
	 *
	 * @param crmContactId the crm contact ID
	 * @return the number of matching CRM Notes
	 */
	public int countByCrmContactId(long crmContactId);

	/**
	 * Caches the CRM Note in the entity cache if it is enabled.
	 *
	 * @param crmNote the CRM Note
	 */
	public void cacheResult(CrmNote crmNote);

	/**
	 * Caches the CRM Notes in the entity cache if it is enabled.
	 *
	 * @param crmNotes the CRM Notes
	 */
	public void cacheResult(java.util.List<CrmNote> crmNotes);

	/**
	 * Creates a new CRM Note with the primary key. Does not add the CRM Note to the database.
	 *
	 * @param crmNoteId the primary key for the new CRM Note
	 * @return the new CRM Note
	 */
	public CrmNote create(long crmNoteId);

	/**
	 * Removes the CRM Note with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmNoteId the primary key of the CRM Note
	 * @return the CRM Note that was removed
	 * @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	 */
	public CrmNote remove(long crmNoteId) throws NoSuchCrmNoteException;

	public CrmNote updateImpl(CrmNote crmNote);

	/**
	 * Returns the CRM Note with the primary key or throws a <code>NoSuchCrmNoteException</code> if it could not be found.
	 *
	 * @param crmNoteId the primary key of the CRM Note
	 * @return the CRM Note
	 * @throws NoSuchCrmNoteException if a CRM Note with the primary key could not be found
	 */
	public CrmNote findByPrimaryKey(long crmNoteId)
		throws NoSuchCrmNoteException;

	/**
	 * Returns the CRM Note with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crmNoteId the primary key of the CRM Note
	 * @return the CRM Note, or <code>null</code> if a CRM Note with the primary key could not be found
	 */
	public CrmNote fetchByPrimaryKey(long crmNoteId);

	/**
	 * Returns all the CRM Notes.
	 *
	 * @return the CRM Notes
	 */
	public java.util.List<CrmNote> findAll();

	/**
	 * Returns a range of all the CRM Notes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmNoteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @return the range of CRM Notes
	 */
	public java.util.List<CrmNote> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the CRM Notes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmNoteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of CRM Notes
	 */
	@Deprecated
	public java.util.List<CrmNote> findAll(
		int start, int end, OrderByComparator<CrmNote> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the CRM Notes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CrmNoteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of CRM Notes
	 * @param end the upper bound of the range of CRM Notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of CRM Notes
	 */
	public java.util.List<CrmNote> findAll(
		int start, int end, OrderByComparator<CrmNote> orderByComparator);

	/**
	 * Removes all the CRM Notes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of CRM Notes.
	 *
	 * @return the number of CRM Notes
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}