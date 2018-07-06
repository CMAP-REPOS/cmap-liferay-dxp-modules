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
 * Provides a wrapper for {@link CrmLTAService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmLTAService
 * @generated
 */
@ProviderType
public class CrmLTAServiceWrapper implements CrmLTAService,
	ServiceWrapper<CrmLTAService> {
	public CrmLTAServiceWrapper(CrmLTAService crmLTAService) {
		_crmLTAService = crmLTAService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmLTAService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmLTA> findByZipCode(
		java.lang.String zipCode) {
		return _crmLTAService.findByZipCode(zipCode);
	}

	@Override
	public CrmLTAService getWrappedService() {
		return _crmLTAService;
	}

	@Override
	public void setWrappedService(CrmLTAService crmLTAService) {
		_crmLTAService = crmLTAService;
	}

	private CrmLTAService _crmLTAService;
}