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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for UccConference. This utility wraps
 * {@link ucc.portal.service.impl.UccConferenceServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see UccConferenceService
 * @see ucc.portal.service.base.UccConferenceServiceBaseImpl
 * @see ucc.portal.service.impl.UccConferenceServiceImpl
 * @generated
 */
@ProviderType
public class UccConferenceServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ucc.portal.service.impl.UccConferenceServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static UccConferenceService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UccConferenceService, UccConferenceService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UccConferenceService.class);

		ServiceTracker<UccConferenceService, UccConferenceService> serviceTracker =
			new ServiceTracker<UccConferenceService, UccConferenceService>(bundle.getBundleContext(),
				UccConferenceService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}