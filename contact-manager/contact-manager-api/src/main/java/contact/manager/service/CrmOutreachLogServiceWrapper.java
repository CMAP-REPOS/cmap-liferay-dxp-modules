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
 * Provides a wrapper for {@link CrmOutreachLogService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmOutreachLogService
 * @generated
 */
@ProviderType
public class CrmOutreachLogServiceWrapper implements CrmOutreachLogService,
	ServiceWrapper<CrmOutreachLogService> {
	public CrmOutreachLogServiceWrapper(
		CrmOutreachLogService crmOutreachLogService) {
		_crmOutreachLogService = crmOutreachLogService;
	}

	@Override
	public int countByCrmContactIdId(long crmContactId) {
		return _crmOutreachLogService.countByCrmContactIdId(crmContactId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmOutreachLogService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmOutreachLog> findByCrmContactId(
		long crmContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmOutreachLogService.findByCrmContactId(crmContactId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmOutreachLog> findByCrmContactId(
		long crmContactId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmOutreachLogService.findByCrmContactId(crmContactId, start,
			end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmOutreachLog> findByCrmContactId(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmOutreachLog> orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmOutreachLogService.findByCrmContactId(crmContactId, start,
			end, orderByComparator);
	}

	@Override
	public CrmOutreachLogService getWrappedService() {
		return _crmOutreachLogService;
	}

	@Override
	public void setWrappedService(CrmOutreachLogService crmOutreachLogService) {
		_crmOutreachLogService = crmOutreachLogService;
	}

	private CrmOutreachLogService _crmOutreachLogService;
}