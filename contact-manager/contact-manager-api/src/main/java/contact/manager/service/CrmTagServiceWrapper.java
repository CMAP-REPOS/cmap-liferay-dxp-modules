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
 * Provides a wrapper for {@link CrmTagService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmTagService
 * @generated
 */
@ProviderType
public class CrmTagServiceWrapper implements CrmTagService,
	ServiceWrapper<CrmTagService> {
	public CrmTagServiceWrapper(CrmTagService crmTagService) {
		_crmTagService = crmTagService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmTagService.getOSGiServiceIdentifier();
	}

	@Override
	public CrmTagService getWrappedService() {
		return _crmTagService;
	}

	@Override
	public void setWrappedService(CrmTagService crmTagService) {
		_crmTagService = crmTagService;
	}

	private CrmTagService _crmTagService;
}