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

import contact.manager.model.CrmCountyCommissioner;
import contact.manager.service.base.CrmCountyCommissionerLocalServiceBaseImpl;

/**
 * The implementation of the CRM County Commissioner local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link contact.manager.service.CrmCountyCommissionerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmCountyCommissionerLocalServiceBaseImpl
 * @see contact.manager.service.CrmCountyCommissionerLocalServiceUtil
 */
public class CrmCountyCommissionerLocalServiceImpl extends CrmCountyCommissionerLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * contact.manager.service.CrmCountyCommissionerLocalServiceUtil} to access
	 * the CRM County Commissioner local service.
	 */

	public List<CrmCountyCommissioner> findByZipCode(String zipCode) {
		return crmCountyCommissionerPersistence.findByZipCode(zipCode);
	}

}