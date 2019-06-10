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

package contact.manager.service.impl;

import com.liferay.portal.kernel.exception.NoSuchContactException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;

import contact.manager.exception.NoSuchCrmContactException;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.model.CrmTag;
import contact.manager.serachindexer.CrmContactIndexer;
import contact.manager.service.base.CrmContactLocalServiceBaseImpl;

/**
 * The implementation of the CRM Contact local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link contact.manager.service.CrmContactLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactLocalServiceBaseImpl
 * @see contact.manager.service.CrmContactLocalServiceUtil
 */
public class CrmContactLocalServiceImpl extends CrmContactLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * contact.manager.service.CrmContactLocalServiceUtil} to access the CRM
	 * Contact local service.
	 */

	private static Log LOGGER = LogFactoryUtil.getLog(CrmContactLocalServiceImpl.class);

	public CrmContact findByConstantContactId(long constantContactId)
			throws SystemException, NoSuchContactException, NoSuchCrmContactException {
		return crmContactPersistence.findByConstantContactId(constantContactId);
	}

	public List<CrmContact> findByPrimaryEmailAddress(String primaryEmailAddress) throws SystemException {
		return crmContactPersistence.findByPrimaryEmailAddress(primaryEmailAddress);
	}

	public List<CrmContact> findByPrimaryEmailAddressAndStatus(String primaryEmailAddress, String status)
			throws SystemException {
		return crmContactPersistence.findByPrimaryEmailAddressAndStatus(primaryEmailAddress, status);
	}

	public List<CrmContact> findByStatus(String status) throws SystemException {
		return crmContactPersistence.findByStatus(status);
	}

	public List<CrmContact> getCrmContactsByStatus(String status, int start, int end, OrderByComparator obc)
			throws SystemException {
		return crmContactPersistence.findByStatus(status, start, end, obc);
	}

	public List<CrmContact> findByVipFlag(boolean isVip) throws SystemException {
		return crmContactPersistence.findByVipFlag(isVip);
	}

	public List<CrmTag> getCrmTags(long contactId) throws SystemException {
		return crmContactPersistence.getCrmTags(contactId);
	}

	public void setCrmTags(long contactId, long[] tagIds) throws SystemException {
		crmContactPersistence.setCrmTags(contactId, tagIds);
	}

	public List<CrmGroup> getCrmGroups(long contactId) throws SystemException {
		return crmContactPersistence.getCrmGroups(contactId);
	}

	public void setCrmGroups(long contactId, long[] groupIds) throws SystemException {
		crmContactPersistence.setCrmGroups(contactId, groupIds);
	}
	
	/**
	 * Adds the CRM Contact to the database. Also notifies the appropriate model listeners.
	 *
	 * @param crmContact the CRM Contact
	 * @return the CRM Contact that was added
	 * @throws PortalException 
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CrmContact addCrmContact(CrmContact crmContact, ServiceContext serviceContext) throws PortalException {
		crmContact.setNew(true);
		long groupId = serviceContext.getScopeGroupId();
		crmContactPersistence.update(crmContact);
		resourceLocalService.addResources(crmContact.getCompanyId(), groupId, crmContact.getUserId(), CrmContact.class.getName(), crmContact.getCrmContactId(), false, true, true);
		return crmContact;
	}
	
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CrmContact updateCrmContact(CrmContact crmContact) {
		//adding this in case the indexer is not auto registred.
		Indexer indexer = IndexerRegistryUtil.getIndexer(CrmContact.class);
		if (indexer == null){
	    	CrmContactIndexer contactIndexer = new CrmContactIndexer();
	    	IndexerRegistryUtil.register(contactIndexer);
		}
		
		return crmContactPersistence.update(crmContact);
	}
	
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CrmContact updateCrmContact(CrmContact crmContact, ServiceContext serviceContext) throws PortalException {
		//adding this in case the indexer is not auto registred.
		Indexer indexer = IndexerRegistryUtil.getIndexer(CrmContact.class);
		if (indexer == null){
	    	CrmContactIndexer contactIndexer = new CrmContactIndexer();
	    	IndexerRegistryUtil.register(contactIndexer);
		}
		
		
		resourceLocalService.updateResources(serviceContext.getCompanyId(),
                serviceContext.getScopeGroupId(), 
                CrmContact.class.getName(), crmContact.getCrmContactId(),
                serviceContext.getGroupPermissions(),
                serviceContext.getGuestPermissions());
		
		
		return crmContactPersistence.update(crmContact);
	}
	
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CrmContact deleteCrmContact(long crmContactId, ServiceContext serviceContext) throws PortalException {
		
		resourceLocalService.deleteResource(serviceContext.getCompanyId(),
				CrmContact.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
				crmContactId);
		
		return crmContactPersistence.remove(crmContactId);
	}
	
	@Override
	public void initCrmContactResourcePermissions(ServiceContext serviceContext) throws PortalException {
		System.out.println("papasss");
		long groupId = serviceContext.getScopeGroupId();
		System.out.println("spasss");
		List<CrmContact> crmContacts = crmContactLocalService.getCrmContacts(com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS, com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS);
		System.out.println("mocosss");
		for(CrmContact crmContact : crmContacts) {
			System.out.println("mocosdsd  1");
			resourceLocalService.addResources(crmContact.getCompanyId(), groupId, crmContact.getUserId(), CrmContact.class.getName(), crmContact.getCrmContactId(), false, true, true);
			System.out.println("mocosss  2");
		}
		System.out.println("mocosss   3");
	}

	@Override
	public void initCrmContactResourcePermissions(long companyId) throws PortalException {
		// TODO Auto-generated method stub
		
	}
	
	
}