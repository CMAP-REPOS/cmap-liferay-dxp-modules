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
	public contact.manager.model.CrmGroup getCrmGroup(long crmGroupId) {
		return _crmGroupService.getCrmGroup(crmGroupId);
	}

	@Override
	public int countAll() {
		return _crmGroupService.countAll();
	}

	@Override
	public int getCrmContactsCount(long crmGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmGroupService.getCrmContactsCount(crmGroupId);
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
	public java.util.List<contact.manager.model.CrmGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmGroupService.findAll();
	}

	@Override
	public java.util.List<contact.manager.model.CrmGroup> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _crmGroupService.findAll(start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmGroup> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmGroupService.findAll(start, end, orderByComparator);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long crmGroupId) {
		return _crmGroupService.getCrmContacts(crmGroupId);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long crmGroupId, int start, int end) {
		return _crmGroupService.getCrmContacts(crmGroupId, start, end);
	}

	@Override
	public java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		long crmGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		return _crmGroupService.getCrmContacts(crmGroupId, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<contact.manager.model.CrmGroup> getCrmGroupsByName(
		java.lang.String crmGroupName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crmGroupService.getCrmGroupsByName(crmGroupName);
	}

	@Override
	public void setCrmContacts(long crmGroupPk, long[] crmContactPks)
		throws com.liferay.portal.kernel.exception.SystemException {
		_crmGroupService.setCrmContacts(crmGroupPk, crmContactPks);
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