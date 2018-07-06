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
 * Provides the remote service utility for CrmContact. This utility wraps
 * {@link contact.manager.service.impl.CrmContactServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactService
 * @see contact.manager.service.base.CrmContactServiceBaseImpl
 * @see contact.manager.service.impl.CrmContactServiceImpl
 * @generated
 */
@ProviderType
public class CrmContactServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link contact.manager.service.impl.CrmContactServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static contact.manager.model.CrmContact findByConstantContactId(
		long constantContactId)
		throws com.liferay.portal.kernel.exception.NoSuchContactException,
			com.liferay.portal.kernel.exception.SystemException,
			contact.manager.exception.NoSuchCrmContactException {
		return getService().findByConstantContactId(constantContactId);
	}

	public static contact.manager.model.CrmContact getCrmContact(
		long crmContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCrmContact(crmContactId);
	}

	public static int countCrmContactsByStatus(java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countCrmContactsByStatus(status);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<contact.manager.model.CrmContact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByPrimaryEmailAddress(primaryEmailAddress);
	}

	public static java.util.List<contact.manager.model.CrmContact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status);
	}

	public static java.util.List<contact.manager.model.CrmContact> findByStatus(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByStatus(status);
	}

	public static java.util.List<contact.manager.model.CrmContact> findByVipFlag(
		boolean isVip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByVipFlag(isVip);
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContactsByStatus(
		java.lang.String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCrmContactsByStatus(status, start, end, obc);
	}

	public static java.util.List<contact.manager.model.CrmGroup> getCrmGroups(
		long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCrmGroups(contactId);
	}

	public static java.util.List<contact.manager.model.CrmTag> getCrmTags(
		long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCrmTags(contactId);
	}

	public static void setCrmGroups(long contactId, long[] groupIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setCrmGroups(contactId, groupIds);
	}

	public static void setCrmTags(long contactId, long[] tagIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setCrmTags(contactId, tagIds);
	}

	public static CrmContactService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CrmContactService, CrmContactService> _serviceTracker =
		ServiceTrackerFactory.open(CrmContactService.class);
}