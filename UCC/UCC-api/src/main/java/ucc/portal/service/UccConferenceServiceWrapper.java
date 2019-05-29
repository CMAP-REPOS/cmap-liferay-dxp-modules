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

package ucc.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UccConferenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see UccConferenceService
 * @generated
 */
@ProviderType
public class UccConferenceServiceWrapper implements UccConferenceService,
	ServiceWrapper<UccConferenceService> {
	public UccConferenceServiceWrapper(
		UccConferenceService uccConferenceService) {
		_uccConferenceService = uccConferenceService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _uccConferenceService.getOSGiServiceIdentifier();
	}

	@Override
	public UccConferenceService getWrappedService() {
		return _uccConferenceService;
	}

	@Override
	public void setWrappedService(UccConferenceService uccConferenceService) {
		_uccConferenceService = uccConferenceService;
	}

	private UccConferenceService _uccConferenceService;
}