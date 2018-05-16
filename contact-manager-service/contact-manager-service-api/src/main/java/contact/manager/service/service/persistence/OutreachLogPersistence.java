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

import contact.manager.service.exception.NoSuchOutreachLogException;
import contact.manager.service.model.OutreachLog;

/**
 * The persistence interface for the outreach log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.service.persistence.impl.OutreachLogPersistenceImpl
 * @see OutreachLogUtil
 * @generated
 */
@ProviderType
public interface OutreachLogPersistence extends BasePersistence<OutreachLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OutreachLogUtil} to access the outreach log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the outreach log in the entity cache if it is enabled.
	*
	* @param outreachLog the outreach log
	*/
	public void cacheResult(OutreachLog outreachLog);

	/**
	* Caches the outreach logs in the entity cache if it is enabled.
	*
	* @param outreachLogs the outreach logs
	*/
	public void cacheResult(java.util.List<OutreachLog> outreachLogs);

	/**
	* Creates a new outreach log with the primary key. Does not add the outreach log to the database.
	*
	* @param id the primary key for the new outreach log
	* @return the new outreach log
	*/
	public OutreachLog create(long id);

	/**
	* Removes the outreach log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the outreach log
	* @return the outreach log that was removed
	* @throws NoSuchOutreachLogException if a outreach log with the primary key could not be found
	*/
	public OutreachLog remove(long id) throws NoSuchOutreachLogException;

	public OutreachLog updateImpl(OutreachLog outreachLog);

	/**
	* Returns the outreach log with the primary key or throws a {@link NoSuchOutreachLogException} if it could not be found.
	*
	* @param id the primary key of the outreach log
	* @return the outreach log
	* @throws NoSuchOutreachLogException if a outreach log with the primary key could not be found
	*/
	public OutreachLog findByPrimaryKey(long id)
		throws NoSuchOutreachLogException;

	/**
	* Returns the outreach log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the outreach log
	* @return the outreach log, or <code>null</code> if a outreach log with the primary key could not be found
	*/
	public OutreachLog fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, OutreachLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the outreach logs.
	*
	* @return the outreach logs
	*/
	public java.util.List<OutreachLog> findAll();

	/**
	* Returns a range of all the outreach logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of outreach logs
	* @param end the upper bound of the range of outreach logs (not inclusive)
	* @return the range of outreach logs
	*/
	public java.util.List<OutreachLog> findAll(int start, int end);

	/**
	* Returns an ordered range of all the outreach logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of outreach logs
	* @param end the upper bound of the range of outreach logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of outreach logs
	*/
	public java.util.List<OutreachLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OutreachLog> orderByComparator);

	/**
	* Returns an ordered range of all the outreach logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OutreachLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of outreach logs
	* @param end the upper bound of the range of outreach logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of outreach logs
	*/
	public java.util.List<OutreachLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OutreachLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the outreach logs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of outreach logs.
	*
	* @return the number of outreach logs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}