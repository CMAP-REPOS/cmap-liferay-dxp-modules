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
 * The extended model interface for the CrmCCA service. Represents a row in the &quot;crm_cca&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CrmCCAModel
 * @see contact.manager.model.impl.CrmCCAImpl
 * @see contact.manager.model.impl.CrmCCAModelImpl
 * @generated
 */
@ImplementationClassName("contact.manager.model.impl.CrmCCAImpl")
@ProviderType
public interface CrmCCA extends CrmCCAModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link contact.manager.model.impl.CrmCCAImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CrmCCA, Long> CRM_CCA_ID_ACCESSOR = new Accessor<CrmCCA, Long>() {
			@Override
			public Long get(CrmCCA crmCCA) {
				return crmCCA.getCrmCCAId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CrmCCA> getTypeClass() {
				return CrmCCA.class;
			}
		};
}