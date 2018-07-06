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
	public static contact.manager.model.CrmGroup getCrmGroup(long crmGroupId) {
		return getService().getCrmGroup(crmGroupId);
	}

	public static int countAll() {
		return getService().countAll();
	}

	public static int getCrmContactsCount(long crmGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCrmContactsCount(crmGroupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<contact.manager.model.CrmGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	public static java.util.List<contact.manager.model.CrmGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end);
	}

	public static java.util.List<contact.manager.model.CrmGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll(start, end, orderByComparator);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long crmGroupId) {
		return getService().getCrmContacts(crmGroupId);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long crmGroupId, int start, int end) {
		return getService().getCrmContacts(crmGroupId, start, end);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long crmGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		return getService()
				   .getCrmContacts(crmGroupId, start, end, orderByComparator);
	}

	public static java.util.List<contact.manager.model.CrmGroup> getCrmGroupsByName(
		java.lang.String crmGroupName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCrmGroupsByName(crmGroupName);
	}

	public static void setCrmContacts(long crmGroupPk, long[] crmContactPks)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setCrmContacts(crmGroupPk, crmContactPks);
	}

	public static CrmGroupService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmGroupService, CrmGroupService> _serviceTracker =
		ServiceTrackerFactory.open(CrmGroupService.class);
}