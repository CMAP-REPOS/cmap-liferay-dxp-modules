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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import contact.constantcontact.model.ContactApiModel;
import contact.constantcontact.model.EmailAddress;
import contact.constantcontact.service.impl.ConstantContactServiceImpl;
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
	
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CrmContact updateCrmContact(CrmContact crmContact) {
		//adding this in case the indexer is not auto registred.
		Indexer indexer = IndexerRegistryUtil.getIndexer(CrmContact.class);
		if (indexer == null){
	    	CrmContactIndexer contactIndexer = new CrmContactIndexer();
	    	IndexerRegistryUtil.register(contactIndexer);
		}
		//Code to update ConstantContact in case of any update in Fname, Lname, primaryEmail, organization;
		try {
			if (crmContact.getConstantContactId()!= 0) {
					ConstantContactServiceImpl constantContactServiceImpl = new ConstantContactServiceImpl();
					ContactApiModel model = constantContactServiceImpl.getContact(new Long(crmContact.getConstantContactId()).toString());
					boolean update = false;
					if (model.getFirstName() == null || !crmContact.getFirstName().equals(model.getFirstName())){
						update = true;
						model.setFirstName(crmContact.getFirstName());
					}
					
					if (model.getLastName() == null || !crmContact.getLastName().equals(model.getLastName())){
						update = true;
						model.setLastName(crmContact.getLastName());
					}
					
					if (crmContact.getOrganization() != null && !crmContact.getOrganization().equals(model.getCompanyName())){
						update = true;
						model.setCompanyName(crmContact.getOrganization());
					} else if (crmContact.getOrganization() == null && model.getCompanyName()!=null) {
						update = true;
						model.setCompanyName(crmContact.getOrganization());
					}
					
					if (!isEmailInEmailAddressList(model.getEmailAddresses(), crmContact.getPrimaryEmailAddress())){
						update = true;
						addEmailToEmailAddressList(model, crmContact.getPrimaryEmailAddress());
					}
					
					if (update){
						constantContactServiceImpl.updateContact(model);
					}
			} else { 
				
				addContactToConstactContacts(crmContact);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return crmContactPersistence.update(crmContact);
	}
	
	private boolean isEmailInEmailAddressList(List<EmailAddress> emailAddresses, String emailAdrress){
		if (emailAddresses != null){
			for (EmailAddress emailAddressObj : emailAddresses) {
				if (emailAddressObj != null && emailAdrress.equals(emailAddressObj.getEmailAddress())) {
					return true;
				}
			}			
		}
		return false;
	}
	
	//rules on ConstactContact specify one email address allowed
	private void addEmailToEmailAddressList(ContactApiModel model, String emailAdrress){
		model.setEmailAddresses(new ArrayList<EmailAddress>());
		EmailAddress email = new EmailAddress();
		email.setEmailAddress(emailAdrress);
		model.getEmailAddresses().add(email);
	}
	
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CrmContact addCrmContact(CrmContact crmContact) {
		crmContact.setNew(true);
		addContactToConstactContacts(crmContact);
		return crmContactPersistence.update(crmContact);
	}
	
	private void addContactToConstactContacts(CrmContact crmContact){
		ConstantContactServiceImpl constantContactServiceImpl = new ConstantContactServiceImpl();
		String id = constantContactServiceImpl.addContact("", crmContact.getFirstName(), crmContact.getLastName(), crmContact.getOrganization(), crmContact.getPrimaryEmailAddress());
		crmContact.setConstantContactId(new Long(id));
	}
}