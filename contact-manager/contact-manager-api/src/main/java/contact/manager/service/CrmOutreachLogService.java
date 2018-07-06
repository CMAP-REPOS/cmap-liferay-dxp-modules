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

import contact.manager.model.CrmOutreachLog;

import java.util.List;

/**
 * Provides the remote service interface for CrmOutreachLog. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CrmOutreachLogServiceUtil
 * @see contact.manager.service.base.CrmOutreachLogServiceBaseImpl
 * @see contact.manager.service.impl.CrmOutreachLogServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=crm", "json.web.service.context.path=CrmOutreachLog"}, service = CrmOutreachLogService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CrmOutreachLogService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmOutreachLogServiceUtil} to access the CRM Outreach Log remote service. Add custom service methods to {@link contact.manager.service.impl.CrmOutreachLogServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public int countByCrmContactIdId(long crmContactId);

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	public List<CrmOutreachLog> findByCrmContactId(long crmContactId)
		throws SystemException;

	public List<CrmOutreachLog> findByCrmContactId(long crmContactId,
		int start, int end) throws SystemException;

	public List<CrmOutreachLog> findByCrmContactId(long crmContactId,
		int start, int end, OrderByComparator<CrmOutreachLog> orderByComparator)
		throws SystemException;
}