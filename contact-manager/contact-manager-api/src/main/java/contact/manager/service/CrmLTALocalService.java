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

import contact.manager.model.CrmLTA;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for CrmLTA. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmLTALocalServiceUtil
 * @see contact.manager.service.base.CrmLTALocalServiceBaseImpl
 * @see contact.manager.service.impl.CrmLTALocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CrmLTALocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmLTALocalServiceUtil} to access the CRM LTA local service. Add custom service methods to {@link contact.manager.service.impl.CrmLTALocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the CRM LTA to the database. Also notifies the appropriate model listeners.
	*
	* @param crmLTA the CRM LTA
	* @return the CRM LTA that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CrmLTA addCrmLTA(CrmLTA crmLTA);

	/**
	* Creates a new CRM LTA with the primary key. Does not add the CRM LTA to the database.
	*
	* @param crmLTAId the primary key for the new CRM LTA
	* @return the new CRM LTA
	*/
	@Transactional(enabled = false)
	public CrmLTA createCrmLTA(long crmLTAId);

	/**
	* Deletes the CRM LTA from the database. Also notifies the appropriate model listeners.
	*
	* @param crmLTA the CRM LTA
	* @return the CRM LTA that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public CrmLTA deleteCrmLTA(CrmLTA crmLTA);

	/**
	* Deletes the CRM LTA with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmLTAId the primary key of the CRM LTA
	* @return the CRM LTA that was removed
	* @throws PortalException if a CRM LTA with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public CrmLTA deleteCrmLTA(long crmLTAId) throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	public DynamicQuery dynamicQuery();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmLTA fetchCrmLTA(long crmLTAId);

	/**
	* Returns the CRM LTA matching the UUID and group.
	*
	* @param uuid the CRM LTA's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM LTA, or <code>null</code> if a matching CRM LTA could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmLTA fetchCrmLTAByUuidAndGroupId(String uuid, long groupId);

	public List<CrmLTA> findByZipCode(String zipCode);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	* Returns the CRM LTA with the primary key.
	*
	* @param crmLTAId the primary key of the CRM LTA
	* @return the CRM LTA
	* @throws PortalException if a CRM LTA with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmLTA getCrmLTA(long crmLTAId) throws PortalException;

	/**
	* Returns the CRM LTA matching the UUID and group.
	*
	* @param uuid the CRM LTA's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM LTA
	* @throws PortalException if a matching CRM LTA could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmLTA getCrmLTAByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	* Returns a range of all the CRM LTAs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmLTAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @return the range of CRM LTAs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmLTA> getCrmLTAs(int start, int end);

	/**
	* Returns all the CRM LTAs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM LTAs
	* @param companyId the primary key of the company
	* @return the matching CRM LTAs, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmLTA> getCrmLTAsByUuidAndCompanyId(String uuid, long companyId);

	/**
	* Returns a range of CRM LTAs matching the UUID and company.
	*
	* @param uuid the UUID of the CRM LTAs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM LTAs
	* @param end the upper bound of the range of CRM LTAs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM LTAs, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmLTA> getCrmLTAsByUuidAndCompanyId(String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmLTA> orderByComparator);

	/**
	* Returns the number of CRM LTAs.
	*
	* @return the number of CRM LTAs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCrmLTAsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Updates the CRM LTA in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmLTA the CRM LTA
	* @return the CRM LTA that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CrmLTA updateCrmLTA(CrmLTA crmLTA);
}