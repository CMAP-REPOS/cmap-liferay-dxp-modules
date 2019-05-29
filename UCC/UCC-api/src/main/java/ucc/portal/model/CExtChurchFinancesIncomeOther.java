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
 * The extended model interface for the CExtChurchFinancesIncomeOther service. Represents a row in the &quot;UCC_CExtChurchFinancesIncomeOther&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CExtChurchFinancesIncomeOtherModel
 * @see ucc.portal.model.impl.CExtChurchFinancesIncomeOtherImpl
 * @see ucc.portal.model.impl.CExtChurchFinancesIncomeOtherModelImpl
 * @generated
 */
@ImplementationClassName("ucc.portal.model.impl.CExtChurchFinancesIncomeOtherImpl")
@ProviderType
public interface CExtChurchFinancesIncomeOther
	extends CExtChurchFinancesIncomeOtherModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ucc.portal.model.impl.CExtChurchFinancesIncomeOtherImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CExtChurchFinancesIncomeOther, Long> ORGANIZATION_ID_ACCESSOR =
		new Accessor<CExtChurchFinancesIncomeOther, Long>() {
			@Override
			public Long get(
				CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther) {
				return cExtChurchFinancesIncomeOther.getOrganizationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CExtChurchFinancesIncomeOther> getTypeClass() {
				return CExtChurchFinancesIncomeOther.class;
			}
		};

	public static final Accessor<CExtChurchFinancesIncomeOther, Long> CEXT_CHURCH_FINANCES_INCOME_OTHER_ID_ACCESSOR =
		new Accessor<CExtChurchFinancesIncomeOther, Long>() {
			@Override
			public Long get(
				CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther) {
				return cExtChurchFinancesIncomeOther.getCextChurchFinancesIncomeOtherId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CExtChurchFinancesIncomeOther> getTypeClass() {
				return CExtChurchFinancesIncomeOther.class;
			}
		};
}