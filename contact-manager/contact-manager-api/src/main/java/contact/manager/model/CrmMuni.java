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
 * The extended model interface for the CrmMuni service. Represents a row in the &quot;crm_muni&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CrmMuniModel
 * @see contact.manager.model.impl.CrmMuniImpl
 * @see contact.manager.model.impl.CrmMuniModelImpl
 * @generated
 */
@ImplementationClassName("contact.manager.model.impl.CrmMuniImpl")
@ProviderType
public interface CrmMuni extends CrmMuniModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link contact.manager.model.impl.CrmMuniImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CrmMuni, Long> CRM_MUNI_ID_ACCESSOR = new Accessor<CrmMuni, Long>() {
			@Override
			public Long get(CrmMuni crmMuni) {
				return crmMuni.getCrmMuniId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CrmMuni> getTypeClass() {
				return CrmMuni.class;
			}
		};
}