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

import contact.manager.model.CrmContactAuditLog;
import contact.manager.service.base.CrmContactAuditLogServiceBaseImpl;

/**
 * The implementation of the CRM Contact Audit Log remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link contact.manager.service.CrmContactAuditLogService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogServiceBaseImpl
 * @see contact.manager.service.CrmContactAuditLogServiceUtil
 */
public class CrmContactAuditLogServiceImpl
	extends CrmContactAuditLogServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link contact.manager.service.CrmContactAuditLogServiceUtil} to access the CRM Contact Audit Log remote service.
	 */

	public List<CrmContactAuditLog> findByCrmContactId(long crmContactId) throws SystemException {
		return crmContactAuditLogPersistence.findByCrmContactId(crmContactId);
	}

	public List<CrmContactAuditLog> findByCrmContactId(long crmContactId, int start, int end) throws SystemException {
		return crmContactAuditLogPersistence.findByCrmContactId(crmContactId, start, end);
	}

	public List<CrmContactAuditLog> findByCrmContactId(long crmContactId, int start, int end,
			OrderByComparator<CrmContactAuditLog> orderByComparator) throws SystemException {
		return crmContactAuditLogPersistence.findByCrmContactId(crmContactId, start, end, orderByComparator);
	}

	public int countByCrmContactId(long crmContactId) {
		return crmContactAuditLogPersistence.countByCrmContactId(crmContactId);
	}
}