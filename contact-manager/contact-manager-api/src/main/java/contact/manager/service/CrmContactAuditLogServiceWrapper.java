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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CrmContactAuditLogService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogService
 * @generated
 */
@ProviderType
public class CrmContactAuditLogServiceWrapper
	implements CrmContactAuditLogService,
		ServiceWrapper<CrmContactAuditLogService> {
	public CrmContactAuditLogServiceWrapper(
		CrmContactAuditLogService crmContactAuditLogService) {
		_crmContactAuditLogService = crmContactAuditLogService;
	}

	@Override
	public int countByCrmContactId(long crmContactId) {
		return _crmContactAuditLogService.countByCrmContactId(crmContactId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmContactAuditLogService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmContactAuditLog> findByCrmContactId(
		long crmContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactAuditLogService.findByCrmContactId(crmContactId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContactAuditLog> findByCrmContactId(
		long crmContactId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactAuditLogService.findByCrmContactId(crmContactId,
			start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContactAuditLog> findByCrmContactId(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContactAuditLog> orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactAuditLogService.findByCrmContactId(crmContactId,
			start, end, orderByComparator);
	}

	@Override
	public CrmContactAuditLogService getWrappedService() {
		return _crmContactAuditLogService;
	}

	@Override
	public void setWrappedService(
		CrmContactAuditLogService crmContactAuditLogService) {
		_crmContactAuditLogService = crmContactAuditLogService;
	}

	private CrmContactAuditLogService _crmContactAuditLogService;
}