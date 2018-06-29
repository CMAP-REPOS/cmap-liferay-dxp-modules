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

import contact.manager.model.CrmCCA;
import contact.manager.service.base.CrmCCALocalServiceBaseImpl;

/**
 * The implementation of the CRM CCA local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link contact.manager.service.CrmCCALocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmCCALocalServiceBaseImpl
 * @see contact.manager.service.CrmCCALocalServiceUtil
 */
public class CrmCCALocalServiceImpl extends CrmCCALocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * contact.manager.service.CrmCCALocalServiceUtil} to access the CRM CCA
	 * local service.
	 */
	
	public List<CrmCCA> findByZipCode(String zipCode) {
		return crmCCAPersistence.findByZipCode(zipCode);
	}
}