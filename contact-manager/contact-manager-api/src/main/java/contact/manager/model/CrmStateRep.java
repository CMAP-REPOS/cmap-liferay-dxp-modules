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
 * The extended model interface for the CrmStateRep service. Represents a row in the &quot;crm_staterep&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CrmStateRepModel
 * @see contact.manager.model.impl.CrmStateRepImpl
 * @see contact.manager.model.impl.CrmStateRepModelImpl
 * @generated
 */
@ImplementationClassName("contact.manager.model.impl.CrmStateRepImpl")
@ProviderType
public interface CrmStateRep extends CrmStateRepModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link contact.manager.model.impl.CrmStateRepImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CrmStateRep, Long> CRM_STATE_REP_ID_ACCESSOR = new Accessor<CrmStateRep, Long>() {
			@Override
			public Long get(CrmStateRep crmStateRep) {
				return crmStateRep.getCrmStateRepId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CrmStateRep> getTypeClass() {
				return CrmStateRep.class;
			}
		};
}