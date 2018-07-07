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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;

import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.service.base.CrmGroupServiceBaseImpl;

/**
 * The implementation of the CRM Group remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link contact.manager.service.CrmGroupService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmGroupServiceBaseImpl
 * @see contact.manager.service.CrmGroupServiceUtil
 */
public class CrmGroupServiceImpl extends CrmGroupServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * contact.manager.service.CrmGroupServiceUtil} to access the CRM Group
	 * remote service.
	 */

	public CrmGroup getCrmGroup(long crmGroupId) throws PortalException {
		return crmGroupLocalService.getCrmGroup(crmGroupId);
	}

	public CrmGroup deleteCrmGroup(CrmGroup crmGroup, ServiceContext serviceContext) throws PortalException {
		return crmGroupLocalService.deleteCrmGroup(crmGroup);
	}

	public CrmGroup deleteCrmGroup(long crmGroupId, ServiceContext serviceContext) throws PortalException {
		CrmGroup crmGroup = crmGroupLocalService.getCrmGroup(crmGroupId);
		return crmGroupLocalService.deleteCrmGroup(crmGroup);
	}

	public CrmGroup addCrmGroup(CrmGroup crmGroup) throws PortalException {
		return crmGroupLocalService.addCrmGroup(crmGroup);
	}

	public CrmGroup updateCrmGroup(CrmGroup crmGroup) throws PortalException {
		return crmGroupLocalService.updateCrmGroup(crmGroup);
	}

	public void setCrmGroupCrmContacts(long crmGroupId, long[] crmContactIds) {
		crmContactLocalService.setCrmGroupCrmContacts(crmGroupId, crmContactIds);
	}

	public List<CrmGroup> findAll() {
		return crmGroupPersistence.findAll();
	}

	public List<CrmGroup> findAll(int start, int end) {
		return crmGroupPersistence.findAll(start, end);
	}

	public List<CrmGroup> findAll(int start, int end, OrderByComparator<CrmGroup> orderByComparator) {
		return crmGroupPersistence.findAll(start, end, orderByComparator);
	}

	public int countAll() {
		return crmGroupPersistence.countAll();
	}

	public List<CrmContact> getCrmContacts(long crmGroupId) {
		return crmGroupPersistence.getCrmContacts(crmGroupId);
	}

	public int getCrmContactsSize(long crmGroupId) {
		return crmGroupPersistence.getCrmContactsSize(crmGroupId);
	}
}