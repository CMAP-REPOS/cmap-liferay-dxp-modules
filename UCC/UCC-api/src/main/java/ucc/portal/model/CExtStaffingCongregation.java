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
 * The extended model interface for the CExtStaffingCongregation service. Represents a row in the &quot;UCC_CExtStaffingCongregation&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CExtStaffingCongregationModel
 * @see ucc.portal.model.impl.CExtStaffingCongregationImpl
 * @see ucc.portal.model.impl.CExtStaffingCongregationModelImpl
 * @generated
 */
@ImplementationClassName("ucc.portal.model.impl.CExtStaffingCongregationImpl")
@ProviderType
public interface CExtStaffingCongregation extends CExtStaffingCongregationModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ucc.portal.model.impl.CExtStaffingCongregationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CExtStaffingCongregation, Long> ORGANIZATION_ID_ACCESSOR =
		new Accessor<CExtStaffingCongregation, Long>() {
			@Override
			public Long get(CExtStaffingCongregation cExtStaffingCongregation) {
				return cExtStaffingCongregation.getOrganizationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CExtStaffingCongregation> getTypeClass() {
				return CExtStaffingCongregation.class;
			}
		};

	public static final Accessor<CExtStaffingCongregation, Long> CEXT_STAFFING_CONGREGATION_ID_ACCESSOR =
		new Accessor<CExtStaffingCongregation, Long>() {
			@Override
			public Long get(CExtStaffingCongregation cExtStaffingCongregation) {
				return cExtStaffingCongregation.getCextStaffingCongregationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CExtStaffingCongregation> getTypeClass() {
				return CExtStaffingCongregation.class;
			}
		};
}