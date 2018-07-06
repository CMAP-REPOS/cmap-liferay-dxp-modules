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

import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;

import contact.manager.model.CrmNote;
import contact.manager.service.base.CrmNoteServiceBaseImpl;

/**
 * The implementation of the CRM Note remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link contact.manager.service.CrmNoteService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmNoteServiceBaseImpl
 * @see contact.manager.service.CrmNoteServiceUtil
 */
public class CrmNoteServiceImpl extends CrmNoteServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link contact.manager.service.CrmNoteServiceUtil} to access the CRM Note remote service.
	 */
	public List<CrmNote> findByCrmContactId(long crmContactId) {
		return crmNotePersistence.findByCrmContactId(crmContactId);
	}

	public List<CrmNote> findByCrmContactId(long crmContactId, int start, int end) {
		return crmNotePersistence.findByCrmContactId(crmContactId, start, end);
	}

	public List<CrmNote> findByCrmContactId(long crmContactId, int start, int end,
			OrderByComparator<CrmNote> orderByComparator) {
		return crmNotePersistence.findByCrmContactId(crmContactId, start, end, orderByComparator);
	}

	public int countByCrmContactId(long crmContactId) {
		return crmNotePersistence.countByCrmContactId(crmContactId);
	}
}