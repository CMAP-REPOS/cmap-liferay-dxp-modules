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
 * Provides a wrapper for {@link CrmStateRepService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateRepService
 * @generated
 */
@ProviderType
public class CrmStateRepServiceWrapper implements CrmStateRepService,
	ServiceWrapper<CrmStateRepService> {
	public CrmStateRepServiceWrapper(CrmStateRepService crmStateRepService) {
		_crmStateRepService = crmStateRepService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmStateRepService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmStateRep> findByZipCode(
		java.lang.String zipCode) {
		return _crmStateRepService.findByZipCode(zipCode);
	}

	@Override
	public CrmStateRepService getWrappedService() {
		return _crmStateRepService;
	}

	@Override
	public void setWrappedService(CrmStateRepService crmStateRepService) {
		_crmStateRepService = crmStateRepService;
	}

	private CrmStateRepService _crmStateRepService;
}