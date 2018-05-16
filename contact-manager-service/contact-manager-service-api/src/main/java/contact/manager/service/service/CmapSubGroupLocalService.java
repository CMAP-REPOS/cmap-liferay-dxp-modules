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

package contact.manager.service.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.service.model.CmapSubGroup;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for CmapSubGroup. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see CmapSubGroupLocalServiceUtil
 * @see contact.manager.service.service.base.CmapSubGroupLocalServiceBaseImpl
 * @see contact.manager.service.service.impl.CmapSubGroupLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CmapSubGroupLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CmapSubGroupLocalServiceUtil} to access the cmap sub group local service. Add custom service methods to {@link contact.manager.service.service.impl.CmapSubGroupLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasContactCmapSubGroup(long contactId, long subGroupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasContactCmapSubGroups(long contactId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Adds the cmap sub group to the database. Also notifies the appropriate model listeners.
	*
	* @param cmapSubGroup the cmap sub group
	* @return the cmap sub group that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CmapSubGroup addCmapSubGroup(CmapSubGroup cmapSubGroup);

	/**
	* Creates a new cmap sub group with the primary key. Does not add the cmap sub group to the database.
	*
	* @param subGroupId the primary key for the new cmap sub group
	* @return the new cmap sub group
	*/
	public CmapSubGroup createCmapSubGroup(long subGroupId);

	/**
	* Deletes the cmap sub group from the database. Also notifies the appropriate model listeners.
	*
	* @param cmapSubGroup the cmap sub group
	* @return the cmap sub group that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public CmapSubGroup deleteCmapSubGroup(CmapSubGroup cmapSubGroup);

	/**
	* Deletes the cmap sub group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subGroupId the primary key of the cmap sub group
	* @return the cmap sub group that was removed
	* @throws PortalException if a cmap sub group with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public CmapSubGroup deleteCmapSubGroup(long subGroupId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CmapSubGroup fetchCmapSubGroup(long subGroupId);

	/**
	* Returns the cmap sub group with the primary key.
	*
	* @param subGroupId the primary key of the cmap sub group
	* @return the cmap sub group
	* @throws PortalException if a cmap sub group with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CmapSubGroup getCmapSubGroup(long subGroupId)
		throws PortalException;

	/**
	* Updates the cmap sub group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cmapSubGroup the cmap sub group
	* @return the cmap sub group that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CmapSubGroup updateCmapSubGroup(CmapSubGroup cmapSubGroup);

	/**
	* Returns the number of cmap sub groups.
	*
	* @return the number of cmap sub groups
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCmapSubGroupsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getContactCmapSubGroupsCount(long contactId);

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns a range of all the cmap sub groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.service.model.impl.CmapSubGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cmap sub groups
	* @param end the upper bound of the range of cmap sub groups (not inclusive)
	* @return the range of cmap sub groups
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CmapSubGroup> getCmapSubGroups(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CmapSubGroup> getContactCmapSubGroups(long contactId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CmapSubGroup> getContactCmapSubGroups(long contactId,
		int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CmapSubGroup> getContactCmapSubGroups(long contactId,
		int start, int end, OrderByComparator<CmapSubGroup> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	/**
	* Returns the contactIds of the contacts associated with the cmap sub group.
	*
	* @param subGroupId the subGroupId of the cmap sub group
	* @return long[] the contactIds of contacts associated with the cmap sub group
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long[] getContactPrimaryKeys(long subGroupId);

	public void addContactCmapSubGroup(long contactId, CmapSubGroup cmapSubGroup);

	public void addContactCmapSubGroup(long contactId, long subGroupId);

	public void addContactCmapSubGroups(long contactId,
		List<CmapSubGroup> cmapSubGroups);

	public void addContactCmapSubGroups(long contactId, long[] subGroupIds);

	public void clearContactCmapSubGroups(long contactId);

	public void deleteContactCmapSubGroup(long contactId,
		CmapSubGroup cmapSubGroup);

	public void deleteContactCmapSubGroup(long contactId, long subGroupId);

	public void deleteContactCmapSubGroups(long contactId,
		List<CmapSubGroup> cmapSubGroups);

	public void deleteContactCmapSubGroups(long contactId, long[] subGroupIds);

	public void setContactCmapSubGroups(long contactId, long[] subGroupIds);
}