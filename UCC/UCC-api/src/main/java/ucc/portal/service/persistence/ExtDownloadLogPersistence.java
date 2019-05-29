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

import ucc.portal.exception.NoSuchExtDownloadLogException;

import ucc.portal.model.ExtDownloadLog;

import java.util.Date;

/**
 * The persistence interface for the ext download log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ucc.portal.service.persistence.impl.ExtDownloadLogPersistenceImpl
 * @see ExtDownloadLogUtil
 * @generated
 */
@ProviderType
public interface ExtDownloadLogPersistence extends BasePersistence<ExtDownloadLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExtDownloadLogUtil} to access the ext download log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ext download logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching ext download logs
	*/
	public java.util.List<ExtDownloadLog> findByUserId(long userId);

	/**
	* Returns a range of all the ext download logs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @return the range of matching ext download logs
	*/
	public java.util.List<ExtDownloadLog> findByUserId(long userId, int start,
		int end);

	/**
	* Returns an ordered range of all the ext download logs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext download logs
	*/
	public java.util.List<ExtDownloadLog> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator);

	/**
	* Returns an ordered range of all the ext download logs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext download logs
	*/
	public java.util.List<ExtDownloadLog> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ext download log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext download log
	* @throws NoSuchExtDownloadLogException if a matching ext download log could not be found
	*/
	public ExtDownloadLog findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator)
		throws NoSuchExtDownloadLogException;

	/**
	* Returns the first ext download log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext download log, or <code>null</code> if a matching ext download log could not be found
	*/
	public ExtDownloadLog fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator);

	/**
	* Returns the last ext download log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext download log
	* @throws NoSuchExtDownloadLogException if a matching ext download log could not be found
	*/
	public ExtDownloadLog findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator)
		throws NoSuchExtDownloadLogException;

	/**
	* Returns the last ext download log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext download log, or <code>null</code> if a matching ext download log could not be found
	*/
	public ExtDownloadLog fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator);

	/**
	* Returns the ext download logs before and after the current ext download log in the ordered set where userId = &#63;.
	*
	* @param extDownloadLogId the primary key of the current ext download log
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext download log
	* @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	*/
	public ExtDownloadLog[] findByUserId_PrevAndNext(long extDownloadLogId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator)
		throws NoSuchExtDownloadLogException;

	/**
	* Removes all the ext download logs where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of ext download logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching ext download logs
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the ext download logs where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @return the matching ext download logs
	*/
	public java.util.List<ExtDownloadLog> findByU_W(long userId,
		Date withdrawalDate);

	/**
	* Returns a range of all the ext download logs where userId = &#63; and withdrawalDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @return the range of matching ext download logs
	*/
	public java.util.List<ExtDownloadLog> findByU_W(long userId,
		Date withdrawalDate, int start, int end);

	/**
	* Returns an ordered range of all the ext download logs where userId = &#63; and withdrawalDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ext download logs
	*/
	public java.util.List<ExtDownloadLog> findByU_W(long userId,
		Date withdrawalDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator);

	/**
	* Returns an ordered range of all the ext download logs where userId = &#63; and withdrawalDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ext download logs
	*/
	public java.util.List<ExtDownloadLog> findByU_W(long userId,
		Date withdrawalDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext download log
	* @throws NoSuchExtDownloadLogException if a matching ext download log could not be found
	*/
	public ExtDownloadLog findByU_W_First(long userId, Date withdrawalDate,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator)
		throws NoSuchExtDownloadLogException;

	/**
	* Returns the first ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ext download log, or <code>null</code> if a matching ext download log could not be found
	*/
	public ExtDownloadLog fetchByU_W_First(long userId, Date withdrawalDate,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator);

	/**
	* Returns the last ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext download log
	* @throws NoSuchExtDownloadLogException if a matching ext download log could not be found
	*/
	public ExtDownloadLog findByU_W_Last(long userId, Date withdrawalDate,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator)
		throws NoSuchExtDownloadLogException;

	/**
	* Returns the last ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ext download log, or <code>null</code> if a matching ext download log could not be found
	*/
	public ExtDownloadLog fetchByU_W_Last(long userId, Date withdrawalDate,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator);

	/**
	* Returns the ext download logs before and after the current ext download log in the ordered set where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param extDownloadLogId the primary key of the current ext download log
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ext download log
	* @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	*/
	public ExtDownloadLog[] findByU_W_PrevAndNext(long extDownloadLogId,
		long userId, Date withdrawalDate,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator)
		throws NoSuchExtDownloadLogException;

	/**
	* Removes all the ext download logs where userId = &#63; and withdrawalDate = &#63; from the database.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	*/
	public void removeByU_W(long userId, Date withdrawalDate);

	/**
	* Returns the number of ext download logs where userId = &#63; and withdrawalDate = &#63;.
	*
	* @param userId the user ID
	* @param withdrawalDate the withdrawal date
	* @return the number of matching ext download logs
	*/
	public int countByU_W(long userId, Date withdrawalDate);

	/**
	* Caches the ext download log in the entity cache if it is enabled.
	*
	* @param extDownloadLog the ext download log
	*/
	public void cacheResult(ExtDownloadLog extDownloadLog);

	/**
	* Caches the ext download logs in the entity cache if it is enabled.
	*
	* @param extDownloadLogs the ext download logs
	*/
	public void cacheResult(java.util.List<ExtDownloadLog> extDownloadLogs);

	/**
	* Creates a new ext download log with the primary key. Does not add the ext download log to the database.
	*
	* @param extDownloadLogId the primary key for the new ext download log
	* @return the new ext download log
	*/
	public ExtDownloadLog create(long extDownloadLogId);

	/**
	* Removes the ext download log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param extDownloadLogId the primary key of the ext download log
	* @return the ext download log that was removed
	* @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	*/
	public ExtDownloadLog remove(long extDownloadLogId)
		throws NoSuchExtDownloadLogException;

	public ExtDownloadLog updateImpl(ExtDownloadLog extDownloadLog);

	/**
	* Returns the ext download log with the primary key or throws a {@link NoSuchExtDownloadLogException} if it could not be found.
	*
	* @param extDownloadLogId the primary key of the ext download log
	* @return the ext download log
	* @throws NoSuchExtDownloadLogException if a ext download log with the primary key could not be found
	*/
	public ExtDownloadLog findByPrimaryKey(long extDownloadLogId)
		throws NoSuchExtDownloadLogException;

	/**
	* Returns the ext download log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param extDownloadLogId the primary key of the ext download log
	* @return the ext download log, or <code>null</code> if a ext download log with the primary key could not be found
	*/
	public ExtDownloadLog fetchByPrimaryKey(long extDownloadLogId);

	@Override
	public java.util.Map<java.io.Serializable, ExtDownloadLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ext download logs.
	*
	* @return the ext download logs
	*/
	public java.util.List<ExtDownloadLog> findAll();

	/**
	* Returns a range of all the ext download logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @return the range of ext download logs
	*/
	public java.util.List<ExtDownloadLog> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ext download logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext download logs
	*/
	public java.util.List<ExtDownloadLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator);

	/**
	* Returns an ordered range of all the ext download logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtDownloadLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext download logs
	* @param end the upper bound of the range of ext download logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ext download logs
	*/
	public java.util.List<ExtDownloadLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExtDownloadLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ext download logs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ext download logs.
	*
	* @return the number of ext download logs
	*/
	public int countAll();
}