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
 * Provides the remote service utility for CrmGroup. This utility wraps
 * {@link contact.manager.service.impl.CrmGroupServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CrmGroupService
 * @see contact.manager.service.base.CrmGroupServiceBaseImpl
 * @see contact.manager.service.impl.CrmGroupServiceImpl
 * @generated
 */
@ProviderType
public class CrmGroupServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.impl.CrmGroupServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static contact.manager.model.CrmGroup addCrmGroup(
		contact.manager.model.CrmGroup crmGroup)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().addCrmGroup(crmGroup);
	}

	public static contact.manager.model.CrmGroup deleteCrmGroup(
		contact.manager.model.CrmGroup crmGroup,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCrmGroup(crmGroup, serviceContext);
	}

	public static contact.manager.model.CrmGroup deleteCrmGroup(
		long crmGroupId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCrmGroup(crmGroupId, serviceContext);
	}

	public static contact.manager.model.CrmGroup getCrmGroup(long crmGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCrmGroup(crmGroupId);
	}

	public static contact.manager.model.CrmGroup updateCrmGroup(
		contact.manager.model.CrmGroup crmGroup)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updateCrmGroup(crmGroup);
	}

	public static int countAll() {
		return getService().countAll();
	}

	public static int getCrmContactsSize(long crmGroupId) {
		return getService().getCrmContactsSize(crmGroupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<contact.manager.model.CrmGroup> findAll() {
		return getService().findAll();
	}

	public static java.util.List<contact.manager.model.CrmGroup> findAll(
		int start, int end) {
		return getService().findAll(start, end);
	}

	public static java.util.List<contact.manager.model.CrmGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator) {
		return getService().findAll(start, end, orderByComparator);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long crmGroupId) {
		return getService().getCrmContacts(crmGroupId);
	}

	public static void setCrmGroupCrmContacts(long crmGroupId,
		long[] crmContactIds) {
		getService().setCrmGroupCrmContacts(crmGroupId, crmContactIds);
	}

	public static CrmGroupService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmGroupService, CrmGroupService> _serviceTracker =
		ServiceTrackerFactory.open(CrmGroupService.class);
}