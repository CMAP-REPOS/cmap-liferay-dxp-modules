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

import contact.manager.model.CrmStateSenate;
import contact.manager.service.base.CrmStateSenateLocalServiceBaseImpl;

/**
 * The implementation of the CRM State Senate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link contact.manager.service.CrmStateSenateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateSenateLocalServiceBaseImpl
 * @see contact.manager.service.CrmStateSenateLocalServiceUtil
 */
public class CrmStateSenateLocalServiceImpl extends CrmStateSenateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * contact.manager.service.CrmStateSenateLocalServiceUtil} to access the CRM
	 * State Senate local service.
	 */
	
	public List<CrmStateSenate> findByZipCode(String zipCode) {
		return crmStateSenatePersistence.findByZipCode(zipCode);
	}
}