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
 * Provides a wrapper for {@link CrmGroupService}.
 *
 * @author Brian Wing Shun Chan
 * @see CrmGroupService
 * @generated
 */
@ProviderType
public class CrmGroupServiceWrapper implements CrmGroupService,
	ServiceWrapper<CrmGroupService> {
	public CrmGroupServiceWrapper(CrmGroupService crmGroupService) {
		_crmGroupService = crmGroupService;
	}

	@Override
	public contact.manager.model.CrmGroup addCrmGroup(
		contact.manager.model.CrmGroup crmGroup)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmGroupService.addCrmGroup(crmGroup);
	}

	@Override
	public contact.manager.model.CrmGroup deleteCrmGroup(
		contact.manager.model.CrmGroup crmGroup,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmGroupService.deleteCrmGroup(crmGroup, serviceContext);
	}

	@Override
	public contact.manager.model.CrmGroup deleteCrmGroup(long crmGroupId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmGroupService.deleteCrmGroup(crmGroupId, serviceContext);
	}

	@Override
	public contact.manager.model.CrmGroup getCrmGroup(long crmGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmGroupService.getCrmGroup(crmGroupId);
	}

	@Override
	public contact.manager.model.CrmGroup updateCrmGroup(
		contact.manager.model.CrmGroup crmGroup)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _crmGroupService.updateCrmGroup(crmGroup);
	}

	@Override
	public int countAll() {
		return _crmGroupService.countAll();
	}

	@Override
	public int getCrmContactsSize(long crmGroupId) {
		return _crmGroupService.getCrmContactsSize(crmGroupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _crmGroupService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<contact.manager.model.CrmGroup> findAll() {
		return _crmGroupService.findAll();
	}

	@Override
	public java.util.List<contact.manager.model.CrmGroup> findAll(int start,
		int end) {
		return _crmGroupService.findAll(start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmGroup> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator) {
		return _crmGroupService.findAll(start, end, orderByComparator);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long crmGroupId) {
		return _crmGroupService.getCrmContacts(crmGroupId);
	}

	@Override
	public void setCrmGroupCrmContacts(long crmGroupId, long[] crmContactIds) {
		_crmGroupService.setCrmGroupCrmContacts(crmGroupId, crmContactIds);
	}

	@Override
	public CrmGroupService getWrappedService() {
		return _crmGroupService;
	}

	@Override
	public void setWrappedService(CrmGroupService crmGroupService) {
		_crmGroupService = crmGroupService;
	}

	private CrmGroupService _crmGroupService;
}