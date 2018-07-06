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
 * Provides a wrapper for {@link CrmNoteService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmNoteService
 * @generated
 */
@ProviderType
public class CrmNoteServiceWrapper implements CrmNoteService,
	ServiceWrapper<CrmNoteService> {
	public CrmNoteServiceWrapper(CrmNoteService crmNoteService) {
		_crmNoteService = crmNoteService;
	}

	@Override
	public int countByCrmContactId(long crmContactId) {
		return _crmNoteService.countByCrmContactId(crmContactId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmNoteService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmNote> findByCrmContactId(
		long crmContactId) {
		return _crmNoteService.findByCrmContactId(crmContactId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmNote> findByCrmContactId(
		long crmContactId, int start, int end) {
		return _crmNoteService.findByCrmContactId(crmContactId, start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmNote> findByCrmContactId(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmNote> orderByComparator) {
		return _crmNoteService.findByCrmContactId(crmContactId, start, end,
			orderByComparator);
	}

	@Override
	public CrmNoteService getWrappedService() {
		return _crmNoteService;
	}

	@Override
	public void setWrappedService(CrmNoteService crmNoteService) {
		_crmNoteService = crmNoteService;
	}

	private CrmNoteService _crmNoteService;
}