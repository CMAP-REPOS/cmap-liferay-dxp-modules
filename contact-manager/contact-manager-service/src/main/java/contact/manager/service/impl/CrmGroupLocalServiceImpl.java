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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;

import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.service.base.CrmGroupLocalServiceBaseImpl;

/**
 * The implementation of the CRM Group local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link contact.manager.service.CrmGroupLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmGroupLocalServiceBaseImpl
 * @see contact.manager.service.CrmGroupLocalServiceUtil
 */
public class CrmGroupLocalServiceImpl extends CrmGroupLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * contact.manager.service.CrmGroupLocalServiceUtil} to access the CRM Group
	 * local service.
	 */

	public List<CrmContact> getCrmContacts(long crmGroupId) {
		return crmGroupPersistence.getCrmContacts(crmGroupId);
	}

	public List<CrmContact> getCrmContacts(long crmGroupId, int start, int end) {
		return crmGroupPersistence.getCrmContacts(crmGroupId, start, end);
	}

	public List<CrmContact> getCrmContacts(long crmGroupId, int start, int end,
			OrderByComparator<CrmContact> orderByComparator) {
		return crmGroupPersistence.getCrmContacts(crmGroupId, start, end, orderByComparator);
	}

	public void setCrmContacts(long crmGroupPk, long[] crmContactPks) throws SystemException {
		crmGroupPersistence.setCrmContacts(crmGroupPk, crmContactPks);
	}

	public int getCrmContactsCount(long crmGroupId) throws SystemException {
		return crmGroupPersistence.getCrmContactsSize(crmGroupId);
	}

	public List<CrmGroup> getCrmGroupsByName(String crmGroupName) throws SystemException {
		return crmGroupPersistence.findByName(crmGroupName);
	}

	public int countAll() {
		return crmGroupPersistence.countAll();
	}

}