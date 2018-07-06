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
 * Provides a wrapper for {@link CrmMuniService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmMuniService
 * @generated
 */
@ProviderType
public class CrmMuniServiceWrapper implements CrmMuniService,
	ServiceWrapper<CrmMuniService> {
	public CrmMuniServiceWrapper(CrmMuniService crmMuniService) {
		_crmMuniService = crmMuniService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmMuniService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmMuni> findByZipCode(
		java.lang.String zipCode) {
		return _crmMuniService.findByZipCode(zipCode);
	}

	@Override
	public CrmMuniService getWrappedService() {
		return _crmMuniService;
	}

	@Override
	public void setWrappedService(CrmMuniService crmMuniService) {
		_crmMuniService = crmMuniService;
	}

	private CrmMuniService _crmMuniService;
}