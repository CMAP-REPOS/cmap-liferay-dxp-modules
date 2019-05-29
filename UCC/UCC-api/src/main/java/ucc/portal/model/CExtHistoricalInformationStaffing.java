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
 * The extended model interface for the CExtHistoricalInformationStaffing service. Represents a row in the &quot;UCC_CExtHistoricalInformationStaffing&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CExtHistoricalInformationStaffingModel
 * @see ucc.portal.model.impl.CExtHistoricalInformationStaffingImpl
 * @see ucc.portal.model.impl.CExtHistoricalInformationStaffingModelImpl
 * @generated
 */
@ImplementationClassName("ucc.portal.model.impl.CExtHistoricalInformationStaffingImpl")
@ProviderType
public interface CExtHistoricalInformationStaffing
	extends CExtHistoricalInformationStaffingModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ucc.portal.model.impl.CExtHistoricalInformationStaffingImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CExtHistoricalInformationStaffing, Long> ORGANIZATION_ID_ACCESSOR =
		new Accessor<CExtHistoricalInformationStaffing, Long>() {
			@Override
			public Long get(
				CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing) {
				return cExtHistoricalInformationStaffing.getOrganizationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CExtHistoricalInformationStaffing> getTypeClass() {
				return CExtHistoricalInformationStaffing.class;
			}
		};

	public static final Accessor<CExtHistoricalInformationStaffing, Long> CEXT_HISTORICAL_INFORMATION_STAFFING_ID_ACCESSOR =
		new Accessor<CExtHistoricalInformationStaffing, Long>() {
			@Override
			public Long get(
				CExtHistoricalInformationStaffing cExtHistoricalInformationStaffing) {
				return cExtHistoricalInformationStaffing.getCextHistoricalInformationStaffingId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CExtHistoricalInformationStaffing> getTypeClass() {
				return CExtHistoricalInformationStaffing.class;
			}
		};
}