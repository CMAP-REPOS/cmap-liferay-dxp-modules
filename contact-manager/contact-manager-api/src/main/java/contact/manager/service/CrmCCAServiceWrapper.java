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
 * Provides a wrapper for {@link CrmCCAService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmCCAService
 * @generated
 */
@ProviderType
public class CrmCCAServiceWrapper implements CrmCCAService,
	ServiceWrapper<CrmCCAService> {
	public CrmCCAServiceWrapper(CrmCCAService crmCCAService) {
		_crmCCAService = crmCCAService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmCCAService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmCCA> findByZipCode(
		java.lang.String zipCode) {
		return _crmCCAService.findByZipCode(zipCode);
	}

	@Override
	public CrmCCAService getWrappedService() {
		return _crmCCAService;
	}

	@Override
	public void setWrappedService(CrmCCAService crmCCAService) {
		_crmCCAService = crmCCAService;
	}

	private CrmCCAService _crmCCAService;
}