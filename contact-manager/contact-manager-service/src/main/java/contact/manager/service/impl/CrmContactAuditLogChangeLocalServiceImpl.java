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
import contact.manager.model.CrmContactAuditLogChange;
import contact.manager.service.base.CrmContactAuditLogChangeLocalServiceBaseImpl;

/**
 * The implementation of the CRM Contact Audit Log Change local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link contact.manager.service.CrmContactAuditLogChangeLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogChangeLocalServiceBaseImpl
 * @see contact.manager.service.CrmContactAuditLogChangeLocalServiceUtil
 */
public class CrmContactAuditLogChangeLocalServiceImpl extends CrmContactAuditLogChangeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * contact.manager.service.CrmContactAuditLogChangeLocalServiceUtil} to
	 * access the CRM Contact Audit Log Change local service.
	 */

	public List<CrmContactAuditLogChange> findByCrmContactAuditLogId(long crmContactAuditLogId) {
		return crmContactAuditLogChangePersistence.findByCrmContactAuditLogId(crmContactAuditLogId);
	}

	public List<CrmContactAuditLogChange> findByCrmContactAuditLogId(long crmContactAuditLogId, int start, int end) throws SystemException {
		return crmContactAuditLogChangePersistence.findByCrmContactAuditLogId(crmContactAuditLogId, start, end);
	}

	public List<CrmContactAuditLogChange> findByCrmContactAuditLogId(long crmContactAuditLogId, int start, int end,
			OrderByComparator<CrmContactAuditLogChange> orderByComparator) throws SystemException {
		return crmContactAuditLogChangePersistence.findByCrmContactAuditLogId(crmContactAuditLogId, start, end, orderByComparator);
	}

	public int countByCrmContactAuditLogId(long crmContactAuditLogId) {
		return crmContactAuditLogChangePersistence.countByCrmContactAuditLogId(crmContactAuditLogId);
	}
}