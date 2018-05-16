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

package contact.manager.service.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ContactAuditLogChange service. Represents a row in the &quot;contactmanager_ContactAuditLogChange&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ContactAuditLogChangeModel
 * @see contact.manager.service.model.impl.ContactAuditLogChangeImpl
 * @see contact.manager.service.model.impl.ContactAuditLogChangeModelImpl
 * @generated
 */
@ImplementationClassName("contact.manager.service.model.impl.ContactAuditLogChangeImpl")
@ProviderType
public interface ContactAuditLogChange extends ContactAuditLogChangeModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link contact.manager.service.model.impl.ContactAuditLogChangeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ContactAuditLogChange, Long> CONTACT_AUDIT_LOG_CHANGE_ID_ACCESSOR =
		new Accessor<ContactAuditLogChange, Long>() {
			@Override
			public Long get(ContactAuditLogChange contactAuditLogChange) {
				return contactAuditLogChange.getContactAuditLogChangeId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ContactAuditLogChange> getTypeClass() {
				return ContactAuditLogChange.class;
			}
		};
}