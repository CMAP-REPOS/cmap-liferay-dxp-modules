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
 * Provides a wrapper for {@link CrmContactAuditLogChangeService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogChangeService
 * @generated
 */
@ProviderType
public class CrmContactAuditLogChangeServiceWrapper
	implements CrmContactAuditLogChangeService,
		ServiceWrapper<CrmContactAuditLogChangeService> {
	public CrmContactAuditLogChangeServiceWrapper(
		CrmContactAuditLogChangeService crmContactAuditLogChangeService) {
		_crmContactAuditLogChangeService = crmContactAuditLogChangeService;
	}

	@Override
	public int countByCrmContactAuditLogId(long crmContactAuditLogId) {
		return _crmContactAuditLogChangeService.countByCrmContactAuditLogId(crmContactAuditLogId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmContactAuditLogChangeService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId) {
		return _crmContactAuditLogChangeService.findByCrmContactAuditLogId(crmContactAuditLogId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactAuditLogChangeService.findByCrmContactAuditLogId(crmContactAuditLogId,
			start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContactAuditLogChange> orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactAuditLogChangeService.findByCrmContactAuditLogId(crmContactAuditLogId,
			start, end, orderByComparator);
	}

	@Override
	public CrmContactAuditLogChangeService getWrappedService() {
		return _crmContactAuditLogChangeService;
	}

	@Override
	public void setWrappedService(
		CrmContactAuditLogChangeService crmContactAuditLogChangeService) {
		_crmContactAuditLogChangeService = crmContactAuditLogChangeService;
	}

	private CrmContactAuditLogChangeService _crmContactAuditLogChangeService;
}