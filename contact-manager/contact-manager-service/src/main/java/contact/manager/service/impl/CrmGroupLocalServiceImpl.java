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

package contact.manager.service.impl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Date;
import java.util.List;

import contact.manager.model.CrmGroup;
import contact.manager.service.base.CrmGroupLocalServiceBaseImpl;

/**
 * The implementation of the CRM Group local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link contact.manager.service.CrmGroupLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmGroupLocalServiceBaseImpl
 * @see contact.manager.service.CrmGroupLocalServiceUtil
 */
public class CrmGroupLocalServiceImpl extends CrmGroupLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * contact.manager.service.CrmGroupLocalServiceUtil} to access the CRM Group
	 * local service.
	 */

	public CrmGroup addCrmGroup(CrmGroup crmGroup, ServiceContext serviceContext) throws PortalException {

		long crmGroupId = counterLocalService.increment(CrmGroup.class.getName());

		crmGroup.setCrmGroupId(crmGroupId);
		crmGroup.setCompanyId(serviceContext.getCompanyId());
		crmGroup.setGroupId(serviceContext.getScopeGroupId());
		crmGroup.setUserId(serviceContext.getUserId());

		User user = getUserLocalService().fetchUser(serviceContext.getUserId());

		if (user != null) {
			crmGroup.setUserName(user.getScreenName());
		}

		crmGroup.setCreateDate(serviceContext.getCreateDate(new Date()));
		crmGroup.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		crmGroup = super.addCrmGroup(crmGroup);

		return crmGroup;
	}

	public CrmGroup updateCrmGroup(CrmGroup crmGroup, ServiceContext serviceContext) {
		
		crmGroup.setCompanyId(serviceContext.getCompanyId());
		crmGroup.setGroupId(serviceContext.getScopeGroupId());
		crmGroup.setUserId(serviceContext.getUserId());

		User user = getUserLocalService().fetchUser(serviceContext.getUserId());

		if (user != null) {
			crmGroup.setUserName(user.getScreenName());
		}

		crmGroup.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		
		crmGroup = super.updateCrmGroup(crmGroup);

		return crmGroup;
	}
	
	public CrmGroup deleteCrmGroup(CrmGroup crmGroup, ServiceContext serviceContext) {

		crmGroup.setCompanyId(serviceContext.getCompanyId());
		crmGroup.setGroupId(serviceContext.getScopeGroupId());
		crmGroup.setUserId(serviceContext.getUserId());

		User user = getUserLocalService().fetchUser(serviceContext.getUserId());

		if (user != null) {
			crmGroup.setUserName(user.getScreenName());
		}

		crmGroup.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		crmGroup = super.deleteCrmGroup(crmGroup);

		return crmGroup;
	}
}