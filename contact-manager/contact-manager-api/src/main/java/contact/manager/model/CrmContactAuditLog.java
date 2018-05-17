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

package contact.manager.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the CrmContactAuditLog service. Represents a row in the &quot;crm_contactauditlog&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogModel
 * @see contact.manager.model.impl.CrmContactAuditLogImpl
 * @see contact.manager.model.impl.CrmContactAuditLogModelImpl
 * @generated
 */
@ImplementationClassName("contact.manager.model.impl.CrmContactAuditLogImpl")
@ProviderType
public interface CrmContactAuditLog extends CrmContactAuditLogModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link contact.manager.model.impl.CrmContactAuditLogImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CrmContactAuditLog, Long> CRM_CONTACT_AUDIT_LOG_ID_ACCESSOR =
		new Accessor<CrmContactAuditLog, Long>() {
			@Override
			public Long get(CrmContactAuditLog crmContactAuditLog) {
				return crmContactAuditLog.getCrmContactAuditLogId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CrmContactAuditLog> getTypeClass() {
				return CrmContactAuditLog.class;
			}
		};
}