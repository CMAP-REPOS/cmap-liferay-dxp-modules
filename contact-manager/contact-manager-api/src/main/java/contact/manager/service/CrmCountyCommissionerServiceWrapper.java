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
 * Provides a wrapper for {@link CrmCountyCommissionerService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmCountyCommissionerService
 * @generated
 */
@ProviderType
public class CrmCountyCommissionerServiceWrapper
	implements CrmCountyCommissionerService,
		ServiceWrapper<CrmCountyCommissionerService> {
	public CrmCountyCommissionerServiceWrapper(
		CrmCountyCommissionerService crmCountyCommissionerService) {
		_crmCountyCommissionerService = crmCountyCommissionerService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmCountyCommissionerService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmCountyCommissioner> findByZipCode(
		java.lang.String zipCode) {
		return _crmCountyCommissionerService.findByZipCode(zipCode);
	}

	@Override
	public CrmCountyCommissionerService getWrappedService() {
		return _crmCountyCommissionerService;
	}

	@Override
	public void setWrappedService(
		CrmCountyCommissionerService crmCountyCommissionerService) {
		_crmCountyCommissionerService = crmCountyCommissionerService;
	}

	private CrmCountyCommissionerService _crmCountyCommissionerService;
}