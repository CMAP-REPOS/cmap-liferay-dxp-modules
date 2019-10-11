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

import contact.manager.model.CrmTag;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for CrmTag. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see CrmTagLocalServiceUtil
 * @see contact.manager.service.base.CrmTagLocalServiceBaseImpl
 * @see contact.manager.service.impl.CrmTagLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CrmTagLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmTagLocalServiceUtil} to access the CRM Tag local service. Add custom service methods to {@link contact.manager.service.impl.CrmTagLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public void addCrmContactCrmTag(long crmContactId, CrmTag crmTag);

	public void addCrmContactCrmTag(long crmContactId, long crmTagId);

	public void addCrmContactCrmTags(long crmContactId, List<CrmTag> crmTags);

	public void addCrmContactCrmTags(long crmContactId, long[] crmTagIds);

	/**
	* Adds the CRM Tag to the database. Also notifies the appropriate model listeners.
	*
	* @param crmTag the CRM Tag
	* @return the CRM Tag that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CrmTag addCrmTag(CrmTag crmTag);

	public void clearCrmContactCrmTags(long crmContactId);

	/**
	* Creates a new CRM Tag with the primary key. Does not add the CRM Tag to the database.
	*
	* @param crmTagId the primary key for the new CRM Tag
	* @return the new CRM Tag
	*/
	@Transactional(enabled = false)
	public CrmTag createCrmTag(long crmTagId);

	public void deleteCrmContactCrmTag(long crmContactId, CrmTag crmTag);

	public void deleteCrmContactCrmTag(long crmContactId, long crmTagId);

	public void deleteCrmContactCrmTags(long crmContactId, List<CrmTag> crmTags);

	public void deleteCrmContactCrmTags(long crmContactId, long[] crmTagIds);

	/**
	* Deletes the CRM Tag from the database. Also notifies the appropriate model listeners.
	*
	* @param crmTag the CRM Tag
	* @return the CRM Tag that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public CrmTag deleteCrmTag(CrmTag crmTag);

	/**
	* Deletes the CRM Tag with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmTagId the primary key of the CRM Tag
	* @return the CRM Tag that was removed
	* @throws PortalException if a CRM Tag with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public CrmTag deleteCrmTag(long crmTagId) throws PortalException;

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public CrmTag fetchCrmTag(long crmTagId);

	/**
	* Returns the CRM Tag matching the UUID and group.
	*
	* @param uuid the CRM Tag's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Tag, or <code>null</code> if a matching CRM Tag could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmTag fetchCrmTagByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmTag> getCrmContactCrmTags(long crmContactId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmTag> getCrmContactCrmTags(long crmContactId, int start,
		int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmTag> getCrmContactCrmTags(long crmContactId, int start,
		int end, OrderByComparator<CrmTag> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCrmContactCrmTagsCount(long crmContactId);

	/**
	* Returns the crmContactIds of the CRM Contacts associated with the CRM Tag.
	*
	* @param crmTagId the crmTagId of the CRM Tag
	* @return long[] the crmContactIds of CRM Contacts associated with the CRM Tag
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long[] getCrmContactPrimaryKeys(long crmTagId);

	/**
	* Returns the CRM Tag with the primary key.
	*
	* @param crmTagId the primary key of the CRM Tag
	* @return the CRM Tag
	* @throws PortalException if a CRM Tag with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmTag getCrmTag(long crmTagId) throws PortalException;

	/**
	* Returns the CRM Tag matching the UUID and group.
	*
	* @param uuid the CRM Tag's UUID
	* @param groupId the primary key of the group
	* @return the matching CRM Tag
	* @throws PortalException if a matching CRM Tag could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmTag getCrmTagByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	* Returns a range of all the CRM Tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contact.manager.model.impl.CrmTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @return the range of CRM Tags
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmTag> getCrmTags(int start, int end);

	/**
	* Returns all the CRM Tags matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Tags
	* @param companyId the primary key of the company
	* @return the matching CRM Tags, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmTag> getCrmTagsByUuidAndCompanyId(String uuid, long companyId);

	/**
	* Returns a range of CRM Tags matching the UUID and company.
	*
	* @param uuid the UUID of the CRM Tags
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of CRM Tags
	* @param end the upper bound of the range of CRM Tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching CRM Tags, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmTag> getCrmTagsByUuidAndCompanyId(String uuid,
		long companyId, int start, int end,
		OrderByComparator<CrmTag> orderByComparator);

	/**
	* Returns the number of CRM Tags.
	*
	* @return the number of CRM Tags
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCrmTagsCount();

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

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCrmContactCrmTag(long crmContactId, long crmTagId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCrmContactCrmTags(long crmContactId);

	public void setCrmContactCrmTags(long crmContactId, long[] crmTagIds);

	/**
	* Updates the CRM Tag in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crmTag the CRM Tag
	* @return the CRM Tag that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CrmTag updateCrmTag(CrmTag crmTag);
}