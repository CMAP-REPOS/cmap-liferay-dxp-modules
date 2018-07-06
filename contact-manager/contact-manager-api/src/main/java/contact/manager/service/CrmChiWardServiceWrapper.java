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
 * Provides a wrapper for {@link CrmChiWardService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmChiWardService
 * @generated
 */
@ProviderType
public class CrmChiWardServiceWrapper implements CrmChiWardService,
	ServiceWrapper<CrmChiWardService> {
	public CrmChiWardServiceWrapper(CrmChiWardService crmChiWardService) {
		_crmChiWardService = crmChiWardService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmChiWardService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmChiWard> findByZipCode(
		java.lang.String zipCode) {
		return _crmChiWardService.findByZipCode(zipCode);
	}

	@Override
	public CrmChiWardService getWrappedService() {
		return _crmChiWardService;
	}

	@Override
	public void setWrappedService(CrmChiWardService crmChiWardService) {
		_crmChiWardService = crmChiWardService;
	}

	private CrmChiWardService _crmChiWardService;
}