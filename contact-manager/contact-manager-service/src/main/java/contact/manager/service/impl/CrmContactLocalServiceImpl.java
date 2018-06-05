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

import java.util.List;

import contact.manager.exception.NoSuchCrmContactException;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.model.CrmTag;
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
}