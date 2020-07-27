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
 * The extended model interface for the CrmContactAuditLogChange service. Represents a row in the &quot;crm_contactauditlogchange&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogChangeModel
 * @generated
 */
@ImplementationClassName(
	"contact.manager.model.impl.CrmContactAuditLogChangeImpl"
)
@ProviderType
public interface CrmContactAuditLogChange
	extends CrmContactAuditLogChangeModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>contact.manager.model.impl.CrmContactAuditLogChangeImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CrmContactAuditLogChange, Long>
		CRM_CONTACT_AUDIT_LOG_CHANGE_ID_ACCESSOR =
			new Accessor<CrmContactAuditLogChange, Long>() {

				@Override
				public Long get(
					CrmContactAuditLogChange crmContactAuditLogChange) {

					return crmContactAuditLogChange.
						getCrmContactAuditLogChangeId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CrmContactAuditLogChange> getTypeClass() {
					return CrmContactAuditLogChange.class;
				}

			};

}