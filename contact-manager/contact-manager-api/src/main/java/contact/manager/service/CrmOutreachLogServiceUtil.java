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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for CrmOutreachLog. This utility wraps
 * {@link contact.manager.service.impl.CrmOutreachLogServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CrmOutreachLogService
 * @see contact.manager.service.base.CrmOutreachLogServiceBaseImpl
 * @see contact.manager.service.impl.CrmOutreachLogServiceImpl
 * @generated
 */
@ProviderType
public class CrmOutreachLogServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.impl.CrmOutreachLogServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static int countByCrmContactIdId(long crmContactId) {
		return getService().countByCrmContactIdId(crmContactId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<contact.manager.model.CrmOutreachLog> findByCrmContactId(
		long crmContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCrmContactId(crmContactId);
	}

	public static java.util.List<contact.manager.model.CrmOutreachLog> findByCrmContactId(
		long crmContactId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCrmContactId(crmContactId, start, end);
	}

	public static java.util.List<contact.manager.model.CrmOutreachLog> findByCrmContactId(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmOutreachLog> orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCrmContactId(crmContactId, start, end,
			orderByComparator);
	}

	public static CrmOutreachLogService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmOutreachLogService, CrmOutreachLogService> _serviceTracker =
		ServiceTrackerFactory.open(CrmOutreachLogService.class);
}