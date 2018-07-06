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
 * Provides a wrapper for {@link CrmCountyService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmCountyService
 * @generated
 */
@ProviderType
public class CrmCountyServiceWrapper implements CrmCountyService,
	ServiceWrapper<CrmCountyService> {
	public CrmCountyServiceWrapper(CrmCountyService crmCountyService) {
		_crmCountyService = crmCountyService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmCountyService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmCounty> findByZipCode(
		java.lang.String zipCode) {
		return _crmCountyService.findByZipCode(zipCode);
	}

	@Override
	public CrmCountyService getWrappedService() {
		return _crmCountyService;
	}

	@Override
	public void setWrappedService(CrmCountyService crmCountyService) {
		_crmCountyService = crmCountyService;
	}

	private CrmCountyService _crmCountyService;
}