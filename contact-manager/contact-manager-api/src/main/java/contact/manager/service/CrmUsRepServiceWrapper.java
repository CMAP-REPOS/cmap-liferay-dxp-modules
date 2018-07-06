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
 * Provides a wrapper for {@link CrmUsRepService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmUsRepService
 * @generated
 */
@ProviderType
public class CrmUsRepServiceWrapper implements CrmUsRepService,
	ServiceWrapper<CrmUsRepService> {
	public CrmUsRepServiceWrapper(CrmUsRepService crmUsRepService) {
		_crmUsRepService = crmUsRepService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmUsRepService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmUsRep> findByZipCode(
		java.lang.String zipCode) {
		return _crmUsRepService.findByZipCode(zipCode);
	}

	@Override
	public CrmUsRepService getWrappedService() {
		return _crmUsRepService;
	}

	@Override
	public void setWrappedService(CrmUsRepService crmUsRepService) {
		_crmUsRepService = crmUsRepService;
	}

	private CrmUsRepService _crmUsRepService;
}