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
 * Provides the remote service utility for CrmNote. This utility wraps
 * {@link contact.manager.service.impl.CrmNoteServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CrmNoteService
 * @see contact.manager.service.base.CrmNoteServiceBaseImpl
 * @see contact.manager.service.impl.CrmNoteServiceImpl
 * @generated
 */
@ProviderType
public class CrmNoteServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.impl.CrmNoteServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static int countByCrmContactId(long crmContactId) {
		return getService().countByCrmContactId(crmContactId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<contact.manager.model.CrmNote> findByCrmContactId(
		long crmContactId) {
		return getService().findByCrmContactId(crmContactId);
	}

	public static java.util.List<contact.manager.model.CrmNote> findByCrmContactId(
		long crmContactId, int start, int end) {
		return getService().findByCrmContactId(crmContactId, start, end);
	}

	public static java.util.List<contact.manager.model.CrmNote> findByCrmContactId(
		long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmNote> orderByComparator) {
		return getService()
				   .findByCrmContactId(crmContactId, start, end,
			orderByComparator);
	}

	public static CrmNoteService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmNoteService, CrmNoteService> _serviceTracker =
		ServiceTrackerFactory.open(CrmNoteService.class);
}