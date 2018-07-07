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

package contact.manager.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.model.CrmGroup;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for CrmGroup. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmGroupLocalServiceUtil
 * @see contact.manager.service.base.CrmGroupLocalServiceBaseImpl
 * @see contact.manager.service.impl.CrmGroupLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CrmGroupLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmGroupLocalServiceUtil} to access the CRM Group local service. Add custom service methods to {@link contact.manager.service.impl.CrmGroupLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCrmContactCrmGroup(long crmContactId, long crmGroupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCrmContactCrmGroups(long crmContactId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

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
	* Adds the CRM Group to the database. Also notifies the appropriate model listeners.
	*
	* @param crmGroup the CRM Group
	* @return the CRM Group that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CrmGroup addCrmGroup(CrmGroup crmGroup);

	public CrmGroup addCrmGroup(CrmGroup crmGroup, ServiceContext serviceContext)
		throws PortalException;

	/**
	* Creates a new CRM Group with the primary key. Does not add the CRM Group to the database.
	*
	* @param crmGroupId the primary key for the new CRM Group
	* @return the new CRM Group
	*/
	public CrmGroup createCrmGroup(long crmGroupId);

	/**
	* Deletes the CRM Group from the database. Also notifies the appropriate model listeners.
	*
	* @param crmGroup the CRM Group
	* @return the CRM Group that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public CrmGroup deleteCrmGroup(CrmGroup crmGroup);

	public CrmGroup deleteCrmGroup(CrmGroup crmGroup,
		ServiceContext serviceContext);

	/**
	* Deletes the CRM Group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmGroupId the primary key of the CRM Group
	* @return the CRM Group that was removed
	* @throws PortalException if a CRM Group with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public CrmGroup deleteCrmGroup(long crmGroupId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmGroup fetchCrmGroup(long crmGroupId);

	/**
	* Returns the CRM Group matching the UUID and group.
	*
	* @param uuid the CRM Group's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Group, or <code>null</code> if a matching CRM Group could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmGroup fetchCrmGroupByUuidAndGroupId(java.lang.String uuid,
		long groupId);

	/**
	* Returns the CRM Group with the primary key.
	*
	* @param crmGroupId the primary key of the CRM Group
	* @return the CRM Group
	* @throws PortalException if a CRM Group with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmGroup getCrmGroup(long crmGroupId) throws PortalException;

	/**
	* Returns the CRM Group matching the UUID and group.
	*
	* @param uuid the CRM Group's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Group
	* @throws PortalException if a matching CRM Group could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmGroup getCrmGroupByUuidAndGroupId(java.lang.String uuid,
		long groupId) throws PortalException;

	/**
	* Updates the CRM Group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmGroup the CRM Group
	* @return the CRM Group that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CrmGroup updateCrmGroup(CrmGroup crmGroup);

	public CrmGroup updateCrmGroup(CrmGroup crmGroup,
		ServiceContext serviceContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCrmContactCrmGroupsCount(long crmContactId);

	/**
	* Returns the number of CRM Groups.
	*
	* @return the number of CRM Groups
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCrmGroupsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmGroup> getCrmContactCrmGroups(long crmContactId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmGroup> getCrmContactCrmGroups(long crmContactId, int start,
		int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmGroup> getCrmContactCrmGroups(long crmContactId, int start,
		int end, OrderByComparator<CrmGroup> orderByComparator);

	/**
	* Returns a range of all the CRM Groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @return the range of CRM Groups
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmGroup> getCrmGroups(int start, int end);

	/**
	* Returns all the CRM Groups matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Groups
	* @param companyId the primary key of the company
	* @return the matching CRM Groups, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmGroup> getCrmGroupsByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of CRM Groups matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Groups
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Groups
	* @param end the upper bound of the range of CRM Groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Groups, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmGroup> getCrmGroupsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<CrmGroup> orderByComparator);

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
	* Returns the crmContactIds of the CRM Contacts associated with the CRM Group.
	*
	* @param crmGroupId the crmGroupId of the CRM Group
	* @return long[] the crmContactIds of CRM Contacts associated with the CRM Group
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long[] getCrmContactPrimaryKeys(long crmGroupId);

	public void addCrmContactCrmGroup(long crmContactId, CrmGroup crmGroup);

	public void addCrmContactCrmGroup(long crmContactId, long crmGroupId);

	public void addCrmContactCrmGroups(long crmContactId,
		List<CrmGroup> crmGroups);

	public void addCrmContactCrmGroups(long crmContactId, long[] crmGroupIds);

	public void clearCrmContactCrmGroups(long crmContactId);

	public void deleteCrmContactCrmGroup(long crmContactId, CrmGroup crmGroup);

	public void deleteCrmContactCrmGroup(long crmContactId, long crmGroupId);

	public void deleteCrmContactCrmGroups(long crmContactId,
		List<CrmGroup> crmGroups);

	public void deleteCrmContactCrmGroups(long crmContactId, long[] crmGroupIds);

	public void setCrmContactCrmGroups(long crmContactId, long[] crmGroupIds);
}