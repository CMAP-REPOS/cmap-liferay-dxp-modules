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
 * Provides a wrapper for {@link CrmStateSenateService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateSenateService
 * @generated
 */
@ProviderType
public class CrmStateSenateServiceWrapper implements CrmStateSenateService,
	ServiceWrapper<CrmStateSenateService> {
	public CrmStateSenateServiceWrapper(
		CrmStateSenateService crmStateSenateService) {
		_crmStateSenateService = crmStateSenateService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmStateSenateService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmStateSenate> findByZipCode(
		java.lang.String zipCode) {
		return _crmStateSenateService.findByZipCode(zipCode);
	}

	@Override
	public CrmStateSenateService getWrappedService() {
		return _crmStateSenateService;
	}

	@Override
	public void setWrappedService(CrmStateSenateService crmStateSenateService) {
		_crmStateSenateService = crmStateSenateService;
	}

	private CrmStateSenateService _crmStateSenateService;
}