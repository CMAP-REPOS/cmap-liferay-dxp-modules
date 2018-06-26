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
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.model.CrmContactAuditLog;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for CrmContactAuditLog. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogLocalServiceUtil
 * @see contact.manager.service.base.CrmContactAuditLogLocalServiceBaseImpl
 * @see contact.manager.service.impl.CrmContactAuditLogLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CrmContactAuditLogLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmContactAuditLogLocalServiceUtil} to access the CRM Contact Audit Log local service. Add custom service methods to {@link contact.manager.service.impl.CrmContactAuditLogLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
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
	* Adds the CRM Contact Audit Log to the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactAuditLog the CRM Contact Audit Log
	* @return the CRM Contact Audit Log that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CrmContactAuditLog addCrmContactAuditLog(
		CrmContactAuditLog crmContactAuditLog);

	/**
	* Creates a new CRM Contact Audit Log with the primary key. Does not add the CRM Contact Audit Log to the database.
	*
	* @param crmContactAuditLogId the primary key for the new CRM Contact Audit Log
	* @return the new CRM Contact Audit Log
	*/
	public CrmContactAuditLog createCrmContactAuditLog(
		long crmContactAuditLogId);

	/**
	* Deletes the CRM Contact Audit Log from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactAuditLog the CRM Contact Audit Log
	* @return the CRM Contact Audit Log that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public CrmContactAuditLog deleteCrmContactAuditLog(
		CrmContactAuditLog crmContactAuditLog);

	/**
	* Deletes the CRM Contact Audit Log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	* @return the CRM Contact Audit Log that was removed
	* @throws PortalException if a CRM Contact Audit Log with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public CrmContactAuditLog deleteCrmContactAuditLog(
		long crmContactAuditLogId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmContactAuditLog fetchCrmContactAuditLog(long crmContactAuditLogId);

	/**
	* Returns the CRM Contact Audit Log matching the UUID and group.
	*
	* @param uuid the CRM Contact Audit Log's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Contact Audit Log, or <code>null</code> if a matching CRM Contact Audit Log could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmContactAuditLog fetchCrmContactAuditLogByUuidAndGroupId(
		java.lang.String uuid, long groupId);

	/**
	* Returns the CRM Contact Audit Log with the primary key.
	*
	* @param crmContactAuditLogId the primary key of the CRM Contact Audit Log
	* @return the CRM Contact Audit Log
	* @throws PortalException if a CRM Contact Audit Log with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmContactAuditLog getCrmContactAuditLog(long crmContactAuditLogId)
		throws PortalException;

	/**
	* Returns the CRM Contact Audit Log matching the UUID and group.
	*
	* @param uuid the CRM Contact Audit Log's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Contact Audit Log
	* @throws PortalException if a matching CRM Contact Audit Log could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmContactAuditLog getCrmContactAuditLogByUuidAndGroupId(
		java.lang.String uuid, long groupId) throws PortalException;

	/**
	* Updates the CRM Contact Audit Log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmContactAuditLog the CRM Contact Audit Log
	* @return the CRM Contact Audit Log that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CrmContactAuditLog updateCrmContactAuditLog(
		CrmContactAuditLog crmContactAuditLog);

	public int countByCrmContactId(long crmContactId);

	/**
	* Returns the number of CRM Contact Audit Logs.
	*
	* @return the number of CRM Contact Audit Logs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCrmContactAuditLogsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<CrmContactAuditLog> findByCrmContactId(long crmContactId)
		throws SystemException;

	public List<CrmContactAuditLog> findByCrmContactId(long crmContactId,
		int start, int end) throws SystemException;

	public List<CrmContactAuditLog> findByCrmContactId(long crmContactId,
		int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator)
		throws SystemException;

	/**
	* Returns a range of all the CRM Contact Audit Logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmContactAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @return the range of CRM Contact Audit Logs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContactAuditLog> getCrmContactAuditLogs(int start, int end);

	/**
	* Returns all the CRM Contact Audit Logs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Contact Audit Logs
	* @param companyId the primary key of the company
	* @return the matching CRM Contact Audit Logs, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContactAuditLog> getCrmContactAuditLogsByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of CRM Contact Audit Logs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Contact Audit Logs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Contact Audit Logs
	* @param end the upper bound of the range of CRM Contact Audit Logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Contact Audit Logs, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContactAuditLog> getCrmContactAuditLogsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<CrmContactAuditLog> orderByComparator);

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
}