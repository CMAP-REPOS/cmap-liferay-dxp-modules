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

package ucc.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the CExtStaffingChurch service. Represents a row in the &quot;UCC_CExtStaffingChurch&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CExtStaffingChurchModel
 * @see ucc.portal.model.impl.CExtStaffingChurchImpl
 * @see ucc.portal.model.impl.CExtStaffingChurchModelImpl
 * @generated
 */
@ImplementationClassName("ucc.portal.model.impl.CExtStaffingChurchImpl")
@ProviderType
public interface CExtStaffingChurch extends CExtStaffingChurchModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ucc.portal.model.impl.CExtStaffingChurchImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CExtStaffingChurch, Long> ORGANIZATION_ID_ACCESSOR =
		new Accessor<CExtStaffingChurch, Long>() {
			@Override
			public Long get(CExtStaffingChurch cExtStaffingChurch) {
				return cExtStaffingChurch.getOrganizationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CExtStaffingChurch> getTypeClass() {
				return CExtStaffingChurch.class;
			}
		};

	public static final Accessor<CExtStaffingChurch, Long> CEXT_STAFFING_CHURCH_ID_ACCESSOR =
		new Accessor<CExtStaffingChurch, Long>() {
			@Override
			public Long get(CExtStaffingChurch cExtStaffingChurch) {
				return cExtStaffingChurch.getCextStaffingChurchId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CExtStaffingChurch> getTypeClass() {
				return CExtStaffingChurch.class;
			}
		};
}