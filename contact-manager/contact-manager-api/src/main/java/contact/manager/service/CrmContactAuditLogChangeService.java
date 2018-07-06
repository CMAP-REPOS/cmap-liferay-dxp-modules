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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import contact.manager.model.CrmContactAuditLogChange;

import java.util.List;

/**
 * Provides the remote service interface for CrmContactAuditLogChange. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogChangeServiceUtil
 * @see contact.manager.service.base.CrmContactAuditLogChangeServiceBaseImpl
 * @see contact.manager.service.impl.CrmContactAuditLogChangeServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=crm", "json.web.service.context.path=CrmContactAuditLogChange"}, service = CrmContactAuditLogChangeService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CrmContactAuditLogChangeService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmContactAuditLogChangeServiceUtil} to access the CRM Contact Audit Log Change remote service. Add custom service methods to {@link contact.manager.service.impl.CrmContactAuditLogChangeServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public int countByCrmContactAuditLogId(long crmContactAuditLogId);

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	public List<CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId);

	public List<CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId, int start, int end)
		throws SystemException;

	public List<CrmContactAuditLogChange> findByCrmContactAuditLogId(
		long crmContactAuditLogId, int start, int end,
		OrderByComparator<CrmContactAuditLogChange> orderByComparator)
		throws SystemException;
}