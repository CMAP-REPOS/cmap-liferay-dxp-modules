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

import contact.manager.model.CrmContactAuditLogChange;
import contact.manager.model.CrmOutreachLog;
import contact.manager.service.base.CrmOutreachLogLocalServiceBaseImpl;

/**
 * The implementation of the CRM Outreach Log local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link contact.manager.service.CrmOutreachLogLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmOutreachLogLocalServiceBaseImpl
 * @see contact.manager.service.CrmOutreachLogLocalServiceUtil
 */
public class CrmOutreachLogLocalServiceImpl extends CrmOutreachLogLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * contact.manager.service.CrmOutreachLogLocalServiceUtil} to access the CRM
	 * Outreach Log local service.
	 */

	public List<CrmOutreachLog> findByCrmContactId(long crmContactId) throws SystemException {
		return crmOutreachLogPersistence.findByCrmContactId(crmContactId);
	}

	public List<CrmOutreachLog> findByCrmContactId(long crmContactId, int start, int end) throws SystemException {
		return crmOutreachLogPersistence.findByCrmContactId(crmContactId, start, end);
	}

	public List<CrmOutreachLog> findByCrmContactId(long crmContactId, int start, int end,
			OrderByComparator<CrmOutreachLog> orderByComparator) throws SystemException {
		return crmOutreachLogPersistence.findByCrmContactId(crmContactId, start, end, orderByComparator);
	}

	public int countByCrmContactIdId(long crmContactId) {
		return crmOutreachLogPersistence.countByCrmContactId(crmContactId);
	}
}