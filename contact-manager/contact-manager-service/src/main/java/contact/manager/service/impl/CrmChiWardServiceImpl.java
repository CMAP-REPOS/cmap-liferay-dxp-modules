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

import java.util.List;

import contact.manager.model.CrmChiWard;
import contact.manager.service.base.CrmChiWardServiceBaseImpl;

/**
 * The implementation of the CRM Chi Ward remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link contact.manager.service.CrmChiWardService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmChiWardServiceBaseImpl
 * @see contact.manager.service.CrmChiWardServiceUtil
 */
public class CrmChiWardServiceImpl extends CrmChiWardServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link contact.manager.service.CrmChiWardServiceUtil} to access the CRM Chi Ward remote service.
	 */

	public List<CrmChiWard> findByZipCode(String zipCode) {
		return crmChiWardPersistence.findByZipCode(zipCode);
	}
}