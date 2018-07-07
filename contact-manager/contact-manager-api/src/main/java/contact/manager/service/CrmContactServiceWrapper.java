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
 * Provides a wrapper for {@link CrmContactService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactService
 * @generated
 */
@ProviderType
public class CrmContactServiceWrapper implements CrmContactService,
	ServiceWrapper<CrmContactService> {
	public CrmContactServiceWrapper(CrmContactService crmContactService) {
		_crmContactService = crmContactService;
	}

	@Override
	public contact.manager.model.CrmContact addCrmContact(
		contact.manager.model.CrmContact crmContact)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactService.addCrmContact(crmContact);
	}

	@Override
	public contact.manager.model.CrmContact findByConstantContactId(
		long constantContactId)
		throws com.liferay.portal.kernel.exception.NoSuchContactException,
			com.liferay.portal.kernel.exception.SystemException,
			contact.manager.exception.NoSuchCrmContactException {
		return _crmContactService.findByConstantContactId(constantContactId);
	}

	@Override
	public contact.manager.model.CrmContact getCrmContact(long crmContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactService.getCrmContact(crmContactId);
	}

	@Override
	public contact.manager.model.CrmContact updateCrmContact(
		contact.manager.model.CrmContact crmContact)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmContactService.updateCrmContact(crmContact);
	}

	@Override
	public int countCrmContactsByStatus(java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactService.countCrmContactsByStatus(status);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmContactService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactService.findByPrimaryEmailAddress(primaryEmailAddress);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactService.findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
			status);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> findByStatus(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactService.findByStatus(status);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> findByStatus(
		java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactService.findByStatus(status, start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> findByStatus(
		java.lang.String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactService.findByStatus(status, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> findByVipFlag(
		boolean isVip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactService.findByVipFlag(isVip);
	}

	@Override
	public java.util.List<contact.manager.model.CrmGroup> getCrmGroups(
		long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactService.getCrmGroups(contactId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmTag> getCrmTags(
		long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmContactService.getCrmTags(contactId);
	}

	@Override
	public void setCrmGroups(long contactId, long[] groupIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_crmContactService.setCrmGroups(contactId, groupIds);
	}

	@Override
	public void setCrmTags(long contactId, long[] tagIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_crmContactService.setCrmTags(contactId, tagIds);
	}

	@Override
	public CrmContactService getWrappedService() {
		return _crmContactService;
	}

	@Override
	public void setWrappedService(CrmContactService crmContactService) {
		_crmContactService = crmContactService;
	}

	private CrmContactService _crmContactService;
}