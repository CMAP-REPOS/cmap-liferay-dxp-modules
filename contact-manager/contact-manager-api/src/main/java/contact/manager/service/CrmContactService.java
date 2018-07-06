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

import com.liferay.portal.kernel.exception.NoSuchContactException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.exception.NoSuchCrmContactException;

import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.model.CrmTag;

import java.util.List;

/**
 * Provides the remote service interface for CrmContact. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactServiceUtil
 * @see contact.manager.service.base.CrmContactServiceBaseImpl
 * @see contact.manager.service.impl.CrmContactServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=crm", "json.web.service.context.path=CrmContact"}, service = CrmContactService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CrmContactService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmContactServiceUtil} to access the CRM Contact remote service. Add custom service methods to {@link contact.manager.service.impl.CrmContactServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public CrmContact findByConstantContactId(long constantContactId)
		throws NoSuchContactException, SystemException,
			NoSuchCrmContactException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CrmContact getCrmContact(long crmContactId)
		throws SystemException;

	public int countCrmContactsByStatus(java.lang.String status)
		throws SystemException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	public List<CrmContact> findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress) throws SystemException;

	public List<CrmContact> findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status)
		throws SystemException;

	public List<CrmContact> findByStatus(java.lang.String status)
		throws SystemException;

	public List<CrmContact> findByVipFlag(boolean isVip)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmContact> getCrmContactsByStatus(java.lang.String status,
		int start, int end, OrderByComparator obc) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmGroup> getCrmGroups(long contactId)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CrmTag> getCrmTags(long contactId) throws SystemException;

	public void setCrmGroups(long contactId, long[] groupIds)
		throws SystemException;

	public void setCrmTags(long contactId, long[] tagIds)
		throws SystemException;
}